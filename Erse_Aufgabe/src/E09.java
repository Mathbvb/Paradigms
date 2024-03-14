import java.util.Scanner;
public class E09 {
    public static void main(String[] args) {

        var scan = new Scanner(System.in);
        double pi = 3.14159;

        System.out.println("Digite o raio de um círculo: ");
        double radius = scan.nextFloat();

        System.out.println("Área do círculo: "+ (pi * Math.pow(radius, 2)) + ", perímetro: " + (2 * pi * radius));
    }
}
