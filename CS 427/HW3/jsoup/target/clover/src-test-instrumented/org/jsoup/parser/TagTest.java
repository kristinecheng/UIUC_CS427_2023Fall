/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.parser;

import org.jsoup.MultiLocaleRule;
import org.jsoup.MultiLocaleRule.MultiLocaleTest;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 Tag tests.
 @author Jonathan Hedley, jonathan@hedley.net */
public class TagTest {static class __CLR4_2_0gecgeclnxz238y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767707166L,8589935092L,21292,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Rule public MultiLocaleRule rule = new MultiLocaleRule();

    @Test public void isCaseSensitive() {__CLR4_2_0gecgeclnxz238y.R.globalSliceStart(getClass().getName(),21252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0sp5ywtgec();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gecgeclnxz238y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gecgeclnxz238y.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TagTest.isCaseSensitive",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21252,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0sp5ywtgec(){try{__CLR4_2_0gecgeclnxz238y.R.inc(21252);
        __CLR4_2_0gecgeclnxz238y.R.inc(21253);Tag p1 = Tag.valueOf("P");
        __CLR4_2_0gecgeclnxz238y.R.inc(21254);Tag p2 = Tag.valueOf("p");
        __CLR4_2_0gecgeclnxz238y.R.inc(21255);assertFalse(p1.equals(p2));
    }finally{__CLR4_2_0gecgeclnxz238y.R.flushNeeded();}}

    @Test @MultiLocaleTest public void canBeInsensitive() {__CLR4_2_0gecgeclnxz238y.R.globalSliceStart(getClass().getName(),21256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0neopk5geg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gecgeclnxz238y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gecgeclnxz238y.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TagTest.canBeInsensitive",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21256,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0neopk5geg(){try{__CLR4_2_0gecgeclnxz238y.R.inc(21256);
        __CLR4_2_0gecgeclnxz238y.R.inc(21257);Tag script1 = Tag.valueOf("script", ParseSettings.htmlDefault);
        __CLR4_2_0gecgeclnxz238y.R.inc(21258);Tag script2 = Tag.valueOf("SCRIPT", ParseSettings.htmlDefault);
        __CLR4_2_0gecgeclnxz238y.R.inc(21259);assertSame(script1, script2);
    }finally{__CLR4_2_0gecgeclnxz238y.R.flushNeeded();}}

