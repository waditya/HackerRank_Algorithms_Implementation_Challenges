/*Fair rations*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the fairRations function below.
    static String fairRations(int[] B) {
        int no_of_subjects = B.length;
        int number_of_loafs=0;
        //Start distributing loaf of bread
        for(int i =0; i < no_of_subjects - 1;i++){
            if(B[i]%2 == 1){
                B[i]+=1;
                B[i+1]+=1;
                number_of_loafs = number_of_loafs+2;
            }
            if(B[no_of_subjects -1 ]%2 == 1){
                System.out.println("NO");
                number_of_loafs = 0;
                break;
            }
        }
        return(B[no_of_subjects -1 ]%2 == 1?"NO": Integer.toString(number_of_loafs));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] B = new int[N];

        String[] BItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < N; i++) {
            int BItem = Integer.parseInt(BItems[i]);
            B[i] = BItem;
        }

        String result = fairRations(B);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
