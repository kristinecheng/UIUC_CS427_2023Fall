import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        int int3 = element1.childNodeSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = element1.firstElementSibling();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element4.firstElementSibling();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.select.Elements elements6 = element4.nextElementSiblings();
        org.jsoup.nodes.Element element8 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element9 = element8.clearAttributes();
        boolean boolean11 = element9.hasSameValue((java.lang.Object) "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element9.lastElementSibling();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        java.lang.String str5 = element4.text();
        org.jsoup.nodes.Element element7 = element4.addClass("");
        org.jsoup.nodes.Element element8 = element4.clone();
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element8.wrap("<hi!>\n hi!\n</hi!>");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element4.firstElementSibling();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.nextElementSibling();
        java.lang.String str4 = element1.normalName();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = element1.childNodes();
        org.jsoup.nodes.Element element7 = element1.append("");
        org.jsoup.select.Elements elements9 = element1.getElementsByAttribute("<hi! class=\"hi! \" <hi!></hi!>=\"hi!\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element1.lastElementSibling();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element4 = element1.removeAttr("");
        org.jsoup.nodes.Document document5 = element1.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element1.firstElementSibling();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.shallowClone();
        int int4 = element1.siblingIndex();
        java.lang.String str5 = element1.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element1.lastElementSibling();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element30 = element1.firstElementSibling();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element15.firstElementSibling();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.nodes.Element element3 = element1.shallowClone();
        org.jsoup.select.Elements elements5 = element3.getElementsByClass("<hi!>\n hi!\n</hi!>");
        org.jsoup.select.Elements elements7 = element3.getElementsByTag("<hi!></hi!>");
        java.lang.String str8 = element3.normalName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element3.lastElementSibling();
    }
}

