/*Append and Delete
.. Written by - Aditya Wagholikar .. */


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the appendAndDelete function below.
    static String appendAndDelete(String s, String t, int k) {
        int commonLength = 0;
        String status = "Yes";
        
        for (int i=0; i<java.lang.Math.min(s.length(),t.length());i++){
            if (s.charAt(i)==t.charAt(i))
                commonLength++;
            else
                break;
        }
//CASE A
        if((s.length()+t.length()-2*commonLength)>k){
            System.out.println("No");
            status ="No";
        }
//CASE B
        else if((s.length()+t.length()-2*commonLength)%2==k%2){
            System.out.println("Yes");
            status = "Yes";
        }
//CASE C
        else if((s.length()+t.length()-k)<0){
            System.out.println("Yes");
            status = "Yes";
        }
//CASE D
        else{
            System.out.println("No");
            status ="No";
        }
        return(status);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String t = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

