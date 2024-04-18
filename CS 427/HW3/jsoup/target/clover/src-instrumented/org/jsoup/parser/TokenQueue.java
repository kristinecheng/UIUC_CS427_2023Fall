/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.parser;

import org.jsoup.internal.StringUtil;
import org.jsoup.helper.*;
import org.jsoup.examples.HtmlToPlainText;;

/**
 * A character queue with parsing helpers.
 *
 * @author Jonathan Hedley
 */
public class TokenQueue {public static class __CLR4_2_05cp5cplnxz22pk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,7173,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private String queue;
    private int pos = 0;
    
    private static final char ESC = '\\'; // escape char for chomp balanced.

    /**
     Create a new TokenQueue.
     @param data string of data to back queue.
     */
    public TokenQueue(String data) {try{__CLR4_2_05cp5cplnxz22pk.R.inc(6937);
        __CLR4_2_05cp5cplnxz22pk.R.inc(6938);Validate.notNull(data);
        __CLR4_2_05cp5cplnxz22pk.R.inc(6939);queue = data;
    }finally{__CLR4_2_05cp5cplnxz22pk.R.flushNeeded();}}

    /**
     * Is the queue empty?
     * @return true if no data left in queue.
     */
    public boolean isEmpty() {try{__CLR4_2_05cp5cplnxz22pk.R.inc(6940);
        __CLR4_2_05cp5cplnxz22pk.R.inc(6941);return remainingLength() == 0;
    }finally{__CLR4_2_05cp5cplnxz22pk.R.flushNeeded();}}
    
    private int remainingLength() {try{__CLR4_2_05cp5cplnxz22pk.R.inc(6942);
        __CLR4_2_05cp5cplnxz22pk.R.inc(6943);return queue.length() - pos;
    }finally{__CLR4_2_05cp5cplnxz22pk.R.flushNeeded();}}

    /**
     * Retrieves but does not remove the first character from the queue.
     * @return First character, or 0 if empty.
     */
    public char peek() {try{__CLR4_2_05cp5cplnxz22pk.R.inc(6944);
        __CLR4_2_05cp5cplnxz22pk.R.inc(6945);return (((isEmpty() )&&(__CLR4_2_05cp5cplnxz22pk.R.iget(6946)!=0|true))||(__CLR4_2_05cp5cplnxz22pk.R.iget(6947)==0&false))? 0 : queue.charAt(pos);
    }finally{__CLR4_2_05cp5cplnxz22pk.R.flushNeeded();}}

    /**
     Add a character to the start of the queue (will be the next character retrieved).
     @param c character to add
     */
    public void addFirst(Character c) {try{__CLR4_2_05cp5cplnxz22pk.R.inc(6948);
        __CLR4_2_05cp5cplnxz22pk.R.inc(6949);addFirst(c.toString());
    }finally{__CLR4_2_05cp5cplnxz22pk.R.flushNeeded();}}

    /**
     Add a string to the start of the queue.
     @param seq string to add.
     */
    public void addFirst(String seq) {try{__CLR4_2_05cp5cplnxz22pk.R.inc(6950);
        // not very performant, but an edge case
        __CLR4_2_05cp5cplnxz22pk.R.inc(6951);queue = seq + queue.substring(pos);
        __CLR4_2_05cp5cplnxz22pk.R.inc(6952);pos = 0;
    }finally{__CLR4_2_05cp5cplnxz22pk.R.flushNeeded();}}

    /**
     * Tests if the next characters on the queue match the sequence. Case insensitive.
     * @param seq String to check queue for.
     * @return true if the next characters match.
     */
    public boolean matches(String seq) {try{__CLR4_2_05cp5cplnxz22pk.R.inc(6953);
        __CLR4_2_05cp5cplnxz22pk.R.inc(6954);return queue.regionMatches(true, pos, seq, 0, seq.length());
    }finally{__CLR4_2_05cp5cplnxz22pk.R.flushNeeded();}}

