package 접근제한자1;

public class AnimalMain {
	public static void main(String[] args) {

		Animal cat = new Animal();
		
//		name의 접근제한자가 private이므로 못씀
//		System.out.println(cat.name); 
		
//		name 출력하려면 getName메서드를 호출해서 출력 가능함
//		name을 직접 접근을 못하므로
//		간접적으로 제어가능한 메서드들이 필요함 ( 캡슐화 )
		System.out.println( cat.getName() );
		System.out.println(cat.age);
		
//		protected이므로 사용 가능( 동일 패키지만 가능 )
		cat.gender = "남";
		System.out.println( cat.gender );
		
	}
}











