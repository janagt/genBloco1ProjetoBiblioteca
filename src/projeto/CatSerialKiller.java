package projeto;

public class CatSerialKiller extends BibliotecaForma {
	//atributos respons�veis pelos t�tulos
	private String catSerialKiller;

	public String getCatSerialKiller() {
		return catSerialKiller;
	}
	public void setCatSerialKiller(String catSerialKiller) {
		this.catSerialKiller = catSerialKiller;
	}
	
	@Override
    public void mostrarGenero() {
   	 this.genero = "(1) Terror";
		System.out.println(genero);
	}
    public void mostrarCategoria() {
   	 this.categoria = "(1) Serial Killer \n(2) Terror Psicol�gico";
   	 System.out.println(categoria);
    }
    public void mostrarSubcategoria() {
    	this.subcategoria = "Temos a seguinte recomenda��o de livro:\n";
      	System.out.println(subcategoria);
    	Livro1 l = new Livro1(); //NETA 1
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
