/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.safety;

/*
    Thank you to Ryan Grove (wonko.com) for the Ruby HTML cleaner http://github.com/rgrove/sanitize/, which inspired
    this whitelist configuration, and the initial defaults.
 */

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.jsoup.internal.Normalizer.lowerCase;


/**
 Whitelists define what HTML (elements and attributes) to allow through the cleaner. Everything else is removed.
 <p>
 Start with one of the defaults:
 </p>
 <ul>
 <li>{@link #none}
 <li>{@link #simpleText}
 <li>{@link #basic}
 <li>{@link #basicWithImages}
 <li>{@link #relaxed}
 </ul>
 <p>
 If you need to allow more through (please be careful!), tweak a base whitelist with:
 </p>
 <ul>
 <li>{@link #addTags}
 <li>{@link #addAttributes}
 <li>{@link #addEnforcedAttribute}
 <li>{@link #addProtocols}
 </ul>
 <p>
 You can remove any setting from an existing whitelist with:
 </p>
 <ul>
 <li>{@link #removeTags}
 <li>{@link #removeAttributes}
 <li>{@link #removeEnforcedAttribute}
 <li>{@link #removeProtocols}
 </ul>
 
 <p>
 The cleaner and these whitelists assume that you want to clean a <code>body</code> fragment of HTML (to add user
 supplied HTML into a templated page), and not to clean a full HTML document. If the latter is the case, either wrap the
 document HTML around the cleaned body HTML, or create a whitelist that allows <code>html</code> and <code>head</code>
 elements as appropriate.
 </p>
 <p>
 If you are going to extend a whitelist, please be very careful. Make sure you understand what attributes may lead to
 XSS attack vectors. URL attributes are particularly vulnerable and require careful validation. See 
 http://ha.ckers.org/xss.html for some XSS attack examples.
 </p>

 @author Jonathan Hedley
 */
public class Whitelist {public static class __CLR4_2_0700700lnxz22ro{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,9344,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Set<TagName> tagNames; // tags allowed, lower case. e.g. [p, br, span]
    private Map<TagName, Set<AttributeKey>> attributes; // tag -> attribute[]. allowed attributes [href] for a tag.
    private Map<TagName, Map<AttributeKey, AttributeValue>> enforcedAttributes; // always set these attribute values
    private Map<TagName, Map<AttributeKey, Set<Protocol>>> protocols; // allowed URL protocols for attributes
    private boolean preserveRelativeLinks; // option to preserve relative links

    /**
     This whitelist allows only text nodes: all HTML will be stripped.

     @return whitelist
     */
    public static Whitelist none() {try{__CLR4_2_0700700lnxz22ro.R.inc(9072);
        __CLR4_2_0700700lnxz22ro.R.inc(9073);return new Whitelist();
    }finally{__CLR4_2_0700700lnxz22ro.R.flushNeeded();}}

    /**
     This whitelist allows only simple text formatting: <code>b, em, i, strong, u</code>. All other HTML (tags and
     attributes) will be removed.

     @return whitelist
     */
    public static Whitelist simpleText() {try{__CLR4_2_0700700lnxz22ro.R.inc(9074);
        __CLR4_2_0700700lnxz22ro.R.inc(9075);return new Whitelist()
                .addTags("b", "em", "i", "strong", "u")
                ;
    }finally{__CLR4_2_0700700lnxz22ro.R.flushNeeded();}}

    /**
     <p>
     This whitelist allows a fuller range of text nodes: <code>a, b, blockquote, br, cite, code, dd, dl, dt, em, i, li,
     ol, p, pre, q, small, span, strike, strong, sub, sup, u, ul</code>, and appropriate attributes.
     </p>
     <p>
     Links (<code>a</code> elements) can point to <code>http, https, ftp, mailto</code>, and have an enforced
     <code>rel=nofollow</code> attribute.
     </p>
     <p>
     Does not allow images.
     </p>

     @return whitelist
     */
    public static Whitelist basic() {try{__CLR4_2_0700700lnxz22ro.R.inc(9076);
        __CLR4_2_0700700lnxz22ro.R.inc(9077);return new Whitelist()
                .addTags(
                        "a", "b", "blockquote", "br", "cite", "code", "dd", "dl", "dt", "em",
                        "i", "li", "ol", "p", "pre", "q", "small", "span", "strike", "strong", "sub",
                        "sup", "u", "ul")

                .addAttributes("a", "href")
                .addAttributes("blockquote", "cite")
                .addAttributes("q", "cite")

                .addProtocols("a", "href", "ftp", "http", "https", "mailto")
                .addProtocols("blockquote", "cite", "http", "https")
                .addProtocols("cite", "cite", "http", "https")

                .addEnforcedAttribute("a", "rel", "nofollow")
                ;

    }finally{__CLR4_2_0700700lnxz22ro.R.flushNeeded();}}

    /**
     This whitelist allows the same text tags as {@link #basic}, and also allows <code>img</code> tags, with appropriate
     attributes, with <code>src</code> pointing to <code>http</code> or <code>https</code>.

     @return whitelist
     */
    public static Whitelist basicWithImages() {try{__CLR4_2_0700700lnxz22ro.R.inc(9078);
        __CLR4_2_0700700lnxz22ro.R.inc(9079);return basic()
                .addTags("img")
                .addAttributes("img", "align", "alt", "height", "src", "title", "width")
                .addProtocols("img", "src", "http", "https")
                ;
    }finally{__CLR4_2_0700700lnxz22ro.R.flushNeeded();}}

