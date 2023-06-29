package sub5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 날짜 : 2023/06/28
 * 이름 : 이성찬
 * 내용 : Java 자료구조 맵 실습하기
 * 
 * 맵(Map)
 *  - 키-값(key - value) 쌍으로 이루어진 자료구조
 *  - Map 구현한 HashMap
 * 
 */
public class MapTest {

	public static void main(String[] args) {
		
		// Map 생성
		Map<Character, String> map = new HashMap<>();
		
		// 데이터 입력 
		map.put('A', "Apple");
		map.put('B', "Banana");
		map.put('C', "Cherry");
		
		System.out.println(map);
		
		//Map 크기
		System.out.println("map 크기 : " + map.size());


		//데이터 출력
		System.out.println("map A값 : " + map.get('A'));
		System.out.println("map B값 : " + map.get('B'));
		System.out.println("map C값 : " + map.get('C'));
		
		// map 반복문
		for(char k : map.keySet()) {
			System.out.println(k + " - " + map.get(k));
		}
		
		// List-Map 응용
		List<Map<Integer, Apple>> list = new ArrayList<>();
		
		Map<Integer, Apple> m1 = new HashMap<>();
		
		m1.put(101, new Apple("한국", 3000));
		m1.put(102, new Apple("중국", 2000));
		m1.put(103, new Apple("일본", 1000));
		
		Map<Integer, Apple> m2 = new HashMap<>();
		
		m2.put(201, new Apple("미국", 3000));
		m2.put(202, new Apple("영국", 2000));
		m2.put(203, new Apple("호주", 1000));
		
		Map<Integer, Apple> m3 = new HashMap<>();
		
		m3.put(301, new Apple("대만", 3000));
		m3.put(302, new Apple("태국", 2000));
		m3.put(303, new Apple("홍콩", 1000));
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		// 한국 사과 출력
		Map<Integer, Apple> k = list.get(0);
		Apple a = m1.get(101);
		a.show();
		
		// 호주 사과 출력
		// 체인 메서드 : 리턴값이 메소드를 가진 클래스일 때 연속해서 메소드 호출 가능
		list.get(1).get(203).show();
		
		// 태국 사과 출력
		Map<Integer, Apple> k2 = list.get(2);
		Apple a3 = m3.get(302);
		a3.show();
		
		//list.get(2).get(302).show();
		
	}

}


