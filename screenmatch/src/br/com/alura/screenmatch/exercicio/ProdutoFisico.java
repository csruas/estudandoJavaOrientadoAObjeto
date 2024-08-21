package br.com.alura.screenmatch.exercicio;

public class ProdutoFisico extends Produto implements calculavel{

	@Override
	public double calcularPrecoFinal(double preco) {
		return preco * 1.05;
	}
}
