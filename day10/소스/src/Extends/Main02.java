package Extends;

public class Main02 {

	public static void main(String[] args) {
		// ���� �Խ���
		FileArticle file = new FileArticle();
		file.setNum(1);
		file.setTitle("ù ��° �ڷ� �Դϴ�.");
		file.setFileName("java.ppt");
		System.out.println( file.toString() );		
		
		System.out.println("----------------------------");
		// QNA �Խ���
		QNAArticle qna = new QNAArticle();
		qna.setNum(1);
		qna.setTitle("ù ��° �����Դϴ�.");
		qna.setAnswer("ù ��° �亯�Դϴ�.");
		System.out.println( qna.toString() );
		
		
		
	}

}
