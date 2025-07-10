package 형변환;

public class TypeCast01 {

	public static void main(String[] args) {
		//자동 형변환(묵시적 형변환) - 작은것에서 큰 것은 가능, 반대는 불가능
		byte byteValue = 127;
		int intValue = byteValue;
		
		System.out.println("자동 형변환 : " + intValue);
		
		//강제 형변환(명시적 형변환)
		int intValue2 = 123456;
		byte byteValue2;
		//int형 데이터를 byte에 넣어주려고 함 (큰 것-> 작은 것)
		//작은 type이 담을 수 없는 값일 경우 데이터 손실로 이어짐
		
		byteValue2 = (byte)intValue2;
		System.out.println("강제 형변환 : " + byteValue2);
		
		//문자열과 더해지는 다른 데이터 타입들은 전부 문자열로 처림됨
		String str = "Hi";
		int num = 10;
		
		String result;
		
		result = str + num; // 두개 더한 결과가 문자열이므로 저장할 변수타입도 String
		
		System.out.println(result);
		
		// 숫자끼리 나누기 연산을 할 경우
		//정수끼리 계산한 결과는 무조건 정수
		int num1 = 10;
		int num2 = 3;
		double div;
		
		
		div = (double) num1 / num2;
		
		
		System.out.println("=== 나누기 처리 결과 ===");
		System.out.println(num1 / num2);
		//그래서 출력값이 3
		System.out.println(div);
		
		//계산하는 데이터 중 하나라도 실수면 결과도 실수로 출력됨
		System.out.println(10 / 3);
		System.out.println(10 / 3.0);
		
		
		
		
		

	}

}
