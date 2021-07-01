package util;

public class CurrencyConverter {

	public double dollarPrice;
	public double dollarQuantity;

	public double dollarToReal() {
		return (this.dollarQuantity + this.dollarQuantity * 0.06) * this.dollarPrice;
	}
}
