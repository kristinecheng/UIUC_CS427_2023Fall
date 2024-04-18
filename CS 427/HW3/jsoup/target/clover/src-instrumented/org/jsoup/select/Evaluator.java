/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.select;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.PseudoTextElement;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.jsoup.internal.Normalizer.lowerCase;
import static org.jsoup.internal.Normalizer.normalize;


/**
 * Evaluates that an element matches the selector.
 */
public abstract class Evaluator {public static class __CLR4_2_07h17h1lnxz22sm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,9971,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected Evaluator() {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9685);
    }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

    /**
     * Test if the element meets the evaluator's requirements.
     *
     * @param root    Root of the matching subtree
     * @param element tested element
     * @return Returns <tt>true</tt> if the requirements are met or
     * <tt>false</tt> otherwise
     */
    public abstract boolean matches(Element root, Element element);

    /**
     * Evaluator for tag name
     */
    public static final class Tag extends Evaluator {
        private String tagName;

        public Tag(String tagName) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9686);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9687);this.tagName = tagName;
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9688);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9689);return (element.tagName().equalsIgnoreCase(tagName));
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9690);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9691);return String.format("%s", tagName);
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}
    }


    /**
     * Evaluator for tag name that ends with
     */
    public static final class TagEndsWith extends Evaluator {
        private String tagName;

        public TagEndsWith(String tagName) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9692);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9693);this.tagName = tagName;
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9694);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9695);return (element.tagName().endsWith(tagName));
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9696);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9697);return String.format("%s", tagName);
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}
    }

    /**
     * Evaluator for element id
     */
    public static final class Id extends Evaluator {
        private String id;

        public Id(String id) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9698);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9699);this.id = id;
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9700);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9701);return (id.equals(element.id()));
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9702);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9703);return String.format("#%s", id);
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

    }

    /**
     * Evaluator for element class
     */
    public static final class Class extends Evaluator {
        private String className;

        public Class(String className) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9704);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9705);this.className = className;
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9706);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9707);return (element.hasClass(className));
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9708);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9709);return String.format(".%s", className);
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

    }

    /**
     * Evaluator for attribute name matching
     */
    public static final class Attribute extends Evaluator {
        private String key;

        public Attribute(String key) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9710);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9711);this.key = key;
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9712);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9713);return element.hasAttr(key);
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9714);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9715);return String.format("[%s]", key);
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

    }

    /**
     * Evaluator for attribute name prefix matching
     */
    public static final class AttributeStarting extends Evaluator {
        private String keyPrefix;

        public AttributeStarting(String keyPrefix) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9716);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9717);Validate.notEmpty(keyPrefix);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9718);this.keyPrefix = lowerCase(keyPrefix);
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9719);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9720);List<org.jsoup.nodes.Attribute> values = element.attributes().asList();
            __CLR4_2_07h17h1lnxz22sm.R.inc(9721);for (org.jsoup.nodes.Attribute attribute : values) {{
                __CLR4_2_07h17h1lnxz22sm.R.inc(9722);if ((((lowerCase(attribute.getKey()).startsWith(keyPrefix))&&(__CLR4_2_07h17h1lnxz22sm.R.iget(9723)!=0|true))||(__CLR4_2_07h17h1lnxz22sm.R.iget(9724)==0&false)))
                    {__CLR4_2_07h17h1lnxz22sm.R.inc(9725);return true;
            }}
            }__CLR4_2_07h17h1lnxz22sm.R.inc(9726);return false;
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9727);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9728);return String.format("[^%s]", keyPrefix);
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

    }

    /**
     * Evaluator for attribute name/value matching
     */
    public static final class AttributeWithValue extends AttributeKeyPair {
        public AttributeWithValue(String key, String value) {
            super(key, value);__CLR4_2_07h17h1lnxz22sm.R.inc(9730);try{__CLR4_2_07h17h1lnxz22sm.R.inc(9729);
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9731);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9732);return element.hasAttr(key) && value.equalsIgnoreCase(element.attr(key).trim());
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9733);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9734);return String.format("[%s=%s]", key, value);
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

    }

    /**
     * Evaluator for attribute name != value matching
     */
    public static final class AttributeWithValueNot extends AttributeKeyPair {
        public AttributeWithValueNot(String key, String value) {
            super(key, value);__CLR4_2_07h17h1lnxz22sm.R.inc(9736);try{__CLR4_2_07h17h1lnxz22sm.R.inc(9735);
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9737);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9738);return !value.equalsIgnoreCase(element.attr(key));
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9739);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9740);return String.format("[%s!=%s]", key, value);
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

    }

    /**
     * Evaluator for attribute name/value matching (value prefix)
     */
    public static final class AttributeWithValueStarting extends AttributeKeyPair {
        public AttributeWithValueStarting(String key, String value) {
            super(key, value);__CLR4_2_07h17h1lnxz22sm.R.inc(9742);try{__CLR4_2_07h17h1lnxz22sm.R.inc(9741);
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9743);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9744);return element.hasAttr(key) && lowerCase(element.attr(key)).startsWith(value); // value is lower case already
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9745);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9746);return String.format("[%s^=%s]", key, value);
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

    }

    /**
     * Evaluator for attribute name/value matching (value ending)
     */
    public static final class AttributeWithValueEnding extends AttributeKeyPair {
        public AttributeWithValueEnding(String key, String value) {
            super(key, value);__CLR4_2_07h17h1lnxz22sm.R.inc(9748);try{__CLR4_2_07h17h1lnxz22sm.R.inc(9747);
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9749);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9750);return element.hasAttr(key) && lowerCase(element.attr(key)).endsWith(value); // value is lower case
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9751);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9752);return String.format("[%s$=%s]", key, value);
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

    }

    /**
     * Evaluator for attribute name/value matching (value containing)
     */
    public static final class AttributeWithValueContaining extends AttributeKeyPair {
        public AttributeWithValueContaining(String key, String value) {
            super(key, value);__CLR4_2_07h17h1lnxz22sm.R.inc(9754);try{__CLR4_2_07h17h1lnxz22sm.R.inc(9753);
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9755);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9756);return element.hasAttr(key) && lowerCase(element.attr(key)).contains(value); // value is lower case
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9757);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9758);return String.format("[%s*=%s]", key, value);
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

    }

    /**
     * Evaluator for attribute name/value matching (value regex matching)
     */
    public static final class AttributeWithValueMatching extends Evaluator {
        String key;
        Pattern pattern;

        public AttributeWithValueMatching(String key, Pattern pattern) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9759);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9760);this.key = normalize(key);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9761);this.pattern = pattern;
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9762);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9763);return element.hasAttr(key) && pattern.matcher(element.attr(key)).find();
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9764);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9765);return String.format("[%s~=%s]", key, pattern.toString());
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

    }

    /**
     * Abstract evaluator for attribute name/value matching
     */
    public abstract static class AttributeKeyPair extends Evaluator {
        String key;
        String value;

        public AttributeKeyPair(String key, String value) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9766);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9767);Validate.notEmpty(key);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9768);Validate.notEmpty(value);

            __CLR4_2_07h17h1lnxz22sm.R.inc(9769);this.key = normalize(key);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9770);if ((((value.startsWith("\"") && value.endsWith("\"")
                    || value.startsWith("'") && value.endsWith("'"))&&(__CLR4_2_07h17h1lnxz22sm.R.iget(9771)!=0|true))||(__CLR4_2_07h17h1lnxz22sm.R.iget(9772)==0&false))) {{
                __CLR4_2_07h17h1lnxz22sm.R.inc(9773);value = value.substring(1, value.length()-1);
            }
            }__CLR4_2_07h17h1lnxz22sm.R.inc(9774);this.value = normalize(value);
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}
    }

    /**
     * Evaluator for any / all element matching
     */
    public static final class AllElements extends Evaluator {

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9775);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9776);return true;
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9777);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9778);return "*";
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}
    }

    /**
     * Evaluator for matching by sibling index number (e {@literal <} idx)
     */
    public static final class IndexLessThan extends IndexEvaluator {
        public IndexLessThan(int index) {
            super(index);__CLR4_2_07h17h1lnxz22sm.R.inc(9780);try{__CLR4_2_07h17h1lnxz22sm.R.inc(9779);
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9781);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9782);return root != element && element.elementSiblingIndex() < index;
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9783);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9784);return String.format(":lt(%d)", index);
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

    }

    /**
     * Evaluator for matching by sibling index number (e {@literal >} idx)
     */
    public static final class IndexGreaterThan extends IndexEvaluator {
        public IndexGreaterThan(int index) {
            super(index);__CLR4_2_07h17h1lnxz22sm.R.inc(9786);try{__CLR4_2_07h17h1lnxz22sm.R.inc(9785);
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9787);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9788);return element.elementSiblingIndex() > index;
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9789);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9790);return String.format(":gt(%d)", index);
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

    }

    /**
     * Evaluator for matching by sibling index number (e = idx)
     */
    public static final class IndexEquals extends IndexEvaluator {
        public IndexEquals(int index) {
            super(index);__CLR4_2_07h17h1lnxz22sm.R.inc(9792);try{__CLR4_2_07h17h1lnxz22sm.R.inc(9791);
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9793);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9794);return element.elementSiblingIndex() == index;
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9795);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9796);return String.format(":eq(%d)", index);
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

    }

    /**
     * Evaluator for matching the last sibling (css :last-child)
     */
    public static final class IsLastChild extends Evaluator {
		@Override
		public boolean matches(Element root, Element element) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9797);
			__CLR4_2_07h17h1lnxz22sm.R.inc(9798);final Element p = element.parent();
			__CLR4_2_07h17h1lnxz22sm.R.inc(9799);return p != null && !(p instanceof Document) && element.elementSiblingIndex() == p.children().size()-1;
		}finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

		@Override
		public String toString() {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9800);
			__CLR4_2_07h17h1lnxz22sm.R.inc(9801);return ":last-child";
		}finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}
    }

    public static final class IsFirstOfType extends IsNthOfType {
		public IsFirstOfType() {
			super(0,1);__CLR4_2_07h17h1lnxz22sm.R.inc(9803);try{__CLR4_2_07h17h1lnxz22sm.R.inc(9802);
		}finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}
		@Override
		public String toString() {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9804);
			__CLR4_2_07h17h1lnxz22sm.R.inc(9805);return ":first-of-type";
		}finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}
    }

    public static final class IsLastOfType extends IsNthLastOfType {
		public IsLastOfType() {
			super(0,1);__CLR4_2_07h17h1lnxz22sm.R.inc(9807);try{__CLR4_2_07h17h1lnxz22sm.R.inc(9806);
		}finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}
		@Override
		public String toString() {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9808);
			__CLR4_2_07h17h1lnxz22sm.R.inc(9809);return ":last-of-type";
		}finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}
    }


    public static abstract class CssNthEvaluator extends Evaluator {
    	protected final int a, b;

    	public CssNthEvaluator(int a, int b) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9810);
    		__CLR4_2_07h17h1lnxz22sm.R.inc(9811);this.a = a;
    		__CLR4_2_07h17h1lnxz22sm.R.inc(9812);this.b = b;
    	}finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}
    	public CssNthEvaluator(int b) {
    		this(0,b);__CLR4_2_07h17h1lnxz22sm.R.inc(9814);try{__CLR4_2_07h17h1lnxz22sm.R.inc(9813);
    	}finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

    	@Override
    	public boolean matches(Element root, Element element) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9815);
    		__CLR4_2_07h17h1lnxz22sm.R.inc(9816);final Element p = element.parent();
    		__CLR4_2_07h17h1lnxz22sm.R.inc(9817);if ((((p == null || (p instanceof Document))&&(__CLR4_2_07h17h1lnxz22sm.R.iget(9818)!=0|true))||(__CLR4_2_07h17h1lnxz22sm.R.iget(9819)==0&false))) {__CLR4_2_07h17h1lnxz22sm.R.inc(9820);return false;

    		}__CLR4_2_07h17h1lnxz22sm.R.inc(9821);final int pos = calculatePosition(root, element);
    		__CLR4_2_07h17h1lnxz22sm.R.inc(9822);if ((((a == 0)&&(__CLR4_2_07h17h1lnxz22sm.R.iget(9823)!=0|true))||(__CLR4_2_07h17h1lnxz22sm.R.iget(9824)==0&false))) {__CLR4_2_07h17h1lnxz22sm.R.inc(9825);return pos == b;

    		}__CLR4_2_07h17h1lnxz22sm.R.inc(9826);return (pos-b)*a >= 0 && (pos-b)%a==0;
    	}finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

		@Override
		public String toString() {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9827);
			__CLR4_2_07h17h1lnxz22sm.R.inc(9828);if ((((a == 0)&&(__CLR4_2_07h17h1lnxz22sm.R.iget(9829)!=0|true))||(__CLR4_2_07h17h1lnxz22sm.R.iget(9830)==0&false)))
				{__CLR4_2_07h17h1lnxz22sm.R.inc(9831);return String.format(":%s(%d)",getPseudoClass(), b);
			}__CLR4_2_07h17h1lnxz22sm.R.inc(9832);if ((((b == 0)&&(__CLR4_2_07h17h1lnxz22sm.R.iget(9833)!=0|true))||(__CLR4_2_07h17h1lnxz22sm.R.iget(9834)==0&false)))
				{__CLR4_2_07h17h1lnxz22sm.R.inc(9835);return String.format(":%s(%dn)",getPseudoClass(), a);
			}__CLR4_2_07h17h1lnxz22sm.R.inc(9836);return String.format(":%s(%dn%+d)", getPseudoClass(),a, b);
		}finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

		protected abstract String getPseudoClass();
		protected abstract int calculatePosition(Element root, Element element);
    }


    /**
     * css-compatible Evaluator for :eq (css :nth-child)
     *
     * @see IndexEquals
     */
    public static final class IsNthChild extends CssNthEvaluator {

    	public IsNthChild(int a, int b) {
    		super(a,b);__CLR4_2_07h17h1lnxz22sm.R.inc(9838);try{__CLR4_2_07h17h1lnxz22sm.R.inc(9837);
		}finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

		protected int calculatePosition(Element root, Element element) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9839);
			__CLR4_2_07h17h1lnxz22sm.R.inc(9840);return element.elementSiblingIndex()+1;
		}finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}


		protected String getPseudoClass() {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9841);
			__CLR4_2_07h17h1lnxz22sm.R.inc(9842);return "nth-child";
		}finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}
    }

    /**
     * css pseudo class :nth-last-child)
     *
     * @see IndexEquals
     */
    public static final class IsNthLastChild extends CssNthEvaluator {
    	public IsNthLastChild(int a, int b) {
    		super(a,b);__CLR4_2_07h17h1lnxz22sm.R.inc(9844);try{__CLR4_2_07h17h1lnxz22sm.R.inc(9843);
    	}finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        protected int calculatePosition(Element root, Element element) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9845);
        	__CLR4_2_07h17h1lnxz22sm.R.inc(9846);return element.parent().children().size() - element.elementSiblingIndex();
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

		@Override
		protected String getPseudoClass() {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9847);
			__CLR4_2_07h17h1lnxz22sm.R.inc(9848);return "nth-last-child";
		}finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}
    }

    /**
     * css pseudo class nth-of-type
     *
     */
    public static class IsNthOfType extends CssNthEvaluator {
    	public IsNthOfType(int a, int b) {
    		super(a,b);__CLR4_2_07h17h1lnxz22sm.R.inc(9850);try{__CLR4_2_07h17h1lnxz22sm.R.inc(9849);
    	}finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

		protected int calculatePosition(Element root, Element element) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9851);
			__CLR4_2_07h17h1lnxz22sm.R.inc(9852);int pos = 0;
        	__CLR4_2_07h17h1lnxz22sm.R.inc(9853);Elements family = element.parent().children();
            __CLR4_2_07h17h1lnxz22sm.R.inc(9854);for (Element el : family) {{
                __CLR4_2_07h17h1lnxz22sm.R.inc(9855);if ((((el.tag().equals(element.tag()))&&(__CLR4_2_07h17h1lnxz22sm.R.iget(9856)!=0|true))||(__CLR4_2_07h17h1lnxz22sm.R.iget(9857)==0&false))) {__CLR4_2_07h17h1lnxz22sm.R.inc(9858);pos++;
                }__CLR4_2_07h17h1lnxz22sm.R.inc(9859);if ((((el == element)&&(__CLR4_2_07h17h1lnxz22sm.R.iget(9860)!=0|true))||(__CLR4_2_07h17h1lnxz22sm.R.iget(9861)==0&false))) {__CLR4_2_07h17h1lnxz22sm.R.inc(9862);break;
            }}
			}__CLR4_2_07h17h1lnxz22sm.R.inc(9863);return pos;
		}finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

		@Override
		protected String getPseudoClass() {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9864);
			__CLR4_2_07h17h1lnxz22sm.R.inc(9865);return "nth-of-type";
		}finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}
    }

    public static class IsNthLastOfType extends CssNthEvaluator {

		public IsNthLastOfType(int a, int b) {
			super(a, b);__CLR4_2_07h17h1lnxz22sm.R.inc(9867);try{__CLR4_2_07h17h1lnxz22sm.R.inc(9866);
		}finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

		@Override
		protected int calculatePosition(Element root, Element element) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9868);
			__CLR4_2_07h17h1lnxz22sm.R.inc(9869);int pos = 0;
        	__CLR4_2_07h17h1lnxz22sm.R.inc(9870);Elements family = element.parent().children();
        	__CLR4_2_07h17h1lnxz22sm.R.inc(9871);for (int i = element.elementSiblingIndex(); (((i < family.size())&&(__CLR4_2_07h17h1lnxz22sm.R.iget(9872)!=0|true))||(__CLR4_2_07h17h1lnxz22sm.R.iget(9873)==0&false)); i++) {{
        		__CLR4_2_07h17h1lnxz22sm.R.inc(9874);if ((((family.get(i).tag().equals(element.tag()))&&(__CLR4_2_07h17h1lnxz22sm.R.iget(9875)!=0|true))||(__CLR4_2_07h17h1lnxz22sm.R.iget(9876)==0&false))) {__CLR4_2_07h17h1lnxz22sm.R.inc(9877);pos++;
        	}}
			}__CLR4_2_07h17h1lnxz22sm.R.inc(9878);return pos;
		}finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

		@Override
		protected String getPseudoClass() {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9879);
			__CLR4_2_07h17h1lnxz22sm.R.inc(9880);return "nth-last-of-type";
		}finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}
    }

    /**
     * Evaluator for matching the first sibling (css :first-child)
     */
    public static final class IsFirstChild extends Evaluator {
    	@Override
    	public boolean matches(Element root, Element element) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9881);
    		__CLR4_2_07h17h1lnxz22sm.R.inc(9882);final Element p = element.parent();
    		__CLR4_2_07h17h1lnxz22sm.R.inc(9883);return p != null && !(p instanceof Document) && element.elementSiblingIndex() == 0;
    	}finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

    	@Override
    	public String toString() {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9884);
    		__CLR4_2_07h17h1lnxz22sm.R.inc(9885);return ":first-child";
    	}finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}
    }

    /**
     * css3 pseudo-class :root
     * @see <a href="http://www.w3.org/TR/selectors/#root-pseudo">:root selector</a>
     *
     */
    public static final class IsRoot extends Evaluator {
    	@Override
    	public boolean matches(Element root, Element element) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9886);
    		__CLR4_2_07h17h1lnxz22sm.R.inc(9887);final Element r = (((root instanceof Document)&&(__CLR4_2_07h17h1lnxz22sm.R.iget(9888)!=0|true))||(__CLR4_2_07h17h1lnxz22sm.R.iget(9889)==0&false))?root.child(0):root;
    		__CLR4_2_07h17h1lnxz22sm.R.inc(9890);return element == r;
    	}finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}
    	@Override
    	public String toString() {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9891);
    		__CLR4_2_07h17h1lnxz22sm.R.inc(9892);return ":root";
    	}finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}
    }

    public static final class IsOnlyChild extends Evaluator {
		@Override
		public boolean matches(Element root, Element element) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9893);
			__CLR4_2_07h17h1lnxz22sm.R.inc(9894);final Element p = element.parent();
			__CLR4_2_07h17h1lnxz22sm.R.inc(9895);return p!=null && !(p instanceof Document) && element.siblingElements().isEmpty();
		}finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}
    	@Override
    	public String toString() {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9896);
    		__CLR4_2_07h17h1lnxz22sm.R.inc(9897);return ":only-child";
    	}finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}
    }

    public static final class IsOnlyOfType extends Evaluator {
		@Override
		public boolean matches(Element root, Element element) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9898);
			__CLR4_2_07h17h1lnxz22sm.R.inc(9899);final Element p = element.parent();
			__CLR4_2_07h17h1lnxz22sm.R.inc(9900);if ((((p==null || p instanceof Document)&&(__CLR4_2_07h17h1lnxz22sm.R.iget(9901)!=0|true))||(__CLR4_2_07h17h1lnxz22sm.R.iget(9902)==0&false))) {__CLR4_2_07h17h1lnxz22sm.R.inc(9903);return false;

			}__CLR4_2_07h17h1lnxz22sm.R.inc(9904);int pos = 0;
        	__CLR4_2_07h17h1lnxz22sm.R.inc(9905);Elements family = p.children();
            __CLR4_2_07h17h1lnxz22sm.R.inc(9906);for (Element el : family) {{
                __CLR4_2_07h17h1lnxz22sm.R.inc(9907);if ((((el.tag().equals(element.tag()))&&(__CLR4_2_07h17h1lnxz22sm.R.iget(9908)!=0|true))||(__CLR4_2_07h17h1lnxz22sm.R.iget(9909)==0&false))) {__CLR4_2_07h17h1lnxz22sm.R.inc(9910);pos++;
            }}
        	}__CLR4_2_07h17h1lnxz22sm.R.inc(9911);return pos == 1;
		}finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}
    	@Override
    	public String toString() {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9912);
    		__CLR4_2_07h17h1lnxz22sm.R.inc(9913);return ":only-of-type";
    	}finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}
    }

    public static final class IsEmpty extends Evaluator {
		@Override
		public boolean matches(Element root, Element element) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9914);
        	__CLR4_2_07h17h1lnxz22sm.R.inc(9915);List<Node> family = element.childNodes();
            __CLR4_2_07h17h1lnxz22sm.R.inc(9916);for (Node n : family) {{
                __CLR4_2_07h17h1lnxz22sm.R.inc(9917);if ((((!(n instanceof Comment || n instanceof XmlDeclaration || n instanceof DocumentType))&&(__CLR4_2_07h17h1lnxz22sm.R.iget(9918)!=0|true))||(__CLR4_2_07h17h1lnxz22sm.R.iget(9919)==0&false))) {__CLR4_2_07h17h1lnxz22sm.R.inc(9920);return false;
            }}
        	}__CLR4_2_07h17h1lnxz22sm.R.inc(9921);return true;
		}finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}
    	@Override
    	public String toString() {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9922);
    		__CLR4_2_07h17h1lnxz22sm.R.inc(9923);return ":empty";
    	}finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}
    }

    /**
     * Abstract evaluator for sibling index matching
     *
     * @author ant
     */
    public abstract static class IndexEvaluator extends Evaluator {
        int index;

        public IndexEvaluator(int index) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9924);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9925);this.index = index;
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}
    }

    /**
     * Evaluator for matching Element (and its descendants) text
     */
    public static final class ContainsText extends Evaluator {
        private String searchText;

        public ContainsText(String searchText) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9926);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9927);this.searchText = lowerCase(searchText);
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9928);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9929);return lowerCase(element.text()).contains(searchText);
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9930);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9931);return String.format(":contains(%s)", searchText);
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}
    }

    /**
     * Evaluator for matching Element (and its descendants) data
     */
    public static final class ContainsData extends Evaluator {
        private String searchText;

        public ContainsData(String searchText) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9932);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9933);this.searchText = lowerCase(searchText);
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9934);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9935);return lowerCase(element.data()).contains(searchText);
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9936);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9937);return String.format(":containsData(%s)", searchText);
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}
    }

    /**
     * Evaluator for matching Element's own text
     */
    public static final class ContainsOwnText extends Evaluator {
        private String searchText;

        public ContainsOwnText(String searchText) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9938);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9939);this.searchText = lowerCase(searchText);
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9940);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9941);return lowerCase(element.ownText()).contains(searchText);
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9942);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9943);return String.format(":containsOwn(%s)", searchText);
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}
    }

    /**
     * Evaluator for matching Element (and its descendants) text with regex
     */
    public static final class Matches extends Evaluator {
        private Pattern pattern;

        public Matches(Pattern pattern) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9944);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9945);this.pattern = pattern;
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9946);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9947);Matcher m = pattern.matcher(element.text());
            __CLR4_2_07h17h1lnxz22sm.R.inc(9948);return m.find();
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9949);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9950);return String.format(":matches(%s)", pattern);
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}
    }

    /**
     * Evaluator for matching Element's own text with regex
     */
    public static final class MatchesOwn extends Evaluator {
        private Pattern pattern;

        public MatchesOwn(Pattern pattern) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9951);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9952);this.pattern = pattern;
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9953);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9954);Matcher m = pattern.matcher(element.ownText());
            __CLR4_2_07h17h1lnxz22sm.R.inc(9955);return m.find();
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9956);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9957);return String.format(":matchesOwn(%s)", pattern);
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}
    }

    public static final class MatchText extends Evaluator {

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9958);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9959);if ((((element instanceof PseudoTextElement)&&(__CLR4_2_07h17h1lnxz22sm.R.iget(9960)!=0|true))||(__CLR4_2_07h17h1lnxz22sm.R.iget(9961)==0&false)))
                {__CLR4_2_07h17h1lnxz22sm.R.inc(9962);return true;

            }__CLR4_2_07h17h1lnxz22sm.R.inc(9963);List<TextNode> textNodes = element.textNodes();
            __CLR4_2_07h17h1lnxz22sm.R.inc(9964);for (TextNode textNode : textNodes) {{
                __CLR4_2_07h17h1lnxz22sm.R.inc(9965);PseudoTextElement pel = new PseudoTextElement(
                    org.jsoup.parser.Tag.valueOf(element.tagName()), element.baseUri(), element.attributes());
                __CLR4_2_07h17h1lnxz22sm.R.inc(9966);textNode.replaceWith(pel);
                __CLR4_2_07h17h1lnxz22sm.R.inc(9967);pel.appendChild(textNode);
            }
            }__CLR4_2_07h17h1lnxz22sm.R.inc(9968);return false;
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_07h17h1lnxz22sm.R.inc(9969);
            __CLR4_2_07h17h1lnxz22sm.R.inc(9970);return ":matchText";
        }finally{__CLR4_2_07h17h1lnxz22sm.R.flushNeeded();}}
    }
}
