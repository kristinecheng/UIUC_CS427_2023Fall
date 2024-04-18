/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.mytests;

import org.jsoup.Jsoup;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class ManualTest {static class __CLR4_2_0e1le1llnxz2360{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767707166L,8589935092L,18271,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test public void testSetHtmlTitle1() {__CLR4_2_0e1le1llnxz2360.R.globalSliceStart(getClass().getName(),18201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0wtvb23e1l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e1le1llnxz2360.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e1le1llnxz2360.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.ManualTest.testSetHtmlTitle1",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18201,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0wtvb23e1l(){try{__CLR4_2_0e1le1llnxz2360.R.inc(18201);
        __CLR4_2_0e1le1llnxz2360.R.inc(18202);Document doc1 = Jsoup.parse("<html><head id=2><iframe id=1></iframe></head></html>");
        __CLR4_2_0e1le1llnxz2360.R.inc(18203);Document doc2 = Jsoup.parse("<html><head id=2><noembed id=1></noembed></head></html>");
        __CLR4_2_0e1le1llnxz2360.R.inc(18204);Document doc3 = Jsoup.parse("<html><head id=2><noframes id=1></noframes></head></html>");
        __CLR4_2_0e1le1llnxz2360.R.inc(18205);Document doc4 = Jsoup.parse("<html><head id=2><style id=1></style></head></html>");
        __CLR4_2_0e1le1llnxz2360.R.inc(18206);Document doc5 = Jsoup.parse("<html><head id=2><xmp id=1></xmp></head></html>");

        __CLR4_2_0e1le1llnxz2360.R.inc(18207);Element iframe = doc1.getElementById("1");
        __CLR4_2_0e1le1llnxz2360.R.inc(18208);iframe.html("good");
        __CLR4_2_0e1le1llnxz2360.R.inc(18209);assertEquals("good", iframe.html());
        __CLR4_2_0e1le1llnxz2360.R.inc(18210);iframe.html("<i>bad</i>");
        __CLR4_2_0e1le1llnxz2360.R.inc(18211);assertEquals("&lt;i&gt;bad&lt;/i&gt;", iframe.html());

        __CLR4_2_0e1le1llnxz2360.R.inc(18212);Element noembed = doc2.getElementById("1");
        __CLR4_2_0e1le1llnxz2360.R.inc(18213);noembed.html("good");
        __CLR4_2_0e1le1llnxz2360.R.inc(18214);assertEquals("good", noembed.html());
        __CLR4_2_0e1le1llnxz2360.R.inc(18215);noembed.html("<i>bad</i>");
        __CLR4_2_0e1le1llnxz2360.R.inc(18216);assertEquals("&lt;i&gt;bad&lt;/i&gt;", noembed.html());

        __CLR4_2_0e1le1llnxz2360.R.inc(18217);Element noframes = doc3.getElementById("1");
        __CLR4_2_0e1le1llnxz2360.R.inc(18218);noframes.html("good");
        __CLR4_2_0e1le1llnxz2360.R.inc(18219);assertEquals("good", noframes.html());
        __CLR4_2_0e1le1llnxz2360.R.inc(18220);noframes.html("<i>bad</i>");
        __CLR4_2_0e1le1llnxz2360.R.inc(18221);assertEquals("&lt;i&gt;bad&lt;/i&gt;", noframes.html());

        __CLR4_2_0e1le1llnxz2360.R.inc(18222);Element style = doc4.getElementById("1");
        __CLR4_2_0e1le1llnxz2360.R.inc(18223);style.html("good");
        __CLR4_2_0e1le1llnxz2360.R.inc(18224);assertEquals("good", style.html());
        __CLR4_2_0e1le1llnxz2360.R.inc(18225);style.html("<i>bad</i>");
        __CLR4_2_0e1le1llnxz2360.R.inc(18226);assertEquals("&lt;i&gt;bad&lt;/i&gt;", style.html());

        __CLR4_2_0e1le1llnxz2360.R.inc(18227);Element xmp = doc5.getElementById("1");
        __CLR4_2_0e1le1llnxz2360.R.inc(18228);xmp.html("good");
        __CLR4_2_0e1le1llnxz2360.R.inc(18229);assertEquals("good", xmp.html());
        __CLR4_2_0e1le1llnxz2360.R.inc(18230);xmp.html("<i>bad</i>");
        __CLR4_2_0e1le1llnxz2360.R.inc(18231);assertEquals("&lt;i&gt;bad&lt;/i&gt;", xmp.html());

        __CLR4_2_0e1le1llnxz2360.R.inc(18232);Element head = doc1.getElementById("2");
        __CLR4_2_0e1le1llnxz2360.R.inc(18233);head.html("<iframe><i>bad</i></iframe>");
        __CLR4_2_0e1le1llnxz2360.R.inc(18234);assertEquals("<iframe>&lt;i&gt;bad&lt;/i&gt;</iframe>", head.html());

        __CLR4_2_0e1le1llnxz2360.R.inc(18235);head = doc2.getElementById("2");
        __CLR4_2_0e1le1llnxz2360.R.inc(18236);head.html("<noembed><i>bad</i></noembed>");
        __CLR4_2_0e1le1llnxz2360.R.inc(18237);assertEquals("<noembed>\n &lt;i&gt;bad&lt;/i&gt;\n</noembed>", head.html());

        __CLR4_2_0e1le1llnxz2360.R.inc(18238);head = doc3.getElementById("2");
        __CLR4_2_0e1le1llnxz2360.R.inc(18239);head.html("<noframes><i>bad</i></noframes>");
        __CLR4_2_0e1le1llnxz2360.R.inc(18240);assertEquals("<noframes>\n &lt;i&gt;bad&lt;/i&gt;\n</noframes>", head.html());

        __CLR4_2_0e1le1llnxz2360.R.inc(18241);head = doc4.getElementById("2");
        __CLR4_2_0e1le1llnxz2360.R.inc(18242);head.html("<style><i>bad</i></style>");
        __CLR4_2_0e1le1llnxz2360.R.inc(18243);assertEquals("<style><i>bad</i></style>", head.html());

        __CLR4_2_0e1le1llnxz2360.R.inc(18244);head = doc5.getElementById("2");
        __CLR4_2_0e1le1llnxz2360.R.inc(18245);head.html("<xmp><i>bad</i></xmp>");
        __CLR4_2_0e1le1llnxz2360.R.inc(18246);assertEquals("<xmp>\n &lt;i&gt;bad&lt;/i&gt;\n</xmp>", head.html());
    }finally{__CLR4_2_0e1le1llnxz2360.R.flushNeeded();}}
 
    @Test public void testSetHtmlTitle2()
    {__CLR4_2_0e1le1llnxz2360.R.globalSliceStart(getClass().getName(),18247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0yy8s4ke2v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e1le1llnxz2360.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e1le1llnxz2360.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.ManualTest.testSetHtmlTitle2",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18247,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0yy8s4ke2v(){try{__CLR4_2_0e1le1llnxz2360.R.inc(18247);
        __CLR4_2_0e1le1llnxz2360.R.inc(18248);Document doc = Jsoup.parse("<html><head id=2><script id=1></script></head></html>");

        __CLR4_2_0e1le1llnxz2360.R.inc(18249);Element script = doc.getElementById("1");
        __CLR4_2_0e1le1llnxz2360.R.inc(18250);script.html("good");
        __CLR4_2_0e1le1llnxz2360.R.inc(18251);assertEquals("good", script.html());
        __CLR4_2_0e1le1llnxz2360.R.inc(18252);script.html("<i>bad</i>");
        __CLR4_2_0e1le1llnxz2360.R.inc(18253);assertEquals("&lt;i&gt;bad&lt;/i&gt;", script.html());

        __CLR4_2_0e1le1llnxz2360.R.inc(18254);Element head = doc.getElementById("2");
        __CLR4_2_0e1le1llnxz2360.R.inc(18255);head.html("<script><i>bad</i></script>");
        __CLR4_2_0e1le1llnxz2360.R.inc(18256);assertEquals("<script><i>bad</i></script>", head.html());
    }finally{__CLR4_2_0e1le1llnxz2360.R.flushNeeded();}}

    @Test public void testSetHtmlTitle3()
    {__CLR4_2_0e1le1llnxz2360.R.globalSliceStart(getClass().getName(),18257);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0vp8tc3e35();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e1le1llnxz2360.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e1le1llnxz2360.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.ManualTest.testSetHtmlTitle3",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18257,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0vp8tc3e35(){try{__CLR4_2_0e1le1llnxz2360.R.inc(18257);
        __CLR4_2_0e1le1llnxz2360.R.inc(18258);Document doc = Jsoup.parse("<html><head id=2><noscript id=1></noscript></head></html>");

        __CLR4_2_0e1le1llnxz2360.R.inc(18259);Element noscript = doc.getElementById("1");
        __CLR4_2_0e1le1llnxz2360.R.inc(18260);noscript.html("good");
        __CLR4_2_0e1le1llnxz2360.R.inc(18261);assertEquals("good", noscript.html());
        __CLR4_2_0e1le1llnxz2360.R.inc(18262);noscript.html("<i>bad</i>");
        __CLR4_2_0e1le1llnxz2360.R.inc(18263);assertEquals("<i>bad</i>", noscript.html());
    }finally{__CLR4_2_0e1le1llnxz2360.R.flushNeeded();}}

    @Test public void testSetHtmlTitle4()
    {__CLR4_2_0e1le1llnxz2360.R.globalSliceStart(getClass().getName(),18264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0sg8ujme3c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0e1le1llnxz2360.R.rethrow($CLV_t2$);}finally{__CLR4_2_0e1le1llnxz2360.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.ManualTest.testSetHtmlTitle4",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18264,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0sg8ujme3c(){try{__CLR4_2_0e1le1llnxz2360.R.inc(18264);
        __CLR4_2_0e1le1llnxz2360.R.inc(18265);Document doc = Jsoup.parse("<html><head id=2><plaintext id=1></plaintext></head></html>");

        __CLR4_2_0e1le1llnxz2360.R.inc(18266);Element plaintext = doc.getElementById("1");
        __CLR4_2_0e1le1llnxz2360.R.inc(18267);plaintext.html("good");
        __CLR4_2_0e1le1llnxz2360.R.inc(18268);assertEquals("good", plaintext.html());
        __CLR4_2_0e1le1llnxz2360.R.inc(18269);plaintext.html("<i>bad</i>");
        __CLR4_2_0e1le1llnxz2360.R.inc(18270);assertEquals("<i>bad</i>", plaintext.html());
    }finally{__CLR4_2_0e1le1llnxz2360.R.flushNeeded();}}
}