    /**
     This whitelist allows a full range of text and structural body HTML: <code>a, b, blockquote, br, caption, cite,
     code, col, colgroup, dd, div, dl, dt, em, h1, h2, h3, h4, h5, h6, i, img, li, ol, p, pre, q, small, span, strike, strong, sub,
     sup, table, tbody, td, tfoot, th, thead, tr, u, ul</code>
     <p>
     Links do not have an enforced <code>rel=nofollow</code> attribute, but you can add that if desired.
     </p>

     @return whitelist
     */
    public static Whitelist relaxed() {try{__CLR4_2_0700700lnxz22ro.R.inc(9080);
        __CLR4_2_0700700lnxz22ro.R.inc(9081);return new Whitelist()
                .addTags(
                        "a", "b", "blockquote", "br", "caption", "cite", "code", "col",
                        "colgroup", "dd", "div", "dl", "dt", "em", "h1", "h2", "h3", "h4", "h5", "h6",
                        "i", "img", "li", "ol", "p", "pre", "q", "small", "span", "strike", "strong",
                        "sub", "sup", "table", "tbody", "td", "tfoot", "th", "thead", "tr", "u",
                        "ul")

                .addAttributes("a", "href", "title")
                .addAttributes("blockquote", "cite")
                .addAttributes("col", "span", "width")
                .addAttributes("colgroup", "span", "width")
                .addAttributes("img", "align", "alt", "height", "src", "title", "width")
                .addAttributes("ol", "start", "type")
                .addAttributes("q", "cite")
                .addAttributes("table", "summary", "width")
                .addAttributes("td", "abbr", "axis", "colspan", "rowspan", "width")
                .addAttributes(
                        "th", "abbr", "axis", "colspan", "rowspan", "scope",
                        "width")
                .addAttributes("ul", "type")

                .addProtocols("a", "href", "ftp", "http", "https", "mailto")
                .addProtocols("blockquote", "cite", "http", "https")
                .addProtocols("cite", "cite", "http", "https")
                .addProtocols("img", "src", "http", "https")
                .addProtocols("q", "cite", "http", "https")
                ;
    }finally{__CLR4_2_0700700lnxz22ro.R.flushNeeded();}}

    /**
     Create a new, empty whitelist. Generally it will be better to start with a default prepared whitelist instead.

     @see #basic()
     @see #basicWithImages()
     @see #simpleText()
     @see #relaxed()
     */
    public Whitelist() {try{__CLR4_2_0700700lnxz22ro.R.inc(9082);
        __CLR4_2_0700700lnxz22ro.R.inc(9083);tagNames = new HashSet<>();
        __CLR4_2_0700700lnxz22ro.R.inc(9084);attributes = new HashMap<>();
        __CLR4_2_0700700lnxz22ro.R.inc(9085);enforcedAttributes = new HashMap<>();
        __CLR4_2_0700700lnxz22ro.R.inc(9086);protocols = new HashMap<>();
        __CLR4_2_0700700lnxz22ro.R.inc(9087);preserveRelativeLinks = false;
    }finally{__CLR4_2_0700700lnxz22ro.R.flushNeeded();}}

    /**
     Add a list of allowed elements to a whitelist. (If a tag is not allowed, it will be removed from the HTML.)

     @param tags tag names to allow
     @return this (for chaining)
     */
    public Whitelist addTags(String... tags) {try{__CLR4_2_0700700lnxz22ro.R.inc(9088);
        __CLR4_2_0700700lnxz22ro.R.inc(9089);Validate.notNull(tags);

        __CLR4_2_0700700lnxz22ro.R.inc(9090);for (String tagName : tags) {{
            __CLR4_2_0700700lnxz22ro.R.inc(9091);Validate.notEmpty(tagName);
            __CLR4_2_0700700lnxz22ro.R.inc(9092);tagNames.add(TagName.valueOf(tagName));
        }
        }__CLR4_2_0700700lnxz22ro.R.inc(9093);return this;
    }finally{__CLR4_2_0700700lnxz22ro.R.flushNeeded();}}

    /**
     Remove a list of allowed elements from a whitelist. (If a tag is not allowed, it will be removed from the HTML.)

     @param tags tag names to disallow
     @return this (for chaining)
     */
    public Whitelist removeTags(String... tags) {try{__CLR4_2_0700700lnxz22ro.R.inc(9094);
        __CLR4_2_0700700lnxz22ro.R.inc(9095);Validate.notNull(tags);

        __CLR4_2_0700700lnxz22ro.R.inc(9096);for(String tag: tags) {{
            __CLR4_2_0700700lnxz22ro.R.inc(9097);Validate.notEmpty(tag);
            __CLR4_2_0700700lnxz22ro.R.inc(9098);TagName tagName = TagName.valueOf(tag);

            __CLR4_2_0700700lnxz22ro.R.inc(9099);if((((tagNames.remove(tagName))&&(__CLR4_2_0700700lnxz22ro.R.iget(9100)!=0|true))||(__CLR4_2_0700700lnxz22ro.R.iget(9101)==0&false))) {{ // Only look in sub-maps if tag was allowed
                __CLR4_2_0700700lnxz22ro.R.inc(9102);attributes.remove(tagName);
                __CLR4_2_0700700lnxz22ro.R.inc(9103);enforcedAttributes.remove(tagName);
                __CLR4_2_0700700lnxz22ro.R.inc(9104);protocols.remove(tagName);
            }
        }}
        }__CLR4_2_0700700lnxz22ro.R.inc(9105);return this;
    }finally{__CLR4_2_0700700lnxz22ro.R.flushNeeded();}}

