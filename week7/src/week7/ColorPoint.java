package week7;

public class ColorPoint extends Point{

	private String color; // 점의 색
	
	public void setColor(String color) {
		this.color = color;
		//x = 10; y = 20; 			상속하는 주체가 private일 경우 다른 클래스 즉, 여기서의 접근이 허용되지 않음
	}
	public void showColorPoint() { // 컬러 점의 좌표 출력
		System.out.print(color);
		showPoint(); // Point의 showPoint() 호출
	}

	
}
