package org.ucf.assignment.daa.clunet.main;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.ucf.assignment.daa.clunet.CluNetConnectedGraph;
import org.ucf.assignment.daa.clunet.CluNetSpanningTree;
import org.ucf.assignment.daa.clunet.util.GraphUtils;
import org.ucf.assignment.daa.clunet.util.Utils;

public class BestBottleneckPathTest {
	public static final Logger LOG = Logger.getLogger(BestBottleneckPathTest.class);

	@Test
	public void findBestBottleneckPathForConnectedGraphWithVertex3() {
		String str = "----------------------------------";
		LOG.info(String.format("%-20s%-20s%-20s%-20s", str,str,str,str));
		LOG.info("Test findBestBottleneckPathForConnectedGraphWithVertex3()");
		int V = 3;
		int V1 = Utils.getRandomVertex(V, -1);
		int V2 = Utils.getRandomVertex(V, V1);
		CluNetConnectedGraph graph = Utils.getConnectedGraph(V);
		graph.printGraphLinks();

		CluNetSpanningTree tree = new CluNetSpanningTree(graph);
		tree.convertToMaxSpanningTree();
		tree.printTreeLinks();
		
		LOG.info("Finding best bottleneck path for Graph");
		GraphUtils graphUtil = new GraphUtils(graph);
		int expected = graphUtil.getBestBottleneck(V1, V2);
		
		LOG.info("\nFinding best bottleneck path for Tree");
		GraphUtils treeUtil = new GraphUtils(tree);
		int actual = treeUtil.getBestBottleneck(V1, V2);
		
		assertEquals("Expected and Actual Bottleneck Path are different", expected, actual);
	}

	@Test
	public void findBestBottleneckPathForConnectedGraphWithVertex4() {
		String str = "----------------------------------";
		LOG.info(String.format("%-20s%-20s%-20s%-20s", str,str,str,str));
		LOG.info("Test findBestBottleneckPathForConnectedGraphWithVertex4()");
		int V = 4;
		int V1 = Utils.getRandomVertex(V, -1);
		int V2 = Utils.getRandomVertex(V, V1);
		CluNetConnectedGraph graph = Utils.getConnectedGraph(V);
		graph.printGraphLinks();

		CluNetSpanningTree tree = new CluNetSpanningTree(graph);
		tree.convertToMaxSpanningTree();
		tree.printTreeLinks();
		
		LOG.info("Finding best bottleneck path for Graph");
		GraphUtils graphUtil = new GraphUtils(graph);
		int expected = graphUtil.getBestBottleneck(V1, V2);
		
		LOG.info("\nFinding best bottleneck path for Tree");
		GraphUtils treeUtil = new GraphUtils(tree);
		int actual = treeUtil.getBestBottleneck(V1, V2);
		
		assertEquals("Expected and Actual Bottleneck Path are different", expected, actual);
	}
	@Test
	public void findBestBottleneckPathForConnectedGraphWithVertex5() {
		String str = "----------------------------------";
		LOG.info(String.format("%-20s%-20s%-20s%-20s", str,str,str,str));
		LOG.info("Test findBestBottleneckPathForConnectedGraphWithVertex5()");
		int V = 5;
		int V1 = Utils.getRandomVertex(V, -1);
		int V2 = Utils.getRandomVertex(V, V1);
		CluNetConnectedGraph graph = Utils.getConnectedGraph(V);
		graph.printGraphLinks();

		CluNetSpanningTree tree = new CluNetSpanningTree(graph);
		tree.convertToMaxSpanningTree();
		tree.printTreeLinks();
		
		LOG.info("Finding best bottleneck path for Graph");
		GraphUtils graphUtil = new GraphUtils(graph);
		int expected = graphUtil.getBestBottleneck(V1, V2);
		
		LOG.info("\nFinding best bottleneck path for Tree");
		GraphUtils treeUtil = new GraphUtils(tree);
		int actual = treeUtil.getBestBottleneck(V1, V2);
		
		assertEquals("Expected and Actual Bottleneck Path are different", expected, actual);
	}

