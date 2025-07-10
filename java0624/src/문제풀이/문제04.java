package 문제풀이;

import java.util.Arrays;

public class 문제04 {

	public static void main(String[] args) {
		// 로또 당첨번호 
		
		int[]lotto = new int[6];
		
		
		
		
		for(int i =0; i<lotto.length; i++) {
			lotto[i]= (int)(Math.random()*45)+1;
			
			for(int j=0; j<i; j++) { // <- 중복값제거용 for 문
				
				if(lotto[i] == lotto[j]) {
					//새로 넣은 값이랑 기존 값이랑 같은경우
					//중복된 경우이므로 다시 새로운 값으로 바꿔줘야함
					//바꿨으면 다시 검사해야 함
					i--;
					break;
//					lotto[i] = (int)(Math.random()*6)+1;
//					j= -1;  // <----이렇게 쓸 수도 있다
				}
			}
		}
		// 셀렉션 정렬
		int temp;
		for(int i=0; i<lotto.length-1; i++) {
			
			for(int j =i+1; j<lotto.length; j++) {
				if(lotto[i]>lotto[j]) {
					temp = lotto[i];
					lotto[i] =lotto[j];
					lotto[j]= temp;
				}
			}
		}
		
		System.out.print(Arrays.toString(lotto));
	}

}
