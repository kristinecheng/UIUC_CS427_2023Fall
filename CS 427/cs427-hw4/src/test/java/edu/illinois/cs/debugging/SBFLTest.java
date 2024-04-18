package edu.illinois.cs.debugging;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

/**
 * Tests for your SBFL implementation
 *
 */
public class SBFLTest
{

	@Test
	public void test1()
			throws FileNotFoundException, IOException, URISyntaxException {
		// return coverage information via reading from test resources, which
		// will be automatically copied from "src/test/resources/debug-info" to
		// "target/test-classes/debug-info" during "mvn test"
		Map<String, Set<String>> cov = SBFL
				.readXMLCov(getFileFromResource("debug-info/cov.xml"));

		// get the list of failed tests from test resources
		Set<String> failedTests = new HashSet<String>();
		Collections.addAll(failedTests,
				FileUtils
						.readFileToString(getFileFromResource(
								"debug-info/failedtests1.txt"), "utf-8")
						.split(System.lineSeparator()));

		// define the buggy line
		String buggyLine = "org.jsoup.parser.HtmlTreeBuilder:432";

		// compute suspiciousness for each statement
		Map<String, Double> susp = SBFL.Ochiai(cov, failedTests);

		// check the suspiciousness value of the buggy line
		assertEquals(0.1015346165133619, SBFL.getSusp(susp, buggyLine), 10e-5);
		// check the absolute rank of the buggy line
		assertEquals(186, SBFL.getRank(susp, buggyLine));
	}

	@Test
	public void test2()
			throws FileNotFoundException, IOException, URISyntaxException {
		Map<String, Set<String>> cov = SBFL
				.readXMLCov(getFileFromResource("debug-info/cov.xml"));
		Set<String> failedTests = new HashSet<String>();
		Collections.addAll(failedTests,
				FileUtils
						.readFileToString(getFileFromResource(
								"debug-info/failedtests2.txt"), "utf-8")
						.split(System.lineSeparator()));
		String buggyLine = "org.jsoup.parser.HtmlTreeBuilderState:768";
		Map<String, Double> susp = SBFL.Ochiai(cov, failedTests);
		assertEquals(0.14359163172354764, SBFL.getSusp(susp, buggyLine), 10e-5);
	}

	@Test
	public void test3()
			throws FileNotFoundException, IOException, URISyntaxException {
		Map<String, Set<String>> cov = SBFL
				.readXMLCov(getFileFromResource("debug-info/cov.xml"));
		Set<String> failedTests = new HashSet<String>();
		Collections.addAll(failedTests,
				FileUtils
						.readFileToString(getFileFromResource(
								"debug-info/failedtests3.txt"), "utf-8")
						.split(System.lineSeparator()));
		String buggyLine = "org.jsoup.parser.TokeniserState:219";
		Map<String, Double> susp = SBFL.Ochiai(cov, failedTests);

		assertEquals(0.7302967433402215, SBFL.getSusp(susp, buggyLine), 10e-5);
		assertEquals(19, SBFL.getRank(susp, buggyLine));

	}

	@Test
	public void test4()
			throws FileNotFoundException, IOException, URISyntaxException {
		// return coverage information via reading from test resources, which
		// will be automatically copied from "src/test/resources/debug-info" to
		// "target/test-classes/debug-info" during "mvn test"
		Map<String, Set<String>> cov = SBFL
				.readXMLCov(getFileFromResource("debug-info/cov.xml"));

		// get the list of failed tests from test resources
		Set<String> failedTests = new HashSet<String>();
		Collections.addAll(failedTests,
				FileUtils
						.readFileToString(getFileFromResource(
								"debug-info/failedtests4.txt"), "utf-8")
						.split(System.lineSeparator()));

		// define the buggy line
		String buggyLine = "org.jsoup.parser.HtmlTreeBuilder:451";

		// compute suspiciousness for each statement
		Map<String, Double> susp = SBFL.Ochiai(cov, failedTests);


		// check the suspiciousness value of the buggy line
		assertEquals(0.408248290463863, SBFL.getSusp(susp, buggyLine), 10e-5);
		// check the absolute rank of the buggy line
		assertEquals(19, SBFL.getRank(susp, buggyLine));
	}

	@Test
	public void test5()
			throws FileNotFoundException, IOException, URISyntaxException {
		Map<String, Set<String>> cov = SBFL
				.readXMLCov(getFileFromResource("debug-info/cov.xml"));
		Set<String> failedTests = new HashSet<String>();
		Collections.addAll(failedTests,
				FileUtils
						.readFileToString(getFileFromResource(
								"debug-info/failedtests5.txt"), "utf-8")
						.split(System.lineSeparator()));
		String buggyLine = "org.jsoup.parser.TokeniserState:242";
		
		Map<String, Double> susp = SBFL.Ochiai(cov, failedTests);
		
		//System.out.println(SBFL.getSusp(susp, buggyLine));
		assertEquals(0.26111648393354675, SBFL.getSusp(susp, buggyLine), 10e-5);
	}

	private File getFileFromResource(String fileName)
			throws URISyntaxException {
		ClassLoader classLoader = getClass().getClassLoader();
		URL resource = classLoader.getResource(fileName);
		if (resource == null) {
			throw new IllegalArgumentException("file not found! " + fileName);
		} else {
			return new File(resource.toURI());
		}
	}

}
