package 컬랙션;

import java.util.List;
import java.util.Vector;

public class VectorSample01 {

	public static void main(String[] args) {
		List<String> list = new Vector<>();
		
		Thread t1 = new Thread() {

			@Override
			public void run() {
				for(int i=1; i<=1000; i++) {
					list.add("내용추가"+i);
				}
			}
			
		};
		
		Thread t2 = new Thread() {

			@Override
			public void run() {
				for(int i=1001; i<=2000; i++) {
					list.add("내용추가"+i);
				}
			}
			
		};
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t1.join();
		} catch(Exception e) {
			
		}
		
		System.out.println(list.size());
		System.out.println(list);
		
		/*	
		 컬렉션이 더 좋으니까 배열을 안씀 ->x
		 컬렉션은 원시데이터 타입을 저장못함 -> 박싱
		 원시타입, 크기 절대 안바꿈 -> 배열
		 여러가지 메서드를 활용해서 관리 -> 컬렉션
		 
		  */

	}

}
