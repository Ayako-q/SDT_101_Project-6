package Part_1_Linked_Lists;

/*
Project 6 Part 1
Oleksii Ishchenko for SDT 101
 */

public class Main {
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("List: " + list); // Output: List: 10 20 30 40
        System.out.println("Size: " + list.getSize()); // Output: Size: 4

        list.add(2, 26);
        System.out.println("\nList after inserting at index 2: " + list); // Output: List: 10 20 25 30 40

        int element = list.get(3);
        System.out.println("\nElement at index 3: " + element); // Output: Element at index 3: 30

        list.remove(1);
        System.out.println("\nList after removing at index 1: " + list); // Output: List: 10 25 30 40

        list.removeAll(25);
        System.out.println("\nList after removing all occurrences of 25: " + list); // Output: List: 10 30 40

        list.addFirst(5);
        System.out.println("\nList after adding 5 at the beginning: " + list); // Output: List: 5 10 30 40

        System.out.println("\nIterating over the list:");
        for (int num : list)
        {
            System.out.println(num);
        }

        System.out.println("\n\u001B[35mPart 1.2\u001B[0m");
        System.out.println("\n1. The time complexity of adding an element at the end of the list is O(1) " +
                "\nbecause we can directly update the 'last' pointer to point to the new element.");

        System.out.println("\n2. The time complexity of adding an element at position i in the list with the add(int i, T e)" +
                "\nmethod is O(n) in the worst case, where n is the size of the list. This is because we may need to traverse " +
                "\nthe list from the beginning to find the desired position i, resulting in a linear search operation.");

        System.out.println("\n3. The time complexity of traversing the list using the given code snippet is O(n)," +
                "\nwhere n is the size of the list. This is because we iterate over each element of the list " +
                "\nonce to print its value using the get(i) method, resulting in a linear time operation.");


    }
}
