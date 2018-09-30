import java.util.Scanner;

/**
 * 
 * ��Ŀ����
	д��һ�����򣬽���һ��ʮ�����Ƶ���ֵ�ַ������������ֵ��ʮ�����ַ�����������ͬʱ���� ��

 * ��������:
	����һ��ʮ�����Ƶ���ֵ�ַ�����

 * �������:
	�������ֵ��ʮ�����ַ�����

 * ʾ��1
	����
	0xA
	
	���
	10
 *
 */
public class Test005 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String tmp;
		while (scanner.hasNextLine()) {
			tmp = scanner.nextLine();
			tmp = tmp.substring(2, tmp.length());
			toTen(tmp);
		}
	}

	public static void toTen(String str) {
		int length = str.length();
		int sum = 0;
		char ch;
		for (int i = length - 1; i >= 0; i--) {
			ch = str.charAt(length - i - 1);
			switch (ch) {
			case 'F':
				sum += 15 * Math.pow(16, i);
				break;
			case 'E':
				sum += 14 * Math.pow(16, i);
				break;
			case 'D':
				sum += 13 * Math.pow(16, i);
				break;
			case 'C':
				sum += 12 * Math.pow(16, i);
				break;
			case 'B':
				sum += 11 * Math.pow(16, i);
				break;
			case 'A':
				sum += 10 * Math.pow(16, i);
				break;
			case '9':
				sum += 9 * Math.pow(16, i);
				break;
			case '8':
				sum += 8 * Math.pow(16, i);
				break;
			case '7':
				sum += 7 * Math.pow(16, i);
				break;
			case '6':
				sum += 6 * Math.pow(16, i);
				break;
			case '5':
				sum += 5 * Math.pow(16, i);
				break;
			case '4':
				sum += 4 * Math.pow(16, i);
				break;
			case '3':
				sum += 3 * Math.pow(16, i);
				break;
			case '2':
				sum += 2 * Math.pow(16, i);
				break;
			case '1':
				sum += 1 * Math.pow(16, i);
				break;
			default:
				break;
			}
		}
		System.out.println(sum);
	}
}

//��������
/*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            System.out.println(hexToDec(input));
        }
        scanner.close();
    }

    private static int hexToDec(String hex) {
        final int BASE = 16;
        int result = 0;

        for (int i = 2; i < hex.length(); i++) {
            result = result * BASE + hexToNum(hex.charAt(i));
        }
        return result;
    }

    private static int hexToNum(char ch) {

        if (ch >= '0' && ch <= '9') {
            return ch - '0';
        } else if (ch >= 'a' && ch <= 'z') {
            return ch - 'a' + 10;
        } else {
            return ch - 'A' + 10;
        }
    }
}
*/
