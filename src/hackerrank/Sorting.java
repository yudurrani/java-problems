package hackerrank;


import java.util.*;

public class Sorting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        int totalSwaps=0 ;
        int temp = a[0];
        for ( int x = 0; x < n ; x++){
            
            for ( int y=x+1 ; y < n; y++){
                
                temp = a[x];
                if (  a[x] > a[y]){
                    a[x] = a[y];
                    a[y] = temp;
                    totalSwaps++;
                }
                
            }
                
           
        }
    
          
        System.out.println("Array is sorted in " + totalSwaps+ " swaps.");

        System.out.println("First Element: "+ a[0]);
        System.out.println("Last Element: "+ a[n-1]);
    }

}
    


