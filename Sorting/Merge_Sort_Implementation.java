import java.util.*;
import java.io.*;

class Solution {
	static void mergeSortedArrays(int[] arr ,int si, int mid, int ei){
		int i=si;
		int ei1 =  mid;
		int j = mid+1;
		int ei2 = ei;
		int k=0;
		// create ans array 
		int[] ans = new int[ei - si +1];
		while(i<=ei1 && j<=ei2){
			if(arr[i] < arr[j]){
				ans[k] = arr[i];
				i++;
			}
			else{
				ans[k] = arr[j];
				j++;
			}
			k++;
		}
		while(i<=ei1){
			ans[k] = arr[i];
			i++;
			k++;
		}
		while(j<=ei2){
			ans[k] = arr[j];
			j++;
			k++;
		}
		k=0;
		for(int x=si; x<=ei; x++){  // copy the ans[] array back to original array
			//System.out.println(ans[i]);
			arr[x] = ans[k];
			k++;
		}
	}
static void mergeSort(int[] arr,int si,int ei){
     // Your code here
	if(si == ei){
		return;
	}
		int mid = (si+ei)/2;
	mergeSort(arr,si,mid);
	mergeSort(arr,mid+1,ei);
	mergeSortedArrays(arr,si,mid,ei);
    }
}
public class Main {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] a=new int[n];
        for(int i= 0; i < n; i++)
            a[i] = input.nextInt();
        Solution Obj = new Solution();
        Obj.mergeSort(a,0,n-1);
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