    /**
     Add a list of allowed attributes to a tag. (If an attribute is not allowed on an element, it will be removed.)
     <p>
     E.g.: <code>addAttributes("a", "href", "class")</code> allows <code>href</code> and <code>class</code> attributes
     on <code>a</code> tags.
     </p>
     <p>
     To make an attribute valid for <b>all tags</b>, use the pseudo tag <code>:all</code>, e.g.
     <code>addAttributes(":all", "class")</code>.
     </p>

     @param tag  The tag the attributes are for. The tag will be added to the allowed tag list if necessary.
     @param attributes List of valid attributes for the tag
     @return this (for chaining)
     */
    public Whitelist addAttributes(String tag, String... attributes) {try{__CLR4_2_0700700lnxz22ro.R.inc(9106);
        __CLR4_2_0700700lnxz22ro.R.inc(9107);Validate.notEmpty(tag);
        __CLR4_2_0700700lnxz22ro.R.inc(9108);Validate.notNull(attributes);
        __CLR4_2_0700700lnxz22ro.R.inc(9109);Validate.isTrue(attributes.length > 0, "No attribute names supplied.");

        __CLR4_2_0700700lnxz22ro.R.inc(9110);TagName tagName = TagName.valueOf(tag);
        __CLR4_2_0700700lnxz22ro.R.inc(9111);tagNames.add(tagName);
        __CLR4_2_0700700lnxz22ro.R.inc(9112);Set<AttributeKey> attributeSet = new HashSet<>();
        __CLR4_2_0700700lnxz22ro.R.inc(9113);for (String key : attributes) {{
            __CLR4_2_0700700lnxz22ro.R.inc(9114);Validate.notEmpty(key);
            __CLR4_2_0700700lnxz22ro.R.inc(9115);attributeSet.add(AttributeKey.valueOf(key));
        }
        }__CLR4_2_0700700lnxz22ro.R.inc(9116);if ((((this.attributes.containsKey(tagName))&&(__CLR4_2_0700700lnxz22ro.R.iget(9117)!=0|true))||(__CLR4_2_0700700lnxz22ro.R.iget(9118)==0&false))) {{
            __CLR4_2_0700700lnxz22ro.R.inc(9119);Set<AttributeKey> currentSet = this.attributes.get(tagName);
            __CLR4_2_0700700lnxz22ro.R.inc(9120);currentSet.addAll(attributeSet);
        } }else {{
            __CLR4_2_0700700lnxz22ro.R.inc(9121);this.attributes.put(tagName, attributeSet);
        }
        }__CLR4_2_0700700lnxz22ro.R.inc(9122);return this;
    }finally{__CLR4_2_0700700lnxz22ro.R.flushNeeded();}}

    /**
     Remove a list of allowed attributes from a tag. (If an attribute is not allowed on an element, it will be removed.)
     <p>
     E.g.: <code>removeAttributes("a", "href", "class")</code> disallows <code>href</code> and <code>class</code>
     attributes on <code>a</code> tags.
     </p>
     <p>
     To make an attribute invalid for <b>all tags</b>, use the pseudo tag <code>:all</code>, e.g.
     <code>removeAttributes(":all", "class")</code>.
     </p>

     @param tag  The tag the attributes are for.
     @param attributes List of invalid attributes for the tag
     @return this (for chaining)
     */
    public Whitelist removeAttributes(String tag, String... attributes) {try{__CLR4_2_0700700lnxz22ro.R.inc(9123);
        __CLR4_2_0700700lnxz22ro.R.inc(9124);Validate.notEmpty(tag);
        __CLR4_2_0700700lnxz22ro.R.inc(9125);Validate.notNull(attributes);
        __CLR4_2_0700700lnxz22ro.R.inc(9126);Validate.isTrue(attributes.length > 0, "No attribute names supplied.");

        __CLR4_2_0700700lnxz22ro.R.inc(9127);TagName tagName = TagName.valueOf(tag);
        __CLR4_2_0700700lnxz22ro.R.inc(9128);Set<AttributeKey> attributeSet = new HashSet<>();
        __CLR4_2_0700700lnxz22ro.R.inc(9129);for (String key : attributes) {{
            __CLR4_2_0700700lnxz22ro.R.inc(9130);Validate.notEmpty(key);
            __CLR4_2_0700700lnxz22ro.R.inc(9131);attributeSet.add(AttributeKey.valueOf(key));
        }
        }__CLR4_2_0700700lnxz22ro.R.inc(9132);if((((tagNames.contains(tagName) && this.attributes.containsKey(tagName))&&(__CLR4_2_0700700lnxz22ro.R.iget(9133)!=0|true))||(__CLR4_2_0700700lnxz22ro.R.iget(9134)==0&false))) {{ // Only look in sub-maps if tag was allowed
            __CLR4_2_0700700lnxz22ro.R.inc(9135);Set<AttributeKey> currentSet = this.attributes.get(tagName);
            __CLR4_2_0700700lnxz22ro.R.inc(9136);currentSet.removeAll(attributeSet);

            __CLR4_2_0700700lnxz22ro.R.inc(9137);if((((currentSet.isEmpty())&&(__CLR4_2_0700700lnxz22ro.R.iget(9138)!=0|true))||(__CLR4_2_0700700lnxz22ro.R.iget(9139)==0&false))) // Remove tag from attribute map if no attributes are allowed for tag
                {__CLR4_2_0700700lnxz22ro.R.inc(9140);this.attributes.remove(tagName);
        }}
        }__CLR4_2_0700700lnxz22ro.R.inc(9141);if((((tag.equals(":all"))&&(__CLR4_2_0700700lnxz22ro.R.iget(9142)!=0|true))||(__CLR4_2_0700700lnxz22ro.R.iget(9143)==0&false))) // Attribute needs to be removed from all individually set tags
            {__CLR4_2_0700700lnxz22ro.R.inc(9144);for(TagName name: this.attributes.keySet()) {{
                __CLR4_2_0700700lnxz22ro.R.inc(9145);Set<AttributeKey> currentSet = this.attributes.get(name);
                __CLR4_2_0700700lnxz22ro.R.inc(9146);currentSet.removeAll(attributeSet);

                __CLR4_2_0700700lnxz22ro.R.inc(9147);if((((currentSet.isEmpty())&&(__CLR4_2_0700700lnxz22ro.R.iget(9148)!=0|true))||(__CLR4_2_0700700lnxz22ro.R.iget(9149)==0&false))) // Remove tag from attribute map if no attributes are allowed for tag
                    {__CLR4_2_0700700lnxz22ro.R.inc(9150);this.attributes.remove(name);
            }}
        }}__CLR4_2_0700700lnxz22ro.R.inc(9151);return this;
    }finally{__CLR4_2_0700700lnxz22ro.R.flushNeeded();}}

