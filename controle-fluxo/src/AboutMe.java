import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.print("Digite seu nome: ");
            String nome = scanner.next();

            System.out.print("Digite seu sobrenome: ");
            String sobrenome = scanner.next();

            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.print("Digite sua altura (em cm): ");
            double altura = scanner.nextDouble();

            System.out.println("\nOlá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase() + ".");
            System.out.println("Tenho " + idade + " anos.");
            System.out.println("Minha altura é " + altura + " cm.");
        } catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser numéricos.");
        } finally {
            scanner.close();
        }
    }
}