



package ch03_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * HashMap
 * - key, value 로 구성합니다
 * - key는 중복 될 수 없고, value(값)은 중복처리가 가능합니다
 * - 기존에 저장된 key와 동일한 key로 값을 저장하면, 기존값은 없어지고 새로운 값으로 변경됩니다
 */

public class ExHashMap {

	public static void main(String[] args) {
		
		//HashMap<String, String> hm = new HashMap<>();
		Map<String, String> hm = new HashMap<>();
		
		// put() : 데이터 추가
		hm.put("유재석", "안테나");
		hm.put("손흥민", "토트넘");
		hm.put("이강인", "발렌시아");
		//hm.put("유재석", "프리랜서");
		System.out.println(hm);
		
		// get(key) : 데이터 가져오기
		System.out.println("이강인 소속 : " + hm.get("이강인"));
		
		// 전체 접근
		Set<String> ks = hm.keySet(); // key 값만을 모아서 하나의 set을 생성
		Iterator<String> it = ks.iterator(); // keySet() 의 반복자 생성
		while(it.hasNext()) {
			String key = it.next();
			String value = hm.get(key);
			System.out.println(key + " - " + value);
		}
		System.out.println();
		
		// remove( key ) : 삭제
		System.out.println("손흥민 삭제 : " + hm.remove("손흥민"));
		System.out.println("박지성 삭제 : " + hm.remove("박지성"));
		System.out.println(hm);
		
		// containsKey( key ) : key 값이 있는지 확인
		System.out.println("이강인 확인 : " + hm.containsKey("이강인"));
		System.out.println("박지성 확인 : " + hm.containsKey("박지성"));
		
		String dkey = "이강";
		if(hm.containsKey(dkey)) {
			hm.remove(dkey);
			System.out.println(dkey + " 삭제");
		} else {
			System.out.println("삭제 key가 없어요..");
		}
		System.out.println(hm);
		
		
		
	}
	
}
















