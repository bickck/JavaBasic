



package ch02_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * HashSet
 * - 객체 저장시 순서가 없고, 동일한 객체는 중복 저장되지 않습니다
 */

public class ExHashSet {

	public static void main(String[] args) {
		
		//HashSet<String> hs = new HashSet<>();
		Set<String> hs = new HashSet<>();
		
		// 추가
		hs.add("userA");
		hs.add("userB");
		hs.add("userC");
		hs.add("userB");
		System.out.println(hs);
		
		System.out.println("데이터 수 : " + hs.size());
		
		System.out.println("userB 확인 : " + hs.contains("userB"));
		
		System.out.println("userB 삭제 : " + hs.remove("userB"));
		System.out.println(hs);
		System.out.println();
		
		for(String data : hs) {
			System.out.println(data);
		}
		System.out.println();
		
		Iterator<String> it = hs.iterator();
		String del = "userB";
		while(it.hasNext()) {
			String data = it.next();
			System.out.println(data);
			if(data.equals(del)) {
				 it.remove();
			}
		}
		System.out.println(hs);
		
		
	}
	
}






















