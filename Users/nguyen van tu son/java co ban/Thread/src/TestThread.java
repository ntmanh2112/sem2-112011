import Thread.ThreadA;
import Thread.ThreadB;


public class TestThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ThreadA threada = new ThreadA();
			threada.setName("Tien Trinh A");
			
			ThreadB b = new ThreadB();
			Thread threadb = new Thread(b);
			threadb.setName("Tien Trinh B");
			
			threada.start();
			threada.join(); // cho chay tung tien trinh
			threadb.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
