package mayhem.implementation;

import java.util.Stack;

public class DuplicatingStack {

	static Stack<String> createDuplicates(Stack<String> strings, Stack<Integer> numbers) {
		Stack<String> result = new Stack<String>();
		String s;
		int n;
		while (!strings.isEmpty()) {
			s = strings.pop();
			n = numbers.pop();
			while (n-- > 0)
				result.push(s);
		}
		return result;
	}

	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		Stack<Integer>n = new Stack<>();
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("D");
		n.add(1);
		n.add(2);
		n.add(3);
		n.add(4);
		
		Stack<String> r = createDuplicates(s, n);
		for(String x:r)
			System.out.println(x);
	}

}
