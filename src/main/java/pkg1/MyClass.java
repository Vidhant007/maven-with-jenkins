package pkg1;

public class MyClass {
	
	public void show() {
		System.out.println("Welcome to Jenkins");
	}
	public void display() {
		System.out.println("New Code");

	}
	
	public void f3() {
		System.out.println("New Code build is generated through Poll SCM source code trigger");
	}
	
	public static void main(String args[]) {
		MyClass obj = new MyClass();
		obj.show();
		obj.display();
		obj.f3();
	}

}
