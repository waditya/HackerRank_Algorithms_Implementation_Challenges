/*Encryption -- Using Java
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
        int col = (int)Math.round(Math.sqrt(size_of_str));  
        
        char[] string_arr = s2.toCharArray();
        
        StringBuilder sentence = new StringBuilder();
        
        char [] word= new char[row + 1];   
        
        for(int i =0; i<col;i++){
            for(int j=0; j<row; j++){
                word[i] = string_arr[i + j * col];
            }
            word[i + 1] = " ".toCharArray()[0]; 
            sentence.append((String)word.toString()); 
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

