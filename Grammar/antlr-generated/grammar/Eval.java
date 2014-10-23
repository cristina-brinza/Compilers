// $ANTLR 3.4 /home/cristina/compilatoare/Grammar/src/grammar/Eval.g 2014-10-23 03:28:22

package grammar;
import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Eval extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "NEWLINE", "WS", "'('", "')'", "'*'", "'+'", "'-'", "'/'", "'='"
    };

    public static final int EOF=-1;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int ID=4;
    public static final int INT=5;
    public static final int NEWLINE=6;
    public static final int WS=7;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public Eval(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public Eval(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return Eval.tokenNames; }
    public String getGrammarFileName() { return "/home/cristina/compilatoare/Grammar/src/grammar/Eval.g"; }


    HashMap memory = new HashMap();



    // $ANTLR start "prog"
    // /home/cristina/compilatoare/Grammar/src/grammar/Eval.g:17:1: prog : ( stat )+ ;
    public final void prog() throws RecognitionException {
        try {
            // /home/cristina/compilatoare/Grammar/src/grammar/Eval.g:17:5: ( ( stat )+ )
            // /home/cristina/compilatoare/Grammar/src/grammar/Eval.g:17:7: ( stat )+
            {
            // /home/cristina/compilatoare/Grammar/src/grammar/Eval.g:17:7: ( stat )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= ID && LA1_0 <= INT)||(LA1_0 >= 10 && LA1_0 <= 12)||LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/cristina/compilatoare/Grammar/src/grammar/Eval.g:17:7: stat
            	    {
            	    pushFollow(FOLLOW_stat_in_prog42);
            	    stat();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "prog"



    // $ANTLR start "stat"
    // /home/cristina/compilatoare/Grammar/src/grammar/Eval.g:18:1: stat : ( expr | ^( '=' ID expr ) );
    public final void stat() throws RecognitionException {
        CommonTree ID2=null;
        int expr1 =0;

        int expr3 =0;


        try {
            // /home/cristina/compilatoare/Grammar/src/grammar/Eval.g:18:5: ( expr | ^( '=' ID expr ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0 >= ID && LA2_0 <= INT)||(LA2_0 >= 10 && LA2_0 <= 12)) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // /home/cristina/compilatoare/Grammar/src/grammar/Eval.g:18:7: expr
                    {
                    pushFollow(FOLLOW_expr_in_stat50);
                    expr1=expr();

                    state._fsp--;


                    System.out.println(expr1);

                    }
                    break;
                case 2 :
                    // /home/cristina/compilatoare/Grammar/src/grammar/Eval.g:20:3: ^( '=' ID expr )
                    {
                    match(input,14,FOLLOW_14_in_stat57); 

                    match(input, Token.DOWN, null); 
                    ID2=(CommonTree)match(input,ID,FOLLOW_ID_in_stat59); 

                    pushFollow(FOLLOW_expr_in_stat61);
                    expr3=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    memory.put((ID2!=null?ID2.getText():null), new Integer(expr3));

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "stat"



    // $ANTLR start "expr"
    // /home/cristina/compilatoare/Grammar/src/grammar/Eval.g:24:1: expr returns [int value] : ( ^( '+' a= expr b= expr ) | ^( '-' a= expr b= expr ) | ^( '*' a= expr b= expr ) | ID | INT );
    public final int expr() throws RecognitionException {
        int value = 0;


        CommonTree ID4=null;
        CommonTree INT5=null;
        int a =0;

        int b =0;


        try {
            // /home/cristina/compilatoare/Grammar/src/grammar/Eval.g:25:3: ( ^( '+' a= expr b= expr ) | ^( '-' a= expr b= expr ) | ^( '*' a= expr b= expr ) | ID | INT )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 10:
                {
                alt3=3;
                }
                break;
            case ID:
                {
                alt3=4;
                }
                break;
            case INT:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // /home/cristina/compilatoare/Grammar/src/grammar/Eval.g:25:3: ^( '+' a= expr b= expr )
                    {
                    match(input,11,FOLLOW_11_in_expr78); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr82);
                    a=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr86);
                    b=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    value = a + b;

                    }
                    break;
                case 2 :
                    // /home/cristina/compilatoare/Grammar/src/grammar/Eval.g:26:3: ^( '-' a= expr b= expr )
                    {
                    match(input,12,FOLLOW_12_in_expr94); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr98);
                    a=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr102);
                    b=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    value = a - b;

                    }
                    break;
                case 3 :
                    // /home/cristina/compilatoare/Grammar/src/grammar/Eval.g:27:3: ^( '*' a= expr b= expr )
                    {
                    match(input,10,FOLLOW_10_in_expr110); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr114);
                    a=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr118);
                    b=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    value = a * b;

                    }
                    break;
                case 4 :
                    // /home/cristina/compilatoare/Grammar/src/grammar/Eval.g:28:3: ID
                    {
                    ID4=(CommonTree)match(input,ID,FOLLOW_ID_in_expr125); 


                    Integer v = (Integer)memory.get((ID4!=null?ID4.getText():null));
                    if ( v!=null ) value = v.intValue();
                    else System.err.println("undefined variable "+(ID4!=null?ID4.getText():null));


                    }
                    break;
                case 5 :
                    // /home/cristina/compilatoare/Grammar/src/grammar/Eval.g:34:3: INT
                    {
                    INT5=(CommonTree)match(input,INT,FOLLOW_INT_in_expr131); 

                    value = Integer.parseInt((INT5!=null?INT5.getText():null));

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "expr"

    // Delegated rules


 

    public static final BitSet FOLLOW_stat_in_prog42 = new BitSet(new long[]{0x0000000000005C32L});
    public static final BitSet FOLLOW_expr_in_stat50 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_stat57 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_stat59 = new BitSet(new long[]{0x0000000000001C30L});
    public static final BitSet FOLLOW_expr_in_stat61 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_11_in_expr78 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr82 = new BitSet(new long[]{0x0000000000001C30L});
    public static final BitSet FOLLOW_expr_in_expr86 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_12_in_expr94 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr98 = new BitSet(new long[]{0x0000000000001C30L});
    public static final BitSet FOLLOW_expr_in_expr102 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_10_in_expr110 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr114 = new BitSet(new long[]{0x0000000000001C30L});
    public static final BitSet FOLLOW_expr_in_expr118 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_expr125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_expr131 = new BitSet(new long[]{0x0000000000000002L});

}