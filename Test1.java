package exercise08;

public class Test1 {

	public static void main(String[] args) {
		Rectangle r1=new Rectangle(1,2);
		Rectangle r2=new Rectangle(2,3);
		Rectangle r3=(Rectangle) r1.max(r2);
		r3.display();
		Circle c1=new Circle(3);
		Circle c2=new Circle(2);
		Circle c=(Circle)c1.max(c2);
		c.display();
	}

}
