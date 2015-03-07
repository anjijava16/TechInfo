package com.iwinner.logics;

import java.util.LinkedHashSet;

public class LinkedHashMapExample {

	public static Object processingLinkedHashSet(){
		LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<Integer>();
		linkedHashSet.add(1);
		linkedHashSet.add(2);
		linkedHashSet.add(3);
		linkedHashSet.add(4);
		linkedHashSet.add(4);
		linkedHashSet.add(5);
		linkedHashSet.add(6);
		linkedHashSet.add(5);
		linkedHashSet.add(6);
		
		Object obj[]=linkedHashSet.toArray();
		
		for(int i=0;i<obj.length;i++){
			System.out.print(obj[i]);
		}
		System.out.println(obj);
		
		
		return null;
	}
	
	public static void main(String[] args) {
		processingLinkedHashSet();
		
	}
}
