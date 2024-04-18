/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Token queue tests.
 */
public class TokenQueueTest {static class __CLR4_2_0gfggfglnxz2391{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767707166L,8589935092L,21350,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test public void chompBalanced() {__CLR4_2_0gfggfglnxz2391.R.globalSliceStart(getClass().getName(),21292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0nznrdwgfg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gfggfglnxz2391.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gfggfglnxz2391.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokenQueueTest.chompBalanced",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21292,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0nznrdwgfg(){try{__CLR4_2_0gfggfglnxz2391.R.inc(21292);
        __CLR4_2_0gfggfglnxz2391.R.inc(21293);TokenQueue tq = new TokenQueue(":contains(one (two) three) four");
        __CLR4_2_0gfggfglnxz2391.R.inc(21294);String pre = tq.consumeTo("(");
        __CLR4_2_0gfggfglnxz2391.R.inc(21295);String guts = tq.chompBalanced('(', ')');
        __CLR4_2_0gfggfglnxz2391.R.inc(21296);String remainder = tq.remainder();

        __CLR4_2_0gfggfglnxz2391.R.inc(21297);assertEquals(":contains", pre);
        __CLR4_2_0gfggfglnxz2391.R.inc(21298);assertEquals("one (two) three", guts);
        __CLR4_2_0gfggfglnxz2391.R.inc(21299);assertEquals(" four", remainder);
    }finally{__CLR4_2_0gfggfglnxz2391.R.flushNeeded();}}

    @Test public void chompEscapedBalanced() {__CLR4_2_0gfggfglnxz2391.R.globalSliceStart(getClass().getName(),21300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0eylpnpgfo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gfggfglnxz2391.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gfggfglnxz2391.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokenQueueTest.chompEscapedBalanced",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21300,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0eylpnpgfo(){try{__CLR4_2_0gfggfglnxz2391.R.inc(21300);
        __CLR4_2_0gfggfglnxz2391.R.inc(21301);TokenQueue tq = new TokenQueue(":contains(one (two) \\( \\) \\) three) four");
        __CLR4_2_0gfggfglnxz2391.R.inc(21302);String pre = tq.consumeTo("(");
        __CLR4_2_0gfggfglnxz2391.R.inc(21303);String guts = tq.chompBalanced('(', ')');
        __CLR4_2_0gfggfglnxz2391.R.inc(21304);String remainder = tq.remainder();

        __CLR4_2_0gfggfglnxz2391.R.inc(21305);assertEquals(":contains", pre);
        __CLR4_2_0gfggfglnxz2391.R.inc(21306);assertEquals("one (two) \\( \\) \\) three", guts);
        __CLR4_2_0gfggfglnxz2391.R.inc(21307);assertEquals("one (two) ( ) ) three", TokenQueue.unescape(guts));
        __CLR4_2_0gfggfglnxz2391.R.inc(21308);assertEquals(" four", remainder);
    }finally{__CLR4_2_0gfggfglnxz2391.R.flushNeeded();}}

    @Test public void chompBalancedMatchesAsMuchAsPossible() {__CLR4_2_0gfggfglnxz2391.R.globalSliceStart(getClass().getName(),21309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0lqnixlgfx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gfggfglnxz2391.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gfggfglnxz2391.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokenQueueTest.chompBalancedMatchesAsMuchAsPossible",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21309,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0lqnixlgfx(){try{__CLR4_2_0gfggfglnxz2391.R.inc(21309);
        __CLR4_2_0gfggfglnxz2391.R.inc(21310);TokenQueue tq = new TokenQueue("unbalanced(something(or another)) else");
        __CLR4_2_0gfggfglnxz2391.R.inc(21311);tq.consumeTo("(");
        __CLR4_2_0gfggfglnxz2391.R.inc(21312);String match = tq.chompBalanced('(', ')');
        __CLR4_2_0gfggfglnxz2391.R.inc(21313);assertEquals("something(or another)", match);
    }finally{__CLR4_2_0gfggfglnxz2391.R.flushNeeded();}}

    @Test public void unescape() {__CLR4_2_0gfggfglnxz2391.R.globalSliceStart(getClass().getName(),21314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0dbipwfgg2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gfggfglnxz2391.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gfggfglnxz2391.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokenQueueTest.unescape",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21314,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0dbipwfgg2(){try{__CLR4_2_0gfggfglnxz2391.R.inc(21314);
        __CLR4_2_0gfggfglnxz2391.R.inc(21315);assertEquals("one ( ) \\", TokenQueue.unescape("one \\( \\) \\\\"));
    }finally{__CLR4_2_0gfggfglnxz2391.R.flushNeeded();}}

    @Test public void chompToIgnoreCase() {__CLR4_2_0gfggfglnxz2391.R.globalSliceStart(getClass().getName(),21316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0v1a2drgg4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gfggfglnxz2391.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gfggfglnxz2391.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokenQueueTest.chompToIgnoreCase",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21316,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0v1a2drgg4(){try{__CLR4_2_0gfggfglnxz2391.R.inc(21316);
        __CLR4_2_0gfggfglnxz2391.R.inc(21317);String t = "<textarea>one < two </TEXTarea>";
        __CLR4_2_0gfggfglnxz2391.R.inc(21318);TokenQueue tq = new TokenQueue(t);
        __CLR4_2_0gfggfglnxz2391.R.inc(21319);String data = tq.chompToIgnoreCase("</textarea");
        __CLR4_2_0gfggfglnxz2391.R.inc(21320);assertEquals("<textarea>one < two ", data);

        __CLR4_2_0gfggfglnxz2391.R.inc(21321);tq = new TokenQueue("<textarea> one two < three </oops>");
        __CLR4_2_0gfggfglnxz2391.R.inc(21322);data = tq.chompToIgnoreCase("</textarea");
        __CLR4_2_0gfggfglnxz2391.R.inc(21323);assertEquals("<textarea> one two < three </oops>", data);
    }finally{__CLR4_2_0gfggfglnxz2391.R.flushNeeded();}}

