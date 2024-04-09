public class group {
	
	public void getGroupMembers() {
		System.out.println("Anthony Mikulcic");
		System.out.println("Brandon Wendell");
        System.out.println("Drew Robinson");
        System.out.println("Dylan Monreal");
	}
	
	public int multiply(int num1, int num2) {
		int sum = 0;
		for(int i = 1; i <= num1; i++) {
			sum = sum + num2;
		}
		return sum;
	}
	
    public int power(int num1, int num2) {
        if (num2 < 0) {
            throw new IllegalArgumentException("Negative exponent not supported");
        }
        if (num1 == 0 && num2 == 0) {
            throw new IllegalArgumentException("0^0 is undefined");
        }

        int result = 1;
        for (int i = 0; i < num2; i++) {
            result = multiply(result, num1);
        }

        return result;
    }
    
    public int division(int num1, int num2) {
    	if (num1==0) {
    		//throw new ArithmeticException("/ by zero");
    	}
    	int i = 1;
    	while(num1 < num2) {
    		
    		num2 -= num1;
    		i+=1;
    	}
    	return i;
    }
}