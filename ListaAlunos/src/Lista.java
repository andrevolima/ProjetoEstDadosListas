import java.util.Scanner;

public class Lista {
	int tamanho = 0;
    private Aluno[] alunos = new Aluno[60]; // Tamanho do array apropriado

    public boolean inserirAluno(Aluno aluno) {
        if (tamanho < alunos.length) {
            alunos[tamanho] = aluno;
            tamanho++;
            return true;
        } else {
            return false; 
        }
    }
    
    public void imprimirRgm() {
    		System.out.println("------------");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(alunos[i].getRgm());
        }
        System.out.println("------------");
    }

    public void imprimirAlunos() {
    	 	ordenarAlunosPorRgm();
        for (int i = 0; i < tamanho; i++) {
            System.out.println(alunos[i].getRgm());
            mostrarDisciplinas(alunos[i].getDisciplinas());
        }
    }
    
    public void ordenarAlunosPorRgm() {
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - i - 1; j++) {
            	 if (alunos[j].getRgm() > alunos[j + 1].getRgm()) {
                     Aluno aluno_var = alunos[j];
                     alunos[j] = alunos[j + 1];
                     alunos[j + 1] = aluno_var;
                }
            }
        }
    }

    
    public static void adicionarDisciplinas(Aluno aluno, Scanner scanner) {
        do {
            System.out.println("Digite o nome da disciplina:");
            String nomeDisciplina = scanner.next();
            if (aluno.disciplinas == null) {
                aluno.disciplinas = new Disciplina(nomeDisciplina);
            } else {
                Disciplina atual = aluno.disciplinas;
                while (atual.proxima != null) {
                    atual = atual.proxima;
                }
                atual.proxima = new Disciplina(nomeDisciplina);
            }
            System.out.println("Mais disciplina? (S/N)");
        } while (scanner.next().equalsIgnoreCase("S"));

        System.out.println("Disciplinas adicionadas com sucesso.");
    }
    
    public void deslocarParaEsquerda (int pos) { 
		for (int i = pos; i < (tamanho - 1); i++)
			 alunos[i] = alunos [i+1];
	}
		
    public boolean removerAluno(int rgm) {
        for (int i = 0; i < tamanho; i++) {
            if (alunos[i].getRgm() == rgm) {
                deslocarParaEsquerda(i);
                tamanho--;
                return true;
            }
		}
		return false;
	}
    
    public void buscarAluno(int rgm) {
        for (int i = 0; i < tamanho; i++) {
            if (alunos[i].getRgm() == rgm) {
                System.out.println("Aluno encontrado:");
                System.out.println("RGM: " + alunos[i].getRgm());
                System.out.println("Disciplinas:");
                mostrarDisciplinas(alunos[i].getDisciplinas());
                return;
            }
        }
        System.out.println("Aluno não encontrado.");
    }
    
    static void mostrarDisciplinas(Disciplina disciplina) {
        if (disciplina == null) {
            System.out.println("Nenhuma disciplina cadastrada.");
            return;
        }
        Disciplina atual = disciplina;
        while (atual != null) {
            System.out.println("- " + atual.nome);
            atual = atual.proxima;
        }
    }
}