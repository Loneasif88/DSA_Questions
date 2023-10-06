//Question Link: 
"https://leetcode.com/problems/integer-break/?envType=daily-question&envId=2023-10-06"

class Solution {
    public int integerBreak(int n) {
        if(n <= 3) return n-1;
        int qou = n/3;
        int rem = n%3;
        if(rem == 0){
            return (int) Math.pow(3,qou);
        }
        else if(rem == 1){
            return (int)Math.pow(3,qou - 1)*4;
        }
        else{
            return (int) Math.pow(3,qou)*2;
        }
    }
}
