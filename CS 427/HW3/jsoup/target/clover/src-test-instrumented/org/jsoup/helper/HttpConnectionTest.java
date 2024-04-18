/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.MultiLocaleRule;
import org.jsoup.MultiLocaleRule.MultiLocaleTest;
import org.jsoup.integration.ParseTest;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HttpConnectionTest {static class __CLR4_2_0888888lnxz22wk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767707166L,8589935092L,10831,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /* most actual network http connection tests are in integration */

    @Rule public MultiLocaleRule rule = new MultiLocaleRule();

    @Test(expected=IllegalArgumentException.class) public void throwsExceptionOnParseWithoutExecute() throws IOException {__CLR4_2_0888888lnxz22wk.R.globalSliceStart(getClass().getName(),10664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ty3f3u888();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,104,114,111,119,115,69,120,99,101,112,116,105,111,110,79,110,80,97,114,115,101,87,105,116,104,111,117,116,69,120,101,99,117,116,101,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0888888lnxz22wk.R.rethrow($CLV_t2$);}finally{__CLR4_2_0888888lnxz22wk.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.throwsExceptionOnParseWithoutExecute",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10664,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ty3f3u888() throws IOException{try{__CLR4_2_0888888lnxz22wk.R.inc(10664);
        __CLR4_2_0888888lnxz22wk.R.inc(10665);Connection con = HttpConnection.connect("http://example.com");
        __CLR4_2_0888888lnxz22wk.R.inc(10666);con.response().parse();
    }finally{__CLR4_2_0888888lnxz22wk.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class) public void throwsExceptionOnBodyWithoutExecute() throws IOException {__CLR4_2_0888888lnxz22wk.R.globalSliceStart(getClass().getName(),10667);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0g4tgcp88b();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,104,114,111,119,115,69,120,99,101,112,116,105,111,110,79,110,66,111,100,121,87,105,116,104,111,117,116,69,120,101,99,117,116,101,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0888888lnxz22wk.R.rethrow($CLV_t2$);}finally{__CLR4_2_0888888lnxz22wk.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.throwsExceptionOnBodyWithoutExecute",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10667,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0g4tgcp88b() throws IOException{try{__CLR4_2_0888888lnxz22wk.R.inc(10667);
        __CLR4_2_0888888lnxz22wk.R.inc(10668);Connection con = HttpConnection.connect("http://example.com");
        __CLR4_2_0888888lnxz22wk.R.inc(10669);con.response().body();
    }finally{__CLR4_2_0888888lnxz22wk.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class) public void throwsExceptionOnBodyAsBytesWithoutExecute() throws IOException {__CLR4_2_0888888lnxz22wk.R.globalSliceStart(getClass().getName(),10670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_02ucjfa88e();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,104,114,111,119,115,69,120,99,101,112,116,105,111,110,79,110,66,111,100,121,65,115,66,121,116,101,115,87,105,116,104,111,117,116,69,120,101,99,117,116,101,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0888888lnxz22wk.R.rethrow($CLV_t2$);}finally{__CLR4_2_0888888lnxz22wk.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.throwsExceptionOnBodyAsBytesWithoutExecute",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10670,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_02ucjfa88e() throws IOException{try{__CLR4_2_0888888lnxz22wk.R.inc(10670);
        __CLR4_2_0888888lnxz22wk.R.inc(10671);Connection con = HttpConnection.connect("http://example.com");
        __CLR4_2_0888888lnxz22wk.R.inc(10672);con.response().bodyAsBytes();
    }finally{__CLR4_2_0888888lnxz22wk.R.flushNeeded();}}

    @Test @MultiLocaleTest public void caseInsensitiveHeaders() {__CLR4_2_0888888lnxz22wk.R.globalSliceStart(getClass().getName(),10673);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0rwkca488h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0888888lnxz22wk.R.rethrow($CLV_t2$);}finally{__CLR4_2_0888888lnxz22wk.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.caseInsensitiveHeaders",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10673,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0rwkca488h(){try{__CLR4_2_0888888lnxz22wk.R.inc(10673);
        __CLR4_2_0888888lnxz22wk.R.inc(10674);Connection.Response res = new HttpConnection.Response();
        __CLR4_2_0888888lnxz22wk.R.inc(10675);res.header("Accept-Encoding", "gzip");
        __CLR4_2_0888888lnxz22wk.R.inc(10676);res.header("content-type", "text/html");
        __CLR4_2_0888888lnxz22wk.R.inc(10677);res.header("refErrer", "http://example.com");

        __CLR4_2_0888888lnxz22wk.R.inc(10678);assertTrue(res.hasHeader("Accept-Encoding"));
        __CLR4_2_0888888lnxz22wk.R.inc(10679);assertTrue(res.hasHeader("accept-encoding"));
        __CLR4_2_0888888lnxz22wk.R.inc(10680);assertTrue(res.hasHeader("accept-Encoding"));
        __CLR4_2_0888888lnxz22wk.R.inc(10681);assertTrue(res.hasHeader("ACCEPT-ENCODING"));

        __CLR4_2_0888888lnxz22wk.R.inc(10682);assertEquals("gzip", res.header("accept-Encoding"));
        __CLR4_2_0888888lnxz22wk.R.inc(10683);assertEquals("gzip", res.header("ACCEPT-ENCODING"));
        __CLR4_2_0888888lnxz22wk.R.inc(10684);assertEquals("text/html", res.header("Content-Type"));
        __CLR4_2_0888888lnxz22wk.R.inc(10685);assertEquals("http://example.com", res.header("Referrer"));

        __CLR4_2_0888888lnxz22wk.R.inc(10686);res.removeHeader("Content-Type");
        __CLR4_2_0888888lnxz22wk.R.inc(10687);assertFalse(res.hasHeader("content-type"));

        __CLR4_2_0888888lnxz22wk.R.inc(10688);res.removeHeader("ACCEPT-ENCODING");
        __CLR4_2_0888888lnxz22wk.R.inc(10689);assertFalse(res.hasHeader("Accept-Encoding"));

        __CLR4_2_0888888lnxz22wk.R.inc(10690);res.header("ACCEPT-ENCODING", "deflate");
        __CLR4_2_0888888lnxz22wk.R.inc(10691);assertEquals("deflate", res.header("Accept-Encoding"));
        __CLR4_2_0888888lnxz22wk.R.inc(10692);assertEquals("deflate", res.header("accept-Encoding"));
    }finally{__CLR4_2_0888888lnxz22wk.R.flushNeeded();}}

    @Test public void headers() {__CLR4_2_0888888lnxz22wk.R.globalSliceStart(getClass().getName(),10693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0jaq58t891();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0888888lnxz22wk.R.rethrow($CLV_t2$);}finally{__CLR4_2_0888888lnxz22wk.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.headers",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10693,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0jaq58t891(){try{__CLR4_2_0888888lnxz22wk.R.inc(10693);
        __CLR4_2_0888888lnxz22wk.R.inc(10694);Connection con = HttpConnection.connect("http://example.com");
        __CLR4_2_0888888lnxz22wk.R.inc(10695);Map<String, String> headers = new HashMap<>();
        __CLR4_2_0888888lnxz22wk.R.inc(10696);headers.put("content-type", "text/html");
        __CLR4_2_0888888lnxz22wk.R.inc(10697);headers.put("Connection", "keep-alive");
        __CLR4_2_0888888lnxz22wk.R.inc(10698);headers.put("Host", "http://example.com");
        __CLR4_2_0888888lnxz22wk.R.inc(10699);con.headers(headers);
        __CLR4_2_0888888lnxz22wk.R.inc(10700);assertEquals("text/html", con.request().header("content-type"));
        __CLR4_2_0888888lnxz22wk.R.inc(10701);assertEquals("keep-alive", con.request().header("Connection"));
        __CLR4_2_0888888lnxz22wk.R.inc(10702);assertEquals("http://example.com", con.request().header("Host"));
    }finally{__CLR4_2_0888888lnxz22wk.R.flushNeeded();}}

    @Test public void sameHeadersCombineWithComma() {__CLR4_2_0888888lnxz22wk.R.globalSliceStart(getClass().getName(),10703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0a1kill89b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0888888lnxz22wk.R.rethrow($CLV_t2$);}finally{__CLR4_2_0888888lnxz22wk.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.sameHeadersCombineWithComma",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10703,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0a1kill89b(){try{__CLR4_2_0888888lnxz22wk.R.inc(10703);
        __CLR4_2_0888888lnxz22wk.R.inc(10704);Map<String, List<String>> headers = new HashMap<>();
        __CLR4_2_0888888lnxz22wk.R.inc(10705);List<String> values = new ArrayList<>();
        __CLR4_2_0888888lnxz22wk.R.inc(10706);values.add("no-cache");
        __CLR4_2_0888888lnxz22wk.R.inc(10707);values.add("no-store");
        __CLR4_2_0888888lnxz22wk.R.inc(10708);headers.put("Cache-Control", values);
        __CLR4_2_0888888lnxz22wk.R.inc(10709);HttpConnection.Response res = new HttpConnection.Response();
        __CLR4_2_0888888lnxz22wk.R.inc(10710);res.processResponseHeaders(headers);
        __CLR4_2_0888888lnxz22wk.R.inc(10711);assertEquals("no-cache, no-store", res.header("Cache-Control"));
    }finally{__CLR4_2_0888888lnxz22wk.R.flushNeeded();}}

    @Test public void multipleHeaders() {__CLR4_2_0888888lnxz22wk.R.globalSliceStart(getClass().getName(),10712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_04i8zq589k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0888888lnxz22wk.R.rethrow($CLV_t2$);}finally{__CLR4_2_0888888lnxz22wk.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.multipleHeaders",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10712,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_04i8zq589k(){try{__CLR4_2_0888888lnxz22wk.R.inc(10712);
        __CLR4_2_0888888lnxz22wk.R.inc(10713);Connection.Request req = new HttpConnection.Request();
        __CLR4_2_0888888lnxz22wk.R.inc(10714);req.addHeader("Accept", "Something");
        __CLR4_2_0888888lnxz22wk.R.inc(10715);req.addHeader("Accept", "Everything");
        __CLR4_2_0888888lnxz22wk.R.inc(10716);req.addHeader("Foo", "Bar");

        __CLR4_2_0888888lnxz22wk.R.inc(10717);assertTrue(req.hasHeader("Accept"));
        __CLR4_2_0888888lnxz22wk.R.inc(10718);assertTrue(req.hasHeader("ACCEpt"));
        __CLR4_2_0888888lnxz22wk.R.inc(10719);assertEquals("Something, Everything", req.header("accept"));
        __CLR4_2_0888888lnxz22wk.R.inc(10720);assertTrue(req.hasHeader("fOO"));
        __CLR4_2_0888888lnxz22wk.R.inc(10721);assertEquals("Bar", req.header("foo"));

        __CLR4_2_0888888lnxz22wk.R.inc(10722);List<String> accept = req.headers("accept");
        __CLR4_2_0888888lnxz22wk.R.inc(10723);assertEquals(2, accept.size());
        __CLR4_2_0888888lnxz22wk.R.inc(10724);assertEquals("Something", accept.get(0));
        __CLR4_2_0888888lnxz22wk.R.inc(10725);assertEquals("Everything", accept.get(1));

        __CLR4_2_0888888lnxz22wk.R.inc(10726);Map<String, List<String>> headers = req.multiHeaders();
        __CLR4_2_0888888lnxz22wk.R.inc(10727);assertEquals(accept, headers.get("Accept"));
        __CLR4_2_0888888lnxz22wk.R.inc(10728);assertEquals("Bar", headers.get("Foo").get(0));

        __CLR4_2_0888888lnxz22wk.R.inc(10729);assertTrue(req.hasHeader("Accept"));
        __CLR4_2_0888888lnxz22wk.R.inc(10730);assertTrue(req.hasHeaderWithValue("accept", "Something"));
        __CLR4_2_0888888lnxz22wk.R.inc(10731);assertTrue(req.hasHeaderWithValue("accept", "Everything"));
        __CLR4_2_0888888lnxz22wk.R.inc(10732);assertFalse(req.hasHeaderWithValue("accept", "Something for nothing"));

        __CLR4_2_0888888lnxz22wk.R.inc(10733);req.removeHeader("accept");
        __CLR4_2_0888888lnxz22wk.R.inc(10734);headers = req.multiHeaders();
        __CLR4_2_0888888lnxz22wk.R.inc(10735);assertEquals("Bar", headers.get("Foo").get(0));
        __CLR4_2_0888888lnxz22wk.R.inc(10736);assertFalse(req.hasHeader("Accept"));
        __CLR4_2_0888888lnxz22wk.R.inc(10737);assertTrue(headers.get("Accept") == null);
    }finally{__CLR4_2_0888888lnxz22wk.R.flushNeeded();}}

    @Test public void ignoresEmptySetCookies() {__CLR4_2_0888888lnxz22wk.R.globalSliceStart(getClass().getName(),10738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_04elerk8aa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0888888lnxz22wk.R.rethrow($CLV_t2$);}finally{__CLR4_2_0888888lnxz22wk.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.ignoresEmptySetCookies",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10738,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_04elerk8aa(){try{__CLR4_2_0888888lnxz22wk.R.inc(10738);
        // prep http response header map
        __CLR4_2_0888888lnxz22wk.R.inc(10739);Map<String, List<String>> headers = new HashMap<>();
        __CLR4_2_0888888lnxz22wk.R.inc(10740);headers.put("Set-Cookie", Collections.<String>emptyList());
        __CLR4_2_0888888lnxz22wk.R.inc(10741);HttpConnection.Response res = new HttpConnection.Response();
        __CLR4_2_0888888lnxz22wk.R.inc(10742);res.processResponseHeaders(headers);
        __CLR4_2_0888888lnxz22wk.R.inc(10743);assertEquals(0, res.cookies().size());
    }finally{__CLR4_2_0888888lnxz22wk.R.flushNeeded();}}

    @Test public void ignoresEmptyCookieNameAndVals() {__CLR4_2_0888888lnxz22wk.R.globalSliceStart(getClass().getName(),10744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0rkv50r8ag();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0888888lnxz22wk.R.rethrow($CLV_t2$);}finally{__CLR4_2_0888888lnxz22wk.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.ignoresEmptyCookieNameAndVals",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10744,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0rkv50r8ag(){try{__CLR4_2_0888888lnxz22wk.R.inc(10744);
        // prep http response header map
        __CLR4_2_0888888lnxz22wk.R.inc(10745);Map<String, List<String>> headers = new HashMap<>();
        __CLR4_2_0888888lnxz22wk.R.inc(10746);List<String> cookieStrings = new ArrayList<>();
        __CLR4_2_0888888lnxz22wk.R.inc(10747);cookieStrings.add(null);
        __CLR4_2_0888888lnxz22wk.R.inc(10748);cookieStrings.add("");
        __CLR4_2_0888888lnxz22wk.R.inc(10749);cookieStrings.add("one");
        __CLR4_2_0888888lnxz22wk.R.inc(10750);cookieStrings.add("two=");
        __CLR4_2_0888888lnxz22wk.R.inc(10751);cookieStrings.add("three=;");
        __CLR4_2_0888888lnxz22wk.R.inc(10752);cookieStrings.add("four=data; Domain=.example.com; Path=/");

        __CLR4_2_0888888lnxz22wk.R.inc(10753);headers.put("Set-Cookie", cookieStrings);
        __CLR4_2_0888888lnxz22wk.R.inc(10754);HttpConnection.Response res = new HttpConnection.Response();
        __CLR4_2_0888888lnxz22wk.R.inc(10755);res.processResponseHeaders(headers);
        __CLR4_2_0888888lnxz22wk.R.inc(10756);assertEquals(4, res.cookies().size());
        __CLR4_2_0888888lnxz22wk.R.inc(10757);assertEquals("", res.cookie("one"));
        __CLR4_2_0888888lnxz22wk.R.inc(10758);assertEquals("", res.cookie("two"));
        __CLR4_2_0888888lnxz22wk.R.inc(10759);assertEquals("", res.cookie("three"));
        __CLR4_2_0888888lnxz22wk.R.inc(10760);assertEquals("data", res.cookie("four"));
    }finally{__CLR4_2_0888888lnxz22wk.R.flushNeeded();}}

    @Test public void connectWithUrl() throws MalformedURLException {__CLR4_2_0888888lnxz22wk.R.globalSliceStart(getClass().getName(),10761);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0azsqvu8ax();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0888888lnxz22wk.R.rethrow($CLV_t2$);}finally{__CLR4_2_0888888lnxz22wk.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.connectWithUrl",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10761,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0azsqvu8ax() throws MalformedURLException{try{__CLR4_2_0888888lnxz22wk.R.inc(10761);
        __CLR4_2_0888888lnxz22wk.R.inc(10762);Connection con = HttpConnection.connect(new URL("http://example.com"));
        __CLR4_2_0888888lnxz22wk.R.inc(10763);assertEquals("http://example.com", con.request().url().toExternalForm());
    }finally{__CLR4_2_0888888lnxz22wk.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class) public void throwsOnMalformedUrl() {__CLR4_2_0888888lnxz22wk.R.globalSliceStart(getClass().getName(),10764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0v5lctj8b0();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,104,114,111,119,115,79,110,77,97,108,102,111,114,109,101,100,85,114,108,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0888888lnxz22wk.R.rethrow($CLV_t2$);}finally{__CLR4_2_0888888lnxz22wk.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.throwsOnMalformedUrl",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10764,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0v5lctj8b0(){try{__CLR4_2_0888888lnxz22wk.R.inc(10764);
        __CLR4_2_0888888lnxz22wk.R.inc(10765);Connection con = HttpConnection.connect("bzzt");
    }finally{__CLR4_2_0888888lnxz22wk.R.flushNeeded();}}

    @Test public void userAgent() {__CLR4_2_0888888lnxz22wk.R.globalSliceStart(getClass().getName(),10766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_069v5kx8b2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0888888lnxz22wk.R.rethrow($CLV_t2$);}finally{__CLR4_2_0888888lnxz22wk.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.userAgent",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10766,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_069v5kx8b2(){try{__CLR4_2_0888888lnxz22wk.R.inc(10766);
        __CLR4_2_0888888lnxz22wk.R.inc(10767);Connection con = HttpConnection.connect("http://example.com/");
        __CLR4_2_0888888lnxz22wk.R.inc(10768);assertEquals(HttpConnection.DEFAULT_UA, con.request().header("User-Agent"));
        __CLR4_2_0888888lnxz22wk.R.inc(10769);con.userAgent("Mozilla");
        __CLR4_2_0888888lnxz22wk.R.inc(10770);assertEquals("Mozilla", con.request().header("User-Agent"));
    }finally{__CLR4_2_0888888lnxz22wk.R.flushNeeded();}}

    @Test public void timeout() {__CLR4_2_0888888lnxz22wk.R.globalSliceStart(getClass().getName(),10771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0fyn4oo8b7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0888888lnxz22wk.R.rethrow($CLV_t2$);}finally{__CLR4_2_0888888lnxz22wk.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.timeout",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10771,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0fyn4oo8b7(){try{__CLR4_2_0888888lnxz22wk.R.inc(10771);
        __CLR4_2_0888888lnxz22wk.R.inc(10772);Connection con = HttpConnection.connect("http://example.com/");
        __CLR4_2_0888888lnxz22wk.R.inc(10773);assertEquals(30 * 1000, con.request().timeout());
        __CLR4_2_0888888lnxz22wk.R.inc(10774);con.timeout(1000);
        __CLR4_2_0888888lnxz22wk.R.inc(10775);assertEquals(1000, con.request().timeout());
    }finally{__CLR4_2_0888888lnxz22wk.R.flushNeeded();}}

    @Test public void referrer() {__CLR4_2_0888888lnxz22wk.R.globalSliceStart(getClass().getName(),10776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0dviiyu8bc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0888888lnxz22wk.R.rethrow($CLV_t2$);}finally{__CLR4_2_0888888lnxz22wk.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.referrer",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10776,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0dviiyu8bc(){try{__CLR4_2_0888888lnxz22wk.R.inc(10776);
        __CLR4_2_0888888lnxz22wk.R.inc(10777);Connection con = HttpConnection.connect("http://example.com/");
        __CLR4_2_0888888lnxz22wk.R.inc(10778);con.referrer("http://foo.com");
        __CLR4_2_0888888lnxz22wk.R.inc(10779);assertEquals("http://foo.com", con.request().header("Referer"));
    }finally{__CLR4_2_0888888lnxz22wk.R.flushNeeded();}}

    @Test public void method() {__CLR4_2_0888888lnxz22wk.R.globalSliceStart(getClass().getName(),10780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0q0y12w8bg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0888888lnxz22wk.R.rethrow($CLV_t2$);}finally{__CLR4_2_0888888lnxz22wk.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.method",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10780,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0q0y12w8bg(){try{__CLR4_2_0888888lnxz22wk.R.inc(10780);
        __CLR4_2_0888888lnxz22wk.R.inc(10781);Connection con = HttpConnection.connect("http://example.com/");
        __CLR4_2_0888888lnxz22wk.R.inc(10782);assertEquals(Connection.Method.GET, con.request().method());
        __CLR4_2_0888888lnxz22wk.R.inc(10783);con.method(Connection.Method.POST);
        __CLR4_2_0888888lnxz22wk.R.inc(10784);assertEquals(Connection.Method.POST, con.request().method());
    }finally{__CLR4_2_0888888lnxz22wk.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class) public void throwsOnOddData() {__CLR4_2_0888888lnxz22wk.R.globalSliceStart(getClass().getName(),10785);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_094tuvg8bl();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,104,114,111,119,115,79,110,79,100,100,68,97,116,97,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0888888lnxz22wk.R.rethrow($CLV_t2$);}finally{__CLR4_2_0888888lnxz22wk.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.throwsOnOddData",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10785,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_094tuvg8bl(){try{__CLR4_2_0888888lnxz22wk.R.inc(10785);
        __CLR4_2_0888888lnxz22wk.R.inc(10786);Connection con = HttpConnection.connect("http://example.com/");
        __CLR4_2_0888888lnxz22wk.R.inc(10787);con.data("Name", "val", "what");
    }finally{__CLR4_2_0888888lnxz22wk.R.flushNeeded();}}

    @Test public void data() {__CLR4_2_0888888lnxz22wk.R.globalSliceStart(getClass().getName(),10788);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_05ffhrl8bo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0888888lnxz22wk.R.rethrow($CLV_t2$);}finally{__CLR4_2_0888888lnxz22wk.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.data",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10788,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_05ffhrl8bo(){try{__CLR4_2_0888888lnxz22wk.R.inc(10788);
        __CLR4_2_0888888lnxz22wk.R.inc(10789);Connection con = HttpConnection.connect("http://example.com/");
        __CLR4_2_0888888lnxz22wk.R.inc(10790);con.data("Name", "Val", "Foo", "bar");
        __CLR4_2_0888888lnxz22wk.R.inc(10791);Collection<Connection.KeyVal> values = con.request().data();
        __CLR4_2_0888888lnxz22wk.R.inc(10792);Object[] data =  values.toArray();
        __CLR4_2_0888888lnxz22wk.R.inc(10793);Connection.KeyVal one = (Connection.KeyVal) data[0];
        __CLR4_2_0888888lnxz22wk.R.inc(10794);Connection.KeyVal two = (Connection.KeyVal) data[1];
        __CLR4_2_0888888lnxz22wk.R.inc(10795);assertEquals("Name", one.key());
        __CLR4_2_0888888lnxz22wk.R.inc(10796);assertEquals("Val", one.value());
        __CLR4_2_0888888lnxz22wk.R.inc(10797);assertEquals("Foo", two.key());
        __CLR4_2_0888888lnxz22wk.R.inc(10798);assertEquals("bar", two.value());
    }finally{__CLR4_2_0888888lnxz22wk.R.flushNeeded();}}

    @Test public void cookie() {__CLR4_2_0888888lnxz22wk.R.globalSliceStart(getClass().getName(),10799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0u5cld78bz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0888888lnxz22wk.R.rethrow($CLV_t2$);}finally{__CLR4_2_0888888lnxz22wk.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.cookie",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10799,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0u5cld78bz(){try{__CLR4_2_0888888lnxz22wk.R.inc(10799);
        __CLR4_2_0888888lnxz22wk.R.inc(10800);Connection con = HttpConnection.connect("http://example.com/");
        __CLR4_2_0888888lnxz22wk.R.inc(10801);con.cookie("Name", "Val");
        __CLR4_2_0888888lnxz22wk.R.inc(10802);assertEquals("Val", con.request().cookie("Name"));
    }finally{__CLR4_2_0888888lnxz22wk.R.flushNeeded();}}

    @Test public void inputStream() {__CLR4_2_0888888lnxz22wk.R.globalSliceStart(getClass().getName(),10803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0tv19fz8c3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0888888lnxz22wk.R.rethrow($CLV_t2$);}finally{__CLR4_2_0888888lnxz22wk.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.inputStream",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10803,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0tv19fz8c3(){try{__CLR4_2_0888888lnxz22wk.R.inc(10803);
        __CLR4_2_0888888lnxz22wk.R.inc(10804);Connection.KeyVal kv = HttpConnection.KeyVal.create("file", "thumb.jpg", ParseTest.inputStreamFrom("Check"));
        __CLR4_2_0888888lnxz22wk.R.inc(10805);assertEquals("file", kv.key());
        __CLR4_2_0888888lnxz22wk.R.inc(10806);assertEquals("thumb.jpg", kv.value());
        __CLR4_2_0888888lnxz22wk.R.inc(10807);assertTrue(kv.hasInputStream());

        __CLR4_2_0888888lnxz22wk.R.inc(10808);kv = HttpConnection.KeyVal.create("one", "two");
        __CLR4_2_0888888lnxz22wk.R.inc(10809);assertEquals("one", kv.key());
        __CLR4_2_0888888lnxz22wk.R.inc(10810);assertEquals("two", kv.value());
        __CLR4_2_0888888lnxz22wk.R.inc(10811);assertFalse(kv.hasInputStream());
    }finally{__CLR4_2_0888888lnxz22wk.R.flushNeeded();}}

    @Test public void requestBody() {__CLR4_2_0888888lnxz22wk.R.globalSliceStart(getClass().getName(),10812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_07ozvug8cc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0888888lnxz22wk.R.rethrow($CLV_t2$);}finally{__CLR4_2_0888888lnxz22wk.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.requestBody",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10812,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_07ozvug8cc(){try{__CLR4_2_0888888lnxz22wk.R.inc(10812);
        __CLR4_2_0888888lnxz22wk.R.inc(10813);Connection con = HttpConnection.connect("http://example.com/");
        __CLR4_2_0888888lnxz22wk.R.inc(10814);con.requestBody("foo");
        __CLR4_2_0888888lnxz22wk.R.inc(10815);assertEquals("foo", con.request().requestBody());
    }finally{__CLR4_2_0888888lnxz22wk.R.flushNeeded();}}

    @Test public void encodeUrl() throws MalformedURLException {__CLR4_2_0888888lnxz22wk.R.globalSliceStart(getClass().getName(),10816);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0wxtkkg8cg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0888888lnxz22wk.R.rethrow($CLV_t2$);}finally{__CLR4_2_0888888lnxz22wk.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.encodeUrl",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10816,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0wxtkkg8cg() throws MalformedURLException{try{__CLR4_2_0888888lnxz22wk.R.inc(10816);
        __CLR4_2_0888888lnxz22wk.R.inc(10817);URL url1 = new URL("http://test.com/?q=white space");
        __CLR4_2_0888888lnxz22wk.R.inc(10818);URL url2 = HttpConnection.encodeUrl(url1);
        __CLR4_2_0888888lnxz22wk.R.inc(10819);assertEquals("http://test.com/?q=white%20space", url2.toExternalForm());
    }finally{__CLR4_2_0888888lnxz22wk.R.flushNeeded();}}

    @Test public void noUrlThrowsValidationError() throws IOException {__CLR4_2_0888888lnxz22wk.R.globalSliceStart(getClass().getName(),10820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0qslkl78ck();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0888888lnxz22wk.R.rethrow($CLV_t2$);}finally{__CLR4_2_0888888lnxz22wk.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.noUrlThrowsValidationError",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10820,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0qslkl78ck() throws IOException{try{__CLR4_2_0888888lnxz22wk.R.inc(10820);
        __CLR4_2_0888888lnxz22wk.R.inc(10821);HttpConnection con = new HttpConnection();
        __CLR4_2_0888888lnxz22wk.R.inc(10822);boolean threw = false;
        __CLR4_2_0888888lnxz22wk.R.inc(10823);try {
            __CLR4_2_0888888lnxz22wk.R.inc(10824);con.execute();
        } catch (IllegalArgumentException e) {
            __CLR4_2_0888888lnxz22wk.R.inc(10825);threw = true;
            __CLR4_2_0888888lnxz22wk.R.inc(10826);assertEquals("URL must be specified to connect", e.getMessage());
        }
        __CLR4_2_0888888lnxz22wk.R.inc(10827);assertTrue(threw);
    }finally{__CLR4_2_0888888lnxz22wk.R.flushNeeded();}}

    @Test public void handlesHeaderEncodingOnRequest() {__CLR4_2_0888888lnxz22wk.R.globalSliceStart(getClass().getName(),10828);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_01w831o8cs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0888888lnxz22wk.R.rethrow($CLV_t2$);}finally{__CLR4_2_0888888lnxz22wk.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.handlesHeaderEncodingOnRequest",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),10828,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_01w831o8cs(){try{__CLR4_2_0888888lnxz22wk.R.inc(10828);
        __CLR4_2_0888888lnxz22wk.R.inc(10829);Connection.Request req = new HttpConnection.Request();
        __CLR4_2_0888888lnxz22wk.R.inc(10830);req.addHeader("xxx", "\u00e9");
    }finally{__CLR4_2_0888888lnxz22wk.R.flushNeeded();}}
}
