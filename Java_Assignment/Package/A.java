package p1;

public class A {
	public void myfun() {
		System.out.println("inside A");
	}
	
}

class B extends A{
	void myfunA() {
		A ref = new A();
		ref.myfun();
		}
}

class c extends A{
	void myfunA() {
		A ref = new A();
		ref.myfun();

	}
}
