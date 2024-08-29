package in.com.stream.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message="hi where are you";
		String reversedstr=Arrays.stream(message.split(" ")).map(word->new StringBuffer(word).reverse()).collect(Collectors.joining());
		System.out.println(reversedstr);
	}

}
