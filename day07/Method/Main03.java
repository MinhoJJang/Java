package Method;

public class Main03 {

	public static void main(String[] args) {
		// �޼����� ���ϰ��� ������ ����
		int a = f1(500);
		System.out.println(a);
		// ���ϰ��� ��¿� ���
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
