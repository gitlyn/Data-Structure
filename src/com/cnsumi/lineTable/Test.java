package com.cnsumi.lineTable;


public class Test {
	public static void main(String[] args) {
		LinkList list = new LinkList(10);
		Node node = list.node;
		for (int i = 0; i < 10; i++) {
			node.next = new Node((int)(Math.random() * 100));
			node = node.next;
		}
		System.out.println(list);
		System.out.println(list.getElem());
	}
}
