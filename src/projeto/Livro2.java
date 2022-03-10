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
		this.sinopse = "Só ela sabe o que aconteceu.Só ele pode fazê-la falar. Alicia Berenson tinha uma vida perfeita. Ela era uma pintora famosa casada com um fotógrafo bem-sucedido. Alicia tinha 33 anos quando deu cinco tiros no rosto do marido, e ela nunca mais disse uma palavra. O mistério atrai a atenção do público e aumenta ainda mais a fama da pintora. Entretanto, enquanto seus quadros passam a ser mais valorizados que nunca, ela é levada para o Grove, um hospital psiquiátrico judiciário.Enquanto isso, Theo Faber é um psicoterapeuta forense que espera há muito tempo por uma oportunidade de trabalhar com Alicia, ele tem certeza de que é a pessoa certa para lidar com o caso. Porém, se ela falar, ele será capaz de ouvir a verdade?";
		System.out.println(sinopse);
	}
	
	public void mostrarAnoPubli() {
		System.out.print("Ano de publicacao: ");
		this.ano = 2019;
		System.out.println(ano);
	}
	public void mostrarClasseInd() {
		System.out.print("Classificação Indicativa: ");
		this.aviso = "+16	";
		System.out.println(aviso);
	}
	public void mostrarTW() {
		System.out.print("Trigger warning: ");
		this.aviso = "Automutilação, Assassinato, Idealização de Suícidio";
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
