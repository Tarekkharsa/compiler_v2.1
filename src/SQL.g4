/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 by Bart Kiers
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 *
 * Project      : sqlite-parser; an ANTLR4 grammar for SQLite
 *                https://github.com/bkiers/sqlite-parser
 * Developed by : Bart Kiers, bart@big-o.nl
 */
grammar SQL;

parse
 : (
   def_all
  |sql_stmt_list
  | error )* EOF
 ;

error
 : UNEXPECTED_CHAR
   {
     throw new RuntimeException("UNEXPECTED_CHAR=" + $UNEXPECTED_CHAR.text);
   }
 ;

sql_stmt_list
 : ';'* sql_stmt ( ';'+ sql_stmt )* ';'*
 ;

sql_stmt
 : ( K_EXPLAIN ( K_QUERY K_PLAN )? )? (
//                                       alter_table_stmt
//                                      | analyze_stmt
//                                      | attach_stmt
//                                      | begin_stmt
//                                      | commit_stmt
//                                      | compound_select_stmt
//                                      | create_index_stmt
                                       create_type_stmt
                                       |create_table_stmt
                                       |create_aggr_func
//                                      | create_type
//                                      | create_trigger_stmt
//                                      | create_view_stmt
//                                      | create_virtual_table_stmt
//                                      | delete_stmt
//                                      | delete_stmt_limited
//                                      | detach_stmt
//                                      | drop_index_stmt
//                                      | drop_table_stmt
//                                      | drop_trigger_stmt
//                                      | drop_view_stmt
                                      | factored_select_stmt
//                                      | insert_stmt
//                                      | pragma_stmt
//                                      | reindex_stmt
//                                      | release_stmt
//                                      | rollback_stmt
//                                      | savepoint_stmt
//                                      | simple_select_stmt
//                                      | select_stmt
//                                      | update_stmt
//                                      | update_stmt_limited
//                                      | vacuum_stmt
                                       )
 ;

def_all :
    def_function
//    | def_function_default_value
//    | higher_order_stmt
//   | var_init
//   | var_operator
   | var_get_func
//   | def_print_stmt
//   | if_stmt
//   | inline_condition_stmt
//   | while_stmt
//   | do_while_stmt
//   | for_stmt
//   | switch_stmt
//   | higher_order_stmt
   | func_argument_list
//   | def_function_default_value
//    | json_stmt
//   | array_stmt
   ;

def_function: // this is func params list
    K_VAR? K_FUNCTION? any_name OPEN_PAR ( K_VAR any_name(',' K_VAR any_name)* )? CLOSE_PAR
    OPEN_B
    body
    CLOSE_B
 ;

body:
    (var_init | def_print_stmt | if_stmt | while_stmt | do_while_stmt | for_stmt
//    | array_stmt
    | switch_stmt | inline_condition_stmt
//     | json_stmt ';'?
     | sql_stmt_list ';' | var_get_func | func_argument_list
//      |  call_json | edit_json
     | var_operator)*
    return_stmt?
 ;

var_get_func
   : K_VAR IDENTIFIER ASSIGN (K_FUNCTION | any_name) OPEN_PAR (any_name (',' any_name)*)? CLOSE_PAR ';'
;

//var_init
//   : K_VAR any_name (ASSIGN (any_name | signed_number | sql_stmt_list | inline_condition_stmt))?';'
//   |K_VAR? any_name (ASSIGN (any_name | signed_number | sql_stmt_list | inline_condition_stmt))?';'
//    |any_name OPEN_ARRAY expr CLOSE_ARRAY (ASSIGN (any_name | signed_number | sql_stmt_list | inline_condition_stmt))?';'
//;
var_init:
K_VAR any_name ASSIGN expr';';

var_operator
   : expr_for_and_operator ';'*
;

def_print_stmt
   : K_VAR? K_PRINT OPEN_PAR print_body CLOSE_PAR ';'
;


print_body: expr_print* ;
//
//expr
// : literal_value
// | any_name
// | BIND_PARAMETER
// | ( ( database_name '.' )? table_name '.' )? column_name
// | unary_operator expr
// | expr '||' expr
// | expr ( '*' | '/' | '%' ) expr
// | expr ( '+' | '-' ) expr
// | expr ( '<<' | '>>' | '&' | '|' ) expr
// | expr ( '<' | '<=' | '>' | '>=' ) expr
// | expr ( '=' | '==' | '!=' | '<>' | K_IS | K_IS K_NOT | K_IN | K_LIKE | K_GLOB | K_MATCH | K_REGEXP ) expr
// | expr K_AND expr
// | expr K_OR expr
// | function_name '(' ( K_DISTINCT? expr ( ',' expr )* | '*' )? ')'
// | '(' expr ')'
//  | '[' expr ']'
//    | '[' var_operator ']'
// | K_CAST '(' expr K_AS type_name ')'
// | expr K_COLLATE collation_name
// | expr K_NOT? ( K_LIKE | K_GLOB | K_REGEXP | K_MATCH ) expr ( K_ESCAPE expr )?
// | expr ( K_ISNULL | K_NOTNULL | K_NOT K_NULL )
// | expr K_IS K_NOT? expr
// | expr K_NOT? K_BETWEEN expr K_AND expr
// | expr K_NOT? K_IN ( '(' ( select_stmt
//                          | expr ( ',' expr )*
//                          )?
//                      ')'
//                    | ( database_name '.' )? table_name )
// | ( ( K_NOT )? K_EXISTS )? '(' select_stmt ')'
// | K_CASE expr? ( K_WHEN expr K_THEN expr )+ ( K_ELSE expr )? K_END
//// | raise_function
// ;

if_stmt:
   K_IF OPEN_PAR expr_if CLOSE_PAR
   (OPEN_B body CLOSE_B | body)
   (else_if_stmt)*
    else_stmt?
