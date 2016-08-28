package com.cnsumi.lineTable;


public class Test {
	public static void main(String[] args) {
		Node xNode = new Node(10);
		System.out.println(xNode);
		Node newNode = new Node(100);
		Node cNode = new Node(50);
		xNode.next = newNode;
		cNode.next=newNode;
		//newNode.pre = xNode;
		
		System.out.println(xNode);
		System.out.println(cNode);
		System.out.println(xNode.next);
		
		ArrayList arrayList = new ArrayList(6);
		arrayList.insertTo(0, 1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.clearList();
		for (int i = 1; i < 7; i++) {
			arrayList.add(i);
		}
	}
}
