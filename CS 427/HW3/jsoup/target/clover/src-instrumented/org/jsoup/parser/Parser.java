/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

/**
 * Parses HTML into a {@link org.jsoup.nodes.Document}. Generally best to use one of the  more convenient parse methods
 * in {@link org.jsoup.Jsoup}.
 */
public class Parser {public static class __CLR4_2_050w50wlnxz22p0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,6577,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private TreeBuilder treeBuilder;
    private ParseErrorList errors;
    private ParseSettings settings;

    /**
     * Create a new Parser, using the specified TreeBuilder
     * @param treeBuilder TreeBuilder to use to parse input into Documents.
     */
    public Parser(TreeBuilder treeBuilder) {try{__CLR4_2_050w50wlnxz22p0.R.inc(6512);
        __CLR4_2_050w50wlnxz22p0.R.inc(6513);this.treeBuilder = treeBuilder;
        __CLR4_2_050w50wlnxz22p0.R.inc(6514);settings = treeBuilder.defaultSettings();
        __CLR4_2_050w50wlnxz22p0.R.inc(6515);errors = ParseErrorList.noTracking();
    }finally{__CLR4_2_050w50wlnxz22p0.R.flushNeeded();}}
    
    public Document parseInput(String html, String baseUri) {try{__CLR4_2_050w50wlnxz22p0.R.inc(6516);
        __CLR4_2_050w50wlnxz22p0.R.inc(6517);return treeBuilder.parse(new StringReader(html), baseUri, this);
    }finally{__CLR4_2_050w50wlnxz22p0.R.flushNeeded();}}

    public Document parseInput(Reader inputHtml, String baseUri) {try{__CLR4_2_050w50wlnxz22p0.R.inc(6518);
        __CLR4_2_050w50wlnxz22p0.R.inc(6519);return treeBuilder.parse(inputHtml, baseUri, this);
    }finally{__CLR4_2_050w50wlnxz22p0.R.flushNeeded();}}

    public List<Node> parseFragmentInput(String fragment, Element context, String baseUri) {try{__CLR4_2_050w50wlnxz22p0.R.inc(6520);
        __CLR4_2_050w50wlnxz22p0.R.inc(6521);return treeBuilder.parseFragment(fragment, context, baseUri, this);
    }finally{__CLR4_2_050w50wlnxz22p0.R.flushNeeded();}}
    // gets & sets
    /**
     * Get the TreeBuilder currently in use.
     * @return current TreeBuilder.
     */
    public TreeBuilder getTreeBuilder() {try{__CLR4_2_050w50wlnxz22p0.R.inc(6522);
        __CLR4_2_050w50wlnxz22p0.R.inc(6523);return treeBuilder;
    }finally{__CLR4_2_050w50wlnxz22p0.R.flushNeeded();}}

    /**
     * Update the TreeBuilder used when parsing content.
     * @param treeBuilder current TreeBuilder
     * @return this, for chaining
     */
    public Parser setTreeBuilder(TreeBuilder treeBuilder) {try{__CLR4_2_050w50wlnxz22p0.R.inc(6524);
        __CLR4_2_050w50wlnxz22p0.R.inc(6525);this.treeBuilder = treeBuilder;
        __CLR4_2_050w50wlnxz22p0.R.inc(6526);treeBuilder.parser = this;
        __CLR4_2_050w50wlnxz22p0.R.inc(6527);return this;
    }finally{__CLR4_2_050w50wlnxz22p0.R.flushNeeded();}}

    /**
     * Check if parse error tracking is enabled.
     * @return current track error state.
     */
    public boolean isTrackErrors() {try{__CLR4_2_050w50wlnxz22p0.R.inc(6528);
        __CLR4_2_050w50wlnxz22p0.R.inc(6529);return errors.getMaxSize() > 0;
    }finally{__CLR4_2_050w50wlnxz22p0.R.flushNeeded();}}

    /**
     * Enable or disable parse error tracking for the next parse.
     * @param maxErrors the maximum number of errors to track. Set to 0 to disable.
     * @return this, for chaining
     */
    public Parser setTrackErrors(int maxErrors) {try{__CLR4_2_050w50wlnxz22p0.R.inc(6530);
        __CLR4_2_050w50wlnxz22p0.R.inc(6531);errors = (((maxErrors > 0 )&&(__CLR4_2_050w50wlnxz22p0.R.iget(6532)!=0|true))||(__CLR4_2_050w50wlnxz22p0.R.iget(6533)==0&false))? ParseErrorList.tracking(maxErrors) : ParseErrorList.noTracking();
        __CLR4_2_050w50wlnxz22p0.R.inc(6534);return this;
    }finally{__CLR4_2_050w50wlnxz22p0.R.flushNeeded();}}

