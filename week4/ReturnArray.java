package week4;

public class ReturnArray {

	public static int[] makeArray() {
		int temp[] = new int[4];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = i;
		}
		return temp;
	}
	
	public static void main(String[] args) {
		int intArray[] = makeArray();
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
	}
}
