package 컬랙션;

import java.util.HashMap;
import java.util.Map;

public class MapSample {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();  //  HsahMap<키(Key),벨류(Value)>
		
		map.put("홍길동", 20);
		map.put("고길동", 30);
		map.put("김자바", 20);
		map.put("고길동", 100); // 중복된 키 이므로 기존 데이터(벨류) 사라짐

		
		System.out.println(map);
		
		System.out.println(map.keySet());
		
		for(String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		
		System.out.println(map.entrySet());
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			
			System.out.println(key + " : " + value);
		}
		
		map.forEach((key,value) -> {
			System.out.println( key + " : " + value);
		});
		
	}

}
