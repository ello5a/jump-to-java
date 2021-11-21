package oop;

import java.util.Iterator;

public class animal {
	/*클래스 특성상 public static void main 메서드부터 시작..한다(순서가 꼬여있다는 뜻)
	 * 
	 * 	객체 변수 (Instance variable)
	 * Animal 이라는 껍데기 클래스를 조금 더 발전시켜 보자 Animal 클래스에 의해 만들어지는 동물들의 이름을 지어보자
	 * 
	 */
	String name;
	/*
	 * animal 클래스에 name이라는 String 변수를 추가했다. 이렇게 클래스에 선언된 변수를 객체 변수라고 부른다.
	 * 또는 인스턴스 변수, 멤버 변수, 속성이라고도 한다
	 * 	 * 클래스에 의해 생성되는 것은 객체, 그리고 그 클래스에 선언된 변수는 객체 변수라고 생각하면 쉽다
	 * 
	 * 객체 변수를 만들었으니 이제 객체 변수를 사용해 보도록 하자. 먼저 객체 변수는 변수어 이므로 값을 대입할 수 있을 것이다
	 * 대입하기 전에 객체 변수는 현재 어떤 값을 가지고 있는지 먼저 출력해 보도록 하자..
	 * 
	 * 객체 변수를 출력하려면 객체 변수에 어떻게 접근해야 하는지를 먼저 알아야 한다
	 * 
	 * 객체 변수는 다음과 같이 도트연산자를 이용해서 접근할 수 있다
	 * 
	 */
	
	/*	메서드
	 * 이제 객체변수에 접근하는 방법과 null에 대해서 알게되었다 이제 객체 변수에 값을 대입하는 것을 알아보자
	 * 
	 * 객체 변수에 값을 대입하는 방법에는 여러가지가 있을 수 있지만 여기서는 가장 보편적인 방법인 메서드를 이용해보려고한다
	 * 클래스에는 객체 변수와 더불어 메서드라는 것이 있다. 메서드는 클래스 내에 구현된 함수를 의미하는데
	 * 보통 함수라고 말하지 않고 메서드라고 한다
	 * 이제 메서드를 활용하여 animal 클래스의 객체 변수인 name에 값을 대입해보자
	 * .. setName메서드를 추가하자
	 */
	public void setName(String name) {
		this.name = name;
	}
	/*	setName메서드는 다음과 같은 형태이다
	 * 입력:String name
	 * 출력:void(리턴이 없다)
	 * 
	 * 즉 입력으로 문자열인 name을 받지만 출력은 없는 형태이다. 메서드의 입출력에 관한 내용은 다음챕터에 있다..
	 * 
	 * this.name = name;
	 * 여기서 this에 대해서 이해하는게 매우매우 중요하다. 일단 설명은 잠시 보류하고 이 메서드를 호출하는 방법에 대해서 알아보자
	 * 객체.변수로 도트연산자에 접근할 수 있드시 객체가 메서드를 호출할때는 객체.메서드 로 호출할 수 있다
	 * 즉 cat.setName("navi"); 이렇게 호출한다
	 * 
	 * 다시 this.name = name; 을 확인해보자
	 * main 메서드에서 cat.setName("navi"); 와 같이 "navi"라는 입력값으로 setNumber 메서드를 호출했기 때문에
	 * setNumber함수의 입력항목 name에는 "navi"라는 문자열이 전달된다
	 * 이는 곧 this.name = "navi"; 와 같다
	 * 
	 * setName 메서드 내부에 사용된 this는 animal 클래스에 의해 생성된 객체를 지칭한다. 만약 animal cat = new animal()
	 * 과 같이 cat이라는 객체를 만들고 cat.setName("navi")와 같이 cat객체에 의해 setName을 호출하면
	 * setName메서드 내부에 선언된 this는 바로 cat 객체를 지칭하게 된다
	 * 
	 * 만약 Animal dog = new Animal()로 dog 객체를 만든후 dog.setName("tang")과 같이 호출하면 setName 메서드 내부에
	 * 선언된 this는 dog 객체를 가르키게 된다
	 * 
	 * 이제 다시 this.name = "navi"; 문장은 다음과 같이 해석된다
	 * cat.name = "navi";
	 * 
	 * cat.name 에 값을 넣으면 객체 변수에 접근할 수 있음을 알았다. 객체 변수에 값을 대입하는 방법은 아주 간단하다
	 * 그냥 변수에 값을 대입하는 것과 마찬가지 방법이다
	 * 객체.객체변수 = 값;
	 * 
	 * 객체 변수는 공유되지 않는다
	 */
	public static void main(String[] args) {

		// 객체는 다음과 같이 만들 수 있다

		animal cat = new animal();

		// new는 객체를 생성할 때 사용하는 키워드이다. 이렇게 하면 animal 클래스의 인스턴스인 cat, animal의 객체가 만들어진다
		/*
		 * 객체와 인스턴스
		 * 클래스에 의해서 만들어진 객체를 인스턴스라고 한다 그렇다면 객체와 인스턴스의 차이는 무엇일까
		 * 이렇게 생각해보자 Animal cat = new Animal() 이렇게 만들어진 cat은 객체이다
		 * 그리고 cat이라는 객체는 Animal의 인스턴스이다 즉 인스턴스라는 말은 특정 객체가 어떤 클래스의 객체인지를
		 * 관계위주로 설명할 때 사용된다. 그럼 올바른 표현을 알아보자
		 * "cat은 인스턴스" X,  "cat은 객체" O
		 * "cat은 animal의 객체" X, "cat은 animal의 인스턴스" O 
		 * 
		 * 클래스를 좀더 생각해보자
		 * 
		 * 과자틀 -> 클래스
		 * 과자틀에 의해서 만들어진 과자 -> 객체
		 * 즉 다음과 같이 무수히 많은 동물 객체(cat, dog, horse,..)들을 animal 클래스로 만들 수 있는 것이다
		 */
		animal dog = new animal();
		animal horse = new animal();

		System.out.println(cat.name);
		cat.setName("navi");
		System.out.println(cat.name);
		dog.setName("tang");
		/*
		 * cat과 dog 객체에 각각 이름을 대입했다
		 * 이럴 경우 setName 메서드에 의해 다음과 같은 문장이 실행될것이다
		 * cat.name = "navi"; 뭐 이런식
		 * 
		 * 이럴경우 dog.name = "tang" 이라는 문장이 나중에 수행되므로 cat.name의 값도 tang으로 변경되지 않을까?
		 * 
		 * animal 클래스의 객체변수 name이 cat객체와 dog객체간 서로 공유되는 변수라면 그럴것이다. 하지만...
		 * 
		 * 클래스에서 가장 중요한 부분은 이 '객체 변수'의 값이 독립적으로 유지된다는 점이다.
		 * 사실 이점이 바로 클래스의 존재의 이유이기도 하다.
		 * 객체 지향적 이라는 말의 의미도 결국 이 객체 변수의 값이 독립적으로 유지되기 때문에 가능한 것이다.
		 * (참고로 객체 변수의 값은 공유되지 않지만 나중에 알게될 static을 이용하게 되면 객체 변수를 공유하도록 만들 수 있다
		 */
		// 알게된 내용 클래스(class) 객체(object) 메서드(method)
	}

}
