/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.parser;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.StringReader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Test suite for character reader.
 *
 * @author Jonathan Hedley, jonathan@hedley.net
 */
public class CharacterReaderTest {static class __CLR4_2_0floflolnxz2387{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767707166L,8589935092L,20445,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public final static int maxBufferLen = CharacterReader.maxBufferLen;

    @Test public void consume() {__CLR4_2_0floflolnxz2387.R.globalSliceStart(getClass().getName(),20220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0yvvy2lflo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0floflolnxz2387.R.rethrow($CLV_t2$);}finally{__CLR4_2_0floflolnxz2387.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.consume",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20220,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0yvvy2lflo(){try{__CLR4_2_0floflolnxz2387.R.inc(20220);
        __CLR4_2_0floflolnxz2387.R.inc(20221);CharacterReader r = new CharacterReader("one");
        __CLR4_2_0floflolnxz2387.R.inc(20222);assertEquals(0, r.pos());
        __CLR4_2_0floflolnxz2387.R.inc(20223);assertEquals('o', r.current());
        __CLR4_2_0floflolnxz2387.R.inc(20224);assertEquals('o', r.consume());
        __CLR4_2_0floflolnxz2387.R.inc(20225);assertEquals(1, r.pos());
        __CLR4_2_0floflolnxz2387.R.inc(20226);assertEquals('n', r.current());
        __CLR4_2_0floflolnxz2387.R.inc(20227);assertEquals(1, r.pos());
        __CLR4_2_0floflolnxz2387.R.inc(20228);assertEquals('n', r.consume());
        __CLR4_2_0floflolnxz2387.R.inc(20229);assertEquals('e', r.consume());
        __CLR4_2_0floflolnxz2387.R.inc(20230);assertTrue(r.isEmpty());
        __CLR4_2_0floflolnxz2387.R.inc(20231);assertEquals(CharacterReader.EOF, r.consume());
        __CLR4_2_0floflolnxz2387.R.inc(20232);assertTrue(r.isEmpty());
        __CLR4_2_0floflolnxz2387.R.inc(20233);assertEquals(CharacterReader.EOF, r.consume());
    }finally{__CLR4_2_0floflolnxz2387.R.flushNeeded();}}

    @Test public void unconsume() {__CLR4_2_0floflolnxz2387.R.globalSliceStart(getClass().getName(),20234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0q192ifm2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0floflolnxz2387.R.rethrow($CLV_t2$);}finally{__CLR4_2_0floflolnxz2387.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.unconsume",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20234,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0q192ifm2(){try{__CLR4_2_0floflolnxz2387.R.inc(20234);
        __CLR4_2_0floflolnxz2387.R.inc(20235);CharacterReader r = new CharacterReader("one");
        __CLR4_2_0floflolnxz2387.R.inc(20236);assertEquals('o', r.consume());
        __CLR4_2_0floflolnxz2387.R.inc(20237);assertEquals('n', r.current());
        __CLR4_2_0floflolnxz2387.R.inc(20238);r.unconsume();
        __CLR4_2_0floflolnxz2387.R.inc(20239);assertEquals('o', r.current());

        __CLR4_2_0floflolnxz2387.R.inc(20240);assertEquals('o', r.consume());
        __CLR4_2_0floflolnxz2387.R.inc(20241);assertEquals('n', r.consume());
        __CLR4_2_0floflolnxz2387.R.inc(20242);assertEquals('e', r.consume());
        __CLR4_2_0floflolnxz2387.R.inc(20243);assertTrue(r.isEmpty());
        __CLR4_2_0floflolnxz2387.R.inc(20244);r.unconsume();
        __CLR4_2_0floflolnxz2387.R.inc(20245);assertFalse(r.isEmpty());
        __CLR4_2_0floflolnxz2387.R.inc(20246);assertEquals('e', r.current());
        __CLR4_2_0floflolnxz2387.R.inc(20247);assertEquals('e', r.consume());
        __CLR4_2_0floflolnxz2387.R.inc(20248);assertTrue(r.isEmpty());

        __CLR4_2_0floflolnxz2387.R.inc(20249);assertEquals(CharacterReader.EOF, r.consume());
        __CLR4_2_0floflolnxz2387.R.inc(20250);r.unconsume();
        __CLR4_2_0floflolnxz2387.R.inc(20251);assertTrue(r.isEmpty());
        __CLR4_2_0floflolnxz2387.R.inc(20252);assertEquals(CharacterReader.EOF, r.current());
    }finally{__CLR4_2_0floflolnxz2387.R.flushNeeded();}}

