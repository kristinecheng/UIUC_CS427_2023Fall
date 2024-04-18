/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 Test TextNodes

 @author Jonathan Hedley, jonathan@hedley.net */
public class TextNodeTest {static class __CLR4_2_0fimfimlnxz237z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767707166L,8589935092L,20162,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test public void testBlank() {__CLR4_2_0fimfimlnxz237z.R.globalSliceStart(getClass().getName(),20110);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0s7z6qxfim();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fimfimlnxz237z.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fimfimlnxz237z.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.TextNodeTest.testBlank",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20110,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0s7z6qxfim(){try{__CLR4_2_0fimfimlnxz237z.R.inc(20110);
        __CLR4_2_0fimfimlnxz237z.R.inc(20111);TextNode one = new TextNode("");
        __CLR4_2_0fimfimlnxz237z.R.inc(20112);TextNode two = new TextNode("     ");
        __CLR4_2_0fimfimlnxz237z.R.inc(20113);TextNode three = new TextNode("  \n\n   ");
        __CLR4_2_0fimfimlnxz237z.R.inc(20114);TextNode four = new TextNode("Hello");
        __CLR4_2_0fimfimlnxz237z.R.inc(20115);TextNode five = new TextNode("  \nHello ");

        __CLR4_2_0fimfimlnxz237z.R.inc(20116);assertTrue(one.isBlank());
        __CLR4_2_0fimfimlnxz237z.R.inc(20117);assertTrue(two.isBlank());
        __CLR4_2_0fimfimlnxz237z.R.inc(20118);assertTrue(three.isBlank());
        __CLR4_2_0fimfimlnxz237z.R.inc(20119);assertFalse(four.isBlank());
        __CLR4_2_0fimfimlnxz237z.R.inc(20120);assertFalse(five.isBlank());
    }finally{__CLR4_2_0fimfimlnxz237z.R.flushNeeded();}}
    
    @Test public void testTextBean() {__CLR4_2_0fimfimlnxz237z.R.globalSliceStart(getClass().getName(),20121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0eff9m2fix();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fimfimlnxz237z.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fimfimlnxz237z.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.TextNodeTest.testTextBean",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20121,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0eff9m2fix(){try{__CLR4_2_0fimfimlnxz237z.R.inc(20121);
        __CLR4_2_0fimfimlnxz237z.R.inc(20122);Document doc = Jsoup.parse("<p>One <span>two &amp;</span> three &amp;</p>");
        __CLR4_2_0fimfimlnxz237z.R.inc(20123);Element p = doc.select("p").first();

        __CLR4_2_0fimfimlnxz237z.R.inc(20124);Element span = doc.select("span").first();
        __CLR4_2_0fimfimlnxz237z.R.inc(20125);assertEquals("two &", span.text());
        __CLR4_2_0fimfimlnxz237z.R.inc(20126);TextNode spanText = (TextNode) span.childNode(0);
        __CLR4_2_0fimfimlnxz237z.R.inc(20127);assertEquals("two &", spanText.text());
        
        __CLR4_2_0fimfimlnxz237z.R.inc(20128);TextNode tn = (TextNode) p.childNode(2);
        __CLR4_2_0fimfimlnxz237z.R.inc(20129);assertEquals(" three &", tn.text());
        
        __CLR4_2_0fimfimlnxz237z.R.inc(20130);tn.text(" POW!");
        __CLR4_2_0fimfimlnxz237z.R.inc(20131);assertEquals("One <span>two &amp;</span> POW!", TextUtil.stripNewlines(p.html()));

        __CLR4_2_0fimfimlnxz237z.R.inc(20132);tn.attr(tn.nodeName(), "kablam &");
        __CLR4_2_0fimfimlnxz237z.R.inc(20133);assertEquals("kablam &", tn.text());
        __CLR4_2_0fimfimlnxz237z.R.inc(20134);assertEquals("One <span>two &amp;</span>kablam &amp;", TextUtil.stripNewlines(p.html()));
    }finally{__CLR4_2_0fimfimlnxz237z.R.flushNeeded();}}

    @Test public void testSplitText() {__CLR4_2_0fimfimlnxz237z.R.globalSliceStart(getClass().getName(),20135);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0aoxzl0fjb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fimfimlnxz237z.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fimfimlnxz237z.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.TextNodeTest.testSplitText",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20135,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0aoxzl0fjb(){try{__CLR4_2_0fimfimlnxz237z.R.inc(20135);
        __CLR4_2_0fimfimlnxz237z.R.inc(20136);Document doc = Jsoup.parse("<div>Hello there</div>");
        __CLR4_2_0fimfimlnxz237z.R.inc(20137);Element div = doc.select("div").first();
        __CLR4_2_0fimfimlnxz237z.R.inc(20138);TextNode tn = (TextNode) div.childNode(0);
        __CLR4_2_0fimfimlnxz237z.R.inc(20139);TextNode tail = tn.splitText(6);
        __CLR4_2_0fimfimlnxz237z.R.inc(20140);assertEquals("Hello ", tn.getWholeText());
        __CLR4_2_0fimfimlnxz237z.R.inc(20141);assertEquals("there", tail.getWholeText());
        __CLR4_2_0fimfimlnxz237z.R.inc(20142);tail.text("there!");
        __CLR4_2_0fimfimlnxz237z.R.inc(20143);assertEquals("Hello there!", div.text());
        __CLR4_2_0fimfimlnxz237z.R.inc(20144);assertTrue(tn.parent() == tail.parent());
    }finally{__CLR4_2_0fimfimlnxz237z.R.flushNeeded();}}

    @Test public void testSplitAnEmbolden() {__CLR4_2_0fimfimlnxz237z.R.globalSliceStart(getClass().getName(),20145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0w53nfyfjl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fimfimlnxz237z.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fimfimlnxz237z.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.TextNodeTest.testSplitAnEmbolden",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20145,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0w53nfyfjl(){try{__CLR4_2_0fimfimlnxz237z.R.inc(20145);
        __CLR4_2_0fimfimlnxz237z.R.inc(20146);Document doc = Jsoup.parse("<div>Hello there</div>");
        __CLR4_2_0fimfimlnxz237z.R.inc(20147);Element div = doc.select("div").first();
        __CLR4_2_0fimfimlnxz237z.R.inc(20148);TextNode tn = (TextNode) div.childNode(0);
        __CLR4_2_0fimfimlnxz237z.R.inc(20149);TextNode tail = tn.splitText(6);
        __CLR4_2_0fimfimlnxz237z.R.inc(20150);tail.wrap("<b></b>");

        __CLR4_2_0fimfimlnxz237z.R.inc(20151);assertEquals("Hello <b>there</b>", TextUtil.stripNewlines(div.html())); // not great that we get \n<b>there there... must correct
    }finally{__CLR4_2_0fimfimlnxz237z.R.flushNeeded();}}

    @Test public void testWithSupplementaryCharacter(){__CLR4_2_0fimfimlnxz237z.R.globalSliceStart(getClass().getName(),20152);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ecmcmxfjs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fimfimlnxz237z.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fimfimlnxz237z.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.TextNodeTest.testWithSupplementaryCharacter",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20152,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ecmcmxfjs(){try{__CLR4_2_0fimfimlnxz237z.R.inc(20152);
        __CLR4_2_0fimfimlnxz237z.R.inc(20153);Document doc = Jsoup.parse(new String(Character.toChars(135361)));
        __CLR4_2_0fimfimlnxz237z.R.inc(20154);TextNode t = doc.body().textNodes().get(0);
        __CLR4_2_0fimfimlnxz237z.R.inc(20155);assertEquals(new String(Character.toChars(135361)), t.outerHtml().trim());
    }finally{__CLR4_2_0fimfimlnxz237z.R.flushNeeded();}}

    @Test public void testLeadNodesHaveNoChildren() {__CLR4_2_0fimfimlnxz237z.R.globalSliceStart(getClass().getName(),20156);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_036d8y6fjw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fimfimlnxz237z.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fimfimlnxz237z.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.TextNodeTest.testLeadNodesHaveNoChildren",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20156,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_036d8y6fjw(){try{__CLR4_2_0fimfimlnxz237z.R.inc(20156);
        __CLR4_2_0fimfimlnxz237z.R.inc(20157);Document doc = Jsoup.parse("<div>Hello there</div>");
        __CLR4_2_0fimfimlnxz237z.R.inc(20158);Element div = doc.select("div").first();
        __CLR4_2_0fimfimlnxz237z.R.inc(20159);TextNode tn = (TextNode) div.childNode(0);
        __CLR4_2_0fimfimlnxz237z.R.inc(20160);List<Node> nodes = tn.childNodes();
        __CLR4_2_0fimfimlnxz237z.R.inc(20161);assertEquals(0, nodes.size());
    }finally{__CLR4_2_0fimfimlnxz237z.R.flushNeeded();}}
}
