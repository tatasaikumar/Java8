import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListMaxNumber{
  public static void main(String[] args) {
		int  intArray[] = new int [] {1,2,3,4,5,6,7, 88. 55.77. 88. 156};
    
    System.out.println("Max number :" + Collections.max(listOfIntegers));

    Integer max = listOfIntegers.stream().mapToInt(v -> v).max().orElseThrow(NoSuchElementException::new);
		System.out.println("$$$$$$  max :" + max);


    int max = myList.stream().max(Integer::compare).get();
     System.out.println(max);


     int maxVal = myList.stream().collect(Collectors.maxBy(Integer::compare)).get();
     System.out.println("maxVal : " + maxVal);


     int max11 = myList.stream().max(Comparator.comparing(Integer::valueOf)).get();
     System.out.println("max11 :" + max11);
     
     
     Integer max1 = myList.stream()
             .max(Comparator.comparing(Integer::valueOf))
             .get();
     System.out.println("The Maximum number is: " + max1);

    
	}
}
