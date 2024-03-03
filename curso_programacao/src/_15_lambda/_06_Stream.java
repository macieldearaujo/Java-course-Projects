package _15_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _06_Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(2, 8, 6, 12, 3);
		Stream<Integer> st1 = list.stream();
		System.out.println(Arrays.toString(st1.toArray()));
		
		Stream<String> st2 = Stream.of("Alex", "Maria", "Ana", "Matheus");
		System.out.println(Arrays.toString(st2.toArray()));
		
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(st3.limit(8).toArray()));
		
		Stream<Long> st4 = Stream.iterate(new long[]{ 0L, 1L }, p->new long[]{ p[1], p[0]+p[1] }).map(p -> p[0]); // ********
		System.out.println(Arrays.toString(st4.limit(40).toArray()));
	}

}
