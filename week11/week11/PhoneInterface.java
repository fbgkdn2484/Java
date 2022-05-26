package week11;

public interface PhoneInterface {
	
	public static final int timeout = 1000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("** Phone **");
	}
	default void printLogo1() {
		System.out.println("** Phone1 **");
	}
	
}
