// User function Template for Java
"https://practice.geeksforgeeks.org/problems/tower-of-hanoi-1587115621/1?page=1&category[]=Recursion&sortBy=submissions"

// avoid space at the starting of the string in "move disk....."
class Hanoi {
    
    public long toh(int N, int from, int to, int aux) {
        // Your code here
        if(N == 0){
            return 0;
        }
      int steps = 0;  
      steps += toh(N-1,from,aux,to);
      System.out.println("move disk "+N+" from rod "+from+" to rod "+to);
      steps += toh(N-1,aux,to,from);
      
      return (steps+1);
        
    }
}
