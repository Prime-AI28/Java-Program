package Self;

import java.util.Scanner;

public class Loops_Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num =0;

        do{
            System.out.println("Input a Number: ");
            num = sc.nextInt();

            System.out.print("Here is your Number: ");
            System.out.println(num);

        } while(num >= 0);
        System.out.println("The End");

        sc.close();
    
}
    
}
