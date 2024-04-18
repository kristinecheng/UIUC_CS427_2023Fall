/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.jsoup.parser.Tag;
import org.jsoup.select.NodeVisitor;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
/**
 Tests Nodes

 @author Jonathan Hedley, jonathan@hedley.net */
public class NodeTest {static class __CLR4_2_0fcufculnxz237w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767707166L,8589935092L,20110,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test public void handlesBaseUri() {__CLR4_2_0fcufculnxz237w.R.globalSliceStart(getClass().getName(),19902);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0dlj4x5fcu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fcufculnxz237w.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fcufculnxz237w.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.handlesBaseUri",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19902,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0dlj4x5fcu(){try{__CLR4_2_0fcufculnxz237w.R.inc(19902);
        __CLR4_2_0fcufculnxz237w.R.inc(19903);Tag tag = Tag.valueOf("a");
        __CLR4_2_0fcufculnxz237w.R.inc(19904);Attributes attribs = new Attributes();
        __CLR4_2_0fcufculnxz237w.R.inc(19905);attribs.put("relHref", "/foo");
        __CLR4_2_0fcufculnxz237w.R.inc(19906);attribs.put("absHref", "http://bar/qux");

        __CLR4_2_0fcufculnxz237w.R.inc(19907);Element noBase = new Element(tag, "", attribs);
        __CLR4_2_0fcufculnxz237w.R.inc(19908);assertEquals("", noBase.absUrl("relHref")); // with no base, should NOT fallback to href attrib, whatever it is
        __CLR4_2_0fcufculnxz237w.R.inc(19909);assertEquals("http://bar/qux", noBase.absUrl("absHref")); // no base but valid attrib, return attrib

        __CLR4_2_0fcufculnxz237w.R.inc(19910);Element withBase = new Element(tag, "http://foo/", attribs);
        __CLR4_2_0fcufculnxz237w.R.inc(19911);assertEquals("http://foo/foo", withBase.absUrl("relHref")); // construct abs from base + rel
        __CLR4_2_0fcufculnxz237w.R.inc(19912);assertEquals("http://bar/qux", withBase.absUrl("absHref")); // href is abs, so returns that
        __CLR4_2_0fcufculnxz237w.R.inc(19913);assertEquals("", withBase.absUrl("noval"));

