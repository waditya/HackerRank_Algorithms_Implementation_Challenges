/*Lisas workbook
Written By - Aditya Wagholikar*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the workbook function below.
    
    static int workbook(int n, int k, int[] arr) {
    boolean flag = true;
    int current_page_no = 1;
    int no_of_chapters = arr.length;
    int index = 0;
    int beginning = 1;
    int end = k;
    int no_special_page = 0;
    int no_of_problems_in_chapter=0; 
    while(flag){
    no_of_problems_in_chapter = arr[index];
    if (current_page_no >=beginning && current_page_no <= end){
        //System.out.println("Current Page : "+current_page_no+" , Chapter # "+(index+1)+" ,Problem Number Range : "+beginning+" to "+end);
        no_special_page++;    
    }
    //System.out.println("*** General : Current Page : "+current_page_no+" , Chapter # "+(index+1)+" ,Problem Number Range : "+beginning+" to "+end);
     current_page_no++;     
    if ((beginning + k) > no_of_problems_in_chapter){
        index++;
        if(index >= no_of_chapters){
            //System.out.println("We are at break point, index : "+index+" , No of chapters : "+no_of_chapters);
            break;
        }
        beginning = 1;
        end = arr[index] <k? arr[index]:k;
    }else{
        beginning+=k;
        end = end + k > no_of_problems_in_chapter?no_of_problems_in_chapter:end+k;
    }
    //flag = index==no_of_chapters? false:true; 
    }    
    return(no_special_page);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = workbook(n, k, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
