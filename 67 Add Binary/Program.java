class Program {

	public static void main(String [] args) {
		
		StringBuilder stringBuilder = new StringBuilder();

		String a = "11";
		String b = "01";

		int i = a.length() - 1;
		int j = b.length() - 1;
		
		int carry = 0;

		while(i >= 0 || j >= 0) {
			int sum = carry;
			if(i >= 0) sum += a.charAt(i--) - '0';
			if(j >= 0) sum += b.charAt(j--) - '0';
			stringBuilder.append(sum % 2);
			carry = sum / 2;
		}

		if(carry == 1) stringBuilder.append(carry);
		System.out.println(stringBuilder.reverse().toString());
	}
}
