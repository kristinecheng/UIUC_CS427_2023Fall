/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

import java.util.List;


/**
 The whitelist based HTML cleaner. Use to ensure that end-user provided HTML contains only the elements and attributes
 that you are expecting; no junk, and no cross-site scripting attacks!
 <p>
 The HTML cleaner parses the input as HTML and then runs it through a white-list, so the output HTML can only contain
 HTML that is allowed by the whitelist.
 </p>
 <p>
 It is assumed that the input HTML is a body fragment; the clean methods only pull from the source's body, and the
 canned white-lists only allow body contained tags.
 </p>
 <p>
 Rather than interacting directly with a Cleaner object, generally see the {@code clean} methods in {@link org.jsoup.Jsoup}.
 </p>
 */
public class Cleaner {public static class __CLR4_2_06xo6xolnxz22rd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,9072,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Whitelist whitelist;

    /**
     Create a new cleaner, that sanitizes documents using the supplied whitelist.
     @param whitelist white-list to clean with
     */
    public Cleaner(Whitelist whitelist) {try{__CLR4_2_06xo6xolnxz22rd.R.inc(8988);
        __CLR4_2_06xo6xolnxz22rd.R.inc(8989);Validate.notNull(whitelist);
        __CLR4_2_06xo6xolnxz22rd.R.inc(8990);this.whitelist = whitelist;
    }finally{__CLR4_2_06xo6xolnxz22rd.R.flushNeeded();}}

    /**
     Creates a new, clean document, from the original dirty document, containing only elements allowed by the whitelist.
     The original document is not modified. Only elements from the dirt document's <code>body</code> are used.
     @param dirtyDocument Untrusted base document to clean.
     @return cleaned document.
     */
    public Document clean(Document dirtyDocument) {try{__CLR4_2_06xo6xolnxz22rd.R.inc(8991);
        __CLR4_2_06xo6xolnxz22rd.R.inc(8992);Validate.notNull(dirtyDocument);

        __CLR4_2_06xo6xolnxz22rd.R.inc(8993);Document clean = Document.createShell(dirtyDocument.baseUri());
        __CLR4_2_06xo6xolnxz22rd.R.inc(8994);if ((((dirtyDocument.body() != null)&&(__CLR4_2_06xo6xolnxz22rd.R.iget(8995)!=0|true))||(__CLR4_2_06xo6xolnxz22rd.R.iget(8996)==0&false))) // frameset documents won't have a body. the clean doc will have empty body.
            {__CLR4_2_06xo6xolnxz22rd.R.inc(8997);copySafeNodes(dirtyDocument.body(), clean.body());

        }__CLR4_2_06xo6xolnxz22rd.R.inc(8998);return clean;
    }finally{__CLR4_2_06xo6xolnxz22rd.R.flushNeeded();}}

    /**
     Determines if the input document <b>body</b>is valid, against the whitelist. It is considered valid if all the tags and attributes
     in the input HTML are allowed by the whitelist, and that there is no content in the <code>head</code>.
     <p>
     This method can be used as a validator for user input. An invalid document will still be cleaned successfully
     using the {@link #clean(Document)} document. If using as a validator, it is recommended to still clean the document
     to ensure enforced attributes are set correctly, and that the output is tidied.
     </p>
     @param dirtyDocument document to test
     @return true if no tags or attributes need to be removed; false if they do
     */
    public boolean isValid(Document dirtyDocument) {try{__CLR4_2_06xo6xolnxz22rd.R.inc(8999);
        __CLR4_2_06xo6xolnxz22rd.R.inc(9000);Validate.notNull(dirtyDocument);

        __CLR4_2_06xo6xolnxz22rd.R.inc(9001);Document clean = Document.createShell(dirtyDocument.baseUri());
        __CLR4_2_06xo6xolnxz22rd.R.inc(9002);int numDiscarded = copySafeNodes(dirtyDocument.body(), clean.body());
        __CLR4_2_06xo6xolnxz22rd.R.inc(9003);return numDiscarded == 0
            && dirtyDocument.head().childNodes().isEmpty(); // because we only look at the body, but we start from a shell, make sure there's nothing in the head
    }finally{__CLR4_2_06xo6xolnxz22rd.R.flushNeeded();}}

