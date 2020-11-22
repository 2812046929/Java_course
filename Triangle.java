package exercise07;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double side1 = sc.nextDouble();
		double side2 = sc.nextDouble();
		double side3 = sc.nextDouble();
		try {
			Triangle tr=new Triangle(side1, side2, side3);
		} catch (IllegalTriangleException e) {
			// TODO Auto-generated catch block
			System.out.print(e);
		}
		if(sc!=null) sc.close();

	}

	Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
		if (side1 + side2 < side3) {
			throw new IllegalTriangleException();
		}
		if (side1 + side3 > side2) {
			throw new IllegalTriangleException();
		}
		if (side2 + side3 > side1) {
			throw new IllegalTriangleException();
		}

	}

}
