/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.nodes;

import org.jsoup.internal.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document.OutputSettings.Syntax;

import java.io.IOException;

/**
 * A {@code <!DOCTYPE>} node.
 */
public class DocumentType extends LeafNode {public static class __CLR4_2_01r51r5lnxz22k2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,2333,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // todo needs a bit of a chunky cleanup. this level of detail isn't needed
    public static final String PUBLIC_KEY = "PUBLIC";
    public static final String SYSTEM_KEY = "SYSTEM";
    private static final String NAME = "name";
    private static final String PUB_SYS_KEY = "pubSysKey"; // PUBLIC or SYSTEM
    private static final String PUBLIC_ID = "publicId";
    private static final String SYSTEM_ID = "systemId";
    // todo: quirk mode from publicId and systemId

    /**
     * Create a new doctype element.
     * @param name the doctype's name
     * @param publicId the doctype's public ID
     * @param systemId the doctype's system ID
     */
    public DocumentType(String name, String publicId, String systemId) {try{__CLR4_2_01r51r5lnxz22k2.R.inc(2273);
        __CLR4_2_01r51r5lnxz22k2.R.inc(2274);Validate.notNull(name);
        __CLR4_2_01r51r5lnxz22k2.R.inc(2275);Validate.notNull(publicId);
        __CLR4_2_01r51r5lnxz22k2.R.inc(2276);Validate.notNull(systemId);
        __CLR4_2_01r51r5lnxz22k2.R.inc(2277);attr(NAME, name);
        __CLR4_2_01r51r5lnxz22k2.R.inc(2278);attr(PUBLIC_ID, publicId);
        __CLR4_2_01r51r5lnxz22k2.R.inc(2279);if ((((has(PUBLIC_ID))&&(__CLR4_2_01r51r5lnxz22k2.R.iget(2280)!=0|true))||(__CLR4_2_01r51r5lnxz22k2.R.iget(2281)==0&false))) {{
            __CLR4_2_01r51r5lnxz22k2.R.inc(2282);attr(PUB_SYS_KEY, PUBLIC_KEY);
        }
        }__CLR4_2_01r51r5lnxz22k2.R.inc(2283);attr(SYSTEM_ID, systemId);
    }finally{__CLR4_2_01r51r5lnxz22k2.R.flushNeeded();}}

    /**
     * Create a new doctype element.
     * @param name the doctype's name
     * @param publicId the doctype's public ID
     * @param systemId the doctype's system ID
     * @param baseUri unused
     * @deprecated
     */
    public DocumentType(String name, String publicId, String systemId, String baseUri) {try{__CLR4_2_01r51r5lnxz22k2.R.inc(2284);
        __CLR4_2_01r51r5lnxz22k2.R.inc(2285);attr(NAME, name);
        __CLR4_2_01r51r5lnxz22k2.R.inc(2286);attr(PUBLIC_ID, publicId);
        __CLR4_2_01r51r5lnxz22k2.R.inc(2287);if ((((has(PUBLIC_ID))&&(__CLR4_2_01r51r5lnxz22k2.R.iget(2288)!=0|true))||(__CLR4_2_01r51r5lnxz22k2.R.iget(2289)==0&false))) {{
            __CLR4_2_01r51r5lnxz22k2.R.inc(2290);attr(PUB_SYS_KEY, PUBLIC_KEY);
        }
        }__CLR4_2_01r51r5lnxz22k2.R.inc(2291);attr(SYSTEM_ID, systemId);
    }finally{__CLR4_2_01r51r5lnxz22k2.R.flushNeeded();}}

    /**
     * Create a new doctype element.
     * @param name the doctype's name
     * @param publicId the doctype's public ID
     * @param systemId the doctype's system ID
     * @param baseUri unused
     * @deprecated
     */
    public DocumentType(String name, String pubSysKey, String publicId, String systemId, String baseUri) {try{__CLR4_2_01r51r5lnxz22k2.R.inc(2292);
        __CLR4_2_01r51r5lnxz22k2.R.inc(2293);attr(NAME, name);
        __CLR4_2_01r51r5lnxz22k2.R.inc(2294);if ((((pubSysKey != null)&&(__CLR4_2_01r51r5lnxz22k2.R.iget(2295)!=0|true))||(__CLR4_2_01r51r5lnxz22k2.R.iget(2296)==0&false))) {{
            __CLR4_2_01r51r5lnxz22k2.R.inc(2297);attr(PUB_SYS_KEY, pubSysKey);
        }
        }__CLR4_2_01r51r5lnxz22k2.R.inc(2298);attr(PUBLIC_ID, publicId);
        __CLR4_2_01r51r5lnxz22k2.R.inc(2299);attr(SYSTEM_ID, systemId);
    }finally{__CLR4_2_01r51r5lnxz22k2.R.flushNeeded();}}
    public void setPubSysKey(String value) {try{__CLR4_2_01r51r5lnxz22k2.R.inc(2300);
        __CLR4_2_01r51r5lnxz22k2.R.inc(2301);if ((((value != null)&&(__CLR4_2_01r51r5lnxz22k2.R.iget(2302)!=0|true))||(__CLR4_2_01r51r5lnxz22k2.R.iget(2303)==0&false)))
            {__CLR4_2_01r51r5lnxz22k2.R.inc(2304);attr(PUB_SYS_KEY, value);
    }}finally{__CLR4_2_01r51r5lnxz22k2.R.flushNeeded();}}

