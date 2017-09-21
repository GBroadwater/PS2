package myInteger;

public class MyInteger {

	private int iValue;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}
	public boolean isEven() {
		return MyInteger.isEven(iValue);
	}
	public boolean isOdd() {
		return MyInteger.isOdd(iValue);
	}
	public boolean isPrime() {
		return MyInteger.isPrime(iValue);
	}
	public static boolean isEven(int a) {
		if ((a % 2) == 0)
			return true;
		return false;
	}
	public static boolean isOdd(int a) {
		if ((a % 2) == 0)
			return false;

		return true;
	}
	public static boolean isPrime(int a) {
		for (int i = 2; i < a; i++) {
			if (a % i == 0)
				return false;
		}
		return true;
	}
	public static boolean isEven(MyInteger b) {
		return b.isEven();
	}
	public static boolean isOdd(MyInteger b) {
		return b.isOdd();
	}
	public static boolean isPrime(MyInteger b) {
		return b.isPrime();
	}
	public boolean equals(int a) {
		if (a == iValue)
			return true;
		return false;
	}
	public boolean equals(MyInteger b) {
		return b.equals(iValue);
	}
}	