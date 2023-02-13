package entities;

public class Account {
	
	private Integer umber;
	private String holder;
	private Double balance;
	
	public Account () {}

	public Account(Integer umber, String holder, Double balance) {
		this.umber = umber;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getUmber() {
		return umber;
	}

	public void setUmber(Integer umber) {
		this.umber = umber;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	
	
	
	
	
}
