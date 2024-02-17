package com.br.calculadora.model;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTeste {

	@Test
	public void somar() {
		double n1 = 10;
		double n2 = 20;
		
		Calculadora cal = new Calculadora(n1, n2);
		double result = cal.somar();
		Assert.assertEquals(30, result,0.01);
	}

	
	@Test
	public void subtrair() {
		double n1 = 10;
		double n2 = 20;
		
		Calculadora cal = new Calculadora(n1, n2);
		double result = cal.subtrair();
		Assert.assertEquals(10, result,0.01);
	}
	
	
	@Test
	public void multiplicar() {
		double n1 = 10;
		double n2 = 20;
		
		Calculadora cal = new Calculadora(n1, n2);
		double result = cal.multiplicar();
		Assert.assertEquals(200, result,0.01);
	}
	
	@Test
	public void dividir() {
		double n1 = 10;
		double n2 = 20;
		
		Calculadora cal = new Calculadora(n1, n2);
		double result = cal.dividir();
		Assert.assertEquals(0.5, result,0.01);
	}
	
}
