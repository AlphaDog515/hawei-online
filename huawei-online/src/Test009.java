import java.util.Scanner;

/**
 * 
 * ��Ŀ����
	����һ��int�����������մ���������Ķ�˳�򣬷���һ�������ظ����ֵ��µ�������

 * ��������:
	����һ��int������
	
 * �������:
	���մ���������Ķ�˳�򣬷���һ�������ظ����ֵ��µ�����

 * ʾ��1
	����
	9876673
	���
	37689
 *
 */
public class Test009 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int start = scanner.nextInt();
		int[] arrays = new int[50];// ����洢���������
		int tmp; // �м����
		int num = 0; // ��¼��������λ��
		for (int i = 0; start > 0; i++) {
			tmp = start % 10; // ȡĩλ����
			start /= 10; // ȥ��ĩλ����
			boolean bool = true; // ����Ƿ����ظ���true�������ظ�
			for (int j = 0; j <= i; j++) {
				if (arrays[j] == tmp) {
					bool = false;
				}
			}
			if (bool) { // ���ظ����¼
				arrays[num] = tmp;
				num++;
			}
		}
		for (int k = 0; k < num; k++) { // ���
			System.out.print(arrays[k]);
		}
	}

}