    /**
     * Case sensitive match test.
     * @param seq string to case sensitively check for
     * @return true if matched, false if not
     */
    public boolean matchesCS(String seq) {try{__CLR4_2_05cp5cplnxz22pk.R.inc(6955);
        __CLR4_2_05cp5cplnxz22pk.R.inc(6956);return queue.startsWith(seq, pos);
    }finally{__CLR4_2_05cp5cplnxz22pk.R.flushNeeded();}}
    

    /**
     Tests if the next characters match any of the sequences. Case insensitive.
     @param seq list of strings to case insensitively check for
     @return true of any matched, false if none did
     */
    public boolean matchesAny(String... seq) {try{__CLR4_2_05cp5cplnxz22pk.R.inc(6957);
        __CLR4_2_05cp5cplnxz22pk.R.inc(6958);for (String s : seq) {{
            __CLR4_2_05cp5cplnxz22pk.R.inc(6959);if ((((matches(s))&&(__CLR4_2_05cp5cplnxz22pk.R.iget(6960)!=0|true))||(__CLR4_2_05cp5cplnxz22pk.R.iget(6961)==0&false)))
                {__CLR4_2_05cp5cplnxz22pk.R.inc(6962);return true;
        }}
        }__CLR4_2_05cp5cplnxz22pk.R.inc(6963);return false;
    }finally{__CLR4_2_05cp5cplnxz22pk.R.flushNeeded();}}

    public boolean matchesAny(char... seq) {try{__CLR4_2_05cp5cplnxz22pk.R.inc(6964);
        __CLR4_2_05cp5cplnxz22pk.R.inc(6965);if ((((isEmpty())&&(__CLR4_2_05cp5cplnxz22pk.R.iget(6966)!=0|true))||(__CLR4_2_05cp5cplnxz22pk.R.iget(6967)==0&false)))
            {__CLR4_2_05cp5cplnxz22pk.R.inc(6968);return false;

        }__CLR4_2_05cp5cplnxz22pk.R.inc(6969);for (char c: seq) {{
            __CLR4_2_05cp5cplnxz22pk.R.inc(6970);if ((((queue.charAt(pos) == c)&&(__CLR4_2_05cp5cplnxz22pk.R.iget(6971)!=0|true))||(__CLR4_2_05cp5cplnxz22pk.R.iget(6972)==0&false)))
                {__CLR4_2_05cp5cplnxz22pk.R.inc(6973);return true;
        }}
        }__CLR4_2_05cp5cplnxz22pk.R.inc(6974);return false;
    }finally{__CLR4_2_05cp5cplnxz22pk.R.flushNeeded();}}

    public boolean matchesStartTag() {try{__CLR4_2_05cp5cplnxz22pk.R.inc(6975);
        // micro opt for matching "<x"
        __CLR4_2_05cp5cplnxz22pk.R.inc(6976);return (remainingLength() >= 2 && queue.charAt(pos) == '<' && Character.isLetter(queue.charAt(pos+1)));
    }finally{__CLR4_2_05cp5cplnxz22pk.R.flushNeeded();}}

    /**
     * Tests if the queue matches the sequence (as with match), and if they do, removes the matched string from the
     * queue.
     * @param seq String to search for, and if found, remove from queue.
     * @return true if found and removed, false if not found.
     */
    public boolean matchChomp(String seq) {try{__CLR4_2_05cp5cplnxz22pk.R.inc(6977);
        __CLR4_2_05cp5cplnxz22pk.R.inc(6978);if ((((matches(seq))&&(__CLR4_2_05cp5cplnxz22pk.R.iget(6979)!=0|true))||(__CLR4_2_05cp5cplnxz22pk.R.iget(6980)==0&false))) {{
            __CLR4_2_05cp5cplnxz22pk.R.inc(6981);pos += seq.length();
            __CLR4_2_05cp5cplnxz22pk.R.inc(6982);return true;
        } }else {{
            __CLR4_2_05cp5cplnxz22pk.R.inc(6983);return false;
        }
    }}finally{__CLR4_2_05cp5cplnxz22pk.R.flushNeeded();}}

    /**
     Tests if queue starts with a whitespace character.
     @return if starts with whitespace
     */
    public boolean matchesWhitespace() {try{__CLR4_2_05cp5cplnxz22pk.R.inc(6984);
        __CLR4_2_05cp5cplnxz22pk.R.inc(6985);return !isEmpty() && StringUtil.isWhitespace(queue.charAt(pos));
    }finally{__CLR4_2_05cp5cplnxz22pk.R.flushNeeded();}}

