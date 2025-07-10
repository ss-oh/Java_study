package 제네릭;

//제네릭 
//
//기존 클래스 생성 시 필드들의 자료형은 항상 고정
//제네릭을 사용하면 클래스, 필드, 메서드 전부 고정된 타입을 지정하지 않고
//객체 생성시 매번 다르게 설정할 수 있음
//
//코드의 재사용성이 좀더 올라가긴한다 동적으로 사용하지 않고 유동적으로 사용가능/



public class Student<T> {
	
	String name;
	T score;
	
	public T getScore() {
		return score;
	}
	
	public void setScore(T score) {
		this.score = score;
	}
	
	
}
