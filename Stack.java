public class Stack {
    static final int MAX = 5;
    int [] stack = new int[MAX];
    int top;
    public Stack(){
        top = -1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == MAX-1;
    }
    public boolean push(int element){
        if(isFull()){
            System.out.println("Sorry! The stack is full");
            return false;
        }
        stack[++top] = element;
        System.out.printf("%d has been added to the stack!\n",element);
        return true;
        
    }
    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack underflow! Cannot pop");
        }
        return stack[top--];   
    }
    public int peek (){
        if(isEmpty()){
            throw new RuntimeException("The stack is empty! Cannot peek");
        }
        return stack[top];
    }   
}