package oops;
abstract class Figure {
	double dim1;
	double dim2;

	Figure(double a, double b) {
		dim1 = a;
		dim1 = b;
	}

	abstract double area1();
}

class Rectangle extends Figure {

	Rectangle(double a, double b) {
		super(a, b);
		
	}

	@Override
	double area1() {
		System.out.println("inside area for rectangle");
		return dim1 * dim2;
	}

	class Triangle extends Figure {

		Triangle(double a,double b) {
			super(a, b);
		}

		@Override
		double area1() {
			System.out.println("inside area for triangle");
			return (dim1 * dim2) / 2;
		}
	}
}
public class ClassFigure {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(9, 10);
//		Triangle t = new Triangle(10, 8);
		Figure figref;
		figref = r;
		System.out.println("Area is " + figref.area1());
		System.out.println("Area using retangle object " + r.area1());
//		figref = t;
		System.out.println("Area is " + figref.area1());
	}

}
