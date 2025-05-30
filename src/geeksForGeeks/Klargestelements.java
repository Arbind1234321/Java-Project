package geeksForGeeks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Klargestelements {

	public static void main(String[] args) {

	}

	public static ArrayList<Integer> kLargest(int[] arr, int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);

		for (int num : arr) {
			if (minHeap.size() < k) {
				minHeap.offer(num);
			} else if (num > minHeap.peek()) {
				// Retrieves and removes the head of this queue,or returns null if this queue is
				// empty.
				minHeap.poll();
				// Inserts the specified element into this priority queue.
				minHeap.offer(num);
			}
		}

		// Convert heap to list and sort in descending order
		ArrayList<Integer> result = new ArrayList<>(minHeap);

		result.sort(Collections.reverseOrder());

		return result;

	}

}
