public class DArrayUser 
{
    public static void main(String[] args) 
	{
        // Create a DynamicArray instance
        DynamicArray d = new DynamicArray();

        // Adding elements to the array
        for (int i = 0; i < 10; i++) {
            d.add(100 + i);
        }

        // Print the size of the array
        System.out.println("Size after adding 100 elements: " + d.size());

        // Set an element at index 2
        d.set(2, 170);

        // Print the element at index 2
        System.out.println("Element at index 2 after setting: " + d.get(2));

        // Remove elements from the array and print the size after each removal
        System.out.println("Removing elements from the array:");
        while (!d.isEmpty()) 
		{
            int removedElement = d.removeLast();
            System.out.println("Removed Element: " + removedElement);
            System.out.println("Size after removal: " + d.size());
        }
    }
}