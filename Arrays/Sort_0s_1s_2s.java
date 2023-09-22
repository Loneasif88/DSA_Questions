//Question Link: GFG
"https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1?page=1&sortBy=submissions"

// Time complexity O(n);
class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here
        int zerosPt = 0;
        int onesPt = 0;
        int twosPt = n-1;
        
        while(onesPt <= twosPt){
            if(a[onesPt] == 0){
                swap(zerosPt, onesPt, a);
                zerosPt++;
                onesPt++;
            }
            else if(a[onesPt]== 1){
                onesPt++;
            }
            else{
                swap(onesPt,twosPt,a);
                twosPt--;
            }
        }
    }
    static void swap(int i, int j, int[] a){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
