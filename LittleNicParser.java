// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g 2013-04-23 22:24:00

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class LittleNicParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROGRAM", "EXEC", "CALL_DEF", "ASSIGNMENT", "DECLARATIONS", "ARGS", "PARAMS", "VAR", "COMMENT", "WS", "TYPE", "BOOL", "IDENTIFIER", "NUMBER", "STRING", "'PROGRAM'", "';'", "'BEGIN'", "'END'", "','", "'('", "')'", "':'", "'FUNCTION'", "':='", "'PROCEDURE'", "'OUTPUT'", "'IF'", "'THEN'", "'ELSE'", "'WHILE'", "'DO'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int TYPE=14;
    public static final int T__19=19;
    public static final int IDENTIFIER=16;
    public static final int ARGS=9;
    public static final int VAR=11;
    public static final int COMMENT=12;
    public static final int PARAMS=10;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int CALL_DEF=6;
    public static final int NUMBER=17;
    public static final int BOOL=15;
    public static final int DECLARATIONS=8;
    public static final int EXEC=5;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int WS=13;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int PROGRAM=4;
    public static final int ASSIGNMENT=7;
    public static final int STRING=18;

    // delegates
    // delegators


        public LittleNicParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public LittleNicParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return LittleNicParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g"; }


        public ErrorReporter err;
        
        public void displayRecognitionError(String[] tokenNames,
                                            RecognitionException e)
        {
            String msg = getErrorMessage(e, tokenNames);
    	err.reportSyntaxError(e.line, e.charPositionInLine, msg);
        }


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:61:2: prog : 'PROGRAM' IDENTIFIER ';' declarations code_block ';' EOF ;
    public final LittleNicParser.prog_return prog() throws RecognitionException {
        LittleNicParser.prog_return retval = new LittleNicParser.prog_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal1=null;
        Token IDENTIFIER2=null;
        Token char_literal3=null;
        Token char_literal6=null;
        Token EOF7=null;
        LittleNicParser.declarations_return declarations4 = null;

        LittleNicParser.code_block_return code_block5 = null;


        CommonTree string_literal1_tree=null;
        CommonTree IDENTIFIER2_tree=null;
        CommonTree char_literal3_tree=null;
        CommonTree char_literal6_tree=null;
        CommonTree EOF7_tree=null;

        try {
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:62:7: ( 'PROGRAM' IDENTIFIER ';' declarations code_block ';' EOF )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:62:9: 'PROGRAM' IDENTIFIER ';' declarations code_block ';' EOF
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal1=(Token)match(input,19,FOLLOW_19_in_prog301); 
            string_literal1_tree = (CommonTree)adaptor.create(string_literal1);
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal1_tree, root_0);

            IDENTIFIER2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_prog304); 
            IDENTIFIER2_tree = (CommonTree)adaptor.create(IDENTIFIER2);
            adaptor.addChild(root_0, IDENTIFIER2_tree);

            char_literal3=(Token)match(input,20,FOLLOW_20_in_prog306); 
            pushFollow(FOLLOW_declarations_in_prog309);
            declarations4=declarations();

            state._fsp--;

            adaptor.addChild(root_0, declarations4.getTree());
            pushFollow(FOLLOW_code_block_in_prog311);
            code_block5=code_block();

            state._fsp--;

            adaptor.addChild(root_0, code_block5.getTree());
            char_literal6=(Token)match(input,20,FOLLOW_20_in_prog313); 
            EOF7=(Token)match(input,EOF,FOLLOW_EOF_in_prog316); 

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
        }
        return retval;
    }
    // $ANTLR end "prog"

    public static class code_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "code"
    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:64:2: code : 'BEGIN' ( statement ( ';' statement )* | ) 'END' ;
    public final LittleNicParser.code_return code() throws RecognitionException {
        LittleNicParser.code_return retval = new LittleNicParser.code_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal8=null;
        Token char_literal10=null;
        Token string_literal12=null;
        LittleNicParser.statement_return statement9 = null;

        LittleNicParser.statement_return statement11 = null;


        CommonTree string_literal8_tree=null;
        CommonTree char_literal10_tree=null;
        CommonTree string_literal12_tree=null;

        try {
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:65:3: ( 'BEGIN' ( statement ( ';' statement )* | ) 'END' )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:65:5: 'BEGIN' ( statement ( ';' statement )* | ) 'END'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal8=(Token)match(input,21,FOLLOW_21_in_code329); 
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:65:14: ( statement ( ';' statement )* | )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==IDENTIFIER||LA2_0==21||(LA2_0>=30 && LA2_0<=31)||LA2_0==34) ) {
                alt2=1;
            }
            else if ( (LA2_0==22) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:65:15: statement ( ';' statement )*
                    {
                    pushFollow(FOLLOW_statement_in_code333);
                    statement9=statement();

                    state._fsp--;

                    adaptor.addChild(root_0, statement9.getTree());
                    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:65:25: ( ';' statement )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==20) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:65:26: ';' statement
                    	    {
                    	    char_literal10=(Token)match(input,20,FOLLOW_20_in_code336); 
                    	    pushFollow(FOLLOW_statement_in_code339);
                    	    statement11=statement();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, statement11.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:65:56: 
                    {
                    }
                    break;

            }

            string_literal12=(Token)match(input,22,FOLLOW_22_in_code348); 

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
        }
        return retval;
    }
    // $ANTLR end "code"

    public static class code_block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "code_block"
    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:67:2: code_block : code -> ^( EXEC ( code )? ) ;
    public final LittleNicParser.code_block_return code_block() throws RecognitionException {
        LittleNicParser.code_block_return retval = new LittleNicParser.code_block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LittleNicParser.code_return code13 = null;


        RewriteRuleSubtreeStream stream_code=new RewriteRuleSubtreeStream(adaptor,"rule code");
        try {
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:68:3: ( code -> ^( EXEC ( code )? ) )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:68:5: code
            {
            pushFollow(FOLLOW_code_in_code_block360);
            code13=code();

            state._fsp--;

            stream_code.add(code13.getTree());


            // AST REWRITE
            // elements: code
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 68:10: -> ^( EXEC ( code )? )
            {
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:68:13: ^( EXEC ( code )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXEC, "EXEC"), root_1);

                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:68:20: ( code )?
                if ( stream_code.hasNext() ) {
                    adaptor.addChild(root_1, stream_code.nextTree());

                }
                stream_code.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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
        }
        return retval;
    }
    // $ANTLR end "code_block"

    public static class full_block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "full_block"
    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:70:2: full_block : inner_declarations code_block ;
    public final LittleNicParser.full_block_return full_block() throws RecognitionException {
        LittleNicParser.full_block_return retval = new LittleNicParser.full_block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LittleNicParser.inner_declarations_return inner_declarations14 = null;

        LittleNicParser.code_block_return code_block15 = null;



        try {
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:71:3: ( inner_declarations code_block )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:71:5: inner_declarations code_block
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_inner_declarations_in_full_block380);
            inner_declarations14=inner_declarations();

            state._fsp--;

            adaptor.addChild(root_0, inner_declarations14.getTree());
            pushFollow(FOLLOW_code_block_in_full_block382);
            code_block15=code_block();

            state._fsp--;

            adaptor.addChild(root_0, code_block15.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "full_block"

    public static class statement_block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement_block"
    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:73:2: statement_block : statement -> ^( EXEC ( statement )? ) ;
    public final LittleNicParser.statement_block_return statement_block() throws RecognitionException {
        LittleNicParser.statement_block_return retval = new LittleNicParser.statement_block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LittleNicParser.statement_return statement16 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:74:3: ( statement -> ^( EXEC ( statement )? ) )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:74:5: statement
            {
            pushFollow(FOLLOW_statement_in_statement_block395);
            statement16=statement();

            state._fsp--;

            stream_statement.add(statement16.getTree());


            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 74:15: -> ^( EXEC ( statement )? )
            {
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:74:18: ^( EXEC ( statement )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXEC, "EXEC"), root_1);

                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:74:25: ( statement )?
                if ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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
        }
        return retval;
    }
    // $ANTLR end "statement_block"

    public static class declarations_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declarations"
    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:76:2: declarations : ( declaration ( ';' declaration )* | ) -> ^( DECLARATIONS ( declaration )* ) ;
    public final LittleNicParser.declarations_return declarations() throws RecognitionException {
        LittleNicParser.declarations_return retval = new LittleNicParser.declarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal18=null;
        LittleNicParser.declaration_return declaration17 = null;

        LittleNicParser.declaration_return declaration19 = null;


        CommonTree char_literal18_tree=null;
        RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        try {
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:77:3: ( ( declaration ( ';' declaration )* | ) -> ^( DECLARATIONS ( declaration )* ) )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:77:5: ( declaration ( ';' declaration )* | )
            {
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:77:5: ( declaration ( ';' declaration )* | )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==VAR||LA4_0==27||LA4_0==29) ) {
                alt4=1;
            }
            else if ( (LA4_0==21) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:77:6: declaration ( ';' declaration )*
                    {
                    pushFollow(FOLLOW_declaration_in_declarations418);
                    declaration17=declaration();

                    state._fsp--;

                    stream_declaration.add(declaration17.getTree());
                    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:77:18: ( ';' declaration )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==20) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:77:19: ';' declaration
                    	    {
                    	    char_literal18=(Token)match(input,20,FOLLOW_20_in_declarations421);  
                    	    stream_20.add(char_literal18);

                    	    pushFollow(FOLLOW_declaration_in_declarations423);
                    	    declaration19=declaration();

                    	    state._fsp--;

                    	    stream_declaration.add(declaration19.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:77:50: 
                    {
                    }
                    break;

            }



            // AST REWRITE
            // elements: declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 77:52: -> ^( DECLARATIONS ( declaration )* )
            {
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:77:55: ^( DECLARATIONS ( declaration )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARATIONS, "DECLARATIONS"), root_1);

                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:77:70: ( declaration )*
                while ( stream_declaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_declaration.nextTree());

                }
                stream_declaration.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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
        }
        return retval;
    }
    // $ANTLR end "declarations"

    public static class inner_declarations_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inner_declarations"
    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:79:2: inner_declarations : ( 'VAR' var_dec ( ';' 'VAR' var_dec )* | ) -> ^( DECLARATIONS ( var_dec )* ) ;
    public final LittleNicParser.inner_declarations_return inner_declarations() throws RecognitionException {
        LittleNicParser.inner_declarations_return retval = new LittleNicParser.inner_declarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal20=null;
        Token char_literal22=null;
        Token string_literal23=null;
        LittleNicParser.var_dec_return var_dec21 = null;

        LittleNicParser.var_dec_return var_dec24 = null;


        CommonTree string_literal20_tree=null;
        CommonTree char_literal22_tree=null;
        CommonTree string_literal23_tree=null;
        RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleSubtreeStream stream_var_dec=new RewriteRuleSubtreeStream(adaptor,"rule var_dec");
        try {
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:80:3: ( ( 'VAR' var_dec ( ';' 'VAR' var_dec )* | ) -> ^( DECLARATIONS ( var_dec )* ) )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:80:5: ( 'VAR' var_dec ( ';' 'VAR' var_dec )* | )
            {
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:80:5: ( 'VAR' var_dec ( ';' 'VAR' var_dec )* | )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==VAR) ) {
                alt6=1;
            }
            else if ( (LA6_0==21) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:80:6: 'VAR' var_dec ( ';' 'VAR' var_dec )*
                    {
                    string_literal20=(Token)match(input,VAR,FOLLOW_VAR_in_inner_declarations452);  
                    stream_VAR.add(string_literal20);

                    pushFollow(FOLLOW_var_dec_in_inner_declarations454);
                    var_dec21=var_dec();

                    state._fsp--;

                    stream_var_dec.add(var_dec21.getTree());
                    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:80:20: ( ';' 'VAR' var_dec )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==20) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:80:21: ';' 'VAR' var_dec
                    	    {
                    	    char_literal22=(Token)match(input,20,FOLLOW_20_in_inner_declarations457);  
                    	    stream_20.add(char_literal22);

                    	    string_literal23=(Token)match(input,VAR,FOLLOW_VAR_in_inner_declarations459);  
                    	    stream_VAR.add(string_literal23);

                    	    pushFollow(FOLLOW_var_dec_in_inner_declarations461);
                    	    var_dec24=var_dec();

                    	    state._fsp--;

                    	    stream_var_dec.add(var_dec24.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:80:54: 
                    {
                    }
                    break;

            }



            // AST REWRITE
            // elements: var_dec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 80:56: -> ^( DECLARATIONS ( var_dec )* )
            {
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:80:59: ^( DECLARATIONS ( var_dec )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARATIONS, "DECLARATIONS"), root_1);

                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:80:74: ( var_dec )*
                while ( stream_var_dec.hasNext() ) {
                    adaptor.addChild(root_1, stream_var_dec.nextTree());

                }
                stream_var_dec.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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
        }
        return retval;
    }
    // $ANTLR end "inner_declarations"

    public static class param_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "param_list"
    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:82:2: param_list : ( var_dec ( ',' var_dec )* | );
    public final LittleNicParser.param_list_return param_list() throws RecognitionException {
        LittleNicParser.param_list_return retval = new LittleNicParser.param_list_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal26=null;
        LittleNicParser.var_dec_return var_dec25 = null;

        LittleNicParser.var_dec_return var_dec27 = null;


        CommonTree char_literal26_tree=null;

        try {
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:84:3: ( var_dec ( ',' var_dec )* | )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==IDENTIFIER) ) {
                alt8=1;
            }
            else if ( (LA8_0==25) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:84:5: var_dec ( ',' var_dec )*
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_var_dec_in_param_list490);
                    var_dec25=var_dec();

                    state._fsp--;

                    adaptor.addChild(root_0, var_dec25.getTree());
                    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:84:13: ( ',' var_dec )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==23) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:84:14: ',' var_dec
                    	    {
                    	    char_literal26=(Token)match(input,23,FOLLOW_23_in_param_list493); 
                    	    pushFollow(FOLLOW_var_dec_in_param_list496);
                    	    var_dec27=var_dec();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, var_dec27.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:85:17: 
                    {
                    root_0 = (CommonTree)adaptor.nil();

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
        }
        return retval;
    }
    // $ANTLR end "param_list"

    public static class params_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "params"
    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:87:2: params : '(' param_list ')' -> ^( PARAMS ( param_list )? ) ;
    public final LittleNicParser.params_return params() throws RecognitionException {
        LittleNicParser.params_return retval = new LittleNicParser.params_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal28=null;
        Token char_literal30=null;
        LittleNicParser.param_list_return param_list29 = null;


        CommonTree char_literal28_tree=null;
        CommonTree char_literal30_tree=null;
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleSubtreeStream stream_param_list=new RewriteRuleSubtreeStream(adaptor,"rule param_list");
        try {
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:87:9: ( '(' param_list ')' -> ^( PARAMS ( param_list )? ) )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:87:11: '(' param_list ')'
            {
            char_literal28=(Token)match(input,24,FOLLOW_24_in_params515);  
            stream_24.add(char_literal28);

            pushFollow(FOLLOW_param_list_in_params517);
            param_list29=param_list();

            state._fsp--;

            stream_param_list.add(param_list29.getTree());
            char_literal30=(Token)match(input,25,FOLLOW_25_in_params519);  
            stream_25.add(char_literal30);



            // AST REWRITE
            // elements: param_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 87:30: -> ^( PARAMS ( param_list )? )
            {
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:87:33: ^( PARAMS ( param_list )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMS, "PARAMS"), root_1);

                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:87:42: ( param_list )?
                if ( stream_param_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_param_list.nextTree());

                }
                stream_param_list.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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
        }
        return retval;
    }
    // $ANTLR end "params"

    public static class arg_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arg_list"
    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:89:2: arg_list : ( expr ( ',' expr )* | );
    public final LittleNicParser.arg_list_return arg_list() throws RecognitionException {
        LittleNicParser.arg_list_return retval = new LittleNicParser.arg_list_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal32=null;
        LittleNicParser.expr_return expr31 = null;

        LittleNicParser.expr_return expr33 = null;


        CommonTree char_literal32_tree=null;

        try {
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:90:3: ( expr ( ',' expr )* | )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=BOOL && LA10_0<=NUMBER)||LA10_0==24||(LA10_0>=42 && LA10_0<=43)) ) {
                alt10=1;
            }
            else if ( (LA10_0==25) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:90:5: expr ( ',' expr )*
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_arg_list540);
                    expr31=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr31.getTree());
                    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:90:10: ( ',' expr )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==23) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:90:11: ',' expr
                    	    {
                    	    char_literal32=(Token)match(input,23,FOLLOW_23_in_arg_list543); 
                    	    pushFollow(FOLLOW_expr_in_arg_list546);
                    	    expr33=expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expr33.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:91:16: 
                    {
                    root_0 = (CommonTree)adaptor.nil();

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
        }
        return retval;
    }
    // $ANTLR end "arg_list"

    public static class args_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "args"
    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:93:2: args : '(' arg_list ')' -> ^( ARGS ( arg_list )? ) ;
    public final LittleNicParser.args_return args() throws RecognitionException {
        LittleNicParser.args_return retval = new LittleNicParser.args_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal34=null;
        Token char_literal36=null;
        LittleNicParser.arg_list_return arg_list35 = null;


        CommonTree char_literal34_tree=null;
        CommonTree char_literal36_tree=null;
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleSubtreeStream stream_arg_list=new RewriteRuleSubtreeStream(adaptor,"rule arg_list");
        try {
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:93:7: ( '(' arg_list ')' -> ^( ARGS ( arg_list )? ) )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:93:9: '(' arg_list ')'
            {
            char_literal34=(Token)match(input,24,FOLLOW_24_in_args564);  
            stream_24.add(char_literal34);

            pushFollow(FOLLOW_arg_list_in_args566);
            arg_list35=arg_list();

            state._fsp--;

            stream_arg_list.add(arg_list35.getTree());
            char_literal36=(Token)match(input,25,FOLLOW_25_in_args568);  
            stream_25.add(char_literal36);



            // AST REWRITE
            // elements: arg_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 93:26: -> ^( ARGS ( arg_list )? )
            {
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:93:29: ^( ARGS ( arg_list )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_1);

                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:93:36: ( arg_list )?
                if ( stream_arg_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_arg_list.nextTree());

                }
                stream_arg_list.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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
        }
        return retval;
    }
    // $ANTLR end "args"

    public static class var_dec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "var_dec"
    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:95:2: var_dec : IDENTIFIER ':' TYPE -> ^( 'VAR' IDENTIFIER TYPE ) ;
    public final LittleNicParser.var_dec_return var_dec() throws RecognitionException {
        LittleNicParser.var_dec_return retval = new LittleNicParser.var_dec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENTIFIER37=null;
        Token char_literal38=null;
        Token TYPE39=null;

        CommonTree IDENTIFIER37_tree=null;
        CommonTree char_literal38_tree=null;
        CommonTree TYPE39_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");

        try {
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:95:10: ( IDENTIFIER ':' TYPE -> ^( 'VAR' IDENTIFIER TYPE ) )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:95:12: IDENTIFIER ':' TYPE
            {
            IDENTIFIER37=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_var_dec588);  
            stream_IDENTIFIER.add(IDENTIFIER37);

            char_literal38=(Token)match(input,26,FOLLOW_26_in_var_dec590);  
            stream_26.add(char_literal38);

            TYPE39=(Token)match(input,TYPE,FOLLOW_TYPE_in_var_dec592);  
            stream_TYPE.add(TYPE39);



            // AST REWRITE
            // elements: TYPE, IDENTIFIER, VAR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 95:32: -> ^( 'VAR' IDENTIFIER TYPE )
            {
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:95:35: ^( 'VAR' IDENTIFIER TYPE )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR, "VAR"), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                adaptor.addChild(root_1, stream_TYPE.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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
        }
        return retval;
    }
    // $ANTLR end "var_dec"

    public static class declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaration"
    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:97:2: declaration : ( 'VAR' var_dec | 'FUNCTION' IDENTIFIER params ':' TYPE ':=' full_block | 'PROCEDURE' IDENTIFIER params ':=' full_block );
    public final LittleNicParser.declaration_return declaration() throws RecognitionException {
        LittleNicParser.declaration_return retval = new LittleNicParser.declaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal40=null;
        Token string_literal42=null;
        Token IDENTIFIER43=null;
        Token char_literal45=null;
        Token TYPE46=null;
        Token string_literal47=null;
        Token string_literal49=null;
        Token IDENTIFIER50=null;
        Token string_literal52=null;
        LittleNicParser.var_dec_return var_dec41 = null;

        LittleNicParser.params_return params44 = null;

        LittleNicParser.full_block_return full_block48 = null;

        LittleNicParser.params_return params51 = null;

        LittleNicParser.full_block_return full_block53 = null;


        CommonTree string_literal40_tree=null;
        CommonTree string_literal42_tree=null;
        CommonTree IDENTIFIER43_tree=null;
        CommonTree char_literal45_tree=null;
        CommonTree TYPE46_tree=null;
        CommonTree string_literal47_tree=null;
        CommonTree string_literal49_tree=null;
        CommonTree IDENTIFIER50_tree=null;
        CommonTree string_literal52_tree=null;

        try {
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:99:3: ( 'VAR' var_dec | 'FUNCTION' IDENTIFIER params ':' TYPE ':=' full_block | 'PROCEDURE' IDENTIFIER params ':=' full_block )
            int alt11=3;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt11=1;
                }
                break;
            case 27:
                {
                alt11=2;
                }
                break;
            case 29:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:99:5: 'VAR' var_dec
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal40=(Token)match(input,VAR,FOLLOW_VAR_in_declaration616); 
                    pushFollow(FOLLOW_var_dec_in_declaration619);
                    var_dec41=var_dec();

                    state._fsp--;

                    adaptor.addChild(root_0, var_dec41.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:100:5: 'FUNCTION' IDENTIFIER params ':' TYPE ':=' full_block
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal42=(Token)match(input,27,FOLLOW_27_in_declaration625); 
                    string_literal42_tree = (CommonTree)adaptor.create(string_literal42);
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal42_tree, root_0);

                    IDENTIFIER43=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration628); 
                    IDENTIFIER43_tree = (CommonTree)adaptor.create(IDENTIFIER43);
                    adaptor.addChild(root_0, IDENTIFIER43_tree);

                    pushFollow(FOLLOW_params_in_declaration630);
                    params44=params();

                    state._fsp--;

                    adaptor.addChild(root_0, params44.getTree());
                    char_literal45=(Token)match(input,26,FOLLOW_26_in_declaration632); 
                    TYPE46=(Token)match(input,TYPE,FOLLOW_TYPE_in_declaration635); 
                    TYPE46_tree = (CommonTree)adaptor.create(TYPE46);
                    adaptor.addChild(root_0, TYPE46_tree);

                    string_literal47=(Token)match(input,28,FOLLOW_28_in_declaration637); 
                    pushFollow(FOLLOW_full_block_in_declaration640);
                    full_block48=full_block();

                    state._fsp--;

                    adaptor.addChild(root_0, full_block48.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:101:5: 'PROCEDURE' IDENTIFIER params ':=' full_block
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal49=(Token)match(input,29,FOLLOW_29_in_declaration646); 
                    string_literal49_tree = (CommonTree)adaptor.create(string_literal49);
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal49_tree, root_0);

                    IDENTIFIER50=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration649); 
                    IDENTIFIER50_tree = (CommonTree)adaptor.create(IDENTIFIER50);
                    adaptor.addChild(root_0, IDENTIFIER50_tree);

                    pushFollow(FOLLOW_params_in_declaration651);
                    params51=params();

                    state._fsp--;

                    adaptor.addChild(root_0, params51.getTree());
                    string_literal52=(Token)match(input,28,FOLLOW_28_in_declaration653); 
                    pushFollow(FOLLOW_full_block_in_declaration656);
                    full_block53=full_block();

                    state._fsp--;

                    adaptor.addChild(root_0, full_block53.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "declaration"

    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:103:2: statement : ( output | if_stat | while_stat | assignment | call | code );
    public final LittleNicParser.statement_return statement() throws RecognitionException {
        LittleNicParser.statement_return retval = new LittleNicParser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LittleNicParser.output_return output54 = null;

        LittleNicParser.if_stat_return if_stat55 = null;

        LittleNicParser.while_stat_return while_stat56 = null;

        LittleNicParser.assignment_return assignment57 = null;

        LittleNicParser.call_return call58 = null;

        LittleNicParser.code_return code59 = null;



        try {
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:104:3: ( output | if_stat | while_stat | assignment | call | code )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt12=1;
                }
                break;
            case 31:
                {
                alt12=2;
                }
                break;
            case 34:
                {
                alt12=3;
                }
                break;
            case IDENTIFIER:
                {
                int LA12_4 = input.LA(2);

                if ( (LA12_4==28) ) {
                    alt12=4;
                }
                else if ( (LA12_4==24) ) {
                    alt12=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 4, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                alt12=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:104:5: output
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_output_in_statement670);
                    output54=output();

                    state._fsp--;

                    adaptor.addChild(root_0, output54.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:104:14: if_stat
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_if_stat_in_statement674);
                    if_stat55=if_stat();

                    state._fsp--;

                    adaptor.addChild(root_0, if_stat55.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:104:24: while_stat
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_while_stat_in_statement678);
                    while_stat56=while_stat();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stat56.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:104:37: assignment
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_assignment_in_statement682);
                    assignment57=assignment();

                    state._fsp--;

                    adaptor.addChild(root_0, assignment57.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:104:50: call
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_call_in_statement686);
                    call58=call();

                    state._fsp--;

                    adaptor.addChild(root_0, call58.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:104:57: code
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_code_in_statement690);
                    code59=code();

                    state._fsp--;

                    adaptor.addChild(root_0, code59.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class assignment_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment"
    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:107:2: assignment : IDENTIFIER ':=' expr -> ^( ASSIGNMENT IDENTIFIER expr ) ;
    public final LittleNicParser.assignment_return assignment() throws RecognitionException {
        LittleNicParser.assignment_return retval = new LittleNicParser.assignment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENTIFIER60=null;
        Token string_literal61=null;
        LittleNicParser.expr_return expr62 = null;


        CommonTree IDENTIFIER60_tree=null;
        CommonTree string_literal61_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:108:3: ( IDENTIFIER ':=' expr -> ^( ASSIGNMENT IDENTIFIER expr ) )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:108:5: IDENTIFIER ':=' expr
            {
            IDENTIFIER60=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignment704);  
            stream_IDENTIFIER.add(IDENTIFIER60);

            string_literal61=(Token)match(input,28,FOLLOW_28_in_assignment706);  
            stream_28.add(string_literal61);

            pushFollow(FOLLOW_expr_in_assignment708);
            expr62=expr();

            state._fsp--;

            stream_expr.add(expr62.getTree());


            // AST REWRITE
            // elements: expr, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 108:26: -> ^( ASSIGNMENT IDENTIFIER expr )
            {
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:108:29: ^( ASSIGNMENT IDENTIFIER expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGNMENT, "ASSIGNMENT"), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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
        }
        return retval;
    }
    // $ANTLR end "assignment"

    public static class output_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "output"
    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:110:2: output : 'OUTPUT' ( STRING | IDENTIFIER ) ;
    public final LittleNicParser.output_return output() throws RecognitionException {
        LittleNicParser.output_return retval = new LittleNicParser.output_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal63=null;
        Token set64=null;

        CommonTree string_literal63_tree=null;
        CommonTree set64_tree=null;

        try {
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:110:9: ( 'OUTPUT' ( STRING | IDENTIFIER ) )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:110:11: 'OUTPUT' ( STRING | IDENTIFIER )
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal63=(Token)match(input,30,FOLLOW_30_in_output729); 
            string_literal63_tree = (CommonTree)adaptor.create(string_literal63);
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal63_tree, root_0);

            set64=(Token)input.LT(1);
            if ( input.LA(1)==IDENTIFIER||input.LA(1)==STRING ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set64));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
        }
        return retval;
    }
    // $ANTLR end "output"

    public static class if_stat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "if_stat"
    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:112:2: if_stat : 'IF' expr 'THEN' statement_block 'ELSE' statement_block ;
    public final LittleNicParser.if_stat_return if_stat() throws RecognitionException {
        LittleNicParser.if_stat_return retval = new LittleNicParser.if_stat_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal65=null;
        Token string_literal67=null;
        Token string_literal69=null;
        LittleNicParser.expr_return expr66 = null;

        LittleNicParser.statement_block_return statement_block68 = null;

        LittleNicParser.statement_block_return statement_block70 = null;


        CommonTree string_literal65_tree=null;
        CommonTree string_literal67_tree=null;
        CommonTree string_literal69_tree=null;

        try {
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:112:10: ( 'IF' expr 'THEN' statement_block 'ELSE' statement_block )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:112:12: 'IF' expr 'THEN' statement_block 'ELSE' statement_block
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal65=(Token)match(input,31,FOLLOW_31_in_if_stat748); 
            string_literal65_tree = (CommonTree)adaptor.create(string_literal65);
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal65_tree, root_0);

            pushFollow(FOLLOW_expr_in_if_stat751);
            expr66=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr66.getTree());
            string_literal67=(Token)match(input,32,FOLLOW_32_in_if_stat753); 
            pushFollow(FOLLOW_statement_block_in_if_stat756);
            statement_block68=statement_block();

            state._fsp--;

            adaptor.addChild(root_0, statement_block68.getTree());
            string_literal69=(Token)match(input,33,FOLLOW_33_in_if_stat758); 
            pushFollow(FOLLOW_statement_block_in_if_stat761);
            statement_block70=statement_block();

            state._fsp--;

            adaptor.addChild(root_0, statement_block70.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "if_stat"

    public static class while_stat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "while_stat"
    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:114:2: while_stat : 'WHILE' expr 'DO' statement_block ;
    public final LittleNicParser.while_stat_return while_stat() throws RecognitionException {
        LittleNicParser.while_stat_return retval = new LittleNicParser.while_stat_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal71=null;
        Token string_literal73=null;
        LittleNicParser.expr_return expr72 = null;

        LittleNicParser.statement_block_return statement_block74 = null;


        CommonTree string_literal71_tree=null;
        CommonTree string_literal73_tree=null;

        try {
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:115:3: ( 'WHILE' expr 'DO' statement_block )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:115:5: 'WHILE' expr 'DO' statement_block
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal71=(Token)match(input,34,FOLLOW_34_in_while_stat773); 
            string_literal71_tree = (CommonTree)adaptor.create(string_literal71);
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal71_tree, root_0);

            pushFollow(FOLLOW_expr_in_while_stat776);
            expr72=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr72.getTree());
            string_literal73=(Token)match(input,35,FOLLOW_35_in_while_stat778); 
            pushFollow(FOLLOW_statement_block_in_while_stat781);
            statement_block74=statement_block();

            state._fsp--;

            adaptor.addChild(root_0, statement_block74.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "while_stat"

    public static class call_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "call"
    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:117:2: call : IDENTIFIER args -> ^( CALL_DEF IDENTIFIER args ) ;
    public final LittleNicParser.call_return call() throws RecognitionException {
        LittleNicParser.call_return retval = new LittleNicParser.call_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENTIFIER75=null;
        LittleNicParser.args_return args76 = null;


        CommonTree IDENTIFIER75_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:117:7: ( IDENTIFIER args -> ^( CALL_DEF IDENTIFIER args ) )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:117:9: IDENTIFIER args
            {
            IDENTIFIER75=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_call791);  
            stream_IDENTIFIER.add(IDENTIFIER75);

            pushFollow(FOLLOW_args_in_call793);
            args76=args();

            state._fsp--;

            stream_args.add(args76.getTree());


            // AST REWRITE
            // elements: IDENTIFIER, args
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 117:25: -> ^( CALL_DEF IDENTIFIER args )
            {
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:117:28: ^( CALL_DEF IDENTIFIER args )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL_DEF, "CALL_DEF"), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                adaptor.addChild(root_1, stream_args.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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
        }
        return retval;
    }
    // $ANTLR end "call"

    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:119:2: expr : bool_expr ;
    public final LittleNicParser.expr_return expr() throws RecognitionException {
        LittleNicParser.expr_return retval = new LittleNicParser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LittleNicParser.bool_expr_return bool_expr77 = null;



        try {
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:121:7: ( bool_expr )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:121:10: bool_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_expr_in_expr817);
            bool_expr77=bool_expr();

            state._fsp--;

            adaptor.addChild(root_0, bool_expr77.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class bool_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bool_expr"
    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:124:2: bool_expr : add ( ( '==' | '!=' | '<' | '>' | '<=' | '>=' ) add )? ;
    public final LittleNicParser.bool_expr_return bool_expr() throws RecognitionException {
        LittleNicParser.bool_expr_return retval = new LittleNicParser.bool_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set79=null;
        LittleNicParser.add_return add78 = null;

        LittleNicParser.add_return add80 = null;


        CommonTree set79_tree=null;

        try {
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:125:3: ( add ( ( '==' | '!=' | '<' | '>' | '<=' | '>=' ) add )? )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:125:5: add ( ( '==' | '!=' | '<' | '>' | '<=' | '>=' ) add )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_add_in_bool_expr831);
            add78=add();

            state._fsp--;

            adaptor.addChild(root_0, add78.getTree());
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:125:9: ( ( '==' | '!=' | '<' | '>' | '<=' | '>=' ) add )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=36 && LA13_0<=41)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:125:10: ( '==' | '!=' | '<' | '>' | '<=' | '>=' ) add
                    {
                    set79=(Token)input.LT(1);
                    set79=(Token)input.LT(1);
                    if ( (input.LA(1)>=36 && input.LA(1)<=41) ) {
                        input.consume();
                        root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set79), root_0);
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_add_in_bool_expr849);
                    add80=add();

                    state._fsp--;

                    adaptor.addChild(root_0, add80.getTree());

                    }
                    break;

            }


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
        }
        return retval;
    }
    // $ANTLR end "bool_expr"

    public static class arith_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arith_expr"
    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:128:2: arith_expr : add ;
    public final LittleNicParser.arith_expr_return arith_expr() throws RecognitionException {
        LittleNicParser.arith_expr_return retval = new LittleNicParser.arith_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LittleNicParser.add_return add81 = null;



        try {
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:129:3: ( add )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:129:5: add
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_add_in_arith_expr865);
            add81=add();

            state._fsp--;

            adaptor.addChild(root_0, add81.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "arith_expr"

    public static class add_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "add"
    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:131:2: add : mul ( ( '+' | '-' ) mul )* ;
    public final LittleNicParser.add_return add() throws RecognitionException {
        LittleNicParser.add_return retval = new LittleNicParser.add_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set83=null;
        LittleNicParser.mul_return mul82 = null;

        LittleNicParser.mul_return mul84 = null;


        CommonTree set83_tree=null;

        try {
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:131:6: ( mul ( ( '+' | '-' ) mul )* )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:131:8: mul ( ( '+' | '-' ) mul )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_mul_in_add875);
            mul82=mul();

            state._fsp--;

            adaptor.addChild(root_0, mul82.getTree());
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:131:12: ( ( '+' | '-' ) mul )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=42 && LA14_0<=43)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:131:13: ( '+' | '-' ) mul
            	    {
            	    set83=(Token)input.LT(1);
            	    set83=(Token)input.LT(1);
            	    if ( (input.LA(1)>=42 && input.LA(1)<=43) ) {
            	        input.consume();
            	        root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set83), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_mul_in_add885);
            	    mul84=mul();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mul84.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
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
        }
        return retval;
    }
    // $ANTLR end "add"

    public static class mul_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mul"
    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:132:2: mul : item ( '*' item )* ;
    public final LittleNicParser.mul_return mul() throws RecognitionException {
        LittleNicParser.mul_return retval = new LittleNicParser.mul_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal86=null;
        LittleNicParser.item_return item85 = null;

        LittleNicParser.item_return item87 = null;


        CommonTree char_literal86_tree=null;

        try {
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:132:6: ( item ( '*' item )* )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:132:8: item ( '*' item )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_item_in_mul896);
            item85=item();

            state._fsp--;

            adaptor.addChild(root_0, item85.getTree());
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:132:13: ( '*' item )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==44) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:132:14: '*' item
            	    {
            	    char_literal86=(Token)match(input,44,FOLLOW_44_in_mul899); 
            	    char_literal86_tree = (CommonTree)adaptor.create(char_literal86);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal86_tree, root_0);

            	    pushFollow(FOLLOW_item_in_mul907);
            	    item87=item();

            	    state._fsp--;

            	    adaptor.addChild(root_0, item87.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
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
        }
        return retval;
    }
    // $ANTLR end "mul"

    public static class item_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "item"
    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:134:2: item : ( BOOL | IDENTIFIER | call | '(' expr ')' | num -> ^( NUMBER num ) );
    public final LittleNicParser.item_return item() throws RecognitionException {
        LittleNicParser.item_return retval = new LittleNicParser.item_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BOOL88=null;
        Token IDENTIFIER89=null;
        Token char_literal91=null;
        Token char_literal93=null;
        LittleNicParser.call_return call90 = null;

        LittleNicParser.expr_return expr92 = null;

        LittleNicParser.num_return num94 = null;


        CommonTree BOOL88_tree=null;
        CommonTree IDENTIFIER89_tree=null;
        CommonTree char_literal91_tree=null;
        CommonTree char_literal93_tree=null;
        RewriteRuleSubtreeStream stream_num=new RewriteRuleSubtreeStream(adaptor,"rule num");
        try {
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:134:7: ( BOOL | IDENTIFIER | call | '(' expr ')' | num -> ^( NUMBER num ) )
            int alt16=5;
            switch ( input.LA(1) ) {
            case BOOL:
                {
                alt16=1;
                }
                break;
            case IDENTIFIER:
                {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==EOF||LA16_2==20||(LA16_2>=22 && LA16_2<=23)||LA16_2==25||(LA16_2>=32 && LA16_2<=33)||(LA16_2>=35 && LA16_2<=44)) ) {
                    alt16=2;
                }
                else if ( (LA16_2==24) ) {
                    alt16=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;
                }
                }
                break;
            case 24:
                {
                alt16=4;
                }
                break;
            case NUMBER:
            case 42:
            case 43:
                {
                alt16=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:134:9: BOOL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BOOL88=(Token)match(input,BOOL,FOLLOW_BOOL_in_item919); 
                    BOOL88_tree = (CommonTree)adaptor.create(BOOL88);
                    adaptor.addChild(root_0, BOOL88_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:135:6: IDENTIFIER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENTIFIER89=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_item926); 
                    IDENTIFIER89_tree = (CommonTree)adaptor.create(IDENTIFIER89);
                    adaptor.addChild(root_0, IDENTIFIER89_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:136:5: call
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_call_in_item932);
                    call90=call();

                    state._fsp--;

                    adaptor.addChild(root_0, call90.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:137:5: '(' expr ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal91=(Token)match(input,24,FOLLOW_24_in_item938); 
                    pushFollow(FOLLOW_expr_in_item941);
                    expr92=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr92.getTree());
                    char_literal93=(Token)match(input,25,FOLLOW_25_in_item943); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:138:5: num
                    {
                    pushFollow(FOLLOW_num_in_item950);
                    num94=num();

                    state._fsp--;

                    stream_num.add(num94.getTree());


                    // AST REWRITE
                    // elements: num
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 138:9: -> ^( NUMBER num )
                    {
                        // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:138:12: ^( NUMBER num )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NUMBER, "NUMBER"), root_1);

                        adaptor.addChild(root_1, stream_num.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
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
        }
        return retval;
    }
    // $ANTLR end "item"

    public static class num_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "num"
    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:140:2: num : ( '+' | '-' )? NUMBER ;
    public final LittleNicParser.num_return num() throws RecognitionException {
        LittleNicParser.num_return retval = new LittleNicParser.num_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set95=null;
        Token NUMBER96=null;

        CommonTree set95_tree=null;
        CommonTree NUMBER96_tree=null;

        try {
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:140:6: ( ( '+' | '-' )? NUMBER )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:140:8: ( '+' | '-' )? NUMBER
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:140:8: ( '+' | '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=42 && LA17_0<=43)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:
                    {
                    set95=(Token)input.LT(1);
                    if ( (input.LA(1)>=42 && input.LA(1)<=43) ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set95));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            NUMBER96=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_num978); 
            NUMBER96_tree = (CommonTree)adaptor.create(NUMBER96);
            adaptor.addChild(root_0, NUMBER96_tree);


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
        }
        return retval;
    }
    // $ANTLR end "num"

    // Delegated rules


 

    public static final BitSet FOLLOW_19_in_prog301 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_prog304 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_prog306 = new BitSet(new long[]{0x0000000028200800L});
    public static final BitSet FOLLOW_declarations_in_prog309 = new BitSet(new long[]{0x0000000028200800L});
    public static final BitSet FOLLOW_code_block_in_prog311 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_prog313 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_code329 = new BitSet(new long[]{0x00000004E8610800L});
    public static final BitSet FOLLOW_statement_in_code333 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_20_in_code336 = new BitSet(new long[]{0x00000004E8210800L});
    public static final BitSet FOLLOW_statement_in_code339 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_22_in_code348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_code_in_code_block360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inner_declarations_in_full_block380 = new BitSet(new long[]{0x0000000028200800L});
    public static final BitSet FOLLOW_code_block_in_full_block382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statement_block395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_declarations418 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_declarations421 = new BitSet(new long[]{0x0000000028000800L});
    public static final BitSet FOLLOW_declaration_in_declarations423 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_VAR_in_inner_declarations452 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_var_dec_in_inner_declarations454 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_inner_declarations457 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_VAR_in_inner_declarations459 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_var_dec_in_inner_declarations461 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_var_dec_in_param_list490 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_param_list493 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_var_dec_in_param_list496 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_24_in_params515 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_param_list_in_params517 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_params519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_arg_list540 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_arg_list543 = new BitSet(new long[]{0x00000C0001038000L});
    public static final BitSet FOLLOW_expr_in_arg_list546 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_24_in_args564 = new BitSet(new long[]{0x00000C0003038000L});
    public static final BitSet FOLLOW_arg_list_in_args566 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_args568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_var_dec588 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_var_dec590 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_TYPE_in_var_dec592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_declaration616 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_var_dec_in_declaration619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_declaration625 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_declaration628 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_params_in_declaration630 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_declaration632 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_TYPE_in_declaration635 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_declaration637 = new BitSet(new long[]{0x0000000028200800L});
    public static final BitSet FOLLOW_full_block_in_declaration640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_declaration646 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_declaration649 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_params_in_declaration651 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_declaration653 = new BitSet(new long[]{0x0000000028200800L});
    public static final BitSet FOLLOW_full_block_in_declaration656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_output_in_statement670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stat_in_statement674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stat_in_statement678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_statement686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_code_in_statement690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_assignment704 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_assignment706 = new BitSet(new long[]{0x00000C0001038000L});
    public static final BitSet FOLLOW_expr_in_assignment708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_output729 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_set_in_output732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_if_stat748 = new BitSet(new long[]{0x00000C0001038000L});
    public static final BitSet FOLLOW_expr_in_if_stat751 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_if_stat753 = new BitSet(new long[]{0x00000004E8210800L});
    public static final BitSet FOLLOW_statement_block_in_if_stat756 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_if_stat758 = new BitSet(new long[]{0x00000004E8210800L});
    public static final BitSet FOLLOW_statement_block_in_if_stat761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_while_stat773 = new BitSet(new long[]{0x00000C0001038000L});
    public static final BitSet FOLLOW_expr_in_while_stat776 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_while_stat778 = new BitSet(new long[]{0x00000004E8210800L});
    public static final BitSet FOLLOW_statement_block_in_while_stat781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_call791 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_args_in_call793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_expr_in_expr817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_add_in_bool_expr831 = new BitSet(new long[]{0x000003F000000002L});
    public static final BitSet FOLLOW_set_in_bool_expr834 = new BitSet(new long[]{0x00000C0001038000L});
    public static final BitSet FOLLOW_add_in_bool_expr849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_add_in_arith_expr865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mul_in_add875 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_set_in_add878 = new BitSet(new long[]{0x00000C0001038000L});
    public static final BitSet FOLLOW_mul_in_add885 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_item_in_mul896 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_mul899 = new BitSet(new long[]{0x00000C0001038000L});
    public static final BitSet FOLLOW_item_in_mul907 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_BOOL_in_item919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_item926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_item932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_item938 = new BitSet(new long[]{0x00000C0001038000L});
    public static final BitSet FOLLOW_expr_in_item941 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_item943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_num_in_item950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_num969 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_NUMBER_in_num978 = new BitSet(new long[]{0x0000000000000002L});

}