        __CLR4_2_0fcufculnxz237w.R.inc(19914);Element dodgyBase = new Element(tag, "wtf://no-such-protocol/", attribs);
        __CLR4_2_0fcufculnxz237w.R.inc(19915);assertEquals("http://bar/qux", dodgyBase.absUrl("absHref")); // base fails, but href good, so get that
        __CLR4_2_0fcufculnxz237w.R.inc(19916);assertEquals("", dodgyBase.absUrl("relHref")); // base fails, only rel href, so return nothing
    }finally{__CLR4_2_0fcufculnxz237w.R.flushNeeded();}}

    @Test public void setBaseUriIsRecursive() {__CLR4_2_0fcufculnxz237w.R.globalSliceStart(getClass().getName(),19917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_049srlifd9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fcufculnxz237w.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fcufculnxz237w.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.setBaseUriIsRecursive",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19917,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_049srlifd9(){try{__CLR4_2_0fcufculnxz237w.R.inc(19917);
        __CLR4_2_0fcufculnxz237w.R.inc(19918);Document doc = Jsoup.parse("<div><p></p></div>");
        __CLR4_2_0fcufculnxz237w.R.inc(19919);String baseUri = "https://jsoup.org";
        __CLR4_2_0fcufculnxz237w.R.inc(19920);doc.setBaseUri(baseUri);

        __CLR4_2_0fcufculnxz237w.R.inc(19921);assertEquals(baseUri, doc.baseUri());
        __CLR4_2_0fcufculnxz237w.R.inc(19922);assertEquals(baseUri, doc.select("div").first().baseUri());
        __CLR4_2_0fcufculnxz237w.R.inc(19923);assertEquals(baseUri, doc.select("p").first().baseUri());
    }finally{__CLR4_2_0fcufculnxz237w.R.flushNeeded();}}

    @Test public void handlesAbsPrefix() {__CLR4_2_0fcufculnxz237w.R.globalSliceStart(getClass().getName(),19924);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_02ztl4wfdg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fcufculnxz237w.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fcufculnxz237w.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.handlesAbsPrefix",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19924,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_02ztl4wfdg(){try{__CLR4_2_0fcufculnxz237w.R.inc(19924);
        __CLR4_2_0fcufculnxz237w.R.inc(19925);Document doc = Jsoup.parse("<a href=/foo>Hello</a>", "https://jsoup.org/");
        __CLR4_2_0fcufculnxz237w.R.inc(19926);Element a = doc.select("a").first();
        __CLR4_2_0fcufculnxz237w.R.inc(19927);assertEquals("/foo", a.attr("href"));
        __CLR4_2_0fcufculnxz237w.R.inc(19928);assertEquals("https://jsoup.org/foo", a.attr("abs:href"));
        __CLR4_2_0fcufculnxz237w.R.inc(19929);assertTrue(a.hasAttr("abs:href"));
    }finally{__CLR4_2_0fcufculnxz237w.R.flushNeeded();}}

    @Test public void handlesAbsOnImage() {__CLR4_2_0fcufculnxz237w.R.globalSliceStart(getClass().getName(),19930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0fx3ltofdm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fcufculnxz237w.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fcufculnxz237w.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.handlesAbsOnImage",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19930,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0fx3ltofdm(){try{__CLR4_2_0fcufculnxz237w.R.inc(19930);
        __CLR4_2_0fcufculnxz237w.R.inc(19931);Document doc = Jsoup.parse("<p><img src=\"/rez/osi_logo.png\" /></p>", "https://jsoup.org/");
        __CLR4_2_0fcufculnxz237w.R.inc(19932);Element img = doc.select("img").first();
        __CLR4_2_0fcufculnxz237w.R.inc(19933);assertEquals("https://jsoup.org/rez/osi_logo.png", img.attr("abs:src"));
        __CLR4_2_0fcufculnxz237w.R.inc(19934);assertEquals(img.absUrl("src"), img.attr("abs:src"));
    }finally{__CLR4_2_0fcufculnxz237w.R.flushNeeded();}}

    @Test public void handlesAbsPrefixOnHasAttr() {__CLR4_2_0fcufculnxz237w.R.globalSliceStart(getClass().getName(),19935);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0jyshd2fdr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fcufculnxz237w.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fcufculnxz237w.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.handlesAbsPrefixOnHasAttr",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19935,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0jyshd2fdr(){try{__CLR4_2_0fcufculnxz237w.R.inc(19935);
        // 1: no abs url; 2: has abs url
        __CLR4_2_0fcufculnxz237w.R.inc(19936);Document doc = Jsoup.parse("<a id=1 href='/foo'>One</a> <a id=2 href='https://jsoup.org/'>Two</a>");
        __CLR4_2_0fcufculnxz237w.R.inc(19937);Element one = doc.select("#1").first();
        __CLR4_2_0fcufculnxz237w.R.inc(19938);Element two = doc.select("#2").first();

        __CLR4_2_0fcufculnxz237w.R.inc(19939);assertFalse(one.hasAttr("abs:href"));
        __CLR4_2_0fcufculnxz237w.R.inc(19940);assertTrue(one.hasAttr("href"));
        __CLR4_2_0fcufculnxz237w.R.inc(19941);assertEquals("", one.absUrl("href"));

        __CLR4_2_0fcufculnxz237w.R.inc(19942);assertTrue(two.hasAttr("abs:href"));
        __CLR4_2_0fcufculnxz237w.R.inc(19943);assertTrue(two.hasAttr("href"));
        __CLR4_2_0fcufculnxz237w.R.inc(19944);assertEquals("https://jsoup.org/", two.absUrl("href"));
    }finally{__CLR4_2_0fcufculnxz237w.R.flushNeeded();}}

    @Test public void literalAbsPrefix() {__CLR4_2_0fcufculnxz237w.R.globalSliceStart(getClass().getName(),19945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0l9xns4fe1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fcufculnxz237w.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fcufculnxz237w.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.literalAbsPrefix",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19945,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0l9xns4fe1(){try{__CLR4_2_0fcufculnxz237w.R.inc(19945);
        // if there is a literal attribute "abs:xxx", don't try and make absolute.
        __CLR4_2_0fcufculnxz237w.R.inc(19946);Document doc = Jsoup.parse("<a abs:href='odd'>One</a>");
        __CLR4_2_0fcufculnxz237w.R.inc(19947);Element el = doc.select("a").first();
        __CLR4_2_0fcufculnxz237w.R.inc(19948);assertTrue(el.hasAttr("abs:href"));
        __CLR4_2_0fcufculnxz237w.R.inc(19949);assertEquals("odd", el.attr("abs:href"));
    }finally{__CLR4_2_0fcufculnxz237w.R.flushNeeded();}}

    @Test public void handleAbsOnFileUris() {__CLR4_2_0fcufculnxz237w.R.globalSliceStart(getClass().getName(),19950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0pr4fnxfe6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fcufculnxz237w.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fcufculnxz237w.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.handleAbsOnFileUris",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19950,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0pr4fnxfe6(){try{__CLR4_2_0fcufculnxz237w.R.inc(19950);
        __CLR4_2_0fcufculnxz237w.R.inc(19951);Document doc = Jsoup.parse("<a href='password'>One/a><a href='/var/log/messages'>Two</a>", "file:/etc/");
        __CLR4_2_0fcufculnxz237w.R.inc(19952);Element one = doc.select("a").first();
        __CLR4_2_0fcufculnxz237w.R.inc(19953);assertEquals("file:/etc/password", one.absUrl("href"));
        __CLR4_2_0fcufculnxz237w.R.inc(19954);Element two = doc.select("a").get(1);
        __CLR4_2_0fcufculnxz237w.R.inc(19955);assertEquals("file:/var/log/messages", two.absUrl("href"));
    }finally{__CLR4_2_0fcufculnxz237w.R.flushNeeded();}}

    @Test
    public void handleAbsOnLocalhostFileUris() {__CLR4_2_0fcufculnxz237w.R.globalSliceStart(getClass().getName(),19956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_01a5m3wfec();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fcufculnxz237w.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fcufculnxz237w.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.handleAbsOnLocalhostFileUris",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19956,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_01a5m3wfec(){try{__CLR4_2_0fcufculnxz237w.R.inc(19956);
        __CLR4_2_0fcufculnxz237w.R.inc(19957);Document doc = Jsoup.parse("<a href='password'>One/a><a href='/var/log/messages'>Two</a>", "file://localhost/etc/");
        __CLR4_2_0fcufculnxz237w.R.inc(19958);Element one = doc.select("a").first();
        __CLR4_2_0fcufculnxz237w.R.inc(19959);assertEquals("file://localhost/etc/password", one.absUrl("href"));
    }finally{__CLR4_2_0fcufculnxz237w.R.flushNeeded();}}

    @Test
    public void handlesAbsOnProtocolessAbsoluteUris() {__CLR4_2_0fcufculnxz237w.R.globalSliceStart(getClass().getName(),19960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0woknlgfeg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fcufculnxz237w.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fcufculnxz237w.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.handlesAbsOnProtocolessAbsoluteUris",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19960,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0woknlgfeg(){try{__CLR4_2_0fcufculnxz237w.R.inc(19960);
        __CLR4_2_0fcufculnxz237w.R.inc(19961);Document doc1 = Jsoup.parse("<a href='//example.net/foo'>One</a>", "http://example.com/");
        __CLR4_2_0fcufculnxz237w.R.inc(19962);Document doc2 = Jsoup.parse("<a href='//example.net/foo'>One</a>", "https://example.com/");

        __CLR4_2_0fcufculnxz237w.R.inc(19963);Element one = doc1.select("a").first();
        __CLR4_2_0fcufculnxz237w.R.inc(19964);Element two = doc2.select("a").first();

        __CLR4_2_0fcufculnxz237w.R.inc(19965);assertEquals("http://example.net/foo", one.absUrl("href"));
        __CLR4_2_0fcufculnxz237w.R.inc(19966);assertEquals("https://example.net/foo", two.absUrl("href"));

        __CLR4_2_0fcufculnxz237w.R.inc(19967);Document doc3 = Jsoup.parse("<img src=//www.google.com/images/errors/logo_sm.gif alt=Google>", "https://google.com");
        __CLR4_2_0fcufculnxz237w.R.inc(19968);assertEquals("https://www.google.com/images/errors/logo_sm.gif", doc3.select("img").attr("abs:src"));
    }finally{__CLR4_2_0fcufculnxz237w.R.flushNeeded();}}

    /*
    Test for an issue with Java's abs URL handler.
     */
    @Test public void absHandlesRelativeQuery() {__CLR4_2_0fcufculnxz237w.R.globalSliceStart(getClass().getName(),19969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_01i0tyufep();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fcufculnxz237w.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fcufculnxz237w.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.absHandlesRelativeQuery",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19969,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_01i0tyufep(){try{__CLR4_2_0fcufculnxz237w.R.inc(19969);
        __CLR4_2_0fcufculnxz237w.R.inc(19970);Document doc = Jsoup.parse("<a href='?foo'>One</a> <a href='bar.html?foo'>Two</a>", "https://jsoup.org/path/file?bar");

        __CLR4_2_0fcufculnxz237w.R.inc(19971);Element a1 = doc.select("a").first();
        __CLR4_2_0fcufculnxz237w.R.inc(19972);assertEquals("https://jsoup.org/path/file?foo", a1.absUrl("href"));

        __CLR4_2_0fcufculnxz237w.R.inc(19973);Element a2 = doc.select("a").get(1);
        __CLR4_2_0fcufculnxz237w.R.inc(19974);assertEquals("https://jsoup.org/path/bar.html?foo", a2.absUrl("href"));
    }finally{__CLR4_2_0fcufculnxz237w.R.flushNeeded();}}

    @Test public void absHandlesDotFromIndex() {__CLR4_2_0fcufculnxz237w.R.globalSliceStart(getClass().getName(),19975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0lig7flfev();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fcufculnxz237w.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fcufculnxz237w.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.absHandlesDotFromIndex",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19975,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0lig7flfev(){try{__CLR4_2_0fcufculnxz237w.R.inc(19975);
        __CLR4_2_0fcufculnxz237w.R.inc(19976);Document doc = Jsoup.parse("<a href='./one/two.html'>One</a>", "http://example.com");
        __CLR4_2_0fcufculnxz237w.R.inc(19977);Element a1 = doc.select("a").first();
        __CLR4_2_0fcufculnxz237w.R.inc(19978);assertEquals("http://example.com/one/two.html", a1.absUrl("href"));
    }finally{__CLR4_2_0fcufculnxz237w.R.flushNeeded();}}

    @Test public void testRemove() {__CLR4_2_0fcufculnxz237w.R.globalSliceStart(getClass().getName(),19979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ej1cn1fez();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fcufculnxz237w.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fcufculnxz237w.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.testRemove",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19979,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ej1cn1fez(){try{__CLR4_2_0fcufculnxz237w.R.inc(19979);
        __CLR4_2_0fcufculnxz237w.R.inc(19980);Document doc = Jsoup.parse("<p>One <span>two</span> three</p>");
        __CLR4_2_0fcufculnxz237w.R.inc(19981);Element p = doc.select("p").first();
        __CLR4_2_0fcufculnxz237w.R.inc(19982);p.childNode(0).remove();

        __CLR4_2_0fcufculnxz237w.R.inc(19983);assertEquals("two three", p.text());
        __CLR4_2_0fcufculnxz237w.R.inc(19984);assertEquals("<span>two</span> three", TextUtil.stripNewlines(p.html()));
    }finally{__CLR4_2_0fcufculnxz237w.R.flushNeeded();}}

    @Test public void testReplace() {__CLR4_2_0fcufculnxz237w.R.globalSliceStart(getClass().getName(),19985);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0fkob0pff5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fcufculnxz237w.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fcufculnxz237w.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.testReplace",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19985,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0fkob0pff5(){try{__CLR4_2_0fcufculnxz237w.R.inc(19985);
        __CLR4_2_0fcufculnxz237w.R.inc(19986);Document doc = Jsoup.parse("<p>One <span>two</span> three</p>");
        __CLR4_2_0fcufculnxz237w.R.inc(19987);Element p = doc.select("p").first();
        __CLR4_2_0fcufculnxz237w.R.inc(19988);Element insert = doc.createElement("em").text("foo");
        __CLR4_2_0fcufculnxz237w.R.inc(19989);p.childNode(1).replaceWith(insert);

        __CLR4_2_0fcufculnxz237w.R.inc(19990);assertEquals("One <em>foo</em> three", p.html());
    }finally{__CLR4_2_0fcufculnxz237w.R.flushNeeded();}}

    @Test public void ownerDocument() {__CLR4_2_0fcufculnxz237w.R.globalSliceStart(getClass().getName(),19991);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ni1305ffb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fcufculnxz237w.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fcufculnxz237w.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.ownerDocument",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19991,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ni1305ffb(){try{__CLR4_2_0fcufculnxz237w.R.inc(19991);
        __CLR4_2_0fcufculnxz237w.R.inc(19992);Document doc = Jsoup.parse("<p>Hello");
        __CLR4_2_0fcufculnxz237w.R.inc(19993);Element p = doc.select("p").first();
        __CLR4_2_0fcufculnxz237w.R.inc(19994);assertTrue(p.ownerDocument() == doc);
        __CLR4_2_0fcufculnxz237w.R.inc(19995);assertTrue(doc.ownerDocument() == doc);
        __CLR4_2_0fcufculnxz237w.R.inc(19996);assertNull(doc.parent());
    }finally{__CLR4_2_0fcufculnxz237w.R.flushNeeded();}}

    @Test public void root() {__CLR4_2_0fcufculnxz237w.R.globalSliceStart(getClass().getName(),19997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0rnvqw9ffh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fcufculnxz237w.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fcufculnxz237w.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.root",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19997,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0rnvqw9ffh(){try{__CLR4_2_0fcufculnxz237w.R.inc(19997);
        __CLR4_2_0fcufculnxz237w.R.inc(19998);Document doc = Jsoup.parse("<div><p>Hello");
        __CLR4_2_0fcufculnxz237w.R.inc(19999);Element p = doc.select("p").first();
        __CLR4_2_0fcufculnxz237w.R.inc(20000);Node root = p.root();
        __CLR4_2_0fcufculnxz237w.R.inc(20001);assertTrue(doc == root);
        __CLR4_2_0fcufculnxz237w.R.inc(20002);assertNull(root.parent());
        __CLR4_2_0fcufculnxz237w.R.inc(20003);assertTrue(doc.root() == doc);
        __CLR4_2_0fcufculnxz237w.R.inc(20004);assertTrue(doc.root() == doc.ownerDocument());

        __CLR4_2_0fcufculnxz237w.R.inc(20005);Element standAlone = new Element(Tag.valueOf("p"), "");
        __CLR4_2_0fcufculnxz237w.R.inc(20006);assertTrue(standAlone.parent() == null);
        __CLR4_2_0fcufculnxz237w.R.inc(20007);assertTrue(standAlone.root() == standAlone);
        __CLR4_2_0fcufculnxz237w.R.inc(20008);assertTrue(standAlone.ownerDocument() == null);
    }finally{__CLR4_2_0fcufculnxz237w.R.flushNeeded();}}

    @Test public void before() {__CLR4_2_0fcufculnxz237w.R.globalSliceStart(getClass().getName(),20009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0qd8owqfft();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fcufculnxz237w.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fcufculnxz237w.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.before",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20009,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0qd8owqfft(){try{__CLR4_2_0fcufculnxz237w.R.inc(20009);
        __CLR4_2_0fcufculnxz237w.R.inc(20010);Document doc = Jsoup.parse("<p>One <b>two</b> three</p>");
        __CLR4_2_0fcufculnxz237w.R.inc(20011);Element newNode = new Element(Tag.valueOf("em"), "");
        __CLR4_2_0fcufculnxz237w.R.inc(20012);newNode.appendText("four");

        __CLR4_2_0fcufculnxz237w.R.inc(20013);doc.select("b").first().before(newNode);
        __CLR4_2_0fcufculnxz237w.R.inc(20014);assertEquals("<p>One <em>four</em><b>two</b> three</p>", doc.body().html());

        __CLR4_2_0fcufculnxz237w.R.inc(20015);doc.select("b").first().before("<i>five</i>");
        __CLR4_2_0fcufculnxz237w.R.inc(20016);assertEquals("<p>One <em>four</em><i>five</i><b>two</b> three</p>", doc.body().html());
    }finally{__CLR4_2_0fcufculnxz237w.R.flushNeeded();}}

    @Test public void after() {__CLR4_2_0fcufculnxz237w.R.globalSliceStart(getClass().getName(),20017);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0v4au71fg1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fcufculnxz237w.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fcufculnxz237w.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.after",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20017,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0v4au71fg1(){try{__CLR4_2_0fcufculnxz237w.R.inc(20017);
        __CLR4_2_0fcufculnxz237w.R.inc(20018);Document doc = Jsoup.parse("<p>One <b>two</b> three</p>");
        __CLR4_2_0fcufculnxz237w.R.inc(20019);Element newNode = new Element(Tag.valueOf("em"), "");
        __CLR4_2_0fcufculnxz237w.R.inc(20020);newNode.appendText("four");

        __CLR4_2_0fcufculnxz237w.R.inc(20021);doc.select("b").first().after(newNode);
        __CLR4_2_0fcufculnxz237w.R.inc(20022);assertEquals("<p>One <b>two</b><em>four</em> three</p>", doc.body().html());

        __CLR4_2_0fcufculnxz237w.R.inc(20023);doc.select("b").first().after("<i>five</i>");
        __CLR4_2_0fcufculnxz237w.R.inc(20024);assertEquals("<p>One <b>two</b><i>five</i><em>four</em> three</p>", doc.body().html());
    }finally{__CLR4_2_0fcufculnxz237w.R.flushNeeded();}}

    @Test public void unwrap() {__CLR4_2_0fcufculnxz237w.R.globalSliceStart(getClass().getName(),20025);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0y5yq16fg9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fcufculnxz237w.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fcufculnxz237w.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.unwrap",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20025,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0y5yq16fg9(){try{__CLR4_2_0fcufculnxz237w.R.inc(20025);
        __CLR4_2_0fcufculnxz237w.R.inc(20026);Document doc = Jsoup.parse("<div>One <span>Two <b>Three</b></span> Four</div>");
        __CLR4_2_0fcufculnxz237w.R.inc(20027);Element span = doc.select("span").first();
        __CLR4_2_0fcufculnxz237w.R.inc(20028);Node twoText = span.childNode(0);
        __CLR4_2_0fcufculnxz237w.R.inc(20029);Node node = span.unwrap();

        __CLR4_2_0fcufculnxz237w.R.inc(20030);assertEquals("<div>One Two <b>Three</b> Four</div>", TextUtil.stripNewlines(doc.body().html()));
        __CLR4_2_0fcufculnxz237w.R.inc(20031);assertTrue(node instanceof TextNode);
        __CLR4_2_0fcufculnxz237w.R.inc(20032);assertEquals("Two ", ((TextNode) node).text());
        __CLR4_2_0fcufculnxz237w.R.inc(20033);assertEquals(node, twoText);
        __CLR4_2_0fcufculnxz237w.R.inc(20034);assertEquals(node.parent(), doc.select("div").first());
    }finally{__CLR4_2_0fcufculnxz237w.R.flushNeeded();}}

    @Test public void unwrapNoChildren() {__CLR4_2_0fcufculnxz237w.R.globalSliceStart(getClass().getName(),20035);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_07iv7uefgj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fcufculnxz237w.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fcufculnxz237w.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.unwrapNoChildren",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20035,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_07iv7uefgj(){try{__CLR4_2_0fcufculnxz237w.R.inc(20035);
        __CLR4_2_0fcufculnxz237w.R.inc(20036);Document doc = Jsoup.parse("<div>One <span></span> Two</div>");
        __CLR4_2_0fcufculnxz237w.R.inc(20037);Element span = doc.select("span").first();
        __CLR4_2_0fcufculnxz237w.R.inc(20038);Node node = span.unwrap();
        __CLR4_2_0fcufculnxz237w.R.inc(20039);assertEquals("<div>One  Two</div>", TextUtil.stripNewlines(doc.body().html()));
        __CLR4_2_0fcufculnxz237w.R.inc(20040);assertTrue(node == null);
    }finally{__CLR4_2_0fcufculnxz237w.R.flushNeeded();}}

    @Test public void traverse() {__CLR4_2_0fcufculnxz237w.R.globalSliceStart(getClass().getName(),20041);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0h4dh15fgp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fcufculnxz237w.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fcufculnxz237w.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.traverse",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20041,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0h4dh15fgp(){try{__CLR4_2_0fcufculnxz237w.R.inc(20041);
        __CLR4_2_0fcufculnxz237w.R.inc(20042);Document doc = Jsoup.parse("<div><p>Hello</p></div><div>There</div>");
        __CLR4_2_0fcufculnxz237w.R.inc(20043);final StringBuilder accum = new StringBuilder();
        __CLR4_2_0fcufculnxz237w.R.inc(20044);doc.select("div").first().traverse(new NodeVisitor() {
            @Override
            public void head(Node node, int depth) {try{__CLR4_2_0fcufculnxz237w.R.inc(20045);
                __CLR4_2_0fcufculnxz237w.R.inc(20046);accum.append("<").append(node.nodeName()).append(">");
            }finally{__CLR4_2_0fcufculnxz237w.R.flushNeeded();}}

            @Override
            public void tail(Node node, int depth) {try{__CLR4_2_0fcufculnxz237w.R.inc(20047);
                __CLR4_2_0fcufculnxz237w.R.inc(20048);accum.append("</").append(node.nodeName()).append(">");
            }finally{__CLR4_2_0fcufculnxz237w.R.flushNeeded();}}
        });
        __CLR4_2_0fcufculnxz237w.R.inc(20049);assertEquals("<div><p><#text></#text></p></div>", accum.toString());
    }finally{__CLR4_2_0fcufculnxz237w.R.flushNeeded();}}

    @Test public void orphanNodeReturnsNullForSiblingElements() {__CLR4_2_0fcufculnxz237w.R.globalSliceStart(getClass().getName(),20050);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ink4gnfgy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fcufculnxz237w.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fcufculnxz237w.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.orphanNodeReturnsNullForSiblingElements",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20050,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ink4gnfgy(){try{__CLR4_2_0fcufculnxz237w.R.inc(20050);
        __CLR4_2_0fcufculnxz237w.R.inc(20051);Node node = new Element(Tag.valueOf("p"), "");
        __CLR4_2_0fcufculnxz237w.R.inc(20052);Element el = new Element(Tag.valueOf("p"), "");

        __CLR4_2_0fcufculnxz237w.R.inc(20053);assertEquals(0, node.siblingIndex());
        __CLR4_2_0fcufculnxz237w.R.inc(20054);assertEquals(0, node.siblingNodes().size());

        __CLR4_2_0fcufculnxz237w.R.inc(20055);assertNull(node.previousSibling());
        __CLR4_2_0fcufculnxz237w.R.inc(20056);assertNull(node.nextSibling());

        __CLR4_2_0fcufculnxz237w.R.inc(20057);assertEquals(0, el.siblingElements().size());
        __CLR4_2_0fcufculnxz237w.R.inc(20058);assertNull(el.previousElementSibling());
        __CLR4_2_0fcufculnxz237w.R.inc(20059);assertNull(el.nextElementSibling());
    }finally{__CLR4_2_0fcufculnxz237w.R.flushNeeded();}}

    @Test public void nodeIsNotASiblingOfItself() {__CLR4_2_0fcufculnxz237w.R.globalSliceStart(getClass().getName(),20060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_043nqppfh8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fcufculnxz237w.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fcufculnxz237w.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.nodeIsNotASiblingOfItself",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20060,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_043nqppfh8(){try{__CLR4_2_0fcufculnxz237w.R.inc(20060);
        __CLR4_2_0fcufculnxz237w.R.inc(20061);Document doc = Jsoup.parse("<div><p>One<p>Two<p>Three</div>");
        __CLR4_2_0fcufculnxz237w.R.inc(20062);Element p2 = doc.select("p").get(1);

        __CLR4_2_0fcufculnxz237w.R.inc(20063);assertEquals("Two", p2.text());
        __CLR4_2_0fcufculnxz237w.R.inc(20064);List<Node> nodes = p2.siblingNodes();
        __CLR4_2_0fcufculnxz237w.R.inc(20065);assertEquals(2, nodes.size());
        __CLR4_2_0fcufculnxz237w.R.inc(20066);assertEquals("<p>One</p>", nodes.get(0).outerHtml());
        __CLR4_2_0fcufculnxz237w.R.inc(20067);assertEquals("<p>Three</p>", nodes.get(1).outerHtml());
    }finally{__CLR4_2_0fcufculnxz237w.R.flushNeeded();}}

    @Test public void childNodesCopy() {__CLR4_2_0fcufculnxz237w.R.globalSliceStart(getClass().getName(),20068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ptou1dfhg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fcufculnxz237w.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fcufculnxz237w.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.childNodesCopy",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20068,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ptou1dfhg(){try{__CLR4_2_0fcufculnxz237w.R.inc(20068);
        __CLR4_2_0fcufculnxz237w.R.inc(20069);Document doc = Jsoup.parse("<div id=1>Text 1 <p>One</p> Text 2 <p>Two<p>Three</div><div id=2>");
        __CLR4_2_0fcufculnxz237w.R.inc(20070);Element div1 = doc.select("#1").first();
        __CLR4_2_0fcufculnxz237w.R.inc(20071);Element div2 = doc.select("#2").first();
        __CLR4_2_0fcufculnxz237w.R.inc(20072);List<Node> divChildren = div1.childNodesCopy();
        __CLR4_2_0fcufculnxz237w.R.inc(20073);assertEquals(5, divChildren.size());
        __CLR4_2_0fcufculnxz237w.R.inc(20074);TextNode tn1 = (TextNode) div1.childNode(0);
        __CLR4_2_0fcufculnxz237w.R.inc(20075);TextNode tn2 = (TextNode) divChildren.get(0);
        __CLR4_2_0fcufculnxz237w.R.inc(20076);tn2.text("Text 1 updated");
        __CLR4_2_0fcufculnxz237w.R.inc(20077);assertEquals("Text 1 ", tn1.text());
        __CLR4_2_0fcufculnxz237w.R.inc(20078);div2.insertChildren(-1, divChildren);
        __CLR4_2_0fcufculnxz237w.R.inc(20079);assertEquals("<div id=\"1\">Text 1 <p>One</p> Text 2 <p>Two</p><p>Three</p></div><div id=\"2\">Text 1 updated"
            +"<p>One</p> Text 2 <p>Two</p><p>Three</p></div>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_2_0fcufculnxz237w.R.flushNeeded();}}

    @Test public void supportsClone() {__CLR4_2_0fcufculnxz237w.R.globalSliceStart(getClass().getName(),20080);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0xk9siofhs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fcufculnxz237w.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fcufculnxz237w.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.supportsClone",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20080,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0xk9siofhs(){try{__CLR4_2_0fcufculnxz237w.R.inc(20080);
        __CLR4_2_0fcufculnxz237w.R.inc(20081);Document doc = org.jsoup.Jsoup.parse("<div class=foo>Text</div>");
        __CLR4_2_0fcufculnxz237w.R.inc(20082);Element el = doc.select("div").first();
        __CLR4_2_0fcufculnxz237w.R.inc(20083);assertTrue(el.hasClass("foo"));

        __CLR4_2_0fcufculnxz237w.R.inc(20084);Element elClone = doc.clone().select("div").first();
        __CLR4_2_0fcufculnxz237w.R.inc(20085);assertTrue(elClone.hasClass("foo"));
        __CLR4_2_0fcufculnxz237w.R.inc(20086);assertTrue(elClone.text().equals("Text"));

        __CLR4_2_0fcufculnxz237w.R.inc(20087);el.removeClass("foo");
        __CLR4_2_0fcufculnxz237w.R.inc(20088);el.text("None");
        __CLR4_2_0fcufculnxz237w.R.inc(20089);assertFalse(el.hasClass("foo"));
        __CLR4_2_0fcufculnxz237w.R.inc(20090);assertTrue(elClone.hasClass("foo"));
        __CLR4_2_0fcufculnxz237w.R.inc(20091);assertTrue(el.text().equals("None"));
        __CLR4_2_0fcufculnxz237w.R.inc(20092);assertTrue(elClone.text().equals("Text"));
    }finally{__CLR4_2_0fcufculnxz237w.R.flushNeeded();}}

    @Test public void changingAttributeValueShouldReplaceExistingAttributeCaseInsensitive() {__CLR4_2_0fcufculnxz237w.R.globalSliceStart(getClass().getName(),20093);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0jd0zfafi5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fcufculnxz237w.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fcufculnxz237w.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.changingAttributeValueShouldReplaceExistingAttributeCaseInsensitive",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20093,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0jd0zfafi5(){try{__CLR4_2_0fcufculnxz237w.R.inc(20093);
        __CLR4_2_0fcufculnxz237w.R.inc(20094);Document document = Jsoup.parse("<INPUT id=\"foo\" NAME=\"foo\" VALUE=\"\">");
        __CLR4_2_0fcufculnxz237w.R.inc(20095);Element inputElement = document.select("#foo").first();

        __CLR4_2_0fcufculnxz237w.R.inc(20096);inputElement.attr("value","bar");

        __CLR4_2_0fcufculnxz237w.R.inc(20097);assertEquals(singletonAttributes("value", "bar"), getAttributesCaseInsensitive(inputElement, "value"));
    }finally{__CLR4_2_0fcufculnxz237w.R.flushNeeded();}}

    private Attributes getAttributesCaseInsensitive(Element element, String attributeName) {try{__CLR4_2_0fcufculnxz237w.R.inc(20098);
        __CLR4_2_0fcufculnxz237w.R.inc(20099);Attributes matches = new Attributes();
        __CLR4_2_0fcufculnxz237w.R.inc(20100);for (Attribute attribute : element.attributes()) {{
            __CLR4_2_0fcufculnxz237w.R.inc(20101);if ((((attribute.getKey().equalsIgnoreCase(attributeName))&&(__CLR4_2_0fcufculnxz237w.R.iget(20102)!=0|true))||(__CLR4_2_0fcufculnxz237w.R.iget(20103)==0&false))) {{
                __CLR4_2_0fcufculnxz237w.R.inc(20104);matches.put(attribute);
            }
        }}
        }__CLR4_2_0fcufculnxz237w.R.inc(20105);return matches;
    }finally{__CLR4_2_0fcufculnxz237w.R.flushNeeded();}}

    private Attributes singletonAttributes(String key, String value) {try{__CLR4_2_0fcufculnxz237w.R.inc(20106);
        __CLR4_2_0fcufculnxz237w.R.inc(20107);Attributes attributes = new Attributes();
        __CLR4_2_0fcufculnxz237w.R.inc(20108);attributes.put(key, value);
        __CLR4_2_0fcufculnxz237w.R.inc(20109);return attributes;
    }finally{__CLR4_2_0fcufculnxz237w.R.flushNeeded();}}
}
