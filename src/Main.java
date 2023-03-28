import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int number = sc.nextInt();
        System.out.println("Hola mundo " + number + "!");
        sc.close();

    }
}