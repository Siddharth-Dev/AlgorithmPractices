package other_practices2.string;

public class RomanToInteger {

	/*
	 * Given a roman numeral, convert it to an integer.
	 * 
	 * Input is guaranteed to be within the range from 1 to 3999.
	 */

	public int romanToInt(String s) {
		int v = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (i == 0) {
				v += getVal(s.charAt(i));
			} else if (getVal(s.charAt(i - 1)) < getVal(s.charAt(i))) {
				v += getVal(s.charAt(i)) - getVal(s.charAt(i - 1));
				i--;
			} else {
				v += getVal(s.charAt(i));
			}
		}
		return v;
	}

	private int getVal(char c) {
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		}
		return 0;
	}

	public static void main(String[] args) {
		String s = "DCXXI";
		RomanToInteger o = new RomanToInteger();
		System.out.println(o.romanToInt(s));
	}
}
