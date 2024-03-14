import java.util.Scanner;
public class E05 {
    public static void main(String[] args){
        var scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scan.nextInt();

        float third = (float)num / 3;
        System.out.println("Terça parte: "+ third);
    }
}
