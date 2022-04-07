package week6;

public class CallByReference {
	
	public static void main(String[] args) {
		
		Circle pizza = new Circle(10);
		System.out.printf("%.2f\n", pizza.getArea());
		increase(pizza);
		System.out.printf("%.2f\n", pizza.getArea());
		
	}
	static void increase(Circle m) {
		m.radius++;
	}
	
}
