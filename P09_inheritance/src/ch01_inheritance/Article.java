package ch01_inheritance;

public class Article {

	private int no;
	private String title;
	
	public Article() {
		
	}
	
	public Article(int no, String title) {
		this.no = no;
		this.title = title;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
