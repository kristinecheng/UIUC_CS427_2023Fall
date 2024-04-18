/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.internal;

import org.jsoup.Jsoup;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.util.Arrays;

import static org.jsoup.internal.StringUtil.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringUtilTest {static class __CLR4_2_08ok8oklnxz22xs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767707166L,8589935092L,11319,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test public void join() {__CLR4_2_08ok8oklnxz22xs.R.globalSliceStart(getClass().getName(),11252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_044lj5d8ok();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08ok8oklnxz22xs.R.rethrow($CLV_t2$);}finally{__CLR4_2_08ok8oklnxz22xs.R.globalSliceEnd(getClass().getName(),"org.jsoup.internal.StringUtilTest.join",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11252,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_044lj5d8ok(){try{__CLR4_2_08ok8oklnxz22xs.R.inc(11252);
        __CLR4_2_08ok8oklnxz22xs.R.inc(11253);assertEquals("", StringUtil.join(Arrays.asList(""), " "));
        __CLR4_2_08ok8oklnxz22xs.R.inc(11254);assertEquals("one", StringUtil.join(Arrays.asList("one"), " "));
        __CLR4_2_08ok8oklnxz22xs.R.inc(11255);assertEquals("one two three", StringUtil.join(Arrays.asList("one", "two", "three"), " "));
    }finally{__CLR4_2_08ok8oklnxz22xs.R.flushNeeded();}}

    @Test public void padding() {__CLR4_2_08ok8oklnxz22xs.R.globalSliceStart(getClass().getName(),11256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0psbu148oo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08ok8oklnxz22xs.R.rethrow($CLV_t2$);}finally{__CLR4_2_08ok8oklnxz22xs.R.globalSliceEnd(getClass().getName(),"org.jsoup.internal.StringUtilTest.padding",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11256,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0psbu148oo(){try{__CLR4_2_08ok8oklnxz22xs.R.inc(11256);
        __CLR4_2_08ok8oklnxz22xs.R.inc(11257);assertEquals("", StringUtil.padding(0));
        __CLR4_2_08ok8oklnxz22xs.R.inc(11258);assertEquals(" ", StringUtil.padding(1));
        __CLR4_2_08ok8oklnxz22xs.R.inc(11259);assertEquals("  ", StringUtil.padding(2));
        __CLR4_2_08ok8oklnxz22xs.R.inc(11260);assertEquals("               ", StringUtil.padding(15));
        __CLR4_2_08ok8oklnxz22xs.R.inc(11261);assertEquals("                                             ", StringUtil.padding(45));
    }finally{__CLR4_2_08ok8oklnxz22xs.R.flushNeeded();}}

    @Test public void paddingInACan() {__CLR4_2_08ok8oklnxz22xs.R.globalSliceStart(getClass().getName(),11262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_04z1c3w8ou();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08ok8oklnxz22xs.R.rethrow($CLV_t2$);}finally{__CLR4_2_08ok8oklnxz22xs.R.globalSliceEnd(getClass().getName(),"org.jsoup.internal.StringUtilTest.paddingInACan",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11262,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_04z1c3w8ou(){try{__CLR4_2_08ok8oklnxz22xs.R.inc(11262);
        __CLR4_2_08ok8oklnxz22xs.R.inc(11263);String[] padding = StringUtil.padding;
        __CLR4_2_08ok8oklnxz22xs.R.inc(11264);assertEquals(21, padding.length);
        __CLR4_2_08ok8oklnxz22xs.R.inc(11265);for (int i = 0; (((i < padding.length)&&(__CLR4_2_08ok8oklnxz22xs.R.iget(11266)!=0|true))||(__CLR4_2_08ok8oklnxz22xs.R.iget(11267)==0&false)); i++) {{
            __CLR4_2_08ok8oklnxz22xs.R.inc(11268);assertEquals(i, padding[i].length());
        }
    }}finally{__CLR4_2_08ok8oklnxz22xs.R.flushNeeded();}}

    @Test public void isBlank() {__CLR4_2_08ok8oklnxz22xs.R.globalSliceStart(getClass().getName(),11269);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0wakoy98p1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08ok8oklnxz22xs.R.rethrow($CLV_t2$);}finally{__CLR4_2_08ok8oklnxz22xs.R.globalSliceEnd(getClass().getName(),"org.jsoup.internal.StringUtilTest.isBlank",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11269,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0wakoy98p1(){try{__CLR4_2_08ok8oklnxz22xs.R.inc(11269);
        __CLR4_2_08ok8oklnxz22xs.R.inc(11270);assertTrue(StringUtil.isBlank(null));
        __CLR4_2_08ok8oklnxz22xs.R.inc(11271);assertTrue(StringUtil.isBlank(""));
        __CLR4_2_08ok8oklnxz22xs.R.inc(11272);assertTrue(StringUtil.isBlank("      "));
        __CLR4_2_08ok8oklnxz22xs.R.inc(11273);assertTrue(StringUtil.isBlank("   \r\n  "));

        __CLR4_2_08ok8oklnxz22xs.R.inc(11274);assertFalse(StringUtil.isBlank("hello"));
        __CLR4_2_08ok8oklnxz22xs.R.inc(11275);assertFalse(StringUtil.isBlank("   hello   "));
    }finally{__CLR4_2_08ok8oklnxz22xs.R.flushNeeded();}}

    @Test public void isNumeric() {__CLR4_2_08ok8oklnxz22xs.R.globalSliceStart(getClass().getName(),11276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0l58yga8p8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08ok8oklnxz22xs.R.rethrow($CLV_t2$);}finally{__CLR4_2_08ok8oklnxz22xs.R.globalSliceEnd(getClass().getName(),"org.jsoup.internal.StringUtilTest.isNumeric",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11276,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0l58yga8p8(){try{__CLR4_2_08ok8oklnxz22xs.R.inc(11276);
        __CLR4_2_08ok8oklnxz22xs.R.inc(11277);assertFalse(StringUtil.isNumeric(null));
        __CLR4_2_08ok8oklnxz22xs.R.inc(11278);assertFalse(StringUtil.isNumeric(" "));
        __CLR4_2_08ok8oklnxz22xs.R.inc(11279);assertFalse(StringUtil.isNumeric("123 546"));
        __CLR4_2_08ok8oklnxz22xs.R.inc(11280);assertFalse(StringUtil.isNumeric("hello"));
        __CLR4_2_08ok8oklnxz22xs.R.inc(11281);assertFalse(StringUtil.isNumeric("123.334"));

        __CLR4_2_08ok8oklnxz22xs.R.inc(11282);assertTrue(StringUtil.isNumeric("1"));
        __CLR4_2_08ok8oklnxz22xs.R.inc(11283);assertTrue(StringUtil.isNumeric("1234"));
    }finally{__CLR4_2_08ok8oklnxz22xs.R.flushNeeded();}}

    @Test public void isWhitespace() {__CLR4_2_08ok8oklnxz22xs.R.globalSliceStart(getClass().getName(),11284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0fagklu8pg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08ok8oklnxz22xs.R.rethrow($CLV_t2$);}finally{__CLR4_2_08ok8oklnxz22xs.R.globalSliceEnd(getClass().getName(),"org.jsoup.internal.StringUtilTest.isWhitespace",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11284,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0fagklu8pg(){try{__CLR4_2_08ok8oklnxz22xs.R.inc(11284);
        __CLR4_2_08ok8oklnxz22xs.R.inc(11285);assertTrue(StringUtil.isWhitespace('\t'));
        __CLR4_2_08ok8oklnxz22xs.R.inc(11286);assertTrue(StringUtil.isWhitespace('\n'));
        __CLR4_2_08ok8oklnxz22xs.R.inc(11287);assertTrue(StringUtil.isWhitespace('\r'));
        __CLR4_2_08ok8oklnxz22xs.R.inc(11288);assertTrue(StringUtil.isWhitespace('\f'));
        __CLR4_2_08ok8oklnxz22xs.R.inc(11289);assertTrue(StringUtil.isWhitespace(' '));
        
        __CLR4_2_08ok8oklnxz22xs.R.inc(11290);assertFalse(StringUtil.isWhitespace('\u00a0'));
        __CLR4_2_08ok8oklnxz22xs.R.inc(11291);assertFalse(StringUtil.isWhitespace('\u2000'));
        __CLR4_2_08ok8oklnxz22xs.R.inc(11292);assertFalse(StringUtil.isWhitespace('\u3000'));
    }finally{__CLR4_2_08ok8oklnxz22xs.R.flushNeeded();}}

    @Test public void normaliseWhiteSpace() {__CLR4_2_08ok8oklnxz22xs.R.globalSliceStart(getClass().getName(),11293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0eh8svc8pp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08ok8oklnxz22xs.R.rethrow($CLV_t2$);}finally{__CLR4_2_08ok8oklnxz22xs.R.globalSliceEnd(getClass().getName(),"org.jsoup.internal.StringUtilTest.normaliseWhiteSpace",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11293,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0eh8svc8pp(){try{__CLR4_2_08ok8oklnxz22xs.R.inc(11293);
        __CLR4_2_08ok8oklnxz22xs.R.inc(11294);assertEquals(" ", normaliseWhitespace("    \r \n \r\n"));
        __CLR4_2_08ok8oklnxz22xs.R.inc(11295);assertEquals(" hello there ", normaliseWhitespace("   hello   \r \n  there    \n"));
        __CLR4_2_08ok8oklnxz22xs.R.inc(11296);assertEquals("hello", normaliseWhitespace("hello"));
        __CLR4_2_08ok8oklnxz22xs.R.inc(11297);assertEquals("hello there", normaliseWhitespace("hello\nthere"));
    }finally{__CLR4_2_08ok8oklnxz22xs.R.flushNeeded();}}

    @Test public void normaliseWhiteSpaceHandlesHighSurrogates() {__CLR4_2_08ok8oklnxz22xs.R.globalSliceStart(getClass().getName(),11298);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0qbj7b68pu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08ok8oklnxz22xs.R.rethrow($CLV_t2$);}finally{__CLR4_2_08ok8oklnxz22xs.R.globalSliceEnd(getClass().getName(),"org.jsoup.internal.StringUtilTest.normaliseWhiteSpaceHandlesHighSurrogates",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11298,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0qbj7b68pu(){try{__CLR4_2_08ok8oklnxz22xs.R.inc(11298);
        __CLR4_2_08ok8oklnxz22xs.R.inc(11299);String test71540chars = "\ud869\udeb2\u304b\u309a  1";
        __CLR4_2_08ok8oklnxz22xs.R.inc(11300);String test71540charsExpectedSingleWhitespace = "\ud869\udeb2\u304b\u309a 1";

        __CLR4_2_08ok8oklnxz22xs.R.inc(11301);assertEquals(test71540charsExpectedSingleWhitespace, normaliseWhitespace(test71540chars));
        __CLR4_2_08ok8oklnxz22xs.R.inc(11302);String extractedText = Jsoup.parse(test71540chars).text();
        __CLR4_2_08ok8oklnxz22xs.R.inc(11303);assertEquals(test71540charsExpectedSingleWhitespace, extractedText);
    }finally{__CLR4_2_08ok8oklnxz22xs.R.flushNeeded();}}

    @Test public void resolvesRelativeUrls() {__CLR4_2_08ok8oklnxz22xs.R.globalSliceStart(getClass().getName(),11304);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0bt4mhq8q0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08ok8oklnxz22xs.R.rethrow($CLV_t2$);}finally{__CLR4_2_08ok8oklnxz22xs.R.globalSliceEnd(getClass().getName(),"org.jsoup.internal.StringUtilTest.resolvesRelativeUrls",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11304,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0bt4mhq8q0(){try{__CLR4_2_08ok8oklnxz22xs.R.inc(11304);
        __CLR4_2_08ok8oklnxz22xs.R.inc(11305);assertEquals("http://example.com/one/two?three", resolve("http://example.com", "./one/two?three"));
        __CLR4_2_08ok8oklnxz22xs.R.inc(11306);assertEquals("http://example.com/one/two?three", resolve("http://example.com?one", "./one/two?three"));
        __CLR4_2_08ok8oklnxz22xs.R.inc(11307);assertEquals("http://example.com/one/two?three#four", resolve("http://example.com", "./one/two?three#four"));
        __CLR4_2_08ok8oklnxz22xs.R.inc(11308);assertEquals("https://example.com/one", resolve("http://example.com/", "https://example.com/one"));
        __CLR4_2_08ok8oklnxz22xs.R.inc(11309);assertEquals("http://example.com/one/two.html", resolve("http://example.com/two/", "../one/two.html"));
        __CLR4_2_08ok8oklnxz22xs.R.inc(11310);assertEquals("https://example2.com/one", resolve("https://example.com/", "//example2.com/one"));
        __CLR4_2_08ok8oklnxz22xs.R.inc(11311);assertEquals("https://example.com:8080/one", resolve("https://example.com:8080", "./one"));
        __CLR4_2_08ok8oklnxz22xs.R.inc(11312);assertEquals("https://example2.com/one", resolve("http://example.com/", "https://example2.com/one"));
        __CLR4_2_08ok8oklnxz22xs.R.inc(11313);assertEquals("https://example.com/one", resolve("wrong", "https://example.com/one"));
        __CLR4_2_08ok8oklnxz22xs.R.inc(11314);assertEquals("https://example.com/one", resolve("https://example.com/one", ""));
        __CLR4_2_08ok8oklnxz22xs.R.inc(11315);assertEquals("", resolve("wrong", "also wrong"));
        __CLR4_2_08ok8oklnxz22xs.R.inc(11316);assertEquals("ftp://example.com/one", resolve("ftp://example.com/two/", "../one"));
        __CLR4_2_08ok8oklnxz22xs.R.inc(11317);assertEquals("ftp://example.com/one/two.c", resolve("ftp://example.com/one/", "./two.c"));
        __CLR4_2_08ok8oklnxz22xs.R.inc(11318);assertEquals("ftp://example.com/one/two.c", resolve("ftp://example.com/one/", "two.c"));
    }finally{__CLR4_2_08ok8oklnxz22xs.R.flushNeeded();}}
}
