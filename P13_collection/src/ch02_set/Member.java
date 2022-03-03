



package ch02_set;

public class Member {

	private String name;
	private int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
	
	public int hashCode() {
		return name.hashCode() + age;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member tmp = (Member)obj;
			if(!name.equals(tmp.name))
				return false;
			if(!(age == tmp.getAge()))
				return false;
			return true;
		}
		return false;
	}
	
	public String toString() {
		return name + " - " + age;
	}
	
	
}





















