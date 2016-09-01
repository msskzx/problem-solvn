package preez.toolz;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetStuff {

	public static void main(String[] args) {
		// https://docs.oracle.com/javase/7/docs/api/java/util/TreeSet.html
		// https://docs.oracle.com/javase/7/docs/api/java/util/HashSet.html
		// https://docs.oracle.com/javase/7/docs/api/java/util/LinkedHashSet.html
		
		String[] stz = { "Je", "Sues", "Je", "Froz" };

		List<String> li = Arrays.asList(stz);

		System.out.println(li);

		Set<String> si = new HashSet<>(li);

		System.out.println(si);
	}

}
