package exercise06;

import java.util.Random;
import java.util.Collection;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		System.out.println("Enter the array size n:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (r.nextDouble() > 0.5)
					matrix[i][j] = 0;
				else
					matrix[i][j] = 1;
			}
		}
		int max_row=0;
		int max_column=0;
		ArrayList<Integer> rowIndex=new ArrayList<Integer>();
		ArrayList<Integer> columnIndex=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			int sum_column=0;
			for(int j=0;j<n;j++) {
				System.out.print(matrix[i][j]+" ");
				sum_column+=matrix[j][i];
			}
			System.out.println("");
			int sum_row=sum(matrix[i]);
			if(sum_row>max_row) {
				if(!rowIndex.isEmpty())rowIndex.clear();
				max_row=sum_row;
				rowIndex.add(i);
			}else if(sum_row==max_row) {
				rowIndex.add(i);
			}
			if(sum_column>max_column) {
				if(!columnIndex.isEmpty()) columnIndex.clear();
				max_column=sum_column;
				columnIndex.add(i);
			}else if(sum_column==max_column) {
				columnIndex.add(i);
			}
		}
		
		System.out.print("The largest row index: ");
		rowIndex.forEach((e)->{
			System.out.print(e+" ");
		});
		System.out.println("");
		System.out.print("The largest column index: ");
		columnIndex.forEach((e)->{
		System.out.print(e+" ");
		});
		
		if (sc != null)
			sc.close();

	}
	static int sum(int[] s) {
		int sum=0;	
		for(int i=0;i<s.length;i++)
			sum+=s[i];
		return sum;
		
	}

}
