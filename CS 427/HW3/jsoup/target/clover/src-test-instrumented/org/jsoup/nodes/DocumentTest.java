/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.jsoup.integration.ParseTest;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Document.OutputSettings.Syntax;
import org.jsoup.select.Elements;
import org.junit.Ignore;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 Tests for Document.

 @author Jonathan Hedley, jonathan@hedley.net */
public class DocumentTest {static class __CLR4_2_0e92e92lnxz236o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767707166L,8589935092L,18699,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final String charsetUtf8 = "UTF-8";
    private static final String charsetIso8859 = "ISO-8859-1";
    
    
    @Test public void setTextPreservesDocumentStructure() {__CLR4_2_0e92e92lnxz236o.R.globalSliceStart(getClass().getName(),18470);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0u5fv21e92();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e92e92lnxz236o.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e92e92lnxz236o.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.setTextPreservesDocumentStructure",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18470,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0u5fv21e92(){try{__CLR4_2_0e92e92lnxz236o.R.inc(18470);
        __CLR4_2_0e92e92lnxz236o.R.inc(18471);Document doc = Jsoup.parse("<p>Hello</p>");
        __CLR4_2_0e92e92lnxz236o.R.inc(18472);doc.text("Replaced");
        __CLR4_2_0e92e92lnxz236o.R.inc(18473);assertEquals("Replaced", doc.text());
        __CLR4_2_0e92e92lnxz236o.R.inc(18474);assertEquals("Replaced", doc.body().text());
        __CLR4_2_0e92e92lnxz236o.R.inc(18475);assertEquals(1, doc.select("head").size());
    }finally{__CLR4_2_0e92e92lnxz236o.R.flushNeeded();}}
    
    @Test public void testTitles() {__CLR4_2_0e92e92lnxz236o.R.globalSliceStart(getClass().getName(),18476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_04ybsoke98();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e92e92lnxz236o.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e92e92lnxz236o.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testTitles",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18476,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_04ybsoke98(){try{__CLR4_2_0e92e92lnxz236o.R.inc(18476);
        __CLR4_2_0e92e92lnxz236o.R.inc(18477);Document noTitle = Jsoup.parse("<p>Hello</p>");
        __CLR4_2_0e92e92lnxz236o.R.inc(18478);Document withTitle = Jsoup.parse("<title>First</title><title>Ignore</title><p>Hello</p>");
        
        __CLR4_2_0e92e92lnxz236o.R.inc(18479);assertEquals("", noTitle.title());
        __CLR4_2_0e92e92lnxz236o.R.inc(18480);noTitle.title("Hello");
        __CLR4_2_0e92e92lnxz236o.R.inc(18481);assertEquals("Hello", noTitle.title());
        __CLR4_2_0e92e92lnxz236o.R.inc(18482);assertEquals("Hello", noTitle.select("title").first().text());
        
        __CLR4_2_0e92e92lnxz236o.R.inc(18483);assertEquals("First", withTitle.title());
        __CLR4_2_0e92e92lnxz236o.R.inc(18484);withTitle.title("Hello");
        __CLR4_2_0e92e92lnxz236o.R.inc(18485);assertEquals("Hello", withTitle.title());
        __CLR4_2_0e92e92lnxz236o.R.inc(18486);assertEquals("Hello", withTitle.select("title").first().text());

        __CLR4_2_0e92e92lnxz236o.R.inc(18487);Document normaliseTitle = Jsoup.parse("<title>   Hello\nthere   \n   now   \n");
        __CLR4_2_0e92e92lnxz236o.R.inc(18488);assertEquals("Hello there now", normaliseTitle.title());
    }finally{__CLR4_2_0e92e92lnxz236o.R.flushNeeded();}}

    @Test public void testOutputEncoding() {__CLR4_2_0e92e92lnxz236o.R.globalSliceStart(getClass().getName(),18489);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ymftppe9l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e92e92lnxz236o.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e92e92lnxz236o.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testOutputEncoding",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18489,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ymftppe9l(){try{__CLR4_2_0e92e92lnxz236o.R.inc(18489);
        __CLR4_2_0e92e92lnxz236o.R.inc(18490);Document doc = Jsoup.parse("<p title=\u03c0>\u03c0 & < > </p>");
        // default is utf-8
        __CLR4_2_0e92e92lnxz236o.R.inc(18491);assertEquals("<p title=\"\u03c0\">\u03c0 &amp; &lt; &gt; </p>", doc.body().html());
        __CLR4_2_0e92e92lnxz236o.R.inc(18492);assertEquals("UTF-8", doc.outputSettings().charset().name());

        __CLR4_2_0e92e92lnxz236o.R.inc(18493);doc.outputSettings().charset("ascii");
        __CLR4_2_0e92e92lnxz236o.R.inc(18494);assertEquals(Entities.EscapeMode.base, doc.outputSettings().escapeMode());
        __CLR4_2_0e92e92lnxz236o.R.inc(18495);assertEquals("<p title=\"&#x3c0;\">&#x3c0; &amp; &lt; &gt; </p>", doc.body().html());

        __CLR4_2_0e92e92lnxz236o.R.inc(18496);doc.outputSettings().escapeMode(Entities.EscapeMode.extended);
        __CLR4_2_0e92e92lnxz236o.R.inc(18497);assertEquals("<p title=\"&pi;\">&pi; &amp; &lt; &gt; </p>", doc.body().html());
    }finally{__CLR4_2_0e92e92lnxz236o.R.flushNeeded();}}

    @Test public void testXhtmlReferences() {__CLR4_2_0e92e92lnxz236o.R.globalSliceStart(getClass().getName(),18498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0khgegwe9u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e92e92lnxz236o.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e92e92lnxz236o.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testXhtmlReferences",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18498,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0khgegwe9u(){try{__CLR4_2_0e92e92lnxz236o.R.inc(18498);
        __CLR4_2_0e92e92lnxz236o.R.inc(18499);Document doc = Jsoup.parse("&lt; &gt; &amp; &quot; &apos; &times;");
        __CLR4_2_0e92e92lnxz236o.R.inc(18500);doc.outputSettings().escapeMode(Entities.EscapeMode.xhtml);
        __CLR4_2_0e92e92lnxz236o.R.inc(18501);assertEquals("&lt; &gt; &amp; \" ' \u00d7", doc.body().html());
    }finally{__CLR4_2_0e92e92lnxz236o.R.flushNeeded();}}

    @Test public void testNormalisesStructure() {__CLR4_2_0e92e92lnxz236o.R.globalSliceStart(getClass().getName(),18502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_043a7wpe9y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e92e92lnxz236o.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e92e92lnxz236o.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testNormalisesStructure",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18502,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_043a7wpe9y(){try{__CLR4_2_0e92e92lnxz236o.R.inc(18502);
        __CLR4_2_0e92e92lnxz236o.R.inc(18503);Document doc = Jsoup.parse("<html><head><script>one</script><noscript><p>two</p></noscript></head><body><p>three</p></body><p>four</p></html>");
        __CLR4_2_0e92e92lnxz236o.R.inc(18504);assertEquals("<html><head><script>one</script><noscript>&lt;p&gt;two</noscript></head><body><p>three</p><p>four</p></body></html>", TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_2_0e92e92lnxz236o.R.flushNeeded();}}

    @Test public void testClone() {__CLR4_2_0e92e92lnxz236o.R.globalSliceStart(getClass().getName(),18505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0csyejyea1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e92e92lnxz236o.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e92e92lnxz236o.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testClone",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18505,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0csyejyea1(){try{__CLR4_2_0e92e92lnxz236o.R.inc(18505);
        __CLR4_2_0e92e92lnxz236o.R.inc(18506);Document doc = Jsoup.parse("<title>Hello</title> <p>One<p>Two");
        __CLR4_2_0e92e92lnxz236o.R.inc(18507);Document clone = doc.clone();

        __CLR4_2_0e92e92lnxz236o.R.inc(18508);assertEquals("<html><head><title>Hello</title> </head><body><p>One</p><p>Two</p></body></html>", TextUtil.stripNewlines(clone.html()));
        __CLR4_2_0e92e92lnxz236o.R.inc(18509);clone.title("Hello there");
        __CLR4_2_0e92e92lnxz236o.R.inc(18510);clone.select("p").first().text("One more").attr("id", "1");
        __CLR4_2_0e92e92lnxz236o.R.inc(18511);assertEquals("<html><head><title>Hello there</title> </head><body><p id=\"1\">One more</p><p>Two</p></body></html>", TextUtil.stripNewlines(clone.html()));
        __CLR4_2_0e92e92lnxz236o.R.inc(18512);assertEquals("<html><head><title>Hello</title> </head><body><p>One</p><p>Two</p></body></html>", TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_2_0e92e92lnxz236o.R.flushNeeded();}}

    @Test public void testClonesDeclarations() {__CLR4_2_0e92e92lnxz236o.R.globalSliceStart(getClass().getName(),18513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ery4bsea9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e92e92lnxz236o.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e92e92lnxz236o.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testClonesDeclarations",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18513,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ery4bsea9(){try{__CLR4_2_0e92e92lnxz236o.R.inc(18513);
        __CLR4_2_0e92e92lnxz236o.R.inc(18514);Document doc = Jsoup.parse("<!DOCTYPE html><html><head><title>Doctype test");
        __CLR4_2_0e92e92lnxz236o.R.inc(18515);Document clone = doc.clone();

        __CLR4_2_0e92e92lnxz236o.R.inc(18516);assertEquals(doc.html(), clone.html());
        __CLR4_2_0e92e92lnxz236o.R.inc(18517);assertEquals("<!doctype html><html><head><title>Doctype test</title></head><body></body></html>",
                TextUtil.stripNewlines(clone.html()));
    }finally{__CLR4_2_0e92e92lnxz236o.R.flushNeeded();}}
    
    @Test public void testLocation() throws IOException {__CLR4_2_0e92e92lnxz236o.R.globalSliceStart(getClass().getName(),18518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0eng6cyeae();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e92e92lnxz236o.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e92e92lnxz236o.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testLocation",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18518,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0eng6cyeae() throws IOException{try{__CLR4_2_0e92e92lnxz236o.R.inc(18518);
    	__CLR4_2_0e92e92lnxz236o.R.inc(18519);File in = new ParseTest().getFile("/htmltests/yahoo-jp.html");
        __CLR4_2_0e92e92lnxz236o.R.inc(18520);Document doc = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html");
        __CLR4_2_0e92e92lnxz236o.R.inc(18521);String location = doc.location();
        __CLR4_2_0e92e92lnxz236o.R.inc(18522);String baseUri = doc.baseUri();
        __CLR4_2_0e92e92lnxz236o.R.inc(18523);assertEquals("http://www.yahoo.co.jp/index.html",location);
        __CLR4_2_0e92e92lnxz236o.R.inc(18524);assertEquals("http://www.yahoo.co.jp/_ylh=X3oDMTB0NWxnaGxsBF9TAzIwNzcyOTYyNjUEdGlkAzEyBHRtcGwDZ2Ex/",baseUri);
        __CLR4_2_0e92e92lnxz236o.R.inc(18525);in = new ParseTest().getFile("/htmltests/nyt-article-1.html");
        __CLR4_2_0e92e92lnxz236o.R.inc(18526);doc = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp");
        __CLR4_2_0e92e92lnxz236o.R.inc(18527);location = doc.location();
        __CLR4_2_0e92e92lnxz236o.R.inc(18528);baseUri = doc.baseUri();
        __CLR4_2_0e92e92lnxz236o.R.inc(18529);assertEquals("http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp",location);
        __CLR4_2_0e92e92lnxz236o.R.inc(18530);assertEquals("http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp",baseUri);
    }finally{__CLR4_2_0e92e92lnxz236o.R.flushNeeded();}}

    @Test public void testHtmlAndXmlSyntax() {__CLR4_2_0e92e92lnxz236o.R.globalSliceStart(getClass().getName(),18531);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ggq8efear();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e92e92lnxz236o.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e92e92lnxz236o.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testHtmlAndXmlSyntax",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18531,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ggq8efear(){try{__CLR4_2_0e92e92lnxz236o.R.inc(18531);
        __CLR4_2_0e92e92lnxz236o.R.inc(18532);String h = "<!DOCTYPE html><body><img async checked='checked' src='&<>\"'>&lt;&gt;&amp;&quot;<foo />bar";
        __CLR4_2_0e92e92lnxz236o.R.inc(18533);Document doc = Jsoup.parse(h);

        __CLR4_2_0e92e92lnxz236o.R.inc(18534);doc.outputSettings().syntax(Syntax.html);
        __CLR4_2_0e92e92lnxz236o.R.inc(18535);assertEquals("<!doctype html>\n" +
                "<html>\n" +
                " <head></head>\n" +
                " <body>\n" +
                "  <img async checked src=\"&amp;<>&quot;\">&lt;&gt;&amp;\"\n" +
                "  <foo />bar\n" +
                " </body>\n" +
                "</html>", doc.html());

        __CLR4_2_0e92e92lnxz236o.R.inc(18536);doc.outputSettings().syntax(Document.OutputSettings.Syntax.xml);
        __CLR4_2_0e92e92lnxz236o.R.inc(18537);assertEquals("<!DOCTYPE html>\n" +
                "<html>\n" +
                " <head></head>\n" +
                " <body>\n" +
                "  <img async=\"\" checked=\"checked\" src=\"&amp;<>&quot;\" />&lt;&gt;&amp;\"\n" +
                "  <foo />bar\n" +
                " </body>\n" +
                "</html>", doc.html());
    }finally{__CLR4_2_0e92e92lnxz236o.R.flushNeeded();}}

    @Test public void htmlParseDefaultsToHtmlOutputSyntax() {__CLR4_2_0e92e92lnxz236o.R.globalSliceStart(getClass().getName(),18538);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0d3kde3eay();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e92e92lnxz236o.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e92e92lnxz236o.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.htmlParseDefaultsToHtmlOutputSyntax",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18538,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0d3kde3eay(){try{__CLR4_2_0e92e92lnxz236o.R.inc(18538);
        __CLR4_2_0e92e92lnxz236o.R.inc(18539);Document doc = Jsoup.parse("x");
        __CLR4_2_0e92e92lnxz236o.R.inc(18540);assertEquals(Syntax.html, doc.outputSettings().syntax());
    }finally{__CLR4_2_0e92e92lnxz236o.R.flushNeeded();}}
    
    @Test public void testHtmlAppendable() {__CLR4_2_0e92e92lnxz236o.R.globalSliceStart(getClass().getName(),18541);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0b0ous8eb1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e92e92lnxz236o.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e92e92lnxz236o.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testHtmlAppendable",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18541,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0b0ous8eb1(){try{__CLR4_2_0e92e92lnxz236o.R.inc(18541);
    	__CLR4_2_0e92e92lnxz236o.R.inc(18542);String htmlContent = "<html><head><title>Hello</title></head><body><p>One</p><p>Two</p></body></html>";
    	__CLR4_2_0e92e92lnxz236o.R.inc(18543);Document document = Jsoup.parse(htmlContent);
    	__CLR4_2_0e92e92lnxz236o.R.inc(18544);OutputSettings outputSettings = new OutputSettings();
    	
    	__CLR4_2_0e92e92lnxz236o.R.inc(18545);outputSettings.prettyPrint(false);
    	__CLR4_2_0e92e92lnxz236o.R.inc(18546);document.outputSettings(outputSettings);
    	__CLR4_2_0e92e92lnxz236o.R.inc(18547);assertEquals(htmlContent, document.html(new StringWriter()).toString());
    }finally{__CLR4_2_0e92e92lnxz236o.R.flushNeeded();}}

    // Ignored since this test can take awhile to run.
    /*@Ignore
    @Test public void testOverflowClone() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            builder.insert(0, "<i>");
            builder.append("</i>");
        }

        Document doc = Jsoup.parse(builder.toString());
        doc.clone();
    }*/

    @Test public void DocumentsWithSameContentAreEqual() throws Exception {__CLR4_2_0e92e92lnxz236o.R.globalSliceStart(getClass().getName(),18548);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0y0cvfoeb8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e92e92lnxz236o.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e92e92lnxz236o.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.DocumentsWithSameContentAreEqual",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18548,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0y0cvfoeb8() throws Exception{try{__CLR4_2_0e92e92lnxz236o.R.inc(18548);
        __CLR4_2_0e92e92lnxz236o.R.inc(18549);Document docA = Jsoup.parse("<div/>One");
        __CLR4_2_0e92e92lnxz236o.R.inc(18550);Document docB = Jsoup.parse("<div/>One");
        __CLR4_2_0e92e92lnxz236o.R.inc(18551);Document docC = Jsoup.parse("<div/>Two");

        __CLR4_2_0e92e92lnxz236o.R.inc(18552);assertFalse(docA.equals(docB));
        __CLR4_2_0e92e92lnxz236o.R.inc(18553);assertTrue(docA.equals(docA));
        __CLR4_2_0e92e92lnxz236o.R.inc(18554);assertEquals(docA.hashCode(), docA.hashCode());
        __CLR4_2_0e92e92lnxz236o.R.inc(18555);assertFalse(docA.hashCode() == docC.hashCode());
    }finally{__CLR4_2_0e92e92lnxz236o.R.flushNeeded();}}

    @Test public void DocumentsWithSameContentAreVerifialbe() throws Exception {__CLR4_2_0e92e92lnxz236o.R.globalSliceStart(getClass().getName(),18556);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_04x62m5ebg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e92e92lnxz236o.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e92e92lnxz236o.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.DocumentsWithSameContentAreVerifialbe",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18556,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_04x62m5ebg() throws Exception{try{__CLR4_2_0e92e92lnxz236o.R.inc(18556);
        __CLR4_2_0e92e92lnxz236o.R.inc(18557);Document docA = Jsoup.parse("<div/>One");
        __CLR4_2_0e92e92lnxz236o.R.inc(18558);Document docB = Jsoup.parse("<div/>One");
        __CLR4_2_0e92e92lnxz236o.R.inc(18559);Document docC = Jsoup.parse("<div/>Two");

        __CLR4_2_0e92e92lnxz236o.R.inc(18560);assertTrue(docA.hasSameValue(docB));
        __CLR4_2_0e92e92lnxz236o.R.inc(18561);assertFalse(docA.hasSameValue(docC));
    }finally{__CLR4_2_0e92e92lnxz236o.R.flushNeeded();}}
    
    @Test
    public void testMetaCharsetUpdateUtf8() {__CLR4_2_0e92e92lnxz236o.R.globalSliceStart(getClass().getName(),18562);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0hgarp2ebm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e92e92lnxz236o.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e92e92lnxz236o.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testMetaCharsetUpdateUtf8",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18562,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0hgarp2ebm(){try{__CLR4_2_0e92e92lnxz236o.R.inc(18562);
        __CLR4_2_0e92e92lnxz236o.R.inc(18563);final Document doc = createHtmlDocument("changeThis");
        __CLR4_2_0e92e92lnxz236o.R.inc(18564);doc.updateMetaCharsetElement(true);
        __CLR4_2_0e92e92lnxz236o.R.inc(18565);doc.charset(Charset.forName(charsetUtf8));
        
        __CLR4_2_0e92e92lnxz236o.R.inc(18566);final String htmlCharsetUTF8 = "<html>\n" +
                                        " <head>\n" +
                                        "  <meta charset=\"" + charsetUtf8 + "\">\n" +
                                        " </head>\n" +
                                        " <body></body>\n" +
                                        "</html>";
        __CLR4_2_0e92e92lnxz236o.R.inc(18567);assertEquals(htmlCharsetUTF8, doc.toString());
        
        __CLR4_2_0e92e92lnxz236o.R.inc(18568);Element selectedElement = doc.select("meta[charset]").first();
        __CLR4_2_0e92e92lnxz236o.R.inc(18569);assertEquals(charsetUtf8, doc.charset().name());
        __CLR4_2_0e92e92lnxz236o.R.inc(18570);assertEquals(charsetUtf8, selectedElement.attr("charset"));
        __CLR4_2_0e92e92lnxz236o.R.inc(18571);assertEquals(doc.charset(), doc.outputSettings().charset());
    }finally{__CLR4_2_0e92e92lnxz236o.R.flushNeeded();}}
    
    @Test
    public void testMetaCharsetUpdateIso8859() {__CLR4_2_0e92e92lnxz236o.R.globalSliceStart(getClass().getName(),18572);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0tzdfjmebw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e92e92lnxz236o.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e92e92lnxz236o.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testMetaCharsetUpdateIso8859",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18572,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0tzdfjmebw(){try{__CLR4_2_0e92e92lnxz236o.R.inc(18572);
        __CLR4_2_0e92e92lnxz236o.R.inc(18573);final Document doc = createHtmlDocument("changeThis");
        __CLR4_2_0e92e92lnxz236o.R.inc(18574);doc.updateMetaCharsetElement(true);
        __CLR4_2_0e92e92lnxz236o.R.inc(18575);doc.charset(Charset.forName(charsetIso8859));
        
        __CLR4_2_0e92e92lnxz236o.R.inc(18576);final String htmlCharsetISO = "<html>\n" +
                                        " <head>\n" +
                                        "  <meta charset=\"" + charsetIso8859 + "\">\n" +
                                        " </head>\n" +
                                        " <body></body>\n" +
                                        "</html>";
        __CLR4_2_0e92e92lnxz236o.R.inc(18577);assertEquals(htmlCharsetISO, doc.toString());
        
        __CLR4_2_0e92e92lnxz236o.R.inc(18578);Element selectedElement = doc.select("meta[charset]").first();
        __CLR4_2_0e92e92lnxz236o.R.inc(18579);assertEquals(charsetIso8859, doc.charset().name());
        __CLR4_2_0e92e92lnxz236o.R.inc(18580);assertEquals(charsetIso8859, selectedElement.attr("charset"));
        __CLR4_2_0e92e92lnxz236o.R.inc(18581);assertEquals(doc.charset(), doc.outputSettings().charset());
    }finally{__CLR4_2_0e92e92lnxz236o.R.flushNeeded();}}
    
    @Test
    public void testMetaCharsetUpdateNoCharset() {__CLR4_2_0e92e92lnxz236o.R.globalSliceStart(getClass().getName(),18582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_09489poec6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e92e92lnxz236o.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e92e92lnxz236o.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testMetaCharsetUpdateNoCharset",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18582,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_09489poec6(){try{__CLR4_2_0e92e92lnxz236o.R.inc(18582);
        __CLR4_2_0e92e92lnxz236o.R.inc(18583);final Document docNoCharset = Document.createShell("");
        __CLR4_2_0e92e92lnxz236o.R.inc(18584);docNoCharset.updateMetaCharsetElement(true);
        __CLR4_2_0e92e92lnxz236o.R.inc(18585);docNoCharset.charset(Charset.forName(charsetUtf8));
        
        __CLR4_2_0e92e92lnxz236o.R.inc(18586);assertEquals(charsetUtf8, docNoCharset.select("meta[charset]").first().attr("charset"));
        
        __CLR4_2_0e92e92lnxz236o.R.inc(18587);final String htmlCharsetUTF8 = "<html>\n" +
                                        " <head>\n" +
                                        "  <meta charset=\"" + charsetUtf8 + "\">\n" +
                                        " </head>\n" +
                                        " <body></body>\n" +
                                        "</html>";
        __CLR4_2_0e92e92lnxz236o.R.inc(18588);assertEquals(htmlCharsetUTF8, docNoCharset.toString()); 
    }finally{__CLR4_2_0e92e92lnxz236o.R.flushNeeded();}}
    
    @Test
    public void testMetaCharsetUpdateDisabled() {__CLR4_2_0e92e92lnxz236o.R.globalSliceStart(getClass().getName(),18589);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0t2vqldecd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e92e92lnxz236o.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e92e92lnxz236o.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testMetaCharsetUpdateDisabled",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18589,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0t2vqldecd(){try{__CLR4_2_0e92e92lnxz236o.R.inc(18589);
        __CLR4_2_0e92e92lnxz236o.R.inc(18590);final Document docDisabled = Document.createShell("");
        
        __CLR4_2_0e92e92lnxz236o.R.inc(18591);final String htmlNoCharset = "<html>\n" +
                                        " <head></head>\n" +
                                        " <body></body>\n" +
                                        "</html>";
        __CLR4_2_0e92e92lnxz236o.R.inc(18592);assertEquals(htmlNoCharset, docDisabled.toString());
        __CLR4_2_0e92e92lnxz236o.R.inc(18593);assertNull(docDisabled.select("meta[charset]").first());
    }finally{__CLR4_2_0e92e92lnxz236o.R.flushNeeded();}}
    
    @Test
    public void testMetaCharsetUpdateDisabledNoChanges() {__CLR4_2_0e92e92lnxz236o.R.globalSliceStart(getClass().getName(),18594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_04q2b4feci();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e92e92lnxz236o.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e92e92lnxz236o.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testMetaCharsetUpdateDisabledNoChanges",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18594,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_04q2b4feci(){try{__CLR4_2_0e92e92lnxz236o.R.inc(18594);
        __CLR4_2_0e92e92lnxz236o.R.inc(18595);final Document doc = createHtmlDocument("dontTouch");
        
        __CLR4_2_0e92e92lnxz236o.R.inc(18596);final String htmlCharset = "<html>\n" +
                                    " <head>\n" +
                                    "  <meta charset=\"dontTouch\">\n" +
                                    "  <meta name=\"charset\" content=\"dontTouch\">\n" +
                                    " </head>\n" +
                                    " <body></body>\n" +
                                    "</html>";
        __CLR4_2_0e92e92lnxz236o.R.inc(18597);assertEquals(htmlCharset, doc.toString());
        
        __CLR4_2_0e92e92lnxz236o.R.inc(18598);Element selectedElement = doc.select("meta[charset]").first();
        __CLR4_2_0e92e92lnxz236o.R.inc(18599);assertNotNull(selectedElement);
        __CLR4_2_0e92e92lnxz236o.R.inc(18600);assertEquals("dontTouch", selectedElement.attr("charset"));
        
        __CLR4_2_0e92e92lnxz236o.R.inc(18601);selectedElement = doc.select("meta[name=charset]").first();
        __CLR4_2_0e92e92lnxz236o.R.inc(18602);assertNotNull(selectedElement);
        __CLR4_2_0e92e92lnxz236o.R.inc(18603);assertEquals("dontTouch", selectedElement.attr("content"));
    }finally{__CLR4_2_0e92e92lnxz236o.R.flushNeeded();}}
    
    @Test
    public void testMetaCharsetUpdateEnabledAfterCharsetChange() {__CLR4_2_0e92e92lnxz236o.R.globalSliceStart(getClass().getName(),18604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0dwkoeiecs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e92e92lnxz236o.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e92e92lnxz236o.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testMetaCharsetUpdateEnabledAfterCharsetChange",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18604,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0dwkoeiecs(){try{__CLR4_2_0e92e92lnxz236o.R.inc(18604);
        __CLR4_2_0e92e92lnxz236o.R.inc(18605);final Document doc = createHtmlDocument("dontTouch");
        __CLR4_2_0e92e92lnxz236o.R.inc(18606);doc.charset(Charset.forName(charsetUtf8));
        
        __CLR4_2_0e92e92lnxz236o.R.inc(18607);Element selectedElement = doc.select("meta[charset]").first();
        __CLR4_2_0e92e92lnxz236o.R.inc(18608);assertEquals(charsetUtf8, selectedElement.attr("charset"));
        __CLR4_2_0e92e92lnxz236o.R.inc(18609);assertTrue(doc.select("meta[name=charset]").isEmpty());
    }finally{__CLR4_2_0e92e92lnxz236o.R.flushNeeded();}}
            
    @Test
    public void testMetaCharsetUpdateCleanup() {__CLR4_2_0e92e92lnxz236o.R.globalSliceStart(getClass().getName(),18610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0wnzgy5ecy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e92e92lnxz236o.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e92e92lnxz236o.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testMetaCharsetUpdateCleanup",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18610,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0wnzgy5ecy(){try{__CLR4_2_0e92e92lnxz236o.R.inc(18610);
        __CLR4_2_0e92e92lnxz236o.R.inc(18611);final Document doc = createHtmlDocument("dontTouch");
        __CLR4_2_0e92e92lnxz236o.R.inc(18612);doc.updateMetaCharsetElement(true);
        __CLR4_2_0e92e92lnxz236o.R.inc(18613);doc.charset(Charset.forName(charsetUtf8));
        
        __CLR4_2_0e92e92lnxz236o.R.inc(18614);final String htmlCharsetUTF8 = "<html>\n" +
                                        " <head>\n" +
                                        "  <meta charset=\"" + charsetUtf8 + "\">\n" +
                                        " </head>\n" +
                                        " <body></body>\n" +
                                        "</html>";
        
        __CLR4_2_0e92e92lnxz236o.R.inc(18615);assertEquals(htmlCharsetUTF8, doc.toString());
    }finally{__CLR4_2_0e92e92lnxz236o.R.flushNeeded();}}
    
    @Test
    public void testMetaCharsetUpdateXmlUtf8() {__CLR4_2_0e92e92lnxz236o.R.globalSliceStart(getClass().getName(),18616);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0t1xshbed4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e92e92lnxz236o.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e92e92lnxz236o.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testMetaCharsetUpdateXmlUtf8",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18616,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0t1xshbed4(){try{__CLR4_2_0e92e92lnxz236o.R.inc(18616);
        __CLR4_2_0e92e92lnxz236o.R.inc(18617);final Document doc = createXmlDocument("1.0", "changeThis", true);
        __CLR4_2_0e92e92lnxz236o.R.inc(18618);doc.updateMetaCharsetElement(true);
        __CLR4_2_0e92e92lnxz236o.R.inc(18619);doc.charset(Charset.forName(charsetUtf8));
        
        __CLR4_2_0e92e92lnxz236o.R.inc(18620);final String xmlCharsetUTF8 = "<?xml version=\"1.0\" encoding=\"" + charsetUtf8 + "\"?>\n" +
                                        "<root>\n" +
                                        " node\n" +
                                        "</root>";
        __CLR4_2_0e92e92lnxz236o.R.inc(18621);assertEquals(xmlCharsetUTF8, doc.toString());

        __CLR4_2_0e92e92lnxz236o.R.inc(18622);XmlDeclaration selectedNode = (XmlDeclaration) doc.childNode(0);
        __CLR4_2_0e92e92lnxz236o.R.inc(18623);assertEquals(charsetUtf8, doc.charset().name());
        __CLR4_2_0e92e92lnxz236o.R.inc(18624);assertEquals(charsetUtf8, selectedNode.attr("encoding"));
        __CLR4_2_0e92e92lnxz236o.R.inc(18625);assertEquals(doc.charset(), doc.outputSettings().charset());
    }finally{__CLR4_2_0e92e92lnxz236o.R.flushNeeded();}}
    
    @Test
    public void testMetaCharsetUpdateXmlIso8859() {__CLR4_2_0e92e92lnxz236o.R.globalSliceStart(getClass().getName(),18626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_09javxzede();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e92e92lnxz236o.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e92e92lnxz236o.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testMetaCharsetUpdateXmlIso8859",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18626,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_09javxzede(){try{__CLR4_2_0e92e92lnxz236o.R.inc(18626);
        __CLR4_2_0e92e92lnxz236o.R.inc(18627);final Document doc = createXmlDocument("1.0", "changeThis", true);
        __CLR4_2_0e92e92lnxz236o.R.inc(18628);doc.updateMetaCharsetElement(true);
        __CLR4_2_0e92e92lnxz236o.R.inc(18629);doc.charset(Charset.forName(charsetIso8859));
        
        __CLR4_2_0e92e92lnxz236o.R.inc(18630);final String xmlCharsetISO = "<?xml version=\"1.0\" encoding=\"" + charsetIso8859 + "\"?>\n" +
                                        "<root>\n" +
                                        " node\n" +
                                        "</root>";
        __CLR4_2_0e92e92lnxz236o.R.inc(18631);assertEquals(xmlCharsetISO, doc.toString());
        
        __CLR4_2_0e92e92lnxz236o.R.inc(18632);XmlDeclaration selectedNode = (XmlDeclaration) doc.childNode(0);
        __CLR4_2_0e92e92lnxz236o.R.inc(18633);assertEquals(charsetIso8859, doc.charset().name());
        __CLR4_2_0e92e92lnxz236o.R.inc(18634);assertEquals(charsetIso8859, selectedNode.attr("encoding"));
        __CLR4_2_0e92e92lnxz236o.R.inc(18635);assertEquals(doc.charset(), doc.outputSettings().charset());
    }finally{__CLR4_2_0e92e92lnxz236o.R.flushNeeded();}}
    
    @Test
    public void testMetaCharsetUpdateXmlNoCharset() {__CLR4_2_0e92e92lnxz236o.R.globalSliceStart(getClass().getName(),18636);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0hg1ot5edo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e92e92lnxz236o.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e92e92lnxz236o.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testMetaCharsetUpdateXmlNoCharset",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18636,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0hg1ot5edo(){try{__CLR4_2_0e92e92lnxz236o.R.inc(18636);
        __CLR4_2_0e92e92lnxz236o.R.inc(18637);final Document doc = createXmlDocument("1.0", "none", false);
        __CLR4_2_0e92e92lnxz236o.R.inc(18638);doc.updateMetaCharsetElement(true);
        __CLR4_2_0e92e92lnxz236o.R.inc(18639);doc.charset(Charset.forName(charsetUtf8));
        
        __CLR4_2_0e92e92lnxz236o.R.inc(18640);final String xmlCharsetUTF8 = "<?xml version=\"1.0\" encoding=\"" + charsetUtf8 + "\"?>\n" +
                                        "<root>\n" +
                                        " node\n" +
                                        "</root>";
        __CLR4_2_0e92e92lnxz236o.R.inc(18641);assertEquals(xmlCharsetUTF8, doc.toString());
        
        __CLR4_2_0e92e92lnxz236o.R.inc(18642);XmlDeclaration selectedNode = (XmlDeclaration) doc.childNode(0);
        __CLR4_2_0e92e92lnxz236o.R.inc(18643);assertEquals(charsetUtf8, selectedNode.attr("encoding"));
    }finally{__CLR4_2_0e92e92lnxz236o.R.flushNeeded();}}
    
    @Test
    public void testMetaCharsetUpdateXmlDisabled() {__CLR4_2_0e92e92lnxz236o.R.globalSliceStart(getClass().getName(),18644);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0yipcqkedw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e92e92lnxz236o.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e92e92lnxz236o.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testMetaCharsetUpdateXmlDisabled",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18644,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0yipcqkedw(){try{__CLR4_2_0e92e92lnxz236o.R.inc(18644);
        __CLR4_2_0e92e92lnxz236o.R.inc(18645);final Document doc = createXmlDocument("none", "none", false);
        
        __CLR4_2_0e92e92lnxz236o.R.inc(18646);final String xmlNoCharset = "<root>\n" +
                                    " node\n" +
                                    "</root>";
        __CLR4_2_0e92e92lnxz236o.R.inc(18647);assertEquals(xmlNoCharset, doc.toString());
    }finally{__CLR4_2_0e92e92lnxz236o.R.flushNeeded();}}

    @Test
    public void testMetaCharsetUpdateXmlDisabledNoChanges() {__CLR4_2_0e92e92lnxz236o.R.globalSliceStart(getClass().getName(),18648);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_02sqwusee0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e92e92lnxz236o.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e92e92lnxz236o.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testMetaCharsetUpdateXmlDisabledNoChanges",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18648,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_02sqwusee0(){try{__CLR4_2_0e92e92lnxz236o.R.inc(18648);
        __CLR4_2_0e92e92lnxz236o.R.inc(18649);final Document doc = createXmlDocument("dontTouch", "dontTouch", true);
        
        __CLR4_2_0e92e92lnxz236o.R.inc(18650);final String xmlCharset = "<?xml version=\"dontTouch\" encoding=\"dontTouch\"?>\n" +
                                    "<root>\n" +
                                    " node\n" +
                                    "</root>";
        __CLR4_2_0e92e92lnxz236o.R.inc(18651);assertEquals(xmlCharset, doc.toString());
        
        __CLR4_2_0e92e92lnxz236o.R.inc(18652);XmlDeclaration selectedNode = (XmlDeclaration) doc.childNode(0);
        __CLR4_2_0e92e92lnxz236o.R.inc(18653);assertEquals("dontTouch", selectedNode.attr("encoding"));
        __CLR4_2_0e92e92lnxz236o.R.inc(18654);assertEquals("dontTouch", selectedNode.attr("version"));
    }finally{__CLR4_2_0e92e92lnxz236o.R.flushNeeded();}}
    
    @Test
    public void testMetaCharsetUpdatedDisabledPerDefault() {__CLR4_2_0e92e92lnxz236o.R.globalSliceStart(getClass().getName(),18655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0sxk9yree7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e92e92lnxz236o.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e92e92lnxz236o.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testMetaCharsetUpdatedDisabledPerDefault",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18655,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0sxk9yree7(){try{__CLR4_2_0e92e92lnxz236o.R.inc(18655);
        __CLR4_2_0e92e92lnxz236o.R.inc(18656);final Document doc = createHtmlDocument("none");
        __CLR4_2_0e92e92lnxz236o.R.inc(18657);assertFalse(doc.updateMetaCharsetElement());
    }finally{__CLR4_2_0e92e92lnxz236o.R.flushNeeded();}}
    
    private Document createHtmlDocument(String charset) {try{__CLR4_2_0e92e92lnxz236o.R.inc(18658);
        __CLR4_2_0e92e92lnxz236o.R.inc(18659);final Document doc = Document.createShell("");
        __CLR4_2_0e92e92lnxz236o.R.inc(18660);doc.head().appendElement("meta").attr("charset", charset);
        __CLR4_2_0e92e92lnxz236o.R.inc(18661);doc.head().appendElement("meta").attr("name", "charset").attr("content", charset);
        
        __CLR4_2_0e92e92lnxz236o.R.inc(18662);return doc;
    }finally{__CLR4_2_0e92e92lnxz236o.R.flushNeeded();}}
    
    private Document createXmlDocument(String version, String charset, boolean addDecl) {try{__CLR4_2_0e92e92lnxz236o.R.inc(18663);
        __CLR4_2_0e92e92lnxz236o.R.inc(18664);final Document doc = new Document("");
        __CLR4_2_0e92e92lnxz236o.R.inc(18665);doc.appendElement("root").text("node");
        __CLR4_2_0e92e92lnxz236o.R.inc(18666);doc.outputSettings().syntax(Syntax.xml);
        
        __CLR4_2_0e92e92lnxz236o.R.inc(18667);if((((addDecl)&&(__CLR4_2_0e92e92lnxz236o.R.iget(18668)!=0|true))||(__CLR4_2_0e92e92lnxz236o.R.iget(18669)==0&false))) {{
            __CLR4_2_0e92e92lnxz236o.R.inc(18670);XmlDeclaration decl = new XmlDeclaration("xml", false);
            __CLR4_2_0e92e92lnxz236o.R.inc(18671);decl.attr("version", version);
            __CLR4_2_0e92e92lnxz236o.R.inc(18672);decl.attr("encoding", charset);
            __CLR4_2_0e92e92lnxz236o.R.inc(18673);doc.prependChild(decl);
        }
        
        }__CLR4_2_0e92e92lnxz236o.R.inc(18674);return doc;
    }finally{__CLR4_2_0e92e92lnxz236o.R.flushNeeded();}}

    @Test
    public void testShiftJisRoundtrip() throws Exception {__CLR4_2_0e92e92lnxz236o.R.globalSliceStart(getClass().getName(),18675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_072dd2ieer();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e92e92lnxz236o.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e92e92lnxz236o.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testShiftJisRoundtrip",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18675,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_072dd2ieer() throws Exception{try{__CLR4_2_0e92e92lnxz236o.R.inc(18675);
        __CLR4_2_0e92e92lnxz236o.R.inc(18676);String input =
                "<html>"
                        +   "<head>"
                        +     "<meta http-equiv=\"content-type\" content=\"text/html; charset=Shift_JIS\" />"
                        +   "</head>"
                        +   "<body>"
                        +     "before&nbsp;after"
                        +   "</body>"
                        + "</html>";
        __CLR4_2_0e92e92lnxz236o.R.inc(18677);InputStream is = new ByteArrayInputStream(input.getBytes(Charset.forName("ASCII")));

        __CLR4_2_0e92e92lnxz236o.R.inc(18678);Document doc = Jsoup.parse(is, null, "http://example.com");
        __CLR4_2_0e92e92lnxz236o.R.inc(18679);doc.outputSettings().escapeMode(Entities.EscapeMode.xhtml);

        __CLR4_2_0e92e92lnxz236o.R.inc(18680);String output = new String(doc.html().getBytes(doc.outputSettings().charset()), doc.outputSettings().charset());

        __CLR4_2_0e92e92lnxz236o.R.inc(18681);assertFalse("Should not have contained a '?'.", output.contains("?"));
        __CLR4_2_0e92e92lnxz236o.R.inc(18682);assertTrue("Should have contained a '&#xa0;' or a '&nbsp;'.",
                output.contains("&#xa0;") || output.contains("&nbsp;"));
    }finally{__CLR4_2_0e92e92lnxz236o.R.flushNeeded();}}

    @Test public void parseAndHtmlOnDifferentThreads() throws InterruptedException {__CLR4_2_0e92e92lnxz236o.R.globalSliceStart(getClass().getName(),18683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0i4fyf9eez();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e92e92lnxz236o.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e92e92lnxz236o.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.parseAndHtmlOnDifferentThreads",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18683,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0i4fyf9eez() throws InterruptedException{try{__CLR4_2_0e92e92lnxz236o.R.inc(18683);
        __CLR4_2_0e92e92lnxz236o.R.inc(18684);String html = "<p>Alrighty then it's not \ud83d\udca9. <span>Next</span></p>"; // \ud83d\udca9
        __CLR4_2_0e92e92lnxz236o.R.inc(18685);String asci = "<p>Alrighty then it's not &#x1f4a9;. <span>Next</span></p>";

        __CLR4_2_0e92e92lnxz236o.R.inc(18686);final Document doc = Jsoup.parse(html);
        __CLR4_2_0e92e92lnxz236o.R.inc(18687);final String[] out = new String[1];
        __CLR4_2_0e92e92lnxz236o.R.inc(18688);final Elements p = doc.select("p");
        __CLR4_2_0e92e92lnxz236o.R.inc(18689);assertEquals(html, p.outerHtml());

        __CLR4_2_0e92e92lnxz236o.R.inc(18690);Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {try{__CLR4_2_0e92e92lnxz236o.R.inc(18691);
                __CLR4_2_0e92e92lnxz236o.R.inc(18692);out[0] = p.outerHtml();
                __CLR4_2_0e92e92lnxz236o.R.inc(18693);doc.outputSettings().charset(StandardCharsets.US_ASCII);
            }finally{__CLR4_2_0e92e92lnxz236o.R.flushNeeded();}}
        });
        __CLR4_2_0e92e92lnxz236o.R.inc(18694);thread.start();
        __CLR4_2_0e92e92lnxz236o.R.inc(18695);thread.join();

        __CLR4_2_0e92e92lnxz236o.R.inc(18696);assertEquals(html, out[0]);
        __CLR4_2_0e92e92lnxz236o.R.inc(18697);assertEquals(StandardCharsets.US_ASCII, doc.outputSettings().charset());
        __CLR4_2_0e92e92lnxz236o.R.inc(18698);assertEquals(asci, p.outerHtml());
    }finally{__CLR4_2_0e92e92lnxz236o.R.flushNeeded();}}
}
