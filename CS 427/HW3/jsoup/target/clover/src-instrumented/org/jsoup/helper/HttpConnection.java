/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.internal.ConstrainableInputStream;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.TokenQueue;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

import static org.jsoup.Connection.Method.HEAD;
import static org.jsoup.internal.Normalizer.lowerCase;

/**
 * Implementation of {@link Connection}.
 * @see org.jsoup.Jsoup#connect(String)
 */
public class HttpConnection implements Connection {public static class __CLR4_2_0bhbhlnxz22gh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,1208,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String CONTENT_ENCODING = "Content-Encoding";
    /**
     * Many users would get caught by not setting a user-agent and therefore getting different responses on their desktop
     * vs in jsoup, which would otherwise default to {@code Java}. So by default, use a desktop UA.
     */
    public static final String DEFAULT_UA =
        "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36";
    private static final String USER_AGENT = "User-Agent";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String MULTIPART_FORM_DATA = "multipart/form-data";
    public static final String FORM_URL_ENCODED = "application/x-www-form-urlencoded";
    private static final int HTTP_TEMP_REDIR = 307; // http/1.1 temporary redirect, not in Java's set.
    private static final String DefaultUploadType = "application/octet-stream";

    public static Connection connect(String url) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(413);
        __CLR4_2_0bhbhlnxz22gh.R.inc(414);Connection con = new HttpConnection();
        __CLR4_2_0bhbhlnxz22gh.R.inc(415);con.url(url);
        __CLR4_2_0bhbhlnxz22gh.R.inc(416);return con;
    }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    public static Connection connect(URL url) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(417);
        __CLR4_2_0bhbhlnxz22gh.R.inc(418);Connection con = new HttpConnection();
        __CLR4_2_0bhbhlnxz22gh.R.inc(419);con.url(url);
        __CLR4_2_0bhbhlnxz22gh.R.inc(420);return con;
    }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    public HttpConnection() {try{__CLR4_2_0bhbhlnxz22gh.R.inc(421);
        __CLR4_2_0bhbhlnxz22gh.R.inc(422);req = new Request();
        __CLR4_2_0bhbhlnxz22gh.R.inc(423);res = new Response();
    }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    /**
     * Encodes the input URL into a safe ASCII URL string
     * @param url unescaped URL
     * @return escaped URL
     */
	private static String encodeUrl(String url) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(424);
        __CLR4_2_0bhbhlnxz22gh.R.inc(425);try {
            __CLR4_2_0bhbhlnxz22gh.R.inc(426);URL u = new URL(url);
            __CLR4_2_0bhbhlnxz22gh.R.inc(427);return encodeUrl(u).toExternalForm();
        } catch (Exception e) {
            __CLR4_2_0bhbhlnxz22gh.R.inc(428);return url;
        }
	}finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    static URL encodeUrl(URL u) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(429);
        __CLR4_2_0bhbhlnxz22gh.R.inc(430);try {
            //  odd way to encode urls, but it works!
            __CLR4_2_0bhbhlnxz22gh.R.inc(431);String urlS = u.toExternalForm(); // URL external form may have spaces which is illegal in new URL() (odd asymmetry)
            __CLR4_2_0bhbhlnxz22gh.R.inc(432);urlS = urlS.replaceAll(" ", "%20");
            __CLR4_2_0bhbhlnxz22gh.R.inc(433);final URI uri = new URI(urlS);
            __CLR4_2_0bhbhlnxz22gh.R.inc(434);return new URL(uri.toASCIIString());
        } catch (URISyntaxException | MalformedURLException e) {
            // give up and return the original input
            __CLR4_2_0bhbhlnxz22gh.R.inc(435);return u;
        }
    }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    private static String encodeMimeName(String val) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(436);
        __CLR4_2_0bhbhlnxz22gh.R.inc(437);if ((((val == null)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(438)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(439)==0&false)))
            {__CLR4_2_0bhbhlnxz22gh.R.inc(440);return null;
        }__CLR4_2_0bhbhlnxz22gh.R.inc(441);return val.replaceAll("\"", "%22");
    }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    private Connection.Request req;
    private Connection.Response res;

    public Connection url(URL url) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(442);
        __CLR4_2_0bhbhlnxz22gh.R.inc(443);req.url(url);
        __CLR4_2_0bhbhlnxz22gh.R.inc(444);return this;
    }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    public Connection url(String url) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(445);
        __CLR4_2_0bhbhlnxz22gh.R.inc(446);Validate.notEmpty(url, "Must supply a valid URL");
        __CLR4_2_0bhbhlnxz22gh.R.inc(447);try {
            __CLR4_2_0bhbhlnxz22gh.R.inc(448);req.url(new URL(encodeUrl(url)));
        } catch (MalformedURLException e) {
            __CLR4_2_0bhbhlnxz22gh.R.inc(449);throw new IllegalArgumentException("Malformed URL: " + url, e);
        }
        __CLR4_2_0bhbhlnxz22gh.R.inc(450);return this;
    }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    public Connection proxy(Proxy proxy) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(451);
        __CLR4_2_0bhbhlnxz22gh.R.inc(452);req.proxy(proxy);
        __CLR4_2_0bhbhlnxz22gh.R.inc(453);return this;
    }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    public Connection proxy(String host, int port) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(454);
        __CLR4_2_0bhbhlnxz22gh.R.inc(455);req.proxy(host, port);
        __CLR4_2_0bhbhlnxz22gh.R.inc(456);return this;
    }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    public Connection userAgent(String userAgent) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(457);
        __CLR4_2_0bhbhlnxz22gh.R.inc(458);Validate.notNull(userAgent, "User agent must not be null");
        __CLR4_2_0bhbhlnxz22gh.R.inc(459);req.header(USER_AGENT, userAgent);
        __CLR4_2_0bhbhlnxz22gh.R.inc(460);return this;
    }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    public Connection timeout(int millis) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(461);
        __CLR4_2_0bhbhlnxz22gh.R.inc(462);req.timeout(millis);
        __CLR4_2_0bhbhlnxz22gh.R.inc(463);return this;
    }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    public Connection maxBodySize(int bytes) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(464);
        __CLR4_2_0bhbhlnxz22gh.R.inc(465);req.maxBodySize(bytes);
        __CLR4_2_0bhbhlnxz22gh.R.inc(466);return this;
    }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    public Connection followRedirects(boolean followRedirects) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(467);
        __CLR4_2_0bhbhlnxz22gh.R.inc(468);req.followRedirects(followRedirects);
        __CLR4_2_0bhbhlnxz22gh.R.inc(469);return this;
    }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    public Connection referrer(String referrer) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(470);
        __CLR4_2_0bhbhlnxz22gh.R.inc(471);Validate.notNull(referrer, "Referrer must not be null");
        __CLR4_2_0bhbhlnxz22gh.R.inc(472);req.header("Referer", referrer);
        __CLR4_2_0bhbhlnxz22gh.R.inc(473);return this;
    }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    public Connection method(Method method) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(474);
        __CLR4_2_0bhbhlnxz22gh.R.inc(475);req.method(method);
        __CLR4_2_0bhbhlnxz22gh.R.inc(476);return this;
    }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    public Connection ignoreHttpErrors(boolean ignoreHttpErrors) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(477);
		__CLR4_2_0bhbhlnxz22gh.R.inc(478);req.ignoreHttpErrors(ignoreHttpErrors);
		__CLR4_2_0bhbhlnxz22gh.R.inc(479);return this;
	}finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    public Connection ignoreContentType(boolean ignoreContentType) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(480);
        __CLR4_2_0bhbhlnxz22gh.R.inc(481);req.ignoreContentType(ignoreContentType);
        __CLR4_2_0bhbhlnxz22gh.R.inc(482);return this;
    }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}


    public Connection data(String key, String value) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(483);
        __CLR4_2_0bhbhlnxz22gh.R.inc(484);req.data(KeyVal.create(key, value));
        __CLR4_2_0bhbhlnxz22gh.R.inc(485);return this;
    }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    public Connection sslSocketFactory(SSLSocketFactory sslSocketFactory) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(486);
	    __CLR4_2_0bhbhlnxz22gh.R.inc(487);req.sslSocketFactory(sslSocketFactory);
	    __CLR4_2_0bhbhlnxz22gh.R.inc(488);return this;
    }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    public Connection data(String key, String filename, InputStream inputStream) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(489);
        __CLR4_2_0bhbhlnxz22gh.R.inc(490);req.data(KeyVal.create(key, filename, inputStream));
        __CLR4_2_0bhbhlnxz22gh.R.inc(491);return this;
    }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    @Override
    public Connection data(String key, String filename, InputStream inputStream, String contentType) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(492);
        __CLR4_2_0bhbhlnxz22gh.R.inc(493);req.data(KeyVal.create(key, filename, inputStream).contentType(contentType));
        __CLR4_2_0bhbhlnxz22gh.R.inc(494);return this;
    }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    public Connection data(Map<String, String> data) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(495);
        __CLR4_2_0bhbhlnxz22gh.R.inc(496);Validate.notNull(data, "Data map must not be null");
        __CLR4_2_0bhbhlnxz22gh.R.inc(497);for (Map.Entry<String, String> entry : data.entrySet()) {{
            __CLR4_2_0bhbhlnxz22gh.R.inc(498);req.data(KeyVal.create(entry.getKey(), entry.getValue()));
        }
        }__CLR4_2_0bhbhlnxz22gh.R.inc(499);return this;
    }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    public Connection data(String... keyvals) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(500);
        __CLR4_2_0bhbhlnxz22gh.R.inc(501);Validate.notNull(keyvals, "Data key value pairs must not be null");
        __CLR4_2_0bhbhlnxz22gh.R.inc(502);Validate.isTrue(keyvals.length %2 == 0, "Must supply an even number of key value pairs");
        __CLR4_2_0bhbhlnxz22gh.R.inc(503);for (int i = 0; (((i < keyvals.length)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(504)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(505)==0&false)); i += 2) {{
            __CLR4_2_0bhbhlnxz22gh.R.inc(506);String key = keyvals[i];
            __CLR4_2_0bhbhlnxz22gh.R.inc(507);String value = keyvals[i+1];
            __CLR4_2_0bhbhlnxz22gh.R.inc(508);Validate.notEmpty(key, "Data key must not be empty");
            __CLR4_2_0bhbhlnxz22gh.R.inc(509);Validate.notNull(value, "Data value must not be null");
            __CLR4_2_0bhbhlnxz22gh.R.inc(510);req.data(KeyVal.create(key, value));
        }
        }__CLR4_2_0bhbhlnxz22gh.R.inc(511);return this;
    }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    public Connection data(Collection<Connection.KeyVal> data) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(512);
        __CLR4_2_0bhbhlnxz22gh.R.inc(513);Validate.notNull(data, "Data collection must not be null");
        __CLR4_2_0bhbhlnxz22gh.R.inc(514);for (Connection.KeyVal entry: data) {{
            __CLR4_2_0bhbhlnxz22gh.R.inc(515);req.data(entry);
        }
        }__CLR4_2_0bhbhlnxz22gh.R.inc(516);return this;
    }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    public Connection.KeyVal data(String key) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(517);
        __CLR4_2_0bhbhlnxz22gh.R.inc(518);Validate.notEmpty(key, "Data key must not be empty");
        __CLR4_2_0bhbhlnxz22gh.R.inc(519);for (Connection.KeyVal keyVal : request().data()) {{
            __CLR4_2_0bhbhlnxz22gh.R.inc(520);if ((((keyVal.key().equals(key))&&(__CLR4_2_0bhbhlnxz22gh.R.iget(521)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(522)==0&false)))
                {__CLR4_2_0bhbhlnxz22gh.R.inc(523);return keyVal;
        }}
        }__CLR4_2_0bhbhlnxz22gh.R.inc(524);return null;
    }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    public Connection requestBody(String body) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(525);
        __CLR4_2_0bhbhlnxz22gh.R.inc(526);req.requestBody(body);
        __CLR4_2_0bhbhlnxz22gh.R.inc(527);return this;
    }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    public Connection header(String name, String value) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(528);
        __CLR4_2_0bhbhlnxz22gh.R.inc(529);req.header(name, value);
        __CLR4_2_0bhbhlnxz22gh.R.inc(530);return this;
    }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    public Connection headers(Map<String,String> headers) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(531);
        __CLR4_2_0bhbhlnxz22gh.R.inc(532);Validate.notNull(headers, "Header map must not be null");
        __CLR4_2_0bhbhlnxz22gh.R.inc(533);for (Map.Entry<String,String> entry : headers.entrySet()) {{
            __CLR4_2_0bhbhlnxz22gh.R.inc(534);req.header(entry.getKey(),entry.getValue());
        }
        }__CLR4_2_0bhbhlnxz22gh.R.inc(535);return this;
    }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    public Connection cookie(String name, String value) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(536);
        __CLR4_2_0bhbhlnxz22gh.R.inc(537);req.cookie(name, value);
        __CLR4_2_0bhbhlnxz22gh.R.inc(538);return this;
    }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    public Connection cookies(Map<String, String> cookies) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(539);
        __CLR4_2_0bhbhlnxz22gh.R.inc(540);Validate.notNull(cookies, "Cookie map must not be null");
        __CLR4_2_0bhbhlnxz22gh.R.inc(541);for (Map.Entry<String, String> entry : cookies.entrySet()) {{
            __CLR4_2_0bhbhlnxz22gh.R.inc(542);req.cookie(entry.getKey(), entry.getValue());
        }
        }__CLR4_2_0bhbhlnxz22gh.R.inc(543);return this;
    }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    public Connection parser(Parser parser) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(544);
        __CLR4_2_0bhbhlnxz22gh.R.inc(545);req.parser(parser);
        __CLR4_2_0bhbhlnxz22gh.R.inc(546);return this;
    }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    public Document get() throws IOException {try{__CLR4_2_0bhbhlnxz22gh.R.inc(547);
        __CLR4_2_0bhbhlnxz22gh.R.inc(548);req.method(Method.GET);
        __CLR4_2_0bhbhlnxz22gh.R.inc(549);execute();
        __CLR4_2_0bhbhlnxz22gh.R.inc(550);return res.parse();
    }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    public Document post() throws IOException {try{__CLR4_2_0bhbhlnxz22gh.R.inc(551);
        __CLR4_2_0bhbhlnxz22gh.R.inc(552);req.method(Method.POST);
        __CLR4_2_0bhbhlnxz22gh.R.inc(553);execute();
        __CLR4_2_0bhbhlnxz22gh.R.inc(554);return res.parse();
    }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    public Connection.Response execute() throws IOException {try{__CLR4_2_0bhbhlnxz22gh.R.inc(555);
        __CLR4_2_0bhbhlnxz22gh.R.inc(556);res = Response.execute(req);
        __CLR4_2_0bhbhlnxz22gh.R.inc(557);return res;
    }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    public Connection.Request request() {try{__CLR4_2_0bhbhlnxz22gh.R.inc(558);
        __CLR4_2_0bhbhlnxz22gh.R.inc(559);return req;
    }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    public Connection request(Connection.Request request) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(560);
        __CLR4_2_0bhbhlnxz22gh.R.inc(561);req = request;
        __CLR4_2_0bhbhlnxz22gh.R.inc(562);return this;
    }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    public Connection.Response response() {try{__CLR4_2_0bhbhlnxz22gh.R.inc(563);
        __CLR4_2_0bhbhlnxz22gh.R.inc(564);return res;
    }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    public Connection response(Connection.Response response) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(565);
        __CLR4_2_0bhbhlnxz22gh.R.inc(566);res = response;
        __CLR4_2_0bhbhlnxz22gh.R.inc(567);return this;
    }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    public Connection postDataCharset(String charset) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(568);
        __CLR4_2_0bhbhlnxz22gh.R.inc(569);req.postDataCharset(charset);
        __CLR4_2_0bhbhlnxz22gh.R.inc(570);return this;
    }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    @SuppressWarnings({"unchecked"})
    private static abstract class Base<T extends Connection.Base> implements Connection.Base<T> {
        URL url;
        Method method;
        Map<String, List<String>> headers;
        Map<String, String> cookies;

        private Base() {try{__CLR4_2_0bhbhlnxz22gh.R.inc(571);
            __CLR4_2_0bhbhlnxz22gh.R.inc(572);headers = new LinkedHashMap<>();
            __CLR4_2_0bhbhlnxz22gh.R.inc(573);cookies = new LinkedHashMap<>();
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public URL url() {try{__CLR4_2_0bhbhlnxz22gh.R.inc(574);
            __CLR4_2_0bhbhlnxz22gh.R.inc(575);return url;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public T url(URL url) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(576);
            __CLR4_2_0bhbhlnxz22gh.R.inc(577);Validate.notNull(url, "URL must not be null");
            __CLR4_2_0bhbhlnxz22gh.R.inc(578);this.url = url;
            __CLR4_2_0bhbhlnxz22gh.R.inc(579);return (T) this;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public Method method() {try{__CLR4_2_0bhbhlnxz22gh.R.inc(580);
            __CLR4_2_0bhbhlnxz22gh.R.inc(581);return method;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public T method(Method method) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(582);
            __CLR4_2_0bhbhlnxz22gh.R.inc(583);Validate.notNull(method, "Method must not be null");
            __CLR4_2_0bhbhlnxz22gh.R.inc(584);this.method = method;
            __CLR4_2_0bhbhlnxz22gh.R.inc(585);return (T) this;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public String header(String name) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(586);
            __CLR4_2_0bhbhlnxz22gh.R.inc(587);Validate.notNull(name, "Header name must not be null");
            __CLR4_2_0bhbhlnxz22gh.R.inc(588);List<String> vals = getHeadersCaseInsensitive(name);
            __CLR4_2_0bhbhlnxz22gh.R.inc(589);if ((((vals.size() > 0)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(590)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(591)==0&false))) {{
                // https://www.w3.org/Protocols/rfc2616/rfc2616-sec4.html#sec4.2
                __CLR4_2_0bhbhlnxz22gh.R.inc(592);return StringUtil.join(vals, ", ");
            }

            }__CLR4_2_0bhbhlnxz22gh.R.inc(593);return null;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        @Override
        public T addHeader(String name, String value) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(594);
            __CLR4_2_0bhbhlnxz22gh.R.inc(595);Validate.notEmpty(name);
            __CLR4_2_0bhbhlnxz22gh.R.inc(596);value = (((value == null )&&(__CLR4_2_0bhbhlnxz22gh.R.iget(597)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(598)==0&false))? "" : value;

            __CLR4_2_0bhbhlnxz22gh.R.inc(599);List<String> values = headers(name);
            __CLR4_2_0bhbhlnxz22gh.R.inc(600);if ((((values.isEmpty())&&(__CLR4_2_0bhbhlnxz22gh.R.iget(601)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(602)==0&false))) {{
                __CLR4_2_0bhbhlnxz22gh.R.inc(603);values = new ArrayList<>();
                __CLR4_2_0bhbhlnxz22gh.R.inc(604);headers.put(name, values);
            }
            }__CLR4_2_0bhbhlnxz22gh.R.inc(605);values.add(fixHeaderEncoding(value));

            __CLR4_2_0bhbhlnxz22gh.R.inc(606);return (T) this;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        @Override
        public List<String> headers(String name) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(607);
            __CLR4_2_0bhbhlnxz22gh.R.inc(608);Validate.notEmpty(name);
            __CLR4_2_0bhbhlnxz22gh.R.inc(609);return getHeadersCaseInsensitive(name);
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        private static String fixHeaderEncoding(String val) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(610);
            __CLR4_2_0bhbhlnxz22gh.R.inc(611);try {
                __CLR4_2_0bhbhlnxz22gh.R.inc(612);byte[] bytes = val.getBytes("ISO-8859-1");
                __CLR4_2_0bhbhlnxz22gh.R.inc(613);if ((((!looksLikeUtf8(bytes))&&(__CLR4_2_0bhbhlnxz22gh.R.iget(614)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(615)==0&false)))
                    {__CLR4_2_0bhbhlnxz22gh.R.inc(616);return val;
                }__CLR4_2_0bhbhlnxz22gh.R.inc(617);return new String(bytes, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                // shouldn't happen as these both always exist
                __CLR4_2_0bhbhlnxz22gh.R.inc(618);return val;
            }
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        private static boolean looksLikeUtf8(byte[] input) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(619);
            __CLR4_2_0bhbhlnxz22gh.R.inc(620);int i = 0;
            // BOM:
            __CLR4_2_0bhbhlnxz22gh.R.inc(621);if ((((input.length >= 3 && (input[0] & 0xFF) == 0xEF
                && (input[1] & 0xFF) == 0xBB & (input[2] & 0xFF) == 0xBF)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(622)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(623)==0&false))) {{
                __CLR4_2_0bhbhlnxz22gh.R.inc(624);i = 3;
            }

            }__CLR4_2_0bhbhlnxz22gh.R.inc(625);int end;
            __CLR4_2_0bhbhlnxz22gh.R.inc(626);for (int j = input.length; (((i < j)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(627)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(628)==0&false)); ++i) {{
                __CLR4_2_0bhbhlnxz22gh.R.inc(629);int o = input[i];
                __CLR4_2_0bhbhlnxz22gh.R.inc(630);if (((((o & 0x80) == 0)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(631)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(632)==0&false))) {{
                    __CLR4_2_0bhbhlnxz22gh.R.inc(633);continue; // ASCII
                }

                // UTF-8 leading:
                }__CLR4_2_0bhbhlnxz22gh.R.inc(634);if (((((o & 0xE0) == 0xC0)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(635)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(636)==0&false))) {{
                    __CLR4_2_0bhbhlnxz22gh.R.inc(637);end = i + 1;
                } }else {__CLR4_2_0bhbhlnxz22gh.R.inc(638);if (((((o & 0xF0) == 0xE0)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(639)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(640)==0&false))) {{
                    __CLR4_2_0bhbhlnxz22gh.R.inc(641);end = i + 2;
                } }else {__CLR4_2_0bhbhlnxz22gh.R.inc(642);if (((((o & 0xF8) == 0xF0)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(643)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(644)==0&false))) {{
                    __CLR4_2_0bhbhlnxz22gh.R.inc(645);end = i + 3;
                } }else {{
                    __CLR4_2_0bhbhlnxz22gh.R.inc(646);return false;
                }

                }}}__CLR4_2_0bhbhlnxz22gh.R.inc(647);if ((((end >= input.length)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(648)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(649)==0&false)))
                    {__CLR4_2_0bhbhlnxz22gh.R.inc(650);return false;

                }__CLR4_2_0bhbhlnxz22gh.R.inc(651);while ((((i < end)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(652)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(653)==0&false))) {{
                    __CLR4_2_0bhbhlnxz22gh.R.inc(654);i++;
                    __CLR4_2_0bhbhlnxz22gh.R.inc(655);o = input[i];
                    __CLR4_2_0bhbhlnxz22gh.R.inc(656);if (((((o & 0xC0) != 0x80)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(657)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(658)==0&false))) {{
                        __CLR4_2_0bhbhlnxz22gh.R.inc(659);return false;
                    }
                }}
            }}
            }__CLR4_2_0bhbhlnxz22gh.R.inc(660);return true;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public T header(String name, String value) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(661);
            __CLR4_2_0bhbhlnxz22gh.R.inc(662);Validate.notEmpty(name, "Header name must not be empty");
            __CLR4_2_0bhbhlnxz22gh.R.inc(663);removeHeader(name); // ensures we don't get an "accept-encoding" and a "Accept-Encoding"
            __CLR4_2_0bhbhlnxz22gh.R.inc(664);addHeader(name, value);
            __CLR4_2_0bhbhlnxz22gh.R.inc(665);return (T) this;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public boolean hasHeader(String name) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(666);
            __CLR4_2_0bhbhlnxz22gh.R.inc(667);Validate.notEmpty(name, "Header name must not be empty");
            __CLR4_2_0bhbhlnxz22gh.R.inc(668);return !getHeadersCaseInsensitive(name).isEmpty();
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        /**
         * Test if the request has a header with this value (case insensitive).
         */
        public boolean hasHeaderWithValue(String name, String value) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(669);
            __CLR4_2_0bhbhlnxz22gh.R.inc(670);Validate.notEmpty(name);
            __CLR4_2_0bhbhlnxz22gh.R.inc(671);Validate.notEmpty(value);
            __CLR4_2_0bhbhlnxz22gh.R.inc(672);List<String> values = headers(name);
            __CLR4_2_0bhbhlnxz22gh.R.inc(673);for (String candidate : values) {{
                __CLR4_2_0bhbhlnxz22gh.R.inc(674);if ((((value.equalsIgnoreCase(candidate))&&(__CLR4_2_0bhbhlnxz22gh.R.iget(675)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(676)==0&false)))
                    {__CLR4_2_0bhbhlnxz22gh.R.inc(677);return true;
            }}
            }__CLR4_2_0bhbhlnxz22gh.R.inc(678);return false;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public T removeHeader(String name) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(679);
            __CLR4_2_0bhbhlnxz22gh.R.inc(680);Validate.notEmpty(name, "Header name must not be empty");
            __CLR4_2_0bhbhlnxz22gh.R.inc(681);Map.Entry<String, List<String>> entry = scanHeaders(name); // remove is case insensitive too
            __CLR4_2_0bhbhlnxz22gh.R.inc(682);if ((((entry != null)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(683)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(684)==0&false)))
                {__CLR4_2_0bhbhlnxz22gh.R.inc(685);headers.remove(entry.getKey()); // ensures correct case
            }__CLR4_2_0bhbhlnxz22gh.R.inc(686);return (T) this;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public Map<String, String> headers() {try{__CLR4_2_0bhbhlnxz22gh.R.inc(687);
            __CLR4_2_0bhbhlnxz22gh.R.inc(688);LinkedHashMap<String, String> map = new LinkedHashMap<>(headers.size());
            __CLR4_2_0bhbhlnxz22gh.R.inc(689);for (Map.Entry<String, List<String>> entry : headers.entrySet()) {{
                __CLR4_2_0bhbhlnxz22gh.R.inc(690);String header = entry.getKey();
                __CLR4_2_0bhbhlnxz22gh.R.inc(691);List<String> values = entry.getValue();
                __CLR4_2_0bhbhlnxz22gh.R.inc(692);if ((((values.size() > 0)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(693)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(694)==0&false)))
                    {__CLR4_2_0bhbhlnxz22gh.R.inc(695);map.put(header, values.get(0));
            }}
            }__CLR4_2_0bhbhlnxz22gh.R.inc(696);return map;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        @Override
        public Map<String, List<String>> multiHeaders() {try{__CLR4_2_0bhbhlnxz22gh.R.inc(697);
            __CLR4_2_0bhbhlnxz22gh.R.inc(698);return headers;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        private List<String> getHeadersCaseInsensitive(String name) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(699);
            __CLR4_2_0bhbhlnxz22gh.R.inc(700);Validate.notNull(name);

            __CLR4_2_0bhbhlnxz22gh.R.inc(701);for (Map.Entry<String, List<String>> entry : headers.entrySet()) {{
                __CLR4_2_0bhbhlnxz22gh.R.inc(702);if ((((name.equalsIgnoreCase(entry.getKey()))&&(__CLR4_2_0bhbhlnxz22gh.R.iget(703)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(704)==0&false)))
                    {__CLR4_2_0bhbhlnxz22gh.R.inc(705);return entry.getValue();
            }}

            }__CLR4_2_0bhbhlnxz22gh.R.inc(706);return Collections.emptyList();
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        private Map.Entry<String, List<String>> scanHeaders(String name) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(707);
            __CLR4_2_0bhbhlnxz22gh.R.inc(708);String lc = lowerCase(name);
            __CLR4_2_0bhbhlnxz22gh.R.inc(709);for (Map.Entry<String, List<String>> entry : headers.entrySet()) {{
                __CLR4_2_0bhbhlnxz22gh.R.inc(710);if ((((lowerCase(entry.getKey()).equals(lc))&&(__CLR4_2_0bhbhlnxz22gh.R.iget(711)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(712)==0&false)))
                    {__CLR4_2_0bhbhlnxz22gh.R.inc(713);return entry;
            }}
            }__CLR4_2_0bhbhlnxz22gh.R.inc(714);return null;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public String cookie(String name) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(715);
            __CLR4_2_0bhbhlnxz22gh.R.inc(716);Validate.notEmpty(name, "Cookie name must not be empty");
            __CLR4_2_0bhbhlnxz22gh.R.inc(717);return cookies.get(name);
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public T cookie(String name, String value) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(718);
            __CLR4_2_0bhbhlnxz22gh.R.inc(719);Validate.notEmpty(name, "Cookie name must not be empty");
            __CLR4_2_0bhbhlnxz22gh.R.inc(720);Validate.notNull(value, "Cookie value must not be null");
            __CLR4_2_0bhbhlnxz22gh.R.inc(721);cookies.put(name, value);
            __CLR4_2_0bhbhlnxz22gh.R.inc(722);return (T) this;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public boolean hasCookie(String name) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(723);
            __CLR4_2_0bhbhlnxz22gh.R.inc(724);Validate.notEmpty(name, "Cookie name must not be empty");
            __CLR4_2_0bhbhlnxz22gh.R.inc(725);return cookies.containsKey(name);
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public T removeCookie(String name) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(726);
            __CLR4_2_0bhbhlnxz22gh.R.inc(727);Validate.notEmpty(name, "Cookie name must not be empty");
            __CLR4_2_0bhbhlnxz22gh.R.inc(728);cookies.remove(name);
            __CLR4_2_0bhbhlnxz22gh.R.inc(729);return (T) this;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public Map<String, String> cookies() {try{__CLR4_2_0bhbhlnxz22gh.R.inc(730);
            __CLR4_2_0bhbhlnxz22gh.R.inc(731);return cookies;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}
    }

    public static class Request extends HttpConnection.Base<Connection.Request> implements Connection.Request {
        private Proxy proxy; // nullable
        private int timeoutMilliseconds;
        private int maxBodySizeBytes;
        private boolean followRedirects;
        private Collection<Connection.KeyVal> data;
        private String body = null;
        private boolean ignoreHttpErrors = false;
        private boolean ignoreContentType = false;
        private Parser parser;
        private boolean parserDefined = false; // called parser(...) vs initialized in ctor
        private String postDataCharset = DataUtil.defaultCharset;
        private SSLSocketFactory sslSocketFactory;

        Request() {try{__CLR4_2_0bhbhlnxz22gh.R.inc(732);
            __CLR4_2_0bhbhlnxz22gh.R.inc(733);timeoutMilliseconds = 30000; // 30 seconds
            __CLR4_2_0bhbhlnxz22gh.R.inc(734);maxBodySizeBytes = 1024 * 1024; // 1MB
            __CLR4_2_0bhbhlnxz22gh.R.inc(735);followRedirects = true;
            __CLR4_2_0bhbhlnxz22gh.R.inc(736);data = new ArrayList<>();
            __CLR4_2_0bhbhlnxz22gh.R.inc(737);method = Method.GET;
            __CLR4_2_0bhbhlnxz22gh.R.inc(738);addHeader("Accept-Encoding", "gzip");
            __CLR4_2_0bhbhlnxz22gh.R.inc(739);addHeader(USER_AGENT, DEFAULT_UA);
            __CLR4_2_0bhbhlnxz22gh.R.inc(740);parser = Parser.htmlParser();
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public Proxy proxy() {try{__CLR4_2_0bhbhlnxz22gh.R.inc(741);
            __CLR4_2_0bhbhlnxz22gh.R.inc(742);return proxy;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public Request proxy(Proxy proxy) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(743);
            __CLR4_2_0bhbhlnxz22gh.R.inc(744);this.proxy = proxy;
            __CLR4_2_0bhbhlnxz22gh.R.inc(745);return this;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public Request proxy(String host, int port) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(746);
            __CLR4_2_0bhbhlnxz22gh.R.inc(747);this.proxy = new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved(host, port));
            __CLR4_2_0bhbhlnxz22gh.R.inc(748);return this;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public int timeout() {try{__CLR4_2_0bhbhlnxz22gh.R.inc(749);
            __CLR4_2_0bhbhlnxz22gh.R.inc(750);return timeoutMilliseconds;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public Request timeout(int millis) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(751);
            __CLR4_2_0bhbhlnxz22gh.R.inc(752);Validate.isTrue(millis >= 0, "Timeout milliseconds must be 0 (infinite) or greater");
            __CLR4_2_0bhbhlnxz22gh.R.inc(753);timeoutMilliseconds = millis;
            __CLR4_2_0bhbhlnxz22gh.R.inc(754);return this;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public int maxBodySize() {try{__CLR4_2_0bhbhlnxz22gh.R.inc(755);
            __CLR4_2_0bhbhlnxz22gh.R.inc(756);return maxBodySizeBytes;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public Connection.Request maxBodySize(int bytes) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(757);
            __CLR4_2_0bhbhlnxz22gh.R.inc(758);Validate.isTrue(bytes >= 0, "maxSize must be 0 (unlimited) or larger");
            __CLR4_2_0bhbhlnxz22gh.R.inc(759);maxBodySizeBytes = bytes;
            __CLR4_2_0bhbhlnxz22gh.R.inc(760);return this;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public boolean followRedirects() {try{__CLR4_2_0bhbhlnxz22gh.R.inc(761);
            __CLR4_2_0bhbhlnxz22gh.R.inc(762);return followRedirects;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public Connection.Request followRedirects(boolean followRedirects) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(763);
            __CLR4_2_0bhbhlnxz22gh.R.inc(764);this.followRedirects = followRedirects;
            __CLR4_2_0bhbhlnxz22gh.R.inc(765);return this;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public boolean ignoreHttpErrors() {try{__CLR4_2_0bhbhlnxz22gh.R.inc(766);
            __CLR4_2_0bhbhlnxz22gh.R.inc(767);return ignoreHttpErrors;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public SSLSocketFactory sslSocketFactory() {try{__CLR4_2_0bhbhlnxz22gh.R.inc(768);
            __CLR4_2_0bhbhlnxz22gh.R.inc(769);return sslSocketFactory;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public void sslSocketFactory(SSLSocketFactory sslSocketFactory) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(770);
            __CLR4_2_0bhbhlnxz22gh.R.inc(771);this.sslSocketFactory = sslSocketFactory;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public Connection.Request ignoreHttpErrors(boolean ignoreHttpErrors) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(772);
            __CLR4_2_0bhbhlnxz22gh.R.inc(773);this.ignoreHttpErrors = ignoreHttpErrors;
            __CLR4_2_0bhbhlnxz22gh.R.inc(774);return this;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public boolean ignoreContentType() {try{__CLR4_2_0bhbhlnxz22gh.R.inc(775);
            __CLR4_2_0bhbhlnxz22gh.R.inc(776);return ignoreContentType;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public Connection.Request ignoreContentType(boolean ignoreContentType) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(777);
            __CLR4_2_0bhbhlnxz22gh.R.inc(778);this.ignoreContentType = ignoreContentType;
            __CLR4_2_0bhbhlnxz22gh.R.inc(779);return this;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public Request data(Connection.KeyVal keyval) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(780);
            __CLR4_2_0bhbhlnxz22gh.R.inc(781);Validate.notNull(keyval, "Key val must not be null");
            __CLR4_2_0bhbhlnxz22gh.R.inc(782);data.add(keyval);
            __CLR4_2_0bhbhlnxz22gh.R.inc(783);return this;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public Collection<Connection.KeyVal> data() {try{__CLR4_2_0bhbhlnxz22gh.R.inc(784);
            __CLR4_2_0bhbhlnxz22gh.R.inc(785);return data;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public Connection.Request requestBody(String body) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(786);
            __CLR4_2_0bhbhlnxz22gh.R.inc(787);this.body = body;
            __CLR4_2_0bhbhlnxz22gh.R.inc(788);return this;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public String requestBody() {try{__CLR4_2_0bhbhlnxz22gh.R.inc(789);
            __CLR4_2_0bhbhlnxz22gh.R.inc(790);return body;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public Request parser(Parser parser) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(791);
            __CLR4_2_0bhbhlnxz22gh.R.inc(792);this.parser = parser;
            __CLR4_2_0bhbhlnxz22gh.R.inc(793);parserDefined = true;
            __CLR4_2_0bhbhlnxz22gh.R.inc(794);return this;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public Parser parser() {try{__CLR4_2_0bhbhlnxz22gh.R.inc(795);
            __CLR4_2_0bhbhlnxz22gh.R.inc(796);return parser;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public Connection.Request postDataCharset(String charset) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(797);
            __CLR4_2_0bhbhlnxz22gh.R.inc(798);Validate.notNull(charset, "Charset must not be null");
            __CLR4_2_0bhbhlnxz22gh.R.inc(799);if ((((!Charset.isSupported(charset))&&(__CLR4_2_0bhbhlnxz22gh.R.iget(800)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(801)==0&false))) {__CLR4_2_0bhbhlnxz22gh.R.inc(802);throw new IllegalCharsetNameException(charset);
            }__CLR4_2_0bhbhlnxz22gh.R.inc(803);this.postDataCharset = charset;
            __CLR4_2_0bhbhlnxz22gh.R.inc(804);return this;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public String postDataCharset() {try{__CLR4_2_0bhbhlnxz22gh.R.inc(805);
            __CLR4_2_0bhbhlnxz22gh.R.inc(806);return postDataCharset;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}
    }

    public static class Response extends HttpConnection.Base<Connection.Response> implements Connection.Response {
        private static final int MAX_REDIRECTS = 20;
        private static final String LOCATION = "Location";
        private int statusCode;
        private String statusMessage;
        private ByteBuffer byteData;
        private InputStream bodyStream;
        private HttpURLConnection conn;
        private String charset;
        private String contentType;
        private boolean executed = false;
        private boolean inputStreamRead = false;
        private int numRedirects = 0;
        private Connection.Request req;

        /*
         * Matches XML content types (like text/xml, application/xhtml+xml;charset=UTF8, etc)
         */
        private static final Pattern xmlContentTypeRxp = Pattern.compile("(application|text)/\\w*\\+?xml.*");

        Response() {
            super();__CLR4_2_0bhbhlnxz22gh.R.inc(808);try{__CLR4_2_0bhbhlnxz22gh.R.inc(807);
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        private Response(Response previousResponse) throws IOException {
            super();__CLR4_2_0bhbhlnxz22gh.R.inc(810);try{__CLR4_2_0bhbhlnxz22gh.R.inc(809);
            __CLR4_2_0bhbhlnxz22gh.R.inc(811);if ((((previousResponse != null)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(812)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(813)==0&false))) {{
                __CLR4_2_0bhbhlnxz22gh.R.inc(814);numRedirects = previousResponse.numRedirects + 1;
                __CLR4_2_0bhbhlnxz22gh.R.inc(815);if ((((numRedirects >= MAX_REDIRECTS)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(816)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(817)==0&false)))
                    {__CLR4_2_0bhbhlnxz22gh.R.inc(818);throw new IOException(String.format("Too many redirects occurred trying to load URL %s", previousResponse.url()));
            }}
        }}finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        static Response execute(Connection.Request req) throws IOException {try{__CLR4_2_0bhbhlnxz22gh.R.inc(819);
            __CLR4_2_0bhbhlnxz22gh.R.inc(820);return execute(req, null);
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        static Response execute(Connection.Request req, Response previousResponse) throws IOException {try{__CLR4_2_0bhbhlnxz22gh.R.inc(821);
            __CLR4_2_0bhbhlnxz22gh.R.inc(822);Validate.notNull(req, "Request must not be null");
            __CLR4_2_0bhbhlnxz22gh.R.inc(823);Validate.notNull(req.url(), "URL must be specified to connect");
            __CLR4_2_0bhbhlnxz22gh.R.inc(824);String protocol = req.url().getProtocol();
            __CLR4_2_0bhbhlnxz22gh.R.inc(825);if ((((!protocol.equals("http") && !protocol.equals("https"))&&(__CLR4_2_0bhbhlnxz22gh.R.iget(826)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(827)==0&false)))
                {__CLR4_2_0bhbhlnxz22gh.R.inc(828);throw new MalformedURLException("Only http & https protocols supported");
            }__CLR4_2_0bhbhlnxz22gh.R.inc(829);final boolean methodHasBody = req.method().hasBody();
            __CLR4_2_0bhbhlnxz22gh.R.inc(830);final boolean hasRequestBody = req.requestBody() != null;
            __CLR4_2_0bhbhlnxz22gh.R.inc(831);if ((((!methodHasBody)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(832)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(833)==0&false)))
                {__CLR4_2_0bhbhlnxz22gh.R.inc(834);Validate.isFalse(hasRequestBody, "Cannot set a request body for HTTP method " + req.method());

            // set up the request for execution
            }__CLR4_2_0bhbhlnxz22gh.R.inc(835);String mimeBoundary = null;
            __CLR4_2_0bhbhlnxz22gh.R.inc(836);if ((((req.data().size() > 0 && (!methodHasBody || hasRequestBody))&&(__CLR4_2_0bhbhlnxz22gh.R.iget(837)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(838)==0&false)))
                {__CLR4_2_0bhbhlnxz22gh.R.inc(839);serialiseRequestUrl(req);
            }else {__CLR4_2_0bhbhlnxz22gh.R.inc(840);if ((((methodHasBody)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(841)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(842)==0&false)))
                {__CLR4_2_0bhbhlnxz22gh.R.inc(843);mimeBoundary = setOutputContentType(req);

            }}__CLR4_2_0bhbhlnxz22gh.R.inc(844);long startTime = System.nanoTime();
            __CLR4_2_0bhbhlnxz22gh.R.inc(845);HttpURLConnection conn = createConnection(req);
            __CLR4_2_0bhbhlnxz22gh.R.inc(846);Response res;
            __CLR4_2_0bhbhlnxz22gh.R.inc(847);try {
                __CLR4_2_0bhbhlnxz22gh.R.inc(848);conn.connect();
                __CLR4_2_0bhbhlnxz22gh.R.inc(849);if ((((conn.getDoOutput())&&(__CLR4_2_0bhbhlnxz22gh.R.iget(850)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(851)==0&false)))
                    {__CLR4_2_0bhbhlnxz22gh.R.inc(852);writePost(req, conn.getOutputStream(), mimeBoundary);

                }__CLR4_2_0bhbhlnxz22gh.R.inc(853);int status = conn.getResponseCode();
                __CLR4_2_0bhbhlnxz22gh.R.inc(854);res = new Response(previousResponse);
                __CLR4_2_0bhbhlnxz22gh.R.inc(855);res.setupFromConnection(conn, previousResponse);
                __CLR4_2_0bhbhlnxz22gh.R.inc(856);res.req = req;

                // redirect if there's a location header (from 3xx, or 201 etc)
                __CLR4_2_0bhbhlnxz22gh.R.inc(857);if ((((res.hasHeader(LOCATION) && req.followRedirects())&&(__CLR4_2_0bhbhlnxz22gh.R.iget(858)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(859)==0&false))) {{
                    __CLR4_2_0bhbhlnxz22gh.R.inc(860);if ((((status != HTTP_TEMP_REDIR)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(861)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(862)==0&false))) {{
                        __CLR4_2_0bhbhlnxz22gh.R.inc(863);req.method(Method.GET); // always redirect with a get. any data param from original req are dropped.
                        __CLR4_2_0bhbhlnxz22gh.R.inc(864);req.data().clear();
                        __CLR4_2_0bhbhlnxz22gh.R.inc(865);req.requestBody(null);
                        __CLR4_2_0bhbhlnxz22gh.R.inc(866);req.removeHeader(CONTENT_TYPE);
                    }

                    }__CLR4_2_0bhbhlnxz22gh.R.inc(867);String location = res.header(LOCATION);
                    __CLR4_2_0bhbhlnxz22gh.R.inc(868);if ((((location.startsWith("http:/") && location.charAt(6) != '/')&&(__CLR4_2_0bhbhlnxz22gh.R.iget(869)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(870)==0&false))) // fix broken Location: http:/temp/AAG_New/en/index.php
                        {__CLR4_2_0bhbhlnxz22gh.R.inc(871);location = location.substring(6);
                    }__CLR4_2_0bhbhlnxz22gh.R.inc(872);URL redir = StringUtil.resolve(req.url(), location);
                    __CLR4_2_0bhbhlnxz22gh.R.inc(873);req.url(encodeUrl(redir));

                    __CLR4_2_0bhbhlnxz22gh.R.inc(874);for (Map.Entry<String, String> cookie : res.cookies.entrySet()) {{ // add response cookies to request (for e.g. login posts)
                        __CLR4_2_0bhbhlnxz22gh.R.inc(875);req.cookie(cookie.getKey(), cookie.getValue());
                    }
                    }__CLR4_2_0bhbhlnxz22gh.R.inc(876);return execute(req, res);
                }
                }__CLR4_2_0bhbhlnxz22gh.R.inc(877);if (((((status < 200 || status >= 400) && !req.ignoreHttpErrors())&&(__CLR4_2_0bhbhlnxz22gh.R.iget(878)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(879)==0&false)))
                        {__CLR4_2_0bhbhlnxz22gh.R.inc(880);throw new HttpStatusException("HTTP error fetching URL", status, req.url().toString());

                // check that we can handle the returned content type; if not, abort before fetching it
                }__CLR4_2_0bhbhlnxz22gh.R.inc(881);String contentType = res.contentType();
                __CLR4_2_0bhbhlnxz22gh.R.inc(882);if ((((contentType != null
                        && !req.ignoreContentType()
                        && !contentType.startsWith("text/")
                        && !xmlContentTypeRxp.matcher(contentType).matches()
                        )&&(__CLR4_2_0bhbhlnxz22gh.R.iget(883)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(884)==0&false)))
                    {__CLR4_2_0bhbhlnxz22gh.R.inc(885);throw new UnsupportedMimeTypeException("Unhandled content type. Must be text/*, application/xml, or application/xhtml+xml",
                            contentType, req.url().toString());

                // switch to the XML parser if content type is xml and not parser not explicitly set
                }__CLR4_2_0bhbhlnxz22gh.R.inc(886);if ((((contentType != null && xmlContentTypeRxp.matcher(contentType).matches())&&(__CLR4_2_0bhbhlnxz22gh.R.iget(887)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(888)==0&false))) {{
                    // only flip it if a HttpConnection.Request (i.e. don't presume other impls want it):
                    __CLR4_2_0bhbhlnxz22gh.R.inc(889);if ((((req instanceof HttpConnection.Request && !((Request) req).parserDefined)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(890)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(891)==0&false))) {{
                        __CLR4_2_0bhbhlnxz22gh.R.inc(892);req.parser(Parser.xmlParser());
                    }
                }}

                }__CLR4_2_0bhbhlnxz22gh.R.inc(893);res.charset = DataUtil.getCharsetFromContentType(res.contentType); // may be null, readInputStream deals with it
                __CLR4_2_0bhbhlnxz22gh.R.inc(894);if ((((conn.getContentLength() != 0 && req.method() != HEAD)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(895)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(896)==0&false))) {{ // -1 means unknown, chunked. sun throws an IO exception on 500 response with no content when trying to read body
                    __CLR4_2_0bhbhlnxz22gh.R.inc(897);res.bodyStream = null;
                    __CLR4_2_0bhbhlnxz22gh.R.inc(898);res.bodyStream = (((conn.getErrorStream() != null )&&(__CLR4_2_0bhbhlnxz22gh.R.iget(899)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(900)==0&false))? conn.getErrorStream() : conn.getInputStream();
                    __CLR4_2_0bhbhlnxz22gh.R.inc(901);if ((((res.hasHeaderWithValue(CONTENT_ENCODING, "gzip"))&&(__CLR4_2_0bhbhlnxz22gh.R.iget(902)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(903)==0&false))) {{
                        __CLR4_2_0bhbhlnxz22gh.R.inc(904);res.bodyStream = new GZIPInputStream(res.bodyStream);
                    } }else {__CLR4_2_0bhbhlnxz22gh.R.inc(905);if ((((res.hasHeaderWithValue(CONTENT_ENCODING, "deflate"))&&(__CLR4_2_0bhbhlnxz22gh.R.iget(906)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(907)==0&false))) {{
                        __CLR4_2_0bhbhlnxz22gh.R.inc(908);res.bodyStream = new InflaterInputStream(res.bodyStream, new Inflater(true));
                    }
                    }}__CLR4_2_0bhbhlnxz22gh.R.inc(909);res.bodyStream = ConstrainableInputStream
                        .wrap(res.bodyStream, DataUtil.bufferSize, req.maxBodySize())
                        .timeout(startTime, req.timeout())
                    ;
                } }else {{
                    __CLR4_2_0bhbhlnxz22gh.R.inc(910);res.byteData = DataUtil.emptyByteBuffer();
                }
            }} catch (IOException e){
                // per Java's documentation, this is not necessary, and precludes keepalives. However in practice,
                // connection errors will not be released quickly enough and can cause a too many open files error.
                __CLR4_2_0bhbhlnxz22gh.R.inc(911);conn.disconnect();
                __CLR4_2_0bhbhlnxz22gh.R.inc(912);throw e;
            }

            __CLR4_2_0bhbhlnxz22gh.R.inc(913);res.executed = true;
            __CLR4_2_0bhbhlnxz22gh.R.inc(914);return res;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public int statusCode() {try{__CLR4_2_0bhbhlnxz22gh.R.inc(915);
            __CLR4_2_0bhbhlnxz22gh.R.inc(916);return statusCode;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public String statusMessage() {try{__CLR4_2_0bhbhlnxz22gh.R.inc(917);
            __CLR4_2_0bhbhlnxz22gh.R.inc(918);return statusMessage;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public String charset() {try{__CLR4_2_0bhbhlnxz22gh.R.inc(919);
            __CLR4_2_0bhbhlnxz22gh.R.inc(920);return charset;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public Response charset(String charset) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(921);
            __CLR4_2_0bhbhlnxz22gh.R.inc(922);this.charset = charset;
            __CLR4_2_0bhbhlnxz22gh.R.inc(923);return this;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public String contentType() {try{__CLR4_2_0bhbhlnxz22gh.R.inc(924);
            __CLR4_2_0bhbhlnxz22gh.R.inc(925);return contentType;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public Document parse() throws IOException {try{__CLR4_2_0bhbhlnxz22gh.R.inc(926);
            __CLR4_2_0bhbhlnxz22gh.R.inc(927);Validate.isTrue(executed, "Request must be executed (with .execute(), .get(), or .post() before parsing response");
            __CLR4_2_0bhbhlnxz22gh.R.inc(928);if ((((byteData != null)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(929)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(930)==0&false))) {{ // bytes have been read in to the buffer, parse that
                __CLR4_2_0bhbhlnxz22gh.R.inc(931);bodyStream = new ByteArrayInputStream(byteData.array());
                __CLR4_2_0bhbhlnxz22gh.R.inc(932);inputStreamRead = false; // ok to reparse if in bytes
            }
            }__CLR4_2_0bhbhlnxz22gh.R.inc(933);Validate.isFalse(inputStreamRead, "Input stream already read and parsed, cannot re-read.");
            __CLR4_2_0bhbhlnxz22gh.R.inc(934);Document doc = DataUtil.parseInputStream(bodyStream, charset, url.toExternalForm(), req.parser());
            __CLR4_2_0bhbhlnxz22gh.R.inc(935);charset = doc.outputSettings().charset().name(); // update charset from meta-equiv, possibly
            __CLR4_2_0bhbhlnxz22gh.R.inc(936);inputStreamRead = true;
            __CLR4_2_0bhbhlnxz22gh.R.inc(937);safeClose();
            __CLR4_2_0bhbhlnxz22gh.R.inc(938);return doc;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        private void prepareByteData() {try{__CLR4_2_0bhbhlnxz22gh.R.inc(939);
            __CLR4_2_0bhbhlnxz22gh.R.inc(940);Validate.isTrue(executed, "Request must be executed (with .execute(), .get(), or .post() before getting response body");
            __CLR4_2_0bhbhlnxz22gh.R.inc(941);if ((((byteData == null)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(942)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(943)==0&false))) {{
                __CLR4_2_0bhbhlnxz22gh.R.inc(944);Validate.isFalse(inputStreamRead, "Request has already been read (with .parse())");
                __CLR4_2_0bhbhlnxz22gh.R.inc(945);try {
                    __CLR4_2_0bhbhlnxz22gh.R.inc(946);byteData = DataUtil.readToByteBuffer(bodyStream, req.maxBodySize());
                } catch (IOException e) {
                    __CLR4_2_0bhbhlnxz22gh.R.inc(947);throw new UncheckedIOException(e);
                } finally {
                    __CLR4_2_0bhbhlnxz22gh.R.inc(948);inputStreamRead = true;
                    __CLR4_2_0bhbhlnxz22gh.R.inc(949);safeClose();
                }
            }
        }}finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public String body() {try{__CLR4_2_0bhbhlnxz22gh.R.inc(950);
            __CLR4_2_0bhbhlnxz22gh.R.inc(951);prepareByteData();
            // charset gets set from header on execute, and from meta-equiv on parse. parse may not have happened yet
            __CLR4_2_0bhbhlnxz22gh.R.inc(952);String body;
            __CLR4_2_0bhbhlnxz22gh.R.inc(953);if ((((charset == null)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(954)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(955)==0&false)))
                {__CLR4_2_0bhbhlnxz22gh.R.inc(956);body = Charset.forName(DataUtil.defaultCharset).decode(byteData).toString();
            }else
                {__CLR4_2_0bhbhlnxz22gh.R.inc(957);body = Charset.forName(charset).decode(byteData).toString();
            }__CLR4_2_0bhbhlnxz22gh.R.inc(958);((Buffer)byteData).rewind(); // cast to avoid covariant return type change in jdk9
            __CLR4_2_0bhbhlnxz22gh.R.inc(959);return body;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public byte[] bodyAsBytes() {try{__CLR4_2_0bhbhlnxz22gh.R.inc(960);
            __CLR4_2_0bhbhlnxz22gh.R.inc(961);prepareByteData();
            __CLR4_2_0bhbhlnxz22gh.R.inc(962);return byteData.array();
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        @Override
        public Connection.Response bufferUp() {try{__CLR4_2_0bhbhlnxz22gh.R.inc(963);
            __CLR4_2_0bhbhlnxz22gh.R.inc(964);prepareByteData();
            __CLR4_2_0bhbhlnxz22gh.R.inc(965);return this;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        @Override
        public BufferedInputStream bodyStream() {try{__CLR4_2_0bhbhlnxz22gh.R.inc(966);
            __CLR4_2_0bhbhlnxz22gh.R.inc(967);Validate.isTrue(executed, "Request must be executed (with .execute(), .get(), or .post() before getting response body");
            __CLR4_2_0bhbhlnxz22gh.R.inc(968);Validate.isFalse(inputStreamRead, "Request has already been read");
            __CLR4_2_0bhbhlnxz22gh.R.inc(969);inputStreamRead = true;
            __CLR4_2_0bhbhlnxz22gh.R.inc(970);return ConstrainableInputStream.wrap(bodyStream, DataUtil.bufferSize, req.maxBodySize());
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        // set up connection defaults, and details from request
        private static HttpURLConnection createConnection(Connection.Request req) throws IOException {try{__CLR4_2_0bhbhlnxz22gh.R.inc(971);
            __CLR4_2_0bhbhlnxz22gh.R.inc(972);final HttpURLConnection conn = (HttpURLConnection) (
                (((req.proxy() == null )&&(__CLR4_2_0bhbhlnxz22gh.R.iget(973)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(974)==0&false))?
                req.url().openConnection() :
                req.url().openConnection(req.proxy())
            );

            __CLR4_2_0bhbhlnxz22gh.R.inc(975);conn.setRequestMethod(req.method().name());
            __CLR4_2_0bhbhlnxz22gh.R.inc(976);conn.setInstanceFollowRedirects(false); // don't rely on native redirection support
            __CLR4_2_0bhbhlnxz22gh.R.inc(977);conn.setConnectTimeout(req.timeout());
            __CLR4_2_0bhbhlnxz22gh.R.inc(978);conn.setReadTimeout(req.timeout() / 2); // gets reduced after connection is made and status is read

            __CLR4_2_0bhbhlnxz22gh.R.inc(979);if ((((req.sslSocketFactory() != null && conn instanceof HttpsURLConnection)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(980)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(981)==0&false)))
                {__CLR4_2_0bhbhlnxz22gh.R.inc(982);((HttpsURLConnection) conn).setSSLSocketFactory(req.sslSocketFactory());
            }__CLR4_2_0bhbhlnxz22gh.R.inc(983);if ((((req.method().hasBody())&&(__CLR4_2_0bhbhlnxz22gh.R.iget(984)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(985)==0&false)))
                {__CLR4_2_0bhbhlnxz22gh.R.inc(986);conn.setDoOutput(true);
            }__CLR4_2_0bhbhlnxz22gh.R.inc(987);if ((((req.cookies().size() > 0)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(988)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(989)==0&false)))
                {__CLR4_2_0bhbhlnxz22gh.R.inc(990);conn.addRequestProperty("Cookie", getRequestCookieString(req));
            }__CLR4_2_0bhbhlnxz22gh.R.inc(991);for (Map.Entry<String, List<String>> header : req.multiHeaders().entrySet()) {{
                __CLR4_2_0bhbhlnxz22gh.R.inc(992);for (String value : header.getValue()) {{
                    __CLR4_2_0bhbhlnxz22gh.R.inc(993);conn.addRequestProperty(header.getKey(), value);
                }
            }}
            }__CLR4_2_0bhbhlnxz22gh.R.inc(994);return conn;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        /**
         * Call on completion of stream read, to close the body (or error) stream
         */
        private void safeClose() {try{__CLR4_2_0bhbhlnxz22gh.R.inc(995);
            __CLR4_2_0bhbhlnxz22gh.R.inc(996);if ((((conn != null)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(997)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(998)==0&false))) {{
                __CLR4_2_0bhbhlnxz22gh.R.inc(999);conn.disconnect();
                __CLR4_2_0bhbhlnxz22gh.R.inc(1000);conn = null;
            }
            }__CLR4_2_0bhbhlnxz22gh.R.inc(1001);if ((((bodyStream != null)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(1002)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(1003)==0&false))) {{
                __CLR4_2_0bhbhlnxz22gh.R.inc(1004);try {
                    __CLR4_2_0bhbhlnxz22gh.R.inc(1005);bodyStream.close();
                } catch (IOException e) {
                    // no-op
                } finally {
                    __CLR4_2_0bhbhlnxz22gh.R.inc(1006);bodyStream = null;
                }
            }
        }}finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        // set up url, method, header, cookies
        private void setupFromConnection(HttpURLConnection conn, HttpConnection.Response previousResponse) throws IOException {try{__CLR4_2_0bhbhlnxz22gh.R.inc(1007);
            __CLR4_2_0bhbhlnxz22gh.R.inc(1008);this.conn = conn;
            __CLR4_2_0bhbhlnxz22gh.R.inc(1009);method = Method.valueOf(conn.getRequestMethod());
            __CLR4_2_0bhbhlnxz22gh.R.inc(1010);url = conn.getURL();
            __CLR4_2_0bhbhlnxz22gh.R.inc(1011);statusCode = conn.getResponseCode();
            __CLR4_2_0bhbhlnxz22gh.R.inc(1012);statusMessage = conn.getResponseMessage();
            __CLR4_2_0bhbhlnxz22gh.R.inc(1013);contentType = conn.getContentType();

            __CLR4_2_0bhbhlnxz22gh.R.inc(1014);Map<String, List<String>> resHeaders = createHeaderMap(conn);
            __CLR4_2_0bhbhlnxz22gh.R.inc(1015);processResponseHeaders(resHeaders);

            // if from a redirect, map previous response cookies into this response
            __CLR4_2_0bhbhlnxz22gh.R.inc(1016);if ((((previousResponse != null)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(1017)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(1018)==0&false))) {{
                __CLR4_2_0bhbhlnxz22gh.R.inc(1019);for (Map.Entry<String, String> prevCookie : previousResponse.cookies().entrySet()) {{
                    __CLR4_2_0bhbhlnxz22gh.R.inc(1020);if ((((!hasCookie(prevCookie.getKey()))&&(__CLR4_2_0bhbhlnxz22gh.R.iget(1021)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(1022)==0&false)))
                        {__CLR4_2_0bhbhlnxz22gh.R.inc(1023);cookie(prevCookie.getKey(), prevCookie.getValue());
                }}
                }__CLR4_2_0bhbhlnxz22gh.R.inc(1024);previousResponse.safeClose();
            }
        }}finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        private static LinkedHashMap<String, List<String>> createHeaderMap(HttpURLConnection conn) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(1025);
            // the default sun impl of conn.getHeaderFields() returns header values out of order
            __CLR4_2_0bhbhlnxz22gh.R.inc(1026);final LinkedHashMap<String, List<String>> headers = new LinkedHashMap<>();
            __CLR4_2_0bhbhlnxz22gh.R.inc(1027);int i = 0;
            __CLR4_2_0bhbhlnxz22gh.R.inc(1028);while (true) {{
                __CLR4_2_0bhbhlnxz22gh.R.inc(1029);final String key = conn.getHeaderFieldKey(i);
                __CLR4_2_0bhbhlnxz22gh.R.inc(1030);final String val = conn.getHeaderField(i);
                __CLR4_2_0bhbhlnxz22gh.R.inc(1031);if ((((key == null && val == null)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(1032)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(1033)==0&false)))
                    {__CLR4_2_0bhbhlnxz22gh.R.inc(1034);break;
                }__CLR4_2_0bhbhlnxz22gh.R.inc(1035);i++;
                __CLR4_2_0bhbhlnxz22gh.R.inc(1036);if ((((key == null || val == null)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(1037)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(1038)==0&false)))
                    {__CLR4_2_0bhbhlnxz22gh.R.inc(1039);continue; // skip http1.1 line

                }__CLR4_2_0bhbhlnxz22gh.R.inc(1040);if ((((headers.containsKey(key))&&(__CLR4_2_0bhbhlnxz22gh.R.iget(1041)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(1042)==0&false)))
                    {__CLR4_2_0bhbhlnxz22gh.R.inc(1043);headers.get(key).add(val);
                }else {{
                    __CLR4_2_0bhbhlnxz22gh.R.inc(1044);final ArrayList<String> vals = new ArrayList<>();
                    __CLR4_2_0bhbhlnxz22gh.R.inc(1045);vals.add(val);
                    __CLR4_2_0bhbhlnxz22gh.R.inc(1046);headers.put(key, vals);
                }
            }}
            }__CLR4_2_0bhbhlnxz22gh.R.inc(1047);return headers;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        void processResponseHeaders(Map<String, List<String>> resHeaders) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(1048);
            __CLR4_2_0bhbhlnxz22gh.R.inc(1049);for (Map.Entry<String, List<String>> entry : resHeaders.entrySet()) {{
                __CLR4_2_0bhbhlnxz22gh.R.inc(1050);String name = entry.getKey();
                __CLR4_2_0bhbhlnxz22gh.R.inc(1051);if ((((name == null)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(1052)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(1053)==0&false)))
                    {__CLR4_2_0bhbhlnxz22gh.R.inc(1054);continue; // http/1.1 line

                }__CLR4_2_0bhbhlnxz22gh.R.inc(1055);List<String> values = entry.getValue();
                __CLR4_2_0bhbhlnxz22gh.R.inc(1056);if ((((name.equalsIgnoreCase("Set-Cookie"))&&(__CLR4_2_0bhbhlnxz22gh.R.iget(1057)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(1058)==0&false))) {{
                    __CLR4_2_0bhbhlnxz22gh.R.inc(1059);for (String value : values) {{
                        __CLR4_2_0bhbhlnxz22gh.R.inc(1060);if ((((value == null)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(1061)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(1062)==0&false)))
                            {__CLR4_2_0bhbhlnxz22gh.R.inc(1063);continue;
                        }__CLR4_2_0bhbhlnxz22gh.R.inc(1064);TokenQueue cd = new TokenQueue(value);
                        __CLR4_2_0bhbhlnxz22gh.R.inc(1065);String cookieName = cd.chompTo("=").trim();
                        __CLR4_2_0bhbhlnxz22gh.R.inc(1066);String cookieVal = cd.consumeTo(";").trim();
                        // ignores path, date, domain, validateTLSCertificates et al. req'd?
                        // name not blank, value not null
                        __CLR4_2_0bhbhlnxz22gh.R.inc(1067);if ((((cookieName.length() > 0)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(1068)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(1069)==0&false)))
                            {__CLR4_2_0bhbhlnxz22gh.R.inc(1070);cookie(cookieName, cookieVal);
                    }}
                }}
                }__CLR4_2_0bhbhlnxz22gh.R.inc(1071);for (String value : values) {{
                    __CLR4_2_0bhbhlnxz22gh.R.inc(1072);addHeader(name, value);
                }
            }}
        }}finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        private static String setOutputContentType(final Connection.Request req) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(1073);
            __CLR4_2_0bhbhlnxz22gh.R.inc(1074);String bound = null;
            __CLR4_2_0bhbhlnxz22gh.R.inc(1075);if ((((req.hasHeader(CONTENT_TYPE))&&(__CLR4_2_0bhbhlnxz22gh.R.iget(1076)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(1077)==0&false))) {{
                // no-op; don't add content type as already set (e.g. for requestBody())
                // todo - if content type already set, we could add charset

                // if user has set content type to multipart/form-data, auto add boundary.
                __CLR4_2_0bhbhlnxz22gh.R.inc(1078);if((((req.header(CONTENT_TYPE).contains(MULTIPART_FORM_DATA) &&
                        !req.header(CONTENT_TYPE).contains("boundary"))&&(__CLR4_2_0bhbhlnxz22gh.R.iget(1079)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(1080)==0&false))) {{
                    __CLR4_2_0bhbhlnxz22gh.R.inc(1081);bound = DataUtil.mimeBoundary();
                    __CLR4_2_0bhbhlnxz22gh.R.inc(1082);req.header(CONTENT_TYPE, MULTIPART_FORM_DATA + "; boundary=" + bound);
                }

            }}
            }else {__CLR4_2_0bhbhlnxz22gh.R.inc(1083);if ((((needsMultipart(req))&&(__CLR4_2_0bhbhlnxz22gh.R.iget(1084)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(1085)==0&false))) {{
                __CLR4_2_0bhbhlnxz22gh.R.inc(1086);bound = DataUtil.mimeBoundary();
                __CLR4_2_0bhbhlnxz22gh.R.inc(1087);req.header(CONTENT_TYPE, MULTIPART_FORM_DATA + "; boundary=" + bound);
            } }else {{
                __CLR4_2_0bhbhlnxz22gh.R.inc(1088);req.header(CONTENT_TYPE, FORM_URL_ENCODED + "; charset=" + req.postDataCharset());
            }
            }}__CLR4_2_0bhbhlnxz22gh.R.inc(1089);return bound;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        private static void writePost(final Connection.Request req, final OutputStream outputStream, final String bound) throws IOException {try{__CLR4_2_0bhbhlnxz22gh.R.inc(1090);
            __CLR4_2_0bhbhlnxz22gh.R.inc(1091);final Collection<Connection.KeyVal> data = req.data();
            __CLR4_2_0bhbhlnxz22gh.R.inc(1092);final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(outputStream, req.postDataCharset()));

            __CLR4_2_0bhbhlnxz22gh.R.inc(1093);if ((((bound != null)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(1094)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(1095)==0&false))) {{
                // boundary will be set if we're in multipart mode
                __CLR4_2_0bhbhlnxz22gh.R.inc(1096);for (Connection.KeyVal keyVal : data) {{
                    __CLR4_2_0bhbhlnxz22gh.R.inc(1097);w.write("--");
                    __CLR4_2_0bhbhlnxz22gh.R.inc(1098);w.write(bound);
                    __CLR4_2_0bhbhlnxz22gh.R.inc(1099);w.write("\r\n");
                    __CLR4_2_0bhbhlnxz22gh.R.inc(1100);w.write("Content-Disposition: form-data; name=\"");
                    __CLR4_2_0bhbhlnxz22gh.R.inc(1101);w.write(encodeMimeName(keyVal.key())); // encodes " to %22
                    __CLR4_2_0bhbhlnxz22gh.R.inc(1102);w.write("\"");
                    __CLR4_2_0bhbhlnxz22gh.R.inc(1103);if ((((keyVal.hasInputStream())&&(__CLR4_2_0bhbhlnxz22gh.R.iget(1104)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(1105)==0&false))) {{
                        __CLR4_2_0bhbhlnxz22gh.R.inc(1106);w.write("; filename=\"");
                        __CLR4_2_0bhbhlnxz22gh.R.inc(1107);w.write(encodeMimeName(keyVal.value()));
                        __CLR4_2_0bhbhlnxz22gh.R.inc(1108);w.write("\"\r\nContent-Type: ");
                        __CLR4_2_0bhbhlnxz22gh.R.inc(1109);w.write((((keyVal.contentType() != null )&&(__CLR4_2_0bhbhlnxz22gh.R.iget(1110)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(1111)==0&false))? keyVal.contentType() : DefaultUploadType);
                        __CLR4_2_0bhbhlnxz22gh.R.inc(1112);w.write("\r\n\r\n");
                        __CLR4_2_0bhbhlnxz22gh.R.inc(1113);w.flush(); // flush
                        __CLR4_2_0bhbhlnxz22gh.R.inc(1114);DataUtil.crossStreams(keyVal.inputStream(), outputStream);
                        __CLR4_2_0bhbhlnxz22gh.R.inc(1115);outputStream.flush();
                    } }else {{
                        __CLR4_2_0bhbhlnxz22gh.R.inc(1116);w.write("\r\n\r\n");
                        __CLR4_2_0bhbhlnxz22gh.R.inc(1117);w.write(keyVal.value());
                    }
                    }__CLR4_2_0bhbhlnxz22gh.R.inc(1118);w.write("\r\n");
                }
                }__CLR4_2_0bhbhlnxz22gh.R.inc(1119);w.write("--");
                __CLR4_2_0bhbhlnxz22gh.R.inc(1120);w.write(bound);
                __CLR4_2_0bhbhlnxz22gh.R.inc(1121);w.write("--");
            } }else {__CLR4_2_0bhbhlnxz22gh.R.inc(1122);if ((((req.requestBody() != null)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(1123)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(1124)==0&false))) {{
                // data will be in query string, we're sending a plaintext body
                __CLR4_2_0bhbhlnxz22gh.R.inc(1125);w.write(req.requestBody());
            }
            }else {{
                // regular form data (application/x-www-form-urlencoded)
                __CLR4_2_0bhbhlnxz22gh.R.inc(1126);boolean first = true;
                __CLR4_2_0bhbhlnxz22gh.R.inc(1127);for (Connection.KeyVal keyVal : data) {{
                    __CLR4_2_0bhbhlnxz22gh.R.inc(1128);if ((((!first)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(1129)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(1130)==0&false)))
                        {__CLR4_2_0bhbhlnxz22gh.R.inc(1131);w.append('&');
                    }else
                        {__CLR4_2_0bhbhlnxz22gh.R.inc(1132);first = false;

                    }__CLR4_2_0bhbhlnxz22gh.R.inc(1133);w.write(URLEncoder.encode(keyVal.key(), req.postDataCharset()));
                    __CLR4_2_0bhbhlnxz22gh.R.inc(1134);w.write('=');
                    __CLR4_2_0bhbhlnxz22gh.R.inc(1135);w.write(URLEncoder.encode(keyVal.value(), req.postDataCharset()));
                }
            }}
            }}__CLR4_2_0bhbhlnxz22gh.R.inc(1136);w.close();
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        private static String getRequestCookieString(Connection.Request req) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(1137);
            __CLR4_2_0bhbhlnxz22gh.R.inc(1138);StringBuilder sb = StringUtil.borrowBuilder();
            __CLR4_2_0bhbhlnxz22gh.R.inc(1139);boolean first = true;
            __CLR4_2_0bhbhlnxz22gh.R.inc(1140);for (Map.Entry<String, String> cookie : req.cookies().entrySet()) {{
                __CLR4_2_0bhbhlnxz22gh.R.inc(1141);if ((((!first)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(1142)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(1143)==0&false)))
                    {__CLR4_2_0bhbhlnxz22gh.R.inc(1144);sb.append("; ");
                }else
                    {__CLR4_2_0bhbhlnxz22gh.R.inc(1145);first = false;
                }__CLR4_2_0bhbhlnxz22gh.R.inc(1146);sb.append(cookie.getKey()).append('=').append(cookie.getValue());
                // todo: spec says only ascii, no escaping / encoding defined. validate on set? or escape somehow here?
            }
            }__CLR4_2_0bhbhlnxz22gh.R.inc(1147);return StringUtil.releaseBuilder(sb);
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        // for get url reqs, serialise the data map into the url
        private static void serialiseRequestUrl(Connection.Request req) throws IOException {try{__CLR4_2_0bhbhlnxz22gh.R.inc(1148);
            __CLR4_2_0bhbhlnxz22gh.R.inc(1149);URL in = req.url();
            __CLR4_2_0bhbhlnxz22gh.R.inc(1150);StringBuilder url = StringUtil.borrowBuilder();
            __CLR4_2_0bhbhlnxz22gh.R.inc(1151);boolean first = true;
            // reconstitute the query, ready for appends
            __CLR4_2_0bhbhlnxz22gh.R.inc(1152);url
                .append(in.getProtocol())
                .append("://")
                .append(in.getAuthority()) // includes host, port
                .append(in.getPath())
                .append("?");
            __CLR4_2_0bhbhlnxz22gh.R.inc(1153);if ((((in.getQuery() != null)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(1154)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(1155)==0&false))) {{
                __CLR4_2_0bhbhlnxz22gh.R.inc(1156);url.append(in.getQuery());
                __CLR4_2_0bhbhlnxz22gh.R.inc(1157);first = false;
            }
            }__CLR4_2_0bhbhlnxz22gh.R.inc(1158);for (Connection.KeyVal keyVal : req.data()) {{
                __CLR4_2_0bhbhlnxz22gh.R.inc(1159);Validate.isFalse(keyVal.hasInputStream(), "InputStream data not supported in URL query string.");
                __CLR4_2_0bhbhlnxz22gh.R.inc(1160);if ((((!first)&&(__CLR4_2_0bhbhlnxz22gh.R.iget(1161)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(1162)==0&false)))
                    {__CLR4_2_0bhbhlnxz22gh.R.inc(1163);url.append('&');
                }else
                    {__CLR4_2_0bhbhlnxz22gh.R.inc(1164);first = false;
                }__CLR4_2_0bhbhlnxz22gh.R.inc(1165);url
                    .append(URLEncoder.encode(keyVal.key(), DataUtil.defaultCharset))
                    .append('=')
                    .append(URLEncoder.encode(keyVal.value(), DataUtil.defaultCharset));
            }
            }__CLR4_2_0bhbhlnxz22gh.R.inc(1166);req.url(new URL(StringUtil.releaseBuilder(url)));
            __CLR4_2_0bhbhlnxz22gh.R.inc(1167);req.data().clear(); // moved into url as get params
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}
    }

    private static boolean needsMultipart(Connection.Request req) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(1168);
        // multipart mode, for files. add the header if we see something with an inputstream, and return a non-null boundary
        __CLR4_2_0bhbhlnxz22gh.R.inc(1169);for (Connection.KeyVal keyVal : req.data()) {{
            __CLR4_2_0bhbhlnxz22gh.R.inc(1170);if ((((keyVal.hasInputStream())&&(__CLR4_2_0bhbhlnxz22gh.R.iget(1171)!=0|true))||(__CLR4_2_0bhbhlnxz22gh.R.iget(1172)==0&false)))
                {__CLR4_2_0bhbhlnxz22gh.R.inc(1173);return true;
        }}
        }__CLR4_2_0bhbhlnxz22gh.R.inc(1174);return false;
    }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

    public static class KeyVal implements Connection.KeyVal {
        private String key;
        private String value;
        private InputStream stream;
        private String contentType;

        public static KeyVal create(String key, String value) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(1175);
            __CLR4_2_0bhbhlnxz22gh.R.inc(1176);return new KeyVal().key(key).value(value);
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public static KeyVal create(String key, String filename, InputStream stream) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(1177);
            __CLR4_2_0bhbhlnxz22gh.R.inc(1178);return new KeyVal().key(key).value(filename).inputStream(stream);
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        private KeyVal() {try{__CLR4_2_0bhbhlnxz22gh.R.inc(1179);}finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public KeyVal key(String key) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(1180);
            __CLR4_2_0bhbhlnxz22gh.R.inc(1181);Validate.notEmpty(key, "Data key must not be empty");
            __CLR4_2_0bhbhlnxz22gh.R.inc(1182);this.key = key;
            __CLR4_2_0bhbhlnxz22gh.R.inc(1183);return this;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public String key() {try{__CLR4_2_0bhbhlnxz22gh.R.inc(1184);
            __CLR4_2_0bhbhlnxz22gh.R.inc(1185);return key;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public KeyVal value(String value) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(1186);
            __CLR4_2_0bhbhlnxz22gh.R.inc(1187);Validate.notNull(value, "Data value must not be null");
            __CLR4_2_0bhbhlnxz22gh.R.inc(1188);this.value = value;
            __CLR4_2_0bhbhlnxz22gh.R.inc(1189);return this;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public String value() {try{__CLR4_2_0bhbhlnxz22gh.R.inc(1190);
            __CLR4_2_0bhbhlnxz22gh.R.inc(1191);return value;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public KeyVal inputStream(InputStream inputStream) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(1192);
            __CLR4_2_0bhbhlnxz22gh.R.inc(1193);Validate.notNull(value, "Data input stream must not be null");
            __CLR4_2_0bhbhlnxz22gh.R.inc(1194);this.stream = inputStream;
            __CLR4_2_0bhbhlnxz22gh.R.inc(1195);return this;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public InputStream inputStream() {try{__CLR4_2_0bhbhlnxz22gh.R.inc(1196);
            __CLR4_2_0bhbhlnxz22gh.R.inc(1197);return stream;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        public boolean hasInputStream() {try{__CLR4_2_0bhbhlnxz22gh.R.inc(1198);
            __CLR4_2_0bhbhlnxz22gh.R.inc(1199);return stream != null;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        @Override
        public Connection.KeyVal contentType(String contentType) {try{__CLR4_2_0bhbhlnxz22gh.R.inc(1200);
            __CLR4_2_0bhbhlnxz22gh.R.inc(1201);Validate.notEmpty(contentType);
            __CLR4_2_0bhbhlnxz22gh.R.inc(1202);this.contentType = contentType;
            __CLR4_2_0bhbhlnxz22gh.R.inc(1203);return this;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        @Override
        public String contentType() {try{__CLR4_2_0bhbhlnxz22gh.R.inc(1204);
            __CLR4_2_0bhbhlnxz22gh.R.inc(1205);return contentType;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_2_0bhbhlnxz22gh.R.inc(1206);
            __CLR4_2_0bhbhlnxz22gh.R.inc(1207);return key + "=" + value;
        }finally{__CLR4_2_0bhbhlnxz22gh.R.flushNeeded();}}
    }
}
