package Self;

public class Break_Continue {
    public static void main(String[] args) {
        // Break & Continue
        int i = 0;
        while(true){
            if(i == 3){
                i = i+1;
                continue; // skips the current step of loop
            }
            System.out.println(i);
            i = i+1; // why 
            if(i>5){
                break; // use ti exit loop
            }
        }
    }
    
}
