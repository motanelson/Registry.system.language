// Generated from Registry.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RegistryLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, REG_HEADER=4, PATH=5, STRING_VALUE=6, HEX_VALUE=7, 
		DWORD_VALUE=8, NEWLINE=9, COMMENT=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "REG_HEADER", "PATH", "STRING_VALUE", "HEX_VALUE", 
			"DWORD_VALUE", "HEX_BYTE", "HEX_DIGIT", "NEWLINE", "COMMENT", "WS"
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


	public RegistryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Registry.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\rm\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\6\6.\n\6\r\6\16\6/\3\7\3\7\7\7\64\n\7\f\7\16"+
		"\7\67\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bC\n\b\f\b\16\bF"+
		"\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\6\tP\n\t\r\t\16\tQ\3\n\3\n\3\n\3"+
		"\13\3\13\3\f\5\fZ\n\f\3\f\3\f\3\r\3\r\7\r`\n\r\f\r\16\rc\13\r\3\r\3\r"+
		"\3\16\6\16h\n\16\r\16\16\16i\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\2\25\2\27\13\31\f\33\r\3\2\7\5\2\f\f\17\17]_\5\2\f\f\17"+
		"\17$$\5\2\62;CHch\4\2\f\f\17\17\4\2\13\13\"\"\2q\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5\37\3\2"+
		"\2\2\7!\3\2\2\2\t#\3\2\2\2\13-\3\2\2\2\r\61\3\2\2\2\17:\3\2\2\2\21G\3"+
		"\2\2\2\23S\3\2\2\2\25V\3\2\2\2\27Y\3\2\2\2\31]\3\2\2\2\33g\3\2\2\2\35"+
		"\36\7?\2\2\36\4\3\2\2\2\37 \7]\2\2 \6\3\2\2\2!\"\7_\2\2\"\b\3\2\2\2#$"+
		"\7T\2\2$%\7G\2\2%&\7I\2\2&\'\7G\2\2\'(\7F\2\2()\7K\2\2)*\7V\2\2*+\7\66"+
		"\2\2+\n\3\2\2\2,.\n\2\2\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60"+
		"\f\3\2\2\2\61\65\7$\2\2\62\64\n\3\2\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63"+
		"\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\289\7$\2\29\16\3\2\2\2"+
		":;\7j\2\2;<\7g\2\2<=\7z\2\2=>\7<\2\2>?\3\2\2\2?D\5\23\n\2@A\7.\2\2AC\5"+
		"\23\n\2B@\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\20\3\2\2\2FD\3\2\2\2"+
		"GH\7f\2\2HI\7y\2\2IJ\7q\2\2JK\7t\2\2KL\7f\2\2LM\7<\2\2MO\3\2\2\2NP\5\25"+
		"\13\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\22\3\2\2\2ST\5\25\13\2"+
		"TU\5\25\13\2U\24\3\2\2\2VW\t\4\2\2W\26\3\2\2\2XZ\7\17\2\2YX\3\2\2\2YZ"+
		"\3\2\2\2Z[\3\2\2\2[\\\7\f\2\2\\\30\3\2\2\2]a\7=\2\2^`\n\5\2\2_^\3\2\2"+
		"\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\b\r\2\2e\32\3\2"+
		"\2\2fh\t\6\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\b\16"+
		"\2\2l\34\3\2\2\2\n\2/\65DQYai\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}