;

else_if_stmt:
    K_ELSE K_IF OPEN_PAR expr_if CLOSE_PAR
    (OPEN_B body CLOSE_B | body)
;

else_stmt:
    K_ELSE
    (OPEN_B body CLOSE_B | body)
;

inline_condition_stmt:
    expr_if QuesM (expr | expr_for_and_operator) ORM (expr | expr_for_and_operator) ';'*
    |expr_if QuesM OPEN_PAR* inline_condition_stmt CLOSE_PAR* ORM OPEN_PAR* inline_condition_stmt CLOSE_PAR* ';'*

;

while_stmt :
    K_WHILE OPEN_PAR expr_while CLOSE_PAR
    (OPEN_B body CLOSE_B | body)
;

do_while_stmt :
    K_DO
      OPEN_B
      body
      CLOSE_B
       while_do_stmt ';'
    ;

while_do_stmt :
    K_WHILE OPEN_PAR expr_while CLOSE_PAR
;

for_stmt :
    K_FOR OPEN_PAR (for_rule | foreach_rule) CLOSE_PAR
    (OPEN_B body CLOSE_B | body)
;

for_rule
    : K_VAR? expr_for_and_operator? SCOL expr_if SCOL expr_for_and_operator?
;

foreach_rule
    :  K_VAR any_name ':' any_name
;

return_stmt :
    K_RETURN (expr | var_operator | inline_condition_stmt) ';'
;

//array_stmt
//  : K_VAR? ( ('['']' any_name) | (any_name '['']') ) ';'*
//   ('=' OPEN_B (any_name | signed_number) (',' (any_name | signed_number) )* CLOSE_B ';'*
//   |'='  '[' (any_name | signed_number) (',' (any_name | signed_number) )* ']' ';'*
//   |'=' sql_stmt_list )?
//;

switch_stmt
  : K_SWITCH OPEN_PAR any_name CLOSE_PAR
    OPEN_B
     (K_CASE (any_name | signed_number) ':' (body | OPEN_B body (K_BREAK';')? CLOSE_B ';'*) (K_BREAK';')? )*
     (K_DEFAULT ':'
     (body | OPEN_B body (K_BREAK';')? CLOSE_B ';'*)? (K_BREAK';')?)?
    CLOSE_B
;

//higher_order_stmt
//  : (K_VAR IDENTIFIER '=')? IDENTIFIER
//    OPEN_PAR
//    IDENTIFIER /*(',' IDENTIFIER)*/* ',' K_FUNCTION
//       OPEN_PAR (IDENTIFIER (','IDENTIFIER)*)? CLOSE_PAR
//       OPEN_B
//        K_RETURN expr ';'
//       CLOSE_B
//    CLOSE_PAR ';'
//;

func_argument_list
  : (K_FUNCTION | any_name) OPEN_PAR (any_name (',' any_name)*)? CLOSE_PAR ';'
;

//def_function_default_value:
//    K_VAR? (K_FUNCTION | any_name) OPEN_PAR ( K_VAR expr(',' K_VAR expr)* )? CLOSE_PAR
//    OPEN_B
//    body
//    CLOSE_B
// ;

//json_stmt
//  : K_VAR? any_name ASSIGN
//    OPEN_B
//    ( json_attribute | json_obj | json_array )*
//    CLOSE_B ';'
//;
//
//json_attribute
//  : IDENTIFIER ORM expr ','?
//;
//
//json_obj
//  : (IDENTIFIER ORM)? OPEN_B (json_attribute | json_obj | json_array)* CLOSE_B ','?
//;
//
//json_array
//  : IDENTIFIER ORM
//    OPEN_ARRAY
//    (json_obj | any_name (',' any_name)* | signed_number (',' signed_number)*)*
//    CLOSE_ARRAY ','?
//;
//
//call_json
//    : any_name ('.' any_name)* ';'*
//;
//
//edit_json
//    : any_name (DOT any_name)* ASSIGN (signed_number | expr) SCOL*
//;
//
//expr
// : literal_value
// | any_name
// | expr ( '*' | '/' | '%' ) expr
// | expr ( '+' | '-' ) expr
// | expr ( '<' | '<=' | '>' | '>=' ) expr
// | expr ( '==' | '!=' ) expr
// | expr K_AND expr
// | expr K_OR expr
// | expr PIPE2 expr
// | expr AND expr
// | '(' expr ')'
// | K_CAST '(' expr K_AS type_name ')'
// ;
//
//expr
//  : literal_value
//  | any_name
//  | (any_name (PLUS_PLUS | MINUS_MINUS))
//  | ((PLUS_PLUS | MINUS_MINUS) any_name)
//  | expr ( '=' | '=+' | '=-' | '-=' | '+=' | '*=' | '/=' ) expr
//  | '(' expr ')'
//  ;
//
//alter_table_stmt
// : K_ALTER K_TABLE K_ONLY? ( database_name '.' )? source_table_name
//   ( K_RENAME K_TO new_table_name
//   | alter_table_add
//   | alter_table_add_constraint
//   | K_ADD K_COLUMN? column_def
//   )
//   K_ENABLE? (unknown)?
// ;
//
//alter_table_add_constraint
// : K_ADD K_CONSTRAINT any_name table_constraint
// ;
//
//alter_table_add
// : K_ADD table_constraint
// ;
//
//analyze_stmt
// : K_ANALYZE ( database_name | table_or_index_name | database_name '.' table_or_index_name )?
// ;
//
//attach_stmt
// : K_ATTACH K_DATABASE? expr K_AS database_name
// ;
//
//begin_stmt
// : K_BEGIN ( K_DEFERRED | K_IMMEDIATE | K_EXCLUSIVE )? ( K_TRANSACTION transaction_name? )?
// ;
//
//commit_stmt
// : ( K_COMMIT | K_END ) ( K_TRANSACTION transaction_name? )?
// ;
//
//compound_select_stmt
// : ( K_WITH K_RECURSIVE? common_table_expression ( ',' common_table_expression )* )?
//   select_core ( ( K_UNION K_ALL? | K_INTERSECT | K_EXCEPT ) select_core )+
//   ( K_ORDER K_BY ordering_term ( ',' ordering_term )* )?
//   ( K_LIMIT expr ( ( K_OFFSET | ',' ) expr )? )?
// ;
//
//create_index_stmt
// : K_CREATE K_UNIQUE? K_INDEX ( K_IF K_NOT K_EXISTS )?
//   ( database_name '.' )? index_name K_ON table_name '(' indexed_column ( ',' indexed_column )* ')'
//   ( K_WHERE expr )?
// ;

