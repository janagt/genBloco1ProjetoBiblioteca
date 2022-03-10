package projeto;

public class MaeChamada {
		public static void main(String[] args) {
			Filha1 gen1 = new Filha1();
			Filha1 livro1 = new Filha1();
			Filha1 livro2 = new Filha1();
			
			System.out.println("BIBLIOTECA DA GEN\n");
			
			gen1.mostraCategoria();
			livro1.setNome("- Livro 1");
			System.out.println(livro1.getNome());
			livro2.setNome("- Livro 2");
			System.out.println(livro2.getNome());
			
			
			
		
	}
}
