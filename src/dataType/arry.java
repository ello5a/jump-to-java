package dataType;

public class arry {

	public static void main(String[] args) {
		// Ȧ���� ������ INT�� �迭
		// �迭�� �ڷ��� Ÿ�� ���� []�� ���δ�
//		int[] odds = {1,3,5,7,9};
		
		// ������ ������ String �迭�� ǥ��
		String[] weeks = {"��","ȭ","��","��","��","��","��"};

		// �迭�� �ڷ����� ������ �ƴ� �ڷ����� �����̴�
		// �迭�� ���̴� �����Ǿ� �ִ�
		
		// �迭�� ���� �ε����� ���ؼ� ������ �� �ִ�
		System.out.println(weeks[3]);
		
		/* �迭�� ����
		 * ���α׷� �ۼ��� �迭�� �����ٸ� �����ȱ��� for������ �迭���� ������
		 * �̷���� �迭�� ���̸�ŭ for ���� ������ ���� �߿��ѵ� �� �迭�� ���̴�
		 * ������ ���� length�� �̿��Ͽ� ���Ѵ�
		 */
		for (int i=0;i<weeks.length;i++) {
			System.out.println(weeks[i]);
		}
		
		// ����� �迭�� ����
//		System.out.println(weeks[7]);  
		// 8��° �迭���� �����Ƿ� ArrayIndexOutOfBoundsException ������ �߻��Ѵ�.
		
	}

}
