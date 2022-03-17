package week3;

public class NestedForEx1 {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
//				System.out.print(i + "*" + j + "=" + i*j);
				System.out.printf("%d*%d=%d", i, j, i*j);
				System.out.print("\t");
			}
			System.out.println();
		}
		System.out.printf("%s %f", "수고했습니다", 3.141592);
	}
	
}
