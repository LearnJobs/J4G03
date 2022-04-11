package j4g03.day08;

public class StaticBlock {
	// static blocks are executed only once
	// This is called singleton object
	static {
		System.out.println("Static Block is Executed");
	}
	
	public static void main(String[] args) {
		new StaticBlock();
		new StaticBlock();
		new StaticBlock();
		new StaticBlock();
	}

}