create_table_stmt
// : K_CREATE ( K_TEMP | K_TEMPORARY )? K_TABLE ( K_IF K_NOT K_EXISTS )?
 : K_CREATE  K_TABLE ( K_IF K_NOT K_EXISTS )?
   ( database_name '.' )? table_name
//   ( '(' column_def ( ',' table_constraint | ',' column_def )* ')' ( K_WITHOUT IDENTIFIER )?
   ( '(' column_def ( ',' table_constraint | ',' column_def )* ')'
   (K_TYPE ASSIGN (K_JSON | K_CSV) ',' 'path' ASSIGN any_name)?
//   | K_AS select_stmt
//   ) (unknown)?
   )
 ;

create_type_stmt
// : K_CREATE ( K_TEMP | K_TEMPORARY )? K_TABLE ( K_IF K_NOT K_EXISTS )?
 : K_CREATE  K_TYPE ( K_IF K_NOT K_EXISTS )?
   any_name
//   ( '(' column_def ( ',' table_constraint | ',' column_def )* ')' ( K_WITHOUT IDENTIFIER )?
   ( '(' column_def (    ',' column_def )* ')'
   )
 ;

create_aggr_func
 : K_CREATE  K_AGGREGATION_FUNCTION any_name
   ( '(' jar_path ',' class_name ',' method_name ',' return_type ',' array_aggr ')' )
 ;

jar_path:
 any_name
 ;

class_name:
 any_name
 ;

method_name:
 any_name
 ;

return_type:
 any_name
  ;

array_aggr:
'[' any_name (',' any_name)* ']'
;


//create_type_stmt
// : K_CREATE  K_TYPE ( K_IF K_NOT K_EXISTS )?
//   any_name
//   (
//   '('type')'
//   )
// ;
//type:
//    (any_name type ','? )*
////   |K_NUMBER
////   |K_STRING
////   |K_BOOLEAN
//   ;



//create_trigger_stmt
// : K_CREATE ( K_TEMP | K_TEMPORARY )? K_TRIGGER ( K_IF K_NOT K_EXISTS )?
//   ( database_name '.' )? trigger_name ( K_BEFORE  | K_AFTER | K_INSTEAD K_OF )?
//   ( K_DELETE | K_INSERT | K_UPDATE ( K_OF column_name ( ',' column_name )* )? ) K_ON ( database_name '.' )? table_name
//   ( K_FOR K_EACH K_ROW )? ( K_WHEN expr )?
//   K_BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) ';' )+ K_END
// ;
//
//create_view_stmt
// : K_CREATE ( K_TEMP | K_TEMPORARY )? K_VIEW ( K_IF K_NOT K_EXISTS )?
//   ( database_name '.' )? view_name K_AS select_stmt
// ;
//
//create_virtual_table_stmt
// : K_CREATE K_VIRTUAL K_TABLE ( K_IF K_NOT K_EXISTS )?
//   ( database_name '.' )? table_name
//   K_USING module_name ( '(' module_argument ( ',' module_argument )* ')' )?
// ;
//
//delete_stmt
//// : with_clause? K_DELETE K_FROM qualified_table_name
// :  K_DELETE K_FROM qualified_table_name
//   ( K_WHERE expr )?
// ;
//
//delete_stmt_limited
// : with_clause? K_DELETE K_FROM qualified_table_name
//   ( K_WHERE expr )?
//   ( ( K_ORDER K_BY ordering_term ( ',' ordering_term )* )?
//     K_LIMIT expr ( ( K_OFFSET | ',' ) expr )?
//   )?
// ;
//
//detach_stmt
// : K_DETACH K_DATABASE? database_name
// ;
//
//drop_index_stmt
// : K_DROP K_INDEX ( K_IF K_EXISTS )? ( database_name '.' )? index_name
// ;
//
//drop_table_stmt
// : K_DROP K_TABLE ( K_IF K_EXISTS )? ( database_name '.' )? table_name
// ;
//
//drop_trigger_stmt
// : K_DROP K_TRIGGER ( K_IF K_EXISTS )? ( database_name '.' )? trigger_name
// ;
//
//drop_view_stmt
// : K_DROP K_VIEW ( K_IF K_EXISTS )? ( database_name '.' )? view_name
// ;

factored_select_stmt
 :
//  ( K_WITH K_RECURSIVE? common_table_expression ( ',' common_table_expression )* )?
   select_core
   ( K_ORDER K_BY ordering_term ( ',' ordering_term )* )?
   ( K_LIMIT expr ( ( K_OFFSET | ',' ) expr )? )?
 ;

