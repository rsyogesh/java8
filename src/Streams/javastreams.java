package Streams;

import java.util.*;
import java.util.stream.*;
import java.util.Arrays;
import java.util.List;
import java.lang.String;
import java.nio.file.*;
import java.io.IOException;

public class javastreams {

	public static void main(String[] args) {
		
		System.out.println(
				IntStream
				.range(1, 10)
				.sum()	
				);
		
			
		System.out.println();
		
		Stream.of("ana", "arya", "ava", "adam")
				.sorted()
				.findFirst()
				.ifPresent(System.out::println);
		
		String[] names = {"rashmi", "yogesh", "sai", "sukumar", "geetha"};
		Arrays.stream(names)
				.filter(x -> x.startsWith("s"))
				.sorted()
				.forEach(System.out::println);
		System.out.println();
		
		Arrays.stream(new int[]{2,4,6,8})
				.map(x -> x*x)
				.average()
				.ifPresent(System.out::println);
	}

}
