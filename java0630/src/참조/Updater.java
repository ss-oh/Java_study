package 참조;

public class Updater {

	//메서드 오버로딩
	public void update(int count) {
		count++;
	}
	
	public void update(Counter counter) {
		counter.count++;
	}
	
}
