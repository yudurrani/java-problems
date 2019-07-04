package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SparseArrays{
	

    // Complete the matchingStrings function below.
    public static int[] matchingStrings(String[] strings, String[] queries) {
        HashMap<String,Integer> hm=new HashMap<String,Integer>();

        for(int i=0; i<strings.length; i++){

            if(hm.containsKey(strings[i])){

                int count = hm.get(strings[i]) +1 ;
                hm.put(strings[i], count);
            }

            else hm.put(strings[i], 1);
        
        }
        
        int[] total = new int[queries.length];
        for( int i=0; i<queries.length; i++){
            String key = queries[i]; 
            if(hm.containsKey(key)){
                total[i] = hm.get(key) ;
            }           
        }
     return total;   
    }

}

