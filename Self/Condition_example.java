package Self;

import java.util.Scanner;

public class Condition_example {

    public static void main(String[] args){
        // conditonal statments

        Scanner sc = new Scanner(System.in);

        // pen = 10; notebook = 40;

        int cash = sc.nextInt();
        if(cash<10){
            System.out.println("Cannot Buy Anything");
            System.out.println("Get more Cash");
        }
        else if(cash>=10 && cash<50){
            System.out.println("Can get 1 thing");
        }
        else{
            System.out.println("Can get Both");
        }
        sc.close();
    }

}

