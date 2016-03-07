
public class ReverseString {
	/**
	 * Reverse a given string. e.g "abc123" -> "321cba"
	 */
	public static String reverse(String s) {
		if (s == null) {
			return s;
		}
		
		String result = "";
		for (int si = s.length() - 1; si >= 0; si--) {
			result += s.charAt(si);
		}
		
		return result;
	}
}
