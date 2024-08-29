package in.com.stream.array;

import java.util.stream.IntStream;

public class TenEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=IntStream.rangeClosed(1, 10).filter(i->i%2==0).sum();
		System.out.println(sum);

	}

}
