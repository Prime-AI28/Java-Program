package Self;

import java.util.Scanner;

public class Conditions_ifelse {

    public static void main(String[] args){
    // conditional stt
    boolean isSunUp = true;
    Scanner sc = new Scanner(System.in);
    System.out.println("State true or false: ");
    isSunUp = sc.nextBoolean();
    if(isSunUp == true)
        System.out.println("Day");
    else
        System.out.println("Night");

    int age ;
    System.out.print("What is Your age: ");
    age = sc.nextInt();
    if(age > 18)
        System.out.println("Can Vote");
    else
        System.out.println("Can't Vote");
    sc.close();

    }

    
}
