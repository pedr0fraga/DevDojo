package academy.devdojo.maratonajava.introducao;

import java.sql.SQLOutput;

public class Aula04Operadores {
    public static void main(String[] args) {

        // Aritméticos
        // Soma ou concatenação (+), Subtração (-), Multiplicação (*), Divisão (/) e Módulo (ou resto, %)
        System.out.println("-------------------ARITMÉTICOS------------------");


        String primeiraPalavra = "Olá ";
        String segundaPalavra = "mundo!";
        String fraseCompleta = primeiraPalavra + segundaPalavra;

        double n1 = 25;
        double n2 = 10;
        double resultado = n1 / n2;

        int n = 10;

        String parOuImpar = (n % 2 == 0) ? "Par" : "Ímpar";

        System.out.println(fraseCompleta);
        System.out.println(resultado);
        System.out.println(parOuImpar);

        System.out.println("-------------------RELACIONAIS-------------------");

        // Operadores Lógicos
        // Maior e maior ou igual (> e >=), Menor e menor ou igual (< e <=), Igual (==) e Diferente (!=)
        // Sempre retornam um valor booleano (verdadeiro ou falso)

        boolean is5EqualsOrHigherTo5 = 5 >= 5;
        boolean is5HigherTo5 = 5 > 5;
        boolean is10Equals10 = 10 == 10.0;
        boolean is7DifferentOf7 = 7 != 7;

        System.out.println(is5EqualsOrHigherTo5);
        System.out.println(is5HigherTo5);
        System.out.println(is10Equals10);
        System.out.println(is7DifferentOf7);

        System.out.println("-------------------LÓGICOS------------------");
        // AND (E, &&) OR (OU, ||) e NOT (NÃO, !)

        int idade = 22;
        float salario = 2500F;

        boolean isWithinTheLawOlderThan30 = idade >= 30 && salario >= 4612;
        boolean isWithinTheLawUnderThan30 = idade < 30 && salario >= 3381;

        System.out.println("Dentro da lei (Maior ou igual a 30 anos): " + isWithinTheLawOlderThan30);
        System.out.println("Dentro da lei (Menor que 30 anos): " + isWithinTheLawUnderThan30);

        boolean chovendo = true;
        boolean tenhoGuardaChuva = true;

        String vouSair = (!chovendo || tenhoGuardaChuva == true) ? "Vou ter que sair." : "Vou ficar em casa";

        System.out.println(vouSair);


    }
}
