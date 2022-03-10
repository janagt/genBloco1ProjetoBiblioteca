package projeto;

public class CatRomanceEpoca extends BibliotecaForma {

	//atributos responsáveis pelos títulos
	private String catRomanceEpoca;
	
	public String getCatRomanceEpoca() {
		return catRomanceEpoca;
	}
	public void setCatRomanceEpoca(String catRomanceEpoca) {
		this.catRomanceEpoca = catRomanceEpoca;
	}
	
	@Override
    public void mostrarGenero() {
   	 this.genero = "(2) Romance";
		System.out.println(genero);
	}
    public void mostrarCategoria() {
   	 this.categoria = "(1)LGBTQIA+ \n(2)Comédia Romantica";
   	 System.out.println(categoria);
    }
    public void mostrarSubcategoria3() {
    	this.subcategoria = "Temos a seguinte recomendação de livro:\n";
      	System.out.println(subcategoria);
    	Livro1 l = new Livro1(); //criar subcategoria 3 (neta)
		l.mostrarNome();
		l.mostrarEditora();
		l.mostrarAutor();
		l.mostrarSinopse();
		l.mostrarAnoPubli();
		l.mostrarClasseInd();
		l.mostrarTW();
		l.mostrarQtdPag();
		l.mostrarNota();
    }
    
    public void mostrarSubcategoria() {
    	this.subcategoria = "Temos a seguinte recomendação de livro:\n";
      	System.out.println(subcategoria);
    	Livro4 l = new Livro4(); //criar subcategoria 4 (neta)
		l.mostrarNome();
		l.mostrarEditora();
		l.mostrarAutor();
		l.mostrarSinopse();
		l.mostrarAnoPubli();
		l.mostrarClasseInd();
		l.mostrarTW();
		l.mostrarQtdPag();
		l.mostrarNota();
    }
	
	
}
