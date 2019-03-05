package org.bala.learnings;

interface funcInterface {
	void run(String c);
}

public class method_ref {

	public static void main(String[] args) {
		String b = "Bala is always great";
		funcInterface FI = method_ref::sayWofi;
		FI.run(b);

	}
	
	public static void sayWofi(String a) {
		System.out.println("Testing with functional interface " + a);
	}

}
