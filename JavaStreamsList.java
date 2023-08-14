package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JavaStreamsList {

	public static void main(String[] args) {
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
         
		 
			/* duplicate elements in a given integers list */
		 Set<Integer> set = new HashSet<>();
         myList.stream()
               .filter(n -> !set.add(n))
               .forEach(System.out::println);
			/*
			 * myList.stream() .filter(n -> set.add(n)) .forEach(System.out::println);
			 */
         
			/* find the first element of the list */
         myList.stream()
         .findFirst()
         .ifPresent(System.out::println);
         
			/* total number of elements */
         Long count = myList.stream().count();
         System.out.println(count);
         
			/* maximum value element present */
         int max = myList.stream().max(Integer::compare).get();
         System.out.println(max);
         
         
	}

}
