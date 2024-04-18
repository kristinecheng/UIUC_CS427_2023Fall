/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import static org.jsoup.internal.StringUtil.inSorted;

/**
 * HTML Tree Builder; creates a DOM from Tokens.
 */
public class HtmlTreeBuilder extends TreeBuilder {public static class __CLR4_2_037v37vlnxz22ne{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,4757,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // tag searches. must be sorted, used in inSorted. MUST update HtmlTreeBuilderTest if more arrays are added.
    static final String[] TagsSearchInScope = new String[]{"applet", "caption", "html", "marquee", "object", "table", "td", "th"};
    static final String[] TagSearchList = new String[]{"ol", "ul"};
    static final String[] TagSearchButton = new String[]{"button"};
    static final String[] TagSearchTableScope = new String[]{"html", "table"};
    static final String[] TagSearchSelectScope = new String[]{"optgroup", "option"};
    static final String[] TagSearchEndTags = new String[]{"dd", "dt", "li", "optgroup", "option", "p", "rp", "rt"};
    static final String[] TagSearchSpecial = new String[]{"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound",
        "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd",
        "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form",
        "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html",
        "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav",
        "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script",
        "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead",
        "title", "tr", "ul", "wbr", "xmp"};

    public static final int MaxScopeSearchDepth = 100; // prevents the parser bogging down in exceptionally broken pages

    private HtmlTreeBuilderState state; // the current state
    private HtmlTreeBuilderState originalState; // original / marked state

    private boolean baseUriSetFromDoc;
    private Element headElement; // the current head element
    private FormElement formElement; // the current form element
    private Element contextElement; // fragment parse context -- could be null even if fragment parsing
    private ArrayList<Element> formattingElements; // active (open) formatting elements
    private List<String> pendingTableCharacters; // chars in table to be shifted out
    private Token.EndTag emptyEnd; // reused empty end tag

    private boolean framesetOk; // if ok to go into frameset
    private boolean fosterInserts; // if next inserts should be fostered
    private boolean fragmentParsing; // if parsing a fragment of html

    ParseSettings defaultSettings() {try{__CLR4_2_037v37vlnxz22ne.R.inc(4171);
        __CLR4_2_037v37vlnxz22ne.R.inc(4172);return ParseSettings.htmlDefault;
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    @Override
    protected void initialiseParse(Reader input, String baseUri, Parser parser) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4173);
        __CLR4_2_037v37vlnxz22ne.R.inc(4174);super.initialiseParse(input, baseUri, parser);

        // this is a bit mucky. todo - probably just create new parser objects to ensure all reset.
        __CLR4_2_037v37vlnxz22ne.R.inc(4175);state = HtmlTreeBuilderState.Initial;
        __CLR4_2_037v37vlnxz22ne.R.inc(4176);originalState = null;
        __CLR4_2_037v37vlnxz22ne.R.inc(4177);baseUriSetFromDoc = false;
        __CLR4_2_037v37vlnxz22ne.R.inc(4178);headElement = null;
        __CLR4_2_037v37vlnxz22ne.R.inc(4179);formElement = null;
        __CLR4_2_037v37vlnxz22ne.R.inc(4180);contextElement = null;
        __CLR4_2_037v37vlnxz22ne.R.inc(4181);formattingElements = new ArrayList<>();
        __CLR4_2_037v37vlnxz22ne.R.inc(4182);pendingTableCharacters = new ArrayList<>();
        __CLR4_2_037v37vlnxz22ne.R.inc(4183);emptyEnd = new Token.EndTag();
        __CLR4_2_037v37vlnxz22ne.R.inc(4184);framesetOk = true;
        __CLR4_2_037v37vlnxz22ne.R.inc(4185);fosterInserts = false;
        __CLR4_2_037v37vlnxz22ne.R.inc(4186);fragmentParsing = false;
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    List<Node> parseFragment(String inputFragment, Element context, String baseUri, Parser parser) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4187);
        // context may be null
        __CLR4_2_037v37vlnxz22ne.R.inc(4188);state = HtmlTreeBuilderState.Initial;
        __CLR4_2_037v37vlnxz22ne.R.inc(4189);initialiseParse(new StringReader(inputFragment), baseUri, parser);
        __CLR4_2_037v37vlnxz22ne.R.inc(4190);contextElement = context;
        __CLR4_2_037v37vlnxz22ne.R.inc(4191);fragmentParsing = true;
        __CLR4_2_037v37vlnxz22ne.R.inc(4192);Element root = null;

