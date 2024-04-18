/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.nodes;

import org.jsoup.helper.ChangeNotifyingArrayList;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.jsoup.select.Collector;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.NodeFilter;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import org.jsoup.select.QueryParser;
import org.jsoup.select.Selector;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import static org.jsoup.internal.Normalizer.normalize;

/**
 * A HTML element consists of a tag name, attributes, and child nodes (including text nodes and
 * other elements).
 * 
 * From an Element, you can extract data, traverse the node graph, and manipulate the HTML.
 * 
 * @author Jonathan Hedley, jonathan@hedley.net
 */
public class Element extends Node {public static class __CLR4_2_01st1stlnxz22kw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,2999,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final List<Node> EMPTY_NODES = Collections.emptyList();
    private static final Pattern classSplit = Pattern.compile("\\s+");
    private Tag tag;
    private WeakReference<List<Element>> shadowChildrenRef; // points to child elements shadowed from node children
    List<Node> childNodes;
    private Attributes attributes;
    private String baseUri;

    /**
     * Create a new, standalone element.
     * @param tag tag name
     */
    public Element(String tag) {
        this(Tag.valueOf(tag), "", new Attributes());__CLR4_2_01st1stlnxz22kw.R.inc(2334);try{__CLR4_2_01st1stlnxz22kw.R.inc(2333);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Create a new, standalone Element. (Standalone in that is has no parent.)
     * 
     * @param tag tag of this element
     * @param baseUri the base URI
     * @param attributes initial attributes
     * @see #appendChild(Node)
     * @see #appendElement(String)
     */
    public Element(Tag tag, String baseUri, Attributes attributes) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2335);
        __CLR4_2_01st1stlnxz22kw.R.inc(2336);Validate.notNull(tag);
        __CLR4_2_01st1stlnxz22kw.R.inc(2337);Validate.notNull(baseUri);
        __CLR4_2_01st1stlnxz22kw.R.inc(2338);childNodes = EMPTY_NODES;
        __CLR4_2_01st1stlnxz22kw.R.inc(2339);this.baseUri = baseUri;
        __CLR4_2_01st1stlnxz22kw.R.inc(2340);this.attributes = attributes;
        __CLR4_2_01st1stlnxz22kw.R.inc(2341);this.tag = tag;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}
    
