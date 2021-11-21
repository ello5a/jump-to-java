package ctrlStatement;

import java.util.*;

public class LearnForEach {

	public static void main(String[] args) {
		// for each�� J2SE 5.0 ���� �߰��Ǿ���. for each��� Ű���尡 ���� �ִ°� �ƴϰ� ������ for���� �̿��Ѵ�
		/*
		 * ������ ���ǽ� �κ��� ���� �ٸ��� ���� �ٸ� ���� for each��� ���� �ϹǷ� �ڹٿ����� ���� for each�� �̶�� �Ѵ�
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
		
		// for each���� ������ ������ ����
		/*
		 * for (type var: iterate) {
		 * body-of-loop
		 * }
		 * 
		 * �� iterate�� ������ ���� ��ü�̰� iterate ��ü���� �Ѱ��� ���������� var�� ���ԵǾ�
		 * for���� �����ϰ� �ȴ�. iterate�κп� ���� Ÿ���� ������ ���� �� �ִ� ������ �迭 �� ArrayList���� ����
		 * 
		 * ���� ������ ArrayList�� �� ���� �غ���
		 */
		ArrayList<String> numbers2 = new ArrayList<String>();
		numbers2.add("one");
		numbers2.add("two");
		numbers2.add("three");
		numbers2.add("four");
		for (String number2: numbers2) {
			System.out.println(number2);
		}
		// �� for each���� ���� �ݺ�Ƚ���� ��������� �ִ� ���� �Ұ����ϰ� 1���ǽ� ���������� �ݺ��� ��쿡�� ����Ѵ�
		
	}

}
