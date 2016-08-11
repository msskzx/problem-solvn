package preez.prede;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapStuff {

	public static void fracto(Map<Integer, Fracto> map) {
		Fracto a = new Fracto(1, 2);
		Fracto b = new Fracto(2, 3);
		Fracto c = new Fracto(4, 5);
		Fracto d = new Fracto(1, 2);

		map.put(2, b);
		map.put(1, c);
		map.put(3, a);
		map.put(4, d);

		for (Map.Entry<Integer, Fracto> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		System.out.println("10: " + map.get(10));
		System.out.println("-------");

	}

	public static void main(String[] args) {
		// https://docs.oracle.com/javase/7/docs/api/java/util/HashMap.html
		HashMap<Integer, Fracto> map = new HashMap<Integer, Fracto>();
		fracto(map);

		// insert order
		// https://docs.oracle.com/javase/7/docs/api/java/util/LinkedHashMap.html
		LinkedHashMap<Integer, Fracto> linko = new LinkedHashMap<>();
		fracto(linko);

		// natural order - comparator
		// https://docs.oracle.com/javase/7/docs/api/java/util/TreeSet.html
		TreeMap<Integer, Fracto> treeo = new TreeMap<>();
		fracto(treeo);

	}
}

class Fracto {
	int nom;
	int denom;

	public Fracto(int nom, int denom) {
		this.nom = nom;
		this.denom = denom;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + denom;
		result = prime * result + nom;
		return result;
	}

	public String toString() {
		return nom + " / " + denom;
	}
}
