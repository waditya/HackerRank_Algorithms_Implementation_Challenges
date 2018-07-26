/*FlatLand Space Stations*/

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
    int max_of_min_distance=-1;
    int min_dist=-1;
    int no_of_space_stations = c.length;
    int current_station = 0;
    int min = -1;
    int prev;
        
    HashMap<Integer, Integer> map = new HashMap<>();
    
    if(no_of_space_stations == n){
        return(0); 
    }
    
    for(int city=0; city<n; city++){        
        for(int spacestation =current_station; spacestation < no_of_space_stations; spacestation++){
            prev = Math.abs(city - c[spacestation]) < min_dist && min_dist!=-1 ? Math.abs(city - c[spacestation]) : min_dist==-1?Math.abs(city - c[spacestation]): min_dist;           
            min_dist = Math.abs(city - c[spacestation]) < min_dist && min_dist!=-1 ? Math.abs(city - c[spacestation]) : min_dist==-1?Math.abs(city - c[spacestation]): min_dist;
            System.out.println("Min. Dist for : "+city+" is : "+min_dist+", Max. Dist :"+max_of_min_distance+", Calculated Min. Dist : "+Math.abs(city - c[spacestation]));
            }
        max_of_min_distance = max_of_min_distance>min_dist?max_of_min_distance: min_dist;
        } 
        System.out.println("Maximum Distance : "+max_of_min_distance);
        return(max_of_min_distance);
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

