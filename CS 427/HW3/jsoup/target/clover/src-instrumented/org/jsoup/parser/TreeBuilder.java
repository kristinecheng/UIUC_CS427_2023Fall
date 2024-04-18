/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jonathan Hedley
 */
abstract class TreeBuilder {public static class __CLR4_2_06tc6tclnxz22r2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,8888,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected Parser parser;
    CharacterReader reader;
    Tokeniser tokeniser;
    protected Document doc; // current doc we are building into
    protected ArrayList<Element> stack; // the stack of open elements
    protected String baseUri; // current base uri, for creating new elements
    protected Token currentToken; // currentToken is used only for error tracking.
    protected ParseSettings settings;

    private Token.StartTag start = new Token.StartTag(); // start tag to process
    private Token.EndTag end  = new Token.EndTag();
    abstract ParseSettings defaultSettings();

    protected void initialiseParse(Reader input, String baseUri, Parser parser) {try{__CLR4_2_06tc6tclnxz22r2.R.inc(8832);
        __CLR4_2_06tc6tclnxz22r2.R.inc(8833);Validate.notNull(input, "String input must not be null");
        __CLR4_2_06tc6tclnxz22r2.R.inc(8834);Validate.notNull(baseUri, "BaseURI must not be null");

        __CLR4_2_06tc6tclnxz22r2.R.inc(8835);doc = new Document(baseUri);
        __CLR4_2_06tc6tclnxz22r2.R.inc(8836);doc.parser(parser);
        __CLR4_2_06tc6tclnxz22r2.R.inc(8837);this.parser = parser;
        __CLR4_2_06tc6tclnxz22r2.R.inc(8838);settings = parser.settings();
        __CLR4_2_06tc6tclnxz22r2.R.inc(8839);reader = new CharacterReader(input);
        __CLR4_2_06tc6tclnxz22r2.R.inc(8840);currentToken = null;
        __CLR4_2_06tc6tclnxz22r2.R.inc(8841);tokeniser = new Tokeniser(reader, parser.getErrors());
        __CLR4_2_06tc6tclnxz22r2.R.inc(8842);stack = new ArrayList<>(32);
        __CLR4_2_06tc6tclnxz22r2.R.inc(8843);this.baseUri = baseUri;
    }finally{__CLR4_2_06tc6tclnxz22r2.R.flushNeeded();}}

    Document parse(Reader input, String baseUri, Parser parser) {try{__CLR4_2_06tc6tclnxz22r2.R.inc(8844);
        __CLR4_2_06tc6tclnxz22r2.R.inc(8845);initialiseParse(input, baseUri, parser);
        __CLR4_2_06tc6tclnxz22r2.R.inc(8846);runParser();
        __CLR4_2_06tc6tclnxz22r2.R.inc(8847);return doc;
    }finally{__CLR4_2_06tc6tclnxz22r2.R.flushNeeded();}}

    abstract List<Node> parseFragment(String inputFragment, Element context, String baseUri, Parser parser);

    protected void runParser() {try{__CLR4_2_06tc6tclnxz22r2.R.inc(8848);
        __CLR4_2_06tc6tclnxz22r2.R.inc(8849);while (true) {{
            __CLR4_2_06tc6tclnxz22r2.R.inc(8850);Token token = tokeniser.read();
            __CLR4_2_06tc6tclnxz22r2.R.inc(8851);process(token);
            __CLR4_2_06tc6tclnxz22r2.R.inc(8852);token.reset();

            __CLR4_2_06tc6tclnxz22r2.R.inc(8853);if ((((token.type == Token.TokenType.EOF)&&(__CLR4_2_06tc6tclnxz22r2.R.iget(8854)!=0|true))||(__CLR4_2_06tc6tclnxz22r2.R.iget(8855)==0&false)))
                {__CLR4_2_06tc6tclnxz22r2.R.inc(8856);break;
        }}
    }}finally{__CLR4_2_06tc6tclnxz22r2.R.flushNeeded();}}

    protected abstract boolean process(Token token);

