package object;

class Book{
	String subject;
	String content;
	
	// ������ -> ��ü�� ������ ��, �ڵ����� ����Ǵ� Ư���� �޼���
	// Ư¡ -> �������� ������� �ʴ´�. Ŭ������ �̸��� �����ϴ�
	Book(){
		System.out.println("-----------������ �����-----------------");
		this.subject = "Java �Թ�";
		this.content = "Java�� ��ü���� ����Դϴ�.";
	}
	
	void read() {
		System.out.println("-------------read() �����---------------");
		System.out.println(this.subject);
		System.out.println(this.content);
	}
}

public class Main02 {

	public static void main(String[] args) {
		// BookŬ������ �����ڿ��� ��������� ���� �⺻���� �����ϱ� ������, ��ü�� �����ϴ� �͸�����
		// ��������� �ʱ�ȭ �ȴ�.
		Book book = new Book();
		book.read();
	}

}









