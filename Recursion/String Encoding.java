// question on description 

import java.util.*;

public class Main {
    public static void printEncodings(String str) {
        // Write your code here
		helper(str,"",0);
    }
	static void helper(String str, String asf, int idx){
		if(idx == str.length()){
			System.out.println(asf);
			return;
		}
    // if no. is from 1 to 9
		char currch = str.charAt(idx);
		if(currch != '0'){
			char ch = (char)(currch -'1' + 'a');
			helper(str,asf+ch,idx+1);
		}
    // if no. is from 10 to 26
		if(idx+1 <str.length()){
			char newChar = str.charAt(idx);
			int twoDigit = Integer.parseInt(str.substring(idx, idx+2));
			if(newChar != 0 && twoDigit >= 10 && twoDigit <= 26){
				char ch1 = (char) (twoDigit -1 +'a');
				helper(str, asf+ch1, idx+2);
			}
		}
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printEncodings(str);
    }
}
