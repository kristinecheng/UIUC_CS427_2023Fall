/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.NodeFilter;
import org.jsoup.select.NodeVisitor;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.*;

/**
 * Tests for Element (DOM stuff mostly).
 *
 * @author Jonathan Hedley
 */
public class ElementTest {static class __CLR4_2_0egcegclnxz237c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767707166L,8589935092L,19709,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private String reference = "<div id=div1><p>Hello</p><p>Another <b>element</b></p><div id=div2><img src=foo.png></div></div>";

    @Test public void getElementsByTagName() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),18732);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0q712jsegc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.getElementsByTagName",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18732,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0q712jsegc(){try{__CLR4_2_0egcegclnxz237c.R.inc(18732);
        __CLR4_2_0egcegclnxz237c.R.inc(18733);Document doc = Jsoup.parse(reference);
        __CLR4_2_0egcegclnxz237c.R.inc(18734);List<Element> divs = doc.getElementsByTag("div");
        __CLR4_2_0egcegclnxz237c.R.inc(18735);assertEquals(2, divs.size());
        __CLR4_2_0egcegclnxz237c.R.inc(18736);assertEquals("div1", divs.get(0).id());
        __CLR4_2_0egcegclnxz237c.R.inc(18737);assertEquals("div2", divs.get(1).id());

        __CLR4_2_0egcegclnxz237c.R.inc(18738);List<Element> ps = doc.getElementsByTag("p");
        __CLR4_2_0egcegclnxz237c.R.inc(18739);assertEquals(2, ps.size());
        __CLR4_2_0egcegclnxz237c.R.inc(18740);assertEquals("Hello", ((TextNode) ps.get(0).childNode(0)).getWholeText());
        __CLR4_2_0egcegclnxz237c.R.inc(18741);assertEquals("Another ", ((TextNode) ps.get(1).childNode(0)).getWholeText());
        __CLR4_2_0egcegclnxz237c.R.inc(18742);List<Element> ps2 = doc.getElementsByTag("P");
        __CLR4_2_0egcegclnxz237c.R.inc(18743);assertEquals(ps, ps2);

        __CLR4_2_0egcegclnxz237c.R.inc(18744);List<Element> imgs = doc.getElementsByTag("img");
        __CLR4_2_0egcegclnxz237c.R.inc(18745);assertEquals("foo.png", imgs.get(0).attr("src"));

        __CLR4_2_0egcegclnxz237c.R.inc(18746);List<Element> empty = doc.getElementsByTag("wtf");
        __CLR4_2_0egcegclnxz237c.R.inc(18747);assertEquals(0, empty.size());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}
    
    @Test public void getNamespacedElementsByTag() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),18748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0n1w2ukegs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.getNamespacedElementsByTag",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18748,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0n1w2ukegs(){try{__CLR4_2_0egcegclnxz237c.R.inc(18748);
        __CLR4_2_0egcegclnxz237c.R.inc(18749);Document doc = Jsoup.parse("<div><abc:def id=1>Hello</abc:def></div>");
        __CLR4_2_0egcegclnxz237c.R.inc(18750);Elements els = doc.getElementsByTag("abc:def");
        __CLR4_2_0egcegclnxz237c.R.inc(18751);assertEquals(1, els.size());
        __CLR4_2_0egcegclnxz237c.R.inc(18752);assertEquals("1", els.first().id());
        __CLR4_2_0egcegclnxz237c.R.inc(18753);assertEquals("abc:def", els.first().tagName());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testGetElementById() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),18754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ze0mj3egy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testGetElementById",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18754,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ze0mj3egy(){try{__CLR4_2_0egcegclnxz237c.R.inc(18754);
        __CLR4_2_0egcegclnxz237c.R.inc(18755);Document doc = Jsoup.parse(reference);
        __CLR4_2_0egcegclnxz237c.R.inc(18756);Element div = doc.getElementById("div1");
        __CLR4_2_0egcegclnxz237c.R.inc(18757);assertEquals("div1", div.id());
        __CLR4_2_0egcegclnxz237c.R.inc(18758);assertNull(doc.getElementById("none"));

        __CLR4_2_0egcegclnxz237c.R.inc(18759);Document doc2 = Jsoup.parse("<div id=1><div id=2><p>Hello <span id=2>world!</span></p></div></div>");
        __CLR4_2_0egcegclnxz237c.R.inc(18760);Element div2 = doc2.getElementById("2");
        __CLR4_2_0egcegclnxz237c.R.inc(18761);assertEquals("div", div2.tagName()); // not the span
        __CLR4_2_0egcegclnxz237c.R.inc(18762);Element span = div2.child(0).getElementById("2"); // called from <p> context should be span
        __CLR4_2_0egcegclnxz237c.R.inc(18763);assertEquals("span", span.tagName());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}
    
    @Test public void testGetText() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),18764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_06rhyhkeh8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testGetText",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18764,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_06rhyhkeh8(){try{__CLR4_2_0egcegclnxz237c.R.inc(18764);
        __CLR4_2_0egcegclnxz237c.R.inc(18765);Document doc = Jsoup.parse(reference);
        __CLR4_2_0egcegclnxz237c.R.inc(18766);assertEquals("Hello Another element", doc.text());
        __CLR4_2_0egcegclnxz237c.R.inc(18767);assertEquals("Another element", doc.getElementsByTag("p").get(1).text());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testGetChildText() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),18768);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0aariesehc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testGetChildText",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18768,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0aariesehc(){try{__CLR4_2_0egcegclnxz237c.R.inc(18768);
        __CLR4_2_0egcegclnxz237c.R.inc(18769);Document doc = Jsoup.parse("<p>Hello <b>there</b> now");
        __CLR4_2_0egcegclnxz237c.R.inc(18770);Element p = doc.select("p").first();
        __CLR4_2_0egcegclnxz237c.R.inc(18771);assertEquals("Hello there now", p.text());
        __CLR4_2_0egcegclnxz237c.R.inc(18772);assertEquals("Hello now", p.ownText());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testNormalisesText() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),18773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0forhyzehh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testNormalisesText",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18773,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0forhyzehh(){try{__CLR4_2_0egcegclnxz237c.R.inc(18773);
        __CLR4_2_0egcegclnxz237c.R.inc(18774);String h = "<p>Hello<p>There.</p> \n <p>Here <b>is</b> \n s<b>om</b>e text.";
        __CLR4_2_0egcegclnxz237c.R.inc(18775);Document doc = Jsoup.parse(h);
        __CLR4_2_0egcegclnxz237c.R.inc(18776);String text = doc.text();
        __CLR4_2_0egcegclnxz237c.R.inc(18777);assertEquals("Hello There. Here is some text.", text);
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testKeepsPreText() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),18778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0j7j9fpehm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testKeepsPreText",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18778,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0j7j9fpehm(){try{__CLR4_2_0egcegclnxz237c.R.inc(18778);
        __CLR4_2_0egcegclnxz237c.R.inc(18779);String h = "<p>Hello \n \n there.</p> <div><pre>  What's \n\n  that?</pre>";
        __CLR4_2_0egcegclnxz237c.R.inc(18780);Document doc = Jsoup.parse(h);
        __CLR4_2_0egcegclnxz237c.R.inc(18781);assertEquals("Hello there.   What's \n\n  that?", doc.text());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testKeepsPreTextInCode() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),18782);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0vqca31ehq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testKeepsPreTextInCode",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18782,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0vqca31ehq(){try{__CLR4_2_0egcegclnxz237c.R.inc(18782);
        __CLR4_2_0egcegclnxz237c.R.inc(18783);String h = "<pre><code>code\n\ncode</code></pre>";
        __CLR4_2_0egcegclnxz237c.R.inc(18784);Document doc = Jsoup.parse(h);
        __CLR4_2_0egcegclnxz237c.R.inc(18785);assertEquals("code\n\ncode", doc.text());
        __CLR4_2_0egcegclnxz237c.R.inc(18786);assertEquals("<pre><code>code\n\ncode</code></pre>", doc.body().html());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testKeepsPreTextAtDepth() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),18787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0f8m7k3ehv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testKeepsPreTextAtDepth",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18787,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0f8m7k3ehv(){try{__CLR4_2_0egcegclnxz237c.R.inc(18787);
        __CLR4_2_0egcegclnxz237c.R.inc(18788);String h = "<pre><code><span><b>code\n\ncode</b></span></code></pre>";
        __CLR4_2_0egcegclnxz237c.R.inc(18789);Document doc = Jsoup.parse(h);
        __CLR4_2_0egcegclnxz237c.R.inc(18790);assertEquals("code\n\ncode", doc.text());
        __CLR4_2_0egcegclnxz237c.R.inc(18791);assertEquals("<pre><code><span><b>code\n\ncode</b></span></code></pre>", doc.body().html());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testBrHasSpace() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),18792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0omr1rpei0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testBrHasSpace",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18792,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0omr1rpei0(){try{__CLR4_2_0egcegclnxz237c.R.inc(18792);
        __CLR4_2_0egcegclnxz237c.R.inc(18793);Document doc = Jsoup.parse("<p>Hello<br>there</p>");
        __CLR4_2_0egcegclnxz237c.R.inc(18794);assertEquals("Hello there", doc.text());
        __CLR4_2_0egcegclnxz237c.R.inc(18795);assertEquals("Hello there", doc.select("p").first().ownText());

        __CLR4_2_0egcegclnxz237c.R.inc(18796);doc = Jsoup.parse("<p>Hello <br> there</p>");
        __CLR4_2_0egcegclnxz237c.R.inc(18797);assertEquals("Hello there", doc.text());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testWholeText() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),18798);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0blgycnei6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testWholeText",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18798,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0blgycnei6(){try{__CLR4_2_0egcegclnxz237c.R.inc(18798);
        __CLR4_2_0egcegclnxz237c.R.inc(18799);Document doc = Jsoup.parse("<p> Hello\nthere &nbsp;  </p>");
        __CLR4_2_0egcegclnxz237c.R.inc(18800);assertEquals(" Hello\nthere \u00a0  ", doc.wholeText());

        __CLR4_2_0egcegclnxz237c.R.inc(18801);doc = Jsoup.parse("<p>Hello  \n  there</p>");
        __CLR4_2_0egcegclnxz237c.R.inc(18802);assertEquals("Hello  \n  there", doc.wholeText());

        __CLR4_2_0egcegclnxz237c.R.inc(18803);doc = Jsoup.parse("<p>Hello  <div>\n  there</div></p>");
        __CLR4_2_0egcegclnxz237c.R.inc(18804);assertEquals("Hello  \n  there", doc.wholeText());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testGetSiblings() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),18805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_011moseid();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testGetSiblings",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18805,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_011moseid(){try{__CLR4_2_0egcegclnxz237c.R.inc(18805);
        __CLR4_2_0egcegclnxz237c.R.inc(18806);Document doc = Jsoup.parse("<div><p>Hello<p id=1>there<p>this<p>is<p>an<p id=last>element</div>");
        __CLR4_2_0egcegclnxz237c.R.inc(18807);Element p = doc.getElementById("1");
        __CLR4_2_0egcegclnxz237c.R.inc(18808);assertEquals("there", p.text());
        __CLR4_2_0egcegclnxz237c.R.inc(18809);assertEquals("Hello", p.previousElementSibling().text());
        __CLR4_2_0egcegclnxz237c.R.inc(18810);assertEquals("this", p.nextElementSibling().text());
        __CLR4_2_0egcegclnxz237c.R.inc(18811);assertEquals("Hello", p.firstElementSibling().text());
        __CLR4_2_0egcegclnxz237c.R.inc(18812);assertEquals("element", p.lastElementSibling().text());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testGetSiblingsWithDuplicateContent() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),18813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0mrsd8weil();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testGetSiblingsWithDuplicateContent",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18813,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0mrsd8weil(){try{__CLR4_2_0egcegclnxz237c.R.inc(18813);
        __CLR4_2_0egcegclnxz237c.R.inc(18814);Document doc = Jsoup.parse("<div><p>Hello<p id=1>there<p>this<p>this<p>is<p>an<p id=last>element</div>");
        __CLR4_2_0egcegclnxz237c.R.inc(18815);Element p = doc.getElementById("1");
        __CLR4_2_0egcegclnxz237c.R.inc(18816);assertEquals("there", p.text());
        __CLR4_2_0egcegclnxz237c.R.inc(18817);assertEquals("Hello", p.previousElementSibling().text());
        __CLR4_2_0egcegclnxz237c.R.inc(18818);assertEquals("this", p.nextElementSibling().text());
        __CLR4_2_0egcegclnxz237c.R.inc(18819);assertEquals("this", p.nextElementSibling().nextElementSibling().text());
        __CLR4_2_0egcegclnxz237c.R.inc(18820);assertEquals("is", p.nextElementSibling().nextElementSibling().nextElementSibling().text());
        __CLR4_2_0egcegclnxz237c.R.inc(18821);assertEquals("Hello", p.firstElementSibling().text());
        __CLR4_2_0egcegclnxz237c.R.inc(18822);assertEquals("element", p.lastElementSibling().text());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testGetParents() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),18823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0d7h64eiv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testGetParents",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18823,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0d7h64eiv(){try{__CLR4_2_0egcegclnxz237c.R.inc(18823);
        __CLR4_2_0egcegclnxz237c.R.inc(18824);Document doc = Jsoup.parse("<div><p>Hello <span>there</span></div>");
        __CLR4_2_0egcegclnxz237c.R.inc(18825);Element span = doc.select("span").first();
        __CLR4_2_0egcegclnxz237c.R.inc(18826);Elements parents = span.parents();

        __CLR4_2_0egcegclnxz237c.R.inc(18827);assertEquals(4, parents.size());
        __CLR4_2_0egcegclnxz237c.R.inc(18828);assertEquals("p", parents.get(0).tagName());
        __CLR4_2_0egcegclnxz237c.R.inc(18829);assertEquals("div", parents.get(1).tagName());
        __CLR4_2_0egcegclnxz237c.R.inc(18830);assertEquals("body", parents.get(2).tagName());
        __CLR4_2_0egcegclnxz237c.R.inc(18831);assertEquals("html", parents.get(3).tagName());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}
    
    @Test public void testElementSiblingIndex() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),18832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0fc8h3zej4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testElementSiblingIndex",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18832,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0fc8h3zej4(){try{__CLR4_2_0egcegclnxz237c.R.inc(18832);
        __CLR4_2_0egcegclnxz237c.R.inc(18833);Document doc = Jsoup.parse("<div><p>One</p>...<p>Two</p>...<p>Three</p>");
        __CLR4_2_0egcegclnxz237c.R.inc(18834);Elements ps = doc.select("p");
        __CLR4_2_0egcegclnxz237c.R.inc(18835);assertTrue(0 == ps.get(0).elementSiblingIndex());
        __CLR4_2_0egcegclnxz237c.R.inc(18836);assertTrue(1 == ps.get(1).elementSiblingIndex());
        __CLR4_2_0egcegclnxz237c.R.inc(18837);assertTrue(2 == ps.get(2).elementSiblingIndex());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testElementSiblingIndexSameContent() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),18838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ybwwgweja();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testElementSiblingIndexSameContent",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18838,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ybwwgweja(){try{__CLR4_2_0egcegclnxz237c.R.inc(18838);
        __CLR4_2_0egcegclnxz237c.R.inc(18839);Document doc = Jsoup.parse("<div><p>One</p>...<p>One</p>...<p>One</p>");
        __CLR4_2_0egcegclnxz237c.R.inc(18840);Elements ps = doc.select("p");
        __CLR4_2_0egcegclnxz237c.R.inc(18841);assertTrue(0 == ps.get(0).elementSiblingIndex());
        __CLR4_2_0egcegclnxz237c.R.inc(18842);assertTrue(1 == ps.get(1).elementSiblingIndex());
        __CLR4_2_0egcegclnxz237c.R.inc(18843);assertTrue(2 == ps.get(2).elementSiblingIndex());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testGetElementsWithClass() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),18844);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ltsrr2ejg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testGetElementsWithClass",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18844,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ltsrr2ejg(){try{__CLR4_2_0egcegclnxz237c.R.inc(18844);
        __CLR4_2_0egcegclnxz237c.R.inc(18845);Document doc = Jsoup.parse("<div class='mellow yellow'><span class=mellow>Hello <b class='yellow'>Yellow!</b></span><p>Empty</p></div>");

        __CLR4_2_0egcegclnxz237c.R.inc(18846);List<Element> els = doc.getElementsByClass("mellow");
        __CLR4_2_0egcegclnxz237c.R.inc(18847);assertEquals(2, els.size());
        __CLR4_2_0egcegclnxz237c.R.inc(18848);assertEquals("div", els.get(0).tagName());
        __CLR4_2_0egcegclnxz237c.R.inc(18849);assertEquals("span", els.get(1).tagName());

        __CLR4_2_0egcegclnxz237c.R.inc(18850);List<Element> els2 = doc.getElementsByClass("yellow");
        __CLR4_2_0egcegclnxz237c.R.inc(18851);assertEquals(2, els2.size());
        __CLR4_2_0egcegclnxz237c.R.inc(18852);assertEquals("div", els2.get(0).tagName());
        __CLR4_2_0egcegclnxz237c.R.inc(18853);assertEquals("b", els2.get(1).tagName());

        __CLR4_2_0egcegclnxz237c.R.inc(18854);List<Element> none = doc.getElementsByClass("solo");
        __CLR4_2_0egcegclnxz237c.R.inc(18855);assertEquals(0, none.size());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testGetElementsWithAttribute() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),18856);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_039ili6ejs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testGetElementsWithAttribute",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18856,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_039ili6ejs(){try{__CLR4_2_0egcegclnxz237c.R.inc(18856);
        __CLR4_2_0egcegclnxz237c.R.inc(18857);Document doc = Jsoup.parse("<div style='bold'><p title=qux><p><b style></b></p></div>");
        __CLR4_2_0egcegclnxz237c.R.inc(18858);List<Element> els = doc.getElementsByAttribute("style");
        __CLR4_2_0egcegclnxz237c.R.inc(18859);assertEquals(2, els.size());
        __CLR4_2_0egcegclnxz237c.R.inc(18860);assertEquals("div", els.get(0).tagName());
        __CLR4_2_0egcegclnxz237c.R.inc(18861);assertEquals("b", els.get(1).tagName());

        __CLR4_2_0egcegclnxz237c.R.inc(18862);List<Element> none = doc.getElementsByAttribute("class");
        __CLR4_2_0egcegclnxz237c.R.inc(18863);assertEquals(0, none.size());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testGetElementsWithAttributeDash() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),18864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0l4af84ek0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testGetElementsWithAttributeDash",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18864,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0l4af84ek0(){try{__CLR4_2_0egcegclnxz237c.R.inc(18864);
        __CLR4_2_0egcegclnxz237c.R.inc(18865);Document doc = Jsoup.parse("<meta http-equiv=content-type value=utf8 id=1> <meta name=foo content=bar id=2> <div http-equiv=content-type value=utf8 id=3>");
        __CLR4_2_0egcegclnxz237c.R.inc(18866);Elements meta = doc.select("meta[http-equiv=content-type], meta[charset]");
        __CLR4_2_0egcegclnxz237c.R.inc(18867);assertEquals(1, meta.size());
        __CLR4_2_0egcegclnxz237c.R.inc(18868);assertEquals("1", meta.first().id());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testGetElementsWithAttributeValue() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),18869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_05lt3wjek5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testGetElementsWithAttributeValue",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18869,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_05lt3wjek5(){try{__CLR4_2_0egcegclnxz237c.R.inc(18869);
        __CLR4_2_0egcegclnxz237c.R.inc(18870);Document doc = Jsoup.parse("<div style='bold'><p><p><b style></b></p></div>");
        __CLR4_2_0egcegclnxz237c.R.inc(18871);List<Element> els = doc.getElementsByAttributeValue("style", "bold");
        __CLR4_2_0egcegclnxz237c.R.inc(18872);assertEquals(1, els.size());
        __CLR4_2_0egcegclnxz237c.R.inc(18873);assertEquals("div", els.get(0).tagName());

        __CLR4_2_0egcegclnxz237c.R.inc(18874);List<Element> none = doc.getElementsByAttributeValue("style", "none");
        __CLR4_2_0egcegclnxz237c.R.inc(18875);assertEquals(0, none.size());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}
    
    @Test public void testClassDomMethods() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),18876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0dq54ubekc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testClassDomMethods",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18876,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0dq54ubekc(){try{__CLR4_2_0egcegclnxz237c.R.inc(18876);
        __CLR4_2_0egcegclnxz237c.R.inc(18877);Document doc = Jsoup.parse("<div><span class=' mellow yellow '>Hello <b>Yellow</b></span></div>");
        __CLR4_2_0egcegclnxz237c.R.inc(18878);List<Element> els = doc.getElementsByAttribute("class");
        __CLR4_2_0egcegclnxz237c.R.inc(18879);Element span = els.get(0);
        __CLR4_2_0egcegclnxz237c.R.inc(18880);assertEquals("mellow yellow", span.className());
        __CLR4_2_0egcegclnxz237c.R.inc(18881);assertTrue(span.hasClass("mellow"));
        __CLR4_2_0egcegclnxz237c.R.inc(18882);assertTrue(span.hasClass("yellow"));
        __CLR4_2_0egcegclnxz237c.R.inc(18883);Set<String> classes = span.classNames();
        __CLR4_2_0egcegclnxz237c.R.inc(18884);assertEquals(2, classes.size());
        __CLR4_2_0egcegclnxz237c.R.inc(18885);assertTrue(classes.contains("mellow"));
        __CLR4_2_0egcegclnxz237c.R.inc(18886);assertTrue(classes.contains("yellow"));

        __CLR4_2_0egcegclnxz237c.R.inc(18887);assertEquals("", doc.className());
        __CLR4_2_0egcegclnxz237c.R.inc(18888);classes = doc.classNames();
        __CLR4_2_0egcegclnxz237c.R.inc(18889);assertEquals(0, classes.size());
        __CLR4_2_0egcegclnxz237c.R.inc(18890);assertFalse(doc.hasClass("mellow"));
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}
    
    @Test public void testHasClassDomMethods() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),18891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0p22z15ekr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testHasClassDomMethods",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18891,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0p22z15ekr(){try{__CLR4_2_0egcegclnxz237c.R.inc(18891);
        __CLR4_2_0egcegclnxz237c.R.inc(18892);Tag tag = Tag.valueOf("a");
        __CLR4_2_0egcegclnxz237c.R.inc(18893);Attributes attribs = new Attributes();
        __CLR4_2_0egcegclnxz237c.R.inc(18894);Element el = new Element(tag, "", attribs);
        
        __CLR4_2_0egcegclnxz237c.R.inc(18895);attribs.put("class", "toto");
        __CLR4_2_0egcegclnxz237c.R.inc(18896);boolean hasClass = el.hasClass("toto");
        __CLR4_2_0egcegclnxz237c.R.inc(18897);assertTrue(hasClass);
        
        __CLR4_2_0egcegclnxz237c.R.inc(18898);attribs.put("class", " toto");
        __CLR4_2_0egcegclnxz237c.R.inc(18899);hasClass = el.hasClass("toto");
        __CLR4_2_0egcegclnxz237c.R.inc(18900);assertTrue(hasClass);
        
        __CLR4_2_0egcegclnxz237c.R.inc(18901);attribs.put("class", "toto ");
        __CLR4_2_0egcegclnxz237c.R.inc(18902);hasClass = el.hasClass("toto");
        __CLR4_2_0egcegclnxz237c.R.inc(18903);assertTrue(hasClass);
        
        __CLR4_2_0egcegclnxz237c.R.inc(18904);attribs.put("class", "\ttoto ");
        __CLR4_2_0egcegclnxz237c.R.inc(18905);hasClass = el.hasClass("toto");
        __CLR4_2_0egcegclnxz237c.R.inc(18906);assertTrue(hasClass);
        
        __CLR4_2_0egcegclnxz237c.R.inc(18907);attribs.put("class", "  toto ");
        __CLR4_2_0egcegclnxz237c.R.inc(18908);hasClass = el.hasClass("toto");
        __CLR4_2_0egcegclnxz237c.R.inc(18909);assertTrue(hasClass);
        
        __CLR4_2_0egcegclnxz237c.R.inc(18910);attribs.put("class", "ab");
        __CLR4_2_0egcegclnxz237c.R.inc(18911);hasClass = el.hasClass("toto");
        __CLR4_2_0egcegclnxz237c.R.inc(18912);assertFalse(hasClass);
        
        __CLR4_2_0egcegclnxz237c.R.inc(18913);attribs.put("class", "     ");
        __CLR4_2_0egcegclnxz237c.R.inc(18914);hasClass = el.hasClass("toto");
        __CLR4_2_0egcegclnxz237c.R.inc(18915);assertFalse(hasClass);
        
        __CLR4_2_0egcegclnxz237c.R.inc(18916);attribs.put("class", "tototo");
        __CLR4_2_0egcegclnxz237c.R.inc(18917);hasClass = el.hasClass("toto");
        __CLR4_2_0egcegclnxz237c.R.inc(18918);assertFalse(hasClass);
        
        __CLR4_2_0egcegclnxz237c.R.inc(18919);attribs.put("class", "raulpismuth  ");
        __CLR4_2_0egcegclnxz237c.R.inc(18920);hasClass = el.hasClass("raulpismuth");
        __CLR4_2_0egcegclnxz237c.R.inc(18921);assertTrue(hasClass);
        
        __CLR4_2_0egcegclnxz237c.R.inc(18922);attribs.put("class", " abcd  raulpismuth efgh ");
        __CLR4_2_0egcegclnxz237c.R.inc(18923);hasClass = el.hasClass("raulpismuth");
        __CLR4_2_0egcegclnxz237c.R.inc(18924);assertTrue(hasClass);
        
        __CLR4_2_0egcegclnxz237c.R.inc(18925);attribs.put("class", " abcd efgh raulpismuth");
        __CLR4_2_0egcegclnxz237c.R.inc(18926);hasClass = el.hasClass("raulpismuth");
        __CLR4_2_0egcegclnxz237c.R.inc(18927);assertTrue(hasClass);
        
        __CLR4_2_0egcegclnxz237c.R.inc(18928);attribs.put("class", " abcd efgh raulpismuth ");
        __CLR4_2_0egcegclnxz237c.R.inc(18929);hasClass = el.hasClass("raulpismuth");
        __CLR4_2_0egcegclnxz237c.R.inc(18930);assertTrue(hasClass);
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    
    @Test public void testClassUpdates() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),18931);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0mr4mujelv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testClassUpdates",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18931,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0mr4mujelv(){try{__CLR4_2_0egcegclnxz237c.R.inc(18931);
        __CLR4_2_0egcegclnxz237c.R.inc(18932);Document doc = Jsoup.parse("<div class='mellow yellow'></div>");
        __CLR4_2_0egcegclnxz237c.R.inc(18933);Element div = doc.select("div").first();

        __CLR4_2_0egcegclnxz237c.R.inc(18934);div.addClass("green");
        __CLR4_2_0egcegclnxz237c.R.inc(18935);assertEquals("mellow yellow green", div.className());
        __CLR4_2_0egcegclnxz237c.R.inc(18936);div.removeClass("red"); // noop
        __CLR4_2_0egcegclnxz237c.R.inc(18937);div.removeClass("yellow");
        __CLR4_2_0egcegclnxz237c.R.inc(18938);assertEquals("mellow green", div.className());
        __CLR4_2_0egcegclnxz237c.R.inc(18939);div.toggleClass("green").toggleClass("red");
        __CLR4_2_0egcegclnxz237c.R.inc(18940);assertEquals("mellow red", div.className());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testOuterHtml() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),18941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0g25sm3em5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testOuterHtml",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18941,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0g25sm3em5(){try{__CLR4_2_0egcegclnxz237c.R.inc(18941);
        __CLR4_2_0egcegclnxz237c.R.inc(18942);Document doc = Jsoup.parse("<div title='Tags &amp;c.'><img src=foo.png><p><!-- comment -->Hello<p>there");
        __CLR4_2_0egcegclnxz237c.R.inc(18943);assertEquals("<html><head></head><body><div title=\"Tags &amp;c.\"><img src=\"foo.png\"><p><!-- comment -->Hello</p><p>there</p></div></body></html>",
                TextUtil.stripNewlines(doc.outerHtml()));
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testInnerHtml() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),18944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0n4p7vaem8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testInnerHtml",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18944,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0n4p7vaem8(){try{__CLR4_2_0egcegclnxz237c.R.inc(18944);
        __CLR4_2_0egcegclnxz237c.R.inc(18945);Document doc = Jsoup.parse("<div>\n <p>Hello</p> </div>");
        __CLR4_2_0egcegclnxz237c.R.inc(18946);assertEquals("<p>Hello</p>", doc.getElementsByTag("div").get(0).html());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testFormatHtml() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),18947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_02awshnemb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testFormatHtml",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18947,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_02awshnemb(){try{__CLR4_2_0egcegclnxz237c.R.inc(18947);
        __CLR4_2_0egcegclnxz237c.R.inc(18948);Document doc = Jsoup.parse("<title>Format test</title><div><p>Hello <span>jsoup <span>users</span></span></p><p>Good.</p></div>");
        __CLR4_2_0egcegclnxz237c.R.inc(18949);assertEquals("<html>\n <head>\n  <title>Format test</title>\n </head>\n <body>\n  <div>\n   <p>Hello <span>jsoup <span>users</span></span></p>\n   <p>Good.</p>\n  </div>\n </body>\n</html>", doc.html());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}
    
    @Test public void testFormatOutline() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),18950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0fs7vggeme();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testFormatOutline",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18950,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0fs7vggeme(){try{__CLR4_2_0egcegclnxz237c.R.inc(18950);
        __CLR4_2_0egcegclnxz237c.R.inc(18951);Document doc = Jsoup.parse("<title>Format test</title><div><p>Hello <span>jsoup <span>users</span></span></p><p>Good.</p></div>");
        __CLR4_2_0egcegclnxz237c.R.inc(18952);doc.outputSettings().outline(true);
        __CLR4_2_0egcegclnxz237c.R.inc(18953);assertEquals("<html>\n <head>\n  <title>Format test</title>\n </head>\n <body>\n  <div>\n   <p>\n    Hello \n    <span>\n     jsoup \n     <span>users</span>\n    </span>\n   </p>\n   <p>Good.</p>\n  </div>\n </body>\n</html>", doc.html());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testSetIndent() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),18954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0l7eynxemi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testSetIndent",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18954,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0l7eynxemi(){try{__CLR4_2_0egcegclnxz237c.R.inc(18954);
        __CLR4_2_0egcegclnxz237c.R.inc(18955);Document doc = Jsoup.parse("<div><p>Hello\nthere</p></div>");
        __CLR4_2_0egcegclnxz237c.R.inc(18956);doc.outputSettings().indentAmount(0);
        __CLR4_2_0egcegclnxz237c.R.inc(18957);assertEquals("<html>\n<head></head>\n<body>\n<div>\n<p>Hello there</p>\n</div>\n</body>\n</html>", doc.html());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testNotPretty() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),18958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0h190bmemm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testNotPretty",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18958,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0h190bmemm(){try{__CLR4_2_0egcegclnxz237c.R.inc(18958);
        __CLR4_2_0egcegclnxz237c.R.inc(18959);Document doc = Jsoup.parse("<div>   \n<p>Hello\n there\n</p></div>");
        __CLR4_2_0egcegclnxz237c.R.inc(18960);doc.outputSettings().prettyPrint(false);
        __CLR4_2_0egcegclnxz237c.R.inc(18961);assertEquals("<html><head></head><body><div>   \n<p>Hello\n there\n</p></div></body></html>", doc.html());

        __CLR4_2_0egcegclnxz237c.R.inc(18962);Element div = doc.select("div").first();
        __CLR4_2_0egcegclnxz237c.R.inc(18963);assertEquals("   \n<p>Hello\n there\n</p>", div.html());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}
    
    @Test public void testEmptyElementFormatHtml() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),18964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0vzruzuems();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testEmptyElementFormatHtml",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18964,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0vzruzuems(){try{__CLR4_2_0egcegclnxz237c.R.inc(18964);
        // don't put newlines into empty blocks
        __CLR4_2_0egcegclnxz237c.R.inc(18965);Document doc = Jsoup.parse("<section><div></div></section>");
        __CLR4_2_0egcegclnxz237c.R.inc(18966);assertEquals("<section>\n <div></div>\n</section>", doc.select("section").first().outerHtml());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testNoIndentOnScriptAndStyle() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),18967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0dx63zqemv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testNoIndentOnScriptAndStyle",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18967,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0dx63zqemv(){try{__CLR4_2_0egcegclnxz237c.R.inc(18967);
        // don't newline+indent closing </script> and </style> tags
        __CLR4_2_0egcegclnxz237c.R.inc(18968);Document doc = Jsoup.parse("<script>one\ntwo</script>\n<style>three\nfour</style>");
        __CLR4_2_0egcegclnxz237c.R.inc(18969);assertEquals("<script>one\ntwo</script> \n<style>three\nfour</style>", doc.head().html());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testContainerOutput() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),18970);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_06lmp87emy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testContainerOutput",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18970,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_06lmp87emy(){try{__CLR4_2_0egcegclnxz237c.R.inc(18970);
        __CLR4_2_0egcegclnxz237c.R.inc(18971);Document doc = Jsoup.parse("<title>Hello there</title> <div><p>Hello</p><p>there</p></div> <div>Another</div>");
        __CLR4_2_0egcegclnxz237c.R.inc(18972);assertEquals("<title>Hello there</title>", doc.select("title").first().outerHtml());
        __CLR4_2_0egcegclnxz237c.R.inc(18973);assertEquals("<div>\n <p>Hello</p>\n <p>there</p>\n</div>", doc.select("div").first().outerHtml());
        __CLR4_2_0egcegclnxz237c.R.inc(18974);assertEquals("<div>\n <p>Hello</p>\n <p>there</p>\n</div> \n<div>\n Another\n</div>", doc.select("body").first().html());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testSetText() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),18975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0xz7x5oen3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testSetText",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18975,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0xz7x5oen3(){try{__CLR4_2_0egcegclnxz237c.R.inc(18975);
        __CLR4_2_0egcegclnxz237c.R.inc(18976);String h = "<div id=1>Hello <p>there <b>now</b></p></div>";
        __CLR4_2_0egcegclnxz237c.R.inc(18977);Document doc = Jsoup.parse(h);
        __CLR4_2_0egcegclnxz237c.R.inc(18978);assertEquals("Hello there now", doc.text()); // need to sort out node whitespace
        __CLR4_2_0egcegclnxz237c.R.inc(18979);assertEquals("there now", doc.select("p").get(0).text());

        __CLR4_2_0egcegclnxz237c.R.inc(18980);Element div = doc.getElementById("1").text("Gone");
        __CLR4_2_0egcegclnxz237c.R.inc(18981);assertEquals("Gone", div.text());
        __CLR4_2_0egcegclnxz237c.R.inc(18982);assertEquals(0, doc.select("p").size());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}
    
    @Test public void testAddNewElement() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),18983);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_01ufkfmenb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testAddNewElement",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18983,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_01ufkfmenb(){try{__CLR4_2_0egcegclnxz237c.R.inc(18983);
        __CLR4_2_0egcegclnxz237c.R.inc(18984);Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        __CLR4_2_0egcegclnxz237c.R.inc(18985);Element div = doc.getElementById("1");
        __CLR4_2_0egcegclnxz237c.R.inc(18986);div.appendElement("p").text("there");
        __CLR4_2_0egcegclnxz237c.R.inc(18987);div.appendElement("P").attr("CLASS", "second").text("now");
        // manually specifying tag and attributes should maintain case based on parser settings
        __CLR4_2_0egcegclnxz237c.R.inc(18988);assertEquals("<html><head></head><body><div id=\"1\"><p>Hello</p><p>there</p><p class=\"second\">now</p></div></body></html>",
                TextUtil.stripNewlines(doc.html()));

        // check sibling index (with short circuit on reindexChildren):
        __CLR4_2_0egcegclnxz237c.R.inc(18989);Elements ps = doc.select("p");
        __CLR4_2_0egcegclnxz237c.R.inc(18990);for (int i = 0; (((i < ps.size())&&(__CLR4_2_0egcegclnxz237c.R.iget(18991)!=0|true))||(__CLR4_2_0egcegclnxz237c.R.iget(18992)==0&false)); i++) {{
            __CLR4_2_0egcegclnxz237c.R.inc(18993);assertEquals(i, ps.get(i).siblingIndex);
        }
    }}finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}
    
    @Test public void testAddBooleanAttribute() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),18994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0u1bjlienm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testAddBooleanAttribute",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18994,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0u1bjlienm(){try{__CLR4_2_0egcegclnxz237c.R.inc(18994);
        __CLR4_2_0egcegclnxz237c.R.inc(18995);Element div = new Element(Tag.valueOf("div"), "");
        
        __CLR4_2_0egcegclnxz237c.R.inc(18996);div.attr("true", true);
        
        __CLR4_2_0egcegclnxz237c.R.inc(18997);div.attr("false", "value");
        __CLR4_2_0egcegclnxz237c.R.inc(18998);div.attr("false", false);
        
        __CLR4_2_0egcegclnxz237c.R.inc(18999);assertTrue(div.hasAttr("true"));
        __CLR4_2_0egcegclnxz237c.R.inc(19000);assertEquals("", div.attr("true"));
        
        __CLR4_2_0egcegclnxz237c.R.inc(19001);List<Attribute> attributes = div.attributes().asList();
        __CLR4_2_0egcegclnxz237c.R.inc(19002);assertEquals("There should be one attribute", 1, attributes.size());
		__CLR4_2_0egcegclnxz237c.R.inc(19003);assertTrue("Attribute should be boolean", attributes.get(0) instanceof BooleanAttribute);
        
        __CLR4_2_0egcegclnxz237c.R.inc(19004);assertFalse(div.hasAttr("false"));
 
        __CLR4_2_0egcegclnxz237c.R.inc(19005);assertEquals("<div true></div>", div.outerHtml());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}    

    @Test public void testAppendRowToTable() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0u83hf0eny();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testAppendRowToTable",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19006,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0u83hf0eny(){try{__CLR4_2_0egcegclnxz237c.R.inc(19006);
        __CLR4_2_0egcegclnxz237c.R.inc(19007);Document doc = Jsoup.parse("<table><tr><td>1</td></tr></table>");
        __CLR4_2_0egcegclnxz237c.R.inc(19008);Element table = doc.select("tbody").first();
        __CLR4_2_0egcegclnxz237c.R.inc(19009);table.append("<tr><td>2</td></tr>");

        __CLR4_2_0egcegclnxz237c.R.inc(19010);assertEquals("<table><tbody><tr><td>1</td></tr><tr><td>2</td></tr></tbody></table>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

        @Test public void testPrependRowToTable() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_04pqbpgeo3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testPrependRowToTable",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19011,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_04pqbpgeo3(){try{__CLR4_2_0egcegclnxz237c.R.inc(19011);
        __CLR4_2_0egcegclnxz237c.R.inc(19012);Document doc = Jsoup.parse("<table><tr><td>1</td></tr></table>");
        __CLR4_2_0egcegclnxz237c.R.inc(19013);Element table = doc.select("tbody").first();
        __CLR4_2_0egcegclnxz237c.R.inc(19014);table.prepend("<tr><td>2</td></tr>");

        __CLR4_2_0egcegclnxz237c.R.inc(19015);assertEquals("<table><tbody><tr><td>2</td></tr><tr><td>1</td></tr></tbody></table>", TextUtil.stripNewlines(doc.body().html()));

        // check sibling index (reindexChildren):
        __CLR4_2_0egcegclnxz237c.R.inc(19016);Elements ps = doc.select("tr");
        __CLR4_2_0egcegclnxz237c.R.inc(19017);for (int i = 0; (((i < ps.size())&&(__CLR4_2_0egcegclnxz237c.R.iget(19018)!=0|true))||(__CLR4_2_0egcegclnxz237c.R.iget(19019)==0&false)); i++) {{
            __CLR4_2_0egcegclnxz237c.R.inc(19020);assertEquals(i, ps.get(i).siblingIndex);
        }
    }}finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}
    
    @Test public void testPrependElement() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19021);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0n4r9xjeod();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testPrependElement",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19021,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0n4r9xjeod(){try{__CLR4_2_0egcegclnxz237c.R.inc(19021);
        __CLR4_2_0egcegclnxz237c.R.inc(19022);Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        __CLR4_2_0egcegclnxz237c.R.inc(19023);Element div = doc.getElementById("1");
        __CLR4_2_0egcegclnxz237c.R.inc(19024);div.prependElement("p").text("Before");
        __CLR4_2_0egcegclnxz237c.R.inc(19025);assertEquals("Before", div.child(0).text());
        __CLR4_2_0egcegclnxz237c.R.inc(19026);assertEquals("Hello", div.child(1).text());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}
    
    @Test public void testAddNewText() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0t4hp6teoj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testAddNewText",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19027,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0t4hp6teoj(){try{__CLR4_2_0egcegclnxz237c.R.inc(19027);
        __CLR4_2_0egcegclnxz237c.R.inc(19028);Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        __CLR4_2_0egcegclnxz237c.R.inc(19029);Element div = doc.getElementById("1");
        __CLR4_2_0egcegclnxz237c.R.inc(19030);div.appendText(" there & now >");
        __CLR4_2_0egcegclnxz237c.R.inc(19031);assertEquals("<p>Hello</p> there &amp; now &gt;", TextUtil.stripNewlines(div.html()));
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}
    
    @Test public void testPrependText() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0b8o2dseoo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testPrependText",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19032,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0b8o2dseoo(){try{__CLR4_2_0egcegclnxz237c.R.inc(19032);
        __CLR4_2_0egcegclnxz237c.R.inc(19033);Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        __CLR4_2_0egcegclnxz237c.R.inc(19034);Element div = doc.getElementById("1");
        __CLR4_2_0egcegclnxz237c.R.inc(19035);div.prependText("there & now > ");
        __CLR4_2_0egcegclnxz237c.R.inc(19036);assertEquals("there & now > Hello", div.text());
        __CLR4_2_0egcegclnxz237c.R.inc(19037);assertEquals("there &amp; now &gt; <p>Hello</p>", TextUtil.stripNewlines(div.html()));
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class) public void testThrowsOnAddNullText() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0fisd2aeou();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,84,104,114,111,119,115,79,110,65,100,100,78,117,108,108,84,101,120,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testThrowsOnAddNullText",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19038,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0fisd2aeou(){try{__CLR4_2_0egcegclnxz237c.R.inc(19038);
        __CLR4_2_0egcegclnxz237c.R.inc(19039);Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        __CLR4_2_0egcegclnxz237c.R.inc(19040);Element div = doc.getElementById("1");
        __CLR4_2_0egcegclnxz237c.R.inc(19041);div.appendText(null);
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)  public void testThrowsOnPrependNullText() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0uyjl0reoy();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,84,104,114,111,119,115,79,110,80,114,101,112,101,110,100,78,117,108,108,84,101,120,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testThrowsOnPrependNullText",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19042,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0uyjl0reoy(){try{__CLR4_2_0egcegclnxz237c.R.inc(19042);
        __CLR4_2_0egcegclnxz237c.R.inc(19043);Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        __CLR4_2_0egcegclnxz237c.R.inc(19044);Element div = doc.getElementById("1");
        __CLR4_2_0egcegclnxz237c.R.inc(19045);div.prependText(null);
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}
    
    @Test public void testAddNewHtml() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19046);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0c5q9abep2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testAddNewHtml",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19046,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0c5q9abep2(){try{__CLR4_2_0egcegclnxz237c.R.inc(19046);
        __CLR4_2_0egcegclnxz237c.R.inc(19047);Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        __CLR4_2_0egcegclnxz237c.R.inc(19048);Element div = doc.getElementById("1");
        __CLR4_2_0egcegclnxz237c.R.inc(19049);div.append("<p>there</p><p>now</p>");
        __CLR4_2_0egcegclnxz237c.R.inc(19050);assertEquals("<p>Hello</p><p>there</p><p>now</p>", TextUtil.stripNewlines(div.html()));

        // check sibling index (no reindexChildren):
        __CLR4_2_0egcegclnxz237c.R.inc(19051);Elements ps = doc.select("p");
        __CLR4_2_0egcegclnxz237c.R.inc(19052);for (int i = 0; (((i < ps.size())&&(__CLR4_2_0egcegclnxz237c.R.iget(19053)!=0|true))||(__CLR4_2_0egcegclnxz237c.R.iget(19054)==0&false)); i++) {{
            __CLR4_2_0egcegclnxz237c.R.inc(19055);assertEquals(i, ps.get(i).siblingIndex);
        }
    }}finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}
    
    @Test public void testPrependNewHtml() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0et185yepc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testPrependNewHtml",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19056,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0et185yepc(){try{__CLR4_2_0egcegclnxz237c.R.inc(19056);
        __CLR4_2_0egcegclnxz237c.R.inc(19057);Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        __CLR4_2_0egcegclnxz237c.R.inc(19058);Element div = doc.getElementById("1");
        __CLR4_2_0egcegclnxz237c.R.inc(19059);div.prepend("<p>there</p><p>now</p>");
        __CLR4_2_0egcegclnxz237c.R.inc(19060);assertEquals("<p>there</p><p>now</p><p>Hello</p>", TextUtil.stripNewlines(div.html()));

        // check sibling index (reindexChildren):
        __CLR4_2_0egcegclnxz237c.R.inc(19061);Elements ps = doc.select("p");
        __CLR4_2_0egcegclnxz237c.R.inc(19062);for (int i = 0; (((i < ps.size())&&(__CLR4_2_0egcegclnxz237c.R.iget(19063)!=0|true))||(__CLR4_2_0egcegclnxz237c.R.iget(19064)==0&false)); i++) {{
            __CLR4_2_0egcegclnxz237c.R.inc(19065);assertEquals(i, ps.get(i).siblingIndex);
        }
    }}finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}
    
    @Test public void testSetHtml() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0k34owyepm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testSetHtml",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19066,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0k34owyepm(){try{__CLR4_2_0egcegclnxz237c.R.inc(19066);
        __CLR4_2_0egcegclnxz237c.R.inc(19067);Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        __CLR4_2_0egcegclnxz237c.R.inc(19068);Element div = doc.getElementById("1");
        __CLR4_2_0egcegclnxz237c.R.inc(19069);div.html("<p>there</p><p>now</p>");
        __CLR4_2_0egcegclnxz237c.R.inc(19070);assertEquals("<p>there</p><p>now</p>", TextUtil.stripNewlines(div.html()));
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testSetHtmlTitle() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19071);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0yl3sscepr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testSetHtmlTitle",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19071,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0yl3sscepr(){try{__CLR4_2_0egcegclnxz237c.R.inc(19071);
        __CLR4_2_0egcegclnxz237c.R.inc(19072);Document doc = Jsoup.parse("<html><head id=2><title id=1></title></head></html>");

        __CLR4_2_0egcegclnxz237c.R.inc(19073);Element title = doc.getElementById("1");
        __CLR4_2_0egcegclnxz237c.R.inc(19074);title.html("good");
        __CLR4_2_0egcegclnxz237c.R.inc(19075);assertEquals("good", title.html());
        __CLR4_2_0egcegclnxz237c.R.inc(19076);title.html("<i>bad</i>");
        __CLR4_2_0egcegclnxz237c.R.inc(19077);assertEquals("&lt;i&gt;bad&lt;/i&gt;", title.html());

        __CLR4_2_0egcegclnxz237c.R.inc(19078);Element head = doc.getElementById("2");
        __CLR4_2_0egcegclnxz237c.R.inc(19079);head.html("<title><i>bad</i></title>");
        __CLR4_2_0egcegclnxz237c.R.inc(19080);assertEquals("<title>&lt;i&gt;bad&lt;/i&gt;</title>", head.html());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testWrap() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19081);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0b8mz0jeq1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testWrap",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19081,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0b8mz0jeq1(){try{__CLR4_2_0egcegclnxz237c.R.inc(19081);
        __CLR4_2_0egcegclnxz237c.R.inc(19082);Document doc = Jsoup.parse("<div><p>Hello</p><p>There</p></div>");
        __CLR4_2_0egcegclnxz237c.R.inc(19083);Element p = doc.select("p").first();
        __CLR4_2_0egcegclnxz237c.R.inc(19084);p.wrap("<div class='head'></div>");
        __CLR4_2_0egcegclnxz237c.R.inc(19085);assertEquals("<div><div class=\"head\"><p>Hello</p></div><p>There</p></div>", TextUtil.stripNewlines(doc.body().html()));

        __CLR4_2_0egcegclnxz237c.R.inc(19086);Element ret = p.wrap("<div><div class=foo></div><p>What?</p></div>");
        __CLR4_2_0egcegclnxz237c.R.inc(19087);assertEquals("<div><div class=\"head\"><div><div class=\"foo\"><p>Hello</p></div><p>What?</p></div></div><p>There</p></div>",
                TextUtil.stripNewlines(doc.body().html()));

        __CLR4_2_0egcegclnxz237c.R.inc(19088);assertEquals(ret, p);
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}
    
    @Test public void before() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19089);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0qd8owqeq9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.before",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19089,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0qd8owqeq9(){try{__CLR4_2_0egcegclnxz237c.R.inc(19089);
        __CLR4_2_0egcegclnxz237c.R.inc(19090);Document doc = Jsoup.parse("<div><p>Hello</p><p>There</p></div>");
        __CLR4_2_0egcegclnxz237c.R.inc(19091);Element p1 = doc.select("p").first();
        __CLR4_2_0egcegclnxz237c.R.inc(19092);p1.before("<div>one</div><div>two</div>");
        __CLR4_2_0egcegclnxz237c.R.inc(19093);assertEquals("<div><div>one</div><div>two</div><p>Hello</p><p>There</p></div>", TextUtil.stripNewlines(doc.body().html()));
        
        __CLR4_2_0egcegclnxz237c.R.inc(19094);doc.select("p").last().before("<p>Three</p><!-- four -->");
        __CLR4_2_0egcegclnxz237c.R.inc(19095);assertEquals("<div><div>one</div><div>two</div><p>Hello</p><p>Three</p><!-- four --><p>There</p></div>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}
    
    @Test public void after() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0v4au71eqg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.after",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19096,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0v4au71eqg(){try{__CLR4_2_0egcegclnxz237c.R.inc(19096);
        __CLR4_2_0egcegclnxz237c.R.inc(19097);Document doc = Jsoup.parse("<div><p>Hello</p><p>There</p></div>");
        __CLR4_2_0egcegclnxz237c.R.inc(19098);Element p1 = doc.select("p").first();
        __CLR4_2_0egcegclnxz237c.R.inc(19099);p1.after("<div>one</div><div>two</div>");
        __CLR4_2_0egcegclnxz237c.R.inc(19100);assertEquals("<div><p>Hello</p><div>one</div><div>two</div><p>There</p></div>", TextUtil.stripNewlines(doc.body().html()));
        
        __CLR4_2_0egcegclnxz237c.R.inc(19101);doc.select("p").last().after("<p>Three</p><!-- four -->");
        __CLR4_2_0egcegclnxz237c.R.inc(19102);assertEquals("<div><p>Hello</p><div>one</div><div>two</div><p>There</p><p>Three</p><!-- four --></div>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testWrapWithRemainder() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_04ha5oqeqn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testWrapWithRemainder",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19103,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_04ha5oqeqn(){try{__CLR4_2_0egcegclnxz237c.R.inc(19103);
        __CLR4_2_0egcegclnxz237c.R.inc(19104);Document doc = Jsoup.parse("<div><p>Hello</p></div>");
        __CLR4_2_0egcegclnxz237c.R.inc(19105);Element p = doc.select("p").first();
        __CLR4_2_0egcegclnxz237c.R.inc(19106);p.wrap("<div class='head'></div><p>There!</p>");
        __CLR4_2_0egcegclnxz237c.R.inc(19107);assertEquals("<div><div class=\"head\"><p>Hello</p><p>There!</p></div></div>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testHasText() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0zhj8mceqs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testHasText",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19108,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0zhj8mceqs(){try{__CLR4_2_0egcegclnxz237c.R.inc(19108);
        __CLR4_2_0egcegclnxz237c.R.inc(19109);Document doc = Jsoup.parse("<div><p>Hello</p><p></p></div>");
        __CLR4_2_0egcegclnxz237c.R.inc(19110);Element div = doc.select("div").first();
        __CLR4_2_0egcegclnxz237c.R.inc(19111);Elements ps = doc.select("p");

        __CLR4_2_0egcegclnxz237c.R.inc(19112);assertTrue(div.hasText());
        __CLR4_2_0egcegclnxz237c.R.inc(19113);assertTrue(ps.first().hasText());
        __CLR4_2_0egcegclnxz237c.R.inc(19114);assertFalse(ps.last().hasText());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void dataset() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0to8r7jeqz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.dataset",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19115,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0to8r7jeqz(){try{__CLR4_2_0egcegclnxz237c.R.inc(19115);
        __CLR4_2_0egcegclnxz237c.R.inc(19116);Document doc = Jsoup.parse("<div id=1 data-name=jsoup class=new data-package=jar>Hello</div><p id=2>Hello</p>");
        __CLR4_2_0egcegclnxz237c.R.inc(19117);Element div = doc.select("div").first();
        __CLR4_2_0egcegclnxz237c.R.inc(19118);Map<String, String> dataset = div.dataset();
        __CLR4_2_0egcegclnxz237c.R.inc(19119);Attributes attributes = div.attributes();

        // size, get, set, add, remove
        __CLR4_2_0egcegclnxz237c.R.inc(19120);assertEquals(2, dataset.size());
        __CLR4_2_0egcegclnxz237c.R.inc(19121);assertEquals("jsoup", dataset.get("name"));
        __CLR4_2_0egcegclnxz237c.R.inc(19122);assertEquals("jar", dataset.get("package"));

        __CLR4_2_0egcegclnxz237c.R.inc(19123);dataset.put("name", "jsoup updated");
        __CLR4_2_0egcegclnxz237c.R.inc(19124);dataset.put("language", "java");
        __CLR4_2_0egcegclnxz237c.R.inc(19125);dataset.remove("package");

        __CLR4_2_0egcegclnxz237c.R.inc(19126);assertEquals(2, dataset.size());
        __CLR4_2_0egcegclnxz237c.R.inc(19127);assertEquals(4, attributes.size());
        __CLR4_2_0egcegclnxz237c.R.inc(19128);assertEquals("jsoup updated", attributes.get("data-name"));
        __CLR4_2_0egcegclnxz237c.R.inc(19129);assertEquals("jsoup updated", dataset.get("name"));
        __CLR4_2_0egcegclnxz237c.R.inc(19130);assertEquals("java", attributes.get("data-language"));
        __CLR4_2_0egcegclnxz237c.R.inc(19131);assertEquals("java", dataset.get("language"));

        __CLR4_2_0egcegclnxz237c.R.inc(19132);attributes.put("data-food", "bacon");
        __CLR4_2_0egcegclnxz237c.R.inc(19133);assertEquals(3, dataset.size());
        __CLR4_2_0egcegclnxz237c.R.inc(19134);assertEquals("bacon", dataset.get("food"));

        __CLR4_2_0egcegclnxz237c.R.inc(19135);attributes.put("data-", "empty");
        __CLR4_2_0egcegclnxz237c.R.inc(19136);assertEquals(null, dataset.get("")); // data- is not a data attribute

        __CLR4_2_0egcegclnxz237c.R.inc(19137);Element p = doc.select("p").first();
        __CLR4_2_0egcegclnxz237c.R.inc(19138);assertEquals(0, p.dataset().size());

    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void parentlessToString() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19139);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ysvcneern();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.parentlessToString",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19139,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ysvcneern(){try{__CLR4_2_0egcegclnxz237c.R.inc(19139);
        __CLR4_2_0egcegclnxz237c.R.inc(19140);Document doc = Jsoup.parse("<img src='foo'>");
        __CLR4_2_0egcegclnxz237c.R.inc(19141);Element img = doc.select("img").first();
        __CLR4_2_0egcegclnxz237c.R.inc(19142);assertEquals("<img src=\"foo\">", img.toString());

        __CLR4_2_0egcegclnxz237c.R.inc(19143);img.remove(); // lost its parent
        __CLR4_2_0egcegclnxz237c.R.inc(19144);assertEquals("<img src=\"foo\">", img.toString());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testClone() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0csyejyert();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testClone",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19145,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0csyejyert(){try{__CLR4_2_0egcegclnxz237c.R.inc(19145);
        __CLR4_2_0egcegclnxz237c.R.inc(19146);Document doc = Jsoup.parse("<div><p>One<p><span>Two</div>");

        __CLR4_2_0egcegclnxz237c.R.inc(19147);Element p = doc.select("p").get(1);
        __CLR4_2_0egcegclnxz237c.R.inc(19148);Element clone = p.clone();

        __CLR4_2_0egcegclnxz237c.R.inc(19149);assertNull(clone.parent()); // should be orphaned
        __CLR4_2_0egcegclnxz237c.R.inc(19150);assertEquals(0, clone.siblingIndex);
        __CLR4_2_0egcegclnxz237c.R.inc(19151);assertEquals(1, p.siblingIndex);
        __CLR4_2_0egcegclnxz237c.R.inc(19152);assertNotNull(p.parent());

        __CLR4_2_0egcegclnxz237c.R.inc(19153);clone.append("<span>Three");
        __CLR4_2_0egcegclnxz237c.R.inc(19154);assertEquals("<p><span>Two</span><span>Three</span></p>", TextUtil.stripNewlines(clone.outerHtml()));
        __CLR4_2_0egcegclnxz237c.R.inc(19155);assertEquals("<div><p>One</p><p><span>Two</span></p></div>", TextUtil.stripNewlines(doc.body().html())); // not modified

        __CLR4_2_0egcegclnxz237c.R.inc(19156);doc.body().appendChild(clone); // adopt
        __CLR4_2_0egcegclnxz237c.R.inc(19157);assertNotNull(clone.parent());
        __CLR4_2_0egcegclnxz237c.R.inc(19158);assertEquals("<div><p>One</p><p><span>Two</span></p></div><p><span>Two</span><span>Three</span></p>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testClonesClassnames() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19159);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0gaw89tes7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testClonesClassnames",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19159,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0gaw89tes7(){try{__CLR4_2_0egcegclnxz237c.R.inc(19159);
        __CLR4_2_0egcegclnxz237c.R.inc(19160);Document doc = Jsoup.parse("<div class='one two'></div>");
        __CLR4_2_0egcegclnxz237c.R.inc(19161);Element div = doc.select("div").first();
        __CLR4_2_0egcegclnxz237c.R.inc(19162);Set<String> classes = div.classNames();
        __CLR4_2_0egcegclnxz237c.R.inc(19163);assertEquals(2, classes.size());
        __CLR4_2_0egcegclnxz237c.R.inc(19164);assertTrue(classes.contains("one"));
        __CLR4_2_0egcegclnxz237c.R.inc(19165);assertTrue(classes.contains("two"));

        __CLR4_2_0egcegclnxz237c.R.inc(19166);Element copy = div.clone();
        __CLR4_2_0egcegclnxz237c.R.inc(19167);Set<String> copyClasses = copy.classNames();
        __CLR4_2_0egcegclnxz237c.R.inc(19168);assertEquals(2, copyClasses.size());
        __CLR4_2_0egcegclnxz237c.R.inc(19169);assertTrue(copyClasses.contains("one"));
        __CLR4_2_0egcegclnxz237c.R.inc(19170);assertTrue(copyClasses.contains("two"));
        __CLR4_2_0egcegclnxz237c.R.inc(19171);copyClasses.add("three");
        __CLR4_2_0egcegclnxz237c.R.inc(19172);copyClasses.remove("one");

        __CLR4_2_0egcegclnxz237c.R.inc(19173);assertTrue(classes.contains("one"));
        __CLR4_2_0egcegclnxz237c.R.inc(19174);assertFalse(classes.contains("three"));
        __CLR4_2_0egcegclnxz237c.R.inc(19175);assertFalse(copyClasses.contains("one"));
        __CLR4_2_0egcegclnxz237c.R.inc(19176);assertTrue(copyClasses.contains("three"));

        __CLR4_2_0egcegclnxz237c.R.inc(19177);assertEquals("", div.html());
        __CLR4_2_0egcegclnxz237c.R.inc(19178);assertEquals("", copy.html());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testShallowClone() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ywl5fiesr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testShallowClone",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19179,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ywl5fiesr(){try{__CLR4_2_0egcegclnxz237c.R.inc(19179);
        __CLR4_2_0egcegclnxz237c.R.inc(19180);String base = "http://example.com/";
        __CLR4_2_0egcegclnxz237c.R.inc(19181);Document doc = Jsoup.parse("<div id=1 class=one><p id=2 class=two>One", base);
        __CLR4_2_0egcegclnxz237c.R.inc(19182);Element d = doc.selectFirst("div");
        __CLR4_2_0egcegclnxz237c.R.inc(19183);Element p = doc.selectFirst("p");
        __CLR4_2_0egcegclnxz237c.R.inc(19184);TextNode t = p.textNodes().get(0);

        __CLR4_2_0egcegclnxz237c.R.inc(19185);Element d2 = d.shallowClone();
        __CLR4_2_0egcegclnxz237c.R.inc(19186);Element p2 = p.shallowClone();
        __CLR4_2_0egcegclnxz237c.R.inc(19187);TextNode t2 = (TextNode) t.shallowClone();

        __CLR4_2_0egcegclnxz237c.R.inc(19188);assertEquals(1, d.childNodeSize());
        __CLR4_2_0egcegclnxz237c.R.inc(19189);assertEquals(0, d2.childNodeSize());

        __CLR4_2_0egcegclnxz237c.R.inc(19190);assertEquals(1, p.childNodeSize());
        __CLR4_2_0egcegclnxz237c.R.inc(19191);assertEquals(0, p2.childNodeSize());

        __CLR4_2_0egcegclnxz237c.R.inc(19192);assertEquals("", p2.text());
        __CLR4_2_0egcegclnxz237c.R.inc(19193);assertEquals("One", t2.text());

        __CLR4_2_0egcegclnxz237c.R.inc(19194);assertEquals("two", p2.className());
        __CLR4_2_0egcegclnxz237c.R.inc(19195);p2.removeClass("two");
        __CLR4_2_0egcegclnxz237c.R.inc(19196);assertEquals("two", p.className());

        __CLR4_2_0egcegclnxz237c.R.inc(19197);d2.append("<p id=3>Three");
        __CLR4_2_0egcegclnxz237c.R.inc(19198);assertEquals(1, d2.childNodeSize());
        __CLR4_2_0egcegclnxz237c.R.inc(19199);assertEquals("Three", d2.text());
        __CLR4_2_0egcegclnxz237c.R.inc(19200);assertEquals("One", d.text());
        __CLR4_2_0egcegclnxz237c.R.inc(19201);assertEquals(base, d2.baseUri());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testTagNameSet() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ydkepiete();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testTagNameSet",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19202,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ydkepiete(){try{__CLR4_2_0egcegclnxz237c.R.inc(19202);
        __CLR4_2_0egcegclnxz237c.R.inc(19203);Document doc = Jsoup.parse("<div><i>Hello</i>");
        __CLR4_2_0egcegclnxz237c.R.inc(19204);doc.select("i").first().tagName("em");
        __CLR4_2_0egcegclnxz237c.R.inc(19205);assertEquals(0, doc.select("i").size());
        __CLR4_2_0egcegclnxz237c.R.inc(19206);assertEquals(1, doc.select("em").size());
        __CLR4_2_0egcegclnxz237c.R.inc(19207);assertEquals("<em>Hello</em>", doc.select("div").first().html());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testHtmlContainsOuter() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0vrulraetk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testHtmlContainsOuter",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19208,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0vrulraetk(){try{__CLR4_2_0egcegclnxz237c.R.inc(19208);
        __CLR4_2_0egcegclnxz237c.R.inc(19209);Document doc = Jsoup.parse("<title>Check</title> <div>Hello there</div>");
        __CLR4_2_0egcegclnxz237c.R.inc(19210);doc.outputSettings().indentAmount(0);
        __CLR4_2_0egcegclnxz237c.R.inc(19211);assertTrue(doc.html().contains(doc.select("title").outerHtml()));
        __CLR4_2_0egcegclnxz237c.R.inc(19212);assertTrue(doc.html().contains(doc.select("div").outerHtml()));
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testGetTextNodes() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0tqbpjetp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testGetTextNodes",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19213,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0tqbpjetp(){try{__CLR4_2_0egcegclnxz237c.R.inc(19213);
        __CLR4_2_0egcegclnxz237c.R.inc(19214);Document doc = Jsoup.parse("<p>One <span>Two</span> Three <br> Four</p>");
        __CLR4_2_0egcegclnxz237c.R.inc(19215);List<TextNode> textNodes = doc.select("p").first().textNodes();

        __CLR4_2_0egcegclnxz237c.R.inc(19216);assertEquals(3, textNodes.size());
        __CLR4_2_0egcegclnxz237c.R.inc(19217);assertEquals("One ", textNodes.get(0).text());
        __CLR4_2_0egcegclnxz237c.R.inc(19218);assertEquals(" Three ", textNodes.get(1).text());
        __CLR4_2_0egcegclnxz237c.R.inc(19219);assertEquals(" Four", textNodes.get(2).text());

        __CLR4_2_0egcegclnxz237c.R.inc(19220);assertEquals(0, doc.select("br").first().textNodes().size());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testManipulateTextNodes() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0h4agchetx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testManipulateTextNodes",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19221,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0h4agchetx(){try{__CLR4_2_0egcegclnxz237c.R.inc(19221);
        __CLR4_2_0egcegclnxz237c.R.inc(19222);Document doc = Jsoup.parse("<p>One <span>Two</span> Three <br> Four</p>");
        __CLR4_2_0egcegclnxz237c.R.inc(19223);Element p = doc.select("p").first();
        __CLR4_2_0egcegclnxz237c.R.inc(19224);List<TextNode> textNodes = p.textNodes();

        __CLR4_2_0egcegclnxz237c.R.inc(19225);textNodes.get(1).text(" three-more ");
        __CLR4_2_0egcegclnxz237c.R.inc(19226);textNodes.get(2).splitText(3).text("-ur");

        __CLR4_2_0egcegclnxz237c.R.inc(19227);assertEquals("One Two three-more Fo-ur", p.text());
        __CLR4_2_0egcegclnxz237c.R.inc(19228);assertEquals("One three-more Fo-ur", p.ownText());
        __CLR4_2_0egcegclnxz237c.R.inc(19229);assertEquals(4, p.textNodes().size()); // grew because of split
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testGetDataNodes() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ho5qeueu6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testGetDataNodes",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19230,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ho5qeueu6(){try{__CLR4_2_0egcegclnxz237c.R.inc(19230);
        __CLR4_2_0egcegclnxz237c.R.inc(19231);Document doc = Jsoup.parse("<script>One Two</script> <style>Three Four</style> <p>Fix Six</p>");
        __CLR4_2_0egcegclnxz237c.R.inc(19232);Element script = doc.select("script").first();
        __CLR4_2_0egcegclnxz237c.R.inc(19233);Element style = doc.select("style").first();
        __CLR4_2_0egcegclnxz237c.R.inc(19234);Element p = doc.select("p").first();

        __CLR4_2_0egcegclnxz237c.R.inc(19235);List<DataNode> scriptData = script.dataNodes();
        __CLR4_2_0egcegclnxz237c.R.inc(19236);assertEquals(1, scriptData.size());
        __CLR4_2_0egcegclnxz237c.R.inc(19237);assertEquals("One Two", scriptData.get(0).getWholeData());

        __CLR4_2_0egcegclnxz237c.R.inc(19238);List<DataNode> styleData = style.dataNodes();
        __CLR4_2_0egcegclnxz237c.R.inc(19239);assertEquals(1, styleData.size());
        __CLR4_2_0egcegclnxz237c.R.inc(19240);assertEquals("Three Four", styleData.get(0).getWholeData());

        __CLR4_2_0egcegclnxz237c.R.inc(19241);List<DataNode> pData = p.dataNodes();
        __CLR4_2_0egcegclnxz237c.R.inc(19242);assertEquals(0, pData.size());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void elementIsNotASiblingOfItself() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0kx9j7neuj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.elementIsNotASiblingOfItself",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19243,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0kx9j7neuj(){try{__CLR4_2_0egcegclnxz237c.R.inc(19243);
        __CLR4_2_0egcegclnxz237c.R.inc(19244);Document doc = Jsoup.parse("<div><p>One<p>Two<p>Three</div>");
        __CLR4_2_0egcegclnxz237c.R.inc(19245);Element p2 = doc.select("p").get(1);

        __CLR4_2_0egcegclnxz237c.R.inc(19246);assertEquals("Two", p2.text());
        __CLR4_2_0egcegclnxz237c.R.inc(19247);Elements els = p2.siblingElements();
        __CLR4_2_0egcegclnxz237c.R.inc(19248);assertEquals(2, els.size());
        __CLR4_2_0egcegclnxz237c.R.inc(19249);assertEquals("<p>One</p>", els.get(0).outerHtml());
        __CLR4_2_0egcegclnxz237c.R.inc(19250);assertEquals("<p>Three</p>", els.get(1).outerHtml());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testChildThrowsIndexOutOfBoundsOnMissing() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19251);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0wtao1beur();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testChildThrowsIndexOutOfBoundsOnMissing",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19251,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0wtao1beur(){try{__CLR4_2_0egcegclnxz237c.R.inc(19251);
        __CLR4_2_0egcegclnxz237c.R.inc(19252);Document doc = Jsoup.parse("<div><p>One</p><p>Two</p></div>");
        __CLR4_2_0egcegclnxz237c.R.inc(19253);Element div = doc.select("div").first();

        __CLR4_2_0egcegclnxz237c.R.inc(19254);assertEquals(2, div.children().size());
        __CLR4_2_0egcegclnxz237c.R.inc(19255);assertEquals("One", div.child(0).text());

        __CLR4_2_0egcegclnxz237c.R.inc(19256);try {
            __CLR4_2_0egcegclnxz237c.R.inc(19257);div.child(3);
            __CLR4_2_0egcegclnxz237c.R.inc(19258);fail("Should throw index out of bounds");
        } catch (IndexOutOfBoundsException e) {}
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test
    public void moveByAppend() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19259);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0es5nbdeuz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.moveByAppend",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19259,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0es5nbdeuz(){try{__CLR4_2_0egcegclnxz237c.R.inc(19259);
        // test for https://github.com/jhy/jsoup/issues/239
        // can empty an element and append its children to another element
        __CLR4_2_0egcegclnxz237c.R.inc(19260);Document doc = Jsoup.parse("<div id=1>Text <p>One</p> Text <p>Two</p></div><div id=2></div>");
        __CLR4_2_0egcegclnxz237c.R.inc(19261);Element div1 = doc.select("div").get(0);
        __CLR4_2_0egcegclnxz237c.R.inc(19262);Element div2 = doc.select("div").get(1);

        __CLR4_2_0egcegclnxz237c.R.inc(19263);assertEquals(4, div1.childNodeSize());
        __CLR4_2_0egcegclnxz237c.R.inc(19264);List<Node> children = div1.childNodes();
        __CLR4_2_0egcegclnxz237c.R.inc(19265);assertEquals(4, children.size());

        __CLR4_2_0egcegclnxz237c.R.inc(19266);div2.insertChildren(0, children);

        __CLR4_2_0egcegclnxz237c.R.inc(19267);assertEquals(0, children.size()); // children is backed by div1.childNodes, moved, so should be 0 now
        __CLR4_2_0egcegclnxz237c.R.inc(19268);assertEquals(0, div1.childNodeSize());
        __CLR4_2_0egcegclnxz237c.R.inc(19269);assertEquals(4, div2.childNodeSize());
        __CLR4_2_0egcegclnxz237c.R.inc(19270);assertEquals("<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p> Text \n <p>Two</p>\n</div>",
            doc.body().html());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test
    public void insertChildrenArgumentValidation() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19271);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0uv1obvevb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.insertChildrenArgumentValidation",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19271,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0uv1obvevb(){try{__CLR4_2_0egcegclnxz237c.R.inc(19271);
        __CLR4_2_0egcegclnxz237c.R.inc(19272);Document doc = Jsoup.parse("<div id=1>Text <p>One</p> Text <p>Two</p></div><div id=2></div>");
        __CLR4_2_0egcegclnxz237c.R.inc(19273);Element div1 = doc.select("div").get(0);
        __CLR4_2_0egcegclnxz237c.R.inc(19274);Element div2 = doc.select("div").get(1);
        __CLR4_2_0egcegclnxz237c.R.inc(19275);List<Node> children = div1.childNodes();

        __CLR4_2_0egcegclnxz237c.R.inc(19276);try {
            __CLR4_2_0egcegclnxz237c.R.inc(19277);div2.insertChildren(6, children);
            __CLR4_2_0egcegclnxz237c.R.inc(19278);fail();
        } catch (IllegalArgumentException e) {}

        __CLR4_2_0egcegclnxz237c.R.inc(19279);try {
            __CLR4_2_0egcegclnxz237c.R.inc(19280);div2.insertChildren(-5, children);
            __CLR4_2_0egcegclnxz237c.R.inc(19281);fail();
        } catch (IllegalArgumentException e) {
        }

        __CLR4_2_0egcegclnxz237c.R.inc(19282);try {
            __CLR4_2_0egcegclnxz237c.R.inc(19283);div2.insertChildren(0, (Collection<? extends Node>) null);
            __CLR4_2_0egcegclnxz237c.R.inc(19284);fail();
        } catch (IllegalArgumentException e) {
        }
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test
    public void insertChildrenAtPosition() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0a31e0revp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.insertChildrenAtPosition",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19285,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0a31e0revp(){try{__CLR4_2_0egcegclnxz237c.R.inc(19285);
        __CLR4_2_0egcegclnxz237c.R.inc(19286);Document doc = Jsoup.parse("<div id=1>Text1 <p>One</p> Text2 <p>Two</p></div><div id=2>Text3 <p>Three</p></div>");
        __CLR4_2_0egcegclnxz237c.R.inc(19287);Element div1 = doc.select("div").get(0);
        __CLR4_2_0egcegclnxz237c.R.inc(19288);Elements p1s = div1.select("p");
        __CLR4_2_0egcegclnxz237c.R.inc(19289);Element div2 = doc.select("div").get(1);

        __CLR4_2_0egcegclnxz237c.R.inc(19290);assertEquals(2, div2.childNodeSize());
        __CLR4_2_0egcegclnxz237c.R.inc(19291);div2.insertChildren(-1, p1s);
        __CLR4_2_0egcegclnxz237c.R.inc(19292);assertEquals(2, div1.childNodeSize()); // moved two out
        __CLR4_2_0egcegclnxz237c.R.inc(19293);assertEquals(4, div2.childNodeSize());
        __CLR4_2_0egcegclnxz237c.R.inc(19294);assertEquals(3, p1s.get(1).siblingIndex()); // should be last

        __CLR4_2_0egcegclnxz237c.R.inc(19295);List<Node> els = new ArrayList<>();
        __CLR4_2_0egcegclnxz237c.R.inc(19296);Element el1 = new Element(Tag.valueOf("span"), "").text("Span1");
        __CLR4_2_0egcegclnxz237c.R.inc(19297);Element el2 = new Element(Tag.valueOf("span"), "").text("Span2");
        __CLR4_2_0egcegclnxz237c.R.inc(19298);TextNode tn1 = new TextNode("Text4");
        __CLR4_2_0egcegclnxz237c.R.inc(19299);els.add(el1);
        __CLR4_2_0egcegclnxz237c.R.inc(19300);els.add(el2);
        __CLR4_2_0egcegclnxz237c.R.inc(19301);els.add(tn1);

        __CLR4_2_0egcegclnxz237c.R.inc(19302);assertNull(el1.parent());
        __CLR4_2_0egcegclnxz237c.R.inc(19303);div2.insertChildren(-2, els);
        __CLR4_2_0egcegclnxz237c.R.inc(19304);assertEquals(div2, el1.parent());
        __CLR4_2_0egcegclnxz237c.R.inc(19305);assertEquals(7, div2.childNodeSize());
        __CLR4_2_0egcegclnxz237c.R.inc(19306);assertEquals(3, el1.siblingIndex());
        __CLR4_2_0egcegclnxz237c.R.inc(19307);assertEquals(4, el2.siblingIndex());
        __CLR4_2_0egcegclnxz237c.R.inc(19308);assertEquals(5, tn1.siblingIndex());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test
    public void insertChildrenAsCopy() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_019vvvqewd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.insertChildrenAsCopy",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19309,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_019vvvqewd(){try{__CLR4_2_0egcegclnxz237c.R.inc(19309);
        __CLR4_2_0egcegclnxz237c.R.inc(19310);Document doc = Jsoup.parse("<div id=1>Text <p>One</p> Text <p>Two</p></div><div id=2></div>");
        __CLR4_2_0egcegclnxz237c.R.inc(19311);Element div1 = doc.select("div").get(0);
        __CLR4_2_0egcegclnxz237c.R.inc(19312);Element div2 = doc.select("div").get(1);
        __CLR4_2_0egcegclnxz237c.R.inc(19313);Elements ps = doc.select("p").clone();
        __CLR4_2_0egcegclnxz237c.R.inc(19314);ps.first().text("One cloned");
        __CLR4_2_0egcegclnxz237c.R.inc(19315);div2.insertChildren(-1, ps);

        __CLR4_2_0egcegclnxz237c.R.inc(19316);assertEquals(4, div1.childNodeSize()); // not moved -- cloned
        __CLR4_2_0egcegclnxz237c.R.inc(19317);assertEquals(2, div2.childNodeSize());
        __CLR4_2_0egcegclnxz237c.R.inc(19318);assertEquals("<div id=\"1\">Text <p>One</p> Text <p>Two</p></div><div id=\"2\"><p>One cloned</p><p>Two</p></div>",
            TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test
    public void testCssPath() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0f30h25ewn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testCssPath",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19319,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0f30h25ewn(){try{__CLR4_2_0egcegclnxz237c.R.inc(19319);
        __CLR4_2_0egcegclnxz237c.R.inc(19320);Document doc = Jsoup.parse("<div id=\"id1\">A</div><div>B</div><div class=\"c1 c2\">C</div>");
        __CLR4_2_0egcegclnxz237c.R.inc(19321);Element divA = doc.select("div").get(0);
        __CLR4_2_0egcegclnxz237c.R.inc(19322);Element divB = doc.select("div").get(1);
        __CLR4_2_0egcegclnxz237c.R.inc(19323);Element divC = doc.select("div").get(2);
        __CLR4_2_0egcegclnxz237c.R.inc(19324);assertEquals(divA.cssSelector(), "#id1");
        __CLR4_2_0egcegclnxz237c.R.inc(19325);assertEquals(divB.cssSelector(), "html > body > div:nth-child(2)");
        __CLR4_2_0egcegclnxz237c.R.inc(19326);assertEquals(divC.cssSelector(), "html > body > div.c1.c2");

        __CLR4_2_0egcegclnxz237c.R.inc(19327);assertTrue(divA == doc.select(divA.cssSelector()).first());
        __CLR4_2_0egcegclnxz237c.R.inc(19328);assertTrue(divB == doc.select(divB.cssSelector()).first());
        __CLR4_2_0egcegclnxz237c.R.inc(19329);assertTrue(divC == doc.select(divC.cssSelector()).first());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}


    @Test
    public void testClassNames() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_05y4o47ewy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testClassNames",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19330,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_05y4o47ewy(){try{__CLR4_2_0egcegclnxz237c.R.inc(19330);
        __CLR4_2_0egcegclnxz237c.R.inc(19331);Document doc = Jsoup.parse("<div class=\"c1 c2\">C</div>");
        __CLR4_2_0egcegclnxz237c.R.inc(19332);Element div = doc.select("div").get(0);

        __CLR4_2_0egcegclnxz237c.R.inc(19333);assertEquals("c1 c2", div.className());

        __CLR4_2_0egcegclnxz237c.R.inc(19334);final Set<String> set1 = div.classNames();
        __CLR4_2_0egcegclnxz237c.R.inc(19335);final Object[] arr1 = set1.toArray();
        __CLR4_2_0egcegclnxz237c.R.inc(19336);assertTrue(arr1.length==2);
        __CLR4_2_0egcegclnxz237c.R.inc(19337);assertEquals("c1", arr1[0]);
        __CLR4_2_0egcegclnxz237c.R.inc(19338);assertEquals("c2", arr1[1]);

        // Changes to the set should not be reflected in the Elements getters
       	__CLR4_2_0egcegclnxz237c.R.inc(19339);set1.add("c3");
        __CLR4_2_0egcegclnxz237c.R.inc(19340);assertTrue(2==div.classNames().size());
        __CLR4_2_0egcegclnxz237c.R.inc(19341);assertEquals("c1 c2", div.className());

        // Update the class names to a fresh set
        __CLR4_2_0egcegclnxz237c.R.inc(19342);final Set<String> newSet = new LinkedHashSet<>(3);
        __CLR4_2_0egcegclnxz237c.R.inc(19343);newSet.addAll(set1);
        __CLR4_2_0egcegclnxz237c.R.inc(19344);newSet.add("c3");
        
        __CLR4_2_0egcegclnxz237c.R.inc(19345);div.classNames(newSet);

        
        __CLR4_2_0egcegclnxz237c.R.inc(19346);assertEquals("c1 c2 c3", div.className());

        __CLR4_2_0egcegclnxz237c.R.inc(19347);final Set<String> set2 = div.classNames();
        __CLR4_2_0egcegclnxz237c.R.inc(19348);final Object[] arr2 = set2.toArray();
        __CLR4_2_0egcegclnxz237c.R.inc(19349);assertTrue(arr2.length==3);
        __CLR4_2_0egcegclnxz237c.R.inc(19350);assertEquals("c1", arr2[0]);
        __CLR4_2_0egcegclnxz237c.R.inc(19351);assertEquals("c2", arr2[1]);
        __CLR4_2_0egcegclnxz237c.R.inc(19352);assertEquals("c3", arr2[2]);
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test
    public void testHashAndEqualsAndValue() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0fyfns9exl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testHashAndEqualsAndValue",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19353,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0fyfns9exl(){try{__CLR4_2_0egcegclnxz237c.R.inc(19353);
        // .equals and hashcode are identity. value is content.

        __CLR4_2_0egcegclnxz237c.R.inc(19354);String doc1 = "<div id=1><p class=one>One</p><p class=one>One</p><p class=one>Two</p><p class=two>One</p></div>" +
                "<div id=2><p class=one>One</p><p class=one>One</p><p class=one>Two</p><p class=two>One</p></div>";

        __CLR4_2_0egcegclnxz237c.R.inc(19355);Document doc = Jsoup.parse(doc1);
        __CLR4_2_0egcegclnxz237c.R.inc(19356);Elements els = doc.select("p");

        /*
        for (Element el : els) {
            System.out.println(el.hashCode() + " - " + el.outerHtml());
        }

        0 1534787905 - <p class="one">One</p>
        1 1534787905 - <p class="one">One</p>
        2 1539683239 - <p class="one">Two</p>
        3 1535455211 - <p class="two">One</p>
        4 1534787905 - <p class="one">One</p>
        5 1534787905 - <p class="one">One</p>
        6 1539683239 - <p class="one">Two</p>
        7 1535455211 - <p class="two">One</p>
        */
        __CLR4_2_0egcegclnxz237c.R.inc(19357);assertEquals(8, els.size());
        __CLR4_2_0egcegclnxz237c.R.inc(19358);Element e0 = els.get(0);
        __CLR4_2_0egcegclnxz237c.R.inc(19359);Element e1 = els.get(1);
        __CLR4_2_0egcegclnxz237c.R.inc(19360);Element e2 = els.get(2);
        __CLR4_2_0egcegclnxz237c.R.inc(19361);Element e3 = els.get(3);
        __CLR4_2_0egcegclnxz237c.R.inc(19362);Element e4 = els.get(4);
        __CLR4_2_0egcegclnxz237c.R.inc(19363);Element e5 = els.get(5);
        __CLR4_2_0egcegclnxz237c.R.inc(19364);Element e6 = els.get(6);
        __CLR4_2_0egcegclnxz237c.R.inc(19365);Element e7 = els.get(7);

        __CLR4_2_0egcegclnxz237c.R.inc(19366);assertEquals(e0, e0);
        __CLR4_2_0egcegclnxz237c.R.inc(19367);assertTrue(e0.hasSameValue(e1));
        __CLR4_2_0egcegclnxz237c.R.inc(19368);assertTrue(e0.hasSameValue(e4));
        __CLR4_2_0egcegclnxz237c.R.inc(19369);assertTrue(e0.hasSameValue(e5));
        __CLR4_2_0egcegclnxz237c.R.inc(19370);assertFalse(e0.equals(e2));
        __CLR4_2_0egcegclnxz237c.R.inc(19371);assertFalse(e0.hasSameValue(e2));
        __CLR4_2_0egcegclnxz237c.R.inc(19372);assertFalse(e0.hasSameValue(e3));
        __CLR4_2_0egcegclnxz237c.R.inc(19373);assertFalse(e0.hasSameValue(e6));
        __CLR4_2_0egcegclnxz237c.R.inc(19374);assertFalse(e0.hasSameValue(e7));

        __CLR4_2_0egcegclnxz237c.R.inc(19375);assertEquals(e0.hashCode(), e0.hashCode());
        __CLR4_2_0egcegclnxz237c.R.inc(19376);assertFalse(e0.hashCode() == (e2.hashCode()));
        __CLR4_2_0egcegclnxz237c.R.inc(19377);assertFalse(e0.hashCode() == (e3).hashCode());
        __CLR4_2_0egcegclnxz237c.R.inc(19378);assertFalse(e0.hashCode() == (e6).hashCode());
        __CLR4_2_0egcegclnxz237c.R.inc(19379);assertFalse(e0.hashCode() == (e7).hashCode());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testRelativeUrls() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0a5pls9eyc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testRelativeUrls",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19380,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0a5pls9eyc(){try{__CLR4_2_0egcegclnxz237c.R.inc(19380);
        __CLR4_2_0egcegclnxz237c.R.inc(19381);String html = "<body><a href='./one.html'>One</a> <a href='two.html'>two</a> <a href='../three.html'>Three</a> <a href='//example2.com/four/'>Four</a> <a href='https://example2.com/five/'>Five</a>";
        __CLR4_2_0egcegclnxz237c.R.inc(19382);Document doc = Jsoup.parse(html, "http://example.com/bar/");
        __CLR4_2_0egcegclnxz237c.R.inc(19383);Elements els = doc.select("a");

        __CLR4_2_0egcegclnxz237c.R.inc(19384);assertEquals("http://example.com/bar/one.html", els.get(0).absUrl("href"));
        __CLR4_2_0egcegclnxz237c.R.inc(19385);assertEquals("http://example.com/bar/two.html", els.get(1).absUrl("href"));
        __CLR4_2_0egcegclnxz237c.R.inc(19386);assertEquals("http://example.com/three.html", els.get(2).absUrl("href"));
        __CLR4_2_0egcegclnxz237c.R.inc(19387);assertEquals("http://example2.com/four/", els.get(3).absUrl("href"));
        __CLR4_2_0egcegclnxz237c.R.inc(19388);assertEquals("https://example2.com/five/", els.get(4).absUrl("href"));
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test
    public void appendMustCorrectlyMoveChildrenInsideOneParentElement() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19389);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ji8ek3eyl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.appendMustCorrectlyMoveChildrenInsideOneParentElement",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19389,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ji8ek3eyl(){try{__CLR4_2_0egcegclnxz237c.R.inc(19389);
        __CLR4_2_0egcegclnxz237c.R.inc(19390);Document doc = new Document("");
        __CLR4_2_0egcegclnxz237c.R.inc(19391);Element body = doc.appendElement("body");
        __CLR4_2_0egcegclnxz237c.R.inc(19392);body.appendElement("div1");
        __CLR4_2_0egcegclnxz237c.R.inc(19393);body.appendElement("div2");
        __CLR4_2_0egcegclnxz237c.R.inc(19394);final Element div3 = body.appendElement("div3");
        __CLR4_2_0egcegclnxz237c.R.inc(19395);div3.text("Check");
        __CLR4_2_0egcegclnxz237c.R.inc(19396);final Element div4 = body.appendElement("div4");

        __CLR4_2_0egcegclnxz237c.R.inc(19397);ArrayList<Element> toMove = new ArrayList<>();
        __CLR4_2_0egcegclnxz237c.R.inc(19398);toMove.add(div3);
        __CLR4_2_0egcegclnxz237c.R.inc(19399);toMove.add(div4);

        __CLR4_2_0egcegclnxz237c.R.inc(19400);body.insertChildren(0, toMove);

        __CLR4_2_0egcegclnxz237c.R.inc(19401);String result = doc.toString().replaceAll("\\s+", "");
        __CLR4_2_0egcegclnxz237c.R.inc(19402);assertEquals("<body><div3>Check</div3><div4></div4><div1></div1><div2></div2></body>", result);
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test
    public void testHashcodeIsStableWithContentChanges() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19403);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ecixp3eyz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testHashcodeIsStableWithContentChanges",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19403,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ecixp3eyz(){try{__CLR4_2_0egcegclnxz237c.R.inc(19403);
        __CLR4_2_0egcegclnxz237c.R.inc(19404);Element root = new Element(Tag.valueOf("root"), "");

        __CLR4_2_0egcegclnxz237c.R.inc(19405);HashSet<Element> set = new HashSet<>();
        // Add root node:
        __CLR4_2_0egcegclnxz237c.R.inc(19406);set.add(root);

        __CLR4_2_0egcegclnxz237c.R.inc(19407);root.appendChild(new Element(Tag.valueOf("a"), ""));
        __CLR4_2_0egcegclnxz237c.R.inc(19408);assertTrue(set.contains(root));
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test
    public void testNamespacedElements() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0liw1btez5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testNamespacedElements",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19409,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0liw1btez5(){try{__CLR4_2_0egcegclnxz237c.R.inc(19409);
        // Namespaces with ns:tag in HTML must be translated to ns|tag in CSS.
        __CLR4_2_0egcegclnxz237c.R.inc(19410);String html = "<html><body><fb:comments /></body></html>";
        __CLR4_2_0egcegclnxz237c.R.inc(19411);Document doc = Jsoup.parse(html, "http://example.com/bar/");
        __CLR4_2_0egcegclnxz237c.R.inc(19412);Elements els = doc.select("fb|comments");
        __CLR4_2_0egcegclnxz237c.R.inc(19413);assertEquals(1, els.size());
        __CLR4_2_0egcegclnxz237c.R.inc(19414);assertEquals("html > body > fb|comments", els.get(0).cssSelector());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test
    public void testChainedRemoveAttributes() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0aueavkezb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testChainedRemoveAttributes",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19415,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0aueavkezb(){try{__CLR4_2_0egcegclnxz237c.R.inc(19415);
        __CLR4_2_0egcegclnxz237c.R.inc(19416);String html = "<a one two three four>Text</a>";
        __CLR4_2_0egcegclnxz237c.R.inc(19417);Document doc = Jsoup.parse(html);
        __CLR4_2_0egcegclnxz237c.R.inc(19418);Element a = doc.select("a").first();
        __CLR4_2_0egcegclnxz237c.R.inc(19419);a
            .removeAttr("zero")
            .removeAttr("one")
            .removeAttr("two")
            .removeAttr("three")
            .removeAttr("four")
            .removeAttr("five");
        __CLR4_2_0egcegclnxz237c.R.inc(19420);assertEquals("<a>Text</a>", a.outerHtml());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test
    public void testLoopedRemoveAttributes() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0nxty5lezh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testLoopedRemoveAttributes",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19421,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0nxty5lezh(){try{__CLR4_2_0egcegclnxz237c.R.inc(19421);
        __CLR4_2_0egcegclnxz237c.R.inc(19422);String html = "<a one two three four>Text</a><p foo>Two</p>";
        __CLR4_2_0egcegclnxz237c.R.inc(19423);Document doc = Jsoup.parse(html);
        __CLR4_2_0egcegclnxz237c.R.inc(19424);for (Element el : doc.getAllElements()) {{
            __CLR4_2_0egcegclnxz237c.R.inc(19425);el.clearAttributes();
        }

        }__CLR4_2_0egcegclnxz237c.R.inc(19426);assertEquals("<a>Text</a>\n<p>Two</p>", doc.body().html());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test
    public void testIs() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0x0dasdezn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testIs",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19427,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0x0dasdezn(){try{__CLR4_2_0egcegclnxz237c.R.inc(19427);
        __CLR4_2_0egcegclnxz237c.R.inc(19428);String html = "<div><p>One <a class=big>Two</a> Three</p><p>Another</p>";
        __CLR4_2_0egcegclnxz237c.R.inc(19429);Document doc = Jsoup.parse(html);
        __CLR4_2_0egcegclnxz237c.R.inc(19430);Element p = doc.select("p").first();

        __CLR4_2_0egcegclnxz237c.R.inc(19431);assertTrue(p.is("p"));
        __CLR4_2_0egcegclnxz237c.R.inc(19432);assertFalse(p.is("div"));
        __CLR4_2_0egcegclnxz237c.R.inc(19433);assertTrue(p.is("p:has(a)"));
        __CLR4_2_0egcegclnxz237c.R.inc(19434);assertTrue(p.is("p:first-child"));
        __CLR4_2_0egcegclnxz237c.R.inc(19435);assertFalse(p.is("p:last-child"));
        __CLR4_2_0egcegclnxz237c.R.inc(19436);assertTrue(p.is("*"));
        __CLR4_2_0egcegclnxz237c.R.inc(19437);assertTrue(p.is("div p"));

        __CLR4_2_0egcegclnxz237c.R.inc(19438);Element q = doc.select("p").last();
        __CLR4_2_0egcegclnxz237c.R.inc(19439);assertTrue(q.is("p"));
        __CLR4_2_0egcegclnxz237c.R.inc(19440);assertTrue(q.is("p ~ p"));
        __CLR4_2_0egcegclnxz237c.R.inc(19441);assertTrue(q.is("p + p"));
        __CLR4_2_0egcegclnxz237c.R.inc(19442);assertTrue(q.is("p:last-child"));
        __CLR4_2_0egcegclnxz237c.R.inc(19443);assertFalse(q.is("p a"));
        __CLR4_2_0egcegclnxz237c.R.inc(19444);assertFalse(q.is("a"));
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}


    @Test public void elementByTagName() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0qrrbrtf05();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.elementByTagName",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19445,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0qrrbrtf05(){try{__CLR4_2_0egcegclnxz237c.R.inc(19445);
        __CLR4_2_0egcegclnxz237c.R.inc(19446);Element a = new Element("P");
        __CLR4_2_0egcegclnxz237c.R.inc(19447);assertTrue(a.tagName().equals("P"));
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testChildrenElements() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19448);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_06lfze9f08();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testChildrenElements",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19448,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_06lfze9f08(){try{__CLR4_2_0egcegclnxz237c.R.inc(19448);
        __CLR4_2_0egcegclnxz237c.R.inc(19449);String html = "<div><p><a>One</a></p><p><a>Two</a></p>Three</div><span>Four</span><foo></foo><img>";
        __CLR4_2_0egcegclnxz237c.R.inc(19450);Document doc = Jsoup.parse(html);
        __CLR4_2_0egcegclnxz237c.R.inc(19451);Element div = doc.select("div").first();
        __CLR4_2_0egcegclnxz237c.R.inc(19452);Element p = doc.select("p").first();
        __CLR4_2_0egcegclnxz237c.R.inc(19453);Element span = doc.select("span").first();
        __CLR4_2_0egcegclnxz237c.R.inc(19454);Element foo = doc.select("foo").first();
        __CLR4_2_0egcegclnxz237c.R.inc(19455);Element img = doc.select("img").first();

        __CLR4_2_0egcegclnxz237c.R.inc(19456);Elements docChildren = div.children();
        __CLR4_2_0egcegclnxz237c.R.inc(19457);assertEquals(2, docChildren.size());
        __CLR4_2_0egcegclnxz237c.R.inc(19458);assertEquals("<p><a>One</a></p>", docChildren.get(0).outerHtml());
        __CLR4_2_0egcegclnxz237c.R.inc(19459);assertEquals("<p><a>Two</a></p>", docChildren.get(1).outerHtml());
        __CLR4_2_0egcegclnxz237c.R.inc(19460);assertEquals(3, div.childNodes().size());
        __CLR4_2_0egcegclnxz237c.R.inc(19461);assertEquals("Three", div.childNodes().get(2).outerHtml());

        __CLR4_2_0egcegclnxz237c.R.inc(19462);assertEquals(1, p.children().size());
        __CLR4_2_0egcegclnxz237c.R.inc(19463);assertEquals("One", p.children().text());

        __CLR4_2_0egcegclnxz237c.R.inc(19464);assertEquals(0, span.children().size());
        __CLR4_2_0egcegclnxz237c.R.inc(19465);assertEquals(1, span.childNodes().size());
        __CLR4_2_0egcegclnxz237c.R.inc(19466);assertEquals("Four", span.childNodes().get(0).outerHtml());

        __CLR4_2_0egcegclnxz237c.R.inc(19467);assertEquals(0, foo.children().size());
        __CLR4_2_0egcegclnxz237c.R.inc(19468);assertEquals(0, foo.childNodes().size());
        __CLR4_2_0egcegclnxz237c.R.inc(19469);assertEquals(0, img.children().size());
        __CLR4_2_0egcegclnxz237c.R.inc(19470);assertEquals(0, img.childNodes().size());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testShadowElementsAreUpdated() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0eodo6hf0v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testShadowElementsAreUpdated",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19471,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0eodo6hf0v(){try{__CLR4_2_0egcegclnxz237c.R.inc(19471);
        __CLR4_2_0egcegclnxz237c.R.inc(19472);String html = "<div><p><a>One</a></p><p><a>Two</a></p>Three</div><span>Four</span><foo></foo><img>";
        __CLR4_2_0egcegclnxz237c.R.inc(19473);Document doc = Jsoup.parse(html);
        __CLR4_2_0egcegclnxz237c.R.inc(19474);Element div = doc.select("div").first();
        __CLR4_2_0egcegclnxz237c.R.inc(19475);Elements els = div.children();
        __CLR4_2_0egcegclnxz237c.R.inc(19476);List<Node> nodes = div.childNodes();

        __CLR4_2_0egcegclnxz237c.R.inc(19477);assertEquals(2, els.size()); // the two Ps
        __CLR4_2_0egcegclnxz237c.R.inc(19478);assertEquals(3, nodes.size()); // the "Three" textnode

        __CLR4_2_0egcegclnxz237c.R.inc(19479);Element p3 = new Element("p").text("P3");
        __CLR4_2_0egcegclnxz237c.R.inc(19480);Element p4 = new Element("p").text("P4");
        __CLR4_2_0egcegclnxz237c.R.inc(19481);div.insertChildren(1, p3);
        __CLR4_2_0egcegclnxz237c.R.inc(19482);div.insertChildren(3, p4);
        __CLR4_2_0egcegclnxz237c.R.inc(19483);Elements els2 = div.children();

        // first els should not have changed
        __CLR4_2_0egcegclnxz237c.R.inc(19484);assertEquals(2, els.size());
        __CLR4_2_0egcegclnxz237c.R.inc(19485);assertEquals(4, els2.size());

        __CLR4_2_0egcegclnxz237c.R.inc(19486);assertEquals("<p><a>One</a></p>\n" +
            "<p>P3</p>\n" +
            "<p><a>Two</a></p>\n" +
            "<p>P4</p>Three", div.html());
        __CLR4_2_0egcegclnxz237c.R.inc(19487);assertEquals("P3", els2.get(1).text());
        __CLR4_2_0egcegclnxz237c.R.inc(19488);assertEquals("P4", els2.get(3).text());

        __CLR4_2_0egcegclnxz237c.R.inc(19489);p3.after("<span>Another</span");

        __CLR4_2_0egcegclnxz237c.R.inc(19490);Elements els3 = div.children();
        __CLR4_2_0egcegclnxz237c.R.inc(19491);assertEquals(5, els3.size());
        __CLR4_2_0egcegclnxz237c.R.inc(19492);assertEquals("span", els3.get(2).tagName());
        __CLR4_2_0egcegclnxz237c.R.inc(19493);assertEquals("Another", els3.get(2).text());

        __CLR4_2_0egcegclnxz237c.R.inc(19494);assertEquals("<p><a>One</a></p>\n" +
            "<p>P3</p>\n" +
            "<span>Another</span>\n" +
            "<p><a>Two</a></p>\n" +
            "<p>P4</p>Three", div.html());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void classNamesAndAttributeNameIsCaseInsensitive() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0w75vyaf1j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.classNamesAndAttributeNameIsCaseInsensitive",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19495,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0w75vyaf1j(){try{__CLR4_2_0egcegclnxz237c.R.inc(19495);
        __CLR4_2_0egcegclnxz237c.R.inc(19496);String html = "<p Class='SomeText AnotherText'>One</p>";
        __CLR4_2_0egcegclnxz237c.R.inc(19497);Document doc = Jsoup.parse(html);
        __CLR4_2_0egcegclnxz237c.R.inc(19498);Element p = doc.select("p").first();
        __CLR4_2_0egcegclnxz237c.R.inc(19499);assertEquals("SomeText AnotherText", p.className());
        __CLR4_2_0egcegclnxz237c.R.inc(19500);assertTrue(p.classNames().contains("SomeText"));
        __CLR4_2_0egcegclnxz237c.R.inc(19501);assertTrue(p.classNames().contains("AnotherText"));
        __CLR4_2_0egcegclnxz237c.R.inc(19502);assertTrue(p.hasClass("SomeText"));
        __CLR4_2_0egcegclnxz237c.R.inc(19503);assertTrue(p.hasClass("sometext"));
        __CLR4_2_0egcegclnxz237c.R.inc(19504);assertTrue(p.hasClass("AnotherText"));
        __CLR4_2_0egcegclnxz237c.R.inc(19505);assertTrue(p.hasClass("anothertext"));

        __CLR4_2_0egcegclnxz237c.R.inc(19506);Element p1 = doc.select(".SomeText").first();
        __CLR4_2_0egcegclnxz237c.R.inc(19507);Element p2 = doc.select(".sometext").first();
        __CLR4_2_0egcegclnxz237c.R.inc(19508);Element p3 = doc.select("[class=SomeText AnotherText]").first();
        __CLR4_2_0egcegclnxz237c.R.inc(19509);Element p4 = doc.select("[Class=SomeText AnotherText]").first();
        __CLR4_2_0egcegclnxz237c.R.inc(19510);Element p5 = doc.select("[class=sometext anothertext]").first();
        __CLR4_2_0egcegclnxz237c.R.inc(19511);Element p6 = doc.select("[class=SomeText AnotherText]").first();
        __CLR4_2_0egcegclnxz237c.R.inc(19512);Element p7 = doc.select("[class^=sometext]").first();
        __CLR4_2_0egcegclnxz237c.R.inc(19513);Element p8 = doc.select("[class$=nothertext]").first();
        __CLR4_2_0egcegclnxz237c.R.inc(19514);Element p9 = doc.select("[class^=sometext]").first();
        __CLR4_2_0egcegclnxz237c.R.inc(19515);Element p10 = doc.select("[class$=AnotherText]").first();

        __CLR4_2_0egcegclnxz237c.R.inc(19516);assertEquals("One", p1.text());
        __CLR4_2_0egcegclnxz237c.R.inc(19517);assertEquals(p1, p2);
        __CLR4_2_0egcegclnxz237c.R.inc(19518);assertEquals(p1, p3);
        __CLR4_2_0egcegclnxz237c.R.inc(19519);assertEquals(p1, p4);
        __CLR4_2_0egcegclnxz237c.R.inc(19520);assertEquals(p1, p5);
        __CLR4_2_0egcegclnxz237c.R.inc(19521);assertEquals(p1, p6);
        __CLR4_2_0egcegclnxz237c.R.inc(19522);assertEquals(p1, p7);
        __CLR4_2_0egcegclnxz237c.R.inc(19523);assertEquals(p1, p8);
        __CLR4_2_0egcegclnxz237c.R.inc(19524);assertEquals(p1, p9);
        __CLR4_2_0egcegclnxz237c.R.inc(19525);assertEquals(p1, p10);
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

	@Test
	public void testAppendTo() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0fwfv76f2e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testAppendTo",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19526,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0fwfv76f2e(){try{__CLR4_2_0egcegclnxz237c.R.inc(19526);
		__CLR4_2_0egcegclnxz237c.R.inc(19527);String parentHtml = "<div class='a'></div>";
		__CLR4_2_0egcegclnxz237c.R.inc(19528);String childHtml = "<div class='b'></div><p>Two</p>";

		__CLR4_2_0egcegclnxz237c.R.inc(19529);Document parentDoc = Jsoup.parse(parentHtml);
		__CLR4_2_0egcegclnxz237c.R.inc(19530);Element parent = parentDoc.body();
        __CLR4_2_0egcegclnxz237c.R.inc(19531);Document childDoc = Jsoup.parse(childHtml);

        __CLR4_2_0egcegclnxz237c.R.inc(19532);Element div = childDoc.select("div").first();
        __CLR4_2_0egcegclnxz237c.R.inc(19533);Element p = childDoc.select("p").first();
        __CLR4_2_0egcegclnxz237c.R.inc(19534);Element appendTo1 = div.appendTo(parent);
        __CLR4_2_0egcegclnxz237c.R.inc(19535);assertEquals(div, appendTo1);

        __CLR4_2_0egcegclnxz237c.R.inc(19536);Element appendTo2 = p.appendTo(div);
        __CLR4_2_0egcegclnxz237c.R.inc(19537);assertEquals(p, appendTo2);

        __CLR4_2_0egcegclnxz237c.R.inc(19538);assertEquals("<div class=\"a\"></div>\n<div class=\"b\">\n <p>Two</p>\n</div>", parentDoc.body().html());
        __CLR4_2_0egcegclnxz237c.R.inc(19539);assertEquals("", childDoc.body().html()); // got moved out
	}finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

	@Test public void testNormalizesNbspInText() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0bmo3hef2s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testNormalizesNbspInText",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19540,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0bmo3hef2s(){try{__CLR4_2_0egcegclnxz237c.R.inc(19540);
        __CLR4_2_0egcegclnxz237c.R.inc(19541);String escaped = "You can't always get what you&nbsp;want.";
        __CLR4_2_0egcegclnxz237c.R.inc(19542);String withNbsp = "You can't always get what you\u00a0want."; // there is an nbsp char in there
        __CLR4_2_0egcegclnxz237c.R.inc(19543);Document doc = Jsoup.parse("<p>" + escaped);
        __CLR4_2_0egcegclnxz237c.R.inc(19544);Element p = doc.select("p").first();
        __CLR4_2_0egcegclnxz237c.R.inc(19545);assertEquals("You can't always get what you want.", p.text()); // text is normalized

        __CLR4_2_0egcegclnxz237c.R.inc(19546);assertEquals("<p>" + escaped + "</p>", p.outerHtml()); // html / whole text keeps &nbsp;
        __CLR4_2_0egcegclnxz237c.R.inc(19547);assertEquals(withNbsp, p.textNodes().get(0).getWholeText());
        __CLR4_2_0egcegclnxz237c.R.inc(19548);assertEquals(160, withNbsp.charAt(29));

        __CLR4_2_0egcegclnxz237c.R.inc(19549);Element matched = doc.select("p:contains(get what you want)").first();
        __CLR4_2_0egcegclnxz237c.R.inc(19550);assertEquals("p", matched.nodeName());
        __CLR4_2_0egcegclnxz237c.R.inc(19551);assertTrue(matched.is(":containsOwn(get what you want)"));
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test public void testNormalizesInvisiblesInText() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ln6oh5f34();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testNormalizesInvisiblesInText",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19552,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ln6oh5f34(){try{__CLR4_2_0egcegclnxz237c.R.inc(19552);
        // return Character.getType(c) == 16 && (c == 8203 || c == 8204 || c == 8205 || c == 173);
        __CLR4_2_0egcegclnxz237c.R.inc(19553);String escaped = "This&shy;is&#x200b;one&#x200c;long&#x200d;word";
        __CLR4_2_0egcegclnxz237c.R.inc(19554);String decoded = "This\u00adis\u200bone\u200clong\u200dword"; // browser would not display those soft hyphens / other chars, so we don't want them in the text

        __CLR4_2_0egcegclnxz237c.R.inc(19555);Document doc = Jsoup.parse("<p>" + escaped);
        __CLR4_2_0egcegclnxz237c.R.inc(19556);Element p = doc.select("p").first();
        __CLR4_2_0egcegclnxz237c.R.inc(19557);doc.outputSettings().charset("ascii"); // so that the outer html is easier to see with escaped invisibles
        __CLR4_2_0egcegclnxz237c.R.inc(19558);assertEquals("Thisisonelongword", p.text()); // text is normalized
        __CLR4_2_0egcegclnxz237c.R.inc(19559);assertEquals("<p>" + escaped + "</p>", p.outerHtml()); // html / whole text keeps &shy etc;
        __CLR4_2_0egcegclnxz237c.R.inc(19560);assertEquals(decoded, p.textNodes().get(0).getWholeText());

        __CLR4_2_0egcegclnxz237c.R.inc(19561);Element matched = doc.select("p:contains(Thisisonelongword)").first(); // really just oneloneword, no invisibles
        __CLR4_2_0egcegclnxz237c.R.inc(19562);assertEquals("p", matched.nodeName());
        __CLR4_2_0egcegclnxz237c.R.inc(19563);assertTrue(matched.is(":containsOwn(Thisisonelongword)"));

    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}
	
	@Test
	public void testRemoveBeforeIndex() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_02mh8rof3g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testRemoveBeforeIndex",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19564,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_02mh8rof3g(){try{__CLR4_2_0egcegclnxz237c.R.inc(19564);
		__CLR4_2_0egcegclnxz237c.R.inc(19565);Document doc = Jsoup.parse(
	            "<html><body><div><p>before1</p><p>before2</p><p>XXX</p><p>after1</p><p>after2</p></div></body></html>",
	            "");
	    __CLR4_2_0egcegclnxz237c.R.inc(19566);Element body = doc.select("body").first();
	    __CLR4_2_0egcegclnxz237c.R.inc(19567);Elements elems = body.select("p:matchesOwn(XXX)");
	    __CLR4_2_0egcegclnxz237c.R.inc(19568);Element xElem = elems.first();
	    __CLR4_2_0egcegclnxz237c.R.inc(19569);Elements beforeX = xElem.parent().getElementsByIndexLessThan(xElem.elementSiblingIndex());

	    __CLR4_2_0egcegclnxz237c.R.inc(19570);for(Element p : beforeX) {{
	        __CLR4_2_0egcegclnxz237c.R.inc(19571);p.remove();
	    }

	    }__CLR4_2_0egcegclnxz237c.R.inc(19572);assertEquals("<body><div><p>XXX</p><p>after1</p><p>after2</p></div></body>", TextUtil.stripNewlines(body.outerHtml()));
	}finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}
	
	@Test
	public void testRemoveAfterIndex() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0hz82odf3p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testRemoveAfterIndex",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19573,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0hz82odf3p(){try{__CLR4_2_0egcegclnxz237c.R.inc(19573);
		 __CLR4_2_0egcegclnxz237c.R.inc(19574);Document doc2 = Jsoup.parse(
		            "<html><body><div><p>before1</p><p>before2</p><p>XXX</p><p>after1</p><p>after2</p></div></body></html>",
		            "");
	    __CLR4_2_0egcegclnxz237c.R.inc(19575);Element body = doc2.select("body").first();
	    __CLR4_2_0egcegclnxz237c.R.inc(19576);Elements elems = body.select("p:matchesOwn(XXX)");
	    __CLR4_2_0egcegclnxz237c.R.inc(19577);Element xElem = elems.first();
	    __CLR4_2_0egcegclnxz237c.R.inc(19578);Elements afterX = xElem.parent().getElementsByIndexGreaterThan(xElem.elementSiblingIndex());

	    __CLR4_2_0egcegclnxz237c.R.inc(19579);for(Element p : afterX) {{
	        __CLR4_2_0egcegclnxz237c.R.inc(19580);p.remove();
	    }

	    }__CLR4_2_0egcegclnxz237c.R.inc(19581);assertEquals("<body><div><p>before1</p><p>before2</p><p>XXX</p></div></body>", TextUtil.stripNewlines(body.outerHtml()));
	}finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}
	
    @Test 
    public void whiteSpaceClassElement(){__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0jfrngof3y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.whiteSpaceClassElement",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19582,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0jfrngof3y(){try{__CLR4_2_0egcegclnxz237c.R.inc(19582);
	    __CLR4_2_0egcegclnxz237c.R.inc(19583);Tag tag = Tag.valueOf("a");
	    __CLR4_2_0egcegclnxz237c.R.inc(19584);Attributes attribs = new Attributes();
	    __CLR4_2_0egcegclnxz237c.R.inc(19585);Element el = new Element(tag, "", attribs);
	    
	    __CLR4_2_0egcegclnxz237c.R.inc(19586);attribs.put("class", "abc ");
	    __CLR4_2_0egcegclnxz237c.R.inc(19587);boolean hasClass = el.hasClass("ab");
	    __CLR4_2_0egcegclnxz237c.R.inc(19588);assertFalse(hasClass);
	}finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

	@Test
    public void testNextElementSiblingAfterClone() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19589);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0rmjeibf45();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testNextElementSiblingAfterClone",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19589,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0rmjeibf45(){try{__CLR4_2_0egcegclnxz237c.R.inc(19589);
        // via https://github.com/jhy/jsoup/issues/951
        __CLR4_2_0egcegclnxz237c.R.inc(19590);String html = "<!DOCTYPE html><html lang=\"en\"><head></head><body><div>Initial element</div></body></html>";
        __CLR4_2_0egcegclnxz237c.R.inc(19591);String expectedText = "New element";
        __CLR4_2_0egcegclnxz237c.R.inc(19592);String cloneExpect = "New element in clone";

        __CLR4_2_0egcegclnxz237c.R.inc(19593);Document original = Jsoup.parse(html);
        __CLR4_2_0egcegclnxz237c.R.inc(19594);Document clone = original.clone();

        __CLR4_2_0egcegclnxz237c.R.inc(19595);Element originalElement = original.body().child(0);
        __CLR4_2_0egcegclnxz237c.R.inc(19596);originalElement.after("<div>" + expectedText + "</div>");
        __CLR4_2_0egcegclnxz237c.R.inc(19597);Element originalNextElementSibling = originalElement.nextElementSibling();
        __CLR4_2_0egcegclnxz237c.R.inc(19598);Element originalNextSibling = (Element) originalElement.nextSibling();
        __CLR4_2_0egcegclnxz237c.R.inc(19599);assertEquals(expectedText, originalNextElementSibling.text());
        __CLR4_2_0egcegclnxz237c.R.inc(19600);assertEquals(expectedText, originalNextSibling.text());

        __CLR4_2_0egcegclnxz237c.R.inc(19601);Element cloneElement = clone.body().child(0);
        __CLR4_2_0egcegclnxz237c.R.inc(19602);cloneElement.after("<div>" + cloneExpect + "</div>");
        __CLR4_2_0egcegclnxz237c.R.inc(19603);Element cloneNextElementSibling = cloneElement.nextElementSibling();
        __CLR4_2_0egcegclnxz237c.R.inc(19604);Element cloneNextSibling = (Element) cloneElement.nextSibling();
        __CLR4_2_0egcegclnxz237c.R.inc(19605);assertEquals(cloneExpect, cloneNextElementSibling.text());
        __CLR4_2_0egcegclnxz237c.R.inc(19606);assertEquals(cloneExpect, cloneNextSibling.text());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test
    public void testRemovingEmptyClassAttributeWhenLastClassRemoved() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_09e3oe5f4n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testRemovingEmptyClassAttributeWhenLastClassRemoved",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19607,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_09e3oe5f4n(){try{__CLR4_2_0egcegclnxz237c.R.inc(19607);
        // https://github.com/jhy/jsoup/issues/947
        __CLR4_2_0egcegclnxz237c.R.inc(19608);Document doc = Jsoup.parse("<img class=\"one two\" />");
        __CLR4_2_0egcegclnxz237c.R.inc(19609);Element img = doc.select("img").first();
        __CLR4_2_0egcegclnxz237c.R.inc(19610);img.removeClass("one");
        __CLR4_2_0egcegclnxz237c.R.inc(19611);img.removeClass("two");
        __CLR4_2_0egcegclnxz237c.R.inc(19612);assertFalse(doc.body().html().contains("class=\"\""));
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test
    public void booleanAttributeOutput() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19613);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0bapalgf4t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.booleanAttributeOutput",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19613,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0bapalgf4t(){try{__CLR4_2_0egcegclnxz237c.R.inc(19613);
        __CLR4_2_0egcegclnxz237c.R.inc(19614);Document doc = Jsoup.parse("<img src=foo noshade='' nohref async=async autofocus=false>");
        __CLR4_2_0egcegclnxz237c.R.inc(19615);Element img = doc.selectFirst("img");

        __CLR4_2_0egcegclnxz237c.R.inc(19616);assertEquals("<img src=\"foo\" noshade nohref async autofocus=\"false\">", img.outerHtml());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test
    public void textHasSpaceAfterBlockTags() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0581l9mf4x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.textHasSpaceAfterBlockTags",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19617,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0581l9mf4x(){try{__CLR4_2_0egcegclnxz237c.R.inc(19617);
        __CLR4_2_0egcegclnxz237c.R.inc(19618);Document doc = Jsoup.parse("<div>One</div>Two");
        __CLR4_2_0egcegclnxz237c.R.inc(19619);assertEquals("One Two", doc.text());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test
    public void textHasSpaceBetweenDivAndCenterTags() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19620);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0hbzq5mf50();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.textHasSpaceBetweenDivAndCenterTags",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19620,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0hbzq5mf50(){try{__CLR4_2_0egcegclnxz237c.R.inc(19620);
        __CLR4_2_0egcegclnxz237c.R.inc(19621);Document doc = Jsoup.parse("<div>One</div><div>Two</div><center>Three</center><center>Four</center>");
        __CLR4_2_0egcegclnxz237c.R.inc(19622);assertEquals("One Two Three Four", doc.text());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test
    public void testNextElementSiblings() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0c0r9xtf53();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testNextElementSiblings",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19623,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0c0r9xtf53(){try{__CLR4_2_0egcegclnxz237c.R.inc(19623);
        __CLR4_2_0egcegclnxz237c.R.inc(19624);Document doc = Jsoup.parse("<ul id='ul'>" +
            "<li id='a'>a</li>" +
            "<li id='b'>b</li>" +
            "<li id='c'>c</li>" +
            "</ul> Not An Element but a node" +
            "<div id='div'>" +
            "<li id='d'>d</li>" +
            "</div>");

        __CLR4_2_0egcegclnxz237c.R.inc(19625);Element element = doc.getElementById("a");
        __CLR4_2_0egcegclnxz237c.R.inc(19626);Elements elementSiblings = element.nextElementSiblings();
        __CLR4_2_0egcegclnxz237c.R.inc(19627);assertNotNull(elementSiblings);
        __CLR4_2_0egcegclnxz237c.R.inc(19628);assertEquals(2, elementSiblings.size());
        __CLR4_2_0egcegclnxz237c.R.inc(19629);assertEquals("b", elementSiblings.get(0).id());
        __CLR4_2_0egcegclnxz237c.R.inc(19630);assertEquals("c", elementSiblings.get(1).id());

        __CLR4_2_0egcegclnxz237c.R.inc(19631);Element element1 = doc.getElementById("b");
        __CLR4_2_0egcegclnxz237c.R.inc(19632);List<Element> elementSiblings1 = element1.nextElementSiblings();
        __CLR4_2_0egcegclnxz237c.R.inc(19633);assertNotNull(elementSiblings1);
        __CLR4_2_0egcegclnxz237c.R.inc(19634);assertEquals(1, elementSiblings1.size());
        __CLR4_2_0egcegclnxz237c.R.inc(19635);assertEquals("c", elementSiblings1.get(0).id());

        __CLR4_2_0egcegclnxz237c.R.inc(19636);Element element2 = doc.getElementById("c");
        __CLR4_2_0egcegclnxz237c.R.inc(19637);List<Element> elementSiblings2 = element2.nextElementSiblings();
        __CLR4_2_0egcegclnxz237c.R.inc(19638);assertEquals(0, elementSiblings2.size());

        __CLR4_2_0egcegclnxz237c.R.inc(19639);Element ul = doc.getElementById("ul");
        __CLR4_2_0egcegclnxz237c.R.inc(19640);List<Element> elementSiblings3 = ul.nextElementSiblings();
        __CLR4_2_0egcegclnxz237c.R.inc(19641);assertNotNull(elementSiblings3);
        __CLR4_2_0egcegclnxz237c.R.inc(19642);assertEquals(1, elementSiblings3.size());
        __CLR4_2_0egcegclnxz237c.R.inc(19643);assertEquals("div", elementSiblings3.get(0).id());

        __CLR4_2_0egcegclnxz237c.R.inc(19644);Element div = doc.getElementById("div");
        __CLR4_2_0egcegclnxz237c.R.inc(19645);List<Element> elementSiblings4 = div.nextElementSiblings();
        __CLR4_2_0egcegclnxz237c.R.inc(19646);assertEquals(0, elementSiblings4.size());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test
    public void testPreviousElementSiblings() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0dxh7o5f5r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testPreviousElementSiblings",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19647,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0dxh7o5f5r(){try{__CLR4_2_0egcegclnxz237c.R.inc(19647);
        __CLR4_2_0egcegclnxz237c.R.inc(19648);Document doc = Jsoup.parse("<ul id='ul'>" +
            "<li id='a'>a</li>" +
            "<li id='b'>b</li>" +
            "<li id='c'>c</li>" +
            "</ul>" +
            "<div id='div'>" +
            "<li id='d'>d</li>" +
            "</div>");

        __CLR4_2_0egcegclnxz237c.R.inc(19649);Element element = doc.getElementById("b");
        __CLR4_2_0egcegclnxz237c.R.inc(19650);Elements elementSiblings = element.previousElementSiblings();
        __CLR4_2_0egcegclnxz237c.R.inc(19651);assertNotNull(elementSiblings);
        __CLR4_2_0egcegclnxz237c.R.inc(19652);assertEquals(1, elementSiblings.size());
        __CLR4_2_0egcegclnxz237c.R.inc(19653);assertEquals("a", elementSiblings.get(0).id());

        __CLR4_2_0egcegclnxz237c.R.inc(19654);Element element1 = doc.getElementById("a");
        __CLR4_2_0egcegclnxz237c.R.inc(19655);List<Element> elementSiblings1 = element1.previousElementSiblings();
        __CLR4_2_0egcegclnxz237c.R.inc(19656);assertEquals(0, elementSiblings1.size());

        __CLR4_2_0egcegclnxz237c.R.inc(19657);Element element2 = doc.getElementById("c");
        __CLR4_2_0egcegclnxz237c.R.inc(19658);List<Element> elementSiblings2 = element2.previousElementSiblings();
        __CLR4_2_0egcegclnxz237c.R.inc(19659);assertNotNull(elementSiblings2);
        __CLR4_2_0egcegclnxz237c.R.inc(19660);assertEquals(2, elementSiblings2.size());
        __CLR4_2_0egcegclnxz237c.R.inc(19661);assertEquals("b", elementSiblings2.get(0).id());
        __CLR4_2_0egcegclnxz237c.R.inc(19662);assertEquals("a", elementSiblings2.get(1).id());

        __CLR4_2_0egcegclnxz237c.R.inc(19663);Element ul = doc.getElementById("ul");
        __CLR4_2_0egcegclnxz237c.R.inc(19664);List<Element> elementSiblings3 = ul.previousElementSiblings();
        __CLR4_2_0egcegclnxz237c.R.inc(19665);assertEquals(0, elementSiblings3.size());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test
    public void testClearAttributes() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_07nps2vf6a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testClearAttributes",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19666,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_07nps2vf6a(){try{__CLR4_2_0egcegclnxz237c.R.inc(19666);
        __CLR4_2_0egcegclnxz237c.R.inc(19667);Element el = new Element("a").attr("href", "http://example.com").text("Hello");
        __CLR4_2_0egcegclnxz237c.R.inc(19668);assertEquals("<a href=\"http://example.com\">Hello</a>", el.outerHtml());
        __CLR4_2_0egcegclnxz237c.R.inc(19669);Element el2 = el.clearAttributes(); // really just force testing the return type is Element
        __CLR4_2_0egcegclnxz237c.R.inc(19670);assertSame(el, el2);
        __CLR4_2_0egcegclnxz237c.R.inc(19671);assertEquals("<a>Hello</a>", el2.outerHtml());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test
    public void testRemoveAttr() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0xil4q6f6g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testRemoveAttr",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19672,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0xil4q6f6g(){try{__CLR4_2_0egcegclnxz237c.R.inc(19672);
        __CLR4_2_0egcegclnxz237c.R.inc(19673);Element el = new Element("a")
            .attr("href", "http://example.com")
            .attr("id", "1")
            .text("Hello");
        __CLR4_2_0egcegclnxz237c.R.inc(19674);assertEquals("<a href=\"http://example.com\" id=\"1\">Hello</a>", el.outerHtml());
        __CLR4_2_0egcegclnxz237c.R.inc(19675);Element el2 = el.removeAttr("href"); // really just force testing the return type is Element
        __CLR4_2_0egcegclnxz237c.R.inc(19676);assertSame(el, el2);
        __CLR4_2_0egcegclnxz237c.R.inc(19677);assertEquals("<a id=\"1\">Hello</a>", el2.outerHtml());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test
    public void testRoot() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_03qvzj9f6m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testRoot",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19678,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_03qvzj9f6m(){try{__CLR4_2_0egcegclnxz237c.R.inc(19678);
        __CLR4_2_0egcegclnxz237c.R.inc(19679);Element el = new Element("a");
        __CLR4_2_0egcegclnxz237c.R.inc(19680);el.append("<span>Hello</span>");
        __CLR4_2_0egcegclnxz237c.R.inc(19681);assertEquals("<a><span>Hello</span></a>", el.outerHtml());
        __CLR4_2_0egcegclnxz237c.R.inc(19682);Element span = el.selectFirst("span");
        __CLR4_2_0egcegclnxz237c.R.inc(19683);assertNotNull(span);
        __CLR4_2_0egcegclnxz237c.R.inc(19684);Element el2 = span.root();
        __CLR4_2_0egcegclnxz237c.R.inc(19685);assertSame(el, el2);

        __CLR4_2_0egcegclnxz237c.R.inc(19686);Document doc = Jsoup.parse("<div><p>One<p>Two<p>Three");
        __CLR4_2_0egcegclnxz237c.R.inc(19687);Element div = doc.selectFirst("div");
        __CLR4_2_0egcegclnxz237c.R.inc(19688);assertSame(doc, div.root());
        __CLR4_2_0egcegclnxz237c.R.inc(19689);assertSame(doc, div.ownerDocument());
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test
    public void testTraverse() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0gby3o5f6y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testTraverse",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19690,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0gby3o5f6y(){try{__CLR4_2_0egcegclnxz237c.R.inc(19690);
        __CLR4_2_0egcegclnxz237c.R.inc(19691);Document doc = Jsoup.parse("<div><p>One<p>Two<p>Three");
        __CLR4_2_0egcegclnxz237c.R.inc(19692);Element div = doc.selectFirst("div");
        __CLR4_2_0egcegclnxz237c.R.inc(19693);final AtomicInteger counter = new AtomicInteger(0);

        __CLR4_2_0egcegclnxz237c.R.inc(19694);Element div2 = div.traverse(new NodeVisitor() {

            @Override
            public void head(Node node, int depth) {try{__CLR4_2_0egcegclnxz237c.R.inc(19695);
                __CLR4_2_0egcegclnxz237c.R.inc(19696);counter.incrementAndGet();
            }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

            @Override
            public void tail(Node node, int depth) {try{__CLR4_2_0egcegclnxz237c.R.inc(19697);

            }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}
        });

        __CLR4_2_0egcegclnxz237c.R.inc(19698);assertEquals(7, counter.get());
        __CLR4_2_0egcegclnxz237c.R.inc(19699);assertEquals(div2, div);
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

    @Test
    public void voidTestFilterCallReturnsElement() {__CLR4_2_0egcegclnxz237c.R.globalSliceStart(getClass().getName(),19700);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0v57zksf78();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0egcegclnxz237c.R.rethrow($CLV_t2$);}finally{__CLR4_2_0egcegclnxz237c.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.voidTestFilterCallReturnsElement",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19700,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0v57zksf78(){try{__CLR4_2_0egcegclnxz237c.R.inc(19700);
        // doesn't actually test the filter so much as the return type for Element. See node.nodeFilter for an acutal test
        __CLR4_2_0egcegclnxz237c.R.inc(19701);Document doc = Jsoup.parse("<div><p>One<p>Two<p>Three");
        __CLR4_2_0egcegclnxz237c.R.inc(19702);Element div = doc.selectFirst("div");
        __CLR4_2_0egcegclnxz237c.R.inc(19703);Element div2 = div.filter(new NodeFilter() {
            @Override
            public FilterResult head(Node node, int depth) {try{__CLR4_2_0egcegclnxz237c.R.inc(19704);
                __CLR4_2_0egcegclnxz237c.R.inc(19705);return FilterResult.CONTINUE;
            }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}

            @Override
            public FilterResult tail(Node node, int depth) {try{__CLR4_2_0egcegclnxz237c.R.inc(19706);
                __CLR4_2_0egcegclnxz237c.R.inc(19707);return FilterResult.CONTINUE;
            }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}
        });

        __CLR4_2_0egcegclnxz237c.R.inc(19708);assertSame(div, div2);
    }finally{__CLR4_2_0egcegclnxz237c.R.flushNeeded();}}
}
