/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.parser;

/**
 * A Parse Error records an error in the input HTML that occurs in either the tokenisation or the tree building phase.
 */
public class ParseError {public static class __CLR4_2_04zf4zflnxz22oo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,6471,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private int pos;
    private String errorMsg;

    ParseError(int pos, String errorMsg) {try{__CLR4_2_04zf4zflnxz22oo.R.inc(6459);
        __CLR4_2_04zf4zflnxz22oo.R.inc(6460);this.pos = pos;
        __CLR4_2_04zf4zflnxz22oo.R.inc(6461);this.errorMsg = errorMsg;
    }finally{__CLR4_2_04zf4zflnxz22oo.R.flushNeeded();}}

    ParseError(int pos, String errorFormat, Object... args) {try{__CLR4_2_04zf4zflnxz22oo.R.inc(6462);
        __CLR4_2_04zf4zflnxz22oo.R.inc(6463);this.errorMsg = String.format(errorFormat, args);
        __CLR4_2_04zf4zflnxz22oo.R.inc(6464);this.pos = pos;
    }finally{__CLR4_2_04zf4zflnxz22oo.R.flushNeeded();}}

    /**
     * Retrieve the error message.
     * @return the error message.
     */
    public String getErrorMessage() {try{__CLR4_2_04zf4zflnxz22oo.R.inc(6465);
        __CLR4_2_04zf4zflnxz22oo.R.inc(6466);return errorMsg;
    }finally{__CLR4_2_04zf4zflnxz22oo.R.flushNeeded();}}

    /**
     * Retrieves the offset of the error.
     * @return error offset within input
     */
    public int getPosition() {try{__CLR4_2_04zf4zflnxz22oo.R.inc(6467);
        __CLR4_2_04zf4zflnxz22oo.R.inc(6468);return pos;
    }finally{__CLR4_2_04zf4zflnxz22oo.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_2_04zf4zflnxz22oo.R.inc(6469);
        __CLR4_2_04zf4zflnxz22oo.R.inc(6470);return pos + ": " + errorMsg;
    }finally{__CLR4_2_04zf4zflnxz22oo.R.flushNeeded();}}
}