    /**
     Test if the queue matches a word character (letter or digit).
     @return if matches a word character
     */
    public boolean matchesWord() {try{__CLR4_2_05cp5cplnxz22pk.R.inc(6986);
        __CLR4_2_05cp5cplnxz22pk.R.inc(6987);return !isEmpty() && Character.isLetterOrDigit(queue.charAt(pos));
    }finally{__CLR4_2_05cp5cplnxz22pk.R.flushNeeded();}}

    /**
     * Drops the next character off the queue.
     */
    public void advance() {try{__CLR4_2_05cp5cplnxz22pk.R.inc(6988);
        __CLR4_2_05cp5cplnxz22pk.R.inc(6989);if ((((!isEmpty())&&(__CLR4_2_05cp5cplnxz22pk.R.iget(6990)!=0|true))||(__CLR4_2_05cp5cplnxz22pk.R.iget(6991)==0&false))) {__CLR4_2_05cp5cplnxz22pk.R.inc(6992);pos++;
    }}finally{__CLR4_2_05cp5cplnxz22pk.R.flushNeeded();}}

    /**
     * Consume one character off queue.
     * @return first character on queue.
     */
    public char consume() {try{__CLR4_2_05cp5cplnxz22pk.R.inc(6993);
        __CLR4_2_05cp5cplnxz22pk.R.inc(6994);return queue.charAt(pos++);
    }finally{__CLR4_2_05cp5cplnxz22pk.R.flushNeeded();}}

    /**
     * Consumes the supplied sequence of the queue. If the queue does not start with the supplied sequence, will
     * throw an illegal state exception -- but you should be running match() against that condition.
     <p>
     Case insensitive.
     * @param seq sequence to remove from head of queue.
     */
    public void consume(String seq) {try{__CLR4_2_05cp5cplnxz22pk.R.inc(6995);
        __CLR4_2_05cp5cplnxz22pk.R.inc(6996);if ((((!matches(seq))&&(__CLR4_2_05cp5cplnxz22pk.R.iget(6997)!=0|true))||(__CLR4_2_05cp5cplnxz22pk.R.iget(6998)==0&false)))
            {__CLR4_2_05cp5cplnxz22pk.R.inc(6999);throw new IllegalStateException("Queue did not match expected sequence");
        }__CLR4_2_05cp5cplnxz22pk.R.inc(7000);int len = seq.length();
        __CLR4_2_05cp5cplnxz22pk.R.inc(7001);if ((((len > remainingLength())&&(__CLR4_2_05cp5cplnxz22pk.R.iget(7002)!=0|true))||(__CLR4_2_05cp5cplnxz22pk.R.iget(7003)==0&false)))
            {__CLR4_2_05cp5cplnxz22pk.R.inc(7004);throw new IllegalStateException("Queue not long enough to consume sequence");
        }else{{
        }
        }__CLR4_2_05cp5cplnxz22pk.R.inc(7005);pos += len;
    }finally{__CLR4_2_05cp5cplnxz22pk.R.flushNeeded();}}

    /**
     * Pulls a string off the queue, up to but exclusive of the match sequence, or to the queue running out.
     * @param seq String to end on (and not include in return, but leave on queue). <b>Case sensitive.</b>
     * @return The matched data consumed from queue.
     */
    public String consumeTo(String seq) {try{__CLR4_2_05cp5cplnxz22pk.R.inc(7006);
        __CLR4_2_05cp5cplnxz22pk.R.inc(7007);int offset = queue.indexOf(seq, pos);
        __CLR4_2_05cp5cplnxz22pk.R.inc(7008);if ((((offset != -1)&&(__CLR4_2_05cp5cplnxz22pk.R.iget(7009)!=0|true))||(__CLR4_2_05cp5cplnxz22pk.R.iget(7010)==0&false))) {{
            __CLR4_2_05cp5cplnxz22pk.R.inc(7011);String consumed = queue.substring(pos, offset);
            __CLR4_2_05cp5cplnxz22pk.R.inc(7012);pos += consumed.length();
            __CLR4_2_05cp5cplnxz22pk.R.inc(7013);return consumed;
        } }else 
            {__CLR4_2_05cp5cplnxz22pk.R.inc(7014);return remainder();
    }}finally{__CLR4_2_05cp5cplnxz22pk.R.flushNeeded();}}
    