    @Test public void mark() {__CLR4_2_0floflolnxz2387.R.globalSliceStart(getClass().getName(),20253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0m5v5h0fml();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0floflolnxz2387.R.rethrow($CLV_t2$);}finally{__CLR4_2_0floflolnxz2387.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.mark",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20253,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0m5v5h0fml(){try{__CLR4_2_0floflolnxz2387.R.inc(20253);
        __CLR4_2_0floflolnxz2387.R.inc(20254);CharacterReader r = new CharacterReader("one");
        __CLR4_2_0floflolnxz2387.R.inc(20255);r.consume();
        __CLR4_2_0floflolnxz2387.R.inc(20256);r.mark();
        __CLR4_2_0floflolnxz2387.R.inc(20257);assertEquals('n', r.consume());
        __CLR4_2_0floflolnxz2387.R.inc(20258);assertEquals('e', r.consume());
        __CLR4_2_0floflolnxz2387.R.inc(20259);assertTrue(r.isEmpty());
        __CLR4_2_0floflolnxz2387.R.inc(20260);r.rewindToMark();
        __CLR4_2_0floflolnxz2387.R.inc(20261);assertEquals('n', r.consume());
    }finally{__CLR4_2_0floflolnxz2387.R.flushNeeded();}}

    @Test public void consumeToEnd() {__CLR4_2_0floflolnxz2387.R.globalSliceStart(getClass().getName(),20262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0b6ehytfmu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0floflolnxz2387.R.rethrow($CLV_t2$);}finally{__CLR4_2_0floflolnxz2387.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.consumeToEnd",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20262,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0b6ehytfmu(){try{__CLR4_2_0floflolnxz2387.R.inc(20262);
        __CLR4_2_0floflolnxz2387.R.inc(20263);String in = "one two three";
        __CLR4_2_0floflolnxz2387.R.inc(20264);CharacterReader r = new CharacterReader(in);
        __CLR4_2_0floflolnxz2387.R.inc(20265);String toEnd = r.consumeToEnd();
        __CLR4_2_0floflolnxz2387.R.inc(20266);assertEquals(in, toEnd);
        __CLR4_2_0floflolnxz2387.R.inc(20267);assertTrue(r.isEmpty());
    }finally{__CLR4_2_0floflolnxz2387.R.flushNeeded();}}

    @Test public void nextIndexOfChar() {__CLR4_2_0floflolnxz2387.R.globalSliceStart(getClass().getName(),20268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0qgh9m5fn0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0floflolnxz2387.R.rethrow($CLV_t2$);}finally{__CLR4_2_0floflolnxz2387.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.nextIndexOfChar",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20268,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0qgh9m5fn0(){try{__CLR4_2_0floflolnxz2387.R.inc(20268);
        __CLR4_2_0floflolnxz2387.R.inc(20269);String in = "blah blah";
        __CLR4_2_0floflolnxz2387.R.inc(20270);CharacterReader r = new CharacterReader(in);

        __CLR4_2_0floflolnxz2387.R.inc(20271);assertEquals(-1, r.nextIndexOf('x'));
        __CLR4_2_0floflolnxz2387.R.inc(20272);assertEquals(3, r.nextIndexOf('h'));
        __CLR4_2_0floflolnxz2387.R.inc(20273);String pull = r.consumeTo('h');
        __CLR4_2_0floflolnxz2387.R.inc(20274);assertEquals("bla", pull);
        __CLR4_2_0floflolnxz2387.R.inc(20275);r.consume();
        __CLR4_2_0floflolnxz2387.R.inc(20276);assertEquals(2, r.nextIndexOf('l'));
        __CLR4_2_0floflolnxz2387.R.inc(20277);assertEquals(" blah", r.consumeToEnd());
        __CLR4_2_0floflolnxz2387.R.inc(20278);assertEquals(-1, r.nextIndexOf('x'));
    }finally{__CLR4_2_0floflolnxz2387.R.flushNeeded();}}

