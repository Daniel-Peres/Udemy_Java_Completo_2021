package entities;

public class PessoaFisica extends Contribuinte {

	private Double gastosSaude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public Double calculoImposto() {
		double imposto = 0.0;

		if (super.getRendaAnual() < 20000.00) {
			imposto = super.getRendaAnual() * 0.15 - gastosSaude * 0.5;
		} else {
			imposto = super.getRendaAnual() * 0.25 - gastosSaude * 0.5;
		}

		return imposto;
	}

}
