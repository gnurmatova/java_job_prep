
public class URLify {

	public static char[] urlIfy(char[] str, int n) {
		int last_spot = str.length-1;
		for(int i = n-1; i >=0; i --) {
			if(str[i] != ' ') {
				str[last_spot] = str[i];
				last_spot --;
			}
			else {
				str[last_spot--] = '0';
				str[last_spot--] = '2';
				str[last_spot--] = '%';	
			}
		}
		
		
		return str;
	}
	
	public static void main(String[] args) {
		System.out.println(new String((urlIfy("Mr John Smith    ".toCharArray(), 13))));

	}

}
