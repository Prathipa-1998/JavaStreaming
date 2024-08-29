package in.com.stream.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDublicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="hi hello vanakkam".replaceAll("\\s+", "").toLowerCase();
		Set<String> uniq=new HashSet();
		Set<String> dublicates=Arrays.stream(input.split("")).filter(ch->!uniq.add(ch)).collect(Collectors.toSet());
		
				
	}

}
