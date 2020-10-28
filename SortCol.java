package exercise03;

import java.util.Scanner;

public class SortCol {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a 3-by-3 matrix row by row:");
		double[][] m = new double[3][3];
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++) {
				m[i][j] = sc.nextDouble();
			}
		}

		double[][] sorted = sortColumns(m);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				System.out.print(sorted[i][j]+" ");
			}
			System.out.println("");
		}
		if (sc != null)
			sc.close();
	}

	public static double[][] sortColumns(double[][] m) {
		int len = m[0].length;
		double[][] sorted = new double[len][len];
		for (int i = 0; i < len; i++) {
			double[] column = new double[len];
			for (int j = 0; j < len; j++) {
				column[j] = m[j][i];
				}
			bubbleSort(column);
			for (int j = 0; j < len; j++) {
				sorted[j][i] = column[j];
			}
		}
		return sorted;

	}

	public static double[] bubbleSort(double[] column) {
		int len = column.length;
		for (int i = 1; i < len; i++) {
			for (int j = 0; j < len - i; j++) {
				if (column[j] > column[j + 1]) {
					double temp = column[j];
					column[j] = column[j + 1];
					column[j + 1] = temp;
				}
			}
		}
		return column;
	}
}
