package exerc.jogoDaVelha;

public class JogoDaVelha {

    char[][] jogoVelha;
    Integer jogada;
    char sinal;

    JogoDaVelha() {
        jogoVelha = new char[3][3];
        jogada = 1;
    }
    Boolean validarJogada(char sinal, int linha, int coluna) {
        if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
           return false;
        } else {
            jogoVelha[linha][coluna] = sinal;
            this.jogada++;
        }

        return true;
    }

    public void imprimirTabuleiro() {
        for (int i = 0; i < jogoVelha.length; i++) {
            for (int j = 0; j < jogoVelha[i].length; j++) {
                System.out.print(jogoVelha[i][j] + " | ");
            }
            System.out.println();
        }
    }

    Boolean verificarGanhador(char sinal) {
        if((jogoVelha[0][0] == sinal && jogoVelha[0][1] == sinal && jogoVelha[0][2] == sinal) ||
                (jogoVelha[1][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[1][2] == sinal) ||
                (jogoVelha[2][0] == sinal && jogoVelha[2][1] == sinal && jogoVelha[2][2] == sinal) ||
                (jogoVelha[0][0] == sinal && jogoVelha[1][0] == sinal && jogoVelha[2][0] == sinal) ||
                (jogoVelha[0][1] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][1] == sinal) ||
                (jogoVelha[0][2] == sinal && jogoVelha[1][2] == sinal && jogoVelha[2][2] == sinal) ||
                (jogoVelha[0][0] == sinal && jogoVelha[0][1] == sinal && jogoVelha[0][2] == sinal) ||
                (jogoVelha[0][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][2] == sinal) ||
                (jogoVelha[0][2] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][0] == sinal)) {
            return true;
        }
        return false;
    }

    Boolean vezJogador1() {
        if (this.jogada % 2 == 1) {
            return true;
        }
        return false;
    }
}
