package exerc.disciplina;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Aluno aluno = new Aluno();

        aluno.curso = JOptionPane.showInputDialog(null, "Digite o nome do curso");
        aluno.nome = JOptionPane.showInputDialog(null, "Digite o nome do aluno");
        aluno.matricula = JOptionPane.showInputDialog(null, "Digite a matrícula do aluno");

        for (Integer i = 0; i < aluno.nomeDisciplinas.length; i++) {
            aluno.nomeDisciplinas[i] =
                    JOptionPane.showInputDialog(null, "Digite o nome da disciplina " + (i + 1));
        }

        for (Integer i = 0; i < aluno.notasDisciplinas.length; i++) {
            System.out.println("Obtendo notas da disciplina " + aluno.nomeDisciplinas[i]);
            for (Integer j = 0; j < aluno.notasDisciplinas[i].length; j++) {
                aluno.notasDisciplinas[i][j] = Double.valueOf(JOptionPane.showInputDialog(null, "Entre com a nota " + (j + 1)));
            }
        }
        aluno.mostrarInfo();

        for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
            if(aluno.isAprovado(i)) {
                System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " foi aprovado");
            } else {
                System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " foi reprovado");
            }
        }
    }
}
