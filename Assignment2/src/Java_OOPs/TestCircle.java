package Java_OOPs;

public class TestCircle {
 public static void main(String[] args) {
	 Circle circle=new Circle();
	 double area= circle.getArea();
	 double circumference=circle.getCircumference();
	 System.out.println(area);
	 System.out.println(circumference);
	 Circle circle2=new Circle(2.5,"Blue");
	 System.out.println(circle2.getArea());
	 System.out.println(circle2.getCircumference());
 }
}
