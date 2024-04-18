/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.nodes;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.integration.UrlConnectTestUtil;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

/**
 * Fetches HTML entity names from w3.org json, and outputs data files for optimized used in Entities.
 * I refuse to believe that entity names like "NotNestedLessLess" are valuable or useful for HTML authors. Implemented
 * only to be complete.
 */
class BuildEntities {public static class __CLR4_2_0e73e73lnxz236a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767707166L,8589935092L,18470,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) throws IOException {try{__CLR4_2_0e73e73lnxz236a.R.inc(18399);
        __CLR4_2_0e73e73lnxz236a.R.inc(18400);String url = "https://www.w3.org/TR/2012/WD-html5-20121025/entities.json";
        __CLR4_2_0e73e73lnxz236a.R.inc(18401);Connection.Response res = Jsoup.connect(url)
            .ignoreContentType(true)
            .userAgent(UrlConnectTestUtil.browserUa)
            .execute();

        __CLR4_2_0e73e73lnxz236a.R.inc(18402);Gson gson = new Gson();
        __CLR4_2_0e73e73lnxz236a.R.inc(18403);Map<String, CharacterRef> input = gson.fromJson(res.body(),
            new TypeToken<Map<String, CharacterRef>>() {
            }.getType());


        // build name sorted base and full character lists:
        __CLR4_2_0e73e73lnxz236a.R.inc(18404);ArrayList<CharacterRef> base = new ArrayList<>();
        __CLR4_2_0e73e73lnxz236a.R.inc(18405);ArrayList<CharacterRef> full = new ArrayList<>();

        __CLR4_2_0e73e73lnxz236a.R.inc(18406);for (Map.Entry<String, CharacterRef> entry : input.entrySet()) {{
            __CLR4_2_0e73e73lnxz236a.R.inc(18407);String name = entry.getKey().substring(1); // name is like &acute or &acute; , trim &
            __CLR4_2_0e73e73lnxz236a.R.inc(18408);CharacterRef ref = entry.getValue();
            __CLR4_2_0e73e73lnxz236a.R.inc(18409);if ((((name.endsWith(";"))&&(__CLR4_2_0e73e73lnxz236a.R.iget(18410)!=0|true))||(__CLR4_2_0e73e73lnxz236a.R.iget(18411)==0&false))) {{
                __CLR4_2_0e73e73lnxz236a.R.inc(18412);name = name.substring(0, name.length() - 1);
                __CLR4_2_0e73e73lnxz236a.R.inc(18413);full.add(ref);
            } }else {{
                __CLR4_2_0e73e73lnxz236a.R.inc(18414);base.add(ref);
            }
            }__CLR4_2_0e73e73lnxz236a.R.inc(18415);ref.name = name;
        }
        }__CLR4_2_0e73e73lnxz236a.R.inc(18416);Collections.sort(base, byName);
        __CLR4_2_0e73e73lnxz236a.R.inc(18417);Collections.sort(full, byName);

        // now determine code point order
        __CLR4_2_0e73e73lnxz236a.R.inc(18418);ArrayList<CharacterRef> baseByCode = new ArrayList<>(base);
        __CLR4_2_0e73e73lnxz236a.R.inc(18419);ArrayList<CharacterRef> fullByCode = new ArrayList<>(full);
        __CLR4_2_0e73e73lnxz236a.R.inc(18420);Collections.sort(baseByCode, byCode);
        __CLR4_2_0e73e73lnxz236a.R.inc(18421);Collections.sort(fullByCode, byCode);

        // and update their codepoint index.
        __CLR4_2_0e73e73lnxz236a.R.inc(18422);@SuppressWarnings("unchecked") ArrayList<CharacterRef>[] codelists = new ArrayList[]{baseByCode, fullByCode};
        __CLR4_2_0e73e73lnxz236a.R.inc(18423);for (ArrayList<CharacterRef> codelist : codelists) {{
            __CLR4_2_0e73e73lnxz236a.R.inc(18424);for (int i = 0; (((i < codelist.size())&&(__CLR4_2_0e73e73lnxz236a.R.iget(18425)!=0|true))||(__CLR4_2_0e73e73lnxz236a.R.iget(18426)==0&false)); i++) {{
                __CLR4_2_0e73e73lnxz236a.R.inc(18427);codelist.get(i).codeIndex = i;
            }
        }}

        // now write them
        }__CLR4_2_0e73e73lnxz236a.R.inc(18428);persist("entities-full", full);
        __CLR4_2_0e73e73lnxz236a.R.inc(18429);persist("entities-base", base);

