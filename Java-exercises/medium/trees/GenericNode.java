// program todekmo on the root node
import java.util.*;
public class GenericNode<T>
{
	T data;
	ArrayList<GenericNode<T>> children;
	public GenericNode(T data)
	{
		this.data=data;
		children=new ArrayList<>();
	}
	
}