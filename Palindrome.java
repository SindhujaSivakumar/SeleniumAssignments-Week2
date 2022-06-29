package week2.day2;

public class Palindrome {
	public static void main(String[] args) {
		String str = "madam";
		char[] ch=str.toCharArray();
		int len = ch.length;
		String revstr1;
		String revstr2="";
		for (int i=len-1; i>=0;i--) {
			revstr1 = str.substring(i, i+1);
			revstr2 = revstr2+revstr1;
		}
		if (str.equals(revstr2)) {
			System.out.println("Given string "+str+" is palindrome");
		}
		else {
			System.out.println("Given string "+str+" is not a palindrome");
		}
	}

}
