/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.select.Elements;
import org.junit.Ignore;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.List;

import static org.jsoup.nodes.Document.OutputSettings.Syntax;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Tests XmlTreeBuilder.
 *
 * @author Jonathan Hedley
 */
public class XmlTreeBuilderTest {static class __CLR4_2_0gnngnnlnxz239e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767707166L,8589935092L,21707,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void testSimpleXmlParse() {__CLR4_2_0gnngnnlnxz239e.R.globalSliceStart(getClass().getName(),21587);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0o01dt3gnn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gnngnnlnxz239e.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gnngnnlnxz239e.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.testSimpleXmlParse",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21587,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0o01dt3gnn(){try{__CLR4_2_0gnngnnlnxz239e.R.inc(21587);
        __CLR4_2_0gnngnnlnxz239e.R.inc(21588);String xml = "<doc id=2 href='/bar'>Foo <br /><link>One</link><link>Two</link></doc>";
        __CLR4_2_0gnngnnlnxz239e.R.inc(21589);XmlTreeBuilder tb = new XmlTreeBuilder();
        __CLR4_2_0gnngnnlnxz239e.R.inc(21590);Document doc = tb.parse(xml, "http://foo.com/");
        __CLR4_2_0gnngnnlnxz239e.R.inc(21591);assertEquals("<doc id=\"2\" href=\"/bar\">Foo <br /><link>One</link><link>Two</link></doc>",
                TextUtil.stripNewlines(doc.html()));
        __CLR4_2_0gnngnnlnxz239e.R.inc(21592);assertEquals(doc.getElementById("2").absUrl("href"), "http://foo.com/bar");
    }finally{__CLR4_2_0gnngnnlnxz239e.R.flushNeeded();}}

    @Test
    public void testPopToClose() {__CLR4_2_0gnngnnlnxz239e.R.globalSliceStart(getClass().getName(),21593);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0fzqisbgnt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gnngnnlnxz239e.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gnngnnlnxz239e.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.testPopToClose",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21593,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0fzqisbgnt(){try{__CLR4_2_0gnngnnlnxz239e.R.inc(21593);
        // test: </val> closes Two, </bar> ignored
        __CLR4_2_0gnngnnlnxz239e.R.inc(21594);String xml = "<doc><val>One<val>Two</val></bar>Three</doc>";
        __CLR4_2_0gnngnnlnxz239e.R.inc(21595);XmlTreeBuilder tb = new XmlTreeBuilder();
        __CLR4_2_0gnngnnlnxz239e.R.inc(21596);Document doc = tb.parse(xml, "http://foo.com/");
        __CLR4_2_0gnngnnlnxz239e.R.inc(21597);assertEquals("<doc><val>One<val>Two</val>Three</val></doc>",
                TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_2_0gnngnnlnxz239e.R.flushNeeded();}}

    @Test
    public void testCommentAndDocType() {__CLR4_2_0gnngnnlnxz239e.R.globalSliceStart(getClass().getName(),21598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0wy9gengny();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gnngnnlnxz239e.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gnngnnlnxz239e.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.testCommentAndDocType",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21598,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0wy9gengny(){try{__CLR4_2_0gnngnnlnxz239e.R.inc(21598);
        __CLR4_2_0gnngnnlnxz239e.R.inc(21599);String xml = "<!DOCTYPE HTML><!-- a comment -->One <qux />Two";
        __CLR4_2_0gnngnnlnxz239e.R.inc(21600);XmlTreeBuilder tb = new XmlTreeBuilder();
        __CLR4_2_0gnngnnlnxz239e.R.inc(21601);Document doc = tb.parse(xml, "http://foo.com/");
        __CLR4_2_0gnngnnlnxz239e.R.inc(21602);assertEquals("<!DOCTYPE HTML><!-- a comment -->One <qux />Two",
                TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_2_0gnngnnlnxz239e.R.flushNeeded();}}

    @Test
    public void testSupplyParserToJsoupClass() {__CLR4_2_0gnngnnlnxz239e.R.globalSliceStart(getClass().getName(),21603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_03lbxs7go3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gnngnnlnxz239e.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gnngnnlnxz239e.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.testSupplyParserToJsoupClass",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21603,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_03lbxs7go3(){try{__CLR4_2_0gnngnnlnxz239e.R.inc(21603);
        __CLR4_2_0gnngnnlnxz239e.R.inc(21604);String xml = "<doc><val>One<val>Two</val></bar>Three</doc>";
        __CLR4_2_0gnngnnlnxz239e.R.inc(21605);Document doc = Jsoup.parse(xml, "http://foo.com/", Parser.xmlParser());
        __CLR4_2_0gnngnnlnxz239e.R.inc(21606);assertEquals("<doc><val>One<val>Two</val>Three</val></doc>",
                TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_2_0gnngnnlnxz239e.R.flushNeeded();}}

    /*
    @Ignore
    @Test
    public void testSupplyParserToConnection() throws IOException {
        String xmlUrl = "http://direct.infohound.net/tools/jsoup-xml-test.xml";

        // parse with both xml and html parser, ensure different
        Document xmlDoc = Jsoup.connect(xmlUrl).parser(Parser.xmlParser()).get();
        Document htmlDoc = Jsoup.connect(xmlUrl).parser(Parser.htmlParser()).get();
        Document autoXmlDoc = Jsoup.connect(xmlUrl).get(); // check connection auto detects xml, uses xml parser

        assertEquals("<doc><val>One<val>Two</val>Three</val></doc>",
                TextUtil.stripNewlines(xmlDoc.html()));
        assertFalse(htmlDoc.equals(xmlDoc));
        assertEquals(xmlDoc, autoXmlDoc);
        assertEquals(1, htmlDoc.select("head").size()); // html parser normalises
        assertEquals(0, xmlDoc.select("head").size()); // xml parser does not
        assertEquals(0, autoXmlDoc.select("head").size()); // xml parser does not
    }*/

    @Test
    public void testSupplyParserToDataStream() throws IOException, URISyntaxException {__CLR4_2_0gnngnnlnxz239e.R.globalSliceStart(getClass().getName(),21607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_04x79jggo7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gnngnnlnxz239e.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gnngnnlnxz239e.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.testSupplyParserToDataStream",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21607,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_04x79jggo7() throws IOException, URISyntaxException{try{__CLR4_2_0gnngnnlnxz239e.R.inc(21607);
        __CLR4_2_0gnngnnlnxz239e.R.inc(21608);File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        __CLR4_2_0gnngnnlnxz239e.R.inc(21609);InputStream inStream = new FileInputStream(xmlFile);
        __CLR4_2_0gnngnnlnxz239e.R.inc(21610);Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        __CLR4_2_0gnngnnlnxz239e.R.inc(21611);assertEquals("<doc><val>One<val>Two</val>Three</val></doc>",
                TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_2_0gnngnnlnxz239e.R.flushNeeded();}}

    @Test
    public void testDoesNotForceSelfClosingKnownTags() {__CLR4_2_0gnngnnlnxz239e.R.globalSliceStart(getClass().getName(),21612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0yp7059goc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gnngnnlnxz239e.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gnngnnlnxz239e.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.testDoesNotForceSelfClosingKnownTags",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21612,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0yp7059goc(){try{__CLR4_2_0gnngnnlnxz239e.R.inc(21612);
        // html will force "<br>one</br>" to logically "<br />One<br />". XML should be stay "<br>one</br> -- don't recognise tag.
        __CLR4_2_0gnngnnlnxz239e.R.inc(21613);Document htmlDoc = Jsoup.parse("<br>one</br>");
        __CLR4_2_0gnngnnlnxz239e.R.inc(21614);assertEquals("<br>one\n<br>", htmlDoc.body().html());

        __CLR4_2_0gnngnnlnxz239e.R.inc(21615);Document xmlDoc = Jsoup.parse("<br>one</br>", "", Parser.xmlParser());
        __CLR4_2_0gnngnnlnxz239e.R.inc(21616);assertEquals("<br>one</br>", xmlDoc.html());
    }finally{__CLR4_2_0gnngnnlnxz239e.R.flushNeeded();}}

    @Test public void handlesXmlDeclarationAsDeclaration() {__CLR4_2_0gnngnnlnxz239e.R.globalSliceStart(getClass().getName(),21617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0wsusfzgoh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gnngnnlnxz239e.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gnngnnlnxz239e.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.handlesXmlDeclarationAsDeclaration",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21617,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0wsusfzgoh(){try{__CLR4_2_0gnngnnlnxz239e.R.inc(21617);
        __CLR4_2_0gnngnnlnxz239e.R.inc(21618);String html = "<?xml encoding='UTF-8' ?><body>One</body><!-- comment -->";
        __CLR4_2_0gnngnnlnxz239e.R.inc(21619);Document doc = Jsoup.parse(html, "", Parser.xmlParser());
        __CLR4_2_0gnngnnlnxz239e.R.inc(21620);assertEquals("<?xml encoding=\"UTF-8\"?> <body> One </body> <!-- comment -->",
                StringUtil.normaliseWhitespace(doc.outerHtml()));
        __CLR4_2_0gnngnnlnxz239e.R.inc(21621);assertEquals("#declaration", doc.childNode(0).nodeName());
        __CLR4_2_0gnngnnlnxz239e.R.inc(21622);assertEquals("#comment", doc.childNode(2).nodeName());
    }finally{__CLR4_2_0gnngnnlnxz239e.R.flushNeeded();}}

    @Test public void xmlFragment() {__CLR4_2_0gnngnnlnxz239e.R.globalSliceStart(getClass().getName(),21623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0uceqjygon();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gnngnnlnxz239e.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gnngnnlnxz239e.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.xmlFragment",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21623,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0uceqjygon(){try{__CLR4_2_0gnngnnlnxz239e.R.inc(21623);
        __CLR4_2_0gnngnnlnxz239e.R.inc(21624);String xml = "<one src='/foo/' />Two<three><four /></three>";
        __CLR4_2_0gnngnnlnxz239e.R.inc(21625);List<Node> nodes = Parser.parseXmlFragment(xml, "http://example.com/");
        __CLR4_2_0gnngnnlnxz239e.R.inc(21626);assertEquals(3, nodes.size());

        __CLR4_2_0gnngnnlnxz239e.R.inc(21627);assertEquals("http://example.com/foo/", nodes.get(0).absUrl("src"));
        __CLR4_2_0gnngnnlnxz239e.R.inc(21628);assertEquals("one", nodes.get(0).nodeName());
        __CLR4_2_0gnngnnlnxz239e.R.inc(21629);assertEquals("Two", ((TextNode)nodes.get(1)).text());
    }finally{__CLR4_2_0gnngnnlnxz239e.R.flushNeeded();}}

    @Test public void xmlParseDefaultsToHtmlOutputSyntax() {__CLR4_2_0gnngnnlnxz239e.R.globalSliceStart(getClass().getName(),21630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ex3hk1gou();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gnngnnlnxz239e.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gnngnnlnxz239e.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.xmlParseDefaultsToHtmlOutputSyntax",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21630,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ex3hk1gou(){try{__CLR4_2_0gnngnnlnxz239e.R.inc(21630);
        __CLR4_2_0gnngnnlnxz239e.R.inc(21631);Document doc = Jsoup.parse("x", "", Parser.xmlParser());
        __CLR4_2_0gnngnnlnxz239e.R.inc(21632);assertEquals(Syntax.xml, doc.outputSettings().syntax());
    }finally{__CLR4_2_0gnngnnlnxz239e.R.flushNeeded();}}

    @Test
    public void testDoesHandleEOFInTag() {__CLR4_2_0gnngnnlnxz239e.R.globalSliceStart(getClass().getName(),21633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0kspinngox();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gnngnnlnxz239e.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gnngnnlnxz239e.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.testDoesHandleEOFInTag",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21633,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0kspinngox(){try{__CLR4_2_0gnngnnlnxz239e.R.inc(21633);
        __CLR4_2_0gnngnnlnxz239e.R.inc(21634);String html = "<img src=asdf onerror=\"alert(1)\" x=";
        __CLR4_2_0gnngnnlnxz239e.R.inc(21635);Document xmlDoc = Jsoup.parse(html, "", Parser.xmlParser());
        __CLR4_2_0gnngnnlnxz239e.R.inc(21636);assertEquals("<img src=\"asdf\" onerror=\"alert(1)\" x=\"\" />", xmlDoc.html());
    }finally{__CLR4_2_0gnngnnlnxz239e.R.flushNeeded();}}

    @Test
    public void testDetectCharsetEncodingDeclaration() throws IOException, URISyntaxException {__CLR4_2_0gnngnnlnxz239e.R.globalSliceStart(getClass().getName(),21637);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_078j7zrgp1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gnngnnlnxz239e.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gnngnnlnxz239e.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.testDetectCharsetEncodingDeclaration",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21637,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_078j7zrgp1() throws IOException, URISyntaxException{try{__CLR4_2_0gnngnnlnxz239e.R.inc(21637);
        __CLR4_2_0gnngnnlnxz239e.R.inc(21638);File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        __CLR4_2_0gnngnnlnxz239e.R.inc(21639);InputStream inStream = new FileInputStream(xmlFile);
        __CLR4_2_0gnngnnlnxz239e.R.inc(21640);Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        __CLR4_2_0gnngnnlnxz239e.R.inc(21641);assertEquals("ISO-8859-1", doc.charset().name());
        __CLR4_2_0gnngnnlnxz239e.R.inc(21642);assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>",
            TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_2_0gnngnnlnxz239e.R.flushNeeded();}}

    @Test
    public void testParseDeclarationAttributes() {__CLR4_2_0gnngnnlnxz239e.R.globalSliceStart(getClass().getName(),21643);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0gfv65zgp7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gnngnnlnxz239e.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gnngnnlnxz239e.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.testParseDeclarationAttributes",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21643,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0gfv65zgp7(){try{__CLR4_2_0gnngnnlnxz239e.R.inc(21643);
        __CLR4_2_0gnngnnlnxz239e.R.inc(21644);String xml = "<?xml version='1' encoding='UTF-8' something='else'?><val>One</val>";
        __CLR4_2_0gnngnnlnxz239e.R.inc(21645);Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        __CLR4_2_0gnngnnlnxz239e.R.inc(21646);XmlDeclaration decl = (XmlDeclaration) doc.childNode(0);
        __CLR4_2_0gnngnnlnxz239e.R.inc(21647);assertEquals("1", decl.attr("version"));
        __CLR4_2_0gnngnnlnxz239e.R.inc(21648);assertEquals("UTF-8", decl.attr("encoding"));
        __CLR4_2_0gnngnnlnxz239e.R.inc(21649);assertEquals("else", decl.attr("something"));
        __CLR4_2_0gnngnnlnxz239e.R.inc(21650);assertEquals("version=\"1\" encoding=\"UTF-8\" something=\"else\"", decl.getWholeDeclaration());
        __CLR4_2_0gnngnnlnxz239e.R.inc(21651);assertEquals("<?xml version=\"1\" encoding=\"UTF-8\" something=\"else\"?>", decl.outerHtml());
    }finally{__CLR4_2_0gnngnnlnxz239e.R.flushNeeded();}}

    @Test
    public void caseSensitiveDeclaration() {__CLR4_2_0gnngnnlnxz239e.R.globalSliceStart(getClass().getName(),21652);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_033n50bgpg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gnngnnlnxz239e.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gnngnnlnxz239e.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.caseSensitiveDeclaration",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21652,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_033n50bgpg(){try{__CLR4_2_0gnngnnlnxz239e.R.inc(21652);
        __CLR4_2_0gnngnnlnxz239e.R.inc(21653);String xml = "<?XML version='1' encoding='UTF-8' something='else'?>";
        __CLR4_2_0gnngnnlnxz239e.R.inc(21654);Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        __CLR4_2_0gnngnnlnxz239e.R.inc(21655);assertEquals("<?XML version=\"1\" encoding=\"UTF-8\" something=\"else\"?>", doc.outerHtml());
    }finally{__CLR4_2_0gnngnnlnxz239e.R.flushNeeded();}}

    @Test
    public void testCreatesValidProlog() {__CLR4_2_0gnngnnlnxz239e.R.globalSliceStart(getClass().getName(),21656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_05vs5yjgpk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gnngnnlnxz239e.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gnngnnlnxz239e.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.testCreatesValidProlog",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21656,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_05vs5yjgpk(){try{__CLR4_2_0gnngnnlnxz239e.R.inc(21656);
        __CLR4_2_0gnngnnlnxz239e.R.inc(21657);Document document = Document.createShell("");
        __CLR4_2_0gnngnnlnxz239e.R.inc(21658);document.outputSettings().syntax(Syntax.xml);
        __CLR4_2_0gnngnnlnxz239e.R.inc(21659);document.charset(Charset.forName("utf-8"));
        __CLR4_2_0gnngnnlnxz239e.R.inc(21660);assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<html>\n" +
            " <head></head>\n" +
            " <body></body>\n" +
            "</html>", document.outerHtml());
    }finally{__CLR4_2_0gnngnnlnxz239e.R.flushNeeded();}}

    @Test
    public void preservesCaseByDefault() {__CLR4_2_0gnngnnlnxz239e.R.globalSliceStart(getClass().getName(),21661);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0sopafugpp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gnngnnlnxz239e.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gnngnnlnxz239e.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.preservesCaseByDefault",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21661,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0sopafugpp(){try{__CLR4_2_0gnngnnlnxz239e.R.inc(21661);
        __CLR4_2_0gnngnnlnxz239e.R.inc(21662);String xml = "<CHECK>One</CHECK><TEST ID=1>Check</TEST>";
        __CLR4_2_0gnngnnlnxz239e.R.inc(21663);Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        __CLR4_2_0gnngnnlnxz239e.R.inc(21664);assertEquals("<CHECK>One</CHECK><TEST ID=\"1\">Check</TEST>", TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_2_0gnngnnlnxz239e.R.flushNeeded();}}

    @Test
    public void appendPreservesCaseByDefault() {__CLR4_2_0gnngnnlnxz239e.R.globalSliceStart(getClass().getName(),21665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0nec978gpt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gnngnnlnxz239e.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gnngnnlnxz239e.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.appendPreservesCaseByDefault",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21665,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0nec978gpt(){try{__CLR4_2_0gnngnnlnxz239e.R.inc(21665);
        __CLR4_2_0gnngnnlnxz239e.R.inc(21666);String xml = "<One>One</One>";
        __CLR4_2_0gnngnnlnxz239e.R.inc(21667);Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        __CLR4_2_0gnngnnlnxz239e.R.inc(21668);Elements one = doc.select("One");
        __CLR4_2_0gnngnnlnxz239e.R.inc(21669);one.append("<Two ID=2>Two</Two>");
        __CLR4_2_0gnngnnlnxz239e.R.inc(21670);assertEquals("<One>One<Two ID=\"2\">Two</Two></One>", TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_2_0gnngnnlnxz239e.R.flushNeeded();}}

    @Test
    public void canNormalizeCase() {__CLR4_2_0gnngnnlnxz239e.R.globalSliceStart(getClass().getName(),21671);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_026v624gpz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gnngnnlnxz239e.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gnngnnlnxz239e.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.canNormalizeCase",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21671,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_026v624gpz(){try{__CLR4_2_0gnngnnlnxz239e.R.inc(21671);
        __CLR4_2_0gnngnnlnxz239e.R.inc(21672);String xml = "<TEST ID=1>Check</TEST>";
        __CLR4_2_0gnngnnlnxz239e.R.inc(21673);Document doc = Jsoup.parse(xml, "", Parser.xmlParser().settings(ParseSettings.htmlDefault));
        __CLR4_2_0gnngnnlnxz239e.R.inc(21674);assertEquals("<test id=\"1\">Check</test>", TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_2_0gnngnnlnxz239e.R.flushNeeded();}}

    @Test public void normalizesDiscordantTags() {__CLR4_2_0gnngnnlnxz239e.R.globalSliceStart(getClass().getName(),21675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_083kh27gq3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gnngnnlnxz239e.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gnngnnlnxz239e.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.normalizesDiscordantTags",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21675,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_083kh27gq3(){try{__CLR4_2_0gnngnnlnxz239e.R.inc(21675);
        __CLR4_2_0gnngnnlnxz239e.R.inc(21676);Parser parser = Parser.xmlParser().settings(ParseSettings.htmlDefault);
        __CLR4_2_0gnngnnlnxz239e.R.inc(21677);Document document = Jsoup.parse("<div>test</DIV><p></p>", "", parser);
        __CLR4_2_0gnngnnlnxz239e.R.inc(21678);assertEquals("<div>\n test\n</div>\n<p></p>", document.html());
        // was failing -> toString() = "<div>\n test\n <p></p>\n</div>"
    }finally{__CLR4_2_0gnngnnlnxz239e.R.flushNeeded();}}

    @Test public void roundTripsCdata() {__CLR4_2_0gnngnnlnxz239e.R.globalSliceStart(getClass().getName(),21679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_02v8ahggq7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gnngnnlnxz239e.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gnngnnlnxz239e.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.roundTripsCdata",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21679,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_02v8ahggq7(){try{__CLR4_2_0gnngnnlnxz239e.R.inc(21679);
        __CLR4_2_0gnngnnlnxz239e.R.inc(21680);String xml = "<div id=1><![CDATA[\n<html>\n <foo><&amp;]]></div>";
        __CLR4_2_0gnngnnlnxz239e.R.inc(21681);Document doc = Jsoup.parse(xml, "", Parser.xmlParser());

        __CLR4_2_0gnngnnlnxz239e.R.inc(21682);Element div = doc.getElementById("1");
        __CLR4_2_0gnngnnlnxz239e.R.inc(21683);assertEquals("<html>\n <foo><&amp;", div.text());
        __CLR4_2_0gnngnnlnxz239e.R.inc(21684);assertEquals(0, div.children().size());
        __CLR4_2_0gnngnnlnxz239e.R.inc(21685);assertEquals(1, div.childNodeSize()); // no elements, one text node

        __CLR4_2_0gnngnnlnxz239e.R.inc(21686);assertEquals("<div id=\"1\"><![CDATA[\n<html>\n <foo><&amp;]]>\n</div>", div.outerHtml());

        __CLR4_2_0gnngnnlnxz239e.R.inc(21687);CDataNode cdata = (CDataNode) div.textNodes().get(0);
        __CLR4_2_0gnngnnlnxz239e.R.inc(21688);assertEquals("\n<html>\n <foo><&amp;", cdata.text());
    }finally{__CLR4_2_0gnngnnlnxz239e.R.flushNeeded();}}

    @Test public void cdataPreservesWhiteSpace() {__CLR4_2_0gnngnnlnxz239e.R.globalSliceStart(getClass().getName(),21689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_07psr9agqh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gnngnnlnxz239e.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gnngnnlnxz239e.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.cdataPreservesWhiteSpace",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21689,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_07psr9agqh(){try{__CLR4_2_0gnngnnlnxz239e.R.inc(21689);
        __CLR4_2_0gnngnnlnxz239e.R.inc(21690);String xml = "<script type=\"text/javascript\">//<![CDATA[\n\n  foo();\n//]]></script>";
        __CLR4_2_0gnngnnlnxz239e.R.inc(21691);Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        __CLR4_2_0gnngnnlnxz239e.R.inc(21692);assertEquals(xml, doc.outerHtml());

        __CLR4_2_0gnngnnlnxz239e.R.inc(21693);assertEquals("//\n\n  foo();\n//", doc.selectFirst("script").text());
    }finally{__CLR4_2_0gnngnnlnxz239e.R.flushNeeded();}}

    @Test
    public void handlesDodgyXmlDecl() {__CLR4_2_0gnngnnlnxz239e.R.globalSliceStart(getClass().getName(),21694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0i5tfjsgqm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gnngnnlnxz239e.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gnngnnlnxz239e.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.handlesDodgyXmlDecl",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21694,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0i5tfjsgqm(){try{__CLR4_2_0gnngnnlnxz239e.R.inc(21694);
        __CLR4_2_0gnngnnlnxz239e.R.inc(21695);String xml = "<?xml version='1.0'><val>One</val>";
        __CLR4_2_0gnngnnlnxz239e.R.inc(21696);Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        __CLR4_2_0gnngnnlnxz239e.R.inc(21697);assertEquals("One", doc.select("val").text());
    }finally{__CLR4_2_0gnngnnlnxz239e.R.flushNeeded();}}

    @Test
    public void handlesLTinScript() {__CLR4_2_0gnngnnlnxz239e.R.globalSliceStart(getClass().getName(),21698);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_04hh3d6gqq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gnngnnlnxz239e.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gnngnnlnxz239e.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.handlesLTinScript",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21698,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_04hh3d6gqq(){try{__CLR4_2_0gnngnnlnxz239e.R.inc(21698);
        // https://github.com/jhy/jsoup/issues/1139
        __CLR4_2_0gnngnnlnxz239e.R.inc(21699);String html = "<script> var a=\"<?\"; var b=\"?>\"; </script>";
        __CLR4_2_0gnngnnlnxz239e.R.inc(21700);Document doc = Jsoup.parse(html, "", Parser.xmlParser());
        __CLR4_2_0gnngnnlnxz239e.R.inc(21701);assertEquals("<script> var a=\"\n <!--?\"; var b=\"?-->\"; </script>", doc.html()); // converted from pseudo xmldecl to comment
    }finally{__CLR4_2_0gnngnnlnxz239e.R.flushNeeded();}}

    @Test public void dropsDuplicateAttributes() {__CLR4_2_0gnngnnlnxz239e.R.globalSliceStart(getClass().getName(),21702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_01n6hxhgqu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gnngnnlnxz239e.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gnngnnlnxz239e.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.dropsDuplicateAttributes",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21702,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_01n6hxhgqu(){try{__CLR4_2_0gnngnnlnxz239e.R.inc(21702);
        // case sensitive, so should drop Four and Five
        __CLR4_2_0gnngnnlnxz239e.R.inc(21703);String html = "<p One=One ONE=Two one=Three One=Four ONE=Five two=Six two=Seven Two=Eight>Text</p>";
        __CLR4_2_0gnngnnlnxz239e.R.inc(21704);Parser parser = Parser.xmlParser().setTrackErrors(10);
        __CLR4_2_0gnngnnlnxz239e.R.inc(21705);Document doc = parser.parseInput(html, "");

        __CLR4_2_0gnngnnlnxz239e.R.inc(21706);assertEquals("<p One=\"One\" ONE=\"Two\" one=\"Three\" two=\"Six\" Two=\"Eight\">Text</p>", doc.selectFirst("p").outerHtml());
    }finally{__CLR4_2_0gnngnnlnxz239e.R.flushNeeded();}}

}
