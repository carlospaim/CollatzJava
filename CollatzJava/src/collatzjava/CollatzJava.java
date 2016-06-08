package collatzjava;

import java.util.Scanner;

public class CollatzJava {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int x = input.nextInt();
        int i = 0;
        System.out.println("It takes " + solve(i) + " steps to reach 1 using the Collatz Conjecture");


    public static int solve(int n) {
	    	if (i == 1) {
		    	return 0; 
		    } else if (i % 2 == 0) {
			return 1 + solve(n / 2);
		    } else {
		    	return 1 + solve(i * 3 + 1);
		    }	 	

    }
}
