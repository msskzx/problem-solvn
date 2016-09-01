package preez.toolz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListStuff {

	public static void print(List<Integer> inte) {
		for (int i = 0; i < inte.size(); i++) {
			System.out.print(inte.get(i) + ", ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
//		String[] c = { "one", "deux", "drie", "khamsa", "deux" };
//
//		List<String> cl = Arrays.asList(c);
//		System.out.print("First list: ");
//		print(cl);
//
//		Collections.reverse(cl);
//		System.out.print("First list reversed: ");
//		print(cl);
//		List<String> gl = cl;
//		System.out.print("Second list: ");
//		print(gl);
//		System.out.println("\n");
//
//		System.out.println("Have something in common: " + Collections.disjoint(cl, gl));
//		System.out.println("\"deux\" frequencey in first list: " + Collections.frequency(cl, "deux"));
//
//		ArrayList<String> sor = new ArrayList<>(cl);
//
//		c[0] = "Un";
//		c[1] = "Zwei";
//
//		// Arrays.asList(c) will be affected
//		// new ArrayList<>(cl) won't
//
//		print(cl);
//		print(sor);
//
//		Collections.sort(sor, new StringLengthComparator());
//		print(sor);

	
		List<Integer> inte = new ArrayList<>();
		inte.add(1);
		inte.add(3);
		inte.add(4);
		inte.add(2);
		print(inte);
		Collections.sort(inte, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		
		});
		
		print(inte);
	
	}

}

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		if (o1.length() == o2.length())
			return 0;
		return o1.length() > o2.length() ? 1 : -1;
	}

}
