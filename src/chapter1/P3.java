package chapter1;

import java.util.Scanner;

public class P3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(URLify(str.toCharArray()));
		sc.close();
	}
	
	static String URLify(char[] str) {
		int i, j=str.length-1;
		for (i=str.length-1; i>=0; i--)
			if(str[i] != ' ')
				break;
		while (i>=0) {
			if(str[i] != ' ') {
				str[j--] = str[i--];
			} else {
				str[j--] = '0';
				str[j--] = '2';
				str[j--] = '%';
				i--;
			}
		}
		return new String(str);
	}

}
