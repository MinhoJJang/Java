package Hiding;

/*
 * �ϳ��� �ҽ����Ͽ��� �ϳ��� public Ŭ������ ������ �� �ֱ� ������,
 * Member Ŭ������ �ٸ� ���Ϸ� ������ ���Ҵ�.
 */
public class Main01 {

	public static void main(String[] args) {
		Member s = new Member("�ڹ��л�", 20);
		
		String name = s.getName();
		System.out.println("�̸� : " + name);
		
		System.out.println("���� : " + s.getAge());
	}

}










