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
        
        int diff_of_length = Math.abs(slength - tlength);
        
        int shorter_length = slength < tlength?slength:tlength;
        int longer_length = slength > tlength? slength:tlength; 
        
        int diff_index = -1;
        boolean diff_flag = false;
        String status = "Yes";
        
        
        if(Math.abs(slength - tlength) > k){
            return("No"); 
        }else{
            for(int i =0; i < Math.min(slength, tlength); i++){
                System.out.println("s : "+sarr[i]+", t : "+tarr[i]);
                if(sarr[i] != tarr[i]){
                    diff_index = i;
                    System.out.println(" ** Difference!! ** at common index "+ diff_index);
                    diff_flag = true; 
                    break;
                }
            }
            if(diff_flag){
                if(slength == tlength){
                    System.out.println("Insude Equality Loop");
                    status = (slength - diff_index + 1) * 2 <= k && k%2==0?"Yes":"No";   
                }else{
                    if(shorter_length - 1 >= diff_index){
                    status = (shorter_length - 1 - diff_index + diff_of_length)*2 <= k?"Yes":"No";
                }
                }
                
            }/*else{
                if(k > diff_of_length && diff_of_length!=0){
                    status = k - diff_of_length%2==0?"Yes":"No";
                }
                
            }*/
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
