package Thread;

public class ThreadA extends Thread {
	
	@Override
	public void run() {
		System.out.println(this.getName());
		for (int i = 0; i<10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
