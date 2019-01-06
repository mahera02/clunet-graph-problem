package org.ucf.assignment.daa.clunet.main;

import org.ucf.assignment.daa.clunet.CluNetConnectedGraph;
import org.ucf.assignment.daa.clunet.CluNetSpanningTree;
import org.ucf.assignment.daa.clunet.util.GraphUtils;
import org.ucf.assignment.daa.clunet.util.Utils;

public class Demo3 {

	public static void main(String[] args) {
		int V = 1000, E = 11;
		for (int i = 30; i < 31; i++) {
			V = i;
			CluNetConnectedGraph graph = Utils.getConnectedGraph(V, 40);

			graph.printGraphLinks();
			GraphUtils demoGraph = new GraphUtils(V, graph.getGraphLinks());

			demoGraph.getBestBottleneck(2, 3);
			System.out.println(demoGraph.isPathExist(2, 3));
			System.out.println();

			CluNetSpanningTree tree = new CluNetSpanningTree(V, graph.getGraphLinks());
			tree.getMaxSpanningTree();
			tree.printTreeLinks();
			GraphUtils demoTree = new GraphUtils(V, tree.getMstLinks());
			demoTree.getBestBottleneck(2, 3);
			System.out.println();

			System.out.println(demoTree.isPathExist(2, 3));
		}
	}
}
