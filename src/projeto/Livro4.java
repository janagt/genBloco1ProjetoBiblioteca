package projeto;

public class Livro4 extends CatSerialKiller{
	@Override
	public void mostrarNome(){
		System.out.print("Nome: ");
		this.nome = "Perdida";
		System.out.println(nome);
	}
	
	public void mostrarEditora() {
		System.out.print("Editora: ");
		this.editora = "Verus";
		System.out.println(editora);
	}
	
	public void mostrarAutor() {
		System.out.print("Autor(a): ");
		this.autor = "Carina Rissi";
		System.out.println(autor);
	}
	
	public void mostrarSinopse() {
		System.out.print("Sinopse: ");
		this.sinopse = "Sofia vive em uma metr�pole e est� acostumada com a modernidade e as facilidades que ela traz. Ela � independente e tem pavor � mera men��o da palavra casamento. Ap�s comprar um celular novo, algo misterioso acontece e Sofia descobre que est� perdida no s�culo dezenove, sem ter ideia de como voltar para casa � ou se isso sequer � poss�vel. Enquanto tenta desesperadamente encontrar um meio de retornar ao tempo presente, ela � acolhida pela fam�lia Clarke. Com a ajuda do prestativo - e lindo - Ian Clarke, Sofia embarca numa busca fren�tica e acaba encontrando pistas que talvez possam ajud�-la a resolver esse mist�rio e voltar para sua t�o amada vida moderna.O que ela n�o sabia era que seu cora��o tinha outros planos...";
		System.out.println(sinopse);
	}
	
	public void mostrarAnoPubli() {
		System.out.print("Ano de publicacao: ");
		this.ano = 2013;
		System.out.println(ano);
	}
	public void mostrarClasseInd() {
		System.out.print("Classifica��o Indicativa: ");
		this.aviso = "Livre	";
		System.out.println(aviso);
	}
	public void mostrarTW() {
		System.out.print("Trigger warning: ");
		this.aviso = "-";
		System.out.println(aviso);
	}
	
	public void mostrarQtdPag() {
		System.out.print("Quantidade de paginas): ");
		this.paginas = 364;
		System.out.println(paginas);
	}
	
	public void mostrarNota() {
		System.out.print("Nota: ");
		this.nota = 4.25;
		System.out.println(nota);
	}
}
