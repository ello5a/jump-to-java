package dataType;

public class dataType {

	public static void main(String[] args) {
		
		// equals 동일한 값인가
		
		String a = "hello";
		String b = "java";
		String c = "hello";
		
		System.out.println(a.equals(b));	// false
		System.out.println(a.equals(c));	// true
		
		// indexOf 문자열이 시작되는 위치
		
		String d = "hello Java";
		
		System.out.println(d.indexOf("Java"));
		
		// replaceAll 특정 문자열을 바꿈
		
		System.out.println(d.replaceAll("Java", "World"));
		
		// substring 특정 부분을 뽑아냄
		
		System.out.println(d.substring(0, 4));
		
		/* StringBuffer
		 * 스트링 버퍼는 문자열을 추가하거나 변경할 때 주로 사용하는 자료형
		 */
		// append 문자열을 추가할 수 있다
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("jump to java");
		System.out.println(sb.toString()); //toString메서드는 String 자료형으로 변경한다
		/*
		 * String 버퍼를 사용할경우 객체를 단 한번만 생성하지만
		 * String으로 구현할 경우 + 연산을 할 때마다 새로운 String 객체가 생성된다
		 * 하지만 StringBuffer 자료형은 String 자료형보다 무거운편에 속한다
		 * new StringBuffer() 로 객체를 생성하는 것은 일반 String을 사용하는 것보다 메모리 사용량도 많고
		 * 속도도 느리다. 따라서 문자열 추가나 변경등 작업이 많을 경우에만 사용하는게 좋다
		 */
		
		// insert 특정 위치에 원하는 문자열을 삽입
		
		sb.insert(0, "hello");
		System.out.println(sb.toString());
		// substring 또한 StringBuffer에서 사용법이 똑같다
	}
}
