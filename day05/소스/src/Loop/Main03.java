package Loop;

public class Main03 {

	public static void main(String[] args) {
		// 1 ~ 100���� ������ ��
		int sum = 0;
		int sum2 = 0;
		
		int i = 1;
		while(i <= 100) {
			i++;
			sum += i;
		}
		
		System.out.println(sum);
		
		int j = 0;
		while(j <= 100) {
			sum2 += j;
			j++;
		}
		
		System.out.println(sum2);
		
		
		
	}

}