    @Test public void nextIndexOfString() {__CLR4_2_0floflolnxz2387.R.globalSliceStart(getClass().getName(),20279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_05joagefnb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0floflolnxz2387.R.rethrow($CLV_t2$);}finally{__CLR4_2_0floflolnxz2387.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.nextIndexOfString",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20279,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_05joagefnb(){try{__CLR4_2_0floflolnxz2387.R.inc(20279);
        __CLR4_2_0floflolnxz2387.R.inc(20280);String in = "One Two something Two Three Four";
        __CLR4_2_0floflolnxz2387.R.inc(20281);CharacterReader r = new CharacterReader(in);

        __CLR4_2_0floflolnxz2387.R.inc(20282);assertEquals(-1, r.nextIndexOf("Foo"));
        __CLR4_2_0floflolnxz2387.R.inc(20283);assertEquals(4, r.nextIndexOf("Two"));
        __CLR4_2_0floflolnxz2387.R.inc(20284);assertEquals("One Two ", r.consumeTo("something"));
        __CLR4_2_0floflolnxz2387.R.inc(20285);assertEquals(10, r.nextIndexOf("Two"));
        __CLR4_2_0floflolnxz2387.R.inc(20286);assertEquals("something Two Three Four", r.consumeToEnd());
        __CLR4_2_0floflolnxz2387.R.inc(20287);assertEquals(-1, r.nextIndexOf("Two"));
    }finally{__CLR4_2_0floflolnxz2387.R.flushNeeded();}}

    @Test public void nextIndexOfUnmatched() {__CLR4_2_0floflolnxz2387.R.globalSliceStart(getClass().getName(),20288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0x2rpi4fnk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0floflolnxz2387.R.rethrow($CLV_t2$);}finally{__CLR4_2_0floflolnxz2387.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.nextIndexOfUnmatched",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20288,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0x2rpi4fnk(){try{__CLR4_2_0floflolnxz2387.R.inc(20288);
        __CLR4_2_0floflolnxz2387.R.inc(20289);CharacterReader r = new CharacterReader("<[[one]]");
        __CLR4_2_0floflolnxz2387.R.inc(20290);assertEquals(-1, r.nextIndexOf("]]>"));
    }finally{__CLR4_2_0floflolnxz2387.R.flushNeeded();}}

    @Test public void consumeToChar() {__CLR4_2_0floflolnxz2387.R.globalSliceStart(getClass().getName(),20291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0vbexbofnn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0floflolnxz2387.R.rethrow($CLV_t2$);}finally{__CLR4_2_0floflolnxz2387.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.consumeToChar",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20291,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0vbexbofnn(){try{__CLR4_2_0floflolnxz2387.R.inc(20291);
        __CLR4_2_0floflolnxz2387.R.inc(20292);CharacterReader r = new CharacterReader("One Two Three");
        __CLR4_2_0floflolnxz2387.R.inc(20293);assertEquals("One ", r.consumeTo('T'));
        __CLR4_2_0floflolnxz2387.R.inc(20294);assertEquals("", r.consumeTo('T')); // on Two
        __CLR4_2_0floflolnxz2387.R.inc(20295);assertEquals('T', r.consume());
        __CLR4_2_0floflolnxz2387.R.inc(20296);assertEquals("wo ", r.consumeTo('T'));
        __CLR4_2_0floflolnxz2387.R.inc(20297);assertEquals('T', r.consume());
        __CLR4_2_0floflolnxz2387.R.inc(20298);assertEquals("hree", r.consumeTo('T')); // consume to end
    }finally{__CLR4_2_0floflolnxz2387.R.flushNeeded();}}

    @Test public void consumeToString() {__CLR4_2_0floflolnxz2387.R.globalSliceStart(getClass().getName(),20299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0j01dtdfnv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0floflolnxz2387.R.rethrow($CLV_t2$);}finally{__CLR4_2_0floflolnxz2387.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.consumeToString",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20299,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0j01dtdfnv(){try{__CLR4_2_0floflolnxz2387.R.inc(20299);
        __CLR4_2_0floflolnxz2387.R.inc(20300);CharacterReader r = new CharacterReader("One Two Two Four");
        __CLR4_2_0floflolnxz2387.R.inc(20301);assertEquals("One ", r.consumeTo("Two"));
        __CLR4_2_0floflolnxz2387.R.inc(20302);assertEquals('T', r.consume());
        __CLR4_2_0floflolnxz2387.R.inc(20303);assertEquals("wo ", r.consumeTo("Two"));
        __CLR4_2_0floflolnxz2387.R.inc(20304);assertEquals('T', r.consume());
        __CLR4_2_0floflolnxz2387.R.inc(20305);assertEquals("wo Four", r.consumeTo("Qux"));
    }finally{__CLR4_2_0floflolnxz2387.R.flushNeeded();}}

