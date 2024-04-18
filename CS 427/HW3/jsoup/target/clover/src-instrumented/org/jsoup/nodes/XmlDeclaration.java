/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.nodes;

import org.jsoup.SerializationException;
import org.jsoup.internal.StringUtil;
import org.jsoup.helper.Validate;

import java.io.IOException;

/**
 * An XML Declaration.
 */
public class XmlDeclaration extends LeafNode {public static class __CLR4_2_02v82v8lnxz22mi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,3750,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // todo this impl isn't really right, the data shouldn't be attributes, just a run of text after the name
    private final boolean isProcessingInstruction; // <! if true, <? if false, declaration (and last data char should be ?)

    /**
     * Create a new XML declaration
     * @param name of declaration
     * @param isProcessingInstruction is processing instruction
     */
    public XmlDeclaration(String name, boolean isProcessingInstruction) {try{__CLR4_2_02v82v8lnxz22mi.R.inc(3716);
        __CLR4_2_02v82v8lnxz22mi.R.inc(3717);Validate.notNull(name);
        __CLR4_2_02v82v8lnxz22mi.R.inc(3718);value = name;
        __CLR4_2_02v82v8lnxz22mi.R.inc(3719);this.isProcessingInstruction = isProcessingInstruction;
    }finally{__CLR4_2_02v82v8lnxz22mi.R.flushNeeded();}}

    /**
     * Create a new XML declaration
     * @param name of declaration
     * @param baseUri Leaf Nodes don't have base URIs; they inherit from their Element
     * @param isProcessingInstruction is processing instruction
     * @see XmlDeclaration#XmlDeclaration(String, boolean)
     * @deprecated
     */
    public XmlDeclaration(String name, String baseUri, boolean isProcessingInstruction) {
        this(name, isProcessingInstruction);__CLR4_2_02v82v8lnxz22mi.R.inc(3721);try{__CLR4_2_02v82v8lnxz22mi.R.inc(3720);
    }finally{__CLR4_2_02v82v8lnxz22mi.R.flushNeeded();}}

    public String nodeName() {try{__CLR4_2_02v82v8lnxz22mi.R.inc(3722);
        __CLR4_2_02v82v8lnxz22mi.R.inc(3723);return "#declaration";
    }finally{__CLR4_2_02v82v8lnxz22mi.R.flushNeeded();}}

    /**
     * Get the name of this declaration.
     * @return name of this declaration.
     */
    public String name() {try{__CLR4_2_02v82v8lnxz22mi.R.inc(3724);
        __CLR4_2_02v82v8lnxz22mi.R.inc(3725);return coreValue();
    }finally{__CLR4_2_02v82v8lnxz22mi.R.flushNeeded();}}

    /**
     * Get the unencoded XML declaration.
     * @return XML declaration
     */
    public String getWholeDeclaration() {try{__CLR4_2_02v82v8lnxz22mi.R.inc(3726);
        __CLR4_2_02v82v8lnxz22mi.R.inc(3727);StringBuilder sb = StringUtil.borrowBuilder();
        __CLR4_2_02v82v8lnxz22mi.R.inc(3728);try {
            __CLR4_2_02v82v8lnxz22mi.R.inc(3729);getWholeDeclaration(sb, new Document.OutputSettings());
        } catch (IOException e) {
            __CLR4_2_02v82v8lnxz22mi.R.inc(3730);throw new SerializationException(e);
        }
        __CLR4_2_02v82v8lnxz22mi.R.inc(3731);return StringUtil.releaseBuilder(sb).trim();
    }finally{__CLR4_2_02v82v8lnxz22mi.R.flushNeeded();}}

    private void getWholeDeclaration(Appendable accum, Document.OutputSettings out) throws IOException {try{__CLR4_2_02v82v8lnxz22mi.R.inc(3732);
        __CLR4_2_02v82v8lnxz22mi.R.inc(3733);for (Attribute attribute : attributes()) {{
            __CLR4_2_02v82v8lnxz22mi.R.inc(3734);if ((((!attribute.getKey().equals(nodeName()))&&(__CLR4_2_02v82v8lnxz22mi.R.iget(3735)!=0|true))||(__CLR4_2_02v82v8lnxz22mi.R.iget(3736)==0&false))) {{ // skips coreValue (name)
                __CLR4_2_02v82v8lnxz22mi.R.inc(3737);accum.append(' ');
                __CLR4_2_02v82v8lnxz22mi.R.inc(3738);attribute.html(accum, out);
            }
        }}
    }}finally{__CLR4_2_02v82v8lnxz22mi.R.flushNeeded();}}

    void outerHtmlHead(Appendable accum, int depth, Document.OutputSettings out) throws IOException {try{__CLR4_2_02v82v8lnxz22mi.R.inc(3739);
        __CLR4_2_02v82v8lnxz22mi.R.inc(3740);accum
            .append("<")
            .append((((isProcessingInstruction )&&(__CLR4_2_02v82v8lnxz22mi.R.iget(3741)!=0|true))||(__CLR4_2_02v82v8lnxz22mi.R.iget(3742)==0&false))? "!" : "?")
            .append(coreValue());
        __CLR4_2_02v82v8lnxz22mi.R.inc(3743);getWholeDeclaration(accum, out);
        __CLR4_2_02v82v8lnxz22mi.R.inc(3744);accum
            .append((((isProcessingInstruction )&&(__CLR4_2_02v82v8lnxz22mi.R.iget(3745)!=0|true))||(__CLR4_2_02v82v8lnxz22mi.R.iget(3746)==0&false))? "!" : "?")
            .append(">");
    }finally{__CLR4_2_02v82v8lnxz22mi.R.flushNeeded();}}

    void outerHtmlTail(Appendable accum, int depth, Document.OutputSettings out) {try{__CLR4_2_02v82v8lnxz22mi.R.inc(3747);
    }finally{__CLR4_2_02v82v8lnxz22mi.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_2_02v82v8lnxz22mi.R.inc(3748);
        __CLR4_2_02v82v8lnxz22mi.R.inc(3749);return outerHtml();
    }finally{__CLR4_2_02v82v8lnxz22mi.R.flushNeeded();}}
}
