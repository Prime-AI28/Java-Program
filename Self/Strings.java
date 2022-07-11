package Self;
public class Strings {
    
    public static void main (String[] arg){
        //Strings
        // 1. Concatenate

        String name1 = "Aman";
        String name2 = "Akku";
        String name3 = name1 + " and " + name2;
        System.out.println(name3);

        // 2. charAt
        System.out.println(name1.charAt(0));

        // 3. length
        System.out.println(name1.length());

        // 4. replace

        String name4 = name2.replace('A', 'B');
        System.out.print("Old: ");
        System.out.println(name2);  
        System.out.print("New: ");     
        System.out.println(name4);

        // 5. substring
        System.out.println(name3.substring(0,4));

        // 6. 

    }
}
