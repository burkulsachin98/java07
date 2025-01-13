package org.interviewprograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateEkementInArray {

	public static void main(String[] args) {

		int ar []= {1,2,2,3,4,5,6,7,8};

		System.out.println("Duplicate elements are : ");

		Set <Integer> s = new HashSet<>();

		for (int no: ar) {
			if(s.add(no)==false) {
				System.out.println(no);
			}

		}
	}

}
