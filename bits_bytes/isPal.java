class IsPalindrome {

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
public static String toBinaryString(int num, int base){

		int result = 0;
		int multipler = 1;

		while(num > 0) {
			int mod = num % base;
			num = num / base;
			result = result + mod * multipler;
			multipler = multipler * 10;
		}
		return result;
	}

public static void main (String [] args){

		if(isPalindrome(toBinaryString(1111, 2))){
			System.out.println("true");
		}else
			System.out.println("false");
	}

}