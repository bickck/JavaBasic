/*
 * ��� : �� ���� �Ұ�
 * 
 * literal(���ͷ�)
 * - �ҽ� �ڵ���� ������ �������Դϴ�.
 * 
 * �ڷ���
 * - �����͸� �����ϴ� ������ ������ �� ����ϴ� �̸��Դϴ�.
 * 
 * �⺻ �ڷ���
 * - ���� �̸��� �ϳ� �Դϴ�.
 * - ������ ������ ũ�Ⱑ �����Դϴ�.
 * 			1byte		2byte		4byte		8byte
 * 	����	boolean		
 *  ������				char
 *  ������	byte		short		int(�⺻)		long
 *  �Ǽ���							float		double(�⺻)
 *  
 * ���� �ڷ���
 * - �⺻�ڷ����� ������ ��� �ڷ��� �Դϴ�.
 * - ���� �����Ͱ� �ִ� ���� �̸��� �и��Ǿ� �ֽ��ϴ�.
 * 
 * ����
 * - �ڷ����� ����ؼ� ����� ���� ������ �Դϴ�.
 *   > �ڷ��� ������
 */
public class Ex04Integer {

	public static void main(String[] args) {
		System.out.println(10);

		int a; // ���� ����(����)
		// System.out.println("a : " + a); // Error
		// ��� ������ �ʱ�ȭ �Ŀ� ����ؾ� �մϴ�...

		a = 10; // ���� �ʱ�ȭ

		System.out.println("a : " + a);

		a = 20;
		System.out.println("a : " + a);

		int ia = 11;
		System.out.println("ia :" + ia);

		// byte ba = 128; ���� ����Ʈ�� �Ѿ���
		// System.out.println("ba : " + ba);

		byte ba = 127; // ����

		short sa = 32767;
		System.out.println("sa : " + sa);
		
		long la = 2147483647; // �ִ밪
		System.out.println("la : " + la);

	}
}
