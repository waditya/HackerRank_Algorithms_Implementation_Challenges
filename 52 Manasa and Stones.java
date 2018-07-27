/*manasa and Stones
Written By - Aditya Wagholikar*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the stones function below.
    static Long[] stones(int n, int a, int b) {
    HashSet<Long> set = new HashSet<Long>();
    //Convert all integer argumenst to Long 
    Long nl = new Long(n);
    Long al = new Long(a);
    Long bl = new Long(b); 
    Long temp = new Long(0);
    //Long i = new Long(0);
    for(Long i = new Long(1); i <= nl; i++){
        temp = al * ( nl - i ) + bl * (i - 1);
        if(!set.contains(temp)){
            set.add(temp);
        }
    }
        Long[] arr = set.toArray(new Long[set.size()]);
        //Sort the Array
        Arrays.sort(arr);
    return(arr);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int TItr = 0; TItr < T; TItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int a = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int b = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            Long[] result = stones(n, a, b);

            for (int i = 0; i < result.length; i++) {
                bufferedWriter.write(String.valueOf(result[i]));

                if (i != result.length - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

