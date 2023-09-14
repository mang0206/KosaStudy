package day15_study01;

public class ThreadLab {

	public static void main(String[] args) throws Exception {
		Thread1 th1 = new Thread1();
		Thread2 th2 = new Thread2();
		Thread3 th3 = new Thread3();
		Thread4 th4 = new Thread4();
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th1.join();
		th2.join();
		th3.join();
		th4.join();
		
		System.out.println("MAIN 수행 종료");
	}

}

class Thread1 extends Thread {
	public void run() {
		final int A_code = (int)'A'; 
		final int L_code = (int)'L';
		
		for(int i = A_code; i<=L_code;i++) {
			System.out.println((char)i);
			try {
				sleep(2000);
			} catch (Exception e) {
			}
		}
	}
}

class Thread2 extends Thread {
	public void run() {
		final int a_code = (int)'a'; 
		final int h_code = (int)'h';
		
		for(int i = a_code; i<=h_code;i++) {
			System.out.println((char)i);
			try {
				sleep(3000);
			} catch (Exception e) {
			}
		}
	}
}

class Thread3 extends Thread {
	public void run() {
		for(int i = 1; i<=30;i++) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}

class Thread4 extends Thread {
	public void run() {
		for(int i = 0; i<10;i++) {
			System.out.println("JAVA");
			try {
				sleep(5000);
			} catch (Exception e) {
			}
		}
	}
}
