/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.safety.Cleaner;
import org.jsoup.safety.Whitelist;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.HttpConnection;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 The core public access point to the jsoup functionality.

 @author Jonathan Hedley */
public class Jsoup {public static class __CLR4_2_0eelnxz22dw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,54,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Jsoup() {try{__CLR4_2_0eelnxz22dw.R.inc(14);}finally{__CLR4_2_0eelnxz22dw.R.flushNeeded();}}

    /**
     Parse HTML into a Document. The parser will make a sensible, balanced document tree out of any HTML.

     @param html    HTML to parse
     @param baseUri The URL where the HTML was retrieved from. Used to resolve relative URLs to absolute URLs, that occur
     before the HTML declares a {@code <base href>} tag.
     @return sane HTML
     */
    public static Document parse(String html, String baseUri) {try{__CLR4_2_0eelnxz22dw.R.inc(15);
        __CLR4_2_0eelnxz22dw.R.inc(16);return Parser.parse(html, baseUri);
    }finally{__CLR4_2_0eelnxz22dw.R.flushNeeded();}}

    /**
     Parse HTML into a Document, using the provided Parser. You can provide an alternate parser, such as a simple XML
     (non-HTML) parser.

     @param html    HTML to parse
     @param baseUri The URL where the HTML was retrieved from. Used to resolve relative URLs to absolute URLs, that occur
     before the HTML declares a {@code <base href>} tag.
     @param parser alternate {@link Parser#xmlParser() parser} to use.
     @return sane HTML
     */
    public static Document parse(String html, String baseUri, Parser parser) {try{__CLR4_2_0eelnxz22dw.R.inc(17);
        __CLR4_2_0eelnxz22dw.R.inc(18);return parser.parseInput(html, baseUri);
    }finally{__CLR4_2_0eelnxz22dw.R.flushNeeded();}}

    /**
     Parse HTML into a Document. As no base URI is specified, absolute URL detection relies on the HTML including a
     {@code <base href>} tag.

     @param html HTML to parse
     @return sane HTML

     @see #parse(String, String)
     */
    public static Document parse(String html) {try{__CLR4_2_0eelnxz22dw.R.inc(19);
        __CLR4_2_0eelnxz22dw.R.inc(20);return Parser.parse(html, "");
    }finally{__CLR4_2_0eelnxz22dw.R.flushNeeded();}}

    /**
     * Creates a new {@link Connection} to a URL. Use to fetch and parse a HTML page.
     * <p>
     * Use examples:
     * <ul>
     *  <li><code>Document doc = Jsoup.connect("http://example.com").userAgent("Mozilla").data("name", "jsoup").get();</code></li>
     *  <li><code>Document doc = Jsoup.connect("http://example.com").cookie("auth", "token").post();</code></li>
     * </ul>
     * @param url URL to connect to. The protocol must be {@code http} or {@code https}.
     * @return the connection. You can add data, cookies, and headers; set the user-agent, referrer, method; and then execute.
     */
    public static Connection connect(String url) {try{__CLR4_2_0eelnxz22dw.R.inc(21);
        __CLR4_2_0eelnxz22dw.R.inc(22);return HttpConnection.connect(url);
    }finally{__CLR4_2_0eelnxz22dw.R.flushNeeded();}}

    /**
     Parse the contents of a file as HTML.

     @param in          file to load HTML from
     @param charsetName (optional) character set of file contents. Set to {@code null} to determine from {@code http-equiv} meta tag, if
     present, or fall back to {@code UTF-8} (which is often safe to do).
     @param baseUri     The URL where the HTML was retrieved from, to resolve relative links against.
     @return sane HTML

     @throws IOException if the file could not be found, or read, or if the charsetName is invalid.
     */
    public static Document parse(File in, String charsetName, String baseUri) throws IOException {try{__CLR4_2_0eelnxz22dw.R.inc(23);
        __CLR4_2_0eelnxz22dw.R.inc(24);return DataUtil.load(in, charsetName, baseUri);
    }finally{__CLR4_2_0eelnxz22dw.R.flushNeeded();}}

    /**
     Parse the contents of a file as HTML. The location of the file is used as the base URI to qualify relative URLs.

     @param in          file to load HTML from
     @param charsetName (optional) character set of file contents. Set to {@code null} to determine from {@code http-equiv} meta tag, if
     present, or fall back to {@code UTF-8} (which is often safe to do).
     @return sane HTML

     @throws IOException if the file could not be found, or read, or if the charsetName is invalid.
     @see #parse(File, String, String)
     */
    public static Document parse(File in, String charsetName) throws IOException {try{__CLR4_2_0eelnxz22dw.R.inc(25);
        __CLR4_2_0eelnxz22dw.R.inc(26);return DataUtil.load(in, charsetName, in.getAbsolutePath());
    }finally{__CLR4_2_0eelnxz22dw.R.flushNeeded();}}

