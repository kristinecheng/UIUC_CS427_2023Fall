/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Tests for FormElement
 *
 * @author Jonathan Hedley
 */
public class FormElementTest {static class __CLR4_2_0fa8fa8lnxz237q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767707166L,8589935092L,19902,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test public void hasAssociatedControls() {__CLR4_2_0fa8fa8lnxz237q.R.globalSliceStart(getClass().getName(),19808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0vz4fvnfa8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fa8fa8lnxz237q.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fa8fa8lnxz237q.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.FormElementTest.hasAssociatedControls",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19808,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0vz4fvnfa8(){try{__CLR4_2_0fa8fa8lnxz237q.R.inc(19808);
        //"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19809);String html = "<form id=1><button id=1><fieldset id=2 /><input id=3><keygen id=4><object id=5><output id=6>" +
                "<select id=7><option></select><textarea id=8><p id=9>";
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19810);Document doc = Jsoup.parse(html);

        __CLR4_2_0fa8fa8lnxz237q.R.inc(19811);FormElement form = (FormElement) doc.select("form").first();
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19812);assertEquals(8, form.elements().size());
    }finally{__CLR4_2_0fa8fa8lnxz237q.R.flushNeeded();}}

    @Test public void createsFormData() {__CLR4_2_0fa8fa8lnxz237q.R.globalSliceStart(getClass().getName(),19813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_073ucssfad();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fa8fa8lnxz237q.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fa8fa8lnxz237q.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.FormElementTest.createsFormData",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19813,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_073ucssfad(){try{__CLR4_2_0fa8fa8lnxz237q.R.inc(19813);
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19814);String html = "<form><input name='one' value='two'><select name='three'><option value='not'>" +
                "<option value='four' selected><option value='five' selected><textarea name=six>seven</textarea>" +
                "<input name='seven' type='radio' value='on' checked><input name='seven' type='radio' value='off'>" +
                "<input name='eight' type='checkbox' checked><input name='nine' type='checkbox' value='unset'>" +
                "<input name='ten' value='text' disabled>" +
                "<input name='eleven' value='text' type='button'>" +
                "</form>";
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19815);Document doc = Jsoup.parse(html);
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19816);FormElement form = (FormElement) doc.select("form").first();
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19817);List<Connection.KeyVal> data = form.formData();

        __CLR4_2_0fa8fa8lnxz237q.R.inc(19818);assertEquals(6, data.size());
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19819);assertEquals("one=two", data.get(0).toString());
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19820);assertEquals("three=four", data.get(1).toString());
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19821);assertEquals("three=five", data.get(2).toString());
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19822);assertEquals("six=seven", data.get(3).toString());
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19823);assertEquals("seven=on", data.get(4).toString()); // set
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19824);assertEquals("eight=on", data.get(5).toString()); // default
        // nine should not appear, not checked checkbox
        // ten should not appear, disabled
        // eleven should not appear, button
    }finally{__CLR4_2_0fa8fa8lnxz237q.R.flushNeeded();}}

    @Test public void formDataUsesFirstAttribute() {__CLR4_2_0fa8fa8lnxz237q.R.globalSliceStart(getClass().getName(),19825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0qjbey5fap();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fa8fa8lnxz237q.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fa8fa8lnxz237q.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.FormElementTest.formDataUsesFirstAttribute",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19825,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0qjbey5fap(){try{__CLR4_2_0fa8fa8lnxz237q.R.inc(19825);
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19826);String html = "<form><input name=test value=foo name=test2 value=bar>";
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19827);Document doc = Jsoup.parse(html);
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19828);FormElement form = (FormElement) doc.selectFirst("form");
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19829);assertEquals("test=foo", form.formData().get(0).toString());
    }finally{__CLR4_2_0fa8fa8lnxz237q.R.flushNeeded();}}

    @Test public void createsSubmitableConnection() {__CLR4_2_0fa8fa8lnxz237q.R.globalSliceStart(getClass().getName(),19830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0jicnvyfau();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fa8fa8lnxz237q.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fa8fa8lnxz237q.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.FormElementTest.createsSubmitableConnection",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19830,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0jicnvyfau(){try{__CLR4_2_0fa8fa8lnxz237q.R.inc(19830);
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19831);String html = "<form action='/search'><input name='q'></form>";
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19832);Document doc = Jsoup.parse(html, "http://example.com/");
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19833);doc.select("[name=q]").attr("value", "jsoup");

        __CLR4_2_0fa8fa8lnxz237q.R.inc(19834);FormElement form = ((FormElement) doc.select("form").first());
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19835);Connection con = form.submit();

        __CLR4_2_0fa8fa8lnxz237q.R.inc(19836);assertEquals(Connection.Method.GET, con.request().method());
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19837);assertEquals("http://example.com/search", con.request().url().toExternalForm());
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19838);List<Connection.KeyVal> dataList = (List<Connection.KeyVal>) con.request().data();
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19839);assertEquals("q=jsoup", dataList.get(0).toString());

        __CLR4_2_0fa8fa8lnxz237q.R.inc(19840);doc.select("form").attr("method", "post");
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19841);Connection con2 = form.submit();
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19842);assertEquals(Connection.Method.POST, con2.request().method());
    }finally{__CLR4_2_0fa8fa8lnxz237q.R.flushNeeded();}}

    @Test public void actionWithNoValue() {__CLR4_2_0fa8fa8lnxz237q.R.globalSliceStart(getClass().getName(),19843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0y08kzffb7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fa8fa8lnxz237q.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fa8fa8lnxz237q.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.FormElementTest.actionWithNoValue",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19843,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0y08kzffb7(){try{__CLR4_2_0fa8fa8lnxz237q.R.inc(19843);
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19844);String html = "<form><input name='q'></form>";
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19845);Document doc = Jsoup.parse(html, "http://example.com/");
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19846);FormElement form = ((FormElement) doc.select("form").first());
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19847);Connection con = form.submit();

        __CLR4_2_0fa8fa8lnxz237q.R.inc(19848);assertEquals("http://example.com/", con.request().url().toExternalForm());
    }finally{__CLR4_2_0fa8fa8lnxz237q.R.flushNeeded();}}

    @Test public void actionWithNoBaseUri() {__CLR4_2_0fa8fa8lnxz237q.R.globalSliceStart(getClass().getName(),19849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ywxj8lfbd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fa8fa8lnxz237q.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fa8fa8lnxz237q.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.FormElementTest.actionWithNoBaseUri",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19849,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ywxj8lfbd(){try{__CLR4_2_0fa8fa8lnxz237q.R.inc(19849);
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19850);String html = "<form><input name='q'></form>";
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19851);Document doc = Jsoup.parse(html);
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19852);FormElement form = ((FormElement) doc.select("form").first());


        __CLR4_2_0fa8fa8lnxz237q.R.inc(19853);boolean threw = false;
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19854);try {
            __CLR4_2_0fa8fa8lnxz237q.R.inc(19855);Connection con = form.submit();
        } catch (IllegalArgumentException e) {
            __CLR4_2_0fa8fa8lnxz237q.R.inc(19856);threw = true;
            __CLR4_2_0fa8fa8lnxz237q.R.inc(19857);assertEquals("Could not determine a form action URL for submit. Ensure you set a base URI when parsing.",
                    e.getMessage());
        }
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19858);assertTrue(threw);
    }finally{__CLR4_2_0fa8fa8lnxz237q.R.flushNeeded();}}

    @Test public void formsAddedAfterParseAreFormElements() {__CLR4_2_0fa8fa8lnxz237q.R.globalSliceStart(getClass().getName(),19859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_04xoei6fbn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fa8fa8lnxz237q.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fa8fa8lnxz237q.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.FormElementTest.formsAddedAfterParseAreFormElements",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19859,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_04xoei6fbn(){try{__CLR4_2_0fa8fa8lnxz237q.R.inc(19859);
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19860);Document doc = Jsoup.parse("<body />");
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19861);doc.body().html("<form action='http://example.com/search'><input name='q' value='search'>");
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19862);Element formEl = doc.select("form").first();
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19863);assertTrue(formEl instanceof FormElement);

        __CLR4_2_0fa8fa8lnxz237q.R.inc(19864);FormElement form = (FormElement) formEl;
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19865);assertEquals(1, form.elements().size());
    }finally{__CLR4_2_0fa8fa8lnxz237q.R.flushNeeded();}}

    @Test public void controlsAddedAfterParseAreLinkedWithForms() {__CLR4_2_0fa8fa8lnxz237q.R.globalSliceStart(getClass().getName(),19866);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0x51nlofbu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fa8fa8lnxz237q.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fa8fa8lnxz237q.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.FormElementTest.controlsAddedAfterParseAreLinkedWithForms",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19866,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0x51nlofbu(){try{__CLR4_2_0fa8fa8lnxz237q.R.inc(19866);
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19867);Document doc = Jsoup.parse("<body />");
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19868);doc.body().html("<form />");

        __CLR4_2_0fa8fa8lnxz237q.R.inc(19869);Element formEl = doc.select("form").first();
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19870);formEl.append("<input name=foo value=bar>");

        __CLR4_2_0fa8fa8lnxz237q.R.inc(19871);assertTrue(formEl instanceof FormElement);
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19872);FormElement form = (FormElement) formEl;
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19873);assertEquals(1, form.elements().size());

        __CLR4_2_0fa8fa8lnxz237q.R.inc(19874);List<Connection.KeyVal> data = form.formData();
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19875);assertEquals("foo=bar", data.get(0).toString());
    }finally{__CLR4_2_0fa8fa8lnxz237q.R.flushNeeded();}}

    @Test public void usesOnForCheckboxValueIfNoValueSet() {__CLR4_2_0fa8fa8lnxz237q.R.globalSliceStart(getClass().getName(),19876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0f70g4mfc4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fa8fa8lnxz237q.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fa8fa8lnxz237q.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.FormElementTest.usesOnForCheckboxValueIfNoValueSet",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19876,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0f70g4mfc4(){try{__CLR4_2_0fa8fa8lnxz237q.R.inc(19876);
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19877);Document doc = Jsoup.parse("<form><input type=checkbox checked name=foo></form>");
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19878);FormElement form = (FormElement) doc.select("form").first();
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19879);List<Connection.KeyVal> data = form.formData();
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19880);assertEquals("on", data.get(0).value());
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19881);assertEquals("foo", data.get(0).key());
    }finally{__CLR4_2_0fa8fa8lnxz237q.R.flushNeeded();}}

    @Test public void adoptedFormsRetainInputs() {__CLR4_2_0fa8fa8lnxz237q.R.globalSliceStart(getClass().getName(),19882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_061wyqzfca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fa8fa8lnxz237q.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fa8fa8lnxz237q.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.FormElementTest.adoptedFormsRetainInputs",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19882,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_061wyqzfca(){try{__CLR4_2_0fa8fa8lnxz237q.R.inc(19882);
        // test for https://github.com/jhy/jsoup/issues/249
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19883);String html = "<html>\n" +
                "<body>  \n" +
                "  <table>\n" +
                "      <form action=\"/hello.php\" method=\"post\">\n" +
                "      <tr><td>User:</td><td> <input type=\"text\" name=\"user\" /></td></tr>\n" +
                "      <tr><td>Password:</td><td> <input type=\"password\" name=\"pass\" /></td></tr>\n" +
                "      <tr><td><input type=\"submit\" name=\"login\" value=\"login\" /></td></tr>\n" +
                "   </form>\n" +
                "  </table>\n" +
                "</body>\n" +
                "</html>";
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19884);Document doc = Jsoup.parse(html);
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19885);FormElement form = (FormElement) doc.select("form").first();
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19886);List<Connection.KeyVal> data = form.formData();
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19887);assertEquals(3, data.size());
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19888);assertEquals("user", data.get(0).key());
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19889);assertEquals("pass", data.get(1).key());
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19890);assertEquals("login", data.get(2).key());
    }finally{__CLR4_2_0fa8fa8lnxz237q.R.flushNeeded();}}

    @Test public void removeFormElement() {__CLR4_2_0fa8fa8lnxz237q.R.globalSliceStart(getClass().getName(),19891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0l64vgbfcj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0fa8fa8lnxz237q.R.rethrow($CLV_t2$);}finally{__CLR4_2_0fa8fa8lnxz237q.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.FormElementTest.removeFormElement",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),19891,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0l64vgbfcj(){try{__CLR4_2_0fa8fa8lnxz237q.R.inc(19891);
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19892);String html = "<html>\n" +
                "  <body> \n" +
                "      <form action=\"/hello.php\" method=\"post\">\n" +
                "      User:<input type=\"text\" name=\"user\" />\n" +
                "      Password:<input type=\"password\" name=\"pass\" />\n" +
                "      <input type=\"submit\" name=\"login\" value=\"login\" />\n" +
                "   </form>\n" +
                "  </body>\n" +
                "</html>  ";
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19893);Document doc = Jsoup.parse(html);
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19894);FormElement form = (FormElement) doc.selectFirst("form");
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19895);Element pass = form.selectFirst("input[name=pass]");
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19896);pass.remove();

        __CLR4_2_0fa8fa8lnxz237q.R.inc(19897);List<Connection.KeyVal> data = form.formData();
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19898);assertEquals(2, data.size());
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19899);assertEquals("user", data.get(0).key());
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19900);assertEquals("login", data.get(1).key());
        __CLR4_2_0fa8fa8lnxz237q.R.inc(19901);assertEquals(null, doc.selectFirst("input[name=pass]"));
    }finally{__CLR4_2_0fa8fa8lnxz237q.R.flushNeeded();}}
}
