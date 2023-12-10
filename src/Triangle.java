public class Triangle extends Shape {
	
	//length of side1, length of side2, length of side3, each is a double
	private double side1;
	private double side2;
	private double side3;
	
	//Implement a parameterized constructor to initialize the data.
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	
	//Implement a "toString" method that prints out the area and perimeter.
	public String toString() {
		return "Triangle area: " + area() + " Triangle perimeter: " + perimeter();
	}
	
	
	//Implement methods to compute the area and perimeter.
	@Override
	public double area() {
		return (Math.sqrt(perimeter()*(perimeter() - side1)*(perimeter() - side2) * (perimeter() - side3)));
	}
	
	@Override
	public double perimeter() {
		return ((side1 + side2 + side3) / 2);
	}
	
	
}