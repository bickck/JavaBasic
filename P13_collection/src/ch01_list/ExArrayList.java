



package ch01_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * ArrayList
 * - 객체를 index로 관리합니다
 * - 저장용량이 초과되면 자동으로 늘어납니다
 * 
 * Iterator ( 반복자 )
 * - collection에 보관하고 있는 데이터에 순차적으로 접근할 때 사용합니다
 *   > hasNext() : 데이터가 있는지 확인
 *     next()    : 데이터 가져오기
 *     remove()  : 데이터 삭제 
 */

public class ExArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> exA = new ArrayList<>();
		List<String> exB = new ArrayList<>();
		
		// add() : 데이터 추가
		exA.add("추신수");
		exA.add("류현진");
		exA.add("손흥민");
		System.out.println(exA);
		
		// add( index, value ) : index 위치에 추가
		exA.add(1, "이강인");
		System.out.println(exA);
		
		// size() : 요소의 수
		System.out.println(exA.size());
		
		// contains(Object) : 데이터 확인
		System.out.println("손흥민 확인 : " + exA.contains("손흥민"));
		System.out.println("박지성 확인 : " + exA.contains("박지성"));
		
		// remove( Object or index ) : 데이터 삭제
		System.out.println("추신수 삭제 : " + exA.remove("추신수"));
		System.out.println(exA);
		System.out.println("2번 index 삭제 : " + exA.remove(2));
		System.out.println(exA);
		
		// get(index) : index 위치의 데이터 가져오기
		System.out.println("1번 index 데이터 : " + exA.get(1));
		
		// set(index, value) : 
		System.out.println("0번 index 수정 : " + exA.set(0, "박지성"));
		System.out.println(exA);
		System.out.println();
				
		// 각 객체 확인
		for(int i=0 ; i<exA.size() ; i++) {
			System.out.println(i+1 + "번 : " + exA.get(i));
		}
		System.out.println();
		
		// foreach -  ( 변수명 : collection )
		for(String data : exA) {
			System.out.println(data);
		}
		System.out.println();
		
		// Iterator
		Iterator<String> it = exA.iterator(); // 반복자 생성
		while(it.hasNext()) { // 데이터가 있는지 확인
			String data = it.next(); // 현재 데이터 가져오기
			System.out.println(data);
		}
		
		
	}
	
}



















