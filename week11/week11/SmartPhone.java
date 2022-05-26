package week11;

public class SmartPhone extends Calc implements PhoneInterface {

	@Override
	public void sendCall() {
		System.out.println("띠리링");		
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");		
	}
	
	public void schedule() {
		System.out.println("일정을 관리합니다.");		
	}
	
	public static void main(String[] args) {
		SmartPhone Phone = new SmartPhone();
		Phone.printLogo();
		Phone.sendCall();
		System.out.println("3과 5를 더하면 " + Phone.calculate(3, 5));
		Phone.schedule();
	}
}
