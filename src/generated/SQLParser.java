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
		RULE_expr_var_init = 49, RULE_expr_print = 50, RULE_foreign_key_clause = 51, 
		RULE_fk_target_column_name = 52, RULE_indexed_column = 53, RULE_table_constraint = 54, 
		RULE_table_constraint_primary_key = 55, RULE_table_constraint_foreign_key = 56, 
		RULE_table_constraint_unique = 57, RULE_table_constraint_key = 58, RULE_fk_origin_column_name = 59, 
		RULE_qualified_table_name = 60, RULE_ordering_term = 61, RULE_pragma_value = 62, 
		RULE_common_table_expression = 63, RULE_result_column = 64, RULE_table_or_subquery = 65, 
		RULE_join_clause = 66, RULE_join_operator = 67, RULE_join_constraint = 68, 
		RULE_select_core = 69, RULE_groupBy = 70, RULE_having = 71, RULE_cte_table_name = 72, 
		RULE_signed_number = 73, RULE_literal_value = 74, RULE_unary_operator = 75, 
		RULE_error_message = 76, RULE_module_argument = 77, RULE_column_alias = 78, 
		RULE_keyword = 79, RULE_unknown = 80, RULE_name = 81, RULE_function_name = 82, 
		RULE_database_name = 83, RULE_source_table_name = 84, RULE_table_name = 85, 
		RULE_table_or_index_name = 86, RULE_new_table_name = 87, RULE_column_name = 88, 
		RULE_collation_name = 89, RULE_foreign_table = 90, RULE_index_name = 91, 
		RULE_trigger_name = 92, RULE_view_name = 93, RULE_module_name = 94, RULE_pragma_name = 95, 
		RULE_savepoint_name = 96, RULE_table_alias = 97, RULE_transaction_name = 98, 
		RULE_any_name = 99, RULE_any_name_identifier_json = 100;
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
			"expr_for_and_operator", "expr_var_init", "expr_print", "foreign_key_clause", 
			"fk_target_column_name", "indexed_column", "table_constraint", "table_constraint_primary_key", 
			"table_constraint_foreign_key", "table_constraint_unique", "table_constraint_key", 
			"fk_origin_column_name", "qualified_table_name", "ordering_term", "pragma_value", 
			"common_table_expression", "result_column", "table_or_subquery", "join_clause", 
			"join_operator", "join_constraint", "select_core", "groupBy", "having", 
			"cte_table_name", "signed_number", "literal_value", "unary_operator", 
			"error_message", "module_argument", "column_alias", "keyword", "unknown", 
			"name", "function_name", "database_name", "source_table_name", "table_name", 
			"table_or_index_name", "new_table_name", "column_name", "collation_name", 
			"foreign_table", "index_name", "trigger_name", "view_name", "module_name", 
			"pragma_name", "savepoint_name", "table_alias", "transaction_name", "any_name", 
			"any_name_identifier_json"
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
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL || _la==OPEN_PAR || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (K_CREATE - 68)) | (1L << (K_EXPLAIN - 68)) | (1L << (K_FUNCTION - 68)))) != 0) || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & ((1L << (K_SELECT - 153)) | (1L << (K_VALUES - 153)) | (1L << (K_VAR - 153)) | (1L << (IDENTIFIER - 153)) | (1L << (STRING_LITERAL - 153)) | (1L << (UNEXPECTED_CHAR - 153)))) != 0)) {
				{
				setState(205);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case K_FUNCTION:
				case K_VAR:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					setState(202);
					def_all();
					}
					break;
				case SCOL:
				case K_CREATE:
				case K_EXPLAIN:
				case K_SELECT:
				case K_VALUES:
					{
					setState(203);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(204);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
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
			setState(212);
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
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(215);
				match(SCOL);
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
			sql_stmt();
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(223); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(222);
						match(SCOL);
						}
						}
						setState(225); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(227);
					sql_stmt();
					}
					} 
				}
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(233);
					match(SCOL);
					}
					} 
				}
				setState(238);
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
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_EXPLAIN) {
				{
				setState(239);
				match(K_EXPLAIN);
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_QUERY) {
					{
					setState(240);
					match(K_QUERY);
					setState(241);
					match(K_PLAN);
					}
				}

				}
			}

			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(246);
				create_type_stmt();
				}
				break;
			case 2:
				{
				setState(247);
				create_table_stmt();
				}
				break;
			case 3:
				{
				setState(248);
				create_aggr_func();
				}
				break;
			case 4:
				{
				setState(249);
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
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				def_function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				var_get_func();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
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
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(257);
				match(K_VAR);
				}
			}

			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FUNCTION) {
				{
				setState(260);
				match(K_FUNCTION);
				}
			}

			setState(263);
			any_name();
			setState(264);
			match(OPEN_PAR);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(265);
				match(K_VAR);
				setState(266);
				any_name();
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(267);
					match(COMMA);
					setState(268);
					match(K_VAR);
					setState(269);
					any_name();
					}
					}
					setState(274);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(277);
			match(CLOSE_PAR);
			setState(278);
			match(OPEN_B);
			setState(279);
			body();
			setState(280);
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
			setState(298);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(296);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(282);
						var_init();
						}
						break;
					case 2:
						{
						setState(283);
						def_print_stmt();
						}
						break;
					case 3:
						{
						setState(284);
						if_stmt();
						}
						break;
					case 4:
						{
						setState(285);
						while_stmt();
						}
						break;
					case 5:
						{
						setState(286);
						do_while_stmt();
						}
						break;
					case 6:
						{
						setState(287);
						for_stmt();
						}
						break;
					case 7:
						{
						setState(288);
						switch_stmt();
						}
						break;
					case 8:
						{
						setState(289);
						inline_condition_stmt();
						}
						break;
					case 9:
						{
						setState(290);
						sql_stmt_list();
						setState(291);
						match(SCOL);
						}
						break;
					case 10:
						{
						setState(293);
						var_get_func();
						}
						break;
					case 11:
						{
						setState(294);
						func_argument_list();
						}
						break;
					case 12:
						{
						setState(295);
						var_operator();
						}
						break;
					}
					} 
				}
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(301);
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
			setState(304);
			match(K_VAR);
			setState(305);
			match(IDENTIFIER);
			setState(306);
			match(ASSIGN);
			setState(309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_FUNCTION:
				{
				setState(307);
				match(K_FUNCTION);
				}
				break;
			case OPEN_PAR:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(308);
				any_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(311);
			match(OPEN_PAR);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
				{
				setState(312);
				any_name();
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(313);
					match(COMMA);
					setState(314);
					any_name();
					}
					}
					setState(319);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(322);
			match(CLOSE_PAR);
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

	public static class Var_initContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(325);
				match(K_VAR);
				}
			}

			setState(328);
			any_name();
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(329);
				match(ASSIGN);
				setState(330);
				expr(0);
				}
			}

			setState(333);
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
			setState(335);
			expr_for_and_operator();
			setState(339);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(336);
					match(SCOL);
					}
					} 
				}
				setState(341);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(342);
				match(K_VAR);
				}
			}

			setState(345);
			match(K_PRINT);
			setState(346);
			match(OPEN_PAR);
			setState(347);
			print_body();
			setState(348);
			match(CLOSE_PAR);
			setState(349);
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
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << OPEN_ARRAY))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (K_CURRENT_DATE - 70)) | (1L << (K_CURRENT_TIME - 70)) | (1L << (K_CURRENT_TIMESTAMP - 70)) | (1L << (K_EXISTS - 70)) | (1L << (K_NOT - 70)) | (1L << (K_NULL - 70)))) != 0) || ((((_la - 181)) & ~0x3f) == 0 && ((1L << (_la - 181)) & ((1L << (IDENTIFIER - 181)) | (1L << (NUMERIC_LITERAL - 181)) | (1L << (STRING_LITERAL - 181)) | (1L << (BLOB_LITERAL - 181)))) != 0)) {
				{
				{
				setState(351);
				expr_print(0);
				}
				}
				setState(356);
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
			setState(357);
			match(K_IF);
			setState(358);
			match(OPEN_PAR);
			setState(359);
			expr_if(0);
			setState(360);
			match(CLOSE_PAR);
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_B:
				{
				setState(361);
				match(OPEN_B);
				setState(362);
				body();
				setState(363);
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
				setState(365);
				body();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(371);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(368);
					else_if_stmt();
					}
					} 
				}
				setState(373);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(374);
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
			setState(377);
			match(K_ELSE);
			setState(378);
			match(K_IF);
			setState(379);
			match(OPEN_PAR);
			setState(380);
			expr_if(0);
			setState(381);
			match(CLOSE_PAR);
			setState(387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_B:
				{
				setState(382);
				match(OPEN_B);
				setState(383);
				body();
				setState(384);
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
				setState(386);
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
			setState(389);
			match(K_ELSE);
			setState(395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_B:
				{
				setState(390);
				match(OPEN_B);
				setState(391);
				body();
				setState(392);
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
				setState(394);
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
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				expr_if(0);
				setState(398);
				match(QuesM);
				setState(401);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(399);
					expr(0);
					}
					break;
				case 2:
					{
					setState(400);
					expr_for_and_operator();
					}
					break;
				}
				setState(403);
				match(ORM);
				setState(406);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(404);
					expr(0);
					}
					break;
				case 2:
					{
					setState(405);
					expr_for_and_operator();
					}
					break;
				}
				setState(411);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(408);
						match(SCOL);
						}
						} 
					}
					setState(413);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				expr_if(0);
				setState(415);
				match(QuesM);
				setState(419);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(416);
						match(OPEN_PAR);
						}
						} 
					}
					setState(421);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(422);
				inline_condition_stmt();
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CLOSE_PAR) {
					{
					{
					setState(423);
					match(CLOSE_PAR);
					}
					}
					setState(428);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(429);
				match(ORM);
				setState(433);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(430);
						match(OPEN_PAR);
						}
						} 
					}
					setState(435);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(436);
				inline_condition_stmt();
				setState(440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(437);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(442);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				setState(446);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(443);
						match(SCOL);
						}
						} 
					}
					setState(448);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
			setState(451);
			match(K_WHILE);
			setState(452);
			match(OPEN_PAR);
			setState(453);
			expr_while(0);
			setState(454);
			match(CLOSE_PAR);
			setState(460);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_B:
				{
				setState(455);
				match(OPEN_B);
				setState(456);
				body();
				setState(457);
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
				setState(459);
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
			setState(462);
			match(K_DO);
			setState(463);
			match(OPEN_B);
			setState(464);
			body();
			setState(465);
			match(CLOSE_B);
			setState(466);
			while_do_stmt();
			setState(467);
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
			setState(469);
			match(K_WHILE);
			setState(470);
			match(OPEN_PAR);
			setState(471);
			expr_while(0);
			setState(472);
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
			setState(474);
			match(K_FOR);
			setState(475);
			match(OPEN_PAR);
			setState(478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(476);
				for_rule();
				}
				break;
			case 2:
				{
				setState(477);
				foreach_rule();
				}
				break;
			}
			setState(480);
			match(CLOSE_PAR);
			setState(486);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_B:
				{
				setState(481);
				match(OPEN_B);
				setState(482);
				body();
				setState(483);
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
				setState(485);
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
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(488);
				match(K_VAR);
				}
			}

			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (K_CURRENT_DATE - 70)) | (1L << (K_CURRENT_TIME - 70)) | (1L << (K_CURRENT_TIMESTAMP - 70)) | (1L << (K_NULL - 70)))) != 0) || ((((_la - 181)) & ~0x3f) == 0 && ((1L << (_la - 181)) & ((1L << (IDENTIFIER - 181)) | (1L << (NUMERIC_LITERAL - 181)) | (1L << (STRING_LITERAL - 181)) | (1L << (BLOB_LITERAL - 181)))) != 0)) {
				{
				setState(491);
				expr_for_and_operator();
				}
			}

			setState(494);
			match(SCOL);
			setState(495);
			expr_if(0);
			setState(496);
			match(SCOL);
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (K_CURRENT_DATE - 70)) | (1L << (K_CURRENT_TIME - 70)) | (1L << (K_CURRENT_TIMESTAMP - 70)) | (1L << (K_NULL - 70)))) != 0) || ((((_la - 181)) & ~0x3f) == 0 && ((1L << (_la - 181)) & ((1L << (IDENTIFIER - 181)) | (1L << (NUMERIC_LITERAL - 181)) | (1L << (STRING_LITERAL - 181)) | (1L << (BLOB_LITERAL - 181)))) != 0)) {
				{
				setState(497);
				expr_for_and_operator();
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
			setState(500);
			match(K_VAR);
			setState(501);
			any_name();
			setState(502);
			match(ORM);
			setState(503);
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
			setState(505);
			match(K_RETURN);
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(506);
				expr(0);
				}
				break;
			case 2:
				{
				setState(507);
				var_operator();
				}
				break;
			case 3:
				{
				setState(508);
				inline_condition_stmt();
				}
				break;
			}
			setState(511);
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
		public List<Literal_valueContext> literal_value() {
			return getRuleContexts(Literal_valueContext.class);
		}
		public Literal_valueContext literal_value(int i) {
			return getRuleContext(Literal_valueContext.class,i);
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
			setState(513);
			match(K_SWITCH);
			setState(514);
			match(OPEN_PAR);
			setState(515);
			any_name();
			setState(516);
			match(CLOSE_PAR);
			setState(517);
			match(OPEN_B);
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_CASE) {
				{
				{
				setState(518);
				match(K_CASE);
				setState(521);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(519);
					literal_value();
					}
					break;
				case 2:
					{
					setState(520);
					any_name();
					}
					break;
				}
				setState(523);
				match(ORM);
				setState(538);
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
					setState(524);
					body();
					}
					break;
				case OPEN_B:
					{
					setState(525);
					match(OPEN_B);
					setState(526);
					body();
					setState(529);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_BREAK) {
						{
						setState(527);
						match(K_BREAK);
						setState(528);
						match(SCOL);
						}
					}

					setState(531);
					match(CLOSE_B);
					setState(535);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SCOL) {
						{
						{
						setState(532);
						match(SCOL);
						}
						}
						setState(537);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_BREAK) {
					{
					setState(540);
					match(K_BREAK);
					setState(541);
					match(SCOL);
					}
				}

				}
				}
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DEFAULT) {
				{
				setState(549);
				match(K_DEFAULT);
				setState(550);
				match(ORM);
				setState(565);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(551);
					body();
					}
					break;
				case 2:
					{
					setState(552);
					match(OPEN_B);
					setState(553);
					body();
					setState(556);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_BREAK) {
						{
						setState(554);
						match(K_BREAK);
						setState(555);
						match(SCOL);
						}
					}

					setState(558);
					match(CLOSE_B);
					setState(562);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SCOL) {
						{
						{
						setState(559);
						match(SCOL);
						}
						}
						setState(564);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_BREAK) {
					{
					setState(567);
					match(K_BREAK);
					setState(568);
					match(SCOL);
					}
				}

				}
			}

			setState(573);
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
			setState(577);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_FUNCTION:
				{
				setState(575);
				match(K_FUNCTION);
				}
				break;
			case OPEN_PAR:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(576);
				any_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(579);
			match(OPEN_PAR);
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
				{
				setState(580);
				any_name();
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(581);
					match(COMMA);
					setState(582);
					any_name();
					}
					}
					setState(587);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(590);
			match(CLOSE_PAR);
			setState(591);
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
			setState(593);
			match(K_CREATE);
			setState(594);
			match(K_TABLE);
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(595);
				match(K_IF);
				setState(596);
				match(K_NOT);
				setState(597);
				match(K_EXISTS);
				}
			}

			setState(603);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(600);
				database_name();
				setState(601);
				match(DOT);
				}
				break;
			}
			setState(605);
			table_name();
			{
			setState(606);
			match(OPEN_PAR);
			setState(607);
			column_def();
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				setState(612);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(608);
					match(COMMA);
					setState(609);
					table_constraint();
					}
					break;
				case 2:
					{
					setState(610);
					match(COMMA);
					setState(611);
					column_def();
					}
					break;
				}
				}
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(617);
			match(CLOSE_PAR);
			setState(625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(618);
				match(K_TYPE);
				setState(619);
				match(ASSIGN);
				setState(620);
				_la = _input.LA(1);
				if ( !(_la==K_CSV || _la==K_JSON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(621);
				match(COMMA);
				setState(622);
				match(T__0);
				setState(623);
				match(ASSIGN);
				setState(624);
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
			setState(627);
			match(K_CREATE);
			setState(628);
			match(K_TYPE);
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(629);
				match(K_IF);
				setState(630);
				match(K_NOT);
				setState(631);
				match(K_EXISTS);
				}
			}

			setState(634);
			any_name();
			{
			setState(635);
			match(OPEN_PAR);
			setState(636);
			column_def();
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(637);
				match(COMMA);
				setState(638);
				column_def();
				}
				}
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(644);
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
			setState(646);
			match(K_CREATE);
			setState(647);
			match(K_AGGREGATION_FUNCTION);
			setState(648);
			any_name();
			{
			setState(649);
			match(OPEN_PAR);
			setState(650);
			jar_path();
			setState(651);
			match(COMMA);
			setState(652);
			class_name();
			setState(653);
			match(COMMA);
			setState(654);
			method_name();
			setState(655);
			match(COMMA);
			setState(656);
			return_type();
			setState(657);
			match(COMMA);
			setState(658);
			array_aggr();
			setState(659);
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
			setState(661);
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
			setState(663);
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
			setState(665);
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
			setState(667);
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
			setState(669);
			match(OPEN_ARRAY);
			setState(670);
			any_name();
			setState(675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(671);
				match(COMMA);
				setState(672);
				any_name();
				}
				}
				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(678);
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
			setState(680);
			select_core();
			setState(691);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(681);
				match(K_ORDER);
				setState(682);
				match(K_BY);
				setState(683);
				ordering_term();
				setState(688);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(684);
						match(COMMA);
						setState(685);
						ordering_term();
						}
						} 
					}
					setState(690);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				}
				}
				break;
			}
			setState(699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(693);
				match(K_LIMIT);
				setState(694);
				expr(0);
				setState(697);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(695);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(696);
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
			setState(701);
			select_or_values();
			setState(712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(702);
				match(K_ORDER);
				setState(703);
				match(K_BY);
				setState(704);
				ordering_term();
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(705);
					match(COMMA);
					setState(706);
					ordering_term();
					}
					}
					setState(711);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(714);
				match(K_LIMIT);
				setState(715);
				expr(0);
				setState(718);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(716);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(717);
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
		public GroupByContext groupBy() {
			return getRuleContext(GroupByContext.class,0);
		}
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
		public HavingContext having() {
			return getRuleContext(HavingContext.class,0);
		}
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
			setState(793);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(722);
				match(K_SELECT);
				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(723);
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

				setState(726);
				result_column();
				setState(731);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(727);
					match(COMMA);
					setState(728);
					result_column();
					}
					}
					setState(733);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(746);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(734);
					match(K_FROM);
					setState(744);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
					case 1:
						{
						setState(735);
						table_or_subquery();
						setState(740);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(736);
							match(COMMA);
							setState(737);
							table_or_subquery();
							}
							}
							setState(742);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(743);
						join_clause();
						}
						break;
					}
					}
				}

				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(748);
					match(K_WHERE);
					setState(749);
					expr(0);
					}
				}

				setState(763);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(752);
					groupBy();
					setState(757);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(753);
						match(COMMA);
						setState(754);
						expr(0);
						}
						}
						setState(759);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(761);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(760);
						having();
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(765);
				match(K_VALUES);
				setState(766);
				match(OPEN_PAR);
				setState(767);
				expr(0);
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(768);
					match(COMMA);
					setState(769);
					expr(0);
					}
					}
					setState(774);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(775);
				match(CLOSE_PAR);
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(776);
					match(COMMA);
					setState(777);
					match(OPEN_PAR);
					setState(778);
					expr(0);
					setState(783);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(779);
						match(COMMA);
						setState(780);
						expr(0);
						}
						}
						setState(785);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(786);
					match(CLOSE_PAR);
					}
					}
					setState(792);
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
			setState(795);
			column_name();
			setState(800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_CHECK) | (1L << K_COLLATE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (K_CONSTRAINT - 67)) | (1L << (K_DEFAULT - 67)) | (1L << (K_NOT - 67)) | (1L << (K_NULL - 67)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (K_PRIMARY - 136)) | (1L << (K_REFERENCES - 136)) | (1L << (K_UNIQUE - 136)) | (1L << (IDENTIFIER - 136)) | (1L << (STRING_LITERAL - 136)))) != 0)) {
				{
				setState(798);
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
					setState(796);
					column_constraint();
					}
					break;
				case OPEN_PAR:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					setState(797);
					type_name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(802);
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
			setState(803);
			name();
			setState(823);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
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
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(811);
				match(OPEN_PAR);
				setState(812);
				signed_number();
				setState(814);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(813);
					any_name();
					}
				}

				setState(816);
				match(COMMA);
				setState(817);
				signed_number();
				setState(819);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(818);
					any_name();
					}
				}

				setState(821);
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
			setState(827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(825);
				match(K_CONSTRAINT);
				setState(826);
				name();
				}
			}

			setState(842);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(829);
				column_constraint_primary_key();
				}
				break;
			case K_REFERENCES:
				{
				setState(830);
				column_constraint_foreign_key();
				}
				break;
			case K_NOT:
				{
				setState(831);
				column_constraint_not_null();
				}
				break;
			case K_NULL:
				{
				setState(832);
				column_constraint_null();
				}
				break;
			case K_UNIQUE:
				{
				setState(833);
				match(K_UNIQUE);
				}
				break;
			case K_CHECK:
				{
				setState(834);
				match(K_CHECK);
				setState(835);
				match(OPEN_PAR);
				setState(836);
				expr(0);
				setState(837);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(839);
				column_default();
				}
				break;
			case K_COLLATE:
				{
				setState(840);
				match(K_COLLATE);
				setState(841);
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
			setState(844);
			match(K_PRIMARY);
			setState(845);
			match(K_KEY);
			setState(847);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(846);
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

			setState(850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AUTOINCREMENT) {
				{
				setState(849);
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
			setState(852);
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
			setState(854);
			match(K_NOT);
			setState(855);
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
			setState(857);
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
			setState(859);
			match(K_DEFAULT);
			setState(871);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(860);
				column_default_value();
				}
				break;
			case 2:
				{
				setState(861);
				match(OPEN_PAR);
				setState(862);
				expr(0);
				setState(863);
				match(CLOSE_PAR);
				}
				break;
			case 3:
				{
				setState(865);
				match(K_NEXTVAL);
				setState(866);
				match(OPEN_PAR);
				setState(867);
				expr(0);
				setState(868);
				match(CLOSE_PAR);
				}
				break;
			case 4:
				{
				setState(870);
				any_name();
				}
				break;
			}
			setState(879);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(873);
				match(T__1);
				setState(875); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(874);
						any_name();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(877); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
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
			setState(883);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(881);
				signed_number();
				}
				break;
			case 2:
				{
				setState(882);
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
			setState(935);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(886);
				literal_value();
				}
				break;
			case 2:
				{
				setState(895);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(890);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
					case 1:
						{
						setState(887);
						database_name();
						setState(888);
						match(DOT);
						}
						break;
					}
					setState(892);
					table_name();
					setState(893);
					match(DOT);
					}
					break;
				}
				setState(897);
				column_name();
				}
				break;
			case 3:
				{
				setState(898);
				unary_operator();
				setState(899);
				expr(15);
				}
				break;
			case 4:
				{
				setState(901);
				function_name();
				setState(902);
				match(OPEN_PAR);
				setState(915);
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
					setState(904);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_DISTINCT) {
						{
						setState(903);
						match(K_DISTINCT);
						}
					}

					setState(906);
					expr(0);
					setState(911);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(907);
						match(COMMA);
						setState(908);
						expr(0);
						}
						}
						setState(913);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(914);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(917);
				match(CLOSE_PAR);
				}
				break;
			case 5:
				{
				setState(919);
				match(OPEN_PAR);
				setState(920);
				expr(0);
				setState(921);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(927);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(924);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(923);
						match(K_NOT);
						}
					}

					setState(926);
					match(K_EXISTS);
					}
				}

				setState(929);
				match(OPEN_PAR);
				setState(930);
				select_stmt();
				setState(931);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(933);
				inline_condition_stmt();
				}
				break;
			case 8:
				{
				setState(934);
				sql_stmt_list();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1002);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1000);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(937);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(938);
						match(PIPE2);
						setState(939);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(940);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(941);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(942);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(943);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(944);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(945);
						expr(13);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(946);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(947);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(948);
						expr(12);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(949);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(950);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(951);
						expr(11);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(952);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(965);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
						case 1:
							{
							setState(953);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(954);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(955);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(956);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(957);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(958);
							match(K_IS);
							setState(959);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(960);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(961);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(962);
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(963);
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(964);
							match(K_REGEXP);
							}
							break;
						}
						setState(967);
						expr(10);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(968);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(969);
						match(K_AND);
						setState(970);
						expr(9);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(971);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(972);
						match(K_OR);
						setState(973);
						expr(8);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(974);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(976);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(975);
							match(K_NOT);
							}
						}

						setState(978);
						match(K_IN);
						setState(998);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
						case 1:
							{
							setState(979);
							match(OPEN_PAR);
							setState(989);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
							case 1:
								{
								setState(980);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(981);
								expr(0);
								setState(986);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(982);
									match(COMMA);
									setState(983);
									expr(0);
									}
									}
									setState(988);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(991);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(995);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
							case 1:
								{
								setState(992);
								database_name();
								setState(993);
								match(DOT);
								}
								break;
							}
							setState(997);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1004);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
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
			setState(1038);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(1006);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1007);
				any_name();
				}
				break;
			case 3:
				{
				setState(1008);
				any_name();
				setState(1009);
				match(OPEN_ARRAY);
				setState(1010);
				expr(0);
				setState(1011);
				match(CLOSE_ARRAY);
				setState(1012);
				expr_while(0);
				setState(1013);
				any_name();
				setState(1014);
				match(OPEN_ARRAY);
				setState(1015);
				expr(0);
				setState(1016);
				match(CLOSE_ARRAY);
				}
				break;
			case 4:
				{
				setState(1018);
				any_name();
				setState(1019);
				match(OPEN_ARRAY);
				setState(1020);
				expr(0);
				setState(1021);
				match(CLOSE_ARRAY);
				setState(1022);
				expr_while(0);
				setState(1025);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					setState(1023);
					any_name();
					}
					break;
				case STAR:
				case PLUS:
				case MINUS:
				case NUMERIC_LITERAL:
					{
					setState(1024);
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
				setState(1027);
				match(OPEN_PAR);
				setState(1028);
				expr_while(0);
				setState(1029);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(1031);
				match(K_CAST);
				setState(1032);
				match(OPEN_PAR);
				setState(1033);
				expr_while(0);
				setState(1034);
				match(K_AS);
				setState(1035);
				type_name();
				setState(1036);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1066);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1064);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_whileContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_while);
						setState(1040);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1041);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1042);
						expr_while(13);
						}
						break;
					case 2:
						{
						_localctx = new Expr_whileContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_while);
						setState(1043);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1044);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1045);
						expr_while(12);
						}
						break;
					case 3:
						{
						_localctx = new Expr_whileContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_while);
						setState(1046);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1047);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1048);
						expr_while(11);
						}
						break;
					case 4:
						{
						_localctx = new Expr_whileContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_while);
						setState(1049);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1050);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NOT_EQ1) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1051);
						expr_while(10);
						}
						break;
					case 5:
						{
						_localctx = new Expr_whileContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_while);
						setState(1052);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1053);
						match(K_AND);
						setState(1054);
						expr_while(9);
						}
						break;
					case 6:
						{
						_localctx = new Expr_whileContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_while);
						setState(1055);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1056);
						match(K_OR);
						setState(1057);
						expr_while(8);
						}
						break;
					case 7:
						{
						_localctx = new Expr_whileContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_while);
						setState(1058);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1059);
						match(PIPE2);
						setState(1060);
						expr_while(7);
						}
						break;
					case 8:
						{
						_localctx = new Expr_whileContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_while);
						setState(1061);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1062);
						match(AND);
						setState(1063);
						expr_while(6);
						}
						break;
					}
					} 
				}
				setState(1068);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
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
			setState(1106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(1070);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1071);
				any_name();
				}
				break;
			case 3:
				{
				setState(1072);
				any_name();
				setState(1073);
				match(OPEN_ARRAY);
				setState(1074);
				expr(0);
				setState(1075);
				match(CLOSE_ARRAY);
				setState(1076);
				expr_if(0);
				setState(1077);
				any_name();
				setState(1078);
				match(OPEN_ARRAY);
				setState(1079);
				expr(0);
				setState(1080);
				match(CLOSE_ARRAY);
				}
				break;
			case 4:
				{
				setState(1082);
				any_name();
				setState(1083);
				match(OPEN_ARRAY);
				setState(1084);
				expr(0);
				setState(1085);
				match(CLOSE_ARRAY);
				setState(1086);
				expr_if(0);
				setState(1089);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					setState(1087);
					any_name();
					}
					break;
				case STAR:
				case PLUS:
				case MINUS:
				case NUMERIC_LITERAL:
					{
					setState(1088);
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
				setState(1091);
				match(OPEN_ARRAY);
				setState(1092);
				any_name();
				setState(1093);
				match(CLOSE_ARRAY);
				}
				break;
			case 6:
				{
				setState(1095);
				match(OPEN_PAR);
				setState(1096);
				expr_if(0);
				setState(1097);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(1099);
				match(K_CAST);
				setState(1100);
				match(OPEN_PAR);
				setState(1101);
				expr_if(0);
				setState(1102);
				match(K_AS);
				setState(1103);
				type_name();
				setState(1104);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1132);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_ifContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_if);
						setState(1108);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1109);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1110);
						expr_if(14);
						}
						break;
					case 2:
						{
						_localctx = new Expr_ifContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_if);
						setState(1111);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1112);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1113);
						expr_if(13);
						}
						break;
					case 3:
						{
						_localctx = new Expr_ifContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_if);
						setState(1114);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1115);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1116);
						expr_if(12);
						}
						break;
					case 4:
						{
						_localctx = new Expr_ifContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_if);
						setState(1117);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1118);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NOT_EQ1) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1119);
						expr_if(11);
						}
						break;
					case 5:
						{
						_localctx = new Expr_ifContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_if);
						setState(1120);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1121);
						match(K_AND);
						setState(1122);
						expr_if(10);
						}
						break;
					case 6:
						{
						_localctx = new Expr_ifContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_if);
						setState(1123);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1124);
						match(K_OR);
						setState(1125);
						expr_if(9);
						}
						break;
					case 7:
						{
						_localctx = new Expr_ifContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_if);
						setState(1126);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1127);
						match(PIPE2);
						setState(1128);
						expr_if(8);
						}
						break;
					case 8:
						{
						_localctx = new Expr_ifContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_if);
						setState(1129);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1130);
						match(AND);
						setState(1131);
						expr_if(7);
						}
						break;
					}
					} 
				}
				setState(1136);
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

	public static class Expr_for_and_operatorContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Expr_var_initContext expr_var_init() {
			return getRuleContext(Expr_var_initContext.class,0);
		}
		public TerminalNode PLUS_PLUS() { return getToken(SQLParser.PLUS_PLUS, 0); }
		public TerminalNode MINUS_MINUS() { return getToken(SQLParser.MINUS_MINUS, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public Expr_for_and_operatorContext expr_for_and_operator() {
			return getRuleContext(Expr_for_and_operatorContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
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
		Expr_for_and_operatorContext _localctx = new Expr_for_and_operatorContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_expr_for_and_operator);
		int _la;
		try {
			setState(1149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1137);
				literal_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1138);
				any_name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1139);
				expr_var_init();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1140);
				any_name();
				setState(1141);
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
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(1143);
				_la = _input.LA(1);
				if ( !(_la==PLUS_PLUS || _la==MINUS_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1144);
				any_name();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1145);
				match(OPEN_PAR);
				setState(1146);
				expr_for_and_operator();
				setState(1147);
				match(CLOSE_PAR);
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

	public static class Expr_var_initContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_var_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_var_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpr_var_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpr_var_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExpr_var_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_var_initContext expr_var_init() throws RecognitionException {
		Expr_var_initContext _localctx = new Expr_var_initContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_expr_var_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1151);
			any_name();
			setState(1152);
			match(ASSIGN);
			setState(1153);
			expr(0);
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
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_expr_print, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				setState(1156);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1157);
				any_name();
				}
				break;
			case 3:
				{
				setState(1166);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(1161);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
					case 1:
						{
						setState(1158);
						database_name();
						setState(1159);
						match(DOT);
						}
						break;
					}
					setState(1163);
					table_name();
					setState(1164);
					match(DOT);
					}
					break;
				}
				setState(1168);
				column_name();
				}
				break;
			case 4:
				{
				setState(1169);
				unary_operator();
				setState(1170);
				expr_print(15);
				}
				break;
			case 5:
				{
				setState(1172);
				function_name();
				setState(1173);
				match(OPEN_PAR);
				setState(1186);
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
					setState(1175);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_DISTINCT) {
						{
						setState(1174);
						match(K_DISTINCT);
						}
					}

					setState(1177);
					expr_print(0);
					setState(1182);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1178);
						match(COMMA);
						setState(1179);
						expr_print(0);
						}
						}
						setState(1184);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(1185);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(1188);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(1190);
				match(OPEN_PAR);
				setState(1191);
				expr_print(0);
				setState(1192);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(1194);
				match(OPEN_ARRAY);
				setState(1195);
				expr_print(0);
				setState(1196);
				match(CLOSE_ARRAY);
				}
				break;
			case 8:
				{
				setState(1198);
				match(OPEN_ARRAY);
				setState(1199);
				var_operator();
				setState(1200);
				match(CLOSE_ARRAY);
				}
				break;
			case 9:
				{
				setState(1206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(1203);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(1202);
						match(K_NOT);
						}
					}

					setState(1205);
					match(K_EXISTS);
					}
				}

				setState(1208);
				match(OPEN_PAR);
				setState(1209);
				select_stmt();
				setState(1210);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1277);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_printContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_print);
						setState(1214);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1215);
						match(PIPE2);
						setState(1216);
						expr_print(15);
						}
						break;
					case 2:
						{
						_localctx = new Expr_printContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_print);
						setState(1217);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1218);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1219);
						expr_print(14);
						}
						break;
					case 3:
						{
						_localctx = new Expr_printContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_print);
						setState(1220);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1221);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1222);
						expr_print(13);
						}
						break;
					case 4:
						{
						_localctx = new Expr_printContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_print);
						setState(1223);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1224);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1225);
						expr_print(12);
						}
						break;
					case 5:
						{
						_localctx = new Expr_printContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_print);
						setState(1226);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1227);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1228);
						expr_print(11);
						}
						break;
					case 6:
						{
						_localctx = new Expr_printContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_print);
						setState(1229);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1242);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
						case 1:
							{
							setState(1230);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(1231);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(1232);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(1233);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(1234);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(1235);
							match(K_IS);
							setState(1236);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(1237);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(1238);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(1239);
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(1240);
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(1241);
							match(K_REGEXP);
							}
							break;
						}
						setState(1244);
						expr_print(10);
						}
						break;
					case 7:
						{
						_localctx = new Expr_printContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_print);
						setState(1245);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1246);
						match(K_AND);
						setState(1247);
						expr_print(9);
						}
						break;
					case 8:
						{
						_localctx = new Expr_printContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_print);
						setState(1248);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1249);
						match(K_OR);
						setState(1250);
						expr_print(8);
						}
						break;
					case 9:
						{
						_localctx = new Expr_printContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_print);
						setState(1251);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1253);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1252);
							match(K_NOT);
							}
						}

						setState(1255);
						match(K_IN);
						setState(1275);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
						case 1:
							{
							setState(1256);
							match(OPEN_PAR);
							setState(1266);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case K_SELECT:
							case K_VALUES:
								{
								setState(1257);
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
								setState(1258);
								expr_print(0);
								setState(1263);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1259);
									match(COMMA);
									setState(1260);
									expr_print(0);
									}
									}
									setState(1265);
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
							setState(1268);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1272);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
							case 1:
								{
								setState(1269);
								database_name();
								setState(1270);
								match(DOT);
								}
								break;
							}
							setState(1274);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
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
		enterRule(_localctx, 102, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1282);
			match(K_REFERENCES);
			setState(1286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(1283);
				database_name();
				setState(1284);
				match(DOT);
				}
				break;
			}
			setState(1288);
			foreign_table();
			setState(1300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1289);
				match(OPEN_PAR);
				setState(1290);
				fk_target_column_name();
				setState(1295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1291);
					match(COMMA);
					setState(1292);
					fk_target_column_name();
					}
					}
					setState(1297);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1298);
				match(CLOSE_PAR);
				}
				break;
			}
			setState(1320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(1316);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(1302);
					match(K_ON);
					setState(1303);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1312);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
					case 1:
						{
						setState(1304);
						match(K_SET);
						setState(1305);
						match(K_NULL);
						}
						break;
					case 2:
						{
						setState(1306);
						match(K_SET);
						setState(1307);
						match(K_DEFAULT);
						}
						break;
					case 3:
						{
						setState(1308);
						match(K_CASCADE);
						}
						break;
					case 4:
						{
						setState(1309);
						match(K_RESTRICT);
						}
						break;
					case 5:
						{
						setState(1310);
						match(K_NO);
						setState(1311);
						match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(1314);
					match(K_MATCH);
					setState(1315);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(1324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1323);
					match(K_NOT);
					}
				}

				setState(1326);
				match(K_DEFERRABLE);
				setState(1331);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1327);
					match(K_INITIALLY);
					setState(1328);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1329);
					match(K_INITIALLY);
					setState(1330);
					match(K_IMMEDIATE);
					}
					break;
				}
				setState(1334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ENABLE) {
					{
					setState(1333);
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
		enterRule(_localctx, 104, RULE_fk_target_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1338);
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
		enterRule(_localctx, 106, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1340);
			column_name();
			setState(1343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1341);
				match(K_COLLATE);
				setState(1342);
				collation_name();
				}
			}

			setState(1346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1345);
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
		enterRule(_localctx, 108, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1348);
				match(K_CONSTRAINT);
				setState(1349);
				name();
				}
			}

			setState(1361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1352);
				table_constraint_primary_key();
				}
				break;
			case K_KEY:
				{
				setState(1353);
				table_constraint_key();
				}
				break;
			case K_UNIQUE:
				{
				setState(1354);
				table_constraint_unique();
				}
				break;
			case K_CHECK:
				{
				setState(1355);
				match(K_CHECK);
				setState(1356);
				match(OPEN_PAR);
				setState(1357);
				expr(0);
				setState(1358);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1360);
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
		enterRule(_localctx, 110, RULE_table_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1363);
			match(K_PRIMARY);
			setState(1364);
			match(K_KEY);
			setState(1365);
			match(OPEN_PAR);
			setState(1366);
			indexed_column();
			setState(1371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1367);
				match(COMMA);
				setState(1368);
				indexed_column();
				}
				}
				setState(1373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1374);
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
		enterRule(_localctx, 112, RULE_table_constraint_foreign_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1376);
			match(K_FOREIGN);
			setState(1377);
			match(K_KEY);
			setState(1378);
			match(OPEN_PAR);
			setState(1379);
			fk_origin_column_name();
			setState(1384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1380);
				match(COMMA);
				setState(1381);
				fk_origin_column_name();
				}
				}
				setState(1386);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1387);
			match(CLOSE_PAR);
			setState(1388);
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
		enterRule(_localctx, 114, RULE_table_constraint_unique);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1390);
			match(K_UNIQUE);
			setState(1392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_KEY) {
				{
				setState(1391);
				match(K_KEY);
				}
			}

			setState(1395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				{
				setState(1394);
				name();
				}
				break;
			}
			setState(1397);
			match(OPEN_PAR);
			setState(1398);
			indexed_column();
			setState(1403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1399);
				match(COMMA);
				setState(1400);
				indexed_column();
				}
				}
				setState(1405);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1406);
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
		enterRule(_localctx, 116, RULE_table_constraint_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1408);
			match(K_KEY);
			setState(1410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1409);
				name();
				}
				break;
			}
			setState(1412);
			match(OPEN_PAR);
			setState(1413);
			indexed_column();
			setState(1418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1414);
				match(COMMA);
				setState(1415);
				indexed_column();
				}
				}
				setState(1420);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1421);
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
		enterRule(_localctx, 118, RULE_fk_origin_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1423);
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
		enterRule(_localctx, 120, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				setState(1425);
				database_name();
				setState(1426);
				match(DOT);
				}
				break;
			}
			setState(1430);
			table_name();
			setState(1436);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1431);
				match(K_INDEXED);
				setState(1432);
				match(K_BY);
				setState(1433);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1434);
				match(K_NOT);
				setState(1435);
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
		enterRule(_localctx, 122, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1438);
			expr(0);
			setState(1440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1439);
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
		enterRule(_localctx, 124, RULE_pragma_value);
		try {
			setState(1445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1442);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1443);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1444);
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
		enterRule(_localctx, 126, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1447);
			table_name();
			setState(1459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1448);
				match(OPEN_PAR);
				setState(1449);
				column_name();
				setState(1454);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1450);
					match(COMMA);
					setState(1451);
					column_name();
					}
					}
					setState(1456);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1457);
				match(CLOSE_PAR);
				}
			}

			setState(1461);
			match(K_AS);
			setState(1462);
			match(OPEN_PAR);
			setState(1463);
			select_stmt();
			setState(1464);
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
		enterRule(_localctx, 128, RULE_result_column);
		int _la;
		try {
			setState(1478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1466);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1467);
				table_name();
				setState(1468);
				match(DOT);
				setState(1469);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1471);
				expr(0);
				setState(1476);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
				case 1:
					{
					setState(1473);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1472);
						match(K_AS);
						}
					}

					setState(1475);
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
		enterRule(_localctx, 130, RULE_table_or_subquery);
		int _la;
		try {
			setState(1527);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1483);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1480);
					database_name();
					setState(1481);
					match(DOT);
					}
					break;
				}
				setState(1485);
				table_name();
				setState(1490);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1487);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1486);
						match(K_AS);
						}
					}

					setState(1489);
					table_alias();
					}
					break;
				}
				setState(1497);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1492);
					match(K_INDEXED);
					setState(1493);
					match(K_BY);
					setState(1494);
					index_name();
					}
					break;
				case 2:
					{
					setState(1495);
					match(K_NOT);
					setState(1496);
					match(K_INDEXED);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1499);
				match(OPEN_PAR);
				setState(1509);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
				case 1:
					{
					setState(1500);
					table_or_subquery();
					setState(1505);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1501);
						match(COMMA);
						setState(1502);
						table_or_subquery();
						}
						}
						setState(1507);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1508);
					join_clause();
					}
					break;
				}
				setState(1511);
				match(CLOSE_PAR);
				setState(1516);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1513);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1512);
						match(K_AS);
						}
					}

					setState(1515);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1518);
				match(OPEN_PAR);
				setState(1519);
				select_stmt();
				setState(1520);
				match(CLOSE_PAR);
				setState(1525);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
				case 1:
					{
					setState(1522);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1521);
						match(K_AS);
						}
					}

					setState(1524);
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
		enterRule(_localctx, 132, RULE_join_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1529);
			table_or_subquery();
			setState(1536);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1530);
					join_operator();
					setState(1531);
					table_or_subquery();
					setState(1532);
					join_constraint();
					}
					} 
				}
				setState(1538);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
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
		enterRule(_localctx, 134, RULE_join_operator);
		int _la;
		try {
			setState(1548);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1539);
				match(COMMA);
				}
				break;
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1545);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1540);
					match(K_LEFT);
					setState(1542);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1541);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1544);
					match(K_INNER);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(1547);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(SQLParser.K_ON, 0); }
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
		enterRule(_localctx, 136, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				{
				setState(1551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ON) {
					{
					setState(1550);
					match(K_ON);
					}
				}

				setState(1553);
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
		public GroupByContext groupBy() {
			return getRuleContext(GroupByContext.class,0);
		}
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
		public HavingContext having() {
			return getRuleContext(HavingContext.class,0);
		}
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
		enterRule(_localctx, 138, RULE_select_core);
		int _la;
		try {
			int _alt;
			setState(1627);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1556);
				match(K_SELECT);
				setState(1558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(1557);
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

				setState(1560);
				result_column();
				setState(1565);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1561);
						match(COMMA);
						setState(1562);
						result_column();
						}
						} 
					}
					setState(1567);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
				}
				setState(1580);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1568);
					match(K_FROM);
					setState(1578);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
					case 1:
						{
						setState(1569);
						table_or_subquery();
						setState(1574);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1570);
								match(COMMA);
								setState(1571);
								table_or_subquery();
								}
								} 
							}
							setState(1576);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
						}
						}
						break;
					case 2:
						{
						setState(1577);
						join_clause();
						}
						break;
					}
					}
					break;
				}
				setState(1584);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1582);
					match(K_WHERE);
					setState(1583);
					expr(0);
					}
					break;
				}
				setState(1597);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(1586);
					groupBy();
					setState(1591);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1587);
							match(COMMA);
							setState(1588);
							expr(0);
							}
							} 
						}
						setState(1593);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
					}
					setState(1595);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
					case 1:
						{
						setState(1594);
						having();
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
				setState(1599);
				match(K_VALUES);
				setState(1600);
				match(OPEN_PAR);
				setState(1601);
				expr(0);
				setState(1606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1602);
					match(COMMA);
					setState(1603);
					expr(0);
					}
					}
					setState(1608);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1609);
				match(CLOSE_PAR);
				setState(1624);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1610);
						match(COMMA);
						setState(1611);
						match(OPEN_PAR);
						setState(1612);
						expr(0);
						setState(1617);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1613);
							match(COMMA);
							setState(1614);
							expr(0);
							}
							}
							setState(1619);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1620);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(1626);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
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

	public static class GroupByContext extends ParserRuleContext {
		public TerminalNode K_GROUP() { return getToken(SQLParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public GroupByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupBy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterGroupBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitGroupBy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitGroupBy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByContext groupBy() throws RecognitionException {
		GroupByContext _localctx = new GroupByContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_groupBy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1629);
			match(K_GROUP);
			setState(1630);
			match(K_BY);
			setState(1631);
			expr(0);
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

	public static class HavingContext extends ParserRuleContext {
		public TerminalNode K_HAVING() { return getToken(SQLParser.K_HAVING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public HavingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterHaving(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitHaving(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitHaving(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingContext having() throws RecognitionException {
		HavingContext _localctx = new HavingContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_having);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1633);
			match(K_HAVING);
			setState(1634);
			expr(0);
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
		enterRule(_localctx, 144, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1636);
			table_name();
			setState(1648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1637);
				match(OPEN_PAR);
				setState(1638);
				column_name();
				setState(1643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1639);
					match(COMMA);
					setState(1640);
					column_name();
					}
					}
					setState(1645);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1646);
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
		enterRule(_localctx, 146, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1655);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMERIC_LITERAL:
				{
				setState(1651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(1650);
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

				setState(1653);
				match(NUMERIC_LITERAL);
				}
				break;
			case STAR:
				{
				setState(1654);
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
		enterRule(_localctx, 148, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1657);
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
		enterRule(_localctx, 150, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1659);
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
		enterRule(_localctx, 152, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1661);
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
		enterRule(_localctx, 154, RULE_module_argument);
		try {
			setState(1665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1663);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1664);
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
		enterRule(_localctx, 156, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1667);
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
		enterRule(_localctx, 158, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1669);
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
		enterRule(_localctx, 160, RULE_unknown);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1672); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1671);
				matchWildcard();
				}
				}
				setState(1674); 
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
		enterRule(_localctx, 162, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1676);
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
		enterRule(_localctx, 164, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1678);
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
		enterRule(_localctx, 166, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1680);
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
		enterRule(_localctx, 168, RULE_source_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1682);
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
		enterRule(_localctx, 170, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1684);
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
		enterRule(_localctx, 172, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1686);
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
		enterRule(_localctx, 174, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1688);
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
		enterRule(_localctx, 176, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1690);
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
		enterRule(_localctx, 178, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1692);
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
		enterRule(_localctx, 180, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1694);
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
		enterRule(_localctx, 182, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1696);
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
		enterRule(_localctx, 184, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1698);
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
		enterRule(_localctx, 186, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1700);
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
		enterRule(_localctx, 188, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1702);
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
		enterRule(_localctx, 190, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1704);
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
		enterRule(_localctx, 192, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1706);
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
		enterRule(_localctx, 194, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1708);
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
		enterRule(_localctx, 196, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1710);
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
		enterRule(_localctx, 198, RULE_any_name);
		try {
			setState(1718);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1712);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1713);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 3);
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
		enterRule(_localctx, 200, RULE_any_name_identifier_json);
		try {
			setState(1727);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER_JSON_ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1720);
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
				setState(1721);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1722);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1723);
				match(OPEN_PAR);
				setState(1724);
				any_name();
				setState(1725);
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
		case 50:
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
	private boolean expr_print_sempred(Expr_printContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return precpred(_ctx, 14);
		case 26:
			return precpred(_ctx, 13);
		case 27:
			return precpred(_ctx, 12);
		case 28:
			return precpred(_ctx, 11);
		case 29:
			return precpred(_ctx, 10);
		case 30:
			return precpred(_ctx, 9);
		case 31:
			return precpred(_ctx, 8);
		case 32:
			return precpred(_ctx, 7);
		case 33:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00c0\u06c4\4\2\t"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\3\2\3\2\3\2\7\2\u00d0\n\2\f\2"+
		"\16\2\u00d3\13\2\3\2\3\2\3\3\3\3\3\3\3\4\7\4\u00db\n\4\f\4\16\4\u00de"+
		"\13\4\3\4\3\4\6\4\u00e2\n\4\r\4\16\4\u00e3\3\4\7\4\u00e7\n\4\f\4\16\4"+
		"\u00ea\13\4\3\4\7\4\u00ed\n\4\f\4\16\4\u00f0\13\4\3\5\3\5\3\5\5\5\u00f5"+
		"\n\5\5\5\u00f7\n\5\3\5\3\5\3\5\3\5\5\5\u00fd\n\5\3\6\3\6\3\6\5\6\u0102"+
		"\n\6\3\7\5\7\u0105\n\7\3\7\5\7\u0108\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7"+
		"\7\u0111\n\7\f\7\16\7\u0114\13\7\5\7\u0116\n\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u012b\n\b\f\b"+
		"\16\b\u012e\13\b\3\b\5\b\u0131\n\b\3\t\3\t\3\t\3\t\3\t\5\t\u0138\n\t\3"+
		"\t\3\t\3\t\3\t\7\t\u013e\n\t\f\t\16\t\u0141\13\t\5\t\u0143\n\t\3\t\3\t"+
		"\3\t\3\n\5\n\u0149\n\n\3\n\3\n\3\n\5\n\u014e\n\n\3\n\3\n\3\13\3\13\7\13"+
		"\u0154\n\13\f\13\16\13\u0157\13\13\3\f\5\f\u015a\n\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\7\r\u0163\n\r\f\r\16\r\u0166\13\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u0171\n\16\3\16\7\16\u0174\n\16\f\16\16\16\u0177"+
		"\13\16\3\16\5\16\u017a\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\5\17\u0186\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u018e\n\20"+
		"\3\21\3\21\3\21\3\21\5\21\u0194\n\21\3\21\3\21\3\21\5\21\u0199\n\21\3"+
		"\21\7\21\u019c\n\21\f\21\16\21\u019f\13\21\3\21\3\21\3\21\7\21\u01a4\n"+
		"\21\f\21\16\21\u01a7\13\21\3\21\3\21\7\21\u01ab\n\21\f\21\16\21\u01ae"+
		"\13\21\3\21\3\21\7\21\u01b2\n\21\f\21\16\21\u01b5\13\21\3\21\3\21\7\21"+
		"\u01b9\n\21\f\21\16\21\u01bc\13\21\3\21\7\21\u01bf\n\21\f\21\16\21\u01c2"+
		"\13\21\5\21\u01c4\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5"+
		"\22\u01cf\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\5\25\u01e1\n\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u01e9\n\25\3\26\5\26\u01ec\n\26\3\26\5\26\u01ef\n\26\3\26\3\26\3"+
		"\26\3\26\5\26\u01f5\n\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\5\30\u0200\n\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u020c\n\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0214\n\31\3\31\3\31\7"+
		"\31\u0218\n\31\f\31\16\31\u021b\13\31\5\31\u021d\n\31\3\31\3\31\5\31\u0221"+
		"\n\31\7\31\u0223\n\31\f\31\16\31\u0226\13\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u022f\n\31\3\31\3\31\7\31\u0233\n\31\f\31\16\31\u0236"+
		"\13\31\5\31\u0238\n\31\3\31\3\31\5\31\u023c\n\31\5\31\u023e\n\31\3\31"+
		"\3\31\3\32\3\32\5\32\u0244\n\32\3\32\3\32\3\32\3\32\7\32\u024a\n\32\f"+
		"\32\16\32\u024d\13\32\5\32\u024f\n\32\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\33\5\33\u0259\n\33\3\33\3\33\3\33\5\33\u025e\n\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\7\33\u0267\n\33\f\33\16\33\u026a\13\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0274\n\33\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u027b\n\34\3\34\3\34\3\34\3\34\3\34\7\34\u0282\n\34\f\34\16\34\u0285"+
		"\13\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\7"+
		"\"\u02a4\n\"\f\"\16\"\u02a7\13\"\3\"\3\"\3#\3#\3#\3#\3#\3#\7#\u02b1\n"+
		"#\f#\16#\u02b4\13#\5#\u02b6\n#\3#\3#\3#\3#\5#\u02bc\n#\5#\u02be\n#\3$"+
		"\3$\3$\3$\3$\3$\7$\u02c6\n$\f$\16$\u02c9\13$\5$\u02cb\n$\3$\3$\3$\3$\5"+
		"$\u02d1\n$\5$\u02d3\n$\3%\3%\5%\u02d7\n%\3%\3%\3%\7%\u02dc\n%\f%\16%\u02df"+
		"\13%\3%\3%\3%\3%\7%\u02e5\n%\f%\16%\u02e8\13%\3%\5%\u02eb\n%\5%\u02ed"+
		"\n%\3%\3%\5%\u02f1\n%\3%\3%\3%\7%\u02f6\n%\f%\16%\u02f9\13%\3%\5%\u02fc"+
		"\n%\5%\u02fe\n%\3%\3%\3%\3%\3%\7%\u0305\n%\f%\16%\u0308\13%\3%\3%\3%\3"+
		"%\3%\3%\7%\u0310\n%\f%\16%\u0313\13%\3%\3%\7%\u0317\n%\f%\16%\u031a\13"+
		"%\5%\u031c\n%\3&\3&\3&\7&\u0321\n&\f&\16&\u0324\13&\3\'\3\'\3\'\3\'\5"+
		"\'\u032a\n\'\3\'\3\'\3\'\3\'\3\'\5\'\u0331\n\'\3\'\3\'\3\'\5\'\u0336\n"+
		"\'\3\'\3\'\5\'\u033a\n\'\3(\3(\5(\u033e\n(\3(\3(\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\5(\u034d\n(\3)\3)\3)\5)\u0352\n)\3)\5)\u0355\n)\3*\3*\3+"+
		"\3+\3+\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u036a\n-\3-\3-\6-"+
		"\u036e\n-\r-\16-\u036f\5-\u0372\n-\3.\3.\5.\u0376\n.\3/\3/\3/\3/\3/\5"+
		"/\u037d\n/\3/\3/\3/\5/\u0382\n/\3/\3/\3/\3/\3/\3/\3/\5/\u038b\n/\3/\3"+
		"/\3/\7/\u0390\n/\f/\16/\u0393\13/\3/\5/\u0396\n/\3/\3/\3/\3/\3/\3/\3/"+
		"\5/\u039f\n/\3/\5/\u03a2\n/\3/\3/\3/\3/\3/\3/\5/\u03aa\n/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\5/\u03c8\n/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u03d3\n/\3/\3/\3/\3/\3/"+
		"\3/\7/\u03db\n/\f/\16/\u03de\13/\5/\u03e0\n/\3/\3/\3/\3/\5/\u03e6\n/\3"+
		"/\5/\u03e9\n/\7/\u03eb\n/\f/\16/\u03ee\13/\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\5\60\u0404\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\5\60\u0411\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\7\60\u042b\n\60\f\60\16\60\u042e\13\60\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\5\61\u0444\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\5\61\u0455\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\7\61\u046f\n\61\f\61\16\61\u0472\13\61\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0480\n\62\3\63\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u048c\n\64\3\64\3\64\3\64"+
		"\5\64\u0491\n\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u049a\n\64\3"+
		"\64\3\64\3\64\7\64\u049f\n\64\f\64\16\64\u04a2\13\64\3\64\5\64\u04a5\n"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\5\64\u04b6\n\64\3\64\5\64\u04b9\n\64\3\64\3\64\3\64\3\64\5\64"+
		"\u04bf\n\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\5\64\u04dd\n\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\5\64\u04e8\n\64\3\64\3\64\3\64\3\64\3\64\3\64\7\64\u04f0\n\64\f\64\16"+
		"\64\u04f3\13\64\5\64\u04f5\n\64\3\64\3\64\3\64\3\64\5\64\u04fb\n\64\3"+
		"\64\5\64\u04fe\n\64\7\64\u0500\n\64\f\64\16\64\u0503\13\64\3\65\3\65\3"+
		"\65\3\65\5\65\u0509\n\65\3\65\3\65\3\65\3\65\3\65\7\65\u0510\n\65\f\65"+
		"\16\65\u0513\13\65\3\65\3\65\5\65\u0517\n\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\5\65\u0523\n\65\3\65\3\65\5\65\u0527\n\65\7"+
		"\65\u0529\n\65\f\65\16\65\u052c\13\65\3\65\5\65\u052f\n\65\3\65\3\65\3"+
		"\65\3\65\3\65\5\65\u0536\n\65\3\65\5\65\u0539\n\65\5\65\u053b\n\65\3\66"+
		"\3\66\3\67\3\67\3\67\5\67\u0542\n\67\3\67\5\67\u0545\n\67\38\38\58\u0549"+
		"\n8\38\38\38\38\38\38\38\38\38\58\u0554\n8\39\39\39\39\39\39\79\u055c"+
		"\n9\f9\169\u055f\139\39\39\3:\3:\3:\3:\3:\3:\7:\u0569\n:\f:\16:\u056c"+
		"\13:\3:\3:\3:\3;\3;\5;\u0573\n;\3;\5;\u0576\n;\3;\3;\3;\3;\7;\u057c\n"+
		";\f;\16;\u057f\13;\3;\3;\3<\3<\5<\u0585\n<\3<\3<\3<\3<\7<\u058b\n<\f<"+
		"\16<\u058e\13<\3<\3<\3=\3=\3>\3>\3>\5>\u0597\n>\3>\3>\3>\3>\3>\3>\5>\u059f"+
		"\n>\3?\3?\5?\u05a3\n?\3@\3@\3@\5@\u05a8\n@\3A\3A\3A\3A\3A\7A\u05af\nA"+
		"\fA\16A\u05b2\13A\3A\3A\5A\u05b6\nA\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3"+
		"B\5B\u05c4\nB\3B\5B\u05c7\nB\5B\u05c9\nB\3C\3C\3C\5C\u05ce\nC\3C\3C\5"+
		"C\u05d2\nC\3C\5C\u05d5\nC\3C\3C\3C\3C\3C\5C\u05dc\nC\3C\3C\3C\3C\7C\u05e2"+
		"\nC\fC\16C\u05e5\13C\3C\5C\u05e8\nC\3C\3C\5C\u05ec\nC\3C\5C\u05ef\nC\3"+
		"C\3C\3C\3C\5C\u05f5\nC\3C\5C\u05f8\nC\5C\u05fa\nC\3D\3D\3D\3D\3D\7D\u0601"+
		"\nD\fD\16D\u0604\13D\3E\3E\3E\5E\u0609\nE\3E\5E\u060c\nE\3E\5E\u060f\n"+
		"E\3F\5F\u0612\nF\3F\5F\u0615\nF\3G\3G\5G\u0619\nG\3G\3G\3G\7G\u061e\n"+
		"G\fG\16G\u0621\13G\3G\3G\3G\3G\7G\u0627\nG\fG\16G\u062a\13G\3G\5G\u062d"+
		"\nG\5G\u062f\nG\3G\3G\5G\u0633\nG\3G\3G\3G\7G\u0638\nG\fG\16G\u063b\13"+
		"G\3G\5G\u063e\nG\5G\u0640\nG\3G\3G\3G\3G\3G\7G\u0647\nG\fG\16G\u064a\13"+
		"G\3G\3G\3G\3G\3G\3G\7G\u0652\nG\fG\16G\u0655\13G\3G\3G\7G\u0659\nG\fG"+
		"\16G\u065c\13G\5G\u065e\nG\3H\3H\3H\3H\3I\3I\3I\3J\3J\3J\3J\3J\7J\u066c"+
		"\nJ\fJ\16J\u066f\13J\3J\3J\5J\u0673\nJ\3K\5K\u0676\nK\3K\3K\5K\u067a\n"+
		"K\3L\3L\3M\3M\3N\3N\3O\3O\5O\u0684\nO\3P\3P\3Q\3Q\3R\6R\u068b\nR\rR\16"+
		"R\u068c\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\"+
		"\3]\3]\3^\3^\3_\3_\3`\3`\3a\3a\3b\3b\3c\3c\3d\3d\3e\3e\3e\3e\3e\3e\5e"+
		"\u06b9\ne\3f\3f\3f\3f\3f\3f\3f\5f\u06c2\nf\3f\2\6\\^`fg\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\u00c6\u00c8\u00ca\2\21\3\2\u00b4\u00b5\4\2\f\f\u0082\u0082\4\2"+
		"\60\60RR\4\2\65\65PP\4\2\16\16\25\26\4\2\17\17\21\21\3\2\27\32\3\2\33"+
		"\36\4\2\37\37&&\4\2\20\20\22\22\4\2OO\u00a7\u00a7\6\2HJ\u0080\u0080\u00b9"+
		"\u00b9\u00bb\u00bc\6\2\17\17\21\21\23\23~~\4\2\u00b7\u00b7\u00bb\u00bb"+
		"\13\2,:<RTbd\u0083\u0085\u008a\u008c\u0095\u0097\u009c\u009e\u00ae\u00b0"+
		"\u00b1\2\u07a5\2\u00d1\3\2\2\2\4\u00d6\3\2\2\2\6\u00dc\3\2\2\2\b\u00f6"+
		"\3\2\2\2\n\u0101\3\2\2\2\f\u0104\3\2\2\2\16\u012c\3\2\2\2\20\u0132\3\2"+
		"\2\2\22\u0148\3\2\2\2\24\u0151\3\2\2\2\26\u0159\3\2\2\2\30\u0164\3\2\2"+
		"\2\32\u0167\3\2\2\2\34\u017b\3\2\2\2\36\u0187\3\2\2\2 \u01c3\3\2\2\2\""+
		"\u01c5\3\2\2\2$\u01d0\3\2\2\2&\u01d7\3\2\2\2(\u01dc\3\2\2\2*\u01eb\3\2"+
		"\2\2,\u01f6\3\2\2\2.\u01fb\3\2\2\2\60\u0203\3\2\2\2\62\u0243\3\2\2\2\64"+
		"\u0253\3\2\2\2\66\u0275\3\2\2\28\u0288\3\2\2\2:\u0297\3\2\2\2<\u0299\3"+
		"\2\2\2>\u029b\3\2\2\2@\u029d\3\2\2\2B\u029f\3\2\2\2D\u02aa\3\2\2\2F\u02bf"+
		"\3\2\2\2H\u031b\3\2\2\2J\u031d\3\2\2\2L\u0325\3\2\2\2N\u033d\3\2\2\2P"+
		"\u034e\3\2\2\2R\u0356\3\2\2\2T\u0358\3\2\2\2V\u035b\3\2\2\2X\u035d\3\2"+
		"\2\2Z\u0375\3\2\2\2\\\u03a9\3\2\2\2^\u0410\3\2\2\2`\u0454\3\2\2\2b\u047f"+
		"\3\2\2\2d\u0481\3\2\2\2f\u04be\3\2\2\2h\u0504\3\2\2\2j\u053c\3\2\2\2l"+
		"\u053e\3\2\2\2n\u0548\3\2\2\2p\u0555\3\2\2\2r\u0562\3\2\2\2t\u0570\3\2"+
		"\2\2v\u0582\3\2\2\2x\u0591\3\2\2\2z\u0596\3\2\2\2|\u05a0\3\2\2\2~\u05a7"+
		"\3\2\2\2\u0080\u05a9\3\2\2\2\u0082\u05c8\3\2\2\2\u0084\u05f9\3\2\2\2\u0086"+
		"\u05fb\3\2\2\2\u0088\u060e\3\2\2\2\u008a\u0614\3\2\2\2\u008c\u065d\3\2"+
		"\2\2\u008e\u065f\3\2\2\2\u0090\u0663\3\2\2\2\u0092\u0666\3\2\2\2\u0094"+
		"\u0679\3\2\2\2\u0096\u067b\3\2\2\2\u0098\u067d\3\2\2\2\u009a\u067f\3\2"+
		"\2\2\u009c\u0683\3\2\2\2\u009e\u0685\3\2\2\2\u00a0\u0687\3\2\2\2\u00a2"+
		"\u068a\3\2\2\2\u00a4\u068e\3\2\2\2\u00a6\u0690\3\2\2\2\u00a8\u0692\3\2"+
		"\2\2\u00aa\u0694\3\2\2\2\u00ac\u0696\3\2\2\2\u00ae\u0698\3\2\2\2\u00b0"+
		"\u069a\3\2\2\2\u00b2\u069c\3\2\2\2\u00b4\u069e\3\2\2\2\u00b6\u06a0\3\2"+
		"\2\2\u00b8\u06a2\3\2\2\2\u00ba\u06a4\3\2\2\2\u00bc\u06a6\3\2\2\2\u00be"+
		"\u06a8\3\2\2\2\u00c0\u06aa\3\2\2\2\u00c2\u06ac\3\2\2\2\u00c4\u06ae\3\2"+
		"\2\2\u00c6\u06b0\3\2\2\2\u00c8\u06b8\3\2\2\2\u00ca\u06c1\3\2\2\2\u00cc"+
		"\u00d0\5\n\6\2\u00cd\u00d0\5\6\4\2\u00ce\u00d0\5\4\3\2\u00cf\u00cc\3\2"+
		"\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d4\u00d5\7\2\2\3\u00d5\3\3\2\2\2\u00d6\u00d7\7\u00c0\2\2\u00d7"+
		"\u00d8\b\3\1\2\u00d8\5\3\2\2\2\u00d9\u00db\7\5\2\2\u00da\u00d9\3\2\2\2"+
		"\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df"+
		"\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e8\5\b\5\2\u00e0\u00e2\7\5\2\2\u00e1"+
		"\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\5\b\5\2\u00e6\u00e1\3\2\2\2\u00e7"+
		"\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ee\3\2"+
		"\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ed\7\5\2\2\u00ec\u00eb\3\2\2\2\u00ed"+
		"\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\7\3\2\2\2"+
		"\u00f0\u00ee\3\2\2\2\u00f1\u00f4\7]\2\2\u00f2\u00f3\7\u008c\2\2\u00f3"+
		"\u00f5\7\u0088\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7"+
		"\3\2\2\2\u00f6\u00f1\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00fc\3\2\2\2\u00f8"+
		"\u00fd\5\66\34\2\u00f9\u00fd\5\64\33\2\u00fa\u00fd\58\35\2\u00fb\u00fd"+
		"\5D#\2\u00fc\u00f8\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc"+
		"\u00fb\3\2\2\2\u00fd\t\3\2\2\2\u00fe\u0102\5\f\7\2\u00ff\u0102\5\20\t"+
		"\2\u0100\u0102\5\62\32\2\u0101\u00fe\3\2\2\2\u0101\u00ff\3\2\2\2\u0101"+
		"\u0100\3\2\2\2\u0102\13\3\2\2\2\u0103\u0105\7\u00b2\2\2\u0104\u0103\3"+
		"\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0108\7c\2\2\u0107"+
		"\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\5\u00c8"+
		"e\2\u010a\u0115\7\7\2\2\u010b\u010c\7\u00b2\2\2\u010c\u0112\5\u00c8e\2"+
		"\u010d\u010e\7\f\2\2\u010e\u010f\7\u00b2\2\2\u010f\u0111\5\u00c8e\2\u0110"+
		"\u010d\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2"+
		"\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u010b\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\7\b\2\2\u0118\u0119\7\t"+
		"\2\2\u0119\u011a\5\16\b\2\u011a\u011b\7\n\2\2\u011b\r\3\2\2\2\u011c\u012b"+
		"\5\22\n\2\u011d\u012b\5\26\f\2\u011e\u012b\5\32\16\2\u011f\u012b\5\"\22"+
		"\2\u0120\u012b\5$\23\2\u0121\u012b\5(\25\2\u0122\u012b\5\60\31\2\u0123"+
		"\u012b\5 \21\2\u0124\u0125\5\6\4\2\u0125\u0126\7\5\2\2\u0126\u012b\3\2"+
		"\2\2\u0127\u012b\5\20\t\2\u0128\u012b\5\62\32\2\u0129\u012b\5\24\13\2"+
		"\u012a\u011c\3\2\2\2\u012a\u011d\3\2\2\2\u012a\u011e\3\2\2\2\u012a\u011f"+
		"\3\2\2\2\u012a\u0120\3\2\2\2\u012a\u0121\3\2\2\2\u012a\u0122\3\2\2\2\u012a"+
		"\u0123\3\2\2\2\u012a\u0124\3\2\2\2\u012a\u0127\3\2\2\2\u012a\u0128\3\2"+
		"\2\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0131\5."+
		"\30\2\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131\17\3\2\2\2\u0132\u0133"+
		"\7\u00b2\2\2\u0133\u0134\7\u00b7\2\2\u0134\u0137\7\r\2\2\u0135\u0138\7"+
		"c\2\2\u0136\u0138\5\u00c8e\2\u0137\u0135\3\2\2\2\u0137\u0136\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\u0142\7\7\2\2\u013a\u013f\5\u00c8e\2\u013b\u013c"+
		"\7\f\2\2\u013c\u013e\5\u00c8e\2\u013d\u013b\3\2\2\2\u013e\u0141\3\2\2"+
		"\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f"+
		"\3\2\2\2\u0142\u013a\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0145\7\b\2\2\u0145\u0146\7\5\2\2\u0146\21\3\2\2\2\u0147\u0149\7\u00b2"+
		"\2\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014d\5\u00c8e\2\u014b\u014c\7\r\2\2\u014c\u014e\5\\/\2\u014d\u014b\3"+
		"\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\7\5\2\2\u0150"+
		"\23\3\2\2\2\u0151\u0155\5b\62\2\u0152\u0154\7\5\2\2\u0153\u0152\3\2\2"+
		"\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\25"+
		"\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u015a\7\u00b2\2\2\u0159\u0158\3\2\2"+
		"\2\u0159\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\7\u008b\2\2\u015c"+
		"\u015d\7\7\2\2\u015d\u015e\5\30\r\2\u015e\u015f\7\b\2\2\u015f\u0160\7"+
		"\5\2\2\u0160\27\3\2\2\2\u0161\u0163\5f\64\2\u0162\u0161\3\2\2\2\u0163"+
		"\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\31\3\2\2"+
		"\2\u0166\u0164\3\2\2\2\u0167\u0168\7g\2\2\u0168\u0169\7\7\2\2\u0169\u016a"+
		"\5`\61\2\u016a\u0170\7\b\2\2\u016b\u016c\7\t\2\2\u016c\u016d\5\16\b\2"+
		"\u016d\u016e\7\n\2\2\u016e\u0171\3\2\2\2\u016f\u0171\5\16\b\2\u0170\u016b"+
		"\3\2\2\2\u0170\u016f\3\2\2\2\u0171\u0175\3\2\2\2\u0172\u0174\5\34\17\2"+
		"\u0173\u0172\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176"+
		"\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u017a\5\36\20\2"+
		"\u0179\u0178\3\2\2\2\u0179\u017a\3\2\2\2\u017a\33\3\2\2\2\u017b\u017c"+
		"\7V\2\2\u017c\u017d\7g\2\2\u017d\u017e\7\7\2\2\u017e\u017f\5`\61\2\u017f"+
		"\u0185\7\b\2\2\u0180\u0181\7\t\2\2\u0181\u0182\5\16\b\2\u0182\u0183\7"+
		"\n\2\2\u0183\u0186\3\2\2\2\u0184\u0186\5\16\b\2\u0185\u0180\3\2\2\2\u0185"+
		"\u0184\3\2\2\2\u0186\35\3\2\2\2\u0187\u018d\7V\2\2\u0188\u0189\7\t\2\2"+
		"\u0189\u018a\5\16\b\2\u018a\u018b\7\n\2\2\u018b\u018e\3\2\2\2\u018c\u018e"+
		"\5\16\b\2\u018d\u0188\3\2\2\2\u018d\u018c\3\2\2\2\u018e\37\3\2\2\2\u018f"+
		"\u0190\5`\61\2\u0190\u0193\7*\2\2\u0191\u0194\5\\/\2\u0192\u0194\5b\62"+
		"\2\u0193\u0191\3\2\2\2\u0193\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0198"+
		"\7+\2\2\u0196\u0199\5\\/\2\u0197\u0199\5b\62\2\u0198\u0196\3\2\2\2\u0198"+
		"\u0197\3\2\2\2\u0199\u019d\3\2\2\2\u019a\u019c\7\5\2\2\u019b\u019a\3\2"+
		"\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"\u01c4\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a1\5`\61\2\u01a1\u01a5\7*"+
		"\2\2\u01a2\u01a4\7\7\2\2\u01a3\u01a2\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5"+
		"\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a8\3\2\2\2\u01a7\u01a5\3\2"+
		"\2\2\u01a8\u01ac\5 \21\2\u01a9\u01ab\7\b\2\2\u01aa\u01a9\3\2\2\2\u01ab"+
		"\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\3\2"+
		"\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b3\7+\2\2\u01b0\u01b2\7\7\2\2\u01b1"+
		"\u01b0\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2"+
		"\2\2\u01b4\u01b6\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01ba\5 \21\2\u01b7"+
		"\u01b9\7\b\2\2\u01b8\u01b7\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2"+
		"\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01c0\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd"+
		"\u01bf\7\5\2\2\u01be\u01bd\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be\3\2"+
		"\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3"+
		"\u018f\3\2\2\2\u01c3\u01a0\3\2\2\2\u01c4!\3\2\2\2\u01c5\u01c6\7\u00af"+
		"\2\2\u01c6\u01c7\7\7\2\2\u01c7\u01c8\5^\60\2\u01c8\u01ce\7\b\2\2\u01c9"+
		"\u01ca\7\t\2\2\u01ca\u01cb\5\16\b\2\u01cb\u01cc\7\n\2\2\u01cc\u01cf\3"+
		"\2\2\2\u01cd\u01cf\5\16\b\2\u01ce\u01c9\3\2\2\2\u01ce\u01cd\3\2\2\2\u01cf"+
		"#\3\2\2\2\u01d0\u01d1\7S\2\2\u01d1\u01d2\7\t\2\2\u01d2\u01d3\5\16\b\2"+
		"\u01d3\u01d4\7\n\2\2\u01d4\u01d5\5&\24\2\u01d5\u01d6\7\5\2\2\u01d6%\3"+
		"\2\2\2\u01d7\u01d8\7\u00af\2\2\u01d8\u01d9\7\7\2\2\u01d9\u01da\5^\60\2"+
		"\u01da\u01db\7\b\2\2\u01db\'\3\2\2\2\u01dc\u01dd\7_\2\2\u01dd\u01e0\7"+
		"\7\2\2\u01de\u01e1\5*\26\2\u01df\u01e1\5,\27\2\u01e0\u01de\3\2\2\2\u01e0"+
		"\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e8\7\b\2\2\u01e3\u01e4\7\t"+
		"\2\2\u01e4\u01e5\5\16\b\2\u01e5\u01e6\7\n\2\2\u01e6\u01e9\3\2\2\2\u01e7"+
		"\u01e9\5\16\b\2\u01e8\u01e3\3\2\2\2\u01e8\u01e7\3\2\2\2\u01e9)\3\2\2\2"+
		"\u01ea\u01ec\7\u00b2\2\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec"+
		"\u01ee\3\2\2\2\u01ed\u01ef\5b\62\2\u01ee\u01ed\3\2\2\2\u01ee\u01ef\3\2"+
		"\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\7\5\2\2\u01f1\u01f2\5`\61\2\u01f2"+
		"\u01f4\7\5\2\2\u01f3\u01f5\5b\62\2\u01f4\u01f3\3\2\2\2\u01f4\u01f5\3\2"+
		"\2\2\u01f5+\3\2\2\2\u01f6\u01f7\7\u00b2\2\2\u01f7\u01f8\5\u00c8e\2\u01f8"+
		"\u01f9\7+\2\2\u01f9\u01fa\5\u00c8e\2\u01fa-\3\2\2\2\u01fb\u01ff\7\u0096"+
		"\2\2\u01fc\u0200\5\\/\2\u01fd\u0200\5\24\13\2\u01fe\u0200\5 \21\2\u01ff"+
		"\u01fc\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u01fe\3\2\2\2\u0200\u0201\3\2"+
		"\2\2\u0201\u0202\7\5\2\2\u0202/\3\2\2\2\u0203\u0204\7\u009d\2\2\u0204"+
		"\u0205\7\7\2\2\u0205\u0206\5\u00c8e\2\u0206\u0207\7\b\2\2\u0207\u0224"+
		"\7\t\2\2\u0208\u020b\7>\2\2\u0209\u020c\5\u0096L\2\u020a\u020c\5\u00c8"+
		"e\2\u020b\u0209\3\2\2\2\u020b\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d"+
		"\u021c\7+\2\2\u020e\u021d\5\16\b\2\u020f\u0210\7\t\2\2\u0210\u0213\5\16"+
		"\b\2\u0211\u0212\7;\2\2\u0212\u0214\7\5\2\2\u0213\u0211\3\2\2\2\u0213"+
		"\u0214\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0219\7\n\2\2\u0216\u0218\7\5"+
		"\2\2\u0217\u0216\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217\3\2\2\2\u0219"+
		"\u021a\3\2\2\2\u021a\u021d\3\2\2\2\u021b\u0219\3\2\2\2\u021c\u020e\3\2"+
		"\2\2\u021c\u020f\3\2\2\2\u021d\u0220\3\2\2\2\u021e\u021f\7;\2\2\u021f"+
		"\u0221\7\5\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0223\3\2"+
		"\2\2\u0222\u0208\3\2\2\2\u0223\u0226\3\2\2\2\u0224\u0222\3\2\2\2\u0224"+
		"\u0225\3\2\2\2\u0225\u023d\3\2\2\2\u0226\u0224\3\2\2\2\u0227\u0228\7L"+
		"\2\2\u0228\u0237\7+\2\2\u0229\u0238\5\16\b\2\u022a\u022b\7\t\2\2\u022b"+
		"\u022e\5\16\b\2\u022c\u022d\7;\2\2\u022d\u022f\7\5\2\2\u022e\u022c\3\2"+
		"\2\2\u022e\u022f\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0234\7\n\2\2\u0231"+
		"\u0233\7\5\2\2\u0232\u0231\3\2\2\2\u0233\u0236\3\2\2\2\u0234\u0232\3\2"+
		"\2\2\u0234\u0235\3\2\2\2\u0235\u0238\3\2\2\2\u0236\u0234\3\2\2\2\u0237"+
		"\u0229\3\2\2\2\u0237\u022a\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u023b\3\2"+
		"\2\2\u0239\u023a\7;\2\2\u023a\u023c\7\5\2\2\u023b\u0239\3\2\2\2\u023b"+
		"\u023c\3\2\2\2\u023c\u023e\3\2\2\2\u023d\u0227\3\2\2\2\u023d\u023e\3\2"+
		"\2\2\u023e\u023f\3\2\2\2\u023f\u0240\7\n\2\2\u0240\61\3\2\2\2\u0241\u0244"+
		"\7c\2\2\u0242\u0244\5\u00c8e\2\u0243\u0241\3\2\2\2\u0243\u0242\3\2\2\2"+
		"\u0244\u0245\3\2\2\2\u0245\u024e\7\7\2\2\u0246\u024b\5\u00c8e\2\u0247"+
		"\u0248\7\f\2\2\u0248\u024a\5\u00c8e\2\u0249\u0247\3\2\2\2\u024a\u024d"+
		"\3\2\2\2\u024b\u0249\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024f\3\2\2\2\u024d"+
		"\u024b\3\2\2\2\u024e\u0246\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0250\3\2"+
		"\2\2\u0250\u0251\7\b\2\2\u0251\u0252\7\5\2\2\u0252\63\3\2\2\2\u0253\u0254"+
		"\7F\2\2\u0254\u0258\7\u009e\2\2\u0255\u0256\7g\2\2\u0256\u0257\7~\2\2"+
		"\u0257\u0259\7\\\2\2\u0258\u0255\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025d"+
		"\3\2\2\2\u025a\u025b\5\u00a8U\2\u025b\u025c\7\6\2\2\u025c\u025e\3\2\2"+
		"\2\u025d\u025a\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0260"+
		"\5\u00acW\2\u0260\u0261\7\7\2\2\u0261\u0268\5J&\2\u0262\u0263\7\f\2\2"+
		"\u0263\u0267\5n8\2\u0264\u0265\7\f\2\2\u0265\u0267\5J&\2\u0266\u0262\3"+
		"\2\2\2\u0266\u0264\3\2\2\2\u0267\u026a\3\2\2\2\u0268\u0266\3\2\2\2\u0268"+
		"\u0269\3\2\2\2\u0269\u026b\3\2\2\2\u026a\u0268\3\2\2\2\u026b\u0273\7\b"+
		"\2\2\u026c\u026d\7\u00b3\2\2\u026d\u026e\7\r\2\2\u026e\u026f\t\2\2\2\u026f"+
		"\u0270\7\f\2\2\u0270\u0271\7\3\2\2\u0271\u0272\7\r\2\2\u0272\u0274\5\u00c8"+
		"e\2\u0273\u026c\3\2\2\2\u0273\u0274\3\2\2\2\u0274\65\3\2\2\2\u0275\u0276"+
		"\7F\2\2\u0276\u027a\7\u00b3\2\2\u0277\u0278\7g\2\2\u0278\u0279\7~\2\2"+
		"\u0279\u027b\7\\\2\2\u027a\u0277\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027c"+
		"\3\2\2\2\u027c\u027d\5\u00c8e\2\u027d\u027e\7\7\2\2\u027e\u0283\5J&\2"+
		"\u027f\u0280\7\f\2\2\u0280\u0282\5J&\2\u0281\u027f\3\2\2\2\u0282\u0285"+
		"\3\2\2\2\u0283\u0281\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0286\3\2\2\2\u0285"+
		"\u0283\3\2\2\2\u0286\u0287\7\b\2\2\u0287\67\3\2\2\2\u0288\u0289\7F\2\2"+
		"\u0289\u028a\7\u00b6\2\2\u028a\u028b\5\u00c8e\2\u028b\u028c\7\7\2\2\u028c"+
		"\u028d\5:\36\2\u028d\u028e\7\f\2\2\u028e\u028f\5<\37\2\u028f\u0290\7\f"+
		"\2\2\u0290\u0291\5> \2\u0291\u0292\7\f\2\2\u0292\u0293\5@!\2\u0293\u0294"+
		"\7\f\2\2\u0294\u0295\5B\"\2\u0295\u0296\7\b\2\2\u02969\3\2\2\2\u0297\u0298"+
		"\5\u00c8e\2\u0298;\3\2\2\2\u0299\u029a\5\u00c8e\2\u029a=\3\2\2\2\u029b"+
		"\u029c\5\u00c8e\2\u029c?\3\2\2\2\u029d\u029e\5\u00c8e\2\u029eA\3\2\2\2"+
		"\u029f\u02a0\7(\2\2\u02a0\u02a5\5\u00c8e\2\u02a1\u02a2\7\f\2\2\u02a2\u02a4"+
		"\5\u00c8e\2\u02a3\u02a1\3\2\2\2\u02a4\u02a7\3\2\2\2\u02a5\u02a3\3\2\2"+
		"\2\u02a5\u02a6\3\2\2\2\u02a6\u02a8\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a8\u02a9"+
		"\7)\2\2\u02a9C\3\2\2\2\u02aa\u02b5\5\u008cG\2\u02ab\u02ac\7\u0086\2\2"+
		"\u02ac\u02ad\7<\2\2\u02ad\u02b2\5|?\2\u02ae\u02af\7\f\2\2\u02af\u02b1"+
		"\5|?\2\u02b0\u02ae\3\2\2\2\u02b1\u02b4\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b2"+
		"\u02b3\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b5\u02ab\3\2"+
		"\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02bd\3\2\2\2\u02b7\u02b8\7y\2\2\u02b8"+
		"\u02bb\5\\/\2\u02b9\u02ba\t\3\2\2\u02ba\u02bc\5\\/\2\u02bb\u02b9\3\2\2"+
		"\2\u02bb\u02bc\3\2\2\2\u02bc\u02be\3\2\2\2\u02bd\u02b7\3\2\2\2\u02bd\u02be"+
		"\3\2\2\2\u02beE\3\2\2\2\u02bf\u02ca\5H%\2\u02c0\u02c1\7\u0086\2\2\u02c1"+
		"\u02c2\7<\2\2\u02c2\u02c7\5|?\2\u02c3\u02c4\7\f\2\2\u02c4\u02c6\5|?\2"+
		"\u02c5\u02c3\3\2\2\2\u02c6\u02c9\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c7\u02c8"+
		"\3\2\2\2\u02c8\u02cb\3\2\2\2\u02c9\u02c7\3\2\2\2\u02ca\u02c0\3\2\2\2\u02ca"+
		"\u02cb\3\2\2\2\u02cb\u02d2\3\2\2\2\u02cc\u02cd\7y\2\2\u02cd\u02d0\5\\"+
		"/\2\u02ce\u02cf\t\3\2\2\u02cf\u02d1\5\\/\2\u02d0\u02ce\3\2\2\2\u02d0\u02d1"+
		"\3\2\2\2\u02d1\u02d3\3\2\2\2\u02d2\u02cc\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3"+
		"G\3\2\2\2\u02d4\u02d6\7\u009b\2\2\u02d5\u02d7\t\4\2\2\u02d6\u02d5\3\2"+
		"\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02dd\5\u0082B\2\u02d9"+
		"\u02da\7\f\2\2\u02da\u02dc\5\u0082B\2\u02db\u02d9\3\2\2\2\u02dc\u02df"+
		"\3\2\2\2\u02dd\u02db\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02ec\3\2\2\2\u02df"+
		"\u02dd\3\2\2\2\u02e0\u02ea\7a\2\2\u02e1\u02e6\5\u0084C\2\u02e2\u02e3\7"+
		"\f\2\2\u02e3\u02e5\5\u0084C\2\u02e4\u02e2\3\2\2\2\u02e5\u02e8\3\2\2\2"+
		"\u02e6\u02e4\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02eb\3\2\2\2\u02e8\u02e6"+
		"\3\2\2\2\u02e9\u02eb\5\u0086D\2\u02ea\u02e1\3\2\2\2\u02ea\u02e9\3\2\2"+
		"\2\u02eb\u02ed\3\2\2\2\u02ec\u02e0\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02f0"+
		"\3\2\2\2\u02ee\u02ef\7\u00ae\2\2\u02ef\u02f1\5\\/\2\u02f0\u02ee\3\2\2"+
		"\2\u02f0\u02f1\3\2\2\2\u02f1\u02fd\3\2\2\2\u02f2\u02f7\5\u008eH\2\u02f3"+
		"\u02f4\7\f\2\2\u02f4\u02f6\5\\/\2\u02f5\u02f3\3\2\2\2\u02f6\u02f9\3\2"+
		"\2\2\u02f7\u02f5\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02fb\3\2\2\2\u02f9"+
		"\u02f7\3\2\2\2\u02fa\u02fc\5\u0090I\2\u02fb\u02fa\3\2\2\2\u02fb\u02fc"+
		"\3\2\2\2\u02fc\u02fe\3\2\2\2\u02fd\u02f2\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe"+
		"\u031c\3\2\2\2\u02ff\u0300\7\u00aa\2\2\u0300\u0301\7\7\2\2\u0301\u0306"+
		"\5\\/\2\u0302\u0303\7\f\2\2\u0303\u0305\5\\/\2\u0304\u0302\3\2\2\2\u0305"+
		"\u0308\3\2\2\2\u0306\u0304\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0309\3\2"+
		"\2\2\u0308\u0306\3\2\2\2\u0309\u0318\7\b\2\2\u030a\u030b\7\f\2\2\u030b"+
		"\u030c\7\7\2\2\u030c\u0311\5\\/\2\u030d\u030e\7\f\2\2\u030e\u0310\5\\"+
		"/\2\u030f\u030d\3\2\2\2\u0310\u0313\3\2\2\2\u0311\u030f\3\2\2\2\u0311"+
		"\u0312\3\2\2\2\u0312\u0314\3\2\2\2\u0313\u0311\3\2\2\2\u0314\u0315\7\b"+
		"\2\2\u0315\u0317\3\2\2\2\u0316\u030a\3\2\2\2\u0317\u031a\3\2\2\2\u0318"+
		"\u0316\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031c\3\2\2\2\u031a\u0318\3\2"+
		"\2\2\u031b\u02d4\3\2\2\2\u031b\u02ff\3\2\2\2\u031cI\3\2\2\2\u031d\u0322"+
		"\5\u00b2Z\2\u031e\u0321\5N(\2\u031f\u0321\5L\'\2\u0320\u031e\3\2\2\2\u0320"+
		"\u031f\3\2\2\2\u0321\u0324\3\2\2\2\u0322\u0320\3\2\2\2\u0322\u0323\3\2"+
		"\2\2\u0323K\3\2\2\2\u0324\u0322\3\2\2\2\u0325\u0339\5\u00a4S\2\u0326\u0327"+
		"\7\7\2\2\u0327\u0329\5\u0094K\2\u0328\u032a\5\u00c8e\2\u0329\u0328\3\2"+
		"\2\2\u0329\u032a\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032c\7\b\2\2\u032c"+
		"\u033a\3\2\2\2\u032d\u032e\7\7\2\2\u032e\u0330\5\u0094K\2\u032f\u0331"+
		"\5\u00c8e\2\u0330\u032f\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0332\3\2\2"+
		"\2\u0332\u0333\7\f\2\2\u0333\u0335\5\u0094K\2\u0334\u0336\5\u00c8e\2\u0335"+
		"\u0334\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0338\7\b"+
		"\2\2\u0338\u033a\3\2\2\2\u0339\u0326\3\2\2\2\u0339\u032d\3\2\2\2\u0339"+
		"\u033a\3\2\2\2\u033aM\3\2\2\2\u033b\u033c\7E\2\2\u033c\u033e\5\u00a4S"+
		"\2\u033d\u033b\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u034c\3\2\2\2\u033f\u034d"+
		"\5P)\2\u0340\u034d\5R*\2\u0341\u034d\5T+\2\u0342\u034d\5V,\2\u0343\u034d"+
		"\7\u00a6\2\2\u0344\u0345\7@\2\2\u0345\u0346\7\7\2\2\u0346\u0347\5\\/\2"+
		"\u0347\u0348\7\b\2\2\u0348\u034d\3\2\2\2\u0349\u034d\5X-\2\u034a\u034b"+
		"\7A\2\2\u034b\u034d\5\u00b4[\2\u034c\u033f\3\2\2\2\u034c\u0340\3\2\2\2"+
		"\u034c\u0341\3\2\2\2\u034c\u0342\3\2\2\2\u034c\u0343\3\2\2\2\u034c\u0344"+
		"\3\2\2\2\u034c\u0349\3\2\2\2\u034c\u034a\3\2\2\2\u034dO\3\2\2\2\u034e"+
		"\u034f\7\u008a\2\2\u034f\u0351\7v\2\2\u0350\u0352\t\5\2\2\u0351\u0350"+
		"\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0354\3\2\2\2\u0353\u0355\7\67\2\2"+
		"\u0354\u0353\3\2\2\2\u0354\u0355\3\2\2\2\u0355Q\3\2\2\2\u0356\u0357\5"+
		"h\65\2\u0357S\3\2\2\2\u0358\u0359\7~\2\2\u0359\u035a\7\u0080\2\2\u035a"+
		"U\3\2\2\2\u035b\u035c\7\u0080\2\2\u035cW\3\2\2\2\u035d\u0369\7L\2\2\u035e"+
		"\u036a\5Z.\2\u035f\u0360\7\7\2\2\u0360\u0361\5\\/\2\u0361\u0362\7\b\2"+
		"\2\u0362\u036a\3\2\2\2\u0363\u0364\7|\2\2\u0364\u0365\7\7\2\2\u0365\u0366"+
		"\5\\/\2\u0366\u0367\7\b\2\2\u0367\u036a\3\2\2\2\u0368\u036a\5\u00c8e\2"+
		"\u0369\u035e\3\2\2\2\u0369\u035f\3\2\2\2\u0369\u0363\3\2\2\2\u0369\u0368"+
		"\3\2\2\2\u036a\u0371\3\2\2\2\u036b\u036d\7\4\2\2\u036c\u036e\5\u00c8e"+
		"\2\u036d\u036c\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u036d\3\2\2\2\u036f\u0370"+
		"\3\2\2\2\u0370\u0372\3\2\2\2\u0371\u036b\3\2\2\2\u0371\u0372\3\2\2\2\u0372"+
		"Y\3\2\2\2\u0373\u0376\5\u0094K\2\u0374\u0376\5\u0096L\2\u0375\u0373\3"+
		"\2\2\2\u0375\u0374\3\2\2\2\u0376[\3\2\2\2\u0377\u0378\b/\1\2\u0378\u03aa"+
		"\5\u0096L\2\u0379\u037a\5\u00a8U\2\u037a\u037b\7\6\2\2\u037b\u037d\3\2"+
		"\2\2\u037c\u0379\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u037e\3\2\2\2\u037e"+
		"\u037f\5\u00acW\2\u037f\u0380\7\6\2\2\u0380\u0382\3\2\2\2\u0381\u037c"+
		"\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u03aa\5\u00b2Z"+
		"\2\u0384\u0385\5\u0098M\2\u0385\u0386\5\\/\21\u0386\u03aa\3\2\2\2\u0387"+
		"\u0388\5\u00a6T\2\u0388\u0395\7\7\2\2\u0389\u038b\7R\2\2\u038a\u0389\3"+
		"\2\2\2\u038a\u038b\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u0391\5\\/\2\u038d"+
		"\u038e\7\f\2\2\u038e\u0390\5\\/\2\u038f\u038d\3\2\2\2\u0390\u0393\3\2"+
		"\2\2\u0391\u038f\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u0396\3\2\2\2\u0393"+
		"\u0391\3\2\2\2\u0394\u0396\7\16\2\2\u0395\u038a\3\2\2\2\u0395\u0394\3"+
		"\2\2\2\u0395\u0396\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u0398\7\b\2\2\u0398"+
		"\u03aa\3\2\2\2\u0399\u039a\7\7\2\2\u039a\u039b\5\\/\2\u039b\u039c\7\b"+
		"\2\2\u039c\u03aa\3\2\2\2\u039d\u039f\7~\2\2\u039e\u039d\3\2\2\2\u039e"+
		"\u039f\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a2\7\\\2\2\u03a1\u039e\3\2"+
		"\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a4\7\7\2\2\u03a4"+
		"\u03a5\5F$\2\u03a5\u03a6\7\b\2\2\u03a6\u03aa\3\2\2\2\u03a7\u03aa\5 \21"+
		"\2\u03a8\u03aa\5\6\4\2\u03a9\u0377\3\2\2\2\u03a9\u0381\3\2\2\2\u03a9\u0384"+
		"\3\2\2\2\u03a9\u0387\3\2\2\2\u03a9\u0399\3\2\2\2\u03a9\u03a1\3\2\2\2\u03a9"+
		"\u03a7\3\2\2\2\u03a9\u03a8\3\2\2\2\u03aa\u03ec\3\2\2\2\u03ab\u03ac\f\20"+
		"\2\2\u03ac\u03ad\7\24\2\2\u03ad\u03eb\5\\/\21\u03ae\u03af\f\17\2\2\u03af"+
		"\u03b0\t\6\2\2\u03b0\u03eb\5\\/\20\u03b1\u03b2\f\16\2\2\u03b2\u03b3\t"+
		"\7\2\2\u03b3\u03eb\5\\/\17\u03b4\u03b5\f\r\2\2\u03b5\u03b6\t\b\2\2\u03b6"+
		"\u03eb\5\\/\16\u03b7\u03b8\f\f\2\2\u03b8\u03b9\t\t\2\2\u03b9\u03eb\5\\"+
		"/\r\u03ba\u03c7\f\13\2\2\u03bb\u03c8\7\r\2\2\u03bc\u03c8\7\37\2\2\u03bd"+
		"\u03c8\7&\2\2\u03be\u03c8\7\'\2\2\u03bf\u03c8\7s\2\2\u03c0\u03c1\7s\2"+
		"\2\u03c1\u03c8\7~\2\2\u03c2\u03c8\7j\2\2\u03c3\u03c8\7x\2\2\u03c4\u03c8"+
		"\7d\2\2\u03c5\u03c8\7z\2\2\u03c6\u03c8\7\u0090\2\2\u03c7\u03bb\3\2\2\2"+
		"\u03c7\u03bc\3\2\2\2\u03c7\u03bd\3\2\2\2\u03c7\u03be\3\2\2\2\u03c7\u03bf"+
		"\3\2\2\2\u03c7\u03c0\3\2\2\2\u03c7\u03c2\3\2\2\2\u03c7\u03c3\3\2\2\2\u03c7"+
		"\u03c4\3\2\2\2\u03c7\u03c5\3\2\2\2\u03c7\u03c6\3\2\2\2\u03c8\u03c9\3\2"+
		"\2\2\u03c9\u03eb\5\\/\f\u03ca\u03cb\f\n\2\2\u03cb\u03cc\7\63\2\2\u03cc"+
		"\u03eb\5\\/\13\u03cd\u03ce\f\t\2\2\u03ce\u03cf\7\u0085\2\2\u03cf\u03eb"+
		"\5\\/\n\u03d0\u03d2\f\6\2\2\u03d1\u03d3\7~\2\2\u03d2\u03d1\3\2\2\2\u03d2"+
		"\u03d3\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03e8\7j\2\2\u03d5\u03df\7\7"+
		"\2\2\u03d6\u03e0\5F$\2\u03d7\u03dc\5\\/\2\u03d8\u03d9\7\f\2\2\u03d9\u03db"+
		"\5\\/\2\u03da\u03d8\3\2\2\2\u03db\u03de\3\2\2\2\u03dc\u03da\3\2\2\2\u03dc"+
		"\u03dd\3\2\2\2\u03dd\u03e0\3\2\2\2\u03de\u03dc\3\2\2\2\u03df\u03d6\3\2"+
		"\2\2\u03df\u03d7\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1"+
		"\u03e9\7\b\2\2\u03e2\u03e3\5\u00a8U\2\u03e3\u03e4\7\6\2\2\u03e4\u03e6"+
		"\3\2\2\2\u03e5\u03e2\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7"+
		"\u03e9\5\u00acW\2\u03e8\u03d5\3\2\2\2\u03e8\u03e5\3\2\2\2\u03e9\u03eb"+
		"\3\2\2\2\u03ea\u03ab\3\2\2\2\u03ea\u03ae\3\2\2\2\u03ea\u03b1\3\2\2\2\u03ea"+
		"\u03b4\3\2\2\2\u03ea\u03b7\3\2\2\2\u03ea\u03ba\3\2\2\2\u03ea\u03ca\3\2"+
		"\2\2\u03ea\u03cd\3\2\2\2\u03ea\u03d0\3\2\2\2\u03eb\u03ee\3\2\2\2\u03ec"+
		"\u03ea\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed]\3\2\2\2\u03ee\u03ec\3\2\2\2"+
		"\u03ef\u03f0\b\60\1\2\u03f0\u0411\5\u0096L\2\u03f1\u0411\5\u00c8e\2\u03f2"+
		"\u03f3\5\u00c8e\2\u03f3\u03f4\7(\2\2\u03f4\u03f5\5\\/\2\u03f5\u03f6\7"+
		")\2\2\u03f6\u03f7\5^\60\2\u03f7\u03f8\5\u00c8e\2\u03f8\u03f9\7(\2\2\u03f9"+
		"\u03fa\5\\/\2\u03fa\u03fb\7)\2\2\u03fb\u0411\3\2\2\2\u03fc\u03fd\5\u00c8"+
		"e\2\u03fd\u03fe\7(\2\2\u03fe\u03ff\5\\/\2\u03ff\u0400\7)\2\2\u0400\u0403"+
		"\5^\60\2\u0401\u0404\5\u00c8e\2\u0402\u0404\5\u0094K\2\u0403\u0401\3\2"+
		"\2\2\u0403\u0402\3\2\2\2\u0404\u0411\3\2\2\2\u0405\u0406\7\7\2\2\u0406"+
		"\u0407\5^\60\2\u0407\u0408\7\b\2\2\u0408\u0411\3\2\2\2\u0409\u040a\7?"+
		"\2\2\u040a\u040b\7\7\2\2\u040b\u040c\5^\60\2\u040c\u040d\7\64\2\2\u040d"+
		"\u040e\5L\'\2\u040e\u040f\7\b\2\2\u040f\u0411\3\2\2\2\u0410\u03ef\3\2"+
		"\2\2\u0410\u03f1\3\2\2\2\u0410\u03f2\3\2\2\2\u0410\u03fc\3\2\2\2\u0410"+
		"\u0405\3\2\2\2\u0410\u0409\3\2\2\2\u0411\u042c\3\2\2\2\u0412\u0413\f\16"+
		"\2\2\u0413\u0414\t\6\2\2\u0414\u042b\5^\60\17\u0415\u0416\f\r\2\2\u0416"+
		"\u0417\t\7\2\2\u0417\u042b\5^\60\16\u0418\u0419\f\f\2\2\u0419\u041a\t"+
		"\t\2\2\u041a\u042b\5^\60\r\u041b\u041c\f\13\2\2\u041c\u041d\t\n\2\2\u041d"+
		"\u042b\5^\60\f\u041e\u041f\f\n\2\2\u041f\u0420\7\63\2\2\u0420\u042b\5"+
		"^\60\13\u0421\u0422\f\t\2\2\u0422\u0423\7\u0085\2\2\u0423\u042b\5^\60"+
		"\n\u0424\u0425\f\b\2\2\u0425\u0426\7\24\2\2\u0426\u042b\5^\60\t\u0427"+
		"\u0428\f\7\2\2\u0428\u0429\7\13\2\2\u0429\u042b\5^\60\b\u042a\u0412\3"+
		"\2\2\2\u042a\u0415\3\2\2\2\u042a\u0418\3\2\2\2\u042a\u041b\3\2\2\2\u042a"+
		"\u041e\3\2\2\2\u042a\u0421\3\2\2\2\u042a\u0424\3\2\2\2\u042a\u0427\3\2"+
		"\2\2\u042b\u042e\3\2\2\2\u042c\u042a\3\2\2\2\u042c\u042d\3\2\2\2\u042d"+
		"_\3\2\2\2\u042e\u042c\3\2\2\2\u042f\u0430\b\61\1\2\u0430\u0455\5\u0096"+
		"L\2\u0431\u0455\5\u00c8e\2\u0432\u0433\5\u00c8e\2\u0433\u0434\7(\2\2\u0434"+
		"\u0435\5\\/\2\u0435\u0436\7)\2\2\u0436\u0437\5`\61\2\u0437\u0438\5\u00c8"+
		"e\2\u0438\u0439\7(\2\2\u0439\u043a\5\\/\2\u043a\u043b\7)\2\2\u043b\u0455"+
		"\3\2\2\2\u043c\u043d\5\u00c8e\2\u043d\u043e\7(\2\2\u043e\u043f\5\\/\2"+
		"\u043f\u0440\7)\2\2\u0440\u0443\5`\61\2\u0441\u0444\5\u00c8e\2\u0442\u0444"+
		"\5\u0094K\2\u0443\u0441\3\2\2\2\u0443\u0442\3\2\2\2\u0444\u0455\3\2\2"+
		"\2\u0445\u0446\7(\2\2\u0446\u0447\5\u00c8e\2\u0447\u0448\7)\2\2\u0448"+
		"\u0455\3\2\2\2\u0449\u044a\7\7\2\2\u044a\u044b\5`\61\2\u044b\u044c\7\b"+
		"\2\2\u044c\u0455\3\2\2\2\u044d\u044e\7?\2\2\u044e\u044f\7\7\2\2\u044f"+
		"\u0450\5`\61\2\u0450\u0451\7\64\2\2\u0451\u0452\5L\'\2\u0452\u0453\7\b"+
		"\2\2\u0453\u0455\3\2\2\2\u0454\u042f\3\2\2\2\u0454\u0431\3\2\2\2\u0454"+
		"\u0432\3\2\2\2\u0454\u043c\3\2\2\2\u0454\u0445\3\2\2\2\u0454\u0449\3\2"+
		"\2\2\u0454\u044d\3\2\2\2\u0455\u0470\3\2\2\2\u0456\u0457\f\17\2\2\u0457"+
		"\u0458\t\6\2\2\u0458\u046f\5`\61\20\u0459\u045a\f\16\2\2\u045a\u045b\t"+
		"\7\2\2\u045b\u046f\5`\61\17\u045c\u045d\f\r\2\2\u045d\u045e\t\t\2\2\u045e"+
		"\u046f\5`\61\16\u045f\u0460\f\f\2\2\u0460\u0461\t\n\2\2\u0461\u046f\5"+
		"`\61\r\u0462\u0463\f\13\2\2\u0463\u0464\7\63\2\2\u0464\u046f\5`\61\f\u0465"+
		"\u0466\f\n\2\2\u0466\u0467\7\u0085\2\2\u0467\u046f\5`\61\13\u0468\u0469"+
		"\f\t\2\2\u0469\u046a\7\24\2\2\u046a\u046f\5`\61\n\u046b\u046c\f\b\2\2"+
		"\u046c\u046d\7\13\2\2\u046d\u046f\5`\61\t\u046e\u0456\3\2\2\2\u046e\u0459"+
		"\3\2\2\2\u046e\u045c\3\2\2\2\u046e\u045f\3\2\2\2\u046e\u0462\3\2\2\2\u046e"+
		"\u0465\3\2\2\2\u046e\u0468\3\2\2\2\u046e\u046b\3\2\2\2\u046f\u0472\3\2"+
		"\2\2\u0470\u046e\3\2\2\2\u0470\u0471\3\2\2\2\u0471a\3\2\2\2\u0472\u0470"+
		"\3\2\2\2\u0473\u0480\5\u0096L\2\u0474\u0480\5\u00c8e\2\u0475\u0480\5d"+
		"\63\2\u0476\u0477\5\u00c8e\2\u0477\u0478\t\13\2\2\u0478\u0480\3\2\2\2"+
		"\u0479\u047a\t\13\2\2\u047a\u0480\5\u00c8e\2\u047b\u047c\7\7\2\2\u047c"+
		"\u047d\5b\62\2\u047d\u047e\7\b\2\2\u047e\u0480\3\2\2\2\u047f\u0473\3\2"+
		"\2\2\u047f\u0474\3\2\2\2\u047f\u0475\3\2\2\2\u047f\u0476\3\2\2\2\u047f"+
		"\u0479\3\2\2\2\u047f\u047b\3\2\2\2\u0480c\3\2\2\2\u0481\u0482\5\u00c8"+
		"e\2\u0482\u0483\7\r\2\2\u0483\u0484\5\\/\2\u0484e\3\2\2\2\u0485\u0486"+
		"\b\64\1\2\u0486\u04bf\5\u0096L\2\u0487\u04bf\5\u00c8e\2\u0488\u0489\5"+
		"\u00a8U\2\u0489\u048a\7\6\2\2\u048a\u048c\3\2\2\2\u048b\u0488\3\2\2\2"+
		"\u048b\u048c\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u048e\5\u00acW\2\u048e"+
		"\u048f\7\6\2\2\u048f\u0491\3\2\2\2\u0490\u048b\3\2\2\2\u0490\u0491\3\2"+
		"\2\2\u0491\u0492\3\2\2\2\u0492\u04bf\5\u00b2Z\2\u0493\u0494\5\u0098M\2"+
		"\u0494\u0495\5f\64\21\u0495\u04bf\3\2\2\2\u0496\u0497\5\u00a6T\2\u0497"+
		"\u04a4\7\7\2\2\u0498\u049a\7R\2\2\u0499\u0498\3\2\2\2\u0499\u049a\3\2"+
		"\2\2\u049a\u049b\3\2\2\2\u049b\u04a0\5f\64\2\u049c\u049d\7\f\2\2\u049d"+
		"\u049f\5f\64\2\u049e\u049c\3\2\2\2\u049f\u04a2\3\2\2\2\u04a0\u049e\3\2"+
		"\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04a5\3\2\2\2\u04a2\u04a0\3\2\2\2\u04a3"+
		"\u04a5\7\16\2\2\u04a4\u0499\3\2\2\2\u04a4\u04a3\3\2\2\2\u04a4\u04a5\3"+
		"\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04a7\7\b\2\2\u04a7\u04bf\3\2\2\2\u04a8"+
		"\u04a9\7\7\2\2\u04a9\u04aa\5f\64\2\u04aa\u04ab\7\b\2\2\u04ab\u04bf\3\2"+
		"\2\2\u04ac\u04ad\7(\2\2\u04ad\u04ae\5f\64\2\u04ae\u04af\7)\2\2\u04af\u04bf"+
		"\3\2\2\2\u04b0\u04b1\7(\2\2\u04b1\u04b2\5\24\13\2\u04b2\u04b3\7)\2\2\u04b3"+
		"\u04bf\3\2\2\2\u04b4\u04b6\7~\2\2\u04b5\u04b4\3\2\2\2\u04b5\u04b6\3\2"+
		"\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b9\7\\\2\2\u04b8\u04b5\3\2\2\2\u04b8"+
		"\u04b9\3\2\2\2\u04b9\u04ba\3\2\2\2\u04ba\u04bb\7\7\2\2\u04bb\u04bc\5F"+
		"$\2\u04bc\u04bd\7\b\2\2\u04bd\u04bf\3\2\2\2\u04be\u0485\3\2\2\2\u04be"+
		"\u0487\3\2\2\2\u04be\u0490\3\2\2\2\u04be\u0493\3\2\2\2\u04be\u0496\3\2"+
		"\2\2\u04be\u04a8\3\2\2\2\u04be\u04ac\3\2\2\2\u04be\u04b0\3\2\2\2\u04be"+
		"\u04b8\3\2\2\2\u04bf\u0501\3\2\2\2\u04c0\u04c1\f\20\2\2\u04c1\u04c2\7"+
		"\24\2\2\u04c2\u0500\5f\64\21\u04c3\u04c4\f\17\2\2\u04c4\u04c5\t\6\2\2"+
		"\u04c5\u0500\5f\64\20\u04c6\u04c7\f\16\2\2\u04c7\u04c8\t\7\2\2\u04c8\u0500"+
		"\5f\64\17\u04c9\u04ca\f\r\2\2\u04ca\u04cb\t\b\2\2\u04cb\u0500\5f\64\16"+
		"\u04cc\u04cd\f\f\2\2\u04cd\u04ce\t\t\2\2\u04ce\u0500\5f\64\r\u04cf\u04dc"+
		"\f\13\2\2\u04d0\u04dd\7\r\2\2\u04d1\u04dd\7\37\2\2\u04d2\u04dd\7&\2\2"+
		"\u04d3\u04dd\7\'\2\2\u04d4\u04dd\7s\2\2\u04d5\u04d6\7s\2\2\u04d6\u04dd"+
		"\7~\2\2\u04d7\u04dd\7j\2\2\u04d8\u04dd\7x\2\2\u04d9\u04dd\7d\2\2\u04da"+
		"\u04dd\7z\2\2\u04db\u04dd\7\u0090\2\2\u04dc\u04d0\3\2\2\2\u04dc\u04d1"+
		"\3\2\2\2\u04dc\u04d2\3\2\2\2\u04dc\u04d3\3\2\2\2\u04dc\u04d4\3\2\2\2\u04dc"+
		"\u04d5\3\2\2\2\u04dc\u04d7\3\2\2\2\u04dc\u04d8\3\2\2\2\u04dc\u04d9\3\2"+
		"\2\2\u04dc\u04da\3\2\2\2\u04dc\u04db\3\2\2\2\u04dd\u04de\3\2\2\2\u04de"+
		"\u0500\5f\64\f\u04df\u04e0\f\n\2\2\u04e0\u04e1\7\63\2\2\u04e1\u0500\5"+
		"f\64\13\u04e2\u04e3\f\t\2\2\u04e3\u04e4\7\u0085\2\2\u04e4\u0500\5f\64"+
		"\n\u04e5\u04e7\f\4\2\2\u04e6\u04e8\7~\2\2\u04e7\u04e6\3\2\2\2\u04e7\u04e8"+
		"\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9\u04fd\7j\2\2\u04ea\u04f4\7\7\2\2\u04eb"+
		"\u04f5\5F$\2\u04ec\u04f1\5f\64\2\u04ed\u04ee\7\f\2\2\u04ee\u04f0\5f\64"+
		"\2\u04ef\u04ed\3\2\2\2\u04f0\u04f3\3\2\2\2\u04f1\u04ef\3\2\2\2\u04f1\u04f2"+
		"\3\2\2\2\u04f2\u04f5\3\2\2\2\u04f3\u04f1\3\2\2\2\u04f4\u04eb\3\2\2\2\u04f4"+
		"\u04ec\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6\u04fe\7\b"+
		"\2\2\u04f7\u04f8\5\u00a8U\2\u04f8\u04f9\7\6\2\2\u04f9\u04fb\3\2\2\2\u04fa"+
		"\u04f7\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\u04fe\5\u00ac"+
		"W\2\u04fd\u04ea\3\2\2\2\u04fd\u04fa\3\2\2\2\u04fe\u0500\3\2\2\2\u04ff"+
		"\u04c0\3\2\2\2\u04ff\u04c3\3\2\2\2\u04ff\u04c6\3\2\2\2\u04ff\u04c9\3\2"+
		"\2\2\u04ff\u04cc\3\2\2\2\u04ff\u04cf\3\2\2\2\u04ff\u04df\3\2\2\2\u04ff"+
		"\u04e2\3\2\2\2\u04ff\u04e5\3\2\2\2\u0500\u0503\3\2\2\2\u0501\u04ff\3\2"+
		"\2\2\u0501\u0502\3\2\2\2\u0502g\3\2\2\2\u0503\u0501\3\2\2\2\u0504\u0508"+
		"\7\u008f\2\2\u0505\u0506\5\u00a8U\2\u0506\u0507\7\6\2\2\u0507\u0509\3"+
		"\2\2\2\u0508\u0505\3\2\2\2\u0508\u0509\3\2\2\2\u0509\u050a\3\2\2\2\u050a"+
		"\u0516\5\u00b6\\\2\u050b\u050c\7\7\2\2\u050c\u0511\5j\66\2\u050d\u050e"+
		"\7\f\2\2\u050e\u0510\5j\66\2\u050f\u050d\3\2\2\2\u0510\u0513\3\2\2\2\u0511"+
		"\u050f\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u0514\3\2\2\2\u0513\u0511\3\2"+
		"\2\2\u0514\u0515\7\b\2\2\u0515\u0517\3\2\2\2\u0516\u050b\3\2\2\2\u0516"+
		"\u0517\3\2\2\2\u0517\u052a\3\2\2\2\u0518\u0519\7\u0083\2\2\u0519\u0522"+
		"\t\f\2\2\u051a\u051b\7\u009c\2\2\u051b\u0523\7\u0080\2\2\u051c\u051d\7"+
		"\u009c\2\2\u051d\u0523\7L\2\2\u051e\u0523\7=\2\2\u051f\u0523\7\u0095\2"+
		"\2\u0520\u0521\7}\2\2\u0521\u0523\7-\2\2\u0522\u051a\3\2\2\2\u0522\u051c"+
		"\3\2\2\2\u0522\u051e\3\2\2\2\u0522\u051f\3\2\2\2\u0522\u0520\3\2\2\2\u0523"+
		"\u0527\3\2\2\2\u0524\u0525\7z\2\2\u0525\u0527\5\u00a4S\2\u0526\u0518\3"+
		"\2\2\2\u0526\u0524\3\2\2\2\u0527\u0529\3\2\2\2\u0528\u0526\3\2\2\2\u0529"+
		"\u052c\3\2\2\2\u052a\u0528\3\2\2\2\u052a\u052b\3\2\2\2\u052b\u053a\3\2"+
		"\2\2\u052c\u052a\3\2\2\2\u052d\u052f\7~\2\2\u052e\u052d\3\2\2\2\u052e"+
		"\u052f\3\2\2\2\u052f\u0530\3\2\2\2\u0530\u0535\7M\2\2\u0531\u0532\7m\2"+
		"\2\u0532\u0536\7N\2\2\u0533\u0534\7m\2\2\u0534\u0536\7i\2\2\u0535\u0531"+
		"\3\2\2\2\u0535\u0533\3\2\2\2\u0535\u0536\3\2\2\2\u0536\u0538\3\2\2\2\u0537"+
		"\u0539\7X\2\2\u0538\u0537\3\2\2\2\u0538\u0539\3\2\2\2\u0539\u053b\3\2"+
		"\2\2\u053a\u052e\3\2\2\2\u053a\u053b\3\2\2\2\u053bi\3\2\2\2\u053c\u053d"+
		"\5\u00a4S\2\u053dk\3\2\2\2\u053e\u0541\5\u00b2Z\2\u053f\u0540\7A\2\2\u0540"+
		"\u0542\5\u00b4[\2\u0541\u053f\3\2\2\2\u0541\u0542\3\2\2\2\u0542\u0544"+
		"\3\2\2\2\u0543\u0545\t\5\2\2\u0544\u0543\3\2\2\2\u0544\u0545\3\2\2\2\u0545"+
		"m\3\2\2\2\u0546\u0547\7E\2\2\u0547\u0549\5\u00a4S\2\u0548\u0546\3\2\2"+
		"\2\u0548\u0549\3\2\2\2\u0549\u0553\3\2\2\2\u054a\u0554\5p9\2\u054b\u0554"+
		"\5v<\2\u054c\u0554\5t;\2\u054d\u054e\7@\2\2\u054e\u054f\7\7\2\2\u054f"+
		"\u0550\5\\/\2\u0550\u0551\7\b\2\2\u0551\u0554\3\2\2\2\u0552\u0554\5r:"+
		"\2\u0553\u054a\3\2\2\2\u0553\u054b\3\2\2\2\u0553\u054c\3\2\2\2\u0553\u054d"+
		"\3\2\2\2\u0553\u0552\3\2\2\2\u0554o\3\2\2\2\u0555\u0556\7\u008a\2\2\u0556"+
		"\u0557\7v\2\2\u0557\u0558\7\7\2\2\u0558\u055d\5l\67\2\u0559\u055a\7\f"+
		"\2\2\u055a\u055c\5l\67\2\u055b\u0559\3\2\2\2\u055c\u055f\3\2\2\2\u055d"+
		"\u055b\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u0560\3\2\2\2\u055f\u055d\3\2"+
		"\2\2\u0560\u0561\7\b\2\2\u0561q\3\2\2\2\u0562\u0563\7`\2\2\u0563\u0564"+
		"\7v\2\2\u0564\u0565\7\7\2\2\u0565\u056a\5x=\2\u0566\u0567\7\f\2\2\u0567"+
		"\u0569\5x=\2\u0568\u0566\3\2\2\2\u0569\u056c\3\2\2\2\u056a\u0568\3\2\2"+
		"\2\u056a\u056b\3\2\2\2\u056b\u056d\3\2\2\2\u056c\u056a\3\2\2\2\u056d\u056e"+
		"\7\b\2\2\u056e\u056f\5h\65\2\u056fs\3\2\2\2\u0570\u0572\7\u00a6\2\2\u0571"+
		"\u0573\7v\2\2\u0572\u0571\3\2\2\2\u0572\u0573\3\2\2\2\u0573\u0575\3\2"+
		"\2\2\u0574\u0576\5\u00a4S\2\u0575\u0574\3\2\2\2\u0575\u0576\3\2\2\2\u0576"+
		"\u0577\3\2\2\2\u0577\u0578\7\7\2\2\u0578\u057d\5l\67\2\u0579\u057a\7\f"+
		"\2\2\u057a\u057c\5l\67\2\u057b\u0579\3\2\2\2\u057c\u057f\3\2\2\2\u057d"+
		"\u057b\3\2\2\2\u057d\u057e\3\2\2\2\u057e\u0580\3\2\2\2\u057f\u057d\3\2"+
		"\2\2\u0580\u0581\7\b\2\2\u0581u\3\2\2\2\u0582\u0584\7v\2\2\u0583\u0585"+
		"\5\u00a4S\2\u0584\u0583\3\2\2\2\u0584\u0585\3\2\2\2\u0585\u0586\3\2\2"+
		"\2\u0586\u0587\7\7\2\2\u0587\u058c\5l\67\2\u0588\u0589\7\f\2\2\u0589\u058b"+
		"\5l\67\2\u058a\u0588\3\2\2\2\u058b\u058e\3\2\2\2\u058c\u058a\3\2\2\2\u058c"+
		"\u058d\3\2\2\2\u058d\u058f\3\2\2\2\u058e\u058c\3\2\2\2\u058f\u0590\7\b"+
		"\2\2\u0590w\3\2\2\2\u0591\u0592\5\u00b2Z\2\u0592y\3\2\2\2\u0593\u0594"+
		"\5\u00a8U\2\u0594\u0595\7\6\2\2\u0595\u0597\3\2\2\2\u0596\u0593\3\2\2"+
		"\2\u0596\u0597\3\2\2\2\u0597\u0598\3\2\2\2\u0598\u059e\5\u00acW\2\u0599"+
		"\u059a\7l\2\2\u059a\u059b\7<\2\2\u059b\u059f\5\u00b8]\2\u059c\u059d\7"+
		"~\2\2\u059d\u059f\7l\2\2\u059e\u0599\3\2\2\2\u059e\u059c\3\2\2\2\u059e"+
		"\u059f\3\2\2\2\u059f{\3\2\2\2\u05a0\u05a2\5\\/\2\u05a1\u05a3\t\5\2\2\u05a2"+
		"\u05a1\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3}\3\2\2\2\u05a4\u05a8\5\u0094"+
		"K\2\u05a5\u05a8\5\u00a4S\2\u05a6\u05a8\7\u00bb\2\2\u05a7\u05a4\3\2\2\2"+
		"\u05a7\u05a5\3\2\2\2\u05a7\u05a6\3\2\2\2\u05a8\177\3\2\2\2\u05a9\u05b5"+
		"\5\u00acW\2\u05aa\u05ab\7\7\2\2\u05ab\u05b0\5\u00b2Z\2\u05ac\u05ad\7\f"+
		"\2\2\u05ad\u05af\5\u00b2Z\2\u05ae\u05ac\3\2\2\2\u05af\u05b2\3\2\2\2\u05b0"+
		"\u05ae\3\2\2\2\u05b0\u05b1\3\2\2\2\u05b1\u05b3\3\2\2\2\u05b2\u05b0\3\2"+
		"\2\2\u05b3\u05b4\7\b\2\2\u05b4\u05b6\3\2\2\2\u05b5\u05aa\3\2\2\2\u05b5"+
		"\u05b6\3\2\2\2\u05b6\u05b7\3\2\2\2\u05b7\u05b8\7\64\2\2\u05b8\u05b9\7"+
		"\7\2\2\u05b9\u05ba\5F$\2\u05ba\u05bb\7\b\2\2\u05bb\u0081\3\2\2\2\u05bc"+
		"\u05c9\7\16\2\2\u05bd\u05be\5\u00acW\2\u05be\u05bf\7\6\2\2\u05bf\u05c0"+
		"\7\16\2\2\u05c0\u05c9\3\2\2\2\u05c1\u05c6\5\\/\2\u05c2\u05c4\7\64\2\2"+
		"\u05c3\u05c2\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4\u05c5\3\2\2\2\u05c5\u05c7"+
		"\5\u009eP\2\u05c6\u05c3\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7\u05c9\3\2\2"+
		"\2\u05c8\u05bc\3\2\2\2\u05c8\u05bd\3\2\2\2\u05c8\u05c1\3\2\2\2\u05c9\u0083"+
		"\3\2\2\2\u05ca\u05cb\5\u00a8U\2\u05cb\u05cc\7\6\2\2\u05cc\u05ce\3\2\2"+
		"\2\u05cd\u05ca\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf\u05d4"+
		"\5\u00acW\2\u05d0\u05d2\7\64\2\2\u05d1\u05d0\3\2\2\2\u05d1\u05d2\3\2\2"+
		"\2\u05d2\u05d3\3\2\2\2\u05d3\u05d5\5\u00c4c\2\u05d4\u05d1\3\2\2\2\u05d4"+
		"\u05d5\3\2\2\2\u05d5\u05db\3\2\2\2\u05d6\u05d7\7l\2\2\u05d7\u05d8\7<\2"+
		"\2\u05d8\u05dc\5\u00b8]\2\u05d9\u05da\7~\2\2\u05da\u05dc\7l\2\2\u05db"+
		"\u05d6\3\2\2\2\u05db\u05d9\3\2\2\2\u05db\u05dc\3\2\2\2\u05dc\u05fa\3\2"+
		"\2\2\u05dd\u05e7\7\7\2\2\u05de\u05e3\5\u0084C\2\u05df\u05e0\7\f\2\2\u05e0"+
		"\u05e2\5\u0084C\2\u05e1\u05df\3\2\2\2\u05e2\u05e5\3\2\2\2\u05e3\u05e1"+
		"\3\2\2\2\u05e3\u05e4\3\2\2\2\u05e4\u05e8\3\2\2\2\u05e5\u05e3\3\2\2\2\u05e6"+
		"\u05e8\5\u0086D\2\u05e7\u05de\3\2\2\2\u05e7\u05e6\3\2\2\2\u05e8\u05e9"+
		"\3\2\2\2\u05e9\u05ee\7\b\2\2\u05ea\u05ec\7\64\2\2\u05eb\u05ea\3\2\2\2"+
		"\u05eb\u05ec\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed\u05ef\5\u00c4c\2\u05ee"+
		"\u05eb\3\2\2\2\u05ee\u05ef\3\2\2\2\u05ef\u05fa\3\2\2\2\u05f0\u05f1\7\7"+
		"\2\2\u05f1\u05f2\5F$\2\u05f2\u05f7\7\b\2\2\u05f3\u05f5\7\64\2\2\u05f4"+
		"\u05f3\3\2\2\2\u05f4\u05f5\3\2\2\2\u05f5\u05f6\3\2\2\2\u05f6\u05f8\5\u00c4"+
		"c\2\u05f7\u05f4\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8\u05fa\3\2\2\2\u05f9"+
		"\u05cd\3\2\2\2\u05f9\u05dd\3\2\2\2\u05f9\u05f0\3\2\2\2\u05fa\u0085\3\2"+
		"\2\2\u05fb\u0602\5\u0084C\2\u05fc\u05fd\5\u0088E\2\u05fd\u05fe\5\u0084"+
		"C\2\u05fe\u05ff\5\u008aF\2\u05ff\u0601\3\2\2\2\u0600\u05fc\3\2\2\2\u0601"+
		"\u0604\3\2\2\2\u0602\u0600\3\2\2\2\u0602\u0603\3\2\2\2\u0603\u0087\3\2"+
		"\2\2\u0604\u0602\3\2\2\2\u0605\u060f\7\f\2\2\u0606\u0608\7w\2\2\u0607"+
		"\u0609\7\u0087\2\2\u0608\u0607\3\2\2\2\u0608\u0609\3\2\2\2\u0609\u060c"+
		"\3\2\2\2\u060a\u060c\7n\2\2\u060b\u0606\3\2\2\2\u060b\u060a\3\2\2\2\u060b"+
		"\u060c\3\2\2\2\u060c\u060d\3\2\2\2\u060d\u060f\7u\2\2\u060e\u0605\3\2"+
		"\2\2\u060e\u060b\3\2\2\2\u060f\u0089\3\2\2\2\u0610\u0612\7\u0083\2\2\u0611"+
		"\u0610\3\2\2\2\u0611\u0612\3\2\2\2\u0612\u0613\3\2\2\2\u0613\u0615\5\\"+
		"/\2\u0614\u0611\3\2\2\2\u0614\u0615\3\2\2\2\u0615\u008b\3\2\2\2\u0616"+
		"\u0618\7\u009b\2\2\u0617\u0619\t\4\2\2\u0618\u0617\3\2\2\2\u0618\u0619"+
		"\3\2\2\2\u0619\u061a\3\2\2\2\u061a\u061f\5\u0082B\2\u061b\u061c\7\f\2"+
		"\2\u061c\u061e\5\u0082B\2\u061d\u061b\3\2\2\2\u061e\u0621\3\2\2\2\u061f"+
		"\u061d\3\2\2\2\u061f\u0620\3\2\2\2\u0620\u062e\3\2\2\2\u0621\u061f\3\2"+
		"\2\2\u0622\u062c\7a\2\2\u0623\u0628\5\u0084C\2\u0624\u0625\7\f\2\2\u0625"+
		"\u0627\5\u0084C\2\u0626\u0624\3\2\2\2\u0627\u062a\3\2\2\2\u0628\u0626"+
		"\3\2\2\2\u0628\u0629\3\2\2\2\u0629\u062d\3\2\2\2\u062a\u0628\3\2\2\2\u062b"+
		"\u062d\5\u0086D\2\u062c\u0623\3\2\2\2\u062c\u062b\3\2\2\2\u062d\u062f"+
		"\3\2\2\2\u062e\u0622\3\2\2\2\u062e\u062f\3\2\2\2\u062f\u0632\3\2\2\2\u0630"+
		"\u0631\7\u00ae\2\2\u0631\u0633\5\\/\2\u0632\u0630\3\2\2\2\u0632\u0633"+
		"\3\2\2\2\u0633\u063f\3\2\2\2\u0634\u0639\5\u008eH\2\u0635\u0636\7\f\2"+
		"\2\u0636\u0638\5\\/\2\u0637\u0635\3\2\2\2\u0638\u063b\3\2\2\2\u0639\u0637"+
		"\3\2\2\2\u0639\u063a\3\2\2\2\u063a\u063d\3\2\2\2\u063b\u0639\3\2\2\2\u063c"+
		"\u063e\5\u0090I\2\u063d\u063c\3\2\2\2\u063d\u063e\3\2\2\2\u063e\u0640"+
		"\3\2\2\2\u063f\u0634\3\2\2\2\u063f\u0640\3\2\2\2\u0640\u065e\3\2\2\2\u0641"+
		"\u0642\7\u00aa\2\2\u0642\u0643\7\7\2\2\u0643\u0648\5\\/\2\u0644\u0645"+
		"\7\f\2\2\u0645\u0647\5\\/\2\u0646\u0644\3\2\2\2\u0647\u064a\3\2\2\2\u0648"+
		"\u0646\3\2\2\2\u0648\u0649\3\2\2\2\u0649\u064b\3\2\2\2\u064a\u0648\3\2"+
		"\2\2\u064b\u065a\7\b\2\2\u064c\u064d\7\f\2\2\u064d\u064e\7\7\2\2\u064e"+
		"\u0653\5\\/\2\u064f\u0650\7\f\2\2\u0650\u0652\5\\/\2\u0651\u064f\3\2\2"+
		"\2\u0652\u0655\3\2\2\2\u0653\u0651\3\2\2\2\u0653\u0654\3\2\2\2\u0654\u0656"+
		"\3\2\2\2\u0655\u0653\3\2\2\2\u0656\u0657\7\b\2\2\u0657\u0659\3\2\2\2\u0658"+
		"\u064c\3\2\2\2\u0659\u065c\3\2\2\2\u065a\u0658\3\2\2\2\u065a\u065b\3\2"+
		"\2\2\u065b\u065e\3\2\2\2\u065c\u065a\3\2\2\2\u065d\u0616\3\2\2\2\u065d"+
		"\u0641\3\2\2\2\u065e\u008d\3\2\2\2\u065f\u0660\7e\2\2\u0660\u0661\7<\2"+
		"\2\u0661\u0662\5\\/\2\u0662\u008f\3\2\2\2\u0663\u0664\7f\2\2\u0664\u0665"+
		"\5\\/\2\u0665\u0091\3\2\2\2\u0666\u0672\5\u00acW\2\u0667\u0668\7\7\2\2"+
		"\u0668\u066d\5\u00b2Z\2\u0669\u066a\7\f\2\2\u066a\u066c\5\u00b2Z\2\u066b"+
		"\u0669\3\2\2\2\u066c\u066f\3\2\2\2\u066d\u066b\3\2\2\2\u066d\u066e\3\2"+
		"\2\2\u066e\u0670\3\2\2\2\u066f\u066d\3\2\2\2\u0670\u0671\7\b\2\2\u0671"+
		"\u0673\3\2\2\2\u0672\u0667\3\2\2\2\u0672\u0673\3\2\2\2\u0673\u0093\3\2"+
		"\2\2\u0674\u0676\t\7\2\2\u0675\u0674\3\2\2\2\u0675\u0676\3\2\2\2\u0676"+
		"\u0677\3\2\2\2\u0677\u067a\7\u00b9\2\2\u0678\u067a\7\16\2\2\u0679\u0675"+
		"\3\2\2\2\u0679\u0678\3\2\2\2\u067a\u0095\3\2\2\2\u067b\u067c\t\r\2\2\u067c"+
		"\u0097\3\2\2\2\u067d\u067e\t\16\2\2\u067e\u0099\3\2\2\2\u067f\u0680\7"+
		"\u00bb\2\2\u0680\u009b\3\2\2\2\u0681\u0684\5\\/\2\u0682\u0684\5J&\2\u0683"+
		"\u0681\3\2\2\2\u0683\u0682\3\2\2\2\u0684\u009d\3\2\2\2\u0685\u0686\t\17"+
		"\2\2\u0686\u009f\3\2\2\2\u0687\u0688\t\20\2\2\u0688\u00a1\3\2\2\2\u0689"+
		"\u068b\13\2\2\2\u068a\u0689\3\2\2\2\u068b\u068c\3\2\2\2\u068c\u068a\3"+
		"\2\2\2\u068c\u068d\3\2\2\2\u068d\u00a3\3\2\2\2\u068e\u068f\5\u00c8e\2"+
		"\u068f\u00a5\3\2\2\2\u0690\u0691\5\u00c8e\2\u0691\u00a7\3\2\2\2\u0692"+
		"\u0693\5\u00c8e\2\u0693\u00a9\3\2\2\2\u0694\u0695\5\u00c8e\2\u0695\u00ab"+
		"\3\2\2\2\u0696\u0697\5\u00c8e\2\u0697\u00ad\3\2\2\2\u0698\u0699\5\u00c8"+
		"e\2\u0699\u00af\3\2\2\2\u069a\u069b\5\u00c8e\2\u069b\u00b1\3\2\2\2\u069c"+
		"\u069d\5\u00c8e\2\u069d\u00b3\3\2\2\2\u069e\u069f\5\u00c8e\2\u069f\u00b5"+
		"\3\2\2\2\u06a0\u06a1\5\u00c8e\2\u06a1\u00b7\3\2\2\2\u06a2\u06a3\5\u00c8"+
		"e\2\u06a3\u00b9\3\2\2\2\u06a4\u06a5\5\u00c8e\2\u06a5\u00bb\3\2\2\2\u06a6"+
		"\u06a7\5\u00c8e\2\u06a7\u00bd\3\2\2\2\u06a8\u06a9\5\u00c8e\2\u06a9\u00bf"+
		"\3\2\2\2\u06aa\u06ab\5\u00c8e\2\u06ab\u00c1\3\2\2\2\u06ac\u06ad\5\u00c8"+
		"e\2\u06ad\u00c3\3\2\2\2\u06ae\u06af\5\u00c8e\2\u06af\u00c5\3\2\2\2\u06b0"+
		"\u06b1\5\u00c8e\2\u06b1\u00c7\3\2\2\2\u06b2\u06b9\7\u00b7\2\2\u06b3\u06b9"+
		"\7\u00bb\2\2\u06b4\u06b5\7\7\2\2\u06b5\u06b6\5\u00c8e\2\u06b6\u06b7\7"+
		"\b\2\2\u06b7\u06b9\3\2\2\2\u06b8\u06b2\3\2\2\2\u06b8\u06b3\3\2\2\2\u06b8"+
		"\u06b4\3\2\2\2\u06b9\u00c9\3\2\2\2\u06ba\u06c2\7\u00b8\2\2\u06bb\u06c2"+
		"\5\u00a0Q\2\u06bc\u06c2\7\u00bb\2\2\u06bd\u06be\7\7\2\2\u06be\u06bf\5"+
		"\u00c8e\2\u06bf\u06c0\7\b\2\2\u06c0\u06c2\3\2\2\2\u06c1\u06ba\3\2\2\2"+
		"\u06c1\u06bb\3\2\2\2\u06c1\u06bc\3\2\2\2\u06c1\u06bd\3\2\2\2\u06c2\u00cb"+
		"\3\2\2\2\u00d6\u00cf\u00d1\u00dc\u00e3\u00e8\u00ee\u00f4\u00f6\u00fc\u0101"+
		"\u0104\u0107\u0112\u0115\u012a\u012c\u0130\u0137\u013f\u0142\u0148\u014d"+
		"\u0155\u0159\u0164\u0170\u0175\u0179\u0185\u018d\u0193\u0198\u019d\u01a5"+
		"\u01ac\u01b3\u01ba\u01c0\u01c3\u01ce\u01e0\u01e8\u01eb\u01ee\u01f4\u01ff"+
		"\u020b\u0213\u0219\u021c\u0220\u0224\u022e\u0234\u0237\u023b\u023d\u0243"+
		"\u024b\u024e\u0258\u025d\u0266\u0268\u0273\u027a\u0283\u02a5\u02b2\u02b5"+
		"\u02bb\u02bd\u02c7\u02ca\u02d0\u02d2\u02d6\u02dd\u02e6\u02ea\u02ec\u02f0"+
		"\u02f7\u02fb\u02fd\u0306\u0311\u0318\u031b\u0320\u0322\u0329\u0330\u0335"+
		"\u0339\u033d\u034c\u0351\u0354\u0369\u036f\u0371\u0375\u037c\u0381\u038a"+
		"\u0391\u0395\u039e\u03a1\u03a9\u03c7\u03d2\u03dc\u03df\u03e5\u03e8\u03ea"+
		"\u03ec\u0403\u0410\u042a\u042c\u0443\u0454\u046e\u0470\u047f\u048b\u0490"+
		"\u0499\u04a0\u04a4\u04b5\u04b8\u04be\u04dc\u04e7\u04f1\u04f4\u04fa\u04fd"+
		"\u04ff\u0501\u0508\u0511\u0516\u0522\u0526\u052a\u052e\u0535\u0538\u053a"+
		"\u0541\u0544\u0548\u0553\u055d\u056a\u0572\u0575\u057d\u0584\u058c\u0596"+
		"\u059e\u05a2\u05a7\u05b0\u05b5\u05c3\u05c6\u05c8\u05cd\u05d1\u05d4\u05db"+
		"\u05e3\u05e7\u05eb\u05ee\u05f4\u05f7\u05f9\u0602\u0608\u060b\u060e\u0611"+
		"\u0614\u0618\u061f\u0628\u062c\u062e\u0632\u0639\u063d\u063f\u0648\u0653"+
		"\u065a\u065d\u066d\u0672\u0675\u0679\u0683\u068c\u06b8\u06c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}