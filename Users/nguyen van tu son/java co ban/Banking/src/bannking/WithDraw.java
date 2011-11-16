package bannking;

public class WithDraw implements Runnable {
	private int amount;
	
	public WithDraw(int _amount) {
		this.amount = _amount;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (Account.balance) {
			System.out.println("So du truoc khi rut la: " + Account.balance);
			try {
				for (int i = 0; i < 5; i++) {
					Thread.sleep(500);
					System.out.println("Wait, withdram process.....");
				}
			} catch (Exception e) {
				e.printStackTrace();
			} 
			Account.balance = Account.balance -  this.amount;
			System.out.println("So du sau khi rut la: " + Account.balance);
		}
	}
}