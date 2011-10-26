package banking;

public class BankingTransaction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account.balance= 1000000;
		
		Thread withDraw = new Thread(new WithDraw(500000));
		withDraw.setName("Thread WithDraw");
		
		Thread deposit = new Thread(new Deposit(3000000));
		deposit.setName("Thread deposit");
		
		Thread transtation = new Thread(new Transtation(2000000));
		transtation.setName("Thread transtation");
		
		
		try {
			withDraw.start();
			deposit.start();
			transtation.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
