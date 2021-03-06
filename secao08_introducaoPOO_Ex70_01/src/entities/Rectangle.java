package entities;

public class Rectangle {

	public double width;
	public double height;

	public double Area() {
		return this.width * this.height;

	}

	public double Perimeter() {
		return this.width * 2 + this.height * 2;
	}

	public double Diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
//									ou
//		return Math.sqrt(this.width * this.width + this.height * this.height);
	}

}
