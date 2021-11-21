package ctrlStatement;

public class Learnfor {

	public static void main(String[] args) {
		/*
		 * for문은 예제를 통해서 알아보는게 가장 쉽다
		 */

		// 전형적인 for문
		String[] numbers = {"one", "two", "three"};
		for (int i =0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		// for문의 조건은 세미콜론을 구분자로 3 부분으로 나눠진다
		// for (초기치; 조건문; 증가치)
		
		/*	for문의 쓰임새를 알기 위해서 다음을 가정해 보자
		 * "총 5명의 학생이 시험을 보았는데 시험점수가 60점이 넘으면 합격이고 그렇지 않다면 불합격이다.
		 * 합격인지 아닌지에 대한 결과를 보여라"
		 */
		int[] marks = {90,25,67,45,80};
		for (int i=0; i <marks.length;i++) {
			if (marks[i] >= 60) {
				System.out.println((i+1) +"번 통과!");
			} else {
				System.out.println((i+1) +"번 탈락!");
			}
		}
		
		/*	for와 continue
		 * while문에서 알아보았던 continue가 for문에서도 동일하게 작동한다. 즉
		 * for문 안의 문장을 수행하는 도중에 continue를 만나면 for문의 처음으로 돌아가게 된다
		 * 위의 예제에서 60점 이상에게는 축하의 메시지를 보내고 나머지는 응답하지 않는 코드를 짜보자
		 */
		for (int i=1;i<marks.length;i++) {
			if (marks[i] >=60) {
				System.out.println((i+1)+"번 합격 축하");
			} else {
				continue;
			}
		}
		// 중첩 for문으로 구구단을 만들어보자
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.println(i + " x "+j+" 는 "+(i*j)+" 입니다!");
			}
			System.out.println(" ");
		}
	}
}
