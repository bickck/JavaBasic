package ch01_inheritance;

public class FileArticle extends Article {

	private String fileName;

	public FileArticle() {
		super();
	}

	public FileArticle(int no, String title, String fileName) {
		super(no, title);
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void fileInfo() {
		System.out.println("자료실 [No." + getFileName() + " - 제목 : " + getTitle() + ", 첨부파일 : " + fileName + "]");
	}
}
