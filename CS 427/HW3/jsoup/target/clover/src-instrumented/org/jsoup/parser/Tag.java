/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

/**
 * HTML Tag capabilities.
 *
 * @author Jonathan Hedley, jonathan@hedley.net
 */
public class Tag {public static class __CLR4_2_052p52plnxz22p8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,6732,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final Map<String, Tag> tags = new HashMap<>(); // map of known tags

    private String tagName;
    private String normalName; // always the lower case version of this tag, regardless of case preservation mode
    private boolean isBlock = true; // block or inline
    private boolean formatAsBlock = true; // should be formatted as a block
    private boolean canContainInline = true; // only pcdata if not
    private boolean empty = false; // can hold nothing; e.g. img
    private boolean selfClosing = false; // can self close (<foo />). used for unknown tags that self close, without forcing them as empty.
    private boolean preserveWhitespace = false; // for pre, textarea, script etc
    private boolean formList = false; // a control that appears in forms: input, textarea, output etc
    private boolean formSubmit = false; // a control that can be submitted in a form: input etc

    private Tag(String tagName) {try{__CLR4_2_052p52plnxz22p8.R.inc(6577);
        __CLR4_2_052p52plnxz22p8.R.inc(6578);this.tagName = tagName;
        __CLR4_2_052p52plnxz22p8.R.inc(6579);normalName = Normalizer.lowerCase(tagName);
    }finally{__CLR4_2_052p52plnxz22p8.R.flushNeeded();}}

    /**
     * Get this tag's name.
     *
     * @return the tag's name
     */
    public String getName() {try{__CLR4_2_052p52plnxz22p8.R.inc(6580);
        __CLR4_2_052p52plnxz22p8.R.inc(6581);return tagName;
    }finally{__CLR4_2_052p52plnxz22p8.R.flushNeeded();}}

    /**
     * Get this tag's normalized (lowercased) name.
     * @return the tag's normal name.
     */
    public String normalName() {try{__CLR4_2_052p52plnxz22p8.R.inc(6582);
        __CLR4_2_052p52plnxz22p8.R.inc(6583);return normalName;
    }finally{__CLR4_2_052p52plnxz22p8.R.flushNeeded();}}

    /**
     * Get a Tag by name. If not previously defined (unknown), returns a new generic tag, that can do anything.
     * <p>
     * Pre-defined tags (P, DIV etc) will be ==, but unknown tags are not registered and will only .equals().
     * </p>
     * 
     * @param tagName Name of tag, e.g. "p". Case insensitive.
     * @param settings used to control tag name sensitivity
     * @return The tag, either defined or new generic.
     */
    public static Tag valueOf(String tagName, ParseSettings settings) {try{__CLR4_2_052p52plnxz22p8.R.inc(6584);
        __CLR4_2_052p52plnxz22p8.R.inc(6585);Validate.notNull(tagName);
        __CLR4_2_052p52plnxz22p8.R.inc(6586);Tag tag = tags.get(tagName);

        __CLR4_2_052p52plnxz22p8.R.inc(6587);if ((((tag == null)&&(__CLR4_2_052p52plnxz22p8.R.iget(6588)!=0|true))||(__CLR4_2_052p52plnxz22p8.R.iget(6589)==0&false))) {{
            __CLR4_2_052p52plnxz22p8.R.inc(6590);tagName = settings.normalizeTag(tagName);
            __CLR4_2_052p52plnxz22p8.R.inc(6591);Validate.notEmpty(tagName);
            __CLR4_2_052p52plnxz22p8.R.inc(6592);tag = tags.get(tagName);

            __CLR4_2_052p52plnxz22p8.R.inc(6593);if ((((tag == null)&&(__CLR4_2_052p52plnxz22p8.R.iget(6594)!=0|true))||(__CLR4_2_052p52plnxz22p8.R.iget(6595)==0&false))) {{
                // not defined: create default; go anywhere, do anything! (incl be inside a <p>)
                __CLR4_2_052p52plnxz22p8.R.inc(6596);tag = new Tag(tagName);
                __CLR4_2_052p52plnxz22p8.R.inc(6597);tag.isBlock = false;
            }
        }}
        }__CLR4_2_052p52plnxz22p8.R.inc(6598);return tag;
    }finally{__CLR4_2_052p52plnxz22p8.R.flushNeeded();}}

