public class Begin {
	public static void main() {
		System.out.println("main()");
	}

	public static void main(String arg) {
		System.out.println("main(String)");
	}

	public static void main(int n) {
		System.out.println("main(int)");
	}

	public static void main(String[] args) {
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
	}

	public static void main(int[] args) {
		System.out.println("main(int[])");
	}
}

class Runner {
	public static void main(String[] args) {
		Begin.main(new String[] {"One","Two","Three"});
		Begin.main(new int[] {1,2,3});
		Begin.main(new String[] {});
		Begin.main(10);
		Begin.main();
	}
}

//	Why the main method that receives the String[] argument is executed first?
