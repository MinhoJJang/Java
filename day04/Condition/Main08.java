package Condition;

public class Main08 {

	public static void main(String[] args) {
		/*
		 * if���� Ȱ��
		 */
		
		// 1. ���� 3000�� �̻��� ���� ������ ������ �ýø� Ÿ��, �׷��� ������ �ɾ��
		int money = 2500;
		if( money >= 3000 ) {
			System.out.println("�ýø� Ÿ�� ����");
		} else {
			System.out.println("�ɾ� ����");
		}
		
		
		System.out.println("-----------------------------");
		// 2. ���� ���� 3000�� �̻� �ְų�, ī�尡 �ִٸ� �ýø� Ÿ��, �׷��� ������ �ɾ��
		int money1 = 1500;
		boolean hasCard = false;
		if( money1 >= 3000 || hasCard ) {
			System.out.println("�ýø� Ÿ����");
		} else {
			System.out.println("�ɾ��");
		}
		
		if( money1 >= 3000 ) {
			System.out.println("�ýø� Ÿ����");
		} else if( hasCard ){
			System.out.println("�ýø� Ÿ����");
		} else {
			System.out.println("�ɾ��");
		}
		
		if( money1 >= 3000 ) {
			System.out.println("�ýø� Ÿ����");
		} else {
			if(hasCard) {
				System.out.println("�ýø� Ÿ����");				
			} else {
				System.out.println("�ɾ� ����");
			}
		}
		
		System.out.println("-----------------------------");
		// 3. � Ư�� ������ a�� ¦���� "¦��", Ȧ���� "Ȧ��"�� ����϶�
		int a = 5;
		if( a%2 == 0 ) {	// ¦��
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}
		
		System.out.println("-----------------------------");
		// 4. � Ư�� ���δٸ� ������ a1,b1,c1�� �ִ밪�� ���Ͽ���
		int a1 = 100, b1 = 20, c1 = 90;
		int max = 0;
		
		if(a1 > b1 && a1 > c1) {
			max = a1;
		} else {
			if( b1 > c1) {
				max = b1;
			} else {
				max = c1;
			}
		}
		System.out.println("�ִ밪�� : " + max);
	}

}




