package com.cnsumi.lineTable;

public class LinkList implements List{
	Node node;

	public LinkList(int data) {
		initList(data);
	}
	
	public void initList(int data) {
		node = new Node(data);
	}
	
	public void initList() {
		node = null;
	}

	public boolean listEmpty() {
		return node == null;
	}

	public void clearList() {
		node = null;
	}

	public int getElem(int index) throws IndexOutOfBoundsException {
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
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean insertTo(int index, int data) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteAt(int index) {
		// TODO Auto-generated method stub
		return false;
	}

	public int count() {
		// TODO Auto-generated method stub
		return 0;
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
