/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.Validate;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

/**
 * A HTML Form Element provides ready access to the form fields/controls that are associated with it. It also allows a
 * form to easily be submitted.
 */
public class FormElement extends Element {public static class __CLR4_2_02h22h2lnxz22ll{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,3274,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final Elements elements = new Elements();

    /**
     * Create a new, standalone form element.
     *
     * @param tag        tag of this element
     * @param baseUri    the base URI
     * @param attributes initial attributes
     */
    public FormElement(Tag tag, String baseUri, Attributes attributes) {
        super(tag, baseUri, attributes);__CLR4_2_02h22h2lnxz22ll.R.inc(3207);try{__CLR4_2_02h22h2lnxz22ll.R.inc(3206);
    }finally{__CLR4_2_02h22h2lnxz22ll.R.flushNeeded();}}

    /**
     * Get the list of form control elements associated with this form.
     * @return form controls associated with this element.
     */
    public Elements elements() {try{__CLR4_2_02h22h2lnxz22ll.R.inc(3208);
        __CLR4_2_02h22h2lnxz22ll.R.inc(3209);return elements;
    }finally{__CLR4_2_02h22h2lnxz22ll.R.flushNeeded();}}

    /**
     * Add a form control element to this form.
     * @param element form control to add
     * @return this form element, for chaining
     */
    public FormElement addElement(Element element) {try{__CLR4_2_02h22h2lnxz22ll.R.inc(3210);
        __CLR4_2_02h22h2lnxz22ll.R.inc(3211);elements.add(element);
        __CLR4_2_02h22h2lnxz22ll.R.inc(3212);return this;
    }finally{__CLR4_2_02h22h2lnxz22ll.R.flushNeeded();}}

    @Override
    protected void removeChild(Node out) {try{__CLR4_2_02h22h2lnxz22ll.R.inc(3213);
        __CLR4_2_02h22h2lnxz22ll.R.inc(3214);super.removeChild(out);
        __CLR4_2_02h22h2lnxz22ll.R.inc(3215);elements.remove(out);
    }finally{__CLR4_2_02h22h2lnxz22ll.R.flushNeeded();}}

    /**
     * Prepare to submit this form. A Connection object is created with the request set up from the form values. You
     * can then set up other options (like user-agent, timeout, cookies), then execute it.
     * @return a connection prepared from the values of this form.
     * @throws IllegalArgumentException if the form's absolute action URL cannot be determined. Make sure you pass the
     * document's base URI when parsing.
     */
    public Connection submit() {try{__CLR4_2_02h22h2lnxz22ll.R.inc(3216);
        __CLR4_2_02h22h2lnxz22ll.R.inc(3217);String action = (((hasAttr("action") )&&(__CLR4_2_02h22h2lnxz22ll.R.iget(3218)!=0|true))||(__CLR4_2_02h22h2lnxz22ll.R.iget(3219)==0&false))? absUrl("action") : baseUri();
        __CLR4_2_02h22h2lnxz22ll.R.inc(3220);Validate.notEmpty(action, "Could not determine a form action URL for submit. Ensure you set a base URI when parsing.");
        __CLR4_2_02h22h2lnxz22ll.R.inc(3221);Connection.Method method = (((attr("method").toUpperCase().equals("POST") )&&(__CLR4_2_02h22h2lnxz22ll.R.iget(3222)!=0|true))||(__CLR4_2_02h22h2lnxz22ll.R.iget(3223)==0&false))?
                Connection.Method.POST : Connection.Method.GET;

        __CLR4_2_02h22h2lnxz22ll.R.inc(3224);return Jsoup.connect(action)
                .data(formData())
                .method(method);
    }finally{__CLR4_2_02h22h2lnxz22ll.R.flushNeeded();}}