    protected boolean processStartTag(String name) {try{__CLR4_2_06tc6tclnxz22r2.R.inc(8857);
        __CLR4_2_06tc6tclnxz22r2.R.inc(8858);if ((((currentToken == start)&&(__CLR4_2_06tc6tclnxz22r2.R.iget(8859)!=0|true))||(__CLR4_2_06tc6tclnxz22r2.R.iget(8860)==0&false))) {{ // don't recycle an in-use token
            __CLR4_2_06tc6tclnxz22r2.R.inc(8861);return process(new Token.StartTag().name(name));
        }
        }__CLR4_2_06tc6tclnxz22r2.R.inc(8862);return process(start.reset().name(name));
    }finally{__CLR4_2_06tc6tclnxz22r2.R.flushNeeded();}}

    public boolean processStartTag(String name, Attributes attrs) {try{__CLR4_2_06tc6tclnxz22r2.R.inc(8863);
        __CLR4_2_06tc6tclnxz22r2.R.inc(8864);if ((((currentToken == start)&&(__CLR4_2_06tc6tclnxz22r2.R.iget(8865)!=0|true))||(__CLR4_2_06tc6tclnxz22r2.R.iget(8866)==0&false))) {{ // don't recycle an in-use token
            __CLR4_2_06tc6tclnxz22r2.R.inc(8867);return process(new Token.StartTag().nameAttr(name, attrs));
        }
        }__CLR4_2_06tc6tclnxz22r2.R.inc(8868);start.reset();
        __CLR4_2_06tc6tclnxz22r2.R.inc(8869);start.nameAttr(name, attrs);
        __CLR4_2_06tc6tclnxz22r2.R.inc(8870);return process(start);
    }finally{__CLR4_2_06tc6tclnxz22r2.R.flushNeeded();}}

    protected boolean processEndTag(String name) {try{__CLR4_2_06tc6tclnxz22r2.R.inc(8871);
        __CLR4_2_06tc6tclnxz22r2.R.inc(8872);if ((((currentToken == end)&&(__CLR4_2_06tc6tclnxz22r2.R.iget(8873)!=0|true))||(__CLR4_2_06tc6tclnxz22r2.R.iget(8874)==0&false))) {{ // don't recycle an in-use token
            __CLR4_2_06tc6tclnxz22r2.R.inc(8875);return process(new Token.EndTag().name(name));
        }
        }__CLR4_2_06tc6tclnxz22r2.R.inc(8876);return process(end.reset().name(name));
    }finally{__CLR4_2_06tc6tclnxz22r2.R.flushNeeded();}}


    protected Element currentElement() {try{__CLR4_2_06tc6tclnxz22r2.R.inc(8877);
        __CLR4_2_06tc6tclnxz22r2.R.inc(8878);int size = stack.size();
        __CLR4_2_06tc6tclnxz22r2.R.inc(8879);return (((size > 0 )&&(__CLR4_2_06tc6tclnxz22r2.R.iget(8880)!=0|true))||(__CLR4_2_06tc6tclnxz22r2.R.iget(8881)==0&false))? stack.get(size-1) : null;
    }finally{__CLR4_2_06tc6tclnxz22r2.R.flushNeeded();}}


    /**
     * If the parser is tracking errors, and an error at the current position.
     * @param msg error message
     */
    protected void error(String msg) {try{__CLR4_2_06tc6tclnxz22r2.R.inc(8882);
        __CLR4_2_06tc6tclnxz22r2.R.inc(8883);ParseErrorList errors = parser.getErrors();
        __CLR4_2_06tc6tclnxz22r2.R.inc(8884);if ((((errors.canAddError())&&(__CLR4_2_06tc6tclnxz22r2.R.iget(8885)!=0|true))||(__CLR4_2_06tc6tclnxz22r2.R.iget(8886)==0&false)))
            {__CLR4_2_06tc6tclnxz22r2.R.inc(8887);errors.add(new ParseError(reader.pos(), msg));
    }}finally{__CLR4_2_06tc6tclnxz22r2.R.flushNeeded();}}
}
