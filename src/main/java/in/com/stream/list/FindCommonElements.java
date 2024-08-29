package in.com.stream.list;

import java.util.Arrays;
import java.util.List;

public class FindCommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=Arrays.asList(1,6,3,4,5,7,9);
		List<Integer> l2=Arrays.asList(7,5,1,10,23,56);
		l1.stream().filter(l2::contains).forEach(System.out::println);
	}

}