    @Test public void advance() {__CLR4_2_0floflolnxz2387.R.globalSliceStart(getClass().getName(),20306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_096izqvfo2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0floflolnxz2387.R.rethrow($CLV_t2$);}finally{__CLR4_2_0floflolnxz2387.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.advance",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20306,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_096izqvfo2(){try{__CLR4_2_0floflolnxz2387.R.inc(20306);
        __CLR4_2_0floflolnxz2387.R.inc(20307);CharacterReader r = new CharacterReader("One Two Three");
        __CLR4_2_0floflolnxz2387.R.inc(20308);assertEquals('O', r.consume());
        __CLR4_2_0floflolnxz2387.R.inc(20309);r.advance();
        __CLR4_2_0floflolnxz2387.R.inc(20310);assertEquals('e', r.consume());
    }finally{__CLR4_2_0floflolnxz2387.R.flushNeeded();}}

    @Test public void consumeToAny() {__CLR4_2_0floflolnxz2387.R.globalSliceStart(getClass().getName(),20311);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_05f4hvofo7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0floflolnxz2387.R.rethrow($CLV_t2$);}finally{__CLR4_2_0floflolnxz2387.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.consumeToAny",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20311,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_05f4hvofo7(){try{__CLR4_2_0floflolnxz2387.R.inc(20311);
        __CLR4_2_0floflolnxz2387.R.inc(20312);CharacterReader r = new CharacterReader("One &bar; qux");
        __CLR4_2_0floflolnxz2387.R.inc(20313);assertEquals("One ", r.consumeToAny('&', ';'));
        __CLR4_2_0floflolnxz2387.R.inc(20314);assertTrue(r.matches('&'));
        __CLR4_2_0floflolnxz2387.R.inc(20315);assertTrue(r.matches("&bar;"));
        __CLR4_2_0floflolnxz2387.R.inc(20316);assertEquals('&', r.consume());
        __CLR4_2_0floflolnxz2387.R.inc(20317);assertEquals("bar", r.consumeToAny('&', ';'));
        __CLR4_2_0floflolnxz2387.R.inc(20318);assertEquals(';', r.consume());
        __CLR4_2_0floflolnxz2387.R.inc(20319);assertEquals(" qux", r.consumeToAny('&', ';'));
    }finally{__CLR4_2_0floflolnxz2387.R.flushNeeded();}}

    @Test public void consumeLetterSequence() {__CLR4_2_0floflolnxz2387.R.globalSliceStart(getClass().getName(),20320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ryjqq2fog();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0floflolnxz2387.R.rethrow($CLV_t2$);}finally{__CLR4_2_0floflolnxz2387.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.consumeLetterSequence",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20320,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ryjqq2fog(){try{__CLR4_2_0floflolnxz2387.R.inc(20320);
        __CLR4_2_0floflolnxz2387.R.inc(20321);CharacterReader r = new CharacterReader("One &bar; qux");
        __CLR4_2_0floflolnxz2387.R.inc(20322);assertEquals("One", r.consumeLetterSequence());
        __CLR4_2_0floflolnxz2387.R.inc(20323);assertEquals(" &", r.consumeTo("bar;"));
        __CLR4_2_0floflolnxz2387.R.inc(20324);assertEquals("bar", r.consumeLetterSequence());
        __CLR4_2_0floflolnxz2387.R.inc(20325);assertEquals("; qux", r.consumeToEnd());
    }finally{__CLR4_2_0floflolnxz2387.R.flushNeeded();}}

