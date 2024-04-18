/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;

public class MultiLocaleRule implements TestRule {public static class __CLR4_2_085e85elnxz22w1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767707166L,8589935092L,10579,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MultiLocaleTest {
    }

    @Override
    public Statement apply(final Statement statement, final Description description) {try{__CLR4_2_085e85elnxz22w1.R.inc(10562);
        __CLR4_2_085e85elnxz22w1.R.inc(10563);return new Statement() {
            @Override
            public void evaluate() throws Throwable {try{__CLR4_2_085e85elnxz22w1.R.inc(10564);
                __CLR4_2_085e85elnxz22w1.R.inc(10565);MultiLocaleTest annotation = description.getAnnotation(MultiLocaleTest.class);
                __CLR4_2_085e85elnxz22w1.R.inc(10566);if ((((annotation == null)&&(__CLR4_2_085e85elnxz22w1.R.iget(10567)!=0|true))||(__CLR4_2_085e85elnxz22w1.R.iget(10568)==0&false))) {{
                    __CLR4_2_085e85elnxz22w1.R.inc(10569);statement.evaluate();
                    __CLR4_2_085e85elnxz22w1.R.inc(10570);return;
                }

                }__CLR4_2_085e85elnxz22w1.R.inc(10571);evaluateWithLocale(Locale.ENGLISH);
                __CLR4_2_085e85elnxz22w1.R.inc(10572);evaluateWithLocale(new Locale("tr"));
            }finally{__CLR4_2_085e85elnxz22w1.R.flushNeeded();}}

            private void evaluateWithLocale(Locale locale) throws Throwable {try{__CLR4_2_085e85elnxz22w1.R.inc(10573);
                __CLR4_2_085e85elnxz22w1.R.inc(10574);Locale oldLocale = Locale.getDefault();
                __CLR4_2_085e85elnxz22w1.R.inc(10575);Locale.setDefault(locale);
                __CLR4_2_085e85elnxz22w1.R.inc(10576);try {
                    __CLR4_2_085e85elnxz22w1.R.inc(10577);statement.evaluate();
                } finally {
                    __CLR4_2_085e85elnxz22w1.R.inc(10578);Locale.setDefault(oldLocale);
                }
            }finally{__CLR4_2_085e85elnxz22w1.R.flushNeeded();}}
        };
    }finally{__CLR4_2_085e85elnxz22w1.R.flushNeeded();}}
}
