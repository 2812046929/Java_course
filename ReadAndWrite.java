package exercise07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
public class ReadAndWrite {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			PrintWriter pw = new PrintWriter("Exercise12_15.txt");
			for(int i=0;i<100;i++) {
				Random r=new Random();
				int in=r.nextInt(50);
				pw.write(in+" ");
			}
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Scanner sc=new Scanner(new File("Exercise12_15.txt")).useDelimiter(" ");
		int[] a=new int[100];
		for(int i=0;i<100;i++) {
			String s=sc.next();
			a[i]=Integer.parseInt(s);
		}
		//ÅÅÐò
		final InsertSort insertSort = new InsertSort();
		 int[] b=new int[100];
		 try {
			b=insertSort.sort(a);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(b[i*10+j]+" ");
			}
			System.out.println();
		}

	}

}
