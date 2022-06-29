package week2.day2;

public class FindType {
	public static void main(String[] args) {
		String str = "$$$Java is a No1 popular programming language";
		int digitCount=0;
		int alphaCount=0;
		int spaceCount=0;
		int splCharCount=0;
		for (int i=0; i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				digitCount++;
			}
			else if(Character.isAlphabetic(str.charAt(i))) {
				alphaCount++;
			}
			else if (Character.isSpaceChar(str.charAt(i))) {
				spaceCount++;
			}
			else {
				splCharCount++;
			}
		}
		
		System.out.println("Number of digits in the given string is: "+digitCount);
		System.out.println("Number of alphabets in the given string is: "+alphaCount);
		System.out.println("Number of spaces in the given string is: "+spaceCount);
		System.out.println("Number of special character in the given string is: "+splCharCount);
	}

}

