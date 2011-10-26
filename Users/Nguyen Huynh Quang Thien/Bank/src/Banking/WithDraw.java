package Banking;

public class WithDraw implements Runnable{
	private int amount;
	
	public WithDraw(int _amount){
		this.amount = _amount;
	}
	@Override
	public void run() {
		synchronized (Account.balance) {
			System.out.println("số dư trước khi rút là : " + Account.balance);
			try {
				for(int i=0; i<5; i++) {
					Thread.sleep(500);
					System.out.println("wait,withdraw process....");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			Account.balance = Account.balance - this.amount;
			System.out.println("Số dư sau khi rút là : " + Account.balance);
		}
	}
}
