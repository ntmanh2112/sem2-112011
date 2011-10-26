package banking;

public class WithDraw implements Runnable {
	
	private int amount;
	
	public WithDraw(int _amount){
		this.amount=_amount;
		
	}
	@Override
	public void run(){
		synchronized (Account.balance) {
			System.out.println("Rut tien");
			System.out.println("So du truoc khi rut la :" + Account.balance);
			try {
				for (int i =0 ; i<5; i++){
				Thread.sleep(500);
				System.out.println("Wait, withdraw process ... ");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Account.balance = Account.balance - this.amount;
			System.out.println("So du sao khi rut la : "+ Account.balance);
		}
	}

}
