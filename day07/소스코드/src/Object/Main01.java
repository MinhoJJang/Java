package Object;

class Student{
	// ��������� ���� + �Ҵ�
	String name = "�ڹ��л�";
	int age = 19;
}

public class Main01 {

	public static void main(String[] args) {
		// ��ü�� ����� �Ҵ��� �и�
		Student std;			// ��ü����
		std = new Student();	// �Ҵ�
		
		// ��ü�� ����(�ϰ�����)
		Student std2 = new Student();
		
		System.out.println("�̸� : " +  std.name);
		System.out.println("���� : " +  std.age);
		
		System.out.println("�̸�2 : " +  std2.name);
		System.out.println("����2 : " +  std2.age);
		System.out.println("=========================");
		
		std2.name = "��ü�л�";
		std2.age = 25;
		
		System.out.println("�̸�2 : " +  std2.name);
		System.out.println("����2 : " +  std2.age);
		
		System.out.println("�̸� : " +  std.name);
		System.out.println("���� : " +  std.age);
		
	}

}















