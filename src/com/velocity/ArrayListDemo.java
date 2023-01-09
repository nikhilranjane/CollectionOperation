package com.velocity;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Akshay");
		list.add("Manisha");
		list.add("Rohan");
		list.add("Nikhil");
		
		/*System.out.println(list);*/
		
		for(String str : list) {
			System.out.println(str);
		}
	}
}