//insert_stmt
//// : with_clause? ( K_INSERT
////                | K_REPLACE
////                | K_INSERT K_OR K_REPLACE
////                | K_INSERT K_OR K_ROLLBACK
////                | K_INSERT K_OR K_ABORT
////                | K_INSERT K_OR K_FAIL
////                | K_INSERT K_OR K_IGNORE ) K_INTO
//                :   K_INSERT  K_INTO
//   ( database_name '.' )? table_name ( '(' column_name ( ',' column_name )* ')' )?
//   ( K_VALUES '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )*
//   | select_stmt
//   | K_DEFAULT K_VALUES
//   )
// ;
//
//pragma_stmt
// : K_PRAGMA ( database_name '.' )? pragma_name ( '=' pragma_value
//                                               | '(' pragma_value ')' )?
// ;
//
//reindex_stmt
// : K_REINDEX ( collation_name
//             | ( database_name '.' )? ( table_name | index_name )
//             )?
// ;
//
//release_stmt
// : K_RELEASE K_SAVEPOINT? savepoint_name
// ;
//
//rollback_stmt
// : K_ROLLBACK ( K_TRANSACTION transaction_name? )? ( K_TO K_SAVEPOINT? savepoint_name )?
// ;
//
//savepoint_stmt
// : K_SAVEPOINT savepoint_name
// ;
//
//simple_select_stmt
// : ( K_WITH K_RECURSIVE? common_table_expression ( ',' common_table_expression )* )?
//   select_core ( K_ORDER K_BY ordering_term ( ',' ordering_term )* )?
//   ( K_LIMIT expr ( ( K_OFFSET | ',' ) expr )? )?
// ;

select_stmt
// : ( K_WITH K_RECURSIVE? common_table_expression ( ',' common_table_expression )* )?
// :  select_or_values ( compound_operator select_or_values )*
 :  select_or_values
   ( K_ORDER K_BY ordering_term ( ',' ordering_term )* )?
   ( K_LIMIT expr ( ( K_OFFSET | ',' ) expr )? )?
 ;

select_or_values
 : K_SELECT ( K_DISTINCT | K_ALL )? result_column ( ',' result_column )*
   ( K_FROM ( table_or_subquery ( ',' table_or_subquery )* | join_clause ) )?
   ( K_WHERE expr )?
   ( K_GROUP K_BY expr ( ',' expr )* ( K_HAVING expr )? )?
 | K_VALUES '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )*
 ;

//update_stmt
//// : with_clause? K_UPDATE ( K_OR K_ROLLBACK
//// :  K_UPDATE ( K_OR K_ROLLBACK
////                         | K_OR K_ABORT
////                         | K_OR K_REPLACE
////                         | K_OR K_FAIL
////                         | K_OR K_IGNORE )? qualified_table_name
//                         :  K_UPDATE  qualified_table_name
//   K_SET column_name '=' expr ( ',' column_name '=' expr )* ( K_WHERE expr )?
// ;
//
//update_stmt_limited
// : with_clause? K_UPDATE ( K_OR K_ROLLBACK
//                         | K_OR K_ABORT
//                         | K_OR K_REPLACE
//                         | K_OR K_FAIL
//                         | K_OR K_IGNORE )? qualified_table_name
//   K_SET column_name '=' expr ( ',' column_name '=' expr )* ( K_WHERE expr )?
//   ( ( K_ORDER K_BY ordering_term ( ',' ordering_term )* )?
//     K_LIMIT expr ( ( K_OFFSET | ',' ) expr )?
//   )?
// ;
//
//vacuum_stmt
// : K_VACUUM
// ;

column_def
 : column_name ( column_constraint | type_name )*
// |type
 ;

type_name
 : name ( '(' signed_number (any_name)? ')'
         | '(' signed_number (any_name)? ',' signed_number (any_name)? ')' )?
 ;

column_constraint
 : ( K_CONSTRAINT name )?
   ( column_constraint_primary_key
   | column_constraint_foreign_key
   | column_constraint_not_null
   | column_constraint_null
//   | K_UNIQUE conflict_clause
   | K_UNIQUE
   | K_CHECK '(' expr ')'
   | column_default
   | K_COLLATE collation_name
   )
 ;

 column_constraint_primary_key
 // : K_PRIMARY K_KEY ( K_ASC | K_DESC )? conflict_clause K_AUTOINCREMENT?
  : K_PRIMARY K_KEY ( K_ASC | K_DESC )?  K_AUTOINCREMENT?
  ;

column_constraint_foreign_key
 : foreign_key_clause
 ;

column_constraint_not_null
// : K_NOT K_NULL conflict_clause
 : K_NOT K_NULL
 ;

column_constraint_null
// : K_NULL conflict_clause
 : K_NULL
 ;

column_default
 : K_DEFAULT (column_default_value | '(' expr ')' | K_NEXTVAL '(' expr ')' | any_name )  ( '::' any_name+ )?
 ;

column_default_value
 : ( signed_number | literal_value )
 ;

//
//conflict_clause
// : ( K_ON K_CONFLICT ( K_ROLLBACK
//                     | K_ABORT
//                     | K_FAIL
//                     | K_IGNORE
//                     | K_REPLACE
//                     )
//   )?
// ;

/*
    SQLite understands the following binary operators, in order from highest to
    lowest precedence:

    ||
    *    /    %
    +    -
    <<   >>   &    |
    <    <=   >    >=
    =    ==   !=   <>   IS   IS NOT   IN   LIKE   GLOB   MATCH   REGEXP
    AND
    OR
*/
expr
 : literal_value
// | BIND_PARAMETER
 | ( ( database_name '.' )? table_name '.' )? column_name
 | unary_operator expr
 | expr PIPE2 expr
 | expr ( STAR | DIV | MOD ) expr
 | expr ( PLUS | MINUS ) expr
 | expr ( LT2 | GT2 | AMP | PIPE ) expr
 | expr ( LT | LT_EQ | GT | GT_EQ ) expr
 | expr ( ASSIGN | EQ | NOT_EQ1 | NOT_EQ2 | K_IS | K_IS K_NOT | K_IN | K_LIKE | K_GLOB | K_MATCH | K_REGEXP ) expr
 | expr K_AND expr
 | expr K_OR expr
 | function_name OPEN_PAR ( K_DISTINCT? expr ( COMMA expr )* | STAR )? CLOSE_PAR
 | OPEN_PAR expr CLOSE_PAR
