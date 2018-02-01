package multiplyingNumbers;

import org.apache.log4j.Logger;

public class DigitPosition {
	// ADDING A LOGGER FOR CAPTURING LOGGIN INFORMATION
	final static Logger logger = Logger.getLogger(DigitPosition.class);

	public static int getPosition(int num, int n) {

		if (logger.isDebugEnabled()) {
			logger.debug("This is sample debug log message");
		}

		if (logger.isInfoEnabled()) {
			logger.info("This is sample info log message");
		}

		logger.warn("This is sample warning log message");

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
			logger.info("This is sample info for getting position: " + position);
		}
		return position;
	}

}
