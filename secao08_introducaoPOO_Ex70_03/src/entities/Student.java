package entities;

public class Student {

	public String nome;
	public double nota1, nota2, nota3;

	public double mediaFinal() {
		return this.nota1 + this.nota2 + this.nota3;
	}

	public double pontosFaltantes() {
		if (mediaFinal() >= 60) {
			return 0.00;
		} else {
			return 60.00 - mediaFinal();
		}
	}
}
