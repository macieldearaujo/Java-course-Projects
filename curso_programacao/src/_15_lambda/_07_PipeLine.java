package _15_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _07_PipeLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<Integer> list = Stream.of(3, 4, 5, 10, 7);
		
		List<Integer> num = list.
				filter(x -> x % 2 == 0)
				.map(x -> x * 10)
				.collect(Collectors.toList());
		
		System.out.println(Arrays.toString(num.toArray()));
	}

}
