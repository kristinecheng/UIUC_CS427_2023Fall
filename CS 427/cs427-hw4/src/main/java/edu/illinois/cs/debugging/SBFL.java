package edu.illinois.cs.debugging;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

/**
 * Implementation for Spectrum-based Fault Localization (SBFL).
 *
 */
public class SBFL
{

	/**
	 * Use Jsoup to parse the coverage file in the XML format.
	 * 
	 * @param file
	 * @return a map from each test to the set of lines that it covers
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	protected static Map<String, Set<String>> readXMLCov(File file)
			throws FileNotFoundException, IOException {
		FileInputStream fileInputStream = new FileInputStream(file);

		Map<String, Set<String>> res = new HashMap<String, Set<String>>();
		Document document = Jsoup.parse(fileInputStream, "UTF-8", "",
				Parser.xmlParser());

		Elements tests = document.select("test");
		for (Element test : tests) {
			Element name = test.child(0);
			Element covLines = test.child(1);

			Set<String> lines = new HashSet<String>();
			String[] items = covLines.text().split(", ");
			Collections.addAll(lines, items);
			res.put(name.text(), lines);
		}
		return res;
	}

	/**
	 * Compute the suspiciousness values for all covered statements based on
	 * Ochiai
	 * 
	 * @param cov
	 * @param failedTests
	 * @return a map from each line to its suspiciousness value
	 */
	public static Map<String, Double> Ochiai(Map<String, Set<String>> cov,
			Set<String> failedTests) {
		// using LinkedHashMap so that the statement list can be ranked
		Map<String, Double> susp = new LinkedHashMap<String, Double>();
		// TODO
		int totalFails = failedTests.size();
		Map<String, Set<String>> line_test_pair = new HashMap<>();

		// Map that store lines that contains the test -> Map<line, tests> pair
		for (Map.Entry<String, Set<String>> keys: cov.entrySet())
		{
			String line = keys.getKey();
			Set<String> test = keys.getValue();

			for (String val: test)
			{
				if (!line_test_pair.containsKey(val))
					line_test_pair.put(val, new HashSet<>());
				line_test_pair.get(val).add(line);
			}
		}

		// Compute the Ochiai value for each each covered statement (each line)
		for (Map.Entry<String, Set<String>> pairs: line_test_pair.entrySet())
		{
			String currentLine = pairs.getKey();
			Set<String> tests = pairs.getValue();

			int failedTest = 0;
			// Get the count of failed test within this line 
			for (String test: tests)
			{
				for (String failed: failedTests)
					if (test.equals(failed))
						failedTest++;
			}

			// Calculate suspicious value for the current line 
			double ochiaiVal = failedTest / Math.sqrt(totalFails  * tests.size());
			// Store current covered statement with its corresponding ochiai value 
			susp.put(currentLine, ochiaiVal);
		}
		return susp;
	}

	/**
	 * Get the suspiciousness value for the buggy line from the suspicious
	 * statement list
	 * 
	 * @param susp
	 * @param buggyLine
	 * @return the suspiciousness value for the buggy line
	 */
	protected static double getSusp(Map<String, Double> susp,
			String buggyLine) {
		// TODO
		// For debugging
		//System.out.println(buggyLine + ": " + susp.get(buggyLine));
		return susp.get(buggyLine);
	}

	/**
	 * Rank all statements based on the descending order of their suspiciousness
	 * values. Get the rank (print the lowest rank for the tied cases) for the
	 * buggy line from the suspicious statement list
	 * 
	 * @param susp
	 * @param buggyLine
	 * @return the rank of the buggy line
	 */
	protected static int getRank(Map<String, Double> susp, String buggyLine) {
		List<Map.Entry<String, Double>> list = new LinkedList<Map.Entry<String, Double>>(
				susp.entrySet());
		// TODO
		// Sort the list into decending order based on the Ochiai value 
		Collections.sort(list, new Comparator<Map.Entry<String, Double>>() {
			public int compare(Map.Entry<String, Double> a, Map.Entry<String, Double> b)
			{
				return (b.getValue().compareTo(a.getValue())); // sorted into descending order
			}
		});
		
		// Put the sorted list into HashMap for later use
		HashMap<String, Double> sorted = new LinkedHashMap<String, Double>();
		for (Map.Entry<String, Double> temp: list)
			sorted.put(temp.getKey(), temp.getValue());
		list = new LinkedList<Map.Entry<String, Double>>(sorted.entrySet());

		// Retrieve the buggyline value 
		//System.out.println("\nRetrieveing buggy line value.....");
		double buggy = getSusp(susp, buggyLine);
		//System.out.println(buggyLine + ": " + buggy);

		int rank = 0;
		for (int i = 0; i < list.size() - 1; i++)
		{
			while (list.get(i).getValue() >= buggy)
			{
				rank++;
				i++;
			}
		}

		return rank;
	}

}
