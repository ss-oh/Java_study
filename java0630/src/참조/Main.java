package 참조;

public class Main {
	public static void main(String[] args) {
		Counter counter = new Counter();
		Updater updater = new Updater();
		
		System.out.println(counter.count);
		
		// 내용에 의한 참조( Call By Value )
		// counter.count라고 인수 설정해서 메서드로 보내도
		// 메서드 쪽에서는 counter에 있는것은 모름
		// 그냥 0이라는 숫자만 받음
		updater.update( counter.count );
		System.out.println(counter.count);
		
		System.out.println("====================");
		
		// 주소에 의한 참조( Call By Reference )
		// 메서드에 객체 주소를 보냄
		// 메서드에 해당 객체 값을 변경하면 main쪽도 동일한 객체를 가르키므로
		// count변수가 1로 변경된 값이 출력됨
		updater.update(counter);
		System.out.println(counter.count);
		
		
	}
}














