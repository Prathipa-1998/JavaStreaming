package in.com.stream.string;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfallDigitnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=234891;
		
		Integer summing=Stream.of(String.valueOf(number).split("")).collect(Collectors.summingInt(Integer::parseInt));
		System.out.println(summing);

	}

}
