/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.parser;

import org.jsoup.internal.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Entities;

import java.util.Arrays;

/**
 * Readers the input stream into tokens.
 */
final class Tokeniser {public static class __CLR4_2_05j95j9lnxz22pw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,7387,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static final char replacementChar = '\ufffd'; // replaces null character
    private static final char[] notCharRefCharsSorted = new char[]{'\t', '\n', '\r', '\f', ' ', '<', '&'};

    // Some illegal character escapes are parsed by browsers as windows-1252 instead. See issue #1034
    // https://html.spec.whatwg.org/multipage/parsing.html#numeric-character-reference-end-state
    static final int win1252ExtensionsStart = 0x80;
    static final int[] win1252Extensions = new int[] {
            // we could build this manually, but Windows-1252 is not a standard java charset so that could break on
            // some platforms - this table is verified with a test
            0x20AC, 0x0081, 0x201A, 0x0192, 0x201E, 0x2026, 0x2020, 0x2021,
            0x02C6, 0x2030, 0x0160, 0x2039, 0x0152, 0x008D, 0x017D, 0x008F,
            0x0090, 0x2018, 0x2019, 0x201C, 0x201D, 0x2022, 0x2013, 0x2014,
            0x02DC, 0x2122, 0x0161, 0x203A, 0x0153, 0x009D, 0x017E, 0x0178,
    };

    static {try{__CLR4_2_05j95j9lnxz22pw.R.inc(7173);
        __CLR4_2_05j95j9lnxz22pw.R.inc(7174);Arrays.sort(notCharRefCharsSorted);
    }finally{__CLR4_2_05j95j9lnxz22pw.R.flushNeeded();}}

    private final CharacterReader reader; // html input
    private final ParseErrorList errors; // errors found while tokenising

    private TokeniserState state = TokeniserState.Data; // current tokenisation state
    private Token emitPending; // the token we are about to emit on next read
    private boolean isEmitPending = false;
    private String charsString = null; // characters pending an emit. Will fall to charsBuilder if more than one
    private StringBuilder charsBuilder = new StringBuilder(1024); // buffers characters to output as one token, if more than one emit per read
    StringBuilder dataBuffer = new StringBuilder(1024); // buffers data looking for </script>

    Token.Tag tagPending; // tag we are building up
    Token.StartTag startPending = new Token.StartTag();
    Token.EndTag endPending = new Token.EndTag();
    Token.Character charPending = new Token.Character();
    Token.Doctype doctypePending = new Token.Doctype(); // doctype building up
    Token.Comment commentPending = new Token.Comment(); // comment building up
    private String lastStartTag; // the last start tag emitted, to test appropriate end tag

    Tokeniser(CharacterReader reader, ParseErrorList errors) {try{__CLR4_2_05j95j9lnxz22pw.R.inc(7175);
        __CLR4_2_05j95j9lnxz22pw.R.inc(7176);this.reader = reader;
        __CLR4_2_05j95j9lnxz22pw.R.inc(7177);this.errors = errors;
    }finally{__CLR4_2_05j95j9lnxz22pw.R.flushNeeded();}}

    Token read() {try{__CLR4_2_05j95j9lnxz22pw.R.inc(7178);
        __CLR4_2_05j95j9lnxz22pw.R.inc(7179);while ((((!isEmitPending)&&(__CLR4_2_05j95j9lnxz22pw.R.iget(7180)!=0|true))||(__CLR4_2_05j95j9lnxz22pw.R.iget(7181)==0&false)))
            {__CLR4_2_05j95j9lnxz22pw.R.inc(7182);state.read(this, reader);

        // if emit is pending, a non-character token was found: return any chars in buffer, and leave token for next read:
        }__CLR4_2_05j95j9lnxz22pw.R.inc(7183);if ((((charsBuilder.length() > 0)&&(__CLR4_2_05j95j9lnxz22pw.R.iget(7184)!=0|true))||(__CLR4_2_05j95j9lnxz22pw.R.iget(7185)==0&false))) {{
            __CLR4_2_05j95j9lnxz22pw.R.inc(7186);String str = charsBuilder.toString();
            __CLR4_2_05j95j9lnxz22pw.R.inc(7187);charsBuilder.delete(0, charsBuilder.length());
            __CLR4_2_05j95j9lnxz22pw.R.inc(7188);charsString = null;
            __CLR4_2_05j95j9lnxz22pw.R.inc(7189);return charPending.data(str);
        } }else {__CLR4_2_05j95j9lnxz22pw.R.inc(7190);if ((((charsString != null)&&(__CLR4_2_05j95j9lnxz22pw.R.iget(7191)!=0|true))||(__CLR4_2_05j95j9lnxz22pw.R.iget(7192)==0&false))) {{
            __CLR4_2_05j95j9lnxz22pw.R.inc(7193);Token token = charPending.data(charsString);
            __CLR4_2_05j95j9lnxz22pw.R.inc(7194);charsString = null;
            __CLR4_2_05j95j9lnxz22pw.R.inc(7195);return token;
        } }else {{
            __CLR4_2_05j95j9lnxz22pw.R.inc(7196);isEmitPending = false;
            __CLR4_2_05j95j9lnxz22pw.R.inc(7197);return emitPending;
        }
    }}}finally{__CLR4_2_05j95j9lnxz22pw.R.flushNeeded();}}

