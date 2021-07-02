package entities;

public class Account {
	
	private int accoutNumber;
	private String name;
	private double balance;

	public Account() {		
	}	

	public Account(int accoutNumber, String name, double initialDeposit) {
		this.accoutNumber = accoutNumber;
		this.name = name;
		this.deposito(initialDeposit);
	}
	
	public Account(int accoutNumber, String name) {
		this.accoutNumber = accoutNumber;
		this.name = name;
		this.balance= 0.0;
	}

	public int getAccoutNumber() {
		return accoutNumber;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	
	public void deposito (double valor) {
		this.balance += valor;
	}
	
	public void saque (double valor) {
		this.balance -= valor + 5.00;
	}		

}
