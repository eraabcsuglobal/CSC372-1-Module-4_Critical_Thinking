public class Circle extends Shape {
	
	// create radius attribute
	private double radius;
	
	// Implement a parameterized constructor to initialize the data.
	public Circle(double radius) {
		this.radius = radius;
	}
	
	

	// Implement a "toString" method that prints out the area and perimeter.
	public String toString() {
		return "Circle area: " + area() + " Circle perimeter: " + perimeter();
	}
	
	// Implement methods to compute the area and perimeter.
	@Override
	public double area() {
		return (Math.PI * Math.pow(radius, 2));
	}
	
	@Override
	public double perimeter() {
		return (2 * Math.PI * radius);
	}
	
	
}