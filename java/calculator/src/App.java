import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("SIMPLE CALCUÑATOR");
        System.out.println("Author: ");

        Scanner leer = new Scanner(System.in);

        int option;
        double n1;
        double n2;
        double r;

        System.out.println("Elige la opcion que neceites");
        System.out.println("1.+");
        System.out.println("2.-");
        System.out.println("3.*");
        System.out.println("4./");
        option = leer.nextInt();

        System.out.println("Ingresa el primer numero");
        n1 = leer.nextDouble();

        System.out.println("Ingresa el segundo numero");
        n2 = leer.nextDouble();

        switch (option) {
            case 1:
                r = n1 + n2;
                System.out.println("EL resultado es " + r);
                break;
            case 2:
                r = n1 - n2;
                System.out.println("EL resultado es " + r);
                break;
            case 3:
                r = n1 * n2;
                System.out.println("EL resultado es " + r);
                break;
            case 4:
                r = n1 / n2;
                System.out.println("EL resultado es " + r);
                break;
        }
    }
}
