import java.util.Scanner;
public class TreeUSe {

	public static TreeNode<Integer> takeInput(Scanner s)
	{
		int n;
	//	Scanner s=new Scanner(System.in);
		System.out.println("Enter data for next node data ");
		n=s.nextInt();
	TreeNode<Integer> root=new TreeNode<Integer>(n);
	System.out.println("Enter no of children for "+n);
	int childcount=s.nextInt();
	for(int i=0;i<childcount;i++)
	{
		TreeNode<Integer> child=takeInput(s);
		root.children.add(child);
	}
	return root;
		
		
		
	}
	public static void print(TreeNode<Integer> root)
	{
		String s=root.data +" :";
		for(int i=0;i<root.children.size();i++)
		{
			s=s+root.children.get(i).data+",";
			
		}
		System.out.println(s);
		for(int j=0;j<root.children.size();j++)
		{
			print(root.children.get(j));
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		TreeNode<Integer>root=takeInput(s);
		print(root);
	}

	}


		
		
