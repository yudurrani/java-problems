package hackerrank;


import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}
class Calculators implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int sum =0 ;
        for ( int x = 1; x <= n; x ++){
            if ( n % x == 0){
                sum = sum+x ;

            } 
        }
        return sum;
    }
}

class InterfaceExample  {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculators(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}