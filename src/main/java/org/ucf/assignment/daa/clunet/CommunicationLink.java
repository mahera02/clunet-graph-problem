package org.ucf.assignment.daa.clunet;

import org.apache.log4j.Logger;

/***
 * @author Maheshwari, Radhika 
 * This class represents an edge of graph G = (V,E)
 * - sourceNode is the source site 
 * - destinationNode is the destination site 
 * - bandwidth represents the weight of the edge
 **/

public class CommunicationLink implements Comparable<CommunicationLink> {
	public static final Logger LOG = Logger.getLogger(CommunicationLink.class);
	int sourceNode;
	int destinationNode;
	int bandwidth;

	public int getSourceNode() {
		return sourceNode;
	}

	public void setSourceNode(int sourceNode) {
		this.sourceNode = sourceNode;
	}

	public int getDestinationNode() {
		return destinationNode;
	}

	public void setDestinationNode(int destinationNode) {
		this.destinationNode = destinationNode;
	}

	public int getBandwidth() {
		return bandwidth;
	}

	public void setBandwidth(int bandwidth) {
		this.bandwidth = bandwidth;
	}

	public CommunicationLink(int sourceNode, int destinationNode, int bandwidth) {
		this.sourceNode = sourceNode;
		this.destinationNode = destinationNode;
		this.bandwidth = bandwidth;
	}

	public String toString() {
		return String.format("(%s,%s,%s)", this.sourceNode, this.destinationNode, this.bandwidth); 
	}
	public int compareTo(CommunicationLink compareLink) {
		// Maximum Spanning tree
		return compareLink.bandwidth - this.bandwidth;
		// Minimum Spanning Tree
		// return this.bandwidth - compareLink.bandwidth;
	}
}
