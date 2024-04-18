/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests for the DocumentType node
 *
 * @author Jonathan Hedley, http://jonathanhedley.com/
 */
public class DocumentTypeTest {static class __CLR4_2_0effefflnxz236r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767707166L,8589935092L,18732,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void constructorValidationOkWithBlankName() {__CLR4_2_0effefflnxz236r.R.globalSliceStart(getClass().getName(),18699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0efazoveff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0effefflnxz236r.R.rethrow($CLV_t2$);}finally{__CLR4_2_0effefflnxz236r.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTypeTest.constructorValidationOkWithBlankName",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18699,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0efazoveff(){try{__CLR4_2_0effefflnxz236r.R.inc(18699);
        __CLR4_2_0effefflnxz236r.R.inc(18700);DocumentType fail = new DocumentType("","", "");
    }finally{__CLR4_2_0effefflnxz236r.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void constructorValidationThrowsExceptionOnNulls() {__CLR4_2_0effefflnxz236r.R.globalSliceStart(getClass().getName(),18701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0z4ssvvefh();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,99,111,110,115,116,114,117,99,116,111,114,86,97,108,105,100,97,116,105,111,110,84,104,114,111,119,115,69,120,99,101,112,116,105,111,110,79,110,78,117,108,108,115,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0effefflnxz236r.R.rethrow($CLV_t2$);}finally{__CLR4_2_0effefflnxz236r.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTypeTest.constructorValidationThrowsExceptionOnNulls",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18701,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0z4ssvvefh(){try{__CLR4_2_0effefflnxz236r.R.inc(18701);
        __CLR4_2_0effefflnxz236r.R.inc(18702);DocumentType fail = new DocumentType("html", null, null);
    }finally{__CLR4_2_0effefflnxz236r.R.flushNeeded();}}

    @Test
    public void constructorValidationOkWithBlankPublicAndSystemIds() {__CLR4_2_0effefflnxz236r.R.globalSliceStart(getClass().getName(),18703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_09ruwapefj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0effefflnxz236r.R.rethrow($CLV_t2$);}finally{__CLR4_2_0effefflnxz236r.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTypeTest.constructorValidationOkWithBlankPublicAndSystemIds",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18703,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_09ruwapefj(){try{__CLR4_2_0effefflnxz236r.R.inc(18703);
        __CLR4_2_0effefflnxz236r.R.inc(18704);DocumentType fail = new DocumentType("html","", "");
    }finally{__CLR4_2_0effefflnxz236r.R.flushNeeded();}}

    @Test public void outerHtmlGeneration() {__CLR4_2_0effefflnxz236r.R.globalSliceStart(getClass().getName(),18705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0a3gu0refl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0effefflnxz236r.R.rethrow($CLV_t2$);}finally{__CLR4_2_0effefflnxz236r.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTypeTest.outerHtmlGeneration",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18705,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0a3gu0refl(){try{__CLR4_2_0effefflnxz236r.R.inc(18705);
        __CLR4_2_0effefflnxz236r.R.inc(18706);DocumentType html5 = new DocumentType("html", "", "");
        __CLR4_2_0effefflnxz236r.R.inc(18707);assertEquals("<!doctype html>", html5.outerHtml());

        __CLR4_2_0effefflnxz236r.R.inc(18708);DocumentType publicDocType = new DocumentType("html", "-//IETF//DTD HTML//", "");
        __CLR4_2_0effefflnxz236r.R.inc(18709);assertEquals("<!DOCTYPE html PUBLIC \"-//IETF//DTD HTML//\">", publicDocType.outerHtml());

        __CLR4_2_0effefflnxz236r.R.inc(18710);DocumentType systemDocType = new DocumentType("html", "", "http://www.ibm.com/data/dtd/v11/ibmxhtml1-transitional.dtd");
        __CLR4_2_0effefflnxz236r.R.inc(18711);assertEquals("<!DOCTYPE html \"http://www.ibm.com/data/dtd/v11/ibmxhtml1-transitional.dtd\">", systemDocType.outerHtml());

        __CLR4_2_0effefflnxz236r.R.inc(18712);DocumentType combo = new DocumentType("notHtml", "--public", "--system");
        __CLR4_2_0effefflnxz236r.R.inc(18713);assertEquals("<!DOCTYPE notHtml PUBLIC \"--public\" \"--system\">", combo.outerHtml());
    }finally{__CLR4_2_0effefflnxz236r.R.flushNeeded();}}

    @Test public void testRoundTrip() {__CLR4_2_0effefflnxz236r.R.globalSliceStart(getClass().getName(),18714);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0yhw67sefu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0effefflnxz236r.R.rethrow($CLV_t2$);}finally{__CLR4_2_0effefflnxz236r.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTypeTest.testRoundTrip",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18714,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0yhw67sefu(){try{__CLR4_2_0effefflnxz236r.R.inc(18714);
        __CLR4_2_0effefflnxz236r.R.inc(18715);String base = "<!DOCTYPE html>";
        __CLR4_2_0effefflnxz236r.R.inc(18716);assertEquals("<!doctype html>", htmlOutput(base));
        __CLR4_2_0effefflnxz236r.R.inc(18717);assertEquals(base, xmlOutput(base));

        __CLR4_2_0effefflnxz236r.R.inc(18718);String publicDoc = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">";
        __CLR4_2_0effefflnxz236r.R.inc(18719);assertEquals(publicDoc, htmlOutput(publicDoc));
        __CLR4_2_0effefflnxz236r.R.inc(18720);assertEquals(publicDoc, xmlOutput(publicDoc));

        __CLR4_2_0effefflnxz236r.R.inc(18721);String systemDoc = "<!DOCTYPE html SYSTEM \"exampledtdfile.dtd\">";
        __CLR4_2_0effefflnxz236r.R.inc(18722);assertEquals(systemDoc, htmlOutput(systemDoc));
        __CLR4_2_0effefflnxz236r.R.inc(18723);assertEquals(systemDoc, xmlOutput(systemDoc));

        __CLR4_2_0effefflnxz236r.R.inc(18724);String legacyDoc = "<!DOCTYPE html SYSTEM \"about:legacy-compat\">";
        __CLR4_2_0effefflnxz236r.R.inc(18725);assertEquals(legacyDoc, htmlOutput(legacyDoc));
        __CLR4_2_0effefflnxz236r.R.inc(18726);assertEquals(legacyDoc, xmlOutput(legacyDoc));
    }finally{__CLR4_2_0effefflnxz236r.R.flushNeeded();}}

    private String htmlOutput(String in) {try{__CLR4_2_0effefflnxz236r.R.inc(18727);
        __CLR4_2_0effefflnxz236r.R.inc(18728);DocumentType type = (DocumentType) Jsoup.parse(in).childNode(0);
        __CLR4_2_0effefflnxz236r.R.inc(18729);return type.outerHtml();
    }finally{__CLR4_2_0effefflnxz236r.R.flushNeeded();}}

    private String xmlOutput(String in) {try{__CLR4_2_0effefflnxz236r.R.inc(18730);
        __CLR4_2_0effefflnxz236r.R.inc(18731);return Jsoup.parse(in, "", Parser.xmlParser()).childNode(0).outerHtml();
    }finally{__CLR4_2_0effefflnxz236r.R.flushNeeded();}}
}
