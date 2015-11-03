import java.util.Scanner;

class bitconversion {

	public static void main (String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("Enter Integer: ");
		int decimal = input.nextInt();
		System.out.println("Enter base: ");
		int base = input.nextInt();

		toBinaryString(decimal, base);
		// toBinary(decimal);
	}

	public static void toBinary(int number){
		String result = Integer.toBinaryString(number);
		System.out.println(result);
	}

	public static void toBinaryString(int num, int base){

		int result = 0;
		int multipler = 1;

		while(num > 0) {
			int mod = num % base;
			num = num / base;
			result = result + mod * multipler;
			multipler = multipler * 10;
		}
		System.out.println("Binary: "+ result);
	}
	
}
