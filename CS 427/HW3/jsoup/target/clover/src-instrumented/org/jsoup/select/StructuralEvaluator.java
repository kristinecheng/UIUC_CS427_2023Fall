/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.select;

import org.jsoup.nodes.Element;

/**
 * Base structural evaluator.
 */
abstract class StructuralEvaluator extends Evaluator {public static class __CLR4_2_0835835lnxz22tg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,10562,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    Evaluator evaluator;

    static class Root extends Evaluator {
        public boolean matches(Element root, Element element) {try{__CLR4_2_0835835lnxz22tg.R.inc(10481);
            __CLR4_2_0835835lnxz22tg.R.inc(10482);return root == element;
        }finally{__CLR4_2_0835835lnxz22tg.R.flushNeeded();}}
    }

    static class Has extends StructuralEvaluator {
        public Has(Evaluator evaluator) {try{__CLR4_2_0835835lnxz22tg.R.inc(10483);
            __CLR4_2_0835835lnxz22tg.R.inc(10484);this.evaluator = evaluator;
        }finally{__CLR4_2_0835835lnxz22tg.R.flushNeeded();}}

        public boolean matches(Element root, Element element) {try{__CLR4_2_0835835lnxz22tg.R.inc(10485);
            __CLR4_2_0835835lnxz22tg.R.inc(10486);for (Element e : element.getAllElements()) {{
                __CLR4_2_0835835lnxz22tg.R.inc(10487);if ((((e != element && evaluator.matches(element, e))&&(__CLR4_2_0835835lnxz22tg.R.iget(10488)!=0|true))||(__CLR4_2_0835835lnxz22tg.R.iget(10489)==0&false)))
                    {__CLR4_2_0835835lnxz22tg.R.inc(10490);return true;
            }}
            }__CLR4_2_0835835lnxz22tg.R.inc(10491);return false;
        }finally{__CLR4_2_0835835lnxz22tg.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_0835835lnxz22tg.R.inc(10492);
            __CLR4_2_0835835lnxz22tg.R.inc(10493);return String.format(":has(%s)", evaluator);
        }finally{__CLR4_2_0835835lnxz22tg.R.flushNeeded();}}
    }

    static class Not extends StructuralEvaluator {
        public Not(Evaluator evaluator) {try{__CLR4_2_0835835lnxz22tg.R.inc(10494);
            __CLR4_2_0835835lnxz22tg.R.inc(10495);this.evaluator = evaluator;
        }finally{__CLR4_2_0835835lnxz22tg.R.flushNeeded();}}

        public boolean matches(Element root, Element node) {try{__CLR4_2_0835835lnxz22tg.R.inc(10496);
            __CLR4_2_0835835lnxz22tg.R.inc(10497);return !evaluator.matches(root, node);
        }finally{__CLR4_2_0835835lnxz22tg.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_0835835lnxz22tg.R.inc(10498);
            __CLR4_2_0835835lnxz22tg.R.inc(10499);return String.format(":not%s", evaluator);
        }finally{__CLR4_2_0835835lnxz22tg.R.flushNeeded();}}
    }

    static class Parent extends StructuralEvaluator {
        public Parent(Evaluator evaluator) {try{__CLR4_2_0835835lnxz22tg.R.inc(10500);
            __CLR4_2_0835835lnxz22tg.R.inc(10501);this.evaluator = evaluator;
        }finally{__CLR4_2_0835835lnxz22tg.R.flushNeeded();}}

        public boolean matches(Element root, Element element) {try{__CLR4_2_0835835lnxz22tg.R.inc(10502);
            __CLR4_2_0835835lnxz22tg.R.inc(10503);if ((((root == element)&&(__CLR4_2_0835835lnxz22tg.R.iget(10504)!=0|true))||(__CLR4_2_0835835lnxz22tg.R.iget(10505)==0&false)))
                {__CLR4_2_0835835lnxz22tg.R.inc(10506);return false;

            }__CLR4_2_0835835lnxz22tg.R.inc(10507);Element parent = element.parent();
            __CLR4_2_0835835lnxz22tg.R.inc(10508);while (true) {{
                __CLR4_2_0835835lnxz22tg.R.inc(10509);if ((((evaluator.matches(root, parent))&&(__CLR4_2_0835835lnxz22tg.R.iget(10510)!=0|true))||(__CLR4_2_0835835lnxz22tg.R.iget(10511)==0&false)))
                    {__CLR4_2_0835835lnxz22tg.R.inc(10512);return true;
                }__CLR4_2_0835835lnxz22tg.R.inc(10513);if ((((parent == root)&&(__CLR4_2_0835835lnxz22tg.R.iget(10514)!=0|true))||(__CLR4_2_0835835lnxz22tg.R.iget(10515)==0&false)))
                    {__CLR4_2_0835835lnxz22tg.R.inc(10516);break;
                }__CLR4_2_0835835lnxz22tg.R.inc(10517);parent = parent.parent();
            }
            }__CLR4_2_0835835lnxz22tg.R.inc(10518);return false;
        }finally{__CLR4_2_0835835lnxz22tg.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_0835835lnxz22tg.R.inc(10519);
            __CLR4_2_0835835lnxz22tg.R.inc(10520);return String.format(":parent%s", evaluator);
        }finally{__CLR4_2_0835835lnxz22tg.R.flushNeeded();}}
    }

