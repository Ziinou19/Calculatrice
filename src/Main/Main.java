package Main;

import java.util.Scanner;

class Main {

    public static void main (String[] args) {

        System.out.println("Ecrire un nombre!");
        Scanner num1 = new Scanner(System.in);
        int x = num1.nextInt();

        System.out.println("Choisir un deuxième nombre!");
        Scanner num2 = new Scanner(System.in);
        int y = num2.nextInt();

        int rep = x + y;
        System.out.print("Le résultat est " + rep);
    }
}