// | K_CAST '(' expr K_AS type_name ')'
// | expr K_COLLATE collation_name
// | expr K_NOT? ( K_LIKE | K_GLOB | K_REGEXP | K_MATCH ) expr ( K_ESCAPE expr )?
// | expr ( K_ISNULL | K_NOTNULL | K_NOT K_NULL )
// | expr K_IS K_NOT? expr
// | expr K_NOT? K_BETWEEN expr K_AND expr
 | expr K_NOT? K_IN ( OPEN_PAR ( select_stmt
                          | expr ( COMMA expr )*
                          )?
                      CLOSE_PAR
                    | ( database_name DOT )? table_name )
 | ( ( K_NOT )? K_EXISTS )? OPEN_PAR select_stmt CLOSE_PAR
 |inline_condition_stmt
 |sql_stmt_list
// | K_CASE expr? ( K_WHEN expr K_THEN expr )+ ( K_ELSE expr )? K_END
// | raise_function
 ;

expr_while
  : literal_value
  | any_name
  | expr_while ( STAR | DIV | MOD ) expr_while
  | expr_while ( PLUS | MINUS ) expr_while
  | expr_while ( LT | LT_EQ | GT | GT_EQ ) expr_while
  | expr_while ( EQ | NOT_EQ1 ) expr_while
  | expr_while K_AND expr_while
  | expr_while K_OR expr_while
  | expr_while PIPE2 expr_while
  | expr_while AND expr_while
//    | any_name OPEN_ARRAY expr CLOSE_ARRAY (expr_while call_json)?
    | any_name OPEN_ARRAY expr CLOSE_ARRAY expr_while any_name OPEN_ARRAY expr CLOSE_ARRAY
    | any_name OPEN_ARRAY expr CLOSE_ARRAY expr_while (any_name | signed_number)
//    | call_json expr_while (any_name | signed_number)
//    | call_json (expr_while call_json)?
//    | call_json expr_while any_name OPEN_ARRAY expr CLOSE_ARRAY
  | OPEN_PAR expr_while CLOSE_PAR
  | K_CAST OPEN_PAR expr_while K_AS type_name CLOSE_PAR
  ;

 expr_if
  : literal_value
  | any_name
  | expr_if ( STAR | DIV | MOD ) expr_if
  | expr_if ( PLUS | MINUS ) expr_if
  | expr_if ( LT | LT_EQ | GT | GT_EQ ) expr_if
  | expr_if ( EQ | NOT_EQ1 ) expr_if
  | expr_if K_AND expr_if
  | expr_if K_OR expr_if
  | expr_if PIPE2 expr_if
  | expr_if AND expr_if
//  | any_name OPEN_ARRAY expr CLOSE_ARRAY (expr_if call_json)?
  | any_name OPEN_ARRAY expr CLOSE_ARRAY expr_if any_name OPEN_ARRAY expr CLOSE_ARRAY
  | any_name OPEN_ARRAY expr CLOSE_ARRAY expr_if (any_name | signed_number)
//  | call_json expr_if (any_name | signed_number)
//  | call_json (expr_if call_json)?
//  | call_json expr_if any_name OPEN_ARRAY expr CLOSE_ARRAY
  | OPEN_ARRAY any_name CLOSE_ARRAY
  | OPEN_PAR expr_if CLOSE_PAR
  | K_CAST OPEN_PAR expr_if K_AS type_name CLOSE_PAR
  ;

expr_for_and_operator
    : literal_value
    | any_name
    | (any_name (PLUS_PLUS | MINUS_MINUS))
    | ((PLUS_PLUS | MINUS_MINUS) any_name)
    | expr_for_and_operator ( ASSIGN | EQ_WITH_PLUS | EQ_WITH_MINUS | MINUS_WITH_EQ | PLUS_WITH_EQ | STAR_WITH_EQ | DIV_WITH_EQ ) expr_for_and_operator
    | OPEN_PAR expr_for_and_operator CLOSE_PAR
    ;

    expr_print
      : literal_value
      | any_name
      | ( ( database_name '.' )? table_name '.' )? column_name
      | unary_operator expr_print
      | expr_print PIPE2 expr_print
      | expr_print ( STAR | DIV | MOD ) expr_print
      | expr_print ( PLUS | MINUS ) expr_print
      | expr_print ( LT2 | GT2 | AMP | PIPE ) expr_print
      | expr_print ( LT | LT_EQ | GT | GT_EQ ) expr_print
      | expr_print ( ASSIGN | EQ | NOT_EQ1 | NOT_EQ2 | K_IS | K_IS K_NOT | K_IN | K_LIKE | K_GLOB | K_MATCH | K_REGEXP ) expr_print
      | expr_print K_AND expr_print
      | expr_print K_OR expr_print
      | function_name OPEN_PAR ( K_DISTINCT? expr_print ( COMMA expr_print )* | STAR )? CLOSE_PAR
      | OPEN_PAR expr_print CLOSE_PAR
       | OPEN_ARRAY expr_print CLOSE_ARRAY
         | OPEN_ARRAY var_operator CLOSE_ARRAY
      | expr_print K_NOT? K_IN ( OPEN_PAR ( select_stmt
                               | expr_print ( COMMA expr_print )*
                               )?
                           CLOSE_PAR
                         | ( database_name DOT )? table_name )
      | ( ( K_NOT )? K_EXISTS )? OPEN_PAR select_stmt CLOSE_PAR
      ;


