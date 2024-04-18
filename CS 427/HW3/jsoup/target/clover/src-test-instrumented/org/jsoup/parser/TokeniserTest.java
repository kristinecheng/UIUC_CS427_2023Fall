/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.parser;

import java.io.UnsupportedEncodingException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.jsoup.parser.CharacterReader.maxBufferLen;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TokeniserTest {static class __CLR4_2_0gjzgjzlnxz2399{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767707166L,8589935092L,21587,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void bufferUpInAttributeVal() {__CLR4_2_0gjzgjzlnxz2399.R.globalSliceStart(getClass().getName(),21455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_02ee33ggjz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gjzgjzlnxz2399.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gjzgjzlnxz2399.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserTest.bufferUpInAttributeVal",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21455,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_02ee33ggjz(){try{__CLR4_2_0gjzgjzlnxz2399.R.inc(21455);
        // https://github.com/jhy/jsoup/issues/967

        // check each double, singlem, unquoted impls
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21456);String[] quotes = {"\"", "'", ""};
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21457);for (String quote : quotes) {{
            __CLR4_2_0gjzgjzlnxz2399.R.inc(21458);String preamble = "<img src=" + quote;
            __CLR4_2_0gjzgjzlnxz2399.R.inc(21459);String tail = "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb";
            __CLR4_2_0gjzgjzlnxz2399.R.inc(21460);StringBuilder sb = new StringBuilder(preamble);

            __CLR4_2_0gjzgjzlnxz2399.R.inc(21461);final int charsToFillBuffer = maxBufferLen - preamble.length();
            __CLR4_2_0gjzgjzlnxz2399.R.inc(21462);for (int i = 0; (((i < charsToFillBuffer)&&(__CLR4_2_0gjzgjzlnxz2399.R.iget(21463)!=0|true))||(__CLR4_2_0gjzgjzlnxz2399.R.iget(21464)==0&false)); i++) {{
                __CLR4_2_0gjzgjzlnxz2399.R.inc(21465);sb.append('a');
            }

            }__CLR4_2_0gjzgjzlnxz2399.R.inc(21466);sb.append('X'); // First character to cross character buffer boundary
            __CLR4_2_0gjzgjzlnxz2399.R.inc(21467);sb.append(tail).append(quote).append(">\n");

            __CLR4_2_0gjzgjzlnxz2399.R.inc(21468);String html = sb.toString();
            __CLR4_2_0gjzgjzlnxz2399.R.inc(21469);Document doc = Jsoup.parse(html);
            __CLR4_2_0gjzgjzlnxz2399.R.inc(21470);String src = doc.select("img").attr("src");

            __CLR4_2_0gjzgjzlnxz2399.R.inc(21471);assertTrue("Handles for quote " + quote, src.contains("X"));
            __CLR4_2_0gjzgjzlnxz2399.R.inc(21472);assertTrue(src.contains(tail));
        }
    }}finally{__CLR4_2_0gjzgjzlnxz2399.R.flushNeeded();}}

    @Test public void handleSuperLargeTagNames() {__CLR4_2_0gjzgjzlnxz2399.R.globalSliceStart(getClass().getName(),21473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0agk05fgkh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gjzgjzlnxz2399.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gjzgjzlnxz2399.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserTest.handleSuperLargeTagNames",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21473,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0agk05fgkh(){try{__CLR4_2_0gjzgjzlnxz2399.R.inc(21473);
        // unlikely, but valid. so who knows.

        __CLR4_2_0gjzgjzlnxz2399.R.inc(21474);StringBuilder sb = new StringBuilder(maxBufferLen);
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21475);do {{
            __CLR4_2_0gjzgjzlnxz2399.R.inc(21476);sb.append("LargeTagName");
        } }while ((((sb.length() < maxBufferLen)&&(__CLR4_2_0gjzgjzlnxz2399.R.iget(21477)!=0|true))||(__CLR4_2_0gjzgjzlnxz2399.R.iget(21478)==0&false)));
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21479);String tag = sb.toString();
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21480);String html = "<" + tag + ">One</" + tag + ">";

        __CLR4_2_0gjzgjzlnxz2399.R.inc(21481);Document doc = Parser.htmlParser().settings(ParseSettings.preserveCase).parseInput(html, "");
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21482);Elements els = doc.select(tag);
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21483);assertEquals(1, els.size());
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21484);Element el = els.first();
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21485);assertNotNull(el);
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21486);assertEquals("One", el.text());
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21487);assertEquals(tag, el.tagName());
    }finally{__CLR4_2_0gjzgjzlnxz2399.R.flushNeeded();}}

    @Test public void handleSuperLargeAttributeName() {__CLR4_2_0gjzgjzlnxz2399.R.globalSliceStart(getClass().getName(),21488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0o2vgvugkw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gjzgjzlnxz2399.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gjzgjzlnxz2399.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserTest.handleSuperLargeAttributeName",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21488,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0o2vgvugkw(){try{__CLR4_2_0gjzgjzlnxz2399.R.inc(21488);
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21489);StringBuilder sb = new StringBuilder(maxBufferLen);
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21490);do {{
            __CLR4_2_0gjzgjzlnxz2399.R.inc(21491);sb.append("LargAttributeName");
        } }while ((((sb.length() < maxBufferLen)&&(__CLR4_2_0gjzgjzlnxz2399.R.iget(21492)!=0|true))||(__CLR4_2_0gjzgjzlnxz2399.R.iget(21493)==0&false)));
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21494);String attrName = sb.toString();
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21495);String html = "<p " + attrName + "=foo>One</p>";

        __CLR4_2_0gjzgjzlnxz2399.R.inc(21496);Document doc = Jsoup.parse(html);
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21497);Elements els = doc.getElementsByAttribute(attrName);
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21498);assertEquals(1, els.size());
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21499);Element el = els.first();
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21500);assertNotNull(el);
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21501);assertEquals("One", el.text());
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21502);Attribute attribute = el.attributes().asList().get(0);
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21503);assertEquals(attrName.toLowerCase(), attribute.getKey());
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21504);assertEquals("foo", attribute.getValue());
    }finally{__CLR4_2_0gjzgjzlnxz2399.R.flushNeeded();}}

    @Test public void handleLargeText() {__CLR4_2_0gjzgjzlnxz2399.R.globalSliceStart(getClass().getName(),21505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0lj16uxgld();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gjzgjzlnxz2399.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gjzgjzlnxz2399.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserTest.handleLargeText",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21505,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0lj16uxgld(){try{__CLR4_2_0gjzgjzlnxz2399.R.inc(21505);
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21506);StringBuilder sb = new StringBuilder(maxBufferLen);
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21507);do {{
            __CLR4_2_0gjzgjzlnxz2399.R.inc(21508);sb.append("A Large Amount of Text");
        } }while ((((sb.length() < maxBufferLen)&&(__CLR4_2_0gjzgjzlnxz2399.R.iget(21509)!=0|true))||(__CLR4_2_0gjzgjzlnxz2399.R.iget(21510)==0&false)));
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21511);String text = sb.toString();
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21512);String html = "<p>" + text + "</p>";

        __CLR4_2_0gjzgjzlnxz2399.R.inc(21513);Document doc = Jsoup.parse(html);
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21514);Elements els = doc.select("p");
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21515);assertEquals(1, els.size());
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21516);Element el = els.first();

        __CLR4_2_0gjzgjzlnxz2399.R.inc(21517);assertNotNull(el);
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21518);assertEquals(text, el.text());
    }finally{__CLR4_2_0gjzgjzlnxz2399.R.flushNeeded();}}

    @Test public void handleLargeComment() {__CLR4_2_0gjzgjzlnxz2399.R.globalSliceStart(getClass().getName(),21519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0bakkabglr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gjzgjzlnxz2399.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gjzgjzlnxz2399.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserTest.handleLargeComment",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21519,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0bakkabglr(){try{__CLR4_2_0gjzgjzlnxz2399.R.inc(21519);
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21520);StringBuilder sb = new StringBuilder(maxBufferLen);
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21521);do {{
            __CLR4_2_0gjzgjzlnxz2399.R.inc(21522);sb.append("Quite a comment ");
        } }while ((((sb.length() < maxBufferLen)&&(__CLR4_2_0gjzgjzlnxz2399.R.iget(21523)!=0|true))||(__CLR4_2_0gjzgjzlnxz2399.R.iget(21524)==0&false)));
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21525);String comment = sb.toString();
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21526);String html = "<p><!-- " + comment + " --></p>";

        __CLR4_2_0gjzgjzlnxz2399.R.inc(21527);Document doc = Jsoup.parse(html);
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21528);Elements els = doc.select("p");
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21529);assertEquals(1, els.size());
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21530);Element el = els.first();

        __CLR4_2_0gjzgjzlnxz2399.R.inc(21531);assertNotNull(el);
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21532);Comment child = (Comment) el.childNode(0);
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21533);assertEquals(" " + comment + " ", child.getData());
    }finally{__CLR4_2_0gjzgjzlnxz2399.R.flushNeeded();}}

    @Test public void handleLargeCdata() {__CLR4_2_0gjzgjzlnxz2399.R.globalSliceStart(getClass().getName(),21534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_01hqgf3gm6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gjzgjzlnxz2399.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gjzgjzlnxz2399.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserTest.handleLargeCdata",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21534,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_01hqgf3gm6(){try{__CLR4_2_0gjzgjzlnxz2399.R.inc(21534);
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21535);StringBuilder sb = new StringBuilder(maxBufferLen);
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21536);do {{
            __CLR4_2_0gjzgjzlnxz2399.R.inc(21537);sb.append("Quite a lot of CDATA <><><><>");
        } }while ((((sb.length() < maxBufferLen)&&(__CLR4_2_0gjzgjzlnxz2399.R.iget(21538)!=0|true))||(__CLR4_2_0gjzgjzlnxz2399.R.iget(21539)==0&false)));
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21540);String cdata = sb.toString();
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21541);String html = "<p><![CDATA[" + cdata + "]]></p>";

        __CLR4_2_0gjzgjzlnxz2399.R.inc(21542);Document doc = Jsoup.parse(html);
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21543);Elements els = doc.select("p");
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21544);assertEquals(1, els.size());
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21545);Element el = els.first();

        __CLR4_2_0gjzgjzlnxz2399.R.inc(21546);assertNotNull(el);
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21547);TextNode child = (TextNode) el.childNode(0);
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21548);assertEquals(cdata, el.text());
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21549);assertEquals(cdata, child.getWholeText());
    }finally{__CLR4_2_0gjzgjzlnxz2399.R.flushNeeded();}}

    @Test public void handleLargeTitle() {__CLR4_2_0gjzgjzlnxz2399.R.globalSliceStart(getClass().getName(),21550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0tdbrxwgmm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gjzgjzlnxz2399.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gjzgjzlnxz2399.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserTest.handleLargeTitle",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21550,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0tdbrxwgmm(){try{__CLR4_2_0gjzgjzlnxz2399.R.inc(21550);
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21551);StringBuilder sb = new StringBuilder(maxBufferLen);
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21552);do {{
            __CLR4_2_0gjzgjzlnxz2399.R.inc(21553);sb.append("Quite a long title");
        } }while ((((sb.length() < maxBufferLen)&&(__CLR4_2_0gjzgjzlnxz2399.R.iget(21554)!=0|true))||(__CLR4_2_0gjzgjzlnxz2399.R.iget(21555)==0&false)));
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21556);String title = sb.toString();
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21557);String html = "<title>" + title + "</title>";

        __CLR4_2_0gjzgjzlnxz2399.R.inc(21558);Document doc = Jsoup.parse(html);
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21559);Elements els = doc.select("title");
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21560);assertEquals(1, els.size());
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21561);Element el = els.first();

        __CLR4_2_0gjzgjzlnxz2399.R.inc(21562);assertNotNull(el);
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21563);TextNode child = (TextNode) el.childNode(0);
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21564);assertEquals(title, el.text());
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21565);assertEquals(title, child.getWholeText());
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21566);assertEquals(title, doc.title());
    }finally{__CLR4_2_0gjzgjzlnxz2399.R.flushNeeded();}}

    @Test public void cp1252Entities() {__CLR4_2_0gjzgjzlnxz2399.R.globalSliceStart(getClass().getName(),21567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0k7v6z7gn3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gjzgjzlnxz2399.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gjzgjzlnxz2399.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserTest.cp1252Entities",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21567,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0k7v6z7gn3(){try{__CLR4_2_0gjzgjzlnxz2399.R.inc(21567);
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21568);assertEquals("\u20ac", Jsoup.parse("&#0128;").text());
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21569);assertEquals("\u201a", Jsoup.parse("&#0130;").text());
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21570);assertEquals("\u20ac", Jsoup.parse("&#x80;").text());
    }finally{__CLR4_2_0gjzgjzlnxz2399.R.flushNeeded();}}

    @Test public void cp1252EntitiesProduceError() {__CLR4_2_0gjzgjzlnxz2399.R.globalSliceStart(getClass().getName(),21571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ga0a85gn7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gjzgjzlnxz2399.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gjzgjzlnxz2399.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserTest.cp1252EntitiesProduceError",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21571,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ga0a85gn7(){try{__CLR4_2_0gjzgjzlnxz2399.R.inc(21571);
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21572);Parser parser = new Parser(new HtmlTreeBuilder());
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21573);parser.setTrackErrors(10);
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21574);assertEquals("\u20ac", parser.parseInput("<html><body>&#0128;</body></html>", "").text());
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21575);assertEquals(1, parser.getErrors().size());
    }finally{__CLR4_2_0gjzgjzlnxz2399.R.flushNeeded();}}

    @Test public void cp1252SubstitutionTable() throws UnsupportedEncodingException {__CLR4_2_0gjzgjzlnxz2399.R.globalSliceStart(getClass().getName(),21576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_02t252lgnc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gjzgjzlnxz2399.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gjzgjzlnxz2399.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserTest.cp1252SubstitutionTable",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21576,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_02t252lgnc() throws UnsupportedEncodingException{try{__CLR4_2_0gjzgjzlnxz2399.R.inc(21576);
        __CLR4_2_0gjzgjzlnxz2399.R.inc(21577);for (int i = 0; (((i < Tokeniser.win1252Extensions.length)&&(__CLR4_2_0gjzgjzlnxz2399.R.iget(21578)!=0|true))||(__CLR4_2_0gjzgjzlnxz2399.R.iget(21579)==0&false)); i++) {{
            __CLR4_2_0gjzgjzlnxz2399.R.inc(21580);String s = new String(new byte[]{ (byte) (i + Tokeniser.win1252ExtensionsStart) }, "Windows-1252");
            __CLR4_2_0gjzgjzlnxz2399.R.inc(21581);assertEquals(1, s.length());

            // some of these characters are illegal
            __CLR4_2_0gjzgjzlnxz2399.R.inc(21582);if ((((s.charAt(0) == '\ufffd')&&(__CLR4_2_0gjzgjzlnxz2399.R.iget(21583)!=0|true))||(__CLR4_2_0gjzgjzlnxz2399.R.iget(21584)==0&false))) {{ __CLR4_2_0gjzgjzlnxz2399.R.inc(21585);continue; }

            }__CLR4_2_0gjzgjzlnxz2399.R.inc(21586);assertEquals("At: " + i, s.charAt(0), Tokeniser.win1252Extensions[i]);
        }
    }}finally{__CLR4_2_0gjzgjzlnxz2399.R.flushNeeded();}}
}
