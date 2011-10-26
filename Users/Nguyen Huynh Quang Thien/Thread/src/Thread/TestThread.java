package Thread;

public class TestThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ThreadA threadA = new ThreadA();
			threadA.setName("Tiến trình 1");
			
			ThreadB b = new ThreadB();		
			Thread threadB = new Thread(b);
			threadB.setName("Tiến trình 2");
			
			//chạy từng cái một
			threadA.start();
			threadA.join();
			threadB.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
