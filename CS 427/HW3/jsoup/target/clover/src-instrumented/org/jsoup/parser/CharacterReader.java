/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.parser;

import org.jsoup.UncheckedIOException;
import org.jsoup.helper.Validate;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Locale;

/**
 CharacterReader consumes tokens off a string. Used internally by jsoup. API subject to changes.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public final class CharacterReader {public static class __CLR4_2_02w62w6lnxz22my{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,4171,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static final char EOF = (char) -1;
    private static final int maxStringCacheLen = 12;
    static final int maxBufferLen = 1024 * 32; // visible for testing
    private static final int readAheadLimit = (int) (maxBufferLen * 0.75);

    private final char[] charBuf;
    private final Reader reader;
    private int bufLength;
    private int bufSplitPoint;
    private int bufPos;
    private int readerPos;
    private int bufMark = -1;
    private final String[] stringCache = new String[512]; // holds reused strings in this doc, to lessen garbage

    public CharacterReader(Reader input, int sz) {try{__CLR4_2_02w62w6lnxz22my.R.inc(3750);
        __CLR4_2_02w62w6lnxz22my.R.inc(3751);Validate.notNull(input);
        __CLR4_2_02w62w6lnxz22my.R.inc(3752);Validate.isTrue(input.markSupported());
        __CLR4_2_02w62w6lnxz22my.R.inc(3753);reader = input;
        __CLR4_2_02w62w6lnxz22my.R.inc(3754);charBuf = new char[(((sz > maxBufferLen )&&(__CLR4_2_02w62w6lnxz22my.R.iget(3755)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(3756)==0&false))? maxBufferLen : sz];
        __CLR4_2_02w62w6lnxz22my.R.inc(3757);bufferUp();

        __CLR4_2_02w62w6lnxz22my.R.inc(3758);if ((((isBinary())&&(__CLR4_2_02w62w6lnxz22my.R.iget(3759)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(3760)==0&false))) {{
            __CLR4_2_02w62w6lnxz22my.R.inc(3761);throw new UncheckedIOException("Input is binary and unsupported");
        }
    }}finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    public CharacterReader(Reader input) {
        this(input, maxBufferLen);__CLR4_2_02w62w6lnxz22my.R.inc(3763);try{__CLR4_2_02w62w6lnxz22my.R.inc(3762);
    }finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    public CharacterReader(String input) {
        this(new StringReader(input), input.length());__CLR4_2_02w62w6lnxz22my.R.inc(3765);try{__CLR4_2_02w62w6lnxz22my.R.inc(3764);
    }finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    private void bufferUp() {try{__CLR4_2_02w62w6lnxz22my.R.inc(3766);
        __CLR4_2_02w62w6lnxz22my.R.inc(3767);final int pos = bufPos;
        __CLR4_2_02w62w6lnxz22my.R.inc(3768);if ((((pos < bufSplitPoint)&&(__CLR4_2_02w62w6lnxz22my.R.iget(3769)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(3770)==0&false)))
            {__CLR4_2_02w62w6lnxz22my.R.inc(3771);return;

        }__CLR4_2_02w62w6lnxz22my.R.inc(3772);try {
            __CLR4_2_02w62w6lnxz22my.R.inc(3773);final long skipped = reader.skip(pos);
            __CLR4_2_02w62w6lnxz22my.R.inc(3774);reader.mark(maxBufferLen);
            __CLR4_2_02w62w6lnxz22my.R.inc(3775);final int read = reader.read(charBuf);
            __CLR4_2_02w62w6lnxz22my.R.inc(3776);reader.reset();
            __CLR4_2_02w62w6lnxz22my.R.inc(3777);if ((((read != -1)&&(__CLR4_2_02w62w6lnxz22my.R.iget(3778)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(3779)==0&false))) {{
                __CLR4_2_02w62w6lnxz22my.R.inc(3780);Validate.isTrue(skipped == pos); // Previously asserted that there is room in buf to skip, so this will be a WTF
                __CLR4_2_02w62w6lnxz22my.R.inc(3781);bufLength = read;
                __CLR4_2_02w62w6lnxz22my.R.inc(3782);readerPos += pos;
                __CLR4_2_02w62w6lnxz22my.R.inc(3783);bufPos = 0;
                __CLR4_2_02w62w6lnxz22my.R.inc(3784);bufMark = -1;
                __CLR4_2_02w62w6lnxz22my.R.inc(3785);bufSplitPoint = (((bufLength > readAheadLimit )&&(__CLR4_2_02w62w6lnxz22my.R.iget(3786)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(3787)==0&false))? readAheadLimit : bufLength;
            }
        }} catch (IOException e) {
            __CLR4_2_02w62w6lnxz22my.R.inc(3788);throw new UncheckedIOException(e);
        }
    }finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    /**
     * Gets the current cursor position in the content.
     * @return current position
     */
    public int pos() {try{__CLR4_2_02w62w6lnxz22my.R.inc(3789);
        __CLR4_2_02w62w6lnxz22my.R.inc(3790);return readerPos + bufPos;
    }finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    /**
     * Tests if all the content has been read.
     * @return true if nothing left to read.
     */
    public boolean isEmpty() {try{__CLR4_2_02w62w6lnxz22my.R.inc(3791);
        __CLR4_2_02w62w6lnxz22my.R.inc(3792);bufferUp();
        __CLR4_2_02w62w6lnxz22my.R.inc(3793);return bufPos >= bufLength;
    }finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    private boolean isEmptyNoBufferUp() {try{__CLR4_2_02w62w6lnxz22my.R.inc(3794);
        __CLR4_2_02w62w6lnxz22my.R.inc(3795);return bufPos >= bufLength;
    }finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    /**
     * Get the char at the current position.
     * @return char
     */
    public char current() {try{__CLR4_2_02w62w6lnxz22my.R.inc(3796);
        __CLR4_2_02w62w6lnxz22my.R.inc(3797);bufferUp();
        __CLR4_2_02w62w6lnxz22my.R.inc(3798);return (((isEmptyNoBufferUp() )&&(__CLR4_2_02w62w6lnxz22my.R.iget(3799)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(3800)==0&false))? EOF : charBuf[bufPos];
    }finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    char consume() {try{__CLR4_2_02w62w6lnxz22my.R.inc(3801);
        __CLR4_2_02w62w6lnxz22my.R.inc(3802);bufferUp();
        __CLR4_2_02w62w6lnxz22my.R.inc(3803);char val = (((isEmptyNoBufferUp() )&&(__CLR4_2_02w62w6lnxz22my.R.iget(3804)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(3805)==0&false))? EOF : charBuf[bufPos];
        __CLR4_2_02w62w6lnxz22my.R.inc(3806);bufPos++;
        __CLR4_2_02w62w6lnxz22my.R.inc(3807);return val;
    }finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    void unconsume() {try{__CLR4_2_02w62w6lnxz22my.R.inc(3808);
        __CLR4_2_02w62w6lnxz22my.R.inc(3809);if ((((bufPos < 1)&&(__CLR4_2_02w62w6lnxz22my.R.iget(3810)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(3811)==0&false)))
            {__CLR4_2_02w62w6lnxz22my.R.inc(3812);throw new UncheckedIOException(new IOException("No buffer left to unconsume"));

        }__CLR4_2_02w62w6lnxz22my.R.inc(3813);bufPos--;
    }finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    /**
     * Moves the current position by one.
     */
    public void advance() {try{__CLR4_2_02w62w6lnxz22my.R.inc(3814);
        __CLR4_2_02w62w6lnxz22my.R.inc(3815);bufPos++;
    }finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    void mark() {try{__CLR4_2_02w62w6lnxz22my.R.inc(3816);
        // extra buffer up, to get as much rewind capacity as possible
        __CLR4_2_02w62w6lnxz22my.R.inc(3817);bufSplitPoint = 0;
        __CLR4_2_02w62w6lnxz22my.R.inc(3818);bufferUp();
        __CLR4_2_02w62w6lnxz22my.R.inc(3819);bufMark = bufPos;
    }finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    void rewindToMark() {try{__CLR4_2_02w62w6lnxz22my.R.inc(3820);
        __CLR4_2_02w62w6lnxz22my.R.inc(3821);if ((((bufMark == -1)&&(__CLR4_2_02w62w6lnxz22my.R.iget(3822)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(3823)==0&false)))
            {__CLR4_2_02w62w6lnxz22my.R.inc(3824);throw new UncheckedIOException(new IOException("Mark invalid"));

        }__CLR4_2_02w62w6lnxz22my.R.inc(3825);bufPos = bufMark;
    }finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    /**
     * Returns the number of characters between the current position and the next instance of the input char
     * @param c scan target
     * @return offset between current position and next instance of target. -1 if not found.
     */
    int nextIndexOf(char c) {try{__CLR4_2_02w62w6lnxz22my.R.inc(3826);
        // doesn't handle scanning for surrogates
        __CLR4_2_02w62w6lnxz22my.R.inc(3827);bufferUp();
        __CLR4_2_02w62w6lnxz22my.R.inc(3828);for (int i = bufPos; (((i < bufLength)&&(__CLR4_2_02w62w6lnxz22my.R.iget(3829)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(3830)==0&false)); i++) {{
            __CLR4_2_02w62w6lnxz22my.R.inc(3831);if ((((c == charBuf[i])&&(__CLR4_2_02w62w6lnxz22my.R.iget(3832)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(3833)==0&false)))
                {__CLR4_2_02w62w6lnxz22my.R.inc(3834);return i - bufPos;
        }}
        }__CLR4_2_02w62w6lnxz22my.R.inc(3835);return -1;
    }finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    /**
     * Returns the number of characters between the current position and the next instance of the input sequence
     *
     * @param seq scan target
     * @return offset between current position and next instance of target. -1 if not found.
     */
    int nextIndexOf(CharSequence seq) {try{__CLR4_2_02w62w6lnxz22my.R.inc(3836);
        __CLR4_2_02w62w6lnxz22my.R.inc(3837);bufferUp();
        // doesn't handle scanning for surrogates
        __CLR4_2_02w62w6lnxz22my.R.inc(3838);char startChar = seq.charAt(0);
        __CLR4_2_02w62w6lnxz22my.R.inc(3839);for (int offset = bufPos; (((offset < bufLength)&&(__CLR4_2_02w62w6lnxz22my.R.iget(3840)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(3841)==0&false)); offset++) {{
            // scan to first instance of startchar:
            __CLR4_2_02w62w6lnxz22my.R.inc(3842);if ((((startChar != charBuf[offset])&&(__CLR4_2_02w62w6lnxz22my.R.iget(3843)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(3844)==0&false)))
                {__CLR4_2_02w62w6lnxz22my.R.inc(3845);while((((++offset < bufLength && startChar != charBuf[offset])&&(__CLR4_2_02w62w6lnxz22my.R.iget(3846)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(3847)==0&false))) {{ /* empty */ }
            }}__CLR4_2_02w62w6lnxz22my.R.inc(3848);int i = offset + 1;
            __CLR4_2_02w62w6lnxz22my.R.inc(3849);int last = i + seq.length()-1;
            __CLR4_2_02w62w6lnxz22my.R.inc(3850);if ((((offset < bufLength && last <= bufLength)&&(__CLR4_2_02w62w6lnxz22my.R.iget(3851)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(3852)==0&false))) {{
                __CLR4_2_02w62w6lnxz22my.R.inc(3853);for (int j = 1; (((i < last && seq.charAt(j) == charBuf[i])&&(__CLR4_2_02w62w6lnxz22my.R.iget(3854)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(3855)==0&false)); i++, j++) {{ /* empty */ }
                }__CLR4_2_02w62w6lnxz22my.R.inc(3856);if ((((i == last)&&(__CLR4_2_02w62w6lnxz22my.R.iget(3857)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(3858)==0&false))) // found full sequence
                    {__CLR4_2_02w62w6lnxz22my.R.inc(3859);return offset - bufPos;
            }}
        }}
        }__CLR4_2_02w62w6lnxz22my.R.inc(3860);return -1;
    }finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    /**
     * Reads characters up to the specific char.
     * @param c the delimiter
     * @return the chars read
     */
    public String consumeTo(char c) {try{__CLR4_2_02w62w6lnxz22my.R.inc(3861);
        __CLR4_2_02w62w6lnxz22my.R.inc(3862);int offset = nextIndexOf(c);
        __CLR4_2_02w62w6lnxz22my.R.inc(3863);if ((((offset != -1)&&(__CLR4_2_02w62w6lnxz22my.R.iget(3864)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(3865)==0&false))) {{
            __CLR4_2_02w62w6lnxz22my.R.inc(3866);String consumed = cacheString(charBuf, stringCache, bufPos, offset);
            __CLR4_2_02w62w6lnxz22my.R.inc(3867);bufPos += offset;
            __CLR4_2_02w62w6lnxz22my.R.inc(3868);return consumed;
        } }else {{
            __CLR4_2_02w62w6lnxz22my.R.inc(3869);return consumeToEnd();
        }
    }}finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    String consumeTo(String seq) {try{__CLR4_2_02w62w6lnxz22my.R.inc(3870);
        __CLR4_2_02w62w6lnxz22my.R.inc(3871);int offset = nextIndexOf(seq);
        __CLR4_2_02w62w6lnxz22my.R.inc(3872);if ((((offset != -1)&&(__CLR4_2_02w62w6lnxz22my.R.iget(3873)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(3874)==0&false))) {{
            __CLR4_2_02w62w6lnxz22my.R.inc(3875);String consumed = cacheString(charBuf, stringCache, bufPos, offset);
            __CLR4_2_02w62w6lnxz22my.R.inc(3876);bufPos += offset;
            __CLR4_2_02w62w6lnxz22my.R.inc(3877);return consumed;
        } }else {{
            __CLR4_2_02w62w6lnxz22my.R.inc(3878);return consumeToEnd();
        }
    }}finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    /**
     * Read characters until the first of any delimiters is found.
     * @param chars delimiters to scan for
     * @return characters read up to the matched delimiter.
     */
    public String consumeToAny(final char... chars) {try{__CLR4_2_02w62w6lnxz22my.R.inc(3879);
        __CLR4_2_02w62w6lnxz22my.R.inc(3880);bufferUp();
        __CLR4_2_02w62w6lnxz22my.R.inc(3881);int pos = bufPos;
        __CLR4_2_02w62w6lnxz22my.R.inc(3882);final int start = pos;
        __CLR4_2_02w62w6lnxz22my.R.inc(3883);final int remaining = bufLength;
        __CLR4_2_02w62w6lnxz22my.R.inc(3884);final char[] val = charBuf;
        __CLR4_2_02w62w6lnxz22my.R.inc(3885);final int charLen = chars.length;
        __CLR4_2_02w62w6lnxz22my.R.inc(3886);int i;

        __CLR4_2_02w62w6lnxz22my.R.inc(3887);OUTER: while ((((pos < remaining)&&(__CLR4_2_02w62w6lnxz22my.R.iget(3888)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(3889)==0&false))) {{
            __CLR4_2_02w62w6lnxz22my.R.inc(3890);for (i = 0; (((i < charLen)&&(__CLR4_2_02w62w6lnxz22my.R.iget(3891)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(3892)==0&false)); i++) {{
                __CLR4_2_02w62w6lnxz22my.R.inc(3893);if ((((val[pos] == chars[i])&&(__CLR4_2_02w62w6lnxz22my.R.iget(3894)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(3895)==0&false)))
                    {__CLR4_2_02w62w6lnxz22my.R.inc(3896);break OUTER;
            }}
            }__CLR4_2_02w62w6lnxz22my.R.inc(3897);pos++;
        }

        }__CLR4_2_02w62w6lnxz22my.R.inc(3898);bufPos = pos;
        __CLR4_2_02w62w6lnxz22my.R.inc(3899);return (((pos > start )&&(__CLR4_2_02w62w6lnxz22my.R.iget(3900)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(3901)==0&false))? cacheString(charBuf, stringCache, start, pos -start) : "";
    }finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    String consumeToAnySorted(final char... chars) {try{__CLR4_2_02w62w6lnxz22my.R.inc(3902);
        __CLR4_2_02w62w6lnxz22my.R.inc(3903);bufferUp();
        __CLR4_2_02w62w6lnxz22my.R.inc(3904);int pos = bufPos;
        __CLR4_2_02w62w6lnxz22my.R.inc(3905);final int start = pos;
        __CLR4_2_02w62w6lnxz22my.R.inc(3906);final int remaining = bufLength;
        __CLR4_2_02w62w6lnxz22my.R.inc(3907);final char[] val = charBuf;

        __CLR4_2_02w62w6lnxz22my.R.inc(3908);while ((((pos < remaining)&&(__CLR4_2_02w62w6lnxz22my.R.iget(3909)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(3910)==0&false))) {{
            __CLR4_2_02w62w6lnxz22my.R.inc(3911);if ((((Arrays.binarySearch(chars, val[pos]) >= 0)&&(__CLR4_2_02w62w6lnxz22my.R.iget(3912)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(3913)==0&false)))
                {__CLR4_2_02w62w6lnxz22my.R.inc(3914);break;
            }__CLR4_2_02w62w6lnxz22my.R.inc(3915);pos++;
        }
        }__CLR4_2_02w62w6lnxz22my.R.inc(3916);bufPos = pos;
        __CLR4_2_02w62w6lnxz22my.R.inc(3917);return (((bufPos > start )&&(__CLR4_2_02w62w6lnxz22my.R.iget(3918)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(3919)==0&false))? cacheString(charBuf, stringCache, start, pos -start) : "";
    }finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    String consumeData() {try{__CLR4_2_02w62w6lnxz22my.R.inc(3920);
        // &, <, null
        //bufferUp(); // no need to bufferUp, just called consume()
        __CLR4_2_02w62w6lnxz22my.R.inc(3921);int pos = bufPos;
        __CLR4_2_02w62w6lnxz22my.R.inc(3922);final int start = pos;
        __CLR4_2_02w62w6lnxz22my.R.inc(3923);final int remaining = bufLength;
        __CLR4_2_02w62w6lnxz22my.R.inc(3924);final char[] val = charBuf;

        __CLR4_2_02w62w6lnxz22my.R.inc(3925);OUTER: while ((((pos < remaining)&&(__CLR4_2_02w62w6lnxz22my.R.iget(3926)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(3927)==0&false))) {{
            boolean __CLB4_2_0_bool0=false;__CLR4_2_02w62w6lnxz22my.R.inc(3928);switch (val[pos]) {
                case '&':if (!__CLB4_2_0_bool0) {__CLR4_2_02w62w6lnxz22my.R.inc(3929);__CLB4_2_0_bool0=true;}
                case '<':if (!__CLB4_2_0_bool0) {__CLR4_2_02w62w6lnxz22my.R.inc(3930);__CLB4_2_0_bool0=true;}
                case TokeniserState.nullChar:if (!__CLB4_2_0_bool0) {__CLR4_2_02w62w6lnxz22my.R.inc(3931);__CLB4_2_0_bool0=true;}
                    __CLR4_2_02w62w6lnxz22my.R.inc(3932);break OUTER;
                default:if (!__CLB4_2_0_bool0) {__CLR4_2_02w62w6lnxz22my.R.inc(3933);__CLB4_2_0_bool0=true;}
                    __CLR4_2_02w62w6lnxz22my.R.inc(3934);pos++;
            }
        }
        }__CLR4_2_02w62w6lnxz22my.R.inc(3935);bufPos = pos;
        __CLR4_2_02w62w6lnxz22my.R.inc(3936);return (((pos > start )&&(__CLR4_2_02w62w6lnxz22my.R.iget(3937)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(3938)==0&false))? cacheString(charBuf, stringCache, start, pos -start) : "";
    }finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    String consumeTagName() {try{__CLR4_2_02w62w6lnxz22my.R.inc(3939);
        // '\t', '\n', '\r', '\f', ' ', '/', '>', nullChar
        // NOTE: out of spec, added '<' to fix common author bugs
        __CLR4_2_02w62w6lnxz22my.R.inc(3940);bufferUp();
        __CLR4_2_02w62w6lnxz22my.R.inc(3941);int pos = bufPos;
        __CLR4_2_02w62w6lnxz22my.R.inc(3942);final int start = pos;
        __CLR4_2_02w62w6lnxz22my.R.inc(3943);final int remaining = bufLength;
        __CLR4_2_02w62w6lnxz22my.R.inc(3944);final char[] val = charBuf;

        __CLR4_2_02w62w6lnxz22my.R.inc(3945);OUTER: while ((((pos < remaining)&&(__CLR4_2_02w62w6lnxz22my.R.iget(3946)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(3947)==0&false))) {{
            boolean __CLB4_2_0_bool1=false;__CLR4_2_02w62w6lnxz22my.R.inc(3948);switch (val[pos]) {
                case '\t':if (!__CLB4_2_0_bool1) {__CLR4_2_02w62w6lnxz22my.R.inc(3949);__CLB4_2_0_bool1=true;}
                case '\n':if (!__CLB4_2_0_bool1) {__CLR4_2_02w62w6lnxz22my.R.inc(3950);__CLB4_2_0_bool1=true;}
                case '\r':if (!__CLB4_2_0_bool1) {__CLR4_2_02w62w6lnxz22my.R.inc(3951);__CLB4_2_0_bool1=true;}
                case '\f':if (!__CLB4_2_0_bool1) {__CLR4_2_02w62w6lnxz22my.R.inc(3952);__CLB4_2_0_bool1=true;}
                case ' ':if (!__CLB4_2_0_bool1) {__CLR4_2_02w62w6lnxz22my.R.inc(3953);__CLB4_2_0_bool1=true;}
                case '/':if (!__CLB4_2_0_bool1) {__CLR4_2_02w62w6lnxz22my.R.inc(3954);__CLB4_2_0_bool1=true;}
                case '>':if (!__CLB4_2_0_bool1) {__CLR4_2_02w62w6lnxz22my.R.inc(3955);__CLB4_2_0_bool1=true;}
                case '<':if (!__CLB4_2_0_bool1) {__CLR4_2_02w62w6lnxz22my.R.inc(3956);__CLB4_2_0_bool1=true;}
                case TokeniserState.nullChar:if (!__CLB4_2_0_bool1) {__CLR4_2_02w62w6lnxz22my.R.inc(3957);__CLB4_2_0_bool1=true;}
                    __CLR4_2_02w62w6lnxz22my.R.inc(3958);break OUTER;
            }
            __CLR4_2_02w62w6lnxz22my.R.inc(3959);pos++;
        }

        }__CLR4_2_02w62w6lnxz22my.R.inc(3960);bufPos = pos;
        __CLR4_2_02w62w6lnxz22my.R.inc(3961);return (((pos > start )&&(__CLR4_2_02w62w6lnxz22my.R.iget(3962)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(3963)==0&false))? cacheString(charBuf, stringCache, start, pos -start) : "";
    }finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    String consumeToEnd() {try{__CLR4_2_02w62w6lnxz22my.R.inc(3964);
        __CLR4_2_02w62w6lnxz22my.R.inc(3965);bufferUp();
        __CLR4_2_02w62w6lnxz22my.R.inc(3966);String data = cacheString(charBuf, stringCache, bufPos, bufLength - bufPos);
        __CLR4_2_02w62w6lnxz22my.R.inc(3967);bufPos = bufLength;
        __CLR4_2_02w62w6lnxz22my.R.inc(3968);return data;
    }finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    String consumeLetterSequence() {try{__CLR4_2_02w62w6lnxz22my.R.inc(3969);
        __CLR4_2_02w62w6lnxz22my.R.inc(3970);bufferUp();
        __CLR4_2_02w62w6lnxz22my.R.inc(3971);int start = bufPos;
        __CLR4_2_02w62w6lnxz22my.R.inc(3972);while ((((bufPos < bufLength)&&(__CLR4_2_02w62w6lnxz22my.R.iget(3973)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(3974)==0&false))) {{
            __CLR4_2_02w62w6lnxz22my.R.inc(3975);char c = charBuf[bufPos];
            __CLR4_2_02w62w6lnxz22my.R.inc(3976);if (((((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || Character.isLetter(c))&&(__CLR4_2_02w62w6lnxz22my.R.iget(3977)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(3978)==0&false)))
                {__CLR4_2_02w62w6lnxz22my.R.inc(3979);bufPos++;
            }else
                {__CLR4_2_02w62w6lnxz22my.R.inc(3980);break;
        }}

        }__CLR4_2_02w62w6lnxz22my.R.inc(3981);return cacheString(charBuf, stringCache, start, bufPos - start);
    }finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    String consumeLetterThenDigitSequence() {try{__CLR4_2_02w62w6lnxz22my.R.inc(3982);
        __CLR4_2_02w62w6lnxz22my.R.inc(3983);bufferUp();
        __CLR4_2_02w62w6lnxz22my.R.inc(3984);int start = bufPos;
        __CLR4_2_02w62w6lnxz22my.R.inc(3985);while ((((bufPos < bufLength)&&(__CLR4_2_02w62w6lnxz22my.R.iget(3986)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(3987)==0&false))) {{
            __CLR4_2_02w62w6lnxz22my.R.inc(3988);char c = charBuf[bufPos];
            __CLR4_2_02w62w6lnxz22my.R.inc(3989);if (((((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || Character.isLetter(c))&&(__CLR4_2_02w62w6lnxz22my.R.iget(3990)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(3991)==0&false)))
                {__CLR4_2_02w62w6lnxz22my.R.inc(3992);bufPos++;
            }else
                {__CLR4_2_02w62w6lnxz22my.R.inc(3993);break;
        }}
        }__CLR4_2_02w62w6lnxz22my.R.inc(3994);while ((((!isEmptyNoBufferUp())&&(__CLR4_2_02w62w6lnxz22my.R.iget(3995)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(3996)==0&false))) {{
            __CLR4_2_02w62w6lnxz22my.R.inc(3997);char c = charBuf[bufPos];
            __CLR4_2_02w62w6lnxz22my.R.inc(3998);if ((((c >= '0' && c <= '9')&&(__CLR4_2_02w62w6lnxz22my.R.iget(3999)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(4000)==0&false)))
                {__CLR4_2_02w62w6lnxz22my.R.inc(4001);bufPos++;
            }else
                {__CLR4_2_02w62w6lnxz22my.R.inc(4002);break;
        }}

        }__CLR4_2_02w62w6lnxz22my.R.inc(4003);return cacheString(charBuf, stringCache, start, bufPos - start);
    }finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    String consumeHexSequence() {try{__CLR4_2_02w62w6lnxz22my.R.inc(4004);
        __CLR4_2_02w62w6lnxz22my.R.inc(4005);bufferUp();
        __CLR4_2_02w62w6lnxz22my.R.inc(4006);int start = bufPos;
        __CLR4_2_02w62w6lnxz22my.R.inc(4007);while ((((bufPos < bufLength)&&(__CLR4_2_02w62w6lnxz22my.R.iget(4008)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(4009)==0&false))) {{
            __CLR4_2_02w62w6lnxz22my.R.inc(4010);char c = charBuf[bufPos];
            __CLR4_2_02w62w6lnxz22my.R.inc(4011);if (((((c >= '0' && c <= '9') || (c >= 'A' && c <= 'F') || (c >= 'a' && c <= 'f'))&&(__CLR4_2_02w62w6lnxz22my.R.iget(4012)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(4013)==0&false)))
                {__CLR4_2_02w62w6lnxz22my.R.inc(4014);bufPos++;
            }else
                {__CLR4_2_02w62w6lnxz22my.R.inc(4015);break;
        }}
        }__CLR4_2_02w62w6lnxz22my.R.inc(4016);return cacheString(charBuf, stringCache, start, bufPos - start);
    }finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    String consumeDigitSequence() {try{__CLR4_2_02w62w6lnxz22my.R.inc(4017);
        __CLR4_2_02w62w6lnxz22my.R.inc(4018);bufferUp();
        __CLR4_2_02w62w6lnxz22my.R.inc(4019);int start = bufPos;
        __CLR4_2_02w62w6lnxz22my.R.inc(4020);while ((((bufPos < bufLength)&&(__CLR4_2_02w62w6lnxz22my.R.iget(4021)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(4022)==0&false))) {{
            __CLR4_2_02w62w6lnxz22my.R.inc(4023);char c = charBuf[bufPos];
            __CLR4_2_02w62w6lnxz22my.R.inc(4024);if ((((c >= '0' && c <= '9')&&(__CLR4_2_02w62w6lnxz22my.R.iget(4025)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(4026)==0&false)))
                {__CLR4_2_02w62w6lnxz22my.R.inc(4027);bufPos++;
            }else
                {__CLR4_2_02w62w6lnxz22my.R.inc(4028);break;
        }}
        }__CLR4_2_02w62w6lnxz22my.R.inc(4029);return cacheString(charBuf, stringCache, start, bufPos - start);
    }finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    boolean matches(char c) {try{__CLR4_2_02w62w6lnxz22my.R.inc(4030);
        __CLR4_2_02w62w6lnxz22my.R.inc(4031);return !isEmpty() && charBuf[bufPos] == c;

    }finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    boolean matches(String seq) {try{__CLR4_2_02w62w6lnxz22my.R.inc(4032);
        __CLR4_2_02w62w6lnxz22my.R.inc(4033);bufferUp();
        __CLR4_2_02w62w6lnxz22my.R.inc(4034);int scanLength = seq.length();
        __CLR4_2_02w62w6lnxz22my.R.inc(4035);if ((((scanLength > bufLength - bufPos)&&(__CLR4_2_02w62w6lnxz22my.R.iget(4036)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(4037)==0&false)))
            {__CLR4_2_02w62w6lnxz22my.R.inc(4038);return false;

        }__CLR4_2_02w62w6lnxz22my.R.inc(4039);for (int offset = 0; (((offset < scanLength)&&(__CLR4_2_02w62w6lnxz22my.R.iget(4040)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(4041)==0&false)); offset++)
            {__CLR4_2_02w62w6lnxz22my.R.inc(4042);if ((((seq.charAt(offset) != charBuf[bufPos +offset])&&(__CLR4_2_02w62w6lnxz22my.R.iget(4043)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(4044)==0&false)))
                {__CLR4_2_02w62w6lnxz22my.R.inc(4045);return false;
        }}__CLR4_2_02w62w6lnxz22my.R.inc(4046);return true;
    }finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    boolean matchesIgnoreCase(String seq) {try{__CLR4_2_02w62w6lnxz22my.R.inc(4047);
        __CLR4_2_02w62w6lnxz22my.R.inc(4048);bufferUp();
        __CLR4_2_02w62w6lnxz22my.R.inc(4049);int scanLength = seq.length();
        __CLR4_2_02w62w6lnxz22my.R.inc(4050);if ((((scanLength > bufLength - bufPos)&&(__CLR4_2_02w62w6lnxz22my.R.iget(4051)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(4052)==0&false)))
            {__CLR4_2_02w62w6lnxz22my.R.inc(4053);return false;

        }__CLR4_2_02w62w6lnxz22my.R.inc(4054);for (int offset = 0; (((offset < scanLength)&&(__CLR4_2_02w62w6lnxz22my.R.iget(4055)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(4056)==0&false)); offset++) {{
            __CLR4_2_02w62w6lnxz22my.R.inc(4057);char upScan = Character.toUpperCase(seq.charAt(offset));
            __CLR4_2_02w62w6lnxz22my.R.inc(4058);char upTarget = Character.toUpperCase(charBuf[bufPos + offset]);
            __CLR4_2_02w62w6lnxz22my.R.inc(4059);if ((((upScan != upTarget)&&(__CLR4_2_02w62w6lnxz22my.R.iget(4060)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(4061)==0&false)))
                {__CLR4_2_02w62w6lnxz22my.R.inc(4062);return false;
        }}
        }__CLR4_2_02w62w6lnxz22my.R.inc(4063);return true;
    }finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    boolean matchesAny(char... seq) {try{__CLR4_2_02w62w6lnxz22my.R.inc(4064);
        __CLR4_2_02w62w6lnxz22my.R.inc(4065);if ((((isEmpty())&&(__CLR4_2_02w62w6lnxz22my.R.iget(4066)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(4067)==0&false)))
            {__CLR4_2_02w62w6lnxz22my.R.inc(4068);return false;

        }__CLR4_2_02w62w6lnxz22my.R.inc(4069);bufferUp();
        __CLR4_2_02w62w6lnxz22my.R.inc(4070);char c = charBuf[bufPos];
        __CLR4_2_02w62w6lnxz22my.R.inc(4071);for (char seek : seq) {{
            __CLR4_2_02w62w6lnxz22my.R.inc(4072);if ((((seek == c)&&(__CLR4_2_02w62w6lnxz22my.R.iget(4073)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(4074)==0&false)))
                {__CLR4_2_02w62w6lnxz22my.R.inc(4075);return true;
        }}
        }__CLR4_2_02w62w6lnxz22my.R.inc(4076);return false;
    }finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    boolean matchesAnySorted(char[] seq) {try{__CLR4_2_02w62w6lnxz22my.R.inc(4077);
        __CLR4_2_02w62w6lnxz22my.R.inc(4078);bufferUp();
        __CLR4_2_02w62w6lnxz22my.R.inc(4079);return !isEmpty() && Arrays.binarySearch(seq, charBuf[bufPos]) >= 0;
    }finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    boolean matchesLetter() {try{__CLR4_2_02w62w6lnxz22my.R.inc(4080);
        __CLR4_2_02w62w6lnxz22my.R.inc(4081);if ((((isEmpty())&&(__CLR4_2_02w62w6lnxz22my.R.iget(4082)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(4083)==0&false)))
            {__CLR4_2_02w62w6lnxz22my.R.inc(4084);return false;
        }__CLR4_2_02w62w6lnxz22my.R.inc(4085);char c = charBuf[bufPos];
        __CLR4_2_02w62w6lnxz22my.R.inc(4086);return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || Character.isLetter(c);
    }finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    boolean matchesDigit() {try{__CLR4_2_02w62w6lnxz22my.R.inc(4087);
        __CLR4_2_02w62w6lnxz22my.R.inc(4088);if ((((isEmpty())&&(__CLR4_2_02w62w6lnxz22my.R.iget(4089)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(4090)==0&false)))
            {__CLR4_2_02w62w6lnxz22my.R.inc(4091);return false;
        }__CLR4_2_02w62w6lnxz22my.R.inc(4092);char c = charBuf[bufPos];
        __CLR4_2_02w62w6lnxz22my.R.inc(4093);return (c >= '0' && c <= '9');
    }finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    boolean matchConsume(String seq) {try{__CLR4_2_02w62w6lnxz22my.R.inc(4094);
        __CLR4_2_02w62w6lnxz22my.R.inc(4095);bufferUp();
        __CLR4_2_02w62w6lnxz22my.R.inc(4096);if ((((matches(seq))&&(__CLR4_2_02w62w6lnxz22my.R.iget(4097)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(4098)==0&false))) {{
            __CLR4_2_02w62w6lnxz22my.R.inc(4099);bufPos += seq.length();
            __CLR4_2_02w62w6lnxz22my.R.inc(4100);return true;
        } }else {{
            __CLR4_2_02w62w6lnxz22my.R.inc(4101);return false;
        }
    }}finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    boolean matchConsumeIgnoreCase(String seq) {try{__CLR4_2_02w62w6lnxz22my.R.inc(4102);
        __CLR4_2_02w62w6lnxz22my.R.inc(4103);if ((((matchesIgnoreCase(seq))&&(__CLR4_2_02w62w6lnxz22my.R.iget(4104)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(4105)==0&false))) {{
            __CLR4_2_02w62w6lnxz22my.R.inc(4106);bufPos += seq.length();
            __CLR4_2_02w62w6lnxz22my.R.inc(4107);return true;
        } }else {{
            __CLR4_2_02w62w6lnxz22my.R.inc(4108);return false;
        }
    }}finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    boolean containsIgnoreCase(String seq) {try{__CLR4_2_02w62w6lnxz22my.R.inc(4109);
        // used to check presence of </title>, </style>. only finds consistent case.
        __CLR4_2_02w62w6lnxz22my.R.inc(4110);String loScan = seq.toLowerCase(Locale.ENGLISH);
        __CLR4_2_02w62w6lnxz22my.R.inc(4111);String hiScan = seq.toUpperCase(Locale.ENGLISH);
        __CLR4_2_02w62w6lnxz22my.R.inc(4112);return (nextIndexOf(loScan) > -1) || (nextIndexOf(hiScan) > -1);
    }finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    private static final int numNullsConsideredBinary = 10; // conservative

    /**
     *  Heuristic to determine if the current buffer looks like binary content. Reader will already hopefully be
     *  decoded correctly, so a bunch of NULLs indicates a binary file
     */
    boolean isBinary() {try{__CLR4_2_02w62w6lnxz22my.R.inc(4113);
        __CLR4_2_02w62w6lnxz22my.R.inc(4114);int nullsSeen = 0;

        __CLR4_2_02w62w6lnxz22my.R.inc(4115);for (int i = bufPos; (((i < bufLength)&&(__CLR4_2_02w62w6lnxz22my.R.iget(4116)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(4117)==0&false)); i++) {{
            __CLR4_2_02w62w6lnxz22my.R.inc(4118);if ((((charBuf[i] == '\0')&&(__CLR4_2_02w62w6lnxz22my.R.iget(4119)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(4120)==0&false)))
                {__CLR4_2_02w62w6lnxz22my.R.inc(4121);nullsSeen++;
        }}

        }__CLR4_2_02w62w6lnxz22my.R.inc(4122);return nullsSeen >= numNullsConsideredBinary;
    }finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_2_02w62w6lnxz22my.R.inc(4123);
        __CLR4_2_02w62w6lnxz22my.R.inc(4124);return new String(charBuf, bufPos, bufLength - bufPos);
    }finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    /**
     * Caches short strings, as a flywheel pattern, to reduce GC load. Just for this doc, to prevent leaks.
     * <p />
     * Simplistic, and on hash collisions just falls back to creating a new string, vs a full HashMap with Entry list.
     * That saves both having to create objects as hash keys, and running through the entry list, at the expense of
     * some more duplicates.
     */
    private static String cacheString(final char[] charBuf, final String[] stringCache, final int start, final int count) {try{__CLR4_2_02w62w6lnxz22my.R.inc(4125);
        // limit (no cache):
        __CLR4_2_02w62w6lnxz22my.R.inc(4126);if ((((count > maxStringCacheLen)&&(__CLR4_2_02w62w6lnxz22my.R.iget(4127)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(4128)==0&false)))
            {__CLR4_2_02w62w6lnxz22my.R.inc(4129);return new String(charBuf, start, count);
        }__CLR4_2_02w62w6lnxz22my.R.inc(4130);if ((((count < 1)&&(__CLR4_2_02w62w6lnxz22my.R.iget(4131)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(4132)==0&false)))
            {__CLR4_2_02w62w6lnxz22my.R.inc(4133);return "";

        // calculate hash:
        }__CLR4_2_02w62w6lnxz22my.R.inc(4134);int hash = 0;
        __CLR4_2_02w62w6lnxz22my.R.inc(4135);int offset = start;
        __CLR4_2_02w62w6lnxz22my.R.inc(4136);for (int i = 0; (((i < count)&&(__CLR4_2_02w62w6lnxz22my.R.iget(4137)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(4138)==0&false)); i++) {{
            __CLR4_2_02w62w6lnxz22my.R.inc(4139);hash = 31 * hash + charBuf[offset++];
        }

        // get from cache
        }__CLR4_2_02w62w6lnxz22my.R.inc(4140);final int index = hash & stringCache.length - 1;
        __CLR4_2_02w62w6lnxz22my.R.inc(4141);String cached = stringCache[index];

        __CLR4_2_02w62w6lnxz22my.R.inc(4142);if ((((cached == null)&&(__CLR4_2_02w62w6lnxz22my.R.iget(4143)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(4144)==0&false))) {{ // miss, add
            __CLR4_2_02w62w6lnxz22my.R.inc(4145);cached = new String(charBuf, start, count);
            __CLR4_2_02w62w6lnxz22my.R.inc(4146);stringCache[index] = cached;
        } }else {{ // hashcode hit, check equality
            __CLR4_2_02w62w6lnxz22my.R.inc(4147);if ((((rangeEquals(charBuf, start, count, cached))&&(__CLR4_2_02w62w6lnxz22my.R.iget(4148)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(4149)==0&false))) {{ // hit
                __CLR4_2_02w62w6lnxz22my.R.inc(4150);return cached;
            } }else {{ // hashcode conflict
                __CLR4_2_02w62w6lnxz22my.R.inc(4151);cached = new String(charBuf, start, count);
                __CLR4_2_02w62w6lnxz22my.R.inc(4152);stringCache[index] = cached; // update the cache, as recently used strings are more likely to show up again
            }
        }}
        }__CLR4_2_02w62w6lnxz22my.R.inc(4153);return cached;
    }finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    /**
     * Check if the value of the provided range equals the string.
     */
    static boolean rangeEquals(final char[] charBuf, final int start, int count, final String cached) {try{__CLR4_2_02w62w6lnxz22my.R.inc(4154);
        __CLR4_2_02w62w6lnxz22my.R.inc(4155);if ((((count == cached.length())&&(__CLR4_2_02w62w6lnxz22my.R.iget(4156)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(4157)==0&false))) {{
            __CLR4_2_02w62w6lnxz22my.R.inc(4158);int i = start;
            __CLR4_2_02w62w6lnxz22my.R.inc(4159);int j = 0;
            __CLR4_2_02w62w6lnxz22my.R.inc(4160);while ((((count-- != 0)&&(__CLR4_2_02w62w6lnxz22my.R.iget(4161)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(4162)==0&false))) {{
                __CLR4_2_02w62w6lnxz22my.R.inc(4163);if ((((charBuf[i++] != cached.charAt(j++))&&(__CLR4_2_02w62w6lnxz22my.R.iget(4164)!=0|true))||(__CLR4_2_02w62w6lnxz22my.R.iget(4165)==0&false)))
                    {__CLR4_2_02w62w6lnxz22my.R.inc(4166);return false;
            }}
            }__CLR4_2_02w62w6lnxz22my.R.inc(4167);return true;
        }
        }__CLR4_2_02w62w6lnxz22my.R.inc(4168);return false;
    }finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}

    // just used for testing
    boolean rangeEquals(final int start, final int count, final String cached) {try{__CLR4_2_02w62w6lnxz22my.R.inc(4169);
        __CLR4_2_02w62w6lnxz22my.R.inc(4170);return rangeEquals(charBuf, start, count, cached);
    }finally{__CLR4_2_02w62w6lnxz22my.R.flushNeeded();}}
}
