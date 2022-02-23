package ch01_inheritance;

public class ArticleMain {

	public static void main(String[] args) {
		FileArticle fileArticle = new FileArticle();
		fileArticle.setNo(1);
		fileArticle.setTitle("상속 연습");
		fileArticle.setFileName("상속.ppt");
		fileArticle.fileInfo();
		
		FileArticle fileB = new FileArticle(2, "모르면 질문 좀...", "화이팅.txt");
		
		fileB.fileInfo();
	}
}
