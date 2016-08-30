package com.cnsumi.lineTable;

public class LinkList implements List{
	Node node;
	int count;
	public LinkList(int data) {
		initList(data);
		count = 1;
	}
	
	public void initList(int data) {
		node = new Node(data);
	}
	
	public void initList() {
		node = null;
		count = 0;
	}

	public boolean listEmpty() {
		return count == 0;
	}

	public void clearList() {
		Node pNode = node;
		for (int i = 0; i < count; i++) {
			pNode = node.next;
			node = null;
			node = pNode;
		}
		count = 0;
	}

	public int getElem(int index) throws IndexOutOfBoundsException {
		if (index >= count) throw new IndexOutOfBoundsException();
		if (index < 0) throw new IndexOutOfBoundsException();
		if (index == 0) return node.data;
		Node tmp = node.next;
		int j = 1;
		while (tmp != null && j < index) {
			tmp = tmp.next;
			j++;
		}
		if (tmp == null) {
			throw new IndexOutOfBoundsException();
		}
		return tmp.data;
	}

	public int indexOf(int data) {
		Node pNode = node;
		for (int i = 0; i < count; i++) {
			if (pNode.data == data) {
				return i;
			}
			pNode = pNode.next;
		}
		return -1;
	}

	public boolean add(int data) {
		return insertTo(count, data);
	}
	
	public boolean insertTo(int index, int data) {
		if (index > count || index < 0) return false;
		count++;
		if (index == 0) {
			Node newNode = new Node(data);
			newNode.
			next = node;
			node = newNode;
			return true;
		}
		Node xNode = new Node(data);
		Node pNode = node;
		for (int i = 0; i < index - 1; i++) {
			pNode = pNode.next;
		}
		xNode.next = pNode.next;
		pNode.next = xNode;
		return true;
	}

	public boolean deleteAt(int index) {
		if (index >= count || index < 0) return false;
		count--;
		if (index == 0) {
			node = node.next;
			return true;
		}
		Node pNode = node;
		for (int i = 0; i < index - 1; i++) {
			pNode = pNode.next;
		}
		pNode.next = pNode.next.next;
		return true;
	}

	public int count() {
		return count;
	}
	
	@Override
	public String toString() {
		StringBuilder sbBuilder = new StringBuilder();
		Node xNode = node;
		while (xNode != null) {
			sbBuilder.append(xNode.data + "->");
			xNode = xNode.next;
		}
		sbBuilder.append("null");
		return sbBuilder.toString();
	}
}
