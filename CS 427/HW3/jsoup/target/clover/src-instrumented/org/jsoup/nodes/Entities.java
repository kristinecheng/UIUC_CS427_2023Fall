/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.nodes;

import org.jsoup.SerializationException;
import org.jsoup.internal.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Parser;

import java.io.IOException;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import java.util.HashMap;

import static org.jsoup.nodes.Entities.EscapeMode.base;
import static org.jsoup.nodes.Entities.EscapeMode.extended;

/**
 * HTML entities, and escape routines. Source: <a href="http://www.w3.org/TR/html5/named-character-references.html#named-character-references">W3C
 * HTML named character references</a>.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class Entities {public static class __CLR4_2_02bb2bblnxz22lb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,3202,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final int empty = -1;
    private static final String emptyName = "";
    static final int codepointRadix = 36;
    private static final char[] codeDelims = {',', ';'};
    private static final HashMap<String, String> multipoints = new HashMap<>(); // name -> multiple character references
    private static final Document.OutputSettings DefaultOutput = new Document.OutputSettings();

    public enum EscapeMode {
        /**
         * Restricted entities suitable for XHTML output: lt, gt, amp, and quot only.
         */
        xhtml(EntitiesData.xmlPoints, 4),
        /**
         * Default HTML output entities.
         */
        base(EntitiesData.basePoints, 106),
        /**
         * Complete HTML entities.
         */
        extended(EntitiesData.fullPoints, 2125);

        // table of named references to their codepoints. sorted so we can binary search. built by BuildEntities.
        private String[] nameKeys;
        private int[] codeVals; // limitation is the few references with multiple characters; those go into multipoints.

        // table of codepoints to named entities.
        private int[] codeKeys; // we don' support multicodepoints to single named value currently
        private String[] nameVals;

        EscapeMode(String file, int size) {try{__CLR4_2_02bb2bblnxz22lb.R.inc(2999);
            __CLR4_2_02bb2bblnxz22lb.R.inc(3000);load(this, file, size);
        }finally{__CLR4_2_02bb2bblnxz22lb.R.flushNeeded();}}

        int codepointForName(final String name) {try{__CLR4_2_02bb2bblnxz22lb.R.inc(3001);
            __CLR4_2_02bb2bblnxz22lb.R.inc(3002);int index = Arrays.binarySearch(nameKeys, name);
            __CLR4_2_02bb2bblnxz22lb.R.inc(3003);return (((index >= 0 )&&(__CLR4_2_02bb2bblnxz22lb.R.iget(3004)!=0|true))||(__CLR4_2_02bb2bblnxz22lb.R.iget(3005)==0&false))? codeVals[index] : empty;
        }finally{__CLR4_2_02bb2bblnxz22lb.R.flushNeeded();}}

        String nameForCodepoint(final int codepoint) {try{__CLR4_2_02bb2bblnxz22lb.R.inc(3006);
            __CLR4_2_02bb2bblnxz22lb.R.inc(3007);final int index = Arrays.binarySearch(codeKeys, codepoint);
            __CLR4_2_02bb2bblnxz22lb.R.inc(3008);if ((((index >= 0)&&(__CLR4_2_02bb2bblnxz22lb.R.iget(3009)!=0|true))||(__CLR4_2_02bb2bblnxz22lb.R.iget(3010)==0&false))) {{
                // the results are ordered so lower case versions of same codepoint come after uppercase, and we prefer to emit lower
                // (and binary search for same item with multi results is undefined
                __CLR4_2_02bb2bblnxz22lb.R.inc(3011);return ((((index < nameVals.length - 1 && codeKeys[index + 1] == codepoint) )&&(__CLR4_2_02bb2bblnxz22lb.R.iget(3012)!=0|true))||(__CLR4_2_02bb2bblnxz22lb.R.iget(3013)==0&false))?
                    nameVals[index + 1] : nameVals[index];
            }
            }__CLR4_2_02bb2bblnxz22lb.R.inc(3014);return emptyName;
        }finally{__CLR4_2_02bb2bblnxz22lb.R.flushNeeded();}}

        private int size() {try{__CLR4_2_02bb2bblnxz22lb.R.inc(3015);
            __CLR4_2_02bb2bblnxz22lb.R.inc(3016);return nameKeys.length;
        }finally{__CLR4_2_02bb2bblnxz22lb.R.flushNeeded();}}
    }

    private Entities() {try{__CLR4_2_02bb2bblnxz22lb.R.inc(3017);
    }finally{__CLR4_2_02bb2bblnxz22lb.R.flushNeeded();}}

    /**
     * Check if the input is a known named entity
     *
     * @param name the possible entity name (e.g. "lt" or "amp")
     * @return true if a known named entity
     */
    public static boolean isNamedEntity(final String name) {try{__CLR4_2_02bb2bblnxz22lb.R.inc(3018);
        __CLR4_2_02bb2bblnxz22lb.R.inc(3019);return extended.codepointForName(name) != empty;
    }finally{__CLR4_2_02bb2bblnxz22lb.R.flushNeeded();}}

    /**
     * Check if the input is a known named entity in the base entity set.
     *
     * @param name the possible entity name (e.g. "lt" or "amp")
     * @return true if a known named entity in the base set
     * @see #isNamedEntity(String)
     */
    public static boolean isBaseNamedEntity(final String name) {try{__CLR4_2_02bb2bblnxz22lb.R.inc(3020);
        __CLR4_2_02bb2bblnxz22lb.R.inc(3021);return base.codepointForName(name) != empty;
    }finally{__CLR4_2_02bb2bblnxz22lb.R.flushNeeded();}}

    /**
     * Get the Character value of the named entity
     *
     * @param name named entity (e.g. "lt" or "amp")
     * @return the Character value of the named entity (e.g. '{@literal <}' or '{@literal &}')
     * @deprecated does not support characters outside the BMP or multiple character names
     */
    public static Character getCharacterByName(String name) {try{__CLR4_2_02bb2bblnxz22lb.R.inc(3022);
        __CLR4_2_02bb2bblnxz22lb.R.inc(3023);return (char) extended.codepointForName(name);
    }finally{__CLR4_2_02bb2bblnxz22lb.R.flushNeeded();}}

    /**
     * Get the character(s) represented by the named entity
     *
     * @param name entity (e.g. "lt" or "amp")
     * @return the string value of the character(s) represented by this entity, or "" if not defined
     */
    public static String getByName(String name) {try{__CLR4_2_02bb2bblnxz22lb.R.inc(3024);
        __CLR4_2_02bb2bblnxz22lb.R.inc(3025);String val = multipoints.get(name);
        __CLR4_2_02bb2bblnxz22lb.R.inc(3026);if ((((val != null)&&(__CLR4_2_02bb2bblnxz22lb.R.iget(3027)!=0|true))||(__CLR4_2_02bb2bblnxz22lb.R.iget(3028)==0&false)))
            {__CLR4_2_02bb2bblnxz22lb.R.inc(3029);return val;
        }__CLR4_2_02bb2bblnxz22lb.R.inc(3030);int codepoint = extended.codepointForName(name);
        __CLR4_2_02bb2bblnxz22lb.R.inc(3031);if ((((codepoint != empty)&&(__CLR4_2_02bb2bblnxz22lb.R.iget(3032)!=0|true))||(__CLR4_2_02bb2bblnxz22lb.R.iget(3033)==0&false)))
            {__CLR4_2_02bb2bblnxz22lb.R.inc(3034);return new String(new int[]{codepoint}, 0, 1);
        }__CLR4_2_02bb2bblnxz22lb.R.inc(3035);return emptyName;
    }finally{__CLR4_2_02bb2bblnxz22lb.R.flushNeeded();}}

    public static int codepointsForName(final String name, final int[] codepoints) {try{__CLR4_2_02bb2bblnxz22lb.R.inc(3036);
        __CLR4_2_02bb2bblnxz22lb.R.inc(3037);String val = multipoints.get(name);
        __CLR4_2_02bb2bblnxz22lb.R.inc(3038);if ((((val != null)&&(__CLR4_2_02bb2bblnxz22lb.R.iget(3039)!=0|true))||(__CLR4_2_02bb2bblnxz22lb.R.iget(3040)==0&false))) {{
            __CLR4_2_02bb2bblnxz22lb.R.inc(3041);codepoints[0] = val.codePointAt(0);
            __CLR4_2_02bb2bblnxz22lb.R.inc(3042);codepoints[1] = val.codePointAt(1);
            __CLR4_2_02bb2bblnxz22lb.R.inc(3043);return 2;
        }
        }__CLR4_2_02bb2bblnxz22lb.R.inc(3044);int codepoint = extended.codepointForName(name);
        __CLR4_2_02bb2bblnxz22lb.R.inc(3045);if ((((codepoint != empty)&&(__CLR4_2_02bb2bblnxz22lb.R.iget(3046)!=0|true))||(__CLR4_2_02bb2bblnxz22lb.R.iget(3047)==0&false))) {{
            __CLR4_2_02bb2bblnxz22lb.R.inc(3048);codepoints[0] = codepoint;
            __CLR4_2_02bb2bblnxz22lb.R.inc(3049);return 1;
        }
        }__CLR4_2_02bb2bblnxz22lb.R.inc(3050);return 0;
    }finally{__CLR4_2_02bb2bblnxz22lb.R.flushNeeded();}}

    /**
     * HTML escape an input string. That is, {@code <} is returned as {@code &lt;}
     *
     * @param string the un-escaped string to escape
     * @param out the output settings to use
     * @return the escaped string
     */
    public static String escape(String string, Document.OutputSettings out) {try{__CLR4_2_02bb2bblnxz22lb.R.inc(3051);
        __CLR4_2_02bb2bblnxz22lb.R.inc(3052);if ((((string == null)&&(__CLR4_2_02bb2bblnxz22lb.R.iget(3053)!=0|true))||(__CLR4_2_02bb2bblnxz22lb.R.iget(3054)==0&false)))
            {__CLR4_2_02bb2bblnxz22lb.R.inc(3055);return "";
        }__CLR4_2_02bb2bblnxz22lb.R.inc(3056);StringBuilder accum = StringUtil.borrowBuilder();
        __CLR4_2_02bb2bblnxz22lb.R.inc(3057);try {
            __CLR4_2_02bb2bblnxz22lb.R.inc(3058);escape(accum, string, out, false, false, false);
        } catch (IOException e) {
            __CLR4_2_02bb2bblnxz22lb.R.inc(3059);throw new SerializationException(e); // doesn't happen
        }
        __CLR4_2_02bb2bblnxz22lb.R.inc(3060);return StringUtil.releaseBuilder(accum);
    }finally{__CLR4_2_02bb2bblnxz22lb.R.flushNeeded();}}

    /**
     * HTML escape an input string, using the default settings (UTF-8, base entities). That is, {@code <} is returned as
     * {@code &lt;}
     *
     * @param string the un-escaped string to escape
     * @return the escaped string
     */
    public static String escape(String string) {try{__CLR4_2_02bb2bblnxz22lb.R.inc(3061);
        __CLR4_2_02bb2bblnxz22lb.R.inc(3062);return escape(string, DefaultOutput);
    }finally{__CLR4_2_02bb2bblnxz22lb.R.flushNeeded();}}

    // this method is ugly, and does a lot. but other breakups cause rescanning and stringbuilder generations
    static void escape(Appendable accum, String string, Document.OutputSettings out,
                       boolean inAttribute, boolean normaliseWhite, boolean stripLeadingWhite) throws IOException {try{__CLR4_2_02bb2bblnxz22lb.R.inc(3063);

        __CLR4_2_02bb2bblnxz22lb.R.inc(3064);boolean lastWasWhite = false;
        __CLR4_2_02bb2bblnxz22lb.R.inc(3065);boolean reachedNonWhite = false;
        __CLR4_2_02bb2bblnxz22lb.R.inc(3066);final EscapeMode escapeMode = out.escapeMode();
        __CLR4_2_02bb2bblnxz22lb.R.inc(3067);final CharsetEncoder encoder = out.encoder();
        __CLR4_2_02bb2bblnxz22lb.R.inc(3068);final CoreCharset coreCharset = out.coreCharset; // init in out.prepareEncoder()
        __CLR4_2_02bb2bblnxz22lb.R.inc(3069);final int length = string.length();

        __CLR4_2_02bb2bblnxz22lb.R.inc(3070);int codePoint;
        __CLR4_2_02bb2bblnxz22lb.R.inc(3071);for (int offset = 0; (((offset < length)&&(__CLR4_2_02bb2bblnxz22lb.R.iget(3072)!=0|true))||(__CLR4_2_02bb2bblnxz22lb.R.iget(3073)==0&false)); offset += Character.charCount(codePoint)) {{
            __CLR4_2_02bb2bblnxz22lb.R.inc(3074);codePoint = string.codePointAt(offset);

            __CLR4_2_02bb2bblnxz22lb.R.inc(3075);if ((((normaliseWhite)&&(__CLR4_2_02bb2bblnxz22lb.R.iget(3076)!=0|true))||(__CLR4_2_02bb2bblnxz22lb.R.iget(3077)==0&false))) {{
                __CLR4_2_02bb2bblnxz22lb.R.inc(3078);if ((((StringUtil.isWhitespace(codePoint))&&(__CLR4_2_02bb2bblnxz22lb.R.iget(3079)!=0|true))||(__CLR4_2_02bb2bblnxz22lb.R.iget(3080)==0&false))) {{
                    __CLR4_2_02bb2bblnxz22lb.R.inc(3081);if (((((stripLeadingWhite && !reachedNonWhite) || lastWasWhite)&&(__CLR4_2_02bb2bblnxz22lb.R.iget(3082)!=0|true))||(__CLR4_2_02bb2bblnxz22lb.R.iget(3083)==0&false)))
                        {__CLR4_2_02bb2bblnxz22lb.R.inc(3084);continue;
                    }__CLR4_2_02bb2bblnxz22lb.R.inc(3085);accum.append(' ');
                    __CLR4_2_02bb2bblnxz22lb.R.inc(3086);lastWasWhite = true;
                    __CLR4_2_02bb2bblnxz22lb.R.inc(3087);continue;
                } }else {{
                    __CLR4_2_02bb2bblnxz22lb.R.inc(3088);lastWasWhite = false;
                    __CLR4_2_02bb2bblnxz22lb.R.inc(3089);reachedNonWhite = true;
                }
            }}
            // surrogate pairs, split implementation for efficiency on single char common case (saves creating strings, char[]):
            }__CLR4_2_02bb2bblnxz22lb.R.inc(3090);if ((((codePoint < Character.MIN_SUPPLEMENTARY_CODE_POINT)&&(__CLR4_2_02bb2bblnxz22lb.R.iget(3091)!=0|true))||(__CLR4_2_02bb2bblnxz22lb.R.iget(3092)==0&false))) {{
                __CLR4_2_02bb2bblnxz22lb.R.inc(3093);final char c = (char) codePoint;
                // html specific and required escapes:
                boolean __CLB4_2_0_bool0=false;__CLR4_2_02bb2bblnxz22lb.R.inc(3094);switch (c) {
                    case '&':if (!__CLB4_2_0_bool0) {__CLR4_2_02bb2bblnxz22lb.R.inc(3095);__CLB4_2_0_bool0=true;}
                        __CLR4_2_02bb2bblnxz22lb.R.inc(3096);accum.append("&amp;");
                        __CLR4_2_02bb2bblnxz22lb.R.inc(3097);break;
                    case 0xA0:if (!__CLB4_2_0_bool0) {__CLR4_2_02bb2bblnxz22lb.R.inc(3098);__CLB4_2_0_bool0=true;}
                        __CLR4_2_02bb2bblnxz22lb.R.inc(3099);if ((((escapeMode != EscapeMode.xhtml)&&(__CLR4_2_02bb2bblnxz22lb.R.iget(3100)!=0|true))||(__CLR4_2_02bb2bblnxz22lb.R.iget(3101)==0&false)))
                            {__CLR4_2_02bb2bblnxz22lb.R.inc(3102);accum.append("&nbsp;");
                        }else
                            {__CLR4_2_02bb2bblnxz22lb.R.inc(3103);accum.append("&#xa0;");
                        }__CLR4_2_02bb2bblnxz22lb.R.inc(3104);break;
                    case '<':if (!__CLB4_2_0_bool0) {__CLR4_2_02bb2bblnxz22lb.R.inc(3105);__CLB4_2_0_bool0=true;}
                        // escape when in character data or when in a xml attribue val; not needed in html attr val
                        __CLR4_2_02bb2bblnxz22lb.R.inc(3106);if ((((!inAttribute || escapeMode == EscapeMode.xhtml)&&(__CLR4_2_02bb2bblnxz22lb.R.iget(3107)!=0|true))||(__CLR4_2_02bb2bblnxz22lb.R.iget(3108)==0&false)))
                            {__CLR4_2_02bb2bblnxz22lb.R.inc(3109);accum.append("&lt;");
                        }else
                            {__CLR4_2_02bb2bblnxz22lb.R.inc(3110);accum.append(c);
                        }__CLR4_2_02bb2bblnxz22lb.R.inc(3111);break;
                    case '>':if (!__CLB4_2_0_bool0) {__CLR4_2_02bb2bblnxz22lb.R.inc(3112);__CLB4_2_0_bool0=true;}
                        __CLR4_2_02bb2bblnxz22lb.R.inc(3113);if ((((!inAttribute)&&(__CLR4_2_02bb2bblnxz22lb.R.iget(3114)!=0|true))||(__CLR4_2_02bb2bblnxz22lb.R.iget(3115)==0&false)))
                            {__CLR4_2_02bb2bblnxz22lb.R.inc(3116);accum.append("&gt;");
                        }else
                            {__CLR4_2_02bb2bblnxz22lb.R.inc(3117);accum.append(c);
                        }__CLR4_2_02bb2bblnxz22lb.R.inc(3118);break;
                    case '"':if (!__CLB4_2_0_bool0) {__CLR4_2_02bb2bblnxz22lb.R.inc(3119);__CLB4_2_0_bool0=true;}
                        __CLR4_2_02bb2bblnxz22lb.R.inc(3120);if ((((inAttribute)&&(__CLR4_2_02bb2bblnxz22lb.R.iget(3121)!=0|true))||(__CLR4_2_02bb2bblnxz22lb.R.iget(3122)==0&false)))
                            {__CLR4_2_02bb2bblnxz22lb.R.inc(3123);accum.append("&quot;");
                        }else
                            {__CLR4_2_02bb2bblnxz22lb.R.inc(3124);accum.append(c);
                        }__CLR4_2_02bb2bblnxz22lb.R.inc(3125);break;
                    default:if (!__CLB4_2_0_bool0) {__CLR4_2_02bb2bblnxz22lb.R.inc(3126);__CLB4_2_0_bool0=true;}
                        __CLR4_2_02bb2bblnxz22lb.R.inc(3127);if ((((canEncode(coreCharset, c, encoder))&&(__CLR4_2_02bb2bblnxz22lb.R.iget(3128)!=0|true))||(__CLR4_2_02bb2bblnxz22lb.R.iget(3129)==0&false)))
                            {__CLR4_2_02bb2bblnxz22lb.R.inc(3130);accum.append(c);
                        }else
                            {__CLR4_2_02bb2bblnxz22lb.R.inc(3131);appendEncoded(accum, escapeMode, codePoint);
                }}
            } }else {{
                __CLR4_2_02bb2bblnxz22lb.R.inc(3132);final String c = new String(Character.toChars(codePoint));
                __CLR4_2_02bb2bblnxz22lb.R.inc(3133);if ((((encoder.canEncode(c))&&(__CLR4_2_02bb2bblnxz22lb.R.iget(3134)!=0|true))||(__CLR4_2_02bb2bblnxz22lb.R.iget(3135)==0&false))) // uses fallback encoder for simplicity
                    {__CLR4_2_02bb2bblnxz22lb.R.inc(3136);accum.append(c);
                }else
                    {__CLR4_2_02bb2bblnxz22lb.R.inc(3137);appendEncoded(accum, escapeMode, codePoint);
            }}
        }}
    }}finally{__CLR4_2_02bb2bblnxz22lb.R.flushNeeded();}}

    private static void appendEncoded(Appendable accum, EscapeMode escapeMode, int codePoint) throws IOException {try{__CLR4_2_02bb2bblnxz22lb.R.inc(3138);
        __CLR4_2_02bb2bblnxz22lb.R.inc(3139);final String name = escapeMode.nameForCodepoint(codePoint);
        __CLR4_2_02bb2bblnxz22lb.R.inc(3140);if ((((name != emptyName)&&(__CLR4_2_02bb2bblnxz22lb.R.iget(3141)!=0|true))||(__CLR4_2_02bb2bblnxz22lb.R.iget(3142)==0&false))) // ok for identity check
            {__CLR4_2_02bb2bblnxz22lb.R.inc(3143);accum.append('&').append(name).append(';');
        }else
            {__CLR4_2_02bb2bblnxz22lb.R.inc(3144);accum.append("&#x").append(Integer.toHexString(codePoint)).append(';');
    }}finally{__CLR4_2_02bb2bblnxz22lb.R.flushNeeded();}}

    /**
     * Un-escape an HTML escaped string. That is, {@code &lt;} is returned as {@code <}.
     *
     * @param string the HTML string to un-escape
     * @return the unescaped string
     */
    public static String unescape(String string) {try{__CLR4_2_02bb2bblnxz22lb.R.inc(3145);
        __CLR4_2_02bb2bblnxz22lb.R.inc(3146);return unescape(string, false);
    }finally{__CLR4_2_02bb2bblnxz22lb.R.flushNeeded();}}

    /**
     * Unescape the input string.
     *
     * @param string to un-HTML-escape
     * @param strict if "strict" (that is, requires trailing ';' char, otherwise that's optional)
     * @return unescaped string
     */
    static String unescape(String string, boolean strict) {try{__CLR4_2_02bb2bblnxz22lb.R.inc(3147);
        __CLR4_2_02bb2bblnxz22lb.R.inc(3148);return Parser.unescapeEntities(string, strict);
    }finally{__CLR4_2_02bb2bblnxz22lb.R.flushNeeded();}}

    /*
     * Provides a fast-path for Encoder.canEncode, which drastically improves performance on Android post JellyBean.
     * After KitKat, the implementation of canEncode degrades to the point of being useless. For non ASCII or UTF,
     * performance may be bad. We can add more encoders for common character sets that are impacted by performance
     * issues on Android if required.
     *
     * Benchmarks:     *
     * OLD toHtml() impl v New (fastpath) in millis
     * Wiki: 1895, 16
     * CNN: 6378, 55
     * Alterslash: 3013, 28
     * Jsoup: 167, 2
     */
    private static boolean canEncode(final CoreCharset charset, final char c, final CharsetEncoder fallback) {try{__CLR4_2_02bb2bblnxz22lb.R.inc(3149);
        // todo add more charset tests if impacted by Android's bad perf in canEncode
        boolean __CLB4_2_0_bool1=false;__CLR4_2_02bb2bblnxz22lb.R.inc(3150);switch (charset) {
            case ascii:if (!__CLB4_2_0_bool1) {__CLR4_2_02bb2bblnxz22lb.R.inc(3151);__CLB4_2_0_bool1=true;}
                __CLR4_2_02bb2bblnxz22lb.R.inc(3152);return c < 0x80;
            case utf:if (!__CLB4_2_0_bool1) {__CLR4_2_02bb2bblnxz22lb.R.inc(3153);__CLB4_2_0_bool1=true;}
                __CLR4_2_02bb2bblnxz22lb.R.inc(3154);return true; // real is:!(Character.isLowSurrogate(c) || Character.isHighSurrogate(c)); - but already check above
            default:if (!__CLB4_2_0_bool1) {__CLR4_2_02bb2bblnxz22lb.R.inc(3155);__CLB4_2_0_bool1=true;}
                __CLR4_2_02bb2bblnxz22lb.R.inc(3156);return fallback.canEncode(c);
        }
    }finally{__CLR4_2_02bb2bblnxz22lb.R.flushNeeded();}}

    enum CoreCharset {
        ascii, utf, fallback;

        static CoreCharset byName(final String name) {try{__CLR4_2_02bb2bblnxz22lb.R.inc(3157);
            __CLR4_2_02bb2bblnxz22lb.R.inc(3158);if ((((name.equals("US-ASCII"))&&(__CLR4_2_02bb2bblnxz22lb.R.iget(3159)!=0|true))||(__CLR4_2_02bb2bblnxz22lb.R.iget(3160)==0&false)))
                {__CLR4_2_02bb2bblnxz22lb.R.inc(3161);return ascii;
            }__CLR4_2_02bb2bblnxz22lb.R.inc(3162);if ((((name.startsWith("UTF-"))&&(__CLR4_2_02bb2bblnxz22lb.R.iget(3163)!=0|true))||(__CLR4_2_02bb2bblnxz22lb.R.iget(3164)==0&false))) // covers UTF-8, UTF-16, et al
                {__CLR4_2_02bb2bblnxz22lb.R.inc(3165);return utf;
            }__CLR4_2_02bb2bblnxz22lb.R.inc(3166);return fallback;
        }finally{__CLR4_2_02bb2bblnxz22lb.R.flushNeeded();}}
    }

    private static void load(EscapeMode e, String pointsData, int size) {try{__CLR4_2_02bb2bblnxz22lb.R.inc(3167);
        __CLR4_2_02bb2bblnxz22lb.R.inc(3168);e.nameKeys = new String[size];
        __CLR4_2_02bb2bblnxz22lb.R.inc(3169);e.codeVals = new int[size];
        __CLR4_2_02bb2bblnxz22lb.R.inc(3170);e.codeKeys = new int[size];
        __CLR4_2_02bb2bblnxz22lb.R.inc(3171);e.nameVals = new String[size];

        __CLR4_2_02bb2bblnxz22lb.R.inc(3172);int i = 0;
        __CLR4_2_02bb2bblnxz22lb.R.inc(3173);CharacterReader reader = new CharacterReader(pointsData);

        __CLR4_2_02bb2bblnxz22lb.R.inc(3174);while ((((!reader.isEmpty())&&(__CLR4_2_02bb2bblnxz22lb.R.iget(3175)!=0|true))||(__CLR4_2_02bb2bblnxz22lb.R.iget(3176)==0&false))) {{
            // NotNestedLessLess=10913,824;1887&

            __CLR4_2_02bb2bblnxz22lb.R.inc(3177);final String name = reader.consumeTo('=');
            __CLR4_2_02bb2bblnxz22lb.R.inc(3178);reader.advance();
            __CLR4_2_02bb2bblnxz22lb.R.inc(3179);final int cp1 = Integer.parseInt(reader.consumeToAny(codeDelims), codepointRadix);
            __CLR4_2_02bb2bblnxz22lb.R.inc(3180);final char codeDelim = reader.current();
            __CLR4_2_02bb2bblnxz22lb.R.inc(3181);reader.advance();
            __CLR4_2_02bb2bblnxz22lb.R.inc(3182);final int cp2;
            __CLR4_2_02bb2bblnxz22lb.R.inc(3183);if ((((codeDelim == ',')&&(__CLR4_2_02bb2bblnxz22lb.R.iget(3184)!=0|true))||(__CLR4_2_02bb2bblnxz22lb.R.iget(3185)==0&false))) {{
                __CLR4_2_02bb2bblnxz22lb.R.inc(3186);cp2 = Integer.parseInt(reader.consumeTo(';'), codepointRadix);
                __CLR4_2_02bb2bblnxz22lb.R.inc(3187);reader.advance();
            } }else {{
                __CLR4_2_02bb2bblnxz22lb.R.inc(3188);cp2 = empty;
            }
            }__CLR4_2_02bb2bblnxz22lb.R.inc(3189);final String indexS = reader.consumeTo('&');
            __CLR4_2_02bb2bblnxz22lb.R.inc(3190);final int index = Integer.parseInt(indexS, codepointRadix);
            __CLR4_2_02bb2bblnxz22lb.R.inc(3191);reader.advance();

            __CLR4_2_02bb2bblnxz22lb.R.inc(3192);e.nameKeys[i] = name;
            __CLR4_2_02bb2bblnxz22lb.R.inc(3193);e.codeVals[i] = cp1;
            __CLR4_2_02bb2bblnxz22lb.R.inc(3194);e.codeKeys[index] = cp1;
            __CLR4_2_02bb2bblnxz22lb.R.inc(3195);e.nameVals[index] = name;

            __CLR4_2_02bb2bblnxz22lb.R.inc(3196);if ((((cp2 != empty)&&(__CLR4_2_02bb2bblnxz22lb.R.iget(3197)!=0|true))||(__CLR4_2_02bb2bblnxz22lb.R.iget(3198)==0&false))) {{
                __CLR4_2_02bb2bblnxz22lb.R.inc(3199);multipoints.put(name, new String(new int[]{cp1, cp2}, 0, 2));
            }
            }__CLR4_2_02bb2bblnxz22lb.R.inc(3200);i++;
        }

        }__CLR4_2_02bb2bblnxz22lb.R.inc(3201);Validate.isTrue(i == size, "Unexpected count of entities loaded");
    }finally{__CLR4_2_02bb2bblnxz22lb.R.flushNeeded();}}
}
