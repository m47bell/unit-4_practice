import java.util.Stack;

class BalChar{

	public static void main (String [] args){
	 	printResult("");
	 	printResult("([{}])");
	 	printResult("{[}]");
	 	printResult("(([])))");
	 	printResult("()[{}]");
	}

	public static void printResult(String s){
		System.out.print("is '%s' balanced? " + isBalanced(s));
	}

	public static boolean isBalanced(String s){
		//check if String is empty
		if(s.isEmpty())
			return true;

	 	Stack<Character> stack = new Stack<Character>();

	 	for(int i = 0; i < s.length(); i++){
	 		//check for left chars
	 		if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '['){
	 			stack.push(s.charAt(i));
	 		}
	 		//check for right chars
	 		else if (s.charAt(i) == '}' || s.charAt(i) == ')' || s.charAt(i) == ']'){
	 			//check if it matches the left char inside the stack
	 			char leftChar = stack.pop();
	 			if((leftChar == '{' && s.charAt(i) == '}' )|| (leftChar == '(' && s.charAt(i) == ')') 
	 				|| (leftChar == '[' && s.charAt(i) == ']')){
	 				return true;
	 			}  			
	 			else{
	 				return false;
	 			}
	 		}
		}
	 	  return false;
	}
}