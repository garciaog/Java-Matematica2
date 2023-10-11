package JavaMatemáticaDois;
import java.util.Scanner;

public class ExercícioQUATRO {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da altura: ");
        double altura = scanner.nextDouble();

         System.out.println("Digite o valor do volume: ");
        double volume = scanner.nextDouble();
        double valor_fixo = 3;
        double area_base = (volume * valor_fixo) / altura;
        
        System.out.println("O valor da area da base é: " + area_base);


    }
}
