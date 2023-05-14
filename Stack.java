class Stack{
    static int top;
    final static int MAX=10;
    
    int Stack[]=new int[MAX];
    Stack(){
        int top=-1;
        this.top=top;
        
    }
    static boolean Empty(int top){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
    }

    static boolean isFull(){
        if(top==MAX-1){
            return true;
        }
        else{
            return false;
        }
    }
    void push(int data)
    {
        if(!isFull()){
            top++;
            Stack[top]=data;
        }
        else{
            System.out.println("Stack is full");
        }
    }

    void pop(){
        if(!Empty(top)){
            int item=Stack[top];
            top--;
            System.out.println("Poped element is "+item);
        }
    }

    void display()
    {
        if(!Empty(top)){
            int i;
            for(i=top;i>=0;i--){
                System.out.println(Stack[top]);
                top--;
                
            }
        }
    }
}



class Main{
    public static void main(String[]aegs)
    {
       Stack st=new Stack();
       st.push(10);
       st.push(20);
       st.push(30);
       st.push(40);
       st.push(50);
       st.pop();
       st.display();
    }
}
