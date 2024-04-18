/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.integration.servlets;

import org.eclipse.jetty.server.Request;
import org.jsoup.helper.DataUtil;
import org.jsoup.internal.StringUtil;
import org.jsoup.integration.TestServer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Enumeration;

import static org.jsoup.nodes.Entities.escape;

public class EchoServlet extends BaseServlet {public static class __CLR4_2_08k48k4lnxz22xg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767707166L,8589935092L,11161,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String CodeParam = "code";
    public static final String Url = TestServer.map(EchoServlet.class);
    private static final int DefaultCode = HttpServletResponse.SC_OK;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {try{__CLR4_2_08k48k4lnxz22xg.R.inc(11092);
        __CLR4_2_08k48k4lnxz22xg.R.inc(11093);doIt(req, res);
    }finally{__CLR4_2_08k48k4lnxz22xg.R.flushNeeded();}}

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {try{__CLR4_2_08k48k4lnxz22xg.R.inc(11094);
        __CLR4_2_08k48k4lnxz22xg.R.inc(11095);doIt(req, res);
    }finally{__CLR4_2_08k48k4lnxz22xg.R.flushNeeded();}}

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {try{__CLR4_2_08k48k4lnxz22xg.R.inc(11096);
        __CLR4_2_08k48k4lnxz22xg.R.inc(11097);doIt(req, res);
    }finally{__CLR4_2_08k48k4lnxz22xg.R.flushNeeded();}}

