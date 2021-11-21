package dataType;

import java.util.ArrayList;

public class generics {

	public static void main(String[] args) {
		/*
		 * 제네릭스는 자바 J2SE 5.0 이후 도입된 개념
		 * 제네릭스 사용법에 대해서만 다룸, 만드는 법은 언급안함
		 * 
		 * 다음과 같은 것이 제네릭스 이다
		 */
		ArrayList<String> aList = new ArrayList<String>();
		
		// 제네릭스가 도입되기 전인 J2SE 1.4 까지는 다음과 같이 사용했다
		ArrayList bList = new ArrayList();
		
		/*
		 * 두개 코드의 차이점은 ArrayList 라는 자료형 타입 바로 옆에 <String> 과 같은 문구가
		 * 있느냐 없느냐의 차이이다. 위에서 사용한 <String> 이라는 제네릭스 표현식은
		 * "ArrayList 안에 담을 수 있는 자료형은 String 타입뿐이다"라는 것을 의미한다
		 * 
		 * 제네릭스를 사용하지 않은 bList 의 경우를 보자
		 */
		bList.add("hello");
		bList.add("java");

		String hello = (String) aList.get(0);
		String java = (String) aList.get(1);
		
		/*
		 * 위처럼 제네릭스를 사용하지 않을 경우에는 ArrayList 안에 추가되는 객체는 
		 * Object 자료형으로 인식된다. Object 자료형은 모든 객체가 상속하고 있는 가장 기본적인 
		 * 자료형이다. 따라서 ArrayList 객체인 bList에 값을 넣을 때는 문제가 안되지만 값을 가져올 
		 * 경우에는 항상 Object 자료형에서 String 자료형으로 형변환 해야한다. 또한 bList 안에는 
		 * String 이외에 다른 객체도 넣을 수 있기 때문에 형 변환 과정에서 잘못된 형변환으로 인한 
		 * 오류가 발생할 소지가 있다
		 */
	}

}
