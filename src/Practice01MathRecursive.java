public class Practice01MathRecursive implements Practice01Math{
	public int fib(int n)throws Exception{
		if(n < 0){ 										//Throws an exception for negative numbers
			throw new Exception("Error");
		}
		if(n == 0){										//First base case. Checks if 0. Returns 0 because no calculations need to be done.
			return 0;
		}
		if(n == 1){										//Second base case. Checks if 1. Returns 1 because no calculations need to be done.
			return 1;
		}
		return fib(n - 1) + fib(n - 2);					//Calls function two times.
	}	

	public int fact(int n)throws Exception{
		if(n < 0){
			throw new Exception("Error");
		}
		if(n == 1){										//First base case. Checks if 1. Returns 1 because no calculations need to be done.
			return 1;
		}
		return fact(n - 1) * n; 						//Calls function then multiples it by n
	}
}