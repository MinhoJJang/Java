package Extends;

public class QNAArticle extends Article {
	private String answer;	// �亯

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public String toString() {
		return "����/�亯 [ �� ��ȣ" + getNum() + 
				" ,  ���� = " + getTitle() + 
				" , �亯 = " + answer + " ] ";
	}
	
	
}