	@Test
	public void findBestBottleneckPathForConnectedGraphWithVertex6() {
		String str = "----------------------------------";
		LOG.info(String.format("%-20s%-20s%-20s%-20s", str,str,str,str));
		LOG.info("Test findBestBottleneckPathForConnectedGraphWithVertex6()");
		int V = 6;
		int V1 = Utils.getRandomVertex(V, -1);
		int V2 = Utils.getRandomVertex(V, V1);
		CluNetConnectedGraph graph = Utils.getConnectedGraph(V);
		graph.printGraphLinks();

		CluNetSpanningTree tree = new CluNetSpanningTree(graph);
		tree.convertToMaxSpanningTree();
		tree.printTreeLinks();
		
		LOG.info("Finding best bottleneck path for Graph");
		GraphUtils graphUtil = new GraphUtils(graph);
		int expected = graphUtil.getBestBottleneck(V1, V2);
		
		LOG.info("\nFinding best bottleneck path for Tree");
		GraphUtils treeUtil = new GraphUtils(tree);
		int actual = treeUtil.getBestBottleneck(V1, V2);
		
		assertEquals("Expected and Actual Bottleneck Path are different", expected, actual);
	}

	@Test
	public void findBestBottleneckPathForConnectedGraphWithVertex7() {
		String str = "----------------------------------";
		LOG.info(String.format("%-20s%-20s%-20s%-20s", str,str,str,str));
		LOG.info("Test findBestBottleneckPathForConnectedGraphWithVertex7()");
		int V = 7;
		int V1 = Utils.getRandomVertex(V, -1);
		int V2 = Utils.getRandomVertex(V, V1);
		CluNetConnectedGraph graph = Utils.getConnectedGraph(V);
		graph.printGraphLinks();

		CluNetSpanningTree tree = new CluNetSpanningTree(graph);
		tree.convertToMaxSpanningTree();
		tree.printTreeLinks();
		
		LOG.info("Finding best bottleneck path for Graph");
		GraphUtils graphUtil = new GraphUtils(graph);
		int expected = graphUtil.getBestBottleneck(V1, V2);
		
		LOG.info("\nFinding best bottleneck path for Tree");
		GraphUtils treeUtil = new GraphUtils(tree);
		int actual = treeUtil.getBestBottleneck(V1, V2);
		
		assertEquals("Expected and Actual Bottleneck Path are different", expected, actual);
	}

	@Test
	public void findBestBottleneckPathForConnectedGraphWithVertex8() {
		String str = "----------------------------------";
		LOG.info(String.format("%-20s%-20s%-20s%-20s", str,str,str,str));
		LOG.info("Test findBestBottleneckPathForConnectedGraphWithVertex8()");
		int V = 8;
		int V1 = Utils.getRandomVertex(V, -1);
		int V2 = Utils.getRandomVertex(V, V1);
		CluNetConnectedGraph graph = Utils.getConnectedGraph(V);
		graph.printGraphLinks();

		CluNetSpanningTree tree = new CluNetSpanningTree(graph);
		tree.convertToMaxSpanningTree();
		tree.printTreeLinks();
		
		LOG.info("Finding best bottleneck path for Graph");
		GraphUtils graphUtil = new GraphUtils(graph);
		int expected = graphUtil.getBestBottleneck(V1, V2);
		
		LOG.info("\nFinding best bottleneck path for Tree");
		GraphUtils treeUtil = new GraphUtils(tree);
		int actual = treeUtil.getBestBottleneck(V1, V2);
		
		assertEquals("Expected and Actual Bottleneck Path are different", expected, actual);
	}

	@Test
	public void findBestBottleneckPathForConnectedGraphWithVertex9() {
		String str = "----------------------------------";
		LOG.info(String.format("%-20s%-20s%-20s%-20s", str,str,str,str));
		LOG.info("Test findBestBottleneckPathForConnectedGraphWithVertex9()");
		int V = 9;
		int V1 = Utils.getRandomVertex(V, -1);
		int V2 = Utils.getRandomVertex(V, V1);
		CluNetConnectedGraph graph = Utils.getConnectedGraph(V);
		graph.printGraphLinks();

		CluNetSpanningTree tree = new CluNetSpanningTree(graph);
		tree.convertToMaxSpanningTree();
		tree.printTreeLinks();
		
		LOG.info("Finding best bottleneck path for Graph");
		GraphUtils graphUtil = new GraphUtils(graph);
		int expected = graphUtil.getBestBottleneck(V1, V2);
		
		LOG.info("\nFinding best bottleneck path for Tree");
		GraphUtils treeUtil = new GraphUtils(tree);
		int actual = treeUtil.getBestBottleneck(V1, V2);
		
		assertEquals("Expected and Actual Bottleneck Path are different", expected, actual);
	}

