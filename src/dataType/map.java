package dataType;

import java.util.*;

public class map {

	public static void main(String[] args) {
		/*
		 * 자바의 Map은 대응관계를 쉽게 표현할 수 있는 자료형이다
		 * 요즘 나오는 대부분의 언어들도 갖고있는 자료형으로 Associative, Hash 라고 불린다
		 * 
		 * 맵(Map)은 사전(dictionary)과 비슷하다. 즉 people 이란 단어에 
		 * "사람",baseball 이라는 단어에 "야구"라는 뜻이 부합하듯이 Map은 
		 * Key와 Value라는 것을 한 쌍으로 갖는다
		 * 
		 * Map은 리스트나 배열처럼 순차적으로 해당 요소 값을 구하지 않고 Key를 통해 Value를 얻는다
		 * 맵의 가장 큰 특징이라면 Key로 value를 얻어낸다는 점이다. baseball이란 단어가 있는 곳만을
		 * 펼처보는 것이다
		 */

		/*
		 * 자바의 맵중 가장 간단한 HashMap에 대해서 알아보자
		 * Map 역시 List와 마찬가지로 인터페이스이다. Map 인터페이스를 구현한 Map 자료형에는
		 * HashMap, LinkedHashMap, TreeMap 등이 있다. 인터페이스에 대해서는 객체지향
		 * 챕터에서 자세하게 다룰 것이다.
		 */
		// put 메서드로 key와 value 가 String 형태인 HashMap을 만들고 그 값을 입력해 보자
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("people","사람");
		map.put("baseball","야구");
		
		// get 메서드를 사용해서 Key에 해당하는 Value 값을 얻는다
		System.out.println(map.get("people"));
		
		// containsKey 메서드는 맵에 해당하는 키가 잇는지를 조사하여 그 결과값을 리턴한다
		System.out.println(map.containsKey("people"));
		
		// remove 메서드는 맵의 항목을 삭제하는 메서드로 key 값에 해당하는 아이템(key,value)
		// 삭제한 후 그 value 값을 리턴한다
		System.out.println(map.remove("baseball"));
		
		// size 메서드는 map의 갯수를 리턴한다
		System.out.println(map.size());
		
		/*
		 * LinkedHashMap과 TreeMap
		 * 맵의 가장 큰 특징은 순서에 의존하지 않고 Key로 value를 가져오는데 있다.
		 * 하지만 가끔은 맵에 입력된 순서대로 데이터를 가져오고 싶은 경우도 있고 때로는 입력된
		 * 키에 의해 정렬된 데이터를 가져오고 싶을 수도 있다. 
		 * 이런경우에 LinkedHashMap과 TreeMap을 사용하는 것이 유리하다
		 * LinkedHashMap은 입력된 순서대로 데이터가 출력되는 특징이 있다
		 * TreeMap은 입력된 Key의 정렬순으로 데이터가 출력되는 특징을 가지고 있다
		 */
	}


}