    void emit(Token token) {try{__CLR4_2_05j95j9lnxz22pw.R.inc(7198);
        __CLR4_2_05j95j9lnxz22pw.R.inc(7199);Validate.isFalse(isEmitPending, "There is an unread token pending!");

        __CLR4_2_05j95j9lnxz22pw.R.inc(7200);emitPending = token;
        __CLR4_2_05j95j9lnxz22pw.R.inc(7201);isEmitPending = true;

        __CLR4_2_05j95j9lnxz22pw.R.inc(7202);if ((((token.type == Token.TokenType.StartTag)&&(__CLR4_2_05j95j9lnxz22pw.R.iget(7203)!=0|true))||(__CLR4_2_05j95j9lnxz22pw.R.iget(7204)==0&false))) {{
            __CLR4_2_05j95j9lnxz22pw.R.inc(7205);Token.StartTag startTag = (Token.StartTag) token;
            __CLR4_2_05j95j9lnxz22pw.R.inc(7206);lastStartTag = startTag.tagName;
        } }else {__CLR4_2_05j95j9lnxz22pw.R.inc(7207);if ((((token.type == Token.TokenType.EndTag)&&(__CLR4_2_05j95j9lnxz22pw.R.iget(7208)!=0|true))||(__CLR4_2_05j95j9lnxz22pw.R.iget(7209)==0&false))) {{
            __CLR4_2_05j95j9lnxz22pw.R.inc(7210);Token.EndTag endTag = (Token.EndTag) token;
            __CLR4_2_05j95j9lnxz22pw.R.inc(7211);if ((((endTag.attributes != null)&&(__CLR4_2_05j95j9lnxz22pw.R.iget(7212)!=0|true))||(__CLR4_2_05j95j9lnxz22pw.R.iget(7213)==0&false)))
                {__CLR4_2_05j95j9lnxz22pw.R.inc(7214);error("Attributes incorrectly present on end tag");
        }}
    }}}finally{__CLR4_2_05j95j9lnxz22pw.R.flushNeeded();}}

    void emit(final String str) {try{__CLR4_2_05j95j9lnxz22pw.R.inc(7215);
        // buffer strings up until last string token found, to emit only one token for a run of character refs etc.
        // does not set isEmitPending; read checks that
        __CLR4_2_05j95j9lnxz22pw.R.inc(7216);if ((((charsString == null)&&(__CLR4_2_05j95j9lnxz22pw.R.iget(7217)!=0|true))||(__CLR4_2_05j95j9lnxz22pw.R.iget(7218)==0&false))) {{
            __CLR4_2_05j95j9lnxz22pw.R.inc(7219);charsString = str;
        }
        }else {{
            __CLR4_2_05j95j9lnxz22pw.R.inc(7220);if ((((charsBuilder.length() == 0)&&(__CLR4_2_05j95j9lnxz22pw.R.iget(7221)!=0|true))||(__CLR4_2_05j95j9lnxz22pw.R.iget(7222)==0&false))) {{ // switching to string builder as more than one emit before read
                __CLR4_2_05j95j9lnxz22pw.R.inc(7223);charsBuilder.append(charsString);
            }
            }__CLR4_2_05j95j9lnxz22pw.R.inc(7224);charsBuilder.append(str);
        }
    }}finally{__CLR4_2_05j95j9lnxz22pw.R.flushNeeded();}}

