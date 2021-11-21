package oop;

public class houseDog extends dog {
	// 메서드 오버라이딩 dog.java 부터 보고오세요
	
	public void sleep() {
		System.out.println(this.name+" zzz in house");
	}
	public void sleep(int hour) {
		System.out.println(this.name+" zzz in house for " + hour+" hours");
	}
	public static void main(String[] args) {
		houseDog house_dog = new houseDog();
		house_dog.setName("white");
		house_dog.sleep();
		
		/* 만약 집에서 키우는 개들은 잠을 집에서만 잔다고 하면, houseDog 클래스로 만들어진 객체들은 sleep메서드 호출시
		 * white zzz 가 아닌 white zzz in house 를 출력해야 한다고 가정해보자
		 * 
		 * housedog 클래스에 dog 클래스와 동일한 형태(입출력이 같음)의 sleep메서드를 구현하면 집개의 sleep 메서드가
		 * 개의 sleep 메서드보다 더 높은 우선순위를 갖게 되어 집개의 sleep 메서드가 호출되게 한다
		 * 
		 * 이렇게 부모클래스의 메서드를 자식클래스가 동일한 형태로 다시 구현하는 것을 메서드 오버라이딩 이라고 한다(덮어쓰기)
		 * 
		 * 이번에는 public void sleep(int hour) {
		 * 		sysout(this.name+" zzz in house for " + hour+" hours"); } 라는 메서드를 추가해보자
		 * 이미 sleep이라는 메서드가 있지만 동일한 이름의 sleep 메서드를 또 생성할 수 있다.
		 * 단 메서드의 입력항목이 다를경우만 해당함
		 * 
		 * 이렇듯 입력항목이 다른경우 동일한 이름의 메서드를 만들 수 있는데 이걸 고상한 말로 메서드 오버로딩이라고 한다
		 */
		house_dog.sleep(3);
		
		// 자바는 다중 상속이 없다..!
	}
}
