package oop;

public class houseDog extends dog {
	// �޼��� �������̵� dog.java ���� ���������
	
	public void sleep() {
		System.out.println(this.name+" zzz in house");
	}
	public void sleep(int hour) {
		System.out.println(this.name+" zzz in house for " + hour+" hours");
	}
	public static void main(String[] args) {
		houseDog house_dog = new houseDog();
		house_dog.setName("white");
		house_dog.sleep();
		
		/* ���� ������ Ű��� ������ ���� �������� �ٰܴ� �ϸ�, houseDog Ŭ������ ������� ��ü���� sleep�޼��� ȣ���
		 * white zzz �� �ƴ� white zzz in house �� ����ؾ� �Ѵٰ� �����غ���
		 * 
		 * housedog Ŭ������ dog Ŭ������ ������ ����(������� ����)�� sleep�޼��带 �����ϸ� ������ sleep �޼��尡
		 * ���� sleep �޼��庸�� �� ���� �켱������ ���� �Ǿ� ������ sleep �޼��尡 ȣ��ǰ� �Ѵ�
		 * 
		 * �̷��� �θ�Ŭ������ �޼��带 �ڽ�Ŭ������ ������ ���·� �ٽ� �����ϴ� ���� �޼��� �������̵� �̶�� �Ѵ�(�����)
		 * 
		 * �̹����� public void sleep(int hour) {
		 * 		sysout(this.name+" zzz in house for " + hour+" hours"); } ��� �޼��带 �߰��غ���
		 * �̹� sleep�̶�� �޼��尡 ������ ������ �̸��� sleep �޼��带 �� ������ �� �ִ�.
		 * �� �޼����� �Է��׸��� �ٸ���츸 �ش���
		 * 
		 * �̷��� �Է��׸��� �ٸ���� ������ �̸��� �޼��带 ���� �� �ִµ� �̰� ����� ���� �޼��� �����ε��̶�� �Ѵ�
		 */
		house_dog.sleep(3);
		
		// �ڹٴ� ���� ����� ����..!
	}
}
