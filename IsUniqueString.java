import java.util.TreeSet;

public class IsUniqueString {

	public static boolean isUnique(String s) {
		TreeSet<Character> ts = new TreeSet<Character>();
		
		if(s == null) return false;
		for(char c:s.toCharArray()) {
			if(ts.contains(c)) {
				return false;
			}
			ts.add(c);
		}
		
		return true;
	}
	public static void main(String[] args) {
		System.out.println(isUnique("apoltre"));
		System.out.println(isUnique("apolo"));
		System.out.println(isUnique(""));
	}

}
