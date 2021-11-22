package oop;

public class houseDog extends dog {
	// 메서드 오버라이딩 dog.java 부터 보고오세요
	
	public void sleep() {
		System.out.println(this.name+" zzz in house");
	}
	public void sleep(int hour) {
		System.out.println(this.name+" zzz in house for " + hour+" hours");
	}
	public houseDog(String name) {
		this.setName(name);
	}
	/*	생성자의 규칙
	 * 클래스명과 메서드명이 일치한다
	 * 리턴타입을 정의하지 않는다
	 * 
	 * 하나의 클래승 여러개의 입력항목이 다른 생성자를 만들 수 있다
	 */
	public houseDog(int type) {
		if (type == 1) this.setName("yorkshire");
		else if (type == 2) this.setName("bulldog");
	}
	public static void main(String[] args) {
//		houseDog house_dog = new houseDog();
//		house_dog.setName("white");
//		house_dog.sleep();
		
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
//		house_dog.sleep(3);
		
		// 자바는 다중 상속이 없다..!
		
//		houseDog dog = new houseDog();
//		System.out.println(dog.name);
		/* 생성자는 다음과 같이 new라는 키워드가 사용될 때 호출된다
		 *  new 클래스명(입력항목, ..)
		 *  
		 *  위에 만든 생성자는 문자열을 필요로 하는 생성자임
		 */
		houseDog dog = new houseDog("white");
		// new로 객체를 만들 때 생성자의 규칙과 맞지 않으면 오류가 생김
		System.out.println(dog.name);
		houseDog bull = new houseDog(2);
		System.out.println(bull.name);
	}
}
