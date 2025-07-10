package 변수;

public class IntType02 {

	public static void main(String[] args) {
		
		int x = 3;
		int y = 5;
		
		int temp; //임시 보관용 변수
		System.out.println(" X : " + x + " Y : " + y);
		// x와 y에 있는 값을 서로 교환하고 싶음 (x에는 y값을 y에는 x값으로 변경) 
		temp =x;
		x = y;
		y = temp;
		System.out.println(" X : " + x + " Y : " + y);
		

	}

}
