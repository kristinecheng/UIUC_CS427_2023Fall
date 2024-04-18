/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.nodes;

import org.junit.Test;

import java.util.Iterator;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Tests for Attributes.
 *
 * @author Jonathan Hedley
 */
public class AttributesTest {static class __CLR4_2_0e4ce4clnxz2366{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767707166L,8589935092L,18399,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void html() {__CLR4_2_0e4ce4clnxz2366.R.globalSliceStart(getClass().getName(),18300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0p3af0ye4c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e4ce4clnxz2366.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e4ce4clnxz2366.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.AttributesTest.html",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18300,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0p3af0ye4c(){try{__CLR4_2_0e4ce4clnxz2366.R.inc(18300);
        __CLR4_2_0e4ce4clnxz2366.R.inc(18301);Attributes a = new Attributes();
        __CLR4_2_0e4ce4clnxz2366.R.inc(18302);a.put("Tot", "a&p");
        __CLR4_2_0e4ce4clnxz2366.R.inc(18303);a.put("Hello", "There");
        __CLR4_2_0e4ce4clnxz2366.R.inc(18304);a.put("data-name", "Jsoup");

        __CLR4_2_0e4ce4clnxz2366.R.inc(18305);assertEquals(3, a.size());
        __CLR4_2_0e4ce4clnxz2366.R.inc(18306);assertTrue(a.hasKey("Tot"));
        __CLR4_2_0e4ce4clnxz2366.R.inc(18307);assertTrue(a.hasKey("Hello"));
        __CLR4_2_0e4ce4clnxz2366.R.inc(18308);assertTrue(a.hasKey("data-name"));
        __CLR4_2_0e4ce4clnxz2366.R.inc(18309);assertFalse(a.hasKey("tot"));
        __CLR4_2_0e4ce4clnxz2366.R.inc(18310);assertTrue(a.hasKeyIgnoreCase("tot"));
        __CLR4_2_0e4ce4clnxz2366.R.inc(18311);assertEquals("There", a.getIgnoreCase("hEllo"));

        __CLR4_2_0e4ce4clnxz2366.R.inc(18312);Map<String, String> dataset = a.dataset();
        __CLR4_2_0e4ce4clnxz2366.R.inc(18313);assertEquals(1, dataset.size());
        __CLR4_2_0e4ce4clnxz2366.R.inc(18314);assertEquals("Jsoup", dataset.get("name"));
        __CLR4_2_0e4ce4clnxz2366.R.inc(18315);assertEquals("", a.get("tot"));
        __CLR4_2_0e4ce4clnxz2366.R.inc(18316);assertEquals("a&p", a.get("Tot"));
        __CLR4_2_0e4ce4clnxz2366.R.inc(18317);assertEquals("a&p", a.getIgnoreCase("tot"));

        __CLR4_2_0e4ce4clnxz2366.R.inc(18318);assertEquals(" Tot=\"a&amp;p\" Hello=\"There\" data-name=\"Jsoup\"", a.html());
        __CLR4_2_0e4ce4clnxz2366.R.inc(18319);assertEquals(a.html(), a.toString());
    }finally{__CLR4_2_0e4ce4clnxz2366.R.flushNeeded();}}

    @Test
    public void testIteratorRemovable() {__CLR4_2_0e4ce4clnxz2366.R.globalSliceStart(getClass().getName(),18320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0uktq4ie4w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e4ce4clnxz2366.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e4ce4clnxz2366.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.AttributesTest.testIteratorRemovable",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18320,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0uktq4ie4w(){try{__CLR4_2_0e4ce4clnxz2366.R.inc(18320);
        __CLR4_2_0e4ce4clnxz2366.R.inc(18321);Attributes a = new Attributes();
        __CLR4_2_0e4ce4clnxz2366.R.inc(18322);a.put("Tot", "a&p");
        __CLR4_2_0e4ce4clnxz2366.R.inc(18323);a.put("Hello", "There");
        __CLR4_2_0e4ce4clnxz2366.R.inc(18324);a.put("data-name", "Jsoup");
        __CLR4_2_0e4ce4clnxz2366.R.inc(18325);assertTrue(a.hasKey("Tot"));

        __CLR4_2_0e4ce4clnxz2366.R.inc(18326);Iterator<Attribute> iterator = a.iterator();
        __CLR4_2_0e4ce4clnxz2366.R.inc(18327);Attribute attr = iterator.next();
        __CLR4_2_0e4ce4clnxz2366.R.inc(18328);assertEquals("Tot", attr.getKey());
        __CLR4_2_0e4ce4clnxz2366.R.inc(18329);iterator.remove();
        __CLR4_2_0e4ce4clnxz2366.R.inc(18330);assertEquals(2, a.size());
        __CLR4_2_0e4ce4clnxz2366.R.inc(18331);attr = iterator.next();
        __CLR4_2_0e4ce4clnxz2366.R.inc(18332);assertEquals("Hello", attr.getKey());
        __CLR4_2_0e4ce4clnxz2366.R.inc(18333);assertEquals("There", attr.getValue());

        // make sure that's flowing to the underlying attributes object
        __CLR4_2_0e4ce4clnxz2366.R.inc(18334);assertEquals(2, a.size());
        __CLR4_2_0e4ce4clnxz2366.R.inc(18335);assertEquals("There", a.get("Hello"));
        __CLR4_2_0e4ce4clnxz2366.R.inc(18336);assertFalse(a.hasKey("Tot"));
    }finally{__CLR4_2_0e4ce4clnxz2366.R.flushNeeded();}}

