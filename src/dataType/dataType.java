package dataType;

public class dataType {

	public static void main(String[] args) {
		
		// equals ������ ���ΰ�
		
		String a = "hello";
		String b = "java";
		String c = "hello";
		
		System.out.println(a.equals(b));	// false
		System.out.println(a.equals(c));	// true
		
		// indexOf ���ڿ��� ���۵Ǵ� ��ġ
		
		String d = "hello Java";
		
		System.out.println(d.indexOf("Java"));
		
		// replaceAll Ư�� ���ڿ��� �ٲ�
		
		System.out.println(d.replaceAll("Java", "World"));
		
		// substring Ư�� �κ��� �̾Ƴ�
		
		System.out.println(d.substring(0, 4));
		
		/* StringBuffer
		 * ��Ʈ�� ���۴� ���ڿ��� �߰��ϰų� ������ �� �ַ� ����ϴ� �ڷ���
		 */
		// append ���ڿ��� �߰��� �� �ִ�
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("jump to java");
		System.out.println(sb.toString()); //toString�޼���� String �ڷ������� �����Ѵ�
		/*
		 * String ���۸� ����Ұ�� ��ü�� �� �ѹ��� ����������
		 * String���� ������ ��� + ������ �� ������ ���ο� String ��ü�� �����ȴ�
		 * ������ StringBuffer �ڷ����� String �ڷ������� ���ſ��� ���Ѵ�
		 * new StringBuffer() �� ��ü�� �����ϴ� ���� �Ϲ� String�� ����ϴ� �ͺ��� �޸� ��뷮�� ����
		 * �ӵ��� ������. ���� ���ڿ� �߰��� ����� �۾��� ���� ��쿡�� ����ϴ°� ����
		 */
		
		// insert Ư�� ��ġ�� ���ϴ� ���ڿ��� ����
		
		sb.insert(0, "hello");
		System.out.println(sb.toString());
		// substring ���� StringBuffer���� ������ �Ȱ���
	}
}
