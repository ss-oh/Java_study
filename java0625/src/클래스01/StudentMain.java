package 클래스01;

public class StudentMain {

	public static void main(String[] args) {
		// Student클래스를 이용해서
		// 학생 3명의 객체를 생성하고
		// 각각의 정보를 설정 함
		// 그리고 정보를 출력하는 showInfo라는 메서드를 구현한 뒤
		// 화면에 학생정보들을 출력
		
		Student people1 = new Student();
		Student people2 = new Student();
		Student people3 = new Student();
		
		
		people1.name = "김자바";
		people1.kor = 12;
		people1.eng = 8;
		people1.math = 5;
		
		people2.name = "이코딩";
		people2.kor = 70;
		people2.eng = 43;
		people2.math = 12;
		
		people3.name = "최메서드";
		people3.kor = 99;
		people3.eng = 98;
		people3.math = 100;
		
		people1.showInfo();
		people2.showInfo();
		people3.showInfo();
		
		int people1_sum = people1.sum();
		int people2_sum = people2.sum();
		int people3_sum = people3.sum();
		//여기에는 각 합계가 얼마인지 모름
		
		//합계들의 평균
		//합계는 메서드로 처리
		//평균은 여기서 직접 계산
		double avg = (people1_sum + people2_sum + people3_sum)/3.0;
		System.out.println("합계들의 평균 : " + avg);
	
		//합계를 기준으로 상, 중, 하를 출력
		//250 이상이면 상, 200이상이면 중, 나머지는 하
		people1.printGrade(people1_sum);
		people2.printGrade(people2_sum);
		people3.printGrade(people3_sum);

	}

}
