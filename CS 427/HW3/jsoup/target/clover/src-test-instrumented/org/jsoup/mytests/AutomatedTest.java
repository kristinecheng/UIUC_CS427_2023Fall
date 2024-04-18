/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.mytests;// java -classpath target/classes;"C:/Program Files/randoop-4.3.2/randoop-all-4.3.2.jar" randoop.main.Main gentests --testclass=org.jsoup.nodes.Element --output-limit=500

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AutomatedTest {static class __CLR4_2_08qf8qflnxz233t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767707166L,8589935092L,18201,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),11319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_099l2d68qf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test001",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11319,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_099l2d68qf() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(11319);
        __CLR4_2_08qf8qflnxz233t.R.inc(11320);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(11321)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(11322)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(11323);System.out.format("%n%s%n", "RegressionTest0.test001");
        }__CLR4_2_08qf8qflnxz233t.R.inc(11324);org.jsoup.parser.Tag tag0 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(11325);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(11326);org.jsoup.nodes.Element element2 = new org.jsoup.nodes.Element(tag0, "");
            __CLR4_2_08qf8qflnxz233t.R.inc(11327);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test002() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),11328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_060l3kp8qo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test002",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11328,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_060l3kp8qo() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(11328);
        __CLR4_2_08qf8qflnxz233t.R.inc(11329);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(11330)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(11331)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(11332);System.out.format("%n%s%n", "RegressionTest0.test002");
        }__CLR4_2_08qf8qflnxz233t.R.inc(11333);java.lang.Object obj0 = new java.lang.Object();
        __CLR4_2_08qf8qflnxz233t.R.inc(11334);java.lang.Class<?> wildcardClass1 = obj0.getClass();
        __CLR4_2_08qf8qflnxz233t.R.inc(11335);org.junit.Assert.assertNotNull(wildcardClass1);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test003() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),11336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_02rl4s88qw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test003",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11336,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_02rl4s88qw() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(11336);
        __CLR4_2_08qf8qflnxz233t.R.inc(11337);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(11338)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(11339)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(11340);System.out.format("%n%s%n", "RegressionTest0.test003");
        }__CLR4_2_08qf8qflnxz233t.R.inc(11341);org.jsoup.parser.Tag tag0 = null;
        __CLR4_2_08qf8qflnxz233t.R.inc(11342);org.jsoup.nodes.Attributes attributes2 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(11343);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(11344);org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag0, "hi!", attributes2);
            __CLR4_2_08qf8qflnxz233t.R.inc(11345);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test004() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),11346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0heu098r6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test004",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11346,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0heu098r6() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(11346);
        __CLR4_2_08qf8qflnxz233t.R.inc(11347);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(11348)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(11349)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(11350);System.out.format("%n%s%n", "RegressionTest0.test004");
        // The following exception was thrown during execution in test generation
        }__CLR4_2_08qf8qflnxz233t.R.inc(11351);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(11352);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("");
            __CLR4_2_08qf8qflnxz233t.R.inc(11353);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test005() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),11354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_03qessq8re();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test005",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11354,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_03qessq8re() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(11354);
        __CLR4_2_08qf8qflnxz233t.R.inc(11355);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(11356)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(11357)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(11358);System.out.format("%n%s%n", "RegressionTest0.test005");
        }__CLR4_2_08qf8qflnxz233t.R.inc(11359);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11360);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11361);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(11362);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(11363);org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("", "");
            __CLR4_2_08qf8qflnxz233t.R.inc(11364);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(11365);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(11366);org.junit.Assert.assertNull(element3);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test006() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),11367);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_06zerl78rr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test006",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11367,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_06zerl78rr() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(11367);
        __CLR4_2_08qf8qflnxz233t.R.inc(11368);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(11369)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(11370)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(11371);System.out.format("%n%s%n", "RegressionTest0.test006");
        }__CLR4_2_08qf8qflnxz233t.R.inc(11372);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11373);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11374);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(11375);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(11376);org.jsoup.select.NodeFilter nodeFilter6 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(11377);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(11378);org.jsoup.nodes.Element element7 = element4.filter(nodeFilter6);
            __CLR4_2_08qf8qflnxz233t.R.inc(11379);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(11380);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(11381);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(11382);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test007() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),11383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0a8eqdo8s7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test007",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11383,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0a8eqdo8s7() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(11383);
        __CLR4_2_08qf8qflnxz233t.R.inc(11384);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(11385)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(11386)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(11387);System.out.format("%n%s%n", "RegressionTest0.test007");
        }__CLR4_2_08qf8qflnxz233t.R.inc(11388);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11389);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11390);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(11391);java.util.regex.Pattern pattern5 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(11392);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(11393);org.jsoup.select.Elements elements6 = element4.getElementsMatchingOwnText(pattern5);
            __CLR4_2_08qf8qflnxz233t.R.inc(11394);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(11395);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(11396);org.junit.Assert.assertNotNull(element4);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test008() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),11397);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0dhep658sl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test008",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11397,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0dhep658sl() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(11397);
        __CLR4_2_08qf8qflnxz233t.R.inc(11398);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(11399)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(11400)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(11401);System.out.format("%n%s%n", "RegressionTest0.test008");
        }__CLR4_2_08qf8qflnxz233t.R.inc(11402);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11403);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11404);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(11405);java.lang.String str5 = element4.text();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(11406);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(11407);org.jsoup.nodes.Element element7 = element4.before("hi!");
            __CLR4_2_08qf8qflnxz233t.R.inc(11408);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(11409);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(11410);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(11411);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test009() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),11412);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0gqenym8t0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test009",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11412,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0gqenym8t0() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(11412);
        __CLR4_2_08qf8qflnxz233t.R.inc(11413);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(11414)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(11415)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(11416);System.out.format("%n%s%n", "RegressionTest0.test009");
        }__CLR4_2_08qf8qflnxz233t.R.inc(11417);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11418);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11419);int int3 = element1.childNodeSize();
        __CLR4_2_08qf8qflnxz233t.R.inc(11420);org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11421);java.util.List<org.jsoup.nodes.TextNode> textNodeList6 = element5.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11422);org.jsoup.nodes.Element element7 = element5.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(11423);java.lang.String str8 = element5.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(11424);org.jsoup.nodes.Element element9 = element5.shallowClone();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(11425);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(11426);org.jsoup.nodes.Element element10 = element1.before((org.jsoup.nodes.Node) element9);
            __CLR4_2_08qf8qflnxz233t.R.inc(11427);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(11428);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(11429);org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(11430);org.junit.Assert.assertNotNull(textNodeList6);
        __CLR4_2_08qf8qflnxz233t.R.inc(11431);org.junit.Assert.assertNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(11432);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11433);org.junit.Assert.assertNotNull(element9);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test010() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),11434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0h79vdw8tm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test010",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11434,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0h79vdw8tm() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(11434);
        __CLR4_2_08qf8qflnxz233t.R.inc(11435);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(11436)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(11437)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(11438);System.out.format("%n%s%n", "RegressionTest0.test010");
        }__CLR4_2_08qf8qflnxz233t.R.inc(11439);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11440);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11441);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(11442);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(11443);org.jsoup.select.Elements elements6 = element3.getElementsByAttributeValue("", "hi!");
            __CLR4_2_08qf8qflnxz233t.R.inc(11444);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(11445);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(11446);org.junit.Assert.assertNull(element3);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test011() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),11447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0kg9u6d8tz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test011",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11447,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0kg9u6d8tz() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(11447);
        __CLR4_2_08qf8qflnxz233t.R.inc(11448);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(11449)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(11450)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(11451);System.out.format("%n%s%n", "RegressionTest0.test011");
        }__CLR4_2_08qf8qflnxz233t.R.inc(11452);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11453);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11454);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(11455);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(11456);org.jsoup.nodes.Element element5 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(11457);org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11458);java.util.List<org.jsoup.nodes.TextNode> textNodeList8 = element7.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11459);org.jsoup.nodes.Element element9 = element7.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(11460);org.jsoup.nodes.Element element10 = element9.nextElementSibling();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(11461);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(11462);org.jsoup.nodes.Element element11 = element5.after((org.jsoup.nodes.Node) element9);
            __CLR4_2_08qf8qflnxz233t.R.inc(11463);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(11464);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(11465);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(11466);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11467);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(11468);org.junit.Assert.assertNotNull(textNodeList8);
        __CLR4_2_08qf8qflnxz233t.R.inc(11469);org.junit.Assert.assertNotNull(element9);
        __CLR4_2_08qf8qflnxz233t.R.inc(11470);org.junit.Assert.assertNull(element10);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test012() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),11471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0np9syu8un();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test012",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11471,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0np9syu8un() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(11471);
        __CLR4_2_08qf8qflnxz233t.R.inc(11472);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(11473)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(11474)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(11475);System.out.format("%n%s%n", "RegressionTest0.test012");
        }__CLR4_2_08qf8qflnxz233t.R.inc(11476);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11477);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11478);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(11479);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(11480);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(11481);boolean boolean9 = element4.hasAttr("hi!");
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(11482);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(11483);org.jsoup.nodes.Element element11 = element4.prependElement("");
            __CLR4_2_08qf8qflnxz233t.R.inc(11484);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(11485);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(11486);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(11487);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(11488);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(11489);org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test013() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),11490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0qy9rrb8v6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test013",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11490,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0qy9rrb8v6() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(11490);
        __CLR4_2_08qf8qflnxz233t.R.inc(11491);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(11492)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(11493)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(11494);System.out.format("%n%s%n", "RegressionTest0.test013");
        }__CLR4_2_08qf8qflnxz233t.R.inc(11495);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11496);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11497);org.jsoup.nodes.Element element3 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(11498);int int4 = element1.siblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(11499);org.jsoup.select.Elements elements5 = element1.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(11500);java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11501);java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11502);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(11503);org.junit.Assert.assertNotNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(11504);org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(11505);org.junit.Assert.assertNotNull(elements5);
        __CLR4_2_08qf8qflnxz233t.R.inc(11506);org.junit.Assert.assertNotNull(nodeList6);
        __CLR4_2_08qf8qflnxz233t.R.inc(11507);org.junit.Assert.assertNotNull(textNodeList7);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test014() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),11508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0u79qjs8vo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test014",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11508,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0u79qjs8vo() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(11508);
        __CLR4_2_08qf8qflnxz233t.R.inc(11509);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(11510)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(11511)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(11512);System.out.format("%n%s%n", "RegressionTest0.test014");
        }__CLR4_2_08qf8qflnxz233t.R.inc(11513);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11514);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11515);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(11516);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(11517);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(11518);java.lang.String str8 = element4.text();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(11519);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(11520);org.jsoup.nodes.Element element10 = element4.after("hi!");
            __CLR4_2_08qf8qflnxz233t.R.inc(11521);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(11522);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(11523);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(11524);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(11525);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(11526);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test015() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),11527);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0xg9pc98w7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test015",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11527,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0xg9pc98w7() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(11527);
        __CLR4_2_08qf8qflnxz233t.R.inc(11528);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(11529)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(11530)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(11531);System.out.format("%n%s%n", "RegressionTest0.test015");
        }__CLR4_2_08qf8qflnxz233t.R.inc(11532);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11533);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11534);int int3 = element1.childNodeSize();
        __CLR4_2_08qf8qflnxz233t.R.inc(11535);java.lang.String str4 = element1.nodeName();
        __CLR4_2_08qf8qflnxz233t.R.inc(11536);boolean boolean6 = element1.hasClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11537);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(11538);org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(11539);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11540);org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test016() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),11541);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ybudue8wl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test016",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11541,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ybudue8wl() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(11541);
        __CLR4_2_08qf8qflnxz233t.R.inc(11542);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(11543)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(11544)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(11545);System.out.format("%n%s%n", "RegressionTest0.test016");
        }__CLR4_2_08qf8qflnxz233t.R.inc(11546);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11547);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11548);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(11549);org.jsoup.nodes.Document document5 = element1.ownerDocument();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(11550);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(11551);org.jsoup.nodes.Element element7 = document5.wrap("");
            __CLR4_2_08qf8qflnxz233t.R.inc(11552);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(11553);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(11554);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(11555);org.junit.Assert.assertNull(document5);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test017() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),11556);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0v2uf1x8x0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test017",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11556,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0v2uf1x8x0() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(11556);
        __CLR4_2_08qf8qflnxz233t.R.inc(11557);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(11558)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(11559)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(11560);System.out.format("%n%s%n", "RegressionTest0.test017");
        }__CLR4_2_08qf8qflnxz233t.R.inc(11561);org.jsoup.parser.Tag tag0 = null;
        __CLR4_2_08qf8qflnxz233t.R.inc(11562);org.jsoup.nodes.Attributes attributes2 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(11563);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(11564);org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag0, "", attributes2);
            __CLR4_2_08qf8qflnxz233t.R.inc(11565);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test018() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),11566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0rtug9g8xa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test018",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11566,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0rtug9g8xa() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(11566);
        __CLR4_2_08qf8qflnxz233t.R.inc(11567);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(11568)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(11569)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(11570);System.out.format("%n%s%n", "RegressionTest0.test018");
        }__CLR4_2_08qf8qflnxz233t.R.inc(11571);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11572);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11573);org.jsoup.nodes.Element element3 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(11574);org.jsoup.nodes.Element element4 = element3.nextElementSibling();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(11575);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(11576);org.jsoup.select.Elements elements6 = element4.getElementsByAttributeStarting("hi!");
            __CLR4_2_08qf8qflnxz233t.R.inc(11577);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(11578);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(11579);org.junit.Assert.assertNotNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(11580);org.junit.Assert.assertNull(element4);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test019() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),11581);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0okuhgz8xp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test019",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11581,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0okuhgz8xp() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(11581);
        __CLR4_2_08qf8qflnxz233t.R.inc(11582);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(11583)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(11584)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(11585);System.out.format("%n%s%n", "RegressionTest0.test019");
        }__CLR4_2_08qf8qflnxz233t.R.inc(11586);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11587);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11588);org.jsoup.nodes.Element element3 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(11589);int int4 = element1.siblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(11590);org.jsoup.nodes.Element element5 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(11591);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(11592);org.junit.Assert.assertNotNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(11593);org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(11594);org.junit.Assert.assertNull(element5);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test020() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),11595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0o3za1p8y3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test020",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11595,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0o3za1p8y3() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(11595);
        __CLR4_2_08qf8qflnxz233t.R.inc(11596);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(11597)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(11598)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(11599);System.out.format("%n%s%n", "RegressionTest0.test020");
        }__CLR4_2_08qf8qflnxz233t.R.inc(11600);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11601);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11602);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(11603);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(11604);org.jsoup.nodes.Element element7 = element4.addClass("");
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(11605);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(11606);org.jsoup.nodes.Element element9 = element7.tagName("");
            __CLR4_2_08qf8qflnxz233t.R.inc(11607);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Tag name must not be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(11608);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(11609);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(11610);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(11611);org.junit.Assert.assertNotNull(element7);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test021() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),11612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0kuzb988yk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test021",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11612,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0kuzb988yk() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(11612);
        __CLR4_2_08qf8qflnxz233t.R.inc(11613);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(11614)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(11615)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(11616);System.out.format("%n%s%n", "RegressionTest0.test021");
        }__CLR4_2_08qf8qflnxz233t.R.inc(11617);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11618);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11619);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(11620);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(11621);org.jsoup.nodes.Element element5 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(11622);org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11623);org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11624);java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element10.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11625);org.jsoup.nodes.Element element12 = element10.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(11626);java.lang.String str13 = element10.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(11627);org.jsoup.nodes.Element element14 = element10.shallowClone();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(11628);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(11629);org.jsoup.nodes.Element element15 = element1.after((org.jsoup.nodes.Node) element14);
            __CLR4_2_08qf8qflnxz233t.R.inc(11630);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(11631);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(11632);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(11633);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11634);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(11635);org.junit.Assert.assertNotNull(elements8);
        __CLR4_2_08qf8qflnxz233t.R.inc(11636);org.junit.Assert.assertNotNull(textNodeList11);
        __CLR4_2_08qf8qflnxz233t.R.inc(11637);org.junit.Assert.assertNull(element12);
        __CLR4_2_08qf8qflnxz233t.R.inc(11638);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11639);org.junit.Assert.assertNotNull(element14);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test022() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),11640);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0hlzcgr8zc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test022",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11640,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0hlzcgr8zc() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(11640);
        __CLR4_2_08qf8qflnxz233t.R.inc(11641);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(11642)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(11643)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(11644);System.out.format("%n%s%n", "RegressionTest0.test022");
        }__CLR4_2_08qf8qflnxz233t.R.inc(11645);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11646);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11647);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(11648);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(11649);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(11650);java.lang.String str8 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(11651);org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11652);java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11653);org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(11654);java.lang.String str14 = element4.val();
        __CLR4_2_08qf8qflnxz233t.R.inc(11655);org.jsoup.select.Elements elements16 = element4.getElementsByClass("hi!");
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(11656);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(11657);org.jsoup.nodes.Element element18 = element4.prependElement("");
            __CLR4_2_08qf8qflnxz233t.R.inc(11658);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(11659);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(11660);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(11661);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(11662);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(11663);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(11664);org.junit.Assert.assertNotNull(textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(11665);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(11666);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(11667);org.junit.Assert.assertNotNull(elements16);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test023() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),11668);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0eczdoa904();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test023",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11668,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0eczdoa904() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(11668);
        __CLR4_2_08qf8qflnxz233t.R.inc(11669);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(11670)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(11671)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(11672);System.out.format("%n%s%n", "RegressionTest0.test023");
        }__CLR4_2_08qf8qflnxz233t.R.inc(11673);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11674);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11675);org.jsoup.nodes.Element element3 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(11676);org.jsoup.select.Elements elements5 = element1.getElementsByIndexEquals((int) (short) -1);
        __CLR4_2_08qf8qflnxz233t.R.inc(11677);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(11678);org.junit.Assert.assertNotNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(11679);org.junit.Assert.assertNotNull(elements5);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test024() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),11680);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0b3zevt90g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test024",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11680,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0b3zevt90g() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(11680);
        __CLR4_2_08qf8qflnxz233t.R.inc(11681);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(11682)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(11683)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(11684);System.out.format("%n%s%n", "RegressionTest0.test024");
        }__CLR4_2_08qf8qflnxz233t.R.inc(11685);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11686);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11687);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(11688);org.jsoup.select.Elements elements6 = element4.getElementsByAttribute("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11689);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(11690);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(11691);org.junit.Assert.assertNotNull(elements6);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test025() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),11692);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_07uzg3c90s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test025",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11692,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_07uzg3c90s() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(11692);
        __CLR4_2_08qf8qflnxz233t.R.inc(11693);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(11694)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(11695)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(11696);System.out.format("%n%s%n", "RegressionTest0.test025");
        }__CLR4_2_08qf8qflnxz233t.R.inc(11697);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11698);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11699);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(11700);org.jsoup.nodes.Document document5 = element1.ownerDocument();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(11701);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(11702);java.lang.String str6 = document5.cssSelector();
            __CLR4_2_08qf8qflnxz233t.R.inc(11703);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(11704);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(11705);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(11706);org.junit.Assert.assertNull(document5);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test026() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),11707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_04lzhav917();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test026",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11707,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_04lzhav917() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(11707);
        __CLR4_2_08qf8qflnxz233t.R.inc(11708);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(11709)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(11710)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(11711);System.out.format("%n%s%n", "RegressionTest0.test026");
        }__CLR4_2_08qf8qflnxz233t.R.inc(11712);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11713);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11714);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(11715);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(11716);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(11717);boolean boolean9 = element4.hasAttr("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11718);org.jsoup.select.Elements elements11 = element4.getElementsContainingText("");
        __CLR4_2_08qf8qflnxz233t.R.inc(11719);org.jsoup.nodes.Element element13 = element4.prependText("hi!");
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(11720);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(11721);org.jsoup.nodes.Node node14 = element4.unwrap();
            __CLR4_2_08qf8qflnxz233t.R.inc(11722);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(11723);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(11724);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(11725);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(11726);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(11727);org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(11728);org.junit.Assert.assertNotNull(elements11);
        __CLR4_2_08qf8qflnxz233t.R.inc(11729);org.junit.Assert.assertNotNull(element13);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test027() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),11730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_01cziie91u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test027",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11730,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_01cziie91u() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(11730);
        __CLR4_2_08qf8qflnxz233t.R.inc(11731);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(11732)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(11733)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(11734);System.out.format("%n%s%n", "RegressionTest0.test027");
        }__CLR4_2_08qf8qflnxz233t.R.inc(11735);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11736);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11737);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(11738);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(11739);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(11740);java.lang.String str7 = element4.ownText();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(11741);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(11742);org.jsoup.nodes.Element element9 = element4.wrap("");
            __CLR4_2_08qf8qflnxz233t.R.inc(11743);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(11744);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(11745);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(11746);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(11747);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(11748);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test028() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),11749);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_01w0ga392d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test028",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11749,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_01w0ga392d() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(11749);
        __CLR4_2_08qf8qflnxz233t.R.inc(11750);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(11751)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(11752)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(11753);System.out.format("%n%s%n", "RegressionTest0.test028");
        }__CLR4_2_08qf8qflnxz233t.R.inc(11754);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11755);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11756);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(11757);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(11758);boolean boolean4 = element3.hasParent();
            __CLR4_2_08qf8qflnxz233t.R.inc(11759);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(11760);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(11761);org.junit.Assert.assertNull(element3);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test029() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),11762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0550f2k92q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test029",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11762,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0550f2k92q() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(11762);
        __CLR4_2_08qf8qflnxz233t.R.inc(11763);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(11764)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(11765)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(11766);System.out.format("%n%s%n", "RegressionTest0.test029");
        }__CLR4_2_08qf8qflnxz233t.R.inc(11767);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11768);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11769);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(11770);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(11771);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(11772);boolean boolean8 = element4.hasClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11773);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(11774);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(11775);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(11776);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(11777);org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test030() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),11778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_05lvmhu936();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test030",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11778,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_05lvmhu936() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(11778);
        __CLR4_2_08qf8qflnxz233t.R.inc(11779);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(11780)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(11781)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(11782);System.out.format("%n%s%n", "RegressionTest0.test030");
        }__CLR4_2_08qf8qflnxz233t.R.inc(11783);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11784);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11785);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(11786);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(11787);org.jsoup.nodes.Element element5 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(11788);element1.setBaseUri("hi!");
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(11789);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(11790);org.jsoup.nodes.Node node8 = element1.unwrap();
            __CLR4_2_08qf8qflnxz233t.R.inc(11791);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(11792);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(11793);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(11794);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11795);org.junit.Assert.assertNotNull(element5);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test031() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),11796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_08uvlab93o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test031",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11796,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_08uvlab93o() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(11796);
        __CLR4_2_08qf8qflnxz233t.R.inc(11797);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(11798)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(11799)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(11800);System.out.format("%n%s%n", "RegressionTest0.test031");
        }__CLR4_2_08qf8qflnxz233t.R.inc(11801);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11802);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11803);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(11804);boolean boolean5 = element1.hasText();
        __CLR4_2_08qf8qflnxz233t.R.inc(11805);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(11806);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(11807);org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test032() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),11808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0c3vk2s940();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test032",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11808,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0c3vk2s940() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(11808);
        __CLR4_2_08qf8qflnxz233t.R.inc(11809);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(11810)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(11811)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(11812);System.out.format("%n%s%n", "RegressionTest0.test032");
        }__CLR4_2_08qf8qflnxz233t.R.inc(11813);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11814);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11815);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(11816);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(11817);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(11818);java.lang.String str8 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(11819);org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11820);java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11821);org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(11822);java.lang.String str14 = element4.val();
        __CLR4_2_08qf8qflnxz233t.R.inc(11823);org.jsoup.nodes.Element element15 = element4.empty();
        __CLR4_2_08qf8qflnxz233t.R.inc(11824);int int16 = element4.elementSiblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(11825);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(11826);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(11827);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(11828);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(11829);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(11830);org.junit.Assert.assertNotNull(textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(11831);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(11832);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(11833);org.junit.Assert.assertNotNull(element15);
        __CLR4_2_08qf8qflnxz233t.R.inc(11834);org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test033() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),11835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0fcviv994r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test033",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11835,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0fcviv994r() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(11835);
        __CLR4_2_08qf8qflnxz233t.R.inc(11836);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(11837)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(11838)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(11839);System.out.format("%n%s%n", "RegressionTest0.test033");
        }__CLR4_2_08qf8qflnxz233t.R.inc(11840);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11841);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11842);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(11843);org.jsoup.nodes.Document document5 = element1.ownerDocument();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(11844);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(11845);org.jsoup.nodes.Element element6 = document5.lastElementSibling();
            __CLR4_2_08qf8qflnxz233t.R.inc(11846);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(11847);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(11848);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(11849);org.junit.Assert.assertNull(document5);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test034() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),11850);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ilvhnq956();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test034",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11850,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ilvhnq956() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(11850);
        __CLR4_2_08qf8qflnxz233t.R.inc(11851);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(11852)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(11853)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(11854);System.out.format("%n%s%n", "RegressionTest0.test034");
        }__CLR4_2_08qf8qflnxz233t.R.inc(11855);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11856);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11857);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(11858);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(11859);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(11860);java.lang.String str8 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(11861);org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11862);java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11863);org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(11864);org.jsoup.nodes.Element element15 = element4.removeAttr("");
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(11865);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(11866);org.jsoup.nodes.Node node16 = element4.unwrap();
            __CLR4_2_08qf8qflnxz233t.R.inc(11867);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(11868);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(11869);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(11870);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(11871);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(11872);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(11873);org.junit.Assert.assertNotNull(textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(11874);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(11875);org.junit.Assert.assertNotNull(element15);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test035() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),11876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0luvgg795w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test035",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11876,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0luvgg795w() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(11876);
        __CLR4_2_08qf8qflnxz233t.R.inc(11877);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(11878)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(11879)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(11880);System.out.format("%n%s%n", "RegressionTest0.test035");
        }__CLR4_2_08qf8qflnxz233t.R.inc(11881);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11882);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11883);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(11884);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(11885);org.jsoup.nodes.Element element5 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(11886);element1.setBaseUri("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11887);org.jsoup.select.Elements elements9 = element1.getElementsMatchingOwnText("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11888);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(11889);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(11890);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11891);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(11892);org.junit.Assert.assertNotNull(elements9);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test036() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),11893);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0p3vf8o96d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test036",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11893,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0p3vf8o96d() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(11893);
        __CLR4_2_08qf8qflnxz233t.R.inc(11894);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(11895)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(11896)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(11897);System.out.format("%n%s%n", "RegressionTest0.test036");
        }__CLR4_2_08qf8qflnxz233t.R.inc(11898);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11899);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11900);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(11901);org.jsoup.nodes.Element element5 = element1.clearAttributes();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(11902);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(11903);element5.remove();
            __CLR4_2_08qf8qflnxz233t.R.inc(11904);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(11905);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(11906);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(11907);org.junit.Assert.assertNotNull(element5);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test037() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),11908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0scve1596s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test037",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11908,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0scve1596s() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(11908);
        __CLR4_2_08qf8qflnxz233t.R.inc(11909);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(11910)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(11911)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(11912);System.out.format("%n%s%n", "RegressionTest0.test037");
        }__CLR4_2_08qf8qflnxz233t.R.inc(11913);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11914);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11915);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(11916);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(11917);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(11918);org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11919);org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11920);java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11921);org.jsoup.nodes.Element element13 = element11.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(11922);java.lang.String str14 = element11.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(11923);org.jsoup.nodes.Element element15 = element11.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(11924);element11.setBaseUri("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11925);org.jsoup.select.Elements elements19 = element11.getElementsMatchingOwnText("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11926);org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11927);org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11928);java.util.List<org.jsoup.nodes.TextNode> textNodeList24 = element23.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11929);org.jsoup.nodes.Node node25 = element23.previousSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(11930);org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11931);java.util.List<org.jsoup.nodes.TextNode> textNodeList28 = element27.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11932);org.jsoup.nodes.Element element29 = element27.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(11933);int int30 = element27.siblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(11934);org.jsoup.select.Elements elements31 = element27.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(11935);org.jsoup.nodes.Element element33 = element27.prependText("");
        __CLR4_2_08qf8qflnxz233t.R.inc(11936);org.jsoup.nodes.Node[] nodeArray34 = new org.jsoup.nodes.Node[] { element11, element21, node25, element27 };
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(11937);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(11938);org.jsoup.nodes.Element element35 = element4.insertChildren((int) (byte) -1, nodeArray34);
            __CLR4_2_08qf8qflnxz233t.R.inc(11939);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array must not contain any null objects");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(11940);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(11941);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(11942);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(11943);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(11944);org.junit.Assert.assertNotNull(element8);
        __CLR4_2_08qf8qflnxz233t.R.inc(11945);org.junit.Assert.assertNotNull(textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(11946);org.junit.Assert.assertNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(11947);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11948);org.junit.Assert.assertNotNull(element15);
        __CLR4_2_08qf8qflnxz233t.R.inc(11949);org.junit.Assert.assertNotNull(elements19);
        __CLR4_2_08qf8qflnxz233t.R.inc(11950);org.junit.Assert.assertNotNull(textNodeList24);
        __CLR4_2_08qf8qflnxz233t.R.inc(11951);org.junit.Assert.assertNull(node25);
        __CLR4_2_08qf8qflnxz233t.R.inc(11952);org.junit.Assert.assertNotNull(textNodeList28);
        __CLR4_2_08qf8qflnxz233t.R.inc(11953);org.junit.Assert.assertNotNull(element29);
        __CLR4_2_08qf8qflnxz233t.R.inc(11954);org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(11955);org.junit.Assert.assertNotNull(elements31);
        __CLR4_2_08qf8qflnxz233t.R.inc(11956);org.junit.Assert.assertNotNull(element33);
        __CLR4_2_08qf8qflnxz233t.R.inc(11957);org.junit.Assert.assertNotNull(nodeArray34);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test038() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),11958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0vlvctm986();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test038",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11958,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0vlvctm986() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(11958);
        __CLR4_2_08qf8qflnxz233t.R.inc(11959);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(11960)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(11961)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(11962);System.out.format("%n%s%n", "RegressionTest0.test038");
        }__CLR4_2_08qf8qflnxz233t.R.inc(11963);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11964);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11965);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(11966);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(11967);org.jsoup.nodes.Element element5 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(11968);java.util.regex.Pattern pattern7 = null;
        __CLR4_2_08qf8qflnxz233t.R.inc(11969);org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", pattern7);
        __CLR4_2_08qf8qflnxz233t.R.inc(11970);org.jsoup.nodes.Element element11 = element1.attr("", false);
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(11971);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(11972);org.jsoup.nodes.Element element13 = element11.selectFirst("");
            __CLR4_2_08qf8qflnxz233t.R.inc(11973);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(11974);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(11975);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(11976);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11977);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(11978);org.junit.Assert.assertNotNull(elements8);
        __CLR4_2_08qf8qflnxz233t.R.inc(11979);org.junit.Assert.assertNotNull(element11);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test039() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),11980);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0yuvbm398s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test039",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),11980,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0yuvbm398s() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(11980);
        __CLR4_2_08qf8qflnxz233t.R.inc(11981);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(11982)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(11983)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(11984);System.out.format("%n%s%n", "RegressionTest0.test039");
        }__CLR4_2_08qf8qflnxz233t.R.inc(11985);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11986);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11987);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(11988);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(11989);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(11990);java.lang.String str7 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(11991);org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11992);java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element10.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11993);org.jsoup.nodes.Element element13 = element10.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(11994);java.lang.String str14 = element13.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(11995);org.jsoup.nodes.Element element16 = element13.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(11996);java.lang.String str17 = element13.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(11997);org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(11998);java.util.List<org.jsoup.nodes.TextNode> textNodeList21 = element20.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(11999);org.jsoup.nodes.Element element22 = element13.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList21);
        __CLR4_2_08qf8qflnxz233t.R.inc(12000);java.lang.String str23 = element13.val();
        __CLR4_2_08qf8qflnxz233t.R.inc(12001);java.util.List<org.jsoup.nodes.TextNode> textNodeList24 = element13.textNodes();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(12002);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(12003);org.jsoup.nodes.Element element25 = element4.insertChildren((int) (short) 100, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList24);
            __CLR4_2_08qf8qflnxz233t.R.inc(12004);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(12005);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(12006);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(12007);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12008);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(12009);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12010);org.junit.Assert.assertNotNull(textNodeList11);
        __CLR4_2_08qf8qflnxz233t.R.inc(12011);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(12012);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12013);org.junit.Assert.assertNotNull(element16);
        __CLR4_2_08qf8qflnxz233t.R.inc(12014);org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12015);org.junit.Assert.assertNotNull(textNodeList21);
        __CLR4_2_08qf8qflnxz233t.R.inc(12016);org.junit.Assert.assertNotNull(element22);
        __CLR4_2_08qf8qflnxz233t.R.inc(12017);org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12018);org.junit.Assert.assertNotNull(textNodeList24);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test040() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),12019);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0zbqj1d99v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test040",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),12019,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0zbqj1d99v() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(12019);
        __CLR4_2_08qf8qflnxz233t.R.inc(12020);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(12021)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(12022)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(12023);System.out.format("%n%s%n", "RegressionTest0.test040");
        }__CLR4_2_08qf8qflnxz233t.R.inc(12024);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12025);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12026);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(12027);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(12028);org.jsoup.nodes.Element element5 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(12029);java.util.regex.Pattern pattern7 = null;
        __CLR4_2_08qf8qflnxz233t.R.inc(12030);org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", pattern7);
        __CLR4_2_08qf8qflnxz233t.R.inc(12031);org.jsoup.nodes.Element element11 = element1.attr("", false);
        __CLR4_2_08qf8qflnxz233t.R.inc(12032);org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12033);java.util.List<org.jsoup.nodes.TextNode> textNodeList14 = element13.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12034);org.jsoup.nodes.Element element16 = element13.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12035);java.lang.String str17 = element16.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12036);org.jsoup.nodes.Element element19 = element16.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12037);java.lang.String str20 = element16.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12038);org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12039);java.util.List<org.jsoup.nodes.TextNode> textNodeList24 = element23.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12040);org.jsoup.nodes.Element element25 = element16.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList24);
        __CLR4_2_08qf8qflnxz233t.R.inc(12041);java.lang.String str26 = element16.val();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(12042);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(12043);org.jsoup.nodes.Element element27 = element1.after((org.jsoup.nodes.Node) element16);
            __CLR4_2_08qf8qflnxz233t.R.inc(12044);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(12045);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(12046);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(12047);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12048);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(12049);org.junit.Assert.assertNotNull(elements8);
        __CLR4_2_08qf8qflnxz233t.R.inc(12050);org.junit.Assert.assertNotNull(element11);
        __CLR4_2_08qf8qflnxz233t.R.inc(12051);org.junit.Assert.assertNotNull(textNodeList14);
        __CLR4_2_08qf8qflnxz233t.R.inc(12052);org.junit.Assert.assertNotNull(element16);
        __CLR4_2_08qf8qflnxz233t.R.inc(12053);org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12054);org.junit.Assert.assertNotNull(element19);
        __CLR4_2_08qf8qflnxz233t.R.inc(12055);org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12056);org.junit.Assert.assertNotNull(textNodeList24);
        __CLR4_2_08qf8qflnxz233t.R.inc(12057);org.junit.Assert.assertNotNull(element25);
        __CLR4_2_08qf8qflnxz233t.R.inc(12058);org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test041() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),12059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0wgdk5a9az();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test041",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),12059,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0wgdk5a9az() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(12059);
        __CLR4_2_08qf8qflnxz233t.R.inc(12060);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(12061)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(12062)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(12063);System.out.format("%n%s%n", "RegressionTest0.test041");
        }__CLR4_2_08qf8qflnxz233t.R.inc(12064);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12065);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12066);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12067);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12068);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(12069);int int7 = element4.childNodeSize();
        __CLR4_2_08qf8qflnxz233t.R.inc(12070);java.util.Set<java.lang.String> strSet8 = element4.classNames();
        __CLR4_2_08qf8qflnxz233t.R.inc(12071);org.jsoup.nodes.Document document9 = element4.ownerDocument();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(12072);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(12073);org.jsoup.nodes.Element element10 = document9.previousElementSibling();
            __CLR4_2_08qf8qflnxz233t.R.inc(12074);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(12075);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(12076);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(12077);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12078);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(12079);org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(12080);org.junit.Assert.assertNotNull(strSet8);
        __CLR4_2_08qf8qflnxz233t.R.inc(12081);org.junit.Assert.assertNull(document9);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test042() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),12082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0t7dlct9bm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test042",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),12082,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0t7dlct9bm() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(12082);
        __CLR4_2_08qf8qflnxz233t.R.inc(12083);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(12084)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(12085)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(12086);System.out.format("%n%s%n", "RegressionTest0.test042");
        }__CLR4_2_08qf8qflnxz233t.R.inc(12087);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12088);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12089);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12090);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12091);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12092);boolean boolean9 = element4.hasAttr("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12093);org.jsoup.select.Elements elements11 = element4.getElementsContainingText("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12094);boolean boolean12 = element4.hasText();
        __CLR4_2_08qf8qflnxz233t.R.inc(12095);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(12096);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(12097);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12098);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(12099);org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(12100);org.junit.Assert.assertNotNull(elements11);
        __CLR4_2_08qf8qflnxz233t.R.inc(12101);org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test043() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),12102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0pydmkc9c6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test043",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),12102,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0pydmkc9c6() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(12102);
        __CLR4_2_08qf8qflnxz233t.R.inc(12103);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(12104)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(12105)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(12106);System.out.format("%n%s%n", "RegressionTest0.test043");
        }__CLR4_2_08qf8qflnxz233t.R.inc(12107);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12108);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12109);org.jsoup.nodes.Node node3 = element1.previousSibling();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(12110);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(12111);org.jsoup.nodes.Node node5 = element1.childNode((int) '4');
            __CLR4_2_08qf8qflnxz233t.R.inc(12112);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(12113);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(12114);org.junit.Assert.assertNull(node3);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test044() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),12115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0mpdnrv9cj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test044",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),12115,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0mpdnrv9cj() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(12115);
        __CLR4_2_08qf8qflnxz233t.R.inc(12116);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(12117)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(12118)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(12119);System.out.format("%n%s%n", "RegressionTest0.test044");
        }__CLR4_2_08qf8qflnxz233t.R.inc(12120);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12121);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12122);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12123);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12124);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12125);boolean boolean9 = element4.hasAttr("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12126);org.jsoup.nodes.Element element10 = element4.root();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(12127);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(12128);org.jsoup.nodes.Element element12 = element10.after("<hi!></hi!>");
            __CLR4_2_08qf8qflnxz233t.R.inc(12129);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(12130);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(12131);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(12132);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12133);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(12134);org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(12135);org.junit.Assert.assertNotNull(element10);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test045() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),12136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0jgdoze9d4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test045",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),12136,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0jgdoze9d4() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(12136);
        __CLR4_2_08qf8qflnxz233t.R.inc(12137);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(12138)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(12139)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(12140);System.out.format("%n%s%n", "RegressionTest0.test045");
        }__CLR4_2_08qf8qflnxz233t.R.inc(12141);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12142);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12143);org.jsoup.nodes.Node node3 = element1.previousSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(12144);java.lang.String str4 = element1.id();
        __CLR4_2_08qf8qflnxz233t.R.inc(12145);org.jsoup.select.Elements elements5 = element1.parents();
        __CLR4_2_08qf8qflnxz233t.R.inc(12146);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(12147);org.junit.Assert.assertNull(node3);
        __CLR4_2_08qf8qflnxz233t.R.inc(12148);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12149);org.junit.Assert.assertNotNull(elements5);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test046() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),12150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0g7dq6x9di();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test046",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),12150,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0g7dq6x9di() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(12150);
        __CLR4_2_08qf8qflnxz233t.R.inc(12151);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(12152)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(12153)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(12154);System.out.format("%n%s%n", "RegressionTest0.test046");
        }__CLR4_2_08qf8qflnxz233t.R.inc(12155);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12156);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12157);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(12158);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(12159);org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12160);java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12161);org.jsoup.nodes.Element element9 = element6.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12162);java.lang.String str10 = element9.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12163);org.jsoup.nodes.Element element12 = element9.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12164);java.lang.String str13 = element9.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12165);org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12166);java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12167);org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        __CLR4_2_08qf8qflnxz233t.R.inc(12168);org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(12169);int int20 = element18.elementSiblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(12170);org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(12171);org.jsoup.nodes.Node node22 = element18.nextSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(12172);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(12173);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(12174);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12175);org.junit.Assert.assertNotNull(textNodeList7);
        __CLR4_2_08qf8qflnxz233t.R.inc(12176);org.junit.Assert.assertNotNull(element9);
        __CLR4_2_08qf8qflnxz233t.R.inc(12177);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12178);org.junit.Assert.assertNotNull(element12);
        __CLR4_2_08qf8qflnxz233t.R.inc(12179);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12180);org.junit.Assert.assertNotNull(textNodeList17);
        __CLR4_2_08qf8qflnxz233t.R.inc(12181);org.junit.Assert.assertNotNull(element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(12182);org.junit.Assert.assertNull(element19);
        __CLR4_2_08qf8qflnxz233t.R.inc(12183);org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(12184);org.junit.Assert.assertNotNull(element21);
        __CLR4_2_08qf8qflnxz233t.R.inc(12185);org.junit.Assert.assertNull(node22);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test047() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),12186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0cydreg9ei();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test047",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),12186,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0cydreg9ei() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(12186);
        __CLR4_2_08qf8qflnxz233t.R.inc(12187);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(12188)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(12189)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(12190);System.out.format("%n%s%n", "RegressionTest0.test047");
        }__CLR4_2_08qf8qflnxz233t.R.inc(12191);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12192);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12193);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12194);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12195);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12196);java.lang.String str8 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12197);org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12198);java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12199);org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(12200);org.jsoup.nodes.Element element14 = element13.previousElementSibling();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(12201);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(12202);org.jsoup.nodes.Element element15 = element14.shallowClone();
            __CLR4_2_08qf8qflnxz233t.R.inc(12203);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(12204);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(12205);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(12206);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12207);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(12208);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12209);org.junit.Assert.assertNotNull(textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(12210);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(12211);org.junit.Assert.assertNull(element14);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test048() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),12212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_09pdslz9f8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test048",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),12212,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_09pdslz9f8() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(12212);
        __CLR4_2_08qf8qflnxz233t.R.inc(12213);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(12214)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(12215)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(12216);System.out.format("%n%s%n", "RegressionTest0.test048");
        }__CLR4_2_08qf8qflnxz233t.R.inc(12217);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12218);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12219);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12220);org.jsoup.nodes.Element element5 = element1.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12221);org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValueMatching("<hi!>\n hi!\n</hi!>", "<hi!>\n hi!\n</hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(12222);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(12223);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(12224);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(12225);org.junit.Assert.assertNotNull(elements8);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test049() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),12226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_06gdtti9fm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test049",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),12226,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_06gdtti9fm() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(12226);
        __CLR4_2_08qf8qflnxz233t.R.inc(12227);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(12228)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(12229)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(12230);System.out.format("%n%s%n", "RegressionTest0.test049");
        }__CLR4_2_08qf8qflnxz233t.R.inc(12231);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12232);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12233);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12234);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12235);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(12236);org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12237);org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12238);java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element10.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12239);org.jsoup.nodes.Element element12 = element10.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(12240);int int13 = element10.siblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(12241);org.jsoup.select.Elements elements14 = element10.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(12242);java.util.List<org.jsoup.nodes.Node> nodeList15 = element10.childNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12243);org.jsoup.nodes.Element element17 = element10.toggleClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12244);boolean boolean18 = element4.equals((java.lang.Object) "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12245);org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12246);java.util.List<org.jsoup.nodes.TextNode> textNodeList22 = element21.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12247);org.jsoup.nodes.Element element23 = element21.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(12248);java.lang.String str24 = element21.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(12249);java.util.List<org.jsoup.nodes.Node> nodeList25 = element21.childNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12250);org.jsoup.nodes.Element element27 = element21.append("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12251);org.jsoup.nodes.Node[] nodeArray28 = new org.jsoup.nodes.Node[] { element27 };
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(12252);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(12253);org.jsoup.nodes.Element element29 = element4.insertChildren(10, nodeArray28);
            __CLR4_2_08qf8qflnxz233t.R.inc(12254);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(12255);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(12256);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(12257);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12258);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(12259);org.junit.Assert.assertNotNull(element8);
        __CLR4_2_08qf8qflnxz233t.R.inc(12260);org.junit.Assert.assertNotNull(textNodeList11);
        __CLR4_2_08qf8qflnxz233t.R.inc(12261);org.junit.Assert.assertNotNull(element12);
        __CLR4_2_08qf8qflnxz233t.R.inc(12262);org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(12263);org.junit.Assert.assertNotNull(elements14);
        __CLR4_2_08qf8qflnxz233t.R.inc(12264);org.junit.Assert.assertNotNull(nodeList15);
        __CLR4_2_08qf8qflnxz233t.R.inc(12265);org.junit.Assert.assertNotNull(element17);
        __CLR4_2_08qf8qflnxz233t.R.inc(12266);org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(12267);org.junit.Assert.assertNotNull(textNodeList22);
        __CLR4_2_08qf8qflnxz233t.R.inc(12268);org.junit.Assert.assertNull(element23);
        __CLR4_2_08qf8qflnxz233t.R.inc(12269);org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12270);org.junit.Assert.assertNotNull(nodeList25);
        __CLR4_2_08qf8qflnxz233t.R.inc(12271);org.junit.Assert.assertNotNull(element27);
        __CLR4_2_08qf8qflnxz233t.R.inc(12272);org.junit.Assert.assertNotNull(nodeArray28);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test050() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),12273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_05zime89gx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test050",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),12273,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_05zime89gx() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(12273);
        __CLR4_2_08qf8qflnxz233t.R.inc(12274);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(12275)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(12276)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(12277);System.out.format("%n%s%n", "RegressionTest0.test050");
        }__CLR4_2_08qf8qflnxz233t.R.inc(12278);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12279);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12280);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(12281);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(12282);org.jsoup.nodes.Element element5 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(12283);java.util.regex.Pattern pattern7 = null;
        __CLR4_2_08qf8qflnxz233t.R.inc(12284);org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", pattern7);
        __CLR4_2_08qf8qflnxz233t.R.inc(12285);org.jsoup.nodes.Element element11 = element1.attr("", false);
        __CLR4_2_08qf8qflnxz233t.R.inc(12286);boolean boolean13 = element11.hasAttr("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12287);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(12288);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(12289);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12290);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(12291);org.junit.Assert.assertNotNull(elements8);
        __CLR4_2_08qf8qflnxz233t.R.inc(12292);org.junit.Assert.assertNotNull(element11);
        __CLR4_2_08qf8qflnxz233t.R.inc(12293);org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test051() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),12294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_02qinlr9hi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test051",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),12294,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_02qinlr9hi() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(12294);
        __CLR4_2_08qf8qflnxz233t.R.inc(12295);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(12296)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(12297)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(12298);System.out.format("%n%s%n", "RegressionTest0.test051");
        }__CLR4_2_08qf8qflnxz233t.R.inc(12299);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12300);org.jsoup.nodes.Element element3 = element1.appendText("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12301);java.lang.String str4 = element3.wholeText();
        __CLR4_2_08qf8qflnxz233t.R.inc(12302);java.lang.String str5 = element3.toString();
        __CLR4_2_08qf8qflnxz233t.R.inc(12303);java.lang.String str6 = element3.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12304);java.lang.String str7 = element3.html();
        __CLR4_2_08qf8qflnxz233t.R.inc(12305);org.junit.Assert.assertNotNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(12306);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12307);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!>\n hi!\n</hi!>" + "'", str5, "<hi!>\n hi!\n</hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(12308);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12309);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test052() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),12310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ihb6q9hy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test052",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),12310,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ihb6q9hy() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(12310);
        __CLR4_2_08qf8qflnxz233t.R.inc(12311);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(12312)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(12313)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(12314);System.out.format("%n%s%n", "RegressionTest0.test052");
        }__CLR4_2_08qf8qflnxz233t.R.inc(12315);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12316);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12317);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12318);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12319);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(12320);int int7 = element4.childNodeSize();
        __CLR4_2_08qf8qflnxz233t.R.inc(12321);java.lang.String str8 = element4.wholeText();
        __CLR4_2_08qf8qflnxz233t.R.inc(12322);org.jsoup.nodes.Element element10 = element4.removeAttr("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12323);org.jsoup.nodes.Element element13 = element4.attr("hi!", "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12324);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(12325);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(12326);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12327);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(12328);org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(12329);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12330);org.junit.Assert.assertNotNull(element10);
        __CLR4_2_08qf8qflnxz233t.R.inc(12331);org.junit.Assert.assertNotNull(element13);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test053() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),12332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_03rh9z79ik();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test053",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),12332,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_03rh9z79ik() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(12332);
        __CLR4_2_08qf8qflnxz233t.R.inc(12333);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(12334)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(12335)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(12336);System.out.format("%n%s%n", "RegressionTest0.test053");
        }__CLR4_2_08qf8qflnxz233t.R.inc(12337);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12338);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12339);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12340);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12341);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12342);java.lang.String str8 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12343);org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12344);java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12345);org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(12346);org.jsoup.nodes.Element element14 = element13.previousElementSibling();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(12347);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(12348);org.jsoup.nodes.Element element16 = element14.child((int) (byte) 0);
            __CLR4_2_08qf8qflnxz233t.R.inc(12349);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(12350);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(12351);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(12352);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12353);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(12354);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12355);org.junit.Assert.assertNotNull(textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(12356);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(12357);org.junit.Assert.assertNull(element14);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test054() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),12358);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_070h8ro9ja();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test054",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),12358,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_070h8ro9ja() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(12358);
        __CLR4_2_08qf8qflnxz233t.R.inc(12359);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(12360)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(12361)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(12362);System.out.format("%n%s%n", "RegressionTest0.test054");
        }__CLR4_2_08qf8qflnxz233t.R.inc(12363);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12364);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12365);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12366);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12367);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12368);boolean boolean9 = element4.hasAttr("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12369);org.jsoup.select.Elements elements11 = element4.getElementsContainingText("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12370);org.jsoup.nodes.Element element13 = element4.prependText("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12371);java.lang.String str14 = element13.data();
        __CLR4_2_08qf8qflnxz233t.R.inc(12372);org.jsoup.nodes.Element element16 = element13.appendText("<hi!></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(12373);org.jsoup.select.Elements elements18 = element13.getElementsByIndexGreaterThan((int) (short) 100);
        __CLR4_2_08qf8qflnxz233t.R.inc(12374);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(12375);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(12376);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12377);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(12378);org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(12379);org.junit.Assert.assertNotNull(elements11);
        __CLR4_2_08qf8qflnxz233t.R.inc(12380);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(12381);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12382);org.junit.Assert.assertNotNull(element16);
        __CLR4_2_08qf8qflnxz233t.R.inc(12383);org.junit.Assert.assertNotNull(elements18);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test055() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),12384);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0a9h7k59k0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test055",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),12384,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0a9h7k59k0() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(12384);
        __CLR4_2_08qf8qflnxz233t.R.inc(12385);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(12386)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(12387)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(12388);System.out.format("%n%s%n", "RegressionTest0.test055");
        }__CLR4_2_08qf8qflnxz233t.R.inc(12389);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12390);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12391);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12392);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12393);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12394);java.lang.String str8 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12395);org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12396);java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12397);org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(12398);int int14 = element13.childNodeSize();
        __CLR4_2_08qf8qflnxz233t.R.inc(12399);org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12400);java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12401);org.jsoup.nodes.Element element19 = element16.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12402);java.lang.String str20 = element19.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12403);org.jsoup.nodes.Element element22 = element19.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12404);java.lang.String str23 = element19.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12405);org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12406);java.util.List<org.jsoup.nodes.TextNode> textNodeList27 = element26.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12407);org.jsoup.nodes.Element element28 = element19.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList27);
        __CLR4_2_08qf8qflnxz233t.R.inc(12408);org.jsoup.nodes.Element element31 = element19.attr("<hi!>\n hi!\n</hi!>", false);
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(12409);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(12410);element13.replaceWith((org.jsoup.nodes.Node) element31);
            __CLR4_2_08qf8qflnxz233t.R.inc(12411);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(12412);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(12413);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(12414);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12415);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(12416);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12417);org.junit.Assert.assertNotNull(textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(12418);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(12419);org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(12420);org.junit.Assert.assertNotNull(textNodeList17);
        __CLR4_2_08qf8qflnxz233t.R.inc(12421);org.junit.Assert.assertNotNull(element19);
        __CLR4_2_08qf8qflnxz233t.R.inc(12422);org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12423);org.junit.Assert.assertNotNull(element22);
        __CLR4_2_08qf8qflnxz233t.R.inc(12424);org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12425);org.junit.Assert.assertNotNull(textNodeList27);
        __CLR4_2_08qf8qflnxz233t.R.inc(12426);org.junit.Assert.assertNotNull(element28);
        __CLR4_2_08qf8qflnxz233t.R.inc(12427);org.junit.Assert.assertNotNull(element31);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test056() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),12428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0dih6cm9l8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test056",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),12428,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0dih6cm9l8() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(12428);
        __CLR4_2_08qf8qflnxz233t.R.inc(12429);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(12430)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(12431)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(12432);System.out.format("%n%s%n", "RegressionTest0.test056");
        }__CLR4_2_08qf8qflnxz233t.R.inc(12433);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12434);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12435);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12436);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12437);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12438);java.lang.String str8 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12439);org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12440);java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12441);org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(12442);org.jsoup.nodes.Element element16 = element4.attr("<hi!>\n hi!\n</hi!>", false);
        __CLR4_2_08qf8qflnxz233t.R.inc(12443);org.jsoup.select.Elements elements17 = element4.getAllElements();
        __CLR4_2_08qf8qflnxz233t.R.inc(12444);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(12445);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(12446);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12447);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(12448);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12449);org.junit.Assert.assertNotNull(textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(12450);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(12451);org.junit.Assert.assertNotNull(element16);
        __CLR4_2_08qf8qflnxz233t.R.inc(12452);org.junit.Assert.assertNotNull(elements17);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test057() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),12453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0grh5539lx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test057",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),12453,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0grh5539lx() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(12453);
        __CLR4_2_08qf8qflnxz233t.R.inc(12454);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(12455)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(12456)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(12457);System.out.format("%n%s%n", "RegressionTest0.test057");
        }__CLR4_2_08qf8qflnxz233t.R.inc(12458);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12459);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12460);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12461);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12462);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12463);org.jsoup.nodes.Element element8 = element4.clone();
        __CLR4_2_08qf8qflnxz233t.R.inc(12464);java.util.Set<java.lang.String> strSet9 = element8.classNames();
        __CLR4_2_08qf8qflnxz233t.R.inc(12465);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(12466);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(12467);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12468);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(12469);org.junit.Assert.assertNotNull(element8);
        __CLR4_2_08qf8qflnxz233t.R.inc(12470);org.junit.Assert.assertNotNull(strSet9);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test058() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),12471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0k0h3xk9mf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test058",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),12471,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0k0h3xk9mf() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(12471);
        __CLR4_2_08qf8qflnxz233t.R.inc(12472);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(12473)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(12474)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(12475);System.out.format("%n%s%n", "RegressionTest0.test058");
        }__CLR4_2_08qf8qflnxz233t.R.inc(12476);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12477);org.jsoup.nodes.Element element3 = element1.appendText("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12478);java.lang.String str4 = element3.wholeText();
        __CLR4_2_08qf8qflnxz233t.R.inc(12479);java.lang.String str5 = element3.toString();
        __CLR4_2_08qf8qflnxz233t.R.inc(12480);java.lang.String str6 = element3.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12481);org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12482);org.jsoup.nodes.Element element11 = element9.appendText("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12483);org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12484);java.util.List<org.jsoup.nodes.TextNode> textNodeList14 = element13.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12485);org.jsoup.nodes.Element element15 = element13.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(12486);java.lang.String str16 = element13.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(12487);java.util.List<org.jsoup.nodes.Node> nodeList17 = element13.childNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12488);org.jsoup.nodes.Element element19 = element13.append("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12489);org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12490);java.util.List<org.jsoup.nodes.TextNode> textNodeList22 = element21.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12491);org.jsoup.nodes.Element element24 = element21.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12492);java.lang.String str25 = element24.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12493);org.jsoup.select.Elements elements26 = element24.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(12494);org.jsoup.nodes.Node[] nodeArray27 = new org.jsoup.nodes.Node[] { element11, element19, element24 };
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(12495);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(12496);org.jsoup.nodes.Element element28 = element3.insertChildren((int) '4', nodeArray27);
            __CLR4_2_08qf8qflnxz233t.R.inc(12497);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(12498);org.junit.Assert.assertNotNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(12499);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12500);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!>\n hi!\n</hi!>" + "'", str5, "<hi!>\n hi!\n</hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(12501);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12502);org.junit.Assert.assertNotNull(element11);
        __CLR4_2_08qf8qflnxz233t.R.inc(12503);org.junit.Assert.assertNotNull(textNodeList14);
        __CLR4_2_08qf8qflnxz233t.R.inc(12504);org.junit.Assert.assertNull(element15);
        __CLR4_2_08qf8qflnxz233t.R.inc(12505);org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12506);org.junit.Assert.assertNotNull(nodeList17);
        __CLR4_2_08qf8qflnxz233t.R.inc(12507);org.junit.Assert.assertNotNull(element19);
        __CLR4_2_08qf8qflnxz233t.R.inc(12508);org.junit.Assert.assertNotNull(textNodeList22);
        __CLR4_2_08qf8qflnxz233t.R.inc(12509);org.junit.Assert.assertNotNull(element24);
        __CLR4_2_08qf8qflnxz233t.R.inc(12510);org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12511);org.junit.Assert.assertNotNull(elements26);
        __CLR4_2_08qf8qflnxz233t.R.inc(12512);org.junit.Assert.assertNotNull(nodeArray27);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test059() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),12513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0n9h2q19nl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test059",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),12513,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0n9h2q19nl() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(12513);
        __CLR4_2_08qf8qflnxz233t.R.inc(12514);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(12515)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(12516)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(12517);System.out.format("%n%s%n", "RegressionTest0.test059");
        }__CLR4_2_08qf8qflnxz233t.R.inc(12518);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12519);org.jsoup.nodes.Element element3 = element1.appendText("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12520);java.lang.String str4 = element3.wholeText();
        __CLR4_2_08qf8qflnxz233t.R.inc(12521);org.jsoup.select.NodeFilter nodeFilter5 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(12522);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(12523);org.jsoup.nodes.Element element6 = element3.filter(nodeFilter5);
            __CLR4_2_08qf8qflnxz233t.R.inc(12524);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(12525);org.junit.Assert.assertNotNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(12526);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test060() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),12527);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0nqca5b9nz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test060",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),12527,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0nqca5b9nz() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(12527);
        __CLR4_2_08qf8qflnxz233t.R.inc(12528);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(12529)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(12530)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(12531);System.out.format("%n%s%n", "RegressionTest0.test060");
        }__CLR4_2_08qf8qflnxz233t.R.inc(12532);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12533);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12534);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12535);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12536);org.jsoup.nodes.Node node6 = element4.previousSibling();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(12537);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(12538);org.jsoup.nodes.Element element8 = element4.child((-1));
            __CLR4_2_08qf8qflnxz233t.R.inc(12539);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(12540);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(12541);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(12542);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12543);org.junit.Assert.assertNull(node6);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test061() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),12544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0qzc8xs9og();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test061",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),12544,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0qzc8xs9og() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(12544);
        __CLR4_2_08qf8qflnxz233t.R.inc(12545);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(12546)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(12547)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(12548);System.out.format("%n%s%n", "RegressionTest0.test061");
        }__CLR4_2_08qf8qflnxz233t.R.inc(12549);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12550);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12551);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12552);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12553);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(12554);int int7 = element4.childNodeSize();
        __CLR4_2_08qf8qflnxz233t.R.inc(12555);java.util.Map<java.lang.String, java.lang.String> strMap8 = element4.dataset();
        __CLR4_2_08qf8qflnxz233t.R.inc(12556);org.jsoup.select.Elements elements9 = element4.nextElementSiblings();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(12557);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(12558);org.jsoup.select.Elements elements11 = element4.getElementsByAttribute("");
            __CLR4_2_08qf8qflnxz233t.R.inc(12559);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(12560);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(12561);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(12562);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12563);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(12564);org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(12565);org.junit.Assert.assertNotNull(strMap8);
        __CLR4_2_08qf8qflnxz233t.R.inc(12566);org.junit.Assert.assertNotNull(elements9);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test062() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),12567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0u8c7q99p3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test062",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),12567,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0u8c7q99p3() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(12567);
        __CLR4_2_08qf8qflnxz233t.R.inc(12568);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(12569)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(12570)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(12571);System.out.format("%n%s%n", "RegressionTest0.test062");
        }__CLR4_2_08qf8qflnxz233t.R.inc(12572);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12573);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12574);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12575);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12576);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(12577);java.lang.String str7 = element4.ownText();
        __CLR4_2_08qf8qflnxz233t.R.inc(12578);org.jsoup.select.Elements elements8 = element4.getAllElements();
        __CLR4_2_08qf8qflnxz233t.R.inc(12579);java.lang.String str10 = element4.attr("<hi!>\n hi!\n</hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(12580);org.jsoup.nodes.Node node11 = element4.nextSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(12581);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(12582);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(12583);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12584);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(12585);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12586);org.junit.Assert.assertNotNull(elements8);
        __CLR4_2_08qf8qflnxz233t.R.inc(12587);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12588);org.junit.Assert.assertNull(node11);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test063() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),12589);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0xhc6iq9pp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test063",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),12589,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0xhc6iq9pp() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(12589);
        __CLR4_2_08qf8qflnxz233t.R.inc(12590);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(12591)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(12592)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(12593);System.out.format("%n%s%n", "RegressionTest0.test063");
        }__CLR4_2_08qf8qflnxz233t.R.inc(12594);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12595);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12596);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12597);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12598);org.jsoup.nodes.Node node6 = element4.previousSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(12599);org.jsoup.select.Elements elements8 = element4.getElementsByTag("<hi! class=\"\"></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(12600);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(12601);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(12602);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12603);org.junit.Assert.assertNull(node6);
        __CLR4_2_08qf8qflnxz233t.R.inc(12604);org.junit.Assert.assertNotNull(elements8);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test064() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),12605);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0yarwnx9q5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test064",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),12605,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0yarwnx9q5() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(12605);
        __CLR4_2_08qf8qflnxz233t.R.inc(12606);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(12607)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(12608)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(12609);System.out.format("%n%s%n", "RegressionTest0.test064");
        }__CLR4_2_08qf8qflnxz233t.R.inc(12610);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12611);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12612);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(12613);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(12614);org.jsoup.select.Elements elements6 = element1.getElementsByAttributeStarting("<hi!></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(12615);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(12616);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(12617);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12618);org.junit.Assert.assertNotNull(elements6);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test065() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),12619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0v1rxvg9qj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test065",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),12619,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0v1rxvg9qj() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(12619);
        __CLR4_2_08qf8qflnxz233t.R.inc(12620);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(12621)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(12622)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(12623);System.out.format("%n%s%n", "RegressionTest0.test065");
        }__CLR4_2_08qf8qflnxz233t.R.inc(12624);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12625);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12626);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12627);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12628);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12629);java.lang.String str8 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12630);org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12631);java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12632);org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(12633);org.jsoup.nodes.Element element14 = element13.shallowClone();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(12634);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(12635);org.jsoup.nodes.Element element16 = element13.child((int) (short) 100);
            __CLR4_2_08qf8qflnxz233t.R.inc(12636);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(12637);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(12638);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(12639);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12640);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(12641);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12642);org.junit.Assert.assertNotNull(textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(12643);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(12644);org.junit.Assert.assertNotNull(element14);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test066() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),12645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0rsrz2z9r9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test066",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),12645,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0rsrz2z9r9() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(12645);
        __CLR4_2_08qf8qflnxz233t.R.inc(12646);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(12647)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(12648)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(12649);System.out.format("%n%s%n", "RegressionTest0.test066");
        }__CLR4_2_08qf8qflnxz233t.R.inc(12650);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12651);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12652);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12653);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12654);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12655);java.lang.String str8 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12656);org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12657);java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12658);org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(12659);org.jsoup.nodes.Element element14 = element13.previousElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(12660);element13.setBaseUri("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12661);org.jsoup.select.Evaluator evaluator17 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(12662);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(12663);boolean boolean18 = element13.is(evaluator17);
            __CLR4_2_08qf8qflnxz233t.R.inc(12664);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(12665);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(12666);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(12667);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12668);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(12669);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12670);org.junit.Assert.assertNotNull(textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(12671);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(12672);org.junit.Assert.assertNull(element14);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test067() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),12673);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ojs0ai9s1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test067",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),12673,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ojs0ai9s1() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(12673);
        __CLR4_2_08qf8qflnxz233t.R.inc(12674);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(12675)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(12676)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(12677);System.out.format("%n%s%n", "RegressionTest0.test067");
        }__CLR4_2_08qf8qflnxz233t.R.inc(12678);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12679);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12680);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(12681);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(12682);org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12683);java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12684);org.jsoup.nodes.Element element9 = element6.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12685);java.lang.String str10 = element9.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12686);org.jsoup.nodes.Element element12 = element9.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12687);java.lang.String str13 = element9.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12688);org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12689);java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12690);org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        __CLR4_2_08qf8qflnxz233t.R.inc(12691);org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(12692);int int20 = element18.elementSiblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(12693);org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(12694);org.jsoup.nodes.Element element23 = element18.appendText("<hi!></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(12695);boolean boolean24 = element18.hasParent();
        __CLR4_2_08qf8qflnxz233t.R.inc(12696);org.jsoup.nodes.Element element26 = element18.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12697);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(12698);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(12699);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12700);org.junit.Assert.assertNotNull(textNodeList7);
        __CLR4_2_08qf8qflnxz233t.R.inc(12701);org.junit.Assert.assertNotNull(element9);
        __CLR4_2_08qf8qflnxz233t.R.inc(12702);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12703);org.junit.Assert.assertNotNull(element12);
        __CLR4_2_08qf8qflnxz233t.R.inc(12704);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12705);org.junit.Assert.assertNotNull(textNodeList17);
        __CLR4_2_08qf8qflnxz233t.R.inc(12706);org.junit.Assert.assertNotNull(element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(12707);org.junit.Assert.assertNull(element19);
        __CLR4_2_08qf8qflnxz233t.R.inc(12708);org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(12709);org.junit.Assert.assertNotNull(element21);
        __CLR4_2_08qf8qflnxz233t.R.inc(12710);org.junit.Assert.assertNotNull(element23);
        __CLR4_2_08qf8qflnxz233t.R.inc(12711);org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        __CLR4_2_08qf8qflnxz233t.R.inc(12712);org.junit.Assert.assertNotNull(element26);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test068() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),12713);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0las1i19t5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test068",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),12713,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0las1i19t5() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(12713);
        __CLR4_2_08qf8qflnxz233t.R.inc(12714);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(12715)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(12716)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(12717);System.out.format("%n%s%n", "RegressionTest0.test068");
        }__CLR4_2_08qf8qflnxz233t.R.inc(12718);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12719);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12720);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12721);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12722);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(12723);org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12724);org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12725);java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element10.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12726);org.jsoup.nodes.Element element12 = element10.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(12727);int int13 = element10.siblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(12728);org.jsoup.select.Elements elements14 = element10.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(12729);java.util.List<org.jsoup.nodes.Node> nodeList15 = element10.childNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12730);org.jsoup.nodes.Element element17 = element10.toggleClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12731);boolean boolean18 = element4.equals((java.lang.Object) "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12732);org.jsoup.select.Elements elements21 = element4.getElementsByAttributeValue("<hi!></hi!>", "<hi! class=\"\"></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(12733);org.jsoup.select.Elements elements23 = element4.getElementsByClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12734);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(12735);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(12736);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12737);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(12738);org.junit.Assert.assertNotNull(element8);
        __CLR4_2_08qf8qflnxz233t.R.inc(12739);org.junit.Assert.assertNotNull(textNodeList11);
        __CLR4_2_08qf8qflnxz233t.R.inc(12740);org.junit.Assert.assertNotNull(element12);
        __CLR4_2_08qf8qflnxz233t.R.inc(12741);org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(12742);org.junit.Assert.assertNotNull(elements14);
        __CLR4_2_08qf8qflnxz233t.R.inc(12743);org.junit.Assert.assertNotNull(nodeList15);
        __CLR4_2_08qf8qflnxz233t.R.inc(12744);org.junit.Assert.assertNotNull(element17);
        __CLR4_2_08qf8qflnxz233t.R.inc(12745);org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(12746);org.junit.Assert.assertNotNull(elements21);
        __CLR4_2_08qf8qflnxz233t.R.inc(12747);org.junit.Assert.assertNotNull(elements23);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test069() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),12748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0i1s2pk9u4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test069",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),12748,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0i1s2pk9u4() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(12748);
        __CLR4_2_08qf8qflnxz233t.R.inc(12749);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(12750)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(12751)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(12752);System.out.format("%n%s%n", "RegressionTest0.test069");
        }__CLR4_2_08qf8qflnxz233t.R.inc(12753);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12754);org.jsoup.nodes.Element element3 = element1.appendText("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12755);java.lang.String str4 = element3.wholeText();
        __CLR4_2_08qf8qflnxz233t.R.inc(12756);java.lang.String str5 = element3.toString();
        __CLR4_2_08qf8qflnxz233t.R.inc(12757);org.jsoup.select.Elements elements6 = element3.children();
        __CLR4_2_08qf8qflnxz233t.R.inc(12758);org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12759);java.util.List<org.jsoup.nodes.TextNode> textNodeList9 = element8.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12760);org.jsoup.nodes.Element element11 = element8.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12761);java.lang.String str12 = element11.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12762);org.jsoup.nodes.Element element14 = element11.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12763);boolean boolean16 = element11.hasAttr("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12764);org.jsoup.select.Elements elements18 = element11.getElementsContainingText("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12765);org.jsoup.nodes.Element element20 = element11.prependText("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12766);org.jsoup.select.Elements elements21 = element20.getAllElements();
        __CLR4_2_08qf8qflnxz233t.R.inc(12767);java.lang.String str22 = element20.val();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(12768);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(12769);org.jsoup.nodes.Element element23 = element3.before((org.jsoup.nodes.Node) element20);
            __CLR4_2_08qf8qflnxz233t.R.inc(12770);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(12771);org.junit.Assert.assertNotNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(12772);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12773);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!>\n hi!\n</hi!>" + "'", str5, "<hi!>\n hi!\n</hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(12774);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(12775);org.junit.Assert.assertNotNull(textNodeList9);
        __CLR4_2_08qf8qflnxz233t.R.inc(12776);org.junit.Assert.assertNotNull(element11);
        __CLR4_2_08qf8qflnxz233t.R.inc(12777);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12778);org.junit.Assert.assertNotNull(element14);
        __CLR4_2_08qf8qflnxz233t.R.inc(12779);org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(12780);org.junit.Assert.assertNotNull(elements18);
        __CLR4_2_08qf8qflnxz233t.R.inc(12781);org.junit.Assert.assertNotNull(element20);
        __CLR4_2_08qf8qflnxz233t.R.inc(12782);org.junit.Assert.assertNotNull(elements21);
        __CLR4_2_08qf8qflnxz233t.R.inc(12783);org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test070() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),12784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0hkwvaa9v4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test070",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),12784,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0hkwvaa9v4() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(12784);
        __CLR4_2_08qf8qflnxz233t.R.inc(12785);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(12786)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(12787)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(12788);System.out.format("%n%s%n", "RegressionTest0.test070");
        }__CLR4_2_08qf8qflnxz233t.R.inc(12789);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12790);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12791);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12792);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12793);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(12794);org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12795);org.jsoup.nodes.Element element9 = element8.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12796);org.jsoup.select.Elements elements10 = element9.getAllElements();
        __CLR4_2_08qf8qflnxz233t.R.inc(12797);java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element9.textNodes();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(12798);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(12799);org.jsoup.nodes.Element element13 = element9.prependElement("");
            __CLR4_2_08qf8qflnxz233t.R.inc(12800);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(12801);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(12802);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(12803);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12804);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(12805);org.junit.Assert.assertNotNull(element8);
        __CLR4_2_08qf8qflnxz233t.R.inc(12806);org.junit.Assert.assertNotNull(element9);
        __CLR4_2_08qf8qflnxz233t.R.inc(12807);org.junit.Assert.assertNotNull(elements10);
        __CLR4_2_08qf8qflnxz233t.R.inc(12808);org.junit.Assert.assertNotNull(textNodeList11);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test071() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),12809);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ebwwht9vt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test071",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),12809,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ebwwht9vt() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(12809);
        __CLR4_2_08qf8qflnxz233t.R.inc(12810);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(12811)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(12812)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(12813);System.out.format("%n%s%n", "RegressionTest0.test071");
        }__CLR4_2_08qf8qflnxz233t.R.inc(12814);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12815);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12816);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12817);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12818);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(12819);org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12820);org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12821);java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element10.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12822);org.jsoup.nodes.Element element12 = element10.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(12823);int int13 = element10.siblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(12824);org.jsoup.select.Elements elements14 = element10.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(12825);java.util.List<org.jsoup.nodes.Node> nodeList15 = element10.childNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12826);org.jsoup.nodes.Element element17 = element10.toggleClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12827);boolean boolean18 = element4.equals((java.lang.Object) "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12828);org.jsoup.select.Elements elements21 = element4.getElementsByAttributeValueNot("<hi!></hi!>", "<hi!></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(12829);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(12830);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(12831);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12832);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(12833);org.junit.Assert.assertNotNull(element8);
        __CLR4_2_08qf8qflnxz233t.R.inc(12834);org.junit.Assert.assertNotNull(textNodeList11);
        __CLR4_2_08qf8qflnxz233t.R.inc(12835);org.junit.Assert.assertNotNull(element12);
        __CLR4_2_08qf8qflnxz233t.R.inc(12836);org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(12837);org.junit.Assert.assertNotNull(elements14);
        __CLR4_2_08qf8qflnxz233t.R.inc(12838);org.junit.Assert.assertNotNull(nodeList15);
        __CLR4_2_08qf8qflnxz233t.R.inc(12839);org.junit.Assert.assertNotNull(element17);
        __CLR4_2_08qf8qflnxz233t.R.inc(12840);org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(12841);org.junit.Assert.assertNotNull(elements21);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test072() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),12842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0b2wxpc9wq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test072",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),12842,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0b2wxpc9wq() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(12842);
        __CLR4_2_08qf8qflnxz233t.R.inc(12843);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(12844)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(12845)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(12846);System.out.format("%n%s%n", "RegressionTest0.test072");
        }__CLR4_2_08qf8qflnxz233t.R.inc(12847);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12848);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12849);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12850);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12851);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12852);java.lang.String str8 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12853);org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12854);java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12855);org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(12856);org.jsoup.select.Elements elements14 = element13.siblingElements();
        __CLR4_2_08qf8qflnxz233t.R.inc(12857);org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12858);java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12859);org.jsoup.nodes.Element element18 = element16.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(12860);int int19 = element16.siblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(12861);org.jsoup.select.Elements elements20 = element16.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(12862);java.util.List<org.jsoup.nodes.Node> nodeList21 = element16.childNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12863);org.jsoup.nodes.Element element23 = element16.toggleClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12864);org.jsoup.select.Elements elements25 = element16.getElementsMatchingOwnText("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12865);boolean boolean26 = element13.hasSameValue((java.lang.Object) element16);
        __CLR4_2_08qf8qflnxz233t.R.inc(12866);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(12867);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(12868);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12869);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(12870);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12871);org.junit.Assert.assertNotNull(textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(12872);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(12873);org.junit.Assert.assertNotNull(elements14);
        __CLR4_2_08qf8qflnxz233t.R.inc(12874);org.junit.Assert.assertNotNull(textNodeList17);
        __CLR4_2_08qf8qflnxz233t.R.inc(12875);org.junit.Assert.assertNotNull(element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(12876);org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(12877);org.junit.Assert.assertNotNull(elements20);
        __CLR4_2_08qf8qflnxz233t.R.inc(12878);org.junit.Assert.assertNotNull(nodeList21);
        __CLR4_2_08qf8qflnxz233t.R.inc(12879);org.junit.Assert.assertNotNull(element23);
        __CLR4_2_08qf8qflnxz233t.R.inc(12880);org.junit.Assert.assertNotNull(elements25);
        __CLR4_2_08qf8qflnxz233t.R.inc(12881);org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test073() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),12882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_07twywv9xu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test073",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),12882,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_07twywv9xu() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(12882);
        __CLR4_2_08qf8qflnxz233t.R.inc(12883);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(12884)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(12885)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(12886);System.out.format("%n%s%n", "RegressionTest0.test073");
        }__CLR4_2_08qf8qflnxz233t.R.inc(12887);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12888);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12889);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12890);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12891);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(12892);org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12893);org.jsoup.nodes.Element element9 = element8.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12894);org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12895);java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12896);org.jsoup.nodes.Element element13 = element11.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(12897);java.lang.String str14 = element11.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(12898);org.jsoup.nodes.Element element15 = element11.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(12899);java.util.regex.Pattern pattern17 = null;
        __CLR4_2_08qf8qflnxz233t.R.inc(12900);org.jsoup.select.Elements elements18 = element11.getElementsByAttributeValueMatching("hi!", pattern17);
        __CLR4_2_08qf8qflnxz233t.R.inc(12901);boolean boolean19 = element9.equals((java.lang.Object) pattern17);
        __CLR4_2_08qf8qflnxz233t.R.inc(12902);org.jsoup.select.Elements elements21 = element9.getElementsContainingText("<hi!>\n hi!\n</hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(12903);org.jsoup.nodes.Attributes attributes22 = element9.attributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12904);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(12905);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(12906);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12907);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(12908);org.junit.Assert.assertNotNull(element8);
        __CLR4_2_08qf8qflnxz233t.R.inc(12909);org.junit.Assert.assertNotNull(element9);
        __CLR4_2_08qf8qflnxz233t.R.inc(12910);org.junit.Assert.assertNotNull(textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(12911);org.junit.Assert.assertNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(12912);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12913);org.junit.Assert.assertNotNull(element15);
        __CLR4_2_08qf8qflnxz233t.R.inc(12914);org.junit.Assert.assertNotNull(elements18);
        __CLR4_2_08qf8qflnxz233t.R.inc(12915);org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(12916);org.junit.Assert.assertNotNull(elements21);
        __CLR4_2_08qf8qflnxz233t.R.inc(12917);org.junit.Assert.assertNotNull(attributes22);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test074() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),12918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_04kx04e9yu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test074",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),12918,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_04kx04e9yu() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(12918);
        __CLR4_2_08qf8qflnxz233t.R.inc(12919);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(12920)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(12921)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(12922);System.out.format("%n%s%n", "RegressionTest0.test074");
        }__CLR4_2_08qf8qflnxz233t.R.inc(12923);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12924);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12925);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12926);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12927);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12928);java.lang.String str8 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12929);org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12930);java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12931);org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(12932);java.lang.String str14 = element4.val();
        __CLR4_2_08qf8qflnxz233t.R.inc(12933);org.jsoup.nodes.Element element15 = element4.empty();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(12934);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(12935);element15.remove();
            __CLR4_2_08qf8qflnxz233t.R.inc(12936);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(12937);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(12938);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(12939);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12940);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(12941);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12942);org.junit.Assert.assertNotNull(textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(12943);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(12944);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12945);org.junit.Assert.assertNotNull(element15);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test075() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),12946);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_01bx1bx9zm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test075",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),12946,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_01bx1bx9zm() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(12946);
        __CLR4_2_08qf8qflnxz233t.R.inc(12947);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(12948)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(12949)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(12950);System.out.format("%n%s%n", "RegressionTest0.test075");
        }__CLR4_2_08qf8qflnxz233t.R.inc(12951);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12952);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12953);org.jsoup.nodes.Element element3 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(12954);int int4 = element1.siblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(12955);java.lang.String str5 = element1.baseUri();
        __CLR4_2_08qf8qflnxz233t.R.inc(12956);org.jsoup.nodes.Element element6 = element1.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12957);org.jsoup.nodes.Element element8 = element1.appendText("<hi! class=\"\"></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(12958);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(12959);org.junit.Assert.assertNotNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(12960);org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(12961);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12962);org.junit.Assert.assertNotNull(element6);
        __CLR4_2_08qf8qflnxz233t.R.inc(12963);org.junit.Assert.assertNotNull(element8);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test076() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),12964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_01x2xgka04();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test076",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),12964,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_01x2xgka04() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(12964);
        __CLR4_2_08qf8qflnxz233t.R.inc(12965);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(12966)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(12967)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(12968);System.out.format("%n%s%n", "RegressionTest0.test076");
        }__CLR4_2_08qf8qflnxz233t.R.inc(12969);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12970);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12971);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(12972);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(12973);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(12974);int int7 = element4.childNodeSize();
        __CLR4_2_08qf8qflnxz233t.R.inc(12975);java.lang.String str8 = element4.wholeText();
        __CLR4_2_08qf8qflnxz233t.R.inc(12976);org.jsoup.nodes.Element element10 = element4.text("<hi!></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(12977);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(12978);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(12979);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12980);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(12981);org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(12982);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(12983);org.junit.Assert.assertNotNull(element10);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test077() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),12984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0562w91a0o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test077",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),12984,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0562w91a0o() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(12984);
        __CLR4_2_08qf8qflnxz233t.R.inc(12985);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(12986)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(12987)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(12988);System.out.format("%n%s%n", "RegressionTest0.test077");
        }__CLR4_2_08qf8qflnxz233t.R.inc(12989);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(12990);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(12991);org.jsoup.nodes.Node node3 = element1.previousSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(12992);java.lang.String str4 = element1.outerHtml();
        __CLR4_2_08qf8qflnxz233t.R.inc(12993);org.jsoup.select.Elements elements6 = element1.getElementsMatchingOwnText("hi!");
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(12994);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(12995);boolean boolean8 = element1.is("");
            __CLR4_2_08qf8qflnxz233t.R.inc(12996);org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '': unexpected token at ''");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(12997);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(12998);org.junit.Assert.assertNull(node3);
        __CLR4_2_08qf8qflnxz233t.R.inc(12999);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<hi!></hi!>" + "'", str4, "<hi!></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(13000);org.junit.Assert.assertNotNull(elements6);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test078() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_08f2v1ia15();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test078",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13001,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_08f2v1ia15() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13001);
        __CLR4_2_08qf8qflnxz233t.R.inc(13002);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13003)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13004)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13005);System.out.format("%n%s%n", "RegressionTest0.test078");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13006);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13007);org.jsoup.nodes.Element element2 = element1.empty();
        __CLR4_2_08qf8qflnxz233t.R.inc(13008);java.lang.String str4 = element1.attr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13009);org.junit.Assert.assertNotNull(element2);
        __CLR4_2_08qf8qflnxz233t.R.inc(13010);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test079() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0bo2ttza1f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test079",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13011,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0bo2ttza1f() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13011);
        __CLR4_2_08qf8qflnxz233t.R.inc(13012);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13013)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13014)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13015);System.out.format("%n%s%n", "RegressionTest0.test079");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13016);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13017);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13018);org.jsoup.nodes.Node node3 = element1.previousSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(13019);java.lang.String str4 = element1.outerHtml();
        __CLR4_2_08qf8qflnxz233t.R.inc(13020);org.jsoup.select.Elements elements5 = element1.siblingElements();
        __CLR4_2_08qf8qflnxz233t.R.inc(13021);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(13022);org.junit.Assert.assertNull(node3);
        __CLR4_2_08qf8qflnxz233t.R.inc(13023);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<hi!></hi!>" + "'", str4, "<hi!></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(13024);org.junit.Assert.assertNotNull(elements5);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test080() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13025);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0c4y199a1t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test080",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13025,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0c4y199a1t() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13025);
        __CLR4_2_08qf8qflnxz233t.R.inc(13026);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13027)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13028)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13029);System.out.format("%n%s%n", "RegressionTest0.test080");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13030);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13031);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13032);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(13033);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(13034);org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13035);java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13036);org.jsoup.nodes.Element element9 = element6.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13037);java.lang.String str10 = element9.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13038);org.jsoup.nodes.Element element12 = element9.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13039);java.lang.String str13 = element9.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13040);org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13041);java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13042);org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        __CLR4_2_08qf8qflnxz233t.R.inc(13043);org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(13044);int int20 = element18.elementSiblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(13045);org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(13046);org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13047);java.util.List<org.jsoup.nodes.TextNode> textNodeList24 = element23.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13048);org.jsoup.nodes.Element element26 = element23.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13049);java.lang.String str27 = element26.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13050);org.jsoup.select.Elements elements28 = element26.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(13051);org.jsoup.nodes.Element element30 = element26.toggleClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13052);org.jsoup.nodes.Element element31 = element30.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13053);org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13054);java.util.List<org.jsoup.nodes.TextNode> textNodeList34 = element33.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13055);org.jsoup.nodes.Element element35 = element33.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(13056);java.lang.String str36 = element33.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(13057);org.jsoup.nodes.Element element37 = element33.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(13058);java.util.regex.Pattern pattern39 = null;
        __CLR4_2_08qf8qflnxz233t.R.inc(13059);org.jsoup.select.Elements elements40 = element33.getElementsByAttributeValueMatching("hi!", pattern39);
        __CLR4_2_08qf8qflnxz233t.R.inc(13060);boolean boolean41 = element31.equals((java.lang.Object) pattern39);
        __CLR4_2_08qf8qflnxz233t.R.inc(13061);org.jsoup.nodes.Element element42 = element18.after((org.jsoup.nodes.Node) element31);
        __CLR4_2_08qf8qflnxz233t.R.inc(13062);org.jsoup.select.Elements elements44 = element42.getElementsByAttributeStarting("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13063);org.jsoup.select.Elements elements45 = element42.children();
        __CLR4_2_08qf8qflnxz233t.R.inc(13064);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(13065);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(13066);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13067);org.junit.Assert.assertNotNull(textNodeList7);
        __CLR4_2_08qf8qflnxz233t.R.inc(13068);org.junit.Assert.assertNotNull(element9);
        __CLR4_2_08qf8qflnxz233t.R.inc(13069);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13070);org.junit.Assert.assertNotNull(element12);
        __CLR4_2_08qf8qflnxz233t.R.inc(13071);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13072);org.junit.Assert.assertNotNull(textNodeList17);
        __CLR4_2_08qf8qflnxz233t.R.inc(13073);org.junit.Assert.assertNotNull(element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(13074);org.junit.Assert.assertNull(element19);
        __CLR4_2_08qf8qflnxz233t.R.inc(13075);org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(13076);org.junit.Assert.assertNotNull(element21);
        __CLR4_2_08qf8qflnxz233t.R.inc(13077);org.junit.Assert.assertNotNull(textNodeList24);
        __CLR4_2_08qf8qflnxz233t.R.inc(13078);org.junit.Assert.assertNotNull(element26);
        __CLR4_2_08qf8qflnxz233t.R.inc(13079);org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13080);org.junit.Assert.assertNotNull(elements28);
        __CLR4_2_08qf8qflnxz233t.R.inc(13081);org.junit.Assert.assertNotNull(element30);
        __CLR4_2_08qf8qflnxz233t.R.inc(13082);org.junit.Assert.assertNotNull(element31);
        __CLR4_2_08qf8qflnxz233t.R.inc(13083);org.junit.Assert.assertNotNull(textNodeList34);
        __CLR4_2_08qf8qflnxz233t.R.inc(13084);org.junit.Assert.assertNull(element35);
        __CLR4_2_08qf8qflnxz233t.R.inc(13085);org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13086);org.junit.Assert.assertNotNull(element37);
        __CLR4_2_08qf8qflnxz233t.R.inc(13087);org.junit.Assert.assertNotNull(elements40);
        __CLR4_2_08qf8qflnxz233t.R.inc(13088);org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(13089);org.junit.Assert.assertNotNull(element42);
        __CLR4_2_08qf8qflnxz233t.R.inc(13090);org.junit.Assert.assertNotNull(elements44);
        __CLR4_2_08qf8qflnxz233t.R.inc(13091);org.junit.Assert.assertNotNull(elements45);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test081() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0fdy01qa3o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test081",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13092,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0fdy01qa3o() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13092);
        __CLR4_2_08qf8qflnxz233t.R.inc(13093);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13094)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13095)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13096);System.out.format("%n%s%n", "RegressionTest0.test081");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13097);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13098);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13099);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(13100);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(13101);org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13102);java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13103);org.jsoup.nodes.Element element9 = element6.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13104);java.lang.String str10 = element9.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13105);org.jsoup.nodes.Element element12 = element9.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13106);java.lang.String str13 = element9.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13107);org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13108);java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13109);org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        __CLR4_2_08qf8qflnxz233t.R.inc(13110);java.lang.String str19 = element9.val();
        __CLR4_2_08qf8qflnxz233t.R.inc(13111);java.util.List<org.jsoup.nodes.TextNode> textNodeList20 = element9.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13112);boolean boolean21 = element1.equals((java.lang.Object) textNodeList20);
        __CLR4_2_08qf8qflnxz233t.R.inc(13113);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(13114);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(13115);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13116);org.junit.Assert.assertNotNull(textNodeList7);
        __CLR4_2_08qf8qflnxz233t.R.inc(13117);org.junit.Assert.assertNotNull(element9);
        __CLR4_2_08qf8qflnxz233t.R.inc(13118);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13119);org.junit.Assert.assertNotNull(element12);
        __CLR4_2_08qf8qflnxz233t.R.inc(13120);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13121);org.junit.Assert.assertNotNull(textNodeList17);
        __CLR4_2_08qf8qflnxz233t.R.inc(13122);org.junit.Assert.assertNotNull(element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(13123);org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13124);org.junit.Assert.assertNotNull(textNodeList20);
        __CLR4_2_08qf8qflnxz233t.R.inc(13125);org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test082() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0imxyu7a4m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test082",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13126,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0imxyu7a4m() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13126);
        __CLR4_2_08qf8qflnxz233t.R.inc(13127);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13128)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13129)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13130);System.out.format("%n%s%n", "RegressionTest0.test082");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13131);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13132);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13133);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13134);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13135);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(13136);int int7 = element4.childNodeSize();
        __CLR4_2_08qf8qflnxz233t.R.inc(13137);java.util.Set<java.lang.String> strSet8 = element4.classNames();
        __CLR4_2_08qf8qflnxz233t.R.inc(13138);org.jsoup.nodes.Document document9 = element4.ownerDocument();
        __CLR4_2_08qf8qflnxz233t.R.inc(13139);org.jsoup.select.Elements elements10 = element4.previousElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(13140);java.util.regex.Pattern pattern11 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(13141);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(13142);org.jsoup.select.Elements elements12 = element4.getElementsMatchingOwnText(pattern11);
            __CLR4_2_08qf8qflnxz233t.R.inc(13143);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(13144);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(13145);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(13146);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13147);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(13148);org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(13149);org.junit.Assert.assertNotNull(strSet8);
        __CLR4_2_08qf8qflnxz233t.R.inc(13150);org.junit.Assert.assertNull(document9);
        __CLR4_2_08qf8qflnxz233t.R.inc(13151);org.junit.Assert.assertNotNull(elements10);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test083() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13152);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0lvxxmoa5c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test083",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13152,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0lvxxmoa5c() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13152);
        __CLR4_2_08qf8qflnxz233t.R.inc(13153);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13154)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13155)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13156);System.out.format("%n%s%n", "RegressionTest0.test083");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13157);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13158);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13159);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13160);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13161);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13162);java.lang.String str8 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13163);org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13164);java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13165);org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(13166);java.lang.String str14 = element4.val();
        __CLR4_2_08qf8qflnxz233t.R.inc(13167);org.jsoup.nodes.Element element15 = element4.empty();
        __CLR4_2_08qf8qflnxz233t.R.inc(13168);org.jsoup.nodes.Element element17 = element15.html("hi!");
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(13169);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(13170);boolean boolean19 = element17.is("<hi!>\n hi!\n</hi!>");
            __CLR4_2_08qf8qflnxz233t.R.inc(13171);org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi!>? hi!?</hi!>': unexpected token at '<hi!>? hi!?</hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(13172);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(13173);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(13174);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13175);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(13176);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13177);org.junit.Assert.assertNotNull(textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(13178);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(13179);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13180);org.junit.Assert.assertNotNull(element15);
        __CLR4_2_08qf8qflnxz233t.R.inc(13181);org.junit.Assert.assertNotNull(element17);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test084() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0p4xwf5a66();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test084",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13182,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0p4xwf5a66() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13182);
        __CLR4_2_08qf8qflnxz233t.R.inc(13183);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13184)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13185)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13186);System.out.format("%n%s%n", "RegressionTest0.test084");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13187);org.jsoup.parser.Tag tag0 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(13188);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(13189);org.jsoup.nodes.Element element2 = new org.jsoup.nodes.Element(tag0, "<hi!>\n hi!\n</hi!>");
            __CLR4_2_08qf8qflnxz233t.R.inc(13190);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test085() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0sdxv7ma6f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test085",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13191,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0sdxv7ma6f() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13191);
        __CLR4_2_08qf8qflnxz233t.R.inc(13192);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13193)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13194)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13195);System.out.format("%n%s%n", "RegressionTest0.test085");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13196);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13197);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13198);org.jsoup.nodes.Element element3 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(13199);int int4 = element1.siblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(13200);boolean boolean5 = element1.hasParent();
        __CLR4_2_08qf8qflnxz233t.R.inc(13201);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(13202);org.junit.Assert.assertNotNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(13203);org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(13204);org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test086() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0vmxu03a6t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test086",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13205,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0vmxu03a6t() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13205);
        __CLR4_2_08qf8qflnxz233t.R.inc(13206);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13207)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13208)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13209);System.out.format("%n%s%n", "RegressionTest0.test086");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13210);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13211);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13212);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13213);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13214);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(13215);org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13216);org.jsoup.nodes.Element element9 = element8.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13217);org.jsoup.select.Elements elements10 = element9.getAllElements();
        __CLR4_2_08qf8qflnxz233t.R.inc(13218);java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element9.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13219);org.jsoup.select.Elements elements13 = element9.getElementsByIndexGreaterThan((int) (short) 10);
        __CLR4_2_08qf8qflnxz233t.R.inc(13220);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(13221);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(13222);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13223);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(13224);org.junit.Assert.assertNotNull(element8);
        __CLR4_2_08qf8qflnxz233t.R.inc(13225);org.junit.Assert.assertNotNull(element9);
        __CLR4_2_08qf8qflnxz233t.R.inc(13226);org.junit.Assert.assertNotNull(elements10);
        __CLR4_2_08qf8qflnxz233t.R.inc(13227);org.junit.Assert.assertNotNull(textNodeList11);
        __CLR4_2_08qf8qflnxz233t.R.inc(13228);org.junit.Assert.assertNotNull(elements13);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test087() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13229);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0yvxsska7h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test087",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13229,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0yvxsska7h() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13229);
        __CLR4_2_08qf8qflnxz233t.R.inc(13230);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13231)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13232)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13233);System.out.format("%n%s%n", "RegressionTest0.test087");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13234);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13235);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13236);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13237);org.jsoup.nodes.Element element5 = element1.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13238);org.jsoup.select.Elements elements7 = element5.getElementsByIndexGreaterThan((int) (byte) 10);
        __CLR4_2_08qf8qflnxz233t.R.inc(13239);org.jsoup.nodes.Element element8 = element5.previousElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(13240);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(13241);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(13242);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(13243);org.junit.Assert.assertNotNull(elements7);
        __CLR4_2_08qf8qflnxz233t.R.inc(13244);org.junit.Assert.assertNull(element8);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test088() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13245);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ww6ae3a7x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test088",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13245,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ww6ae3a7x() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13245);
        __CLR4_2_08qf8qflnxz233t.R.inc(13246);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13247)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13248)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13249);System.out.format("%n%s%n", "RegressionTest0.test088");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13250);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13251);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13252);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13253);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13254);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13255);java.lang.String str8 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13256);org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13257);java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13258);org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(13259);java.lang.String str14 = element4.val();
        __CLR4_2_08qf8qflnxz233t.R.inc(13260);org.jsoup.nodes.Element element15 = element4.empty();
        __CLR4_2_08qf8qflnxz233t.R.inc(13261);org.jsoup.nodes.Element element17 = element15.html("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13262);java.util.Map<java.lang.String, java.lang.String> strMap18 = element15.dataset();
        __CLR4_2_08qf8qflnxz233t.R.inc(13263);org.jsoup.select.Elements elements20 = element15.getElementsContainingOwnText("<hi! class=\"\"></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(13264);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(13265);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(13266);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13267);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(13268);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13269);org.junit.Assert.assertNotNull(textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(13270);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(13271);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13272);org.junit.Assert.assertNotNull(element15);
        __CLR4_2_08qf8qflnxz233t.R.inc(13273);org.junit.Assert.assertNotNull(element17);
        __CLR4_2_08qf8qflnxz233t.R.inc(13274);org.junit.Assert.assertNotNull(strMap18);
        __CLR4_2_08qf8qflnxz233t.R.inc(13275);org.junit.Assert.assertNotNull(elements20);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test089() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0tn6blma8s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test089",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13276,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0tn6blma8s() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13276);
        __CLR4_2_08qf8qflnxz233t.R.inc(13277);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13278)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13279)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13280);System.out.format("%n%s%n", "RegressionTest0.test089");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13281);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13282);java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        __CLR4_2_08qf8qflnxz233t.R.inc(13283);java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        __CLR4_2_08qf8qflnxz233t.R.inc(13284);boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        __CLR4_2_08qf8qflnxz233t.R.inc(13285);org.jsoup.nodes.Element element7 = element1.classNames((java.util.Set<java.lang.String>) strSet5);
        __CLR4_2_08qf8qflnxz233t.R.inc(13286);org.jsoup.nodes.Element element10 = element1.attr("<hi!></hi!>", "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13287);java.lang.String str12 = element1.attr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13288);org.junit.Assert.assertNotNull(strArray4);
        __CLR4_2_08qf8qflnxz233t.R.inc(13289);org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        __CLR4_2_08qf8qflnxz233t.R.inc(13290);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(13291);org.junit.Assert.assertNotNull(element10);
        __CLR4_2_08qf8qflnxz233t.R.inc(13292);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test090() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0t6b46ca99();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test090",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13293,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0t6b46ca99() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13293);
        __CLR4_2_08qf8qflnxz233t.R.inc(13294);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13295)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13296)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13297);System.out.format("%n%s%n", "RegressionTest0.test090");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13298);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13299);org.jsoup.nodes.Element element3 = element1.appendText("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13300);java.lang.String str4 = element3.wholeText();
        __CLR4_2_08qf8qflnxz233t.R.inc(13301);java.lang.String str5 = element3.toString();
        __CLR4_2_08qf8qflnxz233t.R.inc(13302);org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13303);java.util.List<org.jsoup.nodes.TextNode> textNodeList8 = element7.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13304);org.jsoup.nodes.Element element10 = element7.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13305);java.lang.String str11 = element10.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13306);org.jsoup.nodes.Element element13 = element10.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13307);org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13308);java.util.List<org.jsoup.nodes.TextNode> textNodeList16 = element15.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13309);org.jsoup.nodes.Element element18 = element15.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13310);java.lang.String str19 = element18.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13311);org.jsoup.nodes.Element element21 = element18.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13312);java.lang.String str22 = element18.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13313);org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13314);java.util.List<org.jsoup.nodes.TextNode> textNodeList26 = element25.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13315);org.jsoup.nodes.Element element27 = element18.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList26);
        __CLR4_2_08qf8qflnxz233t.R.inc(13316);org.jsoup.nodes.Element element28 = element10.appendChild((org.jsoup.nodes.Node) element27);
        __CLR4_2_08qf8qflnxz233t.R.inc(13317);org.jsoup.nodes.Element element30 = element10.prependElement("hi!");
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(13318);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(13319);org.jsoup.nodes.Element element31 = element3.after((org.jsoup.nodes.Node) element30);
            __CLR4_2_08qf8qflnxz233t.R.inc(13320);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(13321);org.junit.Assert.assertNotNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(13322);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13323);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!>\n hi!\n</hi!>" + "'", str5, "<hi!>\n hi!\n</hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(13324);org.junit.Assert.assertNotNull(textNodeList8);
        __CLR4_2_08qf8qflnxz233t.R.inc(13325);org.junit.Assert.assertNotNull(element10);
        __CLR4_2_08qf8qflnxz233t.R.inc(13326);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13327);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(13328);org.junit.Assert.assertNotNull(textNodeList16);
        __CLR4_2_08qf8qflnxz233t.R.inc(13329);org.junit.Assert.assertNotNull(element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(13330);org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13331);org.junit.Assert.assertNotNull(element21);
        __CLR4_2_08qf8qflnxz233t.R.inc(13332);org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13333);org.junit.Assert.assertNotNull(textNodeList26);
        __CLR4_2_08qf8qflnxz233t.R.inc(13334);org.junit.Assert.assertNotNull(element27);
        __CLR4_2_08qf8qflnxz233t.R.inc(13335);org.junit.Assert.assertNotNull(element28);
        __CLR4_2_08qf8qflnxz233t.R.inc(13336);org.junit.Assert.assertNotNull(element30);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test091() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13337);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0pxb5dvaah();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test091",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13337,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0pxb5dvaah() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13337);
        __CLR4_2_08qf8qflnxz233t.R.inc(13338);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13339)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13340)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13341);System.out.format("%n%s%n", "RegressionTest0.test091");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13342);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(13343);java.lang.String str2 = element1.val();
        __CLR4_2_08qf8qflnxz233t.R.inc(13344);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test092() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0mob6leaap();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test092",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13345,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0mob6leaap() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13345);
        __CLR4_2_08qf8qflnxz233t.R.inc(13346);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13347)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13348)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13349);System.out.format("%n%s%n", "RegressionTest0.test092");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13350);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13351);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13352);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13353);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13354);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13355);org.jsoup.select.Elements elements8 = element7.children();
        __CLR4_2_08qf8qflnxz233t.R.inc(13356);org.jsoup.nodes.Element element9 = element7.root();
        __CLR4_2_08qf8qflnxz233t.R.inc(13357);java.lang.String str10 = element9.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13358);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(13359);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(13360);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13361);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(13362);org.junit.Assert.assertNotNull(elements8);
        __CLR4_2_08qf8qflnxz233t.R.inc(13363);org.junit.Assert.assertNotNull(element9);
        __CLR4_2_08qf8qflnxz233t.R.inc(13364);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test093() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0jfb7sxab9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test093",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13365,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0jfb7sxab9() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13365);
        __CLR4_2_08qf8qflnxz233t.R.inc(13366);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13367)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13368)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13369);System.out.format("%n%s%n", "RegressionTest0.test093");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13370);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13371);org.jsoup.nodes.Element element2 = element1.empty();
        __CLR4_2_08qf8qflnxz233t.R.inc(13372);org.jsoup.select.Elements elements4 = element1.getElementsByIndexEquals(100);
        __CLR4_2_08qf8qflnxz233t.R.inc(13373);org.jsoup.select.Elements elements6 = element1.getElementsByTag("<hi!>\n hi!\n</hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(13374);org.junit.Assert.assertNotNull(element2);
        __CLR4_2_08qf8qflnxz233t.R.inc(13375);org.junit.Assert.assertNotNull(elements4);
        __CLR4_2_08qf8qflnxz233t.R.inc(13376);org.junit.Assert.assertNotNull(elements6);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test094() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13377);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0g6b90gabl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test094",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13377,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0g6b90gabl() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13377);
        __CLR4_2_08qf8qflnxz233t.R.inc(13378);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13379)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13380)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13381);System.out.format("%n%s%n", "RegressionTest0.test094");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13382);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13383);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13384);org.jsoup.nodes.Element element3 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(13385);int int4 = element1.siblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(13386);java.lang.String str5 = element1.baseUri();
        __CLR4_2_08qf8qflnxz233t.R.inc(13387);org.jsoup.nodes.Element element6 = element1.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13388);java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element6.dataNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13389);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(13390);org.junit.Assert.assertNotNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(13391);org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(13392);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13393);org.junit.Assert.assertNotNull(element6);
        __CLR4_2_08qf8qflnxz233t.R.inc(13394);org.junit.Assert.assertNotNull(dataNodeList7);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test095() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0cxba7zac3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test095",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13395,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0cxba7zac3() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13395);
        __CLR4_2_08qf8qflnxz233t.R.inc(13396);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13397)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13398)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13399);System.out.format("%n%s%n", "RegressionTest0.test095");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13400);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13401);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13402);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13403);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13404);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(13405);java.lang.String str7 = element4.ownText();
        __CLR4_2_08qf8qflnxz233t.R.inc(13406);org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13407);java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element10.textNodes();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(13408);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(13409);org.jsoup.nodes.Element element12 = element4.insertChildren((int) (byte) 100, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList11);
            __CLR4_2_08qf8qflnxz233t.R.inc(13410);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(13411);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(13412);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(13413);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13414);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(13415);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13416);org.junit.Assert.assertNotNull(textNodeList11);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test096() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_09obbfiacp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test096",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13417,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_09obbfiacp() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13417);
        __CLR4_2_08qf8qflnxz233t.R.inc(13418);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13419)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13420)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13421);System.out.format("%n%s%n", "RegressionTest0.test096");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13422);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13423);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13424);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13425);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13426);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13427);org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13428);java.util.List<org.jsoup.nodes.TextNode> textNodeList10 = element9.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13429);org.jsoup.nodes.Element element12 = element9.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13430);java.lang.String str13 = element12.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13431);org.jsoup.nodes.Element element15 = element12.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13432);java.lang.String str16 = element12.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13433);org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13434);java.util.List<org.jsoup.nodes.TextNode> textNodeList20 = element19.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13435);org.jsoup.nodes.Element element21 = element12.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList20);
        __CLR4_2_08qf8qflnxz233t.R.inc(13436);org.jsoup.nodes.Element element22 = element4.appendChild((org.jsoup.nodes.Node) element21);
        __CLR4_2_08qf8qflnxz233t.R.inc(13437);org.jsoup.select.Elements elements23 = element22.getAllElements();
        __CLR4_2_08qf8qflnxz233t.R.inc(13438);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(13439);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(13440);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13441);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(13442);org.junit.Assert.assertNotNull(textNodeList10);
        __CLR4_2_08qf8qflnxz233t.R.inc(13443);org.junit.Assert.assertNotNull(element12);
        __CLR4_2_08qf8qflnxz233t.R.inc(13444);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13445);org.junit.Assert.assertNotNull(element15);
        __CLR4_2_08qf8qflnxz233t.R.inc(13446);org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13447);org.junit.Assert.assertNotNull(textNodeList20);
        __CLR4_2_08qf8qflnxz233t.R.inc(13448);org.junit.Assert.assertNotNull(element21);
        __CLR4_2_08qf8qflnxz233t.R.inc(13449);org.junit.Assert.assertNotNull(element22);
        __CLR4_2_08qf8qflnxz233t.R.inc(13450);org.junit.Assert.assertNotNull(elements23);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test097() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_06fbcn1adn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test097",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13451,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_06fbcn1adn() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13451);
        __CLR4_2_08qf8qflnxz233t.R.inc(13452);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13453)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13454)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13455);System.out.format("%n%s%n", "RegressionTest0.test097");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13456);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13457);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13458);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13459);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13460);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13461);org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13462);java.util.List<org.jsoup.nodes.TextNode> textNodeList10 = element9.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13463);org.jsoup.nodes.Element element12 = element9.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13464);java.lang.String str13 = element12.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13465);org.jsoup.nodes.Element element15 = element12.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13466);java.lang.String str16 = element12.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13467);org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13468);java.util.List<org.jsoup.nodes.TextNode> textNodeList20 = element19.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13469);org.jsoup.nodes.Element element21 = element12.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList20);
        __CLR4_2_08qf8qflnxz233t.R.inc(13470);org.jsoup.nodes.Element element22 = element4.appendChild((org.jsoup.nodes.Node) element21);
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(13471);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(13472);org.jsoup.nodes.Element element24 = element21.selectFirst("<hi! class=\"\"></hi!>");
            __CLR4_2_08qf8qflnxz233t.R.inc(13473);org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"\"></hi!>': unexpected token at '<hi! class=\"\"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(13474);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(13475);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(13476);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13477);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(13478);org.junit.Assert.assertNotNull(textNodeList10);
        __CLR4_2_08qf8qflnxz233t.R.inc(13479);org.junit.Assert.assertNotNull(element12);
        __CLR4_2_08qf8qflnxz233t.R.inc(13480);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13481);org.junit.Assert.assertNotNull(element15);
        __CLR4_2_08qf8qflnxz233t.R.inc(13482);org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13483);org.junit.Assert.assertNotNull(textNodeList20);
        __CLR4_2_08qf8qflnxz233t.R.inc(13484);org.junit.Assert.assertNotNull(element21);
        __CLR4_2_08qf8qflnxz233t.R.inc(13485);org.junit.Assert.assertNotNull(element22);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test098() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_036bdukaem();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test098",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13486,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_036bdukaem() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13486);
        __CLR4_2_08qf8qflnxz233t.R.inc(13487);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13488)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13489)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13490);System.out.format("%n%s%n", "RegressionTest0.test098");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13491);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13492);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13493);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13494);org.jsoup.nodes.Document document5 = element1.ownerDocument();
        __CLR4_2_08qf8qflnxz233t.R.inc(13495);org.jsoup.nodes.Element element6 = element1.root();
        __CLR4_2_08qf8qflnxz233t.R.inc(13496);org.jsoup.nodes.Element element8 = element1.val("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13497);org.jsoup.select.Elements elements10 = element8.getElementsByAttribute("<hi!>\n hi!\n</hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(13498);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(13499);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(13500);org.junit.Assert.assertNull(document5);
        __CLR4_2_08qf8qflnxz233t.R.inc(13501);org.junit.Assert.assertNotNull(element6);
        __CLR4_2_08qf8qflnxz233t.R.inc(13502);org.junit.Assert.assertNotNull(element8);
        __CLR4_2_08qf8qflnxz233t.R.inc(13503);org.junit.Assert.assertNotNull(elements10);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test099() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_02okxxaf4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test099",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13504,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_02okxxaf4() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13504);
        __CLR4_2_08qf8qflnxz233t.R.inc(13505);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13506)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13507)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13508);System.out.format("%n%s%n", "RegressionTest0.test099");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13509);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13510);org.jsoup.nodes.Element element3 = element1.appendText("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13511);org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13512);java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13513);org.jsoup.nodes.Element element9 = element6.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13514);java.lang.String str10 = element9.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13515);org.jsoup.select.Elements elements11 = element9.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(13516);org.jsoup.nodes.Element element13 = element9.toggleClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13517);org.jsoup.nodes.Element element14 = element13.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13518);org.jsoup.select.Elements elements15 = element14.getAllElements();
        __CLR4_2_08qf8qflnxz233t.R.inc(13519);java.util.List<org.jsoup.nodes.TextNode> textNodeList16 = element14.textNodes();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(13520);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(13521);org.jsoup.nodes.Element element17 = element1.insertChildren(100, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList16);
            __CLR4_2_08qf8qflnxz233t.R.inc(13522);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(13523);org.junit.Assert.assertNotNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(13524);org.junit.Assert.assertNotNull(textNodeList7);
        __CLR4_2_08qf8qflnxz233t.R.inc(13525);org.junit.Assert.assertNotNull(element9);
        __CLR4_2_08qf8qflnxz233t.R.inc(13526);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13527);org.junit.Assert.assertNotNull(elements11);
        __CLR4_2_08qf8qflnxz233t.R.inc(13528);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(13529);org.junit.Assert.assertNotNull(element14);
        __CLR4_2_08qf8qflnxz233t.R.inc(13530);org.junit.Assert.assertNotNull(elements15);
        __CLR4_2_08qf8qflnxz233t.R.inc(13531);org.junit.Assert.assertNotNull(textNodeList16);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test100() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0enfq0qafw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test100",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13532,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0enfq0qafw() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13532);
        __CLR4_2_08qf8qflnxz233t.R.inc(13533);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13534)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13535)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13536);System.out.format("%n%s%n", "RegressionTest0.test100");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13537);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13538);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13539);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13540);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13541);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13542);org.jsoup.nodes.Element element9 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13543);org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValue("<hi!>\n hi!\n</hi!>", "<hi!></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(13544);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(13545);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(13546);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13547);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(13548);org.junit.Assert.assertNotNull(element9);
        __CLR4_2_08qf8qflnxz233t.R.inc(13549);org.junit.Assert.assertNotNull(elements12);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test101() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0befr89age();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test101",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13550,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0befr89age() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13550);
        __CLR4_2_08qf8qflnxz233t.R.inc(13551);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13552)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13553)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13554);System.out.format("%n%s%n", "RegressionTest0.test101");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13555);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13556);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13557);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13558);org.jsoup.nodes.Element element5 = element1.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13559);org.jsoup.select.Elements elements7 = element5.getElementsByIndexGreaterThan((int) (byte) 10);
        __CLR4_2_08qf8qflnxz233t.R.inc(13560);org.jsoup.nodes.Element element9 = element5.append("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13561);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(13562);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(13563);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(13564);org.junit.Assert.assertNotNull(elements7);
        __CLR4_2_08qf8qflnxz233t.R.inc(13565);org.junit.Assert.assertNotNull(element9);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test102() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_085fsfsagu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test102",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13566,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_085fsfsagu() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13566);
        __CLR4_2_08qf8qflnxz233t.R.inc(13567);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13568)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13569)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13570);System.out.format("%n%s%n", "RegressionTest0.test102");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13571);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13572);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13573);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13574);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13575);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(13576);int int7 = element4.childNodeSize();
        __CLR4_2_08qf8qflnxz233t.R.inc(13577);java.util.Set<java.lang.String> strSet8 = element4.classNames();
        __CLR4_2_08qf8qflnxz233t.R.inc(13578);org.jsoup.nodes.Document document9 = element4.ownerDocument();
        __CLR4_2_08qf8qflnxz233t.R.inc(13579);org.jsoup.select.Elements elements10 = element4.previousElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(13580);org.jsoup.select.Evaluator evaluator11 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(13581);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(13582);boolean boolean12 = element4.is(evaluator11);
            __CLR4_2_08qf8qflnxz233t.R.inc(13583);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(13584);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(13585);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(13586);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13587);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(13588);org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(13589);org.junit.Assert.assertNotNull(strSet8);
        __CLR4_2_08qf8qflnxz233t.R.inc(13590);org.junit.Assert.assertNull(document9);
        __CLR4_2_08qf8qflnxz233t.R.inc(13591);org.junit.Assert.assertNotNull(elements10);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test103() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_04wftnbahk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test103",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13592,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_04wftnbahk() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13592);
        __CLR4_2_08qf8qflnxz233t.R.inc(13593);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13594)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13595)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13596);System.out.format("%n%s%n", "RegressionTest0.test103");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13597);org.jsoup.parser.Tag tag0 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(13598);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(13599);org.jsoup.nodes.Element element2 = new org.jsoup.nodes.Element(tag0, "<hi! class=\"\"></hi!>");
            __CLR4_2_08qf8qflnxz233t.R.inc(13600);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test104() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13601);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_01nfuuuaht();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test104",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13601,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_01nfuuuaht() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13601);
        __CLR4_2_08qf8qflnxz233t.R.inc(13602);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13603)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13604)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13605);System.out.format("%n%s%n", "RegressionTest0.test104");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13606);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13607);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13608);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13609);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13610);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13611);boolean boolean9 = element4.hasAttr("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13612);org.jsoup.nodes.Element element10 = element4.root();
        __CLR4_2_08qf8qflnxz233t.R.inc(13613);org.jsoup.select.Elements elements11 = element4.getAllElements();
        __CLR4_2_08qf8qflnxz233t.R.inc(13614);org.jsoup.nodes.Element element13 = element4.toggleClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13615);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(13616);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(13617);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13618);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(13619);org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(13620);org.junit.Assert.assertNotNull(element10);
        __CLR4_2_08qf8qflnxz233t.R.inc(13621);org.junit.Assert.assertNotNull(elements11);
        __CLR4_2_08qf8qflnxz233t.R.inc(13622);org.junit.Assert.assertNotNull(element13);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test105() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_01lk3xnaif();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test105",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13623,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_01lk3xnaif() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13623);
        __CLR4_2_08qf8qflnxz233t.R.inc(13624);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13625)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13626)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13627);System.out.format("%n%s%n", "RegressionTest0.test105");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13628);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13629);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13630);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(13631);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(13632);org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13633);java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13634);org.jsoup.nodes.Element element9 = element6.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13635);java.lang.String str10 = element9.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13636);org.jsoup.nodes.Element element12 = element9.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13637);java.lang.String str13 = element9.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13638);org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13639);java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13640);org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        __CLR4_2_08qf8qflnxz233t.R.inc(13641);org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(13642);int int20 = element18.elementSiblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(13643);org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(13644);org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13645);java.util.List<org.jsoup.nodes.TextNode> textNodeList24 = element23.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13646);org.jsoup.nodes.Element element26 = element23.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13647);java.lang.String str27 = element26.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13648);org.jsoup.select.Elements elements28 = element26.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(13649);org.jsoup.nodes.Element element30 = element26.toggleClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13650);org.jsoup.nodes.Element element31 = element30.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13651);org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13652);java.util.List<org.jsoup.nodes.TextNode> textNodeList34 = element33.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13653);org.jsoup.nodes.Element element35 = element33.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(13654);java.lang.String str36 = element33.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(13655);org.jsoup.nodes.Element element37 = element33.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(13656);java.util.regex.Pattern pattern39 = null;
        __CLR4_2_08qf8qflnxz233t.R.inc(13657);org.jsoup.select.Elements elements40 = element33.getElementsByAttributeValueMatching("hi!", pattern39);
        __CLR4_2_08qf8qflnxz233t.R.inc(13658);boolean boolean41 = element31.equals((java.lang.Object) pattern39);
        __CLR4_2_08qf8qflnxz233t.R.inc(13659);org.jsoup.nodes.Element element42 = element18.after((org.jsoup.nodes.Node) element31);
        __CLR4_2_08qf8qflnxz233t.R.inc(13660);org.jsoup.select.Elements elements44 = element42.getElementsByAttributeStarting("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13661);org.jsoup.nodes.Node node45 = element42.nextSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(13662);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(13663);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(13664);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13665);org.junit.Assert.assertNotNull(textNodeList7);
        __CLR4_2_08qf8qflnxz233t.R.inc(13666);org.junit.Assert.assertNotNull(element9);
        __CLR4_2_08qf8qflnxz233t.R.inc(13667);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13668);org.junit.Assert.assertNotNull(element12);
        __CLR4_2_08qf8qflnxz233t.R.inc(13669);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13670);org.junit.Assert.assertNotNull(textNodeList17);
        __CLR4_2_08qf8qflnxz233t.R.inc(13671);org.junit.Assert.assertNotNull(element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(13672);org.junit.Assert.assertNull(element19);
        __CLR4_2_08qf8qflnxz233t.R.inc(13673);org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(13674);org.junit.Assert.assertNotNull(element21);
        __CLR4_2_08qf8qflnxz233t.R.inc(13675);org.junit.Assert.assertNotNull(textNodeList24);
        __CLR4_2_08qf8qflnxz233t.R.inc(13676);org.junit.Assert.assertNotNull(element26);
        __CLR4_2_08qf8qflnxz233t.R.inc(13677);org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13678);org.junit.Assert.assertNotNull(elements28);
        __CLR4_2_08qf8qflnxz233t.R.inc(13679);org.junit.Assert.assertNotNull(element30);
        __CLR4_2_08qf8qflnxz233t.R.inc(13680);org.junit.Assert.assertNotNull(element31);
        __CLR4_2_08qf8qflnxz233t.R.inc(13681);org.junit.Assert.assertNotNull(textNodeList34);
        __CLR4_2_08qf8qflnxz233t.R.inc(13682);org.junit.Assert.assertNull(element35);
        __CLR4_2_08qf8qflnxz233t.R.inc(13683);org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13684);org.junit.Assert.assertNotNull(element37);
        __CLR4_2_08qf8qflnxz233t.R.inc(13685);org.junit.Assert.assertNotNull(elements40);
        __CLR4_2_08qf8qflnxz233t.R.inc(13686);org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(13687);org.junit.Assert.assertNotNull(element42);
        __CLR4_2_08qf8qflnxz233t.R.inc(13688);org.junit.Assert.assertNotNull(elements44);
        __CLR4_2_08qf8qflnxz233t.R.inc(13689);org.junit.Assert.assertNotNull(node45);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test106() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_04uk2q4aka();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test106",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13690,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_04uk2q4aka() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13690);
        __CLR4_2_08qf8qflnxz233t.R.inc(13691);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13692)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13693)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13694);System.out.format("%n%s%n", "RegressionTest0.test106");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13695);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13696);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13697);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13698);org.jsoup.nodes.Element element5 = element1.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13699);org.jsoup.select.Elements elements7 = element5.getElementsByIndexGreaterThan((int) (byte) 10);
        __CLR4_2_08qf8qflnxz233t.R.inc(13700);org.jsoup.nodes.Document document8 = element5.ownerDocument();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(13701);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(13702);org.jsoup.select.Elements elements10 = document8.getElementsByAttribute("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
            __CLR4_2_08qf8qflnxz233t.R.inc(13703);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(13704);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(13705);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(13706);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(13707);org.junit.Assert.assertNotNull(elements7);
        __CLR4_2_08qf8qflnxz233t.R.inc(13708);org.junit.Assert.assertNull(document8);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test107() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_083k1ilakt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test107",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13709,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_083k1ilakt() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13709);
        __CLR4_2_08qf8qflnxz233t.R.inc(13710);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13711)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13712)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13713);System.out.format("%n%s%n", "RegressionTest0.test107");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13714);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13715);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13716);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(13717);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(13718);org.jsoup.select.Elements elements6 = element1.getElementsByIndexLessThan((int) (byte) 1);
        __CLR4_2_08qf8qflnxz233t.R.inc(13719);org.jsoup.nodes.Element element7 = element1.clearAttributes();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(13720);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(13721);org.jsoup.select.Elements elements10 = element7.getElementsByAttributeValueNot("", "");
            __CLR4_2_08qf8qflnxz233t.R.inc(13722);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(13723);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(13724);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(13725);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13726);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(13727);org.junit.Assert.assertNotNull(element7);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test108() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0bck0b2alc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test108",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13728,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0bck0b2alc() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13728);
        __CLR4_2_08qf8qflnxz233t.R.inc(13729);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13730)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13731)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13732);System.out.format("%n%s%n", "RegressionTest0.test108");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13733);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13734);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13735);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13736);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13737);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13738);boolean boolean9 = element4.hasAttr("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13739);org.jsoup.select.Elements elements11 = element4.getElementsContainingText("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13740);org.jsoup.nodes.Element element13 = element4.prependText("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13741);element13.setBaseUri("<hi! class=\"\"></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(13742);java.util.List<org.jsoup.nodes.TextNode> textNodeList16 = element13.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13743);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(13744);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(13745);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13746);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(13747);org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(13748);org.junit.Assert.assertNotNull(elements11);
        __CLR4_2_08qf8qflnxz233t.R.inc(13749);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(13750);org.junit.Assert.assertNotNull(textNodeList16);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test109() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0eljz3jalz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test109",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13751,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0eljz3jalz() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13751);
        __CLR4_2_08qf8qflnxz233t.R.inc(13752);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13753)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13754)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13755);System.out.format("%n%s%n", "RegressionTest0.test109");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13756);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13757);org.jsoup.nodes.Element element3 = element1.appendText("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13758);java.lang.String str4 = element3.wholeText();
        __CLR4_2_08qf8qflnxz233t.R.inc(13759);java.lang.String str5 = element3.toString();
        __CLR4_2_08qf8qflnxz233t.R.inc(13760);org.jsoup.select.Elements elements6 = element3.children();
        __CLR4_2_08qf8qflnxz233t.R.inc(13761);boolean boolean8 = element3.hasAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13762);org.jsoup.nodes.Element element9 = element3.clone();
        __CLR4_2_08qf8qflnxz233t.R.inc(13763);org.junit.Assert.assertNotNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(13764);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13765);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!>\n hi!\n</hi!>" + "'", str5, "<hi!>\n hi!\n</hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(13766);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(13767);org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(13768);org.junit.Assert.assertNotNull(element9);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test110() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0f2f6itamh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test110",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13769,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0f2f6itamh() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13769);
        __CLR4_2_08qf8qflnxz233t.R.inc(13770);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13771)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13772)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13773);System.out.format("%n%s%n", "RegressionTest0.test110");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13774);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13775);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13776);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(13777);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(13778);org.jsoup.nodes.Element element5 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(13779);org.jsoup.nodes.Element element7 = element1.addClass("<hi!></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(13780);org.jsoup.nodes.Element element8 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(13781);org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13782);java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "" };
        __CLR4_2_08qf8qflnxz233t.R.inc(13783);java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        __CLR4_2_08qf8qflnxz233t.R.inc(13784);boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        __CLR4_2_08qf8qflnxz233t.R.inc(13785);org.jsoup.nodes.Element element16 = element10.classNames((java.util.Set<java.lang.String>) strSet14);
        __CLR4_2_08qf8qflnxz233t.R.inc(13786);org.jsoup.nodes.Element element17 = element8.classNames((java.util.Set<java.lang.String>) strSet14);
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(13787);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(13788);org.jsoup.select.Elements elements19 = element17.select("");
            __CLR4_2_08qf8qflnxz233t.R.inc(13789);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(13790);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(13791);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(13792);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13793);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(13794);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(13795);org.junit.Assert.assertNotNull(element8);
        __CLR4_2_08qf8qflnxz233t.R.inc(13796);org.junit.Assert.assertNotNull(strArray13);
        __CLR4_2_08qf8qflnxz233t.R.inc(13797);org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        __CLR4_2_08qf8qflnxz233t.R.inc(13798);org.junit.Assert.assertNotNull(element16);
        __CLR4_2_08qf8qflnxz233t.R.inc(13799);org.junit.Assert.assertNotNull(element17);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test111() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ibf5baanc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test111",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13800,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ibf5baanc() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13800);
        __CLR4_2_08qf8qflnxz233t.R.inc(13801);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13802)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13803)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13804);System.out.format("%n%s%n", "RegressionTest0.test111");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13805);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13806);org.jsoup.nodes.Element element3 = element1.appendText("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13807);java.lang.String str4 = element3.wholeText();
        __CLR4_2_08qf8qflnxz233t.R.inc(13808);java.lang.String str5 = element3.toString();
        __CLR4_2_08qf8qflnxz233t.R.inc(13809);org.jsoup.select.Elements elements6 = element3.children();
        __CLR4_2_08qf8qflnxz233t.R.inc(13810);boolean boolean8 = element3.hasAttr("");
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(13811);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(13812);org.jsoup.nodes.Element element10 = element3.before("<hi! class=\"\"></hi!>");
            __CLR4_2_08qf8qflnxz233t.R.inc(13813);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(13814);org.junit.Assert.assertNotNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(13815);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13816);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!>\n hi!\n</hi!>" + "'", str5, "<hi!>\n hi!\n</hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(13817);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(13818);org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test112() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0lkf43ranv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test112",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13819,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0lkf43ranv() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13819);
        __CLR4_2_08qf8qflnxz233t.R.inc(13820);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13821)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13822)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13823);System.out.format("%n%s%n", "RegressionTest0.test112");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13824);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13825);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13826);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13827);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13828);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(13829);org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13830);org.jsoup.nodes.Element element9 = element8.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13831);boolean boolean11 = element9.hasSameValue((java.lang.Object) "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13832);boolean boolean12 = element9.hasParent();
        __CLR4_2_08qf8qflnxz233t.R.inc(13833);org.jsoup.select.Elements elements14 = element9.getElementsByIndexGreaterThan((int) (short) 10);
        __CLR4_2_08qf8qflnxz233t.R.inc(13834);boolean boolean15 = element9.isBlock();
        __CLR4_2_08qf8qflnxz233t.R.inc(13835);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(13836);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(13837);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13838);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(13839);org.junit.Assert.assertNotNull(element8);
        __CLR4_2_08qf8qflnxz233t.R.inc(13840);org.junit.Assert.assertNotNull(element9);
        __CLR4_2_08qf8qflnxz233t.R.inc(13841);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(13842);org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(13843);org.junit.Assert.assertNotNull(elements14);
        __CLR4_2_08qf8qflnxz233t.R.inc(13844);org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test113() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13845);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0otf2w8aol();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test113",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13845,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0otf2w8aol() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13845);
        __CLR4_2_08qf8qflnxz233t.R.inc(13846);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13847)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13848)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13849);System.out.format("%n%s%n", "RegressionTest0.test113");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13850);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13851);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13852);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13853);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13854);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13855);java.lang.String str8 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13856);org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13857);java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13858);org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(13859);int int14 = element13.childNodeSize();
        __CLR4_2_08qf8qflnxz233t.R.inc(13860);org.jsoup.select.Elements elements17 = element13.getElementsByAttributeValueContaining("hi!", "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13861);java.lang.String str18 = element13.tagName();
        __CLR4_2_08qf8qflnxz233t.R.inc(13862);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(13863);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(13864);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13865);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(13866);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13867);org.junit.Assert.assertNotNull(textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(13868);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(13869);org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(13870);org.junit.Assert.assertNotNull(elements17);
        __CLR4_2_08qf8qflnxz233t.R.inc(13871);org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test114() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0s2f1opapc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test114",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13872,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0s2f1opapc() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13872);
        __CLR4_2_08qf8qflnxz233t.R.inc(13873);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13874)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13875)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13876);System.out.format("%n%s%n", "RegressionTest0.test114");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13877);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13878);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13879);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13880);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13881);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(13882);org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13883);org.jsoup.nodes.Element element9 = element8.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13884);boolean boolean11 = element9.hasSameValue((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(13885);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(13886);org.jsoup.select.Elements elements13 = element9.getElementsByClass("");
            __CLR4_2_08qf8qflnxz233t.R.inc(13887);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(13888);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(13889);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(13890);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13891);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(13892);org.junit.Assert.assertNotNull(element8);
        __CLR4_2_08qf8qflnxz233t.R.inc(13893);org.junit.Assert.assertNotNull(element9);
        __CLR4_2_08qf8qflnxz233t.R.inc(13894);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test115() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13895);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0vbf0h6apz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test115",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13895,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0vbf0h6apz() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13895);
        __CLR4_2_08qf8qflnxz233t.R.inc(13896);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13897)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13898)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13899);System.out.format("%n%s%n", "RegressionTest0.test115");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13900);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13901);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13902);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13903);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13904);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13905);boolean boolean9 = element4.hasAttr("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13906);org.jsoup.nodes.Element element10 = element4.root();
        __CLR4_2_08qf8qflnxz233t.R.inc(13907);org.jsoup.select.Elements elements12 = element10.getElementsByIndexEquals((int) (byte) 10);
        __CLR4_2_08qf8qflnxz233t.R.inc(13908);org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13909);java.util.List<org.jsoup.nodes.TextNode> textNodeList16 = element15.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13910);org.jsoup.nodes.Element element18 = element15.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13911);java.lang.String str19 = element18.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13912);org.jsoup.select.Elements elements20 = element18.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(13913);org.jsoup.nodes.Element element22 = element18.toggleClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13914);org.jsoup.nodes.Element element23 = element22.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13915);org.jsoup.select.Elements elements24 = element23.getAllElements();
        __CLR4_2_08qf8qflnxz233t.R.inc(13916);java.util.List<org.jsoup.nodes.TextNode> textNodeList25 = element23.textNodes();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(13917);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(13918);org.jsoup.nodes.Element element26 = element10.insertChildren((int) (byte) 10, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList25);
            __CLR4_2_08qf8qflnxz233t.R.inc(13919);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(13920);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(13921);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(13922);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13923);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(13924);org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(13925);org.junit.Assert.assertNotNull(element10);
        __CLR4_2_08qf8qflnxz233t.R.inc(13926);org.junit.Assert.assertNotNull(elements12);
        __CLR4_2_08qf8qflnxz233t.R.inc(13927);org.junit.Assert.assertNotNull(textNodeList16);
        __CLR4_2_08qf8qflnxz233t.R.inc(13928);org.junit.Assert.assertNotNull(element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(13929);org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13930);org.junit.Assert.assertNotNull(elements20);
        __CLR4_2_08qf8qflnxz233t.R.inc(13931);org.junit.Assert.assertNotNull(element22);
        __CLR4_2_08qf8qflnxz233t.R.inc(13932);org.junit.Assert.assertNotNull(element23);
        __CLR4_2_08qf8qflnxz233t.R.inc(13933);org.junit.Assert.assertNotNull(elements24);
        __CLR4_2_08qf8qflnxz233t.R.inc(13934);org.junit.Assert.assertNotNull(textNodeList25);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test116() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13935);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ykez9nar3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test116",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13935,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ykez9nar3() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13935);
        __CLR4_2_08qf8qflnxz233t.R.inc(13936);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13937)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13938)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13939);System.out.format("%n%s%n", "RegressionTest0.test116");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13940);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13941);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13942);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13943);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13944);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13945);org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13946);java.util.List<org.jsoup.nodes.TextNode> textNodeList10 = element9.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13947);org.jsoup.nodes.Element element12 = element9.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13948);java.lang.String str13 = element12.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13949);org.jsoup.nodes.Element element15 = element12.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13950);java.lang.String str16 = element12.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13951);org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13952);java.util.List<org.jsoup.nodes.TextNode> textNodeList20 = element19.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13953);org.jsoup.nodes.Element element21 = element12.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList20);
        __CLR4_2_08qf8qflnxz233t.R.inc(13954);org.jsoup.nodes.Element element22 = element4.appendChild((org.jsoup.nodes.Node) element21);
        __CLR4_2_08qf8qflnxz233t.R.inc(13955);java.lang.String[] strArray29 = new java.lang.String[] { "<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>", "<hi!></hi!>", "<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>", "", "hi!", "<hi! class=\"\"></hi!>" };
        __CLR4_2_08qf8qflnxz233t.R.inc(13956);java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        __CLR4_2_08qf8qflnxz233t.R.inc(13957);boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        __CLR4_2_08qf8qflnxz233t.R.inc(13958);org.jsoup.nodes.Element element32 = element22.classNames((java.util.Set<java.lang.String>) strSet30);
        __CLR4_2_08qf8qflnxz233t.R.inc(13959);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(13960);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(13961);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13962);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(13963);org.junit.Assert.assertNotNull(textNodeList10);
        __CLR4_2_08qf8qflnxz233t.R.inc(13964);org.junit.Assert.assertNotNull(element12);
        __CLR4_2_08qf8qflnxz233t.R.inc(13965);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13966);org.junit.Assert.assertNotNull(element15);
        __CLR4_2_08qf8qflnxz233t.R.inc(13967);org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13968);org.junit.Assert.assertNotNull(textNodeList20);
        __CLR4_2_08qf8qflnxz233t.R.inc(13969);org.junit.Assert.assertNotNull(element21);
        __CLR4_2_08qf8qflnxz233t.R.inc(13970);org.junit.Assert.assertNotNull(element22);
        __CLR4_2_08qf8qflnxz233t.R.inc(13971);org.junit.Assert.assertNotNull(strArray29);
        __CLR4_2_08qf8qflnxz233t.R.inc(13972);org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        __CLR4_2_08qf8qflnxz233t.R.inc(13973);org.junit.Assert.assertNotNull(element32);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test117() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0x7p3x0as6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test117",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13974,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0x7p3x0as6() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13974);
        __CLR4_2_08qf8qflnxz233t.R.inc(13975);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(13976)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(13977)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(13978);System.out.format("%n%s%n", "RegressionTest0.test117");
        }__CLR4_2_08qf8qflnxz233t.R.inc(13979);org.jsoup.parser.Tag tag0 = null;
        __CLR4_2_08qf8qflnxz233t.R.inc(13980);org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(13981);java.util.List<org.jsoup.nodes.TextNode> textNodeList4 = element3.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(13982);org.jsoup.nodes.Element element6 = element3.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13983);java.lang.String str7 = element6.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(13984);org.jsoup.nodes.Element element9 = element6.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(13985);org.jsoup.select.Elements elements10 = element9.children();
        __CLR4_2_08qf8qflnxz233t.R.inc(13986);org.jsoup.nodes.Element element11 = element9.root();
        __CLR4_2_08qf8qflnxz233t.R.inc(13987);org.jsoup.nodes.Attributes attributes12 = element11.attributes();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(13988);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(13989);org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag0, "<hi!></hi!>", attributes12);
            __CLR4_2_08qf8qflnxz233t.R.inc(13990);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(13991);org.junit.Assert.assertNotNull(textNodeList4);
        __CLR4_2_08qf8qflnxz233t.R.inc(13992);org.junit.Assert.assertNotNull(element6);
        __CLR4_2_08qf8qflnxz233t.R.inc(13993);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(13994);org.junit.Assert.assertNotNull(element9);
        __CLR4_2_08qf8qflnxz233t.R.inc(13995);org.junit.Assert.assertNotNull(elements10);
        __CLR4_2_08qf8qflnxz233t.R.inc(13996);org.junit.Assert.assertNotNull(element11);
        __CLR4_2_08qf8qflnxz233t.R.inc(13997);org.junit.Assert.assertNotNull(attributes12);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test118() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),13998);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0typ54jasu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test118",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),13998,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0typ54jasu() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(13998);
        __CLR4_2_08qf8qflnxz233t.R.inc(13999);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(14000)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(14001)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(14002);System.out.format("%n%s%n", "RegressionTest0.test118");
        }__CLR4_2_08qf8qflnxz233t.R.inc(14003);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14004);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14005);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14006);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(14007);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(14008);element4.setBaseUri("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14009);org.jsoup.nodes.Element element9 = element4.previousElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(14010);boolean boolean10 = element4.isBlock();
        __CLR4_2_08qf8qflnxz233t.R.inc(14011);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(14012);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(14013);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14014);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(14015);org.junit.Assert.assertNull(element9);
        __CLR4_2_08qf8qflnxz233t.R.inc(14016);org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test119() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),14017);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0qpp6c2atd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test119",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),14017,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0qpp6c2atd() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(14017);
        __CLR4_2_08qf8qflnxz233t.R.inc(14018);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(14019)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(14020)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(14021);System.out.format("%n%s%n", "RegressionTest0.test119");
        }__CLR4_2_08qf8qflnxz233t.R.inc(14022);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14023);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14024);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(14025);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(14026);org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14027);java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14028);org.jsoup.nodes.Element element9 = element6.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14029);java.lang.String str10 = element9.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(14030);org.jsoup.nodes.Element element12 = element9.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14031);java.lang.String str13 = element9.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(14032);org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14033);java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14034);org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        __CLR4_2_08qf8qflnxz233t.R.inc(14035);org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(14036);int int20 = element18.elementSiblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(14037);org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(14038);org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14039);java.util.List<org.jsoup.nodes.TextNode> textNodeList24 = element23.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14040);org.jsoup.nodes.Element element26 = element23.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14041);java.lang.String str27 = element26.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(14042);org.jsoup.select.Elements elements28 = element26.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(14043);org.jsoup.nodes.Element element30 = element26.toggleClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14044);org.jsoup.nodes.Element element31 = element30.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14045);org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14046);java.util.List<org.jsoup.nodes.TextNode> textNodeList34 = element33.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14047);org.jsoup.nodes.Element element35 = element33.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(14048);java.lang.String str36 = element33.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(14049);org.jsoup.nodes.Element element37 = element33.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(14050);java.util.regex.Pattern pattern39 = null;
        __CLR4_2_08qf8qflnxz233t.R.inc(14051);org.jsoup.select.Elements elements40 = element33.getElementsByAttributeValueMatching("hi!", pattern39);
        __CLR4_2_08qf8qflnxz233t.R.inc(14052);boolean boolean41 = element31.equals((java.lang.Object) pattern39);
        __CLR4_2_08qf8qflnxz233t.R.inc(14053);org.jsoup.nodes.Element element42 = element18.after((org.jsoup.nodes.Node) element31);
        __CLR4_2_08qf8qflnxz233t.R.inc(14054);java.lang.String str43 = element18.className();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(14055);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(14056);boolean boolean45 = element18.is("<hi! class=\"\"></hi!>");
            __CLR4_2_08qf8qflnxz233t.R.inc(14057);org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"\"></hi!>': unexpected token at '<hi! class=\"\"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(14058);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(14059);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(14060);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14061);org.junit.Assert.assertNotNull(textNodeList7);
        __CLR4_2_08qf8qflnxz233t.R.inc(14062);org.junit.Assert.assertNotNull(element9);
        __CLR4_2_08qf8qflnxz233t.R.inc(14063);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14064);org.junit.Assert.assertNotNull(element12);
        __CLR4_2_08qf8qflnxz233t.R.inc(14065);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14066);org.junit.Assert.assertNotNull(textNodeList17);
        __CLR4_2_08qf8qflnxz233t.R.inc(14067);org.junit.Assert.assertNotNull(element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(14068);org.junit.Assert.assertNull(element19);
        __CLR4_2_08qf8qflnxz233t.R.inc(14069);org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(14070);org.junit.Assert.assertNotNull(element21);
        __CLR4_2_08qf8qflnxz233t.R.inc(14071);org.junit.Assert.assertNotNull(textNodeList24);
        __CLR4_2_08qf8qflnxz233t.R.inc(14072);org.junit.Assert.assertNotNull(element26);
        __CLR4_2_08qf8qflnxz233t.R.inc(14073);org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14074);org.junit.Assert.assertNotNull(elements28);
        __CLR4_2_08qf8qflnxz233t.R.inc(14075);org.junit.Assert.assertNotNull(element30);
        __CLR4_2_08qf8qflnxz233t.R.inc(14076);org.junit.Assert.assertNotNull(element31);
        __CLR4_2_08qf8qflnxz233t.R.inc(14077);org.junit.Assert.assertNotNull(textNodeList34);
        __CLR4_2_08qf8qflnxz233t.R.inc(14078);org.junit.Assert.assertNull(element35);
        __CLR4_2_08qf8qflnxz233t.R.inc(14079);org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14080);org.junit.Assert.assertNotNull(element37);
        __CLR4_2_08qf8qflnxz233t.R.inc(14081);org.junit.Assert.assertNotNull(elements40);
        __CLR4_2_08qf8qflnxz233t.R.inc(14082);org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(14083);org.junit.Assert.assertNotNull(element42);
        __CLR4_2_08qf8qflnxz233t.R.inc(14084);org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test120() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),14085);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0q8tywsav9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test120",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),14085,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0q8tywsav9() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(14085);
        __CLR4_2_08qf8qflnxz233t.R.inc(14086);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(14087)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(14088)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(14089);System.out.format("%n%s%n", "RegressionTest0.test120");
        }__CLR4_2_08qf8qflnxz233t.R.inc(14090);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14091);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14092);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(14093);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(14094);org.jsoup.nodes.Element element5 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(14095);java.util.regex.Pattern pattern7 = null;
        __CLR4_2_08qf8qflnxz233t.R.inc(14096);org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", pattern7);
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(14097);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(14098);org.jsoup.select.Elements elements11 = element1.getElementsByAttributeValueContaining("", "hi!");
            __CLR4_2_08qf8qflnxz233t.R.inc(14099);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(14100);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(14101);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(14102);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14103);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(14104);org.junit.Assert.assertNotNull(elements8);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test121() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),14105);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0mzu04bavt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test121",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),14105,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0mzu04bavt() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(14105);
        __CLR4_2_08qf8qflnxz233t.R.inc(14106);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(14107)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(14108)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(14109);System.out.format("%n%s%n", "RegressionTest0.test121");
        }__CLR4_2_08qf8qflnxz233t.R.inc(14110);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14111);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14112);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14113);org.jsoup.nodes.Element element5 = element1.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14114);java.lang.String str6 = element1.cssSelector();
        __CLR4_2_08qf8qflnxz233t.R.inc(14115);java.lang.String str7 = element1.tagName();
        __CLR4_2_08qf8qflnxz233t.R.inc(14116);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(14117);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(14118);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(14119);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14120);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test122() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),14121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0jqu1buaw9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test122",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),14121,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0jqu1buaw9() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(14121);
        __CLR4_2_08qf8qflnxz233t.R.inc(14122);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(14123)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(14124)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(14125);System.out.format("%n%s%n", "RegressionTest0.test122");
        }__CLR4_2_08qf8qflnxz233t.R.inc(14126);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14127);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14128);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14129);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(14130);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14131);boolean boolean9 = element4.hasAttr("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14132);org.jsoup.nodes.Element element10 = element4.root();
        __CLR4_2_08qf8qflnxz233t.R.inc(14133);java.lang.String str11 = element10.data();
        __CLR4_2_08qf8qflnxz233t.R.inc(14134);org.jsoup.nodes.Element element14 = element10.attr("<hi!>\n hi!\n</hi!>", true);
        __CLR4_2_08qf8qflnxz233t.R.inc(14135);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(14136);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(14137);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14138);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(14139);org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(14140);org.junit.Assert.assertNotNull(element10);
        __CLR4_2_08qf8qflnxz233t.R.inc(14141);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14142);org.junit.Assert.assertNotNull(element14);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test123() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),14143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ghu2jdawv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test123",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),14143,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ghu2jdawv() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(14143);
        __CLR4_2_08qf8qflnxz233t.R.inc(14144);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(14145)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(14146)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(14147);System.out.format("%n%s%n", "RegressionTest0.test123");
        }__CLR4_2_08qf8qflnxz233t.R.inc(14148);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14149);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14150);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14151);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(14152);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14153);boolean boolean9 = element4.hasAttr("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14154);org.jsoup.select.Elements elements11 = element4.getElementsContainingText("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14155);org.jsoup.nodes.Element element13 = element4.prependText("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14156);java.lang.String str14 = element13.data();
        __CLR4_2_08qf8qflnxz233t.R.inc(14157);org.jsoup.nodes.Element element16 = element13.appendText("<hi!></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(14158);org.jsoup.nodes.Element element17 = element16.clone();
        __CLR4_2_08qf8qflnxz233t.R.inc(14159);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(14160);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(14161);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14162);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(14163);org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(14164);org.junit.Assert.assertNotNull(elements11);
        __CLR4_2_08qf8qflnxz233t.R.inc(14165);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(14166);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14167);org.junit.Assert.assertNotNull(element16);
        __CLR4_2_08qf8qflnxz233t.R.inc(14168);org.junit.Assert.assertNotNull(element17);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test124() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),14169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0d8u3qwaxl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test124",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),14169,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0d8u3qwaxl() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(14169);
        __CLR4_2_08qf8qflnxz233t.R.inc(14170);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(14171)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(14172)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(14173);System.out.format("%n%s%n", "RegressionTest0.test124");
        }__CLR4_2_08qf8qflnxz233t.R.inc(14174);org.jsoup.parser.Tag tag0 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(14175);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(14176);org.jsoup.nodes.Element element2 = new org.jsoup.nodes.Element(tag0, "<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
            __CLR4_2_08qf8qflnxz233t.R.inc(14177);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test125() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),14178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_09zu4yfaxu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test125",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),14178,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_09zu4yfaxu() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(14178);
        __CLR4_2_08qf8qflnxz233t.R.inc(14179);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(14180)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(14181)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(14182);System.out.format("%n%s%n", "RegressionTest0.test125");
        }__CLR4_2_08qf8qflnxz233t.R.inc(14183);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14184);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14185);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(14186);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(14187);org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14188);java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14189);org.jsoup.nodes.Element element9 = element6.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14190);java.lang.String str10 = element9.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(14191);org.jsoup.nodes.Element element12 = element9.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14192);java.lang.String str13 = element9.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(14193);org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14194);java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14195);org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        __CLR4_2_08qf8qflnxz233t.R.inc(14196);org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(14197);int int20 = element18.elementSiblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(14198);org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(14199);org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14200);java.util.List<org.jsoup.nodes.TextNode> textNodeList24 = element23.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14201);org.jsoup.nodes.Element element26 = element23.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14202);java.lang.String str27 = element26.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(14203);org.jsoup.select.Elements elements28 = element26.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(14204);org.jsoup.nodes.Element element30 = element26.toggleClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14205);org.jsoup.nodes.Element element31 = element30.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14206);org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14207);java.util.List<org.jsoup.nodes.TextNode> textNodeList34 = element33.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14208);org.jsoup.nodes.Element element35 = element33.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(14209);java.lang.String str36 = element33.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(14210);org.jsoup.nodes.Element element37 = element33.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(14211);java.util.regex.Pattern pattern39 = null;
        __CLR4_2_08qf8qflnxz233t.R.inc(14212);org.jsoup.select.Elements elements40 = element33.getElementsByAttributeValueMatching("hi!", pattern39);
        __CLR4_2_08qf8qflnxz233t.R.inc(14213);boolean boolean41 = element31.equals((java.lang.Object) pattern39);
        __CLR4_2_08qf8qflnxz233t.R.inc(14214);org.jsoup.nodes.Element element42 = element18.after((org.jsoup.nodes.Node) element31);
        __CLR4_2_08qf8qflnxz233t.R.inc(14215);java.lang.String str43 = element42.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(14216);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(14217);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(14218);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14219);org.junit.Assert.assertNotNull(textNodeList7);
        __CLR4_2_08qf8qflnxz233t.R.inc(14220);org.junit.Assert.assertNotNull(element9);
        __CLR4_2_08qf8qflnxz233t.R.inc(14221);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14222);org.junit.Assert.assertNotNull(element12);
        __CLR4_2_08qf8qflnxz233t.R.inc(14223);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14224);org.junit.Assert.assertNotNull(textNodeList17);
        __CLR4_2_08qf8qflnxz233t.R.inc(14225);org.junit.Assert.assertNotNull(element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(14226);org.junit.Assert.assertNull(element19);
        __CLR4_2_08qf8qflnxz233t.R.inc(14227);org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(14228);org.junit.Assert.assertNotNull(element21);
        __CLR4_2_08qf8qflnxz233t.R.inc(14229);org.junit.Assert.assertNotNull(textNodeList24);
        __CLR4_2_08qf8qflnxz233t.R.inc(14230);org.junit.Assert.assertNotNull(element26);
        __CLR4_2_08qf8qflnxz233t.R.inc(14231);org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14232);org.junit.Assert.assertNotNull(elements28);
        __CLR4_2_08qf8qflnxz233t.R.inc(14233);org.junit.Assert.assertNotNull(element30);
        __CLR4_2_08qf8qflnxz233t.R.inc(14234);org.junit.Assert.assertNotNull(element31);
        __CLR4_2_08qf8qflnxz233t.R.inc(14235);org.junit.Assert.assertNotNull(textNodeList34);
        __CLR4_2_08qf8qflnxz233t.R.inc(14236);org.junit.Assert.assertNull(element35);
        __CLR4_2_08qf8qflnxz233t.R.inc(14237);org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14238);org.junit.Assert.assertNotNull(element37);
        __CLR4_2_08qf8qflnxz233t.R.inc(14239);org.junit.Assert.assertNotNull(elements40);
        __CLR4_2_08qf8qflnxz233t.R.inc(14240);org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(14241);org.junit.Assert.assertNotNull(element42);
        __CLR4_2_08qf8qflnxz233t.R.inc(14242);org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test126() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),14243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_06qu65yazn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test126",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),14243,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_06qu65yazn() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(14243);
        __CLR4_2_08qf8qflnxz233t.R.inc(14244);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(14245)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(14246)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(14247);System.out.format("%n%s%n", "RegressionTest0.test126");
        }__CLR4_2_08qf8qflnxz233t.R.inc(14248);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14249);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14250);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14251);org.jsoup.nodes.Element element5 = element1.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14252);org.jsoup.select.Elements elements7 = element5.getElementsByIndexGreaterThan((int) (byte) 10);
        __CLR4_2_08qf8qflnxz233t.R.inc(14253);java.lang.String str8 = element5.nodeName();
        __CLR4_2_08qf8qflnxz233t.R.inc(14254);org.jsoup.select.Elements elements9 = element5.siblingElements();
        __CLR4_2_08qf8qflnxz233t.R.inc(14255);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(14256);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(14257);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(14258);org.junit.Assert.assertNotNull(elements7);
        __CLR4_2_08qf8qflnxz233t.R.inc(14259);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14260);org.junit.Assert.assertNotNull(elements9);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test127() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),14261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_03hu7dhb05();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test127",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),14261,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_03hu7dhb05() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(14261);
        __CLR4_2_08qf8qflnxz233t.R.inc(14262);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(14263)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(14264)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(14265);System.out.format("%n%s%n", "RegressionTest0.test127");
        }__CLR4_2_08qf8qflnxz233t.R.inc(14266);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14267);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14268);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14269);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(14270);org.jsoup.nodes.Node node6 = element4.previousSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(14271);java.lang.String str7 = element4.baseUri();
        __CLR4_2_08qf8qflnxz233t.R.inc(14272);java.util.Set<java.lang.String> strSet8 = element4.classNames();
        __CLR4_2_08qf8qflnxz233t.R.inc(14273);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(14274);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(14275);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14276);org.junit.Assert.assertNull(node6);
        __CLR4_2_08qf8qflnxz233t.R.inc(14277);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14278);org.junit.Assert.assertNotNull(strSet8);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test128() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),14279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_08u8l0b0n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test128",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),14279,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_08u8l0b0n() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(14279);
        __CLR4_2_08qf8qflnxz233t.R.inc(14280);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(14281)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(14282)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(14283);System.out.format("%n%s%n", "RegressionTest0.test128");
        }__CLR4_2_08qf8qflnxz233t.R.inc(14284);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14285);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14286);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14287);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(14288);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(14289);int int7 = element4.childNodeSize();
        __CLR4_2_08qf8qflnxz233t.R.inc(14290);java.util.Set<java.lang.String> strSet8 = element4.classNames();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(14291);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(14292);boolean boolean10 = element4.is("<hi!>\n hi!\n</hi!>");
            __CLR4_2_08qf8qflnxz233t.R.inc(14293);org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi!>? hi!?</hi!>': unexpected token at '<hi!>? hi!?</hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(14294);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(14295);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(14296);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14297);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(14298);org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(14299);org.junit.Assert.assertNotNull(strSet8);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test129() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),14300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0305q7hb18();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test129",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),14300,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0305q7hb18() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(14300);
        __CLR4_2_08qf8qflnxz233t.R.inc(14301);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(14302)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(14303)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(14304);System.out.format("%n%s%n", "RegressionTest0.test129");
        }__CLR4_2_08qf8qflnxz233t.R.inc(14305);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14306);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14307);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14308);org.jsoup.nodes.Element element5 = element1.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14309);java.lang.String str6 = element1.cssSelector();
        __CLR4_2_08qf8qflnxz233t.R.inc(14310);org.jsoup.nodes.Element element8 = element1.html("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14311);java.lang.String str10 = element1.absUrl("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(14312);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(14313);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(14314);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(14315);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14316);org.junit.Assert.assertNotNull(element8);
        __CLR4_2_08qf8qflnxz233t.R.inc(14317);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test130() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),14318);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_03h0xmrb1q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test130",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),14318,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_03h0xmrb1q() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(14318);
        __CLR4_2_08qf8qflnxz233t.R.inc(14319);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(14320)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(14321)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(14322);System.out.format("%n%s%n", "RegressionTest0.test130");
        }__CLR4_2_08qf8qflnxz233t.R.inc(14323);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14324);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14325);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14326);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(14327);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14328);java.lang.String str8 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(14329);org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14330);java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14331);org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(14332);org.jsoup.nodes.Element element14 = element13.previousElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(14333);element13.setBaseUri("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14334);org.jsoup.select.Elements elements18 = element13.getElementsByIndexGreaterThan(10);
        __CLR4_2_08qf8qflnxz233t.R.inc(14335);org.jsoup.select.Elements elements19 = element13.previousElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(14336);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(14337);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(14338);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14339);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(14340);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14341);org.junit.Assert.assertNotNull(textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(14342);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(14343);org.junit.Assert.assertNull(element14);
        __CLR4_2_08qf8qflnxz233t.R.inc(14344);org.junit.Assert.assertNotNull(elements18);
        __CLR4_2_08qf8qflnxz233t.R.inc(14345);org.junit.Assert.assertNotNull(elements19);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test131() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),14346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_06q0wf8b2i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test131",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),14346,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_06q0wf8b2i() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(14346);
        __CLR4_2_08qf8qflnxz233t.R.inc(14347);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(14348)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(14349)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(14350);System.out.format("%n%s%n", "RegressionTest0.test131");
        }__CLR4_2_08qf8qflnxz233t.R.inc(14351);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14352);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14353);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(14354);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(14355);java.util.List<org.jsoup.nodes.Node> nodeList5 = element1.childNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14356);org.jsoup.nodes.Element element7 = element1.append("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14357);org.jsoup.select.Elements elements9 = element1.getElementsByAttribute("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(14358);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(14359);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(14360);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14361);org.junit.Assert.assertNotNull(nodeList5);
        __CLR4_2_08qf8qflnxz233t.R.inc(14362);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(14363);org.junit.Assert.assertNotNull(elements9);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test132() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),14364);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_09z0v7pb30();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test132",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),14364,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_09z0v7pb30() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(14364);
        __CLR4_2_08qf8qflnxz233t.R.inc(14365);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(14366)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(14367)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(14368);System.out.format("%n%s%n", "RegressionTest0.test132");
        }__CLR4_2_08qf8qflnxz233t.R.inc(14369);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14370);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14371);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(14372);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(14373);org.jsoup.nodes.Element element5 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(14374);java.util.regex.Pattern pattern7 = null;
        __CLR4_2_08qf8qflnxz233t.R.inc(14375);org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", pattern7);
        __CLR4_2_08qf8qflnxz233t.R.inc(14376);org.jsoup.nodes.Element element9 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(14377);org.jsoup.nodes.Node node10 = element9.parentNode();
        __CLR4_2_08qf8qflnxz233t.R.inc(14378);org.jsoup.select.Elements elements12 = element9.getElementsContainingText("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14379);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(14380);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(14381);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14382);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(14383);org.junit.Assert.assertNotNull(elements8);
        __CLR4_2_08qf8qflnxz233t.R.inc(14384);org.junit.Assert.assertNotNull(element9);
        __CLR4_2_08qf8qflnxz233t.R.inc(14385);org.junit.Assert.assertNull(node10);
        __CLR4_2_08qf8qflnxz233t.R.inc(14386);org.junit.Assert.assertNotNull(elements12);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test133() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),14387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0d80u06b3n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test133",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),14387,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0d80u06b3n() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(14387);
        __CLR4_2_08qf8qflnxz233t.R.inc(14388);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(14389)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(14390)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(14391);System.out.format("%n%s%n", "RegressionTest0.test133");
        }__CLR4_2_08qf8qflnxz233t.R.inc(14392);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14393);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14394);org.jsoup.nodes.Element element3 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(14395);int int4 = element1.siblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(14396);org.jsoup.select.Elements elements5 = element1.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(14397);java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14398);boolean boolean7 = element1.hasText();
        __CLR4_2_08qf8qflnxz233t.R.inc(14399);java.lang.String str8 = element1.outerHtml();
        __CLR4_2_08qf8qflnxz233t.R.inc(14400);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(14401);org.junit.Assert.assertNotNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(14402);org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(14403);org.junit.Assert.assertNotNull(elements5);
        __CLR4_2_08qf8qflnxz233t.R.inc(14404);org.junit.Assert.assertNotNull(nodeList6);
        __CLR4_2_08qf8qflnxz233t.R.inc(14405);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(14406);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<hi!></hi!>" + "'", str8, "<hi!></hi!>");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test134() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),14407);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0gh0ssnb47();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test134",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),14407,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0gh0ssnb47() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(14407);
        __CLR4_2_08qf8qflnxz233t.R.inc(14408);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(14409)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(14410)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(14411);System.out.format("%n%s%n", "RegressionTest0.test134");
        }__CLR4_2_08qf8qflnxz233t.R.inc(14412);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14413);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14414);org.jsoup.nodes.Node node3 = element1.previousSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(14415);java.lang.String str4 = element1.id();
        __CLR4_2_08qf8qflnxz233t.R.inc(14416);org.jsoup.nodes.Element element6 = element1.removeClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14417);org.jsoup.select.Elements elements9 = element1.getElementsByAttributeValueNot("hi!", "<hi! class=\"\"></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(14418);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(14419);org.junit.Assert.assertNull(node3);
        __CLR4_2_08qf8qflnxz233t.R.inc(14420);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14421);org.junit.Assert.assertNotNull(element6);
        __CLR4_2_08qf8qflnxz233t.R.inc(14422);org.junit.Assert.assertNotNull(elements9);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test135() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),14423);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0jq0rl4b4n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test135",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),14423,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0jq0rl4b4n() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(14423);
        __CLR4_2_08qf8qflnxz233t.R.inc(14424);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(14425)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(14426)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(14427);System.out.format("%n%s%n", "RegressionTest0.test135");
        }__CLR4_2_08qf8qflnxz233t.R.inc(14428);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14429);org.jsoup.nodes.Element element3 = element1.appendText("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14430);org.jsoup.nodes.Node node4 = element1.parentNode();
        __CLR4_2_08qf8qflnxz233t.R.inc(14431);java.lang.Class<?> wildcardClass5 = element1.getClass();
        __CLR4_2_08qf8qflnxz233t.R.inc(14432);org.junit.Assert.assertNotNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(14433);org.junit.Assert.assertNull(node4);
        __CLR4_2_08qf8qflnxz233t.R.inc(14434);org.junit.Assert.assertNotNull(wildcardClass5);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test136() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),14435);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0mz0qdlb4z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test136",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),14435,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0mz0qdlb4z() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(14435);
        __CLR4_2_08qf8qflnxz233t.R.inc(14436);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(14437)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(14438)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(14439);System.out.format("%n%s%n", "RegressionTest0.test136");
        }__CLR4_2_08qf8qflnxz233t.R.inc(14440);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14441);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14442);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14443);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(14444);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(14445);int int7 = element4.childNodeSize();
        __CLR4_2_08qf8qflnxz233t.R.inc(14446);java.util.Set<java.lang.String> strSet8 = element4.classNames();
        __CLR4_2_08qf8qflnxz233t.R.inc(14447);org.jsoup.nodes.Document document9 = element4.ownerDocument();
        __CLR4_2_08qf8qflnxz233t.R.inc(14448);org.jsoup.select.Elements elements10 = element4.previousElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(14449);org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14450);java.util.List<org.jsoup.nodes.TextNode> textNodeList13 = element12.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14451);org.jsoup.nodes.Element element15 = element12.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14452);java.lang.String str16 = element15.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(14453);org.jsoup.select.Elements elements17 = element15.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(14454);boolean boolean18 = element4.hasSameValue((java.lang.Object) elements17);
        __CLR4_2_08qf8qflnxz233t.R.inc(14455);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(14456);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(14457);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14458);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(14459);org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(14460);org.junit.Assert.assertNotNull(strSet8);
        __CLR4_2_08qf8qflnxz233t.R.inc(14461);org.junit.Assert.assertNull(document9);
        __CLR4_2_08qf8qflnxz233t.R.inc(14462);org.junit.Assert.assertNotNull(elements10);
        __CLR4_2_08qf8qflnxz233t.R.inc(14463);org.junit.Assert.assertNotNull(textNodeList13);
        __CLR4_2_08qf8qflnxz233t.R.inc(14464);org.junit.Assert.assertNotNull(element15);
        __CLR4_2_08qf8qflnxz233t.R.inc(14465);org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14466);org.junit.Assert.assertNotNull(elements17);
        __CLR4_2_08qf8qflnxz233t.R.inc(14467);org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test137() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),14468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0q80p62b5w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test137",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),14468,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0q80p62b5w() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(14468);
        __CLR4_2_08qf8qflnxz233t.R.inc(14469);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(14470)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(14471)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(14472);System.out.format("%n%s%n", "RegressionTest0.test137");
        }__CLR4_2_08qf8qflnxz233t.R.inc(14473);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14474);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14475);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14476);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(14477);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14478);java.lang.String str8 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(14479);org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14480);java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14481);org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(14482);org.jsoup.nodes.Element element15 = element4.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14483);java.util.List<org.jsoup.nodes.Node> nodeList16 = element4.childNodesCopy();
        __CLR4_2_08qf8qflnxz233t.R.inc(14484);java.util.List<org.jsoup.nodes.Node> nodeList17 = element4.childNodesCopy();
        __CLR4_2_08qf8qflnxz233t.R.inc(14485);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(14486);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(14487);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14488);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(14489);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14490);org.junit.Assert.assertNotNull(textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(14491);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(14492);org.junit.Assert.assertNotNull(element15);
        __CLR4_2_08qf8qflnxz233t.R.inc(14493);org.junit.Assert.assertNotNull(nodeList16);
        __CLR4_2_08qf8qflnxz233t.R.inc(14494);org.junit.Assert.assertNotNull(nodeList17);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test138() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),14495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0th0nyjb6n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test138",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),14495,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0th0nyjb6n() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(14495);
        __CLR4_2_08qf8qflnxz233t.R.inc(14496);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(14497)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(14498)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(14499);System.out.format("%n%s%n", "RegressionTest0.test138");
        }__CLR4_2_08qf8qflnxz233t.R.inc(14500);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!>\n hi!\n</hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(14501);org.jsoup.select.Elements elements3 = element1.getElementsByAttributeStarting("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14502);org.junit.Assert.assertNotNull(elements3);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test139() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),14503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0wq0mr0b6v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test139",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),14503,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0wq0mr0b6v() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(14503);
        __CLR4_2_08qf8qflnxz233t.R.inc(14504);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(14505)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(14506)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(14507);System.out.format("%n%s%n", "RegressionTest0.test139");
        }__CLR4_2_08qf8qflnxz233t.R.inc(14508);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14509);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14510);org.jsoup.nodes.Element element3 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(14511);int int4 = element1.siblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(14512);org.jsoup.nodes.Node node5 = element1.previousSibling();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(14513);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(14514);org.jsoup.nodes.Element element7 = element1.selectFirst("<hi! class=\"\"></hi!>");
            __CLR4_2_08qf8qflnxz233t.R.inc(14515);org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"\"></hi!>': unexpected token at '<hi! class=\"\"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(14516);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(14517);org.junit.Assert.assertNotNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(14518);org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(14519);org.junit.Assert.assertNull(node5);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test140() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),14520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0x6vu6ab7c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test140",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),14520,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0x6vu6ab7c() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(14520);
        __CLR4_2_08qf8qflnxz233t.R.inc(14521);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(14522)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(14523)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(14524);System.out.format("%n%s%n", "RegressionTest0.test140");
        }__CLR4_2_08qf8qflnxz233t.R.inc(14525);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14526);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14527);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14528);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(14529);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(14530);org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14531);org.jsoup.nodes.Element element9 = element8.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14532);org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14533);java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14534);org.jsoup.nodes.Element element13 = element11.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(14535);java.lang.String str14 = element11.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(14536);org.jsoup.nodes.Element element15 = element11.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(14537);java.util.regex.Pattern pattern17 = null;
        __CLR4_2_08qf8qflnxz233t.R.inc(14538);org.jsoup.select.Elements elements18 = element11.getElementsByAttributeValueMatching("hi!", pattern17);
        __CLR4_2_08qf8qflnxz233t.R.inc(14539);boolean boolean19 = element9.equals((java.lang.Object) pattern17);
        __CLR4_2_08qf8qflnxz233t.R.inc(14540);org.jsoup.nodes.Element element20 = element9.clone();
        __CLR4_2_08qf8qflnxz233t.R.inc(14541);boolean boolean21 = element20.isBlock();
        __CLR4_2_08qf8qflnxz233t.R.inc(14542);java.util.List<org.jsoup.nodes.Node> nodeList22 = element20.childNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14543);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(14544);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(14545);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14546);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(14547);org.junit.Assert.assertNotNull(element8);
        __CLR4_2_08qf8qflnxz233t.R.inc(14548);org.junit.Assert.assertNotNull(element9);
        __CLR4_2_08qf8qflnxz233t.R.inc(14549);org.junit.Assert.assertNotNull(textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(14550);org.junit.Assert.assertNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(14551);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14552);org.junit.Assert.assertNotNull(element15);
        __CLR4_2_08qf8qflnxz233t.R.inc(14553);org.junit.Assert.assertNotNull(elements18);
        __CLR4_2_08qf8qflnxz233t.R.inc(14554);org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(14555);org.junit.Assert.assertNotNull(element20);
        __CLR4_2_08qf8qflnxz233t.R.inc(14556);org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(14557);org.junit.Assert.assertNotNull(nodeList22);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test141() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),14558);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0yl890db8e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test141",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),14558,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0yl890db8e() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(14558);
        __CLR4_2_08qf8qflnxz233t.R.inc(14559);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(14560)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(14561)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(14562);System.out.format("%n%s%n", "RegressionTest0.test141");
        }__CLR4_2_08qf8qflnxz233t.R.inc(14563);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14564);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14565);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14566);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(14567);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(14568);org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14569);org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14570);java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element10.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14571);org.jsoup.nodes.Element element12 = element10.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(14572);int int13 = element10.siblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(14573);org.jsoup.select.Elements elements14 = element10.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(14574);java.util.List<org.jsoup.nodes.Node> nodeList15 = element10.childNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14575);org.jsoup.nodes.Element element17 = element10.toggleClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14576);boolean boolean18 = element4.equals((java.lang.Object) "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14577);org.jsoup.select.Elements elements21 = element4.getElementsByAttributeValue("<hi!></hi!>", "<hi! class=\"\"></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(14578);int int22 = element4.childNodeSize();
        __CLR4_2_08qf8qflnxz233t.R.inc(14579);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(14580);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(14581);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14582);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(14583);org.junit.Assert.assertNotNull(element8);
        __CLR4_2_08qf8qflnxz233t.R.inc(14584);org.junit.Assert.assertNotNull(textNodeList11);
        __CLR4_2_08qf8qflnxz233t.R.inc(14585);org.junit.Assert.assertNotNull(element12);
        __CLR4_2_08qf8qflnxz233t.R.inc(14586);org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(14587);org.junit.Assert.assertNotNull(elements14);
        __CLR4_2_08qf8qflnxz233t.R.inc(14588);org.junit.Assert.assertNotNull(nodeList15);
        __CLR4_2_08qf8qflnxz233t.R.inc(14589);org.junit.Assert.assertNotNull(element17);
        __CLR4_2_08qf8qflnxz233t.R.inc(14590);org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(14591);org.junit.Assert.assertNotNull(elements21);
        __CLR4_2_08qf8qflnxz233t.R.inc(14592);org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test142() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),14593);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0vc8a7wb9d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test142",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),14593,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0vc8a7wb9d() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(14593);
        __CLR4_2_08qf8qflnxz233t.R.inc(14594);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(14595)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(14596)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(14597);System.out.format("%n%s%n", "RegressionTest0.test142");
        }__CLR4_2_08qf8qflnxz233t.R.inc(14598);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14599);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14600);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14601);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(14602);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(14603);int int7 = element4.childNodeSize();
        __CLR4_2_08qf8qflnxz233t.R.inc(14604);java.lang.String str8 = element4.wholeText();
        __CLR4_2_08qf8qflnxz233t.R.inc(14605);org.jsoup.nodes.Element element10 = element4.removeAttr("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14606);org.jsoup.nodes.Element element12 = element10.removeAttr("<hi!>\n hi!\n</hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(14607);org.jsoup.nodes.Element element13 = element10.empty();
        __CLR4_2_08qf8qflnxz233t.R.inc(14608);org.jsoup.nodes.Element element15 = element13.toggleClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14609);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(14610);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(14611);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14612);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(14613);org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(14614);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14615);org.junit.Assert.assertNotNull(element10);
        __CLR4_2_08qf8qflnxz233t.R.inc(14616);org.junit.Assert.assertNotNull(element12);
        __CLR4_2_08qf8qflnxz233t.R.inc(14617);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(14618);org.junit.Assert.assertNotNull(element15);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test143() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),14619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0s38bffba3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test143",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),14619,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0s38bffba3() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(14619);
        __CLR4_2_08qf8qflnxz233t.R.inc(14620);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(14621)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(14622)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(14623);System.out.format("%n%s%n", "RegressionTest0.test143");
        }__CLR4_2_08qf8qflnxz233t.R.inc(14624);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14625);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14626);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14627);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(14628);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(14629);org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14630);org.jsoup.nodes.Element element9 = element8.previousElementSibling();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(14631);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(14632);org.jsoup.nodes.Element element11 = element9.after("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
            __CLR4_2_08qf8qflnxz233t.R.inc(14633);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(14634);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(14635);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(14636);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14637);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(14638);org.junit.Assert.assertNotNull(element8);
        __CLR4_2_08qf8qflnxz233t.R.inc(14639);org.junit.Assert.assertNull(element9);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test144() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),14640);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ou8cmybao();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test144",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),14640,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ou8cmybao() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(14640);
        __CLR4_2_08qf8qflnxz233t.R.inc(14641);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(14642)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(14643)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(14644);System.out.format("%n%s%n", "RegressionTest0.test144");
        }__CLR4_2_08qf8qflnxz233t.R.inc(14645);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14646);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14647);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(14648);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(14649);org.jsoup.nodes.Element element5 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(14650);org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14651);org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14652);java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element10.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14653);org.jsoup.nodes.Element element12 = element10.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(14654);int int13 = element10.siblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(14655);org.jsoup.select.Elements elements14 = element10.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(14656);java.util.List<org.jsoup.nodes.Node> nodeList15 = element10.childNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14657);org.jsoup.nodes.Element element17 = element10.toggleClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14658);org.jsoup.nodes.Element element18 = element1.prependChild((org.jsoup.nodes.Node) element17);
        __CLR4_2_08qf8qflnxz233t.R.inc(14659);org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14660);java.util.List<org.jsoup.nodes.TextNode> textNodeList21 = element20.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14661);org.jsoup.nodes.Element element23 = element20.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14662);java.lang.String str24 = element23.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(14663);org.jsoup.select.Elements elements25 = element23.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(14664);int int26 = element23.childNodeSize();
        __CLR4_2_08qf8qflnxz233t.R.inc(14665);java.util.Set<java.lang.String> strSet27 = element23.classNames();
        __CLR4_2_08qf8qflnxz233t.R.inc(14666);org.jsoup.nodes.Element element28 = element1.classNames(strSet27);
        __CLR4_2_08qf8qflnxz233t.R.inc(14667);java.util.regex.Pattern pattern29 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(14668);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(14669);org.jsoup.select.Elements elements30 = element28.getElementsMatchingOwnText(pattern29);
            __CLR4_2_08qf8qflnxz233t.R.inc(14670);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(14671);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(14672);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(14673);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14674);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(14675);org.junit.Assert.assertNotNull(elements8);
        __CLR4_2_08qf8qflnxz233t.R.inc(14676);org.junit.Assert.assertNotNull(textNodeList11);
        __CLR4_2_08qf8qflnxz233t.R.inc(14677);org.junit.Assert.assertNotNull(element12);
        __CLR4_2_08qf8qflnxz233t.R.inc(14678);org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(14679);org.junit.Assert.assertNotNull(elements14);
        __CLR4_2_08qf8qflnxz233t.R.inc(14680);org.junit.Assert.assertNotNull(nodeList15);
        __CLR4_2_08qf8qflnxz233t.R.inc(14681);org.junit.Assert.assertNotNull(element17);
        __CLR4_2_08qf8qflnxz233t.R.inc(14682);org.junit.Assert.assertNotNull(element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(14683);org.junit.Assert.assertNotNull(textNodeList21);
        __CLR4_2_08qf8qflnxz233t.R.inc(14684);org.junit.Assert.assertNotNull(element23);
        __CLR4_2_08qf8qflnxz233t.R.inc(14685);org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14686);org.junit.Assert.assertNotNull(elements25);
        __CLR4_2_08qf8qflnxz233t.R.inc(14687);org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(14688);org.junit.Assert.assertNotNull(strSet27);
        __CLR4_2_08qf8qflnxz233t.R.inc(14689);org.junit.Assert.assertNotNull(element28);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test145() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),14690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ll8duhbc2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test145",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),14690,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ll8duhbc2() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(14690);
        __CLR4_2_08qf8qflnxz233t.R.inc(14691);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(14692)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(14693)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(14694);System.out.format("%n%s%n", "RegressionTest0.test145");
        }__CLR4_2_08qf8qflnxz233t.R.inc(14695);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14696);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14697);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(14698);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(14699);org.jsoup.nodes.Element element5 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(14700);java.util.regex.Pattern pattern7 = null;
        __CLR4_2_08qf8qflnxz233t.R.inc(14701);org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", pattern7);
        __CLR4_2_08qf8qflnxz233t.R.inc(14702);org.jsoup.nodes.Element element11 = element1.attr("", false);
        __CLR4_2_08qf8qflnxz233t.R.inc(14703);java.lang.String str12 = element11.tagName();
        __CLR4_2_08qf8qflnxz233t.R.inc(14704);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(14705);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(14706);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14707);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(14708);org.junit.Assert.assertNotNull(elements8);
        __CLR4_2_08qf8qflnxz233t.R.inc(14709);org.junit.Assert.assertNotNull(element11);
        __CLR4_2_08qf8qflnxz233t.R.inc(14710);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test146() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),14711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ic8f20bcn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test146",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),14711,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ic8f20bcn() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(14711);
        __CLR4_2_08qf8qflnxz233t.R.inc(14712);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(14713)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(14714)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(14715);System.out.format("%n%s%n", "RegressionTest0.test146");
        }__CLR4_2_08qf8qflnxz233t.R.inc(14716);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14717);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14718);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(14719);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(14720);org.jsoup.nodes.Element element5 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(14721);org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14722);org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14723);java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element10.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14724);org.jsoup.nodes.Element element12 = element10.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(14725);int int13 = element10.siblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(14726);org.jsoup.select.Elements elements14 = element10.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(14727);java.util.List<org.jsoup.nodes.Node> nodeList15 = element10.childNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14728);org.jsoup.nodes.Element element17 = element10.toggleClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14729);org.jsoup.nodes.Element element18 = element1.prependChild((org.jsoup.nodes.Node) element17);
        __CLR4_2_08qf8qflnxz233t.R.inc(14730);org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14731);java.util.List<org.jsoup.nodes.TextNode> textNodeList21 = element20.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14732);org.jsoup.nodes.Element element23 = element20.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14733);java.lang.String str24 = element23.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(14734);org.jsoup.select.Elements elements25 = element23.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(14735);int int26 = element23.childNodeSize();
        __CLR4_2_08qf8qflnxz233t.R.inc(14736);java.util.Set<java.lang.String> strSet27 = element23.classNames();
        __CLR4_2_08qf8qflnxz233t.R.inc(14737);org.jsoup.nodes.Element element28 = element1.classNames(strSet27);
        __CLR4_2_08qf8qflnxz233t.R.inc(14738);org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14739);java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "" };
        __CLR4_2_08qf8qflnxz233t.R.inc(14740);java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        __CLR4_2_08qf8qflnxz233t.R.inc(14741);boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        __CLR4_2_08qf8qflnxz233t.R.inc(14742);org.jsoup.nodes.Element element36 = element30.classNames((java.util.Set<java.lang.String>) strSet34);
        __CLR4_2_08qf8qflnxz233t.R.inc(14743);org.jsoup.nodes.Element element37 = element1.classNames((java.util.Set<java.lang.String>) strSet34);
        __CLR4_2_08qf8qflnxz233t.R.inc(14744);java.lang.String str38 = element37.cssSelector();
        __CLR4_2_08qf8qflnxz233t.R.inc(14745);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(14746);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(14747);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14748);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(14749);org.junit.Assert.assertNotNull(elements8);
        __CLR4_2_08qf8qflnxz233t.R.inc(14750);org.junit.Assert.assertNotNull(textNodeList11);
        __CLR4_2_08qf8qflnxz233t.R.inc(14751);org.junit.Assert.assertNotNull(element12);
        __CLR4_2_08qf8qflnxz233t.R.inc(14752);org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(14753);org.junit.Assert.assertNotNull(elements14);
        __CLR4_2_08qf8qflnxz233t.R.inc(14754);org.junit.Assert.assertNotNull(nodeList15);
        __CLR4_2_08qf8qflnxz233t.R.inc(14755);org.junit.Assert.assertNotNull(element17);
        __CLR4_2_08qf8qflnxz233t.R.inc(14756);org.junit.Assert.assertNotNull(element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(14757);org.junit.Assert.assertNotNull(textNodeList21);
        __CLR4_2_08qf8qflnxz233t.R.inc(14758);org.junit.Assert.assertNotNull(element23);
        __CLR4_2_08qf8qflnxz233t.R.inc(14759);org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14760);org.junit.Assert.assertNotNull(elements25);
        __CLR4_2_08qf8qflnxz233t.R.inc(14761);org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(14762);org.junit.Assert.assertNotNull(strSet27);
        __CLR4_2_08qf8qflnxz233t.R.inc(14763);org.junit.Assert.assertNotNull(element28);
        __CLR4_2_08qf8qflnxz233t.R.inc(14764);org.junit.Assert.assertNotNull(strArray33);
        __CLR4_2_08qf8qflnxz233t.R.inc(14765);org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        __CLR4_2_08qf8qflnxz233t.R.inc(14766);org.junit.Assert.assertNotNull(element36);
        __CLR4_2_08qf8qflnxz233t.R.inc(14767);org.junit.Assert.assertNotNull(element37);
        __CLR4_2_08qf8qflnxz233t.R.inc(14768);org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!.hi!" + "'", str38, "hi!.hi!");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test147() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),14769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0f38g9jbe9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test147",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),14769,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0f38g9jbe9() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(14769);
        __CLR4_2_08qf8qflnxz233t.R.inc(14770);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(14771)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(14772)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(14773);System.out.format("%n%s%n", "RegressionTest0.test147");
        }__CLR4_2_08qf8qflnxz233t.R.inc(14774);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14775);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14776);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14777);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(14778);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(14779);int int7 = element4.childNodeSize();
        __CLR4_2_08qf8qflnxz233t.R.inc(14780);java.lang.String str8 = element4.wholeText();
        __CLR4_2_08qf8qflnxz233t.R.inc(14781);org.jsoup.nodes.Element element10 = element4.removeAttr("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14782);java.lang.String str11 = element4.tagName();
        __CLR4_2_08qf8qflnxz233t.R.inc(14783);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(14784);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(14785);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14786);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(14787);org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(14788);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14789);org.junit.Assert.assertNotNull(element10);
        __CLR4_2_08qf8qflnxz233t.R.inc(14790);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test148() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),14791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0bu8hh2bev();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test148",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),14791,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0bu8hh2bev() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(14791);
        __CLR4_2_08qf8qflnxz233t.R.inc(14792);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(14793)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(14794)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(14795);System.out.format("%n%s%n", "RegressionTest0.test148");
        }__CLR4_2_08qf8qflnxz233t.R.inc(14796);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14797);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14798);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14799);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(14800);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14801);java.lang.String str8 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(14802);org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14803);java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14804);org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(14805);int int14 = element13.childNodeSize();
        __CLR4_2_08qf8qflnxz233t.R.inc(14806);org.jsoup.nodes.Element element16 = element13.val("<hi! class=\"\"></hi!>");
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(14807);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(14808);boolean boolean18 = element16.is("");
            __CLR4_2_08qf8qflnxz233t.R.inc(14809);org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '': unexpected token at ''");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(14810);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(14811);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(14812);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14813);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(14814);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14815);org.junit.Assert.assertNotNull(textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(14816);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(14817);org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(14818);org.junit.Assert.assertNotNull(element16);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test149() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),14819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_08l8iolbfn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test149",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),14819,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_08l8iolbfn() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(14819);
        __CLR4_2_08qf8qflnxz233t.R.inc(14820);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(14821)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(14822)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(14823);System.out.format("%n%s%n", "RegressionTest0.test149");
        }__CLR4_2_08qf8qflnxz233t.R.inc(14824);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14825);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14826);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14827);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(14828);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14829);java.lang.String str8 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(14830);org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14831);java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14832);org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(14833);org.jsoup.select.Elements elements14 = element13.siblingElements();
        __CLR4_2_08qf8qflnxz233t.R.inc(14834);java.lang.String str15 = element13.data();
        __CLR4_2_08qf8qflnxz233t.R.inc(14835);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(14836);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(14837);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14838);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(14839);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14840);org.junit.Assert.assertNotNull(textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(14841);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(14842);org.junit.Assert.assertNotNull(elements14);
        __CLR4_2_08qf8qflnxz233t.R.inc(14843);org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test150() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),14844);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_084db9bbgc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test150",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),14844,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_084db9bbgc() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(14844);
        __CLR4_2_08qf8qflnxz233t.R.inc(14845);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(14846)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(14847)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(14848);System.out.format("%n%s%n", "RegressionTest0.test150");
        }__CLR4_2_08qf8qflnxz233t.R.inc(14849);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14850);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14851);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(14852);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(14853);org.jsoup.nodes.Element element5 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(14854);org.jsoup.select.Elements elements6 = element5.parents();
        __CLR4_2_08qf8qflnxz233t.R.inc(14855);java.lang.String str7 = element5.toString();
        __CLR4_2_08qf8qflnxz233t.R.inc(14856);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(14857);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(14858);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14859);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(14860);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(14861);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<hi!></hi!>" + "'", str7, "<hi!></hi!>");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test151() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),14862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_04vdcgubgu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test151",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),14862,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_04vdcgubgu() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(14862);
        __CLR4_2_08qf8qflnxz233t.R.inc(14863);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(14864)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(14865)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(14866);System.out.format("%n%s%n", "RegressionTest0.test151");
        }__CLR4_2_08qf8qflnxz233t.R.inc(14867);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14868);java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        __CLR4_2_08qf8qflnxz233t.R.inc(14869);java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        __CLR4_2_08qf8qflnxz233t.R.inc(14870);boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        __CLR4_2_08qf8qflnxz233t.R.inc(14871);org.jsoup.nodes.Element element7 = element1.classNames((java.util.Set<java.lang.String>) strSet5);
        __CLR4_2_08qf8qflnxz233t.R.inc(14872);org.jsoup.nodes.Element element10 = element1.attr("<hi!></hi!>", "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14873);org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14874);java.util.List<org.jsoup.nodes.TextNode> textNodeList13 = element12.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14875);org.jsoup.nodes.Element element14 = element12.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(14876);java.lang.String str15 = element12.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(14877);org.jsoup.nodes.Element element16 = element12.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(14878);java.util.regex.Pattern pattern18 = null;
        __CLR4_2_08qf8qflnxz233t.R.inc(14879);org.jsoup.select.Elements elements19 = element12.getElementsByAttributeValueMatching("hi!", pattern18);
        __CLR4_2_08qf8qflnxz233t.R.inc(14880);org.jsoup.nodes.Element element20 = element12.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(14881);boolean boolean21 = element1.equals((java.lang.Object) element12);
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(14882);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(14883);org.jsoup.nodes.Element element22 = element1.firstElementSibling();
            __CLR4_2_08qf8qflnxz233t.R.inc(14884);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(14885);org.junit.Assert.assertNotNull(strArray4);
        __CLR4_2_08qf8qflnxz233t.R.inc(14886);org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        __CLR4_2_08qf8qflnxz233t.R.inc(14887);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(14888);org.junit.Assert.assertNotNull(element10);
        __CLR4_2_08qf8qflnxz233t.R.inc(14889);org.junit.Assert.assertNotNull(textNodeList13);
        __CLR4_2_08qf8qflnxz233t.R.inc(14890);org.junit.Assert.assertNull(element14);
        __CLR4_2_08qf8qflnxz233t.R.inc(14891);org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14892);org.junit.Assert.assertNotNull(element16);
        __CLR4_2_08qf8qflnxz233t.R.inc(14893);org.junit.Assert.assertNotNull(elements19);
        __CLR4_2_08qf8qflnxz233t.R.inc(14894);org.junit.Assert.assertNotNull(element20);
        __CLR4_2_08qf8qflnxz233t.R.inc(14895);org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test152() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),14896);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_01mddodbhs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test152",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),14896,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_01mddodbhs() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(14896);
        __CLR4_2_08qf8qflnxz233t.R.inc(14897);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(14898)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(14899)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(14900);System.out.format("%n%s%n", "RegressionTest0.test152");
        }__CLR4_2_08qf8qflnxz233t.R.inc(14901);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14902);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14903);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14904);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(14905);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14906);java.lang.String str8 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(14907);org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14908);java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14909);org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(14910);java.lang.String str14 = element4.val();
        __CLR4_2_08qf8qflnxz233t.R.inc(14911);org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14912);java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14913);org.jsoup.nodes.Element element18 = element16.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(14914);java.lang.String str19 = element16.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(14915);org.jsoup.nodes.Element element20 = element16.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(14916);org.jsoup.nodes.Element element22 = element16.addClass("<hi!></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(14917);boolean boolean24 = element16.hasAttr("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14918);org.jsoup.nodes.Element element25 = element4.appendTo(element16);
        __CLR4_2_08qf8qflnxz233t.R.inc(14919);java.util.List<org.jsoup.nodes.Node> nodeList26 = element25.childNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14920);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(14921);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(14922);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14923);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(14924);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14925);org.junit.Assert.assertNotNull(textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(14926);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(14927);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14928);org.junit.Assert.assertNotNull(textNodeList17);
        __CLR4_2_08qf8qflnxz233t.R.inc(14929);org.junit.Assert.assertNull(element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(14930);org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14931);org.junit.Assert.assertNotNull(element20);
        __CLR4_2_08qf8qflnxz233t.R.inc(14932);org.junit.Assert.assertNotNull(element22);
        __CLR4_2_08qf8qflnxz233t.R.inc(14933);org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(14934);org.junit.Assert.assertNotNull(element25);
        __CLR4_2_08qf8qflnxz233t.R.inc(14935);org.junit.Assert.assertNotNull(nodeList26);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test153() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),14936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_01mml44biw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test153",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),14936,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_01mml44biw() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(14936);
        __CLR4_2_08qf8qflnxz233t.R.inc(14937);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(14938)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(14939)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(14940);System.out.format("%n%s%n", "RegressionTest0.test153");
        }__CLR4_2_08qf8qflnxz233t.R.inc(14941);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14942);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14943);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(14944);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(14945);java.util.List<org.jsoup.nodes.Node> nodeList5 = element1.childNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14946);org.jsoup.nodes.Element element7 = element1.append("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14947);java.util.regex.Pattern pattern8 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(14948);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(14949);org.jsoup.select.Elements elements9 = element7.getElementsMatchingOwnText(pattern8);
            __CLR4_2_08qf8qflnxz233t.R.inc(14950);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(14951);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(14952);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(14953);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14954);org.junit.Assert.assertNotNull(nodeList5);
        __CLR4_2_08qf8qflnxz233t.R.inc(14955);org.junit.Assert.assertNotNull(element7);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test154() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),14956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_04vmjwlbjg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test154",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),14956,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_04vmjwlbjg() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(14956);
        __CLR4_2_08qf8qflnxz233t.R.inc(14957);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(14958)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(14959)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(14960);System.out.format("%n%s%n", "RegressionTest0.test154");
        }__CLR4_2_08qf8qflnxz233t.R.inc(14961);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14962);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14963);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14964);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(14965);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14966);java.lang.String str8 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(14967);org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14968);java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14969);org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(14970);java.lang.String str14 = element4.val();
        __CLR4_2_08qf8qflnxz233t.R.inc(14971);org.jsoup.select.Elements elements16 = element4.getElementsByIndexLessThan(0);
        __CLR4_2_08qf8qflnxz233t.R.inc(14972);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(14973);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(14974);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14975);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(14976);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14977);org.junit.Assert.assertNotNull(textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(14978);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(14979);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14980);org.junit.Assert.assertNotNull(elements16);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test155() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),14981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_084mip2bk5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test155",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),14981,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_084mip2bk5() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(14981);
        __CLR4_2_08qf8qflnxz233t.R.inc(14982);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(14983)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(14984)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(14985);System.out.format("%n%s%n", "RegressionTest0.test155");
        }__CLR4_2_08qf8qflnxz233t.R.inc(14986);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(14987);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(14988);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(14989);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(14990);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(14991);java.lang.String str7 = element4.text();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(14992);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(14993);org.jsoup.nodes.Element element9 = element4.before("<hi!>\n hi!\n</hi!>");
            __CLR4_2_08qf8qflnxz233t.R.inc(14994);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(14995);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(14996);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(14997);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(14998);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(14999);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test156() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),15000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0bdmhhjbko();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test156",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),15000,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0bdmhhjbko() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(15000);
        __CLR4_2_08qf8qflnxz233t.R.inc(15001);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(15002)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(15003)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(15004);System.out.format("%n%s%n", "RegressionTest0.test156");
        }__CLR4_2_08qf8qflnxz233t.R.inc(15005);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15006);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15007);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15008);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15009);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15010);boolean boolean9 = element4.hasAttr("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15011);org.jsoup.select.Elements elements11 = element4.getElementsContainingText("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15012);org.jsoup.nodes.Element element13 = element4.prependText("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15013);org.jsoup.select.Elements elements14 = element13.getAllElements();
        __CLR4_2_08qf8qflnxz233t.R.inc(15014);java.lang.String str15 = element13.ownText();
        __CLR4_2_08qf8qflnxz233t.R.inc(15015);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(15016);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(15017);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15018);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(15019);org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(15020);org.junit.Assert.assertNotNull(elements11);
        __CLR4_2_08qf8qflnxz233t.R.inc(15021);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(15022);org.junit.Assert.assertNotNull(elements14);
        __CLR4_2_08qf8qflnxz233t.R.inc(15023);org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test157() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),15024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0emmga0blc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test157",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),15024,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0emmga0blc() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(15024);
        __CLR4_2_08qf8qflnxz233t.R.inc(15025);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(15026)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(15027)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(15028);System.out.format("%n%s%n", "RegressionTest0.test157");
        }__CLR4_2_08qf8qflnxz233t.R.inc(15029);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15030);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15031);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15032);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15033);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(15034);int int7 = element4.childNodeSize();
        __CLR4_2_08qf8qflnxz233t.R.inc(15035);java.util.Set<java.lang.String> strSet8 = element4.classNames();
        __CLR4_2_08qf8qflnxz233t.R.inc(15036);org.jsoup.nodes.Document document9 = element4.ownerDocument();
        __CLR4_2_08qf8qflnxz233t.R.inc(15037);org.jsoup.select.Elements elements10 = element4.previousElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(15038);org.jsoup.select.Elements elements12 = element4.getElementsByTag("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(15039);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(15040);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(15041);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15042);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(15043);org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(15044);org.junit.Assert.assertNotNull(strSet8);
        __CLR4_2_08qf8qflnxz233t.R.inc(15045);org.junit.Assert.assertNull(document9);
        __CLR4_2_08qf8qflnxz233t.R.inc(15046);org.junit.Assert.assertNotNull(elements10);
        __CLR4_2_08qf8qflnxz233t.R.inc(15047);org.junit.Assert.assertNotNull(elements12);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test158() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),15048);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0hvmf2hbm0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test158",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),15048,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0hvmf2hbm0() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(15048);
        __CLR4_2_08qf8qflnxz233t.R.inc(15049);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(15050)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(15051)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(15052);System.out.format("%n%s%n", "RegressionTest0.test158");
        }__CLR4_2_08qf8qflnxz233t.R.inc(15053);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15054);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15055);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15056);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15057);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15058);java.lang.String str8 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15059);org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15060);java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15061);org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(15062);java.lang.String str14 = element4.val();
        __CLR4_2_08qf8qflnxz233t.R.inc(15063);org.jsoup.select.Elements elements16 = element4.getElementsByClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15064);java.lang.String str17 = element4.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(15065);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(15066);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(15067);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15068);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(15069);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15070);org.junit.Assert.assertNotNull(textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(15071);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(15072);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15073);org.junit.Assert.assertNotNull(elements16);
        __CLR4_2_08qf8qflnxz233t.R.inc(15074);org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test159() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),15075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0l4mduybmr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test159",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),15075,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0l4mduybmr() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(15075);
        __CLR4_2_08qf8qflnxz233t.R.inc(15076);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(15077)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(15078)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(15079);System.out.format("%n%s%n", "RegressionTest0.test159");
        }__CLR4_2_08qf8qflnxz233t.R.inc(15080);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15081);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15082);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15083);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15084);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15085);org.jsoup.select.Elements elements8 = element7.children();
        __CLR4_2_08qf8qflnxz233t.R.inc(15086);org.jsoup.nodes.Element element9 = element7.root();
        __CLR4_2_08qf8qflnxz233t.R.inc(15087);org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValue("hi!", "<hi! class=\"\"></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(15088);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(15089);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(15090);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15091);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(15092);org.junit.Assert.assertNotNull(elements8);
        __CLR4_2_08qf8qflnxz233t.R.inc(15093);org.junit.Assert.assertNotNull(element9);
        __CLR4_2_08qf8qflnxz233t.R.inc(15094);org.junit.Assert.assertNotNull(elements12);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test160() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),15095);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0llhla8bnb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test160",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),15095,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0llhla8bnb() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(15095);
        __CLR4_2_08qf8qflnxz233t.R.inc(15096);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(15097)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(15098)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(15099);System.out.format("%n%s%n", "RegressionTest0.test160");
        }__CLR4_2_08qf8qflnxz233t.R.inc(15100);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15101);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15102);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15103);org.jsoup.nodes.Element element5 = element1.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15104);java.lang.String str6 = element5.id();
        __CLR4_2_08qf8qflnxz233t.R.inc(15105);org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15106);java.util.List<org.jsoup.nodes.TextNode> textNodeList9 = element8.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15107);org.jsoup.nodes.Element element11 = element8.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15108);java.lang.String str12 = element11.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15109);org.jsoup.nodes.Element element14 = element11.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15110);java.lang.String str15 = element11.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15111);org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15112);java.util.List<org.jsoup.nodes.TextNode> textNodeList19 = element18.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15113);org.jsoup.nodes.Element element20 = element11.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList19);
        __CLR4_2_08qf8qflnxz233t.R.inc(15114);java.lang.String str21 = element11.val();
        __CLR4_2_08qf8qflnxz233t.R.inc(15115);org.jsoup.select.Elements elements22 = element11.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(15116);org.jsoup.nodes.Element element23 = element5.appendTo(element11);
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(15117);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(15118);java.lang.String str25 = element11.absUrl("");
            __CLR4_2_08qf8qflnxz233t.R.inc(15119);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(15120);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(15121);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(15122);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(15123);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15124);org.junit.Assert.assertNotNull(textNodeList9);
        __CLR4_2_08qf8qflnxz233t.R.inc(15125);org.junit.Assert.assertNotNull(element11);
        __CLR4_2_08qf8qflnxz233t.R.inc(15126);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15127);org.junit.Assert.assertNotNull(element14);
        __CLR4_2_08qf8qflnxz233t.R.inc(15128);org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15129);org.junit.Assert.assertNotNull(textNodeList19);
        __CLR4_2_08qf8qflnxz233t.R.inc(15130);org.junit.Assert.assertNotNull(element20);
        __CLR4_2_08qf8qflnxz233t.R.inc(15131);org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15132);org.junit.Assert.assertNotNull(elements22);
        __CLR4_2_08qf8qflnxz233t.R.inc(15133);org.junit.Assert.assertNotNull(element23);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test161() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),15134);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ouhk2pboe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test161",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),15134,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ouhk2pboe() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(15134);
        __CLR4_2_08qf8qflnxz233t.R.inc(15135);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(15136)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(15137)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(15138);System.out.format("%n%s%n", "RegressionTest0.test161");
        }__CLR4_2_08qf8qflnxz233t.R.inc(15139);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15140);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15141);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15142);org.jsoup.nodes.Document document5 = element1.ownerDocument();
        __CLR4_2_08qf8qflnxz233t.R.inc(15143);org.jsoup.nodes.Element element6 = element1.root();
        __CLR4_2_08qf8qflnxz233t.R.inc(15144);org.jsoup.select.Elements elements8 = element6.getElementsContainingText("<hi!>\n hi!\n</hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(15145);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(15146);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(15147);org.junit.Assert.assertNull(document5);
        __CLR4_2_08qf8qflnxz233t.R.inc(15148);org.junit.Assert.assertNotNull(element6);
        __CLR4_2_08qf8qflnxz233t.R.inc(15149);org.junit.Assert.assertNotNull(elements8);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test162() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),15150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0s3hiv6bou();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test162",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),15150,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0s3hiv6bou() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(15150);
        __CLR4_2_08qf8qflnxz233t.R.inc(15151);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(15152)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(15153)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(15154);System.out.format("%n%s%n", "RegressionTest0.test162");
        }__CLR4_2_08qf8qflnxz233t.R.inc(15155);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15156);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15157);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15158);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15159);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15160);org.jsoup.nodes.Element element9 = element4.appendElement("<hi!>\n hi!\n</hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(15161);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(15162);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(15163);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15164);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(15165);org.junit.Assert.assertNotNull(element9);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test163() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),15166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0vchhnnbpa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test163",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),15166,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0vchhnnbpa() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(15166);
        __CLR4_2_08qf8qflnxz233t.R.inc(15167);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(15168)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(15169)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(15170);System.out.format("%n%s%n", "RegressionTest0.test163");
        }__CLR4_2_08qf8qflnxz233t.R.inc(15171);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15172);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15173);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15174);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15175);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15176);org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15177);java.util.List<org.jsoup.nodes.TextNode> textNodeList10 = element9.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15178);org.jsoup.nodes.Element element12 = element9.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15179);java.lang.String str13 = element12.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15180);org.jsoup.nodes.Element element15 = element12.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15181);java.lang.String str16 = element12.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15182);org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15183);java.util.List<org.jsoup.nodes.TextNode> textNodeList20 = element19.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15184);org.jsoup.nodes.Element element21 = element12.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList20);
        __CLR4_2_08qf8qflnxz233t.R.inc(15185);org.jsoup.nodes.Element element22 = element4.appendChild((org.jsoup.nodes.Node) element21);
        __CLR4_2_08qf8qflnxz233t.R.inc(15186);org.jsoup.nodes.Element element24 = element4.append("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(15187);org.jsoup.nodes.Element element25 = element4.empty();
        __CLR4_2_08qf8qflnxz233t.R.inc(15188);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(15189);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(15190);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15191);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(15192);org.junit.Assert.assertNotNull(textNodeList10);
        __CLR4_2_08qf8qflnxz233t.R.inc(15193);org.junit.Assert.assertNotNull(element12);
        __CLR4_2_08qf8qflnxz233t.R.inc(15194);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15195);org.junit.Assert.assertNotNull(element15);
        __CLR4_2_08qf8qflnxz233t.R.inc(15196);org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15197);org.junit.Assert.assertNotNull(textNodeList20);
        __CLR4_2_08qf8qflnxz233t.R.inc(15198);org.junit.Assert.assertNotNull(element21);
        __CLR4_2_08qf8qflnxz233t.R.inc(15199);org.junit.Assert.assertNotNull(element22);
        __CLR4_2_08qf8qflnxz233t.R.inc(15200);org.junit.Assert.assertNotNull(element24);
        __CLR4_2_08qf8qflnxz233t.R.inc(15201);org.junit.Assert.assertNotNull(element25);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test164() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),15202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ylhgg4bqa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test164",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),15202,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ylhgg4bqa() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(15202);
        __CLR4_2_08qf8qflnxz233t.R.inc(15203);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(15204)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(15205)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(15206);System.out.format("%n%s%n", "RegressionTest0.test164");
        }__CLR4_2_08qf8qflnxz233t.R.inc(15207);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15208);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15209);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(15210);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(15211);org.jsoup.nodes.Element element5 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(15212);org.jsoup.select.NodeVisitor nodeVisitor6 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(15213);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(15214);org.jsoup.nodes.Element element7 = element1.traverse(nodeVisitor6);
            __CLR4_2_08qf8qflnxz233t.R.inc(15215);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(15216);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(15217);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(15218);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15219);org.junit.Assert.assertNotNull(element5);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test165() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),15220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0x6mmqjbqs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test165",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),15220,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0x6mmqjbqs() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(15220);
        __CLR4_2_08qf8qflnxz233t.R.inc(15221);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(15222)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(15223)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(15224);System.out.format("%n%s%n", "RegressionTest0.test165");
        }__CLR4_2_08qf8qflnxz233t.R.inc(15225);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15226);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15227);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15228);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15229);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(15230);int int7 = element4.childNodeSize();
        __CLR4_2_08qf8qflnxz233t.R.inc(15231);java.lang.String str8 = element4.wholeText();
        __CLR4_2_08qf8qflnxz233t.R.inc(15232);org.jsoup.nodes.Element element10 = element4.removeAttr("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15233);org.jsoup.nodes.Element element12 = element10.removeAttr("<hi!>\n hi!\n</hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(15234);element12.setBaseUri("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15235);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(15236);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(15237);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15238);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(15239);org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(15240);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15241);org.junit.Assert.assertNotNull(element10);
        __CLR4_2_08qf8qflnxz233t.R.inc(15242);org.junit.Assert.assertNotNull(element12);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test166() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),15243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0txmny2brf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test166",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),15243,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0txmny2brf() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(15243);
        __CLR4_2_08qf8qflnxz233t.R.inc(15244);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(15245)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(15246)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(15247);System.out.format("%n%s%n", "RegressionTest0.test166");
        }__CLR4_2_08qf8qflnxz233t.R.inc(15248);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15249);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15250);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(15251);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(15252);org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15253);java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15254);org.jsoup.nodes.Element element9 = element6.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15255);java.lang.String str10 = element9.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15256);org.jsoup.nodes.Element element12 = element9.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15257);java.lang.String str13 = element9.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15258);org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15259);java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15260);org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        __CLR4_2_08qf8qflnxz233t.R.inc(15261);org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(15262);int int20 = element18.elementSiblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(15263);org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(15264);java.util.List<org.jsoup.nodes.Node> nodeList22 = element21.childNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15265);org.jsoup.nodes.Element element23 = element21.empty();
        __CLR4_2_08qf8qflnxz233t.R.inc(15266);org.jsoup.nodes.Element element24 = element23.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(15267);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(15268);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(15269);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15270);org.junit.Assert.assertNotNull(textNodeList7);
        __CLR4_2_08qf8qflnxz233t.R.inc(15271);org.junit.Assert.assertNotNull(element9);
        __CLR4_2_08qf8qflnxz233t.R.inc(15272);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15273);org.junit.Assert.assertNotNull(element12);
        __CLR4_2_08qf8qflnxz233t.R.inc(15274);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15275);org.junit.Assert.assertNotNull(textNodeList17);
        __CLR4_2_08qf8qflnxz233t.R.inc(15276);org.junit.Assert.assertNotNull(element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(15277);org.junit.Assert.assertNull(element19);
        __CLR4_2_08qf8qflnxz233t.R.inc(15278);org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(15279);org.junit.Assert.assertNotNull(element21);
        __CLR4_2_08qf8qflnxz233t.R.inc(15280);org.junit.Assert.assertNotNull(nodeList22);
        __CLR4_2_08qf8qflnxz233t.R.inc(15281);org.junit.Assert.assertNotNull(element23);
        __CLR4_2_08qf8qflnxz233t.R.inc(15282);org.junit.Assert.assertNull(element24);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test167() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),15283);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0qomp5lbsj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test167",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),15283,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0qomp5lbsj() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(15283);
        __CLR4_2_08qf8qflnxz233t.R.inc(15284);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(15285)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(15286)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(15287);System.out.format("%n%s%n", "RegressionTest0.test167");
        }__CLR4_2_08qf8qflnxz233t.R.inc(15288);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15289);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15290);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15291);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15292);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(15293);element4.setBaseUri("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15294);org.jsoup.nodes.Element element10 = element4.appendText("<hi!></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(15295);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(15296);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(15297);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15298);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(15299);org.junit.Assert.assertNotNull(element10);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test168() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),15300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0nfmqd4bt0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test168",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),15300,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0nfmqd4bt0() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(15300);
        __CLR4_2_08qf8qflnxz233t.R.inc(15301);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(15302)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(15303)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(15304);System.out.format("%n%s%n", "RegressionTest0.test168");
        }__CLR4_2_08qf8qflnxz233t.R.inc(15305);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15306);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15307);org.jsoup.nodes.Element element3 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(15308);int int4 = element1.siblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(15309);org.jsoup.select.Elements elements5 = element1.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(15310);org.jsoup.nodes.Element element7 = element1.prependText("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15311);element1.setBaseUri("<hi! class=\"\"></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(15312);org.jsoup.select.Elements elements11 = element1.getElementsByAttributeStarting("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15313);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(15314);org.junit.Assert.assertNotNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(15315);org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(15316);org.junit.Assert.assertNotNull(elements5);
        __CLR4_2_08qf8qflnxz233t.R.inc(15317);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(15318);org.junit.Assert.assertNotNull(elements11);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test169() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),15319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0k6mrknbtj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test169",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),15319,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0k6mrknbtj() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(15319);
        __CLR4_2_08qf8qflnxz233t.R.inc(15320);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(15321)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(15322)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(15323);System.out.format("%n%s%n", "RegressionTest0.test169");
        }__CLR4_2_08qf8qflnxz233t.R.inc(15324);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15325);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15326);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15327);org.jsoup.nodes.Document document5 = element1.ownerDocument();
        __CLR4_2_08qf8qflnxz233t.R.inc(15328);org.jsoup.nodes.Element element6 = element1.root();
        __CLR4_2_08qf8qflnxz233t.R.inc(15329);java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15330);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(15331);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(15332);org.junit.Assert.assertNull(document5);
        __CLR4_2_08qf8qflnxz233t.R.inc(15333);org.junit.Assert.assertNotNull(element6);
        __CLR4_2_08qf8qflnxz233t.R.inc(15334);org.junit.Assert.assertNotNull(textNodeList7);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test170() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),15335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0jprk5dbtz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test170",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),15335,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0jprk5dbtz() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(15335);
        __CLR4_2_08qf8qflnxz233t.R.inc(15336);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(15337)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(15338)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(15339);System.out.format("%n%s%n", "RegressionTest0.test170");
        }__CLR4_2_08qf8qflnxz233t.R.inc(15340);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15341);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15342);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(15343);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(15344);org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15345);java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15346);org.jsoup.nodes.Element element9 = element6.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15347);java.lang.String str10 = element9.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15348);org.jsoup.nodes.Element element12 = element9.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15349);java.lang.String str13 = element9.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15350);org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15351);java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15352);org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        __CLR4_2_08qf8qflnxz233t.R.inc(15353);org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(15354);int int20 = element18.elementSiblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(15355);org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(15356);org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15357);java.util.List<org.jsoup.nodes.TextNode> textNodeList24 = element23.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15358);org.jsoup.nodes.Element element26 = element23.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15359);java.lang.String str27 = element26.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15360);org.jsoup.select.Elements elements28 = element26.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(15361);org.jsoup.nodes.Element element30 = element26.toggleClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15362);org.jsoup.nodes.Element element31 = element30.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15363);org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15364);java.util.List<org.jsoup.nodes.TextNode> textNodeList34 = element33.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15365);org.jsoup.nodes.Element element35 = element33.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(15366);java.lang.String str36 = element33.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(15367);org.jsoup.nodes.Element element37 = element33.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(15368);java.util.regex.Pattern pattern39 = null;
        __CLR4_2_08qf8qflnxz233t.R.inc(15369);org.jsoup.select.Elements elements40 = element33.getElementsByAttributeValueMatching("hi!", pattern39);
        __CLR4_2_08qf8qflnxz233t.R.inc(15370);boolean boolean41 = element31.equals((java.lang.Object) pattern39);
        __CLR4_2_08qf8qflnxz233t.R.inc(15371);org.jsoup.nodes.Element element42 = element18.after((org.jsoup.nodes.Node) element31);
        __CLR4_2_08qf8qflnxz233t.R.inc(15372);java.lang.String str43 = element18.className();
        __CLR4_2_08qf8qflnxz233t.R.inc(15373);org.jsoup.select.Elements elements46 = element18.getElementsByAttributeValueEnding("<hi!>\n hi!\n</hi!>", "<hi! class=\"\"></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(15374);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(15375);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(15376);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15377);org.junit.Assert.assertNotNull(textNodeList7);
        __CLR4_2_08qf8qflnxz233t.R.inc(15378);org.junit.Assert.assertNotNull(element9);
        __CLR4_2_08qf8qflnxz233t.R.inc(15379);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15380);org.junit.Assert.assertNotNull(element12);
        __CLR4_2_08qf8qflnxz233t.R.inc(15381);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15382);org.junit.Assert.assertNotNull(textNodeList17);
        __CLR4_2_08qf8qflnxz233t.R.inc(15383);org.junit.Assert.assertNotNull(element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(15384);org.junit.Assert.assertNull(element19);
        __CLR4_2_08qf8qflnxz233t.R.inc(15385);org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(15386);org.junit.Assert.assertNotNull(element21);
        __CLR4_2_08qf8qflnxz233t.R.inc(15387);org.junit.Assert.assertNotNull(textNodeList24);
        __CLR4_2_08qf8qflnxz233t.R.inc(15388);org.junit.Assert.assertNotNull(element26);
        __CLR4_2_08qf8qflnxz233t.R.inc(15389);org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15390);org.junit.Assert.assertNotNull(elements28);
        __CLR4_2_08qf8qflnxz233t.R.inc(15391);org.junit.Assert.assertNotNull(element30);
        __CLR4_2_08qf8qflnxz233t.R.inc(15392);org.junit.Assert.assertNotNull(element31);
        __CLR4_2_08qf8qflnxz233t.R.inc(15393);org.junit.Assert.assertNotNull(textNodeList34);
        __CLR4_2_08qf8qflnxz233t.R.inc(15394);org.junit.Assert.assertNull(element35);
        __CLR4_2_08qf8qflnxz233t.R.inc(15395);org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15396);org.junit.Assert.assertNotNull(element37);
        __CLR4_2_08qf8qflnxz233t.R.inc(15397);org.junit.Assert.assertNotNull(elements40);
        __CLR4_2_08qf8qflnxz233t.R.inc(15398);org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(15399);org.junit.Assert.assertNotNull(element42);
        __CLR4_2_08qf8qflnxz233t.R.inc(15400);org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15401);org.junit.Assert.assertNotNull(elements46);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test171() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),15402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ggrlcwbvu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test171",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),15402,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ggrlcwbvu() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(15402);
        __CLR4_2_08qf8qflnxz233t.R.inc(15403);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(15404)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(15405)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(15406);System.out.format("%n%s%n", "RegressionTest0.test171");
        }__CLR4_2_08qf8qflnxz233t.R.inc(15407);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15408);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15409);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15410);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15411);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15412);java.lang.String str8 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15413);org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15414);java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15415);org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(15416);java.lang.String str14 = element4.val();
        __CLR4_2_08qf8qflnxz233t.R.inc(15417);org.jsoup.nodes.Element element15 = element4.empty();
        __CLR4_2_08qf8qflnxz233t.R.inc(15418);org.jsoup.nodes.Element element17 = element15.html("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15419);java.util.Map<java.lang.String, java.lang.String> strMap18 = element15.dataset();
        __CLR4_2_08qf8qflnxz233t.R.inc(15420);org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15421);java.util.List<org.jsoup.nodes.TextNode> textNodeList21 = element20.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15422);org.jsoup.nodes.Element element22 = element20.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(15423);int int23 = element20.siblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(15424);org.jsoup.select.Elements elements24 = element20.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(15425);org.jsoup.nodes.Element element26 = element20.prependText("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15426);org.jsoup.nodes.Element element27 = element15.appendTo(element20);
        __CLR4_2_08qf8qflnxz233t.R.inc(15427);org.jsoup.nodes.Document document28 = element20.ownerDocument();
        __CLR4_2_08qf8qflnxz233t.R.inc(15428);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(15429);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(15430);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15431);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(15432);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15433);org.junit.Assert.assertNotNull(textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(15434);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(15435);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15436);org.junit.Assert.assertNotNull(element15);
        __CLR4_2_08qf8qflnxz233t.R.inc(15437);org.junit.Assert.assertNotNull(element17);
        __CLR4_2_08qf8qflnxz233t.R.inc(15438);org.junit.Assert.assertNotNull(strMap18);
        __CLR4_2_08qf8qflnxz233t.R.inc(15439);org.junit.Assert.assertNotNull(textNodeList21);
        __CLR4_2_08qf8qflnxz233t.R.inc(15440);org.junit.Assert.assertNotNull(element22);
        __CLR4_2_08qf8qflnxz233t.R.inc(15441);org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(15442);org.junit.Assert.assertNotNull(elements24);
        __CLR4_2_08qf8qflnxz233t.R.inc(15443);org.junit.Assert.assertNotNull(element26);
        __CLR4_2_08qf8qflnxz233t.R.inc(15444);org.junit.Assert.assertNotNull(element27);
        __CLR4_2_08qf8qflnxz233t.R.inc(15445);org.junit.Assert.assertNull(document28);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test172() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),15446);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0d7rmkfbx2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test172",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),15446,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0d7rmkfbx2() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(15446);
        __CLR4_2_08qf8qflnxz233t.R.inc(15447);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(15448)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(15449)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(15450);System.out.format("%n%s%n", "RegressionTest0.test172");
        }__CLR4_2_08qf8qflnxz233t.R.inc(15451);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15452);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15453);org.jsoup.nodes.Node node3 = element1.previousSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(15454);java.lang.String str4 = element1.id();
        __CLR4_2_08qf8qflnxz233t.R.inc(15455);org.jsoup.nodes.Element element6 = element1.removeClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15456);org.jsoup.nodes.Element element7 = element6.empty();
        __CLR4_2_08qf8qflnxz233t.R.inc(15457);java.util.regex.Pattern pattern8 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(15458);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(15459);org.jsoup.select.Elements elements9 = element7.getElementsMatchingOwnText(pattern8);
            __CLR4_2_08qf8qflnxz233t.R.inc(15460);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(15461);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(15462);org.junit.Assert.assertNull(node3);
        __CLR4_2_08qf8qflnxz233t.R.inc(15463);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15464);org.junit.Assert.assertNotNull(element6);
        __CLR4_2_08qf8qflnxz233t.R.inc(15465);org.junit.Assert.assertNotNull(element7);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test173() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),15466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_09yrnrybxm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test173",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),15466,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_09yrnrybxm() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(15466);
        __CLR4_2_08qf8qflnxz233t.R.inc(15467);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(15468)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(15469)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(15470);System.out.format("%n%s%n", "RegressionTest0.test173");
        }__CLR4_2_08qf8qflnxz233t.R.inc(15471);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15472);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15473);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(15474);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(15475);org.jsoup.select.Elements elements6 = element1.getElementsByIndexLessThan((int) (byte) 1);
        __CLR4_2_08qf8qflnxz233t.R.inc(15476);int int7 = element1.siblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(15477);java.lang.String str9 = element1.attr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15478);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(15479);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(15480);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15481);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(15482);org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(15483);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test174() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),15484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_06prozhby4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test174",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),15484,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_06prozhby4() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(15484);
        __CLR4_2_08qf8qflnxz233t.R.inc(15485);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(15486)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(15487)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(15488);System.out.format("%n%s%n", "RegressionTest0.test174");
        }__CLR4_2_08qf8qflnxz233t.R.inc(15489);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15490);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15491);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15492);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15493);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(15494);int int7 = element4.childNodeSize();
        __CLR4_2_08qf8qflnxz233t.R.inc(15495);java.util.Set<java.lang.String> strSet8 = element4.classNames();
        __CLR4_2_08qf8qflnxz233t.R.inc(15496);org.jsoup.nodes.Document document9 = element4.ownerDocument();
        __CLR4_2_08qf8qflnxz233t.R.inc(15497);org.jsoup.select.Elements elements10 = element4.previousElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(15498);org.jsoup.parser.Tag tag11 = element4.tag();
        __CLR4_2_08qf8qflnxz233t.R.inc(15499);org.jsoup.nodes.Element element13 = element4.getElementById("<hi! class=\"\"></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(15500);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(15501);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(15502);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15503);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(15504);org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(15505);org.junit.Assert.assertNotNull(strSet8);
        __CLR4_2_08qf8qflnxz233t.R.inc(15506);org.junit.Assert.assertNull(document9);
        __CLR4_2_08qf8qflnxz233t.R.inc(15507);org.junit.Assert.assertNotNull(elements10);
        __CLR4_2_08qf8qflnxz233t.R.inc(15508);org.junit.Assert.assertNotNull(tag11);
        __CLR4_2_08qf8qflnxz233t.R.inc(15509);org.junit.Assert.assertNull(element13);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test175() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),15510);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_03grq70byu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test175",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),15510,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_03grq70byu() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(15510);
        __CLR4_2_08qf8qflnxz233t.R.inc(15511);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(15512)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(15513)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(15514);System.out.format("%n%s%n", "RegressionTest0.test175");
        }__CLR4_2_08qf8qflnxz233t.R.inc(15515);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15516);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15517);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15518);org.jsoup.nodes.Document document5 = element1.ownerDocument();
        __CLR4_2_08qf8qflnxz233t.R.inc(15519);org.jsoup.nodes.Element element6 = element1.root();
        __CLR4_2_08qf8qflnxz233t.R.inc(15520);org.jsoup.nodes.Element element7 = element1.previousElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(15521);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(15522);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(15523);org.junit.Assert.assertNull(document5);
        __CLR4_2_08qf8qflnxz233t.R.inc(15524);org.junit.Assert.assertNotNull(element6);
        __CLR4_2_08qf8qflnxz233t.R.inc(15525);org.junit.Assert.assertNull(element7);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test176() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),15526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_07rrejbza();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test176",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),15526,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_07rrejbza() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(15526);
        __CLR4_2_08qf8qflnxz233t.R.inc(15527);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(15528)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(15529)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(15530);System.out.format("%n%s%n", "RegressionTest0.test176");
        }__CLR4_2_08qf8qflnxz233t.R.inc(15531);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15532);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15533);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15534);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15535);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15536);boolean boolean9 = element4.hasAttr("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15537);org.jsoup.nodes.Element element10 = element4.root();
        __CLR4_2_08qf8qflnxz233t.R.inc(15538);org.jsoup.select.Elements elements12 = element10.getElementsByIndexEquals((int) (byte) 10);
        __CLR4_2_08qf8qflnxz233t.R.inc(15539);org.jsoup.select.Elements elements14 = element10.getElementsByIndexGreaterThan((int) (short) 1);
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(15540);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(15541);org.jsoup.nodes.Element element16 = element10.selectFirst("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
            __CLR4_2_08qf8qflnxz233t.R.inc(15542);org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>': unexpected token at '<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(15543);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(15544);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(15545);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15546);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(15547);org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(15548);org.junit.Assert.assertNotNull(element10);
        __CLR4_2_08qf8qflnxz233t.R.inc(15549);org.junit.Assert.assertNotNull(elements12);
        __CLR4_2_08qf8qflnxz233t.R.inc(15550);org.junit.Assert.assertNotNull(elements14);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test177() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),15551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_03187dybzz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test177",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),15551,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_03187dybzz() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(15551);
        __CLR4_2_08qf8qflnxz233t.R.inc(15552);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(15553)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(15554)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(15555);System.out.format("%n%s%n", "RegressionTest0.test177");
        }__CLR4_2_08qf8qflnxz233t.R.inc(15556);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15557);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15558);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15559);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15560);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(15561);int int7 = element4.childNodeSize();
        __CLR4_2_08qf8qflnxz233t.R.inc(15562);java.lang.String str8 = element4.wholeText();
        __CLR4_2_08qf8qflnxz233t.R.inc(15563);org.jsoup.select.Elements elements10 = element4.getElementsByClass("<hi! class=\"\"></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(15564);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(15565);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(15566);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15567);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(15568);org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(15569);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15570);org.junit.Assert.assertNotNull(elements10);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test178() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),15571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_06a866fc0j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test178",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),15571,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_06a866fc0j() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(15571);
        __CLR4_2_08qf8qflnxz233t.R.inc(15572);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(15573)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(15574)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(15575);System.out.format("%n%s%n", "RegressionTest0.test178");
        }__CLR4_2_08qf8qflnxz233t.R.inc(15576);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15577);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15578);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(15579);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(15580);org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15581);java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15582);org.jsoup.nodes.Element element9 = element6.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15583);java.lang.String str10 = element9.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15584);org.jsoup.nodes.Element element12 = element9.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15585);java.lang.String str13 = element9.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15586);org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15587);java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15588);org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        __CLR4_2_08qf8qflnxz233t.R.inc(15589);org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(15590);int int20 = element18.elementSiblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(15591);org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(15592);org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15593);java.util.List<org.jsoup.nodes.TextNode> textNodeList24 = element23.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15594);org.jsoup.nodes.Element element26 = element23.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15595);java.lang.String str27 = element26.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15596);org.jsoup.select.Elements elements28 = element26.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(15597);org.jsoup.nodes.Element element30 = element26.toggleClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15598);org.jsoup.nodes.Element element31 = element30.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15599);org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15600);java.util.List<org.jsoup.nodes.TextNode> textNodeList34 = element33.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15601);org.jsoup.nodes.Element element35 = element33.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(15602);java.lang.String str36 = element33.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(15603);org.jsoup.nodes.Element element37 = element33.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(15604);java.util.regex.Pattern pattern39 = null;
        __CLR4_2_08qf8qflnxz233t.R.inc(15605);org.jsoup.select.Elements elements40 = element33.getElementsByAttributeValueMatching("hi!", pattern39);
        __CLR4_2_08qf8qflnxz233t.R.inc(15606);boolean boolean41 = element31.equals((java.lang.Object) pattern39);
        __CLR4_2_08qf8qflnxz233t.R.inc(15607);org.jsoup.nodes.Element element42 = element18.after((org.jsoup.nodes.Node) element31);
        __CLR4_2_08qf8qflnxz233t.R.inc(15608);org.jsoup.select.Elements elements44 = element42.getElementsByAttributeStarting("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15609);boolean boolean45 = element42.isBlock();
        __CLR4_2_08qf8qflnxz233t.R.inc(15610);boolean boolean47 = element42.hasAttr("<hi!></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(15611);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(15612);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(15613);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15614);org.junit.Assert.assertNotNull(textNodeList7);
        __CLR4_2_08qf8qflnxz233t.R.inc(15615);org.junit.Assert.assertNotNull(element9);
        __CLR4_2_08qf8qflnxz233t.R.inc(15616);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15617);org.junit.Assert.assertNotNull(element12);
        __CLR4_2_08qf8qflnxz233t.R.inc(15618);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15619);org.junit.Assert.assertNotNull(textNodeList17);
        __CLR4_2_08qf8qflnxz233t.R.inc(15620);org.junit.Assert.assertNotNull(element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(15621);org.junit.Assert.assertNull(element19);
        __CLR4_2_08qf8qflnxz233t.R.inc(15622);org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(15623);org.junit.Assert.assertNotNull(element21);
        __CLR4_2_08qf8qflnxz233t.R.inc(15624);org.junit.Assert.assertNotNull(textNodeList24);
        __CLR4_2_08qf8qflnxz233t.R.inc(15625);org.junit.Assert.assertNotNull(element26);
        __CLR4_2_08qf8qflnxz233t.R.inc(15626);org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15627);org.junit.Assert.assertNotNull(elements28);
        __CLR4_2_08qf8qflnxz233t.R.inc(15628);org.junit.Assert.assertNotNull(element30);
        __CLR4_2_08qf8qflnxz233t.R.inc(15629);org.junit.Assert.assertNotNull(element31);
        __CLR4_2_08qf8qflnxz233t.R.inc(15630);org.junit.Assert.assertNotNull(textNodeList34);
        __CLR4_2_08qf8qflnxz233t.R.inc(15631);org.junit.Assert.assertNull(element35);
        __CLR4_2_08qf8qflnxz233t.R.inc(15632);org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15633);org.junit.Assert.assertNotNull(element37);
        __CLR4_2_08qf8qflnxz233t.R.inc(15634);org.junit.Assert.assertNotNull(elements40);
        __CLR4_2_08qf8qflnxz233t.R.inc(15635);org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(15636);org.junit.Assert.assertNotNull(element42);
        __CLR4_2_08qf8qflnxz233t.R.inc(15637);org.junit.Assert.assertNotNull(elements44);
        __CLR4_2_08qf8qflnxz233t.R.inc(15638);org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(15639);org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test179() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),15640);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_09j84ywc2g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test179",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),15640,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_09j84ywc2g() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(15640);
        __CLR4_2_08qf8qflnxz233t.R.inc(15641);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(15642)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(15643)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(15644);System.out.format("%n%s%n", "RegressionTest0.test179");
        }__CLR4_2_08qf8qflnxz233t.R.inc(15645);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15646);java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        __CLR4_2_08qf8qflnxz233t.R.inc(15647);java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        __CLR4_2_08qf8qflnxz233t.R.inc(15648);boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        __CLR4_2_08qf8qflnxz233t.R.inc(15649);org.jsoup.nodes.Element element7 = element1.classNames((java.util.Set<java.lang.String>) strSet5);
        __CLR4_2_08qf8qflnxz233t.R.inc(15650);org.jsoup.nodes.Element element10 = element1.attr("<hi!></hi!>", "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15651);java.lang.String str11 = element10.toString();
        __CLR4_2_08qf8qflnxz233t.R.inc(15652);org.jsoup.select.Elements elements13 = element10.getElementsByTag("<hi!></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(15653);org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15654);java.util.List<org.jsoup.nodes.TextNode> textNodeList16 = element15.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15655);org.jsoup.nodes.Element element18 = element15.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15656);java.lang.String str19 = element18.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15657);org.jsoup.select.Elements elements20 = element18.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(15658);org.jsoup.nodes.Element element22 = element18.toggleClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15659);org.jsoup.nodes.Element element23 = element10.appendTo(element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(15660);org.jsoup.select.Elements elements25 = element18.getElementsByAttribute("<hi!></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(15661);org.jsoup.select.NodeFilter nodeFilter26 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(15662);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(15663);org.jsoup.nodes.Element element27 = element18.filter(nodeFilter26);
            __CLR4_2_08qf8qflnxz233t.R.inc(15664);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(15665);org.junit.Assert.assertNotNull(strArray4);
        __CLR4_2_08qf8qflnxz233t.R.inc(15666);org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        __CLR4_2_08qf8qflnxz233t.R.inc(15667);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(15668);org.junit.Assert.assertNotNull(element10);
        __CLR4_2_08qf8qflnxz233t.R.inc(15669);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>" + "'", str11, "<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(15670);org.junit.Assert.assertNotNull(elements13);
        __CLR4_2_08qf8qflnxz233t.R.inc(15671);org.junit.Assert.assertNotNull(textNodeList16);
        __CLR4_2_08qf8qflnxz233t.R.inc(15672);org.junit.Assert.assertNotNull(element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(15673);org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15674);org.junit.Assert.assertNotNull(elements20);
        __CLR4_2_08qf8qflnxz233t.R.inc(15675);org.junit.Assert.assertNotNull(element22);
        __CLR4_2_08qf8qflnxz233t.R.inc(15676);org.junit.Assert.assertNotNull(element23);
        __CLR4_2_08qf8qflnxz233t.R.inc(15677);org.junit.Assert.assertNotNull(elements25);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test180() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),15678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0a03ce6c3i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test180",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),15678,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0a03ce6c3i() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(15678);
        __CLR4_2_08qf8qflnxz233t.R.inc(15679);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(15680)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(15681)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(15682);System.out.format("%n%s%n", "RegressionTest0.test180");
        }__CLR4_2_08qf8qflnxz233t.R.inc(15683);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!>\n hi!\n</hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(15684);org.jsoup.nodes.Element element3 = element1.removeAttr("<hi!></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(15685);org.jsoup.select.Elements elements4 = element1.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(15686);org.junit.Assert.assertNotNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(15687);org.junit.Assert.assertNotNull(elements4);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test181() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),15688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0d93b6nc3s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test181",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),15688,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0d93b6nc3s() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(15688);
        __CLR4_2_08qf8qflnxz233t.R.inc(15689);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(15690)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(15691)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(15692);System.out.format("%n%s%n", "RegressionTest0.test181");
        }__CLR4_2_08qf8qflnxz233t.R.inc(15693);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15694);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15695);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15696);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15697);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15698);java.lang.String str8 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15699);org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15700);java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15701);org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(15702);java.lang.String str14 = element4.val();
        __CLR4_2_08qf8qflnxz233t.R.inc(15703);org.jsoup.select.Elements elements16 = element4.getElementsByIndexLessThan((int) (short) 100);
        __CLR4_2_08qf8qflnxz233t.R.inc(15704);org.jsoup.select.Elements elements19 = element4.getElementsByAttributeValueStarting("<hi! class=\"\"></hi!>", "<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(15705);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(15706);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(15707);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15708);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(15709);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15710);org.junit.Assert.assertNotNull(textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(15711);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(15712);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15713);org.junit.Assert.assertNotNull(elements16);
        __CLR4_2_08qf8qflnxz233t.R.inc(15714);org.junit.Assert.assertNotNull(elements19);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test182() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),15715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0gi39z4c4j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test182",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),15715,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0gi39z4c4j() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(15715);
        __CLR4_2_08qf8qflnxz233t.R.inc(15716);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(15717)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(15718)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(15719);System.out.format("%n%s%n", "RegressionTest0.test182");
        }__CLR4_2_08qf8qflnxz233t.R.inc(15720);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15721);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15722);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15723);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15724);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15725);java.lang.String str8 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15726);org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15727);java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15728);org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(15729);java.lang.String str14 = element4.val();
        __CLR4_2_08qf8qflnxz233t.R.inc(15730);org.jsoup.nodes.Element element15 = element4.empty();
        __CLR4_2_08qf8qflnxz233t.R.inc(15731);java.lang.String str16 = element15.ownText();
        __CLR4_2_08qf8qflnxz233t.R.inc(15732);java.lang.String str17 = element15.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(15733);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(15734);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(15735);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15736);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(15737);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15738);org.junit.Assert.assertNotNull(textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(15739);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(15740);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15741);org.junit.Assert.assertNotNull(element15);
        __CLR4_2_08qf8qflnxz233t.R.inc(15742);org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15743);org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test183() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),15744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0jr38rlc5c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test183",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),15744,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0jr38rlc5c() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(15744);
        __CLR4_2_08qf8qflnxz233t.R.inc(15745);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(15746)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(15747)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(15748);System.out.format("%n%s%n", "RegressionTest0.test183");
        }__CLR4_2_08qf8qflnxz233t.R.inc(15749);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15750);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15751);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15752);org.jsoup.nodes.Element element5 = element1.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15753);java.lang.String str6 = element5.id();
        __CLR4_2_08qf8qflnxz233t.R.inc(15754);org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15755);java.util.List<org.jsoup.nodes.TextNode> textNodeList9 = element8.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15756);org.jsoup.nodes.Element element11 = element8.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15757);java.lang.String str12 = element11.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15758);org.jsoup.nodes.Element element14 = element11.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15759);java.lang.String str15 = element11.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15760);org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15761);java.util.List<org.jsoup.nodes.TextNode> textNodeList19 = element18.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15762);org.jsoup.nodes.Element element20 = element11.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList19);
        __CLR4_2_08qf8qflnxz233t.R.inc(15763);java.lang.String str21 = element11.val();
        __CLR4_2_08qf8qflnxz233t.R.inc(15764);org.jsoup.select.Elements elements22 = element11.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(15765);org.jsoup.nodes.Element element23 = element5.appendTo(element11);
        __CLR4_2_08qf8qflnxz233t.R.inc(15766);org.jsoup.nodes.Element element25 = element11.removeAttr("<hi!>\n hi!\n</hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(15767);org.jsoup.nodes.Element element26 = element11.root();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(15768);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(15769);org.jsoup.select.Elements elements29 = element11.getElementsByAttributeValueStarting("<hi! class=\"\"></hi!>", "");
            __CLR4_2_08qf8qflnxz233t.R.inc(15770);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(15771);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(15772);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(15773);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(15774);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15775);org.junit.Assert.assertNotNull(textNodeList9);
        __CLR4_2_08qf8qflnxz233t.R.inc(15776);org.junit.Assert.assertNotNull(element11);
        __CLR4_2_08qf8qflnxz233t.R.inc(15777);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15778);org.junit.Assert.assertNotNull(element14);
        __CLR4_2_08qf8qflnxz233t.R.inc(15779);org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15780);org.junit.Assert.assertNotNull(textNodeList19);
        __CLR4_2_08qf8qflnxz233t.R.inc(15781);org.junit.Assert.assertNotNull(element20);
        __CLR4_2_08qf8qflnxz233t.R.inc(15782);org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15783);org.junit.Assert.assertNotNull(elements22);
        __CLR4_2_08qf8qflnxz233t.R.inc(15784);org.junit.Assert.assertNotNull(element23);
        __CLR4_2_08qf8qflnxz233t.R.inc(15785);org.junit.Assert.assertNotNull(element25);
        __CLR4_2_08qf8qflnxz233t.R.inc(15786);org.junit.Assert.assertNotNull(element26);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test184() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),15787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0n037k2c6j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test184",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),15787,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0n037k2c6j() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(15787);
        __CLR4_2_08qf8qflnxz233t.R.inc(15788);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(15789)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(15790)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(15791);System.out.format("%n%s%n", "RegressionTest0.test184");
        }__CLR4_2_08qf8qflnxz233t.R.inc(15792);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15793);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15794);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15795);org.jsoup.nodes.Element element5 = element1.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15796);java.lang.String str6 = element5.id();
        __CLR4_2_08qf8qflnxz233t.R.inc(15797);int int7 = element5.childNodeSize();
        __CLR4_2_08qf8qflnxz233t.R.inc(15798);org.jsoup.select.Elements elements9 = element5.getElementsByAttributeStarting("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(15799);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(15800);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(15801);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(15802);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15803);org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(15804);org.junit.Assert.assertNotNull(elements9);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test185() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),15805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0q936cjc71();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test185",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),15805,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0q936cjc71() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(15805);
        __CLR4_2_08qf8qflnxz233t.R.inc(15806);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(15807)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(15808)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(15809);System.out.format("%n%s%n", "RegressionTest0.test185");
        }__CLR4_2_08qf8qflnxz233t.R.inc(15810);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15811);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15812);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15813);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15814);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(15815);int int7 = element4.childNodeSize();
        __CLR4_2_08qf8qflnxz233t.R.inc(15816);java.lang.String str8 = element4.wholeText();
        __CLR4_2_08qf8qflnxz233t.R.inc(15817);org.jsoup.nodes.Element element10 = element4.appendText("<hi!>\n hi!\n</hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(15818);boolean boolean12 = element10.hasAttr("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15819);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(15820);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(15821);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15822);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(15823);org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(15824);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15825);org.junit.Assert.assertNotNull(element10);
        __CLR4_2_08qf8qflnxz233t.R.inc(15826);org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test186() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),15827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ti3550c7n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test186",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),15827,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ti3550c7n() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(15827);
        __CLR4_2_08qf8qflnxz233t.R.inc(15828);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(15829)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(15830)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(15831);System.out.format("%n%s%n", "RegressionTest0.test186");
        }__CLR4_2_08qf8qflnxz233t.R.inc(15832);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15833);java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        __CLR4_2_08qf8qflnxz233t.R.inc(15834);java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        __CLR4_2_08qf8qflnxz233t.R.inc(15835);boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        __CLR4_2_08qf8qflnxz233t.R.inc(15836);org.jsoup.nodes.Element element7 = element1.classNames((java.util.Set<java.lang.String>) strSet5);
        __CLR4_2_08qf8qflnxz233t.R.inc(15837);org.jsoup.nodes.Element element10 = element1.attr("<hi!></hi!>", "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15838);java.lang.String str11 = element10.toString();
        __CLR4_2_08qf8qflnxz233t.R.inc(15839);org.jsoup.select.Elements elements13 = element10.getElementsByTag("<hi!></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(15840);org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15841);java.util.List<org.jsoup.nodes.TextNode> textNodeList16 = element15.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15842);org.jsoup.nodes.Element element18 = element15.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15843);java.lang.String str19 = element18.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15844);org.jsoup.select.Elements elements20 = element18.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(15845);org.jsoup.nodes.Element element22 = element18.toggleClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15846);org.jsoup.nodes.Element element23 = element10.appendTo(element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(15847);org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15848);java.util.List<org.jsoup.nodes.TextNode> textNodeList26 = element25.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15849);org.jsoup.nodes.Node node27 = element25.previousSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(15850);java.lang.String str28 = element25.id();
        __CLR4_2_08qf8qflnxz233t.R.inc(15851);org.jsoup.nodes.Element element30 = element25.removeClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15852);org.jsoup.nodes.Element element31 = element30.empty();
        __CLR4_2_08qf8qflnxz233t.R.inc(15853);boolean boolean32 = element18.hasSameValue((java.lang.Object) element31);
        __CLR4_2_08qf8qflnxz233t.R.inc(15854);org.junit.Assert.assertNotNull(strArray4);
        __CLR4_2_08qf8qflnxz233t.R.inc(15855);org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        __CLR4_2_08qf8qflnxz233t.R.inc(15856);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(15857);org.junit.Assert.assertNotNull(element10);
        __CLR4_2_08qf8qflnxz233t.R.inc(15858);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>" + "'", str11, "<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(15859);org.junit.Assert.assertNotNull(elements13);
        __CLR4_2_08qf8qflnxz233t.R.inc(15860);org.junit.Assert.assertNotNull(textNodeList16);
        __CLR4_2_08qf8qflnxz233t.R.inc(15861);org.junit.Assert.assertNotNull(element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(15862);org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15863);org.junit.Assert.assertNotNull(elements20);
        __CLR4_2_08qf8qflnxz233t.R.inc(15864);org.junit.Assert.assertNotNull(element22);
        __CLR4_2_08qf8qflnxz233t.R.inc(15865);org.junit.Assert.assertNotNull(element23);
        __CLR4_2_08qf8qflnxz233t.R.inc(15866);org.junit.Assert.assertNotNull(textNodeList26);
        __CLR4_2_08qf8qflnxz233t.R.inc(15867);org.junit.Assert.assertNull(node27);
        __CLR4_2_08qf8qflnxz233t.R.inc(15868);org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15869);org.junit.Assert.assertNotNull(element30);
        __CLR4_2_08qf8qflnxz233t.R.inc(15870);org.junit.Assert.assertNotNull(element31);
        __CLR4_2_08qf8qflnxz233t.R.inc(15871);org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test187() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),15872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0wr33xhc8w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test187",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),15872,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0wr33xhc8w() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(15872);
        __CLR4_2_08qf8qflnxz233t.R.inc(15873);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(15874)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(15875)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(15876);System.out.format("%n%s%n", "RegressionTest0.test187");
        }__CLR4_2_08qf8qflnxz233t.R.inc(15877);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15878);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15879);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15880);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15881);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15882);java.lang.String str8 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15883);org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15884);java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15885);org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(15886);java.lang.String str14 = element4.val();
        __CLR4_2_08qf8qflnxz233t.R.inc(15887);org.jsoup.nodes.Element element15 = element4.empty();
        __CLR4_2_08qf8qflnxz233t.R.inc(15888);org.jsoup.nodes.Element element17 = element15.html("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15889);java.util.Map<java.lang.String, java.lang.String> strMap18 = element15.dataset();
        __CLR4_2_08qf8qflnxz233t.R.inc(15890);org.jsoup.select.Elements elements20 = element15.getElementsByIndexGreaterThan((int) (short) 10);
        __CLR4_2_08qf8qflnxz233t.R.inc(15891);java.lang.String str21 = element15.baseUri();
        __CLR4_2_08qf8qflnxz233t.R.inc(15892);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(15893);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(15894);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15895);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(15896);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15897);org.junit.Assert.assertNotNull(textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(15898);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(15899);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15900);org.junit.Assert.assertNotNull(element15);
        __CLR4_2_08qf8qflnxz233t.R.inc(15901);org.junit.Assert.assertNotNull(element17);
        __CLR4_2_08qf8qflnxz233t.R.inc(15902);org.junit.Assert.assertNotNull(strMap18);
        __CLR4_2_08qf8qflnxz233t.R.inc(15903);org.junit.Assert.assertNotNull(elements20);
        __CLR4_2_08qf8qflnxz233t.R.inc(15904);org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test188() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),15905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0z10z96c9t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test188",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),15905,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0z10z96c9t() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(15905);
        __CLR4_2_08qf8qflnxz233t.R.inc(15906);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(15907)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(15908)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(15909);System.out.format("%n%s%n", "RegressionTest0.test188");
        }__CLR4_2_08qf8qflnxz233t.R.inc(15910);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15911);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15912);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15913);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15914);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15915);org.jsoup.nodes.Element element8 = element7.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15916);org.jsoup.parser.Tag tag9 = element8.tag();
        __CLR4_2_08qf8qflnxz233t.R.inc(15917);org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element(tag9, "hi!.hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15918);org.jsoup.nodes.Node node12 = element11.previousSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(15919);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(15920);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(15921);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15922);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(15923);org.junit.Assert.assertNotNull(element8);
        __CLR4_2_08qf8qflnxz233t.R.inc(15924);org.junit.Assert.assertNotNull(tag9);
        __CLR4_2_08qf8qflnxz233t.R.inc(15925);org.junit.Assert.assertNull(node12);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test189() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),15926);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0vs10gpcae();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test189",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),15926,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0vs10gpcae() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(15926);
        __CLR4_2_08qf8qflnxz233t.R.inc(15927);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(15928)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(15929)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(15930);System.out.format("%n%s%n", "RegressionTest0.test189");
        }__CLR4_2_08qf8qflnxz233t.R.inc(15931);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15932);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15933);org.jsoup.nodes.Element element4 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15934);org.jsoup.nodes.Element element6 = element4.appendText("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15935);org.jsoup.nodes.Element element7 = element1.appendChild((org.jsoup.nodes.Node) element6);
        __CLR4_2_08qf8qflnxz233t.R.inc(15936);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(15937);org.junit.Assert.assertNotNull(element6);
        __CLR4_2_08qf8qflnxz233t.R.inc(15938);org.junit.Assert.assertNotNull(element7);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test190() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),15939);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0vb5t1fcar();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test190",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),15939,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0vb5t1fcar() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(15939);
        __CLR4_2_08qf8qflnxz233t.R.inc(15940);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(15941)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(15942)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(15943);System.out.format("%n%s%n", "RegressionTest0.test190");
        }__CLR4_2_08qf8qflnxz233t.R.inc(15944);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15945);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15946);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15947);org.jsoup.nodes.Element element5 = element1.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15948);java.lang.String str6 = element5.id();
        __CLR4_2_08qf8qflnxz233t.R.inc(15949);java.util.List<org.jsoup.nodes.Node> nodeList7 = element5.siblingNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15950);org.jsoup.nodes.Element element9 = element5.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15951);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(15952);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(15953);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(15954);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15955);org.junit.Assert.assertNotNull(nodeList7);
        __CLR4_2_08qf8qflnxz233t.R.inc(15956);org.junit.Assert.assertNotNull(element9);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test191() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),15957);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0s25u8ycb9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test191",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),15957,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0s25u8ycb9() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(15957);
        __CLR4_2_08qf8qflnxz233t.R.inc(15958);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(15959)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(15960)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(15961);System.out.format("%n%s%n", "RegressionTest0.test191");
        }__CLR4_2_08qf8qflnxz233t.R.inc(15962);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15963);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15964);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15965);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15966);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(15967);java.lang.String str8 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(15968);org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15969);java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15970);org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(15971);java.lang.String str14 = element4.val();
        __CLR4_2_08qf8qflnxz233t.R.inc(15972);org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15973);java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(15974);org.jsoup.nodes.Element element18 = element16.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(15975);java.lang.String str19 = element16.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(15976);org.jsoup.nodes.Element element20 = element16.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(15977);org.jsoup.nodes.Element element22 = element16.addClass("<hi!></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(15978);boolean boolean24 = element16.hasAttr("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15979);org.jsoup.nodes.Element element25 = element4.appendTo(element16);
        __CLR4_2_08qf8qflnxz233t.R.inc(15980);java.lang.String str26 = element16.ownText();
        __CLR4_2_08qf8qflnxz233t.R.inc(15981);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(15982);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(15983);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15984);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(15985);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15986);org.junit.Assert.assertNotNull(textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(15987);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(15988);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(15989);org.junit.Assert.assertNotNull(textNodeList17);
        __CLR4_2_08qf8qflnxz233t.R.inc(15990);org.junit.Assert.assertNull(element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(15991);org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(15992);org.junit.Assert.assertNotNull(element20);
        __CLR4_2_08qf8qflnxz233t.R.inc(15993);org.junit.Assert.assertNotNull(element22);
        __CLR4_2_08qf8qflnxz233t.R.inc(15994);org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(15995);org.junit.Assert.assertNotNull(element25);
        __CLR4_2_08qf8qflnxz233t.R.inc(15996);org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test192() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),15997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ot5vghccd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test192",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),15997,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ot5vghccd() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(15997);
        __CLR4_2_08qf8qflnxz233t.R.inc(15998);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(15999)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(16000)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(16001);System.out.format("%n%s%n", "RegressionTest0.test192");
        }__CLR4_2_08qf8qflnxz233t.R.inc(16002);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(16003);org.jsoup.nodes.Element element4 = element1.attr("", "hi!.hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16004);org.jsoup.nodes.Element element6 = element1.toggleClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16005);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(16006);org.junit.Assert.assertNotNull(element6);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test193() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),16007);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0lk5wo0ccn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test193",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),16007,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0lk5wo0ccn() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(16007);
        __CLR4_2_08qf8qflnxz233t.R.inc(16008);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(16009)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(16010)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(16011);System.out.format("%n%s%n", "RegressionTest0.test193");
        }__CLR4_2_08qf8qflnxz233t.R.inc(16012);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16013);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16014);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16015);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(16016);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16017);boolean boolean9 = element4.hasAttr("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16018);org.jsoup.nodes.Element element10 = element4.root();
        __CLR4_2_08qf8qflnxz233t.R.inc(16019);java.lang.String str11 = element10.data();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(16020);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(16021);org.jsoup.select.Elements elements13 = element10.select("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
            __CLR4_2_08qf8qflnxz233t.R.inc(16022);org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>': unexpected token at '<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(16023);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(16024);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(16025);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16026);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(16027);org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(16028);org.junit.Assert.assertNotNull(element10);
        __CLR4_2_08qf8qflnxz233t.R.inc(16029);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test194() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),16030);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ib5xvjcda();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test194",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),16030,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ib5xvjcda() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(16030);
        __CLR4_2_08qf8qflnxz233t.R.inc(16031);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(16032)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(16033)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(16034);System.out.format("%n%s%n", "RegressionTest0.test194");
        }__CLR4_2_08qf8qflnxz233t.R.inc(16035);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16036);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16037);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16038);org.jsoup.nodes.Element element5 = element1.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16039);java.lang.String str6 = element5.id();
        __CLR4_2_08qf8qflnxz233t.R.inc(16040);org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16041);java.util.List<org.jsoup.nodes.TextNode> textNodeList9 = element8.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16042);org.jsoup.nodes.Element element11 = element8.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16043);java.lang.String str12 = element11.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(16044);org.jsoup.nodes.Element element14 = element11.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16045);java.lang.String str15 = element11.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(16046);org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16047);java.util.List<org.jsoup.nodes.TextNode> textNodeList19 = element18.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16048);org.jsoup.nodes.Element element20 = element11.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList19);
        __CLR4_2_08qf8qflnxz233t.R.inc(16049);java.lang.String str21 = element11.val();
        __CLR4_2_08qf8qflnxz233t.R.inc(16050);org.jsoup.select.Elements elements22 = element11.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(16051);org.jsoup.nodes.Element element23 = element5.appendTo(element11);
        __CLR4_2_08qf8qflnxz233t.R.inc(16052);org.jsoup.nodes.Element element25 = element11.removeAttr("<hi!>\n hi!\n</hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(16053);org.jsoup.nodes.Element element26 = element11.root();
        __CLR4_2_08qf8qflnxz233t.R.inc(16054);java.lang.String str27 = element26.data();
        __CLR4_2_08qf8qflnxz233t.R.inc(16055);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(16056);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(16057);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(16058);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16059);org.junit.Assert.assertNotNull(textNodeList9);
        __CLR4_2_08qf8qflnxz233t.R.inc(16060);org.junit.Assert.assertNotNull(element11);
        __CLR4_2_08qf8qflnxz233t.R.inc(16061);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16062);org.junit.Assert.assertNotNull(element14);
        __CLR4_2_08qf8qflnxz233t.R.inc(16063);org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16064);org.junit.Assert.assertNotNull(textNodeList19);
        __CLR4_2_08qf8qflnxz233t.R.inc(16065);org.junit.Assert.assertNotNull(element20);
        __CLR4_2_08qf8qflnxz233t.R.inc(16066);org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16067);org.junit.Assert.assertNotNull(elements22);
        __CLR4_2_08qf8qflnxz233t.R.inc(16068);org.junit.Assert.assertNotNull(element23);
        __CLR4_2_08qf8qflnxz233t.R.inc(16069);org.junit.Assert.assertNotNull(element25);
        __CLR4_2_08qf8qflnxz233t.R.inc(16070);org.junit.Assert.assertNotNull(element26);
        __CLR4_2_08qf8qflnxz233t.R.inc(16071);org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test195() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),16072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0f25z32ceg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test195",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),16072,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0f25z32ceg() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(16072);
        __CLR4_2_08qf8qflnxz233t.R.inc(16073);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(16074)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(16075)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(16076);System.out.format("%n%s%n", "RegressionTest0.test195");
        }__CLR4_2_08qf8qflnxz233t.R.inc(16077);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16078);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16079);org.jsoup.nodes.Element element3 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(16080);org.jsoup.select.Elements elements5 = element3.getElementsByClass("<hi!>\n hi!\n</hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(16081);org.jsoup.select.Elements elements7 = element3.getElementsByTag("<hi!></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(16082);java.lang.String str8 = element3.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(16083);java.util.Set<java.lang.String> strSet9 = element3.classNames();
        __CLR4_2_08qf8qflnxz233t.R.inc(16084);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(16085);org.junit.Assert.assertNotNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(16086);org.junit.Assert.assertNotNull(elements5);
        __CLR4_2_08qf8qflnxz233t.R.inc(16087);org.junit.Assert.assertNotNull(elements7);
        __CLR4_2_08qf8qflnxz233t.R.inc(16088);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16089);org.junit.Assert.assertNotNull(strSet9);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test196() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),16090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0bt60alcey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test196",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),16090,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0bt60alcey() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(16090);
        __CLR4_2_08qf8qflnxz233t.R.inc(16091);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(16092)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(16093)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(16094);System.out.format("%n%s%n", "RegressionTest0.test196");
        }__CLR4_2_08qf8qflnxz233t.R.inc(16095);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16096);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16097);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(16098);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(16099);org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16100);java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16101);org.jsoup.nodes.Element element9 = element6.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16102);java.lang.String str10 = element9.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(16103);org.jsoup.nodes.Element element12 = element9.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16104);java.lang.String str13 = element9.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(16105);org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16106);java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16107);org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        __CLR4_2_08qf8qflnxz233t.R.inc(16108);org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(16109);int int20 = element18.elementSiblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(16110);org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(16111);java.util.List<org.jsoup.nodes.Node> nodeList22 = element21.childNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16112);org.jsoup.nodes.Element element23 = element21.empty();
        __CLR4_2_08qf8qflnxz233t.R.inc(16113);org.jsoup.nodes.Node[] nodeArray25 = new org.jsoup.nodes.Node[] {};
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(16114);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(16115);org.jsoup.nodes.Element element26 = element23.insertChildren((int) (short) 100, nodeArray25);
            __CLR4_2_08qf8qflnxz233t.R.inc(16116);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(16117);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(16118);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(16119);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16120);org.junit.Assert.assertNotNull(textNodeList7);
        __CLR4_2_08qf8qflnxz233t.R.inc(16121);org.junit.Assert.assertNotNull(element9);
        __CLR4_2_08qf8qflnxz233t.R.inc(16122);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16123);org.junit.Assert.assertNotNull(element12);
        __CLR4_2_08qf8qflnxz233t.R.inc(16124);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16125);org.junit.Assert.assertNotNull(textNodeList17);
        __CLR4_2_08qf8qflnxz233t.R.inc(16126);org.junit.Assert.assertNotNull(element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(16127);org.junit.Assert.assertNull(element19);
        __CLR4_2_08qf8qflnxz233t.R.inc(16128);org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(16129);org.junit.Assert.assertNotNull(element21);
        __CLR4_2_08qf8qflnxz233t.R.inc(16130);org.junit.Assert.assertNotNull(nodeList22);
        __CLR4_2_08qf8qflnxz233t.R.inc(16131);org.junit.Assert.assertNotNull(element23);
        __CLR4_2_08qf8qflnxz233t.R.inc(16132);org.junit.Assert.assertNotNull(nodeArray25);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test197() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),16133);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_08k61i4cg5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test197",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),16133,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_08k61i4cg5() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(16133);
        __CLR4_2_08qf8qflnxz233t.R.inc(16134);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(16135)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(16136)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(16137);System.out.format("%n%s%n", "RegressionTest0.test197");
        }__CLR4_2_08qf8qflnxz233t.R.inc(16138);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16139);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16140);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(16141);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(16142);org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16143);java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16144);org.jsoup.nodes.Element element9 = element6.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16145);java.lang.String str10 = element9.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(16146);org.jsoup.nodes.Element element12 = element9.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16147);java.lang.String str13 = element9.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(16148);org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16149);java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16150);org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        __CLR4_2_08qf8qflnxz233t.R.inc(16151);org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(16152);int int20 = element18.elementSiblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(16153);org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(16154);org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16155);java.util.List<org.jsoup.nodes.TextNode> textNodeList24 = element23.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16156);org.jsoup.nodes.Element element26 = element23.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16157);java.lang.String str27 = element26.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(16158);org.jsoup.select.Elements elements28 = element26.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(16159);org.jsoup.nodes.Element element30 = element26.toggleClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16160);org.jsoup.nodes.Element element31 = element30.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16161);org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16162);java.util.List<org.jsoup.nodes.TextNode> textNodeList34 = element33.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16163);org.jsoup.nodes.Element element35 = element33.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(16164);java.lang.String str36 = element33.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(16165);org.jsoup.nodes.Element element37 = element33.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(16166);java.util.regex.Pattern pattern39 = null;
        __CLR4_2_08qf8qflnxz233t.R.inc(16167);org.jsoup.select.Elements elements40 = element33.getElementsByAttributeValueMatching("hi!", pattern39);
        __CLR4_2_08qf8qflnxz233t.R.inc(16168);boolean boolean41 = element31.equals((java.lang.Object) pattern39);
        __CLR4_2_08qf8qflnxz233t.R.inc(16169);org.jsoup.nodes.Element element42 = element18.after((org.jsoup.nodes.Node) element31);
        __CLR4_2_08qf8qflnxz233t.R.inc(16170);org.jsoup.select.Elements elements44 = element42.getElementsByAttributeStarting("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16171);boolean boolean45 = element42.isBlock();
        __CLR4_2_08qf8qflnxz233t.R.inc(16172);org.jsoup.select.Elements elements48 = element42.getElementsByAttributeValueStarting("<hi!>\n hi!\n</hi!>", "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16173);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(16174);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(16175);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16176);org.junit.Assert.assertNotNull(textNodeList7);
        __CLR4_2_08qf8qflnxz233t.R.inc(16177);org.junit.Assert.assertNotNull(element9);
        __CLR4_2_08qf8qflnxz233t.R.inc(16178);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16179);org.junit.Assert.assertNotNull(element12);
        __CLR4_2_08qf8qflnxz233t.R.inc(16180);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16181);org.junit.Assert.assertNotNull(textNodeList17);
        __CLR4_2_08qf8qflnxz233t.R.inc(16182);org.junit.Assert.assertNotNull(element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(16183);org.junit.Assert.assertNull(element19);
        __CLR4_2_08qf8qflnxz233t.R.inc(16184);org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(16185);org.junit.Assert.assertNotNull(element21);
        __CLR4_2_08qf8qflnxz233t.R.inc(16186);org.junit.Assert.assertNotNull(textNodeList24);
        __CLR4_2_08qf8qflnxz233t.R.inc(16187);org.junit.Assert.assertNotNull(element26);
        __CLR4_2_08qf8qflnxz233t.R.inc(16188);org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16189);org.junit.Assert.assertNotNull(elements28);
        __CLR4_2_08qf8qflnxz233t.R.inc(16190);org.junit.Assert.assertNotNull(element30);
        __CLR4_2_08qf8qflnxz233t.R.inc(16191);org.junit.Assert.assertNotNull(element31);
        __CLR4_2_08qf8qflnxz233t.R.inc(16192);org.junit.Assert.assertNotNull(textNodeList34);
        __CLR4_2_08qf8qflnxz233t.R.inc(16193);org.junit.Assert.assertNull(element35);
        __CLR4_2_08qf8qflnxz233t.R.inc(16194);org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16195);org.junit.Assert.assertNotNull(element37);
        __CLR4_2_08qf8qflnxz233t.R.inc(16196);org.junit.Assert.assertNotNull(elements40);
        __CLR4_2_08qf8qflnxz233t.R.inc(16197);org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(16198);org.junit.Assert.assertNotNull(element42);
        __CLR4_2_08qf8qflnxz233t.R.inc(16199);org.junit.Assert.assertNotNull(elements44);
        __CLR4_2_08qf8qflnxz233t.R.inc(16200);org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(16201);org.junit.Assert.assertNotNull(elements48);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test198() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),16202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_05b62pnci2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test198",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),16202,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_05b62pnci2() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(16202);
        __CLR4_2_08qf8qflnxz233t.R.inc(16203);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(16204)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(16205)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(16206);System.out.format("%n%s%n", "RegressionTest0.test198");
        }__CLR4_2_08qf8qflnxz233t.R.inc(16207);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16208);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16209);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16210);org.jsoup.nodes.Element element5 = element1.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16211);java.lang.String str6 = element5.id();
        __CLR4_2_08qf8qflnxz233t.R.inc(16212);org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16213);java.util.List<org.jsoup.nodes.TextNode> textNodeList9 = element8.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16214);org.jsoup.nodes.Element element11 = element8.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16215);java.lang.String str12 = element11.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(16216);org.jsoup.nodes.Element element14 = element11.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16217);java.lang.String str15 = element11.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(16218);org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16219);java.util.List<org.jsoup.nodes.TextNode> textNodeList19 = element18.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16220);org.jsoup.nodes.Element element20 = element11.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList19);
        __CLR4_2_08qf8qflnxz233t.R.inc(16221);java.lang.String str21 = element11.val();
        __CLR4_2_08qf8qflnxz233t.R.inc(16222);org.jsoup.select.Elements elements22 = element11.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(16223);org.jsoup.nodes.Element element23 = element5.appendTo(element11);
        __CLR4_2_08qf8qflnxz233t.R.inc(16224);org.jsoup.nodes.Element element25 = element11.removeAttr("<hi!>\n hi!\n</hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(16225);org.jsoup.nodes.Element element26 = element11.root();
        __CLR4_2_08qf8qflnxz233t.R.inc(16226);org.jsoup.select.Elements elements27 = element26.parents();
        __CLR4_2_08qf8qflnxz233t.R.inc(16227);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(16228);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(16229);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(16230);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16231);org.junit.Assert.assertNotNull(textNodeList9);
        __CLR4_2_08qf8qflnxz233t.R.inc(16232);org.junit.Assert.assertNotNull(element11);
        __CLR4_2_08qf8qflnxz233t.R.inc(16233);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16234);org.junit.Assert.assertNotNull(element14);
        __CLR4_2_08qf8qflnxz233t.R.inc(16235);org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16236);org.junit.Assert.assertNotNull(textNodeList19);
        __CLR4_2_08qf8qflnxz233t.R.inc(16237);org.junit.Assert.assertNotNull(element20);
        __CLR4_2_08qf8qflnxz233t.R.inc(16238);org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16239);org.junit.Assert.assertNotNull(elements22);
        __CLR4_2_08qf8qflnxz233t.R.inc(16240);org.junit.Assert.assertNotNull(element23);
        __CLR4_2_08qf8qflnxz233t.R.inc(16241);org.junit.Assert.assertNotNull(element25);
        __CLR4_2_08qf8qflnxz233t.R.inc(16242);org.junit.Assert.assertNotNull(element26);
        __CLR4_2_08qf8qflnxz233t.R.inc(16243);org.junit.Assert.assertNotNull(elements27);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test199() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),16244);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_02263x6cj8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test199",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),16244,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_02263x6cj8() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(16244);
        __CLR4_2_08qf8qflnxz233t.R.inc(16245);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(16246)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(16247)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(16248);System.out.format("%n%s%n", "RegressionTest0.test199");
        }__CLR4_2_08qf8qflnxz233t.R.inc(16249);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16250);org.jsoup.nodes.Element element3 = element1.appendText("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16251);java.lang.String str4 = element3.wholeText();
        __CLR4_2_08qf8qflnxz233t.R.inc(16252);org.jsoup.nodes.Element element6 = element3.addClass("<hi!></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(16253);org.junit.Assert.assertNotNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(16254);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16255);org.junit.Assert.assertNotNull(element6);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test200() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),16256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0gsaevtcjk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test200",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),16256,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0gsaevtcjk() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(16256);
        __CLR4_2_08qf8qflnxz233t.R.inc(16257);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(16258)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(16259)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(16260);System.out.format("%n%s%n", "RegressionTest0.test200");
        }__CLR4_2_08qf8qflnxz233t.R.inc(16261);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16262);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16263);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16264);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(16265);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(16266);org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16267);org.jsoup.nodes.Element element9 = element8.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16268);boolean boolean11 = element9.hasSameValue((java.lang.Object) "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16269);boolean boolean12 = element9.hasParent();
        __CLR4_2_08qf8qflnxz233t.R.inc(16270);org.jsoup.select.Elements elements14 = element9.getElementsByIndexGreaterThan((int) (short) 10);
        __CLR4_2_08qf8qflnxz233t.R.inc(16271);org.jsoup.nodes.Node node15 = element9.nextSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(16272);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(16273);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(16274);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16275);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(16276);org.junit.Assert.assertNotNull(element8);
        __CLR4_2_08qf8qflnxz233t.R.inc(16277);org.junit.Assert.assertNotNull(element9);
        __CLR4_2_08qf8qflnxz233t.R.inc(16278);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(16279);org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(16280);org.junit.Assert.assertNotNull(elements14);
        __CLR4_2_08qf8qflnxz233t.R.inc(16281);org.junit.Assert.assertNull(node15);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test201() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),16282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0djag3ccka();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test201",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),16282,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0djag3ccka() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(16282);
        __CLR4_2_08qf8qflnxz233t.R.inc(16283);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(16284)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(16285)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(16286);System.out.format("%n%s%n", "RegressionTest0.test201");
        }__CLR4_2_08qf8qflnxz233t.R.inc(16287);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16288);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16289);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16290);org.jsoup.nodes.Element element5 = element1.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16291);java.lang.String str6 = element5.id();
        __CLR4_2_08qf8qflnxz233t.R.inc(16292);org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16293);java.util.List<org.jsoup.nodes.TextNode> textNodeList9 = element8.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16294);org.jsoup.nodes.Element element11 = element8.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16295);java.lang.String str12 = element11.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(16296);org.jsoup.nodes.Element element14 = element11.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16297);java.lang.String str15 = element11.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(16298);org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16299);java.util.List<org.jsoup.nodes.TextNode> textNodeList19 = element18.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16300);org.jsoup.nodes.Element element20 = element11.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList19);
        __CLR4_2_08qf8qflnxz233t.R.inc(16301);java.lang.String str21 = element11.val();
        __CLR4_2_08qf8qflnxz233t.R.inc(16302);org.jsoup.select.Elements elements22 = element11.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(16303);org.jsoup.nodes.Element element23 = element5.appendTo(element11);
        __CLR4_2_08qf8qflnxz233t.R.inc(16304);org.jsoup.nodes.Element element25 = element11.removeAttr("<hi!>\n hi!\n</hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(16305);java.lang.Class<?> wildcardClass26 = element25.getClass();
        __CLR4_2_08qf8qflnxz233t.R.inc(16306);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(16307);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(16308);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(16309);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16310);org.junit.Assert.assertNotNull(textNodeList9);
        __CLR4_2_08qf8qflnxz233t.R.inc(16311);org.junit.Assert.assertNotNull(element11);
        __CLR4_2_08qf8qflnxz233t.R.inc(16312);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16313);org.junit.Assert.assertNotNull(element14);
        __CLR4_2_08qf8qflnxz233t.R.inc(16314);org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16315);org.junit.Assert.assertNotNull(textNodeList19);
        __CLR4_2_08qf8qflnxz233t.R.inc(16316);org.junit.Assert.assertNotNull(element20);
        __CLR4_2_08qf8qflnxz233t.R.inc(16317);org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16318);org.junit.Assert.assertNotNull(elements22);
        __CLR4_2_08qf8qflnxz233t.R.inc(16319);org.junit.Assert.assertNotNull(element23);
        __CLR4_2_08qf8qflnxz233t.R.inc(16320);org.junit.Assert.assertNotNull(element25);
        __CLR4_2_08qf8qflnxz233t.R.inc(16321);org.junit.Assert.assertNotNull(wildcardClass26);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test202() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),16322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0aaahavcle();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test202",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),16322,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0aaahavcle() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(16322);
        __CLR4_2_08qf8qflnxz233t.R.inc(16323);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(16324)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(16325)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(16326);System.out.format("%n%s%n", "RegressionTest0.test202");
        }__CLR4_2_08qf8qflnxz233t.R.inc(16327);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16328);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16329);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16330);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(16331);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16332);java.lang.String str8 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(16333);org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16334);java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16335);org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(16336);int int14 = element13.childNodeSize();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(16337);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(16338);org.jsoup.nodes.Element element16 = element13.child((int) '#');
            __CLR4_2_08qf8qflnxz233t.R.inc(16339);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(16340);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(16341);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(16342);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16343);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(16344);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16345);org.junit.Assert.assertNotNull(textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(16346);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(16347);org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test203() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),16348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_071aiiecm4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test203",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),16348,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_071aiiecm4() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(16348);
        __CLR4_2_08qf8qflnxz233t.R.inc(16349);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(16350)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(16351)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(16352);System.out.format("%n%s%n", "RegressionTest0.test203");
        }__CLR4_2_08qf8qflnxz233t.R.inc(16353);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16354);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16355);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(16356);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(16357);org.jsoup.nodes.Element element5 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(16358);org.jsoup.nodes.Element element7 = element1.addClass("<hi!></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(16359);java.lang.String str8 = element7.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(16360);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(16361);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(16362);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16363);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(16364);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(16365);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test204() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),16366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_03sajpxcmm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test204",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),16366,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_03sajpxcmm() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(16366);
        __CLR4_2_08qf8qflnxz233t.R.inc(16367);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(16368)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(16369)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(16370);System.out.format("%n%s%n", "RegressionTest0.test204");
        }__CLR4_2_08qf8qflnxz233t.R.inc(16371);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16372);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16373);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16374);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(16375);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16376);boolean boolean9 = element4.hasAttr("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16377);org.jsoup.select.Elements elements11 = element4.getElementsContainingText("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16378);org.jsoup.nodes.Element element13 = element4.prependText("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16379);java.lang.String str14 = element13.data();
        __CLR4_2_08qf8qflnxz233t.R.inc(16380);org.jsoup.nodes.Element element16 = element13.appendText("<hi!></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(16381);org.jsoup.select.Elements elements18 = element16.getElementsByIndexGreaterThan((int) (byte) 100);
        __CLR4_2_08qf8qflnxz233t.R.inc(16382);org.jsoup.nodes.Element element19 = element16.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(16383);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(16384);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(16385);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16386);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(16387);org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(16388);org.junit.Assert.assertNotNull(elements11);
        __CLR4_2_08qf8qflnxz233t.R.inc(16389);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(16390);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16391);org.junit.Assert.assertNotNull(element16);
        __CLR4_2_08qf8qflnxz233t.R.inc(16392);org.junit.Assert.assertNotNull(elements18);
        __CLR4_2_08qf8qflnxz233t.R.inc(16393);org.junit.Assert.assertNull(element19);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test205() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),16394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0jakxgcne();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test205",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),16394,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0jakxgcne() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(16394);
        __CLR4_2_08qf8qflnxz233t.R.inc(16395);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(16396)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(16397)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(16398);System.out.format("%n%s%n", "RegressionTest0.test205");
        }__CLR4_2_08qf8qflnxz233t.R.inc(16399);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16400);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16401);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16402);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(16403);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(16404);org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16405);java.lang.String str9 = element4.html();
        __CLR4_2_08qf8qflnxz233t.R.inc(16406);org.jsoup.nodes.Element element10 = element4.previousElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(16407);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(16408);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(16409);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16410);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(16411);org.junit.Assert.assertNotNull(element8);
        __CLR4_2_08qf8qflnxz233t.R.inc(16412);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16413);org.junit.Assert.assertNull(element10);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test206() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),16414);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_02ppdv1cny();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test206",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),16414,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_02ppdv1cny() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(16414);
        __CLR4_2_08qf8qflnxz233t.R.inc(16415);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(16416)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(16417)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(16418);System.out.format("%n%s%n", "RegressionTest0.test206");
        }__CLR4_2_08qf8qflnxz233t.R.inc(16419);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16420);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16421);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16422);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(16423);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16424);org.jsoup.nodes.Element element8 = element7.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16425);org.jsoup.nodes.Element element10 = element8.prependText("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(16426);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(16427);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(16428);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16429);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(16430);org.junit.Assert.assertNotNull(element8);
        __CLR4_2_08qf8qflnxz233t.R.inc(16431);org.junit.Assert.assertNotNull(element10);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test207() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),16432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_05ypcnicog();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test207",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),16432,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_05ypcnicog() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(16432);
        __CLR4_2_08qf8qflnxz233t.R.inc(16433);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(16434)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(16435)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(16436);System.out.format("%n%s%n", "RegressionTest0.test207");
        }__CLR4_2_08qf8qflnxz233t.R.inc(16437);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16438);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16439);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16440);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(16441);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16442);org.jsoup.select.Elements elements8 = element7.children();
        __CLR4_2_08qf8qflnxz233t.R.inc(16443);java.lang.String str9 = element7.data();
        __CLR4_2_08qf8qflnxz233t.R.inc(16444);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(16445);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(16446);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16447);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(16448);org.junit.Assert.assertNotNull(elements8);
        __CLR4_2_08qf8qflnxz233t.R.inc(16449);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test208() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),16450);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_097pbfzcoy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test208",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),16450,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_097pbfzcoy() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(16450);
        __CLR4_2_08qf8qflnxz233t.R.inc(16451);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(16452)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(16453)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(16454);System.out.format("%n%s%n", "RegressionTest0.test208");
        }__CLR4_2_08qf8qflnxz233t.R.inc(16455);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16456);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16457);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16458);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(16459);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16460);boolean boolean9 = element4.hasAttr("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16461);org.jsoup.select.Elements elements11 = element4.getElementsContainingText("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16462);org.jsoup.nodes.Element element13 = element4.prependText("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16463);java.lang.String str14 = element13.data();
        __CLR4_2_08qf8qflnxz233t.R.inc(16464);org.jsoup.nodes.Element element16 = element13.appendText("<hi!></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(16465);org.jsoup.select.Elements elements18 = element13.getElementsMatchingOwnText("hi!.hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16466);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(16467);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(16468);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16469);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(16470);org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(16471);org.junit.Assert.assertNotNull(elements11);
        __CLR4_2_08qf8qflnxz233t.R.inc(16472);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(16473);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16474);org.junit.Assert.assertNotNull(element16);
        __CLR4_2_08qf8qflnxz233t.R.inc(16475);org.junit.Assert.assertNotNull(elements18);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test209() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),16476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0cgpa8gcpo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test209",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),16476,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0cgpa8gcpo() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(16476);
        __CLR4_2_08qf8qflnxz233t.R.inc(16477);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(16478)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(16479)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(16480);System.out.format("%n%s%n", "RegressionTest0.test209");
        }__CLR4_2_08qf8qflnxz233t.R.inc(16481);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16482);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16483);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(16484);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(16485);org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16486);java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16487);org.jsoup.nodes.Element element9 = element6.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16488);java.lang.String str10 = element9.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(16489);org.jsoup.nodes.Element element12 = element9.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16490);java.lang.String str13 = element9.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(16491);org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16492);java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16493);org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        __CLR4_2_08qf8qflnxz233t.R.inc(16494);org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(16495);int int20 = element18.elementSiblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(16496);org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(16497);org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16498);java.util.List<org.jsoup.nodes.TextNode> textNodeList24 = element23.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16499);org.jsoup.nodes.Element element26 = element23.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16500);java.lang.String str27 = element26.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(16501);org.jsoup.select.Elements elements28 = element26.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(16502);org.jsoup.nodes.Element element30 = element26.toggleClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16503);org.jsoup.nodes.Element element31 = element30.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16504);org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16505);java.util.List<org.jsoup.nodes.TextNode> textNodeList34 = element33.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16506);org.jsoup.nodes.Element element35 = element33.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(16507);java.lang.String str36 = element33.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(16508);org.jsoup.nodes.Element element37 = element33.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(16509);java.util.regex.Pattern pattern39 = null;
        __CLR4_2_08qf8qflnxz233t.R.inc(16510);org.jsoup.select.Elements elements40 = element33.getElementsByAttributeValueMatching("hi!", pattern39);
        __CLR4_2_08qf8qflnxz233t.R.inc(16511);boolean boolean41 = element31.equals((java.lang.Object) pattern39);
        __CLR4_2_08qf8qflnxz233t.R.inc(16512);org.jsoup.nodes.Element element42 = element18.after((org.jsoup.nodes.Node) element31);
        __CLR4_2_08qf8qflnxz233t.R.inc(16513);org.jsoup.nodes.Element element44 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16514);java.util.List<org.jsoup.nodes.TextNode> textNodeList45 = element44.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16515);org.jsoup.nodes.Element element46 = element44.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(16516);java.lang.String str47 = element44.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(16517);org.jsoup.nodes.Element element48 = element44.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(16518);org.jsoup.select.Elements elements51 = element44.getElementsByAttributeValueMatching("hi!", "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16519);org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16520);java.util.List<org.jsoup.nodes.TextNode> textNodeList54 = element53.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16521);org.jsoup.nodes.Element element55 = element53.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(16522);int int56 = element53.siblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(16523);org.jsoup.select.Elements elements57 = element53.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(16524);java.util.List<org.jsoup.nodes.Node> nodeList58 = element53.childNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16525);org.jsoup.nodes.Element element60 = element53.toggleClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16526);org.jsoup.nodes.Element element61 = element44.prependChild((org.jsoup.nodes.Node) element60);
        __CLR4_2_08qf8qflnxz233t.R.inc(16527);org.jsoup.nodes.Element element63 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16528);java.util.List<org.jsoup.nodes.TextNode> textNodeList64 = element63.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16529);org.jsoup.nodes.Element element66 = element63.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16530);java.lang.String str67 = element66.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(16531);org.jsoup.select.Elements elements68 = element66.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(16532);int int69 = element66.childNodeSize();
        __CLR4_2_08qf8qflnxz233t.R.inc(16533);java.util.Set<java.lang.String> strSet70 = element66.classNames();
        __CLR4_2_08qf8qflnxz233t.R.inc(16534);org.jsoup.nodes.Element element71 = element44.classNames(strSet70);
        __CLR4_2_08qf8qflnxz233t.R.inc(16535);org.jsoup.nodes.Element element73 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16536);java.lang.String[] strArray76 = new java.lang.String[] { "hi!", "" };
        __CLR4_2_08qf8qflnxz233t.R.inc(16537);java.util.LinkedHashSet<java.lang.String> strSet77 = new java.util.LinkedHashSet<java.lang.String>();
        __CLR4_2_08qf8qflnxz233t.R.inc(16538);boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet77, strArray76);
        __CLR4_2_08qf8qflnxz233t.R.inc(16539);org.jsoup.nodes.Element element79 = element73.classNames((java.util.Set<java.lang.String>) strSet77);
        __CLR4_2_08qf8qflnxz233t.R.inc(16540);org.jsoup.nodes.Element element80 = element44.classNames((java.util.Set<java.lang.String>) strSet77);
        __CLR4_2_08qf8qflnxz233t.R.inc(16541);org.jsoup.nodes.Element element81 = element42.classNames((java.util.Set<java.lang.String>) strSet77);
        __CLR4_2_08qf8qflnxz233t.R.inc(16542);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(16543);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(16544);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16545);org.junit.Assert.assertNotNull(textNodeList7);
        __CLR4_2_08qf8qflnxz233t.R.inc(16546);org.junit.Assert.assertNotNull(element9);
        __CLR4_2_08qf8qflnxz233t.R.inc(16547);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16548);org.junit.Assert.assertNotNull(element12);
        __CLR4_2_08qf8qflnxz233t.R.inc(16549);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16550);org.junit.Assert.assertNotNull(textNodeList17);
        __CLR4_2_08qf8qflnxz233t.R.inc(16551);org.junit.Assert.assertNotNull(element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(16552);org.junit.Assert.assertNull(element19);
        __CLR4_2_08qf8qflnxz233t.R.inc(16553);org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(16554);org.junit.Assert.assertNotNull(element21);
        __CLR4_2_08qf8qflnxz233t.R.inc(16555);org.junit.Assert.assertNotNull(textNodeList24);
        __CLR4_2_08qf8qflnxz233t.R.inc(16556);org.junit.Assert.assertNotNull(element26);
        __CLR4_2_08qf8qflnxz233t.R.inc(16557);org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16558);org.junit.Assert.assertNotNull(elements28);
        __CLR4_2_08qf8qflnxz233t.R.inc(16559);org.junit.Assert.assertNotNull(element30);
        __CLR4_2_08qf8qflnxz233t.R.inc(16560);org.junit.Assert.assertNotNull(element31);
        __CLR4_2_08qf8qflnxz233t.R.inc(16561);org.junit.Assert.assertNotNull(textNodeList34);
        __CLR4_2_08qf8qflnxz233t.R.inc(16562);org.junit.Assert.assertNull(element35);
        __CLR4_2_08qf8qflnxz233t.R.inc(16563);org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16564);org.junit.Assert.assertNotNull(element37);
        __CLR4_2_08qf8qflnxz233t.R.inc(16565);org.junit.Assert.assertNotNull(elements40);
        __CLR4_2_08qf8qflnxz233t.R.inc(16566);org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(16567);org.junit.Assert.assertNotNull(element42);
        __CLR4_2_08qf8qflnxz233t.R.inc(16568);org.junit.Assert.assertNotNull(textNodeList45);
        __CLR4_2_08qf8qflnxz233t.R.inc(16569);org.junit.Assert.assertNull(element46);
        __CLR4_2_08qf8qflnxz233t.R.inc(16570);org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16571);org.junit.Assert.assertNotNull(element48);
        __CLR4_2_08qf8qflnxz233t.R.inc(16572);org.junit.Assert.assertNotNull(elements51);
        __CLR4_2_08qf8qflnxz233t.R.inc(16573);org.junit.Assert.assertNotNull(textNodeList54);
        __CLR4_2_08qf8qflnxz233t.R.inc(16574);org.junit.Assert.assertNotNull(element55);
        __CLR4_2_08qf8qflnxz233t.R.inc(16575);org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(16576);org.junit.Assert.assertNotNull(elements57);
        __CLR4_2_08qf8qflnxz233t.R.inc(16577);org.junit.Assert.assertNotNull(nodeList58);
        __CLR4_2_08qf8qflnxz233t.R.inc(16578);org.junit.Assert.assertNotNull(element60);
        __CLR4_2_08qf8qflnxz233t.R.inc(16579);org.junit.Assert.assertNotNull(element61);
        __CLR4_2_08qf8qflnxz233t.R.inc(16580);org.junit.Assert.assertNotNull(textNodeList64);
        __CLR4_2_08qf8qflnxz233t.R.inc(16581);org.junit.Assert.assertNotNull(element66);
        __CLR4_2_08qf8qflnxz233t.R.inc(16582);org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16583);org.junit.Assert.assertNotNull(elements68);
        __CLR4_2_08qf8qflnxz233t.R.inc(16584);org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(16585);org.junit.Assert.assertNotNull(strSet70);
        __CLR4_2_08qf8qflnxz233t.R.inc(16586);org.junit.Assert.assertNotNull(element71);
        __CLR4_2_08qf8qflnxz233t.R.inc(16587);org.junit.Assert.assertNotNull(strArray76);
        __CLR4_2_08qf8qflnxz233t.R.inc(16588);org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        __CLR4_2_08qf8qflnxz233t.R.inc(16589);org.junit.Assert.assertNotNull(element79);
        __CLR4_2_08qf8qflnxz233t.R.inc(16590);org.junit.Assert.assertNotNull(element80);
        __CLR4_2_08qf8qflnxz233t.R.inc(16591);org.junit.Assert.assertNotNull(element81);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test210() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),16592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0cxkhnqcsw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test210",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),16592,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0cxkhnqcsw() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(16592);
        __CLR4_2_08qf8qflnxz233t.R.inc(16593);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(16594)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(16595)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(16596);System.out.format("%n%s%n", "RegressionTest0.test210");
        }__CLR4_2_08qf8qflnxz233t.R.inc(16597);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16598);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16599);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16600);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(16601);org.jsoup.nodes.Node node6 = element4.previousSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(16602);java.lang.String str7 = element4.ownText();
        __CLR4_2_08qf8qflnxz233t.R.inc(16603);java.lang.String str9 = element4.attr("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16604);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(16605);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(16606);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16607);org.junit.Assert.assertNull(node6);
        __CLR4_2_08qf8qflnxz233t.R.inc(16608);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16609);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test211() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),16610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0g6kgg7cte();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test211",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),16610,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0g6kgg7cte() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(16610);
        __CLR4_2_08qf8qflnxz233t.R.inc(16611);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(16612)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(16613)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(16614);System.out.format("%n%s%n", "RegressionTest0.test211");
        }__CLR4_2_08qf8qflnxz233t.R.inc(16615);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16616);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16617);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16618);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(16619);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16620);boolean boolean9 = element4.hasAttr("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16621);org.jsoup.nodes.Element element10 = element4.root();
        __CLR4_2_08qf8qflnxz233t.R.inc(16622);org.jsoup.select.Elements elements11 = element4.getAllElements();
        __CLR4_2_08qf8qflnxz233t.R.inc(16623);org.jsoup.nodes.TextNode[] textNodeArray13 = new org.jsoup.nodes.TextNode[] {};
        __CLR4_2_08qf8qflnxz233t.R.inc(16624);java.util.ArrayList<org.jsoup.nodes.TextNode> textNodeList14 = new java.util.ArrayList<org.jsoup.nodes.TextNode>();
        __CLR4_2_08qf8qflnxz233t.R.inc(16625);boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList14, textNodeArray13);
        __CLR4_2_08qf8qflnxz233t.R.inc(16626);org.jsoup.nodes.Element element16 = element4.insertChildren((int) (short) 0, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList14);
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(16627);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(16628);org.jsoup.nodes.Element element18 = element4.tagName("");
            __CLR4_2_08qf8qflnxz233t.R.inc(16629);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Tag name must not be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(16630);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(16631);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(16632);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16633);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(16634);org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(16635);org.junit.Assert.assertNotNull(element10);
        __CLR4_2_08qf8qflnxz233t.R.inc(16636);org.junit.Assert.assertNotNull(elements11);
        __CLR4_2_08qf8qflnxz233t.R.inc(16637);org.junit.Assert.assertNotNull(textNodeArray13);
        __CLR4_2_08qf8qflnxz233t.R.inc(16638);org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(16639);org.junit.Assert.assertNotNull(element16);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test212() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),16640);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0jfkf8ocu8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test212",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),16640,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0jfkf8ocu8() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(16640);
        __CLR4_2_08qf8qflnxz233t.R.inc(16641);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(16642)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(16643)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(16644);System.out.format("%n%s%n", "RegressionTest0.test212");
        }__CLR4_2_08qf8qflnxz233t.R.inc(16645);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!>\n hi!\n</hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(16646);org.jsoup.select.Elements elements3 = element1.getElementsByClass("<hi!>\n hi!\n</hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(16647);org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!.hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16648);org.junit.Assert.assertNotNull(elements3);
        __CLR4_2_08qf8qflnxz233t.R.inc(16649);org.junit.Assert.assertNotNull(elements6);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test213() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),16650);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0moke15cui();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test213",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),16650,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0moke15cui() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(16650);
        __CLR4_2_08qf8qflnxz233t.R.inc(16651);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(16652)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(16653)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(16654);System.out.format("%n%s%n", "RegressionTest0.test213");
        }__CLR4_2_08qf8qflnxz233t.R.inc(16655);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16656);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16657);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16658);org.jsoup.nodes.Element element5 = element1.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16659);java.lang.String str6 = element5.id();
        __CLR4_2_08qf8qflnxz233t.R.inc(16660);java.util.List<org.jsoup.nodes.Node> nodeList7 = element5.siblingNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16661);java.lang.String str9 = element5.attr("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(16662);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(16663);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(16664);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(16665);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16666);org.junit.Assert.assertNotNull(nodeList7);
        __CLR4_2_08qf8qflnxz233t.R.inc(16667);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test214() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),16668);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0pxkctmcv0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test214",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),16668,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0pxkctmcv0() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(16668);
        __CLR4_2_08qf8qflnxz233t.R.inc(16669);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(16670)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(16671)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(16672);System.out.format("%n%s%n", "RegressionTest0.test214");
        }__CLR4_2_08qf8qflnxz233t.R.inc(16673);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16674);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16675);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16676);org.jsoup.nodes.Element element5 = element1.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16677);java.lang.String str6 = element1.cssSelector();
        __CLR4_2_08qf8qflnxz233t.R.inc(16678);java.lang.String str7 = element1.outerHtml();
        __CLR4_2_08qf8qflnxz233t.R.inc(16679);boolean boolean8 = element1.isBlock();
        __CLR4_2_08qf8qflnxz233t.R.inc(16680);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(16681);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(16682);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(16683);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16684);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<hi!></hi!>" + "'", str7, "<hi!></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(16685);org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test215() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),16686);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0t6kbm3cvi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test215",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),16686,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0t6kbm3cvi() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(16686);
        __CLR4_2_08qf8qflnxz233t.R.inc(16687);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(16688)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(16689)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(16690);System.out.format("%n%s%n", "RegressionTest0.test215");
        }__CLR4_2_08qf8qflnxz233t.R.inc(16691);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16692);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16693);org.jsoup.nodes.Element element3 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(16694);int int4 = element1.siblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(16695);org.jsoup.select.Elements elements5 = element1.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(16696);java.lang.String str6 = element1.className();
        __CLR4_2_08qf8qflnxz233t.R.inc(16697);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(16698);org.junit.Assert.assertNotNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(16699);org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(16700);org.junit.Assert.assertNotNull(elements5);
        __CLR4_2_08qf8qflnxz233t.R.inc(16701);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test216() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),16702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0wfkaekcvy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test216",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),16702,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0wfkaekcvy() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(16702);
        __CLR4_2_08qf8qflnxz233t.R.inc(16703);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(16704)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(16705)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(16706);System.out.format("%n%s%n", "RegressionTest0.test216");
        }__CLR4_2_08qf8qflnxz233t.R.inc(16707);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16708);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16709);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16710);org.jsoup.nodes.Element element5 = element1.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16711);java.lang.String str6 = element1.cssSelector();
        __CLR4_2_08qf8qflnxz233t.R.inc(16712);org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16713);java.util.List<org.jsoup.nodes.TextNode> textNodeList9 = element8.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16714);org.jsoup.nodes.Element element11 = element8.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16715);java.lang.String str12 = element11.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(16716);org.jsoup.select.Elements elements13 = element11.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(16717);org.jsoup.nodes.Element element15 = element11.toggleClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16718);org.jsoup.nodes.Element element16 = element15.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16719);org.jsoup.nodes.Element element17 = element16.clone();
        __CLR4_2_08qf8qflnxz233t.R.inc(16720);org.jsoup.nodes.Element element18 = element1.appendTo(element16);
        __CLR4_2_08qf8qflnxz233t.R.inc(16721);org.jsoup.nodes.Element element20 = element18.prependText("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16722);org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16723);org.jsoup.nodes.Element element23 = element22.empty();
        __CLR4_2_08qf8qflnxz233t.R.inc(16724);org.jsoup.nodes.Element element24 = element20.appendTo(element22);
        __CLR4_2_08qf8qflnxz233t.R.inc(16725);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(16726);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(16727);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(16728);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16729);org.junit.Assert.assertNotNull(textNodeList9);
        __CLR4_2_08qf8qflnxz233t.R.inc(16730);org.junit.Assert.assertNotNull(element11);
        __CLR4_2_08qf8qflnxz233t.R.inc(16731);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16732);org.junit.Assert.assertNotNull(elements13);
        __CLR4_2_08qf8qflnxz233t.R.inc(16733);org.junit.Assert.assertNotNull(element15);
        __CLR4_2_08qf8qflnxz233t.R.inc(16734);org.junit.Assert.assertNotNull(element16);
        __CLR4_2_08qf8qflnxz233t.R.inc(16735);org.junit.Assert.assertNotNull(element17);
        __CLR4_2_08qf8qflnxz233t.R.inc(16736);org.junit.Assert.assertNotNull(element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(16737);org.junit.Assert.assertNotNull(element20);
        __CLR4_2_08qf8qflnxz233t.R.inc(16738);org.junit.Assert.assertNotNull(element23);
        __CLR4_2_08qf8qflnxz233t.R.inc(16739);org.junit.Assert.assertNotNull(element24);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test217() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),16740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0zcjss3cx0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test217",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),16740,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0zcjss3cx0() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(16740);
        __CLR4_2_08qf8qflnxz233t.R.inc(16741);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(16742)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(16743)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(16744);System.out.format("%n%s%n", "RegressionTest0.test217");
        }__CLR4_2_08qf8qflnxz233t.R.inc(16745);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16746);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16747);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16748);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(16749);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16750);java.lang.String str8 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(16751);org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16752);java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16753);org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(16754);org.jsoup.select.Elements elements16 = element4.getElementsByAttributeValueContaining("hi!", "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16755);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(16756);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(16757);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16758);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(16759);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16760);org.junit.Assert.assertNotNull(textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(16761);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(16762);org.junit.Assert.assertNotNull(elements16);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test218() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),16763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0w3jtzmcxn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test218",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),16763,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0w3jtzmcxn() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(16763);
        __CLR4_2_08qf8qflnxz233t.R.inc(16764);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(16765)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(16766)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(16767);System.out.format("%n%s%n", "RegressionTest0.test218");
        }__CLR4_2_08qf8qflnxz233t.R.inc(16768);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16769);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16770);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(16771);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(16772);org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16773);java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16774);org.jsoup.nodes.Element element9 = element6.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16775);java.lang.String str10 = element9.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(16776);org.jsoup.nodes.Element element12 = element9.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16777);java.lang.String str13 = element9.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(16778);org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16779);java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16780);org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        __CLR4_2_08qf8qflnxz233t.R.inc(16781);org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(16782);int int20 = element18.elementSiblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(16783);org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(16784);org.jsoup.nodes.Element element23 = element18.appendText("<hi!></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(16785);boolean boolean24 = element18.hasParent();
        __CLR4_2_08qf8qflnxz233t.R.inc(16786);org.jsoup.parser.Tag tag25 = element18.tag();
        __CLR4_2_08qf8qflnxz233t.R.inc(16787);org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag25, "hi!.hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16788);org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element(tag25, "<hi! class=\"\"></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(16789);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(16790);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(16791);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16792);org.junit.Assert.assertNotNull(textNodeList7);
        __CLR4_2_08qf8qflnxz233t.R.inc(16793);org.junit.Assert.assertNotNull(element9);
        __CLR4_2_08qf8qflnxz233t.R.inc(16794);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16795);org.junit.Assert.assertNotNull(element12);
        __CLR4_2_08qf8qflnxz233t.R.inc(16796);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16797);org.junit.Assert.assertNotNull(textNodeList17);
        __CLR4_2_08qf8qflnxz233t.R.inc(16798);org.junit.Assert.assertNotNull(element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(16799);org.junit.Assert.assertNull(element19);
        __CLR4_2_08qf8qflnxz233t.R.inc(16800);org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(16801);org.junit.Assert.assertNotNull(element21);
        __CLR4_2_08qf8qflnxz233t.R.inc(16802);org.junit.Assert.assertNotNull(element23);
        __CLR4_2_08qf8qflnxz233t.R.inc(16803);org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        __CLR4_2_08qf8qflnxz233t.R.inc(16804);org.junit.Assert.assertNotNull(tag25);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test219() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),16805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0sujv75cyt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test219",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),16805,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0sujv75cyt() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(16805);
        __CLR4_2_08qf8qflnxz233t.R.inc(16806);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(16807)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(16808)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(16809);System.out.format("%n%s%n", "RegressionTest0.test219");
        }__CLR4_2_08qf8qflnxz233t.R.inc(16810);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16811);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16812);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16813);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(16814);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16815);boolean boolean9 = element4.hasAttr("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16816);org.jsoup.select.Elements elements11 = element4.getElementsContainingText("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16817);boolean boolean12 = element4.isBlock();
        __CLR4_2_08qf8qflnxz233t.R.inc(16818);org.jsoup.nodes.Element element14 = element4.append("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16819);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(16820);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(16821);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16822);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(16823);org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(16824);org.junit.Assert.assertNotNull(elements11);
        __CLR4_2_08qf8qflnxz233t.R.inc(16825);org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(16826);org.junit.Assert.assertNotNull(element14);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test220() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),16827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0sdonrvczf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test220",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),16827,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0sdonrvczf() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(16827);
        __CLR4_2_08qf8qflnxz233t.R.inc(16828);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(16829)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(16830)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(16831);System.out.format("%n%s%n", "RegressionTest0.test220");
        }__CLR4_2_08qf8qflnxz233t.R.inc(16832);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16833);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16834);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16835);org.jsoup.nodes.Document document5 = element1.ownerDocument();
        __CLR4_2_08qf8qflnxz233t.R.inc(16836);org.jsoup.nodes.Element element6 = element1.root();
        __CLR4_2_08qf8qflnxz233t.R.inc(16837);int int7 = element6.siblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(16838);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(16839);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(16840);org.junit.Assert.assertNull(document5);
        __CLR4_2_08qf8qflnxz233t.R.inc(16841);org.junit.Assert.assertNotNull(element6);
        __CLR4_2_08qf8qflnxz233t.R.inc(16842);org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test221() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),16843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0p4oozeczv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test221",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),16843,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0p4oozeczv() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(16843);
        __CLR4_2_08qf8qflnxz233t.R.inc(16844);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(16845)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(16846)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(16847);System.out.format("%n%s%n", "RegressionTest0.test221");
        }__CLR4_2_08qf8qflnxz233t.R.inc(16848);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16849);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16850);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16851);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(16852);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16853);boolean boolean9 = element4.hasAttr("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16854);org.jsoup.nodes.Element element10 = element4.root();
        __CLR4_2_08qf8qflnxz233t.R.inc(16855);org.jsoup.select.Elements elements12 = element10.getElementsByIndexEquals((int) (byte) 10);
        __CLR4_2_08qf8qflnxz233t.R.inc(16856);java.lang.String str13 = element10.nodeName();
        __CLR4_2_08qf8qflnxz233t.R.inc(16857);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(16858);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(16859);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16860);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(16861);org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(16862);org.junit.Assert.assertNotNull(element10);
        __CLR4_2_08qf8qflnxz233t.R.inc(16863);org.junit.Assert.assertNotNull(elements12);
        __CLR4_2_08qf8qflnxz233t.R.inc(16864);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test222() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),16865);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0lvoq6xd0h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test222",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),16865,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0lvoq6xd0h() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(16865);
        __CLR4_2_08qf8qflnxz233t.R.inc(16866);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(16867)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(16868)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(16869);System.out.format("%n%s%n", "RegressionTest0.test222");
        }__CLR4_2_08qf8qflnxz233t.R.inc(16870);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16871);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16872);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16873);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(16874);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16875);java.lang.String str8 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(16876);org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16877);java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16878);org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(16879);java.lang.String str14 = element4.val();
        __CLR4_2_08qf8qflnxz233t.R.inc(16880);org.jsoup.nodes.Element element15 = element4.empty();
        __CLR4_2_08qf8qflnxz233t.R.inc(16881);org.jsoup.nodes.Element element17 = element15.html("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16882);java.util.Map<java.lang.String, java.lang.String> strMap18 = element15.dataset();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(16883);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(16884);org.jsoup.select.Elements elements21 = element15.getElementsByAttributeValueEnding("<hi!>\n hi!\n</hi!>", "");
            __CLR4_2_08qf8qflnxz233t.R.inc(16885);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(16886);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(16887);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(16888);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16889);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(16890);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16891);org.junit.Assert.assertNotNull(textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(16892);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(16893);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16894);org.junit.Assert.assertNotNull(element15);
        __CLR4_2_08qf8qflnxz233t.R.inc(16895);org.junit.Assert.assertNotNull(element17);
        __CLR4_2_08qf8qflnxz233t.R.inc(16896);org.junit.Assert.assertNotNull(strMap18);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test223() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),16897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0imoregd1d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test223",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),16897,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0imoregd1d() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(16897);
        __CLR4_2_08qf8qflnxz233t.R.inc(16898);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(16899)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(16900)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(16901);System.out.format("%n%s%n", "RegressionTest0.test223");
        }__CLR4_2_08qf8qflnxz233t.R.inc(16902);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16903);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16904);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16905);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(16906);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16907);boolean boolean9 = element4.hasAttr("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16908);org.jsoup.select.Elements elements11 = element4.getElementsContainingText("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16909);org.jsoup.nodes.Element element13 = element4.prependText("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16910);java.lang.String str14 = element13.data();
        __CLR4_2_08qf8qflnxz233t.R.inc(16911);org.jsoup.nodes.Element element16 = element13.appendText("<hi!></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(16912);org.jsoup.select.Elements elements18 = element16.getElementsByIndexGreaterThan((int) (byte) 100);
        __CLR4_2_08qf8qflnxz233t.R.inc(16913);java.lang.String str19 = element16.val();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(16914);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(16915);org.jsoup.select.Elements elements21 = element16.getElementsByAttributeStarting("");
            __CLR4_2_08qf8qflnxz233t.R.inc(16916);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(16917);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(16918);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(16919);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16920);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(16921);org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(16922);org.junit.Assert.assertNotNull(elements11);
        __CLR4_2_08qf8qflnxz233t.R.inc(16923);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(16924);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(16925);org.junit.Assert.assertNotNull(element16);
        __CLR4_2_08qf8qflnxz233t.R.inc(16926);org.junit.Assert.assertNotNull(elements18);
        __CLR4_2_08qf8qflnxz233t.R.inc(16927);org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test224() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),16928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0fdoslzd28();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test224",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),16928,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0fdoslzd28() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(16928);
        __CLR4_2_08qf8qflnxz233t.R.inc(16929);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(16930)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(16931)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(16932);System.out.format("%n%s%n", "RegressionTest0.test224");
        }__CLR4_2_08qf8qflnxz233t.R.inc(16933);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16934);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16935);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(16936);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(16937);org.jsoup.nodes.Element element5 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(16938);org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16939);org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16940);java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element10.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16941);org.jsoup.nodes.Element element12 = element10.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(16942);int int13 = element10.siblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(16943);org.jsoup.select.Elements elements14 = element10.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(16944);java.util.List<org.jsoup.nodes.Node> nodeList15 = element10.childNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16945);org.jsoup.nodes.Element element17 = element10.toggleClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16946);org.jsoup.nodes.Element element18 = element1.prependChild((org.jsoup.nodes.Node) element17);
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(16947);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(16948);org.jsoup.nodes.Node node20 = element17.childNode(1);
            __CLR4_2_08qf8qflnxz233t.R.inc(16949);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(16950);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(16951);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(16952);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16953);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(16954);org.junit.Assert.assertNotNull(elements8);
        __CLR4_2_08qf8qflnxz233t.R.inc(16955);org.junit.Assert.assertNotNull(textNodeList11);
        __CLR4_2_08qf8qflnxz233t.R.inc(16956);org.junit.Assert.assertNotNull(element12);
        __CLR4_2_08qf8qflnxz233t.R.inc(16957);org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(16958);org.junit.Assert.assertNotNull(elements14);
        __CLR4_2_08qf8qflnxz233t.R.inc(16959);org.junit.Assert.assertNotNull(nodeList15);
        __CLR4_2_08qf8qflnxz233t.R.inc(16960);org.junit.Assert.assertNotNull(element17);
        __CLR4_2_08qf8qflnxz233t.R.inc(16961);org.junit.Assert.assertNotNull(element18);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test225() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),16962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0c4ottid36();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test225",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),16962,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0c4ottid36() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(16962);
        __CLR4_2_08qf8qflnxz233t.R.inc(16963);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(16964)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(16965)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(16966);System.out.format("%n%s%n", "RegressionTest0.test225");
        }__CLR4_2_08qf8qflnxz233t.R.inc(16967);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16968);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16969);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(16970);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(16971);java.util.List<org.jsoup.nodes.Node> nodeList5 = element1.childNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16972);org.jsoup.nodes.Element element7 = element1.append("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16973);java.lang.String str8 = element1.tagName();
        __CLR4_2_08qf8qflnxz233t.R.inc(16974);org.jsoup.parser.Tag tag9 = element1.tag();
        __CLR4_2_08qf8qflnxz233t.R.inc(16975);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(16976);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(16977);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16978);org.junit.Assert.assertNotNull(nodeList5);
        __CLR4_2_08qf8qflnxz233t.R.inc(16979);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(16980);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16981);org.junit.Assert.assertNotNull(tag9);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test226() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),16982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_08vov11d3q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test226",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),16982,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_08vov11d3q() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(16982);
        __CLR4_2_08qf8qflnxz233t.R.inc(16983);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(16984)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(16985)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(16986);System.out.format("%n%s%n", "RegressionTest0.test226");
        }__CLR4_2_08qf8qflnxz233t.R.inc(16987);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(16988);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16989);org.jsoup.nodes.Element element3 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(16990);int int4 = element1.siblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(16991);org.jsoup.select.Elements elements5 = element1.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(16992);java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(16993);org.jsoup.nodes.Element element8 = element1.toggleClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(16994);java.util.Map<java.lang.String, java.lang.String> strMap9 = element1.dataset();
        __CLR4_2_08qf8qflnxz233t.R.inc(16995);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(16996);org.junit.Assert.assertNotNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(16997);org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(16998);org.junit.Assert.assertNotNull(elements5);
        __CLR4_2_08qf8qflnxz233t.R.inc(16999);org.junit.Assert.assertNotNull(nodeList6);
        __CLR4_2_08qf8qflnxz233t.R.inc(17000);org.junit.Assert.assertNotNull(element8);
        __CLR4_2_08qf8qflnxz233t.R.inc(17001);org.junit.Assert.assertNotNull(strMap9);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test227() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),17002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_05mow8kd4a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test227",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),17002,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_05mow8kd4a() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(17002);
        __CLR4_2_08qf8qflnxz233t.R.inc(17003);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(17004)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(17005)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(17006);System.out.format("%n%s%n", "RegressionTest0.test227");
        }__CLR4_2_08qf8qflnxz233t.R.inc(17007);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17008);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17009);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17010);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(17011);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(17012);int int7 = element4.childNodeSize();
        __CLR4_2_08qf8qflnxz233t.R.inc(17013);java.util.Set<java.lang.String> strSet8 = element4.classNames();
        __CLR4_2_08qf8qflnxz233t.R.inc(17014);org.jsoup.nodes.Document document9 = element4.ownerDocument();
        __CLR4_2_08qf8qflnxz233t.R.inc(17015);org.jsoup.select.Elements elements10 = element4.previousElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(17016);org.jsoup.parser.Tag tag11 = element4.tag();
        __CLR4_2_08qf8qflnxz233t.R.inc(17017);org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17018);java.util.List<org.jsoup.nodes.TextNode> textNodeList14 = element13.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17019);org.jsoup.nodes.Element element15 = element13.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(17020);java.lang.String str16 = element13.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(17021);org.jsoup.select.Elements elements18 = element13.getElementsByIndexLessThan((int) (byte) 1);
        __CLR4_2_08qf8qflnxz233t.R.inc(17022);org.jsoup.nodes.Element element19 = element13.clearAttributes();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(17023);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(17024);org.jsoup.nodes.Element element20 = element4.before((org.jsoup.nodes.Node) element19);
            __CLR4_2_08qf8qflnxz233t.R.inc(17025);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(17026);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(17027);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(17028);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(17029);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(17030);org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(17031);org.junit.Assert.assertNotNull(strSet8);
        __CLR4_2_08qf8qflnxz233t.R.inc(17032);org.junit.Assert.assertNull(document9);
        __CLR4_2_08qf8qflnxz233t.R.inc(17033);org.junit.Assert.assertNotNull(elements10);
        __CLR4_2_08qf8qflnxz233t.R.inc(17034);org.junit.Assert.assertNotNull(tag11);
        __CLR4_2_08qf8qflnxz233t.R.inc(17035);org.junit.Assert.assertNotNull(textNodeList14);
        __CLR4_2_08qf8qflnxz233t.R.inc(17036);org.junit.Assert.assertNull(element15);
        __CLR4_2_08qf8qflnxz233t.R.inc(17037);org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17038);org.junit.Assert.assertNotNull(elements18);
        __CLR4_2_08qf8qflnxz233t.R.inc(17039);org.junit.Assert.assertNotNull(element19);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test228() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),17040);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_02doxg3d5c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test228",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),17040,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_02doxg3d5c() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(17040);
        __CLR4_2_08qf8qflnxz233t.R.inc(17041);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(17042)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(17043)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(17044);System.out.format("%n%s%n", "RegressionTest0.test228");
        }__CLR4_2_08qf8qflnxz233t.R.inc(17045);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17046);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17047);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(17048);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(17049);java.lang.String str6 = element1.attr("hi!.hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17050);org.jsoup.nodes.Node node7 = element1.previousSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(17051);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(17052);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(17053);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17054);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(17055);org.junit.Assert.assertNull(node7);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test229() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),17056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0vb1ced5s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test229",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),17056,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0vb1ced5s() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(17056);
        __CLR4_2_08qf8qflnxz233t.R.inc(17057);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(17058)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(17059)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(17060);System.out.format("%n%s%n", "RegressionTest0.test229");
        }__CLR4_2_08qf8qflnxz233t.R.inc(17061);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17062);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17063);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17064);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(17065);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17066);org.jsoup.nodes.Element element8 = element7.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17067);org.jsoup.select.Elements elements9 = element7.siblingElements();
        __CLR4_2_08qf8qflnxz233t.R.inc(17068);org.jsoup.select.Elements elements12 = element7.getElementsByAttributeValueContaining("<hi!></hi!>", "<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(17069);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(17070);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(17071);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(17072);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(17073);org.junit.Assert.assertNotNull(element8);
        __CLR4_2_08qf8qflnxz233t.R.inc(17074);org.junit.Assert.assertNotNull(elements9);
        __CLR4_2_08qf8qflnxz233t.R.inc(17075);org.junit.Assert.assertNotNull(elements12);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test230() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),17076);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_01c68rod6c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test230",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),17076,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_01c68rod6c() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(17076);
        __CLR4_2_08qf8qflnxz233t.R.inc(17077);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(17078)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(17079)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(17080);System.out.format("%n%s%n", "RegressionTest0.test230");
        }__CLR4_2_08qf8qflnxz233t.R.inc(17081);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17082);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17083);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17084);org.jsoup.nodes.Element element5 = element1.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17085);java.lang.String str6 = element5.id();
        __CLR4_2_08qf8qflnxz233t.R.inc(17086);int int7 = element5.childNodeSize();
        __CLR4_2_08qf8qflnxz233t.R.inc(17087);org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17088);java.util.List<org.jsoup.nodes.TextNode> textNodeList10 = element9.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17089);org.jsoup.nodes.Element element12 = element9.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17090);java.lang.String str13 = element12.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(17091);org.jsoup.nodes.Element element15 = element12.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17092);java.lang.String str16 = element12.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(17093);org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17094);java.util.List<org.jsoup.nodes.TextNode> textNodeList20 = element19.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17095);org.jsoup.nodes.Element element21 = element12.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList20);
        __CLR4_2_08qf8qflnxz233t.R.inc(17096);org.jsoup.nodes.Element element22 = element21.previousElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(17097);org.jsoup.nodes.Element element23 = element5.appendTo(element21);
        __CLR4_2_08qf8qflnxz233t.R.inc(17098);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(17099);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(17100);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(17101);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(17102);org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(17103);org.junit.Assert.assertNotNull(textNodeList10);
        __CLR4_2_08qf8qflnxz233t.R.inc(17104);org.junit.Assert.assertNotNull(element12);
        __CLR4_2_08qf8qflnxz233t.R.inc(17105);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(17106);org.junit.Assert.assertNotNull(element15);
        __CLR4_2_08qf8qflnxz233t.R.inc(17107);org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(17108);org.junit.Assert.assertNotNull(textNodeList20);
        __CLR4_2_08qf8qflnxz233t.R.inc(17109);org.junit.Assert.assertNotNull(element21);
        __CLR4_2_08qf8qflnxz233t.R.inc(17110);org.junit.Assert.assertNull(element22);
        __CLR4_2_08qf8qflnxz233t.R.inc(17111);org.junit.Assert.assertNotNull(element23);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test231() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),17112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_04l67k5d7c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test231",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),17112,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_04l67k5d7c() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(17112);
        __CLR4_2_08qf8qflnxz233t.R.inc(17113);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(17114)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(17115)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(17116);System.out.format("%n%s%n", "RegressionTest0.test231");
        }__CLR4_2_08qf8qflnxz233t.R.inc(17117);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17118);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17119);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17120);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(17121);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17122);java.lang.String str8 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(17123);org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17124);java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17125);org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(17126);org.jsoup.nodes.Element element16 = element4.attr("<hi!>\n hi!\n</hi!>", false);
        __CLR4_2_08qf8qflnxz233t.R.inc(17127);org.jsoup.select.Elements elements17 = element16.siblingElements();
        __CLR4_2_08qf8qflnxz233t.R.inc(17128);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(17129);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(17130);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(17131);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(17132);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(17133);org.junit.Assert.assertNotNull(textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(17134);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(17135);org.junit.Assert.assertNotNull(element16);
        __CLR4_2_08qf8qflnxz233t.R.inc(17136);org.junit.Assert.assertNotNull(elements17);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test232() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),17137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_07u66cmd81();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test232",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),17137,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_07u66cmd81() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(17137);
        __CLR4_2_08qf8qflnxz233t.R.inc(17138);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(17139)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(17140)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(17141);System.out.format("%n%s%n", "RegressionTest0.test232");
        }__CLR4_2_08qf8qflnxz233t.R.inc(17142);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17143);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17144);org.jsoup.nodes.Element element3 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(17145);int int4 = element1.siblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(17146);org.jsoup.select.Elements elements5 = element1.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(17147);java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17148);org.jsoup.nodes.Element element8 = element1.toggleClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17149);org.jsoup.select.Elements elements9 = element8.previousElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(17150);org.jsoup.nodes.Document document10 = element8.ownerDocument();
        __CLR4_2_08qf8qflnxz233t.R.inc(17151);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(17152);org.junit.Assert.assertNotNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(17153);org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(17154);org.junit.Assert.assertNotNull(elements5);
        __CLR4_2_08qf8qflnxz233t.R.inc(17155);org.junit.Assert.assertNotNull(nodeList6);
        __CLR4_2_08qf8qflnxz233t.R.inc(17156);org.junit.Assert.assertNotNull(element8);
        __CLR4_2_08qf8qflnxz233t.R.inc(17157);org.junit.Assert.assertNotNull(elements9);
        __CLR4_2_08qf8qflnxz233t.R.inc(17158);org.junit.Assert.assertNull(document10);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test233() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),17159);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0b36553d8n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test233",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),17159,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0b36553d8n() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(17159);
        __CLR4_2_08qf8qflnxz233t.R.inc(17160);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(17161)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(17162)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(17163);System.out.format("%n%s%n", "RegressionTest0.test233");
        }__CLR4_2_08qf8qflnxz233t.R.inc(17164);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17165);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17166);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(17167);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(17168);org.jsoup.nodes.Element element5 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(17169);org.jsoup.nodes.Element element7 = element1.addClass("<hi!></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(17170);org.jsoup.select.Elements elements9 = element7.getElementsMatchingText("");
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(17171);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(17172);org.jsoup.select.Elements elements11 = element7.select("");
            __CLR4_2_08qf8qflnxz233t.R.inc(17173);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(17174);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(17175);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(17176);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17177);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(17178);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(17179);org.junit.Assert.assertNotNull(elements9);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test234() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),17180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ec63xkd98();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test234",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),17180,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ec63xkd98() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(17180);
        __CLR4_2_08qf8qflnxz233t.R.inc(17181);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(17182)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(17183)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(17184);System.out.format("%n%s%n", "RegressionTest0.test234");
        }__CLR4_2_08qf8qflnxz233t.R.inc(17185);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17186);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17187);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17188);org.jsoup.nodes.Element element5 = element1.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17189);java.lang.String str6 = element5.id();
        __CLR4_2_08qf8qflnxz233t.R.inc(17190);int int7 = element5.elementSiblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(17191);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(17192);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(17193);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(17194);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(17195);org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test235() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),17196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0hl62q1d9o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test235",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),17196,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0hl62q1d9o() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(17196);
        __CLR4_2_08qf8qflnxz233t.R.inc(17197);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(17198)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(17199)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(17200);System.out.format("%n%s%n", "RegressionTest0.test235");
        }__CLR4_2_08qf8qflnxz233t.R.inc(17201);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17202);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17203);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17204);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(17205);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(17206);org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17207);org.jsoup.nodes.Element element9 = element8.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17208);org.jsoup.select.Elements elements10 = element9.getAllElements();
        __CLR4_2_08qf8qflnxz233t.R.inc(17209);java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element9.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17210);org.jsoup.select.Elements elements12 = element9.children();
        __CLR4_2_08qf8qflnxz233t.R.inc(17211);org.jsoup.select.Elements elements13 = element9.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(17212);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(17213);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(17214);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(17215);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(17216);org.junit.Assert.assertNotNull(element8);
        __CLR4_2_08qf8qflnxz233t.R.inc(17217);org.junit.Assert.assertNotNull(element9);
        __CLR4_2_08qf8qflnxz233t.R.inc(17218);org.junit.Assert.assertNotNull(elements10);
        __CLR4_2_08qf8qflnxz233t.R.inc(17219);org.junit.Assert.assertNotNull(textNodeList11);
        __CLR4_2_08qf8qflnxz233t.R.inc(17220);org.junit.Assert.assertNotNull(elements12);
        __CLR4_2_08qf8qflnxz233t.R.inc(17221);org.junit.Assert.assertNotNull(elements13);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test236() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),17222);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ku61iidae();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test236",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),17222,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ku61iidae() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(17222);
        __CLR4_2_08qf8qflnxz233t.R.inc(17223);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(17224)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(17225)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(17226);System.out.format("%n%s%n", "RegressionTest0.test236");
        }__CLR4_2_08qf8qflnxz233t.R.inc(17227);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17228);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17229);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(17230);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(17231);org.jsoup.nodes.Element element5 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(17232);org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17233);org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17234);java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element10.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17235);org.jsoup.nodes.Element element12 = element10.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(17236);int int13 = element10.siblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(17237);org.jsoup.select.Elements elements14 = element10.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(17238);java.util.List<org.jsoup.nodes.Node> nodeList15 = element10.childNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17239);org.jsoup.nodes.Element element17 = element10.toggleClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17240);org.jsoup.nodes.Element element18 = element1.prependChild((org.jsoup.nodes.Node) element17);
        __CLR4_2_08qf8qflnxz233t.R.inc(17241);org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17242);java.util.List<org.jsoup.nodes.TextNode> textNodeList21 = element20.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17243);org.jsoup.nodes.Element element23 = element20.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17244);java.lang.String str24 = element23.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(17245);org.jsoup.select.Elements elements25 = element23.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(17246);int int26 = element23.childNodeSize();
        __CLR4_2_08qf8qflnxz233t.R.inc(17247);java.util.Set<java.lang.String> strSet27 = element23.classNames();
        __CLR4_2_08qf8qflnxz233t.R.inc(17248);org.jsoup.nodes.Element element28 = element1.classNames(strSet27);
        __CLR4_2_08qf8qflnxz233t.R.inc(17249);java.lang.String str29 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(17250);org.jsoup.nodes.Element element30 = element1.clone();
        __CLR4_2_08qf8qflnxz233t.R.inc(17251);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(17252);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(17253);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17254);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(17255);org.junit.Assert.assertNotNull(elements8);
        __CLR4_2_08qf8qflnxz233t.R.inc(17256);org.junit.Assert.assertNotNull(textNodeList11);
        __CLR4_2_08qf8qflnxz233t.R.inc(17257);org.junit.Assert.assertNotNull(element12);
        __CLR4_2_08qf8qflnxz233t.R.inc(17258);org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(17259);org.junit.Assert.assertNotNull(elements14);
        __CLR4_2_08qf8qflnxz233t.R.inc(17260);org.junit.Assert.assertNotNull(nodeList15);
        __CLR4_2_08qf8qflnxz233t.R.inc(17261);org.junit.Assert.assertNotNull(element17);
        __CLR4_2_08qf8qflnxz233t.R.inc(17262);org.junit.Assert.assertNotNull(element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(17263);org.junit.Assert.assertNotNull(textNodeList21);
        __CLR4_2_08qf8qflnxz233t.R.inc(17264);org.junit.Assert.assertNotNull(element23);
        __CLR4_2_08qf8qflnxz233t.R.inc(17265);org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(17266);org.junit.Assert.assertNotNull(elements25);
        __CLR4_2_08qf8qflnxz233t.R.inc(17267);org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(17268);org.junit.Assert.assertNotNull(strSet27);
        __CLR4_2_08qf8qflnxz233t.R.inc(17269);org.junit.Assert.assertNotNull(element28);
        __CLR4_2_08qf8qflnxz233t.R.inc(17270);org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17271);org.junit.Assert.assertNotNull(element30);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test237() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),17272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0o360azdbs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test237",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),17272,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0o360azdbs() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(17272);
        __CLR4_2_08qf8qflnxz233t.R.inc(17273);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(17274)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(17275)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(17276);System.out.format("%n%s%n", "RegressionTest0.test237");
        }__CLR4_2_08qf8qflnxz233t.R.inc(17277);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17278);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17279);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17280);org.jsoup.nodes.Document document5 = element1.ownerDocument();
        __CLR4_2_08qf8qflnxz233t.R.inc(17281);org.jsoup.nodes.Element element6 = element1.root();
        __CLR4_2_08qf8qflnxz233t.R.inc(17282);org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17283);java.util.List<org.jsoup.nodes.TextNode> textNodeList9 = element8.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17284);org.jsoup.nodes.Element element10 = element8.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(17285);org.jsoup.nodes.Element element11 = element1.appendChild((org.jsoup.nodes.Node) element8);
        __CLR4_2_08qf8qflnxz233t.R.inc(17286);org.jsoup.nodes.Element element13 = element8.removeClass("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(17287);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(17288);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(17289);org.junit.Assert.assertNull(document5);
        __CLR4_2_08qf8qflnxz233t.R.inc(17290);org.junit.Assert.assertNotNull(element6);
        __CLR4_2_08qf8qflnxz233t.R.inc(17291);org.junit.Assert.assertNotNull(textNodeList9);
        __CLR4_2_08qf8qflnxz233t.R.inc(17292);org.junit.Assert.assertNotNull(element10);
        __CLR4_2_08qf8qflnxz233t.R.inc(17293);org.junit.Assert.assertNotNull(element11);
        __CLR4_2_08qf8qflnxz233t.R.inc(17294);org.junit.Assert.assertNotNull(element13);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test238() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),17295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0rc5z3gdcf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test238",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),17295,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0rc5z3gdcf() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(17295);
        __CLR4_2_08qf8qflnxz233t.R.inc(17296);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(17297)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(17298)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(17299);System.out.format("%n%s%n", "RegressionTest0.test238");
        }__CLR4_2_08qf8qflnxz233t.R.inc(17300);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17301);java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        __CLR4_2_08qf8qflnxz233t.R.inc(17302);java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        __CLR4_2_08qf8qflnxz233t.R.inc(17303);boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        __CLR4_2_08qf8qflnxz233t.R.inc(17304);org.jsoup.nodes.Element element7 = element1.classNames((java.util.Set<java.lang.String>) strSet5);
        __CLR4_2_08qf8qflnxz233t.R.inc(17305);org.jsoup.nodes.Element element10 = element1.attr("<hi!></hi!>", "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17306);java.lang.String str11 = element10.toString();
        __CLR4_2_08qf8qflnxz233t.R.inc(17307);org.jsoup.select.Elements elements13 = element10.getElementsByTag("<hi!></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(17308);java.util.List<org.jsoup.nodes.Node> nodeList14 = element10.childNodesCopy();
        __CLR4_2_08qf8qflnxz233t.R.inc(17309);org.jsoup.select.Elements elements17 = element10.getElementsByAttributeValueEnding("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>", "<hi! class=\"\"></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(17310);org.junit.Assert.assertNotNull(strArray4);
        __CLR4_2_08qf8qflnxz233t.R.inc(17311);org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        __CLR4_2_08qf8qflnxz233t.R.inc(17312);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(17313);org.junit.Assert.assertNotNull(element10);
        __CLR4_2_08qf8qflnxz233t.R.inc(17314);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>" + "'", str11, "<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(17315);org.junit.Assert.assertNotNull(elements13);
        __CLR4_2_08qf8qflnxz233t.R.inc(17316);org.junit.Assert.assertNotNull(nodeList14);
        __CLR4_2_08qf8qflnxz233t.R.inc(17317);org.junit.Assert.assertNotNull(elements17);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test239() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),17318);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ul5xvxdd2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test239",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),17318,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ul5xvxdd2() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(17318);
        __CLR4_2_08qf8qflnxz233t.R.inc(17319);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(17320)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(17321)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(17322);System.out.format("%n%s%n", "RegressionTest0.test239");
        }__CLR4_2_08qf8qflnxz233t.R.inc(17323);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17324);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17325);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17326);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(17327);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(17328);org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17329);org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17330);java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element10.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17331);org.jsoup.nodes.Element element12 = element10.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(17332);int int13 = element10.siblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(17333);org.jsoup.select.Elements elements14 = element10.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(17334);java.util.List<org.jsoup.nodes.Node> nodeList15 = element10.childNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17335);org.jsoup.nodes.Element element17 = element10.toggleClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17336);boolean boolean18 = element4.equals((java.lang.Object) "");
        __CLR4_2_08qf8qflnxz233t.R.inc(17337);org.jsoup.select.Elements elements20 = element4.getElementsByIndexLessThan(100);
        __CLR4_2_08qf8qflnxz233t.R.inc(17338);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(17339);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(17340);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(17341);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(17342);org.junit.Assert.assertNotNull(element8);
        __CLR4_2_08qf8qflnxz233t.R.inc(17343);org.junit.Assert.assertNotNull(textNodeList11);
        __CLR4_2_08qf8qflnxz233t.R.inc(17344);org.junit.Assert.assertNotNull(element12);
        __CLR4_2_08qf8qflnxz233t.R.inc(17345);org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(17346);org.junit.Assert.assertNotNull(elements14);
        __CLR4_2_08qf8qflnxz233t.R.inc(17347);org.junit.Assert.assertNotNull(nodeList15);
        __CLR4_2_08qf8qflnxz233t.R.inc(17348);org.junit.Assert.assertNotNull(element17);
        __CLR4_2_08qf8qflnxz233t.R.inc(17349);org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(17350);org.junit.Assert.assertNotNull(elements20);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test240() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),17351);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0v215b7ddz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test240",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),17351,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0v215b7ddz() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(17351);
        __CLR4_2_08qf8qflnxz233t.R.inc(17352);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(17353)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(17354)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(17355);System.out.format("%n%s%n", "RegressionTest0.test240");
        }__CLR4_2_08qf8qflnxz233t.R.inc(17356);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17357);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17358);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17359);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(17360);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17361);boolean boolean9 = element4.hasAttr("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17362);org.jsoup.nodes.Element element10 = element4.root();
        __CLR4_2_08qf8qflnxz233t.R.inc(17363);org.jsoup.select.Elements elements11 = element4.getAllElements();
        __CLR4_2_08qf8qflnxz233t.R.inc(17364);org.jsoup.nodes.TextNode[] textNodeArray13 = new org.jsoup.nodes.TextNode[] {};
        __CLR4_2_08qf8qflnxz233t.R.inc(17365);java.util.ArrayList<org.jsoup.nodes.TextNode> textNodeList14 = new java.util.ArrayList<org.jsoup.nodes.TextNode>();
        __CLR4_2_08qf8qflnxz233t.R.inc(17366);boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList14, textNodeArray13);
        __CLR4_2_08qf8qflnxz233t.R.inc(17367);org.jsoup.nodes.Element element16 = element4.insertChildren((int) (short) 0, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList14);
        __CLR4_2_08qf8qflnxz233t.R.inc(17368);org.jsoup.nodes.Element element18 = element4.prependElement("<hi! class=\"\"></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(17369);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(17370);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(17371);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(17372);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(17373);org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(17374);org.junit.Assert.assertNotNull(element10);
        __CLR4_2_08qf8qflnxz233t.R.inc(17375);org.junit.Assert.assertNotNull(elements11);
        __CLR4_2_08qf8qflnxz233t.R.inc(17376);org.junit.Assert.assertNotNull(textNodeArray13);
        __CLR4_2_08qf8qflnxz233t.R.inc(17377);org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(17378);org.junit.Assert.assertNotNull(element16);
        __CLR4_2_08qf8qflnxz233t.R.inc(17379);org.junit.Assert.assertNotNull(element18);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test241() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),17380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0yb143odes();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test241",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),17380,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0yb143odes() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(17380);
        __CLR4_2_08qf8qflnxz233t.R.inc(17381);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(17382)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(17383)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(17384);System.out.format("%n%s%n", "RegressionTest0.test241");
        }__CLR4_2_08qf8qflnxz233t.R.inc(17385);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17386);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17387);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17388);org.jsoup.nodes.Document document5 = element1.ownerDocument();
        __CLR4_2_08qf8qflnxz233t.R.inc(17389);org.jsoup.nodes.Element element6 = element1.root();
        __CLR4_2_08qf8qflnxz233t.R.inc(17390);java.lang.String str7 = element1.className();
        __CLR4_2_08qf8qflnxz233t.R.inc(17391);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(17392);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(17393);org.junit.Assert.assertNull(document5);
        __CLR4_2_08qf8qflnxz233t.R.inc(17394);org.junit.Assert.assertNotNull(element6);
        __CLR4_2_08qf8qflnxz233t.R.inc(17395);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test242() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),17396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0xh2z2zdf8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test242",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),17396,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0xh2z2zdf8() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(17396);
        __CLR4_2_08qf8qflnxz233t.R.inc(17397);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(17398)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(17399)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(17400);System.out.format("%n%s%n", "RegressionTest0.test242");
        }__CLR4_2_08qf8qflnxz233t.R.inc(17401);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17402);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17403);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17404);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(17405);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(17406);org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17407);org.jsoup.nodes.Element element9 = element8.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17408);org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17409);java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17410);org.jsoup.nodes.Element element13 = element11.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(17411);java.lang.String str14 = element11.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(17412);org.jsoup.nodes.Element element15 = element11.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(17413);java.util.regex.Pattern pattern17 = null;
        __CLR4_2_08qf8qflnxz233t.R.inc(17414);org.jsoup.select.Elements elements18 = element11.getElementsByAttributeValueMatching("hi!", pattern17);
        __CLR4_2_08qf8qflnxz233t.R.inc(17415);boolean boolean19 = element9.equals((java.lang.Object) pattern17);
        __CLR4_2_08qf8qflnxz233t.R.inc(17416);org.jsoup.nodes.Element element20 = element9.clone();
        __CLR4_2_08qf8qflnxz233t.R.inc(17417);org.jsoup.select.Elements elements22 = element20.getElementsMatchingText("hi!.hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17418);org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17419);java.util.List<org.jsoup.nodes.TextNode> textNodeList25 = element24.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17420);org.jsoup.nodes.Element element27 = element24.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17421);java.lang.String str28 = element27.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(17422);org.jsoup.nodes.Element element30 = element27.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17423);java.lang.String str31 = element27.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(17424);org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17425);java.util.List<org.jsoup.nodes.TextNode> textNodeList35 = element34.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17426);org.jsoup.nodes.Element element36 = element27.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList35);
        __CLR4_2_08qf8qflnxz233t.R.inc(17427);java.lang.String str37 = element27.val();
        __CLR4_2_08qf8qflnxz233t.R.inc(17428);org.jsoup.nodes.Element element38 = element27.empty();
        __CLR4_2_08qf8qflnxz233t.R.inc(17429);java.lang.String str39 = element38.outerHtml();
        __CLR4_2_08qf8qflnxz233t.R.inc(17430);org.jsoup.nodes.Document document40 = element38.ownerDocument();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(17431);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(17432);org.jsoup.nodes.Element element41 = element20.prependChild((org.jsoup.nodes.Node) document40);
            __CLR4_2_08qf8qflnxz233t.R.inc(17433);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(17434);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(17435);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(17436);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(17437);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(17438);org.junit.Assert.assertNotNull(element8);
        __CLR4_2_08qf8qflnxz233t.R.inc(17439);org.junit.Assert.assertNotNull(element9);
        __CLR4_2_08qf8qflnxz233t.R.inc(17440);org.junit.Assert.assertNotNull(textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(17441);org.junit.Assert.assertNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(17442);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17443);org.junit.Assert.assertNotNull(element15);
        __CLR4_2_08qf8qflnxz233t.R.inc(17444);org.junit.Assert.assertNotNull(elements18);
        __CLR4_2_08qf8qflnxz233t.R.inc(17445);org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(17446);org.junit.Assert.assertNotNull(element20);
        __CLR4_2_08qf8qflnxz233t.R.inc(17447);org.junit.Assert.assertNotNull(elements22);
        __CLR4_2_08qf8qflnxz233t.R.inc(17448);org.junit.Assert.assertNotNull(textNodeList25);
        __CLR4_2_08qf8qflnxz233t.R.inc(17449);org.junit.Assert.assertNotNull(element27);
        __CLR4_2_08qf8qflnxz233t.R.inc(17450);org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(17451);org.junit.Assert.assertNotNull(element30);
        __CLR4_2_08qf8qflnxz233t.R.inc(17452);org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(17453);org.junit.Assert.assertNotNull(textNodeList35);
        __CLR4_2_08qf8qflnxz233t.R.inc(17454);org.junit.Assert.assertNotNull(element36);
        __CLR4_2_08qf8qflnxz233t.R.inc(17455);org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(17456);org.junit.Assert.assertNotNull(element38);
        __CLR4_2_08qf8qflnxz233t.R.inc(17457);org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<hi! class=\"\"></hi!>" + "'", str39, "<hi! class=\"\"></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(17458);org.junit.Assert.assertNull(document40);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test243() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),17459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0u830aidgz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test243",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),17459,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0u830aidgz() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(17459);
        __CLR4_2_08qf8qflnxz233t.R.inc(17460);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(17461)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(17462)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(17463);System.out.format("%n%s%n", "RegressionTest0.test243");
        }__CLR4_2_08qf8qflnxz233t.R.inc(17464);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17465);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17466);org.jsoup.nodes.Node node3 = element1.previousSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(17467);java.lang.String str4 = element1.id();
        __CLR4_2_08qf8qflnxz233t.R.inc(17468);org.jsoup.nodes.Element element6 = element1.removeClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17469);org.jsoup.nodes.Element element7 = element6.clone();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(17470);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(17471);java.lang.String str9 = element6.absUrl("");
            __CLR4_2_08qf8qflnxz233t.R.inc(17472);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(17473);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(17474);org.junit.Assert.assertNull(node3);
        __CLR4_2_08qf8qflnxz233t.R.inc(17475);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(17476);org.junit.Assert.assertNotNull(element6);
        __CLR4_2_08qf8qflnxz233t.R.inc(17477);org.junit.Assert.assertNotNull(element7);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test244() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),17478);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0qz31i1dhi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test244",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),17478,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0qz31i1dhi() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(17478);
        __CLR4_2_08qf8qflnxz233t.R.inc(17479);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(17480)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(17481)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(17482);System.out.format("%n%s%n", "RegressionTest0.test244");
        }__CLR4_2_08qf8qflnxz233t.R.inc(17483);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17484);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17485);org.jsoup.nodes.Element element3 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(17486);int int4 = element1.siblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(17487);java.lang.String str5 = element1.baseUri();
        __CLR4_2_08qf8qflnxz233t.R.inc(17488);org.jsoup.nodes.Element element6 = element1.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17489);java.lang.String str8 = element1.absUrl("<hi!></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(17490);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(17491);org.junit.Assert.assertNotNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(17492);org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(17493);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(17494);org.junit.Assert.assertNotNull(element6);
        __CLR4_2_08qf8qflnxz233t.R.inc(17495);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test245() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),17496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0nq32pkdi0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test245",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),17496,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0nq32pkdi0() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(17496);
        __CLR4_2_08qf8qflnxz233t.R.inc(17497);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(17498)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(17499)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(17500);System.out.format("%n%s%n", "RegressionTest0.test245");
        }__CLR4_2_08qf8qflnxz233t.R.inc(17501);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17502);org.jsoup.nodes.Element element2 = element1.empty();
        __CLR4_2_08qf8qflnxz233t.R.inc(17503);org.jsoup.select.Evaluator evaluator3 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(17504);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(17505);boolean boolean4 = element2.is(evaluator3);
            __CLR4_2_08qf8qflnxz233t.R.inc(17506);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(17507);org.junit.Assert.assertNotNull(element2);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test246() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),17508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0kh33x3dic();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test246",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),17508,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0kh33x3dic() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(17508);
        __CLR4_2_08qf8qflnxz233t.R.inc(17509);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(17510)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(17511)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(17512);System.out.format("%n%s%n", "RegressionTest0.test246");
        }__CLR4_2_08qf8qflnxz233t.R.inc(17513);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17514);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17515);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17516);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(17517);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17518);boolean boolean9 = element4.hasAttr("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17519);org.jsoup.select.Elements elements11 = element4.getElementsContainingText("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17520);org.jsoup.nodes.Element element13 = element4.prependText("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17521);org.jsoup.select.Elements elements14 = element13.getAllElements();
        __CLR4_2_08qf8qflnxz233t.R.inc(17522);java.lang.String str15 = element13.val();
        __CLR4_2_08qf8qflnxz233t.R.inc(17523);java.lang.String str16 = element13.tagName();
        __CLR4_2_08qf8qflnxz233t.R.inc(17524);org.jsoup.select.Elements elements17 = element13.children();
        __CLR4_2_08qf8qflnxz233t.R.inc(17525);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(17526);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(17527);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(17528);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(17529);org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(17530);org.junit.Assert.assertNotNull(elements11);
        __CLR4_2_08qf8qflnxz233t.R.inc(17531);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(17532);org.junit.Assert.assertNotNull(elements14);
        __CLR4_2_08qf8qflnxz233t.R.inc(17533);org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(17534);org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17535);org.junit.Assert.assertNotNull(elements17);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test247() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),17536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0h8354mdj4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test247",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),17536,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0h8354mdj4() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(17536);
        __CLR4_2_08qf8qflnxz233t.R.inc(17537);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(17538)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(17539)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(17540);System.out.format("%n%s%n", "RegressionTest0.test247");
        }__CLR4_2_08qf8qflnxz233t.R.inc(17541);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17542);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17543);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17544);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(17545);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(17546);element4.setBaseUri("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17547);org.jsoup.nodes.Element element9 = element4.previousElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(17548);java.lang.String str10 = element4.cssSelector();
        __CLR4_2_08qf8qflnxz233t.R.inc(17549);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(17550);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(17551);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(17552);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(17553);org.junit.Assert.assertNull(element9);
        __CLR4_2_08qf8qflnxz233t.R.inc(17554);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test248() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),17555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0dz36c5djn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test248",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),17555,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0dz36c5djn() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(17555);
        __CLR4_2_08qf8qflnxz233t.R.inc(17556);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(17557)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(17558)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(17559);System.out.format("%n%s%n", "RegressionTest0.test248");
        }__CLR4_2_08qf8qflnxz233t.R.inc(17560);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17561);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17562);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(17563);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(17564);org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17565);java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17566);org.jsoup.nodes.Element element9 = element6.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17567);java.lang.String str10 = element9.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(17568);org.jsoup.nodes.Element element12 = element9.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17569);java.lang.String str13 = element9.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(17570);org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17571);java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17572);org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        __CLR4_2_08qf8qflnxz233t.R.inc(17573);org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(17574);int int20 = element18.elementSiblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(17575);org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(17576);org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17577);java.util.List<org.jsoup.nodes.TextNode> textNodeList24 = element23.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17578);org.jsoup.nodes.Element element26 = element23.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17579);java.lang.String str27 = element26.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(17580);org.jsoup.select.Elements elements28 = element26.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(17581);org.jsoup.nodes.Element element30 = element26.toggleClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17582);org.jsoup.nodes.Element element31 = element30.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17583);org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17584);java.util.List<org.jsoup.nodes.TextNode> textNodeList34 = element33.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17585);org.jsoup.nodes.Element element35 = element33.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(17586);java.lang.String str36 = element33.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(17587);org.jsoup.nodes.Element element37 = element33.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(17588);java.util.regex.Pattern pattern39 = null;
        __CLR4_2_08qf8qflnxz233t.R.inc(17589);org.jsoup.select.Elements elements40 = element33.getElementsByAttributeValueMatching("hi!", pattern39);
        __CLR4_2_08qf8qflnxz233t.R.inc(17590);boolean boolean41 = element31.equals((java.lang.Object) pattern39);
        __CLR4_2_08qf8qflnxz233t.R.inc(17591);org.jsoup.nodes.Element element42 = element18.after((org.jsoup.nodes.Node) element31);
        __CLR4_2_08qf8qflnxz233t.R.inc(17592);org.jsoup.select.Elements elements45 = element31.getElementsByAttributeValue("<hi!></hi!>", "<hi!></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(17593);org.jsoup.nodes.Element element47 = element31.removeAttr("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(17594);int int48 = element31.siblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(17595);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(17596);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(17597);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17598);org.junit.Assert.assertNotNull(textNodeList7);
        __CLR4_2_08qf8qflnxz233t.R.inc(17599);org.junit.Assert.assertNotNull(element9);
        __CLR4_2_08qf8qflnxz233t.R.inc(17600);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(17601);org.junit.Assert.assertNotNull(element12);
        __CLR4_2_08qf8qflnxz233t.R.inc(17602);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(17603);org.junit.Assert.assertNotNull(textNodeList17);
        __CLR4_2_08qf8qflnxz233t.R.inc(17604);org.junit.Assert.assertNotNull(element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(17605);org.junit.Assert.assertNull(element19);
        __CLR4_2_08qf8qflnxz233t.R.inc(17606);org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(17607);org.junit.Assert.assertNotNull(element21);
        __CLR4_2_08qf8qflnxz233t.R.inc(17608);org.junit.Assert.assertNotNull(textNodeList24);
        __CLR4_2_08qf8qflnxz233t.R.inc(17609);org.junit.Assert.assertNotNull(element26);
        __CLR4_2_08qf8qflnxz233t.R.inc(17610);org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(17611);org.junit.Assert.assertNotNull(elements28);
        __CLR4_2_08qf8qflnxz233t.R.inc(17612);org.junit.Assert.assertNotNull(element30);
        __CLR4_2_08qf8qflnxz233t.R.inc(17613);org.junit.Assert.assertNotNull(element31);
        __CLR4_2_08qf8qflnxz233t.R.inc(17614);org.junit.Assert.assertNotNull(textNodeList34);
        __CLR4_2_08qf8qflnxz233t.R.inc(17615);org.junit.Assert.assertNull(element35);
        __CLR4_2_08qf8qflnxz233t.R.inc(17616);org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17617);org.junit.Assert.assertNotNull(element37);
        __CLR4_2_08qf8qflnxz233t.R.inc(17618);org.junit.Assert.assertNotNull(elements40);
        __CLR4_2_08qf8qflnxz233t.R.inc(17619);org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(17620);org.junit.Assert.assertNotNull(element42);
        __CLR4_2_08qf8qflnxz233t.R.inc(17621);org.junit.Assert.assertNotNull(elements45);
        __CLR4_2_08qf8qflnxz233t.R.inc(17622);org.junit.Assert.assertNotNull(element47);
        __CLR4_2_08qf8qflnxz233t.R.inc(17623);org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test249() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),17624);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0aq37jodlk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test249",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),17624,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0aq37jodlk() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(17624);
        __CLR4_2_08qf8qflnxz233t.R.inc(17625);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(17626)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(17627)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(17628);System.out.format("%n%s%n", "RegressionTest0.test249");
        }__CLR4_2_08qf8qflnxz233t.R.inc(17629);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17630);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17631);org.jsoup.nodes.Node node3 = element1.previousSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(17632);java.lang.String str4 = element1.id();
        __CLR4_2_08qf8qflnxz233t.R.inc(17633);org.jsoup.nodes.Element element6 = element1.removeClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17634);boolean boolean7 = element6.hasText();
        __CLR4_2_08qf8qflnxz233t.R.inc(17635);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(17636);org.junit.Assert.assertNull(node3);
        __CLR4_2_08qf8qflnxz233t.R.inc(17637);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(17638);org.junit.Assert.assertNotNull(element6);
        __CLR4_2_08qf8qflnxz233t.R.inc(17639);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test250() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),17640);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0a9804edm0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test250",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),17640,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0a9804edm0() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(17640);
        __CLR4_2_08qf8qflnxz233t.R.inc(17641);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(17642)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(17643)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(17644);System.out.format("%n%s%n", "RegressionTest0.test250");
        }__CLR4_2_08qf8qflnxz233t.R.inc(17645);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17646);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17647);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(17648);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(17649);org.jsoup.nodes.Element element5 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(17650);java.util.regex.Pattern pattern7 = null;
        __CLR4_2_08qf8qflnxz233t.R.inc(17651);org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", pattern7);
        __CLR4_2_08qf8qflnxz233t.R.inc(17652);org.jsoup.nodes.Element element11 = element1.attr("", false);
        __CLR4_2_08qf8qflnxz233t.R.inc(17653);java.util.List<org.jsoup.nodes.Node> nodeList12 = element1.childNodesCopy();
        __CLR4_2_08qf8qflnxz233t.R.inc(17654);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(17655);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(17656);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17657);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(17658);org.junit.Assert.assertNotNull(elements8);
        __CLR4_2_08qf8qflnxz233t.R.inc(17659);org.junit.Assert.assertNotNull(element11);
        __CLR4_2_08qf8qflnxz233t.R.inc(17660);org.junit.Assert.assertNotNull(nodeList12);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test251() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),17661);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_07081bxdml();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test251",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),17661,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_07081bxdml() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(17661);
        __CLR4_2_08qf8qflnxz233t.R.inc(17662);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(17663)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(17664)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(17665);System.out.format("%n%s%n", "RegressionTest0.test251");
        }__CLR4_2_08qf8qflnxz233t.R.inc(17666);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17667);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17668);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17669);org.jsoup.nodes.Element element5 = element1.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17670);java.lang.String str6 = element5.id();
        __CLR4_2_08qf8qflnxz233t.R.inc(17671);java.util.List<org.jsoup.nodes.Node> nodeList7 = element5.siblingNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17672);org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17673);java.util.List<org.jsoup.nodes.TextNode> textNodeList10 = element9.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17674);org.jsoup.nodes.Element element12 = element9.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17675);java.lang.String str13 = element12.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(17676);org.jsoup.nodes.Element element15 = element12.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17677);org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17678);java.util.List<org.jsoup.nodes.TextNode> textNodeList18 = element17.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17679);org.jsoup.nodes.Element element20 = element17.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17680);java.lang.String str21 = element20.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(17681);org.jsoup.nodes.Element element23 = element20.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17682);java.lang.String str24 = element20.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(17683);org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17684);java.util.List<org.jsoup.nodes.TextNode> textNodeList28 = element27.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17685);org.jsoup.nodes.Element element29 = element20.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList28);
        __CLR4_2_08qf8qflnxz233t.R.inc(17686);org.jsoup.nodes.Element element30 = element12.appendChild((org.jsoup.nodes.Node) element29);
        __CLR4_2_08qf8qflnxz233t.R.inc(17687);boolean boolean31 = element5.equals((java.lang.Object) element29);
        __CLR4_2_08qf8qflnxz233t.R.inc(17688);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(17689);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(17690);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(17691);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(17692);org.junit.Assert.assertNotNull(nodeList7);
        __CLR4_2_08qf8qflnxz233t.R.inc(17693);org.junit.Assert.assertNotNull(textNodeList10);
        __CLR4_2_08qf8qflnxz233t.R.inc(17694);org.junit.Assert.assertNotNull(element12);
        __CLR4_2_08qf8qflnxz233t.R.inc(17695);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(17696);org.junit.Assert.assertNotNull(element15);
        __CLR4_2_08qf8qflnxz233t.R.inc(17697);org.junit.Assert.assertNotNull(textNodeList18);
        __CLR4_2_08qf8qflnxz233t.R.inc(17698);org.junit.Assert.assertNotNull(element20);
        __CLR4_2_08qf8qflnxz233t.R.inc(17699);org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(17700);org.junit.Assert.assertNotNull(element23);
        __CLR4_2_08qf8qflnxz233t.R.inc(17701);org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(17702);org.junit.Assert.assertNotNull(textNodeList28);
        __CLR4_2_08qf8qflnxz233t.R.inc(17703);org.junit.Assert.assertNotNull(element29);
        __CLR4_2_08qf8qflnxz233t.R.inc(17704);org.junit.Assert.assertNotNull(element30);
        __CLR4_2_08qf8qflnxz233t.R.inc(17705);org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test252() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),17706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_03r82jgdnu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test252",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),17706,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_03r82jgdnu() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(17706);
        __CLR4_2_08qf8qflnxz233t.R.inc(17707);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(17708)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(17709)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(17710);System.out.format("%n%s%n", "RegressionTest0.test252");
        }__CLR4_2_08qf8qflnxz233t.R.inc(17711);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17712);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17713);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17714);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(17715);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17716);boolean boolean9 = element4.hasAttr("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17717);org.jsoup.select.Elements elements11 = element4.getElementsContainingText("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17718);org.jsoup.nodes.Element element13 = element4.prependText("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17719);java.lang.String str14 = element13.data();
        __CLR4_2_08qf8qflnxz233t.R.inc(17720);org.jsoup.nodes.Element element16 = element13.appendText("<hi!></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(17721);org.jsoup.nodes.Element element18 = element13.appendText("<hi!>\n hi!\n</hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(17722);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(17723);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(17724);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(17725);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(17726);org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(17727);org.junit.Assert.assertNotNull(elements11);
        __CLR4_2_08qf8qflnxz233t.R.inc(17728);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(17729);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(17730);org.junit.Assert.assertNotNull(element16);
        __CLR4_2_08qf8qflnxz233t.R.inc(17731);org.junit.Assert.assertNotNull(element18);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test253() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),17732);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0i83qzdok();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test253",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),17732,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0i83qzdok() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(17732);
        __CLR4_2_08qf8qflnxz233t.R.inc(17733);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(17734)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(17735)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(17736);System.out.format("%n%s%n", "RegressionTest0.test253");
        }__CLR4_2_08qf8qflnxz233t.R.inc(17737);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17738);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17739);org.jsoup.nodes.Element element3 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(17740);int int4 = element1.siblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(17741);org.jsoup.nodes.Element element6 = element1.html("<hi! class=\"\"></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(17742);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(17743);org.junit.Assert.assertNotNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(17744);org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(17745);org.junit.Assert.assertNotNull(element6);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test254() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),17746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_02qrv1idoy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test254",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),17746,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_02qrv1idoy() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(17746);
        __CLR4_2_08qf8qflnxz233t.R.inc(17747);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(17748)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(17749)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(17750);System.out.format("%n%s%n", "RegressionTest0.test254");
        }__CLR4_2_08qf8qflnxz233t.R.inc(17751);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17752);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17753);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17754);org.jsoup.nodes.Element element5 = element1.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17755);java.lang.String str6 = element5.id();
        __CLR4_2_08qf8qflnxz233t.R.inc(17756);org.jsoup.select.Elements elements8 = element5.getElementsByClass("<hi! class=\"\"></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(17757);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(17758);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(17759);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(17760);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(17761);org.junit.Assert.assertNotNull(elements8);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test255() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),17762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_05zrttzdpe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test255",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),17762,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_05zrttzdpe() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(17762);
        __CLR4_2_08qf8qflnxz233t.R.inc(17763);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(17764)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(17765)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(17766);System.out.format("%n%s%n", "RegressionTest0.test255");
        }__CLR4_2_08qf8qflnxz233t.R.inc(17767);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17768);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17769);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17770);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(17771);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17772);java.lang.String str8 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(17773);org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17774);java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17775);org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(17776);int int14 = element13.childNodeSize();
        __CLR4_2_08qf8qflnxz233t.R.inc(17777);org.jsoup.select.Elements elements17 = element13.getElementsByAttributeValueContaining("hi!", "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17778);boolean boolean19 = element13.hasAttr("<hi! class=\"\"></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(17779);org.jsoup.nodes.Element element21 = element13.addClass("<hi! class=\"\"></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(17780);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(17781);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(17782);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(17783);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(17784);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(17785);org.junit.Assert.assertNotNull(textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(17786);org.junit.Assert.assertNotNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(17787);org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(17788);org.junit.Assert.assertNotNull(elements17);
        __CLR4_2_08qf8qflnxz233t.R.inc(17789);org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(17790);org.junit.Assert.assertNotNull(element21);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test256() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),17791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_098rsmgdq7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test256",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),17791,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_098rsmgdq7() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(17791);
        __CLR4_2_08qf8qflnxz233t.R.inc(17792);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(17793)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(17794)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(17795);System.out.format("%n%s%n", "RegressionTest0.test256");
        }__CLR4_2_08qf8qflnxz233t.R.inc(17796);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17797);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17798);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(17799);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(17800);org.jsoup.nodes.Element element5 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(17801);org.jsoup.nodes.Element element7 = element1.addClass("<hi!></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(17802);boolean boolean9 = element1.hasAttr("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17803);org.jsoup.select.Evaluator evaluator10 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(17804);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(17805);boolean boolean11 = element1.is(evaluator10);
            __CLR4_2_08qf8qflnxz233t.R.inc(17806);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(17807);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(17808);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(17809);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17810);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(17811);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(17812);org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test257() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),17813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0chrrexdqt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test257",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),17813,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0chrrexdqt() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(17813);
        __CLR4_2_08qf8qflnxz233t.R.inc(17814);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(17815)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(17816)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(17817);System.out.format("%n%s%n", "RegressionTest0.test257");
        }__CLR4_2_08qf8qflnxz233t.R.inc(17818);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17819);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17820);org.jsoup.nodes.Element element3 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(17821);org.jsoup.select.Elements elements5 = element3.getElementsByClass("<hi!>\n hi!\n</hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(17822);org.jsoup.nodes.Element element6 = element3.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17823);org.jsoup.select.NodeFilter nodeFilter7 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(17824);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(17825);org.jsoup.nodes.Element element8 = element3.filter(nodeFilter7);
            __CLR4_2_08qf8qflnxz233t.R.inc(17826);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(17827);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(17828);org.junit.Assert.assertNotNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(17829);org.junit.Assert.assertNotNull(elements5);
        __CLR4_2_08qf8qflnxz233t.R.inc(17830);org.junit.Assert.assertNotNull(element6);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test258() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),17831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0fqrq7edrb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test258",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),17831,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0fqrq7edrb() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(17831);
        __CLR4_2_08qf8qflnxz233t.R.inc(17832);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(17833)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(17834)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(17835);System.out.format("%n%s%n", "RegressionTest0.test258");
        }__CLR4_2_08qf8qflnxz233t.R.inc(17836);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17837);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17838);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(17839);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(17840);org.jsoup.nodes.Element element5 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(17841);org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17842);org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17843);java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element10.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17844);org.jsoup.nodes.Element element12 = element10.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(17845);int int13 = element10.siblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(17846);org.jsoup.select.Elements elements14 = element10.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(17847);java.util.List<org.jsoup.nodes.Node> nodeList15 = element10.childNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17848);org.jsoup.nodes.Element element17 = element10.toggleClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17849);org.jsoup.nodes.Element element18 = element1.prependChild((org.jsoup.nodes.Node) element17);
        __CLR4_2_08qf8qflnxz233t.R.inc(17850);org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17851);java.util.List<org.jsoup.nodes.TextNode> textNodeList21 = element20.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17852);org.jsoup.nodes.Element element23 = element20.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17853);java.lang.String str24 = element23.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(17854);org.jsoup.select.Elements elements25 = element23.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(17855);int int26 = element23.childNodeSize();
        __CLR4_2_08qf8qflnxz233t.R.inc(17856);java.util.Set<java.lang.String> strSet27 = element23.classNames();
        __CLR4_2_08qf8qflnxz233t.R.inc(17857);org.jsoup.nodes.Element element28 = element1.classNames(strSet27);
        __CLR4_2_08qf8qflnxz233t.R.inc(17858);org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17859);java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "" };
        __CLR4_2_08qf8qflnxz233t.R.inc(17860);java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        __CLR4_2_08qf8qflnxz233t.R.inc(17861);boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        __CLR4_2_08qf8qflnxz233t.R.inc(17862);org.jsoup.nodes.Element element36 = element30.classNames((java.util.Set<java.lang.String>) strSet34);
        __CLR4_2_08qf8qflnxz233t.R.inc(17863);org.jsoup.nodes.Element element37 = element1.classNames((java.util.Set<java.lang.String>) strSet34);
        __CLR4_2_08qf8qflnxz233t.R.inc(17864);org.jsoup.nodes.Element element39 = element1.val("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17865);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(17866);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(17867);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17868);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(17869);org.junit.Assert.assertNotNull(elements8);
        __CLR4_2_08qf8qflnxz233t.R.inc(17870);org.junit.Assert.assertNotNull(textNodeList11);
        __CLR4_2_08qf8qflnxz233t.R.inc(17871);org.junit.Assert.assertNotNull(element12);
        __CLR4_2_08qf8qflnxz233t.R.inc(17872);org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(17873);org.junit.Assert.assertNotNull(elements14);
        __CLR4_2_08qf8qflnxz233t.R.inc(17874);org.junit.Assert.assertNotNull(nodeList15);
        __CLR4_2_08qf8qflnxz233t.R.inc(17875);org.junit.Assert.assertNotNull(element17);
        __CLR4_2_08qf8qflnxz233t.R.inc(17876);org.junit.Assert.assertNotNull(element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(17877);org.junit.Assert.assertNotNull(textNodeList21);
        __CLR4_2_08qf8qflnxz233t.R.inc(17878);org.junit.Assert.assertNotNull(element23);
        __CLR4_2_08qf8qflnxz233t.R.inc(17879);org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(17880);org.junit.Assert.assertNotNull(elements25);
        __CLR4_2_08qf8qflnxz233t.R.inc(17881);org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(17882);org.junit.Assert.assertNotNull(strSet27);
        __CLR4_2_08qf8qflnxz233t.R.inc(17883);org.junit.Assert.assertNotNull(element28);
        __CLR4_2_08qf8qflnxz233t.R.inc(17884);org.junit.Assert.assertNotNull(strArray33);
        __CLR4_2_08qf8qflnxz233t.R.inc(17885);org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        __CLR4_2_08qf8qflnxz233t.R.inc(17886);org.junit.Assert.assertNotNull(element36);
        __CLR4_2_08qf8qflnxz233t.R.inc(17887);org.junit.Assert.assertNotNull(element37);
        __CLR4_2_08qf8qflnxz233t.R.inc(17888);org.junit.Assert.assertNotNull(element39);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test259() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),17889);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0izrozvdsx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test259",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),17889,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0izrozvdsx() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(17889);
        __CLR4_2_08qf8qflnxz233t.R.inc(17890);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(17891)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(17892)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(17893);System.out.format("%n%s%n", "RegressionTest0.test259");
        }__CLR4_2_08qf8qflnxz233t.R.inc(17894);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17895);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17896);org.jsoup.nodes.Element element3 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(17897);int int4 = element1.siblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(17898);org.jsoup.select.Elements elements5 = element1.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(17899);org.jsoup.nodes.Element element7 = element1.prependText("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17900);element1.setBaseUri("<hi! class=\"\"></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(17901);java.lang.String str10 = element1.tagName();
        __CLR4_2_08qf8qflnxz233t.R.inc(17902);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(17903);org.junit.Assert.assertNotNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(17904);org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(17905);org.junit.Assert.assertNotNull(elements5);
        __CLR4_2_08qf8qflnxz233t.R.inc(17906);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(17907);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test260() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),17908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0jgmwf5dtg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test260",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),17908,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0jgmwf5dtg() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(17908);
        __CLR4_2_08qf8qflnxz233t.R.inc(17909);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(17910)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(17911)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(17912);System.out.format("%n%s%n", "RegressionTest0.test260");
        }__CLR4_2_08qf8qflnxz233t.R.inc(17913);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17914);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17915);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(17916);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(17917);org.jsoup.nodes.Element element5 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(17918);org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17919);org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17920);java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element10.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17921);org.jsoup.nodes.Element element12 = element10.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(17922);int int13 = element10.siblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(17923);org.jsoup.select.Elements elements14 = element10.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(17924);java.util.List<org.jsoup.nodes.Node> nodeList15 = element10.childNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17925);org.jsoup.nodes.Element element17 = element10.toggleClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17926);org.jsoup.nodes.Element element18 = element1.prependChild((org.jsoup.nodes.Node) element17);
        __CLR4_2_08qf8qflnxz233t.R.inc(17927);org.jsoup.select.Evaluator evaluator19 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(17928);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(17929);boolean boolean20 = element18.is(evaluator19);
            __CLR4_2_08qf8qflnxz233t.R.inc(17930);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(17931);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(17932);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(17933);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17934);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(17935);org.junit.Assert.assertNotNull(elements8);
        __CLR4_2_08qf8qflnxz233t.R.inc(17936);org.junit.Assert.assertNotNull(textNodeList11);
        __CLR4_2_08qf8qflnxz233t.R.inc(17937);org.junit.Assert.assertNotNull(element12);
        __CLR4_2_08qf8qflnxz233t.R.inc(17938);org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(17939);org.junit.Assert.assertNotNull(elements14);
        __CLR4_2_08qf8qflnxz233t.R.inc(17940);org.junit.Assert.assertNotNull(nodeList15);
        __CLR4_2_08qf8qflnxz233t.R.inc(17941);org.junit.Assert.assertNotNull(element17);
        __CLR4_2_08qf8qflnxz233t.R.inc(17942);org.junit.Assert.assertNotNull(element18);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test261() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),17943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0mpmv7mduf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test261",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),17943,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0mpmv7mduf() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(17943);
        __CLR4_2_08qf8qflnxz233t.R.inc(17944);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(17945)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(17946)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(17947);System.out.format("%n%s%n", "RegressionTest0.test261");
        }__CLR4_2_08qf8qflnxz233t.R.inc(17948);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17949);org.jsoup.nodes.Element element3 = element1.appendText("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17950);java.lang.String str4 = element1.wholeText();
        __CLR4_2_08qf8qflnxz233t.R.inc(17951);org.jsoup.select.Elements elements5 = element1.parents();
        __CLR4_2_08qf8qflnxz233t.R.inc(17952);org.jsoup.nodes.Node node6 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(17953);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(17954);org.jsoup.nodes.Element element7 = element1.prependChild(node6);
            __CLR4_2_08qf8qflnxz233t.R.inc(17955);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(17956);org.junit.Assert.assertNotNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(17957);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17958);org.junit.Assert.assertNotNull(elements5);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test262() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),17959);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0pymu03duv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test262",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),17959,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0pymu03duv() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(17959);
        __CLR4_2_08qf8qflnxz233t.R.inc(17960);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(17961)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(17962)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(17963);System.out.format("%n%s%n", "RegressionTest0.test262");
        }__CLR4_2_08qf8qflnxz233t.R.inc(17964);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17965);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17966);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(17967);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(17968);org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17969);java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17970);org.jsoup.nodes.Element element9 = element6.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17971);java.lang.String str10 = element9.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(17972);org.jsoup.nodes.Element element12 = element9.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(17973);java.lang.String str13 = element9.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(17974);org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17975);java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17976);org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        __CLR4_2_08qf8qflnxz233t.R.inc(17977);org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(17978);int int20 = element18.elementSiblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(17979);org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(17980);java.util.List<org.jsoup.nodes.Node> nodeList22 = element21.childNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(17981);java.lang.String str23 = element21.nodeName();
        __CLR4_2_08qf8qflnxz233t.R.inc(17982);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(17983);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(17984);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(17985);org.junit.Assert.assertNotNull(textNodeList7);
        __CLR4_2_08qf8qflnxz233t.R.inc(17986);org.junit.Assert.assertNotNull(element9);
        __CLR4_2_08qf8qflnxz233t.R.inc(17987);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(17988);org.junit.Assert.assertNotNull(element12);
        __CLR4_2_08qf8qflnxz233t.R.inc(17989);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(17990);org.junit.Assert.assertNotNull(textNodeList17);
        __CLR4_2_08qf8qflnxz233t.R.inc(17991);org.junit.Assert.assertNotNull(element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(17992);org.junit.Assert.assertNull(element19);
        __CLR4_2_08qf8qflnxz233t.R.inc(17993);org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(17994);org.junit.Assert.assertNotNull(element21);
        __CLR4_2_08qf8qflnxz233t.R.inc(17995);org.junit.Assert.assertNotNull(nodeList22);
        __CLR4_2_08qf8qflnxz233t.R.inc(17996);org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test263() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),17997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0t7msskdvx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test263",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),17997,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0t7msskdvx() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(17997);
        __CLR4_2_08qf8qflnxz233t.R.inc(17998);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(17999)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(18000)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(18001);System.out.format("%n%s%n", "RegressionTest0.test263");
        }__CLR4_2_08qf8qflnxz233t.R.inc(18002);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(18003);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(18004);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(18005);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(18006);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(18007);org.jsoup.select.Elements elements8 = element7.children();
        __CLR4_2_08qf8qflnxz233t.R.inc(18008);org.jsoup.nodes.Element element9 = element7.root();
        __CLR4_2_08qf8qflnxz233t.R.inc(18009);org.jsoup.nodes.Attributes attributes10 = element9.attributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(18010);boolean boolean12 = element9.hasAttr("<hi! class=\"\"></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(18011);org.jsoup.nodes.Node node13 = element9.parentNode();
        __CLR4_2_08qf8qflnxz233t.R.inc(18012);org.jsoup.nodes.Element element14 = element9.parent();
        __CLR4_2_08qf8qflnxz233t.R.inc(18013);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(18014);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(18015);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(18016);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(18017);org.junit.Assert.assertNotNull(elements8);
        __CLR4_2_08qf8qflnxz233t.R.inc(18018);org.junit.Assert.assertNotNull(element9);
        __CLR4_2_08qf8qflnxz233t.R.inc(18019);org.junit.Assert.assertNotNull(attributes10);
        __CLR4_2_08qf8qflnxz233t.R.inc(18020);org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(18021);org.junit.Assert.assertNull(node13);
        __CLR4_2_08qf8qflnxz233t.R.inc(18022);org.junit.Assert.assertNull(element14);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test264() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),18023);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0wgmrl1dwn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test264",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18023,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0wgmrl1dwn() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(18023);
        __CLR4_2_08qf8qflnxz233t.R.inc(18024);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(18025)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(18026)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(18027);System.out.format("%n%s%n", "RegressionTest0.test264");
        }__CLR4_2_08qf8qflnxz233t.R.inc(18028);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(18029);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(18030);org.jsoup.nodes.Element element3 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(18031);org.jsoup.select.Elements elements5 = element3.getElementsByClass("<hi!>\n hi!\n</hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(18032);org.jsoup.nodes.Element element6 = element3.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(18033);org.jsoup.nodes.Element element8 = element6.removeAttr("<hi!></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(18034);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(18035);org.junit.Assert.assertNotNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(18036);org.junit.Assert.assertNotNull(elements5);
        __CLR4_2_08qf8qflnxz233t.R.inc(18037);org.junit.Assert.assertNotNull(element6);
        __CLR4_2_08qf8qflnxz233t.R.inc(18038);org.junit.Assert.assertNotNull(element8);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test265() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),18039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0zbhblmdx3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test265",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18039,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0zbhblmdx3() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(18039);
        __CLR4_2_08qf8qflnxz233t.R.inc(18040);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(18041)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(18042)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(18043);System.out.format("%n%s%n", "RegressionTest0.test265");
        }__CLR4_2_08qf8qflnxz233t.R.inc(18044);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(18045);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(18046);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(18047);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(18048);org.jsoup.nodes.Element element7 = element4.addClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(18049);java.lang.Class<?> wildcardClass8 = element7.getClass();
        __CLR4_2_08qf8qflnxz233t.R.inc(18050);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(18051);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(18052);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(18053);org.junit.Assert.assertNotNull(element7);
        __CLR4_2_08qf8qflnxz233t.R.inc(18054);org.junit.Assert.assertNotNull(wildcardClass8);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test266() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),18055);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0w2hct5dxj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test266",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18055,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0w2hct5dxj() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(18055);
        __CLR4_2_08qf8qflnxz233t.R.inc(18056);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(18057)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(18058)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(18059);System.out.format("%n%s%n", "RegressionTest0.test266");
        }__CLR4_2_08qf8qflnxz233t.R.inc(18060);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(18061);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(18062);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(18063);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(18064);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(18065);int int7 = element4.childNodeSize();
        __CLR4_2_08qf8qflnxz233t.R.inc(18066);java.lang.String str8 = element4.wholeText();
        __CLR4_2_08qf8qflnxz233t.R.inc(18067);boolean boolean10 = element4.hasClass("<hi! class=\"\"></hi!>");
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(18068);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(18069);boolean boolean12 = element4.is("hi!");
            __CLR4_2_08qf8qflnxz233t.R.inc(18070);org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!': unexpected token at '!'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(18071);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(18072);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(18073);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(18074);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(18075);org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(18076);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(18077);org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test267() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),18078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0sthe0ody6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test267",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18078,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0sthe0ody6() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(18078);
        __CLR4_2_08qf8qflnxz233t.R.inc(18079);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(18080)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(18081)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(18082);System.out.format("%n%s%n", "RegressionTest0.test267");
        }__CLR4_2_08qf8qflnxz233t.R.inc(18083);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(18084);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(18085);org.jsoup.nodes.Element element4 = element1.removeAttr("");
        __CLR4_2_08qf8qflnxz233t.R.inc(18086);java.lang.String str5 = element4.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(18087);org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(18088);org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(18089);org.jsoup.nodes.Element element9 = element8.clearAttributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(18090);org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(18091);java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(18092);org.jsoup.nodes.Element element13 = element11.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(18093);java.lang.String str14 = element11.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(18094);org.jsoup.nodes.Element element15 = element11.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(18095);java.util.regex.Pattern pattern17 = null;
        __CLR4_2_08qf8qflnxz233t.R.inc(18096);org.jsoup.select.Elements elements18 = element11.getElementsByAttributeValueMatching("hi!", pattern17);
        __CLR4_2_08qf8qflnxz233t.R.inc(18097);boolean boolean19 = element9.equals((java.lang.Object) pattern17);
        __CLR4_2_08qf8qflnxz233t.R.inc(18098);org.jsoup.nodes.Element element20 = element9.clone();
        __CLR4_2_08qf8qflnxz233t.R.inc(18099);java.util.Map<java.lang.String, java.lang.String> strMap21 = element20.dataset();
        __CLR4_2_08qf8qflnxz233t.R.inc(18100);java.lang.String str22 = element20.wholeText();
        __CLR4_2_08qf8qflnxz233t.R.inc(18101);boolean boolean24 = element20.hasAttr("<hi! class=\"\"></hi!>");
        __CLR4_2_08qf8qflnxz233t.R.inc(18102);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(18103);org.junit.Assert.assertNotNull(element4);
        __CLR4_2_08qf8qflnxz233t.R.inc(18104);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(18105);org.junit.Assert.assertNotNull(elements6);
        __CLR4_2_08qf8qflnxz233t.R.inc(18106);org.junit.Assert.assertNotNull(element8);
        __CLR4_2_08qf8qflnxz233t.R.inc(18107);org.junit.Assert.assertNotNull(element9);
        __CLR4_2_08qf8qflnxz233t.R.inc(18108);org.junit.Assert.assertNotNull(textNodeList12);
        __CLR4_2_08qf8qflnxz233t.R.inc(18109);org.junit.Assert.assertNull(element13);
        __CLR4_2_08qf8qflnxz233t.R.inc(18110);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(18111);org.junit.Assert.assertNotNull(element15);
        __CLR4_2_08qf8qflnxz233t.R.inc(18112);org.junit.Assert.assertNotNull(elements18);
        __CLR4_2_08qf8qflnxz233t.R.inc(18113);org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        __CLR4_2_08qf8qflnxz233t.R.inc(18114);org.junit.Assert.assertNotNull(element20);
        __CLR4_2_08qf8qflnxz233t.R.inc(18115);org.junit.Assert.assertNotNull(strMap21);
        __CLR4_2_08qf8qflnxz233t.R.inc(18116);org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        __CLR4_2_08qf8qflnxz233t.R.inc(18117);org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test268() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),18118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0pkhf87dza();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test268",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18118,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0pkhf87dza() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(18118);
        __CLR4_2_08qf8qflnxz233t.R.inc(18119);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(18120)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(18121)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(18122);System.out.format("%n%s%n", "RegressionTest0.test268");
        }__CLR4_2_08qf8qflnxz233t.R.inc(18123);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(18124);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(18125);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(18126);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(18127);org.jsoup.nodes.Element element5 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(18128);org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(18129);org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(18130);java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element10.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(18131);org.jsoup.nodes.Element element12 = element10.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(18132);int int13 = element10.siblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(18133);org.jsoup.select.Elements elements14 = element10.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(18134);java.util.List<org.jsoup.nodes.Node> nodeList15 = element10.childNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(18135);org.jsoup.nodes.Element element17 = element10.toggleClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(18136);org.jsoup.nodes.Element element18 = element1.prependChild((org.jsoup.nodes.Node) element17);
        __CLR4_2_08qf8qflnxz233t.R.inc(18137);org.jsoup.nodes.Element element19 = element1.clone();
        __CLR4_2_08qf8qflnxz233t.R.inc(18138);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(18139);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(18140);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(18141);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(18142);org.junit.Assert.assertNotNull(elements8);
        __CLR4_2_08qf8qflnxz233t.R.inc(18143);org.junit.Assert.assertNotNull(textNodeList11);
        __CLR4_2_08qf8qflnxz233t.R.inc(18144);org.junit.Assert.assertNotNull(element12);
        __CLR4_2_08qf8qflnxz233t.R.inc(18145);org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(18146);org.junit.Assert.assertNotNull(elements14);
        __CLR4_2_08qf8qflnxz233t.R.inc(18147);org.junit.Assert.assertNotNull(nodeList15);
        __CLR4_2_08qf8qflnxz233t.R.inc(18148);org.junit.Assert.assertNotNull(element17);
        __CLR4_2_08qf8qflnxz233t.R.inc(18149);org.junit.Assert.assertNotNull(element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(18150);org.junit.Assert.assertNotNull(element19);
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test269() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),18151);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0mbhgfqe07();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test269",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18151,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0mbhgfqe07() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(18151);
        __CLR4_2_08qf8qflnxz233t.R.inc(18152);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(18153)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(18154)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(18155);System.out.format("%n%s%n", "RegressionTest0.test269");
        }__CLR4_2_08qf8qflnxz233t.R.inc(18156);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(18157);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(18158);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(18159);java.lang.String str4 = element1.normalName();
        __CLR4_2_08qf8qflnxz233t.R.inc(18160);org.jsoup.nodes.Element element5 = element1.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(18161);org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(18162);org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(18163);java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element10.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(18164);org.jsoup.nodes.Element element12 = element10.shallowClone();
        __CLR4_2_08qf8qflnxz233t.R.inc(18165);int int13 = element10.siblingIndex();
        __CLR4_2_08qf8qflnxz233t.R.inc(18166);org.jsoup.select.Elements elements14 = element10.nextElementSiblings();
        __CLR4_2_08qf8qflnxz233t.R.inc(18167);java.util.List<org.jsoup.nodes.Node> nodeList15 = element10.childNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(18168);org.jsoup.nodes.Element element17 = element10.toggleClass("");
        __CLR4_2_08qf8qflnxz233t.R.inc(18169);org.jsoup.nodes.Element element18 = element1.prependChild((org.jsoup.nodes.Node) element17);
        __CLR4_2_08qf8qflnxz233t.R.inc(18170);org.jsoup.nodes.Attributes attributes19 = element1.attributes();
        __CLR4_2_08qf8qflnxz233t.R.inc(18171);java.lang.String str20 = element1.text();
        __CLR4_2_08qf8qflnxz233t.R.inc(18172);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(18173);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(18174);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(18175);org.junit.Assert.assertNotNull(element5);
        __CLR4_2_08qf8qflnxz233t.R.inc(18176);org.junit.Assert.assertNotNull(elements8);
        __CLR4_2_08qf8qflnxz233t.R.inc(18177);org.junit.Assert.assertNotNull(textNodeList11);
        __CLR4_2_08qf8qflnxz233t.R.inc(18178);org.junit.Assert.assertNotNull(element12);
        __CLR4_2_08qf8qflnxz233t.R.inc(18179);org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        __CLR4_2_08qf8qflnxz233t.R.inc(18180);org.junit.Assert.assertNotNull(elements14);
        __CLR4_2_08qf8qflnxz233t.R.inc(18181);org.junit.Assert.assertNotNull(nodeList15);
        __CLR4_2_08qf8qflnxz233t.R.inc(18182);org.junit.Assert.assertNotNull(element17);
        __CLR4_2_08qf8qflnxz233t.R.inc(18183);org.junit.Assert.assertNotNull(element18);
        __CLR4_2_08qf8qflnxz233t.R.inc(18184);org.junit.Assert.assertNotNull(attributes19);
        __CLR4_2_08qf8qflnxz233t.R.inc(18185);org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}

    @Test
    public void test270() throws Throwable {__CLR4_2_08qf8qflnxz233t.R.globalSliceStart(getClass().getName(),18186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0lum90ge16();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_08qf8qflnxz233t.R.rethrow($CLV_t2$);}finally{__CLR4_2_08qf8qflnxz233t.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.AutomatedTest.test270",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),18186,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0lum90ge16() throws Throwable{try{__CLR4_2_08qf8qflnxz233t.R.inc(18186);
        __CLR4_2_08qf8qflnxz233t.R.inc(18187);if ((((debug)&&(__CLR4_2_08qf8qflnxz233t.R.iget(18188)!=0|true))||(__CLR4_2_08qf8qflnxz233t.R.iget(18189)==0&false)))
            {__CLR4_2_08qf8qflnxz233t.R.inc(18190);System.out.format("%n%s%n", "RegressionTest0.test270");
        }__CLR4_2_08qf8qflnxz233t.R.inc(18191);org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        __CLR4_2_08qf8qflnxz233t.R.inc(18192);java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        __CLR4_2_08qf8qflnxz233t.R.inc(18193);org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        __CLR4_2_08qf8qflnxz233t.R.inc(18194);java.lang.String str4 = element1.normalName();
        // The following exception was thrown during execution in test generation
        __CLR4_2_08qf8qflnxz233t.R.inc(18195);try {
            __CLR4_2_08qf8qflnxz233t.R.inc(18196);org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValue("hi!", "");
            __CLR4_2_08qf8qflnxz233t.R.inc(18197);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_2_08qf8qflnxz233t.R.inc(18198);org.junit.Assert.assertNotNull(textNodeList2);
        __CLR4_2_08qf8qflnxz233t.R.inc(18199);org.junit.Assert.assertNull(element3);
        __CLR4_2_08qf8qflnxz233t.R.inc(18200);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }finally{__CLR4_2_08qf8qflnxz233t.R.flushNeeded();}}
}