    /**
     * Get the data that this form submits. The returned list is a copy of the data, and changes to the contents of the
     * list will not be reflected in the DOM.
     * @return a list of key vals
     */
    public List<Connection.KeyVal> formData() {try{__CLR4_2_02h22h2lnxz22ll.R.inc(3225);
        __CLR4_2_02h22h2lnxz22ll.R.inc(3226);ArrayList<Connection.KeyVal> data = new ArrayList<>();

        // iterate the form control elements and accumulate their values
        __CLR4_2_02h22h2lnxz22ll.R.inc(3227);for (Element el: elements) {{
            __CLR4_2_02h22h2lnxz22ll.R.inc(3228);if ((((!el.tag().isFormSubmittable())&&(__CLR4_2_02h22h2lnxz22ll.R.iget(3229)!=0|true))||(__CLR4_2_02h22h2lnxz22ll.R.iget(3230)==0&false))) {__CLR4_2_02h22h2lnxz22ll.R.inc(3231);continue; // contents are form listable, superset of submitable
            }__CLR4_2_02h22h2lnxz22ll.R.inc(3232);if ((((el.hasAttr("disabled"))&&(__CLR4_2_02h22h2lnxz22ll.R.iget(3233)!=0|true))||(__CLR4_2_02h22h2lnxz22ll.R.iget(3234)==0&false))) {__CLR4_2_02h22h2lnxz22ll.R.inc(3235);continue; // skip disabled form inputs
            }__CLR4_2_02h22h2lnxz22ll.R.inc(3236);String name = el.attr("name");
            __CLR4_2_02h22h2lnxz22ll.R.inc(3237);if ((((name.length() == 0)&&(__CLR4_2_02h22h2lnxz22ll.R.iget(3238)!=0|true))||(__CLR4_2_02h22h2lnxz22ll.R.iget(3239)==0&false))) {__CLR4_2_02h22h2lnxz22ll.R.inc(3240);continue;
            }__CLR4_2_02h22h2lnxz22ll.R.inc(3241);String type = el.attr("type");

            __CLR4_2_02h22h2lnxz22ll.R.inc(3242);if ((((type.equalsIgnoreCase("button"))&&(__CLR4_2_02h22h2lnxz22ll.R.iget(3243)!=0|true))||(__CLR4_2_02h22h2lnxz22ll.R.iget(3244)==0&false))) {__CLR4_2_02h22h2lnxz22ll.R.inc(3245);continue; // browsers don't submit these

            }__CLR4_2_02h22h2lnxz22ll.R.inc(3246);if (((("select".equals(el.normalName()))&&(__CLR4_2_02h22h2lnxz22ll.R.iget(3247)!=0|true))||(__CLR4_2_02h22h2lnxz22ll.R.iget(3248)==0&false))) {{
                __CLR4_2_02h22h2lnxz22ll.R.inc(3249);Elements options = el.select("option[selected]");
                __CLR4_2_02h22h2lnxz22ll.R.inc(3250);boolean set = false;
                __CLR4_2_02h22h2lnxz22ll.R.inc(3251);for (Element option: options) {{
                    __CLR4_2_02h22h2lnxz22ll.R.inc(3252);data.add(HttpConnection.KeyVal.create(name, option.val()));
                    __CLR4_2_02h22h2lnxz22ll.R.inc(3253);set = true;
                }
                }__CLR4_2_02h22h2lnxz22ll.R.inc(3254);if ((((!set)&&(__CLR4_2_02h22h2lnxz22ll.R.iget(3255)!=0|true))||(__CLR4_2_02h22h2lnxz22ll.R.iget(3256)==0&false))) {{
                    __CLR4_2_02h22h2lnxz22ll.R.inc(3257);Element option = el.select("option").first();
                    __CLR4_2_02h22h2lnxz22ll.R.inc(3258);if ((((option != null)&&(__CLR4_2_02h22h2lnxz22ll.R.iget(3259)!=0|true))||(__CLR4_2_02h22h2lnxz22ll.R.iget(3260)==0&false)))
                        {__CLR4_2_02h22h2lnxz22ll.R.inc(3261);data.add(HttpConnection.KeyVal.create(name, option.val()));
                }}
            }} }else {__CLR4_2_02h22h2lnxz22ll.R.inc(3262);if (((("checkbox".equalsIgnoreCase(type) || "radio".equalsIgnoreCase(type))&&(__CLR4_2_02h22h2lnxz22ll.R.iget(3263)!=0|true))||(__CLR4_2_02h22h2lnxz22ll.R.iget(3264)==0&false))) {{
                // only add checkbox or radio if they have the checked attribute
                __CLR4_2_02h22h2lnxz22ll.R.inc(3265);if ((((el.hasAttr("checked"))&&(__CLR4_2_02h22h2lnxz22ll.R.iget(3266)!=0|true))||(__CLR4_2_02h22h2lnxz22ll.R.iget(3267)==0&false))) {{
                    __CLR4_2_02h22h2lnxz22ll.R.inc(3268);final String val = (((el.val().length() >  0 )&&(__CLR4_2_02h22h2lnxz22ll.R.iget(3269)!=0|true))||(__CLR4_2_02h22h2lnxz22ll.R.iget(3270)==0&false))? el.val() : "on";
                    __CLR4_2_02h22h2lnxz22ll.R.inc(3271);data.add(HttpConnection.KeyVal.create(name, val));
                }
            }} }else {{
                __CLR4_2_02h22h2lnxz22ll.R.inc(3272);data.add(HttpConnection.KeyVal.create(name, el.val()));
            }
        }}}
        }__CLR4_2_02h22h2lnxz22ll.R.inc(3273);return data;
    }finally{__CLR4_2_02h22h2lnxz22ll.R.flushNeeded();}}
}
