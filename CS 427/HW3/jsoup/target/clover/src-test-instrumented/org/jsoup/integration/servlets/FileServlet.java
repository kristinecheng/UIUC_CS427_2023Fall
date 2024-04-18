/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.integration.servlets;

import org.jsoup.integration.ParseTest;
import org.jsoup.integration.TestServer;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;


public class FileServlet extends BaseServlet {public static class __CLR4_2_08m18m1lnxz22xi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767707166L,8589935092L,11182,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String Url = TestServer.map(FileServlet.class);
    public static final String ContentTypeParam = "contentType";
    public static final String LocationParam = "loc";
    public static final String DefaultType = "text/html";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {try{__CLR4_2_08m18m1lnxz22xi.R.inc(11161);
        __CLR4_2_08m18m1lnxz22xi.R.inc(11162);String contentType = req.getParameter(ContentTypeParam);
        __CLR4_2_08m18m1lnxz22xi.R.inc(11163);if ((((contentType == null)&&(__CLR4_2_08m18m1lnxz22xi.R.iget(11164)!=0|true))||(__CLR4_2_08m18m1lnxz22xi.R.iget(11165)==0&false)))
            {__CLR4_2_08m18m1lnxz22xi.R.inc(11166);contentType = DefaultType;
        }__CLR4_2_08m18m1lnxz22xi.R.inc(11167);String location = req.getPathInfo();

        __CLR4_2_08m18m1lnxz22xi.R.inc(11168);File file = ParseTest.getFile(location);
        __CLR4_2_08m18m1lnxz22xi.R.inc(11169);if ((((file.exists())&&(__CLR4_2_08m18m1lnxz22xi.R.iget(11170)!=0|true))||(__CLR4_2_08m18m1lnxz22xi.R.iget(11171)==0&false))) {{
            __CLR4_2_08m18m1lnxz22xi.R.inc(11172);res.setContentType(contentType);
            __CLR4_2_08m18m1lnxz22xi.R.inc(11173);res.setStatus(HttpServletResponse.SC_OK);

            __CLR4_2_08m18m1lnxz22xi.R.inc(11174);ServletOutputStream out = res.getOutputStream();
            __CLR4_2_08m18m1lnxz22xi.R.inc(11175);Files.copy(file.toPath(), out);
            __CLR4_2_08m18m1lnxz22xi.R.inc(11176);out.flush();
        } }else {{
            __CLR4_2_08m18m1lnxz22xi.R.inc(11177);res.setStatus(HttpServletResponse.SC_NOT_FOUND);
        }
    }}finally{__CLR4_2_08m18m1lnxz22xi.R.flushNeeded();}}

    public static String urlTo(String path) {try{__CLR4_2_08m18m1lnxz22xi.R.inc(11178);
        __CLR4_2_08m18m1lnxz22xi.R.inc(11179);return Url + path;
    }finally{__CLR4_2_08m18m1lnxz22xi.R.flushNeeded();}}

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {try{__CLR4_2_08m18m1lnxz22xi.R.inc(11180);
        __CLR4_2_08m18m1lnxz22xi.R.inc(11181);doGet(req, res);
    }finally{__CLR4_2_08m18m1lnxz22xi.R.flushNeeded();}}
}
