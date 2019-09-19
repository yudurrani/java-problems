package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TagExtractor {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
        while(testCases>0){

			String line = in.nextLine();
			
            Stack<String> stack = new Stack();
            String str = "";
            String validString = "";
            for(int i=0; i<line.length(); i++){
                //<h1>Nayeem loves counseling</h1>
                if(line.charAt(i) == '<'){
                    String tag = "";

                    // double forloop needed because <> can occur twice in a line

                    for(;i<line.length(); i++){
                        tag += line.charAt(i);  

                        //if we find invalid characters between <> then we reject
                        if(line.charAt(i) == '>'){
                            break;
                        } 
                    }

                    //at this point we either h<ave an op<en>ing tag, or closing tag
                    //opening tag may look like <h1> <Somethihng> </Something>
                    //closing for same will look </h1>
                    //<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while<par>
                    //<h1>had<h1>public</h1></h1> ===> hadpublic
                    //<>hello</>
                    //<>hello</><h>dim</h>
                    //<>hello</><h>dim</h>>>>>
                    if(tag.length() <= 1 || tag.charAt(1) == '/'){
                        //this is a closing tag
                        String openingTag = stack.pop();
                        //verify if this is the matching closing tag
                        //tag === </Something>
                        if(openingTag.length() >= 2 && tag.length() >= 3){
                            openingTag = openingTag.substring(1,openingTag.length()-1);
                            String closingTag = tag.substring(2,tag.length()-1);
                            // System.out.println(String.format("Opening: [%s] Closing: [%s]", openingTag, closingTag));
                            if (openingTag.equals(closingTag) && openingTag.length() > 0){
                                if(str.length() > 0)
                                    System.out.println(str);
                                validString += str;
                                
                            }
                        }
                        for(; i < line.length() && line.charAt(i) != '<'; i++){
                            //skip characters in between
                        }
                        i--;//to keep i so that it goes through the same loop again
                        str = "";

                    } else {
                        //when ever we have opening, we set string to empty
                        str = "";
                        stack.push(tag);
                    }

                } else if(!stack.isEmpty()) {//only collect if we have an opening in the stack
                    str += line.charAt(i);
                }

            }
            if(validString != null && validString.length() > 0){
                // System.out.println(validString);
            } else {
                System.out.println("None");
            }
            
            // }
            // else System.out.println("None");
			testCases--;
		}
	}
}




