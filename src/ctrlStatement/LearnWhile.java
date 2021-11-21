package ctrlStatement;

public class LearnWhile {

	public static void main(String[] args) {
		// 반복해서 문장을 수행해야 할 경우 while 문을 사용한다
		
		/*
		 * 조건문이 참인 동안 while문 아래의 문장들을 계속해서 수행하게 된다
		 * "열 번 찍어 안 넘어 가는 나무 없다"를 만들어보자
		 */
		int treeHit = 0;
		while (treeHit <10) {
			treeHit++;
			System.out.println("나무를" + treeHit + " 번 찍었습니다!");
			if (treeHit == 10) {
				System.out.println("나무가 넘어갑니다!!");
			}
		}

		// 무한루프
		/*
		 * 자바에서 무한루프는 whlie문을 통해서 구현 할 수 있다. 우리가 사용하는 프로그램들 중에서 이 무한루프라는 개념을
		 * 사용하지 않는 프로그램은 하나도 없을 정도로 자주 사용된다
		 */
//		while (true) {
//			System.out.println("ctrl+c 아니면 중지를 눌러서 while문을 빠저나갈 수 있습니다");
//		}
		
		/* while 문 빠저나가기
		 * while문은 조건문이 참인 동안 계속해서 whlie문 안의 내용을 수행하게 된다
		 * 하지만 강제로 while문을 빠져나오고 싶을 때가 생기게 되는데 이 때 break를 사용한다
		 */
		
		 int coffee = 10;
		 int money = 300;
		 
		 while (money > 0) {
			 System.out.println("돈을 받았으니 커피를 줍니다");
			 coffee--;
			 System.out.println("남은 커피의 양은 "+coffee+"입니다!");
			 if (coffee == 0) {
				 System.out.println("커피가 다 떨어젔습니다. 판매를 중지합니다");
				 break;
			 }
		 }
		 
		 /*	while문 조건으로 돌아가기
		  * while문 안의 문장을 수행할 때 어떤 조건을 검사해서 조건에 맞지 않은 경우 while문을 빠져나가는 것이 아니라
		  * 다시 while문의 맨 처음으로 돌아가게 하고 싶은 경우가 생길 때 continue를 사용한다
		  */
		 int a = 0;
		 while (a< 10) {
			 a++;
			 if (a % 2 == 0) {
				 continue;
			 }
			 System.out.println(a);
		 }
		 // 위의 코드는 a가 짝수가 되면 출력하지 않고 바로 while문의 조건문으로 향한다
	}

}
