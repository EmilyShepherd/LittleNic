// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g 2013-04-23 22:24:00

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class LittleNicLexer extends Lexer {
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

        public ErrorReporter err;
        public void displayRecognitionError(String[] tokenNames,
                                            RecognitionException e)
        {
            String msg = getErrorMessage(e, tokenNames);
    	err.reportSyntaxError(e.line, e.charPositionInLine, msg);
        }


    // delegates
    // delegators

    public LittleNicLexer() {;} 
    public LittleNicLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public LittleNicLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g"; }

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:13:5: ( 'VAR' )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:13:7: 'VAR'
            {
            match("VAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:14:7: ( 'PROGRAM' )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:14:9: 'PROGRAM'
            {
            match("PROGRAM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:15:7: ( ';' )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:15:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:16:7: ( 'BEGIN' )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:16:9: 'BEGIN'
            {
            match("BEGIN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:17:7: ( 'END' )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:17:9: 'END'
            {
            match("END"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:18:7: ( ',' )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:18:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:19:7: ( '(' )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:19:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:20:7: ( ')' )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:20:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:21:7: ( ':' )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:21:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:22:7: ( 'FUNCTION' )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:22:9: 'FUNCTION'
            {
            match("FUNCTION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:23:7: ( ':=' )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:23:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:24:7: ( 'PROCEDURE' )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:24:9: 'PROCEDURE'
            {
            match("PROCEDURE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:25:7: ( 'OUTPUT' )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:25:9: 'OUTPUT'
            {
            match("OUTPUT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:26:7: ( 'IF' )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:26:9: 'IF'
            {
            match("IF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:27:7: ( 'THEN' )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:27:9: 'THEN'
            {
            match("THEN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:28:7: ( 'ELSE' )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:28:9: 'ELSE'
            {
            match("ELSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:29:7: ( 'WHILE' )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:29:9: 'WHILE'
            {
            match("WHILE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:30:7: ( 'DO' )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:30:9: 'DO'
            {
            match("DO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:31:7: ( '==' )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:31:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:32:7: ( '!=' )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:32:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:33:7: ( '<' )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:33:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:34:7: ( '>' )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:34:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:35:7: ( '<=' )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:35:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:36:7: ( '>=' )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:36:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:37:7: ( '+' )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:37:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:38:7: ( '-' )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:38:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:39:7: ( '*' )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:39:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:39:10: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:39:12: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:39:17: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='/') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='.')||(LA1_1>='0' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<=')')||(LA1_0>='+' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:39:45: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match("*/"); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:41:4: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:41:6: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:50:7: ( 'COUNT' | 'TRUTH' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='C') ) {
                alt2=1;
            }
            else if ( (LA2_0=='T') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:50:9: 'COUNT'
                    {
                    match("COUNT"); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:50:19: 'TRUTH'
                    {
                    match("TRUTH"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPE"

    // $ANTLR start "BOOL"
    public final void mBOOL() throws RecognitionException {
        try {
            int _type = BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:52:6: ( 'T' | 'F' )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:
            {
            if ( input.LA(1)=='F'||input.LA(1)=='T' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOL"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:55:3: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:55:5: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:55:27: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:57:8: ( ( '0' .. '9' )+ )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:57:10: ( '0' .. '9' )+
            {
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:57:10: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:57:11: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:59:8: ( '\"' (~ ( '\\r' | '\\n' | '\"' ) )* '\"' )
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:59:10: '\"' (~ ( '\\r' | '\\n' | '\"' ) )* '\"'
            {
            match('\"'); 
            // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:59:14: (~ ( '\\r' | '\\n' | '\"' ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:59:14: ~ ( '\\r' | '\\n' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:1:8: ( VAR | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | COMMENT | WS | TYPE | BOOL | IDENTIFIER | NUMBER | STRING )
        int alt6=34;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:1:10: VAR
                {
                mVAR(); 

                }
                break;
            case 2 :
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:1:14: T__19
                {
                mT__19(); 

                }
                break;
            case 3 :
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:1:20: T__20
                {
                mT__20(); 

                }
                break;
            case 4 :
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:1:26: T__21
                {
                mT__21(); 

                }
                break;
            case 5 :
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:1:32: T__22
                {
                mT__22(); 

                }
                break;
            case 6 :
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:1:38: T__23
                {
                mT__23(); 

                }
                break;
            case 7 :
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:1:44: T__24
                {
                mT__24(); 

                }
                break;
            case 8 :
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:1:50: T__25
                {
                mT__25(); 

                }
                break;
            case 9 :
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:1:56: T__26
                {
                mT__26(); 

                }
                break;
            case 10 :
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:1:62: T__27
                {
                mT__27(); 

                }
                break;
            case 11 :
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:1:68: T__28
                {
                mT__28(); 

                }
                break;
            case 12 :
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:1:74: T__29
                {
                mT__29(); 

                }
                break;
            case 13 :
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:1:80: T__30
                {
                mT__30(); 

                }
                break;
            case 14 :
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:1:86: T__31
                {
                mT__31(); 

                }
                break;
            case 15 :
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:1:92: T__32
                {
                mT__32(); 

                }
                break;
            case 16 :
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:1:98: T__33
                {
                mT__33(); 

                }
                break;
            case 17 :
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:1:104: T__34
                {
                mT__34(); 

                }
                break;
            case 18 :
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:1:110: T__35
                {
                mT__35(); 

                }
                break;
            case 19 :
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:1:116: T__36
                {
                mT__36(); 

                }
                break;
            case 20 :
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:1:122: T__37
                {
                mT__37(); 

                }
                break;
            case 21 :
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:1:128: T__38
                {
                mT__38(); 

                }
                break;
            case 22 :
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:1:134: T__39
                {
                mT__39(); 

                }
                break;
            case 23 :
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:1:140: T__40
                {
                mT__40(); 

                }
                break;
            case 24 :
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:1:146: T__41
                {
                mT__41(); 

                }
                break;
            case 25 :
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:1:152: T__42
                {
                mT__42(); 

                }
                break;
            case 26 :
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:1:158: T__43
                {
                mT__43(); 

                }
                break;
            case 27 :
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:1:164: T__44
                {
                mT__44(); 

                }
                break;
            case 28 :
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:1:170: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 29 :
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:1:178: WS
                {
                mWS(); 

                }
                break;
            case 30 :
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:1:181: TYPE
                {
                mTYPE(); 

                }
                break;
            case 31 :
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:1:186: BOOL
                {
                mBOOL(); 

                }
                break;
            case 32 :
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:1:191: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 33 :
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:1:202: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 34 :
                // C:\\Users\\Alex\\SkyDrive\\Documents\\ECS\\compilers\\LittleNic.g:1:209: STRING
                {
                mSTRING(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\uffff\2\32\1\uffff\2\32\3\uffff\1\43\1\45\2\32\1\45\2\32\2\uffff"+
        "\1\55\1\57\5\uffff\1\32\3\uffff\5\32\2\uffff\1\32\1\uffff\1\32\1"+
        "\70\3\32\1\74\4\uffff\1\32\1\76\2\32\1\102\3\32\1\uffff\3\32\1\uffff"+
        "\1\32\1\uffff\3\32\1\uffff\1\115\2\32\1\120\5\32\1\126\1\uffff\2"+
        "\32\1\uffff\1\131\1\132\1\131\2\32\1\uffff\1\32\1\136\2\uffff\1"+
        "\137\2\32\2\uffff\1\32\1\143\1\144\2\uffff";
    static final String DFA6_eofS =
        "\145\uffff";
    static final String DFA6_minS =
        "\1\11\1\101\1\122\1\uffff\1\105\1\114\3\uffff\1\75\1\60\1\125\1"+
        "\106\1\60\1\110\1\117\2\uffff\2\75\5\uffff\1\117\3\uffff\1\122\1"+
        "\117\1\107\1\104\1\123\2\uffff\1\116\1\uffff\1\124\1\60\1\105\1"+
        "\125\1\111\1\60\4\uffff\1\125\1\60\1\103\1\111\1\60\1\105\1\103"+
        "\1\120\1\uffff\1\116\1\124\1\114\1\uffff\1\116\1\uffff\1\122\1\105"+
        "\1\116\1\uffff\1\60\1\124\1\125\1\60\1\110\1\105\1\124\1\101\1\104"+
        "\1\60\1\uffff\1\111\1\124\1\uffff\3\60\1\115\1\125\1\uffff\1\117"+
        "\1\60\2\uffff\1\60\1\122\1\116\2\uffff\1\105\2\60\2\uffff";
    static final String DFA6_maxS =
        "\1\172\1\101\1\122\1\uffff\1\105\1\116\3\uffff\1\75\1\172\1\125"+
        "\1\106\1\172\1\110\1\117\2\uffff\2\75\5\uffff\1\117\3\uffff\1\122"+
        "\1\117\1\107\1\104\1\123\2\uffff\1\116\1\uffff\1\124\1\172\1\105"+
        "\1\125\1\111\1\172\4\uffff\1\125\1\172\1\107\1\111\1\172\1\105\1"+
        "\103\1\120\1\uffff\1\116\1\124\1\114\1\uffff\1\116\1\uffff\1\122"+
        "\1\105\1\116\1\uffff\1\172\1\124\1\125\1\172\1\110\1\105\1\124\1"+
        "\101\1\104\1\172\1\uffff\1\111\1\124\1\uffff\3\172\1\115\1\125\1"+
        "\uffff\1\117\1\172\2\uffff\1\172\1\122\1\116\2\uffff\1\105\2\172"+
        "\2\uffff";
    static final String DFA6_acceptS =
        "\3\uffff\1\3\2\uffff\1\6\1\7\1\10\7\uffff\1\23\1\24\2\uffff\1\31"+
        "\1\32\1\33\1\34\1\35\1\uffff\1\40\1\41\1\42\5\uffff\1\13\1\11\1"+
        "\uffff\1\37\6\uffff\1\27\1\25\1\30\1\26\10\uffff\1\16\3\uffff\1"+
        "\22\1\uffff\1\1\3\uffff\1\5\12\uffff\1\20\2\uffff\1\17\5\uffff\1"+
        "\4\2\uffff\1\36\1\21\3\uffff\1\15\1\2\3\uffff\1\12\1\14";
    static final String DFA6_specialS =
        "\145\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\30\2\uffff\1\30\22\uffff\1\30\1\21\1\34\5\uffff\1\7\1\10"+
            "\1\26\1\24\1\6\1\25\1\uffff\1\27\12\33\1\11\1\3\1\22\1\20\1"+
            "\23\2\uffff\1\32\1\4\1\31\1\17\1\5\1\12\2\32\1\14\5\32\1\13"+
            "\1\2\3\32\1\15\1\32\1\1\1\16\3\32\6\uffff\32\32",
            "\1\35",
            "\1\36",
            "",
            "\1\37",
            "\1\41\1\uffff\1\40",
            "",
            "",
            "",
            "\1\42",
            "\12\32\7\uffff\24\32\1\44\5\32\4\uffff\1\32\1\uffff\32\32",
            "\1\46",
            "\1\47",
            "\12\32\7\uffff\7\32\1\50\11\32\1\51\10\32\4\uffff\1\32\1\uffff"+
            "\32\32",
            "\1\52",
            "\1\53",
            "",
            "",
            "\1\54",
            "\1\56",
            "",
            "",
            "",
            "",
            "",
            "\1\60",
            "",
            "",
            "",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "",
            "",
            "\1\66",
            "",
            "\1\67",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\71",
            "\1\72",
            "\1\73",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "",
            "",
            "\1\75",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\100\3\uffff\1\77",
            "\1\101",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\103",
            "\1\104",
            "\1\105",
            "",
            "\1\106",
            "\1\107",
            "\1\110",
            "",
            "\1\111",
            "",
            "\1\112",
            "\1\113",
            "\1\114",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\116",
            "\1\117",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\1\127",
            "\1\130",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\133",
            "\1\134",
            "",
            "\1\135",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\140",
            "\1\141",
            "",
            "",
            "\1\142",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( VAR | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | COMMENT | WS | TYPE | BOOL | IDENTIFIER | NUMBER | STRING );";
        }
    }
 

}