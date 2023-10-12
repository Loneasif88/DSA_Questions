//Question Link: https://leetcode.com/problems/largest-rectangle-in-histogram/
class Solution {
    public int largestRectangleArea(int[] heights) {
 //  1. Find the index of next smaller Element on LeftSide (NSL)
 //  2. Find the index of next smaller Element on RightSide(NSR)
 //  3. Find the widht and Area = Height * width =(hist[i]*(NSR-NSL)-1);
 //  4. Return the maxmium area;
        int n = heights.length;
        int[] NSR = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<n; i++){
            int currEle = heights[i];
            while(!st.isEmpty() && currEle < heights[st.peek()]){
                NSR[st.peek()] = i;
                st.pop();

            }
            st.push(i);
        }
        while(st.size() > 0){
            NSR[st.peek()] = n;
            st.pop();
        }
        
        int[] NSL = new int[n];
        for(int i=n-1; i>=0; i--){
            int currEle = heights[i]; 
            while(!st.isEmpty() && currEle < heights[st.peek()]){
                NSL[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        while(st.size() > 0){
            NSL[st.peek()] = -1;
            st.pop();
        }

        int maxArea = 0;
        // now calculate the Area = height * width
        for(int i=0; i<n; i++){
            int width = NSR[i] - NSL[i] -1;
            int Area = width * heights[i];
            maxArea = Math.max(Area,maxArea);
        }
        return maxArea;
    }
}
