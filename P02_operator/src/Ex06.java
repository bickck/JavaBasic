



public class Ex06 {

	public static void main(String[] args) {
		
		int va = 5, vb = 2;
		System.out.println("va : " + va + " - vb : " + vb);
		System.out.println();
		
		double dres = 0;
		dres = va / vb; 
		System.out.println("dres : " + dres);
				
		double da = 2;
		dres = va / da; // 자동 형변환
		// 서로 다른 자료형이 연산처리 될 때에는, 크기가 작은 자료형을 큰쪽에 맞춰서 처리합니다
		//int ires = va / da; Error
		System.out.println("dres : " + dres);
		
		// 강제 형변환
		// - 사용하려는 데이터의 왼쪽에 '(변환자료형)'을 써주면,
		//   실행시에 ()안의 자료형으로 형변환되어 실행합니다
		dres = (double)va / vb;
		System.out.println("dres : " + dres);
		
		
	}
	
}
























