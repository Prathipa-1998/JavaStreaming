package in.com.stream.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExtractDublicatesElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> l1 = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
         Set<Integer> uniqueElements = new HashSet<>();
         Set<Integer> duplicateElements = l1.stream().filter(i -> ! uniqueElements.add(i)).collect(Collectors.toSet());
         
         System.out.println(duplicateElements);
     }
 


	}


