package br.dio.exercicio4;

import java.util.Scanner;

public class ex4_parEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros;
        int numero;
        int quantidadePares = 0, quantidadedeImpares = 0;


        System.out.println("Quantidade de números: ");
        quantidadeNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            // se um o total de um numero for dividido por 2, e o resultado for zero, ele é par.
            if (numero % 2 == 0 ) quantidadePares++; // quantPares = quantPares + 1;
            else quantidadedeImpares++;

            // count = count + 1;
            count++;
        } while(count < quantidadeNumeros);

        System.out.println("Quantidade de Pares: " + quantidadePares);
        System.out.println("Quantidade de ímpares: " + quantidadedeImpares);
    }
}
