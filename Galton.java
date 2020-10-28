package exercise03;
import java.util.Scanner;

public class Galton {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of balls to drop:");
		int ball_num=sc.nextInt();
		System.out.print("Enter the number of slots in the bean machine:");
		int slot_num=sc.nextInt();
		int[] slots=new int[slot_num];
		String[] paths=new String[ball_num];
		for(int i=0;i<ball_num;i++) {
			String path="";
			int count=0;
			for(int j=0;j<slot_num;j++) {
				double re=Math.random();
				if(re<0.5)  path+="L";
				else {
					path+="R";
					count++;
				}
			}
			paths[i]=path;
			slots[count]++;
		}
		for(int i=0;i<ball_num;i++)
			System.out.println(paths[i]);
		if(sc!=null)sc.close();
		for(int i=0;i<slots.length;i++)
		System.out.print(slots[i]+"");
		DrawColumnChart.draw(slots);
	}
}
