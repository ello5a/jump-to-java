package dataType;

import java.util.ArrayList;

public class list {

	public static void main(String[] args) {
		/*
		 * 동적으로 자료형의 갯수가 가변하는 상황이라면 List를 사용하는것이 유리하다
		 * List 자료형 중 가장 간단한 형태인 ArrayList에 대해 알아보자
		 */

		/*
		 * List 자료형에는 ArrayList, LinkedList 등의 List 인터페이스를 구현한 자료형이 있다
		 * 여기서 말하는 List 자로형은 인터페이스인데 이는 나중에 알아보자
		 * ArrayList를 사용할 땐 <> 안에 자료형을 명시하길 귄장한다
		 */
		// add 라는 메소드를 이용하여 투구 스피드를 저장했다
		ArrayList<String> pitches = new ArrayList();
		pitches.add("138");
		pitches.add("129");
		pitches.add("142");
		// 특정 위치에 삽입하고 싶다면 다음과 같이 코딩한다
		pitches.add(0,"142");
		
		// get 메서드를 사용하여 투구 스피드를 알수있다
		System.out.println(pitches.get(1));
		
		// size 메서드는 ArrayList의 갯수를 리턴한다
		System.out.println(pitches.size());
		
		// contains 메서드는 리스트 안에 항목값이 있는지를 판별하여 결과를 boolean으로 리턴
		System.out.println(pitches.contains("142")); //true
		System.out.println(pitches.contains("444")); //false
		
		/* remove 메서드에는 2가지 방식이 있다 (이름은 같지만 입력 파라미터가 다르다)
		 * 1. remove(객체)
		 * 2. remove(인덱스)
		 * 
		 * remove(객체)의 경우 리스트에서 객체에 해당되는 항목을 삭제하고 삭제한 결과를 리턴한다
		 */
		System.out.println(pitches.remove("129"));
		
		// remove(인덱스)의 경우 해당 인덱스의 항목을 삭제하고 삭제된 항목을 리턴한다
		System.out.println(pitches.remove(1));
	}
}