    public boolean isValidBodyHtml(String bodyHtml) {try{__CLR4_2_06xo6xolnxz22rd.R.inc(9004);
        __CLR4_2_06xo6xolnxz22rd.R.inc(9005);Document clean = Document.createShell("");
        __CLR4_2_06xo6xolnxz22rd.R.inc(9006);Document dirty = Document.createShell("");
        __CLR4_2_06xo6xolnxz22rd.R.inc(9007);ParseErrorList errorList = ParseErrorList.tracking(1);
        __CLR4_2_06xo6xolnxz22rd.R.inc(9008);List<Node> nodes = Parser.parseFragment(bodyHtml, dirty.body(), "", errorList);
        __CLR4_2_06xo6xolnxz22rd.R.inc(9009);dirty.body().insertChildren(0, nodes);
        __CLR4_2_06xo6xolnxz22rd.R.inc(9010);int numDiscarded = copySafeNodes(dirty.body(), clean.body());
        __CLR4_2_06xo6xolnxz22rd.R.inc(9011);return numDiscarded == 0 && errorList.isEmpty();
    }finally{__CLR4_2_06xo6xolnxz22rd.R.flushNeeded();}}

    /**
     Iterates the input and copies trusted nodes (tags, attributes, text) into the destination.
     */
    private final class CleaningVisitor implements NodeVisitor {
        private int numDiscarded = 0;
        private final Element root;
        private Element destination; // current element to append nodes to

        private CleaningVisitor(Element root, Element destination) {try{__CLR4_2_06xo6xolnxz22rd.R.inc(9012);
            __CLR4_2_06xo6xolnxz22rd.R.inc(9013);this.root = root;
            __CLR4_2_06xo6xolnxz22rd.R.inc(9014);this.destination = destination;
        }finally{__CLR4_2_06xo6xolnxz22rd.R.flushNeeded();}}

        public void head(Node source, int depth) {try{__CLR4_2_06xo6xolnxz22rd.R.inc(9015);
            __CLR4_2_06xo6xolnxz22rd.R.inc(9016);if ((((source instanceof Element)&&(__CLR4_2_06xo6xolnxz22rd.R.iget(9017)!=0|true))||(__CLR4_2_06xo6xolnxz22rd.R.iget(9018)==0&false))) {{
                __CLR4_2_06xo6xolnxz22rd.R.inc(9019);Element sourceEl = (Element) source;

                __CLR4_2_06xo6xolnxz22rd.R.inc(9020);if ((((whitelist.isSafeTag(sourceEl.tagName()))&&(__CLR4_2_06xo6xolnxz22rd.R.iget(9021)!=0|true))||(__CLR4_2_06xo6xolnxz22rd.R.iget(9022)==0&false))) {{ // safe, clone and copy safe attrs
                    __CLR4_2_06xo6xolnxz22rd.R.inc(9023);ElementMeta meta = createSafeElement(sourceEl);
                    __CLR4_2_06xo6xolnxz22rd.R.inc(9024);Element destChild = meta.el;
                    __CLR4_2_06xo6xolnxz22rd.R.inc(9025);destination.appendChild(destChild);

                    __CLR4_2_06xo6xolnxz22rd.R.inc(9026);numDiscarded += meta.numAttribsDiscarded;
                    __CLR4_2_06xo6xolnxz22rd.R.inc(9027);destination = destChild;
                } }else {__CLR4_2_06xo6xolnxz22rd.R.inc(9028);if ((((source != root)&&(__CLR4_2_06xo6xolnxz22rd.R.iget(9029)!=0|true))||(__CLR4_2_06xo6xolnxz22rd.R.iget(9030)==0&false))) {{ // not a safe tag, so don't add. don't count root against discarded.
                    __CLR4_2_06xo6xolnxz22rd.R.inc(9031);numDiscarded++;
                }
            }}} }else {__CLR4_2_06xo6xolnxz22rd.R.inc(9032);if ((((source instanceof TextNode)&&(__CLR4_2_06xo6xolnxz22rd.R.iget(9033)!=0|true))||(__CLR4_2_06xo6xolnxz22rd.R.iget(9034)==0&false))) {{
                __CLR4_2_06xo6xolnxz22rd.R.inc(9035);TextNode sourceText = (TextNode) source;
                __CLR4_2_06xo6xolnxz22rd.R.inc(9036);TextNode destText = new TextNode(sourceText.getWholeText());
                __CLR4_2_06xo6xolnxz22rd.R.inc(9037);destination.appendChild(destText);
            } }else {__CLR4_2_06xo6xolnxz22rd.R.inc(9038);if ((((source instanceof DataNode && whitelist.isSafeTag(source.parent().nodeName()))&&(__CLR4_2_06xo6xolnxz22rd.R.iget(9039)!=0|true))||(__CLR4_2_06xo6xolnxz22rd.R.iget(9040)==0&false))) {{
              __CLR4_2_06xo6xolnxz22rd.R.inc(9041);DataNode sourceData = (DataNode) source;
              __CLR4_2_06xo6xolnxz22rd.R.inc(9042);DataNode destData = new DataNode(sourceData.getWholeData());
              __CLR4_2_06xo6xolnxz22rd.R.inc(9043);destination.appendChild(destData);
            } }else {{ // else, we don't care about comments, xml proc instructions, etc
                __CLR4_2_06xo6xolnxz22rd.R.inc(9044);numDiscarded++;
            }
        }}}}finally{__CLR4_2_06xo6xolnxz22rd.R.flushNeeded();}}

