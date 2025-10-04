import java.util.HashSet;
import java.util.Set;

// CS108 HW1 -- String static methods

public class StringCode {

	/**
	 * Given a string, returns the length of the largest run.
	 * A a run is a series of adajcent chars that are the same.
	 * @param str
	 * @return max run length
	 */
	public static int maxRun(String str) {
        int[] dp = new int[10000];
        dp[0] = 1;
        int max = 0;
        for(int i= 1; i<str.length();i++){
            char temp1 = str.charAt(i-1);
            char temp2 = str.charAt(i);
            if(temp1 == temp2){
                dp[i] = dp[i-1]+1;
            }
            else{
                dp[i] = 1;
            }
            if(dp[i]>= max){
                max = dp[i];
            }
        }
        return max; // YOUR CODE HERE
	}

	
	/**
	 * Given a string, for each digit in the original string,
	 * replaces the digit with that many occurrences of the character
	 * following. So the string "a3tx2z" yields "attttxzzz".
	 * @param str
	 * @return blown up string
	 */
	public static String blowup(String str) {
		String res = "";
        for(int i = 0; i<str.length(); i++){
            char temp = str.charAt(i);
            if(temp >= '0' && temp <= '9' && i != str.length() - 1){
                int temp2 = temp - '0';
                for(int j = 1; j<=temp2 ;j++){
                    res += str.charAt(i+1);
                }
            }
            else if (temp >= '0' && temp <= '9' && i == str.length() - 1){
                break;
            }
            else {
                res += str.charAt(i);
            }
        }
        return res; // YOUR CODE HERE
	}
	
	/**
	 * Given 2 strings, consider all the substrings within them
	 * of length len. Returns true if there are any such substrings
	 * which appear in both strings.
	 * Compute this in linear time using a HashSet. Len will be 1 or more.
	 */
	public static boolean stringIntersect(String a, String b, int len) {
        int[] dpa = new int[a.length()];
        dpa[0] = 1;
        for(int i= 1; i<a.length();i++){
            char temp1 = a.charAt(i-1);
            char temp2 = a.charAt(i);
            if(temp1 == temp2){
                dpa[i] = dpa[i-1]+1;
            }
            else {
                dpa[i] = 1;
            }
        }
        int[] dpb = new int[b.length()];
        dpb[0] = 1;
        for(int i= 1; i<b.length();i++){
            char temp1 = b.charAt(i-1);
            char temp2 = b.charAt(i);
            if(temp1 == temp2){
                dpb[i] = dpb[i-1]+1;
            }
            else {
                dpb[i] = 1;
            }
        }
        for(int i = 0;i<a.length();i++){
            for(int j=0;j<b.length();j++){
                if(dpa[i]==dpb[j] && dpa[i]==len){
                    return true;
                }
            }
        }
		return false; // YOUR CODE HERE
	}
}
