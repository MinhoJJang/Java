package hiding;

class Foo{
	public String name = "자바학생";
	private int weight = 50;	
}

public class Main01 {

	public static void main(String[] args) {
		Foo obj = new Foo();
		
		// public 이므로 접근 가능
		System.out.println( obj.name );
		
		// private 이므로 접근 불가능
		//System.out.println( obj.weight );
	}

}
