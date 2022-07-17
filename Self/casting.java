package Self;

public class casting {
    
    public static void main(String[] args){
        //Casting
        // example of Implicit casting
        double price = 100.0;
        double fprice = price + 18;
        System.out.println(fprice);

        /*
         * int p = 100;
         *int fp = p +18.0;
         */
        //example Explicit casting

        int p = 100;
        int fp = p + (int)18.90;
        System.out.println(fp);


    }
}
