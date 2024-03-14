import java.util.Scanner;

public class E17 {
    public static void main(String[] args) {

        var scan = new Scanner(System.in);

        System.out.println("Digite um lado: ");
        int a = scan.nextInt();
        System.out.println("Digite um lado: ");
        int b = scan.nextInt();
        System.out.println("Digite um lado: ");
        int c = scan.nextInt();

        if(a < b+c && b < a+c & c < a+b){
            if(a == b && a == c){
                System.out.println("É um triângulo equilátero.");
            }
            else if( a == b || b == c){
                System.out.println("É um triângulo isósceles.");
            }
            else{
                System.out.println("É um triângulo escaleno.");
            }
        }
        else{
            System.out.println("Não é um triângulo.");
        }

    }
}
