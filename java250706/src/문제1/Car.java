package 문제1;

public class Car {
	String brand;
	String model;
	int maxSpeed;
	
	// 자동차 브랜드용 메서드
	public void setBrand(String brand) {
		this.brand = brand;
	}
	// 자동차 모델용 메서드
	public void setModel(String model) {
		this.model = model;
	}
	//자동차 최고속도용 메서드
	public void setMaxSpeed(int maxSpeed) {
		if(maxSpeed > 0) {
			this.maxSpeed = maxSpeed;
		} else {
			System.out.println("속도는 양의 정수");
		}
	}
	// 자동차 정보출력 메서드
	public void printInfo( ) {
		System.out.println("브랜드 : " + brand);
		System.out.println("모델 : " + model);
		System.out.println("최고속도 : " + maxSpeed);
	}
}
