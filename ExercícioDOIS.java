package JavaMatemáticaDois;
import java.util.Scanner;

public class ExercícioDOIS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor do volume: ");
        double volume = scanner.nextDouble();

        double pi = 3.14;
        double valor_fixo = 4; 

        double raio = Math.sqrt (volume / pi * valor_fixo) ;

        System.out.println("O raio é: " + raio);
    }

}