    /**
     Add an enforced attribute to a tag. An enforced attribute will always be added to the element. If the element
     already has the attribute set, it will be overridden with this value.
     <p>
     E.g.: <code>addEnforcedAttribute("a", "rel", "nofollow")</code> will make all <code>a</code> tags output as
     <code>&lt;a href="..." rel="nofollow"&gt;</code>
     </p>

     @param tag   The tag the enforced attribute is for. The tag will be added to the allowed tag list if necessary.
     @param attribute   The attribute name
     @param value The enforced attribute value
     @return this (for chaining)
     */
    public Whitelist addEnforcedAttribute(String tag, String attribute, String value) {try{__CLR4_2_0700700lnxz22ro.R.inc(9152);
        __CLR4_2_0700700lnxz22ro.R.inc(9153);Validate.notEmpty(tag);
        __CLR4_2_0700700lnxz22ro.R.inc(9154);Validate.notEmpty(attribute);
        __CLR4_2_0700700lnxz22ro.R.inc(9155);Validate.notEmpty(value);

        __CLR4_2_0700700lnxz22ro.R.inc(9156);TagName tagName = TagName.valueOf(tag);
        __CLR4_2_0700700lnxz22ro.R.inc(9157);tagNames.add(tagName);
        __CLR4_2_0700700lnxz22ro.R.inc(9158);AttributeKey attrKey = AttributeKey.valueOf(attribute);
        __CLR4_2_0700700lnxz22ro.R.inc(9159);AttributeValue attrVal = AttributeValue.valueOf(value);

        __CLR4_2_0700700lnxz22ro.R.inc(9160);if ((((enforcedAttributes.containsKey(tagName))&&(__CLR4_2_0700700lnxz22ro.R.iget(9161)!=0|true))||(__CLR4_2_0700700lnxz22ro.R.iget(9162)==0&false))) {{
            __CLR4_2_0700700lnxz22ro.R.inc(9163);enforcedAttributes.get(tagName).put(attrKey, attrVal);
        } }else {{
            __CLR4_2_0700700lnxz22ro.R.inc(9164);Map<AttributeKey, AttributeValue> attrMap = new HashMap<>();
            __CLR4_2_0700700lnxz22ro.R.inc(9165);attrMap.put(attrKey, attrVal);
            __CLR4_2_0700700lnxz22ro.R.inc(9166);enforcedAttributes.put(tagName, attrMap);
        }
        }__CLR4_2_0700700lnxz22ro.R.inc(9167);return this;
    }finally{__CLR4_2_0700700lnxz22ro.R.flushNeeded();}}

    /**
     Remove a previously configured enforced attribute from a tag.

     @param tag   The tag the enforced attribute is for.
     @param attribute   The attribute name
     @return this (for chaining)
     */
    public Whitelist removeEnforcedAttribute(String tag, String attribute) {try{__CLR4_2_0700700lnxz22ro.R.inc(9168);
        __CLR4_2_0700700lnxz22ro.R.inc(9169);Validate.notEmpty(tag);
        __CLR4_2_0700700lnxz22ro.R.inc(9170);Validate.notEmpty(attribute);

        __CLR4_2_0700700lnxz22ro.R.inc(9171);TagName tagName = TagName.valueOf(tag);
        __CLR4_2_0700700lnxz22ro.R.inc(9172);if((((tagNames.contains(tagName) && enforcedAttributes.containsKey(tagName))&&(__CLR4_2_0700700lnxz22ro.R.iget(9173)!=0|true))||(__CLR4_2_0700700lnxz22ro.R.iget(9174)==0&false))) {{
            __CLR4_2_0700700lnxz22ro.R.inc(9175);AttributeKey attrKey = AttributeKey.valueOf(attribute);
            __CLR4_2_0700700lnxz22ro.R.inc(9176);Map<AttributeKey, AttributeValue> attrMap = enforcedAttributes.get(tagName);
            __CLR4_2_0700700lnxz22ro.R.inc(9177);attrMap.remove(attrKey);

            __CLR4_2_0700700lnxz22ro.R.inc(9178);if((((attrMap.isEmpty())&&(__CLR4_2_0700700lnxz22ro.R.iget(9179)!=0|true))||(__CLR4_2_0700700lnxz22ro.R.iget(9180)==0&false))) // Remove tag from enforced attribute map if no enforced attributes are present
                {__CLR4_2_0700700lnxz22ro.R.inc(9181);enforcedAttributes.remove(tagName);
        }}
        }__CLR4_2_0700700lnxz22ro.R.inc(9182);return this;
    }finally{__CLR4_2_0700700lnxz22ro.R.flushNeeded();}}

