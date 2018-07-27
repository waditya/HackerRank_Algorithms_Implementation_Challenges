/*FlatLand Space Stations
Author - Aditya Wagholikar*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the flatlandSpaceStations function below.
    static int flatlandSpaceStations(int n, int[] c) {
    int diff = 0;
    Arrays.sort(c);
        
    for(int i = 0; i < c.length - 1; i++){
    diff = Math.abs(c[i] - c[i+1]) > diff? Math.abs(c[i] - c[i+1]) : diff;
    System.out.println("Difference : "+diff);
  }
    if(c[0] == 0){
        return(diff - 2 < 0 ?diff - 1:diff -2);
                }
    if(c[c.length-1] !=n){ 
        return(n - c[c.length - 1] >diff?n - c[c.length - 1]-1:diff/2); 
    }
    return(diff -1 <0?0:diff/2);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[] c = new int[m];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = flatlandSpaceStations(n, c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

