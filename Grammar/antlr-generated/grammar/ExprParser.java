// $ANTLR 3.4 /home/cristina/compilatoare/Grammar/src/grammar/Expr.g 2014-10-23 03:28:22

	package grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ExprParser extends Parser {
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public ExprParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ExprParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return ExprParser.tokenNames; }
    public String getGrammarFileName() { return "/home/cristina/compilatoare/Grammar/src/grammar/Expr.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home/cristina/compilatoare/Grammar/src/grammar/Expr.g:16:1: prog : ( stat )+ ;
    public final ExprParser.prog_return prog() throws RecognitionException {
        ExprParser.prog_return retval = new ExprParser.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        ExprParser.stat_return stat1 =null;



        try {
            // /home/cristina/compilatoare/Grammar/src/grammar/Expr.g:16:6: ( ( stat )+ )
            // /home/cristina/compilatoare/Grammar/src/grammar/Expr.g:16:8: ( stat )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // /home/cristina/compilatoare/Grammar/src/grammar/Expr.g:16:8: ( stat )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= ID && LA1_0 <= NEWLINE)||LA1_0==8) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/cristina/compilatoare/Grammar/src/grammar/Expr.g:16:10: stat
            	    {
            	    pushFollow(FOLLOW_stat_in_prog47);
            	    stat1=stat();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stat1.getTree());

            	     System.out.println((stat1!=null?((CommonTree)stat1.tree):null).toStringTree()); 

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

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class stat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stat"
    // /home/cristina/compilatoare/Grammar/src/grammar/Expr.g:19:1: stat : ( expr NEWLINE !| ID ( '=' ^) expr NEWLINE !| NEWLINE !);
    public final ExprParser.stat_return stat() throws RecognitionException {
        ExprParser.stat_return retval = new ExprParser.stat_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NEWLINE3=null;
        Token ID4=null;
        Token char_literal5=null;
        Token NEWLINE7=null;
        Token NEWLINE8=null;
        ExprParser.expr_return expr2 =null;

        ExprParser.expr_return expr6 =null;


        CommonTree NEWLINE3_tree=null;
        CommonTree ID4_tree=null;
        CommonTree char_literal5_tree=null;
        CommonTree NEWLINE7_tree=null;
        CommonTree NEWLINE8_tree=null;

        try {
            // /home/cristina/compilatoare/Grammar/src/grammar/Expr.g:20:3: ( expr NEWLINE !| ID ( '=' ^) expr NEWLINE !| NEWLINE !)
            int alt2=3;
            switch ( input.LA(1) ) {
            case INT:
            case 8:
                {
                alt2=1;
                }
                break;
            case ID:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==NEWLINE||(LA2_2 >= 10 && LA2_2 <= 13)) ) {
                    alt2=1;
                }
                else if ( (LA2_2==14) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;

                }
                }
                break;
            case NEWLINE:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /home/cristina/compilatoare/Grammar/src/grammar/Expr.g:20:3: expr NEWLINE !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_stat61);
                    expr2=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr2.getTree());

                    NEWLINE3=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stat63); 

                    }
                    break;
                case 2 :
                    // /home/cristina/compilatoare/Grammar/src/grammar/Expr.g:21:3: ID ( '=' ^) expr NEWLINE !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    ID4=(Token)match(input,ID,FOLLOW_ID_in_stat68); 
                    ID4_tree = 
                    (CommonTree)adaptor.create(ID4)
                    ;
                    adaptor.addChild(root_0, ID4_tree);


                    // /home/cristina/compilatoare/Grammar/src/grammar/Expr.g:21:6: ( '=' ^)
                    // /home/cristina/compilatoare/Grammar/src/grammar/Expr.g:21:7: '=' ^
                    {
                    char_literal5=(Token)match(input,14,FOLLOW_14_in_stat71); 
                    char_literal5_tree = 
                    (CommonTree)adaptor.create(char_literal5)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal5_tree, root_0);


                    }


                    pushFollow(FOLLOW_expr_in_stat75);
                    expr6=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr6.getTree());

                    NEWLINE7=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stat77); 

                    }
                    break;
                case 3 :
                    // /home/cristina/compilatoare/Grammar/src/grammar/Expr.g:22:3: NEWLINE !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    NEWLINE8=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stat82); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stat"


    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /home/cristina/compilatoare/Grammar/src/grammar/Expr.g:25:1: expr : term ( ( '+' ^| '-' ^) term )* ;
    public final ExprParser.expr_return expr() throws RecognitionException {
        ExprParser.expr_return retval = new ExprParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal10=null;
        Token char_literal11=null;
        ExprParser.term_return term9 =null;

        ExprParser.term_return term12 =null;


        CommonTree char_literal10_tree=null;
        CommonTree char_literal11_tree=null;

        try {
            // /home/cristina/compilatoare/Grammar/src/grammar/Expr.g:26:3: ( term ( ( '+' ^| '-' ^) term )* )
            // /home/cristina/compilatoare/Grammar/src/grammar/Expr.g:26:3: term ( ( '+' ^| '-' ^) term )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_expr92);
            term9=term();

            state._fsp--;

            adaptor.addChild(root_0, term9.getTree());

            // /home/cristina/compilatoare/Grammar/src/grammar/Expr.g:26:8: ( ( '+' ^| '-' ^) term )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= 11 && LA4_0 <= 12)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/cristina/compilatoare/Grammar/src/grammar/Expr.g:26:9: ( '+' ^| '-' ^) term
            	    {
            	    // /home/cristina/compilatoare/Grammar/src/grammar/Expr.g:26:9: ( '+' ^| '-' ^)
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==11) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==12) ) {
            	        alt3=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // /home/cristina/compilatoare/Grammar/src/grammar/Expr.g:26:10: '+' ^
            	            {
            	            char_literal10=(Token)match(input,11,FOLLOW_11_in_expr96); 
            	            char_literal10_tree = 
            	            (CommonTree)adaptor.create(char_literal10)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal10_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/cristina/compilatoare/Grammar/src/grammar/Expr.g:26:15: '-' ^
            	            {
            	            char_literal11=(Token)match(input,12,FOLLOW_12_in_expr99); 
            	            char_literal11_tree = 
            	            (CommonTree)adaptor.create(char_literal11)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal11_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_expr103);
            	    term12=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term12.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class term_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /home/cristina/compilatoare/Grammar/src/grammar/Expr.g:29:1: term : fact ( ( '*' ^| '/' ^) fact )* ;
    public final ExprParser.term_return term() throws RecognitionException {
        ExprParser.term_return retval = new ExprParser.term_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal14=null;
        Token char_literal15=null;
        ExprParser.fact_return fact13 =null;

        ExprParser.fact_return fact16 =null;


        CommonTree char_literal14_tree=null;
        CommonTree char_literal15_tree=null;

        try {
            // /home/cristina/compilatoare/Grammar/src/grammar/Expr.g:30:3: ( fact ( ( '*' ^| '/' ^) fact )* )
            // /home/cristina/compilatoare/Grammar/src/grammar/Expr.g:30:3: fact ( ( '*' ^| '/' ^) fact )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_fact_in_term115);
            fact13=fact();

            state._fsp--;

            adaptor.addChild(root_0, fact13.getTree());

            // /home/cristina/compilatoare/Grammar/src/grammar/Expr.g:30:8: ( ( '*' ^| '/' ^) fact )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==10||LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/cristina/compilatoare/Grammar/src/grammar/Expr.g:30:9: ( '*' ^| '/' ^) fact
            	    {
            	    // /home/cristina/compilatoare/Grammar/src/grammar/Expr.g:30:9: ( '*' ^| '/' ^)
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==10) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==13) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // /home/cristina/compilatoare/Grammar/src/grammar/Expr.g:30:10: '*' ^
            	            {
            	            char_literal14=(Token)match(input,10,FOLLOW_10_in_term119); 
            	            char_literal14_tree = 
            	            (CommonTree)adaptor.create(char_literal14)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal14_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/cristina/compilatoare/Grammar/src/grammar/Expr.g:30:15: '/' ^
            	            {
            	            char_literal15=(Token)match(input,13,FOLLOW_13_in_term122); 
            	            char_literal15_tree = 
            	            (CommonTree)adaptor.create(char_literal15)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal15_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_fact_in_term126);
            	    fact16=fact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fact16.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class fact_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fact"
    // /home/cristina/compilatoare/Grammar/src/grammar/Expr.g:33:1: fact : ( INT | ID | '(' ! expr ')' !);
    public final ExprParser.fact_return fact() throws RecognitionException {
        ExprParser.fact_return retval = new ExprParser.fact_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INT17=null;
        Token ID18=null;
        Token char_literal19=null;
        Token char_literal21=null;
        ExprParser.expr_return expr20 =null;


        CommonTree INT17_tree=null;
        CommonTree ID18_tree=null;
        CommonTree char_literal19_tree=null;
        CommonTree char_literal21_tree=null;

        try {
            // /home/cristina/compilatoare/Grammar/src/grammar/Expr.g:34:3: ( INT | ID | '(' ! expr ')' !)
            int alt7=3;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt7=1;
                }
                break;
            case ID:
                {
                alt7=2;
                }
                break;
            case 8:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // /home/cristina/compilatoare/Grammar/src/grammar/Expr.g:34:3: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    INT17=(Token)match(input,INT,FOLLOW_INT_in_fact138); 
                    INT17_tree = 
                    (CommonTree)adaptor.create(INT17)
                    ;
                    adaptor.addChild(root_0, INT17_tree);


                    }
                    break;
                case 2 :
                    // /home/cristina/compilatoare/Grammar/src/grammar/Expr.g:34:9: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    ID18=(Token)match(input,ID,FOLLOW_ID_in_fact142); 
                    ID18_tree = 
                    (CommonTree)adaptor.create(ID18)
                    ;
                    adaptor.addChild(root_0, ID18_tree);


                    }
                    break;
                case 3 :
                    // /home/cristina/compilatoare/Grammar/src/grammar/Expr.g:34:14: '(' ! expr ')' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal19=(Token)match(input,8,FOLLOW_8_in_fact146); 

                    pushFollow(FOLLOW_expr_in_fact149);
                    expr20=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr20.getTree());

                    char_literal21=(Token)match(input,9,FOLLOW_9_in_fact151); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fact"

    // Delegated rules


 

    public static final BitSet FOLLOW_stat_in_prog47 = new BitSet(new long[]{0x0000000000000172L});
    public static final BitSet FOLLOW_expr_in_stat61 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_stat63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_stat68 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_stat71 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_expr_in_stat75 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_stat77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_stat82 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_expr92 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_11_in_expr96 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_12_in_expr99 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_term_in_expr103 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_fact_in_term115 = new BitSet(new long[]{0x0000000000002402L});
    public static final BitSet FOLLOW_10_in_term119 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_13_in_term122 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_fact_in_term126 = new BitSet(new long[]{0x0000000000002402L});
    public static final BitSet FOLLOW_INT_in_fact138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fact142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_fact146 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_expr_in_fact149 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_fact151 = new BitSet(new long[]{0x0000000000000002L});

}