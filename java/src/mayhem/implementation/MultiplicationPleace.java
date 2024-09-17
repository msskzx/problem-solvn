package mayhem.implementation;

public class MultiplicationPleace {

	public static void main(String[] args) {
		int r = 36;
		for(int i = 0;i<=r;i++) {
			for(int j = i;j<=r;j++) {
				for(int k = j+1;k<=r;k++) {
					if(i*j*k==r)
						System.out.printf("%d %d %d => %d\n",i,j,k,i+j+k);
				}
			}
		}
	}

}
