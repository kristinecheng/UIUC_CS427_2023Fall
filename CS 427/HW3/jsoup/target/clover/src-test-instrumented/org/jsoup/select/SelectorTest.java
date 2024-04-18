/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.select;

import org.jsoup.MultiLocaleRule;
import org.jsoup.MultiLocaleRule.MultiLocaleTest;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests that the selector selects correctly.
 *
 * @author Jonathan Hedley, jonathan@hedley.net
 */
public class SelectorTest {static class __CLR4_2_0h7zh7zlnxz23af{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767707166L,8589935092L,22886,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Rule public MultiLocaleRule rule = new MultiLocaleRule();

    @Test public void testByTag() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_03u95dkh7z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testByTag",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22319,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_03u95dkh7z(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22319);
        // should be case insensitive
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22320);Elements els = Jsoup.parse("<div id=1><div id=2><p>Hello</p></div></div><DIV id=3>").select("DIV");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22321);assertEquals(3, els.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22322);assertEquals("1", els.get(0).id());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22323);assertEquals("2", els.get(1).id());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22324);assertEquals("3", els.get(2).id());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22325);Elements none = Jsoup.parse("<div id=1><div id=2><p>Hello</p></div></div><div id=3>").select("span");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22326);assertEquals(0, none.size());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void testById() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22327);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_05gy185h87();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testById",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22327,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_05gy185h87(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22327);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22328);Elements els = Jsoup.parse("<div><p id=foo>Hello</p><p id=foo>Foo two!</p></div>").select("#foo");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22329);assertEquals(2, els.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22330);assertEquals("Hello", els.get(0).text());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22331);assertEquals("Foo two!", els.get(1).text());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22332);Elements none = Jsoup.parse("<div id=1></div>").select("#foo");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22333);assertEquals(0, none.size());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void testByClass() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22334);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0nsum6uh8e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testByClass",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22334,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0nsum6uh8e(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22334);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22335);Elements els = Jsoup.parse("<p id=0 class='ONE two'><p id=1 class='one'><p id=2 class='two'>").select("P.One");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22336);assertEquals(2, els.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22337);assertEquals("0", els.get(0).id());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22338);assertEquals("1", els.get(1).id());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22339);Elements none = Jsoup.parse("<div class='one'></div>").select(".foo");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22340);assertEquals(0, none.size());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22341);Elements els2 = Jsoup.parse("<div class='One-Two'></div>").select(".one-two");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22342);assertEquals(1, els2.size());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void testByClassCaseInsensitive() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0bclgnh8n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testByClassCaseInsensitive",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22343,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0bclgnh8n(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22343);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22344);String html = "<p Class=foo>One <p Class=Foo>Two <p class=FOO>Three <p class=farp>Four";
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22345);Elements elsFromClass = Jsoup.parse(html).select("P.Foo");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22346);Elements elsFromAttr = Jsoup.parse(html).select("p[class=foo]");

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22347);assertEquals(elsFromAttr.size(), elsFromClass.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22348);assertEquals(3, elsFromClass.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22349);assertEquals("Two", elsFromClass.get(1).text());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test @MultiLocaleTest public void testByAttribute() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0nmdmvah8u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testByAttribute",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22350,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0nmdmvah8u(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22350);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22351);String h = "<div Title=Foo /><div Title=Bar /><div Style=Qux /><div title=Balim /><div title=SLIM />" +
                "<div data-name='with spaces'/>";
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22352);Document doc = Jsoup.parse(h);

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22353);Elements withTitle = doc.select("[title]");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22354);assertEquals(4, withTitle.size());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22355);Elements foo = doc.select("[TITLE=foo]");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22356);assertEquals(1, foo.size());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22357);Elements foo2 = doc.select("[title=\"foo\"]");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22358);assertEquals(1, foo2.size());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22359);Elements foo3 = doc.select("[title=\"Foo\"]");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22360);assertEquals(1, foo3.size());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22361);Elements dataName = doc.select("[data-name=\"with spaces\"]");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22362);assertEquals(1, dataName.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22363);assertEquals("with spaces", dataName.first().attr("data-name"));

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22364);Elements not = doc.select("div[title!=bar]");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22365);assertEquals(5, not.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22366);assertEquals("Foo", not.first().attr("title"));

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22367);Elements starts = doc.select("[title^=ba]");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22368);assertEquals(2, starts.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22369);assertEquals("Bar", starts.first().attr("title"));
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22370);assertEquals("Balim", starts.last().attr("title"));

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22371);Elements ends = doc.select("[title$=im]");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22372);assertEquals(2, ends.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22373);assertEquals("Balim", ends.first().attr("title"));
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22374);assertEquals("SLIM", ends.last().attr("title"));

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22375);Elements contains = doc.select("[title*=i]");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22376);assertEquals(2, contains.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22377);assertEquals("Balim", contains.first().attr("title"));
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22378);assertEquals("SLIM", contains.last().attr("title"));
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void testNamespacedTag() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0xmcujeh9n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testNamespacedTag",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22379,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0xmcujeh9n(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22379);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22380);Document doc = Jsoup.parse("<div><abc:def id=1>Hello</abc:def></div> <abc:def class=bold id=2>There</abc:def>");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22381);Elements byTag = doc.select("abc|def");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22382);assertEquals(2, byTag.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22383);assertEquals("1", byTag.first().id());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22384);assertEquals("2", byTag.last().id());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22385);Elements byAttr = doc.select(".bold");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22386);assertEquals(1, byAttr.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22387);assertEquals("2", byAttr.last().id());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22388);Elements byTagAttr = doc.select("abc|def.bold");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22389);assertEquals(1, byTagAttr.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22390);assertEquals("2", byTagAttr.last().id());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22391);Elements byContains = doc.select("abc|def:contains(e)");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22392);assertEquals(2, byContains.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22393);assertEquals("1", byContains.first().id());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22394);assertEquals("2", byContains.last().id());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void testWildcardNamespacedTag() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ct2ar0ha3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testWildcardNamespacedTag",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22395,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ct2ar0ha3(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22395);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22396);Document doc = Jsoup.parse("<div><abc:def id=1>Hello</abc:def></div> <abc:def class=bold id=2>There</abc:def>");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22397);Elements byTag = doc.select("*|def");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22398);assertEquals(2, byTag.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22399);assertEquals("1", byTag.first().id());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22400);assertEquals("2", byTag.last().id());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22401);Elements byAttr = doc.select(".bold");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22402);assertEquals(1, byAttr.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22403);assertEquals("2", byAttr.last().id());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22404);Elements byTagAttr = doc.select("*|def.bold");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22405);assertEquals(1, byTagAttr.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22406);assertEquals("2", byTagAttr.last().id());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22407);Elements byContains = doc.select("*|def:contains(e)");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22408);assertEquals(2, byContains.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22409);assertEquals("1", byContains.first().id());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22410);assertEquals("2", byContains.last().id());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test @MultiLocaleTest public void testByAttributeStarting() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22411);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0o29weyhaj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testByAttributeStarting",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22411,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0o29weyhaj(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22411);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22412);Document doc = Jsoup.parse("<div id=1 ATTRIBUTE data-name=jsoup>Hello</div><p data-val=5 id=2>There</p><p id=3>No</p>");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22413);Elements withData = doc.select("[^data-]");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22414);assertEquals(2, withData.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22415);assertEquals("1", withData.first().id());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22416);assertEquals("2", withData.last().id());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22417);withData = doc.select("p[^data-]");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22418);assertEquals(1, withData.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22419);assertEquals("2", withData.first().id());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22420);assertEquals(1, doc.select("[^attrib]").size());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void testByAttributeRegex() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_07as0jfhat();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testByAttributeRegex",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22421,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_07as0jfhat(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22421);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22422);Document doc = Jsoup.parse("<p><img src=foo.png id=1><img src=bar.jpg id=2><img src=qux.JPEG id=3><img src=old.gif><img></p>");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22423);Elements imgs = doc.select("img[src~=(?i)\\.(png|jpe?g)]");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22424);assertEquals(3, imgs.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22425);assertEquals("1", imgs.get(0).id());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22426);assertEquals("2", imgs.get(1).id());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22427);assertEquals("3", imgs.get(2).id());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void testByAttributeRegexCharacterClass() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_01akhmehb0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testByAttributeRegexCharacterClass",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22428,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_01akhmehb0(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22428);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22429);Document doc = Jsoup.parse("<p><img src=foo.png id=1><img src=bar.jpg id=2><img src=qux.JPEG id=3><img src=old.gif id=4></p>");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22430);Elements imgs = doc.select("img[src~=[o]]");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22431);assertEquals(2, imgs.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22432);assertEquals("1", imgs.get(0).id());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22433);assertEquals("4", imgs.get(1).id());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void testByAttributeRegexCombined() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0v2s534hb6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testByAttributeRegexCombined",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22434,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0v2s534hb6(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22434);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22435);Document doc = Jsoup.parse("<div><table class=x><td>Hello</td></table></div>");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22436);Elements els = doc.select("div table[class~=x|y]");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22437);assertEquals(1, els.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22438);assertEquals("Hello", els.text());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void testCombinedWithContains() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22439);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0qtzv19hbb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testCombinedWithContains",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22439,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0qtzv19hbb(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22439);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22440);Document doc = Jsoup.parse("<p id=1>One</p><p>Two +</p><p>Three +</p>");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22441);Elements els = doc.select("p#1 + :contains(+)");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22442);assertEquals(1, els.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22443);assertEquals("Two +", els.text());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22444);assertEquals("p", els.first().tagName());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void testAllElements() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_03s3u0jhbh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testAllElements",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22445,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_03s3u0jhbh(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22445);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22446);String h = "<div><p>Hello</p><p><b>there</b></p></div>";
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22447);Document doc = Jsoup.parse(h);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22448);Elements allDoc = doc.select("*");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22449);Elements allUnderDiv = doc.select("div *");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22450);assertEquals(8, allDoc.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22451);assertEquals(3, allUnderDiv.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22452);assertEquals("p", allUnderDiv.first().tagName());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void testAllWithClass() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_01gyclmhbp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testAllWithClass",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22453,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_01gyclmhbp(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22453);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22454);String h = "<p class=first>One<p class=first>Two<p>Three";
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22455);Document doc = Jsoup.parse(h);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22456);Elements ps = doc.select("*.first");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22457);assertEquals(2, ps.size());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void testGroupOr() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22458);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0qugijthbu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testGroupOr",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22458,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0qugijthbu(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22458);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22459);String h = "<div title=foo /><div title=bar /><div /><p></p><img /><span title=qux>";
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22460);Document doc = Jsoup.parse(h);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22461);Elements els = doc.select("p,div,[title]");

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22462);assertEquals(5, els.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22463);assertEquals("div", els.get(0).tagName());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22464);assertEquals("foo", els.get(0).attr("title"));
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22465);assertEquals("div", els.get(1).tagName());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22466);assertEquals("bar", els.get(1).attr("title"));
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22467);assertEquals("div", els.get(2).tagName());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22468);assertTrue(els.get(2).attr("title").length() == 0); // missing attributes come back as empty string
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22469);assertFalse(els.get(2).hasAttr("title"));
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22470);assertEquals("p", els.get(3).tagName());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22471);assertEquals("span", els.get(4).tagName());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void testGroupOrAttribute() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0gfmw0dhc8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testGroupOrAttribute",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22472,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0gfmw0dhc8(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22472);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22473);String h = "<div id=1 /><div id=2 /><div title=foo /><div title=bar />";
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22474);Elements els = Jsoup.parse(h).select("[id],[title=foo]");

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22475);assertEquals(3, els.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22476);assertEquals("1", els.get(0).id());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22477);assertEquals("2", els.get(1).id());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22478);assertEquals("foo", els.get(2).attr("title"));
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void descendant() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0uayfkshcf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.descendant",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22479,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0uayfkshcf(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22479);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22480);String h = "<div class=head><p class=first>Hello</p><p>There</p></div><p>None</p>";
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22481);Document doc = Jsoup.parse(h);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22482);Element root = doc.getElementsByClass("HEAD").first();
        
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22483);Elements els = root.select(".head p");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22484);assertEquals(2, els.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22485);assertEquals("Hello", els.get(0).text());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22486);assertEquals("There", els.get(1).text());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22487);Elements p = root.select("p.first");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22488);assertEquals(1, p.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22489);assertEquals("Hello", p.get(0).text());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22490);Elements empty = root.select("p .first"); // self, not descend, should not match
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22491);assertEquals(0, empty.size());
        
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22492);Elements aboveRoot = root.select("body div.head");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22493);assertEquals(0, aboveRoot.size());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void and() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_093608yhcu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.and",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22494,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_093608yhcu(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22494);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22495);String h = "<div id=1 class='foo bar' title=bar name=qux><p class=foo title=bar>Hello</p></div";
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22496);Document doc = Jsoup.parse(h);

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22497);Elements div = doc.select("div.foo");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22498);assertEquals(1, div.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22499);assertEquals("div", div.first().tagName());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22500);Elements p = doc.select("div .foo"); // space indicates like "div *.foo"
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22501);assertEquals(1, p.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22502);assertEquals("p", p.first().tagName());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22503);Elements div2 = doc.select("div#1.foo.bar[title=bar][name=qux]"); // very specific!
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22504);assertEquals(1, div2.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22505);assertEquals("div", div2.first().tagName());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22506);Elements p2 = doc.select("div *.foo"); // space indicates like "div *.foo"
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22507);assertEquals(1, p2.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22508);assertEquals("p", p2.first().tagName());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void deeperDescendant() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22509);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_01mv6rnhd9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.deeperDescendant",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22509,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_01mv6rnhd9(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22509);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22510);String h = "<div class=head><p><span class=first>Hello</div><div class=head><p class=first><span>Another</span><p>Again</div>";
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22511);Document doc = Jsoup.parse(h);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22512);Element root = doc.getElementsByClass("head").first();

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22513);Elements els = root.select("div p .first");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22514);assertEquals(1, els.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22515);assertEquals("Hello", els.first().text());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22516);assertEquals("span", els.first().tagName());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22517);Elements aboveRoot = root.select("body p .first");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22518);assertEquals(0, aboveRoot.size());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void parentChildElement() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_01gzklthdj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.parentChildElement",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22519,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_01gzklthdj(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22519);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22520);String h = "<div id=1><div id=2><div id = 3></div></div></div><div id=4></div>";
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22521);Document doc = Jsoup.parse(h);

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22522);Elements divs = doc.select("div > div");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22523);assertEquals(2, divs.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22524);assertEquals("2", divs.get(0).id()); // 2 is child of 1
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22525);assertEquals("3", divs.get(1).id()); // 3 is child of 2

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22526);Elements div2 = doc.select("div#1 > div");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22527);assertEquals(1, div2.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22528);assertEquals("2", div2.get(0).id());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void parentWithClassChild() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22529);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0nxvy3hdt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.parentWithClassChild",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22529,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0nxvy3hdt(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22529);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22530);String h = "<h1 class=foo><a href=1 /></h1><h1 class=foo><a href=2 class=bar /></h1><h1><a href=3 /></h1>";
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22531);Document doc = Jsoup.parse(h);

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22532);Elements allAs = doc.select("h1 > a");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22533);assertEquals(3, allAs.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22534);assertEquals("a", allAs.first().tagName());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22535);Elements fooAs = doc.select("h1.foo > a");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22536);assertEquals(2, fooAs.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22537);assertEquals("a", fooAs.first().tagName());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22538);Elements barAs = doc.select("h1.foo > a.bar");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22539);assertEquals(1, barAs.size());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void parentChildStar() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0o3g1cbhe4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.parentChildStar",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22540,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0o3g1cbhe4(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22540);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22541);String h = "<div id=1><p>Hello<p><b>there</b></p></div><div id=2><span>Hi</span></div>";
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22542);Document doc = Jsoup.parse(h);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22543);Elements divChilds = doc.select("div > *");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22544);assertEquals(3, divChilds.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22545);assertEquals("p", divChilds.get(0).tagName());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22546);assertEquals("p", divChilds.get(1).tagName());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22547);assertEquals("span", divChilds.get(2).tagName());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void multiChildDescent() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22548);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_062ktduhec();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.multiChildDescent",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22548,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_062ktduhec(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22548);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22549);String h = "<div id=foo><h1 class=bar><a href=http://example.com/>One</a></h1></div>";
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22550);Document doc = Jsoup.parse(h);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22551);Elements els = doc.select("div#foo > h1.bar > a[href*=example]");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22552);assertEquals(1, els.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22553);assertEquals("a", els.first().tagName());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void caseInsensitive() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0zi2yughei();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.caseInsensitive",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22554,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0zi2yughei(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22554);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22555);String h = "<dIv tItle=bAr><div>"; // mixed case so a simple toLowerCase() on value doesn't catch
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22556);Document doc = Jsoup.parse(h);

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22557);assertEquals(2, doc.select("DiV").size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22558);assertEquals(1, doc.select("DiV[TiTLE]").size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22559);assertEquals(1, doc.select("DiV[TiTLE=BAR]").size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22560);assertEquals(0, doc.select("DiV[TiTLE=BARBARELLA]").size());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void adjacentSiblings() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_09kz7sqhep();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.adjacentSiblings",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22561,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_09kz7sqhep(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22561);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22562);String h = "<ol><li>One<li>Two<li>Three</ol>";
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22563);Document doc = Jsoup.parse(h);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22564);Elements sibs = doc.select("li + li");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22565);assertEquals(2, sibs.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22566);assertEquals("Two", sibs.get(0).text());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22567);assertEquals("Three", sibs.get(1).text());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void adjacentSiblingsWithId() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22568);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0945nqzhew();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.adjacentSiblingsWithId",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22568,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0945nqzhew(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22568);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22569);String h = "<ol><li id=1>One<li id=2>Two<li id=3>Three</ol>";
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22570);Document doc = Jsoup.parse(h);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22571);Elements sibs = doc.select("li#1 + li#2");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22572);assertEquals(1, sibs.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22573);assertEquals("Two", sibs.get(0).text());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void notAdjacent() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_06aoezghf2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.notAdjacent",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22574,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_06aoezghf2(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22574);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22575);String h = "<ol><li id=1>One<li id=2>Two<li id=3>Three</ol>";
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22576);Document doc = Jsoup.parse(h);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22577);Elements sibs = doc.select("li#1 + li#3");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22578);assertEquals(0, sibs.size());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void mixCombinator() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ljqtxbhf7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.mixCombinator",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22579,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ljqtxbhf7(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22579);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22580);String h = "<div class=foo><ol><li>One<li>Two<li>Three</ol></div>";
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22581);Document doc = Jsoup.parse(h);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22582);Elements sibs = doc.select("body > div.foo li + li");

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22583);assertEquals(2, sibs.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22584);assertEquals("Two", sibs.get(0).text());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22585);assertEquals("Three", sibs.get(1).text());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void mixCombinatorGroup() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22586);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0z3el8uhfe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.mixCombinatorGroup",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22586,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0z3el8uhfe(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22586);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22587);String h = "<div class=foo><ol><li>One<li>Two<li>Three</ol></div>";
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22588);Document doc = Jsoup.parse(h);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22589);Elements els = doc.select(".foo > ol, ol > li + li");

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22590);assertEquals(3, els.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22591);assertEquals("ol", els.get(0).tagName());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22592);assertEquals("Two", els.get(1).text());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22593);assertEquals("Three", els.get(2).text());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void generalSiblings() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0rixbkwhfm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.generalSiblings",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22594,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0rixbkwhfm(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22594);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22595);String h = "<ol><li id=1>One<li id=2>Two<li id=3>Three</ol>";
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22596);Document doc = Jsoup.parse(h);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22597);Elements els = doc.select("#1 ~ #3");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22598);assertEquals(1, els.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22599);assertEquals("Three", els.first().text());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    // for http://github.com/jhy/jsoup/issues#issue/10
    @Test public void testCharactersInIdAndClass() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22600);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_02db6o4hfs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testCharactersInIdAndClass",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22600,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_02db6o4hfs(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22600);
        // using CSS spec for identifiers (id and class): a-z0-9, -, _. NOT . (which is OK in html spec, but not css)
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22601);String h = "<div><p id='a1-foo_bar'>One</p><p class='b2-qux_bif'>Two</p></div>";
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22602);Document doc = Jsoup.parse(h);

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22603);Element el1 = doc.getElementById("a1-foo_bar");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22604);assertEquals("One", el1.text());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22605);Element el2 = doc.getElementsByClass("b2-qux_bif").first();
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22606);assertEquals("Two", el2.text());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22607);Element el3 = doc.select("#a1-foo_bar").first();
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22608);assertEquals("One", el3.text());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22609);Element el4 = doc.select(".b2-qux_bif").first();
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22610);assertEquals("Two", el4.text());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    // for http://github.com/jhy/jsoup/issues#issue/13
    @Test public void testSupportsLeadingCombinator() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22611);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_05cmxozhg3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testSupportsLeadingCombinator",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22611,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_05cmxozhg3(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22611);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22612);String h = "<div><p><span>One</span><span>Two</span></p></div>";
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22613);Document doc = Jsoup.parse(h);

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22614);Element p = doc.select("div > p").first();
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22615);Elements spans = p.select("> span");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22616);assertEquals(2, spans.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22617);assertEquals("One", spans.first().text());

        // make sure doesn't get nested
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22618);h = "<div id=1><div id=2><div id=3></div></div></div>";
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22619);doc = Jsoup.parse(h);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22620);Element div = doc.select("div").select(" > div").first();
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22621);assertEquals("2", div.id());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void testPseudoLessThan() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22622);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0pcwoa9hge();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testPseudoLessThan",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22622,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0pcwoa9hge(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22622);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22623);Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</>p></div><div><p>Four</p>");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22624);Elements ps = doc.select("div p:lt(2)");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22625);assertEquals(3, ps.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22626);assertEquals("One", ps.get(0).text());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22627);assertEquals("Two", ps.get(1).text());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22628);assertEquals("Four", ps.get(2).text());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void testPseudoGreaterThan() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22629);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0c9e2z6hgl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testPseudoGreaterThan",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22629,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0c9e2z6hgl(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22629);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22630);Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</p></div><div><p>Four</p>");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22631);Elements ps = doc.select("div p:gt(0)");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22632);assertEquals(2, ps.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22633);assertEquals("Two", ps.get(0).text());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22634);assertEquals("Three", ps.get(1).text());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void testPseudoEquals() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22635);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_06tcxjehgr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testPseudoEquals",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22635,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_06tcxjehgr(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22635);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22636);Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</>p></div><div><p>Four</p>");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22637);Elements ps = doc.select("div p:eq(0)");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22638);assertEquals(2, ps.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22639);assertEquals("One", ps.get(0).text());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22640);assertEquals("Four", ps.get(1).text());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22641);Elements ps2 = doc.select("div:eq(0) p:eq(0)");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22642);assertEquals(1, ps2.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22643);assertEquals("One", ps2.get(0).text());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22644);assertEquals("p", ps2.get(0).tagName());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void testPseudoBetween() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_02cwx4xhh1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testPseudoBetween",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22645,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_02cwx4xhh1(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22645);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22646);Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</>p></div><div><p>Four</p>");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22647);Elements ps = doc.select("div p:gt(0):lt(2)");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22648);assertEquals(1, ps.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22649);assertEquals("Two", ps.get(0).text());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void testPseudoCombined() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22650);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_032njnohh6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testPseudoCombined",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22650,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_032njnohh6(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22650);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22651);Document doc = Jsoup.parse("<div class='foo'><p>One</p><p>Two</p></div><div><p>Three</p><p>Four</p></div>");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22652);Elements ps = doc.select("div.foo p:gt(0)");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22653);assertEquals(1, ps.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22654);assertEquals("Two", ps.get(0).text());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void testPseudoHas() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0n9wkuphhb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testPseudoHas",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22655,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0n9wkuphhb(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22655);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22656);Document doc = Jsoup.parse("<div id=0><p><span>Hello</span></p></div> <div id=1><span class=foo>There</span></div> <div id=2><p>Not</p></div>");

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22657);Elements divs1 = doc.select("div:has(span)");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22658);assertEquals(2, divs1.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22659);assertEquals("0", divs1.get(0).id());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22660);assertEquals("1", divs1.get(1).id());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22661);Elements divs2 = doc.select("div:has([class])");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22662);assertEquals(1, divs2.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22663);assertEquals("1", divs2.get(0).id());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22664);Elements divs3 = doc.select("div:has(span, p)");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22665);assertEquals(3, divs3.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22666);assertEquals("0", divs3.get(0).id());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22667);assertEquals("1", divs3.get(1).id());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22668);assertEquals("2", divs3.get(2).id());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22669);Elements els1 = doc.body().select(":has(p)");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22670);assertEquals(3, els1.size()); // body, div, dib
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22671);assertEquals("body", els1.first().tagName());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22672);assertEquals("0", els1.get(1).id());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22673);assertEquals("2", els1.get(2).id());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22674);Elements els2 = doc.body().select(":has(> span)");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22675);assertEquals(2,els2.size()); // p, div
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22676);assertEquals("p",els2.first().tagName());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22677);assertEquals("1", els2.get(1).id());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void testNestedHas() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0offcbshhy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testNestedHas",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22678,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0offcbshhy(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22678);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22679);Document doc = Jsoup.parse("<div><p><span>One</span></p></div> <div><p>Two</p></div>");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22680);Elements divs = doc.select("div:has(p:has(span))");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22681);assertEquals(1, divs.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22682);assertEquals("One", divs.first().text());

        // test matches in has
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22683);divs = doc.select("div:has(p:matches((?i)two))");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22684);assertEquals(1, divs.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22685);assertEquals("div", divs.first().tagName());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22686);assertEquals("Two", divs.first().text());

        // test contains in has
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22687);divs = doc.select("div:has(p:contains(two))");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22688);assertEquals(1, divs.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22689);assertEquals("div", divs.first().tagName());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22690);assertEquals("Two", divs.first().text());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test @MultiLocaleTest public void testPseudoContains() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0fmg8yyhib();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testPseudoContains",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22691,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0fmg8yyhib(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22691);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22692);Document doc = Jsoup.parse("<div><p>The Rain.</p> <p class=light>The <i>RAIN</i>.</p> <p>Rain, the.</p></div>");

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22693);Elements ps1 = doc.select("p:contains(Rain)");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22694);assertEquals(3, ps1.size());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22695);Elements ps2 = doc.select("p:contains(the rain)");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22696);assertEquals(2, ps2.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22697);assertEquals("The Rain.", ps2.first().html());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22698);assertEquals("The <i>RAIN</i>.", ps2.last().html());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22699);Elements ps3 = doc.select("p:contains(the Rain):has(i)");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22700);assertEquals(1, ps3.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22701);assertEquals("light", ps3.first().className());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22702);Elements ps4 = doc.select(".light:contains(rain)");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22703);assertEquals(1, ps4.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22704);assertEquals("light", ps3.first().className());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22705);Elements ps5 = doc.select(":contains(rain)");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22706);assertEquals(8, ps5.size()); // html, body, div,...

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22707);Elements ps6 = doc.select(":contains(RAIN)");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22708);assertEquals(8, ps6.size());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void testPsuedoContainsWithParentheses() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0aupjjohit();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testPsuedoContainsWithParentheses",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22709,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0aupjjohit(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22709);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22710);Document doc = Jsoup.parse("<div><p id=1>This (is good)</p><p id=2>This is bad)</p>");

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22711);Elements ps1 = doc.select("p:contains(this (is good))");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22712);assertEquals(1, ps1.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22713);assertEquals("1", ps1.first().id());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22714);Elements ps2 = doc.select("p:contains(this is bad\\))");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22715);assertEquals(1, ps2.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22716);assertEquals("2", ps2.first().id());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test @MultiLocaleTest public void containsOwn() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0orvgb2hj1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.containsOwn",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22717,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0orvgb2hj1(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22717);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22718);Document doc = Jsoup.parse("<p id=1>Hello <b>there</b> igor</p>");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22719);Elements ps = doc.select("p:containsOwn(Hello IGOR)");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22720);assertEquals(1, ps.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22721);assertEquals("1", ps.first().id());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22722);assertEquals(0, doc.select("p:containsOwn(there)").size());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22723);Document doc2 = Jsoup.parse("<p>Hello <b>there</b> IGOR</p>");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22724);assertEquals(1, doc2.select("p:containsOwn(igor)").size());

    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void testMatches() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0asg2nchj9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testMatches",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22725,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0asg2nchj9(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22725);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22726);Document doc = Jsoup.parse("<p id=1>The <i>Rain</i></p> <p id=2>There are 99 bottles.</p> <p id=3>Harder (this)</p> <p id=4>Rain</p>");

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22727);Elements p1 = doc.select("p:matches(The rain)"); // no match, case sensitive
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22728);assertEquals(0, p1.size());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22729);Elements p2 = doc.select("p:matches((?i)the rain)"); // case insense. should include root, html, body
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22730);assertEquals(1, p2.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22731);assertEquals("1", p2.first().id());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22732);Elements p4 = doc.select("p:matches((?i)^rain$)"); // bounding
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22733);assertEquals(1, p4.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22734);assertEquals("4", p4.first().id());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22735);Elements p5 = doc.select("p:matches(\\d+)");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22736);assertEquals(1, p5.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22737);assertEquals("2", p5.first().id());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22738);Elements p6 = doc.select("p:matches(\\w+\\s+\\(\\w+\\))"); // test bracket matching
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22739);assertEquals(1, p6.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22740);assertEquals("3", p6.first().id());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22741);Elements p7 = doc.select("p:matches((?i)the):has(i)"); // multi
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22742);assertEquals(1, p7.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22743);assertEquals("1", p7.first().id());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void matchesOwn() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0335f0ahjs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.matchesOwn",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22744,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0335f0ahjs(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22744);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22745);Document doc = Jsoup.parse("<p id=1>Hello <b>there</b> now</p>");

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22746);Elements p1 = doc.select("p:matchesOwn((?i)hello now)");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22747);assertEquals(1, p1.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22748);assertEquals("1", p1.first().id());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22749);assertEquals(0, doc.select("p:matchesOwn(there)").size());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void testRelaxedTags() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0xulrwjhjy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testRelaxedTags",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22750,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0xulrwjhjy(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22750);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22751);Document doc = Jsoup.parse("<abc_def id=1>Hello</abc_def> <abc-def id=2>There</abc-def>");

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22752);Elements el1 = doc.select("abc_def");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22753);assertEquals(1, el1.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22754);assertEquals("1", el1.first().id());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22755);Elements el2 = doc.select("abc-def");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22756);assertEquals(1, el2.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22757);assertEquals("2", el2.first().id());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void notParas() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0xc3phjhk6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.notParas",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22758,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0xc3phjhk6(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22758);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22759);Document doc = Jsoup.parse("<p id=1>One</p> <p>Two</p> <p><span>Three</span></p>");

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22760);Elements el1 = doc.select("p:not([id=1])");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22761);assertEquals(2, el1.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22762);assertEquals("Two", el1.first().text());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22763);assertEquals("Three", el1.last().text());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22764);Elements el2 = doc.select("p:not(:has(span))");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22765);assertEquals(2, el2.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22766);assertEquals("One", el2.first().text());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22767);assertEquals("Two", el2.last().text());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void notAll() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22768);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0i9zfsbhkg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.notAll",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22768,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0i9zfsbhkg(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22768);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22769);Document doc = Jsoup.parse("<p>Two</p> <p><span>Three</span></p>");

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22770);Elements el1 = doc.body().select(":not(p)"); // should just be the span
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22771);assertEquals(2, el1.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22772);assertEquals("body", el1.first().tagName());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22773);assertEquals("span", el1.last().tagName());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void notClass() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22774);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0j0a0hghkm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.notClass",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22774,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0j0a0hghkm(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22774);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22775);Document doc = Jsoup.parse("<div class=left>One</div><div class=right id=1><p>Two</p></div>");

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22776);Elements el1 = doc.select("div:not(.left)");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22777);assertEquals(1, el1.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22778);assertEquals("1", el1.first().id());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void handlesCommasInSelector() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22779);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0udv46khkr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.handlesCommasInSelector",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22779,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0udv46khkr(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22779);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22780);Document doc = Jsoup.parse("<p name='1,2'>One</p><div>Two</div><ol><li>123</li><li>Text</li></ol>");

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22781);Elements ps = doc.select("[name=1,2]");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22782);assertEquals(1, ps.size());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22783);Elements containers = doc.select("div, li:matches([0-9,]+)");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22784);assertEquals(2, containers.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22785);assertEquals("div", containers.get(0).tagName());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22786);assertEquals("li", containers.get(1).tagName());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22787);assertEquals("123", containers.get(1).text());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void selectSupplementaryCharacter() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22788);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_01bl5dvhl0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.selectSupplementaryCharacter",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22788,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_01bl5dvhl0(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22788);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22789);String s = new String(Character.toChars(135361));
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22790);Document doc = Jsoup.parse("<div k" + s + "='" + s + "'>^" + s +"$/div>");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22791);assertEquals("div", doc.select("div[k" + s + "]").first().tagName());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22792);assertEquals("div", doc.select("div:containsOwn(" + s + ")").first().tagName());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}
    
    @Test
    public void selectClassWithSpace() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_02txplhhl5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.selectClassWithSpace",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22793,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_02txplhhl5(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22793);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22794);final String html = "<div class=\"value\">class without space</div>\n"
                          + "<div class=\"value \">class with space</div>";
        
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22795);Document doc = Jsoup.parse(html);
        
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22796);Elements found = doc.select("div[class=value ]");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22797);assertEquals(2, found.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22798);assertEquals("class without space", found.get(0).text());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22799);assertEquals("class with space", found.get(1).text());
        
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22800);found = doc.select("div[class=\"value \"]");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22801);assertEquals(2, found.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22802);assertEquals("class without space", found.get(0).text());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22803);assertEquals("class with space", found.get(1).text());
        
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22804);found = doc.select("div[class=\"value\\ \"]");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22805);assertEquals(0, found.size());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void selectSameElements() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22806);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0gr8wu8hli();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.selectSameElements",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22806,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0gr8wu8hli(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22806);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22807);final String html = "<div>one</div><div>one</div>";

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22808);Document doc = Jsoup.parse(html);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22809);Elements els = doc.select("div");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22810);assertEquals(2, els.size());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22811);Elements subSelect = els.select(":contains(one)");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22812);assertEquals(2, subSelect.size());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void attributeWithBrackets() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0uy4kr8hlp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.attributeWithBrackets",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22813,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0uy4kr8hlp(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22813);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22814);String html = "<div data='End]'>One</div> <div data='[Another)]]'>Two</div>";
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22815);Document doc = Jsoup.parse(html);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22816);assertEquals("One", doc.select("div[data='End]']").first().text());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22817);assertEquals("Two", doc.select("div[data='[Another)]]']").first().text());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22818);assertEquals("One", doc.select("div[data=\"End]\"]").first().text());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22819);assertEquals("Two", doc.select("div[data=\"[Another)]]\"]").first().text());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test @MultiLocaleTest public void containsData() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_011xncghlw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.containsData",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22820,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_011xncghlw(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22820);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22821);String html = "<p>function</p><script>FUNCTION</script><style>item</style><span><!-- comments --></span>";
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22822);Document doc = Jsoup.parse(html);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22823);Element body = doc.body();

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22824);Elements dataEls1 = body.select(":containsData(function)");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22825);Elements dataEls2 = body.select("script:containsData(function)");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22826);Elements dataEls3 = body.select("span:containsData(comments)");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22827);Elements dataEls4 = body.select(":containsData(o)");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22828);Elements dataEls5 = body.select("style:containsData(ITEM)");

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22829);assertEquals(2, dataEls1.size()); // body and script
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22830);assertEquals(1, dataEls2.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22831);assertEquals(dataEls1.last(), dataEls2.first());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22832);assertEquals("<script>FUNCTION</script>", dataEls2.outerHtml());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22833);assertEquals(1, dataEls3.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22834);assertEquals("span", dataEls3.first().tagName());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22835);assertEquals(3, dataEls4.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22836);assertEquals("body", dataEls4.first().tagName());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22837);assertEquals("script", dataEls4.get(1).tagName());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22838);assertEquals("span", dataEls4.get(2).tagName());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22839);assertEquals(1, dataEls5.size());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void containsWithQuote() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_048jwyqhmg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.containsWithQuote",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22840,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_048jwyqhmg(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22840);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22841);String html = "<p>One'One</p><p>One'Two</p>";
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22842);Document doc = Jsoup.parse(html);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22843);Elements els = doc.select("p:contains(One\\'One)");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22844);assertEquals(1, els.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22845);assertEquals("One'One", els.text());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void selectFirst() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0l687c5hmm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.selectFirst",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22846,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0l687c5hmm(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22846);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22847);String html = "<p>One<p>Two<p>Three";
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22848);Document doc = Jsoup.parse(html);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22849);assertEquals("One", doc.selectFirst("p").text());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void selectFirstWithAnd() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22850);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_08z40ykhmq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.selectFirstWithAnd",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22850,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_08z40ykhmq(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22850);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22851);String html = "<p>One<p class=foo>Two<p>Three";
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22852);Document doc = Jsoup.parse(html);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22853);assertEquals("Two", doc.selectFirst("p.foo").text());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void selectFirstWithOr() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_07eyb6shmu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.selectFirstWithOr",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22854,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_07eyb6shmu(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22854);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22855);String html = "<p>One<p>Two<p>Three<div>Four";
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22856);Document doc = Jsoup.parse(html);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22857);assertEquals("One", doc.selectFirst("p, div").text());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void matchText() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ud1daxhmy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.matchText",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22858,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ud1daxhmy(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22858);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22859);String html = "<p>One<br>Two</p>";
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22860);Document doc = Jsoup.parse(html);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22861);String origHtml = doc.html();

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22862);Elements one = doc.select("p:matchText:first-child");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22863);assertEquals("One", one.first().text());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22864);Elements two = doc.select("p:matchText:last-child");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22865);assertEquals("Two", two.first().text());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22866);assertEquals(origHtml, doc.html());

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22867);assertEquals("Two", doc.select("p:matchText + br + *").text());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void splitOnBr() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0avl59shn8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.splitOnBr",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22868,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0avl59shn8(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22868);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22869);String html = "<div><p>One<br>Two<br>Three</p></div>";
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22870);Document doc = Jsoup.parse(html);

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22871);Elements els = doc.select("p:matchText");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22872);assertEquals(3, els.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22873);assertEquals("One", els.get(0).text());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22874);assertEquals("Two", els.get(1).text());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22875);assertEquals("Three", els.get(2).toString());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void matchTextAttributes() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0itoaj4hng();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.matchTextAttributes",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22876,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0itoaj4hng(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22876);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22877);Document doc = Jsoup.parse("<div><p class=one>One<br>Two<p class=two>Three<br>Four");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22878);Elements els = doc.select("p.two:matchText:last-child");

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22879);assertEquals(1, els.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22880);assertEquals("Four", els.text());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}

    @Test public void findBetweenSpan() {__CLR4_2_0h7zh7zlnxz23af.R.globalSliceStart(getClass().getName(),22881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0qrw5b4hnl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0h7zh7zlnxz23af.R.rethrow($CLV_t2$);}finally{__CLR4_2_0h7zh7zlnxz23af.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.findBetweenSpan",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22881,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0qrw5b4hnl(){try{__CLR4_2_0h7zh7zlnxz23af.R.inc(22881);
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22882);Document doc = Jsoup.parse("<p><span>One</span> Two <span>Three</span>");
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22883);Elements els = doc.select("span ~ p:matchText"); // the Two becomes its own p, sibling of the span

        __CLR4_2_0h7zh7zlnxz23af.R.inc(22884);assertEquals(1, els.size());
        __CLR4_2_0h7zh7zlnxz23af.R.inc(22885);assertEquals("Two", els.text());
    }finally{__CLR4_2_0h7zh7zlnxz23af.R.flushNeeded();}}
}
