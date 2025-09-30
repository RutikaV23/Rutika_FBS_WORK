package p2;

import p1.A;

 class X {
	void myFunX() 
	{
		A ref = new A();
		ref.myfun();
	}
}

class Y extends A
{
	void myfunY() 
	{
		A ref = new A();
		ref.myfun();
		System.out.println("inside Y");

	}
}