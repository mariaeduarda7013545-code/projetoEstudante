package projetoescola;

import java.util.Scanner;

public class ObjetoEstudante {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Estudante aluno1 = new Estudante();
        aluno1.nome = "Rui";
        aluno1.idade = 15;
        aluno1.matricula = "123455";
        aluno1.endereco = "Rua Zé";
        
        aluno1.imprimir();
        
        aluno1.estudar();
        
    }
}
