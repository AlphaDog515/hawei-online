import java.util.Scanner;

/**
 * ��Ŀ����
	д��һ�����򣬽���һ������ĸ��������ɵ��ַ�������һ���ַ���
	Ȼ����������ַ����к��и��ַ��ĸ����������ִ�Сд��

 * ��������:
	����һ������ĸ�������Լ��ո���ɵ��ַ�������һ���ַ���

 * �������:
	��������ַ����к��и��ַ��ĸ�����

 * ʾ��1
	����
	ABCDEF A
	���
	1
 * 
 */
public class Test002 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String stringstr=scanner.next();
		String charstr=scanner.next();
		String upstr=stringstr.toUpperCase();//ת��д
		String upchar=charstr.toUpperCase();
		int num=0;//����
		while(upstr.contains(upchar)) {
			upstr=upstr.substring(upstr.indexOf(upchar)+1,upstr.length());
			num++;
		}
		System.out.println(num);
	}

}
