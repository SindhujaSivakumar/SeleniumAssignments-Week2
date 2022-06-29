package week2.day2;

import java.util.Arrays;

public class Anagram {
	public boolean isAnagram(String input1, String input2) {
		boolean flag=false;
		if (input1.length() == input2.length()) {
			char[] arr1 = input1.toCharArray();
			char[] arr2 = input2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			flag = Arrays.equals(arr1, arr2);
		}
		return flag;
	}
	public static void main(String[] args) {
		Anagram obj = new Anagram();
		boolean result = obj.isAnagram("stop", "post");
		if (result == true) {
			System.out.println("Given words are anagram");
		}
		else {
			System.out.println("Given words are not anagram");
		}
				
	}

}
