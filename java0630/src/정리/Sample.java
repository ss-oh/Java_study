package 정리;

class A { }

class B extends A { }
class C extends A { }

class D extends B { }
class E extends C { }

public class Sample {
	public static void main(String[] args) {

//		자동 형변환 ( 업 캐스팅 )
//		객체의 형변환은 상속관계일 경우만 가능하다.
		B b = new B(); // A클래스를 상속
		C c = new C(); // A클래스를 상속
		D d = new D(); // B클래스를 상속
		E e = new E(); // C클래스를 상속
		
		A ab = b;
		A ac = c;
		A ad = d;
		A ae = e;
		
//		바로 위 부모가 아니더라도 조상격이면 가능함
		B bd = d;
		C ce = e;
		
//		B be = e; 안됨 ( 상속관계가 아님 )
//		C cd = d;
		
		
//		-------------------------------------
		
//		명시적 형변환 ( 다운 캐스팅 )
//		부모형태인 객체를 자식형태로 형변환
		A a = new A();
		
//		하지만 아무때나 가능한게 아니고 업캐스팅이 된 객체만 다운 캐스팅이 가능함
		
//		a변수에 담긴 객체는 업캐스팅이 된적 없으므로 불가능
//		B ba = (B) a; 빨간줄은 안생기지만 실행하면 오류뜸
		
		B bb = new B();
//		업 캐스팅 ( B클래스 형태를 A클래스 형태로 변환 - 자동 형변환 )
		A aa = b;
//		다운 캐스팅 ( A클래스 형태를 B클래스 형태로 변환 - 명시적 형변환 )
		B bbb = (B) aa;
		
	}
}













