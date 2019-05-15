package part1again;

public class CountingString {
	// "aaaaabbbcddaa"
	public static String compress(String str) {
		if(str == null) {
			return "";
		}
		char[] dividedStr= str.toCharArray();
		
		int count=1;
		
		char currentLetter = dividedStr[0];
		//*2 because that is the worst case scenario, i.e all characters are unique
		StringBuilder result = new StringBuilder(str.length()*2);
		
		for( int i=1; i < str.length(); i++) {
			
			if (dividedStr[i] == currentLetter) {
				count ++ ;
			}
			
			else {
				result.append(count).append(currentLetter) ;
				count = 1;
				currentLetter = dividedStr[i] ;
				
			}
		}
		
		result.append(count).append(currentLetter) ;
	//	5a3b1c2d2a
		
		return result.toString();
	}
	
	public static void main(String[] args) {
		String abcCount= "cccaaabba";
		
		System.out.println(compress(abcCount));
	}
}