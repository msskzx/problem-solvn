package mayhem.implementation;

import java.util.Arrays;

public class Counting_Sort {

	static int[] f;
	static int[] a = { 2, 1, 4, 5, 6, 3, 0, 1 };
	static int max;
	
	static void sort() {
		for(int i = 0;i<a.length;i++)
			max = Math.max(max, a[i]);
		f = new int[max+1];
		
		for(int i = 0;i<a.length;i++)
			f[a[i]]++;
		
		int ind = 0;
		for(int i = 0;i<f.length;i++) {
			while(f[i]>0) {
				a[ind] = i;
				f[i]--;
				ind++;
			}
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(a));
		sort();
		System.out.println(Arrays.toString(a));
	}

}
