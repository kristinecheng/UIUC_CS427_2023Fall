/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.internal;

import org.jsoup.helper.Validate;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;

/**
 * A minimal String utility class. Designed for internal jsoup use only.
 */
public final class StringUtil {public static class __CLR4_2_0140140lnxz22hz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,1589,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // memoised padding up to 21
    static final String[] padding = {"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ",
        "         ", "          ", "           ", "            ", "             ", "              ", "               ",
        "                ", "                 ", "                  ", "                   ", "                    "};

    /**
     * Join a collection of strings by a separator
     * @param strings collection of string objects
     * @param sep string to place between strings
     * @return joined string
     */
    public static String join(Collection strings, String sep) {try{__CLR4_2_0140140lnxz22hz.R.inc(1440);
        __CLR4_2_0140140lnxz22hz.R.inc(1441);return join(strings.iterator(), sep);
    }finally{__CLR4_2_0140140lnxz22hz.R.flushNeeded();}}

    /**
     * Join a collection of strings by a separator
     * @param strings iterator of string objects
     * @param sep string to place between strings
     * @return joined string
     */
    public static String join(Iterator strings, String sep) {try{__CLR4_2_0140140lnxz22hz.R.inc(1442);
        __CLR4_2_0140140lnxz22hz.R.inc(1443);if ((((!strings.hasNext())&&(__CLR4_2_0140140lnxz22hz.R.iget(1444)!=0|true))||(__CLR4_2_0140140lnxz22hz.R.iget(1445)==0&false)))
            {__CLR4_2_0140140lnxz22hz.R.inc(1446);return "";

        }__CLR4_2_0140140lnxz22hz.R.inc(1447);String start = strings.next().toString();
        __CLR4_2_0140140lnxz22hz.R.inc(1448);if ((((!strings.hasNext())&&(__CLR4_2_0140140lnxz22hz.R.iget(1449)!=0|true))||(__CLR4_2_0140140lnxz22hz.R.iget(1450)==0&false))) // only one, avoid builder
            {__CLR4_2_0140140lnxz22hz.R.inc(1451);return start;

        }__CLR4_2_0140140lnxz22hz.R.inc(1452);StringBuilder sb = StringUtil.borrowBuilder().append(start);
        __CLR4_2_0140140lnxz22hz.R.inc(1453);while ((((strings.hasNext())&&(__CLR4_2_0140140lnxz22hz.R.iget(1454)!=0|true))||(__CLR4_2_0140140lnxz22hz.R.iget(1455)==0&false))) {{
            __CLR4_2_0140140lnxz22hz.R.inc(1456);sb.append(sep);
            __CLR4_2_0140140lnxz22hz.R.inc(1457);sb.append(strings.next());
        }
        }__CLR4_2_0140140lnxz22hz.R.inc(1458);return StringUtil.releaseBuilder(sb);
    }finally{__CLR4_2_0140140lnxz22hz.R.flushNeeded();}}

    /**
     * Join an array of strings by a separator
     * @param strings collection of string objects
     * @param sep string to place between strings
     * @return joined string
     */
    public static String join(String[] strings, String sep) {try{__CLR4_2_0140140lnxz22hz.R.inc(1459);
        __CLR4_2_0140140lnxz22hz.R.inc(1460);return join(Arrays.asList(strings), sep);
    }finally{__CLR4_2_0140140lnxz22hz.R.flushNeeded();}}

    /**
     * Returns space padding
     * @param width amount of padding desired
     * @return string of spaces * width
     */
    public static String padding(int width) {try{__CLR4_2_0140140lnxz22hz.R.inc(1461);
        __CLR4_2_0140140lnxz22hz.R.inc(1462);if ((((width < 0)&&(__CLR4_2_0140140lnxz22hz.R.iget(1463)!=0|true))||(__CLR4_2_0140140lnxz22hz.R.iget(1464)==0&false)))
            {__CLR4_2_0140140lnxz22hz.R.inc(1465);throw new IllegalArgumentException("width must be > 0");

        }__CLR4_2_0140140lnxz22hz.R.inc(1466);if ((((width < padding.length)&&(__CLR4_2_0140140lnxz22hz.R.iget(1467)!=0|true))||(__CLR4_2_0140140lnxz22hz.R.iget(1468)==0&false)))
            {__CLR4_2_0140140lnxz22hz.R.inc(1469);return padding[width];
        }__CLR4_2_0140140lnxz22hz.R.inc(1470);char[] out = new char[width];
        __CLR4_2_0140140lnxz22hz.R.inc(1471);for (int i = 0; (((i < width)&&(__CLR4_2_0140140lnxz22hz.R.iget(1472)!=0|true))||(__CLR4_2_0140140lnxz22hz.R.iget(1473)==0&false)); i++)
            {__CLR4_2_0140140lnxz22hz.R.inc(1474);out[i] = ' ';
        }__CLR4_2_0140140lnxz22hz.R.inc(1475);return String.valueOf(out);
    }finally{__CLR4_2_0140140lnxz22hz.R.flushNeeded();}}

