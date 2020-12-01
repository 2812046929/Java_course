package exercise08;

public class Circle extends GeometricObject {
	private double radius;

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	/** Return radius */
	public double getRadius() {
		return radius;
	}

	/** Set a new radius */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override // ** Return area *//*
	public double getArea() {
		return radius * radius * Math.PI;
	}

	/** Return diameter */
	public double getDiameter() {
		return 2 * radius;
	}

	@Override /** Return perimeter */
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	@Override
	public void display() {
		System.out.println("A circle with radius: "+radius);
	}

	@Override
	public int compareTo(GeometricObject o) {
		// TODO Auto-generated method stub
		double r = ((Circle) o).radius;
		if (r > radius)
			return -1;
		else if(r<radius)
			return 1;
		else return 0;
	}

	@Override
	public GeometricObject max(GeometricObject o) {
		double r = ((Circle) o).radius;
		if (r >= radius)
			return o;
		else
			return this;
	}
}
