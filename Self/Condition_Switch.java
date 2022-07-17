package Self;

public class Condition_Switch {
    public static void main(String[] args) {
        // Conditional Statments - Switch

        int day = 1; // 1 - Monday;  2 - Tuesday;

        switch(day) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Wednesday - Sunday");
                break;
        }
        
    }
    
}
