package object;

class HelloWorld{
	String message;
	
	void sayHello() {
		System.out.println( message );
	}
	void setEng() {
		message = "Hello Java";
	}
	void setKor() {
		message = "�ȳ��ϼ���, �ڹ�";
	}
}

public class Main02 {

	public static void main(String[] args) {
		HelloWorld hello = new HelloWorld();
		
		// �޼��� ȣ��
		hello.setKor();
		hello.sayHello();
		hello.setEng();
		hello.sayHello();
		
		hello.setKor();
		hello.sayHello();
		
	}

}