    public String consumeToIgnoreCase(String seq) {try{__CLR4_2_05cp5cplnxz22pk.R.inc(7015);
        __CLR4_2_05cp5cplnxz22pk.R.inc(7016);int start = pos; __CLR4_2_05cp5cplnxz22pk.R.inc(7017);String first = seq.substring(0, 1);
        __CLR4_2_05cp5cplnxz22pk.R.inc(7018);boolean canScan = first.toLowerCase().equals(first.toUpperCase()); // if first is not cased, use index of
        __CLR4_2_05cp5cplnxz22pk.R.inc(7019);while ((((!isEmpty())&&(__CLR4_2_05cp5cplnxz22pk.R.iget(7020)!=0|true))||(__CLR4_2_05cp5cplnxz22pk.R.iget(7021)==0&false))) {{
            __CLR4_2_05cp5cplnxz22pk.R.inc(7022);if ((((matches(seq))&&(__CLR4_2_05cp5cplnxz22pk.R.iget(7023)!=0|true))||(__CLR4_2_05cp5cplnxz22pk.R.iget(7024)==0&false)))
                {__CLR4_2_05cp5cplnxz22pk.R.inc(7025);break;
            
            }__CLR4_2_05cp5cplnxz22pk.R.inc(7026);if ((((canScan)&&(__CLR4_2_05cp5cplnxz22pk.R.iget(7027)!=0|true))||(__CLR4_2_05cp5cplnxz22pk.R.iget(7028)==0&false))) {{
                __CLR4_2_05cp5cplnxz22pk.R.inc(7029);int skip = queue.indexOf(first, pos) - pos;
                __CLR4_2_05cp5cplnxz22pk.R.inc(7030);if ((((skip == 0)&&(__CLR4_2_05cp5cplnxz22pk.R.iget(7031)!=0|true))||(__CLR4_2_05cp5cplnxz22pk.R.iget(7032)==0&false))) // this char is the skip char, but not match, so force advance of pos
                    {__CLR4_2_05cp5cplnxz22pk.R.inc(7033);pos++;
                }else {__CLR4_2_05cp5cplnxz22pk.R.inc(7034);if ((((skip < 0)&&(__CLR4_2_05cp5cplnxz22pk.R.iget(7035)!=0|true))||(__CLR4_2_05cp5cplnxz22pk.R.iget(7036)==0&false))) // no chance of finding, grab to end
                    {__CLR4_2_05cp5cplnxz22pk.R.inc(7037);pos = queue.length();
                }else
                    {__CLR4_2_05cp5cplnxz22pk.R.inc(7038);pos += skip;
            }}}
            }else
                {__CLR4_2_05cp5cplnxz22pk.R.inc(7039);pos++;
        }}

        }__CLR4_2_05cp5cplnxz22pk.R.inc(7040);return queue.substring(start, pos);
    }finally{__CLR4_2_05cp5cplnxz22pk.R.flushNeeded();}}

    /**
     Consumes to the first sequence provided, or to the end of the queue. Leaves the terminator on the queue.
     @param seq any number of terminators to consume to. <b>Case insensitive.</b>
     @return consumed string   
     */
    // todo: method name. not good that consumeTo cares for case, and consume to any doesn't. And the only use for this
    // is is a case sensitive time...
    public String consumeToAny(String... seq) {try{__CLR4_2_05cp5cplnxz22pk.R.inc(7041);
        __CLR4_2_05cp5cplnxz22pk.R.inc(7042);int start = pos;
        __CLR4_2_05cp5cplnxz22pk.R.inc(7043);while ((((!isEmpty() && !matchesAny(seq))&&(__CLR4_2_05cp5cplnxz22pk.R.iget(7044)!=0|true))||(__CLR4_2_05cp5cplnxz22pk.R.iget(7045)==0&false))) {{
            __CLR4_2_05cp5cplnxz22pk.R.inc(7046);pos++;
        }

        }__CLR4_2_05cp5cplnxz22pk.R.inc(7047);return queue.substring(start, pos);
    }finally{__CLR4_2_05cp5cplnxz22pk.R.flushNeeded();}}

