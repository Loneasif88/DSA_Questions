//Question Link:
"https://practice.geeksforgeeks.org/problems/rotate-bits4524/1"

//User function Template for Java
class Solution
{
    
    ArrayList<Integer> rotate(int N, int D)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        D = D % 16;
        int left = ((N << D) | (N >> (16-D))) & ((1<<16) - 1);
        int right = ((N >> D) | (N<<(16-D))) & ((1 << 16) -1);
        ans.add(left);
        ans.add(right);
        return ans;
    }
}
