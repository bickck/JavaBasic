

/*
 * 다중 catch
 * - 발생하는 예외별로 예외 처리 코드를 다르게 하는 다중 catch 블록을 적용할 수 있습니다
 * - 다중 catch 블록 적용시 상위 예외 클래스가 하위 예외 클래스보다 아래에 위치해야 합니다
 */

public class Ex02Exception {

	public static void main(String[] args) {
		
		String[] stn = new String[] { "1", "2", "3"};
		
		// stn 배열의 값을 숫자로 변환해서 저장하는 배열
		int[] arr = new int[stn.length];
		
		try {
			
			for(int i=0 ; i<4 ; i++) {
				arr[i] = Integer.parseInt(stn[i]);
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			
		} catch (NumberFormatException e) {
			//System.out.println("변환할 수 없는 데이터 입니다..");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("사용할 수 없는 index 입니다..");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error~");
		} finally {
			System.out.println("- End -");
		}
		
	}
	
}



















