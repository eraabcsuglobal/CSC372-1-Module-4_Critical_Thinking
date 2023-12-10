import java.util.ArrayList;

public class ShapeArray {
   public static void main(String[] args) {
	   
		//Instantiate one triangle
		Triangle triangle = new Triangle(2.5, 3.0, 5.0);
		
		//Instantiate one circle
		Circle circle = new Circle(7.5);
		
		//Instantiate one square
		Rectangle square = new Rectangle(5.0, 5.0);
		
		//Store the class instances into an array named "shapeArray."
		ArrayList<Shape> shapeArray = new ArrayList<Shape>();
		
		shapeArray.add(triangle);
		shapeArray.add(circle);
		shapeArray.add(square);
		
		
		//Loop through the array and print out the instance data of each object using the object instance's "toString" method.
		for (int i = 0; i < shapeArray.size(); i++) {
			System.out.println(shapeArray.get(i).toString());
		}
		

   }
   
}