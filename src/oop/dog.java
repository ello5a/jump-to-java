package oop;

public class dog extends animal {
	/* ��ӿ� ���� �����Դϴ� animal-> test -> dog ������ ����˴ϴ�
	 * Ŭ���� ����� ���ؼ��� extends ��� Ű���带 ����Ѵ�
	 * �ڽ�Ŭ���� extends �θ�Ŭ����
	 * 
	 * dog Ŭ������ name�̶�� ��ü������ setName �̶�� �޼��带 ������ �ʾ����� animalŬ������ ����� �޾ұ� ������
	 * �״�� ����� �����ϴ�. dogŬ������ ������ ���� main�޼��带 �����ϰ� ������Ѻ���
	 */
	public dog() {
		
	}
	public void sleep() {
		System.out.println(this.name+" zzz");
	}

	public static void main(String[] args) {
		dog Dog = new dog();
		Dog.setName("tang");
		System.out.println(Dog.name);
		Dog.sleep();
		
		/* dogŬ������ animalŬ������ ��ӹ޾Ҵ�. �� animal�� ���� �������� dog�� animal�� ���ԵǱ� ������
		 * "���� �����̴�"��� ǥ���� �� �ִ�
		 * �ڹٴ� �̷� ���踦 Is a ����ϴµ� "dog is a animal" �� ���� ���踦 ���Ѵ�
		 * �̷��� Is-a ���迡 ���� �� �ڽ� ��ü�� �θ� Ŭ������ �ڷ����� ��ó�� ����� �� �ִ�
		 * �� animal dog = new dog(); �̷�������
		 * ������ �ݴ��� ���� �ȵȴ�
		 * .. ���� ���������� ���캸��
		 * animal dog = new dog();
		 * ���� �ڵ带 �о�� `���� ������� ��ü�� ���� �ڷ����̴�` ��� ���� �� �ִ�
		 * dog dog = new animal();
		 * �̰� �� ������ ������� ��ü�� �� �ڷ����̴�(?) ������ ���� ��ü�� ������ϼ��� �ְ� �� �׷��ǵ�
		 */
		
	}
}
