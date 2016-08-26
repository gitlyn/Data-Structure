package com.cnsumi.lineTable;

public class Node {
	int data;
	Node pre;
	Node next;
	
	public Node(int data) {
		this.data = data;
	}
	
	public String toString() {
		
		return "pre->[" + (pre == null ? "null]\t" : pre.data + "]\t") + "data->[" + this.data + "]\t" + (next == null ? "next->[null]" : "next->[" + next.data + "]"); 
	}
}
