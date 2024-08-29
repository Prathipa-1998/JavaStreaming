package in.com.stream.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,8,7,6,5};
		int[] b=IntStream.rangeClosed(1,a.length).map(i->a[a.length-i]).toArray();
		System.out.println(Arrays.toString(b));

	}

}
