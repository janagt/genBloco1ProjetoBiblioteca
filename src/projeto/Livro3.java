package projeto;

public class Livro3 extends CatLGBT{
	@Override
	public void mostrarNome(){
		System.out.print("Nome: ");
		this.nome = "Os Sete Maridos de Evelyn Hugo";
		System.out.println(nome);
	}
	
	public void mostrarEditora() {
		System.out.print("Editora: ");
		this.editora = "Paralela";
		System.out.println(editora);
	}
	
	public void mostrarAutor() {
		System.out.print("Autor(a): ");
		this.autor = "Taylor Jenkins Reid";
		System.out.println(autor);
	}
	
	public void mostrarSinopse() {
		System.out.print("Sinopse: ");
		this.sinopse = "Lend�ria estrela de Hollywood, Evelyn Hugo sempre esteve sob os holofotes - seja estrelando uma produ��o vencedora do Oscar, protagonizando algum esc�ndalo ou aparecendo com um novo marido� pela s�tima vez. Agora, prestes a completar oitenta anos e reclusa em seu apartamento no Upper East Side, a famigerada atriz decide contar a pr�pria hist�ria - ou sua �verdadeira hist�ria� -, mas com uma condi��o: que Monique Grant, jornalista iniciante e at� ent�o desconhecida, seja a entrevistadora.";
		System.out.println(sinopse);
	}
	
	public void mostrarAnoPubli() {
		System.out.print("Ano de publicacao: ");
		this.ano = 2019;
		System.out.println(ano);
	}
	public void mostrarClasseInd() {
		System.out.print("Classifica��o Indicativa: ");
		this.aviso = "+18	";
		System.out.println(aviso);
	}
	public void mostrarTW() {
		System.out.print("Trigger warning: ");
		this.aviso = "Aborto, Relacionamento abusivo";
		System.out.println(aviso);
	}
	
	public void mostrarQtdPag() {
		System.out.print("Quantidade de paginas): ");
		this.paginas = 360;
		System.out.println(paginas);
	}
	
	public void mostrarNota() {
		System.out.print("Nota: ");
		this.nota = 4.48;
		System.out.println(nota);
	}
}
