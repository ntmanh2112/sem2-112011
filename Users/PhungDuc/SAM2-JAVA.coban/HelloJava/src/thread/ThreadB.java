package thread;

public class ThreadB implements Runnable {
	
	@Override
	public void run(){
		System.out.println(Thread.currentThread().getName());
		for (int i =10; i>=0; i--)
		{
			System.out.println("	"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
