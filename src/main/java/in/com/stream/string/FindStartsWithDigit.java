package in.com.stream.string;

import java.util.Arrays;
import java.util.List;

public class FindStartsWithDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1 = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
		l1.stream().filter(str->Character.isDigit(str.charAt(0))).forEach(System.out::println);
		
	}

}