	@Test
	public void findBestBottleneckPathForConnectedGraphWithVertex10() {
		String str = "----------------------------------";
		LOG.info(String.format("%-20s%-20s%-20s%-20s", str,str,str,str));
		LOG.info("Test findBestBottleneckPathForConnectedGraphWithVertex10()");
		int V = 10;
		int V1 = Utils.getRandomVertex(V, -1);
		int V2 = Utils.getRandomVertex(V, V1);
		CluNetConnectedGraph graph = Utils.getConnectedGraph(V);
		graph.printGraphLinks();

		CluNetSpanningTree tree = new CluNetSpanningTree(graph);
		tree.convertToMaxSpanningTree();
		tree.printTreeLinks();
		
		LOG.info("Finding best bottleneck path for Graph");
		GraphUtils graphUtil = new GraphUtils(graph);
		int expected = graphUtil.getBestBottleneck(V1, V2);
		
		LOG.info("\nFinding best bottleneck path for Tree");
		GraphUtils treeUtil = new GraphUtils(tree);
		int actual = treeUtil.getBestBottleneck(V1, V2);
		
		assertEquals("Expected and Actual Bottleneck Path are different", expected, actual);
	}

	@Test
	public void findBestBottleneckPathForConnectedGraphWithVertex11() {
		String str = "----------------------------------";
		LOG.info(String.format("%-20s%-20s%-20s%-20s", str,str,str,str));
		LOG.info("Test findBestBottleneckPathForConnectedGraphWithVertex11()");
		int V = 11;
		int V1 = Utils.getRandomVertex(V, -1);
		int V2 = Utils.getRandomVertex(V, V1);
		CluNetConnectedGraph graph = Utils.getConnectedGraph(V);
		graph.printGraphLinks();

		CluNetSpanningTree tree = new CluNetSpanningTree(graph);
		tree.convertToMaxSpanningTree();
		tree.printTreeLinks();
		
		LOG.info("Finding best bottleneck path for Graph");
		GraphUtils graphUtil = new GraphUtils(graph);
		int expected = graphUtil.getBestBottleneck(V1, V2);
		
		LOG.info("\nFinding best bottleneck path for Tree");
		GraphUtils treeUtil = new GraphUtils(tree);
		int actual = treeUtil.getBestBottleneck(V1, V2);
		
		assertEquals("Expected and Actual Bottleneck Path are different", expected, actual);
	}

	@Test
	public void findBestBottleneckPathForConnectedGraphWithVertex12() {
		String str = "----------------------------------";
		LOG.info(String.format("%-20s%-20s%-20s%-20s", str,str,str,str));
		LOG.info("Test findBestBottleneckPathForConnectedGraphWithVertex12()");
		int V = 12;
		int V1 = Utils.getRandomVertex(V, -1);
		int V2 = Utils.getRandomVertex(V, V1);
		CluNetConnectedGraph graph = Utils.getConnectedGraph(V);
		graph.printGraphLinks();

		CluNetSpanningTree tree = new CluNetSpanningTree(graph);
		tree.convertToMaxSpanningTree();
		tree.printTreeLinks();
		
		LOG.info("Finding best bottleneck path for Graph");
		GraphUtils graphUtil = new GraphUtils(graph);
		int expected = graphUtil.getBestBottleneck(V1, V2);
		
		LOG.info("\nFinding best bottleneck path for Tree");
		GraphUtils treeUtil = new GraphUtils(tree);
		int actual = treeUtil.getBestBottleneck(V1, V2);
		
		assertEquals("Expected and Actual Bottleneck Path are different", expected, actual);
	}



}
