import java.util.Arrays;
import java.util.Scanner;

/**
 * ��Ŀ����
	��������ѧУ����һЩͬѧһ����һ���ʾ���飬Ϊ��ʵ��Ŀ͹��ԣ������ü����
	������N��1��1000֮������������N��1000�������������ظ������֣�ֻ����һ����
	��������ͬ����ȥ������ͬ������Ӧ�Ų�ͬ��ѧ����ѧ�š�Ȼ���ٰ���Щ����С��������
	�����źõ�˳��ȥ��ͬѧ�����顣����Э��������ɡ�ȥ�ء��롰���򡱵Ĺ���
	(ͬһ��������������ܻ��ж������ݣ�ϣ���������ȷ����)��

	Input Param
	
	n               ����������ĸ���
	inputArray      n�����������ɵ�����
	
	Return Value
	OutputArray    ����������������

	ע������������֤�����������ȷ�ԣ�������������֤������������ֹһ�顣

 * ��������:
	������У���������������ĸ�������������Ӧ����������

 * �������:
	���ض��У������Ľ��

 * ʾ��1
	����                         ���
	11        	 10
	10     		 15
	20      	 20
	40       	 32
	32      	 40
	67       	 67
	40       	 89
	20      	 300
	89      	 400
	300       
	400       
	15       
 *
 */

public class Test003 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int num = scanner.nextInt();//numΪ�������
			int tmpnum = num;			//ѭ��������
			int endnum = 0;				//����������±�
			boolean flag = true;		//��־λ������ȥ��
			int[] arrays = new int[num];	//��ʼ����
			int[] endarrays = new int[num];	//�����������
			int i = 0;
			while ((--tmpnum) >= 0) {
				arrays[i] = scanner.nextInt();//�������������
				i++;
			}

			for (i = 0; i < num; i++) {
				flag = true;
				for (int j = 0; j < endnum; j++) {
					if (endarrays[j] == arrays[i]) {//�ж��Ƿ��ظ� ��ȥ�ء�
						flag = false;
					}
				}
				if (flag) {
					endarrays[endnum] = arrays[i];//���ظ��������������
					endnum++;
				}
			}
			
			Arrays.sort(endarrays); //����
			for (int k = 0; k < num; k++) {
				if(endarrays[k]!=0) {//0Ϊ��λ
					System.out.println(endarrays[k]);
				}
			}
			
		}
	}

}
