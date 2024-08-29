package in.com.stream.list;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1=Arrays.asList("preethi","priya","simba","selva","arivu","preethi","simba","daisy","simba");
		Map<String,Long> freqcount=l1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		Entry<String,Long> maxcount=freqcount.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		System.out.println("mose frequent word is:"+maxcount.getKey()+" "+"count of the frequency is:"+maxcount.getValue());
	}

}
