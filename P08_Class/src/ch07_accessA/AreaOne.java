



package ch07_accessA;

/*
 * 접근 제한자
 * - 다른 class에서 class 또는 class 멤버의 접근을 허용할지를 결정합니다
 *   > public     : 모든 class에서 접근이 가능합니다
 *     protected  : 같은 package 내에서만 접근이 가능하면서, 상속받은 하위 class에서도 접근이 가능합니다
 *     default    : 같은 package 안에서만 접근이 가능합니다
 *     private    : class 안에서만 접근이 가능하고, 외부에서는 접근할 수 없습니다
 *     
 *                class 내부        같은 package    하위 class     다른 package
 *  public            O              O             O              O
 *  protected         O              O             O              X
 *  default           O              O             X              X
 *  private           O              X             X              X
 */

public class AreaOne {

	public static void main(String[] args) {
		
		First firstA = new First();
		firstA.pubData = 1;
		firstA.proData = 2;
		firstA.defData = 3;
		//firstA.priData = 4; Error
		firstA.defaultMethod();
		firstA.publicMethod();
		System.out.println();
		
		Second secondA = new Second();
		secondA.pubData = 1;
		secondA.proData = 2;
		secondA.defData = 3;
		//secondA.priData = 4; Error
		secondA.defaultMethod();
		secondA.publicMethod();
		
	}
	
}
















