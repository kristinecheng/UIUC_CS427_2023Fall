/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.select;

import org.jsoup.internal.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

/**
 A list of {@link Element}s, with methods that act on every element in the list.
 <p>
 To get an {@code Elements} object, use the {@link Element#select(String)} method.
 </p>

 @author Jonathan Hedley, jonathan@hedley.net */
public class Elements extends ArrayList<Element> {public static class __CLR4_2_07a97a9lnxz22s5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,9685,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public Elements() {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9441);
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}

    public Elements(int initialCapacity) {
        super(initialCapacity);__CLR4_2_07a97a9lnxz22s5.R.inc(9443);try{__CLR4_2_07a97a9lnxz22s5.R.inc(9442);
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}

    public Elements(Collection<Element> elements) {
        super(elements);__CLR4_2_07a97a9lnxz22s5.R.inc(9445);try{__CLR4_2_07a97a9lnxz22s5.R.inc(9444);
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}
    
    public Elements(List<Element> elements) {
        super(elements);__CLR4_2_07a97a9lnxz22s5.R.inc(9447);try{__CLR4_2_07a97a9lnxz22s5.R.inc(9446);
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}
    
    public Elements(Element... elements) {
    	super(Arrays.asList(elements));__CLR4_2_07a97a9lnxz22s5.R.inc(9449);try{__CLR4_2_07a97a9lnxz22s5.R.inc(9448);
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}

    /**
     * Creates a deep copy of these elements.
     * @return a deep copy
     */
    @Override
	public Elements clone() {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9450);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9451);Elements clone = new Elements(size());

        __CLR4_2_07a97a9lnxz22s5.R.inc(9452);for(Element e : this)
    		{__CLR4_2_07a97a9lnxz22s5.R.inc(9453);clone.add(e.clone());
    	
    	}__CLR4_2_07a97a9lnxz22s5.R.inc(9454);return clone;
	}finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}

	// attribute methods
    /**
     Get an attribute value from the first matched element that has the attribute.
     @param attributeKey The attribute key.
     @return The attribute value from the first matched element that has the attribute.. If no elements were matched (isEmpty() == true),
     or if the no elements have the attribute, returns empty string.
     @see #hasAttr(String)
     */
    public String attr(String attributeKey) {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9455);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9456);for (Element element : this) {{
            __CLR4_2_07a97a9lnxz22s5.R.inc(9457);if ((((element.hasAttr(attributeKey))&&(__CLR4_2_07a97a9lnxz22s5.R.iget(9458)!=0|true))||(__CLR4_2_07a97a9lnxz22s5.R.iget(9459)==0&false)))
                {__CLR4_2_07a97a9lnxz22s5.R.inc(9460);return element.attr(attributeKey);
        }}
        }__CLR4_2_07a97a9lnxz22s5.R.inc(9461);return "";
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}

    /**
     Checks if any of the matched elements have this attribute defined.
     @param attributeKey attribute key
     @return true if any of the elements have the attribute; false if none do.
     */
    public boolean hasAttr(String attributeKey) {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9462);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9463);for (Element element : this) {{
            __CLR4_2_07a97a9lnxz22s5.R.inc(9464);if ((((element.hasAttr(attributeKey))&&(__CLR4_2_07a97a9lnxz22s5.R.iget(9465)!=0|true))||(__CLR4_2_07a97a9lnxz22s5.R.iget(9466)==0&false)))
                {__CLR4_2_07a97a9lnxz22s5.R.inc(9467);return true;
        }}
        }__CLR4_2_07a97a9lnxz22s5.R.inc(9468);return false;
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}

    /**
     * Get the attribute value for each of the matched elements. If an element does not have this attribute, no value is
     * included in the result set for that element.
     * @param attributeKey the attribute name to return values for. You can add the {@code abs:} prefix to the key to
     * get absolute URLs from relative URLs, e.g.: {@code doc.select("a").eachAttr("abs:href")} .
     * @return a list of each element's attribute value for the attribute
     */
    public List<String> eachAttr(String attributeKey) {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9469);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9470);List<String> attrs = new ArrayList<>(size());
        __CLR4_2_07a97a9lnxz22s5.R.inc(9471);for (Element element : this) {{
            __CLR4_2_07a97a9lnxz22s5.R.inc(9472);if ((((element.hasAttr(attributeKey))&&(__CLR4_2_07a97a9lnxz22s5.R.iget(9473)!=0|true))||(__CLR4_2_07a97a9lnxz22s5.R.iget(9474)==0&false)))
                {__CLR4_2_07a97a9lnxz22s5.R.inc(9475);attrs.add(element.attr(attributeKey));
        }}
        }__CLR4_2_07a97a9lnxz22s5.R.inc(9476);return attrs;
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}

    /**
     * Set an attribute on all matched elements.
     * @param attributeKey attribute key
     * @param attributeValue attribute value
     * @return this
     */
    public Elements attr(String attributeKey, String attributeValue) {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9477);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9478);for (Element element : this) {{
            __CLR4_2_07a97a9lnxz22s5.R.inc(9479);element.attr(attributeKey, attributeValue);
        }
        }__CLR4_2_07a97a9lnxz22s5.R.inc(9480);return this;
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}

    /**
     * Remove an attribute from every matched element.
     * @param attributeKey The attribute to remove.
     * @return this (for chaining)
     */
    public Elements removeAttr(String attributeKey) {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9481);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9482);for (Element element : this) {{
            __CLR4_2_07a97a9lnxz22s5.R.inc(9483);element.removeAttr(attributeKey);
        }
        }__CLR4_2_07a97a9lnxz22s5.R.inc(9484);return this;
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}

    /**
     Add the class name to every matched element's {@code class} attribute.
     @param className class name to add
     @return this
     */
    public Elements addClass(String className) {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9485);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9486);for (Element element : this) {{
            __CLR4_2_07a97a9lnxz22s5.R.inc(9487);element.addClass(className);
        }
        }__CLR4_2_07a97a9lnxz22s5.R.inc(9488);return this;
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}

    /**
     Remove the class name from every matched element's {@code class} attribute, if present.
     @param className class name to remove
     @return this
     */
    public Elements removeClass(String className) {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9489);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9490);for (Element element : this) {{
            __CLR4_2_07a97a9lnxz22s5.R.inc(9491);element.removeClass(className);
        }
        }__CLR4_2_07a97a9lnxz22s5.R.inc(9492);return this;
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}

    /**
     Toggle the class name on every matched element's {@code class} attribute.
     @param className class name to add if missing, or remove if present, from every element.
     @return this
     */
    public Elements toggleClass(String className) {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9493);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9494);for (Element element : this) {{
            __CLR4_2_07a97a9lnxz22s5.R.inc(9495);element.toggleClass(className);
        }
        }__CLR4_2_07a97a9lnxz22s5.R.inc(9496);return this;
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}

    /**
     Determine if any of the matched elements have this class name set in their {@code class} attribute.
     @param className class name to check for
     @return true if any do, false if none do
     */
    public boolean hasClass(String className) {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9497);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9498);for (Element element : this) {{
            __CLR4_2_07a97a9lnxz22s5.R.inc(9499);if ((((element.hasClass(className))&&(__CLR4_2_07a97a9lnxz22s5.R.iget(9500)!=0|true))||(__CLR4_2_07a97a9lnxz22s5.R.iget(9501)==0&false)))
                {__CLR4_2_07a97a9lnxz22s5.R.inc(9502);return true;
        }}
        }__CLR4_2_07a97a9lnxz22s5.R.inc(9503);return false;
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}
    
    /**
     * Get the form element's value of the first matched element.
     * @return The form element's value, or empty if not set.
     * @see Element#val()
     */
    public String val() {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9504);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9505);if ((((size() > 0)&&(__CLR4_2_07a97a9lnxz22s5.R.iget(9506)!=0|true))||(__CLR4_2_07a97a9lnxz22s5.R.iget(9507)==0&false)))
            {__CLR4_2_07a97a9lnxz22s5.R.inc(9508);return first().val();
        }else
            {__CLR4_2_07a97a9lnxz22s5.R.inc(9509);return "";
    }}finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}
    
    /**
     * Set the form element's value in each of the matched elements.
     * @param value The value to set into each matched element
     * @return this (for chaining)
     */
    public Elements val(String value) {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9510);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9511);for (Element element : this)
            {__CLR4_2_07a97a9lnxz22s5.R.inc(9512);element.val(value);
        }__CLR4_2_07a97a9lnxz22s5.R.inc(9513);return this;
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}
    
    /**
     * Get the combined text of all the matched elements.
     * <p>
     * Note that it is possible to get repeats if the matched elements contain both parent elements and their own
     * children, as the Element.text() method returns the combined text of a parent and all its children.
     * @return string of all text: unescaped and no HTML.
     * @see Element#text()
     * @see #eachText()
     */
    public String text() {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9514);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9515);StringBuilder sb = StringUtil.borrowBuilder();
        __CLR4_2_07a97a9lnxz22s5.R.inc(9516);for (Element element : this) {{
            __CLR4_2_07a97a9lnxz22s5.R.inc(9517);if ((((sb.length() != 0)&&(__CLR4_2_07a97a9lnxz22s5.R.iget(9518)!=0|true))||(__CLR4_2_07a97a9lnxz22s5.R.iget(9519)==0&false)))
                {__CLR4_2_07a97a9lnxz22s5.R.inc(9520);sb.append(" ");
            }__CLR4_2_07a97a9lnxz22s5.R.inc(9521);sb.append(element.text());
        }
        }__CLR4_2_07a97a9lnxz22s5.R.inc(9522);return StringUtil.releaseBuilder(sb);
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}

    /**
     Test if any matched Element has any text content, that is not just whitespace.
     @return true if any element has non-blank text content.
     @see Element#hasText()
     */
    public boolean hasText() {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9523);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9524);for (Element element: this) {{
            __CLR4_2_07a97a9lnxz22s5.R.inc(9525);if ((((element.hasText())&&(__CLR4_2_07a97a9lnxz22s5.R.iget(9526)!=0|true))||(__CLR4_2_07a97a9lnxz22s5.R.iget(9527)==0&false)))
                {__CLR4_2_07a97a9lnxz22s5.R.inc(9528);return true;
        }}
        }__CLR4_2_07a97a9lnxz22s5.R.inc(9529);return false;
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}

    /**
     * Get the text content of each of the matched elements. If an element has no text, then it is not included in the
     * result.
     * @return A list of each matched element's text content.
     * @see Element#text()
     * @see Element#hasText()
     * @see #text()
     */
    public List<String> eachText() {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9530);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9531);ArrayList<String> texts = new ArrayList<>(size());
        __CLR4_2_07a97a9lnxz22s5.R.inc(9532);for (Element el: this) {{
            __CLR4_2_07a97a9lnxz22s5.R.inc(9533);if ((((el.hasText())&&(__CLR4_2_07a97a9lnxz22s5.R.iget(9534)!=0|true))||(__CLR4_2_07a97a9lnxz22s5.R.iget(9535)==0&false)))
                {__CLR4_2_07a97a9lnxz22s5.R.inc(9536);texts.add(el.text());
        }}
        }__CLR4_2_07a97a9lnxz22s5.R.inc(9537);return texts;
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}
    
    /**
     * Get the combined inner HTML of all matched elements.
     * @return string of all element's inner HTML.
     * @see #text()
     * @see #outerHtml()
     */
    public String html() {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9538);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9539);StringBuilder sb = StringUtil.borrowBuilder();
        __CLR4_2_07a97a9lnxz22s5.R.inc(9540);for (Element element : this) {{
            __CLR4_2_07a97a9lnxz22s5.R.inc(9541);if ((((sb.length() != 0)&&(__CLR4_2_07a97a9lnxz22s5.R.iget(9542)!=0|true))||(__CLR4_2_07a97a9lnxz22s5.R.iget(9543)==0&false)))
                {__CLR4_2_07a97a9lnxz22s5.R.inc(9544);sb.append("\n");
            }__CLR4_2_07a97a9lnxz22s5.R.inc(9545);sb.append(element.html());
        }
        }__CLR4_2_07a97a9lnxz22s5.R.inc(9546);return StringUtil.releaseBuilder(sb);
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}
    
    /**
     * Get the combined outer HTML of all matched elements.
     * @return string of all element's outer HTML.
     * @see #text()
     * @see #html()
     */
    public String outerHtml() {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9547);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9548);StringBuilder sb = StringUtil.borrowBuilder();
        __CLR4_2_07a97a9lnxz22s5.R.inc(9549);for (Element element : this) {{
            __CLR4_2_07a97a9lnxz22s5.R.inc(9550);if ((((sb.length() != 0)&&(__CLR4_2_07a97a9lnxz22s5.R.iget(9551)!=0|true))||(__CLR4_2_07a97a9lnxz22s5.R.iget(9552)==0&false)))
                {__CLR4_2_07a97a9lnxz22s5.R.inc(9553);sb.append("\n");
            }__CLR4_2_07a97a9lnxz22s5.R.inc(9554);sb.append(element.outerHtml());
        }
        }__CLR4_2_07a97a9lnxz22s5.R.inc(9555);return StringUtil.releaseBuilder(sb);
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}

    /**
     * Get the combined outer HTML of all matched elements. Alias of {@link #outerHtml()}.
     * @return string of all element's outer HTML.
     * @see #text()
     * @see #html()
     */
    @Override
    public String toString() {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9556);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9557);return outerHtml();
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}

    /**
     * Update the tag name of each matched element. For example, to change each {@code <i>} to a {@code <em>}, do
     * {@code doc.select("i").tagName("em");}
     * @param tagName the new tag name
     * @return this, for chaining
     * @see Element#tagName(String)
     */
    public Elements tagName(String tagName) {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9558);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9559);for (Element element : this) {{
            __CLR4_2_07a97a9lnxz22s5.R.inc(9560);element.tagName(tagName);
        }
        }__CLR4_2_07a97a9lnxz22s5.R.inc(9561);return this;
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}
    
    /**
     * Set the inner HTML of each matched element.
     * @param html HTML to parse and set into each matched element.
     * @return this, for chaining
     * @see Element#html(String)
     */
    public Elements html(String html) {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9562);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9563);for (Element element : this) {{
            __CLR4_2_07a97a9lnxz22s5.R.inc(9564);element.html(html);
        }
        }__CLR4_2_07a97a9lnxz22s5.R.inc(9565);return this;
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}
    
    /**
     * Add the supplied HTML to the start of each matched element's inner HTML.
     * @param html HTML to add inside each element, before the existing HTML
     * @return this, for chaining
     * @see Element#prepend(String)
     */
    public Elements prepend(String html) {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9566);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9567);for (Element element : this) {{
            __CLR4_2_07a97a9lnxz22s5.R.inc(9568);element.prepend(html);
        }
        }__CLR4_2_07a97a9lnxz22s5.R.inc(9569);return this;
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}
    
    /**
     * Add the supplied HTML to the end of each matched element's inner HTML.
     * @param html HTML to add inside each element, after the existing HTML
     * @return this, for chaining
     * @see Element#append(String)
     */
    public Elements append(String html) {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9570);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9571);for (Element element : this) {{
            __CLR4_2_07a97a9lnxz22s5.R.inc(9572);element.append(html);
        }
        }__CLR4_2_07a97a9lnxz22s5.R.inc(9573);return this;
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}
    
    /**
     * Insert the supplied HTML before each matched element's outer HTML.
     * @param html HTML to insert before each element
     * @return this, for chaining
     * @see Element#before(String)
     */
    public Elements before(String html) {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9574);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9575);for (Element element : this) {{
            __CLR4_2_07a97a9lnxz22s5.R.inc(9576);element.before(html);
        }
        }__CLR4_2_07a97a9lnxz22s5.R.inc(9577);return this;
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}
    
    /**
     * Insert the supplied HTML after each matched element's outer HTML.
     * @param html HTML to insert after each element
     * @return this, for chaining
     * @see Element#after(String)
     */
    public Elements after(String html) {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9578);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9579);for (Element element : this) {{
            __CLR4_2_07a97a9lnxz22s5.R.inc(9580);element.after(html);
        }
        }__CLR4_2_07a97a9lnxz22s5.R.inc(9581);return this;
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}

    /**
     Wrap the supplied HTML around each matched elements. For example, with HTML
     {@code <p><b>This</b> is <b>Jsoup</b></p>},
     <code>doc.select("b").wrap("&lt;i&gt;&lt;/i&gt;");</code>
     becomes {@code <p><i><b>This</b></i> is <i><b>jsoup</b></i></p>}
     @param html HTML to wrap around each element, e.g. {@code <div class="head"></div>}. Can be arbitrarily deep.
     @return this (for chaining)
     @see Element#wrap
     */
    public Elements wrap(String html) {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9582);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9583);Validate.notEmpty(html);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9584);for (Element element : this) {{
            __CLR4_2_07a97a9lnxz22s5.R.inc(9585);element.wrap(html);
        }
        }__CLR4_2_07a97a9lnxz22s5.R.inc(9586);return this;
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}

    /**
     * Removes the matched elements from the DOM, and moves their children up into their parents. This has the effect of
     * dropping the elements but keeping their children.
     * <p>
     * This is useful for e.g removing unwanted formatting elements but keeping their contents.
     * </p>
     * 
     * E.g. with HTML: <p>{@code <div><font>One</font> <font><a href="/">Two</a></font></div>}</p>
     * <p>{@code doc.select("font").unwrap();}</p>
     * <p>HTML = {@code <div>One <a href="/">Two</a></div>}</p>
     *
     * @return this (for chaining)
     * @see Node#unwrap
     */
    public Elements unwrap() {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9587);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9588);for (Element element : this) {{
            __CLR4_2_07a97a9lnxz22s5.R.inc(9589);element.unwrap();
        }
        }__CLR4_2_07a97a9lnxz22s5.R.inc(9590);return this;
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}

    /**
     * Empty (remove all child nodes from) each matched element. This is similar to setting the inner HTML of each
     * element to nothing.
     * <p>
     * E.g. HTML: {@code <div><p>Hello <b>there</b></p> <p>now</p></div>}<br>
     * <code>doc.select("p").empty();</code><br>
     * HTML = {@code <div><p></p> <p></p></div>}
     * @return this, for chaining
     * @see Element#empty()
     * @see #remove()
     */
    public Elements empty() {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9591);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9592);for (Element element : this) {{
            __CLR4_2_07a97a9lnxz22s5.R.inc(9593);element.empty();
        }
        }__CLR4_2_07a97a9lnxz22s5.R.inc(9594);return this;
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}

    /**
     * Remove each matched element from the DOM. This is similar to setting the outer HTML of each element to nothing.
     * <p>
     * E.g. HTML: {@code <div><p>Hello</p> <p>there</p> <img /></div>}<br>
     * <code>doc.select("p").remove();</code><br>
     * HTML = {@code <div> <img /></div>}
     * <p>
     * Note that this method should not be used to clean user-submitted HTML; rather, use {@link org.jsoup.safety.Cleaner} to clean HTML.
     * @return this, for chaining
     * @see Element#empty()
     * @see #empty()
     */
    public Elements remove() {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9595);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9596);for (Element element : this) {{
            __CLR4_2_07a97a9lnxz22s5.R.inc(9597);element.remove();
        }
        }__CLR4_2_07a97a9lnxz22s5.R.inc(9598);return this;
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}
    
    // filters
    
    /**
     * Find matching elements within this element list.
     * @param query A {@link Selector} query
     * @return the filtered list of elements, or an empty list if none match.
     */
    public Elements select(String query) {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9599);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9600);return Selector.select(query, this);
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}

    /**
     * Remove elements from this list that match the {@link Selector} query.
     * <p>
     * E.g. HTML: {@code <div class=logo>One</div> <div>Two</div>}<br>
     * <code>Elements divs = doc.select("div").not(".logo");</code><br>
     * Result: {@code divs: [<div>Two</div>]}
     * <p>
     * @param query the selector query whose results should be removed from these elements
     * @return a new elements list that contains only the filtered results
     */
    public Elements not(String query) {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9601);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9602);Elements out = Selector.select(query, this);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9603);return Selector.filterOut(this, out);
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}
    
    /**
     * Get the <i>nth</i> matched element as an Elements object.
     * <p>
     * See also {@link #get(int)} to retrieve an Element.
     * @param index the (zero-based) index of the element in the list to retain
     * @return Elements containing only the specified element, or, if that element did not exist, an empty list.
     */
    public Elements eq(int index) {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9604);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9605);return (((size() > index )&&(__CLR4_2_07a97a9lnxz22s5.R.iget(9606)!=0|true))||(__CLR4_2_07a97a9lnxz22s5.R.iget(9607)==0&false))? new Elements(get(index)) : new Elements();
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}
    
    /**
     * Test if any of the matched elements match the supplied query.
     * @param query A selector
     * @return true if at least one element in the list matches the query.
     */
    public boolean is(String query) {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9608);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9609);Evaluator eval = QueryParser.parse(query);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9610);for (Element e : this) {{
            __CLR4_2_07a97a9lnxz22s5.R.inc(9611);if ((((e.is(eval))&&(__CLR4_2_07a97a9lnxz22s5.R.iget(9612)!=0|true))||(__CLR4_2_07a97a9lnxz22s5.R.iget(9613)==0&false)))
                {__CLR4_2_07a97a9lnxz22s5.R.inc(9614);return true;
        }}
        }__CLR4_2_07a97a9lnxz22s5.R.inc(9615);return false;
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}

    /**
     * Get the immediate next element sibling of each element in this list.
     * @return next element siblings.
     */
    public Elements next() {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9616);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9617);return siblings(null, true, false);
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}

    /**
     * Get the immediate next element sibling of each element in this list, filtered by the query.
     * @param query CSS query to match siblings against
     * @return next element siblings.
     */
    public Elements next(String query) {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9618);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9619);return siblings(query, true, false);
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}

    /**
     * Get each of the following element siblings of each element in this list.
     * @return all following element siblings.
     */
    public Elements nextAll() {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9620);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9621);return siblings(null, true, true);
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}

    /**
     * Get each of the following element siblings of each element in this list, that match the query.
     * @param query CSS query to match siblings against
     * @return all following element siblings.
     */
    public Elements nextAll(String query) {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9622);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9623);return siblings(query, true, true);
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}

    /**
     * Get the immediate previous element sibling of each element in this list.
     * @return previous element siblings.
     */
    public Elements prev() {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9624);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9625);return siblings(null, false, false);
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}

    /**
     * Get the immediate previous element sibling of each element in this list, filtered by the query.
     * @param query CSS query to match siblings against
     * @return previous element siblings.
     */
    public Elements prev(String query) {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9626);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9627);return siblings(query, false, false);
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}

    /**
     * Get each of the previous element siblings of each element in this list.
     * @return all previous element siblings.
     */
    public Elements prevAll() {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9628);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9629);return siblings(null, false, true);
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}

    /**
     * Get each of the previous element siblings of each element in this list, that match the query.
     * @param query CSS query to match siblings against
     * @return all previous element siblings.
     */
    public Elements prevAll(String query) {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9630);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9631);return siblings(query, false, true);
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}

    private Elements siblings(String query, boolean next, boolean all) {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9632);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9633);Elements els = new Elements();
        __CLR4_2_07a97a9lnxz22s5.R.inc(9634);Evaluator eval = (((query != null)&&(__CLR4_2_07a97a9lnxz22s5.R.iget(9635)!=0|true))||(__CLR4_2_07a97a9lnxz22s5.R.iget(9636)==0&false))? QueryParser.parse(query) : null;
        __CLR4_2_07a97a9lnxz22s5.R.inc(9637);for (Element e : this) {{
            __CLR4_2_07a97a9lnxz22s5.R.inc(9638);do {{
                __CLR4_2_07a97a9lnxz22s5.R.inc(9639);Element sib = (((next )&&(__CLR4_2_07a97a9lnxz22s5.R.iget(9640)!=0|true))||(__CLR4_2_07a97a9lnxz22s5.R.iget(9641)==0&false))? e.nextElementSibling() : e.previousElementSibling();
                __CLR4_2_07a97a9lnxz22s5.R.inc(9642);if ((((sib == null)&&(__CLR4_2_07a97a9lnxz22s5.R.iget(9643)!=0|true))||(__CLR4_2_07a97a9lnxz22s5.R.iget(9644)==0&false))) {__CLR4_2_07a97a9lnxz22s5.R.inc(9645);break;
                }__CLR4_2_07a97a9lnxz22s5.R.inc(9646);if ((((eval == null)&&(__CLR4_2_07a97a9lnxz22s5.R.iget(9647)!=0|true))||(__CLR4_2_07a97a9lnxz22s5.R.iget(9648)==0&false)))
                    {__CLR4_2_07a97a9lnxz22s5.R.inc(9649);els.add(sib);
                }else {__CLR4_2_07a97a9lnxz22s5.R.inc(9650);if ((((sib.is(eval))&&(__CLR4_2_07a97a9lnxz22s5.R.iget(9651)!=0|true))||(__CLR4_2_07a97a9lnxz22s5.R.iget(9652)==0&false)))
                    {__CLR4_2_07a97a9lnxz22s5.R.inc(9653);els.add(sib);
                }}__CLR4_2_07a97a9lnxz22s5.R.inc(9654);e = sib;
            } }while ((((all)&&(__CLR4_2_07a97a9lnxz22s5.R.iget(9655)!=0|true))||(__CLR4_2_07a97a9lnxz22s5.R.iget(9656)==0&false)));
        }
        }__CLR4_2_07a97a9lnxz22s5.R.inc(9657);return els;
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}

    /**
     * Get all of the parents and ancestor elements of the matched elements.
     * @return all of the parents and ancestor elements of the matched elements
     */
    public Elements parents() {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9658);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9659);HashSet<Element> combo = new LinkedHashSet<>();
        __CLR4_2_07a97a9lnxz22s5.R.inc(9660);for (Element e: this) {{
            __CLR4_2_07a97a9lnxz22s5.R.inc(9661);combo.addAll(e.parents());
        }
        }__CLR4_2_07a97a9lnxz22s5.R.inc(9662);return new Elements(combo);
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}

    // list-like methods
    /**
     Get the first matched element.
     @return The first matched element, or <code>null</code> if contents is empty.
     */
    public Element first() {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9663);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9664);return (((isEmpty() )&&(__CLR4_2_07a97a9lnxz22s5.R.iget(9665)!=0|true))||(__CLR4_2_07a97a9lnxz22s5.R.iget(9666)==0&false))? null : get(0);
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}

    /**
     Get the last matched element.
     @return The last matched element, or <code>null</code> if contents is empty.
     */
    public Element last() {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9667);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9668);return (((isEmpty() )&&(__CLR4_2_07a97a9lnxz22s5.R.iget(9669)!=0|true))||(__CLR4_2_07a97a9lnxz22s5.R.iget(9670)==0&false))? null : get(size() - 1);
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}

    /**
     * Perform a depth-first traversal on each of the selected elements.
     * @param nodeVisitor the visitor callbacks to perform on each node
     * @return this, for chaining
     */
    public Elements traverse(NodeVisitor nodeVisitor) {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9671);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9672);NodeTraversor.traverse(nodeVisitor, this);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9673);return this;
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}

    /**
     * Perform a depth-first filtering on each of the selected elements.
     * @param nodeFilter the filter callbacks to perform on each node
     * @return this, for chaining
     */
    public Elements filter(NodeFilter nodeFilter) {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9674);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9675);NodeTraversor.filter(nodeFilter, this);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9676);return this;
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}

    /**
     * Get the {@link FormElement} forms from the selected elements, if any.
     * @return a list of {@link FormElement}s pulled from the matched elements. The list will be empty if the elements contain
     * no forms.
     */
    public List<FormElement> forms() {try{__CLR4_2_07a97a9lnxz22s5.R.inc(9677);
        __CLR4_2_07a97a9lnxz22s5.R.inc(9678);ArrayList<FormElement> forms = new ArrayList<>();
        __CLR4_2_07a97a9lnxz22s5.R.inc(9679);for (Element el: this)
            {__CLR4_2_07a97a9lnxz22s5.R.inc(9680);if ((((el instanceof FormElement)&&(__CLR4_2_07a97a9lnxz22s5.R.iget(9681)!=0|true))||(__CLR4_2_07a97a9lnxz22s5.R.iget(9682)==0&false)))
                {__CLR4_2_07a97a9lnxz22s5.R.inc(9683);forms.add((FormElement) el);
        }}__CLR4_2_07a97a9lnxz22s5.R.inc(9684);return forms;
    }finally{__CLR4_2_07a97a9lnxz22s5.R.flushNeeded();}}

}
