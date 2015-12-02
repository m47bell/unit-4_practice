class Fib {

	public static void main(String [] args){
		System.out.println("fibonacci sequence of is " + fibonacci(10));
		System.out.println("fibonacci sequence of is " + fibonacci2(10));
		System.out.println("fibonacci sequence of is " + fibonacci3(10));
		
	}

//recurive method
 	static int fibonacci(int n){

		int a, b, c;

		if(n==0)
			return 0;
		else if (n==1)
			return 1;
		else
			return fibonacci(n-1) + fibonacci (n-2);
	}

//brute force way
	 static double fibonacci2(int n){

		double a=0, b=1, c=0;

		for(int i =1 ; i < n; i++){

			c = a + b;
			a=b;
			b=c;  
		}
		return c;
	}
//recurive 2
	static long fibonacci3(int n){

		if(n=0){
			return 0;
		} esle
		return fibonacci3(n-1) + (n-2);
	}

}