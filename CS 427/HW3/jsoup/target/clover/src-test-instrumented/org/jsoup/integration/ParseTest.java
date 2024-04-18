/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.integration;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.*;
import java.net.URISyntaxException;

import static org.junit.Assert.*;

/**
 * Integration test: parses from real-world example HTML.
 *
 * @author Jonathan Hedley, jonathan@hedley.net
 */
public class ParseTest {static class __CLR4_2_08fz8fzlnxz22x1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767707166L,8589935092L,11044,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testSmhBizArticle() throws IOException {__CLR4_2_08fz8fzlnxz22x1.R.globalSliceStart(getClass().getName(),10943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0u1j5iy8fz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08fz8fzlnxz22x1.R.rethrow($CLV_t2$);}finally{__CLR4_2_08fz8fzlnxz22x1.R.globalSliceEnd(getClass().getName(),"org.jsoup.integration.ParseTest.testSmhBizArticle",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10943,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0u1j5iy8fz() throws IOException{try{__CLR4_2_08fz8fzlnxz22x1.R.inc(10943);
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10944);File in = getFile("/htmltests/smh-biz-article-1.html");
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10945);Document doc = Jsoup.parse(in, "UTF-8",
                "http://www.smh.com.au/business/the-boards-next-fear-the-female-quota-20100106-lteq.html");
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10946);assertEquals("The board\u2019s next fear: the female quota",
                doc.title()); // note that the apos in the source is a literal \u2019 (8217), not escaped or '
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10947);assertEquals("en", doc.select("html").attr("xml:lang"));

