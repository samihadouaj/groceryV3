package org.iselab.grocery.util;

public class UUIDUtils {

	private static int sequential = 1;

	public static int getId() {
		return sequential++;
	}
	public static int getRandomId(){
		double x = Math.random();
		return (int) x;
	}
}
