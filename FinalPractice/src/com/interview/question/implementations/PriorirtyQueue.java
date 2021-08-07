package com.interview.question.implementations;

public class PriorirtyQueue {

	Task[] heap;
	int capacity;
	int heapsize;

	public PriorirtyQueue(int capacity) {
		this.capacity = capacity;
		this.heap = new Task[capacity];
		this.heapsize = 0;
	}

	public void clear() {
		this.heap = new Task[capacity];
		this.heapsize = 0;
	}

	public boolean isEmpty() {
		return heapsize == 0;
	}

	public boolean isFull() {
		return heapsize == capacity;
	}

	public int size() {
		return heapsize;
	}

	public void add(String job, int priority) {
		Task newTask = new Task(job, priority);
		heap[heapsize] = newTask;
		int pos = heapsize;
		while (pos > 0 && getParentIndex(pos) >= 0 && newTask.priority > heap[getParentIndex(pos)].priority) {
			Task temp = heap[pos];
			heap[pos] = heap[getParentIndex(pos)];
			heap[getParentIndex(pos)] = temp;
			pos = getParentIndex(pos);
		}
		heapsize++;
	}
	public Task remove() {
		if (isEmpty()) return null;
		if(size() == 1) {
			Task rmvTask = heap[0];
			clear();
			return rmvTask;
		}
		Task rmvTask = heap[0];
		heap[0] = heap[heapsize-1];
		heap[heapsize-1] = null;
		heapsize--;
		int pos = 0;
		while (pos < heapsize) {
			int maxPriority = heap[pos].priority;
			int crtPos = pos;
			if (getLeftChildIndex(pos)<heapsize && getRightChildIndex(pos)<heapsize) {
				maxPriority = Math.max(heap[pos].priority, Math.max(heap[getLeftChildIndex(pos)].priority,heap[getRightChildIndex(pos)].priority));
				if (maxPriority == heap[getLeftChildIndex(pos)].priority ) {
					swap(pos, getLeftChildIndex(pos));
					pos = getLeftChildIndex(pos);
				}else if (maxPriority == heap[getRightChildIndex(pos)].priority) {
					swap(pos, getRightChildIndex(pos));
					pos = getRightChildIndex(pos);
				}
			}else if(getRightChildIndex(pos)>=heapsize && getLeftChildIndex(pos)< heapsize){
				maxPriority = Math.max(maxPriority, heap[getLeftChildIndex(pos)].priority);
				if (maxPriority != heap[pos].priority) {
					swap(pos, getLeftChildIndex(pos));
					pos = getLeftChildIndex(pos);
				}
			}
			if (crtPos == pos) {
				break;
			}
		}
		return rmvTask;
	}
		public void swap (int i, int j) {
			Task tempTask = heap[i];
			heap[i] = heap[j];
			heap[j] = tempTask;
		}

	public int getParentIndex(int i) {
		return (int) Math.ceil(i / 2) - 1;
	}

	public int getLeftChildIndex(int i) {
		return 2 * i + 1;
	}

	public int getRightChildIndex(int i) {
		return 2 * i + 2;
	}

	public void printHeap() {
		for (int i = 0; i < heapsize; i++) {
			System.out.println(heap[i]);
		}
	}
}
