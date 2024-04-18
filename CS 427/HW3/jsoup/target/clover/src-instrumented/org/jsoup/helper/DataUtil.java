/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.helper;

import org.jsoup.UncheckedIOException;
import org.jsoup.internal.ConstrainableInputStream;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Internal static utilities for handling data.
 *
 */
public final class DataUtil {public static class __CLR4_2_06g6glnxz22f8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,413,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final Pattern charsetPattern = Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");
    static final String defaultCharset = "UTF-8"; // used if not found in header or meta charset
    private static final int firstReadBufferSize = 1024 * 5;
    static final int bufferSize = 1024 * 32;
    private static final char[] mimeBoundaryChars =
            "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    static final int boundaryLength = 32;

    private DataUtil() {try{__CLR4_2_06g6glnxz22f8.R.inc(232);}finally{__CLR4_2_06g6glnxz22f8.R.flushNeeded();}}

    /**
     * Loads a file to a Document.
     * @param in file to load
     * @param charsetName character set of input
     * @param baseUri base URI of document, to resolve relative links against
     * @return Document
     * @throws IOException on IO error
     */
    public static Document load(File in, String charsetName, String baseUri) throws IOException {try{__CLR4_2_06g6glnxz22f8.R.inc(233);
        __CLR4_2_06g6glnxz22f8.R.inc(234);return parseInputStream(new FileInputStream(in), charsetName, baseUri, Parser.htmlParser());
    }finally{__CLR4_2_06g6glnxz22f8.R.flushNeeded();}}

    /**
     * Parses a Document from an input steam.
     * @param in input stream to parse. You will need to close it.
     * @param charsetName character set of input
     * @param baseUri base URI of document, to resolve relative links against
     * @return Document
     * @throws IOException on IO error
     */
    public static Document load(InputStream in, String charsetName, String baseUri) throws IOException {try{__CLR4_2_06g6glnxz22f8.R.inc(235);
        __CLR4_2_06g6glnxz22f8.R.inc(236);return parseInputStream(in, charsetName, baseUri, Parser.htmlParser());
    }finally{__CLR4_2_06g6glnxz22f8.R.flushNeeded();}}

    /**
     * Parses a Document from an input steam, using the provided Parser.
     * @param in input stream to parse. You will need to close it.
     * @param charsetName character set of input
     * @param baseUri base URI of document, to resolve relative links against
     * @param parser alternate {@link Parser#xmlParser() parser} to use.
     * @return Document
     * @throws IOException on IO error
     */
    public static Document load(InputStream in, String charsetName, String baseUri, Parser parser) throws IOException {try{__CLR4_2_06g6glnxz22f8.R.inc(237);
        __CLR4_2_06g6glnxz22f8.R.inc(238);return parseInputStream(in, charsetName, baseUri, parser);
    }finally{__CLR4_2_06g6glnxz22f8.R.flushNeeded();}}

    /**
     * Writes the input stream to the output stream. Doesn't close them.
     * @param in input stream to read from
     * @param out output stream to write to
     * @throws IOException on IO error
     */
    static void crossStreams(final InputStream in, final OutputStream out) throws IOException {try{__CLR4_2_06g6glnxz22f8.R.inc(239);
        __CLR4_2_06g6glnxz22f8.R.inc(240);final byte[] buffer = new byte[bufferSize];
        __CLR4_2_06g6glnxz22f8.R.inc(241);int len;
        __CLR4_2_06g6glnxz22f8.R.inc(242);while ((len = in.read(buffer)) != -1) {{
            __CLR4_2_06g6glnxz22f8.R.inc(245);out.write(buffer, 0, len);
        }
    }}finally{__CLR4_2_06g6glnxz22f8.R.flushNeeded();}}

