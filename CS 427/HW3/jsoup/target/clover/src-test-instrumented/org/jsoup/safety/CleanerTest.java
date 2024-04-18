/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.safety;

import org.jsoup.MultiLocaleRule;
import org.jsoup.MultiLocaleRule.MultiLocaleTest;
import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Entities;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 Tests for the cleaner.

 @author Jonathan Hedley, jonathan@hedley.net */
public class CleanerTest {static class __CLR4_2_0gqzgqzlnxz239l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767707166L,8589935092L,21889,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Rule public MultiLocaleRule rule = new MultiLocaleRule();

    @Test public void simpleBehaviourTest() {__CLR4_2_0gqzgqzlnxz239l.R.globalSliceStart(getClass().getName(),21707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0sud43ggqz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gqzgqzlnxz239l.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gqzgqzlnxz239l.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.simpleBehaviourTest",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21707,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0sud43ggqz(){try{__CLR4_2_0gqzgqzlnxz239l.R.inc(21707);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21708);String h = "<div><p class=foo><a href='http://evil.com'>Hello <b id=bar>there</b>!</a></div>";
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21709);String cleanHtml = Jsoup.clean(h, Whitelist.simpleText());

        __CLR4_2_0gqzgqzlnxz239l.R.inc(21710);assertEquals("Hello <b>there</b>!", TextUtil.stripNewlines(cleanHtml));
    }finally{__CLR4_2_0gqzgqzlnxz239l.R.flushNeeded();}}
    
    @Test public void simpleBehaviourTest2() {__CLR4_2_0gqzgqzlnxz239l.R.globalSliceStart(getClass().getName(),21711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_010idcsgr3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gqzgqzlnxz239l.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gqzgqzlnxz239l.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.simpleBehaviourTest2",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21711,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_010idcsgr3(){try{__CLR4_2_0gqzgqzlnxz239l.R.inc(21711);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21712);String h = "Hello <b>there</b>!";
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21713);String cleanHtml = Jsoup.clean(h, Whitelist.simpleText());

        __CLR4_2_0gqzgqzlnxz239l.R.inc(21714);assertEquals("Hello <b>there</b>!", TextUtil.stripNewlines(cleanHtml));
    }finally{__CLR4_2_0gqzgqzlnxz239l.R.flushNeeded();}}

    @Test public void basicBehaviourTest() {__CLR4_2_0gqzgqzlnxz239l.R.globalSliceStart(getClass().getName(),21715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0t6phfsgr7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gqzgqzlnxz239l.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gqzgqzlnxz239l.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.basicBehaviourTest",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21715,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0t6phfsgr7(){try{__CLR4_2_0gqzgqzlnxz239l.R.inc(21715);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21716);String h = "<div><p><a href='javascript:sendAllMoney()'>Dodgy</a> <A HREF='HTTP://nice.com'>Nice</a></p><blockquote>Hello</blockquote>";
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21717);String cleanHtml = Jsoup.clean(h, Whitelist.basic());

        __CLR4_2_0gqzgqzlnxz239l.R.inc(21718);assertEquals("<p><a rel=\"nofollow\">Dodgy</a> <a href=\"http://nice.com\" rel=\"nofollow\">Nice</a></p><blockquote>Hello</blockquote>",
                TextUtil.stripNewlines(cleanHtml));
    }finally{__CLR4_2_0gqzgqzlnxz239l.R.flushNeeded();}}
    
    @Test public void basicWithImagesTest() {__CLR4_2_0gqzgqzlnxz239l.R.globalSliceStart(getClass().getName(),21719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_094zd2dgrb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gqzgqzlnxz239l.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gqzgqzlnxz239l.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.basicWithImagesTest",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21719,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_094zd2dgrb(){try{__CLR4_2_0gqzgqzlnxz239l.R.inc(21719);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21720);String h = "<div><p><img src='http://example.com/' alt=Image></p><p><img src='ftp://ftp.example.com'></p></div>";
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21721);String cleanHtml = Jsoup.clean(h, Whitelist.basicWithImages());
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21722);assertEquals("<p><img src=\"http://example.com/\" alt=\"Image\"></p><p><img></p>", TextUtil.stripNewlines(cleanHtml));
    }finally{__CLR4_2_0gqzgqzlnxz239l.R.flushNeeded();}}
    
    @Test public void testRelaxed() {__CLR4_2_0gqzgqzlnxz239l.R.globalSliceStart(getClass().getName(),21723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_06vdq04grf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gqzgqzlnxz239l.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gqzgqzlnxz239l.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.testRelaxed",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21723,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_06vdq04grf(){try{__CLR4_2_0gqzgqzlnxz239l.R.inc(21723);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21724);String h = "<h1>Head</h1><table><tr><td>One<td>Two</td></tr></table>";
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21725);String cleanHtml = Jsoup.clean(h, Whitelist.relaxed());
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21726);assertEquals("<h1>Head</h1><table><tbody><tr><td>One</td><td>Two</td></tr></tbody></table>", TextUtil.stripNewlines(cleanHtml));
    }finally{__CLR4_2_0gqzgqzlnxz239l.R.flushNeeded();}}

    @Test public void testRemoveTags() {__CLR4_2_0gqzgqzlnxz239l.R.globalSliceStart(getClass().getName(),21727);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_03q148agrj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gqzgqzlnxz239l.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gqzgqzlnxz239l.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.testRemoveTags",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21727,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_03q148agrj(){try{__CLR4_2_0gqzgqzlnxz239l.R.inc(21727);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21728);String h = "<div><p><A HREF='HTTP://nice.com'>Nice</a></p><blockquote>Hello</blockquote>";
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21729);String cleanHtml = Jsoup.clean(h, Whitelist.basic().removeTags("a"));

        __CLR4_2_0gqzgqzlnxz239l.R.inc(21730);assertEquals("<p>Nice</p><blockquote>Hello</blockquote>", TextUtil.stripNewlines(cleanHtml));
    }finally{__CLR4_2_0gqzgqzlnxz239l.R.flushNeeded();}}

    @Test public void testRemoveAttributes() {__CLR4_2_0gqzgqzlnxz239l.R.globalSliceStart(getClass().getName(),21731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0tb1cnogrn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gqzgqzlnxz239l.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gqzgqzlnxz239l.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.testRemoveAttributes",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21731,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0tb1cnogrn(){try{__CLR4_2_0gqzgqzlnxz239l.R.inc(21731);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21732);String h = "<div><p>Nice</p><blockquote cite='http://example.com/quotations'>Hello</blockquote>";
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21733);String cleanHtml = Jsoup.clean(h, Whitelist.basic().removeAttributes("blockquote", "cite"));

        __CLR4_2_0gqzgqzlnxz239l.R.inc(21734);assertEquals("<p>Nice</p><blockquote>Hello</blockquote>", TextUtil.stripNewlines(cleanHtml));
    }finally{__CLR4_2_0gqzgqzlnxz239l.R.flushNeeded();}}

    @Test public void testRemoveEnforcedAttributes() {__CLR4_2_0gqzgqzlnxz239l.R.globalSliceStart(getClass().getName(),21735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_031gfpmgrr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gqzgqzlnxz239l.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gqzgqzlnxz239l.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.testRemoveEnforcedAttributes",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21735,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_031gfpmgrr(){try{__CLR4_2_0gqzgqzlnxz239l.R.inc(21735);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21736);String h = "<div><p><A HREF='HTTP://nice.com'>Nice</a></p><blockquote>Hello</blockquote>";
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21737);String cleanHtml = Jsoup.clean(h, Whitelist.basic().removeEnforcedAttribute("a", "rel"));

        __CLR4_2_0gqzgqzlnxz239l.R.inc(21738);assertEquals("<p><a href=\"http://nice.com\">Nice</a></p><blockquote>Hello</blockquote>",
                TextUtil.stripNewlines(cleanHtml));
    }finally{__CLR4_2_0gqzgqzlnxz239l.R.flushNeeded();}}

    @Test public void testRemoveProtocols() {__CLR4_2_0gqzgqzlnxz239l.R.globalSliceStart(getClass().getName(),21739);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0b2qo30grv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gqzgqzlnxz239l.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gqzgqzlnxz239l.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.testRemoveProtocols",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21739,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0b2qo30grv(){try{__CLR4_2_0gqzgqzlnxz239l.R.inc(21739);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21740);String h = "<p>Contact me <a href='mailto:info@example.com'>here</a></p>";
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21741);String cleanHtml = Jsoup.clean(h, Whitelist.basic().removeProtocols("a", "href", "ftp", "mailto"));

        __CLR4_2_0gqzgqzlnxz239l.R.inc(21742);assertEquals("<p>Contact me <a rel=\"nofollow\">here</a></p>",
                TextUtil.stripNewlines(cleanHtml));
    }finally{__CLR4_2_0gqzgqzlnxz239l.R.flushNeeded();}}

    @Test @MultiLocaleTest public void whitelistedProtocolShouldBeRetained() {__CLR4_2_0gqzgqzlnxz239l.R.globalSliceStart(getClass().getName(),21743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_046do0xgrz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gqzgqzlnxz239l.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gqzgqzlnxz239l.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.whitelistedProtocolShouldBeRetained",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21743,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_046do0xgrz(){try{__CLR4_2_0gqzgqzlnxz239l.R.inc(21743);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21744);Whitelist whitelist = Whitelist.none()
                .addTags("a")
                .addAttributes("a", "href")
                .addProtocols("a", "href", "something");

        __CLR4_2_0gqzgqzlnxz239l.R.inc(21745);String cleanHtml = Jsoup.clean("<a href=\"SOMETHING://x\"></a>", whitelist);

        __CLR4_2_0gqzgqzlnxz239l.R.inc(21746);assertEquals("<a href=\"SOMETHING://x\"></a>", TextUtil.stripNewlines(cleanHtml));
    }finally{__CLR4_2_0gqzgqzlnxz239l.R.flushNeeded();}}

    @Test public void testDropComments() {__CLR4_2_0gqzgqzlnxz239l.R.globalSliceStart(getClass().getName(),21747);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_036jr1ggs3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gqzgqzlnxz239l.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gqzgqzlnxz239l.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.testDropComments",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21747,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_036jr1ggs3(){try{__CLR4_2_0gqzgqzlnxz239l.R.inc(21747);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21748);String h = "<p>Hello<!-- no --></p>";
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21749);String cleanHtml = Jsoup.clean(h, Whitelist.relaxed());
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21750);assertEquals("<p>Hello</p>", cleanHtml);
    }finally{__CLR4_2_0gqzgqzlnxz239l.R.flushNeeded();}}
    
    @Test public void testDropXmlProc() {__CLR4_2_0gqzgqzlnxz239l.R.globalSliceStart(getClass().getName(),21751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_08ovkelgs7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gqzgqzlnxz239l.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gqzgqzlnxz239l.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.testDropXmlProc",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21751,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_08ovkelgs7(){try{__CLR4_2_0gqzgqzlnxz239l.R.inc(21751);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21752);String h = "<?import namespace=\"xss\"><p>Hello</p>";
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21753);String cleanHtml = Jsoup.clean(h, Whitelist.relaxed());
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21754);assertEquals("<p>Hello</p>", cleanHtml);
    }finally{__CLR4_2_0gqzgqzlnxz239l.R.flushNeeded();}}
    
    @Test public void testDropScript() {__CLR4_2_0gqzgqzlnxz239l.R.globalSliceStart(getClass().getName(),21755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0qdumqbgsb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gqzgqzlnxz239l.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gqzgqzlnxz239l.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.testDropScript",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21755,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0qdumqbgsb(){try{__CLR4_2_0gqzgqzlnxz239l.R.inc(21755);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21756);String h = "<SCRIPT SRC=//ha.ckers.org/.j><SCRIPT>alert(/XSS/.source)</SCRIPT>";
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21757);String cleanHtml = Jsoup.clean(h, Whitelist.relaxed());
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21758);assertEquals("", cleanHtml);
    }finally{__CLR4_2_0gqzgqzlnxz239l.R.flushNeeded();}}
    
    @Test public void testDropImageScript() {__CLR4_2_0gqzgqzlnxz239l.R.globalSliceStart(getClass().getName(),21759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0mv8tkkgsf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gqzgqzlnxz239l.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gqzgqzlnxz239l.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.testDropImageScript",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21759,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0mv8tkkgsf(){try{__CLR4_2_0gqzgqzlnxz239l.R.inc(21759);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21760);String h = "<IMG SRC=\"javascript:alert('XSS')\">";
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21761);String cleanHtml = Jsoup.clean(h, Whitelist.relaxed());
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21762);assertEquals("<img>", cleanHtml);
    }finally{__CLR4_2_0gqzgqzlnxz239l.R.flushNeeded();}}
    
    @Test public void testCleanJavascriptHref() {__CLR4_2_0gqzgqzlnxz239l.R.globalSliceStart(getClass().getName(),21763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0cp8wiygsj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gqzgqzlnxz239l.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gqzgqzlnxz239l.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.testCleanJavascriptHref",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21763,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0cp8wiygsj(){try{__CLR4_2_0gqzgqzlnxz239l.R.inc(21763);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21764);String h = "<A HREF=\"javascript:document.location='http://www.google.com/'\">XSS</A>";
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21765);String cleanHtml = Jsoup.clean(h, Whitelist.relaxed());
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21766);assertEquals("<a>XSS</a>", cleanHtml);
    }finally{__CLR4_2_0gqzgqzlnxz239l.R.flushNeeded();}}

    @Test public void testCleanAnchorProtocol() {__CLR4_2_0gqzgqzlnxz239l.R.globalSliceStart(getClass().getName(),21767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0s7uh3pgsn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gqzgqzlnxz239l.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gqzgqzlnxz239l.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.testCleanAnchorProtocol",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21767,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0s7uh3pgsn(){try{__CLR4_2_0gqzgqzlnxz239l.R.inc(21767);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21768);String validAnchor = "<a href=\"#valid\">Valid anchor</a>";
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21769);String invalidAnchor = "<a href=\"#anchor with spaces\">Invalid anchor</a>";

        // A Whitelist that does not allow anchors will strip them out.
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21770);String cleanHtml = Jsoup.clean(validAnchor, Whitelist.relaxed());
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21771);assertEquals("<a>Valid anchor</a>", cleanHtml);

        __CLR4_2_0gqzgqzlnxz239l.R.inc(21772);cleanHtml = Jsoup.clean(invalidAnchor, Whitelist.relaxed());
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21773);assertEquals("<a>Invalid anchor</a>", cleanHtml);

        // A Whitelist that allows them will keep them.
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21774);Whitelist relaxedWithAnchor = Whitelist.relaxed().addProtocols("a", "href", "#");

        __CLR4_2_0gqzgqzlnxz239l.R.inc(21775);cleanHtml = Jsoup.clean(validAnchor, relaxedWithAnchor);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21776);assertEquals(validAnchor, cleanHtml);

        // An invalid anchor is never valid.
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21777);cleanHtml = Jsoup.clean(invalidAnchor, relaxedWithAnchor);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21778);assertEquals("<a>Invalid anchor</a>", cleanHtml);
    }finally{__CLR4_2_0gqzgqzlnxz239l.R.flushNeeded();}}

    @Test public void testDropsUnknownTags() {__CLR4_2_0gqzgqzlnxz239l.R.globalSliceStart(getClass().getName(),21779);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0lwjyhkgsz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gqzgqzlnxz239l.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gqzgqzlnxz239l.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.testDropsUnknownTags",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21779,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0lwjyhkgsz(){try{__CLR4_2_0gqzgqzlnxz239l.R.inc(21779);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21780);String h = "<p><custom foo=true>Test</custom></p>";
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21781);String cleanHtml = Jsoup.clean(h, Whitelist.relaxed());
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21782);assertEquals("<p>Test</p>", cleanHtml);
    }finally{__CLR4_2_0gqzgqzlnxz239l.R.flushNeeded();}}
    
    @Test public void testHandlesEmptyAttributes() {__CLR4_2_0gqzgqzlnxz239l.R.globalSliceStart(getClass().getName(),21783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0bf46y6gt3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gqzgqzlnxz239l.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gqzgqzlnxz239l.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.testHandlesEmptyAttributes",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21783,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0bf46y6gt3(){try{__CLR4_2_0gqzgqzlnxz239l.R.inc(21783);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21784);String h = "<img alt=\"\" src= unknown=''>";
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21785);String cleanHtml = Jsoup.clean(h, Whitelist.basicWithImages());
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21786);assertEquals("<img alt=\"\">", cleanHtml);
    }finally{__CLR4_2_0gqzgqzlnxz239l.R.flushNeeded();}}

    @Test public void testIsValidBodyHtml() {__CLR4_2_0gqzgqzlnxz239l.R.globalSliceStart(getClass().getName(),21787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0gg0bw4gt7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gqzgqzlnxz239l.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gqzgqzlnxz239l.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.testIsValidBodyHtml",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21787,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0gg0bw4gt7(){try{__CLR4_2_0gqzgqzlnxz239l.R.inc(21787);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21788);String ok = "<p>Test <b><a href='http://example.com/' rel='nofollow'>OK</a></b></p>";
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21789);String ok1 = "<p>Test <b><a href='http://example.com/'>OK</a></b></p>"; // missing enforced is OK because still needs run thru cleaner
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21790);String nok1 = "<p><script></script>Not <b>OK</b></p>";
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21791);String nok2 = "<p align=right>Test Not <b>OK</b></p>";
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21792);String nok3 = "<!-- comment --><p>Not OK</p>"; // comments and the like will be cleaned
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21793);String nok4 = "<html><head>Foo</head><body><b>OK</b></body></html>"; // not body html
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21794);String nok5 = "<p>Test <b><a href='http://example.com/' rel='nofollowme'>OK</a></b></p>";
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21795);String nok6 = "<p>Test <b><a href='http://example.com/'>OK</b></p>"; // missing close tag
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21796);String nok7 = "</div>What";
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21797);assertTrue(Jsoup.isValid(ok, Whitelist.basic()));
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21798);assertTrue(Jsoup.isValid(ok1, Whitelist.basic()));
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21799);assertFalse(Jsoup.isValid(nok1, Whitelist.basic()));
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21800);assertFalse(Jsoup.isValid(nok2, Whitelist.basic()));
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21801);assertFalse(Jsoup.isValid(nok3, Whitelist.basic()));
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21802);assertFalse(Jsoup.isValid(nok4, Whitelist.basic()));
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21803);assertFalse(Jsoup.isValid(nok5, Whitelist.basic()));
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21804);assertFalse(Jsoup.isValid(nok6, Whitelist.basic()));
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21805);assertFalse(Jsoup.isValid(ok, Whitelist.none()));
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21806);assertFalse(Jsoup.isValid(nok7, Whitelist.basic()));
    }finally{__CLR4_2_0gqzgqzlnxz239l.R.flushNeeded();}}

    @Test public void testIsValidDocument() {__CLR4_2_0gqzgqzlnxz239l.R.globalSliceStart(getClass().getName(),21807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0hcrbxegtr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gqzgqzlnxz239l.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gqzgqzlnxz239l.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.testIsValidDocument",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21807,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0hcrbxegtr(){try{__CLR4_2_0gqzgqzlnxz239l.R.inc(21807);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21808);String ok = "<html><head></head><body><p>Hello</p></body><html>";
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21809);String nok = "<html><head><script>woops</script><title>Hello</title></head><body><p>Hello</p></body><html>";

        __CLR4_2_0gqzgqzlnxz239l.R.inc(21810);Whitelist relaxed = Whitelist.relaxed();
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21811);Cleaner cleaner = new Cleaner(relaxed);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21812);Document okDoc = Jsoup.parse(ok);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21813);assertTrue(cleaner.isValid(okDoc));
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21814);assertFalse(cleaner.isValid(Jsoup.parse(nok)));
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21815);assertFalse(new Cleaner(Whitelist.none()).isValid(okDoc));
    }finally{__CLR4_2_0gqzgqzlnxz239l.R.flushNeeded();}}
    
    @Test public void resolvesRelativeLinks() {__CLR4_2_0gqzgqzlnxz239l.R.globalSliceStart(getClass().getName(),21816);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0oxs3cjgu0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gqzgqzlnxz239l.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gqzgqzlnxz239l.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.resolvesRelativeLinks",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21816,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0oxs3cjgu0(){try{__CLR4_2_0gqzgqzlnxz239l.R.inc(21816);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21817);String html = "<a href='/foo'>Link</a><img src='/bar'>";
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21818);String clean = Jsoup.clean(html, "http://example.com/", Whitelist.basicWithImages());
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21819);assertEquals("<a href=\"http://example.com/foo\" rel=\"nofollow\">Link</a>\n<img src=\"http://example.com/bar\">", clean);
    }finally{__CLR4_2_0gqzgqzlnxz239l.R.flushNeeded();}}

    @Test public void preservesRelativeLinksIfConfigured() {__CLR4_2_0gqzgqzlnxz239l.R.globalSliceStart(getClass().getName(),21820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0voaoo8gu4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gqzgqzlnxz239l.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gqzgqzlnxz239l.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.preservesRelativeLinksIfConfigured",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21820,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0voaoo8gu4(){try{__CLR4_2_0gqzgqzlnxz239l.R.inc(21820);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21821);String html = "<a href='/foo'>Link</a><img src='/bar'> <img src='javascript:alert()'>";
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21822);String clean = Jsoup.clean(html, "http://example.com/", Whitelist.basicWithImages().preserveRelativeLinks(true));
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21823);assertEquals("<a href=\"/foo\" rel=\"nofollow\">Link</a>\n<img src=\"/bar\"> \n<img>", clean);
    }finally{__CLR4_2_0gqzgqzlnxz239l.R.flushNeeded();}}
    
    @Test public void dropsUnresolvableRelativeLinks() {__CLR4_2_0gqzgqzlnxz239l.R.globalSliceStart(getClass().getName(),21824);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_05j1cakgu8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gqzgqzlnxz239l.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gqzgqzlnxz239l.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.dropsUnresolvableRelativeLinks",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21824,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_05j1cakgu8(){try{__CLR4_2_0gqzgqzlnxz239l.R.inc(21824);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21825);String html = "<a href='/foo'>Link</a>";
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21826);String clean = Jsoup.clean(html, Whitelist.basic());
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21827);assertEquals("<a rel=\"nofollow\">Link</a>", clean);
    }finally{__CLR4_2_0gqzgqzlnxz239l.R.flushNeeded();}}

    @Test public void handlesCustomProtocols() {__CLR4_2_0gqzgqzlnxz239l.R.globalSliceStart(getClass().getName(),21828);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0rvqzgmguc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gqzgqzlnxz239l.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gqzgqzlnxz239l.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.handlesCustomProtocols",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21828,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0rvqzgmguc(){try{__CLR4_2_0gqzgqzlnxz239l.R.inc(21828);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21829);String html = "<img src='cid:12345' /> <img src='data:gzzt' />";
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21830);String dropped = Jsoup.clean(html, Whitelist.basicWithImages());
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21831);assertEquals("<img> \n<img>", dropped);

        __CLR4_2_0gqzgqzlnxz239l.R.inc(21832);String preserved = Jsoup.clean(html, Whitelist.basicWithImages().addProtocols("img", "src", "cid", "data"));
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21833);assertEquals("<img src=\"cid:12345\"> \n<img src=\"data:gzzt\">", preserved);
    }finally{__CLR4_2_0gqzgqzlnxz239l.R.flushNeeded();}}

    @Test public void handlesAllPseudoTag() {__CLR4_2_0gqzgqzlnxz239l.R.globalSliceStart(getClass().getName(),21834);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_06h01mbgui();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gqzgqzlnxz239l.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gqzgqzlnxz239l.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.handlesAllPseudoTag",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21834,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_06h01mbgui(){try{__CLR4_2_0gqzgqzlnxz239l.R.inc(21834);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21835);String html = "<p class='foo' src='bar'><a class='qux'>link</a></p>";
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21836);Whitelist whitelist = new Whitelist()
                .addAttributes(":all", "class")
                .addAttributes("p", "style")
                .addTags("p", "a");

        __CLR4_2_0gqzgqzlnxz239l.R.inc(21837);String clean = Jsoup.clean(html, whitelist);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21838);assertEquals("<p class=\"foo\"><a class=\"qux\">link</a></p>", clean);
    }finally{__CLR4_2_0gqzgqzlnxz239l.R.flushNeeded();}}

    @Test public void addsTagOnAttributesIfNotSet() {__CLR4_2_0gqzgqzlnxz239l.R.globalSliceStart(getClass().getName(),21839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0o1a5lbgun();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gqzgqzlnxz239l.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gqzgqzlnxz239l.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.addsTagOnAttributesIfNotSet",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21839,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0o1a5lbgun(){try{__CLR4_2_0gqzgqzlnxz239l.R.inc(21839);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21840);String html = "<p class='foo' src='bar'>One</p>";
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21841);Whitelist whitelist = new Whitelist()
            .addAttributes("p", "class");
        // ^^ whitelist does not have explicit tag add for p, inferred from add attributes.
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21842);String clean = Jsoup.clean(html, whitelist);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21843);assertEquals("<p class=\"foo\">One</p>", clean);
    }finally{__CLR4_2_0gqzgqzlnxz239l.R.flushNeeded();}}

    @Test public void supplyOutputSettings() {__CLR4_2_0gqzgqzlnxz239l.R.globalSliceStart(getClass().getName(),21844);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ne1q0qgus();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gqzgqzlnxz239l.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gqzgqzlnxz239l.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.supplyOutputSettings",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21844,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ne1q0qgus(){try{__CLR4_2_0gqzgqzlnxz239l.R.inc(21844);
        // test that one can override the default document output settings
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21845);Document.OutputSettings os = new Document.OutputSettings();
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21846);os.prettyPrint(false);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21847);os.escapeMode(Entities.EscapeMode.extended);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21848);os.charset("ascii");

        __CLR4_2_0gqzgqzlnxz239l.R.inc(21849);String html = "<div><p>&bernou;</p></div>";
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21850);String customOut = Jsoup.clean(html, "http://foo.com/", Whitelist.relaxed(), os);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21851);String defaultOut = Jsoup.clean(html, "http://foo.com/", Whitelist.relaxed());
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21852);assertNotSame(defaultOut, customOut);

        __CLR4_2_0gqzgqzlnxz239l.R.inc(21853);assertEquals("<div><p>&Bscr;</p></div>", customOut); // entities now prefers shorted names if aliased
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21854);assertEquals("<div>\n" +
            " <p>\u212c</p>\n" +
            "</div>", defaultOut);

        __CLR4_2_0gqzgqzlnxz239l.R.inc(21855);os.charset("ASCII");
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21856);os.escapeMode(Entities.EscapeMode.base);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21857);String customOut2 = Jsoup.clean(html, "http://foo.com/", Whitelist.relaxed(), os);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21858);assertEquals("<div><p>&#x212c;</p></div>", customOut2);
    }finally{__CLR4_2_0gqzgqzlnxz239l.R.flushNeeded();}}

    @Test public void handlesFramesets() {__CLR4_2_0gqzgqzlnxz239l.R.globalSliceStart(getClass().getName(),21859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0t9f5k6gv7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gqzgqzlnxz239l.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gqzgqzlnxz239l.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.handlesFramesets",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21859,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0t9f5k6gv7(){try{__CLR4_2_0gqzgqzlnxz239l.R.inc(21859);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21860);String dirty = "<html><head><script></script><noscript></noscript></head><frameset><frame src=\"foo\" /><frame src=\"foo\" /></frameset></html>";
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21861);String clean = Jsoup.clean(dirty, Whitelist.basic());
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21862);assertEquals("", clean); // nothing good can come out of that

        __CLR4_2_0gqzgqzlnxz239l.R.inc(21863);Document dirtyDoc = Jsoup.parse(dirty);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21864);Document cleanDoc = new Cleaner(Whitelist.basic()).clean(dirtyDoc);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21865);assertNotNull(cleanDoc);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21866);assertEquals(0, cleanDoc.body().childNodeSize());
    }finally{__CLR4_2_0gqzgqzlnxz239l.R.flushNeeded();}}

    @Test public void cleansInternationalText() {__CLR4_2_0gqzgqzlnxz239l.R.globalSliceStart(getClass().getName(),21867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0alnwo8gvf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gqzgqzlnxz239l.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gqzgqzlnxz239l.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.cleansInternationalText",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21867,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0alnwo8gvf(){try{__CLR4_2_0gqzgqzlnxz239l.R.inc(21867);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21868);assertEquals("\u043f\u0440\u0438\u0432\u0435\u0442", Jsoup.clean("\u043f\u0440\u0438\u0432\u0435\u0442", Whitelist.none()));
    }finally{__CLR4_2_0gqzgqzlnxz239l.R.flushNeeded();}}

    @Test
    public void testScriptTagInWhiteList() {__CLR4_2_0gqzgqzlnxz239l.R.globalSliceStart(getClass().getName(),21869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0phkfn8gvh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gqzgqzlnxz239l.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gqzgqzlnxz239l.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.testScriptTagInWhiteList",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21869,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0phkfn8gvh(){try{__CLR4_2_0gqzgqzlnxz239l.R.inc(21869);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21870);Whitelist whitelist = Whitelist.relaxed();
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21871);whitelist.addTags( "script" );
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21872);assertTrue( Jsoup.isValid("Hello<script>alert('Doh')</script>World !", whitelist ) );
    }finally{__CLR4_2_0gqzgqzlnxz239l.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void bailsIfRemovingProtocolThatsNotSet() {__CLR4_2_0gqzgqzlnxz239l.R.globalSliceStart(getClass().getName(),21873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0nqk4mzgvl();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,98,97,105,108,115,73,102,82,101,109,111,118,105,110,103,80,114,111,116,111,99,111,108,84,104,97,116,115,78,111,116,83,101,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gqzgqzlnxz239l.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gqzgqzlnxz239l.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.bailsIfRemovingProtocolThatsNotSet",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21873,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0nqk4mzgvl(){try{__CLR4_2_0gqzgqzlnxz239l.R.inc(21873);
        // a case that came up on the email list
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21874);Whitelist w = Whitelist.none();

        // note no add tag, and removing protocol without adding first
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21875);w.addAttributes("a", "href");
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21876);w.removeProtocols("a", "href", "javascript"); // with no protocols enforced, this was a noop. Now validates.
    }finally{__CLR4_2_0gqzgqzlnxz239l.R.flushNeeded();}}

    @Test public void handlesControlCharactersAfterTagName() {__CLR4_2_0gqzgqzlnxz239l.R.globalSliceStart(getClass().getName(),21877);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_01njmzwgvp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gqzgqzlnxz239l.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gqzgqzlnxz239l.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.handlesControlCharactersAfterTagName",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21877,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_01njmzwgvp(){try{__CLR4_2_0gqzgqzlnxz239l.R.inc(21877);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21878);String html = "<a/\06>";
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21879);String clean = Jsoup.clean(html, Whitelist.basic());
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21880);assertEquals("<a rel=\"nofollow\"></a>", clean);
    }finally{__CLR4_2_0gqzgqzlnxz239l.R.flushNeeded();}}

    @Test public void handlesAttributesWithNoValue() {__CLR4_2_0gqzgqzlnxz239l.R.globalSliceStart(getClass().getName(),21881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_05ar0r5gvt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gqzgqzlnxz239l.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gqzgqzlnxz239l.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.handlesAttributesWithNoValue",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21881,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_05ar0r5gvt(){try{__CLR4_2_0gqzgqzlnxz239l.R.inc(21881);
        // https://github.com/jhy/jsoup/issues/973
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21882);String clean = Jsoup.clean("<a href>Clean</a>", Whitelist.basic());

        __CLR4_2_0gqzgqzlnxz239l.R.inc(21883);assertEquals("<a rel=\"nofollow\">Clean</a>", clean);
    }finally{__CLR4_2_0gqzgqzlnxz239l.R.flushNeeded();}}

    @Test public void handlesNoHrefAttribute() {__CLR4_2_0gqzgqzlnxz239l.R.globalSliceStart(getClass().getName(),21884);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0s3md2sgvw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gqzgqzlnxz239l.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gqzgqzlnxz239l.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.handlesNoHrefAttribute",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21884,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0s3md2sgvw(){try{__CLR4_2_0gqzgqzlnxz239l.R.inc(21884);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21885);String dirty = "<a>One</a> <a href>Two</a>";
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21886);Whitelist relaxedWithAnchor = Whitelist.relaxed().addProtocols("a", "href", "#");
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21887);String clean = Jsoup.clean(dirty, relaxedWithAnchor);
        __CLR4_2_0gqzgqzlnxz239l.R.inc(21888);assertEquals("<a>One</a> \n<a>Two</a>", clean);
    }finally{__CLR4_2_0gqzgqzlnxz239l.R.flushNeeded();}}
}