    void emit(char[] chars) {try{__CLR4_2_05j95j9lnxz22pw.R.inc(7225);
        __CLR4_2_05j95j9lnxz22pw.R.inc(7226);emit(String.valueOf(chars));
    }finally{__CLR4_2_05j95j9lnxz22pw.R.flushNeeded();}}

    void emit(int[] codepoints) {try{__CLR4_2_05j95j9lnxz22pw.R.inc(7227);
        __CLR4_2_05j95j9lnxz22pw.R.inc(7228);emit(new String(codepoints, 0, codepoints.length));
    }finally{__CLR4_2_05j95j9lnxz22pw.R.flushNeeded();}}

    void emit(char c) {try{__CLR4_2_05j95j9lnxz22pw.R.inc(7229);
        __CLR4_2_05j95j9lnxz22pw.R.inc(7230);emit(String.valueOf(c));
    }finally{__CLR4_2_05j95j9lnxz22pw.R.flushNeeded();}}

    TokeniserState getState() {try{__CLR4_2_05j95j9lnxz22pw.R.inc(7231);
        __CLR4_2_05j95j9lnxz22pw.R.inc(7232);return state;
    }finally{__CLR4_2_05j95j9lnxz22pw.R.flushNeeded();}}

    void transition(TokeniserState state) {try{__CLR4_2_05j95j9lnxz22pw.R.inc(7233);
        __CLR4_2_05j95j9lnxz22pw.R.inc(7234);this.state = state;
    }finally{__CLR4_2_05j95j9lnxz22pw.R.flushNeeded();}}

    void advanceTransition(TokeniserState state) {try{__CLR4_2_05j95j9lnxz22pw.R.inc(7235);
        __CLR4_2_05j95j9lnxz22pw.R.inc(7236);reader.advance();
        __CLR4_2_05j95j9lnxz22pw.R.inc(7237);this.state = state;
    }finally{__CLR4_2_05j95j9lnxz22pw.R.flushNeeded();}}

