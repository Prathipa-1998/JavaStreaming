package in.com.stream.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Merge2UnsortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,6,4,1,9};
		int b[]= {3,7,0,5,10};
		
		int[] c=IntStream.concat(Arrays.stream(a),Arrays.stream(b)).toArray();
		System.out.println(Arrays.toString(c));

	}

}
