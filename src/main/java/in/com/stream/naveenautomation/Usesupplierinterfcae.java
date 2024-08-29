package in.com.stream.naveenautomation;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Usesupplierinterfcae {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr= {"amith","preethi","simba","preethi"};
		//Stream<String> str=Arrays.asList(arr).stream();
		Supplier<Stream<String>> str=()->Stream.of(arr);
		str.get().forEach(x->System.out.println(x));
		Long count=str.get().filter(x->x.equals("preethi")).count();
		System.out.println(count);
		

	}

}
