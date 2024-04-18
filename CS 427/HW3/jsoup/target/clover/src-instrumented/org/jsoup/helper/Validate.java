/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.helper;

/**
 * Simple validation methods. Designed for jsoup internal use
 */
public final class Validate {public static class __CLR4_2_0xkxklnxz22h0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,1259,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private Validate() {try{__CLR4_2_0xkxklnxz22h0.R.inc(1208);}finally{__CLR4_2_0xkxklnxz22h0.R.flushNeeded();}}

    /**
     * Validates that the object is not null
     * @param obj object to test
     */
    public static void notNull(Object obj) {try{__CLR4_2_0xkxklnxz22h0.R.inc(1209);
        __CLR4_2_0xkxklnxz22h0.R.inc(1210);if ((((obj == null)&&(__CLR4_2_0xkxklnxz22h0.R.iget(1211)!=0|true))||(__CLR4_2_0xkxklnxz22h0.R.iget(1212)==0&false)))
            {__CLR4_2_0xkxklnxz22h0.R.inc(1213);throw new IllegalArgumentException("Object must not be null");
    }}finally{__CLR4_2_0xkxklnxz22h0.R.flushNeeded();}}

    /**
     * Validates that the object is not null
     * @param obj object to test
     * @param msg message to output if validation fails
     */
    public static void notNull(Object obj, String msg) {try{__CLR4_2_0xkxklnxz22h0.R.inc(1214);
        __CLR4_2_0xkxklnxz22h0.R.inc(1215);if ((((obj == null)&&(__CLR4_2_0xkxklnxz22h0.R.iget(1216)!=0|true))||(__CLR4_2_0xkxklnxz22h0.R.iget(1217)==0&false)))
            {__CLR4_2_0xkxklnxz22h0.R.inc(1218);throw new IllegalArgumentException(msg);
    }}finally{__CLR4_2_0xkxklnxz22h0.R.flushNeeded();}}

    /**
     * Validates that the value is true
     * @param val object to test
     */
    public static void isTrue(boolean val) {try{__CLR4_2_0xkxklnxz22h0.R.inc(1219);
        __CLR4_2_0xkxklnxz22h0.R.inc(1220);if ((((!val)&&(__CLR4_2_0xkxklnxz22h0.R.iget(1221)!=0|true))||(__CLR4_2_0xkxklnxz22h0.R.iget(1222)==0&false)))
            {__CLR4_2_0xkxklnxz22h0.R.inc(1223);throw new IllegalArgumentException("Must be true");
    }}finally{__CLR4_2_0xkxklnxz22h0.R.flushNeeded();}}

    /**
     * Validates that the value is true
     * @param val object to test
     * @param msg message to output if validation fails
     */
    public static void isTrue(boolean val, String msg) {try{__CLR4_2_0xkxklnxz22h0.R.inc(1224);
        __CLR4_2_0xkxklnxz22h0.R.inc(1225);if ((((!val)&&(__CLR4_2_0xkxklnxz22h0.R.iget(1226)!=0|true))||(__CLR4_2_0xkxklnxz22h0.R.iget(1227)==0&false)))
            {__CLR4_2_0xkxklnxz22h0.R.inc(1228);throw new IllegalArgumentException(msg);
    }}finally{__CLR4_2_0xkxklnxz22h0.R.flushNeeded();}}

    /**
     * Validates that the value is false
     * @param val object to test
     */
    public static void isFalse(boolean val) {try{__CLR4_2_0xkxklnxz22h0.R.inc(1229);
        __CLR4_2_0xkxklnxz22h0.R.inc(1230);if ((((val)&&(__CLR4_2_0xkxklnxz22h0.R.iget(1231)!=0|true))||(__CLR4_2_0xkxklnxz22h0.R.iget(1232)==0&false)))
            {__CLR4_2_0xkxklnxz22h0.R.inc(1233);throw new IllegalArgumentException("Must be false");
    }}finally{__CLR4_2_0xkxklnxz22h0.R.flushNeeded();}}