    @Override
    public String nodeName() {try{__CLR4_2_01r51r5lnxz22k2.R.inc(2305);
        __CLR4_2_01r51r5lnxz22k2.R.inc(2306);return "#doctype";
    }finally{__CLR4_2_01r51r5lnxz22k2.R.flushNeeded();}}

    @Override
    void outerHtmlHead(Appendable accum, int depth, Document.OutputSettings out) throws IOException {try{__CLR4_2_01r51r5lnxz22k2.R.inc(2307);
        __CLR4_2_01r51r5lnxz22k2.R.inc(2308);if ((((out.syntax() == Syntax.html && !has(PUBLIC_ID) && !has(SYSTEM_ID))&&(__CLR4_2_01r51r5lnxz22k2.R.iget(2309)!=0|true))||(__CLR4_2_01r51r5lnxz22k2.R.iget(2310)==0&false))) {{
            // looks like a html5 doctype, go lowercase for aesthetics
            __CLR4_2_01r51r5lnxz22k2.R.inc(2311);accum.append("<!doctype");
        } }else {{
            __CLR4_2_01r51r5lnxz22k2.R.inc(2312);accum.append("<!DOCTYPE");
        }
        }__CLR4_2_01r51r5lnxz22k2.R.inc(2313);if ((((has(NAME))&&(__CLR4_2_01r51r5lnxz22k2.R.iget(2314)!=0|true))||(__CLR4_2_01r51r5lnxz22k2.R.iget(2315)==0&false)))
            {__CLR4_2_01r51r5lnxz22k2.R.inc(2316);accum.append(" ").append(attr(NAME));
        }__CLR4_2_01r51r5lnxz22k2.R.inc(2317);if ((((has(PUB_SYS_KEY))&&(__CLR4_2_01r51r5lnxz22k2.R.iget(2318)!=0|true))||(__CLR4_2_01r51r5lnxz22k2.R.iget(2319)==0&false)))
            {__CLR4_2_01r51r5lnxz22k2.R.inc(2320);accum.append(" ").append(attr(PUB_SYS_KEY));
        }__CLR4_2_01r51r5lnxz22k2.R.inc(2321);if ((((has(PUBLIC_ID))&&(__CLR4_2_01r51r5lnxz22k2.R.iget(2322)!=0|true))||(__CLR4_2_01r51r5lnxz22k2.R.iget(2323)==0&false)))
            {__CLR4_2_01r51r5lnxz22k2.R.inc(2324);accum.append(" \"").append(attr(PUBLIC_ID)).append('"');
        }__CLR4_2_01r51r5lnxz22k2.R.inc(2325);if ((((has(SYSTEM_ID))&&(__CLR4_2_01r51r5lnxz22k2.R.iget(2326)!=0|true))||(__CLR4_2_01r51r5lnxz22k2.R.iget(2327)==0&false)))
            {__CLR4_2_01r51r5lnxz22k2.R.inc(2328);accum.append(" \"").append(attr(SYSTEM_ID)).append('"');
        }__CLR4_2_01r51r5lnxz22k2.R.inc(2329);accum.append('>');
    }finally{__CLR4_2_01r51r5lnxz22k2.R.flushNeeded();}}

    @Override
    void outerHtmlTail(Appendable accum, int depth, Document.OutputSettings out) {try{__CLR4_2_01r51r5lnxz22k2.R.inc(2330);
    }finally{__CLR4_2_01r51r5lnxz22k2.R.flushNeeded();}}

    private boolean has(final String attribute) {try{__CLR4_2_01r51r5lnxz22k2.R.inc(2331);
        __CLR4_2_01r51r5lnxz22k2.R.inc(2332);return !StringUtil.isBlank(attr(attribute));
    }finally{__CLR4_2_01r51r5lnxz22k2.R.flushNeeded();}}
}