    static Document parseInputStream(InputStream input, String charsetName, String baseUri, Parser parser) throws IOException  {try{__CLR4_2_06g6glnxz22f8.R.inc(246);
        __CLR4_2_06g6glnxz22f8.R.inc(247);if ((((input == null)&&(__CLR4_2_06g6glnxz22f8.R.iget(248)!=0|true))||(__CLR4_2_06g6glnxz22f8.R.iget(249)==0&false))) // empty body
            {__CLR4_2_06g6glnxz22f8.R.inc(250);return new Document(baseUri);
        }__CLR4_2_06g6glnxz22f8.R.inc(251);input = ConstrainableInputStream.wrap(input, bufferSize, 0);

        __CLR4_2_06g6glnxz22f8.R.inc(252);Document doc = null;

        // read the start of the stream and look for a BOM or meta charset
        __CLR4_2_06g6glnxz22f8.R.inc(253);input.mark(bufferSize);
        __CLR4_2_06g6glnxz22f8.R.inc(254);ByteBuffer firstBytes = readToByteBuffer(input, firstReadBufferSize - 1); // -1 because we read one more to see if completed. First read is < buffer size, so can't be invalid.
        __CLR4_2_06g6glnxz22f8.R.inc(255);boolean fullyRead = (input.read() == -1);
        __CLR4_2_06g6glnxz22f8.R.inc(256);input.reset();

        // look for BOM - overrides any other header or input
        __CLR4_2_06g6glnxz22f8.R.inc(257);BomCharset bomCharset = detectCharsetFromBom(firstBytes);
        __CLR4_2_06g6glnxz22f8.R.inc(258);if ((((bomCharset != null)&&(__CLR4_2_06g6glnxz22f8.R.iget(259)!=0|true))||(__CLR4_2_06g6glnxz22f8.R.iget(260)==0&false)))
            {__CLR4_2_06g6glnxz22f8.R.inc(261);charsetName = bomCharset.charset;

        }__CLR4_2_06g6glnxz22f8.R.inc(262);if ((((charsetName == null)&&(__CLR4_2_06g6glnxz22f8.R.iget(263)!=0|true))||(__CLR4_2_06g6glnxz22f8.R.iget(264)==0&false))) {{ // determine from meta. safe first parse as UTF-8
            __CLR4_2_06g6glnxz22f8.R.inc(265);String docData = Charset.forName(defaultCharset).decode(firstBytes).toString();
            __CLR4_2_06g6glnxz22f8.R.inc(266);try {
                __CLR4_2_06g6glnxz22f8.R.inc(267);doc = parser.parseInput(docData, baseUri);
            } catch (UncheckedIOException e) {
                __CLR4_2_06g6glnxz22f8.R.inc(268);throw e.ioException();
            }

            // look for <meta http-equiv="Content-Type" content="text/html;charset=gb2312"> or HTML5 <meta charset="gb2312">
            __CLR4_2_06g6glnxz22f8.R.inc(269);Elements metaElements = doc.select("meta[http-equiv=content-type], meta[charset]");
            __CLR4_2_06g6glnxz22f8.R.inc(270);String foundCharset = null; // if not found, will keep utf-8 as best attempt
            __CLR4_2_06g6glnxz22f8.R.inc(271);for (Element meta : metaElements) {{
                __CLR4_2_06g6glnxz22f8.R.inc(272);if ((((meta.hasAttr("http-equiv"))&&(__CLR4_2_06g6glnxz22f8.R.iget(273)!=0|true))||(__CLR4_2_06g6glnxz22f8.R.iget(274)==0&false)))
                    {__CLR4_2_06g6glnxz22f8.R.inc(275);foundCharset = getCharsetFromContentType(meta.attr("content"));
                }__CLR4_2_06g6glnxz22f8.R.inc(276);if ((((foundCharset == null && meta.hasAttr("charset"))&&(__CLR4_2_06g6glnxz22f8.R.iget(277)!=0|true))||(__CLR4_2_06g6glnxz22f8.R.iget(278)==0&false)))
                    {__CLR4_2_06g6glnxz22f8.R.inc(279);foundCharset = meta.attr("charset");
                }__CLR4_2_06g6glnxz22f8.R.inc(280);if ((((foundCharset != null)&&(__CLR4_2_06g6glnxz22f8.R.iget(281)!=0|true))||(__CLR4_2_06g6glnxz22f8.R.iget(282)==0&false)))
                    {__CLR4_2_06g6glnxz22f8.R.inc(283);break;
            }}

            // look for <?xml encoding='ISO-8859-1'?>
            }__CLR4_2_06g6glnxz22f8.R.inc(284);if ((((foundCharset == null && doc.childNodeSize() > 0)&&(__CLR4_2_06g6glnxz22f8.R.iget(285)!=0|true))||(__CLR4_2_06g6glnxz22f8.R.iget(286)==0&false))) {{
                __CLR4_2_06g6glnxz22f8.R.inc(287);Node first = doc.childNode(0);
                __CLR4_2_06g6glnxz22f8.R.inc(288);XmlDeclaration decl = null;
                __CLR4_2_06g6glnxz22f8.R.inc(289);if ((((first instanceof XmlDeclaration)&&(__CLR4_2_06g6glnxz22f8.R.iget(290)!=0|true))||(__CLR4_2_06g6glnxz22f8.R.iget(291)==0&false)))
                    {__CLR4_2_06g6glnxz22f8.R.inc(292);decl = (XmlDeclaration) first;
                }else {__CLR4_2_06g6glnxz22f8.R.inc(293);if ((((first instanceof Comment)&&(__CLR4_2_06g6glnxz22f8.R.iget(294)!=0|true))||(__CLR4_2_06g6glnxz22f8.R.iget(295)==0&false))) {{
                    __CLR4_2_06g6glnxz22f8.R.inc(296);Comment comment = (Comment) first;
                    __CLR4_2_06g6glnxz22f8.R.inc(297);if ((((comment.isXmlDeclaration())&&(__CLR4_2_06g6glnxz22f8.R.iget(298)!=0|true))||(__CLR4_2_06g6glnxz22f8.R.iget(299)==0&false)))
                        {__CLR4_2_06g6glnxz22f8.R.inc(300);decl = comment.asXmlDeclaration();
                }}
                }}__CLR4_2_06g6glnxz22f8.R.inc(301);if ((((decl != null)&&(__CLR4_2_06g6glnxz22f8.R.iget(302)!=0|true))||(__CLR4_2_06g6glnxz22f8.R.iget(303)==0&false))) {{
                    __CLR4_2_06g6glnxz22f8.R.inc(304);if ((((decl.name().equalsIgnoreCase("xml"))&&(__CLR4_2_06g6glnxz22f8.R.iget(305)!=0|true))||(__CLR4_2_06g6glnxz22f8.R.iget(306)==0&false)))
                        {__CLR4_2_06g6glnxz22f8.R.inc(307);foundCharset = decl.attr("encoding");
                }}
            }}
            }__CLR4_2_06g6glnxz22f8.R.inc(308);foundCharset = validateCharset(foundCharset);
            __CLR4_2_06g6glnxz22f8.R.inc(309);if ((((foundCharset != null && !foundCharset.equalsIgnoreCase(defaultCharset))&&(__CLR4_2_06g6glnxz22f8.R.iget(310)!=0|true))||(__CLR4_2_06g6glnxz22f8.R.iget(311)==0&false))) {{ // need to re-decode. (case insensitive check here to match how validate works)
                __CLR4_2_06g6glnxz22f8.R.inc(312);foundCharset = foundCharset.trim().replaceAll("[\"']", "");
                __CLR4_2_06g6glnxz22f8.R.inc(313);charsetName = foundCharset;
                __CLR4_2_06g6glnxz22f8.R.inc(314);doc = null;
            } }else {__CLR4_2_06g6glnxz22f8.R.inc(315);if ((((!fullyRead)&&(__CLR4_2_06g6glnxz22f8.R.iget(316)!=0|true))||(__CLR4_2_06g6glnxz22f8.R.iget(317)==0&false))) {{
                __CLR4_2_06g6glnxz22f8.R.inc(318);doc = null;
            }
        }}} }else {{ // specified by content type header (or by user on file load)
            __CLR4_2_06g6glnxz22f8.R.inc(319);Validate.notEmpty(charsetName, "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML");
        }
        }__CLR4_2_06g6glnxz22f8.R.inc(320);if ((((doc == null)&&(__CLR4_2_06g6glnxz22f8.R.iget(321)!=0|true))||(__CLR4_2_06g6glnxz22f8.R.iget(322)==0&false))) {{
            __CLR4_2_06g6glnxz22f8.R.inc(323);if ((((charsetName == null)&&(__CLR4_2_06g6glnxz22f8.R.iget(324)!=0|true))||(__CLR4_2_06g6glnxz22f8.R.iget(325)==0&false)))
                {__CLR4_2_06g6glnxz22f8.R.inc(326);charsetName = defaultCharset;
            }__CLR4_2_06g6glnxz22f8.R.inc(327);BufferedReader reader = new BufferedReader(new InputStreamReader(input, charsetName), bufferSize);
            __CLR4_2_06g6glnxz22f8.R.inc(328);if ((((bomCharset != null && bomCharset.offset)&&(__CLR4_2_06g6glnxz22f8.R.iget(329)!=0|true))||(__CLR4_2_06g6glnxz22f8.R.iget(330)==0&false))) {{ // creating the buffered reader ignores the input pos, so must skip here
                __CLR4_2_06g6glnxz22f8.R.inc(331);long skipped = reader.skip(1);
                __CLR4_2_06g6glnxz22f8.R.inc(332);Validate.isTrue(skipped == 1); // WTF if this fails.
            }
            }__CLR4_2_06g6glnxz22f8.R.inc(333);try {
                __CLR4_2_06g6glnxz22f8.R.inc(334);doc = parser.parseInput(reader, baseUri);
            } catch (UncheckedIOException e) {
                // io exception when parsing (not seen before because reading the stream as we go)
                __CLR4_2_06g6glnxz22f8.R.inc(335);throw e.ioException();
            }
            __CLR4_2_06g6glnxz22f8.R.inc(336);Charset charset = Charset.forName(charsetName);
            __CLR4_2_06g6glnxz22f8.R.inc(337);doc.outputSettings().charset(charset);
            __CLR4_2_06g6glnxz22f8.R.inc(338);if ((((!charset.canEncode())&&(__CLR4_2_06g6glnxz22f8.R.iget(339)!=0|true))||(__CLR4_2_06g6glnxz22f8.R.iget(340)==0&false))) {{
                // some charsets can read but not encode; switch to an encodable charset and update the meta el
                __CLR4_2_06g6glnxz22f8.R.inc(341);doc.charset(Charset.forName(defaultCharset));
            }
        }}
        }__CLR4_2_06g6glnxz22f8.R.inc(342);input.close();
        __CLR4_2_06g6glnxz22f8.R.inc(343);return doc;
    }finally{__CLR4_2_06g6glnxz22f8.R.flushNeeded();}}

