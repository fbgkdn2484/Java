package week11;

public class B extends A {
	
	@Override
	void f() {
		System.out.println("부모 클래스의 메소드 호출");
		super.f();
	}

	void g() {
		System.out.println("자식 클래스의 g메소드 호출 ");
	}

}
