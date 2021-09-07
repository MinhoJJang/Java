package Loop;

public class Main11 {

	public static void main(String[] args) {
		// point 70보다 크고, 80보다 작거나 같으면 C
		// 77 크면 -> C+, 74보다 크고 77보다 작거나 같으면 -> C0, 74점보다 작으면  -> C-
		int point = 71;
		
		if( point > 70 && point <= 80 ) {
			if( point > 77 ) {
				System.out.println("C+ 입니다.");
			} else if( point < 74 ) {
				System.out.println("C- 입니다.");
			} else {
				System.out.println("C0 입니다.");
			}
		} else {
			System.out.println("범위를 벗어났습니다.");
		}
		
		
		
	}

}
