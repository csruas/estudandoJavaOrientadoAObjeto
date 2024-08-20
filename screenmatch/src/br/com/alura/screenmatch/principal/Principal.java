package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {

	public static void main(String[] args) {
		Filme favorito = new Filme();
		
		System.out.println("======================Filme=========================");
        favorito.setNome("The Matrix ");
        favorito.setAnoDeLancamento(1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);

        favorito.exibeFichaTecnica();
        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(9);
        
        System.out.println("======================Serie=========================");
        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodioPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost :" + " " + lost.getDuracaoEmMinutos());
        System.out.println("Média de avaliações do filme : " + favorito.pegaMedia());
        
        
        Filme outroFilme = new Filme();
		
		System.out.println("======================Outro Filme=========================");
		outroFilme.setNome("Narnia ");
		outroFilme.setAnoDeLancamento(2021);
		outroFilme.setDuracaoEmMinutos(300);
		outroFilme.setIncluidoNoPlano(true);
        
        
        System.out.println("======================Calculando o tempo da Serie=========================");
        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.incluir(favorito);
        calculadoraDeTempo.incluir(lost);
        calculadoraDeTempo.incluir(outroFilme);
        System.out.println(calculadoraDeTempo.getTempoTotal());
        
        
    }
	

}
