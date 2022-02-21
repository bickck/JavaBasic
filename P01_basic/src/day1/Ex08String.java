

package day1;

public class Ex08String {

	public static void main(String[] args) {
		
		// 문자열 : String
		// - 문자열을 기본자료형처럼 다루게 해주는 class 입니다
		String stnA = "hi java";
		System.out.println("stnA : " + stnA);
		
		stnA = "데이터 수정";
		System.out.println("stnA : " + stnA);
		
		String textA = "new";
		String textB = "java";
		String title = textA + " " + textB;
		System.out.println("title : " + title);
		
		System.out.println("title 문자수 : " + title.length()); 
		
		// equals() : 문자열이 같은지 확인합니다
		String wordA = "abc";
		String wordB = "abc";
		String wordC = "abf";
		System.out.println(wordA.equals(wordB));
		System.out.println(wordA.equals(wordC));
		

		
		
	}
	
}
















