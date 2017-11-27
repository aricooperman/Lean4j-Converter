package com.tbmresearch.qc4j.converter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.ListTokenSource;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

public class App {

	public static final void main(final String[] args) throws IOException {
		final List<Token> codeTokens = new ArrayList<>();
		final List<Token> commentTokens = new ArrayList<>();

		final Lexer preprocessorLexer = new CSharpLexer(CharStreams.fromFileName(args[0]));
		// Collect all tokens with lexer (CSharpLexer.g4).
		final List<? extends Token> tokens = preprocessorLexer.getAllTokens();
		final List<Token> directiveTokens = new ArrayList<>();
		ListTokenSource directiveTokenSource = new ListTokenSource(directiveTokens);
		CommonTokenStream directiveTokenStream = new CommonTokenStream(directiveTokenSource, CSharpLexer.DIRECTIVE);
		final CSharpPreprocessorParser preprocessorParser = new CSharpPreprocessorParser(directiveTokenStream);
		preprocessorParser.init();

		int index = 0;
		boolean compiliedTokens = true;
		while (index < tokens.size()) {
			final Token token = tokens.get(index);
			if (token.getType() == CSharpLexer.SHARP) {
				directiveTokens.clear();
				int directiveTokenIndex = index + 1;
				// Collect all preprocessor directive tokens.
				final Token directiveToken = tokens.get(directiveTokenIndex);
				while (directiveTokenIndex < tokens.size() && directiveToken.getType() != Recognizer.EOF
						&& directiveToken.getType() != CSharpLexer.DIRECTIVE_NEW_LINE
						&& directiveToken.getType() != CSharpLexer.SHARP) {
					if (directiveToken.getChannel() == CSharpLexer.COMMENTS_CHANNEL)
						commentTokens.add(directiveToken);
					else if (directiveToken.getChannel() != Lexer.HIDDEN)
						directiveTokens.add(directiveToken);
					directiveTokenIndex++;
				}

				directiveTokenSource = new ListTokenSource(directiveTokens);
				directiveTokenStream = new CommonTokenStream(directiveTokenSource, CSharpLexer.DIRECTIVE);
				preprocessorParser.setInputStream(directiveTokenStream);
				preprocessorParser.reset();
				// Parse condition in preprocessor directive (based on
				// CSharpPreprocessorParser.g4 grammar).
				final CSharpPreprocessorParser.Preprocessor_directiveContext directive = preprocessorParser
						.preprocessor_directive();
				// if true than next code is valid and not ignored.
				compiliedTokens = directive.value;
				index = directiveTokenIndex - 1;
			} else if (token.getChannel() == CSharpLexer.COMMENTS_CHANNEL)
				commentTokens.add(token); // Colect comment tokens (if
											// required).
			else if (token.getChannel() != Lexer.HIDDEN && token.getType() != CSharpLexer.DIRECTIVE_NEW_LINE
					&& compiliedTokens)
				codeTokens.add(token); // Collect code tokens.
			index++;
		}

		// At second stage tokens parsed in usual way.
		final ListTokenSource codeTokenSource = new ListTokenSource(tokens);
		final CommonTokenStream codeTokenStream = new CommonTokenStream(codeTokenSource);
		final CSharpParser csharpParser = new CSharpParser(codeTokenStream);
//		// Parse syntax tree (CSharpParser.g4)
//		Compilation_unitContext compilationUnit = parser.compilation_unit();
//
//		CharStream charStream = CharStreams.fromFileName(args[0]);
//		CSharpLexer csharpLexer = new CSharpLexer(charStream);
//		CSharpParser csharpParser = new CSharpParser(new CommonTokenStream(csharpLexer));

		csharpParser.addErrorListener(new BaseErrorListener() {
			@Override
			public void syntaxError(final Recognizer<?, ?> recognizer, final Object offendingSymbol, final int line,
					final int charPositionInLine, final String msg, final RecognitionException e) {
				throw new IllegalStateException("failed to parse at line " + line + " due to " + msg, e);
			}
		});

		csharpParser.addParseListener(new QuantConnectConverter());

		csharpParser.compilation_unit();
	}
}
