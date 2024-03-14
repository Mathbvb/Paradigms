import java.util.Scanner;

public class E12 {
    public static void main(String[] args) {

        var scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        float num = scan.nextFloat();

        if(num % 2 == 0 && num < 0){
            System.out.println(num + " é par e negativo.");
        }
        else if(num % 2 != 0 && num < 0){
            System.out.println(num + " é ímpar e negativo.");
        }
        else if(num % 2 == 0 && num > 0){
            System.out.println(num + " é par e positivo.");
        }
        else{
            System.out.println(num + " é ímpar e positivo.");
        }

    }
}
