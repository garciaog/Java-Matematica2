package JavaMatemáticaDois;
import java.util.Scanner;

public class ExercícioTRÊS {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Digite o volume: ");
        double volume = scanner.nextDouble();

        System.out.println("Digite a altura: ");
        double altura = scanner.nextDouble();
        double pi = 3.14;
        double raio = Math. cbrt(volume / pi * altura) ;

        System.out.println("raio: " + raio);
    }
}

