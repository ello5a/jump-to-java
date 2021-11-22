package oop;

public class dog extends animal {
	/* 상속에 대한 설명입니다 animal-> test -> dog 순서로 보면됩니다
	 * 클래스 상속을 위해서는 extends 라는 키워드를 사용한다
	 * 자식클래스 extends 부모클래스
	 * 
	 * dog 클래스에 name이라는 객체변수와 setName 이라는 메서드를 만들지 않았지만 animal클래스를 상속을 받았기 때문에
	 * 그대로 사용이 가능하다. dog클래스에 다음과 같은 main메서드를 구현하고 실행시켜보자
	 */
	public dog() {
		
	}
	public void sleep() {
		System.out.println(this.name+" zzz");
	}

	public static void main(String[] args) {
		dog Dog = new dog();
		Dog.setName("tang");
		System.out.println(Dog.name);
		Dog.sleep();
		
		/* dog클래스는 animal클래스를 상속받았다. 즉 animal의 하위 개념으로 dog는 animal에 포함되기 때문에
		 * "개는 동물이다"라고 표현할 수 있다
		 * 자바는 이런 관계를 Is a 라고하는데 "dog is a animal" 과 같은 관계를 말한다
		 * 이렇게 Is-a 관계에 있을 때 자식 객체는 부모 클래스의 자료형인 것처럼 사용할 수 있다
		 * 즉 animal dog = new dog(); 이런식으로
		 * 하지만 반대의 경우는 안된다
		 * .. 좀더 개념적으로 살펴보자
		 * animal dog = new dog();
		 * 위의 코드를 읽어보면 `개로 만들어진 객체는 동물 자로형이다` 라고 읽을 수 있다
		 * dog dog = new animal();
		 * 이건 뭐 동물로 만들어진 객체는 개 자료형이다(?) 동물로 만든 객체가 고양이일수도 있고 뭐 그런건데
		 */
		
	}
}
