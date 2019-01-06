package org.ucf.assignment.daa.clunet.util;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.log4j.Logger;
import org.ucf.assignment.daa.clunet.CluNetConnectedGraph;

public class Utils {
	public static final Logger LOG = Logger.getLogger(Utils.class);

	/**
	 * Returns a CluNetConnectedGraph instance with provided vertices, edges, and random weights
	 * @param V total number of vertices
	 * @param E total number of edges
	 * @return
	 */
	public static CluNetConnectedGraph getConnectedGraph(int V, int E) {
		LOG.info("Generating Graph for G = (" + V + "," + E + ")");
		Set<Integer> bandWidthSet = new HashSet<Integer>();
		Set<String> edgesSet = new HashSet<String>();
		int bandwidth;
		int[] vertices;
		CluNetConnectedGraph graph = new CluNetConnectedGraph(V, E);
		for (int i = 0; i < V - 1; i++) {
			bandwidth = getRandomBandWidth(bandWidthSet, 10, 10000);
			bandWidthSet.add(bandwidth);
			edgesSet.add(i + "," + (i + 1));
			graph.addLink(i, i + 1, bandwidth);
		}
		bandwidth = getRandomBandWidth(bandWidthSet, 10, 10000);
		bandWidthSet.add(bandwidth);
		edgesSet.add((V - 1) + "," + 0);
		graph.addLink((V - 1), 0, bandwidth);
		for (int i = V; i < E; i++) {
			vertices = getRandomVertices(edgesSet, V);
			bandwidth = getRandomBandWidth(bandWidthSet, 10, 10000);
			bandWidthSet.add(bandwidth);
			edgesSet.add(vertices[0] + "," + vertices[1]);
			graph.addLink(vertices[0], vertices[1], bandwidth);

		}
		return graph;
	}
	
	/**
	 * Returns a CluNetConnectedGraph instance with provided vertices, (2*vertices -1 )edges, and random weights
	 * @param V total number of vertices
	 * @param E total number of edges
	 * @return
	 */
	public static CluNetConnectedGraph getConnectedGraph(int V) {
		int E = V < 5 ? (V + V/4) : (V + V/2);
		LOG.info("Generating Graph for G = (" + V + "," + E + ")");
		Set<Integer> bandWidthSet = new HashSet<Integer>();
		Set<String> edgesSet = new HashSet<String>();
		int bandwidth;
		int[] vertices;
		CluNetConnectedGraph graph = new CluNetConnectedGraph(V, E);
		for (int i = 0; i < V - 1; i++) {
			bandwidth = getRandomBandWidth(bandWidthSet, 10, 10000);
			bandWidthSet.add(bandwidth);
			edgesSet.add(i + "," + (i + 1));
			graph.addLink(i, i + 1, bandwidth);
		}
		bandwidth = getRandomBandWidth(bandWidthSet, 10, 10000);
		bandWidthSet.add(bandwidth);
		edgesSet.add((V - 1) + "," + 0);
		graph.addLink((V - 1), 0, bandwidth);
		for (int i = V; i < E; i++) {
			vertices = getRandomVertices(edgesSet, V);
			bandwidth = getRandomBandWidth(bandWidthSet, 10, 10000);
			bandWidthSet.add(bandwidth);
			edgesSet.add(vertices[0] + "," + vertices[1]);
			graph.addLink(vertices[0], vertices[1], bandwidth);

		}
		return graph;
	}

	/**
	 * Returns a random bandwidth between two ranges
	 * 
	 * @param bandWidthSet - used to make sure the bandwidth is distinct
	 * @return random bandwidth
	 */
	private static int getRandomBandWidth(Set<Integer> bandWidthSet, int start, int end) {
		int bandwidth = ThreadLocalRandom.current().nextInt(start, end + 1);
		if (!bandWidthSet.contains(bandwidth)) {
			return bandwidth;
		} else {
			return getRandomBandWidth(bandWidthSet, start, end);
		}
	}

	/**
	 * Returns random vertices from 0 to V-1
	 * @param edgesSet - used to make sure there are no parallel edges (2-3-13, 3-2-23,2-3-27) or self loops (1-1-10,2-2-10)
	 * @param V - total number of vertices in graph
	 * @return array of vertices of size 2
	 */
	private static int[] getRandomVertices(Set<String> edgesSet, int V) {
		int vertex1 = ThreadLocalRandom.current().nextInt(0, V);
		int vertex2 = ThreadLocalRandom.current().nextInt(0, V);
		if ((!(edgesSet.contains(vertex1 + "," + vertex2) || edgesSet.contains(vertex2 + "," + vertex1)))
				&& (vertex1 != vertex2)) {
			return new int[] { vertex1, vertex2 };
		} else {
			return getRandomVertices(edgesSet, V);
		}
	}

	/**
	 * Returns a CluNetConnectedGraph instance with random vertices, edges, weights
	 * @return
	 */
	public static CluNetConnectedGraph getRandomConnectedGraph() {
		int V = ThreadLocalRandom.current().nextInt(0, 1001);
		return getConnectedGraph(V);
	}

	public static void main(String[] args) {
		LOG.info(ThreadLocalRandom.current().nextInt(0, 6 + 1));
		LOG.info(ThreadLocalRandom.current().nextInt(0, 6 + 1));

		CluNetConnectedGraph graph = getRandomConnectedGraph();
		graph.printGraphLinks();
		
		CluNetConnectedGraph graph50 = getConnectedGraph(50);
		graph50.printGraphLinks();
	}
	public static int getRandomVertex(int v, int i) {
		int random = ThreadLocalRandom.current().nextInt(0, v);
		if (random != i) {
			return random;
		} else {
			return getRandomVertex(v, i);
		}
	}
}
