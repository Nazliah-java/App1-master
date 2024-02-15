package lesson8.GenericStack;

import java.util.ArrayList;
import java.util.List;
import java.util.EmptyStackException;

public class GenerickStack<T>{
    private List<T> stack;

    //constructor
    public GenerickStack(){
        stack = new ArrayList<>();
    }

    //push method to add item into stack
    public void push(T item){
        stack.add(item);
    }

    //pop method to removes and returns top item from stack
    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public void printStack(){
        for(int i = stack.size() - 1; i >= 0; i--){
            System.out.println(stack.get(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        //creates instances with different data type
        GenerickStack<Integer> intStack = new GenerickStack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.printStack();
        // while(!intStack.isEmpty()){
        //     System.out.println(intStack.pop());
        // }

        GenerickStack<Double> doubleStack = new GenerickStack<>();
        doubleStack.push(3.78);
        doubleStack.push(1.23);
        doubleStack.printStack();
        // while(!doubleStack.isEmpty()){
        //     System.out.println(doubleStack.pop());
        // }

        GenerickStack<String> stringStack = new GenerickStack<>();
        stringStack.push("Try");
        stringStack.push("Test");
        stringStack.printStack();
        // while(!stringStack.isEmpty()){
        //     System.out.println(stringStack.pop());
        // }
    }
}
