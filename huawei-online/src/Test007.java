import java.util.Scanner;

/**
 * 
 * ��Ŀ����
	д��һ�����򣬽���һ����������ֵ���������ֵ�Ľ�������ֵ��
	���С�������ֵ���ڵ���5,����ȡ����С��5��������ȡ����

 * ��������:
	����һ����������ֵ

 * �������:
	�������ֵ�Ľ�������ֵ

 * ʾ��1
	����
	5.5
	���
	6
 *
 */
public class Test007 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float num = scanner.nextFloat();
		int tmp = (int) num;
		float ftmp = (float) tmp + (float) 0.5;
		if (num >= ftmp) {
			System.out.println(tmp + 1);
		} else {
			System.out.println(tmp);
		}
	}
}
//��������
/*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            float input = scanner.nextFloat();
            System.out.println(floatToNearInt(input));
        }

        scanner.close();
    }

    private static int floatToNearInt(float f) {
        return (int) ((f*10 + 5)/10);
    }
}

 */
