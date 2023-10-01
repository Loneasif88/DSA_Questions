// 557<LeetCode> question link: https://leetcode.com/problems/reverse-words-in-a-string-iii/?envType=daily-question&envId=2023-10-01
class Solution {
    public String reverse(String str){
        char[] ch = str.toCharArray();
        int len = str.length();
        int start = 0;
        int end = len-1;
        while(start <= end){
           char temp = ch[start];
           ch[start] = ch[end];
           ch[end] = temp;
           start++;
           end--;
        }
        return new String(ch);
    }
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder newStr  = new StringBuilder();
        for(int i=0; i<words.length; i++){
            String rev = words[i];
            String ans = reverse(rev);
            newStr.append(ans);
            // adding spaces
            if(i < words.length - 1){
                newStr.append(" ");
            }
        }
        return newStr.toString();
    }
}