    /**
     * Pulls a string off the queue (like consumeTo), and then pulls off the matched string (but does not return it).
     * <p>
     * If the queue runs out of characters before finding the seq, will return as much as it can (and queue will go
     * isEmpty() == true).
     * @param seq String to match up to, and not include in return, and to pull off queue. <b>Case sensitive.</b>
     * @return Data matched from queue.
     */
    public String chompTo(String seq) {try{__CLR4_2_05cp5cplnxz22pk.R.inc(7048);
        __CLR4_2_05cp5cplnxz22pk.R.inc(7049);String data = consumeTo(seq);
        __CLR4_2_05cp5cplnxz22pk.R.inc(7050);matchChomp(seq);
        __CLR4_2_05cp5cplnxz22pk.R.inc(7051);return data;
    }finally{__CLR4_2_05cp5cplnxz22pk.R.flushNeeded();}}
    
    public String chompToIgnoreCase(String seq) {try{__CLR4_2_05cp5cplnxz22pk.R.inc(7052);
        __CLR4_2_05cp5cplnxz22pk.R.inc(7053);String data = consumeToIgnoreCase(seq); // case insensitive scan
        __CLR4_2_05cp5cplnxz22pk.R.inc(7054);matchChomp(seq);
        __CLR4_2_05cp5cplnxz22pk.R.inc(7055);return data;
    }finally{__CLR4_2_05cp5cplnxz22pk.R.flushNeeded();}}

