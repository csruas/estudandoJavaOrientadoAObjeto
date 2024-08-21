package br.com.alura.screenmatch.calculos;

public class FiltroDeRecomendacao {
	
	
	public void filtra(ClassificacaoDeFilme classificacaoDeFilme) {
		
		if(classificacaoDeFilme.getClassificacao() >= 4) {
			System.out.println("Está entre os preferidos do momento");
		}else if( classificacaoDeFilme.getClassificacao() >= 2) {
			System.out.println("Muito bem avaliado");
		}else {
			System.out.println("Coloque na sua lista para assistir depois");
		}
		
	}

}
