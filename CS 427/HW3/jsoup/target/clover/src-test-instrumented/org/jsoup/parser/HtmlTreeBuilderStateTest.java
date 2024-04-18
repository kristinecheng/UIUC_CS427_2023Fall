/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilderState.Constants;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class HtmlTreeBuilderStateTest {static class __CLR4_2_0gd2gd2lnxz238r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767707166L,8589935092L,21212,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void ensureArraysAreSorted() {__CLR4_2_0gd2gd2lnxz238r.R.globalSliceStart(getClass().getName(),21206);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0yo6asggd2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gd2gd2lnxz238r.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gd2gd2lnxz238r.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlTreeBuilderStateTest.ensureArraysAreSorted",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21206,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0yo6asggd2(){try{__CLR4_2_0gd2gd2lnxz238r.R.inc(21206);
        __CLR4_2_0gd2gd2lnxz238r.R.inc(21207);String[][] arrays = {
            Constants.InBodyStartToHead,
            Constants.InBodyStartPClosers,
            Constants.Headings,
            Constants.InBodyStartPreListing,
            Constants.InBodyStartLiBreakers,
            Constants.DdDt,
            Constants.Formatters,
            Constants.InBodyStartApplets,
            Constants.InBodyStartEmptyFormatters,
            Constants.InBodyStartMedia,
            Constants.InBodyStartInputAttribs,
            Constants.InBodyStartOptions,
            Constants.InBodyStartRuby,
            Constants.InBodyStartDrop,
            Constants.InBodyEndClosers,
            Constants.InBodyEndAdoptionFormatters,
            Constants.InBodyEndTableFosters,
            Constants.InCellNames,
            Constants.InCellBody,
            Constants.InCellTable,
            Constants.InCellCol,
        };

        __CLR4_2_0gd2gd2lnxz238r.R.inc(21208);for (String[] array : arrays) {{
            __CLR4_2_0gd2gd2lnxz238r.R.inc(21209);String[] copy = Arrays.copyOf(array, array.length);
            __CLR4_2_0gd2gd2lnxz238r.R.inc(21210);Arrays.sort(array);
            __CLR4_2_0gd2gd2lnxz238r.R.inc(21211);assertArrayEquals(array, copy);
        }
    }}finally{__CLR4_2_0gd2gd2lnxz238r.R.flushNeeded();}}
}
