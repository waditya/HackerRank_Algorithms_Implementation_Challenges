/*Beautiful Triplets - Implementation in Java
Author - Aditya Wagholikar*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the beautifulTriplets function below.
    static int beautifulTriplets(int d, int[] arr) {
                
        HashMap<Integer, Integer> arr_map = new HashMap();        
        int triplet_counter = 0;
        int size_of_arr = arr.length;
        
        //Create a hashmap with K-V pair -- array value and its index respectively
        
        for(int index = 0; index < size_of_arr - 1; index++){
            arr_map.put(arr[index], index);
        }
        //Check for beautiful triplets
        
        for(int index = 0; index < size_of_arr; index++){
            if(arr_map.containsKey(arr[index])){
                int element1 = arr_map.get(arr[index]);
                
                //Calculate the next 2 progressions  
            
                int element2 = element1 + d;
                int element3 = element2 + d;
                int flag = -1;
            
            //Check if the hashmap contains these two progressive elements
            
            if(arr_map.containsKey(element2) && arr_map.containsKey(element3)){
                //Proceed to check if their index follow the given rules for beautiful triplets
                
                flag = triplet_counter; 
                //triplet_counter = arr_map.get(element3) > arr_map.get(element2) && arr_map.get(element2) > arr_map.get(element1) ?triplet_counter+1:triplet_counter;
                triplet_counter = triplet_counter+1;
                
                //System.out.println(flag!=triplet_counter);
                System.out.println(element1+", "+element2+", "+element3);
                
                flag = -1;
                arr_map.remove(element1);
                if(!(arr_map.containsKey(element3+d))){
                    System.out.println("Inside the check.."+element3+", "+(element3+d)+", "+arr_map.containsKey(element3+d));
                    arr_map.remove(element1);
                    arr_map.remove(element2);
                    arr_map.remove(element3); 
                    }
                }       
            }
        }
        System.out.println("Number of beautiful triplets : "+triplet_counter);
    return(triplet_counter);
}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);         
          
        int d = Integer.parseInt(nd[1]);
         
         
        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] =  arrItem;            
        }
        int result = beautifulTriplets(d, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}


