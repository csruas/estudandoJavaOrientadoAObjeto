package br.com.alura.screenmatch.desafio.modelos;

public class Audio {
	
	private String titulo;
	private int totalReproducoes;
	private int totalCurtidas;
	private int classificacao;
	
	
	public void curte() {
		this.totalCurtidas++;
		
	}
	
	public void reproduzir() {
		this.totalReproducoes++;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTotalReproducoes() {
		return totalReproducoes;
	}

	public int getTotalCurtidas() {
		return totalCurtidas;
	}

	public int getCassificacao() {
		return classificacao;
	}

	public void setCassificacao(int cassificacao) {
		this.classificacao = cassificacao;
	}
	
	


}
