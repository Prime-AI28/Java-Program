package Self;

import java.util.Arrays;

public class Array {

    public static void main(String[] arg){
        int[] marks = new int[3];
        //int[] marks2 = {97,95,98};
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;


        // 1. length
        System.out.println(marks.length);

        // sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

        boolean[] result = new boolean[3];
        System.out.println(result[1]);

        
        
        // 2D arrays

        int[][] classmarks = {{97,95,98},{95,93,98}};
        System.out.println(classmarks[1][1]);

    }
    
    
}
