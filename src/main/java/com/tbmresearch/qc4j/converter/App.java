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

	public static final void main(String[] args) throws IOException {
		List<Token> codeTokens = new ArrayList<Token>();
		List<Token> commentTokens = new ArrayList<Token>();

		Lexer preprocessorLexer = new CSharpLexer(CharStreams.fromFileName(args[0]));
		// Collect all tokens with lexer (CSharpLexer.g4).
		List<? extends Token> tokens = preprocessorLexer.getAllTokens();
		List<Token> directiveTokens = new ArrayList<Token>();
		ListTokenSource directiveTokenSource = new ListTokenSource(directiveTokens);
		CommonTokenStream directiveTokenStream = new CommonTokenStream(directiveTokenSource, CSharpLexer.DIRECTIVE);
		CSharpPreprocessorParser preprocessorParser = new CSharpPreprocessorParser(directiveTokenStream);

		int index = 0;
		boolean compiliedTokens = true;
		while (index < tokens.size()) {
			Token token = tokens.get(index);
			if (token.getType() == CSharpLexer.SHARP) {
				directiveTokens.clear();
				int directiveTokenIndex = index + 1;
				// Collect all preprocessor directive tokens.
				final Token directiveToken = tokens.get(directiveTokenIndex);
				while (directiveTokenIndex < tokens.size() && directiveToken.getType() != CSharpLexer.EOF
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
				CSharpPreprocessorParser.Preprocessor_directiveContext directive = preprocessorParser
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
		ListTokenSource codeTokenSource = new ListTokenSource(tokens);
		CommonTokenStream codeTokenStream = new CommonTokenStream(codeTokenSource);
		CSharpParser csharpParser = new CSharpParser(codeTokenStream);
//		// Parse syntax tree (CSharpParser.g4)
//		Compilation_unitContext compilationUnit = parser.compilation_unit();
//
//		CharStream charStream = CharStreams.fromFileName(args[0]);
//		CSharpLexer csharpLexer = new CSharpLexer(charStream);
//		CSharpParser csharpParser = new CSharpParser(new CommonTokenStream(csharpLexer));

		csharpParser.addErrorListener(new BaseErrorListener() {
			@Override
			public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
					int charPositionInLine, String msg, RecognitionException e) {
				throw new IllegalStateException("failed to parse at line " + line + " due to " + msg, e);
			}
		});

		csharpParser.addParseListener(new QuantConnectConverter());

		csharpParser.compilation_unit();
	}
}
