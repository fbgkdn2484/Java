package week5;

import java.util.Scanner;

public class Rectangle {
	private int width, height;
	int getArea() {
		return width * height;
	}
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.print("높이 입력 : ");
		rect.height = sc.nextInt();
		System.out.print("너비 입력 : ");
		rect.width = sc.nextInt();
		
		System.out.println("사각형의 면적은 " + rect.getArea());
		sc.close();
	}

}
