/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TokeniserStateTest {static class __CLR4_2_0gh2gh2lnxz2395{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767707166L,8589935092L,21455,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    final char[] whiteSpace = { '\t', '\n', '\r', '\f', ' ' };
    final char[] quote = { '\'', '"' };

    @Test
    public void ensureSearchArraysAreSorted() {__CLR4_2_0gh2gh2lnxz2395.R.globalSliceStart(getClass().getName(),21350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0g7vftkgh2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gh2gh2lnxz2395.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gh2gh2lnxz2395.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserStateTest.ensureSearchArraysAreSorted",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21350,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0g7vftkgh2(){try{__CLR4_2_0gh2gh2lnxz2395.R.inc(21350);
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21351);char[][] arrays = {
            TokeniserState.attributeSingleValueCharsSorted,
            TokeniserState.attributeDoubleValueCharsSorted,
            TokeniserState.attributeNameCharsSorted,
            TokeniserState.attributeValueUnquoted
        };

        __CLR4_2_0gh2gh2lnxz2395.R.inc(21352);for (char[] array : arrays) {{
            __CLR4_2_0gh2gh2lnxz2395.R.inc(21353);char[] copy = Arrays.copyOf(array, array.length);
            __CLR4_2_0gh2gh2lnxz2395.R.inc(21354);Arrays.sort(array);
            __CLR4_2_0gh2gh2lnxz2395.R.inc(21355);assertArrayEquals(array, copy);
        }
    }}finally{__CLR4_2_0gh2gh2lnxz2395.R.flushNeeded();}}

    @Test
    public void testCharacterReferenceInRcdata() {__CLR4_2_0gh2gh2lnxz2395.R.globalSliceStart(getClass().getName(),21356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0rr1rz9gh8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gh2gh2lnxz2395.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gh2gh2lnxz2395.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserStateTest.testCharacterReferenceInRcdata",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21356,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0rr1rz9gh8(){try{__CLR4_2_0gh2gh2lnxz2395.R.inc(21356);
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21357);String body = "<textarea>You&I</textarea>";
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21358);Document doc = Jsoup.parse(body);
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21359);Elements els = doc.select("textarea");
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21360);assertEquals("You&I", els.text());
    }finally{__CLR4_2_0gh2gh2lnxz2395.R.flushNeeded();}}

    @Test
    public void testBeforeTagName() {__CLR4_2_0gh2gh2lnxz2395.R.globalSliceStart(getClass().getName(),21361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0smkrmtghd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gh2gh2lnxz2395.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gh2gh2lnxz2395.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserStateTest.testBeforeTagName",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21361,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0smkrmtghd(){try{__CLR4_2_0gh2gh2lnxz2395.R.inc(21361);
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21362);for (char c : whiteSpace) {{
            __CLR4_2_0gh2gh2lnxz2395.R.inc(21363);String body = String.format("<div%c>test</div>", c);
            __CLR4_2_0gh2gh2lnxz2395.R.inc(21364);Document doc = Jsoup.parse(body);
            __CLR4_2_0gh2gh2lnxz2395.R.inc(21365);Elements els = doc.select("div");
            __CLR4_2_0gh2gh2lnxz2395.R.inc(21366);assertEquals("test", els.text());
        }
    }}finally{__CLR4_2_0gh2gh2lnxz2395.R.flushNeeded();}}

    @Test
    public void testEndTagOpen() {__CLR4_2_0gh2gh2lnxz2395.R.globalSliceStart(getClass().getName(),21367);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0a8le0ughj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gh2gh2lnxz2395.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gh2gh2lnxz2395.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserStateTest.testEndTagOpen",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21367,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0a8le0ughj(){try{__CLR4_2_0gh2gh2lnxz2395.R.inc(21367);
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21368);String body;
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21369);Document doc;
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21370);Elements els;

        __CLR4_2_0gh2gh2lnxz2395.R.inc(21371);body = "<div>hello world</";
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21372);doc = Jsoup.parse(body);
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21373);els = doc.select("div");
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21374);assertEquals("hello world</", els.text());

        __CLR4_2_0gh2gh2lnxz2395.R.inc(21375);body = "<div>hello world</div>";
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21376);doc = Jsoup.parse(body);
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21377);els = doc.select("div");
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21378);assertEquals("hello world", els.text());

        __CLR4_2_0gh2gh2lnxz2395.R.inc(21379);body = "<div>fake</></div>";
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21380);doc = Jsoup.parse(body);
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21381);els = doc.select("div");
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21382);assertEquals("fake", els.text());

        __CLR4_2_0gh2gh2lnxz2395.R.inc(21383);body = "<div>fake</?</div>";
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21384);doc = Jsoup.parse(body);
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21385);els = doc.select("div");
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21386);assertEquals("fake", els.text());
    }finally{__CLR4_2_0gh2gh2lnxz2395.R.flushNeeded();}}

    @Test
    public void testRcdataLessthanSign() {__CLR4_2_0gh2gh2lnxz2395.R.globalSliceStart(getClass().getName(),21387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0y6tlrpgi3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gh2gh2lnxz2395.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gh2gh2lnxz2395.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserStateTest.testRcdataLessthanSign",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21387,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0y6tlrpgi3(){try{__CLR4_2_0gh2gh2lnxz2395.R.inc(21387);
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21388);String body;
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21389);Document doc;
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21390);Elements els;

        __CLR4_2_0gh2gh2lnxz2395.R.inc(21391);body = "<textarea><fake></textarea>";
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21392);doc = Jsoup.parse(body);
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21393);els = doc.select("textarea");
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21394);assertEquals("<fake>", els.text());

        __CLR4_2_0gh2gh2lnxz2395.R.inc(21395);body = "<textarea><open";
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21396);doc = Jsoup.parse(body);
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21397);els = doc.select("textarea");
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21398);assertEquals("", els.text());

        __CLR4_2_0gh2gh2lnxz2395.R.inc(21399);body = "<textarea>hello world</?fake</textarea>";
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21400);doc = Jsoup.parse(body);
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21401);els = doc.select("textarea");
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21402);assertEquals("hello world</?fake", els.text());
    }finally{__CLR4_2_0gh2gh2lnxz2395.R.flushNeeded();}}

    @Test
    public void testRCDATAEndTagName() {__CLR4_2_0gh2gh2lnxz2395.R.globalSliceStart(getClass().getName(),21403);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_04enl3ygij();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gh2gh2lnxz2395.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gh2gh2lnxz2395.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserStateTest.testRCDATAEndTagName",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21403,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_04enl3ygij(){try{__CLR4_2_0gh2gh2lnxz2395.R.inc(21403);
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21404);for (char c : whiteSpace) {{
            __CLR4_2_0gh2gh2lnxz2395.R.inc(21405);String body = String.format("<textarea>data</textarea%c>", c);
            __CLR4_2_0gh2gh2lnxz2395.R.inc(21406);Document doc = Jsoup.parse(body);
            __CLR4_2_0gh2gh2lnxz2395.R.inc(21407);Elements els = doc.select("textarea");
            __CLR4_2_0gh2gh2lnxz2395.R.inc(21408);assertEquals("data", els.text());
        }
    }}finally{__CLR4_2_0gh2gh2lnxz2395.R.flushNeeded();}}

    @Test
    public void testCommentEndCoverage() {__CLR4_2_0gh2gh2lnxz2395.R.globalSliceStart(getClass().getName(),21409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0aydd4tgip();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gh2gh2lnxz2395.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gh2gh2lnxz2395.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserStateTest.testCommentEndCoverage",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21409,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0aydd4tgip(){try{__CLR4_2_0gh2gh2lnxz2395.R.inc(21409);
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21410);String html = "<html><head></head><body><img src=foo><!-- <table><tr><td></table> --! --- --><p>Hello</p></body></html>";
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21411);Document doc = Jsoup.parse(html);

        __CLR4_2_0gh2gh2lnxz2395.R.inc(21412);Element body = doc.body();
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21413);Comment comment = (Comment) body.childNode(1);
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21414);assertEquals(" <table><tr><td></table> --! --- ", comment.getData());
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21415);Element p = body.child(1);
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21416);TextNode text = (TextNode) p.childNode(0);
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21417);assertEquals("Hello", text.getWholeText());
    }finally{__CLR4_2_0gh2gh2lnxz2395.R.flushNeeded();}}

    @Test
    public void testCommentEndBangCoverage() {__CLR4_2_0gh2gh2lnxz2395.R.globalSliceStart(getClass().getName(),21418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0os2ot1giy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gh2gh2lnxz2395.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gh2gh2lnxz2395.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserStateTest.testCommentEndBangCoverage",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21418,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0os2ot1giy(){try{__CLR4_2_0gh2gh2lnxz2395.R.inc(21418);
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21419);String html = "<html><head></head><body><img src=foo><!-- <table><tr><td></table> --!---!>--><p>Hello</p></body></html>";
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21420);Document doc = Jsoup.parse(html);

        __CLR4_2_0gh2gh2lnxz2395.R.inc(21421);Element body = doc.body();
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21422);Comment comment = (Comment) body.childNode(1);
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21423);assertEquals(" <table><tr><td></table> --!-", comment.getData());
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21424);Element p = body.child(1);
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21425);TextNode text = (TextNode) p.childNode(0);
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21426);assertEquals("Hello", text.getWholeText());
    }finally{__CLR4_2_0gh2gh2lnxz2395.R.flushNeeded();}}

    @Test
    public void testPublicIdentifiersWithWhitespace() {__CLR4_2_0gh2gh2lnxz2395.R.globalSliceStart(getClass().getName(),21427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_06b18gpgj7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gh2gh2lnxz2395.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gh2gh2lnxz2395.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserStateTest.testPublicIdentifiersWithWhitespace",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21427,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_06b18gpgj7(){try{__CLR4_2_0gh2gh2lnxz2395.R.inc(21427);
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21428);String expectedOutput = "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.0//EN\">";
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21429);for (char q : quote) {{
            __CLR4_2_0gh2gh2lnxz2395.R.inc(21430);for (char ws : whiteSpace) {{
                __CLR4_2_0gh2gh2lnxz2395.R.inc(21431);String[] htmls = { 
                        String.format("<!DOCTYPE html%cPUBLIC %c-//W3C//DTD HTML 4.0//EN%c>", ws, q, q),
                        String.format("<!DOCTYPE html %cPUBLIC %c-//W3C//DTD HTML 4.0//EN%c>", ws, q, q),
                        String.format("<!DOCTYPE html PUBLIC%c%c-//W3C//DTD HTML 4.0//EN%c>", ws, q, q),
                        String.format("<!DOCTYPE html PUBLIC %c%c-//W3C//DTD HTML 4.0//EN%c>", ws, q, q),
                        String.format("<!DOCTYPE html PUBLIC %c-//W3C//DTD HTML 4.0//EN%c%c>", q, q, ws),
                        String.format("<!DOCTYPE html PUBLIC%c-//W3C//DTD HTML 4.0//EN%c%c>", q, q, ws)
                    };
                __CLR4_2_0gh2gh2lnxz2395.R.inc(21432);for (String html : htmls) {{
                    __CLR4_2_0gh2gh2lnxz2395.R.inc(21433);Document doc = Jsoup.parse(html);
                    __CLR4_2_0gh2gh2lnxz2395.R.inc(21434);assertEquals(expectedOutput, doc.childNode(0).outerHtml());
                }
            }}
        }}
    }}finally{__CLR4_2_0gh2gh2lnxz2395.R.flushNeeded();}}

    @Test
    public void testSystemIdentifiersWithWhitespace() {__CLR4_2_0gh2gh2lnxz2395.R.globalSliceStart(getClass().getName(),21435);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0oxg7cdgjf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gh2gh2lnxz2395.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gh2gh2lnxz2395.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserStateTest.testSystemIdentifiersWithWhitespace",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21435,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0oxg7cdgjf(){try{__CLR4_2_0gh2gh2lnxz2395.R.inc(21435);
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21436);String expectedOutput = "<!DOCTYPE html SYSTEM \"http://www.w3.org/TR/REC-html40/strict.dtd\">";
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21437);for (char q : quote) {{
            __CLR4_2_0gh2gh2lnxz2395.R.inc(21438);for (char ws : whiteSpace) {{
                __CLR4_2_0gh2gh2lnxz2395.R.inc(21439);String[] htmls = {
                        String.format("<!DOCTYPE html%cSYSTEM %chttp://www.w3.org/TR/REC-html40/strict.dtd%c>", ws, q, q),
                        String.format("<!DOCTYPE html %cSYSTEM %chttp://www.w3.org/TR/REC-html40/strict.dtd%c>", ws, q, q),
                        String.format("<!DOCTYPE html SYSTEM%c%chttp://www.w3.org/TR/REC-html40/strict.dtd%c>", ws, q, q),
                        String.format("<!DOCTYPE html SYSTEM %c%chttp://www.w3.org/TR/REC-html40/strict.dtd%c>", ws, q, q),
                        String.format("<!DOCTYPE html SYSTEM %chttp://www.w3.org/TR/REC-html40/strict.dtd%c%c>", q, q, ws),
                        String.format("<!DOCTYPE html SYSTEM%chttp://www.w3.org/TR/REC-html40/strict.dtd%c%c>", q, q, ws)
                    };
                __CLR4_2_0gh2gh2lnxz2395.R.inc(21440);for (String html : htmls) {{
                    __CLR4_2_0gh2gh2lnxz2395.R.inc(21441);Document doc = Jsoup.parse(html);
                    __CLR4_2_0gh2gh2lnxz2395.R.inc(21442);assertEquals(expectedOutput, doc.childNode(0).outerHtml());
                }
            }}
        }}
    }}finally{__CLR4_2_0gh2gh2lnxz2395.R.flushNeeded();}}

    @Test
    public void testPublicAndSystemIdentifiersWithWhitespace() {__CLR4_2_0gh2gh2lnxz2395.R.globalSliceStart(getClass().getName(),21443);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_04r03pzgjn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gh2gh2lnxz2395.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gh2gh2lnxz2395.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserStateTest.testPublicAndSystemIdentifiersWithWhitespace",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21443,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_04r03pzgjn(){try{__CLR4_2_0gh2gh2lnxz2395.R.inc(21443);
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21444);String expectedOutput = "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.0//EN\""
                + " \"http://www.w3.org/TR/REC-html40/strict.dtd\">";
    	__CLR4_2_0gh2gh2lnxz2395.R.inc(21445);for (char q : quote) {{
            __CLR4_2_0gh2gh2lnxz2395.R.inc(21446);for (char ws : whiteSpace) {{
                __CLR4_2_0gh2gh2lnxz2395.R.inc(21447);String[] htmls = {
                        String.format("<!DOCTYPE html PUBLIC %c-//W3C//DTD HTML 4.0//EN%c"
                                + "%c%chttp://www.w3.org/TR/REC-html40/strict.dtd%c>", q, q, ws, q, q),
                        String.format("<!DOCTYPE html PUBLIC %c-//W3C//DTD HTML 4.0//EN%c"
                                + "%chttp://www.w3.org/TR/REC-html40/strict.dtd%c>", q, q, q, q)
                    };
                __CLR4_2_0gh2gh2lnxz2395.R.inc(21448);for (String html : htmls) {{
                    __CLR4_2_0gh2gh2lnxz2395.R.inc(21449);Document doc = Jsoup.parse(html);
                    __CLR4_2_0gh2gh2lnxz2395.R.inc(21450);assertEquals(expectedOutput, doc.childNode(0).outerHtml());
                }
            }}
        }}
    }}finally{__CLR4_2_0gh2gh2lnxz2395.R.flushNeeded();}}

    @Test public void handlesLessInTagThanAsNewTag() {__CLR4_2_0gh2gh2lnxz2395.R.globalSliceStart(getClass().getName(),21451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0c4ge5hgjv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gh2gh2lnxz2395.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gh2gh2lnxz2395.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserStateTest.handlesLessInTagThanAsNewTag",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21451,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0c4ge5hgjv(){try{__CLR4_2_0gh2gh2lnxz2395.R.inc(21451);
        // out of spec, but clear author intent
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21452);String html = "<p\n<p<div id=one <span>Two";
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21453);Document doc = Jsoup.parse(html);
        __CLR4_2_0gh2gh2lnxz2395.R.inc(21454);assertEquals("<p></p><p></p><div id=\"one\"><span>Two</span></div>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_2_0gh2gh2lnxz2395.R.flushNeeded();}}
}
