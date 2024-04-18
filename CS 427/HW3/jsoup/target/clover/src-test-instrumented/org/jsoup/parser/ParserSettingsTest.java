/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.parser;

import org.jsoup.MultiLocaleRule;
import org.jsoup.MultiLocaleRule.MultiLocaleTest;
import org.jsoup.nodes.Attributes;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParserSettingsTest {static class __CLR4_2_0gdegdelnxz238v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767707166L,8589935092L,21241,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Rule public MultiLocaleRule rule = new MultiLocaleRule();

    @Test @MultiLocaleTest public void caseSupport() {__CLR4_2_0gdegdelnxz238v.R.globalSliceStart(getClass().getName(),21218);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0a25dlmgde();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gdegdelnxz238v.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gdegdelnxz238v.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.ParserSettingsTest.caseSupport",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21218,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0a25dlmgde(){try{__CLR4_2_0gdegdelnxz238v.R.inc(21218);
        __CLR4_2_0gdegdelnxz238v.R.inc(21219);ParseSettings bothOn = new ParseSettings(true, true);
        __CLR4_2_0gdegdelnxz238v.R.inc(21220);ParseSettings bothOff = new ParseSettings(false, false);
        __CLR4_2_0gdegdelnxz238v.R.inc(21221);ParseSettings tagOn = new ParseSettings(true, false);
        __CLR4_2_0gdegdelnxz238v.R.inc(21222);ParseSettings attrOn = new ParseSettings(false, true);

        __CLR4_2_0gdegdelnxz238v.R.inc(21223);assertEquals("IMG", bothOn.normalizeTag("IMG"));
        __CLR4_2_0gdegdelnxz238v.R.inc(21224);assertEquals("ID", bothOn.normalizeAttribute("ID"));

        __CLR4_2_0gdegdelnxz238v.R.inc(21225);assertEquals("img", bothOff.normalizeTag("IMG"));
        __CLR4_2_0gdegdelnxz238v.R.inc(21226);assertEquals("id", bothOff.normalizeAttribute("ID"));

        __CLR4_2_0gdegdelnxz238v.R.inc(21227);assertEquals("IMG", tagOn.normalizeTag("IMG"));
        __CLR4_2_0gdegdelnxz238v.R.inc(21228);assertEquals("id", tagOn.normalizeAttribute("ID"));

        __CLR4_2_0gdegdelnxz238v.R.inc(21229);assertEquals("img", attrOn.normalizeTag("IMG"));
        __CLR4_2_0gdegdelnxz238v.R.inc(21230);assertEquals("ID", attrOn.normalizeAttribute("ID"));
    }finally{__CLR4_2_0gdegdelnxz238v.R.flushNeeded();}}

    @Test @MultiLocaleTest public void attributeCaseNormalization() throws Exception {__CLR4_2_0gdegdelnxz238v.R.globalSliceStart(getClass().getName(),21231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_04vemggdr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gdegdelnxz238v.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gdegdelnxz238v.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.ParserSettingsTest.attributeCaseNormalization",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21231,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_04vemggdr() throws Exception{try{__CLR4_2_0gdegdelnxz238v.R.inc(21231);
        __CLR4_2_0gdegdelnxz238v.R.inc(21232);ParseSettings parseSettings = new ParseSettings(false, false);

        __CLR4_2_0gdegdelnxz238v.R.inc(21233);String normalizedAttribute = parseSettings.normalizeAttribute("HIDDEN");

        __CLR4_2_0gdegdelnxz238v.R.inc(21234);assertEquals("hidden", normalizedAttribute);
    }finally{__CLR4_2_0gdegdelnxz238v.R.flushNeeded();}}

    @Test @MultiLocaleTest public void attributesCaseNormalization() throws Exception {__CLR4_2_0gdegdelnxz238v.R.globalSliceStart(getClass().getName(),21235);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0hvzf7ngdv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gdegdelnxz238v.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gdegdelnxz238v.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.ParserSettingsTest.attributesCaseNormalization",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21235,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0hvzf7ngdv() throws Exception{try{__CLR4_2_0gdegdelnxz238v.R.inc(21235);
        __CLR4_2_0gdegdelnxz238v.R.inc(21236);ParseSettings parseSettings = new ParseSettings(false, false);
        __CLR4_2_0gdegdelnxz238v.R.inc(21237);Attributes attributes = new Attributes();
        __CLR4_2_0gdegdelnxz238v.R.inc(21238);attributes.put("ITEM", "1");

        __CLR4_2_0gdegdelnxz238v.R.inc(21239);Attributes normalizedAttributes = parseSettings.normalizeAttributes(attributes);

        __CLR4_2_0gdegdelnxz238v.R.inc(21240);assertEquals("item", normalizedAttributes.asList().get(0).getKey());
    }finally{__CLR4_2_0gdegdelnxz238v.R.flushNeeded();}}
}
