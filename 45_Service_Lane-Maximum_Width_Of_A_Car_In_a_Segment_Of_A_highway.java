/*Service Lane - Maximum Width Of A Car In a Segment Of A highway
Written By - Aditya Wagholikar. */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the serviceLane function below.
    static int[] serviceLane(int n, int[][] cases, int[] width) {
        int width_arr_size = width.length;
        int cases_arr_size = cases.length;
        int[] minimum_width_arr = new int[cases_arr_size];
        int minimum = 0;
        int val1;
        int val2;
        
        HashSet<Integer> setOfOnes = new HashSet<Integer>();
        HashSet<Integer> setOfTwos = new HashSet<Integer>();
        
        //HashSet<Integer> setOfOnes = new HashSet<Integer>();
        
        /*Add The indexes to appropriate HashSets*/
        
         for(int i =0; i < width_arr_size; i++){
          if(width[i] == 1){
               setOfOnes.add(i);
          }  else if(width[i] == 2){
              setOfTwos.add(i);
          } else{
              
          }
        }
        
        //Retrieve the Values from Hashset
        for(int j=0; j < cases_arr_size; j++){
            Iterator it1 = setOfOnes.iterator();
            Iterator it2 = setOfTwos.iterator();
            //System.out.println(it1.next().getClass()); 
            while(it1.hasNext()){
                val1 = (int)it1.next(); 
                
                if(val1 >= cases[j][0] && val1 <= cases[j][1]){
                    minimum = 1;
                    break; 
                }
            }
            
            if(minimum == 0){
                while(it2.hasNext()){
                    val2 = (int)it2.next();
                    if(val2 >= cases[j][0] && val2 <= cases[j][1]){
                        minimum = 2;
                        break; 
                    }   
                }
            }
            
            if(minimum == 0){
                minimum = 3; 
            }
            minimum_width_arr[j] = minimum;
            minimum =0;
        }    
            
     return(minimum_width_arr);    

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nt = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nt[0]);

        int t = Integer.parseInt(nt[1]);

        int[] width = new int[n];

        String[] widthItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int widthItem = Integer.parseInt(widthItems[i]);
            width[i] = widthItem;
        }

        int[][] cases = new int[t][2];

        for (int i = 0; i < t; i++) {
            String[] casesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int casesItem = Integer.parseInt(casesRowItems[j]);
                cases[i][j] = casesItem;
            }
        }

        int[] result = serviceLane(n, cases, width);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

