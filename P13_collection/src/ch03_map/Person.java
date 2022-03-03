



package ch03_map;

public class Person {

	private String id;
	private String name;
	
	public Person(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getId() { return id; }
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() { return name; }
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "ID : " + id + " - 이름 : " + name;
	}
	
	
}