    /**
     * Get a Tag by name. If not previously defined (unknown), returns a new generic tag, that can do anything.
     * <p>
     * Pre-defined tags (P, DIV etc) will be ==, but unknown tags are not registered and will only .equals().
     * </p>
     *
     * @param tagName Name of tag, e.g. "p". <b>Case sensitive</b>.
     * @return The tag, either defined or new generic.
     */
    public static Tag valueOf(String tagName) {try{__CLR4_2_052p52plnxz22p8.R.inc(6599);
        __CLR4_2_052p52plnxz22p8.R.inc(6600);return valueOf(tagName, ParseSettings.preserveCase);
    }finally{__CLR4_2_052p52plnxz22p8.R.flushNeeded();}}

    /**
     * Gets if this is a block tag.
     *
     * @return if block tag
     */
    public boolean isBlock() {try{__CLR4_2_052p52plnxz22p8.R.inc(6601);
        __CLR4_2_052p52plnxz22p8.R.inc(6602);return isBlock;
    }finally{__CLR4_2_052p52plnxz22p8.R.flushNeeded();}}

    /**
     * Gets if this tag should be formatted as a block (or as inline)
     *
     * @return if should be formatted as block or inline
     */
    public boolean formatAsBlock() {try{__CLR4_2_052p52plnxz22p8.R.inc(6603);
        __CLR4_2_052p52plnxz22p8.R.inc(6604);return formatAsBlock;
    }finally{__CLR4_2_052p52plnxz22p8.R.flushNeeded();}}

    /**
     * Gets if this tag can contain block tags.
     *
     * @return if tag can contain block tags
     * @deprecated No longer used, and no different result than {{@link #isBlock()}}
     */
    public boolean canContainBlock() {try{__CLR4_2_052p52plnxz22p8.R.inc(6605);
        __CLR4_2_052p52plnxz22p8.R.inc(6606);return isBlock;
    }finally{__CLR4_2_052p52plnxz22p8.R.flushNeeded();}}

    /**
     * Gets if this tag is an inline tag.
     *
     * @return if this tag is an inline tag.
     */
    public boolean isInline() {try{__CLR4_2_052p52plnxz22p8.R.inc(6607);
        __CLR4_2_052p52plnxz22p8.R.inc(6608);return !isBlock;
    }finally{__CLR4_2_052p52plnxz22p8.R.flushNeeded();}}

    /**
     * Gets if this tag is a data only tag.
     *
     * @return if this tag is a data only tag
     */
    public boolean isData() {try{__CLR4_2_052p52plnxz22p8.R.inc(6609);
        __CLR4_2_052p52plnxz22p8.R.inc(6610);return !canContainInline && !isEmpty();
    }finally{__CLR4_2_052p52plnxz22p8.R.flushNeeded();}}

    /**
     * Get if this is an empty tag
     *
     * @return if this is an empty tag
     */
    public boolean isEmpty() {try{__CLR4_2_052p52plnxz22p8.R.inc(6611);
        __CLR4_2_052p52plnxz22p8.R.inc(6612);return empty;
    }finally{__CLR4_2_052p52plnxz22p8.R.flushNeeded();}}

    /**
     * Get if this tag is self closing.
     *
     * @return if this tag should be output as self closing.
     */
    public boolean isSelfClosing() {try{__CLR4_2_052p52plnxz22p8.R.inc(6613);
        __CLR4_2_052p52plnxz22p8.R.inc(6614);return empty || selfClosing;
    }finally{__CLR4_2_052p52plnxz22p8.R.flushNeeded();}}

    /**
     * Get if this is a pre-defined tag, or was auto created on parsing.
     *
     * @return if a known tag
     */
    public boolean isKnownTag() {try{__CLR4_2_052p52plnxz22p8.R.inc(6615);
        __CLR4_2_052p52plnxz22p8.R.inc(6616);return tags.containsKey(tagName);
    }finally{__CLR4_2_052p52plnxz22p8.R.flushNeeded();}}

    /**
     * Check if this tagname is a known tag.
     *
     * @param tagName name of tag
     * @return if known HTML tag
     */
    public static boolean isKnownTag(String tagName) {try{__CLR4_2_052p52plnxz22p8.R.inc(6617);
        __CLR4_2_052p52plnxz22p8.R.inc(6618);return tags.containsKey(tagName);
    }finally{__CLR4_2_052p52plnxz22p8.R.flushNeeded();}}

