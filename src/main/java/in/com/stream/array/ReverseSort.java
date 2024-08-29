package in.com.stream.array;

import java.util.Arrays;
import java.util.Comparator;

public class ReverseSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,7,3,2,9,2,5};
		Integer[] sortedArray=Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).toArray(Integer[]::new);
		int[] a=Arrays.stream(sortedArray).mapToInt(Integer::intValue).toArray();
		Arrays.stream(a).forEach(s->System.out.println(s));
	}
}

