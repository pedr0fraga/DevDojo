package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int numeroInteiro = 1;
        double numeroDecimalMaisPreciso = 2.0;
        float numeroDecimalMenosPreciso = 3.0f;
        char caractere = '\u0025';
        byte numeroMuitoPequeno = 127;
        short numeroPequeno = 5000;
        long numeroLongo = 20000000;
        boolean verdadeiroOuFalso = false;


        System.out.printf("Entre 'true' ou 'false', escolho " + verdadeiroOuFalso + ".\n");
        System.out.println("Caractere > " + caractere);
    }
}