    /**
     * Pulls a balanced string off the queue. E.g. if queue is "(one (two) three) four", (,) will return "one (two) three",
     * and leave " four" on the queue. Unbalanced openers and closers can be quoted (with ' or ") or escaped (with \). Those escapes will be left
     * in the returned string, which is suitable for regexes (where we need to preserve the escape), but unsuitable for
     * contains text strings; use unescape for that.
     * @param open opener
     * @param close closer
     * @return data matched from the queue
     */
    public String chompBalanced(char open, char close) {try{__CLR4_2_05cp5cplnxz22pk.R.inc(7056);
        __CLR4_2_05cp5cplnxz22pk.R.inc(7057);int start = -1, end = -1;
        __CLR4_2_05cp5cplnxz22pk.R.inc(7058);int depth = 0;
        __CLR4_2_05cp5cplnxz22pk.R.inc(7059);char last = 0;
        __CLR4_2_05cp5cplnxz22pk.R.inc(7060);boolean inSingleQuote = false, inDoubleQuote = false;

        __CLR4_2_05cp5cplnxz22pk.R.inc(7061);do {{
            __CLR4_2_05cp5cplnxz22pk.R.inc(7062);if ((((isEmpty())&&(__CLR4_2_05cp5cplnxz22pk.R.iget(7063)!=0|true))||(__CLR4_2_05cp5cplnxz22pk.R.iget(7064)==0&false))) {__CLR4_2_05cp5cplnxz22pk.R.inc(7065);break;
            }__CLR4_2_05cp5cplnxz22pk.R.inc(7066);Character c = consume();
            __CLR4_2_05cp5cplnxz22pk.R.inc(7067);if ((((last == 0 || last != ESC)&&(__CLR4_2_05cp5cplnxz22pk.R.iget(7068)!=0|true))||(__CLR4_2_05cp5cplnxz22pk.R.iget(7069)==0&false))) {{
                __CLR4_2_05cp5cplnxz22pk.R.inc(7070);if ((((c.equals('\'') && c != open && !inDoubleQuote)&&(__CLR4_2_05cp5cplnxz22pk.R.iget(7071)!=0|true))||(__CLR4_2_05cp5cplnxz22pk.R.iget(7072)==0&false)))
                    {__CLR4_2_05cp5cplnxz22pk.R.inc(7073);inSingleQuote = !inSingleQuote;
                }else {__CLR4_2_05cp5cplnxz22pk.R.inc(7074);if ((((c.equals('"') && c != open && !inSingleQuote)&&(__CLR4_2_05cp5cplnxz22pk.R.iget(7075)!=0|true))||(__CLR4_2_05cp5cplnxz22pk.R.iget(7076)==0&false)))
                    {__CLR4_2_05cp5cplnxz22pk.R.inc(7077);inDoubleQuote = !inDoubleQuote;
                }}__CLR4_2_05cp5cplnxz22pk.R.inc(7078);if ((((inSingleQuote || inDoubleQuote)&&(__CLR4_2_05cp5cplnxz22pk.R.iget(7079)!=0|true))||(__CLR4_2_05cp5cplnxz22pk.R.iget(7080)==0&false)))
                    {__CLR4_2_05cp5cplnxz22pk.R.inc(7081);continue;

                }__CLR4_2_05cp5cplnxz22pk.R.inc(7082);if ((((c.equals(open))&&(__CLR4_2_05cp5cplnxz22pk.R.iget(7083)!=0|true))||(__CLR4_2_05cp5cplnxz22pk.R.iget(7084)==0&false))) {{
                    __CLR4_2_05cp5cplnxz22pk.R.inc(7085);depth++;
                    __CLR4_2_05cp5cplnxz22pk.R.inc(7086);if ((((start == -1)&&(__CLR4_2_05cp5cplnxz22pk.R.iget(7087)!=0|true))||(__CLR4_2_05cp5cplnxz22pk.R.iget(7088)==0&false)))
                        {__CLR4_2_05cp5cplnxz22pk.R.inc(7089);start = pos;
                }}
                }else {__CLR4_2_05cp5cplnxz22pk.R.inc(7090);if ((((c.equals(close))&&(__CLR4_2_05cp5cplnxz22pk.R.iget(7091)!=0|true))||(__CLR4_2_05cp5cplnxz22pk.R.iget(7092)==0&false)))
                    {__CLR4_2_05cp5cplnxz22pk.R.inc(7093);depth--;
            }}}

            }__CLR4_2_05cp5cplnxz22pk.R.inc(7094);if ((((depth > 0 && last != 0)&&(__CLR4_2_05cp5cplnxz22pk.R.iget(7095)!=0|true))||(__CLR4_2_05cp5cplnxz22pk.R.iget(7096)==0&false)))
                {__CLR4_2_05cp5cplnxz22pk.R.inc(7097);end = pos; // don't include the outer match pair in the return
            }__CLR4_2_05cp5cplnxz22pk.R.inc(7098);last = c;
        } }while ((((depth > 0)&&(__CLR4_2_05cp5cplnxz22pk.R.iget(7099)!=0|true))||(__CLR4_2_05cp5cplnxz22pk.R.iget(7100)==0&false)));
        __CLR4_2_05cp5cplnxz22pk.R.inc(7101);final String out = ((((end >= 0) )&&(__CLR4_2_05cp5cplnxz22pk.R.iget(7102)!=0|true))||(__CLR4_2_05cp5cplnxz22pk.R.iget(7103)==0&false))? queue.substring(start, end) : "";
        __CLR4_2_05cp5cplnxz22pk.R.inc(7104);if ((((depth > 0)&&(__CLR4_2_05cp5cplnxz22pk.R.iget(7105)!=0|true))||(__CLR4_2_05cp5cplnxz22pk.R.iget(7106)==0&false))) {{// ran out of queue before seeing enough )
            __CLR4_2_05cp5cplnxz22pk.R.inc(7107);Validate.fail("Did not find balanced marker at '" + out + "'");
        }}else{{
            __CLR4_2_05cp5cplnxz22pk.R.inc(7108);return out;
        }
        }__CLR4_2_05cp5cplnxz22pk.R.inc(7109);return out;
    }finally{__CLR4_2_05cp5cplnxz22pk.R.flushNeeded();}}
    
