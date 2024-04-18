/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

import static org.jsoup.integration.ParseTest.getFile;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class DataUtilTest {static class __CLR4_2_085x85xlnxz22wa{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767707166L,8589935092L,10664,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void testCharset() {__CLR4_2_085x85xlnxz22wa.R.globalSliceStart(getClass().getName(),10581);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0oh2zl85x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_085x85xlnxz22wa.R.rethrow($CLV_t2$);}finally{__CLR4_2_085x85xlnxz22wa.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.DataUtilTest.testCharset",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10581,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0oh2zl85x(){try{__CLR4_2_085x85xlnxz22wa.R.inc(10581);
        __CLR4_2_085x85xlnxz22wa.R.inc(10582);assertEquals("utf-8", DataUtil.getCharsetFromContentType("text/html;charset=utf-8 "));
        __CLR4_2_085x85xlnxz22wa.R.inc(10583);assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=UTF-8"));
        __CLR4_2_085x85xlnxz22wa.R.inc(10584);assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType("text/html; charset=ISO-8859-1"));
        __CLR4_2_085x85xlnxz22wa.R.inc(10585);assertEquals(null, DataUtil.getCharsetFromContentType("text/html"));
        __CLR4_2_085x85xlnxz22wa.R.inc(10586);assertEquals(null, DataUtil.getCharsetFromContentType(null));
        __CLR4_2_085x85xlnxz22wa.R.inc(10587);assertEquals(null, DataUtil.getCharsetFromContentType("text/html;charset=Unknown"));
    }finally{__CLR4_2_085x85xlnxz22wa.R.flushNeeded();}}

    @Test public void testQuotedCharset() {__CLR4_2_085x85xlnxz22wa.R.globalSliceStart(getClass().getName(),10588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_09skleh864();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_085x85xlnxz22wa.R.rethrow($CLV_t2$);}finally{__CLR4_2_085x85xlnxz22wa.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.DataUtilTest.testQuotedCharset",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10588,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_09skleh864(){try{__CLR4_2_085x85xlnxz22wa.R.inc(10588);
        __CLR4_2_085x85xlnxz22wa.R.inc(10589);assertEquals("utf-8", DataUtil.getCharsetFromContentType("text/html; charset=\"utf-8\""));
        __CLR4_2_085x85xlnxz22wa.R.inc(10590);assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html;charset=\"UTF-8\""));
        __CLR4_2_085x85xlnxz22wa.R.inc(10591);assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType("text/html; charset=\"ISO-8859-1\""));
        __CLR4_2_085x85xlnxz22wa.R.inc(10592);assertEquals(null, DataUtil.getCharsetFromContentType("text/html; charset=\"Unsupported\""));
        __CLR4_2_085x85xlnxz22wa.R.inc(10593);assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset='UTF-8'"));
    }finally{__CLR4_2_085x85xlnxz22wa.R.flushNeeded();}}

    private InputStream stream(String data) {try{__CLR4_2_085x85xlnxz22wa.R.inc(10594);
        __CLR4_2_085x85xlnxz22wa.R.inc(10595);return new ByteArrayInputStream(data.getBytes(StandardCharsets.UTF_8));
    }finally{__CLR4_2_085x85xlnxz22wa.R.flushNeeded();}}

    private InputStream stream(String data, String charset) {try{__CLR4_2_085x85xlnxz22wa.R.inc(10596);
        __CLR4_2_085x85xlnxz22wa.R.inc(10597);try {
            __CLR4_2_085x85xlnxz22wa.R.inc(10598);return new ByteArrayInputStream(data.getBytes(charset));
        } catch (UnsupportedEncodingException e) {
            __CLR4_2_085x85xlnxz22wa.R.inc(10599);fail();
        }
        __CLR4_2_085x85xlnxz22wa.R.inc(10600);return null;
    }finally{__CLR4_2_085x85xlnxz22wa.R.flushNeeded();}}

    @Test public void discardsSpuriousByteOrderMark() throws IOException {__CLR4_2_085x85xlnxz22wa.R.globalSliceStart(getClass().getName(),10601);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ojnckn86h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_085x85xlnxz22wa.R.rethrow($CLV_t2$);}finally{__CLR4_2_085x85xlnxz22wa.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.DataUtilTest.discardsSpuriousByteOrderMark",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10601,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ojnckn86h() throws IOException{try{__CLR4_2_085x85xlnxz22wa.R.inc(10601);
        __CLR4_2_085x85xlnxz22wa.R.inc(10602);String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        __CLR4_2_085x85xlnxz22wa.R.inc(10603);Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
        __CLR4_2_085x85xlnxz22wa.R.inc(10604);assertEquals("One", doc.head().text());
    }finally{__CLR4_2_085x85xlnxz22wa.R.flushNeeded();}}

    @Test public void discardsSpuriousByteOrderMarkWhenNoCharsetSet() throws IOException {__CLR4_2_085x85xlnxz22wa.R.globalSliceStart(getClass().getName(),10605);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ylh04886l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_085x85xlnxz22wa.R.rethrow($CLV_t2$);}finally{__CLR4_2_085x85xlnxz22wa.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.DataUtilTest.discardsSpuriousByteOrderMarkWhenNoCharsetSet",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10605,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ylh04886l() throws IOException{try{__CLR4_2_085x85xlnxz22wa.R.inc(10605);
        __CLR4_2_085x85xlnxz22wa.R.inc(10606);String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        __CLR4_2_085x85xlnxz22wa.R.inc(10607);Document doc = DataUtil.parseInputStream(stream(html), null, "http://foo.com/", Parser.htmlParser());
        __CLR4_2_085x85xlnxz22wa.R.inc(10608);assertEquals("One", doc.head().text());
        __CLR4_2_085x85xlnxz22wa.R.inc(10609);assertEquals("UTF-8", doc.outputSettings().charset().displayName());
    }finally{__CLR4_2_085x85xlnxz22wa.R.flushNeeded();}}

    @Test
    public void shouldNotThrowExceptionOnEmptyCharset() {__CLR4_2_085x85xlnxz22wa.R.globalSliceStart(getClass().getName(),10610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0uzf8z686q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_085x85xlnxz22wa.R.rethrow($CLV_t2$);}finally{__CLR4_2_085x85xlnxz22wa.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.DataUtilTest.shouldNotThrowExceptionOnEmptyCharset",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10610,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0uzf8z686q(){try{__CLR4_2_085x85xlnxz22wa.R.inc(10610);
        __CLR4_2_085x85xlnxz22wa.R.inc(10611);assertEquals(null, DataUtil.getCharsetFromContentType("text/html; charset="));
        __CLR4_2_085x85xlnxz22wa.R.inc(10612);assertEquals(null, DataUtil.getCharsetFromContentType("text/html; charset=;"));
    }finally{__CLR4_2_085x85xlnxz22wa.R.flushNeeded();}}

    @Test
    public void shouldSelectFirstCharsetOnWeirdMultileCharsetsInMetaTags() {__CLR4_2_085x85xlnxz22wa.R.globalSliceStart(getClass().getName(),10613);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0sjnfcw86t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_085x85xlnxz22wa.R.rethrow($CLV_t2$);}finally{__CLR4_2_085x85xlnxz22wa.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.DataUtilTest.shouldSelectFirstCharsetOnWeirdMultileCharsetsInMetaTags",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10613,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0sjnfcw86t(){try{__CLR4_2_085x85xlnxz22wa.R.inc(10613);
        __CLR4_2_085x85xlnxz22wa.R.inc(10614);assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType("text/html; charset=ISO-8859-1, charset=1251"));
    }finally{__CLR4_2_085x85xlnxz22wa.R.flushNeeded();}}

    @Test
    public void shouldCorrectCharsetForDuplicateCharsetString() {__CLR4_2_085x85xlnxz22wa.R.globalSliceStart(getClass().getName(),10615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ebyfub86v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_085x85xlnxz22wa.R.rethrow($CLV_t2$);}finally{__CLR4_2_085x85xlnxz22wa.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.DataUtilTest.shouldCorrectCharsetForDuplicateCharsetString",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10615,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ebyfub86v(){try{__CLR4_2_085x85xlnxz22wa.R.inc(10615);
        __CLR4_2_085x85xlnxz22wa.R.inc(10616);assertEquals("iso-8859-1", DataUtil.getCharsetFromContentType("text/html; charset=charset=iso-8859-1"));
    }finally{__CLR4_2_085x85xlnxz22wa.R.flushNeeded();}}

    @Test
    public void shouldReturnNullForIllegalCharsetNames() {__CLR4_2_085x85xlnxz22wa.R.globalSliceStart(getClass().getName(),10617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ptw1ly86x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_085x85xlnxz22wa.R.rethrow($CLV_t2$);}finally{__CLR4_2_085x85xlnxz22wa.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.DataUtilTest.shouldReturnNullForIllegalCharsetNames",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10617,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ptw1ly86x(){try{__CLR4_2_085x85xlnxz22wa.R.inc(10617);
        __CLR4_2_085x85xlnxz22wa.R.inc(10618);assertEquals(null, DataUtil.getCharsetFromContentType("text/html; charset=$HJKDF\u00a7$/("));
    }finally{__CLR4_2_085x85xlnxz22wa.R.flushNeeded();}}

    @Test
    public void generatesMimeBoundaries() {__CLR4_2_085x85xlnxz22wa.R.globalSliceStart(getClass().getName(),10619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0tdrpr386z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_085x85xlnxz22wa.R.rethrow($CLV_t2$);}finally{__CLR4_2_085x85xlnxz22wa.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.DataUtilTest.generatesMimeBoundaries",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10619,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0tdrpr386z(){try{__CLR4_2_085x85xlnxz22wa.R.inc(10619);
        __CLR4_2_085x85xlnxz22wa.R.inc(10620);String m1 = DataUtil.mimeBoundary();
        __CLR4_2_085x85xlnxz22wa.R.inc(10621);String m2 = DataUtil.mimeBoundary();

        __CLR4_2_085x85xlnxz22wa.R.inc(10622);assertEquals(DataUtil.boundaryLength, m1.length());
        __CLR4_2_085x85xlnxz22wa.R.inc(10623);assertEquals(DataUtil.boundaryLength, m2.length());
        __CLR4_2_085x85xlnxz22wa.R.inc(10624);assertNotSame(m1, m2);
    }finally{__CLR4_2_085x85xlnxz22wa.R.flushNeeded();}}
    
    @Test
    public void wrongMetaCharsetFallback() throws IOException {__CLR4_2_085x85xlnxz22wa.R.globalSliceStart(getClass().getName(),10625);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0xkgknx875();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_085x85xlnxz22wa.R.rethrow($CLV_t2$);}finally{__CLR4_2_085x85xlnxz22wa.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.DataUtilTest.wrongMetaCharsetFallback",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10625,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0xkgknx875() throws IOException{try{__CLR4_2_085x85xlnxz22wa.R.inc(10625);
        __CLR4_2_085x85xlnxz22wa.R.inc(10626);String html = "<html><head><meta charset=iso-8></head><body></body></html>";

        __CLR4_2_085x85xlnxz22wa.R.inc(10627);Document doc = DataUtil.parseInputStream(stream(html), null, "http://example.com", Parser.htmlParser());

        __CLR4_2_085x85xlnxz22wa.R.inc(10628);final String expected = "<html>\n" +
            " <head>\n" +
            "  <meta charset=\"iso-8\">\n" +
            " </head>\n" +
            " <body></body>\n" +
            "</html>";

        __CLR4_2_085x85xlnxz22wa.R.inc(10629);assertEquals(expected, doc.toString());
    }finally{__CLR4_2_085x85xlnxz22wa.R.flushNeeded();}}

    @Test
    public void secondMetaElementWithContentTypeContainsCharsetParameter() throws Exception {__CLR4_2_085x85xlnxz22wa.R.globalSliceStart(getClass().getName(),10630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0cs9sq587a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_085x85xlnxz22wa.R.rethrow($CLV_t2$);}finally{__CLR4_2_085x85xlnxz22wa.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.DataUtilTest.secondMetaElementWithContentTypeContainsCharsetParameter",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10630,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0cs9sq587a() throws Exception{try{__CLR4_2_085x85xlnxz22wa.R.inc(10630);
        __CLR4_2_085x85xlnxz22wa.R.inc(10631);String html = "<html><head>" +
                "<meta http-equiv=\"Content-Type\" content=\"text/html\">" +
                "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\">" +
                "</head><body>\ud55c\uad6d\uc5b4</body></html>";

        __CLR4_2_085x85xlnxz22wa.R.inc(10632);Document doc = DataUtil.parseInputStream(stream(html, "euc-kr"), null, "http://example.com", Parser.htmlParser());

        __CLR4_2_085x85xlnxz22wa.R.inc(10633);assertEquals("\ud55c\uad6d\uc5b4", doc.body().text());
    }finally{__CLR4_2_085x85xlnxz22wa.R.flushNeeded();}}

    @Test
    public void firstMetaElementWithCharsetShouldBeUsedForDecoding() throws Exception {__CLR4_2_085x85xlnxz22wa.R.globalSliceStart(getClass().getName(),10634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0bavg2x87e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_085x85xlnxz22wa.R.rethrow($CLV_t2$);}finally{__CLR4_2_085x85xlnxz22wa.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.DataUtilTest.firstMetaElementWithCharsetShouldBeUsedForDecoding",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10634,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0bavg2x87e() throws Exception{try{__CLR4_2_085x85xlnxz22wa.R.inc(10634);
        __CLR4_2_085x85xlnxz22wa.R.inc(10635);String html = "<html><head>" +
                "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">" +
                "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=koi8-u\">" +
                "</head><body>\u00dcbergr\u00f6\u00dfentr\u00e4ger</body></html>";

        __CLR4_2_085x85xlnxz22wa.R.inc(10636);Document doc = DataUtil.parseInputStream(stream(html, "iso-8859-1"), null, "http://example.com", Parser.htmlParser());

        __CLR4_2_085x85xlnxz22wa.R.inc(10637);assertEquals("\u00dcbergr\u00f6\u00dfentr\u00e4ger", doc.body().text());
    }finally{__CLR4_2_085x85xlnxz22wa.R.flushNeeded();}}

    @Test
    public void supportsBOMinFiles() throws IOException {__CLR4_2_085x85xlnxz22wa.R.globalSliceStart(getClass().getName(),10638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0kb5fp987i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_085x85xlnxz22wa.R.rethrow($CLV_t2$);}finally{__CLR4_2_085x85xlnxz22wa.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.DataUtilTest.supportsBOMinFiles",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10638,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0kb5fp987i() throws IOException{try{__CLR4_2_085x85xlnxz22wa.R.inc(10638);
        // test files from http://www.i18nl10n.com/korean/utftest/
        __CLR4_2_085x85xlnxz22wa.R.inc(10639);File in = getFile("/bomtests/bom_utf16be.html");
        __CLR4_2_085x85xlnxz22wa.R.inc(10640);Document doc = Jsoup.parse(in, null, "http://example.com");
        __CLR4_2_085x85xlnxz22wa.R.inc(10641);assertTrue(doc.title().contains("UTF-16BE"));
        __CLR4_2_085x85xlnxz22wa.R.inc(10642);assertTrue(doc.text().contains("\uac00\uac01\uac02\uac03\uac04\uac05"));

        __CLR4_2_085x85xlnxz22wa.R.inc(10643);in = getFile("/bomtests/bom_utf16le.html");
        __CLR4_2_085x85xlnxz22wa.R.inc(10644);doc = Jsoup.parse(in, null, "http://example.com");
        __CLR4_2_085x85xlnxz22wa.R.inc(10645);assertTrue(doc.title().contains("UTF-16LE"));
        __CLR4_2_085x85xlnxz22wa.R.inc(10646);assertTrue(doc.text().contains("\uac00\uac01\uac02\uac03\uac04\uac05"));

        __CLR4_2_085x85xlnxz22wa.R.inc(10647);in = getFile("/bomtests/bom_utf32be.html");
        __CLR4_2_085x85xlnxz22wa.R.inc(10648);doc = Jsoup.parse(in, null, "http://example.com");
        __CLR4_2_085x85xlnxz22wa.R.inc(10649);assertTrue(doc.title().contains("UTF-32BE"));
        __CLR4_2_085x85xlnxz22wa.R.inc(10650);assertTrue(doc.text().contains("\uac00\uac01\uac02\uac03\uac04\uac05"));

        __CLR4_2_085x85xlnxz22wa.R.inc(10651);in = getFile("/bomtests/bom_utf32le.html");
        __CLR4_2_085x85xlnxz22wa.R.inc(10652);doc = Jsoup.parse(in, null, "http://example.com");
        __CLR4_2_085x85xlnxz22wa.R.inc(10653);assertTrue(doc.title().contains("UTF-32LE"));
        __CLR4_2_085x85xlnxz22wa.R.inc(10654);assertTrue(doc.text().contains("\uac00\uac01\uac02\uac03\uac04\uac05"));
    }finally{__CLR4_2_085x85xlnxz22wa.R.flushNeeded();}}

    @Test
    public void supportsUTF8BOM() throws IOException {__CLR4_2_085x85xlnxz22wa.R.globalSliceStart(getClass().getName(),10655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0o4cz3i87z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_085x85xlnxz22wa.R.rethrow($CLV_t2$);}finally{__CLR4_2_085x85xlnxz22wa.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.DataUtilTest.supportsUTF8BOM",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10655,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0o4cz3i87z() throws IOException{try{__CLR4_2_085x85xlnxz22wa.R.inc(10655);
        __CLR4_2_085x85xlnxz22wa.R.inc(10656);File in = getFile("/bomtests/bom_utf8.html");
        __CLR4_2_085x85xlnxz22wa.R.inc(10657);Document doc = Jsoup.parse(in, null, "http://example.com");
        __CLR4_2_085x85xlnxz22wa.R.inc(10658);assertEquals("OK", doc.head().select("title").text());
    }finally{__CLR4_2_085x85xlnxz22wa.R.flushNeeded();}}

    @Test
    public void supportsXmlCharsetDeclaration() throws IOException {__CLR4_2_085x85xlnxz22wa.R.globalSliceStart(getClass().getName(),10659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_09wtfy0883();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_085x85xlnxz22wa.R.rethrow($CLV_t2$);}finally{__CLR4_2_085x85xlnxz22wa.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.DataUtilTest.supportsXmlCharsetDeclaration",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10659,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_09wtfy0883() throws IOException{try{__CLR4_2_085x85xlnxz22wa.R.inc(10659);
        __CLR4_2_085x85xlnxz22wa.R.inc(10660);String encoding = "iso-8859-1";
        __CLR4_2_085x85xlnxz22wa.R.inc(10661);InputStream soup = new ByteArrayInputStream((
            "<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>" +
                "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" +
                "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00f6 W\u00f6rld!</html>"
        ).getBytes(encoding));

        __CLR4_2_085x85xlnxz22wa.R.inc(10662);Document doc = Jsoup.parse(soup, null, "");
        __CLR4_2_085x85xlnxz22wa.R.inc(10663);assertEquals("Hell\u00f6 W\u00f6rld!", doc.body().text());
    }finally{__CLR4_2_085x85xlnxz22wa.R.flushNeeded();}}
}
