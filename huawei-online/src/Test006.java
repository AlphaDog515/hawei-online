import java.util.Scanner;

/**
 * 
 * ����:����һ�������������մ�С�����˳����������������������ӣ���180����������Ϊ2 2 3 3 5 ��
 * ���һ��������ҲҪ�пո�
	��ϸ������
	�����ӿ�˵����
	public String getResult(long ulDataInput)

	���������
	long ulDataInput�������������

	����ֵ��
	String

 * ��������:
	����һ��long������

 * �������:
	���մ�С�����˳����������������������ӣ��Կո���������һ��������ҲҪ�пո�

 * ʾ��1
	����
	180

	���
	2 2 3 3 5
 *
 */
public class Test006 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long num = scanner.nextLong();
		System.out.println(getResult(num));
	}
	public static String getResult(long ulDataInput) {
		StringBuilder builder = new StringBuilder(128);
        long i = 2;
        while (i <= ulDataInput) {
            // ÿ�ε�iһ��������ʱ�Ż�����
            // ��Ϊ�����һ��������������һ�����ɸ�С��������˵����ģ�
            // ����iǰ�������Ѿ�ȫ����ʹ�ù��ˣ�����������num��
            while (ulDataInput % i == 0) {
                builder.append(i).append(' ');
                ulDataInput /= i;
            }
            i++;
        }

       return builder.toString();
	}
}
