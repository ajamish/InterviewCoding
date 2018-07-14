/**
 * 
 */
package com.java.collections;

import java.util.ArrayList;

/**
 * @author Ajay
 *
 */
public class RemoveDupFromArraList {

	/**
	 * 
	 */
	public RemoveDupFromArraList() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("ABC");
		list.add("ABC");
		list.add("ABCD");
		list.add("CED");
		list.add("ABC");
		System.out.println("Org list::"+list);
		
		Object[] lst=list.toArray();
		for(Object st:lst){
			System.out.println(list.indexOf(st)+"-"+list.lastIndexOf(st));
			if(list.indexOf(st)!=list.lastIndexOf(st)){
				list.remove(list.lastIndexOf(st));
			}
			
			
		}
			System.out.println("after remove::"+list);
	}


	}
