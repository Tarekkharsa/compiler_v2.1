// Generated from C:/Users/Bcc/Desktop/compiler_v2-master/src\SQL.g4 by ANTLR 4.7.2
package generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, SCOL=2, DOT=3, OPEN_PAR=4, CLOSE_PAR=5, OPEN_B=6, CLOSE_B=7, AND=8, 
		COMMA=9, ASSIGN=10, STAR=11, PLUS=12, PLUS_PLUS=13, MINUS=14, MINUS_MINUS=15, 
		TILDE=16, PIPE2=17, DIV=18, MOD=19, LT2=20, GT2=21, AMP=22, PIPE=23, LT=24, 
		LT_EQ=25, GT=26, GT_EQ=27, EQ=28, EQ_WITH_PLUS=29, PLUS_WITH_EQ=30, EQ_WITH_MINUS=31, 
		MINUS_WITH_EQ=32, STAR_WITH_EQ=33, DIV_WITH_EQ=34, NOT_EQ1=35, NOT_EQ2=36, 
		OPEN_ARRAY=37, CLOSE_ARRAY=38, QuesM=39, ORM=40, K_ABORT=41, K_ACTION=42, 
		K_ADD=43, K_AFTER=44, K_ALL=45, K_ALTER=46, K_ANALYZE=47, K_AND=48, K_AS=49, 
		K_ASC=50, K_ATTACH=51, K_AUTOINCREMENT=52, K_BEFORE=53, K_BEGIN=54, K_BETWEEN=55, 
		K_BREAK=56, K_BY=57, K_CASCADE=58, K_CASE=59, K_CAST=60, K_CHECK=61, K_COLLATE=62, 
		K_COLUMN=63, K_COMMIT=64, K_CONFLICT=65, K_CONSTRAINT=66, K_CREATE=67, 
		K_CROSS=68, K_CURRENT_DATE=69, K_CURRENT_TIME=70, K_CURRENT_TIMESTAMP=71, 
		K_DATABASE=72, K_DEFAULT=73, K_DEFERRABLE=74, K_DEFERRED=75, K_DELETE=76, 
		K_DESC=77, K_DETACH=78, K_DISTINCT=79, K_DO=80, K_DROP=81, K_EACH=82, 
		K_ELSE=83, K_END=84, K_ENABLE=85, K_ESCAPE=86, K_EXCEPT=87, K_EXCLUSIVE=88, 
		K_EXISTS=89, K_EXPLAIN=90, K_FAIL=91, K_FOR=92, K_FOREIGN=93, K_FROM=94, 
		K_FULL=95, K_FUNCTION=96, K_GLOB=97, K_GROUP=98, K_HAVING=99, K_IF=100, 
		K_IGNORE=101, K_IMMEDIATE=102, K_IN=103, K_INDEX=104, K_INDEXED=105, K_INITIALLY=106, 
		K_INNER=107, K_INSERT=108, K_INSTEAD=109, K_INTERSECT=110, K_INTO=111, 
		K_IS=112, K_ISNULL=113, K_JOIN=114, K_KEY=115, K_LEFT=116, K_LIKE=117, 
		K_LIMIT=118, K_MATCH=119, K_NATURAL=120, K_NEXTVAL=121, K_NO=122, K_NOT=123, 
		K_NOTNULL=124, K_NULL=125, K_OF=126, K_OFFSET=127, K_ON=128, K_ONLY=129, 
		K_OR=130, K_ORDER=131, K_OUTER=132, K_PLAN=133, K_PRAGMA=134, K_PRIMARY=135, 
		K_PRINT=136, K_QUERY=137, K_RAISE=138, K_RECURSIVE=139, K_REFERENCES=140, 
		K_REGEXP=141, K_REINDEX=142, K_RELEASE=143, K_RENAME=144, K_REPLACE=145, 
		K_RESTRICT=146, K_RETURN=147, K_RIGHT=148, K_ROLLBACK=149, K_ROW=150, 
		K_SAVEPOINT=151, K_SELECT=152, K_SET=153, K_SWITCH=154, K_TABLE=155, K_TEMP=156, 
		K_TEMPORARY=157, K_THEN=158, K_TO=159, K_TRANSACTION=160, K_TRIGGER=161, 
		K_UNION=162, K_UNIQUE=163, K_UPDATE=164, K_USING=165, K_VACUUM=166, K_VALUES=167, 
		K_VIEW=168, K_VIRTUAL=169, K_WHEN=170, K_WHERE=171, K_WHILE=172, K_WITH=173, 
		K_WITHOUT=174, K_VAR=175, K_TYPE=176, IDENTIFIER=177, IDENTIFIER_JSON_ARRAY=178, 
		NUMERIC_LITERAL=179, BIND_PARAMETER=180, STRING_LITERAL=181, BLOB_LITERAL=182, 
		SINGLE_LINE_COMMENT=183, MULTILINE_COMMENT=184, SPACES=185, UNEXPECTED_CHAR=186;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_sql_stmt = 3, 
		RULE_def_all = 4, RULE_def_function = 5, RULE_body = 6, RULE_var_get_func = 7, 
		RULE_var_init = 8, RULE_var_operator = 9, RULE_def_print_stmt = 10, RULE_print_body = 11, 
		RULE_if_stmt = 12, RULE_else_if_stmt = 13, RULE_else_stmt = 14, RULE_inline_condition_stmt = 15, 
		RULE_while_stmt = 16, RULE_do_while_stmt = 17, RULE_while_do_stmt = 18, 
		RULE_for_stmt = 19, RULE_for_rule = 20, RULE_foreach_rule = 21, RULE_return_stmt = 22, 
		RULE_array_stmt = 23, RULE_switch_stmt = 24, RULE_higher_order_stmt = 25, 
		RULE_func_argument_list = 26, RULE_def_function_default_value = 27, RULE_json_stmt = 28, 
		RULE_json_attribute = 29, RULE_json_obj = 30, RULE_json_array = 31, RULE_call_json = 32, 
		RULE_edit_json = 33, RULE_alter_table_stmt = 34, RULE_alter_table_add_constraint = 35, 
		RULE_alter_table_add = 36, RULE_create_table_stmt = 37, RULE_create_type_stmt = 38, 
		RULE_delete_stmt = 39, RULE_drop_table_stmt = 40, RULE_factored_select_stmt = 41, 
		RULE_insert_stmt = 42, RULE_select_stmt = 43, RULE_select_or_values = 44, 
		RULE_update_stmt = 45, RULE_column_def = 46, RULE_type_name = 47, RULE_column_constraint = 48, 
		RULE_column_constraint_primary_key = 49, RULE_column_constraint_foreign_key = 50, 
		RULE_column_constraint_not_null = 51, RULE_column_constraint_null = 52, 
		RULE_column_default = 53, RULE_column_default_value = 54, RULE_expr = 55, 
		RULE_expr_while = 56, RULE_expr_if = 57, RULE_expr_for_and_operator = 58, 
		RULE_expr_print = 59, RULE_foreign_key_clause = 60, RULE_fk_target_column_name = 61, 
		RULE_indexed_column = 62, RULE_table_constraint = 63, RULE_table_constraint_primary_key = 64, 
		RULE_table_constraint_foreign_key = 65, RULE_table_constraint_unique = 66, 
		RULE_table_constraint_key = 67, RULE_fk_origin_column_name = 68, RULE_qualified_table_name = 69, 
		RULE_ordering_term = 70, RULE_pragma_value = 71, RULE_common_table_expression = 72, 
		RULE_result_column = 73, RULE_table_or_subquery = 74, RULE_join_clause = 75, 
		RULE_join_operator = 76, RULE_join_constraint = 77, RULE_select_core = 78, 
		RULE_cte_table_name = 79, RULE_signed_number = 80, RULE_literal_value = 81, 
		RULE_unary_operator = 82, RULE_error_message = 83, RULE_module_argument = 84, 
		RULE_column_alias = 85, RULE_keyword = 86, RULE_unknown = 87, RULE_name = 88, 
		RULE_function_name = 89, RULE_database_name = 90, RULE_source_table_name = 91, 
		RULE_table_name = 92, RULE_table_or_index_name = 93, RULE_new_table_name = 94, 
		RULE_column_name = 95, RULE_collation_name = 96, RULE_foreign_table = 97, 
		RULE_index_name = 98, RULE_trigger_name = 99, RULE_view_name = 100, RULE_module_name = 101, 
		RULE_pragma_name = 102, RULE_savepoint_name = 103, RULE_table_alias = 104, 
		RULE_transaction_name = 105, RULE_any_name = 106, RULE_any_name_identifier_json = 107;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "error", "sql_stmt_list", "sql_stmt", "def_all", "def_function", 
			"body", "var_get_func", "var_init", "var_operator", "def_print_stmt", 
			"print_body", "if_stmt", "else_if_stmt", "else_stmt", "inline_condition_stmt", 
			"while_stmt", "do_while_stmt", "while_do_stmt", "for_stmt", "for_rule", 
			"foreach_rule", "return_stmt", "array_stmt", "switch_stmt", "higher_order_stmt", 
			"func_argument_list", "def_function_default_value", "json_stmt", "json_attribute", 
			"json_obj", "json_array", "call_json", "edit_json", "alter_table_stmt", 
			"alter_table_add_constraint", "alter_table_add", "create_table_stmt", 
			"create_type_stmt", "delete_stmt", "drop_table_stmt", "factored_select_stmt", 
			"insert_stmt", "select_stmt", "select_or_values", "update_stmt", "column_def", 
			"type_name", "column_constraint", "column_constraint_primary_key", "column_constraint_foreign_key", 
			"column_constraint_not_null", "column_constraint_null", "column_default", 
			"column_default_value", "expr", "expr_while", "expr_if", "expr_for_and_operator", 
			"expr_print", "foreign_key_clause", "fk_target_column_name", "indexed_column", 
			"table_constraint", "table_constraint_primary_key", "table_constraint_foreign_key", 
			"table_constraint_unique", "table_constraint_key", "fk_origin_column_name", 
			"qualified_table_name", "ordering_term", "pragma_value", "common_table_expression", 
			"result_column", "table_or_subquery", "join_clause", "join_operator", 
			"join_constraint", "select_core", "cte_table_name", "signed_number", 
			"literal_value", "unary_operator", "error_message", "module_argument", 
			"column_alias", "keyword", "unknown", "name", "function_name", "database_name", 
			"source_table_name", "table_name", "table_or_index_name", "new_table_name", 
			"column_name", "collation_name", "foreign_table", "index_name", "trigger_name", 
			"view_name", "module_name", "pragma_name", "savepoint_name", "table_alias", 
			"transaction_name", "any_name", "any_name_identifier_json"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'::'", "';'", "'.'", "'('", "')'", "'{'", "'}'", "'&&'", "','", 
			"'='", "'*'", "'+'", "'++'", "'-'", "'--'", "'~'", "'||'", "'/'", "'%'", 
			"'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", "'>='", "'=='", "'=+'", 
			"'+='", "'=-'", "'-='", "'*='", "'/='", "'!='", "'<>'", "'['", "']'", 
			"'?'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "OPEN_B", "CLOSE_B", 
			"AND", "COMMA", "ASSIGN", "STAR", "PLUS", "PLUS_PLUS", "MINUS", "MINUS_MINUS", 
			"TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", "AMP", "PIPE", "LT", "LT_EQ", 
			"GT", "GT_EQ", "EQ", "EQ_WITH_PLUS", "PLUS_WITH_EQ", "EQ_WITH_MINUS", 
			"MINUS_WITH_EQ", "STAR_WITH_EQ", "DIV_WITH_EQ", "NOT_EQ1", "NOT_EQ2", 
			"OPEN_ARRAY", "CLOSE_ARRAY", "QuesM", "ORM", "K_ABORT", "K_ACTION", "K_ADD", 
			"K_AFTER", "K_ALL", "K_ALTER", "K_ANALYZE", "K_AND", "K_AS", "K_ASC", 
			"K_ATTACH", "K_AUTOINCREMENT", "K_BEFORE", "K_BEGIN", "K_BETWEEN", "K_BREAK", 
			"K_BY", "K_CASCADE", "K_CASE", "K_CAST", "K_CHECK", "K_COLLATE", "K_COLUMN", 
			"K_COMMIT", "K_CONFLICT", "K_CONSTRAINT", "K_CREATE", "K_CROSS", "K_CURRENT_DATE", 
			"K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", "K_DATABASE", "K_DEFAULT", "K_DEFERRABLE", 
			"K_DEFERRED", "K_DELETE", "K_DESC", "K_DETACH", "K_DISTINCT", "K_DO", 
			"K_DROP", "K_EACH", "K_ELSE", "K_END", "K_ENABLE", "K_ESCAPE", "K_EXCEPT", 
			"K_EXCLUSIVE", "K_EXISTS", "K_EXPLAIN", "K_FAIL", "K_FOR", "K_FOREIGN", 
			"K_FROM", "K_FULL", "K_FUNCTION", "K_GLOB", "K_GROUP", "K_HAVING", "K_IF", 
			"K_IGNORE", "K_IMMEDIATE", "K_IN", "K_INDEX", "K_INDEXED", "K_INITIALLY", 
			"K_INNER", "K_INSERT", "K_INSTEAD", "K_INTERSECT", "K_INTO", "K_IS", 
			"K_ISNULL", "K_JOIN", "K_KEY", "K_LEFT", "K_LIKE", "K_LIMIT", "K_MATCH", 
			"K_NATURAL", "K_NEXTVAL", "K_NO", "K_NOT", "K_NOTNULL", "K_NULL", "K_OF", 
			"K_OFFSET", "K_ON", "K_ONLY", "K_OR", "K_ORDER", "K_OUTER", "K_PLAN", 
			"K_PRAGMA", "K_PRIMARY", "K_PRINT", "K_QUERY", "K_RAISE", "K_RECURSIVE", 
			"K_REFERENCES", "K_REGEXP", "K_REINDEX", "K_RELEASE", "K_RENAME", "K_REPLACE", 
			"K_RESTRICT", "K_RETURN", "K_RIGHT", "K_ROLLBACK", "K_ROW", "K_SAVEPOINT", 
			"K_SELECT", "K_SET", "K_SWITCH", "K_TABLE", "K_TEMP", "K_TEMPORARY", 
			"K_THEN", "K_TO", "K_TRANSACTION", "K_TRIGGER", "K_UNION", "K_UNIQUE", 
			"K_UPDATE", "K_USING", "K_VACUUM", "K_VALUES", "K_VIEW", "K_VIRTUAL", 
			"K_WHEN", "K_WHERE", "K_WHILE", "K_WITH", "K_WITHOUT", "K_VAR", "K_TYPE", 
			"IDENTIFIER", "IDENTIFIER_JSON_ARRAY", "NUMERIC_LITERAL", "BIND_PARAMETER", 
			"STRING_LITERAL", "BLOB_LITERAL", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", 
			"SPACES", "UNEXPECTED_CHAR"
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
	public String getGrammarFileName() { return "SQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SQLParser.EOF, 0); }
		public List<Def_allContext> def_all() {
			return getRuleContexts(Def_allContext.class);
		}
		public Def_allContext def_all(int i) {
			return getRuleContext(Def_allContext.class,i);
		}
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCOL) | (1L << OPEN_PAR) | (1L << K_ALTER))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (K_CREATE - 67)) | (1L << (K_DELETE - 67)) | (1L << (K_DROP - 67)) | (1L << (K_EXPLAIN - 67)) | (1L << (K_FUNCTION - 67)) | (1L << (K_INSERT - 67)))) != 0) || ((((_la - 152)) & ~0x3f) == 0 && ((1L << (_la - 152)) & ((1L << (K_SELECT - 152)) | (1L << (K_UPDATE - 152)) | (1L << (K_VALUES - 152)) | (1L << (K_VAR - 152)) | (1L << (IDENTIFIER - 152)) | (1L << (STRING_LITERAL - 152)) | (1L << (UNEXPECTED_CHAR - 152)))) != 0)) {
				{
				setState(219);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case K_FUNCTION:
				case K_VAR:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					setState(216);
					def_all();
					}
					break;
				case SCOL:
				case K_ALTER:
				case K_CREATE:
				case K_DELETE:
				case K_DROP:
				case K_EXPLAIN:
				case K_INSERT:
				case K_SELECT:
				case K_UPDATE:
				case K_VALUES:
					{
					setState(217);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(218);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(224);
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

	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(SQLParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);

			     throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null));
			   
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

	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSql_stmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSql_stmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(229);
				match(SCOL);
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235);
			sql_stmt();
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(237); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(236);
						match(SCOL);
						}
						}
						setState(239); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(241);
					sql_stmt();
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(247);
					match(SCOL);
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class Sql_stmtContext extends ParserRuleContext {
		public Alter_table_stmtContext alter_table_stmt() {
			return getRuleContext(Alter_table_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Create_type_stmtContext create_type_stmt() {
			return getRuleContext(Create_type_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Drop_table_stmtContext drop_table_stmt() {
			return getRuleContext(Drop_table_stmtContext.class,0);
		}
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public TerminalNode K_EXPLAIN() { return getToken(SQLParser.K_EXPLAIN, 0); }
		public TerminalNode K_QUERY() { return getToken(SQLParser.K_QUERY, 0); }
		public TerminalNode K_PLAN() { return getToken(SQLParser.K_PLAN, 0); }
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_EXPLAIN) {
				{
				setState(253);
				match(K_EXPLAIN);
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_QUERY) {
					{
					setState(254);
					match(K_QUERY);
					setState(255);
					match(K_PLAN);
					}
				}

				}
			}

			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(260);
				alter_table_stmt();
				}
				break;
			case 2:
				{
				setState(261);
				create_table_stmt();
				}
				break;
			case 3:
				{
				setState(262);
				create_type_stmt();
				}
				break;
			case 4:
				{
				setState(263);
				delete_stmt();
				}
				break;
			case 5:
				{
				setState(264);
				drop_table_stmt();
				}
				break;
			case 6:
				{
				setState(265);
				factored_select_stmt();
				}
				break;
			case 7:
				{
				setState(266);
				insert_stmt();
				}
				break;
			case 8:
				{
				setState(267);
				update_stmt();
				}
				break;
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

	public static class Def_allContext extends ParserRuleContext {
		public Def_functionContext def_function() {
			return getRuleContext(Def_functionContext.class,0);
		}
		public Def_function_default_valueContext def_function_default_value() {
			return getRuleContext(Def_function_default_valueContext.class,0);
		}
		public Higher_order_stmtContext higher_order_stmt() {
			return getRuleContext(Higher_order_stmtContext.class,0);
		}
		public Var_get_funcContext var_get_func() {
			return getRuleContext(Var_get_funcContext.class,0);
		}
		public Func_argument_listContext func_argument_list() {
			return getRuleContext(Func_argument_listContext.class,0);
		}
		public Json_stmtContext json_stmt() {
			return getRuleContext(Json_stmtContext.class,0);
		}
		public Def_allContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_all; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDef_all(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDef_all(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDef_all(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_allContext def_all() throws RecognitionException {
		Def_allContext _localctx = new Def_allContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_def_all);
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				def_function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				def_function_default_value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				higher_order_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(273);
				var_get_func();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(274);
				func_argument_list();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(275);
				json_stmt();
				}
				break;
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

	public static class Def_functionContext extends ParserRuleContext {
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode OPEN_B() { return getToken(SQLParser.OPEN_B, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode CLOSE_B() { return getToken(SQLParser.CLOSE_B, 0); }
		public List<TerminalNode> K_VAR() { return getTokens(SQLParser.K_VAR); }
		public TerminalNode K_VAR(int i) {
			return getToken(SQLParser.K_VAR, i);
		}
		public TerminalNode K_FUNCTION() { return getToken(SQLParser.K_FUNCTION, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Def_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDef_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDef_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDef_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_functionContext def_function() throws RecognitionException {
		Def_functionContext _localctx = new Def_functionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_def_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(278);
				match(K_VAR);
				}
			}

			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FUNCTION) {
				{
				setState(281);
				match(K_FUNCTION);
				}
			}

			setState(284);
			any_name();
			setState(285);
			match(OPEN_PAR);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(286);
				match(K_VAR);
				setState(287);
				any_name();
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(288);
					match(COMMA);
					setState(289);
					match(K_VAR);
					setState(290);
					any_name();
					}
					}
					setState(295);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(298);
			match(CLOSE_PAR);
			setState(299);
			match(OPEN_B);
			setState(300);
			body();
			setState(301);
			match(CLOSE_B);
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

	public static class BodyContext extends ParserRuleContext {
		public List<Var_initContext> var_init() {
			return getRuleContexts(Var_initContext.class);
		}
		public Var_initContext var_init(int i) {
			return getRuleContext(Var_initContext.class,i);
		}
		public List<Def_print_stmtContext> def_print_stmt() {
			return getRuleContexts(Def_print_stmtContext.class);
		}
		public Def_print_stmtContext def_print_stmt(int i) {
			return getRuleContext(Def_print_stmtContext.class,i);
		}
		public List<If_stmtContext> if_stmt() {
			return getRuleContexts(If_stmtContext.class);
		}
		public If_stmtContext if_stmt(int i) {
			return getRuleContext(If_stmtContext.class,i);
		}
		public List<While_stmtContext> while_stmt() {
			return getRuleContexts(While_stmtContext.class);
		}
		public While_stmtContext while_stmt(int i) {
			return getRuleContext(While_stmtContext.class,i);
		}
		public List<Do_while_stmtContext> do_while_stmt() {
			return getRuleContexts(Do_while_stmtContext.class);
		}
		public Do_while_stmtContext do_while_stmt(int i) {
			return getRuleContext(Do_while_stmtContext.class,i);
		}
		public List<For_stmtContext> for_stmt() {
			return getRuleContexts(For_stmtContext.class);
		}
		public For_stmtContext for_stmt(int i) {
			return getRuleContext(For_stmtContext.class,i);
		}
		public List<Array_stmtContext> array_stmt() {
			return getRuleContexts(Array_stmtContext.class);
		}
		public Array_stmtContext array_stmt(int i) {
			return getRuleContext(Array_stmtContext.class,i);
		}
		public List<Switch_stmtContext> switch_stmt() {
			return getRuleContexts(Switch_stmtContext.class);
		}
		public Switch_stmtContext switch_stmt(int i) {
			return getRuleContext(Switch_stmtContext.class,i);
		}
		public List<Inline_condition_stmtContext> inline_condition_stmt() {
			return getRuleContexts(Inline_condition_stmtContext.class);
		}
		public Inline_condition_stmtContext inline_condition_stmt(int i) {
			return getRuleContext(Inline_condition_stmtContext.class,i);
		}
		public List<Json_stmtContext> json_stmt() {
			return getRuleContexts(Json_stmtContext.class);
		}
		public Json_stmtContext json_stmt(int i) {
			return getRuleContext(Json_stmtContext.class,i);
		}
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public List<Var_get_funcContext> var_get_func() {
			return getRuleContexts(Var_get_funcContext.class);
		}
		public Var_get_funcContext var_get_func(int i) {
			return getRuleContext(Var_get_funcContext.class,i);
		}
		public List<Func_argument_listContext> func_argument_list() {
			return getRuleContexts(Func_argument_listContext.class);
		}
		public Func_argument_listContext func_argument_list(int i) {
			return getRuleContext(Func_argument_listContext.class,i);
		}
		public List<Call_jsonContext> call_json() {
			return getRuleContexts(Call_jsonContext.class);
		}
		public Call_jsonContext call_json(int i) {
			return getRuleContext(Call_jsonContext.class,i);
		}
		public List<Edit_jsonContext> edit_json() {
			return getRuleContexts(Edit_jsonContext.class);
		}
		public Edit_jsonContext edit_json(int i) {
			return getRuleContext(Edit_jsonContext.class,i);
		}
		public List<Var_operatorContext> var_operator() {
			return getRuleContexts(Var_operatorContext.class);
		}
		public Var_operatorContext var_operator(int i) {
			return getRuleContext(Var_operatorContext.class,i);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(324);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(303);
						var_init();
						}
						break;
					case 2:
						{
						setState(304);
						def_print_stmt();
						}
						break;
					case 3:
						{
						setState(305);
						if_stmt();
						}
						break;
					case 4:
						{
						setState(306);
						while_stmt();
						}
						break;
					case 5:
						{
						setState(307);
						do_while_stmt();
						}
						break;
					case 6:
						{
						setState(308);
						for_stmt();
						}
						break;
					case 7:
						{
						setState(309);
						array_stmt();
						}
						break;
					case 8:
						{
						setState(310);
						switch_stmt();
						}
						break;
					case 9:
						{
						setState(311);
						inline_condition_stmt();
						}
						break;
					case 10:
						{
						setState(312);
						json_stmt();
						setState(314);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
						case 1:
							{
							setState(313);
							match(SCOL);
							}
							break;
						}
						}
						break;
					case 11:
						{
						setState(316);
						sql_stmt_list();
						setState(317);
						match(SCOL);
						}
						break;
					case 12:
						{
						setState(319);
						var_get_func();
						}
						break;
					case 13:
						{
						setState(320);
						func_argument_list();
						}
						break;
					case 14:
						{
						setState(321);
						call_json();
						}
						break;
					case 15:
						{
						setState(322);
						edit_json();
						}
						break;
					case 16:
						{
						setState(323);
						var_operator();
						}
						break;
					}
					} 
				}
				setState(328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(329);
				return_stmt();
				}
				break;
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

	public static class Var_get_funcContext extends ParserRuleContext {
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public TerminalNode K_FUNCTION() { return getToken(SQLParser.K_FUNCTION, 0); }
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Var_get_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_get_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterVar_get_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitVar_get_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitVar_get_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_get_funcContext var_get_func() throws RecognitionException {
		Var_get_funcContext _localctx = new Var_get_funcContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_get_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(K_VAR);
			setState(333);
			match(IDENTIFIER);
			setState(334);
			match(ASSIGN);
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_FUNCTION:
				{
				setState(335);
				match(K_FUNCTION);
				}
				break;
			case OPEN_PAR:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(336);
				any_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(339);
			match(OPEN_PAR);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
				{
				setState(340);
				any_name();
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(341);
					match(COMMA);
					setState(342);
					any_name();
					}
					}
					setState(347);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(350);
			match(CLOSE_PAR);
			setState(351);
			match(SCOL);
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

	public static class Var_initContext extends ParserRuleContext {
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public Var_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterVar_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitVar_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitVar_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_initContext var_init() throws RecognitionException {
		Var_initContext _localctx = new Var_initContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_var_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(K_VAR);
			setState(354);
			any_name();
			setState(355);
			match(ASSIGN);
			setState(356);
			expr(0);
			setState(357);
			match(SCOL);
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

	public static class Var_operatorContext extends ParserRuleContext {
		public Expr_for_and_operatorContext expr_for_and_operator() {
			return getRuleContext(Expr_for_and_operatorContext.class,0);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public Var_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterVar_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitVar_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitVar_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_operatorContext var_operator() throws RecognitionException {
		Var_operatorContext _localctx = new Var_operatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_var_operator);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			expr_for_and_operator(0);
			setState(363);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(360);
					match(SCOL);
					}
					} 
				}
				setState(365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class Def_print_stmtContext extends ParserRuleContext {
		public TerminalNode K_PRINT() { return getToken(SQLParser.K_PRINT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public Print_bodyContext print_body() {
			return getRuleContext(Print_bodyContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public Def_print_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_print_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDef_print_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDef_print_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDef_print_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_print_stmtContext def_print_stmt() throws RecognitionException {
		Def_print_stmtContext _localctx = new Def_print_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_def_print_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(366);
				match(K_VAR);
				}
			}

			setState(369);
			match(K_PRINT);
			setState(370);
			match(OPEN_PAR);
			setState(371);
			print_body();
			setState(372);
			match(CLOSE_PAR);
			setState(373);
			match(SCOL);
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

	public static class Print_bodyContext extends ParserRuleContext {
		public List<Call_jsonContext> call_json() {
			return getRuleContexts(Call_jsonContext.class);
		}
		public Call_jsonContext call_json(int i) {
			return getRuleContext(Call_jsonContext.class,i);
		}
		public List<Expr_printContext> expr_print() {
			return getRuleContexts(Expr_printContext.class);
		}
		public Expr_printContext expr_print(int i) {
			return getRuleContext(Expr_printContext.class,i);
		}
		public Print_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterPrint_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitPrint_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitPrint_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_bodyContext print_body() throws RecognitionException {
		Print_bodyContext _localctx = new Print_bodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_print_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << OPEN_ARRAY))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (K_CURRENT_DATE - 69)) | (1L << (K_CURRENT_TIME - 69)) | (1L << (K_CURRENT_TIMESTAMP - 69)) | (1L << (K_EXISTS - 69)) | (1L << (K_NOT - 69)) | (1L << (K_NULL - 69)))) != 0) || ((((_la - 177)) & ~0x3f) == 0 && ((1L << (_la - 177)) & ((1L << (IDENTIFIER - 177)) | (1L << (NUMERIC_LITERAL - 177)) | (1L << (STRING_LITERAL - 177)) | (1L << (BLOB_LITERAL - 177)))) != 0)) {
				{
				setState(377);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(375);
					call_json();
					}
					break;
				case 2:
					{
					setState(376);
					expr_print(0);
					}
					break;
				}
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public Expr_ifContext expr_if() {
			return getRuleContext(Expr_ifContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode OPEN_B() { return getToken(SQLParser.OPEN_B, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode CLOSE_B() { return getToken(SQLParser.CLOSE_B, 0); }
		public List<Else_if_stmtContext> else_if_stmt() {
			return getRuleContexts(Else_if_stmtContext.class);
		}
		public Else_if_stmtContext else_if_stmt(int i) {
			return getRuleContext(Else_if_stmtContext.class,i);
		}
		public Else_stmtContext else_stmt() {
			return getRuleContext(Else_stmtContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(K_IF);
			setState(383);
			match(OPEN_PAR);
			setState(384);
			expr_if(0);
			setState(385);
			match(CLOSE_PAR);
			setState(391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_B:
				{
				setState(386);
				match(OPEN_B);
				setState(387);
				body();
				setState(388);
				match(CLOSE_B);
				}
				break;
			case SCOL:
			case OPEN_PAR:
			case CLOSE_B:
			case PLUS_PLUS:
			case MINUS_MINUS:
			case OPEN_ARRAY:
			case K_ALTER:
			case K_BREAK:
			case K_CASE:
			case K_CAST:
			case K_CREATE:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DEFAULT:
			case K_DELETE:
			case K_DO:
			case K_DROP:
			case K_ELSE:
			case K_EXPLAIN:
			case K_FOR:
			case K_FUNCTION:
			case K_IF:
			case K_INSERT:
			case K_NULL:
			case K_PRINT:
			case K_RETURN:
			case K_SELECT:
			case K_SWITCH:
			case K_UPDATE:
			case K_VALUES:
			case K_WHILE:
			case K_VAR:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
			case BLOB_LITERAL:
				{
				setState(390);
				body();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(396);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(393);
					else_if_stmt();
					}
					} 
				}
				setState(398);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(399);
				else_stmt();
				}
				break;
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

	public static class Else_if_stmtContext extends ParserRuleContext {
		public TerminalNode K_ELSE() { return getToken(SQLParser.K_ELSE, 0); }
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public Expr_ifContext expr_if() {
			return getRuleContext(Expr_ifContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode OPEN_B() { return getToken(SQLParser.OPEN_B, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode CLOSE_B() { return getToken(SQLParser.CLOSE_B, 0); }
		public Else_if_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterElse_if_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitElse_if_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitElse_if_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_if_stmtContext else_if_stmt() throws RecognitionException {
		Else_if_stmtContext _localctx = new Else_if_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_else_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(K_ELSE);
			setState(403);
			match(K_IF);
			setState(404);
			match(OPEN_PAR);
			setState(405);
			expr_if(0);
			setState(406);
			match(CLOSE_PAR);
			setState(412);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_B:
				{
				setState(407);
				match(OPEN_B);
				setState(408);
				body();
				setState(409);
				match(CLOSE_B);
				}
				break;
			case SCOL:
			case OPEN_PAR:
			case CLOSE_B:
			case PLUS_PLUS:
			case MINUS_MINUS:
			case OPEN_ARRAY:
			case K_ALTER:
			case K_BREAK:
			case K_CASE:
			case K_CAST:
			case K_CREATE:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DEFAULT:
			case K_DELETE:
			case K_DO:
			case K_DROP:
			case K_ELSE:
			case K_EXPLAIN:
			case K_FOR:
			case K_FUNCTION:
			case K_IF:
			case K_INSERT:
			case K_NULL:
			case K_PRINT:
			case K_RETURN:
			case K_SELECT:
			case K_SWITCH:
			case K_UPDATE:
			case K_VALUES:
			case K_WHILE:
			case K_VAR:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
			case BLOB_LITERAL:
				{
				setState(411);
				body();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Else_stmtContext extends ParserRuleContext {
		public TerminalNode K_ELSE() { return getToken(SQLParser.K_ELSE, 0); }
		public TerminalNode OPEN_B() { return getToken(SQLParser.OPEN_B, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode CLOSE_B() { return getToken(SQLParser.CLOSE_B, 0); }
		public Else_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterElse_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitElse_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitElse_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_stmtContext else_stmt() throws RecognitionException {
		Else_stmtContext _localctx = new Else_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_else_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(K_ELSE);
			setState(420);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_B:
				{
				setState(415);
				match(OPEN_B);
				setState(416);
				body();
				setState(417);
				match(CLOSE_B);
				}
				break;
			case SCOL:
			case OPEN_PAR:
			case CLOSE_B:
			case PLUS_PLUS:
			case MINUS_MINUS:
			case OPEN_ARRAY:
			case K_ALTER:
			case K_BREAK:
			case K_CASE:
			case K_CAST:
			case K_CREATE:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DEFAULT:
			case K_DELETE:
			case K_DO:
			case K_DROP:
			case K_ELSE:
			case K_EXPLAIN:
			case K_FOR:
			case K_FUNCTION:
			case K_IF:
			case K_INSERT:
			case K_NULL:
			case K_PRINT:
			case K_RETURN:
			case K_SELECT:
			case K_SWITCH:
			case K_UPDATE:
			case K_VALUES:
			case K_WHILE:
			case K_VAR:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
			case BLOB_LITERAL:
				{
				setState(419);
				body();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Inline_condition_stmtContext extends ParserRuleContext {
		public Expr_ifContext expr_if() {
			return getRuleContext(Expr_ifContext.class,0);
		}
		public TerminalNode QuesM() { return getToken(SQLParser.QuesM, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ORM() { return getToken(SQLParser.ORM, 0); }
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public List<Inline_condition_stmtContext> inline_condition_stmt() {
			return getRuleContexts(Inline_condition_stmtContext.class);
		}
		public Inline_condition_stmtContext inline_condition_stmt(int i) {
			return getRuleContext(Inline_condition_stmtContext.class,i);
		}
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
		}
		public Inline_condition_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inline_condition_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterInline_condition_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitInline_condition_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitInline_condition_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inline_condition_stmtContext inline_condition_stmt() throws RecognitionException {
		Inline_condition_stmtContext _localctx = new Inline_condition_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_inline_condition_stmt);
		int _la;
		try {
			int _alt;
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				expr_if(0);
				setState(423);
				match(QuesM);
				setState(424);
				expr(0);
				setState(425);
				match(ORM);
				setState(426);
				expr(0);
				setState(430);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(427);
						match(SCOL);
						}
						} 
					}
					setState(432);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				expr_if(0);
				setState(434);
				match(QuesM);
				setState(438);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(435);
						match(OPEN_PAR);
						}
						} 
					}
					setState(440);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				setState(441);
				inline_condition_stmt();
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CLOSE_PAR) {
					{
					{
					setState(442);
					match(CLOSE_PAR);
					}
					}
					setState(447);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(448);
				match(ORM);
				setState(452);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(449);
						match(OPEN_PAR);
						}
						} 
					}
					setState(454);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(455);
				inline_condition_stmt();
				setState(459);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(456);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(461);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(465);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(462);
						match(SCOL);
						}
						} 
					}
					setState(467);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				}
				break;
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

	public static class While_stmtContext extends ParserRuleContext {
		public TerminalNode K_WHILE() { return getToken(SQLParser.K_WHILE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public Expr_whileContext expr_while() {
			return getRuleContext(Expr_whileContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode OPEN_B() { return getToken(SQLParser.OPEN_B, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode CLOSE_B() { return getToken(SQLParser.CLOSE_B, 0); }
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(K_WHILE);
			setState(471);
			match(OPEN_PAR);
			setState(472);
			expr_while(0);
			setState(473);
			match(CLOSE_PAR);
			setState(479);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_B:
				{
				setState(474);
				match(OPEN_B);
				setState(475);
				body();
				setState(476);
				match(CLOSE_B);
				}
				break;
			case SCOL:
			case OPEN_PAR:
			case CLOSE_B:
			case PLUS_PLUS:
			case MINUS_MINUS:
			case OPEN_ARRAY:
			case K_ALTER:
			case K_BREAK:
			case K_CASE:
			case K_CAST:
			case K_CREATE:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DEFAULT:
			case K_DELETE:
			case K_DO:
			case K_DROP:
			case K_ELSE:
			case K_EXPLAIN:
			case K_FOR:
			case K_FUNCTION:
			case K_IF:
			case K_INSERT:
			case K_NULL:
			case K_PRINT:
			case K_RETURN:
			case K_SELECT:
			case K_SWITCH:
			case K_UPDATE:
			case K_VALUES:
			case K_WHILE:
			case K_VAR:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
			case BLOB_LITERAL:
				{
				setState(478);
				body();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Do_while_stmtContext extends ParserRuleContext {
		public TerminalNode K_DO() { return getToken(SQLParser.K_DO, 0); }
		public TerminalNode OPEN_B() { return getToken(SQLParser.OPEN_B, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode CLOSE_B() { return getToken(SQLParser.CLOSE_B, 0); }
		public While_do_stmtContext while_do_stmt() {
			return getRuleContext(While_do_stmtContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public Do_while_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDo_while_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDo_while_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDo_while_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_stmtContext do_while_stmt() throws RecognitionException {
		Do_while_stmtContext _localctx = new Do_while_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_do_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(K_DO);
			setState(482);
			match(OPEN_B);
			setState(483);
			body();
			setState(484);
			match(CLOSE_B);
			setState(485);
			while_do_stmt();
			setState(486);
			match(SCOL);
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

	public static class While_do_stmtContext extends ParserRuleContext {
		public TerminalNode K_WHILE() { return getToken(SQLParser.K_WHILE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public Expr_whileContext expr_while() {
			return getRuleContext(Expr_whileContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public While_do_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_do_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterWhile_do_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitWhile_do_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitWhile_do_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_do_stmtContext while_do_stmt() throws RecognitionException {
		While_do_stmtContext _localctx = new While_do_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_while_do_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(K_WHILE);
			setState(489);
			match(OPEN_PAR);
			setState(490);
			expr_while(0);
			setState(491);
			match(CLOSE_PAR);
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

	public static class For_stmtContext extends ParserRuleContext {
		public TerminalNode K_FOR() { return getToken(SQLParser.K_FOR, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public For_ruleContext for_rule() {
			return getRuleContext(For_ruleContext.class,0);
		}
		public Foreach_ruleContext foreach_rule() {
			return getRuleContext(Foreach_ruleContext.class,0);
		}
		public TerminalNode OPEN_B() { return getToken(SQLParser.OPEN_B, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode CLOSE_B() { return getToken(SQLParser.CLOSE_B, 0); }
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFor_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(K_FOR);
			setState(494);
			match(OPEN_PAR);
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(495);
				for_rule();
				}
				break;
			case 2:
				{
				setState(496);
				foreach_rule();
				}
				break;
			}
			setState(499);
			match(CLOSE_PAR);
			setState(505);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_B:
				{
				setState(500);
				match(OPEN_B);
				setState(501);
				body();
				setState(502);
				match(CLOSE_B);
				}
				break;
			case SCOL:
			case OPEN_PAR:
			case CLOSE_B:
			case PLUS_PLUS:
			case MINUS_MINUS:
			case OPEN_ARRAY:
			case K_ALTER:
			case K_BREAK:
			case K_CASE:
			case K_CAST:
			case K_CREATE:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DEFAULT:
			case K_DELETE:
			case K_DO:
			case K_DROP:
			case K_ELSE:
			case K_EXPLAIN:
			case K_FOR:
			case K_FUNCTION:
			case K_IF:
			case K_INSERT:
			case K_NULL:
			case K_PRINT:
			case K_RETURN:
			case K_SELECT:
			case K_SWITCH:
			case K_UPDATE:
			case K_VALUES:
			case K_WHILE:
			case K_VAR:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
			case BLOB_LITERAL:
				{
				setState(504);
				body();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class For_ruleContext extends ParserRuleContext {
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public Expr_ifContext expr_if() {
			return getRuleContext(Expr_ifContext.class,0);
		}
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public List<Expr_for_and_operatorContext> expr_for_and_operator() {
			return getRuleContexts(Expr_for_and_operatorContext.class);
		}
		public Expr_for_and_operatorContext expr_for_and_operator(int i) {
			return getRuleContext(Expr_for_and_operatorContext.class,i);
		}
		public For_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFor_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFor_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFor_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_ruleContext for_rule() throws RecognitionException {
		For_ruleContext _localctx = new For_ruleContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_for_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(507);
				match(K_VAR);
				}
			}

			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (K_CURRENT_DATE - 69)) | (1L << (K_CURRENT_TIME - 69)) | (1L << (K_CURRENT_TIMESTAMP - 69)) | (1L << (K_NULL - 69)))) != 0) || ((((_la - 177)) & ~0x3f) == 0 && ((1L << (_la - 177)) & ((1L << (IDENTIFIER - 177)) | (1L << (NUMERIC_LITERAL - 177)) | (1L << (STRING_LITERAL - 177)) | (1L << (BLOB_LITERAL - 177)))) != 0)) {
				{
				setState(510);
				expr_for_and_operator(0);
				}
			}

			setState(513);
			match(SCOL);
			setState(514);
			expr_if(0);
			setState(515);
			match(SCOL);
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (K_CURRENT_DATE - 69)) | (1L << (K_CURRENT_TIME - 69)) | (1L << (K_CURRENT_TIMESTAMP - 69)) | (1L << (K_NULL - 69)))) != 0) || ((((_la - 177)) & ~0x3f) == 0 && ((1L << (_la - 177)) & ((1L << (IDENTIFIER - 177)) | (1L << (NUMERIC_LITERAL - 177)) | (1L << (STRING_LITERAL - 177)) | (1L << (BLOB_LITERAL - 177)))) != 0)) {
				{
				setState(516);
				expr_for_and_operator(0);
				}
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

	public static class Foreach_ruleContext extends ParserRuleContext {
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public TerminalNode ORM() { return getToken(SQLParser.ORM, 0); }
		public Foreach_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterForeach_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitForeach_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitForeach_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreach_ruleContext foreach_rule() throws RecognitionException {
		Foreach_ruleContext _localctx = new Foreach_ruleContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_foreach_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(K_VAR);
			setState(520);
			any_name();
			setState(521);
			match(ORM);
			setState(522);
			any_name();
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

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode K_RETURN() { return getToken(SQLParser.K_RETURN, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Var_operatorContext var_operator() {
			return getRuleContext(Var_operatorContext.class,0);
		}
		public Inline_condition_stmtContext inline_condition_stmt() {
			return getRuleContext(Inline_condition_stmtContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitReturn_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(K_RETURN);
			setState(528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(525);
				expr(0);
				}
				break;
			case 2:
				{
				setState(526);
				var_operator();
				}
				break;
			case 3:
				{
				setState(527);
				inline_condition_stmt();
				}
				break;
			}
			setState(530);
			match(SCOL);
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

	public static class Array_stmtContext extends ParserRuleContext {
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public TerminalNode OPEN_B() { return getToken(SQLParser.OPEN_B, 0); }
		public TerminalNode CLOSE_B() { return getToken(SQLParser.CLOSE_B, 0); }
		public List<TerminalNode> OPEN_ARRAY() { return getTokens(SQLParser.OPEN_ARRAY); }
		public TerminalNode OPEN_ARRAY(int i) {
			return getToken(SQLParser.OPEN_ARRAY, i);
		}
		public List<TerminalNode> CLOSE_ARRAY() { return getTokens(SQLParser.CLOSE_ARRAY); }
		public TerminalNode CLOSE_ARRAY(int i) {
			return getToken(SQLParser.CLOSE_ARRAY, i);
		}
		public Sql_stmt_listContext sql_stmt_list() {
			return getRuleContext(Sql_stmt_listContext.class,0);
		}
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Array_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterArray_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitArray_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitArray_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_stmtContext array_stmt() throws RecognitionException {
		Array_stmtContext _localctx = new Array_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_array_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(532);
				match(K_VAR);
				}
			}

			setState(542);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_ARRAY:
				{
				{
				setState(535);
				match(OPEN_ARRAY);
				setState(536);
				match(CLOSE_ARRAY);
				setState(537);
				any_name();
				}
				}
				break;
			case OPEN_PAR:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				{
				setState(538);
				any_name();
				setState(539);
				match(OPEN_ARRAY);
				setState(540);
				match(CLOSE_ARRAY);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(547);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(544);
					match(SCOL);
					}
					} 
				}
				setState(549);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(550);
				match(ASSIGN);
				setState(551);
				match(OPEN_B);
				setState(554);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					setState(552);
					any_name();
					}
					break;
				case STAR:
				case PLUS:
				case MINUS:
				case NUMERIC_LITERAL:
					{
					setState(553);
					signed_number();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(556);
					match(COMMA);
					setState(559);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPEN_PAR:
					case IDENTIFIER:
					case STRING_LITERAL:
						{
						setState(557);
						any_name();
						}
						break;
					case STAR:
					case PLUS:
					case MINUS:
					case NUMERIC_LITERAL:
						{
						setState(558);
						signed_number();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(565);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(566);
				match(CLOSE_B);
				setState(570);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(567);
						match(SCOL);
						}
						} 
					}
					setState(572);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(573);
				match(ASSIGN);
				setState(574);
				match(OPEN_ARRAY);
				setState(577);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					setState(575);
					any_name();
					}
					break;
				case STAR:
				case PLUS:
				case MINUS:
				case NUMERIC_LITERAL:
					{
					setState(576);
					signed_number();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(579);
					match(COMMA);
					setState(582);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPEN_PAR:
					case IDENTIFIER:
					case STRING_LITERAL:
						{
						setState(580);
						any_name();
						}
						break;
					case STAR:
					case PLUS:
					case MINUS:
					case NUMERIC_LITERAL:
						{
						setState(581);
						signed_number();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(588);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(589);
				match(CLOSE_ARRAY);
				setState(593);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(590);
						match(SCOL);
						}
						} 
					}
					setState(595);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				}
				}
				break;
			case 3:
				{
				setState(596);
				match(ASSIGN);
				setState(597);
				sql_stmt_list();
				}
				break;
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

	public static class Switch_stmtContext extends ParserRuleContext {
		public TerminalNode K_SWITCH() { return getToken(SQLParser.K_SWITCH, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<TerminalNode> OPEN_B() { return getTokens(SQLParser.OPEN_B); }
		public TerminalNode OPEN_B(int i) {
			return getToken(SQLParser.OPEN_B, i);
		}
		public List<TerminalNode> CLOSE_B() { return getTokens(SQLParser.CLOSE_B); }
		public TerminalNode CLOSE_B(int i) {
			return getToken(SQLParser.CLOSE_B, i);
		}
		public List<TerminalNode> K_CASE() { return getTokens(SQLParser.K_CASE); }
		public TerminalNode K_CASE(int i) {
			return getToken(SQLParser.K_CASE, i);
		}
		public List<TerminalNode> ORM() { return getTokens(SQLParser.ORM); }
		public TerminalNode ORM(int i) {
			return getToken(SQLParser.ORM, i);
		}
		public TerminalNode K_DEFAULT() { return getToken(SQLParser.K_DEFAULT, 0); }
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public List<TerminalNode> K_BREAK() { return getTokens(SQLParser.K_BREAK); }
		public TerminalNode K_BREAK(int i) {
			return getToken(SQLParser.K_BREAK, i);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public Switch_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSwitch_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSwitch_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSwitch_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_stmtContext switch_stmt() throws RecognitionException {
		Switch_stmtContext _localctx = new Switch_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_switch_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(K_SWITCH);
			setState(601);
			match(OPEN_PAR);
			setState(602);
			any_name();
			setState(603);
			match(CLOSE_PAR);
			setState(604);
			match(OPEN_B);
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_CASE) {
				{
				{
				setState(605);
				match(K_CASE);
				setState(608);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					setState(606);
					any_name();
					}
					break;
				case STAR:
				case PLUS:
				case MINUS:
				case NUMERIC_LITERAL:
					{
					setState(607);
					signed_number();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(610);
				match(ORM);
				setState(625);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SCOL:
				case OPEN_PAR:
				case CLOSE_B:
				case PLUS_PLUS:
				case MINUS_MINUS:
				case OPEN_ARRAY:
				case K_ALTER:
				case K_BREAK:
				case K_CASE:
				case K_CAST:
				case K_CREATE:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DEFAULT:
				case K_DELETE:
				case K_DO:
				case K_DROP:
				case K_EXPLAIN:
				case K_FOR:
				case K_FUNCTION:
				case K_IF:
				case K_INSERT:
				case K_NULL:
				case K_PRINT:
				case K_RETURN:
				case K_SELECT:
				case K_SWITCH:
				case K_UPDATE:
				case K_VALUES:
				case K_WHILE:
				case K_VAR:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(611);
					body();
					}
					break;
				case OPEN_B:
					{
					setState(612);
					match(OPEN_B);
					setState(613);
					body();
					setState(616);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_BREAK) {
						{
						setState(614);
						match(K_BREAK);
						setState(615);
						match(SCOL);
						}
					}

					setState(618);
					match(CLOSE_B);
					setState(622);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SCOL) {
						{
						{
						setState(619);
						match(SCOL);
						}
						}
						setState(624);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(629);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_BREAK) {
					{
					setState(627);
					match(K_BREAK);
					setState(628);
					match(SCOL);
					}
				}

				}
				}
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DEFAULT) {
				{
				setState(636);
				match(K_DEFAULT);
				setState(637);
				match(ORM);
				setState(652);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(638);
					body();
					}
					break;
				case 2:
					{
					setState(639);
					match(OPEN_B);
					setState(640);
					body();
					setState(643);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_BREAK) {
						{
						setState(641);
						match(K_BREAK);
						setState(642);
						match(SCOL);
						}
					}

					setState(645);
					match(CLOSE_B);
					setState(649);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SCOL) {
						{
						{
						setState(646);
						match(SCOL);
						}
						}
						setState(651);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_BREAK) {
					{
					setState(654);
					match(K_BREAK);
					setState(655);
					match(SCOL);
					}
				}

				}
			}

			setState(660);
			match(CLOSE_B);
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

	public static class Higher_order_stmtContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SQLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_FUNCTION() { return getToken(SQLParser.K_FUNCTION, 0); }
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
		}
		public TerminalNode OPEN_B() { return getToken(SQLParser.OPEN_B, 0); }
		public TerminalNode K_RETURN() { return getToken(SQLParser.K_RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public TerminalNode CLOSE_B() { return getToken(SQLParser.CLOSE_B, 0); }
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public Higher_order_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_higher_order_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterHigher_order_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitHigher_order_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitHigher_order_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Higher_order_stmtContext higher_order_stmt() throws RecognitionException {
		Higher_order_stmtContext _localctx = new Higher_order_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_higher_order_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(662);
				match(K_VAR);
				setState(663);
				match(IDENTIFIER);
				setState(664);
				match(ASSIGN);
				}
			}

			setState(667);
			match(IDENTIFIER);
			setState(668);
			match(OPEN_PAR);
			setState(672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(669);
				match(IDENTIFIER);
				}
				}
				setState(674);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(675);
			match(COMMA);
			setState(676);
			match(K_FUNCTION);
			setState(677);
			match(OPEN_PAR);
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(678);
				match(IDENTIFIER);
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(679);
					match(COMMA);
					setState(680);
					match(IDENTIFIER);
					}
					}
					setState(685);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(688);
			match(CLOSE_PAR);
			setState(689);
			match(OPEN_B);
			setState(690);
			match(K_RETURN);
			setState(691);
			expr(0);
			setState(692);
			match(SCOL);
			setState(693);
			match(CLOSE_B);
			setState(694);
			match(CLOSE_PAR);
			setState(695);
			match(SCOL);
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

	public static class Func_argument_listContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public TerminalNode K_FUNCTION() { return getToken(SQLParser.K_FUNCTION, 0); }
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Func_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFunc_argument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFunc_argument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFunc_argument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_argument_listContext func_argument_list() throws RecognitionException {
		Func_argument_listContext _localctx = new Func_argument_listContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_func_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_FUNCTION:
				{
				setState(697);
				match(K_FUNCTION);
				}
				break;
			case OPEN_PAR:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(698);
				any_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(701);
			match(OPEN_PAR);
			setState(710);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
				{
				setState(702);
				any_name();
				setState(707);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(703);
					match(COMMA);
					setState(704);
					any_name();
					}
					}
					setState(709);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(712);
			match(CLOSE_PAR);
			setState(713);
			match(SCOL);
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

	public static class Def_function_default_valueContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode OPEN_B() { return getToken(SQLParser.OPEN_B, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode CLOSE_B() { return getToken(SQLParser.CLOSE_B, 0); }
		public TerminalNode K_FUNCTION() { return getToken(SQLParser.K_FUNCTION, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public List<TerminalNode> K_VAR() { return getTokens(SQLParser.K_VAR); }
		public TerminalNode K_VAR(int i) {
			return getToken(SQLParser.K_VAR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Def_function_default_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_function_default_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDef_function_default_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDef_function_default_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDef_function_default_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_function_default_valueContext def_function_default_value() throws RecognitionException {
		Def_function_default_valueContext _localctx = new Def_function_default_valueContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_def_function_default_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(715);
				match(K_VAR);
				}
			}

			setState(720);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_FUNCTION:
				{
				setState(718);
				match(K_FUNCTION);
				}
				break;
			case OPEN_PAR:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(719);
				any_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(722);
			match(OPEN_PAR);
			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(723);
				match(K_VAR);
				setState(724);
				expr(0);
				setState(730);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(725);
					match(COMMA);
					setState(726);
					match(K_VAR);
					setState(727);
					expr(0);
					}
					}
					setState(732);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(735);
			match(CLOSE_PAR);
			setState(736);
			match(OPEN_B);
			setState(737);
			body();
			setState(738);
			match(CLOSE_B);
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

	public static class Json_stmtContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public TerminalNode OPEN_B() { return getToken(SQLParser.OPEN_B, 0); }
		public TerminalNode CLOSE_B() { return getToken(SQLParser.CLOSE_B, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public List<Json_attributeContext> json_attribute() {
			return getRuleContexts(Json_attributeContext.class);
		}
		public Json_attributeContext json_attribute(int i) {
			return getRuleContext(Json_attributeContext.class,i);
		}
		public List<Json_objContext> json_obj() {
			return getRuleContexts(Json_objContext.class);
		}
		public Json_objContext json_obj(int i) {
			return getRuleContext(Json_objContext.class,i);
		}
		public List<Json_arrayContext> json_array() {
			return getRuleContexts(Json_arrayContext.class);
		}
		public Json_arrayContext json_array(int i) {
			return getRuleContext(Json_arrayContext.class,i);
		}
		public Json_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJson_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJson_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJson_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Json_stmtContext json_stmt() throws RecognitionException {
		Json_stmtContext _localctx = new Json_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_json_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(740);
				match(K_VAR);
				}
			}

			setState(743);
			any_name();
			setState(744);
			match(ASSIGN);
			setState(745);
			match(OPEN_B);
			setState(751);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_B || _la==IDENTIFIER) {
				{
				setState(749);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(746);
					json_attribute();
					}
					break;
				case 2:
					{
					setState(747);
					json_obj();
					}
					break;
				case 3:
					{
					setState(748);
					json_array();
					}
					break;
				}
				}
				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(754);
			match(CLOSE_B);
			setState(755);
			match(SCOL);
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

	public static class Json_attributeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode ORM() { return getToken(SQLParser.ORM, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public Json_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJson_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJson_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJson_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Json_attributeContext json_attribute() throws RecognitionException {
		Json_attributeContext _localctx = new Json_attributeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_json_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			match(IDENTIFIER);
			setState(758);
			match(ORM);
			setState(759);
			expr(0);
			setState(761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(760);
				match(COMMA);
				}
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

	public static class Json_objContext extends ParserRuleContext {
		public TerminalNode OPEN_B() { return getToken(SQLParser.OPEN_B, 0); }
		public TerminalNode CLOSE_B() { return getToken(SQLParser.CLOSE_B, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode ORM() { return getToken(SQLParser.ORM, 0); }
		public List<Json_attributeContext> json_attribute() {
			return getRuleContexts(Json_attributeContext.class);
		}
		public Json_attributeContext json_attribute(int i) {
			return getRuleContext(Json_attributeContext.class,i);
		}
		public List<Json_objContext> json_obj() {
			return getRuleContexts(Json_objContext.class);
		}
		public Json_objContext json_obj(int i) {
			return getRuleContext(Json_objContext.class,i);
		}
		public List<Json_arrayContext> json_array() {
			return getRuleContexts(Json_arrayContext.class);
		}
		public Json_arrayContext json_array(int i) {
			return getRuleContext(Json_arrayContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public Json_objContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_obj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJson_obj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJson_obj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJson_obj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Json_objContext json_obj() throws RecognitionException {
		Json_objContext _localctx = new Json_objContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_json_obj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(763);
				match(IDENTIFIER);
				setState(764);
				match(ORM);
				}
			}

			setState(767);
			match(OPEN_B);
			setState(773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_B || _la==IDENTIFIER) {
				{
				setState(771);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(768);
					json_attribute();
					}
					break;
				case 2:
					{
					setState(769);
					json_obj();
					}
					break;
				case 3:
					{
					setState(770);
					json_array();
					}
					break;
				}
				}
				setState(775);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(776);
			match(CLOSE_B);
			setState(778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(777);
				match(COMMA);
				}
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

	public static class Json_arrayContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode ORM() { return getToken(SQLParser.ORM, 0); }
		public TerminalNode OPEN_ARRAY() { return getToken(SQLParser.OPEN_ARRAY, 0); }
		public TerminalNode CLOSE_ARRAY() { return getToken(SQLParser.CLOSE_ARRAY, 0); }
		public List<Json_objContext> json_obj() {
			return getRuleContexts(Json_objContext.class);
		}
		public Json_objContext json_obj(int i) {
			return getRuleContext(Json_objContext.class,i);
		}
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Json_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJson_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJson_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJson_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Json_arrayContext json_array() throws RecognitionException {
		Json_arrayContext _localctx = new Json_arrayContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_json_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			match(IDENTIFIER);
			setState(781);
			match(ORM);
			setState(782);
			match(OPEN_ARRAY);
			setState(802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << OPEN_B) | (1L << STAR) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 177)) & ~0x3f) == 0 && ((1L << (_la - 177)) & ((1L << (IDENTIFIER - 177)) | (1L << (NUMERIC_LITERAL - 177)) | (1L << (STRING_LITERAL - 177)))) != 0)) {
				{
				setState(800);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(783);
					json_obj();
					}
					break;
				case 2:
					{
					setState(784);
					any_name();
					setState(789);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(785);
						match(COMMA);
						setState(786);
						any_name();
						}
						}
						setState(791);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 3:
					{
					setState(792);
					signed_number();
					setState(797);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(793);
						match(COMMA);
						setState(794);
						signed_number();
						}
						}
						setState(799);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				}
				setState(804);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(805);
			match(CLOSE_ARRAY);
			setState(807);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(806);
				match(COMMA);
				}
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

	public static class Call_jsonContext extends ParserRuleContext {
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLParser.DOT, i);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public Call_jsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCall_json(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCall_json(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCall_json(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_jsonContext call_json() throws RecognitionException {
		Call_jsonContext _localctx = new Call_jsonContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_call_json);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			any_name();
			setState(814);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(810);
					match(DOT);
					setState(811);
					any_name();
					}
					} 
				}
				setState(816);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			}
			setState(820);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(817);
					match(SCOL);
					}
					} 
				}
				setState(822);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
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

	public static class Edit_jsonContext extends ParserRuleContext {
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLParser.DOT, i);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public Edit_jsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edit_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterEdit_json(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitEdit_json(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitEdit_json(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Edit_jsonContext edit_json() throws RecognitionException {
		Edit_jsonContext _localctx = new Edit_jsonContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_edit_json);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			any_name();
			setState(828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(824);
				match(DOT);
				setState(825);
				any_name();
				}
				}
				setState(830);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(831);
			match(ASSIGN);
			setState(834);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(832);
				signed_number();
				}
				break;
			case 2:
				{
				setState(833);
				expr(0);
				}
				break;
			}
			setState(839);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(836);
					match(SCOL);
					}
					} 
				}
				setState(841);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
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

	public static class Alter_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_ALTER() { return getToken(SQLParser.K_ALTER, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public Source_table_nameContext source_table_name() {
			return getRuleContext(Source_table_nameContext.class,0);
		}
		public TerminalNode K_RENAME() { return getToken(SQLParser.K_RENAME, 0); }
		public TerminalNode K_TO() { return getToken(SQLParser.K_TO, 0); }
		public New_table_nameContext new_table_name() {
			return getRuleContext(New_table_nameContext.class,0);
		}
		public Alter_table_addContext alter_table_add() {
			return getRuleContext(Alter_table_addContext.class,0);
		}
		public Alter_table_add_constraintContext alter_table_add_constraint() {
			return getRuleContext(Alter_table_add_constraintContext.class,0);
		}
		public TerminalNode K_ADD() { return getToken(SQLParser.K_ADD, 0); }
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public TerminalNode K_ONLY() { return getToken(SQLParser.K_ONLY, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public TerminalNode K_ENABLE() { return getToken(SQLParser.K_ENABLE, 0); }
		public UnknownContext unknown() {
			return getRuleContext(UnknownContext.class,0);
		}
		public TerminalNode K_COLUMN() { return getToken(SQLParser.K_COLUMN, 0); }
		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAlter_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAlter_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAlter_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_alter_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			match(K_ALTER);
			setState(843);
			match(K_TABLE);
			setState(845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ONLY) {
				{
				setState(844);
				match(K_ONLY);
				}
			}

			setState(850);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(847);
				database_name();
				setState(848);
				match(DOT);
				}
				break;
			}
			setState(852);
			source_table_name();
			setState(863);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(853);
				match(K_RENAME);
				setState(854);
				match(K_TO);
				setState(855);
				new_table_name();
				}
				break;
			case 2:
				{
				setState(856);
				alter_table_add();
				}
				break;
			case 3:
				{
				setState(857);
				alter_table_add_constraint();
				}
				break;
			case 4:
				{
				setState(858);
				match(K_ADD);
				setState(860);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_COLUMN) {
					{
					setState(859);
					match(K_COLUMN);
					}
				}

				setState(862);
				column_def();
				}
				break;
			}
			setState(866);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(865);
				match(K_ENABLE);
				}
				break;
			}
			setState(869);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(868);
				unknown();
				}
				break;
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

	public static class Alter_table_add_constraintContext extends ParserRuleContext {
		public TerminalNode K_ADD() { return getToken(SQLParser.K_ADD, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SQLParser.K_CONSTRAINT, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_constraintContext table_constraint() {
			return getRuleContext(Table_constraintContext.class,0);
		}
		public Alter_table_add_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAlter_table_add_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAlter_table_add_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAlter_table_add_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_add_constraintContext alter_table_add_constraint() throws RecognitionException {
		Alter_table_add_constraintContext _localctx = new Alter_table_add_constraintContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_alter_table_add_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			match(K_ADD);
			setState(872);
			match(K_CONSTRAINT);
			setState(873);
			any_name();
			setState(874);
			table_constraint();
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

	public static class Alter_table_addContext extends ParserRuleContext {
		public TerminalNode K_ADD() { return getToken(SQLParser.K_ADD, 0); }
		public Table_constraintContext table_constraint() {
			return getRuleContext(Table_constraintContext.class,0);
		}
		public Alter_table_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAlter_table_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAlter_table_add(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAlter_table_add(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_addContext alter_table_add() throws RecognitionException {
		Alter_table_addContext _localctx = new Alter_table_addContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_alter_table_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			match(K_ADD);
			setState(877);
			table_constraint();
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

	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreate_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			match(K_CREATE);
			setState(880);
			match(K_TABLE);
			setState(884);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(881);
				match(K_IF);
				setState(882);
				match(K_NOT);
				setState(883);
				match(K_EXISTS);
				}
			}

			setState(889);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(886);
				database_name();
				setState(887);
				match(DOT);
				}
				break;
			}
			setState(891);
			table_name();
			setState(907);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(892);
				match(OPEN_PAR);
				setState(893);
				column_def();
				setState(900);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					setState(898);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
					case 1:
						{
						setState(894);
						match(COMMA);
						setState(895);
						table_constraint();
						}
						break;
					case 2:
						{
						setState(896);
						match(COMMA);
						setState(897);
						column_def();
						}
						break;
					}
					}
					setState(902);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(903);
				match(CLOSE_PAR);
				}
				break;
			case K_AS:
				{
				setState(905);
				match(K_AS);
				setState(906);
				select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Create_type_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLParser.K_CREATE, 0); }
		public TerminalNode K_TYPE() { return getToken(SQLParser.K_TYPE, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public Create_type_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_type_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreate_type_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreate_type_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreate_type_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_type_stmtContext create_type_stmt() throws RecognitionException {
		Create_type_stmtContext _localctx = new Create_type_stmtContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_create_type_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
			match(K_CREATE);
			setState(910);
			match(K_TYPE);
			setState(914);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(911);
				match(K_IF);
				setState(912);
				match(K_NOT);
				setState(913);
				match(K_EXISTS);
				}
			}

			setState(916);
			any_name();
			{
			setState(917);
			match(OPEN_PAR);
			setState(918);
			column_def();
			setState(925);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				setState(923);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(919);
					match(COMMA);
					setState(920);
					table_constraint();
					}
					break;
				case 2:
					{
					setState(921);
					match(COMMA);
					setState(922);
					column_def();
					}
					break;
				}
				}
				setState(927);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(928);
			match(CLOSE_PAR);
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

	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode K_DELETE() { return getToken(SQLParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(SQLParser.K_FROM, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDelete_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDelete_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDelete_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_delete_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			match(K_DELETE);
			setState(931);
			match(K_FROM);
			setState(932);
			qualified_table_name();
			setState(935);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(933);
				match(K_WHERE);
				setState(934);
				expr(0);
				}
				break;
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

	public static class Drop_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SQLParser.K_DROP, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public Drop_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDrop_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDrop_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDrop_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_table_stmtContext drop_table_stmt() throws RecognitionException {
		Drop_table_stmtContext _localctx = new Drop_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_drop_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			match(K_DROP);
			setState(938);
			match(K_TABLE);
			setState(941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(939);
				match(K_IF);
				setState(940);
				match(K_EXISTS);
				}
			}

			setState(946);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(943);
				database_name();
				setState(944);
				match(DOT);
				}
				break;
			}
			setState(948);
			table_name();
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

	public static class Factored_select_stmtContext extends ParserRuleContext {
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
		public TerminalNode K_ORDER() { return getToken(SQLParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLParser.K_OFFSET, 0); }
		public Factored_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factored_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFactored_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFactored_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFactored_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factored_select_stmtContext factored_select_stmt() throws RecognitionException {
		Factored_select_stmtContext _localctx = new Factored_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_factored_select_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
			select_core();
			setState(961);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(951);
				match(K_ORDER);
				setState(952);
				match(K_BY);
				setState(953);
				ordering_term();
				setState(958);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(954);
						match(COMMA);
						setState(955);
						ordering_term();
						}
						} 
					}
					setState(960);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
				}
				}
				break;
			}
			setState(969);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(963);
				match(K_LIMIT);
				setState(964);
				expr(0);
				setState(967);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(965);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(966);
					expr(0);
					}
					break;
				}
				}
				break;
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

	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode K_INSERT() { return getToken(SQLParser.K_INSERT, 0); }
		public TerminalNode K_INTO() { return getToken(SQLParser.K_INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_VALUES() { return getToken(SQLParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_DEFAULT() { return getToken(SQLParser.K_DEFAULT, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitInsert_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitInsert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_insert_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(971);
			match(K_INSERT);
			setState(972);
			match(K_INTO);
			setState(976);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(973);
				database_name();
				setState(974);
				match(DOT);
				}
				break;
			}
			setState(978);
			table_name();
			setState(990);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(979);
				match(OPEN_PAR);
				setState(980);
				column_name();
				setState(985);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(981);
					match(COMMA);
					setState(982);
					column_name();
					}
					}
					setState(987);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(988);
				match(CLOSE_PAR);
				}
			}

			setState(1023);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(992);
				match(K_VALUES);
				setState(993);
				match(OPEN_PAR);
				setState(994);
				expr(0);
				setState(999);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(995);
					match(COMMA);
					setState(996);
					expr(0);
					}
					}
					setState(1001);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1002);
				match(CLOSE_PAR);
				setState(1017);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1003);
						match(COMMA);
						setState(1004);
						match(OPEN_PAR);
						setState(1005);
						expr(0);
						setState(1010);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1006);
							match(COMMA);
							setState(1007);
							expr(0);
							}
							}
							setState(1012);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1013);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(1019);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(1020);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(1021);
				match(K_DEFAULT);
				setState(1022);
				match(K_VALUES);
				}
				break;
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

	public static class Select_stmtContext extends ParserRuleContext {
		public Select_or_valuesContext select_or_values() {
			return getRuleContext(Select_or_valuesContext.class,0);
		}
		public TerminalNode K_ORDER() { return getToken(SQLParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLParser.K_OFFSET, 0); }
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_select_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1025);
			select_or_values();
			setState(1036);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1026);
				match(K_ORDER);
				setState(1027);
				match(K_BY);
				setState(1028);
				ordering_term();
				setState(1033);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1029);
						match(COMMA);
						setState(1030);
						ordering_term();
						}
						} 
					}
					setState(1035);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
				}
				}
				break;
			}
			setState(1044);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(1038);
				match(K_LIMIT);
				setState(1039);
				expr(0);
				setState(1042);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(1040);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1041);
					expr(0);
					}
					break;
				}
				}
				break;
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

	public static class Select_or_valuesContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SQLParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_FROM() { return getToken(SQLParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SQLParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SQLParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SQLParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
		}
		public Select_or_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_or_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSelect_or_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSelect_or_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSelect_or_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_or_valuesContext select_or_values() throws RecognitionException {
		Select_or_valuesContext _localctx = new Select_or_valuesContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_select_or_values);
		int _la;
		try {
			int _alt;
			setState(1120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1046);
				match(K_SELECT);
				setState(1048);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(1047);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1050);
				result_column();
				setState(1055);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1051);
						match(COMMA);
						setState(1052);
						result_column();
						}
						} 
					}
					setState(1057);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
				}
				setState(1070);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
				case 1:
					{
					setState(1058);
					match(K_FROM);
					setState(1068);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
					case 1:
						{
						setState(1059);
						table_or_subquery();
						setState(1064);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1060);
								match(COMMA);
								setState(1061);
								table_or_subquery();
								}
								} 
							}
							setState(1066);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
						}
						}
						break;
					case 2:
						{
						setState(1067);
						join_clause();
						}
						break;
					}
					}
					break;
				}
				setState(1074);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(1072);
					match(K_WHERE);
					setState(1073);
					expr(0);
					}
					break;
				}
				setState(1090);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					setState(1076);
					match(K_GROUP);
					setState(1077);
					match(K_BY);
					setState(1078);
					expr(0);
					setState(1083);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1079);
							match(COMMA);
							setState(1080);
							expr(0);
							}
							} 
						}
						setState(1085);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
					}
					setState(1088);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
					case 1:
						{
						setState(1086);
						match(K_HAVING);
						setState(1087);
						expr(0);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1092);
				match(K_VALUES);
				setState(1093);
				match(OPEN_PAR);
				setState(1094);
				expr(0);
				setState(1099);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1095);
					match(COMMA);
					setState(1096);
					expr(0);
					}
					}
					setState(1101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1102);
				match(CLOSE_PAR);
				setState(1117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1103);
						match(COMMA);
						setState(1104);
						match(OPEN_PAR);
						setState(1105);
						expr(0);
						setState(1110);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1106);
							match(COMMA);
							setState(1107);
							expr(0);
							}
							}
							setState(1112);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1113);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(1119);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(SQLParser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(SQLParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SQLParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterUpdate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitUpdate_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitUpdate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_update_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1122);
			match(K_UPDATE);
			setState(1123);
			qualified_table_name();
			setState(1124);
			match(K_SET);
			setState(1125);
			column_name();
			setState(1126);
			match(ASSIGN);
			setState(1127);
			expr(0);
			setState(1135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1128);
					match(COMMA);
					setState(1129);
					column_name();
					setState(1130);
					match(ASSIGN);
					setState(1131);
					expr(0);
					}
					} 
				}
				setState(1137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			}
			setState(1140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1138);
				match(K_WHERE);
				setState(1139);
				expr(0);
				}
				break;
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

	public static class Column_defContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public List<Type_nameContext> type_name() {
			return getRuleContexts(Type_nameContext.class);
		}
		public Type_nameContext type_name(int i) {
			return getRuleContext(Type_nameContext.class,i);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_column_def);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1142);
			column_name();
			setState(1147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1145);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_CHECK:
					case K_COLLATE:
					case K_CONSTRAINT:
					case K_DEFAULT:
					case K_NOT:
					case K_NULL:
					case K_PRIMARY:
					case K_REFERENCES:
					case K_UNIQUE:
						{
						setState(1143);
						column_constraint();
						}
						break;
					case OPEN_PAR:
					case IDENTIFIER:
					case STRING_LITERAL:
						{
						setState(1144);
						type_name();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
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

	public static class Type_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1150);
			name();
			setState(1170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1151);
				match(OPEN_PAR);
				setState(1152);
				signed_number();
				setState(1154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1153);
					any_name();
					}
				}

				setState(1156);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(1158);
				match(OPEN_PAR);
				setState(1159);
				signed_number();
				setState(1161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1160);
					any_name();
					}
				}

				setState(1163);
				match(COMMA);
				setState(1164);
				signed_number();
				setState(1166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1165);
					any_name();
					}
				}

				setState(1168);
				match(CLOSE_PAR);
				}
				break;
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

	public static class Column_constraintContext extends ParserRuleContext {
		public Column_constraint_primary_keyContext column_constraint_primary_key() {
			return getRuleContext(Column_constraint_primary_keyContext.class,0);
		}
		public Column_constraint_foreign_keyContext column_constraint_foreign_key() {
			return getRuleContext(Column_constraint_foreign_keyContext.class,0);
		}
		public Column_constraint_not_nullContext column_constraint_not_null() {
			return getRuleContext(Column_constraint_not_nullContext.class,0);
		}
		public Column_constraint_nullContext column_constraint_null() {
			return getRuleContext(Column_constraint_nullContext.class,0);
		}
		public TerminalNode K_UNIQUE() { return getToken(SQLParser.K_UNIQUE, 0); }
		public TerminalNode K_CHECK() { return getToken(SQLParser.K_CHECK, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Column_defaultContext column_default() {
			return getRuleContext(Column_defaultContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SQLParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1172);
				match(K_CONSTRAINT);
				setState(1173);
				name();
				}
			}

			setState(1189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1176);
				column_constraint_primary_key();
				}
				break;
			case K_REFERENCES:
				{
				setState(1177);
				column_constraint_foreign_key();
				}
				break;
			case K_NOT:
				{
				setState(1178);
				column_constraint_not_null();
				}
				break;
			case K_NULL:
				{
				setState(1179);
				column_constraint_null();
				}
				break;
			case K_UNIQUE:
				{
				setState(1180);
				match(K_UNIQUE);
				}
				break;
			case K_CHECK:
				{
				setState(1181);
				match(K_CHECK);
				setState(1182);
				match(OPEN_PAR);
				setState(1183);
				expr(0);
				setState(1184);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(1186);
				column_default();
				}
				break;
			case K_COLLATE:
				{
				setState(1187);
				match(K_COLLATE);
				setState(1188);
				collation_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Column_constraint_primary_keyContext extends ParserRuleContext {
		public TerminalNode K_PRIMARY() { return getToken(SQLParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(SQLParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_ASC() { return getToken(SQLParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLParser.K_DESC, 0); }
		public Column_constraint_primary_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_primary_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint_primary_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint_primary_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint_primary_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_primary_keyContext column_constraint_primary_key() throws RecognitionException {
		Column_constraint_primary_keyContext _localctx = new Column_constraint_primary_keyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_column_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1191);
			match(K_PRIMARY);
			setState(1192);
			match(K_KEY);
			setState(1194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				{
				setState(1193);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				{
				setState(1196);
				match(K_AUTOINCREMENT);
				}
				break;
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

	public static class Column_constraint_foreign_keyContext extends ParserRuleContext {
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public Column_constraint_foreign_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_foreign_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint_foreign_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint_foreign_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint_foreign_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_foreign_keyContext column_constraint_foreign_key() throws RecognitionException {
		Column_constraint_foreign_keyContext _localctx = new Column_constraint_foreign_keyContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_column_constraint_foreign_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1199);
			foreign_key_clause();
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

	public static class Column_constraint_not_nullContext extends ParserRuleContext {
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public Column_constraint_not_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_not_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint_not_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint_not_null(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint_not_null(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_not_nullContext column_constraint_not_null() throws RecognitionException {
		Column_constraint_not_nullContext _localctx = new Column_constraint_not_nullContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_column_constraint_not_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1201);
			match(K_NOT);
			setState(1202);
			match(K_NULL);
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

	public static class Column_constraint_nullContext extends ParserRuleContext {
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public Column_constraint_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint_null(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint_null(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_nullContext column_constraint_null() throws RecognitionException {
		Column_constraint_nullContext _localctx = new Column_constraint_nullContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_column_constraint_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1204);
			match(K_NULL);
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

	public static class Column_defaultContext extends ParserRuleContext {
		public TerminalNode K_DEFAULT() { return getToken(SQLParser.K_DEFAULT, 0); }
		public Column_default_valueContext column_default_value() {
			return getRuleContext(Column_default_valueContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_NEXTVAL() { return getToken(SQLParser.K_NEXTVAL, 0); }
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public Column_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defaultContext column_default() throws RecognitionException {
		Column_defaultContext _localctx = new Column_defaultContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_column_default);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1206);
			match(K_DEFAULT);
			setState(1218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(1207);
				column_default_value();
				}
				break;
			case 2:
				{
				setState(1208);
				match(OPEN_PAR);
				setState(1209);
				expr(0);
				setState(1210);
				match(CLOSE_PAR);
				}
				break;
			case 3:
				{
				setState(1212);
				match(K_NEXTVAL);
				setState(1213);
				match(OPEN_PAR);
				setState(1214);
				expr(0);
				setState(1215);
				match(CLOSE_PAR);
				}
				break;
			case 4:
				{
				setState(1217);
				any_name();
				}
				break;
			}
			setState(1226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				{
				setState(1220);
				match(T__0);
				setState(1222); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1221);
						any_name();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1224); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
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

	public static class Column_default_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Column_default_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_default_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_default_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_default_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_default_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_default_valueContext column_default_value() throws RecognitionException {
		Column_default_valueContext _localctx = new Column_default_valueContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_column_default_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				{
				setState(1228);
				signed_number();
				}
				break;
			case 2:
				{
				setState(1229);
				literal_value();
				}
				break;
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

	public static class ExprContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLParser.DOT, i);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLParser.K_DISTINCT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public Inline_condition_stmtContext inline_condition_stmt() {
			return getRuleContext(Inline_condition_stmtContext.class,0);
		}
		public Sql_stmt_listContext sql_stmt_list() {
			return getRuleContext(Sql_stmt_listContext.class,0);
		}
		public TerminalNode PIPE2() { return getToken(SQLParser.PIPE2, 0); }
		public TerminalNode DIV() { return getToken(SQLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SQLParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public TerminalNode LT2() { return getToken(SQLParser.LT2, 0); }
		public TerminalNode GT2() { return getToken(SQLParser.GT2, 0); }
		public TerminalNode AMP() { return getToken(SQLParser.AMP, 0); }
		public TerminalNode PIPE() { return getToken(SQLParser.PIPE, 0); }
		public TerminalNode LT() { return getToken(SQLParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SQLParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SQLParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SQLParser.GT_EQ, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public TerminalNode EQ() { return getToken(SQLParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SQLParser.NOT_EQ1, 0); }
		public TerminalNode NOT_EQ2() { return getToken(SQLParser.NOT_EQ2, 0); }
		public TerminalNode K_IS() { return getToken(SQLParser.K_IS, 0); }
		public TerminalNode K_IN() { return getToken(SQLParser.K_IN, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLParser.K_GLOB, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLParser.K_MATCH, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLParser.K_REGEXP, 0); }
		public TerminalNode K_AND() { return getToken(SQLParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(SQLParser.K_OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				{
				setState(1233);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1242);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
				case 1:
					{
					setState(1237);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
					case 1:
						{
						setState(1234);
						database_name();
						setState(1235);
						match(DOT);
						}
						break;
					}
					setState(1239);
					table_name();
					setState(1240);
					match(DOT);
					}
					break;
				}
				setState(1244);
				column_name();
				}
				break;
			case 3:
				{
				setState(1245);
				unary_operator();
				setState(1246);
				expr(15);
				}
				break;
			case 4:
				{
				setState(1248);
				function_name();
				setState(1249);
				match(OPEN_PAR);
				setState(1262);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SCOL:
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case OPEN_ARRAY:
				case K_ALTER:
				case K_CAST:
				case K_CREATE:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DELETE:
				case K_DISTINCT:
				case K_DROP:
				case K_EXISTS:
				case K_EXPLAIN:
				case K_INSERT:
				case K_NOT:
				case K_NULL:
				case K_SELECT:
				case K_UPDATE:
				case K_VALUES:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(1251);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_DISTINCT) {
						{
						setState(1250);
						match(K_DISTINCT);
						}
					}

					setState(1253);
					expr(0);
					setState(1258);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1254);
						match(COMMA);
						setState(1255);
						expr(0);
						}
						}
						setState(1260);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(1261);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(1264);
				match(CLOSE_PAR);
				}
				break;
			case 5:
				{
				setState(1266);
				match(OPEN_PAR);
				setState(1267);
				expr(0);
				setState(1268);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(1274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(1271);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(1270);
						match(K_NOT);
						}
					}

					setState(1273);
					match(K_EXISTS);
					}
				}

				setState(1276);
				match(OPEN_PAR);
				setState(1277);
				select_stmt();
				setState(1278);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(1280);
				inline_condition_stmt();
				}
				break;
			case 8:
				{
				setState(1281);
				sql_stmt_list();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1349);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1347);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1284);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1285);
						match(PIPE2);
						setState(1286);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1287);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1288);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1289);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1290);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1291);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1292);
						expr(13);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1293);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1294);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1295);
						expr(12);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1296);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1297);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1298);
						expr(11);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1299);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1312);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
						case 1:
							{
							setState(1300);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(1301);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(1302);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(1303);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(1304);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(1305);
							match(K_IS);
							setState(1306);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(1307);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(1308);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(1309);
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(1310);
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(1311);
							match(K_REGEXP);
							}
							break;
						}
						setState(1314);
						expr(10);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1315);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1316);
						match(K_AND);
						setState(1317);
						expr(9);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1318);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1319);
						match(K_OR);
						setState(1320);
						expr(8);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1321);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1323);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1322);
							match(K_NOT);
							}
						}

						setState(1325);
						match(K_IN);
						setState(1345);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
						case 1:
							{
							setState(1326);
							match(OPEN_PAR);
							setState(1336);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
							case 1:
								{
								setState(1327);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(1328);
								expr(0);
								setState(1333);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1329);
									match(COMMA);
									setState(1330);
									expr(0);
									}
									}
									setState(1335);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(1338);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1342);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
							case 1:
								{
								setState(1339);
								database_name();
								setState(1340);
								match(DOT);
								}
								break;
							}
							setState(1344);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1351);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expr_whileContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public List<TerminalNode> OPEN_ARRAY() { return getTokens(SQLParser.OPEN_ARRAY); }
		public TerminalNode OPEN_ARRAY(int i) {
			return getToken(SQLParser.OPEN_ARRAY, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CLOSE_ARRAY() { return getTokens(SQLParser.CLOSE_ARRAY); }
		public TerminalNode CLOSE_ARRAY(int i) {
			return getToken(SQLParser.CLOSE_ARRAY, i);
		}
		public List<Expr_whileContext> expr_while() {
			return getRuleContexts(Expr_whileContext.class);
		}
		public Expr_whileContext expr_while(int i) {
			return getRuleContext(Expr_whileContext.class,i);
		}
		public List<Call_jsonContext> call_json() {
			return getRuleContexts(Call_jsonContext.class);
		}
		public Call_jsonContext call_json(int i) {
			return getRuleContext(Call_jsonContext.class,i);
		}
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_CAST() { return getToken(SQLParser.K_CAST, 0); }
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(SQLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SQLParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public TerminalNode LT() { return getToken(SQLParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SQLParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SQLParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SQLParser.GT_EQ, 0); }
		public TerminalNode EQ() { return getToken(SQLParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SQLParser.NOT_EQ1, 0); }
		public TerminalNode K_AND() { return getToken(SQLParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(SQLParser.K_OR, 0); }
		public TerminalNode PIPE2() { return getToken(SQLParser.PIPE2, 0); }
		public TerminalNode AND() { return getToken(SQLParser.AND, 0); }
		public Expr_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpr_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpr_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExpr_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_whileContext expr_while() throws RecognitionException {
		return expr_while(0);
	}

	private Expr_whileContext expr_while(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_whileContext _localctx = new Expr_whileContext(_ctx, _parentState);
		Expr_whileContext _prevctx = _localctx;
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_expr_while, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1353);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1354);
				any_name();
				}
				break;
			case 3:
				{
				setState(1355);
				any_name();
				setState(1356);
				match(OPEN_ARRAY);
				setState(1357);
				expr(0);
				setState(1358);
				match(CLOSE_ARRAY);
				setState(1362);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1359);
					expr_while(0);
					setState(1360);
					call_json();
					}
					break;
				}
				}
				break;
			case 4:
				{
				setState(1364);
				any_name();
				setState(1365);
				match(OPEN_ARRAY);
				setState(1366);
				expr(0);
				setState(1367);
				match(CLOSE_ARRAY);
				setState(1368);
				expr_while(0);
				setState(1369);
				any_name();
				setState(1370);
				match(OPEN_ARRAY);
				setState(1371);
				expr(0);
				setState(1372);
				match(CLOSE_ARRAY);
				}
				break;
			case 5:
				{
				setState(1374);
				any_name();
				setState(1375);
				match(OPEN_ARRAY);
				setState(1376);
				expr(0);
				setState(1377);
				match(CLOSE_ARRAY);
				setState(1378);
				expr_while(0);
				setState(1381);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					setState(1379);
					any_name();
					}
					break;
				case STAR:
				case PLUS:
				case MINUS:
				case NUMERIC_LITERAL:
					{
					setState(1380);
					signed_number();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 6:
				{
				setState(1383);
				call_json();
				setState(1384);
				expr_while(0);
				setState(1387);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					setState(1385);
					any_name();
					}
					break;
				case STAR:
				case PLUS:
				case MINUS:
				case NUMERIC_LITERAL:
					{
					setState(1386);
					signed_number();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 7:
				{
				setState(1389);
				call_json();
				setState(1393);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1390);
					expr_while(0);
					setState(1391);
					call_json();
					}
					break;
				}
				}
				break;
			case 8:
				{
				setState(1395);
				call_json();
				setState(1396);
				expr_while(0);
				setState(1397);
				any_name();
				setState(1398);
				match(OPEN_ARRAY);
				setState(1399);
				expr(0);
				setState(1400);
				match(CLOSE_ARRAY);
				}
				break;
			case 9:
				{
				setState(1402);
				match(OPEN_PAR);
				setState(1403);
				expr_while(0);
				setState(1404);
				match(CLOSE_PAR);
				}
				break;
			case 10:
				{
				setState(1406);
				match(K_CAST);
				setState(1407);
				match(OPEN_PAR);
				setState(1408);
				expr_while(0);
				setState(1409);
				match(K_AS);
				setState(1410);
				type_name();
				setState(1411);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1441);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1439);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_whileContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_while);
						setState(1415);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1416);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1417);
						expr_while(17);
						}
						break;
					case 2:
						{
						_localctx = new Expr_whileContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_while);
						setState(1418);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1419);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1420);
						expr_while(16);
						}
						break;
					case 3:
						{
						_localctx = new Expr_whileContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_while);
						setState(1421);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1422);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1423);
						expr_while(15);
						}
						break;
					case 4:
						{
						_localctx = new Expr_whileContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_while);
						setState(1424);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1425);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NOT_EQ1) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1426);
						expr_while(14);
						}
						break;
					case 5:
						{
						_localctx = new Expr_whileContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_while);
						setState(1427);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1428);
						match(K_AND);
						setState(1429);
						expr_while(13);
						}
						break;
					case 6:
						{
						_localctx = new Expr_whileContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_while);
						setState(1430);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1431);
						match(K_OR);
						setState(1432);
						expr_while(12);
						}
						break;
					case 7:
						{
						_localctx = new Expr_whileContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_while);
						setState(1433);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1434);
						match(PIPE2);
						setState(1435);
						expr_while(11);
						}
						break;
					case 8:
						{
						_localctx = new Expr_whileContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_while);
						setState(1436);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1437);
						match(AND);
						setState(1438);
						expr_while(10);
						}
						break;
					}
					} 
				}
				setState(1443);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expr_ifContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public List<TerminalNode> OPEN_ARRAY() { return getTokens(SQLParser.OPEN_ARRAY); }
		public TerminalNode OPEN_ARRAY(int i) {
			return getToken(SQLParser.OPEN_ARRAY, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CLOSE_ARRAY() { return getTokens(SQLParser.CLOSE_ARRAY); }
		public TerminalNode CLOSE_ARRAY(int i) {
			return getToken(SQLParser.CLOSE_ARRAY, i);
		}
		public List<Expr_ifContext> expr_if() {
			return getRuleContexts(Expr_ifContext.class);
		}
		public Expr_ifContext expr_if(int i) {
			return getRuleContext(Expr_ifContext.class,i);
		}
		public List<Call_jsonContext> call_json() {
			return getRuleContexts(Call_jsonContext.class);
		}
		public Call_jsonContext call_json(int i) {
			return getRuleContext(Call_jsonContext.class,i);
		}
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_CAST() { return getToken(SQLParser.K_CAST, 0); }
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(SQLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SQLParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public TerminalNode LT() { return getToken(SQLParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SQLParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SQLParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SQLParser.GT_EQ, 0); }
		public TerminalNode EQ() { return getToken(SQLParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SQLParser.NOT_EQ1, 0); }
		public TerminalNode K_AND() { return getToken(SQLParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(SQLParser.K_OR, 0); }
		public TerminalNode PIPE2() { return getToken(SQLParser.PIPE2, 0); }
		public TerminalNode AND() { return getToken(SQLParser.AND, 0); }
		public Expr_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpr_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpr_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExpr_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_ifContext expr_if() throws RecognitionException {
		return expr_if(0);
	}

	private Expr_ifContext expr_if(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_ifContext _localctx = new Expr_ifContext(_ctx, _parentState);
		Expr_ifContext _prevctx = _localctx;
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_expr_if, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1445);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1446);
				any_name();
				}
				break;
			case 3:
				{
				setState(1447);
				any_name();
				setState(1448);
				match(OPEN_ARRAY);
				setState(1449);
				expr(0);
				setState(1450);
				match(CLOSE_ARRAY);
				setState(1454);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1451);
					expr_if(0);
					setState(1452);
					call_json();
					}
					break;
				}
				}
				break;
			case 4:
				{
				setState(1456);
				any_name();
				setState(1457);
				match(OPEN_ARRAY);
				setState(1458);
				expr(0);
				setState(1459);
				match(CLOSE_ARRAY);
				setState(1460);
				expr_if(0);
				setState(1461);
				any_name();
				setState(1462);
				match(OPEN_ARRAY);
				setState(1463);
				expr(0);
				setState(1464);
				match(CLOSE_ARRAY);
				}
				break;
			case 5:
				{
				setState(1466);
				any_name();
				setState(1467);
				match(OPEN_ARRAY);
				setState(1468);
				expr(0);
				setState(1469);
				match(CLOSE_ARRAY);
				setState(1470);
				expr_if(0);
				setState(1473);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					setState(1471);
					any_name();
					}
					break;
				case STAR:
				case PLUS:
				case MINUS:
				case NUMERIC_LITERAL:
					{
					setState(1472);
					signed_number();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 6:
				{
				setState(1475);
				call_json();
				setState(1476);
				expr_if(0);
				setState(1479);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					setState(1477);
					any_name();
					}
					break;
				case STAR:
				case PLUS:
				case MINUS:
				case NUMERIC_LITERAL:
					{
					setState(1478);
					signed_number();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 7:
				{
				setState(1481);
				call_json();
				setState(1485);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
				case 1:
					{
					setState(1482);
					expr_if(0);
					setState(1483);
					call_json();
					}
					break;
				}
				}
				break;
			case 8:
				{
				setState(1487);
				call_json();
				setState(1488);
				expr_if(0);
				setState(1489);
				any_name();
				setState(1490);
				match(OPEN_ARRAY);
				setState(1491);
				expr(0);
				setState(1492);
				match(CLOSE_ARRAY);
				}
				break;
			case 9:
				{
				setState(1494);
				match(OPEN_ARRAY);
				setState(1495);
				any_name();
				setState(1496);
				match(CLOSE_ARRAY);
				}
				break;
			case 10:
				{
				setState(1498);
				match(OPEN_PAR);
				setState(1499);
				expr_if(0);
				setState(1500);
				match(CLOSE_PAR);
				}
				break;
			case 11:
				{
				setState(1502);
				match(K_CAST);
				setState(1503);
				match(OPEN_PAR);
				setState(1504);
				expr_if(0);
				setState(1505);
				match(K_AS);
				setState(1506);
				type_name();
				setState(1507);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1537);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1535);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_ifContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_if);
						setState(1511);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1512);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1513);
						expr_if(18);
						}
						break;
					case 2:
						{
						_localctx = new Expr_ifContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_if);
						setState(1514);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1515);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1516);
						expr_if(17);
						}
						break;
					case 3:
						{
						_localctx = new Expr_ifContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_if);
						setState(1517);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1518);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1519);
						expr_if(16);
						}
						break;
					case 4:
						{
						_localctx = new Expr_ifContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_if);
						setState(1520);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1521);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NOT_EQ1) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1522);
						expr_if(15);
						}
						break;
					case 5:
						{
						_localctx = new Expr_ifContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_if);
						setState(1523);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1524);
						match(K_AND);
						setState(1525);
						expr_if(14);
						}
						break;
					case 6:
						{
						_localctx = new Expr_ifContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_if);
						setState(1526);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1527);
						match(K_OR);
						setState(1528);
						expr_if(13);
						}
						break;
					case 7:
						{
						_localctx = new Expr_ifContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_if);
						setState(1529);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1530);
						match(PIPE2);
						setState(1531);
						expr_if(12);
						}
						break;
					case 8:
						{
						_localctx = new Expr_ifContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_if);
						setState(1532);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1533);
						match(AND);
						setState(1534);
						expr_if(11);
						}
						break;
					}
					} 
				}
				setState(1539);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expr_for_and_operatorContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode PLUS_PLUS() { return getToken(SQLParser.PLUS_PLUS, 0); }
		public TerminalNode MINUS_MINUS() { return getToken(SQLParser.MINUS_MINUS, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Expr_for_and_operatorContext> expr_for_and_operator() {
			return getRuleContexts(Expr_for_and_operatorContext.class);
		}
		public Expr_for_and_operatorContext expr_for_and_operator(int i) {
			return getRuleContext(Expr_for_and_operatorContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public TerminalNode EQ_WITH_PLUS() { return getToken(SQLParser.EQ_WITH_PLUS, 0); }
		public TerminalNode EQ_WITH_MINUS() { return getToken(SQLParser.EQ_WITH_MINUS, 0); }
		public TerminalNode MINUS_WITH_EQ() { return getToken(SQLParser.MINUS_WITH_EQ, 0); }
		public TerminalNode PLUS_WITH_EQ() { return getToken(SQLParser.PLUS_WITH_EQ, 0); }
		public TerminalNode STAR_WITH_EQ() { return getToken(SQLParser.STAR_WITH_EQ, 0); }
		public TerminalNode DIV_WITH_EQ() { return getToken(SQLParser.DIV_WITH_EQ, 0); }
		public Expr_for_and_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_for_and_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpr_for_and_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpr_for_and_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExpr_for_and_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_for_and_operatorContext expr_for_and_operator() throws RecognitionException {
		return expr_for_and_operator(0);
	}

	private Expr_for_and_operatorContext expr_for_and_operator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_for_and_operatorContext _localctx = new Expr_for_and_operatorContext(_ctx, _parentState);
		Expr_for_and_operatorContext _prevctx = _localctx;
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_expr_for_and_operator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1541);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1542);
				any_name();
				}
				break;
			case 3:
				{
				{
				setState(1543);
				any_name();
				setState(1544);
				_la = _input.LA(1);
				if ( !(_la==PLUS_PLUS || _la==MINUS_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case 4:
				{
				{
				setState(1546);
				_la = _input.LA(1);
				if ( !(_la==PLUS_PLUS || _la==MINUS_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1547);
				any_name();
				}
				}
				break;
			case 5:
				{
				setState(1548);
				match(OPEN_PAR);
				setState(1549);
				expr_for_and_operator(0);
				setState(1550);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1559);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_for_and_operatorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr_for_and_operator);
					setState(1554);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1555);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << EQ_WITH_PLUS) | (1L << PLUS_WITH_EQ) | (1L << EQ_WITH_MINUS) | (1L << MINUS_WITH_EQ) | (1L << STAR_WITH_EQ) | (1L << DIV_WITH_EQ))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1556);
					expr_for_and_operator(3);
					}
					} 
				}
				setState(1561);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expr_printContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLParser.DOT, i);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<Expr_printContext> expr_print() {
			return getRuleContexts(Expr_printContext.class);
		}
		public Expr_printContext expr_print(int i) {
			return getRuleContext(Expr_printContext.class,i);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLParser.K_DISTINCT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode OPEN_ARRAY() { return getToken(SQLParser.OPEN_ARRAY, 0); }
		public TerminalNode CLOSE_ARRAY() { return getToken(SQLParser.CLOSE_ARRAY, 0); }
		public Var_operatorContext var_operator() {
			return getRuleContext(Var_operatorContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode PIPE2() { return getToken(SQLParser.PIPE2, 0); }
		public TerminalNode DIV() { return getToken(SQLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SQLParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public TerminalNode LT2() { return getToken(SQLParser.LT2, 0); }
		public TerminalNode GT2() { return getToken(SQLParser.GT2, 0); }
		public TerminalNode AMP() { return getToken(SQLParser.AMP, 0); }
		public TerminalNode PIPE() { return getToken(SQLParser.PIPE, 0); }
		public TerminalNode LT() { return getToken(SQLParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SQLParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SQLParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SQLParser.GT_EQ, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public TerminalNode EQ() { return getToken(SQLParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SQLParser.NOT_EQ1, 0); }
		public TerminalNode NOT_EQ2() { return getToken(SQLParser.NOT_EQ2, 0); }
		public TerminalNode K_IS() { return getToken(SQLParser.K_IS, 0); }
		public TerminalNode K_IN() { return getToken(SQLParser.K_IN, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLParser.K_GLOB, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLParser.K_MATCH, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLParser.K_REGEXP, 0); }
		public TerminalNode K_AND() { return getToken(SQLParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(SQLParser.K_OR, 0); }
		public Expr_printContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpr_print(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpr_print(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExpr_print(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_printContext expr_print() throws RecognitionException {
		return expr_print(0);
	}

	private Expr_printContext expr_print(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_printContext _localctx = new Expr_printContext(_ctx, _parentState);
		Expr_printContext _prevctx = _localctx;
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_expr_print, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1563);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1564);
				any_name();
				}
				break;
			case 3:
				{
				setState(1573);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1568);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
					case 1:
						{
						setState(1565);
						database_name();
						setState(1566);
						match(DOT);
						}
						break;
					}
					setState(1570);
					table_name();
					setState(1571);
					match(DOT);
					}
					break;
				}
				setState(1575);
				column_name();
				}
				break;
			case 4:
				{
				setState(1576);
				unary_operator();
				setState(1577);
				expr_print(15);
				}
				break;
			case 5:
				{
				setState(1579);
				function_name();
				setState(1580);
				match(OPEN_PAR);
				setState(1593);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case OPEN_ARRAY:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DISTINCT:
				case K_EXISTS:
				case K_NOT:
				case K_NULL:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(1582);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_DISTINCT) {
						{
						setState(1581);
						match(K_DISTINCT);
						}
					}

					setState(1584);
					expr_print(0);
					setState(1589);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1585);
						match(COMMA);
						setState(1586);
						expr_print(0);
						}
						}
						setState(1591);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(1592);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(1595);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(1597);
				match(OPEN_PAR);
				setState(1598);
				expr_print(0);
				setState(1599);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(1601);
				match(OPEN_ARRAY);
				setState(1602);
				expr_print(0);
				setState(1603);
				match(CLOSE_ARRAY);
				}
				break;
			case 8:
				{
				setState(1605);
				match(OPEN_ARRAY);
				setState(1606);
				var_operator();
				setState(1607);
				match(CLOSE_ARRAY);
				}
				break;
			case 9:
				{
				setState(1613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(1610);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(1609);
						match(K_NOT);
						}
					}

					setState(1612);
					match(K_EXISTS);
					}
				}

				setState(1615);
				match(OPEN_PAR);
				setState(1616);
				select_stmt();
				setState(1617);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1686);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1684);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_printContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_print);
						setState(1621);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1622);
						match(PIPE2);
						setState(1623);
						expr_print(15);
						}
						break;
					case 2:
						{
						_localctx = new Expr_printContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_print);
						setState(1624);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1625);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1626);
						expr_print(14);
						}
						break;
					case 3:
						{
						_localctx = new Expr_printContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_print);
						setState(1627);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1628);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1629);
						expr_print(13);
						}
						break;
					case 4:
						{
						_localctx = new Expr_printContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_print);
						setState(1630);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1631);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1632);
						expr_print(12);
						}
						break;
					case 5:
						{
						_localctx = new Expr_printContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_print);
						setState(1633);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1634);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1635);
						expr_print(11);
						}
						break;
					case 6:
						{
						_localctx = new Expr_printContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_print);
						setState(1636);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1649);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
						case 1:
							{
							setState(1637);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(1638);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(1639);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(1640);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(1641);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(1642);
							match(K_IS);
							setState(1643);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(1644);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(1645);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(1646);
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(1647);
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(1648);
							match(K_REGEXP);
							}
							break;
						}
						setState(1651);
						expr_print(10);
						}
						break;
					case 7:
						{
						_localctx = new Expr_printContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_print);
						setState(1652);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1653);
						match(K_AND);
						setState(1654);
						expr_print(9);
						}
						break;
					case 8:
						{
						_localctx = new Expr_printContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_print);
						setState(1655);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1656);
						match(K_OR);
						setState(1657);
						expr_print(8);
						}
						break;
					case 9:
						{
						_localctx = new Expr_printContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_print);
						setState(1658);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1660);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1659);
							match(K_NOT);
							}
						}

						setState(1662);
						match(K_IN);
						setState(1682);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
						case 1:
							{
							setState(1663);
							match(OPEN_PAR);
							setState(1673);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case K_SELECT:
							case K_VALUES:
								{
								setState(1664);
								select_stmt();
								}
								break;
							case OPEN_PAR:
							case PLUS:
							case MINUS:
							case TILDE:
							case OPEN_ARRAY:
							case K_CURRENT_DATE:
							case K_CURRENT_TIME:
							case K_CURRENT_TIMESTAMP:
							case K_EXISTS:
							case K_NOT:
							case K_NULL:
							case IDENTIFIER:
							case NUMERIC_LITERAL:
							case STRING_LITERAL:
							case BLOB_LITERAL:
								{
								setState(1665);
								expr_print(0);
								setState(1670);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1666);
									match(COMMA);
									setState(1667);
									expr_print(0);
									}
									}
									setState(1672);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							case CLOSE_PAR:
								break;
							default:
								break;
							}
							setState(1675);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1679);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
							case 1:
								{
								setState(1676);
								database_name();
								setState(1677);
								match(DOT);
								}
								break;
							}
							setState(1681);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1688);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Foreign_key_clauseContext extends ParserRuleContext {
		public TerminalNode K_REFERENCES() { return getToken(SQLParser.K_REFERENCES, 0); }
		public Foreign_tableContext foreign_table() {
			return getRuleContext(Foreign_tableContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Fk_target_column_nameContext> fk_target_column_name() {
			return getRuleContexts(Fk_target_column_nameContext.class);
		}
		public Fk_target_column_nameContext fk_target_column_name(int i) {
			return getRuleContext(Fk_target_column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SQLParser.K_DEFERRABLE, 0); }
		public List<TerminalNode> K_ON() { return getTokens(SQLParser.K_ON); }
		public TerminalNode K_ON(int i) {
			return getToken(SQLParser.K_ON, i);
		}
		public List<TerminalNode> K_MATCH() { return getTokens(SQLParser.K_MATCH); }
		public TerminalNode K_MATCH(int i) {
			return getToken(SQLParser.K_MATCH, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<TerminalNode> K_DELETE() { return getTokens(SQLParser.K_DELETE); }
		public TerminalNode K_DELETE(int i) {
			return getToken(SQLParser.K_DELETE, i);
		}
		public List<TerminalNode> K_UPDATE() { return getTokens(SQLParser.K_UPDATE); }
		public TerminalNode K_UPDATE(int i) {
			return getToken(SQLParser.K_UPDATE, i);
		}
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SQLParser.K_INITIALLY, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLParser.K_IMMEDIATE, 0); }
		public TerminalNode K_ENABLE() { return getToken(SQLParser.K_ENABLE, 0); }
		public List<TerminalNode> K_SET() { return getTokens(SQLParser.K_SET); }
		public TerminalNode K_SET(int i) {
			return getToken(SQLParser.K_SET, i);
		}
		public List<TerminalNode> K_NULL() { return getTokens(SQLParser.K_NULL); }
		public TerminalNode K_NULL(int i) {
			return getToken(SQLParser.K_NULL, i);
		}
		public List<TerminalNode> K_DEFAULT() { return getTokens(SQLParser.K_DEFAULT); }
		public TerminalNode K_DEFAULT(int i) {
			return getToken(SQLParser.K_DEFAULT, i);
		}
		public List<TerminalNode> K_CASCADE() { return getTokens(SQLParser.K_CASCADE); }
		public TerminalNode K_CASCADE(int i) {
			return getToken(SQLParser.K_CASCADE, i);
		}
		public List<TerminalNode> K_RESTRICT() { return getTokens(SQLParser.K_RESTRICT); }
		public TerminalNode K_RESTRICT(int i) {
			return getToken(SQLParser.K_RESTRICT, i);
		}
		public List<TerminalNode> K_NO() { return getTokens(SQLParser.K_NO); }
		public TerminalNode K_NO(int i) {
			return getToken(SQLParser.K_NO, i);
		}
		public List<TerminalNode> K_ACTION() { return getTokens(SQLParser.K_ACTION); }
		public TerminalNode K_ACTION(int i) {
			return getToken(SQLParser.K_ACTION, i);
		}
		public Foreign_key_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_key_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterForeign_key_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitForeign_key_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitForeign_key_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_key_clauseContext foreign_key_clause() throws RecognitionException {
		Foreign_key_clauseContext _localctx = new Foreign_key_clauseContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_foreign_key_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1689);
			match(K_REFERENCES);
			setState(1693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				{
				setState(1690);
				database_name();
				setState(1691);
				match(DOT);
				}
				break;
			}
			setState(1695);
			foreign_table();
			setState(1707);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				{
				setState(1696);
				match(OPEN_PAR);
				setState(1697);
				fk_target_column_name();
				setState(1702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1698);
					match(COMMA);
					setState(1699);
					fk_target_column_name();
					}
					}
					setState(1704);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1705);
				match(CLOSE_PAR);
				}
				break;
			}
			setState(1727);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1723);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_ON:
						{
						setState(1709);
						match(K_ON);
						setState(1710);
						_la = _input.LA(1);
						if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1719);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
						case 1:
							{
							setState(1711);
							match(K_SET);
							setState(1712);
							match(K_NULL);
							}
							break;
						case 2:
							{
							setState(1713);
							match(K_SET);
							setState(1714);
							match(K_DEFAULT);
							}
							break;
						case 3:
							{
							setState(1715);
							match(K_CASCADE);
							}
							break;
						case 4:
							{
							setState(1716);
							match(K_RESTRICT);
							}
							break;
						case 5:
							{
							setState(1717);
							match(K_NO);
							setState(1718);
							match(K_ACTION);
							}
							break;
						}
						}
						break;
					case K_MATCH:
						{
						setState(1721);
						match(K_MATCH);
						setState(1722);
						name();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(1729);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
			}
			setState(1743);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(1731);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1730);
					match(K_NOT);
					}
				}

				setState(1733);
				match(K_DEFERRABLE);
				setState(1738);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
				case 1:
					{
					setState(1734);
					match(K_INITIALLY);
					setState(1735);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1736);
					match(K_INITIALLY);
					setState(1737);
					match(K_IMMEDIATE);
					}
					break;
				}
				setState(1741);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(1740);
					match(K_ENABLE);
					}
					break;
				}
				}
				break;
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

	public static class Fk_target_column_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Fk_target_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fk_target_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFk_target_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFk_target_column_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFk_target_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fk_target_column_nameContext fk_target_column_name() throws RecognitionException {
		Fk_target_column_nameContext _localctx = new Fk_target_column_nameContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_fk_target_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1745);
			name();
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

	public static class Indexed_columnContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SQLParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLParser.K_DESC, 0); }
		public Indexed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIndexed_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIndexed_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIndexed_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indexed_columnContext indexed_column() throws RecognitionException {
		Indexed_columnContext _localctx = new Indexed_columnContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1747);
			column_name();
			setState(1750);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1748);
				match(K_COLLATE);
				setState(1749);
				collation_name();
				}
			}

			setState(1753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1752);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
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

	public static class Table_constraintContext extends ParserRuleContext {
		public Table_constraint_primary_keyContext table_constraint_primary_key() {
			return getRuleContext(Table_constraint_primary_keyContext.class,0);
		}
		public Table_constraint_keyContext table_constraint_key() {
			return getRuleContext(Table_constraint_keyContext.class,0);
		}
		public Table_constraint_uniqueContext table_constraint_unique() {
			return getRuleContext(Table_constraint_uniqueContext.class,0);
		}
		public TerminalNode K_CHECK() { return getToken(SQLParser.K_CHECK, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Table_constraint_foreign_keyContext table_constraint_foreign_key() {
			return getRuleContext(Table_constraint_foreign_keyContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SQLParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1755);
				match(K_CONSTRAINT);
				setState(1756);
				name();
				}
			}

			setState(1768);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1759);
				table_constraint_primary_key();
				}
				break;
			case K_KEY:
				{
				setState(1760);
				table_constraint_key();
				}
				break;
			case K_UNIQUE:
				{
				setState(1761);
				table_constraint_unique();
				}
				break;
			case K_CHECK:
				{
				setState(1762);
				match(K_CHECK);
				setState(1763);
				match(OPEN_PAR);
				setState(1764);
				expr(0);
				setState(1765);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1767);
				table_constraint_foreign_key();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Table_constraint_primary_keyContext extends ParserRuleContext {
		public TerminalNode K_PRIMARY() { return getToken(SQLParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Table_constraint_primary_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_primary_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint_primary_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint_primary_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint_primary_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_primary_keyContext table_constraint_primary_key() throws RecognitionException {
		Table_constraint_primary_keyContext _localctx = new Table_constraint_primary_keyContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_table_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1770);
			match(K_PRIMARY);
			setState(1771);
			match(K_KEY);
			setState(1772);
			match(OPEN_PAR);
			setState(1773);
			indexed_column();
			setState(1778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1774);
				match(COMMA);
				setState(1775);
				indexed_column();
				}
				}
				setState(1780);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1781);
			match(CLOSE_PAR);
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

	public static class Table_constraint_foreign_keyContext extends ParserRuleContext {
		public TerminalNode K_FOREIGN() { return getToken(SQLParser.K_FOREIGN, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Fk_origin_column_nameContext> fk_origin_column_name() {
			return getRuleContexts(Fk_origin_column_nameContext.class);
		}
		public Fk_origin_column_nameContext fk_origin_column_name(int i) {
			return getRuleContext(Fk_origin_column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Table_constraint_foreign_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_foreign_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint_foreign_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint_foreign_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint_foreign_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_foreign_keyContext table_constraint_foreign_key() throws RecognitionException {
		Table_constraint_foreign_keyContext _localctx = new Table_constraint_foreign_keyContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_table_constraint_foreign_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1783);
			match(K_FOREIGN);
			setState(1784);
			match(K_KEY);
			setState(1785);
			match(OPEN_PAR);
			setState(1786);
			fk_origin_column_name();
			setState(1791);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1787);
				match(COMMA);
				setState(1788);
				fk_origin_column_name();
				}
				}
				setState(1793);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1794);
			match(CLOSE_PAR);
			setState(1795);
			foreign_key_clause();
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

	public static class Table_constraint_uniqueContext extends ParserRuleContext {
		public TerminalNode K_UNIQUE() { return getToken(SQLParser.K_UNIQUE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Table_constraint_uniqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_unique; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint_unique(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint_unique(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint_unique(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_uniqueContext table_constraint_unique() throws RecognitionException {
		Table_constraint_uniqueContext _localctx = new Table_constraint_uniqueContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_table_constraint_unique);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1797);
			match(K_UNIQUE);
			setState(1799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_KEY) {
				{
				setState(1798);
				match(K_KEY);
				}
			}

			setState(1802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				{
				setState(1801);
				name();
				}
				break;
			}
			setState(1804);
			match(OPEN_PAR);
			setState(1805);
			indexed_column();
			setState(1810);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1806);
				match(COMMA);
				setState(1807);
				indexed_column();
				}
				}
				setState(1812);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1813);
			match(CLOSE_PAR);
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

	public static class Table_constraint_keyContext extends ParserRuleContext {
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Table_constraint_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_keyContext table_constraint_key() throws RecognitionException {
		Table_constraint_keyContext _localctx = new Table_constraint_keyContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_table_constraint_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1815);
			match(K_KEY);
			setState(1817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				{
				setState(1816);
				name();
				}
				break;
			}
			setState(1819);
			match(OPEN_PAR);
			setState(1820);
			indexed_column();
			setState(1825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1821);
				match(COMMA);
				setState(1822);
				indexed_column();
				}
				}
				setState(1827);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1828);
			match(CLOSE_PAR);
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

	public static class Fk_origin_column_nameContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Fk_origin_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fk_origin_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFk_origin_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFk_origin_column_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFk_origin_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fk_origin_column_nameContext fk_origin_column_name() throws RecognitionException {
		Fk_origin_column_nameContext _localctx = new Fk_origin_column_nameContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_fk_origin_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1830);
			column_name();
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

	public static class Qualified_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public TerminalNode K_INDEXED() { return getToken(SQLParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public Qualified_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterQualified_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitQualified_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitQualified_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_table_nameContext qualified_table_name() throws RecognitionException {
		Qualified_table_nameContext _localctx = new Qualified_table_nameContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1835);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				{
				setState(1832);
				database_name();
				setState(1833);
				match(DOT);
				}
				break;
			}
			setState(1837);
			table_name();
			setState(1843);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				{
				setState(1838);
				match(K_INDEXED);
				setState(1839);
				match(K_BY);
				setState(1840);
				index_name();
				}
				break;
			case 2:
				{
				setState(1841);
				match(K_NOT);
				setState(1842);
				match(K_INDEXED);
				}
				break;
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

	public static class Ordering_termContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SQLParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLParser.K_DESC, 0); }
		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterOrdering_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitOrdering_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitOrdering_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordering_termContext ordering_term() throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1845);
			expr(0);
			setState(1847);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				{
				setState(1846);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
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

	public static class Pragma_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public Pragma_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterPragma_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitPragma_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitPragma_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_valueContext pragma_value() throws RecognitionException {
		Pragma_valueContext _localctx = new Pragma_valueContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_pragma_value);
		try {
			setState(1852);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1849);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1850);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1851);
				match(STRING_LITERAL);
				}
				break;
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

	public static class Common_table_expressionContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCommon_table_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCommon_table_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCommon_table_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1854);
			table_name();
			setState(1866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1855);
				match(OPEN_PAR);
				setState(1856);
				column_name();
				setState(1861);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1857);
					match(COMMA);
					setState(1858);
					column_name();
					}
					}
					setState(1863);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1864);
				match(CLOSE_PAR);
				}
			}

			setState(1868);
			match(K_AS);
			setState(1869);
			match(OPEN_PAR);
			setState(1870);
			select_stmt();
			setState(1871);
			match(CLOSE_PAR);
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

	public static class Result_columnContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitResult_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitResult_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_result_column);
		int _la;
		try {
			setState(1885);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1873);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1874);
				table_name();
				setState(1875);
				match(DOT);
				setState(1876);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1878);
				expr(0);
				setState(1883);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
				case 1:
					{
					setState(1880);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1879);
						match(K_AS);
						}
					}

					setState(1882);
					column_alias();
					}
					break;
				}
				}
				break;
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

	public static class Table_or_subqueryContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode K_INDEXED() { return getToken(SQLParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_or_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_or_subquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_or_subquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_table_or_subquery);
		int _la;
		try {
			setState(1934);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1890);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
				case 1:
					{
					setState(1887);
					database_name();
					setState(1888);
					match(DOT);
					}
					break;
				}
				setState(1892);
				table_name();
				setState(1897);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
				case 1:
					{
					setState(1894);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1893);
						match(K_AS);
						}
					}

					setState(1896);
					table_alias();
					}
					break;
				}
				setState(1904);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
				case 1:
					{
					setState(1899);
					match(K_INDEXED);
					setState(1900);
					match(K_BY);
					setState(1901);
					index_name();
					}
					break;
				case 2:
					{
					setState(1902);
					match(K_NOT);
					setState(1903);
					match(K_INDEXED);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1906);
				match(OPEN_PAR);
				setState(1916);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
				case 1:
					{
					setState(1907);
					table_or_subquery();
					setState(1912);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1908);
						match(COMMA);
						setState(1909);
						table_or_subquery();
						}
						}
						setState(1914);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1915);
					join_clause();
					}
					break;
				}
				setState(1918);
				match(CLOSE_PAR);
				setState(1923);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
				case 1:
					{
					setState(1920);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1919);
						match(K_AS);
						}
					}

					setState(1922);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1925);
				match(OPEN_PAR);
				setState(1926);
				select_stmt();
				setState(1927);
				match(CLOSE_PAR);
				setState(1932);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
				case 1:
					{
					setState(1929);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1928);
						match(K_AS);
						}
					}

					setState(1931);
					table_alias();
					}
					break;
				}
				}
				break;
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

	public static class Join_clauseContext extends ParserRuleContext {
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public List<Join_operatorContext> join_operator() {
			return getRuleContexts(Join_operatorContext.class);
		}
		public Join_operatorContext join_operator(int i) {
			return getRuleContext(Join_operatorContext.class,i);
		}
		public List<Join_constraintContext> join_constraint() {
			return getRuleContexts(Join_constraintContext.class);
		}
		public Join_constraintContext join_constraint(int i) {
			return getRuleContext(Join_constraintContext.class,i);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJoin_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJoin_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_join_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1936);
			table_or_subquery();
			setState(1943);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1937);
					join_operator();
					setState(1938);
					table_or_subquery();
					setState(1939);
					join_constraint();
					}
					} 
				}
				setState(1945);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
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

	public static class Join_operatorContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public TerminalNode K_JOIN() { return getToken(SQLParser.K_JOIN, 0); }
		public TerminalNode K_LEFT() { return getToken(SQLParser.K_LEFT, 0); }
		public TerminalNode K_INNER() { return getToken(SQLParser.K_INNER, 0); }
		public TerminalNode K_OUTER() { return getToken(SQLParser.K_OUTER, 0); }
		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJoin_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJoin_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJoin_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_operatorContext join_operator() throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_join_operator);
		int _la;
		try {
			setState(1955);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1946);
				match(COMMA);
				}
				break;
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1952);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1947);
					match(K_LEFT);
					setState(1949);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1948);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1951);
					match(K_INNER);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(1954);
				match(K_JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Join_constraintContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(SQLParser.K_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Join_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJoin_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJoin_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJoin_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_join_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1959);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				{
				setState(1957);
				match(K_ON);
				setState(1958);
				expr(0);
				}
				break;
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

	public static class Select_coreContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SQLParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_FROM() { return getToken(SQLParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SQLParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SQLParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SQLParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
		}
		public Select_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_core; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSelect_core(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSelect_core(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSelect_core(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_coreContext select_core() throws RecognitionException {
		Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_select_core);
		int _la;
		try {
			int _alt;
			setState(2035);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1961);
				match(K_SELECT);
				setState(1963);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(1962);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1965);
				result_column();
				setState(1970);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1966);
						match(COMMA);
						setState(1967);
						result_column();
						}
						} 
					}
					setState(1972);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
				}
				setState(1985);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
				case 1:
					{
					setState(1973);
					match(K_FROM);
					setState(1983);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
					case 1:
						{
						setState(1974);
						table_or_subquery();
						setState(1979);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1975);
								match(COMMA);
								setState(1976);
								table_or_subquery();
								}
								} 
							}
							setState(1981);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
						}
						}
						break;
					case 2:
						{
						setState(1982);
						join_clause();
						}
						break;
					}
					}
					break;
				}
				setState(1989);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
				case 1:
					{
					setState(1987);
					match(K_WHERE);
					setState(1988);
					expr(0);
					}
					break;
				}
				setState(2005);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
				case 1:
					{
					setState(1991);
					match(K_GROUP);
					setState(1992);
					match(K_BY);
					setState(1993);
					expr(0);
					setState(1998);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1994);
							match(COMMA);
							setState(1995);
							expr(0);
							}
							} 
						}
						setState(2000);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
					}
					setState(2003);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
					case 1:
						{
						setState(2001);
						match(K_HAVING);
						setState(2002);
						expr(0);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(2007);
				match(K_VALUES);
				setState(2008);
				match(OPEN_PAR);
				setState(2009);
				expr(0);
				setState(2014);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2010);
					match(COMMA);
					setState(2011);
					expr(0);
					}
					}
					setState(2016);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2017);
				match(CLOSE_PAR);
				setState(2032);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,262,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2018);
						match(COMMA);
						setState(2019);
						match(OPEN_PAR);
						setState(2020);
						expr(0);
						setState(2025);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(2021);
							match(COMMA);
							setState(2022);
							expr(0);
							}
							}
							setState(2027);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2028);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(2034);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,262,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Cte_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Cte_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCte_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCte_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCte_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_table_nameContext cte_table_name() throws RecognitionException {
		Cte_table_nameContext _localctx = new Cte_table_nameContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2037);
			table_name();
			setState(2049);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(2038);
				match(OPEN_PAR);
				setState(2039);
				column_name();
				setState(2044);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2040);
					match(COMMA);
					setState(2041);
					column_name();
					}
					}
					setState(2046);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2047);
				match(CLOSE_PAR);
				}
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

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSigned_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2056);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMERIC_LITERAL:
				{
				setState(2052);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(2051);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(2054);
				match(NUMERIC_LITERAL);
				}
				break;
			case STAR:
				{
				setState(2055);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(SQLParser.BLOB_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SQLParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SQLParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SQLParser.K_CURRENT_TIMESTAMP, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2058);
			_la = _input.LA(1);
			if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (K_CURRENT_DATE - 69)) | (1L << (K_CURRENT_TIME - 69)) | (1L << (K_CURRENT_TIMESTAMP - 69)) | (1L << (K_NULL - 69)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (NUMERIC_LITERAL - 179)) | (1L << (STRING_LITERAL - 179)) | (1L << (BLOB_LITERAL - 179)))) != 0)) ) {
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SQLParser.TILDE, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2060);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0) || _la==K_NOT) ) {
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

	public static class Error_messageContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public Error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterError_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitError_message(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitError_message(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_messageContext error_message() throws RecognitionException {
		Error_messageContext _localctx = new Error_messageContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2062);
			match(STRING_LITERAL);
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

	public static class Module_argumentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Module_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterModule_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitModule_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitModule_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_argumentContext module_argument() throws RecognitionException {
		Module_argumentContext _localctx = new Module_argumentContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_module_argument);
		try {
			setState(2066);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2064);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2065);
				column_def();
				}
				break;
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

	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2068);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode K_ABORT() { return getToken(SQLParser.K_ABORT, 0); }
		public TerminalNode K_ACTION() { return getToken(SQLParser.K_ACTION, 0); }
		public TerminalNode K_ADD() { return getToken(SQLParser.K_ADD, 0); }
		public TerminalNode K_AFTER() { return getToken(SQLParser.K_AFTER, 0); }
		public TerminalNode K_ALL() { return getToken(SQLParser.K_ALL, 0); }
		public TerminalNode K_ALTER() { return getToken(SQLParser.K_ALTER, 0); }
		public TerminalNode K_ANALYZE() { return getToken(SQLParser.K_ANALYZE, 0); }
		public TerminalNode K_AND() { return getToken(SQLParser.K_AND, 0); }
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public TerminalNode K_ASC() { return getToken(SQLParser.K_ASC, 0); }
		public TerminalNode K_ATTACH() { return getToken(SQLParser.K_ATTACH, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(SQLParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_BEFORE() { return getToken(SQLParser.K_BEFORE, 0); }
		public TerminalNode K_BEGIN() { return getToken(SQLParser.K_BEGIN, 0); }
		public TerminalNode K_BETWEEN() { return getToken(SQLParser.K_BETWEEN, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public TerminalNode K_CASCADE() { return getToken(SQLParser.K_CASCADE, 0); }
		public TerminalNode K_CASE() { return getToken(SQLParser.K_CASE, 0); }
		public TerminalNode K_CAST() { return getToken(SQLParser.K_CAST, 0); }
		public TerminalNode K_CHECK() { return getToken(SQLParser.K_CHECK, 0); }
		public TerminalNode K_COLLATE() { return getToken(SQLParser.K_COLLATE, 0); }
		public TerminalNode K_COLUMN() { return getToken(SQLParser.K_COLUMN, 0); }
		public TerminalNode K_COMMIT() { return getToken(SQLParser.K_COMMIT, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SQLParser.K_CONFLICT, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SQLParser.K_CONSTRAINT, 0); }
		public TerminalNode K_CREATE() { return getToken(SQLParser.K_CREATE, 0); }
		public TerminalNode K_CROSS() { return getToken(SQLParser.K_CROSS, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SQLParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SQLParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SQLParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_DATABASE() { return getToken(SQLParser.K_DATABASE, 0); }
		public TerminalNode K_DEFAULT() { return getToken(SQLParser.K_DEFAULT, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SQLParser.K_DEFERRABLE, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLParser.K_DEFERRED, 0); }
		public TerminalNode K_DELETE() { return getToken(SQLParser.K_DELETE, 0); }
		public TerminalNode K_DESC() { return getToken(SQLParser.K_DESC, 0); }
		public TerminalNode K_DETACH() { return getToken(SQLParser.K_DETACH, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLParser.K_DISTINCT, 0); }
		public TerminalNode K_DROP() { return getToken(SQLParser.K_DROP, 0); }
		public TerminalNode K_EACH() { return getToken(SQLParser.K_EACH, 0); }
		public TerminalNode K_ELSE() { return getToken(SQLParser.K_ELSE, 0); }
		public TerminalNode K_END() { return getToken(SQLParser.K_END, 0); }
		public TerminalNode K_ENABLE() { return getToken(SQLParser.K_ENABLE, 0); }
		public TerminalNode K_ESCAPE() { return getToken(SQLParser.K_ESCAPE, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SQLParser.K_EXCEPT, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(SQLParser.K_EXCLUSIVE, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public TerminalNode K_EXPLAIN() { return getToken(SQLParser.K_EXPLAIN, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLParser.K_FAIL, 0); }
		public TerminalNode K_FOR() { return getToken(SQLParser.K_FOR, 0); }
		public TerminalNode K_FOREIGN() { return getToken(SQLParser.K_FOREIGN, 0); }
		public TerminalNode K_FROM() { return getToken(SQLParser.K_FROM, 0); }
		public TerminalNode K_FULL() { return getToken(SQLParser.K_FULL, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLParser.K_GLOB, 0); }
		public TerminalNode K_GROUP() { return getToken(SQLParser.K_GROUP, 0); }
		public TerminalNode K_HAVING() { return getToken(SQLParser.K_HAVING, 0); }
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLParser.K_IGNORE, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLParser.K_IMMEDIATE, 0); }
		public TerminalNode K_IN() { return getToken(SQLParser.K_IN, 0); }
		public TerminalNode K_INDEX() { return getToken(SQLParser.K_INDEX, 0); }
		public TerminalNode K_INDEXED() { return getToken(SQLParser.K_INDEXED, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SQLParser.K_INITIALLY, 0); }
		public TerminalNode K_INNER() { return getToken(SQLParser.K_INNER, 0); }
		public TerminalNode K_INSERT() { return getToken(SQLParser.K_INSERT, 0); }
		public TerminalNode K_INSTEAD() { return getToken(SQLParser.K_INSTEAD, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SQLParser.K_INTERSECT, 0); }
		public TerminalNode K_INTO() { return getToken(SQLParser.K_INTO, 0); }
		public TerminalNode K_IS() { return getToken(SQLParser.K_IS, 0); }
		public TerminalNode K_ISNULL() { return getToken(SQLParser.K_ISNULL, 0); }
		public TerminalNode K_JOIN() { return getToken(SQLParser.K_JOIN, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode K_LEFT() { return getToken(SQLParser.K_LEFT, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLParser.K_LIKE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SQLParser.K_LIMIT, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLParser.K_MATCH, 0); }
		public TerminalNode K_NATURAL() { return getToken(SQLParser.K_NATURAL, 0); }
		public TerminalNode K_NO() { return getToken(SQLParser.K_NO, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SQLParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public TerminalNode K_OF() { return getToken(SQLParser.K_OF, 0); }
		public TerminalNode K_OFFSET() { return getToken(SQLParser.K_OFFSET, 0); }
		public TerminalNode K_ON() { return getToken(SQLParser.K_ON, 0); }
		public TerminalNode K_OR() { return getToken(SQLParser.K_OR, 0); }
		public TerminalNode K_ORDER() { return getToken(SQLParser.K_ORDER, 0); }
		public TerminalNode K_OUTER() { return getToken(SQLParser.K_OUTER, 0); }
		public TerminalNode K_PLAN() { return getToken(SQLParser.K_PLAN, 0); }
		public TerminalNode K_PRAGMA() { return getToken(SQLParser.K_PRAGMA, 0); }
		public TerminalNode K_PRIMARY() { return getToken(SQLParser.K_PRIMARY, 0); }
		public TerminalNode K_QUERY() { return getToken(SQLParser.K_QUERY, 0); }
		public TerminalNode K_RAISE() { return getToken(SQLParser.K_RAISE, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(SQLParser.K_RECURSIVE, 0); }
		public TerminalNode K_REFERENCES() { return getToken(SQLParser.K_REFERENCES, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLParser.K_REGEXP, 0); }
		public TerminalNode K_REINDEX() { return getToken(SQLParser.K_REINDEX, 0); }
		public TerminalNode K_RELEASE() { return getToken(SQLParser.K_RELEASE, 0); }
		public TerminalNode K_RENAME() { return getToken(SQLParser.K_RENAME, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLParser.K_REPLACE, 0); }
		public TerminalNode K_RESTRICT() { return getToken(SQLParser.K_RESTRICT, 0); }
		public TerminalNode K_RIGHT() { return getToken(SQLParser.K_RIGHT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLParser.K_ROLLBACK, 0); }
		public TerminalNode K_ROW() { return getToken(SQLParser.K_ROW, 0); }
		public TerminalNode K_SAVEPOINT() { return getToken(SQLParser.K_SAVEPOINT, 0); }
		public TerminalNode K_SELECT() { return getToken(SQLParser.K_SELECT, 0); }
		public TerminalNode K_SET() { return getToken(SQLParser.K_SET, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public TerminalNode K_TEMP() { return getToken(SQLParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLParser.K_TEMPORARY, 0); }
		public TerminalNode K_THEN() { return getToken(SQLParser.K_THEN, 0); }
		public TerminalNode K_TO() { return getToken(SQLParser.K_TO, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLParser.K_TRANSACTION, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SQLParser.K_TRIGGER, 0); }
		public TerminalNode K_UNION() { return getToken(SQLParser.K_UNION, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLParser.K_UNIQUE, 0); }
		public TerminalNode K_UPDATE() { return getToken(SQLParser.K_UPDATE, 0); }
		public TerminalNode K_USING() { return getToken(SQLParser.K_USING, 0); }
		public TerminalNode K_VACUUM() { return getToken(SQLParser.K_VACUUM, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLParser.K_VALUES, 0); }
		public TerminalNode K_VIEW() { return getToken(SQLParser.K_VIEW, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(SQLParser.K_VIRTUAL, 0); }
		public TerminalNode K_WHEN() { return getToken(SQLParser.K_WHEN, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public TerminalNode K_WITH() { return getToken(SQLParser.K_WITH, 0); }
		public TerminalNode K_WITHOUT() { return getToken(SQLParser.K_WITHOUT, 0); }
		public TerminalNode K_NEXTVAL() { return getToken(SQLParser.K_NEXTVAL, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2070);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)))) != 0)) ) {
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

	public static class UnknownContext extends ParserRuleContext {
		public UnknownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unknown; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterUnknown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitUnknown(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitUnknown(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnknownContext unknown() throws RecognitionException {
		UnknownContext _localctx = new UnknownContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_unknown);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2073); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2072);
					matchWildcard();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2075); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,269,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2077);
			any_name();
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

	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2079);
			any_name();
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

	public static class Database_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDatabase_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2081);
			any_name();
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

	public static class Source_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Source_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSource_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSource_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSource_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Source_table_nameContext source_table_name() throws RecognitionException {
		Source_table_nameContext _localctx = new Source_table_nameContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_source_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2083);
			any_name();
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

	public static class Table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2085);
			any_name();
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

	public static class Table_or_index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_or_index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_or_index_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_or_index_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_or_index_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_index_nameContext table_or_index_name() throws RecognitionException {
		Table_or_index_nameContext _localctx = new Table_or_index_nameContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2087);
			any_name();
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

	public static class New_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public New_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterNew_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitNew_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitNew_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_table_nameContext new_table_name() throws RecognitionException {
		New_table_nameContext _localctx = new New_table_nameContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2089);
			any_name();
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

	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2091);
			any_name();
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

	public static class Collation_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCollation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCollation_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCollation_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2093);
			any_name();
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

	public static class Foreign_tableContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Foreign_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterForeign_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitForeign_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitForeign_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_tableContext foreign_table() throws RecognitionException {
		Foreign_tableContext _localctx = new Foreign_tableContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2095);
			any_name();
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

	public static class Index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIndex_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIndex_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2097);
			any_name();
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

	public static class Trigger_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Trigger_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTrigger_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTrigger_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTrigger_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trigger_nameContext trigger_name() throws RecognitionException {
		Trigger_nameContext _localctx = new Trigger_nameContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2099);
			any_name();
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

	public static class View_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterView_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitView_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitView_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2101);
			any_name();
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

	public static class Module_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Module_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterModule_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitModule_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitModule_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_nameContext module_name() throws RecognitionException {
		Module_nameContext _localctx = new Module_nameContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2103);
			any_name();
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

	public static class Pragma_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Pragma_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterPragma_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitPragma_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitPragma_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_nameContext pragma_name() throws RecognitionException {
		Pragma_nameContext _localctx = new Pragma_nameContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2105);
			any_name();
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

	public static class Savepoint_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Savepoint_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSavepoint_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSavepoint_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSavepoint_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_nameContext savepoint_name() throws RecognitionException {
		Savepoint_nameContext _localctx = new Savepoint_nameContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2107);
			any_name();
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

	public static class Table_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2109);
			any_name();
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

	public static class Transaction_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Transaction_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTransaction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTransaction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTransaction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Transaction_nameContext transaction_name() throws RecognitionException {
		Transaction_nameContext _localctx = new Transaction_nameContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2111);
			any_name();
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

	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAny_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_any_name);
		try {
			setState(2119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2113);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2114);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(2115);
				match(OPEN_PAR);
				setState(2116);
				any_name();
				setState(2117);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Any_name_identifier_jsonContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_JSON_ARRAY() { return getToken(SQLParser.IDENTIFIER_JSON_ARRAY, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Any_name_identifier_jsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name_identifier_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAny_name_identifier_json(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAny_name_identifier_json(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAny_name_identifier_json(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_name_identifier_jsonContext any_name_identifier_json() throws RecognitionException {
		Any_name_identifier_jsonContext _localctx = new Any_name_identifier_jsonContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_any_name_identifier_json);
		try {
			setState(2128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER_JSON_ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(2121);
				match(IDENTIFIER_JSON_ARRAY);
				}
				break;
			case K_ABORT:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_ALL:
			case K_ALTER:
			case K_ANALYZE:
			case K_AND:
			case K_AS:
			case K_ASC:
			case K_ATTACH:
			case K_AUTOINCREMENT:
			case K_BEFORE:
			case K_BEGIN:
			case K_BETWEEN:
			case K_BY:
			case K_CASCADE:
			case K_CASE:
			case K_CAST:
			case K_CHECK:
			case K_COLLATE:
			case K_COLUMN:
			case K_COMMIT:
			case K_CONFLICT:
			case K_CONSTRAINT:
			case K_CREATE:
			case K_CROSS:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DATABASE:
			case K_DEFAULT:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DELETE:
			case K_DESC:
			case K_DETACH:
			case K_DISTINCT:
			case K_DROP:
			case K_EACH:
			case K_ELSE:
			case K_END:
			case K_ENABLE:
			case K_ESCAPE:
			case K_EXCEPT:
			case K_EXCLUSIVE:
			case K_EXISTS:
			case K_EXPLAIN:
			case K_FAIL:
			case K_FOR:
			case K_FOREIGN:
			case K_FROM:
			case K_FULL:
			case K_GLOB:
			case K_GROUP:
			case K_HAVING:
			case K_IF:
			case K_IGNORE:
			case K_IMMEDIATE:
			case K_IN:
			case K_INDEX:
			case K_INDEXED:
			case K_INITIALLY:
			case K_INNER:
			case K_INSERT:
			case K_INSTEAD:
			case K_INTERSECT:
			case K_INTO:
			case K_IS:
			case K_ISNULL:
			case K_JOIN:
			case K_KEY:
			case K_LEFT:
			case K_LIKE:
			case K_LIMIT:
			case K_MATCH:
			case K_NATURAL:
			case K_NEXTVAL:
			case K_NO:
			case K_NOT:
			case K_NOTNULL:
			case K_NULL:
			case K_OF:
			case K_OFFSET:
			case K_ON:
			case K_OR:
			case K_ORDER:
			case K_OUTER:
			case K_PLAN:
			case K_PRAGMA:
			case K_PRIMARY:
			case K_QUERY:
			case K_RAISE:
			case K_RECURSIVE:
			case K_REFERENCES:
			case K_REGEXP:
			case K_REINDEX:
			case K_RELEASE:
			case K_RENAME:
			case K_REPLACE:
			case K_RESTRICT:
			case K_RIGHT:
			case K_ROLLBACK:
			case K_ROW:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_TABLE:
			case K_TEMP:
			case K_TEMPORARY:
			case K_THEN:
			case K_TO:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_UNION:
			case K_UNIQUE:
			case K_UPDATE:
			case K_USING:
			case K_VACUUM:
			case K_VALUES:
			case K_VIEW:
			case K_VIRTUAL:
			case K_WHEN:
			case K_WHERE:
			case K_WITH:
			case K_WITHOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2122);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2123);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(2124);
				match(OPEN_PAR);
				setState(2125);
				any_name();
				setState(2126);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 55:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 56:
			return expr_while_sempred((Expr_whileContext)_localctx, predIndex);
		case 57:
			return expr_if_sempred((Expr_ifContext)_localctx, predIndex);
		case 58:
			return expr_for_and_operator_sempred((Expr_for_and_operatorContext)_localctx, predIndex);
		case 59:
			return expr_print_sempred((Expr_printContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean expr_while_sempred(Expr_whileContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 16);
		case 10:
			return precpred(_ctx, 15);
		case 11:
			return precpred(_ctx, 14);
		case 12:
			return precpred(_ctx, 13);
		case 13:
			return precpred(_ctx, 12);
		case 14:
			return precpred(_ctx, 11);
		case 15:
			return precpred(_ctx, 10);
		case 16:
			return precpred(_ctx, 9);
		}
		return true;
	}
	private boolean expr_if_sempred(Expr_ifContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 17);
		case 18:
			return precpred(_ctx, 16);
		case 19:
			return precpred(_ctx, 15);
		case 20:
			return precpred(_ctx, 14);
		case 21:
			return precpred(_ctx, 13);
		case 22:
			return precpred(_ctx, 12);
		case 23:
			return precpred(_ctx, 11);
		case 24:
			return precpred(_ctx, 10);
		}
		return true;
	}
	private boolean expr_for_and_operator_sempred(Expr_for_and_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_print_sempred(Expr_printContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 14);
		case 27:
			return precpred(_ctx, 13);
		case 28:
			return precpred(_ctx, 12);
		case 29:
			return precpred(_ctx, 11);
		case 30:
			return precpred(_ctx, 10);
		case 31:
			return precpred(_ctx, 9);
		case 32:
			return precpred(_ctx, 8);
		case 33:
			return precpred(_ctx, 7);
		case 34:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00bc\u0855\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\3\2\3\2\3\2\7\2\u00de\n\2\f\2\16\2\u00e1\13\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\4\7\4\u00e9\n\4\f\4\16\4\u00ec\13\4\3\4\3\4\6\4\u00f0\n\4"+
		"\r\4\16\4\u00f1\3\4\7\4\u00f5\n\4\f\4\16\4\u00f8\13\4\3\4\7\4\u00fb\n"+
		"\4\f\4\16\4\u00fe\13\4\3\5\3\5\3\5\5\5\u0103\n\5\5\5\u0105\n\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u010f\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0117"+
		"\n\6\3\7\5\7\u011a\n\7\3\7\5\7\u011d\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7"+
		"\7\u0126\n\7\f\7\16\7\u0129\13\7\5\7\u012b\n\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u013d\n\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\7\b\u0147\n\b\f\b\16\b\u014a\13\b\3\b\5\b\u014d\n\b\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u0154\n\t\3\t\3\t\3\t\3\t\7\t\u015a\n\t\f\t\16"+
		"\t\u015d\13\t\5\t\u015f\n\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\7\13\u016c\n\13\f\13\16\13\u016f\13\13\3\f\5\f\u0172\n\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\7\r\u017c\n\r\f\r\16\r\u017f\13\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u018a\n\16\3\16\7\16\u018d\n\16\f"+
		"\16\16\16\u0190\13\16\3\16\5\16\u0193\n\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\5\17\u019f\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u01a7\n\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u01af\n\21\f\21\16"+
		"\21\u01b2\13\21\3\21\3\21\3\21\7\21\u01b7\n\21\f\21\16\21\u01ba\13\21"+
		"\3\21\3\21\7\21\u01be\n\21\f\21\16\21\u01c1\13\21\3\21\3\21\7\21\u01c5"+
		"\n\21\f\21\16\21\u01c8\13\21\3\21\3\21\7\21\u01cc\n\21\f\21\16\21\u01cf"+
		"\13\21\3\21\7\21\u01d2\n\21\f\21\16\21\u01d5\13\21\5\21\u01d7\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u01e2\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25"+
		"\u01f4\n\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01fc\n\25\3\26\5\26\u01ff"+
		"\n\26\3\26\5\26\u0202\n\26\3\26\3\26\3\26\3\26\5\26\u0208\n\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u0213\n\30\3\30\3\30\3\31"+
		"\5\31\u0218\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0221\n\31\3"+
		"\31\7\31\u0224\n\31\f\31\16\31\u0227\13\31\3\31\3\31\3\31\3\31\5\31\u022d"+
		"\n\31\3\31\3\31\3\31\5\31\u0232\n\31\7\31\u0234\n\31\f\31\16\31\u0237"+
		"\13\31\3\31\3\31\7\31\u023b\n\31\f\31\16\31\u023e\13\31\3\31\3\31\3\31"+
		"\3\31\5\31\u0244\n\31\3\31\3\31\3\31\5\31\u0249\n\31\7\31\u024b\n\31\f"+
		"\31\16\31\u024e\13\31\3\31\3\31\7\31\u0252\n\31\f\31\16\31\u0255\13\31"+
		"\3\31\3\31\5\31\u0259\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u0263\n\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u026b\n\32\3\32\3\32\7"+
		"\32\u026f\n\32\f\32\16\32\u0272\13\32\5\32\u0274\n\32\3\32\3\32\5\32\u0278"+
		"\n\32\7\32\u027a\n\32\f\32\16\32\u027d\13\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u0286\n\32\3\32\3\32\7\32\u028a\n\32\f\32\16\32\u028d"+
		"\13\32\5\32\u028f\n\32\3\32\3\32\5\32\u0293\n\32\5\32\u0295\n\32\3\32"+
		"\3\32\3\33\3\33\3\33\5\33\u029c\n\33\3\33\3\33\3\33\7\33\u02a1\n\33\f"+
		"\33\16\33\u02a4\13\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u02ac\n\33\f"+
		"\33\16\33\u02af\13\33\5\33\u02b1\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\34\3\34\5\34\u02be\n\34\3\34\3\34\3\34\3\34\7\34\u02c4"+
		"\n\34\f\34\16\34\u02c7\13\34\5\34\u02c9\n\34\3\34\3\34\3\34\3\35\5\35"+
		"\u02cf\n\35\3\35\3\35\5\35\u02d3\n\35\3\35\3\35\3\35\3\35\3\35\3\35\7"+
		"\35\u02db\n\35\f\35\16\35\u02de\13\35\5\35\u02e0\n\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\36\5\36\u02e8\n\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u02f0"+
		"\n\36\f\36\16\36\u02f3\13\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u02fc"+
		"\n\37\3 \3 \5 \u0300\n \3 \3 \3 \3 \7 \u0306\n \f \16 \u0309\13 \3 \3"+
		" \5 \u030d\n \3!\3!\3!\3!\3!\3!\3!\7!\u0316\n!\f!\16!\u0319\13!\3!\3!"+
		"\3!\7!\u031e\n!\f!\16!\u0321\13!\7!\u0323\n!\f!\16!\u0326\13!\3!\3!\5"+
		"!\u032a\n!\3\"\3\"\3\"\7\"\u032f\n\"\f\"\16\"\u0332\13\"\3\"\7\"\u0335"+
		"\n\"\f\"\16\"\u0338\13\"\3#\3#\3#\7#\u033d\n#\f#\16#\u0340\13#\3#\3#\3"+
		"#\5#\u0345\n#\3#\7#\u0348\n#\f#\16#\u034b\13#\3$\3$\3$\5$\u0350\n$\3$"+
		"\3$\3$\5$\u0355\n$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u035f\n$\3$\5$\u0362\n$"+
		"\3$\5$\u0365\n$\3$\5$\u0368\n$\3%\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'"+
		"\3\'\5\'\u0377\n\'\3\'\3\'\3\'\5\'\u037c\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\7\'\u0385\n\'\f\'\16\'\u0388\13\'\3\'\3\'\3\'\3\'\5\'\u038e\n\'\3("+
		"\3(\3(\3(\3(\5(\u0395\n(\3(\3(\3(\3(\3(\3(\3(\7(\u039e\n(\f(\16(\u03a1"+
		"\13(\3(\3(\3)\3)\3)\3)\3)\5)\u03aa\n)\3*\3*\3*\3*\5*\u03b0\n*\3*\3*\3"+
		"*\5*\u03b5\n*\3*\3*\3+\3+\3+\3+\3+\3+\7+\u03bf\n+\f+\16+\u03c2\13+\5+"+
		"\u03c4\n+\3+\3+\3+\3+\5+\u03ca\n+\5+\u03cc\n+\3,\3,\3,\3,\3,\5,\u03d3"+
		"\n,\3,\3,\3,\3,\3,\7,\u03da\n,\f,\16,\u03dd\13,\3,\3,\5,\u03e1\n,\3,\3"+
		",\3,\3,\3,\7,\u03e8\n,\f,\16,\u03eb\13,\3,\3,\3,\3,\3,\3,\7,\u03f3\n,"+
		"\f,\16,\u03f6\13,\3,\3,\7,\u03fa\n,\f,\16,\u03fd\13,\3,\3,\3,\5,\u0402"+
		"\n,\3-\3-\3-\3-\3-\3-\7-\u040a\n-\f-\16-\u040d\13-\5-\u040f\n-\3-\3-\3"+
		"-\3-\5-\u0415\n-\5-\u0417\n-\3.\3.\5.\u041b\n.\3.\3.\3.\7.\u0420\n.\f"+
		".\16.\u0423\13.\3.\3.\3.\3.\7.\u0429\n.\f.\16.\u042c\13.\3.\5.\u042f\n"+
		".\5.\u0431\n.\3.\3.\5.\u0435\n.\3.\3.\3.\3.\3.\7.\u043c\n.\f.\16.\u043f"+
		"\13.\3.\3.\5.\u0443\n.\5.\u0445\n.\3.\3.\3.\3.\3.\7.\u044c\n.\f.\16.\u044f"+
		"\13.\3.\3.\3.\3.\3.\3.\7.\u0457\n.\f.\16.\u045a\13.\3.\3.\7.\u045e\n."+
		"\f.\16.\u0461\13.\5.\u0463\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/\u0470"+
		"\n/\f/\16/\u0473\13/\3/\3/\5/\u0477\n/\3\60\3\60\3\60\7\60\u047c\n\60"+
		"\f\60\16\60\u047f\13\60\3\61\3\61\3\61\3\61\5\61\u0485\n\61\3\61\3\61"+
		"\3\61\3\61\3\61\5\61\u048c\n\61\3\61\3\61\3\61\5\61\u0491\n\61\3\61\3"+
		"\61\5\61\u0495\n\61\3\62\3\62\5\62\u0499\n\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u04a8\n\62\3\63\3\63\3\63"+
		"\5\63\u04ad\n\63\3\63\5\63\u04b0\n\63\3\64\3\64\3\65\3\65\3\65\3\66\3"+
		"\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u04c5"+
		"\n\67\3\67\3\67\6\67\u04c9\n\67\r\67\16\67\u04ca\5\67\u04cd\n\67\38\3"+
		"8\58\u04d1\n8\39\39\39\39\39\59\u04d8\n9\39\39\39\59\u04dd\n9\39\39\3"+
		"9\39\39\39\39\59\u04e6\n9\39\39\39\79\u04eb\n9\f9\169\u04ee\139\39\59"+
		"\u04f1\n9\39\39\39\39\39\39\39\59\u04fa\n9\39\59\u04fd\n9\39\39\39\39"+
		"\39\39\59\u0505\n9\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39"+
		"\39\39\39\39\39\39\39\39\39\39\39\59\u0523\n9\39\39\39\39\39\39\39\39"+
		"\39\59\u052e\n9\39\39\39\39\39\39\79\u0536\n9\f9\169\u0539\139\59\u053b"+
		"\n9\39\39\39\39\59\u0541\n9\39\59\u0544\n9\79\u0546\n9\f9\169\u0549\13"+
		"9\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u0555\n:\3:\3:\3:\3:\3:\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3:\3:\3:\3:\5:\u0568\n:\3:\3:\3:\3:\5:\u056e\n:\3:\3:\3"+
		":\3:\5:\u0574\n:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3"+
		":\5:\u0588\n:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3:\7:\u05a2\n:\f:\16:\u05a5\13:\3;\3;\3;\3;\3;\3;\3;\3;"+
		"\3;\3;\5;\u05b1\n;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;"+
		"\5;\u05c4\n;\3;\3;\3;\3;\5;\u05ca\n;\3;\3;\3;\3;\5;\u05d0\n;\3;\3;\3;"+
		"\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u05e8\n;"+
		"\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;"+
		"\3;\7;\u0602\n;\f;\16;\u0605\13;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\5"+
		"<\u0613\n<\3<\3<\3<\7<\u0618\n<\f<\16<\u061b\13<\3=\3=\3=\3=\3=\3=\5="+
		"\u0623\n=\3=\3=\3=\5=\u0628\n=\3=\3=\3=\3=\3=\3=\3=\5=\u0631\n=\3=\3="+
		"\3=\7=\u0636\n=\f=\16=\u0639\13=\3=\5=\u063c\n=\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\5=\u064d\n=\3=\5=\u0650\n=\3=\3=\3=\3=\5=\u0656"+
		"\n=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3="+
		"\3=\3=\3=\3=\3=\3=\5=\u0674\n=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u067f\n="+
		"\3=\3=\3=\3=\3=\3=\7=\u0687\n=\f=\16=\u068a\13=\5=\u068c\n=\3=\3=\3=\3"+
		"=\5=\u0692\n=\3=\5=\u0695\n=\7=\u0697\n=\f=\16=\u069a\13=\3>\3>\3>\3>"+
		"\5>\u06a0\n>\3>\3>\3>\3>\3>\7>\u06a7\n>\f>\16>\u06aa\13>\3>\3>\5>\u06ae"+
		"\n>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u06ba\n>\3>\3>\5>\u06be\n>\7>\u06c0"+
		"\n>\f>\16>\u06c3\13>\3>\5>\u06c6\n>\3>\3>\3>\3>\3>\5>\u06cd\n>\3>\5>\u06d0"+
		"\n>\5>\u06d2\n>\3?\3?\3@\3@\3@\5@\u06d9\n@\3@\5@\u06dc\n@\3A\3A\5A\u06e0"+
		"\nA\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u06eb\nA\3B\3B\3B\3B\3B\3B\7B\u06f3"+
		"\nB\fB\16B\u06f6\13B\3B\3B\3C\3C\3C\3C\3C\3C\7C\u0700\nC\fC\16C\u0703"+
		"\13C\3C\3C\3C\3D\3D\5D\u070a\nD\3D\5D\u070d\nD\3D\3D\3D\3D\7D\u0713\n"+
		"D\fD\16D\u0716\13D\3D\3D\3E\3E\5E\u071c\nE\3E\3E\3E\3E\7E\u0722\nE\fE"+
		"\16E\u0725\13E\3E\3E\3F\3F\3G\3G\3G\5G\u072e\nG\3G\3G\3G\3G\3G\3G\5G\u0736"+
		"\nG\3H\3H\5H\u073a\nH\3I\3I\3I\5I\u073f\nI\3J\3J\3J\3J\3J\7J\u0746\nJ"+
		"\fJ\16J\u0749\13J\3J\3J\5J\u074d\nJ\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3"+
		"K\5K\u075b\nK\3K\5K\u075e\nK\5K\u0760\nK\3L\3L\3L\5L\u0765\nL\3L\3L\5"+
		"L\u0769\nL\3L\5L\u076c\nL\3L\3L\3L\3L\3L\5L\u0773\nL\3L\3L\3L\3L\7L\u0779"+
		"\nL\fL\16L\u077c\13L\3L\5L\u077f\nL\3L\3L\5L\u0783\nL\3L\5L\u0786\nL\3"+
		"L\3L\3L\3L\5L\u078c\nL\3L\5L\u078f\nL\5L\u0791\nL\3M\3M\3M\3M\3M\7M\u0798"+
		"\nM\fM\16M\u079b\13M\3N\3N\3N\5N\u07a0\nN\3N\5N\u07a3\nN\3N\5N\u07a6\n"+
		"N\3O\3O\5O\u07aa\nO\3P\3P\5P\u07ae\nP\3P\3P\3P\7P\u07b3\nP\fP\16P\u07b6"+
		"\13P\3P\3P\3P\3P\7P\u07bc\nP\fP\16P\u07bf\13P\3P\5P\u07c2\nP\5P\u07c4"+
		"\nP\3P\3P\5P\u07c8\nP\3P\3P\3P\3P\3P\7P\u07cf\nP\fP\16P\u07d2\13P\3P\3"+
		"P\5P\u07d6\nP\5P\u07d8\nP\3P\3P\3P\3P\3P\7P\u07df\nP\fP\16P\u07e2\13P"+
		"\3P\3P\3P\3P\3P\3P\7P\u07ea\nP\fP\16P\u07ed\13P\3P\3P\7P\u07f1\nP\fP\16"+
		"P\u07f4\13P\5P\u07f6\nP\3Q\3Q\3Q\3Q\3Q\7Q\u07fd\nQ\fQ\16Q\u0800\13Q\3"+
		"Q\3Q\5Q\u0804\nQ\3R\5R\u0807\nR\3R\3R\5R\u080b\nR\3S\3S\3T\3T\3U\3U\3"+
		"V\3V\5V\u0815\nV\3W\3W\3X\3X\3Y\6Y\u081c\nY\rY\16Y\u081d\3Z\3Z\3[\3[\3"+
		"\\\3\\\3]\3]\3^\3^\3_\3_\3`\3`\3a\3a\3b\3b\3c\3c\3d\3d\3e\3e\3f\3f\3g"+
		"\3g\3h\3h\3i\3i\3j\3j\3k\3k\3l\3l\3l\3l\3l\3l\5l\u084a\nl\3m\3m\3m\3m"+
		"\3m\3m\3m\5m\u0853\nm\3m\2\7prtvxn\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\2\21\4\2\13\13\u0081\u0081"+
		"\4\2//QQ\4\2\64\64OO\4\2\r\r\24\25\4\2\16\16\20\20\3\2\26\31\3\2\32\35"+
		"\4\2\36\36%%\4\2\17\17\21\21\4\2\f\f\37$\4\2NN\u00a6\u00a6\6\2GI\177\177"+
		"\u00b5\u00b5\u00b7\u00b8\6\2\16\16\20\20\22\22}}\4\2\u00b3\u00b3\u00b7"+
		"\u00b7\13\2+9;QSac\u0082\u0084\u0089\u008b\u0094\u0096\u009b\u009d\u00ad"+
		"\u00af\u00b0\2\u0985\2\u00df\3\2\2\2\4\u00e4\3\2\2\2\6\u00ea\3\2\2\2\b"+
		"\u0104\3\2\2\2\n\u0116\3\2\2\2\f\u0119\3\2\2\2\16\u0148\3\2\2\2\20\u014e"+
		"\3\2\2\2\22\u0163\3\2\2\2\24\u0169\3\2\2\2\26\u0171\3\2\2\2\30\u017d\3"+
		"\2\2\2\32\u0180\3\2\2\2\34\u0194\3\2\2\2\36\u01a0\3\2\2\2 \u01d6\3\2\2"+
		"\2\"\u01d8\3\2\2\2$\u01e3\3\2\2\2&\u01ea\3\2\2\2(\u01ef\3\2\2\2*\u01fe"+
		"\3\2\2\2,\u0209\3\2\2\2.\u020e\3\2\2\2\60\u0217\3\2\2\2\62\u025a\3\2\2"+
		"\2\64\u029b\3\2\2\2\66\u02bd\3\2\2\28\u02ce\3\2\2\2:\u02e7\3\2\2\2<\u02f7"+
		"\3\2\2\2>\u02ff\3\2\2\2@\u030e\3\2\2\2B\u032b\3\2\2\2D\u0339\3\2\2\2F"+
		"\u034c\3\2\2\2H\u0369\3\2\2\2J\u036e\3\2\2\2L\u0371\3\2\2\2N\u038f\3\2"+
		"\2\2P\u03a4\3\2\2\2R\u03ab\3\2\2\2T\u03b8\3\2\2\2V\u03cd\3\2\2\2X\u0403"+
		"\3\2\2\2Z\u0462\3\2\2\2\\\u0464\3\2\2\2^\u0478\3\2\2\2`\u0480\3\2\2\2"+
		"b\u0498\3\2\2\2d\u04a9\3\2\2\2f\u04b1\3\2\2\2h\u04b3\3\2\2\2j\u04b6\3"+
		"\2\2\2l\u04b8\3\2\2\2n\u04d0\3\2\2\2p\u0504\3\2\2\2r\u0587\3\2\2\2t\u05e7"+
		"\3\2\2\2v\u0612\3\2\2\2x\u0655\3\2\2\2z\u069b\3\2\2\2|\u06d3\3\2\2\2~"+
		"\u06d5\3\2\2\2\u0080\u06df\3\2\2\2\u0082\u06ec\3\2\2\2\u0084\u06f9\3\2"+
		"\2\2\u0086\u0707\3\2\2\2\u0088\u0719\3\2\2\2\u008a\u0728\3\2\2\2\u008c"+
		"\u072d\3\2\2\2\u008e\u0737\3\2\2\2\u0090\u073e\3\2\2\2\u0092\u0740\3\2"+
		"\2\2\u0094\u075f\3\2\2\2\u0096\u0790\3\2\2\2\u0098\u0792\3\2\2\2\u009a"+
		"\u07a5\3\2\2\2\u009c\u07a9\3\2\2\2\u009e\u07f5\3\2\2\2\u00a0\u07f7\3\2"+
		"\2\2\u00a2\u080a\3\2\2\2\u00a4\u080c\3\2\2\2\u00a6\u080e\3\2\2\2\u00a8"+
		"\u0810\3\2\2\2\u00aa\u0814\3\2\2\2\u00ac\u0816\3\2\2\2\u00ae\u0818\3\2"+
		"\2\2\u00b0\u081b\3\2\2\2\u00b2\u081f\3\2\2\2\u00b4\u0821\3\2\2\2\u00b6"+
		"\u0823\3\2\2\2\u00b8\u0825\3\2\2\2\u00ba\u0827\3\2\2\2\u00bc\u0829\3\2"+
		"\2\2\u00be\u082b\3\2\2\2\u00c0\u082d\3\2\2\2\u00c2\u082f\3\2\2\2\u00c4"+
		"\u0831\3\2\2\2\u00c6\u0833\3\2\2\2\u00c8\u0835\3\2\2\2\u00ca\u0837\3\2"+
		"\2\2\u00cc\u0839\3\2\2\2\u00ce\u083b\3\2\2\2\u00d0\u083d\3\2\2\2\u00d2"+
		"\u083f\3\2\2\2\u00d4\u0841\3\2\2\2\u00d6\u0849\3\2\2\2\u00d8\u0852\3\2"+
		"\2\2\u00da\u00de\5\n\6\2\u00db\u00de\5\6\4\2\u00dc\u00de\5\4\3\2\u00dd"+
		"\u00da\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2"+
		"\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e2\u00e3\7\2\2\3\u00e3\3\3\2\2\2\u00e4\u00e5\7\u00bc"+
		"\2\2\u00e5\u00e6\b\3\1\2\u00e6\5\3\2\2\2\u00e7\u00e9\7\4\2\2\u00e8\u00e7"+
		"\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00f6\5\b\5\2\u00ee\u00f0\7\4"+
		"\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\5\b\5\2\u00f4\u00ef\3\2"+
		"\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00fc\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fb\7\4\2\2\u00fa\u00f9\3\2"+
		"\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\7\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0102\7\\\2\2\u0100\u0101\7\u008b"+
		"\2\2\u0101\u0103\7\u0087\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0105\3\2\2\2\u0104\u00ff\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u010e\3\2"+
		"\2\2\u0106\u010f\5F$\2\u0107\u010f\5L\'\2\u0108\u010f\5N(\2\u0109\u010f"+
		"\5P)\2\u010a\u010f\5R*\2\u010b\u010f\5T+\2\u010c\u010f\5V,\2\u010d\u010f"+
		"\5\\/\2\u010e\u0106\3\2\2\2\u010e\u0107\3\2\2\2\u010e\u0108\3\2\2\2\u010e"+
		"\u0109\3\2\2\2\u010e\u010a\3\2\2\2\u010e\u010b\3\2\2\2\u010e\u010c\3\2"+
		"\2\2\u010e\u010d\3\2\2\2\u010f\t\3\2\2\2\u0110\u0117\5\f\7\2\u0111\u0117"+
		"\58\35\2\u0112\u0117\5\64\33\2\u0113\u0117\5\20\t\2\u0114\u0117\5\66\34"+
		"\2\u0115\u0117\5:\36\2\u0116\u0110\3\2\2\2\u0116\u0111\3\2\2\2\u0116\u0112"+
		"\3\2\2\2\u0116\u0113\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117"+
		"\13\3\2\2\2\u0118\u011a\7\u00b1\2\2\u0119\u0118\3\2\2\2\u0119\u011a\3"+
		"\2\2\2\u011a\u011c\3\2\2\2\u011b\u011d\7b\2\2\u011c\u011b\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\5\u00d6l\2\u011f\u012a"+
		"\7\6\2\2\u0120\u0121\7\u00b1\2\2\u0121\u0127\5\u00d6l\2\u0122\u0123\7"+
		"\13\2\2\u0123\u0124\7\u00b1\2\2\u0124\u0126\5\u00d6l\2\u0125\u0122\3\2"+
		"\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u0120\3\2\2\2\u012a\u012b\3\2"+
		"\2\2\u012b\u012c\3\2\2\2\u012c\u012d\7\7\2\2\u012d\u012e\7\b\2\2\u012e"+
		"\u012f\5\16\b\2\u012f\u0130\7\t\2\2\u0130\r\3\2\2\2\u0131\u0147\5\22\n"+
		"\2\u0132\u0147\5\26\f\2\u0133\u0147\5\32\16\2\u0134\u0147\5\"\22\2\u0135"+
		"\u0147\5$\23\2\u0136\u0147\5(\25\2\u0137\u0147\5\60\31\2\u0138\u0147\5"+
		"\62\32\2\u0139\u0147\5 \21\2\u013a\u013c\5:\36\2\u013b\u013d\7\4\2\2\u013c"+
		"\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0147\3\2\2\2\u013e\u013f\5\6"+
		"\4\2\u013f\u0140\7\4\2\2\u0140\u0147\3\2\2\2\u0141\u0147\5\20\t\2\u0142"+
		"\u0147\5\66\34\2\u0143\u0147\5B\"\2\u0144\u0147\5D#\2\u0145\u0147\5\24"+
		"\13\2\u0146\u0131\3\2\2\2\u0146\u0132\3\2\2\2\u0146\u0133\3\2\2\2\u0146"+
		"\u0134\3\2\2\2\u0146\u0135\3\2\2\2\u0146\u0136\3\2\2\2\u0146\u0137\3\2"+
		"\2\2\u0146\u0138\3\2\2\2\u0146\u0139\3\2\2\2\u0146\u013a\3\2\2\2\u0146"+
		"\u013e\3\2\2\2\u0146\u0141\3\2\2\2\u0146\u0142\3\2\2\2\u0146\u0143\3\2"+
		"\2\2\u0146\u0144\3\2\2\2\u0146\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2"+
		"\2\2\u014b\u014d\5.\30\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"\17\3\2\2\2\u014e\u014f\7\u00b1\2\2\u014f\u0150\7\u00b3\2\2\u0150\u0153"+
		"\7\f\2\2\u0151\u0154\7b\2\2\u0152\u0154\5\u00d6l\2\u0153\u0151\3\2\2\2"+
		"\u0153\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u015e\7\6\2\2\u0156\u015b"+
		"\5\u00d6l\2\u0157\u0158\7\13\2\2\u0158\u015a\5\u00d6l\2\u0159\u0157\3"+
		"\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c"+
		"\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u0156\3\2\2\2\u015e\u015f\3\2"+
		"\2\2\u015f\u0160\3\2\2\2\u0160\u0161\7\7\2\2\u0161\u0162\7\4\2\2\u0162"+
		"\21\3\2\2\2\u0163\u0164\7\u00b1\2\2\u0164\u0165\5\u00d6l\2\u0165\u0166"+
		"\7\f\2\2\u0166\u0167\5p9\2\u0167\u0168\7\4\2\2\u0168\23\3\2\2\2\u0169"+
		"\u016d\5v<\2\u016a\u016c\7\4\2\2\u016b\u016a\3\2\2\2\u016c\u016f\3\2\2"+
		"\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\25\3\2\2\2\u016f\u016d"+
		"\3\2\2\2\u0170\u0172\7\u00b1\2\2\u0171\u0170\3\2\2\2\u0171\u0172\3\2\2"+
		"\2\u0172\u0173\3\2\2\2\u0173\u0174\7\u008a\2\2\u0174\u0175\7\6\2\2\u0175"+
		"\u0176\5\30\r\2\u0176\u0177\7\7\2\2\u0177\u0178\7\4\2\2\u0178\27\3\2\2"+
		"\2\u0179\u017c\5B\"\2\u017a\u017c\5x=\2\u017b\u0179\3\2\2\2\u017b\u017a"+
		"\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e"+
		"\31\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0181\7f\2\2\u0181\u0182\7\6\2\2"+
		"\u0182\u0183\5t;\2\u0183\u0189\7\7\2\2\u0184\u0185\7\b\2\2\u0185\u0186"+
		"\5\16\b\2\u0186\u0187\7\t\2\2\u0187\u018a\3\2\2\2\u0188\u018a\5\16\b\2"+
		"\u0189\u0184\3\2\2\2\u0189\u0188\3\2\2\2\u018a\u018e\3\2\2\2\u018b\u018d"+
		"\5\34\17\2\u018c\u018b\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2"+
		"\u018e\u018f\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0193"+
		"\5\36\20\2\u0192\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193\33\3\2\2\2\u0194"+
		"\u0195\7U\2\2\u0195\u0196\7f\2\2\u0196\u0197\7\6\2\2\u0197\u0198\5t;\2"+
		"\u0198\u019e\7\7\2\2\u0199\u019a\7\b\2\2\u019a\u019b\5\16\b\2\u019b\u019c"+
		"\7\t\2\2\u019c\u019f\3\2\2\2\u019d\u019f\5\16\b\2\u019e\u0199\3\2\2\2"+
		"\u019e\u019d\3\2\2\2\u019f\35\3\2\2\2\u01a0\u01a6\7U\2\2\u01a1\u01a2\7"+
		"\b\2\2\u01a2\u01a3\5\16\b\2\u01a3\u01a4\7\t\2\2\u01a4\u01a7\3\2\2\2\u01a5"+
		"\u01a7\5\16\b\2\u01a6\u01a1\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7\37\3\2\2"+
		"\2\u01a8\u01a9\5t;\2\u01a9\u01aa\7)\2\2\u01aa\u01ab\5p9\2\u01ab\u01ac"+
		"\7*\2\2\u01ac\u01b0\5p9\2\u01ad\u01af\7\4\2\2\u01ae\u01ad\3\2\2\2\u01af"+
		"\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01d7\3\2"+
		"\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b4\5t;\2\u01b4\u01b8\7)\2\2\u01b5\u01b7"+
		"\7\6\2\2\u01b6\u01b5\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9\u01bb\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bf\5 "+
		"\21\2\u01bc\u01be\7\7\2\2\u01bd\u01bc\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf"+
		"\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01bf\3\2"+
		"\2\2\u01c2\u01c6\7*\2\2\u01c3\u01c5\7\6\2\2\u01c4\u01c3\3\2\2\2\u01c5"+
		"\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9\3\2"+
		"\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01cd\5 \21\2\u01ca\u01cc\7\7\2\2\u01cb"+
		"\u01ca\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2"+
		"\2\2\u01ce\u01d3\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01d2\7\4\2\2\u01d1"+
		"\u01d0\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2"+
		"\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01a8\3\2\2\2\u01d6"+
		"\u01b3\3\2\2\2\u01d7!\3\2\2\2\u01d8\u01d9\7\u00ae\2\2\u01d9\u01da\7\6"+
		"\2\2\u01da\u01db\5r:\2\u01db\u01e1\7\7\2\2\u01dc\u01dd\7\b\2\2\u01dd\u01de"+
		"\5\16\b\2\u01de\u01df\7\t\2\2\u01df\u01e2\3\2\2\2\u01e0\u01e2\5\16\b\2"+
		"\u01e1\u01dc\3\2\2\2\u01e1\u01e0\3\2\2\2\u01e2#\3\2\2\2\u01e3\u01e4\7"+
		"R\2\2\u01e4\u01e5\7\b\2\2\u01e5\u01e6\5\16\b\2\u01e6\u01e7\7\t\2\2\u01e7"+
		"\u01e8\5&\24\2\u01e8\u01e9\7\4\2\2\u01e9%\3\2\2\2\u01ea\u01eb\7\u00ae"+
		"\2\2\u01eb\u01ec\7\6\2\2\u01ec\u01ed\5r:\2\u01ed\u01ee\7\7\2\2\u01ee\'"+
		"\3\2\2\2\u01ef\u01f0\7^\2\2\u01f0\u01f3\7\6\2\2\u01f1\u01f4\5*\26\2\u01f2"+
		"\u01f4\5,\27\2\u01f3\u01f1\3\2\2\2\u01f3\u01f2\3\2\2\2\u01f4\u01f5\3\2"+
		"\2\2\u01f5\u01fb\7\7\2\2\u01f6\u01f7\7\b\2\2\u01f7\u01f8\5\16\b\2\u01f8"+
		"\u01f9\7\t\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01fc\5\16\b\2\u01fb\u01f6\3"+
		"\2\2\2\u01fb\u01fa\3\2\2\2\u01fc)\3\2\2\2\u01fd\u01ff\7\u00b1\2\2\u01fe"+
		"\u01fd\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0201\3\2\2\2\u0200\u0202\5v"+
		"<\2\u0201\u0200\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203\3\2\2\2\u0203"+
		"\u0204\7\4\2\2\u0204\u0205\5t;\2\u0205\u0207\7\4\2\2\u0206\u0208\5v<\2"+
		"\u0207\u0206\3\2\2\2\u0207\u0208\3\2\2\2\u0208+\3\2\2\2\u0209\u020a\7"+
		"\u00b1\2\2\u020a\u020b\5\u00d6l\2\u020b\u020c\7*\2\2\u020c\u020d\5\u00d6"+
		"l\2\u020d-\3\2\2\2\u020e\u0212\7\u0095\2\2\u020f\u0213\5p9\2\u0210\u0213"+
		"\5\24\13\2\u0211\u0213\5 \21\2\u0212\u020f\3\2\2\2\u0212\u0210\3\2\2\2"+
		"\u0212\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215\7\4\2\2\u0215/\3"+
		"\2\2\2\u0216\u0218\7\u00b1\2\2\u0217\u0216\3\2\2\2\u0217\u0218\3\2\2\2"+
		"\u0218\u0220\3\2\2\2\u0219\u021a\7\'\2\2\u021a\u021b\7(\2\2\u021b\u0221"+
		"\5\u00d6l\2\u021c\u021d\5\u00d6l\2\u021d\u021e\7\'\2\2\u021e\u021f\7("+
		"\2\2\u021f\u0221\3\2\2\2\u0220\u0219\3\2\2\2\u0220\u021c\3\2\2\2\u0221"+
		"\u0225\3\2\2\2\u0222\u0224\7\4\2\2\u0223\u0222\3\2\2\2\u0224\u0227\3\2"+
		"\2\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0258\3\2\2\2\u0227"+
		"\u0225\3\2\2\2\u0228\u0229\7\f\2\2\u0229\u022c\7\b\2\2\u022a\u022d\5\u00d6"+
		"l\2\u022b\u022d\5\u00a2R\2\u022c\u022a\3\2\2\2\u022c\u022b\3\2\2\2\u022d"+
		"\u0235\3\2\2\2\u022e\u0231\7\13\2\2\u022f\u0232\5\u00d6l\2\u0230\u0232"+
		"\5\u00a2R\2\u0231\u022f\3\2\2\2\u0231\u0230\3\2\2\2\u0232\u0234\3\2\2"+
		"\2\u0233\u022e\3\2\2\2\u0234\u0237\3\2\2\2\u0235\u0233\3\2\2\2\u0235\u0236"+
		"\3\2\2\2\u0236\u0238\3\2\2\2\u0237\u0235\3\2\2\2\u0238\u023c\7\t\2\2\u0239"+
		"\u023b\7\4\2\2\u023a\u0239\3\2\2\2\u023b\u023e\3\2\2\2\u023c\u023a\3\2"+
		"\2\2\u023c\u023d\3\2\2\2\u023d\u0259\3\2\2\2\u023e\u023c\3\2\2\2\u023f"+
		"\u0240\7\f\2\2\u0240\u0243\7\'\2\2\u0241\u0244\5\u00d6l\2\u0242\u0244"+
		"\5\u00a2R\2\u0243\u0241\3\2\2\2\u0243\u0242\3\2\2\2\u0244\u024c\3\2\2"+
		"\2\u0245\u0248\7\13\2\2\u0246\u0249\5\u00d6l\2\u0247\u0249\5\u00a2R\2"+
		"\u0248\u0246\3\2\2\2\u0248\u0247\3\2\2\2\u0249\u024b\3\2\2\2\u024a\u0245"+
		"\3\2\2\2\u024b\u024e\3\2\2\2\u024c\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024d"+
		"\u024f\3\2\2\2\u024e\u024c\3\2\2\2\u024f\u0253\7(\2\2\u0250\u0252\7\4"+
		"\2\2\u0251\u0250\3\2\2\2\u0252\u0255\3\2\2\2\u0253\u0251\3\2\2\2\u0253"+
		"\u0254\3\2\2\2\u0254\u0259\3\2\2\2\u0255\u0253\3\2\2\2\u0256\u0257\7\f"+
		"\2\2\u0257\u0259\5\6\4\2\u0258\u0228\3\2\2\2\u0258\u023f\3\2\2\2\u0258"+
		"\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259\61\3\2\2\2\u025a\u025b\7\u009c"+
		"\2\2\u025b\u025c\7\6\2\2\u025c\u025d\5\u00d6l\2\u025d\u025e\7\7\2\2\u025e"+
		"\u027b\7\b\2\2\u025f\u0262\7=\2\2\u0260\u0263\5\u00d6l\2\u0261\u0263\5"+
		"\u00a2R\2\u0262\u0260\3\2\2\2\u0262\u0261\3\2\2\2\u0263\u0264\3\2\2\2"+
		"\u0264\u0273\7*\2\2\u0265\u0274\5\16\b\2\u0266\u0267\7\b\2\2\u0267\u026a"+
		"\5\16\b\2\u0268\u0269\7:\2\2\u0269\u026b\7\4\2\2\u026a\u0268\3\2\2\2\u026a"+
		"\u026b\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u0270\7\t\2\2\u026d\u026f\7\4"+
		"\2\2\u026e\u026d\3\2\2\2\u026f\u0272\3\2\2\2\u0270\u026e\3\2\2\2\u0270"+
		"\u0271\3\2\2\2\u0271\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0273\u0265\3\2"+
		"\2\2\u0273\u0266\3\2\2\2\u0274\u0277\3\2\2\2\u0275\u0276\7:\2\2\u0276"+
		"\u0278\7\4\2\2\u0277\u0275\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u027a\3\2"+
		"\2\2\u0279\u025f\3\2\2\2\u027a\u027d\3\2\2\2\u027b\u0279\3\2\2\2\u027b"+
		"\u027c\3\2\2\2\u027c\u0294\3\2\2\2\u027d\u027b\3\2\2\2\u027e\u027f\7K"+
		"\2\2\u027f\u028e\7*\2\2\u0280\u028f\5\16\b\2\u0281\u0282\7\b\2\2\u0282"+
		"\u0285\5\16\b\2\u0283\u0284\7:\2\2\u0284\u0286\7\4\2\2\u0285\u0283\3\2"+
		"\2\2\u0285\u0286\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u028b\7\t\2\2\u0288"+
		"\u028a\7\4\2\2\u0289\u0288\3\2\2\2\u028a\u028d\3\2\2\2\u028b\u0289\3\2"+
		"\2\2\u028b\u028c\3\2\2\2\u028c\u028f\3\2\2\2\u028d\u028b\3\2\2\2\u028e"+
		"\u0280\3\2\2\2\u028e\u0281\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0292\3\2"+
		"\2\2\u0290\u0291\7:\2\2\u0291\u0293\7\4\2\2\u0292\u0290\3\2\2\2\u0292"+
		"\u0293\3\2\2\2\u0293\u0295\3\2\2\2\u0294\u027e\3\2\2\2\u0294\u0295\3\2"+
		"\2\2\u0295\u0296\3\2\2\2\u0296\u0297\7\t\2\2\u0297\63\3\2\2\2\u0298\u0299"+
		"\7\u00b1\2\2\u0299\u029a\7\u00b3\2\2\u029a\u029c\7\f\2\2\u029b\u0298\3"+
		"\2\2\2\u029b\u029c\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029e\7\u00b3\2\2"+
		"\u029e\u02a2\7\6\2\2\u029f\u02a1\7\u00b3\2\2\u02a0\u029f\3\2\2\2\u02a1"+
		"\u02a4\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a5\3\2"+
		"\2\2\u02a4\u02a2\3\2\2\2\u02a5\u02a6\7\13\2\2\u02a6\u02a7\7b\2\2\u02a7"+
		"\u02b0\7\6\2\2\u02a8\u02ad\7\u00b3\2\2\u02a9\u02aa\7\13\2\2\u02aa\u02ac"+
		"\7\u00b3\2\2\u02ab\u02a9\3\2\2\2\u02ac\u02af\3\2\2\2\u02ad\u02ab\3\2\2"+
		"\2\u02ad\u02ae\3\2\2\2\u02ae\u02b1\3\2\2\2\u02af\u02ad\3\2\2\2\u02b0\u02a8"+
		"\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\7\7\2\2\u02b3"+
		"\u02b4\7\b\2\2\u02b4\u02b5\7\u0095\2\2\u02b5\u02b6\5p9\2\u02b6\u02b7\7"+
		"\4\2\2\u02b7\u02b8\7\t\2\2\u02b8\u02b9\7\7\2\2\u02b9\u02ba\7\4\2\2\u02ba"+
		"\65\3\2\2\2\u02bb\u02be\7b\2\2\u02bc\u02be\5\u00d6l\2\u02bd\u02bb\3\2"+
		"\2\2\u02bd\u02bc\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c8\7\6\2\2\u02c0"+
		"\u02c5\5\u00d6l\2\u02c1\u02c2\7\13\2\2\u02c2\u02c4\5\u00d6l\2\u02c3\u02c1"+
		"\3\2\2\2\u02c4\u02c7\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6"+
		"\u02c9\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c8\u02c0\3\2\2\2\u02c8\u02c9\3\2"+
		"\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cb\7\7\2\2\u02cb\u02cc\7\4\2\2\u02cc"+
		"\67\3\2\2\2\u02cd\u02cf\7\u00b1\2\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf\3"+
		"\2\2\2\u02cf\u02d2\3\2\2\2\u02d0\u02d3\7b\2\2\u02d1\u02d3\5\u00d6l\2\u02d2"+
		"\u02d0\3\2\2\2\u02d2\u02d1\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02df\7\6"+
		"\2\2\u02d5\u02d6\7\u00b1\2\2\u02d6\u02dc\5p9\2\u02d7\u02d8\7\13\2\2\u02d8"+
		"\u02d9\7\u00b1\2\2\u02d9\u02db\5p9\2\u02da\u02d7\3\2\2\2\u02db\u02de\3"+
		"\2\2\2\u02dc\u02da\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02e0\3\2\2\2\u02de"+
		"\u02dc\3\2\2\2\u02df\u02d5\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e1\3\2"+
		"\2\2\u02e1\u02e2\7\7\2\2\u02e2\u02e3\7\b\2\2\u02e3\u02e4\5\16\b\2\u02e4"+
		"\u02e5\7\t\2\2\u02e59\3\2\2\2\u02e6\u02e8\7\u00b1\2\2\u02e7\u02e6\3\2"+
		"\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02ea\5\u00d6l\2\u02ea"+
		"\u02eb\7\f\2\2\u02eb\u02f1\7\b\2\2\u02ec\u02f0\5<\37\2\u02ed\u02f0\5>"+
		" \2\u02ee\u02f0\5@!\2\u02ef\u02ec\3\2\2\2\u02ef\u02ed\3\2\2\2\u02ef\u02ee"+
		"\3\2\2\2\u02f0\u02f3\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2"+
		"\u02f4\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f4\u02f5\7\t\2\2\u02f5\u02f6\7\4"+
		"\2\2\u02f6;\3\2\2\2\u02f7\u02f8\7\u00b3\2\2\u02f8\u02f9\7*\2\2\u02f9\u02fb"+
		"\5p9\2\u02fa\u02fc\7\13\2\2\u02fb\u02fa\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc"+
		"=\3\2\2\2\u02fd\u02fe\7\u00b3\2\2\u02fe\u0300\7*\2\2\u02ff\u02fd\3\2\2"+
		"\2\u02ff\u0300\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0307\7\b\2\2\u0302\u0306"+
		"\5<\37\2\u0303\u0306\5> \2\u0304\u0306\5@!\2\u0305\u0302\3\2\2\2\u0305"+
		"\u0303\3\2\2\2\u0305\u0304\3\2\2\2\u0306\u0309\3\2\2\2\u0307\u0305\3\2"+
		"\2\2\u0307\u0308\3\2\2\2\u0308\u030a\3\2\2\2\u0309\u0307\3\2\2\2\u030a"+
		"\u030c\7\t\2\2\u030b\u030d\7\13\2\2\u030c\u030b\3\2\2\2\u030c\u030d\3"+
		"\2\2\2\u030d?\3\2\2\2\u030e\u030f\7\u00b3\2\2\u030f\u0310\7*\2\2\u0310"+
		"\u0324\7\'\2\2\u0311\u0323\5> \2\u0312\u0317\5\u00d6l\2\u0313\u0314\7"+
		"\13\2\2\u0314\u0316\5\u00d6l\2\u0315\u0313\3\2\2\2\u0316\u0319\3\2\2\2"+
		"\u0317\u0315\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u0323\3\2\2\2\u0319\u0317"+
		"\3\2\2\2\u031a\u031f\5\u00a2R\2\u031b\u031c\7\13\2\2\u031c\u031e\5\u00a2"+
		"R\2\u031d\u031b\3\2\2\2\u031e\u0321\3\2\2\2\u031f\u031d\3\2\2\2\u031f"+
		"\u0320\3\2\2\2\u0320\u0323\3\2\2\2\u0321\u031f\3\2\2\2\u0322\u0311\3\2"+
		"\2\2\u0322\u0312\3\2\2\2\u0322\u031a\3\2\2\2\u0323\u0326\3\2\2\2\u0324"+
		"\u0322\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0327\3\2\2\2\u0326\u0324\3\2"+
		"\2\2\u0327\u0329\7(\2\2\u0328\u032a\7\13\2\2\u0329\u0328\3\2\2\2\u0329"+
		"\u032a\3\2\2\2\u032aA\3\2\2\2\u032b\u0330\5\u00d6l\2\u032c\u032d\7\5\2"+
		"\2\u032d\u032f\5\u00d6l\2\u032e\u032c\3\2\2\2\u032f\u0332\3\2\2\2\u0330"+
		"\u032e\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0336\3\2\2\2\u0332\u0330\3\2"+
		"\2\2\u0333\u0335\7\4\2\2\u0334\u0333\3\2\2\2\u0335\u0338\3\2\2\2\u0336"+
		"\u0334\3\2\2\2\u0336\u0337\3\2\2\2\u0337C\3\2\2\2\u0338\u0336\3\2\2\2"+
		"\u0339\u033e\5\u00d6l\2\u033a\u033b\7\5\2\2\u033b\u033d\5\u00d6l\2\u033c"+
		"\u033a\3\2\2\2\u033d\u0340\3\2\2\2\u033e\u033c\3\2\2\2\u033e\u033f\3\2"+
		"\2\2\u033f\u0341\3\2\2\2\u0340\u033e\3\2\2\2\u0341\u0344\7\f\2\2\u0342"+
		"\u0345\5\u00a2R\2\u0343\u0345\5p9\2\u0344\u0342\3\2\2\2\u0344\u0343\3"+
		"\2\2\2\u0345\u0349\3\2\2\2\u0346\u0348\7\4\2\2\u0347\u0346\3\2\2\2\u0348"+
		"\u034b\3\2\2\2\u0349\u0347\3\2\2\2\u0349\u034a\3\2\2\2\u034aE\3\2\2\2"+
		"\u034b\u0349\3\2\2\2\u034c\u034d\7\60\2\2\u034d\u034f\7\u009d\2\2\u034e"+
		"\u0350\7\u0083\2\2\u034f\u034e\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0354"+
		"\3\2\2\2\u0351\u0352\5\u00b6\\\2\u0352\u0353\7\5\2\2\u0353\u0355\3\2\2"+
		"\2\u0354\u0351\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u0361"+
		"\5\u00b8]\2\u0357\u0358\7\u0092\2\2\u0358\u0359\7\u00a1\2\2\u0359\u0362"+
		"\5\u00be`\2\u035a\u0362\5J&\2\u035b\u0362\5H%\2\u035c\u035e\7-\2\2\u035d"+
		"\u035f\7A\2\2\u035e\u035d\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u0360\3\2"+
		"\2\2\u0360\u0362\5^\60\2\u0361\u0357\3\2\2\2\u0361\u035a\3\2\2\2\u0361"+
		"\u035b\3\2\2\2\u0361\u035c\3\2\2\2\u0362\u0364\3\2\2\2\u0363\u0365\7W"+
		"\2\2\u0364\u0363\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0367\3\2\2\2\u0366"+
		"\u0368\5\u00b0Y\2\u0367\u0366\3\2\2\2\u0367\u0368\3\2\2\2\u0368G\3\2\2"+
		"\2\u0369\u036a\7-\2\2\u036a\u036b\7D\2\2\u036b\u036c\5\u00d6l\2\u036c"+
		"\u036d\5\u0080A\2\u036dI\3\2\2\2\u036e\u036f\7-\2\2\u036f\u0370\5\u0080"+
		"A\2\u0370K\3\2\2\2\u0371\u0372\7E\2\2\u0372\u0376\7\u009d\2\2\u0373\u0374"+
		"\7f\2\2\u0374\u0375\7}\2\2\u0375\u0377\7[\2\2\u0376\u0373\3\2\2\2\u0376"+
		"\u0377\3\2\2\2\u0377\u037b\3\2\2\2\u0378\u0379\5\u00b6\\\2\u0379\u037a"+
		"\7\5\2\2\u037a\u037c\3\2\2\2\u037b\u0378\3\2\2\2\u037b\u037c\3\2\2\2\u037c"+
		"\u037d\3\2\2\2\u037d\u038d\5\u00ba^\2\u037e\u037f\7\6\2\2\u037f\u0386"+
		"\5^\60\2\u0380\u0381\7\13\2\2\u0381\u0385\5\u0080A\2\u0382\u0383\7\13"+
		"\2\2\u0383\u0385\5^\60\2\u0384\u0380\3\2\2\2\u0384\u0382\3\2\2\2\u0385"+
		"\u0388\3\2\2\2\u0386\u0384\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u0389\3\2"+
		"\2\2\u0388\u0386\3\2\2\2\u0389\u038a\7\7\2\2\u038a\u038e\3\2\2\2\u038b"+
		"\u038c\7\63\2\2\u038c\u038e\5X-\2\u038d\u037e\3\2\2\2\u038d\u038b\3\2"+
		"\2\2\u038eM\3\2\2\2\u038f\u0390\7E\2\2\u0390\u0394\7\u00b2\2\2\u0391\u0392"+
		"\7f\2\2\u0392\u0393\7}\2\2\u0393\u0395\7[\2\2\u0394\u0391\3\2\2\2\u0394"+
		"\u0395\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0397\5\u00d6l\2\u0397\u0398"+
		"\7\6\2\2\u0398\u039f\5^\60\2\u0399\u039a\7\13\2\2\u039a\u039e\5\u0080"+
		"A\2\u039b\u039c\7\13\2\2\u039c\u039e\5^\60\2\u039d\u0399\3\2\2\2\u039d"+
		"\u039b\3\2\2\2\u039e\u03a1\3\2\2\2\u039f\u039d\3\2\2\2\u039f\u03a0\3\2"+
		"\2\2\u03a0\u03a2\3\2\2\2\u03a1\u039f\3\2\2\2\u03a2\u03a3\7\7\2\2\u03a3"+
		"O\3\2\2\2\u03a4\u03a5\7N\2\2\u03a5\u03a6\7`\2\2\u03a6\u03a9\5\u008cG\2"+
		"\u03a7\u03a8\7\u00ad\2\2\u03a8\u03aa\5p9\2\u03a9\u03a7\3\2\2\2\u03a9\u03aa"+
		"\3\2\2\2\u03aaQ\3\2\2\2\u03ab\u03ac\7S\2\2\u03ac\u03af\7\u009d\2\2\u03ad"+
		"\u03ae\7f\2\2\u03ae\u03b0\7[\2\2\u03af\u03ad\3\2\2\2\u03af\u03b0\3\2\2"+
		"\2\u03b0\u03b4\3\2\2\2\u03b1\u03b2\5\u00b6\\\2\u03b2\u03b3\7\5\2\2\u03b3"+
		"\u03b5\3\2\2\2\u03b4\u03b1\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03b6\3\2"+
		"\2\2\u03b6\u03b7\5\u00ba^\2\u03b7S\3\2\2\2\u03b8\u03c3\5\u009eP\2\u03b9"+
		"\u03ba\7\u0085\2\2\u03ba\u03bb\7;\2\2\u03bb\u03c0\5\u008eH\2\u03bc\u03bd"+
		"\7\13\2\2\u03bd\u03bf\5\u008eH\2\u03be\u03bc\3\2\2\2\u03bf\u03c2\3\2\2"+
		"\2\u03c0\u03be\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c4\3\2\2\2\u03c2\u03c0"+
		"\3\2\2\2\u03c3\u03b9\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03cb\3\2\2\2\u03c5"+
		"\u03c6\7x\2\2\u03c6\u03c9\5p9\2\u03c7\u03c8\t\2\2\2\u03c8\u03ca\5p9\2"+
		"\u03c9\u03c7\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03cc\3\2\2\2\u03cb\u03c5"+
		"\3\2\2\2\u03cb\u03cc\3\2\2\2\u03ccU\3\2\2\2\u03cd\u03ce\7n\2\2\u03ce\u03d2"+
		"\7q\2\2\u03cf\u03d0\5\u00b6\\\2\u03d0\u03d1\7\5\2\2\u03d1\u03d3\3\2\2"+
		"\2\u03d2\u03cf\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03e0"+
		"\5\u00ba^\2\u03d5\u03d6\7\6\2\2\u03d6\u03db\5\u00c0a\2\u03d7\u03d8\7\13"+
		"\2\2\u03d8\u03da\5\u00c0a\2\u03d9\u03d7\3\2\2\2\u03da\u03dd\3\2\2\2\u03db"+
		"\u03d9\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03de\3\2\2\2\u03dd\u03db\3\2"+
		"\2\2\u03de\u03df\7\7\2\2\u03df\u03e1\3\2\2\2\u03e0\u03d5\3\2\2\2\u03e0"+
		"\u03e1\3\2\2\2\u03e1\u0401\3\2\2\2\u03e2\u03e3\7\u00a9\2\2\u03e3\u03e4"+
		"\7\6\2\2\u03e4\u03e9\5p9\2\u03e5\u03e6\7\13\2\2\u03e6\u03e8\5p9\2\u03e7"+
		"\u03e5\3\2\2\2\u03e8\u03eb\3\2\2\2\u03e9\u03e7\3\2\2\2\u03e9\u03ea\3\2"+
		"\2\2\u03ea\u03ec\3\2\2\2\u03eb\u03e9\3\2\2\2\u03ec\u03fb\7\7\2\2\u03ed"+
		"\u03ee\7\13\2\2\u03ee\u03ef\7\6\2\2\u03ef\u03f4\5p9\2\u03f0\u03f1\7\13"+
		"\2\2\u03f1\u03f3\5p9\2\u03f2\u03f0\3\2\2\2\u03f3\u03f6\3\2\2\2\u03f4\u03f2"+
		"\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03f7\3\2\2\2\u03f6\u03f4\3\2\2\2\u03f7"+
		"\u03f8\7\7\2\2\u03f8\u03fa\3\2\2\2\u03f9\u03ed\3\2\2\2\u03fa\u03fd\3\2"+
		"\2\2\u03fb\u03f9\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u0402\3\2\2\2\u03fd"+
		"\u03fb\3\2\2\2\u03fe\u0402\5X-\2\u03ff\u0400\7K\2\2\u0400\u0402\7\u00a9"+
		"\2\2\u0401\u03e2\3\2\2\2\u0401\u03fe\3\2\2\2\u0401\u03ff\3\2\2\2\u0402"+
		"W\3\2\2\2\u0403\u040e\5Z.\2\u0404\u0405\7\u0085\2\2\u0405\u0406\7;\2\2"+
		"\u0406\u040b\5\u008eH\2\u0407\u0408\7\13\2\2\u0408\u040a\5\u008eH\2\u0409"+
		"\u0407\3\2\2\2\u040a\u040d\3\2\2\2\u040b\u0409\3\2\2\2\u040b\u040c\3\2"+
		"\2\2\u040c\u040f\3\2\2\2\u040d\u040b\3\2\2\2\u040e\u0404\3\2\2\2\u040e"+
		"\u040f\3\2\2\2\u040f\u0416\3\2\2\2\u0410\u0411\7x\2\2\u0411\u0414\5p9"+
		"\2\u0412\u0413\t\2\2\2\u0413\u0415\5p9\2\u0414\u0412\3\2\2\2\u0414\u0415"+
		"\3\2\2\2\u0415\u0417\3\2\2\2\u0416\u0410\3\2\2\2\u0416\u0417\3\2\2\2\u0417"+
		"Y\3\2\2\2\u0418\u041a\7\u009a\2\2\u0419\u041b\t\3\2\2\u041a\u0419\3\2"+
		"\2\2\u041a\u041b\3\2\2\2\u041b\u041c\3\2\2\2\u041c\u0421\5\u0094K\2\u041d"+
		"\u041e\7\13\2\2\u041e\u0420\5\u0094K\2\u041f\u041d\3\2\2\2\u0420\u0423"+
		"\3\2\2\2\u0421\u041f\3\2\2\2\u0421\u0422\3\2\2\2\u0422\u0430\3\2\2\2\u0423"+
		"\u0421\3\2\2\2\u0424\u042e\7`\2\2\u0425\u042a\5\u0096L\2\u0426\u0427\7"+
		"\13\2\2\u0427\u0429\5\u0096L\2\u0428\u0426\3\2\2\2\u0429\u042c\3\2\2\2"+
		"\u042a\u0428\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u042f\3\2\2\2\u042c\u042a"+
		"\3\2\2\2\u042d\u042f\5\u0098M\2\u042e\u0425\3\2\2\2\u042e\u042d\3\2\2"+
		"\2\u042f\u0431\3\2\2\2\u0430\u0424\3\2\2\2\u0430\u0431\3\2\2\2\u0431\u0434"+
		"\3\2\2\2\u0432\u0433\7\u00ad\2\2\u0433\u0435\5p9\2\u0434\u0432\3\2\2\2"+
		"\u0434\u0435\3\2\2\2\u0435\u0444\3\2\2\2\u0436\u0437\7d\2\2\u0437\u0438"+
		"\7;\2\2\u0438\u043d\5p9\2\u0439\u043a\7\13\2\2\u043a\u043c\5p9\2\u043b"+
		"\u0439\3\2\2\2\u043c\u043f\3\2\2\2\u043d\u043b\3\2\2\2\u043d\u043e\3\2"+
		"\2\2\u043e\u0442\3\2\2\2\u043f\u043d\3\2\2\2\u0440\u0441\7e\2\2\u0441"+
		"\u0443\5p9\2\u0442\u0440\3\2\2\2\u0442\u0443\3\2\2\2\u0443\u0445\3\2\2"+
		"\2\u0444\u0436\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u0463\3\2\2\2\u0446\u0447"+
		"\7\u00a9\2\2\u0447\u0448\7\6\2\2\u0448\u044d\5p9\2\u0449\u044a\7\13\2"+
		"\2\u044a\u044c\5p9\2\u044b\u0449\3\2\2\2\u044c\u044f\3\2\2\2\u044d\u044b"+
		"\3\2\2\2\u044d\u044e\3\2\2\2\u044e\u0450\3\2\2\2\u044f\u044d\3\2\2\2\u0450"+
		"\u045f\7\7\2\2\u0451\u0452\7\13\2\2\u0452\u0453\7\6\2\2\u0453\u0458\5"+
		"p9\2\u0454\u0455\7\13\2\2\u0455\u0457\5p9\2\u0456\u0454\3\2\2\2\u0457"+
		"\u045a\3\2\2\2\u0458\u0456\3\2\2\2\u0458\u0459\3\2\2\2\u0459\u045b\3\2"+
		"\2\2\u045a\u0458\3\2\2\2\u045b\u045c\7\7\2\2\u045c\u045e\3\2\2\2\u045d"+
		"\u0451\3\2\2\2\u045e\u0461\3\2\2\2\u045f\u045d\3\2\2\2\u045f\u0460\3\2"+
		"\2\2\u0460\u0463\3\2\2\2\u0461\u045f\3\2\2\2\u0462\u0418\3\2\2\2\u0462"+
		"\u0446\3\2\2\2\u0463[\3\2\2\2\u0464\u0465\7\u00a6\2\2\u0465\u0466\5\u008c"+
		"G\2\u0466\u0467\7\u009b\2\2\u0467\u0468\5\u00c0a\2\u0468\u0469\7\f\2\2"+
		"\u0469\u0471\5p9\2\u046a\u046b\7\13\2\2\u046b\u046c\5\u00c0a\2\u046c\u046d"+
		"\7\f\2\2\u046d\u046e\5p9\2\u046e\u0470\3\2\2\2\u046f\u046a\3\2\2\2\u0470"+
		"\u0473\3\2\2\2\u0471\u046f\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u0476\3\2"+
		"\2\2\u0473\u0471\3\2\2\2\u0474\u0475\7\u00ad\2\2\u0475\u0477\5p9\2\u0476"+
		"\u0474\3\2\2\2\u0476\u0477\3\2\2\2\u0477]\3\2\2\2\u0478\u047d\5\u00c0"+
		"a\2\u0479\u047c\5b\62\2\u047a\u047c\5`\61\2\u047b\u0479\3\2\2\2\u047b"+
		"\u047a\3\2\2\2\u047c\u047f\3\2\2\2\u047d\u047b\3\2\2\2\u047d\u047e\3\2"+
		"\2\2\u047e_\3\2\2\2\u047f\u047d\3\2\2\2\u0480\u0494\5\u00b2Z\2\u0481\u0482"+
		"\7\6\2\2\u0482\u0484\5\u00a2R\2\u0483\u0485\5\u00d6l\2\u0484\u0483\3\2"+
		"\2\2\u0484\u0485\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0487\7\7\2\2\u0487"+
		"\u0495\3\2\2\2\u0488\u0489\7\6\2\2\u0489\u048b\5\u00a2R\2\u048a\u048c"+
		"\5\u00d6l\2\u048b\u048a\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u048d\3\2\2"+
		"\2\u048d\u048e\7\13\2\2\u048e\u0490\5\u00a2R\2\u048f\u0491\5\u00d6l\2"+
		"\u0490\u048f\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u0493"+
		"\7\7\2\2\u0493\u0495\3\2\2\2\u0494\u0481\3\2\2\2\u0494\u0488\3\2\2\2\u0494"+
		"\u0495\3\2\2\2\u0495a\3\2\2\2\u0496\u0497\7D\2\2\u0497\u0499\5\u00b2Z"+
		"\2\u0498\u0496\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u04a7\3\2\2\2\u049a\u04a8"+
		"\5d\63\2\u049b\u04a8\5f\64\2\u049c\u04a8\5h\65\2\u049d\u04a8\5j\66\2\u049e"+
		"\u04a8\7\u00a5\2\2\u049f\u04a0\7?\2\2\u04a0\u04a1\7\6\2\2\u04a1\u04a2"+
		"\5p9\2\u04a2\u04a3\7\7\2\2\u04a3\u04a8\3\2\2\2\u04a4\u04a8\5l\67\2\u04a5"+
		"\u04a6\7@\2\2\u04a6\u04a8\5\u00c2b\2\u04a7\u049a\3\2\2\2\u04a7\u049b\3"+
		"\2\2\2\u04a7\u049c\3\2\2\2\u04a7\u049d\3\2\2\2\u04a7\u049e\3\2\2\2\u04a7"+
		"\u049f\3\2\2\2\u04a7\u04a4\3\2\2\2\u04a7\u04a5\3\2\2\2\u04a8c\3\2\2\2"+
		"\u04a9\u04aa\7\u0089\2\2\u04aa\u04ac\7u\2\2\u04ab\u04ad\t\4\2\2\u04ac"+
		"\u04ab\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad\u04af\3\2\2\2\u04ae\u04b0\7\66"+
		"\2\2\u04af\u04ae\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0e\3\2\2\2\u04b1\u04b2"+
		"\5z>\2\u04b2g\3\2\2\2\u04b3\u04b4\7}\2\2\u04b4\u04b5\7\177\2\2\u04b5i"+
		"\3\2\2\2\u04b6\u04b7\7\177\2\2\u04b7k\3\2\2\2\u04b8\u04c4\7K\2\2\u04b9"+
		"\u04c5\5n8\2\u04ba\u04bb\7\6\2\2\u04bb\u04bc\5p9\2\u04bc\u04bd\7\7\2\2"+
		"\u04bd\u04c5\3\2\2\2\u04be\u04bf\7{\2\2\u04bf\u04c0\7\6\2\2\u04c0\u04c1"+
		"\5p9\2\u04c1\u04c2\7\7\2\2\u04c2\u04c5\3\2\2\2\u04c3\u04c5\5\u00d6l\2"+
		"\u04c4\u04b9\3\2\2\2\u04c4\u04ba\3\2\2\2\u04c4\u04be\3\2\2\2\u04c4\u04c3"+
		"\3\2\2\2\u04c5\u04cc\3\2\2\2\u04c6\u04c8\7\3\2\2\u04c7\u04c9\5\u00d6l"+
		"\2\u04c8\u04c7\3\2\2\2\u04c9\u04ca\3\2\2\2\u04ca\u04c8\3\2\2\2\u04ca\u04cb"+
		"\3\2\2\2\u04cb\u04cd\3\2\2\2\u04cc\u04c6\3\2\2\2\u04cc\u04cd\3\2\2\2\u04cd"+
		"m\3\2\2\2\u04ce\u04d1\5\u00a2R\2\u04cf\u04d1\5\u00a4S\2\u04d0\u04ce\3"+
		"\2\2\2\u04d0\u04cf\3\2\2\2\u04d1o\3\2\2\2\u04d2\u04d3\b9\1\2\u04d3\u0505"+
		"\5\u00a4S\2\u04d4\u04d5\5\u00b6\\\2\u04d5\u04d6\7\5\2\2\u04d6\u04d8\3"+
		"\2\2\2\u04d7\u04d4\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9"+
		"\u04da\5\u00ba^\2\u04da\u04db\7\5\2\2\u04db\u04dd\3\2\2\2\u04dc\u04d7"+
		"\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u0505\5\u00c0a"+
		"\2\u04df\u04e0\5\u00a6T\2\u04e0\u04e1\5p9\21\u04e1\u0505\3\2\2\2\u04e2"+
		"\u04e3\5\u00b4[\2\u04e3\u04f0\7\6\2\2\u04e4\u04e6\7Q\2\2\u04e5\u04e4\3"+
		"\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7\u04ec\5p9\2\u04e8"+
		"\u04e9\7\13\2\2\u04e9\u04eb\5p9\2\u04ea\u04e8\3\2\2\2\u04eb\u04ee\3\2"+
		"\2\2\u04ec\u04ea\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed\u04f1\3\2\2\2\u04ee"+
		"\u04ec\3\2\2\2\u04ef\u04f1\7\r\2\2\u04f0\u04e5\3\2\2\2\u04f0\u04ef\3\2"+
		"\2\2\u04f0\u04f1\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2\u04f3\7\7\2\2\u04f3"+
		"\u0505\3\2\2\2\u04f4\u04f5\7\6\2\2\u04f5\u04f6\5p9\2\u04f6\u04f7\7\7\2"+
		"\2\u04f7\u0505\3\2\2\2\u04f8\u04fa\7}\2\2\u04f9\u04f8\3\2\2\2\u04f9\u04fa"+
		"\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u04fd\7[\2\2\u04fc\u04f9\3\2\2\2\u04fc"+
		"\u04fd\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe\u04ff\7\6\2\2\u04ff\u0500\5X"+
		"-\2\u0500\u0501\7\7\2\2\u0501\u0505\3\2\2\2\u0502\u0505\5 \21\2\u0503"+
		"\u0505\5\6\4\2\u0504\u04d2\3\2\2\2\u0504\u04dc\3\2\2\2\u0504\u04df\3\2"+
		"\2\2\u0504\u04e2\3\2\2\2\u0504\u04f4\3\2\2\2\u0504\u04fc\3\2\2\2\u0504"+
		"\u0502\3\2\2\2\u0504\u0503\3\2\2\2\u0505\u0547\3\2\2\2\u0506\u0507\f\20"+
		"\2\2\u0507\u0508\7\23\2\2\u0508\u0546\5p9\21\u0509\u050a\f\17\2\2\u050a"+
		"\u050b\t\5\2\2\u050b\u0546\5p9\20\u050c\u050d\f\16\2\2\u050d\u050e\t\6"+
		"\2\2\u050e\u0546\5p9\17\u050f\u0510\f\r\2\2\u0510\u0511\t\7\2\2\u0511"+
		"\u0546\5p9\16\u0512\u0513\f\f\2\2\u0513\u0514\t\b\2\2\u0514\u0546\5p9"+
		"\r\u0515\u0522\f\13\2\2\u0516\u0523\7\f\2\2\u0517\u0523\7\36\2\2\u0518"+
		"\u0523\7%\2\2\u0519\u0523\7&\2\2\u051a\u0523\7r\2\2\u051b\u051c\7r\2\2"+
		"\u051c\u0523\7}\2\2\u051d\u0523\7i\2\2\u051e\u0523\7w\2\2\u051f\u0523"+
		"\7c\2\2\u0520\u0523\7y\2\2\u0521\u0523\7\u008f\2\2\u0522\u0516\3\2\2\2"+
		"\u0522\u0517\3\2\2\2\u0522\u0518\3\2\2\2\u0522\u0519\3\2\2\2\u0522\u051a"+
		"\3\2\2\2\u0522\u051b\3\2\2\2\u0522\u051d\3\2\2\2\u0522\u051e\3\2\2\2\u0522"+
		"\u051f\3\2\2\2\u0522\u0520\3\2\2\2\u0522\u0521\3\2\2\2\u0523\u0524\3\2"+
		"\2\2\u0524\u0546\5p9\f\u0525\u0526\f\n\2\2\u0526\u0527\7\62\2\2\u0527"+
		"\u0546\5p9\13\u0528\u0529\f\t\2\2\u0529\u052a\7\u0084\2\2\u052a\u0546"+
		"\5p9\n\u052b\u052d\f\6\2\2\u052c\u052e\7}\2\2\u052d\u052c\3\2\2\2\u052d"+
		"\u052e\3\2\2\2\u052e\u052f\3\2\2\2\u052f\u0543\7i\2\2\u0530\u053a\7\6"+
		"\2\2\u0531\u053b\5X-\2\u0532\u0537\5p9\2\u0533\u0534\7\13\2\2\u0534\u0536"+
		"\5p9\2\u0535\u0533\3\2\2\2\u0536\u0539\3\2\2\2\u0537\u0535\3\2\2\2\u0537"+
		"\u0538\3\2\2\2\u0538\u053b\3\2\2\2\u0539\u0537\3\2\2\2\u053a\u0531\3\2"+
		"\2\2\u053a\u0532\3\2\2\2\u053a\u053b\3\2\2\2\u053b\u053c\3\2\2\2\u053c"+
		"\u0544\7\7\2\2\u053d\u053e\5\u00b6\\\2\u053e\u053f\7\5\2\2\u053f\u0541"+
		"\3\2\2\2\u0540\u053d\3\2\2\2\u0540\u0541\3\2\2\2\u0541\u0542\3\2\2\2\u0542"+
		"\u0544\5\u00ba^\2\u0543\u0530\3\2\2\2\u0543\u0540\3\2\2\2\u0544\u0546"+
		"\3\2\2\2\u0545\u0506\3\2\2\2\u0545\u0509\3\2\2\2\u0545\u050c\3\2\2\2\u0545"+
		"\u050f\3\2\2\2\u0545\u0512\3\2\2\2\u0545\u0515\3\2\2\2\u0545\u0525\3\2"+
		"\2\2\u0545\u0528\3\2\2\2\u0545\u052b\3\2\2\2\u0546\u0549\3\2\2\2\u0547"+
		"\u0545\3\2\2\2\u0547\u0548\3\2\2\2\u0548q\3\2\2\2\u0549\u0547\3\2\2\2"+
		"\u054a\u054b\b:\1\2\u054b\u0588\5\u00a4S\2\u054c\u0588\5\u00d6l\2\u054d"+
		"\u054e\5\u00d6l\2\u054e\u054f\7\'\2\2\u054f\u0550\5p9\2\u0550\u0554\7"+
		"(\2\2\u0551\u0552\5r:\2\u0552\u0553\5B\"\2\u0553\u0555\3\2\2\2\u0554\u0551"+
		"\3\2\2\2\u0554\u0555\3\2\2\2\u0555\u0588\3\2\2\2\u0556\u0557\5\u00d6l"+
		"\2\u0557\u0558\7\'\2\2\u0558\u0559\5p9\2\u0559\u055a\7(\2\2\u055a\u055b"+
		"\5r:\2\u055b\u055c\5\u00d6l\2\u055c\u055d\7\'\2\2\u055d\u055e\5p9\2\u055e"+
		"\u055f\7(\2\2\u055f\u0588\3\2\2\2\u0560\u0561\5\u00d6l\2\u0561\u0562\7"+
		"\'\2\2\u0562\u0563\5p9\2\u0563\u0564\7(\2\2\u0564\u0567\5r:\2\u0565\u0568"+
		"\5\u00d6l\2\u0566\u0568\5\u00a2R\2\u0567\u0565\3\2\2\2\u0567\u0566\3\2"+
		"\2\2\u0568\u0588\3\2\2\2\u0569\u056a\5B\"\2\u056a\u056d\5r:\2\u056b\u056e"+
		"\5\u00d6l\2\u056c\u056e\5\u00a2R\2\u056d\u056b\3\2\2\2\u056d\u056c\3\2"+
		"\2\2\u056e\u0588\3\2\2\2\u056f\u0573\5B\"\2\u0570\u0571\5r:\2\u0571\u0572"+
		"\5B\"\2\u0572\u0574\3\2\2\2\u0573\u0570\3\2\2\2\u0573\u0574\3\2\2\2\u0574"+
		"\u0588\3\2\2\2\u0575\u0576\5B\"\2\u0576\u0577\5r:\2\u0577\u0578\5\u00d6"+
		"l\2\u0578\u0579\7\'\2\2\u0579\u057a\5p9\2\u057a\u057b\7(\2\2\u057b\u0588"+
		"\3\2\2\2\u057c\u057d\7\6\2\2\u057d\u057e\5r:\2\u057e\u057f\7\7\2\2\u057f"+
		"\u0588\3\2\2\2\u0580\u0581\7>\2\2\u0581\u0582\7\6\2\2\u0582\u0583\5r:"+
		"\2\u0583\u0584\7\63\2\2\u0584\u0585\5`\61\2\u0585\u0586\7\7\2\2\u0586"+
		"\u0588\3\2\2\2\u0587\u054a\3\2\2\2\u0587\u054c\3\2\2\2\u0587\u054d\3\2"+
		"\2\2\u0587\u0556\3\2\2\2\u0587\u0560\3\2\2\2\u0587\u0569\3\2\2\2\u0587"+
		"\u056f\3\2\2\2\u0587\u0575\3\2\2\2\u0587\u057c\3\2\2\2\u0587\u0580\3\2"+
		"\2\2\u0588\u05a3\3\2\2\2\u0589\u058a\f\22\2\2\u058a\u058b\t\5\2\2\u058b"+
		"\u05a2\5r:\23\u058c\u058d\f\21\2\2\u058d\u058e\t\6\2\2\u058e\u05a2\5r"+
		":\22\u058f\u0590\f\20\2\2\u0590\u0591\t\b\2\2\u0591\u05a2\5r:\21\u0592"+
		"\u0593\f\17\2\2\u0593\u0594\t\t\2\2\u0594\u05a2\5r:\20\u0595\u0596\f\16"+
		"\2\2\u0596\u0597\7\62\2\2\u0597\u05a2\5r:\17\u0598\u0599\f\r\2\2\u0599"+
		"\u059a\7\u0084\2\2\u059a\u05a2\5r:\16\u059b\u059c\f\f\2\2\u059c\u059d"+
		"\7\23\2\2\u059d\u05a2\5r:\r\u059e\u059f\f\13\2\2\u059f\u05a0\7\n\2\2\u05a0"+
		"\u05a2\5r:\f\u05a1\u0589\3\2\2\2\u05a1\u058c\3\2\2\2\u05a1\u058f\3\2\2"+
		"\2\u05a1\u0592\3\2\2\2\u05a1\u0595\3\2\2\2\u05a1\u0598\3\2\2\2\u05a1\u059b"+
		"\3\2\2\2\u05a1\u059e\3\2\2\2\u05a2\u05a5\3\2\2\2\u05a3\u05a1\3\2\2\2\u05a3"+
		"\u05a4\3\2\2\2\u05a4s\3\2\2\2\u05a5\u05a3\3\2\2\2\u05a6\u05a7\b;\1\2\u05a7"+
		"\u05e8\5\u00a4S\2\u05a8\u05e8\5\u00d6l\2\u05a9\u05aa\5\u00d6l\2\u05aa"+
		"\u05ab\7\'\2\2\u05ab\u05ac\5p9\2\u05ac\u05b0\7(\2\2\u05ad\u05ae\5t;\2"+
		"\u05ae\u05af\5B\"\2\u05af\u05b1\3\2\2\2\u05b0\u05ad\3\2\2\2\u05b0\u05b1"+
		"\3\2\2\2\u05b1\u05e8\3\2\2\2\u05b2\u05b3\5\u00d6l\2\u05b3\u05b4\7\'\2"+
		"\2\u05b4\u05b5\5p9\2\u05b5\u05b6\7(\2\2\u05b6\u05b7\5t;\2\u05b7\u05b8"+
		"\5\u00d6l\2\u05b8\u05b9\7\'\2\2\u05b9\u05ba\5p9\2\u05ba\u05bb\7(\2\2\u05bb"+
		"\u05e8\3\2\2\2\u05bc\u05bd\5\u00d6l\2\u05bd\u05be\7\'\2\2\u05be\u05bf"+
		"\5p9\2\u05bf\u05c0\7(\2\2\u05c0\u05c3\5t;\2\u05c1\u05c4\5\u00d6l\2\u05c2"+
		"\u05c4\5\u00a2R\2\u05c3\u05c1\3\2\2\2\u05c3\u05c2\3\2\2\2\u05c4\u05e8"+
		"\3\2\2\2\u05c5\u05c6\5B\"\2\u05c6\u05c9\5t;\2\u05c7\u05ca\5\u00d6l\2\u05c8"+
		"\u05ca\5\u00a2R\2\u05c9\u05c7\3\2\2\2\u05c9\u05c8\3\2\2\2\u05ca\u05e8"+
		"\3\2\2\2\u05cb\u05cf\5B\"\2\u05cc\u05cd\5t;\2\u05cd\u05ce\5B\"\2\u05ce"+
		"\u05d0\3\2\2\2\u05cf\u05cc\3\2\2\2\u05cf\u05d0\3\2\2\2\u05d0\u05e8\3\2"+
		"\2\2\u05d1\u05d2\5B\"\2\u05d2\u05d3\5t;\2\u05d3\u05d4\5\u00d6l\2\u05d4"+
		"\u05d5\7\'\2\2\u05d5\u05d6\5p9\2\u05d6\u05d7\7(\2\2\u05d7\u05e8\3\2\2"+
		"\2\u05d8\u05d9\7\'\2\2\u05d9\u05da\5\u00d6l\2\u05da\u05db\7(\2\2\u05db"+
		"\u05e8\3\2\2\2\u05dc\u05dd\7\6\2\2\u05dd\u05de\5t;\2\u05de\u05df\7\7\2"+
		"\2\u05df\u05e8\3\2\2\2\u05e0\u05e1\7>\2\2\u05e1\u05e2\7\6\2\2\u05e2\u05e3"+
		"\5t;\2\u05e3\u05e4\7\63\2\2\u05e4\u05e5\5`\61\2\u05e5\u05e6\7\7\2\2\u05e6"+
		"\u05e8\3\2\2\2\u05e7\u05a6\3\2\2\2\u05e7\u05a8\3\2\2\2\u05e7\u05a9\3\2"+
		"\2\2\u05e7\u05b2\3\2\2\2\u05e7\u05bc\3\2\2\2\u05e7\u05c5\3\2\2\2\u05e7"+
		"\u05cb\3\2\2\2\u05e7\u05d1\3\2\2\2\u05e7\u05d8\3\2\2\2\u05e7\u05dc\3\2"+
		"\2\2\u05e7\u05e0\3\2\2\2\u05e8\u0603\3\2\2\2\u05e9\u05ea\f\23\2\2\u05ea"+
		"\u05eb\t\5\2\2\u05eb\u0602\5t;\24\u05ec\u05ed\f\22\2\2\u05ed\u05ee\t\6"+
		"\2\2\u05ee\u0602\5t;\23\u05ef\u05f0\f\21\2\2\u05f0\u05f1\t\b\2\2\u05f1"+
		"\u0602\5t;\22\u05f2\u05f3\f\20\2\2\u05f3\u05f4\t\t\2\2\u05f4\u0602\5t"+
		";\21\u05f5\u05f6\f\17\2\2\u05f6\u05f7\7\62\2\2\u05f7\u0602\5t;\20\u05f8"+
		"\u05f9\f\16\2\2\u05f9\u05fa\7\u0084\2\2\u05fa\u0602\5t;\17\u05fb\u05fc"+
		"\f\r\2\2\u05fc\u05fd\7\23\2\2\u05fd\u0602\5t;\16\u05fe\u05ff\f\f\2\2\u05ff"+
		"\u0600\7\n\2\2\u0600\u0602\5t;\r\u0601\u05e9\3\2\2\2\u0601\u05ec\3\2\2"+
		"\2\u0601\u05ef\3\2\2\2\u0601\u05f2\3\2\2\2\u0601\u05f5\3\2\2\2\u0601\u05f8"+
		"\3\2\2\2\u0601\u05fb\3\2\2\2\u0601\u05fe\3\2\2\2\u0602\u0605\3\2\2\2\u0603"+
		"\u0601\3\2\2\2\u0603\u0604\3\2\2\2\u0604u\3\2\2\2\u0605\u0603\3\2\2\2"+
		"\u0606\u0607\b<\1\2\u0607\u0613\5\u00a4S\2\u0608\u0613\5\u00d6l\2\u0609"+
		"\u060a\5\u00d6l\2\u060a\u060b\t\n\2\2\u060b\u0613\3\2\2\2\u060c\u060d"+
		"\t\n\2\2\u060d\u0613\5\u00d6l\2\u060e\u060f\7\6\2\2\u060f\u0610\5v<\2"+
		"\u0610\u0611\7\7\2\2\u0611\u0613\3\2\2\2\u0612\u0606\3\2\2\2\u0612\u0608"+
		"\3\2\2\2\u0612\u0609\3\2\2\2\u0612\u060c\3\2\2\2\u0612\u060e\3\2\2\2\u0613"+
		"\u0619\3\2\2\2\u0614\u0615\f\4\2\2\u0615\u0616\t\13\2\2\u0616\u0618\5"+
		"v<\5\u0617\u0614\3\2\2\2\u0618\u061b\3\2\2\2\u0619\u0617\3\2\2\2\u0619"+
		"\u061a\3\2\2\2\u061aw\3\2\2\2\u061b\u0619\3\2\2\2\u061c\u061d\b=\1\2\u061d"+
		"\u0656\5\u00a4S\2\u061e\u0656\5\u00d6l\2\u061f\u0620\5\u00b6\\\2\u0620"+
		"\u0621\7\5\2\2\u0621\u0623\3\2\2\2\u0622\u061f\3\2\2\2\u0622\u0623\3\2"+
		"\2\2\u0623\u0624\3\2\2\2\u0624\u0625\5\u00ba^\2\u0625\u0626\7\5\2\2\u0626"+
		"\u0628\3\2\2\2\u0627\u0622\3\2\2\2\u0627\u0628\3\2\2\2\u0628\u0629\3\2"+
		"\2\2\u0629\u0656\5\u00c0a\2\u062a\u062b\5\u00a6T\2\u062b\u062c\5x=\21"+
		"\u062c\u0656\3\2\2\2\u062d\u062e\5\u00b4[\2\u062e\u063b\7\6\2\2\u062f"+
		"\u0631\7Q\2\2\u0630\u062f\3\2\2\2\u0630\u0631\3\2\2\2\u0631\u0632\3\2"+
		"\2\2\u0632\u0637\5x=\2\u0633\u0634\7\13\2\2\u0634\u0636\5x=\2\u0635\u0633"+
		"\3\2\2\2\u0636\u0639\3\2\2\2\u0637\u0635\3\2\2\2\u0637\u0638\3\2\2\2\u0638"+
		"\u063c\3\2\2\2\u0639\u0637\3\2\2\2\u063a\u063c\7\r\2\2\u063b\u0630\3\2"+
		"\2\2\u063b\u063a\3\2\2\2\u063b\u063c\3\2\2\2\u063c\u063d\3\2\2\2\u063d"+
		"\u063e\7\7\2\2\u063e\u0656\3\2\2\2\u063f\u0640\7\6\2\2\u0640\u0641\5x"+
		"=\2\u0641\u0642\7\7\2\2\u0642\u0656\3\2\2\2\u0643\u0644\7\'\2\2\u0644"+
		"\u0645\5x=\2\u0645\u0646\7(\2\2\u0646\u0656\3\2\2\2\u0647\u0648\7\'\2"+
		"\2\u0648\u0649\5\24\13\2\u0649\u064a\7(\2\2\u064a\u0656\3\2\2\2\u064b"+
		"\u064d\7}\2\2\u064c\u064b\3\2\2\2\u064c\u064d\3\2\2\2\u064d\u064e\3\2"+
		"\2\2\u064e\u0650\7[\2\2\u064f\u064c\3\2\2\2\u064f\u0650\3\2\2\2\u0650"+
		"\u0651\3\2\2\2\u0651\u0652\7\6\2\2\u0652\u0653\5X-\2\u0653\u0654\7\7\2"+
		"\2\u0654\u0656\3\2\2\2\u0655\u061c\3\2\2\2\u0655\u061e\3\2\2\2\u0655\u0627"+
		"\3\2\2\2\u0655\u062a\3\2\2\2\u0655\u062d\3\2\2\2\u0655\u063f\3\2\2\2\u0655"+
		"\u0643\3\2\2\2\u0655\u0647\3\2\2\2\u0655\u064f\3\2\2\2\u0656\u0698\3\2"+
		"\2\2\u0657\u0658\f\20\2\2\u0658\u0659\7\23\2\2\u0659\u0697\5x=\21\u065a"+
		"\u065b\f\17\2\2\u065b\u065c\t\5\2\2\u065c\u0697\5x=\20\u065d\u065e\f\16"+
		"\2\2\u065e\u065f\t\6\2\2\u065f\u0697\5x=\17\u0660\u0661\f\r\2\2\u0661"+
		"\u0662\t\7\2\2\u0662\u0697\5x=\16\u0663\u0664\f\f\2\2\u0664\u0665\t\b"+
		"\2\2\u0665\u0697\5x=\r\u0666\u0673\f\13\2\2\u0667\u0674\7\f\2\2\u0668"+
		"\u0674\7\36\2\2\u0669\u0674\7%\2\2\u066a\u0674\7&\2\2\u066b\u0674\7r\2"+
		"\2\u066c\u066d\7r\2\2\u066d\u0674\7}\2\2\u066e\u0674\7i\2\2\u066f\u0674"+
		"\7w\2\2\u0670\u0674\7c\2\2\u0671\u0674\7y\2\2\u0672\u0674\7\u008f\2\2"+
		"\u0673\u0667\3\2\2\2\u0673\u0668\3\2\2\2\u0673\u0669\3\2\2\2\u0673\u066a"+
		"\3\2\2\2\u0673\u066b\3\2\2\2\u0673\u066c\3\2\2\2\u0673\u066e\3\2\2\2\u0673"+
		"\u066f\3\2\2\2\u0673\u0670\3\2\2\2\u0673\u0671\3\2\2\2\u0673\u0672\3\2"+
		"\2\2\u0674\u0675\3\2\2\2\u0675\u0697\5x=\f\u0676\u0677\f\n\2\2\u0677\u0678"+
		"\7\62\2\2\u0678\u0697\5x=\13\u0679\u067a\f\t\2\2\u067a\u067b\7\u0084\2"+
		"\2\u067b\u0697\5x=\n\u067c\u067e\f\4\2\2\u067d\u067f\7}\2\2\u067e\u067d"+
		"\3\2\2\2\u067e\u067f\3\2\2\2\u067f\u0680\3\2\2\2\u0680\u0694\7i\2\2\u0681"+
		"\u068b\7\6\2\2\u0682\u068c\5X-\2\u0683\u0688\5x=\2\u0684\u0685\7\13\2"+
		"\2\u0685\u0687\5x=\2\u0686\u0684\3\2\2\2\u0687\u068a\3\2\2\2\u0688\u0686"+
		"\3\2\2\2\u0688\u0689\3\2\2\2\u0689\u068c\3\2\2\2\u068a\u0688\3\2\2\2\u068b"+
		"\u0682\3\2\2\2\u068b\u0683\3\2\2\2\u068b\u068c\3\2\2\2\u068c\u068d\3\2"+
		"\2\2\u068d\u0695\7\7\2\2\u068e\u068f\5\u00b6\\\2\u068f\u0690\7\5\2\2\u0690"+
		"\u0692\3\2\2\2\u0691\u068e\3\2\2\2\u0691\u0692\3\2\2\2\u0692\u0693\3\2"+
		"\2\2\u0693\u0695\5\u00ba^\2\u0694\u0681\3\2\2\2\u0694\u0691\3\2\2\2\u0695"+
		"\u0697\3\2\2\2\u0696\u0657\3\2\2\2\u0696\u065a\3\2\2\2\u0696\u065d\3\2"+
		"\2\2\u0696\u0660\3\2\2\2\u0696\u0663\3\2\2\2\u0696\u0666\3\2\2\2\u0696"+
		"\u0676\3\2\2\2\u0696\u0679\3\2\2\2\u0696\u067c\3\2\2\2\u0697\u069a\3\2"+
		"\2\2\u0698\u0696\3\2\2\2\u0698\u0699\3\2\2\2\u0699y\3\2\2\2\u069a\u0698"+
		"\3\2\2\2\u069b\u069f\7\u008e\2\2\u069c\u069d\5\u00b6\\\2\u069d\u069e\7"+
		"\5\2\2\u069e\u06a0\3\2\2\2\u069f\u069c\3\2\2\2\u069f\u06a0\3\2\2\2\u06a0"+
		"\u06a1\3\2\2\2\u06a1\u06ad\5\u00c4c\2\u06a2\u06a3\7\6\2\2\u06a3\u06a8"+
		"\5|?\2\u06a4\u06a5\7\13\2\2\u06a5\u06a7\5|?\2\u06a6\u06a4\3\2\2\2\u06a7"+
		"\u06aa\3\2\2\2\u06a8\u06a6\3\2\2\2\u06a8\u06a9\3\2\2\2\u06a9\u06ab\3\2"+
		"\2\2\u06aa\u06a8\3\2\2\2\u06ab\u06ac\7\7\2\2\u06ac\u06ae\3\2\2\2\u06ad"+
		"\u06a2\3\2\2\2\u06ad\u06ae\3\2\2\2\u06ae\u06c1\3\2\2\2\u06af\u06b0\7\u0082"+
		"\2\2\u06b0\u06b9\t\f\2\2\u06b1\u06b2\7\u009b\2\2\u06b2\u06ba\7\177\2\2"+
		"\u06b3\u06b4\7\u009b\2\2\u06b4\u06ba\7K\2\2\u06b5\u06ba\7<\2\2\u06b6\u06ba"+
		"\7\u0094\2\2\u06b7\u06b8\7|\2\2\u06b8\u06ba\7,\2\2\u06b9\u06b1\3\2\2\2"+
		"\u06b9\u06b3\3\2\2\2\u06b9\u06b5\3\2\2\2\u06b9\u06b6\3\2\2\2\u06b9\u06b7"+
		"\3\2\2\2\u06ba\u06be\3\2\2\2\u06bb\u06bc\7y\2\2\u06bc\u06be\5\u00b2Z\2"+
		"\u06bd\u06af\3\2\2\2\u06bd\u06bb\3\2\2\2\u06be\u06c0\3\2\2\2\u06bf\u06bd"+
		"\3\2\2\2\u06c0\u06c3\3\2\2\2\u06c1\u06bf\3\2\2\2\u06c1\u06c2\3\2\2\2\u06c2"+
		"\u06d1\3\2\2\2\u06c3\u06c1\3\2\2\2\u06c4\u06c6\7}\2\2\u06c5\u06c4\3\2"+
		"\2\2\u06c5\u06c6\3\2\2\2\u06c6\u06c7\3\2\2\2\u06c7\u06cc\7L\2\2\u06c8"+
		"\u06c9\7l\2\2\u06c9\u06cd\7M\2\2\u06ca\u06cb\7l\2\2\u06cb\u06cd\7h\2\2"+
		"\u06cc\u06c8\3\2\2\2\u06cc\u06ca\3\2\2\2\u06cc\u06cd\3\2\2\2\u06cd\u06cf"+
		"\3\2\2\2\u06ce\u06d0\7W\2\2\u06cf\u06ce\3\2\2\2\u06cf\u06d0\3\2\2\2\u06d0"+
		"\u06d2\3\2\2\2\u06d1\u06c5\3\2\2\2\u06d1\u06d2\3\2\2\2\u06d2{\3\2\2\2"+
		"\u06d3\u06d4\5\u00b2Z\2\u06d4}\3\2\2\2\u06d5\u06d8\5\u00c0a\2\u06d6\u06d7"+
		"\7@\2\2\u06d7\u06d9\5\u00c2b\2\u06d8\u06d6\3\2\2\2\u06d8\u06d9\3\2\2\2"+
		"\u06d9\u06db\3\2\2\2\u06da\u06dc\t\4\2\2\u06db\u06da\3\2\2\2\u06db\u06dc"+
		"\3\2\2\2\u06dc\177\3\2\2\2\u06dd\u06de\7D\2\2\u06de\u06e0\5\u00b2Z\2\u06df"+
		"\u06dd\3\2\2\2\u06df\u06e0\3\2\2\2\u06e0\u06ea\3\2\2\2\u06e1\u06eb\5\u0082"+
		"B\2\u06e2\u06eb\5\u0088E\2\u06e3\u06eb\5\u0086D\2\u06e4\u06e5\7?\2\2\u06e5"+
		"\u06e6\7\6\2\2\u06e6\u06e7\5p9\2\u06e7\u06e8\7\7\2\2\u06e8\u06eb\3\2\2"+
		"\2\u06e9\u06eb\5\u0084C\2\u06ea\u06e1\3\2\2\2\u06ea\u06e2\3\2\2\2\u06ea"+
		"\u06e3\3\2\2\2\u06ea\u06e4\3\2\2\2\u06ea\u06e9\3\2\2\2\u06eb\u0081\3\2"+
		"\2\2\u06ec\u06ed\7\u0089\2\2\u06ed\u06ee\7u\2\2\u06ee\u06ef\7\6\2\2\u06ef"+
		"\u06f4\5~@\2\u06f0\u06f1\7\13\2\2\u06f1\u06f3\5~@\2\u06f2\u06f0\3\2\2"+
		"\2\u06f3\u06f6\3\2\2\2\u06f4\u06f2\3\2\2\2\u06f4\u06f5\3\2\2\2\u06f5\u06f7"+
		"\3\2\2\2\u06f6\u06f4\3\2\2\2\u06f7\u06f8\7\7\2\2\u06f8\u0083\3\2\2\2\u06f9"+
		"\u06fa\7_\2\2\u06fa\u06fb\7u\2\2\u06fb\u06fc\7\6\2\2\u06fc\u0701\5\u008a"+
		"F\2\u06fd\u06fe\7\13\2\2\u06fe\u0700\5\u008aF\2\u06ff\u06fd\3\2\2\2\u0700"+
		"\u0703\3\2\2\2\u0701\u06ff\3\2\2\2\u0701\u0702\3\2\2\2\u0702\u0704\3\2"+
		"\2\2\u0703\u0701\3\2\2\2\u0704\u0705\7\7\2\2\u0705\u0706\5z>\2\u0706\u0085"+
		"\3\2\2\2\u0707\u0709\7\u00a5\2\2\u0708\u070a\7u\2\2\u0709\u0708\3\2\2"+
		"\2\u0709\u070a\3\2\2\2\u070a\u070c\3\2\2\2\u070b\u070d\5\u00b2Z\2\u070c"+
		"\u070b\3\2\2\2\u070c\u070d\3\2\2\2\u070d\u070e\3\2\2\2\u070e\u070f\7\6"+
		"\2\2\u070f\u0714\5~@\2\u0710\u0711\7\13\2\2\u0711\u0713\5~@\2\u0712\u0710"+
		"\3\2\2\2\u0713\u0716\3\2\2\2\u0714\u0712\3\2\2\2\u0714\u0715\3\2\2\2\u0715"+
		"\u0717\3\2\2\2\u0716\u0714\3\2\2\2\u0717\u0718\7\7\2\2\u0718\u0087\3\2"+
		"\2\2\u0719\u071b\7u\2\2\u071a\u071c\5\u00b2Z\2\u071b\u071a\3\2\2\2\u071b"+
		"\u071c\3\2\2\2\u071c\u071d\3\2\2\2\u071d\u071e\7\6\2\2\u071e\u0723\5~"+
		"@\2\u071f\u0720\7\13\2\2\u0720\u0722\5~@\2\u0721\u071f\3\2\2\2\u0722\u0725"+
		"\3\2\2\2\u0723\u0721\3\2\2\2\u0723\u0724\3\2\2\2\u0724\u0726\3\2\2\2\u0725"+
		"\u0723\3\2\2\2\u0726\u0727\7\7\2\2\u0727\u0089\3\2\2\2\u0728\u0729\5\u00c0"+
		"a\2\u0729\u008b\3\2\2\2\u072a\u072b\5\u00b6\\\2\u072b\u072c\7\5\2\2\u072c"+
		"\u072e\3\2\2\2\u072d\u072a\3\2\2\2\u072d\u072e\3\2\2\2\u072e\u072f\3\2"+
		"\2\2\u072f\u0735\5\u00ba^\2\u0730\u0731\7k\2\2\u0731\u0732\7;\2\2\u0732"+
		"\u0736\5\u00c6d\2\u0733\u0734\7}\2\2\u0734\u0736\7k\2\2\u0735\u0730\3"+
		"\2\2\2\u0735\u0733\3\2\2\2\u0735\u0736\3\2\2\2\u0736\u008d\3\2\2\2\u0737"+
		"\u0739\5p9\2\u0738\u073a\t\4\2\2\u0739\u0738\3\2\2\2\u0739\u073a\3\2\2"+
		"\2\u073a\u008f\3\2\2\2\u073b\u073f\5\u00a2R\2\u073c\u073f\5\u00b2Z\2\u073d"+
		"\u073f\7\u00b7\2\2\u073e\u073b\3\2\2\2\u073e\u073c\3\2\2\2\u073e\u073d"+
		"\3\2\2\2\u073f\u0091\3\2\2\2\u0740\u074c\5\u00ba^\2\u0741\u0742\7\6\2"+
		"\2\u0742\u0747\5\u00c0a\2\u0743\u0744\7\13\2\2\u0744\u0746\5\u00c0a\2"+
		"\u0745\u0743\3\2\2\2\u0746\u0749\3\2\2\2\u0747\u0745\3\2\2\2\u0747\u0748"+
		"\3\2\2\2\u0748\u074a\3\2\2\2\u0749\u0747\3\2\2\2\u074a\u074b\7\7\2\2\u074b"+
		"\u074d\3\2\2\2\u074c\u0741\3\2\2\2\u074c\u074d\3\2\2\2\u074d\u074e\3\2"+
		"\2\2\u074e\u074f\7\63\2\2\u074f\u0750\7\6\2\2\u0750\u0751\5X-\2\u0751"+
		"\u0752\7\7\2\2\u0752\u0093\3\2\2\2\u0753\u0760\7\r\2\2\u0754\u0755\5\u00ba"+
		"^\2\u0755\u0756\7\5\2\2\u0756\u0757\7\r\2\2\u0757\u0760\3\2\2\2\u0758"+
		"\u075d\5p9\2\u0759\u075b\7\63\2\2\u075a\u0759\3\2\2\2\u075a\u075b\3\2"+
		"\2\2\u075b\u075c\3\2\2\2\u075c\u075e\5\u00acW\2\u075d\u075a\3\2\2\2\u075d"+
		"\u075e\3\2\2\2\u075e\u0760\3\2\2\2\u075f\u0753\3\2\2\2\u075f\u0754\3\2"+
		"\2\2\u075f\u0758\3\2\2\2\u0760\u0095\3\2\2\2\u0761\u0762\5\u00b6\\\2\u0762"+
		"\u0763\7\5\2\2\u0763\u0765\3\2\2\2\u0764\u0761\3\2\2\2\u0764\u0765\3\2"+
		"\2\2\u0765\u0766\3\2\2\2\u0766\u076b\5\u00ba^\2\u0767\u0769\7\63\2\2\u0768"+
		"\u0767\3\2\2\2\u0768\u0769\3\2\2\2\u0769\u076a\3\2\2\2\u076a\u076c\5\u00d2"+
		"j\2\u076b\u0768\3\2\2\2\u076b\u076c\3\2\2\2\u076c\u0772\3\2\2\2\u076d"+
		"\u076e\7k\2\2\u076e\u076f\7;\2\2\u076f\u0773\5\u00c6d\2\u0770\u0771\7"+
		"}\2\2\u0771\u0773\7k\2\2\u0772\u076d\3\2\2\2\u0772\u0770\3\2\2\2\u0772"+
		"\u0773\3\2\2\2\u0773\u0791\3\2\2\2\u0774\u077e\7\6\2\2\u0775\u077a\5\u0096"+
		"L\2\u0776\u0777\7\13\2\2\u0777\u0779\5\u0096L\2\u0778\u0776\3\2\2\2\u0779"+
		"\u077c\3\2\2\2\u077a\u0778\3\2\2\2\u077a\u077b\3\2\2\2\u077b\u077f\3\2"+
		"\2\2\u077c\u077a\3\2\2\2\u077d\u077f\5\u0098M\2\u077e\u0775\3\2\2\2\u077e"+
		"\u077d\3\2\2\2\u077f\u0780\3\2\2\2\u0780\u0785\7\7\2\2\u0781\u0783\7\63"+
		"\2\2\u0782\u0781\3\2\2\2\u0782\u0783\3\2\2\2\u0783\u0784\3\2\2\2\u0784"+
		"\u0786\5\u00d2j\2\u0785\u0782\3\2\2\2\u0785\u0786\3\2\2\2\u0786\u0791"+
		"\3\2\2\2\u0787\u0788\7\6\2\2\u0788\u0789\5X-\2\u0789\u078e\7\7\2\2\u078a"+
		"\u078c\7\63\2\2\u078b\u078a\3\2\2\2\u078b\u078c\3\2\2\2\u078c\u078d\3"+
		"\2\2\2\u078d\u078f\5\u00d2j\2\u078e\u078b\3\2\2\2\u078e\u078f\3\2\2\2"+
		"\u078f\u0791\3\2\2\2\u0790\u0764\3\2\2\2\u0790\u0774\3\2\2\2\u0790\u0787"+
		"\3\2\2\2\u0791\u0097\3\2\2\2\u0792\u0799\5\u0096L\2\u0793\u0794\5\u009a"+
		"N\2\u0794\u0795\5\u0096L\2\u0795\u0796\5\u009cO\2\u0796\u0798\3\2\2\2"+
		"\u0797\u0793\3\2\2\2\u0798\u079b\3\2\2\2\u0799\u0797\3\2\2\2\u0799\u079a"+
		"\3\2\2\2\u079a\u0099\3\2\2\2\u079b\u0799\3\2\2\2\u079c\u07a6\7\13\2\2"+
		"\u079d\u079f\7v\2\2\u079e\u07a0\7\u0086\2\2\u079f\u079e\3\2\2\2\u079f"+
		"\u07a0\3\2\2\2\u07a0\u07a3\3\2\2\2\u07a1\u07a3\7m\2\2\u07a2\u079d\3\2"+
		"\2\2\u07a2\u07a1\3\2\2\2\u07a2\u07a3\3\2\2\2\u07a3\u07a4\3\2\2\2\u07a4"+
		"\u07a6\7t\2\2\u07a5\u079c\3\2\2\2\u07a5\u07a2\3\2\2\2\u07a6\u009b\3\2"+
		"\2\2\u07a7\u07a8\7\u0082\2\2\u07a8\u07aa\5p9\2\u07a9\u07a7\3\2\2\2\u07a9"+
		"\u07aa\3\2\2\2\u07aa\u009d\3\2\2\2\u07ab\u07ad\7\u009a\2\2\u07ac\u07ae"+
		"\t\3\2\2\u07ad\u07ac\3\2\2\2\u07ad\u07ae\3\2\2\2\u07ae\u07af\3\2\2\2\u07af"+
		"\u07b4\5\u0094K\2\u07b0\u07b1\7\13\2\2\u07b1\u07b3\5\u0094K\2\u07b2\u07b0"+
		"\3\2\2\2\u07b3\u07b6\3\2\2\2\u07b4\u07b2\3\2\2\2\u07b4\u07b5\3\2\2\2\u07b5"+
		"\u07c3\3\2\2\2\u07b6\u07b4\3\2\2\2\u07b7\u07c1\7`\2\2\u07b8\u07bd\5\u0096"+
		"L\2\u07b9\u07ba\7\13\2\2\u07ba\u07bc\5\u0096L\2\u07bb\u07b9\3\2\2\2\u07bc"+
		"\u07bf\3\2\2\2\u07bd\u07bb\3\2\2\2\u07bd\u07be\3\2\2\2\u07be\u07c2\3\2"+
		"\2\2\u07bf\u07bd\3\2\2\2\u07c0\u07c2\5\u0098M\2\u07c1\u07b8\3\2\2\2\u07c1"+
		"\u07c0\3\2\2\2\u07c2\u07c4\3\2\2\2\u07c3\u07b7\3\2\2\2\u07c3\u07c4\3\2"+
		"\2\2\u07c4\u07c7\3\2\2\2\u07c5\u07c6\7\u00ad\2\2\u07c6\u07c8\5p9\2\u07c7"+
		"\u07c5\3\2\2\2\u07c7\u07c8\3\2\2\2\u07c8\u07d7\3\2\2\2\u07c9\u07ca\7d"+
		"\2\2\u07ca\u07cb\7;\2\2\u07cb\u07d0\5p9\2\u07cc\u07cd\7\13\2\2\u07cd\u07cf"+
		"\5p9\2\u07ce\u07cc\3\2\2\2\u07cf\u07d2\3\2\2\2\u07d0\u07ce\3\2\2\2\u07d0"+
		"\u07d1\3\2\2\2\u07d1\u07d5\3\2\2\2\u07d2\u07d0\3\2\2\2\u07d3\u07d4\7e"+
		"\2\2\u07d4\u07d6\5p9\2\u07d5\u07d3\3\2\2\2\u07d5\u07d6\3\2\2\2\u07d6\u07d8"+
		"\3\2\2\2\u07d7\u07c9\3\2\2\2\u07d7\u07d8\3\2\2\2\u07d8\u07f6\3\2\2\2\u07d9"+
		"\u07da\7\u00a9\2\2\u07da\u07db\7\6\2\2\u07db\u07e0\5p9\2\u07dc\u07dd\7"+
		"\13\2\2\u07dd\u07df\5p9\2\u07de\u07dc\3\2\2\2\u07df\u07e2\3\2\2\2\u07e0"+
		"\u07de\3\2\2\2\u07e0\u07e1\3\2\2\2\u07e1\u07e3\3\2\2\2\u07e2\u07e0\3\2"+
		"\2\2\u07e3\u07f2\7\7\2\2\u07e4\u07e5\7\13\2\2\u07e5\u07e6\7\6\2\2\u07e6"+
		"\u07eb\5p9\2\u07e7\u07e8\7\13\2\2\u07e8\u07ea\5p9\2\u07e9\u07e7\3\2\2"+
		"\2\u07ea\u07ed\3\2\2\2\u07eb\u07e9\3\2\2\2\u07eb\u07ec\3\2\2\2\u07ec\u07ee"+
		"\3\2\2\2\u07ed\u07eb\3\2\2\2\u07ee\u07ef\7\7\2\2\u07ef\u07f1\3\2\2\2\u07f0"+
		"\u07e4\3\2\2\2\u07f1\u07f4\3\2\2\2\u07f2\u07f0\3\2\2\2\u07f2\u07f3\3\2"+
		"\2\2\u07f3\u07f6\3\2\2\2\u07f4\u07f2\3\2\2\2\u07f5\u07ab\3\2\2\2\u07f5"+
		"\u07d9\3\2\2\2\u07f6\u009f\3\2\2\2\u07f7\u0803\5\u00ba^\2\u07f8\u07f9"+
		"\7\6\2\2\u07f9\u07fe\5\u00c0a\2\u07fa\u07fb\7\13\2\2\u07fb\u07fd\5\u00c0"+
		"a\2\u07fc\u07fa\3\2\2\2\u07fd\u0800\3\2\2\2\u07fe\u07fc\3\2\2\2\u07fe"+
		"\u07ff\3\2\2\2\u07ff\u0801\3\2\2\2\u0800\u07fe\3\2\2\2\u0801\u0802\7\7"+
		"\2\2\u0802\u0804\3\2\2\2\u0803\u07f8\3\2\2\2\u0803\u0804\3\2\2\2\u0804"+
		"\u00a1\3\2\2\2\u0805\u0807\t\6\2\2\u0806\u0805\3\2\2\2\u0806\u0807\3\2"+
		"\2\2\u0807\u0808\3\2\2\2\u0808\u080b\7\u00b5\2\2\u0809\u080b\7\r\2\2\u080a"+
		"\u0806\3\2\2\2\u080a\u0809\3\2\2\2\u080b\u00a3\3\2\2\2\u080c\u080d\t\r"+
		"\2\2\u080d\u00a5\3\2\2\2\u080e\u080f\t\16\2\2\u080f\u00a7\3\2\2\2\u0810"+
		"\u0811\7\u00b7\2\2\u0811\u00a9\3\2\2\2\u0812\u0815\5p9\2\u0813\u0815\5"+
		"^\60\2\u0814\u0812\3\2\2\2\u0814\u0813\3\2\2\2\u0815\u00ab\3\2\2\2\u0816"+
		"\u0817\t\17\2\2\u0817\u00ad\3\2\2\2\u0818\u0819\t\20\2\2\u0819\u00af\3"+
		"\2\2\2\u081a\u081c\13\2\2\2\u081b\u081a\3\2\2\2\u081c\u081d\3\2\2\2\u081d"+
		"\u081b\3\2\2\2\u081d\u081e\3\2\2\2\u081e\u00b1\3\2\2\2\u081f\u0820\5\u00d6"+
		"l\2\u0820\u00b3\3\2\2\2\u0821\u0822\5\u00d6l\2\u0822\u00b5\3\2\2\2\u0823"+
		"\u0824\5\u00d6l\2\u0824\u00b7\3\2\2\2\u0825\u0826\5\u00d6l\2\u0826\u00b9"+
		"\3\2\2\2\u0827\u0828\5\u00d6l\2\u0828\u00bb\3\2\2\2\u0829\u082a\5\u00d6"+
		"l\2\u082a\u00bd\3\2\2\2\u082b\u082c\5\u00d6l\2\u082c\u00bf\3\2\2\2\u082d"+
		"\u082e\5\u00d6l\2\u082e\u00c1\3\2\2\2\u082f\u0830\5\u00d6l\2\u0830\u00c3"+
		"\3\2\2\2\u0831\u0832\5\u00d6l\2\u0832\u00c5\3\2\2\2\u0833\u0834\5\u00d6"+
		"l\2\u0834\u00c7\3\2\2\2\u0835\u0836\5\u00d6l\2\u0836\u00c9\3\2\2\2\u0837"+
		"\u0838\5\u00d6l\2\u0838\u00cb\3\2\2\2\u0839\u083a\5\u00d6l\2\u083a\u00cd"+
		"\3\2\2\2\u083b\u083c\5\u00d6l\2\u083c\u00cf\3\2\2\2\u083d\u083e\5\u00d6"+
		"l\2\u083e\u00d1\3\2\2\2\u083f\u0840\5\u00d6l\2\u0840\u00d3\3\2\2\2\u0841"+
		"\u0842\5\u00d6l\2\u0842\u00d5\3\2\2\2\u0843\u084a\7\u00b3\2\2\u0844\u084a"+
		"\7\u00b7\2\2\u0845\u0846\7\6\2\2\u0846\u0847\5\u00d6l\2\u0847\u0848\7"+
		"\7\2\2\u0848\u084a\3\2\2\2\u0849\u0843\3\2\2\2\u0849\u0844\3\2\2\2\u0849"+
		"\u0845\3\2\2\2\u084a\u00d7\3\2\2\2\u084b\u0853\7\u00b4\2\2\u084c\u0853"+
		"\5\u00aeX\2\u084d\u0853\7\u00b7\2\2\u084e\u084f\7\6\2\2\u084f\u0850\5"+
		"\u00d6l\2\u0850\u0851\7\7\2\2\u0851\u0853\3\2\2\2\u0852\u084b\3\2\2\2"+
		"\u0852\u084c\3\2\2\2\u0852\u084d\3\2\2\2\u0852\u084e\3\2\2\2\u0853\u00d9"+
		"\3\2\2\2\u0112\u00dd\u00df\u00ea\u00f1\u00f6\u00fc\u0102\u0104\u010e\u0116"+
		"\u0119\u011c\u0127\u012a\u013c\u0146\u0148\u014c\u0153\u015b\u015e\u016d"+
		"\u0171\u017b\u017d\u0189\u018e\u0192\u019e\u01a6\u01b0\u01b8\u01bf\u01c6"+
		"\u01cd\u01d3\u01d6\u01e1\u01f3\u01fb\u01fe\u0201\u0207\u0212\u0217\u0220"+
		"\u0225\u022c\u0231\u0235\u023c\u0243\u0248\u024c\u0253\u0258\u0262\u026a"+
		"\u0270\u0273\u0277\u027b\u0285\u028b\u028e\u0292\u0294\u029b\u02a2\u02ad"+
		"\u02b0\u02bd\u02c5\u02c8\u02ce\u02d2\u02dc\u02df\u02e7\u02ef\u02f1\u02fb"+
		"\u02ff\u0305\u0307\u030c\u0317\u031f\u0322\u0324\u0329\u0330\u0336\u033e"+
		"\u0344\u0349\u034f\u0354\u035e\u0361\u0364\u0367\u0376\u037b\u0384\u0386"+
		"\u038d\u0394\u039d\u039f\u03a9\u03af\u03b4\u03c0\u03c3\u03c9\u03cb\u03d2"+
		"\u03db\u03e0\u03e9\u03f4\u03fb\u0401\u040b\u040e\u0414\u0416\u041a\u0421"+
		"\u042a\u042e\u0430\u0434\u043d\u0442\u0444\u044d\u0458\u045f\u0462\u0471"+
		"\u0476\u047b\u047d\u0484\u048b\u0490\u0494\u0498\u04a7\u04ac\u04af\u04c4"+
		"\u04ca\u04cc\u04d0\u04d7\u04dc\u04e5\u04ec\u04f0\u04f9\u04fc\u0504\u0522"+
		"\u052d\u0537\u053a\u0540\u0543\u0545\u0547\u0554\u0567\u056d\u0573\u0587"+
		"\u05a1\u05a3\u05b0\u05c3\u05c9\u05cf\u05e7\u0601\u0603\u0612\u0619\u0622"+
		"\u0627\u0630\u0637\u063b\u064c\u064f\u0655\u0673\u067e\u0688\u068b\u0691"+
		"\u0694\u0696\u0698\u069f\u06a8\u06ad\u06b9\u06bd\u06c1\u06c5\u06cc\u06cf"+
		"\u06d1\u06d8\u06db\u06df\u06ea\u06f4\u0701\u0709\u070c\u0714\u071b\u0723"+
		"\u072d\u0735\u0739\u073e\u0747\u074c\u075a\u075d\u075f\u0764\u0768\u076b"+
		"\u0772\u077a\u077e\u0782\u0785\u078b\u078e\u0790\u0799\u079f\u07a2\u07a5"+
		"\u07a9\u07ad\u07b4\u07bd\u07c1\u07c3\u07c7\u07d0\u07d5\u07d7\u07e0\u07eb"+
		"\u07f2\u07f5\u07fe\u0803\u0806\u080a\u0814\u081d\u0849\u0852";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}