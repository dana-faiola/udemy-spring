package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	public int binarySearch(int[]numbers, int numbersToSerachFor ) {
	
	int[] sortedNumbers = sortAlgorithm.sort(numbers);
	System.out.println(sortAlgorithm);
	//Search an array
	return 3;
	}
}
