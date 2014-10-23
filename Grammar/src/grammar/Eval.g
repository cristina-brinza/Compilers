tree grammar Eval;

options {
tokenVocab = Expr;
ASTLabelType = CommonTree;
}

@header {
package grammar;
import java.util.HashMap;
}

@members {
HashMap memory = new HashMap();
}

prog: stat+ ;
stat: expr
{System.out.println($expr.value);}
| ^('=' ID expr)
{memory.put($ID.text, new Integer($expr.value));}
;

expr returns [int value]
: ^('+' a=expr b=expr) {$value = $a.value + $b.value;}
| ^('-' a=expr b=expr) {$value = $a.value - $b.value;}
| ^('*' a=expr b=expr) {$value = $a.value * $b.value;}
| ID
{
Integer v = (Integer)memory.get($ID.text);
if ( v!=null ) $value = v.intValue();
else System.err.println("undefined variable "+$ID.text);
}
| INT {$value = Integer.parseInt($INT.text);}
;