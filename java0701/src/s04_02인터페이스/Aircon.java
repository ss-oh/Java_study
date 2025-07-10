package s04_02인터페이스;

public interface Aircon {

//	인터페이스는 final static이 생략된다
//	즉 상수로 지정됨
	int MAX_TEMP = 30;
	int MIN_TEMP = 0;
	
	public void airconON();
	public int setAirconTemp(int temp);
	
	
	public default void printInfo() {
		System.out.println("aaaa");
	}
	
	public static void test() {
		System.out.println("aaaaa");
	}
	
}







