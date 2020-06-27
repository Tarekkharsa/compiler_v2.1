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
		T__0=1, T__1=2, SCOL=3, DOT=4, OPEN_PAR=5, CLOSE_PAR=6, OPEN_B=7, CLOSE_B=8, 
		AND=9, COMMA=10, ASSIGN=11, STAR=12, PLUS=13, PLUS_PLUS=14, MINUS=15, 
		MINUS_MINUS=16, TILDE=17, PIPE2=18, DIV=19, MOD=20, LT2=21, GT2=22, AMP=23, 
		PIPE=24, LT=25, LT_EQ=26, GT=27, GT_EQ=28, EQ=29, EQ_WITH_PLUS=30, PLUS_WITH_EQ=31, 
		EQ_WITH_MINUS=32, MINUS_WITH_EQ=33, STAR_WITH_EQ=34, DIV_WITH_EQ=35, NOT_EQ1=36, 
		NOT_EQ2=37, OPEN_ARRAY=38, CLOSE_ARRAY=39, QuesM=40, ORM=41, K_ABORT=42, 
		K_ACTION=43, K_ADD=44, K_AFTER=45, K_ALL=46, K_ALTER=47, K_ANALYZE=48, 
		K_AND=49, K_AS=50, K_ASC=51, K_ATTACH=52, K_AUTOINCREMENT=53, K_BEFORE=54, 
		K_BEGIN=55, K_BETWEEN=56, K_BREAK=57, K_BY=58, K_CASCADE=59, K_CASE=60, 
		K_CAST=61, K_CHECK=62, K_COLLATE=63, K_COLUMN=64, K_COMMIT=65, K_CONFLICT=66, 
		K_CONSTRAINT=67, K_CREATE=68, K_CROSS=69, K_CURRENT_DATE=70, K_CURRENT_TIME=71, 
		K_CURRENT_TIMESTAMP=72, K_DATABASE=73, K_DEFAULT=74, K_DEFERRABLE=75, 
		K_DEFERRED=76, K_DELETE=77, K_DESC=78, K_DETACH=79, K_DISTINCT=80, K_DO=81, 
		K_DROP=82, K_EACH=83, K_ELSE=84, K_END=85, K_ENABLE=86, K_ESCAPE=87, K_EXCEPT=88, 
		K_EXCLUSIVE=89, K_EXISTS=90, K_EXPLAIN=91, K_FAIL=92, K_FOR=93, K_FOREIGN=94, 
		K_FROM=95, K_FULL=96, K_FUNCTION=97, K_GLOB=98, K_GROUP=99, K_HAVING=100, 
		K_IF=101, K_IGNORE=102, K_IMMEDIATE=103, K_IN=104, K_INDEX=105, K_INDEXED=106, 
		K_INITIALLY=107, K_INNER=108, K_INSERT=109, K_INSTEAD=110, K_INTERSECT=111, 
		K_INTO=112, K_IS=113, K_ISNULL=114, K_JOIN=115, K_KEY=116, K_LEFT=117, 
		K_LIKE=118, K_LIMIT=119, K_MATCH=120, K_NATURAL=121, K_NEXTVAL=122, K_NO=123, 
		K_NOT=124, K_NOTNULL=125, K_NULL=126, K_OF=127, K_OFFSET=128, K_ON=129, 
		K_ONLY=130, K_OR=131, K_ORDER=132, K_OUTER=133, K_PLAN=134, K_PRAGMA=135, 
		K_PRIMARY=136, K_PRINT=137, K_QUERY=138, K_RAISE=139, K_RECURSIVE=140, 
		K_REFERENCES=141, K_REGEXP=142, K_REINDEX=143, K_RELEASE=144, K_RENAME=145, 
		K_REPLACE=146, K_RESTRICT=147, K_RETURN=148, K_RIGHT=149, K_ROLLBACK=150, 
		K_ROW=151, K_SAVEPOINT=152, K_SELECT=153, K_SET=154, K_SWITCH=155, K_TABLE=156, 
		K_TEMP=157, K_TEMPORARY=158, K_THEN=159, K_TO=160, K_TRANSACTION=161, 
		K_TRIGGER=162, K_UNION=163, K_UNIQUE=164, K_UPDATE=165, K_USING=166, K_VACUUM=167, 
		K_VALUES=168, K_VIEW=169, K_VIRTUAL=170, K_WHEN=171, K_WHERE=172, K_WHILE=173, 
		K_WITH=174, K_WITHOUT=175, K_VAR=176, K_TYPE=177, K_CSV=178, K_JSON=179, 
		K_AGGREGATION_FUNCTION=180, IDENTIFIER=181, IDENTIFIER_JSON_ARRAY=182, 
		NUMERIC_LITERAL=183, BIND_PARAMETER=184, STRING_LITERAL=185, BLOB_LITERAL=186, 
		SINGLE_LINE_COMMENT=187, MULTILINE_COMMENT=188, SPACES=189, UNEXPECTED_CHAR=190;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_sql_stmt = 3, 
		RULE_def_all = 4, RULE_def_function = 5, RULE_body = 6, RULE_var_get_func = 7, 
		RULE_var_init = 8, RULE_var_operator = 9, RULE_def_print_stmt = 10, RULE_print_body = 11, 
		RULE_if_stmt = 12, RULE_else_if_stmt = 13, RULE_else_stmt = 14, RULE_inline_condition_stmt = 15, 
		RULE_while_stmt = 16, RULE_do_while_stmt = 17, RULE_while_do_stmt = 18, 
		RULE_for_stmt = 19, RULE_for_rule = 20, RULE_foreach_rule = 21, RULE_return_stmt = 22, 
		RULE_switch_stmt = 23, RULE_func_argument_list = 24, RULE_create_table_stmt = 25, 
		RULE_create_type_stmt = 26, RULE_create_aggr_func = 27, RULE_jar_path = 28, 
		RULE_class_name = 29, RULE_method_name = 30, RULE_return_type = 31, RULE_array_aggr = 32, 
		RULE_factored_select_stmt = 33, RULE_select_stmt = 34, RULE_select_or_values = 35, 
		RULE_column_def = 36, RULE_type_name = 37, RULE_column_constraint = 38, 
		RULE_column_constraint_primary_key = 39, RULE_column_constraint_foreign_key = 40, 
		RULE_column_constraint_not_null = 41, RULE_column_constraint_null = 42, 
		RULE_column_default = 43, RULE_column_default_value = 44, RULE_expr = 45, 
		RULE_expr_while = 46, RULE_expr_if = 47, RULE_expr_for_and_operator = 48, 
		RULE_expr_print = 49, RULE_foreign_key_clause = 50, RULE_fk_target_column_name = 51, 
		RULE_indexed_column = 52, RULE_table_constraint = 53, RULE_table_constraint_primary_key = 54, 
		RULE_table_constraint_foreign_key = 55, RULE_table_constraint_unique = 56, 
		RULE_table_constraint_key = 57, RULE_fk_origin_column_name = 58, RULE_qualified_table_name = 59, 
		RULE_ordering_term = 60, RULE_pragma_value = 61, RULE_common_table_expression = 62, 
		RULE_result_column = 63, RULE_table_or_subquery = 64, RULE_join_clause = 65, 
		RULE_join_operator = 66, RULE_join_constraint = 67, RULE_select_core = 68, 
		RULE_cte_table_name = 69, RULE_signed_number = 70, RULE_literal_value = 71, 
		RULE_unary_operator = 72, RULE_error_message = 73, RULE_module_argument = 74, 
		RULE_column_alias = 75, RULE_keyword = 76, RULE_unknown = 77, RULE_name = 78, 
		RULE_function_name = 79, RULE_database_name = 80, RULE_source_table_name = 81, 
		RULE_table_name = 82, RULE_table_or_index_name = 83, RULE_new_table_name = 84, 
		RULE_column_name = 85, RULE_collation_name = 86, RULE_foreign_table = 87, 
		RULE_index_name = 88, RULE_trigger_name = 89, RULE_view_name = 90, RULE_module_name = 91, 
		RULE_pragma_name = 92, RULE_savepoint_name = 93, RULE_table_alias = 94, 
		RULE_transaction_name = 95, RULE_any_name = 96, RULE_any_name_identifier_json = 97;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "error", "sql_stmt_list", "sql_stmt", "def_all", "def_function", 
			"body", "var_get_func", "var_init", "var_operator", "def_print_stmt", 
			"print_body", "if_stmt", "else_if_stmt", "else_stmt", "inline_condition_stmt", 
			"while_stmt", "do_while_stmt", "while_do_stmt", "for_stmt", "for_rule", 
			"foreach_rule", "return_stmt", "switch_stmt", "func_argument_list", "create_table_stmt", 
			"create_type_stmt", "create_aggr_func", "jar_path", "class_name", "method_name", 
			"return_type", "array_aggr", "factored_select_stmt", "select_stmt", "select_or_values", 
			"column_def", "type_name", "column_constraint", "column_constraint_primary_key", 
			"column_constraint_foreign_key", "column_constraint_not_null", "column_constraint_null", 
			"column_default", "column_default_value", "expr", "expr_while", "expr_if", 
			"expr_for_and_operator", "expr_print", "foreign_key_clause", "fk_target_column_name", 
			"indexed_column", "table_constraint", "table_constraint_primary_key", 
			"table_constraint_foreign_key", "table_constraint_unique", "table_constraint_key", 
			"fk_origin_column_name", "qualified_table_name", "ordering_term", "pragma_value", 
			"common_table_expression", "result_column", "table_or_subquery", "join_clause", 
			"join_operator", "join_constraint", "select_core", "cte_table_name", 
			"signed_number", "literal_value", "unary_operator", "error_message", 
			"module_argument", "column_alias", "keyword", "unknown", "name", "function_name", 
			"database_name", "source_table_name", "table_name", "table_or_index_name", 
			"new_table_name", "column_name", "collation_name", "foreign_table", "index_name", 
			"trigger_name", "view_name", "module_name", "pragma_name", "savepoint_name", 
			"table_alias", "transaction_name", "any_name", "any_name_identifier_json"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'path'", "'::'", "';'", "'.'", "'('", "')'", "'{'", "'}'", "'&&'", 
			"','", "'='", "'*'", "'+'", "'++'", "'-'", "'--'", "'~'", "'||'", "'/'", 
			"'%'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", "'>='", "'=='", 
			"'=+'", "'+='", "'=-'", "'-='", "'*='", "'/='", "'!='", "'<>'", "'['", 
			"']'", "'?'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "OPEN_B", "CLOSE_B", 
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
			"K_CSV", "K_JSON", "K_AGGREGATION_FUNCTION", "IDENTIFIER", "IDENTIFIER_JSON_ARRAY", 
			"NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL", "BLOB_LITERAL", 
			"SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", "UNEXPECTED_CHAR"
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
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL || _la==OPEN_PAR || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (K_CREATE - 68)) | (1L << (K_EXPLAIN - 68)) | (1L << (K_FUNCTION - 68)))) != 0) || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & ((1L << (K_SELECT - 153)) | (1L << (K_VALUES - 153)) | (1L << (K_VAR - 153)) | (1L << (IDENTIFIER - 153)) | (1L << (STRING_LITERAL - 153)) | (1L << (UNEXPECTED_CHAR - 153)))) != 0)) {
				{
				setState(199);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case K_FUNCTION:
				case K_VAR:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					setState(196);
					def_all();
					}
					break;
				case SCOL:
				case K_CREATE:
				case K_EXPLAIN:
				case K_SELECT:
				case K_VALUES:
					{
					setState(197);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(198);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
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
			setState(206);
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
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(209);
				match(SCOL);
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(215);
			sql_stmt();
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(217); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(216);
						match(SCOL);
						}
						}
						setState(219); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(221);
					sql_stmt();
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(227);
					match(SCOL);
					}
					} 
				}
				setState(232);
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
		public Create_type_stmtContext create_type_stmt() {
			return getRuleContext(Create_type_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Create_aggr_funcContext create_aggr_func() {
			return getRuleContext(Create_aggr_funcContext.class,0);
		}
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
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
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_EXPLAIN) {
				{
				setState(233);
				match(K_EXPLAIN);
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_QUERY) {
					{
					setState(234);
					match(K_QUERY);
					setState(235);
					match(K_PLAN);
					}
				}

				}
			}

			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(240);
				create_type_stmt();
				}
				break;
			case 2:
				{
				setState(241);
				create_table_stmt();
				}
				break;
			case 3:
				{
				setState(242);
				create_aggr_func();
				}
				break;
			case 4:
				{
				setState(243);
				factored_select_stmt();
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
		public Var_get_funcContext var_get_func() {
			return getRuleContext(Var_get_funcContext.class,0);
		}
		public Func_argument_listContext func_argument_list() {
			return getRuleContext(Func_argument_listContext.class,0);
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
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				def_function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				var_get_func();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				func_argument_list();
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
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(251);
				match(K_VAR);
				}
			}

			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FUNCTION) {
				{
				setState(254);
				match(K_FUNCTION);
				}
			}

			setState(257);
			any_name();
			setState(258);
			match(OPEN_PAR);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(259);
				match(K_VAR);
				setState(260);
				any_name();
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(261);
					match(COMMA);
					setState(262);
					match(K_VAR);
					setState(263);
					any_name();
					}
					}
					setState(268);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(271);
			match(CLOSE_PAR);
			setState(272);
			match(OPEN_B);
			setState(273);
			body();
			setState(274);
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
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(290);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(276);
						var_init();
						}
						break;
					case 2:
						{
						setState(277);
						def_print_stmt();
						}
						break;
					case 3:
						{
						setState(278);
						if_stmt();
						}
						break;
					case 4:
						{
						setState(279);
						while_stmt();
						}
						break;
					case 5:
						{
						setState(280);
						do_while_stmt();
						}
						break;
					case 6:
						{
						setState(281);
						for_stmt();
						}
						break;
					case 7:
						{
						setState(282);
						switch_stmt();
						}
						break;
					case 8:
						{
						setState(283);
						inline_condition_stmt();
						}
						break;
					case 9:
						{
						setState(284);
						sql_stmt_list();
						setState(285);
						match(SCOL);
						}
						break;
					case 10:
						{
						setState(287);
						var_get_func();
						}
						break;
					case 11:
						{
						setState(288);
						func_argument_list();
						}
						break;
					case 12:
						{
						setState(289);
						var_operator();
						}
						break;
					}
					} 
				}
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(295);
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
			setState(298);
			match(K_VAR);
			setState(299);
			match(IDENTIFIER);
			setState(300);
			match(ASSIGN);
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_FUNCTION:
				{
				setState(301);
				match(K_FUNCTION);
				}
				break;
			case OPEN_PAR:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(302);
				any_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(305);
			match(OPEN_PAR);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
				{
				setState(306);
				any_name();
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(307);
					match(COMMA);
					setState(308);
					any_name();
					}
					}
					setState(313);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(316);
			match(CLOSE_PAR);
			setState(317);
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
			setState(319);
			match(K_VAR);
			setState(320);
			any_name();
			setState(321);
			match(ASSIGN);
			setState(322);
			expr(0);
			setState(323);
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
			setState(325);
			expr_for_and_operator(0);
			setState(329);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(326);
					match(SCOL);
					}
					} 
				}
				setState(331);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(332);
				match(K_VAR);
				}
			}

			setState(335);
			match(K_PRINT);
			setState(336);
			match(OPEN_PAR);
			setState(337);
			print_body();
			setState(338);
			match(CLOSE_PAR);
			setState(339);
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
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << OPEN_ARRAY))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (K_CURRENT_DATE - 70)) | (1L << (K_CURRENT_TIME - 70)) | (1L << (K_CURRENT_TIMESTAMP - 70)) | (1L << (K_EXISTS - 70)) | (1L << (K_NOT - 70)) | (1L << (K_NULL - 70)))) != 0) || ((((_la - 181)) & ~0x3f) == 0 && ((1L << (_la - 181)) & ((1L << (IDENTIFIER - 181)) | (1L << (NUMERIC_LITERAL - 181)) | (1L << (STRING_LITERAL - 181)) | (1L << (BLOB_LITERAL - 181)))) != 0)) {
				{
				{
				setState(341);
				expr_print(0);
				}
				}
				setState(346);
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
			setState(347);
			match(K_IF);
			setState(348);
			match(OPEN_PAR);
			setState(349);
			expr_if(0);
			setState(350);
			match(CLOSE_PAR);
			setState(356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_B:
				{
				setState(351);
				match(OPEN_B);
				setState(352);
				body();
				setState(353);
				match(CLOSE_B);
				}
				break;
			case SCOL:
			case OPEN_PAR:
			case CLOSE_B:
			case PLUS_PLUS:
			case MINUS_MINUS:
			case OPEN_ARRAY:
			case K_BREAK:
			case K_CASE:
			case K_CAST:
			case K_CREATE:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DEFAULT:
			case K_DO:
			case K_ELSE:
			case K_EXPLAIN:
			case K_FOR:
			case K_FUNCTION:
			case K_IF:
			case K_NULL:
			case K_PRINT:
			case K_RETURN:
			case K_SELECT:
			case K_SWITCH:
			case K_VALUES:
			case K_WHILE:
			case K_VAR:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
			case BLOB_LITERAL:
				{
				setState(355);
				body();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(361);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(358);
					else_if_stmt();
					}
					} 
				}
				setState(363);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(364);
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
			setState(367);
			match(K_ELSE);
			setState(368);
			match(K_IF);
			setState(369);
			match(OPEN_PAR);
			setState(370);
			expr_if(0);
			setState(371);
			match(CLOSE_PAR);
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_B:
				{
				setState(372);
				match(OPEN_B);
				setState(373);
				body();
				setState(374);
				match(CLOSE_B);
				}
				break;
			case SCOL:
			case OPEN_PAR:
			case CLOSE_B:
			case PLUS_PLUS:
			case MINUS_MINUS:
			case OPEN_ARRAY:
			case K_BREAK:
			case K_CASE:
			case K_CAST:
			case K_CREATE:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DEFAULT:
			case K_DO:
			case K_ELSE:
			case K_EXPLAIN:
			case K_FOR:
			case K_FUNCTION:
			case K_IF:
			case K_NULL:
			case K_PRINT:
			case K_RETURN:
			case K_SELECT:
			case K_SWITCH:
			case K_VALUES:
			case K_WHILE:
			case K_VAR:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
			case BLOB_LITERAL:
				{
				setState(376);
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
			setState(379);
			match(K_ELSE);
			setState(385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_B:
				{
				setState(380);
				match(OPEN_B);
				setState(381);
				body();
				setState(382);
				match(CLOSE_B);
				}
				break;
			case SCOL:
			case OPEN_PAR:
			case CLOSE_B:
			case PLUS_PLUS:
			case MINUS_MINUS:
			case OPEN_ARRAY:
			case K_BREAK:
			case K_CASE:
			case K_CAST:
			case K_CREATE:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DEFAULT:
			case K_DO:
			case K_ELSE:
			case K_EXPLAIN:
			case K_FOR:
			case K_FUNCTION:
			case K_IF:
			case K_NULL:
			case K_PRINT:
			case K_RETURN:
			case K_SELECT:
			case K_SWITCH:
			case K_VALUES:
			case K_WHILE:
			case K_VAR:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
			case BLOB_LITERAL:
				{
				setState(384);
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
		public TerminalNode ORM() { return getToken(SQLParser.ORM, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Expr_for_and_operatorContext> expr_for_and_operator() {
			return getRuleContexts(Expr_for_and_operatorContext.class);
		}
		public Expr_for_and_operatorContext expr_for_and_operator(int i) {
			return getRuleContext(Expr_for_and_operatorContext.class,i);
		}
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
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				expr_if(0);
				setState(388);
				match(QuesM);
				setState(391);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(389);
					expr(0);
					}
					break;
				case 2:
					{
					setState(390);
					expr_for_and_operator(0);
					}
					break;
				}
				setState(393);
				match(ORM);
				setState(396);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(394);
					expr(0);
					}
					break;
				case 2:
					{
					setState(395);
					expr_for_and_operator(0);
					}
					break;
				}
				setState(401);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(398);
						match(SCOL);
						}
						} 
					}
					setState(403);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				expr_if(0);
				setState(405);
				match(QuesM);
				setState(409);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(406);
						match(OPEN_PAR);
						}
						} 
					}
					setState(411);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				setState(412);
				inline_condition_stmt();
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CLOSE_PAR) {
					{
					{
					setState(413);
					match(CLOSE_PAR);
					}
					}
					setState(418);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(419);
				match(ORM);
				setState(423);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(420);
						match(OPEN_PAR);
						}
						} 
					}
					setState(425);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(426);
				inline_condition_stmt();
				setState(430);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(427);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(432);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(436);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(433);
						match(SCOL);
						}
						} 
					}
					setState(438);
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
			setState(441);
			match(K_WHILE);
			setState(442);
			match(OPEN_PAR);
			setState(443);
			expr_while(0);
			setState(444);
			match(CLOSE_PAR);
			setState(450);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_B:
				{
				setState(445);
				match(OPEN_B);
				setState(446);
				body();
				setState(447);
				match(CLOSE_B);
				}
				break;
			case SCOL:
			case OPEN_PAR:
			case CLOSE_B:
			case PLUS_PLUS:
			case MINUS_MINUS:
			case OPEN_ARRAY:
			case K_BREAK:
			case K_CASE:
			case K_CAST:
			case K_CREATE:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DEFAULT:
			case K_DO:
			case K_ELSE:
			case K_EXPLAIN:
			case K_FOR:
			case K_FUNCTION:
			case K_IF:
			case K_NULL:
			case K_PRINT:
			case K_RETURN:
			case K_SELECT:
			case K_SWITCH:
			case K_VALUES:
			case K_WHILE:
			case K_VAR:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
			case BLOB_LITERAL:
				{
				setState(449);
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
			setState(452);
			match(K_DO);
			setState(453);
			match(OPEN_B);
			setState(454);
			body();
			setState(455);
			match(CLOSE_B);
			setState(456);
			while_do_stmt();
			setState(457);
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
			setState(459);
			match(K_WHILE);
			setState(460);
			match(OPEN_PAR);
			setState(461);
			expr_while(0);
			setState(462);
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
			setState(464);
			match(K_FOR);
			setState(465);
			match(OPEN_PAR);
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(466);
				for_rule();
				}
				break;
			case 2:
				{
				setState(467);
				foreach_rule();
				}
				break;
			}
			setState(470);
			match(CLOSE_PAR);
			setState(476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_B:
				{
				setState(471);
				match(OPEN_B);
				setState(472);
				body();
				setState(473);
				match(CLOSE_B);
				}
				break;
			case SCOL:
			case OPEN_PAR:
			case CLOSE_B:
			case PLUS_PLUS:
			case MINUS_MINUS:
			case OPEN_ARRAY:
			case K_BREAK:
			case K_CASE:
			case K_CAST:
			case K_CREATE:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DEFAULT:
			case K_DO:
			case K_ELSE:
			case K_EXPLAIN:
			case K_FOR:
			case K_FUNCTION:
			case K_IF:
			case K_NULL:
			case K_PRINT:
			case K_RETURN:
			case K_SELECT:
			case K_SWITCH:
			case K_VALUES:
			case K_WHILE:
			case K_VAR:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
			case BLOB_LITERAL:
				{
				setState(475);
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
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(478);
				match(K_VAR);
				}
			}

			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (K_CURRENT_DATE - 70)) | (1L << (K_CURRENT_TIME - 70)) | (1L << (K_CURRENT_TIMESTAMP - 70)) | (1L << (K_NULL - 70)))) != 0) || ((((_la - 181)) & ~0x3f) == 0 && ((1L << (_la - 181)) & ((1L << (IDENTIFIER - 181)) | (1L << (NUMERIC_LITERAL - 181)) | (1L << (STRING_LITERAL - 181)) | (1L << (BLOB_LITERAL - 181)))) != 0)) {
				{
				setState(481);
				expr_for_and_operator(0);
				}
			}

			setState(484);
			match(SCOL);
			setState(485);
			expr_if(0);
			setState(486);
			match(SCOL);
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (K_CURRENT_DATE - 70)) | (1L << (K_CURRENT_TIME - 70)) | (1L << (K_CURRENT_TIMESTAMP - 70)) | (1L << (K_NULL - 70)))) != 0) || ((((_la - 181)) & ~0x3f) == 0 && ((1L << (_la - 181)) & ((1L << (IDENTIFIER - 181)) | (1L << (NUMERIC_LITERAL - 181)) | (1L << (STRING_LITERAL - 181)) | (1L << (BLOB_LITERAL - 181)))) != 0)) {
				{
				setState(487);
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
			setState(490);
			match(K_VAR);
			setState(491);
			any_name();
			setState(492);
			match(ORM);
			setState(493);
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
			setState(495);
			match(K_RETURN);
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(496);
				expr(0);
				}
				break;
			case 2:
				{
				setState(497);
				var_operator();
				}
				break;
			case 3:
				{
				setState(498);
				inline_condition_stmt();
				}
				break;
			}
			setState(501);
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
		enterRule(_localctx, 46, RULE_switch_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(K_SWITCH);
			setState(504);
			match(OPEN_PAR);
			setState(505);
			any_name();
			setState(506);
			match(CLOSE_PAR);
			setState(507);
			match(OPEN_B);
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_CASE) {
				{
				{
				setState(508);
				match(K_CASE);
				setState(511);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					setState(509);
					any_name();
					}
					break;
				case STAR:
				case PLUS:
				case MINUS:
				case NUMERIC_LITERAL:
					{
					setState(510);
					signed_number();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(513);
				match(ORM);
				setState(528);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SCOL:
				case OPEN_PAR:
				case CLOSE_B:
				case PLUS_PLUS:
				case MINUS_MINUS:
				case OPEN_ARRAY:
				case K_BREAK:
				case K_CASE:
				case K_CAST:
				case K_CREATE:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DEFAULT:
				case K_DO:
				case K_EXPLAIN:
				case K_FOR:
				case K_FUNCTION:
				case K_IF:
				case K_NULL:
				case K_PRINT:
				case K_RETURN:
				case K_SELECT:
				case K_SWITCH:
				case K_VALUES:
				case K_WHILE:
				case K_VAR:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(514);
					body();
					}
					break;
				case OPEN_B:
					{
					setState(515);
					match(OPEN_B);
					setState(516);
					body();
					setState(519);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_BREAK) {
						{
						setState(517);
						match(K_BREAK);
						setState(518);
						match(SCOL);
						}
					}

					setState(521);
					match(CLOSE_B);
					setState(525);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SCOL) {
						{
						{
						setState(522);
						match(SCOL);
						}
						}
						setState(527);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_BREAK) {
					{
					setState(530);
					match(K_BREAK);
					setState(531);
					match(SCOL);
					}
				}

				}
				}
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DEFAULT) {
				{
				setState(539);
				match(K_DEFAULT);
				setState(540);
				match(ORM);
				setState(555);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(541);
					body();
					}
					break;
				case 2:
					{
					setState(542);
					match(OPEN_B);
					setState(543);
					body();
					setState(546);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_BREAK) {
						{
						setState(544);
						match(K_BREAK);
						setState(545);
						match(SCOL);
						}
					}

					setState(548);
					match(CLOSE_B);
					setState(552);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SCOL) {
						{
						{
						setState(549);
						match(SCOL);
						}
						}
						setState(554);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_BREAK) {
					{
					setState(557);
					match(K_BREAK);
					setState(558);
					match(SCOL);
					}
				}

				}
			}

			setState(563);
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
		enterRule(_localctx, 48, RULE_func_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_FUNCTION:
				{
				setState(565);
				match(K_FUNCTION);
				}
				break;
			case OPEN_PAR:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(566);
				any_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(569);
			match(OPEN_PAR);
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
				{
				setState(570);
				any_name();
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(571);
					match(COMMA);
					setState(572);
					any_name();
					}
					}
					setState(577);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(580);
			match(CLOSE_PAR);
			setState(581);
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
		public TerminalNode K_TYPE() { return getToken(SQLParser.K_TYPE, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(SQLParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLParser.ASSIGN, i);
		}
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode K_JSON() { return getToken(SQLParser.K_JSON, 0); }
		public TerminalNode K_CSV() { return getToken(SQLParser.K_CSV, 0); }
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
		enterRule(_localctx, 50, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(K_CREATE);
			setState(584);
			match(K_TABLE);
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(585);
				match(K_IF);
				setState(586);
				match(K_NOT);
				setState(587);
				match(K_EXISTS);
				}
			}

			setState(593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(590);
				database_name();
				setState(591);
				match(DOT);
				}
				break;
			}
			setState(595);
			table_name();
			{
			setState(596);
			match(OPEN_PAR);
			setState(597);
			column_def();
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				setState(602);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(598);
					match(COMMA);
					setState(599);
					table_constraint();
					}
					break;
				case 2:
					{
					setState(600);
					match(COMMA);
					setState(601);
					column_def();
					}
					break;
				}
				}
				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(607);
			match(CLOSE_PAR);
			setState(615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(608);
				match(K_TYPE);
				setState(609);
				match(ASSIGN);
				setState(610);
				_la = _input.LA(1);
				if ( !(_la==K_CSV || _la==K_JSON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(611);
				match(COMMA);
				setState(612);
				match(T__0);
				setState(613);
				match(ASSIGN);
				setState(614);
				any_name();
				}
				break;
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
		enterRule(_localctx, 52, RULE_create_type_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(K_CREATE);
			setState(618);
			match(K_TYPE);
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(619);
				match(K_IF);
				setState(620);
				match(K_NOT);
				setState(621);
				match(K_EXISTS);
				}
			}

			setState(624);
			any_name();
			{
			setState(625);
			match(OPEN_PAR);
			setState(626);
			column_def();
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(627);
				match(COMMA);
				setState(628);
				column_def();
				}
				}
				setState(633);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(634);
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

	public static class Create_aggr_funcContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLParser.K_CREATE, 0); }
		public TerminalNode K_AGGREGATION_FUNCTION() { return getToken(SQLParser.K_AGGREGATION_FUNCTION, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public Jar_pathContext jar_path() {
			return getRuleContext(Jar_pathContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Method_nameContext method_name() {
			return getRuleContext(Method_nameContext.class,0);
		}
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public Array_aggrContext array_aggr() {
			return getRuleContext(Array_aggrContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Create_aggr_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_aggr_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreate_aggr_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreate_aggr_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreate_aggr_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_aggr_funcContext create_aggr_func() throws RecognitionException {
		Create_aggr_funcContext _localctx = new Create_aggr_funcContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_create_aggr_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			match(K_CREATE);
			setState(637);
			match(K_AGGREGATION_FUNCTION);
			setState(638);
			any_name();
			{
			setState(639);
			match(OPEN_PAR);
			setState(640);
			jar_path();
			setState(641);
			match(COMMA);
			setState(642);
			class_name();
			setState(643);
			match(COMMA);
			setState(644);
			method_name();
			setState(645);
			match(COMMA);
			setState(646);
			return_type();
			setState(647);
			match(COMMA);
			setState(648);
			array_aggr();
			setState(649);
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

	public static class Jar_pathContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Jar_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jar_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJar_path(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJar_path(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJar_path(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jar_pathContext jar_path() throws RecognitionException {
		Jar_pathContext _localctx = new Jar_pathContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_jar_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
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

	public static class Class_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Class_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterClass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitClass_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitClass_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
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

	public static class Method_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Method_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterMethod_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitMethod_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitMethod_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_nameContext method_name() throws RecognitionException {
		Method_nameContext _localctx = new Method_nameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_method_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
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

	public static class Return_typeContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitReturn_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitReturn_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_return_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
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

	public static class Array_aggrContext extends ParserRuleContext {
		public TerminalNode OPEN_ARRAY() { return getToken(SQLParser.OPEN_ARRAY, 0); }
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public TerminalNode CLOSE_ARRAY() { return getToken(SQLParser.CLOSE_ARRAY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Array_aggrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_aggr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterArray_aggr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitArray_aggr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitArray_aggr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_aggrContext array_aggr() throws RecognitionException {
		Array_aggrContext _localctx = new Array_aggrContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_array_aggr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			match(OPEN_ARRAY);
			setState(660);
			any_name();
			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(661);
				match(COMMA);
				setState(662);
				any_name();
				}
				}
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(668);
			match(CLOSE_ARRAY);
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
		enterRule(_localctx, 66, RULE_factored_select_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			select_core();
			setState(681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(671);
				match(K_ORDER);
				setState(672);
				match(K_BY);
				setState(673);
				ordering_term();
				setState(678);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(674);
						match(COMMA);
						setState(675);
						ordering_term();
						}
						} 
					}
					setState(680);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				}
				}
				break;
			}
			setState(689);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(683);
				match(K_LIMIT);
				setState(684);
				expr(0);
				setState(687);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(685);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(686);
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
		enterRule(_localctx, 68, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			select_or_values();
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(692);
				match(K_ORDER);
				setState(693);
				match(K_BY);
				setState(694);
				ordering_term();
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(695);
					match(COMMA);
					setState(696);
					ordering_term();
					}
					}
					setState(701);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(710);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(704);
				match(K_LIMIT);
				setState(705);
				expr(0);
				setState(708);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(706);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(707);
					expr(0);
					}
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
		enterRule(_localctx, 70, RULE_select_or_values);
		int _la;
		try {
			setState(786);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(712);
				match(K_SELECT);
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(713);
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

				setState(716);
				result_column();
				setState(721);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(717);
					match(COMMA);
					setState(718);
					result_column();
					}
					}
					setState(723);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(724);
					match(K_FROM);
					setState(734);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
					case 1:
						{
						setState(725);
						table_or_subquery();
						setState(730);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(726);
							match(COMMA);
							setState(727);
							table_or_subquery();
							}
							}
							setState(732);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(733);
						join_clause();
						}
						break;
					}
					}
				}

				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(738);
					match(K_WHERE);
					setState(739);
					expr(0);
					}
				}

				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(742);
					match(K_GROUP);
					setState(743);
					match(K_BY);
					setState(744);
					expr(0);
					setState(749);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(745);
						match(COMMA);
						setState(746);
						expr(0);
						}
						}
						setState(751);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(754);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(752);
						match(K_HAVING);
						setState(753);
						expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(758);
				match(K_VALUES);
				setState(759);
				match(OPEN_PAR);
				setState(760);
				expr(0);
				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(761);
					match(COMMA);
					setState(762);
					expr(0);
					}
					}
					setState(767);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(768);
				match(CLOSE_PAR);
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(769);
					match(COMMA);
					setState(770);
					match(OPEN_PAR);
					setState(771);
					expr(0);
					setState(776);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(772);
						match(COMMA);
						setState(773);
						expr(0);
						}
						}
						setState(778);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(779);
					match(CLOSE_PAR);
					}
					}
					setState(785);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
		enterRule(_localctx, 72, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			column_name();
			setState(793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_CHECK) | (1L << K_COLLATE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (K_CONSTRAINT - 67)) | (1L << (K_DEFAULT - 67)) | (1L << (K_NOT - 67)) | (1L << (K_NULL - 67)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (K_PRIMARY - 136)) | (1L << (K_REFERENCES - 136)) | (1L << (K_UNIQUE - 136)) | (1L << (IDENTIFIER - 136)) | (1L << (STRING_LITERAL - 136)))) != 0)) {
				{
				setState(791);
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
					setState(789);
					column_constraint();
					}
					break;
				case OPEN_PAR:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					setState(790);
					type_name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(795);
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
		enterRule(_localctx, 74, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			name();
			setState(816);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(797);
				match(OPEN_PAR);
				setState(798);
				signed_number();
				setState(800);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(799);
					any_name();
					}
				}

				setState(802);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(804);
				match(OPEN_PAR);
				setState(805);
				signed_number();
				setState(807);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(806);
					any_name();
					}
				}

				setState(809);
				match(COMMA);
				setState(810);
				signed_number();
				setState(812);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(811);
					any_name();
					}
				}

				setState(814);
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
		enterRule(_localctx, 76, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(818);
				match(K_CONSTRAINT);
				setState(819);
				name();
				}
			}

			setState(835);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(822);
				column_constraint_primary_key();
				}
				break;
			case K_REFERENCES:
				{
				setState(823);
				column_constraint_foreign_key();
				}
				break;
			case K_NOT:
				{
				setState(824);
				column_constraint_not_null();
				}
				break;
			case K_NULL:
				{
				setState(825);
				column_constraint_null();
				}
				break;
			case K_UNIQUE:
				{
				setState(826);
				match(K_UNIQUE);
				}
				break;
			case K_CHECK:
				{
				setState(827);
				match(K_CHECK);
				setState(828);
				match(OPEN_PAR);
				setState(829);
				expr(0);
				setState(830);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(832);
				column_default();
				}
				break;
			case K_COLLATE:
				{
				setState(833);
				match(K_COLLATE);
				setState(834);
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
		enterRule(_localctx, 78, RULE_column_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			match(K_PRIMARY);
			setState(838);
			match(K_KEY);
			setState(840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(839);
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

			setState(843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AUTOINCREMENT) {
				{
				setState(842);
				match(K_AUTOINCREMENT);
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
		enterRule(_localctx, 80, RULE_column_constraint_foreign_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
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
		enterRule(_localctx, 82, RULE_column_constraint_not_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			match(K_NOT);
			setState(848);
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
		enterRule(_localctx, 84, RULE_column_constraint_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
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
		enterRule(_localctx, 86, RULE_column_default);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			match(K_DEFAULT);
			setState(864);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(853);
				column_default_value();
				}
				break;
			case 2:
				{
				setState(854);
				match(OPEN_PAR);
				setState(855);
				expr(0);
				setState(856);
				match(CLOSE_PAR);
				}
				break;
			case 3:
				{
				setState(858);
				match(K_NEXTVAL);
				setState(859);
				match(OPEN_PAR);
				setState(860);
				expr(0);
				setState(861);
				match(CLOSE_PAR);
				}
				break;
			case 4:
				{
				setState(863);
				any_name();
				}
				break;
			}
			setState(872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(866);
				match(T__1);
				setState(868); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(867);
						any_name();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(870); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		enterRule(_localctx, 88, RULE_column_default_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(874);
				signed_number();
				}
				break;
			case 2:
				{
				setState(875);
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
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(879);
				literal_value();
				}
				break;
			case 2:
				{
				setState(888);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(883);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
					case 1:
						{
						setState(880);
						database_name();
						setState(881);
						match(DOT);
						}
						break;
					}
					setState(885);
					table_name();
					setState(886);
					match(DOT);
					}
					break;
				}
				setState(890);
				column_name();
				}
				break;
			case 3:
				{
				setState(891);
				unary_operator();
				setState(892);
				expr(15);
				}
				break;
			case 4:
				{
				setState(894);
				function_name();
				setState(895);
				match(OPEN_PAR);
				setState(908);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SCOL:
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case OPEN_ARRAY:
				case K_CAST:
				case K_CREATE:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DISTINCT:
				case K_EXISTS:
				case K_EXPLAIN:
				case K_NOT:
				case K_NULL:
				case K_SELECT:
				case K_VALUES:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(897);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_DISTINCT) {
						{
						setState(896);
						match(K_DISTINCT);
						}
					}

					setState(899);
					expr(0);
					setState(904);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(900);
						match(COMMA);
						setState(901);
						expr(0);
						}
						}
						setState(906);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(907);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(910);
				match(CLOSE_PAR);
				}
				break;
			case 5:
				{
				setState(912);
				match(OPEN_PAR);
				setState(913);
				expr(0);
				setState(914);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(920);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(917);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(916);
						match(K_NOT);
						}
					}

					setState(919);
					match(K_EXISTS);
					}
				}

				setState(922);
				match(OPEN_PAR);
				setState(923);
				select_stmt();
				setState(924);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(926);
				inline_condition_stmt();
				}
				break;
			case 8:
				{
				setState(927);
				sql_stmt_list();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(995);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(993);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(930);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(931);
						match(PIPE2);
						setState(932);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(933);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(934);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(935);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(936);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(937);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(938);
						expr(13);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(939);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(940);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(941);
						expr(12);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(942);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(943);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(944);
						expr(11);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(945);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(958);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
						case 1:
							{
							setState(946);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(947);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(948);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(949);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(950);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(951);
							match(K_IS);
							setState(952);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(953);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(954);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(955);
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(956);
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(957);
							match(K_REGEXP);
							}
							break;
						}
						setState(960);
						expr(10);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(961);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(962);
						match(K_AND);
						setState(963);
						expr(9);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(964);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(965);
						match(K_OR);
						setState(966);
						expr(8);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(967);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(969);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(968);
							match(K_NOT);
							}
						}

						setState(971);
						match(K_IN);
						setState(991);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
						case 1:
							{
							setState(972);
							match(OPEN_PAR);
							setState(982);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
							case 1:
								{
								setState(973);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(974);
								expr(0);
								setState(979);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(975);
									match(COMMA);
									setState(976);
									expr(0);
									}
									}
									setState(981);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(984);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(988);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
							case 1:
								{
								setState(985);
								database_name();
								setState(986);
								match(DOT);
								}
								break;
							}
							setState(990);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(997);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
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
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_expr_while, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1031);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(999);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1000);
				any_name();
				}
				break;
			case 3:
				{
				setState(1001);
				any_name();
				setState(1002);
				match(OPEN_ARRAY);
				setState(1003);
				expr(0);
				setState(1004);
				match(CLOSE_ARRAY);
				setState(1005);
				expr_while(0);
				setState(1006);
				any_name();
				setState(1007);
				match(OPEN_ARRAY);
				setState(1008);
				expr(0);
				setState(1009);
				match(CLOSE_ARRAY);
				}
				break;
			case 4:
				{
				setState(1011);
				any_name();
				setState(1012);
				match(OPEN_ARRAY);
				setState(1013);
				expr(0);
				setState(1014);
				match(CLOSE_ARRAY);
				setState(1015);
				expr_while(0);
				setState(1018);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					setState(1016);
					any_name();
					}
					break;
				case STAR:
				case PLUS:
				case MINUS:
				case NUMERIC_LITERAL:
					{
					setState(1017);
					signed_number();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 5:
				{
				setState(1020);
				match(OPEN_PAR);
				setState(1021);
				expr_while(0);
				setState(1022);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(1024);
				match(K_CAST);
				setState(1025);
				match(OPEN_PAR);
				setState(1026);
				expr_while(0);
				setState(1027);
				match(K_AS);
				setState(1028);
				type_name();
				setState(1029);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1059);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1057);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_whileContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_while);
						setState(1033);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1034);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1035);
						expr_while(13);
						}
						break;
					case 2:
						{
						_localctx = new Expr_whileContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_while);
						setState(1036);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1037);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1038);
						expr_while(12);
						}
						break;
					case 3:
						{
						_localctx = new Expr_whileContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_while);
						setState(1039);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1040);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1041);
						expr_while(11);
						}
						break;
					case 4:
						{
						_localctx = new Expr_whileContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_while);
						setState(1042);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1043);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NOT_EQ1) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1044);
						expr_while(10);
						}
						break;
					case 5:
						{
						_localctx = new Expr_whileContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_while);
						setState(1045);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1046);
						match(K_AND);
						setState(1047);
						expr_while(9);
						}
						break;
					case 6:
						{
						_localctx = new Expr_whileContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_while);
						setState(1048);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1049);
						match(K_OR);
						setState(1050);
						expr_while(8);
						}
						break;
					case 7:
						{
						_localctx = new Expr_whileContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_while);
						setState(1051);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1052);
						match(PIPE2);
						setState(1053);
						expr_while(7);
						}
						break;
					case 8:
						{
						_localctx = new Expr_whileContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_while);
						setState(1054);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1055);
						match(AND);
						setState(1056);
						expr_while(6);
						}
						break;
					}
					} 
				}
				setState(1061);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
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
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_expr_if, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1099);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1063);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1064);
				any_name();
				}
				break;
			case 3:
				{
				setState(1065);
				any_name();
				setState(1066);
				match(OPEN_ARRAY);
				setState(1067);
				expr(0);
				setState(1068);
				match(CLOSE_ARRAY);
				setState(1069);
				expr_if(0);
				setState(1070);
				any_name();
				setState(1071);
				match(OPEN_ARRAY);
				setState(1072);
				expr(0);
				setState(1073);
				match(CLOSE_ARRAY);
				}
				break;
			case 4:
				{
				setState(1075);
				any_name();
				setState(1076);
				match(OPEN_ARRAY);
				setState(1077);
				expr(0);
				setState(1078);
				match(CLOSE_ARRAY);
				setState(1079);
				expr_if(0);
				setState(1082);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					setState(1080);
					any_name();
					}
					break;
				case STAR:
				case PLUS:
				case MINUS:
				case NUMERIC_LITERAL:
					{
					setState(1081);
					signed_number();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 5:
				{
				setState(1084);
				match(OPEN_ARRAY);
				setState(1085);
				any_name();
				setState(1086);
				match(CLOSE_ARRAY);
				}
				break;
			case 6:
				{
				setState(1088);
				match(OPEN_PAR);
				setState(1089);
				expr_if(0);
				setState(1090);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(1092);
				match(K_CAST);
				setState(1093);
				match(OPEN_PAR);
				setState(1094);
				expr_if(0);
				setState(1095);
				match(K_AS);
				setState(1096);
				type_name();
				setState(1097);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1125);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_ifContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_if);
						setState(1101);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1102);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1103);
						expr_if(14);
						}
						break;
					case 2:
						{
						_localctx = new Expr_ifContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_if);
						setState(1104);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1105);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1106);
						expr_if(13);
						}
						break;
					case 3:
						{
						_localctx = new Expr_ifContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_if);
						setState(1107);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1108);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1109);
						expr_if(12);
						}
						break;
					case 4:
						{
						_localctx = new Expr_ifContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_if);
						setState(1110);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1111);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NOT_EQ1) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1112);
						expr_if(11);
						}
						break;
					case 5:
						{
						_localctx = new Expr_ifContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_if);
						setState(1113);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1114);
						match(K_AND);
						setState(1115);
						expr_if(10);
						}
						break;
					case 6:
						{
						_localctx = new Expr_ifContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_if);
						setState(1116);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1117);
						match(K_OR);
						setState(1118);
						expr_if(9);
						}
						break;
					case 7:
						{
						_localctx = new Expr_ifContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_if);
						setState(1119);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1120);
						match(PIPE2);
						setState(1121);
						expr_if(8);
						}
						break;
					case 8:
						{
						_localctx = new Expr_ifContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_if);
						setState(1122);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1123);
						match(AND);
						setState(1124);
						expr_if(7);
						}
						break;
					}
					} 
				}
				setState(1129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
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
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_expr_for_and_operator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1131);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1132);
				any_name();
				}
				break;
			case 3:
				{
				{
				setState(1133);
				any_name();
				setState(1134);
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
				setState(1136);
				_la = _input.LA(1);
				if ( !(_la==PLUS_PLUS || _la==MINUS_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1137);
				any_name();
				}
				}
				break;
			case 5:
				{
				setState(1138);
				match(OPEN_PAR);
				setState(1139);
				expr_for_and_operator(0);
				setState(1140);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_for_and_operatorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr_for_and_operator);
					setState(1144);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1145);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << EQ_WITH_PLUS) | (1L << PLUS_WITH_EQ) | (1L << EQ_WITH_MINUS) | (1L << MINUS_WITH_EQ) | (1L << STAR_WITH_EQ) | (1L << DIV_WITH_EQ))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1146);
					expr_for_and_operator(3);
					}
					} 
				}
				setState(1151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
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
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_expr_print, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				{
				setState(1153);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1154);
				any_name();
				}
				break;
			case 3:
				{
				setState(1163);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1158);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
					case 1:
						{
						setState(1155);
						database_name();
						setState(1156);
						match(DOT);
						}
						break;
					}
					setState(1160);
					table_name();
					setState(1161);
					match(DOT);
					}
					break;
				}
				setState(1165);
				column_name();
				}
				break;
			case 4:
				{
				setState(1166);
				unary_operator();
				setState(1167);
				expr_print(15);
				}
				break;
			case 5:
				{
				setState(1169);
				function_name();
				setState(1170);
				match(OPEN_PAR);
				setState(1183);
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
					setState(1172);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_DISTINCT) {
						{
						setState(1171);
						match(K_DISTINCT);
						}
					}

					setState(1174);
					expr_print(0);
					setState(1179);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1175);
						match(COMMA);
						setState(1176);
						expr_print(0);
						}
						}
						setState(1181);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(1182);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(1185);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(1187);
				match(OPEN_PAR);
				setState(1188);
				expr_print(0);
				setState(1189);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(1191);
				match(OPEN_ARRAY);
				setState(1192);
				expr_print(0);
				setState(1193);
				match(CLOSE_ARRAY);
				}
				break;
			case 8:
				{
				setState(1195);
				match(OPEN_ARRAY);
				setState(1196);
				var_operator();
				setState(1197);
				match(CLOSE_ARRAY);
				}
				break;
			case 9:
				{
				setState(1203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(1200);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(1199);
						match(K_NOT);
						}
					}

					setState(1202);
					match(K_EXISTS);
					}
				}

				setState(1205);
				match(OPEN_PAR);
				setState(1206);
				select_stmt();
				setState(1207);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1274);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_printContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_print);
						setState(1211);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1212);
						match(PIPE2);
						setState(1213);
						expr_print(15);
						}
						break;
					case 2:
						{
						_localctx = new Expr_printContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_print);
						setState(1214);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1215);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1216);
						expr_print(14);
						}
						break;
					case 3:
						{
						_localctx = new Expr_printContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_print);
						setState(1217);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1218);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1219);
						expr_print(13);
						}
						break;
					case 4:
						{
						_localctx = new Expr_printContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_print);
						setState(1220);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1221);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1222);
						expr_print(12);
						}
						break;
					case 5:
						{
						_localctx = new Expr_printContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_print);
						setState(1223);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1224);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1225);
						expr_print(11);
						}
						break;
					case 6:
						{
						_localctx = new Expr_printContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_print);
						setState(1226);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1239);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
						case 1:
							{
							setState(1227);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(1228);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(1229);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(1230);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(1231);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(1232);
							match(K_IS);
							setState(1233);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(1234);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(1235);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(1236);
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(1237);
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(1238);
							match(K_REGEXP);
							}
							break;
						}
						setState(1241);
						expr_print(10);
						}
						break;
					case 7:
						{
						_localctx = new Expr_printContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_print);
						setState(1242);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1243);
						match(K_AND);
						setState(1244);
						expr_print(9);
						}
						break;
					case 8:
						{
						_localctx = new Expr_printContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_print);
						setState(1245);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1246);
						match(K_OR);
						setState(1247);
						expr_print(8);
						}
						break;
					case 9:
						{
						_localctx = new Expr_printContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_print);
						setState(1248);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1250);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1249);
							match(K_NOT);
							}
						}

						setState(1252);
						match(K_IN);
						setState(1272);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
						case 1:
							{
							setState(1253);
							match(OPEN_PAR);
							setState(1263);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case K_SELECT:
							case K_VALUES:
								{
								setState(1254);
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
								setState(1255);
								expr_print(0);
								setState(1260);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1256);
									match(COMMA);
									setState(1257);
									expr_print(0);
									}
									}
									setState(1262);
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
							setState(1265);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1269);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
							case 1:
								{
								setState(1266);
								database_name();
								setState(1267);
								match(DOT);
								}
								break;
							}
							setState(1271);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
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
		enterRule(_localctx, 100, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1279);
			match(K_REFERENCES);
			setState(1283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1280);
				database_name();
				setState(1281);
				match(DOT);
				}
				break;
			}
			setState(1285);
			foreign_table();
			setState(1297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(1286);
				match(OPEN_PAR);
				setState(1287);
				fk_target_column_name();
				setState(1292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1288);
					match(COMMA);
					setState(1289);
					fk_target_column_name();
					}
					}
					setState(1294);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1295);
				match(CLOSE_PAR);
				}
				break;
			}
			setState(1317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(1313);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(1299);
					match(K_ON);
					setState(1300);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1309);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
					case 1:
						{
						setState(1301);
						match(K_SET);
						setState(1302);
						match(K_NULL);
						}
						break;
					case 2:
						{
						setState(1303);
						match(K_SET);
						setState(1304);
						match(K_DEFAULT);
						}
						break;
					case 3:
						{
						setState(1305);
						match(K_CASCADE);
						}
						break;
					case 4:
						{
						setState(1306);
						match(K_RESTRICT);
						}
						break;
					case 5:
						{
						setState(1307);
						match(K_NO);
						setState(1308);
						match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(1311);
					match(K_MATCH);
					setState(1312);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1319);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				{
				setState(1321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1320);
					match(K_NOT);
					}
				}

				setState(1323);
				match(K_DEFERRABLE);
				setState(1328);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
				case 1:
					{
					setState(1324);
					match(K_INITIALLY);
					setState(1325);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1326);
					match(K_INITIALLY);
					setState(1327);
					match(K_IMMEDIATE);
					}
					break;
				}
				setState(1331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ENABLE) {
					{
					setState(1330);
					match(K_ENABLE);
					}
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
		enterRule(_localctx, 102, RULE_fk_target_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1335);
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
		enterRule(_localctx, 104, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1337);
			column_name();
			setState(1340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1338);
				match(K_COLLATE);
				setState(1339);
				collation_name();
				}
			}

			setState(1343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1342);
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
		enterRule(_localctx, 106, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1345);
				match(K_CONSTRAINT);
				setState(1346);
				name();
				}
			}

			setState(1358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1349);
				table_constraint_primary_key();
				}
				break;
			case K_KEY:
				{
				setState(1350);
				table_constraint_key();
				}
				break;
			case K_UNIQUE:
				{
				setState(1351);
				table_constraint_unique();
				}
				break;
			case K_CHECK:
				{
				setState(1352);
				match(K_CHECK);
				setState(1353);
				match(OPEN_PAR);
				setState(1354);
				expr(0);
				setState(1355);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1357);
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
		enterRule(_localctx, 108, RULE_table_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1360);
			match(K_PRIMARY);
			setState(1361);
			match(K_KEY);
			setState(1362);
			match(OPEN_PAR);
			setState(1363);
			indexed_column();
			setState(1368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1364);
				match(COMMA);
				setState(1365);
				indexed_column();
				}
				}
				setState(1370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1371);
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
		enterRule(_localctx, 110, RULE_table_constraint_foreign_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1373);
			match(K_FOREIGN);
			setState(1374);
			match(K_KEY);
			setState(1375);
			match(OPEN_PAR);
			setState(1376);
			fk_origin_column_name();
			setState(1381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1377);
				match(COMMA);
				setState(1378);
				fk_origin_column_name();
				}
				}
				setState(1383);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1384);
			match(CLOSE_PAR);
			setState(1385);
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
		enterRule(_localctx, 112, RULE_table_constraint_unique);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1387);
			match(K_UNIQUE);
			setState(1389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_KEY) {
				{
				setState(1388);
				match(K_KEY);
				}
			}

			setState(1392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(1391);
				name();
				}
				break;
			}
			setState(1394);
			match(OPEN_PAR);
			setState(1395);
			indexed_column();
			setState(1400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1396);
				match(COMMA);
				setState(1397);
				indexed_column();
				}
				}
				setState(1402);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1403);
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
		enterRule(_localctx, 114, RULE_table_constraint_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1405);
			match(K_KEY);
			setState(1407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				{
				setState(1406);
				name();
				}
				break;
			}
			setState(1409);
			match(OPEN_PAR);
			setState(1410);
			indexed_column();
			setState(1415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1411);
				match(COMMA);
				setState(1412);
				indexed_column();
				}
				}
				setState(1417);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1418);
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
		enterRule(_localctx, 116, RULE_fk_origin_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1420);
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
		enterRule(_localctx, 118, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				{
				setState(1422);
				database_name();
				setState(1423);
				match(DOT);
				}
				break;
			}
			setState(1427);
			table_name();
			setState(1433);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1428);
				match(K_INDEXED);
				setState(1429);
				match(K_BY);
				setState(1430);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1431);
				match(K_NOT);
				setState(1432);
				match(K_INDEXED);
				}
				break;
			case EOF:
				break;
			default:
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
		enterRule(_localctx, 120, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1435);
			expr(0);
			setState(1437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				{
				setState(1436);
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
		enterRule(_localctx, 122, RULE_pragma_value);
		try {
			setState(1442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1439);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1440);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1441);
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
		enterRule(_localctx, 124, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1444);
			table_name();
			setState(1456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1445);
				match(OPEN_PAR);
				setState(1446);
				column_name();
				setState(1451);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1447);
					match(COMMA);
					setState(1448);
					column_name();
					}
					}
					setState(1453);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1454);
				match(CLOSE_PAR);
				}
			}

			setState(1458);
			match(K_AS);
			setState(1459);
			match(OPEN_PAR);
			setState(1460);
			select_stmt();
			setState(1461);
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
		enterRule(_localctx, 126, RULE_result_column);
		int _la;
		try {
			setState(1475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1463);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1464);
				table_name();
				setState(1465);
				match(DOT);
				setState(1466);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1468);
				expr(0);
				setState(1473);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1470);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1469);
						match(K_AS);
						}
					}

					setState(1472);
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
		enterRule(_localctx, 128, RULE_table_or_subquery);
		int _la;
		try {
			setState(1524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1480);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1477);
					database_name();
					setState(1478);
					match(DOT);
					}
					break;
				}
				setState(1482);
				table_name();
				setState(1487);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1484);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1483);
						match(K_AS);
						}
					}

					setState(1486);
					table_alias();
					}
					break;
				}
				setState(1494);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1489);
					match(K_INDEXED);
					setState(1490);
					match(K_BY);
					setState(1491);
					index_name();
					}
					break;
				case 2:
					{
					setState(1492);
					match(K_NOT);
					setState(1493);
					match(K_INDEXED);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1496);
				match(OPEN_PAR);
				setState(1506);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1497);
					table_or_subquery();
					setState(1502);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1498);
						match(COMMA);
						setState(1499);
						table_or_subquery();
						}
						}
						setState(1504);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1505);
					join_clause();
					}
					break;
				}
				setState(1508);
				match(CLOSE_PAR);
				setState(1513);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1510);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1509);
						match(K_AS);
						}
					}

					setState(1512);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1515);
				match(OPEN_PAR);
				setState(1516);
				select_stmt();
				setState(1517);
				match(CLOSE_PAR);
				setState(1522);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
				case 1:
					{
					setState(1519);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1518);
						match(K_AS);
						}
					}

					setState(1521);
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
		enterRule(_localctx, 130, RULE_join_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1526);
			table_or_subquery();
			setState(1533);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1527);
					join_operator();
					setState(1528);
					table_or_subquery();
					setState(1529);
					join_constraint();
					}
					} 
				}
				setState(1535);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
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
		enterRule(_localctx, 132, RULE_join_operator);
		int _la;
		try {
			setState(1545);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1536);
				match(COMMA);
				}
				break;
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1542);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1537);
					match(K_LEFT);
					setState(1539);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1538);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1541);
					match(K_INNER);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(1544);
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
		enterRule(_localctx, 134, RULE_join_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1547);
				match(K_ON);
				setState(1548);
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
		enterRule(_localctx, 136, RULE_select_core);
		int _la;
		try {
			int _alt;
			setState(1625);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1551);
				match(K_SELECT);
				setState(1553);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(1552);
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

				setState(1555);
				result_column();
				setState(1560);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1556);
						match(COMMA);
						setState(1557);
						result_column();
						}
						} 
					}
					setState(1562);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
				}
				setState(1575);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1563);
					match(K_FROM);
					setState(1573);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
					case 1:
						{
						setState(1564);
						table_or_subquery();
						setState(1569);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1565);
								match(COMMA);
								setState(1566);
								table_or_subquery();
								}
								} 
							}
							setState(1571);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
						}
						}
						break;
					case 2:
						{
						setState(1572);
						join_clause();
						}
						break;
					}
					}
					break;
				}
				setState(1579);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1577);
					match(K_WHERE);
					setState(1578);
					expr(0);
					}
					break;
				}
				setState(1595);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
				case 1:
					{
					setState(1581);
					match(K_GROUP);
					setState(1582);
					match(K_BY);
					setState(1583);
					expr(0);
					setState(1588);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1584);
							match(COMMA);
							setState(1585);
							expr(0);
							}
							} 
						}
						setState(1590);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
					}
					setState(1593);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
					case 1:
						{
						setState(1591);
						match(K_HAVING);
						setState(1592);
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
				setState(1597);
				match(K_VALUES);
				setState(1598);
				match(OPEN_PAR);
				setState(1599);
				expr(0);
				setState(1604);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1600);
					match(COMMA);
					setState(1601);
					expr(0);
					}
					}
					setState(1606);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1607);
				match(CLOSE_PAR);
				setState(1622);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1608);
						match(COMMA);
						setState(1609);
						match(OPEN_PAR);
						setState(1610);
						expr(0);
						setState(1615);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1611);
							match(COMMA);
							setState(1612);
							expr(0);
							}
							}
							setState(1617);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1618);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(1624);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
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
		enterRule(_localctx, 138, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1627);
			table_name();
			setState(1639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1628);
				match(OPEN_PAR);
				setState(1629);
				column_name();
				setState(1634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1630);
					match(COMMA);
					setState(1631);
					column_name();
					}
					}
					setState(1636);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1637);
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
		enterRule(_localctx, 140, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1646);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMERIC_LITERAL:
				{
				setState(1642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(1641);
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

				setState(1644);
				match(NUMERIC_LITERAL);
				}
				break;
			case STAR:
				{
				setState(1645);
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
		enterRule(_localctx, 142, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1648);
			_la = _input.LA(1);
			if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (K_CURRENT_DATE - 70)) | (1L << (K_CURRENT_TIME - 70)) | (1L << (K_CURRENT_TIMESTAMP - 70)) | (1L << (K_NULL - 70)))) != 0) || ((((_la - 183)) & ~0x3f) == 0 && ((1L << (_la - 183)) & ((1L << (NUMERIC_LITERAL - 183)) | (1L << (STRING_LITERAL - 183)) | (1L << (BLOB_LITERAL - 183)))) != 0)) ) {
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
		enterRule(_localctx, 144, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1650);
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
		enterRule(_localctx, 146, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1652);
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
		enterRule(_localctx, 148, RULE_module_argument);
		try {
			setState(1656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1654);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1655);
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
		enterRule(_localctx, 150, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1658);
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
		enterRule(_localctx, 152, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1660);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)))) != 0)) ) {
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
		enterRule(_localctx, 154, RULE_unknown);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1663); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1662);
				matchWildcard();
				}
				}
				setState(1665); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << SCOL) | (1L << DOT) | (1L << OPEN_PAR) | (1L << CLOSE_PAR) | (1L << OPEN_B) | (1L << CLOSE_B) | (1L << AND) | (1L << COMMA) | (1L << ASSIGN) | (1L << STAR) | (1L << PLUS) | (1L << PLUS_PLUS) | (1L << MINUS) | (1L << MINUS_MINUS) | (1L << TILDE) | (1L << PIPE2) | (1L << DIV) | (1L << MOD) | (1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE) | (1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ) | (1L << EQ) | (1L << EQ_WITH_PLUS) | (1L << PLUS_WITH_EQ) | (1L << EQ_WITH_MINUS) | (1L << MINUS_WITH_EQ) | (1L << STAR_WITH_EQ) | (1L << DIV_WITH_EQ) | (1L << NOT_EQ1) | (1L << NOT_EQ2) | (1L << OPEN_ARRAY) | (1L << CLOSE_ARRAY) | (1L << QuesM) | (1L << ORM) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BREAK) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DO - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_FUNCTION - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_ONLY - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_PRINT - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RETURN - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_SWITCH - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WHILE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_VAR - 128)) | (1L << (K_TYPE - 128)) | (1L << (K_CSV - 128)) | (1L << (K_JSON - 128)) | (1L << (K_AGGREGATION_FUNCTION - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (IDENTIFIER_JSON_ARRAY - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (BIND_PARAMETER - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)) | (1L << (SINGLE_LINE_COMMENT - 128)) | (1L << (MULTILINE_COMMENT - 128)) | (1L << (SPACES - 128)) | (1L << (UNEXPECTED_CHAR - 128)))) != 0) );
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
		enterRule(_localctx, 156, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1667);
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
		enterRule(_localctx, 158, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1669);
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
		enterRule(_localctx, 160, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1671);
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
		enterRule(_localctx, 162, RULE_source_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1673);
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
		enterRule(_localctx, 164, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1675);
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
		enterRule(_localctx, 166, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1677);
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
		enterRule(_localctx, 168, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1679);
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
		enterRule(_localctx, 170, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1681);
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
		enterRule(_localctx, 172, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1683);
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
		enterRule(_localctx, 174, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1685);
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
		enterRule(_localctx, 176, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1687);
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
		enterRule(_localctx, 178, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1689);
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
		enterRule(_localctx, 180, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1691);
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
		enterRule(_localctx, 182, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1693);
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
		enterRule(_localctx, 184, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1695);
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
		enterRule(_localctx, 186, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1697);
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
		enterRule(_localctx, 188, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1699);
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
		enterRule(_localctx, 190, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1701);
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
		enterRule(_localctx, 192, RULE_any_name);
		try {
			setState(1709);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1703);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1704);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1705);
				match(OPEN_PAR);
				setState(1706);
				any_name();
				setState(1707);
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
		enterRule(_localctx, 194, RULE_any_name_identifier_json);
		try {
			setState(1718);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER_JSON_ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1711);
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
				setState(1712);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1713);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1714);
				match(OPEN_PAR);
				setState(1715);
				any_name();
				setState(1716);
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
		case 45:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 46:
			return expr_while_sempred((Expr_whileContext)_localctx, predIndex);
		case 47:
			return expr_if_sempred((Expr_ifContext)_localctx, predIndex);
		case 48:
			return expr_for_and_operator_sempred((Expr_for_and_operatorContext)_localctx, predIndex);
		case 49:
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
			return precpred(_ctx, 12);
		case 10:
			return precpred(_ctx, 11);
		case 11:
			return precpred(_ctx, 10);
		case 12:
			return precpred(_ctx, 9);
		case 13:
			return precpred(_ctx, 8);
		case 14:
			return precpred(_ctx, 7);
		case 15:
			return precpred(_ctx, 6);
		case 16:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean expr_if_sempred(Expr_ifContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 13);
		case 18:
			return precpred(_ctx, 12);
		case 19:
			return precpred(_ctx, 11);
		case 20:
			return precpred(_ctx, 10);
		case 21:
			return precpred(_ctx, 9);
		case 22:
			return precpred(_ctx, 8);
		case 23:
			return precpred(_ctx, 7);
		case 24:
			return precpred(_ctx, 6);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00c0\u06bb\4\2\t"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\3\2\3\2\3\2\7\2\u00ca\n\2\f\2\16\2\u00cd\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\4\7\4\u00d5\n\4\f\4\16\4\u00d8\13\4\3\4\3\4\6\4\u00dc"+
		"\n\4\r\4\16\4\u00dd\3\4\7\4\u00e1\n\4\f\4\16\4\u00e4\13\4\3\4\7\4\u00e7"+
		"\n\4\f\4\16\4\u00ea\13\4\3\5\3\5\3\5\5\5\u00ef\n\5\5\5\u00f1\n\5\3\5\3"+
		"\5\3\5\3\5\5\5\u00f7\n\5\3\6\3\6\3\6\5\6\u00fc\n\6\3\7\5\7\u00ff\n\7\3"+
		"\7\5\7\u0102\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u010b\n\7\f\7\16\7\u010e"+
		"\13\7\5\7\u0110\n\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0125\n\b\f\b\16\b\u0128\13\b\3\b\5\b\u012b"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\5\t\u0132\n\t\3\t\3\t\3\t\3\t\7\t\u0138\n\t\f"+
		"\t\16\t\u013b\13\t\5\t\u013d\n\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\7\13\u014a\n\13\f\13\16\13\u014d\13\13\3\f\5\f\u0150\n\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\7\r\u0159\n\r\f\r\16\r\u015c\13\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0167\n\16\3\16\7\16\u016a\n\16"+
		"\f\16\16\16\u016d\13\16\3\16\5\16\u0170\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u017c\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u0184\n\20\3\21\3\21\3\21\3\21\5\21\u018a\n\21\3\21\3\21\3\21\5"+
		"\21\u018f\n\21\3\21\7\21\u0192\n\21\f\21\16\21\u0195\13\21\3\21\3\21\3"+
		"\21\7\21\u019a\n\21\f\21\16\21\u019d\13\21\3\21\3\21\7\21\u01a1\n\21\f"+
		"\21\16\21\u01a4\13\21\3\21\3\21\7\21\u01a8\n\21\f\21\16\21\u01ab\13\21"+
		"\3\21\3\21\7\21\u01af\n\21\f\21\16\21\u01b2\13\21\3\21\7\21\u01b5\n\21"+
		"\f\21\16\21\u01b8\13\21\5\21\u01ba\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u01c5\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u01d7\n\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u01df\n\25\3\26\5\26\u01e2\n\26\3\26\5\26\u01e5\n"+
		"\26\3\26\3\26\3\26\3\26\5\26\u01eb\n\26\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\5\30\u01f6\n\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u0202\n\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u020a\n"+
		"\31\3\31\3\31\7\31\u020e\n\31\f\31\16\31\u0211\13\31\5\31\u0213\n\31\3"+
		"\31\3\31\5\31\u0217\n\31\7\31\u0219\n\31\f\31\16\31\u021c\13\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\5\31\u0225\n\31\3\31\3\31\7\31\u0229\n\31"+
		"\f\31\16\31\u022c\13\31\5\31\u022e\n\31\3\31\3\31\5\31\u0232\n\31\5\31"+
		"\u0234\n\31\3\31\3\31\3\32\3\32\5\32\u023a\n\32\3\32\3\32\3\32\3\32\7"+
		"\32\u0240\n\32\f\32\16\32\u0243\13\32\5\32\u0245\n\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\5\33\u024f\n\33\3\33\3\33\3\33\5\33\u0254\n\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u025d\n\33\f\33\16\33\u0260\13"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u026a\n\33\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u0271\n\34\3\34\3\34\3\34\3\34\3\34\7\34\u0278\n"+
		"\34\f\34\16\34\u027b\13\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3\"\3\"\3\"\3\"\7\"\u029a\n\"\f\"\16\"\u029d\13\"\3\"\3\"\3#\3#\3"+
		"#\3#\3#\3#\7#\u02a7\n#\f#\16#\u02aa\13#\5#\u02ac\n#\3#\3#\3#\3#\5#\u02b2"+
		"\n#\5#\u02b4\n#\3$\3$\3$\3$\3$\3$\7$\u02bc\n$\f$\16$\u02bf\13$\5$\u02c1"+
		"\n$\3$\3$\3$\3$\5$\u02c7\n$\5$\u02c9\n$\3%\3%\5%\u02cd\n%\3%\3%\3%\7%"+
		"\u02d2\n%\f%\16%\u02d5\13%\3%\3%\3%\3%\7%\u02db\n%\f%\16%\u02de\13%\3"+
		"%\5%\u02e1\n%\5%\u02e3\n%\3%\3%\5%\u02e7\n%\3%\3%\3%\3%\3%\7%\u02ee\n"+
		"%\f%\16%\u02f1\13%\3%\3%\5%\u02f5\n%\5%\u02f7\n%\3%\3%\3%\3%\3%\7%\u02fe"+
		"\n%\f%\16%\u0301\13%\3%\3%\3%\3%\3%\3%\7%\u0309\n%\f%\16%\u030c\13%\3"+
		"%\3%\7%\u0310\n%\f%\16%\u0313\13%\5%\u0315\n%\3&\3&\3&\7&\u031a\n&\f&"+
		"\16&\u031d\13&\3\'\3\'\3\'\3\'\5\'\u0323\n\'\3\'\3\'\3\'\3\'\3\'\5\'\u032a"+
		"\n\'\3\'\3\'\3\'\5\'\u032f\n\'\3\'\3\'\5\'\u0333\n\'\3(\3(\5(\u0337\n"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0346\n(\3)\3)\3)\5)\u034b"+
		"\n)\3)\5)\u034e\n)\3*\3*\3+\3+\3+\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\5-\u0363\n-\3-\3-\6-\u0367\n-\r-\16-\u0368\5-\u036b\n-\3.\3.\5"+
		".\u036f\n.\3/\3/\3/\3/\3/\5/\u0376\n/\3/\3/\3/\5/\u037b\n/\3/\3/\3/\3"+
		"/\3/\3/\3/\5/\u0384\n/\3/\3/\3/\7/\u0389\n/\f/\16/\u038c\13/\3/\5/\u038f"+
		"\n/\3/\3/\3/\3/\3/\3/\3/\5/\u0398\n/\3/\5/\u039b\n/\3/\3/\3/\3/\3/\3/"+
		"\5/\u03a3\n/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u03c1\n/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/"+
		"\u03cc\n/\3/\3/\3/\3/\3/\3/\7/\u03d4\n/\f/\16/\u03d7\13/\5/\u03d9\n/\3"+
		"/\3/\3/\3/\5/\u03df\n/\3/\5/\u03e2\n/\7/\u03e4\n/\f/\16/\u03e7\13/\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\5\60\u03fd\n\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\5\60\u040a\n\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\7\60\u0424\n\60\f\60\16\60\u0427\13\60\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\5\61\u043d\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u044e\n\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u0468\n\61\f\61\16\61\u046b\13"+
		"\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0479"+
		"\n\62\3\62\3\62\3\62\7\62\u047e\n\62\f\62\16\62\u0481\13\62\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\5\63\u0489\n\63\3\63\3\63\3\63\5\63\u048e\n\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0497\n\63\3\63\3\63\3\63\7\63"+
		"\u049c\n\63\f\63\16\63\u049f\13\63\3\63\5\63\u04a2\n\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u04b3"+
		"\n\63\3\63\5\63\u04b6\n\63\3\63\3\63\3\63\3\63\5\63\u04bc\n\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u04da"+
		"\n\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u04e5\n\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\7\63\u04ed\n\63\f\63\16\63\u04f0\13\63\5\63"+
		"\u04f2\n\63\3\63\3\63\3\63\3\63\5\63\u04f8\n\63\3\63\5\63\u04fb\n\63\7"+
		"\63\u04fd\n\63\f\63\16\63\u0500\13\63\3\64\3\64\3\64\3\64\5\64\u0506\n"+
		"\64\3\64\3\64\3\64\3\64\3\64\7\64\u050d\n\64\f\64\16\64\u0510\13\64\3"+
		"\64\3\64\5\64\u0514\n\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\5\64\u0520\n\64\3\64\3\64\5\64\u0524\n\64\7\64\u0526\n\64\f\64\16"+
		"\64\u0529\13\64\3\64\5\64\u052c\n\64\3\64\3\64\3\64\3\64\3\64\5\64\u0533"+
		"\n\64\3\64\5\64\u0536\n\64\5\64\u0538\n\64\3\65\3\65\3\66\3\66\3\66\5"+
		"\66\u053f\n\66\3\66\5\66\u0542\n\66\3\67\3\67\5\67\u0546\n\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0551\n\67\38\38\38\38\38\38"+
		"\78\u0559\n8\f8\168\u055c\138\38\38\39\39\39\39\39\39\79\u0566\n9\f9\16"+
		"9\u0569\139\39\39\39\3:\3:\5:\u0570\n:\3:\5:\u0573\n:\3:\3:\3:\3:\7:\u0579"+
		"\n:\f:\16:\u057c\13:\3:\3:\3;\3;\5;\u0582\n;\3;\3;\3;\3;\7;\u0588\n;\f"+
		";\16;\u058b\13;\3;\3;\3<\3<\3=\3=\3=\5=\u0594\n=\3=\3=\3=\3=\3=\3=\5="+
		"\u059c\n=\3>\3>\5>\u05a0\n>\3?\3?\3?\5?\u05a5\n?\3@\3@\3@\3@\3@\7@\u05ac"+
		"\n@\f@\16@\u05af\13@\3@\3@\5@\u05b3\n@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3"+
		"A\3A\5A\u05c1\nA\3A\5A\u05c4\nA\5A\u05c6\nA\3B\3B\3B\5B\u05cb\nB\3B\3"+
		"B\5B\u05cf\nB\3B\5B\u05d2\nB\3B\3B\3B\3B\3B\5B\u05d9\nB\3B\3B\3B\3B\7"+
		"B\u05df\nB\fB\16B\u05e2\13B\3B\5B\u05e5\nB\3B\3B\5B\u05e9\nB\3B\5B\u05ec"+
		"\nB\3B\3B\3B\3B\5B\u05f2\nB\3B\5B\u05f5\nB\5B\u05f7\nB\3C\3C\3C\3C\3C"+
		"\7C\u05fe\nC\fC\16C\u0601\13C\3D\3D\3D\5D\u0606\nD\3D\5D\u0609\nD\3D\5"+
		"D\u060c\nD\3E\3E\5E\u0610\nE\3F\3F\5F\u0614\nF\3F\3F\3F\7F\u0619\nF\f"+
		"F\16F\u061c\13F\3F\3F\3F\3F\7F\u0622\nF\fF\16F\u0625\13F\3F\5F\u0628\n"+
		"F\5F\u062a\nF\3F\3F\5F\u062e\nF\3F\3F\3F\3F\3F\7F\u0635\nF\fF\16F\u0638"+
		"\13F\3F\3F\5F\u063c\nF\5F\u063e\nF\3F\3F\3F\3F\3F\7F\u0645\nF\fF\16F\u0648"+
		"\13F\3F\3F\3F\3F\3F\3F\7F\u0650\nF\fF\16F\u0653\13F\3F\3F\7F\u0657\nF"+
		"\fF\16F\u065a\13F\5F\u065c\nF\3G\3G\3G\3G\3G\7G\u0663\nG\fG\16G\u0666"+
		"\13G\3G\3G\5G\u066a\nG\3H\5H\u066d\nH\3H\3H\5H\u0671\nH\3I\3I\3J\3J\3"+
		"K\3K\3L\3L\5L\u067b\nL\3M\3M\3N\3N\3O\6O\u0682\nO\rO\16O\u0683\3P\3P\3"+
		"Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3"+
		"\\\3]\3]\3^\3^\3_\3_\3`\3`\3a\3a\3b\3b\3b\3b\3b\3b\5b\u06b0\nb\3c\3c\3"+
		"c\3c\3c\3c\3c\5c\u06b9\nc\3c\2\7\\^`bdd\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\2\22\3\2"+
		"\u00b4\u00b5\4\2\f\f\u0082\u0082\4\2\60\60RR\4\2\65\65PP\4\2\16\16\25"+
		"\26\4\2\17\17\21\21\3\2\27\32\3\2\33\36\4\2\37\37&&\4\2\20\20\22\22\4"+
		"\2\r\r %\4\2OO\u00a7\u00a7\6\2HJ\u0080\u0080\u00b9\u00b9\u00bb\u00bc\6"+
		"\2\17\17\21\21\23\23~~\4\2\u00b7\u00b7\u00bb\u00bb\13\2,:<RTbd\u0083\u0085"+
		"\u008a\u008c\u0095\u0097\u009c\u009e\u00ae\u00b0\u00b1\2\u079c\2\u00cb"+
		"\3\2\2\2\4\u00d0\3\2\2\2\6\u00d6\3\2\2\2\b\u00f0\3\2\2\2\n\u00fb\3\2\2"+
		"\2\f\u00fe\3\2\2\2\16\u0126\3\2\2\2\20\u012c\3\2\2\2\22\u0141\3\2\2\2"+
		"\24\u0147\3\2\2\2\26\u014f\3\2\2\2\30\u015a\3\2\2\2\32\u015d\3\2\2\2\34"+
		"\u0171\3\2\2\2\36\u017d\3\2\2\2 \u01b9\3\2\2\2\"\u01bb\3\2\2\2$\u01c6"+
		"\3\2\2\2&\u01cd\3\2\2\2(\u01d2\3\2\2\2*\u01e1\3\2\2\2,\u01ec\3\2\2\2."+
		"\u01f1\3\2\2\2\60\u01f9\3\2\2\2\62\u0239\3\2\2\2\64\u0249\3\2\2\2\66\u026b"+
		"\3\2\2\28\u027e\3\2\2\2:\u028d\3\2\2\2<\u028f\3\2\2\2>\u0291\3\2\2\2@"+
		"\u0293\3\2\2\2B\u0295\3\2\2\2D\u02a0\3\2\2\2F\u02b5\3\2\2\2H\u0314\3\2"+
		"\2\2J\u0316\3\2\2\2L\u031e\3\2\2\2N\u0336\3\2\2\2P\u0347\3\2\2\2R\u034f"+
		"\3\2\2\2T\u0351\3\2\2\2V\u0354\3\2\2\2X\u0356\3\2\2\2Z\u036e\3\2\2\2\\"+
		"\u03a2\3\2\2\2^\u0409\3\2\2\2`\u044d\3\2\2\2b\u0478\3\2\2\2d\u04bb\3\2"+
		"\2\2f\u0501\3\2\2\2h\u0539\3\2\2\2j\u053b\3\2\2\2l\u0545\3\2\2\2n\u0552"+
		"\3\2\2\2p\u055f\3\2\2\2r\u056d\3\2\2\2t\u057f\3\2\2\2v\u058e\3\2\2\2x"+
		"\u0593\3\2\2\2z\u059d\3\2\2\2|\u05a4\3\2\2\2~\u05a6\3\2\2\2\u0080\u05c5"+
		"\3\2\2\2\u0082\u05f6\3\2\2\2\u0084\u05f8\3\2\2\2\u0086\u060b\3\2\2\2\u0088"+
		"\u060f\3\2\2\2\u008a\u065b\3\2\2\2\u008c\u065d\3\2\2\2\u008e\u0670\3\2"+
		"\2\2\u0090\u0672\3\2\2\2\u0092\u0674\3\2\2\2\u0094\u0676\3\2\2\2\u0096"+
		"\u067a\3\2\2\2\u0098\u067c\3\2\2\2\u009a\u067e\3\2\2\2\u009c\u0681\3\2"+
		"\2\2\u009e\u0685\3\2\2\2\u00a0\u0687\3\2\2\2\u00a2\u0689\3\2\2\2\u00a4"+
		"\u068b\3\2\2\2\u00a6\u068d\3\2\2\2\u00a8\u068f\3\2\2\2\u00aa\u0691\3\2"+
		"\2\2\u00ac\u0693\3\2\2\2\u00ae\u0695\3\2\2\2\u00b0\u0697\3\2\2\2\u00b2"+
		"\u0699\3\2\2\2\u00b4\u069b\3\2\2\2\u00b6\u069d\3\2\2\2\u00b8\u069f\3\2"+
		"\2\2\u00ba\u06a1\3\2\2\2\u00bc\u06a3\3\2\2\2\u00be\u06a5\3\2\2\2\u00c0"+
		"\u06a7\3\2\2\2\u00c2\u06af\3\2\2\2\u00c4\u06b8\3\2\2\2\u00c6\u00ca\5\n"+
		"\6\2\u00c7\u00ca\5\6\4\2\u00c8\u00ca\5\4\3\2\u00c9\u00c6\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2"+
		"\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce"+
		"\u00cf\7\2\2\3\u00cf\3\3\2\2\2\u00d0\u00d1\7\u00c0\2\2\u00d1\u00d2\b\3"+
		"\1\2\u00d2\5\3\2\2\2\u00d3\u00d5\7\5\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8"+
		"\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d9\u00e2\5\b\5\2\u00da\u00dc\7\5\2\2\u00db\u00da\3\2"+
		"\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e1\5\b\5\2\u00e0\u00db\3\2\2\2\u00e1\u00e4\3\2"+
		"\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e8\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e5\u00e7\7\5\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2"+
		"\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\7\3\2\2\2\u00ea\u00e8"+
		"\3\2\2\2\u00eb\u00ee\7]\2\2\u00ec\u00ed\7\u008c\2\2\u00ed\u00ef\7\u0088"+
		"\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0"+
		"\u00eb\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f6\3\2\2\2\u00f2\u00f7\5\66"+
		"\34\2\u00f3\u00f7\5\64\33\2\u00f4\u00f7\58\35\2\u00f5\u00f7\5D#\2\u00f6"+
		"\u00f2\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2"+
		"\2\2\u00f7\t\3\2\2\2\u00f8\u00fc\5\f\7\2\u00f9\u00fc\5\20\t\2\u00fa\u00fc"+
		"\5\62\32\2\u00fb\u00f8\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2"+
		"\u00fc\13\3\2\2\2\u00fd\u00ff\7\u00b2\2\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff"+
		"\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u0102\7c\2\2\u0101\u0100\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\5\u00c2b\2\u0104\u010f"+
		"\7\7\2\2\u0105\u0106\7\u00b2\2\2\u0106\u010c\5\u00c2b\2\u0107\u0108\7"+
		"\f\2\2\u0108\u0109\7\u00b2\2\2\u0109\u010b\5\u00c2b\2\u010a\u0107\3\2"+
		"\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0105\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\u0111\3\2\2\2\u0111\u0112\7\b\2\2\u0112\u0113\7\t\2\2\u0113"+
		"\u0114\5\16\b\2\u0114\u0115\7\n\2\2\u0115\r\3\2\2\2\u0116\u0125\5\22\n"+
		"\2\u0117\u0125\5\26\f\2\u0118\u0125\5\32\16\2\u0119\u0125\5\"\22\2\u011a"+
		"\u0125\5$\23\2\u011b\u0125\5(\25\2\u011c\u0125\5\60\31\2\u011d\u0125\5"+
		" \21\2\u011e\u011f\5\6\4\2\u011f\u0120\7\5\2\2\u0120\u0125\3\2\2\2\u0121"+
		"\u0125\5\20\t\2\u0122\u0125\5\62\32\2\u0123\u0125\5\24\13\2\u0124\u0116"+
		"\3\2\2\2\u0124\u0117\3\2\2\2\u0124\u0118\3\2\2\2\u0124\u0119\3\2\2\2\u0124"+
		"\u011a\3\2\2\2\u0124\u011b\3\2\2\2\u0124\u011c\3\2\2\2\u0124\u011d\3\2"+
		"\2\2\u0124\u011e\3\2\2\2\u0124\u0121\3\2\2\2\u0124\u0122\3\2\2\2\u0124"+
		"\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012b\5.\30\2\u012a"+
		"\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\17\3\2\2\2\u012c\u012d\7\u00b2"+
		"\2\2\u012d\u012e\7\u00b7\2\2\u012e\u0131\7\r\2\2\u012f\u0132\7c\2\2\u0130"+
		"\u0132\5\u00c2b\2\u0131\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132\u0133"+
		"\3\2\2\2\u0133\u013c\7\7\2\2\u0134\u0139\5\u00c2b\2\u0135\u0136\7\f\2"+
		"\2\u0136\u0138\5\u00c2b\2\u0137\u0135\3\2\2\2\u0138\u013b\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2"+
		"\2\2\u013c\u0134\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u013f\7\b\2\2\u013f\u0140\7\5\2\2\u0140\21\3\2\2\2\u0141\u0142\7\u00b2"+
		"\2\2\u0142\u0143\5\u00c2b\2\u0143\u0144\7\r\2\2\u0144\u0145\5\\/\2\u0145"+
		"\u0146\7\5\2\2\u0146\23\3\2\2\2\u0147\u014b\5b\62\2\u0148\u014a\7\5\2"+
		"\2\u0149\u0148\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c"+
		"\3\2\2\2\u014c\25\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u0150\7\u00b2\2\2"+
		"\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152"+
		"\7\u008b\2\2\u0152\u0153\7\7\2\2\u0153\u0154\5\30\r\2\u0154\u0155\7\b"+
		"\2\2\u0155\u0156\7\5\2\2\u0156\27\3\2\2\2\u0157\u0159\5d\63\2\u0158\u0157"+
		"\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\31\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015e\7g\2\2\u015e\u015f\7\7\2\2"+
		"\u015f\u0160\5`\61\2\u0160\u0166\7\b\2\2\u0161\u0162\7\t\2\2\u0162\u0163"+
		"\5\16\b\2\u0163\u0164\7\n\2\2\u0164\u0167\3\2\2\2\u0165\u0167\5\16\b\2"+
		"\u0166\u0161\3\2\2\2\u0166\u0165\3\2\2\2\u0167\u016b\3\2\2\2\u0168\u016a"+
		"\5\34\17\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2"+
		"\u016b\u016c\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u0170"+
		"\5\36\20\2\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170\33\3\2\2\2\u0171"+
		"\u0172\7V\2\2\u0172\u0173\7g\2\2\u0173\u0174\7\7\2\2\u0174\u0175\5`\61"+
		"\2\u0175\u017b\7\b\2\2\u0176\u0177\7\t\2\2\u0177\u0178\5\16\b\2\u0178"+
		"\u0179\7\n\2\2\u0179\u017c\3\2\2\2\u017a\u017c\5\16\b\2\u017b\u0176\3"+
		"\2\2\2\u017b\u017a\3\2\2\2\u017c\35\3\2\2\2\u017d\u0183\7V\2\2\u017e\u017f"+
		"\7\t\2\2\u017f\u0180\5\16\b\2\u0180\u0181\7\n\2\2\u0181\u0184\3\2\2\2"+
		"\u0182\u0184\5\16\b\2\u0183\u017e\3\2\2\2\u0183\u0182\3\2\2\2\u0184\37"+
		"\3\2\2\2\u0185\u0186\5`\61\2\u0186\u0189\7*\2\2\u0187\u018a\5\\/\2\u0188"+
		"\u018a\5b\62\2\u0189\u0187\3\2\2\2\u0189\u0188\3\2\2\2\u018a\u018b\3\2"+
		"\2\2\u018b\u018e\7+\2\2\u018c\u018f\5\\/\2\u018d\u018f\5b\62\2\u018e\u018c"+
		"\3\2\2\2\u018e\u018d\3\2\2\2\u018f\u0193\3\2\2\2\u0190\u0192\7\5\2\2\u0191"+
		"\u0190\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2"+
		"\2\2\u0194\u01ba\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0197\5`\61\2\u0197"+
		"\u019b\7*\2\2\u0198\u019a\7\7\2\2\u0199\u0198\3\2\2\2\u019a\u019d\3\2"+
		"\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019e\3\2\2\2\u019d"+
		"\u019b\3\2\2\2\u019e\u01a2\5 \21\2\u019f\u01a1\7\b\2\2\u01a0\u019f\3\2"+
		"\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"\u01a5\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a9\7+\2\2\u01a6\u01a8\7\7"+
		"\2\2\u01a7\u01a6\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9"+
		"\u01aa\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01b0\5 "+
		"\21\2\u01ad\u01af\7\b\2\2\u01ae\u01ad\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0"+
		"\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b6\3\2\2\2\u01b2\u01b0\3\2"+
		"\2\2\u01b3\u01b5\7\5\2\2\u01b4\u01b3\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6"+
		"\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2"+
		"\2\2\u01b9\u0185\3\2\2\2\u01b9\u0196\3\2\2\2\u01ba!\3\2\2\2\u01bb\u01bc"+
		"\7\u00af\2\2\u01bc\u01bd\7\7\2\2\u01bd\u01be\5^\60\2\u01be\u01c4\7\b\2"+
		"\2\u01bf\u01c0\7\t\2\2\u01c0\u01c1\5\16\b\2\u01c1\u01c2\7\n\2\2\u01c2"+
		"\u01c5\3\2\2\2\u01c3\u01c5\5\16\b\2\u01c4\u01bf\3\2\2\2\u01c4\u01c3\3"+
		"\2\2\2\u01c5#\3\2\2\2\u01c6\u01c7\7S\2\2\u01c7\u01c8\7\t\2\2\u01c8\u01c9"+
		"\5\16\b\2\u01c9\u01ca\7\n\2\2\u01ca\u01cb\5&\24\2\u01cb\u01cc\7\5\2\2"+
		"\u01cc%\3\2\2\2\u01cd\u01ce\7\u00af\2\2\u01ce\u01cf\7\7\2\2\u01cf\u01d0"+
		"\5^\60\2\u01d0\u01d1\7\b\2\2\u01d1\'\3\2\2\2\u01d2\u01d3\7_\2\2\u01d3"+
		"\u01d6\7\7\2\2\u01d4\u01d7\5*\26\2\u01d5\u01d7\5,\27\2\u01d6\u01d4\3\2"+
		"\2\2\u01d6\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01de\7\b\2\2\u01d9"+
		"\u01da\7\t\2\2\u01da\u01db\5\16\b\2\u01db\u01dc\7\n\2\2\u01dc\u01df\3"+
		"\2\2\2\u01dd\u01df\5\16\b\2\u01de\u01d9\3\2\2\2\u01de\u01dd\3\2\2\2\u01df"+
		")\3\2\2\2\u01e0\u01e2\7\u00b2\2\2\u01e1\u01e0\3\2\2\2\u01e1\u01e2\3\2"+
		"\2\2\u01e2\u01e4\3\2\2\2\u01e3\u01e5\5b\62\2\u01e4\u01e3\3\2\2\2\u01e4"+
		"\u01e5\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\7\5\2\2\u01e7\u01e8\5`"+
		"\61\2\u01e8\u01ea\7\5\2\2\u01e9\u01eb\5b\62\2\u01ea\u01e9\3\2\2\2\u01ea"+
		"\u01eb\3\2\2\2\u01eb+\3\2\2\2\u01ec\u01ed\7\u00b2\2\2\u01ed\u01ee\5\u00c2"+
		"b\2\u01ee\u01ef\7+\2\2\u01ef\u01f0\5\u00c2b\2\u01f0-\3\2\2\2\u01f1\u01f5"+
		"\7\u0096\2\2\u01f2\u01f6\5\\/\2\u01f3\u01f6\5\24\13\2\u01f4\u01f6\5 \21"+
		"\2\u01f5\u01f2\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f4\3\2\2\2\u01f6\u01f7"+
		"\3\2\2\2\u01f7\u01f8\7\5\2\2\u01f8/\3\2\2\2\u01f9\u01fa\7\u009d\2\2\u01fa"+
		"\u01fb\7\7\2\2\u01fb\u01fc\5\u00c2b\2\u01fc\u01fd\7\b\2\2\u01fd\u021a"+
		"\7\t\2\2\u01fe\u0201\7>\2\2\u01ff\u0202\5\u00c2b\2\u0200\u0202\5\u008e"+
		"H\2\u0201\u01ff\3\2\2\2\u0201\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203"+
		"\u0212\7+\2\2\u0204\u0213\5\16\b\2\u0205\u0206\7\t\2\2\u0206\u0209\5\16"+
		"\b\2\u0207\u0208\7;\2\2\u0208\u020a\7\5\2\2\u0209\u0207\3\2\2\2\u0209"+
		"\u020a\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020f\7\n\2\2\u020c\u020e\7\5"+
		"\2\2\u020d\u020c\3\2\2\2\u020e\u0211\3\2\2\2\u020f\u020d\3\2\2\2\u020f"+
		"\u0210\3\2\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0212\u0204\3\2"+
		"\2\2\u0212\u0205\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0215\7;\2\2\u0215"+
		"\u0217\7\5\2\2\u0216\u0214\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0219\3\2"+
		"\2\2\u0218\u01fe\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a"+
		"\u021b\3\2\2\2\u021b\u0233\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u021e\7L"+
		"\2\2\u021e\u022d\7+\2\2\u021f\u022e\5\16\b\2\u0220\u0221\7\t\2\2\u0221"+
		"\u0224\5\16\b\2\u0222\u0223\7;\2\2\u0223\u0225\7\5\2\2\u0224\u0222\3\2"+
		"\2\2\u0224\u0225\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u022a\7\n\2\2\u0227"+
		"\u0229\7\5\2\2\u0228\u0227\3\2\2\2\u0229\u022c\3\2\2\2\u022a\u0228\3\2"+
		"\2\2\u022a\u022b\3\2\2\2\u022b\u022e\3\2\2\2\u022c\u022a\3\2\2\2\u022d"+
		"\u021f\3\2\2\2\u022d\u0220\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u0231\3\2"+
		"\2\2\u022f\u0230\7;\2\2\u0230\u0232\7\5\2\2\u0231\u022f\3\2\2\2\u0231"+
		"\u0232\3\2\2\2\u0232\u0234\3\2\2\2\u0233\u021d\3\2\2\2\u0233\u0234\3\2"+
		"\2\2\u0234\u0235\3\2\2\2\u0235\u0236\7\n\2\2\u0236\61\3\2\2\2\u0237\u023a"+
		"\7c\2\2\u0238\u023a\5\u00c2b\2\u0239\u0237\3\2\2\2\u0239\u0238\3\2\2\2"+
		"\u023a\u023b\3\2\2\2\u023b\u0244\7\7\2\2\u023c\u0241\5\u00c2b\2\u023d"+
		"\u023e\7\f\2\2\u023e\u0240\5\u00c2b\2\u023f\u023d\3\2\2\2\u0240\u0243"+
		"\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0245\3\2\2\2\u0243"+
		"\u0241\3\2\2\2\u0244\u023c\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\3\2"+
		"\2\2\u0246\u0247\7\b\2\2\u0247\u0248\7\5\2\2\u0248\63\3\2\2\2\u0249\u024a"+
		"\7F\2\2\u024a\u024e\7\u009e\2\2\u024b\u024c\7g\2\2\u024c\u024d\7~\2\2"+
		"\u024d\u024f\7\\\2\2\u024e\u024b\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0253"+
		"\3\2\2\2\u0250\u0251\5\u00a2R\2\u0251\u0252\7\6\2\2\u0252\u0254\3\2\2"+
		"\2\u0253\u0250\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0256"+
		"\5\u00a6T\2\u0256\u0257\7\7\2\2\u0257\u025e\5J&\2\u0258\u0259\7\f\2\2"+
		"\u0259\u025d\5l\67\2\u025a\u025b\7\f\2\2\u025b\u025d\5J&\2\u025c\u0258"+
		"\3\2\2\2\u025c\u025a\3\2\2\2\u025d\u0260\3\2\2\2\u025e\u025c\3\2\2\2\u025e"+
		"\u025f\3\2\2\2\u025f\u0261\3\2\2\2\u0260\u025e\3\2\2\2\u0261\u0269\7\b"+
		"\2\2\u0262\u0263\7\u00b3\2\2\u0263\u0264\7\r\2\2\u0264\u0265\t\2\2\2\u0265"+
		"\u0266\7\f\2\2\u0266\u0267\7\3\2\2\u0267\u0268\7\r\2\2\u0268\u026a\5\u00c2"+
		"b\2\u0269\u0262\3\2\2\2\u0269\u026a\3\2\2\2\u026a\65\3\2\2\2\u026b\u026c"+
		"\7F\2\2\u026c\u0270\7\u00b3\2\2\u026d\u026e\7g\2\2\u026e\u026f\7~\2\2"+
		"\u026f\u0271\7\\\2\2\u0270\u026d\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0272"+
		"\3\2\2\2\u0272\u0273\5\u00c2b\2\u0273\u0274\7\7\2\2\u0274\u0279\5J&\2"+
		"\u0275\u0276\7\f\2\2\u0276\u0278\5J&\2\u0277\u0275\3\2\2\2\u0278\u027b"+
		"\3\2\2\2\u0279\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027c\3\2\2\2\u027b"+
		"\u0279\3\2\2\2\u027c\u027d\7\b\2\2\u027d\67\3\2\2\2\u027e\u027f\7F\2\2"+
		"\u027f\u0280\7\u00b6\2\2\u0280\u0281\5\u00c2b\2\u0281\u0282\7\7\2\2\u0282"+
		"\u0283\5:\36\2\u0283\u0284\7\f\2\2\u0284\u0285\5<\37\2\u0285\u0286\7\f"+
		"\2\2\u0286\u0287\5> \2\u0287\u0288\7\f\2\2\u0288\u0289\5@!\2\u0289\u028a"+
		"\7\f\2\2\u028a\u028b\5B\"\2\u028b\u028c\7\b\2\2\u028c9\3\2\2\2\u028d\u028e"+
		"\5\u00c2b\2\u028e;\3\2\2\2\u028f\u0290\5\u00c2b\2\u0290=\3\2\2\2\u0291"+
		"\u0292\5\u00c2b\2\u0292?\3\2\2\2\u0293\u0294\5\u00c2b\2\u0294A\3\2\2\2"+
		"\u0295\u0296\7(\2\2\u0296\u029b\5\u00c2b\2\u0297\u0298\7\f\2\2\u0298\u029a"+
		"\5\u00c2b\2\u0299\u0297\3\2\2\2\u029a\u029d\3\2\2\2\u029b\u0299\3\2\2"+
		"\2\u029b\u029c\3\2\2\2\u029c\u029e\3\2\2\2\u029d\u029b\3\2\2\2\u029e\u029f"+
		"\7)\2\2\u029fC\3\2\2\2\u02a0\u02ab\5\u008aF\2\u02a1\u02a2\7\u0086\2\2"+
		"\u02a2\u02a3\7<\2\2\u02a3\u02a8\5z>\2\u02a4\u02a5\7\f\2\2\u02a5\u02a7"+
		"\5z>\2\u02a6\u02a4\3\2\2\2\u02a7\u02aa\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a8"+
		"\u02a9\3\2\2\2\u02a9\u02ac\3\2\2\2\u02aa\u02a8\3\2\2\2\u02ab\u02a1\3\2"+
		"\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02b3\3\2\2\2\u02ad\u02ae\7y\2\2\u02ae"+
		"\u02b1\5\\/\2\u02af\u02b0\t\3\2\2\u02b0\u02b2\5\\/\2\u02b1\u02af\3\2\2"+
		"\2\u02b1\u02b2\3\2\2\2\u02b2\u02b4\3\2\2\2\u02b3\u02ad\3\2\2\2\u02b3\u02b4"+
		"\3\2\2\2\u02b4E\3\2\2\2\u02b5\u02c0\5H%\2\u02b6\u02b7\7\u0086\2\2\u02b7"+
		"\u02b8\7<\2\2\u02b8\u02bd\5z>\2\u02b9\u02ba\7\f\2\2\u02ba\u02bc\5z>\2"+
		"\u02bb\u02b9\3\2\2\2\u02bc\u02bf\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02be"+
		"\3\2\2\2\u02be\u02c1\3\2\2\2\u02bf\u02bd\3\2\2\2\u02c0\u02b6\3\2\2\2\u02c0"+
		"\u02c1\3\2\2\2\u02c1\u02c8\3\2\2\2\u02c2\u02c3\7y\2\2\u02c3\u02c6\5\\"+
		"/\2\u02c4\u02c5\t\3\2\2\u02c5\u02c7\5\\/\2\u02c6\u02c4\3\2\2\2\u02c6\u02c7"+
		"\3\2\2\2\u02c7\u02c9\3\2\2\2\u02c8\u02c2\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9"+
		"G\3\2\2\2\u02ca\u02cc\7\u009b\2\2\u02cb\u02cd\t\4\2\2\u02cc\u02cb\3\2"+
		"\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02d3\5\u0080A\2\u02cf"+
		"\u02d0\7\f\2\2\u02d0\u02d2\5\u0080A\2\u02d1\u02cf\3\2\2\2\u02d2\u02d5"+
		"\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02e2\3\2\2\2\u02d5"+
		"\u02d3\3\2\2\2\u02d6\u02e0\7a\2\2\u02d7\u02dc\5\u0082B\2\u02d8\u02d9\7"+
		"\f\2\2\u02d9\u02db\5\u0082B\2\u02da\u02d8\3\2\2\2\u02db\u02de\3\2\2\2"+
		"\u02dc\u02da\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02e1\3\2\2\2\u02de\u02dc"+
		"\3\2\2\2\u02df\u02e1\5\u0084C\2\u02e0\u02d7\3\2\2\2\u02e0\u02df\3\2\2"+
		"\2\u02e1\u02e3\3\2\2\2\u02e2\u02d6\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e6"+
		"\3\2\2\2\u02e4\u02e5\7\u00ae\2\2\u02e5\u02e7\5\\/\2\u02e6\u02e4\3\2\2"+
		"\2\u02e6\u02e7\3\2\2\2\u02e7\u02f6\3\2\2\2\u02e8\u02e9\7e\2\2\u02e9\u02ea"+
		"\7<\2\2\u02ea\u02ef\5\\/\2\u02eb\u02ec\7\f\2\2\u02ec\u02ee\5\\/\2\u02ed"+
		"\u02eb\3\2\2\2\u02ee\u02f1\3\2\2\2\u02ef\u02ed\3\2\2\2\u02ef\u02f0\3\2"+
		"\2\2\u02f0\u02f4\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f2\u02f3\7f\2\2\u02f3"+
		"\u02f5\5\\/\2\u02f4\u02f2\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f7\3\2"+
		"\2\2\u02f6\u02e8\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u0315\3\2\2\2\u02f8"+
		"\u02f9\7\u00aa\2\2\u02f9\u02fa\7\7\2\2\u02fa\u02ff\5\\/\2\u02fb\u02fc"+
		"\7\f\2\2\u02fc\u02fe\5\\/\2\u02fd\u02fb\3\2\2\2\u02fe\u0301\3\2\2\2\u02ff"+
		"\u02fd\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0302\3\2\2\2\u0301\u02ff\3\2"+
		"\2\2\u0302\u0311\7\b\2\2\u0303\u0304\7\f\2\2\u0304\u0305\7\7\2\2\u0305"+
		"\u030a\5\\/\2\u0306\u0307\7\f\2\2\u0307\u0309\5\\/\2\u0308\u0306\3\2\2"+
		"\2\u0309\u030c\3\2\2\2\u030a\u0308\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030d"+
		"\3\2\2\2\u030c\u030a\3\2\2\2\u030d\u030e\7\b\2\2\u030e\u0310\3\2\2\2\u030f"+
		"\u0303\3\2\2\2\u0310\u0313\3\2\2\2\u0311\u030f\3\2\2\2\u0311\u0312\3\2"+
		"\2\2\u0312\u0315\3\2\2\2\u0313\u0311\3\2\2\2\u0314\u02ca\3\2\2\2\u0314"+
		"\u02f8\3\2\2\2\u0315I\3\2\2\2\u0316\u031b\5\u00acW\2\u0317\u031a\5N(\2"+
		"\u0318\u031a\5L\'\2\u0319\u0317\3\2\2\2\u0319\u0318\3\2\2\2\u031a\u031d"+
		"\3\2\2\2\u031b\u0319\3\2\2\2\u031b\u031c\3\2\2\2\u031cK\3\2\2\2\u031d"+
		"\u031b\3\2\2\2\u031e\u0332\5\u009eP\2\u031f\u0320\7\7\2\2\u0320\u0322"+
		"\5\u008eH\2\u0321\u0323\5\u00c2b\2\u0322\u0321\3\2\2\2\u0322\u0323\3\2"+
		"\2\2\u0323\u0324\3\2\2\2\u0324\u0325\7\b\2\2\u0325\u0333\3\2\2\2\u0326"+
		"\u0327\7\7\2\2\u0327\u0329\5\u008eH\2\u0328\u032a\5\u00c2b\2\u0329\u0328"+
		"\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032c\7\f\2\2\u032c"+
		"\u032e\5\u008eH\2\u032d\u032f\5\u00c2b\2\u032e\u032d\3\2\2\2\u032e\u032f"+
		"\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0331\7\b\2\2\u0331\u0333\3\2\2\2\u0332"+
		"\u031f\3\2\2\2\u0332\u0326\3\2\2\2\u0332\u0333\3\2\2\2\u0333M\3\2\2\2"+
		"\u0334\u0335\7E\2\2\u0335\u0337\5\u009eP\2\u0336\u0334\3\2\2\2\u0336\u0337"+
		"\3\2\2\2\u0337\u0345\3\2\2\2\u0338\u0346\5P)\2\u0339\u0346\5R*\2\u033a"+
		"\u0346\5T+\2\u033b\u0346\5V,\2\u033c\u0346\7\u00a6\2\2\u033d\u033e\7@"+
		"\2\2\u033e\u033f\7\7\2\2\u033f\u0340\5\\/\2\u0340\u0341\7\b\2\2\u0341"+
		"\u0346\3\2\2\2\u0342\u0346\5X-\2\u0343\u0344\7A\2\2\u0344\u0346\5\u00ae"+
		"X\2\u0345\u0338\3\2\2\2\u0345\u0339\3\2\2\2\u0345\u033a\3\2\2\2\u0345"+
		"\u033b\3\2\2\2\u0345\u033c\3\2\2\2\u0345\u033d\3\2\2\2\u0345\u0342\3\2"+
		"\2\2\u0345\u0343\3\2\2\2\u0346O\3\2\2\2\u0347\u0348\7\u008a\2\2\u0348"+
		"\u034a\7v\2\2\u0349\u034b\t\5\2\2\u034a\u0349\3\2\2\2\u034a\u034b\3\2"+
		"\2\2\u034b\u034d\3\2\2\2\u034c\u034e\7\67\2\2\u034d\u034c\3\2\2\2\u034d"+
		"\u034e\3\2\2\2\u034eQ\3\2\2\2\u034f\u0350\5f\64\2\u0350S\3\2\2\2\u0351"+
		"\u0352\7~\2\2\u0352\u0353\7\u0080\2\2\u0353U\3\2\2\2\u0354\u0355\7\u0080"+
		"\2\2\u0355W\3\2\2\2\u0356\u0362\7L\2\2\u0357\u0363\5Z.\2\u0358\u0359\7"+
		"\7\2\2\u0359\u035a\5\\/\2\u035a\u035b\7\b\2\2\u035b\u0363\3\2\2\2\u035c"+
		"\u035d\7|\2\2\u035d\u035e\7\7\2\2\u035e\u035f\5\\/\2\u035f\u0360\7\b\2"+
		"\2\u0360\u0363\3\2\2\2\u0361\u0363\5\u00c2b\2\u0362\u0357\3\2\2\2\u0362"+
		"\u0358\3\2\2\2\u0362\u035c\3\2\2\2\u0362\u0361\3\2\2\2\u0363\u036a\3\2"+
		"\2\2\u0364\u0366\7\4\2\2\u0365\u0367\5\u00c2b\2\u0366\u0365\3\2\2\2\u0367"+
		"\u0368\3\2\2\2\u0368\u0366\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u036b\3\2"+
		"\2\2\u036a\u0364\3\2\2\2\u036a\u036b\3\2\2\2\u036bY\3\2\2\2\u036c\u036f"+
		"\5\u008eH\2\u036d\u036f\5\u0090I\2\u036e\u036c\3\2\2\2\u036e\u036d\3\2"+
		"\2\2\u036f[\3\2\2\2\u0370\u0371\b/\1\2\u0371\u03a3\5\u0090I\2\u0372\u0373"+
		"\5\u00a2R\2\u0373\u0374\7\6\2\2\u0374\u0376\3\2\2\2\u0375\u0372\3\2\2"+
		"\2\u0375\u0376\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0378\5\u00a6T\2\u0378"+
		"\u0379\7\6\2\2\u0379\u037b\3\2\2\2\u037a\u0375\3\2\2\2\u037a\u037b\3\2"+
		"\2\2\u037b\u037c\3\2\2\2\u037c\u03a3\5\u00acW\2\u037d\u037e\5\u0092J\2"+
		"\u037e\u037f\5\\/\21\u037f\u03a3\3\2\2\2\u0380\u0381\5\u00a0Q\2\u0381"+
		"\u038e\7\7\2\2\u0382\u0384\7R\2\2\u0383\u0382\3\2\2\2\u0383\u0384\3\2"+
		"\2\2\u0384\u0385\3\2\2\2\u0385\u038a\5\\/\2\u0386\u0387\7\f\2\2\u0387"+
		"\u0389\5\\/\2\u0388\u0386\3\2\2\2\u0389\u038c\3\2\2\2\u038a\u0388\3\2"+
		"\2\2\u038a\u038b\3\2\2\2\u038b\u038f\3\2\2\2\u038c\u038a\3\2\2\2\u038d"+
		"\u038f\7\16\2\2\u038e\u0383\3\2\2\2\u038e\u038d\3\2\2\2\u038e\u038f\3"+
		"\2\2\2\u038f\u0390\3\2\2\2\u0390\u0391\7\b\2\2\u0391\u03a3\3\2\2\2\u0392"+
		"\u0393\7\7\2\2\u0393\u0394\5\\/\2\u0394\u0395\7\b\2\2\u0395\u03a3\3\2"+
		"\2\2\u0396\u0398\7~\2\2\u0397\u0396\3\2\2\2\u0397\u0398\3\2\2\2\u0398"+
		"\u0399\3\2\2\2\u0399\u039b\7\\\2\2\u039a\u0397\3\2\2\2\u039a\u039b\3\2"+
		"\2\2\u039b\u039c\3\2\2\2\u039c\u039d\7\7\2\2\u039d\u039e\5F$\2\u039e\u039f"+
		"\7\b\2\2\u039f\u03a3\3\2\2\2\u03a0\u03a3\5 \21\2\u03a1\u03a3\5\6\4\2\u03a2"+
		"\u0370\3\2\2\2\u03a2\u037a\3\2\2\2\u03a2\u037d\3\2\2\2\u03a2\u0380\3\2"+
		"\2\2\u03a2\u0392\3\2\2\2\u03a2\u039a\3\2\2\2\u03a2\u03a0\3\2\2\2\u03a2"+
		"\u03a1\3\2\2\2\u03a3\u03e5\3\2\2\2\u03a4\u03a5\f\20\2\2\u03a5\u03a6\7"+
		"\24\2\2\u03a6\u03e4\5\\/\21\u03a7\u03a8\f\17\2\2\u03a8\u03a9\t\6\2\2\u03a9"+
		"\u03e4\5\\/\20\u03aa\u03ab\f\16\2\2\u03ab\u03ac\t\7\2\2\u03ac\u03e4\5"+
		"\\/\17\u03ad\u03ae\f\r\2\2\u03ae\u03af\t\b\2\2\u03af\u03e4\5\\/\16\u03b0"+
		"\u03b1\f\f\2\2\u03b1\u03b2\t\t\2\2\u03b2\u03e4\5\\/\r\u03b3\u03c0\f\13"+
		"\2\2\u03b4\u03c1\7\r\2\2\u03b5\u03c1\7\37\2\2\u03b6\u03c1\7&\2\2\u03b7"+
		"\u03c1\7\'\2\2\u03b8\u03c1\7s\2\2\u03b9\u03ba\7s\2\2\u03ba\u03c1\7~\2"+
		"\2\u03bb\u03c1\7j\2\2\u03bc\u03c1\7x\2\2\u03bd\u03c1\7d\2\2\u03be\u03c1"+
		"\7z\2\2\u03bf\u03c1\7\u0090\2\2\u03c0\u03b4\3\2\2\2\u03c0\u03b5\3\2\2"+
		"\2\u03c0\u03b6\3\2\2\2\u03c0\u03b7\3\2\2\2\u03c0\u03b8\3\2\2\2\u03c0\u03b9"+
		"\3\2\2\2\u03c0\u03bb\3\2\2\2\u03c0\u03bc\3\2\2\2\u03c0\u03bd\3\2\2\2\u03c0"+
		"\u03be\3\2\2\2\u03c0\u03bf\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03e4\5\\"+
		"/\f\u03c3\u03c4\f\n\2\2\u03c4\u03c5\7\63\2\2\u03c5\u03e4\5\\/\13\u03c6"+
		"\u03c7\f\t\2\2\u03c7\u03c8\7\u0085\2\2\u03c8\u03e4\5\\/\n\u03c9\u03cb"+
		"\f\6\2\2\u03ca\u03cc\7~\2\2\u03cb\u03ca\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc"+
		"\u03cd\3\2\2\2\u03cd\u03e1\7j\2\2\u03ce\u03d8\7\7\2\2\u03cf\u03d9\5F$"+
		"\2\u03d0\u03d5\5\\/\2\u03d1\u03d2\7\f\2\2\u03d2\u03d4\5\\/\2\u03d3\u03d1"+
		"\3\2\2\2\u03d4\u03d7\3\2\2\2\u03d5\u03d3\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6"+
		"\u03d9\3\2\2\2\u03d7\u03d5\3\2\2\2\u03d8\u03cf\3\2\2\2\u03d8\u03d0\3\2"+
		"\2\2\u03d8\u03d9\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03e2\7\b\2\2\u03db"+
		"\u03dc\5\u00a2R\2\u03dc\u03dd\7\6\2\2\u03dd\u03df\3\2\2\2\u03de\u03db"+
		"\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e2\5\u00a6T"+
		"\2\u03e1\u03ce\3\2\2\2\u03e1\u03de\3\2\2\2\u03e2\u03e4\3\2\2\2\u03e3\u03a4"+
		"\3\2\2\2\u03e3\u03a7\3\2\2\2\u03e3\u03aa\3\2\2\2\u03e3\u03ad\3\2\2\2\u03e3"+
		"\u03b0\3\2\2\2\u03e3\u03b3\3\2\2\2\u03e3\u03c3\3\2\2\2\u03e3\u03c6\3\2"+
		"\2\2\u03e3\u03c9\3\2\2\2\u03e4\u03e7\3\2\2\2\u03e5\u03e3\3\2\2\2\u03e5"+
		"\u03e6\3\2\2\2\u03e6]\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e8\u03e9\b\60\1\2"+
		"\u03e9\u040a\5\u0090I\2\u03ea\u040a\5\u00c2b\2\u03eb\u03ec\5\u00c2b\2"+
		"\u03ec\u03ed\7(\2\2\u03ed\u03ee\5\\/\2\u03ee\u03ef\7)\2\2\u03ef\u03f0"+
		"\5^\60\2\u03f0\u03f1\5\u00c2b\2\u03f1\u03f2\7(\2\2\u03f2\u03f3\5\\/\2"+
		"\u03f3\u03f4\7)\2\2\u03f4\u040a\3\2\2\2\u03f5\u03f6\5\u00c2b\2\u03f6\u03f7"+
		"\7(\2\2\u03f7\u03f8\5\\/\2\u03f8\u03f9\7)\2\2\u03f9\u03fc\5^\60\2\u03fa"+
		"\u03fd\5\u00c2b\2\u03fb\u03fd\5\u008eH\2\u03fc\u03fa\3\2\2\2\u03fc\u03fb"+
		"\3\2\2\2\u03fd\u040a\3\2\2\2\u03fe\u03ff\7\7\2\2\u03ff\u0400\5^\60\2\u0400"+
		"\u0401\7\b\2\2\u0401\u040a\3\2\2\2\u0402\u0403\7?\2\2\u0403\u0404\7\7"+
		"\2\2\u0404\u0405\5^\60\2\u0405\u0406\7\64\2\2\u0406\u0407\5L\'\2\u0407"+
		"\u0408\7\b\2\2\u0408\u040a\3\2\2\2\u0409\u03e8\3\2\2\2\u0409\u03ea\3\2"+
		"\2\2\u0409\u03eb\3\2\2\2\u0409\u03f5\3\2\2\2\u0409\u03fe\3\2\2\2\u0409"+
		"\u0402\3\2\2\2\u040a\u0425\3\2\2\2\u040b\u040c\f\16\2\2\u040c\u040d\t"+
		"\6\2\2\u040d\u0424\5^\60\17\u040e\u040f\f\r\2\2\u040f\u0410\t\7\2\2\u0410"+
		"\u0424\5^\60\16\u0411\u0412\f\f\2\2\u0412\u0413\t\t\2\2\u0413\u0424\5"+
		"^\60\r\u0414\u0415\f\13\2\2\u0415\u0416\t\n\2\2\u0416\u0424\5^\60\f\u0417"+
		"\u0418\f\n\2\2\u0418\u0419\7\63\2\2\u0419\u0424\5^\60\13\u041a\u041b\f"+
		"\t\2\2\u041b\u041c\7\u0085\2\2\u041c\u0424\5^\60\n\u041d\u041e\f\b\2\2"+
		"\u041e\u041f\7\24\2\2\u041f\u0424\5^\60\t\u0420\u0421\f\7\2\2\u0421\u0422"+
		"\7\13\2\2\u0422\u0424\5^\60\b\u0423\u040b\3\2\2\2\u0423\u040e\3\2\2\2"+
		"\u0423\u0411\3\2\2\2\u0423\u0414\3\2\2\2\u0423\u0417\3\2\2\2\u0423\u041a"+
		"\3\2\2\2\u0423\u041d\3\2\2\2\u0423\u0420\3\2\2\2\u0424\u0427\3\2\2\2\u0425"+
		"\u0423\3\2\2\2\u0425\u0426\3\2\2\2\u0426_\3\2\2\2\u0427\u0425\3\2\2\2"+
		"\u0428\u0429\b\61\1\2\u0429\u044e\5\u0090I\2\u042a\u044e\5\u00c2b\2\u042b"+
		"\u042c\5\u00c2b\2\u042c\u042d\7(\2\2\u042d\u042e\5\\/\2\u042e\u042f\7"+
		")\2\2\u042f\u0430\5`\61\2\u0430\u0431\5\u00c2b\2\u0431\u0432\7(\2\2\u0432"+
		"\u0433\5\\/\2\u0433\u0434\7)\2\2\u0434\u044e\3\2\2\2\u0435\u0436\5\u00c2"+
		"b\2\u0436\u0437\7(\2\2\u0437\u0438\5\\/\2\u0438\u0439\7)\2\2\u0439\u043c"+
		"\5`\61\2\u043a\u043d\5\u00c2b\2\u043b\u043d\5\u008eH\2\u043c\u043a\3\2"+
		"\2\2\u043c\u043b\3\2\2\2\u043d\u044e\3\2\2\2\u043e\u043f\7(\2\2\u043f"+
		"\u0440\5\u00c2b\2\u0440\u0441\7)\2\2\u0441\u044e\3\2\2\2\u0442\u0443\7"+
		"\7\2\2\u0443\u0444\5`\61\2\u0444\u0445\7\b\2\2\u0445\u044e\3\2\2\2\u0446"+
		"\u0447\7?\2\2\u0447\u0448\7\7\2\2\u0448\u0449\5`\61\2\u0449\u044a\7\64"+
		"\2\2\u044a\u044b\5L\'\2\u044b\u044c\7\b\2\2\u044c\u044e\3\2\2\2\u044d"+
		"\u0428\3\2\2\2\u044d\u042a\3\2\2\2\u044d\u042b\3\2\2\2\u044d\u0435\3\2"+
		"\2\2\u044d\u043e\3\2\2\2\u044d\u0442\3\2\2\2\u044d\u0446\3\2\2\2\u044e"+
		"\u0469\3\2\2\2\u044f\u0450\f\17\2\2\u0450\u0451\t\6\2\2\u0451\u0468\5"+
		"`\61\20\u0452\u0453\f\16\2\2\u0453\u0454\t\7\2\2\u0454\u0468\5`\61\17"+
		"\u0455\u0456\f\r\2\2\u0456\u0457\t\t\2\2\u0457\u0468\5`\61\16\u0458\u0459"+
		"\f\f\2\2\u0459\u045a\t\n\2\2\u045a\u0468\5`\61\r\u045b\u045c\f\13\2\2"+
		"\u045c\u045d\7\63\2\2\u045d\u0468\5`\61\f\u045e\u045f\f\n\2\2\u045f\u0460"+
		"\7\u0085\2\2\u0460\u0468\5`\61\13\u0461\u0462\f\t\2\2\u0462\u0463\7\24"+
		"\2\2\u0463\u0468\5`\61\n\u0464\u0465\f\b\2\2\u0465\u0466\7\13\2\2\u0466"+
		"\u0468\5`\61\t\u0467\u044f\3\2\2\2\u0467\u0452\3\2\2\2\u0467\u0455\3\2"+
		"\2\2\u0467\u0458\3\2\2\2\u0467\u045b\3\2\2\2\u0467\u045e\3\2\2\2\u0467"+
		"\u0461\3\2\2\2\u0467\u0464\3\2\2\2\u0468\u046b\3\2\2\2\u0469\u0467\3\2"+
		"\2\2\u0469\u046a\3\2\2\2\u046aa\3\2\2\2\u046b\u0469\3\2\2\2\u046c\u046d"+
		"\b\62\1\2\u046d\u0479\5\u0090I\2\u046e\u0479\5\u00c2b\2\u046f\u0470\5"+
		"\u00c2b\2\u0470\u0471\t\13\2\2\u0471\u0479\3\2\2\2\u0472\u0473\t\13\2"+
		"\2\u0473\u0479\5\u00c2b\2\u0474\u0475\7\7\2\2\u0475\u0476\5b\62\2\u0476"+
		"\u0477\7\b\2\2\u0477\u0479\3\2\2\2\u0478\u046c\3\2\2\2\u0478\u046e\3\2"+
		"\2\2\u0478\u046f\3\2\2\2\u0478\u0472\3\2\2\2\u0478\u0474\3\2\2\2\u0479"+
		"\u047f\3\2\2\2\u047a\u047b\f\4\2\2\u047b\u047c\t\f\2\2\u047c\u047e\5b"+
		"\62\5\u047d\u047a\3\2\2\2\u047e\u0481\3\2\2\2\u047f\u047d\3\2\2\2\u047f"+
		"\u0480\3\2\2\2\u0480c\3\2\2\2\u0481\u047f\3\2\2\2\u0482\u0483\b\63\1\2"+
		"\u0483\u04bc\5\u0090I\2\u0484\u04bc\5\u00c2b\2\u0485\u0486\5\u00a2R\2"+
		"\u0486\u0487\7\6\2\2\u0487\u0489\3\2\2\2\u0488\u0485\3\2\2\2\u0488\u0489"+
		"\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u048b\5\u00a6T\2\u048b\u048c\7\6\2"+
		"\2\u048c\u048e\3\2\2\2\u048d\u0488\3\2\2\2\u048d\u048e\3\2\2\2\u048e\u048f"+
		"\3\2\2\2\u048f\u04bc\5\u00acW\2\u0490\u0491\5\u0092J\2\u0491\u0492\5d"+
		"\63\21\u0492\u04bc\3\2\2\2\u0493\u0494\5\u00a0Q\2\u0494\u04a1\7\7\2\2"+
		"\u0495\u0497\7R\2\2\u0496\u0495\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u0498"+
		"\3\2\2\2\u0498\u049d\5d\63\2\u0499\u049a\7\f\2\2\u049a\u049c\5d\63\2\u049b"+
		"\u0499\3\2\2\2\u049c\u049f\3\2\2\2\u049d\u049b\3\2\2\2\u049d\u049e\3\2"+
		"\2\2\u049e\u04a2\3\2\2\2\u049f\u049d\3\2\2\2\u04a0\u04a2\7\16\2\2\u04a1"+
		"\u0496\3\2\2\2\u04a1\u04a0\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04a3\3\2"+
		"\2\2\u04a3\u04a4\7\b\2\2\u04a4\u04bc\3\2\2\2\u04a5\u04a6\7\7\2\2\u04a6"+
		"\u04a7\5d\63\2\u04a7\u04a8\7\b\2\2\u04a8\u04bc\3\2\2\2\u04a9\u04aa\7("+
		"\2\2\u04aa\u04ab\5d\63\2\u04ab\u04ac\7)\2\2\u04ac\u04bc\3\2\2\2\u04ad"+
		"\u04ae\7(\2\2\u04ae\u04af\5\24\13\2\u04af\u04b0\7)\2\2\u04b0\u04bc\3\2"+
		"\2\2\u04b1\u04b3\7~\2\2\u04b2\u04b1\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3"+
		"\u04b4\3\2\2\2\u04b4\u04b6\7\\\2\2\u04b5\u04b2\3\2\2\2\u04b5\u04b6\3\2"+
		"\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b8\7\7\2\2\u04b8\u04b9\5F$\2\u04b9\u04ba"+
		"\7\b\2\2\u04ba\u04bc\3\2\2\2\u04bb\u0482\3\2\2\2\u04bb\u0484\3\2\2\2\u04bb"+
		"\u048d\3\2\2\2\u04bb\u0490\3\2\2\2\u04bb\u0493\3\2\2\2\u04bb\u04a5\3\2"+
		"\2\2\u04bb\u04a9\3\2\2\2\u04bb\u04ad\3\2\2\2\u04bb\u04b5\3\2\2\2\u04bc"+
		"\u04fe\3\2\2\2\u04bd\u04be\f\20\2\2\u04be\u04bf\7\24\2\2\u04bf\u04fd\5"+
		"d\63\21\u04c0\u04c1\f\17\2\2\u04c1\u04c2\t\6\2\2\u04c2\u04fd\5d\63\20"+
		"\u04c3\u04c4\f\16\2\2\u04c4\u04c5\t\7\2\2\u04c5\u04fd\5d\63\17\u04c6\u04c7"+
		"\f\r\2\2\u04c7\u04c8\t\b\2\2\u04c8\u04fd\5d\63\16\u04c9\u04ca\f\f\2\2"+
		"\u04ca\u04cb\t\t\2\2\u04cb\u04fd\5d\63\r\u04cc\u04d9\f\13\2\2\u04cd\u04da"+
		"\7\r\2\2\u04ce\u04da\7\37\2\2\u04cf\u04da\7&\2\2\u04d0\u04da\7\'\2\2\u04d1"+
		"\u04da\7s\2\2\u04d2\u04d3\7s\2\2\u04d3\u04da\7~\2\2\u04d4\u04da\7j\2\2"+
		"\u04d5\u04da\7x\2\2\u04d6\u04da\7d\2\2\u04d7\u04da\7z\2\2\u04d8\u04da"+
		"\7\u0090\2\2\u04d9\u04cd\3\2\2\2\u04d9\u04ce\3\2\2\2\u04d9\u04cf\3\2\2"+
		"\2\u04d9\u04d0\3\2\2\2\u04d9\u04d1\3\2\2\2\u04d9\u04d2\3\2\2\2\u04d9\u04d4"+
		"\3\2\2\2\u04d9\u04d5\3\2\2\2\u04d9\u04d6\3\2\2\2\u04d9\u04d7\3\2\2\2\u04d9"+
		"\u04d8\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04fd\5d\63\f\u04dc\u04dd\f\n"+
		"\2\2\u04dd\u04de\7\63\2\2\u04de\u04fd\5d\63\13\u04df\u04e0\f\t\2\2\u04e0"+
		"\u04e1\7\u0085\2\2\u04e1\u04fd\5d\63\n\u04e2\u04e4\f\4\2\2\u04e3\u04e5"+
		"\7~\2\2\u04e4\u04e3\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6"+
		"\u04fa\7j\2\2\u04e7\u04f1\7\7\2\2\u04e8\u04f2\5F$\2\u04e9\u04ee\5d\63"+
		"\2\u04ea\u04eb\7\f\2\2\u04eb\u04ed\5d\63\2\u04ec\u04ea\3\2\2\2\u04ed\u04f0"+
		"\3\2\2\2\u04ee\u04ec\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef\u04f2\3\2\2\2\u04f0"+
		"\u04ee\3\2\2\2\u04f1\u04e8\3\2\2\2\u04f1\u04e9\3\2\2\2\u04f1\u04f2\3\2"+
		"\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04fb\7\b\2\2\u04f4\u04f5\5\u00a2R\2\u04f5"+
		"\u04f6\7\6\2\2\u04f6\u04f8\3\2\2\2\u04f7\u04f4\3\2\2\2\u04f7\u04f8\3\2"+
		"\2\2\u04f8\u04f9\3\2\2\2\u04f9\u04fb\5\u00a6T\2\u04fa\u04e7\3\2\2\2\u04fa"+
		"\u04f7\3\2\2\2\u04fb\u04fd\3\2\2\2\u04fc\u04bd\3\2\2\2\u04fc\u04c0\3\2"+
		"\2\2\u04fc\u04c3\3\2\2\2\u04fc\u04c6\3\2\2\2\u04fc\u04c9\3\2\2\2\u04fc"+
		"\u04cc\3\2\2\2\u04fc\u04dc\3\2\2\2\u04fc\u04df\3\2\2\2\u04fc\u04e2\3\2"+
		"\2\2\u04fd\u0500\3\2\2\2\u04fe\u04fc\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff"+
		"e\3\2\2\2\u0500\u04fe\3\2\2\2\u0501\u0505\7\u008f\2\2\u0502\u0503\5\u00a2"+
		"R\2\u0503\u0504\7\6\2\2\u0504\u0506\3\2\2\2\u0505\u0502\3\2\2\2\u0505"+
		"\u0506\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u0513\5\u00b0Y\2\u0508\u0509"+
		"\7\7\2\2\u0509\u050e\5h\65\2\u050a\u050b\7\f\2\2\u050b\u050d\5h\65\2\u050c"+
		"\u050a\3\2\2\2\u050d\u0510\3\2\2\2\u050e\u050c\3\2\2\2\u050e\u050f\3\2"+
		"\2\2\u050f\u0511\3\2\2\2\u0510\u050e\3\2\2\2\u0511\u0512\7\b\2\2\u0512"+
		"\u0514\3\2\2\2\u0513\u0508\3\2\2\2\u0513\u0514\3\2\2\2\u0514\u0527\3\2"+
		"\2\2\u0515\u0516\7\u0083\2\2\u0516\u051f\t\r\2\2\u0517\u0518\7\u009c\2"+
		"\2\u0518\u0520\7\u0080\2\2\u0519\u051a\7\u009c\2\2\u051a\u0520\7L\2\2"+
		"\u051b\u0520\7=\2\2\u051c\u0520\7\u0095\2\2\u051d\u051e\7}\2\2\u051e\u0520"+
		"\7-\2\2\u051f\u0517\3\2\2\2\u051f\u0519\3\2\2\2\u051f\u051b\3\2\2\2\u051f"+
		"\u051c\3\2\2\2\u051f\u051d\3\2\2\2\u0520\u0524\3\2\2\2\u0521\u0522\7z"+
		"\2\2\u0522\u0524\5\u009eP\2\u0523\u0515\3\2\2\2\u0523\u0521\3\2\2\2\u0524"+
		"\u0526\3\2\2\2\u0525\u0523\3\2\2\2\u0526\u0529\3\2\2\2\u0527\u0525\3\2"+
		"\2\2\u0527\u0528\3\2\2\2\u0528\u0537\3\2\2\2\u0529\u0527\3\2\2\2\u052a"+
		"\u052c\7~\2\2\u052b\u052a\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u052d\3\2"+
		"\2\2\u052d\u0532\7M\2\2\u052e\u052f\7m\2\2\u052f\u0533\7N\2\2\u0530\u0531"+
		"\7m\2\2\u0531\u0533\7i\2\2\u0532\u052e\3\2\2\2\u0532\u0530\3\2\2\2\u0532"+
		"\u0533\3\2\2\2\u0533\u0535\3\2\2\2\u0534\u0536\7X\2\2\u0535\u0534\3\2"+
		"\2\2\u0535\u0536\3\2\2\2\u0536\u0538\3\2\2\2\u0537\u052b\3\2\2\2\u0537"+
		"\u0538\3\2\2\2\u0538g\3\2\2\2\u0539\u053a\5\u009eP\2\u053ai\3\2\2\2\u053b"+
		"\u053e\5\u00acW\2\u053c\u053d\7A\2\2\u053d\u053f\5\u00aeX\2\u053e\u053c"+
		"\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0541\3\2\2\2\u0540\u0542\t\5\2\2\u0541"+
		"\u0540\3\2\2\2\u0541\u0542\3\2\2\2\u0542k\3\2\2\2\u0543\u0544\7E\2\2\u0544"+
		"\u0546\5\u009eP\2\u0545\u0543\3\2\2\2\u0545\u0546\3\2\2\2\u0546\u0550"+
		"\3\2\2\2\u0547\u0551\5n8\2\u0548\u0551\5t;\2\u0549\u0551\5r:\2\u054a\u054b"+
		"\7@\2\2\u054b\u054c\7\7\2\2\u054c\u054d\5\\/\2\u054d\u054e\7\b\2\2\u054e"+
		"\u0551\3\2\2\2\u054f\u0551\5p9\2\u0550\u0547\3\2\2\2\u0550\u0548\3\2\2"+
		"\2\u0550\u0549\3\2\2\2\u0550\u054a\3\2\2\2\u0550\u054f\3\2\2\2\u0551m"+
		"\3\2\2\2\u0552\u0553\7\u008a\2\2\u0553\u0554\7v\2\2\u0554\u0555\7\7\2"+
		"\2\u0555\u055a\5j\66\2\u0556\u0557\7\f\2\2\u0557\u0559\5j\66\2\u0558\u0556"+
		"\3\2\2\2\u0559\u055c\3\2\2\2\u055a\u0558\3\2\2\2\u055a\u055b\3\2\2\2\u055b"+
		"\u055d\3\2\2\2\u055c\u055a\3\2\2\2\u055d\u055e\7\b\2\2\u055eo\3\2\2\2"+
		"\u055f\u0560\7`\2\2\u0560\u0561\7v\2\2\u0561\u0562\7\7\2\2\u0562\u0567"+
		"\5v<\2\u0563\u0564\7\f\2\2\u0564\u0566\5v<\2\u0565\u0563\3\2\2\2\u0566"+
		"\u0569\3\2\2\2\u0567\u0565\3\2\2\2\u0567\u0568\3\2\2\2\u0568\u056a\3\2"+
		"\2\2\u0569\u0567\3\2\2\2\u056a\u056b\7\b\2\2\u056b\u056c\5f\64\2\u056c"+
		"q\3\2\2\2\u056d\u056f\7\u00a6\2\2\u056e\u0570\7v\2\2\u056f\u056e\3\2\2"+
		"\2\u056f\u0570\3\2\2\2\u0570\u0572\3\2\2\2\u0571\u0573\5\u009eP\2\u0572"+
		"\u0571\3\2\2\2\u0572\u0573\3\2\2\2\u0573\u0574\3\2\2\2\u0574\u0575\7\7"+
		"\2\2\u0575\u057a\5j\66\2\u0576\u0577\7\f\2\2\u0577\u0579\5j\66\2\u0578"+
		"\u0576\3\2\2\2\u0579\u057c\3\2\2\2\u057a\u0578\3\2\2\2\u057a\u057b\3\2"+
		"\2\2\u057b\u057d\3\2\2\2\u057c\u057a\3\2\2\2\u057d\u057e\7\b\2\2\u057e"+
		"s\3\2\2\2\u057f\u0581\7v\2\2\u0580\u0582\5\u009eP\2\u0581\u0580\3\2\2"+
		"\2\u0581\u0582\3\2\2\2\u0582\u0583\3\2\2\2\u0583\u0584\7\7\2\2\u0584\u0589"+
		"\5j\66\2\u0585\u0586\7\f\2\2\u0586\u0588\5j\66\2\u0587\u0585\3\2\2\2\u0588"+
		"\u058b\3\2\2\2\u0589\u0587\3\2\2\2\u0589\u058a\3\2\2\2\u058a\u058c\3\2"+
		"\2\2\u058b\u0589\3\2\2\2\u058c\u058d\7\b\2\2\u058du\3\2\2\2\u058e\u058f"+
		"\5\u00acW\2\u058fw\3\2\2\2\u0590\u0591\5\u00a2R\2\u0591\u0592\7\6\2\2"+
		"\u0592\u0594\3\2\2\2\u0593\u0590\3\2\2\2\u0593\u0594\3\2\2\2\u0594\u0595"+
		"\3\2\2\2\u0595\u059b\5\u00a6T\2\u0596\u0597\7l\2\2\u0597\u0598\7<\2\2"+
		"\u0598\u059c\5\u00b2Z\2\u0599\u059a\7~\2\2\u059a\u059c\7l\2\2\u059b\u0596"+
		"\3\2\2\2\u059b\u0599\3\2\2\2\u059b\u059c\3\2\2\2\u059cy\3\2\2\2\u059d"+
		"\u059f\5\\/\2\u059e\u05a0\t\5\2\2\u059f\u059e\3\2\2\2\u059f\u05a0\3\2"+
		"\2\2\u05a0{\3\2\2\2\u05a1\u05a5\5\u008eH\2\u05a2\u05a5\5\u009eP\2\u05a3"+
		"\u05a5\7\u00bb\2\2\u05a4\u05a1\3\2\2\2\u05a4\u05a2\3\2\2\2\u05a4\u05a3"+
		"\3\2\2\2\u05a5}\3\2\2\2\u05a6\u05b2\5\u00a6T\2\u05a7\u05a8\7\7\2\2\u05a8"+
		"\u05ad\5\u00acW\2\u05a9\u05aa\7\f\2\2\u05aa\u05ac\5\u00acW\2\u05ab\u05a9"+
		"\3\2\2\2\u05ac\u05af\3\2\2\2\u05ad\u05ab\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae"+
		"\u05b0\3\2\2\2\u05af\u05ad\3\2\2\2\u05b0\u05b1\7\b\2\2\u05b1\u05b3\3\2"+
		"\2\2\u05b2\u05a7\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3\u05b4\3\2\2\2\u05b4"+
		"\u05b5\7\64\2\2\u05b5\u05b6\7\7\2\2\u05b6\u05b7\5F$\2\u05b7\u05b8\7\b"+
		"\2\2\u05b8\177\3\2\2\2\u05b9\u05c6\7\16\2\2\u05ba\u05bb\5\u00a6T\2\u05bb"+
		"\u05bc\7\6\2\2\u05bc\u05bd\7\16\2\2\u05bd\u05c6\3\2\2\2\u05be\u05c3\5"+
		"\\/\2\u05bf\u05c1\7\64\2\2\u05c0\u05bf\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1"+
		"\u05c2\3\2\2\2\u05c2\u05c4\5\u0098M\2\u05c3\u05c0\3\2\2\2\u05c3\u05c4"+
		"\3\2\2\2\u05c4\u05c6\3\2\2\2\u05c5\u05b9\3\2\2\2\u05c5\u05ba\3\2\2\2\u05c5"+
		"\u05be\3\2\2\2\u05c6\u0081\3\2\2\2\u05c7\u05c8\5\u00a2R\2\u05c8\u05c9"+
		"\7\6\2\2\u05c9\u05cb\3\2\2\2\u05ca\u05c7\3\2\2\2\u05ca\u05cb\3\2\2\2\u05cb"+
		"\u05cc\3\2\2\2\u05cc\u05d1\5\u00a6T\2\u05cd\u05cf\7\64\2\2\u05ce\u05cd"+
		"\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf\u05d0\3\2\2\2\u05d0\u05d2\5\u00be`"+
		"\2\u05d1\u05ce\3\2\2\2\u05d1\u05d2\3\2\2\2\u05d2\u05d8\3\2\2\2\u05d3\u05d4"+
		"\7l\2\2\u05d4\u05d5\7<\2\2\u05d5\u05d9\5\u00b2Z\2\u05d6\u05d7\7~\2\2\u05d7"+
		"\u05d9\7l\2\2\u05d8\u05d3\3\2\2\2\u05d8\u05d6\3\2\2\2\u05d8\u05d9\3\2"+
		"\2\2\u05d9\u05f7\3\2\2\2\u05da\u05e4\7\7\2\2\u05db\u05e0\5\u0082B\2\u05dc"+
		"\u05dd\7\f\2\2\u05dd\u05df\5\u0082B\2\u05de\u05dc\3\2\2\2\u05df\u05e2"+
		"\3\2\2\2\u05e0\u05de\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1\u05e5\3\2\2\2\u05e2"+
		"\u05e0\3\2\2\2\u05e3\u05e5\5\u0084C\2\u05e4\u05db\3\2\2\2\u05e4\u05e3"+
		"\3\2\2\2\u05e5\u05e6\3\2\2\2\u05e6\u05eb\7\b\2\2\u05e7\u05e9\7\64\2\2"+
		"\u05e8\u05e7\3\2\2\2\u05e8\u05e9\3\2\2\2\u05e9\u05ea\3\2\2\2\u05ea\u05ec"+
		"\5\u00be`\2\u05eb\u05e8\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05f7\3\2\2"+
		"\2\u05ed\u05ee\7\7\2\2\u05ee\u05ef\5F$\2\u05ef\u05f4\7\b\2\2\u05f0\u05f2"+
		"\7\64\2\2\u05f1\u05f0\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2\u05f3\3\2\2\2"+
		"\u05f3\u05f5\5\u00be`\2\u05f4\u05f1\3\2\2\2\u05f4\u05f5\3\2\2\2\u05f5"+
		"\u05f7\3\2\2\2\u05f6\u05ca\3\2\2\2\u05f6\u05da\3\2\2\2\u05f6\u05ed\3\2"+
		"\2\2\u05f7\u0083\3\2\2\2\u05f8\u05ff\5\u0082B\2\u05f9\u05fa\5\u0086D\2"+
		"\u05fa\u05fb\5\u0082B\2\u05fb\u05fc\5\u0088E\2\u05fc\u05fe\3\2\2\2\u05fd"+
		"\u05f9\3\2\2\2\u05fe\u0601\3\2\2\2\u05ff\u05fd\3\2\2\2\u05ff\u0600\3\2"+
		"\2\2\u0600\u0085\3\2\2\2\u0601\u05ff\3\2\2\2\u0602\u060c\7\f\2\2\u0603"+
		"\u0605\7w\2\2\u0604\u0606\7\u0087\2\2\u0605\u0604\3\2\2\2\u0605\u0606"+
		"\3\2\2\2\u0606\u0609\3\2\2\2\u0607\u0609\7n\2\2\u0608\u0603\3\2\2\2\u0608"+
		"\u0607\3\2\2\2\u0608\u0609\3\2\2\2\u0609\u060a\3\2\2\2\u060a\u060c\7u"+
		"\2\2\u060b\u0602\3\2\2\2\u060b\u0608\3\2\2\2\u060c\u0087\3\2\2\2\u060d"+
		"\u060e\7\u0083\2\2\u060e\u0610\5\\/\2\u060f\u060d\3\2\2\2\u060f\u0610"+
		"\3\2\2\2\u0610\u0089\3\2\2\2\u0611\u0613\7\u009b\2\2\u0612\u0614\t\4\2"+
		"\2\u0613\u0612\3\2\2\2\u0613\u0614\3\2\2\2\u0614\u0615\3\2\2\2\u0615\u061a"+
		"\5\u0080A\2\u0616\u0617\7\f\2\2\u0617\u0619\5\u0080A\2\u0618\u0616\3\2"+
		"\2\2\u0619\u061c\3\2\2\2\u061a\u0618\3\2\2\2\u061a\u061b\3\2\2\2\u061b"+
		"\u0629\3\2\2\2\u061c\u061a\3\2\2\2\u061d\u0627\7a\2\2\u061e\u0623\5\u0082"+
		"B\2\u061f\u0620\7\f\2\2\u0620\u0622\5\u0082B\2\u0621\u061f\3\2\2\2\u0622"+
		"\u0625\3\2\2\2\u0623\u0621\3\2\2\2\u0623\u0624\3\2\2\2\u0624\u0628\3\2"+
		"\2\2\u0625\u0623\3\2\2\2\u0626\u0628\5\u0084C\2\u0627\u061e\3\2\2\2\u0627"+
		"\u0626\3\2\2\2\u0628\u062a\3\2\2\2\u0629\u061d\3\2\2\2\u0629\u062a\3\2"+
		"\2\2\u062a\u062d\3\2\2\2\u062b\u062c\7\u00ae\2\2\u062c\u062e\5\\/\2\u062d"+
		"\u062b\3\2\2\2\u062d\u062e\3\2\2\2\u062e\u063d\3\2\2\2\u062f\u0630\7e"+
		"\2\2\u0630\u0631\7<\2\2\u0631\u0636\5\\/\2\u0632\u0633\7\f\2\2\u0633\u0635"+
		"\5\\/\2\u0634\u0632\3\2\2\2\u0635\u0638\3\2\2\2\u0636\u0634\3\2\2\2\u0636"+
		"\u0637\3\2\2\2\u0637\u063b\3\2\2\2\u0638\u0636\3\2\2\2\u0639\u063a\7f"+
		"\2\2\u063a\u063c\5\\/\2\u063b\u0639\3\2\2\2\u063b\u063c\3\2\2\2\u063c"+
		"\u063e\3\2\2\2\u063d\u062f\3\2\2\2\u063d\u063e\3\2\2\2\u063e\u065c\3\2"+
		"\2\2\u063f\u0640\7\u00aa\2\2\u0640\u0641\7\7\2\2\u0641\u0646\5\\/\2\u0642"+
		"\u0643\7\f\2\2\u0643\u0645\5\\/\2\u0644\u0642\3\2\2\2\u0645\u0648\3\2"+
		"\2\2\u0646\u0644\3\2\2\2\u0646\u0647\3\2\2\2\u0647\u0649\3\2\2\2\u0648"+
		"\u0646\3\2\2\2\u0649\u0658\7\b\2\2\u064a\u064b\7\f\2\2\u064b\u064c\7\7"+
		"\2\2\u064c\u0651\5\\/\2\u064d\u064e\7\f\2\2\u064e\u0650\5\\/\2\u064f\u064d"+
		"\3\2\2\2\u0650\u0653\3\2\2\2\u0651\u064f\3\2\2\2\u0651\u0652\3\2\2\2\u0652"+
		"\u0654\3\2\2\2\u0653\u0651\3\2\2\2\u0654\u0655\7\b\2\2\u0655\u0657\3\2"+
		"\2\2\u0656\u064a\3\2\2\2\u0657\u065a\3\2\2\2\u0658\u0656\3\2\2\2\u0658"+
		"\u0659\3\2\2\2\u0659\u065c\3\2\2\2\u065a\u0658\3\2\2\2\u065b\u0611\3\2"+
		"\2\2\u065b\u063f\3\2\2\2\u065c\u008b\3\2\2\2\u065d\u0669\5\u00a6T\2\u065e"+
		"\u065f\7\7\2\2\u065f\u0664\5\u00acW\2\u0660\u0661\7\f\2\2\u0661\u0663"+
		"\5\u00acW\2\u0662\u0660\3\2\2\2\u0663\u0666\3\2\2\2\u0664\u0662\3\2\2"+
		"\2\u0664\u0665\3\2\2\2\u0665\u0667\3\2\2\2\u0666\u0664\3\2\2\2\u0667\u0668"+
		"\7\b\2\2\u0668\u066a\3\2\2\2\u0669\u065e\3\2\2\2\u0669\u066a\3\2\2\2\u066a"+
		"\u008d\3\2\2\2\u066b\u066d\t\7\2\2\u066c\u066b\3\2\2\2\u066c\u066d\3\2"+
		"\2\2\u066d\u066e\3\2\2\2\u066e\u0671\7\u00b9\2\2\u066f\u0671\7\16\2\2"+
		"\u0670\u066c\3\2\2\2\u0670\u066f\3\2\2\2\u0671\u008f\3\2\2\2\u0672\u0673"+
		"\t\16\2\2\u0673\u0091\3\2\2\2\u0674\u0675\t\17\2\2\u0675\u0093\3\2\2\2"+
		"\u0676\u0677\7\u00bb\2\2\u0677\u0095\3\2\2\2\u0678\u067b\5\\/\2\u0679"+
		"\u067b\5J&\2\u067a\u0678\3\2\2\2\u067a\u0679\3\2\2\2\u067b\u0097\3\2\2"+
		"\2\u067c\u067d\t\20\2\2\u067d\u0099\3\2\2\2\u067e\u067f\t\21\2\2\u067f"+
		"\u009b\3\2\2\2\u0680\u0682\13\2\2\2\u0681\u0680\3\2\2\2\u0682\u0683\3"+
		"\2\2\2\u0683\u0681\3\2\2\2\u0683\u0684\3\2\2\2\u0684\u009d\3\2\2\2\u0685"+
		"\u0686\5\u00c2b\2\u0686\u009f\3\2\2\2\u0687\u0688\5\u00c2b\2\u0688\u00a1"+
		"\3\2\2\2\u0689\u068a\5\u00c2b\2\u068a\u00a3\3\2\2\2\u068b\u068c\5\u00c2"+
		"b\2\u068c\u00a5\3\2\2\2\u068d\u068e\5\u00c2b\2\u068e\u00a7\3\2\2\2\u068f"+
		"\u0690\5\u00c2b\2\u0690\u00a9\3\2\2\2\u0691\u0692\5\u00c2b\2\u0692\u00ab"+
		"\3\2\2\2\u0693\u0694\5\u00c2b\2\u0694\u00ad\3\2\2\2\u0695\u0696\5\u00c2"+
		"b\2\u0696\u00af\3\2\2\2\u0697\u0698\5\u00c2b\2\u0698\u00b1\3\2\2\2\u0699"+
		"\u069a\5\u00c2b\2\u069a\u00b3\3\2\2\2\u069b\u069c\5\u00c2b\2\u069c\u00b5"+
		"\3\2\2\2\u069d\u069e\5\u00c2b\2\u069e\u00b7\3\2\2\2\u069f\u06a0\5\u00c2"+
		"b\2\u06a0\u00b9\3\2\2\2\u06a1\u06a2\5\u00c2b\2\u06a2\u00bb\3\2\2\2\u06a3"+
		"\u06a4\5\u00c2b\2\u06a4\u00bd\3\2\2\2\u06a5\u06a6\5\u00c2b\2\u06a6\u00bf"+
		"\3\2\2\2\u06a7\u06a8\5\u00c2b\2\u06a8\u00c1\3\2\2\2\u06a9\u06b0\7\u00b7"+
		"\2\2\u06aa\u06b0\7\u00bb\2\2\u06ab\u06ac\7\7\2\2\u06ac\u06ad\5\u00c2b"+
		"\2\u06ad\u06ae\7\b\2\2\u06ae\u06b0\3\2\2\2\u06af\u06a9\3\2\2\2\u06af\u06aa"+
		"\3\2\2\2\u06af\u06ab\3\2\2\2\u06b0\u00c3\3\2\2\2\u06b1\u06b9\7\u00b8\2"+
		"\2\u06b2\u06b9\5\u009aN\2\u06b3\u06b9\7\u00bb\2\2\u06b4\u06b5\7\7\2\2"+
		"\u06b5\u06b6\5\u00c2b\2\u06b6\u06b7\7\b\2\2\u06b7\u06b9\3\2\2\2\u06b8"+
		"\u06b1\3\2\2\2\u06b8\u06b2\3\2\2\2\u06b8\u06b3\3\2\2\2\u06b8\u06b4\3\2"+
		"\2\2\u06b9\u00c5\3\2\2\2\u00d4\u00c9\u00cb\u00d6\u00dd\u00e2\u00e8\u00ee"+
		"\u00f0\u00f6\u00fb\u00fe\u0101\u010c\u010f\u0124\u0126\u012a\u0131\u0139"+
		"\u013c\u014b\u014f\u015a\u0166\u016b\u016f\u017b\u0183\u0189\u018e\u0193"+
		"\u019b\u01a2\u01a9\u01b0\u01b6\u01b9\u01c4\u01d6\u01de\u01e1\u01e4\u01ea"+
		"\u01f5\u0201\u0209\u020f\u0212\u0216\u021a\u0224\u022a\u022d\u0231\u0233"+
		"\u0239\u0241\u0244\u024e\u0253\u025c\u025e\u0269\u0270\u0279\u029b\u02a8"+
		"\u02ab\u02b1\u02b3\u02bd\u02c0\u02c6\u02c8\u02cc\u02d3\u02dc\u02e0\u02e2"+
		"\u02e6\u02ef\u02f4\u02f6\u02ff\u030a\u0311\u0314\u0319\u031b\u0322\u0329"+
		"\u032e\u0332\u0336\u0345\u034a\u034d\u0362\u0368\u036a\u036e\u0375\u037a"+
		"\u0383\u038a\u038e\u0397\u039a\u03a2\u03c0\u03cb\u03d5\u03d8\u03de\u03e1"+
		"\u03e3\u03e5\u03fc\u0409\u0423\u0425\u043c\u044d\u0467\u0469\u0478\u047f"+
		"\u0488\u048d\u0496\u049d\u04a1\u04b2\u04b5\u04bb\u04d9\u04e4\u04ee\u04f1"+
		"\u04f7\u04fa\u04fc\u04fe\u0505\u050e\u0513\u051f\u0523\u0527\u052b\u0532"+
		"\u0535\u0537\u053e\u0541\u0545\u0550\u055a\u0567\u056f\u0572\u057a\u0581"+
		"\u0589\u0593\u059b\u059f\u05a4\u05ad\u05b2\u05c0\u05c3\u05c5\u05ca\u05ce"+
		"\u05d1\u05d8\u05e0\u05e4\u05e8\u05eb\u05f1\u05f4\u05f6\u05ff\u0605\u0608"+
		"\u060b\u060f\u0613\u061a\u0623\u0627\u0629\u062d\u0636\u063b\u063d\u0646"+
		"\u0651\u0658\u065b\u0664\u0669\u066c\u0670\u067a\u0683\u06af\u06b8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}