        __CLR4_2_0e73e73lnxz236a.R.inc(18430);System.out.println("Full size: " + full.size() + ", base size: " + base.size());
    }finally{__CLR4_2_0e73e73lnxz236a.R.flushNeeded();}}

    private static void persist(String name, ArrayList<CharacterRef> refs) throws IOException {try{__CLR4_2_0e73e73lnxz236a.R.inc(18431);
        __CLR4_2_0e73e73lnxz236a.R.inc(18432);File file = Files.createTempFile(name, ".txt").toFile();
        __CLR4_2_0e73e73lnxz236a.R.inc(18433);FileWriter writer = new FileWriter(file, false);
        __CLR4_2_0e73e73lnxz236a.R.inc(18434);writer.append("static final String points = \"");
        __CLR4_2_0e73e73lnxz236a.R.inc(18435);for (CharacterRef ref : refs) {{
            __CLR4_2_0e73e73lnxz236a.R.inc(18436);writer.append(ref.toString()).append('&');
        }
        }__CLR4_2_0e73e73lnxz236a.R.inc(18437);writer.append("\";\n");
        __CLR4_2_0e73e73lnxz236a.R.inc(18438);writer.close();

        __CLR4_2_0e73e73lnxz236a.R.inc(18439);System.out.println("Wrote " + name + " to " + file.getAbsolutePath());
    }finally{__CLR4_2_0e73e73lnxz236a.R.flushNeeded();}}


    private static class CharacterRef {
        int[] codepoints;
        String name;
        int codeIndex;

        @Override
        public String toString() {try{__CLR4_2_0e73e73lnxz236a.R.inc(18440);
            __CLR4_2_0e73e73lnxz236a.R.inc(18441);return name
                + "="
                + d(codepoints[0])
                + ((((codepoints.length > 1 )&&(__CLR4_2_0e73e73lnxz236a.R.iget(18442)!=0|true))||(__CLR4_2_0e73e73lnxz236a.R.iget(18443)==0&false))? "," + d(codepoints[1]) : "")
                + ";" + d(codeIndex);
        }finally{__CLR4_2_0e73e73lnxz236a.R.flushNeeded();}}
    }

    private static String d(int d) {try{__CLR4_2_0e73e73lnxz236a.R.inc(18444);
        __CLR4_2_0e73e73lnxz236a.R.inc(18445);return Integer.toString(d, Entities.codepointRadix);
    }finally{__CLR4_2_0e73e73lnxz236a.R.flushNeeded();}}

    private static class ByName implements Comparator<CharacterRef> {
        public int compare(CharacterRef o1, CharacterRef o2) {try{__CLR4_2_0e73e73lnxz236a.R.inc(18446);
            __CLR4_2_0e73e73lnxz236a.R.inc(18447);return o1.name.compareTo(o2.name);
        }finally{__CLR4_2_0e73e73lnxz236a.R.flushNeeded();}}
    }

    private static class ByCode implements Comparator<CharacterRef> {
        public int compare(CharacterRef o1, CharacterRef o2) {try{__CLR4_2_0e73e73lnxz236a.R.inc(18448);
            __CLR4_2_0e73e73lnxz236a.R.inc(18449);int[] c1 = o1.codepoints;
            __CLR4_2_0e73e73lnxz236a.R.inc(18450);int[] c2 = o2.codepoints;
            __CLR4_2_0e73e73lnxz236a.R.inc(18451);int first = c1[0] - c2[0];
            __CLR4_2_0e73e73lnxz236a.R.inc(18452);if ((((first != 0)&&(__CLR4_2_0e73e73lnxz236a.R.iget(18453)!=0|true))||(__CLR4_2_0e73e73lnxz236a.R.iget(18454)==0&false)))
                {__CLR4_2_0e73e73lnxz236a.R.inc(18455);return first;
            }__CLR4_2_0e73e73lnxz236a.R.inc(18456);if ((((c1.length == 1 && c2.length == 1)&&(__CLR4_2_0e73e73lnxz236a.R.iget(18457)!=0|true))||(__CLR4_2_0e73e73lnxz236a.R.iget(18458)==0&false))) {{ // for the same code, use the shorter name
                __CLR4_2_0e73e73lnxz236a.R.inc(18459);int len = o2.name.length() - o1.name.length();
                __CLR4_2_0e73e73lnxz236a.R.inc(18460);if ((((len != 0)&&(__CLR4_2_0e73e73lnxz236a.R.iget(18461)!=0|true))||(__CLR4_2_0e73e73lnxz236a.R.iget(18462)==0&false)))
                    {__CLR4_2_0e73e73lnxz236a.R.inc(18463);return len;
                }__CLR4_2_0e73e73lnxz236a.R.inc(18464);return o1.name.compareTo(o2.name);
            }
            }__CLR4_2_0e73e73lnxz236a.R.inc(18465);if ((((c1.length == 2 && c2.length == 2)&&(__CLR4_2_0e73e73lnxz236a.R.iget(18466)!=0|true))||(__CLR4_2_0e73e73lnxz236a.R.iget(18467)==0&false)))
                {__CLR4_2_0e73e73lnxz236a.R.inc(18468);return c1[1] - c2[1];
            }else
                {__CLR4_2_0e73e73lnxz236a.R.inc(18469);return c2.length - c1.length; // pushes multi down the list so hits on singles first (don't support multi lookup by codepoint yet)
        }}finally{__CLR4_2_0e73e73lnxz236a.R.flushNeeded();}}
    }

    private static ByName byName = new ByName();
    private static ByCode byCode = new ByCode();
}
