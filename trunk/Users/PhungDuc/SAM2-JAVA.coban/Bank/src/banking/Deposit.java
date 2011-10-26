package banking;

public class Deposit implements Runnable {
	
	private int amount;
	
	public Deposit (int _amount){
		this.amount= _amount;
	}
	@Override
	public void run(){
		synchronized (Account.balance) {
			System.out.println("Gui tien");
			System.out.println("So du truoc khi gui la : "+ Account.balance);
			
			for(int i =0 ; i<5 ; i++)
			{
				try {
					Thread.sleep(500);
					System.out.println("Wait, Deposit process ... ");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			Account.balance= Account.balance + this.amount;
			System.out.println("So du sao khi goi la :" + Account.balance);
		}
	}

}