    /**
     * Tests if a string is blank: null, empty, or only whitespace (" ", \r\n, \t, etc)
     * @param string string to test
     * @return if string is blank
     */
    public static boolean isBlank(String string) {try{__CLR4_2_0140140lnxz22hz.R.inc(1476);
        __CLR4_2_0140140lnxz22hz.R.inc(1477);if ((((string == null || string.length() == 0)&&(__CLR4_2_0140140lnxz22hz.R.iget(1478)!=0|true))||(__CLR4_2_0140140lnxz22hz.R.iget(1479)==0&false)))
            {__CLR4_2_0140140lnxz22hz.R.inc(1480);return true;

        }__CLR4_2_0140140lnxz22hz.R.inc(1481);int l = string.length();
        __CLR4_2_0140140lnxz22hz.R.inc(1482);for (int i = 0; (((i < l)&&(__CLR4_2_0140140lnxz22hz.R.iget(1483)!=0|true))||(__CLR4_2_0140140lnxz22hz.R.iget(1484)==0&false)); i++) {{
            __CLR4_2_0140140lnxz22hz.R.inc(1485);if ((((!StringUtil.isWhitespace(string.codePointAt(i)))&&(__CLR4_2_0140140lnxz22hz.R.iget(1486)!=0|true))||(__CLR4_2_0140140lnxz22hz.R.iget(1487)==0&false)))
                {__CLR4_2_0140140lnxz22hz.R.inc(1488);return false;
        }}
        }__CLR4_2_0140140lnxz22hz.R.inc(1489);return true;
    }finally{__CLR4_2_0140140lnxz22hz.R.flushNeeded();}}

    /**
     * Tests if a string is numeric, i.e. contains only digit characters
     * @param string string to test
     * @return true if only digit chars, false if empty or null or contains non-digit chars
     */
    public static boolean isNumeric(String string) {try{__CLR4_2_0140140lnxz22hz.R.inc(1490);
        __CLR4_2_0140140lnxz22hz.R.inc(1491);if ((((string == null || string.length() == 0)&&(__CLR4_2_0140140lnxz22hz.R.iget(1492)!=0|true))||(__CLR4_2_0140140lnxz22hz.R.iget(1493)==0&false)))
            {__CLR4_2_0140140lnxz22hz.R.inc(1494);return false;

        }__CLR4_2_0140140lnxz22hz.R.inc(1495);int l = string.length();
        __CLR4_2_0140140lnxz22hz.R.inc(1496);for (int i = 0; (((i < l)&&(__CLR4_2_0140140lnxz22hz.R.iget(1497)!=0|true))||(__CLR4_2_0140140lnxz22hz.R.iget(1498)==0&false)); i++) {{
            __CLR4_2_0140140lnxz22hz.R.inc(1499);if ((((!Character.isDigit(string.codePointAt(i)))&&(__CLR4_2_0140140lnxz22hz.R.iget(1500)!=0|true))||(__CLR4_2_0140140lnxz22hz.R.iget(1501)==0&false)))
                {__CLR4_2_0140140lnxz22hz.R.inc(1502);return false;
        }}
        }__CLR4_2_0140140lnxz22hz.R.inc(1503);return true;
    }finally{__CLR4_2_0140140lnxz22hz.R.flushNeeded();}}