    /**
     * Unescape a \ escaped string.
     * @param in backslash escaped string
     * @return unescaped string
     */
    public static String unescape(String in) {try{__CLR4_2_05cp5cplnxz22pk.R.inc(7110);
        __CLR4_2_05cp5cplnxz22pk.R.inc(7111);StringBuilder out = StringUtil.borrowBuilder();
        __CLR4_2_05cp5cplnxz22pk.R.inc(7112);char last = 0;
        __CLR4_2_05cp5cplnxz22pk.R.inc(7113);for (char c : in.toCharArray()) {{
            __CLR4_2_05cp5cplnxz22pk.R.inc(7114);if ((((c == ESC)&&(__CLR4_2_05cp5cplnxz22pk.R.iget(7115)!=0|true))||(__CLR4_2_05cp5cplnxz22pk.R.iget(7116)==0&false))) {{
                __CLR4_2_05cp5cplnxz22pk.R.inc(7117);if ((((last != 0 && last == ESC)&&(__CLR4_2_05cp5cplnxz22pk.R.iget(7118)!=0|true))||(__CLR4_2_05cp5cplnxz22pk.R.iget(7119)==0&false)))
                    {__CLR4_2_05cp5cplnxz22pk.R.inc(7120);out.append(c);
            }}
            }else 
                {__CLR4_2_05cp5cplnxz22pk.R.inc(7121);out.append(c);
            }__CLR4_2_05cp5cplnxz22pk.R.inc(7122);last = c;
        }
        }__CLR4_2_05cp5cplnxz22pk.R.inc(7123);return StringUtil.releaseBuilder(out);
    }finally{__CLR4_2_05cp5cplnxz22pk.R.flushNeeded();}}

    /**
     * Pulls the next run of whitespace characters of the queue.
     * @return Whether consuming whitespace or not
     */
    public boolean consumeWhitespace() {try{__CLR4_2_05cp5cplnxz22pk.R.inc(7124);
        __CLR4_2_05cp5cplnxz22pk.R.inc(7125);boolean seen = false;
        __CLR4_2_05cp5cplnxz22pk.R.inc(7126);while ((((matchesWhitespace())&&(__CLR4_2_05cp5cplnxz22pk.R.iget(7127)!=0|true))||(__CLR4_2_05cp5cplnxz22pk.R.iget(7128)==0&false))) {{
            __CLR4_2_05cp5cplnxz22pk.R.inc(7129);pos++;
            __CLR4_2_05cp5cplnxz22pk.R.inc(7130);seen = true;
        }
        }__CLR4_2_05cp5cplnxz22pk.R.inc(7131);return seen;
    }finally{__CLR4_2_05cp5cplnxz22pk.R.flushNeeded();}}

    /**
     * Retrieves the next run of word type (letter or digit) off the queue.
     * @return String of word characters from queue, or empty string if none.
     */
    public String consumeWord() {try{__CLR4_2_05cp5cplnxz22pk.R.inc(7132);
        __CLR4_2_05cp5cplnxz22pk.R.inc(7133);int start = pos;
        __CLR4_2_05cp5cplnxz22pk.R.inc(7134);while ((((matchesWord())&&(__CLR4_2_05cp5cplnxz22pk.R.iget(7135)!=0|true))||(__CLR4_2_05cp5cplnxz22pk.R.iget(7136)==0&false)))
            {__CLR4_2_05cp5cplnxz22pk.R.inc(7137);pos++;
        }__CLR4_2_05cp5cplnxz22pk.R.inc(7138);return queue.substring(start, pos);
    }finally{__CLR4_2_05cp5cplnxz22pk.R.flushNeeded();}}
    
    /**
     * Consume an tag name off the queue (word or :, _, -)
     * 
     * @return tag name
     */
    public String consumeTagName() {try{__CLR4_2_05cp5cplnxz22pk.R.inc(7139);
        __CLR4_2_05cp5cplnxz22pk.R.inc(7140);int start = pos;
        __CLR4_2_05cp5cplnxz22pk.R.inc(7141);while ((((!isEmpty() && (matchesWord() || matchesAny(':', '_', '-')))&&(__CLR4_2_05cp5cplnxz22pk.R.iget(7142)!=0|true))||(__CLR4_2_05cp5cplnxz22pk.R.iget(7143)==0&false)))
            {__CLR4_2_05cp5cplnxz22pk.R.inc(7144);pos++;
        
        }__CLR4_2_05cp5cplnxz22pk.R.inc(7145);return queue.substring(start, pos);
    }finally{__CLR4_2_05cp5cplnxz22pk.R.flushNeeded();}}
    
