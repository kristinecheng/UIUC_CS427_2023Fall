package org.jsoup.mytests;// java -classpath target/classes;"C:/Program Files/randoop-4.3.2/randoop-all-4.3.2.jar" randoop.main.Main gentests --testclass=org.jsoup.nodes.Element --output-limit=500

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AutomatedTest {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        org.jsoup.parser.Tag tag0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element2 = new org.jsoup.nodes.Element(tag0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.jsoup.parser.Tag tag0 = null;
        org.jsoup.nodes.Attributes attributes2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag0, "hi!", attributes2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.NodeFilter nodeFilter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = element4.filter(nodeFilter6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.util.regex.Pattern pattern5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = element4.getElementsMatchingOwnText(pattern5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = element4.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        int int3 = element1.childNodeSize();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList6 = element5.textNodes();
        org.jsoup.nodes.Element element7 = element5.nextElementSibling();
        java.lang.String str8 = element5.normalName();
        org.jsoup.nodes.Element element9 = element5.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element1.before((org.jsoup.nodes.Node) element9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(textNodeList6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = element3.getElementsByAttributeValue("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList8 = element7.textNodes();
        org.jsoup.nodes.Element element9 = element7.shallowClone();
        org.jsoup.nodes.Element element10 = element9.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element5.after((org.jsoup.nodes.Node) element9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(textNodeList8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        boolean boolean9 = element4.hasAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element4.prependElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.shallowClone();
        int int4 = element1.siblingIndex();
        org.jsoup.select.Elements elements5 = element1.nextElementSiblings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element1.textNodes();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(textNodeList7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element4.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        int int3 = element1.childNodeSize();
        java.lang.String str4 = element1.nodeName();
        boolean boolean6 = element1.hasClass("hi!");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Document document5 = element1.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = document5.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.jsoup.parser.Tag tag0 = null;
        org.jsoup.nodes.Attributes attributes2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag0, "", attributes2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.shallowClone();
        org.jsoup.nodes.Element element4 = element3.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = element4.getElementsByAttributeStarting("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(element4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.shallowClone();
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element5 = element1.nextElementSibling();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(element5);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element7.tagName("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Tag name must not be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element10.textNodes();
        org.jsoup.nodes.Element element12 = element10.nextElementSibling();
        java.lang.String str13 = element10.normalName();
        org.jsoup.nodes.Element element14 = element10.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = element1.after((org.jsoup.nodes.Node) element14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        java.lang.String str14 = element4.val();
        org.jsoup.select.Elements elements16 = element4.getElementsByClass("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = element4.prependElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.shallowClone();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexEquals((int) (short) -1);
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.select.Elements elements6 = element4.getElementsByAttribute("hi!");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Document document5 = element1.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = document5.cssSelector();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        boolean boolean9 = element4.hasAttr("hi!");
        org.jsoup.select.Elements elements11 = element4.getElementsContainingText("");
        org.jsoup.nodes.Element element13 = element4.prependText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = element4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        java.lang.String str7 = element4.ownText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element4.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = element3.hasParent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        boolean boolean8 = element4.hasClass("hi!");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        element1.setBaseUri("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = element1.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        boolean boolean5 = element1.hasText();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        java.lang.String str14 = element4.val();
        org.jsoup.nodes.Element element15 = element4.empty();
        int int16 = element4.elementSiblingIndex();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Document document5 = element1.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = document5.lastElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        org.jsoup.nodes.Element element15 = element4.removeAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = element4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        element1.setBaseUri("hi!");
        org.jsoup.select.Elements elements9 = element1.getElementsMatchingOwnText("hi!");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            element5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element11.nextElementSibling();
        java.lang.String str14 = element11.normalName();
        org.jsoup.nodes.Element element15 = element11.shallowClone();
        element11.setBaseUri("hi!");
        org.jsoup.select.Elements elements19 = element11.getElementsMatchingOwnText("hi!");
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList24 = element23.textNodes();
        org.jsoup.nodes.Node node25 = element23.previousSibling();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList28 = element27.textNodes();
        org.jsoup.nodes.Element element29 = element27.shallowClone();
        int int30 = element27.siblingIndex();
        org.jsoup.select.Elements elements31 = element27.nextElementSiblings();
        org.jsoup.nodes.Element element33 = element27.prependText("");
        org.jsoup.nodes.Node[] nodeArray34 = new org.jsoup.nodes.Node[] { element11, element21, node25, element27 };
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element35 = element4.insertChildren((int) (byte) -1, nodeArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array must not contain any null objects");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(textNodeList24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(textNodeList28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(nodeArray34);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        java.util.regex.Pattern pattern7 = null;
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", pattern7);
        org.jsoup.nodes.Element element11 = element1.attr("", false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element11.selectFirst("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        java.lang.String str7 = element4.text();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element10.textNodes();
        org.jsoup.nodes.Element element13 = element10.removeAttr("");
        java.lang.String str14 = element13.text();
        org.jsoup.nodes.Element element16 = element13.addClass("");
        java.lang.String str17 = element13.text();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList21 = element20.textNodes();
        org.jsoup.nodes.Element element22 = element13.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList21);
        java.lang.String str23 = element13.val();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList24 = element13.textNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element25 = element4.insertChildren((int) (short) 100, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(textNodeList21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(textNodeList24);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        java.util.regex.Pattern pattern7 = null;
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", pattern7);
        org.jsoup.nodes.Element element11 = element1.attr("", false);
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList14 = element13.textNodes();
        org.jsoup.nodes.Element element16 = element13.removeAttr("");
        java.lang.String str17 = element16.text();
        org.jsoup.nodes.Element element19 = element16.addClass("");
        java.lang.String str20 = element16.text();
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList24 = element23.textNodes();
        org.jsoup.nodes.Element element25 = element16.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList24);
        java.lang.String str26 = element16.val();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element27 = element1.after((org.jsoup.nodes.Node) element16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(textNodeList14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(textNodeList24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        int int7 = element4.childNodeSize();
        java.util.Set<java.lang.String> strSet8 = element4.classNames();
        org.jsoup.nodes.Document document9 = element4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = document9.previousElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        boolean boolean9 = element4.hasAttr("hi!");
        org.jsoup.select.Elements elements11 = element4.getElementsContainingText("");
        boolean boolean12 = element4.hasText();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Node node3 = element1.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = element1.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        boolean boolean9 = element4.hasAttr("hi!");
        org.jsoup.nodes.Element element10 = element4.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element10.after("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Node node3 = element1.previousSibling();
        java.lang.String str4 = element1.id();
        org.jsoup.select.Elements elements5 = element1.parents();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        org.jsoup.nodes.Element element9 = element6.removeAttr("");
        java.lang.String str10 = element9.text();
        org.jsoup.nodes.Element element12 = element9.addClass("");
        java.lang.String str13 = element9.text();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        int int20 = element18.elementSiblingIndex();
        org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Node node22 = element18.nextSibling();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(textNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        org.jsoup.nodes.Element element14 = element13.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = element14.shallowClone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValueMatching("<hi!>\n hi!\n</hi!>", "<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element10.textNodes();
        org.jsoup.nodes.Element element12 = element10.shallowClone();
        int int13 = element10.siblingIndex();
        org.jsoup.select.Elements elements14 = element10.nextElementSiblings();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element10.childNodes();
        org.jsoup.nodes.Element element17 = element10.toggleClass("");
        boolean boolean18 = element4.equals((java.lang.Object) "");
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList22 = element21.textNodes();
        org.jsoup.nodes.Element element23 = element21.nextElementSibling();
        java.lang.String str24 = element21.normalName();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = element21.childNodes();
        org.jsoup.nodes.Element element27 = element21.append("");
        org.jsoup.nodes.Node[] nodeArray28 = new org.jsoup.nodes.Node[] { element27 };
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element29 = element4.insertChildren(10, nodeArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(textNodeList22);
        org.junit.Assert.assertNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(nodeArray28);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        java.util.regex.Pattern pattern7 = null;
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", pattern7);
        org.jsoup.nodes.Element element11 = element1.attr("", false);
        boolean boolean13 = element11.hasAttr("hi!");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("hi!");
        java.lang.String str4 = element3.wholeText();
        java.lang.String str5 = element3.toString();
        java.lang.String str6 = element3.text();
        java.lang.String str7 = element3.html();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!>\n hi!\n</hi!>" + "'", str5, "<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        int int7 = element4.childNodeSize();
        java.lang.String str8 = element4.wholeText();
        org.jsoup.nodes.Element element10 = element4.removeAttr("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("hi!", "");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        org.jsoup.nodes.Element element14 = element13.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element14.child((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        boolean boolean9 = element4.hasAttr("hi!");
        org.jsoup.select.Elements elements11 = element4.getElementsContainingText("");
        org.jsoup.nodes.Element element13 = element4.prependText("hi!");
        java.lang.String str14 = element13.data();
        org.jsoup.nodes.Element element16 = element13.appendText("<hi!></hi!>");
        org.jsoup.select.Elements elements18 = element13.getElementsByIndexGreaterThan((int) (short) 100);
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        int int14 = element13.childNodeSize();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        org.jsoup.nodes.Element element19 = element16.removeAttr("");
        java.lang.String str20 = element19.text();
        org.jsoup.nodes.Element element22 = element19.addClass("");
        java.lang.String str23 = element19.text();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList27 = element26.textNodes();
        org.jsoup.nodes.Element element28 = element19.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList27);
        org.jsoup.nodes.Element element31 = element19.attr("<hi!>\n hi!\n</hi!>", false);
        // The following exception was thrown during execution in test generation
        try {
            element13.replaceWith((org.jsoup.nodes.Node) element31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(textNodeList27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element31);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        org.jsoup.nodes.Element element16 = element4.attr("<hi!>\n hi!\n</hi!>", false);
        org.jsoup.select.Elements elements17 = element4.getAllElements();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        org.jsoup.nodes.Element element8 = element4.clone();
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("hi!");
        java.lang.String str4 = element3.wholeText();
        java.lang.String str5 = element3.toString();
        java.lang.String str6 = element3.text();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element9.appendText("hi!");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList14 = element13.textNodes();
        org.jsoup.nodes.Element element15 = element13.nextElementSibling();
        java.lang.String str16 = element13.normalName();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = element13.childNodes();
        org.jsoup.nodes.Element element19 = element13.append("");
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList22 = element21.textNodes();
        org.jsoup.nodes.Element element24 = element21.removeAttr("");
        java.lang.String str25 = element24.text();
        org.jsoup.select.Elements elements26 = element24.nextElementSiblings();
        org.jsoup.nodes.Node[] nodeArray27 = new org.jsoup.nodes.Node[] { element11, element19, element24 };
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element28 = element3.insertChildren((int) '4', nodeArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!>\n hi!\n</hi!>" + "'", str5, "<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(textNodeList14);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(textNodeList22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(nodeArray27);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("hi!");
        java.lang.String str4 = element3.wholeText();
        org.jsoup.select.NodeFilter nodeFilter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = element3.filter(nodeFilter5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Node node6 = element4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element4.child((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        int int7 = element4.childNodeSize();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = element4.dataset();
        org.jsoup.select.Elements elements9 = element4.nextElementSiblings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element4.getElementsByAttribute("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        java.lang.String str7 = element4.ownText();
        org.jsoup.select.Elements elements8 = element4.getAllElements();
        java.lang.String str10 = element4.attr("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Node node11 = element4.nextSibling();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Node node6 = element4.previousSibling();
        org.jsoup.select.Elements elements8 = element4.getElementsByTag("<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeStarting("<hi!></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        org.jsoup.nodes.Element element14 = element13.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element13.child((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        org.jsoup.nodes.Element element14 = element13.previousElementSibling();
        element13.setBaseUri("hi!");
        org.jsoup.select.Evaluator evaluator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = element13.is(evaluator17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        org.jsoup.nodes.Element element9 = element6.removeAttr("");
        java.lang.String str10 = element9.text();
        org.jsoup.nodes.Element element12 = element9.addClass("");
        java.lang.String str13 = element9.text();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        int int20 = element18.elementSiblingIndex();
        org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Element element23 = element18.appendText("<hi!></hi!>");
        boolean boolean24 = element18.hasParent();
        org.jsoup.nodes.Element element26 = element18.removeAttr("");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(textNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(element26);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element10.textNodes();
        org.jsoup.nodes.Element element12 = element10.shallowClone();
        int int13 = element10.siblingIndex();
        org.jsoup.select.Elements elements14 = element10.nextElementSiblings();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element10.childNodes();
        org.jsoup.nodes.Element element17 = element10.toggleClass("");
        boolean boolean18 = element4.equals((java.lang.Object) "");
        org.jsoup.select.Elements elements21 = element4.getElementsByAttributeValue("<hi!></hi!>", "<hi! class=\"\"></hi!>");
        org.jsoup.select.Elements elements23 = element4.getElementsByClass("hi!");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("hi!");
        java.lang.String str4 = element3.wholeText();
        java.lang.String str5 = element3.toString();
        org.jsoup.select.Elements elements6 = element3.children();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList9 = element8.textNodes();
        org.jsoup.nodes.Element element11 = element8.removeAttr("");
        java.lang.String str12 = element11.text();
        org.jsoup.nodes.Element element14 = element11.addClass("");
        boolean boolean16 = element11.hasAttr("hi!");
        org.jsoup.select.Elements elements18 = element11.getElementsContainingText("");
        org.jsoup.nodes.Element element20 = element11.prependText("hi!");
        org.jsoup.select.Elements elements21 = element20.getAllElements();
        java.lang.String str22 = element20.val();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element23 = element3.before((org.jsoup.nodes.Node) element20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!>\n hi!\n</hi!>" + "'", str5, "<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(textNodeList9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element9 = element8.clearAttributes();
        org.jsoup.select.Elements elements10 = element9.getAllElements();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element9.textNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element9.prependElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(textNodeList11);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element10.textNodes();
        org.jsoup.nodes.Element element12 = element10.shallowClone();
        int int13 = element10.siblingIndex();
        org.jsoup.select.Elements elements14 = element10.nextElementSiblings();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element10.childNodes();
        org.jsoup.nodes.Element element17 = element10.toggleClass("");
        boolean boolean18 = element4.equals((java.lang.Object) "");
        org.jsoup.select.Elements elements21 = element4.getElementsByAttributeValueNot("<hi!></hi!>", "<hi!></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        org.jsoup.select.Elements elements14 = element13.siblingElements();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        org.jsoup.nodes.Element element18 = element16.shallowClone();
        int int19 = element16.siblingIndex();
        org.jsoup.select.Elements elements20 = element16.nextElementSiblings();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = element16.childNodes();
        org.jsoup.nodes.Element element23 = element16.toggleClass("");
        org.jsoup.select.Elements elements25 = element16.getElementsMatchingOwnText("");
        boolean boolean26 = element13.hasSameValue((java.lang.Object) element16);
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element9 = element8.clearAttributes();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element11.nextElementSibling();
        java.lang.String str14 = element11.normalName();
        org.jsoup.nodes.Element element15 = element11.shallowClone();
        java.util.regex.Pattern pattern17 = null;
        org.jsoup.select.Elements elements18 = element11.getElementsByAttributeValueMatching("hi!", pattern17);
        boolean boolean19 = element9.equals((java.lang.Object) pattern17);
        org.jsoup.select.Elements elements21 = element9.getElementsContainingText("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Attributes attributes22 = element9.attributes();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(attributes22);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        java.lang.String str14 = element4.val();
        org.jsoup.nodes.Element element15 = element4.empty();
        // The following exception was thrown during execution in test generation
        try {
            element15.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.shallowClone();
        int int4 = element1.siblingIndex();
        java.lang.String str5 = element1.baseUri();
        org.jsoup.nodes.Element element6 = element1.clearAttributes();
        org.jsoup.nodes.Element element8 = element1.appendText("<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        int int7 = element4.childNodeSize();
        java.lang.String str8 = element4.wholeText();
        org.jsoup.nodes.Element element10 = element4.text("<hi!></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Node node3 = element1.previousSibling();
        java.lang.String str4 = element1.outerHtml();
        org.jsoup.select.Elements elements6 = element1.getElementsMatchingOwnText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = element1.is("");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '': unexpected token at ''");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<hi!></hi!>" + "'", str4, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        java.lang.String str4 = element1.attr("");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Node node3 = element1.previousSibling();
        java.lang.String str4 = element1.outerHtml();
        org.jsoup.select.Elements elements5 = element1.siblingElements();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<hi!></hi!>" + "'", str4, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        org.jsoup.nodes.Element element9 = element6.removeAttr("");
        java.lang.String str10 = element9.text();
        org.jsoup.nodes.Element element12 = element9.addClass("");
        java.lang.String str13 = element9.text();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        int int20 = element18.elementSiblingIndex();
        org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList24 = element23.textNodes();
        org.jsoup.nodes.Element element26 = element23.removeAttr("");
        java.lang.String str27 = element26.text();
        org.jsoup.select.Elements elements28 = element26.nextElementSiblings();
        org.jsoup.nodes.Element element30 = element26.toggleClass("hi!");
        org.jsoup.nodes.Element element31 = element30.clearAttributes();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList34 = element33.textNodes();
        org.jsoup.nodes.Element element35 = element33.nextElementSibling();
        java.lang.String str36 = element33.normalName();
        org.jsoup.nodes.Element element37 = element33.shallowClone();
        java.util.regex.Pattern pattern39 = null;
        org.jsoup.select.Elements elements40 = element33.getElementsByAttributeValueMatching("hi!", pattern39);
        boolean boolean41 = element31.equals((java.lang.Object) pattern39);
        org.jsoup.nodes.Element element42 = element18.after((org.jsoup.nodes.Node) element31);
        org.jsoup.select.Elements elements44 = element42.getElementsByAttributeStarting("hi!");
        org.jsoup.select.Elements elements45 = element42.children();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(textNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(textNodeList24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(textNodeList34);
        org.junit.Assert.assertNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(elements45);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        org.jsoup.nodes.Element element9 = element6.removeAttr("");
        java.lang.String str10 = element9.text();
        org.jsoup.nodes.Element element12 = element9.addClass("");
        java.lang.String str13 = element9.text();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        java.lang.String str19 = element9.val();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList20 = element9.textNodes();
        boolean boolean21 = element1.equals((java.lang.Object) textNodeList20);
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(textNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(textNodeList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        int int7 = element4.childNodeSize();
        java.util.Set<java.lang.String> strSet8 = element4.classNames();
        org.jsoup.nodes.Document document9 = element4.ownerDocument();
        org.jsoup.select.Elements elements10 = element4.previousElementSiblings();
        java.util.regex.Pattern pattern11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element4.getElementsMatchingOwnText(pattern11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        java.lang.String str14 = element4.val();
        org.jsoup.nodes.Element element15 = element4.empty();
        org.jsoup.nodes.Element element17 = element15.html("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = element17.is("<hi!>\n hi!\n</hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi!>? hi!?</hi!>': unexpected token at '<hi!>? hi!?</hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.jsoup.parser.Tag tag0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element2 = new org.jsoup.nodes.Element(tag0, "<hi!>\n hi!\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.shallowClone();
        int int4 = element1.siblingIndex();
        boolean boolean5 = element1.hasParent();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element9 = element8.clearAttributes();
        org.jsoup.select.Elements elements10 = element9.getAllElements();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element9.textNodes();
        org.jsoup.select.Elements elements13 = element9.getElementsByIndexGreaterThan((int) (short) 10);
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        org.jsoup.select.Elements elements7 = element5.getElementsByIndexGreaterThan((int) (byte) 10);
        org.jsoup.nodes.Element element8 = element5.previousElementSibling();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        java.lang.String str14 = element4.val();
        org.jsoup.nodes.Element element15 = element4.empty();
        org.jsoup.nodes.Element element17 = element15.html("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = element15.dataset();
        org.jsoup.select.Elements elements20 = element15.getElementsContainingOwnText("<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.jsoup.nodes.Element element7 = element1.classNames((java.util.Set<java.lang.String>) strSet5);
        org.jsoup.nodes.Element element10 = element1.attr("<hi!></hi!>", "hi!");
        java.lang.String str12 = element1.attr("");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("hi!");
        java.lang.String str4 = element3.wholeText();
        java.lang.String str5 = element3.toString();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList8 = element7.textNodes();
        org.jsoup.nodes.Element element10 = element7.removeAttr("");
        java.lang.String str11 = element10.text();
        org.jsoup.nodes.Element element13 = element10.addClass("");
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList16 = element15.textNodes();
        org.jsoup.nodes.Element element18 = element15.removeAttr("");
        java.lang.String str19 = element18.text();
        org.jsoup.nodes.Element element21 = element18.addClass("");
        java.lang.String str22 = element18.text();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList26 = element25.textNodes();
        org.jsoup.nodes.Element element27 = element18.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList26);
        org.jsoup.nodes.Element element28 = element10.appendChild((org.jsoup.nodes.Node) element27);
        org.jsoup.nodes.Element element30 = element10.prependElement("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element31 = element3.after((org.jsoup.nodes.Node) element30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!>\n hi!\n</hi!>" + "'", str5, "<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(textNodeList8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(textNodeList16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(textNodeList26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!></hi!>");
        java.lang.String str2 = element1.val();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        org.jsoup.select.Elements elements8 = element7.children();
        org.jsoup.nodes.Element element9 = element7.root();
        java.lang.String str10 = element9.text();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements4 = element1.getElementsByIndexEquals(100);
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.shallowClone();
        int int4 = element1.siblingIndex();
        java.lang.String str5 = element1.baseUri();
        org.jsoup.nodes.Element element6 = element1.clearAttributes();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element6.dataNodes();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        java.lang.String str7 = element4.ownText();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element10.textNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element4.insertChildren((int) (byte) 100, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(textNodeList11);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList10 = element9.textNodes();
        org.jsoup.nodes.Element element12 = element9.removeAttr("");
        java.lang.String str13 = element12.text();
        org.jsoup.nodes.Element element15 = element12.addClass("");
        java.lang.String str16 = element12.text();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList20 = element19.textNodes();
        org.jsoup.nodes.Element element21 = element12.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList20);
        org.jsoup.nodes.Element element22 = element4.appendChild((org.jsoup.nodes.Node) element21);
        org.jsoup.select.Elements elements23 = element22.getAllElements();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(textNodeList10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(textNodeList20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList10 = element9.textNodes();
        org.jsoup.nodes.Element element12 = element9.removeAttr("");
        java.lang.String str13 = element12.text();
        org.jsoup.nodes.Element element15 = element12.addClass("");
        java.lang.String str16 = element12.text();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList20 = element19.textNodes();
        org.jsoup.nodes.Element element21 = element12.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList20);
        org.jsoup.nodes.Element element22 = element4.appendChild((org.jsoup.nodes.Node) element21);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element24 = element21.selectFirst("<hi! class=\"\"></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"\"></hi!>': unexpected token at '<hi! class=\"\"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(textNodeList10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(textNodeList20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Document document5 = element1.ownerDocument();
        org.jsoup.nodes.Element element6 = element1.root();
        org.jsoup.nodes.Element element8 = element1.val("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsByAttribute("<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("hi!");
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        org.jsoup.nodes.Element element9 = element6.removeAttr("");
        java.lang.String str10 = element9.text();
        org.jsoup.select.Elements elements11 = element9.nextElementSiblings();
        org.jsoup.nodes.Element element13 = element9.toggleClass("hi!");
        org.jsoup.nodes.Element element14 = element13.clearAttributes();
        org.jsoup.select.Elements elements15 = element14.getAllElements();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList16 = element14.textNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = element1.insertChildren(100, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(textNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(textNodeList16);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        org.jsoup.nodes.Element element9 = element4.addClass("");
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValue("<hi!>\n hi!\n</hi!>", "<hi!></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        org.jsoup.select.Elements elements7 = element5.getElementsByIndexGreaterThan((int) (byte) 10);
        org.jsoup.nodes.Element element9 = element5.append("");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        int int7 = element4.childNodeSize();
        java.util.Set<java.lang.String> strSet8 = element4.classNames();
        org.jsoup.nodes.Document document9 = element4.ownerDocument();
        org.jsoup.select.Elements elements10 = element4.previousElementSiblings();
        org.jsoup.select.Evaluator evaluator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = element4.is(evaluator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.jsoup.parser.Tag tag0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element2 = new org.jsoup.nodes.Element(tag0, "<hi! class=\"\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        boolean boolean9 = element4.hasAttr("hi!");
        org.jsoup.nodes.Element element10 = element4.root();
        org.jsoup.select.Elements elements11 = element4.getAllElements();
        org.jsoup.nodes.Element element13 = element4.toggleClass("hi!");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        org.jsoup.nodes.Element element9 = element6.removeAttr("");
        java.lang.String str10 = element9.text();
        org.jsoup.nodes.Element element12 = element9.addClass("");
        java.lang.String str13 = element9.text();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        int int20 = element18.elementSiblingIndex();
        org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList24 = element23.textNodes();
        org.jsoup.nodes.Element element26 = element23.removeAttr("");
        java.lang.String str27 = element26.text();
        org.jsoup.select.Elements elements28 = element26.nextElementSiblings();
        org.jsoup.nodes.Element element30 = element26.toggleClass("hi!");
        org.jsoup.nodes.Element element31 = element30.clearAttributes();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList34 = element33.textNodes();
        org.jsoup.nodes.Element element35 = element33.nextElementSibling();
        java.lang.String str36 = element33.normalName();
        org.jsoup.nodes.Element element37 = element33.shallowClone();
        java.util.regex.Pattern pattern39 = null;
        org.jsoup.select.Elements elements40 = element33.getElementsByAttributeValueMatching("hi!", pattern39);
        boolean boolean41 = element31.equals((java.lang.Object) pattern39);
        org.jsoup.nodes.Element element42 = element18.after((org.jsoup.nodes.Node) element31);
        org.jsoup.select.Elements elements44 = element42.getElementsByAttributeStarting("hi!");
        org.jsoup.nodes.Node node45 = element42.nextSibling();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(textNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(textNodeList24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(textNodeList34);
        org.junit.Assert.assertNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(node45);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        org.jsoup.select.Elements elements7 = element5.getElementsByIndexGreaterThan((int) (byte) 10);
        org.jsoup.nodes.Document document8 = element5.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = document8.getElementsByAttribute("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.select.Elements elements6 = element1.getElementsByIndexLessThan((int) (byte) 1);
        org.jsoup.nodes.Element element7 = element1.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element7.getElementsByAttributeValueNot("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        boolean boolean9 = element4.hasAttr("hi!");
        org.jsoup.select.Elements elements11 = element4.getElementsContainingText("");
        org.jsoup.nodes.Element element13 = element4.prependText("hi!");
        element13.setBaseUri("<hi! class=\"\"></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList16 = element13.textNodes();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(textNodeList16);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("hi!");
        java.lang.String str4 = element3.wholeText();
        java.lang.String str5 = element3.toString();
        org.jsoup.select.Elements elements6 = element3.children();
        boolean boolean8 = element3.hasAttr("");
        org.jsoup.nodes.Element element9 = element3.clone();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!>\n hi!\n</hi!>" + "'", str5, "<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        org.jsoup.nodes.Element element7 = element1.addClass("<hi!></hi!>");
        org.jsoup.nodes.Element element8 = element1.shallowClone();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element10.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.nodes.Element element17 = element8.classNames((java.util.Set<java.lang.String>) strSet14);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements19 = element17.select("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("hi!");
        java.lang.String str4 = element3.wholeText();
        java.lang.String str5 = element3.toString();
        org.jsoup.select.Elements elements6 = element3.children();
        boolean boolean8 = element3.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element3.before("<hi! class=\"\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!>\n hi!\n</hi!>" + "'", str5, "<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element9 = element8.clearAttributes();
        boolean boolean11 = element9.hasSameValue((java.lang.Object) "");
        boolean boolean12 = element9.hasParent();
        org.jsoup.select.Elements elements14 = element9.getElementsByIndexGreaterThan((int) (short) 10);
        boolean boolean15 = element9.isBlock();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        int int14 = element13.childNodeSize();
        org.jsoup.select.Elements elements17 = element13.getElementsByAttributeValueContaining("hi!", "hi!");
        java.lang.String str18 = element13.tagName();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element9 = element8.clearAttributes();
        boolean boolean11 = element9.hasSameValue((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element9.getElementsByClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        boolean boolean9 = element4.hasAttr("hi!");
        org.jsoup.nodes.Element element10 = element4.root();
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexEquals((int) (byte) 10);
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList16 = element15.textNodes();
        org.jsoup.nodes.Element element18 = element15.removeAttr("");
        java.lang.String str19 = element18.text();
        org.jsoup.select.Elements elements20 = element18.nextElementSiblings();
        org.jsoup.nodes.Element element22 = element18.toggleClass("hi!");
        org.jsoup.nodes.Element element23 = element22.clearAttributes();
        org.jsoup.select.Elements elements24 = element23.getAllElements();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList25 = element23.textNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element26 = element10.insertChildren((int) (byte) 10, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(textNodeList16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(textNodeList25);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList10 = element9.textNodes();
        org.jsoup.nodes.Element element12 = element9.removeAttr("");
        java.lang.String str13 = element12.text();
        org.jsoup.nodes.Element element15 = element12.addClass("");
        java.lang.String str16 = element12.text();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList20 = element19.textNodes();
        org.jsoup.nodes.Element element21 = element12.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList20);
        org.jsoup.nodes.Element element22 = element4.appendChild((org.jsoup.nodes.Node) element21);
        java.lang.String[] strArray29 = new java.lang.String[] { "<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>", "<hi!></hi!>", "<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>", "", "hi!", "<hi! class=\"\"></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        org.jsoup.nodes.Element element32 = element22.classNames((java.util.Set<java.lang.String>) strSet30);
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(textNodeList10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(textNodeList20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(element32);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.jsoup.parser.Tag tag0 = null;
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList4 = element3.textNodes();
        org.jsoup.nodes.Element element6 = element3.removeAttr("");
        java.lang.String str7 = element6.text();
        org.jsoup.nodes.Element element9 = element6.addClass("");
        org.jsoup.select.Elements elements10 = element9.children();
        org.jsoup.nodes.Element element11 = element9.root();
        org.jsoup.nodes.Attributes attributes12 = element11.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag0, "<hi!></hi!>", attributes12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        element4.setBaseUri("hi!");
        org.jsoup.nodes.Element element9 = element4.previousElementSibling();
        boolean boolean10 = element4.isBlock();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        org.jsoup.nodes.Element element9 = element6.removeAttr("");
        java.lang.String str10 = element9.text();
        org.jsoup.nodes.Element element12 = element9.addClass("");
        java.lang.String str13 = element9.text();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        int int20 = element18.elementSiblingIndex();
        org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList24 = element23.textNodes();
        org.jsoup.nodes.Element element26 = element23.removeAttr("");
        java.lang.String str27 = element26.text();
        org.jsoup.select.Elements elements28 = element26.nextElementSiblings();
        org.jsoup.nodes.Element element30 = element26.toggleClass("hi!");
        org.jsoup.nodes.Element element31 = element30.clearAttributes();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList34 = element33.textNodes();
        org.jsoup.nodes.Element element35 = element33.nextElementSibling();
        java.lang.String str36 = element33.normalName();
        org.jsoup.nodes.Element element37 = element33.shallowClone();
        java.util.regex.Pattern pattern39 = null;
        org.jsoup.select.Elements elements40 = element33.getElementsByAttributeValueMatching("hi!", pattern39);
        boolean boolean41 = element31.equals((java.lang.Object) pattern39);
        org.jsoup.nodes.Element element42 = element18.after((org.jsoup.nodes.Node) element31);
        java.lang.String str43 = element18.className();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = element18.is("<hi! class=\"\"></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"\"></hi!>': unexpected token at '<hi! class=\"\"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(textNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(textNodeList24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(textNodeList34);
        org.junit.Assert.assertNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        java.util.regex.Pattern pattern7 = null;
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", pattern7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element1.getElementsByAttributeValueContaining("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        java.lang.String str6 = element1.cssSelector();
        java.lang.String str7 = element1.tagName();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        boolean boolean9 = element4.hasAttr("hi!");
        org.jsoup.nodes.Element element10 = element4.root();
        java.lang.String str11 = element10.data();
        org.jsoup.nodes.Element element14 = element10.attr("<hi!>\n hi!\n</hi!>", true);
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        boolean boolean9 = element4.hasAttr("hi!");
        org.jsoup.select.Elements elements11 = element4.getElementsContainingText("");
        org.jsoup.nodes.Element element13 = element4.prependText("hi!");
        java.lang.String str14 = element13.data();
        org.jsoup.nodes.Element element16 = element13.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element17 = element16.clone();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.jsoup.parser.Tag tag0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element2 = new org.jsoup.nodes.Element(tag0, "<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        org.jsoup.nodes.Element element9 = element6.removeAttr("");
        java.lang.String str10 = element9.text();
        org.jsoup.nodes.Element element12 = element9.addClass("");
        java.lang.String str13 = element9.text();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        int int20 = element18.elementSiblingIndex();
        org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList24 = element23.textNodes();
        org.jsoup.nodes.Element element26 = element23.removeAttr("");
        java.lang.String str27 = element26.text();
        org.jsoup.select.Elements elements28 = element26.nextElementSiblings();
        org.jsoup.nodes.Element element30 = element26.toggleClass("hi!");
        org.jsoup.nodes.Element element31 = element30.clearAttributes();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList34 = element33.textNodes();
        org.jsoup.nodes.Element element35 = element33.nextElementSibling();
        java.lang.String str36 = element33.normalName();
        org.jsoup.nodes.Element element37 = element33.shallowClone();
        java.util.regex.Pattern pattern39 = null;
        org.jsoup.select.Elements elements40 = element33.getElementsByAttributeValueMatching("hi!", pattern39);
        boolean boolean41 = element31.equals((java.lang.Object) pattern39);
        org.jsoup.nodes.Element element42 = element18.after((org.jsoup.nodes.Node) element31);
        java.lang.String str43 = element42.normalName();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(textNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(textNodeList24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(textNodeList34);
        org.junit.Assert.assertNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        org.jsoup.select.Elements elements7 = element5.getElementsByIndexGreaterThan((int) (byte) 10);
        java.lang.String str8 = element5.nodeName();
        org.jsoup.select.Elements elements9 = element5.siblingElements();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Node node6 = element4.previousSibling();
        java.lang.String str7 = element4.baseUri();
        java.util.Set<java.lang.String> strSet8 = element4.classNames();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        int int7 = element4.childNodeSize();
        java.util.Set<java.lang.String> strSet8 = element4.classNames();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = element4.is("<hi!>\n hi!\n</hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi!>? hi!?</hi!>': unexpected token at '<hi!>? hi!?</hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        java.lang.String str6 = element1.cssSelector();
        org.jsoup.nodes.Element element8 = element1.html("hi!");
        java.lang.String str10 = element1.absUrl("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        org.jsoup.nodes.Element element14 = element13.previousElementSibling();
        element13.setBaseUri("hi!");
        org.jsoup.select.Elements elements18 = element13.getElementsByIndexGreaterThan(10);
        org.jsoup.select.Elements elements19 = element13.previousElementSiblings();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = element1.childNodes();
        org.jsoup.nodes.Element element7 = element1.append("");
        org.jsoup.select.Elements elements9 = element1.getElementsByAttribute("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        java.util.regex.Pattern pattern7 = null;
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", pattern7);
        org.jsoup.nodes.Element element9 = element1.shallowClone();
        org.jsoup.nodes.Node node10 = element9.parentNode();
        org.jsoup.select.Elements elements12 = element9.getElementsContainingText("hi!");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.shallowClone();
        int int4 = element1.siblingIndex();
        org.jsoup.select.Elements elements5 = element1.nextElementSiblings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes();
        boolean boolean7 = element1.hasText();
        java.lang.String str8 = element1.outerHtml();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<hi!></hi!>" + "'", str8, "<hi!></hi!>");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Node node3 = element1.previousSibling();
        java.lang.String str4 = element1.id();
        org.jsoup.nodes.Element element6 = element1.removeClass("hi!");
        org.jsoup.select.Elements elements9 = element1.getElementsByAttributeValueNot("hi!", "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("hi!");
        org.jsoup.nodes.Node node4 = element1.parentNode();
        java.lang.Class<?> wildcardClass5 = element1.getClass();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        int int7 = element4.childNodeSize();
        java.util.Set<java.lang.String> strSet8 = element4.classNames();
        org.jsoup.nodes.Document document9 = element4.ownerDocument();
        org.jsoup.select.Elements elements10 = element4.previousElementSiblings();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList13 = element12.textNodes();
        org.jsoup.nodes.Element element15 = element12.removeAttr("");
        java.lang.String str16 = element15.text();
        org.jsoup.select.Elements elements17 = element15.nextElementSiblings();
        boolean boolean18 = element4.hasSameValue((java.lang.Object) elements17);
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(textNodeList13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        org.jsoup.nodes.Element element15 = element4.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element4.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = element4.childNodesCopy();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!>\n hi!\n</hi!>");
        org.jsoup.select.Elements elements3 = element1.getElementsByAttributeStarting("hi!");
        org.junit.Assert.assertNotNull(elements3);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.shallowClone();
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Node node5 = element1.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = element1.selectFirst("<hi! class=\"\"></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"\"></hi!>': unexpected token at '<hi! class=\"\"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element9 = element8.clearAttributes();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element11.nextElementSibling();
        java.lang.String str14 = element11.normalName();
        org.jsoup.nodes.Element element15 = element11.shallowClone();
        java.util.regex.Pattern pattern17 = null;
        org.jsoup.select.Elements elements18 = element11.getElementsByAttributeValueMatching("hi!", pattern17);
        boolean boolean19 = element9.equals((java.lang.Object) pattern17);
        org.jsoup.nodes.Element element20 = element9.clone();
        boolean boolean21 = element20.isBlock();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element20.childNodes();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeList22);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element10.textNodes();
        org.jsoup.nodes.Element element12 = element10.shallowClone();
        int int13 = element10.siblingIndex();
        org.jsoup.select.Elements elements14 = element10.nextElementSiblings();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element10.childNodes();
        org.jsoup.nodes.Element element17 = element10.toggleClass("");
        boolean boolean18 = element4.equals((java.lang.Object) "");
        org.jsoup.select.Elements elements21 = element4.getElementsByAttributeValue("<hi!></hi!>", "<hi! class=\"\"></hi!>");
        int int22 = element4.childNodeSize();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        int int7 = element4.childNodeSize();
        java.lang.String str8 = element4.wholeText();
        org.jsoup.nodes.Element element10 = element4.removeAttr("hi!");
        org.jsoup.nodes.Element element12 = element10.removeAttr("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element13 = element10.empty();
        org.jsoup.nodes.Element element15 = element13.toggleClass("");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element9 = element8.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element9.after("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element10.textNodes();
        org.jsoup.nodes.Element element12 = element10.shallowClone();
        int int13 = element10.siblingIndex();
        org.jsoup.select.Elements elements14 = element10.nextElementSiblings();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element10.childNodes();
        org.jsoup.nodes.Element element17 = element10.toggleClass("");
        org.jsoup.nodes.Element element18 = element1.prependChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList21 = element20.textNodes();
        org.jsoup.nodes.Element element23 = element20.removeAttr("");
        java.lang.String str24 = element23.text();
        org.jsoup.select.Elements elements25 = element23.nextElementSiblings();
        int int26 = element23.childNodeSize();
        java.util.Set<java.lang.String> strSet27 = element23.classNames();
        org.jsoup.nodes.Element element28 = element1.classNames(strSet27);
        java.util.regex.Pattern pattern29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements30 = element28.getElementsMatchingOwnText(pattern29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(textNodeList21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(element28);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        java.util.regex.Pattern pattern7 = null;
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", pattern7);
        org.jsoup.nodes.Element element11 = element1.attr("", false);
        java.lang.String str12 = element11.tagName();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element10.textNodes();
        org.jsoup.nodes.Element element12 = element10.shallowClone();
        int int13 = element10.siblingIndex();
        org.jsoup.select.Elements elements14 = element10.nextElementSiblings();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element10.childNodes();
        org.jsoup.nodes.Element element17 = element10.toggleClass("");
        org.jsoup.nodes.Element element18 = element1.prependChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList21 = element20.textNodes();
        org.jsoup.nodes.Element element23 = element20.removeAttr("");
        java.lang.String str24 = element23.text();
        org.jsoup.select.Elements elements25 = element23.nextElementSiblings();
        int int26 = element23.childNodeSize();
        java.util.Set<java.lang.String> strSet27 = element23.classNames();
        org.jsoup.nodes.Element element28 = element1.classNames(strSet27);
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element("hi!");
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.jsoup.nodes.Element element36 = element30.classNames((java.util.Set<java.lang.String>) strSet34);
        org.jsoup.nodes.Element element37 = element1.classNames((java.util.Set<java.lang.String>) strSet34);
        java.lang.String str38 = element37.cssSelector();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(textNodeList21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!.hi!" + "'", str38, "hi!.hi!");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        int int7 = element4.childNodeSize();
        java.lang.String str8 = element4.wholeText();
        org.jsoup.nodes.Element element10 = element4.removeAttr("hi!");
        java.lang.String str11 = element4.tagName();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        int int14 = element13.childNodeSize();
        org.jsoup.nodes.Element element16 = element13.val("<hi! class=\"\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = element16.is("");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '': unexpected token at ''");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        org.jsoup.select.Elements elements14 = element13.siblingElements();
        java.lang.String str15 = element13.data();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        org.jsoup.select.Elements elements6 = element5.parents();
        java.lang.String str7 = element5.toString();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<hi!></hi!>" + "'", str7, "<hi!></hi!>");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.jsoup.nodes.Element element7 = element1.classNames((java.util.Set<java.lang.String>) strSet5);
        org.jsoup.nodes.Element element10 = element1.attr("<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList13 = element12.textNodes();
        org.jsoup.nodes.Element element14 = element12.nextElementSibling();
        java.lang.String str15 = element12.normalName();
        org.jsoup.nodes.Element element16 = element12.shallowClone();
        java.util.regex.Pattern pattern18 = null;
        org.jsoup.select.Elements elements19 = element12.getElementsByAttributeValueMatching("hi!", pattern18);
        org.jsoup.nodes.Element element20 = element12.shallowClone();
        boolean boolean21 = element1.equals((java.lang.Object) element12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element22 = element1.firstElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(textNodeList13);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        java.lang.String str14 = element4.val();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        org.jsoup.nodes.Element element18 = element16.nextElementSibling();
        java.lang.String str19 = element16.normalName();
        org.jsoup.nodes.Element element20 = element16.shallowClone();
        org.jsoup.nodes.Element element22 = element16.addClass("<hi!></hi!>");
        boolean boolean24 = element16.hasAttr("hi!");
        org.jsoup.nodes.Element element25 = element4.appendTo(element16);
        java.util.List<org.jsoup.nodes.Node> nodeList26 = element25.childNodes();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(nodeList26);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = element1.childNodes();
        org.jsoup.nodes.Element element7 = element1.append("");
        java.util.regex.Pattern pattern8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element7.getElementsMatchingOwnText(pattern8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        java.lang.String str14 = element4.val();
        org.jsoup.select.Elements elements16 = element4.getElementsByIndexLessThan(0);
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        java.lang.String str7 = element4.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element4.before("<hi!>\n hi!\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        boolean boolean9 = element4.hasAttr("hi!");
        org.jsoup.select.Elements elements11 = element4.getElementsContainingText("");
        org.jsoup.nodes.Element element13 = element4.prependText("hi!");
        org.jsoup.select.Elements elements14 = element13.getAllElements();
        java.lang.String str15 = element13.ownText();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        int int7 = element4.childNodeSize();
        java.util.Set<java.lang.String> strSet8 = element4.classNames();
        org.jsoup.nodes.Document document9 = element4.ownerDocument();
        org.jsoup.select.Elements elements10 = element4.previousElementSiblings();
        org.jsoup.select.Elements elements12 = element4.getElementsByTag("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        java.lang.String str14 = element4.val();
        org.jsoup.select.Elements elements16 = element4.getElementsByClass("hi!");
        java.lang.String str17 = element4.normalName();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        org.jsoup.select.Elements elements8 = element7.children();
        org.jsoup.nodes.Element element9 = element7.root();
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValue("hi!", "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        java.lang.String str6 = element5.id();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList9 = element8.textNodes();
        org.jsoup.nodes.Element element11 = element8.removeAttr("");
        java.lang.String str12 = element11.text();
        org.jsoup.nodes.Element element14 = element11.addClass("");
        java.lang.String str15 = element11.text();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList19 = element18.textNodes();
        org.jsoup.nodes.Element element20 = element11.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList19);
        java.lang.String str21 = element11.val();
        org.jsoup.select.Elements elements22 = element11.nextElementSiblings();
        org.jsoup.nodes.Element element23 = element5.appendTo(element11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = element11.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNodeList9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(textNodeList19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Document document5 = element1.ownerDocument();
        org.jsoup.nodes.Element element6 = element1.root();
        org.jsoup.select.Elements elements8 = element6.getElementsContainingText("<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        org.jsoup.nodes.Element element9 = element4.appendElement("<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList10 = element9.textNodes();
        org.jsoup.nodes.Element element12 = element9.removeAttr("");
        java.lang.String str13 = element12.text();
        org.jsoup.nodes.Element element15 = element12.addClass("");
        java.lang.String str16 = element12.text();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList20 = element19.textNodes();
        org.jsoup.nodes.Element element21 = element12.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList20);
        org.jsoup.nodes.Element element22 = element4.appendChild((org.jsoup.nodes.Node) element21);
        org.jsoup.nodes.Element element24 = element4.append("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element25 = element4.empty();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(textNodeList10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(textNodeList20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        org.jsoup.select.NodeVisitor nodeVisitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = element1.traverse(nodeVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        int int7 = element4.childNodeSize();
        java.lang.String str8 = element4.wholeText();
        org.jsoup.nodes.Element element10 = element4.removeAttr("hi!");
        org.jsoup.nodes.Element element12 = element10.removeAttr("<hi!>\n hi!\n</hi!>");
        element12.setBaseUri("hi!");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        org.jsoup.nodes.Element element9 = element6.removeAttr("");
        java.lang.String str10 = element9.text();
        org.jsoup.nodes.Element element12 = element9.addClass("");
        java.lang.String str13 = element9.text();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        int int20 = element18.elementSiblingIndex();
        org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element21.childNodes();
        org.jsoup.nodes.Element element23 = element21.empty();
        org.jsoup.nodes.Element element24 = element23.nextElementSibling();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(textNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNull(element24);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        element4.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("<hi!></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.shallowClone();
        int int4 = element1.siblingIndex();
        org.jsoup.select.Elements elements5 = element1.nextElementSiblings();
        org.jsoup.nodes.Element element7 = element1.prependText("");
        element1.setBaseUri("<hi! class=\"\"></hi!>");
        org.jsoup.select.Elements elements11 = element1.getElementsByAttributeStarting("hi!");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Document document5 = element1.ownerDocument();
        org.jsoup.nodes.Element element6 = element1.root();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(textNodeList7);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        org.jsoup.nodes.Element element9 = element6.removeAttr("");
        java.lang.String str10 = element9.text();
        org.jsoup.nodes.Element element12 = element9.addClass("");
        java.lang.String str13 = element9.text();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        int int20 = element18.elementSiblingIndex();
        org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList24 = element23.textNodes();
        org.jsoup.nodes.Element element26 = element23.removeAttr("");
        java.lang.String str27 = element26.text();
        org.jsoup.select.Elements elements28 = element26.nextElementSiblings();
        org.jsoup.nodes.Element element30 = element26.toggleClass("hi!");
        org.jsoup.nodes.Element element31 = element30.clearAttributes();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList34 = element33.textNodes();
        org.jsoup.nodes.Element element35 = element33.nextElementSibling();
        java.lang.String str36 = element33.normalName();
        org.jsoup.nodes.Element element37 = element33.shallowClone();
        java.util.regex.Pattern pattern39 = null;
        org.jsoup.select.Elements elements40 = element33.getElementsByAttributeValueMatching("hi!", pattern39);
        boolean boolean41 = element31.equals((java.lang.Object) pattern39);
        org.jsoup.nodes.Element element42 = element18.after((org.jsoup.nodes.Node) element31);
        java.lang.String str43 = element18.className();
        org.jsoup.select.Elements elements46 = element18.getElementsByAttributeValueEnding("<hi!>\n hi!\n</hi!>", "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(textNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(textNodeList24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(textNodeList34);
        org.junit.Assert.assertNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(elements46);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        java.lang.String str14 = element4.val();
        org.jsoup.nodes.Element element15 = element4.empty();
        org.jsoup.nodes.Element element17 = element15.html("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = element15.dataset();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList21 = element20.textNodes();
        org.jsoup.nodes.Element element22 = element20.shallowClone();
        int int23 = element20.siblingIndex();
        org.jsoup.select.Elements elements24 = element20.nextElementSiblings();
        org.jsoup.nodes.Element element26 = element20.prependText("");
        org.jsoup.nodes.Element element27 = element15.appendTo(element20);
        org.jsoup.nodes.Document document28 = element20.ownerDocument();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(textNodeList21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNull(document28);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Node node3 = element1.previousSibling();
        java.lang.String str4 = element1.id();
        org.jsoup.nodes.Element element6 = element1.removeClass("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        java.util.regex.Pattern pattern8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element7.getElementsMatchingOwnText(pattern8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.select.Elements elements6 = element1.getElementsByIndexLessThan((int) (byte) 1);
        int int7 = element1.siblingIndex();
        java.lang.String str9 = element1.attr("");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        int int7 = element4.childNodeSize();
        java.util.Set<java.lang.String> strSet8 = element4.classNames();
        org.jsoup.nodes.Document document9 = element4.ownerDocument();
        org.jsoup.select.Elements elements10 = element4.previousElementSiblings();
        org.jsoup.parser.Tag tag11 = element4.tag();
        org.jsoup.nodes.Element element13 = element4.getElementById("<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNull(element13);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Document document5 = element1.ownerDocument();
        org.jsoup.nodes.Element element6 = element1.root();
        org.jsoup.nodes.Element element7 = element1.previousElementSibling();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        boolean boolean9 = element4.hasAttr("hi!");
        org.jsoup.nodes.Element element10 = element4.root();
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexEquals((int) (byte) 10);
        org.jsoup.select.Elements elements14 = element10.getElementsByIndexGreaterThan((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element10.selectFirst("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>': unexpected token at '<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        int int7 = element4.childNodeSize();
        java.lang.String str8 = element4.wholeText();
        org.jsoup.select.Elements elements10 = element4.getElementsByClass("<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        org.jsoup.nodes.Element element9 = element6.removeAttr("");
        java.lang.String str10 = element9.text();
        org.jsoup.nodes.Element element12 = element9.addClass("");
        java.lang.String str13 = element9.text();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        int int20 = element18.elementSiblingIndex();
        org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList24 = element23.textNodes();
        org.jsoup.nodes.Element element26 = element23.removeAttr("");
        java.lang.String str27 = element26.text();
        org.jsoup.select.Elements elements28 = element26.nextElementSiblings();
        org.jsoup.nodes.Element element30 = element26.toggleClass("hi!");
        org.jsoup.nodes.Element element31 = element30.clearAttributes();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList34 = element33.textNodes();
        org.jsoup.nodes.Element element35 = element33.nextElementSibling();
        java.lang.String str36 = element33.normalName();
        org.jsoup.nodes.Element element37 = element33.shallowClone();
        java.util.regex.Pattern pattern39 = null;
        org.jsoup.select.Elements elements40 = element33.getElementsByAttributeValueMatching("hi!", pattern39);
        boolean boolean41 = element31.equals((java.lang.Object) pattern39);
        org.jsoup.nodes.Element element42 = element18.after((org.jsoup.nodes.Node) element31);
        org.jsoup.select.Elements elements44 = element42.getElementsByAttributeStarting("hi!");
        boolean boolean45 = element42.isBlock();
        boolean boolean47 = element42.hasAttr("<hi!></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(textNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(textNodeList24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(textNodeList34);
        org.junit.Assert.assertNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.jsoup.nodes.Element element7 = element1.classNames((java.util.Set<java.lang.String>) strSet5);
        org.jsoup.nodes.Element element10 = element1.attr("<hi!></hi!>", "hi!");
        java.lang.String str11 = element10.toString();
        org.jsoup.select.Elements elements13 = element10.getElementsByTag("<hi!></hi!>");
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList16 = element15.textNodes();
        org.jsoup.nodes.Element element18 = element15.removeAttr("");
        java.lang.String str19 = element18.text();
        org.jsoup.select.Elements elements20 = element18.nextElementSiblings();
        org.jsoup.nodes.Element element22 = element18.toggleClass("hi!");
        org.jsoup.nodes.Element element23 = element10.appendTo(element18);
        org.jsoup.select.Elements elements25 = element18.getElementsByAttribute("<hi!></hi!>");
        org.jsoup.select.NodeFilter nodeFilter26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element27 = element18.filter(nodeFilter26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>" + "'", str11, "<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(textNodeList16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element3 = element1.removeAttr("<hi!></hi!>");
        org.jsoup.select.Elements elements4 = element1.nextElementSiblings();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        java.lang.String str14 = element4.val();
        org.jsoup.select.Elements elements16 = element4.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.select.Elements elements19 = element4.getElementsByAttributeValueStarting("<hi! class=\"\"></hi!>", "<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        java.lang.String str14 = element4.val();
        org.jsoup.nodes.Element element15 = element4.empty();
        java.lang.String str16 = element15.ownText();
        java.lang.String str17 = element15.normalName();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        java.lang.String str6 = element5.id();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList9 = element8.textNodes();
        org.jsoup.nodes.Element element11 = element8.removeAttr("");
        java.lang.String str12 = element11.text();
        org.jsoup.nodes.Element element14 = element11.addClass("");
        java.lang.String str15 = element11.text();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList19 = element18.textNodes();
        org.jsoup.nodes.Element element20 = element11.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList19);
        java.lang.String str21 = element11.val();
        org.jsoup.select.Elements elements22 = element11.nextElementSiblings();
        org.jsoup.nodes.Element element23 = element5.appendTo(element11);
        org.jsoup.nodes.Element element25 = element11.removeAttr("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element26 = element11.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements29 = element11.getElementsByAttributeValueStarting("<hi! class=\"\"></hi!>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNodeList9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(textNodeList19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        java.lang.String str6 = element5.id();
        int int7 = element5.childNodeSize();
        org.jsoup.select.Elements elements9 = element5.getElementsByAttributeStarting("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        int int7 = element4.childNodeSize();
        java.lang.String str8 = element4.wholeText();
        org.jsoup.nodes.Element element10 = element4.appendText("<hi!>\n hi!\n</hi!>");
        boolean boolean12 = element10.hasAttr("hi!");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.jsoup.nodes.Element element7 = element1.classNames((java.util.Set<java.lang.String>) strSet5);
        org.jsoup.nodes.Element element10 = element1.attr("<hi!></hi!>", "hi!");
        java.lang.String str11 = element10.toString();
        org.jsoup.select.Elements elements13 = element10.getElementsByTag("<hi!></hi!>");
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList16 = element15.textNodes();
        org.jsoup.nodes.Element element18 = element15.removeAttr("");
        java.lang.String str19 = element18.text();
        org.jsoup.select.Elements elements20 = element18.nextElementSiblings();
        org.jsoup.nodes.Element element22 = element18.toggleClass("hi!");
        org.jsoup.nodes.Element element23 = element10.appendTo(element18);
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList26 = element25.textNodes();
        org.jsoup.nodes.Node node27 = element25.previousSibling();
        java.lang.String str28 = element25.id();
        org.jsoup.nodes.Element element30 = element25.removeClass("hi!");
        org.jsoup.nodes.Element element31 = element30.empty();
        boolean boolean32 = element18.hasSameValue((java.lang.Object) element31);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>" + "'", str11, "<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(textNodeList16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(textNodeList26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        java.lang.String str14 = element4.val();
        org.jsoup.nodes.Element element15 = element4.empty();
        org.jsoup.nodes.Element element17 = element15.html("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = element15.dataset();
        org.jsoup.select.Elements elements20 = element15.getElementsByIndexGreaterThan((int) (short) 10);
        java.lang.String str21 = element15.baseUri();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        org.jsoup.nodes.Element element8 = element7.clearAttributes();
        org.jsoup.parser.Tag tag9 = element8.tag();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element(tag9, "hi!.hi!");
        org.jsoup.nodes.Node node12 = element11.previousSibling();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element6 = element4.appendText("hi!");
        org.jsoup.nodes.Element element7 = element1.appendChild((org.jsoup.nodes.Node) element6);
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        java.lang.String str6 = element5.id();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element5.siblingNodes();
        org.jsoup.nodes.Element element9 = element5.removeAttr("");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        java.lang.String str14 = element4.val();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        org.jsoup.nodes.Element element18 = element16.nextElementSibling();
        java.lang.String str19 = element16.normalName();
        org.jsoup.nodes.Element element20 = element16.shallowClone();
        org.jsoup.nodes.Element element22 = element16.addClass("<hi!></hi!>");
        boolean boolean24 = element16.hasAttr("hi!");
        org.jsoup.nodes.Element element25 = element4.appendTo(element16);
        java.lang.String str26 = element16.ownText();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!></hi!>");
        org.jsoup.nodes.Element element4 = element1.attr("", "hi!.hi!");
        org.jsoup.nodes.Element element6 = element1.toggleClass("");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        boolean boolean9 = element4.hasAttr("hi!");
        org.jsoup.nodes.Element element10 = element4.root();
        java.lang.String str11 = element10.data();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element10.select("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>': unexpected token at '<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        java.lang.String str6 = element5.id();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList9 = element8.textNodes();
        org.jsoup.nodes.Element element11 = element8.removeAttr("");
        java.lang.String str12 = element11.text();
        org.jsoup.nodes.Element element14 = element11.addClass("");
        java.lang.String str15 = element11.text();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList19 = element18.textNodes();
        org.jsoup.nodes.Element element20 = element11.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList19);
        java.lang.String str21 = element11.val();
        org.jsoup.select.Elements elements22 = element11.nextElementSiblings();
        org.jsoup.nodes.Element element23 = element5.appendTo(element11);
        org.jsoup.nodes.Element element25 = element11.removeAttr("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element26 = element11.root();
        java.lang.String str27 = element26.data();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNodeList9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(textNodeList19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.shallowClone();
        org.jsoup.select.Elements elements5 = element3.getElementsByClass("<hi!>\n hi!\n</hi!>");
        org.jsoup.select.Elements elements7 = element3.getElementsByTag("<hi!></hi!>");
        java.lang.String str8 = element3.normalName();
        java.util.Set<java.lang.String> strSet9 = element3.classNames();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        org.jsoup.nodes.Element element9 = element6.removeAttr("");
        java.lang.String str10 = element9.text();
        org.jsoup.nodes.Element element12 = element9.addClass("");
        java.lang.String str13 = element9.text();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        int int20 = element18.elementSiblingIndex();
        org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element21.childNodes();
        org.jsoup.nodes.Element element23 = element21.empty();
        org.jsoup.nodes.Node[] nodeArray25 = new org.jsoup.nodes.Node[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element26 = element23.insertChildren((int) (short) 100, nodeArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(textNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(nodeArray25);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        org.jsoup.nodes.Element element9 = element6.removeAttr("");
        java.lang.String str10 = element9.text();
        org.jsoup.nodes.Element element12 = element9.addClass("");
        java.lang.String str13 = element9.text();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        int int20 = element18.elementSiblingIndex();
        org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList24 = element23.textNodes();
        org.jsoup.nodes.Element element26 = element23.removeAttr("");
        java.lang.String str27 = element26.text();
        org.jsoup.select.Elements elements28 = element26.nextElementSiblings();
        org.jsoup.nodes.Element element30 = element26.toggleClass("hi!");
        org.jsoup.nodes.Element element31 = element30.clearAttributes();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList34 = element33.textNodes();
        org.jsoup.nodes.Element element35 = element33.nextElementSibling();
        java.lang.String str36 = element33.normalName();
        org.jsoup.nodes.Element element37 = element33.shallowClone();
        java.util.regex.Pattern pattern39 = null;
        org.jsoup.select.Elements elements40 = element33.getElementsByAttributeValueMatching("hi!", pattern39);
        boolean boolean41 = element31.equals((java.lang.Object) pattern39);
        org.jsoup.nodes.Element element42 = element18.after((org.jsoup.nodes.Node) element31);
        org.jsoup.select.Elements elements44 = element42.getElementsByAttributeStarting("hi!");
        boolean boolean45 = element42.isBlock();
        org.jsoup.select.Elements elements48 = element42.getElementsByAttributeValueStarting("<hi!>\n hi!\n</hi!>", "hi!");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(textNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(textNodeList24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(textNodeList34);
        org.junit.Assert.assertNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(elements48);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        java.lang.String str6 = element5.id();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList9 = element8.textNodes();
        org.jsoup.nodes.Element element11 = element8.removeAttr("");
        java.lang.String str12 = element11.text();
        org.jsoup.nodes.Element element14 = element11.addClass("");
        java.lang.String str15 = element11.text();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList19 = element18.textNodes();
        org.jsoup.nodes.Element element20 = element11.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList19);
        java.lang.String str21 = element11.val();
        org.jsoup.select.Elements elements22 = element11.nextElementSiblings();
        org.jsoup.nodes.Element element23 = element5.appendTo(element11);
        org.jsoup.nodes.Element element25 = element11.removeAttr("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element26 = element11.root();
        org.jsoup.select.Elements elements27 = element26.parents();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNodeList9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(textNodeList19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements27);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("hi!");
        java.lang.String str4 = element3.wholeText();
        org.jsoup.nodes.Element element6 = element3.addClass("<hi!></hi!>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element9 = element8.clearAttributes();
        boolean boolean11 = element9.hasSameValue((java.lang.Object) "");
        boolean boolean12 = element9.hasParent();
        org.jsoup.select.Elements elements14 = element9.getElementsByIndexGreaterThan((int) (short) 10);
        org.jsoup.nodes.Node node15 = element9.nextSibling();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        java.lang.String str6 = element5.id();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList9 = element8.textNodes();
        org.jsoup.nodes.Element element11 = element8.removeAttr("");
        java.lang.String str12 = element11.text();
        org.jsoup.nodes.Element element14 = element11.addClass("");
        java.lang.String str15 = element11.text();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList19 = element18.textNodes();
        org.jsoup.nodes.Element element20 = element11.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList19);
        java.lang.String str21 = element11.val();
        org.jsoup.select.Elements elements22 = element11.nextElementSiblings();
        org.jsoup.nodes.Element element23 = element5.appendTo(element11);
        org.jsoup.nodes.Element element25 = element11.removeAttr("<hi!>\n hi!\n</hi!>");
        java.lang.Class<?> wildcardClass26 = element25.getClass();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNodeList9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(textNodeList19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        int int14 = element13.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element13.child((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        org.jsoup.nodes.Element element7 = element1.addClass("<hi!></hi!>");
        java.lang.String str8 = element7.normalName();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        boolean boolean9 = element4.hasAttr("hi!");
        org.jsoup.select.Elements elements11 = element4.getElementsContainingText("");
        org.jsoup.nodes.Element element13 = element4.prependText("hi!");
        java.lang.String str14 = element13.data();
        org.jsoup.nodes.Element element16 = element13.appendText("<hi!></hi!>");
        org.jsoup.select.Elements elements18 = element16.getElementsByIndexGreaterThan((int) (byte) 100);
        org.jsoup.nodes.Element element19 = element16.nextElementSibling();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNull(element19);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        java.lang.String str9 = element4.html();
        org.jsoup.nodes.Element element10 = element4.previousElementSibling();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        org.jsoup.nodes.Element element8 = element7.clearAttributes();
        org.jsoup.nodes.Element element10 = element8.prependText("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        org.jsoup.select.Elements elements8 = element7.children();
        java.lang.String str9 = element7.data();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        boolean boolean9 = element4.hasAttr("hi!");
        org.jsoup.select.Elements elements11 = element4.getElementsContainingText("");
        org.jsoup.nodes.Element element13 = element4.prependText("hi!");
        java.lang.String str14 = element13.data();
        org.jsoup.nodes.Element element16 = element13.appendText("<hi!></hi!>");
        org.jsoup.select.Elements elements18 = element13.getElementsMatchingOwnText("hi!.hi!");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        org.jsoup.nodes.Element element9 = element6.removeAttr("");
        java.lang.String str10 = element9.text();
        org.jsoup.nodes.Element element12 = element9.addClass("");
        java.lang.String str13 = element9.text();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        int int20 = element18.elementSiblingIndex();
        org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList24 = element23.textNodes();
        org.jsoup.nodes.Element element26 = element23.removeAttr("");
        java.lang.String str27 = element26.text();
        org.jsoup.select.Elements elements28 = element26.nextElementSiblings();
        org.jsoup.nodes.Element element30 = element26.toggleClass("hi!");
        org.jsoup.nodes.Element element31 = element30.clearAttributes();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList34 = element33.textNodes();
        org.jsoup.nodes.Element element35 = element33.nextElementSibling();
        java.lang.String str36 = element33.normalName();
        org.jsoup.nodes.Element element37 = element33.shallowClone();
        java.util.regex.Pattern pattern39 = null;
        org.jsoup.select.Elements elements40 = element33.getElementsByAttributeValueMatching("hi!", pattern39);
        boolean boolean41 = element31.equals((java.lang.Object) pattern39);
        org.jsoup.nodes.Element element42 = element18.after((org.jsoup.nodes.Node) element31);
        org.jsoup.nodes.Element element44 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList45 = element44.textNodes();
        org.jsoup.nodes.Element element46 = element44.nextElementSibling();
        java.lang.String str47 = element44.normalName();
        org.jsoup.nodes.Element element48 = element44.shallowClone();
        org.jsoup.select.Elements elements51 = element44.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList54 = element53.textNodes();
        org.jsoup.nodes.Element element55 = element53.shallowClone();
        int int56 = element53.siblingIndex();
        org.jsoup.select.Elements elements57 = element53.nextElementSiblings();
        java.util.List<org.jsoup.nodes.Node> nodeList58 = element53.childNodes();
        org.jsoup.nodes.Element element60 = element53.toggleClass("");
        org.jsoup.nodes.Element element61 = element44.prependChild((org.jsoup.nodes.Node) element60);
        org.jsoup.nodes.Element element63 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList64 = element63.textNodes();
        org.jsoup.nodes.Element element66 = element63.removeAttr("");
        java.lang.String str67 = element66.text();
        org.jsoup.select.Elements elements68 = element66.nextElementSiblings();
        int int69 = element66.childNodeSize();
        java.util.Set<java.lang.String> strSet70 = element66.classNames();
        org.jsoup.nodes.Element element71 = element44.classNames(strSet70);
        org.jsoup.nodes.Element element73 = new org.jsoup.nodes.Element("hi!");
        java.lang.String[] strArray76 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet77 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet77, strArray76);
        org.jsoup.nodes.Element element79 = element73.classNames((java.util.Set<java.lang.String>) strSet77);
        org.jsoup.nodes.Element element80 = element44.classNames((java.util.Set<java.lang.String>) strSet77);
        org.jsoup.nodes.Element element81 = element42.classNames((java.util.Set<java.lang.String>) strSet77);
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(textNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(textNodeList24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(textNodeList34);
        org.junit.Assert.assertNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(textNodeList45);
        org.junit.Assert.assertNull(element46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertNotNull(textNodeList54);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(elements57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(textNodeList64);
        org.junit.Assert.assertNotNull(element66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(elements68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(strSet70);
        org.junit.Assert.assertNotNull(element71);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(element79);
        org.junit.Assert.assertNotNull(element80);
        org.junit.Assert.assertNotNull(element81);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Node node6 = element4.previousSibling();
        java.lang.String str7 = element4.ownText();
        java.lang.String str9 = element4.attr("hi!");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        boolean boolean9 = element4.hasAttr("hi!");
        org.jsoup.nodes.Element element10 = element4.root();
        org.jsoup.select.Elements elements11 = element4.getAllElements();
        org.jsoup.nodes.TextNode[] textNodeArray13 = new org.jsoup.nodes.TextNode[] {};
        java.util.ArrayList<org.jsoup.nodes.TextNode> textNodeList14 = new java.util.ArrayList<org.jsoup.nodes.TextNode>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList14, textNodeArray13);
        org.jsoup.nodes.Element element16 = element4.insertChildren((int) (short) 0, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList14);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = element4.tagName("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Tag name must not be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(textNodeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!>\n hi!\n</hi!>");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("<hi!>\n hi!\n</hi!>");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!.hi!");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        java.lang.String str6 = element5.id();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element5.siblingNodes();
        java.lang.String str9 = element5.attr("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        java.lang.String str6 = element1.cssSelector();
        java.lang.String str7 = element1.outerHtml();
        boolean boolean8 = element1.isBlock();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<hi!></hi!>" + "'", str7, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.shallowClone();
        int int4 = element1.siblingIndex();
        org.jsoup.select.Elements elements5 = element1.nextElementSiblings();
        java.lang.String str6 = element1.className();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        java.lang.String str6 = element1.cssSelector();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList9 = element8.textNodes();
        org.jsoup.nodes.Element element11 = element8.removeAttr("");
        java.lang.String str12 = element11.text();
        org.jsoup.select.Elements elements13 = element11.nextElementSiblings();
        org.jsoup.nodes.Element element15 = element11.toggleClass("hi!");
        org.jsoup.nodes.Element element16 = element15.clearAttributes();
        org.jsoup.nodes.Element element17 = element16.clone();
        org.jsoup.nodes.Element element18 = element1.appendTo(element16);
        org.jsoup.nodes.Element element20 = element18.prependText("hi!");
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element23 = element22.empty();
        org.jsoup.nodes.Element element24 = element20.appendTo(element22);
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textNodeList9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        org.jsoup.select.Elements elements16 = element4.getElementsByAttributeValueContaining("hi!", "hi!");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        org.jsoup.nodes.Element element9 = element6.removeAttr("");
        java.lang.String str10 = element9.text();
        org.jsoup.nodes.Element element12 = element9.addClass("");
        java.lang.String str13 = element9.text();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        int int20 = element18.elementSiblingIndex();
        org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Element element23 = element18.appendText("<hi!></hi!>");
        boolean boolean24 = element18.hasParent();
        org.jsoup.parser.Tag tag25 = element18.tag();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag25, "hi!.hi!");
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element(tag25, "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(textNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(tag25);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        boolean boolean9 = element4.hasAttr("hi!");
        org.jsoup.select.Elements elements11 = element4.getElementsContainingText("");
        boolean boolean12 = element4.isBlock();
        org.jsoup.nodes.Element element14 = element4.append("");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Document document5 = element1.ownerDocument();
        org.jsoup.nodes.Element element6 = element1.root();
        int int7 = element6.siblingIndex();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        boolean boolean9 = element4.hasAttr("hi!");
        org.jsoup.nodes.Element element10 = element4.root();
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexEquals((int) (byte) 10);
        java.lang.String str13 = element10.nodeName();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        java.lang.String str14 = element4.val();
        org.jsoup.nodes.Element element15 = element4.empty();
        org.jsoup.nodes.Element element17 = element15.html("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = element15.dataset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements21 = element15.getElementsByAttributeValueEnding("<hi!>\n hi!\n</hi!>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        boolean boolean9 = element4.hasAttr("hi!");
        org.jsoup.select.Elements elements11 = element4.getElementsContainingText("");
        org.jsoup.nodes.Element element13 = element4.prependText("hi!");
        java.lang.String str14 = element13.data();
        org.jsoup.nodes.Element element16 = element13.appendText("<hi!></hi!>");
        org.jsoup.select.Elements elements18 = element16.getElementsByIndexGreaterThan((int) (byte) 100);
        java.lang.String str19 = element16.val();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements21 = element16.getElementsByAttributeStarting("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element10.textNodes();
        org.jsoup.nodes.Element element12 = element10.shallowClone();
        int int13 = element10.siblingIndex();
        org.jsoup.select.Elements elements14 = element10.nextElementSiblings();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element10.childNodes();
        org.jsoup.nodes.Element element17 = element10.toggleClass("");
        org.jsoup.nodes.Element element18 = element1.prependChild((org.jsoup.nodes.Node) element17);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = element17.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = element1.childNodes();
        org.jsoup.nodes.Element element7 = element1.append("");
        java.lang.String str8 = element1.tagName();
        org.jsoup.parser.Tag tag9 = element1.tag();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.shallowClone();
        int int4 = element1.siblingIndex();
        org.jsoup.select.Elements elements5 = element1.nextElementSiblings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes();
        org.jsoup.nodes.Element element8 = element1.toggleClass("");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = element1.dataset();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        int int7 = element4.childNodeSize();
        java.util.Set<java.lang.String> strSet8 = element4.classNames();
        org.jsoup.nodes.Document document9 = element4.ownerDocument();
        org.jsoup.select.Elements elements10 = element4.previousElementSiblings();
        org.jsoup.parser.Tag tag11 = element4.tag();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList14 = element13.textNodes();
        org.jsoup.nodes.Element element15 = element13.nextElementSibling();
        java.lang.String str16 = element13.normalName();
        org.jsoup.select.Elements elements18 = element13.getElementsByIndexLessThan((int) (byte) 1);
        org.jsoup.nodes.Element element19 = element13.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = element4.before((org.jsoup.nodes.Node) element19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(textNodeList14);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        java.lang.String str6 = element1.attr("hi!.hi!");
        org.jsoup.nodes.Node node7 = element1.previousSibling();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        org.jsoup.nodes.Element element8 = element7.clearAttributes();
        org.jsoup.select.Elements elements9 = element7.siblingElements();
        org.jsoup.select.Elements elements12 = element7.getElementsByAttributeValueContaining("<hi!></hi!>", "<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        java.lang.String str6 = element5.id();
        int int7 = element5.childNodeSize();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList10 = element9.textNodes();
        org.jsoup.nodes.Element element12 = element9.removeAttr("");
        java.lang.String str13 = element12.text();
        org.jsoup.nodes.Element element15 = element12.addClass("");
        java.lang.String str16 = element12.text();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList20 = element19.textNodes();
        org.jsoup.nodes.Element element21 = element12.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList20);
        org.jsoup.nodes.Element element22 = element21.previousElementSibling();
        org.jsoup.nodes.Element element23 = element5.appendTo(element21);
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(textNodeList10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(textNodeList20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        org.jsoup.nodes.Element element16 = element4.attr("<hi!>\n hi!\n</hi!>", false);
        org.jsoup.select.Elements elements17 = element16.siblingElements();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.shallowClone();
        int int4 = element1.siblingIndex();
        org.jsoup.select.Elements elements5 = element1.nextElementSiblings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes();
        org.jsoup.nodes.Element element8 = element1.toggleClass("");
        org.jsoup.select.Elements elements9 = element8.previousElementSiblings();
        org.jsoup.nodes.Document document10 = element8.ownerDocument();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        org.jsoup.nodes.Element element7 = element1.addClass("<hi!></hi!>");
        org.jsoup.select.Elements elements9 = element7.getElementsMatchingText("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element7.select("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        java.lang.String str6 = element5.id();
        int int7 = element5.elementSiblingIndex();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element9 = element8.clearAttributes();
        org.jsoup.select.Elements elements10 = element9.getAllElements();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element9.textNodes();
        org.jsoup.select.Elements elements12 = element9.children();
        org.jsoup.select.Elements elements13 = element9.nextElementSiblings();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element10.textNodes();
        org.jsoup.nodes.Element element12 = element10.shallowClone();
        int int13 = element10.siblingIndex();
        org.jsoup.select.Elements elements14 = element10.nextElementSiblings();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element10.childNodes();
        org.jsoup.nodes.Element element17 = element10.toggleClass("");
        org.jsoup.nodes.Element element18 = element1.prependChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList21 = element20.textNodes();
        org.jsoup.nodes.Element element23 = element20.removeAttr("");
        java.lang.String str24 = element23.text();
        org.jsoup.select.Elements elements25 = element23.nextElementSiblings();
        int int26 = element23.childNodeSize();
        java.util.Set<java.lang.String> strSet27 = element23.classNames();
        org.jsoup.nodes.Element element28 = element1.classNames(strSet27);
        java.lang.String str29 = element1.normalName();
        org.jsoup.nodes.Element element30 = element1.clone();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(textNodeList21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(element30);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Document document5 = element1.ownerDocument();
        org.jsoup.nodes.Element element6 = element1.root();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList9 = element8.textNodes();
        org.jsoup.nodes.Element element10 = element8.shallowClone();
        org.jsoup.nodes.Element element11 = element1.appendChild((org.jsoup.nodes.Node) element8);
        org.jsoup.nodes.Element element13 = element8.removeClass("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(textNodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.jsoup.nodes.Element element7 = element1.classNames((java.util.Set<java.lang.String>) strSet5);
        org.jsoup.nodes.Element element10 = element1.attr("<hi!></hi!>", "hi!");
        java.lang.String str11 = element10.toString();
        org.jsoup.select.Elements elements13 = element10.getElementsByTag("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = element10.childNodesCopy();
        org.jsoup.select.Elements elements17 = element10.getElementsByAttributeValueEnding("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>", "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>" + "'", str11, "<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element10.textNodes();
        org.jsoup.nodes.Element element12 = element10.shallowClone();
        int int13 = element10.siblingIndex();
        org.jsoup.select.Elements elements14 = element10.nextElementSiblings();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element10.childNodes();
        org.jsoup.nodes.Element element17 = element10.toggleClass("");
        boolean boolean18 = element4.equals((java.lang.Object) "");
        org.jsoup.select.Elements elements20 = element4.getElementsByIndexLessThan(100);
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        boolean boolean9 = element4.hasAttr("hi!");
        org.jsoup.nodes.Element element10 = element4.root();
        org.jsoup.select.Elements elements11 = element4.getAllElements();
        org.jsoup.nodes.TextNode[] textNodeArray13 = new org.jsoup.nodes.TextNode[] {};
        java.util.ArrayList<org.jsoup.nodes.TextNode> textNodeList14 = new java.util.ArrayList<org.jsoup.nodes.TextNode>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList14, textNodeArray13);
        org.jsoup.nodes.Element element16 = element4.insertChildren((int) (short) 0, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList14);
        org.jsoup.nodes.Element element18 = element4.prependElement("<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(textNodeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Document document5 = element1.ownerDocument();
        org.jsoup.nodes.Element element6 = element1.root();
        java.lang.String str7 = element1.className();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element9 = element8.clearAttributes();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element11.nextElementSibling();
        java.lang.String str14 = element11.normalName();
        org.jsoup.nodes.Element element15 = element11.shallowClone();
        java.util.regex.Pattern pattern17 = null;
        org.jsoup.select.Elements elements18 = element11.getElementsByAttributeValueMatching("hi!", pattern17);
        boolean boolean19 = element9.equals((java.lang.Object) pattern17);
        org.jsoup.nodes.Element element20 = element9.clone();
        org.jsoup.select.Elements elements22 = element20.getElementsMatchingText("hi!.hi!");
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList25 = element24.textNodes();
        org.jsoup.nodes.Element element27 = element24.removeAttr("");
        java.lang.String str28 = element27.text();
        org.jsoup.nodes.Element element30 = element27.addClass("");
        java.lang.String str31 = element27.text();
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList35 = element34.textNodes();
        org.jsoup.nodes.Element element36 = element27.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList35);
        java.lang.String str37 = element27.val();
        org.jsoup.nodes.Element element38 = element27.empty();
        java.lang.String str39 = element38.outerHtml();
        org.jsoup.nodes.Document document40 = element38.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element41 = element20.prependChild((org.jsoup.nodes.Node) document40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(textNodeList25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(textNodeList35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<hi! class=\"\"></hi!>" + "'", str39, "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNull(document40);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Node node3 = element1.previousSibling();
        java.lang.String str4 = element1.id();
        org.jsoup.nodes.Element element6 = element1.removeClass("hi!");
        org.jsoup.nodes.Element element7 = element6.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = element6.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.shallowClone();
        int int4 = element1.siblingIndex();
        java.lang.String str5 = element1.baseUri();
        org.jsoup.nodes.Element element6 = element1.clearAttributes();
        java.lang.String str8 = element1.absUrl("<hi!></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Evaluator evaluator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = element2.is(evaluator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        boolean boolean9 = element4.hasAttr("hi!");
        org.jsoup.select.Elements elements11 = element4.getElementsContainingText("");
        org.jsoup.nodes.Element element13 = element4.prependText("hi!");
        org.jsoup.select.Elements elements14 = element13.getAllElements();
        java.lang.String str15 = element13.val();
        java.lang.String str16 = element13.tagName();
        org.jsoup.select.Elements elements17 = element13.children();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        element4.setBaseUri("hi!");
        org.jsoup.nodes.Element element9 = element4.previousElementSibling();
        java.lang.String str10 = element4.cssSelector();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        org.jsoup.nodes.Element element9 = element6.removeAttr("");
        java.lang.String str10 = element9.text();
        org.jsoup.nodes.Element element12 = element9.addClass("");
        java.lang.String str13 = element9.text();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        int int20 = element18.elementSiblingIndex();
        org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList24 = element23.textNodes();
        org.jsoup.nodes.Element element26 = element23.removeAttr("");
        java.lang.String str27 = element26.text();
        org.jsoup.select.Elements elements28 = element26.nextElementSiblings();
        org.jsoup.nodes.Element element30 = element26.toggleClass("hi!");
        org.jsoup.nodes.Element element31 = element30.clearAttributes();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList34 = element33.textNodes();
        org.jsoup.nodes.Element element35 = element33.nextElementSibling();
        java.lang.String str36 = element33.normalName();
        org.jsoup.nodes.Element element37 = element33.shallowClone();
        java.util.regex.Pattern pattern39 = null;
        org.jsoup.select.Elements elements40 = element33.getElementsByAttributeValueMatching("hi!", pattern39);
        boolean boolean41 = element31.equals((java.lang.Object) pattern39);
        org.jsoup.nodes.Element element42 = element18.after((org.jsoup.nodes.Node) element31);
        org.jsoup.select.Elements elements45 = element31.getElementsByAttributeValue("<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.nodes.Element element47 = element31.removeAttr("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        int int48 = element31.siblingIndex();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(textNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(textNodeList24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(textNodeList34);
        org.junit.Assert.assertNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Node node3 = element1.previousSibling();
        java.lang.String str4 = element1.id();
        org.jsoup.nodes.Element element6 = element1.removeClass("hi!");
        boolean boolean7 = element6.hasText();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        java.util.regex.Pattern pattern7 = null;
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", pattern7);
        org.jsoup.nodes.Element element11 = element1.attr("", false);
        java.util.List<org.jsoup.nodes.Node> nodeList12 = element1.childNodesCopy();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        java.lang.String str6 = element5.id();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element5.siblingNodes();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList10 = element9.textNodes();
        org.jsoup.nodes.Element element12 = element9.removeAttr("");
        java.lang.String str13 = element12.text();
        org.jsoup.nodes.Element element15 = element12.addClass("");
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList18 = element17.textNodes();
        org.jsoup.nodes.Element element20 = element17.removeAttr("");
        java.lang.String str21 = element20.text();
        org.jsoup.nodes.Element element23 = element20.addClass("");
        java.lang.String str24 = element20.text();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList28 = element27.textNodes();
        org.jsoup.nodes.Element element29 = element20.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList28);
        org.jsoup.nodes.Element element30 = element12.appendChild((org.jsoup.nodes.Node) element29);
        boolean boolean31 = element5.equals((java.lang.Object) element29);
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNodeList10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(textNodeList18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(textNodeList28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        boolean boolean9 = element4.hasAttr("hi!");
        org.jsoup.select.Elements elements11 = element4.getElementsContainingText("");
        org.jsoup.nodes.Element element13 = element4.prependText("hi!");
        java.lang.String str14 = element13.data();
        org.jsoup.nodes.Element element16 = element13.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element18 = element13.appendText("<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.shallowClone();
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element6 = element1.html("<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Element element5 = element1.clearAttributes();
        java.lang.String str6 = element5.id();
        org.jsoup.select.Elements elements8 = element5.getElementsByClass("<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.String str8 = element4.text();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element4.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList12);
        int int14 = element13.childNodeSize();
        org.jsoup.select.Elements elements17 = element13.getElementsByAttributeValueContaining("hi!", "hi!");
        boolean boolean19 = element13.hasAttr("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element21 = element13.addClass("<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        org.jsoup.nodes.Element element7 = element1.addClass("<hi!></hi!>");
        boolean boolean9 = element1.hasAttr("hi!");
        org.jsoup.select.Evaluator evaluator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = element1.is(evaluator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.shallowClone();
        org.jsoup.select.Elements elements5 = element3.getElementsByClass("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element6 = element3.clearAttributes();
        org.jsoup.select.NodeFilter nodeFilter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element3.filter(nodeFilter7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element10.textNodes();
        org.jsoup.nodes.Element element12 = element10.shallowClone();
        int int13 = element10.siblingIndex();
        org.jsoup.select.Elements elements14 = element10.nextElementSiblings();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element10.childNodes();
        org.jsoup.nodes.Element element17 = element10.toggleClass("");
        org.jsoup.nodes.Element element18 = element1.prependChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList21 = element20.textNodes();
        org.jsoup.nodes.Element element23 = element20.removeAttr("");
        java.lang.String str24 = element23.text();
        org.jsoup.select.Elements elements25 = element23.nextElementSiblings();
        int int26 = element23.childNodeSize();
        java.util.Set<java.lang.String> strSet27 = element23.classNames();
        org.jsoup.nodes.Element element28 = element1.classNames(strSet27);
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element("hi!");
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.jsoup.nodes.Element element36 = element30.classNames((java.util.Set<java.lang.String>) strSet34);
        org.jsoup.nodes.Element element37 = element1.classNames((java.util.Set<java.lang.String>) strSet34);
        org.jsoup.nodes.Element element39 = element1.val("hi!");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(textNodeList21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.shallowClone();
        int int4 = element1.siblingIndex();
        org.jsoup.select.Elements elements5 = element1.nextElementSiblings();
        org.jsoup.nodes.Element element7 = element1.prependText("");
        element1.setBaseUri("<hi! class=\"\"></hi!>");
        java.lang.String str10 = element1.tagName();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element10.textNodes();
        org.jsoup.nodes.Element element12 = element10.shallowClone();
        int int13 = element10.siblingIndex();
        org.jsoup.select.Elements elements14 = element10.nextElementSiblings();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element10.childNodes();
        org.jsoup.nodes.Element element17 = element10.toggleClass("");
        org.jsoup.nodes.Element element18 = element1.prependChild((org.jsoup.nodes.Node) element17);
        org.jsoup.select.Evaluator evaluator19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = element18.is(evaluator19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.appendText("hi!");
        java.lang.String str4 = element1.wholeText();
        org.jsoup.select.Elements elements5 = element1.parents();
        org.jsoup.nodes.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = element1.prependChild(node6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        org.jsoup.nodes.Element element9 = element6.removeAttr("");
        java.lang.String str10 = element9.text();
        org.jsoup.nodes.Element element12 = element9.addClass("");
        java.lang.String str13 = element9.text();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element16.textNodes();
        org.jsoup.nodes.Element element18 = element9.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.TextNode>) textNodeList17);
        org.jsoup.nodes.Element element19 = element18.previousElementSibling();
        int int20 = element18.elementSiblingIndex();
        org.jsoup.nodes.Element element21 = element1.prependChild((org.jsoup.nodes.Node) element18);
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element21.childNodes();
        java.lang.String str23 = element21.nodeName();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(textNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        org.jsoup.select.Elements elements8 = element7.children();
        org.jsoup.nodes.Element element9 = element7.root();
        org.jsoup.nodes.Attributes attributes10 = element9.attributes();
        boolean boolean12 = element9.hasAttr("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Node node13 = element9.parentNode();
        org.jsoup.nodes.Element element14 = element9.parent();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.shallowClone();
        org.jsoup.select.Elements elements5 = element3.getElementsByClass("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element6 = element3.clearAttributes();
        org.jsoup.nodes.Element element8 = element6.removeAttr("<hi!></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        java.lang.Class<?> wildcardClass8 = element7.getClass();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        int int7 = element4.childNodeSize();
        java.lang.String str8 = element4.wholeText();
        boolean boolean10 = element4.hasClass("<hi! class=\"\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = element4.is("hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!': unexpected token at '!'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element9 = element8.clearAttributes();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        org.jsoup.nodes.Element element13 = element11.nextElementSibling();
        java.lang.String str14 = element11.normalName();
        org.jsoup.nodes.Element element15 = element11.shallowClone();
        java.util.regex.Pattern pattern17 = null;
        org.jsoup.select.Elements elements18 = element11.getElementsByAttributeValueMatching("hi!", pattern17);
        boolean boolean19 = element9.equals((java.lang.Object) pattern17);
        org.jsoup.nodes.Element element20 = element9.clone();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = element20.dataset();
        java.lang.String str22 = element20.wholeText();
        boolean boolean24 = element20.hasAttr("<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element10.textNodes();
        org.jsoup.nodes.Element element12 = element10.shallowClone();
        int int13 = element10.siblingIndex();
        org.jsoup.select.Elements elements14 = element10.nextElementSiblings();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element10.childNodes();
        org.jsoup.nodes.Element element17 = element10.toggleClass("");
        org.jsoup.nodes.Element element18 = element1.prependChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Element element19 = element1.clone();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        org.jsoup.nodes.Element element5 = element1.shallowClone();
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element10.textNodes();
        org.jsoup.nodes.Element element12 = element10.shallowClone();
        int int13 = element10.siblingIndex();
        org.jsoup.select.Elements elements14 = element10.nextElementSiblings();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element10.childNodes();
        org.jsoup.nodes.Element element17 = element10.toggleClass("");
        org.jsoup.nodes.Element element18 = element1.prependChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Attributes attributes19 = element1.attributes();
        java.lang.String str20 = element1.text();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValue("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }
}


