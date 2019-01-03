package prob6;

public class RectTriangle extends Shape {

	public RectTriangle(double i, double j) {
		// TODO Auto-generated constructor stub
		super(i,j);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*height*0.5;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return width+height+Math.sqrt(width*width+height*height);
	}

}
