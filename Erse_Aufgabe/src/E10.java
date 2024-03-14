import java.util.Scanner;
public class E10 {
    public static void main(String[] args) {

        var scan = new Scanner(System.in);

        System.out.println("Digite a hora: ");
        int hour = scan.nextInt();

        System.out.println("Passaram-se "+ (hour * 60) +" minutos desde o início do dia.");

    }
}
