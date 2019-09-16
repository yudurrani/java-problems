package hackerrank;




import java.io.*;
import java.util.*;

public class TimeAndComplexity {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
Scanner scan = new Scanner(System.in);
        int totalTests = scan.nextInt();

        for(int x = 0; x < totalTests; x++){
    
            int number = scan.nextInt();
            int primes=0;
           

            for(int y =2 ; y<number/2; y++){
                if(number%y==0)
                    
                primes++;
                 if(primes>0){
                break;
            }
                    
            }

            if(primes>0 && number>2 || number ==1 || number ==4)
            System.out.println("Not prime");

            else System.out.println("Prime");
            
        
        }
    }
}

