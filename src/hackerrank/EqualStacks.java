package hackerrank;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

class CylinderStack {

    Stack<Integer> stack;
    int height = 0;

    CylinderStack(){
        this.stack = new Stack<Integer>(); 
    }

    CylinderStack(int[] arr){
        this.stack = new Stack<Integer>();
        addAll(arr); 
    }
    void addAll(int[] arr){
        for(int i=arr.length -1; i>=0; i--){
            push(arr[i]);
        }
    }
    
    int pop(){
        int topValue = stack.pop();
        height = height - topValue;
        return topValue;
    }

    void push(int cylinderHeight){
        height = height + cylinderHeight;
        stack.push(cylinderHeight);
    }

    int peek(){
        return stack.peek();
    }

    boolean isEmpty(){
        return stack.empty();
    }

    int getHeight(){
        return height;
    }

    
}



public class EqualStacks {



    /*
     * Complete the equalStacks function below.
     */
    static int equalStacks(int[] h1, int[] h2, int[] h3) {
        /*
         * Write your code here.
         */
            
        CylinderStack h1Stack = new CylinderStack(h1);
        CylinderStack h2Stack = new CylinderStack(h2);
        CylinderStack h3Stack = new CylinderStack(h3);

//automatically breaks when alls stacks hit 0 height
        while(true) {

// we don't need to do is empty check as we only remove from stack with heighest value, so if they all become empty, this statement will also handle that
            if( h1Stack.getHeight() == h2Stack.getHeight() && h1Stack.getHeight() == h3Stack.getHeight()){

                return h1Stack.getHeight();
            }

            else {
                CylinderStack greatestHeight = checkHeight(h1Stack, h2Stack, h3Stack);
                greatestHeight.pop();
            }
        }

    }

    private static CylinderStack checkHeight(CylinderStack a, CylinderStack b, CylinderStack c){
        CylinderStack result = a;

        if(b.getHeight() > result.getHeight()){
            result = b;
        }
        if(c.getHeight() > result.getHeight()){
            result = c;
        }
        return result;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] n1N2N3 = scanner.nextLine().split(" ");

        int n1 = Integer.parseInt(n1N2N3[0].trim());

        int n2 = Integer.parseInt(n1N2N3[1].trim());

        int n3 = Integer.parseInt(n1N2N3[2].trim());

        int[] h1 = new int[n1];

        String[] h1Items = scanner.nextLine().split(" ");

        for (int h1Itr = 0; h1Itr < n1; h1Itr++) {
            int h1Item = Integer.parseInt(h1Items[h1Itr].trim());
            h1[h1Itr] = h1Item;
        }

        int[] h2 = new int[n2];

        String[] h2Items = scanner.nextLine().split(" ");

        for (int h2Itr = 0; h2Itr < n2; h2Itr++) {
            int h2Item = Integer.parseInt(h2Items[h2Itr].trim());
            h2[h2Itr] = h2Item;
        }

        int[] h3 = new int[n3];

        String[] h3Items = scanner.nextLine().split(" ");

        for (int h3Itr = 0; h3Itr < n3; h3Itr++) {
            int h3Item = Integer.parseInt(h3Items[h3Itr].trim());
            h3[h3Itr] = h3Item;
        }

        int result = equalStacks(h1, h2, h3);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
