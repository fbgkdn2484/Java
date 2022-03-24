package week4;

public class ArrayEx1 {
	//
	public static void main(String[] args) {
		
		int[] ArrayInt1 = new int[5];
		for (int i = 0; i < ArrayInt1.length; i++) {	
			
			ArrayInt1[i] = i*10;
			
		}
		for (int i = 0; i < ArrayInt1.length; i++) {
			System.out.println(ArrayInt1[i]);
		}
		
		int[] ArrayInt2 = {1, 2, 3, 4, 5};
		for (int i : ArrayInt2) {
			System.out.println(i);
		}
		
		int ArrayInt3[] = ArrayInt2;
		for (int i : ArrayInt3) {
			System.out.println(i);
		}
	}
	
}