    final private int[] codepointHolder = new int[1]; // holder to not have to keep creating arrays
    final private int[] multipointHolder = new int[2];
    int[] consumeCharacterReference(Character additionalAllowedCharacter, boolean inAttribute) {try{__CLR4_2_05j95j9lnxz22pw.R.inc(7238);
        __CLR4_2_05j95j9lnxz22pw.R.inc(7239);if ((((reader.isEmpty())&&(__CLR4_2_05j95j9lnxz22pw.R.iget(7240)!=0|true))||(__CLR4_2_05j95j9lnxz22pw.R.iget(7241)==0&false)))
            {__CLR4_2_05j95j9lnxz22pw.R.inc(7242);return null;
        }__CLR4_2_05j95j9lnxz22pw.R.inc(7243);if ((((additionalAllowedCharacter != null && additionalAllowedCharacter == reader.current())&&(__CLR4_2_05j95j9lnxz22pw.R.iget(7244)!=0|true))||(__CLR4_2_05j95j9lnxz22pw.R.iget(7245)==0&false)))
            {__CLR4_2_05j95j9lnxz22pw.R.inc(7246);return null;
        }__CLR4_2_05j95j9lnxz22pw.R.inc(7247);if ((((reader.matchesAnySorted(notCharRefCharsSorted))&&(__CLR4_2_05j95j9lnxz22pw.R.iget(7248)!=0|true))||(__CLR4_2_05j95j9lnxz22pw.R.iget(7249)==0&false)))
            {__CLR4_2_05j95j9lnxz22pw.R.inc(7250);return null;

        }__CLR4_2_05j95j9lnxz22pw.R.inc(7251);final int[] codeRef = codepointHolder;
        __CLR4_2_05j95j9lnxz22pw.R.inc(7252);reader.mark();
        __CLR4_2_05j95j9lnxz22pw.R.inc(7253);if ((((reader.matchConsume("#"))&&(__CLR4_2_05j95j9lnxz22pw.R.iget(7254)!=0|true))||(__CLR4_2_05j95j9lnxz22pw.R.iget(7255)==0&false))) {{ // numbered
            __CLR4_2_05j95j9lnxz22pw.R.inc(7256);boolean isHexMode = reader.matchConsumeIgnoreCase("X");
            __CLR4_2_05j95j9lnxz22pw.R.inc(7257);String numRef = (((isHexMode )&&(__CLR4_2_05j95j9lnxz22pw.R.iget(7258)!=0|true))||(__CLR4_2_05j95j9lnxz22pw.R.iget(7259)==0&false))? reader.consumeHexSequence() : reader.consumeDigitSequence();
            __CLR4_2_05j95j9lnxz22pw.R.inc(7260);if ((((numRef.length() == 0)&&(__CLR4_2_05j95j9lnxz22pw.R.iget(7261)!=0|true))||(__CLR4_2_05j95j9lnxz22pw.R.iget(7262)==0&false))) {{ // didn't match anything
                __CLR4_2_05j95j9lnxz22pw.R.inc(7263);characterReferenceError("numeric reference with no numerals");
                __CLR4_2_05j95j9lnxz22pw.R.inc(7264);reader.rewindToMark();
                __CLR4_2_05j95j9lnxz22pw.R.inc(7265);return null;
            }
            }__CLR4_2_05j95j9lnxz22pw.R.inc(7266);if ((((!reader.matchConsume(";"))&&(__CLR4_2_05j95j9lnxz22pw.R.iget(7267)!=0|true))||(__CLR4_2_05j95j9lnxz22pw.R.iget(7268)==0&false)))
                {__CLR4_2_05j95j9lnxz22pw.R.inc(7269);characterReferenceError("missing semicolon"); // missing semi
            }__CLR4_2_05j95j9lnxz22pw.R.inc(7270);int charval = -1;
            __CLR4_2_05j95j9lnxz22pw.R.inc(7271);try {
                __CLR4_2_05j95j9lnxz22pw.R.inc(7272);int base = (((isHexMode )&&(__CLR4_2_05j95j9lnxz22pw.R.iget(7273)!=0|true))||(__CLR4_2_05j95j9lnxz22pw.R.iget(7274)==0&false))? 16 : 10;
                __CLR4_2_05j95j9lnxz22pw.R.inc(7275);charval = Integer.valueOf(numRef, base);
            } catch (NumberFormatException ignored) {
            } // skip
            __CLR4_2_05j95j9lnxz22pw.R.inc(7276);if ((((charval == -1 || (charval >= 0xD800 && charval <= 0xDFFF) || charval > 0x10FFFF)&&(__CLR4_2_05j95j9lnxz22pw.R.iget(7277)!=0|true))||(__CLR4_2_05j95j9lnxz22pw.R.iget(7278)==0&false))) {{
                __CLR4_2_05j95j9lnxz22pw.R.inc(7279);characterReferenceError("character outside of valid range");
                __CLR4_2_05j95j9lnxz22pw.R.inc(7280);codeRef[0] = replacementChar;
                __CLR4_2_05j95j9lnxz22pw.R.inc(7281);return codeRef;
            } }else {{
                // fix illegal unicode characters to match browser behavior
                __CLR4_2_05j95j9lnxz22pw.R.inc(7282);if ((((charval >= win1252ExtensionsStart && charval < win1252ExtensionsStart + win1252Extensions.length)&&(__CLR4_2_05j95j9lnxz22pw.R.iget(7283)!=0|true))||(__CLR4_2_05j95j9lnxz22pw.R.iget(7284)==0&false))) {{
                    __CLR4_2_05j95j9lnxz22pw.R.inc(7285);characterReferenceError("character is not a valid unicode code point");
                    __CLR4_2_05j95j9lnxz22pw.R.inc(7286);charval = win1252Extensions[charval - win1252ExtensionsStart];
                }

                // todo: implement number replacement table
                // todo: check for extra illegal unicode points as parse errors
                }__CLR4_2_05j95j9lnxz22pw.R.inc(7287);codeRef[0] = charval;
                __CLR4_2_05j95j9lnxz22pw.R.inc(7288);return codeRef;
            }
        }} }else {{ // named
            // get as many letters as possible, and look for matching entities.
            __CLR4_2_05j95j9lnxz22pw.R.inc(7289);String nameRef = reader.consumeLetterThenDigitSequence();
            __CLR4_2_05j95j9lnxz22pw.R.inc(7290);boolean looksLegit = reader.matches(';');
            // found if a base named entity without a ;, or an extended entity with the ;.
            __CLR4_2_05j95j9lnxz22pw.R.inc(7291);boolean found = (Entities.isBaseNamedEntity(nameRef) || (Entities.isNamedEntity(nameRef) && looksLegit));

            __CLR4_2_05j95j9lnxz22pw.R.inc(7292);if ((((!found)&&(__CLR4_2_05j95j9lnxz22pw.R.iget(7293)!=0|true))||(__CLR4_2_05j95j9lnxz22pw.R.iget(7294)==0&false))) {{
                __CLR4_2_05j95j9lnxz22pw.R.inc(7295);reader.rewindToMark();
                __CLR4_2_05j95j9lnxz22pw.R.inc(7296);if ((((looksLegit)&&(__CLR4_2_05j95j9lnxz22pw.R.iget(7297)!=0|true))||(__CLR4_2_05j95j9lnxz22pw.R.iget(7298)==0&false))) // named with semicolon
                    {__CLR4_2_05j95j9lnxz22pw.R.inc(7299);characterReferenceError(String.format("invalid named reference '%s'", nameRef));
                }__CLR4_2_05j95j9lnxz22pw.R.inc(7300);return null;
            }
            }__CLR4_2_05j95j9lnxz22pw.R.inc(7301);if ((((inAttribute && (reader.matchesLetter() || reader.matchesDigit() || reader.matchesAny('=', '-', '_')))&&(__CLR4_2_05j95j9lnxz22pw.R.iget(7302)!=0|true))||(__CLR4_2_05j95j9lnxz22pw.R.iget(7303)==0&false))) {{
                // don't want that to match
                __CLR4_2_05j95j9lnxz22pw.R.inc(7304);reader.rewindToMark();
                __CLR4_2_05j95j9lnxz22pw.R.inc(7305);return null;
            }
            }__CLR4_2_05j95j9lnxz22pw.R.inc(7306);if ((((!reader.matchConsume(";"))&&(__CLR4_2_05j95j9lnxz22pw.R.iget(7307)!=0|true))||(__CLR4_2_05j95j9lnxz22pw.R.iget(7308)==0&false)))
                {__CLR4_2_05j95j9lnxz22pw.R.inc(7309);characterReferenceError("missing semicolon"); // missing semi
            }__CLR4_2_05j95j9lnxz22pw.R.inc(7310);int numChars = Entities.codepointsForName(nameRef, multipointHolder);
            __CLR4_2_05j95j9lnxz22pw.R.inc(7311);if ((((numChars == 1)&&(__CLR4_2_05j95j9lnxz22pw.R.iget(7312)!=0|true))||(__CLR4_2_05j95j9lnxz22pw.R.iget(7313)==0&false))) {{
                __CLR4_2_05j95j9lnxz22pw.R.inc(7314);codeRef[0] = multipointHolder[0];
                __CLR4_2_05j95j9lnxz22pw.R.inc(7315);return codeRef;
            } }else {__CLR4_2_05j95j9lnxz22pw.R.inc(7316);if ((((numChars ==2)&&(__CLR4_2_05j95j9lnxz22pw.R.iget(7317)!=0|true))||(__CLR4_2_05j95j9lnxz22pw.R.iget(7318)==0&false))) {{
                __CLR4_2_05j95j9lnxz22pw.R.inc(7319);return multipointHolder;
            } }else {{
                __CLR4_2_05j95j9lnxz22pw.R.inc(7320);Validate.fail("Unexpected characters returned for " + nameRef);
                __CLR4_2_05j95j9lnxz22pw.R.inc(7321);return multipointHolder;
            }
        }}}
    }}finally{__CLR4_2_05j95j9lnxz22pw.R.flushNeeded();}}

