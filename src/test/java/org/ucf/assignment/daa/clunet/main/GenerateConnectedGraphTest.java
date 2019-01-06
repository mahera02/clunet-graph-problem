package org.ucf.assignment.daa.clunet.main;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.ucf.assignment.daa.clunet.CluNetConnectedGraph;
import org.ucf.assignment.daa.clunet.util.GraphUtils;
import org.ucf.assignment.daa.clunet.util.Utils;

public class GenerateConnectedGraphTest {
	public static final Logger LOG = Logger.getLogger(GraphUtils.class);

	@Test
	public void generateConnectedGraphWithVertex3() {
		String str = "----------------------------------";
		LOG.info(String.format("%-20s%-20s%-20s%-20s", str,str,str,str));
		LOG.info("Test generateConnectedGraphWithVertex3()");
		int V = 3;
		int V1 = Utils.getRandomVertex(V, -1);
		int V2 = Utils.getRandomVertex(V, V1);
		CluNetConnectedGraph graph = Utils.getConnectedGraph(V);
		graph.printGraphLinks();

		GraphUtils graphUtil = new GraphUtils(graph);
		LOG.info("Finding if a path exists between two random nodes of graph V1=" + V1 + " and V2=" + V2);
		boolean actual = graphUtil.isPathExist(V1, V2);
		assertEquals("Expected a connected pat between two nodes", true, actual);
	}

	@Test
	public void generateConnectedGraphWithVertex4() {
		String str = "----------------------------------";
		LOG.info(String.format("%-20s%-20s%-20s%-20s", str,str,str,str));
		LOG.info("Test generateConnectedGraphWithVertex4()");
		int V = 4;
		int V1 = Utils.getRandomVertex(V, -1);
		int V2 = Utils.getRandomVertex(V, V1);
		CluNetConnectedGraph graph = Utils.getConnectedGraph(V);
		graph.printGraphLinks();

		GraphUtils graphUtil = new GraphUtils(graph);
		LOG.info("Finding if a path exists between two random nodes of graph V1=" + V1 + " and V2=" + V2);
		boolean actual = graphUtil.isPathExist(V1, V2);
		assertEquals("Expected a connected pat between two nodes", true, actual);
	}

	@Test
	public void generateConnectedGraphWithVertex5() {
		String str = "----------------------------------";
		LOG.info(String.format("%-20s%-20s%-20s%-20s", str,str,str,str));
		LOG.info("Test generateConnectedGraphWithVertex5()");
		int V = 5;
		int V1 = Utils.getRandomVertex(V, -1);
		int V2 = Utils.getRandomVertex(V, V1);
		CluNetConnectedGraph graph = Utils.getConnectedGraph(V);
		graph.printGraphLinks();

		GraphUtils graphUtil = new GraphUtils(graph);
		LOG.info("Finding if a path exists between two random nodes of graph V1=" + V1 + " and V2=" + V2);
		boolean actual = graphUtil.isPathExist(V1, V2);
		assertEquals("Expected a connected pat between two nodes", true, actual);
	}

	@Test
	public void generateConnectedGraphWithVertex6() {
		String str = "----------------------------------";
		LOG.info(String.format("%-20s%-20s%-20s%-20s", str,str,str,str));
		LOG.info("Test generateConnectedGraphWithVertex6()");
		int V = 6;
		int V1 = Utils.getRandomVertex(V, -1);
		int V2 = Utils.getRandomVertex(V, V1);
		CluNetConnectedGraph graph = Utils.getConnectedGraph(V);
		graph.printGraphLinks();

		GraphUtils graphUtil = new GraphUtils(graph);
		LOG.info("Finding if a path exists between two random nodes of graph V1=" + V1 + " and V2=" + V2);
		boolean actual = graphUtil.isPathExist(V1, V2);
		assertEquals("Expected a connected pat between two nodes", true, actual);
	}

	@Test
	public void generateConnectedGraphWithVertex7() {
		String str = "----------------------------------";
		LOG.info(String.format("%-20s%-20s%-20s%-20s", str,str,str,str));
		LOG.info("Test generateConnectedGraphWithVertex7()");
		int V = 7;
		int V1 = Utils.getRandomVertex(V, -1);
		int V2 = Utils.getRandomVertex(V, V1);
		CluNetConnectedGraph graph = Utils.getConnectedGraph(V);
		graph.printGraphLinks();

		GraphUtils graphUtil = new GraphUtils(graph);
		LOG.info("Finding if a path exists between two random nodes of graph V1=" + V1 + " and V2=" + V2);
		boolean actual = graphUtil.isPathExist(V1, V2);
		assertEquals("Expected a connected pat between two nodes", true, actual);
	}

