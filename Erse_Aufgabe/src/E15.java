import java.util.Scanner;

public class E15 {
    public static void main(String[] args) {

        var scan = new Scanner(System.in);

        System.out.println("Digite a idade do nadador: ");
        int id = scan.nextInt();

        if(id > 4 && id < 8){
            System.out.println("Infantil A");
        }
        else if (id > 7 && id < 11){
            System.out.println("Infantil B");
        }
        else if (id > 10 && id < 14){
            System.out.println("Juvenil A");
        }
        else if (id > 13 && id < 18){
            System.out.println("Juvenil B");
        }
        else{
            System.out.println("Sênior.");
        }

    }
}