    /**
     * Create a new Element from a tag and a base URI.
     * 
     * @param tag element tag
     * @param baseUri the base URI of this element. It is acceptable for the base URI to be an empty
     *            string, but not null.
     * @see Tag#valueOf(String, ParseSettings)
     */
    public Element(Tag tag, String baseUri) {
        this(tag, baseUri, null);__CLR4_2_01st1stlnxz22kw.R.inc(2343);try{__CLR4_2_01st1stlnxz22kw.R.inc(2342);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    protected List<Node> ensureChildNodes() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2344);
        __CLR4_2_01st1stlnxz22kw.R.inc(2345);if ((((childNodes == EMPTY_NODES)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2346)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2347)==0&false))) {{
            __CLR4_2_01st1stlnxz22kw.R.inc(2348);childNodes = new NodeList(this, 4);
        }
        }__CLR4_2_01st1stlnxz22kw.R.inc(2349);return childNodes;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    @Override
    protected boolean hasAttributes() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2350);
        __CLR4_2_01st1stlnxz22kw.R.inc(2351);return attributes != null;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    @Override
    public Attributes attributes() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2352);
        __CLR4_2_01st1stlnxz22kw.R.inc(2353);if ((((!hasAttributes())&&(__CLR4_2_01st1stlnxz22kw.R.iget(2354)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2355)==0&false)))
            {__CLR4_2_01st1stlnxz22kw.R.inc(2356);attributes = new Attributes();
        }__CLR4_2_01st1stlnxz22kw.R.inc(2357);return attributes;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    @Override
    public String baseUri() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2358);
        __CLR4_2_01st1stlnxz22kw.R.inc(2359);return baseUri;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    @Override
    protected void doSetBaseUri(String baseUri) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2360);
        __CLR4_2_01st1stlnxz22kw.R.inc(2361);this.baseUri = baseUri;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    @Override
    public int childNodeSize() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2362);
        __CLR4_2_01st1stlnxz22kw.R.inc(2363);return childNodes.size();
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    @Override
    public String nodeName() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2364);
        __CLR4_2_01st1stlnxz22kw.R.inc(2365);return tag.getName();
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Get the name of the tag for this element. E.g. {@code div}. If you are using {@link ParseSettings#preserveCase
     * case preserving parsing}, this will return the source's original case.
     * 
     * @return the tag name
     */
    public String tagName() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2366);
        __CLR4_2_01st1stlnxz22kw.R.inc(2367);return tag.getName();
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Get the normalized name of this Element's tag. This will always be the lowercased version of the tag, regardless
     * of the tag case preserving setting of the parser.
     * @return
     */
    public String normalName() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2368);
        __CLR4_2_01st1stlnxz22kw.R.inc(2369);return tag.normalName();
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Change the tag of this element. For example, convert a {@code <span>} to a {@code <div>} with
     * {@code el.tagName("div");}.
     *
     * @param tagName new tag name for this element
     * @return this element, for chaining
     */
    public Element tagName(String tagName) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2370);
        __CLR4_2_01st1stlnxz22kw.R.inc(2371);Validate.notEmpty(tagName, "Tag name must not be empty.");
        __CLR4_2_01st1stlnxz22kw.R.inc(2372);tag = Tag.valueOf(tagName, NodeUtils.parser(this).settings()); // maintains the case option of the original parse
        __CLR4_2_01st1stlnxz22kw.R.inc(2373);return this;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Get the Tag for this element.
     * 
     * @return the tag object
     */
    public Tag tag() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2374);
        __CLR4_2_01st1stlnxz22kw.R.inc(2375);return tag;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}
    
    /**
     * Test if this element is a block-level element. (E.g. {@code <div> == true} or an inline element
     * {@code <p> == false}).
     * 
     * @return true if block, false if not (and thus inline)
     */
    public boolean isBlock() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2376);
        __CLR4_2_01st1stlnxz22kw.R.inc(2377);return tag.isBlock();
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Get the {@code id} attribute of this element.
     * 
     * @return The id attribute, if present, or an empty string if not.
     */
    public String id() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2378);
        __CLR4_2_01st1stlnxz22kw.R.inc(2379);return attributes().getIgnoreCase("id");
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Set an attribute value on this element. If this element already has an attribute with the
     * key, its value is updated; otherwise, a new attribute is added.
     * 
     * @return this element
     */
    public Element attr(String attributeKey, String attributeValue) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2380);
        __CLR4_2_01st1stlnxz22kw.R.inc(2381);super.attr(attributeKey, attributeValue);
        __CLR4_2_01st1stlnxz22kw.R.inc(2382);return this;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}
    
    /**
     * Set a boolean attribute value on this element. Setting to <code>true</code> sets the attribute value to "" and
     * marks the attribute as boolean so no value is written out. Setting to <code>false</code> removes the attribute
     * with the same key if it exists.
     * 
     * @param attributeKey the attribute key
     * @param attributeValue the attribute value
     * 
     * @return this element
     */
    public Element attr(String attributeKey, boolean attributeValue) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2383);
        __CLR4_2_01st1stlnxz22kw.R.inc(2384);attributes().put(attributeKey, attributeValue);
        __CLR4_2_01st1stlnxz22kw.R.inc(2385);return this;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Get this element's HTML5 custom data attributes. Each attribute in the element that has a key
     * starting with "data-" is included the dataset.
     * <p>
     * E.g., the element {@code <div data-package="jsoup" data-language="Java" class="group">...} has the dataset
     * {@code package=jsoup, language=java}.
     * <p>
     * This map is a filtered view of the element's attribute map. Changes to one map (add, remove, update) are reflected
     * in the other map.
     * <p>
     * You can find elements that have data attributes using the {@code [^data-]} attribute key prefix selector.
     * @return a map of {@code key=value} custom data attributes.
     */
    public Map<String, String> dataset() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2386);
        __CLR4_2_01st1stlnxz22kw.R.inc(2387);return attributes().dataset();
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    @Override
    public final Element parent() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2388);
        __CLR4_2_01st1stlnxz22kw.R.inc(2389);return (Element) parentNode;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Get this element's parent and ancestors, up to the document root.
     * @return this element's stack of parents, closest first.
     */
    public Elements parents() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2390);
        __CLR4_2_01st1stlnxz22kw.R.inc(2391);Elements parents = new Elements();
        __CLR4_2_01st1stlnxz22kw.R.inc(2392);accumulateParents(this, parents);
        __CLR4_2_01st1stlnxz22kw.R.inc(2393);return parents;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    private static void accumulateParents(Element el, Elements parents) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2394);
        __CLR4_2_01st1stlnxz22kw.R.inc(2395);Element parent = el.parent();
        __CLR4_2_01st1stlnxz22kw.R.inc(2396);if ((((parent != null && !parent.tagName().equals("#root"))&&(__CLR4_2_01st1stlnxz22kw.R.iget(2397)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2398)==0&false))) {{
            __CLR4_2_01st1stlnxz22kw.R.inc(2399);parents.add(parent);
            __CLR4_2_01st1stlnxz22kw.R.inc(2400);accumulateParents(parent, parents);
        }
    }}finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Get a child element of this element, by its 0-based index number.
     * <p>
     * Note that an element can have both mixed Nodes and Elements as children. This method inspects
     * a filtered list of children that are elements, and the index is based on that filtered list.
     * </p>
     * 
     * @param index the index number of the element to retrieve
     * @return the child element, if it exists, otherwise throws an {@code IndexOutOfBoundsException}
     * @see #childNode(int)
     */
    public Element child(int index) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2401);
        __CLR4_2_01st1stlnxz22kw.R.inc(2402);return childElementsList().get(index);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Get this element's child elements.
     * <p>
     * This is effectively a filter on {@link #childNodes()} to get Element nodes.
     * </p>
     * @return child elements. If this element has no children, returns an empty list.
     * @see #childNodes()
     */
    public Elements children() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2403);
        __CLR4_2_01st1stlnxz22kw.R.inc(2404);return new Elements(childElementsList());
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Maintains a shadow copy of this element's child elements. If the nodelist is changed, this cache is invalidated.
     * TODO - think about pulling this out as a helper as there are other shadow lists (like in Attributes) kept around.
     * @return a list of child elements
     */
    private List<Element> childElementsList() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2405);
        __CLR4_2_01st1stlnxz22kw.R.inc(2406);List<Element> children;
        __CLR4_2_01st1stlnxz22kw.R.inc(2407);if (shadowChildrenRef == null || (children = shadowChildrenRef.get()) == null) {{
            __CLR4_2_01st1stlnxz22kw.R.inc(2410);final int size = childNodes.size();
            __CLR4_2_01st1stlnxz22kw.R.inc(2411);children = new ArrayList<>(size);
            //noinspection ForLoopReplaceableByForEach (beacause it allocates an Iterator which is wasteful here)
            __CLR4_2_01st1stlnxz22kw.R.inc(2412);for (int i = 0; (((i < size)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2413)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2414)==0&false)); i++) {{
                __CLR4_2_01st1stlnxz22kw.R.inc(2415);final Node node = childNodes.get(i);
                __CLR4_2_01st1stlnxz22kw.R.inc(2416);if ((((node instanceof Element)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2417)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2418)==0&false)))
                    {__CLR4_2_01st1stlnxz22kw.R.inc(2419);children.add((Element) node);
            }}
            }__CLR4_2_01st1stlnxz22kw.R.inc(2420);shadowChildrenRef = new WeakReference<>(children);
        }
        }__CLR4_2_01st1stlnxz22kw.R.inc(2421);return children;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Clears the cached shadow child elements.
     */
    @Override
    void nodelistChanged() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2422);
        __CLR4_2_01st1stlnxz22kw.R.inc(2423);super.nodelistChanged();
        __CLR4_2_01st1stlnxz22kw.R.inc(2424);shadowChildrenRef = null;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Get this element's child text nodes. The list is unmodifiable but the text nodes may be manipulated.
     * <p>
     * This is effectively a filter on {@link #childNodes()} to get Text nodes.
     * @return child text nodes. If this element has no text nodes, returns an
     * empty list.
     * </p>
     * For example, with the input HTML: {@code <p>One <span>Two</span> Three <br> Four</p>} with the {@code p} element selected:
     * <ul>
     *     <li>{@code p.text()} = {@code "One Two Three Four"}</li>
     *     <li>{@code p.ownText()} = {@code "One Three Four"}</li>
     *     <li>{@code p.children()} = {@code Elements[<span>, <br>]}</li>
     *     <li>{@code p.childNodes()} = {@code List<Node>["One ", <span>, " Three ", <br>, " Four"]}</li>
     *     <li>{@code p.textNodes()} = {@code List<TextNode>["One ", " Three ", " Four"]}</li>
     * </ul>
     */
    public List<TextNode> textNodes() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2425);
        __CLR4_2_01st1stlnxz22kw.R.inc(2426);List<TextNode> textNodes = new ArrayList<>();
        __CLR4_2_01st1stlnxz22kw.R.inc(2427);for (Node node : childNodes) {{
            __CLR4_2_01st1stlnxz22kw.R.inc(2428);if ((((node instanceof TextNode)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2429)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2430)==0&false)))
                {__CLR4_2_01st1stlnxz22kw.R.inc(2431);textNodes.add((TextNode) node);
        }}
        }__CLR4_2_01st1stlnxz22kw.R.inc(2432);return Collections.unmodifiableList(textNodes);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Get this element's child data nodes. The list is unmodifiable but the data nodes may be manipulated.
     * <p>
     * This is effectively a filter on {@link #childNodes()} to get Data nodes.
     * </p>
     * @return child data nodes. If this element has no data nodes, returns an
     * empty list.
     * @see #data()
     */
    public List<DataNode> dataNodes() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2433);
        __CLR4_2_01st1stlnxz22kw.R.inc(2434);List<DataNode> dataNodes = new ArrayList<>();
        __CLR4_2_01st1stlnxz22kw.R.inc(2435);for (Node node : childNodes) {{
            __CLR4_2_01st1stlnxz22kw.R.inc(2436);if ((((node instanceof DataNode)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2437)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2438)==0&false)))
                {__CLR4_2_01st1stlnxz22kw.R.inc(2439);dataNodes.add((DataNode) node);
        }}
        }__CLR4_2_01st1stlnxz22kw.R.inc(2440);return Collections.unmodifiableList(dataNodes);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Find elements that match the {@link Selector} CSS query, with this element as the starting context. Matched elements
     * may include this element, or any of its children.
     * <p>
     * This method is generally more powerful to use than the DOM-type {@code getElementBy*} methods, because
     * multiple filters can be combined, e.g.:
     * </p>
     * <ul>
     * <li>{@code el.select("a[href]")} - finds links ({@code a} tags with {@code href} attributes)
     * <li>{@code el.select("a[href*=example.com]")} - finds links pointing to example.com (loosely)
     * </ul>
     * <p>
     * See the query syntax documentation in {@link org.jsoup.select.Selector}.
     * </p>
     * 
     * @param cssQuery a {@link Selector} CSS-like query
     * @return elements that match the query (empty if none match)
     * @see org.jsoup.select.Selector
     * @throws Selector.SelectorParseException (unchecked) on an invalid CSS query.
     */
    public Elements select(String cssQuery) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2441);
        __CLR4_2_01st1stlnxz22kw.R.inc(2442);return Selector.select(cssQuery, this);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Find the first Element that matches the {@link Selector} CSS query, with this element as the starting context.
     * <p>This is effectively the same as calling {@code element.select(query).first()}, but is more efficient as query
     * execution stops on the first hit.</p>
     * @param cssQuery cssQuery a {@link Selector} CSS-like query
     * @return the first matching element, or <b>{@code null}</b> if there is no match.
     */
    public Element selectFirst(String cssQuery) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2443);
        __CLR4_2_01st1stlnxz22kw.R.inc(2444);return Selector.selectFirst(cssQuery, this);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Check if this element matches the given {@link Selector} CSS query.
     * @param cssQuery a {@link Selector} CSS query
     * @return if this element matches the query
     */
    public boolean is(String cssQuery) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2445);
        __CLR4_2_01st1stlnxz22kw.R.inc(2446);return is(QueryParser.parse(cssQuery));
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Check if this element matches the given evaluator.
     * @param evaluator an element evaluator
     * @return if this element matches
     */
    public boolean is(Evaluator evaluator) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2447);
        __CLR4_2_01st1stlnxz22kw.R.inc(2448);return evaluator.matches((Element)this.root(), this);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}
    
    /**
     * Add a node child node to this element.
     * 
     * @param child node to add.
     * @return this element, so that you can add more child nodes or elements.
     */
    public Element appendChild(Node child) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2449);
        __CLR4_2_01st1stlnxz22kw.R.inc(2450);Validate.notNull(child);

        // was - Node#addChildren(child). short-circuits an array create and a loop.
        __CLR4_2_01st1stlnxz22kw.R.inc(2451);reparentChild(child);
        __CLR4_2_01st1stlnxz22kw.R.inc(2452);ensureChildNodes();
        __CLR4_2_01st1stlnxz22kw.R.inc(2453);childNodes.add(child);
        __CLR4_2_01st1stlnxz22kw.R.inc(2454);child.setSiblingIndex(childNodes.size() - 1);
        __CLR4_2_01st1stlnxz22kw.R.inc(2455);return this;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Add this element to the supplied parent element, as its next child.
     *
     * @param parent element to which this element will be appended
     * @return this element, so that you can continue modifying the element
     */
    public Element appendTo(Element parent) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2456);
        __CLR4_2_01st1stlnxz22kw.R.inc(2457);Validate.notNull(parent);
        __CLR4_2_01st1stlnxz22kw.R.inc(2458);parent.appendChild(this);
        __CLR4_2_01st1stlnxz22kw.R.inc(2459);return this;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Add a node to the start of this element's children.
     * 
     * @param child node to add.
     * @return this element, so that you can add more child nodes or elements.
     */
    public Element prependChild(Node child) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2460);
        __CLR4_2_01st1stlnxz22kw.R.inc(2461);Validate.notNull(child);
        
        __CLR4_2_01st1stlnxz22kw.R.inc(2462);addChildren(0, child);
        __CLR4_2_01st1stlnxz22kw.R.inc(2463);return this;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}


    /**
     * Inserts the given child nodes into this element at the specified index. Current nodes will be shifted to the
     * right. The inserted nodes will be moved from their current parent. To prevent moving, copy the nodes first.
     *
     * @param index 0-based index to insert children at. Specify {@code 0} to insert at the start, {@code -1} at the
     * end
     * @param children child nodes to insert
     * @return this element, for chaining.
     */
    public Element insertChildren(int index, Collection<? extends Node> children) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2464);
        __CLR4_2_01st1stlnxz22kw.R.inc(2465);Validate.notNull(children, "Children collection to be inserted must not be null.");
        __CLR4_2_01st1stlnxz22kw.R.inc(2466);int currentSize = childNodeSize();
        __CLR4_2_01st1stlnxz22kw.R.inc(2467);if ((((index < 0)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2468)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2469)==0&false))) {__CLR4_2_01st1stlnxz22kw.R.inc(2470);index += currentSize +1; // roll around
        }__CLR4_2_01st1stlnxz22kw.R.inc(2471);Validate.isTrue(index >= 0 && index <= currentSize, "Insert position out of bounds.");

        __CLR4_2_01st1stlnxz22kw.R.inc(2472);ArrayList<Node> nodes = new ArrayList<>(children);
        __CLR4_2_01st1stlnxz22kw.R.inc(2473);Node[] nodeArray = nodes.toArray(new Node[0]);
        __CLR4_2_01st1stlnxz22kw.R.inc(2474);addChildren(index, nodeArray);
        __CLR4_2_01st1stlnxz22kw.R.inc(2475);return this;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Inserts the given child nodes into this element at the specified index. Current nodes will be shifted to the
     * right. The inserted nodes will be moved from their current parent. To prevent moving, copy the nodes first.
     *
     * @param index 0-based index to insert children at. Specify {@code 0} to insert at the start, {@code -1} at the
     * end
     * @param children child nodes to insert
     * @return this element, for chaining.
     */
    public Element insertChildren(int index, Node... children) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2476);
        __CLR4_2_01st1stlnxz22kw.R.inc(2477);Validate.notNull(children, "Children collection to be inserted must not be null.");
        __CLR4_2_01st1stlnxz22kw.R.inc(2478);int currentSize = childNodeSize();
        __CLR4_2_01st1stlnxz22kw.R.inc(2479);if ((((index < 0)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2480)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2481)==0&false))) {__CLR4_2_01st1stlnxz22kw.R.inc(2482);index += currentSize +1; // roll around
        }__CLR4_2_01st1stlnxz22kw.R.inc(2483);Validate.isTrue(index >= 0 && index <= currentSize, "Insert position out of bounds.");

        __CLR4_2_01st1stlnxz22kw.R.inc(2484);addChildren(index, children);
        __CLR4_2_01st1stlnxz22kw.R.inc(2485);return this;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}
    
    /**
     * Create a new element by tag name, and add it as the last child.
     * 
     * @param tagName the name of the tag (e.g. {@code div}).
     * @return the new element, to allow you to add content to it, e.g.:
     *  {@code parent.appendElement("h1").attr("id", "header").text("Welcome");}
     */
    public Element appendElement(String tagName) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2486);
        __CLR4_2_01st1stlnxz22kw.R.inc(2487);Element child = new Element(Tag.valueOf(tagName, NodeUtils.parser(this).settings()), baseUri());
        __CLR4_2_01st1stlnxz22kw.R.inc(2488);appendChild(child);
        __CLR4_2_01st1stlnxz22kw.R.inc(2489);return child;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}
    
    /**
     * Create a new element by tag name, and add it as the first child.
     * 
     * @param tagName the name of the tag (e.g. {@code div}).
     * @return the new element, to allow you to add content to it, e.g.:
     *  {@code parent.prependElement("h1").attr("id", "header").text("Welcome");}
     */
    public Element prependElement(String tagName) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2490);
        __CLR4_2_01st1stlnxz22kw.R.inc(2491);Element child = new Element(Tag.valueOf(tagName, NodeUtils.parser(this).settings()), baseUri());
        __CLR4_2_01st1stlnxz22kw.R.inc(2492);prependChild(child);
        __CLR4_2_01st1stlnxz22kw.R.inc(2493);return child;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}
    
    /**
     * Create and append a new TextNode to this element.
     * 
     * @param text the unencoded text to add
     * @return this element
     */
    public Element appendText(String text) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2494);
        __CLR4_2_01st1stlnxz22kw.R.inc(2495);Validate.notNull(text);
        __CLR4_2_01st1stlnxz22kw.R.inc(2496);TextNode node = new TextNode(text);
        __CLR4_2_01st1stlnxz22kw.R.inc(2497);appendChild(node);
        __CLR4_2_01st1stlnxz22kw.R.inc(2498);return this;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}
    
    /**
     * Create and prepend a new TextNode to this element.
     * 
     * @param text the unencoded text to add
     * @return this element
     */
    public Element prependText(String text) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2499);
        __CLR4_2_01st1stlnxz22kw.R.inc(2500);Validate.notNull(text);
        __CLR4_2_01st1stlnxz22kw.R.inc(2501);TextNode node = new TextNode(text);
        __CLR4_2_01st1stlnxz22kw.R.inc(2502);prependChild(node);
        __CLR4_2_01st1stlnxz22kw.R.inc(2503);return this;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}
    
    /**
     * Add inner HTML to this element. The supplied HTML will be parsed, and each node appended to the end of the children.
     * @param html HTML to add inside this element, after the existing HTML
     * @return this element
     * @see #html(String)
     */
    public Element append(String html) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2504);
        __CLR4_2_01st1stlnxz22kw.R.inc(2505);Validate.notNull(html);
        __CLR4_2_01st1stlnxz22kw.R.inc(2506);List<Node> nodes = NodeUtils.parser(this).parseFragmentInput(html, this, baseUri());
        __CLR4_2_01st1stlnxz22kw.R.inc(2507);addChildren(nodes.toArray(new Node[0]));
        __CLR4_2_01st1stlnxz22kw.R.inc(2508);return this;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}
    
    /**
     * Add inner HTML into this element. The supplied HTML will be parsed, and each node prepended to the start of the element's children.
     * @param html HTML to add inside this element, before the existing HTML
     * @return this element
     * @see #html(String)
     */
    public Element prepend(String html) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2509);
        __CLR4_2_01st1stlnxz22kw.R.inc(2510);Validate.notNull(html);
        __CLR4_2_01st1stlnxz22kw.R.inc(2511);List<Node> nodes = NodeUtils.parser(this).parseFragmentInput(html, this, baseUri());
        __CLR4_2_01st1stlnxz22kw.R.inc(2512);addChildren(0, nodes.toArray(new Node[0]));
        __CLR4_2_01st1stlnxz22kw.R.inc(2513);return this;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Insert the specified HTML into the DOM before this element (as a preceding sibling).
     *
     * @param html HTML to add before this element
     * @return this element, for chaining
     * @see #after(String)
     */
    @Override
    public Element before(String html) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2514);
        __CLR4_2_01st1stlnxz22kw.R.inc(2515);return (Element) super.before(html);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Insert the specified node into the DOM before this node (as a preceding sibling).
     * @param node to add before this element
     * @return this Element, for chaining
     * @see #after(Node)
     */
    @Override
    public Element before(Node node) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2516);
        __CLR4_2_01st1stlnxz22kw.R.inc(2517);return (Element) super.before(node);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Insert the specified HTML into the DOM after this element (as a following sibling).
     *
     * @param html HTML to add after this element
     * @return this element, for chaining
     * @see #before(String)
     */
    @Override
    public Element after(String html) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2518);
        __CLR4_2_01st1stlnxz22kw.R.inc(2519);return (Element) super.after(html);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Insert the specified node into the DOM after this node (as a following sibling).
     * @param node to add after this element
     * @return this element, for chaining
     * @see #before(Node)
     */
    @Override
    public Element after(Node node) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2520);
        __CLR4_2_01st1stlnxz22kw.R.inc(2521);return (Element) super.after(node);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Remove all of the element's child nodes. Any attributes are left as-is.
     * @return this element
     */
    public Element empty() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2522);
        __CLR4_2_01st1stlnxz22kw.R.inc(2523);childNodes.clear();
        __CLR4_2_01st1stlnxz22kw.R.inc(2524);return this;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Wrap the supplied HTML around this element.
     *
     * @param html HTML to wrap around this element, e.g. {@code <div class="head"></div>}. Can be arbitrarily deep.
     * @return this element, for chaining.
     */
    @Override
    public Element wrap(String html) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2525);
        __CLR4_2_01st1stlnxz22kw.R.inc(2526);return (Element) super.wrap(html);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Get a CSS selector that will uniquely select this element.
     * <p>
     * If the element has an ID, returns #id;
     * otherwise returns the parent (if any) CSS selector, followed by {@literal '>'},
     * followed by a unique selector for the element (tag.class.class:nth-child(n)).
     * </p>
     *
     * @return the CSS Path that can be used to retrieve the element in a selector.
     */
    public String cssSelector() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2527);
        __CLR4_2_01st1stlnxz22kw.R.inc(2528);if ((((id().length() > 0)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2529)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2530)==0&false)))
            {__CLR4_2_01st1stlnxz22kw.R.inc(2531);return "#" + id();

        // Translate HTML namespace ns:tag to CSS namespace syntax ns|tag
        }__CLR4_2_01st1stlnxz22kw.R.inc(2532);String tagName = tagName().replace(':', '|');
        __CLR4_2_01st1stlnxz22kw.R.inc(2533);StringBuilder selector = new StringBuilder(tagName);
        __CLR4_2_01st1stlnxz22kw.R.inc(2534);String classes = StringUtil.join(classNames(), ".");
        __CLR4_2_01st1stlnxz22kw.R.inc(2535);if ((((classes.length() > 0)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2536)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2537)==0&false)))
            {__CLR4_2_01st1stlnxz22kw.R.inc(2538);selector.append('.').append(classes);

        }__CLR4_2_01st1stlnxz22kw.R.inc(2539);if ((((parent() == null || parent() instanceof Document)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2540)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2541)==0&false))) // don't add Document to selector, as will always have a html node
            {__CLR4_2_01st1stlnxz22kw.R.inc(2542);return selector.toString();

        }__CLR4_2_01st1stlnxz22kw.R.inc(2543);selector.insert(0, " > ");
        __CLR4_2_01st1stlnxz22kw.R.inc(2544);if ((((parent().select(selector.toString()).size() > 1)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2545)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2546)==0&false)))
            {__CLR4_2_01st1stlnxz22kw.R.inc(2547);selector.append(String.format(
                ":nth-child(%d)", elementSiblingIndex() + 1));

        }__CLR4_2_01st1stlnxz22kw.R.inc(2548);return parent().cssSelector() + selector.toString();
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Get sibling elements. If the element has no sibling elements, returns an empty list. An element is not a sibling
     * of itself, so will not be included in the returned list.
     * @return sibling elements
     */
    public Elements siblingElements() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2549);
        __CLR4_2_01st1stlnxz22kw.R.inc(2550);if ((((parentNode == null)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2551)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2552)==0&false)))
            {__CLR4_2_01st1stlnxz22kw.R.inc(2553);return new Elements(0);

        }__CLR4_2_01st1stlnxz22kw.R.inc(2554);List<Element> elements = parent().childElementsList();
        __CLR4_2_01st1stlnxz22kw.R.inc(2555);Elements siblings = new Elements(elements.size() - 1);
        __CLR4_2_01st1stlnxz22kw.R.inc(2556);for (Element el: elements)
            {__CLR4_2_01st1stlnxz22kw.R.inc(2557);if ((((el != this)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2558)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2559)==0&false)))
                {__CLR4_2_01st1stlnxz22kw.R.inc(2560);siblings.add(el);
        }}__CLR4_2_01st1stlnxz22kw.R.inc(2561);return siblings;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Gets the next sibling element of this element. E.g., if a {@code div} contains two {@code p}s, 
     * the {@code nextElementSibling} of the first {@code p} is the second {@code p}.
     * <p>
     * This is similar to {@link #nextSibling()}, but specifically finds only Elements
     * </p>
     * @return the next element, or null if there is no next element
     * @see #previousElementSibling()
     */
    public Element nextElementSibling() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2562);
        __CLR4_2_01st1stlnxz22kw.R.inc(2563);if ((((parentNode == null)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2564)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2565)==0&false))) {__CLR4_2_01st1stlnxz22kw.R.inc(2566);return null;
        }__CLR4_2_01st1stlnxz22kw.R.inc(2567);List<Element> siblings = parent().childElementsList();
        __CLR4_2_01st1stlnxz22kw.R.inc(2568);Integer index = indexInList(this, siblings);
        __CLR4_2_01st1stlnxz22kw.R.inc(2569);Validate.notNull(index);
        __CLR4_2_01st1stlnxz22kw.R.inc(2570);if ((((siblings.size() > index+1)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2571)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2572)==0&false)))
            {__CLR4_2_01st1stlnxz22kw.R.inc(2573);return siblings.get(index+1);
        }else
            {__CLR4_2_01st1stlnxz22kw.R.inc(2574);return null;
    }}finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Get each of the sibling elements that come after this element.
     *
     * @return each of the element siblings after this element, or an empty list if there are no next sibling elements
     */
    public Elements nextElementSiblings() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2575);
        __CLR4_2_01st1stlnxz22kw.R.inc(2576);return nextElementSiblings(true);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Gets the previous element sibling of this element.
     * @return the previous element, or null if there is no previous element
     * @see #nextElementSibling()
     */
    public Element previousElementSibling() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2577);
        __CLR4_2_01st1stlnxz22kw.R.inc(2578);if ((((parentNode == null)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2579)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2580)==0&false))) {__CLR4_2_01st1stlnxz22kw.R.inc(2581);return null;
        }__CLR4_2_01st1stlnxz22kw.R.inc(2582);List<Element> siblings = parent().childElementsList();
        __CLR4_2_01st1stlnxz22kw.R.inc(2583);Integer index = indexInList(this, siblings);
        __CLR4_2_01st1stlnxz22kw.R.inc(2584);Validate.notNull(index);
        __CLR4_2_01st1stlnxz22kw.R.inc(2585);if ((((index > 0)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2586)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2587)==0&false)))
            {__CLR4_2_01st1stlnxz22kw.R.inc(2588);return siblings.get(index-1);
        }else
            {__CLR4_2_01st1stlnxz22kw.R.inc(2589);return null;
    }}finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Get each of the element siblings before this element.
     *
     * @return the previous element siblings, or an empty list if there are none.
     */
    public Elements previousElementSiblings() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2590);
        __CLR4_2_01st1stlnxz22kw.R.inc(2591);return nextElementSiblings(false);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    private Elements nextElementSiblings(boolean next) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2592);
        __CLR4_2_01st1stlnxz22kw.R.inc(2593);Elements els = new Elements();
        __CLR4_2_01st1stlnxz22kw.R.inc(2594);if ((((parentNode == null)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2595)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2596)==0&false)))
            {__CLR4_2_01st1stlnxz22kw.R.inc(2597);return  els;
        }__CLR4_2_01st1stlnxz22kw.R.inc(2598);els.add(this);
        __CLR4_2_01st1stlnxz22kw.R.inc(2599);return (((next )&&(__CLR4_2_01st1stlnxz22kw.R.iget(2600)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2601)==0&false))?  els.nextAll() : els.prevAll();
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Gets the first element sibling of this element.
     * @return the first sibling that is an element (aka the parent's first element child) 
     */
    public Element firstElementSibling() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2602);
        // todo: should firstSibling() exclude this?
        __CLR4_2_01st1stlnxz22kw.R.inc(2603);List<Element> siblings = parent().childElementsList();
        __CLR4_2_01st1stlnxz22kw.R.inc(2604);return (((siblings.size() > 1 )&&(__CLR4_2_01st1stlnxz22kw.R.iget(2605)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2606)==0&false))? siblings.get(0) : null;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}
    
    /**
     * Get the list index of this element in its element sibling list. I.e. if this is the first element
     * sibling, returns 0.
     * @return position in element sibling list
     */
    public int elementSiblingIndex() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2607);
       __CLR4_2_01st1stlnxz22kw.R.inc(2608);if ((((parent() == null)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2609)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2610)==0&false))) {__CLR4_2_01st1stlnxz22kw.R.inc(2611);return 0;
       }__CLR4_2_01st1stlnxz22kw.R.inc(2612);return indexInList(this, parent().childElementsList());
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Gets the last element sibling of this element
     * @return the last sibling that is an element (aka the parent's last element child) 
     */
    public Element lastElementSibling() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2613);
        __CLR4_2_01st1stlnxz22kw.R.inc(2614);List<Element> siblings = parent().childElementsList();
        __CLR4_2_01st1stlnxz22kw.R.inc(2615);return (((siblings.size() > 1 )&&(__CLR4_2_01st1stlnxz22kw.R.iget(2616)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2617)==0&false))? siblings.get(siblings.size() - 1) : null;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    private static <E extends Element> int indexInList(Element search, List<E> elements) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2618);
        __CLR4_2_01st1stlnxz22kw.R.inc(2619);final int size = elements.size();
        __CLR4_2_01st1stlnxz22kw.R.inc(2620);for (int i = 0; (((i < size)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2621)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2622)==0&false)); i++) {{
            __CLR4_2_01st1stlnxz22kw.R.inc(2623);if ((((elements.get(i) == search)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2624)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2625)==0&false)))
                {__CLR4_2_01st1stlnxz22kw.R.inc(2626);return i;
        }}
        }__CLR4_2_01st1stlnxz22kw.R.inc(2627);return 0;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    // DOM type methods

    /**
     * Finds elements, including and recursively under this element, with the specified tag name.
     * @param tagName The tag name to search for (case insensitively).
     * @return a matching unmodifiable list of elements. Will be empty if this element and none of its children match.
     */
    public Elements getElementsByTag(String tagName) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2628);
        __CLR4_2_01st1stlnxz22kw.R.inc(2629);Validate.notEmpty(tagName);
        __CLR4_2_01st1stlnxz22kw.R.inc(2630);tagName = normalize(tagName);

        __CLR4_2_01st1stlnxz22kw.R.inc(2631);return Collector.collect(new Evaluator.Tag(tagName), this);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Find an element by ID, including or under this element.
     * <p>
     * Note that this finds the first matching ID, starting with this element. If you search down from a different
     * starting point, it is possible to find a different element by ID. For unique element by ID within a Document,
     * use {@link Document#getElementById(String)}
     * @param id The ID to search for.
     * @return The first matching element by ID, starting with this element, or null if none found.
     */
    public Element getElementById(String id) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2632);
        __CLR4_2_01st1stlnxz22kw.R.inc(2633);Validate.notEmpty(id);
        
        __CLR4_2_01st1stlnxz22kw.R.inc(2634);Elements elements = Collector.collect(new Evaluator.Id(id), this);
        __CLR4_2_01st1stlnxz22kw.R.inc(2635);if ((((elements.size() > 0)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2636)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2637)==0&false)))
            {__CLR4_2_01st1stlnxz22kw.R.inc(2638);return elements.get(0);
        }else
            {__CLR4_2_01st1stlnxz22kw.R.inc(2639);return null;
    }}finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Find elements that have this class, including or under this element. Case insensitive.
     * <p>
     * Elements can have multiple classes (e.g. {@code <div class="header round first">}. This method
     * checks each class, so you can find the above with {@code el.getElementsByClass("header");}.
     * 
     * @param className the name of the class to search for.
     * @return elements with the supplied class name, empty if none
     * @see #hasClass(String)
     * @see #classNames()
     */
    public Elements getElementsByClass(String className) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2640);
        __CLR4_2_01st1stlnxz22kw.R.inc(2641);Validate.notEmpty(className);

        __CLR4_2_01st1stlnxz22kw.R.inc(2642);return Collector.collect(new Evaluator.Class(className), this);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Find elements that have a named attribute set. Case insensitive.
     *
     * @param key name of the attribute, e.g. {@code href}
     * @return elements that have this attribute, empty if none
     */
    public Elements getElementsByAttribute(String key) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2643);
        __CLR4_2_01st1stlnxz22kw.R.inc(2644);Validate.notEmpty(key);
        __CLR4_2_01st1stlnxz22kw.R.inc(2645);key = key.trim();

        __CLR4_2_01st1stlnxz22kw.R.inc(2646);return Collector.collect(new Evaluator.Attribute(key), this);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Find elements that have an attribute name starting with the supplied prefix. Use {@code data-} to find elements
     * that have HTML5 datasets.
     * @param keyPrefix name prefix of the attribute e.g. {@code data-}
     * @return elements that have attribute names that start with with the prefix, empty if none.
     */
    public Elements getElementsByAttributeStarting(String keyPrefix) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2647);
        __CLR4_2_01st1stlnxz22kw.R.inc(2648);Validate.notEmpty(keyPrefix);
        __CLR4_2_01st1stlnxz22kw.R.inc(2649);keyPrefix = keyPrefix.trim();

        __CLR4_2_01st1stlnxz22kw.R.inc(2650);return Collector.collect(new Evaluator.AttributeStarting(keyPrefix), this);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Find elements that have an attribute with the specific value. Case insensitive.
     * 
     * @param key name of the attribute
     * @param value value of the attribute
     * @return elements that have this attribute with this value, empty if none
     */
    public Elements getElementsByAttributeValue(String key, String value) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2651);
        __CLR4_2_01st1stlnxz22kw.R.inc(2652);return Collector.collect(new Evaluator.AttributeWithValue(key, value), this);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Find elements that either do not have this attribute, or have it with a different value. Case insensitive.
     * 
     * @param key name of the attribute
     * @param value value of the attribute
     * @return elements that do not have a matching attribute
     */
    public Elements getElementsByAttributeValueNot(String key, String value) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2653);
        __CLR4_2_01st1stlnxz22kw.R.inc(2654);return Collector.collect(new Evaluator.AttributeWithValueNot(key, value), this);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Find elements that have attributes that start with the value prefix. Case insensitive.
     * 
     * @param key name of the attribute
     * @param valuePrefix start of attribute value
     * @return elements that have attributes that start with the value prefix
     */
    public Elements getElementsByAttributeValueStarting(String key, String valuePrefix) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2655);
        __CLR4_2_01st1stlnxz22kw.R.inc(2656);return Collector.collect(new Evaluator.AttributeWithValueStarting(key, valuePrefix), this);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Find elements that have attributes that end with the value suffix. Case insensitive.
     * 
     * @param key name of the attribute
     * @param valueSuffix end of the attribute value
     * @return elements that have attributes that end with the value suffix
     */
    public Elements getElementsByAttributeValueEnding(String key, String valueSuffix) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2657);
        __CLR4_2_01st1stlnxz22kw.R.inc(2658);return Collector.collect(new Evaluator.AttributeWithValueEnding(key, valueSuffix), this);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Find elements that have attributes whose value contains the match string. Case insensitive.
     * 
     * @param key name of the attribute
     * @param match substring of value to search for
     * @return elements that have attributes containing this text
     */
    public Elements getElementsByAttributeValueContaining(String key, String match) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2659);
        __CLR4_2_01st1stlnxz22kw.R.inc(2660);return Collector.collect(new Evaluator.AttributeWithValueContaining(key, match), this);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}
    
    /**
     * Find elements that have attributes whose values match the supplied regular expression.
     * @param key name of the attribute
     * @param pattern compiled regular expression to match against attribute values
     * @return elements that have attributes matching this regular expression
     */
    public Elements getElementsByAttributeValueMatching(String key, Pattern pattern) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2661);
        __CLR4_2_01st1stlnxz22kw.R.inc(2662);return Collector.collect(new Evaluator.AttributeWithValueMatching(key, pattern), this);
        
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}
    
    /**
     * Find elements that have attributes whose values match the supplied regular expression.
     * @param key name of the attribute
     * @param regex regular expression to match against attribute values. You can use <a href="http://java.sun.com/docs/books/tutorial/essential/regex/pattern.html#embedded">embedded flags</a> (such as (?i) and (?m) to control regex options.
     * @return elements that have attributes matching this regular expression
     */
    public Elements getElementsByAttributeValueMatching(String key, String regex) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2663);
        __CLR4_2_01st1stlnxz22kw.R.inc(2664);Pattern pattern;
        __CLR4_2_01st1stlnxz22kw.R.inc(2665);try {
            __CLR4_2_01st1stlnxz22kw.R.inc(2666);pattern = Pattern.compile(regex);
        } catch (PatternSyntaxException e) {
            __CLR4_2_01st1stlnxz22kw.R.inc(2667);throw new IllegalArgumentException("Pattern syntax error: " + regex, e);
        }
        __CLR4_2_01st1stlnxz22kw.R.inc(2668);return getElementsByAttributeValueMatching(key, pattern);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}
    
    /**
     * Find elements whose sibling index is less than the supplied index.
     * @param index 0-based index
     * @return elements less than index
     */
    public Elements getElementsByIndexLessThan(int index) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2669);
        __CLR4_2_01st1stlnxz22kw.R.inc(2670);return Collector.collect(new Evaluator.IndexLessThan(index), this);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}
    
    /**
     * Find elements whose sibling index is greater than the supplied index.
     * @param index 0-based index
     * @return elements greater than index
     */
    public Elements getElementsByIndexGreaterThan(int index) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2671);
        __CLR4_2_01st1stlnxz22kw.R.inc(2672);return Collector.collect(new Evaluator.IndexGreaterThan(index), this);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}
    
    /**
     * Find elements whose sibling index is equal to the supplied index.
     * @param index 0-based index
     * @return elements equal to index
     */
    public Elements getElementsByIndexEquals(int index) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2673);
        __CLR4_2_01st1stlnxz22kw.R.inc(2674);return Collector.collect(new Evaluator.IndexEquals(index), this);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}
    
    /**
     * Find elements that contain the specified string. The search is case insensitive. The text may appear directly
     * in the element, or in any of its descendants.
     * @param searchText to look for in the element's text
     * @return elements that contain the string, case insensitive.
     * @see Element#text()
     */
    public Elements getElementsContainingText(String searchText) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2675);
        __CLR4_2_01st1stlnxz22kw.R.inc(2676);return Collector.collect(new Evaluator.ContainsText(searchText), this);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}
    
    /**
     * Find elements that directly contain the specified string. The search is case insensitive. The text must appear directly
     * in the element, not in any of its descendants.
     * @param searchText to look for in the element's own text
     * @return elements that contain the string, case insensitive.
     * @see Element#ownText()
     */
    public Elements getElementsContainingOwnText(String searchText) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2677);
        __CLR4_2_01st1stlnxz22kw.R.inc(2678);return Collector.collect(new Evaluator.ContainsOwnText(searchText), this);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}
    
    /**
     * Find elements whose text matches the supplied regular expression.
     * @param pattern regular expression to match text against
     * @return elements matching the supplied regular expression.
     * @see Element#text()
     */
    public Elements getElementsMatchingText(Pattern pattern) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2679);
        __CLR4_2_01st1stlnxz22kw.R.inc(2680);return Collector.collect(new Evaluator.Matches(pattern), this);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}
    
    /**
     * Find elements whose text matches the supplied regular expression.
     * @param regex regular expression to match text against. You can use <a href="http://java.sun.com/docs/books/tutorial/essential/regex/pattern.html#embedded">embedded flags</a> (such as (?i) and (?m) to control regex options.
     * @return elements matching the supplied regular expression.
     * @see Element#text()
     */
    public Elements getElementsMatchingText(String regex) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2681);
        __CLR4_2_01st1stlnxz22kw.R.inc(2682);Pattern pattern;
        __CLR4_2_01st1stlnxz22kw.R.inc(2683);try {
            __CLR4_2_01st1stlnxz22kw.R.inc(2684);pattern = Pattern.compile(regex);
        } catch (PatternSyntaxException e) {
            __CLR4_2_01st1stlnxz22kw.R.inc(2685);throw new IllegalArgumentException("Pattern syntax error: " + regex, e);
        }
        __CLR4_2_01st1stlnxz22kw.R.inc(2686);return getElementsMatchingText(pattern);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}
    
    /**
     * Find elements whose own text matches the supplied regular expression.
     * @param pattern regular expression to match text against
     * @return elements matching the supplied regular expression.
     * @see Element#ownText()
     */
    public Elements getElementsMatchingOwnText(Pattern pattern) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2687);
        __CLR4_2_01st1stlnxz22kw.R.inc(2688);return Collector.collect(new Evaluator.MatchesOwn(pattern), this);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}
    
    /**
     * Find elements whose own text matches the supplied regular expression.
     * @param regex regular expression to match text against. You can use <a href="http://java.sun.com/docs/books/tutorial/essential/regex/pattern.html#embedded">embedded flags</a> (such as (?i) and (?m) to control regex options.
     * @return elements matching the supplied regular expression.
     * @see Element#ownText()
     */
    public Elements getElementsMatchingOwnText(String regex) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2689);
        __CLR4_2_01st1stlnxz22kw.R.inc(2690);Pattern pattern;
        __CLR4_2_01st1stlnxz22kw.R.inc(2691);try {
            __CLR4_2_01st1stlnxz22kw.R.inc(2692);pattern = Pattern.compile(regex);
        } catch (PatternSyntaxException e) {
            __CLR4_2_01st1stlnxz22kw.R.inc(2693);throw new IllegalArgumentException("Pattern syntax error: " + regex, e);
        }
        __CLR4_2_01st1stlnxz22kw.R.inc(2694);return getElementsMatchingOwnText(pattern);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}
    
    /**
     * Find all elements under this element (including self, and children of children).
     * 
     * @return all elements
     */
    public Elements getAllElements() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2695);
        __CLR4_2_01st1stlnxz22kw.R.inc(2696);return Collector.collect(new Evaluator.AllElements(), this);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Gets the combined text of this element and all its children. Whitespace is normalized and trimmed.
     * <p>
     * For example, given HTML {@code <p>Hello  <b>there</b> now! </p>}, {@code p.text()} returns {@code "Hello there now!"}
     *
     * @return unencoded, normalized text, or empty string if none.
     * @see #wholeText() if you don't want the text to be normalized.
     * @see #ownText()
     * @see #textNodes()
     */
    public String text() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2697);
        __CLR4_2_01st1stlnxz22kw.R.inc(2698);final StringBuilder accum = StringUtil.borrowBuilder();
        __CLR4_2_01st1stlnxz22kw.R.inc(2699);NodeTraversor.traverse(new NodeVisitor() {
            public void head(Node node, int depth) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2700);
                __CLR4_2_01st1stlnxz22kw.R.inc(2701);if ((((node instanceof TextNode)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2702)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2703)==0&false))) {{
                    __CLR4_2_01st1stlnxz22kw.R.inc(2704);TextNode textNode = (TextNode) node;
                    __CLR4_2_01st1stlnxz22kw.R.inc(2705);appendNormalisedText(accum, textNode);
                } }else {__CLR4_2_01st1stlnxz22kw.R.inc(2706);if ((((node instanceof Element)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2707)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2708)==0&false))) {{
                    __CLR4_2_01st1stlnxz22kw.R.inc(2709);Element element = (Element) node;
                    __CLR4_2_01st1stlnxz22kw.R.inc(2710);if ((((accum.length() > 0 &&
                        (element.isBlock() || element.tag.getName().equals("br")) &&
                        !TextNode.lastCharIsWhitespace(accum))&&(__CLR4_2_01st1stlnxz22kw.R.iget(2711)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2712)==0&false)))
                        {__CLR4_2_01st1stlnxz22kw.R.inc(2713);accum.append(' ');
                }}
            }}}finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

            public void tail(Node node, int depth) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2714);
                // make sure there is a space between block tags and immediately following text nodes <div>One</div>Two should be "One Two".
                __CLR4_2_01st1stlnxz22kw.R.inc(2715);if ((((node instanceof Element)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2716)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2717)==0&false))) {{
                    __CLR4_2_01st1stlnxz22kw.R.inc(2718);Element element = (Element) node;
                    __CLR4_2_01st1stlnxz22kw.R.inc(2719);if ((((element.isBlock() && (node.nextSibling() instanceof TextNode) && !TextNode.lastCharIsWhitespace(accum))&&(__CLR4_2_01st1stlnxz22kw.R.iget(2720)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2721)==0&false)))
                        {__CLR4_2_01st1stlnxz22kw.R.inc(2722);accum.append(' ');
                }}

            }}finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}
        }, this);

        __CLR4_2_01st1stlnxz22kw.R.inc(2723);return StringUtil.releaseBuilder(accum).trim();
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Get the (unencoded) text of all children of this element, including any newlines and spaces present in the
     * original.
     *
     * @return unencoded, un-normalized text
     * @see #text()
     */
    public String wholeText() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2724);
        __CLR4_2_01st1stlnxz22kw.R.inc(2725);final StringBuilder accum = StringUtil.borrowBuilder();
        __CLR4_2_01st1stlnxz22kw.R.inc(2726);NodeTraversor.traverse(new NodeVisitor() {
            public void head(Node node, int depth) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2727);
                __CLR4_2_01st1stlnxz22kw.R.inc(2728);if ((((node instanceof TextNode)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2729)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2730)==0&false))) {{
                    __CLR4_2_01st1stlnxz22kw.R.inc(2731);TextNode textNode = (TextNode) node;
                    __CLR4_2_01st1stlnxz22kw.R.inc(2732);accum.append(textNode.getWholeText());
                }
            }}finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

            public void tail(Node node, int depth) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2733);
            }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}
        }, this);

        __CLR4_2_01st1stlnxz22kw.R.inc(2734);return StringUtil.releaseBuilder(accum);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Gets the text owned by this element only; does not get the combined text of all children.
     * <p>
     * For example, given HTML {@code <p>Hello <b>there</b> now!</p>}, {@code p.ownText()} returns {@code "Hello now!"},
     * whereas {@code p.text()} returns {@code "Hello there now!"}.
     * Note that the text within the {@code b} element is not returned, as it is not a direct child of the {@code p} element.
     *
     * @return unencoded text, or empty string if none.
     * @see #text()
     * @see #textNodes()
     */
    public String ownText() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2735);
        __CLR4_2_01st1stlnxz22kw.R.inc(2736);StringBuilder sb = StringUtil.borrowBuilder();
        __CLR4_2_01st1stlnxz22kw.R.inc(2737);ownText(sb);
        __CLR4_2_01st1stlnxz22kw.R.inc(2738);return StringUtil.releaseBuilder(sb).trim();
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    private void ownText(StringBuilder accum) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2739);
        __CLR4_2_01st1stlnxz22kw.R.inc(2740);for (Node child : childNodes) {{
            __CLR4_2_01st1stlnxz22kw.R.inc(2741);if ((((child instanceof TextNode)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2742)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2743)==0&false))) {{
                __CLR4_2_01st1stlnxz22kw.R.inc(2744);TextNode textNode = (TextNode) child;
                __CLR4_2_01st1stlnxz22kw.R.inc(2745);appendNormalisedText(accum, textNode);
            } }else {__CLR4_2_01st1stlnxz22kw.R.inc(2746);if ((((child instanceof Element)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2747)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2748)==0&false))) {{
                __CLR4_2_01st1stlnxz22kw.R.inc(2749);appendWhitespaceIfBr((Element) child, accum);
            }
        }}}
    }}finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    private static void appendNormalisedText(StringBuilder accum, TextNode textNode) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2750);
        __CLR4_2_01st1stlnxz22kw.R.inc(2751);String text = textNode.getWholeText();

        __CLR4_2_01st1stlnxz22kw.R.inc(2752);if ((((preserveWhitespace(textNode.parentNode) || textNode instanceof CDataNode)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2753)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2754)==0&false)))
            {__CLR4_2_01st1stlnxz22kw.R.inc(2755);accum.append(text);
        }else
            {__CLR4_2_01st1stlnxz22kw.R.inc(2756);StringUtil.appendNormalisedWhitespace(accum, text, TextNode.lastCharIsWhitespace(accum));
    }}finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    private static void appendWhitespaceIfBr(Element element, StringBuilder accum) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2757);
        __CLR4_2_01st1stlnxz22kw.R.inc(2758);if ((((element.tag.getName().equals("br") && !TextNode.lastCharIsWhitespace(accum))&&(__CLR4_2_01st1stlnxz22kw.R.iget(2759)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2760)==0&false)))
            {__CLR4_2_01st1stlnxz22kw.R.inc(2761);accum.append(" ");
    }}finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    static boolean preserveWhitespace(Node node) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2762);
        // looks only at this element and five levels up, to prevent recursion & needless stack searches
        __CLR4_2_01st1stlnxz22kw.R.inc(2763);if ((((node instanceof Element)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2764)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2765)==0&false))) {{
            __CLR4_2_01st1stlnxz22kw.R.inc(2766);Element el = (Element) node;
            __CLR4_2_01st1stlnxz22kw.R.inc(2767);int i = 0;
            __CLR4_2_01st1stlnxz22kw.R.inc(2768);do {{
                __CLR4_2_01st1stlnxz22kw.R.inc(2769);if ((((el.tag.preserveWhitespace())&&(__CLR4_2_01st1stlnxz22kw.R.iget(2770)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2771)==0&false)))
                    {__CLR4_2_01st1stlnxz22kw.R.inc(2772);return true;
                }__CLR4_2_01st1stlnxz22kw.R.inc(2773);el = el.parent();
                __CLR4_2_01st1stlnxz22kw.R.inc(2774);i++;
            } }while ((((i < 6 && el != null)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2775)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2776)==0&false)));
        }
        }__CLR4_2_01st1stlnxz22kw.R.inc(2777);return false;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Set the text of this element. Any existing contents (text or elements) will be cleared
     * @param text unencoded text
     * @return this element
     */
    public Element text(String text) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2778);
        __CLR4_2_01st1stlnxz22kw.R.inc(2779);Validate.notNull(text);

        __CLR4_2_01st1stlnxz22kw.R.inc(2780);empty();
        __CLR4_2_01st1stlnxz22kw.R.inc(2781);TextNode textNode = new TextNode(text);
        __CLR4_2_01st1stlnxz22kw.R.inc(2782);appendChild(textNode);

        __CLR4_2_01st1stlnxz22kw.R.inc(2783);return this;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     Test if this element has any text content (that is not just whitespace).
     @return true if element has non-blank text content.
     */
    public boolean hasText() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2784);
        __CLR4_2_01st1stlnxz22kw.R.inc(2785);for (Node child: childNodes) {{
            __CLR4_2_01st1stlnxz22kw.R.inc(2786);if ((((child instanceof TextNode)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2787)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2788)==0&false))) {{
                __CLR4_2_01st1stlnxz22kw.R.inc(2789);TextNode textNode = (TextNode) child;
                __CLR4_2_01st1stlnxz22kw.R.inc(2790);if ((((!textNode.isBlank())&&(__CLR4_2_01st1stlnxz22kw.R.iget(2791)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2792)==0&false)))
                    {__CLR4_2_01st1stlnxz22kw.R.inc(2793);return true;
            }} }else {__CLR4_2_01st1stlnxz22kw.R.inc(2794);if ((((child instanceof Element)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2795)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2796)==0&false))) {{
                __CLR4_2_01st1stlnxz22kw.R.inc(2797);Element el = (Element) child;
                __CLR4_2_01st1stlnxz22kw.R.inc(2798);if ((((el.hasText())&&(__CLR4_2_01st1stlnxz22kw.R.iget(2799)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2800)==0&false)))
                    {__CLR4_2_01st1stlnxz22kw.R.inc(2801);return true;
            }}
        }}}
        }__CLR4_2_01st1stlnxz22kw.R.inc(2802);return false;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Get the combined data of this element. Data is e.g. the inside of a {@code script} tag. Note that data is NOT the
     * text of the element. Use {@link #text()} to get the text that would be visible to a user, and {@link #data()}
     * for the contents of scripts, comments, CSS styles, etc.
     *
     * @return the data, or empty string if none
     *
     * @see #dataNodes()
     */
    public String data() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2803);
        __CLR4_2_01st1stlnxz22kw.R.inc(2804);StringBuilder sb = StringUtil.borrowBuilder();

        __CLR4_2_01st1stlnxz22kw.R.inc(2805);for (Node childNode : childNodes) {{
            __CLR4_2_01st1stlnxz22kw.R.inc(2806);if ((((childNode instanceof DataNode)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2807)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2808)==0&false))) {{
                __CLR4_2_01st1stlnxz22kw.R.inc(2809);DataNode data = (DataNode) childNode;
                __CLR4_2_01st1stlnxz22kw.R.inc(2810);sb.append(data.getWholeData());
            } }else {__CLR4_2_01st1stlnxz22kw.R.inc(2811);if ((((childNode instanceof Comment)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2812)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2813)==0&false))) {{
                __CLR4_2_01st1stlnxz22kw.R.inc(2814);Comment comment = (Comment) childNode;
                __CLR4_2_01st1stlnxz22kw.R.inc(2815);sb.append(comment.getData());
            } }else {__CLR4_2_01st1stlnxz22kw.R.inc(2816);if ((((childNode instanceof Element)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2817)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2818)==0&false))) {{
                __CLR4_2_01st1stlnxz22kw.R.inc(2819);Element element = (Element) childNode;
                __CLR4_2_01st1stlnxz22kw.R.inc(2820);String elementData = element.data();
                __CLR4_2_01st1stlnxz22kw.R.inc(2821);sb.append(elementData);
            } }else {__CLR4_2_01st1stlnxz22kw.R.inc(2822);if ((((childNode instanceof CDataNode)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2823)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2824)==0&false))) {{
                // this shouldn't really happen because the html parser won't see the cdata as anything special when parsing script.
                // but incase another type gets through.
                __CLR4_2_01st1stlnxz22kw.R.inc(2825);CDataNode cDataNode = (CDataNode) childNode;
                __CLR4_2_01st1stlnxz22kw.R.inc(2826);sb.append(cDataNode.getWholeText());
            }
        }}}}}
        }__CLR4_2_01st1stlnxz22kw.R.inc(2827);return StringUtil.releaseBuilder(sb);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}   

    /**
     * Gets the literal value of this element's "class" attribute, which may include multiple class names, space
     * separated. (E.g. on <code>&lt;div class="header gray"&gt;</code> returns, "<code>header gray</code>")
     * @return The literal class attribute, or <b>empty string</b> if no class attribute set.
     */
    public String className() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2828);
        __CLR4_2_01st1stlnxz22kw.R.inc(2829);return attr("class").trim();
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Get all of the element's class names. E.g. on element {@code <div class="header gray">},
     * returns a set of two elements {@code "header", "gray"}. Note that modifications to this set are not pushed to
     * the backing {@code class} attribute; use the {@link #classNames(java.util.Set)} method to persist them.
     * @return set of classnames, empty if no class attribute
     */
    public Set<String> classNames() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2830);
    	__CLR4_2_01st1stlnxz22kw.R.inc(2831);String[] names = classSplit.split(className());
    	__CLR4_2_01st1stlnxz22kw.R.inc(2832);Set<String> classNames = new LinkedHashSet<>(Arrays.asList(names));
    	__CLR4_2_01st1stlnxz22kw.R.inc(2833);classNames.remove(""); // if classNames() was empty, would include an empty class

        __CLR4_2_01st1stlnxz22kw.R.inc(2834);return classNames;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     Set the element's {@code class} attribute to the supplied class names.
     @param classNames set of classes
     @return this element, for chaining
     */
    public Element classNames(Set<String> classNames) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2835);
        __CLR4_2_01st1stlnxz22kw.R.inc(2836);Validate.notNull(classNames);
        __CLR4_2_01st1stlnxz22kw.R.inc(2837);if ((((classNames.isEmpty())&&(__CLR4_2_01st1stlnxz22kw.R.iget(2838)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2839)==0&false))) {{
            __CLR4_2_01st1stlnxz22kw.R.inc(2840);attributes().remove("class");
        } }else {{
            __CLR4_2_01st1stlnxz22kw.R.inc(2841);attributes().put("class", StringUtil.join(classNames, " "));
        }
        }__CLR4_2_01st1stlnxz22kw.R.inc(2842);return this;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Tests if this element has a class. Case insensitive.
     * @param className name of class to check for
     * @return true if it does, false if not
     */
    // performance sensitive
    public boolean hasClass(String className) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2843);
        __CLR4_2_01st1stlnxz22kw.R.inc(2844);final String classAttr = attributes().getIgnoreCase("class");
        __CLR4_2_01st1stlnxz22kw.R.inc(2845);final int len = classAttr.length();
        __CLR4_2_01st1stlnxz22kw.R.inc(2846);final int wantLen = className.length();

        __CLR4_2_01st1stlnxz22kw.R.inc(2847);if ((((len == 0 || len < wantLen)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2848)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2849)==0&false))) {{
            __CLR4_2_01st1stlnxz22kw.R.inc(2850);return false;
        }

        // if both lengths are equal, only need compare the className with the attribute
        }__CLR4_2_01st1stlnxz22kw.R.inc(2851);if ((((len == wantLen)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2852)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2853)==0&false))) {{
            __CLR4_2_01st1stlnxz22kw.R.inc(2854);return className.equalsIgnoreCase(classAttr);
        }

        // otherwise, scan for whitespace and compare regions (with no string or arraylist allocations)
        }__CLR4_2_01st1stlnxz22kw.R.inc(2855);boolean inClass = false;
        __CLR4_2_01st1stlnxz22kw.R.inc(2856);int start = 0;
        __CLR4_2_01st1stlnxz22kw.R.inc(2857);for (int i = 0; (((i < len)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2858)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2859)==0&false)); i++) {{
            __CLR4_2_01st1stlnxz22kw.R.inc(2860);if ((((Character.isWhitespace(classAttr.charAt(i)))&&(__CLR4_2_01st1stlnxz22kw.R.iget(2861)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2862)==0&false))) {{
                __CLR4_2_01st1stlnxz22kw.R.inc(2863);if ((((inClass)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2864)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2865)==0&false))) {{
                    // white space ends a class name, compare it with the requested one, ignore case
                    __CLR4_2_01st1stlnxz22kw.R.inc(2866);if ((((i - start == wantLen && classAttr.regionMatches(true, start, className, 0, wantLen))&&(__CLR4_2_01st1stlnxz22kw.R.iget(2867)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2868)==0&false))) {{
                        __CLR4_2_01st1stlnxz22kw.R.inc(2869);return true;
                    }
                    }__CLR4_2_01st1stlnxz22kw.R.inc(2870);inClass = false;
                }
            }} }else {{
                __CLR4_2_01st1stlnxz22kw.R.inc(2871);if ((((!inClass)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2872)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2873)==0&false))) {{
                    // we're in a class name : keep the start of the substring
                    __CLR4_2_01st1stlnxz22kw.R.inc(2874);inClass = true;
                    __CLR4_2_01st1stlnxz22kw.R.inc(2875);start = i;
                }
            }}
        }}

        // check the last entry
        }__CLR4_2_01st1stlnxz22kw.R.inc(2876);if ((((inClass && len - start == wantLen)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2877)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2878)==0&false))) {{
            __CLR4_2_01st1stlnxz22kw.R.inc(2879);return classAttr.regionMatches(true, start, className, 0, wantLen);
        }

        }__CLR4_2_01st1stlnxz22kw.R.inc(2880);return false;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     Add a class name to this element's {@code class} attribute.
     @param className class name to add
     @return this element
     */
    public Element addClass(String className) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2881);
        __CLR4_2_01st1stlnxz22kw.R.inc(2882);Validate.notNull(className);

        __CLR4_2_01st1stlnxz22kw.R.inc(2883);Set<String> classes = classNames();
        __CLR4_2_01st1stlnxz22kw.R.inc(2884);classes.add(className);
        __CLR4_2_01st1stlnxz22kw.R.inc(2885);classNames(classes);

        __CLR4_2_01st1stlnxz22kw.R.inc(2886);return this;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     Remove a class name from this element's {@code class} attribute.
     @param className class name to remove
     @return this element
     */
    public Element removeClass(String className) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2887);
        __CLR4_2_01st1stlnxz22kw.R.inc(2888);Validate.notNull(className);

        __CLR4_2_01st1stlnxz22kw.R.inc(2889);Set<String> classes = classNames();
        __CLR4_2_01st1stlnxz22kw.R.inc(2890);classes.remove(className);
        __CLR4_2_01st1stlnxz22kw.R.inc(2891);classNames(classes);

        __CLR4_2_01st1stlnxz22kw.R.inc(2892);return this;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     Toggle a class name on this element's {@code class} attribute: if present, remove it; otherwise add it.
     @param className class name to toggle
     @return this element
     */
    public Element toggleClass(String className) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2893);
        __CLR4_2_01st1stlnxz22kw.R.inc(2894);Validate.notNull(className);

        __CLR4_2_01st1stlnxz22kw.R.inc(2895);Set<String> classes = classNames();
        __CLR4_2_01st1stlnxz22kw.R.inc(2896);if ((((classes.contains(className))&&(__CLR4_2_01st1stlnxz22kw.R.iget(2897)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2898)==0&false)))
            {__CLR4_2_01st1stlnxz22kw.R.inc(2899);classes.remove(className);
        }else
            {__CLR4_2_01st1stlnxz22kw.R.inc(2900);classes.add(className);
        }__CLR4_2_01st1stlnxz22kw.R.inc(2901);classNames(classes);

        __CLR4_2_01st1stlnxz22kw.R.inc(2902);return this;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}
    
    /**
     * Get the value of a form element (input, textarea, etc).
     * @return the value of the form element, or empty string if not set.
     */
    public String val() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2903);
        __CLR4_2_01st1stlnxz22kw.R.inc(2904);if ((((tagName().equals("textarea"))&&(__CLR4_2_01st1stlnxz22kw.R.iget(2905)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2906)==0&false)))
            {__CLR4_2_01st1stlnxz22kw.R.inc(2907);return text();
        }else
            {__CLR4_2_01st1stlnxz22kw.R.inc(2908);return attr("value");
    }}finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}
    
    /**
     * Set the value of a form element (input, textarea, etc).
     * @param value value to set
     * @return this element (for chaining)
     */
    public Element val(String value) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2909);
        __CLR4_2_01st1stlnxz22kw.R.inc(2910);if ((((tagName().equals("textarea"))&&(__CLR4_2_01st1stlnxz22kw.R.iget(2911)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2912)==0&false)))
            {__CLR4_2_01st1stlnxz22kw.R.inc(2913);text(value);
        }else
            {__CLR4_2_01st1stlnxz22kw.R.inc(2914);attr("value", value);
        }__CLR4_2_01st1stlnxz22kw.R.inc(2915);return this;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    void outerHtmlHead(final Appendable accum, int depth, final Document.OutputSettings out) throws IOException {try{__CLR4_2_01st1stlnxz22kw.R.inc(2916);
        __CLR4_2_01st1stlnxz22kw.R.inc(2917);if ((((out.prettyPrint() && (tag.formatAsBlock() || (parent() != null && parent().tag().formatAsBlock()) || out.outline()))&&(__CLR4_2_01st1stlnxz22kw.R.iget(2918)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2919)==0&false))) {{
            __CLR4_2_01st1stlnxz22kw.R.inc(2920);if ((((accum instanceof StringBuilder)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2921)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2922)==0&false))) {{
                __CLR4_2_01st1stlnxz22kw.R.inc(2923);if ((((((StringBuilder) accum).length() > 0)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2924)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2925)==0&false)))
                    {__CLR4_2_01st1stlnxz22kw.R.inc(2926);indent(accum, depth, out);
            }} }else {{
                __CLR4_2_01st1stlnxz22kw.R.inc(2927);indent(accum, depth, out);
            }
        }}
        }__CLR4_2_01st1stlnxz22kw.R.inc(2928);accum.append('<').append(tagName());
        __CLR4_2_01st1stlnxz22kw.R.inc(2929);if ((((attributes != null)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2930)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2931)==0&false))) {__CLR4_2_01st1stlnxz22kw.R.inc(2932);attributes.html(accum, out);

        // selfclosing includes unknown tags, isEmpty defines tags that are always empty
        }__CLR4_2_01st1stlnxz22kw.R.inc(2933);if ((((childNodes.isEmpty() && tag.isSelfClosing())&&(__CLR4_2_01st1stlnxz22kw.R.iget(2934)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2935)==0&false))) {{
            __CLR4_2_01st1stlnxz22kw.R.inc(2936);if ((((out.syntax() == Document.OutputSettings.Syntax.html && tag.isEmpty())&&(__CLR4_2_01st1stlnxz22kw.R.iget(2937)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2938)==0&false)))
                {__CLR4_2_01st1stlnxz22kw.R.inc(2939);accum.append('>');
            }else
                {__CLR4_2_01st1stlnxz22kw.R.inc(2940);accum.append(" />"); // <img> in html, <img /> in xml
        }}
        }else
            {__CLR4_2_01st1stlnxz22kw.R.inc(2941);accum.append('>');
    }}finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

	void outerHtmlTail(Appendable accum, int depth, Document.OutputSettings out) throws IOException {try{__CLR4_2_01st1stlnxz22kw.R.inc(2942);
        __CLR4_2_01st1stlnxz22kw.R.inc(2943);if ((((!(childNodes.isEmpty() && tag.isSelfClosing()))&&(__CLR4_2_01st1stlnxz22kw.R.iget(2944)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2945)==0&false))) {{
            __CLR4_2_01st1stlnxz22kw.R.inc(2946);if ((((out.prettyPrint() && (!childNodes.isEmpty() && (
                    tag.formatAsBlock() || (out.outline() && (childNodes.size()>1 || (childNodes.size()==1 && !(childNodes.get(0) instanceof TextNode))))
            )))&&(__CLR4_2_01st1stlnxz22kw.R.iget(2947)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2948)==0&false)))
                {__CLR4_2_01st1stlnxz22kw.R.inc(2949);indent(accum, depth, out);
            }__CLR4_2_01st1stlnxz22kw.R.inc(2950);accum.append("</").append(tagName()).append('>');
        }
    }}finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    /**
     * Retrieves the element's inner HTML. E.g. on a {@code <div>} with one empty {@code <p>}, would return
     * {@code <p></p>}. (Whereas {@link #outerHtml()} would return {@code <div><p></p></div>}.)
     * 
     * @return String of HTML.
     * @see #outerHtml()
     */
    public String html() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2951);
        __CLR4_2_01st1stlnxz22kw.R.inc(2952);StringBuilder accum = StringUtil.borrowBuilder();
        __CLR4_2_01st1stlnxz22kw.R.inc(2953);html(accum);
        __CLR4_2_01st1stlnxz22kw.R.inc(2954);String html = StringUtil.releaseBuilder(accum);
        __CLR4_2_01st1stlnxz22kw.R.inc(2955);return (((NodeUtils.outputSettings(this).prettyPrint() )&&(__CLR4_2_01st1stlnxz22kw.R.iget(2956)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2957)==0&false))? html.trim() : html;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    @Override
    public <T extends Appendable> T html(T appendable) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2958);
        __CLR4_2_01st1stlnxz22kw.R.inc(2959);final int size = childNodes.size();
        __CLR4_2_01st1stlnxz22kw.R.inc(2960);for (int i = 0; (((i < size)&&(__CLR4_2_01st1stlnxz22kw.R.iget(2961)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2962)==0&false)); i++)
            {__CLR4_2_01st1stlnxz22kw.R.inc(2963);childNodes.get(i).outerHtml(appendable);

        }__CLR4_2_01st1stlnxz22kw.R.inc(2964);return appendable;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}
    
    /**
     * Set this element's inner HTML. Clears the existing HTML first.
     * @param html HTML to parse and set into this element
     * @return this element
     * @see #append(String)
     */
    public Element html(String html) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2965);
        __CLR4_2_01st1stlnxz22kw.R.inc(2966);empty();
        __CLR4_2_01st1stlnxz22kw.R.inc(2967);append(html);
        __CLR4_2_01st1stlnxz22kw.R.inc(2968);return this;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    @Override
    public Element clone() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2969);
        __CLR4_2_01st1stlnxz22kw.R.inc(2970);return (Element) super.clone();
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    @Override
    public Element shallowClone() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2971);
        // simpler than implementing a clone version with no child copy
        __CLR4_2_01st1stlnxz22kw.R.inc(2972);return new Element(tag, baseUri, (((attributes == null )&&(__CLR4_2_01st1stlnxz22kw.R.iget(2973)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2974)==0&false))? null : attributes.clone());
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    @Override
    protected Element doClone(Node parent) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2975);
        __CLR4_2_01st1stlnxz22kw.R.inc(2976);Element clone = (Element) super.doClone(parent);
        __CLR4_2_01st1stlnxz22kw.R.inc(2977);clone.attributes = (((attributes != null )&&(__CLR4_2_01st1stlnxz22kw.R.iget(2978)!=0|true))||(__CLR4_2_01st1stlnxz22kw.R.iget(2979)==0&false))? attributes.clone() : null;
        __CLR4_2_01st1stlnxz22kw.R.inc(2980);clone.baseUri = baseUri;
        __CLR4_2_01st1stlnxz22kw.R.inc(2981);clone.childNodes = new NodeList(clone, childNodes.size());
        __CLR4_2_01st1stlnxz22kw.R.inc(2982);clone.childNodes.addAll(childNodes); // the children then get iterated and cloned in Node.clone

        __CLR4_2_01st1stlnxz22kw.R.inc(2983);return clone;
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    // overrides of Node for call chaining
    @Override
    public Element clearAttributes() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2984);
        __CLR4_2_01st1stlnxz22kw.R.inc(2985);return (Element) super.clearAttributes();
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    @Override
    public Element removeAttr(String attributeKey) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2986);
        __CLR4_2_01st1stlnxz22kw.R.inc(2987);return (Element) super.removeAttr(attributeKey);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    @Override
    public Element root() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2988);
        __CLR4_2_01st1stlnxz22kw.R.inc(2989);return (Element) super.root(); // probably a document, but always at least an element
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    @Override
    public Element traverse(NodeVisitor nodeVisitor) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2990);
        __CLR4_2_01st1stlnxz22kw.R.inc(2991);return  (Element) super.traverse(nodeVisitor);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    @Override
    public Element filter(NodeFilter nodeFilter) {try{__CLR4_2_01st1stlnxz22kw.R.inc(2992);
        __CLR4_2_01st1stlnxz22kw.R.inc(2993);return  (Element) super.filter(nodeFilter);
    }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

    private static final class NodeList extends ChangeNotifyingArrayList<Node> {
        private final Element owner;

        NodeList(Element owner, int initialCapacity) {
            super(initialCapacity);__CLR4_2_01st1stlnxz22kw.R.inc(2995);try{__CLR4_2_01st1stlnxz22kw.R.inc(2994);
            __CLR4_2_01st1stlnxz22kw.R.inc(2996);this.owner = owner;
        }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}

        public void onContentsChanged() {try{__CLR4_2_01st1stlnxz22kw.R.inc(2997);
            __CLR4_2_01st1stlnxz22kw.R.inc(2998);owner.nodelistChanged();
        }finally{__CLR4_2_01st1stlnxz22kw.R.flushNeeded();}}
    }
}
