/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.select;

import org.jsoup.internal.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.parser.TokenQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.jsoup.internal.Normalizer.normalize;

/**
 * Parses a CSS selector into an Evaluator tree.
 */
public class QueryParser {public static class __CLR4_2_07rn7rnlnxz22t8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,10438,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final static String[] combinators = {",", ">", "+", "~", " "};
    private static final String[] AttributeEvals = new String[]{"=", "!=", "^=", "$=", "*=", "~="};

    private TokenQueue tq;
    private String query;
    private List<Evaluator> evals = new ArrayList<>();

    /**
     * Create a new QueryParser.
     * @param query CSS query
     */
    private QueryParser(String query) {try{__CLR4_2_07rn7rnlnxz22t8.R.inc(10067);
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10068);this.query = query;
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10069);this.tq = new TokenQueue(query);
    }finally{__CLR4_2_07rn7rnlnxz22t8.R.flushNeeded();}}

    /**
     * Parse a CSS query into an Evaluator.
     * @param query CSS query
     * @return Evaluator
     */
    public static Evaluator parse(String query) {try{__CLR4_2_07rn7rnlnxz22t8.R.inc(10070);
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10071);try {
            __CLR4_2_07rn7rnlnxz22t8.R.inc(10072);QueryParser p = new QueryParser(query);
            __CLR4_2_07rn7rnlnxz22t8.R.inc(10073);return p.parse();
        } catch (IllegalArgumentException e) {
            __CLR4_2_07rn7rnlnxz22t8.R.inc(10074);throw new Selector.SelectorParseException(e.getMessage());
        }
    }finally{__CLR4_2_07rn7rnlnxz22t8.R.flushNeeded();}}

    /**
     * Parse the query
     * @return Evaluator
     */
    Evaluator parse() {try{__CLR4_2_07rn7rnlnxz22t8.R.inc(10075);
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10076);tq.consumeWhitespace();

        __CLR4_2_07rn7rnlnxz22t8.R.inc(10077);if ((((tq.matchesAny(combinators))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10078)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10079)==0&false))) {{ // if starts with a combinator, use root as elements
            __CLR4_2_07rn7rnlnxz22t8.R.inc(10080);evals.add(new StructuralEvaluator.Root());
            __CLR4_2_07rn7rnlnxz22t8.R.inc(10081);combinator(tq.consume());
        } }else {{
            __CLR4_2_07rn7rnlnxz22t8.R.inc(10082);findElements();
        }

        }__CLR4_2_07rn7rnlnxz22t8.R.inc(10083);while ((((!tq.isEmpty())&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10084)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10085)==0&false))) {{
            // hierarchy and extras
            __CLR4_2_07rn7rnlnxz22t8.R.inc(10086);boolean seenWhite = tq.consumeWhitespace();

            __CLR4_2_07rn7rnlnxz22t8.R.inc(10087);if ((((tq.matchesAny(combinators))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10088)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10089)==0&false))) {{
                __CLR4_2_07rn7rnlnxz22t8.R.inc(10090);combinator(tq.consume());
            } }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10091);if ((((seenWhite)&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10092)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10093)==0&false))) {{
                __CLR4_2_07rn7rnlnxz22t8.R.inc(10094);combinator(' ');
            } }else {{ // E.class, E#id, E[attr] etc. AND
                __CLR4_2_07rn7rnlnxz22t8.R.inc(10095);findElements(); // take next el, #. etc off queue
            }
        }}}

        }__CLR4_2_07rn7rnlnxz22t8.R.inc(10096);if ((((evals.size() == 1)&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10097)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10098)==0&false)))
            {__CLR4_2_07rn7rnlnxz22t8.R.inc(10099);return evals.get(0);

        }__CLR4_2_07rn7rnlnxz22t8.R.inc(10100);return new CombiningEvaluator.And(evals);
    }finally{__CLR4_2_07rn7rnlnxz22t8.R.flushNeeded();}}

    private void combinator(char combinator) {try{__CLR4_2_07rn7rnlnxz22t8.R.inc(10101);
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10102);tq.consumeWhitespace();
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10103);String subQuery = consumeSubQuery(); // support multi > childs

        __CLR4_2_07rn7rnlnxz22t8.R.inc(10104);Evaluator rootEval; // the new topmost evaluator
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10105);Evaluator currentEval; // the evaluator the new eval will be combined to. could be root, or rightmost or.
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10106);Evaluator newEval = parse(subQuery); // the evaluator to add into target evaluator
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10107);boolean replaceRightMost = false;

        __CLR4_2_07rn7rnlnxz22t8.R.inc(10108);if ((((evals.size() == 1)&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10109)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10110)==0&false))) {{
            __CLR4_2_07rn7rnlnxz22t8.R.inc(10111);rootEval = currentEval = evals.get(0);
            // make sure OR (,) has precedence:
            __CLR4_2_07rn7rnlnxz22t8.R.inc(10112);if ((((rootEval instanceof CombiningEvaluator.Or && combinator != ',')&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10113)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10114)==0&false))) {{
                __CLR4_2_07rn7rnlnxz22t8.R.inc(10115);currentEval = ((CombiningEvaluator.Or) currentEval).rightMostEvaluator();
                __CLR4_2_07rn7rnlnxz22t8.R.inc(10116);replaceRightMost = true;
            }
        }}
        }else {{
            __CLR4_2_07rn7rnlnxz22t8.R.inc(10117);rootEval = currentEval = new CombiningEvaluator.And(evals);
        }
        }__CLR4_2_07rn7rnlnxz22t8.R.inc(10118);evals.clear();

        // for most combinators: change the current eval into an AND of the current eval and the new eval
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10119);if ((((combinator == '>')&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10120)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10121)==0&false)))
            {__CLR4_2_07rn7rnlnxz22t8.R.inc(10122);currentEval = new CombiningEvaluator.And(newEval, new StructuralEvaluator.ImmediateParent(currentEval));
        }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10123);if ((((combinator == ' ')&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10124)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10125)==0&false)))
            {__CLR4_2_07rn7rnlnxz22t8.R.inc(10126);currentEval = new CombiningEvaluator.And(newEval, new StructuralEvaluator.Parent(currentEval));
        }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10127);if ((((combinator == '+')&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10128)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10129)==0&false)))
            {__CLR4_2_07rn7rnlnxz22t8.R.inc(10130);currentEval = new CombiningEvaluator.And(newEval, new StructuralEvaluator.ImmediatePreviousSibling(currentEval));
        }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10131);if ((((combinator == '~')&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10132)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10133)==0&false)))
            {__CLR4_2_07rn7rnlnxz22t8.R.inc(10134);currentEval = new CombiningEvaluator.And(newEval, new StructuralEvaluator.PreviousSibling(currentEval));
        }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10135);if ((((combinator == ',')&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10136)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10137)==0&false))) {{ // group or.
            __CLR4_2_07rn7rnlnxz22t8.R.inc(10138);CombiningEvaluator.Or or;
            __CLR4_2_07rn7rnlnxz22t8.R.inc(10139);if ((((currentEval instanceof CombiningEvaluator.Or)&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10140)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10141)==0&false))) {{
                __CLR4_2_07rn7rnlnxz22t8.R.inc(10142);or = (CombiningEvaluator.Or) currentEval;
                __CLR4_2_07rn7rnlnxz22t8.R.inc(10143);or.add(newEval);
            } }else {{
                __CLR4_2_07rn7rnlnxz22t8.R.inc(10144);or = new CombiningEvaluator.Or();
                __CLR4_2_07rn7rnlnxz22t8.R.inc(10145);or.add(currentEval);
                __CLR4_2_07rn7rnlnxz22t8.R.inc(10146);or.add(newEval);
            }
            }__CLR4_2_07rn7rnlnxz22t8.R.inc(10147);currentEval = or;
        }
        }else
            {__CLR4_2_07rn7rnlnxz22t8.R.inc(10148);throw new Selector.SelectorParseException("Unknown combinator: " + combinator);

        }}}}}__CLR4_2_07rn7rnlnxz22t8.R.inc(10149);if ((((replaceRightMost)&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10150)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10151)==0&false)))
            {__CLR4_2_07rn7rnlnxz22t8.R.inc(10152);((CombiningEvaluator.Or) rootEval).replaceRightMostEvaluator(currentEval);
        }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10153);rootEval = currentEval;
        }__CLR4_2_07rn7rnlnxz22t8.R.inc(10154);evals.add(rootEval);
    }finally{__CLR4_2_07rn7rnlnxz22t8.R.flushNeeded();}}

    private String consumeSubQuery() {try{__CLR4_2_07rn7rnlnxz22t8.R.inc(10155);
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10156);StringBuilder sq = StringUtil.borrowBuilder();
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10157);while ((((!tq.isEmpty())&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10158)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10159)==0&false))) {{
            __CLR4_2_07rn7rnlnxz22t8.R.inc(10160);if ((((tq.matches("("))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10161)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10162)==0&false)))
                {__CLR4_2_07rn7rnlnxz22t8.R.inc(10163);sq.append("(").append(tq.chompBalanced('(', ')')).append(")");
            }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10164);if ((((tq.matches("["))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10165)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10166)==0&false)))
                {__CLR4_2_07rn7rnlnxz22t8.R.inc(10167);sq.append("[").append(tq.chompBalanced('[', ']')).append("]");
            }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10168);if ((((tq.matchesAny(combinators))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10169)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10170)==0&false)))
                {__CLR4_2_07rn7rnlnxz22t8.R.inc(10171);break;
            }else
                {__CLR4_2_07rn7rnlnxz22t8.R.inc(10172);sq.append(tq.consume());
        }}}}
        }__CLR4_2_07rn7rnlnxz22t8.R.inc(10173);return StringUtil.releaseBuilder(sq);
    }finally{__CLR4_2_07rn7rnlnxz22t8.R.flushNeeded();}}

    private void findElements() {try{__CLR4_2_07rn7rnlnxz22t8.R.inc(10174);
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10175);if ((((tq.matchChomp("#"))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10176)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10177)==0&false)))
            {__CLR4_2_07rn7rnlnxz22t8.R.inc(10178);byId();
        }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10179);if ((((tq.matchChomp("."))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10180)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10181)==0&false)))
            {__CLR4_2_07rn7rnlnxz22t8.R.inc(10182);byClass();
        }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10183);if ((((tq.matchesWord() || tq.matches("*|"))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10184)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10185)==0&false)))
            {__CLR4_2_07rn7rnlnxz22t8.R.inc(10186);byTag();
        }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10187);if ((((tq.matches("["))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10188)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10189)==0&false)))
            {__CLR4_2_07rn7rnlnxz22t8.R.inc(10190);byAttribute();
        }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10191);if ((((tq.matchChomp("*"))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10192)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10193)==0&false)))
            {__CLR4_2_07rn7rnlnxz22t8.R.inc(10194);allElements();
        }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10195);if ((((tq.matchChomp(":lt("))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10196)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10197)==0&false)))
            {__CLR4_2_07rn7rnlnxz22t8.R.inc(10198);indexLessThan();
        }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10199);if ((((tq.matchChomp(":gt("))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10200)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10201)==0&false)))
            {__CLR4_2_07rn7rnlnxz22t8.R.inc(10202);indexGreaterThan();
        }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10203);if ((((tq.matchChomp(":eq("))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10204)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10205)==0&false)))
            {__CLR4_2_07rn7rnlnxz22t8.R.inc(10206);indexEquals();
        }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10207);if ((((tq.matches(":has("))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10208)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10209)==0&false)))
            {__CLR4_2_07rn7rnlnxz22t8.R.inc(10210);has();
        }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10211);if ((((tq.matches(":contains("))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10212)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10213)==0&false)))
            {__CLR4_2_07rn7rnlnxz22t8.R.inc(10214);contains(false);
        }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10215);if ((((tq.matches(":containsOwn("))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10216)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10217)==0&false)))
            {__CLR4_2_07rn7rnlnxz22t8.R.inc(10218);contains(true);
        }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10219);if ((((tq.matches(":containsData("))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10220)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10221)==0&false)))
            {__CLR4_2_07rn7rnlnxz22t8.R.inc(10222);containsData();
        }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10223);if ((((tq.matches(":matches("))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10224)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10225)==0&false)))
            {__CLR4_2_07rn7rnlnxz22t8.R.inc(10226);matches(false);
        }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10227);if ((((tq.matches(":matchesOwn("))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10228)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10229)==0&false)))
            {__CLR4_2_07rn7rnlnxz22t8.R.inc(10230);matches(true);
        }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10231);if ((((tq.matches(":not("))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10232)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10233)==0&false)))
            {__CLR4_2_07rn7rnlnxz22t8.R.inc(10234);not();
		}else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10235);if ((((tq.matchChomp(":nth-child("))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10236)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10237)==0&false)))
        	{__CLR4_2_07rn7rnlnxz22t8.R.inc(10238);cssNthChild(false, false);
        }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10239);if ((((tq.matchChomp(":nth-last-child("))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10240)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10241)==0&false)))
        	{__CLR4_2_07rn7rnlnxz22t8.R.inc(10242);cssNthChild(true, false);
        }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10243);if ((((tq.matchChomp(":nth-of-type("))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10244)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10245)==0&false)))
        	{__CLR4_2_07rn7rnlnxz22t8.R.inc(10246);cssNthChild(false, true);
        }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10247);if ((((tq.matchChomp(":nth-last-of-type("))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10248)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10249)==0&false)))
        	{__CLR4_2_07rn7rnlnxz22t8.R.inc(10250);cssNthChild(true, true);
        }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10251);if ((((tq.matchChomp(":first-child"))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10252)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10253)==0&false)))
        	{__CLR4_2_07rn7rnlnxz22t8.R.inc(10254);evals.add(new Evaluator.IsFirstChild());
        }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10255);if ((((tq.matchChomp(":last-child"))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10256)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10257)==0&false)))
        	{__CLR4_2_07rn7rnlnxz22t8.R.inc(10258);evals.add(new Evaluator.IsLastChild());
        }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10259);if ((((tq.matchChomp(":first-of-type"))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10260)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10261)==0&false)))
        	{__CLR4_2_07rn7rnlnxz22t8.R.inc(10262);evals.add(new Evaluator.IsFirstOfType());
        }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10263);if ((((tq.matchChomp(":last-of-type"))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10264)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10265)==0&false)))
        	{__CLR4_2_07rn7rnlnxz22t8.R.inc(10266);evals.add(new Evaluator.IsLastOfType());
        }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10267);if ((((tq.matchChomp(":only-child"))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10268)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10269)==0&false)))
        	{__CLR4_2_07rn7rnlnxz22t8.R.inc(10270);evals.add(new Evaluator.IsOnlyChild());
        }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10271);if ((((tq.matchChomp(":only-of-type"))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10272)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10273)==0&false)))
        	{__CLR4_2_07rn7rnlnxz22t8.R.inc(10274);evals.add(new Evaluator.IsOnlyOfType());
        }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10275);if ((((tq.matchChomp(":empty"))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10276)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10277)==0&false)))
        	{__CLR4_2_07rn7rnlnxz22t8.R.inc(10278);evals.add(new Evaluator.IsEmpty());
        }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10279);if ((((tq.matchChomp(":root"))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10280)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10281)==0&false)))
        	{__CLR4_2_07rn7rnlnxz22t8.R.inc(10282);evals.add(new Evaluator.IsRoot());
        }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10283);if ((((tq.matchChomp(":matchText"))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10284)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10285)==0&false)))
            {__CLR4_2_07rn7rnlnxz22t8.R.inc(10286);evals.add(new Evaluator.MatchText());
		}else // unhandled
            {__CLR4_2_07rn7rnlnxz22t8.R.inc(10287);throw new Selector.SelectorParseException("Could not parse query '%s': unexpected token at '%s'", query, tq.remainder());

    }}}}}}}}}}}}}}}}}}}}}}}}}}}}}finally{__CLR4_2_07rn7rnlnxz22t8.R.flushNeeded();}}

    private void byId() {try{__CLR4_2_07rn7rnlnxz22t8.R.inc(10288);
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10289);String id = tq.consumeCssIdentifier();
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10290);Validate.notEmpty(id);
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10291);evals.add(new Evaluator.Id(id));
    }finally{__CLR4_2_07rn7rnlnxz22t8.R.flushNeeded();}}

    private void byClass() {try{__CLR4_2_07rn7rnlnxz22t8.R.inc(10292);
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10293);String className = tq.consumeCssIdentifier();
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10294);Validate.notEmpty(className);
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10295);evals.add(new Evaluator.Class(className.trim()));
    }finally{__CLR4_2_07rn7rnlnxz22t8.R.flushNeeded();}}

    private void byTag() {try{__CLR4_2_07rn7rnlnxz22t8.R.inc(10296);
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10297);String tagName = tq.consumeElementSelector();

        __CLR4_2_07rn7rnlnxz22t8.R.inc(10298);Validate.notEmpty(tagName);

        // namespaces: wildcard match equals(tagName) or ending in ":"+tagName
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10299);if ((((tagName.startsWith("*|"))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10300)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10301)==0&false))) {{
            __CLR4_2_07rn7rnlnxz22t8.R.inc(10302);evals.add(new CombiningEvaluator.Or(new Evaluator.Tag(normalize(tagName)), new Evaluator.TagEndsWith(normalize(tagName.replace("*|", ":")))));
        } }else {{
            // namespaces: if element name is "abc:def", selector must be "abc|def", so flip:
            __CLR4_2_07rn7rnlnxz22t8.R.inc(10303);if ((((tagName.contains("|"))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10304)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10305)==0&false)))
                {__CLR4_2_07rn7rnlnxz22t8.R.inc(10306);tagName = tagName.replace("|", ":");

            }__CLR4_2_07rn7rnlnxz22t8.R.inc(10307);evals.add(new Evaluator.Tag(tagName.trim()));
        }
    }}finally{__CLR4_2_07rn7rnlnxz22t8.R.flushNeeded();}}

    private void byAttribute() {try{__CLR4_2_07rn7rnlnxz22t8.R.inc(10308);
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10309);TokenQueue cq = new TokenQueue(tq.chompBalanced('[', ']')); // content queue
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10310);String key = cq.consumeToAny(AttributeEvals); // eq, not, start, end, contain, match, (no val)
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10311);Validate.notEmpty(key);
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10312);cq.consumeWhitespace();

        __CLR4_2_07rn7rnlnxz22t8.R.inc(10313);if ((((cq.isEmpty())&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10314)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10315)==0&false))) {{
            __CLR4_2_07rn7rnlnxz22t8.R.inc(10316);if ((((key.startsWith("^"))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10317)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10318)==0&false)))
                {__CLR4_2_07rn7rnlnxz22t8.R.inc(10319);evals.add(new Evaluator.AttributeStarting(key.substring(1)));
            }else
                {__CLR4_2_07rn7rnlnxz22t8.R.inc(10320);evals.add(new Evaluator.Attribute(key));
        }} }else {{
            __CLR4_2_07rn7rnlnxz22t8.R.inc(10321);if ((((cq.matchChomp("="))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10322)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10323)==0&false)))
                {__CLR4_2_07rn7rnlnxz22t8.R.inc(10324);evals.add(new Evaluator.AttributeWithValue(key, cq.remainder()));

            }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10325);if ((((cq.matchChomp("!="))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10326)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10327)==0&false)))
                {__CLR4_2_07rn7rnlnxz22t8.R.inc(10328);evals.add(new Evaluator.AttributeWithValueNot(key, cq.remainder()));

            }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10329);if ((((cq.matchChomp("^="))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10330)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10331)==0&false)))
                {__CLR4_2_07rn7rnlnxz22t8.R.inc(10332);evals.add(new Evaluator.AttributeWithValueStarting(key, cq.remainder()));

            }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10333);if ((((cq.matchChomp("$="))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10334)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10335)==0&false)))
                {__CLR4_2_07rn7rnlnxz22t8.R.inc(10336);evals.add(new Evaluator.AttributeWithValueEnding(key, cq.remainder()));

            }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10337);if ((((cq.matchChomp("*="))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10338)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10339)==0&false)))
                {__CLR4_2_07rn7rnlnxz22t8.R.inc(10340);evals.add(new Evaluator.AttributeWithValueContaining(key, cq.remainder()));

            }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10341);if ((((cq.matchChomp("~="))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10342)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10343)==0&false)))
                {__CLR4_2_07rn7rnlnxz22t8.R.inc(10344);evals.add(new Evaluator.AttributeWithValueMatching(key, Pattern.compile(cq.remainder())));
            }else
                {__CLR4_2_07rn7rnlnxz22t8.R.inc(10345);throw new Selector.SelectorParseException("Could not parse attribute query '%s': unexpected token at '%s'", query, cq.remainder());
        }}}}}}}
    }}finally{__CLR4_2_07rn7rnlnxz22t8.R.flushNeeded();}}

    private void allElements() {try{__CLR4_2_07rn7rnlnxz22t8.R.inc(10346);
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10347);evals.add(new Evaluator.AllElements());
    }finally{__CLR4_2_07rn7rnlnxz22t8.R.flushNeeded();}}

    // pseudo selectors :lt, :gt, :eq
    private void indexLessThan() {try{__CLR4_2_07rn7rnlnxz22t8.R.inc(10348);
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10349);evals.add(new Evaluator.IndexLessThan(consumeIndex()));
    }finally{__CLR4_2_07rn7rnlnxz22t8.R.flushNeeded();}}

    private void indexGreaterThan() {try{__CLR4_2_07rn7rnlnxz22t8.R.inc(10350);
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10351);evals.add(new Evaluator.IndexGreaterThan(consumeIndex()));
    }finally{__CLR4_2_07rn7rnlnxz22t8.R.flushNeeded();}}

    private void indexEquals() {try{__CLR4_2_07rn7rnlnxz22t8.R.inc(10352);
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10353);evals.add(new Evaluator.IndexEquals(consumeIndex()));
    }finally{__CLR4_2_07rn7rnlnxz22t8.R.flushNeeded();}}
    
    //pseudo selectors :first-child, :last-child, :nth-child, ...
    private static final Pattern NTH_AB = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", Pattern.CASE_INSENSITIVE);
    private static final Pattern NTH_B  = Pattern.compile("([+-])?(\\d+)");

	private void cssNthChild(boolean backwards, boolean ofType) {try{__CLR4_2_07rn7rnlnxz22t8.R.inc(10354);
		__CLR4_2_07rn7rnlnxz22t8.R.inc(10355);String argS = normalize(tq.chompTo(")"));
		__CLR4_2_07rn7rnlnxz22t8.R.inc(10356);Matcher mAB = NTH_AB.matcher(argS);
		__CLR4_2_07rn7rnlnxz22t8.R.inc(10357);Matcher mB = NTH_B.matcher(argS);
		__CLR4_2_07rn7rnlnxz22t8.R.inc(10358);final int a, b;
		__CLR4_2_07rn7rnlnxz22t8.R.inc(10359);if (((("odd".equals(argS))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10360)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10361)==0&false))) {{
			__CLR4_2_07rn7rnlnxz22t8.R.inc(10362);a = 2;
			__CLR4_2_07rn7rnlnxz22t8.R.inc(10363);b = 1;
		} }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10364);if (((("even".equals(argS))&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10365)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10366)==0&false))) {{
			__CLR4_2_07rn7rnlnxz22t8.R.inc(10367);a = 2;
			__CLR4_2_07rn7rnlnxz22t8.R.inc(10368);b = 0;
		} }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10369);if ((((mAB.matches())&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10370)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10371)==0&false))) {{
			__CLR4_2_07rn7rnlnxz22t8.R.inc(10372);a = (((mAB.group(3) != null )&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10373)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10374)==0&false))? Integer.parseInt(mAB.group(1).replaceFirst("^\\+", "")) : 1;
			__CLR4_2_07rn7rnlnxz22t8.R.inc(10375);b = (((mAB.group(4) != null )&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10376)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10377)==0&false))? Integer.parseInt(mAB.group(4).replaceFirst("^\\+", "")) : 0;
		} }else {__CLR4_2_07rn7rnlnxz22t8.R.inc(10378);if ((((mB.matches())&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10379)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10380)==0&false))) {{
			__CLR4_2_07rn7rnlnxz22t8.R.inc(10381);a = 0;
			__CLR4_2_07rn7rnlnxz22t8.R.inc(10382);b = Integer.parseInt(mB.group().replaceFirst("^\\+", ""));
		} }else {{
			__CLR4_2_07rn7rnlnxz22t8.R.inc(10383);throw new Selector.SelectorParseException("Could not parse nth-index '%s': unexpected format", argS);
		}
		}}}}__CLR4_2_07rn7rnlnxz22t8.R.inc(10384);if ((((ofType)&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10385)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10386)==0&false)))
			{__CLR4_2_07rn7rnlnxz22t8.R.inc(10387);if ((((backwards)&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10388)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10389)==0&false)))
				{__CLR4_2_07rn7rnlnxz22t8.R.inc(10390);evals.add(new Evaluator.IsNthLastOfType(a, b));
			}else
				{__CLR4_2_07rn7rnlnxz22t8.R.inc(10391);evals.add(new Evaluator.IsNthOfType(a, b));
		}}else {{
			__CLR4_2_07rn7rnlnxz22t8.R.inc(10392);if ((((backwards)&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10393)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10394)==0&false)))
				{__CLR4_2_07rn7rnlnxz22t8.R.inc(10395);evals.add(new Evaluator.IsNthLastChild(a, b));
			}else
				{__CLR4_2_07rn7rnlnxz22t8.R.inc(10396);evals.add(new Evaluator.IsNthChild(a, b));
		}}
	}}finally{__CLR4_2_07rn7rnlnxz22t8.R.flushNeeded();}}

    private int consumeIndex() {try{__CLR4_2_07rn7rnlnxz22t8.R.inc(10397);
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10398);String indexS = tq.chompTo(")").trim();
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10399);Validate.isTrue(StringUtil.isNumeric(indexS), "Index must be numeric");
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10400);return Integer.parseInt(indexS);
    }finally{__CLR4_2_07rn7rnlnxz22t8.R.flushNeeded();}}

    // pseudo selector :has(el)
    private void has() {try{__CLR4_2_07rn7rnlnxz22t8.R.inc(10401);
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10402);tq.consume(":has");
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10403);String subQuery = tq.chompBalanced('(', ')');
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10404);Validate.notEmpty(subQuery, ":has(el) subselect must not be empty");
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10405);evals.add(new StructuralEvaluator.Has(parse(subQuery)));
    }finally{__CLR4_2_07rn7rnlnxz22t8.R.flushNeeded();}}

    // pseudo selector :contains(text), containsOwn(text)
    private void contains(boolean own) {try{__CLR4_2_07rn7rnlnxz22t8.R.inc(10406);
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10407);tq.consume((((own )&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10408)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10409)==0&false))? ":containsOwn" : ":contains");
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10410);String searchText = TokenQueue.unescape(tq.chompBalanced('(', ')'));
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10411);Validate.notEmpty(searchText, ":contains(text) query must not be empty");
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10412);if ((((own)&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10413)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10414)==0&false)))
            {__CLR4_2_07rn7rnlnxz22t8.R.inc(10415);evals.add(new Evaluator.ContainsOwnText(searchText));
        }else
            {__CLR4_2_07rn7rnlnxz22t8.R.inc(10416);evals.add(new Evaluator.ContainsText(searchText));
    }}finally{__CLR4_2_07rn7rnlnxz22t8.R.flushNeeded();}}

    // pseudo selector :containsData(data)
    private void containsData() {try{__CLR4_2_07rn7rnlnxz22t8.R.inc(10417);
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10418);tq.consume(":containsData");
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10419);String searchText = TokenQueue.unescape(tq.chompBalanced('(', ')'));
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10420);Validate.notEmpty(searchText, ":containsData(text) query must not be empty");
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10421);evals.add(new Evaluator.ContainsData(searchText));
    }finally{__CLR4_2_07rn7rnlnxz22t8.R.flushNeeded();}}

    // :matches(regex), matchesOwn(regex)
    private void matches(boolean own) {try{__CLR4_2_07rn7rnlnxz22t8.R.inc(10422);
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10423);tq.consume((((own )&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10424)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10425)==0&false))? ":matchesOwn" : ":matches");
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10426);String regex = tq.chompBalanced('(', ')'); // don't unescape, as regex bits will be escaped
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10427);Validate.notEmpty(regex, ":matches(regex) query must not be empty");

        __CLR4_2_07rn7rnlnxz22t8.R.inc(10428);if ((((own)&&(__CLR4_2_07rn7rnlnxz22t8.R.iget(10429)!=0|true))||(__CLR4_2_07rn7rnlnxz22t8.R.iget(10430)==0&false)))
            {__CLR4_2_07rn7rnlnxz22t8.R.inc(10431);evals.add(new Evaluator.MatchesOwn(Pattern.compile(regex)));
        }else
            {__CLR4_2_07rn7rnlnxz22t8.R.inc(10432);evals.add(new Evaluator.Matches(Pattern.compile(regex)));
    }}finally{__CLR4_2_07rn7rnlnxz22t8.R.flushNeeded();}}

    // :not(selector)
    private void not() {try{__CLR4_2_07rn7rnlnxz22t8.R.inc(10433);
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10434);tq.consume(":not");
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10435);String subQuery = tq.chompBalanced('(', ')');
        __CLR4_2_07rn7rnlnxz22t8.R.inc(10436);Validate.notEmpty(subQuery, ":not(selector) subselect must not be empty");

        __CLR4_2_07rn7rnlnxz22t8.R.inc(10437);evals.add(new StructuralEvaluator.Not(parse(subQuery)));
    }finally{__CLR4_2_07rn7rnlnxz22t8.R.flushNeeded();}}
}
