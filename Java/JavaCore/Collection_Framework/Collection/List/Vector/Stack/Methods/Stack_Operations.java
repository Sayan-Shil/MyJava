package JavaCore.Collection_Framework.Collection.List.Vector.Stack.Methods;

import java.util.Stack;

public class Stack_Operations {
    public static Stack<Integer> stack = new Stack<>();
    public static void print(){
        System.out.println(stack);
    }


    public static void main(String[] args) {

        for (int i = 0; i <10 ; i++) {
            stack.push(i);
        }
        print();

        for (int i = 0; i <5 ; i++) {
            stack.pop();
        }
        print();

        Integer i= stack.peek();
        System.out.println(i);


        Boolean bool= stack.empty();
        System.out.println(bool);

        int offset = stack.search(3);
        System.out.println(offset);



    }

}
