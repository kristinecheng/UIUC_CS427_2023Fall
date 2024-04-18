/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.parser;

import org.jsoup.nodes.DocumentType;

/**
 * States and transition activations for the Tokeniser.
 */
@java.lang.SuppressWarnings({"fallthrough"}) enum TokeniserState {
    Data {
        // in data state, gather characters until a character reference or tag is found
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(7387);
            boolean __CLB4_2_0_bool0=false;__CLR4_2_05p75p7lnxz22qp.R.inc(7388);switch (r.current()) {
                case '&':if (!__CLB4_2_0_bool0) {__CLR4_2_05p75p7lnxz22qp.R.inc(7389);__CLB4_2_0_bool0=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7390);t.advanceTransition(CharacterReferenceInData);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7391);break;
                case '<':if (!__CLB4_2_0_bool0) {__CLR4_2_05p75p7lnxz22qp.R.inc(7392);__CLB4_2_0_bool0=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7393);t.advanceTransition(TagOpen);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7394);break;
                case nullChar:if (!__CLB4_2_0_bool0) {__CLR4_2_05p75p7lnxz22qp.R.inc(7395);__CLB4_2_0_bool0=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7396);t.error(this); // NOT replacement character (oddly?)
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7397);t.emit(r.consume());
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7398);break;
                case eof:if (!__CLB4_2_0_bool0) {__CLR4_2_05p75p7lnxz22qp.R.inc(7399);__CLB4_2_0_bool0=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7400);t.emit(new Token.EOF());
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7401);break;
                default:if (!__CLB4_2_0_bool0) {__CLR4_2_05p75p7lnxz22qp.R.inc(7402);__CLB4_2_0_bool0=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7403);String data = r.consumeData();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7404);t.emit(data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7405);break;
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    CharacterReferenceInData {
        // from & in data
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(7406);
            __CLR4_2_05p75p7lnxz22qp.R.inc(7407);readCharRef(t, Data);
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    Rcdata {
        /// handles data in title, textarea etc
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(7408);
            boolean __CLB4_2_0_bool1=false;__CLR4_2_05p75p7lnxz22qp.R.inc(7409);switch (r.current()) {
                case '&':if (!__CLB4_2_0_bool1) {__CLR4_2_05p75p7lnxz22qp.R.inc(7410);__CLB4_2_0_bool1=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7411);t.advanceTransition(CharacterReferenceInRcdata);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7412);break;
                case '<':if (!__CLB4_2_0_bool1) {__CLR4_2_05p75p7lnxz22qp.R.inc(7413);__CLB4_2_0_bool1=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7414);t.advanceTransition(RcdataLessthanSign);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7415);break;
                case nullChar:if (!__CLB4_2_0_bool1) {__CLR4_2_05p75p7lnxz22qp.R.inc(7416);__CLB4_2_0_bool1=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7417);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7418);r.advance();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7419);t.emit(replacementChar);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7420);break;
                case eof:if (!__CLB4_2_0_bool1) {__CLR4_2_05p75p7lnxz22qp.R.inc(7421);__CLB4_2_0_bool1=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7422);t.emit(new Token.EOF());
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7423);break;
                default:if (!__CLB4_2_0_bool1) {__CLR4_2_05p75p7lnxz22qp.R.inc(7424);__CLB4_2_0_bool1=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7425);String data = r.consumeToAny('&', '<', nullChar);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7426);t.emit(data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7427);break;
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    CharacterReferenceInRcdata {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(7428);
            __CLR4_2_05p75p7lnxz22qp.R.inc(7429);readCharRef(t, Rcdata);
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    Rawtext {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(7430);
            __CLR4_2_05p75p7lnxz22qp.R.inc(7431);readData(t, r, this, RawtextLessthanSign);
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    ScriptData {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(7432);
            __CLR4_2_05p75p7lnxz22qp.R.inc(7433);readData(t, r, this, ScriptDataLessthanSign);
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    PLAINTEXT {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(7434);
            boolean __CLB4_2_0_bool2=false;__CLR4_2_05p75p7lnxz22qp.R.inc(7435);switch (r.current()) {
                case nullChar:if (!__CLB4_2_0_bool2) {__CLR4_2_05p75p7lnxz22qp.R.inc(7436);__CLB4_2_0_bool2=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7437);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7438);r.advance();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7439);t.emit(replacementChar);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7440);break;
                case eof:if (!__CLB4_2_0_bool2) {__CLR4_2_05p75p7lnxz22qp.R.inc(7441);__CLB4_2_0_bool2=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7442);t.emit(new Token.EOF());
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7443);break;
                default:if (!__CLB4_2_0_bool2) {__CLR4_2_05p75p7lnxz22qp.R.inc(7444);__CLB4_2_0_bool2=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7445);String data = r.consumeTo(nullChar);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7446);t.emit(data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7447);break;
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    TagOpen {
        // from < in data
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(7448);
            boolean __CLB4_2_0_bool3=false;__CLR4_2_05p75p7lnxz22qp.R.inc(7449);switch (r.current()) {
                case '!':if (!__CLB4_2_0_bool3) {__CLR4_2_05p75p7lnxz22qp.R.inc(7450);__CLB4_2_0_bool3=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7451);t.advanceTransition(MarkupDeclarationOpen);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7452);break;
                case '/':if (!__CLB4_2_0_bool3) {__CLR4_2_05p75p7lnxz22qp.R.inc(7453);__CLB4_2_0_bool3=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7454);t.advanceTransition(EndTagOpen);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7455);break;
                case '?':if (!__CLB4_2_0_bool3) {__CLR4_2_05p75p7lnxz22qp.R.inc(7456);__CLB4_2_0_bool3=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7457);t.advanceTransition(BogusComment);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7458);break;
                default:if (!__CLB4_2_0_bool3) {__CLR4_2_05p75p7lnxz22qp.R.inc(7459);__CLB4_2_0_bool3=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7460);if ((((r.matchesLetter())&&(__CLR4_2_05p75p7lnxz22qp.R.iget(7461)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(7462)==0&false))) {{
                        __CLR4_2_05p75p7lnxz22qp.R.inc(7463);t.createTagPending(true);
                        __CLR4_2_05p75p7lnxz22qp.R.inc(7464);t.transition(TagName);
                    } }else {{
                        __CLR4_2_05p75p7lnxz22qp.R.inc(7465);t.error(this);
                        __CLR4_2_05p75p7lnxz22qp.R.inc(7466);t.emit('<'); // char that got us here
                        __CLR4_2_05p75p7lnxz22qp.R.inc(7467);t.transition(Data);
                    }
                    }__CLR4_2_05p75p7lnxz22qp.R.inc(7468);break;
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    EndTagOpen {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(7469);
            __CLR4_2_05p75p7lnxz22qp.R.inc(7470);if ((((r.isEmpty())&&(__CLR4_2_05p75p7lnxz22qp.R.iget(7471)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(7472)==0&false))) {{
                __CLR4_2_05p75p7lnxz22qp.R.inc(7473);t.eofError(this);
                __CLR4_2_05p75p7lnxz22qp.R.inc(7474);t.emit("</");
                __CLR4_2_05p75p7lnxz22qp.R.inc(7475);t.transition(Data);
            } }else {__CLR4_2_05p75p7lnxz22qp.R.inc(7476);if ((((r.matchesLetter())&&(__CLR4_2_05p75p7lnxz22qp.R.iget(7477)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(7478)==0&false))) {{
                __CLR4_2_05p75p7lnxz22qp.R.inc(7479);t.createTagPending(false);
                __CLR4_2_05p75p7lnxz22qp.R.inc(7480);t.transition(TagName);
            } }else {__CLR4_2_05p75p7lnxz22qp.R.inc(7481);if ((((r.matches('>'))&&(__CLR4_2_05p75p7lnxz22qp.R.iget(7482)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(7483)==0&false))) {{
                __CLR4_2_05p75p7lnxz22qp.R.inc(7484);t.error(this);
                __CLR4_2_05p75p7lnxz22qp.R.inc(7485);t.advanceTransition(Data);
            } }else {{
                __CLR4_2_05p75p7lnxz22qp.R.inc(7486);t.error(this);
                __CLR4_2_05p75p7lnxz22qp.R.inc(7487);t.advanceTransition(BogusComment);
            }
        }}}}finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    TagName {
        // from < or </ in data, will have start or end tag pending
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(7488);
            // previous TagOpen state did NOT consume, will have a letter char in current
            //String tagName = r.consumeToAnySorted(tagCharsSorted).toLowerCase();
            __CLR4_2_05p75p7lnxz22qp.R.inc(7489);String tagName = r.consumeTagName();
            __CLR4_2_05p75p7lnxz22qp.R.inc(7490);t.tagPending.appendTagName(tagName);

            __CLR4_2_05p75p7lnxz22qp.R.inc(7491);char c = r.consume();
            boolean __CLB4_2_0_bool4=false;__CLR4_2_05p75p7lnxz22qp.R.inc(7492);switch (c) {
                case '\t':if (!__CLB4_2_0_bool4) {__CLR4_2_05p75p7lnxz22qp.R.inc(7493);__CLB4_2_0_bool4=true;}
                case '\n':if (!__CLB4_2_0_bool4) {__CLR4_2_05p75p7lnxz22qp.R.inc(7494);__CLB4_2_0_bool4=true;}
                case '\r':if (!__CLB4_2_0_bool4) {__CLR4_2_05p75p7lnxz22qp.R.inc(7495);__CLB4_2_0_bool4=true;}
                case '\f':if (!__CLB4_2_0_bool4) {__CLR4_2_05p75p7lnxz22qp.R.inc(7496);__CLB4_2_0_bool4=true;}
                case ' ':if (!__CLB4_2_0_bool4) {__CLR4_2_05p75p7lnxz22qp.R.inc(7497);__CLB4_2_0_bool4=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7498);t.transition(BeforeAttributeName);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7499);break;
                case '/':if (!__CLB4_2_0_bool4) {__CLR4_2_05p75p7lnxz22qp.R.inc(7500);__CLB4_2_0_bool4=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7501);t.transition(SelfClosingStartTag);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7502);break;
                case '<':if (!__CLB4_2_0_bool4) {__CLR4_2_05p75p7lnxz22qp.R.inc(7503);__CLB4_2_0_bool4=true;} // NOTE: out of spec, but clear author intent
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7504);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7505);r.unconsume();
                    // intended fall through to next >
                case '>':if (!__CLB4_2_0_bool4) {__CLR4_2_05p75p7lnxz22qp.R.inc(7506);__CLB4_2_0_bool4=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7507);t.emitTagPending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7508);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7509);break;
                case nullChar:if (!__CLB4_2_0_bool4) {__CLR4_2_05p75p7lnxz22qp.R.inc(7510);__CLB4_2_0_bool4=true;} // replacement
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7511);t.tagPending.appendTagName(replacementStr);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7512);break;
                case eof:if (!__CLB4_2_0_bool4) {__CLR4_2_05p75p7lnxz22qp.R.inc(7513);__CLB4_2_0_bool4=true;} // should emit pending tag?
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7514);t.eofError(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7515);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7516);break;
                default:if (!__CLB4_2_0_bool4) {__CLR4_2_05p75p7lnxz22qp.R.inc(7517);__CLB4_2_0_bool4=true;} // buffer underrun
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7518);t.tagPending.appendTagName(c);
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    RcdataLessthanSign {
        // from < in rcdata
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(7519);
            __CLR4_2_05p75p7lnxz22qp.R.inc(7520);if ((((r.matches('/'))&&(__CLR4_2_05p75p7lnxz22qp.R.iget(7521)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(7522)==0&false))) {{
                __CLR4_2_05p75p7lnxz22qp.R.inc(7523);t.createTempBuffer();
                __CLR4_2_05p75p7lnxz22qp.R.inc(7524);t.advanceTransition(RCDATAEndTagOpen);
            } }else {__CLR4_2_05p75p7lnxz22qp.R.inc(7525);if ((((r.matchesLetter() && t.appropriateEndTagName() != null && !r.containsIgnoreCase("</" + t.appropriateEndTagName()))&&(__CLR4_2_05p75p7lnxz22qp.R.iget(7526)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(7527)==0&false))) {{
                // diverge from spec: got a start tag, but there's no appropriate end tag (</title>), so rather than
                // consuming to EOF; break out here
                __CLR4_2_05p75p7lnxz22qp.R.inc(7528);t.tagPending = t.createTagPending(false).name(t.appropriateEndTagName());
                __CLR4_2_05p75p7lnxz22qp.R.inc(7529);t.emitTagPending();
                __CLR4_2_05p75p7lnxz22qp.R.inc(7530);r.unconsume(); // undo "<"
                __CLR4_2_05p75p7lnxz22qp.R.inc(7531);t.transition(Data);
            } }else {{
                __CLR4_2_05p75p7lnxz22qp.R.inc(7532);t.emit("<");
                __CLR4_2_05p75p7lnxz22qp.R.inc(7533);t.transition(Rcdata);
            }
        }}}finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    RCDATAEndTagOpen {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(7534);
            __CLR4_2_05p75p7lnxz22qp.R.inc(7535);if ((((r.matchesLetter())&&(__CLR4_2_05p75p7lnxz22qp.R.iget(7536)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(7537)==0&false))) {{
                __CLR4_2_05p75p7lnxz22qp.R.inc(7538);t.createTagPending(false);
                __CLR4_2_05p75p7lnxz22qp.R.inc(7539);t.tagPending.appendTagName(r.current());
                __CLR4_2_05p75p7lnxz22qp.R.inc(7540);t.dataBuffer.append(r.current());
                __CLR4_2_05p75p7lnxz22qp.R.inc(7541);t.advanceTransition(RCDATAEndTagName);
            } }else {{
                __CLR4_2_05p75p7lnxz22qp.R.inc(7542);t.emit("</");
                __CLR4_2_05p75p7lnxz22qp.R.inc(7543);t.transition(Rcdata);
            }
        }}finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    RCDATAEndTagName {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(7544);
            __CLR4_2_05p75p7lnxz22qp.R.inc(7545);if ((((r.matchesLetter())&&(__CLR4_2_05p75p7lnxz22qp.R.iget(7546)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(7547)==0&false))) {{
                __CLR4_2_05p75p7lnxz22qp.R.inc(7548);String name = r.consumeLetterSequence();
                __CLR4_2_05p75p7lnxz22qp.R.inc(7549);t.tagPending.appendTagName(name);
                __CLR4_2_05p75p7lnxz22qp.R.inc(7550);t.dataBuffer.append(name);
                __CLR4_2_05p75p7lnxz22qp.R.inc(7551);return;
            }

            }__CLR4_2_05p75p7lnxz22qp.R.inc(7552);char c = r.consume();
            boolean __CLB4_2_0_bool5=false;__CLR4_2_05p75p7lnxz22qp.R.inc(7553);switch (c) {
                case '\t':if (!__CLB4_2_0_bool5) {__CLR4_2_05p75p7lnxz22qp.R.inc(7554);__CLB4_2_0_bool5=true;}
                case '\n':if (!__CLB4_2_0_bool5) {__CLR4_2_05p75p7lnxz22qp.R.inc(7555);__CLB4_2_0_bool5=true;}
                case '\r':if (!__CLB4_2_0_bool5) {__CLR4_2_05p75p7lnxz22qp.R.inc(7556);__CLB4_2_0_bool5=true;}
                case '\f':if (!__CLB4_2_0_bool5) {__CLR4_2_05p75p7lnxz22qp.R.inc(7557);__CLB4_2_0_bool5=true;}
                case ' ':if (!__CLB4_2_0_bool5) {__CLR4_2_05p75p7lnxz22qp.R.inc(7558);__CLB4_2_0_bool5=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7559);if ((((t.isAppropriateEndTagToken())&&(__CLR4_2_05p75p7lnxz22qp.R.iget(7560)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(7561)==0&false)))
                        {__CLR4_2_05p75p7lnxz22qp.R.inc(7562);t.transition(BeforeAttributeName);
                    }else
                        {__CLR4_2_05p75p7lnxz22qp.R.inc(7563);anythingElse(t, r);
                    }__CLR4_2_05p75p7lnxz22qp.R.inc(7564);break;
                case '/':if (!__CLB4_2_0_bool5) {__CLR4_2_05p75p7lnxz22qp.R.inc(7565);__CLB4_2_0_bool5=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7566);if ((((t.isAppropriateEndTagToken())&&(__CLR4_2_05p75p7lnxz22qp.R.iget(7567)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(7568)==0&false)))
                        {__CLR4_2_05p75p7lnxz22qp.R.inc(7569);t.transition(SelfClosingStartTag);
                    }else
                        {__CLR4_2_05p75p7lnxz22qp.R.inc(7570);anythingElse(t, r);
                    }__CLR4_2_05p75p7lnxz22qp.R.inc(7571);break;
                case '>':if (!__CLB4_2_0_bool5) {__CLR4_2_05p75p7lnxz22qp.R.inc(7572);__CLB4_2_0_bool5=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7573);if ((((t.isAppropriateEndTagToken())&&(__CLR4_2_05p75p7lnxz22qp.R.iget(7574)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(7575)==0&false))) {{
                        __CLR4_2_05p75p7lnxz22qp.R.inc(7576);t.emitTagPending();
                        __CLR4_2_05p75p7lnxz22qp.R.inc(7577);t.transition(Data);
                    }
                    }else
                        {__CLR4_2_05p75p7lnxz22qp.R.inc(7578);anythingElse(t, r);
                    }__CLR4_2_05p75p7lnxz22qp.R.inc(7579);break;
                default:if (!__CLB4_2_0_bool5) {__CLR4_2_05p75p7lnxz22qp.R.inc(7580);__CLB4_2_0_bool5=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7581);anythingElse(t, r);
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}

        private void anythingElse(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(7582);
            __CLR4_2_05p75p7lnxz22qp.R.inc(7583);t.emit("</" + t.dataBuffer.toString());
            __CLR4_2_05p75p7lnxz22qp.R.inc(7584);r.unconsume();
            __CLR4_2_05p75p7lnxz22qp.R.inc(7585);t.transition(Rcdata);
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    RawtextLessthanSign {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(7586);
            __CLR4_2_05p75p7lnxz22qp.R.inc(7587);if ((((r.matches('/'))&&(__CLR4_2_05p75p7lnxz22qp.R.iget(7588)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(7589)==0&false))) {{
                __CLR4_2_05p75p7lnxz22qp.R.inc(7590);t.createTempBuffer();
                __CLR4_2_05p75p7lnxz22qp.R.inc(7591);t.advanceTransition(RawtextEndTagOpen);
            } }else {{
                __CLR4_2_05p75p7lnxz22qp.R.inc(7592);t.emit('<');
                __CLR4_2_05p75p7lnxz22qp.R.inc(7593);t.transition(Rawtext);
            }
        }}finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    RawtextEndTagOpen {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(7594);
            __CLR4_2_05p75p7lnxz22qp.R.inc(7595);readEndTag(t, r, RawtextEndTagName, Rawtext);
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    RawtextEndTagName {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(7596);
            __CLR4_2_05p75p7lnxz22qp.R.inc(7597);handleDataEndTag(t, r, Rawtext);
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    ScriptDataLessthanSign {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(7598);
            boolean __CLB4_2_0_bool6=false;__CLR4_2_05p75p7lnxz22qp.R.inc(7599);switch (r.consume()) {
                case '/':if (!__CLB4_2_0_bool6) {__CLR4_2_05p75p7lnxz22qp.R.inc(7600);__CLB4_2_0_bool6=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7601);t.createTempBuffer();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7602);t.transition(ScriptDataEndTagOpen);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7603);break;
                case '!':if (!__CLB4_2_0_bool6) {__CLR4_2_05p75p7lnxz22qp.R.inc(7604);__CLB4_2_0_bool6=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7605);t.emit("<!");
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7606);t.transition(ScriptDataEscapeStart);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7607);break;
                default:if (!__CLB4_2_0_bool6) {__CLR4_2_05p75p7lnxz22qp.R.inc(7608);__CLB4_2_0_bool6=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7609);t.emit("<");
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7610);r.unconsume();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7611);t.transition(ScriptData);
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    ScriptDataEndTagOpen {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(7612);
            __CLR4_2_05p75p7lnxz22qp.R.inc(7613);readEndTag(t, r, ScriptDataEndTagName, ScriptData);
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    ScriptDataEndTagName {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(7614);
            __CLR4_2_05p75p7lnxz22qp.R.inc(7615);handleDataEndTag(t, r, ScriptData);
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    ScriptDataEscapeStart {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(7616);
            __CLR4_2_05p75p7lnxz22qp.R.inc(7617);if ((((r.matches('-'))&&(__CLR4_2_05p75p7lnxz22qp.R.iget(7618)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(7619)==0&false))) {{
                __CLR4_2_05p75p7lnxz22qp.R.inc(7620);t.emit('-');
                __CLR4_2_05p75p7lnxz22qp.R.inc(7621);t.advanceTransition(ScriptDataEscapeStartDash);
            } }else {{
                __CLR4_2_05p75p7lnxz22qp.R.inc(7622);t.transition(ScriptData);
            }
        }}finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    ScriptDataEscapeStartDash {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(7623);
            __CLR4_2_05p75p7lnxz22qp.R.inc(7624);if ((((r.matches('-'))&&(__CLR4_2_05p75p7lnxz22qp.R.iget(7625)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(7626)==0&false))) {{
                __CLR4_2_05p75p7lnxz22qp.R.inc(7627);t.emit('-');
                __CLR4_2_05p75p7lnxz22qp.R.inc(7628);t.advanceTransition(ScriptDataEscapedDashDash);
            } }else {{
                __CLR4_2_05p75p7lnxz22qp.R.inc(7629);t.transition(ScriptData);
            }
        }}finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    ScriptDataEscaped {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(7630);
            __CLR4_2_05p75p7lnxz22qp.R.inc(7631);if ((((r.isEmpty())&&(__CLR4_2_05p75p7lnxz22qp.R.iget(7632)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(7633)==0&false))) {{
                __CLR4_2_05p75p7lnxz22qp.R.inc(7634);t.eofError(this);
                __CLR4_2_05p75p7lnxz22qp.R.inc(7635);t.transition(Data);
                __CLR4_2_05p75p7lnxz22qp.R.inc(7636);return;
            }

            }boolean __CLB4_2_0_bool7=false;__CLR4_2_05p75p7lnxz22qp.R.inc(7637);switch (r.current()) {
                case '-':if (!__CLB4_2_0_bool7) {__CLR4_2_05p75p7lnxz22qp.R.inc(7638);__CLB4_2_0_bool7=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7639);t.emit('-');
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7640);t.advanceTransition(ScriptDataEscapedDash);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7641);break;
                case '<':if (!__CLB4_2_0_bool7) {__CLR4_2_05p75p7lnxz22qp.R.inc(7642);__CLB4_2_0_bool7=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7643);t.advanceTransition(ScriptDataEscapedLessthanSign);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7644);break;
                case nullChar:if (!__CLB4_2_0_bool7) {__CLR4_2_05p75p7lnxz22qp.R.inc(7645);__CLB4_2_0_bool7=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7646);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7647);r.advance();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7648);t.emit(replacementChar);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7649);break;
                default:if (!__CLB4_2_0_bool7) {__CLR4_2_05p75p7lnxz22qp.R.inc(7650);__CLB4_2_0_bool7=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7651);String data = r.consumeToAny('-', '<', nullChar);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7652);t.emit(data);
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    ScriptDataEscapedDash {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(7653);
            __CLR4_2_05p75p7lnxz22qp.R.inc(7654);if ((((r.isEmpty())&&(__CLR4_2_05p75p7lnxz22qp.R.iget(7655)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(7656)==0&false))) {{
                __CLR4_2_05p75p7lnxz22qp.R.inc(7657);t.eofError(this);
                __CLR4_2_05p75p7lnxz22qp.R.inc(7658);t.transition(Data);
                __CLR4_2_05p75p7lnxz22qp.R.inc(7659);return;
            }

            }__CLR4_2_05p75p7lnxz22qp.R.inc(7660);char c = r.consume();
            boolean __CLB4_2_0_bool8=false;__CLR4_2_05p75p7lnxz22qp.R.inc(7661);switch (c) {
                case '-':if (!__CLB4_2_0_bool8) {__CLR4_2_05p75p7lnxz22qp.R.inc(7662);__CLB4_2_0_bool8=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7663);t.emit(c);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7664);t.transition(ScriptDataEscapedDashDash);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7665);break;
                case '<':if (!__CLB4_2_0_bool8) {__CLR4_2_05p75p7lnxz22qp.R.inc(7666);__CLB4_2_0_bool8=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7667);t.transition(ScriptDataEscapedLessthanSign);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7668);break;
                case nullChar:if (!__CLB4_2_0_bool8) {__CLR4_2_05p75p7lnxz22qp.R.inc(7669);__CLB4_2_0_bool8=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7670);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7671);t.emit(replacementChar);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7672);t.transition(ScriptDataEscaped);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7673);break;
                default:if (!__CLB4_2_0_bool8) {__CLR4_2_05p75p7lnxz22qp.R.inc(7674);__CLB4_2_0_bool8=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7675);t.emit(c);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7676);t.transition(ScriptDataEscaped);
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    ScriptDataEscapedDashDash {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(7677);
            __CLR4_2_05p75p7lnxz22qp.R.inc(7678);if ((((r.isEmpty())&&(__CLR4_2_05p75p7lnxz22qp.R.iget(7679)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(7680)==0&false))) {{
                __CLR4_2_05p75p7lnxz22qp.R.inc(7681);t.eofError(this);
                __CLR4_2_05p75p7lnxz22qp.R.inc(7682);t.transition(Data);
                __CLR4_2_05p75p7lnxz22qp.R.inc(7683);return;
            }

            }__CLR4_2_05p75p7lnxz22qp.R.inc(7684);char c = r.consume();
            boolean __CLB4_2_0_bool9=false;__CLR4_2_05p75p7lnxz22qp.R.inc(7685);switch (c) {
                case '-':if (!__CLB4_2_0_bool9) {__CLR4_2_05p75p7lnxz22qp.R.inc(7686);__CLB4_2_0_bool9=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7687);t.emit(c);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7688);break;
                case '<':if (!__CLB4_2_0_bool9) {__CLR4_2_05p75p7lnxz22qp.R.inc(7689);__CLB4_2_0_bool9=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7690);t.transition(ScriptDataEscapedLessthanSign);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7691);break;
                case '>':if (!__CLB4_2_0_bool9) {__CLR4_2_05p75p7lnxz22qp.R.inc(7692);__CLB4_2_0_bool9=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7693);t.emit(c);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7694);t.transition(ScriptData);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7695);break;
                case nullChar:if (!__CLB4_2_0_bool9) {__CLR4_2_05p75p7lnxz22qp.R.inc(7696);__CLB4_2_0_bool9=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7697);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7698);t.emit(replacementChar);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7699);t.transition(ScriptDataEscaped);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7700);break;
                default:if (!__CLB4_2_0_bool9) {__CLR4_2_05p75p7lnxz22qp.R.inc(7701);__CLB4_2_0_bool9=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7702);t.emit(c);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7703);t.transition(ScriptDataEscaped);
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    ScriptDataEscapedLessthanSign {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(7704);
            __CLR4_2_05p75p7lnxz22qp.R.inc(7705);if ((((r.matchesLetter())&&(__CLR4_2_05p75p7lnxz22qp.R.iget(7706)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(7707)==0&false))) {{
                __CLR4_2_05p75p7lnxz22qp.R.inc(7708);t.createTempBuffer();
                __CLR4_2_05p75p7lnxz22qp.R.inc(7709);t.dataBuffer.append(r.current());
                __CLR4_2_05p75p7lnxz22qp.R.inc(7710);t.emit("<" + r.current());
                __CLR4_2_05p75p7lnxz22qp.R.inc(7711);t.advanceTransition(ScriptDataDoubleEscapeStart);
            } }else {__CLR4_2_05p75p7lnxz22qp.R.inc(7712);if ((((r.matches('/'))&&(__CLR4_2_05p75p7lnxz22qp.R.iget(7713)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(7714)==0&false))) {{
                __CLR4_2_05p75p7lnxz22qp.R.inc(7715);t.createTempBuffer();
                __CLR4_2_05p75p7lnxz22qp.R.inc(7716);t.advanceTransition(ScriptDataEscapedEndTagOpen);
            } }else {{
                __CLR4_2_05p75p7lnxz22qp.R.inc(7717);t.emit('<');
                __CLR4_2_05p75p7lnxz22qp.R.inc(7718);t.transition(ScriptDataEscaped);
            }
        }}}finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    ScriptDataEscapedEndTagOpen {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(7719);
            __CLR4_2_05p75p7lnxz22qp.R.inc(7720);if ((((r.matchesLetter())&&(__CLR4_2_05p75p7lnxz22qp.R.iget(7721)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(7722)==0&false))) {{
                __CLR4_2_05p75p7lnxz22qp.R.inc(7723);t.createTagPending(false);
                __CLR4_2_05p75p7lnxz22qp.R.inc(7724);t.tagPending.appendTagName(r.current());
                __CLR4_2_05p75p7lnxz22qp.R.inc(7725);t.dataBuffer.append(r.current());
                __CLR4_2_05p75p7lnxz22qp.R.inc(7726);t.advanceTransition(ScriptDataEscapedEndTagName);
            } }else {{
                __CLR4_2_05p75p7lnxz22qp.R.inc(7727);t.emit("</");
                __CLR4_2_05p75p7lnxz22qp.R.inc(7728);t.transition(ScriptDataEscaped);
            }
        }}finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    ScriptDataEscapedEndTagName {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(7729);
            __CLR4_2_05p75p7lnxz22qp.R.inc(7730);handleDataEndTag(t, r, ScriptDataEscaped);
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    ScriptDataDoubleEscapeStart {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(7731);
            __CLR4_2_05p75p7lnxz22qp.R.inc(7732);handleDataDoubleEscapeTag(t, r, ScriptDataDoubleEscaped, ScriptDataEscaped);
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    ScriptDataDoubleEscaped {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(7733);
            __CLR4_2_05p75p7lnxz22qp.R.inc(7734);char c = r.current();
            boolean __CLB4_2_0_bool10=false;__CLR4_2_05p75p7lnxz22qp.R.inc(7735);switch (c) {
                case '-':if (!__CLB4_2_0_bool10) {__CLR4_2_05p75p7lnxz22qp.R.inc(7736);__CLB4_2_0_bool10=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7737);t.emit(c);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7738);t.advanceTransition(ScriptDataDoubleEscapedDash);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7739);break;
                case '<':if (!__CLB4_2_0_bool10) {__CLR4_2_05p75p7lnxz22qp.R.inc(7740);__CLB4_2_0_bool10=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7741);t.emit(c);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7742);t.advanceTransition(ScriptDataDoubleEscapedLessthanSign);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7743);break;
                case nullChar:if (!__CLB4_2_0_bool10) {__CLR4_2_05p75p7lnxz22qp.R.inc(7744);__CLB4_2_0_bool10=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7745);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7746);r.advance();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7747);t.emit(replacementChar);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7748);break;
                case eof:if (!__CLB4_2_0_bool10) {__CLR4_2_05p75p7lnxz22qp.R.inc(7749);__CLB4_2_0_bool10=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7750);t.eofError(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7751);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7752);break;
                default:if (!__CLB4_2_0_bool10) {__CLR4_2_05p75p7lnxz22qp.R.inc(7753);__CLB4_2_0_bool10=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7754);String data = r.consumeToAny('-', '<', nullChar);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7755);t.emit(data);
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    ScriptDataDoubleEscapedDash {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(7756);
            __CLR4_2_05p75p7lnxz22qp.R.inc(7757);char c = r.consume();
            boolean __CLB4_2_0_bool11=false;__CLR4_2_05p75p7lnxz22qp.R.inc(7758);switch (c) {
                case '-':if (!__CLB4_2_0_bool11) {__CLR4_2_05p75p7lnxz22qp.R.inc(7759);__CLB4_2_0_bool11=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7760);t.emit(c);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7761);t.transition(ScriptDataDoubleEscapedDashDash);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7762);break;
                case '<':if (!__CLB4_2_0_bool11) {__CLR4_2_05p75p7lnxz22qp.R.inc(7763);__CLB4_2_0_bool11=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7764);t.emit(c);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7765);t.transition(ScriptDataDoubleEscapedLessthanSign);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7766);break;
                case nullChar:if (!__CLB4_2_0_bool11) {__CLR4_2_05p75p7lnxz22qp.R.inc(7767);__CLB4_2_0_bool11=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7768);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7769);t.emit(replacementChar);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7770);t.transition(ScriptDataDoubleEscaped);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7771);break;
                case eof:if (!__CLB4_2_0_bool11) {__CLR4_2_05p75p7lnxz22qp.R.inc(7772);__CLB4_2_0_bool11=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7773);t.eofError(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7774);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7775);break;
                default:if (!__CLB4_2_0_bool11) {__CLR4_2_05p75p7lnxz22qp.R.inc(7776);__CLB4_2_0_bool11=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7777);t.emit(c);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7778);t.transition(ScriptDataDoubleEscaped);
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    ScriptDataDoubleEscapedDashDash {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(7779);
            __CLR4_2_05p75p7lnxz22qp.R.inc(7780);char c = r.consume();
            boolean __CLB4_2_0_bool12=false;__CLR4_2_05p75p7lnxz22qp.R.inc(7781);switch (c) {
                case '-':if (!__CLB4_2_0_bool12) {__CLR4_2_05p75p7lnxz22qp.R.inc(7782);__CLB4_2_0_bool12=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7783);t.emit(c);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7784);break;
                case '<':if (!__CLB4_2_0_bool12) {__CLR4_2_05p75p7lnxz22qp.R.inc(7785);__CLB4_2_0_bool12=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7786);t.emit(c);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7787);t.transition(ScriptDataDoubleEscapedLessthanSign);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7788);break;
                case '>':if (!__CLB4_2_0_bool12) {__CLR4_2_05p75p7lnxz22qp.R.inc(7789);__CLB4_2_0_bool12=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7790);t.emit(c);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7791);t.transition(ScriptData);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7792);break;
                case nullChar:if (!__CLB4_2_0_bool12) {__CLR4_2_05p75p7lnxz22qp.R.inc(7793);__CLB4_2_0_bool12=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7794);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7795);t.emit(replacementChar);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7796);t.transition(ScriptDataDoubleEscaped);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7797);break;
                case eof:if (!__CLB4_2_0_bool12) {__CLR4_2_05p75p7lnxz22qp.R.inc(7798);__CLB4_2_0_bool12=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7799);t.eofError(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7800);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7801);break;
                default:if (!__CLB4_2_0_bool12) {__CLR4_2_05p75p7lnxz22qp.R.inc(7802);__CLB4_2_0_bool12=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7803);t.emit(c);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7804);t.transition(ScriptDataDoubleEscaped);
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    ScriptDataDoubleEscapedLessthanSign {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(7805);
            __CLR4_2_05p75p7lnxz22qp.R.inc(7806);if ((((r.matches('/'))&&(__CLR4_2_05p75p7lnxz22qp.R.iget(7807)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(7808)==0&false))) {{
                __CLR4_2_05p75p7lnxz22qp.R.inc(7809);t.emit('/');
                __CLR4_2_05p75p7lnxz22qp.R.inc(7810);t.createTempBuffer();
                __CLR4_2_05p75p7lnxz22qp.R.inc(7811);t.advanceTransition(ScriptDataDoubleEscapeEnd);
            } }else {{
                __CLR4_2_05p75p7lnxz22qp.R.inc(7812);t.transition(ScriptDataDoubleEscaped);
            }
        }}finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    ScriptDataDoubleEscapeEnd {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(7813);
            __CLR4_2_05p75p7lnxz22qp.R.inc(7814);handleDataDoubleEscapeTag(t,r, ScriptDataEscaped, ScriptDataDoubleEscaped);
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    BeforeAttributeName {
        // from tagname <xxx
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(7815);
            __CLR4_2_05p75p7lnxz22qp.R.inc(7816);char c = r.consume();
            boolean __CLB4_2_0_bool13=false;__CLR4_2_05p75p7lnxz22qp.R.inc(7817);switch (c) {
                case '\t':if (!__CLB4_2_0_bool13) {__CLR4_2_05p75p7lnxz22qp.R.inc(7818);__CLB4_2_0_bool13=true;}
                case '\n':if (!__CLB4_2_0_bool13) {__CLR4_2_05p75p7lnxz22qp.R.inc(7819);__CLB4_2_0_bool13=true;}
                case '\r':if (!__CLB4_2_0_bool13) {__CLR4_2_05p75p7lnxz22qp.R.inc(7820);__CLB4_2_0_bool13=true;}
                case '\f':if (!__CLB4_2_0_bool13) {__CLR4_2_05p75p7lnxz22qp.R.inc(7821);__CLB4_2_0_bool13=true;}
                case ' ':if (!__CLB4_2_0_bool13) {__CLR4_2_05p75p7lnxz22qp.R.inc(7822);__CLB4_2_0_bool13=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7823);break; // ignore whitespace
                case '/':if (!__CLB4_2_0_bool13) {__CLR4_2_05p75p7lnxz22qp.R.inc(7824);__CLB4_2_0_bool13=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7825);t.transition(SelfClosingStartTag);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7826);break;
                case '<':if (!__CLB4_2_0_bool13) {__CLR4_2_05p75p7lnxz22qp.R.inc(7827);__CLB4_2_0_bool13=true;} // NOTE: out of spec, but clear (spec has this as a part of the attribute name)
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7828);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7829);r.unconsume();
                    // intended fall through as if >
                case '>':if (!__CLB4_2_0_bool13) {__CLR4_2_05p75p7lnxz22qp.R.inc(7830);__CLB4_2_0_bool13=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7831);t.emitTagPending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7832);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7833);break;
                case nullChar:if (!__CLB4_2_0_bool13) {__CLR4_2_05p75p7lnxz22qp.R.inc(7834);__CLB4_2_0_bool13=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7835);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7836);t.tagPending.newAttribute();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7837);r.unconsume();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7838);t.transition(AttributeName);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7839);break;
                case eof:if (!__CLB4_2_0_bool13) {__CLR4_2_05p75p7lnxz22qp.R.inc(7840);__CLB4_2_0_bool13=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7841);t.eofError(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7842);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7843);break;
                case '"':if (!__CLB4_2_0_bool13) {__CLR4_2_05p75p7lnxz22qp.R.inc(7844);__CLB4_2_0_bool13=true;}
                case '\'':if (!__CLB4_2_0_bool13) {__CLR4_2_05p75p7lnxz22qp.R.inc(7845);__CLB4_2_0_bool13=true;}
                case '=':if (!__CLB4_2_0_bool13) {__CLR4_2_05p75p7lnxz22qp.R.inc(7846);__CLB4_2_0_bool13=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7847);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7848);t.tagPending.newAttribute();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7849);t.tagPending.appendAttributeName(c);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7850);t.transition(AttributeName);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7851);break;
                default:if (!__CLB4_2_0_bool13) {__CLR4_2_05p75p7lnxz22qp.R.inc(7852);__CLB4_2_0_bool13=true;} // A-Z, anything else
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7853);t.tagPending.newAttribute();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7854);r.unconsume();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7855);t.transition(AttributeName);
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    AttributeName {
        // from before attribute name
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(7856);
            __CLR4_2_05p75p7lnxz22qp.R.inc(7857);String name = r.consumeToAnySorted(attributeNameCharsSorted);
            __CLR4_2_05p75p7lnxz22qp.R.inc(7858);t.tagPending.appendAttributeName(name);

            __CLR4_2_05p75p7lnxz22qp.R.inc(7859);char c = r.consume();
            boolean __CLB4_2_0_bool14=false;__CLR4_2_05p75p7lnxz22qp.R.inc(7860);switch (c) {
                case '\t':if (!__CLB4_2_0_bool14) {__CLR4_2_05p75p7lnxz22qp.R.inc(7861);__CLB4_2_0_bool14=true;}
                case '\n':if (!__CLB4_2_0_bool14) {__CLR4_2_05p75p7lnxz22qp.R.inc(7862);__CLB4_2_0_bool14=true;}
                case '\r':if (!__CLB4_2_0_bool14) {__CLR4_2_05p75p7lnxz22qp.R.inc(7863);__CLB4_2_0_bool14=true;}
                case '\f':if (!__CLB4_2_0_bool14) {__CLR4_2_05p75p7lnxz22qp.R.inc(7864);__CLB4_2_0_bool14=true;}
                case ' ':if (!__CLB4_2_0_bool14) {__CLR4_2_05p75p7lnxz22qp.R.inc(7865);__CLB4_2_0_bool14=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7866);t.transition(AfterAttributeName);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7867);break;
                case '/':if (!__CLB4_2_0_bool14) {__CLR4_2_05p75p7lnxz22qp.R.inc(7868);__CLB4_2_0_bool14=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7869);t.transition(SelfClosingStartTag);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7870);break;
                case '=':if (!__CLB4_2_0_bool14) {__CLR4_2_05p75p7lnxz22qp.R.inc(7871);__CLB4_2_0_bool14=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7872);t.transition(BeforeAttributeValue);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7873);break;
                case '>':if (!__CLB4_2_0_bool14) {__CLR4_2_05p75p7lnxz22qp.R.inc(7874);__CLB4_2_0_bool14=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7875);t.emitTagPending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7876);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7877);break;
                case nullChar:if (!__CLB4_2_0_bool14) {__CLR4_2_05p75p7lnxz22qp.R.inc(7878);__CLB4_2_0_bool14=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7879);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7880);t.tagPending.appendAttributeName(replacementChar);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7881);break;
                case eof:if (!__CLB4_2_0_bool14) {__CLR4_2_05p75p7lnxz22qp.R.inc(7882);__CLB4_2_0_bool14=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7883);t.eofError(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7884);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7885);break;
                case '"':if (!__CLB4_2_0_bool14) {__CLR4_2_05p75p7lnxz22qp.R.inc(7886);__CLB4_2_0_bool14=true;}
                case '\'':if (!__CLB4_2_0_bool14) {__CLR4_2_05p75p7lnxz22qp.R.inc(7887);__CLB4_2_0_bool14=true;}
                case '<':if (!__CLB4_2_0_bool14) {__CLR4_2_05p75p7lnxz22qp.R.inc(7888);__CLB4_2_0_bool14=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7889);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7890);t.tagPending.appendAttributeName(c);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7891);break;
                default:if (!__CLB4_2_0_bool14) {__CLR4_2_05p75p7lnxz22qp.R.inc(7892);__CLB4_2_0_bool14=true;} // buffer underrun
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7893);t.tagPending.appendAttributeName(c);
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    AfterAttributeName {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(7894);
            __CLR4_2_05p75p7lnxz22qp.R.inc(7895);char c = r.consume();
            boolean __CLB4_2_0_bool15=false;__CLR4_2_05p75p7lnxz22qp.R.inc(7896);switch (c) {
                case '\t':if (!__CLB4_2_0_bool15) {__CLR4_2_05p75p7lnxz22qp.R.inc(7897);__CLB4_2_0_bool15=true;}
                case '\n':if (!__CLB4_2_0_bool15) {__CLR4_2_05p75p7lnxz22qp.R.inc(7898);__CLB4_2_0_bool15=true;}
                case '\r':if (!__CLB4_2_0_bool15) {__CLR4_2_05p75p7lnxz22qp.R.inc(7899);__CLB4_2_0_bool15=true;}
                case '\f':if (!__CLB4_2_0_bool15) {__CLR4_2_05p75p7lnxz22qp.R.inc(7900);__CLB4_2_0_bool15=true;}
                case ' ':if (!__CLB4_2_0_bool15) {__CLR4_2_05p75p7lnxz22qp.R.inc(7901);__CLB4_2_0_bool15=true;}
                    // ignore
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7902);break;
                case '/':if (!__CLB4_2_0_bool15) {__CLR4_2_05p75p7lnxz22qp.R.inc(7903);__CLB4_2_0_bool15=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7904);t.transition(SelfClosingStartTag);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7905);break;
                case '=':if (!__CLB4_2_0_bool15) {__CLR4_2_05p75p7lnxz22qp.R.inc(7906);__CLB4_2_0_bool15=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7907);t.transition(BeforeAttributeValue);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7908);break;
                case '>':if (!__CLB4_2_0_bool15) {__CLR4_2_05p75p7lnxz22qp.R.inc(7909);__CLB4_2_0_bool15=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7910);t.emitTagPending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7911);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7912);break;
                case nullChar:if (!__CLB4_2_0_bool15) {__CLR4_2_05p75p7lnxz22qp.R.inc(7913);__CLB4_2_0_bool15=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7914);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7915);t.tagPending.appendAttributeName(replacementChar);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7916);t.transition(AttributeName);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7917);break;
                case eof:if (!__CLB4_2_0_bool15) {__CLR4_2_05p75p7lnxz22qp.R.inc(7918);__CLB4_2_0_bool15=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7919);t.eofError(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7920);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7921);break;
                case '"':if (!__CLB4_2_0_bool15) {__CLR4_2_05p75p7lnxz22qp.R.inc(7922);__CLB4_2_0_bool15=true;}
                case '\'':if (!__CLB4_2_0_bool15) {__CLR4_2_05p75p7lnxz22qp.R.inc(7923);__CLB4_2_0_bool15=true;}
                case '<':if (!__CLB4_2_0_bool15) {__CLR4_2_05p75p7lnxz22qp.R.inc(7924);__CLB4_2_0_bool15=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7925);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7926);t.tagPending.newAttribute();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7927);t.tagPending.appendAttributeName(c);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7928);t.transition(AttributeName);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7929);break;
                default:if (!__CLB4_2_0_bool15) {__CLR4_2_05p75p7lnxz22qp.R.inc(7930);__CLB4_2_0_bool15=true;} // A-Z, anything else
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7931);t.tagPending.newAttribute();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7932);r.unconsume();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7933);t.transition(AttributeName);
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    BeforeAttributeValue {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(7934);
            __CLR4_2_05p75p7lnxz22qp.R.inc(7935);char c = r.consume();
            boolean __CLB4_2_0_bool16=false;__CLR4_2_05p75p7lnxz22qp.R.inc(7936);switch (c) {
                case '\t':if (!__CLB4_2_0_bool16) {__CLR4_2_05p75p7lnxz22qp.R.inc(7937);__CLB4_2_0_bool16=true;}
                case '\n':if (!__CLB4_2_0_bool16) {__CLR4_2_05p75p7lnxz22qp.R.inc(7938);__CLB4_2_0_bool16=true;}
                case '\r':if (!__CLB4_2_0_bool16) {__CLR4_2_05p75p7lnxz22qp.R.inc(7939);__CLB4_2_0_bool16=true;}
                case '\f':if (!__CLB4_2_0_bool16) {__CLR4_2_05p75p7lnxz22qp.R.inc(7940);__CLB4_2_0_bool16=true;}
                case ' ':if (!__CLB4_2_0_bool16) {__CLR4_2_05p75p7lnxz22qp.R.inc(7941);__CLB4_2_0_bool16=true;}
                    // ignore
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7942);break;
                case '"':if (!__CLB4_2_0_bool16) {__CLR4_2_05p75p7lnxz22qp.R.inc(7943);__CLB4_2_0_bool16=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7944);t.transition(AttributeValue_doubleQuoted);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7945);break;
                case '&':if (!__CLB4_2_0_bool16) {__CLR4_2_05p75p7lnxz22qp.R.inc(7946);__CLB4_2_0_bool16=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7947);r.unconsume();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7948);t.transition(AttributeValue_unquoted);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7949);break;
                case '\'':if (!__CLB4_2_0_bool16) {__CLR4_2_05p75p7lnxz22qp.R.inc(7950);__CLB4_2_0_bool16=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7951);t.transition(AttributeValue_singleQuoted);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7952);break;
                case nullChar:if (!__CLB4_2_0_bool16) {__CLR4_2_05p75p7lnxz22qp.R.inc(7953);__CLB4_2_0_bool16=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7954);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7955);t.tagPending.appendAttributeValue(replacementChar);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7956);t.transition(AttributeValue_unquoted);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7957);break;
                case eof:if (!__CLB4_2_0_bool16) {__CLR4_2_05p75p7lnxz22qp.R.inc(7958);__CLB4_2_0_bool16=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7959);t.eofError(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7960);t.emitTagPending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7961);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7962);break;
                case '>':if (!__CLB4_2_0_bool16) {__CLR4_2_05p75p7lnxz22qp.R.inc(7963);__CLB4_2_0_bool16=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7964);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7965);t.emitTagPending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7966);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7967);break;
                case '<':if (!__CLB4_2_0_bool16) {__CLR4_2_05p75p7lnxz22qp.R.inc(7968);__CLB4_2_0_bool16=true;}
                case '=':if (!__CLB4_2_0_bool16) {__CLR4_2_05p75p7lnxz22qp.R.inc(7969);__CLB4_2_0_bool16=true;}
                case '`':if (!__CLB4_2_0_bool16) {__CLR4_2_05p75p7lnxz22qp.R.inc(7970);__CLB4_2_0_bool16=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7971);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7972);t.tagPending.appendAttributeValue(c);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7973);t.transition(AttributeValue_unquoted);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7974);break;
                default:if (!__CLB4_2_0_bool16) {__CLR4_2_05p75p7lnxz22qp.R.inc(7975);__CLB4_2_0_bool16=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7976);r.unconsume();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7977);t.transition(AttributeValue_unquoted);
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    AttributeValue_doubleQuoted {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(7978);
            __CLR4_2_05p75p7lnxz22qp.R.inc(7979);String value = r.consumeToAny(attributeDoubleValueCharsSorted);
            __CLR4_2_05p75p7lnxz22qp.R.inc(7980);if ((((value.length() > 0)&&(__CLR4_2_05p75p7lnxz22qp.R.iget(7981)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(7982)==0&false)))
                {__CLR4_2_05p75p7lnxz22qp.R.inc(7983);t.tagPending.appendAttributeValue(value);
            }else
                {__CLR4_2_05p75p7lnxz22qp.R.inc(7984);t.tagPending.setEmptyAttributeValue();

            }__CLR4_2_05p75p7lnxz22qp.R.inc(7985);char c = r.consume();
            boolean __CLB4_2_0_bool17=false;__CLR4_2_05p75p7lnxz22qp.R.inc(7986);switch (c) {
                case '"':if (!__CLB4_2_0_bool17) {__CLR4_2_05p75p7lnxz22qp.R.inc(7987);__CLB4_2_0_bool17=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7988);t.transition(AfterAttributeValue_quoted);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7989);break;
                case '&':if (!__CLB4_2_0_bool17) {__CLR4_2_05p75p7lnxz22qp.R.inc(7990);__CLB4_2_0_bool17=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7991);int[] ref = t.consumeCharacterReference('"', true);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7992);if ((((ref != null)&&(__CLR4_2_05p75p7lnxz22qp.R.iget(7993)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(7994)==0&false)))
                        {__CLR4_2_05p75p7lnxz22qp.R.inc(7995);t.tagPending.appendAttributeValue(ref);
                    }else
                        {__CLR4_2_05p75p7lnxz22qp.R.inc(7996);t.tagPending.appendAttributeValue('&');
                    }__CLR4_2_05p75p7lnxz22qp.R.inc(7997);break;
                case nullChar:if (!__CLB4_2_0_bool17) {__CLR4_2_05p75p7lnxz22qp.R.inc(7998);__CLB4_2_0_bool17=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(7999);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8000);t.tagPending.appendAttributeValue(replacementChar);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8001);break;
                case eof:if (!__CLB4_2_0_bool17) {__CLR4_2_05p75p7lnxz22qp.R.inc(8002);__CLB4_2_0_bool17=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8003);t.eofError(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8004);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8005);break;
                default:if (!__CLB4_2_0_bool17) {__CLR4_2_05p75p7lnxz22qp.R.inc(8006);__CLB4_2_0_bool17=true;} // hit end of buffer in first read, still in attribute
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8007);t.tagPending.appendAttributeValue(c);
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    AttributeValue_singleQuoted {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(8008);
            __CLR4_2_05p75p7lnxz22qp.R.inc(8009);String value = r.consumeToAny(attributeSingleValueCharsSorted);
            __CLR4_2_05p75p7lnxz22qp.R.inc(8010);if ((((value.length() > 0)&&(__CLR4_2_05p75p7lnxz22qp.R.iget(8011)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(8012)==0&false)))
                {__CLR4_2_05p75p7lnxz22qp.R.inc(8013);t.tagPending.appendAttributeValue(value);
            }else
                {__CLR4_2_05p75p7lnxz22qp.R.inc(8014);t.tagPending.setEmptyAttributeValue();

            }__CLR4_2_05p75p7lnxz22qp.R.inc(8015);char c = r.consume();
            boolean __CLB4_2_0_bool18=false;__CLR4_2_05p75p7lnxz22qp.R.inc(8016);switch (c) {
                case '\'':if (!__CLB4_2_0_bool18) {__CLR4_2_05p75p7lnxz22qp.R.inc(8017);__CLB4_2_0_bool18=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8018);t.transition(AfterAttributeValue_quoted);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8019);break;
                case '&':if (!__CLB4_2_0_bool18) {__CLR4_2_05p75p7lnxz22qp.R.inc(8020);__CLB4_2_0_bool18=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8021);int[] ref = t.consumeCharacterReference('\'', true);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8022);if ((((ref != null)&&(__CLR4_2_05p75p7lnxz22qp.R.iget(8023)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(8024)==0&false)))
                        {__CLR4_2_05p75p7lnxz22qp.R.inc(8025);t.tagPending.appendAttributeValue(ref);
                    }else
                        {__CLR4_2_05p75p7lnxz22qp.R.inc(8026);t.tagPending.appendAttributeValue('&');
                    }__CLR4_2_05p75p7lnxz22qp.R.inc(8027);break;
                case nullChar:if (!__CLB4_2_0_bool18) {__CLR4_2_05p75p7lnxz22qp.R.inc(8028);__CLB4_2_0_bool18=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8029);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8030);t.tagPending.appendAttributeValue(replacementChar);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8031);break;
                case eof:if (!__CLB4_2_0_bool18) {__CLR4_2_05p75p7lnxz22qp.R.inc(8032);__CLB4_2_0_bool18=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8033);t.eofError(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8034);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8035);break;
                default:if (!__CLB4_2_0_bool18) {__CLR4_2_05p75p7lnxz22qp.R.inc(8036);__CLB4_2_0_bool18=true;} // hit end of buffer in first read, still in attribute
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8037);t.tagPending.appendAttributeValue(c);
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    AttributeValue_unquoted {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(8038);
            __CLR4_2_05p75p7lnxz22qp.R.inc(8039);String value = r.consumeToAnySorted(attributeValueUnquoted);
            __CLR4_2_05p75p7lnxz22qp.R.inc(8040);if ((((value.length() > 0)&&(__CLR4_2_05p75p7lnxz22qp.R.iget(8041)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(8042)==0&false)))
                {__CLR4_2_05p75p7lnxz22qp.R.inc(8043);t.tagPending.appendAttributeValue(value);

            }__CLR4_2_05p75p7lnxz22qp.R.inc(8044);char c = r.consume();
            boolean __CLB4_2_0_bool19=false;__CLR4_2_05p75p7lnxz22qp.R.inc(8045);switch (c) {
                case '\t':if (!__CLB4_2_0_bool19) {__CLR4_2_05p75p7lnxz22qp.R.inc(8046);__CLB4_2_0_bool19=true;}
                case '\n':if (!__CLB4_2_0_bool19) {__CLR4_2_05p75p7lnxz22qp.R.inc(8047);__CLB4_2_0_bool19=true;}
                case '\r':if (!__CLB4_2_0_bool19) {__CLR4_2_05p75p7lnxz22qp.R.inc(8048);__CLB4_2_0_bool19=true;}
                case '\f':if (!__CLB4_2_0_bool19) {__CLR4_2_05p75p7lnxz22qp.R.inc(8049);__CLB4_2_0_bool19=true;}
                case ' ':if (!__CLB4_2_0_bool19) {__CLR4_2_05p75p7lnxz22qp.R.inc(8050);__CLB4_2_0_bool19=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8051);t.transition(BeforeAttributeName);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8052);break;
                case '&':if (!__CLB4_2_0_bool19) {__CLR4_2_05p75p7lnxz22qp.R.inc(8053);__CLB4_2_0_bool19=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8054);int[] ref = t.consumeCharacterReference('>', true);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8055);if ((((ref != null)&&(__CLR4_2_05p75p7lnxz22qp.R.iget(8056)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(8057)==0&false)))
                        {__CLR4_2_05p75p7lnxz22qp.R.inc(8058);t.tagPending.appendAttributeValue(ref);
                    }else
                        {__CLR4_2_05p75p7lnxz22qp.R.inc(8059);t.tagPending.appendAttributeValue('&');
                    }__CLR4_2_05p75p7lnxz22qp.R.inc(8060);break;
                case '>':if (!__CLB4_2_0_bool19) {__CLR4_2_05p75p7lnxz22qp.R.inc(8061);__CLB4_2_0_bool19=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8062);t.emitTagPending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8063);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8064);break;
                case nullChar:if (!__CLB4_2_0_bool19) {__CLR4_2_05p75p7lnxz22qp.R.inc(8065);__CLB4_2_0_bool19=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8066);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8067);t.tagPending.appendAttributeValue(replacementChar);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8068);break;
                case eof:if (!__CLB4_2_0_bool19) {__CLR4_2_05p75p7lnxz22qp.R.inc(8069);__CLB4_2_0_bool19=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8070);t.eofError(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8071);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8072);break;
                case '"':if (!__CLB4_2_0_bool19) {__CLR4_2_05p75p7lnxz22qp.R.inc(8073);__CLB4_2_0_bool19=true;}
                case '\'':if (!__CLB4_2_0_bool19) {__CLR4_2_05p75p7lnxz22qp.R.inc(8074);__CLB4_2_0_bool19=true;}
                case '<':if (!__CLB4_2_0_bool19) {__CLR4_2_05p75p7lnxz22qp.R.inc(8075);__CLB4_2_0_bool19=true;}
                case '=':if (!__CLB4_2_0_bool19) {__CLR4_2_05p75p7lnxz22qp.R.inc(8076);__CLB4_2_0_bool19=true;}
                case '`':if (!__CLB4_2_0_bool19) {__CLR4_2_05p75p7lnxz22qp.R.inc(8077);__CLB4_2_0_bool19=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8078);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8079);t.tagPending.appendAttributeValue(c);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8080);break;
                default:if (!__CLB4_2_0_bool19) {__CLR4_2_05p75p7lnxz22qp.R.inc(8081);__CLB4_2_0_bool19=true;} // hit end of buffer in first read, still in attribute
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8082);t.tagPending.appendAttributeValue(c);
            }

        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    // CharacterReferenceInAttributeValue state handled inline
    AfterAttributeValue_quoted {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(8083);
            __CLR4_2_05p75p7lnxz22qp.R.inc(8084);char c = r.consume();
            boolean __CLB4_2_0_bool20=false;__CLR4_2_05p75p7lnxz22qp.R.inc(8085);switch (c) {
                case '\t':if (!__CLB4_2_0_bool20) {__CLR4_2_05p75p7lnxz22qp.R.inc(8086);__CLB4_2_0_bool20=true;}
                case '\n':if (!__CLB4_2_0_bool20) {__CLR4_2_05p75p7lnxz22qp.R.inc(8087);__CLB4_2_0_bool20=true;}
                case '\r':if (!__CLB4_2_0_bool20) {__CLR4_2_05p75p7lnxz22qp.R.inc(8088);__CLB4_2_0_bool20=true;}
                case '\f':if (!__CLB4_2_0_bool20) {__CLR4_2_05p75p7lnxz22qp.R.inc(8089);__CLB4_2_0_bool20=true;}
                case ' ':if (!__CLB4_2_0_bool20) {__CLR4_2_05p75p7lnxz22qp.R.inc(8090);__CLB4_2_0_bool20=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8091);t.transition(BeforeAttributeName);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8092);break;
                case '/':if (!__CLB4_2_0_bool20) {__CLR4_2_05p75p7lnxz22qp.R.inc(8093);__CLB4_2_0_bool20=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8094);t.transition(SelfClosingStartTag);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8095);break;
                case '>':if (!__CLB4_2_0_bool20) {__CLR4_2_05p75p7lnxz22qp.R.inc(8096);__CLB4_2_0_bool20=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8097);t.emitTagPending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8098);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8099);break;
                case eof:if (!__CLB4_2_0_bool20) {__CLR4_2_05p75p7lnxz22qp.R.inc(8100);__CLB4_2_0_bool20=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8101);t.eofError(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8102);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8103);break;
                default:if (!__CLB4_2_0_bool20) {__CLR4_2_05p75p7lnxz22qp.R.inc(8104);__CLB4_2_0_bool20=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8105);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8106);r.unconsume();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8107);t.transition(BeforeAttributeName);
            }

        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    SelfClosingStartTag {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(8108);
            __CLR4_2_05p75p7lnxz22qp.R.inc(8109);char c = r.consume();
            boolean __CLB4_2_0_bool21=false;__CLR4_2_05p75p7lnxz22qp.R.inc(8110);switch (c) {
                case '>':if (!__CLB4_2_0_bool21) {__CLR4_2_05p75p7lnxz22qp.R.inc(8111);__CLB4_2_0_bool21=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8112);t.tagPending.selfClosing = true;
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8113);t.emitTagPending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8114);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8115);break;
                case eof:if (!__CLB4_2_0_bool21) {__CLR4_2_05p75p7lnxz22qp.R.inc(8116);__CLB4_2_0_bool21=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8117);t.eofError(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8118);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8119);break;
                default:if (!__CLB4_2_0_bool21) {__CLR4_2_05p75p7lnxz22qp.R.inc(8120);__CLB4_2_0_bool21=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8121);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8122);r.unconsume();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8123);t.transition(BeforeAttributeName);
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    BogusComment {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(8124);
            // todo: handle bogus comment starting from eof. when does that trigger?
            // rewind to capture character that lead us here
            __CLR4_2_05p75p7lnxz22qp.R.inc(8125);r.unconsume();
            __CLR4_2_05p75p7lnxz22qp.R.inc(8126);Token.Comment comment = new Token.Comment();
            __CLR4_2_05p75p7lnxz22qp.R.inc(8127);comment.bogus = true;
            __CLR4_2_05p75p7lnxz22qp.R.inc(8128);comment.data.append(r.consumeTo('>'));
            // todo: replace nullChar with replaceChar
            __CLR4_2_05p75p7lnxz22qp.R.inc(8129);t.emit(comment);
            __CLR4_2_05p75p7lnxz22qp.R.inc(8130);t.advanceTransition(Data);
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    MarkupDeclarationOpen {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(8131);
            __CLR4_2_05p75p7lnxz22qp.R.inc(8132);if ((((r.matchConsume("--"))&&(__CLR4_2_05p75p7lnxz22qp.R.iget(8133)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(8134)==0&false))) {{
                __CLR4_2_05p75p7lnxz22qp.R.inc(8135);t.createCommentPending();
                __CLR4_2_05p75p7lnxz22qp.R.inc(8136);t.transition(CommentStart);
            } }else {__CLR4_2_05p75p7lnxz22qp.R.inc(8137);if ((((r.matchConsumeIgnoreCase("DOCTYPE"))&&(__CLR4_2_05p75p7lnxz22qp.R.iget(8138)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(8139)==0&false))) {{
                __CLR4_2_05p75p7lnxz22qp.R.inc(8140);t.transition(Doctype);
            } }else {__CLR4_2_05p75p7lnxz22qp.R.inc(8141);if ((((r.matchConsume("[CDATA["))&&(__CLR4_2_05p75p7lnxz22qp.R.iget(8142)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(8143)==0&false))) {{
                // todo: should actually check current namepspace, and only non-html allows cdata. until namespace
                // is implemented properly, keep handling as cdata
                //} else if (!t.currentNodeInHtmlNS() && r.matchConsume("[CDATA[")) {
                __CLR4_2_05p75p7lnxz22qp.R.inc(8144);t.createTempBuffer();
                __CLR4_2_05p75p7lnxz22qp.R.inc(8145);t.transition(CdataSection);
            } }else {{
                __CLR4_2_05p75p7lnxz22qp.R.inc(8146);t.error(this);
                __CLR4_2_05p75p7lnxz22qp.R.inc(8147);t.advanceTransition(BogusComment); // advance so this character gets in bogus comment data's rewind
            }
        }}}}finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    CommentStart {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(8148);
            __CLR4_2_05p75p7lnxz22qp.R.inc(8149);char c = r.consume();
            boolean __CLB4_2_0_bool22=false;__CLR4_2_05p75p7lnxz22qp.R.inc(8150);switch (c) {
                case '-':if (!__CLB4_2_0_bool22) {__CLR4_2_05p75p7lnxz22qp.R.inc(8151);__CLB4_2_0_bool22=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8152);t.transition(CommentStartDash);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8153);break;
                case nullChar:if (!__CLB4_2_0_bool22) {__CLR4_2_05p75p7lnxz22qp.R.inc(8154);__CLB4_2_0_bool22=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8155);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8156);t.commentPending.data.append(replacementChar);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8157);t.transition(Comment);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8158);break;
                case '>':if (!__CLB4_2_0_bool22) {__CLR4_2_05p75p7lnxz22qp.R.inc(8159);__CLB4_2_0_bool22=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8160);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8161);t.emitCommentPending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8162);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8163);break;
                case eof:if (!__CLB4_2_0_bool22) {__CLR4_2_05p75p7lnxz22qp.R.inc(8164);__CLB4_2_0_bool22=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8165);t.eofError(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8166);t.emitCommentPending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8167);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8168);break;
                default:if (!__CLB4_2_0_bool22) {__CLR4_2_05p75p7lnxz22qp.R.inc(8169);__CLB4_2_0_bool22=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8170);t.commentPending.data.append(c);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8171);t.transition(Comment);
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    CommentStartDash {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(8172);
            __CLR4_2_05p75p7lnxz22qp.R.inc(8173);char c = r.consume();
            boolean __CLB4_2_0_bool23=false;__CLR4_2_05p75p7lnxz22qp.R.inc(8174);switch (c) {
                case '-':if (!__CLB4_2_0_bool23) {__CLR4_2_05p75p7lnxz22qp.R.inc(8175);__CLB4_2_0_bool23=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8176);t.transition(CommentStartDash);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8177);break;
                case nullChar:if (!__CLB4_2_0_bool23) {__CLR4_2_05p75p7lnxz22qp.R.inc(8178);__CLB4_2_0_bool23=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8179);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8180);t.commentPending.data.append(replacementChar);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8181);t.transition(Comment);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8182);break;
                case '>':if (!__CLB4_2_0_bool23) {__CLR4_2_05p75p7lnxz22qp.R.inc(8183);__CLB4_2_0_bool23=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8184);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8185);t.emitCommentPending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8186);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8187);break;
                case eof:if (!__CLB4_2_0_bool23) {__CLR4_2_05p75p7lnxz22qp.R.inc(8188);__CLB4_2_0_bool23=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8189);t.eofError(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8190);t.emitCommentPending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8191);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8192);break;
                default:if (!__CLB4_2_0_bool23) {__CLR4_2_05p75p7lnxz22qp.R.inc(8193);__CLB4_2_0_bool23=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8194);t.commentPending.data.append(c);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8195);t.transition(Comment);
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    Comment {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(8196);
            __CLR4_2_05p75p7lnxz22qp.R.inc(8197);char c = r.current();
            boolean __CLB4_2_0_bool24=false;__CLR4_2_05p75p7lnxz22qp.R.inc(8198);switch (c) {
                case '-':if (!__CLB4_2_0_bool24) {__CLR4_2_05p75p7lnxz22qp.R.inc(8199);__CLB4_2_0_bool24=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8200);t.advanceTransition(CommentEndDash);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8201);break;
                case nullChar:if (!__CLB4_2_0_bool24) {__CLR4_2_05p75p7lnxz22qp.R.inc(8202);__CLB4_2_0_bool24=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8203);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8204);r.advance();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8205);t.commentPending.data.append(replacementChar);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8206);break;
                case eof:if (!__CLB4_2_0_bool24) {__CLR4_2_05p75p7lnxz22qp.R.inc(8207);__CLB4_2_0_bool24=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8208);t.eofError(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8209);t.emitCommentPending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8210);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8211);break;
                default:if (!__CLB4_2_0_bool24) {__CLR4_2_05p75p7lnxz22qp.R.inc(8212);__CLB4_2_0_bool24=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8213);t.commentPending.data.append(r.consumeToAny('-', nullChar));
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    CommentEndDash {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(8214);
            __CLR4_2_05p75p7lnxz22qp.R.inc(8215);char c = r.consume();
            boolean __CLB4_2_0_bool25=false;__CLR4_2_05p75p7lnxz22qp.R.inc(8216);switch (c) {
                case '-':if (!__CLB4_2_0_bool25) {__CLR4_2_05p75p7lnxz22qp.R.inc(8217);__CLB4_2_0_bool25=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8218);t.transition(CommentEnd);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8219);break;
                case nullChar:if (!__CLB4_2_0_bool25) {__CLR4_2_05p75p7lnxz22qp.R.inc(8220);__CLB4_2_0_bool25=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8221);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8222);t.commentPending.data.append('-').append(replacementChar);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8223);t.transition(Comment);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8224);break;
                case eof:if (!__CLB4_2_0_bool25) {__CLR4_2_05p75p7lnxz22qp.R.inc(8225);__CLB4_2_0_bool25=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8226);t.eofError(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8227);t.emitCommentPending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8228);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8229);break;
                default:if (!__CLB4_2_0_bool25) {__CLR4_2_05p75p7lnxz22qp.R.inc(8230);__CLB4_2_0_bool25=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8231);t.commentPending.data.append('-').append(c);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8232);t.transition(Comment);
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    CommentEnd {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(8233);
            __CLR4_2_05p75p7lnxz22qp.R.inc(8234);char c = r.consume();
            boolean __CLB4_2_0_bool26=false;__CLR4_2_05p75p7lnxz22qp.R.inc(8235);switch (c) {
                case '>':if (!__CLB4_2_0_bool26) {__CLR4_2_05p75p7lnxz22qp.R.inc(8236);__CLB4_2_0_bool26=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8237);t.emitCommentPending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8238);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8239);break;
                case nullChar:if (!__CLB4_2_0_bool26) {__CLR4_2_05p75p7lnxz22qp.R.inc(8240);__CLB4_2_0_bool26=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8241);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8242);t.commentPending.data.append("--").append(replacementChar);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8243);t.transition(Comment);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8244);break;
                case '!':if (!__CLB4_2_0_bool26) {__CLR4_2_05p75p7lnxz22qp.R.inc(8245);__CLB4_2_0_bool26=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8246);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8247);t.transition(CommentEndBang);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8248);break;
                case '-':if (!__CLB4_2_0_bool26) {__CLR4_2_05p75p7lnxz22qp.R.inc(8249);__CLB4_2_0_bool26=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8250);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8251);t.commentPending.data.append('-');
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8252);break;
                case eof:if (!__CLB4_2_0_bool26) {__CLR4_2_05p75p7lnxz22qp.R.inc(8253);__CLB4_2_0_bool26=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8254);t.eofError(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8255);t.emitCommentPending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8256);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8257);break;
                default:if (!__CLB4_2_0_bool26) {__CLR4_2_05p75p7lnxz22qp.R.inc(8258);__CLB4_2_0_bool26=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8259);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8260);t.commentPending.data.append("--").append(c);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8261);t.transition(Comment);
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    CommentEndBang {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(8262);
            __CLR4_2_05p75p7lnxz22qp.R.inc(8263);char c = r.consume();
            boolean __CLB4_2_0_bool27=false;__CLR4_2_05p75p7lnxz22qp.R.inc(8264);switch (c) {
                case '-':if (!__CLB4_2_0_bool27) {__CLR4_2_05p75p7lnxz22qp.R.inc(8265);__CLB4_2_0_bool27=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8266);t.commentPending.data.append("--!");
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8267);t.transition(CommentEndDash);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8268);break;
                case '>':if (!__CLB4_2_0_bool27) {__CLR4_2_05p75p7lnxz22qp.R.inc(8269);__CLB4_2_0_bool27=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8270);t.emitCommentPending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8271);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8272);break;
                case nullChar:if (!__CLB4_2_0_bool27) {__CLR4_2_05p75p7lnxz22qp.R.inc(8273);__CLB4_2_0_bool27=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8274);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8275);t.commentPending.data.append("--!").append(replacementChar);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8276);t.transition(Comment);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8277);break;
                case eof:if (!__CLB4_2_0_bool27) {__CLR4_2_05p75p7lnxz22qp.R.inc(8278);__CLB4_2_0_bool27=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8279);t.eofError(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8280);t.emitCommentPending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8281);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8282);break;
                default:if (!__CLB4_2_0_bool27) {__CLR4_2_05p75p7lnxz22qp.R.inc(8283);__CLB4_2_0_bool27=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8284);t.commentPending.data.append("--!").append(c);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8285);t.transition(Comment);
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    Doctype {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(8286);
            __CLR4_2_05p75p7lnxz22qp.R.inc(8287);char c = r.consume();
            boolean __CLB4_2_0_bool28=false;__CLR4_2_05p75p7lnxz22qp.R.inc(8288);switch (c) {
                case '\t':if (!__CLB4_2_0_bool28) {__CLR4_2_05p75p7lnxz22qp.R.inc(8289);__CLB4_2_0_bool28=true;}
                case '\n':if (!__CLB4_2_0_bool28) {__CLR4_2_05p75p7lnxz22qp.R.inc(8290);__CLB4_2_0_bool28=true;}
                case '\r':if (!__CLB4_2_0_bool28) {__CLR4_2_05p75p7lnxz22qp.R.inc(8291);__CLB4_2_0_bool28=true;}
                case '\f':if (!__CLB4_2_0_bool28) {__CLR4_2_05p75p7lnxz22qp.R.inc(8292);__CLB4_2_0_bool28=true;}
                case ' ':if (!__CLB4_2_0_bool28) {__CLR4_2_05p75p7lnxz22qp.R.inc(8293);__CLB4_2_0_bool28=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8294);t.transition(BeforeDoctypeName);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8295);break;
                case eof:if (!__CLB4_2_0_bool28) {__CLR4_2_05p75p7lnxz22qp.R.inc(8296);__CLB4_2_0_bool28=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8297);t.eofError(this);
                    // note: fall through to > case
                case '>':if (!__CLB4_2_0_bool28) {__CLR4_2_05p75p7lnxz22qp.R.inc(8298);__CLB4_2_0_bool28=true;} // catch invalid <!DOCTYPE>
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8299);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8300);t.createDoctypePending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8301);t.doctypePending.forceQuirks = true;
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8302);t.emitDoctypePending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8303);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8304);break;
                default:if (!__CLB4_2_0_bool28) {__CLR4_2_05p75p7lnxz22qp.R.inc(8305);__CLB4_2_0_bool28=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8306);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8307);t.transition(BeforeDoctypeName);
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    BeforeDoctypeName {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(8308);
            __CLR4_2_05p75p7lnxz22qp.R.inc(8309);if ((((r.matchesLetter())&&(__CLR4_2_05p75p7lnxz22qp.R.iget(8310)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(8311)==0&false))) {{
                __CLR4_2_05p75p7lnxz22qp.R.inc(8312);t.createDoctypePending();
                __CLR4_2_05p75p7lnxz22qp.R.inc(8313);t.transition(DoctypeName);
                __CLR4_2_05p75p7lnxz22qp.R.inc(8314);return;
            }
            }__CLR4_2_05p75p7lnxz22qp.R.inc(8315);char c = r.consume();
            boolean __CLB4_2_0_bool29=false;__CLR4_2_05p75p7lnxz22qp.R.inc(8316);switch (c) {
                case '\t':if (!__CLB4_2_0_bool29) {__CLR4_2_05p75p7lnxz22qp.R.inc(8317);__CLB4_2_0_bool29=true;}
                case '\n':if (!__CLB4_2_0_bool29) {__CLR4_2_05p75p7lnxz22qp.R.inc(8318);__CLB4_2_0_bool29=true;}
                case '\r':if (!__CLB4_2_0_bool29) {__CLR4_2_05p75p7lnxz22qp.R.inc(8319);__CLB4_2_0_bool29=true;}
                case '\f':if (!__CLB4_2_0_bool29) {__CLR4_2_05p75p7lnxz22qp.R.inc(8320);__CLB4_2_0_bool29=true;}
                case ' ':if (!__CLB4_2_0_bool29) {__CLR4_2_05p75p7lnxz22qp.R.inc(8321);__CLB4_2_0_bool29=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8322);break; // ignore whitespace
                case nullChar:if (!__CLB4_2_0_bool29) {__CLR4_2_05p75p7lnxz22qp.R.inc(8323);__CLB4_2_0_bool29=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8324);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8325);t.createDoctypePending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8326);t.doctypePending.name.append(replacementChar);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8327);t.transition(DoctypeName);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8328);break;
                case eof:if (!__CLB4_2_0_bool29) {__CLR4_2_05p75p7lnxz22qp.R.inc(8329);__CLB4_2_0_bool29=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8330);t.eofError(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8331);t.createDoctypePending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8332);t.doctypePending.forceQuirks = true;
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8333);t.emitDoctypePending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8334);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8335);break;
                default:if (!__CLB4_2_0_bool29) {__CLR4_2_05p75p7lnxz22qp.R.inc(8336);__CLB4_2_0_bool29=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8337);t.createDoctypePending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8338);t.doctypePending.name.append(c);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8339);t.transition(DoctypeName);
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    DoctypeName {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(8340);
            __CLR4_2_05p75p7lnxz22qp.R.inc(8341);if ((((r.matchesLetter())&&(__CLR4_2_05p75p7lnxz22qp.R.iget(8342)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(8343)==0&false))) {{
                __CLR4_2_05p75p7lnxz22qp.R.inc(8344);String name = r.consumeLetterSequence();
                __CLR4_2_05p75p7lnxz22qp.R.inc(8345);t.doctypePending.name.append(name);
                __CLR4_2_05p75p7lnxz22qp.R.inc(8346);return;
            }
            }__CLR4_2_05p75p7lnxz22qp.R.inc(8347);char c = r.consume();
            boolean __CLB4_2_0_bool30=false;__CLR4_2_05p75p7lnxz22qp.R.inc(8348);switch (c) {
                case '>':if (!__CLB4_2_0_bool30) {__CLR4_2_05p75p7lnxz22qp.R.inc(8349);__CLB4_2_0_bool30=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8350);t.emitDoctypePending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8351);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8352);break;
                case '\t':if (!__CLB4_2_0_bool30) {__CLR4_2_05p75p7lnxz22qp.R.inc(8353);__CLB4_2_0_bool30=true;}
                case '\n':if (!__CLB4_2_0_bool30) {__CLR4_2_05p75p7lnxz22qp.R.inc(8354);__CLB4_2_0_bool30=true;}
                case '\r':if (!__CLB4_2_0_bool30) {__CLR4_2_05p75p7lnxz22qp.R.inc(8355);__CLB4_2_0_bool30=true;}
                case '\f':if (!__CLB4_2_0_bool30) {__CLR4_2_05p75p7lnxz22qp.R.inc(8356);__CLB4_2_0_bool30=true;}
                case ' ':if (!__CLB4_2_0_bool30) {__CLR4_2_05p75p7lnxz22qp.R.inc(8357);__CLB4_2_0_bool30=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8358);t.transition(AfterDoctypeName);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8359);break;
                case nullChar:if (!__CLB4_2_0_bool30) {__CLR4_2_05p75p7lnxz22qp.R.inc(8360);__CLB4_2_0_bool30=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8361);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8362);t.doctypePending.name.append(replacementChar);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8363);break;
                case eof:if (!__CLB4_2_0_bool30) {__CLR4_2_05p75p7lnxz22qp.R.inc(8364);__CLB4_2_0_bool30=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8365);t.eofError(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8366);t.doctypePending.forceQuirks = true;
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8367);t.emitDoctypePending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8368);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8369);break;
                default:if (!__CLB4_2_0_bool30) {__CLR4_2_05p75p7lnxz22qp.R.inc(8370);__CLB4_2_0_bool30=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8371);t.doctypePending.name.append(c);
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    AfterDoctypeName {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(8372);
            __CLR4_2_05p75p7lnxz22qp.R.inc(8373);if ((((r.isEmpty())&&(__CLR4_2_05p75p7lnxz22qp.R.iget(8374)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(8375)==0&false))) {{
                __CLR4_2_05p75p7lnxz22qp.R.inc(8376);t.eofError(this);
                __CLR4_2_05p75p7lnxz22qp.R.inc(8377);t.doctypePending.forceQuirks = true;
                __CLR4_2_05p75p7lnxz22qp.R.inc(8378);t.emitDoctypePending();
                __CLR4_2_05p75p7lnxz22qp.R.inc(8379);t.transition(Data);
                __CLR4_2_05p75p7lnxz22qp.R.inc(8380);return;
            }
            }__CLR4_2_05p75p7lnxz22qp.R.inc(8381);if ((((r.matchesAny('\t', '\n', '\r', '\f', ' '))&&(__CLR4_2_05p75p7lnxz22qp.R.iget(8382)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(8383)==0&false)))
                {__CLR4_2_05p75p7lnxz22qp.R.inc(8384);r.advance(); // ignore whitespace
            }else {__CLR4_2_05p75p7lnxz22qp.R.inc(8385);if ((((r.matches('>'))&&(__CLR4_2_05p75p7lnxz22qp.R.iget(8386)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(8387)==0&false))) {{
                __CLR4_2_05p75p7lnxz22qp.R.inc(8388);t.emitDoctypePending();
                __CLR4_2_05p75p7lnxz22qp.R.inc(8389);t.advanceTransition(Data);
            } }else {__CLR4_2_05p75p7lnxz22qp.R.inc(8390);if ((((r.matchConsumeIgnoreCase(DocumentType.PUBLIC_KEY))&&(__CLR4_2_05p75p7lnxz22qp.R.iget(8391)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(8392)==0&false))) {{
                __CLR4_2_05p75p7lnxz22qp.R.inc(8393);t.doctypePending.pubSysKey = DocumentType.PUBLIC_KEY;
                __CLR4_2_05p75p7lnxz22qp.R.inc(8394);t.transition(AfterDoctypePublicKeyword);
            } }else {__CLR4_2_05p75p7lnxz22qp.R.inc(8395);if ((((r.matchConsumeIgnoreCase(DocumentType.SYSTEM_KEY))&&(__CLR4_2_05p75p7lnxz22qp.R.iget(8396)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(8397)==0&false))) {{
                __CLR4_2_05p75p7lnxz22qp.R.inc(8398);t.doctypePending.pubSysKey = DocumentType.SYSTEM_KEY;
                __CLR4_2_05p75p7lnxz22qp.R.inc(8399);t.transition(AfterDoctypeSystemKeyword);
            } }else {{
                __CLR4_2_05p75p7lnxz22qp.R.inc(8400);t.error(this);
                __CLR4_2_05p75p7lnxz22qp.R.inc(8401);t.doctypePending.forceQuirks = true;
                __CLR4_2_05p75p7lnxz22qp.R.inc(8402);t.advanceTransition(BogusDoctype);
            }

        }}}}}finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    AfterDoctypePublicKeyword {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(8403);
            __CLR4_2_05p75p7lnxz22qp.R.inc(8404);char c = r.consume();
            boolean __CLB4_2_0_bool31=false;__CLR4_2_05p75p7lnxz22qp.R.inc(8405);switch (c) {
                case '\t':if (!__CLB4_2_0_bool31) {__CLR4_2_05p75p7lnxz22qp.R.inc(8406);__CLB4_2_0_bool31=true;}
                case '\n':if (!__CLB4_2_0_bool31) {__CLR4_2_05p75p7lnxz22qp.R.inc(8407);__CLB4_2_0_bool31=true;}
                case '\r':if (!__CLB4_2_0_bool31) {__CLR4_2_05p75p7lnxz22qp.R.inc(8408);__CLB4_2_0_bool31=true;}
                case '\f':if (!__CLB4_2_0_bool31) {__CLR4_2_05p75p7lnxz22qp.R.inc(8409);__CLB4_2_0_bool31=true;}
                case ' ':if (!__CLB4_2_0_bool31) {__CLR4_2_05p75p7lnxz22qp.R.inc(8410);__CLB4_2_0_bool31=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8411);t.transition(BeforeDoctypePublicIdentifier);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8412);break;
                case '"':if (!__CLB4_2_0_bool31) {__CLR4_2_05p75p7lnxz22qp.R.inc(8413);__CLB4_2_0_bool31=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8414);t.error(this);
                    // set public id to empty string
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8415);t.transition(DoctypePublicIdentifier_doubleQuoted);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8416);break;
                case '\'':if (!__CLB4_2_0_bool31) {__CLR4_2_05p75p7lnxz22qp.R.inc(8417);__CLB4_2_0_bool31=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8418);t.error(this);
                    // set public id to empty string
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8419);t.transition(DoctypePublicIdentifier_singleQuoted);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8420);break;
                case '>':if (!__CLB4_2_0_bool31) {__CLR4_2_05p75p7lnxz22qp.R.inc(8421);__CLB4_2_0_bool31=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8422);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8423);t.doctypePending.forceQuirks = true;
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8424);t.emitDoctypePending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8425);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8426);break;
                case eof:if (!__CLB4_2_0_bool31) {__CLR4_2_05p75p7lnxz22qp.R.inc(8427);__CLB4_2_0_bool31=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8428);t.eofError(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8429);t.doctypePending.forceQuirks = true;
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8430);t.emitDoctypePending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8431);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8432);break;
                default:if (!__CLB4_2_0_bool31) {__CLR4_2_05p75p7lnxz22qp.R.inc(8433);__CLB4_2_0_bool31=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8434);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8435);t.doctypePending.forceQuirks = true;
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8436);t.transition(BogusDoctype);
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    BeforeDoctypePublicIdentifier {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(8437);
            __CLR4_2_05p75p7lnxz22qp.R.inc(8438);char c = r.consume();
            boolean __CLB4_2_0_bool32=false;__CLR4_2_05p75p7lnxz22qp.R.inc(8439);switch (c) {
                case '\t':if (!__CLB4_2_0_bool32) {__CLR4_2_05p75p7lnxz22qp.R.inc(8440);__CLB4_2_0_bool32=true;}
                case '\n':if (!__CLB4_2_0_bool32) {__CLR4_2_05p75p7lnxz22qp.R.inc(8441);__CLB4_2_0_bool32=true;}
                case '\r':if (!__CLB4_2_0_bool32) {__CLR4_2_05p75p7lnxz22qp.R.inc(8442);__CLB4_2_0_bool32=true;}
                case '\f':if (!__CLB4_2_0_bool32) {__CLR4_2_05p75p7lnxz22qp.R.inc(8443);__CLB4_2_0_bool32=true;}
                case ' ':if (!__CLB4_2_0_bool32) {__CLR4_2_05p75p7lnxz22qp.R.inc(8444);__CLB4_2_0_bool32=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8445);break;
                case '"':if (!__CLB4_2_0_bool32) {__CLR4_2_05p75p7lnxz22qp.R.inc(8446);__CLB4_2_0_bool32=true;}
                    // set public id to empty string
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8447);t.transition(DoctypePublicIdentifier_doubleQuoted);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8448);break;
                case '\'':if (!__CLB4_2_0_bool32) {__CLR4_2_05p75p7lnxz22qp.R.inc(8449);__CLB4_2_0_bool32=true;}
                    // set public id to empty string
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8450);t.transition(DoctypePublicIdentifier_singleQuoted);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8451);break;
                case '>':if (!__CLB4_2_0_bool32) {__CLR4_2_05p75p7lnxz22qp.R.inc(8452);__CLB4_2_0_bool32=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8453);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8454);t.doctypePending.forceQuirks = true;
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8455);t.emitDoctypePending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8456);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8457);break;
                case eof:if (!__CLB4_2_0_bool32) {__CLR4_2_05p75p7lnxz22qp.R.inc(8458);__CLB4_2_0_bool32=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8459);t.eofError(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8460);t.doctypePending.forceQuirks = true;
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8461);t.emitDoctypePending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8462);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8463);break;
                default:if (!__CLB4_2_0_bool32) {__CLR4_2_05p75p7lnxz22qp.R.inc(8464);__CLB4_2_0_bool32=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8465);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8466);t.doctypePending.forceQuirks = true;
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8467);t.transition(BogusDoctype);
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    DoctypePublicIdentifier_doubleQuoted {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(8468);
            __CLR4_2_05p75p7lnxz22qp.R.inc(8469);char c = r.consume();
            boolean __CLB4_2_0_bool33=false;__CLR4_2_05p75p7lnxz22qp.R.inc(8470);switch (c) {
                case '"':if (!__CLB4_2_0_bool33) {__CLR4_2_05p75p7lnxz22qp.R.inc(8471);__CLB4_2_0_bool33=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8472);t.transition(AfterDoctypePublicIdentifier);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8473);break;
                case nullChar:if (!__CLB4_2_0_bool33) {__CLR4_2_05p75p7lnxz22qp.R.inc(8474);__CLB4_2_0_bool33=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8475);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8476);t.doctypePending.publicIdentifier.append(replacementChar);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8477);break;
                case '>':if (!__CLB4_2_0_bool33) {__CLR4_2_05p75p7lnxz22qp.R.inc(8478);__CLB4_2_0_bool33=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8479);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8480);t.doctypePending.forceQuirks = true;
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8481);t.emitDoctypePending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8482);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8483);break;
                case eof:if (!__CLB4_2_0_bool33) {__CLR4_2_05p75p7lnxz22qp.R.inc(8484);__CLB4_2_0_bool33=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8485);t.eofError(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8486);t.doctypePending.forceQuirks = true;
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8487);t.emitDoctypePending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8488);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8489);break;
                default:if (!__CLB4_2_0_bool33) {__CLR4_2_05p75p7lnxz22qp.R.inc(8490);__CLB4_2_0_bool33=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8491);t.doctypePending.publicIdentifier.append(c);
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    DoctypePublicIdentifier_singleQuoted {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(8492);
            __CLR4_2_05p75p7lnxz22qp.R.inc(8493);char c = r.consume();
            boolean __CLB4_2_0_bool34=false;__CLR4_2_05p75p7lnxz22qp.R.inc(8494);switch (c) {
                case '\'':if (!__CLB4_2_0_bool34) {__CLR4_2_05p75p7lnxz22qp.R.inc(8495);__CLB4_2_0_bool34=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8496);t.transition(AfterDoctypePublicIdentifier);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8497);break;
                case nullChar:if (!__CLB4_2_0_bool34) {__CLR4_2_05p75p7lnxz22qp.R.inc(8498);__CLB4_2_0_bool34=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8499);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8500);t.doctypePending.publicIdentifier.append(replacementChar);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8501);break;
                case '>':if (!__CLB4_2_0_bool34) {__CLR4_2_05p75p7lnxz22qp.R.inc(8502);__CLB4_2_0_bool34=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8503);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8504);t.doctypePending.forceQuirks = true;
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8505);t.emitDoctypePending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8506);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8507);break;
                case eof:if (!__CLB4_2_0_bool34) {__CLR4_2_05p75p7lnxz22qp.R.inc(8508);__CLB4_2_0_bool34=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8509);t.eofError(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8510);t.doctypePending.forceQuirks = true;
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8511);t.emitDoctypePending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8512);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8513);break;
                default:if (!__CLB4_2_0_bool34) {__CLR4_2_05p75p7lnxz22qp.R.inc(8514);__CLB4_2_0_bool34=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8515);t.doctypePending.publicIdentifier.append(c);
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    AfterDoctypePublicIdentifier {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(8516);
            __CLR4_2_05p75p7lnxz22qp.R.inc(8517);char c = r.consume();
            boolean __CLB4_2_0_bool35=false;__CLR4_2_05p75p7lnxz22qp.R.inc(8518);switch (c) {
                case '\t':if (!__CLB4_2_0_bool35) {__CLR4_2_05p75p7lnxz22qp.R.inc(8519);__CLB4_2_0_bool35=true;}
                case '\n':if (!__CLB4_2_0_bool35) {__CLR4_2_05p75p7lnxz22qp.R.inc(8520);__CLB4_2_0_bool35=true;}
                case '\r':if (!__CLB4_2_0_bool35) {__CLR4_2_05p75p7lnxz22qp.R.inc(8521);__CLB4_2_0_bool35=true;}
                case '\f':if (!__CLB4_2_0_bool35) {__CLR4_2_05p75p7lnxz22qp.R.inc(8522);__CLB4_2_0_bool35=true;}
                case ' ':if (!__CLB4_2_0_bool35) {__CLR4_2_05p75p7lnxz22qp.R.inc(8523);__CLB4_2_0_bool35=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8524);t.transition(BetweenDoctypePublicAndSystemIdentifiers);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8525);break;
                case '>':if (!__CLB4_2_0_bool35) {__CLR4_2_05p75p7lnxz22qp.R.inc(8526);__CLB4_2_0_bool35=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8527);t.emitDoctypePending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8528);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8529);break;
                case '"':if (!__CLB4_2_0_bool35) {__CLR4_2_05p75p7lnxz22qp.R.inc(8530);__CLB4_2_0_bool35=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8531);t.error(this);
                    // system id empty
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8532);t.transition(DoctypeSystemIdentifier_doubleQuoted);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8533);break;
                case '\'':if (!__CLB4_2_0_bool35) {__CLR4_2_05p75p7lnxz22qp.R.inc(8534);__CLB4_2_0_bool35=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8535);t.error(this);
                    // system id empty
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8536);t.transition(DoctypeSystemIdentifier_singleQuoted);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8537);break;
                case eof:if (!__CLB4_2_0_bool35) {__CLR4_2_05p75p7lnxz22qp.R.inc(8538);__CLB4_2_0_bool35=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8539);t.eofError(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8540);t.doctypePending.forceQuirks = true;
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8541);t.emitDoctypePending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8542);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8543);break;
                default:if (!__CLB4_2_0_bool35) {__CLR4_2_05p75p7lnxz22qp.R.inc(8544);__CLB4_2_0_bool35=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8545);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8546);t.doctypePending.forceQuirks = true;
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8547);t.transition(BogusDoctype);
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    BetweenDoctypePublicAndSystemIdentifiers {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(8548);
            __CLR4_2_05p75p7lnxz22qp.R.inc(8549);char c = r.consume();
            boolean __CLB4_2_0_bool36=false;__CLR4_2_05p75p7lnxz22qp.R.inc(8550);switch (c) {
                case '\t':if (!__CLB4_2_0_bool36) {__CLR4_2_05p75p7lnxz22qp.R.inc(8551);__CLB4_2_0_bool36=true;}
                case '\n':if (!__CLB4_2_0_bool36) {__CLR4_2_05p75p7lnxz22qp.R.inc(8552);__CLB4_2_0_bool36=true;}
                case '\r':if (!__CLB4_2_0_bool36) {__CLR4_2_05p75p7lnxz22qp.R.inc(8553);__CLB4_2_0_bool36=true;}
                case '\f':if (!__CLB4_2_0_bool36) {__CLR4_2_05p75p7lnxz22qp.R.inc(8554);__CLB4_2_0_bool36=true;}
                case ' ':if (!__CLB4_2_0_bool36) {__CLR4_2_05p75p7lnxz22qp.R.inc(8555);__CLB4_2_0_bool36=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8556);break;
                case '>':if (!__CLB4_2_0_bool36) {__CLR4_2_05p75p7lnxz22qp.R.inc(8557);__CLB4_2_0_bool36=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8558);t.emitDoctypePending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8559);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8560);break;
                case '"':if (!__CLB4_2_0_bool36) {__CLR4_2_05p75p7lnxz22qp.R.inc(8561);__CLB4_2_0_bool36=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8562);t.error(this);
                    // system id empty
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8563);t.transition(DoctypeSystemIdentifier_doubleQuoted);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8564);break;
                case '\'':if (!__CLB4_2_0_bool36) {__CLR4_2_05p75p7lnxz22qp.R.inc(8565);__CLB4_2_0_bool36=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8566);t.error(this);
                    // system id empty
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8567);t.transition(DoctypeSystemIdentifier_singleQuoted);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8568);break;
                case eof:if (!__CLB4_2_0_bool36) {__CLR4_2_05p75p7lnxz22qp.R.inc(8569);__CLB4_2_0_bool36=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8570);t.eofError(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8571);t.doctypePending.forceQuirks = true;
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8572);t.emitDoctypePending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8573);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8574);break;
                default:if (!__CLB4_2_0_bool36) {__CLR4_2_05p75p7lnxz22qp.R.inc(8575);__CLB4_2_0_bool36=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8576);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8577);t.doctypePending.forceQuirks = true;
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8578);t.transition(BogusDoctype);
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    AfterDoctypeSystemKeyword {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(8579);
            __CLR4_2_05p75p7lnxz22qp.R.inc(8580);char c = r.consume();
            boolean __CLB4_2_0_bool37=false;__CLR4_2_05p75p7lnxz22qp.R.inc(8581);switch (c) {
                case '\t':if (!__CLB4_2_0_bool37) {__CLR4_2_05p75p7lnxz22qp.R.inc(8582);__CLB4_2_0_bool37=true;}
                case '\n':if (!__CLB4_2_0_bool37) {__CLR4_2_05p75p7lnxz22qp.R.inc(8583);__CLB4_2_0_bool37=true;}
                case '\r':if (!__CLB4_2_0_bool37) {__CLR4_2_05p75p7lnxz22qp.R.inc(8584);__CLB4_2_0_bool37=true;}
                case '\f':if (!__CLB4_2_0_bool37) {__CLR4_2_05p75p7lnxz22qp.R.inc(8585);__CLB4_2_0_bool37=true;}
                case ' ':if (!__CLB4_2_0_bool37) {__CLR4_2_05p75p7lnxz22qp.R.inc(8586);__CLB4_2_0_bool37=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8587);t.transition(BeforeDoctypeSystemIdentifier);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8588);break;
                case '>':if (!__CLB4_2_0_bool37) {__CLR4_2_05p75p7lnxz22qp.R.inc(8589);__CLB4_2_0_bool37=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8590);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8591);t.doctypePending.forceQuirks = true;
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8592);t.emitDoctypePending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8593);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8594);break;
                case '"':if (!__CLB4_2_0_bool37) {__CLR4_2_05p75p7lnxz22qp.R.inc(8595);__CLB4_2_0_bool37=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8596);t.error(this);
                    // system id empty
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8597);t.transition(DoctypeSystemIdentifier_doubleQuoted);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8598);break;
                case '\'':if (!__CLB4_2_0_bool37) {__CLR4_2_05p75p7lnxz22qp.R.inc(8599);__CLB4_2_0_bool37=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8600);t.error(this);
                    // system id empty
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8601);t.transition(DoctypeSystemIdentifier_singleQuoted);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8602);break;
                case eof:if (!__CLB4_2_0_bool37) {__CLR4_2_05p75p7lnxz22qp.R.inc(8603);__CLB4_2_0_bool37=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8604);t.eofError(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8605);t.doctypePending.forceQuirks = true;
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8606);t.emitDoctypePending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8607);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8608);break;
                default:if (!__CLB4_2_0_bool37) {__CLR4_2_05p75p7lnxz22qp.R.inc(8609);__CLB4_2_0_bool37=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8610);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8611);t.doctypePending.forceQuirks = true;
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8612);t.emitDoctypePending();
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    BeforeDoctypeSystemIdentifier {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(8613);
            __CLR4_2_05p75p7lnxz22qp.R.inc(8614);char c = r.consume();
            boolean __CLB4_2_0_bool38=false;__CLR4_2_05p75p7lnxz22qp.R.inc(8615);switch (c) {
                case '\t':if (!__CLB4_2_0_bool38) {__CLR4_2_05p75p7lnxz22qp.R.inc(8616);__CLB4_2_0_bool38=true;}
                case '\n':if (!__CLB4_2_0_bool38) {__CLR4_2_05p75p7lnxz22qp.R.inc(8617);__CLB4_2_0_bool38=true;}
                case '\r':if (!__CLB4_2_0_bool38) {__CLR4_2_05p75p7lnxz22qp.R.inc(8618);__CLB4_2_0_bool38=true;}
                case '\f':if (!__CLB4_2_0_bool38) {__CLR4_2_05p75p7lnxz22qp.R.inc(8619);__CLB4_2_0_bool38=true;}
                case ' ':if (!__CLB4_2_0_bool38) {__CLR4_2_05p75p7lnxz22qp.R.inc(8620);__CLB4_2_0_bool38=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8621);break;
                case '"':if (!__CLB4_2_0_bool38) {__CLR4_2_05p75p7lnxz22qp.R.inc(8622);__CLB4_2_0_bool38=true;}
                    // set system id to empty string
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8623);t.transition(DoctypeSystemIdentifier_doubleQuoted);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8624);break;
                case '\'':if (!__CLB4_2_0_bool38) {__CLR4_2_05p75p7lnxz22qp.R.inc(8625);__CLB4_2_0_bool38=true;}
                    // set public id to empty string
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8626);t.transition(DoctypeSystemIdentifier_singleQuoted);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8627);break;
                case '>':if (!__CLB4_2_0_bool38) {__CLR4_2_05p75p7lnxz22qp.R.inc(8628);__CLB4_2_0_bool38=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8629);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8630);t.doctypePending.forceQuirks = true;
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8631);t.emitDoctypePending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8632);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8633);break;
                case eof:if (!__CLB4_2_0_bool38) {__CLR4_2_05p75p7lnxz22qp.R.inc(8634);__CLB4_2_0_bool38=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8635);t.eofError(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8636);t.doctypePending.forceQuirks = true;
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8637);t.emitDoctypePending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8638);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8639);break;
                default:if (!__CLB4_2_0_bool38) {__CLR4_2_05p75p7lnxz22qp.R.inc(8640);__CLB4_2_0_bool38=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8641);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8642);t.doctypePending.forceQuirks = true;
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8643);t.transition(BogusDoctype);
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    DoctypeSystemIdentifier_doubleQuoted {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(8644);
            __CLR4_2_05p75p7lnxz22qp.R.inc(8645);char c = r.consume();
            boolean __CLB4_2_0_bool39=false;__CLR4_2_05p75p7lnxz22qp.R.inc(8646);switch (c) {
                case '"':if (!__CLB4_2_0_bool39) {__CLR4_2_05p75p7lnxz22qp.R.inc(8647);__CLB4_2_0_bool39=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8648);t.transition(AfterDoctypeSystemIdentifier);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8649);break;
                case nullChar:if (!__CLB4_2_0_bool39) {__CLR4_2_05p75p7lnxz22qp.R.inc(8650);__CLB4_2_0_bool39=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8651);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8652);t.doctypePending.systemIdentifier.append(replacementChar);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8653);break;
                case '>':if (!__CLB4_2_0_bool39) {__CLR4_2_05p75p7lnxz22qp.R.inc(8654);__CLB4_2_0_bool39=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8655);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8656);t.doctypePending.forceQuirks = true;
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8657);t.emitDoctypePending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8658);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8659);break;
                case eof:if (!__CLB4_2_0_bool39) {__CLR4_2_05p75p7lnxz22qp.R.inc(8660);__CLB4_2_0_bool39=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8661);t.eofError(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8662);t.doctypePending.forceQuirks = true;
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8663);t.emitDoctypePending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8664);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8665);break;
                default:if (!__CLB4_2_0_bool39) {__CLR4_2_05p75p7lnxz22qp.R.inc(8666);__CLB4_2_0_bool39=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8667);t.doctypePending.systemIdentifier.append(c);
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    DoctypeSystemIdentifier_singleQuoted {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(8668);
            __CLR4_2_05p75p7lnxz22qp.R.inc(8669);char c = r.consume();
            boolean __CLB4_2_0_bool40=false;__CLR4_2_05p75p7lnxz22qp.R.inc(8670);switch (c) {
                case '\'':if (!__CLB4_2_0_bool40) {__CLR4_2_05p75p7lnxz22qp.R.inc(8671);__CLB4_2_0_bool40=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8672);t.transition(AfterDoctypeSystemIdentifier);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8673);break;
                case nullChar:if (!__CLB4_2_0_bool40) {__CLR4_2_05p75p7lnxz22qp.R.inc(8674);__CLB4_2_0_bool40=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8675);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8676);t.doctypePending.systemIdentifier.append(replacementChar);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8677);break;
                case '>':if (!__CLB4_2_0_bool40) {__CLR4_2_05p75p7lnxz22qp.R.inc(8678);__CLB4_2_0_bool40=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8679);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8680);t.doctypePending.forceQuirks = true;
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8681);t.emitDoctypePending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8682);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8683);break;
                case eof:if (!__CLB4_2_0_bool40) {__CLR4_2_05p75p7lnxz22qp.R.inc(8684);__CLB4_2_0_bool40=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8685);t.eofError(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8686);t.doctypePending.forceQuirks = true;
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8687);t.emitDoctypePending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8688);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8689);break;
                default:if (!__CLB4_2_0_bool40) {__CLR4_2_05p75p7lnxz22qp.R.inc(8690);__CLB4_2_0_bool40=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8691);t.doctypePending.systemIdentifier.append(c);
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    AfterDoctypeSystemIdentifier {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(8692);
            __CLR4_2_05p75p7lnxz22qp.R.inc(8693);char c = r.consume();
            boolean __CLB4_2_0_bool41=false;__CLR4_2_05p75p7lnxz22qp.R.inc(8694);switch (c) {
                case '\t':if (!__CLB4_2_0_bool41) {__CLR4_2_05p75p7lnxz22qp.R.inc(8695);__CLB4_2_0_bool41=true;}
                case '\n':if (!__CLB4_2_0_bool41) {__CLR4_2_05p75p7lnxz22qp.R.inc(8696);__CLB4_2_0_bool41=true;}
                case '\r':if (!__CLB4_2_0_bool41) {__CLR4_2_05p75p7lnxz22qp.R.inc(8697);__CLB4_2_0_bool41=true;}
                case '\f':if (!__CLB4_2_0_bool41) {__CLR4_2_05p75p7lnxz22qp.R.inc(8698);__CLB4_2_0_bool41=true;}
                case ' ':if (!__CLB4_2_0_bool41) {__CLR4_2_05p75p7lnxz22qp.R.inc(8699);__CLB4_2_0_bool41=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8700);break;
                case '>':if (!__CLB4_2_0_bool41) {__CLR4_2_05p75p7lnxz22qp.R.inc(8701);__CLB4_2_0_bool41=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8702);t.emitDoctypePending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8703);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8704);break;
                case eof:if (!__CLB4_2_0_bool41) {__CLR4_2_05p75p7lnxz22qp.R.inc(8705);__CLB4_2_0_bool41=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8706);t.eofError(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8707);t.doctypePending.forceQuirks = true;
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8708);t.emitDoctypePending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8709);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8710);break;
                default:if (!__CLB4_2_0_bool41) {__CLR4_2_05p75p7lnxz22qp.R.inc(8711);__CLB4_2_0_bool41=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8712);t.error(this);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8713);t.transition(BogusDoctype);
                    // NOT force quirks
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    BogusDoctype {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(8714);
            __CLR4_2_05p75p7lnxz22qp.R.inc(8715);char c = r.consume();
            boolean __CLB4_2_0_bool42=false;__CLR4_2_05p75p7lnxz22qp.R.inc(8716);switch (c) {
                case '>':if (!__CLB4_2_0_bool42) {__CLR4_2_05p75p7lnxz22qp.R.inc(8717);__CLB4_2_0_bool42=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8718);t.emitDoctypePending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8719);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8720);break;
                case eof:if (!__CLB4_2_0_bool42) {__CLR4_2_05p75p7lnxz22qp.R.inc(8721);__CLB4_2_0_bool42=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8722);t.emitDoctypePending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8723);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8724);break;
                default:if (!__CLB4_2_0_bool42) {__CLR4_2_05p75p7lnxz22qp.R.inc(8725);__CLB4_2_0_bool42=true;}
                    // ignore char
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8726);break;
            }
        }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    },
    CdataSection {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(8727);
            __CLR4_2_05p75p7lnxz22qp.R.inc(8728);String data = r.consumeTo("]]>");
            __CLR4_2_05p75p7lnxz22qp.R.inc(8729);t.dataBuffer.append(data);
            __CLR4_2_05p75p7lnxz22qp.R.inc(8730);if ((((r.matchConsume("]]>") || r.isEmpty())&&(__CLR4_2_05p75p7lnxz22qp.R.iget(8731)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(8732)==0&false))) {{
                __CLR4_2_05p75p7lnxz22qp.R.inc(8733);t.emit(new Token.CData(t.dataBuffer.toString()));
                __CLR4_2_05p75p7lnxz22qp.R.inc(8734);t.transition(Data);
            }// otherwise, buffer underrun, stay in data section
        }}finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
    };


    abstract void read(Tokeniser t, CharacterReader r);

    static final char nullChar = '\u0000';
    // char searches. must be sorted, used in inSorted. MUST update TokenisetStateTest if more arrays are added.
    static final char[] attributeSingleValueCharsSorted = new char[]{nullChar, '&', '\''};
    static final char[] attributeDoubleValueCharsSorted = new char[]{nullChar, '"', '&'};
    static final char[] attributeNameCharsSorted = new char[]{nullChar, '\t', '\n', '\f', '\r', ' ', '"', '\'', '/', '<', '=', '>'};
    static final char[] attributeValueUnquoted = new char[]{nullChar, '\t', '\n', '\f', '\r', ' ', '"', '&', '\'', '<', '=', '>', '`'};

    private static final char replacementChar = Tokeniser.replacementChar;
    private static final String replacementStr = String.valueOf(Tokeniser.replacementChar);
    private static final char eof = CharacterReader.EOF;

    /**
     * Handles RawtextEndTagName, ScriptDataEndTagName, and ScriptDataEscapedEndTagName. Same body impl, just
     * different else exit transitions.
     */
    private static void handleDataEndTag(Tokeniser t, CharacterReader r, TokeniserState elseTransition) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(8735);
        __CLR4_2_05p75p7lnxz22qp.R.inc(8736);if ((((r.matchesLetter())&&(__CLR4_2_05p75p7lnxz22qp.R.iget(8737)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(8738)==0&false))) {{
            __CLR4_2_05p75p7lnxz22qp.R.inc(8739);String name = r.consumeLetterSequence();
            __CLR4_2_05p75p7lnxz22qp.R.inc(8740);t.tagPending.appendTagName(name);
            __CLR4_2_05p75p7lnxz22qp.R.inc(8741);t.dataBuffer.append(name);
            __CLR4_2_05p75p7lnxz22qp.R.inc(8742);return;
        }

        }__CLR4_2_05p75p7lnxz22qp.R.inc(8743);boolean needsExitTransition = false;
        __CLR4_2_05p75p7lnxz22qp.R.inc(8744);if ((((t.isAppropriateEndTagToken() && !r.isEmpty())&&(__CLR4_2_05p75p7lnxz22qp.R.iget(8745)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(8746)==0&false))) {{
            __CLR4_2_05p75p7lnxz22qp.R.inc(8747);char c = r.consume();
            boolean __CLB4_2_0_bool43=false;__CLR4_2_05p75p7lnxz22qp.R.inc(8748);switch (c) {
                case '\t':if (!__CLB4_2_0_bool43) {__CLR4_2_05p75p7lnxz22qp.R.inc(8749);__CLB4_2_0_bool43=true;}
                case '\n':if (!__CLB4_2_0_bool43) {__CLR4_2_05p75p7lnxz22qp.R.inc(8750);__CLB4_2_0_bool43=true;}
                case '\r':if (!__CLB4_2_0_bool43) {__CLR4_2_05p75p7lnxz22qp.R.inc(8751);__CLB4_2_0_bool43=true;}
                case '\f':if (!__CLB4_2_0_bool43) {__CLR4_2_05p75p7lnxz22qp.R.inc(8752);__CLB4_2_0_bool43=true;}
                case ' ':if (!__CLB4_2_0_bool43) {__CLR4_2_05p75p7lnxz22qp.R.inc(8753);__CLB4_2_0_bool43=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8754);t.transition(BeforeAttributeName);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8755);break;
                case '/':if (!__CLB4_2_0_bool43) {__CLR4_2_05p75p7lnxz22qp.R.inc(8756);__CLB4_2_0_bool43=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8757);t.transition(SelfClosingStartTag);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8758);break;
                case '>':if (!__CLB4_2_0_bool43) {__CLR4_2_05p75p7lnxz22qp.R.inc(8759);__CLB4_2_0_bool43=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8760);t.emitTagPending();
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8761);t.transition(Data);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8762);break;
                default:if (!__CLB4_2_0_bool43) {__CLR4_2_05p75p7lnxz22qp.R.inc(8763);__CLB4_2_0_bool43=true;}
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8764);t.dataBuffer.append(c);
                    __CLR4_2_05p75p7lnxz22qp.R.inc(8765);needsExitTransition = true;
            }
        } }else {{
            __CLR4_2_05p75p7lnxz22qp.R.inc(8766);needsExitTransition = true;
        }

        }__CLR4_2_05p75p7lnxz22qp.R.inc(8767);if ((((needsExitTransition)&&(__CLR4_2_05p75p7lnxz22qp.R.iget(8768)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(8769)==0&false))) {{
            __CLR4_2_05p75p7lnxz22qp.R.inc(8770);t.emit("</" + t.dataBuffer.toString());
            __CLR4_2_05p75p7lnxz22qp.R.inc(8771);t.transition(elseTransition);
        }
    }}finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}

    private static void readData(Tokeniser t, CharacterReader r, TokeniserState current, TokeniserState advance) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(8772);
        boolean __CLB4_2_0_bool44=false;__CLR4_2_05p75p7lnxz22qp.R.inc(8773);switch (r.current()) {
            case '<':if (!__CLB4_2_0_bool44) {__CLR4_2_05p75p7lnxz22qp.R.inc(8774);__CLB4_2_0_bool44=true;}
                __CLR4_2_05p75p7lnxz22qp.R.inc(8775);t.advanceTransition(advance);
                __CLR4_2_05p75p7lnxz22qp.R.inc(8776);break;
            case nullChar:if (!__CLB4_2_0_bool44) {__CLR4_2_05p75p7lnxz22qp.R.inc(8777);__CLB4_2_0_bool44=true;}
                __CLR4_2_05p75p7lnxz22qp.R.inc(8778);t.error(current);
                __CLR4_2_05p75p7lnxz22qp.R.inc(8779);r.advance();
                __CLR4_2_05p75p7lnxz22qp.R.inc(8780);t.emit(replacementChar);
                __CLR4_2_05p75p7lnxz22qp.R.inc(8781);break;
            case eof:if (!__CLB4_2_0_bool44) {__CLR4_2_05p75p7lnxz22qp.R.inc(8782);__CLB4_2_0_bool44=true;}
                __CLR4_2_05p75p7lnxz22qp.R.inc(8783);t.emit(new Token.EOF());
                __CLR4_2_05p75p7lnxz22qp.R.inc(8784);break;
            default:if (!__CLB4_2_0_bool44) {__CLR4_2_05p75p7lnxz22qp.R.inc(8785);__CLB4_2_0_bool44=true;}
                __CLR4_2_05p75p7lnxz22qp.R.inc(8786);String data = r.consumeToAny('<', nullChar); // todo - why hunt for null here? Just consumeTo'<'?
                __CLR4_2_05p75p7lnxz22qp.R.inc(8787);t.emit(data);
                __CLR4_2_05p75p7lnxz22qp.R.inc(8788);break;
        }
    }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}

    private static void readCharRef(Tokeniser t, TokeniserState advance) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(8789);
        __CLR4_2_05p75p7lnxz22qp.R.inc(8790);int[] c = t.consumeCharacterReference(null, false);
        __CLR4_2_05p75p7lnxz22qp.R.inc(8791);if ((((c == null)&&(__CLR4_2_05p75p7lnxz22qp.R.iget(8792)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(8793)==0&false)))
            {__CLR4_2_05p75p7lnxz22qp.R.inc(8794);t.emit('&');
        }else
            {__CLR4_2_05p75p7lnxz22qp.R.inc(8795);t.emit(c);
        }__CLR4_2_05p75p7lnxz22qp.R.inc(8796);t.transition(advance);
    }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}

    private static void readEndTag(Tokeniser t, CharacterReader r, TokeniserState a, TokeniserState b) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(8797);
        __CLR4_2_05p75p7lnxz22qp.R.inc(8798);if ((((r.matchesLetter())&&(__CLR4_2_05p75p7lnxz22qp.R.iget(8799)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(8800)==0&false))) {{
            __CLR4_2_05p75p7lnxz22qp.R.inc(8801);t.createTagPending(false);
            __CLR4_2_05p75p7lnxz22qp.R.inc(8802);t.transition(a);
        } }else {{
            __CLR4_2_05p75p7lnxz22qp.R.inc(8803);t.emit("</");
            __CLR4_2_05p75p7lnxz22qp.R.inc(8804);t.transition(b);
        }
    }}finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}

    private static void handleDataDoubleEscapeTag(Tokeniser t, CharacterReader r, TokeniserState primary, TokeniserState fallback) {try{__CLR4_2_05p75p7lnxz22qp.R.inc(8805);
        __CLR4_2_05p75p7lnxz22qp.R.inc(8806);if ((((r.matchesLetter())&&(__CLR4_2_05p75p7lnxz22qp.R.iget(8807)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(8808)==0&false))) {{
            __CLR4_2_05p75p7lnxz22qp.R.inc(8809);String name = r.consumeLetterSequence();
            __CLR4_2_05p75p7lnxz22qp.R.inc(8810);t.dataBuffer.append(name);
            __CLR4_2_05p75p7lnxz22qp.R.inc(8811);t.emit(name);
            __CLR4_2_05p75p7lnxz22qp.R.inc(8812);return;
        }

        }__CLR4_2_05p75p7lnxz22qp.R.inc(8813);char c = r.consume();
        boolean __CLB4_2_0_bool45=false;__CLR4_2_05p75p7lnxz22qp.R.inc(8814);switch (c) {
            case '\t':if (!__CLB4_2_0_bool45) {__CLR4_2_05p75p7lnxz22qp.R.inc(8815);__CLB4_2_0_bool45=true;}
            case '\n':if (!__CLB4_2_0_bool45) {__CLR4_2_05p75p7lnxz22qp.R.inc(8816);__CLB4_2_0_bool45=true;}
            case '\r':if (!__CLB4_2_0_bool45) {__CLR4_2_05p75p7lnxz22qp.R.inc(8817);__CLB4_2_0_bool45=true;}
            case '\f':if (!__CLB4_2_0_bool45) {__CLR4_2_05p75p7lnxz22qp.R.inc(8818);__CLB4_2_0_bool45=true;}
            case ' ':if (!__CLB4_2_0_bool45) {__CLR4_2_05p75p7lnxz22qp.R.inc(8819);__CLB4_2_0_bool45=true;}
            case '/':if (!__CLB4_2_0_bool45) {__CLR4_2_05p75p7lnxz22qp.R.inc(8820);__CLB4_2_0_bool45=true;}
            case '>':if (!__CLB4_2_0_bool45) {__CLR4_2_05p75p7lnxz22qp.R.inc(8821);__CLB4_2_0_bool45=true;}
                __CLR4_2_05p75p7lnxz22qp.R.inc(8822);if ((((t.dataBuffer.toString().equals("script"))&&(__CLR4_2_05p75p7lnxz22qp.R.iget(8823)!=0|true))||(__CLR4_2_05p75p7lnxz22qp.R.iget(8824)==0&false)))
                    {__CLR4_2_05p75p7lnxz22qp.R.inc(8825);t.transition(primary);
                }else
                    {__CLR4_2_05p75p7lnxz22qp.R.inc(8826);t.transition(fallback);
                }__CLR4_2_05p75p7lnxz22qp.R.inc(8827);t.emit(c);
                __CLR4_2_05p75p7lnxz22qp.R.inc(8828);break;
            default:if (!__CLB4_2_0_bool45) {__CLR4_2_05p75p7lnxz22qp.R.inc(8829);__CLB4_2_0_bool45=true;}
                __CLR4_2_05p75p7lnxz22qp.R.inc(8830);r.unconsume();
                __CLR4_2_05p75p7lnxz22qp.R.inc(8831);t.transition(fallback);
        }
    }finally{__CLR4_2_05p75p7lnxz22qp.R.flushNeeded();}}
;public static class __CLR4_2_05p75p7lnxz22qp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,8832,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;}
