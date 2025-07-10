package 형변환;

public class Main {
	public static void main(String[] args) {
		
		Parent p = new Parent();
		Child c = new Child();
		
		c.name = "홍길동";
		c.age = 20;
		
//		자동 형변환 - 업 캐스팅
		Parent p2 = c;
		
		p2.name = "고길동";
//		p2.age = 30;
		
		p2.showInfo();
		
//		명시적 형변환 - 다운 캐스팅
		Child c2 = (Child) p2;
		
		c2.age = 30;
		
		c2.showInfo();
		
		
//		관계 여부 확인( 해당 객체가 클래스의 인스턴스인지 아닌지 알려줌 )
		
		System.out.println( c2 instanceof Child );
		System.out.println( p2 instanceof Parent);
		System.out.println("================");
		
		System.out.println( p2 instanceof Child );
		System.out.println( p instanceof Child );
	
		System.out.println("================");
		
//		Parent p3 = new Parent();
//		Child c3 = (Child) p3;
//		
//		System.out.println( c3 instanceof Parent );
		
		Child c4 = new Child();
		System.out.println( c4 instanceof Parent );
		
		System.out.println( c4 instanceof Object );
		
	}
}








