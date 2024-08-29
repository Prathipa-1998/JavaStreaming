package in.com.stream.array;

import java.util.Arrays;

public class MultiplesOf5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,5,4,10,45,90,25};
		
		//to print mutiple of 5
		//Arrays.stream(arr).filter(n->n%5==0).forEach(System.out::println);	
		
		//to create array that multiple of 5
		int[] narr=Arrays.stream(arr).filter(n->n%5==0).toArray();
		System.out.println(Arrays.toString(narr));

	}

}
