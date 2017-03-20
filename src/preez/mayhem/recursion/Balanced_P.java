package preez.mayhem.recursion;

import java.util.ArrayList;

public class Balanced_P {

	/*
	 * given n print all possible balanced parenthesis n = 1 => ()
	 * 
	 * n = 2 => ()(), (())
	 * 
	 * n = 3 => ()()(), (())(), ()(()), (()()), ((()))
	 */

	static ArrayList<String> a = new ArrayList<String>();
	static ArrayList<String> b = new ArrayList<String>();
	static String s;
	static int n;

	static void ev_pos() {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			res = s.substring(0, i) + "()" + s.substring(i);
			if (!b.contains(res))
				b.add(res);
		}
	}
	
	static void f() {
		a.add("()");
		while (n-- > 1) {
			while (!a.isEmpty()) {
				s = a.remove(0);
				ev_pos();
			}
			a = b;
			b = new ArrayList<String>();
		}
	}

	public static void main(String[] args) {
		n = 4;
		
		f();
		
		for (String z : a)
			System.out.println(z);

	}

}
