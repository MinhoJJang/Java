package hiding;
// JavaBeans
class Student{
	// ���е� ������� -> ���� ��� �ȿ����� ���� ������
	private String name;
	private int age;
	
	// ���е� ��������� ���� �ִ� ��� -> �޼��带 ���, setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	// ���е� ��������� ���� �д� ��� -> getter
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
}

public class Main02 {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Java�л�");
		s.setAge(25);
		
		String name = s.getName();
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + s.getAge() );
		
	}

}















