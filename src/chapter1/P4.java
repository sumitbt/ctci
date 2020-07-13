package chapter1;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(palindromePermutationCheck(str));
		sc.close();
	}
	
	static boolean palindromePermutationCheck(String str) {
		
		/*
		// using bit vector
		int vector = 0;
		for(char ch : str.toCharArray()) {
			if((vector & (1 << (ch-'a'))) > 0) {
				vector &= ~(1 << (ch-'a'));
			} else {
				vector |= (1 << (ch-'a'));
			}
		}
		return (vector & (vector-1)) == 0;
		*/
		
		// using boolean array
		boolean[] oddCount = new boolean[26];
		for(char ch : str.toCharArray()) {
			oddCount[ch-'a'] = !oddCount[ch-'a'];
		}
		boolean hasOdd = false;
		for(boolean b : oddCount) {
			if(b) {
				if(!hasOdd)
					hasOdd = true;
				else
					return false;
			}
		}
		return true;
	}
	
}
