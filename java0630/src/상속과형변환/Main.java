package 상속과형변환;

public class Main {
	public static void main(String[] args) {
		
		Animal[] animalList = new Animal[4];
		
//		자동 형변환 ( 업캐스팅 )
		animalList[0] = new Human();
		animalList[1] = new Tiger();
		animalList[2] = new Dog();
		animalList[3] = new Animal();
		
		for( Animal ani : animalList ) {
			ani.move();
		}
		
		
		for( Animal ani : animalList ) {
			
			if( ani instanceof Human ) {
				Human h = (Human) ani;
				h.read();
			} else if( ani instanceof Tiger) {
				Tiger t = (Tiger) ani;
				t.hunt();
			} else if( ani instanceof Dog ) {
				Dog d = (Dog) ani;
				d.run();
			} else {
				System.out.println("없는 자료형");
			}
		
		}
		
		
		
	}
}









