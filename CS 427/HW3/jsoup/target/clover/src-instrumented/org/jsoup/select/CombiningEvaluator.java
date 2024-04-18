/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.select;

import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Base combining (and, or) evaluator.
 */
abstract class CombiningEvaluator extends Evaluator {public static class __CLR4_2_078n78nlnxz22ry{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,9441,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    final ArrayList<Evaluator> evaluators;
    int num = 0;

    CombiningEvaluator() {
        super();__CLR4_2_078n78nlnxz22ry.R.inc(9384);try{__CLR4_2_078n78nlnxz22ry.R.inc(9383);
        __CLR4_2_078n78nlnxz22ry.R.inc(9385);evaluators = new ArrayList<>();
    }finally{__CLR4_2_078n78nlnxz22ry.R.flushNeeded();}}

    CombiningEvaluator(Collection<Evaluator> evaluators) {
        this();__CLR4_2_078n78nlnxz22ry.R.inc(9387);try{__CLR4_2_078n78nlnxz22ry.R.inc(9386);
        __CLR4_2_078n78nlnxz22ry.R.inc(9388);this.evaluators.addAll(evaluators);
        __CLR4_2_078n78nlnxz22ry.R.inc(9389);updateNumEvaluators();
    }finally{__CLR4_2_078n78nlnxz22ry.R.flushNeeded();}}

    Evaluator rightMostEvaluator() {try{__CLR4_2_078n78nlnxz22ry.R.inc(9390);
        __CLR4_2_078n78nlnxz22ry.R.inc(9391);return (((num > 0 )&&(__CLR4_2_078n78nlnxz22ry.R.iget(9392)!=0|true))||(__CLR4_2_078n78nlnxz22ry.R.iget(9393)==0&false))? evaluators.get(num - 1) : null;
    }finally{__CLR4_2_078n78nlnxz22ry.R.flushNeeded();}}
    
    void replaceRightMostEvaluator(Evaluator replacement) {try{__CLR4_2_078n78nlnxz22ry.R.inc(9394);
        __CLR4_2_078n78nlnxz22ry.R.inc(9395);evaluators.set(num - 1, replacement);
    }finally{__CLR4_2_078n78nlnxz22ry.R.flushNeeded();}}

    void updateNumEvaluators() {try{__CLR4_2_078n78nlnxz22ry.R.inc(9396);
        // used so we don't need to bash on size() for every match test
        __CLR4_2_078n78nlnxz22ry.R.inc(9397);num = evaluators.size();
    }finally{__CLR4_2_078n78nlnxz22ry.R.flushNeeded();}}

    static final class And extends CombiningEvaluator {
        And(Collection<Evaluator> evaluators) {
            super(evaluators);__CLR4_2_078n78nlnxz22ry.R.inc(9399);try{__CLR4_2_078n78nlnxz22ry.R.inc(9398);
        }finally{__CLR4_2_078n78nlnxz22ry.R.flushNeeded();}}

        And(Evaluator... evaluators) {
            this(Arrays.asList(evaluators));__CLR4_2_078n78nlnxz22ry.R.inc(9401);try{__CLR4_2_078n78nlnxz22ry.R.inc(9400);
        }finally{__CLR4_2_078n78nlnxz22ry.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element node) {try{__CLR4_2_078n78nlnxz22ry.R.inc(9402);
            __CLR4_2_078n78nlnxz22ry.R.inc(9403);for (int i = 0; (((i < num)&&(__CLR4_2_078n78nlnxz22ry.R.iget(9404)!=0|true))||(__CLR4_2_078n78nlnxz22ry.R.iget(9405)==0&false)); i++) {{
                __CLR4_2_078n78nlnxz22ry.R.inc(9406);Evaluator s = evaluators.get(i);
                __CLR4_2_078n78nlnxz22ry.R.inc(9407);if ((((!s.matches(root, node))&&(__CLR4_2_078n78nlnxz22ry.R.iget(9408)!=0|true))||(__CLR4_2_078n78nlnxz22ry.R.iget(9409)==0&false)))
                    {__CLR4_2_078n78nlnxz22ry.R.inc(9410);return false;
            }}
            }__CLR4_2_078n78nlnxz22ry.R.inc(9411);return true;
        }finally{__CLR4_2_078n78nlnxz22ry.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_078n78nlnxz22ry.R.inc(9412);
            __CLR4_2_078n78nlnxz22ry.R.inc(9413);return StringUtil.join(evaluators, " ");
        }finally{__CLR4_2_078n78nlnxz22ry.R.flushNeeded();}}
    }

