package projeto;

public class Livro2 extends CatTerrorPsicologico{
	@Override
	public void mostrarNome(){
		System.out.print("Nome: ");
		this.nome = "A Paciente Silenciosa";
		System.out.println(nome);
	}
	
	public void mostrarEditora() {
		System.out.print("Editora: ");
		this.editora = "Record";
		System.out.println(editora);
	}
	
	public void mostrarAutor() {
		System.out.print("Autor(a): ");
		this.autor = "Alex Michaelides";
		System.out.println(autor);
	}
	
	public void mostrarSinopse() {
		System.out.print("Sinopse: ");
		this.sinopse = "S� ela sabe o que aconteceu.S� ele pode faz�-la falar. Alicia Berenson tinha uma vida perfeita. Ela era uma pintora famosa casada com um fot�grafo bem-sucedido. Alicia tinha 33 anos quando deu cinco tiros no rosto do marido, e ela nunca mais disse uma palavra. O mist�rio atrai a aten��o do p�blico e aumenta ainda mais a fama da pintora. Entretanto, enquanto seus quadros passam a ser mais valorizados que nunca, ela � levada para o Grove, um hospital psiqui�trico judici�rio.Enquanto isso, Theo Faber � um psicoterapeuta forense que espera h� muito tempo por uma oportunidade de trabalhar com Alicia, ele tem certeza de que � a pessoa certa para lidar com o caso. Por�m, se ela falar, ele ser� capaz de ouvir a verdade?";
		System.out.println(sinopse);
	}
	
	public void mostrarAnoPubli() {
		System.out.print("Ano de publicacao: ");
		this.ano = 2019;
		System.out.println(ano);
	}
	public void mostrarClasseInd() {
		System.out.print("Classifica��o Indicativa: ");
		this.aviso = "+16	";
		System.out.println(aviso);
	}
	public void mostrarTW() {
		System.out.print("Trigger warning: ");
		this.aviso = "Automutila��o, Assassinato, Idealiza��o de Su�cidio";
		System.out.println(aviso);
	}
	
	public void mostrarQtdPag() {
		System.out.print("Quantidade de paginas): ");
		this.paginas = 336;
		System.out.println(paginas);
	}
	
	public void mostrarNota() {
		System.out.print("Nota: ");
		this.nota = 4.15;
		System.out.println(nota);
	}
}