    /**
     * Tests if a code point is "whitespace" as defined in the HTML spec. Used for output HTML.
     * @param c code point to test
     * @return true if code point is whitespace, false otherwise
     * @see #isActuallyWhitespace(int)
     */
    public static boolean isWhitespace(int c){try{__CLR4_2_0140140lnxz22hz.R.inc(1504);
        __CLR4_2_0140140lnxz22hz.R.inc(1505);return c == ' ' || c == '\t' || c == '\n' || c == '\f' || c == '\r';
    }finally{__CLR4_2_0140140lnxz22hz.R.flushNeeded();}}

    /**
     * Tests if a code point is "whitespace" as defined by what it looks like. Used for Element.text etc.
     * @param c code point to test
     * @return true if code point is whitespace, false otherwise
     */
    public static boolean isActuallyWhitespace(int c){try{__CLR4_2_0140140lnxz22hz.R.inc(1506);
        __CLR4_2_0140140lnxz22hz.R.inc(1507);return c == ' ' || c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == 160;
        // 160 is &nbsp; (non-breaking space). Not in the spec but expected.
    }finally{__CLR4_2_0140140lnxz22hz.R.flushNeeded();}}

    public static boolean isInvisibleChar(int c) {try{__CLR4_2_0140140lnxz22hz.R.inc(1508);
        __CLR4_2_0140140lnxz22hz.R.inc(1509);return Character.getType(c) == 16 && (c == 8203 || c == 8204 || c == 8205 || c == 173);
        // zero width sp, zw non join, zw join, soft hyphen
    }finally{__CLR4_2_0140140lnxz22hz.R.flushNeeded();}}

    /**
     * Normalise the whitespace within this string; multiple spaces collapse to a single, and all whitespace characters
     * (e.g. newline, tab) convert to a simple space
     * @param string content to normalise
     * @return normalised string
     */
    public static String normaliseWhitespace(String string) {try{__CLR4_2_0140140lnxz22hz.R.inc(1510);
        __CLR4_2_0140140lnxz22hz.R.inc(1511);StringBuilder sb = StringUtil.borrowBuilder();
        __CLR4_2_0140140lnxz22hz.R.inc(1512);appendNormalisedWhitespace(sb, string, false);
        __CLR4_2_0140140lnxz22hz.R.inc(1513);return StringUtil.releaseBuilder(sb);
    }finally{__CLR4_2_0140140lnxz22hz.R.flushNeeded();}}

    /**
     * After normalizing the whitespace within a string, appends it to a string builder.
     * @param accum builder to append to
     * @param string string to normalize whitespace within
     * @param stripLeading set to true if you wish to remove any leading whitespace
     */
    public static void appendNormalisedWhitespace(StringBuilder accum, String string, boolean stripLeading) {try{__CLR4_2_0140140lnxz22hz.R.inc(1514);
        __CLR4_2_0140140lnxz22hz.R.inc(1515);boolean lastWasWhite = false;
        __CLR4_2_0140140lnxz22hz.R.inc(1516);boolean reachedNonWhite = false;

        __CLR4_2_0140140lnxz22hz.R.inc(1517);int len = string.length();
        __CLR4_2_0140140lnxz22hz.R.inc(1518);int c;
        __CLR4_2_0140140lnxz22hz.R.inc(1519);for (int i = 0; (((i < len)&&(__CLR4_2_0140140lnxz22hz.R.iget(1520)!=0|true))||(__CLR4_2_0140140lnxz22hz.R.iget(1521)==0&false)); i+= Character.charCount(c)) {{
            __CLR4_2_0140140lnxz22hz.R.inc(1522);c = string.codePointAt(i);
            __CLR4_2_0140140lnxz22hz.R.inc(1523);if ((((isActuallyWhitespace(c))&&(__CLR4_2_0140140lnxz22hz.R.iget(1524)!=0|true))||(__CLR4_2_0140140lnxz22hz.R.iget(1525)==0&false))) {{
                __CLR4_2_0140140lnxz22hz.R.inc(1526);if (((((stripLeading && !reachedNonWhite) || lastWasWhite)&&(__CLR4_2_0140140lnxz22hz.R.iget(1527)!=0|true))||(__CLR4_2_0140140lnxz22hz.R.iget(1528)==0&false)))
                    {__CLR4_2_0140140lnxz22hz.R.inc(1529);continue;
                }__CLR4_2_0140140lnxz22hz.R.inc(1530);accum.append(' ');
                __CLR4_2_0140140lnxz22hz.R.inc(1531);lastWasWhite = true;
            }
            }else {__CLR4_2_0140140lnxz22hz.R.inc(1532);if ((((!isInvisibleChar(c))&&(__CLR4_2_0140140lnxz22hz.R.iget(1533)!=0|true))||(__CLR4_2_0140140lnxz22hz.R.iget(1534)==0&false))) {{
                __CLR4_2_0140140lnxz22hz.R.inc(1535);accum.appendCodePoint(c);
                __CLR4_2_0140140lnxz22hz.R.inc(1536);lastWasWhite = false;
                __CLR4_2_0140140lnxz22hz.R.inc(1537);reachedNonWhite = true;
            }
        }}}
    }}finally{__CLR4_2_0140140lnxz22hz.R.flushNeeded();}}

