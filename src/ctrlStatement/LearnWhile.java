package ctrlStatement;

public class LearnWhile {

	public static void main(String[] args) {
		// �ݺ��ؼ� ������ �����ؾ� �� ��� while ���� ����Ѵ�
		
		/*
		 * ���ǹ��� ���� ���� while�� �Ʒ��� ������� ����ؼ� �����ϰ� �ȴ�
		 * "�� �� ��� �� �Ѿ� ���� ���� ����"�� ������
		 */
		int treeHit = 0;
		while (treeHit <10) {
			treeHit++;
			System.out.println("������" + treeHit + " �� ������ϴ�!");
			if (treeHit == 10) {
				System.out.println("������ �Ѿ�ϴ�!!");
			}
		}

		// ���ѷ���
		/*
		 * �ڹٿ��� ���ѷ����� whlie���� ���ؼ� ���� �� �� �ִ�. �츮�� ����ϴ� ���α׷��� �߿��� �� ���ѷ������ ������
		 * ������� �ʴ� ���α׷��� �ϳ��� ���� ������ ���� ���ȴ�
		 */
//		while (true) {
//			System.out.println("ctrl+c �ƴϸ� ������ ������ while���� �������� �� �ֽ��ϴ�");
//		}
		
		/* while �� ����������
		 * while���� ���ǹ��� ���� ���� ����ؼ� whlie�� ���� ������ �����ϰ� �ȴ�
		 * ������ ������ while���� ���������� ���� ���� ����� �Ǵµ� �� �� break�� ����Ѵ�
		 */
		
		 int coffee = 10;
		 int money = 300;
		 
		 while (money > 0) {
			 System.out.println("���� �޾����� Ŀ�Ǹ� �ݴϴ�");
			 coffee--;
			 System.out.println("���� Ŀ���� ���� "+coffee+"�Դϴ�!");
			 if (coffee == 0) {
				 System.out.println("Ŀ�ǰ� �� ������ϴ�. �ǸŸ� �����մϴ�");
				 break;
			 }
		 }
		 
		 /*	while�� �������� ���ư���
		  * while�� ���� ������ ������ �� � ������ �˻��ؼ� ���ǿ� ���� ���� ��� while���� ���������� ���� �ƴ϶�
		  * �ٽ� while���� �� ó������ ���ư��� �ϰ� ���� ��찡 ���� �� continue�� ����Ѵ�
		  */
		 int a = 0;
		 while (a< 10) {
			 a++;
			 if (a % 2 == 0) {
				 continue;
			 }
			 System.out.println(a);
		 }
		 // ���� �ڵ�� a�� ¦���� �Ǹ� ������� �ʰ� �ٷ� while���� ���ǹ����� ���Ѵ�
	}

}
