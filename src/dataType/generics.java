package dataType;

import java.util.ArrayList;

public class generics {

	public static void main(String[] args) {
		/*
		 * ���׸����� �ڹ� J2SE 5.0 ���� ���Ե� ����
		 * ���׸��� ������ ���ؼ��� �ٷ�, ����� ���� ��޾���
		 * 
		 * ������ ���� ���� ���׸��� �̴�
		 */
		ArrayList<String> aList = new ArrayList<String>();
		
		// ���׸����� ���ԵǱ� ���� J2SE 1.4 ������ ������ ���� ����ߴ�
		ArrayList bList = new ArrayList();
		
		/*
		 * �ΰ� �ڵ��� �������� ArrayList ��� �ڷ��� Ÿ�� �ٷ� ���� <String> �� ���� ������
		 * �ִ��� �������� �����̴�. ������ ����� <String> �̶�� ���׸��� ǥ������
		 * "ArrayList �ȿ� ���� �� �ִ� �ڷ����� String Ÿ�Ի��̴�"��� ���� �ǹ��Ѵ�
		 * 
		 * ���׸����� ������� ���� bList �� ��츦 ����
		 */
		bList.add("hello");
		bList.add("java");

		String hello = (String) aList.get(0);
		String java = (String) aList.get(1);
		
		/*
		 * ��ó�� ���׸����� ������� ���� ��쿡�� ArrayList �ȿ� �߰��Ǵ� ��ü�� 
		 * Object �ڷ������� �νĵȴ�. Object �ڷ����� ��� ��ü�� ����ϰ� �ִ� ���� �⺻���� 
		 * �ڷ����̴�. ���� ArrayList ��ü�� bList�� ���� ���� ���� ������ �ȵ����� ���� ������ 
		 * ��쿡�� �׻� Object �ڷ������� String �ڷ������� ����ȯ �ؾ��Ѵ�. ���� bList �ȿ��� 
		 * String �̿ܿ� �ٸ� ��ü�� ���� �� �ֱ� ������ �� ��ȯ �������� �߸��� ����ȯ���� ���� 
		 * ������ �߻��� ������ �ִ�
		 */
	}

}