        __CLR4_2_08fz8fzlnxz22x1.R.inc(10948);Elements articleBody = doc.select(".articleBody > *");
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10949);assertEquals(17, articleBody.size());
        // todo: more tests!

    }finally{__CLR4_2_08fz8fzlnxz22x1.R.flushNeeded();}}

    @Test
    public void testNewsHomepage() throws IOException {__CLR4_2_08fz8fzlnxz22x1.R.globalSliceStart(getClass().getName(),10950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_02vn1iy8g6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08fz8fzlnxz22x1.R.rethrow($CLV_t2$);}finally{__CLR4_2_08fz8fzlnxz22x1.R.globalSliceEnd(getClass().getName(),"org.jsoup.integration.ParseTest.testNewsHomepage",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10950,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_02vn1iy8g6() throws IOException{try{__CLR4_2_08fz8fzlnxz22x1.R.inc(10950);
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10951);File in = getFile("/htmltests/news-com-au-home.html");
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10952);Document doc = Jsoup.parse(in, "UTF-8", "http://www.news.com.au/");
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10953);assertEquals("News.com.au | News from Australia and around the world online | NewsComAu", doc.title());
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10954);assertEquals("Brace yourself for Metro meltdown", doc.select(".id1225817868581 h4").text().trim());

        __CLR4_2_08fz8fzlnxz22x1.R.inc(10955);Element a = doc.select("a[href=/entertainment/horoscopes]").first();
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10956);assertEquals("/entertainment/horoscopes", a.attr("href"));
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10957);assertEquals("http://www.news.com.au/entertainment/horoscopes", a.attr("abs:href"));

        __CLR4_2_08fz8fzlnxz22x1.R.inc(10958);Element hs = doc.select("a[href*=naughty-corners-are-a-bad-idea]").first();
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10959);assertEquals(
                "http://www.heraldsun.com.au/news/naughty-corners-are-a-bad-idea-for-kids/story-e6frf7jo-1225817899003",
                hs.attr("href"));
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10960);assertEquals(hs.attr("href"), hs.attr("abs:href"));
    }finally{__CLR4_2_08fz8fzlnxz22x1.R.flushNeeded();}}

    @Test
    public void testGoogleSearchIpod() throws IOException {__CLR4_2_08fz8fzlnxz22x1.R.globalSliceStart(getClass().getName(),10961);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0bvml6y8gh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08fz8fzlnxz22x1.R.rethrow($CLV_t2$);}finally{__CLR4_2_08fz8fzlnxz22x1.R.globalSliceEnd(getClass().getName(),"org.jsoup.integration.ParseTest.testGoogleSearchIpod",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10961,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0bvml6y8gh() throws IOException{try{__CLR4_2_08fz8fzlnxz22x1.R.inc(10961);
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10962);File in = getFile("/htmltests/google-ipod.html");
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10963);Document doc = Jsoup.parse(in, "UTF-8", "http://www.google.com/search?hl=en&q=ipod&aq=f&oq=&aqi=g10");
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10964);assertEquals("ipod - Google Search", doc.title());
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10965);Elements results = doc.select("h3.r > a");
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10966);assertEquals(12, results.size());
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10967);assertEquals(
                "http://news.google.com/news?hl=en&q=ipod&um=1&ie=UTF-8&ei=uYlKS4SbBoGg6gPf-5XXCw&sa=X&oi=news_group&ct=title&resnum=1&ved=0CCIQsQQwAA",
                results.get(0).attr("href"));
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10968);assertEquals("http://www.apple.com/itunes/",
                results.get(1).attr("href"));
    }finally{__CLR4_2_08fz8fzlnxz22x1.R.flushNeeded();}}

    @Test
    public void testBinaryThrowsException() throws IOException {__CLR4_2_08fz8fzlnxz22x1.R.globalSliceStart(getClass().getName(),10969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ixffp28gp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08fz8fzlnxz22x1.R.rethrow($CLV_t2$);}finally{__CLR4_2_08fz8fzlnxz22x1.R.globalSliceEnd(getClass().getName(),"org.jsoup.integration.ParseTest.testBinaryThrowsException",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10969,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ixffp28gp() throws IOException{try{__CLR4_2_08fz8fzlnxz22x1.R.inc(10969);
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10970);File in = getFile("/htmltests/thumb.jpg");

        __CLR4_2_08fz8fzlnxz22x1.R.inc(10971);boolean threw = false;
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10972);try {
            __CLR4_2_08fz8fzlnxz22x1.R.inc(10973);Document doc = Jsoup.parse(in, "UTF-8");
        } catch (IOException e) {
            __CLR4_2_08fz8fzlnxz22x1.R.inc(10974);threw = true;
            __CLR4_2_08fz8fzlnxz22x1.R.inc(10975);assertEquals("Input is binary and unsupported", e.getMessage());
        }
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10976);assertTrue(threw);
    }finally{__CLR4_2_08fz8fzlnxz22x1.R.flushNeeded();}}

    @Test
    public void testYahooJp() throws IOException {__CLR4_2_08fz8fzlnxz22x1.R.globalSliceStart(getClass().getName(),10977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0o9azqz8gx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08fz8fzlnxz22x1.R.rethrow($CLV_t2$);}finally{__CLR4_2_08fz8fzlnxz22x1.R.globalSliceEnd(getClass().getName(),"org.jsoup.integration.ParseTest.testYahooJp",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10977,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0o9azqz8gx() throws IOException{try{__CLR4_2_08fz8fzlnxz22x1.R.inc(10977);
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10978);File in = getFile("/htmltests/yahoo-jp.html");
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10979);Document doc = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html"); // http charset is utf-8.
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10980);assertEquals("Yahoo! JAPAN", doc.title());
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10981);Element a = doc.select("a[href=t/2322m2]").first();
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10982);assertEquals("http://www.yahoo.co.jp/_ylh=X3oDMTB0NWxnaGxsBF9TAzIwNzcyOTYyNjUEdGlkAzEyBHRtcGwDZ2Ex/t/2322m2",
                a.attr("abs:href")); // session put into <base>
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10983);assertEquals("\u5168\u56fd\u3001\u4eba\u6c17\u306e\u99c5\u30e9\u30f3\u30ad\u30f3\u30b0", a.text());
    }finally{__CLR4_2_08fz8fzlnxz22x1.R.flushNeeded();}}

    @Test
    public void testBaidu() throws IOException {__CLR4_2_08fz8fzlnxz22x1.R.globalSliceStart(getClass().getName(),10984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0msil2o8h4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08fz8fzlnxz22x1.R.rethrow($CLV_t2$);}finally{__CLR4_2_08fz8fzlnxz22x1.R.globalSliceEnd(getClass().getName(),"org.jsoup.integration.ParseTest.testBaidu",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10984,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0msil2o8h4() throws IOException{try{__CLR4_2_08fz8fzlnxz22x1.R.inc(10984);
        // tests <meta http-equiv="Content-Type" content="text/html;charset=gb2312">
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10985);File in = getFile("/htmltests/baidu-cn-home.html");
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10986);Document doc = Jsoup.parse(in, null,
                "http://www.baidu.com/"); // http charset is gb2312, but NOT specifying it, to test http-equiv parse
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10987);Element submit = doc.select("#su").first();
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10988);assertEquals("\u767e\u5ea6\u4e00\u4e0b", submit.attr("value"));

        // test from attribute match
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10989);submit = doc.select("input[value=\u767e\u5ea6\u4e00\u4e0b]").first();
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10990);assertEquals("su", submit.id());
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10991);Element newsLink = doc.select("a:contains(\u65b0)").first();
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10992);assertEquals("http://news.baidu.com", newsLink.absUrl("href"));

        // check auto-detect from meta
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10993);assertEquals("GB2312", doc.outputSettings().charset().displayName());
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10994);assertEquals("<title>\u767e\u5ea6\u4e00\u4e0b\uff0c\u4f60\u5c31\u77e5\u9053      </title>", doc.select("title").outerHtml());

        __CLR4_2_08fz8fzlnxz22x1.R.inc(10995);doc.outputSettings().charset("ascii");
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10996);assertEquals("<title>&#x767e;&#x5ea6;&#x4e00;&#x4e0b;&#xff0c;&#x4f60;&#x5c31;&#x77e5;&#x9053;      </title>",
                doc.select("title").outerHtml());
    }finally{__CLR4_2_08fz8fzlnxz22x1.R.flushNeeded();}}

    @Test
    public void testBaiduVariant() throws IOException {__CLR4_2_08fz8fzlnxz22x1.R.globalSliceStart(getClass().getName(),10997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0i7isv18hh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08fz8fzlnxz22x1.R.rethrow($CLV_t2$);}finally{__CLR4_2_08fz8fzlnxz22x1.R.globalSliceEnd(getClass().getName(),"org.jsoup.integration.ParseTest.testBaiduVariant",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10997,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0i7isv18hh() throws IOException{try{__CLR4_2_08fz8fzlnxz22x1.R.inc(10997);
        // tests <meta charset> when preceded by another <meta>
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10998);File in = getFile("/htmltests/baidu-variant.html");
        __CLR4_2_08fz8fzlnxz22x1.R.inc(10999);Document doc = Jsoup.parse(in, null,
                "http://www.baidu.com/"); // http charset is gb2312, but NOT specifying it, to test http-equiv parse
        // check auto-detect from meta
        __CLR4_2_08fz8fzlnxz22x1.R.inc(11000);assertEquals("GB2312", doc.outputSettings().charset().displayName());
        __CLR4_2_08fz8fzlnxz22x1.R.inc(11001);assertEquals("<title>\u767e\u5ea6\u4e00\u4e0b\uff0c\u4f60\u5c31\u77e5\u9053</title>", doc.select("title").outerHtml());
    }finally{__CLR4_2_08fz8fzlnxz22x1.R.flushNeeded();}}

    @Test
    public void testHtml5Charset() throws IOException {__CLR4_2_08fz8fzlnxz22x1.R.globalSliceStart(getClass().getName(),11002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0o9t0ud8hm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08fz8fzlnxz22x1.R.rethrow($CLV_t2$);}finally{__CLR4_2_08fz8fzlnxz22x1.R.globalSliceEnd(getClass().getName(),"org.jsoup.integration.ParseTest.testHtml5Charset",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11002,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0o9t0ud8hm() throws IOException{try{__CLR4_2_08fz8fzlnxz22x1.R.inc(11002);
        // test that <meta charset="gb2312"> works
        __CLR4_2_08fz8fzlnxz22x1.R.inc(11003);File in = getFile("/htmltests/meta-charset-1.html");
        __CLR4_2_08fz8fzlnxz22x1.R.inc(11004);Document doc = Jsoup.parse(in, null, "http://example.com/"); //gb2312, has html5 <meta charset>
        __CLR4_2_08fz8fzlnxz22x1.R.inc(11005);assertEquals("\u65b0", doc.text());
        __CLR4_2_08fz8fzlnxz22x1.R.inc(11006);assertEquals("GB2312", doc.outputSettings().charset().displayName());

        // double check, no charset, falls back to utf8 which is incorrect
        __CLR4_2_08fz8fzlnxz22x1.R.inc(11007);in = getFile("/htmltests/meta-charset-2.html"); //
        __CLR4_2_08fz8fzlnxz22x1.R.inc(11008);doc = Jsoup.parse(in, null, "http://example.com"); // gb2312, no charset
        __CLR4_2_08fz8fzlnxz22x1.R.inc(11009);assertEquals("UTF-8", doc.outputSettings().charset().displayName());
        __CLR4_2_08fz8fzlnxz22x1.R.inc(11010);assertFalse("\u65b0".equals(doc.text()));

        // confirm fallback to utf8
        __CLR4_2_08fz8fzlnxz22x1.R.inc(11011);in = getFile("/htmltests/meta-charset-3.html");
        __CLR4_2_08fz8fzlnxz22x1.R.inc(11012);doc = Jsoup.parse(in, null, "http://example.com/"); // utf8, no charset
        __CLR4_2_08fz8fzlnxz22x1.R.inc(11013);assertEquals("UTF-8", doc.outputSettings().charset().displayName());
        __CLR4_2_08fz8fzlnxz22x1.R.inc(11014);assertEquals("\u65b0", doc.text());
    }finally{__CLR4_2_08fz8fzlnxz22x1.R.flushNeeded();}}

    @Test
    public void testBrokenHtml5CharsetWithASingleDoubleQuote() throws IOException {__CLR4_2_08fz8fzlnxz22x1.R.globalSliceStart(getClass().getName(),11015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0rgp5h48hz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08fz8fzlnxz22x1.R.rethrow($CLV_t2$);}finally{__CLR4_2_08fz8fzlnxz22x1.R.globalSliceEnd(getClass().getName(),"org.jsoup.integration.ParseTest.testBrokenHtml5CharsetWithASingleDoubleQuote",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11015,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0rgp5h48hz() throws IOException{try{__CLR4_2_08fz8fzlnxz22x1.R.inc(11015);
        __CLR4_2_08fz8fzlnxz22x1.R.inc(11016);InputStream in = inputStreamFrom("<html>\n" +
                "<head><meta charset=UTF-8\"></head>\n" +
                "<body></body>\n" +
                "</html>");
        __CLR4_2_08fz8fzlnxz22x1.R.inc(11017);Document doc = Jsoup.parse(in, null, "http://example.com/");
        __CLR4_2_08fz8fzlnxz22x1.R.inc(11018);assertEquals("UTF-8", doc.outputSettings().charset().displayName());
    }finally{__CLR4_2_08fz8fzlnxz22x1.R.flushNeeded();}}

    @Test
    public void testNytArticle() throws IOException {__CLR4_2_08fz8fzlnxz22x1.R.globalSliceStart(getClass().getName(),11019);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_08y856u8i3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08fz8fzlnxz22x1.R.rethrow($CLV_t2$);}finally{__CLR4_2_08fz8fzlnxz22x1.R.globalSliceEnd(getClass().getName(),"org.jsoup.integration.ParseTest.testNytArticle",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11019,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_08y856u8i3() throws IOException{try{__CLR4_2_08fz8fzlnxz22x1.R.inc(11019);
        // has tags like <nyt_text>
        __CLR4_2_08fz8fzlnxz22x1.R.inc(11020);File in = getFile("/htmltests/nyt-article-1.html");
        __CLR4_2_08fz8fzlnxz22x1.R.inc(11021);Document doc = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp");

        __CLR4_2_08fz8fzlnxz22x1.R.inc(11022);Element headline = doc.select("nyt_headline[version=1.0]").first();
        __CLR4_2_08fz8fzlnxz22x1.R.inc(11023);assertEquals("As BP Lays Out Future, It Will Not Include Hayward", headline.text());
    }finally{__CLR4_2_08fz8fzlnxz22x1.R.flushNeeded();}}

    @Test
    public void testYahooArticle() throws IOException {__CLR4_2_08fz8fzlnxz22x1.R.globalSliceStart(getClass().getName(),11024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_03flor38i8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08fz8fzlnxz22x1.R.rethrow($CLV_t2$);}finally{__CLR4_2_08fz8fzlnxz22x1.R.globalSliceEnd(getClass().getName(),"org.jsoup.integration.ParseTest.testYahooArticle",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11024,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_03flor38i8() throws IOException{try{__CLR4_2_08fz8fzlnxz22x1.R.inc(11024);
        __CLR4_2_08fz8fzlnxz22x1.R.inc(11025);File in = getFile("/htmltests/yahoo-article-1.html");
        __CLR4_2_08fz8fzlnxz22x1.R.inc(11026);Document doc = Jsoup.parse(in, "UTF-8", "http://news.yahoo.com/s/nm/20100831/bs_nm/us_gm_china");
        __CLR4_2_08fz8fzlnxz22x1.R.inc(11027);Element p = doc.select("p:contains(Volt will be sold in the United States)").first();
        __CLR4_2_08fz8fzlnxz22x1.R.inc(11028);assertEquals("In July, GM said its electric Chevrolet Volt will be sold in the United States at $41,000 -- $8,000 more than its nearest competitor, the Nissan Leaf.", p.text());
    }finally{__CLR4_2_08fz8fzlnxz22x1.R.flushNeeded();}}

    @Test
    public void testLowercaseUtf8Charset() throws IOException {__CLR4_2_08fz8fzlnxz22x1.R.globalSliceStart(getClass().getName(),11029);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0vgwggt8id();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08fz8fzlnxz22x1.R.rethrow($CLV_t2$);}finally{__CLR4_2_08fz8fzlnxz22x1.R.globalSliceEnd(getClass().getName(),"org.jsoup.integration.ParseTest.testLowercaseUtf8Charset",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11029,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0vgwggt8id() throws IOException{try{__CLR4_2_08fz8fzlnxz22x1.R.inc(11029);
        __CLR4_2_08fz8fzlnxz22x1.R.inc(11030);File in = getFile("/htmltests/lowercase-charset-test.html");
        __CLR4_2_08fz8fzlnxz22x1.R.inc(11031);Document doc = Jsoup.parse(in, null);

        __CLR4_2_08fz8fzlnxz22x1.R.inc(11032);Element form = doc.select("#form").first();
        __CLR4_2_08fz8fzlnxz22x1.R.inc(11033);assertEquals(2, form.children().size());
        __CLR4_2_08fz8fzlnxz22x1.R.inc(11034);assertEquals("UTF-8", doc.outputSettings().charset().name());
    }finally{__CLR4_2_08fz8fzlnxz22x1.R.flushNeeded();}}

    public static File getFile(String resourceName) {try{__CLR4_2_08fz8fzlnxz22x1.R.inc(11035);
        __CLR4_2_08fz8fzlnxz22x1.R.inc(11036);try {
            __CLR4_2_08fz8fzlnxz22x1.R.inc(11037);File file = new File(ParseTest.class.getResource(resourceName).toURI());
            __CLR4_2_08fz8fzlnxz22x1.R.inc(11038);return file;
        } catch (URISyntaxException e) {
            __CLR4_2_08fz8fzlnxz22x1.R.inc(11039);throw new IllegalStateException(e);
        }
    }finally{__CLR4_2_08fz8fzlnxz22x1.R.flushNeeded();}}

    public static InputStream inputStreamFrom(String s) {try{__CLR4_2_08fz8fzlnxz22x1.R.inc(11040);
        __CLR4_2_08fz8fzlnxz22x1.R.inc(11041);try {
            __CLR4_2_08fz8fzlnxz22x1.R.inc(11042);return new ByteArrayInputStream(s.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            __CLR4_2_08fz8fzlnxz22x1.R.inc(11043);throw new RuntimeException(e);
        }
    }finally{__CLR4_2_08fz8fzlnxz22x1.R.flushNeeded();}}

}
