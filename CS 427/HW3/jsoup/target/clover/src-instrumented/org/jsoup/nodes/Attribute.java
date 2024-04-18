/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.nodes;

import org.jsoup.SerializationException;
import org.jsoup.internal.StringUtil;
import org.jsoup.helper.Validate;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/**
 A single key + value attribute. (Only used for presentation.)
 */
public class Attribute implements Map.Entry<String, String>, Cloneable  {public static class __CLR4_2_0185185lnxz22if{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,1692,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final String[] booleanAttributes = {
            "allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled",
            "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize",
            "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected",
            "sortable", "truespeed", "typemustmatch"
    };

    private String key;
    private String val;
    Attributes parent; // used to update the holding Attributes when the key / value is changed via this interface

    /**
     * Create a new attribute from unencoded (raw) key and value.
     * @param key attribute key; case is preserved.
     * @param value attribute value
     * @see #createFromEncoded
     */
    public Attribute(String key, String value) {
        this(key, value, null);__CLR4_2_0185185lnxz22if.R.inc(1590);try{__CLR4_2_0185185lnxz22if.R.inc(1589);
    }finally{__CLR4_2_0185185lnxz22if.R.flushNeeded();}}

    /**
     * Create a new attribute from unencoded (raw) key and value.
     * @param key attribute key; case is preserved.
     * @param val attribute value
     * @param parent the containing Attributes (this Attribute is not automatically added to said Attributes)
     * @see #createFromEncoded*/
    public Attribute(String key, String val, Attributes parent) {try{__CLR4_2_0185185lnxz22if.R.inc(1591);
        __CLR4_2_0185185lnxz22if.R.inc(1592);Validate.notNull(key);
        __CLR4_2_0185185lnxz22if.R.inc(1593);key = key.trim();
        __CLR4_2_0185185lnxz22if.R.inc(1594);Validate.notEmpty(key); // trimming could potentially make empty, so validate here
        __CLR4_2_0185185lnxz22if.R.inc(1595);this.key = key;
        __CLR4_2_0185185lnxz22if.R.inc(1596);this.val = val;
        __CLR4_2_0185185lnxz22if.R.inc(1597);this.parent = parent;
    }finally{__CLR4_2_0185185lnxz22if.R.flushNeeded();}}

    /**
     Get the attribute key.
     @return the attribute key
     */
    public String getKey() {try{__CLR4_2_0185185lnxz22if.R.inc(1598);
        __CLR4_2_0185185lnxz22if.R.inc(1599);return key;
    }finally{__CLR4_2_0185185lnxz22if.R.flushNeeded();}}

    /**
     Set the attribute key; case is preserved.
     @param key the new key; must not be null
     */
    public void setKey(String key) {try{__CLR4_2_0185185lnxz22if.R.inc(1600);
        __CLR4_2_0185185lnxz22if.R.inc(1601);Validate.notNull(key);
        __CLR4_2_0185185lnxz22if.R.inc(1602);key = key.trim();
        __CLR4_2_0185185lnxz22if.R.inc(1603);Validate.notEmpty(key); // trimming could potentially make empty, so validate here
        __CLR4_2_0185185lnxz22if.R.inc(1604);if ((((parent != null)&&(__CLR4_2_0185185lnxz22if.R.iget(1605)!=0|true))||(__CLR4_2_0185185lnxz22if.R.iget(1606)==0&false))) {{
            __CLR4_2_0185185lnxz22if.R.inc(1607);int i = parent.indexOfKey(this.key);
            __CLR4_2_0185185lnxz22if.R.inc(1608);if ((((i != Attributes.NotFound)&&(__CLR4_2_0185185lnxz22if.R.iget(1609)!=0|true))||(__CLR4_2_0185185lnxz22if.R.iget(1610)==0&false)))
                {__CLR4_2_0185185lnxz22if.R.inc(1611);parent.keys[i] = key;
        }}
        }__CLR4_2_0185185lnxz22if.R.inc(1612);this.key = key;
    }finally{__CLR4_2_0185185lnxz22if.R.flushNeeded();}}

    /**
     Get the attribute value.
     @return the attribute value
     */
    public String getValue() {try{__CLR4_2_0185185lnxz22if.R.inc(1613);
        __CLR4_2_0185185lnxz22if.R.inc(1614);return Attributes.checkNotNull(val);
    }finally{__CLR4_2_0185185lnxz22if.R.flushNeeded();}}

