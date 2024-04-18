/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.nodes;

import org.jsoup.internal.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 A HTML Document.

 @author Jonathan Hedley, jonathan@hedley.net */
public class Document extends Element {public static class __CLR4_2_01kh1khlnxz22jv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,2273,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private OutputSettings outputSettings = new OutputSettings();
    private Parser parser; // the parser used to parse this document
    private QuirksMode quirksMode = QuirksMode.noQuirks;
    private String location;
    private boolean updateMetaCharset = false;

    /**
     Create a new, empty Document.
     @param baseUri base URI of document
     @see org.jsoup.Jsoup#parse
     @see #createShell
     */
    public Document(String baseUri) {
        super(Tag.valueOf("#root", ParseSettings.htmlDefault), baseUri);__CLR4_2_01kh1khlnxz22jv.R.inc(2034);try{__CLR4_2_01kh1khlnxz22jv.R.inc(2033);
        __CLR4_2_01kh1khlnxz22jv.R.inc(2035);this.location = baseUri;
    }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}

    /**
     Create a valid, empty shell of a document, suitable for adding more elements to.
     @param baseUri baseUri of document
     @return document with html, head, and body elements.
     */
    public static Document createShell(String baseUri) {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2036);
        __CLR4_2_01kh1khlnxz22jv.R.inc(2037);Validate.notNull(baseUri);

        __CLR4_2_01kh1khlnxz22jv.R.inc(2038);Document doc = new Document(baseUri);
        __CLR4_2_01kh1khlnxz22jv.R.inc(2039);doc.parser = doc.parser();
        __CLR4_2_01kh1khlnxz22jv.R.inc(2040);Element html = doc.appendElement("html");
        __CLR4_2_01kh1khlnxz22jv.R.inc(2041);html.appendElement("head");
        __CLR4_2_01kh1khlnxz22jv.R.inc(2042);html.appendElement("body");

