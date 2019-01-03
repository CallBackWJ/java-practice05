package prob6;

public class Rectangle extends Shape implements Resizable{

	public Rectangle(double i, double j) {
		// TODO Auto-generated constructor stub
		super(i,j);
	}

	@Override
	public void resize(double d) {
		// TODO Auto-generated method stub
		height=height*d;
		width=width*d;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*height;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (width+height)*2;
	}

}
