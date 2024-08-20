package screenmatch;

public class Principal {

	public static void main(String[] args) {
		Filme meuFilme = new Filme();
		
		meuFilme.nome = "O Poderoso Chefão";
		meuFilme.anoDeLancamento = 1960;
		meuFilme.totalduracaoEmMinutos = 180;
		meuFilme.avalia(8);
		meuFilme.avalia(10);
		meuFilme.avalia(9);
		
		System.out.println(meuFilme.somaDasAvaliacoes);
		System.out.println(meuFilme.totalDeAvaliacoes);
		System.out.println(meuFilme.obterMedia());
		
		meuFilme.exibeFichaTecnica();

	}
	
	

}
