package error;

public class ErrorFlag {

	private static boolean ERROR = false;

	public static void reset() {
		ERROR = false;

	}

	public static void set() {
		ERROR = true;
	}

	public static boolean error() {
		return ERROR;
	}

}