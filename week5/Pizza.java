package week5;

class Circle{
	int radius;
	String name;

	// method overloading �Ű������� Ÿ��, ����, ��ġ�� �ٸ��� ������ �������� �ڹٸ� �̸� �ñ״�ó
	public Circle() {
//		�⺻������
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
		Circle pizza = new Circle(5, "�ڹ�����");
//		pizza.radius = 5;
//		pizza.name = "�ڹ�����";
		System.out.println(pizza.name + "�� ������ " + pizza.getArea());
		
		Circle donut = new Circle(2, "�ڹٵ���");
//		donut.radius = 2;
//		donut.name = "�ڹٵ���";
		System.out.println(donut.name + "�� ������ " + donut.getArea());

	}

}
