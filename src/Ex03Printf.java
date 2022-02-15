
public class Ex03Printf {

	public static void main(String[] args) {

		// printf : ���ڿ� �ȿ� ���������ڸ� ����ؼ� �ܺ��� ���� ����� �� �ִ�.
		// - ���� : %d
		// - �Ǽ� : %f
		// - ���� : %c
		// - ���� ���� : \n

		// ����
		System.out.printf("���� : %d\n", 10);

		// �Ǽ�
		System.out.printf("�Ǽ� : %f\n", 1.2);

		// ����
		// - ���� �ϳ��� �����͸� ǥ���� ������ ' '�� �ۼ��մϴ�.
		// - java�� ���� �ϳ��� 2byte�� ó���ϱ� ������ �ѱ� ������ �����մϴ�.
		System.out.printf("���� : %c\n", 'g');
		System.out.printf("���� : %c\n", '��');
		
		System.out.printf("���ڿ� %s\n","Hello");
		
		// ���������� �ȿ� �������� ����ϸ�, ��½� �ش� ��ġ�� ���ڸ�ŭ�� ������ Ȯ���ϰ� ���� ����մϴ�.
		System.out.printf("%d\n",123);
		System.out.printf("%5d\n",123);
		System.out.printf("%-5d#\n",123);
		
		// �Ǽ����� ����� �� ���������ھȿ� '%.����f', �� �ۼ��ϸ�, �ش� ���ڱ����� �Ҽ��� �ڸ��� ����մϴ�.
		System.out.printf("%.2f\n",12.1234);
		System.out.printf("%7.2f\n",12.1234);
		System.out.printf("%.2f\n",12.1234);
		
		System.out.printf("%5d\n",100);
		System.out.printf("%5d\n",10);
		System.out.printf("%5d\n",2);
	}
}