    @Test public void addFirst() {__CLR4_2_0gfggfglnxz2391.R.globalSliceStart(getClass().getName(),21324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0crxkayggc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gfggfglnxz2391.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gfggfglnxz2391.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokenQueueTest.addFirst",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21324,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0crxkayggc(){try{__CLR4_2_0gfggfglnxz2391.R.inc(21324);
        __CLR4_2_0gfggfglnxz2391.R.inc(21325);TokenQueue tq = new TokenQueue("One Two");
        __CLR4_2_0gfggfglnxz2391.R.inc(21326);tq.consumeWord();
        __CLR4_2_0gfggfglnxz2391.R.inc(21327);tq.addFirst("Three");
        __CLR4_2_0gfggfglnxz2391.R.inc(21328);assertEquals("Three Two", tq.remainder());
    }finally{__CLR4_2_0gfggfglnxz2391.R.flushNeeded();}}


    @Test public void consumeToIgnoreSecondCallTest() {__CLR4_2_0gfggfglnxz2391.R.globalSliceStart(getClass().getName(),21329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0b1ccgcggh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gfggfglnxz2391.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gfggfglnxz2391.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokenQueueTest.consumeToIgnoreSecondCallTest",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21329,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0b1ccgcggh(){try{__CLR4_2_0gfggfglnxz2391.R.inc(21329);
        __CLR4_2_0gfggfglnxz2391.R.inc(21330);String t = "<textarea>one < two </TEXTarea> third </TEXTarea>";
        __CLR4_2_0gfggfglnxz2391.R.inc(21331);TokenQueue tq = new TokenQueue(t);
        __CLR4_2_0gfggfglnxz2391.R.inc(21332);String data = tq.chompToIgnoreCase("</textarea>");
        __CLR4_2_0gfggfglnxz2391.R.inc(21333);assertEquals("<textarea>one < two ", data);

        __CLR4_2_0gfggfglnxz2391.R.inc(21334);data = tq.chompToIgnoreCase("</textarea>");
        __CLR4_2_0gfggfglnxz2391.R.inc(21335);assertEquals(" third ", data);
    }finally{__CLR4_2_0gfggfglnxz2391.R.flushNeeded();}}

    @Test public void testNestedQuotes() {__CLR4_2_0gfggfglnxz2391.R.globalSliceStart(getClass().getName(),21336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_05whj21ggo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gfggfglnxz2391.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gfggfglnxz2391.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokenQueueTest.testNestedQuotes",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21336,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_05whj21ggo(){try{__CLR4_2_0gfggfglnxz2391.R.inc(21336);
        __CLR4_2_0gfggfglnxz2391.R.inc(21337);validateNestedQuotes("<html><body><a id=\"identifier\" onclick=\"func('arg')\" /></body></html>", "a[onclick*=\"('arg\"]");
        __CLR4_2_0gfggfglnxz2391.R.inc(21338);validateNestedQuotes("<html><body><a id=\"identifier\" onclick=func('arg') /></body></html>", "a[onclick*=\"('arg\"]");
        __CLR4_2_0gfggfglnxz2391.R.inc(21339);validateNestedQuotes("<html><body><a id=\"identifier\" onclick='func(\"arg\")' /></body></html>", "a[onclick*='(\"arg']");
        __CLR4_2_0gfggfglnxz2391.R.inc(21340);validateNestedQuotes("<html><body><a id=\"identifier\" onclick=func(\"arg\") /></body></html>", "a[onclick*='(\"arg']");
    }finally{__CLR4_2_0gfggfglnxz2391.R.flushNeeded();}}

    private static void validateNestedQuotes(String html, String selector) {try{__CLR4_2_0gfggfglnxz2391.R.inc(21341);
        __CLR4_2_0gfggfglnxz2391.R.inc(21342);assertEquals("#identifier", Jsoup.parse(html).select(selector).first().cssSelector());
    }finally{__CLR4_2_0gfggfglnxz2391.R.flushNeeded();}}

    @Test
    public void chompBalancedThrowIllegalArgumentException() throws Exception {__CLR4_2_0gfggfglnxz2391.R.globalSliceStart(getClass().getName(),21343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0mdvpx0ggv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gfggfglnxz2391.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gfggfglnxz2391.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokenQueueTest.chompBalancedThrowIllegalArgumentException",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21343,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0mdvpx0ggv() throws Exception{try{__CLR4_2_0gfggfglnxz2391.R.inc(21343);
        __CLR4_2_0gfggfglnxz2391.R.inc(21344);try {
            __CLR4_2_0gfggfglnxz2391.R.inc(21345);TokenQueue tq = new TokenQueue("unbalanced(something(or another)) else");
            __CLR4_2_0gfggfglnxz2391.R.inc(21346);tq.consumeTo("(");
            __CLR4_2_0gfggfglnxz2391.R.inc(21347);tq.chompBalanced('(', '+');
            __CLR4_2_0gfggfglnxz2391.R.inc(21348);org.junit.Assert.fail("should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            __CLR4_2_0gfggfglnxz2391.R.inc(21349);assertEquals("Did not find balanced marker at \'something(or another)) else\'", expected.getMessage());
        }
    }finally{__CLR4_2_0gfggfglnxz2391.R.flushNeeded();}}
}
