/*Choclate Feast*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the chocolateFeast function below.
    static int chocolateFeast(int n, int c, int m) {
        boolean flag = true;
        int no_of_choclates = 0;
        int money_with_bob = n;
        int no_of_wrappers=0;
        int additional_choclates = 0;
        
        while(flag){
            if(money_with_bob == n){                
                no_of_choclates = money_with_bob/c;
                no_of_wrappers = no_of_choclates;
                money_with_bob = (no_of_wrappers * c )/m;
            }else{
                
                no_of_wrappers = no_of_wrappers%m;
                additional_choclates=money_with_bob/c;
                no_of_wrappers+=additional_choclates;
                no_of_choclates+=additional_choclates;
                money_with_bob = (no_of_wrappers * c )/m;
                flag = money_with_bob <c?false:true; 
            }
        }
    return(no_of_choclates);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] ncm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(ncm[0]);

            int c = Integer.parseInt(ncm[1]);

            int m = Integer.parseInt(ncm[2]);

            int result = chocolateFeast(n, c, m);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

