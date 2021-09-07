package Loop;

public class Main01 {

	public static void main(String[] args) {
		// 1 ~ 100 까지의 누적된 합
		int sum = 0;
		
		// i값이 1부터 100까지 증가하는 동안, i의 값을
		// sum에 누적한다.
		for(int i = 1; i<=3; i++) {
			//결과값 누적
			sum += i;
			System.out.println(i +  " 번째 " + sum);
		}
		
		System.out.println("결과값 : " + sum);
		
		
		
	}

}




