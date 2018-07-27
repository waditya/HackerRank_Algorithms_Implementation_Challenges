/*FlatLand Space Stations code in Java
Author - Aditya Wagholikar */

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
    boolean initial_element_flag_check = false;
    boolean last_element_flag_check = false;
    int first_difference = 0;
    int last_difference = 0;
    int edge_difference=0;
    int no_of_spaceStations = c.length;
    int adjacent_diff = 0;
    int max_adj_diff=0;
        
    //Sort the Array of SpaceStations
        
    Arrays.sort(c);
        
    if(c[0] != 0){
        initial_element_flag_check = true;
        first_difference = c[0];
    }  
    if(c[no_of_spaceStations - 1]!= n -1){
        last_element_flag_check = true;
        last_difference = (n - 1) - c[no_of_spaceStations - 1];
    }
    //Calculate the maximum of edge difference
    edge_difference = Math.max(first_difference, last_difference);
    
    //Calcualate the difference between various space stations
        
    for(int space_station_idx = 0;space_station_idx < no_of_spaceStations -1;space_station_idx++){
        adjacent_diff = (Math.abs(c[space_station_idx] - c[space_station_idx + 1]) )/2;
        max_adj_diff = max_adj_diff < adjacent_diff?adjacent_diff:max_adj_diff;
        System.out.println("first diff. : "+first_difference+", last_dif : "+last_difference+" , adj. diff : "+adjacent_diff+", max adj. diff : "+max_adj_diff+", ** Space_Station_Index : "+space_station_idx+", Space Staion City : "+c[space_station_idx]);
    }
    return(Math.max(max_adj_diff, edge_difference));   
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

