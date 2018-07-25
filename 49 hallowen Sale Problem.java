/*Hallowen Sale Problem
Written  By - Aditya Wagholikar*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the howManyGames function below.
    static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
        int no_of_games = 0;
        int wallet_sum = s;
        boolean flag = true;
        int costprice =p ;
        if(s < p){
            return(0);
        }
        while(flag){
            if(wallet_sum == s){
                costprice = p;
            }else{
                costprice  = costprice - d >m?costprice -d :m;    
            }
            //no_of_games++;
            wallet_sum -=costprice;
            no_of_games = wallet_sum >=0?no_of_games+1:no_of_games;
            System.out.println("Cost of game : "+costprice+", Amount Left in Wallet :"+wallet_sum+", Number of games : "+no_of_games+", Base Price : "+m);
            //costprice  = p - d >m?p -d :m;            
            //wallet_sum -=costprice;
            flag = wallet_sum<m?false:true;
            //no_of_games = flag==false?no_of_games--:no_of_games;
        }
        return(no_of_games);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] pdms = scanner.nextLine().split(" ");

        int p = Integer.parseInt(pdms[0]);

        int d = Integer.parseInt(pdms[1]);

        int m = Integer.parseInt(pdms[2]);

        int s = Integer.parseInt(pdms[3]);

        int answer = howManyGames(p, d, m, s);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

