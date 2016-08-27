package com.cnsumi.lineTable;

import org.junit.Test;

public class ArrayListTest {

	@Test
	public void testArrayListDeleteAt() {
		ArrayList list = new ArrayList(10);
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		System.out.println(list);
		list.deleteAt(1);
		System.out.println(list);
	}

}
