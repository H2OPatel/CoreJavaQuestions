package com.link.list.linklist;

import com.link.list.node.Node;

public class LinkedList {

	private Node head;

	/*
	 * add() find(x) removeHead() remove(x) print() isEmpty() insert(position,x)
	 * 
	 */
	public LinkedList(Node head) {
		this.head = head;
	}
	
	public LinkedList(int x) {
		this.head = new Node();
		this.head.setData(x);
	}

	public void add(Node x) {
		if (this.head == null) {
			this.head = x;
		} else {
			Node current = this.head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(x);
		}
	}
	
	public void add(int x) {
		Node temp = new Node();
		temp.setData(x);
		if (this.head == null) {
			this.head = temp;
		} else {
			Node current = this.head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(temp);
		}
	}

	public void print() {
		Node current = this.head;
		System.out.println("Printing List");
		while (current != null) {
			System.out.print(current.getData()+"->");
			current = current.getNext();
		}
		System.out.println("End of List");
	}

	public int size() {
		int size = 0;
		Node current = this.head;
		while (current != null) {
			current = current.getNext();
			size++;
		}
		return size;
	}

	public boolean isEmpty() {
		// return this.head == null;
		// return this.head == null && this.size() == 0;
		if (this.head == null) {
			return true;
		}
		return false;

	}

	public int find(int x) {
		int position = 1;
		Node current = this.head;
		while (current != null) {
			if (x == current.getData()) {
				return position;
			}
			position++;
			current = current.getNext();
		}
		return -1;

	}
	
	public void insert(int position, int x) {
		if(position >= 1 && position < this.size()) {
			Node current = this.head;
			Node previous = new Node();
			int count = 1;
			while(current != null) {
				if(count == position) {
					Node temp = new Node();
					temp.setData(x);
					temp.setNext(current);
					previous.setNext(temp);
					if(position == 1) {
						this.head = temp;
					}
					//return;
					break;
				}
				previous = current;
				current = current.getNext();
				count++;
			}
		}else {
			System.out.println("Invalid Position");
		}
		
	}
	
	public void removeHead() {
		if(this.head != null) {
			this.head = this.head.getNext();
		}
	}
	// 5->6->7->8 , remove 7
	// c = 5, p = {}
	// p = c = 5, c = c.next = 6
	// p = c = 6, c = c.next = 7
	// p.next = 7.next = 8
	// 5->6->8
	// 6->7->8 when remove 5
	public void remove(int x) {
		Node previous = new Node();
		Node current = this.head;
		
		while(current != null) {
			if(current.getData() == x) {
				previous.setNext(current.getNext());
				if(current == this.head) {
					this.head = current.getNext();
				}
				break;
			}
			previous = current;
			current = current.getNext();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

/*
 * str1 = "abcdefg"
 * str2 = "gtbcdxf";
 * bcdf
 *  
 *  str = "kjdvbksdb"
 *  back tracking - dp
 *  
 * [1324,45,46,42646,4644,4646,46436,47646,4646,466]
 * 
 *  
 *  
 *  
 *  
*/