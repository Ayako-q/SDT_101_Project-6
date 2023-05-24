package Part_3_Queue;

/*
Project 6 Part 3
Oleksii Ishchenko for SDT 101
*/

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n\u001B[35mPart 3\u001B[0m");

        Queue<String> queue = new Queue<>();

        // Enqueue elements
        queue.enqueue("MacOS");
        queue.enqueue("IOS");
        queue.enqueue("Windows");

        System.out.println("\n\u001B[32m\nAfter enqueing we have such elements:\u001B[0m");
        outputElements(queue);

        System.out.println("\n\u001B[33m\nDequeing such elements:\u001B[0m");
        // Dequeue elements
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        System.out.println("\n\u001B[32m\nAfter dequeing we have such elements:\u001B[0m");
        outputElements(queue);

        // Enqueue more elements
        queue.enqueue("WindowsPhone");
        queue.enqueue("Linux");

        System.out.println("\n\u001B[32m\nAfter enqueing more  we have such elements:\u001B[0m");
        outputElements(queue);

        System.out.println("\n\u001B[33m\nDequeing all elements:\u001B[0m");
        // Dequeue remaining elements
        while (!queue.isEmpty())
        {
            System.out.println(queue.dequeue());
        }

        System.out.println("\n\u001B[35mAfter dequeing all we have size of:\u001B[0m");
        System.out.println(queue.size()); // Output: 0
    }

    public static void outputElements(Queue q)
    {
        for(Object s : q)
        {
            System.out.println(s);
        }
    }
}
