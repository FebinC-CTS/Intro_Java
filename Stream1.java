import java.util.*;
import java.util.stream.*;

public class Stream1 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,3,2,1,2,3);
		
		List<Integer> copy = numbers.stream().collect(Collectors.toList());
		System.out.println(copy);
		
		List<Integer> even_no = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(even_no);
		
		List<Integer> sort = numbers.stream().sorted().distinct().collect(Collectors.toList());
		System.out.println(sort);
		
		List<Integer> skipping = numbers.stream().skip(2).limit(3).collect(Collectors.toList());
		System.out.println(skipping); //skip(2) means skips the 1st 2 index. or goes to 2nd index?
		
		int sum = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
		List<String> names = Arrays.asList("orange","apple","apple","pineapple");
		System.out.println(names);
		
		List<String> name_upper = names.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(name_upper);
		
		List<String> dist_names = names.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(dist_names);
		
		Optional<String> starta = names.stream().filter(n -> n.startsWith("a")).findFirst();
		//System.out.println(starta);  Optional[apple]
		starta.ifPresent(System.out::println);
		
	}
}