    /**
     * Consume a CSS element selector (tag name, but | instead of : for namespaces (or *| for wildcard namespace), to not conflict with :pseudo selects).
     * 
     * @return tag name
     */
    public String consumeElementSelector() {try{__CLR4_2_05cp5cplnxz22pk.R.inc(7146);
        __CLR4_2_05cp5cplnxz22pk.R.inc(7147);int start = pos;
        __CLR4_2_05cp5cplnxz22pk.R.inc(7148);while ((((!isEmpty() && (matchesWord() || matchesAny("*|","|", "_", "-")))&&(__CLR4_2_05cp5cplnxz22pk.R.iget(7149)!=0|true))||(__CLR4_2_05cp5cplnxz22pk.R.iget(7150)==0&false)))
            {__CLR4_2_05cp5cplnxz22pk.R.inc(7151);pos++;
        
        }__CLR4_2_05cp5cplnxz22pk.R.inc(7152);return queue.substring(start, pos);
    }finally{__CLR4_2_05cp5cplnxz22pk.R.flushNeeded();}}

    /**
     Consume a CSS identifier (ID or class) off the queue (letter, digit, -, _)
     http://www.w3.org/TR/CSS2/syndata.html#value-def-identifier
     @return identifier
     */
    public String consumeCssIdentifier() {try{__CLR4_2_05cp5cplnxz22pk.R.inc(7153);
        __CLR4_2_05cp5cplnxz22pk.R.inc(7154);int start = pos;
        __CLR4_2_05cp5cplnxz22pk.R.inc(7155);while ((((!isEmpty() && (matchesWord() || matchesAny('-', '_')))&&(__CLR4_2_05cp5cplnxz22pk.R.iget(7156)!=0|true))||(__CLR4_2_05cp5cplnxz22pk.R.iget(7157)==0&false)))
            {__CLR4_2_05cp5cplnxz22pk.R.inc(7158);pos++; }__CLR4_2_05cp5cplnxz22pk.R.inc(7159);return queue.substring(start, pos);
    }finally{__CLR4_2_05cp5cplnxz22pk.R.flushNeeded();}}

    /**
     Consume an attribute key off the queue (letter, digit, -, _, :")
     @return attribute key
     */
    public String consumeAttributeKey() {try{__CLR4_2_05cp5cplnxz22pk.R.inc(7160);
        __CLR4_2_05cp5cplnxz22pk.R.inc(7161);int start = pos;
        __CLR4_2_05cp5cplnxz22pk.R.inc(7162);while ((((!isEmpty() && (matchesWord() || matchesAny('-', '_', ':')))&&(__CLR4_2_05cp5cplnxz22pk.R.iget(7163)!=0|true))||(__CLR4_2_05cp5cplnxz22pk.R.iget(7164)==0&false)))
            {__CLR4_2_05cp5cplnxz22pk.R.inc(7165);pos++;
        
        }__CLR4_2_05cp5cplnxz22pk.R.inc(7166);return queue.substring(start, pos);
    }finally{__CLR4_2_05cp5cplnxz22pk.R.flushNeeded();}}

    /**
     Consume and return whatever is left on the queue.
     @return remained of queue.
     */
    public String remainder() {try{__CLR4_2_05cp5cplnxz22pk.R.inc(7167);
        __CLR4_2_05cp5cplnxz22pk.R.inc(7168);final String remainder = queue.substring(pos, queue.length());
        __CLR4_2_05cp5cplnxz22pk.R.inc(7169);pos = queue.length();
        __CLR4_2_05cp5cplnxz22pk.R.inc(7170);return remainder;
    }finally{__CLR4_2_05cp5cplnxz22pk.R.flushNeeded();}}
    
    @Override
    public String toString() {try{__CLR4_2_05cp5cplnxz22pk.R.inc(7171);
        __CLR4_2_05cp5cplnxz22pk.R.inc(7172);return queue.substring(pos);
    }finally{__CLR4_2_05cp5cplnxz22pk.R.flushNeeded();}}
}
