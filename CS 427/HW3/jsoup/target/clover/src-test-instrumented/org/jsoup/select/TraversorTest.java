/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.select;

import static org.junit.Assert.assertEquals;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.junit.Test;

public class TraversorTest {static class __CLR4_2_0hnqhnqlnxz23ak{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767707166L,8589935092L,22950,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Note: NodeTraversor.traverse(new NodeVisitor) is tested in
    // ElementsTest#traverse()

    @Test
    public void filterVisit() {__CLR4_2_0hnqhnqlnxz23ak.R.globalSliceStart(getClass().getName(),22886);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_09i2umyhnq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0hnqhnqlnxz23ak.R.rethrow($CLV_t2$);}finally{__CLR4_2_0hnqhnqlnxz23ak.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.TraversorTest.filterVisit",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22886,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_09i2umyhnq(){try{__CLR4_2_0hnqhnqlnxz23ak.R.inc(22886);
        __CLR4_2_0hnqhnqlnxz23ak.R.inc(22887);Document doc = Jsoup.parse("<div><p>Hello</p></div><div>There</div>");
        __CLR4_2_0hnqhnqlnxz23ak.R.inc(22888);final StringBuilder accum = new StringBuilder();
        __CLR4_2_0hnqhnqlnxz23ak.R.inc(22889);NodeTraversor.filter(new NodeFilter() {
            @Override
            public FilterResult head(Node node, int depth) {try{__CLR4_2_0hnqhnqlnxz23ak.R.inc(22890);
                __CLR4_2_0hnqhnqlnxz23ak.R.inc(22891);accum.append("<").append(node.nodeName()).append(">");
                __CLR4_2_0hnqhnqlnxz23ak.R.inc(22892);return FilterResult.CONTINUE;
            }finally{__CLR4_2_0hnqhnqlnxz23ak.R.flushNeeded();}}

            @Override
            public FilterResult tail(Node node, int depth) {try{__CLR4_2_0hnqhnqlnxz23ak.R.inc(22893);
                __CLR4_2_0hnqhnqlnxz23ak.R.inc(22894);accum.append("</").append(node.nodeName()).append(">");
                __CLR4_2_0hnqhnqlnxz23ak.R.inc(22895);return FilterResult.CONTINUE;
            }finally{__CLR4_2_0hnqhnqlnxz23ak.R.flushNeeded();}}
        }, doc.select("div"));
        __CLR4_2_0hnqhnqlnxz23ak.R.inc(22896);assertEquals("<div><p><#text></#text></p></div><div><#text></#text></div>", accum.toString());
    }finally{__CLR4_2_0hnqhnqlnxz23ak.R.flushNeeded();}}

    @Test
    public void filterSkipChildren() {__CLR4_2_0hnqhnqlnxz23ak.R.globalSliceStart(getClass().getName(),22897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ps531ho1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0hnqhnqlnxz23ak.R.rethrow($CLV_t2$);}finally{__CLR4_2_0hnqhnqlnxz23ak.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.TraversorTest.filterSkipChildren",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22897,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ps531ho1(){try{__CLR4_2_0hnqhnqlnxz23ak.R.inc(22897);
        __CLR4_2_0hnqhnqlnxz23ak.R.inc(22898);Document doc = Jsoup.parse("<div><p>Hello</p></div><div>There</div>");
        __CLR4_2_0hnqhnqlnxz23ak.R.inc(22899);final StringBuilder accum = new StringBuilder();
        __CLR4_2_0hnqhnqlnxz23ak.R.inc(22900);NodeTraversor.filter(new NodeFilter() {
            @Override
            public FilterResult head(Node node, int depth) {try{__CLR4_2_0hnqhnqlnxz23ak.R.inc(22901);
                __CLR4_2_0hnqhnqlnxz23ak.R.inc(22902);accum.append("<").append(node.nodeName()).append(">");
                // OMIT contents of p:
                __CLR4_2_0hnqhnqlnxz23ak.R.inc(22903);return (((("p".equals(node.nodeName())) )&&(__CLR4_2_0hnqhnqlnxz23ak.R.iget(22904)!=0|true))||(__CLR4_2_0hnqhnqlnxz23ak.R.iget(22905)==0&false))? FilterResult.SKIP_CHILDREN : FilterResult.CONTINUE;
            }finally{__CLR4_2_0hnqhnqlnxz23ak.R.flushNeeded();}}

            @Override
            public FilterResult tail(Node node, int depth) {try{__CLR4_2_0hnqhnqlnxz23ak.R.inc(22906);
                __CLR4_2_0hnqhnqlnxz23ak.R.inc(22907);accum.append("</").append(node.nodeName()).append(">");
                __CLR4_2_0hnqhnqlnxz23ak.R.inc(22908);return FilterResult.CONTINUE;
            }finally{__CLR4_2_0hnqhnqlnxz23ak.R.flushNeeded();}}
        }, doc.select("div"));
        __CLR4_2_0hnqhnqlnxz23ak.R.inc(22909);assertEquals("<div><p></p></div><div><#text></#text></div>", accum.toString());
    }finally{__CLR4_2_0hnqhnqlnxz23ak.R.flushNeeded();}}

