package in.com.stream.array;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {1,5,2,4,8,9,1,2,10,8};
		Map<Integer,Long> freq=Arrays.stream(num).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		freq.forEach((k,v)->System.out.println("key:"+k+"valaue:"+v));
	}

}
