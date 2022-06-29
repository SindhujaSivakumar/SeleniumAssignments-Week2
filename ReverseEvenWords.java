package week2.day2;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String str1 = "Java is a popular programming language";
		String[] str2 = str1.split(" ");
		int len = str2.length;
		//String resStr = "";
		for (int i=0;i<len;i++) {
			if (i%2==0) {
				System.out.println(str2[i]);
			}
			else {
				char[] arr=str2[i].toCharArray();
				String revStr="";
				for (int j=str2[i].length()-1; j>=0;j--) {
					revStr=revStr+arr[j];
				}
				System.out.println(revStr);
			}
		}
	}

}
