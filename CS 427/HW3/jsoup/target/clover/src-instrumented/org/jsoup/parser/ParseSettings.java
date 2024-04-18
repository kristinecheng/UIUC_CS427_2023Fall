/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.parser;

import org.jsoup.nodes.Attributes;

import static org.jsoup.internal.Normalizer.lowerCase;

/**
 * Controls parser settings, to optionally preserve tag and/or attribute name case.
 */
public class ParseSettings {public static class __CLR4_2_0502502lnxz22ou{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,6512,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * HTML default settings: both tag and attribute names are lower-cased during parsing.
     */
    public static final ParseSettings htmlDefault;
    /**
     * Preserve both tag and attribute case.
     */
    public static final ParseSettings preserveCase;

    static {try{__CLR4_2_0502502lnxz22ou.R.inc(6482);
        __CLR4_2_0502502lnxz22ou.R.inc(6483);htmlDefault = new ParseSettings(false, false);
        __CLR4_2_0502502lnxz22ou.R.inc(6484);preserveCase = new ParseSettings(true, true);
    }finally{__CLR4_2_0502502lnxz22ou.R.flushNeeded();}}

    private final boolean preserveTagCase;
    private final boolean preserveAttributeCase;

    /**
     * Returns true if preserving tag name case.
     */
    public boolean preserveTagCase() {try{__CLR4_2_0502502lnxz22ou.R.inc(6485);
        __CLR4_2_0502502lnxz22ou.R.inc(6486);return preserveTagCase;
    }finally{__CLR4_2_0502502lnxz22ou.R.flushNeeded();}}

    /**
     * Returns true if preserving attribute case.
     */
    public boolean preserveAttributeCase() {try{__CLR4_2_0502502lnxz22ou.R.inc(6487);
        __CLR4_2_0502502lnxz22ou.R.inc(6488);return preserveAttributeCase;
    }finally{__CLR4_2_0502502lnxz22ou.R.flushNeeded();}}

    /**
     * Define parse settings.
     * @param tag preserve tag case?
     * @param attribute preserve attribute name case?
     */
    public ParseSettings(boolean tag, boolean attribute) {try{__CLR4_2_0502502lnxz22ou.R.inc(6489);
        __CLR4_2_0502502lnxz22ou.R.inc(6490);preserveTagCase = tag;
        __CLR4_2_0502502lnxz22ou.R.inc(6491);preserveAttributeCase = attribute;
    }finally{__CLR4_2_0502502lnxz22ou.R.flushNeeded();}}

    /**
     * Normalizes a tag name according to the case preservation setting.
     */
    public String normalizeTag(String name) {try{__CLR4_2_0502502lnxz22ou.R.inc(6492);
        __CLR4_2_0502502lnxz22ou.R.inc(6493);name = name.trim();
        __CLR4_2_0502502lnxz22ou.R.inc(6494);if ((((!preserveTagCase)&&(__CLR4_2_0502502lnxz22ou.R.iget(6495)!=0|true))||(__CLR4_2_0502502lnxz22ou.R.iget(6496)==0&false)))
            {__CLR4_2_0502502lnxz22ou.R.inc(6497);name = lowerCase(name);
        }__CLR4_2_0502502lnxz22ou.R.inc(6498);return name;
    }finally{__CLR4_2_0502502lnxz22ou.R.flushNeeded();}}

    /**
     * Normalizes an attribute according to the case preservation setting.
     */
    public String normalizeAttribute(String name) {try{__CLR4_2_0502502lnxz22ou.R.inc(6499);
        __CLR4_2_0502502lnxz22ou.R.inc(6500);name = name.trim();
        __CLR4_2_0502502lnxz22ou.R.inc(6501);if ((((!preserveAttributeCase)&&(__CLR4_2_0502502lnxz22ou.R.iget(6502)!=0|true))||(__CLR4_2_0502502lnxz22ou.R.iget(6503)==0&false)))
            {__CLR4_2_0502502lnxz22ou.R.inc(6504);name = lowerCase(name);
        }__CLR4_2_0502502lnxz22ou.R.inc(6505);return name;
    }finally{__CLR4_2_0502502lnxz22ou.R.flushNeeded();}}

    Attributes normalizeAttributes(Attributes attributes) {try{__CLR4_2_0502502lnxz22ou.R.inc(6506);
        __CLR4_2_0502502lnxz22ou.R.inc(6507);if ((((!preserveAttributeCase)&&(__CLR4_2_0502502lnxz22ou.R.iget(6508)!=0|true))||(__CLR4_2_0502502lnxz22ou.R.iget(6509)==0&false))) {{
            __CLR4_2_0502502lnxz22ou.R.inc(6510);attributes.normalize();
        }
        }__CLR4_2_0502502lnxz22ou.R.inc(6511);return attributes;
    }finally{__CLR4_2_0502502lnxz22ou.R.flushNeeded();}}
}
