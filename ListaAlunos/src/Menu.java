import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("------ Seja bem-vindo ao Menu ------");
		System.out.println("");
		System.out.println("- Digite 1 para Criar lista (Caso ja tenha uma lista, ignore essa funcao) ");
		System.out.println("- Digite 2 para Inserir alunos ");
		System.out.println("- Digite 3 para Mostrar o rgm dos alunos cadastrados ");
		System.out.println("- Digite 4 para Apagar um aluno ");
		System.out.println("- Digite 5 para Buscar na lista por rgm");
		System.out.println("- Digite 6 para Sair ");

	
	
		System.out.println("Qual funcao deseja executar? ");
		int num = sc.nextInt();
		
		switch (num) {
		case 1:
			//Iniciar a lista e inserir nomes no  inicio
			Opcoes.case1();
			break;
		case 2:
			//Colocar nomes
			Opcoes.case2();
			break;
		case 3:
			//Mostrar nomes
			Opcoes.case3();
			break;
		case 4:
			//Apagar nome
			Opcoes.case4();
			break;	
		case 5:
			//Mostrar a lista
			Opcoes.case5();
			break;	
		case 6:
			//Sair do menu
			Opcoes.case6();
			break;	
		default:
			System.out.println("Digite um numero valido. ");
			break;		
		}
		
		
		sc.close();
	}

}
