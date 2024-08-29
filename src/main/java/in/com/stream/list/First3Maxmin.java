package in.com.stream.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class First3Maxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=Arrays.asList(1,6,4,3,2,5,7,10);
		
		//first 3 minimum values
		l1.stream().sorted().limit(3).forEach(e->System.out.println("minimumValues:"+e));
		
		//first 3 maximum values
		l1.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(e->System.out.println("maximumValues:"+e));

	}

}
