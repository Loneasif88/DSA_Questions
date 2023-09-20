
//Question link: this question link may not work for you but i will be add the question in the description 
"https://course.acciojob.com/idle?question=64b8de3a-5299-4183-9357-ac2831991c63"


import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputLine;
        inputLine = br.readLine().trim().split(" ");
        int n = Integer.parseInt(inputLine[0]);
        int m = Integer.parseInt(inputLine[1]);


        int[][] grid = new int[n][m];
        for(int i=0; i<n; i++){
          String inputLine1[] = br.readLine().trim().split(" ");
          for(int j=0; j<m; j++){
            grid[i][j]=Integer.parseInt(inputLine1[j]);
          }
        }

        Solution g = new Solution();
        g.divisiblePaths(n, m, grid);
  }
}

class Solution
{
    void divisiblePaths(int m, int n, int[][] grid){
	//Your code here   
		ArrayList<String> paths = new ArrayList<>();
		helper(0,0,m-1,n-1,0,"",grid,paths);

		// print the paths
		for(String s : paths){
			System.out.println(s);
		}
		
    }
	void helper(int sr, int sc, int dr, int dc, int sum, String path,int[][] grid, ArrayList<String> paths){
		//base case
		if(sr<0 || sc<0 || sr>dr || sc>dc || grid[sr][sc] == -1){
			return;
		}

		sum += grid[sr][sc];
		

		//when reached to destination row and column (dr & dc)
		if(sr == dr && sc == dc){
			if(sum % 5 == 0){
				paths.add(path);
			}
			return;
		}
		
		path +="h";
		helper(sr,sc+1,dr,dc,sum,path,grid,paths);
		path = path.substring(0,path.length()-1);   // if sum is not divisible by 5 we need to backtrack 
		
		path +="d";
		helper(sr+1,sc+1,dr,dc,sum,path,grid,paths);
		path = path.substring(0,path.length()-1);   // backtrack

		path +="v";
		helper(sr+1,sc,dr,dc,sum,path,grid,paths); 
		
	}

} 