    static final class Or extends CombiningEvaluator {
        /**
         * Create a new Or evaluator. The initial evaluators are ANDed together and used as the first clause of the OR.
         * @param evaluators initial OR clause (these are wrapped into an AND evaluator).
         */
        Or(Collection<Evaluator> evaluators) {
            super();__CLR4_2_078n78nlnxz22ry.R.inc(9415);try{__CLR4_2_078n78nlnxz22ry.R.inc(9414);
            __CLR4_2_078n78nlnxz22ry.R.inc(9416);if ((((num > 1)&&(__CLR4_2_078n78nlnxz22ry.R.iget(9417)!=0|true))||(__CLR4_2_078n78nlnxz22ry.R.iget(9418)==0&false)))
                {__CLR4_2_078n78nlnxz22ry.R.inc(9419);this.evaluators.add(new And(evaluators));
            }else // 0 or 1
                {__CLR4_2_078n78nlnxz22ry.R.inc(9420);this.evaluators.addAll(evaluators);
            }__CLR4_2_078n78nlnxz22ry.R.inc(9421);updateNumEvaluators();
        }finally{__CLR4_2_078n78nlnxz22ry.R.flushNeeded();}}

        Or(Evaluator... evaluators) { this(Arrays.asList(evaluators));__CLR4_2_078n78nlnxz22ry.R.inc(9423);try{__CLR4_2_078n78nlnxz22ry.R.inc(9422); }finally{__CLR4_2_078n78nlnxz22ry.R.flushNeeded();}}

        Or() {
            super();__CLR4_2_078n78nlnxz22ry.R.inc(9425);try{__CLR4_2_078n78nlnxz22ry.R.inc(9424);
        }finally{__CLR4_2_078n78nlnxz22ry.R.flushNeeded();}}

        public void add(Evaluator e) {try{__CLR4_2_078n78nlnxz22ry.R.inc(9426);
            __CLR4_2_078n78nlnxz22ry.R.inc(9427);evaluators.add(e);
            __CLR4_2_078n78nlnxz22ry.R.inc(9428);updateNumEvaluators();
        }finally{__CLR4_2_078n78nlnxz22ry.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element node) {try{__CLR4_2_078n78nlnxz22ry.R.inc(9429);
            __CLR4_2_078n78nlnxz22ry.R.inc(9430);for (int i = 0; (((i < num)&&(__CLR4_2_078n78nlnxz22ry.R.iget(9431)!=0|true))||(__CLR4_2_078n78nlnxz22ry.R.iget(9432)==0&false)); i++) {{
                __CLR4_2_078n78nlnxz22ry.R.inc(9433);Evaluator s = evaluators.get(i);
                __CLR4_2_078n78nlnxz22ry.R.inc(9434);if ((((s.matches(root, node))&&(__CLR4_2_078n78nlnxz22ry.R.iget(9435)!=0|true))||(__CLR4_2_078n78nlnxz22ry.R.iget(9436)==0&false)))
                    {__CLR4_2_078n78nlnxz22ry.R.inc(9437);return true;
            }}
            }__CLR4_2_078n78nlnxz22ry.R.inc(9438);return false;
        }finally{__CLR4_2_078n78nlnxz22ry.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_078n78nlnxz22ry.R.inc(9439);
            __CLR4_2_078n78nlnxz22ry.R.inc(9440);return StringUtil.join(evaluators, ", ");
        }finally{__CLR4_2_078n78nlnxz22ry.R.flushNeeded();}}
    }
}
