/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.jsoup.internal.StringUtil;
import org.jsoup.integration.ParseTest;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Entities;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.safety.Whitelist;
import org.jsoup.select.Elements;
import org.junit.Ignore;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Tests for the Parser
 *
 * @author Jonathan Hedley, jonathan@hedley.net
 */
public class HtmlParserTest {static class __CLR4_2_0frxfrxlnxz238m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767707166L,8589935092L,21206,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test public void parsesSimpleDocument() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0uyhknofrx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.parsesSimpleDocument",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20445,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0uyhknofrx(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20445);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20446);String html = "<html><head><title>First!</title></head><body><p>First post! <img src=\"foo.png\" /></p></body></html>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20447);Document doc = Jsoup.parse(html);
        // need a better way to verify these:
        __CLR4_2_0frxfrxlnxz238m.R.inc(20448);Element p = doc.body().child(0);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20449);assertEquals("p", p.tagName());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20450);Element img = p.child(0);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20451);assertEquals("foo.png", img.attr("src"));
        __CLR4_2_0frxfrxlnxz238m.R.inc(20452);assertEquals("img", img.tagName());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void parsesRoughAttributes() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_019kdmffs5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.parsesRoughAttributes",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20453,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_019kdmffs5(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20453);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20454);String html = "<html><head><title>First!</title></head><body><p class=\"foo > bar\">First post! <img src=\"foo.png\" /></p></body></html>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20455);Document doc = Jsoup.parse(html);

        // need a better way to verify these:
        __CLR4_2_0frxfrxlnxz238m.R.inc(20456);Element p = doc.body().child(0);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20457);assertEquals("p", p.tagName());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20458);assertEquals("foo > bar", p.attr("class"));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void dropsDuplicateAttributes() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_01n6hxhfsb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.dropsDuplicateAttributes",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20459,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_01n6hxhfsb(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20459);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20460);String html = "<p One=One ONE=Two Two=two one=Three One=Four two=Five>Text</p>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20461);Parser parser = Parser.htmlParser().setTrackErrors(10);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20462);Document doc = parser.parseInput(html, "");

        __CLR4_2_0frxfrxlnxz238m.R.inc(20463);Element p = doc.selectFirst("p");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20464);assertEquals("<p one=\"One\" two=\"two\">Text</p>", p.outerHtml()); // normalized names due to lower casing

        __CLR4_2_0frxfrxlnxz238m.R.inc(20465);assertEquals(1, parser.getErrors().size());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20466);assertEquals("Duplicate attribute", parser.getErrors().get(0).getErrorMessage());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void retainsAttributesOfDifferentCaseIfSensitive() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0v5mywdfsj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.retainsAttributesOfDifferentCaseIfSensitive",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20467,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0v5mywdfsj(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20467);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20468);String html = "<p One=One One=Two one=Three two=Four two=Five Two=Six>Text</p>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20469);Parser parser = Parser.htmlParser().settings(ParseSettings.preserveCase);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20470);Document doc = parser.parseInput(html, "");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20471);assertEquals("<p One=\"One\" one=\"Three\" two=\"Four\" Two=\"Six\">Text</p>", doc.selectFirst("p").outerHtml());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void parsesQuiteRoughAttributes() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0z1hodbfso();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.parsesQuiteRoughAttributes",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20472,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0z1hodbfso(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20472);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20473);String html = "<p =a>One<a <p>Something</p>Else";
        // this (used to; now gets cleaner) gets a <p> with attr '=a' and an <a tag with an attribue named '<p'; and then auto-recreated
        __CLR4_2_0frxfrxlnxz238m.R.inc(20474);Document doc = Jsoup.parse(html);

        // NOTE: per spec this should be the test case. but impacts too many ppl
        // assertEquals("<p =a>One<a <p>Something</a></p>\n<a <p>Else</a>", doc.body().html());

        __CLR4_2_0frxfrxlnxz238m.R.inc(20475);assertEquals("<p =a>One<a></a></p><p><a>Something</a></p><a>Else</a>", TextUtil.stripNewlines(doc.body().html()));

        __CLR4_2_0frxfrxlnxz238m.R.inc(20476);doc = Jsoup.parse("<p .....>");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20477);assertEquals("<p .....></p>", doc.body().html());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void parsesComments() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20478);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ltfdadfsu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.parsesComments",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20478,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ltfdadfsu(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20478);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20479);String html = "<html><head></head><body><img src=foo><!-- <table><tr><td></table> --><p>Hello</p></body></html>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20480);Document doc = Jsoup.parse(html);

        __CLR4_2_0frxfrxlnxz238m.R.inc(20481);Element body = doc.body();
        __CLR4_2_0frxfrxlnxz238m.R.inc(20482);Comment comment = (Comment) body.childNode(1); // comment should not be sub of img, as it's an empty tag
        __CLR4_2_0frxfrxlnxz238m.R.inc(20483);assertEquals(" <table><tr><td></table> ", comment.getData());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20484);Element p = body.child(1);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20485);TextNode text = (TextNode) p.childNode(0);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20486);assertEquals("Hello", text.getWholeText());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void parsesUnterminatedComments() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0p8zspjft3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.parsesUnterminatedComments",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20487,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0p8zspjft3(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20487);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20488);String html = "<p>Hello<!-- <tr><td>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20489);Document doc = Jsoup.parse(html);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20490);Element p = doc.getElementsByTag("p").get(0);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20491);assertEquals("Hello", p.text());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20492);TextNode text = (TextNode) p.childNode(0);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20493);assertEquals("Hello", text.getWholeText());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20494);Comment comment = (Comment) p.childNode(1);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20495);assertEquals(" <tr><td>", comment.getData());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void dropsUnterminatedTag() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0sso77jftc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.dropsUnterminatedTag",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20496,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0sso77jftc(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20496);
        // jsoup used to parse this to <p>, but whatwg, webkit will drop.
        __CLR4_2_0frxfrxlnxz238m.R.inc(20497);String h1 = "<p";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20498);Document doc = Jsoup.parse(h1);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20499);assertEquals(0, doc.getElementsByTag("p").size());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20500);assertEquals("", doc.text());

        __CLR4_2_0frxfrxlnxz238m.R.inc(20501);String h2 = "<div id=1<p id='2'";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20502);doc = Jsoup.parse(h2);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20503);assertEquals("", doc.text());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void dropsUnterminatedAttribute() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0e8d0vxftk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.dropsUnterminatedAttribute",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20504,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0e8d0vxftk(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20504);
        // jsoup used to parse this to <p id="foo">, but whatwg, webkit will drop.
        __CLR4_2_0frxfrxlnxz238m.R.inc(20505);String h1 = "<p id=\"foo";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20506);Document doc = Jsoup.parse(h1);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20507);assertEquals("", doc.text());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void parsesUnterminatedTextarea() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0jwtj8dfto();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.parsesUnterminatedTextarea",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20508,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0jwtj8dfto(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20508);
        // don't parse right to end, but break on <p>
        __CLR4_2_0frxfrxlnxz238m.R.inc(20509);Document doc = Jsoup.parse("<body><p><textarea>one<p>two");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20510);Element t = doc.select("textarea").first();
        __CLR4_2_0frxfrxlnxz238m.R.inc(20511);assertEquals("one", t.text());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20512);assertEquals("two", doc.select("p").get(1).text());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void parsesUnterminatedOption() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_02pcf3sftt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.parsesUnterminatedOption",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20513,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_02pcf3sftt(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20513);
        // bit weird this -- browsers and spec get stuck in select until there's a </select>
        __CLR4_2_0frxfrxlnxz238m.R.inc(20514);Document doc = Jsoup.parse("<body><p><select><option>One<option>Two</p><p>Three</p>");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20515);Elements options = doc.select("option");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20516);assertEquals(2, options.size());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20517);assertEquals("One", options.first().text());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20518);assertEquals("TwoThree", options.last().text());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void testSelectWithOption() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0qvdkggftz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.testSelectWithOption",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20519,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0qvdkggftz(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20519);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20520);Parser parser = Parser.htmlParser();
        __CLR4_2_0frxfrxlnxz238m.R.inc(20521);parser.setTrackErrors(10);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20522);Document document = parser.parseInput("<select><option>Option 1</option></select>", "http://jsoup.org");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20523);assertEquals(0, parser.getErrors().size());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void testSpaceAfterTag() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0gftvzbfu4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.testSpaceAfterTag",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20524,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0gftvzbfu4(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20524);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20525);Document doc = Jsoup.parse("<div > <a name=\"top\"></a ><p id=1 >Hello</p></div>");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20526);assertEquals("<div> <a name=\"top\"></a><p id=\"1\">Hello</p></div>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void createsDocumentStructure() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20527);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0nracncfu7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.createsDocumentStructure",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20527,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0nracncfu7(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20527);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20528);String html = "<meta name=keywords /><link rel=stylesheet /><title>jsoup</title><p>Hello world</p>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20529);Document doc = Jsoup.parse(html);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20530);Element head = doc.head();
        __CLR4_2_0frxfrxlnxz238m.R.inc(20531);Element body = doc.body();

        __CLR4_2_0frxfrxlnxz238m.R.inc(20532);assertEquals(1, doc.children().size()); // root node: contains html node
        __CLR4_2_0frxfrxlnxz238m.R.inc(20533);assertEquals(2, doc.child(0).children().size()); // html node: head and body
        __CLR4_2_0frxfrxlnxz238m.R.inc(20534);assertEquals(3, head.children().size());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20535);assertEquals(1, body.children().size());

        __CLR4_2_0frxfrxlnxz238m.R.inc(20536);assertEquals("keywords", head.getElementsByTag("meta").get(0).attr("name"));
        __CLR4_2_0frxfrxlnxz238m.R.inc(20537);assertEquals(0, body.getElementsByTag("meta").size());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20538);assertEquals("jsoup", doc.title());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20539);assertEquals("Hello world", body.text());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20540);assertEquals("Hello world", body.children().get(0).text());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void createsStructureFromBodySnippet() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20541);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_04a1o0sful();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.createsStructureFromBodySnippet",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20541,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_04a1o0sful(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20541);
        // the bar baz stuff naturally goes into the body, but the 'foo' goes into root, and the normalisation routine
        // needs to move into the start of the body
        __CLR4_2_0frxfrxlnxz238m.R.inc(20542);String html = "foo <b>bar</b> baz";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20543);Document doc = Jsoup.parse(html);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20544);assertEquals("foo bar baz", doc.text());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesEscapedData() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_09q4gdzfup();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesEscapedData",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20545,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_09q4gdzfup(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20545);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20546);String html = "<div title='Surf &amp; Turf'>Reef &amp; Beef</div>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20547);Document doc = Jsoup.parse(html);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20548);Element div = doc.getElementsByTag("div").get(0);

        __CLR4_2_0frxfrxlnxz238m.R.inc(20549);assertEquals("Surf & Turf", div.attr("title"));
        __CLR4_2_0frxfrxlnxz238m.R.inc(20550);assertEquals("Reef & Beef", div.text());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesDataOnlyTags() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_078opltfuv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesDataOnlyTags",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20551,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_078opltfuv(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20551);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20552);String t = "<style>font-family: bold</style>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20553);List<Element> tels = Jsoup.parse(t).getElementsByTag("style");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20554);assertEquals("font-family: bold", tels.get(0).data());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20555);assertEquals("", tels.get(0).text());

        __CLR4_2_0frxfrxlnxz238m.R.inc(20556);String s = "<p>Hello</p><script>obj.insert('<a rel=\"none\" />');\ni++;</script><p>There</p>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20557);Document doc = Jsoup.parse(s);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20558);assertEquals("Hello There", doc.text());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20559);assertEquals("obj.insert('<a rel=\"none\" />');\ni++;", doc.data());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesTextAfterData() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0d30e17fv4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesTextAfterData",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20560,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0d30e17fv4(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20560);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20561);String h = "<html><body>pre <script>inner</script> aft</body></html>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20562);Document doc = Jsoup.parse(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20563);assertEquals("<html><head></head><body>pre <script>inner</script> aft</body></html>", TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesTextArea() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0sx0tqsfv8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesTextArea",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20564,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0sx0tqsfv8(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20564);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20565);Document doc = Jsoup.parse("<textarea>Hello</textarea>");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20566);Elements els = doc.select("textarea");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20567);assertEquals("Hello", els.text());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20568);assertEquals("Hello", els.val());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void preservesSpaceInTextArea() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0a5qnmtfvd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.preservesSpaceInTextArea",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20569,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0a5qnmtfvd(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20569);
        // preserve because the tag is marked as preserve white space
        __CLR4_2_0frxfrxlnxz238m.R.inc(20570);Document doc = Jsoup.parse("<textarea>\n\tOne\n\tTwo\n\tThree\n</textarea>");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20571);String expect = "One\n\tTwo\n\tThree"; // the leading and trailing spaces are dropped as a convenience to authors
        __CLR4_2_0frxfrxlnxz238m.R.inc(20572);Element el = doc.select("textarea").first();
        __CLR4_2_0frxfrxlnxz238m.R.inc(20573);assertEquals(expect, el.text());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20574);assertEquals(expect, el.val());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20575);assertEquals(expect, el.html());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20576);assertEquals("<textarea>\n\t" + expect + "\n</textarea>", el.outerHtml()); // but preserved in round-trip html
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void preservesSpaceInScript() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20577);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0voetmyfvl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.preservesSpaceInScript",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20577,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0voetmyfvl(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20577);
        // preserve because it's content is a data node
        __CLR4_2_0frxfrxlnxz238m.R.inc(20578);Document doc = Jsoup.parse("<script>\nOne\n\tTwo\n\tThree\n</script>");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20579);String expect = "\nOne\n\tTwo\n\tThree\n";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20580);Element el = doc.select("script").first();
        __CLR4_2_0frxfrxlnxz238m.R.inc(20581);assertEquals(expect, el.data());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20582);assertEquals("One\n\tTwo\n\tThree", el.html());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20583);assertEquals("<script>" + expect + "</script>", el.outerHtml());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void doesNotCreateImplicitLists() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_03g8sgxfvs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.doesNotCreateImplicitLists",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20584,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_03g8sgxfvs(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20584);
        // old jsoup used to wrap this in <ul>, but that's not to spec
        __CLR4_2_0frxfrxlnxz238m.R.inc(20585);String h = "<li>Point one<li>Point two";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20586);Document doc = Jsoup.parse(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20587);Elements ol = doc.select("ul"); // should NOT have created a default ul.
        __CLR4_2_0frxfrxlnxz238m.R.inc(20588);assertEquals(0, ol.size());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20589);Elements lis = doc.select("li");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20590);assertEquals(2, lis.size());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20591);assertEquals("body", lis.first().parent().tagName());

        // no fiddling with non-implicit lists
        __CLR4_2_0frxfrxlnxz238m.R.inc(20592);String h2 = "<ol><li><p>Point the first<li><p>Point the second";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20593);Document doc2 = Jsoup.parse(h2);

        __CLR4_2_0frxfrxlnxz238m.R.inc(20594);assertEquals(0, doc2.select("ul").size());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20595);assertEquals(1, doc2.select("ol").size());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20596);assertEquals(2, doc2.select("ol li").size());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20597);assertEquals(2, doc2.select("ol li p").size());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20598);assertEquals(1, doc2.select("ol li").get(0).children().size()); // one p in first li
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void discardsNakedTds() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_029adegfw7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.discardsNakedTds",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20599,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_029adegfw7(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20599);
        // jsoup used to make this into an implicit table; but browsers make it into a text run
        __CLR4_2_0frxfrxlnxz238m.R.inc(20600);String h = "<td>Hello<td><p>There<p>now";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20601);Document doc = Jsoup.parse(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20602);assertEquals("Hello<p>There</p><p>now</p>", TextUtil.stripNewlines(doc.body().html()));
        // <tbody> is introduced if no implicitly creating table, but allows tr to be directly under table
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesNestedImplicitTable() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0l4b3cifwb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesNestedImplicitTable",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20603,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0l4b3cifwb(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20603);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20604);Document doc = Jsoup.parse("<table><td>1</td></tr> <td>2</td></tr> <td> <table><td>3</td> <td>4</td></table> <tr><td>5</table>");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20605);assertEquals("<table><tbody><tr><td>1</td></tr> <tr><td>2</td></tr> <tr><td> <table><tbody><tr><td>3</td> <td>4</td></tr></tbody></table> </td></tr><tr><td>5</td></tr></tbody></table>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesWhatWgExpensesTableExample() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20606);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0bnvzb7fwe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesWhatWgExpensesTableExample",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20606,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0bnvzb7fwe(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20606);
        // http://www.whatwg.org/specs/web-apps/current-work/multipage/tabular-data.html#examples-0
        __CLR4_2_0frxfrxlnxz238m.R.inc(20607);Document doc = Jsoup.parse("<table> <colgroup> <col> <colgroup> <col> <col> <col> <thead> <tr> <th> <th>2008 <th>2007 <th>2006 <tbody> <tr> <th scope=rowgroup> Research and development <td> $ 1,109 <td> $ 782 <td> $ 712 <tr> <th scope=row> Percentage of net sales <td> 3.4% <td> 3.3% <td> 3.7% <tbody> <tr> <th scope=rowgroup> Selling, general, and administrative <td> $ 3,761 <td> $ 2,963 <td> $ 2,433 <tr> <th scope=row> Percentage of net sales <td> 11.6% <td> 12.3% <td> 12.6% </table>");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20608);assertEquals("<table> <colgroup> <col> </colgroup><colgroup> <col> <col> <col> </colgroup><thead> <tr> <th> </th><th>2008 </th><th>2007 </th><th>2006 </th></tr></thead><tbody> <tr> <th scope=\"rowgroup\"> Research and development </th><td> $ 1,109 </td><td> $ 782 </td><td> $ 712 </td></tr><tr> <th scope=\"row\"> Percentage of net sales </th><td> 3.4% </td><td> 3.3% </td><td> 3.7% </td></tr></tbody><tbody> <tr> <th scope=\"rowgroup\"> Selling, general, and administrative </th><td> $ 3,761 </td><td> $ 2,963 </td><td> $ 2,433 </td></tr><tr> <th scope=\"row\"> Percentage of net sales </th><td> 11.6% </td><td> 12.3% </td><td> 12.6% </td></tr></tbody></table>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesTbodyTable() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0rv9yi2fwh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesTbodyTable",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20609,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0rv9yi2fwh(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20609);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20610);Document doc = Jsoup.parse("<html><head></head><body><table><tbody><tr><td>aaa</td><td>bbb</td></tr></tbody></table></body></html>");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20611);assertEquals("<table><tbody><tr><td>aaa</td><td>bbb</td></tr></tbody></table>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesImplicitCaptionClose() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0rbojzdfwk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesImplicitCaptionClose",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20612,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0rbojzdfwk(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20612);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20613);Document doc = Jsoup.parse("<table><caption>A caption<td>One<td>Two");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20614);assertEquals("<table><caption>A caption</caption><tbody><tr><td>One</td><td>Two</td></tr></tbody></table>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void noTableDirectInTable() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0lyp5mfwn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.noTableDirectInTable",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20615,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0lyp5mfwn(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20615);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20616);Document doc = Jsoup.parse("<table> <td>One <td><table><td>Two</table> <table><td>Three");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20617);assertEquals("<table> <tbody><tr><td>One </td><td><table><tbody><tr><td>Two</td></tr></tbody></table> <table><tbody><tr><td>Three</td></tr></tbody></table></td></tr></tbody></table>",
            TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void ignoresDupeEndTrTag() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20618);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ilhz67fwq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.ignoresDupeEndTrTag",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20618,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ilhz67fwq(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20618);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20619);Document doc = Jsoup.parse("<table><tr><td>One</td><td><table><tr><td>Two</td></tr></tr></table></td><td>Three</td></tr></table>"); // two </tr></tr>, must ignore or will close table
        __CLR4_2_0frxfrxlnxz238m.R.inc(20620);assertEquals("<table><tbody><tr><td>One</td><td><table><tbody><tr><td>Two</td></tr></tbody></table></td><td>Three</td></tr></tbody></table>",
            TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesBaseTags() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0hlc9ssfwt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesBaseTags",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20621,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0hlc9ssfwt(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20621);
        // only listen to the first base href
        __CLR4_2_0frxfrxlnxz238m.R.inc(20622);String h = "<a href=1>#</a><base href='/2/'><a href='3'>#</a><base href='http://bar'><a href=/4>#</a>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20623);Document doc = Jsoup.parse(h, "http://foo/");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20624);assertEquals("http://foo/2/", doc.baseUri()); // gets set once, so doc and descendants have first only

        __CLR4_2_0frxfrxlnxz238m.R.inc(20625);Elements anchors = doc.getElementsByTag("a");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20626);assertEquals(3, anchors.size());

        __CLR4_2_0frxfrxlnxz238m.R.inc(20627);assertEquals("http://foo/2/", anchors.get(0).baseUri());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20628);assertEquals("http://foo/2/", anchors.get(1).baseUri());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20629);assertEquals("http://foo/2/", anchors.get(2).baseUri());

        __CLR4_2_0frxfrxlnxz238m.R.inc(20630);assertEquals("http://foo/2/1", anchors.get(0).absUrl("href"));
        __CLR4_2_0frxfrxlnxz238m.R.inc(20631);assertEquals("http://foo/2/3", anchors.get(1).absUrl("href"));
        __CLR4_2_0frxfrxlnxz238m.R.inc(20632);assertEquals("http://foo/4", anchors.get(2).absUrl("href"));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesProtocolRelativeUrl() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0g2ybt3fx5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesProtocolRelativeUrl",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20633,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0g2ybt3fx5(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20633);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20634);String base = "https://example.com/";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20635);String html = "<img src='//example.net/img.jpg'>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20636);Document doc = Jsoup.parse(html, base);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20637);Element el = doc.select("img").first();
        __CLR4_2_0frxfrxlnxz238m.R.inc(20638);assertEquals("https://example.net/img.jpg", el.absUrl("src"));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesCdata() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0x9stmffxb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesCdata",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20639,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0x9stmffxb(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20639);
        // todo: as this is html namespace, should actually treat as bogus comment, not cdata. keep as cdata for now
        __CLR4_2_0frxfrxlnxz238m.R.inc(20640);String h = "<div id=1><![CDATA[<html>\n <foo><&amp;]]></div>"; // the &amp; in there should remain literal
        __CLR4_2_0frxfrxlnxz238m.R.inc(20641);Document doc = Jsoup.parse(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20642);Element div = doc.getElementById("1");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20643);assertEquals("<html>\n <foo><&amp;", div.text());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20644);assertEquals(0, div.children().size());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20645);assertEquals(1, div.childNodeSize()); // no elements, one text node
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void roundTripsCdata() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20646);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_02v8ahgfxi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.roundTripsCdata",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20646,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_02v8ahgfxi(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20646);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20647);String h = "<div id=1><![CDATA[\n<html>\n <foo><&amp;]]></div>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20648);Document doc = Jsoup.parse(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20649);Element div = doc.getElementById("1");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20650);assertEquals("<html>\n <foo><&amp;", div.text());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20651);assertEquals(0, div.children().size());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20652);assertEquals(1, div.childNodeSize()); // no elements, one text node

        __CLR4_2_0frxfrxlnxz238m.R.inc(20653);assertEquals("<div id=\"1\"><![CDATA[\n<html>\n <foo><&amp;]]>\n</div>", div.outerHtml());

        __CLR4_2_0frxfrxlnxz238m.R.inc(20654);CDataNode cdata = (CDataNode) div.textNodes().get(0);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20655);assertEquals("\n<html>\n <foo><&amp;", cdata.text());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesCdataAcrossBuffer() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ogvq54fxs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesCdataAcrossBuffer",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20656,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ogvq54fxs(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20656);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20657);StringBuilder sb = new StringBuilder();
        __CLR4_2_0frxfrxlnxz238m.R.inc(20658);while ((((sb.length() <= CharacterReader.maxBufferLen)&&(__CLR4_2_0frxfrxlnxz238m.R.iget(20659)!=0|true))||(__CLR4_2_0frxfrxlnxz238m.R.iget(20660)==0&false))) {{
            __CLR4_2_0frxfrxlnxz238m.R.inc(20661);sb.append("A suitable amount of CData.\n");
        }
        }__CLR4_2_0frxfrxlnxz238m.R.inc(20662);String cdata = sb.toString();
        __CLR4_2_0frxfrxlnxz238m.R.inc(20663);String h = "<div><![CDATA[" + cdata + "]]></div>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20664);Document doc = Jsoup.parse(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20665);Element div = doc.selectFirst("div");

        __CLR4_2_0frxfrxlnxz238m.R.inc(20666);CDataNode node = (CDataNode) div.textNodes().get(0);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20667);assertEquals(cdata, node.text());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesCdataInScript() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20668);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_07z2vspfy4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesCdataInScript",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20668,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_07z2vspfy4(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20668);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20669);String html = "<script type=\"text/javascript\">//<![CDATA[\n\n  foo();\n//]]></script>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20670);Document doc = Jsoup.parse(html);

        __CLR4_2_0frxfrxlnxz238m.R.inc(20671);String data = "//<![CDATA[\n\n  foo();\n//]]>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20672);Element script = doc.selectFirst("script");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20673);assertEquals("", script.text()); // won't be parsed as cdata because in script data section
        __CLR4_2_0frxfrxlnxz238m.R.inc(20674);assertEquals(data, script.data());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20675);assertEquals(html, script.outerHtml());

        __CLR4_2_0frxfrxlnxz238m.R.inc(20676);DataNode dataNode = (DataNode) script.childNode(0);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20677);assertEquals(data, dataNode.getWholeData());
        // see - not a cdata node, because in script. contrast with XmlTreeBuilder - will be cdata.
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesUnclosedCdataAtEOF() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0guy5sjfye();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesUnclosedCdataAtEOF",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20678,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0guy5sjfye(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20678);
        // https://github.com/jhy/jsoup/issues/349 would crash, as character reader would try to seek past EOF
        __CLR4_2_0frxfrxlnxz238m.R.inc(20679);String h = "<![CDATA[]]";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20680);Document doc = Jsoup.parse(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20681);assertEquals(1, doc.body().childNodeSize());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handleCDataInText() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ap5o2mfyi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handleCDataInText",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20682,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ap5o2mfyi(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20682);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20683);String h = "<p>One <![CDATA[Two <&]]> Three</p>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20684);Document doc = Jsoup.parse(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20685);Element p = doc.selectFirst("p");

        __CLR4_2_0frxfrxlnxz238m.R.inc(20686);List<Node> nodes = p.childNodes();
        __CLR4_2_0frxfrxlnxz238m.R.inc(20687);assertEquals("One ", ((TextNode) nodes.get(0)).getWholeText());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20688);assertEquals("Two <&", ((TextNode) nodes.get(1)).getWholeText());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20689);assertEquals("Two <&", ((CDataNode) nodes.get(1)).getWholeText());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20690);assertEquals(" Three", ((TextNode) nodes.get(2)).getWholeText());

        __CLR4_2_0frxfrxlnxz238m.R.inc(20691);assertEquals(h, p.outerHtml());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void cdataNodesAreTextNodes() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20692);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0o67r8bfys();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.cdataNodesAreTextNodes",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20692,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0o67r8bfys(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20692);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20693);String h = "<p>One <![CDATA[ Two <& ]]> Three</p>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20694);Document doc = Jsoup.parse(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20695);Element p = doc.selectFirst("p");

        __CLR4_2_0frxfrxlnxz238m.R.inc(20696);List<TextNode> nodes = p.textNodes();
        __CLR4_2_0frxfrxlnxz238m.R.inc(20697);assertEquals("One ", nodes.get(0).text());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20698);assertEquals(" Two <& ", nodes.get(1).text());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20699);assertEquals(" Three", nodes.get(2).text());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesInvalidStartTags() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20700);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0iv0zbefz0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesInvalidStartTags",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20700,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0iv0zbefz0(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20700);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20701);String h = "<div>Hello < There <&amp;></div>"; // parse to <div {#text=Hello < There <&>}>
        __CLR4_2_0frxfrxlnxz238m.R.inc(20702);Document doc = Jsoup.parse(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20703);assertEquals("Hello < There <&>", doc.select("div").first().text());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesUnknownTags() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0r41u2nfz4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesUnknownTags",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20704,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0r41u2nfz4(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20704);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20705);String h = "<div><foo title=bar>Hello<foo title=qux>there</foo></div>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20706);Document doc = Jsoup.parse(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20707);Elements foos = doc.select("foo");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20708);assertEquals(2, foos.size());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20709);assertEquals("bar", foos.first().attr("title"));
        __CLR4_2_0frxfrxlnxz238m.R.inc(20710);assertEquals("qux", foos.last().attr("title"));
        __CLR4_2_0frxfrxlnxz238m.R.inc(20711);assertEquals("there", foos.last().text());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesUnknownInlineTags() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0yqblugfzc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesUnknownInlineTags",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20712,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0yqblugfzc(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20712);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20713);String h = "<p><cust>Test</cust></p><p><cust><cust>Test</cust></cust></p>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20714);Document doc = Jsoup.parseBodyFragment(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20715);String out = doc.body().html();
        __CLR4_2_0frxfrxlnxz238m.R.inc(20716);assertEquals(h, TextUtil.stripNewlines(out));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void parsesBodyFragment() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_01jbm8pfzh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.parsesBodyFragment",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20717,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_01jbm8pfzh(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20717);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20718);String h = "<!-- comment --><p><a href='foo'>One</a></p>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20719);Document doc = Jsoup.parseBodyFragment(h, "http://example.com");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20720);assertEquals("<body><!-- comment --><p><a href=\"foo\">One</a></p></body>", TextUtil.stripNewlines(doc.body().outerHtml()));
        __CLR4_2_0frxfrxlnxz238m.R.inc(20721);assertEquals("http://example.com/foo", doc.select("a").first().absUrl("href"));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesUnknownNamespaceTags() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0s58jgfzm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesUnknownNamespaceTags",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20722,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0s58jgfzm(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20722);
        // note that the first foo:bar should not really be allowed to be self closing, if parsed in html mode.
        __CLR4_2_0frxfrxlnxz238m.R.inc(20723);String h = "<foo:bar id='1' /><abc:def id=2>Foo<p>Hello</p></abc:def><foo:bar>There</foo:bar>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20724);Document doc = Jsoup.parse(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20725);assertEquals("<foo:bar id=\"1\" /><abc:def id=\"2\">Foo<p>Hello</p></abc:def><foo:bar>There</foo:bar>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesKnownEmptyBlocks() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0punk1ufzq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesKnownEmptyBlocks",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20726,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0punk1ufzq(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20726);
        // if a known tag, allow self closing outside of spec, but force an end tag. unknown tags can be self closing.
        __CLR4_2_0frxfrxlnxz238m.R.inc(20727);String h = "<div id='1' /><script src='/foo' /><div id=2><img /><img></div><a id=3 /><i /><foo /><foo>One</foo> <hr /> hr text <hr> hr text two";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20728);Document doc = Jsoup.parse(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20729);assertEquals("<div id=\"1\"></div><script src=\"/foo\"></script><div id=\"2\"><img><img></div><a id=\"3\"></a><i></i><foo /><foo>One</foo> <hr> hr text <hr> hr text two", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesKnownEmptyNoFrames() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0uehs65fzu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesKnownEmptyNoFrames",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20730,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0uehs65fzu(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20730);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20731);String h = "<html><head><noframes /><meta name=foo></head><body>One</body></html>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20732);Document doc = Jsoup.parse(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20733);assertEquals("<html><head><noframes></noframes><meta name=\"foo\"></head><body>One</body></html>", TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesKnownEmptyStyle() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0nojzstfzy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesKnownEmptyStyle",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20734,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0nojzstfzy(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20734);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20735);String h = "<html><head><style /><meta name=foo></head><body>One</body></html>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20736);Document doc = Jsoup.parse(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20737);assertEquals("<html><head><style></style><meta name=\"foo\"></head><body>One</body></html>", TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesKnownEmptyTitle() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0d0aaq2g02();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesKnownEmptyTitle",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20738,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0d0aaq2g02(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20738);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20739);String h = "<html><head><title /><meta name=foo></head><body>One</body></html>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20740);Document doc = Jsoup.parse(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20741);assertEquals("<html><head><title></title><meta name=\"foo\"></head><body>One</body></html>", TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesKnownEmptyIframe() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0o0igrkg06();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesKnownEmptyIframe",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20742,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0o0igrkg06(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20742);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20743);String h = "<p>One</p><iframe id=1 /><p>Two";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20744);Document doc = Jsoup.parse(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20745);assertEquals("<html><head></head><body><p>One</p><iframe id=\"1\"></iframe><p>Two</p></body></html>", TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesSolidusAtAttributeEnd() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0dwwahjg0a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesSolidusAtAttributeEnd",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20746,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0dwwahjg0a(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20746);
        // this test makes sure [<a href=/>link</a>] is parsed as [<a href="/">link</a>], not [<a href="" /><a>link</a>]
        __CLR4_2_0frxfrxlnxz238m.R.inc(20747);String h = "<a href=/>link</a>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20748);Document doc = Jsoup.parse(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20749);assertEquals("<a href=\"/\">link</a>", doc.body().html());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesMultiClosingBody() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0dv7er4g0e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesMultiClosingBody",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20750,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0dv7er4g0e(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20750);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20751);String h = "<body><p>Hello</body><p>there</p></body></body></html><p>now";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20752);Document doc = Jsoup.parse(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20753);assertEquals(3, doc.select("p").size());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20754);assertEquals(3, doc.body().children().size());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesUnclosedDefinitionLists() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0q51ph5g0j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesUnclosedDefinitionLists",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20755,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0q51ph5g0j(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20755);
        // jsoup used to create a <dl>, but that's not to spec
        __CLR4_2_0frxfrxlnxz238m.R.inc(20756);String h = "<dt>Foo<dd>Bar<dt>Qux<dd>Zug";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20757);Document doc = Jsoup.parse(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20758);assertEquals(0, doc.select("dl").size()); // no auto dl
        __CLR4_2_0frxfrxlnxz238m.R.inc(20759);assertEquals(4, doc.select("dt, dd").size());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20760);Elements dts = doc.select("dt");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20761);assertEquals(2, dts.size());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20762);assertEquals("Zug", dts.get(1).nextElementSibling().text());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesBlocksInDefinitions() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0q69afjg0r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesBlocksInDefinitions",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20763,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0q69afjg0r(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20763);
        // per the spec, dt and dd are inline, but in practise are block
        __CLR4_2_0frxfrxlnxz238m.R.inc(20764);String h = "<dl><dt><div id=1>Term</div></dt><dd><div id=2>Def</div></dd></dl>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20765);Document doc = Jsoup.parse(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20766);assertEquals("dt", doc.select("#1").first().parent().tagName());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20767);assertEquals("dd", doc.select("#2").first().parent().tagName());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20768);assertEquals("<dl><dt><div id=\"1\">Term</div></dt><dd><div id=\"2\">Def</div></dd></dl>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesFrames() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0x2ui2wg0x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesFrames",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20769,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0x2ui2wg0x(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20769);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20770);String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20771);Document doc = Jsoup.parse(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20772);assertEquals("<html><head><script></script><noscript></noscript></head><frameset><frame src=\"foo\"><frame src=\"foo\"></frameset></html>",
            TextUtil.stripNewlines(doc.html()));
        // no body auto vivification
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void ignoresContentAfterFrameset() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0c90n0gg11();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.ignoresContentAfterFrameset",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20773,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0c90n0gg11(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20773);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20774);String h = "<html><head><title>One</title></head><frameset><frame /><frame /></frameset><table></table></html>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20775);Document doc = Jsoup.parse(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20776);assertEquals("<html><head><title>One</title></head><frameset><frame><frame></frameset></html>", TextUtil.stripNewlines(doc.html()));
        // no body, no table. No crash!
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesJavadocFont() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0gfrmkhg15();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesJavadocFont",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20777,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0gfrmkhg15(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20777);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20778);String h = "<TD BGCOLOR=\"#EEEEFF\" CLASS=\"NavBarCell1\">    <A HREF=\"deprecated-list.html\"><FONT CLASS=\"NavBarFont1\"><B>Deprecated</B></FONT></A>&nbsp;</TD>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20779);Document doc = Jsoup.parse(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20780);Element a = doc.select("a").first();
        __CLR4_2_0frxfrxlnxz238m.R.inc(20781);assertEquals("Deprecated", a.text());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20782);assertEquals("font", a.child(0).tagName());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20783);assertEquals("b", a.child(0).child(0).tagName());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesBaseWithoutHref() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_093t7hag1c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesBaseWithoutHref",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20784,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_093t7hag1c(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20784);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20785);String h = "<head><base target='_blank'></head><body><a href=/foo>Test</a></body>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20786);Document doc = Jsoup.parse(h, "http://example.com/");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20787);Element a = doc.select("a").first();
        __CLR4_2_0frxfrxlnxz238m.R.inc(20788);assertEquals("/foo", a.attr("href"));
        __CLR4_2_0frxfrxlnxz238m.R.inc(20789);assertEquals("http://example.com/foo", a.attr("abs:href"));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void normalisesDocument() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20790);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0sm4mbjg1i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.normalisesDocument",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20790,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0sm4mbjg1i(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20790);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20791);String h = "<!doctype html>One<html>Two<head>Three<link></head>Four<body>Five </body>Six </html>Seven ";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20792);Document doc = Jsoup.parse(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20793);assertEquals("<!doctype html><html><head></head><body>OneTwoThree<link>FourFive Six Seven </body></html>",
            TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void normalisesEmptyDocument() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_09sw79sg1m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.normalisesEmptyDocument",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20794,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_09sw79sg1m(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20794);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20795);Document doc = Jsoup.parse("");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20796);assertEquals("<html><head></head><body></body></html>", TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void normalisesHeadlessBody() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20797);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0t2yz35g1p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.normalisesHeadlessBody",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20797,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0t2yz35g1p(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20797);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20798);Document doc = Jsoup.parse("<html><body><span class=\"foo\">bar</span>");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20799);assertEquals("<html><head></head><body><span class=\"foo\">bar</span></body></html>",
            TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void normalisedBodyAfterContent() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_06u7h1mg1s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.normalisedBodyAfterContent",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20800,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_06u7h1mg1s(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20800);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20801);Document doc = Jsoup.parse("<font face=Arial><body class=name><div>One</div></body></font>");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20802);assertEquals("<html><head></head><body class=\"name\"><font face=\"Arial\"><div>One</div></font></body></html>",
            TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void findsCharsetInMalformedMeta() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0hga8eog1v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.findsCharsetInMalformedMeta",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20803,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0hga8eog1v(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20803);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20804);String h = "<meta http-equiv=Content-Type content=text/html; charset=gb2312>";
        // example cited for reason of html5's <meta charset> element
        __CLR4_2_0frxfrxlnxz238m.R.inc(20805);Document doc = Jsoup.parse(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20806);assertEquals("gb2312", doc.select("meta").attr("charset"));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void testHgroup() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0qqpi7kg1z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.testHgroup",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20807,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0qqpi7kg1z(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20807);
        // jsoup used to not allow hroup in h{n}, but that's not in spec, and browsers are OK
        __CLR4_2_0frxfrxlnxz238m.R.inc(20808);Document doc = Jsoup.parse("<h1>Hello <h2>There <hgroup><h1>Another<h2>headline</hgroup> <hgroup><h1>More</h1><p>stuff</p></hgroup>");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20809);assertEquals("<h1>Hello </h1><h2>There <hgroup><h1>Another</h1><h2>headline</h2></hgroup> <hgroup><h1>More</h1><p>stuff</p></hgroup></h2>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void testRelaxedTags() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0xulrwjg22();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.testRelaxedTags",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20810,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0xulrwjg22(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20810);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20811);Document doc = Jsoup.parse("<abc_def id=1>Hello</abc_def> <abc-def>There</abc-def>");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20812);assertEquals("<abc_def id=\"1\">Hello</abc_def> <abc-def>There</abc-def>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void testHeaderContents() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0v8c3c0g25();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.testHeaderContents",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20813,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0v8c3c0g25(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20813);
        // h* tags (h1 .. h9) in browsers can handle any internal content other than other h*. which is not per any
        // spec, which defines them as containing phrasing content only. so, reality over theory.
        __CLR4_2_0frxfrxlnxz238m.R.inc(20814);Document doc = Jsoup.parse("<h1>Hello <div>There</div> now</h1> <h2>More <h3>Content</h3></h2>");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20815);assertEquals("<h1>Hello <div>There</div> now</h1> <h2>More </h2><h3>Content</h3>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void testSpanContents() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20816);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0k2vt8dg28();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.testSpanContents",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20816,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0k2vt8dg28(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20816);
        // like h1 tags, the spec says SPAN is phrasing only, but browsers and publisher treat span as a block tag
        __CLR4_2_0frxfrxlnxz238m.R.inc(20817);Document doc = Jsoup.parse("<span>Hello <div>there</div> <span>now</span></span>");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20818);assertEquals("<span>Hello <div>there</div> <span>now</span></span>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void testNoImagesInNoScriptInHead() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_01vh4jcg2b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.testNoImagesInNoScriptInHead",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20819,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_01vh4jcg2b(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20819);
        // jsoup used to allow, but against spec if parsing with noscript
        __CLR4_2_0frxfrxlnxz238m.R.inc(20820);Document doc = Jsoup.parse("<html><head><noscript><img src='foo'></noscript></head><body><p>Hello</p></body></html>");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20821);assertEquals("<html><head><noscript>&lt;img src=\"foo\"&gt;</noscript></head><body><p>Hello</p></body></html>", TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void testAFlowContents() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_01dbae6g2e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.testAFlowContents",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20822,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_01dbae6g2e(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20822);
        // html5 has <a> as either phrasing or block
        __CLR4_2_0frxfrxlnxz238m.R.inc(20823);Document doc = Jsoup.parse("<a>Hello <div>there</div> <span>now</span></a>");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20824);assertEquals("<a>Hello <div>there</div> <span>now</span></a>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void testFontFlowContents() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ub80tsg2h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.testFontFlowContents",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20825,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ub80tsg2h(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20825);
        // html5 has no definition of <font>; often used as flow
        __CLR4_2_0frxfrxlnxz238m.R.inc(20826);Document doc = Jsoup.parse("<font>Hello <div>there</div> <span>now</span></font>");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20827);assertEquals("<font>Hello <div>there</div> <span>now</span></font>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesMisnestedTagsBI() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20828);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_04ccjkmg2k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesMisnestedTagsBI",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20828,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_04ccjkmg2k(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20828);
        // whatwg: <b><i></b></i>
        __CLR4_2_0frxfrxlnxz238m.R.inc(20829);String h = "<p>1<b>2<i>3</b>4</i>5</p>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20830);Document doc = Jsoup.parse(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20831);assertEquals("<p>1<b>2<i>3</i></b><i>4</i>5</p>", doc.body().html());
        // adoption agency on </b>, reconstruction of formatters on 4.
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesMisnestedTagsBP() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ien7ypg2o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesMisnestedTagsBP",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20832,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ien7ypg2o(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20832);
        //  whatwg: <b><p></b></p>
        __CLR4_2_0frxfrxlnxz238m.R.inc(20833);String h = "<b>1<p>2</b>3</p>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20834);Document doc = Jsoup.parse(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20835);assertEquals("<b>1</b>\n<p><b>2</b>3</p>", doc.body().html());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    /*@Ignore // todo: test case for https://github.com/jhy/jsoup/issues/845. Doesn't work yet.
    @Test public void handlesMisnestedAInDivs() {
        String h = "<a href='#1'><div><div><a href='#2'>child</a</div</div></a>";
        String w = "<a href=\"#1\"></a><div><a href=\"#1\"></a><div><a href=\"#1\"></a><a href=\"#2\">child</a></div></div>";
        Document doc = Jsoup.parse(h);
        assertEquals(
            StringUtil.normaliseWhitespace(w),
            StringUtil.normaliseWhitespace(doc.body().html()));
    }*/

    @Test public void handlesUnexpectedMarkupInTables() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0fa9gkrg2s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesUnexpectedMarkupInTables",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20836,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0fa9gkrg2s(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20836);
        // whatwg - tests markers in active formatting (if they didn't work, would get in in table)
        // also tests foster parenting
        __CLR4_2_0frxfrxlnxz238m.R.inc(20837);String h = "<table><b><tr><td>aaa</td></tr>bbb</table>ccc";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20838);Document doc = Jsoup.parse(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20839);assertEquals("<b></b><b>bbb</b><table><tbody><tr><td>aaa</td></tr></tbody></table><b>ccc</b>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesUnclosedFormattingElements() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0q8tn1pg2w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesUnclosedFormattingElements",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20840,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0q8tn1pg2w(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20840);
        // whatwg: formatting elements get collected and applied, but excess elements are thrown away
        __CLR4_2_0frxfrxlnxz238m.R.inc(20841);String h = "<!DOCTYPE html>\n" +
            "<p><b class=x><b class=x><b><b class=x><b class=x><b>X\n" +
            "<p>X\n" +
            "<p><b><b class=x><b>X\n" +
            "<p></b></b></b></b></b></b>X";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20842);Document doc = Jsoup.parse(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20843);doc.outputSettings().indentAmount(0);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20844);String want = "<!doctype html>\n" +
            "<html>\n" +
            "<head></head>\n" +
            "<body>\n" +
            "<p><b class=\"x\"><b class=\"x\"><b><b class=\"x\"><b class=\"x\"><b>X </b></b></b></b></b></b></p>\n" +
            "<p><b class=\"x\"><b><b class=\"x\"><b class=\"x\"><b>X </b></b></b></b></b></p>\n" +
            "<p><b class=\"x\"><b><b class=\"x\"><b class=\"x\"><b><b><b class=\"x\"><b>X </b></b></b></b></b></b></b></b></p>\n" +
            "<p>X</p>\n" +
            "</body>\n" +
            "</html>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20845);assertEquals(want, doc.html());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesUnclosedAnchors() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_03c6r6dg32();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesUnclosedAnchors",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20846,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_03c6r6dg32(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20846);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20847);String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20848);Document doc = Jsoup.parse(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20849);String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20850);assertEquals(want, doc.body().html());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void reconstructFormattingElements() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20851);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0lwm9yfg37();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.reconstructFormattingElements",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20851,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0lwm9yfg37(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20851);
        // tests attributes and multi b
        __CLR4_2_0frxfrxlnxz238m.R.inc(20852);String h = "<p><b class=one>One <i>Two <b>Three</p><p>Hello</p>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20853);Document doc = Jsoup.parse(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20854);assertEquals("<p><b class=\"one\">One <i>Two <b>Three</b></i></b></p>\n<p><b class=\"one\"><i><b>Hello</b></i></b></p>", doc.body().html());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void reconstructFormattingElementsInTable() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0oy2ihcg3b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.reconstructFormattingElementsInTable",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20855,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0oy2ihcg3b(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20855);
        // tests that tables get formatting markers -- the <b> applies outside the table and does not leak in,
        // and the <i> inside the table and does not leak out.
        __CLR4_2_0frxfrxlnxz238m.R.inc(20856);String h = "<p><b>One</p> <table><tr><td><p><i>Three<p>Four</i></td></tr></table> <p>Five</p>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20857);Document doc = Jsoup.parse(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20858);String want = "<p><b>One</b></p>\n" +
            "<b> \n" +
            " <table>\n" +
            "  <tbody>\n" +
            "   <tr>\n" +
            "    <td><p><i>Three</i></p><p><i>Four</i></p></td>\n" +
            "   </tr>\n" +
            "  </tbody>\n" +
            " </table> <p>Five</p></b>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20859);assertEquals(want, doc.body().html());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void commentBeforeHtml() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20860);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0azkxwwg3g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.commentBeforeHtml",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20860,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0azkxwwg3g(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20860);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20861);String h = "<!-- comment --><!-- comment 2 --><p>One</p>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20862);Document doc = Jsoup.parse(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20863);assertEquals("<!-- comment --><!-- comment 2 --><html><head></head><body><p>One</p></body></html>", TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void emptyTdTag() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_099jct8g3k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.emptyTdTag",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20864,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_099jct8g3k(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20864);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20865);String h = "<table><tr><td>One</td><td id='2' /></tr></table>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20866);Document doc = Jsoup.parse(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20867);assertEquals("<td>One</td>\n<td id=\"2\"></td>", doc.select("tr").first().html());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesSolidusInA() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0cqqlr9g3o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesSolidusInA",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20868,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0cqqlr9g3o(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20868);
        // test for bug #66
        __CLR4_2_0frxfrxlnxz238m.R.inc(20869);String h = "<a class=lp href=/lib/14160711/>link text</a>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20870);Document doc = Jsoup.parse(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20871);Element a = doc.select("a").first();
        __CLR4_2_0frxfrxlnxz238m.R.inc(20872);assertEquals("link text", a.text());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20873);assertEquals("/lib/14160711/", a.attr("href"));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesSpanInTbody() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0se0fr7g3u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesSpanInTbody",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20874,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0se0fr7g3u(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20874);
        // test for bug 64
        __CLR4_2_0frxfrxlnxz238m.R.inc(20875);String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20876);Document doc = Jsoup.parse(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20877);assertEquals(doc.select("span").first().children().size(), 0); // the span gets closed
        __CLR4_2_0frxfrxlnxz238m.R.inc(20878);assertEquals(doc.select("table").size(), 1); // only one table
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesUnclosedTitleAtEof() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0hutm4og3z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesUnclosedTitleAtEof",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20879,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0hutm4og3z(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20879);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20880);assertEquals("Data", Jsoup.parse("<title>Data").title());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20881);assertEquals("Data<", Jsoup.parse("<title>Data<").title());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20882);assertEquals("Data</", Jsoup.parse("<title>Data</").title());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20883);assertEquals("Data</t", Jsoup.parse("<title>Data</t").title());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20884);assertEquals("Data</ti", Jsoup.parse("<title>Data</ti").title());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20885);assertEquals("Data", Jsoup.parse("<title>Data</title>").title());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20886);assertEquals("Data", Jsoup.parse("<title>Data</title >").title());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesUnclosedTitle() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20887);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0m7b775g47();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesUnclosedTitle",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20887,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0m7b775g47(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20887);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20888);Document one = Jsoup.parse("<title>One <b>Two <b>Three</TITLE><p>Test</p>"); // has title, so <b> is plain text
        __CLR4_2_0frxfrxlnxz238m.R.inc(20889);assertEquals("One <b>Two <b>Three", one.title());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20890);assertEquals("Test", one.select("p").first().text());

        __CLR4_2_0frxfrxlnxz238m.R.inc(20891);Document two = Jsoup.parse("<title>One<b>Two <p>Test</p>"); // no title, so <b> causes </title> breakout
        __CLR4_2_0frxfrxlnxz238m.R.inc(20892);assertEquals("One", two.title());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20893);assertEquals("<b>Two <p>Test</p></b>", two.body().html());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesUnclosedScriptAtEof() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0qtsjnvg4e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesUnclosedScriptAtEof",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20894,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0qtsjnvg4e(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20894);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20895);assertEquals("Data", Jsoup.parse("<script>Data").select("script").first().data());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20896);assertEquals("Data<", Jsoup.parse("<script>Data<").select("script").first().data());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20897);assertEquals("Data</sc", Jsoup.parse("<script>Data</sc").select("script").first().data());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20898);assertEquals("Data</-sc", Jsoup.parse("<script>Data</-sc").select("script").first().data());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20899);assertEquals("Data</sc-", Jsoup.parse("<script>Data</sc-").select("script").first().data());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20900);assertEquals("Data</sc--", Jsoup.parse("<script>Data</sc--").select("script").first().data());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20901);assertEquals("Data", Jsoup.parse("<script>Data</script>").select("script").first().data());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20902);assertEquals("Data</script", Jsoup.parse("<script>Data</script").select("script").first().data());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20903);assertEquals("Data", Jsoup.parse("<script>Data</script ").select("script").first().data());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20904);assertEquals("Data", Jsoup.parse("<script>Data</script n").select("script").first().data());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20905);assertEquals("Data", Jsoup.parse("<script>Data</script n=").select("script").first().data());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20906);assertEquals("Data", Jsoup.parse("<script>Data</script n=\"").select("script").first().data());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20907);assertEquals("Data", Jsoup.parse("<script>Data</script n=\"p").select("script").first().data());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesUnclosedRawtextAtEof() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_03y51itg4s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesUnclosedRawtextAtEof",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20908,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_03y51itg4s(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20908);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20909);assertEquals("Data", Jsoup.parse("<style>Data").select("style").first().data());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20910);assertEquals("Data</st", Jsoup.parse("<style>Data</st").select("style").first().data());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20911);assertEquals("Data", Jsoup.parse("<style>Data</style>").select("style").first().data());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20912);assertEquals("Data</style", Jsoup.parse("<style>Data</style").select("style").first().data());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20913);assertEquals("Data</-style", Jsoup.parse("<style>Data</-style").select("style").first().data());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20914);assertEquals("Data</style-", Jsoup.parse("<style>Data</style-").select("style").first().data());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20915);assertEquals("Data</style--", Jsoup.parse("<style>Data</style--").select("style").first().data());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void noImplicitFormForTextAreas() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20916);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_03il275g50();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.noImplicitFormForTextAreas",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20916,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_03il275g50(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20916);
        // old jsoup parser would create implicit forms for form children like <textarea>, but no more
        __CLR4_2_0frxfrxlnxz238m.R.inc(20917);Document doc = Jsoup.parse("<textarea>One</textarea>");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20918);assertEquals("<textarea>One</textarea>", doc.body().html());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesEscapedScript() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20919);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ho4tu2g53();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesEscapedScript",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20919,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ho4tu2g53(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20919);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20920);Document doc = Jsoup.parse("<script><!-- one <script>Blah</script> --></script>");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20921);assertEquals("<!-- one <script>Blah</script> -->", doc.select("script").first().data());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handles0CharacterAsText() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0lmdfqig56();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handles0CharacterAsText",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20922,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0lmdfqig56(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20922);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20923);Document doc = Jsoup.parse("0<p>0</p>");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20924);assertEquals("0\n<p>0</p>", doc.body().html());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesNullInData() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20925);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ph1pw8g59();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesNullInData",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20925,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ph1pw8g59(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20925);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20926);Document doc = Jsoup.parse("<p id=\u0000>Blah \u0000</p>");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20927);assertEquals("<p id=\"\ufffd\">Blah \u0000</p>", doc.body().html()); // replaced in attr, NOT replaced in data
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesNullInComments() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_04wess2g5c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesNullInComments",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20928,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_04wess2g5c(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20928);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20929);Document doc = Jsoup.parse("<body><!-- \u0000 \u0000 -->");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20930);assertEquals("<!-- \ufffd \ufffd -->", doc.body().html());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesNewlinesAndWhitespaceInTag() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20931);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0qrbdwyg5f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesNewlinesAndWhitespaceInTag",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20931,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0qrbdwyg5f(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20931);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20932);Document doc = Jsoup.parse("<a \n href=\"one\" \r\n id=\"two\" \f >");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20933);assertEquals("<a href=\"one\" id=\"two\"></a>", doc.body().html());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesWhitespaceInoDocType() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0udex49g5i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesWhitespaceInoDocType",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20934,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0udex49g5i(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20934);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20935);String html = "<!DOCTYPE html\r\n" +
            "      PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"\r\n" +
            "      \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20936);Document doc = Jsoup.parse(html);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20937);assertEquals("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">", doc.childNode(0).outerHtml());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void tracksErrorsWhenRequested() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_08ofxsog5m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.tracksErrorsWhenRequested",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20938,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_08ofxsog5m(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20938);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20939);String html = "<p>One</p href='no'><!DOCTYPE html>&arrgh;<font /><br /><foo";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20940);Parser parser = Parser.htmlParser().setTrackErrors(500);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20941);Document doc = Jsoup.parse(html, "http://example.com", parser);

        __CLR4_2_0frxfrxlnxz238m.R.inc(20942);List<ParseError> errors = parser.getErrors();
        __CLR4_2_0frxfrxlnxz238m.R.inc(20943);assertEquals(5, errors.size());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20944);assertEquals("20: Attributes incorrectly present on end tag", errors.get(0).toString());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20945);assertEquals("35: Unexpected token [Doctype] when in state [InBody]", errors.get(1).toString());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20946);assertEquals("36: Invalid character reference: invalid named reference 'arrgh'", errors.get(2).toString());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20947);assertEquals("50: Tag cannot be self closing; not a void tag", errors.get(3).toString());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20948);assertEquals("61: Unexpectedly reached end of file (EOF) in input state [TagName]", errors.get(4).toString());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void tracksLimitedErrorsWhenRequested() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0xk373yg5x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.tracksLimitedErrorsWhenRequested",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20949,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0xk373yg5x(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20949);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20950);String html = "<p>One</p href='no'><!DOCTYPE html>&arrgh;<font /><br /><foo";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20951);Parser parser = Parser.htmlParser().setTrackErrors(3);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20952);Document doc = parser.parseInput(html, "http://example.com");

        __CLR4_2_0frxfrxlnxz238m.R.inc(20953);List<ParseError> errors = parser.getErrors();
        __CLR4_2_0frxfrxlnxz238m.R.inc(20954);assertEquals(3, errors.size());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20955);assertEquals("20: Attributes incorrectly present on end tag", errors.get(0).toString());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20956);assertEquals("35: Unexpected token [Doctype] when in state [InBody]", errors.get(1).toString());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20957);assertEquals("36: Invalid character reference: invalid named reference 'arrgh'", errors.get(2).toString());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void noErrorsByDefault() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0oypw3fg66();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.noErrorsByDefault",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20958,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0oypw3fg66(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20958);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20959);String html = "<p>One</p href='no'>&arrgh;<font /><br /><foo";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20960);Parser parser = Parser.htmlParser();
        __CLR4_2_0frxfrxlnxz238m.R.inc(20961);Document doc = Jsoup.parse(html, "http://example.com", parser);

        __CLR4_2_0frxfrxlnxz238m.R.inc(20962);List<ParseError> errors = parser.getErrors();
        __CLR4_2_0frxfrxlnxz238m.R.inc(20963);assertEquals(0, errors.size());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesCommentsInTable() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_048wer3g6c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesCommentsInTable",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20964,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_048wer3g6c(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20964);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20965);String html = "<table><tr><td>text</td><!-- Comment --></tr></table>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20966);Document node = Jsoup.parseBodyFragment(html);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20967);assertEquals("<html><head></head><body><table><tbody><tr><td>text</td><!-- Comment --></tr></tbody></table></body></html>", TextUtil.stripNewlines(node.outerHtml()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesQuotesInCommentsInScripts() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20968);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0kqi21dg6g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesQuotesInCommentsInScripts",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20968,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0kqi21dg6g(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20968);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20969);String html = "<script>\n" +
            "  <!--\n" +
            "    document.write('</scr' + 'ipt>');\n" +
            "  // -->\n" +
            "</script>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20970);Document node = Jsoup.parseBodyFragment(html);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20971);assertEquals("<script>\n" +
            "  <!--\n" +
            "    document.write('</scr' + 'ipt>');\n" +
            "  // -->\n" +
            "</script>", node.body().html());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handleNullContextInParseFragment() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20972);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0os0ozpg6k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handleNullContextInParseFragment",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20972,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0os0ozpg6k(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20972);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20973);String html = "<ol><li>One</li></ol><p>Two</p>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20974);List<Node> nodes = Parser.parseFragment(html, null, "http://example.com/");
        __CLR4_2_0frxfrxlnxz238m.R.inc(20975);assertEquals(1, nodes.size()); // returns <html> node (not document) -- no context means doc gets created
        __CLR4_2_0frxfrxlnxz238m.R.inc(20976);assertEquals("html", nodes.get(0).nodeName());
        __CLR4_2_0frxfrxlnxz238m.R.inc(20977);assertEquals("<html> <head></head> <body> <ol> <li>One</li> </ol> <p>Two</p> </body> </html>", StringUtil.normaliseWhitespace(nodes.get(0).outerHtml()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void doesNotFindShortestMatchingEntity() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20978);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0j9ajxgg6q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.doesNotFindShortestMatchingEntity",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20978,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0j9ajxgg6q(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20978);
        // previous behaviour was to identify a possible entity, then chomp down the string until a match was found.
        // (as defined in html5.) However in practise that lead to spurious matches against the author's intent.
        __CLR4_2_0frxfrxlnxz238m.R.inc(20979);String html = "One &clubsuite; &clubsuit;";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20980);Document doc = Jsoup.parse(html);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20981);assertEquals(StringUtil.normaliseWhitespace("One &amp;clubsuite; \u2663"), doc.body().html());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void relaxedBaseEntityMatchAndStrictExtendedMatch() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_048cbqtg6u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.relaxedBaseEntityMatchAndStrictExtendedMatch",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20982,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_048cbqtg6u(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20982);
        // extended entities need a ; at the end to match, base does not
        __CLR4_2_0frxfrxlnxz238m.R.inc(20983);String html = "&amp &quot &reg &icy &hopf &icy; &hopf;";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20984);Document doc = Jsoup.parse(html);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20985);doc.outputSettings().escapeMode(Entities.EscapeMode.extended).charset("ascii"); // modifies output only to clarify test
        __CLR4_2_0frxfrxlnxz238m.R.inc(20986);assertEquals("&amp; \" &reg; &amp;icy &amp;hopf &icy; &hopf;", doc.body().html());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesXmlDeclarationAsBogusComment() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0dhow8ig6z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesXmlDeclarationAsBogusComment",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20987,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0dhow8ig6z(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20987);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20988);String html = "<?xml encoding='UTF-8' ?><body>One</body>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20989);Document doc = Jsoup.parse(html);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20990);assertEquals("<!--?xml encoding='UTF-8' ?--> <html> <head></head> <body> One </body> </html>", StringUtil.normaliseWhitespace(doc.outerHtml()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesTagsInTextarea() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20991);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0mydgtyg73();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesTagsInTextarea",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20991,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0mydgtyg73(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20991);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20992);String html = "<textarea><p>Jsoup</p></textarea>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20993);Document doc = Jsoup.parse(html);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20994);assertEquals("<textarea>&lt;p&gt;Jsoup&lt;/p&gt;</textarea>", doc.body().html());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    // form tests
    @Test public void createsFormElements() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),20995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0x89rifg77();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.createsFormElements",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20995,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0x89rifg77(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(20995);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20996);String html = "<body><form><input id=1><input id=2></form></body>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(20997);Document doc = Jsoup.parse(html);
        __CLR4_2_0frxfrxlnxz238m.R.inc(20998);Element el = doc.select("form").first();

        __CLR4_2_0frxfrxlnxz238m.R.inc(20999);assertTrue("Is form element", el instanceof FormElement);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21000);FormElement form = (FormElement) el;
        __CLR4_2_0frxfrxlnxz238m.R.inc(21001);Elements controls = form.elements();
        __CLR4_2_0frxfrxlnxz238m.R.inc(21002);assertEquals(2, controls.size());
        __CLR4_2_0frxfrxlnxz238m.R.inc(21003);assertEquals("1", controls.get(0).id());
        __CLR4_2_0frxfrxlnxz238m.R.inc(21004);assertEquals("2", controls.get(1).id());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void associatedFormControlsWithDisjointForms() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),21005);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0vvsebwg7h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.associatedFormControlsWithDisjointForms",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21005,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0vvsebwg7h(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(21005);
        // form gets closed, isn't parent of controls
        __CLR4_2_0frxfrxlnxz238m.R.inc(21006);String html = "<table><tr><form><input type=hidden id=1><td><input type=text id=2></td><tr></table>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(21007);Document doc = Jsoup.parse(html);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21008);Element el = doc.select("form").first();

        __CLR4_2_0frxfrxlnxz238m.R.inc(21009);assertTrue("Is form element", el instanceof FormElement);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21010);FormElement form = (FormElement) el;
        __CLR4_2_0frxfrxlnxz238m.R.inc(21011);Elements controls = form.elements();
        __CLR4_2_0frxfrxlnxz238m.R.inc(21012);assertEquals(2, controls.size());
        __CLR4_2_0frxfrxlnxz238m.R.inc(21013);assertEquals("1", controls.get(0).id());
        __CLR4_2_0frxfrxlnxz238m.R.inc(21014);assertEquals("2", controls.get(1).id());

        __CLR4_2_0frxfrxlnxz238m.R.inc(21015);assertEquals("<table><tbody><tr><form></form><input type=\"hidden\" id=\"1\"><td><input type=\"text\" id=\"2\"></td></tr><tr></tr></tbody></table>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesInputInTable() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),21016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0abw9rlg7s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesInputInTable",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21016,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0abw9rlg7s(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(21016);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21017);String h = "<body>\n" +
            "<input type=\"hidden\" name=\"a\" value=\"\">\n" +
            "<table>\n" +
            "<input type=\"hidden\" name=\"b\" value=\"\" />\n" +
            "</table>\n" +
            "</body>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(21018);Document doc = Jsoup.parse(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21019);assertEquals(1, doc.select("table input").size());
        __CLR4_2_0frxfrxlnxz238m.R.inc(21020);assertEquals(2, doc.select("input").size());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void convertsImageToImg() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),21021);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0dwykj0g7x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.convertsImageToImg",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21021,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0dwykj0g7x(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(21021);
        // image to img, unless in a svg. old html cruft.
        __CLR4_2_0frxfrxlnxz238m.R.inc(21022);String h = "<body><image><svg><image /></svg></body>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(21023);Document doc = Jsoup.parse(h);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21024);assertEquals("<img>\n<svg>\n <image />\n</svg>", doc.body().html());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesInvalidDoctypes() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),21025);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_02q1uesg81();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesInvalidDoctypes",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21025,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_02q1uesg81(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(21025);
        // would previously throw invalid name exception on empty doctype
        __CLR4_2_0frxfrxlnxz238m.R.inc(21026);Document doc = Jsoup.parse("<!DOCTYPE>");
        __CLR4_2_0frxfrxlnxz238m.R.inc(21027);assertEquals(
            "<!doctype> <html> <head></head> <body></body> </html>",
            StringUtil.normaliseWhitespace(doc.outerHtml()));

        __CLR4_2_0frxfrxlnxz238m.R.inc(21028);doc = Jsoup.parse("<!DOCTYPE><html><p>Foo</p></html>");
        __CLR4_2_0frxfrxlnxz238m.R.inc(21029);assertEquals(
            "<!doctype> <html> <head></head> <body> <p>Foo</p> </body> </html>",
            StringUtil.normaliseWhitespace(doc.outerHtml()));

        __CLR4_2_0frxfrxlnxz238m.R.inc(21030);doc = Jsoup.parse("<!DOCTYPE \u0000>");
        __CLR4_2_0frxfrxlnxz238m.R.inc(21031);assertEquals(
            "<!doctype \ufffd> <html> <head></head> <body></body> </html>",
            StringUtil.normaliseWhitespace(doc.outerHtml()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesManyChildren() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),21032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0b8f634g88();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesManyChildren",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21032,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0b8f634g88(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(21032);
        // Arrange
        __CLR4_2_0frxfrxlnxz238m.R.inc(21033);StringBuilder longBody = new StringBuilder(500000);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21034);for (int i = 0; (((i < 25000)&&(__CLR4_2_0frxfrxlnxz238m.R.iget(21035)!=0|true))||(__CLR4_2_0frxfrxlnxz238m.R.iget(21036)==0&false)); i++) {{
            __CLR4_2_0frxfrxlnxz238m.R.inc(21037);longBody.append(i).append("<br>");
        }

        // Act
        // Commenting out this time check due to issues reported in Campuswire #427 and #524
        // long start = System.currentTimeMillis();
        }__CLR4_2_0frxfrxlnxz238m.R.inc(21038);Document doc = Parser.parseBodyFragment(longBody.toString(), "");

        // Assert
        __CLR4_2_0frxfrxlnxz238m.R.inc(21039);assertEquals(50000, doc.body().childNodeSize());
        // Commenting out this time check due to issues reported in Campuswire #427 and #524
        // assertTrue(System.currentTimeMillis() - start < 1000);
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesDeepStack() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),21040);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0gl9t7cg8g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesDeepStack",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21040,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0gl9t7cg8g(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(21040);
        // inspired by http://sv.stargate.wikia.com/wiki/M2J and https://github.com/jhy/jsoup/issues/955
        // I didn't put it in the integration tests, because explorer and intellij kept dieing trying to preview/index it

        // Arrange
        __CLR4_2_0frxfrxlnxz238m.R.inc(21041);StringBuilder longBody = new StringBuilder(500000);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21042);for (int i = 0; (((i < 25000)&&(__CLR4_2_0frxfrxlnxz238m.R.iget(21043)!=0|true))||(__CLR4_2_0frxfrxlnxz238m.R.iget(21044)==0&false)); i++) {{
            __CLR4_2_0frxfrxlnxz238m.R.inc(21045);longBody.append(i).append("<dl><dd>");
        }
        }__CLR4_2_0frxfrxlnxz238m.R.inc(21046);for (int i = 0; (((i < 25000)&&(__CLR4_2_0frxfrxlnxz238m.R.iget(21047)!=0|true))||(__CLR4_2_0frxfrxlnxz238m.R.iget(21048)==0&false)); i++) {{
            __CLR4_2_0frxfrxlnxz238m.R.inc(21049);longBody.append(i).append("</dd></dl>");
        }

        // Act
        // Commenting out this time check due to issues reported in Campuswire #427 and #524
        // long start = System.currentTimeMillis();
        }__CLR4_2_0frxfrxlnxz238m.R.inc(21050);Document doc = Parser.parseBodyFragment(longBody.toString(), "");

        // Assert
        __CLR4_2_0frxfrxlnxz238m.R.inc(21051);assertEquals(2, doc.body().childNodeSize());
        __CLR4_2_0frxfrxlnxz238m.R.inc(21052);assertEquals(25000, doc.select("dd").size());

        // Commenting out this time check due to issues reported in Campuswire #427 and #524
        // assertTrue(System.currentTimeMillis() - start < 2000);
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test
    public void testInvalidTableContents() throws IOException {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),21053);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_09r0xlig8t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.testInvalidTableContents",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21053,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_09r0xlig8t() throws IOException{try{__CLR4_2_0frxfrxlnxz238m.R.inc(21053);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21054);File in = ParseTest.getFile("/htmltests/table-invalid-elements.html");
        __CLR4_2_0frxfrxlnxz238m.R.inc(21055);Document doc = Jsoup.parse(in, "UTF-8");
        __CLR4_2_0frxfrxlnxz238m.R.inc(21056);doc.outputSettings().prettyPrint(true);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21057);String rendered = doc.toString();
        __CLR4_2_0frxfrxlnxz238m.R.inc(21058);int endOfEmail = rendered.indexOf("Comment");
        __CLR4_2_0frxfrxlnxz238m.R.inc(21059);int guarantee = rendered.indexOf("Why am I here?");
        __CLR4_2_0frxfrxlnxz238m.R.inc(21060);assertTrue("Comment not found", endOfEmail > -1);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21061);assertTrue("Search text not found", guarantee > -1);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21062);assertTrue("Search text did not come after comment", guarantee > endOfEmail);
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void testNormalisesIsIndex() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),21063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0uwwz5qg93();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.testNormalisesIsIndex",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21063,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0uwwz5qg93(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(21063);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21064);Document doc = Jsoup.parse("<body><isindex action='/submit'></body>");
        __CLR4_2_0frxfrxlnxz238m.R.inc(21065);String html = doc.outerHtml();
        __CLR4_2_0frxfrxlnxz238m.R.inc(21066);assertEquals("<form action=\"/submit\"> <hr> <label>This is a searchable index. Enter search keywords: <input name=\"isindex\"></label> <hr> </form>",
            StringUtil.normaliseWhitespace(doc.body().html()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void testReinsertionModeForThCelss() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),21067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0nc1swxg97();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.testReinsertionModeForThCelss",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21067,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0nc1swxg97(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(21067);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21068);String body = "<body> <table> <tr> <th> <table><tr><td></td></tr></table> <div> <table><tr><td></td></tr></table> </div> <div></div> <div></div> <div></div> </th> </tr> </table> </body>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(21069);Document doc = Jsoup.parse(body);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21070);assertEquals(1, doc.body().children().size());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void testUsingSingleQuotesInQueries() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),21071);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0adgmdlg9b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.testUsingSingleQuotesInQueries",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21071,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0adgmdlg9b(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(21071);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21072);String body = "<body> <div class='main'>hello</div></body>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(21073);Document doc = Jsoup.parse(body);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21074);Elements main = doc.select("div[class='main']");
        __CLR4_2_0frxfrxlnxz238m.R.inc(21075);assertEquals("hello", main.text());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void testSupportsNonAsciiTags() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),21076);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0xhxhiyg9g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.testSupportsNonAsciiTags",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21076,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0xhxhiyg9g(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(21076);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21077);String body = "<\u9032\u6357\u63a8\u79fb\u30b0\u30e9\u30d5>Yes</\u9032\u6357\u63a8\u79fb\u30b0\u30e9\u30d5><\u0440\u0443\u0441\u0441\u043a\u0438\u0439-\u0442\u044d\u0433>Correct</<\u0440\u0443\u0441\u0441\u043a\u0438\u0439-\u0442\u044d\u0433>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(21078);Document doc = Jsoup.parse(body);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21079);Elements els = doc.select("\u9032\u6357\u63a8\u79fb\u30b0\u30e9\u30d5");
        __CLR4_2_0frxfrxlnxz238m.R.inc(21080);assertEquals("Yes", els.text());
        __CLR4_2_0frxfrxlnxz238m.R.inc(21081);els = doc.select("\u0440\u0443\u0441\u0441\u043a\u0438\u0439-\u0442\u044d\u0433");
        __CLR4_2_0frxfrxlnxz238m.R.inc(21082);assertEquals("Correct", els.text());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void testSupportsPartiallyNonAsciiTags() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),21083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0oyn3nog9n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.testSupportsPartiallyNonAsciiTags",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21083,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0oyn3nog9n(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(21083);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21084);String body = "<div>Check</div\u00e1>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(21085);Document doc = Jsoup.parse(body);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21086);Elements els = doc.select("div");
        __CLR4_2_0frxfrxlnxz238m.R.inc(21087);assertEquals("Check", els.text());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void testFragment() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),21088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_03qpibbg9s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.testFragment",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21088,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_03qpibbg9s(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(21088);
        // make sure when parsing a body fragment, a script tag at start goes into the body
        __CLR4_2_0frxfrxlnxz238m.R.inc(21089);String html =
            "<script type=\"text/javascript\">console.log('foo');</script>\n" +
                "<div id=\"somecontent\">some content</div>\n" +
                "<script type=\"text/javascript\">console.log('bar');</script>";

        __CLR4_2_0frxfrxlnxz238m.R.inc(21090);Document body = Jsoup.parseBodyFragment(html);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21091);assertEquals("<script type=\"text/javascript\">console.log('foo');</script> \n" +
            "<div id=\"somecontent\">\n" +
            " some content\n" +
            "</div> \n" +
            "<script type=\"text/javascript\">console.log('bar');</script>", body.body().html());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void testHtmlLowerCase() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),21092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0r00kslg9w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.testHtmlLowerCase",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21092,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0r00kslg9w(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(21092);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21093);String html = "<!doctype HTML><DIV ID=1>One</DIV>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(21094);Document doc = Jsoup.parse(html);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21095);assertEquals("<!doctype html> <html> <head></head> <body> <div id=\"1\"> One </div> </body> </html>", StringUtil.normaliseWhitespace(doc.outerHtml()));

        __CLR4_2_0frxfrxlnxz238m.R.inc(21096);Element div = doc.selectFirst("#1");
        __CLR4_2_0frxfrxlnxz238m.R.inc(21097);div.after("<TaG>One</TaG>");
        __CLR4_2_0frxfrxlnxz238m.R.inc(21098);assertEquals("<tag>One</tag>", TextUtil.stripNewlines(div.nextElementSibling().outerHtml()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void canPreserveTagCase() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),21099);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_040p579ga3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.canPreserveTagCase",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21099,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_040p579ga3(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(21099);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21100);Parser parser = Parser.htmlParser();
        __CLR4_2_0frxfrxlnxz238m.R.inc(21101);parser.settings(new ParseSettings(true, false));
        __CLR4_2_0frxfrxlnxz238m.R.inc(21102);Document doc = parser.parseInput("<div id=1><SPAN ID=2>", "");
        __CLR4_2_0frxfrxlnxz238m.R.inc(21103);assertEquals("<html> <head></head> <body> <div id=\"1\"> <SPAN id=\"2\"></SPAN> </div> </body> </html>", StringUtil.normaliseWhitespace(doc.outerHtml()));

        __CLR4_2_0frxfrxlnxz238m.R.inc(21104);Element div = doc.selectFirst("#1");
        __CLR4_2_0frxfrxlnxz238m.R.inc(21105);div.after("<TaG ID=one>One</TaG>");
        __CLR4_2_0frxfrxlnxz238m.R.inc(21106);assertEquals("<TaG id=\"one\">One</TaG>", TextUtil.stripNewlines(div.nextElementSibling().outerHtml()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void canPreserveAttributeCase() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),21107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_07xjivrgab();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.canPreserveAttributeCase",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21107,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_07xjivrgab(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(21107);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21108);Parser parser = Parser.htmlParser();
        __CLR4_2_0frxfrxlnxz238m.R.inc(21109);parser.settings(new ParseSettings(false, true));
        __CLR4_2_0frxfrxlnxz238m.R.inc(21110);Document doc = parser.parseInput("<div id=1><SPAN ID=2>", "");
        __CLR4_2_0frxfrxlnxz238m.R.inc(21111);assertEquals("<html> <head></head> <body> <div id=\"1\"> <span ID=\"2\"></span> </div> </body> </html>", StringUtil.normaliseWhitespace(doc.outerHtml()));

        __CLR4_2_0frxfrxlnxz238m.R.inc(21112);Element div = doc.selectFirst("#1");
        __CLR4_2_0frxfrxlnxz238m.R.inc(21113);div.after("<TaG ID=one>One</TaG>");
        __CLR4_2_0frxfrxlnxz238m.R.inc(21114);assertEquals("<tag ID=\"one\">One</tag>", TextUtil.stripNewlines(div.nextElementSibling().outerHtml()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void canPreserveBothCase() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),21115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0bv6wd0gaj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.canPreserveBothCase",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21115,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0bv6wd0gaj(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(21115);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21116);Parser parser = Parser.htmlParser();
        __CLR4_2_0frxfrxlnxz238m.R.inc(21117);parser.settings(new ParseSettings(true, true));
        __CLR4_2_0frxfrxlnxz238m.R.inc(21118);Document doc = parser.parseInput("<div id=1><SPAN ID=2>", "");
        __CLR4_2_0frxfrxlnxz238m.R.inc(21119);assertEquals("<html> <head></head> <body> <div id=\"1\"> <SPAN ID=\"2\"></SPAN> </div> </body> </html>", StringUtil.normaliseWhitespace(doc.outerHtml()));

        __CLR4_2_0frxfrxlnxz238m.R.inc(21120);Element div = doc.selectFirst("#1");
        __CLR4_2_0frxfrxlnxz238m.R.inc(21121);div.after("<TaG ID=one>One</TaG>");
        __CLR4_2_0frxfrxlnxz238m.R.inc(21122);assertEquals("<TaG ID=\"one\">One</TaG>", TextUtil.stripNewlines(div.nextElementSibling().outerHtml()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesControlCodeInAttributeName() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),21123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0dl11ygar();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesControlCodeInAttributeName",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21123,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0dl11ygar(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(21123);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21124);Document doc = Jsoup.parse("<p><a \06=foo>One</a><a/\06=bar><a foo\06=bar>Two</a></p>");
        __CLR4_2_0frxfrxlnxz238m.R.inc(21125);assertEquals("<p><a>One</a><a></a><a foo=\"bar\">Two</a></p>", doc.body().html());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void caseSensitiveParseTree() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),21126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0g8rt1qgau();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.caseSensitiveParseTree",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21126,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0g8rt1qgau(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(21126);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21127);String html = "<r><X>A</X><y>B</y></r>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(21128);Parser parser = Parser.htmlParser();
        __CLR4_2_0frxfrxlnxz238m.R.inc(21129);parser.settings(ParseSettings.preserveCase);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21130);Document doc = parser.parseInput(html, "");
        __CLR4_2_0frxfrxlnxz238m.R.inc(21131);assertEquals("<r> <X> A </X> <y> B </y> </r>", StringUtil.normaliseWhitespace(doc.body().html()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void caseInsensitiveParseTree() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),21132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0nmadfbgb0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.caseInsensitiveParseTree",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21132,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0nmadfbgb0(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(21132);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21133);String html = "<r><X>A</X><y>B</y></r>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(21134);Parser parser = Parser.htmlParser();
        __CLR4_2_0frxfrxlnxz238m.R.inc(21135);Document doc = parser.parseInput(html, "");
        __CLR4_2_0frxfrxlnxz238m.R.inc(21136);assertEquals("<r> <x> A </x> <y> B </y> </r>", StringUtil.normaliseWhitespace(doc.body().html()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void preservedCaseLinksCantNest() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),21137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0rkhcwkgb5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.preservedCaseLinksCantNest",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21137,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0rkhcwkgb5(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(21137);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21138);String html = "<A>ONE <A>Two</A></A>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(21139);Document doc = Parser.htmlParser()
            .settings(ParseSettings.preserveCase)
            .parseInput(html, "");
        __CLR4_2_0frxfrxlnxz238m.R.inc(21140);assertEquals("<A> ONE </A> <A> Two </A>", StringUtil.normaliseWhitespace(doc.body().html()));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void normalizesDiscordantTags() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),21141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_083kh27gb9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.normalizesDiscordantTags",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21141,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_083kh27gb9(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(21141);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21142);Document document = Jsoup.parse("<div>test</DIV><p></p>");
        __CLR4_2_0frxfrxlnxz238m.R.inc(21143);assertEquals("<div>\n test\n</div>\n<p></p>", document.body().html());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void selfClosingVoidIsNotAnError() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),21144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ybpj8qgbc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.selfClosingVoidIsNotAnError",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21144,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ybpj8qgbc(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(21144);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21145);String html = "<p>test<br/>test<br/></p>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(21146);Parser parser = Parser.htmlParser().setTrackErrors(5);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21147);parser.parseInput(html, "");
        __CLR4_2_0frxfrxlnxz238m.R.inc(21148);assertEquals(0, parser.getErrors().size());

        __CLR4_2_0frxfrxlnxz238m.R.inc(21149);assertTrue(Jsoup.isValid(html, Whitelist.basic()));
        __CLR4_2_0frxfrxlnxz238m.R.inc(21150);String clean = Jsoup.clean(html, Whitelist.basic());
        __CLR4_2_0frxfrxlnxz238m.R.inc(21151);assertEquals("<p>test<br>test<br></p>", clean);
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void selfClosingOnNonvoidIsError() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),21152);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_02ym8r8gbk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.selfClosingOnNonvoidIsError",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21152,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_02ym8r8gbk(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(21152);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21153);String html = "<p>test</p><div /><div>Two</div>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(21154);Parser parser = Parser.htmlParser().setTrackErrors(5);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21155);parser.parseInput(html, "");
        __CLR4_2_0frxfrxlnxz238m.R.inc(21156);assertEquals(1, parser.getErrors().size());
        __CLR4_2_0frxfrxlnxz238m.R.inc(21157);assertEquals("18: Tag cannot be self closing; not a void tag", parser.getErrors().get(0).toString());

        __CLR4_2_0frxfrxlnxz238m.R.inc(21158);assertFalse(Jsoup.isValid(html, Whitelist.relaxed()));
        __CLR4_2_0frxfrxlnxz238m.R.inc(21159);String clean = Jsoup.clean(html, Whitelist.relaxed());
        __CLR4_2_0frxfrxlnxz238m.R.inc(21160);assertEquals("<p>test</p> <div></div> <div> Two </div>", StringUtil.normaliseWhitespace(clean));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void testTemplateInsideTable() throws IOException {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),21161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0s6myhfgbt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.testTemplateInsideTable",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21161,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0s6myhfgbt() throws IOException{try{__CLR4_2_0frxfrxlnxz238m.R.inc(21161);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21162);File in = ParseTest.getFile("/htmltests/table-polymer-template.html");
        __CLR4_2_0frxfrxlnxz238m.R.inc(21163);Document doc = Jsoup.parse(in, "UTF-8");
        __CLR4_2_0frxfrxlnxz238m.R.inc(21164);doc.outputSettings().prettyPrint(true);

        __CLR4_2_0frxfrxlnxz238m.R.inc(21165);Elements templates = doc.body().getElementsByTag("template");
        __CLR4_2_0frxfrxlnxz238m.R.inc(21166);for (Element template : templates) {{
            __CLR4_2_0frxfrxlnxz238m.R.inc(21167);assertTrue(template.childNodes().size() > 1);
        }
    }}finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void testHandlesDeepSpans() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),21168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_09rkgnfgc0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.testHandlesDeepSpans",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21168,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_09rkgnfgc0(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(21168);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21169);StringBuilder sb = new StringBuilder();
        __CLR4_2_0frxfrxlnxz238m.R.inc(21170);for (int i = 0; (((i < 200)&&(__CLR4_2_0frxfrxlnxz238m.R.iget(21171)!=0|true))||(__CLR4_2_0frxfrxlnxz238m.R.iget(21172)==0&false)); i++) {{
            __CLR4_2_0frxfrxlnxz238m.R.inc(21173);sb.append("<span>");
        }

        }__CLR4_2_0frxfrxlnxz238m.R.inc(21174);sb.append("<p>One</p>");

        __CLR4_2_0frxfrxlnxz238m.R.inc(21175);Document doc = Jsoup.parse(sb.toString());
        __CLR4_2_0frxfrxlnxz238m.R.inc(21176);assertEquals(200, doc.select("span").size());
        __CLR4_2_0frxfrxlnxz238m.R.inc(21177);assertEquals(1, doc.select("p").size());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void commentAtEnd() throws Exception {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),21178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0i06i0ggca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.commentAtEnd",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21178,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0i06i0ggca() throws Exception{try{__CLR4_2_0frxfrxlnxz238m.R.inc(21178);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21179);Document doc = Jsoup.parse("<!");
        __CLR4_2_0frxfrxlnxz238m.R.inc(21180);assertTrue(doc.childNode(0) instanceof Comment);
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void preSkipsFirstNewline() {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),21181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_02e9ds4gcd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.preSkipsFirstNewline",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21181,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_02e9ds4gcd(){try{__CLR4_2_0frxfrxlnxz238m.R.inc(21181);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21182);Document doc = Jsoup.parse("<pre>\n\nOne\nTwo\n</pre>");
        __CLR4_2_0frxfrxlnxz238m.R.inc(21183);Element pre = doc.selectFirst("pre");
        __CLR4_2_0frxfrxlnxz238m.R.inc(21184);assertEquals("One\nTwo", pre.text());
        __CLR4_2_0frxfrxlnxz238m.R.inc(21185);assertEquals("\nOne\nTwo\n", pre.wholeText());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void handlesXmlDeclAndCommentsBeforeDoctype() throws IOException {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),21186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_05ugge3gci();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesXmlDeclAndCommentsBeforeDoctype",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21186,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_05ugge3gci() throws IOException{try{__CLR4_2_0frxfrxlnxz238m.R.inc(21186);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21187);File in = ParseTest.getFile("/htmltests/comments.html");
        __CLR4_2_0frxfrxlnxz238m.R.inc(21188);Document doc = Jsoup.parse(in, "UTF-8");

        __CLR4_2_0frxfrxlnxz238m.R.inc(21189);assertEquals("<!--?xml version=\"1.0\" encoding=\"utf-8\"?--> <!-- so --><!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"> <!-- what --> <html xml:lang=\"en\" lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\"> <!-- now --> <head> <!-- then --> <meta http-equiv=\"Content-type\" content=\"text/html; charset=utf-8\"> <title>A Certain Kind of Test</title> </head> <body> <h1>Hello</h1>h1&gt; (There is a UTF8 hidden BOM at the top of this file.) </body> </html>",
            StringUtil.normaliseWhitespace(doc.html()));

        __CLR4_2_0frxfrxlnxz238m.R.inc(21190);assertEquals("A Certain Kind of Test", doc.head().select("title").text());
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void fallbackToUtfIfCantEncode() throws IOException {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),21191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0r2if7cgcn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.fallbackToUtfIfCantEncode",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21191,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0r2if7cgcn() throws IOException{try{__CLR4_2_0frxfrxlnxz238m.R.inc(21191);
        // that charset can't be encoded, so make sure we flip to utf

        __CLR4_2_0frxfrxlnxz238m.R.inc(21192);String in = "<html><meta charset=\"ISO-2022-CN\"/>One</html>";
        __CLR4_2_0frxfrxlnxz238m.R.inc(21193);Document doc = Jsoup.parse(new ByteArrayInputStream(in.getBytes()), null, "");

        __CLR4_2_0frxfrxlnxz238m.R.inc(21194);assertEquals("UTF-8", doc.charset().name());
        __CLR4_2_0frxfrxlnxz238m.R.inc(21195);assertEquals("One", doc.text());

        __CLR4_2_0frxfrxlnxz238m.R.inc(21196);String html = doc.outerHtml();
        __CLR4_2_0frxfrxlnxz238m.R.inc(21197);assertEquals("<html><head><meta charset=\"UTF-8\"></head><body>One</body></html>", TextUtil.stripNewlines(html));
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}

    @Test public void characterReaderBuffer() throws IOException {__CLR4_2_0frxfrxlnxz238m.R.globalSliceStart(getClass().getName(),21198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0gy5099gcu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0frxfrxlnxz238m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0frxfrxlnxz238m.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.characterReaderBuffer",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21198,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0gy5099gcu() throws IOException{try{__CLR4_2_0frxfrxlnxz238m.R.inc(21198);
        __CLR4_2_0frxfrxlnxz238m.R.inc(21199);File in = ParseTest.getFile("/htmltests/character-reader-buffer.html");
        __CLR4_2_0frxfrxlnxz238m.R.inc(21200);Document doc = Jsoup.parse(in, "UTF-8");

        __CLR4_2_0frxfrxlnxz238m.R.inc(21201);String expectedHref = "http://www.domain.com/path?param_one=value&param_two=value";

        __CLR4_2_0frxfrxlnxz238m.R.inc(21202);Elements links = doc.select("a");
        __CLR4_2_0frxfrxlnxz238m.R.inc(21203);assertEquals(2, links.size());
        __CLR4_2_0frxfrxlnxz238m.R.inc(21204);assertEquals(expectedHref, links.get(0).attr("href")); // passes
        __CLR4_2_0frxfrxlnxz238m.R.inc(21205);assertEquals(expectedHref, links.get(1).attr("href")); // fails, "but was:<...ath?param_one=value&[]_two-value>"
    }finally{__CLR4_2_0frxfrxlnxz238m.R.flushNeeded();}}
}
