package in.com.stream.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=Arrays.asList(1,6,2,4,8,9,10,23,31,78);
		int min=l1.stream().min(Comparator.naturalOrder()).get();
		System.out.println(min);
		int max=l1.stream().sorted(Comparator.reverseOrder()).findFirst().get();
		System.out.println(max);

	}

}
