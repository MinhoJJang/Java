package Extends;

// 생성자를 특별히 정의하지 않는 경우
// 자바 컴퍼일러가 기본 생성자가 있다고 간주하기 때문에,
// 클래스 다이어그램에서는 기본 생성자를 명시한다.
public class CalcParent {
	public int plus( int x, int y ) {
		return x + y;
	}
	
	public int minus( int x, int y ) {
		return x - y;
	}
}
