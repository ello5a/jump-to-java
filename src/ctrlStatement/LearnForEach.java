package ctrlStatement;

import java.util.*;

public class LearnForEach {

	public static void main(String[] args) {
		// for each는 J2SE 5.0 부터 추가되었다. for each라는 키워드가 따로 있는건 아니고 동일한 for문을 이용한다
		/*
		 * 하지만 조건식 부분이 조금 다른데 보통 다른 언어에서 for each라고 많이 하므로 자바에서도 보통 for each문 이라고 한다
		 */
		
		// before
		String[] numbers = {"one", "two", "three"};
		for (int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		// after
		for(String number: numbers) {
			System.out.println(number);
		}
		
		// for each문의 구조는 다음과 같다
		/*
		 * for (type var: iterate) {
		 * body-of-loop
		 * }
		 * 
		 * 위 iterate는 루프를 돌릴 객체이고 iterate 객체에서 한개씩 순차적으로 var에 대입되어
		 * for문을 수행하게 된다. iterate부분에 들어가는 타입은 루프를 돌릴 수 있는 형태인 배열 및 ArrayList등이 가능
		 * 
		 * 위의 예제를 ArrayList로 재 구현 해보자
		 */
		ArrayList<String> numbers2 = new ArrayList<String>();
		numbers2.add("one");
		numbers2.add("two");
		numbers2.add("three");
		numbers2.add("four");
		for (String number2: numbers2) {
			System.out.println(number2);
		}
		// 단 for each문은 따로 반복횟수를 명시적으로 주는 것이 불가능하고 1스탭식 순차적으로 반복할 경우에만 사용한다
		
	}

}
