package Abstractionpractice;

abstract class MyAbstractClass {
	public int a;
	public int b;
public MyAbstractClass(int a, int b) {
	this.a= a;
	this.b= b;
}
public void print() {
	System.out.print("a= "+a);
	System.out.println("b= "+b);
}
}