    /**
     * Read the input stream into a byte buffer. To deal with slow input streams, you may interrupt the thread this
     * method is executing on. The data read until being interrupted will be available.
     * @param inStream the input stream to read from
     * @param maxSize the maximum size in bytes to read from the stream. Set to 0 to be unlimited.
     * @return the filled byte buffer
     * @throws IOException if an exception occurs whilst reading from the input stream.
     */
    public static ByteBuffer readToByteBuffer(InputStream inStream, int maxSize) throws IOException {try{__CLR4_2_06g6glnxz22f8.R.inc(344);
        __CLR4_2_06g6glnxz22f8.R.inc(345);Validate.isTrue(maxSize >= 0, "maxSize must be 0 (unlimited) or larger");
        __CLR4_2_06g6glnxz22f8.R.inc(346);final ConstrainableInputStream input = ConstrainableInputStream.wrap(inStream, bufferSize, maxSize);
        __CLR4_2_06g6glnxz22f8.R.inc(347);return input.readToByteBuffer(maxSize);
    }finally{__CLR4_2_06g6glnxz22f8.R.flushNeeded();}}

    static ByteBuffer emptyByteBuffer() {try{__CLR4_2_06g6glnxz22f8.R.inc(348);
        __CLR4_2_06g6glnxz22f8.R.inc(349);return ByteBuffer.allocate(0);
    }finally{__CLR4_2_06g6glnxz22f8.R.flushNeeded();}}

