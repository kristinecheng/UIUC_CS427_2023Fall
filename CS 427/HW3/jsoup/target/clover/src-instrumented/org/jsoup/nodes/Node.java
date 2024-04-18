/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.nodes;

import org.jsoup.SerializationException;
import org.jsoup.internal.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.select.NodeFilter;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

import java.io.IOException;
import java.util.*;

/**
 The base, abstract Node model. Elements, Documents, Comments etc are all Node instances.

 @author Jonathan Hedley, jonathan@hedley.net */
public abstract class Node implements Cloneable {public static class __CLR4_2_02kh2khlnxz22m1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,3651,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static final String EmptyString = "";
    Node parentNode;
    int siblingIndex;

    /**
     * Default constructor. Doesn't setup base uri, children, or attributes; use with caution.
     */
    protected Node() {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3329);
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    /**
     Get the node name of this node. Use for debugging purposes and not logic switching (for that, use instanceof).
     @return node name
     */
    public abstract String nodeName();

    /**
     * Check if this Node has an actual Attributes object.
     */
    protected abstract boolean hasAttributes();

    public boolean hasParent() {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3330);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3331);return parentNode != null;
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    /**
     * Get an attribute's value by its key. <b>Case insensitive</b>
     * <p>
     * To get an absolute URL from an attribute that may be a relative URL, prefix the key with <code><b>abs</b></code>,
     * which is a shortcut to the {@link #absUrl} method.
     * </p>
     * E.g.:
     * <blockquote><code>String url = a.attr("abs:href");</code></blockquote>
     *
     * @param attributeKey The attribute key.
     * @return The attribute, or empty string if not present (to avoid nulls).
     * @see #attributes()
     * @see #hasAttr(String)
     * @see #absUrl(String)
     */
    public String attr(String attributeKey) {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3332);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3333);Validate.notNull(attributeKey);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3334);if ((((!hasAttributes())&&(__CLR4_2_02kh2khlnxz22m1.R.iget(3335)!=0|true))||(__CLR4_2_02kh2khlnxz22m1.R.iget(3336)==0&false)))
            {__CLR4_2_02kh2khlnxz22m1.R.inc(3337);return EmptyString;

        }__CLR4_2_02kh2khlnxz22m1.R.inc(3338);String val = attributes().getIgnoreCase(attributeKey);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3339);if ((((val.length() > 0)&&(__CLR4_2_02kh2khlnxz22m1.R.iget(3340)!=0|true))||(__CLR4_2_02kh2khlnxz22m1.R.iget(3341)==0&false)))
            {__CLR4_2_02kh2khlnxz22m1.R.inc(3342);return val;
        }else {__CLR4_2_02kh2khlnxz22m1.R.inc(3343);if ((((attributeKey.startsWith("abs:"))&&(__CLR4_2_02kh2khlnxz22m1.R.iget(3344)!=0|true))||(__CLR4_2_02kh2khlnxz22m1.R.iget(3345)==0&false)))
            {__CLR4_2_02kh2khlnxz22m1.R.inc(3346);return absUrl(attributeKey.substring("abs:".length()));
        }else {__CLR4_2_02kh2khlnxz22m1.R.inc(3347);return "";
    }}}finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    /**
     * Get all of the element's attributes.
     * @return attributes (which implements iterable, in same order as presented in original HTML).
     */
    public abstract Attributes attributes();

    /**
     * Set an attribute (key=value). If the attribute already exists, it is replaced. The attribute key comparison is
     * <b>case insensitive</b>. The key will be set with case sensitivity as set in the parser settings.
     * @param attributeKey The attribute key.
     * @param attributeValue The attribute value.
     * @return this (for chaining)
     */
    public Node attr(String attributeKey, String attributeValue) {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3348);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3349);attributeKey = NodeUtils.parser(this).settings().normalizeAttribute(attributeKey);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3350);attributes().putIgnoreCase(attributeKey, attributeValue);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3351);return this;
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    /**
     * Test if this element has an attribute. <b>Case insensitive</b>
     * @param attributeKey The attribute key to check.
     * @return true if the attribute exists, false if not.
     */
    public boolean hasAttr(String attributeKey) {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3352);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3353);Validate.notNull(attributeKey);

        __CLR4_2_02kh2khlnxz22m1.R.inc(3354);if ((((attributeKey.startsWith("abs:"))&&(__CLR4_2_02kh2khlnxz22m1.R.iget(3355)!=0|true))||(__CLR4_2_02kh2khlnxz22m1.R.iget(3356)==0&false))) {{
            __CLR4_2_02kh2khlnxz22m1.R.inc(3357);String key = attributeKey.substring("abs:".length());
            __CLR4_2_02kh2khlnxz22m1.R.inc(3358);if ((((attributes().hasKeyIgnoreCase(key) && !absUrl(key).equals(""))&&(__CLR4_2_02kh2khlnxz22m1.R.iget(3359)!=0|true))||(__CLR4_2_02kh2khlnxz22m1.R.iget(3360)==0&false)))
                {__CLR4_2_02kh2khlnxz22m1.R.inc(3361);return true;
        }}
        }__CLR4_2_02kh2khlnxz22m1.R.inc(3362);return attributes().hasKeyIgnoreCase(attributeKey);
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    /**
     * Remove an attribute from this node.
     * @param attributeKey The attribute to remove.
     * @return this (for chaining)
     */
    public Node removeAttr(String attributeKey) {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3363);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3364);Validate.notNull(attributeKey);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3365);attributes().removeIgnoreCase(attributeKey);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3366);return this;
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    /**
     * Clear (remove) all of the attributes in this node.
     * @return this, for chaining
     */
    public Node clearAttributes() {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3367);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3368);Iterator<Attribute> it = attributes().iterator();
        __CLR4_2_02kh2khlnxz22m1.R.inc(3369);while ((((it.hasNext())&&(__CLR4_2_02kh2khlnxz22m1.R.iget(3370)!=0|true))||(__CLR4_2_02kh2khlnxz22m1.R.iget(3371)==0&false))) {{
            __CLR4_2_02kh2khlnxz22m1.R.inc(3372);it.next();
            __CLR4_2_02kh2khlnxz22m1.R.inc(3373);it.remove();
        }
        }__CLR4_2_02kh2khlnxz22m1.R.inc(3374);return this;
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    /**
     Get the base URI of this node.
     @return base URI
     */
    public abstract String baseUri();

    /**
     * Set the baseUri for just this node (not its descendants), if this Node tracks base URIs.
     * @param baseUri new URI
     */
    protected abstract void doSetBaseUri(String baseUri);

    /**
     Update the base URI of this node and all of its descendants.
     @param baseUri base URI to set
     */
    public void setBaseUri(final String baseUri) {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3375);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3376);Validate.notNull(baseUri);

        __CLR4_2_02kh2khlnxz22m1.R.inc(3377);traverse(new NodeVisitor() {
            public void head(Node node, int depth) {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3378);
                __CLR4_2_02kh2khlnxz22m1.R.inc(3379);node.doSetBaseUri(baseUri);
            }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

            public void tail(Node node, int depth) {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3380);
            }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}
        });
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    /**
     * Get an absolute URL from a URL attribute that may be relative (i.e. an <code>&lt;a href&gt;</code> or
     * <code>&lt;img src&gt;</code>).
     * <p>
     * E.g.: <code>String absUrl = linkEl.absUrl("href");</code>
     * </p>
     * <p>
     * If the attribute value is already absolute (i.e. it starts with a protocol, like
     * <code>http://</code> or <code>https://</code> etc), and it successfully parses as a URL, the attribute is
     * returned directly. Otherwise, it is treated as a URL relative to the element's {@link #baseUri}, and made
     * absolute using that.
     * </p>
     * <p>
     * As an alternate, you can use the {@link #attr} method with the <code>abs:</code> prefix, e.g.:
     * <code>String absUrl = linkEl.attr("abs:href");</code>
     * </p>
     *
     * @param attributeKey The attribute key
     * @return An absolute URL if one could be made, or an empty string (not null) if the attribute was missing or
     * could not be made successfully into a URL.
     * @see #attr
     * @see java.net.URL#URL(java.net.URL, String)
     */
    public String absUrl(String attributeKey) {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3381);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3382);Validate.notEmpty(attributeKey);

        __CLR4_2_02kh2khlnxz22m1.R.inc(3383);if ((((!hasAttr(attributeKey))&&(__CLR4_2_02kh2khlnxz22m1.R.iget(3384)!=0|true))||(__CLR4_2_02kh2khlnxz22m1.R.iget(3385)==0&false))) {{
            __CLR4_2_02kh2khlnxz22m1.R.inc(3386);return ""; // nothing to make absolute with
        } }else {{
            __CLR4_2_02kh2khlnxz22m1.R.inc(3387);return StringUtil.resolve(baseUri(), attr(attributeKey));
        }
    }}finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    protected abstract List<Node> ensureChildNodes();

    /**
     Get a child node by its 0-based index.
     @param index index of child node
     @return the child node at this index. Throws a {@code IndexOutOfBoundsException} if the index is out of bounds.
     */
    public Node childNode(int index) {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3388);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3389);return ensureChildNodes().get(index);
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    /**
     Get this node's children. Presented as an unmodifiable list: new children can not be added, but the child nodes
     themselves can be manipulated.
     @return list of children. If no children, returns an empty list.
     */
    public List<Node> childNodes() {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3390);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3391);return Collections.unmodifiableList(ensureChildNodes());
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    /**
     * Returns a deep copy of this node's children. Changes made to these nodes will not be reflected in the original
     * nodes
     * @return a deep copy of this node's children
     */
    public List<Node> childNodesCopy() {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3392);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3393);final List<Node> nodes = ensureChildNodes();
        __CLR4_2_02kh2khlnxz22m1.R.inc(3394);final ArrayList<Node> children = new ArrayList<>(nodes.size());
        __CLR4_2_02kh2khlnxz22m1.R.inc(3395);for (Node node : nodes) {{
            __CLR4_2_02kh2khlnxz22m1.R.inc(3396);children.add(node.clone());
        }
        }__CLR4_2_02kh2khlnxz22m1.R.inc(3397);return children;
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    /**
     * Get the number of child nodes that this node holds.
     * @return the number of child nodes that this node holds.
     */
    public abstract int childNodeSize();

    protected Node[] childNodesAsArray() {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3398);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3399);return ensureChildNodes().toArray(new Node[0]);
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    /**
     Gets this node's parent node.
     @return parent node; or null if no parent.
     */
    public Node parent() {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3400);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3401);return parentNode;
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    /**
     Gets this node's parent node. Not overridable by extending classes, so useful if you really just need the Node type.
     @return parent node; or null if no parent.
     */
    public final Node parentNode() {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3402);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3403);return parentNode;
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    /**
     * Get this node's root node; that is, its topmost ancestor. If this node is the top ancestor, returns {@code this}.
     * @return topmost ancestor.
     */
    public Node root() {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3404);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3405);Node node = this;
        __CLR4_2_02kh2khlnxz22m1.R.inc(3406);while ((((node.parentNode != null)&&(__CLR4_2_02kh2khlnxz22m1.R.iget(3407)!=0|true))||(__CLR4_2_02kh2khlnxz22m1.R.iget(3408)==0&false)))
            {__CLR4_2_02kh2khlnxz22m1.R.inc(3409);node = node.parentNode;
        }__CLR4_2_02kh2khlnxz22m1.R.inc(3410);return node;
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    /**
     * Gets the Document associated with this Node.
     * @return the Document associated with this Node, or null if there is no such Document.
     */
    public Document ownerDocument() {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3411);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3412);Node root = root();
        __CLR4_2_02kh2khlnxz22m1.R.inc(3413);return ((((root instanceof Document) )&&(__CLR4_2_02kh2khlnxz22m1.R.iget(3414)!=0|true))||(__CLR4_2_02kh2khlnxz22m1.R.iget(3415)==0&false))? (Document) root : null;
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    /**
     * Remove (delete) this node from the DOM tree. If this node has children, they are also removed.
     */
    public void remove() {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3416);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3417);Validate.notNull(parentNode);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3418);parentNode.removeChild(this);
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    /**
     * Insert the specified HTML into the DOM before this node (i.e. as a preceding sibling).
     * @param html HTML to add before this node
     * @return this node, for chaining
     * @see #after(String)
     */
    public Node before(String html) {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3419);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3420);addSiblingHtml(siblingIndex, html);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3421);return this;
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    /**
     * Insert the specified node into the DOM before this node (i.e. as a preceding sibling).
     * @param node to add before this node
     * @return this node, for chaining
     * @see #after(Node)
     */
    public Node before(Node node) {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3422);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3423);Validate.notNull(node);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3424);Validate.notNull(parentNode);

        __CLR4_2_02kh2khlnxz22m1.R.inc(3425);parentNode.addChildren(siblingIndex, node);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3426);return this;
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    /**
     * Insert the specified HTML into the DOM after this node (i.e. as a following sibling).
     * @param html HTML to add after this node
     * @return this node, for chaining
     * @see #before(String)
     */
    public Node after(String html) {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3427);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3428);addSiblingHtml(siblingIndex + 1, html);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3429);return this;
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    /**
     * Insert the specified node into the DOM after this node (i.e. as a following sibling).
     * @param node to add after this node
     * @return this node, for chaining
     * @see #before(Node)
     */
    public Node after(Node node) {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3430);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3431);Validate.notNull(node);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3432);Validate.notNull(parentNode);

        __CLR4_2_02kh2khlnxz22m1.R.inc(3433);parentNode.addChildren(siblingIndex + 1, node);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3434);return this;
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    private void addSiblingHtml(int index, String html) {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3435);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3436);Validate.notNull(html);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3437);Validate.notNull(parentNode);

        __CLR4_2_02kh2khlnxz22m1.R.inc(3438);Element context = (((parent() instanceof Element )&&(__CLR4_2_02kh2khlnxz22m1.R.iget(3439)!=0|true))||(__CLR4_2_02kh2khlnxz22m1.R.iget(3440)==0&false))? (Element) parent() : null;
        __CLR4_2_02kh2khlnxz22m1.R.inc(3441);List<Node> nodes = NodeUtils.parser(this).parseFragmentInput(html, context, baseUri());
        __CLR4_2_02kh2khlnxz22m1.R.inc(3442);parentNode.addChildren(index, nodes.toArray(new Node[0]));
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    /**
     Wrap the supplied HTML around this node.
     @param html HTML to wrap around this element, e.g. {@code <div class="head"></div>}. Can be arbitrarily deep.
     @return this node, for chaining.
     */
    public Node wrap(String html) {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3443);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3444);Validate.notEmpty(html);

        __CLR4_2_02kh2khlnxz22m1.R.inc(3445);Element context = (((parent() instanceof Element )&&(__CLR4_2_02kh2khlnxz22m1.R.iget(3446)!=0|true))||(__CLR4_2_02kh2khlnxz22m1.R.iget(3447)==0&false))? (Element) parent() : null;
        __CLR4_2_02kh2khlnxz22m1.R.inc(3448);List<Node> wrapChildren = NodeUtils.parser(this).parseFragmentInput(html, context, baseUri());
        __CLR4_2_02kh2khlnxz22m1.R.inc(3449);Node wrapNode = wrapChildren.get(0);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3450);if ((((!(wrapNode instanceof Element))&&(__CLR4_2_02kh2khlnxz22m1.R.iget(3451)!=0|true))||(__CLR4_2_02kh2khlnxz22m1.R.iget(3452)==0&false))) // nothing to wrap with; noop
            {__CLR4_2_02kh2khlnxz22m1.R.inc(3453);return null;

        }__CLR4_2_02kh2khlnxz22m1.R.inc(3454);Element wrap = (Element) wrapNode;
        __CLR4_2_02kh2khlnxz22m1.R.inc(3455);Element deepest = getDeepChild(wrap);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3456);parentNode.replaceChild(this, wrap);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3457);deepest.addChildren(this);

        // remainder (unbalanced wrap, like <div></div><p></p> -- The <p> is remainder
        __CLR4_2_02kh2khlnxz22m1.R.inc(3458);if ((((wrapChildren.size() > 0)&&(__CLR4_2_02kh2khlnxz22m1.R.iget(3459)!=0|true))||(__CLR4_2_02kh2khlnxz22m1.R.iget(3460)==0&false))) {{
            //noinspection ForLoopReplaceableByForEach (beacause it allocates an Iterator which is wasteful here)
            __CLR4_2_02kh2khlnxz22m1.R.inc(3461);for (int i = 0; (((i < wrapChildren.size())&&(__CLR4_2_02kh2khlnxz22m1.R.iget(3462)!=0|true))||(__CLR4_2_02kh2khlnxz22m1.R.iget(3463)==0&false)); i++) {{
                __CLR4_2_02kh2khlnxz22m1.R.inc(3464);Node remainder = wrapChildren.get(i);
                __CLR4_2_02kh2khlnxz22m1.R.inc(3465);remainder.parentNode.removeChild(remainder);
                __CLR4_2_02kh2khlnxz22m1.R.inc(3466);wrap.appendChild(remainder);
            }
        }}
        }__CLR4_2_02kh2khlnxz22m1.R.inc(3467);return this;
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    /**
     * Removes this node from the DOM, and moves its children up into the node's parent. This has the effect of dropping
     * the node but keeping its children.
     * <p>
     * For example, with the input html:
     * </p>
     * <p>{@code <div>One <span>Two <b>Three</b></span></div>}</p>
     * Calling {@code element.unwrap()} on the {@code span} element will result in the html:
     * <p>{@code <div>One Two <b>Three</b></div>}</p>
     * and the {@code "Two "} {@link TextNode} being returned.
     *
     * @return the first child of this node, after the node has been unwrapped. Null if the node had no children.
     * @see #remove()
     * @see #wrap(String)
     */
    public Node unwrap() {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3468);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3469);Validate.notNull(parentNode);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3470);final List<Node> childNodes = ensureChildNodes();
        __CLR4_2_02kh2khlnxz22m1.R.inc(3471);Node firstChild = (((childNodes.size() > 0 )&&(__CLR4_2_02kh2khlnxz22m1.R.iget(3472)!=0|true))||(__CLR4_2_02kh2khlnxz22m1.R.iget(3473)==0&false))? childNodes.get(0) : null;
        __CLR4_2_02kh2khlnxz22m1.R.inc(3474);parentNode.addChildren(siblingIndex, this.childNodesAsArray());
        __CLR4_2_02kh2khlnxz22m1.R.inc(3475);this.remove();

        __CLR4_2_02kh2khlnxz22m1.R.inc(3476);return firstChild;
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    private Element getDeepChild(Element el) {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3477);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3478);List<Element> children = el.children();
        __CLR4_2_02kh2khlnxz22m1.R.inc(3479);if ((((children.size() > 0)&&(__CLR4_2_02kh2khlnxz22m1.R.iget(3480)!=0|true))||(__CLR4_2_02kh2khlnxz22m1.R.iget(3481)==0&false)))
            {__CLR4_2_02kh2khlnxz22m1.R.inc(3482);return getDeepChild(children.get(0));
        }else
            {__CLR4_2_02kh2khlnxz22m1.R.inc(3483);return el;
    }}finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    void nodelistChanged() {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3484);
        // Element overrides this to clear its shadow children elements
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    /**
     * Replace this node in the DOM with the supplied node.
     * @param in the node that will will replace the existing node.
     */
    public void replaceWith(Node in) {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3485);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3486);Validate.notNull(in);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3487);Validate.notNull(parentNode);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3488);parentNode.replaceChild(this, in);
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    protected void setParentNode(Node parentNode) {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3489);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3490);Validate.notNull(parentNode);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3491);if ((((this.parentNode != null)&&(__CLR4_2_02kh2khlnxz22m1.R.iget(3492)!=0|true))||(__CLR4_2_02kh2khlnxz22m1.R.iget(3493)==0&false)))
            {__CLR4_2_02kh2khlnxz22m1.R.inc(3494);this.parentNode.removeChild(this);
        }__CLR4_2_02kh2khlnxz22m1.R.inc(3495);this.parentNode = parentNode;
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    protected void replaceChild(Node out, Node in) {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3496);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3497);Validate.isTrue(out.parentNode == this);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3498);Validate.notNull(in);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3499);if ((((in.parentNode != null)&&(__CLR4_2_02kh2khlnxz22m1.R.iget(3500)!=0|true))||(__CLR4_2_02kh2khlnxz22m1.R.iget(3501)==0&false)))
            {__CLR4_2_02kh2khlnxz22m1.R.inc(3502);in.parentNode.removeChild(in);

        }__CLR4_2_02kh2khlnxz22m1.R.inc(3503);final int index = out.siblingIndex;
        __CLR4_2_02kh2khlnxz22m1.R.inc(3504);ensureChildNodes().set(index, in);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3505);in.parentNode = this;
        __CLR4_2_02kh2khlnxz22m1.R.inc(3506);in.setSiblingIndex(index);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3507);out.parentNode = null;
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    protected void removeChild(Node out) {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3508);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3509);Validate.isTrue(out.parentNode == this);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3510);final int index = out.siblingIndex;
        __CLR4_2_02kh2khlnxz22m1.R.inc(3511);ensureChildNodes().remove(index);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3512);reindexChildren(index);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3513);out.parentNode = null;
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    protected void addChildren(Node... children) {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3514);
        //most used. short circuit addChildren(int), which hits reindex children and array copy
        __CLR4_2_02kh2khlnxz22m1.R.inc(3515);final List<Node> nodes = ensureChildNodes();

        __CLR4_2_02kh2khlnxz22m1.R.inc(3516);for (Node child: children) {{
            __CLR4_2_02kh2khlnxz22m1.R.inc(3517);reparentChild(child);
            __CLR4_2_02kh2khlnxz22m1.R.inc(3518);nodes.add(child);
            __CLR4_2_02kh2khlnxz22m1.R.inc(3519);child.setSiblingIndex(nodes.size()-1);
        }
    }}finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    protected void addChildren(int index, Node... children) {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3520);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3521);Validate.noNullElements(children);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3522);final List<Node> nodes = ensureChildNodes();

        __CLR4_2_02kh2khlnxz22m1.R.inc(3523);for (Node child : children) {{
            __CLR4_2_02kh2khlnxz22m1.R.inc(3524);reparentChild(child);
        }
        }__CLR4_2_02kh2khlnxz22m1.R.inc(3525);nodes.addAll(index, Arrays.asList(children));
        __CLR4_2_02kh2khlnxz22m1.R.inc(3526);reindexChildren(index);
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}
    
    protected void reparentChild(Node child) {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3527);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3528);child.setParentNode(this);
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    private void reindexChildren(int start) {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3529);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3530);final List<Node> childNodes = ensureChildNodes();

        __CLR4_2_02kh2khlnxz22m1.R.inc(3531);for (int i = start; (((i < childNodes.size())&&(__CLR4_2_02kh2khlnxz22m1.R.iget(3532)!=0|true))||(__CLR4_2_02kh2khlnxz22m1.R.iget(3533)==0&false)); i++) {{
            __CLR4_2_02kh2khlnxz22m1.R.inc(3534);childNodes.get(i).setSiblingIndex(i);
        }
    }}finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    /**
     Retrieves this node's sibling nodes. Similar to {@link #childNodes()  node.parent.childNodes()}, but does not
     include this node (a node is not a sibling of itself).
     @return node siblings. If the node has no parent, returns an empty list.
     */
    public List<Node> siblingNodes() {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3535);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3536);if ((((parentNode == null)&&(__CLR4_2_02kh2khlnxz22m1.R.iget(3537)!=0|true))||(__CLR4_2_02kh2khlnxz22m1.R.iget(3538)==0&false)))
            {__CLR4_2_02kh2khlnxz22m1.R.inc(3539);return Collections.emptyList();

        }__CLR4_2_02kh2khlnxz22m1.R.inc(3540);List<Node> nodes = parentNode.ensureChildNodes();
        __CLR4_2_02kh2khlnxz22m1.R.inc(3541);List<Node> siblings = new ArrayList<>(nodes.size() - 1);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3542);for (Node node: nodes)
            {__CLR4_2_02kh2khlnxz22m1.R.inc(3543);if ((((node != this)&&(__CLR4_2_02kh2khlnxz22m1.R.iget(3544)!=0|true))||(__CLR4_2_02kh2khlnxz22m1.R.iget(3545)==0&false)))
                {__CLR4_2_02kh2khlnxz22m1.R.inc(3546);siblings.add(node);
        }}__CLR4_2_02kh2khlnxz22m1.R.inc(3547);return siblings;
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    /**
     Get this node's next sibling.
     @return next sibling, or null if this is the last sibling
     */
    public Node nextSibling() {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3548);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3549);if ((((parentNode == null)&&(__CLR4_2_02kh2khlnxz22m1.R.iget(3550)!=0|true))||(__CLR4_2_02kh2khlnxz22m1.R.iget(3551)==0&false)))
            {__CLR4_2_02kh2khlnxz22m1.R.inc(3552);return null; // root

        }__CLR4_2_02kh2khlnxz22m1.R.inc(3553);final List<Node> siblings = parentNode.ensureChildNodes();
        __CLR4_2_02kh2khlnxz22m1.R.inc(3554);final int index = siblingIndex+1;
        __CLR4_2_02kh2khlnxz22m1.R.inc(3555);if ((((siblings.size() > index)&&(__CLR4_2_02kh2khlnxz22m1.R.iget(3556)!=0|true))||(__CLR4_2_02kh2khlnxz22m1.R.iget(3557)==0&false)))
            {__CLR4_2_02kh2khlnxz22m1.R.inc(3558);return siblings.get(index);
        }else
            {__CLR4_2_02kh2khlnxz22m1.R.inc(3559);return null;
    }}finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    /**
     Get this node's previous sibling.
     @return the previous sibling, or null if this is the first sibling
     */
    public Node previousSibling() {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3560);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3561);if ((((parentNode == null)&&(__CLR4_2_02kh2khlnxz22m1.R.iget(3562)!=0|true))||(__CLR4_2_02kh2khlnxz22m1.R.iget(3563)==0&false)))
            {__CLR4_2_02kh2khlnxz22m1.R.inc(3564);return null; // root

        }__CLR4_2_02kh2khlnxz22m1.R.inc(3565);if ((((siblingIndex > 0)&&(__CLR4_2_02kh2khlnxz22m1.R.iget(3566)!=0|true))||(__CLR4_2_02kh2khlnxz22m1.R.iget(3567)==0&false)))
            {__CLR4_2_02kh2khlnxz22m1.R.inc(3568);return parentNode.ensureChildNodes().get(siblingIndex-1);
        }else
            {__CLR4_2_02kh2khlnxz22m1.R.inc(3569);return null;
    }}finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    /**
     * Get the list index of this node in its node sibling list. I.e. if this is the first node
     * sibling, returns 0.
     * @return position in node sibling list
     * @see org.jsoup.nodes.Element#elementSiblingIndex()
     */
    public int siblingIndex() {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3570);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3571);return siblingIndex;
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    protected void setSiblingIndex(int siblingIndex) {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3572);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3573);this.siblingIndex = siblingIndex;
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    /**
     * Perform a depth-first traversal through this node and its descendants.
     * @param nodeVisitor the visitor callbacks to perform on each node
     * @return this node, for chaining
     */
    public Node traverse(NodeVisitor nodeVisitor) {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3574);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3575);Validate.notNull(nodeVisitor);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3576);NodeTraversor.traverse(nodeVisitor, this);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3577);return this;
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    /**
     * Perform a depth-first filtering through this node and its descendants.
     * @param nodeFilter the filter callbacks to perform on each node
     * @return this node, for chaining
     */
    public Node filter(NodeFilter nodeFilter) {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3578);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3579);Validate.notNull(nodeFilter);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3580);NodeTraversor.filter(nodeFilter, this);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3581);return this;
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    /**
     Get the outer HTML of this node. For example, on a {@code p} element, may return {@code <p>Para</p>}.
     @return outer HTML
     @see Element#html()
     @see Element#text()
     */
    public String outerHtml() {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3582);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3583);StringBuilder accum = StringUtil.borrowBuilder();
        __CLR4_2_02kh2khlnxz22m1.R.inc(3584);outerHtml(accum);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3585);return StringUtil.releaseBuilder(accum);
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    protected void outerHtml(Appendable accum) {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3586);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3587);NodeTraversor.traverse(new OuterHtmlVisitor(accum, NodeUtils.outputSettings(this)), this);
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    /**
     Get the outer HTML of this node.
     @param accum accumulator to place HTML into
     @throws IOException if appending to the given accumulator fails.
     */
    abstract void outerHtmlHead(final Appendable accum, int depth, final Document.OutputSettings out) throws IOException;

    abstract void outerHtmlTail(final Appendable accum, int depth, final Document.OutputSettings out) throws IOException;

    /**
     * Write this node and its children to the given {@link Appendable}.
     *
     * @param appendable the {@link Appendable} to write to.
     * @return the supplied {@link Appendable}, for chaining.
     */
    public <T extends Appendable> T html(T appendable) {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3588);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3589);outerHtml(appendable);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3590);return appendable;
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    /**
     * Gets this node's outer HTML.
     * @return outer HTML.
     * @see #outerHtml()
     */
	public String toString() {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3591);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3592);return outerHtml();
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    protected void indent(Appendable accum, int depth, Document.OutputSettings out) throws IOException {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3593);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3594);accum.append('\n').append(StringUtil.padding(depth * out.indentAmount()));
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    /**
     * Check if this node is the same instance of another (object identity test).
     * @param o other object to compare to
     * @return true if the content of this node is the same as the other
     * @see Node#hasSameValue(Object) to compare nodes by their value
     */
    @Override
    public boolean equals(Object o) {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3595);
        // implemented just so that javadoc is clear this is an identity test
        __CLR4_2_02kh2khlnxz22m1.R.inc(3596);return this == o;
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    /**
     * Check if this node is has the same content as another node. A node is considered the same if its name, attributes and content match the
     * other node; particularly its position in the tree does not influence its similarity.
     * @param o other object to compare to
     * @return true if the content of this node is the same as the other
     */
    public boolean hasSameValue(Object o) {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3597);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3598);if ((((this == o)&&(__CLR4_2_02kh2khlnxz22m1.R.iget(3599)!=0|true))||(__CLR4_2_02kh2khlnxz22m1.R.iget(3600)==0&false))) {__CLR4_2_02kh2khlnxz22m1.R.inc(3601);return true;
        }__CLR4_2_02kh2khlnxz22m1.R.inc(3602);if ((((o == null || getClass() != o.getClass())&&(__CLR4_2_02kh2khlnxz22m1.R.iget(3603)!=0|true))||(__CLR4_2_02kh2khlnxz22m1.R.iget(3604)==0&false))) {__CLR4_2_02kh2khlnxz22m1.R.inc(3605);return false;

        }__CLR4_2_02kh2khlnxz22m1.R.inc(3606);return this.outerHtml().equals(((Node) o).outerHtml());
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    /**
     * Create a stand-alone, deep copy of this node, and all of its children. The cloned node will have no siblings or
     * parent node. As a stand-alone object, any changes made to the clone or any of its children will not impact the
     * original node.
     * <p>
     * The cloned node may be adopted into another Document or node structure using {@link Element#appendChild(Node)}.
     * @return a stand-alone cloned node, including clones of any children
     * @see #shallowClone()
     */
    @Override
    public Node clone() {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3607);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3608);Node thisClone = doClone(null); // splits for orphan

        // Queue up nodes that need their children cloned (BFS).
        __CLR4_2_02kh2khlnxz22m1.R.inc(3609);final LinkedList<Node> nodesToProcess = new LinkedList<>();
        __CLR4_2_02kh2khlnxz22m1.R.inc(3610);nodesToProcess.add(thisClone);

        __CLR4_2_02kh2khlnxz22m1.R.inc(3611);while ((((!nodesToProcess.isEmpty())&&(__CLR4_2_02kh2khlnxz22m1.R.iget(3612)!=0|true))||(__CLR4_2_02kh2khlnxz22m1.R.iget(3613)==0&false))) {{
            __CLR4_2_02kh2khlnxz22m1.R.inc(3614);Node currParent = nodesToProcess.remove();

            __CLR4_2_02kh2khlnxz22m1.R.inc(3615);final int size = currParent.childNodeSize();
            __CLR4_2_02kh2khlnxz22m1.R.inc(3616);for (int i = 0; (((i < size)&&(__CLR4_2_02kh2khlnxz22m1.R.iget(3617)!=0|true))||(__CLR4_2_02kh2khlnxz22m1.R.iget(3618)==0&false)); i++) {{
                __CLR4_2_02kh2khlnxz22m1.R.inc(3619);final List<Node> childNodes = currParent.ensureChildNodes();
                __CLR4_2_02kh2khlnxz22m1.R.inc(3620);Node childClone = childNodes.get(i).doClone(currParent);
                __CLR4_2_02kh2khlnxz22m1.R.inc(3621);childNodes.set(i, childClone);
                __CLR4_2_02kh2khlnxz22m1.R.inc(3622);nodesToProcess.add(childClone);
            }
        }}

        }__CLR4_2_02kh2khlnxz22m1.R.inc(3623);return thisClone;
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    /**
     * Create a stand-alone, shallow copy of this node. None of its children (if any) will be cloned, and it will have
     * no parent or sibling nodes.
     * @return a single independent copy of this node
     * @see #clone()
     */
    public Node shallowClone() {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3624);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3625);return doClone(null);
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    /*
     * Return a clone of the node using the given parent (which can be null).
     * Not a deep copy of children.
     */
    protected Node doClone(Node parent) {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3626);
        __CLR4_2_02kh2khlnxz22m1.R.inc(3627);Node clone;

        __CLR4_2_02kh2khlnxz22m1.R.inc(3628);try {
            __CLR4_2_02kh2khlnxz22m1.R.inc(3629);clone = (Node) super.clone();
        } catch (CloneNotSupportedException e) {
            __CLR4_2_02kh2khlnxz22m1.R.inc(3630);throw new RuntimeException(e);
        }

        __CLR4_2_02kh2khlnxz22m1.R.inc(3631);clone.parentNode = parent; // can be null, to create an orphan split
        __CLR4_2_02kh2khlnxz22m1.R.inc(3632);clone.siblingIndex = (((parent == null )&&(__CLR4_2_02kh2khlnxz22m1.R.iget(3633)!=0|true))||(__CLR4_2_02kh2khlnxz22m1.R.iget(3634)==0&false))? 0 : siblingIndex;

        __CLR4_2_02kh2khlnxz22m1.R.inc(3635);return clone;
    }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

    private static class OuterHtmlVisitor implements NodeVisitor {
        private Appendable accum;
        private Document.OutputSettings out;

        OuterHtmlVisitor(Appendable accum, Document.OutputSettings out) {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3636);
            __CLR4_2_02kh2khlnxz22m1.R.inc(3637);this.accum = accum;
            __CLR4_2_02kh2khlnxz22m1.R.inc(3638);this.out = out;
            __CLR4_2_02kh2khlnxz22m1.R.inc(3639);out.prepareEncoder();
        }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

        public void head(Node node, int depth) {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3640);
            __CLR4_2_02kh2khlnxz22m1.R.inc(3641);try {
				__CLR4_2_02kh2khlnxz22m1.R.inc(3642);node.outerHtmlHead(accum, depth, out);
			} catch (IOException exception) {
				__CLR4_2_02kh2khlnxz22m1.R.inc(3643);throw new SerializationException(exception);
			}
        }finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}

        public void tail(Node node, int depth) {try{__CLR4_2_02kh2khlnxz22m1.R.inc(3644);
            __CLR4_2_02kh2khlnxz22m1.R.inc(3645);if ((((!node.nodeName().equals("#text"))&&(__CLR4_2_02kh2khlnxz22m1.R.iget(3646)!=0|true))||(__CLR4_2_02kh2khlnxz22m1.R.iget(3647)==0&false))) {{ // saves a void hit.
				__CLR4_2_02kh2khlnxz22m1.R.inc(3648);try {
					__CLR4_2_02kh2khlnxz22m1.R.inc(3649);node.outerHtmlTail(accum, depth, out);
				} catch (IOException exception) {
					__CLR4_2_02kh2khlnxz22m1.R.inc(3650);throw new SerializationException(exception);
				}
            }
        }}finally{__CLR4_2_02kh2khlnxz22m1.R.flushNeeded();}}
    }
}