    /**
     * Configure this Whitelist to preserve relative links in an element's URL attribute, or convert them to absolute
     * links. By default, this is <b>false</b>: URLs will be  made absolute (e.g. start with an allowed protocol, like
     * e.g. {@code http://}.
     * <p>
     * Note that when handling relative links, the input document must have an appropriate {@code base URI} set when
     * parsing, so that the link's protocol can be confirmed. Regardless of the setting of the {@code preserve relative
     * links} option, the link must be resolvable against the base URI to an allowed protocol; otherwise the attribute
     * will be removed.
     * </p>
     *
     * @param preserve {@code true} to allow relative links, {@code false} (default) to deny
     * @return this Whitelist, for chaining.
     * @see #addProtocols
     */
    public Whitelist preserveRelativeLinks(boolean preserve) {try{__CLR4_2_0700700lnxz22ro.R.inc(9183);
        __CLR4_2_0700700lnxz22ro.R.inc(9184);preserveRelativeLinks = preserve;
        __CLR4_2_0700700lnxz22ro.R.inc(9185);return this;
    }finally{__CLR4_2_0700700lnxz22ro.R.flushNeeded();}}

    /**
     Add allowed URL protocols for an element's URL attribute. This restricts the possible values of the attribute to
     URLs with the defined protocol.
     <p>
     E.g.: <code>addProtocols("a", "href", "ftp", "http", "https")</code>
     </p>
     <p>
     To allow a link to an in-page URL anchor (i.e. <code>&lt;a href="#anchor"&gt;</code>, add a <code>#</code>:<br>
     E.g.: <code>addProtocols("a", "href", "#")</code>
     </p>

     @param tag       Tag the URL protocol is for
     @param attribute       Attribute name
     @param protocols List of valid protocols
     @return this, for chaining
     */
    public Whitelist addProtocols(String tag, String attribute, String... protocols) {try{__CLR4_2_0700700lnxz22ro.R.inc(9186);
        __CLR4_2_0700700lnxz22ro.R.inc(9187);Validate.notEmpty(tag);
        __CLR4_2_0700700lnxz22ro.R.inc(9188);Validate.notEmpty(attribute);
        __CLR4_2_0700700lnxz22ro.R.inc(9189);Validate.notNull(protocols);

        __CLR4_2_0700700lnxz22ro.R.inc(9190);TagName tagName = TagName.valueOf(tag);
        __CLR4_2_0700700lnxz22ro.R.inc(9191);AttributeKey attrKey = AttributeKey.valueOf(attribute);
        __CLR4_2_0700700lnxz22ro.R.inc(9192);Map<AttributeKey, Set<Protocol>> attrMap;
        __CLR4_2_0700700lnxz22ro.R.inc(9193);Set<Protocol> protSet;

        __CLR4_2_0700700lnxz22ro.R.inc(9194);if ((((this.protocols.containsKey(tagName))&&(__CLR4_2_0700700lnxz22ro.R.iget(9195)!=0|true))||(__CLR4_2_0700700lnxz22ro.R.iget(9196)==0&false))) {{
            __CLR4_2_0700700lnxz22ro.R.inc(9197);attrMap = this.protocols.get(tagName);
        } }else {{
            __CLR4_2_0700700lnxz22ro.R.inc(9198);attrMap = new HashMap<>();
            __CLR4_2_0700700lnxz22ro.R.inc(9199);this.protocols.put(tagName, attrMap);
        }
        }__CLR4_2_0700700lnxz22ro.R.inc(9200);if ((((attrMap.containsKey(attrKey))&&(__CLR4_2_0700700lnxz22ro.R.iget(9201)!=0|true))||(__CLR4_2_0700700lnxz22ro.R.iget(9202)==0&false))) {{
            __CLR4_2_0700700lnxz22ro.R.inc(9203);protSet = attrMap.get(attrKey);
        } }else {{
            __CLR4_2_0700700lnxz22ro.R.inc(9204);protSet = new HashSet<>();
            __CLR4_2_0700700lnxz22ro.R.inc(9205);attrMap.put(attrKey, protSet);
        }
        }__CLR4_2_0700700lnxz22ro.R.inc(9206);for (String protocol : protocols) {{
            __CLR4_2_0700700lnxz22ro.R.inc(9207);Validate.notEmpty(protocol);
            __CLR4_2_0700700lnxz22ro.R.inc(9208);Protocol prot = Protocol.valueOf(protocol);
            __CLR4_2_0700700lnxz22ro.R.inc(9209);protSet.add(prot);
        }
        }__CLR4_2_0700700lnxz22ro.R.inc(9210);return this;
    }finally{__CLR4_2_0700700lnxz22ro.R.flushNeeded();}}

