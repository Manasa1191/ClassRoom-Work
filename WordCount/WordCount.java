// CS210 Assignment #4 "Word Count"
// Manasa Bethapudi

//This program prints the number of words in a given string.
public class WordCount{
	public static void main(String[] args) {
		String s= "hello are you?";
		System.out.println(wordCount(s));
	}

	//This method returns number of words in a given string.
	public static int wordCount(String inputString) {
        int len=inputString.length();
    	char first=inputString.charAt(0);
    	char last=inputString.charAt(len-1);
    	int count=0;
    	char space=' ';
    	
    	for(int i=0;i<=len-1;i++) {
    		
    		if(first==space && len==1) {
    			return count;
    		}
    		
    		if(first==space && len!=1) {
    			i++;
    		}
    		
    		if(inputString.charAt(i)==space) {
    			count++;
    		}
    		
    	}
		return count+1;
    }

}
