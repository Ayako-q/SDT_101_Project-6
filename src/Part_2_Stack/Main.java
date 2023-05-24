package Part_2_Stack;

/*
Project 6 Part 2
Oleksii Ishchenko for SDT 101
*/

public class Main {
    public static void main(String[] args)
    {
        System.out.println("\n\u001B[35mPart 2\u001B[0m");

        // Add elements
        Stack<Integer> stackCheck = new Stack();
        stackCheck.push(13);
        stackCheck.push(24);
        stackCheck.push(35);

        System.out.println(stackCheck.pop()); // Output: 35
        System.out.println(stackCheck.peek()); // Output: 24
        System.out.println(stackCheck.size()); // Output: 2
        System.out.println(stackCheck.isEmpty()); // Output: false
        System.out.println(stackCheck.pop());
        System.out.println(stackCheck.pop());
        System.out.println(stackCheck.isEmpty()); // Output: true
    }
}
