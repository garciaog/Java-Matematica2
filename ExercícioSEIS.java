package JavaMatemáticaDois;
import java.util.Scanner;

public class ExercícioSEIS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor da base do retângulo: ");
        double base = scanner.nextDouble();

        System.out.println("Valor da altura do retângulo: ");
        double altura = scanner.nextDouble();
        double diametro = Math.sqrt ((altura * altura) + (base * base));
        double raio = diametro /2;

        System.out.println("O valor do raio é: " + raio);
}
}
