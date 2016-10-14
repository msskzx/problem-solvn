package preez.implementation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Third_Reversed {

	/*
	 * Write a method that takes an integer queue q as an argument, and returns
	 * a queue containing (in reverse) every third element of q starting with
	 * the last element
	 * 
	 * if q contains {a, b, c, d, e} then a queue containing {e, b} should be
	 * returned
	 */

	public static void main(String[] args) {
		Queue<Integer> input = new LinkedList<Integer>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);

		Queue<Integer> qu = new LinkedList<Integer>();
		Stack<Integer> st = new Stack<Integer>();
		for (int x : input)
			st.push(x);

		int r = 0;
		while (!st.isEmpty()) {
			if (r % 3 == 0)
				qu.add(st.pop());
			else
				st.pop();
		}
		for (int x : qu)
			System.out.println(x);

	}

}
