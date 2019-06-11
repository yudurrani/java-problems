package hackerrank;

import java.io.*;
import java.util.*;

public class PrimeNotPrime {




    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
    
            for (int i =0 ; i<T; i ++){
        
                int n = scanner.nextInt();
                int total = 0;
                for ( int x =  2; x <= n/2; x++){
                    if ( n>2 && n%x == 0){
                       total ++ ;
                    }
                }

                if ( total > 0){
                    System.out.println("Not prime");
                }
                else System.out.println("Prime");
            }
    
        }
}

