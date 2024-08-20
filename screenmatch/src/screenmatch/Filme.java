package screenmatch;

public class Filme {
	
	String nome;
	int anoDeLancamento;
	double incluidoNoPlano;
	double somaDasAvaliacoes;
	int totalduracaoEmMinutos;
	int totalDeAvaliacoes;
	
	
	void exibeFichaTecnica() {
		System.out.println("Nome do Filme" + nome);
		System.out.println("Ano do Lançamento" + anoDeLancamento);
	}
	
	void avalia(double nota) {		
		somaDasAvaliacoes += nota;
		totalDeAvaliacoes++;
	}
	
	double obterMedia() {
		
		return somaDasAvaliacoes / totalDeAvaliacoes;
	}

}
