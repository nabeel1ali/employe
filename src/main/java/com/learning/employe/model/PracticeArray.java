package com.learning.employe.model;

import java.util.ArrayList;

public class PracticeArray {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("nabeel");
		list.add("bilal");
		list.add("sultan");
		list.add("daniyal");
		list.add("kaleem");
		list.add("faizan");

		System.out.print("The initial values in ArrayList are : ");
		for (String value : list) {
			System.out.print(value);
			System.out.print(" ");
		}
		int pos = list.indexOf("faizan");
		System.out.println("\n This element is at index : " + pos);

//		System.out.println("the List is:" + list);

//		Iterator<String> iter = list.iterator();
//
//		System.out.println("\n The iterator values of list are: ");
//		while (iter.hasNext()) {
//			System.out.print(iter.next() + " ");
//		}
	}
}
