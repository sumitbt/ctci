package chapter1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P1 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(hasUniqueChars(str));
		sc.close();
	}
	
	static boolean hasUniqueChars(String str) {
		//using set O(n)
		Set<Character> charSet = new HashSet<Character>(); 
		for (char ch : str.toCharArray()) {
			if(charSet.contains(ch)) {
				return false;
			}
			charSet.add(ch);
		}
		return true;
		
		/*
		//without set O(n log(n))
		char[] chars = str.toCharArray();
		java.util.Arrays.sort(chars);
		for (int i=1; i<chars.length; i++) {
			if(chars[i] == chars[i-1])
				return false;
		}
		return true;
		*/
	}

}
