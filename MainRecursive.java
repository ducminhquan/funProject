import java.util.Date;

public class MainRecursive {

	private static final int BASE = 16;
	private static final char[] chars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
	private static boolean[] check = new boolean[BASE];

	private static void recursive(int base, long index, long value) {
		if (index < base - 1) {
			value *= base;
			index++;
			for (int i = 0; i < base; i++) {
				if (!check[i] && (value + i) % index == 0) {
					check[i] = true;
					recursive(base, index, value + i);
					check[i] = false;
				}
			}
		} else {
			print(value, base);
			System.out.println();
		}
	}

	private static void print(long value, int base) {
		if (value > base) {
			print(value / base, base);
			print(value % base, base);
		} else {
			System.out.print(chars[(int) value]);
		}
	}

	public static void main(String[] args) {
		Date date = new Date();

		recursive(BASE, 0, 0);

		System.out.println(new Date().getTime() - date.getTime());
	}
}
