/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.parser;

import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.BooleanAttribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 Test suite for attribute parser.

 @author Jonathan Hedley, jonathan@hedley.net */
public class AttributeParseTest {static class __CLR4_2_0fk2fk2lnxz2382{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767707166L,8589935092L,20220,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test public void parsesRoughAttributeString() {__CLR4_2_0fk2fk2lnxz2382.R.globalSliceStart(getClass().getName(),20162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0uhigbpfk2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fk2fk2lnxz2382.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fk2fk2lnxz2382.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.AttributeParseTest.parsesRoughAttributeString",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20162,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0uhigbpfk2(){try{__CLR4_2_0fk2fk2lnxz2382.R.inc(20162);
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20163);String html = "<a id=\"123\" class=\"baz = 'bar'\" style = 'border: 2px'qux zim foo = 12 mux=18 />";
        // should be: <id=123>, <class=baz = 'bar'>, <qux=>, <zim=>, <foo=12>, <mux.=18>

        __CLR4_2_0fk2fk2lnxz2382.R.inc(20164);Element el = Jsoup.parse(html).getElementsByTag("a").get(0);
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20165);Attributes attr = el.attributes();
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20166);assertEquals(7, attr.size());
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20167);assertEquals("123", attr.get("id"));
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20168);assertEquals("baz = 'bar'", attr.get("class"));
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20169);assertEquals("border: 2px", attr.get("style"));
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20170);assertEquals("", attr.get("qux"));
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20171);assertEquals("", attr.get("zim"));
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20172);assertEquals("12", attr.get("foo"));
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20173);assertEquals("18", attr.get("mux"));
    }finally{__CLR4_2_0fk2fk2lnxz2382.R.flushNeeded();}}

    @Test public void handlesNewLinesAndReturns() {__CLR4_2_0fk2fk2lnxz2382.R.globalSliceStart(getClass().getName(),20174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_08pku2lfke();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fk2fk2lnxz2382.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fk2fk2lnxz2382.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.AttributeParseTest.handlesNewLinesAndReturns",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20174,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_08pku2lfke(){try{__CLR4_2_0fk2fk2lnxz2382.R.inc(20174);
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20175);String html = "<a\r\nfoo='bar\r\nqux'\r\nbar\r\n=\r\ntwo>One</a>";
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20176);Element el = Jsoup.parse(html).select("a").first();
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20177);assertEquals(2, el.attributes().size());
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20178);assertEquals("bar\r\nqux", el.attr("foo")); // currently preserves newlines in quoted attributes. todo confirm if should.
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20179);assertEquals("two", el.attr("bar"));
    }finally{__CLR4_2_0fk2fk2lnxz2382.R.flushNeeded();}}

    @Test public void parsesEmptyString() {__CLR4_2_0fk2fk2lnxz2382.R.globalSliceStart(getClass().getName(),20180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0j41mgrfkk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fk2fk2lnxz2382.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fk2fk2lnxz2382.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.AttributeParseTest.parsesEmptyString",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20180,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0j41mgrfkk(){try{__CLR4_2_0fk2fk2lnxz2382.R.inc(20180);
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20181);String html = "<a />";
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20182);Element el = Jsoup.parse(html).getElementsByTag("a").get(0);
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20183);Attributes attr = el.attributes();
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20184);assertEquals(0, attr.size());
    }finally{__CLR4_2_0fk2fk2lnxz2382.R.flushNeeded();}}

    @Test public void canStartWithEq() {__CLR4_2_0fk2fk2lnxz2382.R.globalSliceStart(getClass().getName(),20185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_09egzdhfkp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fk2fk2lnxz2382.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fk2fk2lnxz2382.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.AttributeParseTest.canStartWithEq",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20185,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_09egzdhfkp(){try{__CLR4_2_0fk2fk2lnxz2382.R.inc(20185);
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20186);String html = "<a =empty />";
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20187);Element el = Jsoup.parse(html).getElementsByTag("a").get(0);
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20188);Attributes attr = el.attributes();
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20189);assertEquals(1, attr.size());
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20190);assertTrue(attr.hasKey("=empty"));
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20191);assertEquals("", attr.get("=empty"));
    }finally{__CLR4_2_0fk2fk2lnxz2382.R.flushNeeded();}}

    @Test public void strictAttributeUnescapes() {__CLR4_2_0fk2fk2lnxz2382.R.globalSliceStart(getClass().getName(),20192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_082sc3xfkw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fk2fk2lnxz2382.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fk2fk2lnxz2382.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.AttributeParseTest.strictAttributeUnescapes",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20192,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_082sc3xfkw(){try{__CLR4_2_0fk2fk2lnxz2382.R.inc(20192);
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20193);String html = "<a id=1 href='?foo=bar&mid&lt=true'>One</a> <a id=2 href='?foo=bar&lt;qux&lg=1'>Two</a>";
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20194);Elements els = Jsoup.parse(html).select("a");
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20195);assertEquals("?foo=bar&mid&lt=true", els.first().attr("href"));
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20196);assertEquals("?foo=bar<qux&lg=1", els.last().attr("href"));
    }finally{__CLR4_2_0fk2fk2lnxz2382.R.flushNeeded();}}

    @Test public void moreAttributeUnescapes() {__CLR4_2_0fk2fk2lnxz2382.R.globalSliceStart(getClass().getName(),20197);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0v29i6xfl1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fk2fk2lnxz2382.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fk2fk2lnxz2382.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.AttributeParseTest.moreAttributeUnescapes",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20197,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0v29i6xfl1(){try{__CLR4_2_0fk2fk2lnxz2382.R.inc(20197);
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20198);String html = "<a href='&wr_id=123&mid-size=true&ok=&wr'>Check</a>";
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20199);Elements els = Jsoup.parse(html).select("a");
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20200);assertEquals("&wr_id=123&mid-size=true&ok=&wr", els.first().attr("href"));
    }finally{__CLR4_2_0fk2fk2lnxz2382.R.flushNeeded();}}

    @Test public void parsesBooleanAttributes() {__CLR4_2_0fk2fk2lnxz2382.R.globalSliceStart(getClass().getName(),20201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0i22d6ifl5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fk2fk2lnxz2382.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fk2fk2lnxz2382.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.AttributeParseTest.parsesBooleanAttributes",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20201,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0i22d6ifl5(){try{__CLR4_2_0fk2fk2lnxz2382.R.inc(20201);
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20202);String html = "<a normal=\"123\" boolean empty=\"\"></a>";
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20203);Element el = Jsoup.parse(html).select("a").first();

        __CLR4_2_0fk2fk2lnxz2382.R.inc(20204);assertEquals("123", el.attr("normal"));
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20205);assertEquals("", el.attr("boolean"));
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20206);assertEquals("", el.attr("empty"));

        __CLR4_2_0fk2fk2lnxz2382.R.inc(20207);List<Attribute> attributes = el.attributes().asList();
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20208);assertEquals("There should be 3 attribute present", 3, attributes.size());

        // Assuming the list order always follows the parsed html
		__CLR4_2_0fk2fk2lnxz2382.R.inc(20209);assertFalse("'normal' attribute should not be boolean", attributes.get(0) instanceof BooleanAttribute);
		__CLR4_2_0fk2fk2lnxz2382.R.inc(20210);assertTrue("'boolean' attribute should be boolean", attributes.get(1) instanceof BooleanAttribute);
		__CLR4_2_0fk2fk2lnxz2382.R.inc(20211);assertFalse("'empty' attribute should not be boolean", attributes.get(2) instanceof BooleanAttribute);

        __CLR4_2_0fk2fk2lnxz2382.R.inc(20212);assertEquals(html, el.outerHtml());
    }finally{__CLR4_2_0fk2fk2lnxz2382.R.flushNeeded();}}

    @Test public void dropsSlashFromAttributeName() {__CLR4_2_0fk2fk2lnxz2382.R.globalSliceStart(getClass().getName(),20213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0pkunedflh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fk2fk2lnxz2382.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fk2fk2lnxz2382.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.AttributeParseTest.dropsSlashFromAttributeName",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),20213,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0pkunedflh(){try{__CLR4_2_0fk2fk2lnxz2382.R.inc(20213);
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20214);String html = "<img /onerror='doMyJob'/>";
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20215);Document doc = Jsoup.parse(html);
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20216);assertTrue("SelfClosingStartTag ignores last character", !doc.select("img[onerror]").isEmpty());
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20217);assertEquals("<img onerror=\"doMyJob\">", doc.body().html());

        __CLR4_2_0fk2fk2lnxz2382.R.inc(20218);doc = Jsoup.parse(html, "", Parser.xmlParser());
        __CLR4_2_0fk2fk2lnxz2382.R.inc(20219);assertEquals("<img onerror=\"doMyJob\" />", doc.html());
    }finally{__CLR4_2_0fk2fk2lnxz2382.R.flushNeeded();}}
}
