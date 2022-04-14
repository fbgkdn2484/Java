package week7;

public class Point {

	private int x, y; // 한 점을 구성하는 x, y 좌표  		private는 이 클래스 안에서만 쓰고 접근할 수 있음 상속 X
	public void set(int x, int y) {
		this.x = x; this.y = y;
	}
	public void showPoint() { // 점의 좌표 출력
		System.out.println("(" + x + "," + y + ")");
	}

	
}
