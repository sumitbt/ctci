package chapter1;

import java.util.HashMap;
import java.util.Scanner;

public class P2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		System.out.println(checkPermutation(str1, str2));
		sc.close();
	}
	
	static boolean checkPermutation(String str1, String str2) {
		if(str1.length() != str2.length())
			return false;
		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
		for (char ch : str1.toCharArray()) {
			charCount.put(ch, charCount.containsKey(ch) ? charCount.get(ch)+1 : 1);
		}
		for (char ch : str2.toCharArray()) {
			charCount.put(ch, charCount.containsKey(ch) ? charCount.get(ch)-1 : -1);
			if(charCount.get(ch)<0) {
				return false;
			}
		}
		return true;
	}

}
