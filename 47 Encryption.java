/*Encrypt a String
Written By - Aditya Wagholikar*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the encryption function below.
    static String encryption(String s) {
        String s2 = s.replace(" ", "");
        int size_of_str = s2.length();
        
        int row = (int)Math.floor(Math.sqrt(size_of_str));
        int col = (int)Math.ceil(Math.sqrt(size_of_str));
        
        int temp = 0;
        
        System.out.println("Lower and Upper Bound : "+row+", "+col);
        System.out.println("Size of unspaced string "+s2+" is : "+size_of_str);
        
        char[] string_arr = s2.toCharArray();
        
        StringBuilder sentence = new StringBuilder();
        
         
        
        for(int i =0; i<col;i++){  
            for(int j=0; j<=row; j++){
                temp = i + j * col;                
                if(temp < size_of_str){
                    System.out.println("i : "+i+", j : "+j+", i + j * col : "+(i + j * col));
                    System.out.println("Inside temp loop : "+string_arr[i + j * col]);                                 sentence.append(string_arr[i + j * col]);
                }
                temp =0;
            }            
            sentence.append(" ".toCharArray()[0]);
            if(temp >size_of_str){
                break; 
            }
        }
        System.out.println("The string is : "+(String)sentence.toString());
        return((String)sentence.toString()); 
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
