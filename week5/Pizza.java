package week5;

class Circle{
	int radius;
	String name;

	// method overloading 매개변수의 타입, 개수, 위치가 다르면 여러개 생성가능 자바만 이를 시그니처
	public Circle() {
//		기본생성자
	}
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public Circle(int radius, String name) {
		this(radius);	//this.radius = radius;
		this.name = name;
	}
	
	double getArea() {
		double area = 3.14 * radius * radius;
		return area;
	}
}

public class Pizza {

	public static void main(String[] args) {
		Circle pizza = new Circle(5, "자바피자");
//		pizza.radius = 5;
//		pizza.name = "자바피자";
		System.out.println(pizza.name + "의 면적은 " + pizza.getArea());
		
		Circle donut = new Circle(2, "자바도넛");
//		donut.radius = 2;
//		donut.name = "자바도넛";
		System.out.println(donut.name + "의 면적은 " + donut.getArea());

	}

}
