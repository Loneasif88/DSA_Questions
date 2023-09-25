// Implemention quick sort

import java.util.*;
import java.io.*;

class Solution{
	static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	static int partition(int[] arr, int p, int si, int ei){
		int i = si;
		int j = si;
		while(i<=ei){
			if(arr[i] <= p){
				swap(arr,i,j);
				i++;
				j++;
			}
			else{
				i++;
			}
		}
		return j-1;
	}
	static void quickSortHelper(int[] arr, int si, int ei){
		if(si >= ei){
			return;
		}
		int pivot = arr[ei];
		int pIdx = partition(arr,pivot,si,ei);
		quickSortHelper(arr,si,pIdx-1);
		quickSortHelper(arr,pIdx+1,ei);
	}
	static void quickSort(int[] arr){
        //Write code here
		int n = arr.length;
		quickSortHelper(arr,0,n-1);
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
		Obj.quickSort(arr);
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
        sc.close();
    }
}
