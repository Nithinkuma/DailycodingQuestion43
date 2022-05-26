
public class Main {
    public static void main(String[] args) throws Exception {

        Stack stack = new Stack();
        stack.push(1);
        stack.push(32);
        stack.push(-23);
        stack.push(33);
        stack.push(12);
        System.out.println(stack.max());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.max());
        System.out.println(stack.pop());

        System.out.println("");
    }
}

