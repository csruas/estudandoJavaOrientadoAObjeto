package br.com.alura.screenmatch.desafio.modelos;

public class MinhasPrefereidas {
	
	public void inclui(Audio audio) {
		if(audio.getCassificacao() >= 8 ) {
			System.out.println(audio.getTitulo() +  "é considerado sucesso absoluto");
		}else {
			System.out.println(audio.getTitulo() + " também e um dos que todo mundo esta curtindo");
		}
	}
}
