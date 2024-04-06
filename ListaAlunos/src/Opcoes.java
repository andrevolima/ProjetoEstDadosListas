import java.util.Locale;
import java.util.Scanner;

public class Opcoes {
	private static Lista listaAlunos = new Lista();
	
	public static void case1() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        if (listaAlunos.tamanho == 0) { 
            System.out.print("Digite o RGM do aluno: ");
            int rgm = sc.nextInt();

            Aluno aluno = new Aluno();
            aluno.setRgm(rgm);

            listaAlunos.inserirAluno(aluno);
            Lista.adicionarDisciplinas(aluno, sc);

            System.out.println("Lista de alunos:");
            listaAlunos.imprimirAlunos();
        } else {
            System.out.println("A lista já foi criada. Use a segunda opção para adicionar mais alunos.");
        }

        System.out.println("Deseja voltar ao menu?");
        System.out.print("Digite 1 para sim e qualquer outro valor para não: ");
        int num = sc.nextInt();
        if (num == 1) {
            Menu.main(null);
        } else {
            System.out.println("Tchau!");
        }

        sc.close();
    }
	
	public static void case2() {
		Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
		
	    System.out.print("Digite o RGM do aluno: ");
        int rgm = sc.nextInt();

        Aluno aluno = new Aluno();
        aluno.setRgm(rgm);

        listaAlunos.inserirAluno(aluno);
        Lista.adicionarDisciplinas(aluno, sc);

        System.out.println("Lista de alunos:");
        listaAlunos.imprimirAlunos();
	    
	    
		System.out.println("Deseja voltar ao menu?");
        System.out.print("Digite 1 para sim e qualquer outro valor para não: ");
        int num = sc.nextInt();
        if (num == 1) {
            Menu.main(null);
        } else {
            System.out.println("Tchau!");
        }

        sc.close();
	}
	
	public static void case3() {
		Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
		
	    System.out.println("-------");
		
        System.out.println("Lista de nomes:");
        listaAlunos.imprimirAlunos();
        
        System.out.println("-------");
	    	    
		System.out.println("Deseja voltar ao menu?");
        System.out.print("Digite 1 para sim e qualquer outro valor para não: ");
        int num = sc.nextInt();
        if (num == 1) {
            Menu.main(null);
        } else {
            System.out.println("Tchau!");
        }

        sc.close();
	}
	
	public static void case4() {
		Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    if (listaAlunos == null) {
            System.out.println("A lista de alunos não está inicializada.");
        }

        System.out.println("A lista está assim: ");
        listaAlunos.imprimirAlunos();
        
        System.out.println("Digite o rgm do aluno para deletar: ");
        int rgm = sc.nextInt();
        
        if (listaAlunos.removerAluno(rgm)) {
            System.out.println("Aluno removido da lista");
        } else {
            System.out.println("O aluno não foi encontrado");
        }
	     
		System.out.println("Deseja voltar ao menu?");
        System.out.print("Digite 1 para sim e qualquer outro valor para não: ");
        int num = sc.nextInt();
        if (num == 1) {
            Menu.main(null);
        } else {
            System.out.println("Tchau!");
        }

        sc.close();
	}
	
	public static void case5() {
		Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    
	    
	    
	    
	    
		
		System.out.println("Deseja voltar ao menu?");
        System.out.print("Digite 1 para sim e qualquer outro valor para não: ");
        int num = sc.nextInt();
        if (num == 1) {
            Menu.main(null);
        } else {
            System.out.println("Tchau!");
        }

        sc.close();
	}
	
	public static void case6() {
		Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
		
	    
	    
	    
	    
	    
		System.out.println("Deseja voltar ao menu?");
        System.out.print("Digite 1 para sim e qualquer outro valor para não: ");
        int num = sc.nextInt();
        if (num == 1) {
            Menu.main(null);
        } else {
            System.out.println("Tchau!");
        }

        sc.close();
	}
}