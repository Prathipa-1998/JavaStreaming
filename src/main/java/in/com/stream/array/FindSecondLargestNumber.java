package in.com.stream.array;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,6,3,8,9,4,0,7};
		Integer secondlarge=Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow(()->new RuntimeException("there is no second large element found"));
		System.out.println(secondlarge);
	}

}
