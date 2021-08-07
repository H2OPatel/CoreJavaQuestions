package com.link.list.test;

import com.link.list.linklist.LinkedList;

public class LinkListTester {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList(0);
		LinkedList ll1 = new LinkedList(0);

		ll.add(1);
		ll.add(11);
		ll.add(10);
		ll.add(121);
		ll.add(111);
		ll.add(12321);
		
		ll.print();
		
		System.out.println("121 is at " + ll.find(121));
		System.out.println("131 is at " + ll.find(131));
		
		System.out.println("The size of the list is :"+ ll.size());
		
		ll.remove(0);
		ll.print();
		System.out.println("The size of the list is :"+ ll.size());
		
		ll.remove(10);
		ll.print();
		System.out.println("The size of the list is :"+ ll.size());
		
		
		ll.insert(4, 13);
		ll.print();
		
		ll1.removeHead();
		System.out.println(ll1.isEmpty());
		
		
		
		
		
		
		
	}

}
