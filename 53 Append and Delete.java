/*Append and Delete
Written by - Aditya Wagholikar*/


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
        int slength = s.length();
        int tlength = t.length();
        
        char[] sarr  =s.toCharArray();
        char[] tarr = t.toCharArray();
        
        int diff_index = -1;
        
        
        if(Math.abs(slength - tlength) > k){
            return("No"); 
        }else{
            for(int i =0; i < Math.min(slength, tlength); i++){
                System.out.println("s : "+sarr[i]+", t : "+tarr[i]);
                if(sarr[i] != tarr[i]){
                    diff_index = i;
                    System.out.println(" ** Difference!! ** at common index "+ diff_index);                 
                    break;
                }
            }
        }

    return("Yes");
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

