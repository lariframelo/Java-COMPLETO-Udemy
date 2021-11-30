package application;

import java.util.Locale;
import java.util.Scanner;

/*
    @lariframelo pelo curso de Nélio Alves - Udemy
   Este é um programa não orientado ao Objeto
   para ensinar o aluno a diferenciar esse tipo de solução
   O programa deve ler os lados de um triângulo
   e em seguida retornar sua área
 */
public class Program {

    public static void main(String[] args) {
        //declaração de variáveis, preparação do ambiente
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        //entrada dos dados
        System.out.println("Enter the measures of triangle x: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.println("Enter the measures of triangle y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        //execução do programa
        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        //retorno da operação
        System.out.printf("Triangle X area: %.4f%n",areaX);
        System.out.printf("Triangle Y area: %.4f%n",areaY);

        //Teste de área maior
        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }
        sc.close();
    }
}
