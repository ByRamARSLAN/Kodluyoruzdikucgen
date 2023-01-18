import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        double a,b,hipotenus,alan,cevre;

        System.out.print("Dik üçgenin 1. kenarını girin : ");
        a = inp.nextInt();

        System.out.print("Dik üçgenin 2. kenarını girin : ");
        b = inp.nextInt();

        hipotenus = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        alan = a*b/2;
        cevre = a + b + hipotenus;

        System.out.println("Hipotenüs : " + hipotenus);
        System.out.println("Dik üçgenin alanı : " + alan);
        System.out.print("Dik üçgenin çevresi : " + cevre);
    }
}