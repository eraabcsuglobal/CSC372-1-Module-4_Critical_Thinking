public class Rectangle extends Shape {

   // width
   private double width;
   // length
   private double length;
   
	//Implement a parameterized constructor needed initialize the data.
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	//Implement a "toString" method that prints out the area and perimeter.
	public String toString() {
		return "Rectangle area: " + area() + " Rectangle perimeter: " + perimeter();
	}
	
	//Implement methods to compute the area and perimeter.
	@Override
	public double area() {
		return (width * length);
	}
	
	@Override
	public double perimeter() {
		return (2 * (length + width));
	}
}