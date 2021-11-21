package ctrlStatement;

public class LearnSwitchCase {
	public static void main(String[] args) {
		/*
		 * switch case 문은 if문과 비슷하지만 좀 더 정형화된 모습의 제어문이다
		 * 
		 * 입력변수의 값과 일치하는 case 입력값이 있다면 해당 case문 하위의 문장이 실행된다
		 * case문마다 break라는 문장이 있는데 해당 case문을 실행한 뒤 switch문을 빠저나가기 위한 것이다
		 * 만약 break문이 빠저있다면 그 다음의 case 문이 실행되게 한다
		 */
		int month = 8;
		String monthString = "";
		
		switch (month) {
			case 1: monthString = "January";
				break;
			case 2: monthString = "February";
				break;
			case 3: monthString = "March";
				break;
			case 4: monthString = "April";
				break;
			case 5: monthString = "May";
				break;
			case 6: monthString = "June";
			break;
			case 7: monthString = "July";
			break;
			case 8: monthString = "August";
			break;
			case 9: monthString = "September";
			break;
			case 10: monthString = "October";
			break;
			case 11: monthString = "November";
			break;
			case 12: monthString = "December";
			break;
			default: monthString = "Invalid month";
			break;
			}
		System.out.println(monthString);
	}
}
