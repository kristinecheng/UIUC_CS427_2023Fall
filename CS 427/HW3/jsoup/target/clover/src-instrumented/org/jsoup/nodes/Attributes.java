/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.nodes;

import org.jsoup.SerializationException;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.parser.ParseSettings;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.jsoup.internal.Normalizer.lowerCase;

/**
 * The attributes of an Element.
 * <p>
 * Attributes are treated as a map: there can be only one value associated with an attribute key/name.
 * </p>
 * <p>
 * Attribute name and value comparisons are  generally <b>case sensitive</b>. By default for HTML, attribute names are
 * normalized to lower-case on parsing. That means you should use lower-case strings when referring to attributes by
 * name.
 * </p>
 *
 * @author Jonathan Hedley, jonathan@hedley.net
 */
public class Attributes implements Iterable<Attribute>, Cloneable {public static class __CLR4_2_01b01b0lnxz22iz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,1967,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected static final String dataPrefix = "data-";
    private static final int InitialCapacity = 4; // todo - analyze Alexa 1MM sites, determine best setting

    // manages the key/val arrays
    private static final int GrowthFactor = 2;
    private static final String[] Empty = {};
    static final int NotFound = -1;
    private static final String EmptyString = "";

    private int size = 0; // number of slots used (not capacity, which is keys.length
    String[] keys = Empty;
    String[] vals = Empty;

