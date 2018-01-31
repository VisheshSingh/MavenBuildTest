package multiplyingNumbers;

public class DigitPosition {

	public static int getPosition(int num, int n) {
		if (n < 0) {
			return -1;
		}
		if (n > 9) {
			return -2;
		}
		int position = 1;
		while (num != 0) {
			int rem = num % 10;
			if (rem == n)
				break;
			num = num / 10;
			position = position * 10;
		}
		return position;
	}

}
