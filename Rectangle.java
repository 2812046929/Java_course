package exercise08;

public class Rectangle extends GeometricObject {
  private double width;
  private double height;

  public Rectangle() {
  }

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;	
  }

  /** Return width */
  public double getWidth() {
    return width;
  }

  /** Set a new width */
  public void setWidth(double width) {
    this.width = width;
  }

  /** Return height */
  public double getHeight() {
    return height;
  }

  /** Set a new height */
  public void setHeight(double height) {
    this.height = height;
  }

  @Override /** Return area */
  public double getArea() {
    return width * height;
  }

  @Override /** Return perimeter */
  public double getPerimeter() {
    return 2 * (width + height);
  }
  
  @Override
  public void display(){
	  System.out.println("A rectangle with width: "+width+", height: "+height);
  }

@Override
public int compareTo(GeometricObject o) {
	// TODO Auto-generated method stub
	double area1=((Rectangle)o).width*((Rectangle)o).height;
	double area2=width*height;
	if(area1>area2) return -1;
	else if(area1==area2) return 0;
	else return 1;
	}

@Override
public GeometricObject max(GeometricObject o) {
	// TODO Auto-generated method stub
	// TODO Auto-generated method stub
	double area1=((Rectangle)o).width*((Rectangle)o).height;
	double area2=width*height;
	if(area1>=area2) return o;
	else return this;
}
}
