package hackerrank;


import java.util.Scanner;

public class checkAnagram {

    static boolean isAnagram(String a, String b) {
       if(a==null || b == null || a.length() != b.length()){
           return false;
       }
       a = a.toLowerCase();
       b = b.toLowerCase();

        int aString = 1;
        int bString = 1;

        

        String resultA="";
        String resultB="";

        char[] forA= a.toCharArray();
        char[] forB= b.toCharArray();

        char aChar= forA[0];
        char bChar = forB[0];

        for (int i=0; i<b.length(); i++){
            for (int x=1; x<b.length(); x++){
                if ( forA[i] == forA[x]){
                    aString++;
                }
                else {
                    resultA += aString + "" + aChar;
                    
                    
                }
                aChar=forA[i];
                aString = 1;
            }
        
        resultA += aString + "" + aChar;
        }

        for (int i=0; i<b.length(); i++){
            for (int x=1; x<b.length(); x++){
                if ( forB[i] == forB[x]){
                    bString++;
                }
                else {
                    resultB += bString + "" + bChar;
                    if (resultA.contains(resultB)){
                        
                    }
                    else break;
                }
                bChar=forB[i];
                bString = 1;
            }
        
        resultB += bString + "" + bChar;

        }        

       if (resultA.contains(resultB)){
           return true;
       }
       else return false;


        // char[] results = new char[resultA.length];
        // for (int i = 0 ; i < resultA.length; i++){
        //     if (results)
        // }

    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
