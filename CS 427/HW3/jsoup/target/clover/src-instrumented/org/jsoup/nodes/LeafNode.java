/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.nodes;

import org.jsoup.helper.Validate;

import java.util.Collections;
import java.util.List;

abstract class LeafNode extends Node {public static class __CLR4_2_02iy2iylnxz22lq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,3329,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final List<Node> EmptyNodes = Collections.emptyList();

    Object value; // either a string value, or an attribute map (in the rare case multiple attributes are set)

    protected final boolean hasAttributes() {try{__CLR4_2_02iy2iylnxz22lq.R.inc(3274);
        __CLR4_2_02iy2iylnxz22lq.R.inc(3275);return value instanceof Attributes;
    }finally{__CLR4_2_02iy2iylnxz22lq.R.flushNeeded();}}

    @Override
    public final Attributes attributes() {try{__CLR4_2_02iy2iylnxz22lq.R.inc(3276);
        __CLR4_2_02iy2iylnxz22lq.R.inc(3277);ensureAttributes();
        __CLR4_2_02iy2iylnxz22lq.R.inc(3278);return (Attributes) value;
    }finally{__CLR4_2_02iy2iylnxz22lq.R.flushNeeded();}}

    private void ensureAttributes() {try{__CLR4_2_02iy2iylnxz22lq.R.inc(3279);
        __CLR4_2_02iy2iylnxz22lq.R.inc(3280);if ((((!hasAttributes())&&(__CLR4_2_02iy2iylnxz22lq.R.iget(3281)!=0|true))||(__CLR4_2_02iy2iylnxz22lq.R.iget(3282)==0&false))) {{
            __CLR4_2_02iy2iylnxz22lq.R.inc(3283);Object coreValue = value;
            __CLR4_2_02iy2iylnxz22lq.R.inc(3284);Attributes attributes = new Attributes();
            __CLR4_2_02iy2iylnxz22lq.R.inc(3285);value = attributes;
            __CLR4_2_02iy2iylnxz22lq.R.inc(3286);if ((((coreValue != null)&&(__CLR4_2_02iy2iylnxz22lq.R.iget(3287)!=0|true))||(__CLR4_2_02iy2iylnxz22lq.R.iget(3288)==0&false)))
                {__CLR4_2_02iy2iylnxz22lq.R.inc(3289);attributes.put(nodeName(), (String) coreValue);
        }}
    }}finally{__CLR4_2_02iy2iylnxz22lq.R.flushNeeded();}}

    String coreValue() {try{__CLR4_2_02iy2iylnxz22lq.R.inc(3290);
        __CLR4_2_02iy2iylnxz22lq.R.inc(3291);return attr(nodeName());
    }finally{__CLR4_2_02iy2iylnxz22lq.R.flushNeeded();}}

    void coreValue(String value) {try{__CLR4_2_02iy2iylnxz22lq.R.inc(3292);
        __CLR4_2_02iy2iylnxz22lq.R.inc(3293);attr(nodeName(), value);
    }finally{__CLR4_2_02iy2iylnxz22lq.R.flushNeeded();}}

    @Override
    public String attr(String key) {try{__CLR4_2_02iy2iylnxz22lq.R.inc(3294);
        __CLR4_2_02iy2iylnxz22lq.R.inc(3295);Validate.notNull(key);
        __CLR4_2_02iy2iylnxz22lq.R.inc(3296);if ((((!hasAttributes())&&(__CLR4_2_02iy2iylnxz22lq.R.iget(3297)!=0|true))||(__CLR4_2_02iy2iylnxz22lq.R.iget(3298)==0&false))) {{
            __CLR4_2_02iy2iylnxz22lq.R.inc(3299);return (((key.equals(nodeName()) )&&(__CLR4_2_02iy2iylnxz22lq.R.iget(3300)!=0|true))||(__CLR4_2_02iy2iylnxz22lq.R.iget(3301)==0&false))? (String) value : EmptyString;
        }
        }__CLR4_2_02iy2iylnxz22lq.R.inc(3302);return super.attr(key);
    }finally{__CLR4_2_02iy2iylnxz22lq.R.flushNeeded();}}

