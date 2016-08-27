package com.cnsumi.lineTable;

public interface List {
	public void initList();
	
	public boolean listEmpty();
	
	public void clearList();
	
	public int getElem(int index) throws IndexOutOfBoundsException;
	
	public int indexOf(int data);
	
	public boolean insertTo(int index, int data);
	
	public boolean deleteAt(int index);
	
	public int length();
}