    /**
     * Retrieve the parse errors, if any, from the last parse.
     * @return list of parse errors, up to the size of the maximum errors tracked.
     */
    public ParseErrorList getErrors() {try{__CLR4_2_050w50wlnxz22p0.R.inc(6535);
        __CLR4_2_050w50wlnxz22p0.R.inc(6536);return errors;
    }finally{__CLR4_2_050w50wlnxz22p0.R.flushNeeded();}}

    public Parser settings(ParseSettings settings) {try{__CLR4_2_050w50wlnxz22p0.R.inc(6537);
        __CLR4_2_050w50wlnxz22p0.R.inc(6538);this.settings = settings;
        __CLR4_2_050w50wlnxz22p0.R.inc(6539);return this;
    }finally{__CLR4_2_050w50wlnxz22p0.R.flushNeeded();}}

    public ParseSettings settings() {try{__CLR4_2_050w50wlnxz22p0.R.inc(6540);
        __CLR4_2_050w50wlnxz22p0.R.inc(6541);return settings;
    }finally{__CLR4_2_050w50wlnxz22p0.R.flushNeeded();}}

    // static parse functions below
    /**
     * Parse HTML into a Document.
     *
     * @param html HTML to parse
     * @param baseUri base URI of document (i.e. original fetch location), for resolving relative URLs.
     *
     * @return parsed Document
     */
    public static Document parse(String html, String baseUri) {try{__CLR4_2_050w50wlnxz22p0.R.inc(6542);
        __CLR4_2_050w50wlnxz22p0.R.inc(6543);TreeBuilder treeBuilder = new HtmlTreeBuilder();
        __CLR4_2_050w50wlnxz22p0.R.inc(6544);return treeBuilder.parse(new StringReader(html), baseUri, new Parser(treeBuilder));
    }finally{__CLR4_2_050w50wlnxz22p0.R.flushNeeded();}}

    /**
     * Parse a fragment of HTML into a list of nodes. The context element, if supplied, supplies parsing context.
     *
     * @param fragmentHtml the fragment of HTML to parse
     * @param context (optional) the element that this HTML fragment is being parsed for (i.e. for inner HTML). This
     * provides stack context (for implicit element creation).
     * @param baseUri base URI of document (i.e. original fetch location), for resolving relative URLs.
     *
     * @return list of nodes parsed from the input HTML. Note that the context element, if supplied, is not modified.
     */
    public static List<Node> parseFragment(String fragmentHtml, Element context, String baseUri) {try{__CLR4_2_050w50wlnxz22p0.R.inc(6545);
        __CLR4_2_050w50wlnxz22p0.R.inc(6546);HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        __CLR4_2_050w50wlnxz22p0.R.inc(6547);return treeBuilder.parseFragment(fragmentHtml, context, baseUri, new Parser(treeBuilder));
    }finally{__CLR4_2_050w50wlnxz22p0.R.flushNeeded();}}

    /**
     * Parse a fragment of HTML into a list of nodes. The context element, if supplied, supplies parsing context.
     *
     * @param fragmentHtml the fragment of HTML to parse
     * @param context (optional) the element that this HTML fragment is being parsed for (i.e. for inner HTML). This
     * provides stack context (for implicit element creation).
     * @param baseUri base URI of document (i.e. original fetch location), for resolving relative URLs.
     * @param errorList list to add errors to
     *
     * @return list of nodes parsed from the input HTML. Note that the context element, if supplied, is not modified.
     */
    public static List<Node> parseFragment(String fragmentHtml, Element context, String baseUri, ParseErrorList errorList) {try{__CLR4_2_050w50wlnxz22p0.R.inc(6548);
        __CLR4_2_050w50wlnxz22p0.R.inc(6549);HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        __CLR4_2_050w50wlnxz22p0.R.inc(6550);Parser parser = new Parser(treeBuilder);
        __CLR4_2_050w50wlnxz22p0.R.inc(6551);parser.errors = errorList;
        __CLR4_2_050w50wlnxz22p0.R.inc(6552);return treeBuilder.parseFragment(fragmentHtml, context, baseUri, parser);
    }finally{__CLR4_2_050w50wlnxz22p0.R.flushNeeded();}}

    /**
     * Parse a fragment of XML into a list of nodes.
     *
     * @param fragmentXml the fragment of XML to parse
     * @param baseUri base URI of document (i.e. original fetch location), for resolving relative URLs.
     * @return list of nodes parsed from the input XML.
     */
    public static List<Node> parseXmlFragment(String fragmentXml, String baseUri) {try{__CLR4_2_050w50wlnxz22p0.R.inc(6553);
        __CLR4_2_050w50wlnxz22p0.R.inc(6554);XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        __CLR4_2_050w50wlnxz22p0.R.inc(6555);return treeBuilder.parseFragment(fragmentXml, baseUri, new Parser(treeBuilder));
    }finally{__CLR4_2_050w50wlnxz22p0.R.flushNeeded();}}

