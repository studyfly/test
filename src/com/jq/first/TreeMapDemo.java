package com.jq.first;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * TreeMap
 */
public class TreeMapDemo {
	public static void main(String[] args) {
		Map<String, String> tmp = new TreeMap<String, String>();
		tmp.put("a", "aaa");
		tmp.put("b", "bbb");
		tmp.put("c", "ccc");
		tmp.put("d", "cdc");
		Iterator<String> iterator_2 = tmp.keySet().iterator();
		while (iterator_2.hasNext()) {
			Object key = iterator_2.next();
			System.out.println("tmp.get(key) is :" + tmp.get(key));
		}
	}
}
