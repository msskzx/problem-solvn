package preez.mayhem.implementation;

import java.util.LinkedList;
import java.util.Queue;

public class Prefix_Evaluation {

	static int evaluate(String s) {
		String[] a = s.split(" ");
		Queue<String> queue = new LinkedList<String>();
		for (int i = 0; i < a.length; i++)
			queue.add(a[i]);
		String cur, op1, op2;
		while (queue.size() > 1) {
			cur = queue.remove();
			if (isOperator(cur)) {
				op1 = queue.peek();
				if (!isOperator(op1)) {
					queue.remove();
					op2 = queue.peek();
					if (!isOperator(op2)) {
						queue.remove();
						queue.add(ev(cur, op1, op2) + "");
					} else {
						queue.add(cur);
						queue.add(op1);
					}
				} else {
					queue.add(cur);
				}
			} else {
				queue.add(cur);
			}
		}
		return Integer.parseInt(queue.remove());

	}

	static boolean isOperator(String s) {
		return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
	}

	static int ev(String cur, String op1, String op2) {
		int a = Integer.parseInt(op1);
		int b = Integer.parseInt(op2);
		if (cur.equals("*"))
			return a * b;
		if (cur.equals("+"))
			return a + b;
		if (cur.equals("-"))
			return a - b;
		return a / b;
	}

	public static void main(String[] args) {
		// 16
		System.out.println(evaluate("+ 10 * 2 3"));

		// 2
		System.out.println(evaluate("- 3 1"));

		// -2
		System.out.println(evaluate("- 1 3"));

		// 10
		System.out.println(evaluate("+ 10 + / * 2 5 10 -1"));

		// 7
		System.out.println(evaluate("+ 1 * 2 3"));

		// 159
		System.out.println(evaluate("- + * 9 + 2 8 * + 4 8 6 3"));

		// 120
		System.out.println(evaluate("* 5 + 20 / 24 6"));

		// 14
		System.out.println(evaluate("/ * 4 + 3 4 2"));

	}

}
