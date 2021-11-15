package object;

class Member{
	String name;
	int age;
	
	String getName() {
		return this.name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	int getAge() {
		return this.age;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	void say() {
		System.out.println( getName() );
		System.out.println( getAge() );
	}
	
}


public class Main01 {

	public static void main(String[] args) {
		Member member = new Member();
		//member.say();
		member.setAge(20);
		member.say();
		member.setName("자바학생");
		member.say();
	}

}
















