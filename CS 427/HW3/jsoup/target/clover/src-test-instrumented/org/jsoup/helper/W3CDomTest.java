/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.jsoup.integration.ParseTest;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class W3CDomTest {static class __CLR4_2_08cv8cvlnxz22ws{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767707166L,8589935092L,10922,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void simpleConversion() {__CLR4_2_08cv8cvlnxz22ws.R.globalSliceStart(getClass().getName(),10831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0hnz4up8cv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08cv8cvlnxz22ws.R.rethrow($CLV_t2$);}finally{__CLR4_2_08cv8cvlnxz22ws.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.W3CDomTest.simpleConversion",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10831,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0hnz4up8cv(){try{__CLR4_2_08cv8cvlnxz22ws.R.inc(10831);
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10832);String html = "<html><head><title>W3c</title></head><body><p class='one' id=12>Text</p><!-- comment --><invalid>What<script>alert('!')";
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10833);org.jsoup.nodes.Document doc = Jsoup.parse(html);

        __CLR4_2_08cv8cvlnxz22ws.R.inc(10834);W3CDom w3c = new W3CDom();
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10835);Document wDoc = w3c.fromJsoup(doc);
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10836);String out = TextUtil.stripNewlines(w3c.asString(wDoc));
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10837);String expected = TextUtil.stripNewlines(
                "<html><head><META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"><title>W3c</title>" +
                "</head><body><p class=\"one\" id=\"12\">Text</p><!-- comment --><invalid>What<script>alert('!')</script>" +
                "</invalid></body></html>"
        );
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10838);assertEquals(expected, out);
    }finally{__CLR4_2_08cv8cvlnxz22ws.R.flushNeeded();}}

    @Test
    public void convertsGoogle() throws IOException {__CLR4_2_08cv8cvlnxz22ws.R.globalSliceStart(getClass().getName(),10839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_099saqo8d3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08cv8cvlnxz22ws.R.rethrow($CLV_t2$);}finally{__CLR4_2_08cv8cvlnxz22ws.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.W3CDomTest.convertsGoogle",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10839,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_099saqo8d3() throws IOException{try{__CLR4_2_08cv8cvlnxz22ws.R.inc(10839);
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10840);File in = ParseTest.getFile("/htmltests/google-ipod.html");
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10841);org.jsoup.nodes.Document doc = Jsoup.parse(in, "UTF8");

        __CLR4_2_08cv8cvlnxz22ws.R.inc(10842);W3CDom w3c = new W3CDom();
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10843);Document wDoc = w3c.fromJsoup(doc);
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10844);Node htmlEl = wDoc.getChildNodes().item(0);
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10845);assertEquals(null, htmlEl.getNamespaceURI());
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10846);assertEquals("html", htmlEl.getLocalName());
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10847);assertEquals("html", htmlEl.getNodeName());

        __CLR4_2_08cv8cvlnxz22ws.R.inc(10848);String out = w3c.asString(wDoc);
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10849);assertTrue(out.contains("ipod"));
    }finally{__CLR4_2_08cv8cvlnxz22ws.R.flushNeeded();}}
    
    
    @Test
    public void convertsGoogleLocation() throws IOException {__CLR4_2_08cv8cvlnxz22ws.R.globalSliceStart(getClass().getName(),10850);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ekp63v8de();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08cv8cvlnxz22ws.R.rethrow($CLV_t2$);}finally{__CLR4_2_08cv8cvlnxz22ws.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.W3CDomTest.convertsGoogleLocation",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10850,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ekp63v8de() throws IOException{try{__CLR4_2_08cv8cvlnxz22ws.R.inc(10850);
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10851);File in = ParseTest.getFile("/htmltests/google-ipod.html");
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10852);org.jsoup.nodes.Document doc = Jsoup.parse(in, "UTF8");

        __CLR4_2_08cv8cvlnxz22ws.R.inc(10853);W3CDom w3c = new W3CDom();
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10854);Document wDoc = w3c.fromJsoup(doc);

        __CLR4_2_08cv8cvlnxz22ws.R.inc(10855);String out = w3c.asString(wDoc);
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10856);assertEquals(doc.location(), wDoc.getDocumentURI() );
    }finally{__CLR4_2_08cv8cvlnxz22ws.R.flushNeeded();}}
    
    

    @Test
    public void namespacePreservation() throws IOException {__CLR4_2_08cv8cvlnxz22ws.R.globalSliceStart(getClass().getName(),10857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0qwdhdu8dl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08cv8cvlnxz22ws.R.rethrow($CLV_t2$);}finally{__CLR4_2_08cv8cvlnxz22ws.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.W3CDomTest.namespacePreservation",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10857,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0qwdhdu8dl() throws IOException{try{__CLR4_2_08cv8cvlnxz22ws.R.inc(10857);
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10858);File in = ParseTest.getFile("/htmltests/namespaces.xhtml");
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10859);org.jsoup.nodes.Document jsoupDoc;
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10860);jsoupDoc = Jsoup.parse(in, "UTF-8");

        __CLR4_2_08cv8cvlnxz22ws.R.inc(10861);Document doc;
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10862);org.jsoup.helper.W3CDom jDom = new org.jsoup.helper.W3CDom();
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10863);doc = jDom.fromJsoup(jsoupDoc);

        __CLR4_2_08cv8cvlnxz22ws.R.inc(10864);Node htmlEl = doc.getChildNodes().item(0);
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10865);assertEquals("http://www.w3.org/1999/xhtml", htmlEl.getNamespaceURI());
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10866);assertEquals("html", htmlEl.getLocalName());
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10867);assertEquals("html", htmlEl.getNodeName());

        // inherits default namespace
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10868);Node head = htmlEl.getFirstChild();
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10869);assertEquals("http://www.w3.org/1999/xhtml", head.getNamespaceURI());
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10870);assertEquals("head", head.getLocalName());
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10871);assertEquals("head", head.getNodeName());

        __CLR4_2_08cv8cvlnxz22ws.R.inc(10872);Node epubTitle = htmlEl.getChildNodes().item(2).getChildNodes().item(3);
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10873);assertEquals("Check", epubTitle.getTextContent());
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10874);assertEquals("http://www.idpf.org/2007/ops", epubTitle.getNamespaceURI());
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10875);assertEquals("title", epubTitle.getLocalName());
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10876);assertEquals("epub:title", epubTitle.getNodeName());

        __CLR4_2_08cv8cvlnxz22ws.R.inc(10877);Node xSection = epubTitle.getNextSibling().getNextSibling();
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10878);assertEquals("urn:test", xSection.getNamespaceURI());
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10879);assertEquals("section", xSection.getLocalName());
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10880);assertEquals("x:section", xSection.getNodeName());

        // https://github.com/jhy/jsoup/issues/977
        // does not keep last set namespace
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10881);Node svg = xSection.getNextSibling().getNextSibling();
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10882);assertEquals("http://www.w3.org/2000/svg", svg.getNamespaceURI());
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10883);assertEquals("svg", svg.getLocalName());
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10884);assertEquals("svg", svg.getNodeName());

        __CLR4_2_08cv8cvlnxz22ws.R.inc(10885);Node path = svg.getChildNodes().item(1);
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10886);assertEquals("http://www.w3.org/2000/svg", path.getNamespaceURI());
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10887);assertEquals("path", path.getLocalName());
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10888);assertEquals("path", path.getNodeName());

        __CLR4_2_08cv8cvlnxz22ws.R.inc(10889);Node clip = path.getChildNodes().item(1);
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10890);assertEquals("http://example.com/clip", clip.getNamespaceURI());
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10891);assertEquals("clip", clip.getLocalName());
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10892);assertEquals("clip", clip.getNodeName());
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10893);assertEquals("456", clip.getTextContent());

        __CLR4_2_08cv8cvlnxz22ws.R.inc(10894);Node picture = svg.getNextSibling().getNextSibling();
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10895);assertEquals("http://www.w3.org/1999/xhtml", picture.getNamespaceURI());
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10896);assertEquals("picture", picture.getLocalName());
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10897);assertEquals("picture", picture.getNodeName());

        __CLR4_2_08cv8cvlnxz22ws.R.inc(10898);Node img = picture.getFirstChild();
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10899);assertEquals("http://www.w3.org/1999/xhtml", img.getNamespaceURI());
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10900);assertEquals("img", img.getLocalName());
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10901);assertEquals("img", img.getNodeName());

    }finally{__CLR4_2_08cv8cvlnxz22ws.R.flushNeeded();}}

    @Test
    public void handlesInvalidAttributeNames() {__CLR4_2_08cv8cvlnxz22ws.R.globalSliceStart(getClass().getName(),10902);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_02zz1cv8eu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08cv8cvlnxz22ws.R.rethrow($CLV_t2$);}finally{__CLR4_2_08cv8cvlnxz22ws.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.W3CDomTest.handlesInvalidAttributeNames",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10902,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_02zz1cv8eu(){try{__CLR4_2_08cv8cvlnxz22ws.R.inc(10902);
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10903);String html = "<html><head></head><body style=\"color: red\" \" name\"></body></html>";
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10904);org.jsoup.nodes.Document jsoupDoc;
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10905);jsoupDoc = Jsoup.parse(html);
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10906);Element body = jsoupDoc.select("body").first();
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10907);assertTrue(body.hasAttr("\"")); // actually an attribute with key '"'. Correct per HTML5 spec, but w3c xml dom doesn't dig it
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10908);assertTrue(body.hasAttr("name\""));

        __CLR4_2_08cv8cvlnxz22ws.R.inc(10909);Document w3Doc = new W3CDom().fromJsoup(jsoupDoc);
    }finally{__CLR4_2_08cv8cvlnxz22ws.R.flushNeeded();}}

    @Test public void treatsUndeclaredNamespaceAsLocalName() {__CLR4_2_08cv8cvlnxz22ws.R.globalSliceStart(getClass().getName(),10910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0w8i75w8f2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08cv8cvlnxz22ws.R.rethrow($CLV_t2$);}finally{__CLR4_2_08cv8cvlnxz22ws.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.W3CDomTest.treatsUndeclaredNamespaceAsLocalName",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10910,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0w8i75w8f2(){try{__CLR4_2_08cv8cvlnxz22ws.R.inc(10910);
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10911);String html = "<fb:like>One</fb:like>";
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10912);org.jsoup.nodes.Document doc = Jsoup.parse(html);

        __CLR4_2_08cv8cvlnxz22ws.R.inc(10913);Document w3Doc = new W3CDom().fromJsoup(doc);
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10914);Node htmlEl = w3Doc.getFirstChild();

        __CLR4_2_08cv8cvlnxz22ws.R.inc(10915);assertNull(htmlEl.getNamespaceURI());
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10916);assertEquals("html", htmlEl.getLocalName());
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10917);assertEquals("html", htmlEl.getNodeName());

        __CLR4_2_08cv8cvlnxz22ws.R.inc(10918);Node fb = htmlEl.getFirstChild().getNextSibling().getFirstChild();
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10919);assertNull(fb.getNamespaceURI());
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10920);assertEquals("like", fb.getLocalName());
        __CLR4_2_08cv8cvlnxz22ws.R.inc(10921);assertEquals("fb:like", fb.getNodeName());

    }finally{__CLR4_2_08cv8cvlnxz22ws.R.flushNeeded();}}
}

