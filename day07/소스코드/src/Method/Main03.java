package Method;

public class Main03 {

	public static void main(String[] args) {
		// 메서드의 리턴값을 변수에 저장
		int a = f1(500);
		System.out.println(a);
		// 리턴값을 출력에 사용
		System.out.println(f2(10));
	}
	
	public static int f1( int x ) {
//		int y = x + 10;
//		return y;
		return x + 10;
	}
	
	public static int f2(int x) {
		return x * x + 1;
	}
	
	
	

}
