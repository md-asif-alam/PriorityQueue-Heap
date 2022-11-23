package com.asif.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueSortImpl {

	public static void main(String[] args) {
		
		//For ASC order (MinHeap By Default)
		//PriorityQueue<Integer> pq=new PriorityQueue<>();
		
		//For DSC order (MaxHeap)
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		
		int[] ranks= {65,33,23,89,99,11,26,48};
		
		for(int i=0;i<ranks.length;i++)
		{
			pq.add(ranks[i]);
		}
		
		while(pq.size()>0) {
			System.out.println(pq.peek());
			pq.remove();
		}

	}

}
