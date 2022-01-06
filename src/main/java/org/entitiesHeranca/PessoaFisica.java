package entitiesHeranca;

public class PessoaFisica extends Contribuintes {
	private Double gastoSaude;

	public PessoaFisica() {

	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double imposto() {
		double imposto = 0;
		if (super.getRendaAnual() < 20000) {
			imposto = super.getRendaAnual() * 0.15;

		} else {
			imposto = super.getRendaAnual() * 0.25;
		}

		return imposto - gastoSaude * 0.5;
	}

}