foreign_key_clause
 : K_REFERENCES ( database_name '.' )? foreign_table ( '(' fk_target_column_name ( ',' fk_target_column_name )* ')' )?
   ( ( K_ON ( K_DELETE | K_UPDATE ) ( K_SET K_NULL
                                    | K_SET K_DEFAULT
                                    | K_CASCADE
                                    | K_RESTRICT
                                    | K_NO K_ACTION )
     | K_MATCH name
     )
   )*
   ( K_NOT? K_DEFERRABLE ( K_INITIALLY K_DEFERRED | K_INITIALLY K_IMMEDIATE )? K_ENABLE? )?
 ;

fk_target_column_name
 : name
 ;
//
//raise_function
// : K_RAISE '(' ( K_IGNORE
//               | ( K_ROLLBACK | K_ABORT | K_FAIL ) ',' error_message )
//           ')'
// ;

indexed_column
 : column_name ( K_COLLATE collation_name )? ( K_ASC | K_DESC )?
 ;

table_constraint
 : ( K_CONSTRAINT name )?
   ( table_constraint_primary_key
   | table_constraint_key
   | table_constraint_unique
   | K_CHECK '(' expr ')'
   | table_constraint_foreign_key
   )
 ;

table_constraint_primary_key
// : K_PRIMARY K_KEY '(' indexed_column ( ',' indexed_column )* ')' conflict_clause
 : K_PRIMARY K_KEY '(' indexed_column ( ',' indexed_column )* ')'
 ;
table_constraint_foreign_key
 : K_FOREIGN K_KEY '(' fk_origin_column_name ( ',' fk_origin_column_name )* ')' foreign_key_clause
 ;

table_constraint_unique
// : K_UNIQUE K_KEY? name? '(' indexed_column ( ',' indexed_column )* ')' conflict_clause
 : K_UNIQUE K_KEY? name? '(' indexed_column ( ',' indexed_column )* ')'
 ;

table_constraint_key
// : K_KEY name? '(' indexed_column ( ',' indexed_column )* ')' conflict_clause
 : K_KEY name? '(' indexed_column ( ',' indexed_column )* ')'
 ;

fk_origin_column_name
 : column_name
 ;

//
//with_clause
// : K_WITH K_RECURSIVE? cte_table_name K_AS '(' select_stmt ')' ( ',' cte_table_name K_AS '(' select_stmt ')' )*
// ;

qualified_table_name
 : ( database_name '.' )? table_name ( K_INDEXED K_BY index_name
                                     | K_NOT K_INDEXED )?
 ;

ordering_term
 : expr  ( K_ASC | K_DESC )?
 ;

pragma_value
 : signed_number
 | name
 | STRING_LITERAL
 ;

common_table_expression
 : table_name ( '(' column_name ( ',' column_name )* ')' )? K_AS '(' select_stmt ')'
 ;

result_column
 : STAR
 | table_name '.' STAR
 | expr ( K_AS? column_alias )?
 ;

table_or_subquery
 : ( database_name '.' )? table_name ( K_AS? table_alias )?
   ( K_INDEXED K_BY index_name
   | K_NOT K_INDEXED )?
 | '(' ( table_or_subquery ( ',' table_or_subquery )*
       | join_clause )
   ')' ( K_AS? table_alias )?
 | '(' select_stmt ')' ( K_AS? table_alias )?
 ;

join_clause
 : table_or_subquery ( join_operator table_or_subquery join_constraint )*
// : table_or_subquery ( join_operator table_or_subquery  )*
 ;

join_operator
 : ','
// | K_NATURAL? ( K_LEFT K_OUTER? | K_INNER | K_CROSS )? K_JOIN
 |  ( K_LEFT K_OUTER? | K_INNER  )? K_JOIN
 ;

join_constraint
// : ( K_ON expr
//   | K_USING '(' column_name ( ',' column_name )* ')' )?
    : ( K_ON expr)?
 ;

select_core
 : K_SELECT ( K_DISTINCT | K_ALL )? result_column ( ',' result_column )*
   ( K_FROM ( table_or_subquery ( ',' table_or_subquery )* | join_clause ) )?
   ( K_WHERE expr )?
   ( K_GROUP K_BY expr ( ',' expr )* ( K_HAVING expr )? )?
 | K_VALUES '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )*
 ;

//compound_operator
// : K_UNION
// | K_UNION K_ALL
// | K_INTERSECT
// | K_EXCEPT
// ;

cte_table_name
 : table_name ( '(' column_name ( ',' column_name )* ')' )?
 ;

signed_number
 : ( ( PLUS | MINUS )? NUMERIC_LITERAL | STAR )
 ;

literal_value
 : NUMERIC_LITERAL
 | STRING_LITERAL
 | BLOB_LITERAL
 | K_NULL
 | K_CURRENT_TIME
 | K_CURRENT_DATE
 | K_CURRENT_TIMESTAMP
 ;

unary_operator
 : MINUS
 | PLUS
 | TILDE
 | K_NOT
 ;

error_message
 : STRING_LITERAL
 ;

module_argument // TODO check what exactly is permitted here
 : expr
 | column_def
 ;

column_alias
 : IDENTIFIER
 | STRING_LITERAL
 ;


