package org.ucf.assignment.daa.clunet.util;

import java.util.ArrayList;
import java.util.List;

public class GraphUtils2 {

	private int v;

	private ArrayList<Integer>[] adjList;
	private ArrayList<List<Integer>> possiblePaths;

	public ArrayList<List<Integer>> getPossiblePaths() {
		return possiblePaths;
	}

	public GraphUtils2(int vertices) {

		this.v = vertices;

		initAdjList();
	}

	@SuppressWarnings("unchecked")
	private void initAdjList() {
		adjList = new ArrayList[v];
		possiblePaths = new ArrayList<List<Integer>>();
		for (int i = 0; i < v; i++) {
			adjList[i] = new ArrayList<>();
		}
	}

	public void addEdge(int u, int v) {
		adjList[u].add(v);
		adjList[v].add(u);
	}

	public void printAllPaths(int s, int d) {
		boolean[] isVisited = new boolean[v];
		ArrayList<Integer> pathList = new ArrayList<>();

		pathList.add(s);

		printAllPathsUtil(s, d, isVisited, pathList);
	}

	private void printAllPathsUtil(Integer u, Integer d, boolean[] isVisited, List<Integer> localPathList) {

		isVisited[u] = true;

		if (u.equals(d)) {
			System.out.println(localPathList);
			possiblePaths.add(new ArrayList<>(localPathList));
		}

		for (Integer i : adjList[u]) {
			if (!isVisited[i]) {
				localPathList.add(i);
				printAllPathsUtil(i, d, isVisited, localPathList);

				localPathList.remove(i);
			}
		}

		isVisited[u] = false;
	}

	public static void main(String[] args) {
		GraphUtils2 g = new GraphUtils2(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(2, 0);
		g.addEdge(2, 1);
		g.addEdge(1, 3);

		int s = 2;

		int d = 4;

		System.out.println("Following are all different paths from " + s + " to " + d);
		g.printAllPaths(s, d);
		System.out.println(g.possiblePaths);

	}
}
