/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.examples;

import org.jsoup.Jsoup;
import org.jsoup.internal.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

import java.io.IOException;

/**
 * HTML to plain-text. This example program demonstrates the use of jsoup to convert HTML input to lightly-formatted
 * plain-text. That is divergent from the general goal of jsoup's .text() methods, which is to get clean data from a
 * scrape.
 * <p>
 * Note that this is a fairly simplistic formatter -- for real world use you'll want to embrace and extend.
 * </p>
 * <p>
 * To invoke from the command line, assuming you've downloaded the jsoup jar to your current directory:</p>
 * <p><code>java -cp jsoup.jar org.jsoup.examples.HtmlToPlainText url [selector]</code></p>
 * where <i>url</i> is the URL to fetch, and <i>selector</i> is an optional CSS selector.
 * 
 * @author Jonathan Hedley, jonathan@hedley.net
 */
public class HtmlToPlainText {public static class __CLR4_2_02626lnxz22ei{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,160,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final String userAgent = "Mozilla/5.0 (jsoup)";
    private static final int timeout = 5 * 1000;

    public static void main(String... args) throws IOException {try{__CLR4_2_02626lnxz22ei.R.inc(78);
        __CLR4_2_02626lnxz22ei.R.inc(79);Validate.isTrue(args.length == 1 || args.length == 2, "usage: java -cp jsoup.jar org.jsoup.examples.HtmlToPlainText url [selector]");
        __CLR4_2_02626lnxz22ei.R.inc(80);final String url = args[0];
        __CLR4_2_02626lnxz22ei.R.inc(81);final String selector = (((args.length == 2 )&&(__CLR4_2_02626lnxz22ei.R.iget(82)!=0|true))||(__CLR4_2_02626lnxz22ei.R.iget(83)==0&false))? args[1] : null;

        // fetch the specified URL and parse to a HTML DOM
        __CLR4_2_02626lnxz22ei.R.inc(84);Document doc = Jsoup.connect(url).userAgent(userAgent).timeout(timeout).get();

        __CLR4_2_02626lnxz22ei.R.inc(85);HtmlToPlainText formatter = new HtmlToPlainText();

        __CLR4_2_02626lnxz22ei.R.inc(86);if ((((selector != null)&&(__CLR4_2_02626lnxz22ei.R.iget(87)!=0|true))||(__CLR4_2_02626lnxz22ei.R.iget(88)==0&false))) {{
            __CLR4_2_02626lnxz22ei.R.inc(89);Elements elements = doc.select(selector); // get each element that matches the CSS selector
            __CLR4_2_02626lnxz22ei.R.inc(90);for (Element element : elements) {{
                __CLR4_2_02626lnxz22ei.R.inc(91);String plainText = formatter.getPlainText(element); // format that element to plain text
                __CLR4_2_02626lnxz22ei.R.inc(92);System.out.println(plainText);
            }
        }} }else {{ // format the whole doc
            __CLR4_2_02626lnxz22ei.R.inc(93);String plainText = formatter.getPlainText(doc);
            __CLR4_2_02626lnxz22ei.R.inc(94);System.out.println(plainText);
        }
    }}finally{__CLR4_2_02626lnxz22ei.R.flushNeeded();}}

    /**
     * Format an Element to plain-text
     * @param element the root element to format
     * @return formatted text
     */
    public String getPlainText(Element element) {try{__CLR4_2_02626lnxz22ei.R.inc(95);
        __CLR4_2_02626lnxz22ei.R.inc(96);FormattingVisitor formatter = new FormattingVisitor();
        __CLR4_2_02626lnxz22ei.R.inc(97);NodeTraversor.traverse(formatter, element); // walk the DOM, and call .head() and .tail() for each node

        __CLR4_2_02626lnxz22ei.R.inc(98);return formatter.toString();
    }finally{__CLR4_2_02626lnxz22ei.R.flushNeeded();}}

    // the formatting rules, implemented in a breadth-first DOM traverse
    private static class FormattingVisitor implements NodeVisitor {
        private static final int maxWidth = 80;
        private int width = 0;
        private StringBuilder accum = new StringBuilder(); // holds the accumulated text

        // hit when the node is first seen
        public void head(Node node, int depth) {try{__CLR4_2_02626lnxz22ei.R.inc(99);
            __CLR4_2_02626lnxz22ei.R.inc(100);String name = node.nodeName();
            __CLR4_2_02626lnxz22ei.R.inc(101);if ((((node instanceof TextNode)&&(__CLR4_2_02626lnxz22ei.R.iget(102)!=0|true))||(__CLR4_2_02626lnxz22ei.R.iget(103)==0&false)))
                {__CLR4_2_02626lnxz22ei.R.inc(104);append(((TextNode) node).text()); // TextNodes carry all user-readable text in the DOM.
            }else {__CLR4_2_02626lnxz22ei.R.inc(105);if ((((name.equals("li"))&&(__CLR4_2_02626lnxz22ei.R.iget(106)!=0|true))||(__CLR4_2_02626lnxz22ei.R.iget(107)==0&false)))
                {__CLR4_2_02626lnxz22ei.R.inc(108);append("\n * ");
            }else {__CLR4_2_02626lnxz22ei.R.inc(109);if ((((name.equals("dt"))&&(__CLR4_2_02626lnxz22ei.R.iget(110)!=0|true))||(__CLR4_2_02626lnxz22ei.R.iget(111)==0&false)))
                {__CLR4_2_02626lnxz22ei.R.inc(112);append("  ");
            }else {__CLR4_2_02626lnxz22ei.R.inc(113);if ((((StringUtil.in(name, "p", "h1", "h2", "h3", "h4", "h5", "tr"))&&(__CLR4_2_02626lnxz22ei.R.iget(114)!=0|true))||(__CLR4_2_02626lnxz22ei.R.iget(115)==0&false)))
                {__CLR4_2_02626lnxz22ei.R.inc(116);append("\n");
        }}}}}finally{__CLR4_2_02626lnxz22ei.R.flushNeeded();}}

