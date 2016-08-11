package preez.toolz;

import java.util.ArrayList;

public class GPA {

	/*
	 * Mathematics, Physics Introduction to computer science, Chemistry(t),
	 * Production Technology , Chemistry(p)
	 */
	static double[] score1 = { 1.3, 0.7, .7, 1, 1, 1 };
	static double[] hours1 = { 8, 5, 6, 4, 3, 2 };

	/*
	 * Mathematics I,Introduction to Computer Programming,Physics II,Engineering
	 * Drawing & Design
	 */
	static double[] score2 = { 0.7, 0.7, 1, 0.7 };
	static double[] hours2 = { 8, 6, 5, 3 };

	/*
	 * Mathematics III, Electrical Circuits I, Data structures and Algorithms,
	 * Physics III (P), Physics III (t), Digital Logic Design
	 */
	static double[] score3 = { 1, 1, 0.7, 0.7, 0.7, 1 };
	static double[] hours3 = { 8, 6, 6, 2, 5, 4 };

	/*
	 * Concepts of Programming Languages,Computer Organization & System
	 * Programming, Math IV Probability and Statistics, Electrical Circuits II,
	 * Signal & System Theory, Computer Programming Lab
	 */
	static double[] score4 = { 0.7, 2, 1.7, 1.7, 2.3, 0.7 };
	static double[] hours4 = { 4, 4, 4, 6, 6, 4 };

	// all => score1 -> hours1 -> score2 -> hours2
	static ArrayList<double[]> all = new ArrayList<>();

	public static double sum(double[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++)
			sum += a[i];
		return sum;
	}

	public static double mult(double[] a, double[] b) {
		double r = 0;
		for (int i = 0; i < a.length; i++)
			r += a[i] * b[i];
		return r;
	}

	public static double nom() {
		double sum = 0;
		for (int i = 0; i < all.size() - 1; i += 2) {
			double[] a = all.get(i);
			double[] b = all.get(i + 1);
			sum += mult(a, b);
		}
		return sum;
	}

	public static double denom() {
		double sum = 0;
		for (int i = 0; i < all.size() - 1; i += 2) {
			double[] b = all.get(i + 1);
			sum += sum(b);
		}
		return sum;
	}

	public static void main(String[] args) {
		all.add(score1);
		all.add(hours1);

		all.add(score2);
		all.add(hours2);

		all.add(score3);
		all.add(hours3);

		all.add(score4);
		all.add(hours4);

		double gpa = nom() / denom();
		System.out.println(gpa);

	}

}
