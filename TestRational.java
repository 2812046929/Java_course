package exercise08;

public class TestRational {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Rational r1=new Rational("3","4");
		Rational r2=new Rational("3","5");
		System.out.println(r1.add(r2).toString());
		System.out.println(r1.subtract(r2).toString());
		System.out.println(r1.multiply(r2).toString());
		System.out.println(r1.divide(r2).toString());
		System.out.println(r1.compareTo(r2));
		System.out.print(r1.doubleValue());
	}

}
