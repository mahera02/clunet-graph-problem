package org.ucf.assignment.daa.clunet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

public class CluNetSpanningTree {
	public static final Logger LOG = Logger.getLogger(CluNetSpanningTree.class);
	private int V;
	private List<CommunicationLink> graphLinks;

	public int getV() {
		return V;
	}

	public void setV(int v) {
		V = v;
	}

	public List<CommunicationLink> getGraphLinks() {
		return graphLinks;
	}

	public void setGraphLinks(List<CommunicationLink> graphLinks) {
		this.graphLinks = graphLinks;
	}

	public List<CommunicationLink> getMstLinks() {
		return mstLinks;
	}

	public void setMstLinks(List<CommunicationLink> mstLinks) {
		this.mstLinks = mstLinks;
	}

	private List<CommunicationLink> mstLinks;

	public CluNetSpanningTree(int v, List<CommunicationLink> graphLinks) {
		super();
		V = v;
		this.graphLinks = graphLinks;
		mstLinks = new ArrayList<CommunicationLink>(V - 1);
	}

	public CluNetSpanningTree(CluNetConnectedGraph graph) {
		super();
		V = graph.getV();
		this.graphLinks = graph.getGraphLinks();
		mstLinks = new ArrayList<CommunicationLink>(V - 1);
	}

	private int findParent(int v, int[] parent) {
		if (parent[v] == v) {
			return v;
		}
		return findParent(parent[v], parent);
	}

	public void printTreeLinks() {
		LOG.info("Generated Spanning Tree G = (" + this.V + "," + this.mstLinks.size() + ")");
		LOG.info("Tree G = (source, destination, bandwidth), (source, destination, bandwidth), .. \n ");
		if (this.mstLinks.size() > 0) {
			for (int i = 0; i < this.mstLinks.size() - 1; i++) {
				LOG.info(this.mstLinks.get(i).toString() + ",");
			}
			LOG.info(this.mstLinks.get(mstLinks.size() - 1));
		} else {
			LOG.info("[]");
		}
		LOG.info("\n");
	}

	public void convertToMaxSpanningTree() {
		getMaxSpanningTree();
	}

	public List<CommunicationLink> getMaxSpanningTree() {
		Collections.sort(graphLinks);

		// union
		int[] parent = new int[V];
		for (int i = 0; i < V; i++) {
			parent[i] = i;
		}
		int count = 0; // to count edges added to MST
		int i = 0; // denotes current edge on sorted edges
		while (count != V - 1) {
			CommunicationLink currentLink = graphLinks.get(i);
			// Check if we can add in MST or not
			int sourceNodeParent = findParent(currentLink.sourceNode, parent);
			int destinationNodeParent = findParent(currentLink.destinationNode, parent);

			// if source-parent and destination parent are different then it can be added
			if (sourceNodeParent != destinationNodeParent) {
				mstLinks.add(currentLink);
				count++;
				parent[sourceNodeParent] = destinationNodeParent;
			}
			i++;
		}
		return mstLinks;
	}
}
