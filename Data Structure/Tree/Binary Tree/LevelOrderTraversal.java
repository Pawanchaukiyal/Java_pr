class Node {
	int key;
	Node left, right;

	public Node(int item)
	{
		key = item;
		left = right = null;
	}
}

class LevelOrderTraversal {
	// Root of Binary Tree
	Node root;

	LevelOrderTraversal()
	{
		root = null;
		}
//........................................................................
	
void print_LOT()
{
    int h = height(root);
    int i;
    for(i=1;i<=h;i++)
    {
        printCurrentLevel(root,i);
    }
}

int height(Node node)
{
    if(node==null)
    return 0;
    else{
        int lheight=height(node.left);
        int rheight = height(node.right);
        if(lheight>rheight) return (lheight+1);
        else return (rheight+1);
    }
}

void printCurrentLevel(Node node,int level)
{
    if(root == null) return;
    if(level==1)
    System.out.println(node.key);
    else if(level>1)
    {
        printCurrentLevel(node.left, level-1);
        printCurrentLevel(node.right, level-1);
    }
}
//.........................................................................
	
 
    //..................................................................
    
	// Driver code
	public static void main(String[] args)
	{
		LevelOrderTraversal tree = new LevelOrderTraversal();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		// Function call
		System.out.println(
			"\nLevelorder traversal of binary tree is ");
		tree.print_LOT();
		
		
	}
}