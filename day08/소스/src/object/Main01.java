package object;

class Charactor{
	// �Ϲ������� ��������� ���� �Ѵ�.
	String name;
	int age;
}

public class Main01 {

	public static void main(String[] args) {
		Charactor d = new Charactor();
		d.name = "�Ѹ�";
		d.age = 19;
		
		Charactor h = new Charactor();
		h.name = "��";
		h.age = 3;
		
		System.out.println("�̸� : " + d.name + ", ���� : " + d.age);
		System.out.println("�̸� : " + h.name + ", ���� : " + h.age);
		
		
		
	}

}
