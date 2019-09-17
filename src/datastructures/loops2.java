package datastructures;
import java.util.*;
import java.io.*;
import java.lang.Math;

public class loops2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int number = 0;

            for(int x=0; x<n; x++){
                number += ((int)Math.pow(2,x))*b ;
                System.out.print( a + number +" " );
            }
        System.out.println();
        }
        in.close();

        
    }
}

