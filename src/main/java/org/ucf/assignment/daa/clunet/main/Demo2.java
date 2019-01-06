/*package org.ucf.assignment.daa.clunet.main;

import java.util.List;

import org.ucf.assignment.daa.clunet.CluNetConnectedGraph;
import org.ucf.assignment.daa.clunet.CluNetSpanningTree;
import org.ucf.assignment.daa.clunet.util.GraphUtils;

public class Demo2 {

	public static void main(String[] args) {
		int V = 6, E = 11;
		CluNetConnectedGraph graph = new CluNetConnectedGraph(V, E);
		GraphUtils demoGraph = new GraphUtils(V);
		graph.addLink(0, 3, 3);
		demoGraph.addEdge(0, 3);

		graph.addLink(3, 5, 7);
		demoGraph.addEdge(3, 5);

		graph.addLink(0, 1, 2);
		demoGraph.addEdge(0, 1);

		graph.addLink(3, 4, 11);
		demoGraph.addEdge(3, 4);

		graph.addLink(2, 1, 8);
		demoGraph.addEdge(2, 1);

		graph.addLink(4, 5, 5);
		demoGraph.addEdge(4, 5);

		graph.addLink(0, 2, 4);
		demoGraph.addEdge(0, 2);

		graph.addLink(2, 5, 10);
		demoGraph.addEdge(2, 5);

		graph.addLink(2, 4, 9);
		demoGraph.addEdge(2, 4);

		graph.addLink(1, 3, 1);
		demoGraph.addEdge(1, 3);

		graph.addLink(2, 3, 6);
		demoGraph.addEdge(2, 3);

		graph.printGraphLinks();

		demoGraph.getAllPossiblePaths(2, 3);
		List<List<Integer>> paths = demoGraph.getAllPossiblePaths(2, 3);

		for (List<Integer> path : paths) {
			System.out.print("\nPath " + path + "  ");
			for (int i = 0; i < path.size() - 1; i++) {
				String key = path.get(i) + "," + path.get(i + 1);
				String revKey = path.get(i + 1) + "," + path.get(i);
				if (graph.getEdgesMap().containsKey(key)) {
					System.out.print(graph.getEdgesMap().get(key) + " ");
				} else {
					System.out.print(graph.getEdgesMap().get(revKey) + " ");
				}
			}
		}
		System.out.println();

		CluNetSpanningTree tree = new CluNetSpanningTree(V, graph.getGraphLinks());
		tree.getMaxSpanningTree();

		GraphUtils demoTree = new GraphUtils(V);
		demoTree.addEdge(3, 4);
		demoTree.addEdge(2, 5);
		demoTree.addEdge(2, 4);
		demoTree.addEdge(2, 1);
		demoTree.addEdge(0, 2);

		
		List<List<Integer>> paths2 = demoTree.getAllPossiblePaths(2, 3);

		for (List<Integer> path : paths2) {
			System.out.print("\nPath " + path + "  ");
			for (int i = 0; i < path.size() - 1; i++) {
				String key = path.get(i) + "," + path.get(i + 1);
				String revKey = path.get(i + 1) + "," + path.get(i);
				if (tree.getEdgesMap().containsKey(key)) {
					System.out.print(tree.getEdgesMap().get(key) + " ");
				} else {
					System.out.print(tree.getEdgesMap().get(revKey) + " ");
				}
			}
		}
		System.out.println();

	}

}
*/