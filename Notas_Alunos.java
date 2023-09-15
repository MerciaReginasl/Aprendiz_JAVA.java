//Descrição do Desafio 1

//⏺ Desafio 1:

//Faça um programa que recebe como entrada as 3 notas de um aluno, calcula sua média e em seguida verifica se o aluno, passou, está na final ou reprovou.

//Se a média for maior ou igual a 7, então o aluno foi aprovado
//Se a média for menor que 7 e maior ou igual a 4, então o aluno irá realizar a final
//Se o aluno tiver uma nota menor que 4, foi reprovado
//Se o aluno estiver na final, faça o input de uma nova nota e verifique que se ela for igual ou maior que 7, o aluno foi aprovado, caso não, o aluno foi reprovado
//Observação: Vocês poderam criar uma classe e nessa mesma classe fazer um Main, e implementar o código direto na classe Main Entradas:

//Três floats, representando as três notas dos alunos

//Saída:

//A média, e a situação do aluno, onde a situação poderá ser

 //foi reprovado :(
 //foi aprovado :)
 //está na final :|
//Exemplo de Execução:

//Digite a primeira nota:
//Digite a segunda nota:
//Digite a terceira nota:
 
//Sua média é (media), e você (situação) 

 **************************************************************************************************************

package resolucoesDesafios.desafio1;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        String situacao;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if(media >= 7){
            situacao = "foi aprovado :)";
        }
        else if(media < 7  && media >= 4){
            situacao = "está na final :|";
            System.out.println("Digite a nota da final");
            double novaNota = sc.nextDouble();
            if (novaNota < 7){
                situacao = "foi reprovado :(";
            }
            else {
                situacao = "foi aprovado :)";
            }
        }
        else {
            situacao = "foi reprovado :(";
        }
        System.out.printf("Sua média é " + "%.2f" + " e você " + situacao,media );
    }
}
