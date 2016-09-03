package com.cnsumi.lineTable;

public class StaticLinkedList implements List{
	Component[] list;
	int size;
	int count;
	public StaticLinkedList(int size) {
		this.initList(size);
	}
	
	public StaticLinkedList() {
		this(ConfigClass.STATIC_LINKEDLIST_DEFAULT_SIZE);
	}
	
	public void initList(int size) {
		if (size < 3) return;
		list = new Component[size];
		Component lastComponent = new Component();
		lastComponent.cur = 0;
		list[size - 1] = lastComponent;
		for (int i = 0; i < size - 1; i++) {
			Component pComponent = new Component();
			pComponent.cur = i + 1;
			list[i] = pComponent;
		}
		count = 0;
		this.size = size;
	}

	public boolean listEmpty() {
		return false;
	}

	public void clearList() {
		// TODO Auto-generated method stub
		
	}

	public int getElem(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int indexOf(int data) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean insertTo(int index, int data) {
		if (index > count) return false;
		if (index < 0 || index >= size - 2) return false;
		int i = malloc();
		if (i == 0) return false;
		list[i].data = data;
		int k = list[size - 1].cur;
		if (index == 0) {
			list[size - 1].cur = i;
		}
		for (int j = 0; j < index; j++) {
			k = list[k].cur;
		}
		list[i].cur = list[k].cur;
		list[k].cur = i;
		count++;
		return true;
	}

	public boolean deleteAt(int index) {
		return false;
	}

	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void initList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		StringBuilder sbBuilder = new StringBuilder();
		sbBuilder.append("MAXSIZE: " + size + "\tCount:" + count + "\tData:\n");
		int p = list[size - 1].cur;
		for (int i = 0; i < count; i++) {
			sbBuilder.append(list[p].data + "->");
			p = list[p].cur;
		}
		sbBuilder.append("null");
		return sbBuilder.toString();
	}
	
	private int malloc() {
		return list[0].cur;
	}
}
