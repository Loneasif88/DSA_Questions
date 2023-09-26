//in this question we only need to return the count (how many string Encodings can be formed)

import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    sc.close();
    System.out.println(countEncodings(str));
  }

  public static int countEncodings(String str) {
	  return helper(str,"",0);
  }
	static int helper(String str, String asf, int idx){
		if(idx == str.length()){
			return 1;
		}
		int count  = 0;
		char currChar = str.charAt(idx);
		if(currChar != '0'){
			char ch = (char)(currChar - '1' + 'a');
			count += helper(str, asf+ch, idx+1);
		}
		if(idx+1 < str.length()){
			char newchar = str.charAt(idx);
			int twoDigit = Integer.parseInt(str.substring(idx, idx+2));
			if(newchar != '0' && twoDigit >= 10 && twoDigit <= 26){
				char ch = (char) (twoDigit - 1 + 'a');
				count += helper(str, asf+ch, idx + 2);
			}
		}
		return count;
	}
}
