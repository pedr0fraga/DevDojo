package academy.devdojo.maratonajava.introducao;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereco>, confirmo que recebi o salário de <salario>
na data de <data>
 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Pedro";
        String endereco = "Avenida Genérica 1903";
        double salario = 2500.00;
        String dataPagamento = "22/04/2026";

        System.out.printf("Eu %s, morando no endereço %s, confirmo que recebi o salário de %.1f na data de %s.", nome, endereco, salario, dataPagamento);
    }
}
