/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.examples;

import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Example program to list links from a URL.
 */
public class ListLinks {public static class __CLR4_2_04g4glnxz22eo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,189,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) throws IOException {try{__CLR4_2_04g4glnxz22eo.R.inc(160);
        __CLR4_2_04g4glnxz22eo.R.inc(161);Validate.isTrue(args.length == 1, "usage: supply url to fetch");
        __CLR4_2_04g4glnxz22eo.R.inc(162);String url = args[0];
        __CLR4_2_04g4glnxz22eo.R.inc(163);print("Fetching %s...", url);

        __CLR4_2_04g4glnxz22eo.R.inc(164);Document doc = Jsoup.connect(url).get();
        __CLR4_2_04g4glnxz22eo.R.inc(165);Elements links = doc.select("a[href]");
        __CLR4_2_04g4glnxz22eo.R.inc(166);Elements media = doc.select("[src]");
        __CLR4_2_04g4glnxz22eo.R.inc(167);Elements imports = doc.select("link[href]");

        __CLR4_2_04g4glnxz22eo.R.inc(168);print("\nMedia: (%d)", media.size());
        __CLR4_2_04g4glnxz22eo.R.inc(169);for (Element src : media) {{
            __CLR4_2_04g4glnxz22eo.R.inc(170);if ((((src.tagName().equals("img"))&&(__CLR4_2_04g4glnxz22eo.R.iget(171)!=0|true))||(__CLR4_2_04g4glnxz22eo.R.iget(172)==0&false)))
                {__CLR4_2_04g4glnxz22eo.R.inc(173);print(" * %s: <%s> %sx%s (%s)",
                        src.tagName(), src.attr("abs:src"), src.attr("width"), src.attr("height"),
                        trim(src.attr("alt"), 20));
            }else
                {__CLR4_2_04g4glnxz22eo.R.inc(174);print(" * %s: <%s>", src.tagName(), src.attr("abs:src"));
        }}

        }__CLR4_2_04g4glnxz22eo.R.inc(175);print("\nImports: (%d)", imports.size());
        __CLR4_2_04g4glnxz22eo.R.inc(176);for (Element link : imports) {{
            __CLR4_2_04g4glnxz22eo.R.inc(177);print(" * %s <%s> (%s)", link.tagName(),link.attr("abs:href"), link.attr("rel"));
        }

        }__CLR4_2_04g4glnxz22eo.R.inc(178);print("\nLinks: (%d)", links.size());
        __CLR4_2_04g4glnxz22eo.R.inc(179);for (Element link : links) {{
            __CLR4_2_04g4glnxz22eo.R.inc(180);print(" * a: <%s>  (%s)", link.attr("abs:href"), trim(link.text(), 35));
        }
    }}finally{__CLR4_2_04g4glnxz22eo.R.flushNeeded();}}

    private static void print(String msg, Object... args) {try{__CLR4_2_04g4glnxz22eo.R.inc(181);
        __CLR4_2_04g4glnxz22eo.R.inc(182);System.out.println(String.format(msg, args));
    }finally{__CLR4_2_04g4glnxz22eo.R.flushNeeded();}}

    private static String trim(String s, int width) {try{__CLR4_2_04g4glnxz22eo.R.inc(183);
        __CLR4_2_04g4glnxz22eo.R.inc(184);if ((((s.length() > width)&&(__CLR4_2_04g4glnxz22eo.R.iget(185)!=0|true))||(__CLR4_2_04g4glnxz22eo.R.iget(186)==0&false)))
            {__CLR4_2_04g4glnxz22eo.R.inc(187);return s.substring(0, width-1) + ".";
        }else
            {__CLR4_2_04g4glnxz22eo.R.inc(188);return s;
    }}finally{__CLR4_2_04g4glnxz22eo.R.flushNeeded();}}
}
