package JavaMatemáticaDois;
import java.util.Scanner;

public class ExercícioUM {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do raio: ");
        double r = scanner.nextDouble();
          System.out.println("Digite o valor da altura: ");
        double h = scanner.nextDouble();

        double volume = 3.14*r*r*h;
            System.out.println("O volume do cilindro é:" + volume);
    
    scanner.close();
    }

}