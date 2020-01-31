public class Practice01MathIterative implements Practice01Math{
	
	public int fib(int n)throws Exception{
		if(n < 0){
			throw new Exception("Error");
		}
		if(n == 0){
			return 0;
		}
		if(n == 1){
			return 1;
		}

		int first_previous = 0;										//First term in Fib is 0
		int second_previous = 1;									//Second term in Fib is 1
		int current = 0;											
																	//Loops and calculates to find the nth term. Calculations not needed to find the
		for(int i = 2; i <= n; i++){ 								//0th and 1st term, so start loop by finding the 2nd term.
			current = first_previous + second_previous;
			first_previous = second_previous;						//swaps so the second term becomes the first term
			second_previous = current;								//swaps so the second term becomes the current term(term calculated and found last)
		}

		return current; 
	}

	public int fact(int n)throws Exception{
		if(n <= 0){
			throw new Exception("Error");
		}

		int sum = 1;												//sum intialized to 1 because the first term of any factorial is 1

		for(int i = 1; i <= n; i++){								//Loops and calculates the sum of the nth term.
			sum *= i;											
		}

		return sum; 
	}
}