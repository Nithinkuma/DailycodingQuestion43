import java.util.ArrayList;
import java.util.List;


public class Stack {
    private static List<Integer> stack ;
    private static int top = -1;
    private static List<Integer> maxElementStack;
    Exception StackIsEmpty = null;

    Stack() {
        stack = new ArrayList<>();
        maxElementStack = new ArrayList<>();
    }

    public void push(int n)  {
        top++;
        stack.add(n);
        setMaxElementStack(n);
    }
    private void setMaxElementStack(int n){
        if(top==0)
            maxElementStack.add(n);
        else
            maxElementStack.add(Math.max(maxElementStack.get(top-1),n));
    }

    public int pop() throws Exception {
        if (top == -1)
            throw StackIsEmpty;
        else {
            int topElement = stack.get(top);
            top--;
            return topElement;
        }
    }

    public int max() throws Exception {
        if(top==-1)
            throw StackIsEmpty;
        return maxElementStack.get(top);
    }
}
