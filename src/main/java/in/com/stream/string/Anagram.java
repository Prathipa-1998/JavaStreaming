package in.com.stream.string;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="race";
		String s2="care";
		String s3=Stream.of(s1.split(" ")).map(String::toUpperCase).collect(Collectors.joining());
		String s4=Stream.of(s2.split(" ")).map(String::toLowerCase).collect(Collectors.joining());
		if(s3.equals(s4))
		{
			System.out.println("the given strings are anagram");
		}
		else
		{
			System.out.println("the given string is not anagram");
		}

	}

}
