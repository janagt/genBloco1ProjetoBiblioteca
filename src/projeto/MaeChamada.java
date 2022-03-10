package projeto;

import java.util.Scanner;

public class MaeChamada {
		public static void main(String[] args) {
			int opcao; //var do scanner
			Scanner ler = new Scanner(System.in);
			
			Filha1 a1 = new Filha1();
			Filha1 a2 = new Filha1();
			
			//cadastro de gêneros
			a1.setGenero("Terror/Suspense");
			a2.setGenero("Terror/Suspense");
			
			//cadastro de subgêneros
			a1.setCategoria("Serial Killers");
			a2.setCategoria("Terror Psicológico");
		
			//cadastro de nome
			a1.setCatSK("Bom dia, Verônica");
			a2.setCatTP("A Paciente Silenciosa");
			
			//cadastro de ano
			a1.setAno(1994);
			a2.setAno(2015);
			
			//cadastro de nota
			a1.setNota(3.98);
			a2.setNota(4.15);
			
			System.out.println("Bem-vindos a nossa Biblioteca!");
			System.out.println("Qual gênero literário você procura?");
			System.out.print("(1) Terror \n(2) Romance \n\nDigite o número da opção escolhida: ");
			opcao=ler.nextInt(); //opcao pro usuário
			
			if(opcao==1) {
				System.out.println("\nVocê escolheu o gênero Terror/Suspense!");
				System.out.println("Qual subgênero gostaria de ler?");
				System.out.print("(1) Serial Killers \n(2) Terror Psicológico \n\nDigite o número da opção escolhida: ");
				opcao=ler.nextInt();
				if(opcao==1) {
					System.out.println("\nVocê escolheu Serial Killers!");
					System.out.println("Por enquanto temos essas opções: \n\n"+ a1.getCatSK());
					a1.mostraInfos(); }
				else {
					System.out.println("\nVocê escolheu Terror Psicológico!");
					System.out.println("Por enquanto temos essas opções: \n\n"+ a2.getCatTP());
					a2.mostraInfos();
				}
			}
			
			/*System.out.println("BIBLIOTECA DA GEN\n");
			gen1.mostraCategoria();
			livro1.setNome("- Livro 1");
			System.out.println(livro1.getNome());
			livro2.setNome("- Livro 2");
			System.out.println(livro2.getNome());*/
			
			
			
		
	}
}
