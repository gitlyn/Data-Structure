package com.cnsumi.lineTable;

public class Node {
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
	}
	
	public String toString() {
		return "data->[" + this.data + "]\t" + (next == null ? "next->[null]" : "next->[" + next.data + "]"); 
	}
}
