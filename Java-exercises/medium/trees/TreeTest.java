import java.util.*;
 class TreeNode<T>
{
    T data;
    ArrayList<TreeNode<T>> children;

    public TreeNode(T data)
	{
        this.data= data;
        this.children= new ArrayList<>();
    }
}

 class TreeTest
{

    public static TreeNode<Integer> takeInput()
	{
        Scanner s= new Scanner(System.in);
        Queue<TreeNode<Integer>> pendingNodes= new LinkedList<>();
        System.out.println("Enter the root data ");
        int rootData= s.nextInt();
        if(rootData==-1)
            return null;

        TreeNode<Integer> root1= new TreeNode<Integer>(rootData);
        pendingNodes.add(root1);

        while(!pendingNodes.isEmpty()){
            TreeNode<Integer> front= pendingNodes.poll();
            System.out.println("Enter no. of children "+ front.data);
            int numChild= s.nextInt();
            for(int i=0;i<numChild;i++)
			{
                System.out.println("Enter the  "+i+" th child data"+ front.data);
                int childData= s.nextInt();
                TreeNode<Integer> childNode= new TreeNode<>(childData);
                front.children.add(childNode);
                pendingNodes.add(childNode);
            }
        }
        return root1;
    }



    public static int numberOfNodes(TreeNode<Integer> root){
        int count =1;
        for(int i=0; i<root.children.size();i++){
            int childCount= numberOfNodes(root.children.get(i));
            count+=childCount;
        }
        return count;
    }

    public static void printTree(TreeNode<Integer> root){
        //Special case not base case
        if(root==null){
            return ;
        }
        System.out.print(root.data+": ");
        for(int i=0; i<root.children.size(); i++){
            System.out.print(root.children.get(i).data+ " ");
        }
        System.out.println();
        for(int i=0;i<root.children.size();i++){
            TreeNode<Integer> child= root.children.get(i);
            printTree(child);
        }
    }

    public static void main(String[] args){
        TreeNode<Integer> root=takeInput();
        
        printTree(root);

    }
}