    @Test public void consumeLetterThenDigitSequence() {__CLR4_2_0floflolnxz2387.R.globalSliceStart(getClass().getName(),20326);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_09ty1x2fom();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0floflolnxz2387.R.rethrow($CLV_t2$);}finally{__CLR4_2_0floflolnxz2387.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.consumeLetterThenDigitSequence",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20326,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_09ty1x2fom(){try{__CLR4_2_0floflolnxz2387.R.inc(20326);
        __CLR4_2_0floflolnxz2387.R.inc(20327);CharacterReader r = new CharacterReader("One12 Two &bar; qux");
        __CLR4_2_0floflolnxz2387.R.inc(20328);assertEquals("One12", r.consumeLetterThenDigitSequence());
        __CLR4_2_0floflolnxz2387.R.inc(20329);assertEquals(' ', r.consume());
        __CLR4_2_0floflolnxz2387.R.inc(20330);assertEquals("Two", r.consumeLetterThenDigitSequence());
        __CLR4_2_0floflolnxz2387.R.inc(20331);assertEquals(" &bar; qux", r.consumeToEnd());
    }finally{__CLR4_2_0floflolnxz2387.R.flushNeeded();}}

    @Test public void matches() {__CLR4_2_0floflolnxz2387.R.globalSliceStart(getClass().getName(),20332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_06glrdyfos();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0floflolnxz2387.R.rethrow($CLV_t2$);}finally{__CLR4_2_0floflolnxz2387.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.matches",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20332,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_06glrdyfos(){try{__CLR4_2_0floflolnxz2387.R.inc(20332);
        __CLR4_2_0floflolnxz2387.R.inc(20333);CharacterReader r = new CharacterReader("One Two Three");
        __CLR4_2_0floflolnxz2387.R.inc(20334);assertTrue(r.matches('O'));
        __CLR4_2_0floflolnxz2387.R.inc(20335);assertTrue(r.matches("One Two Three"));
        __CLR4_2_0floflolnxz2387.R.inc(20336);assertTrue(r.matches("One"));
        __CLR4_2_0floflolnxz2387.R.inc(20337);assertFalse(r.matches("one"));
        __CLR4_2_0floflolnxz2387.R.inc(20338);assertEquals('O', r.consume());
        __CLR4_2_0floflolnxz2387.R.inc(20339);assertFalse(r.matches("One"));
        __CLR4_2_0floflolnxz2387.R.inc(20340);assertTrue(r.matches("ne Two Three"));
        __CLR4_2_0floflolnxz2387.R.inc(20341);assertFalse(r.matches("ne Two Three Four"));
        __CLR4_2_0floflolnxz2387.R.inc(20342);assertEquals("ne Two Three", r.consumeToEnd());
        __CLR4_2_0floflolnxz2387.R.inc(20343);assertFalse(r.matches("ne"));
        __CLR4_2_0floflolnxz2387.R.inc(20344);assertTrue(r.isEmpty());
    }finally{__CLR4_2_0floflolnxz2387.R.flushNeeded();}}

    @Test
    public void matchesIgnoreCase() {__CLR4_2_0floflolnxz2387.R.globalSliceStart(getClass().getName(),20345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0c3qh0kfp5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0floflolnxz2387.R.rethrow($CLV_t2$);}finally{__CLR4_2_0floflolnxz2387.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.matchesIgnoreCase",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20345,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0c3qh0kfp5(){try{__CLR4_2_0floflolnxz2387.R.inc(20345);
        __CLR4_2_0floflolnxz2387.R.inc(20346);CharacterReader r = new CharacterReader("One Two Three");
        __CLR4_2_0floflolnxz2387.R.inc(20347);assertTrue(r.matchesIgnoreCase("O"));
        __CLR4_2_0floflolnxz2387.R.inc(20348);assertTrue(r.matchesIgnoreCase("o"));
        __CLR4_2_0floflolnxz2387.R.inc(20349);assertTrue(r.matches('O'));
        __CLR4_2_0floflolnxz2387.R.inc(20350);assertFalse(r.matches('o'));
        __CLR4_2_0floflolnxz2387.R.inc(20351);assertTrue(r.matchesIgnoreCase("One Two Three"));
        __CLR4_2_0floflolnxz2387.R.inc(20352);assertTrue(r.matchesIgnoreCase("ONE two THREE"));
        __CLR4_2_0floflolnxz2387.R.inc(20353);assertTrue(r.matchesIgnoreCase("One"));
        __CLR4_2_0floflolnxz2387.R.inc(20354);assertTrue(r.matchesIgnoreCase("one"));
        __CLR4_2_0floflolnxz2387.R.inc(20355);assertEquals('O', r.consume());
        __CLR4_2_0floflolnxz2387.R.inc(20356);assertFalse(r.matchesIgnoreCase("One"));
        __CLR4_2_0floflolnxz2387.R.inc(20357);assertTrue(r.matchesIgnoreCase("NE Two Three"));
        __CLR4_2_0floflolnxz2387.R.inc(20358);assertFalse(r.matchesIgnoreCase("ne Two Three Four"));
        __CLR4_2_0floflolnxz2387.R.inc(20359);assertEquals("ne Two Three", r.consumeToEnd());
        __CLR4_2_0floflolnxz2387.R.inc(20360);assertFalse(r.matchesIgnoreCase("ne"));
    }finally{__CLR4_2_0floflolnxz2387.R.flushNeeded();}}

    @Test public void containsIgnoreCase() {__CLR4_2_0floflolnxz2387.R.globalSliceStart(getClass().getName(),20361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0w31qgofpl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0floflolnxz2387.R.rethrow($CLV_t2$);}finally{__CLR4_2_0floflolnxz2387.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.containsIgnoreCase",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20361,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0w31qgofpl(){try{__CLR4_2_0floflolnxz2387.R.inc(20361);
        __CLR4_2_0floflolnxz2387.R.inc(20362);CharacterReader r = new CharacterReader("One TWO three");
        __CLR4_2_0floflolnxz2387.R.inc(20363);assertTrue(r.containsIgnoreCase("two"));
        __CLR4_2_0floflolnxz2387.R.inc(20364);assertTrue(r.containsIgnoreCase("three"));
        // weird one: does not find one, because it scans for consistent case only
        __CLR4_2_0floflolnxz2387.R.inc(20365);assertFalse(r.containsIgnoreCase("one"));
    }finally{__CLR4_2_0floflolnxz2387.R.flushNeeded();}}

    @Test public void matchesAny() {__CLR4_2_0floflolnxz2387.R.globalSliceStart(getClass().getName(),20366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ecoqu8fpq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0floflolnxz2387.R.rethrow($CLV_t2$);}finally{__CLR4_2_0floflolnxz2387.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.matchesAny",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20366,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ecoqu8fpq(){try{__CLR4_2_0floflolnxz2387.R.inc(20366);
        __CLR4_2_0floflolnxz2387.R.inc(20367);char[] scan = {' ', '\n', '\t'};
        __CLR4_2_0floflolnxz2387.R.inc(20368);CharacterReader r = new CharacterReader("One\nTwo\tThree");
        __CLR4_2_0floflolnxz2387.R.inc(20369);assertFalse(r.matchesAny(scan));
        __CLR4_2_0floflolnxz2387.R.inc(20370);assertEquals("One", r.consumeToAny(scan));
        __CLR4_2_0floflolnxz2387.R.inc(20371);assertTrue(r.matchesAny(scan));
        __CLR4_2_0floflolnxz2387.R.inc(20372);assertEquals('\n', r.consume());
        __CLR4_2_0floflolnxz2387.R.inc(20373);assertFalse(r.matchesAny(scan));
    }finally{__CLR4_2_0floflolnxz2387.R.flushNeeded();}}

    @Test public void cachesStrings() {__CLR4_2_0floflolnxz2387.R.globalSliceStart(getClass().getName(),20374);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0j1du7sfpy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0floflolnxz2387.R.rethrow($CLV_t2$);}finally{__CLR4_2_0floflolnxz2387.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.cachesStrings",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20374,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0j1du7sfpy(){try{__CLR4_2_0floflolnxz2387.R.inc(20374);
        __CLR4_2_0floflolnxz2387.R.inc(20375);CharacterReader r = new CharacterReader("Check\tCheck\tCheck\tCHOKE\tA string that is longer than 16 chars");
        __CLR4_2_0floflolnxz2387.R.inc(20376);String one = r.consumeTo('\t');
        __CLR4_2_0floflolnxz2387.R.inc(20377);r.consume();
        __CLR4_2_0floflolnxz2387.R.inc(20378);String two = r.consumeTo('\t');
        __CLR4_2_0floflolnxz2387.R.inc(20379);r.consume();
        __CLR4_2_0floflolnxz2387.R.inc(20380);String three = r.consumeTo('\t');
        __CLR4_2_0floflolnxz2387.R.inc(20381);r.consume();
        __CLR4_2_0floflolnxz2387.R.inc(20382);String four = r.consumeTo('\t');
        __CLR4_2_0floflolnxz2387.R.inc(20383);r.consume();
        __CLR4_2_0floflolnxz2387.R.inc(20384);String five = r.consumeTo('\t');

        __CLR4_2_0floflolnxz2387.R.inc(20385);assertEquals("Check", one);
        __CLR4_2_0floflolnxz2387.R.inc(20386);assertEquals("Check", two);
        __CLR4_2_0floflolnxz2387.R.inc(20387);assertEquals("Check", three);
        __CLR4_2_0floflolnxz2387.R.inc(20388);assertEquals("CHOKE", four);
        __CLR4_2_0floflolnxz2387.R.inc(20389);assertTrue(one == two);
        __CLR4_2_0floflolnxz2387.R.inc(20390);assertTrue(two == three);
        __CLR4_2_0floflolnxz2387.R.inc(20391);assertTrue(three != four);
        __CLR4_2_0floflolnxz2387.R.inc(20392);assertTrue(four != five);
        __CLR4_2_0floflolnxz2387.R.inc(20393);assertEquals(five, "A string that is longer than 16 chars");
    }finally{__CLR4_2_0floflolnxz2387.R.flushNeeded();}}

    @Test
    public void rangeEquals() {__CLR4_2_0floflolnxz2387.R.globalSliceStart(getClass().getName(),20394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0dpedp9fqi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0floflolnxz2387.R.rethrow($CLV_t2$);}finally{__CLR4_2_0floflolnxz2387.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.rangeEquals",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20394,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0dpedp9fqi(){try{__CLR4_2_0floflolnxz2387.R.inc(20394);
        __CLR4_2_0floflolnxz2387.R.inc(20395);CharacterReader r = new CharacterReader("Check\tCheck\tCheck\tCHOKE");
        __CLR4_2_0floflolnxz2387.R.inc(20396);assertTrue(r.rangeEquals(0, 5, "Check"));
        __CLR4_2_0floflolnxz2387.R.inc(20397);assertFalse(r.rangeEquals(0, 5, "CHOKE"));
        __CLR4_2_0floflolnxz2387.R.inc(20398);assertFalse(r.rangeEquals(0, 5, "Chec"));

        __CLR4_2_0floflolnxz2387.R.inc(20399);assertTrue(r.rangeEquals(6, 5, "Check"));
        __CLR4_2_0floflolnxz2387.R.inc(20400);assertFalse(r.rangeEquals(6, 5, "Chuck"));

        __CLR4_2_0floflolnxz2387.R.inc(20401);assertTrue(r.rangeEquals(12, 5, "Check"));
        __CLR4_2_0floflolnxz2387.R.inc(20402);assertFalse(r.rangeEquals(12, 5, "Cheeky"));

        __CLR4_2_0floflolnxz2387.R.inc(20403);assertTrue(r.rangeEquals(18, 5, "CHOKE"));
        __CLR4_2_0floflolnxz2387.R.inc(20404);assertFalse(r.rangeEquals(18, 5, "CHIKE"));
    }finally{__CLR4_2_0floflolnxz2387.R.flushNeeded();}}

    @Test
    public void empty() {__CLR4_2_0floflolnxz2387.R.globalSliceStart(getClass().getName(),20405);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0g4yvp0fqt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0floflolnxz2387.R.rethrow($CLV_t2$);}finally{__CLR4_2_0floflolnxz2387.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.empty",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20405,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0g4yvp0fqt(){try{__CLR4_2_0floflolnxz2387.R.inc(20405);
        __CLR4_2_0floflolnxz2387.R.inc(20406);CharacterReader r = new CharacterReader("One");
        __CLR4_2_0floflolnxz2387.R.inc(20407);assertTrue(r.matchConsume("One"));
        __CLR4_2_0floflolnxz2387.R.inc(20408);assertTrue(r.isEmpty());

        __CLR4_2_0floflolnxz2387.R.inc(20409);r = new CharacterReader("Two");
        __CLR4_2_0floflolnxz2387.R.inc(20410);String two = r.consumeToEnd();
        __CLR4_2_0floflolnxz2387.R.inc(20411);assertEquals("Two", two);
    }finally{__CLR4_2_0floflolnxz2387.R.flushNeeded();}}

    @Test
    public void consumeToNonexistentEndWhenAtAnd() {__CLR4_2_0floflolnxz2387.R.globalSliceStart(getClass().getName(),20412);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0y5x2tcfr0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0floflolnxz2387.R.rethrow($CLV_t2$);}finally{__CLR4_2_0floflolnxz2387.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.consumeToNonexistentEndWhenAtAnd",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20412,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0y5x2tcfr0(){try{__CLR4_2_0floflolnxz2387.R.inc(20412);
        __CLR4_2_0floflolnxz2387.R.inc(20413);CharacterReader r = new CharacterReader("<!");
        __CLR4_2_0floflolnxz2387.R.inc(20414);assertTrue(r.matchConsume("<!"));
        __CLR4_2_0floflolnxz2387.R.inc(20415);assertTrue(r.isEmpty());

        __CLR4_2_0floflolnxz2387.R.inc(20416);String after = r.consumeTo('>');
        __CLR4_2_0floflolnxz2387.R.inc(20417);assertEquals("", after);

        __CLR4_2_0floflolnxz2387.R.inc(20418);assertTrue(r.isEmpty());
    }finally{__CLR4_2_0floflolnxz2387.R.flushNeeded();}}

    @Test
    public void notEmptyAtBufferSplitPoint() {__CLR4_2_0floflolnxz2387.R.globalSliceStart(getClass().getName(),20419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0nb1a16fr7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0floflolnxz2387.R.rethrow($CLV_t2$);}finally{__CLR4_2_0floflolnxz2387.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.notEmptyAtBufferSplitPoint",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20419,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0nb1a16fr7(){try{__CLR4_2_0floflolnxz2387.R.inc(20419);
        __CLR4_2_0floflolnxz2387.R.inc(20420);CharacterReader r = new CharacterReader(new StringReader("How about now"), 3);
        __CLR4_2_0floflolnxz2387.R.inc(20421);assertEquals("How", r.consumeTo(' '));
        __CLR4_2_0floflolnxz2387.R.inc(20422);assertFalse("Should not be empty", r.isEmpty());

        __CLR4_2_0floflolnxz2387.R.inc(20423);assertEquals(' ', r.consume());
        __CLR4_2_0floflolnxz2387.R.inc(20424);assertFalse(r.isEmpty());
    }finally{__CLR4_2_0floflolnxz2387.R.flushNeeded();}}

    @Test public void bufferUp() {__CLR4_2_0floflolnxz2387.R.globalSliceStart(getClass().getName(),20425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0tn63a6frd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0floflolnxz2387.R.rethrow($CLV_t2$);}finally{__CLR4_2_0floflolnxz2387.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.bufferUp",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20425,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0tn63a6frd(){try{__CLR4_2_0floflolnxz2387.R.inc(20425);
        __CLR4_2_0floflolnxz2387.R.inc(20426);String note = "HelloThere"; // + ! = 11 chars
        __CLR4_2_0floflolnxz2387.R.inc(20427);int loopCount = 64;
        __CLR4_2_0floflolnxz2387.R.inc(20428);StringBuilder sb = new StringBuilder();
        __CLR4_2_0floflolnxz2387.R.inc(20429);for (int i = 0; (((i < loopCount)&&(__CLR4_2_0floflolnxz2387.R.iget(20430)!=0|true))||(__CLR4_2_0floflolnxz2387.R.iget(20431)==0&false)); i++) {{
            __CLR4_2_0floflolnxz2387.R.inc(20432);sb.append(note);
            __CLR4_2_0floflolnxz2387.R.inc(20433);sb.append("!");
        }

        }__CLR4_2_0floflolnxz2387.R.inc(20434);String s = sb.toString();
        __CLR4_2_0floflolnxz2387.R.inc(20435);BufferedReader br = new BufferedReader(new StringReader(s));

        __CLR4_2_0floflolnxz2387.R.inc(20436);CharacterReader r = new CharacterReader(br);
        __CLR4_2_0floflolnxz2387.R.inc(20437);for (int i = 0; (((i < loopCount)&&(__CLR4_2_0floflolnxz2387.R.iget(20438)!=0|true))||(__CLR4_2_0floflolnxz2387.R.iget(20439)==0&false)); i++) {{
            __CLR4_2_0floflolnxz2387.R.inc(20440);String pull = r.consumeTo('!');
            __CLR4_2_0floflolnxz2387.R.inc(20441);assertEquals(note, pull);
            __CLR4_2_0floflolnxz2387.R.inc(20442);assertEquals('!', r.current());
            __CLR4_2_0floflolnxz2387.R.inc(20443);r.advance();
        }

        }__CLR4_2_0floflolnxz2387.R.inc(20444);assertTrue(r.isEmpty());
    }finally{__CLR4_2_0floflolnxz2387.R.flushNeeded();}}


}
