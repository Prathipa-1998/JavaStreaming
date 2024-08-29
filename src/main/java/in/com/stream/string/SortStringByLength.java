package in.com.stream.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringByLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence="hi where are you";
		String[] str=sentence.split(" ");
		List<String> sortedlist=Arrays.stream(str).sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
		String sortedstring=sortedlist.stream().collect(Collectors.joining(" "));
		System.out.println(sortedstring);

	}

}
