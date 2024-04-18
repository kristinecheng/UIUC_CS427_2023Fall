/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.select;

import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Tag;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CssTest {static class __CLR4_2_0gw1gw1lnxz239s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767707166L,8589935092L,22031,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	private Document html = null;
	private static String htmlString;
	
	@BeforeClass
	public static void initClass() {try{__CLR4_2_0gw1gw1lnxz239s.R.inc(21889);
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21890);StringBuilder sb = new StringBuilder("<html><head></head><body>");
		
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21891);sb.append("<div id='pseudo'>");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21892);for (int i = 1; (((i <= 10)&&(__CLR4_2_0gw1gw1lnxz239s.R.iget(21893)!=0|true))||(__CLR4_2_0gw1gw1lnxz239s.R.iget(21894)==0&false)); i++) {{
			__CLR4_2_0gw1gw1lnxz239s.R.inc(21895);sb.append(String.format("<p>%d</p>",i));
		}
		}__CLR4_2_0gw1gw1lnxz239s.R.inc(21896);sb.append("</div>");

		__CLR4_2_0gw1gw1lnxz239s.R.inc(21897);sb.append("<div id='type'>");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21898);for (int i = 1; (((i <= 10)&&(__CLR4_2_0gw1gw1lnxz239s.R.iget(21899)!=0|true))||(__CLR4_2_0gw1gw1lnxz239s.R.iget(21900)==0&false)); i++) {{
			__CLR4_2_0gw1gw1lnxz239s.R.inc(21901);sb.append(String.format("<p>%d</p>",i));
			__CLR4_2_0gw1gw1lnxz239s.R.inc(21902);sb.append(String.format("<span>%d</span>",i));
			__CLR4_2_0gw1gw1lnxz239s.R.inc(21903);sb.append(String.format("<em>%d</em>",i));
            __CLR4_2_0gw1gw1lnxz239s.R.inc(21904);sb.append(String.format("<svg>%d</svg>",i));
		}
		}__CLR4_2_0gw1gw1lnxz239s.R.inc(21905);sb.append("</div>");

		__CLR4_2_0gw1gw1lnxz239s.R.inc(21906);sb.append("<span id='onlySpan'><br /></span>");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21907);sb.append("<p class='empty'><!-- Comment only is still empty! --></p>");
		
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21908);sb.append("<div id='only'>");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21909);sb.append("Some text before the <em>only</em> child in this div");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21910);sb.append("</div>");
		
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21911);sb.append("</body></html>");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21912);htmlString = sb.toString();
	}finally{__CLR4_2_0gw1gw1lnxz239s.R.flushNeeded();}}

	@Before
	public void init() {try{__CLR4_2_0gw1gw1lnxz239s.R.inc(21913);
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21914);html  = Jsoup.parse(htmlString);
	}finally{__CLR4_2_0gw1gw1lnxz239s.R.flushNeeded();}}
	
	@Test
	public void firstChild() {__CLR4_2_0gw1gw1lnxz239s.R.globalSliceStart(getClass().getName(),21915);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0hq7evngwr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gw1gw1lnxz239s.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gw1gw1lnxz239s.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.CssTest.firstChild",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21915,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0hq7evngwr(){try{__CLR4_2_0gw1gw1lnxz239s.R.inc(21915);
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21916);check(html.select("#pseudo :first-child"), "1");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21917);check(html.select("html:first-child"));
	}finally{__CLR4_2_0gw1gw1lnxz239s.R.flushNeeded();}}

	@Test
	public void lastChild() {__CLR4_2_0gw1gw1lnxz239s.R.globalSliceStart(getClass().getName(),21918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0hks819gwu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gw1gw1lnxz239s.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gw1gw1lnxz239s.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.CssTest.lastChild",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21918,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0hks819gwu(){try{__CLR4_2_0gw1gw1lnxz239s.R.inc(21918);
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21919);check(html.select("#pseudo :last-child"), "10");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21920);check(html.select("html:last-child"));
	}finally{__CLR4_2_0gw1gw1lnxz239s.R.flushNeeded();}}
	
	@Test
	public void nthChild_simple() {__CLR4_2_0gw1gw1lnxz239s.R.globalSliceStart(getClass().getName(),21921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0qyd52agwx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gw1gw1lnxz239s.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gw1gw1lnxz239s.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.CssTest.nthChild_simple",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21921,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0qyd52agwx(){try{__CLR4_2_0gw1gw1lnxz239s.R.inc(21921);
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21922);for(int i = 1; (((i <=10)&&(__CLR4_2_0gw1gw1lnxz239s.R.iget(21923)!=0|true))||(__CLR4_2_0gw1gw1lnxz239s.R.iget(21924)==0&false)); i++) {{
			__CLR4_2_0gw1gw1lnxz239s.R.inc(21925);check(html.select(String.format("#pseudo :nth-child(%d)", i)), String.valueOf(i));
		}
	}}finally{__CLR4_2_0gw1gw1lnxz239s.R.flushNeeded();}}

    @Test
    public void nthOfType_unknownTag() {__CLR4_2_0gw1gw1lnxz239s.R.globalSliceStart(getClass().getName(),21926);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0ypmnk3gx2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gw1gw1lnxz239s.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gw1gw1lnxz239s.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.CssTest.nthOfType_unknownTag",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21926,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0ypmnk3gx2(){try{__CLR4_2_0gw1gw1lnxz239s.R.inc(21926);
        __CLR4_2_0gw1gw1lnxz239s.R.inc(21927);for(int i = 1; (((i <=10)&&(__CLR4_2_0gw1gw1lnxz239s.R.iget(21928)!=0|true))||(__CLR4_2_0gw1gw1lnxz239s.R.iget(21929)==0&false)); i++) {{
            __CLR4_2_0gw1gw1lnxz239s.R.inc(21930);check(html.select(String.format("#type svg:nth-of-type(%d)", i)), String.valueOf(i));
        }
    }}finally{__CLR4_2_0gw1gw1lnxz239s.R.flushNeeded();}}

	@Test
	public void nthLastChild_simple() {__CLR4_2_0gw1gw1lnxz239s.R.globalSliceStart(getClass().getName(),21931);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_02v2nzggx7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gw1gw1lnxz239s.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gw1gw1lnxz239s.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.CssTest.nthLastChild_simple",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21931,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_02v2nzggx7(){try{__CLR4_2_0gw1gw1lnxz239s.R.inc(21931);
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21932);for(int i = 1; (((i <=10)&&(__CLR4_2_0gw1gw1lnxz239s.R.iget(21933)!=0|true))||(__CLR4_2_0gw1gw1lnxz239s.R.iget(21934)==0&false)); i++) {{
			__CLR4_2_0gw1gw1lnxz239s.R.inc(21935);check(html.select(String.format("#pseudo :nth-last-child(%d)", i)), String.valueOf(11-i));
		}
	}}finally{__CLR4_2_0gw1gw1lnxz239s.R.flushNeeded();}}

	@Test
	public void nthOfType_simple() {__CLR4_2_0gw1gw1lnxz239s.R.globalSliceStart(getClass().getName(),21936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0nz5mezgxc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gw1gw1lnxz239s.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gw1gw1lnxz239s.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.CssTest.nthOfType_simple",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21936,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0nz5mezgxc(){try{__CLR4_2_0gw1gw1lnxz239s.R.inc(21936);
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21937);for(int i = 1; (((i <=10)&&(__CLR4_2_0gw1gw1lnxz239s.R.iget(21938)!=0|true))||(__CLR4_2_0gw1gw1lnxz239s.R.iget(21939)==0&false)); i++) {{
			__CLR4_2_0gw1gw1lnxz239s.R.inc(21940);check(html.select(String.format("#type p:nth-of-type(%d)", i)), String.valueOf(i));
		}
	}}finally{__CLR4_2_0gw1gw1lnxz239s.R.flushNeeded();}}
	
	@Test
	public void nthLastOfType_simple() {__CLR4_2_0gw1gw1lnxz239s.R.globalSliceStart(getClass().getName(),21941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0cjqj9rgxh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gw1gw1lnxz239s.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gw1gw1lnxz239s.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.CssTest.nthLastOfType_simple",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21941,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0cjqj9rgxh(){try{__CLR4_2_0gw1gw1lnxz239s.R.inc(21941);
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21942);for(int i = 1; (((i <=10)&&(__CLR4_2_0gw1gw1lnxz239s.R.iget(21943)!=0|true))||(__CLR4_2_0gw1gw1lnxz239s.R.iget(21944)==0&false)); i++) {{
			__CLR4_2_0gw1gw1lnxz239s.R.inc(21945);check(html.select(String.format("#type :nth-last-of-type(%d)", i)), String.valueOf(11-i),String.valueOf(11-i),String.valueOf(11-i),String.valueOf(11-i));
		}
	}}finally{__CLR4_2_0gw1gw1lnxz239s.R.flushNeeded();}}

	@Test
	public void nthChild_advanced() {__CLR4_2_0gw1gw1lnxz239s.R.globalSliceStart(getClass().getName(),21946);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0u72wtugxm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gw1gw1lnxz239s.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gw1gw1lnxz239s.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.CssTest.nthChild_advanced",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21946,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0u72wtugxm(){try{__CLR4_2_0gw1gw1lnxz239s.R.inc(21946);
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21947);check(html.select("#pseudo :nth-child(-5)"));
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21948);check(html.select("#pseudo :nth-child(odd)"), "1", "3", "5", "7", "9");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21949);check(html.select("#pseudo :nth-child(2n-1)"), "1", "3", "5", "7", "9");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21950);check(html.select("#pseudo :nth-child(2n+1)"), "1", "3", "5", "7", "9");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21951);check(html.select("#pseudo :nth-child(2n+3)"), "3", "5", "7", "9");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21952);check(html.select("#pseudo :nth-child(even)"), "2", "4", "6", "8", "10");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21953);check(html.select("#pseudo :nth-child(2n)"), "2", "4", "6", "8", "10");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21954);check(html.select("#pseudo :nth-child(3n-1)"), "2", "5", "8");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21955);check(html.select("#pseudo :nth-child(-2n+5)"), "1", "3", "5");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21956);check(html.select("#pseudo :nth-child(+5)"), "5");
	}finally{__CLR4_2_0gw1gw1lnxz239s.R.flushNeeded();}}

	@Test
	public void nthOfType_advanced() {__CLR4_2_0gw1gw1lnxz239s.R.globalSliceStart(getClass().getName(),21957);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_09jwbpngxx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gw1gw1lnxz239s.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gw1gw1lnxz239s.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.CssTest.nthOfType_advanced",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21957,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_09jwbpngxx(){try{__CLR4_2_0gw1gw1lnxz239s.R.inc(21957);
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21958);check(html.select("#type :nth-of-type(-5)"));
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21959);check(html.select("#type p:nth-of-type(odd)"), "1", "3", "5", "7", "9");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21960);check(html.select("#type em:nth-of-type(2n-1)"), "1", "3", "5", "7", "9");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21961);check(html.select("#type p:nth-of-type(2n+1)"), "1", "3", "5", "7", "9");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21962);check(html.select("#type span:nth-of-type(2n+3)"), "3", "5", "7", "9");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21963);check(html.select("#type p:nth-of-type(even)"), "2", "4", "6", "8", "10");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21964);check(html.select("#type p:nth-of-type(2n)"), "2", "4", "6", "8", "10");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21965);check(html.select("#type p:nth-of-type(3n-1)"), "2", "5", "8");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21966);check(html.select("#type p:nth-of-type(-2n+5)"), "1", "3", "5");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21967);check(html.select("#type :nth-of-type(+5)"), "5", "5", "5", "5");
	}finally{__CLR4_2_0gw1gw1lnxz239s.R.flushNeeded();}}

	
	@Test
	public void nthLastChild_advanced() {__CLR4_2_0gw1gw1lnxz239s.R.globalSliceStart(getClass().getName(),21968);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0yf6w58gy8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gw1gw1lnxz239s.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gw1gw1lnxz239s.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.CssTest.nthLastChild_advanced",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21968,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0yf6w58gy8(){try{__CLR4_2_0gw1gw1lnxz239s.R.inc(21968);
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21969);check(html.select("#pseudo :nth-last-child(-5)"));
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21970);check(html.select("#pseudo :nth-last-child(odd)"), "2", "4", "6", "8", "10");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21971);check(html.select("#pseudo :nth-last-child(2n-1)"), "2", "4", "6", "8", "10");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21972);check(html.select("#pseudo :nth-last-child(2n+1)"), "2", "4", "6", "8", "10");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21973);check(html.select("#pseudo :nth-last-child(2n+3)"), "2", "4", "6", "8");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21974);check(html.select("#pseudo :nth-last-child(even)"), "1", "3", "5", "7", "9");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21975);check(html.select("#pseudo :nth-last-child(2n)"), "1", "3", "5", "7", "9");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21976);check(html.select("#pseudo :nth-last-child(3n-1)"), "3", "6", "9");

		__CLR4_2_0gw1gw1lnxz239s.R.inc(21977);check(html.select("#pseudo :nth-last-child(-2n+5)"), "6", "8", "10");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21978);check(html.select("#pseudo :nth-last-child(+5)"), "6");
	}finally{__CLR4_2_0gw1gw1lnxz239s.R.flushNeeded();}}

	@Test
	public void nthLastOfType_advanced() {__CLR4_2_0gw1gw1lnxz239s.R.globalSliceStart(getClass().getName(),21979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_01iwdfjgyj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gw1gw1lnxz239s.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gw1gw1lnxz239s.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.CssTest.nthLastOfType_advanced",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21979,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_01iwdfjgyj(){try{__CLR4_2_0gw1gw1lnxz239s.R.inc(21979);
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21980);check(html.select("#type :nth-last-of-type(-5)"));
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21981);check(html.select("#type p:nth-last-of-type(odd)"), "2", "4", "6", "8", "10");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21982);check(html.select("#type em:nth-last-of-type(2n-1)"), "2", "4", "6", "8", "10");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21983);check(html.select("#type p:nth-last-of-type(2n+1)"), "2", "4", "6", "8", "10");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21984);check(html.select("#type span:nth-last-of-type(2n+3)"), "2", "4", "6", "8");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21985);check(html.select("#type p:nth-last-of-type(even)"), "1", "3", "5", "7", "9");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21986);check(html.select("#type p:nth-last-of-type(2n)"), "1", "3", "5", "7", "9");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21987);check(html.select("#type p:nth-last-of-type(3n-1)"), "3", "6", "9");

		__CLR4_2_0gw1gw1lnxz239s.R.inc(21988);check(html.select("#type span:nth-last-of-type(-2n+5)"), "6", "8", "10");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21989);check(html.select("#type :nth-last-of-type(+5)"), "6", "6", "6", "6");
	}finally{__CLR4_2_0gw1gw1lnxz239s.R.flushNeeded();}}
	
	@Test
	public void firstOfType() {__CLR4_2_0gw1gw1lnxz239s.R.globalSliceStart(getClass().getName(),21990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0tvxm7cgyu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gw1gw1lnxz239s.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gw1gw1lnxz239s.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.CssTest.firstOfType",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21990,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0tvxm7cgyu(){try{__CLR4_2_0gw1gw1lnxz239s.R.inc(21990);
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21991);check(html.select("div:not(#only) :first-of-type"), "1", "1", "1", "1", "1");
	}finally{__CLR4_2_0gw1gw1lnxz239s.R.flushNeeded();}}

	@Test
	public void lastOfType() {__CLR4_2_0gw1gw1lnxz239s.R.globalSliceStart(getClass().getName(),21992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0p7uq1agyw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gw1gw1lnxz239s.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gw1gw1lnxz239s.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.CssTest.lastOfType",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21992,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0p7uq1agyw(){try{__CLR4_2_0gw1gw1lnxz239s.R.inc(21992);
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21993);check(html.select("div:not(#only) :last-of-type"), "10", "10", "10", "10", "10");
	}finally{__CLR4_2_0gw1gw1lnxz239s.R.flushNeeded();}}

	@Test
	public void empty() {__CLR4_2_0gw1gw1lnxz239s.R.globalSliceStart(getClass().getName(),21994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0g4yvp0gyy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gw1gw1lnxz239s.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gw1gw1lnxz239s.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.CssTest.empty",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),21994,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0g4yvp0gyy(){try{__CLR4_2_0gw1gw1lnxz239s.R.inc(21994);
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21995);final Elements sel = html.select(":empty");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21996);assertEquals(3, sel.size());
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21997);assertEquals("head", sel.get(0).tagName());
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21998);assertEquals("br", sel.get(1).tagName());
		__CLR4_2_0gw1gw1lnxz239s.R.inc(21999);assertEquals("p", sel.get(2).tagName());
	}finally{__CLR4_2_0gw1gw1lnxz239s.R.flushNeeded();}}
	
	@Test
	public void onlyChild() {__CLR4_2_0gw1gw1lnxz239s.R.globalSliceStart(getClass().getName(),22000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0iif507gz4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gw1gw1lnxz239s.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gw1gw1lnxz239s.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.CssTest.onlyChild",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22000,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0iif507gz4(){try{__CLR4_2_0gw1gw1lnxz239s.R.inc(22000);
		__CLR4_2_0gw1gw1lnxz239s.R.inc(22001);final Elements sel = html.select("span :only-child");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(22002);assertEquals(1, sel.size());
		__CLR4_2_0gw1gw1lnxz239s.R.inc(22003);assertEquals("br", sel.get(0).tagName());
		
		__CLR4_2_0gw1gw1lnxz239s.R.inc(22004);check(html.select("#only :only-child"), "only");
	}finally{__CLR4_2_0gw1gw1lnxz239s.R.flushNeeded();}}
	
	@Test
	public void onlyOfType() {__CLR4_2_0gw1gw1lnxz239s.R.globalSliceStart(getClass().getName(),22005);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0guixukgz9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gw1gw1lnxz239s.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gw1gw1lnxz239s.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.CssTest.onlyOfType",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22005,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0guixukgz9(){try{__CLR4_2_0gw1gw1lnxz239s.R.inc(22005);
		__CLR4_2_0gw1gw1lnxz239s.R.inc(22006);final Elements sel = html.select(":only-of-type");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(22007);assertEquals(6, sel.size());
		__CLR4_2_0gw1gw1lnxz239s.R.inc(22008);assertEquals("head", sel.get(0).tagName());
		__CLR4_2_0gw1gw1lnxz239s.R.inc(22009);assertEquals("body", sel.get(1).tagName());
		__CLR4_2_0gw1gw1lnxz239s.R.inc(22010);assertEquals("span", sel.get(2).tagName());
		__CLR4_2_0gw1gw1lnxz239s.R.inc(22011);assertEquals("br", sel.get(3).tagName());
		__CLR4_2_0gw1gw1lnxz239s.R.inc(22012);assertEquals("p", sel.get(4).tagName());
		__CLR4_2_0gw1gw1lnxz239s.R.inc(22013);assertTrue(sel.get(4).hasClass("empty"));
		__CLR4_2_0gw1gw1lnxz239s.R.inc(22014);assertEquals("em", sel.get(5).tagName());
	}finally{__CLR4_2_0gw1gw1lnxz239s.R.flushNeeded();}}
	
	protected void check(Elements result, String...expectedContent ) {try{__CLR4_2_0gw1gw1lnxz239s.R.inc(22015);
		__CLR4_2_0gw1gw1lnxz239s.R.inc(22016);assertEquals("Number of elements", expectedContent.length, result.size());
		__CLR4_2_0gw1gw1lnxz239s.R.inc(22017);for (int i = 0; (((i < expectedContent.length)&&(__CLR4_2_0gw1gw1lnxz239s.R.iget(22018)!=0|true))||(__CLR4_2_0gw1gw1lnxz239s.R.iget(22019)==0&false)); i++) {{
			__CLR4_2_0gw1gw1lnxz239s.R.inc(22020);assertNotNull(result.get(i));
			__CLR4_2_0gw1gw1lnxz239s.R.inc(22021);assertEquals("Expected element",expectedContent[i], result.get(i).ownText());
		}
	}}finally{__CLR4_2_0gw1gw1lnxz239s.R.flushNeeded();}}

	
	@Test
	public void root() {__CLR4_2_0gw1gw1lnxz239s.R.globalSliceStart(getClass().getName(),22022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0rnvqw9gzq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_0gw1gw1lnxz239s.R.rethrow($CLV_t2$);}finally{__CLR4_2_0gw1gw1lnxz239s.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.CssTest.root",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),22022,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0rnvqw9gzq(){try{__CLR4_2_0gw1gw1lnxz239s.R.inc(22022);
		__CLR4_2_0gw1gw1lnxz239s.R.inc(22023);Elements sel = html.select(":root");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(22024);assertEquals(1, sel.size());
		__CLR4_2_0gw1gw1lnxz239s.R.inc(22025);assertNotNull(sel.get(0));
		__CLR4_2_0gw1gw1lnxz239s.R.inc(22026);assertEquals(Tag.valueOf("html"), sel.get(0).tag());

		__CLR4_2_0gw1gw1lnxz239s.R.inc(22027);Elements sel2 = html.select("body").select(":root");
		__CLR4_2_0gw1gw1lnxz239s.R.inc(22028);assertEquals(1, sel2.size());
		__CLR4_2_0gw1gw1lnxz239s.R.inc(22029);assertNotNull(sel2.get(0));
		__CLR4_2_0gw1gw1lnxz239s.R.inc(22030);assertEquals(Tag.valueOf("body"), sel2.get(0).tag());
	}finally{__CLR4_2_0gw1gw1lnxz239s.R.flushNeeded();}}

}
