package jaxrs;

public class Imc {
	private double imc;
	private double peso;
	private double altura;
	private String sexo;
	private String situacao = "...";

	public Imc(double peso, double altura, String sexo) {
		this.peso = peso;
		this.altura = altura;
		this.sexo = sexo;
		this.imc = this.peso / (this.altura * this.altura);
		calcularSituacao();
	}

	public double getImc() {
		return this.imc;
	}

	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}

	public String getSexo() {
		return sexo;
	}

	public void calcularSituacao() {

		if (sexo.equals("masculino") && imc <= 20.7) {
			situacao = "Abaixo do Peso Ideal!!";
		} else if (sexo.equals("masculino") && imc <= 26.4) {
			situacao = "No Peso Normal!!";
		} else if (sexo.equals("masculino") && imc <= 27.8) {
			situacao = "Marginalmente Acima do Peso!!";
		} else if (sexo.equals("masculino") && imc <= 31.1) {
			situacao = "Acima do Peso Ideal!!";
		} else if (sexo.equals("masculino") && imc > 31.1) {
			situacao = "Obeso!!";
		} else if (sexo.equals("feminino") && imc <= 19.1) {
			situacao = "Abaixo do Peso!!";
		} else if (sexo.equals("feminino") && imc <= 25.8) {
			situacao = "No Peso Normal!!";
		} else if (sexo.equals("feminino") && imc <= 27.3) {
			situacao = "Marginalmente Acima do Peso!!";
		} else if (sexo.equals("feminino") && imc <= 32.3) {
			situacao = "Acima do Peso Ideal!!";
		} else if (sexo.equals("feminino") && imc > 32.3) {
			situacao = "Obesa!!";
		}
	}

	public String getSituacao() {
		return situacao;
	}

}
