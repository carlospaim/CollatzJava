package collatzjava;

import java.util.Scanner;

public class CollatzJava {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int x = input.nextInt();
        int i = 0;

        while (x > 1) {
            if ((x % 2) == 0) {
                x = x / 2;
            } else {
                x = x * 3 + 1;
            }
            i++;
        }
        System.out.println(i);
    }
}
