package com.br.calculadora.model;

public class Calculadora {
	
	private double n1;
	private double n2;
	private double result;
	
	public Calculadora (double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public double somar () {
		this.result = n1 + n2;
		return result;
	}
	
	public double subtrair () {
		this.result = n2 - n1;
		return result;
	}
	
	public double multiplicar () {
		this.result = n1 * n2;
		return result;
	}
	
	public double dividir () {
		this.result = n1 / n2;
		return result;
	}
}
