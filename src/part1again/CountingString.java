package part1again;

public class CountingString {
	// "aaaaabbbcddaa"
	public static String compress(String str) {
		
		char[] dividedStr= str.toCharArray();
		
		int count=1;
		
		char currentLetter = dividedStr[0];
		
		String result = "";
		
		for( int i=1; i < str.length(); i++) {
			
			if (dividedStr[i] == currentLetter) {
				count ++ ;
			}
			
			else {
				result+=count +""+ currentLetter ;
				count = 1;
				currentLetter = dividedStr[i] ;
				
			}
		}
		
		result+=count +""+ currentLetter ;
	//	5a3b1c2d2a
		
		return result;
	}
	
	public static void main(String[] args) {
		String abcCount= "aaa";
		
		System.out.println(compress(abcCount));
	}
}