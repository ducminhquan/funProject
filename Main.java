public class Main {

	public static void main(String[] args) {
		for (int a = 1; a <= 9; a += 2) {
			if (a != 5) {
				for (int b = 2; b <= 8; b += 2) {
					for (int c = 1; c <= 9; c += 2) {
						if (c != a && c != 5 && (a + b + c) % 3 == 0) {
							for (int d = 2; d <= 8; d += 2) {
								if (d != b && (c * 10 + d) % 4 == 0) {
									for (int f = 2; f <= 8; f += 2) {
										if (f != d && f != b && (a + b + c + d + 5 + f) % 3 == 0) {
											for (int g = 1; g <= 9; g += 2) {
												if (g != a
												        && g != c
												        && g != 5
												        && (g + f * 10 + 500 + d * 1000 + c * 10000 + b * 100000 + a * 1000000) % 7 == 0) {
													for (int h = 2; h <= 8; h += 2) {
														if (h != b && h != d && h != f
														        && (f * 100 + g * 10 + h) % 8 == 0) {
															for (int i = 1; i <= 9; i += 2) {
																if (i != a && i != c && i != 5 && i != g) {
																	System.out.printf("%d%d%d%d%d%d%d%d%d",a,b,c,d,5,f,g,h,i);
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
