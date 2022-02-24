



package ch04_casting;

public class UnitA extends Base {

	private String unitItem;
	
	public UnitA() {
		unitItem = "방어막";
	}
	
	public void unitAttack() {
		System.out.println(unitItem + " 사용");
	}
	
}