    @Test
    public void testIteratorUpdateable() {__CLR4_2_0e4ce4clnxz2366.R.globalSliceStart(getClass().getName(),18337);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_04yhgl2e5d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e4ce4clnxz2366.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e4ce4clnxz2366.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.AttributesTest.testIteratorUpdateable",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18337,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_04yhgl2e5d(){try{__CLR4_2_0e4ce4clnxz2366.R.inc(18337);
        __CLR4_2_0e4ce4clnxz2366.R.inc(18338);Attributes a = new Attributes();
        __CLR4_2_0e4ce4clnxz2366.R.inc(18339);a.put("Tot", "a&p");
        __CLR4_2_0e4ce4clnxz2366.R.inc(18340);a.put("Hello", "There");

        __CLR4_2_0e4ce4clnxz2366.R.inc(18341);assertFalse(a.hasKey("Foo"));
        __CLR4_2_0e4ce4clnxz2366.R.inc(18342);Iterator<Attribute> iterator = a.iterator();
        __CLR4_2_0e4ce4clnxz2366.R.inc(18343);Attribute attr = iterator.next();
        __CLR4_2_0e4ce4clnxz2366.R.inc(18344);attr.setKey("Foo");
        __CLR4_2_0e4ce4clnxz2366.R.inc(18345);attr = iterator.next();
        __CLR4_2_0e4ce4clnxz2366.R.inc(18346);attr.setKey("Bar");
        __CLR4_2_0e4ce4clnxz2366.R.inc(18347);attr.setValue("Qux");

        __CLR4_2_0e4ce4clnxz2366.R.inc(18348);assertEquals("a&p", a.get("Foo"));
        __CLR4_2_0e4ce4clnxz2366.R.inc(18349);assertEquals("Qux", a.get("Bar"));
        __CLR4_2_0e4ce4clnxz2366.R.inc(18350);assertFalse(a.hasKey("Tot"));
        __CLR4_2_0e4ce4clnxz2366.R.inc(18351);assertFalse(a.hasKey("Hello"));
    }finally{__CLR4_2_0e4ce4clnxz2366.R.flushNeeded();}}

    @Test public void testIteratorHasNext() {__CLR4_2_0e4ce4clnxz2366.R.globalSliceStart(getClass().getName(),18352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0lv4y6se5s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e4ce4clnxz2366.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e4ce4clnxz2366.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.AttributesTest.testIteratorHasNext",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18352,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0lv4y6se5s(){try{__CLR4_2_0e4ce4clnxz2366.R.inc(18352);
        __CLR4_2_0e4ce4clnxz2366.R.inc(18353);Attributes a = new Attributes();
        __CLR4_2_0e4ce4clnxz2366.R.inc(18354);a.put("Tot", "1");
        __CLR4_2_0e4ce4clnxz2366.R.inc(18355);a.put("Hello", "2");
        __CLR4_2_0e4ce4clnxz2366.R.inc(18356);a.put("data-name", "3");

        __CLR4_2_0e4ce4clnxz2366.R.inc(18357);int seen = 0;
        __CLR4_2_0e4ce4clnxz2366.R.inc(18358);for (Attribute attribute : a) {{
            __CLR4_2_0e4ce4clnxz2366.R.inc(18359);seen++;
            __CLR4_2_0e4ce4clnxz2366.R.inc(18360);assertEquals(String.valueOf(seen), attribute.getValue());
        }
        }__CLR4_2_0e4ce4clnxz2366.R.inc(18361);assertEquals(3, seen);
    }finally{__CLR4_2_0e4ce4clnxz2366.R.flushNeeded();}}