	@Test
	public void generateConnectedGraphWithVertex8() {
		String str = "----------------------------------";
		LOG.info(String.format("%-20s%-20s%-20s%-20s", str,str,str,str));
		LOG.info("Test generateConnectedGraphWithVertex8()");
		int V = 8;
		int V1 = Utils.getRandomVertex(V, -1);
		int V2 = Utils.getRandomVertex(V, V1);
		CluNetConnectedGraph graph = Utils.getConnectedGraph(V);
		graph.printGraphLinks();

		GraphUtils graphUtil = new GraphUtils(graph);
		LOG.info("Finding if a path exists between two random nodes of graph V1=" + V1 + " and V2=" + V2);
		boolean actual = graphUtil.isPathExist(V1, V2);
		assertEquals("Expected a connected pat between two nodes", true, actual);
	}

	@Test
	public void generateConnectedGraphWithVertex9() {
		String str = "----------------------------------";
		LOG.info(String.format("%-20s%-20s%-20s%-20s", str,str,str,str));
		LOG.info("Test generateConnectedGraphWithVertex9()");
		int V = 9;
		int V1 = Utils.getRandomVertex(V, -1);
		int V2 = Utils.getRandomVertex(V, V1);
		CluNetConnectedGraph graph = Utils.getConnectedGraph(V);
		graph.printGraphLinks();

		GraphUtils graphUtil = new GraphUtils(graph);
		LOG.info("Finding if a path exists between two random nodes of graph V1=" + V1 + " and V2=" + V2);
		boolean actual = graphUtil.isPathExist(V1, V2);
		assertEquals("Expected a connected pat between two nodes", true, actual);
	}

	@Test
	public void generateConnectedGraphWithVertex10() {
		String str = "----------------------------------";
		LOG.info(String.format("%-20s%-20s%-20s%-20s", str,str,str,str));
		LOG.info("Test generateConnectedGraphWithVertex10()");
		int V = 10;
		int V1 = Utils.getRandomVertex(V, -1);
		int V2 = Utils.getRandomVertex(V, V1);
		CluNetConnectedGraph graph = Utils.getConnectedGraph(V);
		graph.printGraphLinks();

		GraphUtils graphUtil = new GraphUtils(graph);
		LOG.info("Finding if a path exists between two random nodes of graph V1=" + V1 + " and V2=" + V2);
		boolean actual = graphUtil.isPathExist(V1, V2);
		assertEquals("Expected a connected pat between two nodes", true, actual);
	}

	@Test
	public void generateConnectedGraphWithVertex11() {
		String str = "----------------------------------";
		LOG.info(String.format("%-20s%-20s%-20s%-20s", str,str,str,str));
		LOG.info("Test generateConnectedGraphWithVertex11()");
		int V = 11;
		int V1 = Utils.getRandomVertex(V, -1);
		int V2 = Utils.getRandomVertex(V, V1);
		CluNetConnectedGraph graph = Utils.getConnectedGraph(V);
		graph.printGraphLinks();

		GraphUtils graphUtil = new GraphUtils(graph);
		LOG.info("Finding if a path exists between two random nodes of graph V1=" + V1 + " and V2=" + V2);
		boolean actual = graphUtil.isPathExist(V1, V2);
		assertEquals("Expected a connected pat between two nodes", true, actual);
	}

	@Test
	public void generateConnectedGraphWithVertex12() {
		String str = "----------------------------------";
		LOG.info(String.format("%-20s%-20s%-20s%-20s", str,str,str,str));
		LOG.info("Test generateConnectedGraphWithVertex12()");
		int V = 12;
		int V1 = Utils.getRandomVertex(V, -1);
		int V2 = Utils.getRandomVertex(V, V1);
		CluNetConnectedGraph graph = Utils.getConnectedGraph(V);
		graph.printGraphLinks();

		GraphUtils graphUtil = new GraphUtils(graph);
		LOG.info("Finding if a path exists between two random nodes of graph V1=" + V1 + " and V2=" + V2);
		boolean actual = graphUtil.isPathExist(V1, V2);
		assertEquals("Expected a connected pat between two nodes", true, actual);
	}

}
