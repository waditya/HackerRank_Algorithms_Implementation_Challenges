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
    int temp;
        
    HashMap<Integer, Integer> map = new HashMap<>();
    
    if(no_of_space_stations == n){
        return(0); 
    }else if(n - no_of_space_stations ==1){
        return(1);
    }else{
        for(int city=current_station; city < n; city++){ 
            for(int station_city_index=current_station;station_city_index < no_of_space_stations; station_city_index++){                
                if(min == -1){
                    temp = Math.abs(city - c[station_city_index]);
                    min = temp; 
                }else{
                    temp = Math.abs(city - c[station_city_index]);
                    min = temp < min?temp:min;                    
                }
                if(temp > min){
                    //current_station = station_city_index;
                    System.out.println("Inside Loop : "+"Temp :"+temp+", min "+min);
                    System.out.println("City: "+city+", Station City Index : "+station_city_index+", min: "+min+", temp: "+temp+", Max. of Min. dist: "+max_of_min_distance);
                    min =-1;
                    temp=-1;
                    break;
                }                 
                System.out.println("City: "+city+", Station City Index : "+station_city_index+", min: "+min+", temp: "+temp+", Max. of Min. dist: "+max_of_min_distance);
            }
            max_of_min_distance = max_of_min_distance < min?min:max_of_min_distance;
            temp = -1;
            min = -1;
            
                    //current_station = station_city_index;
        }
        return(max_of_min_distance);
    } 
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
