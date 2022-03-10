package projeto;

public abstract class Mae implements MaeInterface {
	//Atributos
	
	private String nome/*,genero, editora, sinopse, autor, indicacao, aviso*/; 
	private double nota;
	private int paginas;

	//Métodos (Getter/Setter)
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public void mostraCategoria(String nome) {
		// TODO Auto-generated method stub
		
	}
}
