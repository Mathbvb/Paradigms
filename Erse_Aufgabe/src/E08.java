import java.util.Scanner;
public class E08 {
    public static void main(String[] args) {

        var scan = new Scanner(System.in);

        System.out.println("Qual a base do retângulo? ");
        float base = scan.nextFloat();
        System.out.println("Qual a altura do retângulo? ");
        float altura = scan.nextFloat();

        System.out.println("Perímetro: "+ (2*altura + 2*base) + ", área: "+ (base * altura));

    }
}
