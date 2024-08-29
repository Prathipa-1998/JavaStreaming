package in.com.stream.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=Arrays.asList(1,3,2,4,5,10,25,16,18,35,89,62,20);
		List<Integer> evnnum=l1.stream().filter(n->n%2==0).collect(Collectors.toList());
		evnnum.stream().forEach(n->System.out.println("even number:"+n));
		List<Integer> oddnum=l1.stream().filter(n->n%2!=0).collect(Collectors.toList());
		oddnum.stream().forEach(n->System.out.println("odd number:"+n));

	}

}
