package in.com.stream.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumOffirst10Naturals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int sum = IntStream.range(1, 11).sum();
         
	        System.out.println(sum);


	}

}
