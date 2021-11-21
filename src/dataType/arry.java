package dataType;

public class arry {

	public static void main(String[] args) {
		// 홀수의 집합인 INT형 배열
		// 배열은 자료형 타입 옆에 []를 붙인다
//		int[] odds = {1,3,5,7,9};
		
		// 요일의 집합을 String 배열로 표현
		String[] weeks = {"월","화","수","목","금","토","일"};

		// 배열은 자료형의 종류가 아닌 자료형의 집합이다
		// 배열의 길이는 고정되어 있다
		
		// 배열의 값은 인덱싱을 통해서 접근할 수 있다
		System.out.println(weeks[3]);
		
		/* 배열의 길이
		 * 프로그램 작성시 배열이 만들어젔다면 십중팔구는 for문으로 배열값을 돌린다
		 * 이런경우 배열의 길이만큼 for 문을 돌리는 것이 중요한데 이 배열의 길이는
		 * 다음과 같이 length를 이용하여 구한다
		 */
		for (int i=0;i<weeks.length;i++) {
			System.out.println(weeks[i]);
		}
		
		// 빈번한 배열의 오류
//		System.out.println(weeks[7]);  
		// 8번째 배열값이 없으므로 ArrayIndexOutOfBoundsException 오류가 발생한다.
		
	}

}
