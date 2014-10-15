import java.util.Date;

public class MainRecursive {

	private static final int BASE = 10;
	private static boolean[] check = new boolean[BASE];

	private static void recursive(long base, long index, long value) {
		if (index < base - 1) {
			value *= base;
			index++;
			for (int i = 1; i < base; i++) {
				if ((value + i) % index == 0 && !check[i]) {
					check[i] = true;
					recursive(base, index, value + i);
					check[i] = false;
				}
			}
		} else {
			System.out.println(value);
		}
	}

	public static void main(String[] args) {
		Date date = new Date();

		recursive(BASE, 0, 0);

		System.out.println(new Date().getTime() - date.getTime());
	}
}