        __CLR4_2_01kh1khlnxz22jv.R.inc(2043);return doc;
    }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}

    /**
     * Get the URL this Document was parsed from. If the starting URL is a redirect,
     * this will return the final URL from which the document was served from.
     * @return location
     */
    public String location() {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2044);
     __CLR4_2_01kh1khlnxz22jv.R.inc(2045);return location;
    }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}
    
    /**
     Accessor to the document's {@code head} element.
     @return {@code head}
     */
    public Element head() {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2046);
        __CLR4_2_01kh1khlnxz22jv.R.inc(2047);return findFirstElementByTagName("head", this);
    }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}

    /**
     Accessor to the document's {@code body} element.
     @return {@code body}
     */
    public Element body() {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2048);
        __CLR4_2_01kh1khlnxz22jv.R.inc(2049);return findFirstElementByTagName("body", this);
    }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}

    /**
     Get the string contents of the document's {@code title} element.
     @return Trimmed title, or empty string if none set.
     */
    public String title() {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2050);
        // title is a preserve whitespace tag (for document output), but normalised here
        __CLR4_2_01kh1khlnxz22jv.R.inc(2051);Element titleEl = getElementsByTag("title").first();
        __CLR4_2_01kh1khlnxz22jv.R.inc(2052);return (((titleEl != null )&&(__CLR4_2_01kh1khlnxz22jv.R.iget(2053)!=0|true))||(__CLR4_2_01kh1khlnxz22jv.R.iget(2054)==0&false))? StringUtil.normaliseWhitespace(titleEl.text()).trim() : "";
    }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}

    /**
     Set the document's {@code title} element. Updates the existing element, or adds {@code title} to {@code head} if
     not present
     @param title string to set as title
     */
    public void title(String title) {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2055);
        __CLR4_2_01kh1khlnxz22jv.R.inc(2056);Validate.notNull(title);
        __CLR4_2_01kh1khlnxz22jv.R.inc(2057);Element titleEl = getElementsByTag("title").first();
        __CLR4_2_01kh1khlnxz22jv.R.inc(2058);if ((((titleEl == null)&&(__CLR4_2_01kh1khlnxz22jv.R.iget(2059)!=0|true))||(__CLR4_2_01kh1khlnxz22jv.R.iget(2060)==0&false))) {{ // add to head
            __CLR4_2_01kh1khlnxz22jv.R.inc(2061);head().appendElement("title").text(title);
        } }else {{
            __CLR4_2_01kh1khlnxz22jv.R.inc(2062);titleEl.text(title);
        }
    }}finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}

    /**
     Create a new Element, with this document's base uri. Does not make the new element a child of this document.
     @param tagName element tag name (e.g. {@code a})
     @return new element
     */
    public Element createElement(String tagName) {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2063);
        __CLR4_2_01kh1khlnxz22jv.R.inc(2064);return new Element(Tag.valueOf(tagName, ParseSettings.preserveCase), this.baseUri());
    }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}

    /**
     Normalise the document. This happens after the parse phase so generally does not need to be called.
     Moves any text content that is not in the body element into the body.
     @return this document after normalisation
     */
    public Document normalise() {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2065);
        __CLR4_2_01kh1khlnxz22jv.R.inc(2066);Element htmlEl = findFirstElementByTagName("html", this);
        __CLR4_2_01kh1khlnxz22jv.R.inc(2067);if ((((htmlEl == null)&&(__CLR4_2_01kh1khlnxz22jv.R.iget(2068)!=0|true))||(__CLR4_2_01kh1khlnxz22jv.R.iget(2069)==0&false)))
            {__CLR4_2_01kh1khlnxz22jv.R.inc(2070);htmlEl = appendElement("html");
        }__CLR4_2_01kh1khlnxz22jv.R.inc(2071);if ((((head() == null)&&(__CLR4_2_01kh1khlnxz22jv.R.iget(2072)!=0|true))||(__CLR4_2_01kh1khlnxz22jv.R.iget(2073)==0&false)))
            {__CLR4_2_01kh1khlnxz22jv.R.inc(2074);htmlEl.prependElement("head");
        }__CLR4_2_01kh1khlnxz22jv.R.inc(2075);if ((((body() == null)&&(__CLR4_2_01kh1khlnxz22jv.R.iget(2076)!=0|true))||(__CLR4_2_01kh1khlnxz22jv.R.iget(2077)==0&false)))
            {__CLR4_2_01kh1khlnxz22jv.R.inc(2078);htmlEl.appendElement("body");

        // pull text nodes out of root, html, and head els, and push into body. non-text nodes are already taken care
        // of. do in inverse order to maintain text order.
        }__CLR4_2_01kh1khlnxz22jv.R.inc(2079);normaliseTextNodes(head());
        __CLR4_2_01kh1khlnxz22jv.R.inc(2080);normaliseTextNodes(htmlEl);
        __CLR4_2_01kh1khlnxz22jv.R.inc(2081);normaliseTextNodes(this);

        __CLR4_2_01kh1khlnxz22jv.R.inc(2082);normaliseStructure("head", htmlEl);
        __CLR4_2_01kh1khlnxz22jv.R.inc(2083);normaliseStructure("body", htmlEl);
        
        __CLR4_2_01kh1khlnxz22jv.R.inc(2084);ensureMetaCharsetElement();
        
        __CLR4_2_01kh1khlnxz22jv.R.inc(2085);return this;
    }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}

    // does not recurse.
    private void normaliseTextNodes(Element element) {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2086);
        __CLR4_2_01kh1khlnxz22jv.R.inc(2087);List<Node> toMove = new ArrayList<>();
        __CLR4_2_01kh1khlnxz22jv.R.inc(2088);for (Node node: element.childNodes) {{
            __CLR4_2_01kh1khlnxz22jv.R.inc(2089);if ((((node instanceof TextNode)&&(__CLR4_2_01kh1khlnxz22jv.R.iget(2090)!=0|true))||(__CLR4_2_01kh1khlnxz22jv.R.iget(2091)==0&false))) {{
                __CLR4_2_01kh1khlnxz22jv.R.inc(2092);TextNode tn = (TextNode) node;
                __CLR4_2_01kh1khlnxz22jv.R.inc(2093);if ((((!tn.isBlank())&&(__CLR4_2_01kh1khlnxz22jv.R.iget(2094)!=0|true))||(__CLR4_2_01kh1khlnxz22jv.R.iget(2095)==0&false)))
                    {__CLR4_2_01kh1khlnxz22jv.R.inc(2096);toMove.add(tn);
            }}
        }}

        }__CLR4_2_01kh1khlnxz22jv.R.inc(2097);for (int i = toMove.size()-1; (((i >= 0)&&(__CLR4_2_01kh1khlnxz22jv.R.iget(2098)!=0|true))||(__CLR4_2_01kh1khlnxz22jv.R.iget(2099)==0&false)); i--) {{
            __CLR4_2_01kh1khlnxz22jv.R.inc(2100);Node node = toMove.get(i);
            __CLR4_2_01kh1khlnxz22jv.R.inc(2101);element.removeChild(node);
            __CLR4_2_01kh1khlnxz22jv.R.inc(2102);body().prependChild(new TextNode(" "));
            __CLR4_2_01kh1khlnxz22jv.R.inc(2103);body().prependChild(node);
        }
    }}finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}

    // merge multiple <head> or <body> contents into one, delete the remainder, and ensure they are owned by <html>
    private void normaliseStructure(String tag, Element htmlEl) {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2104);
        __CLR4_2_01kh1khlnxz22jv.R.inc(2105);Elements elements = this.getElementsByTag(tag);
        __CLR4_2_01kh1khlnxz22jv.R.inc(2106);Element master = elements.first(); // will always be available as created above if not existent
        __CLR4_2_01kh1khlnxz22jv.R.inc(2107);if ((((elements.size() > 1)&&(__CLR4_2_01kh1khlnxz22jv.R.iget(2108)!=0|true))||(__CLR4_2_01kh1khlnxz22jv.R.iget(2109)==0&false))) {{ // dupes, move contents to master
            __CLR4_2_01kh1khlnxz22jv.R.inc(2110);List<Node> toMove = new ArrayList<>();
            __CLR4_2_01kh1khlnxz22jv.R.inc(2111);for (int i = 1; (((i < elements.size())&&(__CLR4_2_01kh1khlnxz22jv.R.iget(2112)!=0|true))||(__CLR4_2_01kh1khlnxz22jv.R.iget(2113)==0&false)); i++) {{
                __CLR4_2_01kh1khlnxz22jv.R.inc(2114);Node dupe = elements.get(i);
                __CLR4_2_01kh1khlnxz22jv.R.inc(2115);toMove.addAll(dupe.ensureChildNodes());
                __CLR4_2_01kh1khlnxz22jv.R.inc(2116);dupe.remove();
            }

            }__CLR4_2_01kh1khlnxz22jv.R.inc(2117);for (Node dupe : toMove)
                {__CLR4_2_01kh1khlnxz22jv.R.inc(2118);master.appendChild(dupe);
        }}
        // ensure parented by <html>
        }__CLR4_2_01kh1khlnxz22jv.R.inc(2119);if ((((!master.parent().equals(htmlEl))&&(__CLR4_2_01kh1khlnxz22jv.R.iget(2120)!=0|true))||(__CLR4_2_01kh1khlnxz22jv.R.iget(2121)==0&false))) {{
            __CLR4_2_01kh1khlnxz22jv.R.inc(2122);htmlEl.appendChild(master); // includes remove()            
        }
    }}finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}

    // fast method to get first by tag name, used for html, head, body finders
    private Element findFirstElementByTagName(String tag, Node node) {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2123);
        __CLR4_2_01kh1khlnxz22jv.R.inc(2124);if ((((node.nodeName().equals(tag))&&(__CLR4_2_01kh1khlnxz22jv.R.iget(2125)!=0|true))||(__CLR4_2_01kh1khlnxz22jv.R.iget(2126)==0&false)))
            {__CLR4_2_01kh1khlnxz22jv.R.inc(2127);return (Element) node;
        }else {{
            __CLR4_2_01kh1khlnxz22jv.R.inc(2128);int size = node.childNodeSize();
            __CLR4_2_01kh1khlnxz22jv.R.inc(2129);for (int i = 0; (((i < size)&&(__CLR4_2_01kh1khlnxz22jv.R.iget(2130)!=0|true))||(__CLR4_2_01kh1khlnxz22jv.R.iget(2131)==0&false)); i++) {{
                __CLR4_2_01kh1khlnxz22jv.R.inc(2132);Element found = findFirstElementByTagName(tag, node.childNode(i));
                __CLR4_2_01kh1khlnxz22jv.R.inc(2133);if ((((found != null)&&(__CLR4_2_01kh1khlnxz22jv.R.iget(2134)!=0|true))||(__CLR4_2_01kh1khlnxz22jv.R.iget(2135)==0&false)))
                    {__CLR4_2_01kh1khlnxz22jv.R.inc(2136);return found;
            }}
        }}
        }__CLR4_2_01kh1khlnxz22jv.R.inc(2137);return null;
    }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}

    @Override
    public String outerHtml() {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2138);
        __CLR4_2_01kh1khlnxz22jv.R.inc(2139);return super.html(); // no outer wrapper tag
    }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}

    /**
     Set the text of the {@code body} of this document. Any existing nodes within the body will be cleared.
     @param text unencoded text
     @return this document
     */
    @Override
    public Element text(String text) {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2140);
        __CLR4_2_01kh1khlnxz22jv.R.inc(2141);body().text(text); // overridden to not nuke doc structure
        __CLR4_2_01kh1khlnxz22jv.R.inc(2142);return this;
    }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}

    @Override
    public String nodeName() {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2143);
        __CLR4_2_01kh1khlnxz22jv.R.inc(2144);return "#document";
    }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}
    
    /**
     * Sets the charset used in this document. This method is equivalent
     * to {@link OutputSettings#charset(java.nio.charset.Charset)
     * OutputSettings.charset(Charset)} but in addition it updates the
     * charset / encoding element within the document.
     * 
     * <p>This enables
     * {@link #updateMetaCharsetElement(boolean) meta charset update}.</p>
     * 
     * <p>If there's no element with charset / encoding information yet it will
     * be created. Obsolete charset / encoding definitions are removed!</p>
     * 
     * <p><b>Elements used:</b></p>
     * 
     * <ul>
     * <li><b>Html:</b> <i>&lt;meta charset="CHARSET"&gt;</i></li>
     * <li><b>Xml:</b> <i>&lt;?xml version="1.0" encoding="CHARSET"&gt;</i></li>
     * </ul>
     * 
     * @param charset Charset
     * 
     * @see #updateMetaCharsetElement(boolean) 
     * @see OutputSettings#charset(java.nio.charset.Charset) 
     */
    public void charset(Charset charset) {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2145);
        __CLR4_2_01kh1khlnxz22jv.R.inc(2146);updateMetaCharsetElement(true);
        __CLR4_2_01kh1khlnxz22jv.R.inc(2147);outputSettings.charset(charset);
        __CLR4_2_01kh1khlnxz22jv.R.inc(2148);ensureMetaCharsetElement();
    }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}
    
    /**
     * Returns the charset used in this document. This method is equivalent
     * to {@link OutputSettings#charset()}.
     * 
     * @return Current Charset
     * 
     * @see OutputSettings#charset() 
     */
    public Charset charset() {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2149);
        __CLR4_2_01kh1khlnxz22jv.R.inc(2150);return outputSettings.charset();
    }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}
    
    /**
     * Sets whether the element with charset information in this document is
     * updated on changes through {@link #charset(java.nio.charset.Charset)
     * Document.charset(Charset)} or not.
     * 
     * <p>If set to <tt>false</tt> <i>(default)</i> there are no elements
     * modified.</p>
     * 
     * @param update If <tt>true</tt> the element updated on charset
     * changes, <tt>false</tt> if not
     * 
     * @see #charset(java.nio.charset.Charset) 
     */
    public void updateMetaCharsetElement(boolean update) {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2151);
        __CLR4_2_01kh1khlnxz22jv.R.inc(2152);this.updateMetaCharset = update;
    }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}
    
    /**
     * Returns whether the element with charset information in this document is
     * updated on changes through {@link #charset(java.nio.charset.Charset)
     * Document.charset(Charset)} or not.
     * 
     * @return Returns <tt>true</tt> if the element is updated on charset
     * changes, <tt>false</tt> if not
     */
    public boolean updateMetaCharsetElement() {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2153);
        __CLR4_2_01kh1khlnxz22jv.R.inc(2154);return updateMetaCharset;
    }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}

    @Override
    public Document clone() {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2155);
        __CLR4_2_01kh1khlnxz22jv.R.inc(2156);Document clone = (Document) super.clone();
        __CLR4_2_01kh1khlnxz22jv.R.inc(2157);clone.outputSettings = this.outputSettings.clone();
        __CLR4_2_01kh1khlnxz22jv.R.inc(2158);return clone;
    }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}
    
    /**
     * Ensures a meta charset (html) or xml declaration (xml) with the current
     * encoding used. This only applies with
     * {@link #updateMetaCharsetElement(boolean) updateMetaCharset} set to
     * <tt>true</tt>, otherwise this method does nothing.
     * 
     * <ul>
     * <li>An existing element gets updated with the current charset</li>
     * <li>If there's no element yet it will be inserted</li>
     * <li>Obsolete elements are removed</li>
     * </ul>
     * 
     * <p><b>Elements used:</b></p>
     * 
     * <ul>
     * <li><b>Html:</b> <i>&lt;meta charset="CHARSET"&gt;</i></li>
     * <li><b>Xml:</b> <i>&lt;?xml version="1.0" encoding="CHARSET"&gt;</i></li>
     * </ul>
     */
    private void ensureMetaCharsetElement() {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2159);
        __CLR4_2_01kh1khlnxz22jv.R.inc(2160);if ((((updateMetaCharset)&&(__CLR4_2_01kh1khlnxz22jv.R.iget(2161)!=0|true))||(__CLR4_2_01kh1khlnxz22jv.R.iget(2162)==0&false))) {{
            __CLR4_2_01kh1khlnxz22jv.R.inc(2163);OutputSettings.Syntax syntax = outputSettings().syntax();

            __CLR4_2_01kh1khlnxz22jv.R.inc(2164);if ((((syntax == OutputSettings.Syntax.html)&&(__CLR4_2_01kh1khlnxz22jv.R.iget(2165)!=0|true))||(__CLR4_2_01kh1khlnxz22jv.R.iget(2166)==0&false))) {{
                __CLR4_2_01kh1khlnxz22jv.R.inc(2167);Element metaCharset = select("meta[charset]").first();

                __CLR4_2_01kh1khlnxz22jv.R.inc(2168);if ((((metaCharset != null)&&(__CLR4_2_01kh1khlnxz22jv.R.iget(2169)!=0|true))||(__CLR4_2_01kh1khlnxz22jv.R.iget(2170)==0&false))) {{
                    __CLR4_2_01kh1khlnxz22jv.R.inc(2171);metaCharset.attr("charset", charset().displayName());
                } }else {{
                    __CLR4_2_01kh1khlnxz22jv.R.inc(2172);Element head = head();

                    __CLR4_2_01kh1khlnxz22jv.R.inc(2173);if ((((head != null)&&(__CLR4_2_01kh1khlnxz22jv.R.iget(2174)!=0|true))||(__CLR4_2_01kh1khlnxz22jv.R.iget(2175)==0&false))) {{
                        __CLR4_2_01kh1khlnxz22jv.R.inc(2176);head.appendElement("meta").attr("charset", charset().displayName());
                    }
                }}

                // Remove obsolete elements
                }__CLR4_2_01kh1khlnxz22jv.R.inc(2177);select("meta[name=charset]").remove();
            } }else {__CLR4_2_01kh1khlnxz22jv.R.inc(2178);if ((((syntax == OutputSettings.Syntax.xml)&&(__CLR4_2_01kh1khlnxz22jv.R.iget(2179)!=0|true))||(__CLR4_2_01kh1khlnxz22jv.R.iget(2180)==0&false))) {{
                __CLR4_2_01kh1khlnxz22jv.R.inc(2181);Node node = childNodes().get(0);

                __CLR4_2_01kh1khlnxz22jv.R.inc(2182);if ((((node instanceof XmlDeclaration)&&(__CLR4_2_01kh1khlnxz22jv.R.iget(2183)!=0|true))||(__CLR4_2_01kh1khlnxz22jv.R.iget(2184)==0&false))) {{
                    __CLR4_2_01kh1khlnxz22jv.R.inc(2185);XmlDeclaration decl = (XmlDeclaration) node;

                    __CLR4_2_01kh1khlnxz22jv.R.inc(2186);if ((((decl.name().equals("xml"))&&(__CLR4_2_01kh1khlnxz22jv.R.iget(2187)!=0|true))||(__CLR4_2_01kh1khlnxz22jv.R.iget(2188)==0&false))) {{
                        __CLR4_2_01kh1khlnxz22jv.R.inc(2189);decl.attr("encoding", charset().displayName());

                        __CLR4_2_01kh1khlnxz22jv.R.inc(2190);final String version = decl.attr("version");

                        __CLR4_2_01kh1khlnxz22jv.R.inc(2191);if ((((version != null)&&(__CLR4_2_01kh1khlnxz22jv.R.iget(2192)!=0|true))||(__CLR4_2_01kh1khlnxz22jv.R.iget(2193)==0&false))) {{
                            __CLR4_2_01kh1khlnxz22jv.R.inc(2194);decl.attr("version", "1.0");
                        }
                    }} }else {{
                        __CLR4_2_01kh1khlnxz22jv.R.inc(2195);decl = new XmlDeclaration("xml", false);
                        __CLR4_2_01kh1khlnxz22jv.R.inc(2196);decl.attr("version", "1.0");
                        __CLR4_2_01kh1khlnxz22jv.R.inc(2197);decl.attr("encoding", charset().displayName());

                        __CLR4_2_01kh1khlnxz22jv.R.inc(2198);prependChild(decl);
                    }
                }} }else {{
                    __CLR4_2_01kh1khlnxz22jv.R.inc(2199);XmlDeclaration decl = new XmlDeclaration("xml", false);
                    __CLR4_2_01kh1khlnxz22jv.R.inc(2200);decl.attr("version", "1.0");
                    __CLR4_2_01kh1khlnxz22jv.R.inc(2201);decl.attr("encoding", charset().displayName());

                    __CLR4_2_01kh1khlnxz22jv.R.inc(2202);prependChild(decl);
                }
            }}
        }}}
    }}finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}
    

    /**
     * A Document's output settings control the form of the text() and html() methods.
     */
    public static class OutputSettings implements Cloneable {
        /**
         * The output serialization syntax.
         */
        public enum Syntax {html, xml}

        private Entities.EscapeMode escapeMode = Entities.EscapeMode.base;
        private Charset charset;
        private ThreadLocal<CharsetEncoder> encoderThreadLocal = new ThreadLocal<>(); // initialized by start of OuterHtmlVisitor
        Entities.CoreCharset coreCharset; // fast encoders for ascii and utf8

        private boolean prettyPrint = true;
        private boolean outline = false;
        private int indentAmount = 1;
        private Syntax syntax = Syntax.html;

        public OutputSettings() {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2203);
            __CLR4_2_01kh1khlnxz22jv.R.inc(2204);charset(Charset.forName("UTF8"));
        }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}
        
        /**
         * Get the document's current HTML escape mode: <code>base</code>, which provides a limited set of named HTML
         * entities and escapes other characters as numbered entities for maximum compatibility; or <code>extended</code>,
         * which uses the complete set of HTML named entities.
         * <p>
         * The default escape mode is <code>base</code>.
         * @return the document's current escape mode
         */
        public Entities.EscapeMode escapeMode() {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2205);
            __CLR4_2_01kh1khlnxz22jv.R.inc(2206);return escapeMode;
        }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}

        /**
         * Set the document's escape mode, which determines how characters are escaped when the output character set
         * does not support a given character:- using either a named or a numbered escape.
         * @param escapeMode the new escape mode to use
         * @return the document's output settings, for chaining
         */
        public OutputSettings escapeMode(Entities.EscapeMode escapeMode) {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2207);
            __CLR4_2_01kh1khlnxz22jv.R.inc(2208);this.escapeMode = escapeMode;
            __CLR4_2_01kh1khlnxz22jv.R.inc(2209);return this;
        }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}

        /**
         * Get the document's current output charset, which is used to control which characters are escaped when
         * generating HTML (via the <code>html()</code> methods), and which are kept intact.
         * <p>
         * Where possible (when parsing from a URL or File), the document's output charset is automatically set to the
         * input charset. Otherwise, it defaults to UTF-8.
         * @return the document's current charset.
         */
        public Charset charset() {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2210);
            __CLR4_2_01kh1khlnxz22jv.R.inc(2211);return charset;
        }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}

        /**
         * Update the document's output charset.
         * @param charset the new charset to use.
         * @return the document's output settings, for chaining
         */
        public OutputSettings charset(Charset charset) {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2212);
            __CLR4_2_01kh1khlnxz22jv.R.inc(2213);this.charset = charset;
            __CLR4_2_01kh1khlnxz22jv.R.inc(2214);return this;
        }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}

        /**
         * Update the document's output charset.
         * @param charset the new charset (by name) to use.
         * @return the document's output settings, for chaining
         */
        public OutputSettings charset(String charset) {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2215);
            __CLR4_2_01kh1khlnxz22jv.R.inc(2216);charset(Charset.forName(charset));
            __CLR4_2_01kh1khlnxz22jv.R.inc(2217);return this;
        }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}

        CharsetEncoder prepareEncoder() {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2218);
            // created at start of OuterHtmlVisitor so each pass has own encoder, so OutputSettings can be shared among threads
            __CLR4_2_01kh1khlnxz22jv.R.inc(2219);CharsetEncoder encoder = charset.newEncoder();
            __CLR4_2_01kh1khlnxz22jv.R.inc(2220);encoderThreadLocal.set(encoder);
            __CLR4_2_01kh1khlnxz22jv.R.inc(2221);coreCharset = Entities.CoreCharset.byName(encoder.charset().name());
            __CLR4_2_01kh1khlnxz22jv.R.inc(2222);return encoder;
        }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}

        CharsetEncoder encoder() {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2223);
            __CLR4_2_01kh1khlnxz22jv.R.inc(2224);CharsetEncoder encoder = encoderThreadLocal.get();
            __CLR4_2_01kh1khlnxz22jv.R.inc(2225);return (((encoder != null )&&(__CLR4_2_01kh1khlnxz22jv.R.iget(2226)!=0|true))||(__CLR4_2_01kh1khlnxz22jv.R.iget(2227)==0&false))? encoder : prepareEncoder();
        }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}

        /**
         * Get the document's current output syntax.
         * @return current syntax
         */
        public Syntax syntax() {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2228);
            __CLR4_2_01kh1khlnxz22jv.R.inc(2229);return syntax;
        }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}

        /**
         * Set the document's output syntax. Either {@code html}, with empty tags and boolean attributes (etc), or
         * {@code xml}, with self-closing tags.
         * @param syntax serialization syntax
         * @return the document's output settings, for chaining
         */
        public OutputSettings syntax(Syntax syntax) {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2230);
            __CLR4_2_01kh1khlnxz22jv.R.inc(2231);this.syntax = syntax;
            __CLR4_2_01kh1khlnxz22jv.R.inc(2232);return this;
        }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}

        /**
         * Get if pretty printing is enabled. Default is true. If disabled, the HTML output methods will not re-format
         * the output, and the output will generally look like the input.
         * @return if pretty printing is enabled.
         */
        public boolean prettyPrint() {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2233);
            __CLR4_2_01kh1khlnxz22jv.R.inc(2234);return prettyPrint;
        }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}

        /**
         * Enable or disable pretty printing.
         * @param pretty new pretty print setting
         * @return this, for chaining
         */
        public OutputSettings prettyPrint(boolean pretty) {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2235);
            __CLR4_2_01kh1khlnxz22jv.R.inc(2236);prettyPrint = pretty;
            __CLR4_2_01kh1khlnxz22jv.R.inc(2237);return this;
        }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}
        
        /**
         * Get if outline mode is enabled. Default is false. If enabled, the HTML output methods will consider
         * all tags as block.
         * @return if outline mode is enabled.
         */
        public boolean outline() {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2238);
            __CLR4_2_01kh1khlnxz22jv.R.inc(2239);return outline;
        }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}
        
        /**
         * Enable or disable HTML outline mode.
         * @param outlineMode new outline setting
         * @return this, for chaining
         */
        public OutputSettings outline(boolean outlineMode) {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2240);
            __CLR4_2_01kh1khlnxz22jv.R.inc(2241);outline = outlineMode;
            __CLR4_2_01kh1khlnxz22jv.R.inc(2242);return this;
        }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}

        /**
         * Get the current tag indent amount, used when pretty printing.
         * @return the current indent amount
         */
        public int indentAmount() {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2243);
            __CLR4_2_01kh1khlnxz22jv.R.inc(2244);return indentAmount;
        }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}

        /**
         * Set the indent amount for pretty printing
         * @param indentAmount number of spaces to use for indenting each level. Must be {@literal >=} 0.
         * @return this, for chaining
         */
        public OutputSettings indentAmount(int indentAmount) {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2245);
            __CLR4_2_01kh1khlnxz22jv.R.inc(2246);Validate.isTrue(indentAmount >= 0);
            __CLR4_2_01kh1khlnxz22jv.R.inc(2247);this.indentAmount = indentAmount;
            __CLR4_2_01kh1khlnxz22jv.R.inc(2248);return this;
        }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}

        @Override
        public OutputSettings clone() {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2249);
            __CLR4_2_01kh1khlnxz22jv.R.inc(2250);OutputSettings clone;
            __CLR4_2_01kh1khlnxz22jv.R.inc(2251);try {
                __CLR4_2_01kh1khlnxz22jv.R.inc(2252);clone = (OutputSettings) super.clone();
            } catch (CloneNotSupportedException e) {
                __CLR4_2_01kh1khlnxz22jv.R.inc(2253);throw new RuntimeException(e);
            }
            __CLR4_2_01kh1khlnxz22jv.R.inc(2254);clone.charset(charset.name()); // new charset and charset encoder
            __CLR4_2_01kh1khlnxz22jv.R.inc(2255);clone.escapeMode = Entities.EscapeMode.valueOf(escapeMode.name());
            // indentAmount, prettyPrint are primitives so object.clone() will handle
            __CLR4_2_01kh1khlnxz22jv.R.inc(2256);return clone;
        }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}
    }

    /**
     * Get the document's current output settings.
     * @return the document's current output settings.
     */
    public OutputSettings outputSettings() {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2257);
        __CLR4_2_01kh1khlnxz22jv.R.inc(2258);return outputSettings;
    }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}

    /**
     * Set the document's output settings.
     * @param outputSettings new output settings.
     * @return this document, for chaining.
     */
    public Document outputSettings(OutputSettings outputSettings) {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2259);
        __CLR4_2_01kh1khlnxz22jv.R.inc(2260);Validate.notNull(outputSettings);
        __CLR4_2_01kh1khlnxz22jv.R.inc(2261);this.outputSettings = outputSettings;
        __CLR4_2_01kh1khlnxz22jv.R.inc(2262);return this;
    }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}

    public enum QuirksMode {
        noQuirks, quirks, limitedQuirks
    }

    public QuirksMode quirksMode() {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2263);
        __CLR4_2_01kh1khlnxz22jv.R.inc(2264);return quirksMode;
    }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}

    public Document quirksMode(QuirksMode quirksMode) {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2265);
        __CLR4_2_01kh1khlnxz22jv.R.inc(2266);this.quirksMode = quirksMode;
        __CLR4_2_01kh1khlnxz22jv.R.inc(2267);return this;
    }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}

    /**
     * Get the parser that was used to parse this document.
     * @return the parser
     */
    public Parser parser() {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2268);
        __CLR4_2_01kh1khlnxz22jv.R.inc(2269);return parser;
    }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}

    /**
     * Set the parser used to create this document. This parser is then used when further parsing within this document
     * is required.
     * @param parser the configured parser to use when further parsing is required for this document.
     * @return this document, for chaining.
     */
    public Document parser(Parser parser) {try{__CLR4_2_01kh1khlnxz22jv.R.inc(2270);
        __CLR4_2_01kh1khlnxz22jv.R.inc(2271);this.parser = parser;
        __CLR4_2_01kh1khlnxz22jv.R.inc(2272);return this;
    }finally{__CLR4_2_01kh1khlnxz22jv.R.flushNeeded();}}
}
