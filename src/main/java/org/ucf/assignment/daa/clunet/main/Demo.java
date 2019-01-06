package org.ucf.assignment.daa.clunet.main;

import org.apache.log4j.Logger;
import org.ucf.assignment.daa.clunet.CluNetConnectedGraph;
import org.ucf.assignment.daa.clunet.CluNetSpanningTree;
import org.ucf.assignment.daa.clunet.util.GraphUtils;

public class Demo {

	public static final Logger LOG = Logger.getLogger(Demo.class);
	public static void main(String[] args) {

		int V = 6, E = 11;
		CluNetConnectedGraph graph = new CluNetConnectedGraph(V, E);
		graph.addLink(0, 3, 3);
		graph.addLink(3, 5, 7);
		graph.addLink(0, 1, 2);
		graph.addLink(3, 4, 11);
		graph.addLink(2, 1, 8);
		graph.addLink(4, 5, 5);
		graph.addLink(0, 2, 4);
		graph.addLink(2, 5, 10);
		graph.addLink(2, 4, 9);
		graph.addLink(1, 3, 1);
		graph.addLink(2, 3, 6);

		graph.printGraphLinks();
		GraphUtils demoGraph = new GraphUtils(V, graph.getGraphLinks());

		demoGraph.getBestBottleneck(2, 3);
		System.out.println();

		CluNetSpanningTree tree = new CluNetSpanningTree(V, graph.getGraphLinks());
		tree.getMaxSpanningTree();
		tree.printTreeLinks();
		GraphUtils demoTree = new GraphUtils(V, tree.getMstLinks());
		demoTree.getBestBottleneck(2, 3);
		System.out.println();
		
		//System.out.println(graph.getGraphLinks().toString());
	}
}
