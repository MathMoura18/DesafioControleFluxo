package Contador;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int paramentroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(paramentroUm, parametroDois);
        } catch (ParametrosInvalidosException e){
            ParametrosInvalidosException.imprimirErro();
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        ParametrosInvalidosException ParametrosInvalidosException = new ParametrosInvalidosException();
        if (parametroDois < parametroUm) throw ParametrosInvalidosException;

        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número: " + i);
        }
    }
}