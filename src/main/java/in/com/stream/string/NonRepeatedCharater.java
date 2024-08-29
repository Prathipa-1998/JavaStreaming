package in.com.stream.string;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedCharater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="devadharshini";
		Map<String,Long> freq=Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		String nonrepeated=freq.entrySet().stream().filter(entry->entry.getValue()<=1).map(entry->entry.getKey()).findFirst().get();
		System.out.println(nonrepeated);
	}
	

}