    Token.Tag createTagPending(boolean start) {try{__CLR4_2_05j95j9lnxz22pw.R.inc(7322);
        __CLR4_2_05j95j9lnxz22pw.R.inc(7323);tagPending = (((start )&&(__CLR4_2_05j95j9lnxz22pw.R.iget(7324)!=0|true))||(__CLR4_2_05j95j9lnxz22pw.R.iget(7325)==0&false))? startPending.reset() : endPending.reset();
        __CLR4_2_05j95j9lnxz22pw.R.inc(7326);return tagPending;
    }finally{__CLR4_2_05j95j9lnxz22pw.R.flushNeeded();}}

    void emitTagPending() {try{__CLR4_2_05j95j9lnxz22pw.R.inc(7327);
        __CLR4_2_05j95j9lnxz22pw.R.inc(7328);tagPending.finaliseTag();
        __CLR4_2_05j95j9lnxz22pw.R.inc(7329);emit(tagPending);
    }finally{__CLR4_2_05j95j9lnxz22pw.R.flushNeeded();}}

    void createCommentPending() {try{__CLR4_2_05j95j9lnxz22pw.R.inc(7330);
        __CLR4_2_05j95j9lnxz22pw.R.inc(7331);commentPending.reset();
    }finally{__CLR4_2_05j95j9lnxz22pw.R.flushNeeded();}}