    public static boolean in(final String needle, final String... haystack) {try{__CLR4_2_0140140lnxz22hz.R.inc(1538);
        __CLR4_2_0140140lnxz22hz.R.inc(1539);final int len = haystack.length;
        __CLR4_2_0140140lnxz22hz.R.inc(1540);for (int i = 0; (((i < len)&&(__CLR4_2_0140140lnxz22hz.R.iget(1541)!=0|true))||(__CLR4_2_0140140lnxz22hz.R.iget(1542)==0&false)); i++) {{
            __CLR4_2_0140140lnxz22hz.R.inc(1543);if ((((haystack[i].equals(needle))&&(__CLR4_2_0140140lnxz22hz.R.iget(1544)!=0|true))||(__CLR4_2_0140140lnxz22hz.R.iget(1545)==0&false)))
            {__CLR4_2_0140140lnxz22hz.R.inc(1546);return true;
        }}
        }__CLR4_2_0140140lnxz22hz.R.inc(1547);return false;
    }finally{__CLR4_2_0140140lnxz22hz.R.flushNeeded();}}

    public static boolean inSorted(String needle, String[] haystack) {try{__CLR4_2_0140140lnxz22hz.R.inc(1548);
        __CLR4_2_0140140lnxz22hz.R.inc(1549);return Arrays.binarySearch(haystack, needle) >= 0;
    }finally{__CLR4_2_0140140lnxz22hz.R.flushNeeded();}}

    /**
     * Create a new absolute URL, from a provided existing absolute URL and a relative URL component.
     * @param base the existing absolute base URL
     * @param relUrl the relative URL to resolve. (If it's already absolute, it will be returned)
     * @return the resolved absolute URL
     * @throws MalformedURLException if an error occurred generating the URL
     */
    public static URL resolve(URL base, String relUrl) throws MalformedURLException {try{__CLR4_2_0140140lnxz22hz.R.inc(1550);
        // workaround: java resolves '//path/file + ?foo' to '//path/?foo', not '//path/file?foo' as desired
        __CLR4_2_0140140lnxz22hz.R.inc(1551);if ((((relUrl.startsWith("?"))&&(__CLR4_2_0140140lnxz22hz.R.iget(1552)!=0|true))||(__CLR4_2_0140140lnxz22hz.R.iget(1553)==0&false)))
            {__CLR4_2_0140140lnxz22hz.R.inc(1554);relUrl = base.getPath() + relUrl;
        // workaround: //example.com + ./foo = //example.com/./foo, not //example.com/foo
        }__CLR4_2_0140140lnxz22hz.R.inc(1555);if ((((relUrl.indexOf('.') == 0 && base.getFile().indexOf('/') != 0)&&(__CLR4_2_0140140lnxz22hz.R.iget(1556)!=0|true))||(__CLR4_2_0140140lnxz22hz.R.iget(1557)==0&false))) {{
            __CLR4_2_0140140lnxz22hz.R.inc(1558);base = new URL(base.getProtocol(), base.getHost(), base.getPort(), "/" + base.getFile());
        }
        }__CLR4_2_0140140lnxz22hz.R.inc(1559);return new URL(base, relUrl);
    }finally{__CLR4_2_0140140lnxz22hz.R.flushNeeded();}}

