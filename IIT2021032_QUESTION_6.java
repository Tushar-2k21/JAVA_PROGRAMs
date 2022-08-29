import java.io.*;

public class IIT2021032_QUESTION_6 {
//    public static String removeOne(String str) {
//
//        // Count leading zeros
//
//        // Initially setting loop counter to 0
//        int i = 0;
//        while (i < str.length() && str.charAt(i) == '1')
//            i++;
//
//        // Converting string into StringBuffer object
//        // as strings are immutable
//        StringBuffer sb = new StringBuffer(str);
//
//        // The StringBuffer replace function removes
//        // i characters from given index (0 here)
//        sb.replace(0, i-1, "");
//
//        // Returning string after removing zeros
//        return sb.toString();
//    }
    public static void main(String[] args) {
        int num1 = 85; /*1010101*/
        int num2 = 42; /*0101010*/

        int ans0 = num2&num1;
        int ans1 = num2 | num1;
        int ans2 = num2^num1;
        int ans3 = num1<<3;
        int ans4 = num2>>3;
        int ans5 = ~num1;

        System.out.println("BINARY OF NUM 1 : 1010101 ");
        System.out.println("BINARY OF NUM 1 : 0101010 ");
        System.out.println("THE RESULT OF NUM1 & NUM2 : " + Integer.toBinaryString(ans0));
        System.out.println("THE RESULT OF NUM1 | NUM2 : " + Integer.toBinaryString(ans1));
        System.out.println("THE RESULT OF NUM1 ^ NUM2 : " + Integer.toBinaryString(ans2));
        System.out.println("THE RESULT OF NUM1 << 3 : " + Integer.toBinaryString(ans3));
        System.out.println("THE RESULT OF NUM1 >> 3 : " + Integer.toBinaryString(ans4));
        System.out.println("THE RESULT OF ~(NUM1) : " +   Integer.toBinaryString(ans5));




    }


}
