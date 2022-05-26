package week11;

public abstract class Shape1 {
	
	String name;
	Shape1 next;
	public Shape1() {
		next = null;
	}
	public Shape1 getNext() {
		return next;
	}
	public void setNext(Shape1 next) {
		this.next = next;
	}
	public abstract void draw();
}