    /**
     Remove allowed URL protocols for an element's URL attribute. If you remove all protocols for an attribute, that
     attribute will allow any protocol.
     <p>
     E.g.: <code>removeProtocols("a", "href", "ftp")</code>
     </p>

     @param tag Tag the URL protocol is for
     @param attribute Attribute name
     @param removeProtocols List of invalid protocols
     @return this, for chaining
     */
    public Whitelist removeProtocols(String tag, String attribute, String... removeProtocols) {try{__CLR4_2_0700700lnxz22ro.R.inc(9211);
        __CLR4_2_0700700lnxz22ro.R.inc(9212);Validate.notEmpty(tag);
        __CLR4_2_0700700lnxz22ro.R.inc(9213);Validate.notEmpty(attribute);
        __CLR4_2_0700700lnxz22ro.R.inc(9214);Validate.notNull(removeProtocols);

        __CLR4_2_0700700lnxz22ro.R.inc(9215);TagName tagName = TagName.valueOf(tag);
        __CLR4_2_0700700lnxz22ro.R.inc(9216);AttributeKey attr = AttributeKey.valueOf(attribute);

        // make sure that what we're removing actually exists; otherwise can open the tag to any data and that can
        // be surprising
        __CLR4_2_0700700lnxz22ro.R.inc(9217);Validate.isTrue(protocols.containsKey(tagName), "Cannot remove a protocol that is not set.");
        __CLR4_2_0700700lnxz22ro.R.inc(9218);Map<AttributeKey, Set<Protocol>> tagProtocols = protocols.get(tagName);
        __CLR4_2_0700700lnxz22ro.R.inc(9219);Validate.isTrue(tagProtocols.containsKey(attr), "Cannot remove a protocol that is not set.");

        __CLR4_2_0700700lnxz22ro.R.inc(9220);Set<Protocol> attrProtocols = tagProtocols.get(attr);
        __CLR4_2_0700700lnxz22ro.R.inc(9221);for (String protocol : removeProtocols) {{
            __CLR4_2_0700700lnxz22ro.R.inc(9222);Validate.notEmpty(protocol);
            __CLR4_2_0700700lnxz22ro.R.inc(9223);attrProtocols.remove(Protocol.valueOf(protocol));
        }

        }__CLR4_2_0700700lnxz22ro.R.inc(9224);if ((((attrProtocols.isEmpty())&&(__CLR4_2_0700700lnxz22ro.R.iget(9225)!=0|true))||(__CLR4_2_0700700lnxz22ro.R.iget(9226)==0&false))) {{ // Remove protocol set if empty
            __CLR4_2_0700700lnxz22ro.R.inc(9227);tagProtocols.remove(attr);
            __CLR4_2_0700700lnxz22ro.R.inc(9228);if ((((tagProtocols.isEmpty())&&(__CLR4_2_0700700lnxz22ro.R.iget(9229)!=0|true))||(__CLR4_2_0700700lnxz22ro.R.iget(9230)==0&false))) // Remove entry for tag if empty
                {__CLR4_2_0700700lnxz22ro.R.inc(9231);protocols.remove(tagName);
        }}
        }__CLR4_2_0700700lnxz22ro.R.inc(9232);return this;
    }finally{__CLR4_2_0700700lnxz22ro.R.flushNeeded();}}

    /**
     * Test if the supplied tag is allowed by this whitelist
     * @param tag test tag
     * @return true if allowed
     */
    protected boolean isSafeTag(String tag) {try{__CLR4_2_0700700lnxz22ro.R.inc(9233);
        __CLR4_2_0700700lnxz22ro.R.inc(9234);return tagNames.contains(TagName.valueOf(tag));
    }finally{__CLR4_2_0700700lnxz22ro.R.flushNeeded();}}

    /**
     * Test if the supplied attribute is allowed by this whitelist for this tag
     * @param tagName tag to consider allowing the attribute in
     * @param el element under test, to confirm protocol
     * @param attr attribute under test
     * @return true if allowed
     */
    protected boolean isSafeAttribute(String tagName, Element el, Attribute attr) {try{__CLR4_2_0700700lnxz22ro.R.inc(9235);
        __CLR4_2_0700700lnxz22ro.R.inc(9236);TagName tag = TagName.valueOf(tagName);
        __CLR4_2_0700700lnxz22ro.R.inc(9237);AttributeKey key = AttributeKey.valueOf(attr.getKey());

        __CLR4_2_0700700lnxz22ro.R.inc(9238);Set<AttributeKey> okSet = attributes.get(tag);
        __CLR4_2_0700700lnxz22ro.R.inc(9239);if ((((okSet != null && okSet.contains(key))&&(__CLR4_2_0700700lnxz22ro.R.iget(9240)!=0|true))||(__CLR4_2_0700700lnxz22ro.R.iget(9241)==0&false))) {{
            __CLR4_2_0700700lnxz22ro.R.inc(9242);if ((((protocols.containsKey(tag))&&(__CLR4_2_0700700lnxz22ro.R.iget(9243)!=0|true))||(__CLR4_2_0700700lnxz22ro.R.iget(9244)==0&false))) {{
                __CLR4_2_0700700lnxz22ro.R.inc(9245);Map<AttributeKey, Set<Protocol>> attrProts = protocols.get(tag);
                // ok if not defined protocol; otherwise test
                __CLR4_2_0700700lnxz22ro.R.inc(9246);return !attrProts.containsKey(key) || testValidProtocol(el, attr, attrProts.get(key));
            } }else {{ // attribute found, no protocols defined, so OK
                __CLR4_2_0700700lnxz22ro.R.inc(9247);return true;
            }
        }}
        // might be an enforced attribute?
        }__CLR4_2_0700700lnxz22ro.R.inc(9248);Map<AttributeKey, AttributeValue> enforcedSet = enforcedAttributes.get(tag);
        __CLR4_2_0700700lnxz22ro.R.inc(9249);if ((((enforcedSet != null)&&(__CLR4_2_0700700lnxz22ro.R.iget(9250)!=0|true))||(__CLR4_2_0700700lnxz22ro.R.iget(9251)==0&false))) {{
            __CLR4_2_0700700lnxz22ro.R.inc(9252);Attributes expect = getEnforcedAttributes(tagName);
            __CLR4_2_0700700lnxz22ro.R.inc(9253);String attrKey = attr.getKey();
            __CLR4_2_0700700lnxz22ro.R.inc(9254);if ((((expect.hasKeyIgnoreCase(attrKey))&&(__CLR4_2_0700700lnxz22ro.R.iget(9255)!=0|true))||(__CLR4_2_0700700lnxz22ro.R.iget(9256)==0&false))) {{
                __CLR4_2_0700700lnxz22ro.R.inc(9257);return expect.getIgnoreCase(attrKey).equals(attr.getValue());
            }
        }}
        // no attributes defined for tag, try :all tag
        }__CLR4_2_0700700lnxz22ro.R.inc(9258);return !tagName.equals(":all") && isSafeAttribute(":all", el, attr);
    }finally{__CLR4_2_0700700lnxz22ro.R.flushNeeded();}}