    /**
     * Get if this tag should preserve whitespace within child text nodes.
     *
     * @return if preserve whitespace
     */
    public boolean preserveWhitespace() {try{__CLR4_2_052p52plnxz22p8.R.inc(6619);
        __CLR4_2_052p52plnxz22p8.R.inc(6620);return preserveWhitespace;
    }finally{__CLR4_2_052p52plnxz22p8.R.flushNeeded();}}

    /**
     * Get if this tag represents a control associated with a form. E.g. input, textarea, output
     * @return if associated with a form
     */
    public boolean isFormListed() {try{__CLR4_2_052p52plnxz22p8.R.inc(6621);
        __CLR4_2_052p52plnxz22p8.R.inc(6622);return formList;
    }finally{__CLR4_2_052p52plnxz22p8.R.flushNeeded();}}

    /**
     * Get if this tag represents an element that should be submitted with a form. E.g. input, option
     * @return if submittable with a form
     */
    public boolean isFormSubmittable() {try{__CLR4_2_052p52plnxz22p8.R.inc(6623);
        __CLR4_2_052p52plnxz22p8.R.inc(6624);return formSubmit;
    }finally{__CLR4_2_052p52plnxz22p8.R.flushNeeded();}}

    Tag setSelfClosing() {try{__CLR4_2_052p52plnxz22p8.R.inc(6625);
        __CLR4_2_052p52plnxz22p8.R.inc(6626);selfClosing = true;
        __CLR4_2_052p52plnxz22p8.R.inc(6627);return this;
    }finally{__CLR4_2_052p52plnxz22p8.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_2_052p52plnxz22p8.R.inc(6628);
        __CLR4_2_052p52plnxz22p8.R.inc(6629);if ((((this == o)&&(__CLR4_2_052p52plnxz22p8.R.iget(6630)!=0|true))||(__CLR4_2_052p52plnxz22p8.R.iget(6631)==0&false))) {__CLR4_2_052p52plnxz22p8.R.inc(6632);return true;
        }__CLR4_2_052p52plnxz22p8.R.inc(6633);if ((((!(o instanceof Tag))&&(__CLR4_2_052p52plnxz22p8.R.iget(6634)!=0|true))||(__CLR4_2_052p52plnxz22p8.R.iget(6635)==0&false))) {__CLR4_2_052p52plnxz22p8.R.inc(6636);return false;

        }__CLR4_2_052p52plnxz22p8.R.inc(6637);Tag tag = (Tag) o;

        __CLR4_2_052p52plnxz22p8.R.inc(6638);if ((((!tagName.equals(tag.tagName))&&(__CLR4_2_052p52plnxz22p8.R.iget(6639)!=0|true))||(__CLR4_2_052p52plnxz22p8.R.iget(6640)==0&false))) {__CLR4_2_052p52plnxz22p8.R.inc(6641);return false;
        }__CLR4_2_052p52plnxz22p8.R.inc(6642);if ((((canContainInline != tag.canContainInline)&&(__CLR4_2_052p52plnxz22p8.R.iget(6643)!=0|true))||(__CLR4_2_052p52plnxz22p8.R.iget(6644)==0&false))) {__CLR4_2_052p52plnxz22p8.R.inc(6645);return false;
        }__CLR4_2_052p52plnxz22p8.R.inc(6646);if ((((empty != tag.empty)&&(__CLR4_2_052p52plnxz22p8.R.iget(6647)!=0|true))||(__CLR4_2_052p52plnxz22p8.R.iget(6648)==0&false))) {__CLR4_2_052p52plnxz22p8.R.inc(6649);return false;
        }__CLR4_2_052p52plnxz22p8.R.inc(6650);if ((((formatAsBlock != tag.formatAsBlock)&&(__CLR4_2_052p52plnxz22p8.R.iget(6651)!=0|true))||(__CLR4_2_052p52plnxz22p8.R.iget(6652)==0&false))) {__CLR4_2_052p52plnxz22p8.R.inc(6653);return false;
        }__CLR4_2_052p52plnxz22p8.R.inc(6654);if ((((isBlock != tag.isBlock)&&(__CLR4_2_052p52plnxz22p8.R.iget(6655)!=0|true))||(__CLR4_2_052p52plnxz22p8.R.iget(6656)==0&false))) {__CLR4_2_052p52plnxz22p8.R.inc(6657);return false;
        }__CLR4_2_052p52plnxz22p8.R.inc(6658);if ((((preserveWhitespace != tag.preserveWhitespace)&&(__CLR4_2_052p52plnxz22p8.R.iget(6659)!=0|true))||(__CLR4_2_052p52plnxz22p8.R.iget(6660)==0&false))) {__CLR4_2_052p52plnxz22p8.R.inc(6661);return false;
        }__CLR4_2_052p52plnxz22p8.R.inc(6662);if ((((selfClosing != tag.selfClosing)&&(__CLR4_2_052p52plnxz22p8.R.iget(6663)!=0|true))||(__CLR4_2_052p52plnxz22p8.R.iget(6664)==0&false))) {__CLR4_2_052p52plnxz22p8.R.inc(6665);return false;
        }__CLR4_2_052p52plnxz22p8.R.inc(6666);if ((((formList != tag.formList)&&(__CLR4_2_052p52plnxz22p8.R.iget(6667)!=0|true))||(__CLR4_2_052p52plnxz22p8.R.iget(6668)==0&false))) {__CLR4_2_052p52plnxz22p8.R.inc(6669);return false;
        }__CLR4_2_052p52plnxz22p8.R.inc(6670);return formSubmit == tag.formSubmit;
    }finally{__CLR4_2_052p52plnxz22p8.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_2_052p52plnxz22p8.R.inc(6671);
        __CLR4_2_052p52plnxz22p8.R.inc(6672);int result = tagName.hashCode();
        __CLR4_2_052p52plnxz22p8.R.inc(6673);result = 31 * result + ((((isBlock )&&(__CLR4_2_052p52plnxz22p8.R.iget(6674)!=0|true))||(__CLR4_2_052p52plnxz22p8.R.iget(6675)==0&false))? 1 : 0);
        __CLR4_2_052p52plnxz22p8.R.inc(6676);result = 31 * result + ((((formatAsBlock )&&(__CLR4_2_052p52plnxz22p8.R.iget(6677)!=0|true))||(__CLR4_2_052p52plnxz22p8.R.iget(6678)==0&false))? 1 : 0);
        __CLR4_2_052p52plnxz22p8.R.inc(6679);result = 31 * result + ((((canContainInline )&&(__CLR4_2_052p52plnxz22p8.R.iget(6680)!=0|true))||(__CLR4_2_052p52plnxz22p8.R.iget(6681)==0&false))? 1 : 0);
        __CLR4_2_052p52plnxz22p8.R.inc(6682);result = 31 * result + ((((empty )&&(__CLR4_2_052p52plnxz22p8.R.iget(6683)!=0|true))||(__CLR4_2_052p52plnxz22p8.R.iget(6684)==0&false))? 1 : 0);
        __CLR4_2_052p52plnxz22p8.R.inc(6685);result = 31 * result + ((((selfClosing )&&(__CLR4_2_052p52plnxz22p8.R.iget(6686)!=0|true))||(__CLR4_2_052p52plnxz22p8.R.iget(6687)==0&false))? 1 : 0);
        __CLR4_2_052p52plnxz22p8.R.inc(6688);result = 31 * result + ((((preserveWhitespace )&&(__CLR4_2_052p52plnxz22p8.R.iget(6689)!=0|true))||(__CLR4_2_052p52plnxz22p8.R.iget(6690)==0&false))? 1 : 0);
        __CLR4_2_052p52plnxz22p8.R.inc(6691);result = 31 * result + ((((formList )&&(__CLR4_2_052p52plnxz22p8.R.iget(6692)!=0|true))||(__CLR4_2_052p52plnxz22p8.R.iget(6693)==0&false))? 1 : 0);
        __CLR4_2_052p52plnxz22p8.R.inc(6694);result = 31 * result + ((((formSubmit )&&(__CLR4_2_052p52plnxz22p8.R.iget(6695)!=0|true))||(__CLR4_2_052p52plnxz22p8.R.iget(6696)==0&false))? 1 : 0);
        __CLR4_2_052p52plnxz22p8.R.inc(6697);return result;
    }finally{__CLR4_2_052p52plnxz22p8.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_2_052p52plnxz22p8.R.inc(6698);
        __CLR4_2_052p52plnxz22p8.R.inc(6699);return tagName;
    }finally{__CLR4_2_052p52plnxz22p8.R.flushNeeded();}}