        public void tail(Node source, int depth) {try{__CLR4_2_06xo6xolnxz22rd.R.inc(9045);
            __CLR4_2_06xo6xolnxz22rd.R.inc(9046);if ((((source instanceof Element && whitelist.isSafeTag(source.nodeName()))&&(__CLR4_2_06xo6xolnxz22rd.R.iget(9047)!=0|true))||(__CLR4_2_06xo6xolnxz22rd.R.iget(9048)==0&false))) {{
                __CLR4_2_06xo6xolnxz22rd.R.inc(9049);destination = destination.parent(); // would have descended, so pop destination stack
            }
        }}finally{__CLR4_2_06xo6xolnxz22rd.R.flushNeeded();}}
    }

    private int copySafeNodes(Element source, Element dest) {try{__CLR4_2_06xo6xolnxz22rd.R.inc(9050);
        __CLR4_2_06xo6xolnxz22rd.R.inc(9051);CleaningVisitor cleaningVisitor = new CleaningVisitor(source, dest);
        __CLR4_2_06xo6xolnxz22rd.R.inc(9052);NodeTraversor.traverse(cleaningVisitor, source);
        __CLR4_2_06xo6xolnxz22rd.R.inc(9053);return cleaningVisitor.numDiscarded;
    }finally{__CLR4_2_06xo6xolnxz22rd.R.flushNeeded();}}

    private ElementMeta createSafeElement(Element sourceEl) {try{__CLR4_2_06xo6xolnxz22rd.R.inc(9054);
        __CLR4_2_06xo6xolnxz22rd.R.inc(9055);String sourceTag = sourceEl.tagName();
        __CLR4_2_06xo6xolnxz22rd.R.inc(9056);Attributes destAttrs = new Attributes();
        __CLR4_2_06xo6xolnxz22rd.R.inc(9057);Element dest = new Element(Tag.valueOf(sourceTag), sourceEl.baseUri(), destAttrs);
        __CLR4_2_06xo6xolnxz22rd.R.inc(9058);int numDiscarded = 0;

        __CLR4_2_06xo6xolnxz22rd.R.inc(9059);Attributes sourceAttrs = sourceEl.attributes();
        __CLR4_2_06xo6xolnxz22rd.R.inc(9060);for (Attribute sourceAttr : sourceAttrs) {{
            __CLR4_2_06xo6xolnxz22rd.R.inc(9061);if ((((whitelist.isSafeAttribute(sourceTag, sourceEl, sourceAttr))&&(__CLR4_2_06xo6xolnxz22rd.R.iget(9062)!=0|true))||(__CLR4_2_06xo6xolnxz22rd.R.iget(9063)==0&false)))
                {__CLR4_2_06xo6xolnxz22rd.R.inc(9064);destAttrs.put(sourceAttr);
            }else
                {__CLR4_2_06xo6xolnxz22rd.R.inc(9065);numDiscarded++;
        }}
        }__CLR4_2_06xo6xolnxz22rd.R.inc(9066);Attributes enforcedAttrs = whitelist.getEnforcedAttributes(sourceTag);
        __CLR4_2_06xo6xolnxz22rd.R.inc(9067);destAttrs.addAll(enforcedAttrs);

        __CLR4_2_06xo6xolnxz22rd.R.inc(9068);return new ElementMeta(dest, numDiscarded);
    }finally{__CLR4_2_06xo6xolnxz22rd.R.flushNeeded();}}

    private static class ElementMeta {
        Element el;
        int numAttribsDiscarded;

        ElementMeta(Element el, int numAttribsDiscarded) {try{__CLR4_2_06xo6xolnxz22rd.R.inc(9069);
            __CLR4_2_06xo6xolnxz22rd.R.inc(9070);this.el = el;
            __CLR4_2_06xo6xolnxz22rd.R.inc(9071);this.numAttribsDiscarded = numAttribsDiscarded;
        }finally{__CLR4_2_06xo6xolnxz22rd.R.flushNeeded();}}
    }

}