keyword
 : K_ABORT
 | K_ACTION
 | K_ADD
 | K_AFTER
 | K_ALL
 | K_ALTER
 | K_ANALYZE
 | K_AND
 | K_AS
 | K_ASC
 | K_ATTACH
 | K_AUTOINCREMENT
 | K_BEFORE
 | K_BEGIN
 | K_BETWEEN
 | K_BY
 | K_CASCADE
 | K_CASE
 | K_CAST
 | K_CHECK
 | K_COLLATE
 | K_COLUMN
 | K_COMMIT
 | K_CONFLICT
 | K_CONSTRAINT
 | K_CREATE
 | K_CROSS
 | K_CURRENT_DATE
 | K_CURRENT_TIME
 | K_CURRENT_TIMESTAMP
 | K_DATABASE
 | K_DEFAULT
 | K_DEFERRABLE
 | K_DEFERRED
 | K_DELETE
 | K_DESC
 | K_DETACH
 | K_DISTINCT
 | K_DROP
 | K_EACH
 | K_ELSE
 | K_END
 | K_ENABLE
 | K_ESCAPE
 | K_EXCEPT
 | K_EXCLUSIVE
 | K_EXISTS
 | K_EXPLAIN
 | K_FAIL
 | K_FOR
 | K_FOREIGN
 | K_FROM
 | K_FULL
 | K_GLOB
 | K_GROUP
 | K_HAVING
 | K_IF
 | K_IGNORE
 | K_IMMEDIATE
 | K_IN
 | K_INDEX
 | K_INDEXED
 | K_INITIALLY
 | K_INNER
 | K_INSERT
 | K_INSTEAD
 | K_INTERSECT
 | K_INTO
 | K_IS
 | K_ISNULL
 | K_JOIN
 | K_KEY
 | K_LEFT
 | K_LIKE
 | K_LIMIT
 | K_MATCH
 | K_NATURAL
 | K_NO
 | K_NOT
 | K_NOTNULL
 | K_NULL
 | K_OF
 | K_OFFSET
 | K_ON
 | K_OR
 | K_ORDER
 | K_OUTER
 | K_PLAN
 | K_PRAGMA
 | K_PRIMARY
 | K_QUERY
 | K_RAISE
 | K_RECURSIVE
 | K_REFERENCES
 | K_REGEXP
 | K_REINDEX
 | K_RELEASE
 | K_RENAME
 | K_REPLACE
 | K_RESTRICT
 | K_RIGHT
 | K_ROLLBACK
 | K_ROW
 | K_SAVEPOINT
 | K_SELECT
 | K_SET
 | K_TABLE
 | K_TEMP
 | K_TEMPORARY
 | K_THEN
 | K_TO
 | K_TRANSACTION
 | K_TRIGGER
 | K_UNION
 | K_UNIQUE
 | K_UPDATE
 | K_USING
 | K_VACUUM
 | K_VALUES
 | K_VIEW
 | K_VIRTUAL
 | K_WHEN
 | K_WHERE
 | K_WITH
 | K_WITHOUT
 | K_NEXTVAL
 ;

// TODO check all names below

//[a-zA-Z_0-9\t \-\[\]\=]+
unknown
 : .+
 ;

name
 : any_name
 ;

function_name
 : any_name
 ;

database_name
 : any_name
 ;

source_table_name
 : any_name
 ;

table_name
 : any_name
// |keyword
 ;

table_or_index_name
 : any_name
 ;

new_table_name
 : any_name
 ;

column_name
 : any_name
 ;

collation_name
 : any_name
 ;

foreign_table
 : any_name
 ;

index_name
 : any_name
 ;

trigger_name
 : any_name
 ;

view_name
 : any_name
 ;

module_name
 : any_name
 ;

pragma_name
 : any_name
 ;

savepoint_name
 : any_name
 ;

table_alias
 : any_name
 ;

transaction_name
 : any_name
 ;

any_name
 : IDENTIFIER
// | keyword
 | STRING_LITERAL
 | '(' any_name ')'
 ;



any_name_identifier_json
 : IDENTIFIER_JSON_ARRAY
 | keyword
 | STRING_LITERAL
 | '(' any_name ')'
 ;


