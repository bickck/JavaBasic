package ch01_generic;


/*
 * generic
 * - 모든 종류의 데이터 타입을 다룰 수 있도록 일반화된 타입 매개변수로 class를 정의하는 방법입니다
 * - 선언시에 클래스 이름 뒤에 '< >' 기호를 붙여서, 괄호안에 타입 파라미터 이름을 정의합니다
 *   Ex) class 클래스명<타입 파라미터> { }
 *       class 클래스명<T> { }
 * - 타입 파라미터에는 일반적으로 대문자 알파벳 한문자로 작성합니다
 *   
 * 
 */

public class ExGeneric<T> {

	private T data;
	
	public T getData() { return data; }
	
	public void setData(T data) {
		this.data = data;
	}
	
}






















