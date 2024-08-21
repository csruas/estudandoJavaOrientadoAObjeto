package br.com.alura.screenmatch.exercicio;

public class Livro extends Produto implements calculavel{
	private String autor;
	
	@Override
    public double calcularPrecoFinal(double preco) {
        return preco * 0.9; 
    }

	

}