        // hit when all of the node's children (if any) have been visited
        public void tail(Node node, int depth) {try{__CLR4_2_02626lnxz22ei.R.inc(117);
            __CLR4_2_02626lnxz22ei.R.inc(118);String name = node.nodeName();
            __CLR4_2_02626lnxz22ei.R.inc(119);if ((((StringUtil.in(name, "br", "dd", "dt", "p", "h1", "h2", "h3", "h4", "h5"))&&(__CLR4_2_02626lnxz22ei.R.iget(120)!=0|true))||(__CLR4_2_02626lnxz22ei.R.iget(121)==0&false)))
                {__CLR4_2_02626lnxz22ei.R.inc(122);append("\n");
            }else {__CLR4_2_02626lnxz22ei.R.inc(123);if ((((name.equals("a"))&&(__CLR4_2_02626lnxz22ei.R.iget(124)!=0|true))||(__CLR4_2_02626lnxz22ei.R.iget(125)==0&false)))
                {__CLR4_2_02626lnxz22ei.R.inc(126);append(String.format(" <%s>", node.absUrl("href")));
        }}}finally{__CLR4_2_02626lnxz22ei.R.flushNeeded();}}

        // appends text to the string builder with a simple word wrap method
        private void append(String text) {try{__CLR4_2_02626lnxz22ei.R.inc(127);
            __CLR4_2_02626lnxz22ei.R.inc(128);if ((((text.startsWith("\n"))&&(__CLR4_2_02626lnxz22ei.R.iget(129)!=0|true))||(__CLR4_2_02626lnxz22ei.R.iget(130)==0&false)))
                {__CLR4_2_02626lnxz22ei.R.inc(131);width = 0; // reset counter if starts with a newline. only from formats above, not in natural text
            }__CLR4_2_02626lnxz22ei.R.inc(132);if ((((text.equals(" ") &&
                    (accum.length() == 0 || StringUtil.in(accum.substring(accum.length() - 1), " ", "\n")))&&(__CLR4_2_02626lnxz22ei.R.iget(133)!=0|true))||(__CLR4_2_02626lnxz22ei.R.iget(134)==0&false)))
                {__CLR4_2_02626lnxz22ei.R.inc(135);return; // don't accumulate long runs of empty spaces

            }__CLR4_2_02626lnxz22ei.R.inc(136);if ((((text.length() + width > maxWidth)&&(__CLR4_2_02626lnxz22ei.R.iget(137)!=0|true))||(__CLR4_2_02626lnxz22ei.R.iget(138)==0&false))) {{ // won't fit, needs to wrap
                __CLR4_2_02626lnxz22ei.R.inc(139);String[] words = text.split("\\s+");
                __CLR4_2_02626lnxz22ei.R.inc(140);for (int i = 0; (((i < words.length)&&(__CLR4_2_02626lnxz22ei.R.iget(141)!=0|true))||(__CLR4_2_02626lnxz22ei.R.iget(142)==0&false)); i++) {{
                    __CLR4_2_02626lnxz22ei.R.inc(143);String word = words[i];
                    __CLR4_2_02626lnxz22ei.R.inc(144);boolean last = i == words.length - 1;
                    __CLR4_2_02626lnxz22ei.R.inc(145);if ((((!last)&&(__CLR4_2_02626lnxz22ei.R.iget(146)!=0|true))||(__CLR4_2_02626lnxz22ei.R.iget(147)==0&false))) // insert a space if not the last word
                        {__CLR4_2_02626lnxz22ei.R.inc(148);word = word + " ";
                    }__CLR4_2_02626lnxz22ei.R.inc(149);if ((((word.length() + width > maxWidth)&&(__CLR4_2_02626lnxz22ei.R.iget(150)!=0|true))||(__CLR4_2_02626lnxz22ei.R.iget(151)==0&false))) {{ // wrap and reset counter
                        __CLR4_2_02626lnxz22ei.R.inc(152);accum.append("\n").append(word);
                        __CLR4_2_02626lnxz22ei.R.inc(153);width = word.length();
                    } }else {{
                        __CLR4_2_02626lnxz22ei.R.inc(154);accum.append(word);
                        __CLR4_2_02626lnxz22ei.R.inc(155);width += word.length();
                    }
                }}
            }} }else {{ // fits as is, without need to wrap text
                __CLR4_2_02626lnxz22ei.R.inc(156);accum.append(text);
                __CLR4_2_02626lnxz22ei.R.inc(157);width += text.length();
            }
        }}finally{__CLR4_2_02626lnxz22ei.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_02626lnxz22ei.R.inc(158);
            __CLR4_2_02626lnxz22ei.R.inc(159);return accum.toString();
        }finally{__CLR4_2_02626lnxz22ei.R.flushNeeded();}}
    }
}
