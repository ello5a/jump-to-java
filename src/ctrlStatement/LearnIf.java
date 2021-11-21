package ctrlStatement;

import java.util.ArrayList;

public class LearnIf {

	public static void main(String[] args) {
		/*
		 * ���ǹ��̶� �����ΰ�
		 * if(���ǹ�)���� ���Ǵ� ���ǹ��̶� ���� ������ �Ǵ��ϴ� ������ ���Ѵ�
		 */
		
		// if�� else�� �̿��� �⺻���� ����
//		boolean money = true;
//		if(money) {
//		}

		// �񱳿�����
		/*
		 * ������ �Ǵ��ϴ� ���� �ڷ������� �� ������(<,>,==,!=)�� ���� ��찡 �ξ� ����
		 * 
		 */
		int x = 3;
		int y = 2;
		System.out.println(x > y);
		System.out.println(x != y);
		
		// ���� 3000�� �̻��� ���� ������ ������ �ýø� Ÿ�� �ƴϸ� �ɾ�� ���
		
		int money = 2000;
		
		if (money >= 3000) {
			System.out.println("�ýø� Ÿ�� ����");
		}else {
			System.out.println("�ɾ��");
		}
		
		// �� ������ and, or, not
		
		// x || y x�� y �� �� �ϳ��� ���̸� ���̴�
		// x && y x�� y ��� ���̾�� ���̴�
		// !x x�� �����̸� ���̴�
		
		// ���� 3000�̻� �ְų� ī�尡 �ִٸ� �ýø� �ƴϸ� �ɾ
		
		boolean hascard = true;
			
		if (money >= 3000 || hascard) {
			System.out.println("�ý�Ÿ�� ��");
		} else {
			System.out.println("�ɾ");
		}
		
		/*
		 * contains List �ڷ������� �ش� �������� �ִ��� �����ϴ� contains �޼��尡 �ִ�
		 * contains �޼���� ���ǹ��� ���� Ȱ��Ǵµ� ��� Ȱ���ϴ��� �˾ƺ��� 
		 */
		
		// ���� �ָӴϿ� ���� �ִٸ� �ýø�, �ƴϸ� �ɾ
		
		ArrayList<String> pocket = new ArrayList<String>();
		pocket.add("paper");
		pocket.add("handphone");
		pocket.add("money");
		
		if (pocket.contains("money")) {
			System.out.println("�ý�Ÿ�� ��");
		} else {
			System.out.println("�ɾ");
		}
		
		/* else if
		 * if �� else ���� �������� �پ��� ���� �Ǵ��� �ϱ� ��ƴ�. ������ ���� ���� �ϴ���
		 * if�� else �����δ� ���� �Ǵܿ� ������� �ް� �ȴ�
		 * ������ ���� ������ �ýø� Ÿ��, ������ ���� ������ ī�尡 ������ �ýø� Ÿ��, ��������
		 * ī�嵵 ������ �ɾ��.
		 * 
		 * if�� else ������ ���� ������ ǥ���Ϸ��� ������ ����
		 */
		
		if (pocket.contains("money")) {
			System.out.println("�ý�Ÿ�� ��");
		} else {
			if (hascard) {
				System.out.println("�ý�Ÿ�� ��");
			} else {
				System.out.println("�ɾ");
			}
		}
		// ��û �길�ϰ� �������� �ڵ带 else if�� �̿��ؼ� �������� �Ǵ��� �ɾ��
		if (pocket.contains("money")) {
			System.out.println("�ý�Ÿ�� ��");
		} else if (hascard) {
			System.out.println("�ý�Ÿ�� ��");
		} else {
			System.out.println("�ɾ");
		}
	}

}
