/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.junit.Test;

import static org.jsoup.nodes.Document.OutputSettings;
import static org.jsoup.nodes.Entities.EscapeMode.*;
import static org.junit.Assert.*;

public class EntitiesTest {static class __CLR4_2_0f7hf7hlnxz237m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767707166L,8589935092L,19808,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test public void escape() {__CLR4_2_0f7hf7hlnxz237m.R.globalSliceStart(getClass().getName(),19709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0s7spcof7h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0f7hf7hlnxz237m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0f7hf7hlnxz237m.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.EntitiesTest.escape",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19709,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0s7spcof7h(){try{__CLR4_2_0f7hf7hlnxz237m.R.inc(19709);
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19710);String text = "Hello &<> \u00c5 \u00e5 \u03c0 \u65b0 there \u00be \u00a9 \u00bb";
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19711);String escapedAscii = Entities.escape(text, new OutputSettings().charset("ascii").escapeMode(base));
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19712);String escapedAsciiFull = Entities.escape(text, new OutputSettings().charset("ascii").escapeMode(extended));
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19713);String escapedAsciiXhtml = Entities.escape(text, new OutputSettings().charset("ascii").escapeMode(xhtml));
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19714);String escapedUtfFull = Entities.escape(text, new OutputSettings().charset("UTF-8").escapeMode(extended));
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19715);String escapedUtfMin = Entities.escape(text, new OutputSettings().charset("UTF-8").escapeMode(xhtml));

        __CLR4_2_0f7hf7hlnxz237m.R.inc(19716);assertEquals("Hello &amp;&lt;&gt; &Aring; &aring; &#x3c0; &#x65b0; there &frac34; &copy; &raquo;", escapedAscii);
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19717);assertEquals("Hello &amp;&lt;&gt; &angst; &aring; &pi; &#x65b0; there &frac34; &copy; &raquo;", escapedAsciiFull);
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19718);assertEquals("Hello &amp;&lt;&gt; &#xc5; &#xe5; &#x3c0; &#x65b0; there &#xbe; &#xa9; &#xbb;", escapedAsciiXhtml);
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19719);assertEquals("Hello &amp;&lt;&gt; \u00c5 \u00e5 \u03c0 \u65b0 there \u00be \u00a9 \u00bb", escapedUtfFull);
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19720);assertEquals("Hello &amp;&lt;&gt; \u00c5 \u00e5 \u03c0 \u65b0 there \u00be \u00a9 \u00bb", escapedUtfMin);
        // odd that it's defined as aring in base but angst in full

        // round trip
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19721);assertEquals(text, Entities.unescape(escapedAscii));
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19722);assertEquals(text, Entities.unescape(escapedAsciiFull));
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19723);assertEquals(text, Entities.unescape(escapedAsciiXhtml));
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19724);assertEquals(text, Entities.unescape(escapedUtfFull));
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19725);assertEquals(text, Entities.unescape(escapedUtfMin));
    }finally{__CLR4_2_0f7hf7hlnxz237m.R.flushNeeded();}}

    @Test public void escapedSupplementary() {__CLR4_2_0f7hf7hlnxz237m.R.globalSliceStart(getClass().getName(),19726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0a0mpnxf7y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0f7hf7hlnxz237m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0f7hf7hlnxz237m.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.EntitiesTest.escapedSupplementary",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19726,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0a0mpnxf7y(){try{__CLR4_2_0f7hf7hlnxz237m.R.inc(19726);
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19727);String text = "\ud835\udd59";
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19728);String escapedAscii = Entities.escape(text, new OutputSettings().charset("ascii").escapeMode(base));
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19729);assertEquals("&#x1d559;", escapedAscii);
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19730);String escapedAsciiFull = Entities.escape(text, new OutputSettings().charset("ascii").escapeMode(extended));
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19731);assertEquals("&hopf;", escapedAsciiFull);
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19732);String escapedUtf= Entities.escape(text, new OutputSettings().charset("UTF-8").escapeMode(extended));
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19733);assertEquals(text, escapedUtf);
    }finally{__CLR4_2_0f7hf7hlnxz237m.R.flushNeeded();}}

    @Test public void unescapeMultiChars() {__CLR4_2_0f7hf7hlnxz237m.R.globalSliceStart(getClass().getName(),19734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0y8hd97f86();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0f7hf7hlnxz237m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0f7hf7hlnxz237m.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.EntitiesTest.unescapeMultiChars",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19734,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0y8hd97f86(){try{__CLR4_2_0f7hf7hlnxz237m.R.inc(19734);
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19735);String text = "&NestedGreaterGreater; &nGg; &nGt; &nGtv; &Gt; &gg;"; // gg is not combo, but 8811 could conflict with NestedGreaterGreater or others
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19736);String un = "\u226b \u22d9\u0338 \u226b\u20d2 \u226b\u0338 \u226b \u226b";
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19737);assertEquals(un, Entities.unescape(text));
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19738);String escaped = Entities.escape(un, new OutputSettings().charset("ascii").escapeMode(extended));
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19739);assertEquals("&Gt; &Gg;&#x338; &Gt;&#x20d2; &Gt;&#x338; &Gt; &Gt;", escaped);
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19740);assertEquals(un, Entities.unescape(escaped));
    }finally{__CLR4_2_0f7hf7hlnxz237m.R.flushNeeded();}}

    @Test public void xhtml() {__CLR4_2_0f7hf7hlnxz237m.R.globalSliceStart(getClass().getName(),19741);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0xzar62f8d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0f7hf7hlnxz237m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0f7hf7hlnxz237m.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.EntitiesTest.xhtml",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19741,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0xzar62f8d(){try{__CLR4_2_0f7hf7hlnxz237m.R.inc(19741);
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19742);String text = "&amp; &gt; &lt; &quot;";
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19743);assertEquals(38, xhtml.codepointForName("amp"));
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19744);assertEquals(62, xhtml.codepointForName("gt"));
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19745);assertEquals(60, xhtml.codepointForName("lt"));
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19746);assertEquals(34, xhtml.codepointForName("quot"));

        __CLR4_2_0f7hf7hlnxz237m.R.inc(19747);assertEquals("amp", xhtml.nameForCodepoint(38));
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19748);assertEquals("gt", xhtml.nameForCodepoint(62));
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19749);assertEquals("lt", xhtml.nameForCodepoint(60));
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19750);assertEquals("quot", xhtml.nameForCodepoint(34));
    }finally{__CLR4_2_0f7hf7hlnxz237m.R.flushNeeded();}}

    @Test public void getByName() {__CLR4_2_0f7hf7hlnxz237m.R.globalSliceStart(getClass().getName(),19751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0fm47r5f8n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0f7hf7hlnxz237m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0f7hf7hlnxz237m.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.EntitiesTest.getByName",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19751,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0fm47r5f8n(){try{__CLR4_2_0f7hf7hlnxz237m.R.inc(19751);
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19752);assertEquals("\u226b\u20d2", Entities.getByName("nGt"));
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19753);assertEquals("fj", Entities.getByName("fjlig"));
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19754);assertEquals("\u226b", Entities.getByName("gg"));
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19755);assertEquals("\u00a9", Entities.getByName("copy"));
    }finally{__CLR4_2_0f7hf7hlnxz237m.R.flushNeeded();}}

    @Test public void escapeSupplementaryCharacter() {__CLR4_2_0f7hf7hlnxz237m.R.globalSliceStart(getClass().getName(),19756);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0a058bif8s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0f7hf7hlnxz237m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0f7hf7hlnxz237m.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.EntitiesTest.escapeSupplementaryCharacter",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19756,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0a058bif8s(){try{__CLR4_2_0f7hf7hlnxz237m.R.inc(19756);
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19757);String text = new String(Character.toChars(135361));
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19758);String escapedAscii = Entities.escape(text, new OutputSettings().charset("ascii").escapeMode(base));
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19759);assertEquals("&#x210c1;", escapedAscii);
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19760);String escapedUtf = Entities.escape(text, new OutputSettings().charset("UTF-8").escapeMode(base));
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19761);assertEquals(text, escapedUtf);
    }finally{__CLR4_2_0f7hf7hlnxz237m.R.flushNeeded();}}

    @Test public void notMissingMultis() {__CLR4_2_0f7hf7hlnxz237m.R.globalSliceStart(getClass().getName(),19762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0fj39pwf8y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0f7hf7hlnxz237m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0f7hf7hlnxz237m.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.EntitiesTest.notMissingMultis",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19762,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0fj39pwf8y(){try{__CLR4_2_0f7hf7hlnxz237m.R.inc(19762);
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19763);String text = "&nparsl;";
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19764);String un = "\u2afd\u20e5";
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19765);assertEquals(un, Entities.unescape(text));
    }finally{__CLR4_2_0f7hf7hlnxz237m.R.flushNeeded();}}

    @Test public void notMissingSupplementals() {__CLR4_2_0f7hf7hlnxz237m.R.globalSliceStart(getClass().getName(),19766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0psbarhf92();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0f7hf7hlnxz237m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0f7hf7hlnxz237m.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.EntitiesTest.notMissingSupplementals",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19766,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0psbarhf92(){try{__CLR4_2_0f7hf7hlnxz237m.R.inc(19766);
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19767);String text = "&npolint; &qfr;";
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19768);String un = "\u2a14 \ud835\udd2e"; // \ud835\udd2e
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19769);assertEquals(un, Entities.unescape(text));
    }finally{__CLR4_2_0f7hf7hlnxz237m.R.flushNeeded();}}

    @Test public void unescape() {__CLR4_2_0f7hf7hlnxz237m.R.globalSliceStart(getClass().getName(),19770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0dbipwff96();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0f7hf7hlnxz237m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0f7hf7hlnxz237m.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.EntitiesTest.unescape",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19770,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0dbipwff96(){try{__CLR4_2_0f7hf7hlnxz237m.R.inc(19770);
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19771);String text = "Hello &AElig; &amp;&LT&gt; &reg &angst; &angst &#960; &#960 &#x65B0; there &! &frac34; &copy; &COPY;";
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19772);assertEquals("Hello \u00c6 &<> \u00ae \u00c5 &angst \u03c0 \u03c0 \u65b0 there &! \u00be \u00a9 \u00a9", Entities.unescape(text));

        __CLR4_2_0f7hf7hlnxz237m.R.inc(19773);assertEquals("&0987654321; &unknown", Entities.unescape("&0987654321; &unknown"));
    }finally{__CLR4_2_0f7hf7hlnxz237m.R.flushNeeded();}}

    @Test public void strictUnescape() {__CLR4_2_0f7hf7hlnxz237m.R.globalSliceStart(getClass().getName(),19774);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0rpil9mf9a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0f7hf7hlnxz237m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0f7hf7hlnxz237m.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.EntitiesTest.strictUnescape",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19774,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0rpil9mf9a(){try{__CLR4_2_0f7hf7hlnxz237m.R.inc(19774); // for attributes, enforce strict unescaping (must look like &#xxx; , not just &#xxx)
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19775);String text = "Hello &amp= &amp;";
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19776);assertEquals("Hello &amp= &", Entities.unescape(text, true));
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19777);assertEquals("Hello &= &", Entities.unescape(text));
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19778);assertEquals("Hello &= &", Entities.unescape(text, false));
    }finally{__CLR4_2_0f7hf7hlnxz237m.R.flushNeeded();}}

    
    @Test public void caseSensitive() {__CLR4_2_0f7hf7hlnxz237m.R.globalSliceStart(getClass().getName(),19779);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0xica8df9f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0f7hf7hlnxz237m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0f7hf7hlnxz237m.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.EntitiesTest.caseSensitive",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19779,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0xica8df9f(){try{__CLR4_2_0f7hf7hlnxz237m.R.inc(19779);
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19780);String unescaped = "\u00dc \u00fc & &";
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19781);assertEquals("&Uuml; &uuml; &amp; &amp;",
                Entities.escape(unescaped, new OutputSettings().charset("ascii").escapeMode(extended)));
        
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19782);String escaped = "&Uuml; &uuml; &amp; &AMP";
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19783);assertEquals("\u00dc \u00fc & &", Entities.unescape(escaped));
    }finally{__CLR4_2_0f7hf7hlnxz237m.R.flushNeeded();}}
    
    @Test public void quoteReplacements() {__CLR4_2_0f7hf7hlnxz237m.R.globalSliceStart(getClass().getName(),19784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0pggahof9k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0f7hf7hlnxz237m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0f7hf7hlnxz237m.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.EntitiesTest.quoteReplacements",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19784,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0pggahof9k(){try{__CLR4_2_0f7hf7hlnxz237m.R.inc(19784);
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19785);String escaped = "&#92; &#36;";
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19786);String unescaped = "\\ $";
        
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19787);assertEquals(unescaped, Entities.unescape(escaped));
    }finally{__CLR4_2_0f7hf7hlnxz237m.R.flushNeeded();}}

    @Test public void letterDigitEntities() {__CLR4_2_0f7hf7hlnxz237m.R.globalSliceStart(getClass().getName(),19788);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0xofmsxf9o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0f7hf7hlnxz237m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0f7hf7hlnxz237m.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.EntitiesTest.letterDigitEntities",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19788,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0xofmsxf9o(){try{__CLR4_2_0f7hf7hlnxz237m.R.inc(19788);
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19789);String html = "<p>&sup1;&sup2;&sup3;&frac14;&frac12;&frac34;</p>";
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19790);Document doc = Jsoup.parse(html);
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19791);doc.outputSettings().charset("ascii");
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19792);Element p = doc.select("p").first();
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19793);assertEquals("&sup1;&sup2;&sup3;&frac14;&frac12;&frac34;", p.html());
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19794);assertEquals("\u00b9\u00b2\u00b3\u00bc\u00bd\u00be", p.text());
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19795);doc.outputSettings().charset("UTF-8");
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19796);assertEquals("\u00b9\u00b2\u00b3\u00bc\u00bd\u00be", p.html());
    }finally{__CLR4_2_0f7hf7hlnxz237m.R.flushNeeded();}}

    @Test public void noSpuriousDecodes() {__CLR4_2_0f7hf7hlnxz237m.R.globalSliceStart(getClass().getName(),19797);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_03lqz2rf9x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0f7hf7hlnxz237m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0f7hf7hlnxz237m.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.EntitiesTest.noSpuriousDecodes",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19797,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_03lqz2rf9x(){try{__CLR4_2_0f7hf7hlnxz237m.R.inc(19797);
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19798);String string = "http://www.foo.com?a=1&num_rooms=1&children=0&int=VA&b=2";
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19799);assertEquals(string, Entities.unescape(string));
    }finally{__CLR4_2_0f7hf7hlnxz237m.R.flushNeeded();}}

    @Test public void escapesGtInXmlAttributesButNotInHtml() {__CLR4_2_0f7hf7hlnxz237m.R.globalSliceStart(getClass().getName(),19800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0yqn0bxfa0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0f7hf7hlnxz237m.R.rethrow($CLV_t2$);}finally{__CLR4_2_0f7hf7hlnxz237m.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.EntitiesTest.escapesGtInXmlAttributesButNotInHtml",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19800,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0yqn0bxfa0(){try{__CLR4_2_0f7hf7hlnxz237m.R.inc(19800);
        // https://github.com/jhy/jsoup/issues/528 - < is OK in HTML attribute values, but not in XML


        __CLR4_2_0f7hf7hlnxz237m.R.inc(19801);String docHtml = "<a title='<p>One</p>'>One</a>";
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19802);Document doc = Jsoup.parse(docHtml);
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19803);Element element = doc.select("a").first();

        __CLR4_2_0f7hf7hlnxz237m.R.inc(19804);doc.outputSettings().escapeMode(base);
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19805);assertEquals("<a title=\"<p>One</p>\">One</a>", element.outerHtml());

        __CLR4_2_0f7hf7hlnxz237m.R.inc(19806);doc.outputSettings().escapeMode(xhtml);
        __CLR4_2_0f7hf7hlnxz237m.R.inc(19807);assertEquals("<a title=\"&lt;p>One&lt;/p>\">One</a>", element.outerHtml());
    }finally{__CLR4_2_0f7hf7hlnxz237m.R.flushNeeded();}}
}
