package com.cnsumi.lineTable;

public class Test {
	public static void main(String[] args) {
		Node xNode = new Node(10);
		Node newNode = new Node(100);
		
		Node cNode = new Node(50);
		xNode.next = newNode;
		cNode.pre=xNode;
		cNode.next=newNode;
		newNode.pre=cNode;
		//newNode.pre = xNode;
		
		System.out.println(xNode);
		System.out.println(cNode);
		System.out.println(xNode.next);
	}
}
