package Operator;

public class Main07 {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		int x = 5;
		int y = 3;
		
		// �����꿡 ���� ����� boolean���̴�.
		boolean result1 = a != b || a==b;	//
		boolean result2 = a < b || x > y;
		boolean result3 = a < b || x < y;
		boolean result4 = a > b || x > y;
		boolean result5 = a > b || x < y;
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		System.out.println("result5 : " + result5);
		System.out.println("--------------------------");
		
		
		// boolean�� ������ �������� �����ϴ�.
		boolean r1 = a >= b;
		boolean r2 = x >= y;
		boolean result6 = r1 && r2;
		boolean result7 = r1 || r2;
		
		System.out.println("result6 : " + result6);
		System.out.println("result7 : " + result7);
		System.out.println("--------------------------");
		
		boolean success = true;
		boolean fail = !success;
		System.out.println(fail);
		
	}

}







