/*Written By - Aditya Wagholikar
Determine minimum distance between repeating elements in an array*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumDistances function below.
    static int minimumDistances(int[] a) {
        int min = -1;
        HashSet<Integer> set = new HashSet<Integer>();
        int size = a.length;
        int counter = size;
        boolean flag = true;
        for(int i = 0; i < size; i++){
            for(int j=i+1; j < size; j++){
                if(a[i] == a[j]){
                    if(flag){
                        min = Math.abs(i - j);
                        flag = false;
                    }else{
                        min = Math.abs(i - j) > min? min : Math.abs(i - j);
                    }
                        
                }
            }
        }
        return(min);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = minimumDistances(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