    /**
     Set the attribute value.
     @param val the new attribute value; must not be null
     */
    public String setValue(String val) {try{__CLR4_2_0185185lnxz22if.R.inc(1615);
        __CLR4_2_0185185lnxz22if.R.inc(1616);String oldVal = this.val;
        __CLR4_2_0185185lnxz22if.R.inc(1617);if ((((parent != null)&&(__CLR4_2_0185185lnxz22if.R.iget(1618)!=0|true))||(__CLR4_2_0185185lnxz22if.R.iget(1619)==0&false))) {{
            __CLR4_2_0185185lnxz22if.R.inc(1620);oldVal = parent.get(this.key); // trust the container more
            __CLR4_2_0185185lnxz22if.R.inc(1621);int i = parent.indexOfKey(this.key);
            __CLR4_2_0185185lnxz22if.R.inc(1622);if ((((i != Attributes.NotFound)&&(__CLR4_2_0185185lnxz22if.R.iget(1623)!=0|true))||(__CLR4_2_0185185lnxz22if.R.iget(1624)==0&false)))
                {__CLR4_2_0185185lnxz22if.R.inc(1625);parent.vals[i] = val;
        }}
        }__CLR4_2_0185185lnxz22if.R.inc(1626);this.val = val;
        __CLR4_2_0185185lnxz22if.R.inc(1627);return Attributes.checkNotNull(oldVal);
    }finally{__CLR4_2_0185185lnxz22if.R.flushNeeded();}}

    /**
     Get the HTML representation of this attribute; e.g. {@code href="index.html"}.
     @return HTML
     */
    public String html() {try{__CLR4_2_0185185lnxz22if.R.inc(1628);
        __CLR4_2_0185185lnxz22if.R.inc(1629);StringBuilder sb = StringUtil.borrowBuilder();
        
        __CLR4_2_0185185lnxz22if.R.inc(1630);try {
        	__CLR4_2_0185185lnxz22if.R.inc(1631);html(sb, (new Document("")).outputSettings());
        } catch(IOException exception) {
        	__CLR4_2_0185185lnxz22if.R.inc(1632);throw new SerializationException(exception);
        }
        __CLR4_2_0185185lnxz22if.R.inc(1633);return StringUtil.releaseBuilder(sb);
    }finally{__CLR4_2_0185185lnxz22if.R.flushNeeded();}}

    protected static void html(String key, String val, Appendable accum, Document.OutputSettings out) throws IOException {try{__CLR4_2_0185185lnxz22if.R.inc(1634);
        __CLR4_2_0185185lnxz22if.R.inc(1635);accum.append(key);
        __CLR4_2_0185185lnxz22if.R.inc(1636);if ((((!shouldCollapseAttribute(key, val, out))&&(__CLR4_2_0185185lnxz22if.R.iget(1637)!=0|true))||(__CLR4_2_0185185lnxz22if.R.iget(1638)==0&false))) {{
            __CLR4_2_0185185lnxz22if.R.inc(1639);accum.append("=\"");
            __CLR4_2_0185185lnxz22if.R.inc(1640);Entities.escape(accum, Attributes.checkNotNull(val) , out, true, false, false);
            __CLR4_2_0185185lnxz22if.R.inc(1641);accum.append('"');
        }
    }}finally{__CLR4_2_0185185lnxz22if.R.flushNeeded();}}
    
    protected void html(Appendable accum, Document.OutputSettings out) throws IOException {try{__CLR4_2_0185185lnxz22if.R.inc(1642);
        __CLR4_2_0185185lnxz22if.R.inc(1643);html(key, val, accum, out);
    }finally{__CLR4_2_0185185lnxz22if.R.flushNeeded();}}

    /**
     Get the string representation of this attribute, implemented as {@link #html()}.
     @return string
     */
    @Override
    public String toString() {try{__CLR4_2_0185185lnxz22if.R.inc(1644);
        __CLR4_2_0185185lnxz22if.R.inc(1645);return html();
    }finally{__CLR4_2_0185185lnxz22if.R.flushNeeded();}}

    /**
     * Create a new Attribute from an unencoded key and a HTML attribute encoded value.
     * @param unencodedKey assumes the key is not encoded, as can be only run of simple \w chars.
     * @param encodedValue HTML attribute encoded value
     * @return attribute
     */
    public static Attribute createFromEncoded(String unencodedKey, String encodedValue) {try{__CLR4_2_0185185lnxz22if.R.inc(1646);
        __CLR4_2_0185185lnxz22if.R.inc(1647);String value = Entities.unescape(encodedValue, true);
        __CLR4_2_0185185lnxz22if.R.inc(1648);return new Attribute(unencodedKey, value, null); // parent will get set when Put
    }finally{__CLR4_2_0185185lnxz22if.R.flushNeeded();}}

    protected boolean isDataAttribute() {try{__CLR4_2_0185185lnxz22if.R.inc(1649);
        __CLR4_2_0185185lnxz22if.R.inc(1650);return isDataAttribute(key);
    }finally{__CLR4_2_0185185lnxz22if.R.flushNeeded();}}

    protected static boolean isDataAttribute(String key) {try{__CLR4_2_0185185lnxz22if.R.inc(1651);
        __CLR4_2_0185185lnxz22if.R.inc(1652);return key.startsWith(Attributes.dataPrefix) && key.length() > Attributes.dataPrefix.length();
    }finally{__CLR4_2_0185185lnxz22if.R.flushNeeded();}}

