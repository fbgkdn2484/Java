package week4;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ĺ� �� ���ڸ� �Է��ϼ���>>");
		char s = sc.next().charAt(0);
		int a = (int)s - 96;
		
		for (int i = 0; i < a; i++) {
			
			for (int j = 0; j < a; j++) {
				
				System.out.print((char)j + 96);
				
			}
			
			System.out.println("");
		}
		sc.close();
	}
}
