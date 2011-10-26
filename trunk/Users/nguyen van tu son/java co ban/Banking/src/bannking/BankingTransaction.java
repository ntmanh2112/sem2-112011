package bannking;

public class BankingTransaction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account.balance = 1000000;
		
		Thread withDraw = new Thread(new WithDraw(1000000));
		withDraw.setName("Thread withDraw");
		
		Thread deposit = new Thread(new Deposit(2000000));
		deposit.setName("Thread Deposit");
		
		try {
			withDraw.start();
			deposit.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