    @Test
    public void filterSkipEntirely() {__CLR4_2_0hnqhnqlnxz23ak.R.globalSliceStart(getClass().getName(),22910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0oahg78hoe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0hnqhnqlnxz23ak.R.rethrow($CLV_t2$);}finally{__CLR4_2_0hnqhnqlnxz23ak.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.TraversorTest.filterSkipEntirely",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22910,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0oahg78hoe(){try{__CLR4_2_0hnqhnqlnxz23ak.R.inc(22910);
        __CLR4_2_0hnqhnqlnxz23ak.R.inc(22911);Document doc = Jsoup.parse("<div><p>Hello</p></div><div>There</div>");
        __CLR4_2_0hnqhnqlnxz23ak.R.inc(22912);final StringBuilder accum = new StringBuilder();
        __CLR4_2_0hnqhnqlnxz23ak.R.inc(22913);NodeTraversor.filter(new NodeFilter() {
            @Override
            public FilterResult head(Node node, int depth) {try{__CLR4_2_0hnqhnqlnxz23ak.R.inc(22914);
                // OMIT p:
                __CLR4_2_0hnqhnqlnxz23ak.R.inc(22915);if (((("p".equals(node.nodeName()))&&(__CLR4_2_0hnqhnqlnxz23ak.R.iget(22916)!=0|true))||(__CLR4_2_0hnqhnqlnxz23ak.R.iget(22917)==0&false)))
                    {__CLR4_2_0hnqhnqlnxz23ak.R.inc(22918);return FilterResult.SKIP_ENTIRELY;
                }__CLR4_2_0hnqhnqlnxz23ak.R.inc(22919);accum.append("<").append(node.nodeName()).append(">");
                __CLR4_2_0hnqhnqlnxz23ak.R.inc(22920);return FilterResult.CONTINUE;
            }finally{__CLR4_2_0hnqhnqlnxz23ak.R.flushNeeded();}}

            @Override
            public FilterResult tail(Node node, int depth) {try{__CLR4_2_0hnqhnqlnxz23ak.R.inc(22921);
                __CLR4_2_0hnqhnqlnxz23ak.R.inc(22922);accum.append("</").append(node.nodeName()).append(">");
                __CLR4_2_0hnqhnqlnxz23ak.R.inc(22923);return FilterResult.CONTINUE;
            }finally{__CLR4_2_0hnqhnqlnxz23ak.R.flushNeeded();}}
        }, doc.select("div"));
        __CLR4_2_0hnqhnqlnxz23ak.R.inc(22924);assertEquals("<div></div><div><#text></#text></div>", accum.toString());
    }finally{__CLR4_2_0hnqhnqlnxz23ak.R.flushNeeded();}}