    private boolean testValidProtocol(Element el, Attribute attr, Set<Protocol> protocols) {try{__CLR4_2_0700700lnxz22ro.R.inc(9259);
        // try to resolve relative urls to abs, and optionally update the attribute so output html has abs.
        // rels without a baseuri get removed
        __CLR4_2_0700700lnxz22ro.R.inc(9260);String value = el.absUrl(attr.getKey());
        __CLR4_2_0700700lnxz22ro.R.inc(9261);if ((((value.length() == 0)&&(__CLR4_2_0700700lnxz22ro.R.iget(9262)!=0|true))||(__CLR4_2_0700700lnxz22ro.R.iget(9263)==0&false)))
            {__CLR4_2_0700700lnxz22ro.R.inc(9264);value = attr.getValue(); // if it could not be made abs, run as-is to allow custom unknown protocols
        }__CLR4_2_0700700lnxz22ro.R.inc(9265);if ((((!preserveRelativeLinks)&&(__CLR4_2_0700700lnxz22ro.R.iget(9266)!=0|true))||(__CLR4_2_0700700lnxz22ro.R.iget(9267)==0&false)))
            {__CLR4_2_0700700lnxz22ro.R.inc(9268);attr.setValue(value);
        
        }__CLR4_2_0700700lnxz22ro.R.inc(9269);for (Protocol protocol : protocols) {{
            __CLR4_2_0700700lnxz22ro.R.inc(9270);String prot = protocol.toString();

            __CLR4_2_0700700lnxz22ro.R.inc(9271);if ((((prot.equals("#"))&&(__CLR4_2_0700700lnxz22ro.R.iget(9272)!=0|true))||(__CLR4_2_0700700lnxz22ro.R.iget(9273)==0&false))) {{ // allows anchor links
                __CLR4_2_0700700lnxz22ro.R.inc(9274);if ((((isValidAnchor(value))&&(__CLR4_2_0700700lnxz22ro.R.iget(9275)!=0|true))||(__CLR4_2_0700700lnxz22ro.R.iget(9276)==0&false))) {{
                    __CLR4_2_0700700lnxz22ro.R.inc(9277);return true;
                } }else {{
                    __CLR4_2_0700700lnxz22ro.R.inc(9278);continue;
                }
            }}

            }__CLR4_2_0700700lnxz22ro.R.inc(9279);prot += ":";

            __CLR4_2_0700700lnxz22ro.R.inc(9280);if ((((lowerCase(value).startsWith(prot))&&(__CLR4_2_0700700lnxz22ro.R.iget(9281)!=0|true))||(__CLR4_2_0700700lnxz22ro.R.iget(9282)==0&false))) {{
                __CLR4_2_0700700lnxz22ro.R.inc(9283);return true;
            }
        }}
        }__CLR4_2_0700700lnxz22ro.R.inc(9284);return false;
    }finally{__CLR4_2_0700700lnxz22ro.R.flushNeeded();}}

    private boolean isValidAnchor(String value) {try{__CLR4_2_0700700lnxz22ro.R.inc(9285);
        __CLR4_2_0700700lnxz22ro.R.inc(9286);return value.startsWith("#") && !value.matches(".*\\s.*");
    }finally{__CLR4_2_0700700lnxz22ro.R.flushNeeded();}}

    Attributes getEnforcedAttributes(String tagName) {try{__CLR4_2_0700700lnxz22ro.R.inc(9287);
        __CLR4_2_0700700lnxz22ro.R.inc(9288);Attributes attrs = new Attributes();
        __CLR4_2_0700700lnxz22ro.R.inc(9289);TagName tag = TagName.valueOf(tagName);
        __CLR4_2_0700700lnxz22ro.R.inc(9290);if ((((enforcedAttributes.containsKey(tag))&&(__CLR4_2_0700700lnxz22ro.R.iget(9291)!=0|true))||(__CLR4_2_0700700lnxz22ro.R.iget(9292)==0&false))) {{
            __CLR4_2_0700700lnxz22ro.R.inc(9293);Map<AttributeKey, AttributeValue> keyVals = enforcedAttributes.get(tag);
            __CLR4_2_0700700lnxz22ro.R.inc(9294);for (Map.Entry<AttributeKey, AttributeValue> entry : keyVals.entrySet()) {{
                __CLR4_2_0700700lnxz22ro.R.inc(9295);attrs.put(entry.getKey().toString(), entry.getValue().toString());
            }
        }}
        }__CLR4_2_0700700lnxz22ro.R.inc(9296);return attrs;
    }finally{__CLR4_2_0700700lnxz22ro.R.flushNeeded();}}
    
    // named types for config. All just hold strings, but here for my sanity.

