grammar Expr;

options {
output = AST;
ASTLabelType = CommonTree;
}

@header {
	package grammar;
}

@lexer::header {
	package grammar;
}
	
prog : ( stat { System.out.println($stat.tree.toStringTree()); } )+
;

stat
: expr NEWLINE!
| ID ('='^) expr NEWLINE!
| NEWLINE!
;

expr
: term (('+'^|'-'^) term) *
;

term
: fact (('*'^|'/'^) fact) *
;

fact
: INT | ID | '('! expr ')'!
;

ID : ('a'..'z'|'A'..'Z')+ ;
INT : '1'..'9' '0'..'9'* | '0' ;
NEWLINE:'\r'? '\n' ;
WS : (' '|'\t')+ {skip();} ;