    void emitCommentPending() {try{__CLR4_2_05j95j9lnxz22pw.R.inc(7332);
        __CLR4_2_05j95j9lnxz22pw.R.inc(7333);emit(commentPending);
    }finally{__CLR4_2_05j95j9lnxz22pw.R.flushNeeded();}}

    void createDoctypePending() {try{__CLR4_2_05j95j9lnxz22pw.R.inc(7334);
        __CLR4_2_05j95j9lnxz22pw.R.inc(7335);doctypePending.reset();
    }finally{__CLR4_2_05j95j9lnxz22pw.R.flushNeeded();}}

    void emitDoctypePending() {try{__CLR4_2_05j95j9lnxz22pw.R.inc(7336);
        __CLR4_2_05j95j9lnxz22pw.R.inc(7337);emit(doctypePending);
    }finally{__CLR4_2_05j95j9lnxz22pw.R.flushNeeded();}}

    void createTempBuffer() {try{__CLR4_2_05j95j9lnxz22pw.R.inc(7338);
        __CLR4_2_05j95j9lnxz22pw.R.inc(7339);Token.reset(dataBuffer);
    }finally{__CLR4_2_05j95j9lnxz22pw.R.flushNeeded();}}

    boolean isAppropriateEndTagToken() {try{__CLR4_2_05j95j9lnxz22pw.R.inc(7340);
        __CLR4_2_05j95j9lnxz22pw.R.inc(7341);return lastStartTag != null && tagPending.name().equalsIgnoreCase(lastStartTag);
    }finally{__CLR4_2_05j95j9lnxz22pw.R.flushNeeded();}}

    String appropriateEndTagName() {try{__CLR4_2_05j95j9lnxz22pw.R.inc(7342);
        __CLR4_2_05j95j9lnxz22pw.R.inc(7343);return lastStartTag; // could be null
    }finally{__CLR4_2_05j95j9lnxz22pw.R.flushNeeded();}}

    void error(TokeniserState state) {try{__CLR4_2_05j95j9lnxz22pw.R.inc(7344);
        __CLR4_2_05j95j9lnxz22pw.R.inc(7345);if ((((errors.canAddError())&&(__CLR4_2_05j95j9lnxz22pw.R.iget(7346)!=0|true))||(__CLR4_2_05j95j9lnxz22pw.R.iget(7347)==0&false)))
            {__CLR4_2_05j95j9lnxz22pw.R.inc(7348);errors.add(new ParseError(reader.pos(), "Unexpected character '%s' in input state [%s]", reader.current(), state));
    }}finally{__CLR4_2_05j95j9lnxz22pw.R.flushNeeded();}}

    void eofError(TokeniserState state) {try{__CLR4_2_05j95j9lnxz22pw.R.inc(7349);
        __CLR4_2_05j95j9lnxz22pw.R.inc(7350);if ((((errors.canAddError())&&(__CLR4_2_05j95j9lnxz22pw.R.iget(7351)!=0|true))||(__CLR4_2_05j95j9lnxz22pw.R.iget(7352)==0&false)))
            {__CLR4_2_05j95j9lnxz22pw.R.inc(7353);errors.add(new ParseError(reader.pos(), "Unexpectedly reached end of file (EOF) in input state [%s]", state));
    }}finally{__CLR4_2_05j95j9lnxz22pw.R.flushNeeded();}}

