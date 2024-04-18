/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attributes;

import static org.jsoup.internal.Normalizer.lowerCase;

/**
 * Parse tokens for the Tokeniser.
 */
abstract class Token {public static class __CLR4_2_0570570lnxz22pe{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,6937,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    TokenType type;

    private Token() {try{__CLR4_2_0570570lnxz22pe.R.inc(6732);
    }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}
    
    String tokenType() {try{__CLR4_2_0570570lnxz22pe.R.inc(6733);
        __CLR4_2_0570570lnxz22pe.R.inc(6734);return this.getClass().getSimpleName();
    }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

    /**
     * Reset the data represent by this token, for reuse. Prevents the need to create transfer objects for every
     * piece of data, which immediately get GCed.
     */
    abstract Token reset();

    static void reset(StringBuilder sb) {try{__CLR4_2_0570570lnxz22pe.R.inc(6735);
        __CLR4_2_0570570lnxz22pe.R.inc(6736);if ((((sb != null)&&(__CLR4_2_0570570lnxz22pe.R.iget(6737)!=0|true))||(__CLR4_2_0570570lnxz22pe.R.iget(6738)==0&false))) {{
            __CLR4_2_0570570lnxz22pe.R.inc(6739);sb.delete(0, sb.length());
        }
    }}finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

    static final class Doctype extends Token {
        final StringBuilder name = new StringBuilder();
        String pubSysKey = null;
        final StringBuilder publicIdentifier = new StringBuilder();
        final StringBuilder systemIdentifier = new StringBuilder();
        boolean forceQuirks = false;

        Doctype() {try{__CLR4_2_0570570lnxz22pe.R.inc(6740);
            __CLR4_2_0570570lnxz22pe.R.inc(6741);type = TokenType.Doctype;
        }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

        @Override
        Token reset() {try{__CLR4_2_0570570lnxz22pe.R.inc(6742);
            __CLR4_2_0570570lnxz22pe.R.inc(6743);reset(name);
            __CLR4_2_0570570lnxz22pe.R.inc(6744);pubSysKey = null;
            __CLR4_2_0570570lnxz22pe.R.inc(6745);reset(publicIdentifier);
            __CLR4_2_0570570lnxz22pe.R.inc(6746);reset(systemIdentifier);
            __CLR4_2_0570570lnxz22pe.R.inc(6747);forceQuirks = false;
            __CLR4_2_0570570lnxz22pe.R.inc(6748);return this;
        }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

        String getName() {try{__CLR4_2_0570570lnxz22pe.R.inc(6749);
            __CLR4_2_0570570lnxz22pe.R.inc(6750);return name.toString();
        }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

        String getPubSysKey() {try{__CLR4_2_0570570lnxz22pe.R.inc(6751);
            __CLR4_2_0570570lnxz22pe.R.inc(6752);return pubSysKey;
        }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

        String getPublicIdentifier() {try{__CLR4_2_0570570lnxz22pe.R.inc(6753);
            __CLR4_2_0570570lnxz22pe.R.inc(6754);return publicIdentifier.toString();
        }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

        public String getSystemIdentifier() {try{__CLR4_2_0570570lnxz22pe.R.inc(6755);
            __CLR4_2_0570570lnxz22pe.R.inc(6756);return systemIdentifier.toString();
        }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

        public boolean isForceQuirks() {try{__CLR4_2_0570570lnxz22pe.R.inc(6757);
            __CLR4_2_0570570lnxz22pe.R.inc(6758);return forceQuirks;
        }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}
    }

    static abstract class Tag extends Token {
        protected String tagName;
        protected String normalName; // lc version of tag name, for case insensitive tree build
        private String pendingAttributeName; // attribute names are generally caught in one hop, not accumulated
        private StringBuilder pendingAttributeValue = new StringBuilder(); // but values are accumulated, from e.g. & in hrefs
        private String pendingAttributeValueS; // try to get attr vals in one shot, vs Builder
        private boolean hasEmptyAttributeValue = false; // distinguish boolean attribute from empty string value
        private boolean hasPendingAttributeValue = false;
        boolean selfClosing = false;
        Attributes attributes; // start tags get attributes on construction. End tags get attributes on first new attribute (but only for parser convenience, not used).

        @Override
        Tag reset() {try{__CLR4_2_0570570lnxz22pe.R.inc(6759);
            __CLR4_2_0570570lnxz22pe.R.inc(6760);tagName = null;
            __CLR4_2_0570570lnxz22pe.R.inc(6761);normalName = null;
            __CLR4_2_0570570lnxz22pe.R.inc(6762);pendingAttributeName = null;
            __CLR4_2_0570570lnxz22pe.R.inc(6763);reset(pendingAttributeValue);
            __CLR4_2_0570570lnxz22pe.R.inc(6764);pendingAttributeValueS = null;
            __CLR4_2_0570570lnxz22pe.R.inc(6765);hasEmptyAttributeValue = false;
            __CLR4_2_0570570lnxz22pe.R.inc(6766);hasPendingAttributeValue = false;
            __CLR4_2_0570570lnxz22pe.R.inc(6767);selfClosing = false;
            __CLR4_2_0570570lnxz22pe.R.inc(6768);attributes = null;
            __CLR4_2_0570570lnxz22pe.R.inc(6769);return this;
        }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

        final void newAttribute() {try{__CLR4_2_0570570lnxz22pe.R.inc(6770);
            __CLR4_2_0570570lnxz22pe.R.inc(6771);if ((((attributes == null)&&(__CLR4_2_0570570lnxz22pe.R.iget(6772)!=0|true))||(__CLR4_2_0570570lnxz22pe.R.iget(6773)==0&false)))
                {__CLR4_2_0570570lnxz22pe.R.inc(6774);attributes = new Attributes();

            }__CLR4_2_0570570lnxz22pe.R.inc(6775);if ((((pendingAttributeName != null)&&(__CLR4_2_0570570lnxz22pe.R.iget(6776)!=0|true))||(__CLR4_2_0570570lnxz22pe.R.iget(6777)==0&false))) {{
                // the tokeniser has skipped whitespace control chars, but trimming could collapse to empty for other control codes, so verify here
                __CLR4_2_0570570lnxz22pe.R.inc(6778);pendingAttributeName = pendingAttributeName.trim();
                __CLR4_2_0570570lnxz22pe.R.inc(6779);if ((((pendingAttributeName.length() > 0)&&(__CLR4_2_0570570lnxz22pe.R.iget(6780)!=0|true))||(__CLR4_2_0570570lnxz22pe.R.iget(6781)==0&false))) {{
                    __CLR4_2_0570570lnxz22pe.R.inc(6782);String value;
                    __CLR4_2_0570570lnxz22pe.R.inc(6783);if ((((hasPendingAttributeValue)&&(__CLR4_2_0570570lnxz22pe.R.iget(6784)!=0|true))||(__CLR4_2_0570570lnxz22pe.R.iget(6785)==0&false)))
                        {__CLR4_2_0570570lnxz22pe.R.inc(6786);value = (((pendingAttributeValue.length() > 0 )&&(__CLR4_2_0570570lnxz22pe.R.iget(6787)!=0|true))||(__CLR4_2_0570570lnxz22pe.R.iget(6788)==0&false))? pendingAttributeValue.toString() : pendingAttributeValueS;
                    }else {__CLR4_2_0570570lnxz22pe.R.inc(6789);if ((((hasEmptyAttributeValue)&&(__CLR4_2_0570570lnxz22pe.R.iget(6790)!=0|true))||(__CLR4_2_0570570lnxz22pe.R.iget(6791)==0&false)))
                        {__CLR4_2_0570570lnxz22pe.R.inc(6792);value = "";
                    }else
                        {__CLR4_2_0570570lnxz22pe.R.inc(6793);value = null;
                    // note that we add, not put. So that the first is kept, and rest are deduped, once in a context where case sensitivity is known (the appropriate tree builder).
                    }}__CLR4_2_0570570lnxz22pe.R.inc(6794);attributes.add(pendingAttributeName, value);
                }
            }}
            }__CLR4_2_0570570lnxz22pe.R.inc(6795);pendingAttributeName = null;
            __CLR4_2_0570570lnxz22pe.R.inc(6796);hasEmptyAttributeValue = false;
            __CLR4_2_0570570lnxz22pe.R.inc(6797);hasPendingAttributeValue = false;
            __CLR4_2_0570570lnxz22pe.R.inc(6798);reset(pendingAttributeValue);
            __CLR4_2_0570570lnxz22pe.R.inc(6799);pendingAttributeValueS = null;
        }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

        final void finaliseTag() {try{__CLR4_2_0570570lnxz22pe.R.inc(6800);
            // finalises for emit
            __CLR4_2_0570570lnxz22pe.R.inc(6801);if ((((pendingAttributeName != null)&&(__CLR4_2_0570570lnxz22pe.R.iget(6802)!=0|true))||(__CLR4_2_0570570lnxz22pe.R.iget(6803)==0&false))) {{
                __CLR4_2_0570570lnxz22pe.R.inc(6804);newAttribute();
            }
        }}finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

        /** Preserves case */
        final String name() {try{__CLR4_2_0570570lnxz22pe.R.inc(6805); // preserves case, for input into Tag.valueOf (which may drop case)
            __CLR4_2_0570570lnxz22pe.R.inc(6806);Validate.isFalse(tagName == null || tagName.length() == 0);
            __CLR4_2_0570570lnxz22pe.R.inc(6807);return tagName;
        }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

        /** Lower case */
        final String normalName() {try{__CLR4_2_0570570lnxz22pe.R.inc(6808); // lower case, used in tree building for working out where in tree it should go
            __CLR4_2_0570570lnxz22pe.R.inc(6809);return normalName;
        }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

        final Tag name(String name) {try{__CLR4_2_0570570lnxz22pe.R.inc(6810);
            __CLR4_2_0570570lnxz22pe.R.inc(6811);tagName = name;
            __CLR4_2_0570570lnxz22pe.R.inc(6812);normalName = lowerCase(name);
            __CLR4_2_0570570lnxz22pe.R.inc(6813);return this;
        }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

        final boolean isSelfClosing() {try{__CLR4_2_0570570lnxz22pe.R.inc(6814);
            __CLR4_2_0570570lnxz22pe.R.inc(6815);return selfClosing;
        }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

        @SuppressWarnings({"TypeMayBeWeakened"})
        final Attributes getAttributes() {try{__CLR4_2_0570570lnxz22pe.R.inc(6816);
            __CLR4_2_0570570lnxz22pe.R.inc(6817);return attributes;
        }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

        // these appenders are rarely hit in not null state-- caused by null chars.
        final void appendTagName(String append) {try{__CLR4_2_0570570lnxz22pe.R.inc(6818);
            __CLR4_2_0570570lnxz22pe.R.inc(6819);tagName = (((tagName == null )&&(__CLR4_2_0570570lnxz22pe.R.iget(6820)!=0|true))||(__CLR4_2_0570570lnxz22pe.R.iget(6821)==0&false))? append : tagName.concat(append);
            __CLR4_2_0570570lnxz22pe.R.inc(6822);normalName = lowerCase(tagName);
        }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

        final void appendTagName(char append) {try{__CLR4_2_0570570lnxz22pe.R.inc(6823);
            __CLR4_2_0570570lnxz22pe.R.inc(6824);appendTagName(String.valueOf(append));
        }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

        final void appendAttributeName(String append) {try{__CLR4_2_0570570lnxz22pe.R.inc(6825);
            __CLR4_2_0570570lnxz22pe.R.inc(6826);pendingAttributeName = (((pendingAttributeName == null )&&(__CLR4_2_0570570lnxz22pe.R.iget(6827)!=0|true))||(__CLR4_2_0570570lnxz22pe.R.iget(6828)==0&false))? append : pendingAttributeName.concat(append);
        }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

        final void appendAttributeName(char append) {try{__CLR4_2_0570570lnxz22pe.R.inc(6829);
            __CLR4_2_0570570lnxz22pe.R.inc(6830);appendAttributeName(String.valueOf(append));
        }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

        final void appendAttributeValue(String append) {try{__CLR4_2_0570570lnxz22pe.R.inc(6831);
            __CLR4_2_0570570lnxz22pe.R.inc(6832);ensureAttributeValue();
            __CLR4_2_0570570lnxz22pe.R.inc(6833);if ((((pendingAttributeValue.length() == 0)&&(__CLR4_2_0570570lnxz22pe.R.iget(6834)!=0|true))||(__CLR4_2_0570570lnxz22pe.R.iget(6835)==0&false))) {{
                __CLR4_2_0570570lnxz22pe.R.inc(6836);pendingAttributeValueS = append;
            } }else {{
                __CLR4_2_0570570lnxz22pe.R.inc(6837);pendingAttributeValue.append(append);
            }
        }}finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

        final void appendAttributeValue(char append) {try{__CLR4_2_0570570lnxz22pe.R.inc(6838);
            __CLR4_2_0570570lnxz22pe.R.inc(6839);ensureAttributeValue();
            __CLR4_2_0570570lnxz22pe.R.inc(6840);pendingAttributeValue.append(append);
        }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

        final void appendAttributeValue(char[] append) {try{__CLR4_2_0570570lnxz22pe.R.inc(6841);
            __CLR4_2_0570570lnxz22pe.R.inc(6842);ensureAttributeValue();
            __CLR4_2_0570570lnxz22pe.R.inc(6843);pendingAttributeValue.append(append);
        }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

        final void appendAttributeValue(int[] appendCodepoints) {try{__CLR4_2_0570570lnxz22pe.R.inc(6844);
            __CLR4_2_0570570lnxz22pe.R.inc(6845);ensureAttributeValue();
            __CLR4_2_0570570lnxz22pe.R.inc(6846);for (int codepoint : appendCodepoints) {{
                __CLR4_2_0570570lnxz22pe.R.inc(6847);pendingAttributeValue.appendCodePoint(codepoint);
            }
        }}finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}
        
        final void setEmptyAttributeValue() {try{__CLR4_2_0570570lnxz22pe.R.inc(6848);
            __CLR4_2_0570570lnxz22pe.R.inc(6849);hasEmptyAttributeValue = true;
        }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

        private void ensureAttributeValue() {try{__CLR4_2_0570570lnxz22pe.R.inc(6850);
            __CLR4_2_0570570lnxz22pe.R.inc(6851);hasPendingAttributeValue = true;
            // if on second hit, we'll need to move to the builder
            __CLR4_2_0570570lnxz22pe.R.inc(6852);if ((((pendingAttributeValueS != null)&&(__CLR4_2_0570570lnxz22pe.R.iget(6853)!=0|true))||(__CLR4_2_0570570lnxz22pe.R.iget(6854)==0&false))) {{
                __CLR4_2_0570570lnxz22pe.R.inc(6855);pendingAttributeValue.append(pendingAttributeValueS);
                __CLR4_2_0570570lnxz22pe.R.inc(6856);pendingAttributeValueS = null;
            }
        }}finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}
    }

    final static class StartTag extends Tag {
        StartTag() {
            super();__CLR4_2_0570570lnxz22pe.R.inc(6858);try{__CLR4_2_0570570lnxz22pe.R.inc(6857);
            __CLR4_2_0570570lnxz22pe.R.inc(6859);attributes = new Attributes();
            __CLR4_2_0570570lnxz22pe.R.inc(6860);type = TokenType.StartTag;
        }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

        @Override
        Tag reset() {try{__CLR4_2_0570570lnxz22pe.R.inc(6861);
            __CLR4_2_0570570lnxz22pe.R.inc(6862);super.reset();
            __CLR4_2_0570570lnxz22pe.R.inc(6863);attributes = new Attributes();
            // todo - would prefer these to be null, but need to check Element assertions
            __CLR4_2_0570570lnxz22pe.R.inc(6864);return this;
        }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

        StartTag nameAttr(String name, Attributes attributes) {try{__CLR4_2_0570570lnxz22pe.R.inc(6865);
            __CLR4_2_0570570lnxz22pe.R.inc(6866);this.tagName = name;
            __CLR4_2_0570570lnxz22pe.R.inc(6867);this.attributes = attributes;
            __CLR4_2_0570570lnxz22pe.R.inc(6868);normalName = lowerCase(tagName);
            __CLR4_2_0570570lnxz22pe.R.inc(6869);return this;
        }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_0570570lnxz22pe.R.inc(6870);
            __CLR4_2_0570570lnxz22pe.R.inc(6871);if ((((attributes != null && attributes.size() > 0)&&(__CLR4_2_0570570lnxz22pe.R.iget(6872)!=0|true))||(__CLR4_2_0570570lnxz22pe.R.iget(6873)==0&false)))
                {__CLR4_2_0570570lnxz22pe.R.inc(6874);return "<" + name() + " " + attributes.toString() + ">";
            }else
                {__CLR4_2_0570570lnxz22pe.R.inc(6875);return "<" + name() + ">";
        }}finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}
    }

    final static class EndTag extends Tag{
        EndTag() {
            super();__CLR4_2_0570570lnxz22pe.R.inc(6877);try{__CLR4_2_0570570lnxz22pe.R.inc(6876);
            __CLR4_2_0570570lnxz22pe.R.inc(6878);type = TokenType.EndTag;
        }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_0570570lnxz22pe.R.inc(6879);
            __CLR4_2_0570570lnxz22pe.R.inc(6880);return "</" + name() + ">";
        }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}
    }

    final static class Comment extends Token {
        final StringBuilder data = new StringBuilder();
        boolean bogus = false;

        @Override
        Token reset() {try{__CLR4_2_0570570lnxz22pe.R.inc(6881);
            __CLR4_2_0570570lnxz22pe.R.inc(6882);reset(data);
            __CLR4_2_0570570lnxz22pe.R.inc(6883);bogus = false;
            __CLR4_2_0570570lnxz22pe.R.inc(6884);return this;
        }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

        Comment() {try{__CLR4_2_0570570lnxz22pe.R.inc(6885);
            __CLR4_2_0570570lnxz22pe.R.inc(6886);type = TokenType.Comment;
        }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

        String getData() {try{__CLR4_2_0570570lnxz22pe.R.inc(6887);
            __CLR4_2_0570570lnxz22pe.R.inc(6888);return data.toString();
        }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_0570570lnxz22pe.R.inc(6889);
            __CLR4_2_0570570lnxz22pe.R.inc(6890);return "<!--" + getData() + "-->";
        }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}
    }

    static class Character extends Token {
        private String data;

        Character() {
            super();__CLR4_2_0570570lnxz22pe.R.inc(6892);try{__CLR4_2_0570570lnxz22pe.R.inc(6891);
            __CLR4_2_0570570lnxz22pe.R.inc(6893);type = TokenType.Character;
        }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

        @Override
        Token reset() {try{__CLR4_2_0570570lnxz22pe.R.inc(6894);
            __CLR4_2_0570570lnxz22pe.R.inc(6895);data = null;
            __CLR4_2_0570570lnxz22pe.R.inc(6896);return this;
        }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

        Character data(String data) {try{__CLR4_2_0570570lnxz22pe.R.inc(6897);
            __CLR4_2_0570570lnxz22pe.R.inc(6898);this.data = data;
            __CLR4_2_0570570lnxz22pe.R.inc(6899);return this;
        }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

        String getData() {try{__CLR4_2_0570570lnxz22pe.R.inc(6900);
            __CLR4_2_0570570lnxz22pe.R.inc(6901);return data;
        }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_0570570lnxz22pe.R.inc(6902);
            __CLR4_2_0570570lnxz22pe.R.inc(6903);return getData();
        }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}
    }

    final static class CData extends Character {
        CData(String data) {
            super();__CLR4_2_0570570lnxz22pe.R.inc(6905);try{__CLR4_2_0570570lnxz22pe.R.inc(6904);
            __CLR4_2_0570570lnxz22pe.R.inc(6906);this.data(data);
        }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_0570570lnxz22pe.R.inc(6907);
            __CLR4_2_0570570lnxz22pe.R.inc(6908);return "<![CDATA[" + getData() + "]]>";
        }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

    }

    final static class EOF extends Token {
        EOF() {try{__CLR4_2_0570570lnxz22pe.R.inc(6909);
            __CLR4_2_0570570lnxz22pe.R.inc(6910);type = Token.TokenType.EOF;
        }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

        @Override
        Token reset() {try{__CLR4_2_0570570lnxz22pe.R.inc(6911);
            __CLR4_2_0570570lnxz22pe.R.inc(6912);return this;
        }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}
    }

    final boolean isDoctype() {try{__CLR4_2_0570570lnxz22pe.R.inc(6913);
        __CLR4_2_0570570lnxz22pe.R.inc(6914);return type == TokenType.Doctype;
    }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

    final Doctype asDoctype() {try{__CLR4_2_0570570lnxz22pe.R.inc(6915);
        __CLR4_2_0570570lnxz22pe.R.inc(6916);return (Doctype) this;
    }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

    final boolean isStartTag() {try{__CLR4_2_0570570lnxz22pe.R.inc(6917);
        __CLR4_2_0570570lnxz22pe.R.inc(6918);return type == TokenType.StartTag;
    }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

    final StartTag asStartTag() {try{__CLR4_2_0570570lnxz22pe.R.inc(6919);
        __CLR4_2_0570570lnxz22pe.R.inc(6920);return (StartTag) this;
    }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

    final boolean isEndTag() {try{__CLR4_2_0570570lnxz22pe.R.inc(6921);
        __CLR4_2_0570570lnxz22pe.R.inc(6922);return type == TokenType.EndTag;
    }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

    final EndTag asEndTag() {try{__CLR4_2_0570570lnxz22pe.R.inc(6923);
        __CLR4_2_0570570lnxz22pe.R.inc(6924);return (EndTag) this;
    }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

    final boolean isComment() {try{__CLR4_2_0570570lnxz22pe.R.inc(6925);
        __CLR4_2_0570570lnxz22pe.R.inc(6926);return type == TokenType.Comment;
    }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

    final Comment asComment() {try{__CLR4_2_0570570lnxz22pe.R.inc(6927);
        __CLR4_2_0570570lnxz22pe.R.inc(6928);return (Comment) this;
    }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

    final boolean isCharacter() {try{__CLR4_2_0570570lnxz22pe.R.inc(6929);
        __CLR4_2_0570570lnxz22pe.R.inc(6930);return type == TokenType.Character;
    }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

    final boolean isCData() {try{__CLR4_2_0570570lnxz22pe.R.inc(6931);
        __CLR4_2_0570570lnxz22pe.R.inc(6932);return this instanceof CData;
    }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

    final Character asCharacter() {try{__CLR4_2_0570570lnxz22pe.R.inc(6933);
        __CLR4_2_0570570lnxz22pe.R.inc(6934);return (Character) this;
    }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

    final boolean isEOF() {try{__CLR4_2_0570570lnxz22pe.R.inc(6935);
        __CLR4_2_0570570lnxz22pe.R.inc(6936);return type == TokenType.EOF;
    }finally{__CLR4_2_0570570lnxz22pe.R.flushNeeded();}}

    public enum TokenType {
        Doctype,
        StartTag,
        EndTag,
        Comment,
        Character, // note no CData - treated in builder as an extension of Character
        EOF
    }
}