    @Test
    public void testIterator() {__CLR4_2_0e4ce4clnxz2366.R.globalSliceStart(getClass().getName(),18362);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0d9uicne62();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e4ce4clnxz2366.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e4ce4clnxz2366.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.AttributesTest.testIterator",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18362,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0d9uicne62(){try{__CLR4_2_0e4ce4clnxz2366.R.inc(18362);
        __CLR4_2_0e4ce4clnxz2366.R.inc(18363);Attributes a = new Attributes();
        __CLR4_2_0e4ce4clnxz2366.R.inc(18364);String[][] datas = {{"Tot", "raul"},
            {"Hello", "pismuth"},
            {"data-name", "Jsoup"}};
        __CLR4_2_0e4ce4clnxz2366.R.inc(18365);for (String[] atts : datas) {{
            __CLR4_2_0e4ce4clnxz2366.R.inc(18366);a.put(atts[0], atts[1]);
        }

        }__CLR4_2_0e4ce4clnxz2366.R.inc(18367);Iterator<Attribute> iterator = a.iterator();
        __CLR4_2_0e4ce4clnxz2366.R.inc(18368);assertTrue(iterator.hasNext());
        __CLR4_2_0e4ce4clnxz2366.R.inc(18369);int i = 0;
        __CLR4_2_0e4ce4clnxz2366.R.inc(18370);for (Attribute attribute : a) {{
            __CLR4_2_0e4ce4clnxz2366.R.inc(18371);assertEquals(datas[i][0], attribute.getKey());
            __CLR4_2_0e4ce4clnxz2366.R.inc(18372);assertEquals(datas[i][1], attribute.getValue());
            __CLR4_2_0e4ce4clnxz2366.R.inc(18373);i++;
        }
        }__CLR4_2_0e4ce4clnxz2366.R.inc(18374);assertEquals(datas.length, i);
    }finally{__CLR4_2_0e4ce4clnxz2366.R.flushNeeded();}}

    @Test
    public void testIteratorEmpty() {__CLR4_2_0e4ce4clnxz2366.R.globalSliceStart(getClass().getName(),18375);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0hj65vwe6f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e4ce4clnxz2366.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e4ce4clnxz2366.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.AttributesTest.testIteratorEmpty",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18375,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0hj65vwe6f(){try{__CLR4_2_0e4ce4clnxz2366.R.inc(18375);
        __CLR4_2_0e4ce4clnxz2366.R.inc(18376);Attributes a = new Attributes();

        __CLR4_2_0e4ce4clnxz2366.R.inc(18377);Iterator<Attribute> iterator = a.iterator();
        __CLR4_2_0e4ce4clnxz2366.R.inc(18378);assertFalse(iterator.hasNext());
    }finally{__CLR4_2_0e4ce4clnxz2366.R.flushNeeded();}}

    @Test
    public void removeCaseSensitive() {__CLR4_2_0e4ce4clnxz2366.R.globalSliceStart(getClass().getName(),18379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0714p1ze6j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e4ce4clnxz2366.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e4ce4clnxz2366.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.AttributesTest.removeCaseSensitive",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18379,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0714p1ze6j(){try{__CLR4_2_0e4ce4clnxz2366.R.inc(18379);
        __CLR4_2_0e4ce4clnxz2366.R.inc(18380);Attributes a = new Attributes();
        __CLR4_2_0e4ce4clnxz2366.R.inc(18381);a.put("Tot", "a&p");
        __CLR4_2_0e4ce4clnxz2366.R.inc(18382);a.put("tot", "one");
        __CLR4_2_0e4ce4clnxz2366.R.inc(18383);a.put("Hello", "There");
        __CLR4_2_0e4ce4clnxz2366.R.inc(18384);a.put("hello", "There");
        __CLR4_2_0e4ce4clnxz2366.R.inc(18385);a.put("data-name", "Jsoup");

        __CLR4_2_0e4ce4clnxz2366.R.inc(18386);assertEquals(5, a.size());
        __CLR4_2_0e4ce4clnxz2366.R.inc(18387);a.remove("Tot");
        __CLR4_2_0e4ce4clnxz2366.R.inc(18388);a.remove("Hello");
        __CLR4_2_0e4ce4clnxz2366.R.inc(18389);assertEquals(3, a.size());
        __CLR4_2_0e4ce4clnxz2366.R.inc(18390);assertTrue(a.hasKey("tot"));
        __CLR4_2_0e4ce4clnxz2366.R.inc(18391);assertFalse(a.hasKey("Tot"));
    }finally{__CLR4_2_0e4ce4clnxz2366.R.flushNeeded();}}

    @Test
    public void testSetKeyConsistency() {__CLR4_2_0e4ce4clnxz2366.R.globalSliceStart(getClass().getName(),18392);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0vwk9w0e6w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e4ce4clnxz2366.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e4ce4clnxz2366.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.AttributesTest.testSetKeyConsistency",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18392,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0vwk9w0e6w(){try{__CLR4_2_0e4ce4clnxz2366.R.inc(18392);
        __CLR4_2_0e4ce4clnxz2366.R.inc(18393);Attributes a = new Attributes();
        __CLR4_2_0e4ce4clnxz2366.R.inc(18394);a.put("a", "a");
        __CLR4_2_0e4ce4clnxz2366.R.inc(18395);for(Attribute at : a) {{
            __CLR4_2_0e4ce4clnxz2366.R.inc(18396);at.setKey("b");
        }
        }__CLR4_2_0e4ce4clnxz2366.R.inc(18397);assertFalse("Attribute 'a' not correctly removed", a.hasKey("a"));
        __CLR4_2_0e4ce4clnxz2366.R.inc(18398);assertTrue("Attribute 'b' not present after renaming", a.hasKey("b"));
    }finally{__CLR4_2_0e4ce4clnxz2366.R.flushNeeded();}}
}
