package banKing;

public class Deposit implements Runnable {
	private int amount ;
	public Deposit(int _amount) {
		this.amount = _amount;
	}
	
	

	@Override
	public void run() {
		synchronized (Account.balance) {
			System.out.println(" so du truoc khi rut la : " + Account.balance);
			try {
			for (int i= 0; i<5 ;i++){
				
				Thread.sleep(500);
				System.out.println("wait,withdraw process.....");
			}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Account.balance += this.amount;
				System.out.println("so du sau khi rut la : " + Account.balance);
		}
		
	}
	}
