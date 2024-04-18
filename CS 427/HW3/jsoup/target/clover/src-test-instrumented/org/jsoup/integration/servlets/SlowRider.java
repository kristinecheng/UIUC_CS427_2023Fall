/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.integration.servlets;

import org.jsoup.integration.TestServer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Slowly, interminably writes output. For the purposes of testing timeouts and interrupts.
 */
public class SlowRider extends BaseServlet {public static class __CLR4_2_08nj8njlnxz22xp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767707166L,8589935092L,11252,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String Url = TestServer.map(SlowRider.class);
    private static final int SleepTime = 2000;
    public static final String MaxTimeParam = "maxTime";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {try{__CLR4_2_08nj8njlnxz22xp.R.inc(11215);
        __CLR4_2_08nj8njlnxz22xp.R.inc(11216);pause(1000);
        __CLR4_2_08nj8njlnxz22xp.R.inc(11217);res.setContentType(TextHtml);
        __CLR4_2_08nj8njlnxz22xp.R.inc(11218);res.setStatus(HttpServletResponse.SC_OK);
        __CLR4_2_08nj8njlnxz22xp.R.inc(11219);PrintWriter w = res.getWriter();

        __CLR4_2_08nj8njlnxz22xp.R.inc(11220);int maxTime = -1;
        __CLR4_2_08nj8njlnxz22xp.R.inc(11221);String maxTimeP = req.getParameter(MaxTimeParam);
        __CLR4_2_08nj8njlnxz22xp.R.inc(11222);if ((((maxTimeP != null)&&(__CLR4_2_08nj8njlnxz22xp.R.iget(11223)!=0|true))||(__CLR4_2_08nj8njlnxz22xp.R.iget(11224)==0&false))) {{
            __CLR4_2_08nj8njlnxz22xp.R.inc(11225);maxTime = Integer.valueOf(maxTimeP);
        }

        }__CLR4_2_08nj8njlnxz22xp.R.inc(11226);long startTime = System.currentTimeMillis();
        __CLR4_2_08nj8njlnxz22xp.R.inc(11227);while (true) {{
            __CLR4_2_08nj8njlnxz22xp.R.inc(11228);w.println("<p>Are you still there?");
            __CLR4_2_08nj8njlnxz22xp.R.inc(11229);boolean err = w.checkError(); // flush, and check still ok
            __CLR4_2_08nj8njlnxz22xp.R.inc(11230);if ((((err)&&(__CLR4_2_08nj8njlnxz22xp.R.iget(11231)!=0|true))||(__CLR4_2_08nj8njlnxz22xp.R.iget(11232)==0&false))) {{
                __CLR4_2_08nj8njlnxz22xp.R.inc(11233);log("Remote connection lost");
                __CLR4_2_08nj8njlnxz22xp.R.inc(11234);break;
            }
            }__CLR4_2_08nj8njlnxz22xp.R.inc(11235);if ((((pause(SleepTime))&&(__CLR4_2_08nj8njlnxz22xp.R.iget(11236)!=0|true))||(__CLR4_2_08nj8njlnxz22xp.R.iget(11237)==0&false))) {__CLR4_2_08nj8njlnxz22xp.R.inc(11238);break;

            }__CLR4_2_08nj8njlnxz22xp.R.inc(11239);if ((((maxTime > 0 && System.currentTimeMillis() > startTime + maxTime)&&(__CLR4_2_08nj8njlnxz22xp.R.iget(11240)!=0|true))||(__CLR4_2_08nj8njlnxz22xp.R.iget(11241)==0&false))) {{
                __CLR4_2_08nj8njlnxz22xp.R.inc(11242);w.println("<h1>outatime</h1>");
                __CLR4_2_08nj8njlnxz22xp.R.inc(11243);break;
            }
        }}
    }}finally{__CLR4_2_08nj8njlnxz22xp.R.flushNeeded();}}

    private static boolean pause(int sleepTime) {try{__CLR4_2_08nj8njlnxz22xp.R.inc(11244);
        __CLR4_2_08nj8njlnxz22xp.R.inc(11245);try {
            __CLR4_2_08nj8njlnxz22xp.R.inc(11246);Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            __CLR4_2_08nj8njlnxz22xp.R.inc(11247);return true;
        }
        __CLR4_2_08nj8njlnxz22xp.R.inc(11248);return false;
    }finally{__CLR4_2_08nj8njlnxz22xp.R.flushNeeded();}}

    // allow the servlet to run as a main program, for local test
    public static void main(String[] args) {try{__CLR4_2_08nj8njlnxz22xp.R.inc(11249);
        __CLR4_2_08nj8njlnxz22xp.R.inc(11250);TestServer.start();
        __CLR4_2_08nj8njlnxz22xp.R.inc(11251);System.out.println(Url);
    }finally{__CLR4_2_08nj8njlnxz22xp.R.flushNeeded();}}
}
