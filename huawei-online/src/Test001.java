import java.util.Scanner;

/**
 * 
 * ��Ŀ����
	�����ַ������һ�����ʵĳ��ȣ������Կո������ 
 * ��������:
	һ���ַ������ǿգ�����С��5000��

 * �������:
	����N�����һ�����ʵĳ��ȡ�

 * ʾ��1
	����
	hello world
	���
	5
 *
 */
public class Test001 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str = scanner.nextLine();
		String arrays[]=str.split(" ");
		String end=arrays[arrays.length-1];
		System.out.println(end.length());
	}
}