     /**
     Read an input stream, and parse it to a Document.

     @param in          input stream to read. Make sure to close it after parsing.
     @param charsetName (optional) character set of file contents. Set to {@code null} to determine from {@code http-equiv} meta tag, if
     present, or fall back to {@code UTF-8} (which is often safe to do).
     @param baseUri     The URL where the HTML was retrieved from, to resolve relative links against.
     @return sane HTML

     @throws IOException if the file could not be found, or read, or if the charsetName is invalid.
     */
    public static Document parse(InputStream in, String charsetName, String baseUri) throws IOException {try{__CLR4_2_0eelnxz22dw.R.inc(27);
        __CLR4_2_0eelnxz22dw.R.inc(28);return DataUtil.load(in, charsetName, baseUri);
    }finally{__CLR4_2_0eelnxz22dw.R.flushNeeded();}}

    /**
     Read an input stream, and parse it to a Document. You can provide an alternate parser, such as a simple XML
     (non-HTML) parser.

     @param in          input stream to read. Make sure to close it after parsing.
     @param charsetName (optional) character set of file contents. Set to {@code null} to determine from {@code http-equiv} meta tag, if
     present, or fall back to {@code UTF-8} (which is often safe to do).
     @param baseUri     The URL where the HTML was retrieved from, to resolve relative links against.
     @param parser alternate {@link Parser#xmlParser() parser} to use.
     @return sane HTML

     @throws IOException if the file could not be found, or read, or if the charsetName is invalid.
     */
    public static Document parse(InputStream in, String charsetName, String baseUri, Parser parser) throws IOException {try{__CLR4_2_0eelnxz22dw.R.inc(29);
        __CLR4_2_0eelnxz22dw.R.inc(30);return DataUtil.load(in, charsetName, baseUri, parser);
    }finally{__CLR4_2_0eelnxz22dw.R.flushNeeded();}}

    /**
     Parse a fragment of HTML, with the assumption that it forms the {@code body} of the HTML.

     @param bodyHtml body HTML fragment
     @param baseUri  URL to resolve relative URLs against.
     @return sane HTML document

     @see Document#body()
     */
    public static Document parseBodyFragment(String bodyHtml, String baseUri) {try{__CLR4_2_0eelnxz22dw.R.inc(31);
        __CLR4_2_0eelnxz22dw.R.inc(32);return Parser.parseBodyFragment(bodyHtml, baseUri);
    }finally{__CLR4_2_0eelnxz22dw.R.flushNeeded();}}

    /**
     Parse a fragment of HTML, with the assumption that it forms the {@code body} of the HTML.

     @param bodyHtml body HTML fragment
     @return sane HTML document

     @see Document#body()
     */
    public static Document parseBodyFragment(String bodyHtml) {try{__CLR4_2_0eelnxz22dw.R.inc(33);
        __CLR4_2_0eelnxz22dw.R.inc(34);return Parser.parseBodyFragment(bodyHtml, "");
    }finally{__CLR4_2_0eelnxz22dw.R.flushNeeded();}}

    /**
     Fetch a URL, and parse it as HTML. Provided for compatibility; in most cases use {@link #connect(String)} instead.
     <p>
     The encoding character set is determined by the content-type header or http-equiv meta tag, or falls back to {@code UTF-8}.

     @param url           URL to fetch (with a GET). The protocol must be {@code http} or {@code https}.
     @param timeoutMillis Connection and read timeout, in milliseconds. If exceeded, IOException is thrown.
     @return The parsed HTML.

     @throws java.net.MalformedURLException if the request URL is not a HTTP or HTTPS URL, or is otherwise malformed
     @throws HttpStatusException if the response is not OK and HTTP response errors are not ignored
     @throws UnsupportedMimeTypeException if the response mime type is not supported and those errors are not ignored
     @throws java.net.SocketTimeoutException if the connection times out
     @throws IOException if a connection or read error occurs

     @see #connect(String)
     */
    public static Document parse(URL url, int timeoutMillis) throws IOException {try{__CLR4_2_0eelnxz22dw.R.inc(35);
        __CLR4_2_0eelnxz22dw.R.inc(36);Connection con = HttpConnection.connect(url);
        __CLR4_2_0eelnxz22dw.R.inc(37);con.timeout(timeoutMillis);
        __CLR4_2_0eelnxz22dw.R.inc(38);return con.get();
    }finally{__CLR4_2_0eelnxz22dw.R.flushNeeded();}}

