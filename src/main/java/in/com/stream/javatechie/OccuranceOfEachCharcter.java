package in.com.stream.javatechie;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.print.DocFlavor.BYTE_ARRAY;

public class OccuranceOfEachCharcter {

	public static void main(String[] args) {
		// TODO Auto-generated method st`"
		String name="ilovejavatechie";
		Map<Character, Long> freq=name.chars().mapToObj(a->(char)a).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		List<Character> dublicates=freq.entrySet().stream().filter(entry->entry.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
		Character nonrepeat=freq.entrySet().stream().filter(e->e.getValue()==1).map(e->e.getKey()).findFirst().get();
		System.out.println(nonrepeat);
		System.out.println(dublicates);
		List<String> list=Arrays.asList("preethi","arivu","simba","preethi");
		 Map<String, Long> freq1 = list.stream()
	                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		 System.out.println(freq1);
		 int[] numbers= {5,4,3,6,7,9,10};
		 Integer secondhigh=Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		 System.out.println(secondhigh);
		 //longest string
		 String[] arr= {"java","techie","to","luckest"};
		 String longestString=Arrays.stream(arr).max(Comparator.comparingInt(String::length)).orElse(null);
		 System.out.println("longeststring:"+longestString);
		 //anotherway
		 String longest=Arrays.stream(arr).reduce((word1, word2)->word1.length()>word2.length()?word1:word2).get();
		 System.out.println(longest);
		 //find all elements from array who starts with 1
		 int[] a= {11,45,71,156,34,1};
		 List<String> str=Arrays.stream(a).boxed().map(s->s+"").filter(s->s.startsWith("1")).collect(Collectors.toList());
		 System.out.println(str);
		 //String join example
	
		 
		 }
	}
	