    /**
     * Validates that the value is false
     * @param val object to test
     * @param msg message to output if validation fails
     */
    public static void isFalse(boolean val, String msg) {try{__CLR4_2_0xkxklnxz22h0.R.inc(1234);
        __CLR4_2_0xkxklnxz22h0.R.inc(1235);if ((((val)&&(__CLR4_2_0xkxklnxz22h0.R.iget(1236)!=0|true))||(__CLR4_2_0xkxklnxz22h0.R.iget(1237)==0&false)))
            {__CLR4_2_0xkxklnxz22h0.R.inc(1238);throw new IllegalArgumentException(msg);
    }}finally{__CLR4_2_0xkxklnxz22h0.R.flushNeeded();}}

    /**
     * Validates that the array contains no null elements
     * @param objects the array to test
     */
    public static void noNullElements(Object[] objects) {try{__CLR4_2_0xkxklnxz22h0.R.inc(1239);
        __CLR4_2_0xkxklnxz22h0.R.inc(1240);noNullElements(objects, "Array must not contain any null objects");
    }finally{__CLR4_2_0xkxklnxz22h0.R.flushNeeded();}}

    /**
     * Validates that the array contains no null elements
     * @param objects the array to test
     * @param msg message to output if validation fails
     */
    public static void noNullElements(Object[] objects, String msg) {try{__CLR4_2_0xkxklnxz22h0.R.inc(1241);
        __CLR4_2_0xkxklnxz22h0.R.inc(1242);for (Object obj : objects)
            {__CLR4_2_0xkxklnxz22h0.R.inc(1243);if ((((obj == null)&&(__CLR4_2_0xkxklnxz22h0.R.iget(1244)!=0|true))||(__CLR4_2_0xkxklnxz22h0.R.iget(1245)==0&false)))
                {__CLR4_2_0xkxklnxz22h0.R.inc(1246);throw new IllegalArgumentException(msg);
    }}}finally{__CLR4_2_0xkxklnxz22h0.R.flushNeeded();}}

    /**
     * Validates that the string is not empty
     * @param string the string to test
     */
    public static void notEmpty(String string) {try{__CLR4_2_0xkxklnxz22h0.R.inc(1247);
        __CLR4_2_0xkxklnxz22h0.R.inc(1248);if ((((string == null || string.length() == 0)&&(__CLR4_2_0xkxklnxz22h0.R.iget(1249)!=0|true))||(__CLR4_2_0xkxklnxz22h0.R.iget(1250)==0&false)))
            {__CLR4_2_0xkxklnxz22h0.R.inc(1251);throw new IllegalArgumentException("String must not be empty");
    }}finally{__CLR4_2_0xkxklnxz22h0.R.flushNeeded();}}

    /**
     * Validates that the string is not empty
     * @param string the string to test
     * @param msg message to output if validation fails
     */
    public static void notEmpty(String string, String msg) {try{__CLR4_2_0xkxklnxz22h0.R.inc(1252);
        __CLR4_2_0xkxklnxz22h0.R.inc(1253);if ((((string == null || string.length() == 0)&&(__CLR4_2_0xkxklnxz22h0.R.iget(1254)!=0|true))||(__CLR4_2_0xkxklnxz22h0.R.iget(1255)==0&false)))
            {__CLR4_2_0xkxklnxz22h0.R.inc(1256);throw new IllegalArgumentException(msg);
    }}finally{__CLR4_2_0xkxklnxz22h0.R.flushNeeded();}}

    /**
     Cause a failure.
     @param msg message to output.
     */
    public static void fail(String msg) {try{__CLR4_2_0xkxklnxz22h0.R.inc(1257);
        __CLR4_2_0xkxklnxz22h0.R.inc(1258);throw new IllegalArgumentException(msg);
    }finally{__CLR4_2_0xkxklnxz22h0.R.flushNeeded();}}
}