    @Override
    public Node attr(String key, String value) {try{__CLR4_2_02iy2iylnxz22lq.R.inc(3303);
        __CLR4_2_02iy2iylnxz22lq.R.inc(3304);if ((((!hasAttributes() && key.equals(nodeName()))&&(__CLR4_2_02iy2iylnxz22lq.R.iget(3305)!=0|true))||(__CLR4_2_02iy2iylnxz22lq.R.iget(3306)==0&false))) {{
            __CLR4_2_02iy2iylnxz22lq.R.inc(3307);this.value = value;
        } }else {{
            __CLR4_2_02iy2iylnxz22lq.R.inc(3308);ensureAttributes();
            __CLR4_2_02iy2iylnxz22lq.R.inc(3309);super.attr(key, value);
        }
        }__CLR4_2_02iy2iylnxz22lq.R.inc(3310);return this;
    }finally{__CLR4_2_02iy2iylnxz22lq.R.flushNeeded();}}

    @Override
    public boolean hasAttr(String key) {try{__CLR4_2_02iy2iylnxz22lq.R.inc(3311);
        __CLR4_2_02iy2iylnxz22lq.R.inc(3312);ensureAttributes();
        __CLR4_2_02iy2iylnxz22lq.R.inc(3313);return super.hasAttr(key);
    }finally{__CLR4_2_02iy2iylnxz22lq.R.flushNeeded();}}

    @Override
    public Node removeAttr(String key) {try{__CLR4_2_02iy2iylnxz22lq.R.inc(3314);
        __CLR4_2_02iy2iylnxz22lq.R.inc(3315);ensureAttributes();
        __CLR4_2_02iy2iylnxz22lq.R.inc(3316);return super.removeAttr(key);
    }finally{__CLR4_2_02iy2iylnxz22lq.R.flushNeeded();}}

    @Override
    public String absUrl(String key) {try{__CLR4_2_02iy2iylnxz22lq.R.inc(3317);
        __CLR4_2_02iy2iylnxz22lq.R.inc(3318);ensureAttributes();
        __CLR4_2_02iy2iylnxz22lq.R.inc(3319);return super.absUrl(key);
    }finally{__CLR4_2_02iy2iylnxz22lq.R.flushNeeded();}}

    @Override
    public String baseUri() {try{__CLR4_2_02iy2iylnxz22lq.R.inc(3320);
        __CLR4_2_02iy2iylnxz22lq.R.inc(3321);return (((hasParent() )&&(__CLR4_2_02iy2iylnxz22lq.R.iget(3322)!=0|true))||(__CLR4_2_02iy2iylnxz22lq.R.iget(3323)==0&false))? parent().baseUri() : "";
    }finally{__CLR4_2_02iy2iylnxz22lq.R.flushNeeded();}}

    @Override
    protected void doSetBaseUri(String baseUri) {try{__CLR4_2_02iy2iylnxz22lq.R.inc(3324);
        // noop
    }finally{__CLR4_2_02iy2iylnxz22lq.R.flushNeeded();}}

    @Override
    public int childNodeSize() {try{__CLR4_2_02iy2iylnxz22lq.R.inc(3325);
        __CLR4_2_02iy2iylnxz22lq.R.inc(3326);return 0;
    }finally{__CLR4_2_02iy2iylnxz22lq.R.flushNeeded();}}

    @Override
    protected List<Node> ensureChildNodes() {try{__CLR4_2_02iy2iylnxz22lq.R.inc(3327);
        __CLR4_2_02iy2iylnxz22lq.R.inc(3328);return EmptyNodes;
    }finally{__CLR4_2_02iy2iylnxz22lq.R.flushNeeded();}}
}