    private void characterReferenceError(String message) {try{__CLR4_2_05j95j9lnxz22pw.R.inc(7354);
        __CLR4_2_05j95j9lnxz22pw.R.inc(7355);if ((((errors.canAddError())&&(__CLR4_2_05j95j9lnxz22pw.R.iget(7356)!=0|true))||(__CLR4_2_05j95j9lnxz22pw.R.iget(7357)==0&false)))
            {__CLR4_2_05j95j9lnxz22pw.R.inc(7358);errors.add(new ParseError(reader.pos(), "Invalid character reference: %s", message));
    }}finally{__CLR4_2_05j95j9lnxz22pw.R.flushNeeded();}}

    void error(String errorMsg) {try{__CLR4_2_05j95j9lnxz22pw.R.inc(7359);
        __CLR4_2_05j95j9lnxz22pw.R.inc(7360);if ((((errors.canAddError())&&(__CLR4_2_05j95j9lnxz22pw.R.iget(7361)!=0|true))||(__CLR4_2_05j95j9lnxz22pw.R.iget(7362)==0&false)))
            {__CLR4_2_05j95j9lnxz22pw.R.inc(7363);errors.add(new ParseError(reader.pos(), errorMsg));
    }}finally{__CLR4_2_05j95j9lnxz22pw.R.flushNeeded();}}

    boolean currentNodeInHtmlNS() {try{__CLR4_2_05j95j9lnxz22pw.R.inc(7364);
        // todo: implement namespaces correctly
        __CLR4_2_05j95j9lnxz22pw.R.inc(7365);return true;
        // Element currentNode = currentNode();
        // return currentNode != null && currentNode.namespace().equals("HTML");
    }finally{__CLR4_2_05j95j9lnxz22pw.R.flushNeeded();}}

    /**
     * Utility method to consume reader and unescape entities found within.
     * @param inAttribute if the text to be unescaped is in an attribute
     * @return unescaped string from reader
     */
    String unescapeEntities(boolean inAttribute) {try{__CLR4_2_05j95j9lnxz22pw.R.inc(7366);
        __CLR4_2_05j95j9lnxz22pw.R.inc(7367);StringBuilder builder = StringUtil.borrowBuilder();
        __CLR4_2_05j95j9lnxz22pw.R.inc(7368);while ((((!reader.isEmpty())&&(__CLR4_2_05j95j9lnxz22pw.R.iget(7369)!=0|true))||(__CLR4_2_05j95j9lnxz22pw.R.iget(7370)==0&false))) {{
            __CLR4_2_05j95j9lnxz22pw.R.inc(7371);builder.append(reader.consumeTo('&'));
            __CLR4_2_05j95j9lnxz22pw.R.inc(7372);if ((((reader.matches('&'))&&(__CLR4_2_05j95j9lnxz22pw.R.iget(7373)!=0|true))||(__CLR4_2_05j95j9lnxz22pw.R.iget(7374)==0&false))) {{
                __CLR4_2_05j95j9lnxz22pw.R.inc(7375);reader.consume();
                __CLR4_2_05j95j9lnxz22pw.R.inc(7376);int[] c = consumeCharacterReference(null, inAttribute);
                __CLR4_2_05j95j9lnxz22pw.R.inc(7377);if ((((c == null || c.length==0)&&(__CLR4_2_05j95j9lnxz22pw.R.iget(7378)!=0|true))||(__CLR4_2_05j95j9lnxz22pw.R.iget(7379)==0&false)))
                    {__CLR4_2_05j95j9lnxz22pw.R.inc(7380);builder.append('&');
                }else {{
                    __CLR4_2_05j95j9lnxz22pw.R.inc(7381);builder.appendCodePoint(c[0]);
                    __CLR4_2_05j95j9lnxz22pw.R.inc(7382);if ((((c.length == 2)&&(__CLR4_2_05j95j9lnxz22pw.R.iget(7383)!=0|true))||(__CLR4_2_05j95j9lnxz22pw.R.iget(7384)==0&false)))
                        {__CLR4_2_05j95j9lnxz22pw.R.inc(7385);builder.appendCodePoint(c[1]);
                }}

            }}
        }}
        }__CLR4_2_05j95j9lnxz22pw.R.inc(7386);return StringUtil.releaseBuilder(builder);
    }finally{__CLR4_2_05j95j9lnxz22pw.R.flushNeeded();}}
}
