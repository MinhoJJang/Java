package Loop;

public class Main11 {

	public static void main(String[] args) {
		// point 70���� ũ��, 80���� �۰ų� ������ C
		// 77 ũ�� -> C+, 74���� ũ�� 77���� �۰ų� ������ -> C0, 74������ ������  -> C-
		int point = 71;
		
		if( point > 70 && point <= 80 ) {
			if( point > 77 ) {
				System.out.println("C+ �Դϴ�.");
			} else if( point < 74 ) {
				System.out.println("C- �Դϴ�.");
			} else {
				System.out.println("C0 �Դϴ�.");
			}
		} else {
			System.out.println("������ ������ϴ�.");
		}
		
		
		
	}

}
