package ctrlStatement;

public class Learnfor {

	public static void main(String[] args) {
		/*
		 * for���� ������ ���ؼ� �˾ƺ��°� ���� ����
		 */

		// �������� for��
		String[] numbers = {"one", "two", "three"};
		for (int i =0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		// for���� ������ �����ݷ��� �����ڷ� 3 �κ����� ��������
		// for (�ʱ�ġ; ���ǹ�; ����ġ)
		
		/*	for���� ���ӻ��� �˱� ���ؼ� ������ ������ ����
		 * "�� 5���� �л��� ������ ���Ҵµ� ���������� 60���� ������ �հ��̰� �׷��� �ʴٸ� ���հ��̴�.
		 * �հ����� �ƴ����� ���� ����� ������"
		 */
		int[] marks = {90,25,67,45,80};
		for (int i=0; i <marks.length;i++) {
			if (marks[i] >= 60) {
				System.out.println((i+1) +"�� ���!");
			} else {
				System.out.println((i+1) +"�� Ż��!");
			}
		}
		
		/*	for�� continue
		 * while������ �˾ƺ��Ҵ� continue�� for�������� �����ϰ� �۵��Ѵ�. ��
		 * for�� ���� ������ �����ϴ� ���߿� continue�� ������ for���� ó������ ���ư��� �ȴ�
		 * ���� �������� 60�� �̻󿡰Դ� ������ �޽����� ������ �������� �������� �ʴ� �ڵ带 ¥����
		 */
		for (int i=1;i<marks.length;i++) {
			if (marks[i] >=60) {
				System.out.println((i+1)+"�� �հ� ����");
			} else {
				continue;
			}
		}
		// ��ø for������ �������� ������
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.println(i + " x "+j+" �� "+(i*j)+" �Դϴ�!");
			}
			System.out.println(" ");
		}
	}
}
