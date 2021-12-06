import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {



/*
    @lariframelo pelo curso de Nélio Alves - Udemy
   Este é um programa não orientado ao Objeto
   para ensinar o aluno a diferenciar esse tipo de solução
   O programa deve ler os lados de um triângulo
   e em seguida retornar sua área
 */

    public static void main(String[] args) {
        //declaração de variáveis, preparação do ambiente
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        //entrada dos dados
        System.out.println("Enter the measures of triangle x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        //execução do programa
        double areaX = x.area();
        double areaY = y.area();
        //retorno da operação
        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        //Teste de área maior
        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }
        sc.close();
    }
}



