import java.util.Scanner;

public class E04 {
    public static void main(String[] args){

        var scan = new Scanner(System.in);

        System.out.println(("Digite um número: "));
        int a = scan.nextInt();
        System.out.println("Digite outro número: ");
        int b = scan.nextInt();

        System.out.println( a + " + " + b + " = " + (a+b));

    }

}
