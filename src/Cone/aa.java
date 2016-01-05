package Cone;

import java.util.*;


public class aa {

    static int[] numbers = {1, 2, 3};
    static List<int[]> endres = new ArrayList<>();
    static int counter = 0;

    public static void main(String[] args) {
        f(null);
        System.out.println(counter);
    }

    static void f(Stack stack) {
        if (stack == null ) {
            stack = new Stack<>();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i + " stack: " + stack);
            if (stack.contains(i)) {
                if(stack.size() == 3){
                    System.out.println(stack);
                    counter++;
                    break;
                }
            } else {
                System.out.println("pushing " + i);
                stack.push(i);
                f(stack);
                System.out.println("popping " + stack.lastElement());
                stack.pop();
            }

        }
        System.out.println("end");
    }
}
