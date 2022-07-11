package Self;
public class Types {

    public static void main(String[] arg){
        // Primitive type
        /*
         * byte - 1 [ -128 to 127]
         * short - 2
         * int - 4 [ 1,2,3,4]
         * long - 8
         * float - 4 [3.14]
         * double - 8
         * char - 2 [a,b,c,d]
         * boolean - 1 [true / false]
         */

         byte age = 30;
         int phone = 1234567890;
         long phone2 = 123456789000L;
         float pi = 3.14F;
         char letter = '@';
         boolean isAdult = true;
         System.out.println(age);
         System.out.println(phone);
         System.out.println(phone2);
         System.out.println(pi);
         System.out.println(letter);
         System.out.println(isAdult);

         // Non-primitive type
         /*
          * String
          * they have special function or them that can be called using 
          * -> var_name.Function_name()
          *
          * Arrays
          *special properties -> sort and length
          */
        

          String name = "Aman";
          String friend = new String("Akku");
          System.out.println(name.length());
          System.out.println(friend);
    }
    
}
