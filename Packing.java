package exercise06;
import java.util.Scanner;
import java.util.ArrayList;
public class Packing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of objects:");
		int n=sc.nextInt();
		int[][] obs=new int[2][n];
		System.out.println("Enter the weights of objects:");
		for(int i=0;i<n;i++) {
			obs[0][i]=sc.nextInt();
			obs[1][i]=0;
		}
		int maxCon=10;
		ArrayList<Integer> con=new ArrayList<Integer>();
		obs[1][0]=1;       //put the first object in the first container
		con.add(obs[0][0]);
		int order=1;
		while(sum(obs[1])<n) {		
			for(int i=1;i<n;i++) {
				if(obs[1][i]==0) {
					if(sum(con)+obs[0][i]<maxCon) {
						con.add(obs[0][i]);
						obs[1][i]=1;
					}
				}
			}
			System.out.print("Container "+order+" contains objects with weight ");
			con.forEach((e)->{
			System.out.print(e+" ");
			});
			System.out.println(" ");
			order++;
			con.clear();
		}
		
	}
	static int sum(ArrayList<Integer> i) {
		int []result=new int[1];
		result[0]=0;
		i.forEach((e)->{
			result[0]+=e;
		});
		return result[0];
	}
	static int sum(int [] i) {
		int result=0;
		for(int j=0;j<i.length;j++) {
			result+=i[j];
		}
		return result;
	}
}
