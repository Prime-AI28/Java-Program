package Self;

import java.util.Scanner;

public class Logical_Operators {

    public static void main(String[] args ){

        //&& (and operator)
        Scanner sc = new Scanner(System.in);
        int age1 = sc.nextInt();
        int age2 = sc.nextInt();
        if(age1<20 && age2<50)
            System.out.println(("Son and Father")); 
        
            sc.close();
    }
    
}
