



package ch04_constructor;

public class BookManager {

	public static void main(String[] args) {
		
		Book bookA = new Book();
		bookA.info();
		System.out.println();
		
		bookA.setTitle("2022 토지");
		bookA.setAuthor("ㅏㅣㅁ넝;리ㅏㅓㅁㄴㅇ");
		bookA.setAuthor("박경리");
		bookA.setArea('C');
		bookA.setPrice(-20000);
		bookA.setPrice(20000);
		bookA.info();
		System.out.println();
		
		Book bookB = new Book("개미", "베르나르 베르베르", 'B', 19000);
		bookB.info();
		
		
	}
	
}











