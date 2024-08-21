package br.com.alura.screenmatch.desafio.principal;

import br.com.alura.screenmatch.desafio.modelos.MinhasPrefereidas;
import br.com.alura.screenmatch.desafio.modelos.Musica;
import br.com.alura.screenmatch.desafio.modelos.Podcast;

public class Principal {

	public static void main(String[] args) {
		Musica minhaMusica = new Musica();
		minhaMusica.setTitulo("Forever");
		minhaMusica.setArtista("Kiss");
		
		
		for (int i = 0; i < 1000; i++) {
			minhaMusica.reproduzir();
		}
		
		for (int i = 0; i < 50; i++) {
			minhaMusica.curte();
			
		}
		
		Podcast meupostCast = new Podcast();
		meupostCast.setTitulo("Bolha dev");
		meupostCast.setDescricao("Meu primeiro HIT");
		
		for (int i = 0; i < 5000; i++) {
			meupostCast.reproduzir();
		}
		
		for (int i = 0; i < 1000; i++) {
			meupostCast.curte();
			
		}
		
		MinhasPrefereidas minhasPrefereidas = new MinhasPrefereidas();
		minhasPrefereidas.inclui(meupostCast);
		minhasPrefereidas.inclui(minhaMusica);
		  
		
	}

}
