
public class Ex08String {

	public static void main(String[] args) {
		// ���ڿ� : String
		// - ���ڿ��� �⺻�ڷ���ó�� �ٷ�� ���ִ� class �Դϴ�.
		String str = "HI";
		System.out.println("str" + str);

		str = "������ ����";
		System.out.println("str" + str);

		String textA = "new";
		String textB = "Java";
		String title = textA + textB;
		System.out.println("title : " + title);

		System.out.println("title size: " + title.length());
		
		// equals() : ���ڿ��� ������ Ȯ���մϴ�.
		
		String wordA = "abc";
		String wordB = "abc";
		String wordC = "abf";
		
		System.out.println(wordA.equals(wordB));
		System.out.println(wordA.equals(wordC));

	}
}
