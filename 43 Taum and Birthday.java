import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the taumBday function below.
    static long taumBday(int b, int w, int bc, int wc, int z) {
    long bl=(long) b; //Number of black gifts in long data type.
    long wl=(long) w; //Number of white gifts in long data type.
    long bcl=(long) bc; //Cost of black gift in long data type.
    long wcl=(long) wc; //Cost of white gift in long data type.
    long zl=(long) z;  //Cost of exchange in long data type.
    
    long mwc = wcl <= bcl+zl?wcl:bcl+zl; //mimimum cost of white gift after taking into account exchange cost with lower black gift price in long data type.
        
    long mbc = bcl <= wcl+zl?bcl:wcl+zl;//mimimum cost of black gift after taking into account exchange cost with lower white gift price in long data type.
    //Simple multiplication.
    return(mwc * wl + mbc*bl);
}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] bw = scanner.nextLine().split(" ");

            int b = Integer.parseInt(bw[0]);

            int w = Integer.parseInt(bw[1]);

            String[] bcWcz = scanner.nextLine().split(" ");

            int bc = Integer.parseInt(bcWcz[0]);

            int wc = Integer.parseInt(bcWcz[1]);

            int z = Integer.parseInt(bcWcz[2]);

            long result = taumBday(b, w, bc, wc, z);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
