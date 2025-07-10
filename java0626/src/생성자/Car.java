package 생성자;


// 객체를 생성할 때 자동으로 실행되는 메서드
// 생성자는 클래스와 이름이 동일하게 지정, 리턴타입도 설정하지 않는다
// 위 두개를 제외한 나머지는 메서드와 동일하다.
// 생성자든 메서드든 여러개 만들 수 있음 
// 즉, 이름이 같이도 여러개 가능함

// 생성자(메서그) 오버로딩 
// 매개변수의 개수가 다르면 괜찮음
// 매개변수의 개수는 같지만 자료형이 다르면 괜찮음

// 리턴타입이 달라도 괜찮음

public class Car {
	
	String model;
	String color;
	int price;
	
	public Car(String model, String color, int price) {
		this.model = model;
		this.color = color;
		this.price = price;
		
	}
//	
	

	Car(int price, String color, String model){
		System.out.println("aaaa");
	}
	
	Car(){
		System.out.println("생성자 호출");
		color = "검정";
	}
	
//	Car(String model, String color, int price){
//		this.model = model;
//		this.color = color;
//		this.price = price;
//	}
	
	public void showInfo() {
		System.out.println(model);
		System.out.println(color);
		System.out.println(price);
	}
	
}
