package vanzareMasini;

import java.io.Serializable;

public class Car implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String numarDeInmatriculare;
	
	private int vitezaMasina;

	public Car() {}

	public String getNumarDeInmatriculare() {
		return numarDeInmatriculare;
	}

	public void setNumarDeInmatriculare(String numarDeInmatriculare) {
		this.numarDeInmatriculare = numarDeInmatriculare;
	}

	public int getVitezaMasina() {
		return vitezaMasina;
	}

	public void setVitezaMasina(int vitezaMasina) {
		this.vitezaMasina = vitezaMasina;
	}

}
