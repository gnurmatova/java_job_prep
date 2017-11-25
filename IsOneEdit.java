
public class IsOneEdit {

	public static boolean isOneEdit(String s1, String s2) {
		for(int i = 0; i < s1.length(); ++i) {
			if((s1.substring(0, i)+s1.substring(i+1)).equals(s2)) {
				return true;
			}
			if(s1.length() == s2.length()) {
				if((s1.substring(0, i)+s1.substring(i+1)).equals(s2.substring(0, i)+s2.substring(i+1))) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		String s1 = "pale";
		String s2 = "ple";
		System.out.println(isOneEdit(s1, s2));
		s1 = "pales";
		s2 = "pale";
		System.out.println(isOneEdit(s1, s2));
		s1 = "pale";
		s2 = "bake";
		System.out.println(isOneEdit(s1, s2));
		s1 = "pale";
		s2 = "bale";
		System.out.println(isOneEdit(s1, s2));
	}

}
