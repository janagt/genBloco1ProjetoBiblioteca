package projeto;

import java.util.Scanner;
import java.util.ArrayList;

public class Biblioteca {
	public static void main(String[] args) {
		int opcao; //var do scanner
		Scanner ler = new Scanner(System.in);
		
		//CRIANDO O OBJETO FILHA
		CatSerialKiller catSerialKiller = new CatSerialKiller(); //terror neta1
		CatTerrorPsicologico catTerrorPsicologico = new CatTerrorPsicologico(); //terror neta2

		CatLGBT catLGBT = new CatLGBT(); //terror neta1
		CatRomanceEpoca catRomanceEpoca = new CatRomanceEpoca(); //terror neta2
		
		
		//cadastro de gêneros
		catSerialKiller.setGenero("Terror/Suspense");
		catTerrorPsicologico.setGenero("Terror/Suspense");
		catLGBT.setGenero("Romance");
		catRomanceEpoca.setGenero("Terror/Suspense");
		
		//cadastro de subgêneros
		catSerialKiller.setCategoria("Serial Killers");
		catTerrorPsicologico.setCategoria("Terror Psicológico");
			
		//cadastro de nome
		catSerialKiller.setCatSerialKiller("Bom dia, Verônica");
		catTerrorPsicologico.setCatTerrorPsicologico("A Paciente Silenciosa");
			
		//cadastro de ano
		catSerialKiller.setAno(1994);
		catTerrorPsicologico.setAno(2015);
			
		//cadastro de nota
		catSerialKiller.setNota(3.98);
		catTerrorPsicologico.setNota(4.15);
		
		//ARRAY LIST
		ArrayList<String> gensDisponiveis = new ArrayList<String>();
		//INSERINDO OS GÊNEROS MANUALMENTE NO ARRAY
		gensDisponiveis.add("Terror");
		gensDisponiveis.add("terror");
		gensDisponiveis.add("Romance");
		gensDisponiveis.add("romance");
		
		
		
		
		System.out.println("Bem-vindos a nossa Biblioteca!");
		
		System.out.print("\nDeseja procurar algum gênero específico? ");
		String verificar = ler.next();
		//VERIFICAR SE O NOME DE GENERO QUE O USUARIO DIGITOU DA DISPONIVEL
		gensDisponiveis.contains(verificar);
		
		//CASO O GENERO ESTEJA DISPONIVEL
		if (gensDisponiveis.contains(verificar) == true) {
			System.out.println("O gênero " + verificar + " está disponível.");
		}
			
		//CASO O GENERO NÃO ESTEJA DISPONIVEL
		else{
			System.out.println("O gênero " + verificar + " não está disponível.");					//FECHANDO O PROGRAMA
			System.exit(0);
		}
			
		//VERIFICAR A POSIÇÃO DO GENERO
		int posicao = gensDisponiveis.indexOf(verificar);
		
		//LOGICA POLIMORFISMO DE ACESSO AOS GENEROS
		System.out.println("\nQual gênero literário você deseja acessar?");
		//System.out.print("(1) Terror \n(2) Romance \n\nDigite o número da opção escolhida: ");
		catSerialKiller.mostrarGenero();
		catLGBT.mostrarGenero();
		System.out.print("Digite o número correspondente: ");
		opcao=ler.nextInt(); //opcao pro usuário
		
		//LOGICA POLIMORFISMO DE ACESSO AS CATEGORIAS
		if(opcao==1) {
			System.out.println("\nVocê escolheu o gênero Terror/Suspense!");
			System.out.println("Qual subgênero gostaria de ler?");
			catSerialKiller.mostrarCategoria();
			opcao=ler.nextInt();
			
			//LOGICA POLIMORFISMO DE ACESSO AOS LIVROS
			if(opcao==1) {
				System.out.println("\nVocê escolheu Serial Killers!");
				catSerialKiller.mostrarSubcategoria(); //trocar apenas categoria
			}
			if(opcao==2) {
				System.out.println("\nVocê escolheu Terror Psicológico!");
				catTerrorPsicologico.mostrarSubcategoria(); //trocar apenas categoria
			}
		} if(opcao==2) {
			opcao=ler.nextInt();
			
			//LOGICA POLIMORFISMO DE ACESSO AOS LIVROS
			if(opcao==1) {
				System.out.println("\nVocê escolheu Serial Killers!");
				catLGBT.mostrarSubcategoria(); //trocar apenas categoria
			}
			if(opcao==2) {
				System.out.println("\nVocê escolheu Terror Psicológico!");
				catRomanceEpoca.mostrarSubcategoria(); //trocar apenas categoria
			}
		}
		
	}
}
