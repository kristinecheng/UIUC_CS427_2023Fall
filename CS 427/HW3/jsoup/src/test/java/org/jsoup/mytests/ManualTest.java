package org.jsoup.mytests;

import org.jsoup.Jsoup;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class ManualTest {
    @Test public void testSetHtmlTitle1() {
        Document doc1 = Jsoup.parse("<html><head id=2><iframe id=1></iframe></head></html>");
        Document doc2 = Jsoup.parse("<html><head id=2><noembed id=1></noembed></head></html>");
        Document doc3 = Jsoup.parse("<html><head id=2><noframes id=1></noframes></head></html>");
        Document doc4 = Jsoup.parse("<html><head id=2><style id=1></style></head></html>");
        Document doc5 = Jsoup.parse("<html><head id=2><xmp id=1></xmp></head></html>");

        Element iframe = doc1.getElementById("1");
        iframe.html("good");
        assertEquals("good", iframe.html());
        iframe.html("<i>bad</i>");
        assertEquals("&lt;i&gt;bad&lt;/i&gt;", iframe.html());

        Element noembed = doc2.getElementById("1");
        noembed.html("good");
        assertEquals("good", noembed.html());
        noembed.html("<i>bad</i>");
        assertEquals("&lt;i&gt;bad&lt;/i&gt;", noembed.html());

        Element noframes = doc3.getElementById("1");
        noframes.html("good");
        assertEquals("good", noframes.html());
        noframes.html("<i>bad</i>");
        assertEquals("&lt;i&gt;bad&lt;/i&gt;", noframes.html());

        Element style = doc4.getElementById("1");
        style.html("good");
        assertEquals("good", style.html());
        style.html("<i>bad</i>");
        assertEquals("&lt;i&gt;bad&lt;/i&gt;", style.html());

        Element xmp = doc5.getElementById("1");
        xmp.html("good");
        assertEquals("good", xmp.html());
        xmp.html("<i>bad</i>");
        assertEquals("&lt;i&gt;bad&lt;/i&gt;", xmp.html());

        Element head = doc1.getElementById("2");
        head.html("<iframe><i>bad</i></iframe>");
        assertEquals("<iframe>&lt;i&gt;bad&lt;/i&gt;</iframe>", head.html());

        head = doc2.getElementById("2");
        head.html("<noembed><i>bad</i></noembed>");
        assertEquals("<noembed>\n &lt;i&gt;bad&lt;/i&gt;\n</noembed>", head.html());

        head = doc3.getElementById("2");
        head.html("<noframes><i>bad</i></noframes>");
        assertEquals("<noframes>\n &lt;i&gt;bad&lt;/i&gt;\n</noframes>", head.html());

        head = doc4.getElementById("2");
        head.html("<style><i>bad</i></style>");
        assertEquals("<style><i>bad</i></style>", head.html());

        head = doc5.getElementById("2");
        head.html("<xmp><i>bad</i></xmp>");
        assertEquals("<xmp>\n &lt;i&gt;bad&lt;/i&gt;\n</xmp>", head.html());
    }
 
    @Test public void testSetHtmlTitle2()
    {
        Document doc = Jsoup.parse("<html><head id=2><script id=1></script></head></html>");

        Element script = doc.getElementById("1");
        script.html("good");
        assertEquals("good", script.html());
        script.html("<i>bad</i>");
        assertEquals("&lt;i&gt;bad&lt;/i&gt;", script.html());

        Element head = doc.getElementById("2");
        head.html("<script><i>bad</i></script>");
        assertEquals("<script><i>bad</i></script>", head.html());
    }

    @Test public void testSetHtmlTitle3()
    {
        Document doc = Jsoup.parse("<html><head id=2><noscript id=1></noscript></head></html>");

        Element noscript = doc.getElementById("1");
        noscript.html("good");
        assertEquals("good", noscript.html());
        noscript.html("<i>bad</i>");
        assertEquals("<i>bad</i>", noscript.html());
    }

    @Test public void testSetHtmlTitle4()
    {
        Document doc = Jsoup.parse("<html><head id=2><plaintext id=1></plaintext></head></html>");

        Element plaintext = doc.getElementById("1");
        plaintext.html("good");
        assertEquals("good", plaintext.html());
        plaintext.html("<i>bad</i>");
        assertEquals("<i>bad</i>", plaintext.html());
    }
}