    /**
     Get safe HTML from untrusted input HTML, by parsing input HTML and filtering it through a white-list of permitted
     tags and attributes.

     @param bodyHtml  input untrusted HTML (body fragment)
     @param baseUri   URL to resolve relative URLs against
     @param whitelist white-list of permitted HTML elements
     @return safe HTML (body fragment)

     @see Cleaner#clean(Document)
     */
    public static String clean(String bodyHtml, String baseUri, Whitelist whitelist) {try{__CLR4_2_0eelnxz22dw.R.inc(39);
        __CLR4_2_0eelnxz22dw.R.inc(40);Document dirty = parseBodyFragment(bodyHtml, baseUri);
        __CLR4_2_0eelnxz22dw.R.inc(41);Cleaner cleaner = new Cleaner(whitelist);
        __CLR4_2_0eelnxz22dw.R.inc(42);Document clean = cleaner.clean(dirty);
        __CLR4_2_0eelnxz22dw.R.inc(43);return clean.body().html();
    }finally{__CLR4_2_0eelnxz22dw.R.flushNeeded();}}

    /**
     Get safe HTML from untrusted input HTML, by parsing input HTML and filtering it through a white-list of permitted
     tags and attributes.

     @param bodyHtml  input untrusted HTML (body fragment)
     @param whitelist white-list of permitted HTML elements
     @return safe HTML (body fragment)

     @see Cleaner#clean(Document)
     */
    public static String clean(String bodyHtml, Whitelist whitelist) {try{__CLR4_2_0eelnxz22dw.R.inc(44);
        __CLR4_2_0eelnxz22dw.R.inc(45);return clean(bodyHtml, "", whitelist);
    }finally{__CLR4_2_0eelnxz22dw.R.flushNeeded();}}

    /**
     * Get safe HTML from untrusted input HTML, by parsing input HTML and filtering it through a white-list of
     * permitted tags and attributes.
     * <p>The HTML is treated as a body fragment; it's expected the cleaned HTML will be used within the body of an
     * existing document. If you want to clean full documents, use {@link Cleaner#clean(Document)} instead, and add
     * structural tags (<code>html, head, body</code> etc) to the whitelist.
     *
     * @param bodyHtml input untrusted HTML (body fragment)
     * @param baseUri URL to resolve relative URLs against
     * @param whitelist white-list of permitted HTML elements
     * @param outputSettings document output settings; use to control pretty-printing and entity escape modes
     * @return safe HTML (body fragment)
     * @see Cleaner#clean(Document)
     */
    public static String clean(String bodyHtml, String baseUri, Whitelist whitelist, Document.OutputSettings outputSettings) {try{__CLR4_2_0eelnxz22dw.R.inc(46);
        __CLR4_2_0eelnxz22dw.R.inc(47);Document dirty = parseBodyFragment(bodyHtml, baseUri);
        __CLR4_2_0eelnxz22dw.R.inc(48);Cleaner cleaner = new Cleaner(whitelist);
        __CLR4_2_0eelnxz22dw.R.inc(49);Document clean = cleaner.clean(dirty);
        __CLR4_2_0eelnxz22dw.R.inc(50);clean.outputSettings(outputSettings);
        __CLR4_2_0eelnxz22dw.R.inc(51);return clean.body().html();
    }finally{__CLR4_2_0eelnxz22dw.R.flushNeeded();}}

    /**
     Test if the input body HTML has only tags and attributes allowed by the Whitelist. Useful for form validation.
     <p>The input HTML should still be run through the cleaner to set up enforced attributes, and to tidy the output.
     <p>Assumes the HTML is a body fragment (i.e. will be used in an existing HTML document body.)
     @param bodyHtml HTML to test
     @param whitelist whitelist to test against
     @return true if no tags or attributes were removed; false otherwise
     @see #clean(String, org.jsoup.safety.Whitelist) 
     */
    public static boolean isValid(String bodyHtml, Whitelist whitelist) {try{__CLR4_2_0eelnxz22dw.R.inc(52);
        __CLR4_2_0eelnxz22dw.R.inc(53);return new Cleaner(whitelist).isValidBodyHtml(bodyHtml);
    }finally{__CLR4_2_0eelnxz22dw.R.flushNeeded();}}
    
}
