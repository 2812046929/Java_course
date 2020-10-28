package exercise03;

import java.util.Scanner;

public class FindBlock {

	public static void main(String[] args) {
		System.out.print("Enter the number of rows in the matrix:");
		Scanner sc = new Scanner(System.in);
		int row_num = sc.nextInt();
		int[][] m = new int[row_num][row_num];
		for (int i = 0; i < row_num; i++) {
			for (int j = 0; j < row_num; j++) {
				m[i][j] = sc.nextInt();
			}
		}
		int[] result=findLargestBlock(m);
		System.out.print("The maximum square submatrix is at ( "+result[0]+","+result[1]+" ) with size "+result[2]);
		if (sc != null)
			sc.close();

	}

	public static int[] findLargestBlock(int[][] m) {
		int len = m[0].length;
		int[] result = new int[3];
		boolean flag=false;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				flag=false;
				if (m[i][j] == 1) {
					int max=0;
					for (int k = i; k < len; k++) {
						for (int p = j; p < len; p++) {
							if (m[k][p] == 0) {
								flag=true;
								max = min(k - i, p - j);
								System.out.println(""+i+j+k+p);
								break;
							}
							else {
								max=min(k-i,p-j)+1;
							}
						}
						if(flag==true)
							break;
					}
					if (result[2] < max) {
						result[0] = i;
						result[1] = j;
						result[2] = max;
					}
					
				}
			}
		}
		return result;
	}

	public static int min(int a, int b) {
		if (a > b)
			return b;
		else
			return a;
	}
}
