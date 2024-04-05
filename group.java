public class group {
	public void getGroupMembers() {
		System.out.println("Anthony Mikulcic");
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

}
