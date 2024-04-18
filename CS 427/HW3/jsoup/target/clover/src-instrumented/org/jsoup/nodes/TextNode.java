/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.nodes;

import org.jsoup.internal.StringUtil;
import org.jsoup.helper.Validate;

import java.io.IOException;

/**
 A text node.

 @author Jonathan Hedley, jonathan@hedley.net */
public class TextNode extends LeafNode {public static class __CLR4_2_02tt2ttlnxz22me{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,3716,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     Create a new TextNode representing the supplied (unencoded) text).

     @param text raw text
     @see #createFromEncoded(String)
     */
    public TextNode(String text) {try{__CLR4_2_02tt2ttlnxz22me.R.inc(3665);
        __CLR4_2_02tt2ttlnxz22me.R.inc(3666);value = text;
    }finally{__CLR4_2_02tt2ttlnxz22me.R.flushNeeded();}}

    /**
     Create a new TextNode representing the supplied (unencoded) text).

     @param text raw text
     @param baseUri base uri - ignored for this node type
     @see #createFromEncoded(String, String)
     @deprecated use {@link TextNode#TextNode(String)}
     */
    public TextNode(String text, String baseUri) {
        this(text);__CLR4_2_02tt2ttlnxz22me.R.inc(3668);try{__CLR4_2_02tt2ttlnxz22me.R.inc(3667);
    }finally{__CLR4_2_02tt2ttlnxz22me.R.flushNeeded();}}

	public String nodeName() {try{__CLR4_2_02tt2ttlnxz22me.R.inc(3669);
        __CLR4_2_02tt2ttlnxz22me.R.inc(3670);return "#text";
    }finally{__CLR4_2_02tt2ttlnxz22me.R.flushNeeded();}}
    
    /**
     * Get the text content of this text node.
     * @return Unencoded, normalised text.
     * @see TextNode#getWholeText()
     */
    public String text() {try{__CLR4_2_02tt2ttlnxz22me.R.inc(3671);
        __CLR4_2_02tt2ttlnxz22me.R.inc(3672);return StringUtil.normaliseWhitespace(getWholeText());
    }finally{__CLR4_2_02tt2ttlnxz22me.R.flushNeeded();}}
    
    /**
     * Set the text content of this text node.
     * @param text unencoded text
     * @return this, for chaining
     */
    public TextNode text(String text) {try{__CLR4_2_02tt2ttlnxz22me.R.inc(3673);
        __CLR4_2_02tt2ttlnxz22me.R.inc(3674);coreValue(text);
        __CLR4_2_02tt2ttlnxz22me.R.inc(3675);return this;
    }finally{__CLR4_2_02tt2ttlnxz22me.R.flushNeeded();}}

    /**
     Get the (unencoded) text of this text node, including any newlines and spaces present in the original.
     @return text
     */
    public String getWholeText() {try{__CLR4_2_02tt2ttlnxz22me.R.inc(3676);
        __CLR4_2_02tt2ttlnxz22me.R.inc(3677);return coreValue();
    }finally{__CLR4_2_02tt2ttlnxz22me.R.flushNeeded();}}

    /**
     Test if this text node is blank -- that is, empty or only whitespace (including newlines).
     @return true if this document is empty or only whitespace, false if it contains any text content.
     */
    public boolean isBlank() {try{__CLR4_2_02tt2ttlnxz22me.R.inc(3678);
        __CLR4_2_02tt2ttlnxz22me.R.inc(3679);return StringUtil.isBlank(coreValue());
    }finally{__CLR4_2_02tt2ttlnxz22me.R.flushNeeded();}}

    /**
     * Split this text node into two nodes at the specified string offset. After splitting, this node will contain the
     * original text up to the offset, and will have a new text node sibling containing the text after the offset.
     * @param offset string offset point to split node at.
     * @return the newly created text node containing the text after the offset.
     */
    public TextNode splitText(int offset) {try{__CLR4_2_02tt2ttlnxz22me.R.inc(3680);
        __CLR4_2_02tt2ttlnxz22me.R.inc(3681);final String text = coreValue();
        __CLR4_2_02tt2ttlnxz22me.R.inc(3682);Validate.isTrue(offset >= 0, "Split offset must be not be negative");
        __CLR4_2_02tt2ttlnxz22me.R.inc(3683);Validate.isTrue(offset < text.length(), "Split offset must not be greater than current text length");

        __CLR4_2_02tt2ttlnxz22me.R.inc(3684);String head = text.substring(0, offset);
        __CLR4_2_02tt2ttlnxz22me.R.inc(3685);String tail = text.substring(offset);
        __CLR4_2_02tt2ttlnxz22me.R.inc(3686);text(head);
        __CLR4_2_02tt2ttlnxz22me.R.inc(3687);TextNode tailNode = new TextNode(tail);
        __CLR4_2_02tt2ttlnxz22me.R.inc(3688);if ((((parent() != null)&&(__CLR4_2_02tt2ttlnxz22me.R.iget(3689)!=0|true))||(__CLR4_2_02tt2ttlnxz22me.R.iget(3690)==0&false)))
            {__CLR4_2_02tt2ttlnxz22me.R.inc(3691);parent().addChildren(siblingIndex()+1, tailNode);

        }__CLR4_2_02tt2ttlnxz22me.R.inc(3692);return tailNode;
    }finally{__CLR4_2_02tt2ttlnxz22me.R.flushNeeded();}}

