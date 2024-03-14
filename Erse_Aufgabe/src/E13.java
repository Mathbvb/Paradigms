import java.util.Scanner;

public class E13 {
    public static void main(String[] args) {

        var scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        float a = scan.nextFloat();
        System.out.println("Digite um número: ");
        float b = scan.nextFloat();

        if (a > b){
            System.out.println( a + " é maior número.");
        }
        else if (b > a){
            System.out.println( b + " é maior número.");
        }
        else{
            System.out.println("Números iguais.");
        }

    }
}
