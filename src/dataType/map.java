package dataType;

import java.util.*;

public class map {

	public static void main(String[] args) {
		/*
		 * �ڹ��� Map�� �������踦 ���� ǥ���� �� �ִ� �ڷ����̴�
		 * ���� ������ ��κ��� ���鵵 �����ִ� �ڷ������� Associative, Hash ��� �Ҹ���
		 * 
		 * ��(Map)�� ����(dictionary)�� ����ϴ�. �� people �̶� �ܾ 
		 * "���",baseball �̶�� �ܾ "�߱�"��� ���� �����ϵ��� Map�� 
		 * Key�� Value��� ���� �� ������ ���´�
		 * 
		 * Map�� ����Ʈ�� �迭ó�� ���������� �ش� ��� ���� ������ �ʰ� Key�� ���� Value�� ��´�
		 * ���� ���� ū Ư¡�̶�� Key�� value�� ���ٴ� ���̴�. baseball�̶� �ܾ �ִ� ������
		 * ��ó���� ���̴�
		 */

		/*
		 * �ڹ��� ���� ���� ������ HashMap�� ���ؼ� �˾ƺ���
		 * Map ���� List�� ���������� �������̽��̴�. Map �������̽��� ������ Map �ڷ�������
		 * HashMap, LinkedHashMap, TreeMap ���� �ִ�. �������̽��� ���ؼ��� ��ü����
		 * é�Ϳ��� �ڼ��ϰ� �ٷ� ���̴�.
		 */
		// put �޼���� key�� value �� String ������ HashMap�� ����� �� ���� �Է��� ����
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("people","���");
		map.put("baseball","�߱�");
		
		// get �޼��带 ����ؼ� Key�� �ش��ϴ� Value ���� ��´�
		System.out.println(map.get("people"));
		
		// containsKey �޼���� �ʿ� �ش��ϴ� Ű�� �մ����� �����Ͽ� �� ������� �����Ѵ�
		System.out.println(map.containsKey("people"));
		
		// remove �޼���� ���� �׸��� �����ϴ� �޼���� key ���� �ش��ϴ� ������(key,value)
		// ������ �� �� value ���� �����Ѵ�
		System.out.println(map.remove("baseball"));
		
		// size �޼���� map�� ������ �����Ѵ�
		System.out.println(map.size());
		
		/*
		 * LinkedHashMap�� TreeMap
		 * ���� ���� ū Ư¡�� ������ �������� �ʰ� Key�� value�� �������µ� �ִ�.
		 * ������ ������ �ʿ� �Էµ� ������� �����͸� �������� ���� ��쵵 �ְ� ���δ� �Էµ�
		 * Ű�� ���� ���ĵ� �����͸� �������� ���� ���� �ִ�. 
		 * �̷���쿡 LinkedHashMap�� TreeMap�� ����ϴ� ���� �����ϴ�
		 * LinkedHashMap�� �Էµ� ������� �����Ͱ� ��µǴ� Ư¡�� �ִ�
		 * TreeMap�� �Էµ� Key�� ���ļ����� �����Ͱ� ��µǴ� Ư¡�� ������ �ִ�
		 */
	}


}
