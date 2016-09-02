package com.cnsumi.lineTable;

public class StaticLinkedList implements List{
	Component[] list;
	int size;
	public StaticLinkedList(int size) {
		this.initList(size);
	}
	
	public StaticLinkedList() {
		this(ConfigClass.STATIC_LINKEDLIST_DEFAULT_SIZE);
	}
	
	public void initList(int size) {
		if (size < 3) return;
		Component lastComponent = new Component();
		lastComponent.cur = 0;
		list[size - 1] = lastComponent;
		for (int i = 0; i < size - 1; i++) {
			Component pComponent = new Component();
			pComponent.cur = i + 1;
			list[i] = pComponent;
		}
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

	public void initList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		StringBuilder sbBuilder = new StringBuilder();
		sbBuilder.append("MAXSIZE: " + size + "\tData:");
		// 0[date] = null, 0[cur] = 2  --> 1[data] = 10, 1[cur] =
			

		return super.toString();
	}
	
	private int malloc() {
		int i = list[0].cur;
		if (i != 0) {
			list[0].cur = list[i].cur;
			return i;
		}
		return -1;
	}
}
