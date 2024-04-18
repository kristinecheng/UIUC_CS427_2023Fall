/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

/**
 * Use the {@code XmlTreeBuilder} when you want to parse XML without any of the HTML DOM rules being applied to the
 * document.
 * <p>Usage example: {@code Document xmlDoc = Jsoup.parse(html, baseUrl, Parser.xmlParser());}</p>
 *
 * @author Jonathan Hedley
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class XmlTreeBuilder extends TreeBuilder {public static class __CLR4_2_06uw6uwlnxz22r7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,8988,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    ParseSettings defaultSettings() {try{__CLR4_2_06uw6uwlnxz22r7.R.inc(8888);
        __CLR4_2_06uw6uwlnxz22r7.R.inc(8889);return ParseSettings.preserveCase;
    }finally{__CLR4_2_06uw6uwlnxz22r7.R.flushNeeded();}}

    @Override
    protected void initialiseParse(Reader input, String baseUri, Parser parser) {try{__CLR4_2_06uw6uwlnxz22r7.R.inc(8890);
        __CLR4_2_06uw6uwlnxz22r7.R.inc(8891);super.initialiseParse(input, baseUri, parser);
        __CLR4_2_06uw6uwlnxz22r7.R.inc(8892);stack.add(doc); // place the document onto the stack. differs from HtmlTreeBuilder (not on stack)
        __CLR4_2_06uw6uwlnxz22r7.R.inc(8893);doc.outputSettings().syntax(Document.OutputSettings.Syntax.xml);
    }finally{__CLR4_2_06uw6uwlnxz22r7.R.flushNeeded();}}

    Document parse(Reader input, String baseUri) {try{__CLR4_2_06uw6uwlnxz22r7.R.inc(8894);
        __CLR4_2_06uw6uwlnxz22r7.R.inc(8895);return parse(input, baseUri, new Parser(this));
    }finally{__CLR4_2_06uw6uwlnxz22r7.R.flushNeeded();}}

    Document parse(String input, String baseUri) {try{__CLR4_2_06uw6uwlnxz22r7.R.inc(8896);
        __CLR4_2_06uw6uwlnxz22r7.R.inc(8897);return parse(new StringReader(input), baseUri, new Parser(this));
    }finally{__CLR4_2_06uw6uwlnxz22r7.R.flushNeeded();}}

    @Override
    protected boolean process(Token token) {try{__CLR4_2_06uw6uwlnxz22r7.R.inc(8898);
        // start tag, end tag, doctype, comment, character, eof
        boolean __CLB4_2_0_bool0=false;__CLR4_2_06uw6uwlnxz22r7.R.inc(8899);switch (token.type) {
            case StartTag:if (!__CLB4_2_0_bool0) {__CLR4_2_06uw6uwlnxz22r7.R.inc(8900);__CLB4_2_0_bool0=true;}
                __CLR4_2_06uw6uwlnxz22r7.R.inc(8901);insert(token.asStartTag());
                __CLR4_2_06uw6uwlnxz22r7.R.inc(8902);break;
            case EndTag:if (!__CLB4_2_0_bool0) {__CLR4_2_06uw6uwlnxz22r7.R.inc(8903);__CLB4_2_0_bool0=true;}
                __CLR4_2_06uw6uwlnxz22r7.R.inc(8904);popStackToClose(token.asEndTag());
                __CLR4_2_06uw6uwlnxz22r7.R.inc(8905);break;
            case Comment:if (!__CLB4_2_0_bool0) {__CLR4_2_06uw6uwlnxz22r7.R.inc(8906);__CLB4_2_0_bool0=true;}
                __CLR4_2_06uw6uwlnxz22r7.R.inc(8907);insert(token.asComment());
                __CLR4_2_06uw6uwlnxz22r7.R.inc(8908);break;
            case Character:if (!__CLB4_2_0_bool0) {__CLR4_2_06uw6uwlnxz22r7.R.inc(8909);__CLB4_2_0_bool0=true;}
                __CLR4_2_06uw6uwlnxz22r7.R.inc(8910);insert(token.asCharacter());
                __CLR4_2_06uw6uwlnxz22r7.R.inc(8911);break;
            case Doctype:if (!__CLB4_2_0_bool0) {__CLR4_2_06uw6uwlnxz22r7.R.inc(8912);__CLB4_2_0_bool0=true;}
                __CLR4_2_06uw6uwlnxz22r7.R.inc(8913);insert(token.asDoctype());
                __CLR4_2_06uw6uwlnxz22r7.R.inc(8914);break;
            case EOF:if (!__CLB4_2_0_bool0) {__CLR4_2_06uw6uwlnxz22r7.R.inc(8915);__CLB4_2_0_bool0=true;} // could put some normalisation here if desired
                __CLR4_2_06uw6uwlnxz22r7.R.inc(8916);break;
            default:if (!__CLB4_2_0_bool0) {__CLR4_2_06uw6uwlnxz22r7.R.inc(8917);__CLB4_2_0_bool0=true;}
                __CLR4_2_06uw6uwlnxz22r7.R.inc(8918);Validate.fail("Unexpected token type: " + token.type);
        }
        __CLR4_2_06uw6uwlnxz22r7.R.inc(8919);return true;
    }finally{__CLR4_2_06uw6uwlnxz22r7.R.flushNeeded();}}

    private void insertNode(Node node) {try{__CLR4_2_06uw6uwlnxz22r7.R.inc(8920);
        __CLR4_2_06uw6uwlnxz22r7.R.inc(8921);currentElement().appendChild(node);
    }finally{__CLR4_2_06uw6uwlnxz22r7.R.flushNeeded();}}

    Element insert(Token.StartTag startTag) {try{__CLR4_2_06uw6uwlnxz22r7.R.inc(8922);
        __CLR4_2_06uw6uwlnxz22r7.R.inc(8923);Tag tag = Tag.valueOf(startTag.name(), settings);
        // todo: wonder if for xml parsing, should treat all tags as unknown? because it's not html.
        __CLR4_2_06uw6uwlnxz22r7.R.inc(8924);startTag.attributes.deduplicate(settings);

        __CLR4_2_06uw6uwlnxz22r7.R.inc(8925);Element el = new Element(tag, baseUri, settings.normalizeAttributes(startTag.attributes));
        __CLR4_2_06uw6uwlnxz22r7.R.inc(8926);insertNode(el);
        __CLR4_2_06uw6uwlnxz22r7.R.inc(8927);if ((((startTag.isSelfClosing())&&(__CLR4_2_06uw6uwlnxz22r7.R.iget(8928)!=0|true))||(__CLR4_2_06uw6uwlnxz22r7.R.iget(8929)==0&false))) {{
            __CLR4_2_06uw6uwlnxz22r7.R.inc(8930);if ((((!tag.isKnownTag())&&(__CLR4_2_06uw6uwlnxz22r7.R.iget(8931)!=0|true))||(__CLR4_2_06uw6uwlnxz22r7.R.iget(8932)==0&false))) // unknown tag, remember this is self closing for output. see above.
                {__CLR4_2_06uw6uwlnxz22r7.R.inc(8933);tag.setSelfClosing();
        }} }else {{
            __CLR4_2_06uw6uwlnxz22r7.R.inc(8934);stack.add(el);
        }
        }__CLR4_2_06uw6uwlnxz22r7.R.inc(8935);return el;
    }finally{__CLR4_2_06uw6uwlnxz22r7.R.flushNeeded();}}

    void insert(Token.Comment commentToken) {try{__CLR4_2_06uw6uwlnxz22r7.R.inc(8936);
        __CLR4_2_06uw6uwlnxz22r7.R.inc(8937);Comment comment = new Comment(commentToken.getData());
        __CLR4_2_06uw6uwlnxz22r7.R.inc(8938);Node insert = comment;
        __CLR4_2_06uw6uwlnxz22r7.R.inc(8939);if ((((commentToken.bogus && comment.isXmlDeclaration())&&(__CLR4_2_06uw6uwlnxz22r7.R.iget(8940)!=0|true))||(__CLR4_2_06uw6uwlnxz22r7.R.iget(8941)==0&false))) {{
            // xml declarations are emitted as bogus comments (which is right for html, but not xml)
            // so we do a bit of a hack and parse the data as an element to pull the attributes out
            __CLR4_2_06uw6uwlnxz22r7.R.inc(8942);XmlDeclaration decl = comment.asXmlDeclaration(); // else, we couldn't parse it as a decl, so leave as a comment
            __CLR4_2_06uw6uwlnxz22r7.R.inc(8943);if ((((decl != null)&&(__CLR4_2_06uw6uwlnxz22r7.R.iget(8944)!=0|true))||(__CLR4_2_06uw6uwlnxz22r7.R.iget(8945)==0&false)))
                {__CLR4_2_06uw6uwlnxz22r7.R.inc(8946);insert = decl;
        }}
        }__CLR4_2_06uw6uwlnxz22r7.R.inc(8947);insertNode(insert);
    }finally{__CLR4_2_06uw6uwlnxz22r7.R.flushNeeded();}}

    void insert(Token.Character token) {try{__CLR4_2_06uw6uwlnxz22r7.R.inc(8948);
        __CLR4_2_06uw6uwlnxz22r7.R.inc(8949);final String data = token.getData();
        __CLR4_2_06uw6uwlnxz22r7.R.inc(8950);insertNode((((token.isCData() )&&(__CLR4_2_06uw6uwlnxz22r7.R.iget(8951)!=0|true))||(__CLR4_2_06uw6uwlnxz22r7.R.iget(8952)==0&false))? new CDataNode(data) : new TextNode(data));
    }finally{__CLR4_2_06uw6uwlnxz22r7.R.flushNeeded();}}

    void insert(Token.Doctype d) {try{__CLR4_2_06uw6uwlnxz22r7.R.inc(8953);
        __CLR4_2_06uw6uwlnxz22r7.R.inc(8954);DocumentType doctypeNode = new DocumentType(settings.normalizeTag(d.getName()), d.getPublicIdentifier(), d.getSystemIdentifier());
        __CLR4_2_06uw6uwlnxz22r7.R.inc(8955);doctypeNode.setPubSysKey(d.getPubSysKey());
        __CLR4_2_06uw6uwlnxz22r7.R.inc(8956);insertNode(doctypeNode);
    }finally{__CLR4_2_06uw6uwlnxz22r7.R.flushNeeded();}}

    /**
     * If the stack contains an element with this tag's name, pop up the stack to remove the first occurrence. If not
     * found, skips.
     *
     * @param endTag tag to close
     */
    private void popStackToClose(Token.EndTag endTag) {try{__CLR4_2_06uw6uwlnxz22r7.R.inc(8957);
        __CLR4_2_06uw6uwlnxz22r7.R.inc(8958);String elName = settings.normalizeTag(endTag.tagName);
        __CLR4_2_06uw6uwlnxz22r7.R.inc(8959);Element firstFound = null;

        __CLR4_2_06uw6uwlnxz22r7.R.inc(8960);for (int pos = stack.size() -1; (((pos >= 0)&&(__CLR4_2_06uw6uwlnxz22r7.R.iget(8961)!=0|true))||(__CLR4_2_06uw6uwlnxz22r7.R.iget(8962)==0&false)); pos--) {{
            __CLR4_2_06uw6uwlnxz22r7.R.inc(8963);Element next = stack.get(pos);
            __CLR4_2_06uw6uwlnxz22r7.R.inc(8964);if ((((next.nodeName().equals(elName))&&(__CLR4_2_06uw6uwlnxz22r7.R.iget(8965)!=0|true))||(__CLR4_2_06uw6uwlnxz22r7.R.iget(8966)==0&false))) {{
                __CLR4_2_06uw6uwlnxz22r7.R.inc(8967);firstFound = next;
                __CLR4_2_06uw6uwlnxz22r7.R.inc(8968);break;
            }
        }}
        }__CLR4_2_06uw6uwlnxz22r7.R.inc(8969);if ((((firstFound == null)&&(__CLR4_2_06uw6uwlnxz22r7.R.iget(8970)!=0|true))||(__CLR4_2_06uw6uwlnxz22r7.R.iget(8971)==0&false)))
            {__CLR4_2_06uw6uwlnxz22r7.R.inc(8972);return; // not found, skip

        }__CLR4_2_06uw6uwlnxz22r7.R.inc(8973);for (int pos = stack.size() -1; (((pos >= 0)&&(__CLR4_2_06uw6uwlnxz22r7.R.iget(8974)!=0|true))||(__CLR4_2_06uw6uwlnxz22r7.R.iget(8975)==0&false)); pos--) {{
            __CLR4_2_06uw6uwlnxz22r7.R.inc(8976);Element next = stack.get(pos);
            __CLR4_2_06uw6uwlnxz22r7.R.inc(8977);stack.remove(pos);
            __CLR4_2_06uw6uwlnxz22r7.R.inc(8978);if ((((next == firstFound)&&(__CLR4_2_06uw6uwlnxz22r7.R.iget(8979)!=0|true))||(__CLR4_2_06uw6uwlnxz22r7.R.iget(8980)==0&false)))
                {__CLR4_2_06uw6uwlnxz22r7.R.inc(8981);break;
        }}
    }}finally{__CLR4_2_06uw6uwlnxz22r7.R.flushNeeded();}}


    List<Node> parseFragment(String inputFragment, String baseUri, Parser parser) {try{__CLR4_2_06uw6uwlnxz22r7.R.inc(8982);
        __CLR4_2_06uw6uwlnxz22r7.R.inc(8983);initialiseParse(new StringReader(inputFragment), baseUri, parser);
        __CLR4_2_06uw6uwlnxz22r7.R.inc(8984);runParser();
        __CLR4_2_06uw6uwlnxz22r7.R.inc(8985);return doc.childNodes();
    }finally{__CLR4_2_06uw6uwlnxz22r7.R.flushNeeded();}}

    List<Node> parseFragment(String inputFragment, Element context, String baseUri, Parser parser) {try{__CLR4_2_06uw6uwlnxz22r7.R.inc(8986);
        __CLR4_2_06uw6uwlnxz22r7.R.inc(8987);return parseFragment(inputFragment, baseUri, parser);
    }finally{__CLR4_2_06uw6uwlnxz22r7.R.flushNeeded();}}
}