	void outerHtmlHead(Appendable accum, int depth, Document.OutputSettings out) throws IOException {try{__CLR4_2_02tt2ttlnxz22me.R.inc(3693);
        __CLR4_2_02tt2ttlnxz22me.R.inc(3694);if ((((out.prettyPrint() && ((siblingIndex() == 0 && parentNode instanceof Element && ((Element) parentNode).tag().formatAsBlock() && !isBlank()) || (out.outline() && siblingNodes().size()>0 && !isBlank()) ))&&(__CLR4_2_02tt2ttlnxz22me.R.iget(3695)!=0|true))||(__CLR4_2_02tt2ttlnxz22me.R.iget(3696)==0&false)))
            {__CLR4_2_02tt2ttlnxz22me.R.inc(3697);indent(accum, depth, out);

        }__CLR4_2_02tt2ttlnxz22me.R.inc(3698);boolean normaliseWhite = out.prettyPrint() && parent() instanceof Element
                && !Element.preserveWhitespace(parent());
        __CLR4_2_02tt2ttlnxz22me.R.inc(3699);Entities.escape(accum, coreValue(), out, false, normaliseWhite, false);
    }finally{__CLR4_2_02tt2ttlnxz22me.R.flushNeeded();}}

	void outerHtmlTail(Appendable accum, int depth, Document.OutputSettings out) {try{__CLR4_2_02tt2ttlnxz22me.R.inc(3700);}finally{__CLR4_2_02tt2ttlnxz22me.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_2_02tt2ttlnxz22me.R.inc(3701);
        __CLR4_2_02tt2ttlnxz22me.R.inc(3702);return outerHtml();
    }finally{__CLR4_2_02tt2ttlnxz22me.R.flushNeeded();}}

    /**
     * Create a new TextNode from HTML encoded (aka escaped) data.
     * @param encodedText Text containing encoded HTML (e.g. &amp;lt;)
     * @param baseUri Base uri
     * @return TextNode containing unencoded data (e.g. &lt;)
     * @deprecated use {@link TextNode#createFromEncoded(String)} instead, as LeafNodes don't carry base URIs.
     */
    public static TextNode createFromEncoded(String encodedText, String baseUri) {try{__CLR4_2_02tt2ttlnxz22me.R.inc(3703);
        __CLR4_2_02tt2ttlnxz22me.R.inc(3704);String text = Entities.unescape(encodedText);
        __CLR4_2_02tt2ttlnxz22me.R.inc(3705);return new TextNode(text);
    }finally{__CLR4_2_02tt2ttlnxz22me.R.flushNeeded();}}

    /**
     * Create a new TextNode from HTML encoded (aka escaped) data.
     * @param encodedText Text containing encoded HTML (e.g. &amp;lt;)
     * @return TextNode containing unencoded data (e.g. &lt;)
     */
    public static TextNode createFromEncoded(String encodedText) {try{__CLR4_2_02tt2ttlnxz22me.R.inc(3706);
        __CLR4_2_02tt2ttlnxz22me.R.inc(3707);String text = Entities.unescape(encodedText);
        __CLR4_2_02tt2ttlnxz22me.R.inc(3708);return new TextNode(text);
    }finally{__CLR4_2_02tt2ttlnxz22me.R.flushNeeded();}}

    static String normaliseWhitespace(String text) {try{__CLR4_2_02tt2ttlnxz22me.R.inc(3709);
        __CLR4_2_02tt2ttlnxz22me.R.inc(3710);text = StringUtil.normaliseWhitespace(text);
        __CLR4_2_02tt2ttlnxz22me.R.inc(3711);return text;
    }finally{__CLR4_2_02tt2ttlnxz22me.R.flushNeeded();}}

    static String stripLeadingWhitespace(String text) {try{__CLR4_2_02tt2ttlnxz22me.R.inc(3712);
        __CLR4_2_02tt2ttlnxz22me.R.inc(3713);return text.replaceFirst("^\\s+", "");
    }finally{__CLR4_2_02tt2ttlnxz22me.R.flushNeeded();}}

    static boolean lastCharIsWhitespace(StringBuilder sb) {try{__CLR4_2_02tt2ttlnxz22me.R.inc(3714);
        __CLR4_2_02tt2ttlnxz22me.R.inc(3715);return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }finally{__CLR4_2_02tt2ttlnxz22me.R.flushNeeded();}}


}
