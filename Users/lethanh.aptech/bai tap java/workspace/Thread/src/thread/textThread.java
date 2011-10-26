package thread;

public class textThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ThreadA threadA = new ThreadA();
			threadA.setName("Tien trinh 1");
			
			ThreadB b = new ThreadB();
			Thread threadB = new Thread(b);
			threadB.setName("Tien Trinh 2");
			
			threadA.start();
			threadA.join();//tien trinh 1 chay xong thi tien trinh 2 moi chay
			threadB.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
