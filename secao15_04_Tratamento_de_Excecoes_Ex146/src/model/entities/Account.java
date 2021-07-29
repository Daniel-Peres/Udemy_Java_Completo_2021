package model.entities;

import model.exceptions.BusinessException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public Double getBalance() {
		return balance;
	}

	public void deposit(Double amount) {
		this.balance += amount;
	}

	public void withdraw(Double amount) {

		if (amount > getWithdrawLimit()) {
			throw new BusinessException("Erro de Saque: O valor excede o limite de saque !!!");
		}

		if (this.balance < amount) {
			throw new BusinessException("Erro de Saque: Saldo insuficiente !!!");
		}

		this.balance -= amount;
		
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", holder=" + holder + ", balance=" + String.format("%.2f", balance)
				+ ", withdrawLimit=" + String.format("%.2f", withdrawLimit) + "]";
	}

}
