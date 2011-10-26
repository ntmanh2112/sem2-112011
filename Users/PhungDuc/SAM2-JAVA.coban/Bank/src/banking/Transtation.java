package banking;


public class Transtation implements Runnable {
	
	private int amount;
	
	public Transtation(int _amount){
		this.amount= _amount;
	}
	@Override
	public void run(){
		synchronized (Account.balance) {
			System.out.println("Chuyen tien");
			System.out.println("So du truoc khi chuyen la : "+Account.balance);
			for(int i=0; i<5 ; i++)
			{
				try {
					Thread.sleep(500);
					System.out.println("Wait, transtation process...");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			Account.balance= Account.balance- this.amount;
			System.out.println("So du con lai la : "+Account.balance);
			
		}
	}

}
