



package ch02_set;

import java.util.HashSet;
import java.util.Set;

public class MemberSet {

	public static void main(String[] args) {
		
		Set<Member> sm = new HashSet<>();
		
		Member yooA = new Member("유재석", 50);
		Member yooB = new Member("유재석", 50);
		System.out.println(yooA.hashCode());
		System.out.println(yooB.hashCode());
		System.out.println();
		
		sm.add(yooA);
		sm.add(new Member("김종국", 47));
		sm.add(new Member("송지효", 44));
		sm.add(yooB);
		System.out.println(sm);
		
		
	}
	
}



















