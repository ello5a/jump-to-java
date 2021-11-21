package dataType;

import java.util.ArrayList;

public class list {

	public static void main(String[] args) {
		/*
		 * �������� �ڷ����� ������ �����ϴ� ��Ȳ�̶�� List�� ����ϴ°��� �����ϴ�
		 * List �ڷ��� �� ���� ������ ������ ArrayList�� ���� �˾ƺ���
		 */

		/*
		 * List �ڷ������� ArrayList, LinkedList ���� List �������̽��� ������ �ڷ����� �ִ�
		 * ���⼭ ���ϴ� List �ڷ����� �������̽��ε� �̴� ���߿� �˾ƺ���
		 * ArrayList�� ����� �� <> �ȿ� �ڷ����� ����ϱ� �����Ѵ�
		 */
		// add ��� �޼ҵ带 �̿��Ͽ� ���� ���ǵ带 �����ߴ�
		ArrayList<String> pitches = new ArrayList();
		pitches.add("138");
		pitches.add("129");
		pitches.add("142");
		// Ư�� ��ġ�� �����ϰ� �ʹٸ� ������ ���� �ڵ��Ѵ�
		pitches.add(0,"142");
		
		// get �޼��带 ����Ͽ� ���� ���ǵ带 �˼��ִ�
		System.out.println(pitches.get(1));
		
		// size �޼���� ArrayList�� ������ �����Ѵ�
		System.out.println(pitches.size());
		
		// contains �޼���� ����Ʈ �ȿ� �׸��� �ִ����� �Ǻ��Ͽ� ����� boolean���� ����
		System.out.println(pitches.contains("142")); //true
		System.out.println(pitches.contains("444")); //false
		
		/* remove �޼��忡�� 2���� ����� �ִ� (�̸��� ������ �Է� �Ķ���Ͱ� �ٸ���)
		 * 1. remove(��ü)
		 * 2. remove(�ε���)
		 * 
		 * remove(��ü)�� ��� ����Ʈ���� ��ü�� �ش�Ǵ� �׸��� �����ϰ� ������ ����� �����Ѵ�
		 */
		System.out.println(pitches.remove("129"));
		
		// remove(�ε���)�� ��� �ش� �ε����� �׸��� �����ϰ� ������ �׸��� �����Ѵ�
		System.out.println(pitches.remove(1));
	}
}
