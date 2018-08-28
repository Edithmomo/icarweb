package com.ccunix.icar.base.util;

import java.util.UUID;

public class UUID_Tools {

	public UUID_Tools() {
	}

	/**
	 * 获得�?个UUID
	 * 
	 * @return String UUID
	 */
	public static String getUUID() {
		String s = UUID.randomUUID().toString();
		// 去掉�?-”符�?
		return s.substring(0, 8) + s.substring(9, 13) + s.substring(14, 18) + s.substring(19, 23) + s.substring(24);
	}

	/**
	 * 获得指定数目的UUID
	 * 
	 * @param number
	 *            int �?要获得的UUID数量
	 * @return String[] UUID数组
	 */
	public static String[] getUUID(int number) {
		if (number < 1) {
			return null;
		}
		String[] ss = new String[number];
		for (int i = 0; i < number; i++) {
			ss[i] = getUUID();
		}
		return ss;
	}

	public static void main(String[] args) {
		String ss = UUID_Tools.getUUID();
		System.out.println(ss);
	}

}