    /**
     * Collapsible if it's a boolean attribute and value is empty or same as name
     * 
     * @param out output settings
     * @return  Returns whether collapsible or not
     */
    protected final boolean shouldCollapseAttribute(Document.OutputSettings out) {try{__CLR4_2_0185185lnxz22if.R.inc(1653);
        __CLR4_2_0185185lnxz22if.R.inc(1654);return shouldCollapseAttribute(key, val, out);
    }finally{__CLR4_2_0185185lnxz22if.R.flushNeeded();}}

    protected static boolean shouldCollapseAttribute(final String key, final String val, final Document.OutputSettings out) {try{__CLR4_2_0185185lnxz22if.R.inc(1655);
        __CLR4_2_0185185lnxz22if.R.inc(1656);return (
            out.syntax() == Document.OutputSettings.Syntax.html &&
                (val == null || ("".equals(val) || val.equalsIgnoreCase(key)) && Attribute.isBooleanAttribute(key)));
    }finally{__CLR4_2_0185185lnxz22if.R.flushNeeded();}}

    /**
     * @deprecated
     */
    protected boolean isBooleanAttribute() {try{__CLR4_2_0185185lnxz22if.R.inc(1657);
        __CLR4_2_0185185lnxz22if.R.inc(1658);return Arrays.binarySearch(booleanAttributes, key) >= 0 || val == null;
    }finally{__CLR4_2_0185185lnxz22if.R.flushNeeded();}}

    /**
     * Checks if this attribute name is defined as a boolean attribute in HTML5
     */
    protected static boolean isBooleanAttribute(final String key) {try{__CLR4_2_0185185lnxz22if.R.inc(1659);
        __CLR4_2_0185185lnxz22if.R.inc(1660);return Arrays.binarySearch(booleanAttributes, key) >= 0;
    }finally{__CLR4_2_0185185lnxz22if.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_2_0185185lnxz22if.R.inc(1661); // note parent not considered
        __CLR4_2_0185185lnxz22if.R.inc(1662);if ((((this == o)&&(__CLR4_2_0185185lnxz22if.R.iget(1663)!=0|true))||(__CLR4_2_0185185lnxz22if.R.iget(1664)==0&false))) {__CLR4_2_0185185lnxz22if.R.inc(1665);return true;
        }__CLR4_2_0185185lnxz22if.R.inc(1666);if ((((o == null || getClass() != o.getClass())&&(__CLR4_2_0185185lnxz22if.R.iget(1667)!=0|true))||(__CLR4_2_0185185lnxz22if.R.iget(1668)==0&false))) {__CLR4_2_0185185lnxz22if.R.inc(1669);return false;
        }__CLR4_2_0185185lnxz22if.R.inc(1670);Attribute attribute = (Attribute) o;
        __CLR4_2_0185185lnxz22if.R.inc(1671);if (((((((key != null )&&(__CLR4_2_0185185lnxz22if.R.iget(1672)!=0|true))||(__CLR4_2_0185185lnxz22if.R.iget(1673)==0&false))? !key.equals(attribute.key) : attribute.key != null)&&(__CLR4_2_0185185lnxz22if.R.iget(1674)!=0|true))||(__CLR4_2_0185185lnxz22if.R.iget(1675)==0&false))) {__CLR4_2_0185185lnxz22if.R.inc(1676);return false;
        }__CLR4_2_0185185lnxz22if.R.inc(1677);return (((val != null )&&(__CLR4_2_0185185lnxz22if.R.iget(1678)!=0|true))||(__CLR4_2_0185185lnxz22if.R.iget(1679)==0&false))? val.equals(attribute.val) : attribute.val == null;
    }finally{__CLR4_2_0185185lnxz22if.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_2_0185185lnxz22if.R.inc(1680); // note parent not considered
        __CLR4_2_0185185lnxz22if.R.inc(1681);int result = (((key != null )&&(__CLR4_2_0185185lnxz22if.R.iget(1682)!=0|true))||(__CLR4_2_0185185lnxz22if.R.iget(1683)==0&false))? key.hashCode() : 0;
        __CLR4_2_0185185lnxz22if.R.inc(1684);result = 31 * result + ((((val != null )&&(__CLR4_2_0185185lnxz22if.R.iget(1685)!=0|true))||(__CLR4_2_0185185lnxz22if.R.iget(1686)==0&false))? val.hashCode() : 0);
        __CLR4_2_0185185lnxz22if.R.inc(1687);return result;
    }finally{__CLR4_2_0185185lnxz22if.R.flushNeeded();}}

    @Override
    public Attribute clone() {try{__CLR4_2_0185185lnxz22if.R.inc(1688);
        __CLR4_2_0185185lnxz22if.R.inc(1689);try {
            __CLR4_2_0185185lnxz22if.R.inc(1690);return (Attribute) super.clone();
        } catch (CloneNotSupportedException e) {
            __CLR4_2_0185185lnxz22if.R.inc(1691);throw new RuntimeException(e);
        }
    }finally{__CLR4_2_0185185lnxz22if.R.flushNeeded();}}
}
