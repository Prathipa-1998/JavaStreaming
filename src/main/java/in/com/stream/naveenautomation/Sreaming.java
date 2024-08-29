package in.com.stream.naveenautomation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Sreaming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sum of list of objectsx
		List<Integer> numbers=Arrays.asList(1,5,6,2,7,1,9,2,4,5);
		Optional<Integer> suming=numbers.stream().reduce((a,b)->a+b);
		System.out.println("sum:"+suming);
		
		//average
		double average=numbers.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println("average:"+average);
		
		//square number an get aerage
		double sqrvalue=numbers.stream().map(num->num*num).mapToInt(e->e).average().getAsDouble();
		System.out.println("squreaveragevalue:"+sqrvalue);
		
		//print odd and even numbers
		List<Integer> oddnum=numbers.stream().filter(e->e%2!=0).collect(Collectors.toList());
		//even numbers
		List<Integer> evennum=numbers.stream().filter(e->e%2==0).collect(Collectors.toList());
		
		//print duplicates
		Map<Integer,Long> freq=numbers.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		List<Integer> dups=freq.entrySet().stream().filter(entry->entry.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("dublicates:"+dups);
		
		//find min&max
		
		int minimum=numbers.stream().sorted().findFirst().get();
		int maxnum=numbers.stream().sorted(Comparator.reverseOrder()).findFirst().get();
		System.out.println("mnivalue:"+minimum+","+"maxvalu:"+maxnum);
		
		//multiple the array itself
		Optional<Integer> mulArray=numbers.stream().reduce((a,b)->a*b);
		if(mulArray.isPresent())
		{
		System.out.println("array multiplication:"+mulArray);
		}
		else {
			System.out.println("the array is empty");
		}
		

	}

}
