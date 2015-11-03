class IntegerPalindrome {

	public static void main (String [] args){


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

	public static String toBinary( int input){




	}




// Queue with two stacks. Show how to implement a queue using two stacks. Hint: If you push elements onto a stack and then pop them all, they appear in reverse order. If you repeat this process, they're now back in order.






}