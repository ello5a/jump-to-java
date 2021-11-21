package ctrlStatement;

import java.util.ArrayList;

public class LearnIf {

	public static void main(String[] args) {
		/*
		 * 조건문이란 무엇인가
		 * if(조건문)에서 사용되는 조건문이란 참과 거짓을 판단하는 문장을 말한다
		 */
		
		// if와 else를 이용한 기본적인 구조
//		boolean money = true;
//		if(money) {
//		}

		// 비교연산자
		/*
		 * 조건을 판단하는 경우는 자료형보다 비교 연산자(<,>,==,!=)를 쓰는 경우가 훨씬 많다
		 * 
		 */
		int x = 3;
		int y = 2;
		System.out.println(x > y);
		System.out.println(x != y);
		
		// 만약 3000원 이상의 돈을 가지고 있으면 택시를 타고 아니면 걸어가는 경우
		
		int money = 2000;
		
		if (money >= 3000) {
			System.out.println("택시를 타고 가자");
		}else {
			System.out.println("걸어가자");
		}
		
		// 논리 연산자 and, or, not
		
		// x || y x와 y 둘 중 하나가 참이면 참이다
		// x && y x와 y 모두 참이어야 참이다
		// !x x가 거짓이면 참이다
		
		// 돈이 3000이상 있거나 카드가 있다면 택시를 아니면 걸어가
		
		boolean hascard = true;
			
		if (money >= 3000 || hascard) {
			System.out.println("택시타고 가");
		} else {
			System.out.println("걸어가");
		}
		
		/*
		 * contains List 자료형에는 해당 아이템이 있는지 조사하는 contains 메서드가 있다
		 * contains 메서드는 조건문에 많이 활용되는데 어떻게 활용하는지 알아보자 
		 */
		
		// 만약 주머니에 돈이 있다면 택시를, 아니면 걸어가
		
		ArrayList<String> pocket = new ArrayList<String>();
		pocket.add("paper");
		pocket.add("handphone");
		pocket.add("money");
		
		if (pocket.contains("money")) {
			System.out.println("택시타고 가");
		} else {
			System.out.println("걸어가");
		}
		
		/* else if
		 * if 와 else 만을 가지고서는 다양한 조건 판단을 하기 어렵다. 다음과 같은 예만 하더라도
		 * if와 else 만으로는 조건 판단에 어려움을 겪게 된다
		 * 지갑에 돈이 있으면 택시를 타고, 지갑에 돈은 없지만 카드가 있으면 택시를 타고, 돈도없고
		 * 카드도 없으면 걸어가라.
		 * 
		 * if와 else 만으로 위의 문장을 표현하려면 다음과 같다
		 */
		
		if (pocket.contains("money")) {
			System.out.println("택시타고 가");
		} else {
			if (hascard) {
				System.out.println("택시타고 가");
			} else {
				System.out.println("걸어가");
			}
		}
		// 엄청 산만하게 느껴지는 코드를 else if를 이용해서 다중조건 판단을 걸어보자
		if (pocket.contains("money")) {
			System.out.println("택시타고 가");
		} else if (hascard) {
			System.out.println("택시타고 가");
		} else {
			System.out.println("걸어가");
		}
	}

}