    @Test
    public void filterRemove() {__CLR4_2_0hnqhnqlnxz23ak.R.globalSliceStart(getClass().getName(),22925);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0inp143hot();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0hnqhnqlnxz23ak.R.rethrow($CLV_t2$);}finally{__CLR4_2_0hnqhnqlnxz23ak.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.TraversorTest.filterRemove",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22925,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0inp143hot(){try{__CLR4_2_0hnqhnqlnxz23ak.R.inc(22925);
        __CLR4_2_0hnqhnqlnxz23ak.R.inc(22926);Document doc = Jsoup.parse("<div><p>Hello</p></div><div>There be <b>bold</b></div>");
        __CLR4_2_0hnqhnqlnxz23ak.R.inc(22927);NodeTraversor.filter(new NodeFilter() {
            @Override
            public FilterResult head(Node node, int depth) {try{__CLR4_2_0hnqhnqlnxz23ak.R.inc(22928);
                // Delete "p" in head:
                __CLR4_2_0hnqhnqlnxz23ak.R.inc(22929);return (((("p".equals(node.nodeName())) )&&(__CLR4_2_0hnqhnqlnxz23ak.R.iget(22930)!=0|true))||(__CLR4_2_0hnqhnqlnxz23ak.R.iget(22931)==0&false))? FilterResult.REMOVE : FilterResult.CONTINUE;
            }finally{__CLR4_2_0hnqhnqlnxz23ak.R.flushNeeded();}}

            @Override
            public FilterResult tail(Node node, int depth) {try{__CLR4_2_0hnqhnqlnxz23ak.R.inc(22932);
                // Delete "b" in tail:
                __CLR4_2_0hnqhnqlnxz23ak.R.inc(22933);return (((("b".equals(node.nodeName())) )&&(__CLR4_2_0hnqhnqlnxz23ak.R.iget(22934)!=0|true))||(__CLR4_2_0hnqhnqlnxz23ak.R.iget(22935)==0&false))? FilterResult.REMOVE : FilterResult.CONTINUE;
            }finally{__CLR4_2_0hnqhnqlnxz23ak.R.flushNeeded();}}
        }, doc.select("div"));
        __CLR4_2_0hnqhnqlnxz23ak.R.inc(22936);assertEquals("<div></div>\n<div>\n There be \n</div>", doc.select("body").html());
    }finally{__CLR4_2_0hnqhnqlnxz23ak.R.flushNeeded();}}

    @Test
    public void filterStop() {__CLR4_2_0hnqhnqlnxz23ak.R.globalSliceStart(getClass().getName(),22937);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_06s2b35hp5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0hnqhnqlnxz23ak.R.rethrow($CLV_t2$);}finally{__CLR4_2_0hnqhnqlnxz23ak.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.TraversorTest.filterStop",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22937,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_06s2b35hp5(){try{__CLR4_2_0hnqhnqlnxz23ak.R.inc(22937);
        __CLR4_2_0hnqhnqlnxz23ak.R.inc(22938);Document doc = Jsoup.parse("<div><p>Hello</p></div><div>There</div>");
        __CLR4_2_0hnqhnqlnxz23ak.R.inc(22939);final StringBuilder accum = new StringBuilder();
        __CLR4_2_0hnqhnqlnxz23ak.R.inc(22940);NodeTraversor.filter(new NodeFilter() {
            @Override
            public FilterResult head(Node node, int depth) {try{__CLR4_2_0hnqhnqlnxz23ak.R.inc(22941);
                __CLR4_2_0hnqhnqlnxz23ak.R.inc(22942);accum.append("<").append(node.nodeName()).append(">");
                __CLR4_2_0hnqhnqlnxz23ak.R.inc(22943);return FilterResult.CONTINUE;
            }finally{__CLR4_2_0hnqhnqlnxz23ak.R.flushNeeded();}}

            @Override
            public FilterResult tail(Node node, int depth) {try{__CLR4_2_0hnqhnqlnxz23ak.R.inc(22944);
                __CLR4_2_0hnqhnqlnxz23ak.R.inc(22945);accum.append("</").append(node.nodeName()).append(">");
                // Stop after p.
                __CLR4_2_0hnqhnqlnxz23ak.R.inc(22946);return (((("p".equals(node.nodeName())) )&&(__CLR4_2_0hnqhnqlnxz23ak.R.iget(22947)!=0|true))||(__CLR4_2_0hnqhnqlnxz23ak.R.iget(22948)==0&false))? FilterResult.STOP : FilterResult.CONTINUE;
            }finally{__CLR4_2_0hnqhnqlnxz23ak.R.flushNeeded();}}
        }, doc.select("div"));
        __CLR4_2_0hnqhnqlnxz23ak.R.inc(22949);assertEquals("<div><p><#text></#text></p>", accum.toString());
    }finally{__CLR4_2_0hnqhnqlnxz23ak.R.flushNeeded();}}
}
