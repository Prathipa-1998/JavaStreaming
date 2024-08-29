package in.com.stream.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDublicateElemenets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=Arrays.asList(1,5,2,7,4,3,2,1,7);
		List<Integer> newList=l1.stream().distinct().collect(Collectors.toList());
		newList.forEach(System.out::println);

	}

}