    /**
     * Parse out a charset from a content type header. If the charset is not supported, returns null (so the default
     * will kick in.)
     * @param contentType e.g. "text/html; charset=EUC-JP"
     * @return "EUC-JP", or null if not found. Charset is trimmed and uppercased.
     */
    static String getCharsetFromContentType(String contentType) {try{__CLR4_2_06g6glnxz22f8.R.inc(350);
        __CLR4_2_06g6glnxz22f8.R.inc(351);if ((((contentType == null)&&(__CLR4_2_06g6glnxz22f8.R.iget(352)!=0|true))||(__CLR4_2_06g6glnxz22f8.R.iget(353)==0&false))) {__CLR4_2_06g6glnxz22f8.R.inc(354);return null;
        }__CLR4_2_06g6glnxz22f8.R.inc(355);Matcher m = charsetPattern.matcher(contentType);
        __CLR4_2_06g6glnxz22f8.R.inc(356);if ((((m.find())&&(__CLR4_2_06g6glnxz22f8.R.iget(357)!=0|true))||(__CLR4_2_06g6glnxz22f8.R.iget(358)==0&false))) {{
            __CLR4_2_06g6glnxz22f8.R.inc(359);String charset = m.group(1).trim();
            __CLR4_2_06g6glnxz22f8.R.inc(360);charset = charset.replace("charset=", "");
            __CLR4_2_06g6glnxz22f8.R.inc(361);return validateCharset(charset);
        }
        }__CLR4_2_06g6glnxz22f8.R.inc(362);return null;
    }finally{__CLR4_2_06g6glnxz22f8.R.flushNeeded();}}

