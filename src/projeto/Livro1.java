package projeto;

public class Livro1 extends CatSerialKiller{
	@Override
	public void mostrarNome(){
		System.out.print("Nome: ");
		this.nome = "Bom dia, Ver�nica";
		System.out.println(nome);
	}
	
	public void mostrarEditora() {
		System.out.print("Editora: ");
		this.editora = "Dark Side";
		System.out.println(editora);
	}
	
	public void mostrarAutor() {
		System.out.print("Autor(a): ");
		this.autor = "Ilana Casoy, Raphael Montes";
		System.out.println(autor);
	}
	
	public void mostrarSinopse() {
		System.out.print("Sinopse: ");
		this.sinopse = "A rotina da secret�ria de pol�cia Ver�nica Torres era pacata, burocr�tica e repleta de sonhos interrompidos at� aquela manh�. Um abismo se abre diante de seus p�s de uma hora para outra quando, na mesma semana, ela presencia um suic�dio inesperado e recebe a liga��o an�nima de uma mulher clamando por sua vida. Ver�nica sente um verdadeiro calafrio, mas abra�a a oportunidade de mostrar suas habilidades investigativas e decide mergulhar sozinha nos dois casos.";
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
		this.aviso = "Cenas violentas";
		System.out.println(aviso);
	}
	
	public void mostrarQtdPag() {
		System.out.print("Quantidade de paginas: ");
		this.paginas = 256;
		System.out.println(paginas);
	}
	
	public void mostrarNota() {
		System.out.print("Nota: ");
		this.nota = 3.61;
		System.out.println(nota);
	}
}
