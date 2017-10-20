package exerc.jogoDaVelha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        JogoDaVelha jogoDaVelha = new JogoDaVelha();

        System.out.println("Jogador 1 - X");
        System.out.println("Jogador 2 - O");

        boolean ganhou = false;
        char sinal;
        int linha, coluna;

        while (!ganhou) {
            if(jogoDaVelha.vezJogador1()){
                System.out.println("Vez do Jogador 1. Escolhe linha e coluna. (1-3)");
                jogoDaVelha.sinal = 'X';
            } else {
                System.out.println("Vez do Jogador 2. Escolhe linha e coluna. (1-3)");
                jogoDaVelha.sinal = 'O';
            }
            linha = linhaValida(input, "Linha");
            coluna = linhaValida(input, "Coluna");

            if(!jogoDaVelha.validarJogada(jogoDaVelha.sinal, linha, coluna)) {
                System.out.println("Posição já usada! Tente novamente.");
            };

            jogoDaVelha.imprimirTabuleiro();

            if (jogoDaVelha.verificarGanhador('X')) {
                ganhou = true;
                System.out.println("Parabéns, jogador 1 ganhou!!!");
            } else if (jogoDaVelha.verificarGanhador('O')) {
                ganhou = true;
                System.out.println("Parabéns, jogador 2 ganhou!!!");
            } else if (jogoDaVelha.jogada > 9) {
                ganhou = true;
                System.out.println("Ninguém ganhou a partida");
            }
        }
    }

    static int linhaValida(Scanner input, String tipoValor) {
        int valor = 0;
        boolean valorValido = false;
        while (!valorValido) {
            System.out.println("Entre com a " + tipoValor + " (1, 2 ou 3");
            valor = input.nextInt();

            if(valor >= 1 && valor <= 3) {
                valorValido = true;
            } else {
                System.out.println("Entrada inválida! Tente novamente");
            }
        }
        valor--;
        return  valor;
    }
}