    static class ImmediateParent extends StructuralEvaluator {
        public ImmediateParent(Evaluator evaluator) {try{__CLR4_2_0835835lnxz22tg.R.inc(10521);
            __CLR4_2_0835835lnxz22tg.R.inc(10522);this.evaluator = evaluator;
        }finally{__CLR4_2_0835835lnxz22tg.R.flushNeeded();}}

        public boolean matches(Element root, Element element) {try{__CLR4_2_0835835lnxz22tg.R.inc(10523);
            __CLR4_2_0835835lnxz22tg.R.inc(10524);if ((((root == element)&&(__CLR4_2_0835835lnxz22tg.R.iget(10525)!=0|true))||(__CLR4_2_0835835lnxz22tg.R.iget(10526)==0&false)))
                {__CLR4_2_0835835lnxz22tg.R.inc(10527);return false;

            }__CLR4_2_0835835lnxz22tg.R.inc(10528);Element parent = element.parent();
            __CLR4_2_0835835lnxz22tg.R.inc(10529);return parent != null && evaluator.matches(root, parent);
        }finally{__CLR4_2_0835835lnxz22tg.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_0835835lnxz22tg.R.inc(10530);
            __CLR4_2_0835835lnxz22tg.R.inc(10531);return String.format(":ImmediateParent%s", evaluator);
        }finally{__CLR4_2_0835835lnxz22tg.R.flushNeeded();}}
    }

    static class PreviousSibling extends StructuralEvaluator {
        public PreviousSibling(Evaluator evaluator) {try{__CLR4_2_0835835lnxz22tg.R.inc(10532);
            __CLR4_2_0835835lnxz22tg.R.inc(10533);this.evaluator = evaluator;
        }finally{__CLR4_2_0835835lnxz22tg.R.flushNeeded();}}

        public boolean matches(Element root, Element element) {try{__CLR4_2_0835835lnxz22tg.R.inc(10534);
            __CLR4_2_0835835lnxz22tg.R.inc(10535);if ((((root == element)&&(__CLR4_2_0835835lnxz22tg.R.iget(10536)!=0|true))||(__CLR4_2_0835835lnxz22tg.R.iget(10537)==0&false)))
                {__CLR4_2_0835835lnxz22tg.R.inc(10538);return false;

            }__CLR4_2_0835835lnxz22tg.R.inc(10539);Element prev = element.previousElementSibling();

            __CLR4_2_0835835lnxz22tg.R.inc(10540);while ((((prev != null)&&(__CLR4_2_0835835lnxz22tg.R.iget(10541)!=0|true))||(__CLR4_2_0835835lnxz22tg.R.iget(10542)==0&false))) {{
                __CLR4_2_0835835lnxz22tg.R.inc(10543);if ((((evaluator.matches(root, prev))&&(__CLR4_2_0835835lnxz22tg.R.iget(10544)!=0|true))||(__CLR4_2_0835835lnxz22tg.R.iget(10545)==0&false)))
                    {__CLR4_2_0835835lnxz22tg.R.inc(10546);return true;

                }__CLR4_2_0835835lnxz22tg.R.inc(10547);prev = prev.previousElementSibling();
            }
            }__CLR4_2_0835835lnxz22tg.R.inc(10548);return false;
        }finally{__CLR4_2_0835835lnxz22tg.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_0835835lnxz22tg.R.inc(10549);
            __CLR4_2_0835835lnxz22tg.R.inc(10550);return String.format(":prev*%s", evaluator);
        }finally{__CLR4_2_0835835lnxz22tg.R.flushNeeded();}}
    }

    static class ImmediatePreviousSibling extends StructuralEvaluator {
        public ImmediatePreviousSibling(Evaluator evaluator) {try{__CLR4_2_0835835lnxz22tg.R.inc(10551);
            __CLR4_2_0835835lnxz22tg.R.inc(10552);this.evaluator = evaluator;
        }finally{__CLR4_2_0835835lnxz22tg.R.flushNeeded();}}

        public boolean matches(Element root, Element element) {try{__CLR4_2_0835835lnxz22tg.R.inc(10553);
            __CLR4_2_0835835lnxz22tg.R.inc(10554);if ((((root == element)&&(__CLR4_2_0835835lnxz22tg.R.iget(10555)!=0|true))||(__CLR4_2_0835835lnxz22tg.R.iget(10556)==0&false)))
                {__CLR4_2_0835835lnxz22tg.R.inc(10557);return false;

            }__CLR4_2_0835835lnxz22tg.R.inc(10558);Element prev = element.previousElementSibling();
            __CLR4_2_0835835lnxz22tg.R.inc(10559);return prev != null && evaluator.matches(root, prev);
        }finally{__CLR4_2_0835835lnxz22tg.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_0835835lnxz22tg.R.inc(10560);
            __CLR4_2_0835835lnxz22tg.R.inc(10561);return String.format(":prev%s", evaluator);
        }finally{__CLR4_2_0835835lnxz22tg.R.flushNeeded();}}
    }
}