    private static String validateCharset(String cs) {try{__CLR4_2_06g6glnxz22f8.R.inc(363);
        __CLR4_2_06g6glnxz22f8.R.inc(364);if ((((cs == null || cs.length() == 0)&&(__CLR4_2_06g6glnxz22f8.R.iget(365)!=0|true))||(__CLR4_2_06g6glnxz22f8.R.iget(366)==0&false))) {__CLR4_2_06g6glnxz22f8.R.inc(367);return null;
        }__CLR4_2_06g6glnxz22f8.R.inc(368);cs = cs.trim().replaceAll("[\"']", "");
        __CLR4_2_06g6glnxz22f8.R.inc(369);try {
            __CLR4_2_06g6glnxz22f8.R.inc(370);if ((((Charset.isSupported(cs))&&(__CLR4_2_06g6glnxz22f8.R.iget(371)!=0|true))||(__CLR4_2_06g6glnxz22f8.R.iget(372)==0&false))) {__CLR4_2_06g6glnxz22f8.R.inc(373);return cs;
            }__CLR4_2_06g6glnxz22f8.R.inc(374);cs = cs.toUpperCase(Locale.ENGLISH);
            __CLR4_2_06g6glnxz22f8.R.inc(375);if ((((Charset.isSupported(cs))&&(__CLR4_2_06g6glnxz22f8.R.iget(376)!=0|true))||(__CLR4_2_06g6glnxz22f8.R.iget(377)==0&false))) {__CLR4_2_06g6glnxz22f8.R.inc(378);return cs;
        }} catch (IllegalCharsetNameException e) {
            // if our this charset matching fails.... we just take the default
        }
        __CLR4_2_06g6glnxz22f8.R.inc(379);return null;
    }finally{__CLR4_2_06g6glnxz22f8.R.flushNeeded();}}

    /**
     * Creates a random string, suitable for use as a mime boundary
     */
    static String mimeBoundary() {try{__CLR4_2_06g6glnxz22f8.R.inc(380);
        __CLR4_2_06g6glnxz22f8.R.inc(381);final StringBuilder mime = StringUtil.borrowBuilder();
        __CLR4_2_06g6glnxz22f8.R.inc(382);final Random rand = new Random();
        __CLR4_2_06g6glnxz22f8.R.inc(383);for (int i = 0; (((i < boundaryLength)&&(__CLR4_2_06g6glnxz22f8.R.iget(384)!=0|true))||(__CLR4_2_06g6glnxz22f8.R.iget(385)==0&false)); i++) {{
            __CLR4_2_06g6glnxz22f8.R.inc(386);mime.append(mimeBoundaryChars[rand.nextInt(mimeBoundaryChars.length)]);
        }
        }__CLR4_2_06g6glnxz22f8.R.inc(387);return StringUtil.releaseBuilder(mime);
    }finally{__CLR4_2_06g6glnxz22f8.R.flushNeeded();}}

