package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;

	public double netSalary() {
		return this.grossSalary - this.tax;
	}

	public void increaseSalary(double percente) {
		this.grossSalary += this.grossSalary * percente / 100;
	}

}
