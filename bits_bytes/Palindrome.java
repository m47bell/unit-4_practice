import java.util.Scanner;

class Palindrome {
	
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter word: ");

		String word = input.next();
	
		if(isPalindrome(word)){
			System.out.println("true");
		}else
			System.out.println("false");
	}

	private static boolean isPalindrome(String s){
	int l = 0;
	int r = s.length()-1;

		while (l <r){
			if(s.charAt(l) != s.charAt(r)){
			return false;
			}
		l++;
		r--;
		}
	return true;
	}
}