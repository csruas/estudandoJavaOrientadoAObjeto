package br.com.alura.screenmatch.exercicio;

public class ConversorMoeda implements ConversãoFinanceira{
	
	@Override
	public void converterDolarParaReal(double valorDoral) {
		double cotacaoDolar = 4.80;
		double valorReal = valorDoral * cotacaoDolar;
		
		System.out.println("O valor em reais e: R$" + valorReal);
	}

	

}
