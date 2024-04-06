import java.util.Scanner;

public class Lista {
	int tamanho = 0;
    private Aluno[] alunos = new Aluno[100]; // Tamanho do array apropriado

    public boolean inserirAluno(Aluno aluno) {
        if (tamanho < alunos.length) {
            alunos[tamanho] = aluno;
            tamanho++;
            return true;
        } else {
            return false; 
        }
    }

    public void imprimirAlunos() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(alunos[i].getRgm());
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
}