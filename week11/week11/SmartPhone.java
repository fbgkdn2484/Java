package week11;

public class SmartPhone extends Calc implements PhoneInterface {

	@Override
	public void sendCall() {
		System.out.println("�츮��");		
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ�� �Խ��ϴ�.");		
	}
	
	public void schedule() {
		System.out.println("������ �����մϴ�.");		
	}
	
	public static void main(String[] args) {
		SmartPhone Phone = new SmartPhone();
		Phone.printLogo();
		Phone.sendCall();
		System.out.println("3�� 5�� ���ϸ� " + Phone.calculate(3, 5));
		Phone.schedule();
	}
}
