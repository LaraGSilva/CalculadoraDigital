package com.br.calculadora.view;

import javax.swing.JOptionPane;

import com.br.calculadora.model.Calculadora;

public class Main {

	public static void main(String[] args) {
		
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));
		
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("1.Somar" + "2.Subtrair" + "3.Divir" + "Multiplicar"));
		
		Calculadora calculadora = new Calculadora(n1, n2);
		
	 	
		switch(opcao){
			
		case 1:
			double result = calculadora.somar();
			JOptionPane.showMessageDialog(null, result);
			break;
		case 2:
			double resultsub = calculadora.subtrair();
			JOptionPane.showMessageDialog(null, resultsub);
			break;
		case 3:
			double resultdiv = calculadora.dividir();
			JOptionPane.showMessageDialog(null, resultdiv);
			break;
		case 4:
			double resultmul = calculadora.multiplicar();
			JOptionPane.showMessageDialog(null, resultmul);
			break;
		}
	}

}