    private static BomCharset detectCharsetFromBom(final ByteBuffer byteData) {try{__CLR4_2_06g6glnxz22f8.R.inc(388);
        __CLR4_2_06g6glnxz22f8.R.inc(389);final Buffer buffer = byteData; // .mark and rewind used to return Buffer, now ByteBuffer, so cast for backward compat
        __CLR4_2_06g6glnxz22f8.R.inc(390);buffer.mark();
        __CLR4_2_06g6glnxz22f8.R.inc(391);byte[] bom = new byte[4];
        __CLR4_2_06g6glnxz22f8.R.inc(392);if ((((byteData.remaining() >= bom.length)&&(__CLR4_2_06g6glnxz22f8.R.iget(393)!=0|true))||(__CLR4_2_06g6glnxz22f8.R.iget(394)==0&false))) {{
            __CLR4_2_06g6glnxz22f8.R.inc(395);byteData.get(bom);
            __CLR4_2_06g6glnxz22f8.R.inc(396);buffer.rewind();
        }
        }__CLR4_2_06g6glnxz22f8.R.inc(397);if ((((bom[0] == 0x00 && bom[1] == 0x00 && bom[2] == (byte) 0xFE && bom[3] == (byte) 0xFF || // BE
            bom[0] == (byte) 0xFF && bom[1] == (byte) 0xFE && bom[2] == 0x00 && bom[3] == 0x00)&&(__CLR4_2_06g6glnxz22f8.R.iget(398)!=0|true))||(__CLR4_2_06g6glnxz22f8.R.iget(399)==0&false))) {{ // LE
            __CLR4_2_06g6glnxz22f8.R.inc(400);return new BomCharset("UTF-32", false); // and I hope it's on your system
        } }else {__CLR4_2_06g6glnxz22f8.R.inc(401);if ((((bom[0] == (byte) 0xFE && bom[1] == (byte) 0xFF || // BE
            bom[0] == (byte) 0xFF && bom[1] == (byte) 0xFE)&&(__CLR4_2_06g6glnxz22f8.R.iget(402)!=0|true))||(__CLR4_2_06g6glnxz22f8.R.iget(403)==0&false))) {{
            __CLR4_2_06g6glnxz22f8.R.inc(404);return new BomCharset("UTF-16", false); // in all Javas
        } }else {__CLR4_2_06g6glnxz22f8.R.inc(405);if ((((bom[0] == (byte) 0xEF && bom[1] == (byte) 0xBB && bom[2] == (byte) 0xBF)&&(__CLR4_2_06g6glnxz22f8.R.iget(406)!=0|true))||(__CLR4_2_06g6glnxz22f8.R.iget(407)==0&false))) {{
            __CLR4_2_06g6glnxz22f8.R.inc(408);return new BomCharset("UTF-8", true); // in all Javas
            // 16 and 32 decoders consume the BOM to determine be/le; utf-8 should be consumed here
        }
        }}}__CLR4_2_06g6glnxz22f8.R.inc(409);return null;
    }finally{__CLR4_2_06g6glnxz22f8.R.flushNeeded();}}

    private static class BomCharset {
        private final String charset;
        private final boolean offset;

        public BomCharset(String charset, boolean offset) {try{__CLR4_2_06g6glnxz22f8.R.inc(410);
            __CLR4_2_06g6glnxz22f8.R.inc(411);this.charset = charset;
            __CLR4_2_06g6glnxz22f8.R.inc(412);this.offset = offset;
        }finally{__CLR4_2_06g6glnxz22f8.R.flushNeeded();}}
    }
}
