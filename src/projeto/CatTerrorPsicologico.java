package projeto;

public class CatTerrorPsicologico extends BibliotecaForma {
	//atributos responsáveis pelos títulos
		private String catTerrorPsicologico;
		
		public String getCatSerialKiller() {
			return catTerrorPsicologico;
		}
		public void setCatTerrorPsicologico(String catTerrorPsicologico) {
			this.catTerrorPsicologico = catTerrorPsicologico;
		}
		@Override
	    public void mostrarGenero() {
	   	 this.genero = "(1)Terror";
			System.out.println(genero);
		}
	    public void mostrarCategoria() {
	   	 this.categoria = "(1) Serial Killer \n(2) Terror Psicológico";
	   	 System.out.println(categoria);
	    }
	   public void mostrarSubcategoria() {
	    	this.subcategoria = "Temos a seguinte recomendação de livro:\n";
	      	System.out.println(subcategoria);
	    	Livro2 l = new Livro2(); //criar subcategoria 2 (neta)
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