    /**
     * Create a new absolute URL, from a provided existing absolute URL and a relative URL component.
     * @param baseUrl the existing absolute base URL
     * @param relUrl the relative URL to resolve. (If it's already absolute, it will be returned)
     * @return an absolute URL if one was able to be generated, or the empty string if not
     */
    public static String resolve(final String baseUrl, final String relUrl) {try{__CLR4_2_0140140lnxz22hz.R.inc(1560);
        __CLR4_2_0140140lnxz22hz.R.inc(1561);URL base;
        __CLR4_2_0140140lnxz22hz.R.inc(1562);try {
            __CLR4_2_0140140lnxz22hz.R.inc(1563);try {
                __CLR4_2_0140140lnxz22hz.R.inc(1564);base = new URL(baseUrl);
            } catch (MalformedURLException e) {
                // the base is unsuitable, but the attribute/rel may be abs on its own, so try that
                __CLR4_2_0140140lnxz22hz.R.inc(1565);URL abs = new URL(relUrl);
                __CLR4_2_0140140lnxz22hz.R.inc(1566);return abs.toExternalForm();
            }
            __CLR4_2_0140140lnxz22hz.R.inc(1567);return resolve(base, relUrl).toExternalForm();
        } catch (MalformedURLException e) {
            __CLR4_2_0140140lnxz22hz.R.inc(1568);return "";
        }
    }finally{__CLR4_2_0140140lnxz22hz.R.flushNeeded();}}

    private static final Stack<StringBuilder> builders = new Stack<>();

    /**
     * Maintains cached StringBuilders in a flyweight pattern, to minimize new StringBuilder GCs. The StringBuilder is
     * prevented from growing too large.
     * <p>
     * Care must be taken to release the builder once its work has been completed, with {@link #releaseBuilder}
     * @return an empty StringBuilder
     * @
     */
    public static StringBuilder borrowBuilder() {try{__CLR4_2_0140140lnxz22hz.R.inc(1569);
        __CLR4_2_0140140lnxz22hz.R.inc(1570);synchronized (builders) {
            __CLR4_2_0140140lnxz22hz.R.inc(1571);return (((builders.empty() )&&(__CLR4_2_0140140lnxz22hz.R.iget(1572)!=0|true))||(__CLR4_2_0140140lnxz22hz.R.iget(1573)==0&false))?
                new StringBuilder(MaxCachedBuilderSize) :
                builders.pop();
        }
    }finally{__CLR4_2_0140140lnxz22hz.R.flushNeeded();}}

    /**
     * Release a borrowed builder. Care must be taken not to use the builder after it has been returned, as its
     * contents may be changed by this method, or by a concurrent thread.
     * @param sb the StringBuilder to release.
     * @return the string value of the released String Builder (as an incentive to release it!).
     */
    public static String releaseBuilder(StringBuilder sb) {try{__CLR4_2_0140140lnxz22hz.R.inc(1574);
        __CLR4_2_0140140lnxz22hz.R.inc(1575);Validate.notNull(sb);
        __CLR4_2_0140140lnxz22hz.R.inc(1576);String string = sb.toString();

        __CLR4_2_0140140lnxz22hz.R.inc(1577);if ((((sb.length() > MaxCachedBuilderSize)&&(__CLR4_2_0140140lnxz22hz.R.iget(1578)!=0|true))||(__CLR4_2_0140140lnxz22hz.R.iget(1579)==0&false)))
            {__CLR4_2_0140140lnxz22hz.R.inc(1580);sb = new StringBuilder(MaxCachedBuilderSize); // make sure it hasn't grown too big
        }else
            {__CLR4_2_0140140lnxz22hz.R.inc(1581);sb.delete(0, sb.length()); // make sure it's emptied on release

        }__CLR4_2_0140140lnxz22hz.R.inc(1582);synchronized (builders) {
            __CLR4_2_0140140lnxz22hz.R.inc(1583);builders.push(sb);

            __CLR4_2_0140140lnxz22hz.R.inc(1584);while ((((builders.size() > MaxIdleBuilders)&&(__CLR4_2_0140140lnxz22hz.R.iget(1585)!=0|true))||(__CLR4_2_0140140lnxz22hz.R.iget(1586)==0&false))) {{
                __CLR4_2_0140140lnxz22hz.R.inc(1587);builders.pop();
            }
        }}
        __CLR4_2_0140140lnxz22hz.R.inc(1588);return string;
    }finally{__CLR4_2_0140140lnxz22hz.R.flushNeeded();}}

    private static final int MaxCachedBuilderSize = 8 * 1024;
    private static final int MaxIdleBuilders = 8;
}