    @Test public void trims() {__CLR4_2_0gecgeclnxz238y.R.globalSliceStart(getClass().getName(),21260);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0o9f06wgek();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gecgeclnxz238y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gecgeclnxz238y.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TagTest.trims",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21260,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0o9f06wgek(){try{__CLR4_2_0gecgeclnxz238y.R.inc(21260);
        __CLR4_2_0gecgeclnxz238y.R.inc(21261);Tag p1 = Tag.valueOf("p");
        __CLR4_2_0gecgeclnxz238y.R.inc(21262);Tag p2 = Tag.valueOf(" p ");
        __CLR4_2_0gecgeclnxz238y.R.inc(21263);assertEquals(p1, p2);
    }finally{__CLR4_2_0gecgeclnxz238y.R.flushNeeded();}}

    @Test public void equality() {__CLR4_2_0gecgeclnxz238y.R.globalSliceStart(getClass().getName(),21264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0v5v6ypgeo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gecgeclnxz238y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gecgeclnxz238y.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TagTest.equality",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21264,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0v5v6ypgeo(){try{__CLR4_2_0gecgeclnxz238y.R.inc(21264);
        __CLR4_2_0gecgeclnxz238y.R.inc(21265);Tag p1 = Tag.valueOf("p");
        __CLR4_2_0gecgeclnxz238y.R.inc(21266);Tag p2 = Tag.valueOf("p");
        __CLR4_2_0gecgeclnxz238y.R.inc(21267);assertTrue(p1.equals(p2));
        __CLR4_2_0gecgeclnxz238y.R.inc(21268);assertTrue(p1 == p2);
    }finally{__CLR4_2_0gecgeclnxz238y.R.flushNeeded();}}

    @Test public void divSemantics() {__CLR4_2_0gecgeclnxz238y.R.globalSliceStart(getClass().getName(),21269);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0fcm277get();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gecgeclnxz238y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gecgeclnxz238y.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TagTest.divSemantics",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21269,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0fcm277get(){try{__CLR4_2_0gecgeclnxz238y.R.inc(21269);
        __CLR4_2_0gecgeclnxz238y.R.inc(21270);Tag div = Tag.valueOf("div");

        __CLR4_2_0gecgeclnxz238y.R.inc(21271);assertTrue(div.isBlock());
        __CLR4_2_0gecgeclnxz238y.R.inc(21272);assertTrue(div.formatAsBlock());
    }finally{__CLR4_2_0gecgeclnxz238y.R.flushNeeded();}}

    @Test public void pSemantics() {__CLR4_2_0gecgeclnxz238y.R.globalSliceStart(getClass().getName(),21273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_02nfu64gex();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gecgeclnxz238y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gecgeclnxz238y.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TagTest.pSemantics",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21273,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_02nfu64gex(){try{__CLR4_2_0gecgeclnxz238y.R.inc(21273);
        __CLR4_2_0gecgeclnxz238y.R.inc(21274);Tag p = Tag.valueOf("p");

        __CLR4_2_0gecgeclnxz238y.R.inc(21275);assertTrue(p.isBlock());
        __CLR4_2_0gecgeclnxz238y.R.inc(21276);assertFalse(p.formatAsBlock());
    }finally{__CLR4_2_0gecgeclnxz238y.R.flushNeeded();}}

    @Test public void imgSemantics() {__CLR4_2_0gecgeclnxz238y.R.globalSliceStart(getClass().getName(),21277);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0siqy9dgf1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gecgeclnxz238y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gecgeclnxz238y.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TagTest.imgSemantics",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21277,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0siqy9dgf1(){try{__CLR4_2_0gecgeclnxz238y.R.inc(21277);
        __CLR4_2_0gecgeclnxz238y.R.inc(21278);Tag img = Tag.valueOf("img");
        __CLR4_2_0gecgeclnxz238y.R.inc(21279);assertTrue(img.isInline());
        __CLR4_2_0gecgeclnxz238y.R.inc(21280);assertTrue(img.isSelfClosing());
        __CLR4_2_0gecgeclnxz238y.R.inc(21281);assertFalse(img.isBlock());
    }finally{__CLR4_2_0gecgeclnxz238y.R.flushNeeded();}}

    @Test public void defaultSemantics() {__CLR4_2_0gecgeclnxz238y.R.globalSliceStart(getClass().getName(),21282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0mu7nkdgf6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gecgeclnxz238y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gecgeclnxz238y.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TagTest.defaultSemantics",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21282,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0mu7nkdgf6(){try{__CLR4_2_0gecgeclnxz238y.R.inc(21282);
        __CLR4_2_0gecgeclnxz238y.R.inc(21283);Tag foo = Tag.valueOf("FOO"); // not defined
        __CLR4_2_0gecgeclnxz238y.R.inc(21284);Tag foo2 = Tag.valueOf("FOO");

        __CLR4_2_0gecgeclnxz238y.R.inc(21285);assertEquals(foo, foo2);
        __CLR4_2_0gecgeclnxz238y.R.inc(21286);assertTrue(foo.isInline());
        __CLR4_2_0gecgeclnxz238y.R.inc(21287);assertTrue(foo.formatAsBlock());
    }finally{__CLR4_2_0gecgeclnxz238y.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class) public void valueOfChecksNotNull() {__CLR4_2_0gecgeclnxz238y.R.globalSliceStart(getClass().getName(),21288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ogix1ugfc();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,118,97,108,117,101,79,102,67,104,101,99,107,115,78,111,116,78,117,108,108,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gecgeclnxz238y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gecgeclnxz238y.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TagTest.valueOfChecksNotNull",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21288,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ogix1ugfc(){try{__CLR4_2_0gecgeclnxz238y.R.inc(21288);
        __CLR4_2_0gecgeclnxz238y.R.inc(21289);Tag.valueOf(null);
    }finally{__CLR4_2_0gecgeclnxz238y.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class) public void valueOfChecksNotEmpty() {__CLR4_2_0gecgeclnxz238y.R.globalSliceStart(getClass().getName(),21290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0eebwi4gfe();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,118,97,108,117,101,79,102,67,104,101,99,107,115,78,111,116,69,109,112,116,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gecgeclnxz238y.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gecgeclnxz238y.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TagTest.valueOfChecksNotEmpty",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21290,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0eebwi4gfe(){try{__CLR4_2_0gecgeclnxz238y.R.inc(21290);
        __CLR4_2_0gecgeclnxz238y.R.inc(21291);Tag.valueOf(" ");
    }finally{__CLR4_2_0gecgeclnxz238y.R.flushNeeded();}}
}
