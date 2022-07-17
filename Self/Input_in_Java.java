package Self;

//import java.net.SocketPermission;
import java.util.Scanner;

public class Input_in_Java {
    
    public static void main(String[] args){
        //How to take Input?
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Your Age :");
        //int age = sc.nextInt(); // taking int input
        float age = sc.nextFloat(); // taking float input
        System.out.println(age);

        // taking stirng(single word) input
        System.out.print("Input Your Name :");
        String name = sc.next(); 
        // next() only takes token i.e. words as an input. Eg: Aman, Ayush are valid inputs. & "ayush is smart" is invalid.
        System.out.println(name);

        //taking string line input
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String line = scn.nextLine();
        System.out.println(line);
        sc.close();
        scn.close();

    }
}
