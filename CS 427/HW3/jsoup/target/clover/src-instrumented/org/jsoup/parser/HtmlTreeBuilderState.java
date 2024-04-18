/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.parser;

import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import java.util.ArrayList;

/**
 * The Tree Builder's current state. Each state embodies the processing for the state, and transitions to other states.
 */
@java.lang.SuppressWarnings({"fallthrough"}) enum HtmlTreeBuilderState {
    Initial {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_03o53o5lnxz22of.R.inc(4757);
            __CLR4_2_03o53o5lnxz22of.R.inc(4758);if ((((isWhitespace(t))&&(__CLR4_2_03o53o5lnxz22of.R.iget(4759)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4760)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(4761);return true; // ignore whitespace
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(4762);if ((((t.isComment())&&(__CLR4_2_03o53o5lnxz22of.R.iget(4763)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4764)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(4765);tb.insert(t.asComment());
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(4766);if ((((t.isDoctype())&&(__CLR4_2_03o53o5lnxz22of.R.iget(4767)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4768)==0&false))) {{
                // todo: parse error check on expected doctypes
                // todo: quirk state check on doctype ids
                __CLR4_2_03o53o5lnxz22of.R.inc(4769);Token.Doctype d = t.asDoctype();
                __CLR4_2_03o53o5lnxz22of.R.inc(4770);DocumentType doctype = new DocumentType(
                    tb.settings.normalizeTag(d.getName()), d.getPublicIdentifier(), d.getSystemIdentifier());
                __CLR4_2_03o53o5lnxz22of.R.inc(4771);doctype.setPubSysKey(d.getPubSysKey());
                __CLR4_2_03o53o5lnxz22of.R.inc(4772);tb.getDocument().appendChild(doctype);
                __CLR4_2_03o53o5lnxz22of.R.inc(4773);if ((((d.isForceQuirks())&&(__CLR4_2_03o53o5lnxz22of.R.iget(4774)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4775)==0&false)))
                    {__CLR4_2_03o53o5lnxz22of.R.inc(4776);tb.getDocument().quirksMode(Document.QuirksMode.quirks);
                }__CLR4_2_03o53o5lnxz22of.R.inc(4777);tb.transition(BeforeHtml);
            } }else {{
                // todo: check not iframe srcdoc
                __CLR4_2_03o53o5lnxz22of.R.inc(4778);tb.transition(BeforeHtml);
                __CLR4_2_03o53o5lnxz22of.R.inc(4779);return tb.process(t); // re-process token
            }
            }}}__CLR4_2_03o53o5lnxz22of.R.inc(4780);return true;
        }finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}
    },
    BeforeHtml {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_03o53o5lnxz22of.R.inc(4781);
            __CLR4_2_03o53o5lnxz22of.R.inc(4782);if ((((t.isDoctype())&&(__CLR4_2_03o53o5lnxz22of.R.iget(4783)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4784)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(4785);tb.error(this);
                __CLR4_2_03o53o5lnxz22of.R.inc(4786);return false;
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(4787);if ((((t.isComment())&&(__CLR4_2_03o53o5lnxz22of.R.iget(4788)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4789)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(4790);tb.insert(t.asComment());
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(4791);if ((((isWhitespace(t))&&(__CLR4_2_03o53o5lnxz22of.R.iget(4792)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4793)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(4794);return true; // ignore whitespace
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(4795);if ((((t.isStartTag() && t.asStartTag().normalName().equals("html"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(4796)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4797)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(4798);tb.insert(t.asStartTag());
                __CLR4_2_03o53o5lnxz22of.R.inc(4799);tb.transition(BeforeHead);
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(4800);if ((((t.isEndTag() && (StringUtil.in(t.asEndTag().normalName(), "head", "body", "html", "br")))&&(__CLR4_2_03o53o5lnxz22of.R.iget(4801)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4802)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(4803);return anythingElse(t, tb);
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(4804);if ((((t.isEndTag())&&(__CLR4_2_03o53o5lnxz22of.R.iget(4805)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4806)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(4807);tb.error(this);
                __CLR4_2_03o53o5lnxz22of.R.inc(4808);return false;
            } }else {{
                __CLR4_2_03o53o5lnxz22of.R.inc(4809);return anythingElse(t, tb);
            }
            }}}}}}__CLR4_2_03o53o5lnxz22of.R.inc(4810);return true;
        }finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}

        private boolean anythingElse(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_03o53o5lnxz22of.R.inc(4811);
            __CLR4_2_03o53o5lnxz22of.R.inc(4812);tb.insertStartTag("html");
            __CLR4_2_03o53o5lnxz22of.R.inc(4813);tb.transition(BeforeHead);
            __CLR4_2_03o53o5lnxz22of.R.inc(4814);return tb.process(t);
        }finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}
    },
    BeforeHead {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_03o53o5lnxz22of.R.inc(4815);
            __CLR4_2_03o53o5lnxz22of.R.inc(4816);if ((((isWhitespace(t))&&(__CLR4_2_03o53o5lnxz22of.R.iget(4817)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4818)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(4819);return true;
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(4820);if ((((t.isComment())&&(__CLR4_2_03o53o5lnxz22of.R.iget(4821)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4822)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(4823);tb.insert(t.asComment());
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(4824);if ((((t.isDoctype())&&(__CLR4_2_03o53o5lnxz22of.R.iget(4825)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4826)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(4827);tb.error(this);
                __CLR4_2_03o53o5lnxz22of.R.inc(4828);return false;
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(4829);if ((((t.isStartTag() && t.asStartTag().normalName().equals("html"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(4830)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4831)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(4832);return InBody.process(t, tb); // does not transition
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(4833);if ((((t.isStartTag() && t.asStartTag().normalName().equals("head"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(4834)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4835)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(4836);Element head = tb.insert(t.asStartTag());
                __CLR4_2_03o53o5lnxz22of.R.inc(4837);tb.setHeadElement(head);
                __CLR4_2_03o53o5lnxz22of.R.inc(4838);tb.transition(InHead);
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(4839);if ((((t.isEndTag() && (StringUtil.in(t.asEndTag().normalName(), "head", "body", "html", "br")))&&(__CLR4_2_03o53o5lnxz22of.R.iget(4840)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4841)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(4842);tb.processStartTag("head");
                __CLR4_2_03o53o5lnxz22of.R.inc(4843);return tb.process(t);
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(4844);if ((((t.isEndTag())&&(__CLR4_2_03o53o5lnxz22of.R.iget(4845)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4846)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(4847);tb.error(this);
                __CLR4_2_03o53o5lnxz22of.R.inc(4848);return false;
            } }else {{
                __CLR4_2_03o53o5lnxz22of.R.inc(4849);tb.processStartTag("head");
                __CLR4_2_03o53o5lnxz22of.R.inc(4850);return tb.process(t);
            }
            }}}}}}}__CLR4_2_03o53o5lnxz22of.R.inc(4851);return true;
        }finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}
    },
    InHead {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_03o53o5lnxz22of.R.inc(4852);
            __CLR4_2_03o53o5lnxz22of.R.inc(4853);if ((((isWhitespace(t))&&(__CLR4_2_03o53o5lnxz22of.R.iget(4854)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4855)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(4856);tb.insert(t.asCharacter());
                __CLR4_2_03o53o5lnxz22of.R.inc(4857);return true;
            }
            }boolean __CLB4_2_0_bool0=false;__CLR4_2_03o53o5lnxz22of.R.inc(4858);switch (t.type) {
                case Comment:if (!__CLB4_2_0_bool0) {__CLR4_2_03o53o5lnxz22of.R.inc(4859);__CLB4_2_0_bool0=true;}
                    __CLR4_2_03o53o5lnxz22of.R.inc(4860);tb.insert(t.asComment());
                    __CLR4_2_03o53o5lnxz22of.R.inc(4861);break;
                case Doctype:if (!__CLB4_2_0_bool0) {__CLR4_2_03o53o5lnxz22of.R.inc(4862);__CLB4_2_0_bool0=true;}
                    __CLR4_2_03o53o5lnxz22of.R.inc(4863);tb.error(this);
                    __CLR4_2_03o53o5lnxz22of.R.inc(4864);return false;
                case StartTag:if (!__CLB4_2_0_bool0) {__CLR4_2_03o53o5lnxz22of.R.inc(4865);__CLB4_2_0_bool0=true;}
                    __CLR4_2_03o53o5lnxz22of.R.inc(4866);Token.StartTag start = t.asStartTag();
                    __CLR4_2_03o53o5lnxz22of.R.inc(4867);String name = start.normalName();
                    __CLR4_2_03o53o5lnxz22of.R.inc(4868);if ((((name.equals("html"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(4869)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4870)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(4871);return InBody.process(t, tb);
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(4872);if ((((StringUtil.in(name, "base", "basefont", "bgsound", "command", "link"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(4873)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4874)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(4875);Element el = tb.insertEmpty(start);
                        // jsoup special: update base the frist time it is seen
                        __CLR4_2_03o53o5lnxz22of.R.inc(4876);if ((((name.equals("base") && el.hasAttr("href"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(4877)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4878)==0&false)))
                            {__CLR4_2_03o53o5lnxz22of.R.inc(4879);tb.maybeSetBaseUri(el);
                    }} }else {__CLR4_2_03o53o5lnxz22of.R.inc(4880);if ((((name.equals("meta"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(4881)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4882)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(4883);Element meta = tb.insertEmpty(start);
                        // todo: charset switches
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(4884);if ((((name.equals("title"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(4885)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4886)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(4887);handleRcData(start, tb);
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(4888);if ((((StringUtil.in(name, "noframes", "style"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(4889)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4890)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(4891);handleRawtext(start, tb);
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(4892);if ((((name.equals("noscript"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(4893)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4894)==0&false))) {{
                        // else if noscript && scripting flag = true: rawtext (jsoup doesn't run script, to handle as noscript)
                        __CLR4_2_03o53o5lnxz22of.R.inc(4895);tb.insert(start);
                        __CLR4_2_03o53o5lnxz22of.R.inc(4896);tb.transition(InHeadNoscript);
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(4897);if ((((name.equals("script"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(4898)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4899)==0&false))) {{
                        // skips some script rules as won't execute them

                        __CLR4_2_03o53o5lnxz22of.R.inc(4900);tb.tokeniser.transition(TokeniserState.ScriptData);
                        __CLR4_2_03o53o5lnxz22of.R.inc(4901);tb.markInsertionMode();
                        __CLR4_2_03o53o5lnxz22of.R.inc(4902);tb.transition(Text);
                        __CLR4_2_03o53o5lnxz22of.R.inc(4903);tb.insert(start);
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(4904);if ((((name.equals("head"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(4905)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4906)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(4907);tb.error(this);
                        __CLR4_2_03o53o5lnxz22of.R.inc(4908);return false;
                    } }else {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(4909);return anythingElse(t, tb);
                    }
                    }}}}}}}}__CLR4_2_03o53o5lnxz22of.R.inc(4910);break;
                case EndTag:if (!__CLB4_2_0_bool0) {__CLR4_2_03o53o5lnxz22of.R.inc(4911);__CLB4_2_0_bool0=true;}
                    __CLR4_2_03o53o5lnxz22of.R.inc(4912);Token.EndTag end = t.asEndTag();
                    __CLR4_2_03o53o5lnxz22of.R.inc(4913);name = end.normalName();
                    __CLR4_2_03o53o5lnxz22of.R.inc(4914);if ((((name.equals("head"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(4915)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4916)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(4917);tb.pop();
                        __CLR4_2_03o53o5lnxz22of.R.inc(4918);tb.transition(AfterHead);
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(4919);if ((((StringUtil.in(name, "body", "html", "br"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(4920)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4921)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(4922);return anythingElse(t, tb);
                    } }else {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(4923);tb.error(this);
                        __CLR4_2_03o53o5lnxz22of.R.inc(4924);return false;
                    }
                    }}__CLR4_2_03o53o5lnxz22of.R.inc(4925);break;
                default:if (!__CLB4_2_0_bool0) {__CLR4_2_03o53o5lnxz22of.R.inc(4926);__CLB4_2_0_bool0=true;}
                    __CLR4_2_03o53o5lnxz22of.R.inc(4927);return anythingElse(t, tb);
            }
            __CLR4_2_03o53o5lnxz22of.R.inc(4928);return true;
        }finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}

        private boolean anythingElse(Token t, TreeBuilder tb) {try{__CLR4_2_03o53o5lnxz22of.R.inc(4929);
            __CLR4_2_03o53o5lnxz22of.R.inc(4930);tb.processEndTag("head");
            __CLR4_2_03o53o5lnxz22of.R.inc(4931);return tb.process(t);
        }finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}
    },
    InHeadNoscript {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_03o53o5lnxz22of.R.inc(4932);
            __CLR4_2_03o53o5lnxz22of.R.inc(4933);if ((((t.isDoctype())&&(__CLR4_2_03o53o5lnxz22of.R.iget(4934)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4935)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(4936);tb.error(this);
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(4937);if ((((t.isStartTag() && t.asStartTag().normalName().equals("html"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(4938)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4939)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(4940);return tb.process(t, InBody);
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(4941);if ((((t.isEndTag() && t.asEndTag().normalName().equals("noscript"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(4942)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4943)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(4944);tb.pop();
                __CLR4_2_03o53o5lnxz22of.R.inc(4945);tb.transition(InHead);
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(4946);if ((((isWhitespace(t) || t.isComment() || (t.isStartTag() && StringUtil.in(t.asStartTag().normalName(),
                    "basefont", "bgsound", "link", "meta", "noframes", "style")))&&(__CLR4_2_03o53o5lnxz22of.R.iget(4947)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4948)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(4949);return tb.process(t, InHead);
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(4950);if ((((t.isEndTag() && t.asEndTag().normalName().equals("br"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(4951)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4952)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(4953);return anythingElse(t, tb);
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(4954);if (((((t.isStartTag() && StringUtil.in(t.asStartTag().normalName(), "head", "noscript")) || t.isEndTag())&&(__CLR4_2_03o53o5lnxz22of.R.iget(4955)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4956)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(4957);tb.error(this);
                __CLR4_2_03o53o5lnxz22of.R.inc(4958);return false;
            } }else {{
                __CLR4_2_03o53o5lnxz22of.R.inc(4959);return anythingElse(t, tb);
            }
            }}}}}}__CLR4_2_03o53o5lnxz22of.R.inc(4960);return true;
        }finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}

        private boolean anythingElse(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_03o53o5lnxz22of.R.inc(4961);
            __CLR4_2_03o53o5lnxz22of.R.inc(4962);tb.error(this);
            __CLR4_2_03o53o5lnxz22of.R.inc(4963);tb.insert(new Token.Character().data(t.toString()));
            __CLR4_2_03o53o5lnxz22of.R.inc(4964);return true;
        }finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}
    },
    AfterHead {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_03o53o5lnxz22of.R.inc(4965);
            __CLR4_2_03o53o5lnxz22of.R.inc(4966);if ((((isWhitespace(t))&&(__CLR4_2_03o53o5lnxz22of.R.iget(4967)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4968)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(4969);tb.insert(t.asCharacter());
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(4970);if ((((t.isComment())&&(__CLR4_2_03o53o5lnxz22of.R.iget(4971)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4972)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(4973);tb.insert(t.asComment());
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(4974);if ((((t.isDoctype())&&(__CLR4_2_03o53o5lnxz22of.R.iget(4975)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4976)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(4977);tb.error(this);
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(4978);if ((((t.isStartTag())&&(__CLR4_2_03o53o5lnxz22of.R.iget(4979)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4980)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(4981);Token.StartTag startTag = t.asStartTag();
                __CLR4_2_03o53o5lnxz22of.R.inc(4982);String name = startTag.normalName();
                __CLR4_2_03o53o5lnxz22of.R.inc(4983);if ((((name.equals("html"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(4984)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4985)==0&false))) {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(4986);return tb.process(t, InBody);
                } }else {__CLR4_2_03o53o5lnxz22of.R.inc(4987);if ((((name.equals("body"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(4988)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4989)==0&false))) {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(4990);tb.insert(startTag);
                    __CLR4_2_03o53o5lnxz22of.R.inc(4991);tb.framesetOk(false);
                    __CLR4_2_03o53o5lnxz22of.R.inc(4992);tb.transition(InBody);
                } }else {__CLR4_2_03o53o5lnxz22of.R.inc(4993);if ((((name.equals("frameset"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(4994)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(4995)==0&false))) {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(4996);tb.insert(startTag);
                    __CLR4_2_03o53o5lnxz22of.R.inc(4997);tb.transition(InFrameset);
                } }else {__CLR4_2_03o53o5lnxz22of.R.inc(4998);if ((((StringUtil.in(name, "base", "basefont", "bgsound", "link", "meta", "noframes", "script", "style", "title"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(4999)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5000)==0&false))) {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(5001);tb.error(this);
                    __CLR4_2_03o53o5lnxz22of.R.inc(5002);Element head = tb.getHeadElement();
                    __CLR4_2_03o53o5lnxz22of.R.inc(5003);tb.push(head);
                    __CLR4_2_03o53o5lnxz22of.R.inc(5004);tb.process(t, InHead);
                    __CLR4_2_03o53o5lnxz22of.R.inc(5005);tb.removeFromStack(head);
                } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5006);if ((((name.equals("head"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5007)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5008)==0&false))) {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(5009);tb.error(this);
                    __CLR4_2_03o53o5lnxz22of.R.inc(5010);return false;
                } }else {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(5011);anythingElse(t, tb);
                }
            }}}}}} }else {__CLR4_2_03o53o5lnxz22of.R.inc(5012);if ((((t.isEndTag())&&(__CLR4_2_03o53o5lnxz22of.R.iget(5013)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5014)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(5015);if ((((StringUtil.in(t.asEndTag().normalName(), "body", "html"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5016)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5017)==0&false))) {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(5018);anythingElse(t, tb);
                } }else {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(5019);tb.error(this);
                    __CLR4_2_03o53o5lnxz22of.R.inc(5020);return false;
                }
            }} }else {{
                __CLR4_2_03o53o5lnxz22of.R.inc(5021);anythingElse(t, tb);
            }
            }}}}}__CLR4_2_03o53o5lnxz22of.R.inc(5022);return true;
        }finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}

        private boolean anythingElse(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_03o53o5lnxz22of.R.inc(5023);
            __CLR4_2_03o53o5lnxz22of.R.inc(5024);tb.processStartTag("body");
            __CLR4_2_03o53o5lnxz22of.R.inc(5025);tb.framesetOk(true);
            __CLR4_2_03o53o5lnxz22of.R.inc(5026);return tb.process(t);
        }finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}
    },
    InBody {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_03o53o5lnxz22of.R.inc(5027);
            boolean __CLB4_2_0_bool1=false;__CLR4_2_03o53o5lnxz22of.R.inc(5028);switch (t.type) {
                case Character:if (!__CLB4_2_0_bool1) {__CLR4_2_03o53o5lnxz22of.R.inc(5029);__CLB4_2_0_bool1=true;} {
                    __CLR4_2_03o53o5lnxz22of.R.inc(5030);Token.Character c = t.asCharacter();
                    __CLR4_2_03o53o5lnxz22of.R.inc(5031);if ((((c.getData().equals(nullString))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5032)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5033)==0&false))) {{
                        // todo confirm that check
                        __CLR4_2_03o53o5lnxz22of.R.inc(5034);tb.error(this);
                        __CLR4_2_03o53o5lnxz22of.R.inc(5035);return false;
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5036);if ((((tb.framesetOk() && isWhitespace(c))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5037)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5038)==0&false))) {{ // don't check if whitespace if frames already closed
                        __CLR4_2_03o53o5lnxz22of.R.inc(5039);tb.reconstructFormattingElements();
                        __CLR4_2_03o53o5lnxz22of.R.inc(5040);tb.insert(c);
                    } }else {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5041);tb.reconstructFormattingElements();
                        __CLR4_2_03o53o5lnxz22of.R.inc(5042);tb.insert(c);
                        __CLR4_2_03o53o5lnxz22of.R.inc(5043);tb.framesetOk(false);
                    }
                    }}__CLR4_2_03o53o5lnxz22of.R.inc(5044);break;
                }
                case Comment:if (!__CLB4_2_0_bool1) {__CLR4_2_03o53o5lnxz22of.R.inc(5045);__CLB4_2_0_bool1=true;} {
                    __CLR4_2_03o53o5lnxz22of.R.inc(5046);tb.insert(t.asComment());
                    __CLR4_2_03o53o5lnxz22of.R.inc(5047);break;
                }
                case Doctype:if (!__CLB4_2_0_bool1) {__CLR4_2_03o53o5lnxz22of.R.inc(5048);__CLB4_2_0_bool1=true;} {
                    __CLR4_2_03o53o5lnxz22of.R.inc(5049);tb.error(this);
                    __CLR4_2_03o53o5lnxz22of.R.inc(5050);return false;
                }
                case StartTag:if (!__CLB4_2_0_bool1) {__CLR4_2_03o53o5lnxz22of.R.inc(5051);__CLB4_2_0_bool1=true;}
                    __CLR4_2_03o53o5lnxz22of.R.inc(5052);Token.StartTag startTag = t.asStartTag();
                    // todo - refactor to a switch statement
                    __CLR4_2_03o53o5lnxz22of.R.inc(5053);String name = startTag.normalName();
                    __CLR4_2_03o53o5lnxz22of.R.inc(5054);if ((((name.equals("a"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5055)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5056)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5057);if ((((tb.getActiveFormattingElement("a") != null)&&(__CLR4_2_03o53o5lnxz22of.R.iget(5058)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5059)==0&false))) {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5060);tb.error(this);
                            __CLR4_2_03o53o5lnxz22of.R.inc(5061);tb.processEndTag("a");

                            // still on stack?
                            __CLR4_2_03o53o5lnxz22of.R.inc(5062);Element remainingA = tb.getFromStack("a");
                            __CLR4_2_03o53o5lnxz22of.R.inc(5063);if ((((remainingA != null)&&(__CLR4_2_03o53o5lnxz22of.R.iget(5064)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5065)==0&false))) {{
                                __CLR4_2_03o53o5lnxz22of.R.inc(5066);tb.removeFromActiveFormattingElements(remainingA);
                                __CLR4_2_03o53o5lnxz22of.R.inc(5067);tb.removeFromStack(remainingA);
                            }
                        }}
                        }__CLR4_2_03o53o5lnxz22of.R.inc(5068);tb.reconstructFormattingElements();
                        __CLR4_2_03o53o5lnxz22of.R.inc(5069);Element a = tb.insert(startTag);
                        __CLR4_2_03o53o5lnxz22of.R.inc(5070);tb.pushActiveFormattingElements(a);
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5071);if ((((StringUtil.inSorted(name, Constants.InBodyStartEmptyFormatters))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5072)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5073)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5074);tb.reconstructFormattingElements();
                        __CLR4_2_03o53o5lnxz22of.R.inc(5075);tb.insertEmpty(startTag);
                        __CLR4_2_03o53o5lnxz22of.R.inc(5076);tb.framesetOk(false);
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5077);if ((((StringUtil.inSorted(name, Constants.InBodyStartPClosers))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5078)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5079)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5080);if ((((tb.inButtonScope("p"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5081)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5082)==0&false))) {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5083);tb.processEndTag("p");
                        }
                        }__CLR4_2_03o53o5lnxz22of.R.inc(5084);tb.insert(startTag);
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5085);if ((((name.equals("span"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5086)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5087)==0&false))) {{
                        // same as final else, but short circuits lots of checks
                        __CLR4_2_03o53o5lnxz22of.R.inc(5088);tb.reconstructFormattingElements();
                        __CLR4_2_03o53o5lnxz22of.R.inc(5089);tb.insert(startTag);
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5090);if ((((name.equals("li"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5091)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5092)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5093);tb.framesetOk(false);
                        __CLR4_2_03o53o5lnxz22of.R.inc(5094);ArrayList<Element> stack = tb.getStack();
                        __CLR4_2_03o53o5lnxz22of.R.inc(5095);for (int i = stack.size() - 1; (((i > 0)&&(__CLR4_2_03o53o5lnxz22of.R.iget(5096)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5097)==0&false)); i--) {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5098);Element el = stack.get(i);
                            __CLR4_2_03o53o5lnxz22of.R.inc(5099);if ((((el.normalName().equals("li"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5100)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5101)==0&false))) {{
                                __CLR4_2_03o53o5lnxz22of.R.inc(5102);tb.processEndTag("li");
                                __CLR4_2_03o53o5lnxz22of.R.inc(5103);break;
                            }
                            }__CLR4_2_03o53o5lnxz22of.R.inc(5104);if ((((tb.isSpecial(el) && !StringUtil.inSorted(el.normalName(), Constants.InBodyStartLiBreakers))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5105)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5106)==0&false)))
                                {__CLR4_2_03o53o5lnxz22of.R.inc(5107);break;
                        }}
                        }__CLR4_2_03o53o5lnxz22of.R.inc(5108);if ((((tb.inButtonScope("p"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5109)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5110)==0&false))) {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5111);tb.processEndTag("p");
                        }
                        }__CLR4_2_03o53o5lnxz22of.R.inc(5112);tb.insert(startTag);
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5113);if ((((name.equals("html"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5114)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5115)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5116);tb.error(this);
                        // merge attributes onto real html
                        __CLR4_2_03o53o5lnxz22of.R.inc(5117);Element html = tb.getStack().get(0);
                        __CLR4_2_03o53o5lnxz22of.R.inc(5118);for (Attribute attribute : startTag.getAttributes()) {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5119);if ((((!html.hasAttr(attribute.getKey()))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5120)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5121)==0&false)))
                                {__CLR4_2_03o53o5lnxz22of.R.inc(5122);html.attributes().put(attribute);
                        }}
                    }} }else {__CLR4_2_03o53o5lnxz22of.R.inc(5123);if ((((StringUtil.inSorted(name, Constants.InBodyStartToHead))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5124)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5125)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5126);return tb.process(t, InHead);
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5127);if ((((name.equals("body"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5128)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5129)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5130);tb.error(this);
                        __CLR4_2_03o53o5lnxz22of.R.inc(5131);ArrayList<Element> stack = tb.getStack();
                        __CLR4_2_03o53o5lnxz22of.R.inc(5132);if ((((stack.size() == 1 || (stack.size() > 2 && !stack.get(1).normalName().equals("body")))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5133)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5134)==0&false))) {{
                            // only in fragment case
                            __CLR4_2_03o53o5lnxz22of.R.inc(5135);return false; // ignore
                        } }else {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5136);tb.framesetOk(false);
                            __CLR4_2_03o53o5lnxz22of.R.inc(5137);Element body = stack.get(1);
                            __CLR4_2_03o53o5lnxz22of.R.inc(5138);for (Attribute attribute : startTag.getAttributes()) {{
                                __CLR4_2_03o53o5lnxz22of.R.inc(5139);if ((((!body.hasAttr(attribute.getKey()))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5140)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5141)==0&false)))
                                    {__CLR4_2_03o53o5lnxz22of.R.inc(5142);body.attributes().put(attribute);
                            }}
                        }}
                    }} }else {__CLR4_2_03o53o5lnxz22of.R.inc(5143);if ((((name.equals("frameset"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5144)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5145)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5146);tb.error(this);
                        __CLR4_2_03o53o5lnxz22of.R.inc(5147);ArrayList<Element> stack = tb.getStack();
                        __CLR4_2_03o53o5lnxz22of.R.inc(5148);if ((((stack.size() == 1 || (stack.size() > 2 && !stack.get(1).normalName().equals("body")))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5149)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5150)==0&false))) {{
                            // only in fragment case
                            __CLR4_2_03o53o5lnxz22of.R.inc(5151);return false; // ignore
                        } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5152);if ((((!tb.framesetOk())&&(__CLR4_2_03o53o5lnxz22of.R.iget(5153)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5154)==0&false))) {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5155);return false; // ignore frameset
                        } }else {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5156);Element second = stack.get(1);
                            __CLR4_2_03o53o5lnxz22of.R.inc(5157);if ((((second.parent() != null)&&(__CLR4_2_03o53o5lnxz22of.R.iget(5158)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5159)==0&false)))
                                {__CLR4_2_03o53o5lnxz22of.R.inc(5160);second.remove();
                            // pop up to html element
                            }__CLR4_2_03o53o5lnxz22of.R.inc(5161);while ((((stack.size() > 1)&&(__CLR4_2_03o53o5lnxz22of.R.iget(5162)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5163)==0&false)))
                                {__CLR4_2_03o53o5lnxz22of.R.inc(5164);stack.remove(stack.size()-1);
                            }__CLR4_2_03o53o5lnxz22of.R.inc(5165);tb.insert(startTag);
                            __CLR4_2_03o53o5lnxz22of.R.inc(5166);tb.transition(InFrameset);
                        }
                    }}} }else {__CLR4_2_03o53o5lnxz22of.R.inc(5167);if ((((StringUtil.inSorted(name, Constants.Headings))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5168)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5169)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5170);if ((((tb.inButtonScope("p"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5171)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5172)==0&false))) {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5173);tb.processEndTag("p");
                        }
                        }__CLR4_2_03o53o5lnxz22of.R.inc(5174);if ((((StringUtil.inSorted(tb.currentElement().normalName(), Constants.Headings))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5175)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5176)==0&false))) {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5177);tb.error(this);
                            __CLR4_2_03o53o5lnxz22of.R.inc(5178);tb.pop();
                        }
                        }__CLR4_2_03o53o5lnxz22of.R.inc(5179);tb.insert(startTag);
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5180);if ((((StringUtil.inSorted(name, Constants.InBodyStartPreListing))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5181)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5182)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5183);if ((((tb.inButtonScope("p"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5184)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5185)==0&false))) {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5186);tb.processEndTag("p");
                        }
                        }__CLR4_2_03o53o5lnxz22of.R.inc(5187);tb.insert(startTag);
                        __CLR4_2_03o53o5lnxz22of.R.inc(5188);tb.reader.matchConsume("\n"); // ignore LF if next token
                        __CLR4_2_03o53o5lnxz22of.R.inc(5189);tb.framesetOk(false);
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5190);if ((((name.equals("form"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5191)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5192)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5193);if ((((tb.getFormElement() != null)&&(__CLR4_2_03o53o5lnxz22of.R.iget(5194)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5195)==0&false))) {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5196);tb.error(this);
                            __CLR4_2_03o53o5lnxz22of.R.inc(5197);return false;
                        }
                        }__CLR4_2_03o53o5lnxz22of.R.inc(5198);if ((((tb.inButtonScope("p"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5199)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5200)==0&false))) {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5201);tb.processEndTag("p");
                        }
                        }__CLR4_2_03o53o5lnxz22of.R.inc(5202);tb.insertForm(startTag, true);
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5203);if ((((StringUtil.inSorted(name, Constants.DdDt))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5204)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5205)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5206);tb.framesetOk(false);
                        __CLR4_2_03o53o5lnxz22of.R.inc(5207);ArrayList<Element> stack = tb.getStack();
                        __CLR4_2_03o53o5lnxz22of.R.inc(5208);for (int i = stack.size() - 1; (((i > 0)&&(__CLR4_2_03o53o5lnxz22of.R.iget(5209)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5210)==0&false)); i--) {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5211);Element el = stack.get(i);
                            __CLR4_2_03o53o5lnxz22of.R.inc(5212);if ((((StringUtil.inSorted(el.normalName(), Constants.DdDt))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5213)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5214)==0&false))) {{
                                __CLR4_2_03o53o5lnxz22of.R.inc(5215);tb.processEndTag(el.normalName());
                                __CLR4_2_03o53o5lnxz22of.R.inc(5216);break;
                            }
                            }__CLR4_2_03o53o5lnxz22of.R.inc(5217);if ((((tb.isSpecial(el) && !StringUtil.inSorted(el.normalName(), Constants.InBodyStartLiBreakers))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5218)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5219)==0&false)))
                                {__CLR4_2_03o53o5lnxz22of.R.inc(5220);break;
                        }}
                        }__CLR4_2_03o53o5lnxz22of.R.inc(5221);if ((((tb.inButtonScope("p"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5222)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5223)==0&false))) {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5224);tb.processEndTag("p");
                        }
                        }__CLR4_2_03o53o5lnxz22of.R.inc(5225);tb.insert(startTag);
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5226);if ((((name.equals("plaintext"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5227)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5228)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5229);if ((((tb.inButtonScope("p"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5230)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5231)==0&false))) {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5232);tb.processEndTag("p");
                        }
                        }__CLR4_2_03o53o5lnxz22of.R.inc(5233);tb.insert(startTag);
                        __CLR4_2_03o53o5lnxz22of.R.inc(5234);tb.tokeniser.transition(TokeniserState.PLAINTEXT); // once in, never gets out
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5235);if ((((name.equals("button"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5236)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5237)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5238);if ((((tb.inButtonScope("button"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5239)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5240)==0&false))) {{
                            // close and reprocess
                            __CLR4_2_03o53o5lnxz22of.R.inc(5241);tb.error(this);
                            __CLR4_2_03o53o5lnxz22of.R.inc(5242);tb.processEndTag("button");
                            __CLR4_2_03o53o5lnxz22of.R.inc(5243);tb.process(startTag);
                        } }else {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5244);tb.reconstructFormattingElements();
                            __CLR4_2_03o53o5lnxz22of.R.inc(5245);tb.insert(startTag);
                            __CLR4_2_03o53o5lnxz22of.R.inc(5246);tb.framesetOk(false);
                        }
                    }} }else {__CLR4_2_03o53o5lnxz22of.R.inc(5247);if ((((StringUtil.inSorted(name, Constants.Formatters))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5248)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5249)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5250);tb.reconstructFormattingElements();
                        __CLR4_2_03o53o5lnxz22of.R.inc(5251);Element el = tb.insert(startTag);
                        __CLR4_2_03o53o5lnxz22of.R.inc(5252);tb.pushActiveFormattingElements(el);
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5253);if ((((name.equals("nobr"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5254)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5255)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5256);tb.reconstructFormattingElements();
                        __CLR4_2_03o53o5lnxz22of.R.inc(5257);if ((((tb.inScope("nobr"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5258)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5259)==0&false))) {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5260);tb.error(this);
                            __CLR4_2_03o53o5lnxz22of.R.inc(5261);tb.processEndTag("nobr");
                            __CLR4_2_03o53o5lnxz22of.R.inc(5262);tb.reconstructFormattingElements();
                        }
                        }__CLR4_2_03o53o5lnxz22of.R.inc(5263);Element el = tb.insert(startTag);
                        __CLR4_2_03o53o5lnxz22of.R.inc(5264);tb.pushActiveFormattingElements(el);
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5265);if ((((StringUtil.inSorted(name, Constants.InBodyStartApplets))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5266)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5267)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5268);tb.reconstructFormattingElements();
                        __CLR4_2_03o53o5lnxz22of.R.inc(5269);tb.insert(startTag);
                        __CLR4_2_03o53o5lnxz22of.R.inc(5270);tb.insertMarkerToFormattingElements();
                        __CLR4_2_03o53o5lnxz22of.R.inc(5271);tb.framesetOk(false);
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5272);if ((((name.equals("table"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5273)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5274)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5275);if ((((tb.getDocument().quirksMode() != Document.QuirksMode.quirks && tb.inButtonScope("p"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5276)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5277)==0&false))) {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5278);tb.processEndTag("p");
                        }
                        }__CLR4_2_03o53o5lnxz22of.R.inc(5279);tb.insert(startTag);
                        __CLR4_2_03o53o5lnxz22of.R.inc(5280);tb.framesetOk(false);
                        __CLR4_2_03o53o5lnxz22of.R.inc(5281);tb.transition(InTable);
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5282);if ((((name.equals("input"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5283)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5284)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5285);tb.reconstructFormattingElements();
                        __CLR4_2_03o53o5lnxz22of.R.inc(5286);Element el = tb.insertEmpty(startTag);
                        __CLR4_2_03o53o5lnxz22of.R.inc(5287);if ((((!el.attr("type").equalsIgnoreCase("hidden"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5288)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5289)==0&false)))
                            {__CLR4_2_03o53o5lnxz22of.R.inc(5290);tb.framesetOk(false);
                    }} }else {__CLR4_2_03o53o5lnxz22of.R.inc(5291);if ((((StringUtil.inSorted(name, Constants.InBodyStartMedia))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5292)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5293)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5294);tb.insertEmpty(startTag);
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5295);if ((((name.equals("hr"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5296)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5297)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5298);if ((((tb.inButtonScope("p"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5299)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5300)==0&false))) {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5301);tb.processEndTag("p");
                        }
                        }__CLR4_2_03o53o5lnxz22of.R.inc(5302);tb.insertEmpty(startTag);
                        __CLR4_2_03o53o5lnxz22of.R.inc(5303);tb.framesetOk(false);
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5304);if ((((name.equals("image"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5305)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5306)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5307);if ((((tb.getFromStack("svg") == null)&&(__CLR4_2_03o53o5lnxz22of.R.iget(5308)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5309)==0&false)))
                            {__CLR4_2_03o53o5lnxz22of.R.inc(5310);return tb.process(startTag.name("img")); // change <image> to <img>, unless in svg
                        }else
                            {__CLR4_2_03o53o5lnxz22of.R.inc(5311);tb.insert(startTag);
                    }} }else {__CLR4_2_03o53o5lnxz22of.R.inc(5312);if ((((name.equals("isindex"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5313)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5314)==0&false))) {{
                        // how much do we care about the early 90s?
                        __CLR4_2_03o53o5lnxz22of.R.inc(5315);tb.error(this);
                        __CLR4_2_03o53o5lnxz22of.R.inc(5316);if ((((tb.getFormElement() != null)&&(__CLR4_2_03o53o5lnxz22of.R.iget(5317)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5318)==0&false)))
                            {__CLR4_2_03o53o5lnxz22of.R.inc(5319);return false;

                        }__CLR4_2_03o53o5lnxz22of.R.inc(5320);tb.processStartTag("form");
                        __CLR4_2_03o53o5lnxz22of.R.inc(5321);if ((((startTag.attributes.hasKey("action"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5322)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5323)==0&false))) {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5324);Element form = tb.getFormElement();
                            __CLR4_2_03o53o5lnxz22of.R.inc(5325);form.attr("action", startTag.attributes.get("action"));
                        }
                        }__CLR4_2_03o53o5lnxz22of.R.inc(5326);tb.processStartTag("hr");
                        __CLR4_2_03o53o5lnxz22of.R.inc(5327);tb.processStartTag("label");
                        // hope you like english.
                        __CLR4_2_03o53o5lnxz22of.R.inc(5328);String prompt = (((startTag.attributes.hasKey("prompt") )&&(__CLR4_2_03o53o5lnxz22of.R.iget(5329)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5330)==0&false))?
                                startTag.attributes.get("prompt") :
                                "This is a searchable index. Enter search keywords: ";

                        __CLR4_2_03o53o5lnxz22of.R.inc(5331);tb.process(new Token.Character().data(prompt));

                        // input
                        __CLR4_2_03o53o5lnxz22of.R.inc(5332);Attributes inputAttribs = new Attributes();
                        __CLR4_2_03o53o5lnxz22of.R.inc(5333);for (Attribute attr : startTag.attributes) {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5334);if ((((!StringUtil.inSorted(attr.getKey(), Constants.InBodyStartInputAttribs))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5335)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5336)==0&false)))
                                {__CLR4_2_03o53o5lnxz22of.R.inc(5337);inputAttribs.put(attr);
                        }}
                        }__CLR4_2_03o53o5lnxz22of.R.inc(5338);inputAttribs.put("name", "isindex");
                        __CLR4_2_03o53o5lnxz22of.R.inc(5339);tb.processStartTag("input", inputAttribs);
                        __CLR4_2_03o53o5lnxz22of.R.inc(5340);tb.processEndTag("label");
                        __CLR4_2_03o53o5lnxz22of.R.inc(5341);tb.processStartTag("hr");
                        __CLR4_2_03o53o5lnxz22of.R.inc(5342);tb.processEndTag("form");
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5343);if ((((name.equals("textarea"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5344)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5345)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5346);tb.insert(startTag);
                        // todo: If the next token is a U+000A LINE FEED (LF) character token, then ignore that token and move on to the next one. (Newlines at the start of textarea elements are ignored as an authoring convenience.)
                        __CLR4_2_03o53o5lnxz22of.R.inc(5347);tb.tokeniser.transition(TokeniserState.Rcdata);
                        __CLR4_2_03o53o5lnxz22of.R.inc(5348);tb.markInsertionMode();
                        __CLR4_2_03o53o5lnxz22of.R.inc(5349);tb.framesetOk(false);
                        __CLR4_2_03o53o5lnxz22of.R.inc(5350);tb.transition(Text);
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5351);if ((((name.equals("xmp"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5352)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5353)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5354);if ((((tb.inButtonScope("p"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5355)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5356)==0&false))) {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5357);tb.processEndTag("p");
                        }
                        }__CLR4_2_03o53o5lnxz22of.R.inc(5358);tb.reconstructFormattingElements();
                        __CLR4_2_03o53o5lnxz22of.R.inc(5359);tb.framesetOk(false);
                        __CLR4_2_03o53o5lnxz22of.R.inc(5360);handleRawtext(startTag, tb);
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5361);if ((((name.equals("iframe"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5362)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5363)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5364);tb.framesetOk(false);
                        __CLR4_2_03o53o5lnxz22of.R.inc(5365);handleRawtext(startTag, tb);
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5366);if ((((name.equals("noembed"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5367)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5368)==0&false))) {{
                        // also handle noscript if script enabled
                        __CLR4_2_03o53o5lnxz22of.R.inc(5369);handleRawtext(startTag, tb);
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5370);if ((((name.equals("select"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5371)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5372)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5373);tb.reconstructFormattingElements();
                        __CLR4_2_03o53o5lnxz22of.R.inc(5374);tb.insert(startTag);
                        __CLR4_2_03o53o5lnxz22of.R.inc(5375);tb.framesetOk(false);

                        __CLR4_2_03o53o5lnxz22of.R.inc(5376);HtmlTreeBuilderState state = tb.state();
                        __CLR4_2_03o53o5lnxz22of.R.inc(5377);if ((((state.equals(InTable) || state.equals(InCaption) || state.equals(InTableBody) || state.equals(InRow) || state.equals(InCell))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5378)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5379)==0&false)))
                            {__CLR4_2_03o53o5lnxz22of.R.inc(5380);tb.transition(InSelectInTable);
                        }else
                            {__CLR4_2_03o53o5lnxz22of.R.inc(5381);tb.transition(InSelect);
                    }} }else {__CLR4_2_03o53o5lnxz22of.R.inc(5382);if ((((StringUtil.inSorted(name, Constants.InBodyStartOptions))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5383)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5384)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5385);if ((((tb.currentElement().normalName().equals("option"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5386)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5387)==0&false)))
                            {__CLR4_2_03o53o5lnxz22of.R.inc(5388);tb.processEndTag("option");
                        }__CLR4_2_03o53o5lnxz22of.R.inc(5389);tb.reconstructFormattingElements();
                        __CLR4_2_03o53o5lnxz22of.R.inc(5390);tb.insert(startTag);
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5391);if ((((StringUtil.inSorted(name, Constants.InBodyStartRuby))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5392)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5393)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5394);if ((((tb.inScope("ruby"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5395)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5396)==0&false))) {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5397);tb.generateImpliedEndTags();
                            __CLR4_2_03o53o5lnxz22of.R.inc(5398);if ((((!tb.currentElement().normalName().equals("ruby"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5399)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5400)==0&false))) {{
                                __CLR4_2_03o53o5lnxz22of.R.inc(5401);tb.error(this);
                                __CLR4_2_03o53o5lnxz22of.R.inc(5402);tb.popStackToBefore("ruby"); // i.e. close up to but not include name
                            }
                            }__CLR4_2_03o53o5lnxz22of.R.inc(5403);tb.insert(startTag);
                        }
                    }} }else {__CLR4_2_03o53o5lnxz22of.R.inc(5404);if ((((name.equals("math"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5405)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5406)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5407);tb.reconstructFormattingElements();
                        // todo: handle A start tag whose tag name is "math" (i.e. foreign, mathml)
                        __CLR4_2_03o53o5lnxz22of.R.inc(5408);tb.insert(startTag);
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5409);if ((((name.equals("svg"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5410)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5411)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5412);tb.reconstructFormattingElements();
                        // todo: handle A start tag whose tag name is "svg" (xlink, svg)
                        __CLR4_2_03o53o5lnxz22of.R.inc(5413);tb.insert(startTag);
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5414);if ((((StringUtil.inSorted(name, Constants.InBodyStartDrop))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5415)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5416)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5417);tb.error(this);
                        __CLR4_2_03o53o5lnxz22of.R.inc(5418);return false;
                    } }else {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5419);tb.reconstructFormattingElements();
                        __CLR4_2_03o53o5lnxz22of.R.inc(5420);tb.insert(startTag);
                    }
                    }}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}__CLR4_2_03o53o5lnxz22of.R.inc(5421);break;

                case EndTag:if (!__CLB4_2_0_bool1) {__CLR4_2_03o53o5lnxz22of.R.inc(5422);__CLB4_2_0_bool1=true;}
                    __CLR4_2_03o53o5lnxz22of.R.inc(5423);Token.EndTag endTag = t.asEndTag();
                    __CLR4_2_03o53o5lnxz22of.R.inc(5424);name = endTag.normalName();
                    __CLR4_2_03o53o5lnxz22of.R.inc(5425);if ((((StringUtil.inSorted(name, Constants.InBodyEndAdoptionFormatters))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5426)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5427)==0&false))) {{
                        // Adoption Agency Algorithm.
                        __CLR4_2_03o53o5lnxz22of.R.inc(5428);for (int i = 0; (((i < 8)&&(__CLR4_2_03o53o5lnxz22of.R.iget(5429)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5430)==0&false)); i++) {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5431);Element formatEl = tb.getActiveFormattingElement(name);
                            __CLR4_2_03o53o5lnxz22of.R.inc(5432);if ((((formatEl == null)&&(__CLR4_2_03o53o5lnxz22of.R.iget(5433)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5434)==0&false)))
                                {__CLR4_2_03o53o5lnxz22of.R.inc(5435);return anyOtherEndTag(t, tb);
                            }else {__CLR4_2_03o53o5lnxz22of.R.inc(5436);if ((((!tb.onStack(formatEl))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5437)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5438)==0&false))) {{
                                __CLR4_2_03o53o5lnxz22of.R.inc(5439);tb.error(this);
                                __CLR4_2_03o53o5lnxz22of.R.inc(5440);tb.removeFromActiveFormattingElements(formatEl);
                                __CLR4_2_03o53o5lnxz22of.R.inc(5441);return true;
                            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5442);if ((((!tb.inScope(formatEl.normalName()))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5443)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5444)==0&false))) {{
                                __CLR4_2_03o53o5lnxz22of.R.inc(5445);tb.error(this);
                                __CLR4_2_03o53o5lnxz22of.R.inc(5446);return false;
                            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5447);if ((((tb.currentElement() != formatEl)&&(__CLR4_2_03o53o5lnxz22of.R.iget(5448)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5449)==0&false)))
                                {__CLR4_2_03o53o5lnxz22of.R.inc(5450);tb.error(this);

                            }}}}__CLR4_2_03o53o5lnxz22of.R.inc(5451);Element furthestBlock = null;
                            __CLR4_2_03o53o5lnxz22of.R.inc(5452);Element commonAncestor = null;
                            __CLR4_2_03o53o5lnxz22of.R.inc(5453);boolean seenFormattingElement = false;
                            __CLR4_2_03o53o5lnxz22of.R.inc(5454);ArrayList<Element> stack = tb.getStack();
                            // the spec doesn't limit to < 64, but in degenerate cases (9000+ stack depth) this prevents
                            // run-aways
                            __CLR4_2_03o53o5lnxz22of.R.inc(5455);final int stackSize = stack.size();
                            __CLR4_2_03o53o5lnxz22of.R.inc(5456);for (int si = 0; (((si < stackSize && si < 64)&&(__CLR4_2_03o53o5lnxz22of.R.iget(5457)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5458)==0&false)); si++) {{
                                __CLR4_2_03o53o5lnxz22of.R.inc(5459);Element el = stack.get(si);
                                __CLR4_2_03o53o5lnxz22of.R.inc(5460);if ((((el == formatEl)&&(__CLR4_2_03o53o5lnxz22of.R.iget(5461)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5462)==0&false))) {{
                                    __CLR4_2_03o53o5lnxz22of.R.inc(5463);commonAncestor = stack.get(si - 1);
                                    __CLR4_2_03o53o5lnxz22of.R.inc(5464);seenFormattingElement = true;
                                } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5465);if ((((seenFormattingElement && tb.isSpecial(el))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5466)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5467)==0&false))) {{
                                    __CLR4_2_03o53o5lnxz22of.R.inc(5468);furthestBlock = el;
                                    __CLR4_2_03o53o5lnxz22of.R.inc(5469);break;
                                }
                            }}}
                            }__CLR4_2_03o53o5lnxz22of.R.inc(5470);if ((((furthestBlock == null)&&(__CLR4_2_03o53o5lnxz22of.R.iget(5471)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5472)==0&false))) {{
                                __CLR4_2_03o53o5lnxz22of.R.inc(5473);tb.popStackToClose(formatEl.normalName());
                                __CLR4_2_03o53o5lnxz22of.R.inc(5474);tb.removeFromActiveFormattingElements(formatEl);
                                __CLR4_2_03o53o5lnxz22of.R.inc(5475);return true;
                            }

                            // todo: Let a bookmark note the position of the formatting element in the list of active formatting elements relative to the elements on either side of it in the list.
                            // does that mean: int pos of format el in list?
                            }__CLR4_2_03o53o5lnxz22of.R.inc(5476);Element node = furthestBlock;
                            __CLR4_2_03o53o5lnxz22of.R.inc(5477);Element lastNode = furthestBlock;
                            __CLR4_2_03o53o5lnxz22of.R.inc(5478);for (int j = 0; (((j < 3)&&(__CLR4_2_03o53o5lnxz22of.R.iget(5479)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5480)==0&false)); j++) {{
                                __CLR4_2_03o53o5lnxz22of.R.inc(5481);if ((((tb.onStack(node))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5482)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5483)==0&false)))
                                    {__CLR4_2_03o53o5lnxz22of.R.inc(5484);node = tb.aboveOnStack(node);
                                }__CLR4_2_03o53o5lnxz22of.R.inc(5485);if ((((!tb.isInActiveFormattingElements(node))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5486)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5487)==0&false))) {{ // note no bookmark check
                                    __CLR4_2_03o53o5lnxz22of.R.inc(5488);tb.removeFromStack(node);
                                    __CLR4_2_03o53o5lnxz22of.R.inc(5489);continue;
                                } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5490);if ((((node == formatEl)&&(__CLR4_2_03o53o5lnxz22of.R.iget(5491)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5492)==0&false)))
                                    {__CLR4_2_03o53o5lnxz22of.R.inc(5493);break;

                                }}__CLR4_2_03o53o5lnxz22of.R.inc(5494);Element replacement = new Element(Tag.valueOf(node.nodeName(), ParseSettings.preserveCase), tb.getBaseUri());
                                // case will follow the original node (so honours ParseSettings)
                                __CLR4_2_03o53o5lnxz22of.R.inc(5495);tb.replaceActiveFormattingElement(node, replacement);
                                __CLR4_2_03o53o5lnxz22of.R.inc(5496);tb.replaceOnStack(node, replacement);
                                __CLR4_2_03o53o5lnxz22of.R.inc(5497);node = replacement;

                                __CLR4_2_03o53o5lnxz22of.R.inc(5498);if ((((lastNode == furthestBlock)&&(__CLR4_2_03o53o5lnxz22of.R.iget(5499)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5500)==0&false))) {{
                                    // todo: move the aforementioned bookmark to be immediately after the new node in the list of active formatting elements.
                                    // not getting how this bookmark both straddles the element above, but is inbetween here...
                                }
                                }__CLR4_2_03o53o5lnxz22of.R.inc(5501);if ((((lastNode.parent() != null)&&(__CLR4_2_03o53o5lnxz22of.R.iget(5502)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5503)==0&false)))
                                    {__CLR4_2_03o53o5lnxz22of.R.inc(5504);lastNode.remove();
                                }__CLR4_2_03o53o5lnxz22of.R.inc(5505);node.appendChild(lastNode);

                                __CLR4_2_03o53o5lnxz22of.R.inc(5506);lastNode = node;
                            }

                            }__CLR4_2_03o53o5lnxz22of.R.inc(5507);if ((((StringUtil.inSorted(commonAncestor.normalName(), Constants.InBodyEndTableFosters))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5508)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5509)==0&false))) {{
                                __CLR4_2_03o53o5lnxz22of.R.inc(5510);if ((((lastNode.parent() != null)&&(__CLR4_2_03o53o5lnxz22of.R.iget(5511)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5512)==0&false)))
                                    {__CLR4_2_03o53o5lnxz22of.R.inc(5513);lastNode.remove();
                                }__CLR4_2_03o53o5lnxz22of.R.inc(5514);tb.insertInFosterParent(lastNode);
                            } }else {{
                                __CLR4_2_03o53o5lnxz22of.R.inc(5515);if ((((lastNode.parent() != null)&&(__CLR4_2_03o53o5lnxz22of.R.iget(5516)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5517)==0&false)))
                                    {__CLR4_2_03o53o5lnxz22of.R.inc(5518);lastNode.remove();
                                }__CLR4_2_03o53o5lnxz22of.R.inc(5519);commonAncestor.appendChild(lastNode);
                            }

                            }__CLR4_2_03o53o5lnxz22of.R.inc(5520);Element adopter = new Element(formatEl.tag(), tb.getBaseUri());
                            __CLR4_2_03o53o5lnxz22of.R.inc(5521);adopter.attributes().addAll(formatEl.attributes());
                            __CLR4_2_03o53o5lnxz22of.R.inc(5522);Node[] childNodes = furthestBlock.childNodes().toArray(new Node[0]);
                            __CLR4_2_03o53o5lnxz22of.R.inc(5523);for (Node childNode : childNodes) {{
                                __CLR4_2_03o53o5lnxz22of.R.inc(5524);adopter.appendChild(childNode); // append will reparent. thus the clone to avoid concurrent mod.
                            }
                            }__CLR4_2_03o53o5lnxz22of.R.inc(5525);furthestBlock.appendChild(adopter);
                            __CLR4_2_03o53o5lnxz22of.R.inc(5526);tb.removeFromActiveFormattingElements(formatEl);
                            // todo: insert the new element into the list of active formatting elements at the position of the aforementioned bookmark.
                            __CLR4_2_03o53o5lnxz22of.R.inc(5527);tb.removeFromStack(formatEl);
                            __CLR4_2_03o53o5lnxz22of.R.inc(5528);tb.insertOnStackAfter(furthestBlock, adopter);
                        }
                    }} }else {__CLR4_2_03o53o5lnxz22of.R.inc(5529);if ((((StringUtil.inSorted(name, Constants.InBodyEndClosers))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5530)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5531)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5532);if ((((!tb.inScope(name))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5533)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5534)==0&false))) {{
                            // nothing to close
                            __CLR4_2_03o53o5lnxz22of.R.inc(5535);tb.error(this);
                            __CLR4_2_03o53o5lnxz22of.R.inc(5536);return false;
                        } }else {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5537);tb.generateImpliedEndTags();
                            __CLR4_2_03o53o5lnxz22of.R.inc(5538);if ((((!tb.currentElement().normalName().equals(name))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5539)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5540)==0&false)))
                                {__CLR4_2_03o53o5lnxz22of.R.inc(5541);tb.error(this);
                            }__CLR4_2_03o53o5lnxz22of.R.inc(5542);tb.popStackToClose(name);
                        }
                    }} }else {__CLR4_2_03o53o5lnxz22of.R.inc(5543);if ((((name.equals("span"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5544)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5545)==0&false))) {{
                        // same as final fall through, but saves short circuit
                        __CLR4_2_03o53o5lnxz22of.R.inc(5546);return anyOtherEndTag(t, tb);
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5547);if ((((name.equals("li"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5548)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5549)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5550);if ((((!tb.inListItemScope(name))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5551)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5552)==0&false))) {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5553);tb.error(this);
                            __CLR4_2_03o53o5lnxz22of.R.inc(5554);return false;
                        } }else {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5555);tb.generateImpliedEndTags(name);
                            __CLR4_2_03o53o5lnxz22of.R.inc(5556);if ((((!tb.currentElement().normalName().equals(name))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5557)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5558)==0&false)))
                                {__CLR4_2_03o53o5lnxz22of.R.inc(5559);tb.error(this);
                            }__CLR4_2_03o53o5lnxz22of.R.inc(5560);tb.popStackToClose(name);
                        }
                    }} }else {__CLR4_2_03o53o5lnxz22of.R.inc(5561);if ((((name.equals("body"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5562)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5563)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5564);if ((((!tb.inScope("body"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5565)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5566)==0&false))) {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5567);tb.error(this);
                            __CLR4_2_03o53o5lnxz22of.R.inc(5568);return false;
                        } }else {{
                            // todo: error if stack contains something not dd, dt, li, optgroup, option, p, rp, rt, tbody, td, tfoot, th, thead, tr, body, html
                            __CLR4_2_03o53o5lnxz22of.R.inc(5569);tb.transition(AfterBody);
                        }
                    }} }else {__CLR4_2_03o53o5lnxz22of.R.inc(5570);if ((((name.equals("html"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5571)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5572)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5573);boolean notIgnored = tb.processEndTag("body");
                        __CLR4_2_03o53o5lnxz22of.R.inc(5574);if ((((notIgnored)&&(__CLR4_2_03o53o5lnxz22of.R.iget(5575)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5576)==0&false)))
                            {__CLR4_2_03o53o5lnxz22of.R.inc(5577);return tb.process(endTag);
                    }} }else {__CLR4_2_03o53o5lnxz22of.R.inc(5578);if ((((name.equals("form"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5579)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5580)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5581);Element currentForm = tb.getFormElement();
                        __CLR4_2_03o53o5lnxz22of.R.inc(5582);tb.setFormElement(null);
                        __CLR4_2_03o53o5lnxz22of.R.inc(5583);if ((((currentForm == null || !tb.inScope(name))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5584)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5585)==0&false))) {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5586);tb.error(this);
                            __CLR4_2_03o53o5lnxz22of.R.inc(5587);return false;
                        } }else {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5588);tb.generateImpliedEndTags();
                            __CLR4_2_03o53o5lnxz22of.R.inc(5589);if ((((!tb.currentElement().normalName().equals(name))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5590)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5591)==0&false)))
                                {__CLR4_2_03o53o5lnxz22of.R.inc(5592);tb.error(this);
                            // remove currentForm from stack. will shift anything under up.
                            }__CLR4_2_03o53o5lnxz22of.R.inc(5593);tb.removeFromStack(currentForm);
                        }
                    }} }else {__CLR4_2_03o53o5lnxz22of.R.inc(5594);if ((((name.equals("p"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5595)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5596)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5597);if ((((!tb.inButtonScope(name))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5598)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5599)==0&false))) {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5600);tb.error(this);
                            __CLR4_2_03o53o5lnxz22of.R.inc(5601);tb.processStartTag(name); // if no p to close, creates an empty <p></p>
                            __CLR4_2_03o53o5lnxz22of.R.inc(5602);return tb.process(endTag);
                        } }else {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5603);tb.generateImpliedEndTags(name);
                            __CLR4_2_03o53o5lnxz22of.R.inc(5604);if ((((!tb.currentElement().normalName().equals(name))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5605)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5606)==0&false)))
                                {__CLR4_2_03o53o5lnxz22of.R.inc(5607);tb.error(this);
                            }__CLR4_2_03o53o5lnxz22of.R.inc(5608);tb.popStackToClose(name);
                        }
                    }} }else {__CLR4_2_03o53o5lnxz22of.R.inc(5609);if ((((StringUtil.inSorted(name, Constants.DdDt))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5610)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5611)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5612);if ((((!tb.inScope(name))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5613)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5614)==0&false))) {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5615);tb.error(this);
                            __CLR4_2_03o53o5lnxz22of.R.inc(5616);return false;
                        } }else {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5617);tb.generateImpliedEndTags(name);
                            __CLR4_2_03o53o5lnxz22of.R.inc(5618);if ((((!tb.currentElement().normalName().equals(name))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5619)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5620)==0&false)))
                                {__CLR4_2_03o53o5lnxz22of.R.inc(5621);tb.error(this);
                            }__CLR4_2_03o53o5lnxz22of.R.inc(5622);tb.popStackToClose(name);
                        }
                    }} }else {__CLR4_2_03o53o5lnxz22of.R.inc(5623);if ((((StringUtil.inSorted(name, Constants.Headings))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5624)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5625)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5626);if ((((!tb.inScope(Constants.Headings))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5627)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5628)==0&false))) {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5629);tb.error(this);
                            __CLR4_2_03o53o5lnxz22of.R.inc(5630);return false;
                        } }else {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5631);tb.generateImpliedEndTags(name);
                            __CLR4_2_03o53o5lnxz22of.R.inc(5632);if ((((!tb.currentElement().normalName().equals(name))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5633)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5634)==0&false)))
                                {__CLR4_2_03o53o5lnxz22of.R.inc(5635);tb.error(this);
                            }__CLR4_2_03o53o5lnxz22of.R.inc(5636);tb.popStackToClose(Constants.Headings);
                        }
                    }} }else {__CLR4_2_03o53o5lnxz22of.R.inc(5637);if ((((name.equals("sarcasm"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5638)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5639)==0&false))) {{
                        // *sigh*
                        __CLR4_2_03o53o5lnxz22of.R.inc(5640);return anyOtherEndTag(t, tb);
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5641);if ((((StringUtil.inSorted(name, Constants.InBodyStartApplets))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5642)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5643)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5644);if ((((!tb.inScope("name"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5645)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5646)==0&false))) {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5647);if ((((!tb.inScope(name))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5648)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5649)==0&false))) {{
                                __CLR4_2_03o53o5lnxz22of.R.inc(5650);tb.error(this);
                                __CLR4_2_03o53o5lnxz22of.R.inc(5651);return false;
                            }
                            }__CLR4_2_03o53o5lnxz22of.R.inc(5652);tb.generateImpliedEndTags();
                            __CLR4_2_03o53o5lnxz22of.R.inc(5653);if ((((!tb.currentElement().normalName().equals(name))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5654)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5655)==0&false)))
                                {__CLR4_2_03o53o5lnxz22of.R.inc(5656);tb.error(this);
                            }__CLR4_2_03o53o5lnxz22of.R.inc(5657);tb.popStackToClose(name);
                            __CLR4_2_03o53o5lnxz22of.R.inc(5658);tb.clearFormattingElementsToLastMarker();
                        }
                    }} }else {__CLR4_2_03o53o5lnxz22of.R.inc(5659);if ((((name.equals("br"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5660)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5661)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5662);tb.error(this);
                        __CLR4_2_03o53o5lnxz22of.R.inc(5663);tb.processStartTag("br");
                        __CLR4_2_03o53o5lnxz22of.R.inc(5664);return false;
                    } }else {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5665);return anyOtherEndTag(t, tb);
                    }

                    }}}}}}}}}}}}}__CLR4_2_03o53o5lnxz22of.R.inc(5666);break;
                case EOF:if (!__CLB4_2_0_bool1) {__CLR4_2_03o53o5lnxz22of.R.inc(5667);__CLB4_2_0_bool1=true;}
                    // todo: error if stack contains something not dd, dt, li, p, tbody, td, tfoot, th, thead, tr, body, html
                    // stop parsing
                    __CLR4_2_03o53o5lnxz22of.R.inc(5668);break;
            }
            __CLR4_2_03o53o5lnxz22of.R.inc(5669);return true;
        }finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}

        boolean anyOtherEndTag(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_03o53o5lnxz22of.R.inc(5670);
            __CLR4_2_03o53o5lnxz22of.R.inc(5671);String name = t.asEndTag().normalName; // case insensitive search - goal is to preserve output case, not for the parse to be case sensitive
            __CLR4_2_03o53o5lnxz22of.R.inc(5672);ArrayList<Element> stack = tb.getStack();
            __CLR4_2_03o53o5lnxz22of.R.inc(5673);for (int pos = stack.size() -1; (((pos >= 0)&&(__CLR4_2_03o53o5lnxz22of.R.iget(5674)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5675)==0&false)); pos--) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(5676);Element node = stack.get(pos);
                __CLR4_2_03o53o5lnxz22of.R.inc(5677);if ((((node.normalName().equals(name))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5678)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5679)==0&false))) {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(5680);tb.generateImpliedEndTags(name);
                    __CLR4_2_03o53o5lnxz22of.R.inc(5681);if ((((!name.equals(tb.currentElement().normalName()))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5682)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5683)==0&false)))
                        {__CLR4_2_03o53o5lnxz22of.R.inc(5684);tb.error(this);
                    }__CLR4_2_03o53o5lnxz22of.R.inc(5685);tb.popStackToClose(name);
                    __CLR4_2_03o53o5lnxz22of.R.inc(5686);break;
                } }else {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(5687);if ((((tb.isSpecial(node))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5688)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5689)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5690);tb.error(this);
                        __CLR4_2_03o53o5lnxz22of.R.inc(5691);return false;
                    }
                }}
            }}
            }__CLR4_2_03o53o5lnxz22of.R.inc(5692);return true;
        }finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}
    },
    Text {
        // in script, style etc. normally treated as data tags
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_03o53o5lnxz22of.R.inc(5693);
            __CLR4_2_03o53o5lnxz22of.R.inc(5694);if ((((t.isCharacter())&&(__CLR4_2_03o53o5lnxz22of.R.iget(5695)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5696)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(5697);tb.insert(t.asCharacter());
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5698);if ((((t.isEOF())&&(__CLR4_2_03o53o5lnxz22of.R.iget(5699)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5700)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(5701);tb.error(this);
                // if current node is script: already started
                __CLR4_2_03o53o5lnxz22of.R.inc(5702);tb.pop();
                __CLR4_2_03o53o5lnxz22of.R.inc(5703);tb.transition(tb.originalState());
                __CLR4_2_03o53o5lnxz22of.R.inc(5704);return tb.process(t);
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5705);if ((((t.isEndTag())&&(__CLR4_2_03o53o5lnxz22of.R.iget(5706)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5707)==0&false))) {{
                // if: An end tag whose tag name is "script" -- scripting nesting level, if evaluating scripts
                __CLR4_2_03o53o5lnxz22of.R.inc(5708);tb.pop();
                __CLR4_2_03o53o5lnxz22of.R.inc(5709);tb.transition(tb.originalState());
            }
            }}}__CLR4_2_03o53o5lnxz22of.R.inc(5710);return true;
        }finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}
    },
    InTable {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_03o53o5lnxz22of.R.inc(5711);
            __CLR4_2_03o53o5lnxz22of.R.inc(5712);if ((((t.isCharacter())&&(__CLR4_2_03o53o5lnxz22of.R.iget(5713)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5714)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(5715);tb.newPendingTableCharacters();
                __CLR4_2_03o53o5lnxz22of.R.inc(5716);tb.markInsertionMode();
                __CLR4_2_03o53o5lnxz22of.R.inc(5717);tb.transition(InTableText);
                __CLR4_2_03o53o5lnxz22of.R.inc(5718);return tb.process(t);
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5719);if ((((t.isComment())&&(__CLR4_2_03o53o5lnxz22of.R.iget(5720)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5721)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(5722);tb.insert(t.asComment());
                __CLR4_2_03o53o5lnxz22of.R.inc(5723);return true;
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5724);if ((((t.isDoctype())&&(__CLR4_2_03o53o5lnxz22of.R.iget(5725)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5726)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(5727);tb.error(this);
                __CLR4_2_03o53o5lnxz22of.R.inc(5728);return false;
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5729);if ((((t.isStartTag())&&(__CLR4_2_03o53o5lnxz22of.R.iget(5730)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5731)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(5732);Token.StartTag startTag = t.asStartTag();
                __CLR4_2_03o53o5lnxz22of.R.inc(5733);String name = startTag.normalName();
                __CLR4_2_03o53o5lnxz22of.R.inc(5734);if ((((name.equals("caption"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5735)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5736)==0&false))) {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(5737);tb.clearStackToTableContext();
                    __CLR4_2_03o53o5lnxz22of.R.inc(5738);tb.insertMarkerToFormattingElements();
                    __CLR4_2_03o53o5lnxz22of.R.inc(5739);tb.insert(startTag);
                    __CLR4_2_03o53o5lnxz22of.R.inc(5740);tb.transition(InCaption);
                } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5741);if ((((name.equals("colgroup"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5742)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5743)==0&false))) {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(5744);tb.clearStackToTableContext();
                    __CLR4_2_03o53o5lnxz22of.R.inc(5745);tb.insert(startTag);
                    __CLR4_2_03o53o5lnxz22of.R.inc(5746);tb.transition(InColumnGroup);
                } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5747);if ((((name.equals("col"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5748)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5749)==0&false))) {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(5750);tb.processStartTag("colgroup");
                    __CLR4_2_03o53o5lnxz22of.R.inc(5751);return tb.process(t);
                } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5752);if ((((StringUtil.in(name, "tbody", "tfoot", "thead"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5753)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5754)==0&false))) {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(5755);tb.clearStackToTableContext();
                    __CLR4_2_03o53o5lnxz22of.R.inc(5756);tb.insert(startTag);
                    __CLR4_2_03o53o5lnxz22of.R.inc(5757);tb.transition(InTableBody);
                } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5758);if ((((StringUtil.in(name, "td", "th", "tr"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5759)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5760)==0&false))) {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(5761);tb.processStartTag("tbody");
                    __CLR4_2_03o53o5lnxz22of.R.inc(5762);return tb.process(t);
                } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5763);if ((((name.equals("table"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5764)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5765)==0&false))) {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(5766);tb.error(this);
                    __CLR4_2_03o53o5lnxz22of.R.inc(5767);boolean processed = tb.processEndTag("table");
                    __CLR4_2_03o53o5lnxz22of.R.inc(5768);if ((((processed)&&(__CLR4_2_03o53o5lnxz22of.R.iget(5769)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5770)==0&false))) // only ignored if in fragment
                        {__CLR4_2_03o53o5lnxz22of.R.inc(5771);return tb.process(t);
                }} }else {__CLR4_2_03o53o5lnxz22of.R.inc(5772);if ((((StringUtil.in(name, "style", "script"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5773)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5774)==0&false))) {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(5775);return tb.process(t, InHead);
                } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5776);if ((((name.equals("input"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5777)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5778)==0&false))) {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(5779);if ((((!startTag.attributes.get("type").equalsIgnoreCase("hidden"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5780)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5781)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5782);return anythingElse(t, tb);
                    } }else {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5783);tb.insertEmpty(startTag);
                    }
                }} }else {__CLR4_2_03o53o5lnxz22of.R.inc(5784);if ((((name.equals("form"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5785)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5786)==0&false))) {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(5787);tb.error(this);
                    __CLR4_2_03o53o5lnxz22of.R.inc(5788);if ((((tb.getFormElement() != null)&&(__CLR4_2_03o53o5lnxz22of.R.iget(5789)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5790)==0&false)))
                        {__CLR4_2_03o53o5lnxz22of.R.inc(5791);return false;
                    }else {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5792);tb.insertForm(startTag, false);
                    }
                }} }else {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(5793);return anythingElse(t, tb);
                }
                }}}}}}}}}__CLR4_2_03o53o5lnxz22of.R.inc(5794);return true; // todo: check if should return processed http://www.whatwg.org/specs/web-apps/current-work/multipage/tree-construction.html#parsing-main-intable
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5795);if ((((t.isEndTag())&&(__CLR4_2_03o53o5lnxz22of.R.iget(5796)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5797)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(5798);Token.EndTag endTag = t.asEndTag();
                __CLR4_2_03o53o5lnxz22of.R.inc(5799);String name = endTag.normalName();

                __CLR4_2_03o53o5lnxz22of.R.inc(5800);if ((((name.equals("table"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5801)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5802)==0&false))) {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(5803);if ((((!tb.inTableScope(name))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5804)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5805)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5806);tb.error(this);
                        __CLR4_2_03o53o5lnxz22of.R.inc(5807);return false;
                    } }else {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5808);tb.popStackToClose("table");
                    }
                    }__CLR4_2_03o53o5lnxz22of.R.inc(5809);tb.resetInsertionMode();
                } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5810);if ((((StringUtil.in(name,
                        "body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5811)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5812)==0&false))) {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(5813);tb.error(this);
                    __CLR4_2_03o53o5lnxz22of.R.inc(5814);return false;
                } }else {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(5815);return anythingElse(t, tb);
                }
                }}__CLR4_2_03o53o5lnxz22of.R.inc(5816);return true; // todo: as above todo
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5817);if ((((t.isEOF())&&(__CLR4_2_03o53o5lnxz22of.R.iget(5818)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5819)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(5820);if ((((tb.currentElement().normalName().equals("html"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5821)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5822)==0&false)))
                    {__CLR4_2_03o53o5lnxz22of.R.inc(5823);tb.error(this);
                }__CLR4_2_03o53o5lnxz22of.R.inc(5824);return true; // stops parsing
            }
            }}}}}}__CLR4_2_03o53o5lnxz22of.R.inc(5825);return anythingElse(t, tb);
        }finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}

        boolean anythingElse(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_03o53o5lnxz22of.R.inc(5826);
            __CLR4_2_03o53o5lnxz22of.R.inc(5827);tb.error(this);
            __CLR4_2_03o53o5lnxz22of.R.inc(5828);boolean processed;
            __CLR4_2_03o53o5lnxz22of.R.inc(5829);if ((((StringUtil.in(tb.currentElement().normalName(), "table", "tbody", "tfoot", "thead", "tr"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5830)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5831)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(5832);tb.setFosterInserts(true);
                __CLR4_2_03o53o5lnxz22of.R.inc(5833);processed = tb.process(t, InBody);
                __CLR4_2_03o53o5lnxz22of.R.inc(5834);tb.setFosterInserts(false);
            } }else {{
                __CLR4_2_03o53o5lnxz22of.R.inc(5835);processed = tb.process(t, InBody);
            }
            }__CLR4_2_03o53o5lnxz22of.R.inc(5836);return processed;
        }finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}
    },
    InTableText {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_03o53o5lnxz22of.R.inc(5837);
            boolean __CLB4_2_0_bool2=false;__CLR4_2_03o53o5lnxz22of.R.inc(5838);switch (t.type) {
                case Character:if (!__CLB4_2_0_bool2) {__CLR4_2_03o53o5lnxz22of.R.inc(5839);__CLB4_2_0_bool2=true;}
                    __CLR4_2_03o53o5lnxz22of.R.inc(5840);Token.Character c = t.asCharacter();
                    __CLR4_2_03o53o5lnxz22of.R.inc(5841);if ((((c.getData().equals(nullString))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5842)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5843)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5844);tb.error(this);
                        __CLR4_2_03o53o5lnxz22of.R.inc(5845);return false;
                    } }else {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5846);tb.getPendingTableCharacters().add(c.getData());
                    }
                    }__CLR4_2_03o53o5lnxz22of.R.inc(5847);break;
                default:if (!__CLB4_2_0_bool2) {__CLR4_2_03o53o5lnxz22of.R.inc(5848);__CLB4_2_0_bool2=true;}
                    // todo - don't really like the way these table character data lists are built
                    __CLR4_2_03o53o5lnxz22of.R.inc(5849);if ((((tb.getPendingTableCharacters().size() > 0)&&(__CLR4_2_03o53o5lnxz22of.R.iget(5850)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5851)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5852);for (String character : tb.getPendingTableCharacters()) {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5853);if ((((!isWhitespace(character))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5854)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5855)==0&false))) {{
                                // InTable anything else section:
                                __CLR4_2_03o53o5lnxz22of.R.inc(5856);tb.error(this);
                                __CLR4_2_03o53o5lnxz22of.R.inc(5857);if ((((StringUtil.in(tb.currentElement().normalName(), "table", "tbody", "tfoot", "thead", "tr"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5858)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5859)==0&false))) {{
                                    __CLR4_2_03o53o5lnxz22of.R.inc(5860);tb.setFosterInserts(true);
                                    __CLR4_2_03o53o5lnxz22of.R.inc(5861);tb.process(new Token.Character().data(character), InBody);
                                    __CLR4_2_03o53o5lnxz22of.R.inc(5862);tb.setFosterInserts(false);
                                } }else {{
                                    __CLR4_2_03o53o5lnxz22of.R.inc(5863);tb.process(new Token.Character().data(character), InBody);
                                }
                            }} }else
                                {__CLR4_2_03o53o5lnxz22of.R.inc(5864);tb.insert(new Token.Character().data(character));
                        }}
                        }__CLR4_2_03o53o5lnxz22of.R.inc(5865);tb.newPendingTableCharacters();
                    }
                    }__CLR4_2_03o53o5lnxz22of.R.inc(5866);tb.transition(tb.originalState());
                    __CLR4_2_03o53o5lnxz22of.R.inc(5867);return tb.process(t);
            }
            __CLR4_2_03o53o5lnxz22of.R.inc(5868);return true;
        }finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}
    },
    InCaption {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_03o53o5lnxz22of.R.inc(5869);
            __CLR4_2_03o53o5lnxz22of.R.inc(5870);if ((((t.isEndTag() && t.asEndTag().normalName().equals("caption"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5871)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5872)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(5873);Token.EndTag endTag = t.asEndTag();
                __CLR4_2_03o53o5lnxz22of.R.inc(5874);String name = endTag.normalName();
                __CLR4_2_03o53o5lnxz22of.R.inc(5875);if ((((!tb.inTableScope(name))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5876)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5877)==0&false))) {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(5878);tb.error(this);
                    __CLR4_2_03o53o5lnxz22of.R.inc(5879);return false;
                } }else {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(5880);tb.generateImpliedEndTags();
                    __CLR4_2_03o53o5lnxz22of.R.inc(5881);if ((((!tb.currentElement().normalName().equals("caption"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5882)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5883)==0&false)))
                        {__CLR4_2_03o53o5lnxz22of.R.inc(5884);tb.error(this);
                    }__CLR4_2_03o53o5lnxz22of.R.inc(5885);tb.popStackToClose("caption");
                    __CLR4_2_03o53o5lnxz22of.R.inc(5886);tb.clearFormattingElementsToLastMarker();
                    __CLR4_2_03o53o5lnxz22of.R.inc(5887);tb.transition(InTable);
                }
            }} }else {__CLR4_2_03o53o5lnxz22of.R.inc(5888);if (((((
                    t.isStartTag() && StringUtil.in(t.asStartTag().normalName(),
                            "caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr") ||
                            t.isEndTag() && t.asEndTag().normalName().equals("table"))
                    )&&(__CLR4_2_03o53o5lnxz22of.R.iget(5889)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5890)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(5891);tb.error(this);
                __CLR4_2_03o53o5lnxz22of.R.inc(5892);boolean processed = tb.processEndTag("caption");
                __CLR4_2_03o53o5lnxz22of.R.inc(5893);if ((((processed)&&(__CLR4_2_03o53o5lnxz22of.R.iget(5894)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5895)==0&false)))
                    {__CLR4_2_03o53o5lnxz22of.R.inc(5896);return tb.process(t);
            }} }else {__CLR4_2_03o53o5lnxz22of.R.inc(5897);if ((((t.isEndTag() && StringUtil.in(t.asEndTag().normalName(),
                    "body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5898)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5899)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(5900);tb.error(this);
                __CLR4_2_03o53o5lnxz22of.R.inc(5901);return false;
            } }else {{
                __CLR4_2_03o53o5lnxz22of.R.inc(5902);return tb.process(t, InBody);
            }
            }}}__CLR4_2_03o53o5lnxz22of.R.inc(5903);return true;
        }finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}
    },
    InColumnGroup {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_03o53o5lnxz22of.R.inc(5904);
            __CLR4_2_03o53o5lnxz22of.R.inc(5905);if ((((isWhitespace(t))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5906)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5907)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(5908);tb.insert(t.asCharacter());
                __CLR4_2_03o53o5lnxz22of.R.inc(5909);return true;
            }
            }boolean __CLB4_2_0_bool3=false;__CLR4_2_03o53o5lnxz22of.R.inc(5910);switch (t.type) {
                case Comment:if (!__CLB4_2_0_bool3) {__CLR4_2_03o53o5lnxz22of.R.inc(5911);__CLB4_2_0_bool3=true;}
                    __CLR4_2_03o53o5lnxz22of.R.inc(5912);tb.insert(t.asComment());
                    __CLR4_2_03o53o5lnxz22of.R.inc(5913);break;
                case Doctype:if (!__CLB4_2_0_bool3) {__CLR4_2_03o53o5lnxz22of.R.inc(5914);__CLB4_2_0_bool3=true;}
                    __CLR4_2_03o53o5lnxz22of.R.inc(5915);tb.error(this);
                    __CLR4_2_03o53o5lnxz22of.R.inc(5916);break;
                case StartTag:if (!__CLB4_2_0_bool3) {__CLR4_2_03o53o5lnxz22of.R.inc(5917);__CLB4_2_0_bool3=true;}
                    __CLR4_2_03o53o5lnxz22of.R.inc(5918);Token.StartTag startTag = t.asStartTag();
                    boolean __CLB4_2_0_bool4=false;__CLR4_2_03o53o5lnxz22of.R.inc(5919);switch (startTag.normalName()) {
                        case "html":if (!__CLB4_2_0_bool4) {__CLR4_2_03o53o5lnxz22of.R.inc(5920);__CLB4_2_0_bool4=true;}
                            __CLR4_2_03o53o5lnxz22of.R.inc(5921);return tb.process(t, InBody);
                        case "col":if (!__CLB4_2_0_bool4) {__CLR4_2_03o53o5lnxz22of.R.inc(5922);__CLB4_2_0_bool4=true;}
                            __CLR4_2_03o53o5lnxz22of.R.inc(5923);tb.insertEmpty(startTag);
                            __CLR4_2_03o53o5lnxz22of.R.inc(5924);break;
                        default:if (!__CLB4_2_0_bool4) {__CLR4_2_03o53o5lnxz22of.R.inc(5925);__CLB4_2_0_bool4=true;}
                            __CLR4_2_03o53o5lnxz22of.R.inc(5926);return anythingElse(t, tb);
                    }
                    __CLR4_2_03o53o5lnxz22of.R.inc(5927);break;
                case EndTag:if (!__CLB4_2_0_bool3) {__CLR4_2_03o53o5lnxz22of.R.inc(5928);__CLB4_2_0_bool3=true;}
                    __CLR4_2_03o53o5lnxz22of.R.inc(5929);Token.EndTag endTag = t.asEndTag();
                    __CLR4_2_03o53o5lnxz22of.R.inc(5930);if ((((endTag.normalName.equals("colgroup"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5931)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5932)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5933);if ((((tb.currentElement().normalName().equals("html"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5934)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5935)==0&false))) {{ // frag case
                            __CLR4_2_03o53o5lnxz22of.R.inc(5936);tb.error(this);
                            __CLR4_2_03o53o5lnxz22of.R.inc(5937);return false;
                        } }else {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5938);tb.pop();
                            __CLR4_2_03o53o5lnxz22of.R.inc(5939);tb.transition(InTable);
                        }
                    }} }else
                        {__CLR4_2_03o53o5lnxz22of.R.inc(5940);return anythingElse(t, tb);
                    }__CLR4_2_03o53o5lnxz22of.R.inc(5941);break;
                case EOF:if (!__CLB4_2_0_bool3) {__CLR4_2_03o53o5lnxz22of.R.inc(5942);__CLB4_2_0_bool3=true;}
                    __CLR4_2_03o53o5lnxz22of.R.inc(5943);if ((((tb.currentElement().normalName().equals("html"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5944)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5945)==0&false)))
                        {__CLR4_2_03o53o5lnxz22of.R.inc(5946);return true; // stop parsing; frag case
                    }else
                        {__CLR4_2_03o53o5lnxz22of.R.inc(5947);return anythingElse(t, tb);
                }default:if (!__CLB4_2_0_bool3) {__CLR4_2_03o53o5lnxz22of.R.inc(5948);__CLB4_2_0_bool3=true;}
                    __CLR4_2_03o53o5lnxz22of.R.inc(5949);return anythingElse(t, tb);
            }
            __CLR4_2_03o53o5lnxz22of.R.inc(5950);return true;
        }finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}

        private boolean anythingElse(Token t, TreeBuilder tb) {try{__CLR4_2_03o53o5lnxz22of.R.inc(5951);
            __CLR4_2_03o53o5lnxz22of.R.inc(5952);boolean processed = tb.processEndTag("colgroup");
            __CLR4_2_03o53o5lnxz22of.R.inc(5953);if ((((processed)&&(__CLR4_2_03o53o5lnxz22of.R.iget(5954)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5955)==0&false))) // only ignored in frag case
                {__CLR4_2_03o53o5lnxz22of.R.inc(5956);return tb.process(t);
            }__CLR4_2_03o53o5lnxz22of.R.inc(5957);return true;
        }finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}
    },
    InTableBody {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_03o53o5lnxz22of.R.inc(5958);
            boolean __CLB4_2_0_bool5=false;__CLR4_2_03o53o5lnxz22of.R.inc(5959);switch (t.type) {
                case StartTag:if (!__CLB4_2_0_bool5) {__CLR4_2_03o53o5lnxz22of.R.inc(5960);__CLB4_2_0_bool5=true;}
                    __CLR4_2_03o53o5lnxz22of.R.inc(5961);Token.StartTag startTag = t.asStartTag();
                    __CLR4_2_03o53o5lnxz22of.R.inc(5962);String name = startTag.normalName();
                    __CLR4_2_03o53o5lnxz22of.R.inc(5963);if ((((name.equals("template"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5964)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5965)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5966);tb.insert(startTag);
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5967);if ((((name.equals("tr"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5968)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5969)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5970);tb.clearStackToTableBodyContext();
                        __CLR4_2_03o53o5lnxz22of.R.inc(5971);tb.insert(startTag);
                        __CLR4_2_03o53o5lnxz22of.R.inc(5972);tb.transition(InRow);
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5973);if ((((StringUtil.in(name, "th", "td"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5974)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5975)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5976);tb.error(this);
                        __CLR4_2_03o53o5lnxz22of.R.inc(5977);tb.processStartTag("tr");
                        __CLR4_2_03o53o5lnxz22of.R.inc(5978);return tb.process(startTag);
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(5979);if ((((StringUtil.in(name, "caption", "col", "colgroup", "tbody", "tfoot", "thead"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5980)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5981)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5982);return exitTableBody(t, tb);
                    } }else
                        {__CLR4_2_03o53o5lnxz22of.R.inc(5983);return anythingElse(t, tb);
                    }}}}__CLR4_2_03o53o5lnxz22of.R.inc(5984);break;
                case EndTag:if (!__CLB4_2_0_bool5) {__CLR4_2_03o53o5lnxz22of.R.inc(5985);__CLB4_2_0_bool5=true;}
                    __CLR4_2_03o53o5lnxz22of.R.inc(5986);Token.EndTag endTag = t.asEndTag();
                    __CLR4_2_03o53o5lnxz22of.R.inc(5987);name = endTag.normalName();
                    __CLR4_2_03o53o5lnxz22of.R.inc(5988);if ((((StringUtil.in(name, "tbody", "tfoot", "thead"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5989)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5990)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(5991);if ((((!tb.inTableScope(name))&&(__CLR4_2_03o53o5lnxz22of.R.iget(5992)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(5993)==0&false))) {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5994);tb.error(this);
                            __CLR4_2_03o53o5lnxz22of.R.inc(5995);return false;
                        } }else {{
                            __CLR4_2_03o53o5lnxz22of.R.inc(5996);tb.clearStackToTableBodyContext();
                            __CLR4_2_03o53o5lnxz22of.R.inc(5997);tb.pop();
                            __CLR4_2_03o53o5lnxz22of.R.inc(5998);tb.transition(InTable);
                        }
                    }} }else {__CLR4_2_03o53o5lnxz22of.R.inc(5999);if ((((name.equals("table"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6000)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6001)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(6002);return exitTableBody(t, tb);
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(6003);if ((((StringUtil.in(name, "body", "caption", "col", "colgroup", "html", "td", "th", "tr"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6004)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6005)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(6006);tb.error(this);
                        __CLR4_2_03o53o5lnxz22of.R.inc(6007);return false;
                    } }else
                        {__CLR4_2_03o53o5lnxz22of.R.inc(6008);return anythingElse(t, tb);
                    }}}__CLR4_2_03o53o5lnxz22of.R.inc(6009);break;
                default:if (!__CLB4_2_0_bool5) {__CLR4_2_03o53o5lnxz22of.R.inc(6010);__CLB4_2_0_bool5=true;}
                    __CLR4_2_03o53o5lnxz22of.R.inc(6011);return anythingElse(t, tb);
            }
            __CLR4_2_03o53o5lnxz22of.R.inc(6012);return true;
        }finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}

        private boolean exitTableBody(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_03o53o5lnxz22of.R.inc(6013);
            __CLR4_2_03o53o5lnxz22of.R.inc(6014);if ((((!(tb.inTableScope("tbody") || tb.inTableScope("thead") || tb.inScope("tfoot")))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6015)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6016)==0&false))) {{
                // frag case
                __CLR4_2_03o53o5lnxz22of.R.inc(6017);tb.error(this);
                __CLR4_2_03o53o5lnxz22of.R.inc(6018);return false;
            }
            }__CLR4_2_03o53o5lnxz22of.R.inc(6019);tb.clearStackToTableBodyContext();
            __CLR4_2_03o53o5lnxz22of.R.inc(6020);tb.processEndTag(tb.currentElement().normalName()); // tbody, tfoot, thead
            __CLR4_2_03o53o5lnxz22of.R.inc(6021);return tb.process(t);
        }finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}

        private boolean anythingElse(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_03o53o5lnxz22of.R.inc(6022);
            __CLR4_2_03o53o5lnxz22of.R.inc(6023);return tb.process(t, InTable);
        }finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}
    },
    InRow {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_03o53o5lnxz22of.R.inc(6024);
            __CLR4_2_03o53o5lnxz22of.R.inc(6025);if ((((t.isStartTag())&&(__CLR4_2_03o53o5lnxz22of.R.iget(6026)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6027)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(6028);Token.StartTag startTag = t.asStartTag();
                __CLR4_2_03o53o5lnxz22of.R.inc(6029);String name = startTag.normalName();

                __CLR4_2_03o53o5lnxz22of.R.inc(6030);if ((((name.equals("template"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6031)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6032)==0&false))) {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(6033);tb.insert(startTag);
                } }else {__CLR4_2_03o53o5lnxz22of.R.inc(6034);if ((((StringUtil.in(name, "th", "td"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6035)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6036)==0&false))) {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(6037);tb.clearStackToTableRowContext();
                    __CLR4_2_03o53o5lnxz22of.R.inc(6038);tb.insert(startTag);
                    __CLR4_2_03o53o5lnxz22of.R.inc(6039);tb.transition(InCell);
                    __CLR4_2_03o53o5lnxz22of.R.inc(6040);tb.insertMarkerToFormattingElements();
                } }else {__CLR4_2_03o53o5lnxz22of.R.inc(6041);if ((((StringUtil.in(name, "caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6042)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6043)==0&false))) {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(6044);return handleMissingTr(t, tb);
                } }else {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(6045);return anythingElse(t, tb);
                }
            }}}} }else {__CLR4_2_03o53o5lnxz22of.R.inc(6046);if ((((t.isEndTag())&&(__CLR4_2_03o53o5lnxz22of.R.iget(6047)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6048)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(6049);Token.EndTag endTag = t.asEndTag();
                __CLR4_2_03o53o5lnxz22of.R.inc(6050);String name = endTag.normalName();

                __CLR4_2_03o53o5lnxz22of.R.inc(6051);if ((((name.equals("tr"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6052)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6053)==0&false))) {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(6054);if ((((!tb.inTableScope(name))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6055)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6056)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(6057);tb.error(this); // frag
                        __CLR4_2_03o53o5lnxz22of.R.inc(6058);return false;
                    }
                    }__CLR4_2_03o53o5lnxz22of.R.inc(6059);tb.clearStackToTableRowContext();
                    __CLR4_2_03o53o5lnxz22of.R.inc(6060);tb.pop(); // tr
                    __CLR4_2_03o53o5lnxz22of.R.inc(6061);tb.transition(InTableBody);
                } }else {__CLR4_2_03o53o5lnxz22of.R.inc(6062);if ((((name.equals("table"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6063)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6064)==0&false))) {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(6065);return handleMissingTr(t, tb);
                } }else {__CLR4_2_03o53o5lnxz22of.R.inc(6066);if ((((StringUtil.in(name, "tbody", "tfoot", "thead"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6067)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6068)==0&false))) {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(6069);if ((((!tb.inTableScope(name))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6070)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6071)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(6072);tb.error(this);
                        __CLR4_2_03o53o5lnxz22of.R.inc(6073);return false;
                    }
                    }__CLR4_2_03o53o5lnxz22of.R.inc(6074);tb.processEndTag("tr");
                    __CLR4_2_03o53o5lnxz22of.R.inc(6075);return tb.process(t);
                } }else {__CLR4_2_03o53o5lnxz22of.R.inc(6076);if ((((StringUtil.in(name, "body", "caption", "col", "colgroup", "html", "td", "th"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6077)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6078)==0&false))) {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(6079);tb.error(this);
                    __CLR4_2_03o53o5lnxz22of.R.inc(6080);return false;
                } }else {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(6081);return anythingElse(t, tb);
                }
            }}}}} }else {{
                __CLR4_2_03o53o5lnxz22of.R.inc(6082);return anythingElse(t, tb);
            }
            }}__CLR4_2_03o53o5lnxz22of.R.inc(6083);return true;
        }finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}

        private boolean anythingElse(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_03o53o5lnxz22of.R.inc(6084);
            __CLR4_2_03o53o5lnxz22of.R.inc(6085);return tb.process(t, InTable);
        }finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}

        private boolean handleMissingTr(Token t, TreeBuilder tb) {try{__CLR4_2_03o53o5lnxz22of.R.inc(6086);
            __CLR4_2_03o53o5lnxz22of.R.inc(6087);boolean processed = tb.processEndTag("tr");
            __CLR4_2_03o53o5lnxz22of.R.inc(6088);if ((((processed)&&(__CLR4_2_03o53o5lnxz22of.R.iget(6089)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6090)==0&false)))
                {__CLR4_2_03o53o5lnxz22of.R.inc(6091);return tb.process(t);
            }else
                {__CLR4_2_03o53o5lnxz22of.R.inc(6092);return false;
        }}finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}
    },
    InCell {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_03o53o5lnxz22of.R.inc(6093);
            __CLR4_2_03o53o5lnxz22of.R.inc(6094);if ((((t.isEndTag())&&(__CLR4_2_03o53o5lnxz22of.R.iget(6095)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6096)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(6097);Token.EndTag endTag = t.asEndTag();
                __CLR4_2_03o53o5lnxz22of.R.inc(6098);String name = endTag.normalName();

                __CLR4_2_03o53o5lnxz22of.R.inc(6099);if ((((StringUtil.inSorted(name, Constants.InCellNames))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6100)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6101)==0&false))) {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(6102);if ((((!tb.inTableScope(name))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6103)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6104)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(6105);tb.error(this);
                        __CLR4_2_03o53o5lnxz22of.R.inc(6106);tb.transition(InRow); // might not be in scope if empty: <td /> and processing fake end tag
                        __CLR4_2_03o53o5lnxz22of.R.inc(6107);return false;
                    }
                    }__CLR4_2_03o53o5lnxz22of.R.inc(6108);tb.generateImpliedEndTags();
                    __CLR4_2_03o53o5lnxz22of.R.inc(6109);if ((((!tb.currentElement().normalName().equals(name))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6110)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6111)==0&false)))
                        {__CLR4_2_03o53o5lnxz22of.R.inc(6112);tb.error(this);
                    }__CLR4_2_03o53o5lnxz22of.R.inc(6113);tb.popStackToClose(name);
                    __CLR4_2_03o53o5lnxz22of.R.inc(6114);tb.clearFormattingElementsToLastMarker();
                    __CLR4_2_03o53o5lnxz22of.R.inc(6115);tb.transition(InRow);
                } }else {__CLR4_2_03o53o5lnxz22of.R.inc(6116);if ((((StringUtil.inSorted(name, Constants.InCellBody))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6117)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6118)==0&false))) {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(6119);tb.error(this);
                    __CLR4_2_03o53o5lnxz22of.R.inc(6120);return false;
                } }else {__CLR4_2_03o53o5lnxz22of.R.inc(6121);if ((((StringUtil.inSorted(name, Constants.InCellTable))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6122)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6123)==0&false))) {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(6124);if ((((!tb.inTableScope(name))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6125)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6126)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(6127);tb.error(this);
                        __CLR4_2_03o53o5lnxz22of.R.inc(6128);return false;
                    }
                    }__CLR4_2_03o53o5lnxz22of.R.inc(6129);closeCell(tb);
                    __CLR4_2_03o53o5lnxz22of.R.inc(6130);return tb.process(t);
                } }else {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(6131);return anythingElse(t, tb);
                }
            }}}} }else {__CLR4_2_03o53o5lnxz22of.R.inc(6132);if ((((t.isStartTag() &&
                    StringUtil.inSorted(t.asStartTag().normalName(), Constants.InCellCol))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6133)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6134)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(6135);if ((((!(tb.inTableScope("td") || tb.inTableScope("th")))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6136)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6137)==0&false))) {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(6138);tb.error(this);
                    __CLR4_2_03o53o5lnxz22of.R.inc(6139);return false;
                }
                }__CLR4_2_03o53o5lnxz22of.R.inc(6140);closeCell(tb);
                __CLR4_2_03o53o5lnxz22of.R.inc(6141);return tb.process(t);
            } }else {{
                __CLR4_2_03o53o5lnxz22of.R.inc(6142);return anythingElse(t, tb);
            }
            }}__CLR4_2_03o53o5lnxz22of.R.inc(6143);return true;
        }finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}

        private boolean anythingElse(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_03o53o5lnxz22of.R.inc(6144);
            __CLR4_2_03o53o5lnxz22of.R.inc(6145);return tb.process(t, InBody);
        }finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}

        private void closeCell(HtmlTreeBuilder tb) {try{__CLR4_2_03o53o5lnxz22of.R.inc(6146);
            __CLR4_2_03o53o5lnxz22of.R.inc(6147);if ((((tb.inTableScope("td"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6148)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6149)==0&false)))
                {__CLR4_2_03o53o5lnxz22of.R.inc(6150);tb.processEndTag("td");
            }else
                {__CLR4_2_03o53o5lnxz22of.R.inc(6151);tb.processEndTag("th"); // only here if th or td in scope
        }}finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}
    },
    InSelect {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_03o53o5lnxz22of.R.inc(6152);
            boolean __CLB4_2_0_bool6=false;__CLR4_2_03o53o5lnxz22of.R.inc(6153);switch (t.type) {
                case Character:if (!__CLB4_2_0_bool6) {__CLR4_2_03o53o5lnxz22of.R.inc(6154);__CLB4_2_0_bool6=true;}
                    __CLR4_2_03o53o5lnxz22of.R.inc(6155);Token.Character c = t.asCharacter();
                    __CLR4_2_03o53o5lnxz22of.R.inc(6156);if ((((c.getData().equals(nullString))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6157)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6158)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(6159);tb.error(this);
                        __CLR4_2_03o53o5lnxz22of.R.inc(6160);return false;
                    } }else {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(6161);tb.insert(c);
                    }
                    }__CLR4_2_03o53o5lnxz22of.R.inc(6162);break;
                case Comment:if (!__CLB4_2_0_bool6) {__CLR4_2_03o53o5lnxz22of.R.inc(6163);__CLB4_2_0_bool6=true;}
                    __CLR4_2_03o53o5lnxz22of.R.inc(6164);tb.insert(t.asComment());
                    __CLR4_2_03o53o5lnxz22of.R.inc(6165);break;
                case Doctype:if (!__CLB4_2_0_bool6) {__CLR4_2_03o53o5lnxz22of.R.inc(6166);__CLB4_2_0_bool6=true;}
                    __CLR4_2_03o53o5lnxz22of.R.inc(6167);tb.error(this);
                    __CLR4_2_03o53o5lnxz22of.R.inc(6168);return false;
                case StartTag:if (!__CLB4_2_0_bool6) {__CLR4_2_03o53o5lnxz22of.R.inc(6169);__CLB4_2_0_bool6=true;}
                    __CLR4_2_03o53o5lnxz22of.R.inc(6170);Token.StartTag start = t.asStartTag();
                    __CLR4_2_03o53o5lnxz22of.R.inc(6171);String name = start.normalName();
                    __CLR4_2_03o53o5lnxz22of.R.inc(6172);if ((((name.equals("html"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6173)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6174)==0&false)))
                        {__CLR4_2_03o53o5lnxz22of.R.inc(6175);return tb.process(start, InBody);
                    }else {__CLR4_2_03o53o5lnxz22of.R.inc(6176);if ((((name.equals("option"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6177)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6178)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(6179);if ((((tb.currentElement().normalName().equals("option"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6180)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6181)==0&false)))
                            {__CLR4_2_03o53o5lnxz22of.R.inc(6182);tb.processEndTag("option");
                        }__CLR4_2_03o53o5lnxz22of.R.inc(6183);tb.insert(start);
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(6184);if ((((name.equals("optgroup"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6185)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6186)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(6187);if ((((tb.currentElement().normalName().equals("option"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6188)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6189)==0&false)))
                            {__CLR4_2_03o53o5lnxz22of.R.inc(6190);tb.processEndTag("option");
                        }else {__CLR4_2_03o53o5lnxz22of.R.inc(6191);if ((((tb.currentElement().normalName().equals("optgroup"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6192)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6193)==0&false)))
                            {__CLR4_2_03o53o5lnxz22of.R.inc(6194);tb.processEndTag("optgroup");
                        }}__CLR4_2_03o53o5lnxz22of.R.inc(6195);tb.insert(start);
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(6196);if ((((name.equals("select"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6197)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6198)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(6199);tb.error(this);
                        __CLR4_2_03o53o5lnxz22of.R.inc(6200);return tb.processEndTag("select");
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(6201);if ((((StringUtil.in(name, "input", "keygen", "textarea"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6202)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6203)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(6204);tb.error(this);
                        __CLR4_2_03o53o5lnxz22of.R.inc(6205);if ((((!tb.inSelectScope("select"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6206)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6207)==0&false)))
                            {__CLR4_2_03o53o5lnxz22of.R.inc(6208);return false; // frag
                        }__CLR4_2_03o53o5lnxz22of.R.inc(6209);tb.processEndTag("select");
                        __CLR4_2_03o53o5lnxz22of.R.inc(6210);return tb.process(start);
                    } }else {__CLR4_2_03o53o5lnxz22of.R.inc(6211);if ((((name.equals("script"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6212)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6213)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(6214);return tb.process(t, InHead);
                    } }else {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(6215);return anythingElse(t, tb);
                    }
                    }}}}}}__CLR4_2_03o53o5lnxz22of.R.inc(6216);break;
                case EndTag:if (!__CLB4_2_0_bool6) {__CLR4_2_03o53o5lnxz22of.R.inc(6217);__CLB4_2_0_bool6=true;}
                    __CLR4_2_03o53o5lnxz22of.R.inc(6218);Token.EndTag end = t.asEndTag();
                    __CLR4_2_03o53o5lnxz22of.R.inc(6219);name = end.normalName();
                    boolean __CLB4_2_0_bool7=false;__CLR4_2_03o53o5lnxz22of.R.inc(6220);switch (name) {
                        case "optgroup":if (!__CLB4_2_0_bool7) {__CLR4_2_03o53o5lnxz22of.R.inc(6221);__CLB4_2_0_bool7=true;}
                            __CLR4_2_03o53o5lnxz22of.R.inc(6222);if ((((tb.currentElement().normalName().equals("option") && tb.aboveOnStack(tb.currentElement()) != null && tb.aboveOnStack(tb.currentElement()).normalName().equals("optgroup"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6223)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6224)==0&false)))
                                {__CLR4_2_03o53o5lnxz22of.R.inc(6225);tb.processEndTag("option");
                            }__CLR4_2_03o53o5lnxz22of.R.inc(6226);if ((((tb.currentElement().normalName().equals("optgroup"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6227)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6228)==0&false)))
                                {__CLR4_2_03o53o5lnxz22of.R.inc(6229);tb.pop();
                            }else
                                {__CLR4_2_03o53o5lnxz22of.R.inc(6230);tb.error(this);
                            }__CLR4_2_03o53o5lnxz22of.R.inc(6231);break;
                        case "option":if (!__CLB4_2_0_bool7) {__CLR4_2_03o53o5lnxz22of.R.inc(6232);__CLB4_2_0_bool7=true;}
                            __CLR4_2_03o53o5lnxz22of.R.inc(6233);if ((((tb.currentElement().normalName().equals("option"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6234)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6235)==0&false)))
                                {__CLR4_2_03o53o5lnxz22of.R.inc(6236);tb.pop();
                            }else
                                {__CLR4_2_03o53o5lnxz22of.R.inc(6237);tb.error(this);
                            }__CLR4_2_03o53o5lnxz22of.R.inc(6238);break;
                        case "select":if (!__CLB4_2_0_bool7) {__CLR4_2_03o53o5lnxz22of.R.inc(6239);__CLB4_2_0_bool7=true;}
                            __CLR4_2_03o53o5lnxz22of.R.inc(6240);if ((((!tb.inSelectScope(name))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6241)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6242)==0&false))) {{
                                __CLR4_2_03o53o5lnxz22of.R.inc(6243);tb.error(this);
                                __CLR4_2_03o53o5lnxz22of.R.inc(6244);return false;
                            } }else {{
                                __CLR4_2_03o53o5lnxz22of.R.inc(6245);tb.popStackToClose(name);
                                __CLR4_2_03o53o5lnxz22of.R.inc(6246);tb.resetInsertionMode();
                            }
                            }__CLR4_2_03o53o5lnxz22of.R.inc(6247);break;
                        default:if (!__CLB4_2_0_bool7) {__CLR4_2_03o53o5lnxz22of.R.inc(6248);__CLB4_2_0_bool7=true;}
                            __CLR4_2_03o53o5lnxz22of.R.inc(6249);return anythingElse(t, tb);
                    }
                    __CLR4_2_03o53o5lnxz22of.R.inc(6250);break;
                case EOF:if (!__CLB4_2_0_bool6) {__CLR4_2_03o53o5lnxz22of.R.inc(6251);__CLB4_2_0_bool6=true;}
                    __CLR4_2_03o53o5lnxz22of.R.inc(6252);if ((((!tb.currentElement().normalName().equals("html"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6253)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6254)==0&false)))
                        {__CLR4_2_03o53o5lnxz22of.R.inc(6255);tb.error(this);
                    }__CLR4_2_03o53o5lnxz22of.R.inc(6256);break;
                default:if (!__CLB4_2_0_bool6) {__CLR4_2_03o53o5lnxz22of.R.inc(6257);__CLB4_2_0_bool6=true;}
                    __CLR4_2_03o53o5lnxz22of.R.inc(6258);return anythingElse(t, tb);
            }
            __CLR4_2_03o53o5lnxz22of.R.inc(6259);return true;
        }finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}

        private boolean anythingElse(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_03o53o5lnxz22of.R.inc(6260);
            __CLR4_2_03o53o5lnxz22of.R.inc(6261);tb.error(this);
            __CLR4_2_03o53o5lnxz22of.R.inc(6262);return false;
        }finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}
    },
    InSelectInTable {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_03o53o5lnxz22of.R.inc(6263);
            __CLR4_2_03o53o5lnxz22of.R.inc(6264);if ((((t.isStartTag() && StringUtil.in(t.asStartTag().normalName(), "caption", "table", "tbody", "tfoot", "thead", "tr", "td", "th"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6265)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6266)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(6267);tb.error(this);
                __CLR4_2_03o53o5lnxz22of.R.inc(6268);tb.processEndTag("select");
                __CLR4_2_03o53o5lnxz22of.R.inc(6269);return tb.process(t);
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(6270);if ((((t.isEndTag() && StringUtil.in(t.asEndTag().normalName(), "caption", "table", "tbody", "tfoot", "thead", "tr", "td", "th"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6271)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6272)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(6273);tb.error(this);
                __CLR4_2_03o53o5lnxz22of.R.inc(6274);if ((((tb.inTableScope(t.asEndTag().normalName()))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6275)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6276)==0&false))) {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(6277);tb.processEndTag("select");
                    __CLR4_2_03o53o5lnxz22of.R.inc(6278);return (tb.process(t));
                } }else
                    {__CLR4_2_03o53o5lnxz22of.R.inc(6279);return false;
            }} }else {{
                __CLR4_2_03o53o5lnxz22of.R.inc(6280);return tb.process(t, InSelect);
            }
        }}}finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}
    },
    AfterBody {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_03o53o5lnxz22of.R.inc(6281);
            __CLR4_2_03o53o5lnxz22of.R.inc(6282);if ((((isWhitespace(t))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6283)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6284)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(6285);return tb.process(t, InBody);
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(6286);if ((((t.isComment())&&(__CLR4_2_03o53o5lnxz22of.R.iget(6287)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6288)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(6289);tb.insert(t.asComment()); // into html node
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(6290);if ((((t.isDoctype())&&(__CLR4_2_03o53o5lnxz22of.R.iget(6291)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6292)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(6293);tb.error(this);
                __CLR4_2_03o53o5lnxz22of.R.inc(6294);return false;
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(6295);if ((((t.isStartTag() && t.asStartTag().normalName().equals("html"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6296)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6297)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(6298);return tb.process(t, InBody);
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(6299);if ((((t.isEndTag() && t.asEndTag().normalName().equals("html"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6300)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6301)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(6302);if ((((tb.isFragmentParsing())&&(__CLR4_2_03o53o5lnxz22of.R.iget(6303)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6304)==0&false))) {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(6305);tb.error(this);
                    __CLR4_2_03o53o5lnxz22of.R.inc(6306);return false;
                } }else {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(6307);tb.transition(AfterAfterBody);
                }
            }} }else {__CLR4_2_03o53o5lnxz22of.R.inc(6308);if ((((t.isEOF())&&(__CLR4_2_03o53o5lnxz22of.R.iget(6309)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6310)==0&false))) {{
                // chillax! we're done
            } }else {{
                __CLR4_2_03o53o5lnxz22of.R.inc(6311);tb.error(this);
                __CLR4_2_03o53o5lnxz22of.R.inc(6312);tb.transition(InBody);
                __CLR4_2_03o53o5lnxz22of.R.inc(6313);return tb.process(t);
            }
            }}}}}}__CLR4_2_03o53o5lnxz22of.R.inc(6314);return true;
        }finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}
    },
    InFrameset {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_03o53o5lnxz22of.R.inc(6315);
            __CLR4_2_03o53o5lnxz22of.R.inc(6316);if ((((isWhitespace(t))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6317)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6318)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(6319);tb.insert(t.asCharacter());
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(6320);if ((((t.isComment())&&(__CLR4_2_03o53o5lnxz22of.R.iget(6321)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6322)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(6323);tb.insert(t.asComment());
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(6324);if ((((t.isDoctype())&&(__CLR4_2_03o53o5lnxz22of.R.iget(6325)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6326)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(6327);tb.error(this);
                __CLR4_2_03o53o5lnxz22of.R.inc(6328);return false;
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(6329);if ((((t.isStartTag())&&(__CLR4_2_03o53o5lnxz22of.R.iget(6330)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6331)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(6332);Token.StartTag start = t.asStartTag();
                boolean __CLB4_2_0_bool8=false;__CLR4_2_03o53o5lnxz22of.R.inc(6333);switch (start.normalName()) {
                    case "html":if (!__CLB4_2_0_bool8) {__CLR4_2_03o53o5lnxz22of.R.inc(6334);__CLB4_2_0_bool8=true;}
                        __CLR4_2_03o53o5lnxz22of.R.inc(6335);return tb.process(start, InBody);
                    case "frameset":if (!__CLB4_2_0_bool8) {__CLR4_2_03o53o5lnxz22of.R.inc(6336);__CLB4_2_0_bool8=true;}
                        __CLR4_2_03o53o5lnxz22of.R.inc(6337);tb.insert(start);
                        __CLR4_2_03o53o5lnxz22of.R.inc(6338);break;
                    case "frame":if (!__CLB4_2_0_bool8) {__CLR4_2_03o53o5lnxz22of.R.inc(6339);__CLB4_2_0_bool8=true;}
                        __CLR4_2_03o53o5lnxz22of.R.inc(6340);tb.insertEmpty(start);
                        __CLR4_2_03o53o5lnxz22of.R.inc(6341);break;
                    case "noframes":if (!__CLB4_2_0_bool8) {__CLR4_2_03o53o5lnxz22of.R.inc(6342);__CLB4_2_0_bool8=true;}
                        __CLR4_2_03o53o5lnxz22of.R.inc(6343);return tb.process(start, InHead);
                    default:if (!__CLB4_2_0_bool8) {__CLR4_2_03o53o5lnxz22of.R.inc(6344);__CLB4_2_0_bool8=true;}
                        __CLR4_2_03o53o5lnxz22of.R.inc(6345);tb.error(this);
                        __CLR4_2_03o53o5lnxz22of.R.inc(6346);return false;
                }
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(6347);if ((((t.isEndTag() && t.asEndTag().normalName().equals("frameset"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6348)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6349)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(6350);if ((((tb.currentElement().normalName().equals("html"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6351)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6352)==0&false))) {{ // frag
                    __CLR4_2_03o53o5lnxz22of.R.inc(6353);tb.error(this);
                    __CLR4_2_03o53o5lnxz22of.R.inc(6354);return false;
                } }else {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(6355);tb.pop();
                    __CLR4_2_03o53o5lnxz22of.R.inc(6356);if ((((!tb.isFragmentParsing() && !tb.currentElement().normalName().equals("frameset"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6357)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6358)==0&false))) {{
                        __CLR4_2_03o53o5lnxz22of.R.inc(6359);tb.transition(AfterFrameset);
                    }
                }}
            }} }else {__CLR4_2_03o53o5lnxz22of.R.inc(6360);if ((((t.isEOF())&&(__CLR4_2_03o53o5lnxz22of.R.iget(6361)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6362)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(6363);if ((((!tb.currentElement().normalName().equals("html"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6364)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6365)==0&false))) {{
                    __CLR4_2_03o53o5lnxz22of.R.inc(6366);tb.error(this);
                    __CLR4_2_03o53o5lnxz22of.R.inc(6367);return true;
                }
            }} }else {{
                __CLR4_2_03o53o5lnxz22of.R.inc(6368);tb.error(this);
                __CLR4_2_03o53o5lnxz22of.R.inc(6369);return false;
            }
            }}}}}}__CLR4_2_03o53o5lnxz22of.R.inc(6370);return true;
        }finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}
    },
    AfterFrameset {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_03o53o5lnxz22of.R.inc(6371);
            __CLR4_2_03o53o5lnxz22of.R.inc(6372);if ((((isWhitespace(t))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6373)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6374)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(6375);tb.insert(t.asCharacter());
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(6376);if ((((t.isComment())&&(__CLR4_2_03o53o5lnxz22of.R.iget(6377)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6378)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(6379);tb.insert(t.asComment());
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(6380);if ((((t.isDoctype())&&(__CLR4_2_03o53o5lnxz22of.R.iget(6381)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6382)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(6383);tb.error(this);
                __CLR4_2_03o53o5lnxz22of.R.inc(6384);return false;
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(6385);if ((((t.isStartTag() && t.asStartTag().normalName().equals("html"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6386)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6387)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(6388);return tb.process(t, InBody);
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(6389);if ((((t.isEndTag() && t.asEndTag().normalName().equals("html"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6390)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6391)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(6392);tb.transition(AfterAfterFrameset);
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(6393);if ((((t.isStartTag() && t.asStartTag().normalName().equals("noframes"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6394)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6395)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(6396);return tb.process(t, InHead);
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(6397);if ((((t.isEOF())&&(__CLR4_2_03o53o5lnxz22of.R.iget(6398)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6399)==0&false))) {{
                // cool your heels, we're complete
            } }else {{
                __CLR4_2_03o53o5lnxz22of.R.inc(6400);tb.error(this);
                __CLR4_2_03o53o5lnxz22of.R.inc(6401);return false;
            }
            }}}}}}}__CLR4_2_03o53o5lnxz22of.R.inc(6402);return true;
        }finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}
    },
    AfterAfterBody {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_03o53o5lnxz22of.R.inc(6403);
            __CLR4_2_03o53o5lnxz22of.R.inc(6404);if ((((t.isComment())&&(__CLR4_2_03o53o5lnxz22of.R.iget(6405)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6406)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(6407);tb.insert(t.asComment());
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(6408);if ((((t.isDoctype() || isWhitespace(t) || (t.isStartTag() && t.asStartTag().normalName().equals("html")))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6409)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6410)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(6411);return tb.process(t, InBody);
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(6412);if ((((t.isEOF())&&(__CLR4_2_03o53o5lnxz22of.R.iget(6413)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6414)==0&false))) {{
                // nice work chuck
            } }else {{
                __CLR4_2_03o53o5lnxz22of.R.inc(6415);tb.error(this);
                __CLR4_2_03o53o5lnxz22of.R.inc(6416);tb.transition(InBody);
                __CLR4_2_03o53o5lnxz22of.R.inc(6417);return tb.process(t);
            }
            }}}__CLR4_2_03o53o5lnxz22of.R.inc(6418);return true;
        }finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}
    },
    AfterAfterFrameset {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_03o53o5lnxz22of.R.inc(6419);
            __CLR4_2_03o53o5lnxz22of.R.inc(6420);if ((((t.isComment())&&(__CLR4_2_03o53o5lnxz22of.R.iget(6421)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6422)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(6423);tb.insert(t.asComment());
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(6424);if ((((t.isDoctype() || isWhitespace(t) || (t.isStartTag() && t.asStartTag().normalName().equals("html")))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6425)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6426)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(6427);return tb.process(t, InBody);
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(6428);if ((((t.isEOF())&&(__CLR4_2_03o53o5lnxz22of.R.iget(6429)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6430)==0&false))) {{
                // nice work chuck
            } }else {__CLR4_2_03o53o5lnxz22of.R.inc(6431);if ((((t.isStartTag() && t.asStartTag().normalName().equals("noframes"))&&(__CLR4_2_03o53o5lnxz22of.R.iget(6432)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6433)==0&false))) {{
                __CLR4_2_03o53o5lnxz22of.R.inc(6434);return tb.process(t, InHead);
            } }else {{
                __CLR4_2_03o53o5lnxz22of.R.inc(6435);tb.error(this);
                __CLR4_2_03o53o5lnxz22of.R.inc(6436);return false;
            }
            }}}}__CLR4_2_03o53o5lnxz22of.R.inc(6437);return true;
        }finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}
    },
    ForeignContent {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_2_03o53o5lnxz22of.R.inc(6438);
            __CLR4_2_03o53o5lnxz22of.R.inc(6439);return true;
            // todo: implement. Also; how do we get here?
        }finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}
    };

    private static String nullString = String.valueOf('\u0000');

    abstract boolean process(Token t, HtmlTreeBuilder tb);

    private static boolean isWhitespace(Token t) {try{__CLR4_2_03o53o5lnxz22of.R.inc(6440);
        __CLR4_2_03o53o5lnxz22of.R.inc(6441);if ((((t.isCharacter())&&(__CLR4_2_03o53o5lnxz22of.R.iget(6442)!=0|true))||(__CLR4_2_03o53o5lnxz22of.R.iget(6443)==0&false))) {{
            __CLR4_2_03o53o5lnxz22of.R.inc(6444);String data = t.asCharacter().getData();
            __CLR4_2_03o53o5lnxz22of.R.inc(6445);return isWhitespace(data);
        }
        }__CLR4_2_03o53o5lnxz22of.R.inc(6446);return false;
    }finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}

    private static boolean isWhitespace(String data) {try{__CLR4_2_03o53o5lnxz22of.R.inc(6447);
        __CLR4_2_03o53o5lnxz22of.R.inc(6448);return StringUtil.isBlank(data);
    }finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}

    private static void handleRcData(Token.StartTag startTag, HtmlTreeBuilder tb) {try{__CLR4_2_03o53o5lnxz22of.R.inc(6449);
        __CLR4_2_03o53o5lnxz22of.R.inc(6450);tb.tokeniser.transition(TokeniserState.Rcdata);
        __CLR4_2_03o53o5lnxz22of.R.inc(6451);tb.markInsertionMode();
        __CLR4_2_03o53o5lnxz22of.R.inc(6452);tb.transition(Text);
        __CLR4_2_03o53o5lnxz22of.R.inc(6453);tb.insert(startTag);
    }finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}

    private static void handleRawtext(Token.StartTag startTag, HtmlTreeBuilder tb) {try{__CLR4_2_03o53o5lnxz22of.R.inc(6454);
        __CLR4_2_03o53o5lnxz22of.R.inc(6455);tb.tokeniser.transition(TokeniserState.Rawtext);
        __CLR4_2_03o53o5lnxz22of.R.inc(6456);tb.markInsertionMode();
        __CLR4_2_03o53o5lnxz22of.R.inc(6457);tb.transition(Text);
        __CLR4_2_03o53o5lnxz22of.R.inc(6458);tb.insert(startTag);
    }finally{__CLR4_2_03o53o5lnxz22of.R.flushNeeded();}}

    // lists of tags to search through. A little harder to read here, but causes less GC than dynamic varargs.
    // was contributing around 10% of parse GC load.
    // must make sure these are sorted, as used in findSorted. MUST update HtmlTreebuilderStateTest if more arrays added.
    static final class Constants {
        static final String[] InBodyStartToHead = new String[]{"base", "basefont", "bgsound", "command", "link", "meta", "noframes", "script", "style", "title"};
        static final String[] InBodyStartPClosers = new String[]{"address", "article", "aside", "blockquote", "center", "details", "dir", "div", "dl",
            "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "menu", "nav", "ol",
            "p", "section", "summary", "ul"};
        static final String[] Headings = new String[]{"h1", "h2", "h3", "h4", "h5", "h6"};
        static final String[] InBodyStartPreListing = new String[]{"listing", "pre"};
        static final String[] InBodyStartLiBreakers = new String[]{"address", "div", "p"};
        static final String[] DdDt = new String[]{"dd", "dt"};
        static final String[] Formatters = new String[]{"b", "big", "code", "em", "font", "i", "s", "small", "strike", "strong", "tt", "u"};
        static final String[] InBodyStartApplets = new String[]{"applet", "marquee", "object"};
        static final String[] InBodyStartEmptyFormatters = new String[]{"area", "br", "embed", "img", "keygen", "wbr"};
        static final String[] InBodyStartMedia = new String[]{"param", "source", "track"};
        static final String[] InBodyStartInputAttribs = new String[]{"action", "name", "prompt"};
        static final String[] InBodyStartOptions = new String[]{"optgroup", "option"};
        static final String[] InBodyStartRuby = new String[]{"rp", "rt"};
        static final String[] InBodyStartDrop = new String[]{"caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr"};
        static final String[] InBodyEndClosers = new String[]{"address", "article", "aside", "blockquote", "button", "center", "details", "dir", "div",
            "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu",
            "nav", "ol", "pre", "section", "summary", "ul"};
        static final String[] InBodyEndAdoptionFormatters = new String[]{"a", "b", "big", "code", "em", "font", "i", "nobr", "s", "small", "strike", "strong", "tt", "u"};
        static final String[] InBodyEndTableFosters = new String[]{"table", "tbody", "tfoot", "thead", "tr"};
        static final String[] InCellNames = new String[]{"td", "th"};
        static final String[] InCellBody = new String[]{"body", "caption", "col", "colgroup", "html"};
        static final String[] InCellTable = new String[]{ "table", "tbody", "tfoot", "thead", "tr"};
        static final String[] InCellCol = new String[]{"caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr"};
    }
;public static class __CLR4_2_03o53o5lnxz22of{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,6459,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;}
