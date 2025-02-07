package com.wipro.java.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

	public StreamApi() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*List<String> list = Arrays.asList("Wipro","Infosys","TCS");
		List<String> stream =list.stream().
				filter(name->name.startsWith("W")).
				collect(Collectors.toList());
		System.out.println(stream);
		List<String> stream1 = list.stream().
				map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(stream1);*/
		//Creating a list of integers
		List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);
		List<Integer> numbers1 = Arrays.asList(6, 2, 7, 4, 10);
		//Sorting list in ascending order
		List<Integer> sortedNumbers = numbers.stream()
		   .sorted()
		   .collect(Collectors.toList());
		//Sorting Descending order
		List<Integer> sortedNumbers1 = numbers1.stream()
			       .sorted(Comparator.reverseOrder())
			       .collect(Collectors.toList());

		//Printing the list
		System.out.println("Sorted list:"+sortedNumbers);
		System.out.println("Descneding order list:"+sortedNumbers1);
		
		List<Integer> number1 = Arrays.asList(10, 20, 5, 25, 30);
		//Finding the Min number from the list
		int min = numbers.stream().min(Integer::compare).get();
		//Finding The Max number from the list
		int max = numbers.stream().max(Integer::compare).get();
		System.out.println("numbers:"+number1);
		System.out.println("Max number:"+max);
		System.out.println("Max number:"+min);

	}

}
