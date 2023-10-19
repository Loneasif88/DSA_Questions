//<GFG> -Question link: https://practice.geeksforgeeks.org/problems/implement-stack-using-linked-list/1

class MyStack 
{
    // class StackNode {
    //     int data;
    //     StackNode next;
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    // }   
    StackNode top;
    
    //Function to push an integer into the stack.
    void push(int a) 
    {
        // Add your code here
        StackNode newNode = new StackNode(a);
        newNode.next = top;
        top  = newNode;
    }
    
    //Function to remove an item from top of the stack.
    int pop() 
    {
        // Add your code here
        if(top == null){
            return -1;
        }
        int topEle = top.data;
        top = top.next;
        return topEle;
    }
}
