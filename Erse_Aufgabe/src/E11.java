import java.util.Scanner;;

public class E11 {
    public static void main(String[] args) {

        var scan = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        float a = scan.nextFloat();
        System.out.println("Digite um valor: ");
        float b = scan.nextFloat();

        if(a > b){
            System.out.println(a + " > " + b + ", diferença: " + (a-b));
        }
        else if(b > a){
            System.out.println(b + " > " + a + ", diferença: " + (b-a));
        }
        else{
            System.out.println(a + " = " + b + ", não há diferença.");
        }

    }
}
