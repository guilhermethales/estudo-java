package exerc.disciplina;

public class Aluno {

    Aluno() {}

    String nome;
    String matricula;
    String curso;
    String[] nomeDisciplinas = new String[3];
    Double[][] notasDisciplinas = new Double[3][4];

    void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Nome: " + matricula);
        System.out.println("Nome: " + curso);

        for (int i = 0; i< notasDisciplinas.length; i++) {
            System.out.println("Disciplina: " + nomeDisciplinas[i]);

            for (int j = 0; j < notasDisciplinas[i].length; j++) {
                System.out.println("Nota " + (j + 1) + ":" + notasDisciplinas[i][j]);
            }
            System.out.println();
        }
    }

    Double getMedia(int indice) {
        Double soma = 0.0;
        for (int i = 0; i < notasDisciplinas[indice].length; i++) {
            soma += notasDisciplinas[indice][i];
        }
        Double media = soma / 4;

        return media;
    }

    Boolean isAprovado(int indice) {
        if(getMedia(indice) >= 7) {
            return true;
        }
        return false;
    }
}