    /**
     * Parse a fragment of HTML into the {@code body} of a Document.
     *
     * @param bodyHtml fragment of HTML
     * @param baseUri base URI of document (i.e. original fetch location), for resolving relative URLs.
     *
     * @return Document, with empty head, and HTML parsed into body
     */
    public static Document parseBodyFragment(String bodyHtml, String baseUri) {try{__CLR4_2_050w50wlnxz22p0.R.inc(6556);
        __CLR4_2_050w50wlnxz22p0.R.inc(6557);Document doc = Document.createShell(baseUri);
        __CLR4_2_050w50wlnxz22p0.R.inc(6558);Element body = doc.body();
        __CLR4_2_050w50wlnxz22p0.R.inc(6559);List<Node> nodeList = parseFragment(bodyHtml, body, baseUri);
        __CLR4_2_050w50wlnxz22p0.R.inc(6560);Node[] nodes = nodeList.toArray(new Node[0]); // the node list gets modified when re-parented
        __CLR4_2_050w50wlnxz22p0.R.inc(6561);for (int i = nodes.length - 1; (((i > 0)&&(__CLR4_2_050w50wlnxz22p0.R.iget(6562)!=0|true))||(__CLR4_2_050w50wlnxz22p0.R.iget(6563)==0&false)); i--) {{
            __CLR4_2_050w50wlnxz22p0.R.inc(6564);nodes[i].remove();
        }
        }__CLR4_2_050w50wlnxz22p0.R.inc(6565);for (Node node : nodes) {{
            __CLR4_2_050w50wlnxz22p0.R.inc(6566);body.appendChild(node);
        }
        }__CLR4_2_050w50wlnxz22p0.R.inc(6567);return doc;
    }finally{__CLR4_2_050w50wlnxz22p0.R.flushNeeded();}}

    /**
     * Utility method to unescape HTML entities from a string
     * @param string HTML escaped string
     * @param inAttribute if the string is to be escaped in strict mode (as attributes are)
     * @return an unescaped string
     */
    public static String unescapeEntities(String string, boolean inAttribute) {try{__CLR4_2_050w50wlnxz22p0.R.inc(6568);
        __CLR4_2_050w50wlnxz22p0.R.inc(6569);Tokeniser tokeniser = new Tokeniser(new CharacterReader(string), ParseErrorList.noTracking());
        __CLR4_2_050w50wlnxz22p0.R.inc(6570);return tokeniser.unescapeEntities(inAttribute);
    }finally{__CLR4_2_050w50wlnxz22p0.R.flushNeeded();}}

    /**
     * @param bodyHtml HTML to parse
     * @param baseUri baseUri base URI of document (i.e. original fetch location), for resolving relative URLs.
     *
     * @return parsed Document
     * @deprecated Use {@link #parseBodyFragment} or {@link #parseFragment} instead.
     */
    public static Document parseBodyFragmentRelaxed(String bodyHtml, String baseUri) {try{__CLR4_2_050w50wlnxz22p0.R.inc(6571);
        __CLR4_2_050w50wlnxz22p0.R.inc(6572);return parse(bodyHtml, baseUri);
    }finally{__CLR4_2_050w50wlnxz22p0.R.flushNeeded();}}
    
    // builders

    /**
     * Create a new HTML parser. This parser treats input as HTML5, and enforces the creation of a normalised document,
     * based on a knowledge of the semantics of the incoming tags.
     * @return a new HTML parser.
     */
    public static Parser htmlParser() {try{__CLR4_2_050w50wlnxz22p0.R.inc(6573);
        __CLR4_2_050w50wlnxz22p0.R.inc(6574);return new Parser(new HtmlTreeBuilder());
    }finally{__CLR4_2_050w50wlnxz22p0.R.flushNeeded();}}

    /**
     * Create a new XML parser. This parser assumes no knowledge of the incoming tags and does not treat it as HTML,
     * rather creates a simple tree directly from the input.
     * @return a new simple XML parser.
     */
    public static Parser xmlParser() {try{__CLR4_2_050w50wlnxz22p0.R.inc(6575);
        __CLR4_2_050w50wlnxz22p0.R.inc(6576);return new Parser(new XmlTreeBuilder());
    }finally{__CLR4_2_050w50wlnxz22p0.R.flushNeeded();}}
}
