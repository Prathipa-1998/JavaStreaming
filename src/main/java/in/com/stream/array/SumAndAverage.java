package in.com.stream.array;

import java.util.Arrays;

public class SumAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,4,5,6,3,9};
		int sum=Arrays.stream(a).sum();
		double avg=Arrays.stream(a).average().getAsDouble();
		System.out.println("sum is:"+sum+" "+"average is:"+avg);

	}

}
