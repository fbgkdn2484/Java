package week11;

import java.util.Scanner;

public class GraphicEditor {
	private Shape1 start = null, end = null;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		while(choice != 4) {
			System.out.print("����(1), ����(2), ��� ����(3), ����(4)>>");
			choice = sc.nextInt();
		}
	}
}
