/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package org.jsoup.select;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.NodeFilter.FilterResult;

/**
 * Depth-first node traversor. Use to iterate through all nodes under and including the specified root node.
 * <p>
 * This implementation does not use recursion, so a deep DOM does not risk blowing the stack.
 * </p>
 */
public class NodeTraversor {public static class __CLR4_2_07oz7ozlnxz22sw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006c\u006f\u0067\u0061\u006e\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0043\u0053\u0020\u0034\u0032\u0037\u005c\u005c\u0048\u0057\u0033\u005c\u005c\u006a\u0073\u006f\u0075\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697767706395L,8589935092L,10067,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private NodeVisitor visitor;

    /**
     * Create a new traversor.
     * @param visitor a class implementing the {@link NodeVisitor} interface, to be called when visiting each node.
     * @deprecated Just use the static {@link NodeTraversor#filter(NodeFilter, Node)} method.
     */
    public NodeTraversor(NodeVisitor visitor) {try{__CLR4_2_07oz7ozlnxz22sw.R.inc(9971);
        __CLR4_2_07oz7ozlnxz22sw.R.inc(9972);this.visitor = visitor;
    }finally{__CLR4_2_07oz7ozlnxz22sw.R.flushNeeded();}}

    /**
     * Start a depth-first traverse of the root and all of its descendants.
     * @param root the root node point to traverse.
     * @deprecated Just use the static {@link NodeTraversor#filter(NodeFilter, Node)} method.
     */
    public void traverse(Node root) {try{__CLR4_2_07oz7ozlnxz22sw.R.inc(9973);
        __CLR4_2_07oz7ozlnxz22sw.R.inc(9974);traverse(visitor, root);
    }finally{__CLR4_2_07oz7ozlnxz22sw.R.flushNeeded();}}

    /**
     * Start a depth-first traverse of the root and all of its descendants.
     * @param visitor Node visitor.
     * @param root the root node point to traverse.
     */
    public static void traverse(NodeVisitor visitor, Node root) {try{__CLR4_2_07oz7ozlnxz22sw.R.inc(9975);
        __CLR4_2_07oz7ozlnxz22sw.R.inc(9976);Node node = root;
        __CLR4_2_07oz7ozlnxz22sw.R.inc(9977);int depth = 0;
        
        __CLR4_2_07oz7ozlnxz22sw.R.inc(9978);while ((((node != null)&&(__CLR4_2_07oz7ozlnxz22sw.R.iget(9979)!=0|true))||(__CLR4_2_07oz7ozlnxz22sw.R.iget(9980)==0&false))) {{
            __CLR4_2_07oz7ozlnxz22sw.R.inc(9981);visitor.head(node, depth);
            __CLR4_2_07oz7ozlnxz22sw.R.inc(9982);if ((((node.childNodeSize() > 0)&&(__CLR4_2_07oz7ozlnxz22sw.R.iget(9983)!=0|true))||(__CLR4_2_07oz7ozlnxz22sw.R.iget(9984)==0&false))) {{
                __CLR4_2_07oz7ozlnxz22sw.R.inc(9985);node = node.childNode(0);
                __CLR4_2_07oz7ozlnxz22sw.R.inc(9986);depth++;
            } }else {{
                __CLR4_2_07oz7ozlnxz22sw.R.inc(9987);while ((((node.nextSibling() == null && depth > 0)&&(__CLR4_2_07oz7ozlnxz22sw.R.iget(9988)!=0|true))||(__CLR4_2_07oz7ozlnxz22sw.R.iget(9989)==0&false))) {{
                    __CLR4_2_07oz7ozlnxz22sw.R.inc(9990);visitor.tail(node, depth);
                    __CLR4_2_07oz7ozlnxz22sw.R.inc(9991);node = node.parentNode();
                    __CLR4_2_07oz7ozlnxz22sw.R.inc(9992);depth--;
                }
                }__CLR4_2_07oz7ozlnxz22sw.R.inc(9993);visitor.tail(node, depth);
                __CLR4_2_07oz7ozlnxz22sw.R.inc(9994);if ((((node == root)&&(__CLR4_2_07oz7ozlnxz22sw.R.iget(9995)!=0|true))||(__CLR4_2_07oz7ozlnxz22sw.R.iget(9996)==0&false)))
                    {__CLR4_2_07oz7ozlnxz22sw.R.inc(9997);break;
                }__CLR4_2_07oz7ozlnxz22sw.R.inc(9998);node = node.nextSibling();
            }
        }}
    }}finally{__CLR4_2_07oz7ozlnxz22sw.R.flushNeeded();}}

