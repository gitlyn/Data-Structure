package com.cnsumi.lineTable;

public class ArrayList implements List{
	private static final int DEFAULT_LENGTH = 10;
	
	int[] array;
	int length;
	int count;
	
	public ArrayList() {
		this(DEFAULT_LENGTH);
	}
	
	public ArrayList(int size) {
		this.initList(size);
	}
	
	
	public void initList(int size) {
		array = new int[size];
		length = size;
		count = 0;
	}
	
	public void initList() {
		this.initList(DEFAULT_LENGTH);
	}

	public boolean listEmpty() {
		return count == 0;
	}

	public void clearList() {
		count = 0;
	}

	public int getElem(int index) throws IndexOutOfBoundsException{
		if (index >= count || index < 0) throw new IndexOutOfBoundsException();
		return array[index];
	}

	public int indexOf(int data) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public boolean add(int data) {
		return insertTo(count, data);
	}
	
	public boolean insertTo(int index, int data) {
		if (index < 0 || index > count) return false;
		if (count == length) return false;
		for (int i = count; i > index; i--) {
			array[i] = array[i - 1];
		}
		array[index] = data;
		count += 1;
		return true;
	}

	public boolean deleteAt(int index) {
		// TODO Auto-generated method stub
		return false;
	}

	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
		StringBuilder sbBuilder = new StringBuilder();
		sbBuilder.append("Length:" + length + '\t');
		for (int i = 0; i < count; i++) {
			sbBuilder.append("[" + i + "]->" + array[i] + '\t');
		}
		sbBuilder.append("count:" + count);
		return sbBuilder.toString();
	}
}