    // internal static initialisers:
    // prepped from http://www.w3.org/TR/REC-html40/sgml/dtd.html and other sources
    private static final String[] blockTags = {
            "html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame",
            "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6",
            "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins",
            "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th",
            "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main",
            "svg", "math", "center"
    };
    private static final String[] inlineTags = {
            "object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd",
            "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "a", "img", "br", "wbr", "map", "q",
            "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "button", "optgroup",
            "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track",
            "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track",
            "data", "bdi", "s"
    };
    private static final String[] emptyTags = {
            "meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command",
            "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"
    };
    private static final String[] formatAsInlineTags = {
            "title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style",
            "ins", "del", "s"
    };
    private static final String[] preserveWhitespaceTags = {
            "pre", "plaintext", "title", "textarea"
            // script is not here as it is a data node, which always preserve whitespace
    };
    // todo: I think we just need submit tags, and can scrub listed
    private static final String[] formListedTags = {
            "button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"
    };
    private static final String[] formSubmitTags = {
            "input", "keygen", "object", "select", "textarea"
    };

    static {try{__CLR4_2_052p52plnxz22p8.R.inc(6700);
        // creates
        __CLR4_2_052p52plnxz22p8.R.inc(6701);for (String tagName : blockTags) {{
            __CLR4_2_052p52plnxz22p8.R.inc(6702);Tag tag = new Tag(tagName);
            __CLR4_2_052p52plnxz22p8.R.inc(6703);register(tag);
        }
        }__CLR4_2_052p52plnxz22p8.R.inc(6704);for (String tagName : inlineTags) {{
            __CLR4_2_052p52plnxz22p8.R.inc(6705);Tag tag = new Tag(tagName);
            __CLR4_2_052p52plnxz22p8.R.inc(6706);tag.isBlock = false;
            __CLR4_2_052p52plnxz22p8.R.inc(6707);tag.formatAsBlock = false;
            __CLR4_2_052p52plnxz22p8.R.inc(6708);register(tag);
        }

        // mods:
        }__CLR4_2_052p52plnxz22p8.R.inc(6709);for (String tagName : emptyTags) {{
            __CLR4_2_052p52plnxz22p8.R.inc(6710);Tag tag = tags.get(tagName);
            __CLR4_2_052p52plnxz22p8.R.inc(6711);Validate.notNull(tag);
            __CLR4_2_052p52plnxz22p8.R.inc(6712);tag.canContainInline = false;
            __CLR4_2_052p52plnxz22p8.R.inc(6713);tag.empty = true;
        }

        }__CLR4_2_052p52plnxz22p8.R.inc(6714);for (String tagName : formatAsInlineTags) {{
            __CLR4_2_052p52plnxz22p8.R.inc(6715);Tag tag = tags.get(tagName);
            __CLR4_2_052p52plnxz22p8.R.inc(6716);Validate.notNull(tag);
            __CLR4_2_052p52plnxz22p8.R.inc(6717);tag.formatAsBlock = false;
        }

        }__CLR4_2_052p52plnxz22p8.R.inc(6718);for (String tagName : preserveWhitespaceTags) {{
            __CLR4_2_052p52plnxz22p8.R.inc(6719);Tag tag = tags.get(tagName);
            __CLR4_2_052p52plnxz22p8.R.inc(6720);Validate.notNull(tag);
            __CLR4_2_052p52plnxz22p8.R.inc(6721);tag.preserveWhitespace = true;
        }

        }__CLR4_2_052p52plnxz22p8.R.inc(6722);for (String tagName : formListedTags) {{
            __CLR4_2_052p52plnxz22p8.R.inc(6723);Tag tag = tags.get(tagName);
            __CLR4_2_052p52plnxz22p8.R.inc(6724);Validate.notNull(tag);
            __CLR4_2_052p52plnxz22p8.R.inc(6725);tag.formList = true;
        }

        }__CLR4_2_052p52plnxz22p8.R.inc(6726);for (String tagName : formSubmitTags) {{
            __CLR4_2_052p52plnxz22p8.R.inc(6727);Tag tag = tags.get(tagName);
            __CLR4_2_052p52plnxz22p8.R.inc(6728);Validate.notNull(tag);
            __CLR4_2_052p52plnxz22p8.R.inc(6729);tag.formSubmit = true;
        }
    }}finally{__CLR4_2_052p52plnxz22p8.R.flushNeeded();}}

    private static void register(Tag tag) {try{__CLR4_2_052p52plnxz22p8.R.inc(6730);
        __CLR4_2_052p52plnxz22p8.R.inc(6731);tags.put(tag.tagName, tag);
    }finally{__CLR4_2_052p52plnxz22p8.R.flushNeeded();}}
}