    static class TagName extends TypedValue {
        TagName(String value) {
            super(value);__CLR4_2_0700700lnxz22ro.R.inc(9298);try{__CLR4_2_0700700lnxz22ro.R.inc(9297);
        }finally{__CLR4_2_0700700lnxz22ro.R.flushNeeded();}}

        static TagName valueOf(String value) {try{__CLR4_2_0700700lnxz22ro.R.inc(9299);
            __CLR4_2_0700700lnxz22ro.R.inc(9300);return new TagName(value);
        }finally{__CLR4_2_0700700lnxz22ro.R.flushNeeded();}}
    }

    static class AttributeKey extends TypedValue {
        AttributeKey(String value) {
            super(value);__CLR4_2_0700700lnxz22ro.R.inc(9302);try{__CLR4_2_0700700lnxz22ro.R.inc(9301);
        }finally{__CLR4_2_0700700lnxz22ro.R.flushNeeded();}}

        static AttributeKey valueOf(String value) {try{__CLR4_2_0700700lnxz22ro.R.inc(9303);
            __CLR4_2_0700700lnxz22ro.R.inc(9304);return new AttributeKey(value);
        }finally{__CLR4_2_0700700lnxz22ro.R.flushNeeded();}}
    }

    static class AttributeValue extends TypedValue {
        AttributeValue(String value) {
            super(value);__CLR4_2_0700700lnxz22ro.R.inc(9306);try{__CLR4_2_0700700lnxz22ro.R.inc(9305);
        }finally{__CLR4_2_0700700lnxz22ro.R.flushNeeded();}}

        static AttributeValue valueOf(String value) {try{__CLR4_2_0700700lnxz22ro.R.inc(9307);
            __CLR4_2_0700700lnxz22ro.R.inc(9308);return new AttributeValue(value);
        }finally{__CLR4_2_0700700lnxz22ro.R.flushNeeded();}}
    }

    static class Protocol extends TypedValue {
        Protocol(String value) {
            super(value);__CLR4_2_0700700lnxz22ro.R.inc(9310);try{__CLR4_2_0700700lnxz22ro.R.inc(9309);
        }finally{__CLR4_2_0700700lnxz22ro.R.flushNeeded();}}

        static Protocol valueOf(String value) {try{__CLR4_2_0700700lnxz22ro.R.inc(9311);
            __CLR4_2_0700700lnxz22ro.R.inc(9312);return new Protocol(value);
        }finally{__CLR4_2_0700700lnxz22ro.R.flushNeeded();}}
    }

    abstract static class TypedValue {
        private String value;

        TypedValue(String value) {try{__CLR4_2_0700700lnxz22ro.R.inc(9313);
            __CLR4_2_0700700lnxz22ro.R.inc(9314);Validate.notNull(value);
            __CLR4_2_0700700lnxz22ro.R.inc(9315);this.value = value;
        }finally{__CLR4_2_0700700lnxz22ro.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_2_0700700lnxz22ro.R.inc(9316);
            __CLR4_2_0700700lnxz22ro.R.inc(9317);final int prime = 31;
            __CLR4_2_0700700lnxz22ro.R.inc(9318);int result = 1;
            __CLR4_2_0700700lnxz22ro.R.inc(9319);result = prime * result + (((((value == null) )&&(__CLR4_2_0700700lnxz22ro.R.iget(9320)!=0|true))||(__CLR4_2_0700700lnxz22ro.R.iget(9321)==0&false))? 0 : value.hashCode());
            __CLR4_2_0700700lnxz22ro.R.inc(9322);return result;
        }finally{__CLR4_2_0700700lnxz22ro.R.flushNeeded();}}

        @Override
        public boolean equals(Object obj) {try{__CLR4_2_0700700lnxz22ro.R.inc(9323);
            __CLR4_2_0700700lnxz22ro.R.inc(9324);if ((((this == obj)&&(__CLR4_2_0700700lnxz22ro.R.iget(9325)!=0|true))||(__CLR4_2_0700700lnxz22ro.R.iget(9326)==0&false))) {__CLR4_2_0700700lnxz22ro.R.inc(9327);return true;
            }__CLR4_2_0700700lnxz22ro.R.inc(9328);if ((((obj == null)&&(__CLR4_2_0700700lnxz22ro.R.iget(9329)!=0|true))||(__CLR4_2_0700700lnxz22ro.R.iget(9330)==0&false))) {__CLR4_2_0700700lnxz22ro.R.inc(9331);return false;
            }__CLR4_2_0700700lnxz22ro.R.inc(9332);if ((((getClass() != obj.getClass())&&(__CLR4_2_0700700lnxz22ro.R.iget(9333)!=0|true))||(__CLR4_2_0700700lnxz22ro.R.iget(9334)==0&false))) {__CLR4_2_0700700lnxz22ro.R.inc(9335);return false;
            }__CLR4_2_0700700lnxz22ro.R.inc(9336);TypedValue other = (TypedValue) obj;
            __CLR4_2_0700700lnxz22ro.R.inc(9337);if ((((value == null)&&(__CLR4_2_0700700lnxz22ro.R.iget(9338)!=0|true))||(__CLR4_2_0700700lnxz22ro.R.iget(9339)==0&false))) {{
                __CLR4_2_0700700lnxz22ro.R.inc(9340);return other.value == null;
            } }else {__CLR4_2_0700700lnxz22ro.R.inc(9341);return value.equals(other.value);
        }}finally{__CLR4_2_0700700lnxz22ro.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_0700700lnxz22ro.R.inc(9342);
            __CLR4_2_0700700lnxz22ro.R.inc(9343);return value;
        }finally{__CLR4_2_0700700lnxz22ro.R.flushNeeded();}}
    }
}

