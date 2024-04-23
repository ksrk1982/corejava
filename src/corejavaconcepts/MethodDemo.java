package corejavaconcepts;

public class MethodDemo {
	public static void add() {
		int a = 80;
		int b = 90;
		System.out.println(a + b);
	}
	public static void sub() {
		int a = 90;
		int b = 80;
		System.out.println(a - b);
	}
	public static void mul() {
		int a = 90;
		int b = 80;
		System.out.println(a * b);
	}
	public static void main(String[] args) {
		System.out.println("Iam Main Method");
            add();
            sub();
            mul();
             }

}