        __CLR4_2_037v37vlnxz22ne.R.inc(4193);if ((((context != null)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4194)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4195)==0&false))) {{
            __CLR4_2_037v37vlnxz22ne.R.inc(4196);if ((((context.ownerDocument() != null)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4197)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4198)==0&false))) // quirks setup:
                {__CLR4_2_037v37vlnxz22ne.R.inc(4199);doc.quirksMode(context.ownerDocument().quirksMode());

            // initialise the tokeniser state:
            }__CLR4_2_037v37vlnxz22ne.R.inc(4200);String contextTag = context.tagName();
            __CLR4_2_037v37vlnxz22ne.R.inc(4201);if ((((StringUtil.in(contextTag, "title", "textarea"))&&(__CLR4_2_037v37vlnxz22ne.R.iget(4202)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4203)==0&false)))
                {__CLR4_2_037v37vlnxz22ne.R.inc(4204);tokeniser.transition(TokeniserState.Rcdata);
            }else {__CLR4_2_037v37vlnxz22ne.R.inc(4205);if ((((StringUtil.in(contextTag, "iframe", "noembed", "noframes", "style", "xmp"))&&(__CLR4_2_037v37vlnxz22ne.R.iget(4206)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4207)==0&false)))
                {__CLR4_2_037v37vlnxz22ne.R.inc(4208);tokeniser.transition(TokeniserState.Rawtext);
            }else {__CLR4_2_037v37vlnxz22ne.R.inc(4209);if ((((contextTag.equals("script"))&&(__CLR4_2_037v37vlnxz22ne.R.iget(4210)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4211)==0&false)))
                {__CLR4_2_037v37vlnxz22ne.R.inc(4212);tokeniser.transition(TokeniserState.ScriptData);
            }else {__CLR4_2_037v37vlnxz22ne.R.inc(4213);if ((((contextTag.equals(("noscript")))&&(__CLR4_2_037v37vlnxz22ne.R.iget(4214)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4215)==0&false)))
                {__CLR4_2_037v37vlnxz22ne.R.inc(4216);tokeniser.transition(TokeniserState.Data); // if scripting enabled, rawtext
            }else {__CLR4_2_037v37vlnxz22ne.R.inc(4217);if ((((contextTag.equals("plaintext"))&&(__CLR4_2_037v37vlnxz22ne.R.iget(4218)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4219)==0&false)))
                {__CLR4_2_037v37vlnxz22ne.R.inc(4220);tokeniser.transition(TokeniserState.Data);
            }else
                {__CLR4_2_037v37vlnxz22ne.R.inc(4221);tokeniser.transition(TokeniserState.Data); // default

            }}}}}__CLR4_2_037v37vlnxz22ne.R.inc(4222);root = new Element(Tag.valueOf("html", settings), baseUri);
            __CLR4_2_037v37vlnxz22ne.R.inc(4223);doc.appendChild(root);
            __CLR4_2_037v37vlnxz22ne.R.inc(4224);stack.add(root);
            __CLR4_2_037v37vlnxz22ne.R.inc(4225);resetInsertionMode();

            // setup form element to nearest form on context (up ancestor chain). ensures form controls are associated
            // with form correctly
            __CLR4_2_037v37vlnxz22ne.R.inc(4226);Elements contextChain = context.parents();
            __CLR4_2_037v37vlnxz22ne.R.inc(4227);contextChain.add(0, context);
            __CLR4_2_037v37vlnxz22ne.R.inc(4228);for (Element parent: contextChain) {{
                __CLR4_2_037v37vlnxz22ne.R.inc(4229);if ((((parent instanceof FormElement)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4230)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4231)==0&false))) {{
                    __CLR4_2_037v37vlnxz22ne.R.inc(4232);formElement = (FormElement) parent;
                    __CLR4_2_037v37vlnxz22ne.R.inc(4233);break;
                }
            }}
        }}

        }__CLR4_2_037v37vlnxz22ne.R.inc(4234);runParser();
        __CLR4_2_037v37vlnxz22ne.R.inc(4235);if ((((context != null)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4236)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4237)==0&false)))
            {__CLR4_2_037v37vlnxz22ne.R.inc(4238);return root.childNodes();
        }else
            {__CLR4_2_037v37vlnxz22ne.R.inc(4239);return doc.childNodes();
    }}finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    @Override
    protected boolean process(Token token) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4240);
        __CLR4_2_037v37vlnxz22ne.R.inc(4241);currentToken = token;
        __CLR4_2_037v37vlnxz22ne.R.inc(4242);return this.state.process(token, this);
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    boolean process(Token token, HtmlTreeBuilderState state) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4243);
        __CLR4_2_037v37vlnxz22ne.R.inc(4244);currentToken = token;
        __CLR4_2_037v37vlnxz22ne.R.inc(4245);return state.process(token, this);
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    void transition(HtmlTreeBuilderState state) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4246);
        __CLR4_2_037v37vlnxz22ne.R.inc(4247);this.state = state;
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    HtmlTreeBuilderState state() {try{__CLR4_2_037v37vlnxz22ne.R.inc(4248);
        __CLR4_2_037v37vlnxz22ne.R.inc(4249);return state;
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    void markInsertionMode() {try{__CLR4_2_037v37vlnxz22ne.R.inc(4250);
        __CLR4_2_037v37vlnxz22ne.R.inc(4251);originalState = state;
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    HtmlTreeBuilderState originalState() {try{__CLR4_2_037v37vlnxz22ne.R.inc(4252);
        __CLR4_2_037v37vlnxz22ne.R.inc(4253);return originalState;
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    void framesetOk(boolean framesetOk) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4254);
        __CLR4_2_037v37vlnxz22ne.R.inc(4255);this.framesetOk = framesetOk;
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    boolean framesetOk() {try{__CLR4_2_037v37vlnxz22ne.R.inc(4256);
        __CLR4_2_037v37vlnxz22ne.R.inc(4257);return framesetOk;
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    Document getDocument() {try{__CLR4_2_037v37vlnxz22ne.R.inc(4258);
        __CLR4_2_037v37vlnxz22ne.R.inc(4259);return doc;
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    String getBaseUri() {try{__CLR4_2_037v37vlnxz22ne.R.inc(4260);
        __CLR4_2_037v37vlnxz22ne.R.inc(4261);return baseUri;
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    void maybeSetBaseUri(Element base) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4262);
        __CLR4_2_037v37vlnxz22ne.R.inc(4263);if ((((baseUriSetFromDoc)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4264)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4265)==0&false))) // only listen to the first <base href> in parse
            {__CLR4_2_037v37vlnxz22ne.R.inc(4266);return;

        }__CLR4_2_037v37vlnxz22ne.R.inc(4267);String href = base.absUrl("href");
        __CLR4_2_037v37vlnxz22ne.R.inc(4268);if ((((href.length() != 0)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4269)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4270)==0&false))) {{ // ignore <base target> etc
            __CLR4_2_037v37vlnxz22ne.R.inc(4271);baseUri = href;
            __CLR4_2_037v37vlnxz22ne.R.inc(4272);baseUriSetFromDoc = true;
            __CLR4_2_037v37vlnxz22ne.R.inc(4273);doc.setBaseUri(href); // set on the doc so doc.createElement(Tag) will get updated base, and to update all descendants
        }
    }}finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    boolean isFragmentParsing() {try{__CLR4_2_037v37vlnxz22ne.R.inc(4274);
        __CLR4_2_037v37vlnxz22ne.R.inc(4275);return fragmentParsing;
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    void error(HtmlTreeBuilderState state) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4276);
        __CLR4_2_037v37vlnxz22ne.R.inc(4277);if ((((parser.getErrors().canAddError())&&(__CLR4_2_037v37vlnxz22ne.R.iget(4278)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4279)==0&false)))
            {__CLR4_2_037v37vlnxz22ne.R.inc(4280);parser.getErrors().add(new ParseError(reader.pos(), "Unexpected token [%s] when in state [%s]", currentToken.tokenType(), state));
    }}finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    Element insert(final Token.StartTag startTag) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4281);
        // cleanup duplicate attributes:
        __CLR4_2_037v37vlnxz22ne.R.inc(4282);if ((((!startTag.attributes.isEmpty())&&(__CLR4_2_037v37vlnxz22ne.R.iget(4283)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4284)==0&false))) {{
            __CLR4_2_037v37vlnxz22ne.R.inc(4285);int dupes = startTag.attributes.deduplicate(settings);
            __CLR4_2_037v37vlnxz22ne.R.inc(4286);if ((((dupes > 0)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4287)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4288)==0&false))) {{
                __CLR4_2_037v37vlnxz22ne.R.inc(4289);error("Duplicate attribute");
            }
        }}

        // handle empty unknown tags
        // when the spec expects an empty tag, will directly hit insertEmpty, so won't generate this fake end tag.
        }__CLR4_2_037v37vlnxz22ne.R.inc(4290);if ((((startTag.isSelfClosing())&&(__CLR4_2_037v37vlnxz22ne.R.iget(4291)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4292)==0&false))) {{
            __CLR4_2_037v37vlnxz22ne.R.inc(4293);Element el = insertEmpty(startTag);
            __CLR4_2_037v37vlnxz22ne.R.inc(4294);stack.add(el);
            __CLR4_2_037v37vlnxz22ne.R.inc(4295);tokeniser.transition(TokeniserState.Data); // handles <script />, otherwise needs breakout steps from script data
            __CLR4_2_037v37vlnxz22ne.R.inc(4296);tokeniser.emit(emptyEnd.reset().name(el.tagName()));  // ensure we get out of whatever state we are in. emitted for yielded processing
            __CLR4_2_037v37vlnxz22ne.R.inc(4297);return el;
        }

        }__CLR4_2_037v37vlnxz22ne.R.inc(4298);Element el = new Element(Tag.valueOf(startTag.name(), settings), baseUri, settings.normalizeAttributes(startTag.attributes));
        __CLR4_2_037v37vlnxz22ne.R.inc(4299);insert(el);
        __CLR4_2_037v37vlnxz22ne.R.inc(4300);return el;
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    Element insertStartTag(String startTagName) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4301);
        __CLR4_2_037v37vlnxz22ne.R.inc(4302);Element el = new Element(Tag.valueOf(startTagName, settings), baseUri);
        __CLR4_2_037v37vlnxz22ne.R.inc(4303);insert(el);
        __CLR4_2_037v37vlnxz22ne.R.inc(4304);return el;
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    void insert(Element el) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4305);
        __CLR4_2_037v37vlnxz22ne.R.inc(4306);insertNode(el);
        __CLR4_2_037v37vlnxz22ne.R.inc(4307);stack.add(el);
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    Element insertEmpty(Token.StartTag startTag) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4308);
        __CLR4_2_037v37vlnxz22ne.R.inc(4309);Tag tag = Tag.valueOf(startTag.name(), settings);
        __CLR4_2_037v37vlnxz22ne.R.inc(4310);Element el = new Element(tag, baseUri, startTag.attributes);
        __CLR4_2_037v37vlnxz22ne.R.inc(4311);insertNode(el);
        __CLR4_2_037v37vlnxz22ne.R.inc(4312);if ((((startTag.isSelfClosing())&&(__CLR4_2_037v37vlnxz22ne.R.iget(4313)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4314)==0&false))) {{
            __CLR4_2_037v37vlnxz22ne.R.inc(4315);if ((((tag.isKnownTag())&&(__CLR4_2_037v37vlnxz22ne.R.iget(4316)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4317)==0&false))) {{
                __CLR4_2_037v37vlnxz22ne.R.inc(4318);if ((((!tag.isEmpty())&&(__CLR4_2_037v37vlnxz22ne.R.iget(4319)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4320)==0&false)))
                    {__CLR4_2_037v37vlnxz22ne.R.inc(4321);tokeniser.error("Tag cannot be self closing; not a void tag");
            }}
            }else // unknown tag, remember this is self closing for output
                {__CLR4_2_037v37vlnxz22ne.R.inc(4322);tag.setSelfClosing();
        }}
        }__CLR4_2_037v37vlnxz22ne.R.inc(4323);return el;
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    FormElement insertForm(Token.StartTag startTag, boolean onStack) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4324);
        __CLR4_2_037v37vlnxz22ne.R.inc(4325);Tag tag = Tag.valueOf(startTag.name(), settings);
        __CLR4_2_037v37vlnxz22ne.R.inc(4326);FormElement el = new FormElement(tag, baseUri, startTag.attributes);
        __CLR4_2_037v37vlnxz22ne.R.inc(4327);setFormElement(el);
        __CLR4_2_037v37vlnxz22ne.R.inc(4328);insertNode(el);
        __CLR4_2_037v37vlnxz22ne.R.inc(4329);if ((((onStack)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4330)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4331)==0&false)))
            {__CLR4_2_037v37vlnxz22ne.R.inc(4332);stack.add(el);
        }__CLR4_2_037v37vlnxz22ne.R.inc(4333);return el;
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    void insert(Token.Comment commentToken) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4334);
        __CLR4_2_037v37vlnxz22ne.R.inc(4335);Comment comment = new Comment(commentToken.getData());
        __CLR4_2_037v37vlnxz22ne.R.inc(4336);insertNode(comment);
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    void insert(Token.Character characterToken) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4337);
        __CLR4_2_037v37vlnxz22ne.R.inc(4338);final Node node;
        __CLR4_2_037v37vlnxz22ne.R.inc(4339);final Element el = currentElement();
        __CLR4_2_037v37vlnxz22ne.R.inc(4340);final String tagName = el.tagName();
        __CLR4_2_037v37vlnxz22ne.R.inc(4341);final String data = characterToken.getData();

        __CLR4_2_037v37vlnxz22ne.R.inc(4342);if ((((characterToken.isCData())&&(__CLR4_2_037v37vlnxz22ne.R.iget(4343)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4344)==0&false)))
            {__CLR4_2_037v37vlnxz22ne.R.inc(4345);node = new CDataNode(data);
        }else {__CLR4_2_037v37vlnxz22ne.R.inc(4346);if ((((tagName.equals("script") || tagName.equals("style"))&&(__CLR4_2_037v37vlnxz22ne.R.iget(4347)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4348)==0&false)))
            {__CLR4_2_037v37vlnxz22ne.R.inc(4349);node = new DataNode(data);
        }else
            {__CLR4_2_037v37vlnxz22ne.R.inc(4350);node = new TextNode(data);
        }}__CLR4_2_037v37vlnxz22ne.R.inc(4351);el.appendChild(node); // doesn't use insertNode, because we don't foster these; and will always have a stack.
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    private void insertNode(Node node) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4352);
        // if the stack hasn't been set up yet, elements (doctype, comments) go into the doc
        __CLR4_2_037v37vlnxz22ne.R.inc(4353);if ((((stack.isEmpty())&&(__CLR4_2_037v37vlnxz22ne.R.iget(4354)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4355)==0&false)))
            {__CLR4_2_037v37vlnxz22ne.R.inc(4356);doc.appendChild(node);
        }else {__CLR4_2_037v37vlnxz22ne.R.inc(4357);if ((((isFosterInserts())&&(__CLR4_2_037v37vlnxz22ne.R.iget(4358)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4359)==0&false)))
            {__CLR4_2_037v37vlnxz22ne.R.inc(4360);insertInFosterParent(node);
        }else
            {__CLR4_2_037v37vlnxz22ne.R.inc(4361);currentElement().appendChild(node);

        // connect form controls to their form element
        }}__CLR4_2_037v37vlnxz22ne.R.inc(4362);if ((((node instanceof Element && ((Element) node).tag().isFormListed())&&(__CLR4_2_037v37vlnxz22ne.R.iget(4363)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4364)==0&false))) {{
            __CLR4_2_037v37vlnxz22ne.R.inc(4365);if ((((formElement != null)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4366)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4367)==0&false)))
                {__CLR4_2_037v37vlnxz22ne.R.inc(4368);formElement.addElement((Element) node);
        }}
    }}finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    Element pop() {try{__CLR4_2_037v37vlnxz22ne.R.inc(4369);
        __CLR4_2_037v37vlnxz22ne.R.inc(4370);int size = stack.size();
        __CLR4_2_037v37vlnxz22ne.R.inc(4371);return stack.remove(size-1);
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    void push(Element element) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4372);
        __CLR4_2_037v37vlnxz22ne.R.inc(4373);stack.add(element);
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    ArrayList<Element> getStack() {try{__CLR4_2_037v37vlnxz22ne.R.inc(4374);
        __CLR4_2_037v37vlnxz22ne.R.inc(4375);return stack;
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    boolean onStack(Element el) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4376);
        __CLR4_2_037v37vlnxz22ne.R.inc(4377);return isElementInQueue(stack, el);
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    private boolean isElementInQueue(ArrayList<Element> queue, Element element) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4378);
        __CLR4_2_037v37vlnxz22ne.R.inc(4379);for (int pos = queue.size() -1; (((pos >= 0)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4380)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4381)==0&false)); pos--) {{
            __CLR4_2_037v37vlnxz22ne.R.inc(4382);Element next = queue.get(pos);
            __CLR4_2_037v37vlnxz22ne.R.inc(4383);if ((((next == element)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4384)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4385)==0&false))) {{
                __CLR4_2_037v37vlnxz22ne.R.inc(4386);return true;
            }
        }}
        }__CLR4_2_037v37vlnxz22ne.R.inc(4387);return false;
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    Element getFromStack(String elName) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4388);
        __CLR4_2_037v37vlnxz22ne.R.inc(4389);for (int pos = stack.size() -1; (((pos >= 0)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4390)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4391)==0&false)); pos--) {{
            __CLR4_2_037v37vlnxz22ne.R.inc(4392);Element next = stack.get(pos);
            __CLR4_2_037v37vlnxz22ne.R.inc(4393);if ((((next.normalName().equals(elName))&&(__CLR4_2_037v37vlnxz22ne.R.iget(4394)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4395)==0&false))) {{
                __CLR4_2_037v37vlnxz22ne.R.inc(4396);return next;
            }
        }}
        }__CLR4_2_037v37vlnxz22ne.R.inc(4397);return null;
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    boolean removeFromStack(Element el) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4398);
        __CLR4_2_037v37vlnxz22ne.R.inc(4399);for (int pos = stack.size() -1; (((pos >= 0)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4400)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4401)==0&false)); pos--) {{
            __CLR4_2_037v37vlnxz22ne.R.inc(4402);Element next = stack.get(pos);
            __CLR4_2_037v37vlnxz22ne.R.inc(4403);if ((((next == el)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4404)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4405)==0&false))) {{
                __CLR4_2_037v37vlnxz22ne.R.inc(4406);stack.remove(pos);
                __CLR4_2_037v37vlnxz22ne.R.inc(4407);return true;
            }
        }}
        }__CLR4_2_037v37vlnxz22ne.R.inc(4408);return false;
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    void popStackToClose(String elName) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4409);
        __CLR4_2_037v37vlnxz22ne.R.inc(4410);for (int pos = stack.size() -1; (((pos >= 0)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4411)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4412)==0&false)); pos--) {{
            __CLR4_2_037v37vlnxz22ne.R.inc(4413);Element next = stack.get(pos);
            __CLR4_2_037v37vlnxz22ne.R.inc(4414);stack.remove(pos);
            __CLR4_2_037v37vlnxz22ne.R.inc(4415);if ((((next.normalName().equals(elName))&&(__CLR4_2_037v37vlnxz22ne.R.iget(4416)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4417)==0&false)))
                {__CLR4_2_037v37vlnxz22ne.R.inc(4418);break;
        }}
    }}finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    // elnames is sorted, comes from Constants
    void popStackToClose(String... elNames) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4419);
        __CLR4_2_037v37vlnxz22ne.R.inc(4420);for (int pos = stack.size() -1; (((pos >= 0)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4421)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4422)==0&false)); pos--) {{
            __CLR4_2_037v37vlnxz22ne.R.inc(4423);Element next = stack.get(pos);
            __CLR4_2_037v37vlnxz22ne.R.inc(4424);stack.remove(pos);
            __CLR4_2_037v37vlnxz22ne.R.inc(4425);if ((((inSorted(next.normalName(), elNames))&&(__CLR4_2_037v37vlnxz22ne.R.iget(4426)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4427)==0&false)))
                {__CLR4_2_037v37vlnxz22ne.R.inc(4428);break;
        }}
    }}finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    void popStackToBefore(String elName) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4429);
        __CLR4_2_037v37vlnxz22ne.R.inc(4430);for (int pos = stack.size() -1; (((pos >= 0)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4431)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4432)==0&false)); pos--) {{
            __CLR4_2_037v37vlnxz22ne.R.inc(4433);Element next = stack.get(pos);
            __CLR4_2_037v37vlnxz22ne.R.inc(4434);if ((((next.normalName().equals(elName))&&(__CLR4_2_037v37vlnxz22ne.R.iget(4435)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4436)==0&false))) {{
                __CLR4_2_037v37vlnxz22ne.R.inc(4437);break;
            } }else {{
                __CLR4_2_037v37vlnxz22ne.R.inc(4438);stack.remove(pos);
            }
        }}
    }}finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    void clearStackToTableContext() {try{__CLR4_2_037v37vlnxz22ne.R.inc(4439);
        __CLR4_2_037v37vlnxz22ne.R.inc(4440);clearStackToContext("table");
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    void clearStackToTableBodyContext() {try{__CLR4_2_037v37vlnxz22ne.R.inc(4441);
        __CLR4_2_037v37vlnxz22ne.R.inc(4442);clearStackToContext("tbody", "tfoot", "thead", "template");
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    void clearStackToTableRowContext() {try{__CLR4_2_037v37vlnxz22ne.R.inc(4443);
        __CLR4_2_037v37vlnxz22ne.R.inc(4444);clearStackToContext("tr", "template");
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    private void clearStackToContext(String... nodeNames) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4445);
        __CLR4_2_037v37vlnxz22ne.R.inc(4446);for (int pos = stack.size() -1; (((pos >= 0)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4447)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4448)==0&false)); pos--) {{
            __CLR4_2_037v37vlnxz22ne.R.inc(4449);Element next = stack.get(pos);
            __CLR4_2_037v37vlnxz22ne.R.inc(4450);if ((((StringUtil.in(next.normalName(), nodeNames) || next.normalName().equals("html"))&&(__CLR4_2_037v37vlnxz22ne.R.iget(4451)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4452)==0&false)))
                {__CLR4_2_037v37vlnxz22ne.R.inc(4453);break;
            }else
                {__CLR4_2_037v37vlnxz22ne.R.inc(4454);stack.remove(pos);
        }}
    }}finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    Element aboveOnStack(Element el) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4455);
        assert (((onStack(el))&&(__CLR4_2_037v37vlnxz22ne.R.iget(4456)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4457)==0&false));
        __CLR4_2_037v37vlnxz22ne.R.inc(4458);for (int pos = stack.size() -1; (((pos >= 0)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4459)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4460)==0&false)); pos--) {{
            __CLR4_2_037v37vlnxz22ne.R.inc(4461);Element next = stack.get(pos);
            __CLR4_2_037v37vlnxz22ne.R.inc(4462);if ((((next == el)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4463)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4464)==0&false))) {{
                __CLR4_2_037v37vlnxz22ne.R.inc(4465);return stack.get(pos-1);
            }
        }}
        }__CLR4_2_037v37vlnxz22ne.R.inc(4466);return null;
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    void insertOnStackAfter(Element after, Element in) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4467);
        __CLR4_2_037v37vlnxz22ne.R.inc(4468);int i = stack.lastIndexOf(after);
        __CLR4_2_037v37vlnxz22ne.R.inc(4469);Validate.isTrue(i != -1);
        __CLR4_2_037v37vlnxz22ne.R.inc(4470);stack.add(i+1, in);
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    void replaceOnStack(Element out, Element in) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4471);
        __CLR4_2_037v37vlnxz22ne.R.inc(4472);replaceInQueue(stack, out, in);
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    private void replaceInQueue(ArrayList<Element> queue, Element out, Element in) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4473);
        __CLR4_2_037v37vlnxz22ne.R.inc(4474);int i = queue.lastIndexOf(out);
        __CLR4_2_037v37vlnxz22ne.R.inc(4475);Validate.isTrue(i != -1);
        __CLR4_2_037v37vlnxz22ne.R.inc(4476);queue.set(i, in);
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    void resetInsertionMode() {try{__CLR4_2_037v37vlnxz22ne.R.inc(4477);
        __CLR4_2_037v37vlnxz22ne.R.inc(4478);boolean last = false;
        __CLR4_2_037v37vlnxz22ne.R.inc(4479);for (int pos = stack.size() -1; (((pos >= 0)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4480)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4481)==0&false)); pos--) {{
            __CLR4_2_037v37vlnxz22ne.R.inc(4482);Element node = stack.get(pos);
            __CLR4_2_037v37vlnxz22ne.R.inc(4483);if ((((pos == 0)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4484)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4485)==0&false))) {{
                __CLR4_2_037v37vlnxz22ne.R.inc(4486);last = true;
                __CLR4_2_037v37vlnxz22ne.R.inc(4487);node = contextElement;
            }
            }__CLR4_2_037v37vlnxz22ne.R.inc(4488);String name = node.normalName();
            __CLR4_2_037v37vlnxz22ne.R.inc(4489);if (((("select".equals(name))&&(__CLR4_2_037v37vlnxz22ne.R.iget(4490)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4491)==0&false))) {{
                __CLR4_2_037v37vlnxz22ne.R.inc(4492);transition(HtmlTreeBuilderState.InSelect);
                __CLR4_2_037v37vlnxz22ne.R.inc(4493);break; // frag
            } }else {__CLR4_2_037v37vlnxz22ne.R.inc(4494);if ((((("td".equals(name) || "th".equals(name) && !last))&&(__CLR4_2_037v37vlnxz22ne.R.iget(4495)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4496)==0&false))) {{
                __CLR4_2_037v37vlnxz22ne.R.inc(4497);transition(HtmlTreeBuilderState.InCell);
                __CLR4_2_037v37vlnxz22ne.R.inc(4498);break;
            } }else {__CLR4_2_037v37vlnxz22ne.R.inc(4499);if (((("tr".equals(name))&&(__CLR4_2_037v37vlnxz22ne.R.iget(4500)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4501)==0&false))) {{
                __CLR4_2_037v37vlnxz22ne.R.inc(4502);transition(HtmlTreeBuilderState.InRow);
                __CLR4_2_037v37vlnxz22ne.R.inc(4503);break;
            } }else {__CLR4_2_037v37vlnxz22ne.R.inc(4504);if (((("tbody".equals(name) || "thead".equals(name) || "tfoot".equals(name))&&(__CLR4_2_037v37vlnxz22ne.R.iget(4505)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4506)==0&false))) {{
                __CLR4_2_037v37vlnxz22ne.R.inc(4507);transition(HtmlTreeBuilderState.InTableBody);
                __CLR4_2_037v37vlnxz22ne.R.inc(4508);break;
            } }else {__CLR4_2_037v37vlnxz22ne.R.inc(4509);if (((("caption".equals(name))&&(__CLR4_2_037v37vlnxz22ne.R.iget(4510)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4511)==0&false))) {{
                __CLR4_2_037v37vlnxz22ne.R.inc(4512);transition(HtmlTreeBuilderState.InCaption);
                __CLR4_2_037v37vlnxz22ne.R.inc(4513);break;
            } }else {__CLR4_2_037v37vlnxz22ne.R.inc(4514);if (((("colgroup".equals(name))&&(__CLR4_2_037v37vlnxz22ne.R.iget(4515)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4516)==0&false))) {{
                __CLR4_2_037v37vlnxz22ne.R.inc(4517);transition(HtmlTreeBuilderState.InColumnGroup);
                __CLR4_2_037v37vlnxz22ne.R.inc(4518);break; // frag
            } }else {__CLR4_2_037v37vlnxz22ne.R.inc(4519);if (((("table".equals(name))&&(__CLR4_2_037v37vlnxz22ne.R.iget(4520)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4521)==0&false))) {{
                __CLR4_2_037v37vlnxz22ne.R.inc(4522);transition(HtmlTreeBuilderState.InTable);
                __CLR4_2_037v37vlnxz22ne.R.inc(4523);break;
            } }else {__CLR4_2_037v37vlnxz22ne.R.inc(4524);if (((("head".equals(name))&&(__CLR4_2_037v37vlnxz22ne.R.iget(4525)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4526)==0&false))) {{
                __CLR4_2_037v37vlnxz22ne.R.inc(4527);transition(HtmlTreeBuilderState.InBody);
                __CLR4_2_037v37vlnxz22ne.R.inc(4528);break; // frag
            } }else {__CLR4_2_037v37vlnxz22ne.R.inc(4529);if (((("body".equals(name))&&(__CLR4_2_037v37vlnxz22ne.R.iget(4530)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4531)==0&false))) {{
                __CLR4_2_037v37vlnxz22ne.R.inc(4532);transition(HtmlTreeBuilderState.InBody);
                __CLR4_2_037v37vlnxz22ne.R.inc(4533);break;
            } }else {__CLR4_2_037v37vlnxz22ne.R.inc(4534);if (((("frameset".equals(name))&&(__CLR4_2_037v37vlnxz22ne.R.iget(4535)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4536)==0&false))) {{
                __CLR4_2_037v37vlnxz22ne.R.inc(4537);transition(HtmlTreeBuilderState.InFrameset);
                __CLR4_2_037v37vlnxz22ne.R.inc(4538);break; // frag
            } }else {__CLR4_2_037v37vlnxz22ne.R.inc(4539);if (((("html".equals(name))&&(__CLR4_2_037v37vlnxz22ne.R.iget(4540)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4541)==0&false))) {{
                __CLR4_2_037v37vlnxz22ne.R.inc(4542);transition(HtmlTreeBuilderState.BeforeHead);
                __CLR4_2_037v37vlnxz22ne.R.inc(4543);break; // frag
            } }else {__CLR4_2_037v37vlnxz22ne.R.inc(4544);if ((((last)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4545)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4546)==0&false))) {{
                __CLR4_2_037v37vlnxz22ne.R.inc(4547);transition(HtmlTreeBuilderState.InBody);
                __CLR4_2_037v37vlnxz22ne.R.inc(4548);break; // frag
            }
        }}}}}}}}}}}}}
    }}finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    // todo: tidy up in specific scope methods
    private String[] specificScopeTarget = {null};

    private boolean inSpecificScope(String targetName, String[] baseTypes, String[] extraTypes) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4549);
        __CLR4_2_037v37vlnxz22ne.R.inc(4550);specificScopeTarget[0] = targetName;
        __CLR4_2_037v37vlnxz22ne.R.inc(4551);return inSpecificScope(specificScopeTarget, baseTypes, extraTypes);
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    private boolean inSpecificScope(String[] targetNames, String[] baseTypes, String[] extraTypes) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4552);
        // https://html.spec.whatwg.org/multipage/parsing.html#has-an-element-in-the-specific-scope
        __CLR4_2_037v37vlnxz22ne.R.inc(4553);final int bottom = stack.size() -1;
        __CLR4_2_037v37vlnxz22ne.R.inc(4554);final int top = (((bottom > MaxScopeSearchDepth )&&(__CLR4_2_037v37vlnxz22ne.R.iget(4555)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4556)==0&false))? bottom - MaxScopeSearchDepth : 0;
        // don't walk too far up the tree

        __CLR4_2_037v37vlnxz22ne.R.inc(4557);for (int pos = bottom; (((pos >= top)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4558)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4559)==0&false)); pos--) {{
            __CLR4_2_037v37vlnxz22ne.R.inc(4560);final String elName = stack.get(pos).normalName();
            __CLR4_2_037v37vlnxz22ne.R.inc(4561);if ((((inSorted(elName, targetNames))&&(__CLR4_2_037v37vlnxz22ne.R.iget(4562)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4563)==0&false)))
                {__CLR4_2_037v37vlnxz22ne.R.inc(4564);return true;
            }__CLR4_2_037v37vlnxz22ne.R.inc(4565);if ((((inSorted(elName, baseTypes))&&(__CLR4_2_037v37vlnxz22ne.R.iget(4566)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4567)==0&false)))
                {__CLR4_2_037v37vlnxz22ne.R.inc(4568);return false;
            }__CLR4_2_037v37vlnxz22ne.R.inc(4569);if ((((extraTypes != null && inSorted(elName, extraTypes))&&(__CLR4_2_037v37vlnxz22ne.R.iget(4570)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4571)==0&false)))
                {__CLR4_2_037v37vlnxz22ne.R.inc(4572);return false;
        }}
        //Validate.fail("Should not be reachable"); // would end up false because hitting 'html' at root (basetypes)
        }__CLR4_2_037v37vlnxz22ne.R.inc(4573);return false;
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    boolean inScope(String[] targetNames) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4574);
        __CLR4_2_037v37vlnxz22ne.R.inc(4575);return inSpecificScope(targetNames, TagsSearchInScope, null);
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    boolean inScope(String targetName) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4576);
        __CLR4_2_037v37vlnxz22ne.R.inc(4577);return inScope(targetName, null);
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    boolean inScope(String targetName, String[] extras) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4578);
        __CLR4_2_037v37vlnxz22ne.R.inc(4579);return inSpecificScope(targetName, TagsSearchInScope, extras);
        // todo: in mathml namespace: mi, mo, mn, ms, mtext annotation-xml
        // todo: in svg namespace: forignOjbect, desc, title
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    boolean inListItemScope(String targetName) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4580);
        __CLR4_2_037v37vlnxz22ne.R.inc(4581);return inScope(targetName, TagSearchList);
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    boolean inButtonScope(String targetName) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4582);
        __CLR4_2_037v37vlnxz22ne.R.inc(4583);return inScope(targetName, TagSearchButton);
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    boolean inTableScope(String targetName) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4584);
        __CLR4_2_037v37vlnxz22ne.R.inc(4585);return inSpecificScope(targetName, TagSearchTableScope, null);
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    boolean inSelectScope(String targetName) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4586);
        __CLR4_2_037v37vlnxz22ne.R.inc(4587);for (int pos = stack.size() -1; (((pos >= 0)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4588)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4589)==0&false)); pos--) {{
            __CLR4_2_037v37vlnxz22ne.R.inc(4590);Element el = stack.get(pos);
            __CLR4_2_037v37vlnxz22ne.R.inc(4591);String elName = el.normalName();
            __CLR4_2_037v37vlnxz22ne.R.inc(4592);if ((((elName.equals(targetName))&&(__CLR4_2_037v37vlnxz22ne.R.iget(4593)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4594)==0&false)))
                {__CLR4_2_037v37vlnxz22ne.R.inc(4595);return true;
            }__CLR4_2_037v37vlnxz22ne.R.inc(4596);if ((((!inSorted(elName, TagSearchSelectScope))&&(__CLR4_2_037v37vlnxz22ne.R.iget(4597)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4598)==0&false))) // all elements except
                {__CLR4_2_037v37vlnxz22ne.R.inc(4599);return false;
        }}
        }__CLR4_2_037v37vlnxz22ne.R.inc(4600);Validate.fail("Should not be reachable");
        __CLR4_2_037v37vlnxz22ne.R.inc(4601);return false;
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    void setHeadElement(Element headElement) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4602);
        __CLR4_2_037v37vlnxz22ne.R.inc(4603);this.headElement = headElement;
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    Element getHeadElement() {try{__CLR4_2_037v37vlnxz22ne.R.inc(4604);
        __CLR4_2_037v37vlnxz22ne.R.inc(4605);return headElement;
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    boolean isFosterInserts() {try{__CLR4_2_037v37vlnxz22ne.R.inc(4606);
        __CLR4_2_037v37vlnxz22ne.R.inc(4607);return fosterInserts;
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    void setFosterInserts(boolean fosterInserts) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4608);
        __CLR4_2_037v37vlnxz22ne.R.inc(4609);this.fosterInserts = fosterInserts;
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    FormElement getFormElement() {try{__CLR4_2_037v37vlnxz22ne.R.inc(4610);
        __CLR4_2_037v37vlnxz22ne.R.inc(4611);return formElement;
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    void setFormElement(FormElement formElement) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4612);
        __CLR4_2_037v37vlnxz22ne.R.inc(4613);this.formElement = formElement;
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    void newPendingTableCharacters() {try{__CLR4_2_037v37vlnxz22ne.R.inc(4614);
        __CLR4_2_037v37vlnxz22ne.R.inc(4615);pendingTableCharacters = new ArrayList<>();
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    List<String> getPendingTableCharacters() {try{__CLR4_2_037v37vlnxz22ne.R.inc(4616);
        __CLR4_2_037v37vlnxz22ne.R.inc(4617);return pendingTableCharacters;
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    /**
     11.2.5.2 Closing elements that have implied end tags<p/>
     When the steps below require the UA to generate implied end tags, then, while the current node is a dd element, a
     dt element, an li element, an option element, an optgroup element, a p element, an rp element, or an rt element,
     the UA must pop the current node off the stack of open elements.

     @param excludeTag If a step requires the UA to generate implied end tags but lists an element to exclude from the
     process, then the UA must perform the above steps as if that element was not in the above list.
     */
    void generateImpliedEndTags(String excludeTag) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4618);
        __CLR4_2_037v37vlnxz22ne.R.inc(4619);while (((((excludeTag != null && !currentElement().normalName().equals(excludeTag)) &&
                inSorted(currentElement().normalName(), TagSearchEndTags))&&(__CLR4_2_037v37vlnxz22ne.R.iget(4620)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4621)==0&false)))
            {__CLR4_2_037v37vlnxz22ne.R.inc(4622);pop();
    }}finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    void generateImpliedEndTags() {try{__CLR4_2_037v37vlnxz22ne.R.inc(4623);
        __CLR4_2_037v37vlnxz22ne.R.inc(4624);generateImpliedEndTags(null);
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    boolean isSpecial(Element el) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4625);
        // todo: mathml's mi, mo, mn
        // todo: svg's foreigObject, desc, title
        __CLR4_2_037v37vlnxz22ne.R.inc(4626);String name = el.normalName();
        __CLR4_2_037v37vlnxz22ne.R.inc(4627);return inSorted(name, TagSearchSpecial);
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    Element lastFormattingElement() {try{__CLR4_2_037v37vlnxz22ne.R.inc(4628);
        __CLR4_2_037v37vlnxz22ne.R.inc(4629);return (((formattingElements.size() > 0 )&&(__CLR4_2_037v37vlnxz22ne.R.iget(4630)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4631)==0&false))? formattingElements.get(formattingElements.size()-1) : null;
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    Element removeLastFormattingElement() {try{__CLR4_2_037v37vlnxz22ne.R.inc(4632);
        __CLR4_2_037v37vlnxz22ne.R.inc(4633);int size = formattingElements.size();
        __CLR4_2_037v37vlnxz22ne.R.inc(4634);if ((((size > 0)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4635)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4636)==0&false)))
            {__CLR4_2_037v37vlnxz22ne.R.inc(4637);return formattingElements.remove(size-1);
        }else
            {__CLR4_2_037v37vlnxz22ne.R.inc(4638);return null;
    }}finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    // active formatting elements
    void pushActiveFormattingElements(Element in) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4639);
        __CLR4_2_037v37vlnxz22ne.R.inc(4640);int numSeen = 0;
        __CLR4_2_037v37vlnxz22ne.R.inc(4641);for (int pos = formattingElements.size() -1; (((pos >= 0)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4642)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4643)==0&false)); pos--) {{
            __CLR4_2_037v37vlnxz22ne.R.inc(4644);Element el = formattingElements.get(pos);
            __CLR4_2_037v37vlnxz22ne.R.inc(4645);if ((((el == null)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4646)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4647)==0&false))) // marker
                {__CLR4_2_037v37vlnxz22ne.R.inc(4648);break;

            }__CLR4_2_037v37vlnxz22ne.R.inc(4649);if ((((isSameFormattingElement(in, el))&&(__CLR4_2_037v37vlnxz22ne.R.iget(4650)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4651)==0&false)))
                {__CLR4_2_037v37vlnxz22ne.R.inc(4652);numSeen++;

            }__CLR4_2_037v37vlnxz22ne.R.inc(4653);if ((((numSeen == 3)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4654)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4655)==0&false))) {{
                __CLR4_2_037v37vlnxz22ne.R.inc(4656);formattingElements.remove(pos);
                __CLR4_2_037v37vlnxz22ne.R.inc(4657);break;
            }
        }}
        }__CLR4_2_037v37vlnxz22ne.R.inc(4658);formattingElements.add(in);
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    private boolean isSameFormattingElement(Element a, Element b) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4659);
        // same if: same namespace, tag, and attributes. Element.equals only checks tag, might in future check children
        __CLR4_2_037v37vlnxz22ne.R.inc(4660);return a.normalName().equals(b.normalName()) &&
                // a.namespace().equals(b.namespace()) &&
                a.attributes().equals(b.attributes());
        // todo: namespaces
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    void reconstructFormattingElements() {try{__CLR4_2_037v37vlnxz22ne.R.inc(4661);
        __CLR4_2_037v37vlnxz22ne.R.inc(4662);Element last = lastFormattingElement();
        __CLR4_2_037v37vlnxz22ne.R.inc(4663);if ((((last == null || onStack(last))&&(__CLR4_2_037v37vlnxz22ne.R.iget(4664)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4665)==0&false)))
            {__CLR4_2_037v37vlnxz22ne.R.inc(4666);return;

        }__CLR4_2_037v37vlnxz22ne.R.inc(4667);Element entry = last;
        __CLR4_2_037v37vlnxz22ne.R.inc(4668);int size = formattingElements.size();
        __CLR4_2_037v37vlnxz22ne.R.inc(4669);int pos = size - 1;
        __CLR4_2_037v37vlnxz22ne.R.inc(4670);boolean skip = false;
        __CLR4_2_037v37vlnxz22ne.R.inc(4671);while (true) {{
            __CLR4_2_037v37vlnxz22ne.R.inc(4672);if ((((pos == 0)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4673)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4674)==0&false))) {{ // step 4. if none before, skip to 8
                __CLR4_2_037v37vlnxz22ne.R.inc(4675);skip = true;
                __CLR4_2_037v37vlnxz22ne.R.inc(4676);break;
            }
            }__CLR4_2_037v37vlnxz22ne.R.inc(4677);entry = formattingElements.get(--pos); // step 5. one earlier than entry
            __CLR4_2_037v37vlnxz22ne.R.inc(4678);if ((((entry == null || onStack(entry))&&(__CLR4_2_037v37vlnxz22ne.R.iget(4679)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4680)==0&false))) // step 6 - neither marker nor on stack
                {__CLR4_2_037v37vlnxz22ne.R.inc(4681);break; // jump to 8, else continue back to 4
        }}
        }__CLR4_2_037v37vlnxz22ne.R.inc(4682);while(true) {{
            __CLR4_2_037v37vlnxz22ne.R.inc(4683);if ((((!skip)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4684)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4685)==0&false))) // step 7: on later than entry
                {__CLR4_2_037v37vlnxz22ne.R.inc(4686);entry = formattingElements.get(++pos);
            }__CLR4_2_037v37vlnxz22ne.R.inc(4687);Validate.notNull(entry); // should not occur, as we break at last element

            // 8. create new element from element, 9 insert into current node, onto stack
            __CLR4_2_037v37vlnxz22ne.R.inc(4688);skip = false; // can only skip increment from 4.
            __CLR4_2_037v37vlnxz22ne.R.inc(4689);Element newEl = insertStartTag(entry.normalName()); // todo: avoid fostering here?
            // newEl.namespace(entry.namespace()); // todo: namespaces
            __CLR4_2_037v37vlnxz22ne.R.inc(4690);newEl.attributes().addAll(entry.attributes());

            // 10. replace entry with new entry
            __CLR4_2_037v37vlnxz22ne.R.inc(4691);formattingElements.set(pos, newEl);

            // 11
            __CLR4_2_037v37vlnxz22ne.R.inc(4692);if ((((pos == size-1)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4693)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4694)==0&false))) // if not last entry in list, jump to 7
                {__CLR4_2_037v37vlnxz22ne.R.inc(4695);break;
        }}
    }}finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    void clearFormattingElementsToLastMarker() {try{__CLR4_2_037v37vlnxz22ne.R.inc(4696);
        __CLR4_2_037v37vlnxz22ne.R.inc(4697);while ((((!formattingElements.isEmpty())&&(__CLR4_2_037v37vlnxz22ne.R.iget(4698)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4699)==0&false))) {{
            __CLR4_2_037v37vlnxz22ne.R.inc(4700);Element el = removeLastFormattingElement();
            __CLR4_2_037v37vlnxz22ne.R.inc(4701);if ((((el == null)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4702)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4703)==0&false)))
                {__CLR4_2_037v37vlnxz22ne.R.inc(4704);break;
        }}
    }}finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    void removeFromActiveFormattingElements(Element el) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4705);
        __CLR4_2_037v37vlnxz22ne.R.inc(4706);for (int pos = formattingElements.size() -1; (((pos >= 0)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4707)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4708)==0&false)); pos--) {{
            __CLR4_2_037v37vlnxz22ne.R.inc(4709);Element next = formattingElements.get(pos);
            __CLR4_2_037v37vlnxz22ne.R.inc(4710);if ((((next == el)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4711)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4712)==0&false))) {{
                __CLR4_2_037v37vlnxz22ne.R.inc(4713);formattingElements.remove(pos);
                __CLR4_2_037v37vlnxz22ne.R.inc(4714);break;
            }
        }}
    }}finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    boolean isInActiveFormattingElements(Element el) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4715);
        __CLR4_2_037v37vlnxz22ne.R.inc(4716);return isElementInQueue(formattingElements, el);
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    Element getActiveFormattingElement(String nodeName) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4717);
        __CLR4_2_037v37vlnxz22ne.R.inc(4718);for (int pos = formattingElements.size() -1; (((pos >= 0)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4719)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4720)==0&false)); pos--) {{
            __CLR4_2_037v37vlnxz22ne.R.inc(4721);Element next = formattingElements.get(pos);
            __CLR4_2_037v37vlnxz22ne.R.inc(4722);if ((((next == null)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4723)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4724)==0&false))) // scope marker
                {__CLR4_2_037v37vlnxz22ne.R.inc(4725);break;
            }else {__CLR4_2_037v37vlnxz22ne.R.inc(4726);if ((((next.normalName().equals(nodeName))&&(__CLR4_2_037v37vlnxz22ne.R.iget(4727)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4728)==0&false)))
                {__CLR4_2_037v37vlnxz22ne.R.inc(4729);return next;
        }}}
        }__CLR4_2_037v37vlnxz22ne.R.inc(4730);return null;
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    void replaceActiveFormattingElement(Element out, Element in) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4731);
        __CLR4_2_037v37vlnxz22ne.R.inc(4732);replaceInQueue(formattingElements, out, in);
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    void insertMarkerToFormattingElements() {try{__CLR4_2_037v37vlnxz22ne.R.inc(4733);
        __CLR4_2_037v37vlnxz22ne.R.inc(4734);formattingElements.add(null);
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    void insertInFosterParent(Node in) {try{__CLR4_2_037v37vlnxz22ne.R.inc(4735);
        __CLR4_2_037v37vlnxz22ne.R.inc(4736);Element fosterParent;
        __CLR4_2_037v37vlnxz22ne.R.inc(4737);Element lastTable = getFromStack("table");
        __CLR4_2_037v37vlnxz22ne.R.inc(4738);boolean isLastTableParent = false;
        __CLR4_2_037v37vlnxz22ne.R.inc(4739);if ((((lastTable != null)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4740)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4741)==0&false))) {{
            __CLR4_2_037v37vlnxz22ne.R.inc(4742);if ((((lastTable.parent() != null)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4743)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4744)==0&false))) {{
                __CLR4_2_037v37vlnxz22ne.R.inc(4745);fosterParent = lastTable.parent();
                __CLR4_2_037v37vlnxz22ne.R.inc(4746);isLastTableParent = true;
            } }else
                {__CLR4_2_037v37vlnxz22ne.R.inc(4747);fosterParent = aboveOnStack(lastTable);
        }} }else {{ // no table == frag
            __CLR4_2_037v37vlnxz22ne.R.inc(4748);fosterParent = stack.get(0);
        }

        }__CLR4_2_037v37vlnxz22ne.R.inc(4749);if ((((isLastTableParent)&&(__CLR4_2_037v37vlnxz22ne.R.iget(4750)!=0|true))||(__CLR4_2_037v37vlnxz22ne.R.iget(4751)==0&false))) {{
            __CLR4_2_037v37vlnxz22ne.R.inc(4752);Validate.notNull(lastTable); // last table cannot be null by this point.
            __CLR4_2_037v37vlnxz22ne.R.inc(4753);lastTable.before(in);
        }
        }else
            {__CLR4_2_037v37vlnxz22ne.R.inc(4754);fosterParent.appendChild(in);
    }}finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_2_037v37vlnxz22ne.R.inc(4755);
        __CLR4_2_037v37vlnxz22ne.R.inc(4756);return "TreeBuilder{" +
                "currentToken=" + currentToken +
                ", state=" + state +
                ", currentElement=" + currentElement() +
                '}';
    }finally{__CLR4_2_037v37vlnxz22ne.R.flushNeeded();}}
}
