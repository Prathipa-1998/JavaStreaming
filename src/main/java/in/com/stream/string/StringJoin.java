package in.com.stream.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
		String newstr=listOfStrings.stream().collect(Collectors.joining(",","[","]"));
		System.out.println(newstr);

	}

}
