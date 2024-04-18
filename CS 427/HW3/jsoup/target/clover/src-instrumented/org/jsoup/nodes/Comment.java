/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.parser.Parser;

import java.io.IOException;

/**
 A comment node.

 @author Jonathan Hedley, jonathan@hedley.net */
public class Comment extends LeafNode {public static class __CLR4_2_01j31j3lnxz22je{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,2014,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final String COMMENT_KEY = "comment";

    /**
     Create a new comment node.
     @param data The contents of the comment
     */
    public Comment(String data) {try{__CLR4_2_01j31j3lnxz22je.R.inc(1983);
        __CLR4_2_01j31j3lnxz22je.R.inc(1984);value = data;
    }finally{__CLR4_2_01j31j3lnxz22je.R.flushNeeded();}}

    /**
     Create a new comment node.
     @param data The contents of the comment
     @param baseUri base URI not used. This is a leaf node.
     @deprecated
     */
    public Comment(String data, String baseUri) {
        this(data);__CLR4_2_01j31j3lnxz22je.R.inc(1986);try{__CLR4_2_01j31j3lnxz22je.R.inc(1985);
    }finally{__CLR4_2_01j31j3lnxz22je.R.flushNeeded();}}

    public String nodeName() {try{__CLR4_2_01j31j3lnxz22je.R.inc(1987);
        __CLR4_2_01j31j3lnxz22je.R.inc(1988);return "#comment";
    }finally{__CLR4_2_01j31j3lnxz22je.R.flushNeeded();}}

    /**
     Get the contents of the comment.
     @return comment content
     */
    public String getData() {try{__CLR4_2_01j31j3lnxz22je.R.inc(1989);
        __CLR4_2_01j31j3lnxz22je.R.inc(1990);return coreValue();
    }finally{__CLR4_2_01j31j3lnxz22je.R.flushNeeded();}}

	void outerHtmlHead(Appendable accum, int depth, Document.OutputSettings out) throws IOException {try{__CLR4_2_01j31j3lnxz22je.R.inc(1991);
        __CLR4_2_01j31j3lnxz22je.R.inc(1992);if ((((out.prettyPrint())&&(__CLR4_2_01j31j3lnxz22je.R.iget(1993)!=0|true))||(__CLR4_2_01j31j3lnxz22je.R.iget(1994)==0&false)))
            {__CLR4_2_01j31j3lnxz22je.R.inc(1995);indent(accum, depth, out);
        }__CLR4_2_01j31j3lnxz22je.R.inc(1996);accum
                .append("<!--")
                .append(getData())
                .append("-->");
    }finally{__CLR4_2_01j31j3lnxz22je.R.flushNeeded();}}

	void outerHtmlTail(Appendable accum, int depth, Document.OutputSettings out) {try{__CLR4_2_01j31j3lnxz22je.R.inc(1997);}finally{__CLR4_2_01j31j3lnxz22je.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_2_01j31j3lnxz22je.R.inc(1998);
        __CLR4_2_01j31j3lnxz22je.R.inc(1999);return outerHtml();
    }finally{__CLR4_2_01j31j3lnxz22je.R.flushNeeded();}}

    /**
     * Check if this comment looks like an XML Declaration.
     * @return true if it looks like, maybe, it's an XML Declaration.
     */
    public boolean isXmlDeclaration() {try{__CLR4_2_01j31j3lnxz22je.R.inc(2000);
        __CLR4_2_01j31j3lnxz22je.R.inc(2001);String data = getData();
        __CLR4_2_01j31j3lnxz22je.R.inc(2002);return (data.length() > 1 && (data.startsWith("!") || data.startsWith("?")));
    }finally{__CLR4_2_01j31j3lnxz22je.R.flushNeeded();}}

    /**
     * Attempt to cast this comment to an XML Declaration note.
     * @return an XML declaration if it could be parsed as one, null otherwise.
     */
    public XmlDeclaration asXmlDeclaration() {try{__CLR4_2_01j31j3lnxz22je.R.inc(2003);
        __CLR4_2_01j31j3lnxz22je.R.inc(2004);String data = getData();
        __CLR4_2_01j31j3lnxz22je.R.inc(2005);Document doc = Jsoup.parse("<" + data.substring(1, data.length() -1) + ">", baseUri(), Parser.xmlParser());
        __CLR4_2_01j31j3lnxz22je.R.inc(2006);XmlDeclaration decl = null;
        __CLR4_2_01j31j3lnxz22je.R.inc(2007);if ((((doc.children().size() > 0)&&(__CLR4_2_01j31j3lnxz22je.R.iget(2008)!=0|true))||(__CLR4_2_01j31j3lnxz22je.R.iget(2009)==0&false))) {{
            __CLR4_2_01j31j3lnxz22je.R.inc(2010);Element el = doc.child(0);
            __CLR4_2_01j31j3lnxz22je.R.inc(2011);decl = new XmlDeclaration(NodeUtils.parser(doc).settings().normalizeTag(el.tagName()), data.startsWith("!"));
            __CLR4_2_01j31j3lnxz22je.R.inc(2012);decl.attributes().addAll(el.attributes());
        }
        }__CLR4_2_01j31j3lnxz22je.R.inc(2013);return decl;
    }finally{__CLR4_2_01j31j3lnxz22je.R.flushNeeded();}}
}
