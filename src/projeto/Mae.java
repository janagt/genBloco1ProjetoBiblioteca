package projeto;

public abstract class Mae implements MaeInterface {
	
	//Atributos
	private String genero, categoria; //editora, sinopse, autor, indicacao, aviso; 
	private double nota;
	private int ano, paginas;

	//Métodos (Getter/Setter)
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	@Override
	public void mostraInfos() {
		System.out.println("- Gênero: "+getGenero()+"\n- Categoria: "+ getCategoria());
		System.out.println("- Ano de Publicação: "+getAno()+ "\n- Nota: "+getNota());
	}
}
