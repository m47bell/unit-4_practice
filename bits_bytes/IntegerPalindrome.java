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

// Queue with two stacks. Show how to implement a queue using two stacks. Hint: If you push elements onto a stack and then pop them all, they appear in reverse order. If you repeat this process, they're now back in order.

	private static boolean isPalindrome2(String s){
		if(s.isEmpty()){
			return true;
		}
		Stack <Character> stack = new Stack();
		int left = 0;
		int right = s.length()-1;

		while(left < right){
			if(s.charAt(left) != s.charAt(right)){
			stack.pop(s.charAt(left))
			}


		}






	}




}