    /**
     * Start a depth-first traverse of all elements.
     * @param visitor Node visitor.
     * @param elements Elements to filter.
     */
    public static void traverse(NodeVisitor visitor, Elements elements) {try{__CLR4_2_07oz7ozlnxz22sw.R.inc(9999);
        __CLR4_2_07oz7ozlnxz22sw.R.inc(10000);Validate.notNull(visitor);
        __CLR4_2_07oz7ozlnxz22sw.R.inc(10001);Validate.notNull(elements);
        __CLR4_2_07oz7ozlnxz22sw.R.inc(10002);for (Element el : elements)
            {__CLR4_2_07oz7ozlnxz22sw.R.inc(10003);traverse(visitor, el);
    }}finally{__CLR4_2_07oz7ozlnxz22sw.R.flushNeeded();}}

    /**
     * Start a depth-first filtering of the root and all of its descendants.
     * @param filter Node visitor.
     * @param root the root node point to traverse.
     * @return The filter result of the root node, or {@link FilterResult#STOP}.
     */
    public static FilterResult filter(NodeFilter filter, Node root) {try{__CLR4_2_07oz7ozlnxz22sw.R.inc(10004);
        __CLR4_2_07oz7ozlnxz22sw.R.inc(10005);Node node = root;
        __CLR4_2_07oz7ozlnxz22sw.R.inc(10006);int depth = 0;

        __CLR4_2_07oz7ozlnxz22sw.R.inc(10007);while ((((node != null)&&(__CLR4_2_07oz7ozlnxz22sw.R.iget(10008)!=0|true))||(__CLR4_2_07oz7ozlnxz22sw.R.iget(10009)==0&false))) {{
            __CLR4_2_07oz7ozlnxz22sw.R.inc(10010);FilterResult result = filter.head(node, depth);
            __CLR4_2_07oz7ozlnxz22sw.R.inc(10011);if ((((result == FilterResult.STOP)&&(__CLR4_2_07oz7ozlnxz22sw.R.iget(10012)!=0|true))||(__CLR4_2_07oz7ozlnxz22sw.R.iget(10013)==0&false)))
                {__CLR4_2_07oz7ozlnxz22sw.R.inc(10014);return result;
            // Descend into child nodes:
            }__CLR4_2_07oz7ozlnxz22sw.R.inc(10015);if ((((result == FilterResult.CONTINUE && node.childNodeSize() > 0)&&(__CLR4_2_07oz7ozlnxz22sw.R.iget(10016)!=0|true))||(__CLR4_2_07oz7ozlnxz22sw.R.iget(10017)==0&false))) {{
                __CLR4_2_07oz7ozlnxz22sw.R.inc(10018);node = node.childNode(0);
                __CLR4_2_07oz7ozlnxz22sw.R.inc(10019);++depth;
                __CLR4_2_07oz7ozlnxz22sw.R.inc(10020);continue;
            }
            // No siblings, move upwards:
            }__CLR4_2_07oz7ozlnxz22sw.R.inc(10021);while ((((node.nextSibling() == null && depth > 0)&&(__CLR4_2_07oz7ozlnxz22sw.R.iget(10022)!=0|true))||(__CLR4_2_07oz7ozlnxz22sw.R.iget(10023)==0&false))) {{
                // 'tail' current node:
                __CLR4_2_07oz7ozlnxz22sw.R.inc(10024);if ((((result == FilterResult.CONTINUE || result == FilterResult.SKIP_CHILDREN)&&(__CLR4_2_07oz7ozlnxz22sw.R.iget(10025)!=0|true))||(__CLR4_2_07oz7ozlnxz22sw.R.iget(10026)==0&false))) {{
                    __CLR4_2_07oz7ozlnxz22sw.R.inc(10027);result = filter.tail(node, depth);
                    __CLR4_2_07oz7ozlnxz22sw.R.inc(10028);if ((((result == FilterResult.STOP)&&(__CLR4_2_07oz7ozlnxz22sw.R.iget(10029)!=0|true))||(__CLR4_2_07oz7ozlnxz22sw.R.iget(10030)==0&false)))
                        {__CLR4_2_07oz7ozlnxz22sw.R.inc(10031);return result;
                }}
                }__CLR4_2_07oz7ozlnxz22sw.R.inc(10032);Node prev = node; // In case we need to remove it below.
                __CLR4_2_07oz7ozlnxz22sw.R.inc(10033);node = node.parentNode();
                __CLR4_2_07oz7ozlnxz22sw.R.inc(10034);depth--;
                __CLR4_2_07oz7ozlnxz22sw.R.inc(10035);if ((((result == FilterResult.REMOVE)&&(__CLR4_2_07oz7ozlnxz22sw.R.iget(10036)!=0|true))||(__CLR4_2_07oz7ozlnxz22sw.R.iget(10037)==0&false)))
                    {__CLR4_2_07oz7ozlnxz22sw.R.inc(10038);prev.remove(); // Remove AFTER finding parent.
                }__CLR4_2_07oz7ozlnxz22sw.R.inc(10039);result = FilterResult.CONTINUE; // Parent was not pruned.
            }
            // 'tail' current node, then proceed with siblings:
            }__CLR4_2_07oz7ozlnxz22sw.R.inc(10040);if ((((result == FilterResult.CONTINUE || result == FilterResult.SKIP_CHILDREN)&&(__CLR4_2_07oz7ozlnxz22sw.R.iget(10041)!=0|true))||(__CLR4_2_07oz7ozlnxz22sw.R.iget(10042)==0&false))) {{
                __CLR4_2_07oz7ozlnxz22sw.R.inc(10043);result = filter.tail(node, depth);
                __CLR4_2_07oz7ozlnxz22sw.R.inc(10044);if ((((result == FilterResult.STOP)&&(__CLR4_2_07oz7ozlnxz22sw.R.iget(10045)!=0|true))||(__CLR4_2_07oz7ozlnxz22sw.R.iget(10046)==0&false)))
                    {__CLR4_2_07oz7ozlnxz22sw.R.inc(10047);return result;
            }}
            }__CLR4_2_07oz7ozlnxz22sw.R.inc(10048);if ((((node == root)&&(__CLR4_2_07oz7ozlnxz22sw.R.iget(10049)!=0|true))||(__CLR4_2_07oz7ozlnxz22sw.R.iget(10050)==0&false)))
                {__CLR4_2_07oz7ozlnxz22sw.R.inc(10051);return result;
            }__CLR4_2_07oz7ozlnxz22sw.R.inc(10052);Node prev = node; // In case we need to remove it below.
            __CLR4_2_07oz7ozlnxz22sw.R.inc(10053);node = node.nextSibling();
            __CLR4_2_07oz7ozlnxz22sw.R.inc(10054);if ((((result == FilterResult.REMOVE)&&(__CLR4_2_07oz7ozlnxz22sw.R.iget(10055)!=0|true))||(__CLR4_2_07oz7ozlnxz22sw.R.iget(10056)==0&false)))
                {__CLR4_2_07oz7ozlnxz22sw.R.inc(10057);prev.remove(); // Remove AFTER finding sibling.
        }}
        // root == null?
        }__CLR4_2_07oz7ozlnxz22sw.R.inc(10058);return FilterResult.CONTINUE;
    }finally{__CLR4_2_07oz7ozlnxz22sw.R.flushNeeded();}}

    /**
     * Start a depth-first filtering of all elements.
     * @param filter Node filter.
     * @param elements Elements to filter.
     */
    public static void filter(NodeFilter filter, Elements elements) {try{__CLR4_2_07oz7ozlnxz22sw.R.inc(10059);
        __CLR4_2_07oz7ozlnxz22sw.R.inc(10060);Validate.notNull(filter);
        __CLR4_2_07oz7ozlnxz22sw.R.inc(10061);Validate.notNull(elements);
        __CLR4_2_07oz7ozlnxz22sw.R.inc(10062);for (Element el : elements)
            {__CLR4_2_07oz7ozlnxz22sw.R.inc(10063);if ((((filter(filter, el) == FilterResult.STOP)&&(__CLR4_2_07oz7ozlnxz22sw.R.iget(10064)!=0|true))||(__CLR4_2_07oz7ozlnxz22sw.R.iget(10065)==0&false)))
                {__CLR4_2_07oz7ozlnxz22sw.R.inc(10066);break;
    }}}finally{__CLR4_2_07oz7ozlnxz22sw.R.flushNeeded();}}
}
