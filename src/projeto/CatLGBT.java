package projeto;

public class CatLGBT extends BibliotecaForma{
	//atributos respons�veis pelos t�tulos
			private String catLGBT;
			
			public String getCatLGBT() {
				return catLGBT;
			}
			public void setCatLGBT(String catLGBT) {
				this.catLGBT = catLGBT;
			}
			
			@Override
		    public void mostrarGenero() {
		   	 this.genero = "(2) Romance";
				System.out.println(genero);
			}
		    public void mostrarCategoria() {
		   	 this.categoria = "(1) LGBTQIA+ \n(2)Com�dia Romantica";
		   	 System.out.println(categoria);
		    }
		    public void mostrarSubcategoria() {
		    	this.subcategoria = "Temos a seguinte recomenda��o de livro:\n";
		      	System.out.println(subcategoria);
		    	Livro3 l = new Livro3(); //criar subcategoria 3 (neta)
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
