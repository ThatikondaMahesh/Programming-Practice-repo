import java.util.*; 

class GenericNode<T> {
    T data;
    List<GenericNode<T>> children;

    public GenericNode(T data) {
        this.data = data;
        this.children = new ArrayList<>();
    }
}

public class GenericUser {
    public static void main(String ar[]) {
        GenericNode<Integer> root = new GenericNode<>(10);  // Specify type parameter
        GenericNode<Integer> node1 = new GenericNode<>(20);  // Specify type parameter
        GenericNode<Integer> node2 = new GenericNode<>(30);  // Specify type parameter
        GenericNode<Integer> node3 = new GenericNode<>(40);  // Specify type parameter
        GenericNode<Integer> node4 = new GenericNode<>(50);  // Specify type parameter
        GenericNode<Integer> node5 = new GenericNode<>(60);  // Specify type parameter

        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        node1.children.add(node4);
        node1.children.add(node5);

        printTree(root);
    }

    public static void printTree(GenericNode<Integer> root) {
        System.out.print(root.data + ":");
		for(int i=0;i<root.children.size();i++)
		{
			System.out.print(root.children.get(i).data+" ");
		}
		System.out.println();
        for (int i = 0; i < root.children.size(); i++) {
            GenericNode<Integer> child = root.children.get(i);
            printTree(child);
        }
    }
}
