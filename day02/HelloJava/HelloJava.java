package HelloJava;

/*
 * 소스는 블록간의 중첩으로 구성된다.
 * 하나의 블록 = "{ ... }"
 * 블록안에 명시되는 명령어는 세미콜론(;)으로 문장의 끝을 표현한다.
 * ------------------------------------------------
 * 프로그램 소스의 최소 단위(=class)를 명시하는 블록
 * --> public class 클래스이름
 * 클래스 이름은 소스파일의 이름과 동일해야 하며, 영어/숫자/언더바(_)/달러($)만 사용이 가능하다.
 * 첫 글자는 반드시 영어로만 구성되어야 한다.
 */

// 자바 프로그램의 최소 단위 = 클래스, 클래스의 범위를 지정하는 블록
public class HelloJava {	// public class 파일이름

	// 프로그램의 시작점을 지정하는 블록
	// -> main 메서드라고 한다.
	public static void main(String[] args) {
		
		// 괄호 안의 내용을 Console창에 출력하는 명령어
		// 콘솔에 문장을 출력하기 위한 명령어
		// 문장을 표현하는 방법 -> 쌍따옴표로 묶는다. -> 문자열
		System.out.println("Hello Java!!");
		System.out.println("Java Class");
		System.out.println();
	}
	
}









