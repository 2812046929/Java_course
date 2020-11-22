package exercise07;

public class IllegalTriangleException extends Exception{
	

	public IllegalTriangleException() {
		super("没有满足三角形任意两边之和大于第三边");
	}

}
