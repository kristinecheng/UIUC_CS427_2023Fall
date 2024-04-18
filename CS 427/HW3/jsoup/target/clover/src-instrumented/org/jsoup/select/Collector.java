/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import static org.jsoup.select.NodeFilter.FilterResult.CONTINUE;
import static org.jsoup.select.NodeFilter.FilterResult.STOP;

/**
 * Collects a list of elements that match the supplied criteria.
 *
 * @author Jonathan Hedley
 */
public class Collector {public static class __CLR4_2_077k77klnxz22rt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,9383,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Collector() {try{__CLR4_2_077k77klnxz22rt.R.inc(9344);
    }finally{__CLR4_2_077k77klnxz22rt.R.flushNeeded();}}

    /**
     Build a list of elements, by visiting root and every descendant of root, and testing it against the evaluator.
     @param eval Evaluator to test elements against
     @param root root of tree to descend
     @return list of matches; empty if none
     */
    public static Elements collect (Evaluator eval, Element root) {try{__CLR4_2_077k77klnxz22rt.R.inc(9345);
        __CLR4_2_077k77klnxz22rt.R.inc(9346);Elements elements = new Elements();
        __CLR4_2_077k77klnxz22rt.R.inc(9347);NodeTraversor.traverse(new Accumulator(root, elements, eval), root);
        __CLR4_2_077k77klnxz22rt.R.inc(9348);return elements;
    }finally{__CLR4_2_077k77klnxz22rt.R.flushNeeded();}}

    private static class Accumulator implements NodeVisitor {
        private final Element root;
        private final Elements elements;
        private final Evaluator eval;

        Accumulator(Element root, Elements elements, Evaluator eval) {try{__CLR4_2_077k77klnxz22rt.R.inc(9349);
            __CLR4_2_077k77klnxz22rt.R.inc(9350);this.root = root;
            __CLR4_2_077k77klnxz22rt.R.inc(9351);this.elements = elements;
            __CLR4_2_077k77klnxz22rt.R.inc(9352);this.eval = eval;
        }finally{__CLR4_2_077k77klnxz22rt.R.flushNeeded();}}

        public void head(Node node, int depth) {try{__CLR4_2_077k77klnxz22rt.R.inc(9353);
            __CLR4_2_077k77klnxz22rt.R.inc(9354);if ((((node instanceof Element)&&(__CLR4_2_077k77klnxz22rt.R.iget(9355)!=0|true))||(__CLR4_2_077k77klnxz22rt.R.iget(9356)==0&false))) {{
                __CLR4_2_077k77klnxz22rt.R.inc(9357);Element el = (Element) node;
                __CLR4_2_077k77klnxz22rt.R.inc(9358);if ((((eval.matches(root, el))&&(__CLR4_2_077k77klnxz22rt.R.iget(9359)!=0|true))||(__CLR4_2_077k77klnxz22rt.R.iget(9360)==0&false)))
                    {__CLR4_2_077k77klnxz22rt.R.inc(9361);elements.add(el);
            }}
        }}finally{__CLR4_2_077k77klnxz22rt.R.flushNeeded();}}

        public void tail(Node node, int depth) {try{__CLR4_2_077k77klnxz22rt.R.inc(9362);
            // void
        }finally{__CLR4_2_077k77klnxz22rt.R.flushNeeded();}}
    }

    public static Element findFirst(Evaluator eval, Element root) {try{__CLR4_2_077k77klnxz22rt.R.inc(9363);
        __CLR4_2_077k77klnxz22rt.R.inc(9364);FirstFinder finder = new FirstFinder(root, eval);
        __CLR4_2_077k77klnxz22rt.R.inc(9365);NodeTraversor.filter(finder, root);
        __CLR4_2_077k77klnxz22rt.R.inc(9366);return finder.match;
    }finally{__CLR4_2_077k77klnxz22rt.R.flushNeeded();}}

    private static class FirstFinder implements NodeFilter {
        private final Element root;
        private Element match = null;
        private final Evaluator eval;

        FirstFinder(Element root, Evaluator eval) {try{__CLR4_2_077k77klnxz22rt.R.inc(9367);
            __CLR4_2_077k77klnxz22rt.R.inc(9368);this.root = root;
            __CLR4_2_077k77klnxz22rt.R.inc(9369);this.eval = eval;
        }finally{__CLR4_2_077k77klnxz22rt.R.flushNeeded();}}

        @Override
        public FilterResult head(Node node, int depth) {try{__CLR4_2_077k77klnxz22rt.R.inc(9370);
            __CLR4_2_077k77klnxz22rt.R.inc(9371);if ((((node instanceof Element)&&(__CLR4_2_077k77klnxz22rt.R.iget(9372)!=0|true))||(__CLR4_2_077k77klnxz22rt.R.iget(9373)==0&false))) {{
                __CLR4_2_077k77klnxz22rt.R.inc(9374);Element el = (Element) node;
                __CLR4_2_077k77klnxz22rt.R.inc(9375);if ((((eval.matches(root, el))&&(__CLR4_2_077k77klnxz22rt.R.iget(9376)!=0|true))||(__CLR4_2_077k77klnxz22rt.R.iget(9377)==0&false))) {{
                    __CLR4_2_077k77klnxz22rt.R.inc(9378);match = el;
                    __CLR4_2_077k77klnxz22rt.R.inc(9379);return STOP;
                }
            }}
            }__CLR4_2_077k77klnxz22rt.R.inc(9380);return CONTINUE;
        }finally{__CLR4_2_077k77klnxz22rt.R.flushNeeded();}}

        @Override
        public FilterResult tail(Node node, int depth) {try{__CLR4_2_077k77klnxz22rt.R.inc(9381);
            __CLR4_2_077k77klnxz22rt.R.inc(9382);return CONTINUE;
        }finally{__CLR4_2_077k77klnxz22rt.R.flushNeeded();}}
    }

}
