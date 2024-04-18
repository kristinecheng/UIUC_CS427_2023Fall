/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.select;

import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 Tests for ElementList.

 @author Jonathan Hedley, jonathan@hedley.net */
public class ElementsTest {static class __CLR4_2_0gzzgzzlnxz239y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767707166L,8589935092L,22293,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test public void filter() {__CLR4_2_0gzzgzzlnxz239y.R.globalSliceStart(getClass().getName(),22031);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_07vv3jzgzz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gzzgzzlnxz239y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gzzgzzlnxz239y.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.filter",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22031,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_07vv3jzgzz(){try{__CLR4_2_0gzzgzzlnxz239y.R.inc(22031);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22032);String h = "<p>Excl</p><div class=headline><p>Hello</p><p>There</p></div><div class=headline><h1>Headline</h1></div>";
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22033);Document doc = Jsoup.parse(h);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22034);Elements els = doc.select(".headline").select("p");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22035);assertEquals(2, els.size());
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22036);assertEquals("Hello", els.get(0).text());
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22037);assertEquals("There", els.get(1).text());
    }finally{__CLR4_2_0gzzgzzlnxz239y.R.flushNeeded();}}

    @Test public void attributes() {__CLR4_2_0gzzgzzlnxz239y.R.globalSliceStart(getClass().getName(),22038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_07des02h06();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gzzgzzlnxz239y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gzzgzzlnxz239y.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.attributes",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22038,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_07des02h06(){try{__CLR4_2_0gzzgzzlnxz239y.R.inc(22038);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22039);String h = "<p title=foo><p title=bar><p class=foo><p class=bar>";
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22040);Document doc = Jsoup.parse(h);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22041);Elements withTitle = doc.select("p[title]");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22042);assertEquals(2, withTitle.size());
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22043);assertTrue(withTitle.hasAttr("title"));
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22044);assertFalse(withTitle.hasAttr("class"));
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22045);assertEquals("foo", withTitle.attr("title"));

        __CLR4_2_0gzzgzzlnxz239y.R.inc(22046);withTitle.removeAttr("title");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22047);assertEquals(2, withTitle.size()); // existing Elements are not reevaluated
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22048);assertEquals(0, doc.select("p[title]").size());

        __CLR4_2_0gzzgzzlnxz239y.R.inc(22049);Elements ps = doc.select("p").attr("style", "classy");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22050);assertEquals(4, ps.size());
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22051);assertEquals("classy", ps.last().attr("style"));
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22052);assertEquals("bar", ps.last().attr("class"));
    }finally{__CLR4_2_0gzzgzzlnxz239y.R.flushNeeded();}}

    @Test public void hasAttr() {__CLR4_2_0gzzgzzlnxz239y.R.globalSliceStart(getClass().getName(),22053);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0i7d0fih0l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gzzgzzlnxz239y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gzzgzzlnxz239y.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.hasAttr",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22053,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0i7d0fih0l(){try{__CLR4_2_0gzzgzzlnxz239y.R.inc(22053);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22054);Document doc = Jsoup.parse("<p title=foo><p title=bar><p class=foo><p class=bar>");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22055);Elements ps = doc.select("p");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22056);assertTrue(ps.hasAttr("class"));
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22057);assertFalse(ps.hasAttr("style"));
    }finally{__CLR4_2_0gzzgzzlnxz239y.R.flushNeeded();}}

    @Test public void hasAbsAttr() {__CLR4_2_0gzzgzzlnxz239y.R.globalSliceStart(getClass().getName(),22058);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0yo4hioh0q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gzzgzzlnxz239y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gzzgzzlnxz239y.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.hasAbsAttr",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22058,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0yo4hioh0q(){try{__CLR4_2_0gzzgzzlnxz239y.R.inc(22058);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22059);Document doc = Jsoup.parse("<a id=1 href='/foo'>One</a> <a id=2 href='https://jsoup.org'>Two</a>");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22060);Elements one = doc.select("#1");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22061);Elements two = doc.select("#2");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22062);Elements both = doc.select("a");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22063);assertFalse(one.hasAttr("abs:href"));
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22064);assertTrue(two.hasAttr("abs:href"));
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22065);assertTrue(both.hasAttr("abs:href")); // hits on #2
    }finally{__CLR4_2_0gzzgzzlnxz239y.R.flushNeeded();}}

    @Test public void attr() {__CLR4_2_0gzzgzzlnxz239y.R.globalSliceStart(getClass().getName(),22066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_05k5v6gh0y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gzzgzzlnxz239y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gzzgzzlnxz239y.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.attr",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22066,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_05k5v6gh0y(){try{__CLR4_2_0gzzgzzlnxz239y.R.inc(22066);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22067);Document doc = Jsoup.parse("<p title=foo><p title=bar><p class=foo><p class=bar>");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22068);String classVal = doc.select("p").attr("class");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22069);assertEquals("foo", classVal);
    }finally{__CLR4_2_0gzzgzzlnxz239y.R.flushNeeded();}}

    @Test public void absAttr() {__CLR4_2_0gzzgzzlnxz239y.R.globalSliceStart(getClass().getName(),22070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0v7inpyh12();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gzzgzzlnxz239y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gzzgzzlnxz239y.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.absAttr",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22070,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0v7inpyh12(){try{__CLR4_2_0gzzgzzlnxz239y.R.inc(22070);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22071);Document doc = Jsoup.parse("<a id=1 href='/foo'>One</a> <a id=2 href='https://jsoup.org'>Two</a>");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22072);Elements one = doc.select("#1");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22073);Elements two = doc.select("#2");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22074);Elements both = doc.select("a");

        __CLR4_2_0gzzgzzlnxz239y.R.inc(22075);assertEquals("", one.attr("abs:href"));
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22076);assertEquals("https://jsoup.org", two.attr("abs:href"));
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22077);assertEquals("https://jsoup.org", both.attr("abs:href"));
    }finally{__CLR4_2_0gzzgzzlnxz239y.R.flushNeeded();}}

    @Test public void classes() {__CLR4_2_0gzzgzzlnxz239y.R.globalSliceStart(getClass().getName(),22078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0rd3rn1h1a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gzzgzzlnxz239y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gzzgzzlnxz239y.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.classes",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22078,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0rd3rn1h1a(){try{__CLR4_2_0gzzgzzlnxz239y.R.inc(22078);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22079);Document doc = Jsoup.parse("<div><p class='mellow yellow'></p><p class='red green'></p>");

        __CLR4_2_0gzzgzzlnxz239y.R.inc(22080);Elements els = doc.select("p");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22081);assertTrue(els.hasClass("red"));
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22082);assertFalse(els.hasClass("blue"));
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22083);els.addClass("blue");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22084);els.removeClass("yellow");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22085);els.toggleClass("mellow");

        __CLR4_2_0gzzgzzlnxz239y.R.inc(22086);assertEquals("blue", els.get(0).className());
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22087);assertEquals("red green blue mellow", els.get(1).className());
    }finally{__CLR4_2_0gzzgzzlnxz239y.R.flushNeeded();}}

    @Test public void hasClassCaseInsensitive() {__CLR4_2_0gzzgzzlnxz239y.R.globalSliceStart(getClass().getName(),22088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_07y3u8ah1k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gzzgzzlnxz239y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gzzgzzlnxz239y.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.hasClassCaseInsensitive",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22088,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_07y3u8ah1k(){try{__CLR4_2_0gzzgzzlnxz239y.R.inc(22088);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22089);Elements els = Jsoup.parse("<p Class=One>One <p class=Two>Two <p CLASS=THREE>THREE").select("p");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22090);Element one = els.get(0);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22091);Element two = els.get(1);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22092);Element thr = els.get(2);

        __CLR4_2_0gzzgzzlnxz239y.R.inc(22093);assertTrue(one.hasClass("One"));
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22094);assertTrue(one.hasClass("ONE"));

        __CLR4_2_0gzzgzzlnxz239y.R.inc(22095);assertTrue(two.hasClass("TWO"));
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22096);assertTrue(two.hasClass("Two"));

        __CLR4_2_0gzzgzzlnxz239y.R.inc(22097);assertTrue(thr.hasClass("ThreE"));
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22098);assertTrue(thr.hasClass("three"));
    }finally{__CLR4_2_0gzzgzzlnxz239y.R.flushNeeded();}}

    @Test public void text() {__CLR4_2_0gzzgzzlnxz239y.R.globalSliceStart(getClass().getName(),22099);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0sz271oh1v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gzzgzzlnxz239y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gzzgzzlnxz239y.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.text",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22099,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0sz271oh1v(){try{__CLR4_2_0gzzgzzlnxz239y.R.inc(22099);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22100);String h = "<div><p>Hello<p>there<p>world</div>";
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22101);Document doc = Jsoup.parse(h);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22102);assertEquals("Hello there world", doc.select("div > *").text());
    }finally{__CLR4_2_0gzzgzzlnxz239y.R.flushNeeded();}}

    @Test public void hasText() {__CLR4_2_0gzzgzzlnxz239y.R.globalSliceStart(getClass().getName(),22103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0iaizbih1z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gzzgzzlnxz239y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gzzgzzlnxz239y.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.hasText",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22103,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0iaizbih1z(){try{__CLR4_2_0gzzgzzlnxz239y.R.inc(22103);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22104);Document doc = Jsoup.parse("<div><p>Hello</p></div><div><p></p></div>");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22105);Elements divs = doc.select("div");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22106);assertTrue(divs.hasText());
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22107);assertFalse(doc.select("div + div").hasText());
    }finally{__CLR4_2_0gzzgzzlnxz239y.R.flushNeeded();}}

    @Test public void html() {__CLR4_2_0gzzgzzlnxz239y.R.globalSliceStart(getClass().getName(),22108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0p3af0yh24();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gzzgzzlnxz239y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gzzgzzlnxz239y.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.html",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22108,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0p3af0yh24(){try{__CLR4_2_0gzzgzzlnxz239y.R.inc(22108);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22109);Document doc = Jsoup.parse("<div><p>Hello</p></div><div><p>There</p></div>");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22110);Elements divs = doc.select("div");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22111);assertEquals("<p>Hello</p>\n<p>There</p>", divs.html());
    }finally{__CLR4_2_0gzzgzzlnxz239y.R.flushNeeded();}}

    @Test public void outerHtml() {__CLR4_2_0gzzgzzlnxz239y.R.globalSliceStart(getClass().getName(),22112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0cck78zh28();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gzzgzzlnxz239y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gzzgzzlnxz239y.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.outerHtml",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22112,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0cck78zh28(){try{__CLR4_2_0gzzgzzlnxz239y.R.inc(22112);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22113);Document doc = Jsoup.parse("<div><p>Hello</p></div><div><p>There</p></div>");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22114);Elements divs = doc.select("div");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22115);assertEquals("<div><p>Hello</p></div><div><p>There</p></div>", TextUtil.stripNewlines(divs.outerHtml()));
    }finally{__CLR4_2_0gzzgzzlnxz239y.R.flushNeeded();}}

    @Test public void setHtml() {__CLR4_2_0gzzgzzlnxz239y.R.globalSliceStart(getClass().getName(),22116);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_02u2uvoh2c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gzzgzzlnxz239y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gzzgzzlnxz239y.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.setHtml",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22116,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_02u2uvoh2c(){try{__CLR4_2_0gzzgzzlnxz239y.R.inc(22116);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22117);Document doc = Jsoup.parse("<p>One</p><p>Two</p><p>Three</p>");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22118);Elements ps = doc.select("p");

        __CLR4_2_0gzzgzzlnxz239y.R.inc(22119);ps.prepend("<b>Bold</b>").append("<i>Ital</i>");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22120);assertEquals("<p><b>Bold</b>Two<i>Ital</i></p>", TextUtil.stripNewlines(ps.get(1).outerHtml()));

        __CLR4_2_0gzzgzzlnxz239y.R.inc(22121);ps.html("<span>Gone</span>");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22122);assertEquals("<p><span>Gone</span></p>", TextUtil.stripNewlines(ps.get(1).outerHtml()));
    }finally{__CLR4_2_0gzzgzzlnxz239y.R.flushNeeded();}}

    @Test public void val() {__CLR4_2_0gzzgzzlnxz239y.R.globalSliceStart(getClass().getName(),22123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0bxfsqwh2j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gzzgzzlnxz239y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gzzgzzlnxz239y.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.val",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22123,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0bxfsqwh2j(){try{__CLR4_2_0gzzgzzlnxz239y.R.inc(22123);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22124);Document doc = Jsoup.parse("<input value='one' /><textarea>two</textarea>");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22125);Elements els = doc.select("input, textarea");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22126);assertEquals(2, els.size());
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22127);assertEquals("one", els.val());
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22128);assertEquals("two", els.last().val());

        __CLR4_2_0gzzgzzlnxz239y.R.inc(22129);els.val("three");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22130);assertEquals("three", els.first().val());
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22131);assertEquals("three", els.last().val());
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22132);assertEquals("<textarea>three</textarea>", els.last().outerHtml());
    }finally{__CLR4_2_0gzzgzzlnxz239y.R.flushNeeded();}}

    @Test public void before() {__CLR4_2_0gzzgzzlnxz239y.R.globalSliceStart(getClass().getName(),22133);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0qd8owqh2t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gzzgzzlnxz239y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gzzgzzlnxz239y.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.before",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22133,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0qd8owqh2t(){try{__CLR4_2_0gzzgzzlnxz239y.R.inc(22133);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22134);Document doc = Jsoup.parse("<p>This <a>is</a> <a>jsoup</a>.</p>");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22135);doc.select("a").before("<span>foo</span>");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22136);assertEquals("<p>This <span>foo</span><a>is</a> <span>foo</span><a>jsoup</a>.</p>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_2_0gzzgzzlnxz239y.R.flushNeeded();}}

    @Test public void after() {__CLR4_2_0gzzgzzlnxz239y.R.globalSliceStart(getClass().getName(),22137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0v4au71h2x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gzzgzzlnxz239y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gzzgzzlnxz239y.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.after",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22137,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0v4au71h2x(){try{__CLR4_2_0gzzgzzlnxz239y.R.inc(22137);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22138);Document doc = Jsoup.parse("<p>This <a>is</a> <a>jsoup</a>.</p>");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22139);doc.select("a").after("<span>foo</span>");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22140);assertEquals("<p>This <a>is</a><span>foo</span> <a>jsoup</a><span>foo</span>.</p>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_2_0gzzgzzlnxz239y.R.flushNeeded();}}

    @Test public void wrap() {__CLR4_2_0gzzgzzlnxz239y.R.globalSliceStart(getClass().getName(),22141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0sdpcj3h31();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gzzgzzlnxz239y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gzzgzzlnxz239y.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.wrap",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22141,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0sdpcj3h31(){try{__CLR4_2_0gzzgzzlnxz239y.R.inc(22141);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22142);String h = "<p><b>This</b> is <b>jsoup</b></p>";
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22143);Document doc = Jsoup.parse(h);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22144);doc.select("b").wrap("<i></i>");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22145);assertEquals("<p><i><b>This</b></i> is <i><b>jsoup</b></i></p>", doc.body().html());
    }finally{__CLR4_2_0gzzgzzlnxz239y.R.flushNeeded();}}

    @Test public void wrapDiv() {__CLR4_2_0gzzgzzlnxz239y.R.globalSliceStart(getClass().getName(),22146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0n32fg2h36();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gzzgzzlnxz239y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gzzgzzlnxz239y.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.wrapDiv",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22146,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0n32fg2h36(){try{__CLR4_2_0gzzgzzlnxz239y.R.inc(22146);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22147);String h = "<p><b>This</b> is <b>jsoup</b>.</p> <p>How do you like it?</p>";
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22148);Document doc = Jsoup.parse(h);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22149);doc.select("p").wrap("<div></div>");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22150);assertEquals("<div><p><b>This</b> is <b>jsoup</b>.</p></div> <div><p>How do you like it?</p></div>",
                TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_2_0gzzgzzlnxz239y.R.flushNeeded();}}

    @Test public void unwrap() {__CLR4_2_0gzzgzzlnxz239y.R.globalSliceStart(getClass().getName(),22151);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0y5yq16h3b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gzzgzzlnxz239y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gzzgzzlnxz239y.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.unwrap",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22151,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0y5yq16h3b(){try{__CLR4_2_0gzzgzzlnxz239y.R.inc(22151);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22152);String h = "<div><font>One</font> <font><a href=\"/\">Two</a></font></div";
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22153);Document doc = Jsoup.parse(h);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22154);doc.select("font").unwrap();
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22155);assertEquals("<div>One <a href=\"/\">Two</a></div>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_2_0gzzgzzlnxz239y.R.flushNeeded();}}

    @Test public void unwrapP() {__CLR4_2_0gzzgzzlnxz239y.R.globalSliceStart(getClass().getName(),22156);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_083la8ch3g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gzzgzzlnxz239y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gzzgzzlnxz239y.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.unwrapP",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22156,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_083la8ch3g(){try{__CLR4_2_0gzzgzzlnxz239y.R.inc(22156);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22157);String h = "<p><a>One</a> Two</p> Three <i>Four</i> <p>Fix <i>Six</i></p>";
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22158);Document doc = Jsoup.parse(h);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22159);doc.select("p").unwrap();
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22160);assertEquals("<a>One</a> Two Three <i>Four</i> Fix <i>Six</i>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_2_0gzzgzzlnxz239y.R.flushNeeded();}}

    @Test public void unwrapKeepsSpace() {__CLR4_2_0gzzgzzlnxz239y.R.globalSliceStart(getClass().getName(),22161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0anuwxqh3l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gzzgzzlnxz239y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gzzgzzlnxz239y.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.unwrapKeepsSpace",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22161,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0anuwxqh3l(){try{__CLR4_2_0gzzgzzlnxz239y.R.inc(22161);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22162);String h = "<p>One <span>two</span> <span>three</span> four</p>";
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22163);Document doc = Jsoup.parse(h);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22164);doc.select("span").unwrap();
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22165);assertEquals("<p>One two three four</p>", doc.body().html());
    }finally{__CLR4_2_0gzzgzzlnxz239y.R.flushNeeded();}}

    @Test public void empty() {__CLR4_2_0gzzgzzlnxz239y.R.globalSliceStart(getClass().getName(),22166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0g4yvp0h3q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gzzgzzlnxz239y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gzzgzzlnxz239y.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.empty",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22166,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0g4yvp0h3q(){try{__CLR4_2_0gzzgzzlnxz239y.R.inc(22166);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22167);Document doc = Jsoup.parse("<div><p>Hello <b>there</b></p> <p>now!</p></div>");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22168);doc.outputSettings().prettyPrint(false);

        __CLR4_2_0gzzgzzlnxz239y.R.inc(22169);doc.select("p").empty();
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22170);assertEquals("<div><p></p> <p></p></div>", doc.body().html());
    }finally{__CLR4_2_0gzzgzzlnxz239y.R.flushNeeded();}}

    @Test public void remove() {__CLR4_2_0gzzgzzlnxz239y.R.globalSliceStart(getClass().getName(),22171);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0boikwbh3v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gzzgzzlnxz239y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gzzgzzlnxz239y.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.remove",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22171,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0boikwbh3v(){try{__CLR4_2_0gzzgzzlnxz239y.R.inc(22171);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22172);Document doc = Jsoup.parse("<div><p>Hello <b>there</b></p> jsoup <p>now!</p></div>");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22173);doc.outputSettings().prettyPrint(false);

        __CLR4_2_0gzzgzzlnxz239y.R.inc(22174);doc.select("p").remove();
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22175);assertEquals("<div> jsoup </div>", doc.body().html());
    }finally{__CLR4_2_0gzzgzzlnxz239y.R.flushNeeded();}}

    @Test public void eq() {__CLR4_2_0gzzgzzlnxz239y.R.globalSliceStart(getClass().getName(),22176);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0r87l3hh40();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gzzgzzlnxz239y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gzzgzzlnxz239y.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.eq",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22176,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0r87l3hh40(){try{__CLR4_2_0gzzgzzlnxz239y.R.inc(22176);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22177);String h = "<p>Hello<p>there<p>world";
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22178);Document doc = Jsoup.parse(h);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22179);assertEquals("there", doc.select("p").eq(1).text());
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22180);assertEquals("there", doc.select("p").get(1).text());
    }finally{__CLR4_2_0gzzgzzlnxz239y.R.flushNeeded();}}

    @Test public void is() {__CLR4_2_0gzzgzzlnxz239y.R.globalSliceStart(getClass().getName(),22181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0r43wohh45();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gzzgzzlnxz239y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gzzgzzlnxz239y.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.is",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22181,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0r43wohh45(){try{__CLR4_2_0gzzgzzlnxz239y.R.inc(22181);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22182);String h = "<p>Hello<p title=foo>there<p>world";
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22183);Document doc = Jsoup.parse(h);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22184);Elements ps = doc.select("p");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22185);assertTrue(ps.is("[title=foo]"));
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22186);assertFalse(ps.is("[title=bar]"));
    }finally{__CLR4_2_0gzzgzzlnxz239y.R.flushNeeded();}}

    @Test public void parents() {__CLR4_2_0gzzgzzlnxz239y.R.globalSliceStart(getClass().getName(),22187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0imqf5ch4b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gzzgzzlnxz239y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gzzgzzlnxz239y.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.parents",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22187,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0imqf5ch4b(){try{__CLR4_2_0gzzgzzlnxz239y.R.inc(22187);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22188);Document doc = Jsoup.parse("<div><p>Hello</p></div><p>There</p>");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22189);Elements parents = doc.select("p").parents();

        __CLR4_2_0gzzgzzlnxz239y.R.inc(22190);assertEquals(3, parents.size());
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22191);assertEquals("div", parents.get(0).tagName());
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22192);assertEquals("body", parents.get(1).tagName());
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22193);assertEquals("html", parents.get(2).tagName());
    }finally{__CLR4_2_0gzzgzzlnxz239y.R.flushNeeded();}}

    @Test public void not() {__CLR4_2_0gzzgzzlnxz239y.R.globalSliceStart(getClass().getName(),22194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0q5io92h4i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gzzgzzlnxz239y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gzzgzzlnxz239y.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.not",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22194,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0q5io92h4i(){try{__CLR4_2_0gzzgzzlnxz239y.R.inc(22194);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22195);Document doc = Jsoup.parse("<div id=1><p>One</p></div> <div id=2><p><span>Two</span></p></div>");

        __CLR4_2_0gzzgzzlnxz239y.R.inc(22196);Elements div1 = doc.select("div").not(":has(p > span)");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22197);assertEquals(1, div1.size());
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22198);assertEquals("1", div1.first().id());

        __CLR4_2_0gzzgzzlnxz239y.R.inc(22199);Elements div2 = doc.select("div").not("#1");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22200);assertEquals(1, div2.size());
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22201);assertEquals("2", div2.first().id());
    }finally{__CLR4_2_0gzzgzzlnxz239y.R.flushNeeded();}}

    @Test public void tagNameSet() {__CLR4_2_0gzzgzzlnxz239y.R.globalSliceStart(getClass().getName(),22202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_062j6o4h4q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gzzgzzlnxz239y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gzzgzzlnxz239y.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.tagNameSet",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22202,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_062j6o4h4q(){try{__CLR4_2_0gzzgzzlnxz239y.R.inc(22202);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22203);Document doc = Jsoup.parse("<p>Hello <i>there</i> <i>now</i></p>");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22204);doc.select("i").tagName("em");

        __CLR4_2_0gzzgzzlnxz239y.R.inc(22205);assertEquals("<p>Hello <em>there</em> <em>now</em></p>", doc.body().html());
    }finally{__CLR4_2_0gzzgzzlnxz239y.R.flushNeeded();}}

    @Test public void traverse() {__CLR4_2_0gzzgzzlnxz239y.R.globalSliceStart(getClass().getName(),22206);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0h4dh15h4u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gzzgzzlnxz239y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gzzgzzlnxz239y.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.traverse",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22206,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0h4dh15h4u(){try{__CLR4_2_0gzzgzzlnxz239y.R.inc(22206);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22207);Document doc = Jsoup.parse("<div><p>Hello</p></div><div>There</div>");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22208);final StringBuilder accum = new StringBuilder();
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22209);doc.select("div").traverse(new NodeVisitor() {
            @Override
            public void head(Node node, int depth) {try{__CLR4_2_0gzzgzzlnxz239y.R.inc(22210);
                __CLR4_2_0gzzgzzlnxz239y.R.inc(22211);accum.append("<").append(node.nodeName()).append(">");
            }finally{__CLR4_2_0gzzgzzlnxz239y.R.flushNeeded();}}

            @Override
            public void tail(Node node, int depth) {try{__CLR4_2_0gzzgzzlnxz239y.R.inc(22212);
                __CLR4_2_0gzzgzzlnxz239y.R.inc(22213);accum.append("</").append(node.nodeName()).append(">");
            }finally{__CLR4_2_0gzzgzzlnxz239y.R.flushNeeded();}}
        });
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22214);assertEquals("<div><p><#text></#text></p></div><div><#text></#text></div>", accum.toString());
    }finally{__CLR4_2_0gzzgzzlnxz239y.R.flushNeeded();}}

    @Test public void forms() {__CLR4_2_0gzzgzzlnxz239y.R.globalSliceStart(getClass().getName(),22215);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0fhypauh53();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gzzgzzlnxz239y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gzzgzzlnxz239y.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.forms",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22215,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0fhypauh53(){try{__CLR4_2_0gzzgzzlnxz239y.R.inc(22215);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22216);Document doc = Jsoup.parse("<form id=1><input name=q></form><div /><form id=2><input name=f></form>");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22217);Elements els = doc.select("*");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22218);assertEquals(9, els.size());

        __CLR4_2_0gzzgzzlnxz239y.R.inc(22219);List<FormElement> forms = els.forms();
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22220);assertEquals(2, forms.size());
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22221);assertTrue(forms.get(0) != null);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22222);assertTrue(forms.get(1) != null);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22223);assertEquals("1", forms.get(0).id());
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22224);assertEquals("2", forms.get(1).id());
    }finally{__CLR4_2_0gzzgzzlnxz239y.R.flushNeeded();}}

    @Test public void classWithHyphen() {__CLR4_2_0gzzgzzlnxz239y.R.globalSliceStart(getClass().getName(),22225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0c6bb0ph5d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gzzgzzlnxz239y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gzzgzzlnxz239y.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.classWithHyphen",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22225,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0c6bb0ph5d(){try{__CLR4_2_0gzzgzzlnxz239y.R.inc(22225);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22226);Document doc = Jsoup.parse("<p class='tab-nav'>Check</p>");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22227);Elements els = doc.getElementsByClass("tab-nav");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22228);assertEquals(1, els.size());
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22229);assertEquals("Check", els.text());
    }finally{__CLR4_2_0gzzgzzlnxz239y.R.flushNeeded();}}

    @Test public void siblings() {__CLR4_2_0gzzgzzlnxz239y.R.globalSliceStart(getClass().getName(),22230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_020jjs8h5i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gzzgzzlnxz239y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gzzgzzlnxz239y.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.siblings",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22230,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_020jjs8h5i(){try{__CLR4_2_0gzzgzzlnxz239y.R.inc(22230);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22231);Document doc = Jsoup.parse("<div><p>1<p>2<p>3<p>4<p>5<p>6</div><div><p>7<p>8<p>9<p>10<p>11<p>12</div>");

        __CLR4_2_0gzzgzzlnxz239y.R.inc(22232);Elements els = doc.select("p:eq(3)"); // gets p4 and p10
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22233);assertEquals(2, els.size());

        __CLR4_2_0gzzgzzlnxz239y.R.inc(22234);Elements next = els.next();
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22235);assertEquals(2, next.size());
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22236);assertEquals("5", next.first().text());
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22237);assertEquals("11", next.last().text());

        __CLR4_2_0gzzgzzlnxz239y.R.inc(22238);assertEquals(0, els.next("p:contains(6)").size());
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22239);final Elements nextF = els.next("p:contains(5)");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22240);assertEquals(1, nextF.size());
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22241);assertEquals("5", nextF.first().text());

        __CLR4_2_0gzzgzzlnxz239y.R.inc(22242);Elements nextA = els.nextAll();
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22243);assertEquals(4, nextA.size());
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22244);assertEquals("5", nextA.first().text());
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22245);assertEquals("12", nextA.last().text());

        __CLR4_2_0gzzgzzlnxz239y.R.inc(22246);Elements nextAF = els.nextAll("p:contains(6)");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22247);assertEquals(1, nextAF.size());
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22248);assertEquals("6", nextAF.first().text());

        __CLR4_2_0gzzgzzlnxz239y.R.inc(22249);Elements prev = els.prev();
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22250);assertEquals(2, prev.size());
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22251);assertEquals("3", prev.first().text());
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22252);assertEquals("9", prev.last().text());

        __CLR4_2_0gzzgzzlnxz239y.R.inc(22253);assertEquals(0, els.prev("p:contains(1)").size());
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22254);final Elements prevF = els.prev("p:contains(3)");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22255);assertEquals(1, prevF.size());
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22256);assertEquals("3", prevF.first().text());

        __CLR4_2_0gzzgzzlnxz239y.R.inc(22257);Elements prevA = els.prevAll();
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22258);assertEquals(6, prevA.size());
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22259);assertEquals("3", prevA.first().text());
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22260);assertEquals("7", prevA.last().text());

        __CLR4_2_0gzzgzzlnxz239y.R.inc(22261);Elements prevAF = els.prevAll("p:contains(1)");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22262);assertEquals(1, prevAF.size());
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22263);assertEquals("1", prevAF.first().text());
    }finally{__CLR4_2_0gzzgzzlnxz239y.R.flushNeeded();}}

    @Test public void eachText() {__CLR4_2_0gzzgzzlnxz239y.R.globalSliceStart(getClass().getName(),22264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0s3q10rh6g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gzzgzzlnxz239y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gzzgzzlnxz239y.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.eachText",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22264,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0s3q10rh6g(){try{__CLR4_2_0gzzgzzlnxz239y.R.inc(22264);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22265);Document doc = Jsoup.parse("<div><p>1<p>2<p>3<p>4<p>5<p>6</div><div><p>7<p>8<p>9<p>10<p>11<p>12<p></p></div>");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22266);List<String> divText = doc.select("div").eachText();
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22267);assertEquals(2, divText.size());
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22268);assertEquals("1 2 3 4 5 6", divText.get(0));
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22269);assertEquals("7 8 9 10 11 12", divText.get(1));

        __CLR4_2_0gzzgzzlnxz239y.R.inc(22270);List<String> pText = doc.select("p").eachText();
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22271);Elements ps = doc.select("p");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22272);assertEquals(13, ps.size());
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22273);assertEquals(12, pText.size()); // not 13, as last doesn't have text
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22274);assertEquals("1", pText.get(0));
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22275);assertEquals("2", pText.get(1));
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22276);assertEquals("5", pText.get(4));
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22277);assertEquals("7", pText.get(6));
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22278);assertEquals("12", pText.get(11));
    }finally{__CLR4_2_0gzzgzzlnxz239y.R.flushNeeded();}}

    @Test public void eachAttr() {__CLR4_2_0gzzgzzlnxz239y.R.globalSliceStart(getClass().getName(),22279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_06fi17dh6v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gzzgzzlnxz239y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gzzgzzlnxz239y.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.eachAttr",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22279,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_06fi17dh6v(){try{__CLR4_2_0gzzgzzlnxz239y.R.inc(22279);
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22280);Document doc = Jsoup.parse(
            "<div><a href='/foo'>1</a><a href='http://example.com/bar'>2</a><a href=''>3</a><a>4</a>",
            "http://example.com");

        __CLR4_2_0gzzgzzlnxz239y.R.inc(22281);List<String> hrefAttrs = doc.select("a").eachAttr("href");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22282);assertEquals(3, hrefAttrs.size());
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22283);assertEquals("/foo", hrefAttrs.get(0));
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22284);assertEquals("http://example.com/bar", hrefAttrs.get(1));
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22285);assertEquals("", hrefAttrs.get(2));
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22286);assertEquals(4, doc.select("a").size());

        __CLR4_2_0gzzgzzlnxz239y.R.inc(22287);List<String> absAttrs = doc.select("a").eachAttr("abs:href");
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22288);assertEquals(3, absAttrs.size());
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22289);assertEquals(3, absAttrs.size());
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22290);assertEquals("http://example.com/foo", absAttrs.get(0));
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22291);assertEquals("http://example.com/bar", absAttrs.get(1));
        __CLR4_2_0gzzgzzlnxz239y.R.inc(22292);assertEquals("http://example.com", absAttrs.get(2));
    }finally{__CLR4_2_0gzzgzzlnxz239y.R.flushNeeded();}}
}
