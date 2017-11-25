
public class IsPalindropme {
	public static boolean isPalindrome(String s) {
		for(int i = 0; i < s.length()/2; ++i) {
			if(s.charAt(i) != s.charAt(s.length() - i-1)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String test_string = "abccba";
		System.out.println(isPalindrome(test_string));
	}
}
