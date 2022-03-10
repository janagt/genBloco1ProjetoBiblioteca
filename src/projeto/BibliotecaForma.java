package projeto;

public abstract class BibliotecaForma implements BibliotecaInterface {
	
	//Atributos
	protected String nome, genero, categoria, subcategoria, editora, sinopse, autor, indicacao, aviso; 
	protected double nota;
	protected int ano, paginas;

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
	public String getSubcategoria() {
		return categoria;
	}
	public void setSubcategoria(String Subcategoria) {
		this.subcategoria = subcategoria;
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
	public void mostrarInfos() {
		System.out.println("- Gênero: "+getGenero()+"\n- Categoria: "+ getCategoria());
		System.out.println("- Ano de Publicação: "+getAno()+ "\n- Nota: "+getNota());
	}
	
	//POLIMORFISMO PEGANDOS OS MÉTODOS DA INTERFACE
		@Override
	    public void mostrarCategoria() {
			System.out.println(categoria);
		}
		
		public void mostrarNome() {
			System.out.println(nome);
		}
		
		public void mostrarGenero() {
			System.out.println(genero);
		}
		
		public void mostrarEditora() {
			System.out.println(editora);
		}
		
		public void mostrarAutor() {
			System.out.println(autor);
		}
		
		public void mostrarSinopse() {
			System.out.println(sinopse);
		}
		
		public void mostrarAnoPubli() {
			System.out.println(ano);
		}
		public void mostrarTW() {
			System.out.println(aviso);
		}
		
		public void mostrarQtdPag() {
			System.out.println(paginas);
		}
		public void mostrarNota() {
			System.out.println(nota);
		}
}
