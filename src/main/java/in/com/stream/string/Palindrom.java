package in.com.stream.string;

import java.util.stream.IntStream;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="madam";
		boolean result=IntStream.range(0, str.length()/2).noneMatch(i->str.charAt(i)!=str.charAt(str.length()-i-1));
		if(result)
		{
			System.out.println("given string is palindrom");
		}
		else
		{
			System.out.println("given string not a palindrom");
		}

	}

}
