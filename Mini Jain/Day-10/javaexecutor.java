package day10;


	import java.util.concurrent.Executor;
	import java.util.concurrent.RejectedExecutionException;

	public class javaexecutor {
		public javaexecutor() {
			ExecutorImp eimp1 = new ExecutorImp();
			try {
				eimp1.execute(new NewThread1());
				eimp1.execute(new NewThread2());
				eimp1.execute(new NewThread3());
				eimp1.execute(new NewThread4());
			} catch(RejectedExecutionException e) {
			} catch(NullPointerException e) {
			}
		}

		public static void main(String[] args) {
			new javaexecutor();
		}
	}

	class ExecutorImp implements Executor {

		@Override
		public void execute(Runnable command) {
			Thread t = new Thread(command);
			t.start();
		}
	}

	class NewThread1 implements Runnable {

		@Override
		public void run() {
			System.out.println("Class-1");
			for(int i=0; i<=200; i++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

	class NewThread2 implements Runnable {

		@Override
		public void run() {
			System.out.println("Class-2");
			for(int i=400; i<=600; i++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

	class NewThread3 implements Runnable {

		@Override
		public void run() {
			System.out.println("Class-3");
			for(int i=1000; i<=1200; i++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

	class NewThread4 implements Runnable {

		@Override
		public void run() {
			System.out.println("Class-4");
			for(int i=2000; i<=2200; i++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

	


