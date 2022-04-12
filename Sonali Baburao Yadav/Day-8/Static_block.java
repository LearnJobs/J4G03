
public class Static_block {

	// static blocks are executed only once
	// This is called singleton object
	static {
		System.out.println("Static Block is Executed");
	}
	
	public static void main(String[] args) {
		new Static_block();
		new Static_block();
		new Static_block();
		new Static_block();
	}
}
