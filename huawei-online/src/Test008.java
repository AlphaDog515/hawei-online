import java.util.Map.Entry;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * 
 * ��Ŀ����
	���ݱ��¼��������������ֵ����Ա�������ͬ�ļ�¼���кϲ���
	������ͬ��������ֵ����������㣬�������keyֵ������������

 * ��������:
	�������ֵ�Եĸ���
	Ȼ������ɶԵ�index��valueֵ���Կո����

 * �������:
	����ϲ���ļ�ֵ�ԣ����У�

 * ʾ��1
	����			���
	4
	0 1			0 3
	0 2			1 2
	1 2			3 4
	3 4
 *
 */
public class Test008 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			int num = Integer.parseInt(scanner.nextLine());
			SortedMap<Integer, Integer> sortedMap = new TreeMap<>();
			for (int i = 0; i < num; i++) {
				String[] nums = scanner.nextLine().split(" ");
				add(sortedMap, nums);
			}

			System.out.print(mapToString(sortedMap));
		}

		scanner.close();
	}

	private static String mapToString(SortedMap<Integer, Integer> sortedMap) {
		StringBuilder stringBuilder = new StringBuilder();
		for (Entry<Integer, Integer> tmp : sortedMap.entrySet()) {
			stringBuilder.append(tmp.getKey()).append(" ").append(tmp.getValue()).append("\n");
		}
		return stringBuilder.toString();
	}

	private static void add(SortedMap<Integer, Integer> sortedMap, String[] nums) {
		int key = Integer.parseInt(nums[0]);
		int value = Integer.parseInt(nums[1]);
		if (sortedMap.containsKey(key)) {
			sortedMap.put(key, sortedMap.get(key) + value);
		} else {
			sortedMap.put(key, value);
		}
	}

}