    private void doIt(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {try{__CLR4_2_08k48k4lnxz22xg.R.inc(11098);
        __CLR4_2_08k48k4lnxz22xg.R.inc(11099);int intCode = DefaultCode;
        __CLR4_2_08k48k4lnxz22xg.R.inc(11100);String code = req.getHeader(CodeParam);
        __CLR4_2_08k48k4lnxz22xg.R.inc(11101);if ((((code != null)&&(__CLR4_2_08k48k4lnxz22xg.R.iget(11102)!=0|true))||(__CLR4_2_08k48k4lnxz22xg.R.iget(11103)==0&false)))
            {__CLR4_2_08k48k4lnxz22xg.R.inc(11104);intCode = Integer.parseInt(code);

        }__CLR4_2_08k48k4lnxz22xg.R.inc(11105);boolean isMulti = maybeEnableMultipart(req);

        __CLR4_2_08k48k4lnxz22xg.R.inc(11106);res.setContentType(TextHtml);
        __CLR4_2_08k48k4lnxz22xg.R.inc(11107);res.setStatus(intCode);
        __CLR4_2_08k48k4lnxz22xg.R.inc(11108);PrintWriter w = res.getWriter();

        __CLR4_2_08k48k4lnxz22xg.R.inc(11109);w.write("<title>Webserver Environment Variables</title>\n" +
            "    <style type=\"text/css\">\n" +
            "      body, td, th {font: 10pt Verdana, Arial, sans-serif; text-align: left}\n" +
            "      th {font-weight: bold}        \n" +
            "    </style>\n" +
            "    <body>\n" +
            "    <table border=\"0\">");

        // some get items
        __CLR4_2_08k48k4lnxz22xg.R.inc(11110);write(w, "Method", req.getMethod());
        __CLR4_2_08k48k4lnxz22xg.R.inc(11111);write(w, "Request URI", req.getRequestURI());
        __CLR4_2_08k48k4lnxz22xg.R.inc(11112);write(w, "Query String", req.getQueryString());

        // request headers (why is it an enumeration?)
        __CLR4_2_08k48k4lnxz22xg.R.inc(11113);Enumeration<String> headerNames = req.getHeaderNames();
        __CLR4_2_08k48k4lnxz22xg.R.inc(11114);while ((((headerNames.hasMoreElements())&&(__CLR4_2_08k48k4lnxz22xg.R.iget(11115)!=0|true))||(__CLR4_2_08k48k4lnxz22xg.R.iget(11116)==0&false))) {{
            __CLR4_2_08k48k4lnxz22xg.R.inc(11117);String header = headerNames.nextElement();
            __CLR4_2_08k48k4lnxz22xg.R.inc(11118);Enumeration<String> headers = req.getHeaders(header);
            __CLR4_2_08k48k4lnxz22xg.R.inc(11119);while ((((headers.hasMoreElements())&&(__CLR4_2_08k48k4lnxz22xg.R.iget(11120)!=0|true))||(__CLR4_2_08k48k4lnxz22xg.R.iget(11121)==0&false))) {{
                __CLR4_2_08k48k4lnxz22xg.R.inc(11122);write(w, header, headers.nextElement());
            }
        }}

        // the request params
        }__CLR4_2_08k48k4lnxz22xg.R.inc(11123);Enumeration<String> parameterNames = req.getParameterNames();
        __CLR4_2_08k48k4lnxz22xg.R.inc(11124);while ((((parameterNames.hasMoreElements())&&(__CLR4_2_08k48k4lnxz22xg.R.iget(11125)!=0|true))||(__CLR4_2_08k48k4lnxz22xg.R.iget(11126)==0&false))) {{
            __CLR4_2_08k48k4lnxz22xg.R.inc(11127);String name = parameterNames.nextElement();
            __CLR4_2_08k48k4lnxz22xg.R.inc(11128);String[] values = req.getParameterValues(name);
            __CLR4_2_08k48k4lnxz22xg.R.inc(11129);write(w, name, StringUtil.join(values, ", "));
        }

        // post body
        }__CLR4_2_08k48k4lnxz22xg.R.inc(11130);ByteBuffer byteBuffer = DataUtil.readToByteBuffer(req.getInputStream(), 0);
        __CLR4_2_08k48k4lnxz22xg.R.inc(11131);String postData = new String(byteBuffer.array(), StandardCharsets.UTF_8);
        __CLR4_2_08k48k4lnxz22xg.R.inc(11132);if ((((!StringUtil.isBlank(postData))&&(__CLR4_2_08k48k4lnxz22xg.R.iget(11133)!=0|true))||(__CLR4_2_08k48k4lnxz22xg.R.iget(11134)==0&false))) {{
            __CLR4_2_08k48k4lnxz22xg.R.inc(11135);write(w, "Post Data", postData);
        }

        // file uploads
        }__CLR4_2_08k48k4lnxz22xg.R.inc(11136);if ((((isMulti)&&(__CLR4_2_08k48k4lnxz22xg.R.iget(11137)!=0|true))||(__CLR4_2_08k48k4lnxz22xg.R.iget(11138)==0&false))) {{
            __CLR4_2_08k48k4lnxz22xg.R.inc(11139);Collection<Part> parts = req.getParts();
            __CLR4_2_08k48k4lnxz22xg.R.inc(11140);write(w, "Parts", String.valueOf(parts.size()));

            __CLR4_2_08k48k4lnxz22xg.R.inc(11141);for (Part part : parts) {{
                __CLR4_2_08k48k4lnxz22xg.R.inc(11142);String name = part.getName();
                __CLR4_2_08k48k4lnxz22xg.R.inc(11143);write(w, "Part " + name + " ContentType", part.getContentType());
                __CLR4_2_08k48k4lnxz22xg.R.inc(11144);write(w, "Part " + name + " Name", name);
                __CLR4_2_08k48k4lnxz22xg.R.inc(11145);write(w, "Part " + name + " Filename", part.getSubmittedFileName());
                __CLR4_2_08k48k4lnxz22xg.R.inc(11146);write(w, "Part " + name + " Size", String.valueOf(part.getSize()));
                __CLR4_2_08k48k4lnxz22xg.R.inc(11147);part.delete();
            }
        }}

        }__CLR4_2_08k48k4lnxz22xg.R.inc(11148);w.println("</table>");
    }finally{__CLR4_2_08k48k4lnxz22xg.R.flushNeeded();}}

    private static void write(PrintWriter w, String key, String val) {try{__CLR4_2_08k48k4lnxz22xg.R.inc(11149);
        __CLR4_2_08k48k4lnxz22xg.R.inc(11150);w.println("<tr><th>" + escape(key) + "</th><td>" + escape(val) + "</td></tr>");
    }finally{__CLR4_2_08k48k4lnxz22xg.R.flushNeeded();}}

    // allow the servlet to run as a main program, for local test
    public static void main(String[] args) {try{__CLR4_2_08k48k4lnxz22xg.R.inc(11151);
        __CLR4_2_08k48k4lnxz22xg.R.inc(11152);TestServer.start();
        __CLR4_2_08k48k4lnxz22xg.R.inc(11153);System.out.println(Url);
    }finally{__CLR4_2_08k48k4lnxz22xg.R.flushNeeded();}}

    private static boolean maybeEnableMultipart(HttpServletRequest req) {try{__CLR4_2_08k48k4lnxz22xg.R.inc(11154);
        __CLR4_2_08k48k4lnxz22xg.R.inc(11155);boolean isMulti = req.getContentType() != null
            && req.getContentType().startsWith("multipart/form-data");

        __CLR4_2_08k48k4lnxz22xg.R.inc(11156);if ((((isMulti)&&(__CLR4_2_08k48k4lnxz22xg.R.iget(11157)!=0|true))||(__CLR4_2_08k48k4lnxz22xg.R.iget(11158)==0&false))) {{
            __CLR4_2_08k48k4lnxz22xg.R.inc(11159);req.setAttribute(Request.__MULTIPART_CONFIG_ELEMENT, new MultipartConfigElement(
                System.getProperty("java.io.tmpdir")));
        }
        }__CLR4_2_08k48k4lnxz22xg.R.inc(11160);return isMulti;
    }finally{__CLR4_2_08k48k4lnxz22xg.R.flushNeeded();}}
}