SCOL : ';';
DOT : '.';
OPEN_PAR : '(';
CLOSE_PAR : ')';
OPEN_B : '{';
CLOSE_B : '}';
AND : '&&';
COMMA : ',';
ASSIGN : '=';
STAR : '*';
PLUS : '+';
PLUS_PLUS : '++'; // em
MINUS : '-';
MINUS_MINUS : '--'; // em
TILDE : '~';
PIPE2 : '||';
DIV : '/';
MOD : '%';
LT2 : '<<';
GT2 : '>>';
AMP : '&';
PIPE : '|';
LT : '<';
LT_EQ : '<=';
GT : '>';
GT_EQ : '>=';
EQ : '==';
EQ_WITH_PLUS : '=+';
PLUS_WITH_EQ : '+=';
EQ_WITH_MINUS : '=-';
MINUS_WITH_EQ : '-=';
STAR_WITH_EQ : '*=';
DIV_WITH_EQ : '/=';
NOT_EQ1 : '!=';
NOT_EQ2 : '<>';
OPEN_ARRAY : '['; // em
CLOSE_ARRAY : ']'; // em
QuesM : '?';        // tareq
ORM : ':';          // tareq
// http://www.sqlite.org/lang_keywords.html
K_ABORT : A B O R T;
K_ACTION : A C T I O N;
K_ADD : A D D;
K_AFTER : A F T E R;
K_ALL : A L L;
K_ALTER : A L T E R;
K_ANALYZE : A N A L Y Z E;
K_AND : A N D;
K_AS : A S;
K_ASC : A S C;
K_ATTACH : A T T A C H;
K_AUTOINCREMENT : A U T O I N C R E M E N T;
K_BEFORE : B E F O R E;
K_BEGIN : B E G I N;
K_BETWEEN : B E T W E E N;
K_BREAK : B R E A K;
K_BY : B Y;
K_CASCADE : C A S C A D E;
K_CASE : C A S E;
K_CAST : C A S T;
K_CHECK : C H E C K;
K_COLLATE : C O L L A T E;
K_COLUMN : C O L U M N;
K_COMMIT : C O M M I T;
K_CONFLICT : C O N F L I C T;
K_CONSTRAINT : C O N S T R A I N T;
K_CREATE : C R E A T E;
K_CROSS : C R O S S;
K_CURRENT_DATE : C U R R E N T '_' D A T E;
K_CURRENT_TIME : C U R R E N T '_' T I M E;
K_CURRENT_TIMESTAMP : C U R R E N T '_' T I M E S T A M P;
K_DATABASE : D A T A B A S E;
K_DEFAULT : D E F A U L T;
K_DEFERRABLE : D E F E R R A B L E;
K_DEFERRED : D E F E R R E D;
K_DELETE : D E L E T E;
K_DESC : D E S C;
K_DETACH : D E T A C H;
K_DISTINCT : D I S T I N C T;
K_DO : D O;
K_DROP : D R O P;
K_EACH : E A C H;
K_ELSE : E L S E;
K_END : E N D;
K_ENABLE : E N A B L E;
K_ESCAPE : E S C A P E;
K_EXCEPT : E X C E P T;
K_EXCLUSIVE : E X C L U S I V E;
K_EXISTS : E X I S T S;
K_EXPLAIN : E X P L A I N;
K_FAIL : F A I L;
K_FOR : F O R;
K_FOREIGN : F O R E I G N;
K_FROM : F R O M;
K_FULL : F U L L;
K_FUNCTION : F U N C T I O N;
K_GLOB : G L O B;
K_GROUP : G R O U P;
K_HAVING : H A V I N G;
K_IF : I F;
K_IGNORE : I G N O R E;
K_IMMEDIATE : I M M E D I A T E;
K_IN : I N;
K_INDEX : I N D E X;
K_INDEXED : I N D E X E D;
K_INITIALLY : I N I T I A L L Y;
K_INNER : I N N E R;
K_INSERT : I N S E R T;
K_INSTEAD : I N S T E A D;
K_INTERSECT : I N T E R S E C T;
K_INTO : I N T O;
K_IS : I S;
K_ISNULL : I S N U L L;
K_JOIN : J O I N;
K_KEY : K E Y;
K_LEFT : L E F T;
K_LIKE : L I K E;
K_LIMIT : L I M I T;
K_MATCH : M A T C H;
K_NATURAL : N A T U R A L;
K_NEXTVAL : N E X T V A L;
K_NO : N O;
K_NOT : N O T;
K_NOTNULL : N O T N U L L;
K_NULL : N U L L;
K_OF : O F;
K_OFFSET : O F F S E T;
K_ON : O N;
K_ONLY : O N L Y;
K_OR : O R;
K_ORDER : O R D E R;
K_OUTER : O U T E R;
K_PLAN : P L A N;
K_PRAGMA : P R A G M A;
K_PRIMARY : P R I M A R Y;
K_PRINT : P R I N T;
K_QUERY : Q U E R Y;
K_RAISE : R A I S E;
K_RECURSIVE : R E C U R S I V E;
K_REFERENCES : R E F E R E N C E S;
K_REGEXP : R E G E X P;
K_REINDEX : R E I N D E X;
K_RELEASE : R E L E A S E;
K_RENAME : R E N A M E;
K_REPLACE : R E P L A C E;
K_RESTRICT : R E S T R I C T;
K_RETURN : R E T U R N;
K_RIGHT : R I G H T;
K_ROLLBACK : R O L L B A C K;
K_ROW : R O W;
K_SAVEPOINT : S A V E P O I N T;
K_SELECT : S E L E C T;
K_SET : S E T;
K_SWITCH : S W I T C H;
K_TABLE : T A B L E;
K_TEMP : T E M P;
K_TEMPORARY : T E M P O R A R Y;
K_THEN : T H E N;
K_TO : T O;
K_TRANSACTION : T R A N S A C T I O N;
K_TRIGGER : T R I G G E R;
K_UNION : U N I O N;
K_UNIQUE : U N I Q U E;
K_UPDATE : U P D A T E;
K_USING : U S I N G;
K_VACUUM : V A C U U M;
K_VALUES : V A L U E S;
K_VIEW : V I E W;
K_VIRTUAL : V I R T U A L;
K_WHEN : W H E N;
K_WHERE : W H E R E;
K_WHILE : W H I L E;
K_WITH : W I T H;
K_WITHOUT : W I T H O U T;
K_VAR : V A R;
K_TYPE : T Y P E;
K_CSV : C S V;
K_JSON : J S O N;
K_AGGREGATION_FUNCTION : A G G R E G A T I O N '_' F U N C T I O N;


IDENTIFIER
 : '"' (~'"' | '""')* '"'
 | '`' (~'`' | '``')* '`'
// | '[' ~']'* ']'  // em
 | [a-zA-Z_] [a-zA-Z_0-9]* // TODO check: needs more chars in set
 ;

IDENTIFIER_JSON_ARRAY  // em
 : '"' (~'"' | '""')* '"'
 | '`' (~'`' | '``')* '`'
 | [a-zA-Z_] [a-zA-Z_0-9]* // TODO check: needs more chars in set
 ;

NUMERIC_LITERAL
 : DIGIT+ ( '.' DIGIT* )? ( E [-+]? DIGIT+ )?
 | '.' DIGIT+ ( E [-+]? DIGIT+ )?
 ;

BIND_PARAMETER
 : '?' DIGIT*
// | [:@$] IDENTIFIER         (em)
 ;

STRING_LITERAL
 : '\'' ( ~'\'' | '\'\'' )* '\''
 ;

BLOB_LITERAL
 : X STRING_LITERAL
 ;

SINGLE_LINE_COMMENT
 : '//' ~[\r\n]* -> channel(HIDDEN)  // TODO here we changed '--' to '//' to make MINUS_MINUS (em)
 ;

MULTILINE_COMMENT
 : '/*' .*? ( '*/' | EOF ) -> channel(HIDDEN)
 ;

SPACES
 : [ \u000B\t\r\n] -> channel(HIDDEN)
 ;

UNEXPECTED_CHAR
 : .
 ;

fragment DIGIT : [0-9];

fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];