    // check there's room for more
    private void checkCapacity(int minNewSize) {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1692);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1693);Validate.isTrue(minNewSize >= size);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1694);int curSize = keys.length;
        __CLR4_2_01b01b0lnxz22iz.R.inc(1695);if ((((curSize >= minNewSize)&&(__CLR4_2_01b01b0lnxz22iz.R.iget(1696)!=0|true))||(__CLR4_2_01b01b0lnxz22iz.R.iget(1697)==0&false)))
            {__CLR4_2_01b01b0lnxz22iz.R.inc(1698);return;

        }__CLR4_2_01b01b0lnxz22iz.R.inc(1699);int newSize = (((curSize >= InitialCapacity )&&(__CLR4_2_01b01b0lnxz22iz.R.iget(1700)!=0|true))||(__CLR4_2_01b01b0lnxz22iz.R.iget(1701)==0&false))? size * GrowthFactor : InitialCapacity;
        __CLR4_2_01b01b0lnxz22iz.R.inc(1702);if ((((minNewSize > newSize)&&(__CLR4_2_01b01b0lnxz22iz.R.iget(1703)!=0|true))||(__CLR4_2_01b01b0lnxz22iz.R.iget(1704)==0&false)))
            {__CLR4_2_01b01b0lnxz22iz.R.inc(1705);newSize = minNewSize;

        }__CLR4_2_01b01b0lnxz22iz.R.inc(1706);keys = copyOf(keys, newSize);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1707);vals = copyOf(vals, newSize);
    }finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}

    // simple implementation of Arrays.copy, for support of Android API 8.
    private static String[] copyOf(String[] orig, int size) {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1708);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1709);final String[] copy = new String[size];
        __CLR4_2_01b01b0lnxz22iz.R.inc(1710);System.arraycopy(orig, 0, copy, 0,
                Math.min(orig.length, size));
        __CLR4_2_01b01b0lnxz22iz.R.inc(1711);return copy;
    }finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}

    int indexOfKey(String key) {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1712);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1713);Validate.notNull(key);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1714);for (int i = 0; (((i < size)&&(__CLR4_2_01b01b0lnxz22iz.R.iget(1715)!=0|true))||(__CLR4_2_01b01b0lnxz22iz.R.iget(1716)==0&false)); i++) {{
            __CLR4_2_01b01b0lnxz22iz.R.inc(1717);if ((((key.equals(keys[i]))&&(__CLR4_2_01b01b0lnxz22iz.R.iget(1718)!=0|true))||(__CLR4_2_01b01b0lnxz22iz.R.iget(1719)==0&false)))
                {__CLR4_2_01b01b0lnxz22iz.R.inc(1720);return i;
        }}
        }__CLR4_2_01b01b0lnxz22iz.R.inc(1721);return NotFound;
    }finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}

    private int indexOfKeyIgnoreCase(String key) {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1722);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1723);Validate.notNull(key);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1724);for (int i = 0; (((i < size)&&(__CLR4_2_01b01b0lnxz22iz.R.iget(1725)!=0|true))||(__CLR4_2_01b01b0lnxz22iz.R.iget(1726)==0&false)); i++) {{
            __CLR4_2_01b01b0lnxz22iz.R.inc(1727);if ((((key.equalsIgnoreCase(keys[i]))&&(__CLR4_2_01b01b0lnxz22iz.R.iget(1728)!=0|true))||(__CLR4_2_01b01b0lnxz22iz.R.iget(1729)==0&false)))
                {__CLR4_2_01b01b0lnxz22iz.R.inc(1730);return i;
        }}
        }__CLR4_2_01b01b0lnxz22iz.R.inc(1731);return NotFound;
    }finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}

    // we track boolean attributes as null in values - they're just keys. so returns empty for consumers
    static String checkNotNull(String val) {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1732);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1733);return (((val == null )&&(__CLR4_2_01b01b0lnxz22iz.R.iget(1734)!=0|true))||(__CLR4_2_01b01b0lnxz22iz.R.iget(1735)==0&false))? EmptyString : val;
    }finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}

    /**
     Get an attribute value by key.
     @param key the (case-sensitive) attribute key
     @return the attribute value if set; or empty string if not set (or a boolean attribute).
     @see #hasKey(String)
     */
    public String get(String key) {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1736);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1737);int i = indexOfKey(key);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1738);return (((i == NotFound )&&(__CLR4_2_01b01b0lnxz22iz.R.iget(1739)!=0|true))||(__CLR4_2_01b01b0lnxz22iz.R.iget(1740)==0&false))? EmptyString : checkNotNull(vals[i]);
    }finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}

    /**
     * Get an attribute's value by case-insensitive key
     * @param key the attribute name
     * @return the first matching attribute value if set; or empty string if not set (ora boolean attribute).
     */
    public String getIgnoreCase(String key) {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1741);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1742);int i = indexOfKeyIgnoreCase(key);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1743);return (((i == NotFound )&&(__CLR4_2_01b01b0lnxz22iz.R.iget(1744)!=0|true))||(__CLR4_2_01b01b0lnxz22iz.R.iget(1745)==0&false))? EmptyString : checkNotNull(vals[i]);
    }finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}

    /**
     * Adds a new attribute. Will produce duplicates if the key already exists.
     * @see Attributes#put(String, String)
     */
    public Attributes add(String key, String value) {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1746);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1747);checkCapacity(size + 1);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1748);keys[size] = key;
        __CLR4_2_01b01b0lnxz22iz.R.inc(1749);vals[size] = value;
        __CLR4_2_01b01b0lnxz22iz.R.inc(1750);size++;
        __CLR4_2_01b01b0lnxz22iz.R.inc(1751);return this;
    }finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}

    /**
     * Set a new attribute, or replace an existing one by key.
     * @param key case sensitive attribute key
     * @param value attribute value
     * @return these attributes, for chaining
     */
    public Attributes put(String key, String value) {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1752);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1753);int i = indexOfKey(key);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1754);if ((((i != NotFound)&&(__CLR4_2_01b01b0lnxz22iz.R.iget(1755)!=0|true))||(__CLR4_2_01b01b0lnxz22iz.R.iget(1756)==0&false)))
            {__CLR4_2_01b01b0lnxz22iz.R.inc(1757);vals[i] = value;
        }else
            {__CLR4_2_01b01b0lnxz22iz.R.inc(1758);add(key, value);
        }__CLR4_2_01b01b0lnxz22iz.R.inc(1759);return this;
    }finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}

    void putIgnoreCase(String key, String value) {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1760);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1761);int i = indexOfKeyIgnoreCase(key);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1762);if ((((i != NotFound)&&(__CLR4_2_01b01b0lnxz22iz.R.iget(1763)!=0|true))||(__CLR4_2_01b01b0lnxz22iz.R.iget(1764)==0&false))) {{
            __CLR4_2_01b01b0lnxz22iz.R.inc(1765);vals[i] = value;
            __CLR4_2_01b01b0lnxz22iz.R.inc(1766);if ((((!keys[i].equals(key))&&(__CLR4_2_01b01b0lnxz22iz.R.iget(1767)!=0|true))||(__CLR4_2_01b01b0lnxz22iz.R.iget(1768)==0&false))) // case changed, update
                {__CLR4_2_01b01b0lnxz22iz.R.inc(1769);keys[i] = key;
        }}
        }else
            {__CLR4_2_01b01b0lnxz22iz.R.inc(1770);add(key, value);
    }}finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}

    /**
     * Set a new boolean attribute, remove attribute if value is false.
     * @param key case <b>insensitive</b> attribute key
     * @param value attribute value
     * @return these attributes, for chaining
     */
    public Attributes put(String key, boolean value) {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1771);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1772);if ((((value)&&(__CLR4_2_01b01b0lnxz22iz.R.iget(1773)!=0|true))||(__CLR4_2_01b01b0lnxz22iz.R.iget(1774)==0&false)))
            {__CLR4_2_01b01b0lnxz22iz.R.inc(1775);putIgnoreCase(key, null);
        }else
            {__CLR4_2_01b01b0lnxz22iz.R.inc(1776);remove(key);
        }__CLR4_2_01b01b0lnxz22iz.R.inc(1777);return this;
    }finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}

    /**
     Set a new attribute, or replace an existing one by key.
     @param attribute attribute with case sensitive key
     @return these attributes, for chaining
     */
    public Attributes put(Attribute attribute) {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1778);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1779);Validate.notNull(attribute);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1780);put(attribute.getKey(), attribute.getValue());
        __CLR4_2_01b01b0lnxz22iz.R.inc(1781);attribute.parent = this;
        __CLR4_2_01b01b0lnxz22iz.R.inc(1782);return this;
    }finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}

    // removes and shifts up
    private void remove(int index) {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1783);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1784);Validate.isFalse(index >= size);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1785);int shifted = size - index - 1;
        __CLR4_2_01b01b0lnxz22iz.R.inc(1786);if ((((shifted > 0)&&(__CLR4_2_01b01b0lnxz22iz.R.iget(1787)!=0|true))||(__CLR4_2_01b01b0lnxz22iz.R.iget(1788)==0&false))) {{
            __CLR4_2_01b01b0lnxz22iz.R.inc(1789);System.arraycopy(keys, index + 1, keys, index, shifted);
            __CLR4_2_01b01b0lnxz22iz.R.inc(1790);System.arraycopy(vals, index + 1, vals, index, shifted);
        }
        }__CLR4_2_01b01b0lnxz22iz.R.inc(1791);size--;
        __CLR4_2_01b01b0lnxz22iz.R.inc(1792);keys[size] = null; // release hold
        __CLR4_2_01b01b0lnxz22iz.R.inc(1793);vals[size] = null;
    }finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}

    /**
     Remove an attribute by key. <b>Case sensitive.</b>
     @param key attribute key to remove
     */
    public void remove(String key) {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1794);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1795);int i = indexOfKey(key);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1796);if ((((i != NotFound)&&(__CLR4_2_01b01b0lnxz22iz.R.iget(1797)!=0|true))||(__CLR4_2_01b01b0lnxz22iz.R.iget(1798)==0&false)))
            {__CLR4_2_01b01b0lnxz22iz.R.inc(1799);remove(i);
    }}finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}

    /**
     Remove an attribute by key. <b>Case insensitive.</b>
     @param key attribute key to remove
     */
    public void removeIgnoreCase(String key) {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1800);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1801);int i = indexOfKeyIgnoreCase(key);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1802);if ((((i != NotFound)&&(__CLR4_2_01b01b0lnxz22iz.R.iget(1803)!=0|true))||(__CLR4_2_01b01b0lnxz22iz.R.iget(1804)==0&false)))
            {__CLR4_2_01b01b0lnxz22iz.R.inc(1805);remove(i);
    }}finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}

    /**
     Tests if these attributes contain an attribute with this key.
     @param key case-sensitive key to check for
     @return true if key exists, false otherwise
     */
    public boolean hasKey(String key) {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1806);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1807);return indexOfKey(key) != NotFound;
    }finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}

    /**
     Tests if these attributes contain an attribute with this key.
     @param key key to check for
     @return true if key exists, false otherwise
     */
    public boolean hasKeyIgnoreCase(String key) {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1808);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1809);return indexOfKeyIgnoreCase(key) != NotFound;
    }finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}

    /**
     Get the number of attributes in this set.
     @return size
     */
    public int size() {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1810);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1811);return size;
    }finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}

    /**
     * Test if this Attributes list is empty (size==0).
     */
    public boolean isEmpty() {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1812);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1813);return size == 0;
    }finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}

    /**
     Add all the attributes from the incoming set to this set.
     @param incoming attributes to add to these attributes.
     */
    public void addAll(Attributes incoming) {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1814);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1815);if ((((incoming.size() == 0)&&(__CLR4_2_01b01b0lnxz22iz.R.iget(1816)!=0|true))||(__CLR4_2_01b01b0lnxz22iz.R.iget(1817)==0&false)))
            {__CLR4_2_01b01b0lnxz22iz.R.inc(1818);return;
        }__CLR4_2_01b01b0lnxz22iz.R.inc(1819);checkCapacity(size + incoming.size);

        __CLR4_2_01b01b0lnxz22iz.R.inc(1820);for (Attribute attr : incoming) {{
            // todo - should this be case insensitive?
            __CLR4_2_01b01b0lnxz22iz.R.inc(1821);put(attr);
        }

    }}finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}

    public Iterator<Attribute> iterator() {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1822);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1823);return new Iterator<Attribute>() {
            int i = 0;

            @Override
            public boolean hasNext() {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1824);
                __CLR4_2_01b01b0lnxz22iz.R.inc(1825);return i < size;
            }finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}

            @Override
            public Attribute next() {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1826);
                __CLR4_2_01b01b0lnxz22iz.R.inc(1827);final Attribute attr = new Attribute(keys[i], vals[i], Attributes.this);
                __CLR4_2_01b01b0lnxz22iz.R.inc(1828);i++;
                __CLR4_2_01b01b0lnxz22iz.R.inc(1829);return attr;
            }finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}

            @Override
            public void remove() {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1830);
                __CLR4_2_01b01b0lnxz22iz.R.inc(1831);Attributes.this.remove(--i); // next() advanced, so rewind
            }finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}
        };
    }finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}

    /**
     Get the attributes as a List, for iteration.
     @return an view of the attributes as an unmodifialbe List.
     */
    public List<Attribute> asList() {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1832);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1833);ArrayList<Attribute> list = new ArrayList<>(size);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1834);for (int i = 0; (((i < size)&&(__CLR4_2_01b01b0lnxz22iz.R.iget(1835)!=0|true))||(__CLR4_2_01b01b0lnxz22iz.R.iget(1836)==0&false)); i++) {{
            __CLR4_2_01b01b0lnxz22iz.R.inc(1837);Attribute attr = (((vals[i] == null )&&(__CLR4_2_01b01b0lnxz22iz.R.iget(1838)!=0|true))||(__CLR4_2_01b01b0lnxz22iz.R.iget(1839)==0&false))?
                new BooleanAttribute(keys[i]) : // deprecated class, but maybe someone still wants it
                new Attribute(keys[i], vals[i], Attributes.this);
            __CLR4_2_01b01b0lnxz22iz.R.inc(1840);list.add(attr);
        }
        }__CLR4_2_01b01b0lnxz22iz.R.inc(1841);return Collections.unmodifiableList(list);
    }finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}

    /**
     * Retrieves a filtered view of attributes that are HTML5 custom data attributes; that is, attributes with keys
     * starting with {@code data-}.
     * @return map of custom data attributes.
     */
    public Map<String, String> dataset() {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1842);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1843);return new Dataset(this);
    }finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}

    /**
     Get the HTML representation of these attributes.
     @return HTML
     @throws SerializationException if the HTML representation of the attributes cannot be constructed.
     */
    public String html() {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1844);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1845);StringBuilder sb = StringUtil.borrowBuilder();
        __CLR4_2_01b01b0lnxz22iz.R.inc(1846);try {
            __CLR4_2_01b01b0lnxz22iz.R.inc(1847);html(sb, (new Document("")).outputSettings()); // output settings a bit funky, but this html() seldom used
        } catch (IOException e) { // ought never happen
            __CLR4_2_01b01b0lnxz22iz.R.inc(1848);throw new SerializationException(e);
        }
        __CLR4_2_01b01b0lnxz22iz.R.inc(1849);return StringUtil.releaseBuilder(sb);
    }finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}

    final void html(final Appendable accum, final Document.OutputSettings out) throws IOException {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1850);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1851);final int sz = size;
        __CLR4_2_01b01b0lnxz22iz.R.inc(1852);for (int i = 0; (((i < sz)&&(__CLR4_2_01b01b0lnxz22iz.R.iget(1853)!=0|true))||(__CLR4_2_01b01b0lnxz22iz.R.iget(1854)==0&false)); i++) {{
            // inlined from Attribute.html()
            __CLR4_2_01b01b0lnxz22iz.R.inc(1855);final String key = keys[i];
            __CLR4_2_01b01b0lnxz22iz.R.inc(1856);final String val = vals[i];
            __CLR4_2_01b01b0lnxz22iz.R.inc(1857);accum.append(' ').append(key);

            // collapse checked=null, checked="", checked=checked; write out others
            __CLR4_2_01b01b0lnxz22iz.R.inc(1858);if ((((!Attribute.shouldCollapseAttribute(key, val, out))&&(__CLR4_2_01b01b0lnxz22iz.R.iget(1859)!=0|true))||(__CLR4_2_01b01b0lnxz22iz.R.iget(1860)==0&false))) {{
                __CLR4_2_01b01b0lnxz22iz.R.inc(1861);accum.append("=\"");
                __CLR4_2_01b01b0lnxz22iz.R.inc(1862);Entities.escape(accum, (((val == null )&&(__CLR4_2_01b01b0lnxz22iz.R.iget(1863)!=0|true))||(__CLR4_2_01b01b0lnxz22iz.R.iget(1864)==0&false))? EmptyString : val, out, true, false, false);
                __CLR4_2_01b01b0lnxz22iz.R.inc(1865);accum.append('"');
            }
        }}
    }}finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1866);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1867);return html();
    }finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}

    /**
     * Checks if these attributes are equal to another set of attributes, by comparing the two sets
     * @param o attributes to compare with
     * @return if both sets of attributes have the same content
     */
    @Override
    public boolean equals(Object o) {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1868);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1869);if ((((this == o)&&(__CLR4_2_01b01b0lnxz22iz.R.iget(1870)!=0|true))||(__CLR4_2_01b01b0lnxz22iz.R.iget(1871)==0&false))) {__CLR4_2_01b01b0lnxz22iz.R.inc(1872);return true;
        }__CLR4_2_01b01b0lnxz22iz.R.inc(1873);if ((((o == null || getClass() != o.getClass())&&(__CLR4_2_01b01b0lnxz22iz.R.iget(1874)!=0|true))||(__CLR4_2_01b01b0lnxz22iz.R.iget(1875)==0&false))) {__CLR4_2_01b01b0lnxz22iz.R.inc(1876);return false;

        }__CLR4_2_01b01b0lnxz22iz.R.inc(1877);Attributes that = (Attributes) o;

        __CLR4_2_01b01b0lnxz22iz.R.inc(1878);if ((((size != that.size)&&(__CLR4_2_01b01b0lnxz22iz.R.iget(1879)!=0|true))||(__CLR4_2_01b01b0lnxz22iz.R.iget(1880)==0&false))) {__CLR4_2_01b01b0lnxz22iz.R.inc(1881);return false;
        }__CLR4_2_01b01b0lnxz22iz.R.inc(1882);if ((((!Arrays.equals(keys, that.keys))&&(__CLR4_2_01b01b0lnxz22iz.R.iget(1883)!=0|true))||(__CLR4_2_01b01b0lnxz22iz.R.iget(1884)==0&false))) {__CLR4_2_01b01b0lnxz22iz.R.inc(1885);return false;
        }__CLR4_2_01b01b0lnxz22iz.R.inc(1886);return Arrays.equals(vals, that.vals);
    }finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}

    /**
     * Calculates the hashcode of these attributes, by iterating all attributes and summing their hashcodes.
     * @return calculated hashcode
     */
    @Override
    public int hashCode() {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1887);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1888);int result = size;
        __CLR4_2_01b01b0lnxz22iz.R.inc(1889);result = 31 * result + Arrays.hashCode(keys);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1890);result = 31 * result + Arrays.hashCode(vals);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1891);return result;
    }finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}

    @Override
    public Attributes clone() {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1892);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1893);Attributes clone;
        __CLR4_2_01b01b0lnxz22iz.R.inc(1894);try {
            __CLR4_2_01b01b0lnxz22iz.R.inc(1895);clone = (Attributes) super.clone();
        } catch (CloneNotSupportedException e) {
            __CLR4_2_01b01b0lnxz22iz.R.inc(1896);throw new RuntimeException(e);
        }
        __CLR4_2_01b01b0lnxz22iz.R.inc(1897);clone.size = size;
        __CLR4_2_01b01b0lnxz22iz.R.inc(1898);keys = copyOf(keys, size);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1899);vals = copyOf(vals, size);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1900);return clone;
    }finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}

    /**
     * Internal method. Lowercases all keys.
     */
    public void normalize() {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1901);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1902);for (int i = 0; (((i < size)&&(__CLR4_2_01b01b0lnxz22iz.R.iget(1903)!=0|true))||(__CLR4_2_01b01b0lnxz22iz.R.iget(1904)==0&false)); i++) {{
            __CLR4_2_01b01b0lnxz22iz.R.inc(1905);keys[i] = lowerCase(keys[i]);
        }
    }}finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}

    /**
     * Internal method. Removes duplicate attribute by name. Settings for case sensitivity of key names.
     * @param settings case sensitivity
     * @return number of removed dupes
     */
    public int deduplicate(ParseSettings settings) {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1906);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1907);if ((((isEmpty())&&(__CLR4_2_01b01b0lnxz22iz.R.iget(1908)!=0|true))||(__CLR4_2_01b01b0lnxz22iz.R.iget(1909)==0&false)))
            {__CLR4_2_01b01b0lnxz22iz.R.inc(1910);return 0;
        }__CLR4_2_01b01b0lnxz22iz.R.inc(1911);boolean preserve = settings.preserveAttributeCase();
        __CLR4_2_01b01b0lnxz22iz.R.inc(1912);int dupes = 0;
        __CLR4_2_01b01b0lnxz22iz.R.inc(1913);OUTER: for (int i = 0; (((i < keys.length)&&(__CLR4_2_01b01b0lnxz22iz.R.iget(1914)!=0|true))||(__CLR4_2_01b01b0lnxz22iz.R.iget(1915)==0&false)); i++) {{
            __CLR4_2_01b01b0lnxz22iz.R.inc(1916);for (int j = i + 1; (((j < keys.length)&&(__CLR4_2_01b01b0lnxz22iz.R.iget(1917)!=0|true))||(__CLR4_2_01b01b0lnxz22iz.R.iget(1918)==0&false)); j++) {{
                __CLR4_2_01b01b0lnxz22iz.R.inc(1919);if ((((keys[j] == null)&&(__CLR4_2_01b01b0lnxz22iz.R.iget(1920)!=0|true))||(__CLR4_2_01b01b0lnxz22iz.R.iget(1921)==0&false)))
                    {__CLR4_2_01b01b0lnxz22iz.R.inc(1922);continue OUTER; // keys.length doesn't shrink when removing, so re-test
                }__CLR4_2_01b01b0lnxz22iz.R.inc(1923);if (((((preserve && keys[i].equals(keys[j])) || (!preserve && keys[i].equalsIgnoreCase(keys[j])))&&(__CLR4_2_01b01b0lnxz22iz.R.iget(1924)!=0|true))||(__CLR4_2_01b01b0lnxz22iz.R.iget(1925)==0&false))) {{
                    __CLR4_2_01b01b0lnxz22iz.R.inc(1926);dupes++;
                    __CLR4_2_01b01b0lnxz22iz.R.inc(1927);remove(j);
                    __CLR4_2_01b01b0lnxz22iz.R.inc(1928);j--;
                }
            }}
        }}
        }__CLR4_2_01b01b0lnxz22iz.R.inc(1929);return dupes;
    }finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}

    private static class Dataset extends AbstractMap<String, String> {
        private final Attributes attributes;

        private Dataset(Attributes attributes) {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1930);
            __CLR4_2_01b01b0lnxz22iz.R.inc(1931);this.attributes = attributes;
        }finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}

        @Override
        public Set<Entry<String, String>> entrySet() {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1932);
            __CLR4_2_01b01b0lnxz22iz.R.inc(1933);return new EntrySet();
        }finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}

        @Override
        public String put(String key, String value) {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1934);
            __CLR4_2_01b01b0lnxz22iz.R.inc(1935);String dataKey = dataKey(key);
            __CLR4_2_01b01b0lnxz22iz.R.inc(1936);String oldValue = (((attributes.hasKey(dataKey) )&&(__CLR4_2_01b01b0lnxz22iz.R.iget(1937)!=0|true))||(__CLR4_2_01b01b0lnxz22iz.R.iget(1938)==0&false))? attributes.get(dataKey) : null;
            __CLR4_2_01b01b0lnxz22iz.R.inc(1939);attributes.put(dataKey, value);
            __CLR4_2_01b01b0lnxz22iz.R.inc(1940);return oldValue;
        }finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}

        private class EntrySet extends AbstractSet<Map.Entry<String, String>> {

            @Override
            public Iterator<Map.Entry<String, String>> iterator() {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1941);
                __CLR4_2_01b01b0lnxz22iz.R.inc(1942);return new DatasetIterator();
            }finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}

            @Override
            public int size() {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1943);
                __CLR4_2_01b01b0lnxz22iz.R.inc(1944);int count = 0;
                __CLR4_2_01b01b0lnxz22iz.R.inc(1945);Iterator iter = new DatasetIterator();
                __CLR4_2_01b01b0lnxz22iz.R.inc(1946);while ((((iter.hasNext())&&(__CLR4_2_01b01b0lnxz22iz.R.iget(1947)!=0|true))||(__CLR4_2_01b01b0lnxz22iz.R.iget(1948)==0&false)))
                    {__CLR4_2_01b01b0lnxz22iz.R.inc(1949);count++;
                }__CLR4_2_01b01b0lnxz22iz.R.inc(1950);return count;
            }finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}
        }

        private class DatasetIterator implements Iterator<Map.Entry<String, String>> {
            private Iterator<Attribute> attrIter = attributes.iterator();
            private Attribute attr;
            public boolean hasNext() {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1951);
                __CLR4_2_01b01b0lnxz22iz.R.inc(1952);while ((((attrIter.hasNext())&&(__CLR4_2_01b01b0lnxz22iz.R.iget(1953)!=0|true))||(__CLR4_2_01b01b0lnxz22iz.R.iget(1954)==0&false))) {{
                    __CLR4_2_01b01b0lnxz22iz.R.inc(1955);attr = attrIter.next();
                    __CLR4_2_01b01b0lnxz22iz.R.inc(1956);if ((((attr.isDataAttribute())&&(__CLR4_2_01b01b0lnxz22iz.R.iget(1957)!=0|true))||(__CLR4_2_01b01b0lnxz22iz.R.iget(1958)==0&false))) {__CLR4_2_01b01b0lnxz22iz.R.inc(1959);return true;
                }}
                }__CLR4_2_01b01b0lnxz22iz.R.inc(1960);return false;
            }finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}

            public Entry<String, String> next() {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1961);
                __CLR4_2_01b01b0lnxz22iz.R.inc(1962);return new Attribute(attr.getKey().substring(dataPrefix.length()), attr.getValue());
            }finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}

            public void remove() {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1963);
                __CLR4_2_01b01b0lnxz22iz.R.inc(1964);attributes.remove(attr.getKey());
            }finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}
        }
    }

    private static String dataKey(String key) {try{__CLR4_2_01b01b0lnxz22iz.R.inc(1965);
        __CLR4_2_01b01b0lnxz22iz.R.inc(1966);return dataPrefix + key;
    }finally{__CLR4_2_01b01b0lnxz22iz.R.flushNeeded();}}
}
