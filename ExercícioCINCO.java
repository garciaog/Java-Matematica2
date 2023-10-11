package JavaMatemáticaDois;
import java.util.Scanner;

public class ExercícioCINCO {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Valor do volume do cubo: ");
        
        double volume = scanner.nextDouble();
        double aresta = Math.cbrt(volume);

        System.out.println("O valor da aresta é: " + aresta);

        }
}
