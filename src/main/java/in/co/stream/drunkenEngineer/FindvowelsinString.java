package in.co.stream.drunkenEngineer;

import java.util.Map;
import java.util.stream.Collectors;

public class FindvowelsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="i love you";
		
		long count=word.chars().filter((x)->{return (x=='a'||x=='e'||x=='i'||x=='o'||x=='u');}).count();
		System.out.println("the vowels count in given sring is:"+count);
		
	}

}
