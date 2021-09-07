package Loop;

public class Main10 {

	public static void main(String[] args) {
		/*
		 * 1. 1부터 10까지의 합?
		 */
		int result = 0;
		for(int i = 1; i<=10; i++) {
			result += i;
		}
		
		System.out.println("1~10 까지의 합 : " + result);
		
		
		/*
		 * 2. 1~10 까지의 홀수의 합?
		 */
		int result2 = 0;
		for(int i = 1; i <= 10; i++) {
			if( i % 2 == 1 ) {
				result2 += i;
			}
		}
		
		System.out.println("1~10까지의 홀수의 합 : " + result2);
		
		/*
		 * 3. 1~10 까지의 짝수의 합?
		 */
		int result3 = 0;
		for(int i = 1; i <= 10; i++) {
			if( i % 2 == 0 ) {
				result3 += i;
			}
		}
		
		System.out.println("1~10까지의 짝수의 합 : " + result3);
		
		
	}

}
