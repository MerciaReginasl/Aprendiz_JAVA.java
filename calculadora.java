//⏺ Desafio 2:
//Faça uma calculadora que contém 5 operações:

//Multiplicação
//Divisão
//Adição
//Subtração

//Módulo
//Observação: Aqui eu quero que vocês façam uma Classe chamada Operações, onde vocês vão criar métodos que implementas as operações básicas entre dois números. Após isso, vocês vão criar a classe Main e nela irão receber dois números e a operação que deseja realizar, o programa deve exibir na tela o resultado da operação entre os dois números.

//Digite o primeiro número: 2
//Digite o segundo número:  4
//Digite a operação: *

//O resultado da operação é: 8
//Os símbolos reconhecidos na operação são :

//  *
//  /
//  +
//  -
//  %

package resolucoesDesafios.desafio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite a operação: ");
        String operacao = sc.nextLine();

        Operacoes operacoes = new Operacoes();
        int resultado = 0;

        if(operacao.equals("*")){
            resultado = operacoes.multiplicacao(num1, num2);
        }

        else if(operacao.equals("/")){
            resultado = operacoes.divisao(num1, num2);
        }

        else if(operacao.equals("+")){
            resultado = operacoes.adicao(num1, num2);
        }
        else if(operacao.equals("-")){
            resultado = operacoes.subtracao(num1, num2);
        }

        else {
            resultado = operacoes.modulo(num1, num2);
        }

        System.out.println("O resultado da operação é: " + resultado);
    }
}
