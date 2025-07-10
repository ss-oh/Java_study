package 컬랙션;

import java.util.Arrays;
import java.util.HashSet;

public class SetSample01 {

	public static void main(String[] args) {
		// Set 652p.
		// 중복 내용 불가능
		// 순서가 없음
		// 중복제거용으로 사용하기도함 list에 있는걸 Set으로 바꿔서 중복을 제거하는 용으로 
		
		HashSet<String> set = new HashSet<>();
		
		set.add("홍길동");
		set.add("고길동");
		set.add("김자바");
		set.add("고길동"); // 중복 객체이므로 저장하지않음
		
		set.addAll(Arrays.asList("파이썬","JS","고길동"));
		
		set.remove("파이썬");

		
		System.out.println(set);
	}

}
