// Generated from Registry.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RegistryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, REG_HEADER=4, PATH=5, STRING_VALUE=6, HEX_VALUE=7, 
		DWORD_VALUE=8, NEWLINE=9, COMMENT=10, WS=11;
	public static final int
		RULE_registryFile = 0, RULE_header = 1, RULE_entry = 2, RULE_keyPath = 3, 
		RULE_value = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"registryFile", "header", "entry", "keyPath", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'['", "']'", "'REGEDIT4'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "REG_HEADER", "PATH", "STRING_VALUE", "HEX_VALUE", 
			"DWORD_VALUE", "NEWLINE", "COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Registry.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RegistryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RegistryFileContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public TerminalNode EOF() { return getToken(RegistryParser.EOF, 0); }
		public List<EntryContext> entry() {
			return getRuleContexts(EntryContext.class);
		}
		public EntryContext entry(int i) {
			return getRuleContext(EntryContext.class,i);
		}
		public RegistryFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registryFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegistryListener ) ((RegistryListener)listener).enterRegistryFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegistryListener ) ((RegistryListener)listener).exitRegistryFile(this);
		}
	}

	public final RegistryFileContext registryFile() throws RecognitionException {
		RegistryFileContext _localctx = new RegistryFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_registryFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			header();
			setState(14);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(11);
				entry();
				}
				}
				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(17);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode REG_HEADER() { return getToken(RegistryParser.REG_HEADER, 0); }
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegistryListener ) ((RegistryListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegistryListener ) ((RegistryListener)listener).exitHeader(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(REG_HEADER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntryContext extends ParserRuleContext {
		public KeyPathContext keyPath() {
			return getRuleContext(KeyPathContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(RegistryParser.NEWLINE, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public EntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegistryListener ) ((RegistryListener)listener).enterEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegistryListener ) ((RegistryListener)listener).exitEntry(this);
		}
	}

	public final EntryContext entry() throws RecognitionException {
		EntryContext _localctx = new EntryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			keyPath();
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(22);
				match(T__0);
				setState(23);
				value();
				}
			}

			setState(26);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyPathContext extends ParserRuleContext {
		public TerminalNode PATH() { return getToken(RegistryParser.PATH, 0); }
		public KeyPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegistryListener ) ((RegistryListener)listener).enterKeyPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegistryListener ) ((RegistryListener)listener).exitKeyPath(this);
		}
	}

	public final KeyPathContext keyPath() throws RecognitionException {
		KeyPathContext _localctx = new KeyPathContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_keyPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__1);
			setState(29);
			match(PATH);
			setState(30);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING_VALUE() { return getToken(RegistryParser.STRING_VALUE, 0); }
		public TerminalNode HEX_VALUE() { return getToken(RegistryParser.HEX_VALUE, 0); }
		public TerminalNode DWORD_VALUE() { return getToken(RegistryParser.DWORD_VALUE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegistryListener ) ((RegistryListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegistryListener ) ((RegistryListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_VALUE) | (1L << HEX_VALUE) | (1L << DWORD_VALUE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r%\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\7\2\17\n\2\f\2\16\2\22\13\2\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\4\5\4\33\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\2"+
		"\2\7\2\4\6\b\n\2\3\3\2\b\n\2!\2\f\3\2\2\2\4\25\3\2\2\2\6\27\3\2\2\2\b"+
		"\36\3\2\2\2\n\"\3\2\2\2\f\20\5\4\3\2\r\17\5\6\4\2\16\r\3\2\2\2\17\22\3"+
		"\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21\23\3\2\2\2\22\20\3\2\2\2\23\24\7"+
		"\2\2\3\24\3\3\2\2\2\25\26\7\6\2\2\26\5\3\2\2\2\27\32\5\b\5\2\30\31\7\3"+
		"\2\2\31\33\5\n\6\2\32\30\3\2\2\2\32\33\3\2\2\2\33\34\3\2\2\2\34\35\7\13"+
		"\2\2\35\7\3\2\2\2\36\37\7\4\2\2\37 \7\7\2\2 !\7\5\2\2!\t\3\2\2\2\"#\t"+
		"\2\2\2#\13\3\2\2\2\4\20\32";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}